/**
 */
package transformation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import transformation.Blank;
import transformation.RegionTypes;
import transformation.SourceRegion;
import transformation.TransformationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transformation.impl.BlankImpl#getSourceRegion <em>Source Region</em>}</li>
 *   <li>{@link transformation.impl.BlankImpl#getRegionType <em>Region Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlankImpl extends TransformationElementImpl implements Blank {
	/**
	 * The cached value of the '{@link #getSourceRegion() <em>Source Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRegion()
	 * @generated
	 * @ordered
	 */
	protected SourceRegion sourceRegion;

	/**
	 * The default value of the '{@link #getRegionType() <em>Region Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionType()
	 * @generated
	 * @ordered
	 */
	protected static final RegionTypes REGION_TYPE_EDEFAULT = RegionTypes.LINE;

	/**
	 * The cached value of the '{@link #getRegionType() <em>Region Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionType()
	 * @generated
	 * @ordered
	 */
	protected RegionTypes regionType = REGION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationPackage.Literals.BLANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRegion getSourceRegion() {
		return sourceRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRegion(SourceRegion newSourceRegion, NotificationChain msgs) {
		SourceRegion oldSourceRegion = sourceRegion;
		sourceRegion = newSourceRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationPackage.BLANK__SOURCE_REGION, oldSourceRegion, newSourceRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRegion(SourceRegion newSourceRegion) {
		if (newSourceRegion != sourceRegion) {
			NotificationChain msgs = null;
			if (sourceRegion != null)
				msgs = ((InternalEObject)sourceRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationPackage.BLANK__SOURCE_REGION, null, msgs);
			if (newSourceRegion != null)
				msgs = ((InternalEObject)newSourceRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationPackage.BLANK__SOURCE_REGION, null, msgs);
			msgs = basicSetSourceRegion(newSourceRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.BLANK__SOURCE_REGION, newSourceRegion, newSourceRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionTypes getRegionType() {
		return regionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionType(RegionTypes newRegionType) {
		RegionTypes oldRegionType = regionType;
		regionType = newRegionType == null ? REGION_TYPE_EDEFAULT : newRegionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.BLANK__REGION_TYPE, oldRegionType, regionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransformationPackage.BLANK__SOURCE_REGION:
				return basicSetSourceRegion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformationPackage.BLANK__SOURCE_REGION:
				return getSourceRegion();
			case TransformationPackage.BLANK__REGION_TYPE:
				return getRegionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransformationPackage.BLANK__SOURCE_REGION:
				setSourceRegion((SourceRegion)newValue);
				return;
			case TransformationPackage.BLANK__REGION_TYPE:
				setRegionType((RegionTypes)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TransformationPackage.BLANK__SOURCE_REGION:
				setSourceRegion((SourceRegion)null);
				return;
			case TransformationPackage.BLANK__REGION_TYPE:
				setRegionType(REGION_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TransformationPackage.BLANK__SOURCE_REGION:
				return sourceRegion != null;
			case TransformationPackage.BLANK__REGION_TYPE:
				return regionType != REGION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (regionType: ");
		result.append(regionType);
		result.append(')');
		return result.toString();
	}

} //BlankImpl
