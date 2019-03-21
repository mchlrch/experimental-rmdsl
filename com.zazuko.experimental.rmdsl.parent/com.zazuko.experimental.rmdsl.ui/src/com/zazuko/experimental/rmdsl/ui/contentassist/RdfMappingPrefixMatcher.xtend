package com.zazuko.experimental.rmdsl.ui.contentassist

import org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher
import com.google.inject.Inject
import com.google.inject.name.Named

class RdfMappingPrefixMatcher extends FQNPrefixMatcher {
	
	@Inject(optional = true)
	@Named("org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.delimiter")
	char delimiter = '.';
	
	override boolean isCandidateMatchingPrefix(String name, String prefix) {
		val match = super.isCandidateMatchingPrefix(name, prefix);
		
		// respect delimiter in prefix
		// example: discard candidate name `exPLZ.foo` for prefix `ex.`
		if (match && prefix.indexOf(delimiter) >= 0) {
			return name.contains(prefix)
		}
		
		return match;
	}
 
}