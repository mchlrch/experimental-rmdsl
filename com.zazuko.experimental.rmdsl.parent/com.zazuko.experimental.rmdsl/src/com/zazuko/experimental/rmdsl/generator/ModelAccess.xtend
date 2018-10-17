package com.zazuko.experimental.rmdsl.generator

import com.zazuko.experimental.rmdsl.rdfMapping.Datatype
import com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition
import com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping
import com.zazuko.experimental.rmdsl.rdfMapping.RdfClass
import com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty
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
	
	def static vocabulariesUsed(Mapping it) {
		val result = new HashSet();
		result.addAll(subjectTypeMappings.map[m | m.type.vocabulary]);
		result.addAll(poMappings.map[m | m.property.vocabulary]);
		result
	}
	
	def static vocabulariesUsed(Iterable<Mapping> mappings) {
		mappings.map[m | m.vocabulariesUsed].flatten.toSet;
	}
	
	def static inDeterministicOrder(Iterable<Vocabulary> vocabularies) {
		vocabularies.toSet.toList.sortBy[s | s.prefix.label];
	}
	
	def static prefix(Datatype it) {
		(eContainer as DatatypesDefinition).prefix
	}
	
	def static valueResolved(Referenceable it) {
		if (value !== null) {
			return value;
		} else {
			return name;
		}
	}
	
}