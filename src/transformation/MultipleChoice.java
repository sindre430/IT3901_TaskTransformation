/**
 */
package transformation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transformation.MultipleChoice#getSourceRegion <em>Source Region</em>}</li>
 *   <li>{@link transformation.MultipleChoice#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see transformation.TransformationPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends TransformationElement {
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
	 * @see transformation.TransformationPackage#getMultipleChoice_SourceRegion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceRegion getSourceRegion();

	/**
	 * Sets the value of the '{@link transformation.MultipleChoice#getSourceRegion <em>Source Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Region</em>' containment reference.
	 * @see #getSourceRegion()
	 * @generated
	 */
	void setSourceRegion(SourceRegion value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link transformation.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see transformation.TransformationPackage#getMultipleChoice_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getOptions();

} // MultipleChoice
