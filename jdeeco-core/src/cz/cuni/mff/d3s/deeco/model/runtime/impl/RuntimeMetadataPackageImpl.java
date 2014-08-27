/**
 */
package cz.cuni.mff.d3s.deeco.model.runtime.impl;

import cz.cuni.mff.d3s.deeco.knowledge.KnowledgeManager;
import cz.cuni.mff.d3s.deeco.knowledge.ShadowKnowledgeManagerRegistry;
import cz.cuni.mff.d3s.deeco.model.runtime.api.ComparisonType;
import cz.cuni.mff.d3s.deeco.model.runtime.api.ComponentInstance;
import cz.cuni.mff.d3s.deeco.model.runtime.api.ComponentProcess;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Condition;
import cz.cuni.mff.d3s.deeco.model.runtime.api.EnsembleController;
import cz.cuni.mff.d3s.deeco.model.runtime.api.EnsembleDefinition;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Exchange;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Invocable;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgeChangeTrigger;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgePath;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgeTimeStampChangeTrigger;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgeTimeStampTrigger;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgeTimeStampUnchangeTrigger;
import cz.cuni.mff.d3s.deeco.model.runtime.api.MetadataType;
import cz.cuni.mff.d3s.deeco.model.runtime.api.ModeState;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Parameter;
import cz.cuni.mff.d3s.deeco.model.runtime.api.ParameterDirection;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNode;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeComponentId;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeCoordinator;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeField;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeMapKey;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeMember;
import cz.cuni.mff.d3s.deeco.model.runtime.api.RuntimeMetadata;
import cz.cuni.mff.d3s.deeco.model.runtime.api.StateSpaceModelDefinition;
import cz.cuni.mff.d3s.deeco.model.runtime.api.TimeTrigger;

import cz.cuni.mff.d3s.deeco.model.runtime.api.Transition;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Trigger;
import cz.cuni.mff.d3s.deeco.model.runtime.meta.RuntimeMetadataFactory;
import cz.cuni.mff.d3s.deeco.model.runtime.meta.RuntimeMetadataPackage;
import cz.cuni.mff.d3s.deeco.model.runtime.stateflow.InaccuracyParamHolder;
import cz.cuni.mff.d3s.deeco.model.runtime.stateflow.ModelInterface;
import cz.cuni.mff.d3s.deeco.network.CommunicationBoundaryPredicate;

