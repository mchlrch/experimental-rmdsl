/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatypes Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getDatatypesDefinition()
 * @model
 * @generated
 */
public interface DatatypesDefinition extends PrefixHolder
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link com.zazuko.experimental.rmdsl.rdfMapping.Datatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getDatatypesDefinition_Types()
   * @model containment="true"
   * @generated
   */
  EList<Datatype> getTypes();

} // DatatypesDefinition
