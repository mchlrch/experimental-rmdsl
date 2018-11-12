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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'datatypes'", "'language-tags'", "'source-group'", "'type'", "';'", "'source'", "'logical-source'", "'referenceables'", "'iterator'", "'vocabulary'", "'classes'", "'properties'", "'prefix'", "'map'", "'from'", "'subject'", "'template'", "'with'", "'types'", "'datatype'", "'language-tag'", "'link'", "'import'", "'.*'", "'.'"
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=17)||LA1_0==21||LA1_0==24||LA1_0==28||LA1_0==37) ) {
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


    // $ANTLR start "entryRulePrefix"
    // InternalRdfMapping.g:353:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalRdfMapping.g:354:1: ( rulePrefix EOF )
            // InternalRdfMapping.g:355:1: rulePrefix EOF
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
    // InternalRdfMapping.g:362:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:366:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalRdfMapping.g:367:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalRdfMapping.g:367:2: ( ( rule__Prefix__Group__0 ) )
            // InternalRdfMapping.g:368:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalRdfMapping.g:369:3: ( rule__Prefix__Group__0 )
            // InternalRdfMapping.g:369:4: rule__Prefix__Group__0
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
    // InternalRdfMapping.g:378:1: entryRuleRdfProperty : ruleRdfProperty EOF ;
    public final void entryRuleRdfProperty() throws RecognitionException {
        try {
            // InternalRdfMapping.g:379:1: ( ruleRdfProperty EOF )
            // InternalRdfMapping.g:380:1: ruleRdfProperty EOF
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
    // InternalRdfMapping.g:387:1: ruleRdfProperty : ( ( rule__RdfProperty__NameAssignment ) ) ;
    public final void ruleRdfProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:391:2: ( ( ( rule__RdfProperty__NameAssignment ) ) )
            // InternalRdfMapping.g:392:2: ( ( rule__RdfProperty__NameAssignment ) )
            {
            // InternalRdfMapping.g:392:2: ( ( rule__RdfProperty__NameAssignment ) )
            // InternalRdfMapping.g:393:3: ( rule__RdfProperty__NameAssignment )
            {
             before(grammarAccess.getRdfPropertyAccess().getNameAssignment()); 
            // InternalRdfMapping.g:394:3: ( rule__RdfProperty__NameAssignment )
            // InternalRdfMapping.g:394:4: rule__RdfProperty__NameAssignment
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
    // InternalRdfMapping.g:403:1: entryRuleRdfClass : ruleRdfClass EOF ;
    public final void entryRuleRdfClass() throws RecognitionException {
        try {
            // InternalRdfMapping.g:404:1: ( ruleRdfClass EOF )
            // InternalRdfMapping.g:405:1: ruleRdfClass EOF
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
    // InternalRdfMapping.g:412:1: ruleRdfClass : ( ( rule__RdfClass__NameAssignment ) ) ;
    public final void ruleRdfClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:416:2: ( ( ( rule__RdfClass__NameAssignment ) ) )
            // InternalRdfMapping.g:417:2: ( ( rule__RdfClass__NameAssignment ) )
            {
            // InternalRdfMapping.g:417:2: ( ( rule__RdfClass__NameAssignment ) )
            // InternalRdfMapping.g:418:3: ( rule__RdfClass__NameAssignment )
            {
             before(grammarAccess.getRdfClassAccess().getNameAssignment()); 
            // InternalRdfMapping.g:419:3: ( rule__RdfClass__NameAssignment )
            // InternalRdfMapping.g:419:4: rule__RdfClass__NameAssignment
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
    // InternalRdfMapping.g:428:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:429:1: ( ruleMapping EOF )
            // InternalRdfMapping.g:430:1: ruleMapping EOF
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
    // InternalRdfMapping.g:437:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:441:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalRdfMapping.g:442:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalRdfMapping.g:442:2: ( ( rule__Mapping__Group__0 ) )
            // InternalRdfMapping.g:443:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalRdfMapping.g:444:3: ( rule__Mapping__Group__0 )
            // InternalRdfMapping.g:444:4: rule__Mapping__Group__0
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
    // InternalRdfMapping.g:453:1: entryRuleSubjectTypeMapping : ruleSubjectTypeMapping EOF ;
    public final void entryRuleSubjectTypeMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:454:1: ( ruleSubjectTypeMapping EOF )
            // InternalRdfMapping.g:455:1: ruleSubjectTypeMapping EOF
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
    // InternalRdfMapping.g:462:1: ruleSubjectTypeMapping : ( ( rule__SubjectTypeMapping__TypeAssignment ) ) ;
    public final void ruleSubjectTypeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:466:2: ( ( ( rule__SubjectTypeMapping__TypeAssignment ) ) )
            // InternalRdfMapping.g:467:2: ( ( rule__SubjectTypeMapping__TypeAssignment ) )
            {
            // InternalRdfMapping.g:467:2: ( ( rule__SubjectTypeMapping__TypeAssignment ) )
            // InternalRdfMapping.g:468:3: ( rule__SubjectTypeMapping__TypeAssignment )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeAssignment()); 
            // InternalRdfMapping.g:469:3: ( rule__SubjectTypeMapping__TypeAssignment )
            // InternalRdfMapping.g:469:4: rule__SubjectTypeMapping__TypeAssignment
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
    // InternalRdfMapping.g:478:1: entryRulePredicateObjectMapping : rulePredicateObjectMapping EOF ;
    public final void entryRulePredicateObjectMapping() throws RecognitionException {
        try {
            // InternalRdfMapping.g:479:1: ( rulePredicateObjectMapping EOF )
            // InternalRdfMapping.g:480:1: rulePredicateObjectMapping EOF
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
    // InternalRdfMapping.g:487:1: rulePredicateObjectMapping : ( ( rule__PredicateObjectMapping__Group__0 ) ) ;
    public final void rulePredicateObjectMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:491:2: ( ( ( rule__PredicateObjectMapping__Group__0 ) ) )
            // InternalRdfMapping.g:492:2: ( ( rule__PredicateObjectMapping__Group__0 ) )
            {
            // InternalRdfMapping.g:492:2: ( ( rule__PredicateObjectMapping__Group__0 ) )
            // InternalRdfMapping.g:493:3: ( rule__PredicateObjectMapping__Group__0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getGroup()); 
            // InternalRdfMapping.g:494:3: ( rule__PredicateObjectMapping__Group__0 )
            // InternalRdfMapping.g:494:4: rule__PredicateObjectMapping__Group__0
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
    // InternalRdfMapping.g:503:1: entryRuleValuedTerm : ruleValuedTerm EOF ;
    public final void entryRuleValuedTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:504:1: ( ruleValuedTerm EOF )
            // InternalRdfMapping.g:505:1: ruleValuedTerm EOF
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
    // InternalRdfMapping.g:512:1: ruleValuedTerm : ( ( rule__ValuedTerm__Alternatives ) ) ;
    public final void ruleValuedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:516:2: ( ( ( rule__ValuedTerm__Alternatives ) ) )
            // InternalRdfMapping.g:517:2: ( ( rule__ValuedTerm__Alternatives ) )
            {
            // InternalRdfMapping.g:517:2: ( ( rule__ValuedTerm__Alternatives ) )
            // InternalRdfMapping.g:518:3: ( rule__ValuedTerm__Alternatives )
            {
             before(grammarAccess.getValuedTermAccess().getAlternatives()); 
            // InternalRdfMapping.g:519:3: ( rule__ValuedTerm__Alternatives )
            // InternalRdfMapping.g:519:4: rule__ValuedTerm__Alternatives
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
    // InternalRdfMapping.g:528:1: entryRuleReferenceValuedTerm : ruleReferenceValuedTerm EOF ;
    public final void entryRuleReferenceValuedTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:529:1: ( ruleReferenceValuedTerm EOF )
            // InternalRdfMapping.g:530:1: ruleReferenceValuedTerm EOF
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
    // InternalRdfMapping.g:537:1: ruleReferenceValuedTerm : ( ( rule__ReferenceValuedTerm__Group__0 ) ) ;
    public final void ruleReferenceValuedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:541:2: ( ( ( rule__ReferenceValuedTerm__Group__0 ) ) )
            // InternalRdfMapping.g:542:2: ( ( rule__ReferenceValuedTerm__Group__0 ) )
            {
            // InternalRdfMapping.g:542:2: ( ( rule__ReferenceValuedTerm__Group__0 ) )
            // InternalRdfMapping.g:543:3: ( rule__ReferenceValuedTerm__Group__0 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getGroup()); 
            // InternalRdfMapping.g:544:3: ( rule__ReferenceValuedTerm__Group__0 )
            // InternalRdfMapping.g:544:4: rule__ReferenceValuedTerm__Group__0
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
    // InternalRdfMapping.g:553:1: entryRuleTemplateValuedTerm : ruleTemplateValuedTerm EOF ;
    public final void entryRuleTemplateValuedTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:554:1: ( ruleTemplateValuedTerm EOF )
            // InternalRdfMapping.g:555:1: ruleTemplateValuedTerm EOF
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
    // InternalRdfMapping.g:562:1: ruleTemplateValuedTerm : ( ( rule__TemplateValuedTerm__Group__0 ) ) ;
    public final void ruleTemplateValuedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:566:2: ( ( ( rule__TemplateValuedTerm__Group__0 ) ) )
            // InternalRdfMapping.g:567:2: ( ( rule__TemplateValuedTerm__Group__0 ) )
            {
            // InternalRdfMapping.g:567:2: ( ( rule__TemplateValuedTerm__Group__0 ) )
            // InternalRdfMapping.g:568:3: ( rule__TemplateValuedTerm__Group__0 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getGroup()); 
            // InternalRdfMapping.g:569:3: ( rule__TemplateValuedTerm__Group__0 )
            // InternalRdfMapping.g:569:4: rule__TemplateValuedTerm__Group__0
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
    // InternalRdfMapping.g:578:1: entryRuleLinkedResourceTerm : ruleLinkedResourceTerm EOF ;
    public final void entryRuleLinkedResourceTerm() throws RecognitionException {
        try {
            // InternalRdfMapping.g:579:1: ( ruleLinkedResourceTerm EOF )
            // InternalRdfMapping.g:580:1: ruleLinkedResourceTerm EOF
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
    // InternalRdfMapping.g:587:1: ruleLinkedResourceTerm : ( ( rule__LinkedResourceTerm__Group__0 ) ) ;
    public final void ruleLinkedResourceTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:591:2: ( ( ( rule__LinkedResourceTerm__Group__0 ) ) )
            // InternalRdfMapping.g:592:2: ( ( rule__LinkedResourceTerm__Group__0 ) )
            {
            // InternalRdfMapping.g:592:2: ( ( rule__LinkedResourceTerm__Group__0 ) )
            // InternalRdfMapping.g:593:3: ( rule__LinkedResourceTerm__Group__0 )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getGroup()); 
            // InternalRdfMapping.g:594:3: ( rule__LinkedResourceTerm__Group__0 )
            // InternalRdfMapping.g:594:4: rule__LinkedResourceTerm__Group__0
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
    // InternalRdfMapping.g:603:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRdfMapping.g:604:1: ( ruleImport EOF )
            // InternalRdfMapping.g:605:1: ruleImport EOF
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
    // InternalRdfMapping.g:612:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:616:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRdfMapping.g:617:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRdfMapping.g:617:2: ( ( rule__Import__Group__0 ) )
            // InternalRdfMapping.g:618:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRdfMapping.g:619:3: ( rule__Import__Group__0 )
            // InternalRdfMapping.g:619:4: rule__Import__Group__0
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
    // InternalRdfMapping.g:628:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRdfMapping.g:629:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:630:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:637:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:641:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRdfMapping.g:642:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRdfMapping.g:642:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRdfMapping.g:643:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRdfMapping.g:644:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRdfMapping.g:644:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalRdfMapping.g:653:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRdfMapping.g:654:1: ( ruleQualifiedName EOF )
            // InternalRdfMapping.g:655:1: ruleQualifiedName EOF
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
    // InternalRdfMapping.g:662:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:666:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRdfMapping.g:667:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRdfMapping.g:667:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRdfMapping.g:668:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRdfMapping.g:669:3: ( rule__QualifiedName__Group__0 )
            // InternalRdfMapping.g:669:4: rule__QualifiedName__Group__0
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
    // InternalRdfMapping.g:677:1: rule__Element__Alternatives : ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleDatatypesDefinition ) | ( ruleLanguageTagDefinition ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:681:1: ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleDatatypesDefinition ) | ( ruleLanguageTagDefinition ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 28:
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
            case 15:
                {
                alt2=7;
                }
                break;
            case 16:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRdfMapping.g:682:2: ( ruleSourceGroup )
                    {
                    // InternalRdfMapping.g:682:2: ( ruleSourceGroup )
                    // InternalRdfMapping.g:683:3: ruleSourceGroup
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
                    // InternalRdfMapping.g:688:2: ( ruleLogicalSource )
                    {
                    // InternalRdfMapping.g:688:2: ( ruleLogicalSource )
                    // InternalRdfMapping.g:689:3: ruleLogicalSource
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
                    // InternalRdfMapping.g:694:2: ( ruleVocabulary )
                    {
                    // InternalRdfMapping.g:694:2: ( ruleVocabulary )
                    // InternalRdfMapping.g:695:3: ruleVocabulary
                    {
                     before(grammarAccess.getElementAccess().getVocabularyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVocabulary();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getVocabularyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRdfMapping.g:700:2: ( ruleMapping )
                    {
                    // InternalRdfMapping.g:700:2: ( ruleMapping )
                    // InternalRdfMapping.g:701:3: ruleMapping
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
                    // InternalRdfMapping.g:706:2: ( ruleImport )
                    {
                    // InternalRdfMapping.g:706:2: ( ruleImport )
                    // InternalRdfMapping.g:707:3: ruleImport
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
                    // InternalRdfMapping.g:712:2: ( ruleSourceTypesDefinition )
                    {
                    // InternalRdfMapping.g:712:2: ( ruleSourceTypesDefinition )
                    // InternalRdfMapping.g:713:3: ruleSourceTypesDefinition
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
                    // InternalRdfMapping.g:718:2: ( ruleDatatypesDefinition )
                    {
                    // InternalRdfMapping.g:718:2: ( ruleDatatypesDefinition )
                    // InternalRdfMapping.g:719:3: ruleDatatypesDefinition
                    {
                     before(grammarAccess.getElementAccess().getDatatypesDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDatatypesDefinition();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDatatypesDefinitionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRdfMapping.g:724:2: ( ruleLanguageTagDefinition )
                    {
                    // InternalRdfMapping.g:724:2: ( ruleLanguageTagDefinition )
                    // InternalRdfMapping.g:725:3: ruleLanguageTagDefinition
                    {
                     before(grammarAccess.getElementAccess().getLanguageTagDefinitionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleLanguageTagDefinition();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLanguageTagDefinitionParserRuleCall_7()); 

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


    // $ANTLR start "rule__ValuedTerm__Alternatives"
    // InternalRdfMapping.g:734:1: rule__ValuedTerm__Alternatives : ( ( ruleReferenceValuedTerm ) | ( ruleTemplateValuedTerm ) | ( ruleLinkedResourceTerm ) );
    public final void rule__ValuedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:738:1: ( ( ruleReferenceValuedTerm ) | ( ruleTemplateValuedTerm ) | ( ruleLinkedResourceTerm ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 36:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRdfMapping.g:739:2: ( ruleReferenceValuedTerm )
                    {
                    // InternalRdfMapping.g:739:2: ( ruleReferenceValuedTerm )
                    // InternalRdfMapping.g:740:3: ruleReferenceValuedTerm
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
                    // InternalRdfMapping.g:745:2: ( ruleTemplateValuedTerm )
                    {
                    // InternalRdfMapping.g:745:2: ( ruleTemplateValuedTerm )
                    // InternalRdfMapping.g:746:3: ruleTemplateValuedTerm
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
                    // InternalRdfMapping.g:751:2: ( ruleLinkedResourceTerm )
                    {
                    // InternalRdfMapping.g:751:2: ( ruleLinkedResourceTerm )
                    // InternalRdfMapping.g:752:3: ruleLinkedResourceTerm
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
    // InternalRdfMapping.g:761:1: rule__ReferenceValuedTerm__Alternatives_2 : ( ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) ) | ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) ) );
    public final void rule__ReferenceValuedTerm__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:765:1: ( ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) ) | ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==34) ) {
                    alt4=1;
                }
                else if ( (LA4_1==35) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRdfMapping.g:766:2: ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) )
                    {
                    // InternalRdfMapping.g:766:2: ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) )
                    // InternalRdfMapping.g:767:3: ( rule__ReferenceValuedTerm__Group_2_0__0 )
                    {
                     before(grammarAccess.getReferenceValuedTermAccess().getGroup_2_0()); 
                    // InternalRdfMapping.g:768:3: ( rule__ReferenceValuedTerm__Group_2_0__0 )
                    // InternalRdfMapping.g:768:4: rule__ReferenceValuedTerm__Group_2_0__0
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
                    // InternalRdfMapping.g:772:2: ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) )
                    {
                    // InternalRdfMapping.g:772:2: ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) )
                    // InternalRdfMapping.g:773:3: ( rule__ReferenceValuedTerm__Group_2_1__0 )
                    {
                     before(grammarAccess.getReferenceValuedTermAccess().getGroup_2_1()); 
                    // InternalRdfMapping.g:774:3: ( rule__ReferenceValuedTerm__Group_2_1__0 )
                    // InternalRdfMapping.g:774:4: rule__ReferenceValuedTerm__Group_2_1__0
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
    // InternalRdfMapping.g:782:1: rule__SourceTypesDefinition__Group__0 : rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 ;
    public final void rule__SourceTypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:786:1: ( rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 )
            // InternalRdfMapping.g:787:2: rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1
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
    // InternalRdfMapping.g:794:1: rule__SourceTypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SourceTypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:798:1: ( ( () ) )
            // InternalRdfMapping.g:799:1: ( () )
            {
            // InternalRdfMapping.g:799:1: ( () )
            // InternalRdfMapping.g:800:2: ()
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0()); 
            // InternalRdfMapping.g:801:2: ()
            // InternalRdfMapping.g:801:3: 
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
    // InternalRdfMapping.g:809:1: rule__SourceTypesDefinition__Group__1 : rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 ;
    public final void rule__SourceTypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:813:1: ( rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 )
            // InternalRdfMapping.g:814:2: rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2
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
    // InternalRdfMapping.g:821:1: rule__SourceTypesDefinition__Group__1__Impl : ( 'source-types' ) ;
    public final void rule__SourceTypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:825:1: ( ( 'source-types' ) )
            // InternalRdfMapping.g:826:1: ( 'source-types' )
            {
            // InternalRdfMapping.g:826:1: ( 'source-types' )
            // InternalRdfMapping.g:827:2: 'source-types'
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
    // InternalRdfMapping.g:836:1: rule__SourceTypesDefinition__Group__2 : rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 ;
    public final void rule__SourceTypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:840:1: ( rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 )
            // InternalRdfMapping.g:841:2: rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3
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
    // InternalRdfMapping.g:848:1: rule__SourceTypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceTypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:852:1: ( ( '{' ) )
            // InternalRdfMapping.g:853:1: ( '{' )
            {
            // InternalRdfMapping.g:853:1: ( '{' )
            // InternalRdfMapping.g:854:2: '{'
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
    // InternalRdfMapping.g:863:1: rule__SourceTypesDefinition__Group__3 : rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 ;
    public final void rule__SourceTypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:867:1: ( rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 )
            // InternalRdfMapping.g:868:2: rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4
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
    // InternalRdfMapping.g:875:1: rule__SourceTypesDefinition__Group__3__Impl : ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) ;
    public final void rule__SourceTypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:879:1: ( ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) )
            // InternalRdfMapping.g:880:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            {
            // InternalRdfMapping.g:880:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            // InternalRdfMapping.g:881:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getTypesAssignment_3()); 
            // InternalRdfMapping.g:882:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:882:3: rule__SourceTypesDefinition__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SourceTypesDefinition__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalRdfMapping.g:890:1: rule__SourceTypesDefinition__Group__4 : rule__SourceTypesDefinition__Group__4__Impl ;
    public final void rule__SourceTypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:894:1: ( rule__SourceTypesDefinition__Group__4__Impl )
            // InternalRdfMapping.g:895:2: rule__SourceTypesDefinition__Group__4__Impl
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
    // InternalRdfMapping.g:901:1: rule__SourceTypesDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SourceTypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:905:1: ( ( '}' ) )
            // InternalRdfMapping.g:906:1: ( '}' )
            {
            // InternalRdfMapping.g:906:1: ( '}' )
            // InternalRdfMapping.g:907:2: '}'
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
    // InternalRdfMapping.g:917:1: rule__SourceType__Group__0 : rule__SourceType__Group__0__Impl rule__SourceType__Group__1 ;
    public final void rule__SourceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:921:1: ( rule__SourceType__Group__0__Impl rule__SourceType__Group__1 )
            // InternalRdfMapping.g:922:2: rule__SourceType__Group__0__Impl rule__SourceType__Group__1
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
    // InternalRdfMapping.g:929:1: rule__SourceType__Group__0__Impl : ( ( rule__SourceType__NameAssignment_0 ) ) ;
    public final void rule__SourceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:933:1: ( ( ( rule__SourceType__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:934:1: ( ( rule__SourceType__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:934:1: ( ( rule__SourceType__NameAssignment_0 ) )
            // InternalRdfMapping.g:935:2: ( rule__SourceType__NameAssignment_0 )
            {
             before(grammarAccess.getSourceTypeAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:936:2: ( rule__SourceType__NameAssignment_0 )
            // InternalRdfMapping.g:936:3: rule__SourceType__NameAssignment_0
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
    // InternalRdfMapping.g:944:1: rule__SourceType__Group__1 : rule__SourceType__Group__1__Impl rule__SourceType__Group__2 ;
    public final void rule__SourceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:948:1: ( rule__SourceType__Group__1__Impl rule__SourceType__Group__2 )
            // InternalRdfMapping.g:949:2: rule__SourceType__Group__1__Impl rule__SourceType__Group__2
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
    // InternalRdfMapping.g:956:1: rule__SourceType__Group__1__Impl : ( 'referenceFormulation' ) ;
    public final void rule__SourceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:960:1: ( ( 'referenceFormulation' ) )
            // InternalRdfMapping.g:961:1: ( 'referenceFormulation' )
            {
            // InternalRdfMapping.g:961:1: ( 'referenceFormulation' )
            // InternalRdfMapping.g:962:2: 'referenceFormulation'
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
    // InternalRdfMapping.g:971:1: rule__SourceType__Group__2 : rule__SourceType__Group__2__Impl ;
    public final void rule__SourceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:975:1: ( rule__SourceType__Group__2__Impl )
            // InternalRdfMapping.g:976:2: rule__SourceType__Group__2__Impl
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
    // InternalRdfMapping.g:982:1: rule__SourceType__Group__2__Impl : ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) ;
    public final void rule__SourceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:986:1: ( ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) )
            // InternalRdfMapping.g:987:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            {
            // InternalRdfMapping.g:987:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            // InternalRdfMapping.g:988:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            {
             before(grammarAccess.getSourceTypeAccess().getReferenceFormulationAssignment_2()); 
            // InternalRdfMapping.g:989:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            // InternalRdfMapping.g:989:3: rule__SourceType__ReferenceFormulationAssignment_2
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
    // InternalRdfMapping.g:998:1: rule__DatatypesDefinition__Group__0 : rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 ;
    public final void rule__DatatypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1002:1: ( rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 )
            // InternalRdfMapping.g:1003:2: rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1
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
    // InternalRdfMapping.g:1010:1: rule__DatatypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DatatypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1014:1: ( ( () ) )
            // InternalRdfMapping.g:1015:1: ( () )
            {
            // InternalRdfMapping.g:1015:1: ( () )
            // InternalRdfMapping.g:1016:2: ()
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getDatatypesDefinitionAction_0()); 
            // InternalRdfMapping.g:1017:2: ()
            // InternalRdfMapping.g:1017:3: 
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
    // InternalRdfMapping.g:1025:1: rule__DatatypesDefinition__Group__1 : rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 ;
    public final void rule__DatatypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1029:1: ( rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 )
            // InternalRdfMapping.g:1030:2: rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2
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
    // InternalRdfMapping.g:1037:1: rule__DatatypesDefinition__Group__1__Impl : ( 'datatypes' ) ;
    public final void rule__DatatypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1041:1: ( ( 'datatypes' ) )
            // InternalRdfMapping.g:1042:1: ( 'datatypes' )
            {
            // InternalRdfMapping.g:1042:1: ( 'datatypes' )
            // InternalRdfMapping.g:1043:2: 'datatypes'
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
    // InternalRdfMapping.g:1052:1: rule__DatatypesDefinition__Group__2 : rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 ;
    public final void rule__DatatypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1056:1: ( rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 )
            // InternalRdfMapping.g:1057:2: rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3
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
    // InternalRdfMapping.g:1064:1: rule__DatatypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__DatatypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1068:1: ( ( '{' ) )
            // InternalRdfMapping.g:1069:1: ( '{' )
            {
            // InternalRdfMapping.g:1069:1: ( '{' )
            // InternalRdfMapping.g:1070:2: '{'
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
    // InternalRdfMapping.g:1079:1: rule__DatatypesDefinition__Group__3 : rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 ;
    public final void rule__DatatypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1083:1: ( rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 )
            // InternalRdfMapping.g:1084:2: rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4
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
    // InternalRdfMapping.g:1091:1: rule__DatatypesDefinition__Group__3__Impl : ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) ;
    public final void rule__DatatypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1095:1: ( ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:1096:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:1096:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:1097:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:1098:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            // InternalRdfMapping.g:1098:3: rule__DatatypesDefinition__PrefixAssignment_3
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
    // InternalRdfMapping.g:1106:1: rule__DatatypesDefinition__Group__4 : rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 ;
    public final void rule__DatatypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1110:1: ( rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 )
            // InternalRdfMapping.g:1111:2: rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5
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
    // InternalRdfMapping.g:1118:1: rule__DatatypesDefinition__Group__4__Impl : ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) ;
    public final void rule__DatatypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1122:1: ( ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) )
            // InternalRdfMapping.g:1123:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            {
            // InternalRdfMapping.g:1123:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            // InternalRdfMapping.g:1124:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getTypesAssignment_4()); 
            // InternalRdfMapping.g:1125:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRdfMapping.g:1125:3: rule__DatatypesDefinition__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DatatypesDefinition__TypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRdfMapping.g:1133:1: rule__DatatypesDefinition__Group__5 : rule__DatatypesDefinition__Group__5__Impl ;
    public final void rule__DatatypesDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1137:1: ( rule__DatatypesDefinition__Group__5__Impl )
            // InternalRdfMapping.g:1138:2: rule__DatatypesDefinition__Group__5__Impl
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
    // InternalRdfMapping.g:1144:1: rule__DatatypesDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__DatatypesDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1148:1: ( ( '}' ) )
            // InternalRdfMapping.g:1149:1: ( '}' )
            {
            // InternalRdfMapping.g:1149:1: ( '}' )
            // InternalRdfMapping.g:1150:2: '}'
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
    // InternalRdfMapping.g:1160:1: rule__LanguageTagDefinition__Group__0 : rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 ;
    public final void rule__LanguageTagDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1164:1: ( rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 )
            // InternalRdfMapping.g:1165:2: rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1
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
    // InternalRdfMapping.g:1172:1: rule__LanguageTagDefinition__Group__0__Impl : ( () ) ;
    public final void rule__LanguageTagDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1176:1: ( ( () ) )
            // InternalRdfMapping.g:1177:1: ( () )
            {
            // InternalRdfMapping.g:1177:1: ( () )
            // InternalRdfMapping.g:1178:2: ()
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagDefinitionAction_0()); 
            // InternalRdfMapping.g:1179:2: ()
            // InternalRdfMapping.g:1179:3: 
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
    // InternalRdfMapping.g:1187:1: rule__LanguageTagDefinition__Group__1 : rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 ;
    public final void rule__LanguageTagDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1191:1: ( rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 )
            // InternalRdfMapping.g:1192:2: rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2
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
    // InternalRdfMapping.g:1199:1: rule__LanguageTagDefinition__Group__1__Impl : ( 'language-tags' ) ;
    public final void rule__LanguageTagDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1203:1: ( ( 'language-tags' ) )
            // InternalRdfMapping.g:1204:1: ( 'language-tags' )
            {
            // InternalRdfMapping.g:1204:1: ( 'language-tags' )
            // InternalRdfMapping.g:1205:2: 'language-tags'
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
    // InternalRdfMapping.g:1214:1: rule__LanguageTagDefinition__Group__2 : rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 ;
    public final void rule__LanguageTagDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1218:1: ( rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 )
            // InternalRdfMapping.g:1219:2: rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3
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
    // InternalRdfMapping.g:1226:1: rule__LanguageTagDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LanguageTagDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1230:1: ( ( '{' ) )
            // InternalRdfMapping.g:1231:1: ( '{' )
            {
            // InternalRdfMapping.g:1231:1: ( '{' )
            // InternalRdfMapping.g:1232:2: '{'
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
    // InternalRdfMapping.g:1241:1: rule__LanguageTagDefinition__Group__3 : rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 ;
    public final void rule__LanguageTagDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1245:1: ( rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 )
            // InternalRdfMapping.g:1246:2: rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4
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
    // InternalRdfMapping.g:1253:1: rule__LanguageTagDefinition__Group__3__Impl : ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) ;
    public final void rule__LanguageTagDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1257:1: ( ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) )
            // InternalRdfMapping.g:1258:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            {
            // InternalRdfMapping.g:1258:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            // InternalRdfMapping.g:1259:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsAssignment_3()); 
            // InternalRdfMapping.g:1260:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRdfMapping.g:1260:3: rule__LanguageTagDefinition__LanguageTagsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LanguageTagDefinition__LanguageTagsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRdfMapping.g:1268:1: rule__LanguageTagDefinition__Group__4 : rule__LanguageTagDefinition__Group__4__Impl ;
    public final void rule__LanguageTagDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1272:1: ( rule__LanguageTagDefinition__Group__4__Impl )
            // InternalRdfMapping.g:1273:2: rule__LanguageTagDefinition__Group__4__Impl
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
    // InternalRdfMapping.g:1279:1: rule__LanguageTagDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__LanguageTagDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1283:1: ( ( '}' ) )
            // InternalRdfMapping.g:1284:1: ( '}' )
            {
            // InternalRdfMapping.g:1284:1: ( '}' )
            // InternalRdfMapping.g:1285:2: '}'
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
    // InternalRdfMapping.g:1295:1: rule__SourceGroup__Group__0 : rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 ;
    public final void rule__SourceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1299:1: ( rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 )
            // InternalRdfMapping.g:1300:2: rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1
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
    // InternalRdfMapping.g:1307:1: rule__SourceGroup__Group__0__Impl : ( 'source-group' ) ;
    public final void rule__SourceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1311:1: ( ( 'source-group' ) )
            // InternalRdfMapping.g:1312:1: ( 'source-group' )
            {
            // InternalRdfMapping.g:1312:1: ( 'source-group' )
            // InternalRdfMapping.g:1313:2: 'source-group'
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
    // InternalRdfMapping.g:1322:1: rule__SourceGroup__Group__1 : rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 ;
    public final void rule__SourceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1326:1: ( rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 )
            // InternalRdfMapping.g:1327:2: rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2
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
    // InternalRdfMapping.g:1334:1: rule__SourceGroup__Group__1__Impl : ( ( rule__SourceGroup__NameAssignment_1 ) ) ;
    public final void rule__SourceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1338:1: ( ( ( rule__SourceGroup__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1339:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1339:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            // InternalRdfMapping.g:1340:2: ( rule__SourceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1341:2: ( rule__SourceGroup__NameAssignment_1 )
            // InternalRdfMapping.g:1341:3: rule__SourceGroup__NameAssignment_1
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
    // InternalRdfMapping.g:1349:1: rule__SourceGroup__Group__2 : rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 ;
    public final void rule__SourceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1353:1: ( rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 )
            // InternalRdfMapping.g:1354:2: rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3
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
    // InternalRdfMapping.g:1361:1: rule__SourceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1365:1: ( ( '{' ) )
            // InternalRdfMapping.g:1366:1: ( '{' )
            {
            // InternalRdfMapping.g:1366:1: ( '{' )
            // InternalRdfMapping.g:1367:2: '{'
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
    // InternalRdfMapping.g:1376:1: rule__SourceGroup__Group__3 : rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 ;
    public final void rule__SourceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1380:1: ( rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 )
            // InternalRdfMapping.g:1381:2: rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4
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
    // InternalRdfMapping.g:1388:1: rule__SourceGroup__Group__3__Impl : ( 'type' ) ;
    public final void rule__SourceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1392:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1393:1: ( 'type' )
            {
            // InternalRdfMapping.g:1393:1: ( 'type' )
            // InternalRdfMapping.g:1394:2: 'type'
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
    // InternalRdfMapping.g:1403:1: rule__SourceGroup__Group__4 : rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 ;
    public final void rule__SourceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1407:1: ( rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 )
            // InternalRdfMapping.g:1408:2: rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5
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
    // InternalRdfMapping.g:1415:1: rule__SourceGroup__Group__4__Impl : ( ( rule__SourceGroup__TypeAssignment_4 ) ) ;
    public final void rule__SourceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1419:1: ( ( ( rule__SourceGroup__TypeAssignment_4 ) ) )
            // InternalRdfMapping.g:1420:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            {
            // InternalRdfMapping.g:1420:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            // InternalRdfMapping.g:1421:2: ( rule__SourceGroup__TypeAssignment_4 )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeAssignment_4()); 
            // InternalRdfMapping.g:1422:2: ( rule__SourceGroup__TypeAssignment_4 )
            // InternalRdfMapping.g:1422:3: rule__SourceGroup__TypeAssignment_4
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
    // InternalRdfMapping.g:1430:1: rule__SourceGroup__Group__5 : rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 ;
    public final void rule__SourceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1434:1: ( rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 )
            // InternalRdfMapping.g:1435:2: rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalRdfMapping.g:1442:1: rule__SourceGroup__Group__5__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1446:1: ( ( ';' ) )
            // InternalRdfMapping.g:1447:1: ( ';' )
            {
            // InternalRdfMapping.g:1447:1: ( ';' )
            // InternalRdfMapping.g:1448:2: ';'
            {
             before(grammarAccess.getSourceGroupAccess().getSemicolonKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:1457:1: rule__SourceGroup__Group__6 : rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 ;
    public final void rule__SourceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1461:1: ( rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 )
            // InternalRdfMapping.g:1462:2: rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalRdfMapping.g:1469:1: rule__SourceGroup__Group__6__Impl : ( ( rule__SourceGroup__Group_6__0 )? ) ;
    public final void rule__SourceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1473:1: ( ( ( rule__SourceGroup__Group_6__0 )? ) )
            // InternalRdfMapping.g:1474:1: ( ( rule__SourceGroup__Group_6__0 )? )
            {
            // InternalRdfMapping.g:1474:1: ( ( rule__SourceGroup__Group_6__0 )? )
            // InternalRdfMapping.g:1475:2: ( rule__SourceGroup__Group_6__0 )?
            {
             before(grammarAccess.getSourceGroupAccess().getGroup_6()); 
            // InternalRdfMapping.g:1476:2: ( rule__SourceGroup__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:1476:3: rule__SourceGroup__Group_6__0
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
    // InternalRdfMapping.g:1484:1: rule__SourceGroup__Group__7 : rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 ;
    public final void rule__SourceGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1488:1: ( rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 )
            // InternalRdfMapping.g:1489:2: rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalRdfMapping.g:1496:1: rule__SourceGroup__Group__7__Impl : ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) ;
    public final void rule__SourceGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1500:1: ( ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) )
            // InternalRdfMapping.g:1501:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            {
            // InternalRdfMapping.g:1501:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            // InternalRdfMapping.g:1502:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            {
             before(grammarAccess.getSourceGroupAccess().getLogicalSourcesAssignment_7()); 
            // InternalRdfMapping.g:1503:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRdfMapping.g:1503:3: rule__SourceGroup__LogicalSourcesAssignment_7
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SourceGroup__LogicalSourcesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRdfMapping.g:1511:1: rule__SourceGroup__Group__8 : rule__SourceGroup__Group__8__Impl ;
    public final void rule__SourceGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1515:1: ( rule__SourceGroup__Group__8__Impl )
            // InternalRdfMapping.g:1516:2: rule__SourceGroup__Group__8__Impl
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
    // InternalRdfMapping.g:1522:1: rule__SourceGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__SourceGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1526:1: ( ( '}' ) )
            // InternalRdfMapping.g:1527:1: ( '}' )
            {
            // InternalRdfMapping.g:1527:1: ( '}' )
            // InternalRdfMapping.g:1528:2: '}'
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
    // InternalRdfMapping.g:1538:1: rule__SourceGroup__Group_6__0 : rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 ;
    public final void rule__SourceGroup__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1542:1: ( rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 )
            // InternalRdfMapping.g:1543:2: rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1
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
    // InternalRdfMapping.g:1550:1: rule__SourceGroup__Group_6__0__Impl : ( 'source' ) ;
    public final void rule__SourceGroup__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1554:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1555:1: ( 'source' )
            {
            // InternalRdfMapping.g:1555:1: ( 'source' )
            // InternalRdfMapping.g:1556:2: 'source'
            {
             before(grammarAccess.getSourceGroupAccess().getSourceKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRdfMapping.g:1565:1: rule__SourceGroup__Group_6__1 : rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 ;
    public final void rule__SourceGroup__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1569:1: ( rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 )
            // InternalRdfMapping.g:1570:2: rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:1577:1: rule__SourceGroup__Group_6__1__Impl : ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) ;
    public final void rule__SourceGroup__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1581:1: ( ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) )
            // InternalRdfMapping.g:1582:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            {
            // InternalRdfMapping.g:1582:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            // InternalRdfMapping.g:1583:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getSourceAssignment_6_1()); 
            // InternalRdfMapping.g:1584:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            // InternalRdfMapping.g:1584:3: rule__SourceGroup__SourceAssignment_6_1
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
    // InternalRdfMapping.g:1592:1: rule__SourceGroup__Group_6__2 : rule__SourceGroup__Group_6__2__Impl ;
    public final void rule__SourceGroup__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1596:1: ( rule__SourceGroup__Group_6__2__Impl )
            // InternalRdfMapping.g:1597:2: rule__SourceGroup__Group_6__2__Impl
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
    // InternalRdfMapping.g:1603:1: rule__SourceGroup__Group_6__2__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1607:1: ( ( ';' ) )
            // InternalRdfMapping.g:1608:1: ( ';' )
            {
            // InternalRdfMapping.g:1608:1: ( ';' )
            // InternalRdfMapping.g:1609:2: ';'
            {
             before(grammarAccess.getSourceGroupAccess().getSemicolonKeyword_6_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:1619:1: rule__LogicalSource__Group__0 : rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 ;
    public final void rule__LogicalSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1623:1: ( rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 )
            // InternalRdfMapping.g:1624:2: rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1
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
    // InternalRdfMapping.g:1631:1: rule__LogicalSource__Group__0__Impl : ( 'logical-source' ) ;
    public final void rule__LogicalSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1635:1: ( ( 'logical-source' ) )
            // InternalRdfMapping.g:1636:1: ( 'logical-source' )
            {
            // InternalRdfMapping.g:1636:1: ( 'logical-source' )
            // InternalRdfMapping.g:1637:2: 'logical-source'
            {
             before(grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRdfMapping.g:1646:1: rule__LogicalSource__Group__1 : rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 ;
    public final void rule__LogicalSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1650:1: ( rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 )
            // InternalRdfMapping.g:1651:2: rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2
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
    // InternalRdfMapping.g:1658:1: rule__LogicalSource__Group__1__Impl : ( ( rule__LogicalSource__NameAssignment_1 ) ) ;
    public final void rule__LogicalSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1662:1: ( ( ( rule__LogicalSource__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1663:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1663:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            // InternalRdfMapping.g:1664:2: ( rule__LogicalSource__NameAssignment_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1665:2: ( rule__LogicalSource__NameAssignment_1 )
            // InternalRdfMapping.g:1665:3: rule__LogicalSource__NameAssignment_1
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
    // InternalRdfMapping.g:1673:1: rule__LogicalSource__Group__2 : rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 ;
    public final void rule__LogicalSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1677:1: ( rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 )
            // InternalRdfMapping.g:1678:2: rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRdfMapping.g:1685:1: rule__LogicalSource__Group__2__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1689:1: ( ( '{' ) )
            // InternalRdfMapping.g:1690:1: ( '{' )
            {
            // InternalRdfMapping.g:1690:1: ( '{' )
            // InternalRdfMapping.g:1691:2: '{'
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
    // InternalRdfMapping.g:1700:1: rule__LogicalSource__Group__3 : rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 ;
    public final void rule__LogicalSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1704:1: ( rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 )
            // InternalRdfMapping.g:1705:2: rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalRdfMapping.g:1712:1: rule__LogicalSource__Group__3__Impl : ( ( rule__LogicalSource__Group_3__0 )? ) ;
    public final void rule__LogicalSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1716:1: ( ( ( rule__LogicalSource__Group_3__0 )? ) )
            // InternalRdfMapping.g:1717:1: ( ( rule__LogicalSource__Group_3__0 )? )
            {
            // InternalRdfMapping.g:1717:1: ( ( rule__LogicalSource__Group_3__0 )? )
            // InternalRdfMapping.g:1718:2: ( rule__LogicalSource__Group_3__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_3()); 
            // InternalRdfMapping.g:1719:2: ( rule__LogicalSource__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:1719:3: rule__LogicalSource__Group_3__0
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
    // InternalRdfMapping.g:1727:1: rule__LogicalSource__Group__4 : rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 ;
    public final void rule__LogicalSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1731:1: ( rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 )
            // InternalRdfMapping.g:1732:2: rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalRdfMapping.g:1739:1: rule__LogicalSource__Group__4__Impl : ( ( rule__LogicalSource__Group_4__0 )? ) ;
    public final void rule__LogicalSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1743:1: ( ( ( rule__LogicalSource__Group_4__0 )? ) )
            // InternalRdfMapping.g:1744:1: ( ( rule__LogicalSource__Group_4__0 )? )
            {
            // InternalRdfMapping.g:1744:1: ( ( rule__LogicalSource__Group_4__0 )? )
            // InternalRdfMapping.g:1745:2: ( rule__LogicalSource__Group_4__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_4()); 
            // InternalRdfMapping.g:1746:2: ( rule__LogicalSource__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdfMapping.g:1746:3: rule__LogicalSource__Group_4__0
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
    // InternalRdfMapping.g:1754:1: rule__LogicalSource__Group__5 : rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 ;
    public final void rule__LogicalSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1758:1: ( rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 )
            // InternalRdfMapping.g:1759:2: rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalRdfMapping.g:1766:1: rule__LogicalSource__Group__5__Impl : ( ( rule__LogicalSource__Group_5__0 )? ) ;
    public final void rule__LogicalSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1770:1: ( ( ( rule__LogicalSource__Group_5__0 )? ) )
            // InternalRdfMapping.g:1771:1: ( ( rule__LogicalSource__Group_5__0 )? )
            {
            // InternalRdfMapping.g:1771:1: ( ( rule__LogicalSource__Group_5__0 )? )
            // InternalRdfMapping.g:1772:2: ( rule__LogicalSource__Group_5__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_5()); 
            // InternalRdfMapping.g:1773:2: ( rule__LogicalSource__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdfMapping.g:1773:3: rule__LogicalSource__Group_5__0
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
    // InternalRdfMapping.g:1781:1: rule__LogicalSource__Group__6 : rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 ;
    public final void rule__LogicalSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1785:1: ( rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 )
            // InternalRdfMapping.g:1786:2: rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7
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
    // InternalRdfMapping.g:1793:1: rule__LogicalSource__Group__6__Impl : ( 'referenceables' ) ;
    public final void rule__LogicalSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1797:1: ( ( 'referenceables' ) )
            // InternalRdfMapping.g:1798:1: ( 'referenceables' )
            {
            // InternalRdfMapping.g:1798:1: ( 'referenceables' )
            // InternalRdfMapping.g:1799:2: 'referenceables'
            {
             before(grammarAccess.getLogicalSourceAccess().getReferenceablesKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRdfMapping.g:1808:1: rule__LogicalSource__Group__7 : rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 ;
    public final void rule__LogicalSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1812:1: ( rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 )
            // InternalRdfMapping.g:1813:2: rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8
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
    // InternalRdfMapping.g:1820:1: rule__LogicalSource__Group__7__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1824:1: ( ( '{' ) )
            // InternalRdfMapping.g:1825:1: ( '{' )
            {
            // InternalRdfMapping.g:1825:1: ( '{' )
            // InternalRdfMapping.g:1826:2: '{'
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
    // InternalRdfMapping.g:1835:1: rule__LogicalSource__Group__8 : rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 ;
    public final void rule__LogicalSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1839:1: ( rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 )
            // InternalRdfMapping.g:1840:2: rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9
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
    // InternalRdfMapping.g:1847:1: rule__LogicalSource__Group__8__Impl : ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) ;
    public final void rule__LogicalSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1851:1: ( ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) )
            // InternalRdfMapping.g:1852:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            {
            // InternalRdfMapping.g:1852:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            // InternalRdfMapping.g:1853:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            {
             before(grammarAccess.getLogicalSourceAccess().getReferencablesAssignment_8()); 
            // InternalRdfMapping.g:1854:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRdfMapping.g:1854:3: rule__LogicalSource__ReferencablesAssignment_8
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LogicalSource__ReferencablesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRdfMapping.g:1862:1: rule__LogicalSource__Group__9 : rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 ;
    public final void rule__LogicalSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1866:1: ( rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 )
            // InternalRdfMapping.g:1867:2: rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalRdfMapping.g:1874:1: rule__LogicalSource__Group__9__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1878:1: ( ( '}' ) )
            // InternalRdfMapping.g:1879:1: ( '}' )
            {
            // InternalRdfMapping.g:1879:1: ( '}' )
            // InternalRdfMapping.g:1880:2: '}'
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
    // InternalRdfMapping.g:1889:1: rule__LogicalSource__Group__10 : rule__LogicalSource__Group__10__Impl ;
    public final void rule__LogicalSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1893:1: ( rule__LogicalSource__Group__10__Impl )
            // InternalRdfMapping.g:1894:2: rule__LogicalSource__Group__10__Impl
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
    // InternalRdfMapping.g:1900:1: rule__LogicalSource__Group__10__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1904:1: ( ( '}' ) )
            // InternalRdfMapping.g:1905:1: ( '}' )
            {
            // InternalRdfMapping.g:1905:1: ( '}' )
            // InternalRdfMapping.g:1906:2: '}'
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
    // InternalRdfMapping.g:1916:1: rule__LogicalSource__Group_3__0 : rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 ;
    public final void rule__LogicalSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1920:1: ( rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 )
            // InternalRdfMapping.g:1921:2: rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1
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
    // InternalRdfMapping.g:1928:1: rule__LogicalSource__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__LogicalSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1932:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1933:1: ( 'type' )
            {
            // InternalRdfMapping.g:1933:1: ( 'type' )
            // InternalRdfMapping.g:1934:2: 'type'
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
    // InternalRdfMapping.g:1943:1: rule__LogicalSource__Group_3__1 : rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 ;
    public final void rule__LogicalSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1947:1: ( rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 )
            // InternalRdfMapping.g:1948:2: rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:1955:1: rule__LogicalSource__Group_3__1__Impl : ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) ;
    public final void rule__LogicalSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1959:1: ( ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) )
            // InternalRdfMapping.g:1960:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            {
            // InternalRdfMapping.g:1960:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            // InternalRdfMapping.g:1961:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeAssignment_3_1()); 
            // InternalRdfMapping.g:1962:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            // InternalRdfMapping.g:1962:3: rule__LogicalSource__TypeAssignment_3_1
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
    // InternalRdfMapping.g:1970:1: rule__LogicalSource__Group_3__2 : rule__LogicalSource__Group_3__2__Impl ;
    public final void rule__LogicalSource__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1974:1: ( rule__LogicalSource__Group_3__2__Impl )
            // InternalRdfMapping.g:1975:2: rule__LogicalSource__Group_3__2__Impl
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
    // InternalRdfMapping.g:1981:1: rule__LogicalSource__Group_3__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1985:1: ( ( ';' ) )
            // InternalRdfMapping.g:1986:1: ( ';' )
            {
            // InternalRdfMapping.g:1986:1: ( ';' )
            // InternalRdfMapping.g:1987:2: ';'
            {
             before(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_3_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:1997:1: rule__LogicalSource__Group_4__0 : rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 ;
    public final void rule__LogicalSource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2001:1: ( rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 )
            // InternalRdfMapping.g:2002:2: rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1
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
    // InternalRdfMapping.g:2009:1: rule__LogicalSource__Group_4__0__Impl : ( 'source' ) ;
    public final void rule__LogicalSource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2013:1: ( ( 'source' ) )
            // InternalRdfMapping.g:2014:1: ( 'source' )
            {
            // InternalRdfMapping.g:2014:1: ( 'source' )
            // InternalRdfMapping.g:2015:2: 'source'
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRdfMapping.g:2024:1: rule__LogicalSource__Group_4__1 : rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 ;
    public final void rule__LogicalSource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2028:1: ( rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 )
            // InternalRdfMapping.g:2029:2: rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:2036:1: rule__LogicalSource__Group_4__1__Impl : ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) ;
    public final void rule__LogicalSource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2040:1: ( ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) )
            // InternalRdfMapping.g:2041:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            {
            // InternalRdfMapping.g:2041:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            // InternalRdfMapping.g:2042:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceAssignment_4_1()); 
            // InternalRdfMapping.g:2043:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            // InternalRdfMapping.g:2043:3: rule__LogicalSource__SourceAssignment_4_1
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
    // InternalRdfMapping.g:2051:1: rule__LogicalSource__Group_4__2 : rule__LogicalSource__Group_4__2__Impl ;
    public final void rule__LogicalSource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2055:1: ( rule__LogicalSource__Group_4__2__Impl )
            // InternalRdfMapping.g:2056:2: rule__LogicalSource__Group_4__2__Impl
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
    // InternalRdfMapping.g:2062:1: rule__LogicalSource__Group_4__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2066:1: ( ( ';' ) )
            // InternalRdfMapping.g:2067:1: ( ';' )
            {
            // InternalRdfMapping.g:2067:1: ( ';' )
            // InternalRdfMapping.g:2068:2: ';'
            {
             before(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_4_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:2078:1: rule__LogicalSource__Group_5__0 : rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 ;
    public final void rule__LogicalSource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2082:1: ( rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 )
            // InternalRdfMapping.g:2083:2: rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1
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
    // InternalRdfMapping.g:2090:1: rule__LogicalSource__Group_5__0__Impl : ( 'iterator' ) ;
    public final void rule__LogicalSource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2094:1: ( ( 'iterator' ) )
            // InternalRdfMapping.g:2095:1: ( 'iterator' )
            {
            // InternalRdfMapping.g:2095:1: ( 'iterator' )
            // InternalRdfMapping.g:2096:2: 'iterator'
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRdfMapping.g:2105:1: rule__LogicalSource__Group_5__1 : rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 ;
    public final void rule__LogicalSource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2109:1: ( rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 )
            // InternalRdfMapping.g:2110:2: rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:2117:1: rule__LogicalSource__Group_5__1__Impl : ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) ;
    public final void rule__LogicalSource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2121:1: ( ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) )
            // InternalRdfMapping.g:2122:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            {
            // InternalRdfMapping.g:2122:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            // InternalRdfMapping.g:2123:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorAssignment_5_1()); 
            // InternalRdfMapping.g:2124:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            // InternalRdfMapping.g:2124:3: rule__LogicalSource__IteratorAssignment_5_1
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
    // InternalRdfMapping.g:2132:1: rule__LogicalSource__Group_5__2 : rule__LogicalSource__Group_5__2__Impl ;
    public final void rule__LogicalSource__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2136:1: ( rule__LogicalSource__Group_5__2__Impl )
            // InternalRdfMapping.g:2137:2: rule__LogicalSource__Group_5__2__Impl
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
    // InternalRdfMapping.g:2143:1: rule__LogicalSource__Group_5__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2147:1: ( ( ';' ) )
            // InternalRdfMapping.g:2148:1: ( ';' )
            {
            // InternalRdfMapping.g:2148:1: ( ';' )
            // InternalRdfMapping.g:2149:2: ';'
            {
             before(grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_5_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:2159:1: rule__Referenceable__Group__0 : rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 ;
    public final void rule__Referenceable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2163:1: ( rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 )
            // InternalRdfMapping.g:2164:2: rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1
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
    // InternalRdfMapping.g:2171:1: rule__Referenceable__Group__0__Impl : ( ( rule__Referenceable__NameAssignment_0 ) ) ;
    public final void rule__Referenceable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2175:1: ( ( ( rule__Referenceable__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:2176:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:2176:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            // InternalRdfMapping.g:2177:2: ( rule__Referenceable__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceableAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:2178:2: ( rule__Referenceable__NameAssignment_0 )
            // InternalRdfMapping.g:2178:3: rule__Referenceable__NameAssignment_0
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
    // InternalRdfMapping.g:2186:1: rule__Referenceable__Group__1 : rule__Referenceable__Group__1__Impl ;
    public final void rule__Referenceable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2190:1: ( rule__Referenceable__Group__1__Impl )
            // InternalRdfMapping.g:2191:2: rule__Referenceable__Group__1__Impl
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
    // InternalRdfMapping.g:2197:1: rule__Referenceable__Group__1__Impl : ( ( rule__Referenceable__ValueAssignment_1 )? ) ;
    public final void rule__Referenceable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2201:1: ( ( ( rule__Referenceable__ValueAssignment_1 )? ) )
            // InternalRdfMapping.g:2202:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            {
            // InternalRdfMapping.g:2202:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            // InternalRdfMapping.g:2203:2: ( rule__Referenceable__ValueAssignment_1 )?
            {
             before(grammarAccess.getReferenceableAccess().getValueAssignment_1()); 
            // InternalRdfMapping.g:2204:2: ( rule__Referenceable__ValueAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdfMapping.g:2204:3: rule__Referenceable__ValueAssignment_1
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
    // InternalRdfMapping.g:2213:1: rule__Vocabulary__Group__0 : rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 ;
    public final void rule__Vocabulary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2217:1: ( rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 )
            // InternalRdfMapping.g:2218:2: rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1
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
    // InternalRdfMapping.g:2225:1: rule__Vocabulary__Group__0__Impl : ( 'vocabulary' ) ;
    public final void rule__Vocabulary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2229:1: ( ( 'vocabulary' ) )
            // InternalRdfMapping.g:2230:1: ( 'vocabulary' )
            {
            // InternalRdfMapping.g:2230:1: ( 'vocabulary' )
            // InternalRdfMapping.g:2231:2: 'vocabulary'
            {
             before(grammarAccess.getVocabularyAccess().getVocabularyKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRdfMapping.g:2240:1: rule__Vocabulary__Group__1 : rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 ;
    public final void rule__Vocabulary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2244:1: ( rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 )
            // InternalRdfMapping.g:2245:2: rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2
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
    // InternalRdfMapping.g:2252:1: rule__Vocabulary__Group__1__Impl : ( ( rule__Vocabulary__NameAssignment_1 ) ) ;
    public final void rule__Vocabulary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2256:1: ( ( ( rule__Vocabulary__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2257:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2257:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            // InternalRdfMapping.g:2258:2: ( rule__Vocabulary__NameAssignment_1 )
            {
             before(grammarAccess.getVocabularyAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2259:2: ( rule__Vocabulary__NameAssignment_1 )
            // InternalRdfMapping.g:2259:3: rule__Vocabulary__NameAssignment_1
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
    // InternalRdfMapping.g:2267:1: rule__Vocabulary__Group__2 : rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 ;
    public final void rule__Vocabulary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2271:1: ( rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 )
            // InternalRdfMapping.g:2272:2: rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3
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
    // InternalRdfMapping.g:2279:1: rule__Vocabulary__Group__2__Impl : ( '{' ) ;
    public final void rule__Vocabulary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2283:1: ( ( '{' ) )
            // InternalRdfMapping.g:2284:1: ( '{' )
            {
            // InternalRdfMapping.g:2284:1: ( '{' )
            // InternalRdfMapping.g:2285:2: '{'
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
    // InternalRdfMapping.g:2294:1: rule__Vocabulary__Group__3 : rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 ;
    public final void rule__Vocabulary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2298:1: ( rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 )
            // InternalRdfMapping.g:2299:2: rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalRdfMapping.g:2306:1: rule__Vocabulary__Group__3__Impl : ( ( rule__Vocabulary__PrefixAssignment_3 ) ) ;
    public final void rule__Vocabulary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2310:1: ( ( ( rule__Vocabulary__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:2311:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:2311:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:2312:2: ( rule__Vocabulary__PrefixAssignment_3 )
            {
             before(grammarAccess.getVocabularyAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:2313:2: ( rule__Vocabulary__PrefixAssignment_3 )
            // InternalRdfMapping.g:2313:3: rule__Vocabulary__PrefixAssignment_3
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
    // InternalRdfMapping.g:2321:1: rule__Vocabulary__Group__4 : rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 ;
    public final void rule__Vocabulary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2325:1: ( rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 )
            // InternalRdfMapping.g:2326:2: rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalRdfMapping.g:2333:1: rule__Vocabulary__Group__4__Impl : ( ( rule__Vocabulary__Group_4__0 )? ) ;
    public final void rule__Vocabulary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2337:1: ( ( ( rule__Vocabulary__Group_4__0 )? ) )
            // InternalRdfMapping.g:2338:1: ( ( rule__Vocabulary__Group_4__0 )? )
            {
            // InternalRdfMapping.g:2338:1: ( ( rule__Vocabulary__Group_4__0 )? )
            // InternalRdfMapping.g:2339:2: ( rule__Vocabulary__Group_4__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_4()); 
            // InternalRdfMapping.g:2340:2: ( rule__Vocabulary__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdfMapping.g:2340:3: rule__Vocabulary__Group_4__0
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
    // InternalRdfMapping.g:2348:1: rule__Vocabulary__Group__5 : rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 ;
    public final void rule__Vocabulary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2352:1: ( rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 )
            // InternalRdfMapping.g:2353:2: rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalRdfMapping.g:2360:1: rule__Vocabulary__Group__5__Impl : ( ( rule__Vocabulary__Group_5__0 )? ) ;
    public final void rule__Vocabulary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2364:1: ( ( ( rule__Vocabulary__Group_5__0 )? ) )
            // InternalRdfMapping.g:2365:1: ( ( rule__Vocabulary__Group_5__0 )? )
            {
            // InternalRdfMapping.g:2365:1: ( ( rule__Vocabulary__Group_5__0 )? )
            // InternalRdfMapping.g:2366:2: ( rule__Vocabulary__Group_5__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_5()); 
            // InternalRdfMapping.g:2367:2: ( rule__Vocabulary__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdfMapping.g:2367:3: rule__Vocabulary__Group_5__0
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
    // InternalRdfMapping.g:2375:1: rule__Vocabulary__Group__6 : rule__Vocabulary__Group__6__Impl ;
    public final void rule__Vocabulary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2379:1: ( rule__Vocabulary__Group__6__Impl )
            // InternalRdfMapping.g:2380:2: rule__Vocabulary__Group__6__Impl
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
    // InternalRdfMapping.g:2386:1: rule__Vocabulary__Group__6__Impl : ( '}' ) ;
    public final void rule__Vocabulary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2390:1: ( ( '}' ) )
            // InternalRdfMapping.g:2391:1: ( '}' )
            {
            // InternalRdfMapping.g:2391:1: ( '}' )
            // InternalRdfMapping.g:2392:2: '}'
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
    // InternalRdfMapping.g:2402:1: rule__Vocabulary__Group_4__0 : rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 ;
    public final void rule__Vocabulary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2406:1: ( rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 )
            // InternalRdfMapping.g:2407:2: rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRdfMapping.g:2414:1: rule__Vocabulary__Group_4__0__Impl : ( 'classes' ) ;
    public final void rule__Vocabulary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2418:1: ( ( 'classes' ) )
            // InternalRdfMapping.g:2419:1: ( 'classes' )
            {
            // InternalRdfMapping.g:2419:1: ( 'classes' )
            // InternalRdfMapping.g:2420:2: 'classes'
            {
             before(grammarAccess.getVocabularyAccess().getClassesKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRdfMapping.g:2429:1: rule__Vocabulary__Group_4__1 : rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 ;
    public final void rule__Vocabulary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2433:1: ( rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 )
            // InternalRdfMapping.g:2434:2: rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRdfMapping.g:2441:1: rule__Vocabulary__Group_4__1__Impl : ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) ;
    public final void rule__Vocabulary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2445:1: ( ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) )
            // InternalRdfMapping.g:2446:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            {
            // InternalRdfMapping.g:2446:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            // InternalRdfMapping.g:2447:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getClassesAssignment_4_1()); 
            // InternalRdfMapping.g:2448:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRdfMapping.g:2448:3: rule__Vocabulary__ClassesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__ClassesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRdfMapping.g:2456:1: rule__Vocabulary__Group_4__2 : rule__Vocabulary__Group_4__2__Impl ;
    public final void rule__Vocabulary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2460:1: ( rule__Vocabulary__Group_4__2__Impl )
            // InternalRdfMapping.g:2461:2: rule__Vocabulary__Group_4__2__Impl
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
    // InternalRdfMapping.g:2467:1: rule__Vocabulary__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2471:1: ( ( ';' ) )
            // InternalRdfMapping.g:2472:1: ( ';' )
            {
            // InternalRdfMapping.g:2472:1: ( ';' )
            // InternalRdfMapping.g:2473:2: ';'
            {
             before(grammarAccess.getVocabularyAccess().getSemicolonKeyword_4_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:2483:1: rule__Vocabulary__Group_5__0 : rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 ;
    public final void rule__Vocabulary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2487:1: ( rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 )
            // InternalRdfMapping.g:2488:2: rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRdfMapping.g:2495:1: rule__Vocabulary__Group_5__0__Impl : ( 'properties' ) ;
    public final void rule__Vocabulary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2499:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:2500:1: ( 'properties' )
            {
            // InternalRdfMapping.g:2500:1: ( 'properties' )
            // InternalRdfMapping.g:2501:2: 'properties'
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRdfMapping.g:2510:1: rule__Vocabulary__Group_5__1 : rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 ;
    public final void rule__Vocabulary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2514:1: ( rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 )
            // InternalRdfMapping.g:2515:2: rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRdfMapping.g:2522:1: rule__Vocabulary__Group_5__1__Impl : ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) ;
    public final void rule__Vocabulary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2526:1: ( ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) )
            // InternalRdfMapping.g:2527:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            {
            // InternalRdfMapping.g:2527:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            // InternalRdfMapping.g:2528:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesAssignment_5_1()); 
            // InternalRdfMapping.g:2529:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRdfMapping.g:2529:3: rule__Vocabulary__PropertiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__PropertiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalRdfMapping.g:2537:1: rule__Vocabulary__Group_5__2 : rule__Vocabulary__Group_5__2__Impl ;
    public final void rule__Vocabulary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2541:1: ( rule__Vocabulary__Group_5__2__Impl )
            // InternalRdfMapping.g:2542:2: rule__Vocabulary__Group_5__2__Impl
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
    // InternalRdfMapping.g:2548:1: rule__Vocabulary__Group_5__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2552:1: ( ( ';' ) )
            // InternalRdfMapping.g:2553:1: ( ';' )
            {
            // InternalRdfMapping.g:2553:1: ( ';' )
            // InternalRdfMapping.g:2554:2: ';'
            {
             before(grammarAccess.getVocabularyAccess().getSemicolonKeyword_5_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:2564:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2568:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalRdfMapping.g:2569:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
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
    // InternalRdfMapping.g:2576:1: rule__Prefix__Group__0__Impl : ( 'prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2580:1: ( ( 'prefix' ) )
            // InternalRdfMapping.g:2581:1: ( 'prefix' )
            {
            // InternalRdfMapping.g:2581:1: ( 'prefix' )
            // InternalRdfMapping.g:2582:2: 'prefix'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRdfMapping.g:2591:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2595:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalRdfMapping.g:2596:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
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
    // InternalRdfMapping.g:2603:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__LabelAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2607:1: ( ( ( rule__Prefix__LabelAssignment_1 ) ) )
            // InternalRdfMapping.g:2608:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            {
            // InternalRdfMapping.g:2608:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            // InternalRdfMapping.g:2609:2: ( rule__Prefix__LabelAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getLabelAssignment_1()); 
            // InternalRdfMapping.g:2610:2: ( rule__Prefix__LabelAssignment_1 )
            // InternalRdfMapping.g:2610:3: rule__Prefix__LabelAssignment_1
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
    // InternalRdfMapping.g:2618:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl rule__Prefix__Group__3 ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2622:1: ( rule__Prefix__Group__2__Impl rule__Prefix__Group__3 )
            // InternalRdfMapping.g:2623:2: rule__Prefix__Group__2__Impl rule__Prefix__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRdfMapping.g:2630:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__IriAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2634:1: ( ( ( rule__Prefix__IriAssignment_2 ) ) )
            // InternalRdfMapping.g:2635:1: ( ( rule__Prefix__IriAssignment_2 ) )
            {
            // InternalRdfMapping.g:2635:1: ( ( rule__Prefix__IriAssignment_2 ) )
            // InternalRdfMapping.g:2636:2: ( rule__Prefix__IriAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getIriAssignment_2()); 
            // InternalRdfMapping.g:2637:2: ( rule__Prefix__IriAssignment_2 )
            // InternalRdfMapping.g:2637:3: rule__Prefix__IriAssignment_2
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
    // InternalRdfMapping.g:2645:1: rule__Prefix__Group__3 : rule__Prefix__Group__3__Impl ;
    public final void rule__Prefix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2649:1: ( rule__Prefix__Group__3__Impl )
            // InternalRdfMapping.g:2650:2: rule__Prefix__Group__3__Impl
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
    // InternalRdfMapping.g:2656:1: rule__Prefix__Group__3__Impl : ( ';' ) ;
    public final void rule__Prefix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2660:1: ( ( ';' ) )
            // InternalRdfMapping.g:2661:1: ( ';' )
            {
            // InternalRdfMapping.g:2661:1: ( ';' )
            // InternalRdfMapping.g:2662:2: ';'
            {
             before(grammarAccess.getPrefixAccess().getSemicolonKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRdfMapping.g:2672:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2676:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalRdfMapping.g:2677:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
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
    // InternalRdfMapping.g:2684:1: rule__Mapping__Group__0__Impl : ( 'map' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2688:1: ( ( 'map' ) )
            // InternalRdfMapping.g:2689:1: ( 'map' )
            {
            // InternalRdfMapping.g:2689:1: ( 'map' )
            // InternalRdfMapping.g:2690:2: 'map'
            {
             before(grammarAccess.getMappingAccess().getMapKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRdfMapping.g:2699:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2703:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalRdfMapping.g:2704:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRdfMapping.g:2711:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2715:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2716:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2716:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // InternalRdfMapping.g:2717:2: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2718:2: ( rule__Mapping__NameAssignment_1 )
            // InternalRdfMapping.g:2718:3: rule__Mapping__NameAssignment_1
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
    // InternalRdfMapping.g:2726:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2730:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalRdfMapping.g:2731:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
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
    // InternalRdfMapping.g:2738:1: rule__Mapping__Group__2__Impl : ( 'from' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2742:1: ( ( 'from' ) )
            // InternalRdfMapping.g:2743:1: ( 'from' )
            {
            // InternalRdfMapping.g:2743:1: ( 'from' )
            // InternalRdfMapping.g:2744:2: 'from'
            {
             before(grammarAccess.getMappingAccess().getFromKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRdfMapping.g:2753:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2757:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalRdfMapping.g:2758:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
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
    // InternalRdfMapping.g:2765:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__SourceAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2769:1: ( ( ( rule__Mapping__SourceAssignment_3 ) ) )
            // InternalRdfMapping.g:2770:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            {
            // InternalRdfMapping.g:2770:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            // InternalRdfMapping.g:2771:2: ( rule__Mapping__SourceAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getSourceAssignment_3()); 
            // InternalRdfMapping.g:2772:2: ( rule__Mapping__SourceAssignment_3 )
            // InternalRdfMapping.g:2772:3: rule__Mapping__SourceAssignment_3
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
    // InternalRdfMapping.g:2780:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2784:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalRdfMapping.g:2785:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalRdfMapping.g:2792:1: rule__Mapping__Group__4__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2796:1: ( ( '{' ) )
            // InternalRdfMapping.g:2797:1: ( '{' )
            {
            // InternalRdfMapping.g:2797:1: ( '{' )
            // InternalRdfMapping.g:2798:2: '{'
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
    // InternalRdfMapping.g:2807:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2811:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalRdfMapping.g:2812:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalRdfMapping.g:2819:1: rule__Mapping__Group__5__Impl : ( 'subject' ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2823:1: ( ( 'subject' ) )
            // InternalRdfMapping.g:2824:1: ( 'subject' )
            {
            // InternalRdfMapping.g:2824:1: ( 'subject' )
            // InternalRdfMapping.g:2825:2: 'subject'
            {
             before(grammarAccess.getMappingAccess().getSubjectKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRdfMapping.g:2834:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2838:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalRdfMapping.g:2839:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
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
    // InternalRdfMapping.g:2846:1: rule__Mapping__Group__6__Impl : ( 'template' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2850:1: ( ( 'template' ) )
            // InternalRdfMapping.g:2851:1: ( 'template' )
            {
            // InternalRdfMapping.g:2851:1: ( 'template' )
            // InternalRdfMapping.g:2852:2: 'template'
            {
             before(grammarAccess.getMappingAccess().getTemplateKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRdfMapping.g:2861:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl rule__Mapping__Group__8 ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2865:1: ( rule__Mapping__Group__7__Impl rule__Mapping__Group__8 )
            // InternalRdfMapping.g:2866:2: rule__Mapping__Group__7__Impl rule__Mapping__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalRdfMapping.g:2873:1: rule__Mapping__Group__7__Impl : ( ( rule__Mapping__PatternAssignment_7 ) ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2877:1: ( ( ( rule__Mapping__PatternAssignment_7 ) ) )
            // InternalRdfMapping.g:2878:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            {
            // InternalRdfMapping.g:2878:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            // InternalRdfMapping.g:2879:2: ( rule__Mapping__PatternAssignment_7 )
            {
             before(grammarAccess.getMappingAccess().getPatternAssignment_7()); 
            // InternalRdfMapping.g:2880:2: ( rule__Mapping__PatternAssignment_7 )
            // InternalRdfMapping.g:2880:3: rule__Mapping__PatternAssignment_7
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
    // InternalRdfMapping.g:2888:1: rule__Mapping__Group__8 : rule__Mapping__Group__8__Impl rule__Mapping__Group__9 ;
    public final void rule__Mapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2892:1: ( rule__Mapping__Group__8__Impl rule__Mapping__Group__9 )
            // InternalRdfMapping.g:2893:2: rule__Mapping__Group__8__Impl rule__Mapping__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:2900:1: rule__Mapping__Group__8__Impl : ( 'with' ) ;
    public final void rule__Mapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2904:1: ( ( 'with' ) )
            // InternalRdfMapping.g:2905:1: ( 'with' )
            {
            // InternalRdfMapping.g:2905:1: ( 'with' )
            // InternalRdfMapping.g:2906:2: 'with'
            {
             before(grammarAccess.getMappingAccess().getWithKeyword_8()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRdfMapping.g:2915:1: rule__Mapping__Group__9 : rule__Mapping__Group__9__Impl rule__Mapping__Group__10 ;
    public final void rule__Mapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2919:1: ( rule__Mapping__Group__9__Impl rule__Mapping__Group__10 )
            // InternalRdfMapping.g:2920:2: rule__Mapping__Group__9__Impl rule__Mapping__Group__10
            {
            pushFollow(FOLLOW_26);
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
    // InternalRdfMapping.g:2927:1: rule__Mapping__Group__9__Impl : ( ( ( rule__Mapping__ReferencesAssignment_9 ) ) ( ( rule__Mapping__ReferencesAssignment_9 )* ) ) ;
    public final void rule__Mapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2931:1: ( ( ( ( rule__Mapping__ReferencesAssignment_9 ) ) ( ( rule__Mapping__ReferencesAssignment_9 )* ) ) )
            // InternalRdfMapping.g:2932:1: ( ( ( rule__Mapping__ReferencesAssignment_9 ) ) ( ( rule__Mapping__ReferencesAssignment_9 )* ) )
            {
            // InternalRdfMapping.g:2932:1: ( ( ( rule__Mapping__ReferencesAssignment_9 ) ) ( ( rule__Mapping__ReferencesAssignment_9 )* ) )
            // InternalRdfMapping.g:2933:2: ( ( rule__Mapping__ReferencesAssignment_9 ) ) ( ( rule__Mapping__ReferencesAssignment_9 )* )
            {
            // InternalRdfMapping.g:2933:2: ( ( rule__Mapping__ReferencesAssignment_9 ) )
            // InternalRdfMapping.g:2934:3: ( rule__Mapping__ReferencesAssignment_9 )
            {
             before(grammarAccess.getMappingAccess().getReferencesAssignment_9()); 
            // InternalRdfMapping.g:2935:3: ( rule__Mapping__ReferencesAssignment_9 )
            // InternalRdfMapping.g:2935:4: rule__Mapping__ReferencesAssignment_9
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__ReferencesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getReferencesAssignment_9()); 

            }

            // InternalRdfMapping.g:2938:2: ( ( rule__Mapping__ReferencesAssignment_9 )* )
            // InternalRdfMapping.g:2939:3: ( rule__Mapping__ReferencesAssignment_9 )*
            {
             before(grammarAccess.getMappingAccess().getReferencesAssignment_9()); 
            // InternalRdfMapping.g:2940:3: ( rule__Mapping__ReferencesAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRdfMapping.g:2940:4: rule__Mapping__ReferencesAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__ReferencesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getReferencesAssignment_9()); 

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
    // $ANTLR end "rule__Mapping__Group__9__Impl"


    // $ANTLR start "rule__Mapping__Group__10"
    // InternalRdfMapping.g:2949:1: rule__Mapping__Group__10 : rule__Mapping__Group__10__Impl rule__Mapping__Group__11 ;
    public final void rule__Mapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2953:1: ( rule__Mapping__Group__10__Impl rule__Mapping__Group__11 )
            // InternalRdfMapping.g:2954:2: rule__Mapping__Group__10__Impl rule__Mapping__Group__11
            {
            pushFollow(FOLLOW_26);
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
    // InternalRdfMapping.g:2961:1: rule__Mapping__Group__10__Impl : ( ( rule__Mapping__Group_10__0 )? ) ;
    public final void rule__Mapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2965:1: ( ( ( rule__Mapping__Group_10__0 )? ) )
            // InternalRdfMapping.g:2966:1: ( ( rule__Mapping__Group_10__0 )? )
            {
            // InternalRdfMapping.g:2966:1: ( ( rule__Mapping__Group_10__0 )? )
            // InternalRdfMapping.g:2967:2: ( rule__Mapping__Group_10__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_10()); 
            // InternalRdfMapping.g:2968:2: ( rule__Mapping__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdfMapping.g:2968:3: rule__Mapping__Group_10__0
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
    // InternalRdfMapping.g:2976:1: rule__Mapping__Group__11 : rule__Mapping__Group__11__Impl rule__Mapping__Group__12 ;
    public final void rule__Mapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2980:1: ( rule__Mapping__Group__11__Impl rule__Mapping__Group__12 )
            // InternalRdfMapping.g:2981:2: rule__Mapping__Group__11__Impl rule__Mapping__Group__12
            {
            pushFollow(FOLLOW_26);
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
    // InternalRdfMapping.g:2988:1: rule__Mapping__Group__11__Impl : ( ( rule__Mapping__Group_11__0 )? ) ;
    public final void rule__Mapping__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2992:1: ( ( ( rule__Mapping__Group_11__0 )? ) )
            // InternalRdfMapping.g:2993:1: ( ( rule__Mapping__Group_11__0 )? )
            {
            // InternalRdfMapping.g:2993:1: ( ( rule__Mapping__Group_11__0 )? )
            // InternalRdfMapping.g:2994:2: ( rule__Mapping__Group_11__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_11()); 
            // InternalRdfMapping.g:2995:2: ( rule__Mapping__Group_11__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdfMapping.g:2995:3: rule__Mapping__Group_11__0
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
    // InternalRdfMapping.g:3003:1: rule__Mapping__Group__12 : rule__Mapping__Group__12__Impl ;
    public final void rule__Mapping__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3007:1: ( rule__Mapping__Group__12__Impl )
            // InternalRdfMapping.g:3008:2: rule__Mapping__Group__12__Impl
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
    // InternalRdfMapping.g:3014:1: rule__Mapping__Group__12__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3018:1: ( ( '}' ) )
            // InternalRdfMapping.g:3019:1: ( '}' )
            {
            // InternalRdfMapping.g:3019:1: ( '}' )
            // InternalRdfMapping.g:3020:2: '}'
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
    // InternalRdfMapping.g:3030:1: rule__Mapping__Group_10__0 : rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 ;
    public final void rule__Mapping__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3034:1: ( rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 )
            // InternalRdfMapping.g:3035:2: rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:3042:1: rule__Mapping__Group_10__0__Impl : ( 'types' ) ;
    public final void rule__Mapping__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3046:1: ( ( 'types' ) )
            // InternalRdfMapping.g:3047:1: ( 'types' )
            {
            // InternalRdfMapping.g:3047:1: ( 'types' )
            // InternalRdfMapping.g:3048:2: 'types'
            {
             before(grammarAccess.getMappingAccess().getTypesKeyword_10_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRdfMapping.g:3057:1: rule__Mapping__Group_10__1 : rule__Mapping__Group_10__1__Impl ;
    public final void rule__Mapping__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3061:1: ( rule__Mapping__Group_10__1__Impl )
            // InternalRdfMapping.g:3062:2: rule__Mapping__Group_10__1__Impl
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
    // InternalRdfMapping.g:3068:1: rule__Mapping__Group_10__1__Impl : ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) ;
    public final void rule__Mapping__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3072:1: ( ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) )
            // InternalRdfMapping.g:3073:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            {
            // InternalRdfMapping.g:3073:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            // InternalRdfMapping.g:3074:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            {
            // InternalRdfMapping.g:3074:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) )
            // InternalRdfMapping.g:3075:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:3076:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            // InternalRdfMapping.g:3076:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 

            }

            // InternalRdfMapping.g:3079:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            // InternalRdfMapping.g:3080:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:3081:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRdfMapping.g:3081:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRdfMapping.g:3091:1: rule__Mapping__Group_11__0 : rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 ;
    public final void rule__Mapping__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3095:1: ( rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 )
            // InternalRdfMapping.g:3096:2: rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:3103:1: rule__Mapping__Group_11__0__Impl : ( 'properties' ) ;
    public final void rule__Mapping__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3107:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:3108:1: ( 'properties' )
            {
            // InternalRdfMapping.g:3108:1: ( 'properties' )
            // InternalRdfMapping.g:3109:2: 'properties'
            {
             before(grammarAccess.getMappingAccess().getPropertiesKeyword_11_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRdfMapping.g:3118:1: rule__Mapping__Group_11__1 : rule__Mapping__Group_11__1__Impl ;
    public final void rule__Mapping__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3122:1: ( rule__Mapping__Group_11__1__Impl )
            // InternalRdfMapping.g:3123:2: rule__Mapping__Group_11__1__Impl
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
    // InternalRdfMapping.g:3129:1: rule__Mapping__Group_11__1__Impl : ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) ;
    public final void rule__Mapping__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3133:1: ( ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) )
            // InternalRdfMapping.g:3134:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            {
            // InternalRdfMapping.g:3134:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            // InternalRdfMapping.g:3135:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            {
            // InternalRdfMapping.g:3135:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) )
            // InternalRdfMapping.g:3136:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:3137:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            // InternalRdfMapping.g:3137:4: rule__Mapping__PoMappingsAssignment_11_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__PoMappingsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 

            }

            // InternalRdfMapping.g:3140:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            // InternalRdfMapping.g:3141:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:3142:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRdfMapping.g:3142:4: rule__Mapping__PoMappingsAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__PoMappingsAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalRdfMapping.g:3152:1: rule__PredicateObjectMapping__Group__0 : rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 ;
    public final void rule__PredicateObjectMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3156:1: ( rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 )
            // InternalRdfMapping.g:3157:2: rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRdfMapping.g:3164:1: rule__PredicateObjectMapping__Group__0__Impl : ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) ;
    public final void rule__PredicateObjectMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3168:1: ( ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) )
            // InternalRdfMapping.g:3169:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            {
            // InternalRdfMapping.g:3169:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            // InternalRdfMapping.g:3170:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyAssignment_0()); 
            // InternalRdfMapping.g:3171:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            // InternalRdfMapping.g:3171:3: rule__PredicateObjectMapping__PropertyAssignment_0
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
    // InternalRdfMapping.g:3179:1: rule__PredicateObjectMapping__Group__1 : rule__PredicateObjectMapping__Group__1__Impl ;
    public final void rule__PredicateObjectMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3183:1: ( rule__PredicateObjectMapping__Group__1__Impl )
            // InternalRdfMapping.g:3184:2: rule__PredicateObjectMapping__Group__1__Impl
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
    // InternalRdfMapping.g:3190:1: rule__PredicateObjectMapping__Group__1__Impl : ( ( rule__PredicateObjectMapping__TermAssignment_1 ) ) ;
    public final void rule__PredicateObjectMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3194:1: ( ( ( rule__PredicateObjectMapping__TermAssignment_1 ) ) )
            // InternalRdfMapping.g:3195:1: ( ( rule__PredicateObjectMapping__TermAssignment_1 ) )
            {
            // InternalRdfMapping.g:3195:1: ( ( rule__PredicateObjectMapping__TermAssignment_1 ) )
            // InternalRdfMapping.g:3196:2: ( rule__PredicateObjectMapping__TermAssignment_1 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getTermAssignment_1()); 
            // InternalRdfMapping.g:3197:2: ( rule__PredicateObjectMapping__TermAssignment_1 )
            // InternalRdfMapping.g:3197:3: rule__PredicateObjectMapping__TermAssignment_1
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
    // InternalRdfMapping.g:3206:1: rule__ReferenceValuedTerm__Group__0 : rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1 ;
    public final void rule__ReferenceValuedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3210:1: ( rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1 )
            // InternalRdfMapping.g:3211:2: rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1
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
    // InternalRdfMapping.g:3218:1: rule__ReferenceValuedTerm__Group__0__Impl : ( 'from' ) ;
    public final void rule__ReferenceValuedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3222:1: ( ( 'from' ) )
            // InternalRdfMapping.g:3223:1: ( 'from' )
            {
            // InternalRdfMapping.g:3223:1: ( 'from' )
            // InternalRdfMapping.g:3224:2: 'from'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getFromKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRdfMapping.g:3233:1: rule__ReferenceValuedTerm__Group__1 : rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2 ;
    public final void rule__ReferenceValuedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3237:1: ( rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2 )
            // InternalRdfMapping.g:3238:2: rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2
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
    // InternalRdfMapping.g:3245:1: rule__ReferenceValuedTerm__Group__1__Impl : ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceValuedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3249:1: ( ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) ) )
            // InternalRdfMapping.g:3250:1: ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) )
            {
            // InternalRdfMapping.g:3250:1: ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) )
            // InternalRdfMapping.g:3251:2: ( rule__ReferenceValuedTerm__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceAssignment_1()); 
            // InternalRdfMapping.g:3252:2: ( rule__ReferenceValuedTerm__ReferenceAssignment_1 )
            // InternalRdfMapping.g:3252:3: rule__ReferenceValuedTerm__ReferenceAssignment_1
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
    // InternalRdfMapping.g:3260:1: rule__ReferenceValuedTerm__Group__2 : rule__ReferenceValuedTerm__Group__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3264:1: ( rule__ReferenceValuedTerm__Group__2__Impl )
            // InternalRdfMapping.g:3265:2: rule__ReferenceValuedTerm__Group__2__Impl
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
    // InternalRdfMapping.g:3271:1: rule__ReferenceValuedTerm__Group__2__Impl : ( ( rule__ReferenceValuedTerm__Alternatives_2 )? ) ;
    public final void rule__ReferenceValuedTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3275:1: ( ( ( rule__ReferenceValuedTerm__Alternatives_2 )? ) )
            // InternalRdfMapping.g:3276:1: ( ( rule__ReferenceValuedTerm__Alternatives_2 )? )
            {
            // InternalRdfMapping.g:3276:1: ( ( rule__ReferenceValuedTerm__Alternatives_2 )? )
            // InternalRdfMapping.g:3277:2: ( rule__ReferenceValuedTerm__Alternatives_2 )?
            {
             before(grammarAccess.getReferenceValuedTermAccess().getAlternatives_2()); 
            // InternalRdfMapping.g:3278:2: ( rule__ReferenceValuedTerm__Alternatives_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRdfMapping.g:3278:3: rule__ReferenceValuedTerm__Alternatives_2
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
    // InternalRdfMapping.g:3287:1: rule__ReferenceValuedTerm__Group_2_0__0 : rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1 ;
    public final void rule__ReferenceValuedTerm__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3291:1: ( rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1 )
            // InternalRdfMapping.g:3292:2: rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRdfMapping.g:3299:1: rule__ReferenceValuedTerm__Group_2_0__0__Impl : ( 'with' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3303:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3304:1: ( 'with' )
            {
            // InternalRdfMapping.g:3304:1: ( 'with' )
            // InternalRdfMapping.g:3305:2: 'with'
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
    // InternalRdfMapping.g:3314:1: rule__ReferenceValuedTerm__Group_2_0__1 : rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2 ;
    public final void rule__ReferenceValuedTerm__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3318:1: ( rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2 )
            // InternalRdfMapping.g:3319:2: rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2
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
    // InternalRdfMapping.g:3326:1: rule__ReferenceValuedTerm__Group_2_0__1__Impl : ( 'datatype' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3330:1: ( ( 'datatype' ) )
            // InternalRdfMapping.g:3331:1: ( 'datatype' )
            {
            // InternalRdfMapping.g:3331:1: ( 'datatype' )
            // InternalRdfMapping.g:3332:2: 'datatype'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeKeyword_2_0_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRdfMapping.g:3341:1: rule__ReferenceValuedTerm__Group_2_0__2 : rule__ReferenceValuedTerm__Group_2_0__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3345:1: ( rule__ReferenceValuedTerm__Group_2_0__2__Impl )
            // InternalRdfMapping.g:3346:2: rule__ReferenceValuedTerm__Group_2_0__2__Impl
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
    // InternalRdfMapping.g:3352:1: rule__ReferenceValuedTerm__Group_2_0__2__Impl : ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3356:1: ( ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) ) )
            // InternalRdfMapping.g:3357:1: ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) )
            {
            // InternalRdfMapping.g:3357:1: ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) )
            // InternalRdfMapping.g:3358:2: ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeAssignment_2_0_2()); 
            // InternalRdfMapping.g:3359:2: ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 )
            // InternalRdfMapping.g:3359:3: rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2
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
    // InternalRdfMapping.g:3368:1: rule__ReferenceValuedTerm__Group_2_1__0 : rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1 ;
    public final void rule__ReferenceValuedTerm__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3372:1: ( rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1 )
            // InternalRdfMapping.g:3373:2: rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRdfMapping.g:3380:1: rule__ReferenceValuedTerm__Group_2_1__0__Impl : ( 'with' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3384:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3385:1: ( 'with' )
            {
            // InternalRdfMapping.g:3385:1: ( 'with' )
            // InternalRdfMapping.g:3386:2: 'with'
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
    // InternalRdfMapping.g:3395:1: rule__ReferenceValuedTerm__Group_2_1__1 : rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2 ;
    public final void rule__ReferenceValuedTerm__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3399:1: ( rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2 )
            // InternalRdfMapping.g:3400:2: rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2
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
    // InternalRdfMapping.g:3407:1: rule__ReferenceValuedTerm__Group_2_1__1__Impl : ( 'language-tag' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3411:1: ( ( 'language-tag' ) )
            // InternalRdfMapping.g:3412:1: ( 'language-tag' )
            {
            // InternalRdfMapping.g:3412:1: ( 'language-tag' )
            // InternalRdfMapping.g:3413:2: 'language-tag'
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagKeyword_2_1_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRdfMapping.g:3422:1: rule__ReferenceValuedTerm__Group_2_1__2 : rule__ReferenceValuedTerm__Group_2_1__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3426:1: ( rule__ReferenceValuedTerm__Group_2_1__2__Impl )
            // InternalRdfMapping.g:3427:2: rule__ReferenceValuedTerm__Group_2_1__2__Impl
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
    // InternalRdfMapping.g:3433:1: rule__ReferenceValuedTerm__Group_2_1__2__Impl : ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3437:1: ( ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) ) )
            // InternalRdfMapping.g:3438:1: ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) )
            {
            // InternalRdfMapping.g:3438:1: ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) )
            // InternalRdfMapping.g:3439:2: ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagAssignment_2_1_2()); 
            // InternalRdfMapping.g:3440:2: ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 )
            // InternalRdfMapping.g:3440:3: rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2
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
    // InternalRdfMapping.g:3449:1: rule__TemplateValuedTerm__Group__0 : rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1 ;
    public final void rule__TemplateValuedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3453:1: ( rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1 )
            // InternalRdfMapping.g:3454:2: rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1
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
    // InternalRdfMapping.g:3461:1: rule__TemplateValuedTerm__Group__0__Impl : ( 'template' ) ;
    public final void rule__TemplateValuedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3465:1: ( ( 'template' ) )
            // InternalRdfMapping.g:3466:1: ( 'template' )
            {
            // InternalRdfMapping.g:3466:1: ( 'template' )
            // InternalRdfMapping.g:3467:2: 'template'
            {
             before(grammarAccess.getTemplateValuedTermAccess().getTemplateKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRdfMapping.g:3476:1: rule__TemplateValuedTerm__Group__1 : rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2 ;
    public final void rule__TemplateValuedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3480:1: ( rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2 )
            // InternalRdfMapping.g:3481:2: rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2
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
    // InternalRdfMapping.g:3488:1: rule__TemplateValuedTerm__Group__1__Impl : ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) ) ;
    public final void rule__TemplateValuedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3492:1: ( ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) ) )
            // InternalRdfMapping.g:3493:1: ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) )
            {
            // InternalRdfMapping.g:3493:1: ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) )
            // InternalRdfMapping.g:3494:2: ( rule__TemplateValuedTerm__PatternAssignment_1 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getPatternAssignment_1()); 
            // InternalRdfMapping.g:3495:2: ( rule__TemplateValuedTerm__PatternAssignment_1 )
            // InternalRdfMapping.g:3495:3: rule__TemplateValuedTerm__PatternAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateValuedTermAccess().getPatternAssignment_1()); 

            }


            }

        }
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
    // InternalRdfMapping.g:3503:1: rule__TemplateValuedTerm__Group__2 : rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3 ;
    public final void rule__TemplateValuedTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3507:1: ( rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3 )
            // InternalRdfMapping.g:3508:2: rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3
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
    // InternalRdfMapping.g:3515:1: rule__TemplateValuedTerm__Group__2__Impl : ( 'with' ) ;
    public final void rule__TemplateValuedTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3519:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3520:1: ( 'with' )
            {
            // InternalRdfMapping.g:3520:1: ( 'with' )
            // InternalRdfMapping.g:3521:2: 'with'
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
    // InternalRdfMapping.g:3530:1: rule__TemplateValuedTerm__Group__3 : rule__TemplateValuedTerm__Group__3__Impl ;
    public final void rule__TemplateValuedTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3534:1: ( rule__TemplateValuedTerm__Group__3__Impl )
            // InternalRdfMapping.g:3535:2: rule__TemplateValuedTerm__Group__3__Impl
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
    // InternalRdfMapping.g:3541:1: rule__TemplateValuedTerm__Group__3__Impl : ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) ) ;
    public final void rule__TemplateValuedTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3545:1: ( ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) ) )
            // InternalRdfMapping.g:3546:1: ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) )
            {
            // InternalRdfMapping.g:3546:1: ( ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* ) )
            // InternalRdfMapping.g:3547:2: ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) ) ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* )
            {
            // InternalRdfMapping.g:3547:2: ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 ) )
            // InternalRdfMapping.g:3548:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3549:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )
            // InternalRdfMapping.g:3549:4: rule__TemplateValuedTerm__ReferencesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__TemplateValuedTerm__ReferencesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTemplateValuedTermAccess().getReferencesAssignment_3()); 

            }

            // InternalRdfMapping.g:3552:2: ( ( rule__TemplateValuedTerm__ReferencesAssignment_3 )* )
            // InternalRdfMapping.g:3553:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )*
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3554:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalRdfMapping.g:3554:4: rule__TemplateValuedTerm__ReferencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TemplateValuedTerm__ReferencesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRdfMapping.g:3564:1: rule__LinkedResourceTerm__Group__0 : rule__LinkedResourceTerm__Group__0__Impl rule__LinkedResourceTerm__Group__1 ;
    public final void rule__LinkedResourceTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3568:1: ( rule__LinkedResourceTerm__Group__0__Impl rule__LinkedResourceTerm__Group__1 )
            // InternalRdfMapping.g:3569:2: rule__LinkedResourceTerm__Group__0__Impl rule__LinkedResourceTerm__Group__1
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
    // InternalRdfMapping.g:3576:1: rule__LinkedResourceTerm__Group__0__Impl : ( 'link' ) ;
    public final void rule__LinkedResourceTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3580:1: ( ( 'link' ) )
            // InternalRdfMapping.g:3581:1: ( 'link' )
            {
            // InternalRdfMapping.g:3581:1: ( 'link' )
            // InternalRdfMapping.g:3582:2: 'link'
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
    // InternalRdfMapping.g:3591:1: rule__LinkedResourceTerm__Group__1 : rule__LinkedResourceTerm__Group__1__Impl rule__LinkedResourceTerm__Group__2 ;
    public final void rule__LinkedResourceTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3595:1: ( rule__LinkedResourceTerm__Group__1__Impl rule__LinkedResourceTerm__Group__2 )
            // InternalRdfMapping.g:3596:2: rule__LinkedResourceTerm__Group__1__Impl rule__LinkedResourceTerm__Group__2
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
    // InternalRdfMapping.g:3603:1: rule__LinkedResourceTerm__Group__1__Impl : ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) ) ;
    public final void rule__LinkedResourceTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3607:1: ( ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) ) )
            // InternalRdfMapping.g:3608:1: ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) )
            {
            // InternalRdfMapping.g:3608:1: ( ( rule__LinkedResourceTerm__MappingAssignment_1 ) )
            // InternalRdfMapping.g:3609:2: ( rule__LinkedResourceTerm__MappingAssignment_1 )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getMappingAssignment_1()); 
            // InternalRdfMapping.g:3610:2: ( rule__LinkedResourceTerm__MappingAssignment_1 )
            // InternalRdfMapping.g:3610:3: rule__LinkedResourceTerm__MappingAssignment_1
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
    // InternalRdfMapping.g:3618:1: rule__LinkedResourceTerm__Group__2 : rule__LinkedResourceTerm__Group__2__Impl rule__LinkedResourceTerm__Group__3 ;
    public final void rule__LinkedResourceTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3622:1: ( rule__LinkedResourceTerm__Group__2__Impl rule__LinkedResourceTerm__Group__3 )
            // InternalRdfMapping.g:3623:2: rule__LinkedResourceTerm__Group__2__Impl rule__LinkedResourceTerm__Group__3
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
    // InternalRdfMapping.g:3630:1: rule__LinkedResourceTerm__Group__2__Impl : ( 'with' ) ;
    public final void rule__LinkedResourceTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3634:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3635:1: ( 'with' )
            {
            // InternalRdfMapping.g:3635:1: ( 'with' )
            // InternalRdfMapping.g:3636:2: 'with'
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
    // InternalRdfMapping.g:3645:1: rule__LinkedResourceTerm__Group__3 : rule__LinkedResourceTerm__Group__3__Impl ;
    public final void rule__LinkedResourceTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3649:1: ( rule__LinkedResourceTerm__Group__3__Impl )
            // InternalRdfMapping.g:3650:2: rule__LinkedResourceTerm__Group__3__Impl
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
    // InternalRdfMapping.g:3656:1: rule__LinkedResourceTerm__Group__3__Impl : ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) ) ;
    public final void rule__LinkedResourceTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3660:1: ( ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) ) )
            // InternalRdfMapping.g:3661:1: ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) )
            {
            // InternalRdfMapping.g:3661:1: ( ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* ) )
            // InternalRdfMapping.g:3662:2: ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) ) ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* )
            {
            // InternalRdfMapping.g:3662:2: ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 ) )
            // InternalRdfMapping.g:3663:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3664:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )
            // InternalRdfMapping.g:3664:4: rule__LinkedResourceTerm__ReferencesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__LinkedResourceTerm__ReferencesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkedResourceTermAccess().getReferencesAssignment_3()); 

            }

            // InternalRdfMapping.g:3667:2: ( ( rule__LinkedResourceTerm__ReferencesAssignment_3 )* )
            // InternalRdfMapping.g:3668:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )*
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesAssignment_3()); 
            // InternalRdfMapping.g:3669:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalRdfMapping.g:3669:4: rule__LinkedResourceTerm__ReferencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LinkedResourceTerm__ReferencesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalRdfMapping.g:3679:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3683:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRdfMapping.g:3684:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalRdfMapping.g:3691:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3695:1: ( ( 'import' ) )
            // InternalRdfMapping.g:3696:1: ( 'import' )
            {
            // InternalRdfMapping.g:3696:1: ( 'import' )
            // InternalRdfMapping.g:3697:2: 'import'
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
    // InternalRdfMapping.g:3706:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3710:1: ( rule__Import__Group__1__Impl )
            // InternalRdfMapping.g:3711:2: rule__Import__Group__1__Impl
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
    // InternalRdfMapping.g:3717:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3721:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRdfMapping.g:3722:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRdfMapping.g:3722:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRdfMapping.g:3723:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalRdfMapping.g:3724:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRdfMapping.g:3724:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalRdfMapping.g:3733:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3737:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRdfMapping.g:3738:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRdfMapping.g:3745:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3749:1: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3750:1: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:3750:1: ( ruleQualifiedName )
            // InternalRdfMapping.g:3751:2: ruleQualifiedName
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
    // InternalRdfMapping.g:3760:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3764:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRdfMapping.g:3765:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRdfMapping.g:3771:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3775:1: ( ( ( '.*' )? ) )
            // InternalRdfMapping.g:3776:1: ( ( '.*' )? )
            {
            // InternalRdfMapping.g:3776:1: ( ( '.*' )? )
            // InternalRdfMapping.g:3777:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRdfMapping.g:3778:2: ( '.*' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRdfMapping.g:3778:3: '.*'
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
    // InternalRdfMapping.g:3787:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3791:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRdfMapping.g:3792:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalRdfMapping.g:3799:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3803:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3804:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3804:1: ( RULE_ID )
            // InternalRdfMapping.g:3805:2: RULE_ID
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
    // InternalRdfMapping.g:3814:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3818:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRdfMapping.g:3819:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRdfMapping.g:3825:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3829:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRdfMapping.g:3830:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRdfMapping.g:3830:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRdfMapping.g:3831:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRdfMapping.g:3832:2: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRdfMapping.g:3832:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalRdfMapping.g:3841:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3845:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRdfMapping.g:3846:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalRdfMapping.g:3853:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3857:1: ( ( '.' ) )
            // InternalRdfMapping.g:3858:1: ( '.' )
            {
            // InternalRdfMapping.g:3858:1: ( '.' )
            // InternalRdfMapping.g:3859:2: '.'
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
    // InternalRdfMapping.g:3868:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3872:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRdfMapping.g:3873:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRdfMapping.g:3879:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3883:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3884:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3884:1: ( RULE_ID )
            // InternalRdfMapping.g:3885:2: RULE_ID
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
    // InternalRdfMapping.g:3895:1: rule__Domainmodel__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3899:1: ( ( ruleElement ) )
            // InternalRdfMapping.g:3900:2: ( ruleElement )
            {
            // InternalRdfMapping.g:3900:2: ( ruleElement )
            // InternalRdfMapping.g:3901:3: ruleElement
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
    // InternalRdfMapping.g:3910:1: rule__SourceTypesDefinition__TypesAssignment_3 : ( ruleSourceType ) ;
    public final void rule__SourceTypesDefinition__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3914:1: ( ( ruleSourceType ) )
            // InternalRdfMapping.g:3915:2: ( ruleSourceType )
            {
            // InternalRdfMapping.g:3915:2: ( ruleSourceType )
            // InternalRdfMapping.g:3916:3: ruleSourceType
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
    // InternalRdfMapping.g:3925:1: rule__SourceType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SourceType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3929:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3930:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3930:2: ( RULE_ID )
            // InternalRdfMapping.g:3931:3: RULE_ID
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
    // InternalRdfMapping.g:3940:1: rule__SourceType__ReferenceFormulationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SourceType__ReferenceFormulationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3944:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3945:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3945:2: ( RULE_STRING )
            // InternalRdfMapping.g:3946:3: RULE_STRING
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
    // InternalRdfMapping.g:3955:1: rule__DatatypesDefinition__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__DatatypesDefinition__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3959:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:3960:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:3960:2: ( rulePrefix )
            // InternalRdfMapping.g:3961:3: rulePrefix
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
    // InternalRdfMapping.g:3970:1: rule__DatatypesDefinition__TypesAssignment_4 : ( ruleDatatype ) ;
    public final void rule__DatatypesDefinition__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3974:1: ( ( ruleDatatype ) )
            // InternalRdfMapping.g:3975:2: ( ruleDatatype )
            {
            // InternalRdfMapping.g:3975:2: ( ruleDatatype )
            // InternalRdfMapping.g:3976:3: ruleDatatype
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
    // InternalRdfMapping.g:3985:1: rule__Datatype__NameAssignment : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3989:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3990:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3990:2: ( RULE_ID )
            // InternalRdfMapping.g:3991:3: RULE_ID
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
    // InternalRdfMapping.g:4000:1: rule__LanguageTagDefinition__LanguageTagsAssignment_3 : ( ruleLanguageTag ) ;
    public final void rule__LanguageTagDefinition__LanguageTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4004:1: ( ( ruleLanguageTag ) )
            // InternalRdfMapping.g:4005:2: ( ruleLanguageTag )
            {
            // InternalRdfMapping.g:4005:2: ( ruleLanguageTag )
            // InternalRdfMapping.g:4006:3: ruleLanguageTag
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
    // InternalRdfMapping.g:4015:1: rule__LanguageTag__NameAssignment : ( RULE_ID ) ;
    public final void rule__LanguageTag__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4019:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4020:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4020:2: ( RULE_ID )
            // InternalRdfMapping.g:4021:3: RULE_ID
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
    // InternalRdfMapping.g:4030:1: rule__SourceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SourceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4034:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4035:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4035:2: ( RULE_ID )
            // InternalRdfMapping.g:4036:3: RULE_ID
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
    // InternalRdfMapping.g:4045:1: rule__SourceGroup__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SourceGroup__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4049:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4050:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4050:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4051:3: ( RULE_ID )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0()); 
            // InternalRdfMapping.g:4052:3: ( RULE_ID )
            // InternalRdfMapping.g:4053:4: RULE_ID
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
    // InternalRdfMapping.g:4064:1: rule__SourceGroup__SourceAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__SourceGroup__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4068:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4069:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4069:2: ( RULE_STRING )
            // InternalRdfMapping.g:4070:3: RULE_STRING
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
    // InternalRdfMapping.g:4079:1: rule__SourceGroup__LogicalSourcesAssignment_7 : ( ruleLogicalSource ) ;
    public final void rule__SourceGroup__LogicalSourcesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4083:1: ( ( ruleLogicalSource ) )
            // InternalRdfMapping.g:4084:2: ( ruleLogicalSource )
            {
            // InternalRdfMapping.g:4084:2: ( ruleLogicalSource )
            // InternalRdfMapping.g:4085:3: ruleLogicalSource
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
    // InternalRdfMapping.g:4094:1: rule__LogicalSource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicalSource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4098:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4099:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4099:2: ( RULE_ID )
            // InternalRdfMapping.g:4100:3: RULE_ID
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
    // InternalRdfMapping.g:4109:1: rule__LogicalSource__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LogicalSource__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4113:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4114:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4114:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4115:3: ( RULE_ID )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0()); 
            // InternalRdfMapping.g:4116:3: ( RULE_ID )
            // InternalRdfMapping.g:4117:4: RULE_ID
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
    // InternalRdfMapping.g:4128:1: rule__LogicalSource__SourceAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4132:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4133:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4133:2: ( RULE_STRING )
            // InternalRdfMapping.g:4134:3: RULE_STRING
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
    // InternalRdfMapping.g:4143:1: rule__LogicalSource__IteratorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__IteratorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4147:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4148:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4148:2: ( RULE_STRING )
            // InternalRdfMapping.g:4149:3: RULE_STRING
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
    // InternalRdfMapping.g:4158:1: rule__LogicalSource__ReferencablesAssignment_8 : ( ruleReferenceable ) ;
    public final void rule__LogicalSource__ReferencablesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4162:1: ( ( ruleReferenceable ) )
            // InternalRdfMapping.g:4163:2: ( ruleReferenceable )
            {
            // InternalRdfMapping.g:4163:2: ( ruleReferenceable )
            // InternalRdfMapping.g:4164:3: ruleReferenceable
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
    // InternalRdfMapping.g:4173:1: rule__Referenceable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Referenceable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4177:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4178:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4178:2: ( RULE_ID )
            // InternalRdfMapping.g:4179:3: RULE_ID
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
    // InternalRdfMapping.g:4188:1: rule__Referenceable__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Referenceable__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4192:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4193:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4193:2: ( RULE_STRING )
            // InternalRdfMapping.g:4194:3: RULE_STRING
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
    // InternalRdfMapping.g:4203:1: rule__Vocabulary__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vocabulary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4207:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4208:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4208:2: ( RULE_ID )
            // InternalRdfMapping.g:4209:3: RULE_ID
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
    // InternalRdfMapping.g:4218:1: rule__Vocabulary__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__Vocabulary__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4222:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:4223:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:4223:2: ( rulePrefix )
            // InternalRdfMapping.g:4224:3: rulePrefix
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
    // InternalRdfMapping.g:4233:1: rule__Vocabulary__ClassesAssignment_4_1 : ( ruleRdfClass ) ;
    public final void rule__Vocabulary__ClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4237:1: ( ( ruleRdfClass ) )
            // InternalRdfMapping.g:4238:2: ( ruleRdfClass )
            {
            // InternalRdfMapping.g:4238:2: ( ruleRdfClass )
            // InternalRdfMapping.g:4239:3: ruleRdfClass
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
    // InternalRdfMapping.g:4248:1: rule__Vocabulary__PropertiesAssignment_5_1 : ( ruleRdfProperty ) ;
    public final void rule__Vocabulary__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4252:1: ( ( ruleRdfProperty ) )
            // InternalRdfMapping.g:4253:2: ( ruleRdfProperty )
            {
            // InternalRdfMapping.g:4253:2: ( ruleRdfProperty )
            // InternalRdfMapping.g:4254:3: ruleRdfProperty
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
    // InternalRdfMapping.g:4263:1: rule__Prefix__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Prefix__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4267:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4268:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4268:2: ( RULE_STRING )
            // InternalRdfMapping.g:4269:3: RULE_STRING
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
    // InternalRdfMapping.g:4278:1: rule__Prefix__IriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__IriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4282:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4283:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4283:2: ( RULE_STRING )
            // InternalRdfMapping.g:4284:3: RULE_STRING
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
    // InternalRdfMapping.g:4293:1: rule__RdfProperty__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfProperty__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4297:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4298:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4298:2: ( RULE_ID )
            // InternalRdfMapping.g:4299:3: RULE_ID
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
    // InternalRdfMapping.g:4308:1: rule__RdfClass__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfClass__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4312:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4313:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4313:2: ( RULE_ID )
            // InternalRdfMapping.g:4314:3: RULE_ID
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
    // InternalRdfMapping.g:4323:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4327:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4328:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4328:2: ( RULE_ID )
            // InternalRdfMapping.g:4329:3: RULE_ID
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
    // InternalRdfMapping.g:4338:1: rule__Mapping__SourceAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4342:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4343:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4343:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4344:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getSourceLogicalSourceCrossReference_3_0()); 
            // InternalRdfMapping.g:4345:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4346:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4357:1: rule__Mapping__PatternAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Mapping__PatternAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4361:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4362:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4362:2: ( RULE_STRING )
            // InternalRdfMapping.g:4363:3: RULE_STRING
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


    // $ANTLR start "rule__Mapping__ReferencesAssignment_9"
    // InternalRdfMapping.g:4372:1: rule__Mapping__ReferencesAssignment_9 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__ReferencesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4376:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4377:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4377:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4378:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getReferencesReferenceableCrossReference_9_0()); 
            // InternalRdfMapping.g:4379:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4380:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getReferencesReferenceableQualifiedNameParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getReferencesReferenceableQualifiedNameParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getReferencesReferenceableCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ReferencesAssignment_9"


    // $ANTLR start "rule__Mapping__SubjectTypeMappingsAssignment_10_1"
    // InternalRdfMapping.g:4391:1: rule__Mapping__SubjectTypeMappingsAssignment_10_1 : ( ruleSubjectTypeMapping ) ;
    public final void rule__Mapping__SubjectTypeMappingsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4395:1: ( ( ruleSubjectTypeMapping ) )
            // InternalRdfMapping.g:4396:2: ( ruleSubjectTypeMapping )
            {
            // InternalRdfMapping.g:4396:2: ( ruleSubjectTypeMapping )
            // InternalRdfMapping.g:4397:3: ruleSubjectTypeMapping
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
    // InternalRdfMapping.g:4406:1: rule__Mapping__PoMappingsAssignment_11_1 : ( rulePredicateObjectMapping ) ;
    public final void rule__Mapping__PoMappingsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4410:1: ( ( rulePredicateObjectMapping ) )
            // InternalRdfMapping.g:4411:2: ( rulePredicateObjectMapping )
            {
            // InternalRdfMapping.g:4411:2: ( rulePredicateObjectMapping )
            // InternalRdfMapping.g:4412:3: rulePredicateObjectMapping
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
    // InternalRdfMapping.g:4421:1: rule__SubjectTypeMapping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubjectTypeMapping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4425:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4426:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4426:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4427:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassCrossReference_0()); 
            // InternalRdfMapping.g:4428:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4429:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4440:1: rule__PredicateObjectMapping__PropertyAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PredicateObjectMapping__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4444:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4445:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4445:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4446:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0()); 
            // InternalRdfMapping.g:4447:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4448:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4459:1: rule__PredicateObjectMapping__TermAssignment_1 : ( ruleValuedTerm ) ;
    public final void rule__PredicateObjectMapping__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4463:1: ( ( ruleValuedTerm ) )
            // InternalRdfMapping.g:4464:2: ( ruleValuedTerm )
            {
            // InternalRdfMapping.g:4464:2: ( ruleValuedTerm )
            // InternalRdfMapping.g:4465:3: ruleValuedTerm
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
    // InternalRdfMapping.g:4474:1: rule__ReferenceValuedTerm__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceValuedTerm__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4478:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4479:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4479:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4480:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableCrossReference_1_0()); 
            // InternalRdfMapping.g:4481:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4482:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableQualifiedNameParserRuleCall_1_0_1()); 

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
    // InternalRdfMapping.g:4493:1: rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4497:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4498:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4498:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4499:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeCrossReference_2_0_2_0()); 
            // InternalRdfMapping.g:4500:3: ( RULE_ID )
            // InternalRdfMapping.g:4501:4: RULE_ID
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
    // InternalRdfMapping.g:4512:1: rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4516:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4517:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4517:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4518:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagCrossReference_2_1_2_0()); 
            // InternalRdfMapping.g:4519:3: ( RULE_ID )
            // InternalRdfMapping.g:4520:4: RULE_ID
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


    // $ANTLR start "rule__TemplateValuedTerm__PatternAssignment_1"
    // InternalRdfMapping.g:4531:1: rule__TemplateValuedTerm__PatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TemplateValuedTerm__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4535:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4536:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4536:2: ( RULE_STRING )
            // InternalRdfMapping.g:4537:3: RULE_STRING
            {
             before(grammarAccess.getTemplateValuedTermAccess().getPatternSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTemplateValuedTermAccess().getPatternSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateValuedTerm__PatternAssignment_1"


    // $ANTLR start "rule__TemplateValuedTerm__ReferencesAssignment_3"
    // InternalRdfMapping.g:4546:1: rule__TemplateValuedTerm__ReferencesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateValuedTerm__ReferencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4550:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4551:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4551:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4552:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableCrossReference_3_0()); 
            // InternalRdfMapping.g:4553:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4554:4: ruleQualifiedName
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableQualifiedNameParserRuleCall_3_0_1()); 

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
    // InternalRdfMapping.g:4565:1: rule__LinkedResourceTerm__MappingAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LinkedResourceTerm__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4569:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4570:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4570:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4571:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getMappingMappingCrossReference_1_0()); 
            // InternalRdfMapping.g:4572:3: ( RULE_ID )
            // InternalRdfMapping.g:4573:4: RULE_ID
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
    // InternalRdfMapping.g:4584:1: rule__LinkedResourceTerm__ReferencesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__LinkedResourceTerm__ReferencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4588:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4589:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4589:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4590:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableCrossReference_3_0()); 
            // InternalRdfMapping.g:4591:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4592:4: ruleQualifiedName
            {
             before(grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableQualifiedNameParserRuleCall_3_0_1()); 

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
    // InternalRdfMapping.g:4603:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4607:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:4608:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:4608:2: ( ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:4609:3: ruleQualifiedNameWithWildcard
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


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\1\1\uffff\1\4\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\uffff\2\4\1\uffff\1\4";
    static final String dfa_4s = "\1\15\1\uffff\1\47\1\4\1\uffff\1\47";
    static final String dfa_5s = "\1\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\10\uffff\1\1",
            "",
            "\1\4\10\uffff\1\4\17\uffff\1\1\1\uffff\1\1\4\uffff\1\1\2\uffff\1\3",
            "\1\5",
            "",
            "\1\4\10\uffff\1\4\17\uffff\1\1\1\uffff\1\1\4\uffff\1\1\2\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3554:3: ( rule__TemplateValuedTerm__ReferencesAssignment_3 )*";
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3669:3: ( rule__LinkedResourceTerm__ReferencesAssignment_3 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002011238802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002011238800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000D40000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000204002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000010A0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000002L});

}