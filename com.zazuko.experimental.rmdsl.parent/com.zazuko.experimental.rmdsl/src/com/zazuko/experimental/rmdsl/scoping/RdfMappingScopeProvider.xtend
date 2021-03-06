/*
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.scoping

import com.zazuko.experimental.rmdsl.rdfMapping.Mapping
import com.zazuko.experimental.rmdsl.rdfMapping.RdfMappingPackage
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm
import com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class RdfMappingScopeProvider extends AbstractRdfMappingScopeProvider {

	override getScope(EObject context, EReference reference) {
		if (context instanceof ReferenceValuedTerm &&
			reference == RdfMappingPackage.Literals.REFERENCE_VALUED_TERM__REFERENCE) {
			return scopeForReferenceables(context.eContainer.eContainer as Mapping)

		} else if (context instanceof TemplateValuedTerm &&
			reference == RdfMappingPackage.Literals.TEMPLATE_VALUED_TERM__REFERENCES) {
			val mapping = switch context.eContainer {
				Mapping: context.eContainer as Mapping
				PredicateObjectMapping: context.eContainer.eContainer as Mapping
			}
			return scopeForReferenceables(mapping)

		} else if (context instanceof LinkedResourceTerm &&
			reference == RdfMappingPackage.Literals.LINKED_RESOURCE_TERM__REFERENCES) {
			return scopeForReferenceables(context.eContainer.eContainer as Mapping)

		}
		return super.getScope(context, reference);
	}

	def scopeForReferenceables(Mapping mapping) {
		return Scopes.scopeFor(mapping.source.referencables)
	}
}
