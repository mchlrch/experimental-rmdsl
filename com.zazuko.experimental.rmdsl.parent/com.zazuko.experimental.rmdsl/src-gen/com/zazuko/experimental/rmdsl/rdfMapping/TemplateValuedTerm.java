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
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm#getPattern <em>Pattern</em>}</li>
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
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getTemplateValuedTerm_Pattern()
   * @model
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

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
