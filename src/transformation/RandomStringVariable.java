/**
 */
package transformation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random String Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transformation.RandomStringVariable#getPossibleValues <em>Possible Values</em>}</li>
 * </ul>
 *
 * @see transformation.TransformationPackage#getRandomStringVariable()
 * @model
 * @generated
 */
public interface RandomStringVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Possible Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Values</em>' attribute list.
	 * @see transformation.TransformationPackage#getRandomStringVariable_PossibleValues()
	 * @model
	 * @generated
	 */
	EList<String> getPossibleValues();

} // RandomStringVariable
