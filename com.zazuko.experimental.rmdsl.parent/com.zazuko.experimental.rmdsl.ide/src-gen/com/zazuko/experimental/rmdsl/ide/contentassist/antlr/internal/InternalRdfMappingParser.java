package com.zazuko.experimental.rmdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.zazuko.experimental.rmdsl.services.RdfMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdfMappingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'source-group'", "'type'", "';'", "'source'", "'logical-source'", "'referenceables'", "'iterator'", "'vocabulary'", "'classes'", "'properties'", "'prefix'", "'map'", "'from'", "'subject'", "'template'", "'with'", "'types'", "'import'", "'.*'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRdfMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRdfMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRdfMappingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRdfMapping.g"; }


    	private RdfMappingGrammarAccess grammarAccess;

    	public void setGrammarAccess(RdfMappingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalRdfMapping.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalRdfMapping.g:54:1: ( ruleDomainmodel EOF )
            // InternalRdfMapping.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalRdfMapping.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalRdfMapping.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalRdfMapping.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalRdfMapping.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalRdfMapping.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==19||LA1_0==22||LA1_0==26||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRdfMapping.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleElement"
    // InternalRdfMapping.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalRdfMapping.g:79:1: ( ruleElement EOF )
            // InternalRdfMapping.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalRdfMapping.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalRdfMapping.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalRdfMapping.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalRdfMapping.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalRdfMapping.g:94:3: ( rule__Element__Alternatives )
            // InternalRdfMapping.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleSourceTypesDefinition"
    // InternalRdfMapping.g:103:1: entryRuleSourceTypesDefinition : ruleSourceTypesDefinition EOF ;
    public final void entryRuleSourceTypesDefinition() throws RecognitionException {
        try {
            // InternalRdfMapping.g:104:1: ( ruleSourceTypesDefinition EOF )
            // InternalRdfMapping.g:105:1: ruleSourceTypesDefinition EOF
            {
             before(grammarAccess.getSourceTypesDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceTypesDefinition();

            state._fsp--;

             after(grammarAccess.getSourceTypesDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceTypesDefinition"


    // $ANTLR start "ruleSourceTypesDefinition"
    // InternalRdfMapping.g:112:1: ruleSourceTypesDefinition : ( ( rule__SourceTypesDefinition__Group__0 ) ) ;
    public final void ruleSourceTypesDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:116:2: ( ( ( rule__SourceTypesDefinition__Group__0 ) ) )
            // InternalRdfMapping.g:117:2: ( ( rule__SourceTypesDefinition__Group__0 ) )
            {
            // InternalRdfMapping.g:117:2: ( ( rule__SourceTypesDefinition__Group__0 ) )
            // InternalRdfMapping.g:118:3: ( rule__SourceTypesDefinition__Group__0 )
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getGroup()); 
            // InternalRdfMapping.g:119:3: ( rule__SourceTypesDefinition__Group__0 )
            // InternalRdfMapping.g:119:4: rule__SourceTypesDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceTypesDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceTypesDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceTypesDefinition"


    // $ANTLR start "entryRuleSourceType"
    // InternalRdfMapping.g:128:1: entryRuleSourceType : ruleSourceType EOF ;
    public final void entryRuleSourceType() throws RecognitionException {
        try {
            // InternalRdfMapping.g:129:1: ( ruleSourceType EOF )
            // InternalRdfMapping.g:130:1: ruleSourceType EOF
            {
             before(grammarAccess.getSourceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceType();

            state._fsp--;

             after(grammarAccess.getSourceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceType"


    // $ANTLR start "ruleSourceType"
    // InternalRdfMapping.g:137:1: ruleSourceType : ( ( rule__SourceType__Group__0 ) ) ;
    public final void ruleSourceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:141:2: ( ( ( rule__SourceType__Group__0 ) ) )
            // InternalRdfMapping.g:142:2: ( ( rule__SourceType__Group__0 ) )
            {
            // InternalRdfMapping.g:142:2: ( ( rule__SourceType__Group__0 ) )
            // InternalRdfMapping.g:143:3: ( rule__SourceType__Group__0 )
            {
             before(grammarAccess.getSourceTypeAccess().getGroup()); 
            // InternalRdfMapping.g:144:3: ( rule__SourceType__Group__0 )
            // InternalRdfMapping.g:144:4: rule__SourceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceType"


    // $ANTLR start "entryRuleSourceGroup"
    // InternalRdfMapping.g:153:1: entryRuleSourceGroup : ruleSourceGroup EOF ;
    public final void entryRuleSourceGroup() throws RecognitionException {
        try {
            // InternalRdfMapping.g:154:1: ( ruleSourceGroup EOF )
            // InternalRdfMapping.g:155:1: ruleSourceGroup EOF
            {
             before(grammarAccess.getSourceGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceGroup();

            state._fsp--;

             after(grammarAccess.getSourceGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceGroup"


    // $ANTLR start "ruleSourceGroup"
    // InternalRdfMapping.g:162:1: ruleSourceGroup : ( ( rule__SourceGroup__Group__0 ) ) ;
    public final void ruleSourceGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:166:2: ( ( ( rule__SourceGroup__Group__0 ) ) )
            // InternalRdfMapping.g:167:2: ( ( rule__SourceGroup__Group__0 ) )
            {
            // InternalRdfMapping.g:167:2: ( ( rule__SourceGroup__Group__0 ) )
            // InternalRdfMapping.g:168:3: ( rule__SourceGroup__Group__0 )
            {
             before(grammarAccess.getSourceGroupAccess().getGroup()); 
            // InternalRdfMapping.g:169:3: ( rule__SourceGroup__Group__0 )
            // InternalRdfMapping.g:169:4: rule__SourceGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceGroup"


    // $ANTLR start "entryRuleLogicalSource"
    // InternalRdfMapping.g:178:1: entryRuleLogicalSource : ruleLogicalSource EOF ;
    public final void entryRuleLogicalSource() throws RecognitionException {
        try {
            // InternalRdfMapping.g:179:1: ( ruleLogicalSource EOF )
            // InternalRdfMapping.g:180:1: ruleLogicalSource EOF
            {
             before(grammarAccess.getLogicalSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalSource();

            state._fsp--;

             after(grammarAccess.getLogicalSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalSource"


    // $ANTLR start "ruleLogicalSource"
    // InternalRdfMapping.g:187:1: ruleLogicalSource : ( ( rule__LogicalSource__Group__0 ) ) ;
    public final void ruleLogicalSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:191:2: ( ( ( rule__LogicalSource__Group__0 ) ) )
            // InternalRdfMapping.g:192:2: ( ( rule__LogicalSource__Group__0 ) )
            {
            // InternalRdfMapping.g:192:2: ( ( rule__LogicalSource__Group__0 ) )
            // InternalRdfMapping.g:193:3: ( rule__LogicalSource__Group__0 )
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup()); 
            // InternalRdfMapping.g:194:3: ( rule__LogicalSource__Group__0 )
            // InternalRdfMapping.g:194:4: rule__LogicalSource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalSource"


    // $ANTLR start "entryRuleReferenceable"
    // InternalRdfMapping.g:203:1: entryRuleReferenceable : ruleReferenceable EOF ;
    public final void entryRuleReferenceable() throws RecognitionException {
        try {
            // InternalRdfMapping.g:204:1: ( ruleReferenceable EOF )
            // InternalRdfMapping.g:205:1: ruleReferenceable EOF
            {
             before(grammarAccess.getReferenceableRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceable();

            state._fsp--;

             after(grammarAccess.getReferenceableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceable"


    // $ANTLR start "ruleReferenceable"
    // InternalRdfMapping.g:212:1: ruleReferenceable : ( ( rule__Referenceable__Group__0 ) ) ;
    public final void ruleReferenceable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:216:2: ( ( ( rule__Referenceable__Group__0 ) ) )
            // InternalRdfMapping.g:217:2: ( ( rule__Referenceable__Group__0 ) )
            {
            // InternalRdfMapping.g:217:2: ( ( rule__Referenceable__Group__0 ) )
            // InternalRdfMapping.g:218:3: ( rule__Referenceable__Group__0 )
            {
             before(grammarAccess.getReferenceableAccess().getGroup()); 
            // InternalRdfMapping.g:219:3: ( rule__Referenceable__Group__0 )
            // InternalRdfMapping.g:219:4: rule__Referenceable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Referenceable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceable"


    // $ANTLR start "entryRuleVocabulary"
    // InternalRdfMapping.g:228:1: entryRuleVocabulary : ruleVocabulary EOF ;
    public final void entryRuleVocabulary() throws RecognitionException {
        try {
            // InternalRdfMapping.g:229:1: ( ruleVocabulary EOF )
            // InternalRdfMapping.g:230:1: ruleVocabulary EOF
            {
             before(grammarAccess.getVocabularyRule()); 
            pushFollow(FOLLOW_1);
            ruleVocabulary();

            state._fsp--;

             after(grammarAccess.getVocabularyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVocabulary"


    // $ANTLR start "ruleVocabulary"
    // InternalRdfMapping.g:237:1: ruleVocabulary : ( ( rule__Vocabulary__Group__0 ) ) ;
    public final void ruleVocabulary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:241:2: ( ( ( rule__Vocabulary__Group__0 ) ) )
            // InternalRdfMapping.g:242:2: ( ( rule__Vocabulary__Group__0 ) )
            {
            // InternalRdfMapping.g:242:2: ( ( rule__Vocabulary__Group__0 ) )
            // InternalRdfMapping.g:243:3: ( rule__Vocabulary__Group__0 )
            {
             before(grammarAccess.getVocabularyAccess().getGroup()); 
            // InternalRdfMapping.g:244:3: ( rule__Vocabulary__Group__0 )
            // InternalRdfMapping.g:244:4: rule__Vocabulary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVocabularyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVocabulary"


    // $ANTLR start "entryRulePrefix"
    // InternalRdfMapping.g:253:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalRdfMapping.g:254:1: ( rulePrefix EOF )
            // InternalRdfMapping.g:255:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalRdfMapping.g:262:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:266:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalRdfMapping.g:267:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalRdfMapping.g:267:2: ( ( rule__Prefix__Group__0 ) )
            // InternalRdfMapping.g:268:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalRdfMapping.g:269:3: ( rule__Prefix__Group__0 )
            // InternalRdfMapping.g:269:4: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleRdfProperty"
    // InternalRdfMapping.g:278:1: entryRuleRdfProperty : ruleRdfProperty EOF ;
    public final void entryRuleRdfProperty() throws RecognitionException {
        try {
            // InternalRdfMapping.g:279:1: ( ruleRdfProperty EOF )
            // InternalRdfMapping.g:280:1: ruleRdfProperty EOF
            {
             before(grammarAccess.getRdfPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleRdfProperty();

            state._fsp--;

             after(grammarAccess.getRdfPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRdfProperty"


    // $ANTLR start "ruleRdfProperty"
    // InternalRdfMapping.g:287:1: ruleRdfProperty : ( ( rule__RdfProperty__NameAssignment ) ) ;
    public final void ruleRdfProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:291:2: ( ( ( rule__RdfProperty__NameAssignment ) ) )
            // InternalRdfMapping.g:292:2: ( ( rule__RdfProperty__NameAssignment ) )
            {
            // InternalRdfMapping.g:292:2: ( ( rule__RdfProperty__NameAssignment ) )
            // InternalRdfMapping.g:293:3: ( rule__RdfProperty__NameAssignment )
            {
             before(grammarAccess.getRdfPropertyAccess().getNameAssignment()); 
            // InternalRdfMapping.g:294:3: ( rule__RdfProperty__NameAssignment )
            // InternalRdfMapping.g:294:4: rule__RdfProperty__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RdfProperty__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRdfPropertyAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRdfProperty"


    // $ANTLR start "entryRuleRdfClass"
    // InternalRdfMapping.g:303:1: entryRuleRdfClass : ruleRdfClass EOF ;
    public final void entryRuleRdfClass() throws RecognitionException {
        try {
            // InternalRdfMapping.g:304:1: ( ruleRdfClass EOF )
            // InternalRdfMapping.g:305:1: ruleRdfClass EOF
            {
             before(grammarAccess.getRdfClassRule()); 
            pushFollow(FOLLOW_1);
            ruleRdfClass();

            state._fsp--;

             after(grammarAccess.getRdfClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRdfClass"


    // $ANTLR start "ruleRdfClass"
    // InternalRdfMapping.g:312:1: ruleRdfClass : ( ( rule__RdfClass__NameAssignment ) ) ;
    public final void ruleRdfClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:316:2: ( ( ( rule__RdfClass__NameAssignment ) ) )
            // InternalRdfMapping.g:317:2: ( ( rule__RdfClass__NameAssignment ) )
            {
            // InternalRdfMapping.g:317:2: ( ( rule__RdfClass__NameAssignment ) )
            // InternalRdfMapping.g:318:3: ( rule__RdfClass__NameAssignment )
            {
             before(grammarAccess.getRdfClassAccess().getNameAssignment()); 
            // InternalRdfMapping.g:319:3: ( rule__RdfClass__NameAssignment )
            // InternalRdfMapping.g:319:4: rule__RdfClass__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RdfClass__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRdfClassAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRdfClass"


    // $ANTLR start "entryRuleMapping"
    // InternalRdfMapping.g:328:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:329:1: ( ruleMapping EOF )
            // InternalRdfMapping.g:330:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalRdfMapping.g:337:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:341:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalRdfMapping.g:342:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalRdfMapping.g:342:2: ( ( rule__Mapping__Group__0 ) )
            // InternalRdfMapping.g:343:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalRdfMapping.g:344:3: ( rule__Mapping__Group__0 )
            // InternalRdfMapping.g:344:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleSubjectTypeMapping"
    // InternalRdfMapping.g:353:1: entryRuleSubjectTypeMapping : ruleSubjectTypeMapping EOF ;
    public final void entryRuleSubjectTypeMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:354:1: ( ruleSubjectTypeMapping EOF )
            // InternalRdfMapping.g:355:1: ruleSubjectTypeMapping EOF
            {
             before(grammarAccess.getSubjectTypeMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleSubjectTypeMapping();

            state._fsp--;

             after(grammarAccess.getSubjectTypeMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubjectTypeMapping"


    // $ANTLR start "ruleSubjectTypeMapping"
    // InternalRdfMapping.g:362:1: ruleSubjectTypeMapping : ( ( rule__SubjectTypeMapping__TypeAssignment ) ) ;
    public final void ruleSubjectTypeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:366:2: ( ( ( rule__SubjectTypeMapping__TypeAssignment ) ) )
            // InternalRdfMapping.g:367:2: ( ( rule__SubjectTypeMapping__TypeAssignment ) )
            {
            // InternalRdfMapping.g:367:2: ( ( rule__SubjectTypeMapping__TypeAssignment ) )
            // InternalRdfMapping.g:368:3: ( rule__SubjectTypeMapping__TypeAssignment )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeAssignment()); 
            // InternalRdfMapping.g:369:3: ( rule__SubjectTypeMapping__TypeAssignment )
            // InternalRdfMapping.g:369:4: rule__SubjectTypeMapping__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SubjectTypeMapping__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSubjectTypeMappingAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubjectTypeMapping"


    // $ANTLR start "entryRulePredicateObjectMapping"
    // InternalRdfMapping.g:378:1: entryRulePredicateObjectMapping : rulePredicateObjectMapping EOF ;
    public final void entryRulePredicateObjectMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:379:1: ( rulePredicateObjectMapping EOF )
            // InternalRdfMapping.g:380:1: rulePredicateObjectMapping EOF
            {
             before(grammarAccess.getPredicateObjectMappingRule()); 
            pushFollow(FOLLOW_1);
            rulePredicateObjectMapping();

            state._fsp--;

             after(grammarAccess.getPredicateObjectMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicateObjectMapping"


    // $ANTLR start "rulePredicateObjectMapping"
    // InternalRdfMapping.g:387:1: rulePredicateObjectMapping : ( ( rule__PredicateObjectMapping__Group__0 ) ) ;
    public final void rulePredicateObjectMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:391:2: ( ( ( rule__PredicateObjectMapping__Group__0 ) ) )
            // InternalRdfMapping.g:392:2: ( ( rule__PredicateObjectMapping__Group__0 ) )
            {
            // InternalRdfMapping.g:392:2: ( ( rule__PredicateObjectMapping__Group__0 ) )
            // InternalRdfMapping.g:393:3: ( rule__PredicateObjectMapping__Group__0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getGroup()); 
            // InternalRdfMapping.g:394:3: ( rule__PredicateObjectMapping__Group__0 )
            // InternalRdfMapping.g:394:4: rule__PredicateObjectMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateObjectMapping"


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:403:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRdfMapping.g:404:1: ( ruleImport EOF )
            // InternalRdfMapping.g:405:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalRdfMapping.g:412:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:416:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRdfMapping.g:417:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRdfMapping.g:417:2: ( ( rule__Import__Group__0 ) )
            // InternalRdfMapping.g:418:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRdfMapping.g:419:3: ( rule__Import__Group__0 )
            // InternalRdfMapping.g:419:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalRdfMapping.g:428:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRdfMapping.g:429:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:430:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalRdfMapping.g:437:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:441:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRdfMapping.g:442:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRdfMapping.g:442:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRdfMapping.g:443:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRdfMapping.g:444:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRdfMapping.g:444:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRdfMapping.g:453:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRdfMapping.g:454:1: ( ruleQualifiedName EOF )
            // InternalRdfMapping.g:455:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalRdfMapping.g:462:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:466:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRdfMapping.g:467:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRdfMapping.g:467:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRdfMapping.g:468:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRdfMapping.g:469:3: ( rule__QualifiedName__Group__0 )
            // InternalRdfMapping.g:469:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalRdfMapping.g:477:1: rule__Element__Alternatives : ( ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:481:1: ( ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            case 26:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRdfMapping.g:482:2: ( ruleImport )
                    {
                    // InternalRdfMapping.g:482:2: ( ruleImport )
                    // InternalRdfMapping.g:483:3: ruleImport
                    {
                     before(grammarAccess.getElementAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:488:2: ( ruleSourceTypesDefinition )
                    {
                    // InternalRdfMapping.g:488:2: ( ruleSourceTypesDefinition )
                    // InternalRdfMapping.g:489:3: ruleSourceTypesDefinition
                    {
                     before(grammarAccess.getElementAccess().getSourceTypesDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceTypesDefinition();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSourceTypesDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRdfMapping.g:494:2: ( ruleSourceGroup )
                    {
                    // InternalRdfMapping.g:494:2: ( ruleSourceGroup )
                    // InternalRdfMapping.g:495:3: ruleSourceGroup
                    {
                     before(grammarAccess.getElementAccess().getSourceGroupParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceGroup();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSourceGroupParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRdfMapping.g:500:2: ( ruleLogicalSource )
                    {
                    // InternalRdfMapping.g:500:2: ( ruleLogicalSource )
                    // InternalRdfMapping.g:501:3: ruleLogicalSource
                    {
                     before(grammarAccess.getElementAccess().getLogicalSourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalSource();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLogicalSourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRdfMapping.g:506:2: ( ruleVocabulary )
                    {
                    // InternalRdfMapping.g:506:2: ( ruleVocabulary )
                    // InternalRdfMapping.g:507:3: ruleVocabulary
                    {
                     before(grammarAccess.getElementAccess().getVocabularyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVocabulary();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getVocabularyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRdfMapping.g:512:2: ( ruleMapping )
                    {
                    // InternalRdfMapping.g:512:2: ( ruleMapping )
                    // InternalRdfMapping.g:513:3: ruleMapping
                    {
                     before(grammarAccess.getElementAccess().getMappingParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMapping();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMappingParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__SourceTypesDefinition__Group__0"
    // InternalRdfMapping.g:522:1: rule__SourceTypesDefinition__Group__0 : rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 ;
    public final void rule__SourceTypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:526:1: ( rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 )
            // InternalRdfMapping.g:527:2: rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SourceTypesDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceTypesDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__0"


    // $ANTLR start "rule__SourceTypesDefinition__Group__0__Impl"
    // InternalRdfMapping.g:534:1: rule__SourceTypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SourceTypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:538:1: ( ( () ) )
            // InternalRdfMapping.g:539:1: ( () )
            {
            // InternalRdfMapping.g:539:1: ( () )
            // InternalRdfMapping.g:540:2: ()
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0()); 
            // InternalRdfMapping.g:541:2: ()
            // InternalRdfMapping.g:541:3: 
            {
            }

             after(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__0__Impl"


    // $ANTLR start "rule__SourceTypesDefinition__Group__1"
    // InternalRdfMapping.g:549:1: rule__SourceTypesDefinition__Group__1 : rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 ;
    public final void rule__SourceTypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:553:1: ( rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 )
            // InternalRdfMapping.g:554:2: rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SourceTypesDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceTypesDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__1"


    // $ANTLR start "rule__SourceTypesDefinition__Group__1__Impl"
    // InternalRdfMapping.g:561:1: rule__SourceTypesDefinition__Group__1__Impl : ( 'source-types' ) ;
    public final void rule__SourceTypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:565:1: ( ( 'source-types' ) )
            // InternalRdfMapping.g:566:1: ( 'source-types' )
            {
            // InternalRdfMapping.g:566:1: ( 'source-types' )
            // InternalRdfMapping.g:567:2: 'source-types'
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__1__Impl"


    // $ANTLR start "rule__SourceTypesDefinition__Group__2"
    // InternalRdfMapping.g:576:1: rule__SourceTypesDefinition__Group__2 : rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 ;
    public final void rule__SourceTypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:580:1: ( rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 )
            // InternalRdfMapping.g:581:2: rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SourceTypesDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceTypesDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__2"


    // $ANTLR start "rule__SourceTypesDefinition__Group__2__Impl"
    // InternalRdfMapping.g:588:1: rule__SourceTypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceTypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:592:1: ( ( '{' ) )
            // InternalRdfMapping.g:593:1: ( '{' )
            {
            // InternalRdfMapping.g:593:1: ( '{' )
            // InternalRdfMapping.g:594:2: '{'
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSourceTypesDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__2__Impl"


    // $ANTLR start "rule__SourceTypesDefinition__Group__3"
    // InternalRdfMapping.g:603:1: rule__SourceTypesDefinition__Group__3 : rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 ;
    public final void rule__SourceTypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:607:1: ( rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 )
            // InternalRdfMapping.g:608:2: rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SourceTypesDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceTypesDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__3"


    // $ANTLR start "rule__SourceTypesDefinition__Group__3__Impl"
    // InternalRdfMapping.g:615:1: rule__SourceTypesDefinition__Group__3__Impl : ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) ;
    public final void rule__SourceTypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:619:1: ( ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) )
            // InternalRdfMapping.g:620:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            {
            // InternalRdfMapping.g:620:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            // InternalRdfMapping.g:621:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getTypesAssignment_3()); 
            // InternalRdfMapping.g:622:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRdfMapping.g:622:3: rule__SourceTypesDefinition__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SourceTypesDefinition__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSourceTypesDefinitionAccess().getTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__3__Impl"


    // $ANTLR start "rule__SourceTypesDefinition__Group__4"
    // InternalRdfMapping.g:630:1: rule__SourceTypesDefinition__Group__4 : rule__SourceTypesDefinition__Group__4__Impl ;
    public final void rule__SourceTypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:634:1: ( rule__SourceTypesDefinition__Group__4__Impl )
            // InternalRdfMapping.g:635:2: rule__SourceTypesDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceTypesDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__4"


    // $ANTLR start "rule__SourceTypesDefinition__Group__4__Impl"
    // InternalRdfMapping.g:641:1: rule__SourceTypesDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SourceTypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:645:1: ( ( '}' ) )
            // InternalRdfMapping.g:646:1: ( '}' )
            {
            // InternalRdfMapping.g:646:1: ( '}' )
            // InternalRdfMapping.g:647:2: '}'
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSourceTypesDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__Group__4__Impl"


    // $ANTLR start "rule__SourceType__Group__0"
    // InternalRdfMapping.g:657:1: rule__SourceType__Group__0 : rule__SourceType__Group__0__Impl rule__SourceType__Group__1 ;
    public final void rule__SourceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:661:1: ( rule__SourceType__Group__0__Impl rule__SourceType__Group__1 )
            // InternalRdfMapping.g:662:2: rule__SourceType__Group__0__Impl rule__SourceType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SourceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__Group__0"


    // $ANTLR start "rule__SourceType__Group__0__Impl"
    // InternalRdfMapping.g:669:1: rule__SourceType__Group__0__Impl : ( ( rule__SourceType__NameAssignment_0 ) ) ;
    public final void rule__SourceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:673:1: ( ( ( rule__SourceType__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:674:1: ( ( rule__SourceType__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:674:1: ( ( rule__SourceType__NameAssignment_0 ) )
            // InternalRdfMapping.g:675:2: ( rule__SourceType__NameAssignment_0 )
            {
             before(grammarAccess.getSourceTypeAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:676:2: ( rule__SourceType__NameAssignment_0 )
            // InternalRdfMapping.g:676:3: rule__SourceType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SourceType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__Group__0__Impl"


    // $ANTLR start "rule__SourceType__Group__1"
    // InternalRdfMapping.g:684:1: rule__SourceType__Group__1 : rule__SourceType__Group__1__Impl rule__SourceType__Group__2 ;
    public final void rule__SourceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:688:1: ( rule__SourceType__Group__1__Impl rule__SourceType__Group__2 )
            // InternalRdfMapping.g:689:2: rule__SourceType__Group__1__Impl rule__SourceType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SourceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__Group__1"


    // $ANTLR start "rule__SourceType__Group__1__Impl"
    // InternalRdfMapping.g:696:1: rule__SourceType__Group__1__Impl : ( 'referenceFormulation' ) ;
    public final void rule__SourceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:700:1: ( ( 'referenceFormulation' ) )
            // InternalRdfMapping.g:701:1: ( 'referenceFormulation' )
            {
            // InternalRdfMapping.g:701:1: ( 'referenceFormulation' )
            // InternalRdfMapping.g:702:2: 'referenceFormulation'
            {
             before(grammarAccess.getSourceTypeAccess().getReferenceFormulationKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSourceTypeAccess().getReferenceFormulationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__Group__1__Impl"


    // $ANTLR start "rule__SourceType__Group__2"
    // InternalRdfMapping.g:711:1: rule__SourceType__Group__2 : rule__SourceType__Group__2__Impl ;
    public final void rule__SourceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:715:1: ( rule__SourceType__Group__2__Impl )
            // InternalRdfMapping.g:716:2: rule__SourceType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__Group__2"


    // $ANTLR start "rule__SourceType__Group__2__Impl"
    // InternalRdfMapping.g:722:1: rule__SourceType__Group__2__Impl : ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) ;
    public final void rule__SourceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:726:1: ( ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) )
            // InternalRdfMapping.g:727:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            {
            // InternalRdfMapping.g:727:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            // InternalRdfMapping.g:728:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            {
             before(grammarAccess.getSourceTypeAccess().getReferenceFormulationAssignment_2()); 
            // InternalRdfMapping.g:729:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            // InternalRdfMapping.g:729:3: rule__SourceType__ReferenceFormulationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SourceType__ReferenceFormulationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSourceTypeAccess().getReferenceFormulationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__Group__2__Impl"


    // $ANTLR start "rule__SourceGroup__Group__0"
    // InternalRdfMapping.g:738:1: rule__SourceGroup__Group__0 : rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 ;
    public final void rule__SourceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:742:1: ( rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 )
            // InternalRdfMapping.g:743:2: rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SourceGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__0"


    // $ANTLR start "rule__SourceGroup__Group__0__Impl"
    // InternalRdfMapping.g:750:1: rule__SourceGroup__Group__0__Impl : ( 'source-group' ) ;
    public final void rule__SourceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:754:1: ( ( 'source-group' ) )
            // InternalRdfMapping.g:755:1: ( 'source-group' )
            {
            // InternalRdfMapping.g:755:1: ( 'source-group' )
            // InternalRdfMapping.g:756:2: 'source-group'
            {
             before(grammarAccess.getSourceGroupAccess().getSourceGroupKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getSourceGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__0__Impl"


    // $ANTLR start "rule__SourceGroup__Group__1"
    // InternalRdfMapping.g:765:1: rule__SourceGroup__Group__1 : rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 ;
    public final void rule__SourceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:769:1: ( rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 )
            // InternalRdfMapping.g:770:2: rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SourceGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__1"


    // $ANTLR start "rule__SourceGroup__Group__1__Impl"
    // InternalRdfMapping.g:777:1: rule__SourceGroup__Group__1__Impl : ( ( rule__SourceGroup__NameAssignment_1 ) ) ;
    public final void rule__SourceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:781:1: ( ( ( rule__SourceGroup__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:782:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:782:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            // InternalRdfMapping.g:783:2: ( rule__SourceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:784:2: ( rule__SourceGroup__NameAssignment_1 )
            // InternalRdfMapping.g:784:3: rule__SourceGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__1__Impl"


    // $ANTLR start "rule__SourceGroup__Group__2"
    // InternalRdfMapping.g:792:1: rule__SourceGroup__Group__2 : rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 ;
    public final void rule__SourceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:796:1: ( rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 )
            // InternalRdfMapping.g:797:2: rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SourceGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__2"


    // $ANTLR start "rule__SourceGroup__Group__2__Impl"
    // InternalRdfMapping.g:804:1: rule__SourceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:808:1: ( ( '{' ) )
            // InternalRdfMapping.g:809:1: ( '{' )
            {
            // InternalRdfMapping.g:809:1: ( '{' )
            // InternalRdfMapping.g:810:2: '{'
            {
             before(grammarAccess.getSourceGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__2__Impl"


    // $ANTLR start "rule__SourceGroup__Group__3"
    // InternalRdfMapping.g:819:1: rule__SourceGroup__Group__3 : rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 ;
    public final void rule__SourceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:823:1: ( rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 )
            // InternalRdfMapping.g:824:2: rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SourceGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__3"


    // $ANTLR start "rule__SourceGroup__Group__3__Impl"
    // InternalRdfMapping.g:831:1: rule__SourceGroup__Group__3__Impl : ( 'type' ) ;
    public final void rule__SourceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:835:1: ( ( 'type' ) )
            // InternalRdfMapping.g:836:1: ( 'type' )
            {
            // InternalRdfMapping.g:836:1: ( 'type' )
            // InternalRdfMapping.g:837:2: 'type'
            {
             before(grammarAccess.getSourceGroupAccess().getTypeKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__3__Impl"


    // $ANTLR start "rule__SourceGroup__Group__4"
    // InternalRdfMapping.g:846:1: rule__SourceGroup__Group__4 : rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 ;
    public final void rule__SourceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:850:1: ( rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 )
            // InternalRdfMapping.g:851:2: rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__SourceGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__4"


    // $ANTLR start "rule__SourceGroup__Group__4__Impl"
    // InternalRdfMapping.g:858:1: rule__SourceGroup__Group__4__Impl : ( ( rule__SourceGroup__TypeAssignment_4 ) ) ;
    public final void rule__SourceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:862:1: ( ( ( rule__SourceGroup__TypeAssignment_4 ) ) )
            // InternalRdfMapping.g:863:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            {
            // InternalRdfMapping.g:863:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            // InternalRdfMapping.g:864:2: ( rule__SourceGroup__TypeAssignment_4 )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeAssignment_4()); 
            // InternalRdfMapping.g:865:2: ( rule__SourceGroup__TypeAssignment_4 )
            // InternalRdfMapping.g:865:3: rule__SourceGroup__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSourceGroupAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__4__Impl"


    // $ANTLR start "rule__SourceGroup__Group__5"
    // InternalRdfMapping.g:873:1: rule__SourceGroup__Group__5 : rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 ;
    public final void rule__SourceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:877:1: ( rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 )
            // InternalRdfMapping.g:878:2: rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__SourceGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__5"


    // $ANTLR start "rule__SourceGroup__Group__5__Impl"
    // InternalRdfMapping.g:885:1: rule__SourceGroup__Group__5__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:889:1: ( ( ';' ) )
            // InternalRdfMapping.g:890:1: ( ';' )
            {
            // InternalRdfMapping.g:890:1: ( ';' )
            // InternalRdfMapping.g:891:2: ';'
            {
             before(grammarAccess.getSourceGroupAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__5__Impl"


    // $ANTLR start "rule__SourceGroup__Group__6"
    // InternalRdfMapping.g:900:1: rule__SourceGroup__Group__6 : rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 ;
    public final void rule__SourceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:904:1: ( rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 )
            // InternalRdfMapping.g:905:2: rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__SourceGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__6"


    // $ANTLR start "rule__SourceGroup__Group__6__Impl"
    // InternalRdfMapping.g:912:1: rule__SourceGroup__Group__6__Impl : ( ( rule__SourceGroup__Group_6__0 )? ) ;
    public final void rule__SourceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:916:1: ( ( ( rule__SourceGroup__Group_6__0 )? ) )
            // InternalRdfMapping.g:917:1: ( ( rule__SourceGroup__Group_6__0 )? )
            {
            // InternalRdfMapping.g:917:1: ( ( rule__SourceGroup__Group_6__0 )? )
            // InternalRdfMapping.g:918:2: ( rule__SourceGroup__Group_6__0 )?
            {
             before(grammarAccess.getSourceGroupAccess().getGroup_6()); 
            // InternalRdfMapping.g:919:2: ( rule__SourceGroup__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRdfMapping.g:919:3: rule__SourceGroup__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SourceGroup__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceGroupAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__6__Impl"


    // $ANTLR start "rule__SourceGroup__Group__7"
    // InternalRdfMapping.g:927:1: rule__SourceGroup__Group__7 : rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 ;
    public final void rule__SourceGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:931:1: ( rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 )
            // InternalRdfMapping.g:932:2: rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__SourceGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__7"


    // $ANTLR start "rule__SourceGroup__Group__7__Impl"
    // InternalRdfMapping.g:939:1: rule__SourceGroup__Group__7__Impl : ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) ;
    public final void rule__SourceGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:943:1: ( ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) )
            // InternalRdfMapping.g:944:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            {
            // InternalRdfMapping.g:944:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            // InternalRdfMapping.g:945:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            {
             before(grammarAccess.getSourceGroupAccess().getLogicalSourcesAssignment_7()); 
            // InternalRdfMapping.g:946:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:946:3: rule__SourceGroup__LogicalSourcesAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SourceGroup__LogicalSourcesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSourceGroupAccess().getLogicalSourcesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__7__Impl"


    // $ANTLR start "rule__SourceGroup__Group__8"
    // InternalRdfMapping.g:954:1: rule__SourceGroup__Group__8 : rule__SourceGroup__Group__8__Impl ;
    public final void rule__SourceGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:958:1: ( rule__SourceGroup__Group__8__Impl )
            // InternalRdfMapping.g:959:2: rule__SourceGroup__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__8"


    // $ANTLR start "rule__SourceGroup__Group__8__Impl"
    // InternalRdfMapping.g:965:1: rule__SourceGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__SourceGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:969:1: ( ( '}' ) )
            // InternalRdfMapping.g:970:1: ( '}' )
            {
            // InternalRdfMapping.g:970:1: ( '}' )
            // InternalRdfMapping.g:971:2: '}'
            {
             before(grammarAccess.getSourceGroupAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group__8__Impl"


    // $ANTLR start "rule__SourceGroup__Group_6__0"
    // InternalRdfMapping.g:981:1: rule__SourceGroup__Group_6__0 : rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 ;
    public final void rule__SourceGroup__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:985:1: ( rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 )
            // InternalRdfMapping.g:986:2: rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__SourceGroup__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group_6__0"


    // $ANTLR start "rule__SourceGroup__Group_6__0__Impl"
    // InternalRdfMapping.g:993:1: rule__SourceGroup__Group_6__0__Impl : ( 'source' ) ;
    public final void rule__SourceGroup__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:997:1: ( ( 'source' ) )
            // InternalRdfMapping.g:998:1: ( 'source' )
            {
            // InternalRdfMapping.g:998:1: ( 'source' )
            // InternalRdfMapping.g:999:2: 'source'
            {
             before(grammarAccess.getSourceGroupAccess().getSourceKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getSourceKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group_6__0__Impl"


    // $ANTLR start "rule__SourceGroup__Group_6__1"
    // InternalRdfMapping.g:1008:1: rule__SourceGroup__Group_6__1 : rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 ;
    public final void rule__SourceGroup__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1012:1: ( rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 )
            // InternalRdfMapping.g:1013:2: rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__SourceGroup__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group_6__1"


    // $ANTLR start "rule__SourceGroup__Group_6__1__Impl"
    // InternalRdfMapping.g:1020:1: rule__SourceGroup__Group_6__1__Impl : ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) ;
    public final void rule__SourceGroup__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1024:1: ( ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) )
            // InternalRdfMapping.g:1025:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            {
            // InternalRdfMapping.g:1025:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            // InternalRdfMapping.g:1026:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getSourceAssignment_6_1()); 
            // InternalRdfMapping.g:1027:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            // InternalRdfMapping.g:1027:3: rule__SourceGroup__SourceAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__SourceAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceGroupAccess().getSourceAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group_6__1__Impl"


    // $ANTLR start "rule__SourceGroup__Group_6__2"
    // InternalRdfMapping.g:1035:1: rule__SourceGroup__Group_6__2 : rule__SourceGroup__Group_6__2__Impl ;
    public final void rule__SourceGroup__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1039:1: ( rule__SourceGroup__Group_6__2__Impl )
            // InternalRdfMapping.g:1040:2: rule__SourceGroup__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group_6__2"


    // $ANTLR start "rule__SourceGroup__Group_6__2__Impl"
    // InternalRdfMapping.g:1046:1: rule__SourceGroup__Group_6__2__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1050:1: ( ( ';' ) )
            // InternalRdfMapping.g:1051:1: ( ';' )
            {
            // InternalRdfMapping.g:1051:1: ( ';' )
            // InternalRdfMapping.g:1052:2: ';'
            {
             before(grammarAccess.getSourceGroupAccess().getSemicolonKeyword_6_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getSemicolonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__Group_6__2__Impl"


    // $ANTLR start "rule__LogicalSource__Group__0"
    // InternalRdfMapping.g:1062:1: rule__LogicalSource__Group__0 : rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 ;
    public final void rule__LogicalSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1066:1: ( rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 )
            // InternalRdfMapping.g:1067:2: rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__LogicalSource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__0"


    // $ANTLR start "rule__LogicalSource__Group__0__Impl"
    // InternalRdfMapping.g:1074:1: rule__LogicalSource__Group__0__Impl : ( 'logical-source' ) ;
    public final void rule__LogicalSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1078:1: ( ( 'logical-source' ) )
            // InternalRdfMapping.g:1079:1: ( 'logical-source' )
            {
            // InternalRdfMapping.g:1079:1: ( 'logical-source' )
            // InternalRdfMapping.g:1080:2: 'logical-source'
            {
             before(grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__0__Impl"


    // $ANTLR start "rule__LogicalSource__Group__1"
    // InternalRdfMapping.g:1089:1: rule__LogicalSource__Group__1 : rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 ;
    public final void rule__LogicalSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1093:1: ( rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 )
            // InternalRdfMapping.g:1094:2: rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LogicalSource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__1"


    // $ANTLR start "rule__LogicalSource__Group__1__Impl"
    // InternalRdfMapping.g:1101:1: rule__LogicalSource__Group__1__Impl : ( ( rule__LogicalSource__NameAssignment_1 ) ) ;
    public final void rule__LogicalSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1105:1: ( ( ( rule__LogicalSource__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1106:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1106:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            // InternalRdfMapping.g:1107:2: ( rule__LogicalSource__NameAssignment_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1108:2: ( rule__LogicalSource__NameAssignment_1 )
            // InternalRdfMapping.g:1108:3: rule__LogicalSource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalSourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__1__Impl"


    // $ANTLR start "rule__LogicalSource__Group__2"
    // InternalRdfMapping.g:1116:1: rule__LogicalSource__Group__2 : rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 ;
    public final void rule__LogicalSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1120:1: ( rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 )
            // InternalRdfMapping.g:1121:2: rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__LogicalSource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__2"


    // $ANTLR start "rule__LogicalSource__Group__2__Impl"
    // InternalRdfMapping.g:1128:1: rule__LogicalSource__Group__2__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1132:1: ( ( '{' ) )
            // InternalRdfMapping.g:1133:1: ( '{' )
            {
            // InternalRdfMapping.g:1133:1: ( '{' )
            // InternalRdfMapping.g:1134:2: '{'
            {
             before(grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__2__Impl"


    // $ANTLR start "rule__LogicalSource__Group__3"
    // InternalRdfMapping.g:1143:1: rule__LogicalSource__Group__3 : rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 ;
    public final void rule__LogicalSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1147:1: ( rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 )
            // InternalRdfMapping.g:1148:2: rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__LogicalSource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__3"


    // $ANTLR start "rule__LogicalSource__Group__3__Impl"
    // InternalRdfMapping.g:1155:1: rule__LogicalSource__Group__3__Impl : ( ( rule__LogicalSource__Group_3__0 )? ) ;
    public final void rule__LogicalSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1159:1: ( ( ( rule__LogicalSource__Group_3__0 )? ) )
            // InternalRdfMapping.g:1160:1: ( ( rule__LogicalSource__Group_3__0 )? )
            {
            // InternalRdfMapping.g:1160:1: ( ( rule__LogicalSource__Group_3__0 )? )
            // InternalRdfMapping.g:1161:2: ( rule__LogicalSource__Group_3__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_3()); 
            // InternalRdfMapping.g:1162:2: ( rule__LogicalSource__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdfMapping.g:1162:3: rule__LogicalSource__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalSource__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLogicalSourceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__3__Impl"


    // $ANTLR start "rule__LogicalSource__Group__4"
    // InternalRdfMapping.g:1170:1: rule__LogicalSource__Group__4 : rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 ;
    public final void rule__LogicalSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1174:1: ( rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 )
            // InternalRdfMapping.g:1175:2: rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__LogicalSource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__4"


    // $ANTLR start "rule__LogicalSource__Group__4__Impl"
    // InternalRdfMapping.g:1182:1: rule__LogicalSource__Group__4__Impl : ( ( rule__LogicalSource__Group_4__0 )? ) ;
    public final void rule__LogicalSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1186:1: ( ( ( rule__LogicalSource__Group_4__0 )? ) )
            // InternalRdfMapping.g:1187:1: ( ( rule__LogicalSource__Group_4__0 )? )
            {
            // InternalRdfMapping.g:1187:1: ( ( rule__LogicalSource__Group_4__0 )? )
            // InternalRdfMapping.g:1188:2: ( rule__LogicalSource__Group_4__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_4()); 
            // InternalRdfMapping.g:1189:2: ( rule__LogicalSource__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdfMapping.g:1189:3: rule__LogicalSource__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalSource__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLogicalSourceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__4__Impl"


    // $ANTLR start "rule__LogicalSource__Group__5"
    // InternalRdfMapping.g:1197:1: rule__LogicalSource__Group__5 : rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 ;
    public final void rule__LogicalSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1201:1: ( rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 )
            // InternalRdfMapping.g:1202:2: rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__LogicalSource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__5"


    // $ANTLR start "rule__LogicalSource__Group__5__Impl"
    // InternalRdfMapping.g:1209:1: rule__LogicalSource__Group__5__Impl : ( ( rule__LogicalSource__Group_5__0 )? ) ;
    public final void rule__LogicalSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1213:1: ( ( ( rule__LogicalSource__Group_5__0 )? ) )
            // InternalRdfMapping.g:1214:1: ( ( rule__LogicalSource__Group_5__0 )? )
            {
            // InternalRdfMapping.g:1214:1: ( ( rule__LogicalSource__Group_5__0 )? )
            // InternalRdfMapping.g:1215:2: ( rule__LogicalSource__Group_5__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_5()); 
            // InternalRdfMapping.g:1216:2: ( rule__LogicalSource__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:1216:3: rule__LogicalSource__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalSource__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLogicalSourceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__5__Impl"


    // $ANTLR start "rule__LogicalSource__Group__6"
    // InternalRdfMapping.g:1224:1: rule__LogicalSource__Group__6 : rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 ;
    public final void rule__LogicalSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1228:1: ( rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 )
            // InternalRdfMapping.g:1229:2: rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__LogicalSource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__6"


    // $ANTLR start "rule__LogicalSource__Group__6__Impl"
    // InternalRdfMapping.g:1236:1: rule__LogicalSource__Group__6__Impl : ( 'referenceables' ) ;
    public final void rule__LogicalSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1240:1: ( ( 'referenceables' ) )
            // InternalRdfMapping.g:1241:1: ( 'referenceables' )
            {
            // InternalRdfMapping.g:1241:1: ( 'referenceables' )
            // InternalRdfMapping.g:1242:2: 'referenceables'
            {
             before(grammarAccess.getLogicalSourceAccess().getReferenceablesKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getReferenceablesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__6__Impl"


    // $ANTLR start "rule__LogicalSource__Group__7"
    // InternalRdfMapping.g:1251:1: rule__LogicalSource__Group__7 : rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 ;
    public final void rule__LogicalSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1255:1: ( rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 )
            // InternalRdfMapping.g:1256:2: rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__LogicalSource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__7"


    // $ANTLR start "rule__LogicalSource__Group__7__Impl"
    // InternalRdfMapping.g:1263:1: rule__LogicalSource__Group__7__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1267:1: ( ( '{' ) )
            // InternalRdfMapping.g:1268:1: ( '{' )
            {
            // InternalRdfMapping.g:1268:1: ( '{' )
            // InternalRdfMapping.g:1269:2: '{'
            {
             before(grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__7__Impl"


    // $ANTLR start "rule__LogicalSource__Group__8"
    // InternalRdfMapping.g:1278:1: rule__LogicalSource__Group__8 : rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 ;
    public final void rule__LogicalSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1282:1: ( rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 )
            // InternalRdfMapping.g:1283:2: rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__LogicalSource__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__8"


    // $ANTLR start "rule__LogicalSource__Group__8__Impl"
    // InternalRdfMapping.g:1290:1: rule__LogicalSource__Group__8__Impl : ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) ;
    public final void rule__LogicalSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1294:1: ( ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) )
            // InternalRdfMapping.g:1295:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            {
            // InternalRdfMapping.g:1295:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            // InternalRdfMapping.g:1296:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            {
             before(grammarAccess.getLogicalSourceAccess().getReferencablesAssignment_8()); 
            // InternalRdfMapping.g:1297:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRdfMapping.g:1297:3: rule__LogicalSource__ReferencablesAssignment_8
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LogicalSource__ReferencablesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLogicalSourceAccess().getReferencablesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__8__Impl"


    // $ANTLR start "rule__LogicalSource__Group__9"
    // InternalRdfMapping.g:1305:1: rule__LogicalSource__Group__9 : rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 ;
    public final void rule__LogicalSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1309:1: ( rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 )
            // InternalRdfMapping.g:1310:2: rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__LogicalSource__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__9"


    // $ANTLR start "rule__LogicalSource__Group__9__Impl"
    // InternalRdfMapping.g:1317:1: rule__LogicalSource__Group__9__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1321:1: ( ( '}' ) )
            // InternalRdfMapping.g:1322:1: ( '}' )
            {
            // InternalRdfMapping.g:1322:1: ( '}' )
            // InternalRdfMapping.g:1323:2: '}'
            {
             before(grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__9__Impl"


    // $ANTLR start "rule__LogicalSource__Group__10"
    // InternalRdfMapping.g:1332:1: rule__LogicalSource__Group__10 : rule__LogicalSource__Group__10__Impl ;
    public final void rule__LogicalSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1336:1: ( rule__LogicalSource__Group__10__Impl )
            // InternalRdfMapping.g:1337:2: rule__LogicalSource__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__10"


    // $ANTLR start "rule__LogicalSource__Group__10__Impl"
    // InternalRdfMapping.g:1343:1: rule__LogicalSource__Group__10__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1347:1: ( ( '}' ) )
            // InternalRdfMapping.g:1348:1: ( '}' )
            {
            // InternalRdfMapping.g:1348:1: ( '}' )
            // InternalRdfMapping.g:1349:2: '}'
            {
             before(grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group__10__Impl"


    // $ANTLR start "rule__LogicalSource__Group_3__0"
    // InternalRdfMapping.g:1359:1: rule__LogicalSource__Group_3__0 : rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 ;
    public final void rule__LogicalSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1363:1: ( rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 )
            // InternalRdfMapping.g:1364:2: rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__LogicalSource__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_3__0"


    // $ANTLR start "rule__LogicalSource__Group_3__0__Impl"
    // InternalRdfMapping.g:1371:1: rule__LogicalSource__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__LogicalSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1375:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1376:1: ( 'type' )
            {
            // InternalRdfMapping.g:1376:1: ( 'type' )
            // InternalRdfMapping.g:1377:2: 'type'
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_3__0__Impl"


    // $ANTLR start "rule__LogicalSource__Group_3__1"
    // InternalRdfMapping.g:1386:1: rule__LogicalSource__Group_3__1 : rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 ;
    public final void rule__LogicalSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1390:1: ( rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 )
            // InternalRdfMapping.g:1391:2: rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__LogicalSource__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_3__1"


    // $ANTLR start "rule__LogicalSource__Group_3__1__Impl"
    // InternalRdfMapping.g:1398:1: rule__LogicalSource__Group_3__1__Impl : ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) ;
    public final void rule__LogicalSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1402:1: ( ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) )
            // InternalRdfMapping.g:1403:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            {
            // InternalRdfMapping.g:1403:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            // InternalRdfMapping.g:1404:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeAssignment_3_1()); 
            // InternalRdfMapping.g:1405:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            // InternalRdfMapping.g:1405:3: rule__LogicalSource__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalSourceAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_3__1__Impl"


    // $ANTLR start "rule__LogicalSource__Group_3__2"
    // InternalRdfMapping.g:1413:1: rule__LogicalSource__Group_3__2 : rule__LogicalSource__Group_3__2__Impl ;
    public final void rule__LogicalSource__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1417:1: ( rule__LogicalSource__Group_3__2__Impl )
            // InternalRdfMapping.g:1418:2: rule__LogicalSource__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_3__2"


    // $ANTLR start "rule__LogicalSource__Group_3__2__Impl"
    // InternalRdfMapping.g:1424:1: rule__LogicalSource__Group_3__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1428:1: ( ( ';' ) )
            // InternalRdfMapping.g:1429:1: ( ';' )
            {
            // InternalRdfMapping.g:1429:1: ( ';' )
            // InternalRdfMapping.g:1430:2: ';'
            {
             before(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_3_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_3__2__Impl"


    // $ANTLR start "rule__LogicalSource__Group_4__0"
    // InternalRdfMapping.g:1440:1: rule__LogicalSource__Group_4__0 : rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 ;
    public final void rule__LogicalSource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1444:1: ( rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 )
            // InternalRdfMapping.g:1445:2: rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__LogicalSource__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_4__0"


    // $ANTLR start "rule__LogicalSource__Group_4__0__Impl"
    // InternalRdfMapping.g:1452:1: rule__LogicalSource__Group_4__0__Impl : ( 'source' ) ;
    public final void rule__LogicalSource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1456:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1457:1: ( 'source' )
            {
            // InternalRdfMapping.g:1457:1: ( 'source' )
            // InternalRdfMapping.g:1458:2: 'source'
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_4__0__Impl"


    // $ANTLR start "rule__LogicalSource__Group_4__1"
    // InternalRdfMapping.g:1467:1: rule__LogicalSource__Group_4__1 : rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 ;
    public final void rule__LogicalSource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1471:1: ( rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 )
            // InternalRdfMapping.g:1472:2: rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__LogicalSource__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_4__1"


    // $ANTLR start "rule__LogicalSource__Group_4__1__Impl"
    // InternalRdfMapping.g:1479:1: rule__LogicalSource__Group_4__1__Impl : ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) ;
    public final void rule__LogicalSource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1483:1: ( ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) )
            // InternalRdfMapping.g:1484:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            {
            // InternalRdfMapping.g:1484:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            // InternalRdfMapping.g:1485:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceAssignment_4_1()); 
            // InternalRdfMapping.g:1486:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            // InternalRdfMapping.g:1486:3: rule__LogicalSource__SourceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__SourceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalSourceAccess().getSourceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_4__1__Impl"


    // $ANTLR start "rule__LogicalSource__Group_4__2"
    // InternalRdfMapping.g:1494:1: rule__LogicalSource__Group_4__2 : rule__LogicalSource__Group_4__2__Impl ;
    public final void rule__LogicalSource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1498:1: ( rule__LogicalSource__Group_4__2__Impl )
            // InternalRdfMapping.g:1499:2: rule__LogicalSource__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_4__2"


    // $ANTLR start "rule__LogicalSource__Group_4__2__Impl"
    // InternalRdfMapping.g:1505:1: rule__LogicalSource__Group_4__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1509:1: ( ( ';' ) )
            // InternalRdfMapping.g:1510:1: ( ';' )
            {
            // InternalRdfMapping.g:1510:1: ( ';' )
            // InternalRdfMapping.g:1511:2: ';'
            {
             before(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_4_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_4__2__Impl"


    // $ANTLR start "rule__LogicalSource__Group_5__0"
    // InternalRdfMapping.g:1521:1: rule__LogicalSource__Group_5__0 : rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 ;
    public final void rule__LogicalSource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1525:1: ( rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 )
            // InternalRdfMapping.g:1526:2: rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__LogicalSource__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_5__0"


    // $ANTLR start "rule__LogicalSource__Group_5__0__Impl"
    // InternalRdfMapping.g:1533:1: rule__LogicalSource__Group_5__0__Impl : ( 'iterator' ) ;
    public final void rule__LogicalSource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1537:1: ( ( 'iterator' ) )
            // InternalRdfMapping.g:1538:1: ( 'iterator' )
            {
            // InternalRdfMapping.g:1538:1: ( 'iterator' )
            // InternalRdfMapping.g:1539:2: 'iterator'
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_5__0__Impl"


    // $ANTLR start "rule__LogicalSource__Group_5__1"
    // InternalRdfMapping.g:1548:1: rule__LogicalSource__Group_5__1 : rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 ;
    public final void rule__LogicalSource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1552:1: ( rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 )
            // InternalRdfMapping.g:1553:2: rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__LogicalSource__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_5__1"


    // $ANTLR start "rule__LogicalSource__Group_5__1__Impl"
    // InternalRdfMapping.g:1560:1: rule__LogicalSource__Group_5__1__Impl : ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) ;
    public final void rule__LogicalSource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1564:1: ( ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) )
            // InternalRdfMapping.g:1565:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            {
            // InternalRdfMapping.g:1565:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            // InternalRdfMapping.g:1566:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorAssignment_5_1()); 
            // InternalRdfMapping.g:1567:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            // InternalRdfMapping.g:1567:3: rule__LogicalSource__IteratorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__IteratorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalSourceAccess().getIteratorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_5__1__Impl"


    // $ANTLR start "rule__LogicalSource__Group_5__2"
    // InternalRdfMapping.g:1575:1: rule__LogicalSource__Group_5__2 : rule__LogicalSource__Group_5__2__Impl ;
    public final void rule__LogicalSource__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1579:1: ( rule__LogicalSource__Group_5__2__Impl )
            // InternalRdfMapping.g:1580:2: rule__LogicalSource__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_5__2"


    // $ANTLR start "rule__LogicalSource__Group_5__2__Impl"
    // InternalRdfMapping.g:1586:1: rule__LogicalSource__Group_5__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1590:1: ( ( ';' ) )
            // InternalRdfMapping.g:1591:1: ( ';' )
            {
            // InternalRdfMapping.g:1591:1: ( ';' )
            // InternalRdfMapping.g:1592:2: ';'
            {
             before(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_5_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__Group_5__2__Impl"


    // $ANTLR start "rule__Referenceable__Group__0"
    // InternalRdfMapping.g:1602:1: rule__Referenceable__Group__0 : rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 ;
    public final void rule__Referenceable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1606:1: ( rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 )
            // InternalRdfMapping.g:1607:2: rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Referenceable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Referenceable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Referenceable__Group__0"


    // $ANTLR start "rule__Referenceable__Group__0__Impl"
    // InternalRdfMapping.g:1614:1: rule__Referenceable__Group__0__Impl : ( ( rule__Referenceable__NameAssignment_0 ) ) ;
    public final void rule__Referenceable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1618:1: ( ( ( rule__Referenceable__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:1619:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:1619:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            // InternalRdfMapping.g:1620:2: ( rule__Referenceable__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceableAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:1621:2: ( rule__Referenceable__NameAssignment_0 )
            // InternalRdfMapping.g:1621:3: rule__Referenceable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Referenceable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Referenceable__Group__0__Impl"


    // $ANTLR start "rule__Referenceable__Group__1"
    // InternalRdfMapping.g:1629:1: rule__Referenceable__Group__1 : rule__Referenceable__Group__1__Impl ;
    public final void rule__Referenceable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1633:1: ( rule__Referenceable__Group__1__Impl )
            // InternalRdfMapping.g:1634:2: rule__Referenceable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Referenceable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Referenceable__Group__1"


    // $ANTLR start "rule__Referenceable__Group__1__Impl"
    // InternalRdfMapping.g:1640:1: rule__Referenceable__Group__1__Impl : ( ( rule__Referenceable__ValueAssignment_1 ) ) ;
    public final void rule__Referenceable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1644:1: ( ( ( rule__Referenceable__ValueAssignment_1 ) ) )
            // InternalRdfMapping.g:1645:1: ( ( rule__Referenceable__ValueAssignment_1 ) )
            {
            // InternalRdfMapping.g:1645:1: ( ( rule__Referenceable__ValueAssignment_1 ) )
            // InternalRdfMapping.g:1646:2: ( rule__Referenceable__ValueAssignment_1 )
            {
             before(grammarAccess.getReferenceableAccess().getValueAssignment_1()); 
            // InternalRdfMapping.g:1647:2: ( rule__Referenceable__ValueAssignment_1 )
            // InternalRdfMapping.g:1647:3: rule__Referenceable__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Referenceable__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceableAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Referenceable__Group__1__Impl"


    // $ANTLR start "rule__Vocabulary__Group__0"
    // InternalRdfMapping.g:1656:1: rule__Vocabulary__Group__0 : rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 ;
    public final void rule__Vocabulary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1660:1: ( rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 )
            // InternalRdfMapping.g:1661:2: rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Vocabulary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__0"


    // $ANTLR start "rule__Vocabulary__Group__0__Impl"
    // InternalRdfMapping.g:1668:1: rule__Vocabulary__Group__0__Impl : ( 'vocabulary' ) ;
    public final void rule__Vocabulary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1672:1: ( ( 'vocabulary' ) )
            // InternalRdfMapping.g:1673:1: ( 'vocabulary' )
            {
            // InternalRdfMapping.g:1673:1: ( 'vocabulary' )
            // InternalRdfMapping.g:1674:2: 'vocabulary'
            {
             before(grammarAccess.getVocabularyAccess().getVocabularyKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getVocabularyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__0__Impl"


    // $ANTLR start "rule__Vocabulary__Group__1"
    // InternalRdfMapping.g:1683:1: rule__Vocabulary__Group__1 : rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 ;
    public final void rule__Vocabulary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1687:1: ( rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 )
            // InternalRdfMapping.g:1688:2: rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Vocabulary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__1"


    // $ANTLR start "rule__Vocabulary__Group__1__Impl"
    // InternalRdfMapping.g:1695:1: rule__Vocabulary__Group__1__Impl : ( ( rule__Vocabulary__NameAssignment_1 ) ) ;
    public final void rule__Vocabulary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1699:1: ( ( ( rule__Vocabulary__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1700:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1700:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            // InternalRdfMapping.g:1701:2: ( rule__Vocabulary__NameAssignment_1 )
            {
             before(grammarAccess.getVocabularyAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1702:2: ( rule__Vocabulary__NameAssignment_1 )
            // InternalRdfMapping.g:1702:3: rule__Vocabulary__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVocabularyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__1__Impl"


    // $ANTLR start "rule__Vocabulary__Group__2"
    // InternalRdfMapping.g:1710:1: rule__Vocabulary__Group__2 : rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 ;
    public final void rule__Vocabulary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1714:1: ( rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 )
            // InternalRdfMapping.g:1715:2: rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Vocabulary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__2"


    // $ANTLR start "rule__Vocabulary__Group__2__Impl"
    // InternalRdfMapping.g:1722:1: rule__Vocabulary__Group__2__Impl : ( '{' ) ;
    public final void rule__Vocabulary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1726:1: ( ( '{' ) )
            // InternalRdfMapping.g:1727:1: ( '{' )
            {
            // InternalRdfMapping.g:1727:1: ( '{' )
            // InternalRdfMapping.g:1728:2: '{'
            {
             before(grammarAccess.getVocabularyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__2__Impl"


    // $ANTLR start "rule__Vocabulary__Group__3"
    // InternalRdfMapping.g:1737:1: rule__Vocabulary__Group__3 : rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 ;
    public final void rule__Vocabulary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1741:1: ( rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 )
            // InternalRdfMapping.g:1742:2: rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Vocabulary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__3"


    // $ANTLR start "rule__Vocabulary__Group__3__Impl"
    // InternalRdfMapping.g:1749:1: rule__Vocabulary__Group__3__Impl : ( ( rule__Vocabulary__PrefixAssignment_3 ) ) ;
    public final void rule__Vocabulary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1753:1: ( ( ( rule__Vocabulary__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:1754:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:1754:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:1755:2: ( rule__Vocabulary__PrefixAssignment_3 )
            {
             before(grammarAccess.getVocabularyAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:1756:2: ( rule__Vocabulary__PrefixAssignment_3 )
            // InternalRdfMapping.g:1756:3: rule__Vocabulary__PrefixAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVocabularyAccess().getPrefixAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__3__Impl"


    // $ANTLR start "rule__Vocabulary__Group__4"
    // InternalRdfMapping.g:1764:1: rule__Vocabulary__Group__4 : rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 ;
    public final void rule__Vocabulary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1768:1: ( rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 )
            // InternalRdfMapping.g:1769:2: rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Vocabulary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__4"


    // $ANTLR start "rule__Vocabulary__Group__4__Impl"
    // InternalRdfMapping.g:1776:1: rule__Vocabulary__Group__4__Impl : ( ( rule__Vocabulary__Group_4__0 )? ) ;
    public final void rule__Vocabulary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1780:1: ( ( ( rule__Vocabulary__Group_4__0 )? ) )
            // InternalRdfMapping.g:1781:1: ( ( rule__Vocabulary__Group_4__0 )? )
            {
            // InternalRdfMapping.g:1781:1: ( ( rule__Vocabulary__Group_4__0 )? )
            // InternalRdfMapping.g:1782:2: ( rule__Vocabulary__Group_4__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_4()); 
            // InternalRdfMapping.g:1783:2: ( rule__Vocabulary__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:1783:3: rule__Vocabulary__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vocabulary__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVocabularyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__4__Impl"


    // $ANTLR start "rule__Vocabulary__Group__5"
    // InternalRdfMapping.g:1791:1: rule__Vocabulary__Group__5 : rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 ;
    public final void rule__Vocabulary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1795:1: ( rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 )
            // InternalRdfMapping.g:1796:2: rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Vocabulary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__5"


    // $ANTLR start "rule__Vocabulary__Group__5__Impl"
    // InternalRdfMapping.g:1803:1: rule__Vocabulary__Group__5__Impl : ( ( rule__Vocabulary__Group_5__0 )? ) ;
    public final void rule__Vocabulary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1807:1: ( ( ( rule__Vocabulary__Group_5__0 )? ) )
            // InternalRdfMapping.g:1808:1: ( ( rule__Vocabulary__Group_5__0 )? )
            {
            // InternalRdfMapping.g:1808:1: ( ( rule__Vocabulary__Group_5__0 )? )
            // InternalRdfMapping.g:1809:2: ( rule__Vocabulary__Group_5__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_5()); 
            // InternalRdfMapping.g:1810:2: ( rule__Vocabulary__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdfMapping.g:1810:3: rule__Vocabulary__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vocabulary__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVocabularyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__5__Impl"


    // $ANTLR start "rule__Vocabulary__Group__6"
    // InternalRdfMapping.g:1818:1: rule__Vocabulary__Group__6 : rule__Vocabulary__Group__6__Impl ;
    public final void rule__Vocabulary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1822:1: ( rule__Vocabulary__Group__6__Impl )
            // InternalRdfMapping.g:1823:2: rule__Vocabulary__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__6"


    // $ANTLR start "rule__Vocabulary__Group__6__Impl"
    // InternalRdfMapping.g:1829:1: rule__Vocabulary__Group__6__Impl : ( '}' ) ;
    public final void rule__Vocabulary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1833:1: ( ( '}' ) )
            // InternalRdfMapping.g:1834:1: ( '}' )
            {
            // InternalRdfMapping.g:1834:1: ( '}' )
            // InternalRdfMapping.g:1835:2: '}'
            {
             before(grammarAccess.getVocabularyAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group__6__Impl"


    // $ANTLR start "rule__Vocabulary__Group_4__0"
    // InternalRdfMapping.g:1845:1: rule__Vocabulary__Group_4__0 : rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 ;
    public final void rule__Vocabulary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1849:1: ( rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 )
            // InternalRdfMapping.g:1850:2: rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Vocabulary__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_4__0"


    // $ANTLR start "rule__Vocabulary__Group_4__0__Impl"
    // InternalRdfMapping.g:1857:1: rule__Vocabulary__Group_4__0__Impl : ( 'classes' ) ;
    public final void rule__Vocabulary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1861:1: ( ( 'classes' ) )
            // InternalRdfMapping.g:1862:1: ( 'classes' )
            {
            // InternalRdfMapping.g:1862:1: ( 'classes' )
            // InternalRdfMapping.g:1863:2: 'classes'
            {
             before(grammarAccess.getVocabularyAccess().getClassesKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getClassesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_4__0__Impl"


    // $ANTLR start "rule__Vocabulary__Group_4__1"
    // InternalRdfMapping.g:1872:1: rule__Vocabulary__Group_4__1 : rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 ;
    public final void rule__Vocabulary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1876:1: ( rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 )
            // InternalRdfMapping.g:1877:2: rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__Vocabulary__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_4__1"


    // $ANTLR start "rule__Vocabulary__Group_4__1__Impl"
    // InternalRdfMapping.g:1884:1: rule__Vocabulary__Group_4__1__Impl : ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) ;
    public final void rule__Vocabulary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1888:1: ( ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) )
            // InternalRdfMapping.g:1889:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            {
            // InternalRdfMapping.g:1889:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            // InternalRdfMapping.g:1890:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getClassesAssignment_4_1()); 
            // InternalRdfMapping.g:1891:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRdfMapping.g:1891:3: rule__Vocabulary__ClassesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__ClassesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getVocabularyAccess().getClassesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_4__1__Impl"


    // $ANTLR start "rule__Vocabulary__Group_4__2"
    // InternalRdfMapping.g:1899:1: rule__Vocabulary__Group_4__2 : rule__Vocabulary__Group_4__2__Impl ;
    public final void rule__Vocabulary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1903:1: ( rule__Vocabulary__Group_4__2__Impl )
            // InternalRdfMapping.g:1904:2: rule__Vocabulary__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_4__2"


    // $ANTLR start "rule__Vocabulary__Group_4__2__Impl"
    // InternalRdfMapping.g:1910:1: rule__Vocabulary__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1914:1: ( ( ';' ) )
            // InternalRdfMapping.g:1915:1: ( ';' )
            {
            // InternalRdfMapping.g:1915:1: ( ';' )
            // InternalRdfMapping.g:1916:2: ';'
            {
             before(grammarAccess.getVocabularyAccess().getSemicolonKeyword_4_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_4__2__Impl"


    // $ANTLR start "rule__Vocabulary__Group_5__0"
    // InternalRdfMapping.g:1926:1: rule__Vocabulary__Group_5__0 : rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 ;
    public final void rule__Vocabulary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1930:1: ( rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 )
            // InternalRdfMapping.g:1931:2: rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Vocabulary__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_5__0"


    // $ANTLR start "rule__Vocabulary__Group_5__0__Impl"
    // InternalRdfMapping.g:1938:1: rule__Vocabulary__Group_5__0__Impl : ( 'properties' ) ;
    public final void rule__Vocabulary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1942:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:1943:1: ( 'properties' )
            {
            // InternalRdfMapping.g:1943:1: ( 'properties' )
            // InternalRdfMapping.g:1944:2: 'properties'
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_5__0__Impl"


    // $ANTLR start "rule__Vocabulary__Group_5__1"
    // InternalRdfMapping.g:1953:1: rule__Vocabulary__Group_5__1 : rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 ;
    public final void rule__Vocabulary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1957:1: ( rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 )
            // InternalRdfMapping.g:1958:2: rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__Vocabulary__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_5__1"


    // $ANTLR start "rule__Vocabulary__Group_5__1__Impl"
    // InternalRdfMapping.g:1965:1: rule__Vocabulary__Group_5__1__Impl : ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) ;
    public final void rule__Vocabulary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1969:1: ( ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) )
            // InternalRdfMapping.g:1970:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            {
            // InternalRdfMapping.g:1970:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            // InternalRdfMapping.g:1971:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesAssignment_5_1()); 
            // InternalRdfMapping.g:1972:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRdfMapping.g:1972:3: rule__Vocabulary__PropertiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__PropertiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getVocabularyAccess().getPropertiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_5__1__Impl"


    // $ANTLR start "rule__Vocabulary__Group_5__2"
    // InternalRdfMapping.g:1980:1: rule__Vocabulary__Group_5__2 : rule__Vocabulary__Group_5__2__Impl ;
    public final void rule__Vocabulary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1984:1: ( rule__Vocabulary__Group_5__2__Impl )
            // InternalRdfMapping.g:1985:2: rule__Vocabulary__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_5__2"


    // $ANTLR start "rule__Vocabulary__Group_5__2__Impl"
    // InternalRdfMapping.g:1991:1: rule__Vocabulary__Group_5__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1995:1: ( ( ';' ) )
            // InternalRdfMapping.g:1996:1: ( ';' )
            {
            // InternalRdfMapping.g:1996:1: ( ';' )
            // InternalRdfMapping.g:1997:2: ';'
            {
             before(grammarAccess.getVocabularyAccess().getSemicolonKeyword_5_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__Group_5__2__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // InternalRdfMapping.g:2007:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2011:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalRdfMapping.g:2012:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Prefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0"


    // $ANTLR start "rule__Prefix__Group__0__Impl"
    // InternalRdfMapping.g:2019:1: rule__Prefix__Group__0__Impl : ( 'prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2023:1: ( ( 'prefix' ) )
            // InternalRdfMapping.g:2024:1: ( 'prefix' )
            {
            // InternalRdfMapping.g:2024:1: ( 'prefix' )
            // InternalRdfMapping.g:2025:2: 'prefix'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // InternalRdfMapping.g:2034:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2038:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalRdfMapping.g:2039:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Prefix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prefix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1"


    // $ANTLR start "rule__Prefix__Group__1__Impl"
    // InternalRdfMapping.g:2046:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__LabelAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2050:1: ( ( ( rule__Prefix__LabelAssignment_1 ) ) )
            // InternalRdfMapping.g:2051:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            {
            // InternalRdfMapping.g:2051:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            // InternalRdfMapping.g:2052:2: ( rule__Prefix__LabelAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getLabelAssignment_1()); 
            // InternalRdfMapping.g:2053:2: ( rule__Prefix__LabelAssignment_1 )
            // InternalRdfMapping.g:2053:3: rule__Prefix__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__Prefix__Group__2"
    // InternalRdfMapping.g:2061:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl rule__Prefix__Group__3 ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2065:1: ( rule__Prefix__Group__2__Impl rule__Prefix__Group__3 )
            // InternalRdfMapping.g:2066:2: rule__Prefix__Group__2__Impl rule__Prefix__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Prefix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prefix__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2"


    // $ANTLR start "rule__Prefix__Group__2__Impl"
    // InternalRdfMapping.g:2073:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__IriAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2077:1: ( ( ( rule__Prefix__IriAssignment_2 ) ) )
            // InternalRdfMapping.g:2078:1: ( ( rule__Prefix__IriAssignment_2 ) )
            {
            // InternalRdfMapping.g:2078:1: ( ( rule__Prefix__IriAssignment_2 ) )
            // InternalRdfMapping.g:2079:2: ( rule__Prefix__IriAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getIriAssignment_2()); 
            // InternalRdfMapping.g:2080:2: ( rule__Prefix__IriAssignment_2 )
            // InternalRdfMapping.g:2080:3: rule__Prefix__IriAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__IriAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getIriAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2__Impl"


    // $ANTLR start "rule__Prefix__Group__3"
    // InternalRdfMapping.g:2088:1: rule__Prefix__Group__3 : rule__Prefix__Group__3__Impl ;
    public final void rule__Prefix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2092:1: ( rule__Prefix__Group__3__Impl )
            // InternalRdfMapping.g:2093:2: rule__Prefix__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__3"


    // $ANTLR start "rule__Prefix__Group__3__Impl"
    // InternalRdfMapping.g:2099:1: rule__Prefix__Group__3__Impl : ( ';' ) ;
    public final void rule__Prefix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2103:1: ( ( ';' ) )
            // InternalRdfMapping.g:2104:1: ( ';' )
            {
            // InternalRdfMapping.g:2104:1: ( ';' )
            // InternalRdfMapping.g:2105:2: ';'
            {
             before(grammarAccess.getPrefixAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalRdfMapping.g:2115:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2119:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalRdfMapping.g:2120:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalRdfMapping.g:2127:1: rule__Mapping__Group__0__Impl : ( 'map' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2131:1: ( ( 'map' ) )
            // InternalRdfMapping.g:2132:1: ( 'map' )
            {
            // InternalRdfMapping.g:2132:1: ( 'map' )
            // InternalRdfMapping.g:2133:2: 'map'
            {
             before(grammarAccess.getMappingAccess().getMapKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalRdfMapping.g:2142:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2146:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalRdfMapping.g:2147:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalRdfMapping.g:2154:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2158:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2159:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2159:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // InternalRdfMapping.g:2160:2: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2161:2: ( rule__Mapping__NameAssignment_1 )
            // InternalRdfMapping.g:2161:3: rule__Mapping__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalRdfMapping.g:2169:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2173:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalRdfMapping.g:2174:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalRdfMapping.g:2181:1: rule__Mapping__Group__2__Impl : ( 'from' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2185:1: ( ( 'from' ) )
            // InternalRdfMapping.g:2186:1: ( 'from' )
            {
            // InternalRdfMapping.g:2186:1: ( 'from' )
            // InternalRdfMapping.g:2187:2: 'from'
            {
             before(grammarAccess.getMappingAccess().getFromKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // InternalRdfMapping.g:2196:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2200:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalRdfMapping.g:2201:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // InternalRdfMapping.g:2208:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__SourceAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2212:1: ( ( ( rule__Mapping__SourceAssignment_3 ) ) )
            // InternalRdfMapping.g:2213:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            {
            // InternalRdfMapping.g:2213:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            // InternalRdfMapping.g:2214:2: ( rule__Mapping__SourceAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getSourceAssignment_3()); 
            // InternalRdfMapping.g:2215:2: ( rule__Mapping__SourceAssignment_3 )
            // InternalRdfMapping.g:2215:3: rule__Mapping__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // InternalRdfMapping.g:2223:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2227:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalRdfMapping.g:2228:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Mapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // InternalRdfMapping.g:2235:1: rule__Mapping__Group__4__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2239:1: ( ( '{' ) )
            // InternalRdfMapping.g:2240:1: ( '{' )
            {
            // InternalRdfMapping.g:2240:1: ( '{' )
            // InternalRdfMapping.g:2241:2: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group__5"
    // InternalRdfMapping.g:2250:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2254:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalRdfMapping.g:2255:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Mapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5"


    // $ANTLR start "rule__Mapping__Group__5__Impl"
    // InternalRdfMapping.g:2262:1: rule__Mapping__Group__5__Impl : ( 'subject' ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2266:1: ( ( 'subject' ) )
            // InternalRdfMapping.g:2267:1: ( 'subject' )
            {
            // InternalRdfMapping.g:2267:1: ( 'subject' )
            // InternalRdfMapping.g:2268:2: 'subject'
            {
             before(grammarAccess.getMappingAccess().getSubjectKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getSubjectKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5__Impl"


    // $ANTLR start "rule__Mapping__Group__6"
    // InternalRdfMapping.g:2277:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2281:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalRdfMapping.g:2282:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Mapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6"


    // $ANTLR start "rule__Mapping__Group__6__Impl"
    // InternalRdfMapping.g:2289:1: rule__Mapping__Group__6__Impl : ( 'template' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2293:1: ( ( 'template' ) )
            // InternalRdfMapping.g:2294:1: ( 'template' )
            {
            // InternalRdfMapping.g:2294:1: ( 'template' )
            // InternalRdfMapping.g:2295:2: 'template'
            {
             before(grammarAccess.getMappingAccess().getTemplateKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getTemplateKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6__Impl"


    // $ANTLR start "rule__Mapping__Group__7"
    // InternalRdfMapping.g:2304:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl rule__Mapping__Group__8 ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2308:1: ( rule__Mapping__Group__7__Impl rule__Mapping__Group__8 )
            // InternalRdfMapping.g:2309:2: rule__Mapping__Group__7__Impl rule__Mapping__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Mapping__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7"


    // $ANTLR start "rule__Mapping__Group__7__Impl"
    // InternalRdfMapping.g:2316:1: rule__Mapping__Group__7__Impl : ( ( rule__Mapping__PatternAssignment_7 ) ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2320:1: ( ( ( rule__Mapping__PatternAssignment_7 ) ) )
            // InternalRdfMapping.g:2321:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            {
            // InternalRdfMapping.g:2321:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            // InternalRdfMapping.g:2322:2: ( rule__Mapping__PatternAssignment_7 )
            {
             before(grammarAccess.getMappingAccess().getPatternAssignment_7()); 
            // InternalRdfMapping.g:2323:2: ( rule__Mapping__PatternAssignment_7 )
            // InternalRdfMapping.g:2323:3: rule__Mapping__PatternAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__PatternAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPatternAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7__Impl"


    // $ANTLR start "rule__Mapping__Group__8"
    // InternalRdfMapping.g:2331:1: rule__Mapping__Group__8 : rule__Mapping__Group__8__Impl rule__Mapping__Group__9 ;
    public final void rule__Mapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2335:1: ( rule__Mapping__Group__8__Impl rule__Mapping__Group__9 )
            // InternalRdfMapping.g:2336:2: rule__Mapping__Group__8__Impl rule__Mapping__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Mapping__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__8"


    // $ANTLR start "rule__Mapping__Group__8__Impl"
    // InternalRdfMapping.g:2343:1: rule__Mapping__Group__8__Impl : ( 'with' ) ;
    public final void rule__Mapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2347:1: ( ( 'with' ) )
            // InternalRdfMapping.g:2348:1: ( 'with' )
            {
            // InternalRdfMapping.g:2348:1: ( 'with' )
            // InternalRdfMapping.g:2349:2: 'with'
            {
             before(grammarAccess.getMappingAccess().getWithKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getWithKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__8__Impl"


    // $ANTLR start "rule__Mapping__Group__9"
    // InternalRdfMapping.g:2358:1: rule__Mapping__Group__9 : rule__Mapping__Group__9__Impl rule__Mapping__Group__10 ;
    public final void rule__Mapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2362:1: ( rule__Mapping__Group__9__Impl rule__Mapping__Group__10 )
            // InternalRdfMapping.g:2363:2: rule__Mapping__Group__9__Impl rule__Mapping__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__Mapping__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__9"


    // $ANTLR start "rule__Mapping__Group__9__Impl"
    // InternalRdfMapping.g:2370:1: rule__Mapping__Group__9__Impl : ( ( rule__Mapping__ReferenceAssignment_9 ) ) ;
    public final void rule__Mapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2374:1: ( ( ( rule__Mapping__ReferenceAssignment_9 ) ) )
            // InternalRdfMapping.g:2375:1: ( ( rule__Mapping__ReferenceAssignment_9 ) )
            {
            // InternalRdfMapping.g:2375:1: ( ( rule__Mapping__ReferenceAssignment_9 ) )
            // InternalRdfMapping.g:2376:2: ( rule__Mapping__ReferenceAssignment_9 )
            {
             before(grammarAccess.getMappingAccess().getReferenceAssignment_9()); 
            // InternalRdfMapping.g:2377:2: ( rule__Mapping__ReferenceAssignment_9 )
            // InternalRdfMapping.g:2377:3: rule__Mapping__ReferenceAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ReferenceAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getReferenceAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__9__Impl"


    // $ANTLR start "rule__Mapping__Group__10"
    // InternalRdfMapping.g:2385:1: rule__Mapping__Group__10 : rule__Mapping__Group__10__Impl rule__Mapping__Group__11 ;
    public final void rule__Mapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2389:1: ( rule__Mapping__Group__10__Impl rule__Mapping__Group__11 )
            // InternalRdfMapping.g:2390:2: rule__Mapping__Group__10__Impl rule__Mapping__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__Mapping__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__10"


    // $ANTLR start "rule__Mapping__Group__10__Impl"
    // InternalRdfMapping.g:2397:1: rule__Mapping__Group__10__Impl : ( ( rule__Mapping__Group_10__0 )? ) ;
    public final void rule__Mapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2401:1: ( ( ( rule__Mapping__Group_10__0 )? ) )
            // InternalRdfMapping.g:2402:1: ( ( rule__Mapping__Group_10__0 )? )
            {
            // InternalRdfMapping.g:2402:1: ( ( rule__Mapping__Group_10__0 )? )
            // InternalRdfMapping.g:2403:2: ( rule__Mapping__Group_10__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_10()); 
            // InternalRdfMapping.g:2404:2: ( rule__Mapping__Group_10__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdfMapping.g:2404:3: rule__Mapping__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__10__Impl"


    // $ANTLR start "rule__Mapping__Group__11"
    // InternalRdfMapping.g:2412:1: rule__Mapping__Group__11 : rule__Mapping__Group__11__Impl rule__Mapping__Group__12 ;
    public final void rule__Mapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2416:1: ( rule__Mapping__Group__11__Impl rule__Mapping__Group__12 )
            // InternalRdfMapping.g:2417:2: rule__Mapping__Group__11__Impl rule__Mapping__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Mapping__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__11"


    // $ANTLR start "rule__Mapping__Group__11__Impl"
    // InternalRdfMapping.g:2424:1: rule__Mapping__Group__11__Impl : ( ( rule__Mapping__Group_11__0 )? ) ;
    public final void rule__Mapping__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2428:1: ( ( ( rule__Mapping__Group_11__0 )? ) )
            // InternalRdfMapping.g:2429:1: ( ( rule__Mapping__Group_11__0 )? )
            {
            // InternalRdfMapping.g:2429:1: ( ( rule__Mapping__Group_11__0 )? )
            // InternalRdfMapping.g:2430:2: ( rule__Mapping__Group_11__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_11()); 
            // InternalRdfMapping.g:2431:2: ( rule__Mapping__Group_11__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdfMapping.g:2431:3: rule__Mapping__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__11__Impl"


    // $ANTLR start "rule__Mapping__Group__12"
    // InternalRdfMapping.g:2439:1: rule__Mapping__Group__12 : rule__Mapping__Group__12__Impl ;
    public final void rule__Mapping__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2443:1: ( rule__Mapping__Group__12__Impl )
            // InternalRdfMapping.g:2444:2: rule__Mapping__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__12"


    // $ANTLR start "rule__Mapping__Group__12__Impl"
    // InternalRdfMapping.g:2450:1: rule__Mapping__Group__12__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2454:1: ( ( '}' ) )
            // InternalRdfMapping.g:2455:1: ( '}' )
            {
            // InternalRdfMapping.g:2455:1: ( '}' )
            // InternalRdfMapping.g:2456:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__12__Impl"


    // $ANTLR start "rule__Mapping__Group_10__0"
    // InternalRdfMapping.g:2466:1: rule__Mapping__Group_10__0 : rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 ;
    public final void rule__Mapping__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2470:1: ( rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 )
            // InternalRdfMapping.g:2471:2: rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1
            {
            pushFollow(FOLLOW_10);
            rule__Mapping__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_10__0"


    // $ANTLR start "rule__Mapping__Group_10__0__Impl"
    // InternalRdfMapping.g:2478:1: rule__Mapping__Group_10__0__Impl : ( 'types' ) ;
    public final void rule__Mapping__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2482:1: ( ( 'types' ) )
            // InternalRdfMapping.g:2483:1: ( 'types' )
            {
            // InternalRdfMapping.g:2483:1: ( 'types' )
            // InternalRdfMapping.g:2484:2: 'types'
            {
             before(grammarAccess.getMappingAccess().getTypesKeyword_10_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getTypesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_10__0__Impl"


    // $ANTLR start "rule__Mapping__Group_10__1"
    // InternalRdfMapping.g:2493:1: rule__Mapping__Group_10__1 : rule__Mapping__Group_10__1__Impl ;
    public final void rule__Mapping__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2497:1: ( rule__Mapping__Group_10__1__Impl )
            // InternalRdfMapping.g:2498:2: rule__Mapping__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_10__1"


    // $ANTLR start "rule__Mapping__Group_10__1__Impl"
    // InternalRdfMapping.g:2504:1: rule__Mapping__Group_10__1__Impl : ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) ;
    public final void rule__Mapping__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2508:1: ( ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) )
            // InternalRdfMapping.g:2509:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            {
            // InternalRdfMapping.g:2509:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            // InternalRdfMapping.g:2510:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            {
            // InternalRdfMapping.g:2510:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) )
            // InternalRdfMapping.g:2511:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:2512:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            // InternalRdfMapping.g:2512:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 

            }

            // InternalRdfMapping.g:2515:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            // InternalRdfMapping.g:2516:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:2517:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRdfMapping.g:2517:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_10__1__Impl"


    // $ANTLR start "rule__Mapping__Group_11__0"
    // InternalRdfMapping.g:2527:1: rule__Mapping__Group_11__0 : rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 ;
    public final void rule__Mapping__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2531:1: ( rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 )
            // InternalRdfMapping.g:2532:2: rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1
            {
            pushFollow(FOLLOW_10);
            rule__Mapping__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_11__0"


    // $ANTLR start "rule__Mapping__Group_11__0__Impl"
    // InternalRdfMapping.g:2539:1: rule__Mapping__Group_11__0__Impl : ( 'properties' ) ;
    public final void rule__Mapping__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2543:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:2544:1: ( 'properties' )
            {
            // InternalRdfMapping.g:2544:1: ( 'properties' )
            // InternalRdfMapping.g:2545:2: 'properties'
            {
             before(grammarAccess.getMappingAccess().getPropertiesKeyword_11_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getPropertiesKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_11__0__Impl"


    // $ANTLR start "rule__Mapping__Group_11__1"
    // InternalRdfMapping.g:2554:1: rule__Mapping__Group_11__1 : rule__Mapping__Group_11__1__Impl ;
    public final void rule__Mapping__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2558:1: ( rule__Mapping__Group_11__1__Impl )
            // InternalRdfMapping.g:2559:2: rule__Mapping__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_11__1"


    // $ANTLR start "rule__Mapping__Group_11__1__Impl"
    // InternalRdfMapping.g:2565:1: rule__Mapping__Group_11__1__Impl : ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) ;
    public final void rule__Mapping__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2569:1: ( ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) )
            // InternalRdfMapping.g:2570:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            {
            // InternalRdfMapping.g:2570:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            // InternalRdfMapping.g:2571:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            {
            // InternalRdfMapping.g:2571:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) )
            // InternalRdfMapping.g:2572:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:2573:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            // InternalRdfMapping.g:2573:4: rule__Mapping__PoMappingsAssignment_11_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__PoMappingsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 

            }

            // InternalRdfMapping.g:2576:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            // InternalRdfMapping.g:2577:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:2578:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRdfMapping.g:2578:4: rule__Mapping__PoMappingsAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__PoMappingsAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_11__1__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group__0"
    // InternalRdfMapping.g:2588:1: rule__PredicateObjectMapping__Group__0 : rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 ;
    public final void rule__PredicateObjectMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2592:1: ( rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 )
            // InternalRdfMapping.g:2593:2: rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__PredicateObjectMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__0"


    // $ANTLR start "rule__PredicateObjectMapping__Group__0__Impl"
    // InternalRdfMapping.g:2600:1: rule__PredicateObjectMapping__Group__0__Impl : ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) ;
    public final void rule__PredicateObjectMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2604:1: ( ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) )
            // InternalRdfMapping.g:2605:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            {
            // InternalRdfMapping.g:2605:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            // InternalRdfMapping.g:2606:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyAssignment_0()); 
            // InternalRdfMapping.g:2607:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            // InternalRdfMapping.g:2607:3: rule__PredicateObjectMapping__PropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectMappingAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__0__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group__1"
    // InternalRdfMapping.g:2615:1: rule__PredicateObjectMapping__Group__1 : rule__PredicateObjectMapping__Group__1__Impl rule__PredicateObjectMapping__Group__2 ;
    public final void rule__PredicateObjectMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2619:1: ( rule__PredicateObjectMapping__Group__1__Impl rule__PredicateObjectMapping__Group__2 )
            // InternalRdfMapping.g:2620:2: rule__PredicateObjectMapping__Group__1__Impl rule__PredicateObjectMapping__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PredicateObjectMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__1"


    // $ANTLR start "rule__PredicateObjectMapping__Group__1__Impl"
    // InternalRdfMapping.g:2627:1: rule__PredicateObjectMapping__Group__1__Impl : ( 'from' ) ;
    public final void rule__PredicateObjectMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2631:1: ( ( 'from' ) )
            // InternalRdfMapping.g:2632:1: ( 'from' )
            {
            // InternalRdfMapping.g:2632:1: ( 'from' )
            // InternalRdfMapping.g:2633:2: 'from'
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getFromKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectMappingAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__1__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group__2"
    // InternalRdfMapping.g:2642:1: rule__PredicateObjectMapping__Group__2 : rule__PredicateObjectMapping__Group__2__Impl ;
    public final void rule__PredicateObjectMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2646:1: ( rule__PredicateObjectMapping__Group__2__Impl )
            // InternalRdfMapping.g:2647:2: rule__PredicateObjectMapping__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__2"


    // $ANTLR start "rule__PredicateObjectMapping__Group__2__Impl"
    // InternalRdfMapping.g:2653:1: rule__PredicateObjectMapping__Group__2__Impl : ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) ) ;
    public final void rule__PredicateObjectMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2657:1: ( ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) ) )
            // InternalRdfMapping.g:2658:1: ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) )
            {
            // InternalRdfMapping.g:2658:1: ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) )
            // InternalRdfMapping.g:2659:2: ( rule__PredicateObjectMapping__ReferenceAssignment_2 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getReferenceAssignment_2()); 
            // InternalRdfMapping.g:2660:2: ( rule__PredicateObjectMapping__ReferenceAssignment_2 )
            // InternalRdfMapping.g:2660:3: rule__PredicateObjectMapping__ReferenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__ReferenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectMappingAccess().getReferenceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalRdfMapping.g:2669:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2673:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRdfMapping.g:2674:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalRdfMapping.g:2681:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2685:1: ( ( 'import' ) )
            // InternalRdfMapping.g:2686:1: ( 'import' )
            {
            // InternalRdfMapping.g:2686:1: ( 'import' )
            // InternalRdfMapping.g:2687:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalRdfMapping.g:2696:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2700:1: ( rule__Import__Group__1__Impl )
            // InternalRdfMapping.g:2701:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalRdfMapping.g:2707:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2711:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRdfMapping.g:2712:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRdfMapping.g:2712:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRdfMapping.g:2713:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalRdfMapping.g:2714:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRdfMapping.g:2714:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalRdfMapping.g:2723:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2727:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRdfMapping.g:2728:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalRdfMapping.g:2735:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2739:1: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:2740:1: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:2740:1: ( ruleQualifiedName )
            // InternalRdfMapping.g:2741:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalRdfMapping.g:2750:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2754:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRdfMapping.g:2755:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalRdfMapping.g:2761:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2765:1: ( ( ( '.*' )? ) )
            // InternalRdfMapping.g:2766:1: ( ( '.*' )? )
            {
            // InternalRdfMapping.g:2766:1: ( ( '.*' )? )
            // InternalRdfMapping.g:2767:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRdfMapping.g:2768:2: ( '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdfMapping.g:2768:3: '.*'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalRdfMapping.g:2777:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2781:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRdfMapping.g:2782:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalRdfMapping.g:2789:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2793:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:2794:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:2794:1: ( RULE_ID )
            // InternalRdfMapping.g:2795:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalRdfMapping.g:2804:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2808:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRdfMapping.g:2809:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalRdfMapping.g:2815:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2819:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRdfMapping.g:2820:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRdfMapping.g:2820:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRdfMapping.g:2821:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRdfMapping.g:2822:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRdfMapping.g:2822:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalRdfMapping.g:2831:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2835:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRdfMapping.g:2836:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalRdfMapping.g:2843:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2847:1: ( ( '.' ) )
            // InternalRdfMapping.g:2848:1: ( '.' )
            {
            // InternalRdfMapping.g:2848:1: ( '.' )
            // InternalRdfMapping.g:2849:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalRdfMapping.g:2858:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2862:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRdfMapping.g:2863:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalRdfMapping.g:2869:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2873:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:2874:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:2874:1: ( RULE_ID )
            // InternalRdfMapping.g:2875:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalRdfMapping.g:2885:1: rule__Domainmodel__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2889:1: ( ( ruleElement ) )
            // InternalRdfMapping.g:2890:2: ( ruleElement )
            {
            // InternalRdfMapping.g:2890:2: ( ruleElement )
            // InternalRdfMapping.g:2891:3: ruleElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__SourceTypesDefinition__TypesAssignment_3"
    // InternalRdfMapping.g:2900:1: rule__SourceTypesDefinition__TypesAssignment_3 : ( ruleSourceType ) ;
    public final void rule__SourceTypesDefinition__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2904:1: ( ( ruleSourceType ) )
            // InternalRdfMapping.g:2905:2: ( ruleSourceType )
            {
            // InternalRdfMapping.g:2905:2: ( ruleSourceType )
            // InternalRdfMapping.g:2906:3: ruleSourceType
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getTypesSourceTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceType();

            state._fsp--;

             after(grammarAccess.getSourceTypesDefinitionAccess().getTypesSourceTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceTypesDefinition__TypesAssignment_3"


    // $ANTLR start "rule__SourceType__NameAssignment_0"
    // InternalRdfMapping.g:2915:1: rule__SourceType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SourceType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2919:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:2920:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:2920:2: ( RULE_ID )
            // InternalRdfMapping.g:2921:3: RULE_ID
            {
             before(grammarAccess.getSourceTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__NameAssignment_0"


    // $ANTLR start "rule__SourceType__ReferenceFormulationAssignment_2"
    // InternalRdfMapping.g:2930:1: rule__SourceType__ReferenceFormulationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SourceType__ReferenceFormulationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2934:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:2935:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:2935:2: ( RULE_STRING )
            // InternalRdfMapping.g:2936:3: RULE_STRING
            {
             before(grammarAccess.getSourceTypeAccess().getReferenceFormulationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceTypeAccess().getReferenceFormulationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceType__ReferenceFormulationAssignment_2"


    // $ANTLR start "rule__SourceGroup__NameAssignment_1"
    // InternalRdfMapping.g:2945:1: rule__SourceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SourceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2949:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:2950:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:2950:2: ( RULE_ID )
            // InternalRdfMapping.g:2951:3: RULE_ID
            {
             before(grammarAccess.getSourceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__NameAssignment_1"


    // $ANTLR start "rule__SourceGroup__TypeAssignment_4"
    // InternalRdfMapping.g:2960:1: rule__SourceGroup__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SourceGroup__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2964:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:2965:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:2965:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:2966:3: ( RULE_ID )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0()); 
            // InternalRdfMapping.g:2967:3: ( RULE_ID )
            // InternalRdfMapping.g:2968:4: RULE_ID
            {
             before(grammarAccess.getSourceGroupAccess().getTypeSourceTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getTypeSourceTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__TypeAssignment_4"


    // $ANTLR start "rule__SourceGroup__SourceAssignment_6_1"
    // InternalRdfMapping.g:2979:1: rule__SourceGroup__SourceAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__SourceGroup__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2983:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:2984:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:2984:2: ( RULE_STRING )
            // InternalRdfMapping.g:2985:3: RULE_STRING
            {
             before(grammarAccess.getSourceGroupAccess().getSourceSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getSourceSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__SourceAssignment_6_1"


    // $ANTLR start "rule__SourceGroup__LogicalSourcesAssignment_7"
    // InternalRdfMapping.g:2994:1: rule__SourceGroup__LogicalSourcesAssignment_7 : ( ruleLogicalSource ) ;
    public final void rule__SourceGroup__LogicalSourcesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2998:1: ( ( ruleLogicalSource ) )
            // InternalRdfMapping.g:2999:2: ( ruleLogicalSource )
            {
            // InternalRdfMapping.g:2999:2: ( ruleLogicalSource )
            // InternalRdfMapping.g:3000:3: ruleLogicalSource
            {
             before(grammarAccess.getSourceGroupAccess().getLogicalSourcesLogicalSourceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalSource();

            state._fsp--;

             after(grammarAccess.getSourceGroupAccess().getLogicalSourcesLogicalSourceParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceGroup__LogicalSourcesAssignment_7"


    // $ANTLR start "rule__LogicalSource__NameAssignment_1"
    // InternalRdfMapping.g:3009:1: rule__LogicalSource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicalSource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3013:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3014:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3014:2: ( RULE_ID )
            // InternalRdfMapping.g:3015:3: RULE_ID
            {
             before(grammarAccess.getLogicalSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__NameAssignment_1"


    // $ANTLR start "rule__LogicalSource__TypeAssignment_3_1"
    // InternalRdfMapping.g:3024:1: rule__LogicalSource__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LogicalSource__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3028:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:3029:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:3029:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3030:3: ( RULE_ID )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0()); 
            // InternalRdfMapping.g:3031:3: ( RULE_ID )
            // InternalRdfMapping.g:3032:4: RULE_ID
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__TypeAssignment_3_1"


    // $ANTLR start "rule__LogicalSource__SourceAssignment_4_1"
    // InternalRdfMapping.g:3043:1: rule__LogicalSource__SourceAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3047:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3048:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3048:2: ( RULE_STRING )
            // InternalRdfMapping.g:3049:3: RULE_STRING
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getSourceSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__SourceAssignment_4_1"


    // $ANTLR start "rule__LogicalSource__IteratorAssignment_5_1"
    // InternalRdfMapping.g:3058:1: rule__LogicalSource__IteratorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__IteratorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3062:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3063:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3063:2: ( RULE_STRING )
            // InternalRdfMapping.g:3064:3: RULE_STRING
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLogicalSourceAccess().getIteratorSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__IteratorAssignment_5_1"


    // $ANTLR start "rule__LogicalSource__ReferencablesAssignment_8"
    // InternalRdfMapping.g:3073:1: rule__LogicalSource__ReferencablesAssignment_8 : ( ruleReferenceable ) ;
    public final void rule__LogicalSource__ReferencablesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3077:1: ( ( ruleReferenceable ) )
            // InternalRdfMapping.g:3078:2: ( ruleReferenceable )
            {
            // InternalRdfMapping.g:3078:2: ( ruleReferenceable )
            // InternalRdfMapping.g:3079:3: ruleReferenceable
            {
             before(grammarAccess.getLogicalSourceAccess().getReferencablesReferenceableParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceable();

            state._fsp--;

             after(grammarAccess.getLogicalSourceAccess().getReferencablesReferenceableParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalSource__ReferencablesAssignment_8"


    // $ANTLR start "rule__Referenceable__NameAssignment_0"
    // InternalRdfMapping.g:3088:1: rule__Referenceable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Referenceable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3092:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3093:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3093:2: ( RULE_ID )
            // InternalRdfMapping.g:3094:3: RULE_ID
            {
             before(grammarAccess.getReferenceableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Referenceable__NameAssignment_0"


    // $ANTLR start "rule__Referenceable__ValueAssignment_1"
    // InternalRdfMapping.g:3103:1: rule__Referenceable__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Referenceable__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3107:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3108:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3108:2: ( RULE_STRING )
            // InternalRdfMapping.g:3109:3: RULE_STRING
            {
             before(grammarAccess.getReferenceableAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceableAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Referenceable__ValueAssignment_1"


    // $ANTLR start "rule__Vocabulary__NameAssignment_1"
    // InternalRdfMapping.g:3118:1: rule__Vocabulary__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vocabulary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3122:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3123:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3123:2: ( RULE_ID )
            // InternalRdfMapping.g:3124:3: RULE_ID
            {
             before(grammarAccess.getVocabularyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVocabularyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__NameAssignment_1"


    // $ANTLR start "rule__Vocabulary__PrefixAssignment_3"
    // InternalRdfMapping.g:3133:1: rule__Vocabulary__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__Vocabulary__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3137:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:3138:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:3138:2: ( rulePrefix )
            // InternalRdfMapping.g:3139:3: rulePrefix
            {
             before(grammarAccess.getVocabularyAccess().getPrefixPrefixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getVocabularyAccess().getPrefixPrefixParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__PrefixAssignment_3"


    // $ANTLR start "rule__Vocabulary__ClassesAssignment_4_1"
    // InternalRdfMapping.g:3148:1: rule__Vocabulary__ClassesAssignment_4_1 : ( ruleRdfClass ) ;
    public final void rule__Vocabulary__ClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3152:1: ( ( ruleRdfClass ) )
            // InternalRdfMapping.g:3153:2: ( ruleRdfClass )
            {
            // InternalRdfMapping.g:3153:2: ( ruleRdfClass )
            // InternalRdfMapping.g:3154:3: ruleRdfClass
            {
             before(grammarAccess.getVocabularyAccess().getClassesRdfClassParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRdfClass();

            state._fsp--;

             after(grammarAccess.getVocabularyAccess().getClassesRdfClassParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__ClassesAssignment_4_1"


    // $ANTLR start "rule__Vocabulary__PropertiesAssignment_5_1"
    // InternalRdfMapping.g:3163:1: rule__Vocabulary__PropertiesAssignment_5_1 : ( ruleRdfProperty ) ;
    public final void rule__Vocabulary__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3167:1: ( ( ruleRdfProperty ) )
            // InternalRdfMapping.g:3168:2: ( ruleRdfProperty )
            {
            // InternalRdfMapping.g:3168:2: ( ruleRdfProperty )
            // InternalRdfMapping.g:3169:3: ruleRdfProperty
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesRdfPropertyParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRdfProperty();

            state._fsp--;

             after(grammarAccess.getVocabularyAccess().getPropertiesRdfPropertyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vocabulary__PropertiesAssignment_5_1"


    // $ANTLR start "rule__Prefix__LabelAssignment_1"
    // InternalRdfMapping.g:3178:1: rule__Prefix__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Prefix__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3182:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3183:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3183:2: ( RULE_STRING )
            // InternalRdfMapping.g:3184:3: RULE_STRING
            {
             before(grammarAccess.getPrefixAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__LabelAssignment_1"


    // $ANTLR start "rule__Prefix__IriAssignment_2"
    // InternalRdfMapping.g:3193:1: rule__Prefix__IriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__IriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3197:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3198:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3198:2: ( RULE_STRING )
            // InternalRdfMapping.g:3199:3: RULE_STRING
            {
             before(grammarAccess.getPrefixAccess().getIriSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getIriSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__IriAssignment_2"


    // $ANTLR start "rule__RdfProperty__NameAssignment"
    // InternalRdfMapping.g:3208:1: rule__RdfProperty__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfProperty__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3212:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3213:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3213:2: ( RULE_ID )
            // InternalRdfMapping.g:3214:3: RULE_ID
            {
             before(grammarAccess.getRdfPropertyAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRdfPropertyAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdfProperty__NameAssignment"


    // $ANTLR start "rule__RdfClass__NameAssignment"
    // InternalRdfMapping.g:3223:1: rule__RdfClass__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfClass__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3227:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3228:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3228:2: ( RULE_ID )
            // InternalRdfMapping.g:3229:3: RULE_ID
            {
             before(grammarAccess.getRdfClassAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRdfClassAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RdfClass__NameAssignment"


    // $ANTLR start "rule__Mapping__NameAssignment_1"
    // InternalRdfMapping.g:3238:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3242:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3243:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3243:2: ( RULE_ID )
            // InternalRdfMapping.g:3244:3: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__NameAssignment_1"


    // $ANTLR start "rule__Mapping__SourceAssignment_3"
    // InternalRdfMapping.g:3253:1: rule__Mapping__SourceAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3257:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:3258:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:3258:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3259:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getSourceLogicalSourceCrossReference_3_0()); 
            // InternalRdfMapping.g:3260:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:3261:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getSourceLogicalSourceQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getSourceLogicalSourceQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getSourceLogicalSourceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__SourceAssignment_3"


    // $ANTLR start "rule__Mapping__PatternAssignment_7"
    // InternalRdfMapping.g:3272:1: rule__Mapping__PatternAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Mapping__PatternAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3276:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3277:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3277:2: ( RULE_STRING )
            // InternalRdfMapping.g:3278:3: RULE_STRING
            {
             before(grammarAccess.getMappingAccess().getPatternSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getPatternSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__PatternAssignment_7"


    // $ANTLR start "rule__Mapping__ReferenceAssignment_9"
    // InternalRdfMapping.g:3287:1: rule__Mapping__ReferenceAssignment_9 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__ReferenceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3291:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:3292:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:3292:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3293:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getReferenceReferenceableCrossReference_9_0()); 
            // InternalRdfMapping.g:3294:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:3295:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getReferenceReferenceableQualifiedNameParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getReferenceReferenceableQualifiedNameParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getReferenceReferenceableCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ReferenceAssignment_9"


    // $ANTLR start "rule__Mapping__SubjectTypeMappingsAssignment_10_1"
    // InternalRdfMapping.g:3306:1: rule__Mapping__SubjectTypeMappingsAssignment_10_1 : ( ruleSubjectTypeMapping ) ;
    public final void rule__Mapping__SubjectTypeMappingsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3310:1: ( ( ruleSubjectTypeMapping ) )
            // InternalRdfMapping.g:3311:2: ( ruleSubjectTypeMapping )
            {
            // InternalRdfMapping.g:3311:2: ( ruleSubjectTypeMapping )
            // InternalRdfMapping.g:3312:3: ruleSubjectTypeMapping
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsSubjectTypeMappingParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubjectTypeMapping();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsSubjectTypeMappingParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__SubjectTypeMappingsAssignment_10_1"


    // $ANTLR start "rule__Mapping__PoMappingsAssignment_11_1"
    // InternalRdfMapping.g:3321:1: rule__Mapping__PoMappingsAssignment_11_1 : ( rulePredicateObjectMapping ) ;
    public final void rule__Mapping__PoMappingsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3325:1: ( ( rulePredicateObjectMapping ) )
            // InternalRdfMapping.g:3326:2: ( rulePredicateObjectMapping )
            {
            // InternalRdfMapping.g:3326:2: ( rulePredicateObjectMapping )
            // InternalRdfMapping.g:3327:3: rulePredicateObjectMapping
            {
             before(grammarAccess.getMappingAccess().getPoMappingsPredicateObjectMappingParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateObjectMapping();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getPoMappingsPredicateObjectMappingParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__PoMappingsAssignment_11_1"


    // $ANTLR start "rule__SubjectTypeMapping__TypeAssignment"
    // InternalRdfMapping.g:3336:1: rule__SubjectTypeMapping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubjectTypeMapping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3340:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:3341:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:3341:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3342:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassCrossReference_0()); 
            // InternalRdfMapping.g:3343:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:3344:4: ruleQualifiedName
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectTypeMapping__TypeAssignment"


    // $ANTLR start "rule__PredicateObjectMapping__PropertyAssignment_0"
    // InternalRdfMapping.g:3355:1: rule__PredicateObjectMapping__PropertyAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PredicateObjectMapping__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3359:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:3360:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:3360:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3361:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0()); 
            // InternalRdfMapping.g:3362:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:3363:4: ruleQualifiedName
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__PropertyAssignment_0"


    // $ANTLR start "rule__PredicateObjectMapping__ReferenceAssignment_2"
    // InternalRdfMapping.g:3374:1: rule__PredicateObjectMapping__ReferenceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PredicateObjectMapping__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3378:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:3379:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:3379:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3380:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getReferenceReferenceableCrossReference_2_0()); 
            // InternalRdfMapping.g:3381:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:3382:4: ruleQualifiedName
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getReferenceReferenceableQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPredicateObjectMappingAccess().getReferenceReferenceableQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPredicateObjectMappingAccess().getReferenceReferenceableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__ReferenceAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalRdfMapping.g:3393:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3397:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:3398:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:3398:2: ( ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:3399:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000104488802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000350000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000081002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});

}