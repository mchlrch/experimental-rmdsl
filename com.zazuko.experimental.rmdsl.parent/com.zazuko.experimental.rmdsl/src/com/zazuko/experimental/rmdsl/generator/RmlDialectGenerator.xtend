package com.zazuko.experimental.rmdsl.generator

import com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable
import com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm
import com.zazuko.experimental.rmdsl.rdfMapping.ValuedTerm
import java.util.List

import static extension com.zazuko.experimental.rmdsl.generator.ModelAccess.*
import java.text.MessageFormat

class RmlDialectGenerator {

	/*
	 * RML broadens R2RML's scope of application beyond that of relational databases.
	 * For details: http://rml.io/RML_R2RML.html
	 * 
	 * In places where RML and R2RML differ, this generator dispatches to the respective dialect. 
	 */
	final extension RmlDialect dialect;

	new(RmlDialect dialect) {
		this.dialect = dialect;
	}
	
	def generateTurtle(Iterable<Mapping> mappings) {
		mappings.prefixes +
		mappings
			.map[triplesMap]
			.join('\n')
	}
	
	def prefixes(Iterable<Mapping> mappings) '''
		«staticPrefixes»
		«FOR prefixHolder:mappings.prefixesUsed.inDeterministicOrder»
			PREFIX «prefixHolder.prefix.label» <«prefixHolder.prefix.iri»>
		«ENDFOR»
		
		# debug output ..
		«FOR m:mappings»
			# «m.name» 
		«ENDFOR»

	'''
	
	def triplesMap(Mapping m) '''
		<#«m.name»>
			«m.logicalSource»
			
			«m.subjectMap()»
			
			«FOR pom : m.poMappings SEPARATOR ";" AFTER "."»
				«pom.predicateObjectMap»
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
	
	def predicateObjectMap(PredicateObjectMapping pom) '''
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
		«objectMapReferencePredicate» "«reference.valueResolved»" ;
		«termMapAnnex»
	'''
	
	def dispatch objectTermMap(TemplateValuedTerm it) '''
		rr:template "«toTemplateString»" ;
	'''
	
	def dispatch objectTermMap(LinkedResourceTerm it) '''
		rr:template "«toTemplateString»" ;
	'''
	
	def termMapAnnex(ReferenceValuedTerm it) '''
		«IF languageTag !== null»
			rr:language "«languageTag.name»" ;
		«ELSEIF datatype !== null»
			rr:datatype «datatype.prefix.label»«datatype.name» ;
		«ENDIF»
	'''
	
	def subjectIri(Mapping it) {
		subjectIriMapping.toTemplateString
	}
	
	def toTemplateString(TemplateValuedTerm it) {		
		template.apply(references);
	}
	
	def toTemplateString(LinkedResourceTerm it) {		
		mapping.subjectIriMapping.template.apply(references);
	}
	
	def apply(String template, List<Referenceable> refs) {
		MessageFormat.format(template, refs.toMessageFormatArguments());
	}
	
	def toMessageFormatArguments(List<Referenceable> refs) {
		refs.map[ref | '''{«ref.valueResolved»}'''].toArray
	}
	
}