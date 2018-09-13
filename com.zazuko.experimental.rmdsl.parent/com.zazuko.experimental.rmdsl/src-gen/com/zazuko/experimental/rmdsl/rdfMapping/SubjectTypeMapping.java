/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSubjectTypeMapping()
 * @model
 * @generated
 */
public interface SubjectTypeMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(RdfClass)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSubjectTypeMapping_Type()
   * @model
   * @generated
   */
  RdfClass getType();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(RdfClass value);

} // SubjectTypeMapping
