package com.zazuko.experimental.rmdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.zazuko.experimental.rmdsl.services.RdfMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdfMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'datatypes'", "'language-tags'", "'source-group'", "'type'", "';'", "'source'", "'logical-source'", "'iterator'", "'referenceables'", "'vocabulary'", "'classes'", "'properties'", "'prefix'", "'map'", "'from'", "'use-vocabularies'", "'subject'", "'types'", "'with'", "'datatype'", "'language-tag'", "'template'", "'link'", "'import'", "'.*'", "'.'"
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
    public static final int T__40=40;
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

        public InternalRdfMappingParser(TokenStream input, RdfMappingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected RdfMappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalRdfMapping.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalRdfMapping.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalRdfMapping.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalRdfMapping.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalRdfMapping.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalRdfMapping.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=17)||LA1_0==21||LA1_0==24||LA1_0==28||LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRdfMapping.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalRdfMapping.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalRdfMapping.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"com.zazuko.experimental.rmdsl.RdfMapping.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleElement"
    // InternalRdfMapping.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalRdfMapping.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalRdfMapping.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalRdfMapping.g:107:1: ruleElement returns [EObject current=null] : (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_Vocabulary_2= ruleVocabulary | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_DatatypesDefinition_6= ruleDatatypesDefinition | this_LanguageTagDefinition_7= ruleLanguageTagDefinition ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_SourceGroup_0 = null;

        EObject this_LogicalSource_1 = null;

        EObject this_Vocabulary_2 = null;

        EObject this_Mapping_3 = null;

        EObject this_Import_4 = null;

        EObject this_SourceTypesDefinition_5 = null;

        EObject this_DatatypesDefinition_6 = null;

        EObject this_LanguageTagDefinition_7 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:113:2: ( (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_Vocabulary_2= ruleVocabulary | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_DatatypesDefinition_6= ruleDatatypesDefinition | this_LanguageTagDefinition_7= ruleLanguageTagDefinition ) )
            // InternalRdfMapping.g:114:2: (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_Vocabulary_2= ruleVocabulary | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_DatatypesDefinition_6= ruleDatatypesDefinition | this_LanguageTagDefinition_7= ruleLanguageTagDefinition )
            {
            // InternalRdfMapping.g:114:2: (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_Vocabulary_2= ruleVocabulary | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_DatatypesDefinition_6= ruleDatatypesDefinition | this_LanguageTagDefinition_7= ruleLanguageTagDefinition )
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
            case 38:
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
                    // InternalRdfMapping.g:115:3: this_SourceGroup_0= ruleSourceGroup
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSourceGroupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceGroup_0=ruleSourceGroup();

                    state._fsp--;


                    			current = this_SourceGroup_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:124:3: this_LogicalSource_1= ruleLogicalSource
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLogicalSourceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalSource_1=ruleLogicalSource();

                    state._fsp--;


                    			current = this_LogicalSource_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdfMapping.g:133:3: this_Vocabulary_2= ruleVocabulary
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVocabularyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vocabulary_2=ruleVocabulary();

                    state._fsp--;


                    			current = this_Vocabulary_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdfMapping.g:142:3: this_Mapping_3= ruleMapping
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMappingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapping_3=ruleMapping();

                    state._fsp--;


                    			current = this_Mapping_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRdfMapping.g:151:3: this_Import_4= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getImportParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_4=ruleImport();

                    state._fsp--;


                    			current = this_Import_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRdfMapping.g:160:3: this_SourceTypesDefinition_5= ruleSourceTypesDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSourceTypesDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceTypesDefinition_5=ruleSourceTypesDefinition();

                    state._fsp--;


                    			current = this_SourceTypesDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRdfMapping.g:169:3: this_DatatypesDefinition_6= ruleDatatypesDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDatatypesDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatatypesDefinition_6=ruleDatatypesDefinition();

                    state._fsp--;


                    			current = this_DatatypesDefinition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRdfMapping.g:178:3: this_LanguageTagDefinition_7= ruleLanguageTagDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLanguageTagDefinitionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LanguageTagDefinition_7=ruleLanguageTagDefinition();

                    state._fsp--;


                    			current = this_LanguageTagDefinition_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleSourceTypesDefinition"
    // InternalRdfMapping.g:190:1: entryRuleSourceTypesDefinition returns [EObject current=null] : iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF ;
    public final EObject entryRuleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceTypesDefinition = null;


        try {
            // InternalRdfMapping.g:190:62: (iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF )
            // InternalRdfMapping.g:191:2: iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF
            {
             newCompositeNode(grammarAccess.getSourceTypesDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceTypesDefinition=ruleSourceTypesDefinition();

            state._fsp--;

             current =iv_ruleSourceTypesDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceTypesDefinition"


    // $ANTLR start "ruleSourceTypesDefinition"
    // InternalRdfMapping.g:197:1: ruleSourceTypesDefinition returns [EObject current=null] : ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) ;
    public final EObject ruleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:203:2: ( ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) )
            // InternalRdfMapping.g:204:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            {
            // InternalRdfMapping.g:204:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            // InternalRdfMapping.g:205:3: () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}'
            {
            // InternalRdfMapping.g:205:3: ()
            // InternalRdfMapping.g:206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceTypesDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:220:3: ( (lv_types_3_0= ruleSourceType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRdfMapping.g:221:4: (lv_types_3_0= ruleSourceType )
            	    {
            	    // InternalRdfMapping.g:221:4: (lv_types_3_0= ruleSourceType )
            	    // InternalRdfMapping.g:222:5: lv_types_3_0= ruleSourceType
            	    {

            	    					newCompositeNode(grammarAccess.getSourceTypesDefinitionAccess().getTypesSourceTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleSourceType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceTypesDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_3_0,
            	    						"com.zazuko.experimental.rmdsl.RdfMapping.SourceType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSourceTypesDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceTypesDefinition"


    // $ANTLR start "entryRuleSourceType"
    // InternalRdfMapping.g:247:1: entryRuleSourceType returns [EObject current=null] : iv_ruleSourceType= ruleSourceType EOF ;
    public final EObject entryRuleSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceType = null;


        try {
            // InternalRdfMapping.g:247:51: (iv_ruleSourceType= ruleSourceType EOF )
            // InternalRdfMapping.g:248:2: iv_ruleSourceType= ruleSourceType EOF
            {
             newCompositeNode(grammarAccess.getSourceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceType=ruleSourceType();

            state._fsp--;

             current =iv_ruleSourceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceType"


    // $ANTLR start "ruleSourceType"
    // InternalRdfMapping.g:254:1: ruleSourceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_referenceFormulation_2_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:260:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) )
            // InternalRdfMapping.g:261:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            {
            // InternalRdfMapping.g:261:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            // InternalRdfMapping.g:262:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            {
            // InternalRdfMapping.g:262:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:263:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:263:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:264:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSourceTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypeAccess().getReferenceFormulationKeyword_1());
            		
            // InternalRdfMapping.g:284:3: ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:285:4: (lv_referenceFormulation_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:285:4: (lv_referenceFormulation_2_0= RULE_STRING )
            // InternalRdfMapping.g:286:5: lv_referenceFormulation_2_0= RULE_STRING
            {
            lv_referenceFormulation_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_referenceFormulation_2_0, grammarAccess.getSourceTypeAccess().getReferenceFormulationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referenceFormulation",
            						lv_referenceFormulation_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceType"


    // $ANTLR start "entryRuleDatatypesDefinition"
    // InternalRdfMapping.g:306:1: entryRuleDatatypesDefinition returns [EObject current=null] : iv_ruleDatatypesDefinition= ruleDatatypesDefinition EOF ;
    public final EObject entryRuleDatatypesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypesDefinition = null;


        try {
            // InternalRdfMapping.g:306:60: (iv_ruleDatatypesDefinition= ruleDatatypesDefinition EOF )
            // InternalRdfMapping.g:307:2: iv_ruleDatatypesDefinition= ruleDatatypesDefinition EOF
            {
             newCompositeNode(grammarAccess.getDatatypesDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatypesDefinition=ruleDatatypesDefinition();

            state._fsp--;

             current =iv_ruleDatatypesDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypesDefinition"


    // $ANTLR start "ruleDatatypesDefinition"
    // InternalRdfMapping.g:313:1: ruleDatatypesDefinition returns [EObject current=null] : ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' ) ;
    public final EObject ruleDatatypesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_prefix_3_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:319:2: ( ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' ) )
            // InternalRdfMapping.g:320:2: ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' )
            {
            // InternalRdfMapping.g:320:2: ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' )
            // InternalRdfMapping.g:321:3: () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}'
            {
            // InternalRdfMapping.g:321:3: ()
            // InternalRdfMapping.g:322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatatypesDefinitionAccess().getDatatypesDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDatatypesDefinitionAccess().getDatatypesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDatatypesDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:336:3: ( (lv_prefix_3_0= rulePrefix ) )
            // InternalRdfMapping.g:337:4: (lv_prefix_3_0= rulePrefix )
            {
            // InternalRdfMapping.g:337:4: (lv_prefix_3_0= rulePrefix )
            // InternalRdfMapping.g:338:5: lv_prefix_3_0= rulePrefix
            {

            					newCompositeNode(grammarAccess.getDatatypesDefinitionAccess().getPrefixPrefixParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_prefix_3_0=rulePrefix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypesDefinitionRule());
            					}
            					set(
            						current,
            						"prefix",
            						lv_prefix_3_0,
            						"com.zazuko.experimental.rmdsl.RdfMapping.Prefix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdfMapping.g:355:3: ( (lv_types_4_0= ruleDatatype ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRdfMapping.g:356:4: (lv_types_4_0= ruleDatatype )
            	    {
            	    // InternalRdfMapping.g:356:4: (lv_types_4_0= ruleDatatype )
            	    // InternalRdfMapping.g:357:5: lv_types_4_0= ruleDatatype
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypesDefinitionAccess().getTypesDatatypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_types_4_0=ruleDatatype();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatatypesDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_4_0,
            	    						"com.zazuko.experimental.rmdsl.RdfMapping.Datatype");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDatatypesDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatypesDefinition"


    // $ANTLR start "entryRuleDatatype"
    // InternalRdfMapping.g:382:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalRdfMapping.g:382:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalRdfMapping.g:383:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalRdfMapping.g:389:1: ruleDatatype returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:395:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:396:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:396:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:397:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:397:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:398:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDatatypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleLanguageTagDefinition"
    // InternalRdfMapping.g:417:1: entryRuleLanguageTagDefinition returns [EObject current=null] : iv_ruleLanguageTagDefinition= ruleLanguageTagDefinition EOF ;
    public final EObject entryRuleLanguageTagDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageTagDefinition = null;


        try {
            // InternalRdfMapping.g:417:62: (iv_ruleLanguageTagDefinition= ruleLanguageTagDefinition EOF )
            // InternalRdfMapping.g:418:2: iv_ruleLanguageTagDefinition= ruleLanguageTagDefinition EOF
            {
             newCompositeNode(grammarAccess.getLanguageTagDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageTagDefinition=ruleLanguageTagDefinition();

            state._fsp--;

             current =iv_ruleLanguageTagDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageTagDefinition"


    // $ANTLR start "ruleLanguageTagDefinition"
    // InternalRdfMapping.g:424:1: ruleLanguageTagDefinition returns [EObject current=null] : ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' ) ;
    public final EObject ruleLanguageTagDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_languageTags_3_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:430:2: ( ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' ) )
            // InternalRdfMapping.g:431:2: ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' )
            {
            // InternalRdfMapping.g:431:2: ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' )
            // InternalRdfMapping.g:432:3: () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}'
            {
            // InternalRdfMapping.g:432:3: ()
            // InternalRdfMapping.g:433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLanguageTagDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:447:3: ( (lv_languageTags_3_0= ruleLanguageTag ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:448:4: (lv_languageTags_3_0= ruleLanguageTag )
            	    {
            	    // InternalRdfMapping.g:448:4: (lv_languageTags_3_0= ruleLanguageTag )
            	    // InternalRdfMapping.g:449:5: lv_languageTags_3_0= ruleLanguageTag
            	    {

            	    					newCompositeNode(grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsLanguageTagParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_languageTags_3_0=ruleLanguageTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLanguageTagDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"languageTags",
            	    						lv_languageTags_3_0,
            	    						"com.zazuko.experimental.rmdsl.RdfMapping.LanguageTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLanguageTagDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageTagDefinition"


    // $ANTLR start "entryRuleLanguageTag"
    // InternalRdfMapping.g:474:1: entryRuleLanguageTag returns [EObject current=null] : iv_ruleLanguageTag= ruleLanguageTag EOF ;
    public final EObject entryRuleLanguageTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageTag = null;


        try {
            // InternalRdfMapping.g:474:52: (iv_ruleLanguageTag= ruleLanguageTag EOF )
            // InternalRdfMapping.g:475:2: iv_ruleLanguageTag= ruleLanguageTag EOF
            {
             newCompositeNode(grammarAccess.getLanguageTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageTag=ruleLanguageTag();

            state._fsp--;

             current =iv_ruleLanguageTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageTag"


    // $ANTLR start "ruleLanguageTag"
    // InternalRdfMapping.g:481:1: ruleLanguageTag returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLanguageTag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:487:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:488:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:488:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:489:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:489:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:490:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLanguageTagAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLanguageTagRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageTag"


    // $ANTLR start "entryRuleSourceGroup"
    // InternalRdfMapping.g:509:1: entryRuleSourceGroup returns [EObject current=null] : iv_ruleSourceGroup= ruleSourceGroup EOF ;
    public final EObject entryRuleSourceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceGroup = null;


        try {
            // InternalRdfMapping.g:509:52: (iv_ruleSourceGroup= ruleSourceGroup EOF )
            // InternalRdfMapping.g:510:2: iv_ruleSourceGroup= ruleSourceGroup EOF
            {
             newCompositeNode(grammarAccess.getSourceGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceGroup=ruleSourceGroup();

            state._fsp--;

             current =iv_ruleSourceGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceGroup"


    // $ANTLR start "ruleSourceGroup"
    // InternalRdfMapping.g:516:1: ruleSourceGroup returns [EObject current=null] : (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) ;
    public final EObject ruleSourceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_source_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_logicalSources_9_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:522:2: ( (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) )
            // InternalRdfMapping.g:523:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            {
            // InternalRdfMapping.g:523:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            // InternalRdfMapping.g:524:3: otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceGroupAccess().getSourceGroupKeyword_0());
            		
            // InternalRdfMapping.g:528:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:529:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:529:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:530:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSourceGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getSourceGroupAccess().getTypeKeyword_3());
            		
            // InternalRdfMapping.g:554:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdfMapping.g:555:4: (otherlv_4= RULE_ID )
            {
            // InternalRdfMapping.g:555:4: (otherlv_4= RULE_ID )
            // InternalRdfMapping.g:556:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceGroupRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSourceGroupAccess().getSemicolonKeyword_5());
            		
            // InternalRdfMapping.g:571:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdfMapping.g:572:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSourceGroupAccess().getSourceKeyword_6_0());
                    			
                    // InternalRdfMapping.g:576:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:577:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:577:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:578:6: lv_source_7_0= RULE_STRING
                    {
                    lv_source_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_source_7_0, grammarAccess.getSourceGroupAccess().getSourceSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getSourceGroupAccess().getSemicolonKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:599:3: ( (lv_logicalSources_9_0= ruleLogicalSource ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRdfMapping.g:600:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    {
            	    // InternalRdfMapping.g:600:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    // InternalRdfMapping.g:601:5: lv_logicalSources_9_0= ruleLogicalSource
            	    {

            	    					newCompositeNode(grammarAccess.getSourceGroupAccess().getLogicalSourcesLogicalSourceParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_logicalSources_9_0=ruleLogicalSource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"logicalSources",
            	    						lv_logicalSources_9_0,
            	    						"com.zazuko.experimental.rmdsl.RdfMapping.LogicalSource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSourceGroupAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceGroup"


    // $ANTLR start "entryRuleLogicalSource"
    // InternalRdfMapping.g:626:1: entryRuleLogicalSource returns [EObject current=null] : iv_ruleLogicalSource= ruleLogicalSource EOF ;
    public final EObject entryRuleLogicalSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalSource = null;


        try {
            // InternalRdfMapping.g:626:54: (iv_ruleLogicalSource= ruleLogicalSource EOF )
            // InternalRdfMapping.g:627:2: iv_ruleLogicalSource= ruleLogicalSource EOF
            {
             newCompositeNode(grammarAccess.getLogicalSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalSource=ruleLogicalSource();

            state._fsp--;

             current =iv_ruleLogicalSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalSource"


    // $ANTLR start "ruleLogicalSource"
    // InternalRdfMapping.g:633:1: ruleLogicalSource returns [EObject current=null] : (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleLogicalSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_source_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_iterator_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_referencables_14_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:639:2: ( (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalRdfMapping.g:640:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalRdfMapping.g:640:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalRdfMapping.g:641:3: otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0());
            		
            // InternalRdfMapping.g:645:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:646:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:646:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:647:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalSourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:667:3: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:668:4: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0());
                    			
                    // InternalRdfMapping.g:672:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:673:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:673:5: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:674:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalSourceRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:690:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdfMapping.g:691:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0());
                    			
                    // InternalRdfMapping.g:695:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:696:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:696:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:697:6: lv_source_7_0= RULE_STRING
                    {
                    lv_source_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_source_7_0, grammarAccess.getLogicalSourceAccess().getSourceSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalSourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:718:3: (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:719:4: otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0());
                    			
                    // InternalRdfMapping.g:723:4: ( (lv_iterator_10_0= RULE_STRING ) )
                    // InternalRdfMapping.g:724:5: (lv_iterator_10_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:724:5: (lv_iterator_10_0= RULE_STRING )
                    // InternalRdfMapping.g:725:6: lv_iterator_10_0= RULE_STRING
                    {
                    lv_iterator_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_iterator_10_0, grammarAccess.getLogicalSourceAccess().getIteratorSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalSourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iterator",
                    							lv_iterator_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalSourceAccess().getReferenceablesKeyword_6());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalRdfMapping.g:754:3: ( (lv_referencables_14_0= ruleReferenceable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRdfMapping.g:755:4: (lv_referencables_14_0= ruleReferenceable )
            	    {
            	    // InternalRdfMapping.g:755:4: (lv_referencables_14_0= ruleReferenceable )
            	    // InternalRdfMapping.g:756:5: lv_referencables_14_0= ruleReferenceable
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalSourceAccess().getReferencablesReferenceableParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_referencables_14_0=ruleReferenceable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalSourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"referencables",
            	    						lv_referencables_14_0,
            	    						"com.zazuko.experimental.rmdsl.RdfMapping.Referenceable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_15=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalSource"


    // $ANTLR start "entryRuleReferenceable"
    // InternalRdfMapping.g:785:1: entryRuleReferenceable returns [EObject current=null] : iv_ruleReferenceable= ruleReferenceable EOF ;
    public final EObject entryRuleReferenceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceable = null;


        try {
            // InternalRdfMapping.g:785:54: (iv_ruleReferenceable= ruleReferenceable EOF )
            // InternalRdfMapping.g:786:2: iv_ruleReferenceable= ruleReferenceable EOF
            {
             newCompositeNode(grammarAccess.getReferenceableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceable=ruleReferenceable();

            state._fsp--;

             current =iv_ruleReferenceable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceable"


    // $ANTLR start "ruleReferenceable"
    // InternalRdfMapping.g:792:1: ruleReferenceable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleReferenceable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:798:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? ) )
            // InternalRdfMapping.g:799:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? )
            {
            // InternalRdfMapping.g:799:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? )
            // InternalRdfMapping.g:800:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )?
            {
            // InternalRdfMapping.g:800:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:801:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:801:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:802:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReferenceableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRdfMapping.g:818:3: ( (lv_value_1_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdfMapping.g:819:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:819:4: (lv_value_1_0= RULE_STRING )
                    // InternalRdfMapping.g:820:5: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getReferenceableAccess().getValueSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReferenceableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceable"


    // $ANTLR start "entryRuleVocabulary"
    // InternalRdfMapping.g:840:1: entryRuleVocabulary returns [EObject current=null] : iv_ruleVocabulary= ruleVocabulary EOF ;
    public final EObject entryRuleVocabulary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVocabulary = null;


        try {
            // InternalRdfMapping.g:840:51: (iv_ruleVocabulary= ruleVocabulary EOF )
            // InternalRdfMapping.g:841:2: iv_ruleVocabulary= ruleVocabulary EOF
            {
             newCompositeNode(grammarAccess.getVocabularyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVocabulary=ruleVocabulary();

            state._fsp--;

             current =iv_ruleVocabulary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVocabulary"


    // $ANTLR start "ruleVocabulary"
    // InternalRdfMapping.g:847:1: ruleVocabulary returns [EObject current=null] : (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' ) ;
    public final EObject ruleVocabulary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_prefix_3_0 = null;

        EObject lv_classes_5_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:853:2: ( (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' ) )
            // InternalRdfMapping.g:854:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' )
            {
            // InternalRdfMapping.g:854:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' )
            // InternalRdfMapping.g:855:3: otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVocabularyAccess().getVocabularyKeyword_0());
            		
            // InternalRdfMapping.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVocabularyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVocabularyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVocabularyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:881:3: ( (lv_prefix_3_0= rulePrefix ) )
            // InternalRdfMapping.g:882:4: (lv_prefix_3_0= rulePrefix )
            {
            // InternalRdfMapping.g:882:4: (lv_prefix_3_0= rulePrefix )
            // InternalRdfMapping.g:883:5: lv_prefix_3_0= rulePrefix
            {

            					newCompositeNode(grammarAccess.getVocabularyAccess().getPrefixPrefixParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_prefix_3_0=rulePrefix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVocabularyRule());
            					}
            					set(
            						current,
            						"prefix",
            						lv_prefix_3_0,
            						"com.zazuko.experimental.rmdsl.RdfMapping.Prefix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdfMapping.g:900:3: (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdfMapping.g:901:4: otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getVocabularyAccess().getClassesKeyword_4_0());
                    			
                    // InternalRdfMapping.g:905:4: ( (lv_classes_5_0= ruleRdfClass ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRdfMapping.g:906:5: (lv_classes_5_0= ruleRdfClass )
                    	    {
                    	    // InternalRdfMapping.g:906:5: (lv_classes_5_0= ruleRdfClass )
                    	    // InternalRdfMapping.g:907:6: lv_classes_5_0= ruleRdfClass
                    	    {

                    	    						newCompositeNode(grammarAccess.getVocabularyAccess().getClassesRdfClassParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_classes_5_0=ruleRdfClass();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVocabularyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"classes",
                    	    							lv_classes_5_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.RdfClass");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getVocabularyAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:929:3: (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdfMapping.g:930:4: otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0());
                    			
                    // InternalRdfMapping.g:934:4: ( (lv_properties_8_0= ruleRdfProperty ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRdfMapping.g:935:5: (lv_properties_8_0= ruleRdfProperty )
                    	    {
                    	    // InternalRdfMapping.g:935:5: (lv_properties_8_0= ruleRdfProperty )
                    	    // InternalRdfMapping.g:936:6: lv_properties_8_0= ruleRdfProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getVocabularyAccess().getPropertiesRdfPropertyParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_properties_8_0=ruleRdfProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVocabularyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_8_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.RdfProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getVocabularyAccess().getSemicolonKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getVocabularyAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVocabulary"


    // $ANTLR start "entryRulePrefix"
    // InternalRdfMapping.g:966:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalRdfMapping.g:966:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalRdfMapping.g:967:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalRdfMapping.g:973:1: rulePrefix returns [EObject current=null] : (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_iri_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:979:2: ( (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalRdfMapping.g:980:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalRdfMapping.g:980:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalRdfMapping.g:981:3: otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getPrefixKeyword_0());
            		
            // InternalRdfMapping.g:985:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:986:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:986:4: (lv_label_1_0= RULE_STRING )
            // InternalRdfMapping.g:987:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_label_1_0, grammarAccess.getPrefixAccess().getLabelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrefixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRdfMapping.g:1003:3: ( (lv_iri_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:1004:4: (lv_iri_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:1004:4: (lv_iri_2_0= RULE_STRING )
            // InternalRdfMapping.g:1005:5: lv_iri_2_0= RULE_STRING
            {
            lv_iri_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_iri_2_0, grammarAccess.getPrefixAccess().getIriSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrefixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iri",
            						lv_iri_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrefixAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleRdfProperty"
    // InternalRdfMapping.g:1029:1: entryRuleRdfProperty returns [EObject current=null] : iv_ruleRdfProperty= ruleRdfProperty EOF ;
    public final EObject entryRuleRdfProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfProperty = null;


        try {
            // InternalRdfMapping.g:1029:52: (iv_ruleRdfProperty= ruleRdfProperty EOF )
            // InternalRdfMapping.g:1030:2: iv_ruleRdfProperty= ruleRdfProperty EOF
            {
             newCompositeNode(grammarAccess.getRdfPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRdfProperty=ruleRdfProperty();

            state._fsp--;

             current =iv_ruleRdfProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRdfProperty"


    // $ANTLR start "ruleRdfProperty"
    // InternalRdfMapping.g:1036:1: ruleRdfProperty returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1042:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:1043:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:1043:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:1044:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:1044:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:1045:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRdfPropertyAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRdfPropertyRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRdfProperty"


    // $ANTLR start "entryRuleRdfClass"
    // InternalRdfMapping.g:1064:1: entryRuleRdfClass returns [EObject current=null] : iv_ruleRdfClass= ruleRdfClass EOF ;
    public final EObject entryRuleRdfClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfClass = null;


        try {
            // InternalRdfMapping.g:1064:49: (iv_ruleRdfClass= ruleRdfClass EOF )
            // InternalRdfMapping.g:1065:2: iv_ruleRdfClass= ruleRdfClass EOF
            {
             newCompositeNode(grammarAccess.getRdfClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRdfClass=ruleRdfClass();

            state._fsp--;

             current =iv_ruleRdfClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRdfClass"


    // $ANTLR start "ruleRdfClass"
    // InternalRdfMapping.g:1071:1: ruleRdfClass returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1077:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:1078:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:1078:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:1079:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:1079:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:1080:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRdfClassAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRdfClassRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRdfClass"


    // $ANTLR start "entryRuleMapping"
    // InternalRdfMapping.g:1099:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalRdfMapping.g:1099:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalRdfMapping.g:1100:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalRdfMapping.g:1106:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_subjectIriMapping_8_0 = null;

        EObject lv_subjectTypeMappings_10_0 = null;

        EObject lv_poMappings_12_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1112:2: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' ) )
            // InternalRdfMapping.g:1113:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' )
            {
            // InternalRdfMapping.g:1113:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' )
            // InternalRdfMapping.g:1114:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapKeyword_0());
            		
            // InternalRdfMapping.g:1118:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:1119:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:1119:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:1120:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getFromKeyword_2());
            		
            // InternalRdfMapping.g:1140:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1141:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1141:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1142:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getSourceLogicalSourceCrossReference_3_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRdfMapping.g:1160:3: (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdfMapping.g:1161:4: otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getUseVocabulariesKeyword_5_0());
                    			
                    // InternalRdfMapping.g:1165:4: ( ( ruleQualifiedName ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1166:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalRdfMapping.g:1166:5: ( ruleQualifiedName )
                    	    // InternalRdfMapping.g:1167:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMappingRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getTargetVocabulariesVocabularyCrossReference_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getSubjectKeyword_6());
            		
            // InternalRdfMapping.g:1186:3: ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) )
            // InternalRdfMapping.g:1187:4: (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm )
            {
            // InternalRdfMapping.g:1187:4: (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm )
            // InternalRdfMapping.g:1188:5: lv_subjectIriMapping_8_0= ruleTemplateValuedTerm
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getSubjectIriMappingTemplateValuedTermParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_27);
            lv_subjectIriMapping_8_0=ruleTemplateValuedTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					set(
            						current,
            						"subjectIriMapping",
            						lv_subjectIriMapping_8_0,
            						"com.zazuko.experimental.rmdsl.RdfMapping.TemplateValuedTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdfMapping.g:1205:3: (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdfMapping.g:1206:4: otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappingAccess().getTypesKeyword_8_0());
                    			
                    // InternalRdfMapping.g:1210:4: ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1211:5: (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping )
                    	    {
                    	    // InternalRdfMapping.g:1211:5: (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping )
                    	    // InternalRdfMapping.g:1212:6: lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getSubjectTypeMappingsSubjectTypeMappingParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_subjectTypeMappings_10_0=ruleSubjectTypeMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subjectTypeMappings",
                    	    							lv_subjectTypeMappings_10_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.SubjectTypeMapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;

            }

            // InternalRdfMapping.g:1230:3: (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRdfMapping.g:1231:4: otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getMappingAccess().getPropertiesKeyword_9_0());
                    			
                    // InternalRdfMapping.g:1235:4: ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1236:5: (lv_poMappings_12_0= rulePredicateObjectMapping )
                    	    {
                    	    // InternalRdfMapping.g:1236:5: (lv_poMappings_12_0= rulePredicateObjectMapping )
                    	    // InternalRdfMapping.g:1237:6: lv_poMappings_12_0= rulePredicateObjectMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getPoMappingsPredicateObjectMappingParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_poMappings_12_0=rulePredicateObjectMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"poMappings",
                    	    							lv_poMappings_12_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.PredicateObjectMapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleSubjectTypeMapping"
    // InternalRdfMapping.g:1263:1: entryRuleSubjectTypeMapping returns [EObject current=null] : iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF ;
    public final EObject entryRuleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectTypeMapping = null;


        try {
            // InternalRdfMapping.g:1263:59: (iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF )
            // InternalRdfMapping.g:1264:2: iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF
            {
             newCompositeNode(grammarAccess.getSubjectTypeMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubjectTypeMapping=ruleSubjectTypeMapping();

            state._fsp--;

             current =iv_ruleSubjectTypeMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubjectTypeMapping"


    // $ANTLR start "ruleSubjectTypeMapping"
    // InternalRdfMapping.g:1270:1: ruleSubjectTypeMapping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1276:2: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:1277:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:1277:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1278:3: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1278:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:1279:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSubjectTypeMappingRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSubjectTypeMappingAccess().getTypeRdfClassCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubjectTypeMapping"


    // $ANTLR start "entryRulePredicateObjectMapping"
    // InternalRdfMapping.g:1296:1: entryRulePredicateObjectMapping returns [EObject current=null] : iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF ;
    public final EObject entryRulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObjectMapping = null;


        try {
            // InternalRdfMapping.g:1296:63: (iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF )
            // InternalRdfMapping.g:1297:2: iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF
            {
             newCompositeNode(grammarAccess.getPredicateObjectMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicateObjectMapping=rulePredicateObjectMapping();

            state._fsp--;

             current =iv_rulePredicateObjectMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateObjectMapping"


    // $ANTLR start "rulePredicateObjectMapping"
    // InternalRdfMapping.g:1303:1: rulePredicateObjectMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) ) ;
    public final EObject rulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_term_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1309:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) ) )
            // InternalRdfMapping.g:1310:2: ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) )
            {
            // InternalRdfMapping.g:1310:2: ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) )
            // InternalRdfMapping.g:1311:3: ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) )
            {
            // InternalRdfMapping.g:1311:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1312:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1312:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1313:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateObjectMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0());
            				
            pushFollow(FOLLOW_29);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdfMapping.g:1327:3: ( (lv_term_1_0= ruleValuedTerm ) )
            // InternalRdfMapping.g:1328:4: (lv_term_1_0= ruleValuedTerm )
            {
            // InternalRdfMapping.g:1328:4: (lv_term_1_0= ruleValuedTerm )
            // InternalRdfMapping.g:1329:5: lv_term_1_0= ruleValuedTerm
            {

            					newCompositeNode(grammarAccess.getPredicateObjectMappingAccess().getTermValuedTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_term_1_0=ruleValuedTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateObjectMappingRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_1_0,
            						"com.zazuko.experimental.rmdsl.RdfMapping.ValuedTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateObjectMapping"


    // $ANTLR start "entryRuleValuedTerm"
    // InternalRdfMapping.g:1350:1: entryRuleValuedTerm returns [EObject current=null] : iv_ruleValuedTerm= ruleValuedTerm EOF ;
    public final EObject entryRuleValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedTerm = null;


        try {
            // InternalRdfMapping.g:1350:51: (iv_ruleValuedTerm= ruleValuedTerm EOF )
            // InternalRdfMapping.g:1351:2: iv_ruleValuedTerm= ruleValuedTerm EOF
            {
             newCompositeNode(grammarAccess.getValuedTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValuedTerm=ruleValuedTerm();

            state._fsp--;

             current =iv_ruleValuedTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedTerm"


    // $ANTLR start "ruleValuedTerm"
    // InternalRdfMapping.g:1357:1: ruleValuedTerm returns [EObject current=null] : (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm ) ;
    public final EObject ruleValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceValuedTerm_0 = null;

        EObject this_TemplateValuedTerm_1 = null;

        EObject this_LinkedResourceTerm_2 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1363:2: ( (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm ) )
            // InternalRdfMapping.g:1364:2: (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm )
            {
            // InternalRdfMapping.g:1364:2: (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalRdfMapping.g:1365:3: this_ReferenceValuedTerm_0= ruleReferenceValuedTerm
                    {

                    			newCompositeNode(grammarAccess.getValuedTermAccess().getReferenceValuedTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceValuedTerm_0=ruleReferenceValuedTerm();

                    state._fsp--;


                    			current = this_ReferenceValuedTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:1374:3: this_TemplateValuedTerm_1= ruleTemplateValuedTerm
                    {

                    			newCompositeNode(grammarAccess.getValuedTermAccess().getTemplateValuedTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemplateValuedTerm_1=ruleTemplateValuedTerm();

                    state._fsp--;


                    			current = this_TemplateValuedTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdfMapping.g:1383:3: this_LinkedResourceTerm_2= ruleLinkedResourceTerm
                    {

                    			newCompositeNode(grammarAccess.getValuedTermAccess().getLinkedResourceTermParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinkedResourceTerm_2=ruleLinkedResourceTerm();

                    state._fsp--;


                    			current = this_LinkedResourceTerm_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValuedTerm"


    // $ANTLR start "entryRuleReferenceValuedTerm"
    // InternalRdfMapping.g:1395:1: entryRuleReferenceValuedTerm returns [EObject current=null] : iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF ;
    public final EObject entryRuleReferenceValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValuedTerm = null;


        try {
            // InternalRdfMapping.g:1395:60: (iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF )
            // InternalRdfMapping.g:1396:2: iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF
            {
             newCompositeNode(grammarAccess.getReferenceValuedTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceValuedTerm=ruleReferenceValuedTerm();

            state._fsp--;

             current =iv_ruleReferenceValuedTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceValuedTerm"


    // $ANTLR start "ruleReferenceValuedTerm"
    // InternalRdfMapping.g:1402:1: ruleReferenceValuedTerm returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? ) ;
    public final EObject ruleReferenceValuedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1408:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? ) )
            // InternalRdfMapping.g:1409:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? )
            {
            // InternalRdfMapping.g:1409:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? )
            // InternalRdfMapping.g:1410:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceValuedTermAccess().getFromKeyword_0());
            		
            // InternalRdfMapping.g:1414:3: ( (otherlv_1= RULE_ID ) )
            // InternalRdfMapping.g:1415:4: (otherlv_1= RULE_ID )
            {
            // InternalRdfMapping.g:1415:4: (otherlv_1= RULE_ID )
            // InternalRdfMapping.g:1416:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceValuedTermRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableCrossReference_1_0());
            				

            }


            }

            // InternalRdfMapping.g:1427:3: ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==34) ) {
                    alt24=1;
                }
                else if ( (LA24_1==35) ) {
                    alt24=2;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalRdfMapping.g:1428:4: (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalRdfMapping.g:1428:4: (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) )
                    // InternalRdfMapping.g:1429:5: otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_31); 

                    					newLeafNode(otherlv_2, grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_0_0());
                    				
                    otherlv_3=(Token)match(input,34,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getReferenceValuedTermAccess().getDatatypeKeyword_2_0_1());
                    				
                    // InternalRdfMapping.g:1437:5: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:1438:6: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:1438:6: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:1439:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceValuedTermRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_4, grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeCrossReference_2_0_2_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:1452:4: (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalRdfMapping.g:1452:4: (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) )
                    // InternalRdfMapping.g:1453:5: otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_1_0());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_9); 

                    					newLeafNode(otherlv_6, grammarAccess.getReferenceValuedTermAccess().getLanguageTagKeyword_2_1_1());
                    				
                    // InternalRdfMapping.g:1461:5: ( (otherlv_7= RULE_ID ) )
                    // InternalRdfMapping.g:1462:6: (otherlv_7= RULE_ID )
                    {
                    // InternalRdfMapping.g:1462:6: (otherlv_7= RULE_ID )
                    // InternalRdfMapping.g:1463:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceValuedTermRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_7, grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagCrossReference_2_1_2_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceValuedTerm"


    // $ANTLR start "entryRuleTemplateValuedTerm"
    // InternalRdfMapping.g:1480:1: entryRuleTemplateValuedTerm returns [EObject current=null] : iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF ;
    public final EObject entryRuleTemplateValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateValuedTerm = null;


        try {
            // InternalRdfMapping.g:1480:59: (iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF )
            // InternalRdfMapping.g:1481:2: iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF
            {
             newCompositeNode(grammarAccess.getTemplateValuedTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateValuedTerm=ruleTemplateValuedTerm();

            state._fsp--;

             current =iv_ruleTemplateValuedTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateValuedTerm"


    // $ANTLR start "ruleTemplateValuedTerm"
    // InternalRdfMapping.g:1487:1: ruleTemplateValuedTerm returns [EObject current=null] : (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) ;
    public final EObject ruleTemplateValuedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_template_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1493:2: ( (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) )
            // InternalRdfMapping.g:1494:2: (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            {
            // InternalRdfMapping.g:1494:2: (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            // InternalRdfMapping.g:1495:3: otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateValuedTermAccess().getTemplateKeyword_0());
            		
            // InternalRdfMapping.g:1499:3: ( (lv_template_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:1500:4: (lv_template_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:1500:4: (lv_template_1_0= RULE_STRING )
            // InternalRdfMapping.g:1501:5: lv_template_1_0= RULE_STRING
            {
            lv_template_1_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_template_1_0, grammarAccess.getTemplateValuedTermAccess().getTemplateSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateValuedTermRule());
            					}
            					setWithLastConsumed(
            						current,
            						"template",
            						lv_template_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTemplateValuedTermAccess().getWithKeyword_2());
            		
            // InternalRdfMapping.g:1521:3: ( (otherlv_3= RULE_ID ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==EOF||LA25_2==RULE_ID||LA25_2==13||LA25_2==26||LA25_2==32) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalRdfMapping.g:1522:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRdfMapping.g:1522:4: (otherlv_3= RULE_ID )
            	    // InternalRdfMapping.g:1523:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTemplateValuedTermRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    					newLeafNode(otherlv_3, grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateValuedTerm"


    // $ANTLR start "entryRuleLinkedResourceTerm"
    // InternalRdfMapping.g:1538:1: entryRuleLinkedResourceTerm returns [EObject current=null] : iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF ;
    public final EObject entryRuleLinkedResourceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedResourceTerm = null;


        try {
            // InternalRdfMapping.g:1538:59: (iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF )
            // InternalRdfMapping.g:1539:2: iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF
            {
             newCompositeNode(grammarAccess.getLinkedResourceTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkedResourceTerm=ruleLinkedResourceTerm();

            state._fsp--;

             current =iv_ruleLinkedResourceTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkedResourceTerm"


    // $ANTLR start "ruleLinkedResourceTerm"
    // InternalRdfMapping.g:1545:1: ruleLinkedResourceTerm returns [EObject current=null] : (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) ;
    public final EObject ruleLinkedResourceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1551:2: ( (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) )
            // InternalRdfMapping.g:1552:2: (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            {
            // InternalRdfMapping.g:1552:2: (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            // InternalRdfMapping.g:1553:3: otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkedResourceTermAccess().getLinkKeyword_0());
            		
            // InternalRdfMapping.g:1557:3: ( (otherlv_1= RULE_ID ) )
            // InternalRdfMapping.g:1558:4: (otherlv_1= RULE_ID )
            {
            // InternalRdfMapping.g:1558:4: (otherlv_1= RULE_ID )
            // InternalRdfMapping.g:1559:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkedResourceTermRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getLinkedResourceTermAccess().getMappingMappingCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkedResourceTermAccess().getWithKeyword_2());
            		
            // InternalRdfMapping.g:1574:3: ( (otherlv_3= RULE_ID ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==EOF||LA26_2==RULE_ID||LA26_2==13) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalRdfMapping.g:1575:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRdfMapping.g:1575:4: (otherlv_3= RULE_ID )
            	    // InternalRdfMapping.g:1576:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLinkedResourceTermRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    					newLeafNode(otherlv_3, grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkedResourceTerm"


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:1591:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRdfMapping.g:1591:47: (iv_ruleImport= ruleImport EOF )
            // InternalRdfMapping.g:1592:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalRdfMapping.g:1598:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1604:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRdfMapping.g:1605:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRdfMapping.g:1605:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRdfMapping.g:1606:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRdfMapping.g:1610:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:1611:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:1611:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:1612:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.zazuko.experimental.rmdsl.RdfMapping.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalRdfMapping.g:1633:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRdfMapping.g:1633:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:1634:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalRdfMapping.g:1640:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1646:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalRdfMapping.g:1647:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalRdfMapping.g:1647:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalRdfMapping.g:1648:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRdfMapping.g:1658:3: (kw= '.*' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRdfMapping.g:1659:4: kw= '.*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRdfMapping.g:1669:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRdfMapping.g:1669:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRdfMapping.g:1670:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalRdfMapping.g:1676:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1682:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRdfMapping.g:1683:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRdfMapping.g:1683:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRdfMapping.g:1684:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRdfMapping.g:1691:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRdfMapping.g:1692:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004011238802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000D40000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000104002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004002010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000002L});

}