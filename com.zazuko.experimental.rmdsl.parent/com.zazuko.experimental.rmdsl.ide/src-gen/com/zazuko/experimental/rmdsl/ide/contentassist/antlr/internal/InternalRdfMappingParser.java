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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'datatypes'", "'language-tags'", "'source-group'", "'type'", "'source'", "'logical-source'", "'referenceables'", "'iterator'", "'vocabulary'", "'classes'", "'properties'", "'prefix'", "'map'", "'from'", "'subject'", "'use-vocabularies'", "'types'", "'with'", "'datatype'", "'language-tag'", "'template'", "'link'", "'import'", "'.*'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=17)||LA1_0==20||LA1_0==23||LA1_0==27||LA1_0==37) ) {
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


    // $ANTLR start "entryRuleDatatypesDefinition"
    // InternalRdfMapping.g:153:1: entryRuleDatatypesDefinition : ruleDatatypesDefinition EOF ;
    public final void entryRuleDatatypesDefinition() throws RecognitionException {
        try {
            // InternalRdfMapping.g:154:1: ( ruleDatatypesDefinition EOF )
            // InternalRdfMapping.g:155:1: ruleDatatypesDefinition EOF
            {
             before(grammarAccess.getDatatypesDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDatatypesDefinition();

            state._fsp--;

             after(grammarAccess.getDatatypesDefinitionRule()); 
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
    // $ANTLR end "entryRuleDatatypesDefinition"


    // $ANTLR start "ruleDatatypesDefinition"
    // InternalRdfMapping.g:162:1: ruleDatatypesDefinition : ( ( rule__DatatypesDefinition__Group__0 ) ) ;
    public final void ruleDatatypesDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:166:2: ( ( ( rule__DatatypesDefinition__Group__0 ) ) )
            // InternalRdfMapping.g:167:2: ( ( rule__DatatypesDefinition__Group__0 ) )
            {
            // InternalRdfMapping.g:167:2: ( ( rule__DatatypesDefinition__Group__0 ) )
            // InternalRdfMapping.g:168:3: ( rule__DatatypesDefinition__Group__0 )
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getGroup()); 
            // InternalRdfMapping.g:169:3: ( rule__DatatypesDefinition__Group__0 )
            // InternalRdfMapping.g:169:4: rule__DatatypesDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypesDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDatatypesDefinition"


    // $ANTLR start "entryRuleDatatype"
    // InternalRdfMapping.g:178:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalRdfMapping.g:179:1: ( ruleDatatype EOF )
            // InternalRdfMapping.g:180:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalRdfMapping.g:187:1: ruleDatatype : ( ( rule__Datatype__NameAssignment ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:191:2: ( ( ( rule__Datatype__NameAssignment ) ) )
            // InternalRdfMapping.g:192:2: ( ( rule__Datatype__NameAssignment ) )
            {
            // InternalRdfMapping.g:192:2: ( ( rule__Datatype__NameAssignment ) )
            // InternalRdfMapping.g:193:3: ( rule__Datatype__NameAssignment )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment()); 
            // InternalRdfMapping.g:194:3: ( rule__Datatype__NameAssignment )
            // InternalRdfMapping.g:194:4: rule__Datatype__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleLanguageTagDefinition"
    // InternalRdfMapping.g:203:1: entryRuleLanguageTagDefinition : ruleLanguageTagDefinition EOF ;
    public final void entryRuleLanguageTagDefinition() throws RecognitionException {
        try {
            // InternalRdfMapping.g:204:1: ( ruleLanguageTagDefinition EOF )
            // InternalRdfMapping.g:205:1: ruleLanguageTagDefinition EOF
            {
             before(grammarAccess.getLanguageTagDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageTagDefinition();

            state._fsp--;

             after(grammarAccess.getLanguageTagDefinitionRule()); 
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
    // $ANTLR end "entryRuleLanguageTagDefinition"


    // $ANTLR start "ruleLanguageTagDefinition"
    // InternalRdfMapping.g:212:1: ruleLanguageTagDefinition : ( ( rule__LanguageTagDefinition__Group__0 ) ) ;
    public final void ruleLanguageTagDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:216:2: ( ( ( rule__LanguageTagDefinition__Group__0 ) ) )
            // InternalRdfMapping.g:217:2: ( ( rule__LanguageTagDefinition__Group__0 ) )
            {
            // InternalRdfMapping.g:217:2: ( ( rule__LanguageTagDefinition__Group__0 ) )
            // InternalRdfMapping.g:218:3: ( rule__LanguageTagDefinition__Group__0 )
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getGroup()); 
            // InternalRdfMapping.g:219:3: ( rule__LanguageTagDefinition__Group__0 )
            // InternalRdfMapping.g:219:4: rule__LanguageTagDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageTagDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageTagDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguageTagDefinition"


    // $ANTLR start "entryRuleLanguageTag"
    // InternalRdfMapping.g:228:1: entryRuleLanguageTag : ruleLanguageTag EOF ;
    public final void entryRuleLanguageTag() throws RecognitionException {
        try {
            // InternalRdfMapping.g:229:1: ( ruleLanguageTag EOF )
            // InternalRdfMapping.g:230:1: ruleLanguageTag EOF
            {
             before(grammarAccess.getLanguageTagRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageTag();

            state._fsp--;

             after(grammarAccess.getLanguageTagRule()); 
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
    // $ANTLR end "entryRuleLanguageTag"


    // $ANTLR start "ruleLanguageTag"
    // InternalRdfMapping.g:237:1: ruleLanguageTag : ( ( rule__LanguageTag__NameAssignment ) ) ;
    public final void ruleLanguageTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:241:2: ( ( ( rule__LanguageTag__NameAssignment ) ) )
            // InternalRdfMapping.g:242:2: ( ( rule__LanguageTag__NameAssignment ) )
            {
            // InternalRdfMapping.g:242:2: ( ( rule__LanguageTag__NameAssignment ) )
            // InternalRdfMapping.g:243:3: ( rule__LanguageTag__NameAssignment )
            {
             before(grammarAccess.getLanguageTagAccess().getNameAssignment()); 
            // InternalRdfMapping.g:244:3: ( rule__LanguageTag__NameAssignment )
            // InternalRdfMapping.g:244:4: rule__LanguageTag__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LanguageTag__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLanguageTagAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleLanguageTag"


    // $ANTLR start "entryRuleSourceGroup"
    // InternalRdfMapping.g:253:1: entryRuleSourceGroup : ruleSourceGroup EOF ;
    public final void entryRuleSourceGroup() throws RecognitionException {
        try {
            // InternalRdfMapping.g:254:1: ( ruleSourceGroup EOF )
            // InternalRdfMapping.g:255:1: ruleSourceGroup EOF
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
    // InternalRdfMapping.g:262:1: ruleSourceGroup : ( ( rule__SourceGroup__Group__0 ) ) ;
    public final void ruleSourceGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:266:2: ( ( ( rule__SourceGroup__Group__0 ) ) )
            // InternalRdfMapping.g:267:2: ( ( rule__SourceGroup__Group__0 ) )
            {
            // InternalRdfMapping.g:267:2: ( ( rule__SourceGroup__Group__0 ) )
            // InternalRdfMapping.g:268:3: ( rule__SourceGroup__Group__0 )
            {
             before(grammarAccess.getSourceGroupAccess().getGroup()); 
            // InternalRdfMapping.g:269:3: ( rule__SourceGroup__Group__0 )
            // InternalRdfMapping.g:269:4: rule__SourceGroup__Group__0
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
    // InternalRdfMapping.g:278:1: entryRuleLogicalSource : ruleLogicalSource EOF ;
    public final void entryRuleLogicalSource() throws RecognitionException {
        try {
            // InternalRdfMapping.g:279:1: ( ruleLogicalSource EOF )
            // InternalRdfMapping.g:280:1: ruleLogicalSource EOF
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
    // InternalRdfMapping.g:287:1: ruleLogicalSource : ( ( rule__LogicalSource__Group__0 ) ) ;
    public final void ruleLogicalSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:291:2: ( ( ( rule__LogicalSource__Group__0 ) ) )
            // InternalRdfMapping.g:292:2: ( ( rule__LogicalSource__Group__0 ) )
            {
            // InternalRdfMapping.g:292:2: ( ( rule__LogicalSource__Group__0 ) )
            // InternalRdfMapping.g:293:3: ( rule__LogicalSource__Group__0 )
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup()); 
            // InternalRdfMapping.g:294:3: ( rule__LogicalSource__Group__0 )
            // InternalRdfMapping.g:294:4: rule__LogicalSource__Group__0
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
    // InternalRdfMapping.g:303:1: entryRuleReferenceable : ruleReferenceable EOF ;
    public final void entryRuleReferenceable() throws RecognitionException {
        try {
            // InternalRdfMapping.g:304:1: ( ruleReferenceable EOF )
            // InternalRdfMapping.g:305:1: ruleReferenceable EOF
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
    // InternalRdfMapping.g:312:1: ruleReferenceable : ( ( rule__Referenceable__Group__0 ) ) ;
    public final void ruleReferenceable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:316:2: ( ( ( rule__Referenceable__Group__0 ) ) )
            // InternalRdfMapping.g:317:2: ( ( rule__Referenceable__Group__0 ) )
            {
            // InternalRdfMapping.g:317:2: ( ( rule__Referenceable__Group__0 ) )
            // InternalRdfMapping.g:318:3: ( rule__Referenceable__Group__0 )
            {
             before(grammarAccess.getReferenceableAccess().getGroup()); 
            // InternalRdfMapping.g:319:3: ( rule__Referenceable__Group__0 )
            // InternalRdfMapping.g:319:4: rule__Referenceable__Group__0
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
    // InternalRdfMapping.g:328:1: entryRuleVocabulary : ruleVocabulary EOF ;
    public final void entryRuleVocabulary() throws RecognitionException {
        try {
            // InternalRdfMapping.g:329:1: ( ruleVocabulary EOF )
            // InternalRdfMapping.g:330:1: ruleVocabulary EOF
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
    // InternalRdfMapping.g:337:1: ruleVocabulary : ( ( rule__Vocabulary__Group__0 ) ) ;
    public final void ruleVocabulary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:341:2: ( ( ( rule__Vocabulary__Group__0 ) ) )
            // InternalRdfMapping.g:342:2: ( ( rule__Vocabulary__Group__0 ) )
            {
            // InternalRdfMapping.g:342:2: ( ( rule__Vocabulary__Group__0 ) )
            // InternalRdfMapping.g:343:3: ( rule__Vocabulary__Group__0 )
            {
             before(grammarAccess.getVocabularyAccess().getGroup()); 
            // InternalRdfMapping.g:344:3: ( rule__Vocabulary__Group__0 )
            // InternalRdfMapping.g:344:4: rule__Vocabulary__Group__0
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


    // $ANTLR start "entryRulePrefixHolder"
    // InternalRdfMapping.g:353:1: entryRulePrefixHolder : rulePrefixHolder EOF ;
    public final void entryRulePrefixHolder() throws RecognitionException {
        try {
            // InternalRdfMapping.g:354:1: ( rulePrefixHolder EOF )
            // InternalRdfMapping.g:355:1: rulePrefixHolder EOF
            {
             before(grammarAccess.getPrefixHolderRule()); 
            pushFollow(FOLLOW_1);
            rulePrefixHolder();

            state._fsp--;

             after(grammarAccess.getPrefixHolderRule()); 
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
    // $ANTLR end "entryRulePrefixHolder"


    // $ANTLR start "rulePrefixHolder"
    // InternalRdfMapping.g:362:1: rulePrefixHolder : ( ( rule__PrefixHolder__Alternatives ) ) ;
    public final void rulePrefixHolder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:366:2: ( ( ( rule__PrefixHolder__Alternatives ) ) )
            // InternalRdfMapping.g:367:2: ( ( rule__PrefixHolder__Alternatives ) )
            {
            // InternalRdfMapping.g:367:2: ( ( rule__PrefixHolder__Alternatives ) )
            // InternalRdfMapping.g:368:3: ( rule__PrefixHolder__Alternatives )
            {
             before(grammarAccess.getPrefixHolderAccess().getAlternatives()); 
            // InternalRdfMapping.g:369:3: ( rule__PrefixHolder__Alternatives )
            // InternalRdfMapping.g:369:4: rule__PrefixHolder__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrefixHolder__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrefixHolderAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrefixHolder"


    // $ANTLR start "entryRulePrefix"
    // InternalRdfMapping.g:378:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalRdfMapping.g:379:1: ( rulePrefix EOF )
            // InternalRdfMapping.g:380:1: rulePrefix EOF
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
    // InternalRdfMapping.g:387:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:391:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalRdfMapping.g:392:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalRdfMapping.g:392:2: ( ( rule__Prefix__Group__0 ) )
            // InternalRdfMapping.g:393:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalRdfMapping.g:394:3: ( rule__Prefix__Group__0 )
            // InternalRdfMapping.g:394:4: rule__Prefix__Group__0
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
    // InternalRdfMapping.g:403:1: entryRuleRdfProperty : ruleRdfProperty EOF ;
    public final void entryRuleRdfProperty() throws RecognitionException {
        try {
            // InternalRdfMapping.g:404:1: ( ruleRdfProperty EOF )
            // InternalRdfMapping.g:405:1: ruleRdfProperty EOF
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
    // InternalRdfMapping.g:412:1: ruleRdfProperty : ( ( rule__RdfProperty__NameAssignment ) ) ;
    public final void ruleRdfProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:416:2: ( ( ( rule__RdfProperty__NameAssignment ) ) )
            // InternalRdfMapping.g:417:2: ( ( rule__RdfProperty__NameAssignment ) )
            {
            // InternalRdfMapping.g:417:2: ( ( rule__RdfProperty__NameAssignment ) )
            // InternalRdfMapping.g:418:3: ( rule__RdfProperty__NameAssignment )
            {
             before(grammarAccess.getRdfPropertyAccess().getNameAssignment()); 
            // InternalRdfMapping.g:419:3: ( rule__RdfProperty__NameAssignment )
            // InternalRdfMapping.g:419:4: rule__RdfProperty__NameAssignment
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
    // InternalRdfMapping.g:428:1: entryRuleRdfClass : ruleRdfClass EOF ;
    public final void entryRuleRdfClass() throws RecognitionException {
        try {
            // InternalRdfMapping.g:429:1: ( ruleRdfClass EOF )
            // InternalRdfMapping.g:430:1: ruleRdfClass EOF
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
    // InternalRdfMapping.g:437:1: ruleRdfClass : ( ( rule__RdfClass__NameAssignment ) ) ;
    public final void ruleRdfClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:441:2: ( ( ( rule__RdfClass__NameAssignment ) ) )
            // InternalRdfMapping.g:442:2: ( ( rule__RdfClass__NameAssignment ) )
            {
            // InternalRdfMapping.g:442:2: ( ( rule__RdfClass__NameAssignment ) )
            // InternalRdfMapping.g:443:3: ( rule__RdfClass__NameAssignment )
            {
             before(grammarAccess.getRdfClassAccess().getNameAssignment()); 
            // InternalRdfMapping.g:444:3: ( rule__RdfClass__NameAssignment )
            // InternalRdfMapping.g:444:4: rule__RdfClass__NameAssignment
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
    // InternalRdfMapping.g:453:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:454:1: ( ruleMapping EOF )
            // InternalRdfMapping.g:455:1: ruleMapping EOF
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
    // InternalRdfMapping.g:462:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:466:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalRdfMapping.g:467:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalRdfMapping.g:467:2: ( ( rule__Mapping__Group__0 ) )
            // InternalRdfMapping.g:468:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalRdfMapping.g:469:3: ( rule__Mapping__Group__0 )
            // InternalRdfMapping.g:469:4: rule__Mapping__Group__0
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
    // InternalRdfMapping.g:478:1: entryRuleSubjectTypeMapping : ruleSubjectTypeMapping EOF ;
    public final void entryRuleSubjectTypeMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:479:1: ( ruleSubjectTypeMapping EOF )
            // InternalRdfMapping.g:480:1: ruleSubjectTypeMapping EOF
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
    // InternalRdfMapping.g:487:1: ruleSubjectTypeMapping : ( ( rule__SubjectTypeMapping__TypeAssignment ) ) ;
    public final void ruleSubjectTypeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:491:2: ( ( ( rule__SubjectTypeMapping__TypeAssignment ) ) )
            // InternalRdfMapping.g:492:2: ( ( rule__SubjectTypeMapping__TypeAssignment ) )
            {
            // InternalRdfMapping.g:492:2: ( ( rule__SubjectTypeMapping__TypeAssignment ) )
            // InternalRdfMapping.g:493:3: ( rule__SubjectTypeMapping__TypeAssignment )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeAssignment()); 
            // InternalRdfMapping.g:494:3: ( rule__SubjectTypeMapping__TypeAssignment )
            // InternalRdfMapping.g:494:4: rule__SubjectTypeMapping__TypeAssignment
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
    // InternalRdfMapping.g:503:1: entryRulePredicateObjectMapping : rulePredicateObjectMapping EOF ;
    public final void entryRulePredicateObjectMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:504:1: ( rulePredicateObjectMapping EOF )
            // InternalRdfMapping.g:505:1: rulePredicateObjectMapping EOF
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
    // InternalRdfMapping.g:512:1: rulePredicateObjectMapping : ( ( rule__PredicateObjectMapping__Group__0 ) ) ;
    public final void rulePredicateObjectMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:516:2: ( ( ( rule__PredicateObjectMapping__Group__0 ) ) )
            // InternalRdfMapping.g:517:2: ( ( rule__PredicateObjectMapping__Group__0 ) )
            {
            // InternalRdfMapping.g:517:2: ( ( rule__PredicateObjectMapping__Group__0 ) )
            // InternalRdfMapping.g:518:3: ( rule__PredicateObjectMapping__Group__0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getGroup()); 
            // InternalRdfMapping.g:519:3: ( rule__PredicateObjectMapping__Group__0 )
            // InternalRdfMapping.g:519:4: rule__PredicateObjectMapping__Group__0
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


    // $ANTLR start "entryRuleValuedTerm"
    // InternalRdfMapping.g:528:1: entryRuleValuedTerm : ruleValuedTerm EOF ;
    public final void entryRuleValuedTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:529:1: ( ruleValuedTerm EOF )
            // InternalRdfMapping.g:530:1: ruleValuedTerm EOF
            {
             before(grammarAccess.getValuedTermRule()); 
            pushFollow(FOLLOW_1);
            ruleValuedTerm();

            state._fsp--;

             after(grammarAccess.getValuedTermRule()); 
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
    // $ANTLR end "entryRuleValuedTerm"


    // $ANTLR start "ruleValuedTerm"
    // InternalRdfMapping.g:537:1: ruleValuedTerm : ( ( rule__ValuedTerm__Alternatives ) ) ;
    public final void ruleValuedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:541:2: ( ( ( rule__ValuedTerm__Alternatives ) ) )
            // InternalRdfMapping.g:542:2: ( ( rule__ValuedTerm__Alternatives ) )
            {
            // InternalRdfMapping.g:542:2: ( ( rule__ValuedTerm__Alternatives ) )
            // InternalRdfMapping.g:543:3: ( rule__ValuedTerm__Alternatives )
            {
             before(grammarAccess.getValuedTermAccess().getAlternatives()); 
            // InternalRdfMapping.g:544:3: ( rule__ValuedTerm__Alternatives )
            // InternalRdfMapping.g:544:4: rule__ValuedTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValuedTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValuedTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValuedTerm"


    // $ANTLR start "entryRuleReferenceValuedTerm"
    // InternalRdfMapping.g:553:1: entryRuleReferenceValuedTerm : ruleReferenceValuedTerm EOF ;
    public final void entryRuleReferenceValuedTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:554:1: ( ruleReferenceValuedTerm EOF )
            // InternalRdfMapping.g:555:1: ruleReferenceValuedTerm EOF
            {
             before(grammarAccess.getReferenceValuedTermRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceValuedTerm();

            state._fsp--;

             after(grammarAccess.getReferenceValuedTermRule()); 
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
    // $ANTLR end "entryRuleReferenceValuedTerm"


    // $ANTLR start "ruleReferenceValuedTerm"
    // InternalRdfMapping.g:562:1: ruleReferenceValuedTerm : ( ( rule__ReferenceValuedTerm__Group__0 ) ) ;
    public final void ruleReferenceValuedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:566:2: ( ( ( rule__ReferenceValuedTerm__Group__0 ) ) )
            // InternalRdfMapping.g:567:2: ( ( rule__ReferenceValuedTerm__Group__0 ) )
            {
            // InternalRdfMapping.g:567:2: ( ( rule__ReferenceValuedTerm__Group__0 ) )
            // InternalRdfMapping.g:568:3: ( rule__ReferenceValuedTerm__Group__0 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getGroup()); 
            // InternalRdfMapping.g:569:3: ( rule__ReferenceValuedTerm__Group__0 )
            // InternalRdfMapping.g:569:4: rule__ReferenceValuedTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceValuedTermAccess().getGroup()); 

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
    // $ANTLR end "ruleReferenceValuedTerm"


    // $ANTLR start "entryRuleTemplateValuedTerm"
    // InternalRdfMapping.g:578:1: entryRuleTemplateValuedTerm : ruleTemplateValuedTerm EOF ;
    public final void entryRuleTemplateValuedTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:579:1: ( ruleTemplateValuedTerm EOF )
            // InternalRdfMapping.g:580:1: ruleTemplateValuedTerm EOF
            {
             before(grammarAccess.getTemplateValuedTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateValuedTerm();

            state._fsp--;

             after(grammarAccess.getTemplateValuedTermRule()); 
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
    // $ANTLR end "entryRuleTemplateValuedTerm"


    // $ANTLR start "ruleTemplateValuedTerm"
    // InternalRdfMapping.g:587:1: ruleTemplateValuedTerm : ( ( rule__TemplateValuedTerm__Group__0 ) ) ;
    public final void ruleTemplateValuedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:591:2: ( ( ( rule__TemplateValuedTerm__Group__0 ) ) )
            // InternalRdfMapping.g:592:2: ( ( rule__TemplateValuedTerm__Group__0 ) )
            {
            // InternalRdfMapping.g:592:2: ( ( rule__TemplateValuedTerm__Group__0 ) )
            // InternalRdfMapping.g:593:3: ( rule__TemplateValuedTerm__Group__0 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getGroup()); 
            // InternalRdfMapping.g:594:3: ( rule__TemplateValuedTerm__Group__0 )
            // InternalRdfMapping.g:594:4: rule__TemplateValuedTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateValuedTermAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplateValuedTerm"


    // $ANTLR start "entryRuleLinkedResourceTerm"
    // InternalRdfMapping.g:603:1: entryRuleLinkedResourceTerm : ruleLinkedResourceTerm EOF ;
    public final void entryRuleLinkedResourceTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:604:1: ( ruleLinkedResourceTerm EOF )
            // InternalRdfMapping.g:605:1: ruleLinkedResourceTerm EOF
            {
             before(grammarAccess.getLinkedResourceTermRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkedResourceTerm();

            state._fsp--;

             after(grammarAccess.getLinkedResourceTermRule()); 
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
    // $ANTLR end "entryRuleLinkedResourceTerm"


    // $ANTLR start "ruleLinkedResourceTerm"
    // InternalRdfMapping.g:612:1: ruleLinkedResourceTerm : ( ( rule__LinkedResourceTerm__Group__0 ) ) ;
    public final void ruleLinkedResourceTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:616:2: ( ( ( rule__LinkedResourceTerm__Group__0 ) ) )
            // InternalRdfMapping.g:617:2: ( ( rule__LinkedResourceTerm__Group__0 ) )
            {
            // InternalRdfMapping.g:617:2: ( ( rule__LinkedResourceTerm__Group__0 ) )
            // InternalRdfMapping.g:618:3: ( rule__LinkedResourceTerm__Group__0 )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getGroup()); 
            // InternalRdfMapping.g:619:3: ( rule__LinkedResourceTerm__Group__0 )
            // InternalRdfMapping.g:619:4: rule__LinkedResourceTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkedResourceTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkedResourceTermAccess().getGroup()); 

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
    // $ANTLR end "ruleLinkedResourceTerm"


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:628:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRdfMapping.g:629:1: ( ruleImport EOF )
            // InternalRdfMapping.g:630:1: ruleImport EOF
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
    // InternalRdfMapping.g:637:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:641:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRdfMapping.g:642:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRdfMapping.g:642:2: ( ( rule__Import__Group__0 ) )
            // InternalRdfMapping.g:643:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRdfMapping.g:644:3: ( rule__Import__Group__0 )
            // InternalRdfMapping.g:644:4: rule__Import__Group__0
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
    // InternalRdfMapping.g:653:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRdfMapping.g:654:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:655:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:662:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:666:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRdfMapping.g:667:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRdfMapping.g:667:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRdfMapping.g:668:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRdfMapping.g:669:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRdfMapping.g:669:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalRdfMapping.g:678:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRdfMapping.g:679:1: ( ruleQualifiedName EOF )
            // InternalRdfMapping.g:680:1: ruleQualifiedName EOF
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
    // InternalRdfMapping.g:687:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:691:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRdfMapping.g:692:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRdfMapping.g:692:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRdfMapping.g:693:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRdfMapping.g:694:3: ( rule__QualifiedName__Group__0 )
            // InternalRdfMapping.g:694:4: rule__QualifiedName__Group__0
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
    // InternalRdfMapping.g:702:1: rule__Element__Alternatives : ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( rulePrefixHolder ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleLanguageTagDefinition ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:706:1: ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( rulePrefixHolder ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleLanguageTagDefinition ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 15:
            case 23:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 37:
                {
                alt2=5;
                }
                break;
            case 11:
                {
                alt2=6;
                }
                break;
            case 16:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRdfMapping.g:707:2: ( ruleSourceGroup )
                    {
                    // InternalRdfMapping.g:707:2: ( ruleSourceGroup )
                    // InternalRdfMapping.g:708:3: ruleSourceGroup
                    {
                     before(grammarAccess.getElementAccess().getSourceGroupParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceGroup();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSourceGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:713:2: ( ruleLogicalSource )
                    {
                    // InternalRdfMapping.g:713:2: ( ruleLogicalSource )
                    // InternalRdfMapping.g:714:3: ruleLogicalSource
                    {
                     before(grammarAccess.getElementAccess().getLogicalSourceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalSource();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLogicalSourceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRdfMapping.g:719:2: ( rulePrefixHolder )
                    {
                    // InternalRdfMapping.g:719:2: ( rulePrefixHolder )
                    // InternalRdfMapping.g:720:3: rulePrefixHolder
                    {
                     before(grammarAccess.getElementAccess().getPrefixHolderParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrefixHolder();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPrefixHolderParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRdfMapping.g:725:2: ( ruleMapping )
                    {
                    // InternalRdfMapping.g:725:2: ( ruleMapping )
                    // InternalRdfMapping.g:726:3: ruleMapping
                    {
                     before(grammarAccess.getElementAccess().getMappingParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMapping();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMappingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRdfMapping.g:731:2: ( ruleImport )
                    {
                    // InternalRdfMapping.g:731:2: ( ruleImport )
                    // InternalRdfMapping.g:732:3: ruleImport
                    {
                     before(grammarAccess.getElementAccess().getImportParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getImportParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRdfMapping.g:737:2: ( ruleSourceTypesDefinition )
                    {
                    // InternalRdfMapping.g:737:2: ( ruleSourceTypesDefinition )
                    // InternalRdfMapping.g:738:3: ruleSourceTypesDefinition
                    {
                     before(grammarAccess.getElementAccess().getSourceTypesDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceTypesDefinition();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSourceTypesDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRdfMapping.g:743:2: ( ruleLanguageTagDefinition )
                    {
                    // InternalRdfMapping.g:743:2: ( ruleLanguageTagDefinition )
                    // InternalRdfMapping.g:744:3: ruleLanguageTagDefinition
                    {
                     before(grammarAccess.getElementAccess().getLanguageTagDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLanguageTagDefinition();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLanguageTagDefinitionParserRuleCall_6()); 

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


    // $ANTLR start "rule__PrefixHolder__Alternatives"
    // InternalRdfMapping.g:753:1: rule__PrefixHolder__Alternatives : ( ( ruleDatatypesDefinition ) | ( ruleVocabulary ) );
    public final void rule__PrefixHolder__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:757:1: ( ( ruleDatatypesDefinition ) | ( ruleVocabulary ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRdfMapping.g:758:2: ( ruleDatatypesDefinition )
                    {
                    // InternalRdfMapping.g:758:2: ( ruleDatatypesDefinition )
                    // InternalRdfMapping.g:759:3: ruleDatatypesDefinition
                    {
                     before(grammarAccess.getPrefixHolderAccess().getDatatypesDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDatatypesDefinition();

                    state._fsp--;

                     after(grammarAccess.getPrefixHolderAccess().getDatatypesDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:764:2: ( ruleVocabulary )
                    {
                    // InternalRdfMapping.g:764:2: ( ruleVocabulary )
                    // InternalRdfMapping.g:765:3: ruleVocabulary
                    {
                     before(grammarAccess.getPrefixHolderAccess().getVocabularyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVocabulary();

                    state._fsp--;

                     after(grammarAccess.getPrefixHolderAccess().getVocabularyParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrefixHolder__Alternatives"


    // $ANTLR start "rule__ValuedTerm__Alternatives"
    // InternalRdfMapping.g:774:1: rule__ValuedTerm__Alternatives : ( ( ruleReferenceValuedTerm ) | ( ruleTemplateValuedTerm ) | ( ruleLinkedResourceTerm ) );
    public final void rule__ValuedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:778:1: ( ( ruleReferenceValuedTerm ) | ( ruleTemplateValuedTerm ) | ( ruleLinkedResourceTerm ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRdfMapping.g:779:2: ( ruleReferenceValuedTerm )
                    {
                    // InternalRdfMapping.g:779:2: ( ruleReferenceValuedTerm )
                    // InternalRdfMapping.g:780:3: ruleReferenceValuedTerm
                    {
                     before(grammarAccess.getValuedTermAccess().getReferenceValuedTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceValuedTerm();

                    state._fsp--;

                     after(grammarAccess.getValuedTermAccess().getReferenceValuedTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:785:2: ( ruleTemplateValuedTerm )
                    {
                    // InternalRdfMapping.g:785:2: ( ruleTemplateValuedTerm )
                    // InternalRdfMapping.g:786:3: ruleTemplateValuedTerm
                    {
                     before(grammarAccess.getValuedTermAccess().getTemplateValuedTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemplateValuedTerm();

                    state._fsp--;

                     after(grammarAccess.getValuedTermAccess().getTemplateValuedTermParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRdfMapping.g:791:2: ( ruleLinkedResourceTerm )
                    {
                    // InternalRdfMapping.g:791:2: ( ruleLinkedResourceTerm )
                    // InternalRdfMapping.g:792:3: ruleLinkedResourceTerm
                    {
                     before(grammarAccess.getValuedTermAccess().getLinkedResourceTermParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLinkedResourceTerm();

                    state._fsp--;

                     after(grammarAccess.getValuedTermAccess().getLinkedResourceTermParserRuleCall_2()); 

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
    // $ANTLR end "rule__ValuedTerm__Alternatives"


    // $ANTLR start "rule__ReferenceValuedTerm__Alternatives_2"
    // InternalRdfMapping.g:801:1: rule__ReferenceValuedTerm__Alternatives_2 : ( ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) ) | ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) ) );
    public final void rule__ReferenceValuedTerm__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:805:1: ( ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) ) | ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==33) ) {
                    alt5=1;
                }
                else if ( (LA5_1==34) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRdfMapping.g:806:2: ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) )
                    {
                    // InternalRdfMapping.g:806:2: ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) )
                    // InternalRdfMapping.g:807:3: ( rule__ReferenceValuedTerm__Group_2_0__0 )
                    {
                     before(grammarAccess.getReferenceValuedTermAccess().getGroup_2_0()); 
                    // InternalRdfMapping.g:808:3: ( rule__ReferenceValuedTerm__Group_2_0__0 )
                    // InternalRdfMapping.g:808:4: rule__ReferenceValuedTerm__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceValuedTerm__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceValuedTermAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:812:2: ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) )
                    {
                    // InternalRdfMapping.g:812:2: ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) )
                    // InternalRdfMapping.g:813:3: ( rule__ReferenceValuedTerm__Group_2_1__0 )
                    {
                     before(grammarAccess.getReferenceValuedTermAccess().getGroup_2_1()); 
                    // InternalRdfMapping.g:814:3: ( rule__ReferenceValuedTerm__Group_2_1__0 )
                    // InternalRdfMapping.g:814:4: rule__ReferenceValuedTerm__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceValuedTerm__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceValuedTermAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Alternatives_2"


    // $ANTLR start "rule__SourceTypesDefinition__Group__0"
    // InternalRdfMapping.g:822:1: rule__SourceTypesDefinition__Group__0 : rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 ;
    public final void rule__SourceTypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:826:1: ( rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 )
            // InternalRdfMapping.g:827:2: rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1
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
    // InternalRdfMapping.g:834:1: rule__SourceTypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SourceTypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:838:1: ( ( () ) )
            // InternalRdfMapping.g:839:1: ( () )
            {
            // InternalRdfMapping.g:839:1: ( () )
            // InternalRdfMapping.g:840:2: ()
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0()); 
            // InternalRdfMapping.g:841:2: ()
            // InternalRdfMapping.g:841:3: 
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
    // InternalRdfMapping.g:849:1: rule__SourceTypesDefinition__Group__1 : rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 ;
    public final void rule__SourceTypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:853:1: ( rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 )
            // InternalRdfMapping.g:854:2: rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2
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
    // InternalRdfMapping.g:861:1: rule__SourceTypesDefinition__Group__1__Impl : ( 'source-types' ) ;
    public final void rule__SourceTypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:865:1: ( ( 'source-types' ) )
            // InternalRdfMapping.g:866:1: ( 'source-types' )
            {
            // InternalRdfMapping.g:866:1: ( 'source-types' )
            // InternalRdfMapping.g:867:2: 'source-types'
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
    // InternalRdfMapping.g:876:1: rule__SourceTypesDefinition__Group__2 : rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 ;
    public final void rule__SourceTypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:880:1: ( rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 )
            // InternalRdfMapping.g:881:2: rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3
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
    // InternalRdfMapping.g:888:1: rule__SourceTypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceTypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:892:1: ( ( '{' ) )
            // InternalRdfMapping.g:893:1: ( '{' )
            {
            // InternalRdfMapping.g:893:1: ( '{' )
            // InternalRdfMapping.g:894:2: '{'
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
    // InternalRdfMapping.g:903:1: rule__SourceTypesDefinition__Group__3 : rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 ;
    public final void rule__SourceTypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:907:1: ( rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 )
            // InternalRdfMapping.g:908:2: rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4
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
    // InternalRdfMapping.g:915:1: rule__SourceTypesDefinition__Group__3__Impl : ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) ;
    public final void rule__SourceTypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:919:1: ( ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) )
            // InternalRdfMapping.g:920:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            {
            // InternalRdfMapping.g:920:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            // InternalRdfMapping.g:921:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getTypesAssignment_3()); 
            // InternalRdfMapping.g:922:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRdfMapping.g:922:3: rule__SourceTypesDefinition__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SourceTypesDefinition__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRdfMapping.g:930:1: rule__SourceTypesDefinition__Group__4 : rule__SourceTypesDefinition__Group__4__Impl ;
    public final void rule__SourceTypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:934:1: ( rule__SourceTypesDefinition__Group__4__Impl )
            // InternalRdfMapping.g:935:2: rule__SourceTypesDefinition__Group__4__Impl
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
    // InternalRdfMapping.g:941:1: rule__SourceTypesDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SourceTypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:945:1: ( ( '}' ) )
            // InternalRdfMapping.g:946:1: ( '}' )
            {
            // InternalRdfMapping.g:946:1: ( '}' )
            // InternalRdfMapping.g:947:2: '}'
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
    // InternalRdfMapping.g:957:1: rule__SourceType__Group__0 : rule__SourceType__Group__0__Impl rule__SourceType__Group__1 ;
    public final void rule__SourceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:961:1: ( rule__SourceType__Group__0__Impl rule__SourceType__Group__1 )
            // InternalRdfMapping.g:962:2: rule__SourceType__Group__0__Impl rule__SourceType__Group__1
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
    // InternalRdfMapping.g:969:1: rule__SourceType__Group__0__Impl : ( ( rule__SourceType__NameAssignment_0 ) ) ;
    public final void rule__SourceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:973:1: ( ( ( rule__SourceType__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:974:1: ( ( rule__SourceType__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:974:1: ( ( rule__SourceType__NameAssignment_0 ) )
            // InternalRdfMapping.g:975:2: ( rule__SourceType__NameAssignment_0 )
            {
             before(grammarAccess.getSourceTypeAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:976:2: ( rule__SourceType__NameAssignment_0 )
            // InternalRdfMapping.g:976:3: rule__SourceType__NameAssignment_0
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
    // InternalRdfMapping.g:984:1: rule__SourceType__Group__1 : rule__SourceType__Group__1__Impl rule__SourceType__Group__2 ;
    public final void rule__SourceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:988:1: ( rule__SourceType__Group__1__Impl rule__SourceType__Group__2 )
            // InternalRdfMapping.g:989:2: rule__SourceType__Group__1__Impl rule__SourceType__Group__2
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
    // InternalRdfMapping.g:996:1: rule__SourceType__Group__1__Impl : ( 'referenceFormulation' ) ;
    public final void rule__SourceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1000:1: ( ( 'referenceFormulation' ) )
            // InternalRdfMapping.g:1001:1: ( 'referenceFormulation' )
            {
            // InternalRdfMapping.g:1001:1: ( 'referenceFormulation' )
            // InternalRdfMapping.g:1002:2: 'referenceFormulation'
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
    // InternalRdfMapping.g:1011:1: rule__SourceType__Group__2 : rule__SourceType__Group__2__Impl ;
    public final void rule__SourceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1015:1: ( rule__SourceType__Group__2__Impl )
            // InternalRdfMapping.g:1016:2: rule__SourceType__Group__2__Impl
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
    // InternalRdfMapping.g:1022:1: rule__SourceType__Group__2__Impl : ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) ;
    public final void rule__SourceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1026:1: ( ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) )
            // InternalRdfMapping.g:1027:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            {
            // InternalRdfMapping.g:1027:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            // InternalRdfMapping.g:1028:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            {
             before(grammarAccess.getSourceTypeAccess().getReferenceFormulationAssignment_2()); 
            // InternalRdfMapping.g:1029:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            // InternalRdfMapping.g:1029:3: rule__SourceType__ReferenceFormulationAssignment_2
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


    // $ANTLR start "rule__DatatypesDefinition__Group__0"
    // InternalRdfMapping.g:1038:1: rule__DatatypesDefinition__Group__0 : rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 ;
    public final void rule__DatatypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1042:1: ( rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 )
            // InternalRdfMapping.g:1043:2: rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DatatypesDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__Group__1();

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
    // $ANTLR end "rule__DatatypesDefinition__Group__0"


    // $ANTLR start "rule__DatatypesDefinition__Group__0__Impl"
    // InternalRdfMapping.g:1050:1: rule__DatatypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DatatypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1054:1: ( ( () ) )
            // InternalRdfMapping.g:1055:1: ( () )
            {
            // InternalRdfMapping.g:1055:1: ( () )
            // InternalRdfMapping.g:1056:2: ()
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getDatatypesDefinitionAction_0()); 
            // InternalRdfMapping.g:1057:2: ()
            // InternalRdfMapping.g:1057:3: 
            {
            }

             after(grammarAccess.getDatatypesDefinitionAccess().getDatatypesDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypesDefinition__Group__0__Impl"


    // $ANTLR start "rule__DatatypesDefinition__Group__1"
    // InternalRdfMapping.g:1065:1: rule__DatatypesDefinition__Group__1 : rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 ;
    public final void rule__DatatypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1069:1: ( rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 )
            // InternalRdfMapping.g:1070:2: rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DatatypesDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__Group__2();

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
    // $ANTLR end "rule__DatatypesDefinition__Group__1"


    // $ANTLR start "rule__DatatypesDefinition__Group__1__Impl"
    // InternalRdfMapping.g:1077:1: rule__DatatypesDefinition__Group__1__Impl : ( 'datatypes' ) ;
    public final void rule__DatatypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1081:1: ( ( 'datatypes' ) )
            // InternalRdfMapping.g:1082:1: ( 'datatypes' )
            {
            // InternalRdfMapping.g:1082:1: ( 'datatypes' )
            // InternalRdfMapping.g:1083:2: 'datatypes'
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getDatatypesKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDatatypesDefinitionAccess().getDatatypesKeyword_1()); 

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
    // $ANTLR end "rule__DatatypesDefinition__Group__1__Impl"


    // $ANTLR start "rule__DatatypesDefinition__Group__2"
    // InternalRdfMapping.g:1092:1: rule__DatatypesDefinition__Group__2 : rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 ;
    public final void rule__DatatypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1096:1: ( rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 )
            // InternalRdfMapping.g:1097:2: rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DatatypesDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__Group__3();

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
    // $ANTLR end "rule__DatatypesDefinition__Group__2"


    // $ANTLR start "rule__DatatypesDefinition__Group__2__Impl"
    // InternalRdfMapping.g:1104:1: rule__DatatypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__DatatypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1108:1: ( ( '{' ) )
            // InternalRdfMapping.g:1109:1: ( '{' )
            {
            // InternalRdfMapping.g:1109:1: ( '{' )
            // InternalRdfMapping.g:1110:2: '{'
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDatatypesDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DatatypesDefinition__Group__2__Impl"


    // $ANTLR start "rule__DatatypesDefinition__Group__3"
    // InternalRdfMapping.g:1119:1: rule__DatatypesDefinition__Group__3 : rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 ;
    public final void rule__DatatypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1123:1: ( rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 )
            // InternalRdfMapping.g:1124:2: rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DatatypesDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__Group__4();

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
    // $ANTLR end "rule__DatatypesDefinition__Group__3"


    // $ANTLR start "rule__DatatypesDefinition__Group__3__Impl"
    // InternalRdfMapping.g:1131:1: rule__DatatypesDefinition__Group__3__Impl : ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) ;
    public final void rule__DatatypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1135:1: ( ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:1136:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:1136:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:1137:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:1138:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            // InternalRdfMapping.g:1138:3: rule__DatatypesDefinition__PrefixAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatatypesDefinitionAccess().getPrefixAssignment_3()); 

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
    // $ANTLR end "rule__DatatypesDefinition__Group__3__Impl"


    // $ANTLR start "rule__DatatypesDefinition__Group__4"
    // InternalRdfMapping.g:1146:1: rule__DatatypesDefinition__Group__4 : rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 ;
    public final void rule__DatatypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1150:1: ( rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 )
            // InternalRdfMapping.g:1151:2: rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DatatypesDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__Group__5();

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
    // $ANTLR end "rule__DatatypesDefinition__Group__4"


    // $ANTLR start "rule__DatatypesDefinition__Group__4__Impl"
    // InternalRdfMapping.g:1158:1: rule__DatatypesDefinition__Group__4__Impl : ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) ;
    public final void rule__DatatypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1162:1: ( ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) )
            // InternalRdfMapping.g:1163:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            {
            // InternalRdfMapping.g:1163:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            // InternalRdfMapping.g:1164:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getTypesAssignment_4()); 
            // InternalRdfMapping.g:1165:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRdfMapping.g:1165:3: rule__DatatypesDefinition__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DatatypesDefinition__TypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDatatypesDefinitionAccess().getTypesAssignment_4()); 

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
    // $ANTLR end "rule__DatatypesDefinition__Group__4__Impl"


    // $ANTLR start "rule__DatatypesDefinition__Group__5"
    // InternalRdfMapping.g:1173:1: rule__DatatypesDefinition__Group__5 : rule__DatatypesDefinition__Group__5__Impl ;
    public final void rule__DatatypesDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1177:1: ( rule__DatatypesDefinition__Group__5__Impl )
            // InternalRdfMapping.g:1178:2: rule__DatatypesDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatatypesDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__DatatypesDefinition__Group__5"


    // $ANTLR start "rule__DatatypesDefinition__Group__5__Impl"
    // InternalRdfMapping.g:1184:1: rule__DatatypesDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__DatatypesDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1188:1: ( ( '}' ) )
            // InternalRdfMapping.g:1189:1: ( '}' )
            {
            // InternalRdfMapping.g:1189:1: ( '}' )
            // InternalRdfMapping.g:1190:2: '}'
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDatatypesDefinitionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DatatypesDefinition__Group__5__Impl"


    // $ANTLR start "rule__LanguageTagDefinition__Group__0"
    // InternalRdfMapping.g:1200:1: rule__LanguageTagDefinition__Group__0 : rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 ;
    public final void rule__LanguageTagDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1204:1: ( rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 )
            // InternalRdfMapping.g:1205:2: rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LanguageTagDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageTagDefinition__Group__1();

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__0"


    // $ANTLR start "rule__LanguageTagDefinition__Group__0__Impl"
    // InternalRdfMapping.g:1212:1: rule__LanguageTagDefinition__Group__0__Impl : ( () ) ;
    public final void rule__LanguageTagDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1216:1: ( ( () ) )
            // InternalRdfMapping.g:1217:1: ( () )
            {
            // InternalRdfMapping.g:1217:1: ( () )
            // InternalRdfMapping.g:1218:2: ()
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagDefinitionAction_0()); 
            // InternalRdfMapping.g:1219:2: ()
            // InternalRdfMapping.g:1219:3: 
            {
            }

             after(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageTagDefinition__Group__0__Impl"


    // $ANTLR start "rule__LanguageTagDefinition__Group__1"
    // InternalRdfMapping.g:1227:1: rule__LanguageTagDefinition__Group__1 : rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 ;
    public final void rule__LanguageTagDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1231:1: ( rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 )
            // InternalRdfMapping.g:1232:2: rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LanguageTagDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageTagDefinition__Group__2();

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__1"


    // $ANTLR start "rule__LanguageTagDefinition__Group__1__Impl"
    // InternalRdfMapping.g:1239:1: rule__LanguageTagDefinition__Group__1__Impl : ( 'language-tags' ) ;
    public final void rule__LanguageTagDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1243:1: ( ( 'language-tags' ) )
            // InternalRdfMapping.g:1244:1: ( 'language-tags' )
            {
            // InternalRdfMapping.g:1244:1: ( 'language-tags' )
            // InternalRdfMapping.g:1245:2: 'language-tags'
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsKeyword_1()); 

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__1__Impl"


    // $ANTLR start "rule__LanguageTagDefinition__Group__2"
    // InternalRdfMapping.g:1254:1: rule__LanguageTagDefinition__Group__2 : rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 ;
    public final void rule__LanguageTagDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1258:1: ( rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 )
            // InternalRdfMapping.g:1259:2: rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LanguageTagDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageTagDefinition__Group__3();

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__2"


    // $ANTLR start "rule__LanguageTagDefinition__Group__2__Impl"
    // InternalRdfMapping.g:1266:1: rule__LanguageTagDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LanguageTagDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1270:1: ( ( '{' ) )
            // InternalRdfMapping.g:1271:1: ( '{' )
            {
            // InternalRdfMapping.g:1271:1: ( '{' )
            // InternalRdfMapping.g:1272:2: '{'
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLanguageTagDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__2__Impl"


    // $ANTLR start "rule__LanguageTagDefinition__Group__3"
    // InternalRdfMapping.g:1281:1: rule__LanguageTagDefinition__Group__3 : rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 ;
    public final void rule__LanguageTagDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1285:1: ( rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 )
            // InternalRdfMapping.g:1286:2: rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__LanguageTagDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageTagDefinition__Group__4();

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__3"


    // $ANTLR start "rule__LanguageTagDefinition__Group__3__Impl"
    // InternalRdfMapping.g:1293:1: rule__LanguageTagDefinition__Group__3__Impl : ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) ;
    public final void rule__LanguageTagDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1297:1: ( ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) )
            // InternalRdfMapping.g:1298:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            {
            // InternalRdfMapping.g:1298:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            // InternalRdfMapping.g:1299:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsAssignment_3()); 
            // InternalRdfMapping.g:1300:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRdfMapping.g:1300:3: rule__LanguageTagDefinition__LanguageTagsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LanguageTagDefinition__LanguageTagsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsAssignment_3()); 

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__3__Impl"


    // $ANTLR start "rule__LanguageTagDefinition__Group__4"
    // InternalRdfMapping.g:1308:1: rule__LanguageTagDefinition__Group__4 : rule__LanguageTagDefinition__Group__4__Impl ;
    public final void rule__LanguageTagDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1312:1: ( rule__LanguageTagDefinition__Group__4__Impl )
            // InternalRdfMapping.g:1313:2: rule__LanguageTagDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageTagDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__4"


    // $ANTLR start "rule__LanguageTagDefinition__Group__4__Impl"
    // InternalRdfMapping.g:1319:1: rule__LanguageTagDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__LanguageTagDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1323:1: ( ( '}' ) )
            // InternalRdfMapping.g:1324:1: ( '}' )
            {
            // InternalRdfMapping.g:1324:1: ( '}' )
            // InternalRdfMapping.g:1325:2: '}'
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLanguageTagDefinitionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__LanguageTagDefinition__Group__4__Impl"


    // $ANTLR start "rule__SourceGroup__Group__0"
    // InternalRdfMapping.g:1335:1: rule__SourceGroup__Group__0 : rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 ;
    public final void rule__SourceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1339:1: ( rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 )
            // InternalRdfMapping.g:1340:2: rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:1347:1: rule__SourceGroup__Group__0__Impl : ( 'source-group' ) ;
    public final void rule__SourceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1351:1: ( ( 'source-group' ) )
            // InternalRdfMapping.g:1352:1: ( 'source-group' )
            {
            // InternalRdfMapping.g:1352:1: ( 'source-group' )
            // InternalRdfMapping.g:1353:2: 'source-group'
            {
             before(grammarAccess.getSourceGroupAccess().getSourceGroupKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRdfMapping.g:1362:1: rule__SourceGroup__Group__1 : rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 ;
    public final void rule__SourceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1366:1: ( rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 )
            // InternalRdfMapping.g:1367:2: rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2
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
    // InternalRdfMapping.g:1374:1: rule__SourceGroup__Group__1__Impl : ( ( rule__SourceGroup__NameAssignment_1 ) ) ;
    public final void rule__SourceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1378:1: ( ( ( rule__SourceGroup__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1379:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1379:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            // InternalRdfMapping.g:1380:2: ( rule__SourceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1381:2: ( rule__SourceGroup__NameAssignment_1 )
            // InternalRdfMapping.g:1381:3: rule__SourceGroup__NameAssignment_1
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
    // InternalRdfMapping.g:1389:1: rule__SourceGroup__Group__2 : rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 ;
    public final void rule__SourceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1393:1: ( rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 )
            // InternalRdfMapping.g:1394:2: rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalRdfMapping.g:1401:1: rule__SourceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1405:1: ( ( '{' ) )
            // InternalRdfMapping.g:1406:1: ( '{' )
            {
            // InternalRdfMapping.g:1406:1: ( '{' )
            // InternalRdfMapping.g:1407:2: '{'
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
    // InternalRdfMapping.g:1416:1: rule__SourceGroup__Group__3 : rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 ;
    public final void rule__SourceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1420:1: ( rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 )
            // InternalRdfMapping.g:1421:2: rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:1428:1: rule__SourceGroup__Group__3__Impl : ( 'type' ) ;
    public final void rule__SourceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1432:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1433:1: ( 'type' )
            {
            // InternalRdfMapping.g:1433:1: ( 'type' )
            // InternalRdfMapping.g:1434:2: 'type'
            {
             before(grammarAccess.getSourceGroupAccess().getTypeKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRdfMapping.g:1443:1: rule__SourceGroup__Group__4 : rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 ;
    public final void rule__SourceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1447:1: ( rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 )
            // InternalRdfMapping.g:1448:2: rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:1455:1: rule__SourceGroup__Group__4__Impl : ( ( rule__SourceGroup__TypeAssignment_4 ) ) ;
    public final void rule__SourceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1459:1: ( ( ( rule__SourceGroup__TypeAssignment_4 ) ) )
            // InternalRdfMapping.g:1460:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            {
            // InternalRdfMapping.g:1460:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            // InternalRdfMapping.g:1461:2: ( rule__SourceGroup__TypeAssignment_4 )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeAssignment_4()); 
            // InternalRdfMapping.g:1462:2: ( rule__SourceGroup__TypeAssignment_4 )
            // InternalRdfMapping.g:1462:3: rule__SourceGroup__TypeAssignment_4
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
    // InternalRdfMapping.g:1470:1: rule__SourceGroup__Group__5 : rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 ;
    public final void rule__SourceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1474:1: ( rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 )
            // InternalRdfMapping.g:1475:2: rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:1482:1: rule__SourceGroup__Group__5__Impl : ( ( rule__SourceGroup__Group_5__0 )? ) ;
    public final void rule__SourceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1486:1: ( ( ( rule__SourceGroup__Group_5__0 )? ) )
            // InternalRdfMapping.g:1487:1: ( ( rule__SourceGroup__Group_5__0 )? )
            {
            // InternalRdfMapping.g:1487:1: ( ( rule__SourceGroup__Group_5__0 )? )
            // InternalRdfMapping.g:1488:2: ( rule__SourceGroup__Group_5__0 )?
            {
             before(grammarAccess.getSourceGroupAccess().getGroup_5()); 
            // InternalRdfMapping.g:1489:2: ( rule__SourceGroup__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdfMapping.g:1489:3: rule__SourceGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SourceGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceGroupAccess().getGroup_5()); 

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
    // InternalRdfMapping.g:1497:1: rule__SourceGroup__Group__6 : rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 ;
    public final void rule__SourceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1501:1: ( rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 )
            // InternalRdfMapping.g:1502:2: rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:1509:1: rule__SourceGroup__Group__6__Impl : ( ( rule__SourceGroup__LogicalSourcesAssignment_6 )* ) ;
    public final void rule__SourceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1513:1: ( ( ( rule__SourceGroup__LogicalSourcesAssignment_6 )* ) )
            // InternalRdfMapping.g:1514:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_6 )* )
            {
            // InternalRdfMapping.g:1514:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_6 )* )
            // InternalRdfMapping.g:1515:2: ( rule__SourceGroup__LogicalSourcesAssignment_6 )*
            {
             before(grammarAccess.getSourceGroupAccess().getLogicalSourcesAssignment_6()); 
            // InternalRdfMapping.g:1516:2: ( rule__SourceGroup__LogicalSourcesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRdfMapping.g:1516:3: rule__SourceGroup__LogicalSourcesAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SourceGroup__LogicalSourcesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSourceGroupAccess().getLogicalSourcesAssignment_6()); 

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
    // InternalRdfMapping.g:1524:1: rule__SourceGroup__Group__7 : rule__SourceGroup__Group__7__Impl ;
    public final void rule__SourceGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1528:1: ( rule__SourceGroup__Group__7__Impl )
            // InternalRdfMapping.g:1529:2: rule__SourceGroup__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group__7__Impl();

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
    // InternalRdfMapping.g:1535:1: rule__SourceGroup__Group__7__Impl : ( '}' ) ;
    public final void rule__SourceGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1539:1: ( ( '}' ) )
            // InternalRdfMapping.g:1540:1: ( '}' )
            {
            // InternalRdfMapping.g:1540:1: ( '}' )
            // InternalRdfMapping.g:1541:2: '}'
            {
             before(grammarAccess.getSourceGroupAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__SourceGroup__Group_5__0"
    // InternalRdfMapping.g:1551:1: rule__SourceGroup__Group_5__0 : rule__SourceGroup__Group_5__0__Impl rule__SourceGroup__Group_5__1 ;
    public final void rule__SourceGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1555:1: ( rule__SourceGroup__Group_5__0__Impl rule__SourceGroup__Group_5__1 )
            // InternalRdfMapping.g:1556:2: rule__SourceGroup__Group_5__0__Impl rule__SourceGroup__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__SourceGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group_5__1();

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
    // $ANTLR end "rule__SourceGroup__Group_5__0"


    // $ANTLR start "rule__SourceGroup__Group_5__0__Impl"
    // InternalRdfMapping.g:1563:1: rule__SourceGroup__Group_5__0__Impl : ( 'source' ) ;
    public final void rule__SourceGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1567:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1568:1: ( 'source' )
            {
            // InternalRdfMapping.g:1568:1: ( 'source' )
            // InternalRdfMapping.g:1569:2: 'source'
            {
             before(grammarAccess.getSourceGroupAccess().getSourceKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getSourceKeyword_5_0()); 

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
    // $ANTLR end "rule__SourceGroup__Group_5__0__Impl"


    // $ANTLR start "rule__SourceGroup__Group_5__1"
    // InternalRdfMapping.g:1578:1: rule__SourceGroup__Group_5__1 : rule__SourceGroup__Group_5__1__Impl ;
    public final void rule__SourceGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1582:1: ( rule__SourceGroup__Group_5__1__Impl )
            // InternalRdfMapping.g:1583:2: rule__SourceGroup__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__Group_5__1__Impl();

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
    // $ANTLR end "rule__SourceGroup__Group_5__1"


    // $ANTLR start "rule__SourceGroup__Group_5__1__Impl"
    // InternalRdfMapping.g:1589:1: rule__SourceGroup__Group_5__1__Impl : ( ( rule__SourceGroup__SourceAssignment_5_1 ) ) ;
    public final void rule__SourceGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1593:1: ( ( ( rule__SourceGroup__SourceAssignment_5_1 ) ) )
            // InternalRdfMapping.g:1594:1: ( ( rule__SourceGroup__SourceAssignment_5_1 ) )
            {
            // InternalRdfMapping.g:1594:1: ( ( rule__SourceGroup__SourceAssignment_5_1 ) )
            // InternalRdfMapping.g:1595:2: ( rule__SourceGroup__SourceAssignment_5_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getSourceAssignment_5_1()); 
            // InternalRdfMapping.g:1596:2: ( rule__SourceGroup__SourceAssignment_5_1 )
            // InternalRdfMapping.g:1596:3: rule__SourceGroup__SourceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceGroup__SourceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceGroupAccess().getSourceAssignment_5_1()); 

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
    // $ANTLR end "rule__SourceGroup__Group_5__1__Impl"


    // $ANTLR start "rule__LogicalSource__Group__0"
    // InternalRdfMapping.g:1605:1: rule__LogicalSource__Group__0 : rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 ;
    public final void rule__LogicalSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1609:1: ( rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 )
            // InternalRdfMapping.g:1610:2: rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:1617:1: rule__LogicalSource__Group__0__Impl : ( 'logical-source' ) ;
    public final void rule__LogicalSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1621:1: ( ( 'logical-source' ) )
            // InternalRdfMapping.g:1622:1: ( 'logical-source' )
            {
            // InternalRdfMapping.g:1622:1: ( 'logical-source' )
            // InternalRdfMapping.g:1623:2: 'logical-source'
            {
             before(grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRdfMapping.g:1632:1: rule__LogicalSource__Group__1 : rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 ;
    public final void rule__LogicalSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1636:1: ( rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 )
            // InternalRdfMapping.g:1637:2: rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2
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
    // InternalRdfMapping.g:1644:1: rule__LogicalSource__Group__1__Impl : ( ( rule__LogicalSource__NameAssignment_1 ) ) ;
    public final void rule__LogicalSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1648:1: ( ( ( rule__LogicalSource__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1649:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1649:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            // InternalRdfMapping.g:1650:2: ( rule__LogicalSource__NameAssignment_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1651:2: ( rule__LogicalSource__NameAssignment_1 )
            // InternalRdfMapping.g:1651:3: rule__LogicalSource__NameAssignment_1
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
    // InternalRdfMapping.g:1659:1: rule__LogicalSource__Group__2 : rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 ;
    public final void rule__LogicalSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1663:1: ( rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 )
            // InternalRdfMapping.g:1664:2: rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRdfMapping.g:1671:1: rule__LogicalSource__Group__2__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1675:1: ( ( '{' ) )
            // InternalRdfMapping.g:1676:1: ( '{' )
            {
            // InternalRdfMapping.g:1676:1: ( '{' )
            // InternalRdfMapping.g:1677:2: '{'
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
    // InternalRdfMapping.g:1686:1: rule__LogicalSource__Group__3 : rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 ;
    public final void rule__LogicalSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1690:1: ( rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 )
            // InternalRdfMapping.g:1691:2: rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRdfMapping.g:1698:1: rule__LogicalSource__Group__3__Impl : ( ( rule__LogicalSource__Group_3__0 )? ) ;
    public final void rule__LogicalSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1702:1: ( ( ( rule__LogicalSource__Group_3__0 )? ) )
            // InternalRdfMapping.g:1703:1: ( ( rule__LogicalSource__Group_3__0 )? )
            {
            // InternalRdfMapping.g:1703:1: ( ( rule__LogicalSource__Group_3__0 )? )
            // InternalRdfMapping.g:1704:2: ( rule__LogicalSource__Group_3__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_3()); 
            // InternalRdfMapping.g:1705:2: ( rule__LogicalSource__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdfMapping.g:1705:3: rule__LogicalSource__Group_3__0
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
    // InternalRdfMapping.g:1713:1: rule__LogicalSource__Group__4 : rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 ;
    public final void rule__LogicalSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1717:1: ( rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 )
            // InternalRdfMapping.g:1718:2: rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalRdfMapping.g:1725:1: rule__LogicalSource__Group__4__Impl : ( ( rule__LogicalSource__Group_4__0 )? ) ;
    public final void rule__LogicalSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1729:1: ( ( ( rule__LogicalSource__Group_4__0 )? ) )
            // InternalRdfMapping.g:1730:1: ( ( rule__LogicalSource__Group_4__0 )? )
            {
            // InternalRdfMapping.g:1730:1: ( ( rule__LogicalSource__Group_4__0 )? )
            // InternalRdfMapping.g:1731:2: ( rule__LogicalSource__Group_4__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_4()); 
            // InternalRdfMapping.g:1732:2: ( rule__LogicalSource__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdfMapping.g:1732:3: rule__LogicalSource__Group_4__0
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
    // InternalRdfMapping.g:1740:1: rule__LogicalSource__Group__5 : rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 ;
    public final void rule__LogicalSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1744:1: ( rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 )
            // InternalRdfMapping.g:1745:2: rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalRdfMapping.g:1752:1: rule__LogicalSource__Group__5__Impl : ( ( rule__LogicalSource__Group_5__0 )? ) ;
    public final void rule__LogicalSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1756:1: ( ( ( rule__LogicalSource__Group_5__0 )? ) )
            // InternalRdfMapping.g:1757:1: ( ( rule__LogicalSource__Group_5__0 )? )
            {
            // InternalRdfMapping.g:1757:1: ( ( rule__LogicalSource__Group_5__0 )? )
            // InternalRdfMapping.g:1758:2: ( rule__LogicalSource__Group_5__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_5()); 
            // InternalRdfMapping.g:1759:2: ( rule__LogicalSource__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRdfMapping.g:1759:3: rule__LogicalSource__Group_5__0
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
    // InternalRdfMapping.g:1767:1: rule__LogicalSource__Group__6 : rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 ;
    public final void rule__LogicalSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1771:1: ( rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 )
            // InternalRdfMapping.g:1772:2: rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7
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
    // InternalRdfMapping.g:1779:1: rule__LogicalSource__Group__6__Impl : ( 'referenceables' ) ;
    public final void rule__LogicalSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1783:1: ( ( 'referenceables' ) )
            // InternalRdfMapping.g:1784:1: ( 'referenceables' )
            {
            // InternalRdfMapping.g:1784:1: ( 'referenceables' )
            // InternalRdfMapping.g:1785:2: 'referenceables'
            {
             before(grammarAccess.getLogicalSourceAccess().getReferenceablesKeyword_6()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRdfMapping.g:1794:1: rule__LogicalSource__Group__7 : rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 ;
    public final void rule__LogicalSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1798:1: ( rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 )
            // InternalRdfMapping.g:1799:2: rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8
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
    // InternalRdfMapping.g:1806:1: rule__LogicalSource__Group__7__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1810:1: ( ( '{' ) )
            // InternalRdfMapping.g:1811:1: ( '{' )
            {
            // InternalRdfMapping.g:1811:1: ( '{' )
            // InternalRdfMapping.g:1812:2: '{'
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
    // InternalRdfMapping.g:1821:1: rule__LogicalSource__Group__8 : rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 ;
    public final void rule__LogicalSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1825:1: ( rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 )
            // InternalRdfMapping.g:1826:2: rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9
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
    // InternalRdfMapping.g:1833:1: rule__LogicalSource__Group__8__Impl : ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) ;
    public final void rule__LogicalSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1837:1: ( ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) )
            // InternalRdfMapping.g:1838:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            {
            // InternalRdfMapping.g:1838:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            // InternalRdfMapping.g:1839:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            {
             before(grammarAccess.getLogicalSourceAccess().getReferencablesAssignment_8()); 
            // InternalRdfMapping.g:1840:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRdfMapping.g:1840:3: rule__LogicalSource__ReferencablesAssignment_8
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LogicalSource__ReferencablesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRdfMapping.g:1848:1: rule__LogicalSource__Group__9 : rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 ;
    public final void rule__LogicalSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1852:1: ( rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 )
            // InternalRdfMapping.g:1853:2: rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalRdfMapping.g:1860:1: rule__LogicalSource__Group__9__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1864:1: ( ( '}' ) )
            // InternalRdfMapping.g:1865:1: ( '}' )
            {
            // InternalRdfMapping.g:1865:1: ( '}' )
            // InternalRdfMapping.g:1866:2: '}'
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
    // InternalRdfMapping.g:1875:1: rule__LogicalSource__Group__10 : rule__LogicalSource__Group__10__Impl ;
    public final void rule__LogicalSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1879:1: ( rule__LogicalSource__Group__10__Impl )
            // InternalRdfMapping.g:1880:2: rule__LogicalSource__Group__10__Impl
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
    // InternalRdfMapping.g:1886:1: rule__LogicalSource__Group__10__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1890:1: ( ( '}' ) )
            // InternalRdfMapping.g:1891:1: ( '}' )
            {
            // InternalRdfMapping.g:1891:1: ( '}' )
            // InternalRdfMapping.g:1892:2: '}'
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
    // InternalRdfMapping.g:1902:1: rule__LogicalSource__Group_3__0 : rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 ;
    public final void rule__LogicalSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1906:1: ( rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 )
            // InternalRdfMapping.g:1907:2: rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:1914:1: rule__LogicalSource__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__LogicalSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1918:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1919:1: ( 'type' )
            {
            // InternalRdfMapping.g:1919:1: ( 'type' )
            // InternalRdfMapping.g:1920:2: 'type'
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRdfMapping.g:1929:1: rule__LogicalSource__Group_3__1 : rule__LogicalSource__Group_3__1__Impl ;
    public final void rule__LogicalSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1933:1: ( rule__LogicalSource__Group_3__1__Impl )
            // InternalRdfMapping.g:1934:2: rule__LogicalSource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_3__1__Impl();

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
    // InternalRdfMapping.g:1940:1: rule__LogicalSource__Group_3__1__Impl : ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) ;
    public final void rule__LogicalSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1944:1: ( ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) )
            // InternalRdfMapping.g:1945:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            {
            // InternalRdfMapping.g:1945:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            // InternalRdfMapping.g:1946:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeAssignment_3_1()); 
            // InternalRdfMapping.g:1947:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            // InternalRdfMapping.g:1947:3: rule__LogicalSource__TypeAssignment_3_1
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


    // $ANTLR start "rule__LogicalSource__Group_4__0"
    // InternalRdfMapping.g:1956:1: rule__LogicalSource__Group_4__0 : rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 ;
    public final void rule__LogicalSource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1960:1: ( rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 )
            // InternalRdfMapping.g:1961:2: rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1
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
    // InternalRdfMapping.g:1968:1: rule__LogicalSource__Group_4__0__Impl : ( 'source' ) ;
    public final void rule__LogicalSource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1972:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1973:1: ( 'source' )
            {
            // InternalRdfMapping.g:1973:1: ( 'source' )
            // InternalRdfMapping.g:1974:2: 'source'
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:1983:1: rule__LogicalSource__Group_4__1 : rule__LogicalSource__Group_4__1__Impl ;
    public final void rule__LogicalSource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1987:1: ( rule__LogicalSource__Group_4__1__Impl )
            // InternalRdfMapping.g:1988:2: rule__LogicalSource__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_4__1__Impl();

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
    // InternalRdfMapping.g:1994:1: rule__LogicalSource__Group_4__1__Impl : ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) ;
    public final void rule__LogicalSource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1998:1: ( ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) )
            // InternalRdfMapping.g:1999:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            {
            // InternalRdfMapping.g:1999:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            // InternalRdfMapping.g:2000:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceAssignment_4_1()); 
            // InternalRdfMapping.g:2001:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            // InternalRdfMapping.g:2001:3: rule__LogicalSource__SourceAssignment_4_1
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


    // $ANTLR start "rule__LogicalSource__Group_5__0"
    // InternalRdfMapping.g:2010:1: rule__LogicalSource__Group_5__0 : rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 ;
    public final void rule__LogicalSource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2014:1: ( rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 )
            // InternalRdfMapping.g:2015:2: rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1
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
    // InternalRdfMapping.g:2022:1: rule__LogicalSource__Group_5__0__Impl : ( 'iterator' ) ;
    public final void rule__LogicalSource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2026:1: ( ( 'iterator' ) )
            // InternalRdfMapping.g:2027:1: ( 'iterator' )
            {
            // InternalRdfMapping.g:2027:1: ( 'iterator' )
            // InternalRdfMapping.g:2028:2: 'iterator'
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRdfMapping.g:2037:1: rule__LogicalSource__Group_5__1 : rule__LogicalSource__Group_5__1__Impl ;
    public final void rule__LogicalSource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2041:1: ( rule__LogicalSource__Group_5__1__Impl )
            // InternalRdfMapping.g:2042:2: rule__LogicalSource__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSource__Group_5__1__Impl();

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
    // InternalRdfMapping.g:2048:1: rule__LogicalSource__Group_5__1__Impl : ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) ;
    public final void rule__LogicalSource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2052:1: ( ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) )
            // InternalRdfMapping.g:2053:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            {
            // InternalRdfMapping.g:2053:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            // InternalRdfMapping.g:2054:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorAssignment_5_1()); 
            // InternalRdfMapping.g:2055:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            // InternalRdfMapping.g:2055:3: rule__LogicalSource__IteratorAssignment_5_1
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


    // $ANTLR start "rule__Referenceable__Group__0"
    // InternalRdfMapping.g:2064:1: rule__Referenceable__Group__0 : rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 ;
    public final void rule__Referenceable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2068:1: ( rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 )
            // InternalRdfMapping.g:2069:2: rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1
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
    // InternalRdfMapping.g:2076:1: rule__Referenceable__Group__0__Impl : ( ( rule__Referenceable__NameAssignment_0 ) ) ;
    public final void rule__Referenceable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2080:1: ( ( ( rule__Referenceable__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:2081:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:2081:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            // InternalRdfMapping.g:2082:2: ( rule__Referenceable__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceableAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:2083:2: ( rule__Referenceable__NameAssignment_0 )
            // InternalRdfMapping.g:2083:3: rule__Referenceable__NameAssignment_0
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
    // InternalRdfMapping.g:2091:1: rule__Referenceable__Group__1 : rule__Referenceable__Group__1__Impl ;
    public final void rule__Referenceable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2095:1: ( rule__Referenceable__Group__1__Impl )
            // InternalRdfMapping.g:2096:2: rule__Referenceable__Group__1__Impl
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
    // InternalRdfMapping.g:2102:1: rule__Referenceable__Group__1__Impl : ( ( rule__Referenceable__ValueAssignment_1 )? ) ;
    public final void rule__Referenceable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2106:1: ( ( ( rule__Referenceable__ValueAssignment_1 )? ) )
            // InternalRdfMapping.g:2107:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            {
            // InternalRdfMapping.g:2107:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            // InternalRdfMapping.g:2108:2: ( rule__Referenceable__ValueAssignment_1 )?
            {
             before(grammarAccess.getReferenceableAccess().getValueAssignment_1()); 
            // InternalRdfMapping.g:2109:2: ( rule__Referenceable__ValueAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdfMapping.g:2109:3: rule__Referenceable__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Referenceable__ValueAssignment_1();

                    state._fsp--;


                    }
                    break;

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
    // InternalRdfMapping.g:2118:1: rule__Vocabulary__Group__0 : rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 ;
    public final void rule__Vocabulary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2122:1: ( rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 )
            // InternalRdfMapping.g:2123:2: rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:2130:1: rule__Vocabulary__Group__0__Impl : ( 'vocabulary' ) ;
    public final void rule__Vocabulary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2134:1: ( ( 'vocabulary' ) )
            // InternalRdfMapping.g:2135:1: ( 'vocabulary' )
            {
            // InternalRdfMapping.g:2135:1: ( 'vocabulary' )
            // InternalRdfMapping.g:2136:2: 'vocabulary'
            {
             before(grammarAccess.getVocabularyAccess().getVocabularyKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRdfMapping.g:2145:1: rule__Vocabulary__Group__1 : rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 ;
    public final void rule__Vocabulary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2149:1: ( rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 )
            // InternalRdfMapping.g:2150:2: rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2
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
    // InternalRdfMapping.g:2157:1: rule__Vocabulary__Group__1__Impl : ( ( rule__Vocabulary__NameAssignment_1 ) ) ;
    public final void rule__Vocabulary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2161:1: ( ( ( rule__Vocabulary__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2162:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2162:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            // InternalRdfMapping.g:2163:2: ( rule__Vocabulary__NameAssignment_1 )
            {
             before(grammarAccess.getVocabularyAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2164:2: ( rule__Vocabulary__NameAssignment_1 )
            // InternalRdfMapping.g:2164:3: rule__Vocabulary__NameAssignment_1
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
    // InternalRdfMapping.g:2172:1: rule__Vocabulary__Group__2 : rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 ;
    public final void rule__Vocabulary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2176:1: ( rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 )
            // InternalRdfMapping.g:2177:2: rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRdfMapping.g:2184:1: rule__Vocabulary__Group__2__Impl : ( '{' ) ;
    public final void rule__Vocabulary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2188:1: ( ( '{' ) )
            // InternalRdfMapping.g:2189:1: ( '{' )
            {
            // InternalRdfMapping.g:2189:1: ( '{' )
            // InternalRdfMapping.g:2190:2: '{'
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
    // InternalRdfMapping.g:2199:1: rule__Vocabulary__Group__3 : rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 ;
    public final void rule__Vocabulary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2203:1: ( rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 )
            // InternalRdfMapping.g:2204:2: rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalRdfMapping.g:2211:1: rule__Vocabulary__Group__3__Impl : ( ( rule__Vocabulary__PrefixAssignment_3 ) ) ;
    public final void rule__Vocabulary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2215:1: ( ( ( rule__Vocabulary__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:2216:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:2216:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:2217:2: ( rule__Vocabulary__PrefixAssignment_3 )
            {
             before(grammarAccess.getVocabularyAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:2218:2: ( rule__Vocabulary__PrefixAssignment_3 )
            // InternalRdfMapping.g:2218:3: rule__Vocabulary__PrefixAssignment_3
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
    // InternalRdfMapping.g:2226:1: rule__Vocabulary__Group__4 : rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 ;
    public final void rule__Vocabulary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2230:1: ( rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 )
            // InternalRdfMapping.g:2231:2: rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalRdfMapping.g:2238:1: rule__Vocabulary__Group__4__Impl : ( ( rule__Vocabulary__Group_4__0 )? ) ;
    public final void rule__Vocabulary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2242:1: ( ( ( rule__Vocabulary__Group_4__0 )? ) )
            // InternalRdfMapping.g:2243:1: ( ( rule__Vocabulary__Group_4__0 )? )
            {
            // InternalRdfMapping.g:2243:1: ( ( rule__Vocabulary__Group_4__0 )? )
            // InternalRdfMapping.g:2244:2: ( rule__Vocabulary__Group_4__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_4()); 
            // InternalRdfMapping.g:2245:2: ( rule__Vocabulary__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdfMapping.g:2245:3: rule__Vocabulary__Group_4__0
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
    // InternalRdfMapping.g:2253:1: rule__Vocabulary__Group__5 : rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 ;
    public final void rule__Vocabulary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2257:1: ( rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 )
            // InternalRdfMapping.g:2258:2: rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalRdfMapping.g:2265:1: rule__Vocabulary__Group__5__Impl : ( ( rule__Vocabulary__Group_5__0 )? ) ;
    public final void rule__Vocabulary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2269:1: ( ( ( rule__Vocabulary__Group_5__0 )? ) )
            // InternalRdfMapping.g:2270:1: ( ( rule__Vocabulary__Group_5__0 )? )
            {
            // InternalRdfMapping.g:2270:1: ( ( rule__Vocabulary__Group_5__0 )? )
            // InternalRdfMapping.g:2271:2: ( rule__Vocabulary__Group_5__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_5()); 
            // InternalRdfMapping.g:2272:2: ( rule__Vocabulary__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdfMapping.g:2272:3: rule__Vocabulary__Group_5__0
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
    // InternalRdfMapping.g:2280:1: rule__Vocabulary__Group__6 : rule__Vocabulary__Group__6__Impl ;
    public final void rule__Vocabulary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2284:1: ( rule__Vocabulary__Group__6__Impl )
            // InternalRdfMapping.g:2285:2: rule__Vocabulary__Group__6__Impl
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
    // InternalRdfMapping.g:2291:1: rule__Vocabulary__Group__6__Impl : ( '}' ) ;
    public final void rule__Vocabulary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2295:1: ( ( '}' ) )
            // InternalRdfMapping.g:2296:1: ( '}' )
            {
            // InternalRdfMapping.g:2296:1: ( '}' )
            // InternalRdfMapping.g:2297:2: '}'
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
    // InternalRdfMapping.g:2307:1: rule__Vocabulary__Group_4__0 : rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 ;
    public final void rule__Vocabulary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2311:1: ( rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 )
            // InternalRdfMapping.g:2312:2: rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:2319:1: rule__Vocabulary__Group_4__0__Impl : ( 'classes' ) ;
    public final void rule__Vocabulary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2323:1: ( ( 'classes' ) )
            // InternalRdfMapping.g:2324:1: ( 'classes' )
            {
            // InternalRdfMapping.g:2324:1: ( 'classes' )
            // InternalRdfMapping.g:2325:2: 'classes'
            {
             before(grammarAccess.getVocabularyAccess().getClassesKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRdfMapping.g:2334:1: rule__Vocabulary__Group_4__1 : rule__Vocabulary__Group_4__1__Impl ;
    public final void rule__Vocabulary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2338:1: ( rule__Vocabulary__Group_4__1__Impl )
            // InternalRdfMapping.g:2339:2: rule__Vocabulary__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_4__1__Impl();

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
    // InternalRdfMapping.g:2345:1: rule__Vocabulary__Group_4__1__Impl : ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) ;
    public final void rule__Vocabulary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2349:1: ( ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) )
            // InternalRdfMapping.g:2350:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            {
            // InternalRdfMapping.g:2350:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            // InternalRdfMapping.g:2351:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getClassesAssignment_4_1()); 
            // InternalRdfMapping.g:2352:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRdfMapping.g:2352:3: rule__Vocabulary__ClassesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__ClassesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "rule__Vocabulary__Group_5__0"
    // InternalRdfMapping.g:2361:1: rule__Vocabulary__Group_5__0 : rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 ;
    public final void rule__Vocabulary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2365:1: ( rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 )
            // InternalRdfMapping.g:2366:2: rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:2373:1: rule__Vocabulary__Group_5__0__Impl : ( 'properties' ) ;
    public final void rule__Vocabulary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2377:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:2378:1: ( 'properties' )
            {
            // InternalRdfMapping.g:2378:1: ( 'properties' )
            // InternalRdfMapping.g:2379:2: 'properties'
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRdfMapping.g:2388:1: rule__Vocabulary__Group_5__1 : rule__Vocabulary__Group_5__1__Impl ;
    public final void rule__Vocabulary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2392:1: ( rule__Vocabulary__Group_5__1__Impl )
            // InternalRdfMapping.g:2393:2: rule__Vocabulary__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vocabulary__Group_5__1__Impl();

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
    // InternalRdfMapping.g:2399:1: rule__Vocabulary__Group_5__1__Impl : ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) ;
    public final void rule__Vocabulary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2403:1: ( ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) )
            // InternalRdfMapping.g:2404:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            {
            // InternalRdfMapping.g:2404:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            // InternalRdfMapping.g:2405:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesAssignment_5_1()); 
            // InternalRdfMapping.g:2406:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRdfMapping.g:2406:3: rule__Vocabulary__PropertiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__PropertiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "rule__Prefix__Group__0"
    // InternalRdfMapping.g:2415:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2419:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalRdfMapping.g:2420:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
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
    // InternalRdfMapping.g:2427:1: rule__Prefix__Group__0__Impl : ( 'prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2431:1: ( ( 'prefix' ) )
            // InternalRdfMapping.g:2432:1: ( 'prefix' )
            {
            // InternalRdfMapping.g:2432:1: ( 'prefix' )
            // InternalRdfMapping.g:2433:2: 'prefix'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRdfMapping.g:2442:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2446:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalRdfMapping.g:2447:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
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
    // InternalRdfMapping.g:2454:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__LabelAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2458:1: ( ( ( rule__Prefix__LabelAssignment_1 ) ) )
            // InternalRdfMapping.g:2459:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            {
            // InternalRdfMapping.g:2459:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            // InternalRdfMapping.g:2460:2: ( rule__Prefix__LabelAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getLabelAssignment_1()); 
            // InternalRdfMapping.g:2461:2: ( rule__Prefix__LabelAssignment_1 )
            // InternalRdfMapping.g:2461:3: rule__Prefix__LabelAssignment_1
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
    // InternalRdfMapping.g:2469:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2473:1: ( rule__Prefix__Group__2__Impl )
            // InternalRdfMapping.g:2474:2: rule__Prefix__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__2__Impl();

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
    // InternalRdfMapping.g:2480:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__IriAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2484:1: ( ( ( rule__Prefix__IriAssignment_2 ) ) )
            // InternalRdfMapping.g:2485:1: ( ( rule__Prefix__IriAssignment_2 ) )
            {
            // InternalRdfMapping.g:2485:1: ( ( rule__Prefix__IriAssignment_2 ) )
            // InternalRdfMapping.g:2486:2: ( rule__Prefix__IriAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getIriAssignment_2()); 
            // InternalRdfMapping.g:2487:2: ( rule__Prefix__IriAssignment_2 )
            // InternalRdfMapping.g:2487:3: rule__Prefix__IriAssignment_2
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


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalRdfMapping.g:2496:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2500:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalRdfMapping.g:2501:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:2508:1: rule__Mapping__Group__0__Impl : ( 'map' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2512:1: ( ( 'map' ) )
            // InternalRdfMapping.g:2513:1: ( 'map' )
            {
            // InternalRdfMapping.g:2513:1: ( 'map' )
            // InternalRdfMapping.g:2514:2: 'map'
            {
             before(grammarAccess.getMappingAccess().getMapKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRdfMapping.g:2523:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2527:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalRdfMapping.g:2528:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
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
    // InternalRdfMapping.g:2535:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2539:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2540:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2540:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // InternalRdfMapping.g:2541:2: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2542:2: ( rule__Mapping__NameAssignment_1 )
            // InternalRdfMapping.g:2542:3: rule__Mapping__NameAssignment_1
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
    // InternalRdfMapping.g:2550:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2554:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalRdfMapping.g:2555:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:2562:1: rule__Mapping__Group__2__Impl : ( 'from' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2566:1: ( ( 'from' ) )
            // InternalRdfMapping.g:2567:1: ( 'from' )
            {
            // InternalRdfMapping.g:2567:1: ( 'from' )
            // InternalRdfMapping.g:2568:2: 'from'
            {
             before(grammarAccess.getMappingAccess().getFromKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRdfMapping.g:2577:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2581:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalRdfMapping.g:2582:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
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
    // InternalRdfMapping.g:2589:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__SourceAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2593:1: ( ( ( rule__Mapping__SourceAssignment_3 ) ) )
            // InternalRdfMapping.g:2594:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            {
            // InternalRdfMapping.g:2594:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            // InternalRdfMapping.g:2595:2: ( rule__Mapping__SourceAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getSourceAssignment_3()); 
            // InternalRdfMapping.g:2596:2: ( rule__Mapping__SourceAssignment_3 )
            // InternalRdfMapping.g:2596:3: rule__Mapping__SourceAssignment_3
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
    // InternalRdfMapping.g:2604:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2608:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalRdfMapping.g:2609:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
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
    // InternalRdfMapping.g:2616:1: rule__Mapping__Group__4__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2620:1: ( ( '{' ) )
            // InternalRdfMapping.g:2621:1: ( '{' )
            {
            // InternalRdfMapping.g:2621:1: ( '{' )
            // InternalRdfMapping.g:2622:2: '{'
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
    // InternalRdfMapping.g:2631:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2635:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalRdfMapping.g:2636:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRdfMapping.g:2643:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__Group_5__0 )? ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2647:1: ( ( ( rule__Mapping__Group_5__0 )? ) )
            // InternalRdfMapping.g:2648:1: ( ( rule__Mapping__Group_5__0 )? )
            {
            // InternalRdfMapping.g:2648:1: ( ( rule__Mapping__Group_5__0 )? )
            // InternalRdfMapping.g:2649:2: ( rule__Mapping__Group_5__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_5()); 
            // InternalRdfMapping.g:2650:2: ( rule__Mapping__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdfMapping.g:2650:3: rule__Mapping__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getGroup_5()); 

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
    // InternalRdfMapping.g:2658:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2662:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalRdfMapping.g:2663:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalRdfMapping.g:2670:1: rule__Mapping__Group__6__Impl : ( 'subject' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2674:1: ( ( 'subject' ) )
            // InternalRdfMapping.g:2675:1: ( 'subject' )
            {
            // InternalRdfMapping.g:2675:1: ( 'subject' )
            // InternalRdfMapping.g:2676:2: 'subject'
            {
             before(grammarAccess.getMappingAccess().getSubjectKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getSubjectKeyword_6()); 

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
    // InternalRdfMapping.g:2685:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl rule__Mapping__Group__8 ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2689:1: ( rule__Mapping__Group__7__Impl rule__Mapping__Group__8 )
            // InternalRdfMapping.g:2690:2: rule__Mapping__Group__7__Impl rule__Mapping__Group__8
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
    // InternalRdfMapping.g:2697:1: rule__Mapping__Group__7__Impl : ( ( rule__Mapping__SubjectIriMappingAssignment_7 ) ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2701:1: ( ( ( rule__Mapping__SubjectIriMappingAssignment_7 ) ) )
            // InternalRdfMapping.g:2702:1: ( ( rule__Mapping__SubjectIriMappingAssignment_7 ) )
            {
            // InternalRdfMapping.g:2702:1: ( ( rule__Mapping__SubjectIriMappingAssignment_7 ) )
            // InternalRdfMapping.g:2703:2: ( rule__Mapping__SubjectIriMappingAssignment_7 )
            {
             before(grammarAccess.getMappingAccess().getSubjectIriMappingAssignment_7()); 
            // InternalRdfMapping.g:2704:2: ( rule__Mapping__SubjectIriMappingAssignment_7 )
            // InternalRdfMapping.g:2704:3: rule__Mapping__SubjectIriMappingAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__SubjectIriMappingAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSubjectIriMappingAssignment_7()); 

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
    // InternalRdfMapping.g:2712:1: rule__Mapping__Group__8 : rule__Mapping__Group__8__Impl rule__Mapping__Group__9 ;
    public final void rule__Mapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2716:1: ( rule__Mapping__Group__8__Impl rule__Mapping__Group__9 )
            // InternalRdfMapping.g:2717:2: rule__Mapping__Group__8__Impl rule__Mapping__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalRdfMapping.g:2724:1: rule__Mapping__Group__8__Impl : ( ( rule__Mapping__Group_8__0 )? ) ;
    public final void rule__Mapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2728:1: ( ( ( rule__Mapping__Group_8__0 )? ) )
            // InternalRdfMapping.g:2729:1: ( ( rule__Mapping__Group_8__0 )? )
            {
            // InternalRdfMapping.g:2729:1: ( ( rule__Mapping__Group_8__0 )? )
            // InternalRdfMapping.g:2730:2: ( rule__Mapping__Group_8__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_8()); 
            // InternalRdfMapping.g:2731:2: ( rule__Mapping__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdfMapping.g:2731:3: rule__Mapping__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getGroup_8()); 

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
    // InternalRdfMapping.g:2739:1: rule__Mapping__Group__9 : rule__Mapping__Group__9__Impl rule__Mapping__Group__10 ;
    public final void rule__Mapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2743:1: ( rule__Mapping__Group__9__Impl rule__Mapping__Group__10 )
            // InternalRdfMapping.g:2744:2: rule__Mapping__Group__9__Impl rule__Mapping__Group__10
            {
            pushFollow(FOLLOW_23);
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
    // InternalRdfMapping.g:2751:1: rule__Mapping__Group__9__Impl : ( ( rule__Mapping__Group_9__0 )? ) ;
    public final void rule__Mapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2755:1: ( ( ( rule__Mapping__Group_9__0 )? ) )
            // InternalRdfMapping.g:2756:1: ( ( rule__Mapping__Group_9__0 )? )
            {
            // InternalRdfMapping.g:2756:1: ( ( rule__Mapping__Group_9__0 )? )
            // InternalRdfMapping.g:2757:2: ( rule__Mapping__Group_9__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_9()); 
            // InternalRdfMapping.g:2758:2: ( rule__Mapping__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRdfMapping.g:2758:3: rule__Mapping__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getGroup_9()); 

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
    // InternalRdfMapping.g:2766:1: rule__Mapping__Group__10 : rule__Mapping__Group__10__Impl ;
    public final void rule__Mapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2770:1: ( rule__Mapping__Group__10__Impl )
            // InternalRdfMapping.g:2771:2: rule__Mapping__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__10__Impl();

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
    // InternalRdfMapping.g:2777:1: rule__Mapping__Group__10__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2781:1: ( ( '}' ) )
            // InternalRdfMapping.g:2782:1: ( '}' )
            {
            // InternalRdfMapping.g:2782:1: ( '}' )
            // InternalRdfMapping.g:2783:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_10()); 

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


    // $ANTLR start "rule__Mapping__Group_5__0"
    // InternalRdfMapping.g:2793:1: rule__Mapping__Group_5__0 : rule__Mapping__Group_5__0__Impl rule__Mapping__Group_5__1 ;
    public final void rule__Mapping__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2797:1: ( rule__Mapping__Group_5__0__Impl rule__Mapping__Group_5__1 )
            // InternalRdfMapping.g:2798:2: rule__Mapping__Group_5__0__Impl rule__Mapping__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Mapping__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_5__1();

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
    // $ANTLR end "rule__Mapping__Group_5__0"


    // $ANTLR start "rule__Mapping__Group_5__0__Impl"
    // InternalRdfMapping.g:2805:1: rule__Mapping__Group_5__0__Impl : ( 'use-vocabularies' ) ;
    public final void rule__Mapping__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2809:1: ( ( 'use-vocabularies' ) )
            // InternalRdfMapping.g:2810:1: ( 'use-vocabularies' )
            {
            // InternalRdfMapping.g:2810:1: ( 'use-vocabularies' )
            // InternalRdfMapping.g:2811:2: 'use-vocabularies'
            {
             before(grammarAccess.getMappingAccess().getUseVocabulariesKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getUseVocabulariesKeyword_5_0()); 

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
    // $ANTLR end "rule__Mapping__Group_5__0__Impl"


    // $ANTLR start "rule__Mapping__Group_5__1"
    // InternalRdfMapping.g:2820:1: rule__Mapping__Group_5__1 : rule__Mapping__Group_5__1__Impl ;
    public final void rule__Mapping__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2824:1: ( rule__Mapping__Group_5__1__Impl )
            // InternalRdfMapping.g:2825:2: rule__Mapping__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_5__1__Impl();

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
    // $ANTLR end "rule__Mapping__Group_5__1"


    // $ANTLR start "rule__Mapping__Group_5__1__Impl"
    // InternalRdfMapping.g:2831:1: rule__Mapping__Group_5__1__Impl : ( ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 ) ) ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 )* ) ) ;
    public final void rule__Mapping__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2835:1: ( ( ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 ) ) ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 )* ) ) )
            // InternalRdfMapping.g:2836:1: ( ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 ) ) ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 )* ) )
            {
            // InternalRdfMapping.g:2836:1: ( ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 ) ) ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 )* ) )
            // InternalRdfMapping.g:2837:2: ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 ) ) ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 )* )
            {
            // InternalRdfMapping.g:2837:2: ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 ) )
            // InternalRdfMapping.g:2838:3: ( rule__Mapping__TargetVocabulariesAssignment_5_1 )
            {
             before(grammarAccess.getMappingAccess().getTargetVocabulariesAssignment_5_1()); 
            // InternalRdfMapping.g:2839:3: ( rule__Mapping__TargetVocabulariesAssignment_5_1 )
            // InternalRdfMapping.g:2839:4: rule__Mapping__TargetVocabulariesAssignment_5_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__TargetVocabulariesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getTargetVocabulariesAssignment_5_1()); 

            }

            // InternalRdfMapping.g:2842:2: ( ( rule__Mapping__TargetVocabulariesAssignment_5_1 )* )
            // InternalRdfMapping.g:2843:3: ( rule__Mapping__TargetVocabulariesAssignment_5_1 )*
            {
             before(grammarAccess.getMappingAccess().getTargetVocabulariesAssignment_5_1()); 
            // InternalRdfMapping.g:2844:3: ( rule__Mapping__TargetVocabulariesAssignment_5_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRdfMapping.g:2844:4: rule__Mapping__TargetVocabulariesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__TargetVocabulariesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getTargetVocabulariesAssignment_5_1()); 

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
    // $ANTLR end "rule__Mapping__Group_5__1__Impl"


    // $ANTLR start "rule__Mapping__Group_8__0"
    // InternalRdfMapping.g:2854:1: rule__Mapping__Group_8__0 : rule__Mapping__Group_8__0__Impl rule__Mapping__Group_8__1 ;
    public final void rule__Mapping__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2858:1: ( rule__Mapping__Group_8__0__Impl rule__Mapping__Group_8__1 )
            // InternalRdfMapping.g:2859:2: rule__Mapping__Group_8__0__Impl rule__Mapping__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__Mapping__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_8__1();

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
    // $ANTLR end "rule__Mapping__Group_8__0"


    // $ANTLR start "rule__Mapping__Group_8__0__Impl"
    // InternalRdfMapping.g:2866:1: rule__Mapping__Group_8__0__Impl : ( 'types' ) ;
    public final void rule__Mapping__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2870:1: ( ( 'types' ) )
            // InternalRdfMapping.g:2871:1: ( 'types' )
            {
            // InternalRdfMapping.g:2871:1: ( 'types' )
            // InternalRdfMapping.g:2872:2: 'types'
            {
             before(grammarAccess.getMappingAccess().getTypesKeyword_8_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getTypesKeyword_8_0()); 

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
    // $ANTLR end "rule__Mapping__Group_8__0__Impl"


    // $ANTLR start "rule__Mapping__Group_8__1"
    // InternalRdfMapping.g:2881:1: rule__Mapping__Group_8__1 : rule__Mapping__Group_8__1__Impl ;
    public final void rule__Mapping__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2885:1: ( rule__Mapping__Group_8__1__Impl )
            // InternalRdfMapping.g:2886:2: rule__Mapping__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_8__1__Impl();

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
    // $ANTLR end "rule__Mapping__Group_8__1"


    // $ANTLR start "rule__Mapping__Group_8__1__Impl"
    // InternalRdfMapping.g:2892:1: rule__Mapping__Group_8__1__Impl : ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )* ) ) ;
    public final void rule__Mapping__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2896:1: ( ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )* ) ) )
            // InternalRdfMapping.g:2897:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )* ) )
            {
            // InternalRdfMapping.g:2897:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )* ) )
            // InternalRdfMapping.g:2898:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )* )
            {
            // InternalRdfMapping.g:2898:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 ) )
            // InternalRdfMapping.g:2899:3: ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_8_1()); 
            // InternalRdfMapping.g:2900:3: ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )
            // InternalRdfMapping.g:2900:4: rule__Mapping__SubjectTypeMappingsAssignment_8_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__SubjectTypeMappingsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_8_1()); 

            }

            // InternalRdfMapping.g:2903:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )* )
            // InternalRdfMapping.g:2904:3: ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )*
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_8_1()); 
            // InternalRdfMapping.g:2905:3: ( rule__Mapping__SubjectTypeMappingsAssignment_8_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRdfMapping.g:2905:4: rule__Mapping__SubjectTypeMappingsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__SubjectTypeMappingsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_8_1()); 

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
    // $ANTLR end "rule__Mapping__Group_8__1__Impl"


    // $ANTLR start "rule__Mapping__Group_9__0"
    // InternalRdfMapping.g:2915:1: rule__Mapping__Group_9__0 : rule__Mapping__Group_9__0__Impl rule__Mapping__Group_9__1 ;
    public final void rule__Mapping__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2919:1: ( rule__Mapping__Group_9__0__Impl rule__Mapping__Group_9__1 )
            // InternalRdfMapping.g:2920:2: rule__Mapping__Group_9__0__Impl rule__Mapping__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Mapping__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_9__1();

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
    // $ANTLR end "rule__Mapping__Group_9__0"


    // $ANTLR start "rule__Mapping__Group_9__0__Impl"
    // InternalRdfMapping.g:2927:1: rule__Mapping__Group_9__0__Impl : ( 'properties' ) ;
    public final void rule__Mapping__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2931:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:2932:1: ( 'properties' )
            {
            // InternalRdfMapping.g:2932:1: ( 'properties' )
            // InternalRdfMapping.g:2933:2: 'properties'
            {
             before(grammarAccess.getMappingAccess().getPropertiesKeyword_9_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getPropertiesKeyword_9_0()); 

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
    // $ANTLR end "rule__Mapping__Group_9__0__Impl"


    // $ANTLR start "rule__Mapping__Group_9__1"
    // InternalRdfMapping.g:2942:1: rule__Mapping__Group_9__1 : rule__Mapping__Group_9__1__Impl ;
    public final void rule__Mapping__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2946:1: ( rule__Mapping__Group_9__1__Impl )
            // InternalRdfMapping.g:2947:2: rule__Mapping__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_9__1__Impl();

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
    // $ANTLR end "rule__Mapping__Group_9__1"


    // $ANTLR start "rule__Mapping__Group_9__1__Impl"
    // InternalRdfMapping.g:2953:1: rule__Mapping__Group_9__1__Impl : ( ( ( rule__Mapping__PoMappingsAssignment_9_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_9_1 )* ) ) ;
    public final void rule__Mapping__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2957:1: ( ( ( ( rule__Mapping__PoMappingsAssignment_9_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_9_1 )* ) ) )
            // InternalRdfMapping.g:2958:1: ( ( ( rule__Mapping__PoMappingsAssignment_9_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_9_1 )* ) )
            {
            // InternalRdfMapping.g:2958:1: ( ( ( rule__Mapping__PoMappingsAssignment_9_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_9_1 )* ) )
            // InternalRdfMapping.g:2959:2: ( ( rule__Mapping__PoMappingsAssignment_9_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_9_1 )* )
            {
            // InternalRdfMapping.g:2959:2: ( ( rule__Mapping__PoMappingsAssignment_9_1 ) )
            // InternalRdfMapping.g:2960:3: ( rule__Mapping__PoMappingsAssignment_9_1 )
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_9_1()); 
            // InternalRdfMapping.g:2961:3: ( rule__Mapping__PoMappingsAssignment_9_1 )
            // InternalRdfMapping.g:2961:4: rule__Mapping__PoMappingsAssignment_9_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__PoMappingsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPoMappingsAssignment_9_1()); 

            }

            // InternalRdfMapping.g:2964:2: ( ( rule__Mapping__PoMappingsAssignment_9_1 )* )
            // InternalRdfMapping.g:2965:3: ( rule__Mapping__PoMappingsAssignment_9_1 )*
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_9_1()); 
            // InternalRdfMapping.g:2966:3: ( rule__Mapping__PoMappingsAssignment_9_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRdfMapping.g:2966:4: rule__Mapping__PoMappingsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__PoMappingsAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getPoMappingsAssignment_9_1()); 

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
    // $ANTLR end "rule__Mapping__Group_9__1__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group__0"
    // InternalRdfMapping.g:2976:1: rule__PredicateObjectMapping__Group__0 : rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 ;
    public final void rule__PredicateObjectMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2980:1: ( rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 )
            // InternalRdfMapping.g:2981:2: rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRdfMapping.g:2988:1: rule__PredicateObjectMapping__Group__0__Impl : ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) ;
    public final void rule__PredicateObjectMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2992:1: ( ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) )
            // InternalRdfMapping.g:2993:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            {
            // InternalRdfMapping.g:2993:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            // InternalRdfMapping.g:2994:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyAssignment_0()); 
            // InternalRdfMapping.g:2995:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            // InternalRdfMapping.g:2995:3: rule__PredicateObjectMapping__PropertyAssignment_0
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
    // InternalRdfMapping.g:3003:1: rule__PredicateObjectMapping__Group__1 : rule__PredicateObjectMapping__Group__1__Impl ;
    public final void rule__PredicateObjectMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3007:1: ( rule__PredicateObjectMapping__Group__1__Impl )
            // InternalRdfMapping.g:3008:2: rule__PredicateObjectMapping__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group__1__Impl();

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
    // InternalRdfMapping.g:3014:1: rule__PredicateObjectMapping__Group__1__Impl : ( ( rule__PredicateObjectMapping__TermAssignment_1 ) ) ;
    public final void rule__PredicateObjectMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3018:1: ( ( ( rule__PredicateObjectMapping__TermAssignment_1 ) ) )
            // InternalRdfMapping.g:3019:1: ( ( rule__PredicateObjectMapping__TermAssignment_1 ) )
            {
            // InternalRdfMapping.g:3019:1: ( ( rule__PredicateObjectMapping__TermAssignment_1 ) )
            // InternalRdfMapping.g:3020:2: ( rule__PredicateObjectMapping__TermAssignment_1 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getTermAssignment_1()); 
            // InternalRdfMapping.g:3021:2: ( rule__PredicateObjectMapping__TermAssignment_1 )
            // InternalRdfMapping.g:3021:3: rule__PredicateObjectMapping__TermAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__TermAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectMappingAccess().getTermAssignment_1()); 

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


    // $ANTLR start "rule__ReferenceValuedTerm__Group__0"
    // InternalRdfMapping.g:3030:1: rule__ReferenceValuedTerm__Group__0 : rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1 ;
    public final void rule__ReferenceValuedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3034:1: ( rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1 )
            // InternalRdfMapping.g:3035:2: rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ReferenceValuedTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group__1();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group__0"


    // $ANTLR start "rule__ReferenceValuedTerm__Group__0__Impl"
    // InternalRdfMapping.g:3042:1: rule__ReferenceValuedTerm__Group__0__Impl : ( 'from' ) ;
    public final void rule__ReferenceValuedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3046:1: ( ( 'from' ) )
            // InternalRdfMapping.g:3047:1: ( 'from' )
            {
            // InternalRdfMapping.g:3047:1: ( 'from' )
            // InternalRdfMapping.g:3048:2: 'from'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getFromKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group__0__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group__1"
    // InternalRdfMapping.g:3057:1: rule__ReferenceValuedTerm__Group__1 : rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2 ;
    public final void rule__ReferenceValuedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3061:1: ( rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2 )
            // InternalRdfMapping.g:3062:2: rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ReferenceValuedTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group__2();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group__1"


    // $ANTLR start "rule__ReferenceValuedTerm__Group__1__Impl"
    // InternalRdfMapping.g:3069:1: rule__ReferenceValuedTerm__Group__1__Impl : ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceValuedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3073:1: ( ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) ) )
            // InternalRdfMapping.g:3074:1: ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) )
            {
            // InternalRdfMapping.g:3074:1: ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) )
            // InternalRdfMapping.g:3075:2: ( rule__ReferenceValuedTerm__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceAssignment_1()); 
            // InternalRdfMapping.g:3076:2: ( rule__ReferenceValuedTerm__ReferenceAssignment_1 )
            // InternalRdfMapping.g:3076:3: rule__ReferenceValuedTerm__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceValuedTermAccess().getReferenceAssignment_1()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group__1__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group__2"
    // InternalRdfMapping.g:3084:1: rule__ReferenceValuedTerm__Group__2 : rule__ReferenceValuedTerm__Group__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3088:1: ( rule__ReferenceValuedTerm__Group__2__Impl )
            // InternalRdfMapping.g:3089:2: rule__ReferenceValuedTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group__2__Impl();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group__2"


    // $ANTLR start "rule__ReferenceValuedTerm__Group__2__Impl"
    // InternalRdfMapping.g:3095:1: rule__ReferenceValuedTerm__Group__2__Impl : ( ( rule__ReferenceValuedTerm__Alternatives_2 )? ) ;
    public final void rule__ReferenceValuedTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3099:1: ( ( ( rule__ReferenceValuedTerm__Alternatives_2 )? ) )
            // InternalRdfMapping.g:3100:1: ( ( rule__ReferenceValuedTerm__Alternatives_2 )? )
            {
            // InternalRdfMapping.g:3100:1: ( ( rule__ReferenceValuedTerm__Alternatives_2 )? )
            // InternalRdfMapping.g:3101:2: ( rule__ReferenceValuedTerm__Alternatives_2 )?
            {
             before(grammarAccess.getReferenceValuedTermAccess().getAlternatives_2()); 
            // InternalRdfMapping.g:3102:2: ( rule__ReferenceValuedTerm__Alternatives_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRdfMapping.g:3102:3: rule__ReferenceValuedTerm__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceValuedTerm__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceValuedTermAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group__2__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_0__0"
    // InternalRdfMapping.g:3111:1: rule__ReferenceValuedTerm__Group_2_0__0 : rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1 ;
    public final void rule__ReferenceValuedTerm__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3115:1: ( rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1 )
            // InternalRdfMapping.g:3116:2: rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1
            {
            pushFollow(FOLLOW_26);
            rule__ReferenceValuedTerm__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group_2_0__1();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_0__0"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_0__0__Impl"
    // InternalRdfMapping.g:3123:1: rule__ReferenceValuedTerm__Group_2_0__0__Impl : ( 'with' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3127:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3128:1: ( 'with' )
            {
            // InternalRdfMapping.g:3128:1: ( 'with' )
            // InternalRdfMapping.g:3129:2: 'with'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_0_0()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_0__0__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_0__1"
    // InternalRdfMapping.g:3138:1: rule__ReferenceValuedTerm__Group_2_0__1 : rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2 ;
    public final void rule__ReferenceValuedTerm__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3142:1: ( rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2 )
            // InternalRdfMapping.g:3143:2: rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2
            {
            pushFollow(FOLLOW_13);
            rule__ReferenceValuedTerm__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group_2_0__2();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_0__1"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_0__1__Impl"
    // InternalRdfMapping.g:3150:1: rule__ReferenceValuedTerm__Group_2_0__1__Impl : ( 'datatype' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3154:1: ( ( 'datatype' ) )
            // InternalRdfMapping.g:3155:1: ( 'datatype' )
            {
            // InternalRdfMapping.g:3155:1: ( 'datatype' )
            // InternalRdfMapping.g:3156:2: 'datatype'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeKeyword_2_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getDatatypeKeyword_2_0_1()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_0__1__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_0__2"
    // InternalRdfMapping.g:3165:1: rule__ReferenceValuedTerm__Group_2_0__2 : rule__ReferenceValuedTerm__Group_2_0__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3169:1: ( rule__ReferenceValuedTerm__Group_2_0__2__Impl )
            // InternalRdfMapping.g:3170:2: rule__ReferenceValuedTerm__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_0__2"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_0__2__Impl"
    // InternalRdfMapping.g:3176:1: rule__ReferenceValuedTerm__Group_2_0__2__Impl : ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3180:1: ( ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) ) )
            // InternalRdfMapping.g:3181:1: ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) )
            {
            // InternalRdfMapping.g:3181:1: ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) )
            // InternalRdfMapping.g:3182:2: ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeAssignment_2_0_2()); 
            // InternalRdfMapping.g:3183:2: ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 )
            // InternalRdfMapping.g:3183:3: rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceValuedTermAccess().getDatatypeAssignment_2_0_2()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_0__2__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_1__0"
    // InternalRdfMapping.g:3192:1: rule__ReferenceValuedTerm__Group_2_1__0 : rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1 ;
    public final void rule__ReferenceValuedTerm__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3196:1: ( rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1 )
            // InternalRdfMapping.g:3197:2: rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ReferenceValuedTerm__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group_2_1__1();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_1__0"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_1__0__Impl"
    // InternalRdfMapping.g:3204:1: rule__ReferenceValuedTerm__Group_2_1__0__Impl : ( 'with' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3208:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3209:1: ( 'with' )
            {
            // InternalRdfMapping.g:3209:1: ( 'with' )
            // InternalRdfMapping.g:3210:2: 'with'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_1_0()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_1__0__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_1__1"
    // InternalRdfMapping.g:3219:1: rule__ReferenceValuedTerm__Group_2_1__1 : rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2 ;
    public final void rule__ReferenceValuedTerm__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3223:1: ( rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2 )
            // InternalRdfMapping.g:3224:2: rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2
            {
            pushFollow(FOLLOW_13);
            rule__ReferenceValuedTerm__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group_2_1__2();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_1__1"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_1__1__Impl"
    // InternalRdfMapping.g:3231:1: rule__ReferenceValuedTerm__Group_2_1__1__Impl : ( 'language-tag' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3235:1: ( ( 'language-tag' ) )
            // InternalRdfMapping.g:3236:1: ( 'language-tag' )
            {
            // InternalRdfMapping.g:3236:1: ( 'language-tag' )
            // InternalRdfMapping.g:3237:2: 'language-tag'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagKeyword_2_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getLanguageTagKeyword_2_1_1()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_1__1__Impl"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_1__2"
    // InternalRdfMapping.g:3246:1: rule__ReferenceValuedTerm__Group_2_1__2 : rule__ReferenceValuedTerm__Group_2_1__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3250:1: ( rule__ReferenceValuedTerm__Group_2_1__2__Impl )
            // InternalRdfMapping.g:3251:2: rule__ReferenceValuedTerm__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_1__2"


    // $ANTLR start "rule__ReferenceValuedTerm__Group_2_1__2__Impl"
    // InternalRdfMapping.g:3257:1: rule__ReferenceValuedTerm__Group_2_1__2__Impl : ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3261:1: ( ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) ) )
            // InternalRdfMapping.g:3262:1: ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) )
            {
            // InternalRdfMapping.g:3262:1: ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) )
            // InternalRdfMapping.g:3263:2: ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagAssignment_2_1_2()); 
            // InternalRdfMapping.g:3264:2: ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 )
            // InternalRdfMapping.g:3264:3: rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceValuedTermAccess().getLanguageTagAssignment_2_1_2()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__Group_2_1__2__Impl"


    // $ANTLR start "rule__TemplateValuedTerm__Group__0"
    // InternalRdfMapping.g:3273:1: rule__TemplateValuedTerm__Group__0 : rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1 ;
    public final void rule__TemplateValuedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3277:1: ( rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1 )
            // InternalRdfMapping.g:3278:2: rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TemplateValuedTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__Group__1();

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__0"


    // $ANTLR start "rule__TemplateValuedTerm__Group__0__Impl"
    // InternalRdfMapping.g:3285:1: rule__TemplateValuedTerm__Group__0__Impl : ( 'template' ) ;
    public final void rule__TemplateValuedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3289:1: ( ( 'template' ) )
            // InternalRdfMapping.g:3290:1: ( 'template' )
            {
            // InternalRdfMapping.g:3290:1: ( 'template' )
            // InternalRdfMapping.g:3291:2: 'template'
            {
             before(grammarAccess.getTemplateValuedTermAccess().getTemplateKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTemplateValuedTermAccess().getTemplateKeyword_0()); 

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__0__Impl"


    // $ANTLR start "rule__TemplateValuedTerm__Group__1"
    // InternalRdfMapping.g:3300:1: rule__TemplateValuedTerm__Group__1 : rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2 ;
    public final void rule__TemplateValuedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3304:1: ( rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2 )
            // InternalRdfMapping.g:3305:2: rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__TemplateValuedTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__Group__2();

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__1"


    // $ANTLR start "rule__TemplateValuedTerm__Group__1__Impl"
    // InternalRdfMapping.g:3312:1: rule__TemplateValuedTerm__Group__1__Impl : ( ( rule__TemplateValuedTerm__TemplateAssignment_1 ) ) ;
    public final void rule__TemplateValuedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3316:1: ( ( ( rule__TemplateValuedTerm__TemplateAssignment_1 ) ) )
            // InternalRdfMapping.g:3317:1: ( ( rule__TemplateValuedTerm__TemplateAssignment_1 ) )
            {
            // InternalRdfMapping.g:3317:1: ( ( rule__TemplateValuedTerm__TemplateAssignment_1 ) )
            // InternalRdfMapping.g:3318:2: ( rule__TemplateValuedTerm__TemplateAssignment_1 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getTemplateAssignment_1()); 
            // InternalRdfMapping.g:3319:2: ( rule__TemplateValuedTerm__TemplateAssignment_1 )
            // InternalRdfMapping.g:3319:3: rule__TemplateValuedTerm__TemplateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__TemplateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateValuedTermAccess().getTemplateAssignment_1()); 

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__1__Impl"


    // $ANTLR start "rule__TemplateValuedTerm__Group__2"
    // InternalRdfMapping.g:3327:1: rule__TemplateValuedTerm__Group__2 : rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3 ;
    public final void rule__TemplateValuedTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3331:1: ( rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3 )
            // InternalRdfMapping.g:3332:2: rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TemplateValuedTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__Group__3();

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__2"


    // $ANTLR start "rule__TemplateValuedTerm__Group__2__Impl"
    // InternalRdfMapping.g:3339:1: rule__TemplateValuedTerm__Group__2__Impl : ( 'with' ) ;
    public final void rule__TemplateValuedTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3343:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3344:1: ( 'with' )
            {
            // InternalRdfMapping.g:3344:1: ( 'with' )
            // InternalRdfMapping.g:3345:2: 'with'
            {
             before(grammarAccess.getTemplateValuedTermAccess().getWithKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTemplateValuedTermAccess().getWithKeyword_2()); 

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__2__Impl"


    // $ANTLR start "rule__TemplateValuedTerm__Group__3"
    // InternalRdfMapping.g:3354:1: rule__TemplateValuedTerm__Group__3 : rule__TemplateValuedTerm__Group__3__Impl ;
    public final void rule__TemplateValuedTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3358:1: ( rule__TemplateValuedTerm__Group__3__Impl )
            // InternalRdfMapping.g:3359:2: rule__TemplateValuedTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__Group__3__Impl();

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__3"


    // $ANTLR start "rule__TemplateValuedTerm__Group__3__Impl"
    // InternalRdfMapping.g:3365:1: rule__TemplateValuedTerm__Group__3__Impl : ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) ) ;
    public final void rule__TemplateValuedTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3369:1: ( ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) ) )
            // InternalRdfMapping.g:3370:1: ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) )
            {
            // InternalRdfMapping.g:3370:1: ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) )
            // InternalRdfMapping.g:3371:2: ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* )
            {
            // InternalRdfMapping.g:3371:2: ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) )
            // InternalRdfMapping.g:3372:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3373:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )
            // InternalRdfMapping.g:3373:4: rule__TemplateValuedTerm__ReferencesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__TemplateValuedTerm__ReferencesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTemplateValuedTermAccess().getReferencesAssignment_3()); 

            }

            // InternalRdfMapping.g:3376:2: ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* )
            // InternalRdfMapping.g:3377:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )*
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3378:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==EOF||LA27_2==RULE_ID||LA27_2==13||LA27_2==25||LA27_2==31) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalRdfMapping.g:3378:4: rule__TemplateValuedTerm__ReferencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TemplateValuedTerm__ReferencesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTemplateValuedTermAccess().getReferencesAssignment_3()); 

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
    // $ANTLR end "rule__TemplateValuedTerm__Group__3__Impl"


    // $ANTLR start "rule__LinkedResourceTerm__Group__0"
    // InternalRdfMapping.g:3388:1: rule__LinkedResourceTerm__Group__0 : rule__LinkedResourceTerm__Group__0__Impl rule__LinkedResourceTerm__Group__1 ;
    public final void rule__LinkedResourceTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3392:1: ( rule__LinkedResourceTerm__Group__0__Impl rule__LinkedResourceTerm__Group__1 )
            // InternalRdfMapping.g:3393:2: rule__LinkedResourceTerm__Group__0__Impl rule__LinkedResourceTerm__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__LinkedResourceTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkedResourceTerm__Group__1();

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__0"


    // $ANTLR start "rule__LinkedResourceTerm__Group__0__Impl"
    // InternalRdfMapping.g:3400:1: rule__LinkedResourceTerm__Group__0__Impl : ( 'link' ) ;
    public final void rule__LinkedResourceTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3404:1: ( ( 'link' ) )
            // InternalRdfMapping.g:3405:1: ( 'link' )
            {
            // InternalRdfMapping.g:3405:1: ( 'link' )
            // InternalRdfMapping.g:3406:2: 'link'
            {
             before(grammarAccess.getLinkedResourceTermAccess().getLinkKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLinkedResourceTermAccess().getLinkKeyword_0()); 

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__0__Impl"


    // $ANTLR start "rule__LinkedResourceTerm__Group__1"
    // InternalRdfMapping.g:3415:1: rule__LinkedResourceTerm__Group__1 : rule__LinkedResourceTerm__Group__1__Impl rule__LinkedResourceTerm__Group__2 ;
    public final void rule__LinkedResourceTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3419:1: ( rule__LinkedResourceTerm__Group__1__Impl rule__LinkedResourceTerm__Group__2 )
            // InternalRdfMapping.g:3420:2: rule__LinkedResourceTerm__Group__1__Impl rule__LinkedResourceTerm__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__LinkedResourceTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkedResourceTerm__Group__2();

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__1"


    // $ANTLR start "rule__LinkedResourceTerm__Group__1__Impl"
    // InternalRdfMapping.g:3427:1: rule__LinkedResourceTerm__Group__1__Impl : ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) ) ;
    public final void rule__LinkedResourceTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3431:1: ( ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) ) )
            // InternalRdfMapping.g:3432:1: ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) )
            {
            // InternalRdfMapping.g:3432:1: ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) )
            // InternalRdfMapping.g:3433:2: ( rule__LinkedResourceTerm__MappingAssignment_1 )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getMappingAssignment_1()); 
            // InternalRdfMapping.g:3434:2: ( rule__LinkedResourceTerm__MappingAssignment_1 )
            // InternalRdfMapping.g:3434:3: rule__LinkedResourceTerm__MappingAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkedResourceTerm__MappingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkedResourceTermAccess().getMappingAssignment_1()); 

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__1__Impl"


    // $ANTLR start "rule__LinkedResourceTerm__Group__2"
    // InternalRdfMapping.g:3442:1: rule__LinkedResourceTerm__Group__2 : rule__LinkedResourceTerm__Group__2__Impl rule__LinkedResourceTerm__Group__3 ;
    public final void rule__LinkedResourceTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3446:1: ( rule__LinkedResourceTerm__Group__2__Impl rule__LinkedResourceTerm__Group__3 )
            // InternalRdfMapping.g:3447:2: rule__LinkedResourceTerm__Group__2__Impl rule__LinkedResourceTerm__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__LinkedResourceTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkedResourceTerm__Group__3();

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__2"


    // $ANTLR start "rule__LinkedResourceTerm__Group__2__Impl"
    // InternalRdfMapping.g:3454:1: rule__LinkedResourceTerm__Group__2__Impl : ( 'with' ) ;
    public final void rule__LinkedResourceTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3458:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3459:1: ( 'with' )
            {
            // InternalRdfMapping.g:3459:1: ( 'with' )
            // InternalRdfMapping.g:3460:2: 'with'
            {
             before(grammarAccess.getLinkedResourceTermAccess().getWithKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLinkedResourceTermAccess().getWithKeyword_2()); 

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__2__Impl"


    // $ANTLR start "rule__LinkedResourceTerm__Group__3"
    // InternalRdfMapping.g:3469:1: rule__LinkedResourceTerm__Group__3 : rule__LinkedResourceTerm__Group__3__Impl ;
    public final void rule__LinkedResourceTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3473:1: ( rule__LinkedResourceTerm__Group__3__Impl )
            // InternalRdfMapping.g:3474:2: rule__LinkedResourceTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkedResourceTerm__Group__3__Impl();

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__3"


    // $ANTLR start "rule__LinkedResourceTerm__Group__3__Impl"
    // InternalRdfMapping.g:3480:1: rule__LinkedResourceTerm__Group__3__Impl : ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) ) ;
    public final void rule__LinkedResourceTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3484:1: ( ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) ) )
            // InternalRdfMapping.g:3485:1: ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) )
            {
            // InternalRdfMapping.g:3485:1: ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) )
            // InternalRdfMapping.g:3486:2: ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* )
            {
            // InternalRdfMapping.g:3486:2: ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) )
            // InternalRdfMapping.g:3487:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3488:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )
            // InternalRdfMapping.g:3488:4: rule__LinkedResourceTerm__ReferencesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__LinkedResourceTerm__ReferencesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkedResourceTermAccess().getReferencesAssignment_3()); 

            }

            // InternalRdfMapping.g:3491:2: ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* )
            // InternalRdfMapping.g:3492:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )*
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3493:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==EOF||LA28_2==RULE_ID||LA28_2==13) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalRdfMapping.g:3493:4: rule__LinkedResourceTerm__ReferencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LinkedResourceTerm__ReferencesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLinkedResourceTermAccess().getReferencesAssignment_3()); 

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
    // $ANTLR end "rule__LinkedResourceTerm__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalRdfMapping.g:3503:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3507:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRdfMapping.g:3508:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:3515:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3519:1: ( ( 'import' ) )
            // InternalRdfMapping.g:3520:1: ( 'import' )
            {
            // InternalRdfMapping.g:3520:1: ( 'import' )
            // InternalRdfMapping.g:3521:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRdfMapping.g:3530:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3534:1: ( rule__Import__Group__1__Impl )
            // InternalRdfMapping.g:3535:2: rule__Import__Group__1__Impl
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
    // InternalRdfMapping.g:3541:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3545:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRdfMapping.g:3546:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRdfMapping.g:3546:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRdfMapping.g:3547:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalRdfMapping.g:3548:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRdfMapping.g:3548:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalRdfMapping.g:3557:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3561:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRdfMapping.g:3562:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRdfMapping.g:3569:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3573:1: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3574:1: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:3574:1: ( ruleQualifiedName )
            // InternalRdfMapping.g:3575:2: ruleQualifiedName
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
    // InternalRdfMapping.g:3584:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3588:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRdfMapping.g:3589:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRdfMapping.g:3595:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3599:1: ( ( ( '.*' )? ) )
            // InternalRdfMapping.g:3600:1: ( ( '.*' )? )
            {
            // InternalRdfMapping.g:3600:1: ( ( '.*' )? )
            // InternalRdfMapping.g:3601:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRdfMapping.g:3602:2: ( '.*' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRdfMapping.g:3602:3: '.*'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalRdfMapping.g:3611:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3615:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRdfMapping.g:3616:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRdfMapping.g:3623:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3627:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3628:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3628:1: ( RULE_ID )
            // InternalRdfMapping.g:3629:2: RULE_ID
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
    // InternalRdfMapping.g:3638:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3642:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRdfMapping.g:3643:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRdfMapping.g:3649:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3653:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRdfMapping.g:3654:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRdfMapping.g:3654:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRdfMapping.g:3655:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRdfMapping.g:3656:2: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==39) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRdfMapping.g:3656:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalRdfMapping.g:3665:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3669:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRdfMapping.g:3670:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:3677:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3681:1: ( ( '.' ) )
            // InternalRdfMapping.g:3682:1: ( '.' )
            {
            // InternalRdfMapping.g:3682:1: ( '.' )
            // InternalRdfMapping.g:3683:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRdfMapping.g:3692:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3696:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRdfMapping.g:3697:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRdfMapping.g:3703:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3707:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3708:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3708:1: ( RULE_ID )
            // InternalRdfMapping.g:3709:2: RULE_ID
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
    // InternalRdfMapping.g:3719:1: rule__Domainmodel__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3723:1: ( ( ruleElement ) )
            // InternalRdfMapping.g:3724:2: ( ruleElement )
            {
            // InternalRdfMapping.g:3724:2: ( ruleElement )
            // InternalRdfMapping.g:3725:3: ruleElement
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
    // InternalRdfMapping.g:3734:1: rule__SourceTypesDefinition__TypesAssignment_3 : ( ruleSourceType ) ;
    public final void rule__SourceTypesDefinition__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3738:1: ( ( ruleSourceType ) )
            // InternalRdfMapping.g:3739:2: ( ruleSourceType )
            {
            // InternalRdfMapping.g:3739:2: ( ruleSourceType )
            // InternalRdfMapping.g:3740:3: ruleSourceType
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
    // InternalRdfMapping.g:3749:1: rule__SourceType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SourceType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3753:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3754:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3754:2: ( RULE_ID )
            // InternalRdfMapping.g:3755:3: RULE_ID
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
    // InternalRdfMapping.g:3764:1: rule__SourceType__ReferenceFormulationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SourceType__ReferenceFormulationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3768:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3769:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3769:2: ( RULE_STRING )
            // InternalRdfMapping.g:3770:3: RULE_STRING
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


    // $ANTLR start "rule__DatatypesDefinition__PrefixAssignment_3"
    // InternalRdfMapping.g:3779:1: rule__DatatypesDefinition__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__DatatypesDefinition__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3783:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:3784:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:3784:2: ( rulePrefix )
            // InternalRdfMapping.g:3785:3: rulePrefix
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getPrefixPrefixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getDatatypesDefinitionAccess().getPrefixPrefixParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DatatypesDefinition__PrefixAssignment_3"


    // $ANTLR start "rule__DatatypesDefinition__TypesAssignment_4"
    // InternalRdfMapping.g:3794:1: rule__DatatypesDefinition__TypesAssignment_4 : ( ruleDatatype ) ;
    public final void rule__DatatypesDefinition__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3798:1: ( ( ruleDatatype ) )
            // InternalRdfMapping.g:3799:2: ( ruleDatatype )
            {
            // InternalRdfMapping.g:3799:2: ( ruleDatatype )
            // InternalRdfMapping.g:3800:3: ruleDatatype
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getTypesDatatypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypesDefinitionAccess().getTypesDatatypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DatatypesDefinition__TypesAssignment_4"


    // $ANTLR start "rule__Datatype__NameAssignment"
    // InternalRdfMapping.g:3809:1: rule__Datatype__NameAssignment : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3813:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3814:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3814:2: ( RULE_ID )
            // InternalRdfMapping.g:3815:3: RULE_ID
            {
             before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Datatype__NameAssignment"


    // $ANTLR start "rule__LanguageTagDefinition__LanguageTagsAssignment_3"
    // InternalRdfMapping.g:3824:1: rule__LanguageTagDefinition__LanguageTagsAssignment_3 : ( ruleLanguageTag ) ;
    public final void rule__LanguageTagDefinition__LanguageTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3828:1: ( ( ruleLanguageTag ) )
            // InternalRdfMapping.g:3829:2: ( ruleLanguageTag )
            {
            // InternalRdfMapping.g:3829:2: ( ruleLanguageTag )
            // InternalRdfMapping.g:3830:3: ruleLanguageTag
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsLanguageTagParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageTag();

            state._fsp--;

             after(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsLanguageTagParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LanguageTagDefinition__LanguageTagsAssignment_3"


    // $ANTLR start "rule__LanguageTag__NameAssignment"
    // InternalRdfMapping.g:3839:1: rule__LanguageTag__NameAssignment : ( RULE_ID ) ;
    public final void rule__LanguageTag__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3843:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3844:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3844:2: ( RULE_ID )
            // InternalRdfMapping.g:3845:3: RULE_ID
            {
             before(grammarAccess.getLanguageTagAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageTagAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__LanguageTag__NameAssignment"


    // $ANTLR start "rule__SourceGroup__NameAssignment_1"
    // InternalRdfMapping.g:3854:1: rule__SourceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SourceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3858:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3859:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3859:2: ( RULE_ID )
            // InternalRdfMapping.g:3860:3: RULE_ID
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
    // InternalRdfMapping.g:3869:1: rule__SourceGroup__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SourceGroup__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3873:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:3874:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:3874:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3875:3: ( RULE_ID )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0()); 
            // InternalRdfMapping.g:3876:3: ( RULE_ID )
            // InternalRdfMapping.g:3877:4: RULE_ID
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


    // $ANTLR start "rule__SourceGroup__SourceAssignment_5_1"
    // InternalRdfMapping.g:3888:1: rule__SourceGroup__SourceAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__SourceGroup__SourceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3892:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3893:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3893:2: ( RULE_STRING )
            // InternalRdfMapping.g:3894:3: RULE_STRING
            {
             before(grammarAccess.getSourceGroupAccess().getSourceSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceGroupAccess().getSourceSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SourceGroup__SourceAssignment_5_1"


    // $ANTLR start "rule__SourceGroup__LogicalSourcesAssignment_6"
    // InternalRdfMapping.g:3903:1: rule__SourceGroup__LogicalSourcesAssignment_6 : ( ruleLogicalSource ) ;
    public final void rule__SourceGroup__LogicalSourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3907:1: ( ( ruleLogicalSource ) )
            // InternalRdfMapping.g:3908:2: ( ruleLogicalSource )
            {
            // InternalRdfMapping.g:3908:2: ( ruleLogicalSource )
            // InternalRdfMapping.g:3909:3: ruleLogicalSource
            {
             before(grammarAccess.getSourceGroupAccess().getLogicalSourcesLogicalSourceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalSource();

            state._fsp--;

             after(grammarAccess.getSourceGroupAccess().getLogicalSourcesLogicalSourceParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SourceGroup__LogicalSourcesAssignment_6"


    // $ANTLR start "rule__LogicalSource__NameAssignment_1"
    // InternalRdfMapping.g:3918:1: rule__LogicalSource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicalSource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3922:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3923:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3923:2: ( RULE_ID )
            // InternalRdfMapping.g:3924:3: RULE_ID
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
    // InternalRdfMapping.g:3933:1: rule__LogicalSource__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LogicalSource__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3937:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:3938:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:3938:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3939:3: ( RULE_ID )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0()); 
            // InternalRdfMapping.g:3940:3: ( RULE_ID )
            // InternalRdfMapping.g:3941:4: RULE_ID
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
    // InternalRdfMapping.g:3952:1: rule__LogicalSource__SourceAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3956:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3957:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3957:2: ( RULE_STRING )
            // InternalRdfMapping.g:3958:3: RULE_STRING
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
    // InternalRdfMapping.g:3967:1: rule__LogicalSource__IteratorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__IteratorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3971:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3972:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3972:2: ( RULE_STRING )
            // InternalRdfMapping.g:3973:3: RULE_STRING
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
    // InternalRdfMapping.g:3982:1: rule__LogicalSource__ReferencablesAssignment_8 : ( ruleReferenceable ) ;
    public final void rule__LogicalSource__ReferencablesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3986:1: ( ( ruleReferenceable ) )
            // InternalRdfMapping.g:3987:2: ( ruleReferenceable )
            {
            // InternalRdfMapping.g:3987:2: ( ruleReferenceable )
            // InternalRdfMapping.g:3988:3: ruleReferenceable
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
    // InternalRdfMapping.g:3997:1: rule__Referenceable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Referenceable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4001:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4002:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4002:2: ( RULE_ID )
            // InternalRdfMapping.g:4003:3: RULE_ID
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
    // InternalRdfMapping.g:4012:1: rule__Referenceable__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Referenceable__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4016:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4017:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4017:2: ( RULE_STRING )
            // InternalRdfMapping.g:4018:3: RULE_STRING
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
    // InternalRdfMapping.g:4027:1: rule__Vocabulary__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vocabulary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4031:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4032:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4032:2: ( RULE_ID )
            // InternalRdfMapping.g:4033:3: RULE_ID
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
    // InternalRdfMapping.g:4042:1: rule__Vocabulary__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__Vocabulary__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4046:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:4047:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:4047:2: ( rulePrefix )
            // InternalRdfMapping.g:4048:3: rulePrefix
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
    // InternalRdfMapping.g:4057:1: rule__Vocabulary__ClassesAssignment_4_1 : ( ruleRdfClass ) ;
    public final void rule__Vocabulary__ClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4061:1: ( ( ruleRdfClass ) )
            // InternalRdfMapping.g:4062:2: ( ruleRdfClass )
            {
            // InternalRdfMapping.g:4062:2: ( ruleRdfClass )
            // InternalRdfMapping.g:4063:3: ruleRdfClass
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
    // InternalRdfMapping.g:4072:1: rule__Vocabulary__PropertiesAssignment_5_1 : ( ruleRdfProperty ) ;
    public final void rule__Vocabulary__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4076:1: ( ( ruleRdfProperty ) )
            // InternalRdfMapping.g:4077:2: ( ruleRdfProperty )
            {
            // InternalRdfMapping.g:4077:2: ( ruleRdfProperty )
            // InternalRdfMapping.g:4078:3: ruleRdfProperty
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
    // InternalRdfMapping.g:4087:1: rule__Prefix__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Prefix__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4091:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4092:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4092:2: ( RULE_STRING )
            // InternalRdfMapping.g:4093:3: RULE_STRING
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
    // InternalRdfMapping.g:4102:1: rule__Prefix__IriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__IriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4106:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4107:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4107:2: ( RULE_STRING )
            // InternalRdfMapping.g:4108:3: RULE_STRING
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
    // InternalRdfMapping.g:4117:1: rule__RdfProperty__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfProperty__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4121:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4122:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4122:2: ( RULE_ID )
            // InternalRdfMapping.g:4123:3: RULE_ID
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
    // InternalRdfMapping.g:4132:1: rule__RdfClass__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfClass__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4136:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4137:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4137:2: ( RULE_ID )
            // InternalRdfMapping.g:4138:3: RULE_ID
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
    // InternalRdfMapping.g:4147:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4151:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4152:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4152:2: ( RULE_ID )
            // InternalRdfMapping.g:4153:3: RULE_ID
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
    // InternalRdfMapping.g:4162:1: rule__Mapping__SourceAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4166:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4167:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4167:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4168:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getSourceLogicalSourceCrossReference_3_0()); 
            // InternalRdfMapping.g:4169:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4170:4: ruleQualifiedName
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


    // $ANTLR start "rule__Mapping__TargetVocabulariesAssignment_5_1"
    // InternalRdfMapping.g:4181:1: rule__Mapping__TargetVocabulariesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__TargetVocabulariesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4185:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4186:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4186:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4187:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getTargetVocabulariesVocabularyCrossReference_5_1_0()); 
            // InternalRdfMapping.g:4188:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4189:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getTargetVocabulariesVocabularyQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getTargetVocabulariesVocabularyQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getTargetVocabulariesVocabularyCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Mapping__TargetVocabulariesAssignment_5_1"


    // $ANTLR start "rule__Mapping__SubjectIriMappingAssignment_7"
    // InternalRdfMapping.g:4200:1: rule__Mapping__SubjectIriMappingAssignment_7 : ( ruleTemplateValuedTerm ) ;
    public final void rule__Mapping__SubjectIriMappingAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4204:1: ( ( ruleTemplateValuedTerm ) )
            // InternalRdfMapping.g:4205:2: ( ruleTemplateValuedTerm )
            {
            // InternalRdfMapping.g:4205:2: ( ruleTemplateValuedTerm )
            // InternalRdfMapping.g:4206:3: ruleTemplateValuedTerm
            {
             before(grammarAccess.getMappingAccess().getSubjectIriMappingTemplateValuedTermParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateValuedTerm();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getSubjectIriMappingTemplateValuedTermParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Mapping__SubjectIriMappingAssignment_7"


    // $ANTLR start "rule__Mapping__SubjectTypeMappingsAssignment_8_1"
    // InternalRdfMapping.g:4215:1: rule__Mapping__SubjectTypeMappingsAssignment_8_1 : ( ruleSubjectTypeMapping ) ;
    public final void rule__Mapping__SubjectTypeMappingsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4219:1: ( ( ruleSubjectTypeMapping ) )
            // InternalRdfMapping.g:4220:2: ( ruleSubjectTypeMapping )
            {
            // InternalRdfMapping.g:4220:2: ( ruleSubjectTypeMapping )
            // InternalRdfMapping.g:4221:3: ruleSubjectTypeMapping
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsSubjectTypeMappingParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubjectTypeMapping();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsSubjectTypeMappingParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Mapping__SubjectTypeMappingsAssignment_8_1"


    // $ANTLR start "rule__Mapping__PoMappingsAssignment_9_1"
    // InternalRdfMapping.g:4230:1: rule__Mapping__PoMappingsAssignment_9_1 : ( rulePredicateObjectMapping ) ;
    public final void rule__Mapping__PoMappingsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4234:1: ( ( rulePredicateObjectMapping ) )
            // InternalRdfMapping.g:4235:2: ( rulePredicateObjectMapping )
            {
            // InternalRdfMapping.g:4235:2: ( rulePredicateObjectMapping )
            // InternalRdfMapping.g:4236:3: rulePredicateObjectMapping
            {
             before(grammarAccess.getMappingAccess().getPoMappingsPredicateObjectMappingParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateObjectMapping();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getPoMappingsPredicateObjectMappingParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Mapping__PoMappingsAssignment_9_1"


    // $ANTLR start "rule__SubjectTypeMapping__TypeAssignment"
    // InternalRdfMapping.g:4245:1: rule__SubjectTypeMapping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubjectTypeMapping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4249:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4250:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4250:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4251:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassCrossReference_0()); 
            // InternalRdfMapping.g:4252:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4253:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4264:1: rule__PredicateObjectMapping__PropertyAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PredicateObjectMapping__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4268:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4269:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4269:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4270:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0()); 
            // InternalRdfMapping.g:4271:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4272:4: ruleQualifiedName
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


    // $ANTLR start "rule__PredicateObjectMapping__TermAssignment_1"
    // InternalRdfMapping.g:4283:1: rule__PredicateObjectMapping__TermAssignment_1 : ( ruleValuedTerm ) ;
    public final void rule__PredicateObjectMapping__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4287:1: ( ( ruleValuedTerm ) )
            // InternalRdfMapping.g:4288:2: ( ruleValuedTerm )
            {
            // InternalRdfMapping.g:4288:2: ( ruleValuedTerm )
            // InternalRdfMapping.g:4289:3: ruleValuedTerm
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getTermValuedTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValuedTerm();

            state._fsp--;

             after(grammarAccess.getPredicateObjectMappingAccess().getTermValuedTermParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PredicateObjectMapping__TermAssignment_1"


    // $ANTLR start "rule__ReferenceValuedTerm__ReferenceAssignment_1"
    // InternalRdfMapping.g:4298:1: rule__ReferenceValuedTerm__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceValuedTerm__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4302:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4303:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4303:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4304:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableCrossReference_1_0()); 
            // InternalRdfMapping.g:4305:3: ( RULE_ID )
            // InternalRdfMapping.g:4306:4: RULE_ID
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableCrossReference_1_0()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__ReferenceAssignment_1"


    // $ANTLR start "rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2"
    // InternalRdfMapping.g:4317:1: rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4321:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4322:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4322:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4323:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeCrossReference_2_0_2_0()); 
            // InternalRdfMapping.g:4324:3: ( RULE_ID )
            // InternalRdfMapping.g:4325:4: RULE_ID
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeIDTerminalRuleCall_2_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeIDTerminalRuleCall_2_0_2_0_1()); 

            }

             after(grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeCrossReference_2_0_2_0()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2"


    // $ANTLR start "rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2"
    // InternalRdfMapping.g:4336:1: rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4340:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4341:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4341:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4342:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagCrossReference_2_1_2_0()); 
            // InternalRdfMapping.g:4343:3: ( RULE_ID )
            // InternalRdfMapping.g:4344:4: RULE_ID
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagCrossReference_2_1_2_0()); 

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
    // $ANTLR end "rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2"


    // $ANTLR start "rule__TemplateValuedTerm__TemplateAssignment_1"
    // InternalRdfMapping.g:4355:1: rule__TemplateValuedTerm__TemplateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TemplateValuedTerm__TemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4359:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4360:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4360:2: ( RULE_STRING )
            // InternalRdfMapping.g:4361:3: RULE_STRING
            {
             before(grammarAccess.getTemplateValuedTermAccess().getTemplateSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTemplateValuedTermAccess().getTemplateSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TemplateValuedTerm__TemplateAssignment_1"


    // $ANTLR start "rule__TemplateValuedTerm__ReferencesAssignment_3"
    // InternalRdfMapping.g:4370:1: rule__TemplateValuedTerm__ReferencesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TemplateValuedTerm__ReferencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4374:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4375:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4375:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4376:3: ( RULE_ID )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableCrossReference_3_0()); 
            // InternalRdfMapping.g:4377:3: ( RULE_ID )
            // InternalRdfMapping.g:4378:4: RULE_ID
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableCrossReference_3_0()); 

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
    // $ANTLR end "rule__TemplateValuedTerm__ReferencesAssignment_3"


    // $ANTLR start "rule__LinkedResourceTerm__MappingAssignment_1"
    // InternalRdfMapping.g:4389:1: rule__LinkedResourceTerm__MappingAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LinkedResourceTerm__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4393:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4394:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4394:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4395:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getMappingMappingCrossReference_1_0()); 
            // InternalRdfMapping.g:4396:3: ( RULE_ID )
            // InternalRdfMapping.g:4397:4: RULE_ID
            {
             before(grammarAccess.getLinkedResourceTermAccess().getMappingMappingIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkedResourceTermAccess().getMappingMappingIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLinkedResourceTermAccess().getMappingMappingCrossReference_1_0()); 

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
    // $ANTLR end "rule__LinkedResourceTerm__MappingAssignment_1"


    // $ANTLR start "rule__LinkedResourceTerm__ReferencesAssignment_3"
    // InternalRdfMapping.g:4408:1: rule__LinkedResourceTerm__ReferencesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__LinkedResourceTerm__ReferencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4412:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4413:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4413:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4414:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableCrossReference_3_0()); 
            // InternalRdfMapping.g:4415:3: ( RULE_ID )
            // InternalRdfMapping.g:4416:4: RULE_ID
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableCrossReference_3_0()); 

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
    // $ANTLR end "rule__LinkedResourceTerm__ReferencesAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalRdfMapping.g:4427:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4431:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:4432:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:4432:2: ( ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:4433:3: ruleQualifiedNameWithWildcard
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002008938802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002008938800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000006C0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000082002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001810000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000002L});

}