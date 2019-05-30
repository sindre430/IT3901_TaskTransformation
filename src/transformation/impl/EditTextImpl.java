/**
 */
package transformation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import transformation.Content;
import transformation.EditText;
import transformation.SourceRegion;
import transformation.TransformationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transformation.impl.EditTextImpl#getSourceRegion <em>Source Region</em>}</li>
 *   <li>{@link transformation.impl.EditTextImpl#getReplacement <em>Replacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditTextImpl extends TransformationElementImpl implements EditText {
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
	 * The cached value of the '{@link #getReplacement() <em>Replacement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacement()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> replacement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationPackage.Literals.EDIT_TEXT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationPackage.EDIT_TEXT__SOURCE_REGION, oldSourceRegion, newSourceRegion);
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
				msgs = ((InternalEObject)sourceRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationPackage.EDIT_TEXT__SOURCE_REGION, null, msgs);
			if (newSourceRegion != null)
				msgs = ((InternalEObject)newSourceRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationPackage.EDIT_TEXT__SOURCE_REGION, null, msgs);
			msgs = basicSetSourceRegion(newSourceRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationPackage.EDIT_TEXT__SOURCE_REGION, newSourceRegion, newSourceRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getReplacement() {
		if (replacement == null) {
			replacement = new EObjectContainmentEList<Content>(Content.class, this, TransformationPackage.EDIT_TEXT__REPLACEMENT);
		}
		return replacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransformationPackage.EDIT_TEXT__SOURCE_REGION:
				return basicSetSourceRegion(null, msgs);
			case TransformationPackage.EDIT_TEXT__REPLACEMENT:
				return ((InternalEList<?>)getReplacement()).basicRemove(otherEnd, msgs);
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
			case TransformationPackage.EDIT_TEXT__SOURCE_REGION:
				return getSourceRegion();
			case TransformationPackage.EDIT_TEXT__REPLACEMENT:
				return getReplacement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransformationPackage.EDIT_TEXT__SOURCE_REGION:
				setSourceRegion((SourceRegion)newValue);
				return;
			case TransformationPackage.EDIT_TEXT__REPLACEMENT:
				getReplacement().clear();
				getReplacement().addAll((Collection<? extends Content>)newValue);
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
			case TransformationPackage.EDIT_TEXT__SOURCE_REGION:
				setSourceRegion((SourceRegion)null);
				return;
			case TransformationPackage.EDIT_TEXT__REPLACEMENT:
				getReplacement().clear();
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
			case TransformationPackage.EDIT_TEXT__SOURCE_REGION:
				return sourceRegion != null;
			case TransformationPackage.EDIT_TEXT__REPLACEMENT:
				return replacement != null && !replacement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EditTextImpl
