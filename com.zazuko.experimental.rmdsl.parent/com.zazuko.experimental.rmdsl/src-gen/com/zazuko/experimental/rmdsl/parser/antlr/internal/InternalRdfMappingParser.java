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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'datatypes'", "'language-tags'", "'source-group'", "'type'", "'source'", "'logical-source'", "'iterator'", "'referenceables'", "'vocabulary'", "'classes'", "'properties'", "'prefix'", "'map'", "'from'", "'use-vocabularies'", "';'", "'subject'", "'types'", "'with'", "'datatype'", "'language-tag'", "'template'", "'link'", "'import'", "'.*'", "'.'"
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=17)||LA1_0==20||LA1_0==23||LA1_0==27||LA1_0==38) ) {
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
    // InternalRdfMapping.g:107:1: ruleElement returns [EObject current=null] : (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_PrefixHolder_2= rulePrefixHolder | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_LanguageTagDefinition_6= ruleLanguageTagDefinition ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_SourceGroup_0 = null;

        EObject this_LogicalSource_1 = null;

        EObject this_PrefixHolder_2 = null;

        EObject this_Mapping_3 = null;

        EObject this_Import_4 = null;

        EObject this_SourceTypesDefinition_5 = null;

        EObject this_LanguageTagDefinition_6 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:113:2: ( (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_PrefixHolder_2= rulePrefixHolder | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_LanguageTagDefinition_6= ruleLanguageTagDefinition ) )
            // InternalRdfMapping.g:114:2: (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_PrefixHolder_2= rulePrefixHolder | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_LanguageTagDefinition_6= ruleLanguageTagDefinition )
            {
            // InternalRdfMapping.g:114:2: (this_SourceGroup_0= ruleSourceGroup | this_LogicalSource_1= ruleLogicalSource | this_PrefixHolder_2= rulePrefixHolder | this_Mapping_3= ruleMapping | this_Import_4= ruleImport | this_SourceTypesDefinition_5= ruleSourceTypesDefinition | this_LanguageTagDefinition_6= ruleLanguageTagDefinition )
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
                    // InternalRdfMapping.g:133:3: this_PrefixHolder_2= rulePrefixHolder
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPrefixHolderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrefixHolder_2=rulePrefixHolder();

                    state._fsp--;


                    			current = this_PrefixHolder_2;
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
                    // InternalRdfMapping.g:169:3: this_LanguageTagDefinition_6= ruleLanguageTagDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLanguageTagDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LanguageTagDefinition_6=ruleLanguageTagDefinition();

                    state._fsp--;


                    			current = this_LanguageTagDefinition_6;
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
    // InternalRdfMapping.g:181:1: entryRuleSourceTypesDefinition returns [EObject current=null] : iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF ;
    public final EObject entryRuleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceTypesDefinition = null;


        try {
            // InternalRdfMapping.g:181:62: (iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF )
            // InternalRdfMapping.g:182:2: iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF
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
    // InternalRdfMapping.g:188:1: ruleSourceTypesDefinition returns [EObject current=null] : ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) ;
    public final EObject ruleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:194:2: ( ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) )
            // InternalRdfMapping.g:195:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            {
            // InternalRdfMapping.g:195:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            // InternalRdfMapping.g:196:3: () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}'
            {
            // InternalRdfMapping.g:196:3: ()
            // InternalRdfMapping.g:197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceTypesDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:211:3: ( (lv_types_3_0= ruleSourceType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRdfMapping.g:212:4: (lv_types_3_0= ruleSourceType )
            	    {
            	    // InternalRdfMapping.g:212:4: (lv_types_3_0= ruleSourceType )
            	    // InternalRdfMapping.g:213:5: lv_types_3_0= ruleSourceType
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
    // InternalRdfMapping.g:238:1: entryRuleSourceType returns [EObject current=null] : iv_ruleSourceType= ruleSourceType EOF ;
    public final EObject entryRuleSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceType = null;


        try {
            // InternalRdfMapping.g:238:51: (iv_ruleSourceType= ruleSourceType EOF )
            // InternalRdfMapping.g:239:2: iv_ruleSourceType= ruleSourceType EOF
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
    // InternalRdfMapping.g:245:1: ruleSourceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_referenceFormulation_2_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:251:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) )
            // InternalRdfMapping.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            {
            // InternalRdfMapping.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            // InternalRdfMapping.g:253:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            {
            // InternalRdfMapping.g:253:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:254:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:254:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:255:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRdfMapping.g:275:3: ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:276:4: (lv_referenceFormulation_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:276:4: (lv_referenceFormulation_2_0= RULE_STRING )
            // InternalRdfMapping.g:277:5: lv_referenceFormulation_2_0= RULE_STRING
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
    // InternalRdfMapping.g:297:1: entryRuleDatatypesDefinition returns [EObject current=null] : iv_ruleDatatypesDefinition= ruleDatatypesDefinition EOF ;
    public final EObject entryRuleDatatypesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypesDefinition = null;


        try {
            // InternalRdfMapping.g:297:60: (iv_ruleDatatypesDefinition= ruleDatatypesDefinition EOF )
            // InternalRdfMapping.g:298:2: iv_ruleDatatypesDefinition= ruleDatatypesDefinition EOF
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
    // InternalRdfMapping.g:304:1: ruleDatatypesDefinition returns [EObject current=null] : ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' ) ;
    public final EObject ruleDatatypesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_prefix_3_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:310:2: ( ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' ) )
            // InternalRdfMapping.g:311:2: ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' )
            {
            // InternalRdfMapping.g:311:2: ( () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}' )
            // InternalRdfMapping.g:312:3: () otherlv_1= 'datatypes' otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) ( (lv_types_4_0= ruleDatatype ) )* otherlv_5= '}'
            {
            // InternalRdfMapping.g:312:3: ()
            // InternalRdfMapping.g:313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatatypesDefinitionAccess().getDatatypesDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDatatypesDefinitionAccess().getDatatypesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDatatypesDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:327:3: ( (lv_prefix_3_0= rulePrefix ) )
            // InternalRdfMapping.g:328:4: (lv_prefix_3_0= rulePrefix )
            {
            // InternalRdfMapping.g:328:4: (lv_prefix_3_0= rulePrefix )
            // InternalRdfMapping.g:329:5: lv_prefix_3_0= rulePrefix
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

            // InternalRdfMapping.g:346:3: ( (lv_types_4_0= ruleDatatype ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRdfMapping.g:347:4: (lv_types_4_0= ruleDatatype )
            	    {
            	    // InternalRdfMapping.g:347:4: (lv_types_4_0= ruleDatatype )
            	    // InternalRdfMapping.g:348:5: lv_types_4_0= ruleDatatype
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
    // InternalRdfMapping.g:373:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalRdfMapping.g:373:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalRdfMapping.g:374:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalRdfMapping.g:380:1: ruleDatatype returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:386:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:387:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:387:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:388:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:388:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:389:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:408:1: entryRuleLanguageTagDefinition returns [EObject current=null] : iv_ruleLanguageTagDefinition= ruleLanguageTagDefinition EOF ;
    public final EObject entryRuleLanguageTagDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageTagDefinition = null;


        try {
            // InternalRdfMapping.g:408:62: (iv_ruleLanguageTagDefinition= ruleLanguageTagDefinition EOF )
            // InternalRdfMapping.g:409:2: iv_ruleLanguageTagDefinition= ruleLanguageTagDefinition EOF
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
    // InternalRdfMapping.g:415:1: ruleLanguageTagDefinition returns [EObject current=null] : ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' ) ;
    public final EObject ruleLanguageTagDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_languageTags_3_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:421:2: ( ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' ) )
            // InternalRdfMapping.g:422:2: ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' )
            {
            // InternalRdfMapping.g:422:2: ( () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}' )
            // InternalRdfMapping.g:423:3: () otherlv_1= 'language-tags' otherlv_2= '{' ( (lv_languageTags_3_0= ruleLanguageTag ) )* otherlv_4= '}'
            {
            // InternalRdfMapping.g:423:3: ()
            // InternalRdfMapping.g:424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageTagDefinitionAccess().getLanguageTagsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLanguageTagDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:438:3: ( (lv_languageTags_3_0= ruleLanguageTag ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:439:4: (lv_languageTags_3_0= ruleLanguageTag )
            	    {
            	    // InternalRdfMapping.g:439:4: (lv_languageTags_3_0= ruleLanguageTag )
            	    // InternalRdfMapping.g:440:5: lv_languageTags_3_0= ruleLanguageTag
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
    // InternalRdfMapping.g:465:1: entryRuleLanguageTag returns [EObject current=null] : iv_ruleLanguageTag= ruleLanguageTag EOF ;
    public final EObject entryRuleLanguageTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageTag = null;


        try {
            // InternalRdfMapping.g:465:52: (iv_ruleLanguageTag= ruleLanguageTag EOF )
            // InternalRdfMapping.g:466:2: iv_ruleLanguageTag= ruleLanguageTag EOF
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
    // InternalRdfMapping.g:472:1: ruleLanguageTag returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLanguageTag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:478:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:479:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:479:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:480:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:480:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:481:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:500:1: entryRuleSourceGroup returns [EObject current=null] : iv_ruleSourceGroup= ruleSourceGroup EOF ;
    public final EObject entryRuleSourceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceGroup = null;


        try {
            // InternalRdfMapping.g:500:52: (iv_ruleSourceGroup= ruleSourceGroup EOF )
            // InternalRdfMapping.g:501:2: iv_ruleSourceGroup= ruleSourceGroup EOF
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
    // InternalRdfMapping.g:507:1: ruleSourceGroup returns [EObject current=null] : (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? ( (lv_logicalSources_7_0= ruleLogicalSource ) )* otherlv_8= '}' ) ;
    public final EObject ruleSourceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_source_6_0=null;
        Token otherlv_8=null;
        EObject lv_logicalSources_7_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:513:2: ( (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? ( (lv_logicalSources_7_0= ruleLogicalSource ) )* otherlv_8= '}' ) )
            // InternalRdfMapping.g:514:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? ( (lv_logicalSources_7_0= ruleLogicalSource ) )* otherlv_8= '}' )
            {
            // InternalRdfMapping.g:514:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? ( (lv_logicalSources_7_0= ruleLogicalSource ) )* otherlv_8= '}' )
            // InternalRdfMapping.g:515:3: otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? ( (lv_logicalSources_7_0= ruleLogicalSource ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceGroupAccess().getSourceGroupKeyword_0());
            		
            // InternalRdfMapping.g:519:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:520:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:520:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:521:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:545:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdfMapping.g:546:4: (otherlv_4= RULE_ID )
            {
            // InternalRdfMapping.g:546:4: (otherlv_4= RULE_ID )
            // InternalRdfMapping.g:547:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceGroupRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0());
            				

            }


            }

            // InternalRdfMapping.g:558:3: (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdfMapping.g:559:4: otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSourceGroupAccess().getSourceKeyword_5_0());
                    			
                    // InternalRdfMapping.g:563:4: ( (lv_source_6_0= RULE_STRING ) )
                    // InternalRdfMapping.g:564:5: (lv_source_6_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:564:5: (lv_source_6_0= RULE_STRING )
                    // InternalRdfMapping.g:565:6: lv_source_6_0= RULE_STRING
                    {
                    lv_source_6_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_source_6_0, grammarAccess.getSourceGroupAccess().getSourceSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdfMapping.g:582:3: ( (lv_logicalSources_7_0= ruleLogicalSource ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRdfMapping.g:583:4: (lv_logicalSources_7_0= ruleLogicalSource )
            	    {
            	    // InternalRdfMapping.g:583:4: (lv_logicalSources_7_0= ruleLogicalSource )
            	    // InternalRdfMapping.g:584:5: lv_logicalSources_7_0= ruleLogicalSource
            	    {

            	    					newCompositeNode(grammarAccess.getSourceGroupAccess().getLogicalSourcesLogicalSourceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_logicalSources_7_0=ruleLogicalSource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"logicalSources",
            	    						lv_logicalSources_7_0,
            	    						"com.zazuko.experimental.rmdsl.RdfMapping.LogicalSource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSourceGroupAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalRdfMapping.g:609:1: entryRuleLogicalSource returns [EObject current=null] : iv_ruleLogicalSource= ruleLogicalSource EOF ;
    public final EObject entryRuleLogicalSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalSource = null;


        try {
            // InternalRdfMapping.g:609:54: (iv_ruleLogicalSource= ruleLogicalSource EOF )
            // InternalRdfMapping.g:610:2: iv_ruleLogicalSource= ruleLogicalSource EOF
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
    // InternalRdfMapping.g:616:1: ruleLogicalSource returns [EObject current=null] : (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? (otherlv_7= 'iterator' ( (lv_iterator_8_0= RULE_STRING ) ) )? otherlv_9= 'referenceables' otherlv_10= '{' ( (lv_referencables_11_0= ruleReferenceable ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleLogicalSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_source_6_0=null;
        Token otherlv_7=null;
        Token lv_iterator_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_referencables_11_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:622:2: ( (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? (otherlv_7= 'iterator' ( (lv_iterator_8_0= RULE_STRING ) ) )? otherlv_9= 'referenceables' otherlv_10= '{' ( (lv_referencables_11_0= ruleReferenceable ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalRdfMapping.g:623:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? (otherlv_7= 'iterator' ( (lv_iterator_8_0= RULE_STRING ) ) )? otherlv_9= 'referenceables' otherlv_10= '{' ( (lv_referencables_11_0= ruleReferenceable ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalRdfMapping.g:623:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? (otherlv_7= 'iterator' ( (lv_iterator_8_0= RULE_STRING ) ) )? otherlv_9= 'referenceables' otherlv_10= '{' ( (lv_referencables_11_0= ruleReferenceable ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalRdfMapping.g:624:3: otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )? (otherlv_7= 'iterator' ( (lv_iterator_8_0= RULE_STRING ) ) )? otherlv_9= 'referenceables' otherlv_10= '{' ( (lv_referencables_11_0= ruleReferenceable ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0());
            		
            // InternalRdfMapping.g:628:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:629:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:629:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:630:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:650:3: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:651:4: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0());
                    			
                    // InternalRdfMapping.g:655:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:656:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:656:5: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:657:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalSourceRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_4, grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdfMapping.g:669:3: (otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdfMapping.g:670:4: otherlv_5= 'source' ( (lv_source_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0());
                    			
                    // InternalRdfMapping.g:674:4: ( (lv_source_6_0= RULE_STRING ) )
                    // InternalRdfMapping.g:675:5: (lv_source_6_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:675:5: (lv_source_6_0= RULE_STRING )
                    // InternalRdfMapping.g:676:6: lv_source_6_0= RULE_STRING
                    {
                    lv_source_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_source_6_0, grammarAccess.getLogicalSourceAccess().getSourceSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalSourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdfMapping.g:693:3: (otherlv_7= 'iterator' ( (lv_iterator_8_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:694:4: otherlv_7= 'iterator' ( (lv_iterator_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0());
                    			
                    // InternalRdfMapping.g:698:4: ( (lv_iterator_8_0= RULE_STRING ) )
                    // InternalRdfMapping.g:699:5: (lv_iterator_8_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:699:5: (lv_iterator_8_0= RULE_STRING )
                    // InternalRdfMapping.g:700:6: lv_iterator_8_0= RULE_STRING
                    {
                    lv_iterator_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_iterator_8_0, grammarAccess.getLogicalSourceAccess().getIteratorSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalSourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iterator",
                    							lv_iterator_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalSourceAccess().getReferenceablesKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalRdfMapping.g:725:3: ( (lv_referencables_11_0= ruleReferenceable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRdfMapping.g:726:4: (lv_referencables_11_0= ruleReferenceable )
            	    {
            	    // InternalRdfMapping.g:726:4: (lv_referencables_11_0= ruleReferenceable )
            	    // InternalRdfMapping.g:727:5: lv_referencables_11_0= ruleReferenceable
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalSourceAccess().getReferencablesReferenceableParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_referencables_11_0=ruleReferenceable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalSourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"referencables",
            	    						lv_referencables_11_0,
            	    						"com.zazuko.experimental.rmdsl.RdfMapping.Referenceable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalSourceAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalRdfMapping.g:756:1: entryRuleReferenceable returns [EObject current=null] : iv_ruleReferenceable= ruleReferenceable EOF ;
    public final EObject entryRuleReferenceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceable = null;


        try {
            // InternalRdfMapping.g:756:54: (iv_ruleReferenceable= ruleReferenceable EOF )
            // InternalRdfMapping.g:757:2: iv_ruleReferenceable= ruleReferenceable EOF
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
    // InternalRdfMapping.g:763:1: ruleReferenceable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleReferenceable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:769:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? ) )
            // InternalRdfMapping.g:770:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? )
            {
            // InternalRdfMapping.g:770:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? )
            // InternalRdfMapping.g:771:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )?
            {
            // InternalRdfMapping.g:771:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:772:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:772:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:773:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalRdfMapping.g:789:3: ( (lv_value_1_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdfMapping.g:790:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:790:4: (lv_value_1_0= RULE_STRING )
                    // InternalRdfMapping.g:791:5: lv_value_1_0= RULE_STRING
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
    // InternalRdfMapping.g:811:1: entryRuleVocabulary returns [EObject current=null] : iv_ruleVocabulary= ruleVocabulary EOF ;
    public final EObject entryRuleVocabulary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVocabulary = null;


        try {
            // InternalRdfMapping.g:811:51: (iv_ruleVocabulary= ruleVocabulary EOF )
            // InternalRdfMapping.g:812:2: iv_ruleVocabulary= ruleVocabulary EOF
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
    // InternalRdfMapping.g:818:1: ruleVocabulary returns [EObject current=null] : (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* )? (otherlv_6= 'properties' ( (lv_properties_7_0= ruleRdfProperty ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleVocabulary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_prefix_3_0 = null;

        EObject lv_classes_5_0 = null;

        EObject lv_properties_7_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:824:2: ( (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* )? (otherlv_6= 'properties' ( (lv_properties_7_0= ruleRdfProperty ) )* )? otherlv_8= '}' ) )
            // InternalRdfMapping.g:825:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* )? (otherlv_6= 'properties' ( (lv_properties_7_0= ruleRdfProperty ) )* )? otherlv_8= '}' )
            {
            // InternalRdfMapping.g:825:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* )? (otherlv_6= 'properties' ( (lv_properties_7_0= ruleRdfProperty ) )* )? otherlv_8= '}' )
            // InternalRdfMapping.g:826:3: otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* )? (otherlv_6= 'properties' ( (lv_properties_7_0= ruleRdfProperty ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVocabularyAccess().getVocabularyKeyword_0());
            		
            // InternalRdfMapping.g:830:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:831:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:831:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:832:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:852:3: ( (lv_prefix_3_0= rulePrefix ) )
            // InternalRdfMapping.g:853:4: (lv_prefix_3_0= rulePrefix )
            {
            // InternalRdfMapping.g:853:4: (lv_prefix_3_0= rulePrefix )
            // InternalRdfMapping.g:854:5: lv_prefix_3_0= rulePrefix
            {

            					newCompositeNode(grammarAccess.getVocabularyAccess().getPrefixPrefixParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalRdfMapping.g:871:3: (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdfMapping.g:872:4: otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )*
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getVocabularyAccess().getClassesKeyword_4_0());
                    			
                    // InternalRdfMapping.g:876:4: ( (lv_classes_5_0= ruleRdfClass ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRdfMapping.g:877:5: (lv_classes_5_0= ruleRdfClass )
                    	    {
                    	    // InternalRdfMapping.g:877:5: (lv_classes_5_0= ruleRdfClass )
                    	    // InternalRdfMapping.g:878:6: lv_classes_5_0= ruleRdfClass
                    	    {

                    	    						newCompositeNode(grammarAccess.getVocabularyAccess().getClassesRdfClassParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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


                    }
                    break;

            }

            // InternalRdfMapping.g:896:3: (otherlv_6= 'properties' ( (lv_properties_7_0= ruleRdfProperty ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdfMapping.g:897:4: otherlv_6= 'properties' ( (lv_properties_7_0= ruleRdfProperty ) )*
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0());
                    			
                    // InternalRdfMapping.g:901:4: ( (lv_properties_7_0= ruleRdfProperty ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRdfMapping.g:902:5: (lv_properties_7_0= ruleRdfProperty )
                    	    {
                    	    // InternalRdfMapping.g:902:5: (lv_properties_7_0= ruleRdfProperty )
                    	    // InternalRdfMapping.g:903:6: lv_properties_7_0= ruleRdfProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getVocabularyAccess().getPropertiesRdfPropertyParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_properties_7_0=ruleRdfProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVocabularyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_7_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.RdfProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVocabularyAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRulePrefixHolder"
    // InternalRdfMapping.g:929:1: entryRulePrefixHolder returns [EObject current=null] : iv_rulePrefixHolder= rulePrefixHolder EOF ;
    public final EObject entryRulePrefixHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixHolder = null;


        try {
            // InternalRdfMapping.g:929:53: (iv_rulePrefixHolder= rulePrefixHolder EOF )
            // InternalRdfMapping.g:930:2: iv_rulePrefixHolder= rulePrefixHolder EOF
            {
             newCompositeNode(grammarAccess.getPrefixHolderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefixHolder=rulePrefixHolder();

            state._fsp--;

             current =iv_rulePrefixHolder; 
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
    // $ANTLR end "entryRulePrefixHolder"


    // $ANTLR start "rulePrefixHolder"
    // InternalRdfMapping.g:936:1: rulePrefixHolder returns [EObject current=null] : (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary ) ;
    public final EObject rulePrefixHolder() throws RecognitionException {
        EObject current = null;

        EObject this_DatatypesDefinition_0 = null;

        EObject this_Vocabulary_1 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:942:2: ( (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary ) )
            // InternalRdfMapping.g:943:2: (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary )
            {
            // InternalRdfMapping.g:943:2: (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( (LA17_0==23) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdfMapping.g:944:3: this_DatatypesDefinition_0= ruleDatatypesDefinition
                    {

                    			newCompositeNode(grammarAccess.getPrefixHolderAccess().getDatatypesDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatatypesDefinition_0=ruleDatatypesDefinition();

                    state._fsp--;


                    			current = this_DatatypesDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:953:3: this_Vocabulary_1= ruleVocabulary
                    {

                    			newCompositeNode(grammarAccess.getPrefixHolderAccess().getVocabularyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vocabulary_1=ruleVocabulary();

                    state._fsp--;


                    			current = this_Vocabulary_1;
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
    // $ANTLR end "rulePrefixHolder"


    // $ANTLR start "entryRulePrefix"
    // InternalRdfMapping.g:965:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalRdfMapping.g:965:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalRdfMapping.g:966:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalRdfMapping.g:972:1: rulePrefix returns [EObject current=null] : (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_iri_2_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:978:2: ( (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) ) )
            // InternalRdfMapping.g:979:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) )
            {
            // InternalRdfMapping.g:979:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) )
            // InternalRdfMapping.g:980:3: otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getPrefixKeyword_0());
            		
            // InternalRdfMapping.g:984:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:985:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:985:4: (lv_label_1_0= RULE_STRING )
            // InternalRdfMapping.g:986:5: lv_label_1_0= RULE_STRING
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

            // InternalRdfMapping.g:1002:3: ( (lv_iri_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:1003:4: (lv_iri_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:1003:4: (lv_iri_2_0= RULE_STRING )
            // InternalRdfMapping.g:1004:5: lv_iri_2_0= RULE_STRING
            {
            lv_iri_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalRdfMapping.g:1024:1: entryRuleRdfProperty returns [EObject current=null] : iv_ruleRdfProperty= ruleRdfProperty EOF ;
    public final EObject entryRuleRdfProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfProperty = null;


        try {
            // InternalRdfMapping.g:1024:52: (iv_ruleRdfProperty= ruleRdfProperty EOF )
            // InternalRdfMapping.g:1025:2: iv_ruleRdfProperty= ruleRdfProperty EOF
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
    // InternalRdfMapping.g:1031:1: ruleRdfProperty returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1037:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:1038:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:1038:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:1039:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:1039:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:1040:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:1059:1: entryRuleRdfClass returns [EObject current=null] : iv_ruleRdfClass= ruleRdfClass EOF ;
    public final EObject entryRuleRdfClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfClass = null;


        try {
            // InternalRdfMapping.g:1059:49: (iv_ruleRdfClass= ruleRdfClass EOF )
            // InternalRdfMapping.g:1060:2: iv_ruleRdfClass= ruleRdfClass EOF
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
    // InternalRdfMapping.g:1066:1: ruleRdfClass returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1072:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:1073:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:1073:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:1074:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:1074:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:1075:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:1094:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalRdfMapping.g:1094:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalRdfMapping.g:1095:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalRdfMapping.g:1101:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ (otherlv_7= ';' )? )? otherlv_8= 'subject' ( (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ (otherlv_12= ';' )? )? (otherlv_13= 'properties' ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+ )? otherlv_15= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_subjectIriMapping_9_0 = null;

        EObject lv_subjectTypeMappings_11_0 = null;

        EObject lv_poMappings_14_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1107:2: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ (otherlv_7= ';' )? )? otherlv_8= 'subject' ( (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ (otherlv_12= ';' )? )? (otherlv_13= 'properties' ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+ )? otherlv_15= '}' ) )
            // InternalRdfMapping.g:1108:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ (otherlv_7= ';' )? )? otherlv_8= 'subject' ( (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ (otherlv_12= ';' )? )? (otherlv_13= 'properties' ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+ )? otherlv_15= '}' )
            {
            // InternalRdfMapping.g:1108:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ (otherlv_7= ';' )? )? otherlv_8= 'subject' ( (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ (otherlv_12= ';' )? )? (otherlv_13= 'properties' ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+ )? otherlv_15= '}' )
            // InternalRdfMapping.g:1109:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ (otherlv_7= ';' )? )? otherlv_8= 'subject' ( (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ (otherlv_12= ';' )? )? (otherlv_13= 'properties' ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+ )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapKeyword_0());
            		
            // InternalRdfMapping.g:1113:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:1114:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:1114:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:1115:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getFromKeyword_2());
            		
            // InternalRdfMapping.g:1135:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1136:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1136:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1137:5: ruleQualifiedName
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

            otherlv_4=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRdfMapping.g:1155:3: (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ (otherlv_7= ';' )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdfMapping.g:1156:4: otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ (otherlv_7= ';' )?
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getUseVocabulariesKeyword_5_0());
                    			
                    // InternalRdfMapping.g:1160:4: ( ( ruleQualifiedName ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1161:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalRdfMapping.g:1161:5: ( ruleQualifiedName )
                    	    // InternalRdfMapping.g:1162:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMappingRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getTargetVocabulariesVocabularyCrossReference_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // InternalRdfMapping.g:1176:4: (otherlv_7= ';' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalRdfMapping.g:1177:5: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,30,FOLLOW_24); 

                            					newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getSemicolonKeyword_5_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getMappingAccess().getSubjectKeyword_6());
            		
            // InternalRdfMapping.g:1187:3: ( (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm ) )
            // InternalRdfMapping.g:1188:4: (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm )
            {
            // InternalRdfMapping.g:1188:4: (lv_subjectIriMapping_9_0= ruleTemplateValuedTerm )
            // InternalRdfMapping.g:1189:5: lv_subjectIriMapping_9_0= ruleTemplateValuedTerm
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getSubjectIriMappingTemplateValuedTermParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
            lv_subjectIriMapping_9_0=ruleTemplateValuedTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					set(
            						current,
            						"subjectIriMapping",
            						lv_subjectIriMapping_9_0,
            						"com.zazuko.experimental.rmdsl.RdfMapping.TemplateValuedTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdfMapping.g:1206:3: (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ (otherlv_12= ';' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRdfMapping.g:1207:4: otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ (otherlv_12= ';' )?
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getMappingAccess().getTypesKeyword_8_0());
                    			
                    // InternalRdfMapping.g:1211:4: ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+
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
                    	    // InternalRdfMapping.g:1212:5: (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping )
                    	    {
                    	    // InternalRdfMapping.g:1212:5: (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping )
                    	    // InternalRdfMapping.g:1213:6: lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getSubjectTypeMappingsSubjectTypeMappingParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_subjectTypeMappings_11_0=ruleSubjectTypeMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subjectTypeMappings",
                    	    							lv_subjectTypeMappings_11_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.SubjectTypeMapping");
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

                    // InternalRdfMapping.g:1230:4: (otherlv_12= ';' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==30) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalRdfMapping.g:1231:5: otherlv_12= ';'
                            {
                            otherlv_12=(Token)match(input,30,FOLLOW_28); 

                            					newLeafNode(otherlv_12, grammarAccess.getMappingAccess().getSemicolonKeyword_8_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalRdfMapping.g:1237:3: (otherlv_13= 'properties' ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRdfMapping.g:1238:4: otherlv_13= 'properties' ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getMappingAccess().getPropertiesKeyword_9_0());
                    			
                    // InternalRdfMapping.g:1242:4: ( (lv_poMappings_14_0= rulePredicateObjectMapping ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1243:5: (lv_poMappings_14_0= rulePredicateObjectMapping )
                    	    {
                    	    // InternalRdfMapping.g:1243:5: (lv_poMappings_14_0= rulePredicateObjectMapping )
                    	    // InternalRdfMapping.g:1244:6: lv_poMappings_14_0= rulePredicateObjectMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getPoMappingsPredicateObjectMappingParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_poMappings_14_0=rulePredicateObjectMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"poMappings",
                    	    							lv_poMappings_14_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.PredicateObjectMapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalRdfMapping.g:1270:1: entryRuleSubjectTypeMapping returns [EObject current=null] : iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF ;
    public final EObject entryRuleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectTypeMapping = null;


        try {
            // InternalRdfMapping.g:1270:59: (iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF )
            // InternalRdfMapping.g:1271:2: iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF
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
    // InternalRdfMapping.g:1277:1: ruleSubjectTypeMapping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1283:2: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:1284:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:1284:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1285:3: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1285:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:1286:4: ruleQualifiedName
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
    // InternalRdfMapping.g:1303:1: entryRulePredicateObjectMapping returns [EObject current=null] : iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF ;
    public final EObject entryRulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObjectMapping = null;


        try {
            // InternalRdfMapping.g:1303:63: (iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF )
            // InternalRdfMapping.g:1304:2: iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF
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
    // InternalRdfMapping.g:1310:1: rulePredicateObjectMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) ) ;
    public final EObject rulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_term_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1316:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) ) )
            // InternalRdfMapping.g:1317:2: ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) )
            {
            // InternalRdfMapping.g:1317:2: ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) )
            // InternalRdfMapping.g:1318:3: ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) )
            {
            // InternalRdfMapping.g:1318:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1319:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1319:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1320:5: ruleQualifiedName
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

            // InternalRdfMapping.g:1334:3: ( (lv_term_1_0= ruleValuedTerm ) )
            // InternalRdfMapping.g:1335:4: (lv_term_1_0= ruleValuedTerm )
            {
            // InternalRdfMapping.g:1335:4: (lv_term_1_0= ruleValuedTerm )
            // InternalRdfMapping.g:1336:5: lv_term_1_0= ruleValuedTerm
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
    // InternalRdfMapping.g:1357:1: entryRuleValuedTerm returns [EObject current=null] : iv_ruleValuedTerm= ruleValuedTerm EOF ;
    public final EObject entryRuleValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedTerm = null;


        try {
            // InternalRdfMapping.g:1357:51: (iv_ruleValuedTerm= ruleValuedTerm EOF )
            // InternalRdfMapping.g:1358:2: iv_ruleValuedTerm= ruleValuedTerm EOF
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
    // InternalRdfMapping.g:1364:1: ruleValuedTerm returns [EObject current=null] : (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm ) ;
    public final EObject ruleValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceValuedTerm_0 = null;

        EObject this_TemplateValuedTerm_1 = null;

        EObject this_LinkedResourceTerm_2 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1370:2: ( (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm ) )
            // InternalRdfMapping.g:1371:2: (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm )
            {
            // InternalRdfMapping.g:1371:2: (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt26=1;
                }
                break;
            case 36:
                {
                alt26=2;
                }
                break;
            case 37:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRdfMapping.g:1372:3: this_ReferenceValuedTerm_0= ruleReferenceValuedTerm
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
                    // InternalRdfMapping.g:1381:3: this_TemplateValuedTerm_1= ruleTemplateValuedTerm
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
                    // InternalRdfMapping.g:1390:3: this_LinkedResourceTerm_2= ruleLinkedResourceTerm
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
    // InternalRdfMapping.g:1402:1: entryRuleReferenceValuedTerm returns [EObject current=null] : iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF ;
    public final EObject entryRuleReferenceValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValuedTerm = null;


        try {
            // InternalRdfMapping.g:1402:60: (iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF )
            // InternalRdfMapping.g:1403:2: iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF
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
    // InternalRdfMapping.g:1409:1: ruleReferenceValuedTerm returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= ';' )? ) ;
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
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1415:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= ';' )? ) )
            // InternalRdfMapping.g:1416:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= ';' )? )
            {
            // InternalRdfMapping.g:1416:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= ';' )? )
            // InternalRdfMapping.g:1417:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceValuedTermAccess().getFromKeyword_0());
            		
            // InternalRdfMapping.g:1421:3: ( (otherlv_1= RULE_ID ) )
            // InternalRdfMapping.g:1422:4: (otherlv_1= RULE_ID )
            {
            // InternalRdfMapping.g:1422:4: (otherlv_1= RULE_ID )
            // InternalRdfMapping.g:1423:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceValuedTermRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableCrossReference_1_0());
            				

            }


            }

            // InternalRdfMapping.g:1434:3: ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==34) ) {
                    alt27=1;
                }
                else if ( (LA27_1==35) ) {
                    alt27=2;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalRdfMapping.g:1435:4: (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalRdfMapping.g:1435:4: (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) )
                    // InternalRdfMapping.g:1436:5: otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_31); 

                    					newLeafNode(otherlv_2, grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_0_0());
                    				
                    otherlv_3=(Token)match(input,34,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getReferenceValuedTermAccess().getDatatypeKeyword_2_0_1());
                    				
                    // InternalRdfMapping.g:1444:5: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:1445:6: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:1445:6: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:1446:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceValuedTermRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_32); 

                    							newLeafNode(otherlv_4, grammarAccess.getReferenceValuedTermAccess().getDatatypeDatatypeCrossReference_2_0_2_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:1459:4: (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalRdfMapping.g:1459:4: (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) )
                    // InternalRdfMapping.g:1460:5: otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33); 

                    					newLeafNode(otherlv_5, grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_1_0());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_9); 

                    					newLeafNode(otherlv_6, grammarAccess.getReferenceValuedTermAccess().getLanguageTagKeyword_2_1_1());
                    				
                    // InternalRdfMapping.g:1468:5: ( (otherlv_7= RULE_ID ) )
                    // InternalRdfMapping.g:1469:6: (otherlv_7= RULE_ID )
                    {
                    // InternalRdfMapping.g:1469:6: (otherlv_7= RULE_ID )
                    // InternalRdfMapping.g:1470:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceValuedTermRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_32); 

                    							newLeafNode(otherlv_7, grammarAccess.getReferenceValuedTermAccess().getLanguageTagLanguageTagCrossReference_2_1_2_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRdfMapping.g:1483:3: (otherlv_8= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRdfMapping.g:1484:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getReferenceValuedTermAccess().getSemicolonKeyword_3());
                    			

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
    // InternalRdfMapping.g:1493:1: entryRuleTemplateValuedTerm returns [EObject current=null] : iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF ;
    public final EObject entryRuleTemplateValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateValuedTerm = null;


        try {
            // InternalRdfMapping.g:1493:59: (iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF )
            // InternalRdfMapping.g:1494:2: iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF
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
    // InternalRdfMapping.g:1500:1: ruleTemplateValuedTerm returns [EObject current=null] : (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? ) ;
    public final EObject ruleTemplateValuedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_template_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1506:2: ( (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? ) )
            // InternalRdfMapping.g:1507:2: (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? )
            {
            // InternalRdfMapping.g:1507:2: (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? )
            // InternalRdfMapping.g:1508:3: otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateValuedTermAccess().getTemplateKeyword_0());
            		
            // InternalRdfMapping.g:1512:3: ( (lv_template_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:1513:4: (lv_template_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:1513:4: (lv_template_1_0= RULE_STRING )
            // InternalRdfMapping.g:1514:5: lv_template_1_0= RULE_STRING
            {
            lv_template_1_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
            		
            // InternalRdfMapping.g:1534:3: ( (otherlv_3= RULE_ID ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==EOF||LA29_2==RULE_ID||LA29_2==13||LA29_2==25||LA29_2==30||LA29_2==32) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalRdfMapping.g:1535:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRdfMapping.g:1535:4: (otherlv_3= RULE_ID )
            	    // InternalRdfMapping.g:1536:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTemplateValuedTermRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_3, grammarAccess.getTemplateValuedTermAccess().getReferencesReferenceableCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // InternalRdfMapping.g:1547:3: (otherlv_4= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRdfMapping.g:1548:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemplateValuedTermAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleTemplateValuedTerm"


    // $ANTLR start "entryRuleLinkedResourceTerm"
    // InternalRdfMapping.g:1557:1: entryRuleLinkedResourceTerm returns [EObject current=null] : iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF ;
    public final EObject entryRuleLinkedResourceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedResourceTerm = null;


        try {
            // InternalRdfMapping.g:1557:59: (iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF )
            // InternalRdfMapping.g:1558:2: iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF
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
    // InternalRdfMapping.g:1564:1: ruleLinkedResourceTerm returns [EObject current=null] : (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? ) ;
    public final EObject ruleLinkedResourceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1570:2: ( (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? ) )
            // InternalRdfMapping.g:1571:2: (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? )
            {
            // InternalRdfMapping.g:1571:2: (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )? )
            // InternalRdfMapping.g:1572:3: otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkedResourceTermAccess().getLinkKeyword_0());
            		
            // InternalRdfMapping.g:1576:3: ( (otherlv_1= RULE_ID ) )
            // InternalRdfMapping.g:1577:4: (otherlv_1= RULE_ID )
            {
            // InternalRdfMapping.g:1577:4: (otherlv_1= RULE_ID )
            // InternalRdfMapping.g:1578:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkedResourceTermRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getLinkedResourceTermAccess().getMappingMappingCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkedResourceTermAccess().getWithKeyword_2());
            		
            // InternalRdfMapping.g:1593:3: ( (otherlv_3= RULE_ID ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==EOF||LA31_2==RULE_ID||LA31_2==13||LA31_2==30) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalRdfMapping.g:1594:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRdfMapping.g:1594:4: (otherlv_3= RULE_ID )
            	    // InternalRdfMapping.g:1595:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLinkedResourceTermRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(otherlv_3, grammarAccess.getLinkedResourceTermAccess().getReferencesReferenceableCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // InternalRdfMapping.g:1606:3: (otherlv_4= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRdfMapping.g:1607:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkedResourceTermAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleLinkedResourceTerm"


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:1616:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRdfMapping.g:1616:47: (iv_ruleImport= ruleImport EOF )
            // InternalRdfMapping.g:1617:2: iv_ruleImport= ruleImport EOF
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
    // InternalRdfMapping.g:1623:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1629:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRdfMapping.g:1630:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRdfMapping.g:1630:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRdfMapping.g:1631:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRdfMapping.g:1635:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:1636:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:1636:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:1637:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalRdfMapping.g:1658:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRdfMapping.g:1658:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:1659:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:1665:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1671:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalRdfMapping.g:1672:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalRdfMapping.g:1672:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalRdfMapping.g:1673:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRdfMapping.g:1683:3: (kw= '.*' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRdfMapping.g:1684:4: kw= '.*'
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
    // InternalRdfMapping.g:1694:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRdfMapping.g:1694:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRdfMapping.g:1695:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRdfMapping.g:1701:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1707:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRdfMapping.g:1708:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRdfMapping.g:1708:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRdfMapping.g:1709:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRdfMapping.g:1716:3: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==40) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRdfMapping.g:1717:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004008938802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000006C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000102002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000042002010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});

}