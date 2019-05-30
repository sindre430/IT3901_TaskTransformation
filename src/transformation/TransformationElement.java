/**
 */
package transformation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transformation.TransformationElement#getLineText <em>Line Text</em>}</li>
 *   <li>{@link transformation.TransformationElement#getLineNumber <em>Line Number</em>}</li>
 * </ul>
 *
 * @see transformation.TransformationPackage#getTransformationElement()
 * @model abstract="true"
 * @generated
 */
public interface TransformationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Text</em>' attribute.
	 * @see #setLineText(String)
	 * @see transformation.TransformationPackage#getTransformationElement_LineText()
	 * @model
	 * @generated
	 */
	String getLineText();

	/**
	 * Sets the value of the '{@link transformation.TransformationElement#getLineText <em>Line Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Text</em>' attribute.
	 * @see #getLineText()
	 * @generated
	 */
	void setLineText(String value);

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see transformation.TransformationPackage#getTransformationElement_LineNumber()
	 * @model
	 * @generated
	 */
	int getLineNumber();

	/**
	 * Sets the value of the '{@link transformation.TransformationElement#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(int value);

} // TransformationElement
