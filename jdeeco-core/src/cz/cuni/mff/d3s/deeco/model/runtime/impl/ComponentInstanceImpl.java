/**
 */
package cz.cuni.mff.d3s.deeco.model.runtime.impl;

import cz.cuni.mff.d3s.deeco.knowledge.KnowledgeManager;
import cz.cuni.mff.d3s.deeco.knowledge.ShadowKnowledgeManagerRegistry;

import cz.cuni.mff.d3s.deeco.model.runtime.api.ComponentInstance;
import cz.cuni.mff.d3s.deeco.model.runtime.api.ComponentProcess;
import cz.cuni.mff.d3s.deeco.model.runtime.api.EnsembleController;

import cz.cuni.mff.d3s.deeco.model.runtime.meta.RuntimePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cuni.mff.d3s.deeco.model.runtime.impl.ComponentInstanceImpl#getComponentProcesses <em>Component Processes</em>}</li>
 *   <li>{@link cz.cuni.mff.d3s.deeco.model.runtime.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cz.cuni.mff.d3s.deeco.model.runtime.impl.ComponentInstanceImpl#getKnowledgeManager <em>Knowledge Manager</em>}</li>
 *   <li>{@link cz.cuni.mff.d3s.deeco.model.runtime.impl.ComponentInstanceImpl#getShadowKnowledgeManagerRegistry <em>Shadow Knowledge Manager Registry</em>}</li>
 *   <li>{@link cz.cuni.mff.d3s.deeco.model.runtime.impl.ComponentInstanceImpl#getEnsembleControllers <em>Ensemble Controllers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends MinimalEObjectImpl.Container implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getComponentProcesses() <em>Component Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentProcess> componentProcesses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKnowledgeManager() <em>Knowledge Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeManager()
	 * @generated
	 * @ordered
	 */
	protected static final KnowledgeManager KNOWLEDGE_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKnowledgeManager() <em>Knowledge Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeManager()
	 * @generated
	 * @ordered
	 */
	protected KnowledgeManager knowledgeManager = KNOWLEDGE_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowKnowledgeManagerRegistry() <em>Shadow Knowledge Manager Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowKnowledgeManagerRegistry()
	 * @generated
	 * @ordered
	 */
	protected static final ShadowKnowledgeManagerRegistry SHADOW_KNOWLEDGE_MANAGER_REGISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowKnowledgeManagerRegistry() <em>Shadow Knowledge Manager Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowKnowledgeManagerRegistry()
	 * @generated
	 * @ordered
	 */
	protected ShadowKnowledgeManagerRegistry shadowKnowledgeManagerRegistry = SHADOW_KNOWLEDGE_MANAGER_REGISTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnsembleControllers() <em>Ensemble Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsembleControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<EnsembleController> ensembleControllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentProcess> getComponentProcesses() {
		if (componentProcesses == null) {
			componentProcesses = new EObjectContainmentWithInverseEList<ComponentProcess>(ComponentProcess.class, this, RuntimePackage.COMPONENT_INSTANCE__COMPONENT_PROCESSES, RuntimePackage.COMPONENT_PROCESS__COMPONENT_INSTANCE);
		}
		return componentProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.COMPONENT_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeManager getKnowledgeManager() {
		return knowledgeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledgeManager(KnowledgeManager newKnowledgeManager) {
		KnowledgeManager oldKnowledgeManager = knowledgeManager;
		knowledgeManager = newKnowledgeManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.COMPONENT_INSTANCE__KNOWLEDGE_MANAGER, oldKnowledgeManager, knowledgeManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowKnowledgeManagerRegistry getShadowKnowledgeManagerRegistry() {
		return shadowKnowledgeManagerRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowKnowledgeManagerRegistry(ShadowKnowledgeManagerRegistry newShadowKnowledgeManagerRegistry) {
		ShadowKnowledgeManagerRegistry oldShadowKnowledgeManagerRegistry = shadowKnowledgeManagerRegistry;
		shadowKnowledgeManagerRegistry = newShadowKnowledgeManagerRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.COMPONENT_INSTANCE__SHADOW_KNOWLEDGE_MANAGER_REGISTRY, oldShadowKnowledgeManagerRegistry, shadowKnowledgeManagerRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnsembleController> getEnsembleControllers() {
		if (ensembleControllers == null) {
			ensembleControllers = new EObjectContainmentWithInverseEList<EnsembleController>(EnsembleController.class, this, RuntimePackage.COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS, RuntimePackage.ENSEMBLE_CONTROLLER__COMPONENT_INSTANCE);
		}
		return ensembleControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.COMPONENT_INSTANCE__COMPONENT_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentProcesses()).basicAdd(otherEnd, msgs);
			case RuntimePackage.COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnsembleControllers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.COMPONENT_INSTANCE__COMPONENT_PROCESSES:
				return ((InternalEList<?>)getComponentProcesses()).basicRemove(otherEnd, msgs);
			case RuntimePackage.COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS:
				return ((InternalEList<?>)getEnsembleControllers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.COMPONENT_INSTANCE__COMPONENT_PROCESSES:
				return getComponentProcesses();
			case RuntimePackage.COMPONENT_INSTANCE__NAME:
				return getName();
			case RuntimePackage.COMPONENT_INSTANCE__KNOWLEDGE_MANAGER:
				return getKnowledgeManager();
			case RuntimePackage.COMPONENT_INSTANCE__SHADOW_KNOWLEDGE_MANAGER_REGISTRY:
				return getShadowKnowledgeManagerRegistry();
			case RuntimePackage.COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS:
				return getEnsembleControllers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.COMPONENT_INSTANCE__COMPONENT_PROCESSES:
				getComponentProcesses().clear();
				getComponentProcesses().addAll((Collection<? extends ComponentProcess>)newValue);
				return;
			case RuntimePackage.COMPONENT_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case RuntimePackage.COMPONENT_INSTANCE__KNOWLEDGE_MANAGER:
				setKnowledgeManager((KnowledgeManager)newValue);
				return;
			case RuntimePackage.COMPONENT_INSTANCE__SHADOW_KNOWLEDGE_MANAGER_REGISTRY:
				setShadowKnowledgeManagerRegistry((ShadowKnowledgeManagerRegistry)newValue);
				return;
			case RuntimePackage.COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS:
				getEnsembleControllers().clear();
				getEnsembleControllers().addAll((Collection<? extends EnsembleController>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.COMPONENT_INSTANCE__COMPONENT_PROCESSES:
				getComponentProcesses().clear();
				return;
			case RuntimePackage.COMPONENT_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RuntimePackage.COMPONENT_INSTANCE__KNOWLEDGE_MANAGER:
				setKnowledgeManager(KNOWLEDGE_MANAGER_EDEFAULT);
				return;
			case RuntimePackage.COMPONENT_INSTANCE__SHADOW_KNOWLEDGE_MANAGER_REGISTRY:
				setShadowKnowledgeManagerRegistry(SHADOW_KNOWLEDGE_MANAGER_REGISTRY_EDEFAULT);
				return;
			case RuntimePackage.COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS:
				getEnsembleControllers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.COMPONENT_INSTANCE__COMPONENT_PROCESSES:
				return componentProcesses != null && !componentProcesses.isEmpty();
			case RuntimePackage.COMPONENT_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RuntimePackage.COMPONENT_INSTANCE__KNOWLEDGE_MANAGER:
				return KNOWLEDGE_MANAGER_EDEFAULT == null ? knowledgeManager != null : !KNOWLEDGE_MANAGER_EDEFAULT.equals(knowledgeManager);
			case RuntimePackage.COMPONENT_INSTANCE__SHADOW_KNOWLEDGE_MANAGER_REGISTRY:
				return SHADOW_KNOWLEDGE_MANAGER_REGISTRY_EDEFAULT == null ? shadowKnowledgeManagerRegistry != null : !SHADOW_KNOWLEDGE_MANAGER_REGISTRY_EDEFAULT.equals(shadowKnowledgeManagerRegistry);
			case RuntimePackage.COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS:
				return ensembleControllers != null && !ensembleControllers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", knowledgeManager: ");
		result.append(knowledgeManager);
		result.append(", shadowKnowledgeManagerRegistry: ");
		result.append(shadowKnowledgeManagerRegistry);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
