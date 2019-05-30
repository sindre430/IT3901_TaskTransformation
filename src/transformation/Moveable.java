/**
 */
package transformation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moveable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transformation.Moveable#getRegionType <em>Region Type</em>}</li>
 *   <li>{@link transformation.Moveable#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link transformation.Moveable#getSetId <em>Set Id</em>}</li>
 *   <li>{@link transformation.Moveable#isGroupStart <em>Group Start</em>}</li>
 *   <li>{@link transformation.Moveable#isGroupEnd <em>Group End</em>}</li>
 * </ul>
 *
 * @see transformation.TransformationPackage#getMoveable()
 * @model
 * @generated
 */
public interface Moveable extends TransformationElement {
	/**
	 * Returns the value of the '<em><b>Region Type</b></em>' attribute.
	 * The literals are from the enumeration {@link transformation.RegionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Type</em>' attribute.
	 * @see transformation.RegionTypes
	 * @see #setRegionType(RegionTypes)
	 * @see transformation.TransformationPackage#getMoveable_RegionType()
	 * @model
	 * @generated
	 */
	RegionTypes getRegionType();

	/**
	 * Sets the value of the '{@link transformation.Moveable#getRegionType <em>Region Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Type</em>' attribute.
	 * @see transformation.RegionTypes
	 * @see #getRegionType()
	 * @generated
	 */
	void setRegionType(RegionTypes value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(int)
	 * @see transformation.TransformationPackage#getMoveable_GroupId()
	 * @model
	 * @generated
	 */
	int getGroupId();

	/**
	 * Sets the value of the '{@link transformation.Moveable#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(int value);

	/**
	 * Returns the value of the '<em><b>Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Id</em>' attribute.
	 * @see #setSetId(int)
	 * @see transformation.TransformationPackage#getMoveable_SetId()
	 * @model
	 * @generated
	 */
	int getSetId();

	/**
	 * Sets the value of the '{@link transformation.Moveable#getSetId <em>Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Id</em>' attribute.
	 * @see #getSetId()
	 * @generated
	 */
	void setSetId(int value);

	/**
	 * Returns the value of the '<em><b>Group Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Start</em>' attribute.
	 * @see #setGroupStart(boolean)
	 * @see transformation.TransformationPackage#getMoveable_GroupStart()
	 * @model
	 * @generated
	 */
	boolean isGroupStart();

	/**
	 * Sets the value of the '{@link transformation.Moveable#isGroupStart <em>Group Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Start</em>' attribute.
	 * @see #isGroupStart()
	 * @generated
	 */
	void setGroupStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Group End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group End</em>' attribute.
	 * @see #setGroupEnd(boolean)
	 * @see transformation.TransformationPackage#getMoveable_GroupEnd()
	 * @model
	 * @generated
	 */
	boolean isGroupEnd();

	/**
	 * Sets the value of the '{@link transformation.Moveable#isGroupEnd <em>Group End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group End</em>' attribute.
	 * @see #isGroupEnd()
	 * @generated
	 */
	void setGroupEnd(boolean value);

} // Moveable
