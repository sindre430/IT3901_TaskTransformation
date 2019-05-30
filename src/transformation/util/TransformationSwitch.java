/**
 */
package transformation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import transformation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see transformation.TransformationPackage
 * @generated
 */
public class TransformationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransformationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationSwitch() {
		if (modelPackage == null) {
			modelPackage = TransformationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TransformationPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.TRANSFORMATION_ELEMENT: {
				TransformationElement transformationElement = (TransformationElement)theEObject;
				T result = caseTransformationElement(transformationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.FILE_INFORMATION: {
				FileInformation fileInformation = (FileInformation)theEObject;
				T result = caseFileInformation(fileInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.BLANK: {
				Blank blank = (Blank)theEObject;
				T result = caseBlank(blank);
				if (result == null) result = caseTransformationElement(blank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.MULTIPLE_CHOICE: {
				MultipleChoice multipleChoice = (MultipleChoice)theEObject;
				T result = caseMultipleChoice(multipleChoice);
				if (result == null) result = caseTransformationElement(multipleChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.EDIT_TEXT: {
				EditText editText = (EditText)theEObject;
				T result = caseEditText(editText);
				if (result == null) result = caseTransformationElement(editText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.MOVEABLE: {
				Moveable moveable = (Moveable)theEObject;
				T result = caseMoveable(moveable);
				if (result == null) result = caseTransformationElement(moveable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.SOURCE_REGION: {
				SourceRegion sourceRegion = (SourceRegion)theEObject;
				T result = caseSourceRegion(sourceRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.TEXT_REGION: {
				TextRegion textRegion = (TextRegion)theEObject;
				T result = caseTextRegion(textRegion);
				if (result == null) result = caseSourceRegion(textRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.INDEX_REGION: {
				IndexRegion indexRegion = (IndexRegion)theEObject;
				T result = caseIndexRegion(indexRegion);
				if (result == null) result = caseSourceRegion(indexRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.REGEX_REGION: {
				RegexRegion regexRegion = (RegexRegion)theEObject;
				T result = caseRegexRegion(regexRegion);
				if (result == null) result = caseSourceRegion(regexRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseTransformationElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.STATIC_VARIABLE: {
				StaticVariable staticVariable = (StaticVariable)theEObject;
				T result = caseStaticVariable(staticVariable);
				if (result == null) result = caseVariable(staticVariable);
				if (result == null) result = caseTransformationElement(staticVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.RANDOM_NUMBER_VARIABLE: {
				RandomNumberVariable randomNumberVariable = (RandomNumberVariable)theEObject;
				T result = caseRandomNumberVariable(randomNumberVariable);
				if (result == null) result = caseVariable(randomNumberVariable);
				if (result == null) result = caseTransformationElement(randomNumberVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransformationPackage.RANDOM_STRING_VARIABLE: {
				RandomStringVariable randomStringVariable = (RandomStringVariable)theEObject;
				T result = caseRandomStringVariable(randomStringVariable);
				if (result == null) result = caseVariable(randomStringVariable);
				if (result == null) result = caseTransformationElement(randomStringVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationElement(TransformationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileInformation(FileInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlank(Blank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoice(MultipleChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditText(EditText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moveable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moveable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveable(Moveable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceRegion(SourceRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextRegion(TextRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexRegion(IndexRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regex Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regex Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegexRegion(RegexRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticVariable(StaticVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Number Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Number Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomNumberVariable(RandomNumberVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random String Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random String Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomStringVariable(RandomStringVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TransformationSwitch
