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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'datatypes'", "'language-tags'", "'source-group'", "'type'", "';'", "'source'", "'logical-source'", "'referenceables'", "'iterator'", "'vocabulary'", "'classes'", "'properties'", "'prefix'", "'map'", "'from'", "'subject'", "'template'", "'with'", "'types'", "'datatype'", "'language-tag'", "'import'", "'.*'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=17)||LA1_0==21||LA1_0==24||LA1_0==28||LA1_0==36) ) {
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


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:578:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRdfMapping.g:579:1: ( ruleImport EOF )
            // InternalRdfMapping.g:580:1: ruleImport EOF
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
    // InternalRdfMapping.g:587:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:591:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRdfMapping.g:592:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRdfMapping.g:592:2: ( ( rule__Import__Group__0 ) )
            // InternalRdfMapping.g:593:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRdfMapping.g:594:3: ( rule__Import__Group__0 )
            // InternalRdfMapping.g:594:4: rule__Import__Group__0
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
    // InternalRdfMapping.g:603:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRdfMapping.g:604:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:605:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:612:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:616:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRdfMapping.g:617:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRdfMapping.g:617:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRdfMapping.g:618:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRdfMapping.g:619:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRdfMapping.g:619:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalRdfMapping.g:628:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRdfMapping.g:629:1: ( ruleQualifiedName EOF )
            // InternalRdfMapping.g:630:1: ruleQualifiedName EOF
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
    // InternalRdfMapping.g:637:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:641:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRdfMapping.g:642:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRdfMapping.g:642:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRdfMapping.g:643:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRdfMapping.g:644:3: ( rule__QualifiedName__Group__0 )
            // InternalRdfMapping.g:644:4: rule__QualifiedName__Group__0
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
    // InternalRdfMapping.g:652:1: rule__Element__Alternatives : ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleDatatypesDefinition ) | ( ruleLanguageTagDefinition ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:656:1: ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleDatatypesDefinition ) | ( ruleLanguageTagDefinition ) )
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
            case 36:
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
                    // InternalRdfMapping.g:657:2: ( ruleSourceGroup )
                    {
                    // InternalRdfMapping.g:657:2: ( ruleSourceGroup )
                    // InternalRdfMapping.g:658:3: ruleSourceGroup
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
                    // InternalRdfMapping.g:663:2: ( ruleLogicalSource )
                    {
                    // InternalRdfMapping.g:663:2: ( ruleLogicalSource )
                    // InternalRdfMapping.g:664:3: ruleLogicalSource
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
                    // InternalRdfMapping.g:669:2: ( ruleVocabulary )
                    {
                    // InternalRdfMapping.g:669:2: ( ruleVocabulary )
                    // InternalRdfMapping.g:670:3: ruleVocabulary
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
                    // InternalRdfMapping.g:675:2: ( ruleMapping )
                    {
                    // InternalRdfMapping.g:675:2: ( ruleMapping )
                    // InternalRdfMapping.g:676:3: ruleMapping
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
                    // InternalRdfMapping.g:681:2: ( ruleImport )
                    {
                    // InternalRdfMapping.g:681:2: ( ruleImport )
                    // InternalRdfMapping.g:682:3: ruleImport
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
                    // InternalRdfMapping.g:687:2: ( ruleSourceTypesDefinition )
                    {
                    // InternalRdfMapping.g:687:2: ( ruleSourceTypesDefinition )
                    // InternalRdfMapping.g:688:3: ruleSourceTypesDefinition
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
                    // InternalRdfMapping.g:693:2: ( ruleDatatypesDefinition )
                    {
                    // InternalRdfMapping.g:693:2: ( ruleDatatypesDefinition )
                    // InternalRdfMapping.g:694:3: ruleDatatypesDefinition
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
                    // InternalRdfMapping.g:699:2: ( ruleLanguageTagDefinition )
                    {
                    // InternalRdfMapping.g:699:2: ( ruleLanguageTagDefinition )
                    // InternalRdfMapping.g:700:3: ruleLanguageTagDefinition
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
    // InternalRdfMapping.g:709:1: rule__ValuedTerm__Alternatives : ( ( ruleReferenceValuedTerm ) | ( ruleTemplateValuedTerm ) );
    public final void rule__ValuedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:713:1: ( ( ruleReferenceValuedTerm ) | ( ruleTemplateValuedTerm ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRdfMapping.g:714:2: ( ruleReferenceValuedTerm )
                    {
                    // InternalRdfMapping.g:714:2: ( ruleReferenceValuedTerm )
                    // InternalRdfMapping.g:715:3: ruleReferenceValuedTerm
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
                    // InternalRdfMapping.g:720:2: ( ruleTemplateValuedTerm )
                    {
                    // InternalRdfMapping.g:720:2: ( ruleTemplateValuedTerm )
                    // InternalRdfMapping.g:721:3: ruleTemplateValuedTerm
                    {
                     before(grammarAccess.getValuedTermAccess().getTemplateValuedTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemplateValuedTerm();

                    state._fsp--;

                     after(grammarAccess.getValuedTermAccess().getTemplateValuedTermParserRuleCall_1()); 

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
    // InternalRdfMapping.g:730:1: rule__ReferenceValuedTerm__Alternatives_2 : ( ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) ) | ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) ) );
    public final void rule__ReferenceValuedTerm__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:734:1: ( ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) ) | ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==35) ) {
                    alt4=2;
                }
                else if ( (LA4_1==34) ) {
                    alt4=1;
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
                    // InternalRdfMapping.g:735:2: ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) )
                    {
                    // InternalRdfMapping.g:735:2: ( ( rule__ReferenceValuedTerm__Group_2_0__0 ) )
                    // InternalRdfMapping.g:736:3: ( rule__ReferenceValuedTerm__Group_2_0__0 )
                    {
                     before(grammarAccess.getReferenceValuedTermAccess().getGroup_2_0()); 
                    // InternalRdfMapping.g:737:3: ( rule__ReferenceValuedTerm__Group_2_0__0 )
                    // InternalRdfMapping.g:737:4: rule__ReferenceValuedTerm__Group_2_0__0
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
                    // InternalRdfMapping.g:741:2: ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) )
                    {
                    // InternalRdfMapping.g:741:2: ( ( rule__ReferenceValuedTerm__Group_2_1__0 ) )
                    // InternalRdfMapping.g:742:3: ( rule__ReferenceValuedTerm__Group_2_1__0 )
                    {
                     before(grammarAccess.getReferenceValuedTermAccess().getGroup_2_1()); 
                    // InternalRdfMapping.g:743:3: ( rule__ReferenceValuedTerm__Group_2_1__0 )
                    // InternalRdfMapping.g:743:4: rule__ReferenceValuedTerm__Group_2_1__0
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
    // InternalRdfMapping.g:751:1: rule__SourceTypesDefinition__Group__0 : rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 ;
    public final void rule__SourceTypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:755:1: ( rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 )
            // InternalRdfMapping.g:756:2: rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1
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
    // InternalRdfMapping.g:763:1: rule__SourceTypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SourceTypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:767:1: ( ( () ) )
            // InternalRdfMapping.g:768:1: ( () )
            {
            // InternalRdfMapping.g:768:1: ( () )
            // InternalRdfMapping.g:769:2: ()
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0()); 
            // InternalRdfMapping.g:770:2: ()
            // InternalRdfMapping.g:770:3: 
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
    // InternalRdfMapping.g:778:1: rule__SourceTypesDefinition__Group__1 : rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 ;
    public final void rule__SourceTypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:782:1: ( rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 )
            // InternalRdfMapping.g:783:2: rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2
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
    // InternalRdfMapping.g:790:1: rule__SourceTypesDefinition__Group__1__Impl : ( 'source-types' ) ;
    public final void rule__SourceTypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:794:1: ( ( 'source-types' ) )
            // InternalRdfMapping.g:795:1: ( 'source-types' )
            {
            // InternalRdfMapping.g:795:1: ( 'source-types' )
            // InternalRdfMapping.g:796:2: 'source-types'
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
    // InternalRdfMapping.g:805:1: rule__SourceTypesDefinition__Group__2 : rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 ;
    public final void rule__SourceTypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:809:1: ( rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 )
            // InternalRdfMapping.g:810:2: rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3
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
    // InternalRdfMapping.g:817:1: rule__SourceTypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceTypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:821:1: ( ( '{' ) )
            // InternalRdfMapping.g:822:1: ( '{' )
            {
            // InternalRdfMapping.g:822:1: ( '{' )
            // InternalRdfMapping.g:823:2: '{'
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
    // InternalRdfMapping.g:832:1: rule__SourceTypesDefinition__Group__3 : rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 ;
    public final void rule__SourceTypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:836:1: ( rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 )
            // InternalRdfMapping.g:837:2: rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4
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
    // InternalRdfMapping.g:844:1: rule__SourceTypesDefinition__Group__3__Impl : ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) ;
    public final void rule__SourceTypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:848:1: ( ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) )
            // InternalRdfMapping.g:849:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            {
            // InternalRdfMapping.g:849:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            // InternalRdfMapping.g:850:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getTypesAssignment_3()); 
            // InternalRdfMapping.g:851:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:851:3: rule__SourceTypesDefinition__TypesAssignment_3
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
    // InternalRdfMapping.g:859:1: rule__SourceTypesDefinition__Group__4 : rule__SourceTypesDefinition__Group__4__Impl ;
    public final void rule__SourceTypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:863:1: ( rule__SourceTypesDefinition__Group__4__Impl )
            // InternalRdfMapping.g:864:2: rule__SourceTypesDefinition__Group__4__Impl
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
    // InternalRdfMapping.g:870:1: rule__SourceTypesDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SourceTypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:874:1: ( ( '}' ) )
            // InternalRdfMapping.g:875:1: ( '}' )
            {
            // InternalRdfMapping.g:875:1: ( '}' )
            // InternalRdfMapping.g:876:2: '}'
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
    // InternalRdfMapping.g:886:1: rule__SourceType__Group__0 : rule__SourceType__Group__0__Impl rule__SourceType__Group__1 ;
    public final void rule__SourceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:890:1: ( rule__SourceType__Group__0__Impl rule__SourceType__Group__1 )
            // InternalRdfMapping.g:891:2: rule__SourceType__Group__0__Impl rule__SourceType__Group__1
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
    // InternalRdfMapping.g:898:1: rule__SourceType__Group__0__Impl : ( ( rule__SourceType__NameAssignment_0 ) ) ;
    public final void rule__SourceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:902:1: ( ( ( rule__SourceType__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:903:1: ( ( rule__SourceType__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:903:1: ( ( rule__SourceType__NameAssignment_0 ) )
            // InternalRdfMapping.g:904:2: ( rule__SourceType__NameAssignment_0 )
            {
             before(grammarAccess.getSourceTypeAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:905:2: ( rule__SourceType__NameAssignment_0 )
            // InternalRdfMapping.g:905:3: rule__SourceType__NameAssignment_0
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
    // InternalRdfMapping.g:913:1: rule__SourceType__Group__1 : rule__SourceType__Group__1__Impl rule__SourceType__Group__2 ;
    public final void rule__SourceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:917:1: ( rule__SourceType__Group__1__Impl rule__SourceType__Group__2 )
            // InternalRdfMapping.g:918:2: rule__SourceType__Group__1__Impl rule__SourceType__Group__2
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
    // InternalRdfMapping.g:925:1: rule__SourceType__Group__1__Impl : ( 'referenceFormulation' ) ;
    public final void rule__SourceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:929:1: ( ( 'referenceFormulation' ) )
            // InternalRdfMapping.g:930:1: ( 'referenceFormulation' )
            {
            // InternalRdfMapping.g:930:1: ( 'referenceFormulation' )
            // InternalRdfMapping.g:931:2: 'referenceFormulation'
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
    // InternalRdfMapping.g:940:1: rule__SourceType__Group__2 : rule__SourceType__Group__2__Impl ;
    public final void rule__SourceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:944:1: ( rule__SourceType__Group__2__Impl )
            // InternalRdfMapping.g:945:2: rule__SourceType__Group__2__Impl
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
    // InternalRdfMapping.g:951:1: rule__SourceType__Group__2__Impl : ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) ;
    public final void rule__SourceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:955:1: ( ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) )
            // InternalRdfMapping.g:956:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            {
            // InternalRdfMapping.g:956:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            // InternalRdfMapping.g:957:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            {
             before(grammarAccess.getSourceTypeAccess().getReferenceFormulationAssignment_2()); 
            // InternalRdfMapping.g:958:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            // InternalRdfMapping.g:958:3: rule__SourceType__ReferenceFormulationAssignment_2
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
    // InternalRdfMapping.g:967:1: rule__DatatypesDefinition__Group__0 : rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 ;
    public final void rule__DatatypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:971:1: ( rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 )
            // InternalRdfMapping.g:972:2: rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1
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
    // InternalRdfMapping.g:979:1: rule__DatatypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DatatypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:983:1: ( ( () ) )
            // InternalRdfMapping.g:984:1: ( () )
            {
            // InternalRdfMapping.g:984:1: ( () )
            // InternalRdfMapping.g:985:2: ()
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getDatatypesDefinitionAction_0()); 
            // InternalRdfMapping.g:986:2: ()
            // InternalRdfMapping.g:986:3: 
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
    // InternalRdfMapping.g:994:1: rule__DatatypesDefinition__Group__1 : rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 ;
    public final void rule__DatatypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:998:1: ( rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 )
            // InternalRdfMapping.g:999:2: rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2
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
    // InternalRdfMapping.g:1006:1: rule__DatatypesDefinition__Group__1__Impl : ( 'datatypes' ) ;
    public final void rule__DatatypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1010:1: ( ( 'datatypes' ) )
            // InternalRdfMapping.g:1011:1: ( 'datatypes' )
            {
            // InternalRdfMapping.g:1011:1: ( 'datatypes' )
            // InternalRdfMapping.g:1012:2: 'datatypes'
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
    // InternalRdfMapping.g:1021:1: rule__DatatypesDefinition__Group__2 : rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 ;
    public final void rule__DatatypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1025:1: ( rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 )
            // InternalRdfMapping.g:1026:2: rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3
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
    // InternalRdfMapping.g:1033:1: rule__DatatypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__DatatypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1037:1: ( ( '{' ) )
            // InternalRdfMapping.g:1038:1: ( '{' )
            {
            // InternalRdfMapping.g:1038:1: ( '{' )
            // InternalRdfMapping.g:1039:2: '{'
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
    // InternalRdfMapping.g:1048:1: rule__DatatypesDefinition__Group__3 : rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 ;
    public final void rule__DatatypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1052:1: ( rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 )
            // InternalRdfMapping.g:1053:2: rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4
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
    // InternalRdfMapping.g:1060:1: rule__DatatypesDefinition__Group__3__Impl : ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) ;
    public final void rule__DatatypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1064:1: ( ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:1065:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:1065:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:1066:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:1067:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            // InternalRdfMapping.g:1067:3: rule__DatatypesDefinition__PrefixAssignment_3
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
    // InternalRdfMapping.g:1075:1: rule__DatatypesDefinition__Group__4 : rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 ;
    public final void rule__DatatypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1079:1: ( rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 )
            // InternalRdfMapping.g:1080:2: rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5
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
    // InternalRdfMapping.g:1087:1: rule__DatatypesDefinition__Group__4__Impl : ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) ;
    public final void rule__DatatypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1091:1: ( ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) )
            // InternalRdfMapping.g:1092:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            {
            // InternalRdfMapping.g:1092:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            // InternalRdfMapping.g:1093:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getTypesAssignment_4()); 
            // InternalRdfMapping.g:1094:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRdfMapping.g:1094:3: rule__DatatypesDefinition__TypesAssignment_4
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
    // InternalRdfMapping.g:1102:1: rule__DatatypesDefinition__Group__5 : rule__DatatypesDefinition__Group__5__Impl ;
    public final void rule__DatatypesDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1106:1: ( rule__DatatypesDefinition__Group__5__Impl )
            // InternalRdfMapping.g:1107:2: rule__DatatypesDefinition__Group__5__Impl
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
    // InternalRdfMapping.g:1113:1: rule__DatatypesDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__DatatypesDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1117:1: ( ( '}' ) )
            // InternalRdfMapping.g:1118:1: ( '}' )
            {
            // InternalRdfMapping.g:1118:1: ( '}' )
            // InternalRdfMapping.g:1119:2: '}'
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
    // InternalRdfMapping.g:1129:1: rule__LanguageTagDefinition__Group__0 : rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 ;
    public final void rule__LanguageTagDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1133:1: ( rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 )
            // InternalRdfMapping.g:1134:2: rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1
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
    // InternalRdfMapping.g:1141:1: rule__LanguageTagDefinition__Group__0__Impl : ( () ) ;
    public final void rule__LanguageTagDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1145:1: ( ( () ) )
            // InternalRdfMapping.g:1146:1: ( () )
            {
            // InternalRdfMapping.g:1146:1: ( () )
            // InternalRdfMapping.g:1147:2: ()
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagDefinitionAction_0()); 
            // InternalRdfMapping.g:1148:2: ()
            // InternalRdfMapping.g:1148:3: 
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
    // InternalRdfMapping.g:1156:1: rule__LanguageTagDefinition__Group__1 : rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 ;
    public final void rule__LanguageTagDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1160:1: ( rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 )
            // InternalRdfMapping.g:1161:2: rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2
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
    // InternalRdfMapping.g:1168:1: rule__LanguageTagDefinition__Group__1__Impl : ( 'language-tags' ) ;
    public final void rule__LanguageTagDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1172:1: ( ( 'language-tags' ) )
            // InternalRdfMapping.g:1173:1: ( 'language-tags' )
            {
            // InternalRdfMapping.g:1173:1: ( 'language-tags' )
            // InternalRdfMapping.g:1174:2: 'language-tags'
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
    // InternalRdfMapping.g:1183:1: rule__LanguageTagDefinition__Group__2 : rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 ;
    public final void rule__LanguageTagDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1187:1: ( rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 )
            // InternalRdfMapping.g:1188:2: rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3
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
    // InternalRdfMapping.g:1195:1: rule__LanguageTagDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LanguageTagDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1199:1: ( ( '{' ) )
            // InternalRdfMapping.g:1200:1: ( '{' )
            {
            // InternalRdfMapping.g:1200:1: ( '{' )
            // InternalRdfMapping.g:1201:2: '{'
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
    // InternalRdfMapping.g:1210:1: rule__LanguageTagDefinition__Group__3 : rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 ;
    public final void rule__LanguageTagDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1214:1: ( rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 )
            // InternalRdfMapping.g:1215:2: rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4
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
    // InternalRdfMapping.g:1222:1: rule__LanguageTagDefinition__Group__3__Impl : ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) ;
    public final void rule__LanguageTagDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1226:1: ( ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) )
            // InternalRdfMapping.g:1227:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            {
            // InternalRdfMapping.g:1227:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            // InternalRdfMapping.g:1228:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsAssignment_3()); 
            // InternalRdfMapping.g:1229:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRdfMapping.g:1229:3: rule__LanguageTagDefinition__LanguageTagsAssignment_3
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
    // InternalRdfMapping.g:1237:1: rule__LanguageTagDefinition__Group__4 : rule__LanguageTagDefinition__Group__4__Impl ;
    public final void rule__LanguageTagDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1241:1: ( rule__LanguageTagDefinition__Group__4__Impl )
            // InternalRdfMapping.g:1242:2: rule__LanguageTagDefinition__Group__4__Impl
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
    // InternalRdfMapping.g:1248:1: rule__LanguageTagDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__LanguageTagDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1252:1: ( ( '}' ) )
            // InternalRdfMapping.g:1253:1: ( '}' )
            {
            // InternalRdfMapping.g:1253:1: ( '}' )
            // InternalRdfMapping.g:1254:2: '}'
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
    // InternalRdfMapping.g:1264:1: rule__SourceGroup__Group__0 : rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 ;
    public final void rule__SourceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1268:1: ( rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 )
            // InternalRdfMapping.g:1269:2: rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1
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
    // InternalRdfMapping.g:1276:1: rule__SourceGroup__Group__0__Impl : ( 'source-group' ) ;
    public final void rule__SourceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1280:1: ( ( 'source-group' ) )
            // InternalRdfMapping.g:1281:1: ( 'source-group' )
            {
            // InternalRdfMapping.g:1281:1: ( 'source-group' )
            // InternalRdfMapping.g:1282:2: 'source-group'
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
    // InternalRdfMapping.g:1291:1: rule__SourceGroup__Group__1 : rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 ;
    public final void rule__SourceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1295:1: ( rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 )
            // InternalRdfMapping.g:1296:2: rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2
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
    // InternalRdfMapping.g:1303:1: rule__SourceGroup__Group__1__Impl : ( ( rule__SourceGroup__NameAssignment_1 ) ) ;
    public final void rule__SourceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1307:1: ( ( ( rule__SourceGroup__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1308:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1308:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            // InternalRdfMapping.g:1309:2: ( rule__SourceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1310:2: ( rule__SourceGroup__NameAssignment_1 )
            // InternalRdfMapping.g:1310:3: rule__SourceGroup__NameAssignment_1
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
    // InternalRdfMapping.g:1318:1: rule__SourceGroup__Group__2 : rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 ;
    public final void rule__SourceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1322:1: ( rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 )
            // InternalRdfMapping.g:1323:2: rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3
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
    // InternalRdfMapping.g:1330:1: rule__SourceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1334:1: ( ( '{' ) )
            // InternalRdfMapping.g:1335:1: ( '{' )
            {
            // InternalRdfMapping.g:1335:1: ( '{' )
            // InternalRdfMapping.g:1336:2: '{'
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
    // InternalRdfMapping.g:1345:1: rule__SourceGroup__Group__3 : rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 ;
    public final void rule__SourceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1349:1: ( rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 )
            // InternalRdfMapping.g:1350:2: rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4
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
    // InternalRdfMapping.g:1357:1: rule__SourceGroup__Group__3__Impl : ( 'type' ) ;
    public final void rule__SourceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1361:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1362:1: ( 'type' )
            {
            // InternalRdfMapping.g:1362:1: ( 'type' )
            // InternalRdfMapping.g:1363:2: 'type'
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
    // InternalRdfMapping.g:1372:1: rule__SourceGroup__Group__4 : rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 ;
    public final void rule__SourceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1376:1: ( rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 )
            // InternalRdfMapping.g:1377:2: rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5
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
    // InternalRdfMapping.g:1384:1: rule__SourceGroup__Group__4__Impl : ( ( rule__SourceGroup__TypeAssignment_4 ) ) ;
    public final void rule__SourceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1388:1: ( ( ( rule__SourceGroup__TypeAssignment_4 ) ) )
            // InternalRdfMapping.g:1389:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            {
            // InternalRdfMapping.g:1389:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            // InternalRdfMapping.g:1390:2: ( rule__SourceGroup__TypeAssignment_4 )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeAssignment_4()); 
            // InternalRdfMapping.g:1391:2: ( rule__SourceGroup__TypeAssignment_4 )
            // InternalRdfMapping.g:1391:3: rule__SourceGroup__TypeAssignment_4
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
    // InternalRdfMapping.g:1399:1: rule__SourceGroup__Group__5 : rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 ;
    public final void rule__SourceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1403:1: ( rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 )
            // InternalRdfMapping.g:1404:2: rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6
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
    // InternalRdfMapping.g:1411:1: rule__SourceGroup__Group__5__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1415:1: ( ( ';' ) )
            // InternalRdfMapping.g:1416:1: ( ';' )
            {
            // InternalRdfMapping.g:1416:1: ( ';' )
            // InternalRdfMapping.g:1417:2: ';'
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
    // InternalRdfMapping.g:1426:1: rule__SourceGroup__Group__6 : rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 ;
    public final void rule__SourceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1430:1: ( rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 )
            // InternalRdfMapping.g:1431:2: rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7
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
    // InternalRdfMapping.g:1438:1: rule__SourceGroup__Group__6__Impl : ( ( rule__SourceGroup__Group_6__0 )? ) ;
    public final void rule__SourceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1442:1: ( ( ( rule__SourceGroup__Group_6__0 )? ) )
            // InternalRdfMapping.g:1443:1: ( ( rule__SourceGroup__Group_6__0 )? )
            {
            // InternalRdfMapping.g:1443:1: ( ( rule__SourceGroup__Group_6__0 )? )
            // InternalRdfMapping.g:1444:2: ( rule__SourceGroup__Group_6__0 )?
            {
             before(grammarAccess.getSourceGroupAccess().getGroup_6()); 
            // InternalRdfMapping.g:1445:2: ( rule__SourceGroup__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:1445:3: rule__SourceGroup__Group_6__0
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
    // InternalRdfMapping.g:1453:1: rule__SourceGroup__Group__7 : rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 ;
    public final void rule__SourceGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1457:1: ( rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 )
            // InternalRdfMapping.g:1458:2: rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8
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
    // InternalRdfMapping.g:1465:1: rule__SourceGroup__Group__7__Impl : ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) ;
    public final void rule__SourceGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1469:1: ( ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) )
            // InternalRdfMapping.g:1470:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            {
            // InternalRdfMapping.g:1470:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            // InternalRdfMapping.g:1471:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            {
             before(grammarAccess.getSourceGroupAccess().getLogicalSourcesAssignment_7()); 
            // InternalRdfMapping.g:1472:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRdfMapping.g:1472:3: rule__SourceGroup__LogicalSourcesAssignment_7
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
    // InternalRdfMapping.g:1480:1: rule__SourceGroup__Group__8 : rule__SourceGroup__Group__8__Impl ;
    public final void rule__SourceGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1484:1: ( rule__SourceGroup__Group__8__Impl )
            // InternalRdfMapping.g:1485:2: rule__SourceGroup__Group__8__Impl
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
    // InternalRdfMapping.g:1491:1: rule__SourceGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__SourceGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1495:1: ( ( '}' ) )
            // InternalRdfMapping.g:1496:1: ( '}' )
            {
            // InternalRdfMapping.g:1496:1: ( '}' )
            // InternalRdfMapping.g:1497:2: '}'
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
    // InternalRdfMapping.g:1507:1: rule__SourceGroup__Group_6__0 : rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 ;
    public final void rule__SourceGroup__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1511:1: ( rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 )
            // InternalRdfMapping.g:1512:2: rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1
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
    // InternalRdfMapping.g:1519:1: rule__SourceGroup__Group_6__0__Impl : ( 'source' ) ;
    public final void rule__SourceGroup__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1523:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1524:1: ( 'source' )
            {
            // InternalRdfMapping.g:1524:1: ( 'source' )
            // InternalRdfMapping.g:1525:2: 'source'
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
    // InternalRdfMapping.g:1534:1: rule__SourceGroup__Group_6__1 : rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 ;
    public final void rule__SourceGroup__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1538:1: ( rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 )
            // InternalRdfMapping.g:1539:2: rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2
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
    // InternalRdfMapping.g:1546:1: rule__SourceGroup__Group_6__1__Impl : ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) ;
    public final void rule__SourceGroup__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1550:1: ( ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) )
            // InternalRdfMapping.g:1551:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            {
            // InternalRdfMapping.g:1551:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            // InternalRdfMapping.g:1552:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getSourceAssignment_6_1()); 
            // InternalRdfMapping.g:1553:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            // InternalRdfMapping.g:1553:3: rule__SourceGroup__SourceAssignment_6_1
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
    // InternalRdfMapping.g:1561:1: rule__SourceGroup__Group_6__2 : rule__SourceGroup__Group_6__2__Impl ;
    public final void rule__SourceGroup__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1565:1: ( rule__SourceGroup__Group_6__2__Impl )
            // InternalRdfMapping.g:1566:2: rule__SourceGroup__Group_6__2__Impl
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
    // InternalRdfMapping.g:1572:1: rule__SourceGroup__Group_6__2__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1576:1: ( ( ';' ) )
            // InternalRdfMapping.g:1577:1: ( ';' )
            {
            // InternalRdfMapping.g:1577:1: ( ';' )
            // InternalRdfMapping.g:1578:2: ';'
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
    // InternalRdfMapping.g:1588:1: rule__LogicalSource__Group__0 : rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 ;
    public final void rule__LogicalSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1592:1: ( rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 )
            // InternalRdfMapping.g:1593:2: rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1
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
    // InternalRdfMapping.g:1600:1: rule__LogicalSource__Group__0__Impl : ( 'logical-source' ) ;
    public final void rule__LogicalSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1604:1: ( ( 'logical-source' ) )
            // InternalRdfMapping.g:1605:1: ( 'logical-source' )
            {
            // InternalRdfMapping.g:1605:1: ( 'logical-source' )
            // InternalRdfMapping.g:1606:2: 'logical-source'
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
    // InternalRdfMapping.g:1615:1: rule__LogicalSource__Group__1 : rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 ;
    public final void rule__LogicalSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1619:1: ( rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 )
            // InternalRdfMapping.g:1620:2: rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2
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
    // InternalRdfMapping.g:1627:1: rule__LogicalSource__Group__1__Impl : ( ( rule__LogicalSource__NameAssignment_1 ) ) ;
    public final void rule__LogicalSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1631:1: ( ( ( rule__LogicalSource__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1632:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1632:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            // InternalRdfMapping.g:1633:2: ( rule__LogicalSource__NameAssignment_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1634:2: ( rule__LogicalSource__NameAssignment_1 )
            // InternalRdfMapping.g:1634:3: rule__LogicalSource__NameAssignment_1
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
    // InternalRdfMapping.g:1642:1: rule__LogicalSource__Group__2 : rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 ;
    public final void rule__LogicalSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1646:1: ( rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 )
            // InternalRdfMapping.g:1647:2: rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3
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
    // InternalRdfMapping.g:1654:1: rule__LogicalSource__Group__2__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1658:1: ( ( '{' ) )
            // InternalRdfMapping.g:1659:1: ( '{' )
            {
            // InternalRdfMapping.g:1659:1: ( '{' )
            // InternalRdfMapping.g:1660:2: '{'
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
    // InternalRdfMapping.g:1669:1: rule__LogicalSource__Group__3 : rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 ;
    public final void rule__LogicalSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1673:1: ( rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 )
            // InternalRdfMapping.g:1674:2: rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4
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
    // InternalRdfMapping.g:1681:1: rule__LogicalSource__Group__3__Impl : ( ( rule__LogicalSource__Group_3__0 )? ) ;
    public final void rule__LogicalSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1685:1: ( ( ( rule__LogicalSource__Group_3__0 )? ) )
            // InternalRdfMapping.g:1686:1: ( ( rule__LogicalSource__Group_3__0 )? )
            {
            // InternalRdfMapping.g:1686:1: ( ( rule__LogicalSource__Group_3__0 )? )
            // InternalRdfMapping.g:1687:2: ( rule__LogicalSource__Group_3__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_3()); 
            // InternalRdfMapping.g:1688:2: ( rule__LogicalSource__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:1688:3: rule__LogicalSource__Group_3__0
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
    // InternalRdfMapping.g:1696:1: rule__LogicalSource__Group__4 : rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 ;
    public final void rule__LogicalSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1700:1: ( rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 )
            // InternalRdfMapping.g:1701:2: rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5
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
    // InternalRdfMapping.g:1708:1: rule__LogicalSource__Group__4__Impl : ( ( rule__LogicalSource__Group_4__0 )? ) ;
    public final void rule__LogicalSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1712:1: ( ( ( rule__LogicalSource__Group_4__0 )? ) )
            // InternalRdfMapping.g:1713:1: ( ( rule__LogicalSource__Group_4__0 )? )
            {
            // InternalRdfMapping.g:1713:1: ( ( rule__LogicalSource__Group_4__0 )? )
            // InternalRdfMapping.g:1714:2: ( rule__LogicalSource__Group_4__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_4()); 
            // InternalRdfMapping.g:1715:2: ( rule__LogicalSource__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdfMapping.g:1715:3: rule__LogicalSource__Group_4__0
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
    // InternalRdfMapping.g:1723:1: rule__LogicalSource__Group__5 : rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 ;
    public final void rule__LogicalSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1727:1: ( rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 )
            // InternalRdfMapping.g:1728:2: rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6
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
    // InternalRdfMapping.g:1735:1: rule__LogicalSource__Group__5__Impl : ( ( rule__LogicalSource__Group_5__0 )? ) ;
    public final void rule__LogicalSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1739:1: ( ( ( rule__LogicalSource__Group_5__0 )? ) )
            // InternalRdfMapping.g:1740:1: ( ( rule__LogicalSource__Group_5__0 )? )
            {
            // InternalRdfMapping.g:1740:1: ( ( rule__LogicalSource__Group_5__0 )? )
            // InternalRdfMapping.g:1741:2: ( rule__LogicalSource__Group_5__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_5()); 
            // InternalRdfMapping.g:1742:2: ( rule__LogicalSource__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdfMapping.g:1742:3: rule__LogicalSource__Group_5__0
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
    // InternalRdfMapping.g:1750:1: rule__LogicalSource__Group__6 : rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 ;
    public final void rule__LogicalSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1754:1: ( rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 )
            // InternalRdfMapping.g:1755:2: rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7
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
    // InternalRdfMapping.g:1762:1: rule__LogicalSource__Group__6__Impl : ( 'referenceables' ) ;
    public final void rule__LogicalSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1766:1: ( ( 'referenceables' ) )
            // InternalRdfMapping.g:1767:1: ( 'referenceables' )
            {
            // InternalRdfMapping.g:1767:1: ( 'referenceables' )
            // InternalRdfMapping.g:1768:2: 'referenceables'
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
    // InternalRdfMapping.g:1777:1: rule__LogicalSource__Group__7 : rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 ;
    public final void rule__LogicalSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1781:1: ( rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 )
            // InternalRdfMapping.g:1782:2: rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8
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
    // InternalRdfMapping.g:1789:1: rule__LogicalSource__Group__7__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1793:1: ( ( '{' ) )
            // InternalRdfMapping.g:1794:1: ( '{' )
            {
            // InternalRdfMapping.g:1794:1: ( '{' )
            // InternalRdfMapping.g:1795:2: '{'
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
    // InternalRdfMapping.g:1804:1: rule__LogicalSource__Group__8 : rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 ;
    public final void rule__LogicalSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1808:1: ( rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 )
            // InternalRdfMapping.g:1809:2: rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9
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
    // InternalRdfMapping.g:1816:1: rule__LogicalSource__Group__8__Impl : ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) ;
    public final void rule__LogicalSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1820:1: ( ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) )
            // InternalRdfMapping.g:1821:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            {
            // InternalRdfMapping.g:1821:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            // InternalRdfMapping.g:1822:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            {
             before(grammarAccess.getLogicalSourceAccess().getReferencablesAssignment_8()); 
            // InternalRdfMapping.g:1823:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRdfMapping.g:1823:3: rule__LogicalSource__ReferencablesAssignment_8
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
    // InternalRdfMapping.g:1831:1: rule__LogicalSource__Group__9 : rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 ;
    public final void rule__LogicalSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1835:1: ( rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 )
            // InternalRdfMapping.g:1836:2: rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10
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
    // InternalRdfMapping.g:1843:1: rule__LogicalSource__Group__9__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1847:1: ( ( '}' ) )
            // InternalRdfMapping.g:1848:1: ( '}' )
            {
            // InternalRdfMapping.g:1848:1: ( '}' )
            // InternalRdfMapping.g:1849:2: '}'
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
    // InternalRdfMapping.g:1858:1: rule__LogicalSource__Group__10 : rule__LogicalSource__Group__10__Impl ;
    public final void rule__LogicalSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1862:1: ( rule__LogicalSource__Group__10__Impl )
            // InternalRdfMapping.g:1863:2: rule__LogicalSource__Group__10__Impl
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
    // InternalRdfMapping.g:1869:1: rule__LogicalSource__Group__10__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1873:1: ( ( '}' ) )
            // InternalRdfMapping.g:1874:1: ( '}' )
            {
            // InternalRdfMapping.g:1874:1: ( '}' )
            // InternalRdfMapping.g:1875:2: '}'
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
    // InternalRdfMapping.g:1885:1: rule__LogicalSource__Group_3__0 : rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 ;
    public final void rule__LogicalSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1889:1: ( rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 )
            // InternalRdfMapping.g:1890:2: rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1
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
    // InternalRdfMapping.g:1897:1: rule__LogicalSource__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__LogicalSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1901:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1902:1: ( 'type' )
            {
            // InternalRdfMapping.g:1902:1: ( 'type' )
            // InternalRdfMapping.g:1903:2: 'type'
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
    // InternalRdfMapping.g:1912:1: rule__LogicalSource__Group_3__1 : rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 ;
    public final void rule__LogicalSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1916:1: ( rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 )
            // InternalRdfMapping.g:1917:2: rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2
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
    // InternalRdfMapping.g:1924:1: rule__LogicalSource__Group_3__1__Impl : ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) ;
    public final void rule__LogicalSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1928:1: ( ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) )
            // InternalRdfMapping.g:1929:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            {
            // InternalRdfMapping.g:1929:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            // InternalRdfMapping.g:1930:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeAssignment_3_1()); 
            // InternalRdfMapping.g:1931:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            // InternalRdfMapping.g:1931:3: rule__LogicalSource__TypeAssignment_3_1
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
    // InternalRdfMapping.g:1939:1: rule__LogicalSource__Group_3__2 : rule__LogicalSource__Group_3__2__Impl ;
    public final void rule__LogicalSource__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1943:1: ( rule__LogicalSource__Group_3__2__Impl )
            // InternalRdfMapping.g:1944:2: rule__LogicalSource__Group_3__2__Impl
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
    // InternalRdfMapping.g:1950:1: rule__LogicalSource__Group_3__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1954:1: ( ( ';' ) )
            // InternalRdfMapping.g:1955:1: ( ';' )
            {
            // InternalRdfMapping.g:1955:1: ( ';' )
            // InternalRdfMapping.g:1956:2: ';'
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
    // InternalRdfMapping.g:1966:1: rule__LogicalSource__Group_4__0 : rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 ;
    public final void rule__LogicalSource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1970:1: ( rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 )
            // InternalRdfMapping.g:1971:2: rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1
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
    // InternalRdfMapping.g:1978:1: rule__LogicalSource__Group_4__0__Impl : ( 'source' ) ;
    public final void rule__LogicalSource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1982:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1983:1: ( 'source' )
            {
            // InternalRdfMapping.g:1983:1: ( 'source' )
            // InternalRdfMapping.g:1984:2: 'source'
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
    // InternalRdfMapping.g:1993:1: rule__LogicalSource__Group_4__1 : rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 ;
    public final void rule__LogicalSource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1997:1: ( rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 )
            // InternalRdfMapping.g:1998:2: rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2
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
    // InternalRdfMapping.g:2005:1: rule__LogicalSource__Group_4__1__Impl : ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) ;
    public final void rule__LogicalSource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2009:1: ( ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) )
            // InternalRdfMapping.g:2010:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            {
            // InternalRdfMapping.g:2010:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            // InternalRdfMapping.g:2011:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceAssignment_4_1()); 
            // InternalRdfMapping.g:2012:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            // InternalRdfMapping.g:2012:3: rule__LogicalSource__SourceAssignment_4_1
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
    // InternalRdfMapping.g:2020:1: rule__LogicalSource__Group_4__2 : rule__LogicalSource__Group_4__2__Impl ;
    public final void rule__LogicalSource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2024:1: ( rule__LogicalSource__Group_4__2__Impl )
            // InternalRdfMapping.g:2025:2: rule__LogicalSource__Group_4__2__Impl
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
    // InternalRdfMapping.g:2031:1: rule__LogicalSource__Group_4__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2035:1: ( ( ';' ) )
            // InternalRdfMapping.g:2036:1: ( ';' )
            {
            // InternalRdfMapping.g:2036:1: ( ';' )
            // InternalRdfMapping.g:2037:2: ';'
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
    // InternalRdfMapping.g:2047:1: rule__LogicalSource__Group_5__0 : rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 ;
    public final void rule__LogicalSource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2051:1: ( rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 )
            // InternalRdfMapping.g:2052:2: rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1
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
    // InternalRdfMapping.g:2059:1: rule__LogicalSource__Group_5__0__Impl : ( 'iterator' ) ;
    public final void rule__LogicalSource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2063:1: ( ( 'iterator' ) )
            // InternalRdfMapping.g:2064:1: ( 'iterator' )
            {
            // InternalRdfMapping.g:2064:1: ( 'iterator' )
            // InternalRdfMapping.g:2065:2: 'iterator'
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
    // InternalRdfMapping.g:2074:1: rule__LogicalSource__Group_5__1 : rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 ;
    public final void rule__LogicalSource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2078:1: ( rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 )
            // InternalRdfMapping.g:2079:2: rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2
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
    // InternalRdfMapping.g:2086:1: rule__LogicalSource__Group_5__1__Impl : ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) ;
    public final void rule__LogicalSource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2090:1: ( ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) )
            // InternalRdfMapping.g:2091:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            {
            // InternalRdfMapping.g:2091:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            // InternalRdfMapping.g:2092:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorAssignment_5_1()); 
            // InternalRdfMapping.g:2093:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            // InternalRdfMapping.g:2093:3: rule__LogicalSource__IteratorAssignment_5_1
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
    // InternalRdfMapping.g:2101:1: rule__LogicalSource__Group_5__2 : rule__LogicalSource__Group_5__2__Impl ;
    public final void rule__LogicalSource__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2105:1: ( rule__LogicalSource__Group_5__2__Impl )
            // InternalRdfMapping.g:2106:2: rule__LogicalSource__Group_5__2__Impl
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
    // InternalRdfMapping.g:2112:1: rule__LogicalSource__Group_5__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2116:1: ( ( ';' ) )
            // InternalRdfMapping.g:2117:1: ( ';' )
            {
            // InternalRdfMapping.g:2117:1: ( ';' )
            // InternalRdfMapping.g:2118:2: ';'
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
    // InternalRdfMapping.g:2128:1: rule__Referenceable__Group__0 : rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 ;
    public final void rule__Referenceable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2132:1: ( rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 )
            // InternalRdfMapping.g:2133:2: rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1
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
    // InternalRdfMapping.g:2140:1: rule__Referenceable__Group__0__Impl : ( ( rule__Referenceable__NameAssignment_0 ) ) ;
    public final void rule__Referenceable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2144:1: ( ( ( rule__Referenceable__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:2145:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:2145:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            // InternalRdfMapping.g:2146:2: ( rule__Referenceable__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceableAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:2147:2: ( rule__Referenceable__NameAssignment_0 )
            // InternalRdfMapping.g:2147:3: rule__Referenceable__NameAssignment_0
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
    // InternalRdfMapping.g:2155:1: rule__Referenceable__Group__1 : rule__Referenceable__Group__1__Impl ;
    public final void rule__Referenceable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2159:1: ( rule__Referenceable__Group__1__Impl )
            // InternalRdfMapping.g:2160:2: rule__Referenceable__Group__1__Impl
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
    // InternalRdfMapping.g:2166:1: rule__Referenceable__Group__1__Impl : ( ( rule__Referenceable__ValueAssignment_1 )? ) ;
    public final void rule__Referenceable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2170:1: ( ( ( rule__Referenceable__ValueAssignment_1 )? ) )
            // InternalRdfMapping.g:2171:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            {
            // InternalRdfMapping.g:2171:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            // InternalRdfMapping.g:2172:2: ( rule__Referenceable__ValueAssignment_1 )?
            {
             before(grammarAccess.getReferenceableAccess().getValueAssignment_1()); 
            // InternalRdfMapping.g:2173:2: ( rule__Referenceable__ValueAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdfMapping.g:2173:3: rule__Referenceable__ValueAssignment_1
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
    // InternalRdfMapping.g:2182:1: rule__Vocabulary__Group__0 : rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 ;
    public final void rule__Vocabulary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2186:1: ( rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 )
            // InternalRdfMapping.g:2187:2: rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1
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
    // InternalRdfMapping.g:2194:1: rule__Vocabulary__Group__0__Impl : ( 'vocabulary' ) ;
    public final void rule__Vocabulary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2198:1: ( ( 'vocabulary' ) )
            // InternalRdfMapping.g:2199:1: ( 'vocabulary' )
            {
            // InternalRdfMapping.g:2199:1: ( 'vocabulary' )
            // InternalRdfMapping.g:2200:2: 'vocabulary'
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
    // InternalRdfMapping.g:2209:1: rule__Vocabulary__Group__1 : rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 ;
    public final void rule__Vocabulary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2213:1: ( rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 )
            // InternalRdfMapping.g:2214:2: rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2
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
    // InternalRdfMapping.g:2221:1: rule__Vocabulary__Group__1__Impl : ( ( rule__Vocabulary__NameAssignment_1 ) ) ;
    public final void rule__Vocabulary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2225:1: ( ( ( rule__Vocabulary__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2226:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2226:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            // InternalRdfMapping.g:2227:2: ( rule__Vocabulary__NameAssignment_1 )
            {
             before(grammarAccess.getVocabularyAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2228:2: ( rule__Vocabulary__NameAssignment_1 )
            // InternalRdfMapping.g:2228:3: rule__Vocabulary__NameAssignment_1
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
    // InternalRdfMapping.g:2236:1: rule__Vocabulary__Group__2 : rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 ;
    public final void rule__Vocabulary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2240:1: ( rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 )
            // InternalRdfMapping.g:2241:2: rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3
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
    // InternalRdfMapping.g:2248:1: rule__Vocabulary__Group__2__Impl : ( '{' ) ;
    public final void rule__Vocabulary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2252:1: ( ( '{' ) )
            // InternalRdfMapping.g:2253:1: ( '{' )
            {
            // InternalRdfMapping.g:2253:1: ( '{' )
            // InternalRdfMapping.g:2254:2: '{'
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
    // InternalRdfMapping.g:2263:1: rule__Vocabulary__Group__3 : rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 ;
    public final void rule__Vocabulary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2267:1: ( rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 )
            // InternalRdfMapping.g:2268:2: rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4
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
    // InternalRdfMapping.g:2275:1: rule__Vocabulary__Group__3__Impl : ( ( rule__Vocabulary__PrefixAssignment_3 ) ) ;
    public final void rule__Vocabulary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2279:1: ( ( ( rule__Vocabulary__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:2280:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:2280:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:2281:2: ( rule__Vocabulary__PrefixAssignment_3 )
            {
             before(grammarAccess.getVocabularyAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:2282:2: ( rule__Vocabulary__PrefixAssignment_3 )
            // InternalRdfMapping.g:2282:3: rule__Vocabulary__PrefixAssignment_3
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
    // InternalRdfMapping.g:2290:1: rule__Vocabulary__Group__4 : rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 ;
    public final void rule__Vocabulary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2294:1: ( rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 )
            // InternalRdfMapping.g:2295:2: rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5
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
    // InternalRdfMapping.g:2302:1: rule__Vocabulary__Group__4__Impl : ( ( rule__Vocabulary__Group_4__0 )? ) ;
    public final void rule__Vocabulary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2306:1: ( ( ( rule__Vocabulary__Group_4__0 )? ) )
            // InternalRdfMapping.g:2307:1: ( ( rule__Vocabulary__Group_4__0 )? )
            {
            // InternalRdfMapping.g:2307:1: ( ( rule__Vocabulary__Group_4__0 )? )
            // InternalRdfMapping.g:2308:2: ( rule__Vocabulary__Group_4__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_4()); 
            // InternalRdfMapping.g:2309:2: ( rule__Vocabulary__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdfMapping.g:2309:3: rule__Vocabulary__Group_4__0
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
    // InternalRdfMapping.g:2317:1: rule__Vocabulary__Group__5 : rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 ;
    public final void rule__Vocabulary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2321:1: ( rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 )
            // InternalRdfMapping.g:2322:2: rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6
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
    // InternalRdfMapping.g:2329:1: rule__Vocabulary__Group__5__Impl : ( ( rule__Vocabulary__Group_5__0 )? ) ;
    public final void rule__Vocabulary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2333:1: ( ( ( rule__Vocabulary__Group_5__0 )? ) )
            // InternalRdfMapping.g:2334:1: ( ( rule__Vocabulary__Group_5__0 )? )
            {
            // InternalRdfMapping.g:2334:1: ( ( rule__Vocabulary__Group_5__0 )? )
            // InternalRdfMapping.g:2335:2: ( rule__Vocabulary__Group_5__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_5()); 
            // InternalRdfMapping.g:2336:2: ( rule__Vocabulary__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdfMapping.g:2336:3: rule__Vocabulary__Group_5__0
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
    // InternalRdfMapping.g:2344:1: rule__Vocabulary__Group__6 : rule__Vocabulary__Group__6__Impl ;
    public final void rule__Vocabulary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2348:1: ( rule__Vocabulary__Group__6__Impl )
            // InternalRdfMapping.g:2349:2: rule__Vocabulary__Group__6__Impl
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
    // InternalRdfMapping.g:2355:1: rule__Vocabulary__Group__6__Impl : ( '}' ) ;
    public final void rule__Vocabulary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2359:1: ( ( '}' ) )
            // InternalRdfMapping.g:2360:1: ( '}' )
            {
            // InternalRdfMapping.g:2360:1: ( '}' )
            // InternalRdfMapping.g:2361:2: '}'
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
    // InternalRdfMapping.g:2371:1: rule__Vocabulary__Group_4__0 : rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 ;
    public final void rule__Vocabulary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2375:1: ( rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 )
            // InternalRdfMapping.g:2376:2: rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1
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
    // InternalRdfMapping.g:2383:1: rule__Vocabulary__Group_4__0__Impl : ( 'classes' ) ;
    public final void rule__Vocabulary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2387:1: ( ( 'classes' ) )
            // InternalRdfMapping.g:2388:1: ( 'classes' )
            {
            // InternalRdfMapping.g:2388:1: ( 'classes' )
            // InternalRdfMapping.g:2389:2: 'classes'
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
    // InternalRdfMapping.g:2398:1: rule__Vocabulary__Group_4__1 : rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 ;
    public final void rule__Vocabulary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2402:1: ( rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 )
            // InternalRdfMapping.g:2403:2: rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2
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
    // InternalRdfMapping.g:2410:1: rule__Vocabulary__Group_4__1__Impl : ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) ;
    public final void rule__Vocabulary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2414:1: ( ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) )
            // InternalRdfMapping.g:2415:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            {
            // InternalRdfMapping.g:2415:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            // InternalRdfMapping.g:2416:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getClassesAssignment_4_1()); 
            // InternalRdfMapping.g:2417:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRdfMapping.g:2417:3: rule__Vocabulary__ClassesAssignment_4_1
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
    // InternalRdfMapping.g:2425:1: rule__Vocabulary__Group_4__2 : rule__Vocabulary__Group_4__2__Impl ;
    public final void rule__Vocabulary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2429:1: ( rule__Vocabulary__Group_4__2__Impl )
            // InternalRdfMapping.g:2430:2: rule__Vocabulary__Group_4__2__Impl
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
    // InternalRdfMapping.g:2436:1: rule__Vocabulary__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2440:1: ( ( ';' ) )
            // InternalRdfMapping.g:2441:1: ( ';' )
            {
            // InternalRdfMapping.g:2441:1: ( ';' )
            // InternalRdfMapping.g:2442:2: ';'
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
    // InternalRdfMapping.g:2452:1: rule__Vocabulary__Group_5__0 : rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 ;
    public final void rule__Vocabulary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2456:1: ( rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 )
            // InternalRdfMapping.g:2457:2: rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1
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
    // InternalRdfMapping.g:2464:1: rule__Vocabulary__Group_5__0__Impl : ( 'properties' ) ;
    public final void rule__Vocabulary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2468:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:2469:1: ( 'properties' )
            {
            // InternalRdfMapping.g:2469:1: ( 'properties' )
            // InternalRdfMapping.g:2470:2: 'properties'
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
    // InternalRdfMapping.g:2479:1: rule__Vocabulary__Group_5__1 : rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 ;
    public final void rule__Vocabulary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2483:1: ( rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 )
            // InternalRdfMapping.g:2484:2: rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2
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
    // InternalRdfMapping.g:2491:1: rule__Vocabulary__Group_5__1__Impl : ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) ;
    public final void rule__Vocabulary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2495:1: ( ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) )
            // InternalRdfMapping.g:2496:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            {
            // InternalRdfMapping.g:2496:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            // InternalRdfMapping.g:2497:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesAssignment_5_1()); 
            // InternalRdfMapping.g:2498:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRdfMapping.g:2498:3: rule__Vocabulary__PropertiesAssignment_5_1
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
    // InternalRdfMapping.g:2506:1: rule__Vocabulary__Group_5__2 : rule__Vocabulary__Group_5__2__Impl ;
    public final void rule__Vocabulary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2510:1: ( rule__Vocabulary__Group_5__2__Impl )
            // InternalRdfMapping.g:2511:2: rule__Vocabulary__Group_5__2__Impl
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
    // InternalRdfMapping.g:2517:1: rule__Vocabulary__Group_5__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2521:1: ( ( ';' ) )
            // InternalRdfMapping.g:2522:1: ( ';' )
            {
            // InternalRdfMapping.g:2522:1: ( ';' )
            // InternalRdfMapping.g:2523:2: ';'
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
    // InternalRdfMapping.g:2533:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2537:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalRdfMapping.g:2538:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
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
    // InternalRdfMapping.g:2545:1: rule__Prefix__Group__0__Impl : ( 'prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2549:1: ( ( 'prefix' ) )
            // InternalRdfMapping.g:2550:1: ( 'prefix' )
            {
            // InternalRdfMapping.g:2550:1: ( 'prefix' )
            // InternalRdfMapping.g:2551:2: 'prefix'
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
    // InternalRdfMapping.g:2560:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2564:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalRdfMapping.g:2565:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
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
    // InternalRdfMapping.g:2572:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__LabelAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2576:1: ( ( ( rule__Prefix__LabelAssignment_1 ) ) )
            // InternalRdfMapping.g:2577:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            {
            // InternalRdfMapping.g:2577:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            // InternalRdfMapping.g:2578:2: ( rule__Prefix__LabelAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getLabelAssignment_1()); 
            // InternalRdfMapping.g:2579:2: ( rule__Prefix__LabelAssignment_1 )
            // InternalRdfMapping.g:2579:3: rule__Prefix__LabelAssignment_1
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
    // InternalRdfMapping.g:2587:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl rule__Prefix__Group__3 ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2591:1: ( rule__Prefix__Group__2__Impl rule__Prefix__Group__3 )
            // InternalRdfMapping.g:2592:2: rule__Prefix__Group__2__Impl rule__Prefix__Group__3
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
    // InternalRdfMapping.g:2599:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__IriAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2603:1: ( ( ( rule__Prefix__IriAssignment_2 ) ) )
            // InternalRdfMapping.g:2604:1: ( ( rule__Prefix__IriAssignment_2 ) )
            {
            // InternalRdfMapping.g:2604:1: ( ( rule__Prefix__IriAssignment_2 ) )
            // InternalRdfMapping.g:2605:2: ( rule__Prefix__IriAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getIriAssignment_2()); 
            // InternalRdfMapping.g:2606:2: ( rule__Prefix__IriAssignment_2 )
            // InternalRdfMapping.g:2606:3: rule__Prefix__IriAssignment_2
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
    // InternalRdfMapping.g:2614:1: rule__Prefix__Group__3 : rule__Prefix__Group__3__Impl ;
    public final void rule__Prefix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2618:1: ( rule__Prefix__Group__3__Impl )
            // InternalRdfMapping.g:2619:2: rule__Prefix__Group__3__Impl
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
    // InternalRdfMapping.g:2625:1: rule__Prefix__Group__3__Impl : ( ';' ) ;
    public final void rule__Prefix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2629:1: ( ( ';' ) )
            // InternalRdfMapping.g:2630:1: ( ';' )
            {
            // InternalRdfMapping.g:2630:1: ( ';' )
            // InternalRdfMapping.g:2631:2: ';'
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
    // InternalRdfMapping.g:2641:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2645:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalRdfMapping.g:2646:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
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
    // InternalRdfMapping.g:2653:1: rule__Mapping__Group__0__Impl : ( 'map' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2657:1: ( ( 'map' ) )
            // InternalRdfMapping.g:2658:1: ( 'map' )
            {
            // InternalRdfMapping.g:2658:1: ( 'map' )
            // InternalRdfMapping.g:2659:2: 'map'
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
    // InternalRdfMapping.g:2668:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2672:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalRdfMapping.g:2673:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
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
    // InternalRdfMapping.g:2680:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2684:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2685:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2685:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // InternalRdfMapping.g:2686:2: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2687:2: ( rule__Mapping__NameAssignment_1 )
            // InternalRdfMapping.g:2687:3: rule__Mapping__NameAssignment_1
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
    // InternalRdfMapping.g:2695:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2699:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalRdfMapping.g:2700:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
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
    // InternalRdfMapping.g:2707:1: rule__Mapping__Group__2__Impl : ( 'from' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2711:1: ( ( 'from' ) )
            // InternalRdfMapping.g:2712:1: ( 'from' )
            {
            // InternalRdfMapping.g:2712:1: ( 'from' )
            // InternalRdfMapping.g:2713:2: 'from'
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
    // InternalRdfMapping.g:2722:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2726:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalRdfMapping.g:2727:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
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
    // InternalRdfMapping.g:2734:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__SourceAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2738:1: ( ( ( rule__Mapping__SourceAssignment_3 ) ) )
            // InternalRdfMapping.g:2739:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            {
            // InternalRdfMapping.g:2739:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            // InternalRdfMapping.g:2740:2: ( rule__Mapping__SourceAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getSourceAssignment_3()); 
            // InternalRdfMapping.g:2741:2: ( rule__Mapping__SourceAssignment_3 )
            // InternalRdfMapping.g:2741:3: rule__Mapping__SourceAssignment_3
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
    // InternalRdfMapping.g:2749:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2753:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalRdfMapping.g:2754:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
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
    // InternalRdfMapping.g:2761:1: rule__Mapping__Group__4__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2765:1: ( ( '{' ) )
            // InternalRdfMapping.g:2766:1: ( '{' )
            {
            // InternalRdfMapping.g:2766:1: ( '{' )
            // InternalRdfMapping.g:2767:2: '{'
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
    // InternalRdfMapping.g:2776:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2780:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalRdfMapping.g:2781:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
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
    // InternalRdfMapping.g:2788:1: rule__Mapping__Group__5__Impl : ( 'subject' ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2792:1: ( ( 'subject' ) )
            // InternalRdfMapping.g:2793:1: ( 'subject' )
            {
            // InternalRdfMapping.g:2793:1: ( 'subject' )
            // InternalRdfMapping.g:2794:2: 'subject'
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
    // InternalRdfMapping.g:2803:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2807:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalRdfMapping.g:2808:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
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
    // InternalRdfMapping.g:2815:1: rule__Mapping__Group__6__Impl : ( 'template' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2819:1: ( ( 'template' ) )
            // InternalRdfMapping.g:2820:1: ( 'template' )
            {
            // InternalRdfMapping.g:2820:1: ( 'template' )
            // InternalRdfMapping.g:2821:2: 'template'
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
    // InternalRdfMapping.g:2830:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl rule__Mapping__Group__8 ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2834:1: ( rule__Mapping__Group__7__Impl rule__Mapping__Group__8 )
            // InternalRdfMapping.g:2835:2: rule__Mapping__Group__7__Impl rule__Mapping__Group__8
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
    // InternalRdfMapping.g:2842:1: rule__Mapping__Group__7__Impl : ( ( rule__Mapping__PatternAssignment_7 ) ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2846:1: ( ( ( rule__Mapping__PatternAssignment_7 ) ) )
            // InternalRdfMapping.g:2847:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            {
            // InternalRdfMapping.g:2847:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            // InternalRdfMapping.g:2848:2: ( rule__Mapping__PatternAssignment_7 )
            {
             before(grammarAccess.getMappingAccess().getPatternAssignment_7()); 
            // InternalRdfMapping.g:2849:2: ( rule__Mapping__PatternAssignment_7 )
            // InternalRdfMapping.g:2849:3: rule__Mapping__PatternAssignment_7
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
    // InternalRdfMapping.g:2857:1: rule__Mapping__Group__8 : rule__Mapping__Group__8__Impl rule__Mapping__Group__9 ;
    public final void rule__Mapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2861:1: ( rule__Mapping__Group__8__Impl rule__Mapping__Group__9 )
            // InternalRdfMapping.g:2862:2: rule__Mapping__Group__8__Impl rule__Mapping__Group__9
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
    // InternalRdfMapping.g:2869:1: rule__Mapping__Group__8__Impl : ( 'with' ) ;
    public final void rule__Mapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2873:1: ( ( 'with' ) )
            // InternalRdfMapping.g:2874:1: ( 'with' )
            {
            // InternalRdfMapping.g:2874:1: ( 'with' )
            // InternalRdfMapping.g:2875:2: 'with'
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
    // InternalRdfMapping.g:2884:1: rule__Mapping__Group__9 : rule__Mapping__Group__9__Impl rule__Mapping__Group__10 ;
    public final void rule__Mapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2888:1: ( rule__Mapping__Group__9__Impl rule__Mapping__Group__10 )
            // InternalRdfMapping.g:2889:2: rule__Mapping__Group__9__Impl rule__Mapping__Group__10
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
    // InternalRdfMapping.g:2896:1: rule__Mapping__Group__9__Impl : ( ( rule__Mapping__ReferenceAssignment_9 ) ) ;
    public final void rule__Mapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2900:1: ( ( ( rule__Mapping__ReferenceAssignment_9 ) ) )
            // InternalRdfMapping.g:2901:1: ( ( rule__Mapping__ReferenceAssignment_9 ) )
            {
            // InternalRdfMapping.g:2901:1: ( ( rule__Mapping__ReferenceAssignment_9 ) )
            // InternalRdfMapping.g:2902:2: ( rule__Mapping__ReferenceAssignment_9 )
            {
             before(grammarAccess.getMappingAccess().getReferenceAssignment_9()); 
            // InternalRdfMapping.g:2903:2: ( rule__Mapping__ReferenceAssignment_9 )
            // InternalRdfMapping.g:2903:3: rule__Mapping__ReferenceAssignment_9
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
    // InternalRdfMapping.g:2911:1: rule__Mapping__Group__10 : rule__Mapping__Group__10__Impl rule__Mapping__Group__11 ;
    public final void rule__Mapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2915:1: ( rule__Mapping__Group__10__Impl rule__Mapping__Group__11 )
            // InternalRdfMapping.g:2916:2: rule__Mapping__Group__10__Impl rule__Mapping__Group__11
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
    // InternalRdfMapping.g:2923:1: rule__Mapping__Group__10__Impl : ( ( rule__Mapping__Group_10__0 )? ) ;
    public final void rule__Mapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2927:1: ( ( ( rule__Mapping__Group_10__0 )? ) )
            // InternalRdfMapping.g:2928:1: ( ( rule__Mapping__Group_10__0 )? )
            {
            // InternalRdfMapping.g:2928:1: ( ( rule__Mapping__Group_10__0 )? )
            // InternalRdfMapping.g:2929:2: ( rule__Mapping__Group_10__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_10()); 
            // InternalRdfMapping.g:2930:2: ( rule__Mapping__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRdfMapping.g:2930:3: rule__Mapping__Group_10__0
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
    // InternalRdfMapping.g:2938:1: rule__Mapping__Group__11 : rule__Mapping__Group__11__Impl rule__Mapping__Group__12 ;
    public final void rule__Mapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2942:1: ( rule__Mapping__Group__11__Impl rule__Mapping__Group__12 )
            // InternalRdfMapping.g:2943:2: rule__Mapping__Group__11__Impl rule__Mapping__Group__12
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
    // InternalRdfMapping.g:2950:1: rule__Mapping__Group__11__Impl : ( ( rule__Mapping__Group_11__0 )? ) ;
    public final void rule__Mapping__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2954:1: ( ( ( rule__Mapping__Group_11__0 )? ) )
            // InternalRdfMapping.g:2955:1: ( ( rule__Mapping__Group_11__0 )? )
            {
            // InternalRdfMapping.g:2955:1: ( ( rule__Mapping__Group_11__0 )? )
            // InternalRdfMapping.g:2956:2: ( rule__Mapping__Group_11__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_11()); 
            // InternalRdfMapping.g:2957:2: ( rule__Mapping__Group_11__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdfMapping.g:2957:3: rule__Mapping__Group_11__0
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
    // InternalRdfMapping.g:2965:1: rule__Mapping__Group__12 : rule__Mapping__Group__12__Impl ;
    public final void rule__Mapping__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2969:1: ( rule__Mapping__Group__12__Impl )
            // InternalRdfMapping.g:2970:2: rule__Mapping__Group__12__Impl
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
    // InternalRdfMapping.g:2976:1: rule__Mapping__Group__12__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2980:1: ( ( '}' ) )
            // InternalRdfMapping.g:2981:1: ( '}' )
            {
            // InternalRdfMapping.g:2981:1: ( '}' )
            // InternalRdfMapping.g:2982:2: '}'
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
    // InternalRdfMapping.g:2992:1: rule__Mapping__Group_10__0 : rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 ;
    public final void rule__Mapping__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2996:1: ( rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 )
            // InternalRdfMapping.g:2997:2: rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1
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
    // InternalRdfMapping.g:3004:1: rule__Mapping__Group_10__0__Impl : ( 'types' ) ;
    public final void rule__Mapping__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3008:1: ( ( 'types' ) )
            // InternalRdfMapping.g:3009:1: ( 'types' )
            {
            // InternalRdfMapping.g:3009:1: ( 'types' )
            // InternalRdfMapping.g:3010:2: 'types'
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
    // InternalRdfMapping.g:3019:1: rule__Mapping__Group_10__1 : rule__Mapping__Group_10__1__Impl ;
    public final void rule__Mapping__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3023:1: ( rule__Mapping__Group_10__1__Impl )
            // InternalRdfMapping.g:3024:2: rule__Mapping__Group_10__1__Impl
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
    // InternalRdfMapping.g:3030:1: rule__Mapping__Group_10__1__Impl : ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) ;
    public final void rule__Mapping__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3034:1: ( ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) )
            // InternalRdfMapping.g:3035:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            {
            // InternalRdfMapping.g:3035:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            // InternalRdfMapping.g:3036:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            {
            // InternalRdfMapping.g:3036:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) )
            // InternalRdfMapping.g:3037:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:3038:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            // InternalRdfMapping.g:3038:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 

            }

            // InternalRdfMapping.g:3041:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            // InternalRdfMapping.g:3042:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:3043:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRdfMapping.g:3043:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRdfMapping.g:3053:1: rule__Mapping__Group_11__0 : rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 ;
    public final void rule__Mapping__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3057:1: ( rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 )
            // InternalRdfMapping.g:3058:2: rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1
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
    // InternalRdfMapping.g:3065:1: rule__Mapping__Group_11__0__Impl : ( 'properties' ) ;
    public final void rule__Mapping__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3069:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:3070:1: ( 'properties' )
            {
            // InternalRdfMapping.g:3070:1: ( 'properties' )
            // InternalRdfMapping.g:3071:2: 'properties'
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
    // InternalRdfMapping.g:3080:1: rule__Mapping__Group_11__1 : rule__Mapping__Group_11__1__Impl ;
    public final void rule__Mapping__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3084:1: ( rule__Mapping__Group_11__1__Impl )
            // InternalRdfMapping.g:3085:2: rule__Mapping__Group_11__1__Impl
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
    // InternalRdfMapping.g:3091:1: rule__Mapping__Group_11__1__Impl : ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) ;
    public final void rule__Mapping__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3095:1: ( ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) )
            // InternalRdfMapping.g:3096:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            {
            // InternalRdfMapping.g:3096:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            // InternalRdfMapping.g:3097:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            {
            // InternalRdfMapping.g:3097:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) )
            // InternalRdfMapping.g:3098:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:3099:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            // InternalRdfMapping.g:3099:4: rule__Mapping__PoMappingsAssignment_11_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__PoMappingsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 

            }

            // InternalRdfMapping.g:3102:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            // InternalRdfMapping.g:3103:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:3104:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRdfMapping.g:3104:4: rule__Mapping__PoMappingsAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__PoMappingsAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRdfMapping.g:3114:1: rule__PredicateObjectMapping__Group__0 : rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 ;
    public final void rule__PredicateObjectMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3118:1: ( rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 )
            // InternalRdfMapping.g:3119:2: rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1
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
    // InternalRdfMapping.g:3126:1: rule__PredicateObjectMapping__Group__0__Impl : ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) ;
    public final void rule__PredicateObjectMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3130:1: ( ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) )
            // InternalRdfMapping.g:3131:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            {
            // InternalRdfMapping.g:3131:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            // InternalRdfMapping.g:3132:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyAssignment_0()); 
            // InternalRdfMapping.g:3133:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            // InternalRdfMapping.g:3133:3: rule__PredicateObjectMapping__PropertyAssignment_0
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
    // InternalRdfMapping.g:3141:1: rule__PredicateObjectMapping__Group__1 : rule__PredicateObjectMapping__Group__1__Impl ;
    public final void rule__PredicateObjectMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3145:1: ( rule__PredicateObjectMapping__Group__1__Impl )
            // InternalRdfMapping.g:3146:2: rule__PredicateObjectMapping__Group__1__Impl
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
    // InternalRdfMapping.g:3152:1: rule__PredicateObjectMapping__Group__1__Impl : ( ( rule__PredicateObjectMapping__TermAssignment_1 ) ) ;
    public final void rule__PredicateObjectMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3156:1: ( ( ( rule__PredicateObjectMapping__TermAssignment_1 ) ) )
            // InternalRdfMapping.g:3157:1: ( ( rule__PredicateObjectMapping__TermAssignment_1 ) )
            {
            // InternalRdfMapping.g:3157:1: ( ( rule__PredicateObjectMapping__TermAssignment_1 ) )
            // InternalRdfMapping.g:3158:2: ( rule__PredicateObjectMapping__TermAssignment_1 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getTermAssignment_1()); 
            // InternalRdfMapping.g:3159:2: ( rule__PredicateObjectMapping__TermAssignment_1 )
            // InternalRdfMapping.g:3159:3: rule__PredicateObjectMapping__TermAssignment_1
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
    // InternalRdfMapping.g:3168:1: rule__ReferenceValuedTerm__Group__0 : rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1 ;
    public final void rule__ReferenceValuedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3172:1: ( rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1 )
            // InternalRdfMapping.g:3173:2: rule__ReferenceValuedTerm__Group__0__Impl rule__ReferenceValuedTerm__Group__1
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
    // InternalRdfMapping.g:3180:1: rule__ReferenceValuedTerm__Group__0__Impl : ( 'from' ) ;
    public final void rule__ReferenceValuedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3184:1: ( ( 'from' ) )
            // InternalRdfMapping.g:3185:1: ( 'from' )
            {
            // InternalRdfMapping.g:3185:1: ( 'from' )
            // InternalRdfMapping.g:3186:2: 'from'
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
    // InternalRdfMapping.g:3195:1: rule__ReferenceValuedTerm__Group__1 : rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2 ;
    public final void rule__ReferenceValuedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3199:1: ( rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2 )
            // InternalRdfMapping.g:3200:2: rule__ReferenceValuedTerm__Group__1__Impl rule__ReferenceValuedTerm__Group__2
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
    // InternalRdfMapping.g:3207:1: rule__ReferenceValuedTerm__Group__1__Impl : ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceValuedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3211:1: ( ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) ) )
            // InternalRdfMapping.g:3212:1: ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) )
            {
            // InternalRdfMapping.g:3212:1: ( ( rule__ReferenceValuedTerm__ReferenceAssignment_1 ) )
            // InternalRdfMapping.g:3213:2: ( rule__ReferenceValuedTerm__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceAssignment_1()); 
            // InternalRdfMapping.g:3214:2: ( rule__ReferenceValuedTerm__ReferenceAssignment_1 )
            // InternalRdfMapping.g:3214:3: rule__ReferenceValuedTerm__ReferenceAssignment_1
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
    // InternalRdfMapping.g:3222:1: rule__ReferenceValuedTerm__Group__2 : rule__ReferenceValuedTerm__Group__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3226:1: ( rule__ReferenceValuedTerm__Group__2__Impl )
            // InternalRdfMapping.g:3227:2: rule__ReferenceValuedTerm__Group__2__Impl
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
    // InternalRdfMapping.g:3233:1: rule__ReferenceValuedTerm__Group__2__Impl : ( ( rule__ReferenceValuedTerm__Alternatives_2 )? ) ;
    public final void rule__ReferenceValuedTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3237:1: ( ( ( rule__ReferenceValuedTerm__Alternatives_2 )? ) )
            // InternalRdfMapping.g:3238:1: ( ( rule__ReferenceValuedTerm__Alternatives_2 )? )
            {
            // InternalRdfMapping.g:3238:1: ( ( rule__ReferenceValuedTerm__Alternatives_2 )? )
            // InternalRdfMapping.g:3239:2: ( rule__ReferenceValuedTerm__Alternatives_2 )?
            {
             before(grammarAccess.getReferenceValuedTermAccess().getAlternatives_2()); 
            // InternalRdfMapping.g:3240:2: ( rule__ReferenceValuedTerm__Alternatives_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRdfMapping.g:3240:3: rule__ReferenceValuedTerm__Alternatives_2
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
    // InternalRdfMapping.g:3249:1: rule__ReferenceValuedTerm__Group_2_0__0 : rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1 ;
    public final void rule__ReferenceValuedTerm__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3253:1: ( rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1 )
            // InternalRdfMapping.g:3254:2: rule__ReferenceValuedTerm__Group_2_0__0__Impl rule__ReferenceValuedTerm__Group_2_0__1
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
    // InternalRdfMapping.g:3261:1: rule__ReferenceValuedTerm__Group_2_0__0__Impl : ( 'with' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3265:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3266:1: ( 'with' )
            {
            // InternalRdfMapping.g:3266:1: ( 'with' )
            // InternalRdfMapping.g:3267:2: 'with'
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
    // InternalRdfMapping.g:3276:1: rule__ReferenceValuedTerm__Group_2_0__1 : rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2 ;
    public final void rule__ReferenceValuedTerm__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3280:1: ( rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2 )
            // InternalRdfMapping.g:3281:2: rule__ReferenceValuedTerm__Group_2_0__1__Impl rule__ReferenceValuedTerm__Group_2_0__2
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
    // InternalRdfMapping.g:3288:1: rule__ReferenceValuedTerm__Group_2_0__1__Impl : ( 'datatype' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3292:1: ( ( 'datatype' ) )
            // InternalRdfMapping.g:3293:1: ( 'datatype' )
            {
            // InternalRdfMapping.g:3293:1: ( 'datatype' )
            // InternalRdfMapping.g:3294:2: 'datatype'
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
    // InternalRdfMapping.g:3303:1: rule__ReferenceValuedTerm__Group_2_0__2 : rule__ReferenceValuedTerm__Group_2_0__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3307:1: ( rule__ReferenceValuedTerm__Group_2_0__2__Impl )
            // InternalRdfMapping.g:3308:2: rule__ReferenceValuedTerm__Group_2_0__2__Impl
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
    // InternalRdfMapping.g:3314:1: rule__ReferenceValuedTerm__Group_2_0__2__Impl : ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) ) ;
    public final void rule__ReferenceValuedTerm__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3318:1: ( ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) ) )
            // InternalRdfMapping.g:3319:1: ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) )
            {
            // InternalRdfMapping.g:3319:1: ( ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 ) )
            // InternalRdfMapping.g:3320:2: ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeAssignment_2_0_2()); 
            // InternalRdfMapping.g:3321:2: ( rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 )
            // InternalRdfMapping.g:3321:3: rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2
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
    // InternalRdfMapping.g:3330:1: rule__ReferenceValuedTerm__Group_2_1__0 : rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1 ;
    public final void rule__ReferenceValuedTerm__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3334:1: ( rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1 )
            // InternalRdfMapping.g:3335:2: rule__ReferenceValuedTerm__Group_2_1__0__Impl rule__ReferenceValuedTerm__Group_2_1__1
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
    // InternalRdfMapping.g:3342:1: rule__ReferenceValuedTerm__Group_2_1__0__Impl : ( 'with' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3346:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3347:1: ( 'with' )
            {
            // InternalRdfMapping.g:3347:1: ( 'with' )
            // InternalRdfMapping.g:3348:2: 'with'
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
    // InternalRdfMapping.g:3357:1: rule__ReferenceValuedTerm__Group_2_1__1 : rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2 ;
    public final void rule__ReferenceValuedTerm__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3361:1: ( rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2 )
            // InternalRdfMapping.g:3362:2: rule__ReferenceValuedTerm__Group_2_1__1__Impl rule__ReferenceValuedTerm__Group_2_1__2
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
    // InternalRdfMapping.g:3369:1: rule__ReferenceValuedTerm__Group_2_1__1__Impl : ( 'language-tag' ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3373:1: ( ( 'language-tag' ) )
            // InternalRdfMapping.g:3374:1: ( 'language-tag' )
            {
            // InternalRdfMapping.g:3374:1: ( 'language-tag' )
            // InternalRdfMapping.g:3375:2: 'language-tag'
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
    // InternalRdfMapping.g:3384:1: rule__ReferenceValuedTerm__Group_2_1__2 : rule__ReferenceValuedTerm__Group_2_1__2__Impl ;
    public final void rule__ReferenceValuedTerm__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3388:1: ( rule__ReferenceValuedTerm__Group_2_1__2__Impl )
            // InternalRdfMapping.g:3389:2: rule__ReferenceValuedTerm__Group_2_1__2__Impl
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
    // InternalRdfMapping.g:3395:1: rule__ReferenceValuedTerm__Group_2_1__2__Impl : ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) ) ;
    public final void rule__ReferenceValuedTerm__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3399:1: ( ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) ) )
            // InternalRdfMapping.g:3400:1: ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) )
            {
            // InternalRdfMapping.g:3400:1: ( ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 ) )
            // InternalRdfMapping.g:3401:2: ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagAssignment_2_1_2()); 
            // InternalRdfMapping.g:3402:2: ( rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 )
            // InternalRdfMapping.g:3402:3: rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2
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
    // InternalRdfMapping.g:3411:1: rule__TemplateValuedTerm__Group__0 : rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1 ;
    public final void rule__TemplateValuedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3415:1: ( rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1 )
            // InternalRdfMapping.g:3416:2: rule__TemplateValuedTerm__Group__0__Impl rule__TemplateValuedTerm__Group__1
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
    // InternalRdfMapping.g:3423:1: rule__TemplateValuedTerm__Group__0__Impl : ( 'template' ) ;
    public final void rule__TemplateValuedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3427:1: ( ( 'template' ) )
            // InternalRdfMapping.g:3428:1: ( 'template' )
            {
            // InternalRdfMapping.g:3428:1: ( 'template' )
            // InternalRdfMapping.g:3429:2: 'template'
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
    // InternalRdfMapping.g:3438:1: rule__TemplateValuedTerm__Group__1 : rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2 ;
    public final void rule__TemplateValuedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3442:1: ( rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2 )
            // InternalRdfMapping.g:3443:2: rule__TemplateValuedTerm__Group__1__Impl rule__TemplateValuedTerm__Group__2
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
    // InternalRdfMapping.g:3450:1: rule__TemplateValuedTerm__Group__1__Impl : ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) ) ;
    public final void rule__TemplateValuedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3454:1: ( ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) ) )
            // InternalRdfMapping.g:3455:1: ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) )
            {
            // InternalRdfMapping.g:3455:1: ( ( rule__TemplateValuedTerm__PatternAssignment_1 ) )
            // InternalRdfMapping.g:3456:2: ( rule__TemplateValuedTerm__PatternAssignment_1 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getPatternAssignment_1()); 
            // InternalRdfMapping.g:3457:2: ( rule__TemplateValuedTerm__PatternAssignment_1 )
            // InternalRdfMapping.g:3457:3: rule__TemplateValuedTerm__PatternAssignment_1
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
    // InternalRdfMapping.g:3465:1: rule__TemplateValuedTerm__Group__2 : rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3 ;
    public final void rule__TemplateValuedTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3469:1: ( rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3 )
            // InternalRdfMapping.g:3470:2: rule__TemplateValuedTerm__Group__2__Impl rule__TemplateValuedTerm__Group__3
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
    // InternalRdfMapping.g:3477:1: rule__TemplateValuedTerm__Group__2__Impl : ( 'with' ) ;
    public final void rule__TemplateValuedTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3481:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3482:1: ( 'with' )
            {
            // InternalRdfMapping.g:3482:1: ( 'with' )
            // InternalRdfMapping.g:3483:2: 'with'
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
    // InternalRdfMapping.g:3492:1: rule__TemplateValuedTerm__Group__3 : rule__TemplateValuedTerm__Group__3__Impl ;
    public final void rule__TemplateValuedTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3496:1: ( rule__TemplateValuedTerm__Group__3__Impl )
            // InternalRdfMapping.g:3497:2: rule__TemplateValuedTerm__Group__3__Impl
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
    // InternalRdfMapping.g:3503:1: rule__TemplateValuedTerm__Group__3__Impl : ( ( rule__TemplateValuedTerm__ReferenceAssignment_3 ) ) ;
    public final void rule__TemplateValuedTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3507:1: ( ( ( rule__TemplateValuedTerm__ReferenceAssignment_3 ) ) )
            // InternalRdfMapping.g:3508:1: ( ( rule__TemplateValuedTerm__ReferenceAssignment_3 ) )
            {
            // InternalRdfMapping.g:3508:1: ( ( rule__TemplateValuedTerm__ReferenceAssignment_3 ) )
            // InternalRdfMapping.g:3509:2: ( rule__TemplateValuedTerm__ReferenceAssignment_3 )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferenceAssignment_3()); 
            // InternalRdfMapping.g:3510:2: ( rule__TemplateValuedTerm__ReferenceAssignment_3 )
            // InternalRdfMapping.g:3510:3: rule__TemplateValuedTerm__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TemplateValuedTerm__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTemplateValuedTermAccess().getReferenceAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalRdfMapping.g:3519:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3523:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRdfMapping.g:3524:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalRdfMapping.g:3531:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3535:1: ( ( 'import' ) )
            // InternalRdfMapping.g:3536:1: ( 'import' )
            {
            // InternalRdfMapping.g:3536:1: ( 'import' )
            // InternalRdfMapping.g:3537:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRdfMapping.g:3546:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3550:1: ( rule__Import__Group__1__Impl )
            // InternalRdfMapping.g:3551:2: rule__Import__Group__1__Impl
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
    // InternalRdfMapping.g:3557:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3561:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRdfMapping.g:3562:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRdfMapping.g:3562:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRdfMapping.g:3563:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalRdfMapping.g:3564:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRdfMapping.g:3564:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalRdfMapping.g:3573:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3577:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRdfMapping.g:3578:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalRdfMapping.g:3585:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3589:1: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3590:1: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:3590:1: ( ruleQualifiedName )
            // InternalRdfMapping.g:3591:2: ruleQualifiedName
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
    // InternalRdfMapping.g:3600:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3604:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRdfMapping.g:3605:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRdfMapping.g:3611:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3615:1: ( ( ( '.*' )? ) )
            // InternalRdfMapping.g:3616:1: ( ( '.*' )? )
            {
            // InternalRdfMapping.g:3616:1: ( ( '.*' )? )
            // InternalRdfMapping.g:3617:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRdfMapping.g:3618:2: ( '.*' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRdfMapping.g:3618:3: '.*'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalRdfMapping.g:3627:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3631:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRdfMapping.g:3632:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalRdfMapping.g:3639:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3643:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3644:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3644:1: ( RULE_ID )
            // InternalRdfMapping.g:3645:2: RULE_ID
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
    // InternalRdfMapping.g:3654:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3658:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRdfMapping.g:3659:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRdfMapping.g:3665:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3669:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRdfMapping.g:3670:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRdfMapping.g:3670:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRdfMapping.g:3671:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRdfMapping.g:3672:2: ( rule__QualifiedName__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRdfMapping.g:3672:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRdfMapping.g:3681:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3685:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRdfMapping.g:3686:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalRdfMapping.g:3693:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3697:1: ( ( '.' ) )
            // InternalRdfMapping.g:3698:1: ( '.' )
            {
            // InternalRdfMapping.g:3698:1: ( '.' )
            // InternalRdfMapping.g:3699:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRdfMapping.g:3708:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3712:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRdfMapping.g:3713:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRdfMapping.g:3719:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3723:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3724:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3724:1: ( RULE_ID )
            // InternalRdfMapping.g:3725:2: RULE_ID
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
    // InternalRdfMapping.g:3735:1: rule__Domainmodel__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3739:1: ( ( ruleElement ) )
            // InternalRdfMapping.g:3740:2: ( ruleElement )
            {
            // InternalRdfMapping.g:3740:2: ( ruleElement )
            // InternalRdfMapping.g:3741:3: ruleElement
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
    // InternalRdfMapping.g:3750:1: rule__SourceTypesDefinition__TypesAssignment_3 : ( ruleSourceType ) ;
    public final void rule__SourceTypesDefinition__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3754:1: ( ( ruleSourceType ) )
            // InternalRdfMapping.g:3755:2: ( ruleSourceType )
            {
            // InternalRdfMapping.g:3755:2: ( ruleSourceType )
            // InternalRdfMapping.g:3756:3: ruleSourceType
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
    // InternalRdfMapping.g:3765:1: rule__SourceType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SourceType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3769:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3770:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3770:2: ( RULE_ID )
            // InternalRdfMapping.g:3771:3: RULE_ID
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
    // InternalRdfMapping.g:3780:1: rule__SourceType__ReferenceFormulationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SourceType__ReferenceFormulationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3784:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3785:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3785:2: ( RULE_STRING )
            // InternalRdfMapping.g:3786:3: RULE_STRING
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
    // InternalRdfMapping.g:3795:1: rule__DatatypesDefinition__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__DatatypesDefinition__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3799:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:3800:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:3800:2: ( rulePrefix )
            // InternalRdfMapping.g:3801:3: rulePrefix
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
    // InternalRdfMapping.g:3810:1: rule__DatatypesDefinition__TypesAssignment_4 : ( ruleDatatype ) ;
    public final void rule__DatatypesDefinition__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3814:1: ( ( ruleDatatype ) )
            // InternalRdfMapping.g:3815:2: ( ruleDatatype )
            {
            // InternalRdfMapping.g:3815:2: ( ruleDatatype )
            // InternalRdfMapping.g:3816:3: ruleDatatype
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
    // InternalRdfMapping.g:3825:1: rule__Datatype__NameAssignment : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3829:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3830:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3830:2: ( RULE_ID )
            // InternalRdfMapping.g:3831:3: RULE_ID
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
    // InternalRdfMapping.g:3840:1: rule__LanguageTagDefinition__LanguageTagsAssignment_3 : ( ruleLanguageTag ) ;
    public final void rule__LanguageTagDefinition__LanguageTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3844:1: ( ( ruleLanguageTag ) )
            // InternalRdfMapping.g:3845:2: ( ruleLanguageTag )
            {
            // InternalRdfMapping.g:3845:2: ( ruleLanguageTag )
            // InternalRdfMapping.g:3846:3: ruleLanguageTag
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
    // InternalRdfMapping.g:3855:1: rule__LanguageTag__NameAssignment : ( RULE_ID ) ;
    public final void rule__LanguageTag__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3859:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3860:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3860:2: ( RULE_ID )
            // InternalRdfMapping.g:3861:3: RULE_ID
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
    // InternalRdfMapping.g:3870:1: rule__SourceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SourceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3874:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3875:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3875:2: ( RULE_ID )
            // InternalRdfMapping.g:3876:3: RULE_ID
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
    // InternalRdfMapping.g:3885:1: rule__SourceGroup__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SourceGroup__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3889:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:3890:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:3890:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3891:3: ( RULE_ID )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0()); 
            // InternalRdfMapping.g:3892:3: ( RULE_ID )
            // InternalRdfMapping.g:3893:4: RULE_ID
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
    // InternalRdfMapping.g:3904:1: rule__SourceGroup__SourceAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__SourceGroup__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3908:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3909:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3909:2: ( RULE_STRING )
            // InternalRdfMapping.g:3910:3: RULE_STRING
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
    // InternalRdfMapping.g:3919:1: rule__SourceGroup__LogicalSourcesAssignment_7 : ( ruleLogicalSource ) ;
    public final void rule__SourceGroup__LogicalSourcesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3923:1: ( ( ruleLogicalSource ) )
            // InternalRdfMapping.g:3924:2: ( ruleLogicalSource )
            {
            // InternalRdfMapping.g:3924:2: ( ruleLogicalSource )
            // InternalRdfMapping.g:3925:3: ruleLogicalSource
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
    // InternalRdfMapping.g:3934:1: rule__LogicalSource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicalSource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3938:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3939:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3939:2: ( RULE_ID )
            // InternalRdfMapping.g:3940:3: RULE_ID
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
    // InternalRdfMapping.g:3949:1: rule__LogicalSource__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LogicalSource__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3953:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:3954:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:3954:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3955:3: ( RULE_ID )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0()); 
            // InternalRdfMapping.g:3956:3: ( RULE_ID )
            // InternalRdfMapping.g:3957:4: RULE_ID
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
    // InternalRdfMapping.g:3968:1: rule__LogicalSource__SourceAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3972:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3973:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3973:2: ( RULE_STRING )
            // InternalRdfMapping.g:3974:3: RULE_STRING
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
    // InternalRdfMapping.g:3983:1: rule__LogicalSource__IteratorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__IteratorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3987:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3988:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3988:2: ( RULE_STRING )
            // InternalRdfMapping.g:3989:3: RULE_STRING
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
    // InternalRdfMapping.g:3998:1: rule__LogicalSource__ReferencablesAssignment_8 : ( ruleReferenceable ) ;
    public final void rule__LogicalSource__ReferencablesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4002:1: ( ( ruleReferenceable ) )
            // InternalRdfMapping.g:4003:2: ( ruleReferenceable )
            {
            // InternalRdfMapping.g:4003:2: ( ruleReferenceable )
            // InternalRdfMapping.g:4004:3: ruleReferenceable
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
    // InternalRdfMapping.g:4013:1: rule__Referenceable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Referenceable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4017:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4018:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4018:2: ( RULE_ID )
            // InternalRdfMapping.g:4019:3: RULE_ID
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
    // InternalRdfMapping.g:4028:1: rule__Referenceable__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Referenceable__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4032:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4033:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4033:2: ( RULE_STRING )
            // InternalRdfMapping.g:4034:3: RULE_STRING
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
    // InternalRdfMapping.g:4043:1: rule__Vocabulary__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vocabulary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4047:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4048:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4048:2: ( RULE_ID )
            // InternalRdfMapping.g:4049:3: RULE_ID
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
    // InternalRdfMapping.g:4058:1: rule__Vocabulary__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__Vocabulary__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4062:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:4063:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:4063:2: ( rulePrefix )
            // InternalRdfMapping.g:4064:3: rulePrefix
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
    // InternalRdfMapping.g:4073:1: rule__Vocabulary__ClassesAssignment_4_1 : ( ruleRdfClass ) ;
    public final void rule__Vocabulary__ClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4077:1: ( ( ruleRdfClass ) )
            // InternalRdfMapping.g:4078:2: ( ruleRdfClass )
            {
            // InternalRdfMapping.g:4078:2: ( ruleRdfClass )
            // InternalRdfMapping.g:4079:3: ruleRdfClass
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
    // InternalRdfMapping.g:4088:1: rule__Vocabulary__PropertiesAssignment_5_1 : ( ruleRdfProperty ) ;
    public final void rule__Vocabulary__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4092:1: ( ( ruleRdfProperty ) )
            // InternalRdfMapping.g:4093:2: ( ruleRdfProperty )
            {
            // InternalRdfMapping.g:4093:2: ( ruleRdfProperty )
            // InternalRdfMapping.g:4094:3: ruleRdfProperty
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
    // InternalRdfMapping.g:4103:1: rule__Prefix__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Prefix__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4107:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4108:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4108:2: ( RULE_STRING )
            // InternalRdfMapping.g:4109:3: RULE_STRING
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
    // InternalRdfMapping.g:4118:1: rule__Prefix__IriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__IriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4122:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4123:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4123:2: ( RULE_STRING )
            // InternalRdfMapping.g:4124:3: RULE_STRING
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
    // InternalRdfMapping.g:4133:1: rule__RdfProperty__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfProperty__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4137:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4138:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4138:2: ( RULE_ID )
            // InternalRdfMapping.g:4139:3: RULE_ID
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
    // InternalRdfMapping.g:4148:1: rule__RdfClass__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfClass__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4152:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4153:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4153:2: ( RULE_ID )
            // InternalRdfMapping.g:4154:3: RULE_ID
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
    // InternalRdfMapping.g:4163:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4167:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4168:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:4168:2: ( RULE_ID )
            // InternalRdfMapping.g:4169:3: RULE_ID
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
    // InternalRdfMapping.g:4178:1: rule__Mapping__SourceAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4182:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4183:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4183:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4184:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getSourceLogicalSourceCrossReference_3_0()); 
            // InternalRdfMapping.g:4185:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4186:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4197:1: rule__Mapping__PatternAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Mapping__PatternAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4201:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4202:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4202:2: ( RULE_STRING )
            // InternalRdfMapping.g:4203:3: RULE_STRING
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
    // InternalRdfMapping.g:4212:1: rule__Mapping__ReferenceAssignment_9 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__ReferenceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4216:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4217:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4217:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4218:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getReferenceReferenceableCrossReference_9_0()); 
            // InternalRdfMapping.g:4219:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4220:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4231:1: rule__Mapping__SubjectTypeMappingsAssignment_10_1 : ( ruleSubjectTypeMapping ) ;
    public final void rule__Mapping__SubjectTypeMappingsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4235:1: ( ( ruleSubjectTypeMapping ) )
            // InternalRdfMapping.g:4236:2: ( ruleSubjectTypeMapping )
            {
            // InternalRdfMapping.g:4236:2: ( ruleSubjectTypeMapping )
            // InternalRdfMapping.g:4237:3: ruleSubjectTypeMapping
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
    // InternalRdfMapping.g:4246:1: rule__Mapping__PoMappingsAssignment_11_1 : ( rulePredicateObjectMapping ) ;
    public final void rule__Mapping__PoMappingsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4250:1: ( ( rulePredicateObjectMapping ) )
            // InternalRdfMapping.g:4251:2: ( rulePredicateObjectMapping )
            {
            // InternalRdfMapping.g:4251:2: ( rulePredicateObjectMapping )
            // InternalRdfMapping.g:4252:3: rulePredicateObjectMapping
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
    // InternalRdfMapping.g:4261:1: rule__SubjectTypeMapping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubjectTypeMapping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4265:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4266:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4266:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4267:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassCrossReference_0()); 
            // InternalRdfMapping.g:4268:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4269:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4280:1: rule__PredicateObjectMapping__PropertyAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PredicateObjectMapping__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4284:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4285:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4285:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4286:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0()); 
            // InternalRdfMapping.g:4287:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4288:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4299:1: rule__PredicateObjectMapping__TermAssignment_1 : ( ruleValuedTerm ) ;
    public final void rule__PredicateObjectMapping__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4303:1: ( ( ruleValuedTerm ) )
            // InternalRdfMapping.g:4304:2: ( ruleValuedTerm )
            {
            // InternalRdfMapping.g:4304:2: ( ruleValuedTerm )
            // InternalRdfMapping.g:4305:3: ruleValuedTerm
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
    // InternalRdfMapping.g:4314:1: rule__ReferenceValuedTerm__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceValuedTerm__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4318:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4319:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4319:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4320:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableCrossReference_1_0()); 
            // InternalRdfMapping.g:4321:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4322:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4333:1: rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceValuedTerm__DatatypeAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4337:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4338:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4338:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4339:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeCrossReference_2_0_2_0()); 
            // InternalRdfMapping.g:4340:3: ( RULE_ID )
            // InternalRdfMapping.g:4341:4: RULE_ID
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
    // InternalRdfMapping.g:4352:1: rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceValuedTerm__LanguageTagAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4356:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4357:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4357:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4358:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagCrossReference_2_1_2_0()); 
            // InternalRdfMapping.g:4359:3: ( RULE_ID )
            // InternalRdfMapping.g:4360:4: RULE_ID
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
    // InternalRdfMapping.g:4371:1: rule__TemplateValuedTerm__PatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TemplateValuedTerm__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4375:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:4376:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:4376:2: ( RULE_STRING )
            // InternalRdfMapping.g:4377:3: RULE_STRING
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


    // $ANTLR start "rule__TemplateValuedTerm__ReferenceAssignment_3"
    // InternalRdfMapping.g:4386:1: rule__TemplateValuedTerm__ReferenceAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateValuedTerm__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4390:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4391:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4391:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4392:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferenceReferenceableCrossReference_3_0()); 
            // InternalRdfMapping.g:4393:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4394:4: ruleQualifiedName
            {
             before(grammarAccess.getTemplateValuedTermAccess().getReferenceReferenceableQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTemplateValuedTermAccess().getReferenceReferenceableQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTemplateValuedTermAccess().getReferenceReferenceableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateValuedTerm__ReferenceAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalRdfMapping.g:4405:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4409:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:4410:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:4410:2: ( ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:4411:3: ruleQualifiedNameWithWildcard
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001011238802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001011238800L});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000002L});

}