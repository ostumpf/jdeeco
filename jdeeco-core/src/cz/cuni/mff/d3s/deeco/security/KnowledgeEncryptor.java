package cz.cuni.mff.d3s.deeco.security;

import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.ShortBufferException;

import cz.cuni.mff.d3s.deeco.knowledge.KnowledgeManager;
import cz.cuni.mff.d3s.deeco.knowledge.KnowledgeNotFoundException;
import cz.cuni.mff.d3s.deeco.knowledge.ValueSet;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgePath;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgeSecurityTag;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeField;
import cz.cuni.mff.d3s.deeco.model.runtime.api.SecurityRole;
import cz.cuni.mff.d3s.deeco.network.KnowledgeData;
import cz.cuni.mff.d3s.deeco.network.KnowledgeMetaData;
import cz.cuni.mff.d3s.deeco.task.KnowledgePathHelper;

/**
 * The class managing encryption and decryption of {@link KnowledgeData}.
 *
 * @author Ondřej Štumpf
 */
public class KnowledgeEncryptor {
	
	private final SecurityKeyManager keyManager;
	private final SecurityHelper securityHelper;
	private final RemoteSecurityChecker remoteSecurityChecker;
	
	/**
	 * Instantiates a new knowledge encryptor.
	 *
	 * @param keyManager
	 *            the private/public key manager
	 */
	public KnowledgeEncryptor(SecurityKeyManager keyManager) {
		this.keyManager = keyManager;
		this.securityHelper = new SecurityHelper();	
		this.remoteSecurityChecker = new RemoteSecurityChecker();
	}
	

	/**
	 * Attempts to decrypt the given {@link KnowledgeData}, using roles available for the given replica.
	 *
	 * @param kd
	 *            the knowledge data (as received)
	 * @param replica
	 *            the replica (the component attempting to access the data)
	 * @param metaData
	 *            the meta data (as received)
	 * @return the knowledge data with knowledge and security tags data decrypted (or removed if decryption failed)
	 */	
	public KnowledgeData decryptValueSet(KnowledgeData kd, KnowledgeManager replica, KnowledgeMetaData metaData) {
		if (kd == null) return null;
		
		ValueSet decryptedKnowledge = decrypt(kd.getKnowledge(), replica, metaData);	
		ValueSet decryptedSecuritySet = decrypt(kd.getSecuritySet(), replica, metaData);
		
		return new KnowledgeData(decryptedKnowledge, decryptedSecuritySet, metaData);
	}
	
	/**
	 * Attempts to decrypt the {@link SealedObject} sealed objects present in the given {@link ValueSet}. 
	 * @param valueSet
	 *			the value set to decrypt
	 * @param replica
	 *  		the component attempting to decrypt
	 * @param metaData
	 * 			the meta data containing security information
	 * @return the value set containing those knowledge paths that either were not encrypted or their decryption succeeded
	 */
	private ValueSet decrypt(ValueSet valueSet, KnowledgeManager replica, KnowledgeMetaData metaData) {
		ValueSet result = new ValueSet();
		for (KnowledgePath kp : valueSet.getKnowledgePaths()) {
			Object value = valueSet.getValue(kp);
			if (value instanceof SealedObject) {
				try {
					// attempt to decrypt the knowledge
					Object decryptedValue = accessValue((SealedObject)value, replica, metaData);
					result.setValue(kp, decryptedValue);					
				} catch (KnowledgeNotFoundException | SecurityException e) {
					// do nothing
				}
			} else {
				// knowledge not encrypted
				result.setValue(kp, value);
			}
		}	
		
		return result;
	}

