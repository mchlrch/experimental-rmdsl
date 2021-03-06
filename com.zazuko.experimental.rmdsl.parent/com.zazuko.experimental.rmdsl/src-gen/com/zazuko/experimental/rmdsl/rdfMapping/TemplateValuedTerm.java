/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Valued Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm#getTemplate <em>Template</em>}</li>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getTemplateValuedTerm()
 * @model
 * @generated
 */
public interface TemplateValuedTerm extends ValuedTerm
{
  /**
   * Returns the value of the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' attribute.
   * @see #setTemplate(String)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getTemplateValuedTerm_Template()
   * @model
   * @generated
   */
  String getTemplate();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm#getTemplate <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' attribute.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(String value);

  /**
   * Returns the value of the '<em><b>References</b></em>' reference list.
   * The list contents are of type {@link com.zazuko.experimental.rmdsl.rdfMapping.Referenceable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' reference list.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getTemplateValuedTerm_References()
   * @model
   * @generated
   */
  EList<Referenceable> getReferences();

} // TemplateValuedTerm
