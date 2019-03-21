package com.zazuko.experimental.rmdsl.generator

import com.zazuko.experimental.rmdsl.rdfMapping.Datatype
import com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition
import com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping
import com.zazuko.experimental.rmdsl.rdfMapping.PrefixHolder
import com.zazuko.experimental.rmdsl.rdfMapping.RdfClass
import com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable
import com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup
import com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary
import java.util.HashSet

class ModelAccess {
	
	def static sourceResolved(LogicalSource it) {
		if (source !== null) {
			source;
		} else {
			sourceGroup?.source;
		}
	}
	
	def static typeResolved(LogicalSource it) {
		if (type !== null) {
			type;
		} else {
			sourceGroup?.type;
		}
	}
	
	def static sourceGroup(LogicalSource it) {
		if (eContainer instanceof SourceGroup) {
			return eContainer as SourceGroup;
		} else {
			return null;
		}
	}
	
	def static vocabulary(RdfClass it) {
		eContainer as Vocabulary;
	}
	
	def static vocabulary(RdfProperty it) {
		eContainer as Vocabulary;
	}
	
	def static prefixesUsed(Mapping it) {
		val result = new HashSet();
		result.addAll(subjectTypeMappings.map[m | m.type.vocabulary]);
		result.addAll(poMappings.map[m | m.property.vocabulary]);
		
		for (PredicateObjectMapping poMapping : poMappings) {
			val term = poMapping.term 
			if (term instanceof ReferenceValuedTerm) {
				if (term.datatype !== null) {
					result.add(term.datatype.datatypesDefinition)
				}				
			}
		}
		
		return result
	}
	
	def static prefixesUsed(Iterable<Mapping> mappings) {
		mappings.map[m | m.prefixesUsed].flatten.toSet;
	}
	
	def static inDeterministicOrder(Iterable<PrefixHolder> prefixHolders) {
		prefixHolders.toSet.toList.sortBy[s | s.prefix.label];
	}
	
	def static datatypesDefinition(Datatype it) {
		eContainer as DatatypesDefinition
	}
	
	def static prefix(Datatype it) {
		datatypesDefinition.prefix
	}
	
	def static valueResolved(Referenceable it) {
		if (value !== null) {
			return value;
		} else {
			return name;
		}
	}
	
}