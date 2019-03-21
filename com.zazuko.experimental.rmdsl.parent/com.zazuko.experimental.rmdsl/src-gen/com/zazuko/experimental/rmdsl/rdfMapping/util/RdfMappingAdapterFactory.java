/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.rdfMapping.util;

import com.zazuko.experimental.rmdsl.rdfMapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage
 * @generated
 */
public class RdfMappingAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RdfMappingPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RdfMappingAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RdfMappingPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RdfMappingSwitch<Adapter> modelSwitch =
    new RdfMappingSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseSourceTypesDefinition(SourceTypesDefinition object)
      {
        return createSourceTypesDefinitionAdapter();
      }
      @Override
      public Adapter caseSourceType(SourceType object)
      {
        return createSourceTypeAdapter();
      }
      @Override
      public Adapter caseDatatypesDefinition(DatatypesDefinition object)
      {
        return createDatatypesDefinitionAdapter();
      }
      @Override
      public Adapter caseDatatype(Datatype object)
      {
        return createDatatypeAdapter();
      }
      @Override
      public Adapter caseLanguageTagDefinition(LanguageTagDefinition object)
      {
        return createLanguageTagDefinitionAdapter();
      }
      @Override
      public Adapter caseLanguageTag(LanguageTag object)
      {
        return createLanguageTagAdapter();
      }
      @Override
      public Adapter caseSourceGroup(SourceGroup object)
      {
        return createSourceGroupAdapter();
      }
      @Override
      public Adapter caseLogicalSource(LogicalSource object)
      {
        return createLogicalSourceAdapter();
      }
      @Override
      public Adapter caseReferenceable(Referenceable object)
      {
        return createReferenceableAdapter();
      }
      @Override
      public Adapter caseVocabulary(Vocabulary object)
      {
        return createVocabularyAdapter();
      }
      @Override
      public Adapter casePrefixHolder(PrefixHolder object)
      {
        return createPrefixHolderAdapter();
      }
      @Override
      public Adapter casePrefix(Prefix object)
      {
        return createPrefixAdapter();
      }
      @Override
      public Adapter caseRdfProperty(RdfProperty object)
      {
        return createRdfPropertyAdapter();
      }
      @Override
      public Adapter caseRdfClass(RdfClass object)
      {
        return createRdfClassAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseSubjectTypeMapping(SubjectTypeMapping object)
      {
        return createSubjectTypeMappingAdapter();
      }
      @Override
      public Adapter casePredicateObjectMapping(PredicateObjectMapping object)
      {
        return createPredicateObjectMappingAdapter();
      }
      @Override
      public Adapter caseValuedTerm(ValuedTerm object)
      {
        return createValuedTermAdapter();
      }
      @Override
      public Adapter caseReferenceValuedTerm(ReferenceValuedTerm object)
      {
        return createReferenceValuedTermAdapter();
      }
      @Override
      public Adapter caseTemplateValuedTerm(TemplateValuedTerm object)
      {
        return createTemplateValuedTermAdapter();
      }
      @Override
      public Adapter caseLinkedResourceTerm(LinkedResourceTerm object)
      {
        return createLinkedResourceTermAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceTypesDefinition <em>Source Types Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.SourceTypesDefinition
   * @generated
   */
  public Adapter createSourceTypesDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceType <em>Source Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.SourceType
   * @generated
   */
  public Adapter createSourceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition <em>Datatypes Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition
   * @generated
   */
  public Adapter createDatatypesDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Datatype
   * @generated
   */
  public Adapter createDatatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.LanguageTagDefinition <em>Language Tag Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.LanguageTagDefinition
   * @generated
   */
  public Adapter createLanguageTagDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.LanguageTag <em>Language Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.LanguageTag
   * @generated
   */
  public Adapter createLanguageTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup <em>Source Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup
   * @generated
   */
  public Adapter createSourceGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource <em>Logical Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource
   * @generated
   */
  public Adapter createLogicalSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Referenceable <em>Referenceable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Referenceable
   * @generated
   */
  public Adapter createReferenceableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary <em>Vocabulary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary
   * @generated
   */
  public Adapter createVocabularyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.PrefixHolder <em>Prefix Holder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.PrefixHolder
   * @generated
   */
  public Adapter createPrefixHolderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Prefix
   * @generated
   */
  public Adapter createPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty <em>Rdf Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty
   * @generated
   */
  public Adapter createRdfPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.RdfClass <em>Rdf Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.RdfClass
   * @generated
   */
  public Adapter createRdfClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping <em>Subject Type Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping
   * @generated
   */
  public Adapter createSubjectTypeMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping <em>Predicate Object Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping
   * @generated
   */
  public Adapter createPredicateObjectMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.ValuedTerm <em>Valued Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.ValuedTerm
   * @generated
   */
  public Adapter createValuedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm <em>Reference Valued Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm
   * @generated
   */
  public Adapter createReferenceValuedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm <em>Template Valued Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm
   * @generated
   */
  public Adapter createTemplateValuedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm <em>Linked Resource Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm
   * @generated
   */
  public Adapter createLinkedResourceTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.zazuko.experimental.rmdsl.rdfMapping.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.zazuko.experimental.rmdsl.rdfMapping.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RdfMappingAdapterFactory
