/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceType#getName <em>Name</em>}</li>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceType#getReferenceFormulation <em>Reference Formulation</em>}</li>
 * </ul>
 *
 * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceType()
 * @model
 * @generated
 */
public interface SourceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reference Formulation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Formulation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Formulation</em>' attribute.
   * @see #setReferenceFormulation(String)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceType_ReferenceFormulation()
   * @model
   * @generated
   */
  String getReferenceFormulation();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceType#getReferenceFormulation <em>Reference Formulation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Formulation</em>' attribute.
   * @see #getReferenceFormulation()
   * @generated
   */
  void setReferenceFormulation(String value);

} // SourceType