import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeMetadataPackageImpl extends EPackageImpl implements RuntimeMetadataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeChangeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeMapKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensembleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensembleControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeCoordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeComponentIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSpaceModelDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeTimeStampUnchangeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeTimeStampChangeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeTimeStampTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metadataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType knowledgeManagerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shadowKnowledgeManagerRegistryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType communicationBoundaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inaccurateValueEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cz.cuni.mff.d3s.deeco.model.runtime.meta.RuntimeMetadataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimeMetadataPackageImpl() {
		super(eNS_URI, RuntimeMetadataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RuntimeMetadataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimeMetadataPackage init() {
		if (isInited) return (RuntimeMetadataPackage)EPackage.Registry.INSTANCE.getEPackage(RuntimeMetadataPackage.eNS_URI);

		// Obtain or create and register package
		RuntimeMetadataPackageImpl theRuntimeMetadataPackage = (RuntimeMetadataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimeMetadataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimeMetadataPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRuntimeMetadataPackage.createPackageContents();

		// Initialize created meta-data
		theRuntimeMetadataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimeMetadataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimeMetadataPackage.eNS_URI, theRuntimeMetadataPackage);
		return theRuntimeMetadataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeChangeTrigger() {
		return knowledgeChangeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeChangeTrigger_KnowledgePath() {
		return (EReference)knowledgeChangeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgePath() {
		return knowledgePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgePath_Nodes() {
		return (EReference)knowledgePathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNode() {
		return pathNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNodeField() {
		return pathNodeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathNodeField_Name() {
		return (EAttribute)pathNodeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNodeMapKey() {
		return pathNodeMapKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathNodeMapKey_KeyPath() {
		return (EReference)pathNodeMapKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeMetadata() {
		return runtimeMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMetadata_EnsembleDefinitions() {
		return (EReference)runtimeMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMetadata_ComponentInstances() {
		return (EReference)runtimeMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ComponentProcesses() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_Name() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_KnowledgeManager() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_ShadowKnowledgeManagerRegistry() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_EnsembleControllers() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_InternalData() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_StateSpaceModels() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsembleDefinition() {
		return ensembleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsembleDefinition_Name() {
		return (EAttribute)ensembleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleDefinition_Membership() {
		return (EReference)ensembleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleDefinition_KnowledgeExchange() {
		return (EReference)ensembleDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleDefinition_Triggers() {
		return (EReference)ensembleDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsembleDefinition_CommunicationBoundary() {
		return (EAttribute)ensembleDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchange() {
		return exchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentProcess() {
		return componentProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentProcess_Name() {
		return (EAttribute)componentProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentProcess_ComponentInstance() {
		return (EReference)componentProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentProcess_IsActive() {
		return (EAttribute)componentProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentProcess_Triggers() {
		return (EReference)componentProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentProcess_Children() {
		return (EReference)componentProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_KnowledgePath() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocable() {
		return invocableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocable_Parameters() {
		return (EReference)invocableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvocable_Method() {
		return (EAttribute)invocableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsembleController() {
		return ensembleControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleController_ComponentInstance() {
		return (EReference)ensembleControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleController_EnsembleDefinition() {
		return (EReference)ensembleControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNodeCoordinator() {
		return pathNodeCoordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNodeMember() {
		return pathNodeMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNodeComponentId() {
		return pathNodeComponentIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToObjectMap() {
		return stringToObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToObjectMap_Key() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToObjectMap_Value() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateSpaceModelDefinition() {
		return stateSpaceModelDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpaceModelDefinition_InStates() {
		return (EReference)stateSpaceModelDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpaceModelDefinition_IsActive() {
		return (EAttribute)stateSpaceModelDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpaceModelDefinition_DerivationStates() {
		return (EReference)stateSpaceModelDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpaceModelDefinition_ModelValue() {
		return (EAttribute)stateSpaceModelDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeTimeStampUnchangeTrigger() {
		return knowledgeTimeStampUnchangeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeTimeStampChangeTrigger() {
		return knowledgeTimeStampChangeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeTimeStampTrigger() {
		return knowledgeTimeStampTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeTimeStampTrigger_Events() {
		return (EReference)knowledgeTimeStampTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_To() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_From() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Condition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_IsReachable() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpaceModelDefinition_ComponentInstance() {
		return (EReference)stateSpaceModelDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpaceModelDefinition_Triggers() {
		return (EReference)stateSpaceModelDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpaceModelDefinition_Model() {
		return (EAttribute)stateSpaceModelDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTrigger() {
		return timeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTrigger_Period() {
		return (EAttribute)timeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTrigger_Offset() {
		return (EAttribute)timeTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirection() {
		return parameterDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethod() {
		return methodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKnowledgeManager() {
		return knowledgeManagerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShadowKnowledgeManagerRegistry() {
		return shadowKnowledgeManagerRegistryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommunicationBoundary() {
		return communicationBoundaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetadataType() {
		return metadataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonType() {
		return comparisonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModelType() {
		return modelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInaccurateValue() {
		return inaccurateValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeMetadataFactory getRuntimeMetadataFactory() {
		return (RuntimeMetadataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		timeTriggerEClass = createEClass(TIME_TRIGGER);
		createEAttribute(timeTriggerEClass, TIME_TRIGGER__PERIOD);
		createEAttribute(timeTriggerEClass, TIME_TRIGGER__OFFSET);

		triggerEClass = createEClass(TRIGGER);

		knowledgeChangeTriggerEClass = createEClass(KNOWLEDGE_CHANGE_TRIGGER);
		createEReference(knowledgeChangeTriggerEClass, KNOWLEDGE_CHANGE_TRIGGER__KNOWLEDGE_PATH);

		knowledgePathEClass = createEClass(KNOWLEDGE_PATH);
		createEReference(knowledgePathEClass, KNOWLEDGE_PATH__NODES);

		pathNodeEClass = createEClass(PATH_NODE);

		pathNodeFieldEClass = createEClass(PATH_NODE_FIELD);
		createEAttribute(pathNodeFieldEClass, PATH_NODE_FIELD__NAME);

		pathNodeMapKeyEClass = createEClass(PATH_NODE_MAP_KEY);
		createEReference(pathNodeMapKeyEClass, PATH_NODE_MAP_KEY__KEY_PATH);

		runtimeMetadataEClass = createEClass(RUNTIME_METADATA);
		createEReference(runtimeMetadataEClass, RUNTIME_METADATA__ENSEMBLE_DEFINITIONS);
		createEReference(runtimeMetadataEClass, RUNTIME_METADATA__COMPONENT_INSTANCES);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT_PROCESSES);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__NAME);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__KNOWLEDGE_MANAGER);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__SHADOW_KNOWLEDGE_MANAGER_REGISTRY);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__ENSEMBLE_CONTROLLERS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__INTERNAL_DATA);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__STATE_SPACE_MODELS);

		ensembleDefinitionEClass = createEClass(ENSEMBLE_DEFINITION);
		createEAttribute(ensembleDefinitionEClass, ENSEMBLE_DEFINITION__NAME);
		createEReference(ensembleDefinitionEClass, ENSEMBLE_DEFINITION__MEMBERSHIP);
		createEReference(ensembleDefinitionEClass, ENSEMBLE_DEFINITION__KNOWLEDGE_EXCHANGE);
		createEReference(ensembleDefinitionEClass, ENSEMBLE_DEFINITION__TRIGGERS);
		createEAttribute(ensembleDefinitionEClass, ENSEMBLE_DEFINITION__COMMUNICATION_BOUNDARY);

		conditionEClass = createEClass(CONDITION);

		exchangeEClass = createEClass(EXCHANGE);

		componentProcessEClass = createEClass(COMPONENT_PROCESS);
		createEAttribute(componentProcessEClass, COMPONENT_PROCESS__NAME);
		createEReference(componentProcessEClass, COMPONENT_PROCESS__COMPONENT_INSTANCE);
		createEAttribute(componentProcessEClass, COMPONENT_PROCESS__IS_ACTIVE);
		createEReference(componentProcessEClass, COMPONENT_PROCESS__TRIGGERS);
		createEReference(componentProcessEClass, COMPONENT_PROCESS__CHILDREN);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__KNOWLEDGE_PATH);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		invocableEClass = createEClass(INVOCABLE);
		createEReference(invocableEClass, INVOCABLE__PARAMETERS);
		createEAttribute(invocableEClass, INVOCABLE__METHOD);

		ensembleControllerEClass = createEClass(ENSEMBLE_CONTROLLER);
		createEReference(ensembleControllerEClass, ENSEMBLE_CONTROLLER__COMPONENT_INSTANCE);
		createEReference(ensembleControllerEClass, ENSEMBLE_CONTROLLER__ENSEMBLE_DEFINITION);

		pathNodeCoordinatorEClass = createEClass(PATH_NODE_COORDINATOR);

		pathNodeMemberEClass = createEClass(PATH_NODE_MEMBER);

		pathNodeComponentIdEClass = createEClass(PATH_NODE_COMPONENT_ID);

		stringToObjectMapEClass = createEClass(STRING_TO_OBJECT_MAP);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__KEY);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__VALUE);

		stateSpaceModelDefinitionEClass = createEClass(STATE_SPACE_MODEL_DEFINITION);
		createEAttribute(stateSpaceModelDefinitionEClass, STATE_SPACE_MODEL_DEFINITION__MODEL);
		createEReference(stateSpaceModelDefinitionEClass, STATE_SPACE_MODEL_DEFINITION__COMPONENT_INSTANCE);
		createEReference(stateSpaceModelDefinitionEClass, STATE_SPACE_MODEL_DEFINITION__TRIGGERS);
		createEAttribute(stateSpaceModelDefinitionEClass, STATE_SPACE_MODEL_DEFINITION__IS_ACTIVE);
		createEReference(stateSpaceModelDefinitionEClass, STATE_SPACE_MODEL_DEFINITION__IN_STATES);
		createEReference(stateSpaceModelDefinitionEClass, STATE_SPACE_MODEL_DEFINITION__DERIVATION_STATES);
		createEAttribute(stateSpaceModelDefinitionEClass, STATE_SPACE_MODEL_DEFINITION__MODEL_VALUE);

		knowledgeTimeStampUnchangeTriggerEClass = createEClass(KNOWLEDGE_TIME_STAMP_UNCHANGE_TRIGGER);

		knowledgeTimeStampChangeTriggerEClass = createEClass(KNOWLEDGE_TIME_STAMP_CHANGE_TRIGGER);

		knowledgeTimeStampTriggerEClass = createEClass(KNOWLEDGE_TIME_STAMP_TRIGGER);
		createEReference(knowledgeTimeStampTriggerEClass, KNOWLEDGE_TIME_STAMP_TRIGGER__EVENTS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TO);
		createEReference(transitionEClass, TRANSITION__FROM);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);
		createEAttribute(transitionEClass, TRANSITION__IS_REACHABLE);

		// Create enums
		parameterDirectionEEnum = createEEnum(PARAMETER_DIRECTION);
		metadataTypeEEnum = createEEnum(METADATA_TYPE);
		comparisonTypeEEnum = createEEnum(COMPARISON_TYPE);

		// Create data types
		methodEDataType = createEDataType(METHOD);
		knowledgeManagerEDataType = createEDataType(KNOWLEDGE_MANAGER);
		shadowKnowledgeManagerRegistryEDataType = createEDataType(SHADOW_KNOWLEDGE_MANAGER_REGISTRY);
		communicationBoundaryEDataType = createEDataType(COMMUNICATION_BOUNDARY);
		modelTypeEDataType = createEDataType(MODEL_TYPE);
		inaccurateValueEDataType = createEDataType(INACCURATE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timeTriggerEClass.getESuperTypes().add(this.getTrigger());
		knowledgeChangeTriggerEClass.getESuperTypes().add(this.getTrigger());
		pathNodeFieldEClass.getESuperTypes().add(this.getPathNode());
		pathNodeMapKeyEClass.getESuperTypes().add(this.getPathNode());
		conditionEClass.getESuperTypes().add(this.getInvocable());
		exchangeEClass.getESuperTypes().add(this.getInvocable());
		componentProcessEClass.getESuperTypes().add(this.getInvocable());
		pathNodeCoordinatorEClass.getESuperTypes().add(this.getPathNode());
		pathNodeMemberEClass.getESuperTypes().add(this.getPathNode());
		pathNodeComponentIdEClass.getESuperTypes().add(this.getPathNode());
		knowledgeTimeStampUnchangeTriggerEClass.getESuperTypes().add(this.getKnowledgeTimeStampTrigger());
		knowledgeTimeStampChangeTriggerEClass.getESuperTypes().add(this.getKnowledgeTimeStampTrigger());
		knowledgeTimeStampTriggerEClass.getESuperTypes().add(this.getKnowledgeChangeTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(timeTriggerEClass, TimeTrigger.class, "TimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeTrigger_Period(), ecorePackage.getELong(), "period", "0", 1, 1, TimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeTrigger_Offset(), ecorePackage.getELong(), "offset", "0", 1, 1, TimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knowledgeChangeTriggerEClass, KnowledgeChangeTrigger.class, "KnowledgeChangeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeChangeTrigger_KnowledgePath(), this.getKnowledgePath(), null, "knowledgePath", null, 1, 1, KnowledgeChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgePathEClass, KnowledgePath.class, "KnowledgePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgePath_Nodes(), this.getPathNode(), null, "nodes", null, 1, -1, KnowledgePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathNodeEClass, PathNode.class, "PathNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathNodeFieldEClass, PathNodeField.class, "PathNodeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathNodeField_Name(), ecorePackage.getEString(), "name", null, 1, 1, PathNodeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathNodeMapKeyEClass, PathNodeMapKey.class, "PathNodeMapKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathNodeMapKey_KeyPath(), this.getKnowledgePath(), null, "keyPath", null, 1, 1, PathNodeMapKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeMetadataEClass, RuntimeMetadata.class, "RuntimeMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeMetadata_EnsembleDefinitions(), this.getEnsembleDefinition(), null, "ensembleDefinitions", null, 0, -1, RuntimeMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeMetadata_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, RuntimeMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_ComponentProcesses(), this.getComponentProcess(), this.getComponentProcess_ComponentInstance(), "componentProcesses", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_KnowledgeManager(), this.getKnowledgeManager(), "knowledgeManager", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_ShadowKnowledgeManagerRegistry(), this.getShadowKnowledgeManagerRegistry(), "shadowKnowledgeManagerRegistry", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_EnsembleControllers(), this.getEnsembleController(), this.getEnsembleController_ComponentInstance(), "ensembleControllers", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_InternalData(), this.getStringToObjectMap(), null, "internalData", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_StateSpaceModels(), this.getStateSpaceModelDefinition(), this.getStateSpaceModelDefinition_ComponentInstance(), "stateSpaceModels", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensembleDefinitionEClass, EnsembleDefinition.class, "EnsembleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnsembleDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnsembleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsembleDefinition_Membership(), this.getCondition(), null, "membership", null, 1, 1, EnsembleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsembleDefinition_KnowledgeExchange(), this.getExchange(), null, "knowledgeExchange", null, 1, 1, EnsembleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsembleDefinition_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, EnsembleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnsembleDefinition_CommunicationBoundary(), this.getCommunicationBoundary(), "communicationBoundary", null, 0, 1, EnsembleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exchangeEClass, Exchange.class, "Exchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentProcessEClass, ComponentProcess.class, "ComponentProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentProcess_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentProcess_ComponentInstance(), this.getComponentInstance(), this.getComponentInstance_ComponentProcesses(), "componentInstance", null, 1, 1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentProcess_IsActive(), ecorePackage.getEBoolean(), "isActive", "true", 1, 1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentProcess_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentProcess_Children(), this.getComponentProcess(), null, "children", null, 0, -1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_KnowledgePath(), this.getKnowledgePath(), null, "knowledgePath", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Direction(), this.getParameterDirection(), "direction", "INOUT", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEJavaClass(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invocableEClass, Invocable.class, "Invocable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocable_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Invocable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvocable_Method(), this.getMethod(), "method", null, 1, 1, Invocable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensembleControllerEClass, EnsembleController.class, "EnsembleController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnsembleController_ComponentInstance(), this.getComponentInstance(), this.getComponentInstance_EnsembleControllers(), "componentInstance", null, 1, 1, EnsembleController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsembleController_EnsembleDefinition(), this.getEnsembleDefinition(), null, "ensembleDefinition", null, 1, 1, EnsembleController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathNodeCoordinatorEClass, PathNodeCoordinator.class, "PathNodeCoordinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathNodeMemberEClass, PathNodeMember.class, "PathNodeMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathNodeComponentIdEClass, PathNodeComponentId.class, "PathNodeComponentId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringToObjectMapEClass, Map.Entry.class, "StringToObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToObjectMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToObjectMap_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateSpaceModelDefinitionEClass, StateSpaceModelDefinition.class, "StateSpaceModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateSpaceModelDefinition_Model(), this.getModelType(), "model", null, 0, 1, StateSpaceModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpaceModelDefinition_ComponentInstance(), this.getComponentInstance(), this.getComponentInstance_StateSpaceModels(), "componentInstance", null, 1, 1, StateSpaceModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpaceModelDefinition_Triggers(), this.getTimeTrigger(), null, "triggers", null, 0, -1, StateSpaceModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpaceModelDefinition_IsActive(), ecorePackage.getEBoolean(), "isActive", null, 1, 1, StateSpaceModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpaceModelDefinition_InStates(), this.getKnowledgePath(), null, "inStates", null, 1, -1, StateSpaceModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpaceModelDefinition_DerivationStates(), this.getKnowledgePath(), null, "derivationStates", null, 0, -1, StateSpaceModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpaceModelDefinition_ModelValue(), this.getInaccurateValue(), "modelValue", null, 1, 1, StateSpaceModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeTimeStampUnchangeTriggerEClass, KnowledgeTimeStampUnchangeTrigger.class, "KnowledgeTimeStampUnchangeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knowledgeTimeStampChangeTriggerEClass, KnowledgeTimeStampChangeTrigger.class, "KnowledgeTimeStampChangeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knowledgeTimeStampTriggerEClass, KnowledgeTimeStampTrigger.class, "KnowledgeTimeStampTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeTimeStampTrigger_Events(), this.getTransition(), null, "events", null, 1, -1, KnowledgeTimeStampTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_To(), this.getComponentProcess(), null, "to", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_From(), this.getComponentProcess(), null, "from", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_IsReachable(), ecorePackage.getEBoolean(), "isReachable", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterDirectionEEnum, ParameterDirection.class, "ParameterDirection");
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.IN);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.OUT);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.INOUT);

		initEEnum(metadataTypeEEnum, MetadataType.class, "MetadataType");
		addEEnumLiteral(metadataTypeEEnum, MetadataType.EMPTY);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.TS);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.MIN_BOUNDARY);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.MAX_BOUNDARY);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.INACCURACY);

		initEEnum(comparisonTypeEEnum, ComparisonType.class, "ComparisonType");
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.EQUAL);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.EQUAL_LESS_THAN);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.EQUAL_MORE_THAN);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.LESS_THAN);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.MORE_THAN);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.EQUAL_STR);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.NOT_EQUAL);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.NOT_EQUAL_STR);

		// Initialize data types
		initEDataType(methodEDataType, Method.class, "Method", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(knowledgeManagerEDataType, KnowledgeManager.class, "KnowledgeManager", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shadowKnowledgeManagerRegistryEDataType, ShadowKnowledgeManagerRegistry.class, "ShadowKnowledgeManagerRegistry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(communicationBoundaryEDataType, CommunicationBoundaryPredicate.class, "CommunicationBoundary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modelTypeEDataType, ModelInterface.class, "ModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inaccurateValueEDataType, InaccuracyParamHolder.class, "InaccurateValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimeMetadataPackageImpl
