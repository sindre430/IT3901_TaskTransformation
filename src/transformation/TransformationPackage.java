/**
 */
package transformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see transformation.TransformationFactory
 * @model kind="package"
 * @generated
 */
public interface TransformationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transformation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/transformation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transformation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationPackage eINSTANCE = transformation.impl.TransformationPackageImpl.init();

	/**
	 * The meta object id for the '{@link transformation.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.ContainerImpl
	 * @see transformation.impl.TransformationPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Transformation Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TRANSFORMATION_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transformation.impl.TransformationElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.TransformationElementImpl
	 * @see transformation.impl.TransformationPackageImpl#getTransformationElement()
	 * @generated
	 */
	int TRANSFORMATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ELEMENT__LINE_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ELEMENT__LINE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transformation.impl.FileInformationImpl <em>File Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.FileInformationImpl
	 * @see transformation.impl.TransformationPackageImpl#getFileInformation()
	 * @generated
	 */
	int FILE_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INFORMATION__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INFORMATION__LINES = 1;

	/**
	 * The number of structural features of the '<em>File Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transformation.impl.BlankImpl <em>Blank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.BlankImpl
	 * @see transformation.impl.TransformationPackageImpl#getBlank()
	 * @generated
	 */
	int BLANK = 3;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK__LINE_TEXT = TRANSFORMATION_ELEMENT__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK__LINE_NUMBER = TRANSFORMATION_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Source Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK__SOURCE_REGION = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK__REGION_TYPE = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Blank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Blank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_OPERATION_COUNT = TRANSFORMATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.MultipleChoiceImpl
	 * @see transformation.impl.TransformationPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 4;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__LINE_TEXT = TRANSFORMATION_ELEMENT__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__LINE_NUMBER = TRANSFORMATION_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Source Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__SOURCE_REGION = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__OPTIONS = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = TRANSFORMATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.EditTextImpl <em>Edit Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.EditTextImpl
	 * @see transformation.impl.TransformationPackageImpl#getEditText()
	 * @generated
	 */
	int EDIT_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LINE_TEXT = TRANSFORMATION_ELEMENT__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LINE_NUMBER = TRANSFORMATION_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Source Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__SOURCE_REGION = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replacement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__REPLACEMENT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_OPERATION_COUNT = TRANSFORMATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.MoveableImpl <em>Moveable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.MoveableImpl
	 * @see transformation.impl.TransformationPackageImpl#getMoveable()
	 * @generated
	 */
	int MOVEABLE = 6;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE__LINE_TEXT = TRANSFORMATION_ELEMENT__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE__LINE_NUMBER = TRANSFORMATION_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Region Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE__REGION_TYPE = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE__GROUP_ID = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE__SET_ID = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE__GROUP_START = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE__GROUP_END = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Moveable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Moveable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_OPERATION_COUNT = TRANSFORMATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.ContentImpl
	 * @see transformation.impl.TransformationPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transformation.impl.SourceRegionImpl <em>Source Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.SourceRegionImpl
	 * @see transformation.impl.TransformationPackageImpl#getSourceRegion()
	 * @generated
	 */
	int SOURCE_REGION = 8;

	/**
	 * The number of structural features of the '<em>Source Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Source Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transformation.impl.TextRegionImpl <em>Text Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.TextRegionImpl
	 * @see transformation.impl.TransformationPackageImpl#getTextRegion()
	 * @generated
	 */
	int TEXT_REGION = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REGION__TEXT = SOURCE_REGION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REGION_FEATURE_COUNT = SOURCE_REGION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REGION_OPERATION_COUNT = SOURCE_REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.IndexRegionImpl <em>Index Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.IndexRegionImpl
	 * @see transformation.impl.TransformationPackageImpl#getIndexRegion()
	 * @generated
	 */
	int INDEX_REGION = 10;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_REGION__OFFSET = SOURCE_REGION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_REGION__LENGTH = SOURCE_REGION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Index Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_REGION_FEATURE_COUNT = SOURCE_REGION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Index Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_REGION_OPERATION_COUNT = SOURCE_REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.RegexRegionImpl <em>Regex Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.RegexRegionImpl
	 * @see transformation.impl.TransformationPackageImpl#getRegexRegion()
	 * @generated
	 */
	int REGEX_REGION = 11;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_REGION__REGEX = SOURCE_REGION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regex Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_REGION_FEATURE_COUNT = SOURCE_REGION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regex Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_REGION_OPERATION_COUNT = SOURCE_REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.VariableImpl
	 * @see transformation.impl.TransformationPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LINE_TEXT = TRANSFORMATION_ELEMENT__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LINE_NUMBER = TRANSFORMATION_ELEMENT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = TRANSFORMATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.StaticVariableImpl <em>Static Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.StaticVariableImpl
	 * @see transformation.impl.TransformationPackageImpl#getStaticVariable()
	 * @generated
	 */
	int STATIC_VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE__LINE_TEXT = VARIABLE__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE__LINE_NUMBER = VARIABLE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.RandomNumberVariableImpl <em>Random Number Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.RandomNumberVariableImpl
	 * @see transformation.impl.TransformationPackageImpl#getRandomNumberVariable()
	 * @generated
	 */
	int RANDOM_NUMBER_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_NUMBER_VARIABLE__LINE_TEXT = VARIABLE__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_NUMBER_VARIABLE__LINE_NUMBER = VARIABLE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_NUMBER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_NUMBER_VARIABLE__MIN_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_NUMBER_VARIABLE__MAX_VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Random Number Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_NUMBER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Random Number Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_NUMBER_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.impl.RandomStringVariableImpl <em>Random String Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.impl.RandomStringVariableImpl
	 * @see transformation.impl.TransformationPackageImpl#getRandomStringVariable()
	 * @generated
	 */
	int RANDOM_STRING_VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STRING_VARIABLE__LINE_TEXT = VARIABLE__LINE_TEXT;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STRING_VARIABLE__LINE_NUMBER = VARIABLE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STRING_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Possible Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STRING_VARIABLE__POSSIBLE_VALUES = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STRING_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Random String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STRING_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link transformation.RegionTypes <em>Region Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transformation.RegionTypes
	 * @see transformation.impl.TransformationPackageImpl#getRegionTypes()
	 * @generated
	 */
	int REGION_TYPES = 16;


	/**
	 * Returns the meta object for class '{@link transformation.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see transformation.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link transformation.Container#getTransformationElements <em>Transformation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Elements</em>'.
	 * @see transformation.Container#getTransformationElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_TransformationElements();

	/**
	 * Returns the meta object for class '{@link transformation.TransformationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see transformation.TransformationElement
	 * @generated
	 */
	EClass getTransformationElement();

	/**
	 * Returns the meta object for the attribute '{@link transformation.TransformationElement#getLineText <em>Line Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Text</em>'.
	 * @see transformation.TransformationElement#getLineText()
	 * @see #getTransformationElement()
	 * @generated
	 */
	EAttribute getTransformationElement_LineText();

	/**
	 * Returns the meta object for the attribute '{@link transformation.TransformationElement#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see transformation.TransformationElement#getLineNumber()
	 * @see #getTransformationElement()
	 * @generated
	 */
	EAttribute getTransformationElement_LineNumber();

	/**
	 * Returns the meta object for class '{@link transformation.FileInformation <em>File Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Information</em>'.
	 * @see transformation.FileInformation
	 * @generated
	 */
	EClass getFileInformation();

	/**
	 * Returns the meta object for the attribute '{@link transformation.FileInformation#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see transformation.FileInformation#getFilename()
	 * @see #getFileInformation()
	 * @generated
	 */
	EAttribute getFileInformation_Filename();

	/**
	 * Returns the meta object for the attribute list '{@link transformation.FileInformation#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lines</em>'.
	 * @see transformation.FileInformation#getLines()
	 * @see #getFileInformation()
	 * @generated
	 */
	EAttribute getFileInformation_Lines();

	/**
	 * Returns the meta object for class '{@link transformation.Blank <em>Blank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank</em>'.
	 * @see transformation.Blank
	 * @generated
	 */
	EClass getBlank();

	/**
	 * Returns the meta object for the containment reference '{@link transformation.Blank#getSourceRegion <em>Source Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Region</em>'.
	 * @see transformation.Blank#getSourceRegion()
	 * @see #getBlank()
	 * @generated
	 */
	EReference getBlank_SourceRegion();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Blank#getRegionType <em>Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Type</em>'.
	 * @see transformation.Blank#getRegionType()
	 * @see #getBlank()
	 * @generated
	 */
	EAttribute getBlank_RegionType();

	/**
	 * Returns the meta object for class '{@link transformation.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see transformation.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the containment reference '{@link transformation.MultipleChoice#getSourceRegion <em>Source Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Region</em>'.
	 * @see transformation.MultipleChoice#getSourceRegion()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_SourceRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link transformation.MultipleChoice#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see transformation.MultipleChoice#getOptions()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Options();

	/**
	 * Returns the meta object for class '{@link transformation.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Text</em>'.
	 * @see transformation.EditText
	 * @generated
	 */
	EClass getEditText();

	/**
	 * Returns the meta object for the containment reference '{@link transformation.EditText#getSourceRegion <em>Source Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Region</em>'.
	 * @see transformation.EditText#getSourceRegion()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_SourceRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link transformation.EditText#getReplacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replacement</em>'.
	 * @see transformation.EditText#getReplacement()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Replacement();

	/**
	 * Returns the meta object for class '{@link transformation.Moveable <em>Moveable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moveable</em>'.
	 * @see transformation.Moveable
	 * @generated
	 */
	EClass getMoveable();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Moveable#getRegionType <em>Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Type</em>'.
	 * @see transformation.Moveable#getRegionType()
	 * @see #getMoveable()
	 * @generated
	 */
	EAttribute getMoveable_RegionType();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Moveable#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see transformation.Moveable#getGroupId()
	 * @see #getMoveable()
	 * @generated
	 */
	EAttribute getMoveable_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Moveable#getSetId <em>Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Id</em>'.
	 * @see transformation.Moveable#getSetId()
	 * @see #getMoveable()
	 * @generated
	 */
	EAttribute getMoveable_SetId();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Moveable#isGroupStart <em>Group Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Start</em>'.
	 * @see transformation.Moveable#isGroupStart()
	 * @see #getMoveable()
	 * @generated
	 */
	EAttribute getMoveable_GroupStart();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Moveable#isGroupEnd <em>Group End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group End</em>'.
	 * @see transformation.Moveable#isGroupEnd()
	 * @see #getMoveable()
	 * @generated
	 */
	EAttribute getMoveable_GroupEnd();

	/**
	 * Returns the meta object for class '{@link transformation.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see transformation.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Content#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see transformation.Content#getText()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Text();

	/**
	 * Returns the meta object for the reference '{@link transformation.Content#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see transformation.Content#getVariable()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Variable();

	/**
	 * Returns the meta object for class '{@link transformation.SourceRegion <em>Source Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Region</em>'.
	 * @see transformation.SourceRegion
	 * @generated
	 */
	EClass getSourceRegion();

	/**
	 * Returns the meta object for class '{@link transformation.TextRegion <em>Text Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Region</em>'.
	 * @see transformation.TextRegion
	 * @generated
	 */
	EClass getTextRegion();

	/**
	 * Returns the meta object for the attribute '{@link transformation.TextRegion#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see transformation.TextRegion#getText()
	 * @see #getTextRegion()
	 * @generated
	 */
	EAttribute getTextRegion_Text();

	/**
	 * Returns the meta object for class '{@link transformation.IndexRegion <em>Index Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Region</em>'.
	 * @see transformation.IndexRegion
	 * @generated
	 */
	EClass getIndexRegion();

	/**
	 * Returns the meta object for the attribute '{@link transformation.IndexRegion#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see transformation.IndexRegion#getOffset()
	 * @see #getIndexRegion()
	 * @generated
	 */
	EAttribute getIndexRegion_Offset();

	/**
	 * Returns the meta object for the attribute '{@link transformation.IndexRegion#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see transformation.IndexRegion#getLength()
	 * @see #getIndexRegion()
	 * @generated
	 */
	EAttribute getIndexRegion_Length();

	/**
	 * Returns the meta object for class '{@link transformation.RegexRegion <em>Regex Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regex Region</em>'.
	 * @see transformation.RegexRegion
	 * @generated
	 */
	EClass getRegexRegion();

	/**
	 * Returns the meta object for the attribute '{@link transformation.RegexRegion#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see transformation.RegexRegion#getRegex()
	 * @see #getRegexRegion()
	 * @generated
	 */
	EAttribute getRegexRegion_Regex();

	/**
	 * Returns the meta object for class '{@link transformation.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see transformation.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link transformation.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transformation.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link transformation.StaticVariable <em>Static Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Variable</em>'.
	 * @see transformation.StaticVariable
	 * @generated
	 */
	EClass getStaticVariable();

	/**
	 * Returns the meta object for the attribute '{@link transformation.StaticVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see transformation.StaticVariable#getValue()
	 * @see #getStaticVariable()
	 * @generated
	 */
	EAttribute getStaticVariable_Value();

	/**
	 * Returns the meta object for class '{@link transformation.RandomNumberVariable <em>Random Number Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Number Variable</em>'.
	 * @see transformation.RandomNumberVariable
	 * @generated
	 */
	EClass getRandomNumberVariable();

	/**
	 * Returns the meta object for the attribute '{@link transformation.RandomNumberVariable#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see transformation.RandomNumberVariable#getMinValue()
	 * @see #getRandomNumberVariable()
	 * @generated
	 */
	EAttribute getRandomNumberVariable_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link transformation.RandomNumberVariable#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see transformation.RandomNumberVariable#getMaxValue()
	 * @see #getRandomNumberVariable()
	 * @generated
	 */
	EAttribute getRandomNumberVariable_MaxValue();

	/**
	 * Returns the meta object for class '{@link transformation.RandomStringVariable <em>Random String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random String Variable</em>'.
	 * @see transformation.RandomStringVariable
	 * @generated
	 */
	EClass getRandomStringVariable();

	/**
	 * Returns the meta object for the attribute list '{@link transformation.RandomStringVariable#getPossibleValues <em>Possible Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Possible Values</em>'.
	 * @see transformation.RandomStringVariable#getPossibleValues()
	 * @see #getRandomStringVariable()
	 * @generated
	 */
	EAttribute getRandomStringVariable_PossibleValues();

	/**
	 * Returns the meta object for enum '{@link transformation.RegionTypes <em>Region Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Region Types</em>'.
	 * @see transformation.RegionTypes
	 * @generated
	 */
	EEnum getRegionTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformationFactory getTransformationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link transformation.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.ContainerImpl
		 * @see transformation.impl.TransformationPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Transformation Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TRANSFORMATION_ELEMENTS = eINSTANCE.getContainer_TransformationElements();

		/**
		 * The meta object literal for the '{@link transformation.impl.TransformationElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.TransformationElementImpl
		 * @see transformation.impl.TransformationPackageImpl#getTransformationElement()
		 * @generated
		 */
		EClass TRANSFORMATION_ELEMENT = eINSTANCE.getTransformationElement();

		/**
		 * The meta object literal for the '<em><b>Line Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_ELEMENT__LINE_TEXT = eINSTANCE.getTransformationElement_LineText();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_ELEMENT__LINE_NUMBER = eINSTANCE.getTransformationElement_LineNumber();

		/**
		 * The meta object literal for the '{@link transformation.impl.FileInformationImpl <em>File Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.FileInformationImpl
		 * @see transformation.impl.TransformationPackageImpl#getFileInformation()
		 * @generated
		 */
		EClass FILE_INFORMATION = eINSTANCE.getFileInformation();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_INFORMATION__FILENAME = eINSTANCE.getFileInformation_Filename();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_INFORMATION__LINES = eINSTANCE.getFileInformation_Lines();

		/**
		 * The meta object literal for the '{@link transformation.impl.BlankImpl <em>Blank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.BlankImpl
		 * @see transformation.impl.TransformationPackageImpl#getBlank()
		 * @generated
		 */
		EClass BLANK = eINSTANCE.getBlank();

		/**
		 * The meta object literal for the '<em><b>Source Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLANK__SOURCE_REGION = eINSTANCE.getBlank_SourceRegion();

		/**
		 * The meta object literal for the '<em><b>Region Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLANK__REGION_TYPE = eINSTANCE.getBlank_RegionType();

		/**
		 * The meta object literal for the '{@link transformation.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.MultipleChoiceImpl
		 * @see transformation.impl.TransformationPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Source Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__SOURCE_REGION = eINSTANCE.getMultipleChoice_SourceRegion();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__OPTIONS = eINSTANCE.getMultipleChoice_Options();

		/**
		 * The meta object literal for the '{@link transformation.impl.EditTextImpl <em>Edit Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.EditTextImpl
		 * @see transformation.impl.TransformationPackageImpl#getEditText()
		 * @generated
		 */
		EClass EDIT_TEXT = eINSTANCE.getEditText();

		/**
		 * The meta object literal for the '<em><b>Source Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__SOURCE_REGION = eINSTANCE.getEditText_SourceRegion();

		/**
		 * The meta object literal for the '<em><b>Replacement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__REPLACEMENT = eINSTANCE.getEditText_Replacement();

		/**
		 * The meta object literal for the '{@link transformation.impl.MoveableImpl <em>Moveable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.MoveableImpl
		 * @see transformation.impl.TransformationPackageImpl#getMoveable()
		 * @generated
		 */
		EClass MOVEABLE = eINSTANCE.getMoveable();

		/**
		 * The meta object literal for the '<em><b>Region Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEABLE__REGION_TYPE = eINSTANCE.getMoveable_RegionType();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEABLE__GROUP_ID = eINSTANCE.getMoveable_GroupId();

		/**
		 * The meta object literal for the '<em><b>Set Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEABLE__SET_ID = eINSTANCE.getMoveable_SetId();

		/**
		 * The meta object literal for the '<em><b>Group Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEABLE__GROUP_START = eINSTANCE.getMoveable_GroupStart();

		/**
		 * The meta object literal for the '<em><b>Group End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEABLE__GROUP_END = eINSTANCE.getMoveable_GroupEnd();

		/**
		 * The meta object literal for the '{@link transformation.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.ContentImpl
		 * @see transformation.impl.TransformationPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__TEXT = eINSTANCE.getContent_Text();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__VARIABLE = eINSTANCE.getContent_Variable();

		/**
		 * The meta object literal for the '{@link transformation.impl.SourceRegionImpl <em>Source Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.SourceRegionImpl
		 * @see transformation.impl.TransformationPackageImpl#getSourceRegion()
		 * @generated
		 */
		EClass SOURCE_REGION = eINSTANCE.getSourceRegion();

		/**
		 * The meta object literal for the '{@link transformation.impl.TextRegionImpl <em>Text Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.TextRegionImpl
		 * @see transformation.impl.TransformationPackageImpl#getTextRegion()
		 * @generated
		 */
		EClass TEXT_REGION = eINSTANCE.getTextRegion();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_REGION__TEXT = eINSTANCE.getTextRegion_Text();

		/**
		 * The meta object literal for the '{@link transformation.impl.IndexRegionImpl <em>Index Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.IndexRegionImpl
		 * @see transformation.impl.TransformationPackageImpl#getIndexRegion()
		 * @generated
		 */
		EClass INDEX_REGION = eINSTANCE.getIndexRegion();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_REGION__OFFSET = eINSTANCE.getIndexRegion_Offset();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_REGION__LENGTH = eINSTANCE.getIndexRegion_Length();

		/**
		 * The meta object literal for the '{@link transformation.impl.RegexRegionImpl <em>Regex Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.RegexRegionImpl
		 * @see transformation.impl.TransformationPackageImpl#getRegexRegion()
		 * @generated
		 */
		EClass REGEX_REGION = eINSTANCE.getRegexRegion();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEX_REGION__REGEX = eINSTANCE.getRegexRegion_Regex();

		/**
		 * The meta object literal for the '{@link transformation.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.VariableImpl
		 * @see transformation.impl.TransformationPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link transformation.impl.StaticVariableImpl <em>Static Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.StaticVariableImpl
		 * @see transformation.impl.TransformationPackageImpl#getStaticVariable()
		 * @generated
		 */
		EClass STATIC_VARIABLE = eINSTANCE.getStaticVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VARIABLE__VALUE = eINSTANCE.getStaticVariable_Value();

		/**
		 * The meta object literal for the '{@link transformation.impl.RandomNumberVariableImpl <em>Random Number Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.RandomNumberVariableImpl
		 * @see transformation.impl.TransformationPackageImpl#getRandomNumberVariable()
		 * @generated
		 */
		EClass RANDOM_NUMBER_VARIABLE = eINSTANCE.getRandomNumberVariable();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_NUMBER_VARIABLE__MIN_VALUE = eINSTANCE.getRandomNumberVariable_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_NUMBER_VARIABLE__MAX_VALUE = eINSTANCE.getRandomNumberVariable_MaxValue();

		/**
		 * The meta object literal for the '{@link transformation.impl.RandomStringVariableImpl <em>Random String Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.impl.RandomStringVariableImpl
		 * @see transformation.impl.TransformationPackageImpl#getRandomStringVariable()
		 * @generated
		 */
		EClass RANDOM_STRING_VARIABLE = eINSTANCE.getRandomStringVariable();

		/**
		 * The meta object literal for the '<em><b>Possible Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_STRING_VARIABLE__POSSIBLE_VALUES = eINSTANCE.getRandomStringVariable_PossibleValues();

		/**
		 * The meta object literal for the '{@link transformation.RegionTypes <em>Region Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transformation.RegionTypes
		 * @see transformation.impl.TransformationPackageImpl#getRegionTypes()
		 * @generated
		 */
		EEnum REGION_TYPES = eINSTANCE.getRegionTypes();

	}

} //TransformationPackage
