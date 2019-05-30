/**
 */
package transformation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transformation.EditText#getSourceRegion <em>Source Region</em>}</li>
 *   <li>{@link transformation.EditText#getReplacement <em>Replacement</em>}</li>
 * </ul>
 *
 * @see transformation.TransformationPackage#getEditText()
 * @model
 * @generated
 */
public interface EditText extends TransformationElement {
	/**
	 * Returns the value of the '<em><b>Source Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Region</em>' containment reference.
	 * @see #setSourceRegion(SourceRegion)
	 * @see transformation.TransformationPackage#getEditText_SourceRegion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceRegion getSourceRegion();

	/**
	 * Sets the value of the '{@link transformation.EditText#getSourceRegion <em>Source Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Region</em>' containment reference.
	 * @see #getSourceRegion()
	 * @generated
	 */
	void setSourceRegion(SourceRegion value);

	/**
	 * Returns the value of the '<em><b>Replacement</b></em>' containment reference list.
	 * The list contents are of type {@link transformation.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement</em>' containment reference list.
	 * @see transformation.TransformationPackage#getEditText_Replacement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getReplacement();

} // EditText
