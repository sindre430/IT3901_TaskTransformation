/**
 */
package transformation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import transformation.Moveable;
import transformation.RegionTypes;
import transformation.TransformationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moveable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transformation.impl.MoveableImpl#getRegionType <em>Region Type</em>}</li>
 *   <li>{@link transformation.impl.MoveableImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link transformation.impl.MoveableImpl#getSetId <em>Set Id</em>}</li>
 *   <li>{@link transformation.impl.MoveableImpl#isGroupStart <em>Group Start</em>}</li>
 *   <li>{@link transformation.impl.MoveableImpl#isGroupEnd <em>Group End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveableImpl extends TransformationElementImpl implements Moveable {
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
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final int GROUP_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected int groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetId() <em>Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetId()
	 * @generated
	 * @ordered
	 */
	protected static final int SET_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSetId() <em>Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetId()
	 * @generated
	 * @ordered
	 */
	protected int setId = SET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isGroupStart() <em>Group Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUP_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroupStart() <em>Group Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupStart()
	 * @generated
	 * @ordered
	 */
	protected boolean groupStart = GROUP_START_EDEFAULT;

	/**
	 * The default value of the '{@link #isGroupEnd() <em>Group End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUP_END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroupEnd() <em>Group End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean groupEnd = GROUP_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationPackage.Literals.MOVEABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.MOVEABLE__REGION_TYPE, oldRegionType, regionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(int newGroupId) {
		int oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.MOVEABLE__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSetId() {
		return setId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetId(int newSetId) {
		int oldSetId = setId;
		setId = newSetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.MOVEABLE__SET_ID, oldSetId, setId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGroupStart() {
		return groupStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupStart(boolean newGroupStart) {
		boolean oldGroupStart = groupStart;
		groupStart = newGroupStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.MOVEABLE__GROUP_START, oldGroupStart, groupStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGroupEnd() {
		return groupEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupEnd(boolean newGroupEnd) {
		boolean oldGroupEnd = groupEnd;
		groupEnd = newGroupEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.MOVEABLE__GROUP_END, oldGroupEnd, groupEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformationPackage.MOVEABLE__REGION_TYPE:
				return getRegionType();
			case TransformationPackage.MOVEABLE__GROUP_ID:
				return getGroupId();
			case TransformationPackage.MOVEABLE__SET_ID:
				return getSetId();
			case TransformationPackage.MOVEABLE__GROUP_START:
				return isGroupStart();
			case TransformationPackage.MOVEABLE__GROUP_END:
				return isGroupEnd();
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
			case TransformationPackage.MOVEABLE__REGION_TYPE:
				setRegionType((RegionTypes)newValue);
				return;
			case TransformationPackage.MOVEABLE__GROUP_ID:
				setGroupId((Integer)newValue);
				return;
			case TransformationPackage.MOVEABLE__SET_ID:
				setSetId((Integer)newValue);
				return;
			case TransformationPackage.MOVEABLE__GROUP_START:
				setGroupStart((Boolean)newValue);
				return;
			case TransformationPackage.MOVEABLE__GROUP_END:
				setGroupEnd((Boolean)newValue);
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
			case TransformationPackage.MOVEABLE__REGION_TYPE:
				setRegionType(REGION_TYPE_EDEFAULT);
				return;
			case TransformationPackage.MOVEABLE__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case TransformationPackage.MOVEABLE__SET_ID:
				setSetId(SET_ID_EDEFAULT);
				return;
			case TransformationPackage.MOVEABLE__GROUP_START:
				setGroupStart(GROUP_START_EDEFAULT);
				return;
			case TransformationPackage.MOVEABLE__GROUP_END:
				setGroupEnd(GROUP_END_EDEFAULT);
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
			case TransformationPackage.MOVEABLE__REGION_TYPE:
				return regionType != REGION_TYPE_EDEFAULT;
			case TransformationPackage.MOVEABLE__GROUP_ID:
				return groupId != GROUP_ID_EDEFAULT;
			case TransformationPackage.MOVEABLE__SET_ID:
				return setId != SET_ID_EDEFAULT;
			case TransformationPackage.MOVEABLE__GROUP_START:
				return groupStart != GROUP_START_EDEFAULT;
			case TransformationPackage.MOVEABLE__GROUP_END:
				return groupEnd != GROUP_END_EDEFAULT;
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
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", setId: ");
		result.append(setId);
		result.append(", groupStart: ");
		result.append(groupStart);
		result.append(", groupEnd: ");
		result.append(groupEnd);
		result.append(')');
		return result.toString();
	}

} //MoveableImpl