	/**
	 * Encrypts the value set, i.e. splits it into several {@link KnowledgeData} instances, each encrypted with different key.
	 * There is a KnowledgeData instance for each {@link KnowledgeSecurityTag} used in the value set. 
	 *
	 * @param valueSet
	 *            the value set
	 * @param knowledgeManager
	 *            the knowledge manager
	 * @param metaData
	 *            the meta data
	 * @return the list of knowledge data instances
	 * @throws KnowledgeNotFoundException
	 *             the knowledge not found exception
	 */
	public List<KnowledgeData> encryptValueSet(ValueSet valueSet, KnowledgeManager knowledgeManager, KnowledgeMetaData metaData) throws KnowledgeNotFoundException {
		if (valueSet == null) return null;
		
		Map<KnowledgeSecurityTag, ValueSet> securityMap = new HashMap<>();
		Map<KnowledgePath, List<KnowledgeSecurityTag>> securityTagsMap = new HashMap<>();
		
		// split the knowledge into groups according to their security
		for (KnowledgePath kp : valueSet.getKnowledgePaths()) {
			if (!KnowledgePathHelper.isAbsolutePath(kp)) {
				throw new IllegalArgumentException("The value set must contain only absolute knowledge paths.");
			}
			
			// get the security tags for the given knowledge path
			List<KnowledgeSecurityTag> tags = knowledgeManager.getKnowledgeSecurityTags((PathNodeField)kp.getNodes().get(0));
			securityTagsMap.put(kp, tags);
			
			if (tags == null || tags.isEmpty()) {
				addToSecurityMap(valueSet, securityMap, null, kp);				
			} else {
				for (KnowledgeSecurityTag tag : tags) {
					addToSecurityMap(valueSet, securityMap, tag, kp);
				}
				
			}
		}
		
		// create copies of the knowledge data, each encrypted for target role		
		List<KnowledgeData> result = new LinkedList<>();
		
		for (KnowledgeSecurityTag tag : securityMap.keySet()) {
			// clone the meta data so the the copy can be modified
			KnowledgeMetaData clonedMetaData = metaData.clone();
			
			if (tag == null) {
				// data not encrypted
				ValueSet vs = securityMap.get(null);
				result.add(new KnowledgeData(vs, new ValueSet(), clonedMetaData));
			} else {
				ValueSet vs = securityMap.get(tag);
				
				// associate each knowledge path with a list of security tags
				ValueSet securitySet = new ValueSet();
				for (KnowledgePath path : vs.getKnowledgePaths()) {
					securitySet.setValue(path, securityTagsMap.get(path) );
				}				
				
				Cipher cipher = prepareCipher(knowledgeManager, tag, clonedMetaData);
				seal(vs, cipher);
				seal(securitySet, cipher);
				result.add(new KnowledgeData(vs, securitySet, clonedMetaData));
			}
		}
		return result;
	}
	
	/**
	 * Attempts to decrypt given {@link SealedObject} with roles assigned to the given component.
	 * @param sealedObject
	 * 			the object to decrypt
	 * @param replica
	 * 			the component
	 * @param metaData
	 * 			the metadata as received
	 * @return
	 * @throws KnowledgeNotFoundException
	 */
	private Object accessValue(SealedObject sealedObject, KnowledgeManager replica, KnowledgeMetaData metaData) throws KnowledgeNotFoundException {
		// verify signature on metadata
		boolean verificationSucceeded = false;
		try {
			verificationSucceeded = securityHelper.verify(metaData.signature, keyManager.getIntegrityPublicKey(), metaData.componentId, metaData.versionId, metaData.targetRoleHash);
		} catch (InvalidKeyException | CertificateEncodingException
				| SignatureException | NoSuchAlgorithmException
				| KeyStoreException | SecurityException | IllegalStateException e1) {
			verificationSucceeded = false;
		}
		
		if (!verificationSucceeded) {
			throw new SecurityException();
		}
		
		Object value = null;
		boolean decryptionSucceeded = false;
		
		// gets the roles transitive closure
		List<SecurityRole> transitiveRoles = RoleHelper.getTransitiveRoles(replica.getComponent().getRoles());
		
		// try each role, if it can decrypt the data
		for (SecurityRole role : transitiveRoles) {
			RoleWithArguments roleWithArguments = keyManager.getRoleByKey(metaData.targetRoleHash);
			if (!remoteSecurityChecker.checkSecurity(role, roleWithArguments, replica.getComponent().getKnowledgeManager())) {
				decryptionSucceeded = false;
				continue;
			}

			try {
				Key privateKey = keyManager.getPrivateKey(roleWithArguments.roleName, roleWithArguments.arguments);				
				Key decryptedSymmetricKey = securityHelper.decryptKey(metaData.encryptedKey, metaData.encryptedKeyAlgorithm, privateKey);
				value = sealedObject.getObject(securityHelper.getSymmetricCipher(Cipher.DECRYPT_MODE, decryptedSymmetricKey));
				
				decryptionSucceeded = true;				
				break; 
			} catch (InvalidKeyException | ClassNotFoundException
					| IllegalBlockSizeException | BadPaddingException
					| NoSuchAlgorithmException | NoSuchPaddingException
					| IOException | ShortBufferException | CertificateEncodingException | KeyStoreException | SecurityException 
					| SignatureException | IllegalStateException e) {
				decryptionSucceeded = false;
			}		
		}
		
		if (!decryptionSucceeded) {
			throw new SecurityException();
		}
		return value;
	}
	
