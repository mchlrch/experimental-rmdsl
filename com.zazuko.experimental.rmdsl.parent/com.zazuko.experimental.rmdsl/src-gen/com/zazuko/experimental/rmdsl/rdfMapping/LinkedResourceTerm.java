/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Resource Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getLinkedResourceTerm()
 * @model
 * @generated
 */
public interface LinkedResourceTerm extends ValuedTerm
{
  /**
   * Returns the value of the '<em><b>Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' reference.
   * @see #setMapping(Mapping)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getLinkedResourceTerm_Mapping()
   * @model
   * @generated
   */
  Mapping getMapping();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm#getMapping <em>Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(Mapping value);

} // LinkedResourceTerm