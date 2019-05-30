/**
 */
package transformation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transformation.Blank#getSourceRegion <em>Source Region</em>}</li>
 *   <li>{@link transformation.Blank#getRegionType <em>Region Type</em>}</li>
 * </ul>
 *
 * @see transformation.TransformationPackage#getBlank()
 * @model
 * @generated
 */
public interface Blank extends TransformationElement {
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
	 * @see transformation.TransformationPackage#getBlank_SourceRegion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceRegion getSourceRegion();

	/**
	 * Sets the value of the '{@link transformation.Blank#getSourceRegion <em>Source Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Region</em>' containment reference.
	 * @see #getSourceRegion()
	 * @generated
	 */
	void setSourceRegion(SourceRegion value);

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
	 * @see transformation.TransformationPackage#getBlank_RegionType()
	 * @model
	 * @generated
	 */
	RegionTypes getRegionType();

	/**
	 * Sets the value of the '{@link transformation.Blank#getRegionType <em>Region Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Type</em>' attribute.
	 * @see transformation.RegionTypes
	 * @see #getRegionType()
	 * @generated
	 */
	void setRegionType(RegionTypes value);

} // Blank
