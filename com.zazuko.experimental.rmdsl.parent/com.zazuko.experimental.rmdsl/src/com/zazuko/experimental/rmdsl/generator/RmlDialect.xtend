package com.zazuko.experimental.rmdsl.generator

import com.zazuko.experimental.rmdsl.rdfMapping.Mapping

import static extension com.zazuko.experimental.rmdsl.generator.ModelAccess.*

class RmlDialect {

	def staticPrefixes() '''
		PREFIX rr: <http://www.w3.org/ns/r2rml#>
		PREFIX rml: <http://semweb.mmlab.be/ns/rml#>
		PREFIX ql: <http://semweb.mmlab.be/ns/ql#>
	'''

	// TODO: rml:iterator
	def logicalSource(Mapping m) '''
		rml:logicalSource [
			rml:source "«m.source.sourceResolved»" ;
			rml:referenceFormulation «m.source.typeResolved?.referenceFormulation»
		];
	'''

	def objectMapReferencePredicate() '''rml:reference'''

}
