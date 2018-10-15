/*
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.generator

import com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping
import com.zazuko.experimental.rmdsl.rdfMapping.RdfClass
import com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty
import com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup
import com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary
import java.text.MessageFormat
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.HashSet
import com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition
import com.zazuko.experimental.rmdsl.rdfMapping.Datatype
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable
import com.zazuko.experimental.rmdsl.rdfMapping.ValuedTerm
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm
import com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RdfMappingGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val Iterable<Mapping> mappings = resource.allContents.filter(Mapping).toList
		fsa.generateFile('rml.ttl', rml(mappings))
		fsa.generateFile('r2rml.ttl', r2rml(mappings))
	}
	
	def rml(Iterable<Mapping> mappings) {
		mappings.prefixes +
		mappings
			.map[rmlTriplesMap]
			.join('\n')
	}
	
	def r2rml(Iterable<Mapping> mappings) {
		mappings.prefixes +
		mappings
			.map[r2rmlTriplesMap]
			.join('\n')
	}
	
	def prefixes(Iterable<Mapping> mappings) '''
		PREFIX rr: <http://www.w3.org/ns/r2rml#>
		PREFIX rml: <http://semweb.mmlab.be/ns/rml#>
		PREFIX ql: <http://semweb.mmlab.be/ns/ql#>
		«FOR prefixStmt:mappings.vocabulariesUsed.toPrefixStatements»
			«prefixStmt» 
		«ENDFOR»
		
		# debug output ..
		«FOR m:mappings»
			# «m.name» 
		«ENDFOR»

	'''
	
	def rmlTriplesMap(Mapping m) '''
		<#«m.name»>
			rml:logicalSource [  
				rml:source "«m.source.sourceResolved»" ;
««« TODO        rml:iterator "/transport/bus";
				rml:referenceFormulation «m.source.typeResolved?.referenceFormulation»
			];

			«m.subjectMap()»
		
			«FOR pom : m.poMappings»
				«pom.rmlPredicateObjectMap»
			«ENDFOR»
	'''
	
	def r2rmlTriplesMap(Mapping m) '''
		<#«m.name»>
		    rr:logicalTable [ rr:tableName "«m.source.sourceResolved»" ];
		    «m.subjectMap()»
		    
		    «FOR pom : m.poMappings SEPARATOR ";" AFTER "."»
		    	«pom.r2rmlPredicateObjectMap»
			«ENDFOR»
	'''
	
	def subjectMap(Mapping m) '''
		rr:subjectMap [
			rr:template "«m.subjectIri»";
			«FOR stm : m.subjectTypeMappings»
				rr:class «stm.type.vocabulary.prefix.label»«stm.type.name» ;
			«ENDFOR»	
		];
	'''
	
	def rmlPredicateObjectMap(PredicateObjectMapping pom) '''
		rr:predicateObjectMap [
			rr:predicate «pom.property.vocabulary.prefix.label»«pom.property.name» ;
			rr:objectMap [
«««				rml:reference "«pom.reference.valueResolved»" ;
«««				«pom.termMapAnnex»
			].
		];
	'''
	
	def r2rmlPredicateObjectMap(PredicateObjectMapping pom) '''
		rr:predicateObjectMap [
			rr:predicate «pom.property.vocabulary.prefix.label»«pom.property.name» ;
			rr:objectMap [
				«pom.term.objectTermMap»
			];
		]
	'''
	
	def dispatch objectTermMap(ValuedTerm it) '''
		# TODO: implementation missing for «class.name»
	'''
	
	def dispatch objectTermMap(ReferenceValuedTerm it) '''
		rr:column "«reference.valueResolved»" ;
		«termMapAnnex»
	'''
	
	def dispatch objectTermMap(TemplateValuedTerm it) '''
		rr:template "«toTemplateString»" ;
	'''
	
	def termMapAnnex(ReferenceValuedTerm it) '''
		«IF languageTag !== null»
			rr:language "«languageTag.name»" ;
		«ELSEIF datatype !== null»
			rr:datatype «datatype.prefix.label»«datatype.name» ;
		«ENDIF»		
	'''
	
	def subjectIri(Mapping m) {		
		MessageFormat.format(m.pattern, '''{«m.reference.valueResolved»}''');
	}
	
	def toTemplateString(TemplateValuedTerm it) {		
		MessageFormat.format(pattern, '''{«reference.valueResolved»}''');
	}
	
	def sourceResolved(LogicalSource it) {
		if (source !== null) {
			source;
		} else {
			(eContainer as SourceGroup)?.source;
		}
	}
	
	def typeResolved(LogicalSource it) {
		if (type !== null) {
			type;
		} else {
			(eContainer as SourceGroup)?.type;
		}
	}
	
	def vocabulary(RdfClass it) {
		eContainer as Vocabulary;
	}
	
	def vocabulary(RdfProperty it) {
		eContainer as Vocabulary;
	}
	
	def vocabulariesUsed(Mapping it) {
		val result = new HashSet();
		result.addAll(subjectTypeMappings.map[m | m.type.vocabulary]);
		result.addAll(poMappings.map[m | m.property.vocabulary]);
		result
	}
	
	def vocabulariesUsed(Iterable<Mapping> mappings) {
		mappings.map[m | m.vocabulariesUsed].flatten;
	}
	
	// eliminate duplicate prefix entries on string level
	def toPrefixStatements(Iterable<Vocabulary> vocabularies) {
		vocabularies.map[voc | voc.prefixStatement.toString].toSet.toList.sortBy[s | s];
	}
	def prefixStatement(Vocabulary voc) '''PREFIX «voc.prefix.label» <«voc.prefix.iri»>'''
	
	def prefix(Datatype it) {
		(eContainer as DatatypesDefinition).prefix
	}
	
	def valueResolved(Referenceable it) {
		if (value !== null) {
			return value;
		} else {
			return name;
		}
	}
}
