/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup#getType <em>Type</em>}</li>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup#getSource <em>Source</em>}</li>
 *   <li>{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup#getLogicalSources <em>Logical Sources</em>}</li>
 * </ul>
 *
 * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceGroup()
 * @model
 * @generated
 */
public interface SourceGroup extends Element
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
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(SourceType)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceGroup_Type()
   * @model
   * @generated
   */
  SourceType getType();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(SourceType value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceGroup_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Logical Sources</b></em>' containment reference list.
   * The list contents are of type {@link com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Sources</em>' containment reference list.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage#getSourceGroup_LogicalSources()
   * @model containment="true"
   * @generated
   */
  EList<LogicalSource> getLogicalSources();

} // SourceGroup
