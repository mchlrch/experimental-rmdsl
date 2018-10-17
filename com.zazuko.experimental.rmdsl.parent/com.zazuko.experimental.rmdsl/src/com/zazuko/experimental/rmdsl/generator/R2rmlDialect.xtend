package com.zazuko.experimental.rmdsl.generator

import com.zazuko.experimental.rmdsl.rdfMapping.Mapping

import static extension com.zazuko.experimental.rmdsl.generator.ModelAccess.*

class R2rmlDialect extends RmlDialect {

	override staticPrefixes() '''
		PREFIX rr: <http://www.w3.org/ns/r2rml#>
	'''

	override logicalSource(Mapping m) '''
		rr:logicalTable [ rr:tableName "«m.source.sourceResolved»" ];
	'''

	override objectMapReferencePredicate() '''rr:column'''

}
