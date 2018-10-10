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


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:503:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRdfMapping.g:504:1: ( ruleImport EOF )
            // InternalRdfMapping.g:505:1: ruleImport EOF
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
    // InternalRdfMapping.g:512:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:516:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRdfMapping.g:517:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRdfMapping.g:517:2: ( ( rule__Import__Group__0 ) )
            // InternalRdfMapping.g:518:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRdfMapping.g:519:3: ( rule__Import__Group__0 )
            // InternalRdfMapping.g:519:4: rule__Import__Group__0
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
    // InternalRdfMapping.g:528:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRdfMapping.g:529:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:530:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:537:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:541:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRdfMapping.g:542:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRdfMapping.g:542:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRdfMapping.g:543:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRdfMapping.g:544:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRdfMapping.g:544:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalRdfMapping.g:553:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRdfMapping.g:554:1: ( ruleQualifiedName EOF )
            // InternalRdfMapping.g:555:1: ruleQualifiedName EOF
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
    // InternalRdfMapping.g:562:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:566:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRdfMapping.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRdfMapping.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRdfMapping.g:568:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRdfMapping.g:569:3: ( rule__QualifiedName__Group__0 )
            // InternalRdfMapping.g:569:4: rule__QualifiedName__Group__0
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
    // InternalRdfMapping.g:577:1: rule__Element__Alternatives : ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleDatatypesDefinition ) | ( ruleLanguageTagDefinition ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:581:1: ( ( ruleSourceGroup ) | ( ruleLogicalSource ) | ( ruleVocabulary ) | ( ruleMapping ) | ( ruleImport ) | ( ruleSourceTypesDefinition ) | ( ruleDatatypesDefinition ) | ( ruleLanguageTagDefinition ) )
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
                    // InternalRdfMapping.g:582:2: ( ruleSourceGroup )
                    {
                    // InternalRdfMapping.g:582:2: ( ruleSourceGroup )
                    // InternalRdfMapping.g:583:3: ruleSourceGroup
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
                    // InternalRdfMapping.g:588:2: ( ruleLogicalSource )
                    {
                    // InternalRdfMapping.g:588:2: ( ruleLogicalSource )
                    // InternalRdfMapping.g:589:3: ruleLogicalSource
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
                    // InternalRdfMapping.g:594:2: ( ruleVocabulary )
                    {
                    // InternalRdfMapping.g:594:2: ( ruleVocabulary )
                    // InternalRdfMapping.g:595:3: ruleVocabulary
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
                    // InternalRdfMapping.g:600:2: ( ruleMapping )
                    {
                    // InternalRdfMapping.g:600:2: ( ruleMapping )
                    // InternalRdfMapping.g:601:3: ruleMapping
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
                    // InternalRdfMapping.g:606:2: ( ruleImport )
                    {
                    // InternalRdfMapping.g:606:2: ( ruleImport )
                    // InternalRdfMapping.g:607:3: ruleImport
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
                    // InternalRdfMapping.g:612:2: ( ruleSourceTypesDefinition )
                    {
                    // InternalRdfMapping.g:612:2: ( ruleSourceTypesDefinition )
                    // InternalRdfMapping.g:613:3: ruleSourceTypesDefinition
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
                    // InternalRdfMapping.g:618:2: ( ruleDatatypesDefinition )
                    {
                    // InternalRdfMapping.g:618:2: ( ruleDatatypesDefinition )
                    // InternalRdfMapping.g:619:3: ruleDatatypesDefinition
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
                    // InternalRdfMapping.g:624:2: ( ruleLanguageTagDefinition )
                    {
                    // InternalRdfMapping.g:624:2: ( ruleLanguageTagDefinition )
                    // InternalRdfMapping.g:625:3: ruleLanguageTagDefinition
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


    // $ANTLR start "rule__PredicateObjectMapping__Alternatives_3"
    // InternalRdfMapping.g:634:1: rule__PredicateObjectMapping__Alternatives_3 : ( ( ( rule__PredicateObjectMapping__Group_3_0__0 ) ) | ( ( rule__PredicateObjectMapping__Group_3_1__0 ) ) );
    public final void rule__PredicateObjectMapping__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:638:1: ( ( ( rule__PredicateObjectMapping__Group_3_0__0 ) ) | ( ( rule__PredicateObjectMapping__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==34) ) {
                    alt3=1;
                }
                else if ( (LA3_1==35) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRdfMapping.g:639:2: ( ( rule__PredicateObjectMapping__Group_3_0__0 ) )
                    {
                    // InternalRdfMapping.g:639:2: ( ( rule__PredicateObjectMapping__Group_3_0__0 ) )
                    // InternalRdfMapping.g:640:3: ( rule__PredicateObjectMapping__Group_3_0__0 )
                    {
                     before(grammarAccess.getPredicateObjectMappingAccess().getGroup_3_0()); 
                    // InternalRdfMapping.g:641:3: ( rule__PredicateObjectMapping__Group_3_0__0 )
                    // InternalRdfMapping.g:641:4: rule__PredicateObjectMapping__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateObjectMapping__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicateObjectMappingAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:645:2: ( ( rule__PredicateObjectMapping__Group_3_1__0 ) )
                    {
                    // InternalRdfMapping.g:645:2: ( ( rule__PredicateObjectMapping__Group_3_1__0 ) )
                    // InternalRdfMapping.g:646:3: ( rule__PredicateObjectMapping__Group_3_1__0 )
                    {
                     before(grammarAccess.getPredicateObjectMappingAccess().getGroup_3_1()); 
                    // InternalRdfMapping.g:647:3: ( rule__PredicateObjectMapping__Group_3_1__0 )
                    // InternalRdfMapping.g:647:4: rule__PredicateObjectMapping__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateObjectMapping__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicateObjectMappingAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__PredicateObjectMapping__Alternatives_3"


    // $ANTLR start "rule__SourceTypesDefinition__Group__0"
    // InternalRdfMapping.g:655:1: rule__SourceTypesDefinition__Group__0 : rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 ;
    public final void rule__SourceTypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:659:1: ( rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1 )
            // InternalRdfMapping.g:660:2: rule__SourceTypesDefinition__Group__0__Impl rule__SourceTypesDefinition__Group__1
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
    // InternalRdfMapping.g:667:1: rule__SourceTypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SourceTypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:671:1: ( ( () ) )
            // InternalRdfMapping.g:672:1: ( () )
            {
            // InternalRdfMapping.g:672:1: ( () )
            // InternalRdfMapping.g:673:2: ()
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0()); 
            // InternalRdfMapping.g:674:2: ()
            // InternalRdfMapping.g:674:3: 
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
    // InternalRdfMapping.g:682:1: rule__SourceTypesDefinition__Group__1 : rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 ;
    public final void rule__SourceTypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:686:1: ( rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2 )
            // InternalRdfMapping.g:687:2: rule__SourceTypesDefinition__Group__1__Impl rule__SourceTypesDefinition__Group__2
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
    // InternalRdfMapping.g:694:1: rule__SourceTypesDefinition__Group__1__Impl : ( 'source-types' ) ;
    public final void rule__SourceTypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:698:1: ( ( 'source-types' ) )
            // InternalRdfMapping.g:699:1: ( 'source-types' )
            {
            // InternalRdfMapping.g:699:1: ( 'source-types' )
            // InternalRdfMapping.g:700:2: 'source-types'
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
    // InternalRdfMapping.g:709:1: rule__SourceTypesDefinition__Group__2 : rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 ;
    public final void rule__SourceTypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:713:1: ( rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3 )
            // InternalRdfMapping.g:714:2: rule__SourceTypesDefinition__Group__2__Impl rule__SourceTypesDefinition__Group__3
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
    // InternalRdfMapping.g:721:1: rule__SourceTypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceTypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:725:1: ( ( '{' ) )
            // InternalRdfMapping.g:726:1: ( '{' )
            {
            // InternalRdfMapping.g:726:1: ( '{' )
            // InternalRdfMapping.g:727:2: '{'
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
    // InternalRdfMapping.g:736:1: rule__SourceTypesDefinition__Group__3 : rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 ;
    public final void rule__SourceTypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:740:1: ( rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4 )
            // InternalRdfMapping.g:741:2: rule__SourceTypesDefinition__Group__3__Impl rule__SourceTypesDefinition__Group__4
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
    // InternalRdfMapping.g:748:1: rule__SourceTypesDefinition__Group__3__Impl : ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) ;
    public final void rule__SourceTypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:752:1: ( ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* ) )
            // InternalRdfMapping.g:753:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            {
            // InternalRdfMapping.g:753:1: ( ( rule__SourceTypesDefinition__TypesAssignment_3 )* )
            // InternalRdfMapping.g:754:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            {
             before(grammarAccess.getSourceTypesDefinitionAccess().getTypesAssignment_3()); 
            // InternalRdfMapping.g:755:2: ( rule__SourceTypesDefinition__TypesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRdfMapping.g:755:3: rule__SourceTypesDefinition__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SourceTypesDefinition__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalRdfMapping.g:763:1: rule__SourceTypesDefinition__Group__4 : rule__SourceTypesDefinition__Group__4__Impl ;
    public final void rule__SourceTypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:767:1: ( rule__SourceTypesDefinition__Group__4__Impl )
            // InternalRdfMapping.g:768:2: rule__SourceTypesDefinition__Group__4__Impl
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
    // InternalRdfMapping.g:774:1: rule__SourceTypesDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SourceTypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:778:1: ( ( '}' ) )
            // InternalRdfMapping.g:779:1: ( '}' )
            {
            // InternalRdfMapping.g:779:1: ( '}' )
            // InternalRdfMapping.g:780:2: '}'
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
    // InternalRdfMapping.g:790:1: rule__SourceType__Group__0 : rule__SourceType__Group__0__Impl rule__SourceType__Group__1 ;
    public final void rule__SourceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:794:1: ( rule__SourceType__Group__0__Impl rule__SourceType__Group__1 )
            // InternalRdfMapping.g:795:2: rule__SourceType__Group__0__Impl rule__SourceType__Group__1
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
    // InternalRdfMapping.g:802:1: rule__SourceType__Group__0__Impl : ( ( rule__SourceType__NameAssignment_0 ) ) ;
    public final void rule__SourceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:806:1: ( ( ( rule__SourceType__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:807:1: ( ( rule__SourceType__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:807:1: ( ( rule__SourceType__NameAssignment_0 ) )
            // InternalRdfMapping.g:808:2: ( rule__SourceType__NameAssignment_0 )
            {
             before(grammarAccess.getSourceTypeAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:809:2: ( rule__SourceType__NameAssignment_0 )
            // InternalRdfMapping.g:809:3: rule__SourceType__NameAssignment_0
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
    // InternalRdfMapping.g:817:1: rule__SourceType__Group__1 : rule__SourceType__Group__1__Impl rule__SourceType__Group__2 ;
    public final void rule__SourceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:821:1: ( rule__SourceType__Group__1__Impl rule__SourceType__Group__2 )
            // InternalRdfMapping.g:822:2: rule__SourceType__Group__1__Impl rule__SourceType__Group__2
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
    // InternalRdfMapping.g:829:1: rule__SourceType__Group__1__Impl : ( 'referenceFormulation' ) ;
    public final void rule__SourceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:833:1: ( ( 'referenceFormulation' ) )
            // InternalRdfMapping.g:834:1: ( 'referenceFormulation' )
            {
            // InternalRdfMapping.g:834:1: ( 'referenceFormulation' )
            // InternalRdfMapping.g:835:2: 'referenceFormulation'
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
    // InternalRdfMapping.g:844:1: rule__SourceType__Group__2 : rule__SourceType__Group__2__Impl ;
    public final void rule__SourceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:848:1: ( rule__SourceType__Group__2__Impl )
            // InternalRdfMapping.g:849:2: rule__SourceType__Group__2__Impl
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
    // InternalRdfMapping.g:855:1: rule__SourceType__Group__2__Impl : ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) ;
    public final void rule__SourceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:859:1: ( ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) ) )
            // InternalRdfMapping.g:860:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            {
            // InternalRdfMapping.g:860:1: ( ( rule__SourceType__ReferenceFormulationAssignment_2 ) )
            // InternalRdfMapping.g:861:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            {
             before(grammarAccess.getSourceTypeAccess().getReferenceFormulationAssignment_2()); 
            // InternalRdfMapping.g:862:2: ( rule__SourceType__ReferenceFormulationAssignment_2 )
            // InternalRdfMapping.g:862:3: rule__SourceType__ReferenceFormulationAssignment_2
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
    // InternalRdfMapping.g:871:1: rule__DatatypesDefinition__Group__0 : rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 ;
    public final void rule__DatatypesDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:875:1: ( rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1 )
            // InternalRdfMapping.g:876:2: rule__DatatypesDefinition__Group__0__Impl rule__DatatypesDefinition__Group__1
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
    // InternalRdfMapping.g:883:1: rule__DatatypesDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DatatypesDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:887:1: ( ( () ) )
            // InternalRdfMapping.g:888:1: ( () )
            {
            // InternalRdfMapping.g:888:1: ( () )
            // InternalRdfMapping.g:889:2: ()
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getDatatypesDefinitionAction_0()); 
            // InternalRdfMapping.g:890:2: ()
            // InternalRdfMapping.g:890:3: 
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
    // InternalRdfMapping.g:898:1: rule__DatatypesDefinition__Group__1 : rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 ;
    public final void rule__DatatypesDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:902:1: ( rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2 )
            // InternalRdfMapping.g:903:2: rule__DatatypesDefinition__Group__1__Impl rule__DatatypesDefinition__Group__2
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
    // InternalRdfMapping.g:910:1: rule__DatatypesDefinition__Group__1__Impl : ( 'datatypes' ) ;
    public final void rule__DatatypesDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:914:1: ( ( 'datatypes' ) )
            // InternalRdfMapping.g:915:1: ( 'datatypes' )
            {
            // InternalRdfMapping.g:915:1: ( 'datatypes' )
            // InternalRdfMapping.g:916:2: 'datatypes'
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
    // InternalRdfMapping.g:925:1: rule__DatatypesDefinition__Group__2 : rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 ;
    public final void rule__DatatypesDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:929:1: ( rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3 )
            // InternalRdfMapping.g:930:2: rule__DatatypesDefinition__Group__2__Impl rule__DatatypesDefinition__Group__3
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
    // InternalRdfMapping.g:937:1: rule__DatatypesDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__DatatypesDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:941:1: ( ( '{' ) )
            // InternalRdfMapping.g:942:1: ( '{' )
            {
            // InternalRdfMapping.g:942:1: ( '{' )
            // InternalRdfMapping.g:943:2: '{'
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
    // InternalRdfMapping.g:952:1: rule__DatatypesDefinition__Group__3 : rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 ;
    public final void rule__DatatypesDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:956:1: ( rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4 )
            // InternalRdfMapping.g:957:2: rule__DatatypesDefinition__Group__3__Impl rule__DatatypesDefinition__Group__4
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
    // InternalRdfMapping.g:964:1: rule__DatatypesDefinition__Group__3__Impl : ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) ;
    public final void rule__DatatypesDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:968:1: ( ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:969:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:969:1: ( ( rule__DatatypesDefinition__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:970:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:971:2: ( rule__DatatypesDefinition__PrefixAssignment_3 )
            // InternalRdfMapping.g:971:3: rule__DatatypesDefinition__PrefixAssignment_3
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
    // InternalRdfMapping.g:979:1: rule__DatatypesDefinition__Group__4 : rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 ;
    public final void rule__DatatypesDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:983:1: ( rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5 )
            // InternalRdfMapping.g:984:2: rule__DatatypesDefinition__Group__4__Impl rule__DatatypesDefinition__Group__5
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
    // InternalRdfMapping.g:991:1: rule__DatatypesDefinition__Group__4__Impl : ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) ;
    public final void rule__DatatypesDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:995:1: ( ( ( rule__DatatypesDefinition__TypesAssignment_4 )* ) )
            // InternalRdfMapping.g:996:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            {
            // InternalRdfMapping.g:996:1: ( ( rule__DatatypesDefinition__TypesAssignment_4 )* )
            // InternalRdfMapping.g:997:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            {
             before(grammarAccess.getDatatypesDefinitionAccess().getTypesAssignment_4()); 
            // InternalRdfMapping.g:998:2: ( rule__DatatypesDefinition__TypesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:998:3: rule__DatatypesDefinition__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DatatypesDefinition__TypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalRdfMapping.g:1006:1: rule__DatatypesDefinition__Group__5 : rule__DatatypesDefinition__Group__5__Impl ;
    public final void rule__DatatypesDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1010:1: ( rule__DatatypesDefinition__Group__5__Impl )
            // InternalRdfMapping.g:1011:2: rule__DatatypesDefinition__Group__5__Impl
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
    // InternalRdfMapping.g:1017:1: rule__DatatypesDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__DatatypesDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1021:1: ( ( '}' ) )
            // InternalRdfMapping.g:1022:1: ( '}' )
            {
            // InternalRdfMapping.g:1022:1: ( '}' )
            // InternalRdfMapping.g:1023:2: '}'
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
    // InternalRdfMapping.g:1033:1: rule__LanguageTagDefinition__Group__0 : rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 ;
    public final void rule__LanguageTagDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1037:1: ( rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1 )
            // InternalRdfMapping.g:1038:2: rule__LanguageTagDefinition__Group__0__Impl rule__LanguageTagDefinition__Group__1
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
    // InternalRdfMapping.g:1045:1: rule__LanguageTagDefinition__Group__0__Impl : ( () ) ;
    public final void rule__LanguageTagDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1049:1: ( ( () ) )
            // InternalRdfMapping.g:1050:1: ( () )
            {
            // InternalRdfMapping.g:1050:1: ( () )
            // InternalRdfMapping.g:1051:2: ()
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagDefinitionAction_0()); 
            // InternalRdfMapping.g:1052:2: ()
            // InternalRdfMapping.g:1052:3: 
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
    // InternalRdfMapping.g:1060:1: rule__LanguageTagDefinition__Group__1 : rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 ;
    public final void rule__LanguageTagDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1064:1: ( rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2 )
            // InternalRdfMapping.g:1065:2: rule__LanguageTagDefinition__Group__1__Impl rule__LanguageTagDefinition__Group__2
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
    // InternalRdfMapping.g:1072:1: rule__LanguageTagDefinition__Group__1__Impl : ( 'language-tags' ) ;
    public final void rule__LanguageTagDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1076:1: ( ( 'language-tags' ) )
            // InternalRdfMapping.g:1077:1: ( 'language-tags' )
            {
            // InternalRdfMapping.g:1077:1: ( 'language-tags' )
            // InternalRdfMapping.g:1078:2: 'language-tags'
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
    // InternalRdfMapping.g:1087:1: rule__LanguageTagDefinition__Group__2 : rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 ;
    public final void rule__LanguageTagDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1091:1: ( rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3 )
            // InternalRdfMapping.g:1092:2: rule__LanguageTagDefinition__Group__2__Impl rule__LanguageTagDefinition__Group__3
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
    // InternalRdfMapping.g:1099:1: rule__LanguageTagDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LanguageTagDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1103:1: ( ( '{' ) )
            // InternalRdfMapping.g:1104:1: ( '{' )
            {
            // InternalRdfMapping.g:1104:1: ( '{' )
            // InternalRdfMapping.g:1105:2: '{'
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
    // InternalRdfMapping.g:1114:1: rule__LanguageTagDefinition__Group__3 : rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 ;
    public final void rule__LanguageTagDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1118:1: ( rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4 )
            // InternalRdfMapping.g:1119:2: rule__LanguageTagDefinition__Group__3__Impl rule__LanguageTagDefinition__Group__4
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
    // InternalRdfMapping.g:1126:1: rule__LanguageTagDefinition__Group__3__Impl : ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) ;
    public final void rule__LanguageTagDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1130:1: ( ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* ) )
            // InternalRdfMapping.g:1131:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            {
            // InternalRdfMapping.g:1131:1: ( ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )* )
            // InternalRdfMapping.g:1132:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            {
             before(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsAssignment_3()); 
            // InternalRdfMapping.g:1133:2: ( rule__LanguageTagDefinition__LanguageTagsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRdfMapping.g:1133:3: rule__LanguageTagDefinition__LanguageTagsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LanguageTagDefinition__LanguageTagsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRdfMapping.g:1141:1: rule__LanguageTagDefinition__Group__4 : rule__LanguageTagDefinition__Group__4__Impl ;
    public final void rule__LanguageTagDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1145:1: ( rule__LanguageTagDefinition__Group__4__Impl )
            // InternalRdfMapping.g:1146:2: rule__LanguageTagDefinition__Group__4__Impl
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
    // InternalRdfMapping.g:1152:1: rule__LanguageTagDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__LanguageTagDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1156:1: ( ( '}' ) )
            // InternalRdfMapping.g:1157:1: ( '}' )
            {
            // InternalRdfMapping.g:1157:1: ( '}' )
            // InternalRdfMapping.g:1158:2: '}'
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
    // InternalRdfMapping.g:1168:1: rule__SourceGroup__Group__0 : rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 ;
    public final void rule__SourceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1172:1: ( rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1 )
            // InternalRdfMapping.g:1173:2: rule__SourceGroup__Group__0__Impl rule__SourceGroup__Group__1
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
    // InternalRdfMapping.g:1180:1: rule__SourceGroup__Group__0__Impl : ( 'source-group' ) ;
    public final void rule__SourceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1184:1: ( ( 'source-group' ) )
            // InternalRdfMapping.g:1185:1: ( 'source-group' )
            {
            // InternalRdfMapping.g:1185:1: ( 'source-group' )
            // InternalRdfMapping.g:1186:2: 'source-group'
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
    // InternalRdfMapping.g:1195:1: rule__SourceGroup__Group__1 : rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 ;
    public final void rule__SourceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1199:1: ( rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2 )
            // InternalRdfMapping.g:1200:2: rule__SourceGroup__Group__1__Impl rule__SourceGroup__Group__2
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
    // InternalRdfMapping.g:1207:1: rule__SourceGroup__Group__1__Impl : ( ( rule__SourceGroup__NameAssignment_1 ) ) ;
    public final void rule__SourceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1211:1: ( ( ( rule__SourceGroup__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1212:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1212:1: ( ( rule__SourceGroup__NameAssignment_1 ) )
            // InternalRdfMapping.g:1213:2: ( rule__SourceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1214:2: ( rule__SourceGroup__NameAssignment_1 )
            // InternalRdfMapping.g:1214:3: rule__SourceGroup__NameAssignment_1
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
    // InternalRdfMapping.g:1222:1: rule__SourceGroup__Group__2 : rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 ;
    public final void rule__SourceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1226:1: ( rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3 )
            // InternalRdfMapping.g:1227:2: rule__SourceGroup__Group__2__Impl rule__SourceGroup__Group__3
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
    // InternalRdfMapping.g:1234:1: rule__SourceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1238:1: ( ( '{' ) )
            // InternalRdfMapping.g:1239:1: ( '{' )
            {
            // InternalRdfMapping.g:1239:1: ( '{' )
            // InternalRdfMapping.g:1240:2: '{'
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
    // InternalRdfMapping.g:1249:1: rule__SourceGroup__Group__3 : rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 ;
    public final void rule__SourceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1253:1: ( rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4 )
            // InternalRdfMapping.g:1254:2: rule__SourceGroup__Group__3__Impl rule__SourceGroup__Group__4
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
    // InternalRdfMapping.g:1261:1: rule__SourceGroup__Group__3__Impl : ( 'type' ) ;
    public final void rule__SourceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1265:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1266:1: ( 'type' )
            {
            // InternalRdfMapping.g:1266:1: ( 'type' )
            // InternalRdfMapping.g:1267:2: 'type'
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
    // InternalRdfMapping.g:1276:1: rule__SourceGroup__Group__4 : rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 ;
    public final void rule__SourceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1280:1: ( rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5 )
            // InternalRdfMapping.g:1281:2: rule__SourceGroup__Group__4__Impl rule__SourceGroup__Group__5
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
    // InternalRdfMapping.g:1288:1: rule__SourceGroup__Group__4__Impl : ( ( rule__SourceGroup__TypeAssignment_4 ) ) ;
    public final void rule__SourceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1292:1: ( ( ( rule__SourceGroup__TypeAssignment_4 ) ) )
            // InternalRdfMapping.g:1293:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            {
            // InternalRdfMapping.g:1293:1: ( ( rule__SourceGroup__TypeAssignment_4 ) )
            // InternalRdfMapping.g:1294:2: ( rule__SourceGroup__TypeAssignment_4 )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeAssignment_4()); 
            // InternalRdfMapping.g:1295:2: ( rule__SourceGroup__TypeAssignment_4 )
            // InternalRdfMapping.g:1295:3: rule__SourceGroup__TypeAssignment_4
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
    // InternalRdfMapping.g:1303:1: rule__SourceGroup__Group__5 : rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 ;
    public final void rule__SourceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1307:1: ( rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6 )
            // InternalRdfMapping.g:1308:2: rule__SourceGroup__Group__5__Impl rule__SourceGroup__Group__6
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
    // InternalRdfMapping.g:1315:1: rule__SourceGroup__Group__5__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1319:1: ( ( ';' ) )
            // InternalRdfMapping.g:1320:1: ( ';' )
            {
            // InternalRdfMapping.g:1320:1: ( ';' )
            // InternalRdfMapping.g:1321:2: ';'
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
    // InternalRdfMapping.g:1330:1: rule__SourceGroup__Group__6 : rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 ;
    public final void rule__SourceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1334:1: ( rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7 )
            // InternalRdfMapping.g:1335:2: rule__SourceGroup__Group__6__Impl rule__SourceGroup__Group__7
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
    // InternalRdfMapping.g:1342:1: rule__SourceGroup__Group__6__Impl : ( ( rule__SourceGroup__Group_6__0 )? ) ;
    public final void rule__SourceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1346:1: ( ( ( rule__SourceGroup__Group_6__0 )? ) )
            // InternalRdfMapping.g:1347:1: ( ( rule__SourceGroup__Group_6__0 )? )
            {
            // InternalRdfMapping.g:1347:1: ( ( rule__SourceGroup__Group_6__0 )? )
            // InternalRdfMapping.g:1348:2: ( rule__SourceGroup__Group_6__0 )?
            {
             before(grammarAccess.getSourceGroupAccess().getGroup_6()); 
            // InternalRdfMapping.g:1349:2: ( rule__SourceGroup__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdfMapping.g:1349:3: rule__SourceGroup__Group_6__0
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
    // InternalRdfMapping.g:1357:1: rule__SourceGroup__Group__7 : rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 ;
    public final void rule__SourceGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1361:1: ( rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8 )
            // InternalRdfMapping.g:1362:2: rule__SourceGroup__Group__7__Impl rule__SourceGroup__Group__8
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
    // InternalRdfMapping.g:1369:1: rule__SourceGroup__Group__7__Impl : ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) ;
    public final void rule__SourceGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1373:1: ( ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* ) )
            // InternalRdfMapping.g:1374:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            {
            // InternalRdfMapping.g:1374:1: ( ( rule__SourceGroup__LogicalSourcesAssignment_7 )* )
            // InternalRdfMapping.g:1375:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            {
             before(grammarAccess.getSourceGroupAccess().getLogicalSourcesAssignment_7()); 
            // InternalRdfMapping.g:1376:2: ( rule__SourceGroup__LogicalSourcesAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRdfMapping.g:1376:3: rule__SourceGroup__LogicalSourcesAssignment_7
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SourceGroup__LogicalSourcesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRdfMapping.g:1384:1: rule__SourceGroup__Group__8 : rule__SourceGroup__Group__8__Impl ;
    public final void rule__SourceGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1388:1: ( rule__SourceGroup__Group__8__Impl )
            // InternalRdfMapping.g:1389:2: rule__SourceGroup__Group__8__Impl
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
    // InternalRdfMapping.g:1395:1: rule__SourceGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__SourceGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1399:1: ( ( '}' ) )
            // InternalRdfMapping.g:1400:1: ( '}' )
            {
            // InternalRdfMapping.g:1400:1: ( '}' )
            // InternalRdfMapping.g:1401:2: '}'
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
    // InternalRdfMapping.g:1411:1: rule__SourceGroup__Group_6__0 : rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 ;
    public final void rule__SourceGroup__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1415:1: ( rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1 )
            // InternalRdfMapping.g:1416:2: rule__SourceGroup__Group_6__0__Impl rule__SourceGroup__Group_6__1
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
    // InternalRdfMapping.g:1423:1: rule__SourceGroup__Group_6__0__Impl : ( 'source' ) ;
    public final void rule__SourceGroup__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1427:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1428:1: ( 'source' )
            {
            // InternalRdfMapping.g:1428:1: ( 'source' )
            // InternalRdfMapping.g:1429:2: 'source'
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
    // InternalRdfMapping.g:1438:1: rule__SourceGroup__Group_6__1 : rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 ;
    public final void rule__SourceGroup__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1442:1: ( rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2 )
            // InternalRdfMapping.g:1443:2: rule__SourceGroup__Group_6__1__Impl rule__SourceGroup__Group_6__2
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
    // InternalRdfMapping.g:1450:1: rule__SourceGroup__Group_6__1__Impl : ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) ;
    public final void rule__SourceGroup__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1454:1: ( ( ( rule__SourceGroup__SourceAssignment_6_1 ) ) )
            // InternalRdfMapping.g:1455:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            {
            // InternalRdfMapping.g:1455:1: ( ( rule__SourceGroup__SourceAssignment_6_1 ) )
            // InternalRdfMapping.g:1456:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            {
             before(grammarAccess.getSourceGroupAccess().getSourceAssignment_6_1()); 
            // InternalRdfMapping.g:1457:2: ( rule__SourceGroup__SourceAssignment_6_1 )
            // InternalRdfMapping.g:1457:3: rule__SourceGroup__SourceAssignment_6_1
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
    // InternalRdfMapping.g:1465:1: rule__SourceGroup__Group_6__2 : rule__SourceGroup__Group_6__2__Impl ;
    public final void rule__SourceGroup__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1469:1: ( rule__SourceGroup__Group_6__2__Impl )
            // InternalRdfMapping.g:1470:2: rule__SourceGroup__Group_6__2__Impl
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
    // InternalRdfMapping.g:1476:1: rule__SourceGroup__Group_6__2__Impl : ( ';' ) ;
    public final void rule__SourceGroup__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1480:1: ( ( ';' ) )
            // InternalRdfMapping.g:1481:1: ( ';' )
            {
            // InternalRdfMapping.g:1481:1: ( ';' )
            // InternalRdfMapping.g:1482:2: ';'
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
    // InternalRdfMapping.g:1492:1: rule__LogicalSource__Group__0 : rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 ;
    public final void rule__LogicalSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1496:1: ( rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1 )
            // InternalRdfMapping.g:1497:2: rule__LogicalSource__Group__0__Impl rule__LogicalSource__Group__1
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
    // InternalRdfMapping.g:1504:1: rule__LogicalSource__Group__0__Impl : ( 'logical-source' ) ;
    public final void rule__LogicalSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1508:1: ( ( 'logical-source' ) )
            // InternalRdfMapping.g:1509:1: ( 'logical-source' )
            {
            // InternalRdfMapping.g:1509:1: ( 'logical-source' )
            // InternalRdfMapping.g:1510:2: 'logical-source'
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
    // InternalRdfMapping.g:1519:1: rule__LogicalSource__Group__1 : rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 ;
    public final void rule__LogicalSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1523:1: ( rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2 )
            // InternalRdfMapping.g:1524:2: rule__LogicalSource__Group__1__Impl rule__LogicalSource__Group__2
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
    // InternalRdfMapping.g:1531:1: rule__LogicalSource__Group__1__Impl : ( ( rule__LogicalSource__NameAssignment_1 ) ) ;
    public final void rule__LogicalSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1535:1: ( ( ( rule__LogicalSource__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:1536:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:1536:1: ( ( rule__LogicalSource__NameAssignment_1 ) )
            // InternalRdfMapping.g:1537:2: ( rule__LogicalSource__NameAssignment_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:1538:2: ( rule__LogicalSource__NameAssignment_1 )
            // InternalRdfMapping.g:1538:3: rule__LogicalSource__NameAssignment_1
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
    // InternalRdfMapping.g:1546:1: rule__LogicalSource__Group__2 : rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 ;
    public final void rule__LogicalSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1550:1: ( rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3 )
            // InternalRdfMapping.g:1551:2: rule__LogicalSource__Group__2__Impl rule__LogicalSource__Group__3
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
    // InternalRdfMapping.g:1558:1: rule__LogicalSource__Group__2__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1562:1: ( ( '{' ) )
            // InternalRdfMapping.g:1563:1: ( '{' )
            {
            // InternalRdfMapping.g:1563:1: ( '{' )
            // InternalRdfMapping.g:1564:2: '{'
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
    // InternalRdfMapping.g:1573:1: rule__LogicalSource__Group__3 : rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 ;
    public final void rule__LogicalSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1577:1: ( rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4 )
            // InternalRdfMapping.g:1578:2: rule__LogicalSource__Group__3__Impl rule__LogicalSource__Group__4
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
    // InternalRdfMapping.g:1585:1: rule__LogicalSource__Group__3__Impl : ( ( rule__LogicalSource__Group_3__0 )? ) ;
    public final void rule__LogicalSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1589:1: ( ( ( rule__LogicalSource__Group_3__0 )? ) )
            // InternalRdfMapping.g:1590:1: ( ( rule__LogicalSource__Group_3__0 )? )
            {
            // InternalRdfMapping.g:1590:1: ( ( rule__LogicalSource__Group_3__0 )? )
            // InternalRdfMapping.g:1591:2: ( rule__LogicalSource__Group_3__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_3()); 
            // InternalRdfMapping.g:1592:2: ( rule__LogicalSource__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdfMapping.g:1592:3: rule__LogicalSource__Group_3__0
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
    // InternalRdfMapping.g:1600:1: rule__LogicalSource__Group__4 : rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 ;
    public final void rule__LogicalSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1604:1: ( rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5 )
            // InternalRdfMapping.g:1605:2: rule__LogicalSource__Group__4__Impl rule__LogicalSource__Group__5
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
    // InternalRdfMapping.g:1612:1: rule__LogicalSource__Group__4__Impl : ( ( rule__LogicalSource__Group_4__0 )? ) ;
    public final void rule__LogicalSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1616:1: ( ( ( rule__LogicalSource__Group_4__0 )? ) )
            // InternalRdfMapping.g:1617:1: ( ( rule__LogicalSource__Group_4__0 )? )
            {
            // InternalRdfMapping.g:1617:1: ( ( rule__LogicalSource__Group_4__0 )? )
            // InternalRdfMapping.g:1618:2: ( rule__LogicalSource__Group_4__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_4()); 
            // InternalRdfMapping.g:1619:2: ( rule__LogicalSource__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:1619:3: rule__LogicalSource__Group_4__0
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
    // InternalRdfMapping.g:1627:1: rule__LogicalSource__Group__5 : rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 ;
    public final void rule__LogicalSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1631:1: ( rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6 )
            // InternalRdfMapping.g:1632:2: rule__LogicalSource__Group__5__Impl rule__LogicalSource__Group__6
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
    // InternalRdfMapping.g:1639:1: rule__LogicalSource__Group__5__Impl : ( ( rule__LogicalSource__Group_5__0 )? ) ;
    public final void rule__LogicalSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1643:1: ( ( ( rule__LogicalSource__Group_5__0 )? ) )
            // InternalRdfMapping.g:1644:1: ( ( rule__LogicalSource__Group_5__0 )? )
            {
            // InternalRdfMapping.g:1644:1: ( ( rule__LogicalSource__Group_5__0 )? )
            // InternalRdfMapping.g:1645:2: ( rule__LogicalSource__Group_5__0 )?
            {
             before(grammarAccess.getLogicalSourceAccess().getGroup_5()); 
            // InternalRdfMapping.g:1646:2: ( rule__LogicalSource__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdfMapping.g:1646:3: rule__LogicalSource__Group_5__0
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
    // InternalRdfMapping.g:1654:1: rule__LogicalSource__Group__6 : rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 ;
    public final void rule__LogicalSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1658:1: ( rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7 )
            // InternalRdfMapping.g:1659:2: rule__LogicalSource__Group__6__Impl rule__LogicalSource__Group__7
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
    // InternalRdfMapping.g:1666:1: rule__LogicalSource__Group__6__Impl : ( 'referenceables' ) ;
    public final void rule__LogicalSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1670:1: ( ( 'referenceables' ) )
            // InternalRdfMapping.g:1671:1: ( 'referenceables' )
            {
            // InternalRdfMapping.g:1671:1: ( 'referenceables' )
            // InternalRdfMapping.g:1672:2: 'referenceables'
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
    // InternalRdfMapping.g:1681:1: rule__LogicalSource__Group__7 : rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 ;
    public final void rule__LogicalSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1685:1: ( rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8 )
            // InternalRdfMapping.g:1686:2: rule__LogicalSource__Group__7__Impl rule__LogicalSource__Group__8
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
    // InternalRdfMapping.g:1693:1: rule__LogicalSource__Group__7__Impl : ( '{' ) ;
    public final void rule__LogicalSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1697:1: ( ( '{' ) )
            // InternalRdfMapping.g:1698:1: ( '{' )
            {
            // InternalRdfMapping.g:1698:1: ( '{' )
            // InternalRdfMapping.g:1699:2: '{'
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
    // InternalRdfMapping.g:1708:1: rule__LogicalSource__Group__8 : rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 ;
    public final void rule__LogicalSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1712:1: ( rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9 )
            // InternalRdfMapping.g:1713:2: rule__LogicalSource__Group__8__Impl rule__LogicalSource__Group__9
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
    // InternalRdfMapping.g:1720:1: rule__LogicalSource__Group__8__Impl : ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) ;
    public final void rule__LogicalSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1724:1: ( ( ( rule__LogicalSource__ReferencablesAssignment_8 )* ) )
            // InternalRdfMapping.g:1725:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            {
            // InternalRdfMapping.g:1725:1: ( ( rule__LogicalSource__ReferencablesAssignment_8 )* )
            // InternalRdfMapping.g:1726:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            {
             before(grammarAccess.getLogicalSourceAccess().getReferencablesAssignment_8()); 
            // InternalRdfMapping.g:1727:2: ( rule__LogicalSource__ReferencablesAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRdfMapping.g:1727:3: rule__LogicalSource__ReferencablesAssignment_8
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LogicalSource__ReferencablesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalRdfMapping.g:1735:1: rule__LogicalSource__Group__9 : rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 ;
    public final void rule__LogicalSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1739:1: ( rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10 )
            // InternalRdfMapping.g:1740:2: rule__LogicalSource__Group__9__Impl rule__LogicalSource__Group__10
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
    // InternalRdfMapping.g:1747:1: rule__LogicalSource__Group__9__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1751:1: ( ( '}' ) )
            // InternalRdfMapping.g:1752:1: ( '}' )
            {
            // InternalRdfMapping.g:1752:1: ( '}' )
            // InternalRdfMapping.g:1753:2: '}'
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
    // InternalRdfMapping.g:1762:1: rule__LogicalSource__Group__10 : rule__LogicalSource__Group__10__Impl ;
    public final void rule__LogicalSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1766:1: ( rule__LogicalSource__Group__10__Impl )
            // InternalRdfMapping.g:1767:2: rule__LogicalSource__Group__10__Impl
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
    // InternalRdfMapping.g:1773:1: rule__LogicalSource__Group__10__Impl : ( '}' ) ;
    public final void rule__LogicalSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1777:1: ( ( '}' ) )
            // InternalRdfMapping.g:1778:1: ( '}' )
            {
            // InternalRdfMapping.g:1778:1: ( '}' )
            // InternalRdfMapping.g:1779:2: '}'
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
    // InternalRdfMapping.g:1789:1: rule__LogicalSource__Group_3__0 : rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 ;
    public final void rule__LogicalSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1793:1: ( rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1 )
            // InternalRdfMapping.g:1794:2: rule__LogicalSource__Group_3__0__Impl rule__LogicalSource__Group_3__1
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
    // InternalRdfMapping.g:1801:1: rule__LogicalSource__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__LogicalSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1805:1: ( ( 'type' ) )
            // InternalRdfMapping.g:1806:1: ( 'type' )
            {
            // InternalRdfMapping.g:1806:1: ( 'type' )
            // InternalRdfMapping.g:1807:2: 'type'
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
    // InternalRdfMapping.g:1816:1: rule__LogicalSource__Group_3__1 : rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 ;
    public final void rule__LogicalSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1820:1: ( rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2 )
            // InternalRdfMapping.g:1821:2: rule__LogicalSource__Group_3__1__Impl rule__LogicalSource__Group_3__2
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
    // InternalRdfMapping.g:1828:1: rule__LogicalSource__Group_3__1__Impl : ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) ;
    public final void rule__LogicalSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1832:1: ( ( ( rule__LogicalSource__TypeAssignment_3_1 ) ) )
            // InternalRdfMapping.g:1833:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            {
            // InternalRdfMapping.g:1833:1: ( ( rule__LogicalSource__TypeAssignment_3_1 ) )
            // InternalRdfMapping.g:1834:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeAssignment_3_1()); 
            // InternalRdfMapping.g:1835:2: ( rule__LogicalSource__TypeAssignment_3_1 )
            // InternalRdfMapping.g:1835:3: rule__LogicalSource__TypeAssignment_3_1
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
    // InternalRdfMapping.g:1843:1: rule__LogicalSource__Group_3__2 : rule__LogicalSource__Group_3__2__Impl ;
    public final void rule__LogicalSource__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1847:1: ( rule__LogicalSource__Group_3__2__Impl )
            // InternalRdfMapping.g:1848:2: rule__LogicalSource__Group_3__2__Impl
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
    // InternalRdfMapping.g:1854:1: rule__LogicalSource__Group_3__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1858:1: ( ( ';' ) )
            // InternalRdfMapping.g:1859:1: ( ';' )
            {
            // InternalRdfMapping.g:1859:1: ( ';' )
            // InternalRdfMapping.g:1860:2: ';'
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
    // InternalRdfMapping.g:1870:1: rule__LogicalSource__Group_4__0 : rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 ;
    public final void rule__LogicalSource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1874:1: ( rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1 )
            // InternalRdfMapping.g:1875:2: rule__LogicalSource__Group_4__0__Impl rule__LogicalSource__Group_4__1
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
    // InternalRdfMapping.g:1882:1: rule__LogicalSource__Group_4__0__Impl : ( 'source' ) ;
    public final void rule__LogicalSource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1886:1: ( ( 'source' ) )
            // InternalRdfMapping.g:1887:1: ( 'source' )
            {
            // InternalRdfMapping.g:1887:1: ( 'source' )
            // InternalRdfMapping.g:1888:2: 'source'
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
    // InternalRdfMapping.g:1897:1: rule__LogicalSource__Group_4__1 : rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 ;
    public final void rule__LogicalSource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1901:1: ( rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2 )
            // InternalRdfMapping.g:1902:2: rule__LogicalSource__Group_4__1__Impl rule__LogicalSource__Group_4__2
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
    // InternalRdfMapping.g:1909:1: rule__LogicalSource__Group_4__1__Impl : ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) ;
    public final void rule__LogicalSource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1913:1: ( ( ( rule__LogicalSource__SourceAssignment_4_1 ) ) )
            // InternalRdfMapping.g:1914:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            {
            // InternalRdfMapping.g:1914:1: ( ( rule__LogicalSource__SourceAssignment_4_1 ) )
            // InternalRdfMapping.g:1915:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getSourceAssignment_4_1()); 
            // InternalRdfMapping.g:1916:2: ( rule__LogicalSource__SourceAssignment_4_1 )
            // InternalRdfMapping.g:1916:3: rule__LogicalSource__SourceAssignment_4_1
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
    // InternalRdfMapping.g:1924:1: rule__LogicalSource__Group_4__2 : rule__LogicalSource__Group_4__2__Impl ;
    public final void rule__LogicalSource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1928:1: ( rule__LogicalSource__Group_4__2__Impl )
            // InternalRdfMapping.g:1929:2: rule__LogicalSource__Group_4__2__Impl
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
    // InternalRdfMapping.g:1935:1: rule__LogicalSource__Group_4__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1939:1: ( ( ';' ) )
            // InternalRdfMapping.g:1940:1: ( ';' )
            {
            // InternalRdfMapping.g:1940:1: ( ';' )
            // InternalRdfMapping.g:1941:2: ';'
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
    // InternalRdfMapping.g:1951:1: rule__LogicalSource__Group_5__0 : rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 ;
    public final void rule__LogicalSource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1955:1: ( rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1 )
            // InternalRdfMapping.g:1956:2: rule__LogicalSource__Group_5__0__Impl rule__LogicalSource__Group_5__1
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
    // InternalRdfMapping.g:1963:1: rule__LogicalSource__Group_5__0__Impl : ( 'iterator' ) ;
    public final void rule__LogicalSource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1967:1: ( ( 'iterator' ) )
            // InternalRdfMapping.g:1968:1: ( 'iterator' )
            {
            // InternalRdfMapping.g:1968:1: ( 'iterator' )
            // InternalRdfMapping.g:1969:2: 'iterator'
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
    // InternalRdfMapping.g:1978:1: rule__LogicalSource__Group_5__1 : rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 ;
    public final void rule__LogicalSource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1982:1: ( rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2 )
            // InternalRdfMapping.g:1983:2: rule__LogicalSource__Group_5__1__Impl rule__LogicalSource__Group_5__2
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
    // InternalRdfMapping.g:1990:1: rule__LogicalSource__Group_5__1__Impl : ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) ;
    public final void rule__LogicalSource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:1994:1: ( ( ( rule__LogicalSource__IteratorAssignment_5_1 ) ) )
            // InternalRdfMapping.g:1995:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            {
            // InternalRdfMapping.g:1995:1: ( ( rule__LogicalSource__IteratorAssignment_5_1 ) )
            // InternalRdfMapping.g:1996:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            {
             before(grammarAccess.getLogicalSourceAccess().getIteratorAssignment_5_1()); 
            // InternalRdfMapping.g:1997:2: ( rule__LogicalSource__IteratorAssignment_5_1 )
            // InternalRdfMapping.g:1997:3: rule__LogicalSource__IteratorAssignment_5_1
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
    // InternalRdfMapping.g:2005:1: rule__LogicalSource__Group_5__2 : rule__LogicalSource__Group_5__2__Impl ;
    public final void rule__LogicalSource__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2009:1: ( rule__LogicalSource__Group_5__2__Impl )
            // InternalRdfMapping.g:2010:2: rule__LogicalSource__Group_5__2__Impl
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
    // InternalRdfMapping.g:2016:1: rule__LogicalSource__Group_5__2__Impl : ( ';' ) ;
    public final void rule__LogicalSource__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2020:1: ( ( ';' ) )
            // InternalRdfMapping.g:2021:1: ( ';' )
            {
            // InternalRdfMapping.g:2021:1: ( ';' )
            // InternalRdfMapping.g:2022:2: ';'
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
    // InternalRdfMapping.g:2032:1: rule__Referenceable__Group__0 : rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 ;
    public final void rule__Referenceable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2036:1: ( rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1 )
            // InternalRdfMapping.g:2037:2: rule__Referenceable__Group__0__Impl rule__Referenceable__Group__1
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
    // InternalRdfMapping.g:2044:1: rule__Referenceable__Group__0__Impl : ( ( rule__Referenceable__NameAssignment_0 ) ) ;
    public final void rule__Referenceable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2048:1: ( ( ( rule__Referenceable__NameAssignment_0 ) ) )
            // InternalRdfMapping.g:2049:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            {
            // InternalRdfMapping.g:2049:1: ( ( rule__Referenceable__NameAssignment_0 ) )
            // InternalRdfMapping.g:2050:2: ( rule__Referenceable__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceableAccess().getNameAssignment_0()); 
            // InternalRdfMapping.g:2051:2: ( rule__Referenceable__NameAssignment_0 )
            // InternalRdfMapping.g:2051:3: rule__Referenceable__NameAssignment_0
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
    // InternalRdfMapping.g:2059:1: rule__Referenceable__Group__1 : rule__Referenceable__Group__1__Impl ;
    public final void rule__Referenceable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2063:1: ( rule__Referenceable__Group__1__Impl )
            // InternalRdfMapping.g:2064:2: rule__Referenceable__Group__1__Impl
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
    // InternalRdfMapping.g:2070:1: rule__Referenceable__Group__1__Impl : ( ( rule__Referenceable__ValueAssignment_1 )? ) ;
    public final void rule__Referenceable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2074:1: ( ( ( rule__Referenceable__ValueAssignment_1 )? ) )
            // InternalRdfMapping.g:2075:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            {
            // InternalRdfMapping.g:2075:1: ( ( rule__Referenceable__ValueAssignment_1 )? )
            // InternalRdfMapping.g:2076:2: ( rule__Referenceable__ValueAssignment_1 )?
            {
             before(grammarAccess.getReferenceableAccess().getValueAssignment_1()); 
            // InternalRdfMapping.g:2077:2: ( rule__Referenceable__ValueAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRdfMapping.g:2077:3: rule__Referenceable__ValueAssignment_1
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
    // InternalRdfMapping.g:2086:1: rule__Vocabulary__Group__0 : rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 ;
    public final void rule__Vocabulary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2090:1: ( rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1 )
            // InternalRdfMapping.g:2091:2: rule__Vocabulary__Group__0__Impl rule__Vocabulary__Group__1
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
    // InternalRdfMapping.g:2098:1: rule__Vocabulary__Group__0__Impl : ( 'vocabulary' ) ;
    public final void rule__Vocabulary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2102:1: ( ( 'vocabulary' ) )
            // InternalRdfMapping.g:2103:1: ( 'vocabulary' )
            {
            // InternalRdfMapping.g:2103:1: ( 'vocabulary' )
            // InternalRdfMapping.g:2104:2: 'vocabulary'
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
    // InternalRdfMapping.g:2113:1: rule__Vocabulary__Group__1 : rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 ;
    public final void rule__Vocabulary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2117:1: ( rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2 )
            // InternalRdfMapping.g:2118:2: rule__Vocabulary__Group__1__Impl rule__Vocabulary__Group__2
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
    // InternalRdfMapping.g:2125:1: rule__Vocabulary__Group__1__Impl : ( ( rule__Vocabulary__NameAssignment_1 ) ) ;
    public final void rule__Vocabulary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2129:1: ( ( ( rule__Vocabulary__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2130:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2130:1: ( ( rule__Vocabulary__NameAssignment_1 ) )
            // InternalRdfMapping.g:2131:2: ( rule__Vocabulary__NameAssignment_1 )
            {
             before(grammarAccess.getVocabularyAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2132:2: ( rule__Vocabulary__NameAssignment_1 )
            // InternalRdfMapping.g:2132:3: rule__Vocabulary__NameAssignment_1
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
    // InternalRdfMapping.g:2140:1: rule__Vocabulary__Group__2 : rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 ;
    public final void rule__Vocabulary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2144:1: ( rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3 )
            // InternalRdfMapping.g:2145:2: rule__Vocabulary__Group__2__Impl rule__Vocabulary__Group__3
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
    // InternalRdfMapping.g:2152:1: rule__Vocabulary__Group__2__Impl : ( '{' ) ;
    public final void rule__Vocabulary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2156:1: ( ( '{' ) )
            // InternalRdfMapping.g:2157:1: ( '{' )
            {
            // InternalRdfMapping.g:2157:1: ( '{' )
            // InternalRdfMapping.g:2158:2: '{'
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
    // InternalRdfMapping.g:2167:1: rule__Vocabulary__Group__3 : rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 ;
    public final void rule__Vocabulary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2171:1: ( rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4 )
            // InternalRdfMapping.g:2172:2: rule__Vocabulary__Group__3__Impl rule__Vocabulary__Group__4
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
    // InternalRdfMapping.g:2179:1: rule__Vocabulary__Group__3__Impl : ( ( rule__Vocabulary__PrefixAssignment_3 ) ) ;
    public final void rule__Vocabulary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2183:1: ( ( ( rule__Vocabulary__PrefixAssignment_3 ) ) )
            // InternalRdfMapping.g:2184:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            {
            // InternalRdfMapping.g:2184:1: ( ( rule__Vocabulary__PrefixAssignment_3 ) )
            // InternalRdfMapping.g:2185:2: ( rule__Vocabulary__PrefixAssignment_3 )
            {
             before(grammarAccess.getVocabularyAccess().getPrefixAssignment_3()); 
            // InternalRdfMapping.g:2186:2: ( rule__Vocabulary__PrefixAssignment_3 )
            // InternalRdfMapping.g:2186:3: rule__Vocabulary__PrefixAssignment_3
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
    // InternalRdfMapping.g:2194:1: rule__Vocabulary__Group__4 : rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 ;
    public final void rule__Vocabulary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2198:1: ( rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5 )
            // InternalRdfMapping.g:2199:2: rule__Vocabulary__Group__4__Impl rule__Vocabulary__Group__5
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
    // InternalRdfMapping.g:2206:1: rule__Vocabulary__Group__4__Impl : ( ( rule__Vocabulary__Group_4__0 )? ) ;
    public final void rule__Vocabulary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2210:1: ( ( ( rule__Vocabulary__Group_4__0 )? ) )
            // InternalRdfMapping.g:2211:1: ( ( rule__Vocabulary__Group_4__0 )? )
            {
            // InternalRdfMapping.g:2211:1: ( ( rule__Vocabulary__Group_4__0 )? )
            // InternalRdfMapping.g:2212:2: ( rule__Vocabulary__Group_4__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_4()); 
            // InternalRdfMapping.g:2213:2: ( rule__Vocabulary__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdfMapping.g:2213:3: rule__Vocabulary__Group_4__0
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
    // InternalRdfMapping.g:2221:1: rule__Vocabulary__Group__5 : rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 ;
    public final void rule__Vocabulary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2225:1: ( rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6 )
            // InternalRdfMapping.g:2226:2: rule__Vocabulary__Group__5__Impl rule__Vocabulary__Group__6
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
    // InternalRdfMapping.g:2233:1: rule__Vocabulary__Group__5__Impl : ( ( rule__Vocabulary__Group_5__0 )? ) ;
    public final void rule__Vocabulary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2237:1: ( ( ( rule__Vocabulary__Group_5__0 )? ) )
            // InternalRdfMapping.g:2238:1: ( ( rule__Vocabulary__Group_5__0 )? )
            {
            // InternalRdfMapping.g:2238:1: ( ( rule__Vocabulary__Group_5__0 )? )
            // InternalRdfMapping.g:2239:2: ( rule__Vocabulary__Group_5__0 )?
            {
             before(grammarAccess.getVocabularyAccess().getGroup_5()); 
            // InternalRdfMapping.g:2240:2: ( rule__Vocabulary__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdfMapping.g:2240:3: rule__Vocabulary__Group_5__0
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
    // InternalRdfMapping.g:2248:1: rule__Vocabulary__Group__6 : rule__Vocabulary__Group__6__Impl ;
    public final void rule__Vocabulary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2252:1: ( rule__Vocabulary__Group__6__Impl )
            // InternalRdfMapping.g:2253:2: rule__Vocabulary__Group__6__Impl
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
    // InternalRdfMapping.g:2259:1: rule__Vocabulary__Group__6__Impl : ( '}' ) ;
    public final void rule__Vocabulary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2263:1: ( ( '}' ) )
            // InternalRdfMapping.g:2264:1: ( '}' )
            {
            // InternalRdfMapping.g:2264:1: ( '}' )
            // InternalRdfMapping.g:2265:2: '}'
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
    // InternalRdfMapping.g:2275:1: rule__Vocabulary__Group_4__0 : rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 ;
    public final void rule__Vocabulary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2279:1: ( rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1 )
            // InternalRdfMapping.g:2280:2: rule__Vocabulary__Group_4__0__Impl rule__Vocabulary__Group_4__1
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
    // InternalRdfMapping.g:2287:1: rule__Vocabulary__Group_4__0__Impl : ( 'classes' ) ;
    public final void rule__Vocabulary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2291:1: ( ( 'classes' ) )
            // InternalRdfMapping.g:2292:1: ( 'classes' )
            {
            // InternalRdfMapping.g:2292:1: ( 'classes' )
            // InternalRdfMapping.g:2293:2: 'classes'
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
    // InternalRdfMapping.g:2302:1: rule__Vocabulary__Group_4__1 : rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 ;
    public final void rule__Vocabulary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2306:1: ( rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2 )
            // InternalRdfMapping.g:2307:2: rule__Vocabulary__Group_4__1__Impl rule__Vocabulary__Group_4__2
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
    // InternalRdfMapping.g:2314:1: rule__Vocabulary__Group_4__1__Impl : ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) ;
    public final void rule__Vocabulary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2318:1: ( ( ( rule__Vocabulary__ClassesAssignment_4_1 )* ) )
            // InternalRdfMapping.g:2319:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            {
            // InternalRdfMapping.g:2319:1: ( ( rule__Vocabulary__ClassesAssignment_4_1 )* )
            // InternalRdfMapping.g:2320:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getClassesAssignment_4_1()); 
            // InternalRdfMapping.g:2321:2: ( rule__Vocabulary__ClassesAssignment_4_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRdfMapping.g:2321:3: rule__Vocabulary__ClassesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__ClassesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRdfMapping.g:2329:1: rule__Vocabulary__Group_4__2 : rule__Vocabulary__Group_4__2__Impl ;
    public final void rule__Vocabulary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2333:1: ( rule__Vocabulary__Group_4__2__Impl )
            // InternalRdfMapping.g:2334:2: rule__Vocabulary__Group_4__2__Impl
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
    // InternalRdfMapping.g:2340:1: rule__Vocabulary__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2344:1: ( ( ';' ) )
            // InternalRdfMapping.g:2345:1: ( ';' )
            {
            // InternalRdfMapping.g:2345:1: ( ';' )
            // InternalRdfMapping.g:2346:2: ';'
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
    // InternalRdfMapping.g:2356:1: rule__Vocabulary__Group_5__0 : rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 ;
    public final void rule__Vocabulary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2360:1: ( rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1 )
            // InternalRdfMapping.g:2361:2: rule__Vocabulary__Group_5__0__Impl rule__Vocabulary__Group_5__1
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
    // InternalRdfMapping.g:2368:1: rule__Vocabulary__Group_5__0__Impl : ( 'properties' ) ;
    public final void rule__Vocabulary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2372:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:2373:1: ( 'properties' )
            {
            // InternalRdfMapping.g:2373:1: ( 'properties' )
            // InternalRdfMapping.g:2374:2: 'properties'
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
    // InternalRdfMapping.g:2383:1: rule__Vocabulary__Group_5__1 : rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 ;
    public final void rule__Vocabulary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2387:1: ( rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2 )
            // InternalRdfMapping.g:2388:2: rule__Vocabulary__Group_5__1__Impl rule__Vocabulary__Group_5__2
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
    // InternalRdfMapping.g:2395:1: rule__Vocabulary__Group_5__1__Impl : ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) ;
    public final void rule__Vocabulary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2399:1: ( ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* ) )
            // InternalRdfMapping.g:2400:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            {
            // InternalRdfMapping.g:2400:1: ( ( rule__Vocabulary__PropertiesAssignment_5_1 )* )
            // InternalRdfMapping.g:2401:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            {
             before(grammarAccess.getVocabularyAccess().getPropertiesAssignment_5_1()); 
            // InternalRdfMapping.g:2402:2: ( rule__Vocabulary__PropertiesAssignment_5_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRdfMapping.g:2402:3: rule__Vocabulary__PropertiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vocabulary__PropertiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRdfMapping.g:2410:1: rule__Vocabulary__Group_5__2 : rule__Vocabulary__Group_5__2__Impl ;
    public final void rule__Vocabulary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2414:1: ( rule__Vocabulary__Group_5__2__Impl )
            // InternalRdfMapping.g:2415:2: rule__Vocabulary__Group_5__2__Impl
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
    // InternalRdfMapping.g:2421:1: rule__Vocabulary__Group_5__2__Impl : ( ';' ) ;
    public final void rule__Vocabulary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2425:1: ( ( ';' ) )
            // InternalRdfMapping.g:2426:1: ( ';' )
            {
            // InternalRdfMapping.g:2426:1: ( ';' )
            // InternalRdfMapping.g:2427:2: ';'
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
    // InternalRdfMapping.g:2437:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2441:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalRdfMapping.g:2442:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
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
    // InternalRdfMapping.g:2449:1: rule__Prefix__Group__0__Impl : ( 'prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2453:1: ( ( 'prefix' ) )
            // InternalRdfMapping.g:2454:1: ( 'prefix' )
            {
            // InternalRdfMapping.g:2454:1: ( 'prefix' )
            // InternalRdfMapping.g:2455:2: 'prefix'
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
    // InternalRdfMapping.g:2464:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2468:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalRdfMapping.g:2469:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
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
    // InternalRdfMapping.g:2476:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__LabelAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2480:1: ( ( ( rule__Prefix__LabelAssignment_1 ) ) )
            // InternalRdfMapping.g:2481:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            {
            // InternalRdfMapping.g:2481:1: ( ( rule__Prefix__LabelAssignment_1 ) )
            // InternalRdfMapping.g:2482:2: ( rule__Prefix__LabelAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getLabelAssignment_1()); 
            // InternalRdfMapping.g:2483:2: ( rule__Prefix__LabelAssignment_1 )
            // InternalRdfMapping.g:2483:3: rule__Prefix__LabelAssignment_1
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
    // InternalRdfMapping.g:2491:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl rule__Prefix__Group__3 ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2495:1: ( rule__Prefix__Group__2__Impl rule__Prefix__Group__3 )
            // InternalRdfMapping.g:2496:2: rule__Prefix__Group__2__Impl rule__Prefix__Group__3
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
    // InternalRdfMapping.g:2503:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__IriAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2507:1: ( ( ( rule__Prefix__IriAssignment_2 ) ) )
            // InternalRdfMapping.g:2508:1: ( ( rule__Prefix__IriAssignment_2 ) )
            {
            // InternalRdfMapping.g:2508:1: ( ( rule__Prefix__IriAssignment_2 ) )
            // InternalRdfMapping.g:2509:2: ( rule__Prefix__IriAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getIriAssignment_2()); 
            // InternalRdfMapping.g:2510:2: ( rule__Prefix__IriAssignment_2 )
            // InternalRdfMapping.g:2510:3: rule__Prefix__IriAssignment_2
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
    // InternalRdfMapping.g:2518:1: rule__Prefix__Group__3 : rule__Prefix__Group__3__Impl ;
    public final void rule__Prefix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2522:1: ( rule__Prefix__Group__3__Impl )
            // InternalRdfMapping.g:2523:2: rule__Prefix__Group__3__Impl
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
    // InternalRdfMapping.g:2529:1: rule__Prefix__Group__3__Impl : ( ';' ) ;
    public final void rule__Prefix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2533:1: ( ( ';' ) )
            // InternalRdfMapping.g:2534:1: ( ';' )
            {
            // InternalRdfMapping.g:2534:1: ( ';' )
            // InternalRdfMapping.g:2535:2: ';'
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
    // InternalRdfMapping.g:2545:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2549:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalRdfMapping.g:2550:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
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
    // InternalRdfMapping.g:2557:1: rule__Mapping__Group__0__Impl : ( 'map' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2561:1: ( ( 'map' ) )
            // InternalRdfMapping.g:2562:1: ( 'map' )
            {
            // InternalRdfMapping.g:2562:1: ( 'map' )
            // InternalRdfMapping.g:2563:2: 'map'
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
    // InternalRdfMapping.g:2572:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2576:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalRdfMapping.g:2577:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
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
    // InternalRdfMapping.g:2584:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2588:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // InternalRdfMapping.g:2589:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // InternalRdfMapping.g:2589:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // InternalRdfMapping.g:2590:2: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // InternalRdfMapping.g:2591:2: ( rule__Mapping__NameAssignment_1 )
            // InternalRdfMapping.g:2591:3: rule__Mapping__NameAssignment_1
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
    // InternalRdfMapping.g:2599:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2603:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalRdfMapping.g:2604:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
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
    // InternalRdfMapping.g:2611:1: rule__Mapping__Group__2__Impl : ( 'from' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2615:1: ( ( 'from' ) )
            // InternalRdfMapping.g:2616:1: ( 'from' )
            {
            // InternalRdfMapping.g:2616:1: ( 'from' )
            // InternalRdfMapping.g:2617:2: 'from'
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
    // InternalRdfMapping.g:2626:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2630:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalRdfMapping.g:2631:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
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
    // InternalRdfMapping.g:2638:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__SourceAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2642:1: ( ( ( rule__Mapping__SourceAssignment_3 ) ) )
            // InternalRdfMapping.g:2643:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            {
            // InternalRdfMapping.g:2643:1: ( ( rule__Mapping__SourceAssignment_3 ) )
            // InternalRdfMapping.g:2644:2: ( rule__Mapping__SourceAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getSourceAssignment_3()); 
            // InternalRdfMapping.g:2645:2: ( rule__Mapping__SourceAssignment_3 )
            // InternalRdfMapping.g:2645:3: rule__Mapping__SourceAssignment_3
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
    // InternalRdfMapping.g:2653:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2657:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalRdfMapping.g:2658:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
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
    // InternalRdfMapping.g:2665:1: rule__Mapping__Group__4__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2669:1: ( ( '{' ) )
            // InternalRdfMapping.g:2670:1: ( '{' )
            {
            // InternalRdfMapping.g:2670:1: ( '{' )
            // InternalRdfMapping.g:2671:2: '{'
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
    // InternalRdfMapping.g:2680:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2684:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalRdfMapping.g:2685:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
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
    // InternalRdfMapping.g:2692:1: rule__Mapping__Group__5__Impl : ( 'subject' ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2696:1: ( ( 'subject' ) )
            // InternalRdfMapping.g:2697:1: ( 'subject' )
            {
            // InternalRdfMapping.g:2697:1: ( 'subject' )
            // InternalRdfMapping.g:2698:2: 'subject'
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
    // InternalRdfMapping.g:2707:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2711:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalRdfMapping.g:2712:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
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
    // InternalRdfMapping.g:2719:1: rule__Mapping__Group__6__Impl : ( 'template' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2723:1: ( ( 'template' ) )
            // InternalRdfMapping.g:2724:1: ( 'template' )
            {
            // InternalRdfMapping.g:2724:1: ( 'template' )
            // InternalRdfMapping.g:2725:2: 'template'
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
    // InternalRdfMapping.g:2734:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl rule__Mapping__Group__8 ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2738:1: ( rule__Mapping__Group__7__Impl rule__Mapping__Group__8 )
            // InternalRdfMapping.g:2739:2: rule__Mapping__Group__7__Impl rule__Mapping__Group__8
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
    // InternalRdfMapping.g:2746:1: rule__Mapping__Group__7__Impl : ( ( rule__Mapping__PatternAssignment_7 ) ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2750:1: ( ( ( rule__Mapping__PatternAssignment_7 ) ) )
            // InternalRdfMapping.g:2751:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            {
            // InternalRdfMapping.g:2751:1: ( ( rule__Mapping__PatternAssignment_7 ) )
            // InternalRdfMapping.g:2752:2: ( rule__Mapping__PatternAssignment_7 )
            {
             before(grammarAccess.getMappingAccess().getPatternAssignment_7()); 
            // InternalRdfMapping.g:2753:2: ( rule__Mapping__PatternAssignment_7 )
            // InternalRdfMapping.g:2753:3: rule__Mapping__PatternAssignment_7
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
    // InternalRdfMapping.g:2761:1: rule__Mapping__Group__8 : rule__Mapping__Group__8__Impl rule__Mapping__Group__9 ;
    public final void rule__Mapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2765:1: ( rule__Mapping__Group__8__Impl rule__Mapping__Group__9 )
            // InternalRdfMapping.g:2766:2: rule__Mapping__Group__8__Impl rule__Mapping__Group__9
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
    // InternalRdfMapping.g:2773:1: rule__Mapping__Group__8__Impl : ( 'with' ) ;
    public final void rule__Mapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2777:1: ( ( 'with' ) )
            // InternalRdfMapping.g:2778:1: ( 'with' )
            {
            // InternalRdfMapping.g:2778:1: ( 'with' )
            // InternalRdfMapping.g:2779:2: 'with'
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
    // InternalRdfMapping.g:2788:1: rule__Mapping__Group__9 : rule__Mapping__Group__9__Impl rule__Mapping__Group__10 ;
    public final void rule__Mapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2792:1: ( rule__Mapping__Group__9__Impl rule__Mapping__Group__10 )
            // InternalRdfMapping.g:2793:2: rule__Mapping__Group__9__Impl rule__Mapping__Group__10
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
    // InternalRdfMapping.g:2800:1: rule__Mapping__Group__9__Impl : ( ( rule__Mapping__ReferenceAssignment_9 ) ) ;
    public final void rule__Mapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2804:1: ( ( ( rule__Mapping__ReferenceAssignment_9 ) ) )
            // InternalRdfMapping.g:2805:1: ( ( rule__Mapping__ReferenceAssignment_9 ) )
            {
            // InternalRdfMapping.g:2805:1: ( ( rule__Mapping__ReferenceAssignment_9 ) )
            // InternalRdfMapping.g:2806:2: ( rule__Mapping__ReferenceAssignment_9 )
            {
             before(grammarAccess.getMappingAccess().getReferenceAssignment_9()); 
            // InternalRdfMapping.g:2807:2: ( rule__Mapping__ReferenceAssignment_9 )
            // InternalRdfMapping.g:2807:3: rule__Mapping__ReferenceAssignment_9
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
    // InternalRdfMapping.g:2815:1: rule__Mapping__Group__10 : rule__Mapping__Group__10__Impl rule__Mapping__Group__11 ;
    public final void rule__Mapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2819:1: ( rule__Mapping__Group__10__Impl rule__Mapping__Group__11 )
            // InternalRdfMapping.g:2820:2: rule__Mapping__Group__10__Impl rule__Mapping__Group__11
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
    // InternalRdfMapping.g:2827:1: rule__Mapping__Group__10__Impl : ( ( rule__Mapping__Group_10__0 )? ) ;
    public final void rule__Mapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2831:1: ( ( ( rule__Mapping__Group_10__0 )? ) )
            // InternalRdfMapping.g:2832:1: ( ( rule__Mapping__Group_10__0 )? )
            {
            // InternalRdfMapping.g:2832:1: ( ( rule__Mapping__Group_10__0 )? )
            // InternalRdfMapping.g:2833:2: ( rule__Mapping__Group_10__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_10()); 
            // InternalRdfMapping.g:2834:2: ( rule__Mapping__Group_10__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdfMapping.g:2834:3: rule__Mapping__Group_10__0
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
    // InternalRdfMapping.g:2842:1: rule__Mapping__Group__11 : rule__Mapping__Group__11__Impl rule__Mapping__Group__12 ;
    public final void rule__Mapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2846:1: ( rule__Mapping__Group__11__Impl rule__Mapping__Group__12 )
            // InternalRdfMapping.g:2847:2: rule__Mapping__Group__11__Impl rule__Mapping__Group__12
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
    // InternalRdfMapping.g:2854:1: rule__Mapping__Group__11__Impl : ( ( rule__Mapping__Group_11__0 )? ) ;
    public final void rule__Mapping__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2858:1: ( ( ( rule__Mapping__Group_11__0 )? ) )
            // InternalRdfMapping.g:2859:1: ( ( rule__Mapping__Group_11__0 )? )
            {
            // InternalRdfMapping.g:2859:1: ( ( rule__Mapping__Group_11__0 )? )
            // InternalRdfMapping.g:2860:2: ( rule__Mapping__Group_11__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_11()); 
            // InternalRdfMapping.g:2861:2: ( rule__Mapping__Group_11__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRdfMapping.g:2861:3: rule__Mapping__Group_11__0
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
    // InternalRdfMapping.g:2869:1: rule__Mapping__Group__12 : rule__Mapping__Group__12__Impl ;
    public final void rule__Mapping__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2873:1: ( rule__Mapping__Group__12__Impl )
            // InternalRdfMapping.g:2874:2: rule__Mapping__Group__12__Impl
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
    // InternalRdfMapping.g:2880:1: rule__Mapping__Group__12__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2884:1: ( ( '}' ) )
            // InternalRdfMapping.g:2885:1: ( '}' )
            {
            // InternalRdfMapping.g:2885:1: ( '}' )
            // InternalRdfMapping.g:2886:2: '}'
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
    // InternalRdfMapping.g:2896:1: rule__Mapping__Group_10__0 : rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 ;
    public final void rule__Mapping__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2900:1: ( rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1 )
            // InternalRdfMapping.g:2901:2: rule__Mapping__Group_10__0__Impl rule__Mapping__Group_10__1
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
    // InternalRdfMapping.g:2908:1: rule__Mapping__Group_10__0__Impl : ( 'types' ) ;
    public final void rule__Mapping__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2912:1: ( ( 'types' ) )
            // InternalRdfMapping.g:2913:1: ( 'types' )
            {
            // InternalRdfMapping.g:2913:1: ( 'types' )
            // InternalRdfMapping.g:2914:2: 'types'
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
    // InternalRdfMapping.g:2923:1: rule__Mapping__Group_10__1 : rule__Mapping__Group_10__1__Impl ;
    public final void rule__Mapping__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2927:1: ( rule__Mapping__Group_10__1__Impl )
            // InternalRdfMapping.g:2928:2: rule__Mapping__Group_10__1__Impl
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
    // InternalRdfMapping.g:2934:1: rule__Mapping__Group_10__1__Impl : ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) ;
    public final void rule__Mapping__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2938:1: ( ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) ) )
            // InternalRdfMapping.g:2939:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            {
            // InternalRdfMapping.g:2939:1: ( ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* ) )
            // InternalRdfMapping.g:2940:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) ) ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            {
            // InternalRdfMapping.g:2940:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 ) )
            // InternalRdfMapping.g:2941:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:2942:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )
            // InternalRdfMapping.g:2942:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 

            }

            // InternalRdfMapping.g:2945:2: ( ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )* )
            // InternalRdfMapping.g:2946:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            {
             before(grammarAccess.getMappingAccess().getSubjectTypeMappingsAssignment_10_1()); 
            // InternalRdfMapping.g:2947:3: ( rule__Mapping__SubjectTypeMappingsAssignment_10_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRdfMapping.g:2947:4: rule__Mapping__SubjectTypeMappingsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__SubjectTypeMappingsAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalRdfMapping.g:2957:1: rule__Mapping__Group_11__0 : rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 ;
    public final void rule__Mapping__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2961:1: ( rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1 )
            // InternalRdfMapping.g:2962:2: rule__Mapping__Group_11__0__Impl rule__Mapping__Group_11__1
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
    // InternalRdfMapping.g:2969:1: rule__Mapping__Group_11__0__Impl : ( 'properties' ) ;
    public final void rule__Mapping__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2973:1: ( ( 'properties' ) )
            // InternalRdfMapping.g:2974:1: ( 'properties' )
            {
            // InternalRdfMapping.g:2974:1: ( 'properties' )
            // InternalRdfMapping.g:2975:2: 'properties'
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
    // InternalRdfMapping.g:2984:1: rule__Mapping__Group_11__1 : rule__Mapping__Group_11__1__Impl ;
    public final void rule__Mapping__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2988:1: ( rule__Mapping__Group_11__1__Impl )
            // InternalRdfMapping.g:2989:2: rule__Mapping__Group_11__1__Impl
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
    // InternalRdfMapping.g:2995:1: rule__Mapping__Group_11__1__Impl : ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) ;
    public final void rule__Mapping__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:2999:1: ( ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) ) )
            // InternalRdfMapping.g:3000:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            {
            // InternalRdfMapping.g:3000:1: ( ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* ) )
            // InternalRdfMapping.g:3001:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) ) ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            {
            // InternalRdfMapping.g:3001:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 ) )
            // InternalRdfMapping.g:3002:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:3003:3: ( rule__Mapping__PoMappingsAssignment_11_1 )
            // InternalRdfMapping.g:3003:4: rule__Mapping__PoMappingsAssignment_11_1
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__PoMappingsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 

            }

            // InternalRdfMapping.g:3006:2: ( ( rule__Mapping__PoMappingsAssignment_11_1 )* )
            // InternalRdfMapping.g:3007:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            {
             before(grammarAccess.getMappingAccess().getPoMappingsAssignment_11_1()); 
            // InternalRdfMapping.g:3008:3: ( rule__Mapping__PoMappingsAssignment_11_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRdfMapping.g:3008:4: rule__Mapping__PoMappingsAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mapping__PoMappingsAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRdfMapping.g:3018:1: rule__PredicateObjectMapping__Group__0 : rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 ;
    public final void rule__PredicateObjectMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3022:1: ( rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1 )
            // InternalRdfMapping.g:3023:2: rule__PredicateObjectMapping__Group__0__Impl rule__PredicateObjectMapping__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRdfMapping.g:3030:1: rule__PredicateObjectMapping__Group__0__Impl : ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) ;
    public final void rule__PredicateObjectMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3034:1: ( ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) ) )
            // InternalRdfMapping.g:3035:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            {
            // InternalRdfMapping.g:3035:1: ( ( rule__PredicateObjectMapping__PropertyAssignment_0 ) )
            // InternalRdfMapping.g:3036:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyAssignment_0()); 
            // InternalRdfMapping.g:3037:2: ( rule__PredicateObjectMapping__PropertyAssignment_0 )
            // InternalRdfMapping.g:3037:3: rule__PredicateObjectMapping__PropertyAssignment_0
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
    // InternalRdfMapping.g:3045:1: rule__PredicateObjectMapping__Group__1 : rule__PredicateObjectMapping__Group__1__Impl rule__PredicateObjectMapping__Group__2 ;
    public final void rule__PredicateObjectMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3049:1: ( rule__PredicateObjectMapping__Group__1__Impl rule__PredicateObjectMapping__Group__2 )
            // InternalRdfMapping.g:3050:2: rule__PredicateObjectMapping__Group__1__Impl rule__PredicateObjectMapping__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRdfMapping.g:3057:1: rule__PredicateObjectMapping__Group__1__Impl : ( 'from' ) ;
    public final void rule__PredicateObjectMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3061:1: ( ( 'from' ) )
            // InternalRdfMapping.g:3062:1: ( 'from' )
            {
            // InternalRdfMapping.g:3062:1: ( 'from' )
            // InternalRdfMapping.g:3063:2: 'from'
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getFromKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRdfMapping.g:3072:1: rule__PredicateObjectMapping__Group__2 : rule__PredicateObjectMapping__Group__2__Impl rule__PredicateObjectMapping__Group__3 ;
    public final void rule__PredicateObjectMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3076:1: ( rule__PredicateObjectMapping__Group__2__Impl rule__PredicateObjectMapping__Group__3 )
            // InternalRdfMapping.g:3077:2: rule__PredicateObjectMapping__Group__2__Impl rule__PredicateObjectMapping__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__PredicateObjectMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group__3();

            state._fsp--;


            }

        }
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
    // InternalRdfMapping.g:3084:1: rule__PredicateObjectMapping__Group__2__Impl : ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) ) ;
    public final void rule__PredicateObjectMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3088:1: ( ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) ) )
            // InternalRdfMapping.g:3089:1: ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) )
            {
            // InternalRdfMapping.g:3089:1: ( ( rule__PredicateObjectMapping__ReferenceAssignment_2 ) )
            // InternalRdfMapping.g:3090:2: ( rule__PredicateObjectMapping__ReferenceAssignment_2 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getReferenceAssignment_2()); 
            // InternalRdfMapping.g:3091:2: ( rule__PredicateObjectMapping__ReferenceAssignment_2 )
            // InternalRdfMapping.g:3091:3: rule__PredicateObjectMapping__ReferenceAssignment_2
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


    // $ANTLR start "rule__PredicateObjectMapping__Group__3"
    // InternalRdfMapping.g:3099:1: rule__PredicateObjectMapping__Group__3 : rule__PredicateObjectMapping__Group__3__Impl ;
    public final void rule__PredicateObjectMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3103:1: ( rule__PredicateObjectMapping__Group__3__Impl )
            // InternalRdfMapping.g:3104:2: rule__PredicateObjectMapping__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__3"


    // $ANTLR start "rule__PredicateObjectMapping__Group__3__Impl"
    // InternalRdfMapping.g:3110:1: rule__PredicateObjectMapping__Group__3__Impl : ( ( rule__PredicateObjectMapping__Alternatives_3 )? ) ;
    public final void rule__PredicateObjectMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3114:1: ( ( ( rule__PredicateObjectMapping__Alternatives_3 )? ) )
            // InternalRdfMapping.g:3115:1: ( ( rule__PredicateObjectMapping__Alternatives_3 )? )
            {
            // InternalRdfMapping.g:3115:1: ( ( rule__PredicateObjectMapping__Alternatives_3 )? )
            // InternalRdfMapping.g:3116:2: ( rule__PredicateObjectMapping__Alternatives_3 )?
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getAlternatives_3()); 
            // InternalRdfMapping.g:3117:2: ( rule__PredicateObjectMapping__Alternatives_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRdfMapping.g:3117:3: rule__PredicateObjectMapping__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateObjectMapping__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateObjectMappingAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group__3__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_0__0"
    // InternalRdfMapping.g:3126:1: rule__PredicateObjectMapping__Group_3_0__0 : rule__PredicateObjectMapping__Group_3_0__0__Impl rule__PredicateObjectMapping__Group_3_0__1 ;
    public final void rule__PredicateObjectMapping__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3130:1: ( rule__PredicateObjectMapping__Group_3_0__0__Impl rule__PredicateObjectMapping__Group_3_0__1 )
            // InternalRdfMapping.g:3131:2: rule__PredicateObjectMapping__Group_3_0__0__Impl rule__PredicateObjectMapping__Group_3_0__1
            {
            pushFollow(FOLLOW_27);
            rule__PredicateObjectMapping__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_0__0"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_0__0__Impl"
    // InternalRdfMapping.g:3138:1: rule__PredicateObjectMapping__Group_3_0__0__Impl : ( 'with' ) ;
    public final void rule__PredicateObjectMapping__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3142:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3143:1: ( 'with' )
            {
            // InternalRdfMapping.g:3143:1: ( 'with' )
            // InternalRdfMapping.g:3144:2: 'with'
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getWithKeyword_3_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectMappingAccess().getWithKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_0__0__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_0__1"
    // InternalRdfMapping.g:3153:1: rule__PredicateObjectMapping__Group_3_0__1 : rule__PredicateObjectMapping__Group_3_0__1__Impl rule__PredicateObjectMapping__Group_3_0__2 ;
    public final void rule__PredicateObjectMapping__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3157:1: ( rule__PredicateObjectMapping__Group_3_0__1__Impl rule__PredicateObjectMapping__Group_3_0__2 )
            // InternalRdfMapping.g:3158:2: rule__PredicateObjectMapping__Group_3_0__1__Impl rule__PredicateObjectMapping__Group_3_0__2
            {
            pushFollow(FOLLOW_13);
            rule__PredicateObjectMapping__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_0__1"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_0__1__Impl"
    // InternalRdfMapping.g:3165:1: rule__PredicateObjectMapping__Group_3_0__1__Impl : ( 'datatype' ) ;
    public final void rule__PredicateObjectMapping__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3169:1: ( ( 'datatype' ) )
            // InternalRdfMapping.g:3170:1: ( 'datatype' )
            {
            // InternalRdfMapping.g:3170:1: ( 'datatype' )
            // InternalRdfMapping.g:3171:2: 'datatype'
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getDatatypeKeyword_3_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectMappingAccess().getDatatypeKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_0__1__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_0__2"
    // InternalRdfMapping.g:3180:1: rule__PredicateObjectMapping__Group_3_0__2 : rule__PredicateObjectMapping__Group_3_0__2__Impl ;
    public final void rule__PredicateObjectMapping__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3184:1: ( rule__PredicateObjectMapping__Group_3_0__2__Impl )
            // InternalRdfMapping.g:3185:2: rule__PredicateObjectMapping__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_0__2"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_0__2__Impl"
    // InternalRdfMapping.g:3191:1: rule__PredicateObjectMapping__Group_3_0__2__Impl : ( ( rule__PredicateObjectMapping__DatatypeAssignment_3_0_2 ) ) ;
    public final void rule__PredicateObjectMapping__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3195:1: ( ( ( rule__PredicateObjectMapping__DatatypeAssignment_3_0_2 ) ) )
            // InternalRdfMapping.g:3196:1: ( ( rule__PredicateObjectMapping__DatatypeAssignment_3_0_2 ) )
            {
            // InternalRdfMapping.g:3196:1: ( ( rule__PredicateObjectMapping__DatatypeAssignment_3_0_2 ) )
            // InternalRdfMapping.g:3197:2: ( rule__PredicateObjectMapping__DatatypeAssignment_3_0_2 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getDatatypeAssignment_3_0_2()); 
            // InternalRdfMapping.g:3198:2: ( rule__PredicateObjectMapping__DatatypeAssignment_3_0_2 )
            // InternalRdfMapping.g:3198:3: rule__PredicateObjectMapping__DatatypeAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__DatatypeAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectMappingAccess().getDatatypeAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_0__2__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_1__0"
    // InternalRdfMapping.g:3207:1: rule__PredicateObjectMapping__Group_3_1__0 : rule__PredicateObjectMapping__Group_3_1__0__Impl rule__PredicateObjectMapping__Group_3_1__1 ;
    public final void rule__PredicateObjectMapping__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3211:1: ( rule__PredicateObjectMapping__Group_3_1__0__Impl rule__PredicateObjectMapping__Group_3_1__1 )
            // InternalRdfMapping.g:3212:2: rule__PredicateObjectMapping__Group_3_1__0__Impl rule__PredicateObjectMapping__Group_3_1__1
            {
            pushFollow(FOLLOW_28);
            rule__PredicateObjectMapping__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_1__0"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_1__0__Impl"
    // InternalRdfMapping.g:3219:1: rule__PredicateObjectMapping__Group_3_1__0__Impl : ( 'with' ) ;
    public final void rule__PredicateObjectMapping__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3223:1: ( ( 'with' ) )
            // InternalRdfMapping.g:3224:1: ( 'with' )
            {
            // InternalRdfMapping.g:3224:1: ( 'with' )
            // InternalRdfMapping.g:3225:2: 'with'
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getWithKeyword_3_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectMappingAccess().getWithKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_1__0__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_1__1"
    // InternalRdfMapping.g:3234:1: rule__PredicateObjectMapping__Group_3_1__1 : rule__PredicateObjectMapping__Group_3_1__1__Impl rule__PredicateObjectMapping__Group_3_1__2 ;
    public final void rule__PredicateObjectMapping__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3238:1: ( rule__PredicateObjectMapping__Group_3_1__1__Impl rule__PredicateObjectMapping__Group_3_1__2 )
            // InternalRdfMapping.g:3239:2: rule__PredicateObjectMapping__Group_3_1__1__Impl rule__PredicateObjectMapping__Group_3_1__2
            {
            pushFollow(FOLLOW_13);
            rule__PredicateObjectMapping__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_1__1"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_1__1__Impl"
    // InternalRdfMapping.g:3246:1: rule__PredicateObjectMapping__Group_3_1__1__Impl : ( 'language-tag' ) ;
    public final void rule__PredicateObjectMapping__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3250:1: ( ( 'language-tag' ) )
            // InternalRdfMapping.g:3251:1: ( 'language-tag' )
            {
            // InternalRdfMapping.g:3251:1: ( 'language-tag' )
            // InternalRdfMapping.g:3252:2: 'language-tag'
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagKeyword_3_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_1__1__Impl"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_1__2"
    // InternalRdfMapping.g:3261:1: rule__PredicateObjectMapping__Group_3_1__2 : rule__PredicateObjectMapping__Group_3_1__2__Impl ;
    public final void rule__PredicateObjectMapping__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3265:1: ( rule__PredicateObjectMapping__Group_3_1__2__Impl )
            // InternalRdfMapping.g:3266:2: rule__PredicateObjectMapping__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_1__2"


    // $ANTLR start "rule__PredicateObjectMapping__Group_3_1__2__Impl"
    // InternalRdfMapping.g:3272:1: rule__PredicateObjectMapping__Group_3_1__2__Impl : ( ( rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2 ) ) ;
    public final void rule__PredicateObjectMapping__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3276:1: ( ( ( rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2 ) ) )
            // InternalRdfMapping.g:3277:1: ( ( rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2 ) )
            {
            // InternalRdfMapping.g:3277:1: ( ( rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2 ) )
            // InternalRdfMapping.g:3278:2: ( rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2 )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagAssignment_3_1_2()); 
            // InternalRdfMapping.g:3279:2: ( rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2 )
            // InternalRdfMapping.g:3279:3: rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__Group_3_1__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalRdfMapping.g:3288:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3292:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRdfMapping.g:3293:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalRdfMapping.g:3300:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3304:1: ( ( 'import' ) )
            // InternalRdfMapping.g:3305:1: ( 'import' )
            {
            // InternalRdfMapping.g:3305:1: ( 'import' )
            // InternalRdfMapping.g:3306:2: 'import'
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
    // InternalRdfMapping.g:3315:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3319:1: ( rule__Import__Group__1__Impl )
            // InternalRdfMapping.g:3320:2: rule__Import__Group__1__Impl
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
    // InternalRdfMapping.g:3326:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3330:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRdfMapping.g:3331:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRdfMapping.g:3331:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRdfMapping.g:3332:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalRdfMapping.g:3333:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRdfMapping.g:3333:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalRdfMapping.g:3342:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3346:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRdfMapping.g:3347:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRdfMapping.g:3354:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3358:1: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3359:1: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:3359:1: ( ruleQualifiedName )
            // InternalRdfMapping.g:3360:2: ruleQualifiedName
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
    // InternalRdfMapping.g:3369:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3373:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRdfMapping.g:3374:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRdfMapping.g:3380:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3384:1: ( ( ( '.*' )? ) )
            // InternalRdfMapping.g:3385:1: ( ( '.*' )? )
            {
            // InternalRdfMapping.g:3385:1: ( ( '.*' )? )
            // InternalRdfMapping.g:3386:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRdfMapping.g:3387:2: ( '.*' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRdfMapping.g:3387:3: '.*'
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
    // InternalRdfMapping.g:3396:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3400:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRdfMapping.g:3401:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRdfMapping.g:3408:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3412:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3413:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3413:1: ( RULE_ID )
            // InternalRdfMapping.g:3414:2: RULE_ID
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
    // InternalRdfMapping.g:3423:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3427:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRdfMapping.g:3428:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRdfMapping.g:3434:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3438:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRdfMapping.g:3439:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRdfMapping.g:3439:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRdfMapping.g:3440:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRdfMapping.g:3441:2: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRdfMapping.g:3441:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalRdfMapping.g:3450:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3454:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRdfMapping.g:3455:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalRdfMapping.g:3462:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3466:1: ( ( '.' ) )
            // InternalRdfMapping.g:3467:1: ( '.' )
            {
            // InternalRdfMapping.g:3467:1: ( '.' )
            // InternalRdfMapping.g:3468:2: '.'
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
    // InternalRdfMapping.g:3477:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3481:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRdfMapping.g:3482:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRdfMapping.g:3488:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3492:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3493:1: ( RULE_ID )
            {
            // InternalRdfMapping.g:3493:1: ( RULE_ID )
            // InternalRdfMapping.g:3494:2: RULE_ID
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
    // InternalRdfMapping.g:3504:1: rule__Domainmodel__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3508:1: ( ( ruleElement ) )
            // InternalRdfMapping.g:3509:2: ( ruleElement )
            {
            // InternalRdfMapping.g:3509:2: ( ruleElement )
            // InternalRdfMapping.g:3510:3: ruleElement
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
    // InternalRdfMapping.g:3519:1: rule__SourceTypesDefinition__TypesAssignment_3 : ( ruleSourceType ) ;
    public final void rule__SourceTypesDefinition__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3523:1: ( ( ruleSourceType ) )
            // InternalRdfMapping.g:3524:2: ( ruleSourceType )
            {
            // InternalRdfMapping.g:3524:2: ( ruleSourceType )
            // InternalRdfMapping.g:3525:3: ruleSourceType
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
    // InternalRdfMapping.g:3534:1: rule__SourceType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SourceType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3538:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3539:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3539:2: ( RULE_ID )
            // InternalRdfMapping.g:3540:3: RULE_ID
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
    // InternalRdfMapping.g:3549:1: rule__SourceType__ReferenceFormulationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SourceType__ReferenceFormulationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3553:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3554:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3554:2: ( RULE_STRING )
            // InternalRdfMapping.g:3555:3: RULE_STRING
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
    // InternalRdfMapping.g:3564:1: rule__DatatypesDefinition__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__DatatypesDefinition__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3568:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:3569:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:3569:2: ( rulePrefix )
            // InternalRdfMapping.g:3570:3: rulePrefix
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
    // InternalRdfMapping.g:3579:1: rule__DatatypesDefinition__TypesAssignment_4 : ( ruleDatatype ) ;
    public final void rule__DatatypesDefinition__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3583:1: ( ( ruleDatatype ) )
            // InternalRdfMapping.g:3584:2: ( ruleDatatype )
            {
            // InternalRdfMapping.g:3584:2: ( ruleDatatype )
            // InternalRdfMapping.g:3585:3: ruleDatatype
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
    // InternalRdfMapping.g:3594:1: rule__Datatype__NameAssignment : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3598:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3599:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3599:2: ( RULE_ID )
            // InternalRdfMapping.g:3600:3: RULE_ID
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
    // InternalRdfMapping.g:3609:1: rule__LanguageTagDefinition__LanguageTagsAssignment_3 : ( ruleLanguageTag ) ;
    public final void rule__LanguageTagDefinition__LanguageTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3613:1: ( ( ruleLanguageTag ) )
            // InternalRdfMapping.g:3614:2: ( ruleLanguageTag )
            {
            // InternalRdfMapping.g:3614:2: ( ruleLanguageTag )
            // InternalRdfMapping.g:3615:3: ruleLanguageTag
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
    // InternalRdfMapping.g:3624:1: rule__LanguageTag__NameAssignment : ( RULE_ID ) ;
    public final void rule__LanguageTag__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3628:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3629:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3629:2: ( RULE_ID )
            // InternalRdfMapping.g:3630:3: RULE_ID
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
    // InternalRdfMapping.g:3639:1: rule__SourceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SourceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3643:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3644:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3644:2: ( RULE_ID )
            // InternalRdfMapping.g:3645:3: RULE_ID
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
    // InternalRdfMapping.g:3654:1: rule__SourceGroup__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SourceGroup__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3658:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:3659:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:3659:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3660:3: ( RULE_ID )
            {
             before(grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0()); 
            // InternalRdfMapping.g:3661:3: ( RULE_ID )
            // InternalRdfMapping.g:3662:4: RULE_ID
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
    // InternalRdfMapping.g:3673:1: rule__SourceGroup__SourceAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__SourceGroup__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3677:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3678:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3678:2: ( RULE_STRING )
            // InternalRdfMapping.g:3679:3: RULE_STRING
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
    // InternalRdfMapping.g:3688:1: rule__SourceGroup__LogicalSourcesAssignment_7 : ( ruleLogicalSource ) ;
    public final void rule__SourceGroup__LogicalSourcesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3692:1: ( ( ruleLogicalSource ) )
            // InternalRdfMapping.g:3693:2: ( ruleLogicalSource )
            {
            // InternalRdfMapping.g:3693:2: ( ruleLogicalSource )
            // InternalRdfMapping.g:3694:3: ruleLogicalSource
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
    // InternalRdfMapping.g:3703:1: rule__LogicalSource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicalSource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3707:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3708:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3708:2: ( RULE_ID )
            // InternalRdfMapping.g:3709:3: RULE_ID
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
    // InternalRdfMapping.g:3718:1: rule__LogicalSource__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LogicalSource__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3722:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:3723:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:3723:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3724:3: ( RULE_ID )
            {
             before(grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0()); 
            // InternalRdfMapping.g:3725:3: ( RULE_ID )
            // InternalRdfMapping.g:3726:4: RULE_ID
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
    // InternalRdfMapping.g:3737:1: rule__LogicalSource__SourceAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3741:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3742:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3742:2: ( RULE_STRING )
            // InternalRdfMapping.g:3743:3: RULE_STRING
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
    // InternalRdfMapping.g:3752:1: rule__LogicalSource__IteratorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__LogicalSource__IteratorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3756:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3757:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3757:2: ( RULE_STRING )
            // InternalRdfMapping.g:3758:3: RULE_STRING
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
    // InternalRdfMapping.g:3767:1: rule__LogicalSource__ReferencablesAssignment_8 : ( ruleReferenceable ) ;
    public final void rule__LogicalSource__ReferencablesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3771:1: ( ( ruleReferenceable ) )
            // InternalRdfMapping.g:3772:2: ( ruleReferenceable )
            {
            // InternalRdfMapping.g:3772:2: ( ruleReferenceable )
            // InternalRdfMapping.g:3773:3: ruleReferenceable
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
    // InternalRdfMapping.g:3782:1: rule__Referenceable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Referenceable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3786:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3787:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3787:2: ( RULE_ID )
            // InternalRdfMapping.g:3788:3: RULE_ID
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
    // InternalRdfMapping.g:3797:1: rule__Referenceable__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Referenceable__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3801:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3802:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3802:2: ( RULE_STRING )
            // InternalRdfMapping.g:3803:3: RULE_STRING
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
    // InternalRdfMapping.g:3812:1: rule__Vocabulary__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vocabulary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3816:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3817:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3817:2: ( RULE_ID )
            // InternalRdfMapping.g:3818:3: RULE_ID
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
    // InternalRdfMapping.g:3827:1: rule__Vocabulary__PrefixAssignment_3 : ( rulePrefix ) ;
    public final void rule__Vocabulary__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3831:1: ( ( rulePrefix ) )
            // InternalRdfMapping.g:3832:2: ( rulePrefix )
            {
            // InternalRdfMapping.g:3832:2: ( rulePrefix )
            // InternalRdfMapping.g:3833:3: rulePrefix
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
    // InternalRdfMapping.g:3842:1: rule__Vocabulary__ClassesAssignment_4_1 : ( ruleRdfClass ) ;
    public final void rule__Vocabulary__ClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3846:1: ( ( ruleRdfClass ) )
            // InternalRdfMapping.g:3847:2: ( ruleRdfClass )
            {
            // InternalRdfMapping.g:3847:2: ( ruleRdfClass )
            // InternalRdfMapping.g:3848:3: ruleRdfClass
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
    // InternalRdfMapping.g:3857:1: rule__Vocabulary__PropertiesAssignment_5_1 : ( ruleRdfProperty ) ;
    public final void rule__Vocabulary__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3861:1: ( ( ruleRdfProperty ) )
            // InternalRdfMapping.g:3862:2: ( ruleRdfProperty )
            {
            // InternalRdfMapping.g:3862:2: ( ruleRdfProperty )
            // InternalRdfMapping.g:3863:3: ruleRdfProperty
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
    // InternalRdfMapping.g:3872:1: rule__Prefix__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Prefix__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3876:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3877:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3877:2: ( RULE_STRING )
            // InternalRdfMapping.g:3878:3: RULE_STRING
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
    // InternalRdfMapping.g:3887:1: rule__Prefix__IriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__IriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3891:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3892:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3892:2: ( RULE_STRING )
            // InternalRdfMapping.g:3893:3: RULE_STRING
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
    // InternalRdfMapping.g:3902:1: rule__RdfProperty__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfProperty__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3906:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3907:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3907:2: ( RULE_ID )
            // InternalRdfMapping.g:3908:3: RULE_ID
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
    // InternalRdfMapping.g:3917:1: rule__RdfClass__NameAssignment : ( RULE_ID ) ;
    public final void rule__RdfClass__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3921:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3922:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3922:2: ( RULE_ID )
            // InternalRdfMapping.g:3923:3: RULE_ID
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
    // InternalRdfMapping.g:3932:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3936:1: ( ( RULE_ID ) )
            // InternalRdfMapping.g:3937:2: ( RULE_ID )
            {
            // InternalRdfMapping.g:3937:2: ( RULE_ID )
            // InternalRdfMapping.g:3938:3: RULE_ID
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
    // InternalRdfMapping.g:3947:1: rule__Mapping__SourceAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3951:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:3952:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:3952:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3953:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getSourceLogicalSourceCrossReference_3_0()); 
            // InternalRdfMapping.g:3954:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:3955:4: ruleQualifiedName
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
    // InternalRdfMapping.g:3966:1: rule__Mapping__PatternAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Mapping__PatternAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3970:1: ( ( RULE_STRING ) )
            // InternalRdfMapping.g:3971:2: ( RULE_STRING )
            {
            // InternalRdfMapping.g:3971:2: ( RULE_STRING )
            // InternalRdfMapping.g:3972:3: RULE_STRING
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
    // InternalRdfMapping.g:3981:1: rule__Mapping__ReferenceAssignment_9 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__ReferenceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:3985:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:3986:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:3986:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:3987:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getReferenceReferenceableCrossReference_9_0()); 
            // InternalRdfMapping.g:3988:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:3989:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4000:1: rule__Mapping__SubjectTypeMappingsAssignment_10_1 : ( ruleSubjectTypeMapping ) ;
    public final void rule__Mapping__SubjectTypeMappingsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4004:1: ( ( ruleSubjectTypeMapping ) )
            // InternalRdfMapping.g:4005:2: ( ruleSubjectTypeMapping )
            {
            // InternalRdfMapping.g:4005:2: ( ruleSubjectTypeMapping )
            // InternalRdfMapping.g:4006:3: ruleSubjectTypeMapping
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
    // InternalRdfMapping.g:4015:1: rule__Mapping__PoMappingsAssignment_11_1 : ( rulePredicateObjectMapping ) ;
    public final void rule__Mapping__PoMappingsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4019:1: ( ( rulePredicateObjectMapping ) )
            // InternalRdfMapping.g:4020:2: ( rulePredicateObjectMapping )
            {
            // InternalRdfMapping.g:4020:2: ( rulePredicateObjectMapping )
            // InternalRdfMapping.g:4021:3: rulePredicateObjectMapping
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
    // InternalRdfMapping.g:4030:1: rule__SubjectTypeMapping__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubjectTypeMapping__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4034:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4035:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4035:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4036:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassCrossReference_0()); 
            // InternalRdfMapping.g:4037:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4038:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4049:1: rule__PredicateObjectMapping__PropertyAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PredicateObjectMapping__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4053:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4054:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4054:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4055:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0()); 
            // InternalRdfMapping.g:4056:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4057:4: ruleQualifiedName
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
    // InternalRdfMapping.g:4068:1: rule__PredicateObjectMapping__ReferenceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PredicateObjectMapping__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4072:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:4073:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:4073:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:4074:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getReferenceReferenceableCrossReference_2_0()); 
            // InternalRdfMapping.g:4075:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:4076:4: ruleQualifiedName
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


    // $ANTLR start "rule__PredicateObjectMapping__DatatypeAssignment_3_0_2"
    // InternalRdfMapping.g:4087:1: rule__PredicateObjectMapping__DatatypeAssignment_3_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__PredicateObjectMapping__DatatypeAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4091:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4092:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4092:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4093:3: ( RULE_ID )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getDatatypeDatatypeCrossReference_3_0_2_0()); 
            // InternalRdfMapping.g:4094:3: ( RULE_ID )
            // InternalRdfMapping.g:4095:4: RULE_ID
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getDatatypeDatatypeIDTerminalRuleCall_3_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectMappingAccess().getDatatypeDatatypeIDTerminalRuleCall_3_0_2_0_1()); 

            }

             after(grammarAccess.getPredicateObjectMappingAccess().getDatatypeDatatypeCrossReference_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__DatatypeAssignment_3_0_2"


    // $ANTLR start "rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2"
    // InternalRdfMapping.g:4106:1: rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4110:1: ( ( ( RULE_ID ) ) )
            // InternalRdfMapping.g:4111:2: ( ( RULE_ID ) )
            {
            // InternalRdfMapping.g:4111:2: ( ( RULE_ID ) )
            // InternalRdfMapping.g:4112:3: ( RULE_ID )
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagLanguageTagCrossReference_3_1_2_0()); 
            // InternalRdfMapping.g:4113:3: ( RULE_ID )
            // InternalRdfMapping.g:4114:4: RULE_ID
            {
             before(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagLanguageTagIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagLanguageTagIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getPredicateObjectMappingAccess().getLanguageTagLanguageTagCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMapping__LanguageTagAssignment_3_1_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalRdfMapping.g:4125:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdfMapping.g:4129:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:4130:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:4130:2: ( ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:4131:3: ruleQualifiedNameWithWildcard
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000002L});

}