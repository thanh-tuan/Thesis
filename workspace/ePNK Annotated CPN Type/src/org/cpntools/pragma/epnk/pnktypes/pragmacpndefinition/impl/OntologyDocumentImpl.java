/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.OntologyDocumentImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.OntologyDocumentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.OntologyDocumentImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyDocumentImpl extends EObjectImpl implements OntologyDocument {
	/**
	 * The default value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected static final String IRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected String iri = IRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PragmacpndefinitionPackage.Literals.ONTOLOGY_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIri() {
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIri(String newIri) {
		String oldIri = iri;
		iri = newIri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__IRI, oldIri, iri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmaticsOntology getOntology() {
		if (eContainerFeatureID() != PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY) return null;
		return (PragmaticsOntology)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntology(PragmaticsOntology newOntology, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOntology, PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntology(PragmaticsOntology newOntology) {
		if (newOntology != eInternalContainer() || (eContainerFeatureID() != PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY && newOntology != null)) {
			if (EcoreUtil.isAncestor(this, newOntology))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOntology != null)
				msgs = ((InternalEObject)newOntology).eInverseAdd(this, PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS, PragmaticsOntology.class, msgs);
			msgs = basicSetOntology(newOntology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY, newOntology, newOntology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOntology((PragmaticsOntology)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
				return basicSetOntology(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
				return eInternalContainer().eInverseRemove(this, PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS, PragmaticsOntology.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__IRI:
				return getIri();
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__PATH:
				return getPath();
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
				return getOntology();
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
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__IRI:
				setIri((String)newValue);
				return;
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__PATH:
				setPath((String)newValue);
				return;
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
				setOntology((PragmaticsOntology)newValue);
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
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__IRI:
				setIri(IRI_EDEFAULT);
				return;
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
				setOntology((PragmaticsOntology)null);
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
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__IRI:
				return IRI_EDEFAULT == null ? iri != null : !IRI_EDEFAULT.equals(iri);
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY:
				return getOntology() != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iri: ");
		result.append(iri);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //OntologyDocumentImpl
