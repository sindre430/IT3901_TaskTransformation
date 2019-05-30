/**
 */
package transformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transformation.Container#getTransformationElements <em>Transformation Elements</em>}</li>
 * </ul>
 *
 * @see transformation.TransformationPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation Elements</b></em>' containment reference list.
	 * The list contents are of type {@link transformation.TransformationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Elements</em>' containment reference list.
	 * @see transformation.TransformationPackage#getContainer_TransformationElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationElement> getTransformationElements();

} // Container
