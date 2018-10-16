package com.zazuko.experimental.rmdsl.generator

import com.zazuko.experimental.rmdsl.rdfMapping.Mapping

import static extension com.zazuko.experimental.rmdsl.generator.ModelAccess.*

class R2rmlDialect {

	def staticPrefixes() '''
		PREFIX rr: <http://www.w3.org/ns/r2rml#>
	'''

	def logicalTable(Mapping m) '''
		rr:logicalTable [ rr:tableName "«m.source.sourceResolved»" ];
	'''

	def objectMapReferencePredicate() '''rr:column'''

}
