/*
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.serializer;

import com.google.inject.Inject;
import com.zazuko.experimental.rmdsl.rdfMapping.Datatype;
import com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition;
import com.zazuko.experimental.rmdsl.rdfMapping.Domainmodel;
import com.zazuko.experimental.rmdsl.rdfMapping.Import;
import com.zazuko.experimental.rmdsl.rdfMapping.LanguageTag;
import com.zazuko.experimental.rmdsl.rdfMapping.LanguageTagDefinition;
import com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.Prefix;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfClass;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty;
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceType;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceTypesDefinition;
import com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary;
import com.zazuko.experimental.rmdsl.services.RdfMappingGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RdfMappingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RdfMappingGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RdfMappingPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RdfMappingPackage.DATATYPE:
				sequence_Datatype(context, (Datatype) semanticObject); 
				return; 
			case RdfMappingPackage.DATATYPES_DEFINITION:
				sequence_DatatypesDefinition(context, (DatatypesDefinition) semanticObject); 
				return; 
			case RdfMappingPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case RdfMappingPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case RdfMappingPackage.LANGUAGE_TAG:
				sequence_LanguageTag(context, (LanguageTag) semanticObject); 
				return; 
			case RdfMappingPackage.LANGUAGE_TAG_DEFINITION:
				sequence_LanguageTagDefinition(context, (LanguageTagDefinition) semanticObject); 
				return; 
			case RdfMappingPackage.LOGICAL_SOURCE:
				sequence_LogicalSource(context, (LogicalSource) semanticObject); 
				return; 
			case RdfMappingPackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case RdfMappingPackage.PREDICATE_OBJECT_MAPPING:
				sequence_PredicateObjectMapping(context, (PredicateObjectMapping) semanticObject); 
				return; 
			case RdfMappingPackage.PREFIX:
				sequence_Prefix(context, (Prefix) semanticObject); 
				return; 
			case RdfMappingPackage.RDF_CLASS:
				sequence_RdfClass(context, (RdfClass) semanticObject); 
				return; 
			case RdfMappingPackage.RDF_PROPERTY:
				sequence_RdfProperty(context, (RdfProperty) semanticObject); 
				return; 
			case RdfMappingPackage.REFERENCE_VALUED_TERM:
				sequence_ReferenceValuedTerm(context, (ReferenceValuedTerm) semanticObject); 
				return; 
			case RdfMappingPackage.REFERENCEABLE:
				sequence_Referenceable(context, (Referenceable) semanticObject); 
				return; 
			case RdfMappingPackage.SOURCE_GROUP:
				sequence_SourceGroup(context, (SourceGroup) semanticObject); 
				return; 
			case RdfMappingPackage.SOURCE_TYPE:
				sequence_SourceType(context, (SourceType) semanticObject); 
				return; 
			case RdfMappingPackage.SOURCE_TYPES_DEFINITION:
				sequence_SourceTypesDefinition(context, (SourceTypesDefinition) semanticObject); 
				return; 
			case RdfMappingPackage.SUBJECT_TYPE_MAPPING:
				sequence_SubjectTypeMapping(context, (SubjectTypeMapping) semanticObject); 
				return; 
			case RdfMappingPackage.TEMPLATE_VALUED_TERM:
				sequence_TemplateValuedTerm(context, (TemplateValuedTerm) semanticObject); 
				return; 
			case RdfMappingPackage.VOCABULARY:
				sequence_Vocabulary(context, (Vocabulary) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Datatype returns Datatype
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Datatype(ISerializationContext context, Datatype semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.DATATYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.DATATYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns DatatypesDefinition
	 *     DatatypesDefinition returns DatatypesDefinition
	 *
	 * Constraint:
	 *     (prefix=Prefix types+=Datatype*)
	 */
	protected void sequence_DatatypesDefinition(ISerializationContext context, DatatypesDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     elements+=Element+
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Import
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns LanguageTagDefinition
	 *     LanguageTagDefinition returns LanguageTagDefinition
	 *
	 * Constraint:
	 *     languageTags+=LanguageTag*
	 */
	protected void sequence_LanguageTagDefinition(ISerializationContext context, LanguageTagDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LanguageTag returns LanguageTag
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_LanguageTag(ISerializationContext context, LanguageTag semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.LANGUAGE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.LANGUAGE_TAG__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLanguageTagAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns LogicalSource
	 *     LogicalSource returns LogicalSource
	 *
	 * Constraint:
	 *     (name=ID type=[SourceType|ID]? source=STRING? iterator=STRING? referencables+=Referenceable*)
	 */
	protected void sequence_LogicalSource(ISerializationContext context, LogicalSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Mapping
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         source=[LogicalSource|QualifiedName] 
	 *         pattern=STRING 
	 *         reference=[Referenceable|QualifiedName] 
	 *         subjectTypeMappings+=SubjectTypeMapping* 
	 *         poMappings+=PredicateObjectMapping*
	 *     )
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PredicateObjectMapping returns PredicateObjectMapping
	 *
	 * Constraint:
	 *     (property=[RdfProperty|QualifiedName] term=ValuedTerm)
	 */
	protected void sequence_PredicateObjectMapping(ISerializationContext context, PredicateObjectMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.PREDICATE_OBJECT_MAPPING__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.PREDICATE_OBJECT_MAPPING__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.PREDICATE_OBJECT_MAPPING__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.PREDICATE_OBJECT_MAPPING__TERM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(RdfMappingPackage.Literals.PREDICATE_OBJECT_MAPPING__PROPERTY, false));
		feeder.accept(grammarAccess.getPredicateObjectMappingAccess().getTermValuedTermParserRuleCall_1_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Prefix returns Prefix
	 *
	 * Constraint:
	 *     (label=STRING iri=STRING)
	 */
	protected void sequence_Prefix(ISerializationContext context, Prefix semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.PREFIX__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.PREFIX__LABEL));
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.PREFIX__IRI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.PREFIX__IRI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrefixAccess().getLabelSTRINGTerminalRuleCall_1_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getPrefixAccess().getIriSTRINGTerminalRuleCall_2_0(), semanticObject.getIri());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RdfClass returns RdfClass
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RdfClass(ISerializationContext context, RdfClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.RDF_CLASS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.RDF_CLASS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRdfClassAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RdfProperty returns RdfProperty
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RdfProperty(ISerializationContext context, RdfProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.RDF_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.RDF_PROPERTY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRdfPropertyAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ValuedTerm returns ReferenceValuedTerm
	 *     ReferenceValuedTerm returns ReferenceValuedTerm
	 *
	 * Constraint:
	 *     (reference=[Referenceable|QualifiedName] (datatype=[Datatype|ID] | languageTag=[LanguageTag|ID])?)
	 */
	protected void sequence_ReferenceValuedTerm(ISerializationContext context, ReferenceValuedTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Referenceable returns Referenceable
	 *
	 * Constraint:
	 *     (name=ID value=STRING?)
	 */
	protected void sequence_Referenceable(ISerializationContext context, Referenceable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SourceGroup
	 *     SourceGroup returns SourceGroup
	 *
	 * Constraint:
	 *     (name=ID type=[SourceType|ID] source=STRING? logicalSources+=LogicalSource*)
	 */
	protected void sequence_SourceGroup(ISerializationContext context, SourceGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SourceType returns SourceType
	 *
	 * Constraint:
	 *     (name=ID referenceFormulation=STRING)
	 */
	protected void sequence_SourceType(ISerializationContext context, SourceType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.SOURCE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.SOURCE_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.SOURCE_TYPE__REFERENCE_FORMULATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.SOURCE_TYPE__REFERENCE_FORMULATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSourceTypeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSourceTypeAccess().getReferenceFormulationSTRINGTerminalRuleCall_2_0(), semanticObject.getReferenceFormulation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SourceTypesDefinition
	 *     SourceTypesDefinition returns SourceTypesDefinition
	 *
	 * Constraint:
	 *     types+=SourceType*
	 */
	protected void sequence_SourceTypesDefinition(ISerializationContext context, SourceTypesDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SubjectTypeMapping returns SubjectTypeMapping
	 *
	 * Constraint:
	 *     type=[RdfClass|QualifiedName]
	 */
	protected void sequence_SubjectTypeMapping(ISerializationContext context, SubjectTypeMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.SUBJECT_TYPE_MAPPING__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.SUBJECT_TYPE_MAPPING__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(RdfMappingPackage.Literals.SUBJECT_TYPE_MAPPING__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ValuedTerm returns TemplateValuedTerm
	 *     TemplateValuedTerm returns TemplateValuedTerm
	 *
	 * Constraint:
	 *     (pattern=STRING reference=[Referenceable|QualifiedName])
	 */
	protected void sequence_TemplateValuedTerm(ISerializationContext context, TemplateValuedTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.TEMPLATE_VALUED_TERM__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.TEMPLATE_VALUED_TERM__PATTERN));
			if (transientValues.isValueTransient(semanticObject, RdfMappingPackage.Literals.VALUED_TERM__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdfMappingPackage.Literals.VALUED_TERM__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTemplateValuedTermAccess().getPatternSTRINGTerminalRuleCall_1_0(), semanticObject.getPattern());
		feeder.accept(grammarAccess.getTemplateValuedTermAccess().getReferenceReferenceableQualifiedNameParserRuleCall_3_0_1(), semanticObject.eGet(RdfMappingPackage.Literals.VALUED_TERM__REFERENCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Vocabulary
	 *     Vocabulary returns Vocabulary
	 *
	 * Constraint:
	 *     (name=ID prefix=Prefix classes+=RdfClass* properties+=RdfProperty*)
	 */
	protected void sequence_Vocabulary(ISerializationContext context, Vocabulary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
