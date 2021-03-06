/*
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.parser.antlr;

import com.google.inject.Inject;
import com.zazuko.experimental.rmdsl.parser.antlr.internal.InternalRdfMappingParser;
import com.zazuko.experimental.rmdsl.services.RdfMappingGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RdfMappingParser extends AbstractAntlrParser {

	@Inject
	private RdfMappingGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRdfMappingParser createParser(XtextTokenStream stream) {
		return new InternalRdfMappingParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public RdfMappingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RdfMappingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
