/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping.impl;

import com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage;
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked Resource Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.impl.LinkedResourceTermImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.impl.LinkedResourceTermImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkedResourceTermImpl extends ValuedTermImpl implements LinkedResourceTerm
{
  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected Mapping mapping;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Referenceable> references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkedResourceTermImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RdfMappingPackage.Literals.LINKED_RESOURCE_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getMapping()
  {
    if (mapping != null && mapping.eIsProxy())
    {
      InternalEObject oldMapping = (InternalEObject)mapping;
      mapping = (Mapping)eResolveProxy(oldMapping);
      if (mapping != oldMapping)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfMappingPackage.LINKED_RESOURCE_TERM__MAPPING, oldMapping, mapping));
      }
    }
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping basicGetMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(Mapping newMapping)
  {
    Mapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdfMappingPackage.LINKED_RESOURCE_TERM__MAPPING, oldMapping, mapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Referenceable> getReferences()
  {
    if (references == null)
    {
      references = new EObjectResolvingEList<Referenceable>(Referenceable.class, this, RdfMappingPackage.LINKED_RESOURCE_TERM__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RdfMappingPackage.LINKED_RESOURCE_TERM__MAPPING:
        if (resolve) return getMapping();
        return basicGetMapping();
      case RdfMappingPackage.LINKED_RESOURCE_TERM__REFERENCES:
        return getReferences();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RdfMappingPackage.LINKED_RESOURCE_TERM__MAPPING:
        setMapping((Mapping)newValue);
        return;
      case RdfMappingPackage.LINKED_RESOURCE_TERM__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Referenceable>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RdfMappingPackage.LINKED_RESOURCE_TERM__MAPPING:
        setMapping((Mapping)null);
        return;
      case RdfMappingPackage.LINKED_RESOURCE_TERM__REFERENCES:
        getReferences().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RdfMappingPackage.LINKED_RESOURCE_TERM__MAPPING:
        return mapping != null;
      case RdfMappingPackage.LINKED_RESOURCE_TERM__REFERENCES:
        return references != null && !references.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LinkedResourceTermImpl