	private void addToSecurityMap(ValueSet basicValueSet,
			Map<KnowledgeSecurityTag, ValueSet> securityMap,
			KnowledgeSecurityTag tag, KnowledgePath kp) {
		if (!securityMap.containsKey(tag)) {
			securityMap.put(tag, new ValueSet());
		}
		securityMap.get(tag).setValue(kp, basicValueSet.getValue(kp));
	}
	
	/**
	 * Creates an instance of {@link Cipher} for the given security tag and modifies the given metadata instance accordingly.
	 * @param knowledgeManager
	 * 			the knowledge manager containing data referenced by the security role
	 * @param tag
	 * 			the security tag
	 * @param metaData
	 * 			the metadata
	 * @return the cipher
	 */
	private Cipher prepareCipher(KnowledgeManager knowledgeManager, KnowledgeSecurityTag tag, KnowledgeMetaData metaData) {
		try {
			String roleName = tag.getRequiredRole().getRoleName();
			Map<String, Object> arguments = RoleHelper.readRoleArguments(tag.getRequiredRole(), knowledgeManager);
			
			// get the public key for the given role
			Key publicKey = keyManager.getPublicKey(roleName, arguments);
			
			// create random symmetric key
			Key symmetricKey = securityHelper.generateKey();
			
			// encrypt the symmetric key using the public key
			byte[] encryptedKey = securityHelper.encryptKey(symmetricKey, publicKey);
			
			metaData.encryptedKey = encryptedKey;
			metaData.encryptedKeyAlgorithm = symmetricKey.getAlgorithm();
			metaData.targetRoleHash = keyManager.getRoleKey(roleName, arguments);
			metaData.signature = securityHelper.sign(keyManager.getIntegrityPrivateKey(), metaData.componentId, metaData.versionId, metaData.targetRoleHash);
			
			return securityHelper.getSymmetricCipher(Cipher.ENCRYPT_MODE, symmetricKey);
		} catch (InvalidKeyException | CertificateEncodingException
				| KeyStoreException | NoSuchAlgorithmException
				| SecurityException | SignatureException
				| IllegalStateException | KnowledgeNotFoundException | NoSuchPaddingException 
				| ShortBufferException | IllegalBlockSizeException 
				| BadPaddingException | IOException e) {
			throw new SecurityException(e);
		}
	}
	
	/**
	 * Replaces each value in the value set with its encrypted version.
	 * @param values
	 * 			the values to encrypt
	 * @param cipher
	 * 			the cipher to use for encryption
	 */
	private void seal(ValueSet values, Cipher cipher) {				
		try {						
			for (KnowledgePath kp : values.getKnowledgePaths()) {
				Object plainKnowledge = values.getValue(kp);			
				SealedObject encryptedKnowledge = new SealedObject((Serializable) plainKnowledge, cipher);				
				values.setValue(kp, encryptedKnowledge);						
			}		
		} catch (IllegalBlockSizeException | IOException | SecurityException | IllegalStateException e) {
			throw new SecurityException(e);
		}			
	}

	
}
