/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping.impl;

import com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage;
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable;
import com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Valued Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.impl.TemplateValuedTermImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.impl.TemplateValuedTermImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateValuedTermImpl extends ValuedTermImpl implements TemplateValuedTerm
{
  /**
   * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected static final String TEMPLATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected String template = TEMPLATE_EDEFAULT;

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
  protected TemplateValuedTermImpl()
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
    return RdfMappingPackage.Literals.TEMPLATE_VALUED_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(String newTemplate)
  {
    String oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdfMappingPackage.TEMPLATE_VALUED_TERM__TEMPLATE, oldTemplate, template));
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
      references = new EObjectResolvingEList<Referenceable>(Referenceable.class, this, RdfMappingPackage.TEMPLATE_VALUED_TERM__REFERENCES);
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
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__TEMPLATE:
        return getTemplate();
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__REFERENCES:
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
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__TEMPLATE:
        setTemplate((String)newValue);
        return;
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__REFERENCES:
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
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__TEMPLATE:
        setTemplate(TEMPLATE_EDEFAULT);
        return;
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__REFERENCES:
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
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__TEMPLATE:
        return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
      case RdfMappingPackage.TEMPLATE_VALUED_TERM__REFERENCES:
        return references != null && !references.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (template: ");
    result.append(template);
    result.append(')');
    return result.toString();
  }

} //TemplateValuedTermImpl
