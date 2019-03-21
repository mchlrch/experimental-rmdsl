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
            case 21:
                {
                alt2=2;
                }
                break;
            case 15:
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
    // InternalRdfMapping.g:507:1: ruleSourceGroup returns [EObject current=null] : (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) ;
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
            // InternalRdfMapping.g:513:2: ( (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) )
            // InternalRdfMapping.g:514:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            {
            // InternalRdfMapping.g:514:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            // InternalRdfMapping.g:515:3: otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}'
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

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSourceGroupAccess().getSemicolonKeyword_5());
            		
            // InternalRdfMapping.g:562:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdfMapping.g:563:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSourceGroupAccess().getSourceKeyword_6_0());
                    			
                    // InternalRdfMapping.g:567:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:568:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:568:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:569:6: lv_source_7_0= RULE_STRING
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

            // InternalRdfMapping.g:590:3: ( (lv_logicalSources_9_0= ruleLogicalSource ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRdfMapping.g:591:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    {
            	    // InternalRdfMapping.g:591:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    // InternalRdfMapping.g:592:5: lv_logicalSources_9_0= ruleLogicalSource
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
    // InternalRdfMapping.g:617:1: entryRuleLogicalSource returns [EObject current=null] : iv_ruleLogicalSource= ruleLogicalSource EOF ;
    public final EObject entryRuleLogicalSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalSource = null;


        try {
            // InternalRdfMapping.g:617:54: (iv_ruleLogicalSource= ruleLogicalSource EOF )
            // InternalRdfMapping.g:618:2: iv_ruleLogicalSource= ruleLogicalSource EOF
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
    // InternalRdfMapping.g:624:1: ruleLogicalSource returns [EObject current=null] : (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
            // InternalRdfMapping.g:630:2: ( (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalRdfMapping.g:631:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalRdfMapping.g:631:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalRdfMapping.g:632:3: otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0());
            		
            // InternalRdfMapping.g:636:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:637:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:637:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:638:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:658:3: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:659:4: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0());
                    			
                    // InternalRdfMapping.g:663:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:664:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:664:5: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:665:6: otherlv_4= RULE_ID
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

            // InternalRdfMapping.g:681:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdfMapping.g:682:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0());
                    			
                    // InternalRdfMapping.g:686:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:687:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:687:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:688:6: lv_source_7_0= RULE_STRING
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

            // InternalRdfMapping.g:709:3: (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:710:4: otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0());
                    			
                    // InternalRdfMapping.g:714:4: ( (lv_iterator_10_0= RULE_STRING ) )
                    // InternalRdfMapping.g:715:5: (lv_iterator_10_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:715:5: (lv_iterator_10_0= RULE_STRING )
                    // InternalRdfMapping.g:716:6: lv_iterator_10_0= RULE_STRING
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
            		
            // InternalRdfMapping.g:745:3: ( (lv_referencables_14_0= ruleReferenceable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRdfMapping.g:746:4: (lv_referencables_14_0= ruleReferenceable )
            	    {
            	    // InternalRdfMapping.g:746:4: (lv_referencables_14_0= ruleReferenceable )
            	    // InternalRdfMapping.g:747:5: lv_referencables_14_0= ruleReferenceable
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
    // InternalRdfMapping.g:776:1: entryRuleReferenceable returns [EObject current=null] : iv_ruleReferenceable= ruleReferenceable EOF ;
    public final EObject entryRuleReferenceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceable = null;


        try {
            // InternalRdfMapping.g:776:54: (iv_ruleReferenceable= ruleReferenceable EOF )
            // InternalRdfMapping.g:777:2: iv_ruleReferenceable= ruleReferenceable EOF
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
    // InternalRdfMapping.g:783:1: ruleReferenceable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleReferenceable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:789:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? ) )
            // InternalRdfMapping.g:790:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? )
            {
            // InternalRdfMapping.g:790:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )? )
            // InternalRdfMapping.g:791:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )?
            {
            // InternalRdfMapping.g:791:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:792:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:792:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:793:5: lv_name_0_0= RULE_ID
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

            // InternalRdfMapping.g:809:3: ( (lv_value_1_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdfMapping.g:810:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:810:4: (lv_value_1_0= RULE_STRING )
                    // InternalRdfMapping.g:811:5: lv_value_1_0= RULE_STRING
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
    // InternalRdfMapping.g:831:1: entryRuleVocabulary returns [EObject current=null] : iv_ruleVocabulary= ruleVocabulary EOF ;
    public final EObject entryRuleVocabulary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVocabulary = null;


        try {
            // InternalRdfMapping.g:831:51: (iv_ruleVocabulary= ruleVocabulary EOF )
            // InternalRdfMapping.g:832:2: iv_ruleVocabulary= ruleVocabulary EOF
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
    // InternalRdfMapping.g:838:1: ruleVocabulary returns [EObject current=null] : (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' ) ;
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
            // InternalRdfMapping.g:844:2: ( (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' ) )
            // InternalRdfMapping.g:845:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' )
            {
            // InternalRdfMapping.g:845:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' )
            // InternalRdfMapping.g:846:3: otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVocabularyAccess().getVocabularyKeyword_0());
            		
            // InternalRdfMapping.g:850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:851:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:852:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:872:3: ( (lv_prefix_3_0= rulePrefix ) )
            // InternalRdfMapping.g:873:4: (lv_prefix_3_0= rulePrefix )
            {
            // InternalRdfMapping.g:873:4: (lv_prefix_3_0= rulePrefix )
            // InternalRdfMapping.g:874:5: lv_prefix_3_0= rulePrefix
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

            // InternalRdfMapping.g:891:3: (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdfMapping.g:892:4: otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getVocabularyAccess().getClassesKeyword_4_0());
                    			
                    // InternalRdfMapping.g:896:4: ( (lv_classes_5_0= ruleRdfClass ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRdfMapping.g:897:5: (lv_classes_5_0= ruleRdfClass )
                    	    {
                    	    // InternalRdfMapping.g:897:5: (lv_classes_5_0= ruleRdfClass )
                    	    // InternalRdfMapping.g:898:6: lv_classes_5_0= ruleRdfClass
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

            // InternalRdfMapping.g:920:3: (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdfMapping.g:921:4: otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0());
                    			
                    // InternalRdfMapping.g:925:4: ( (lv_properties_8_0= ruleRdfProperty ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRdfMapping.g:926:5: (lv_properties_8_0= ruleRdfProperty )
                    	    {
                    	    // InternalRdfMapping.g:926:5: (lv_properties_8_0= ruleRdfProperty )
                    	    // InternalRdfMapping.g:927:6: lv_properties_8_0= ruleRdfProperty
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


    // $ANTLR start "entryRulePrefixHolder"
    // InternalRdfMapping.g:957:1: entryRulePrefixHolder returns [EObject current=null] : iv_rulePrefixHolder= rulePrefixHolder EOF ;
    public final EObject entryRulePrefixHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixHolder = null;


        try {
            // InternalRdfMapping.g:957:53: (iv_rulePrefixHolder= rulePrefixHolder EOF )
            // InternalRdfMapping.g:958:2: iv_rulePrefixHolder= rulePrefixHolder EOF
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
    // InternalRdfMapping.g:964:1: rulePrefixHolder returns [EObject current=null] : (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary ) ;
    public final EObject rulePrefixHolder() throws RecognitionException {
        EObject current = null;

        EObject this_DatatypesDefinition_0 = null;

        EObject this_Vocabulary_1 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:970:2: ( (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary ) )
            // InternalRdfMapping.g:971:2: (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary )
            {
            // InternalRdfMapping.g:971:2: (this_DatatypesDefinition_0= ruleDatatypesDefinition | this_Vocabulary_1= ruleVocabulary )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( (LA17_0==24) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdfMapping.g:972:3: this_DatatypesDefinition_0= ruleDatatypesDefinition
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
                    // InternalRdfMapping.g:981:3: this_Vocabulary_1= ruleVocabulary
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
    // InternalRdfMapping.g:993:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalRdfMapping.g:993:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalRdfMapping.g:994:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalRdfMapping.g:1000:1: rulePrefix returns [EObject current=null] : (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_iri_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1006:2: ( (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalRdfMapping.g:1007:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalRdfMapping.g:1007:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalRdfMapping.g:1008:3: otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getPrefixKeyword_0());
            		
            // InternalRdfMapping.g:1012:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:1013:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:1013:4: (lv_label_1_0= RULE_STRING )
            // InternalRdfMapping.g:1014:5: lv_label_1_0= RULE_STRING
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

            // InternalRdfMapping.g:1030:3: ( (lv_iri_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:1031:4: (lv_iri_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:1031:4: (lv_iri_2_0= RULE_STRING )
            // InternalRdfMapping.g:1032:5: lv_iri_2_0= RULE_STRING
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
    // InternalRdfMapping.g:1056:1: entryRuleRdfProperty returns [EObject current=null] : iv_ruleRdfProperty= ruleRdfProperty EOF ;
    public final EObject entryRuleRdfProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfProperty = null;


        try {
            // InternalRdfMapping.g:1056:52: (iv_ruleRdfProperty= ruleRdfProperty EOF )
            // InternalRdfMapping.g:1057:2: iv_ruleRdfProperty= ruleRdfProperty EOF
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
    // InternalRdfMapping.g:1063:1: ruleRdfProperty returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1069:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:1070:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:1070:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:1071:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:1071:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:1072:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:1091:1: entryRuleRdfClass returns [EObject current=null] : iv_ruleRdfClass= ruleRdfClass EOF ;
    public final EObject entryRuleRdfClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfClass = null;


        try {
            // InternalRdfMapping.g:1091:49: (iv_ruleRdfClass= ruleRdfClass EOF )
            // InternalRdfMapping.g:1092:2: iv_ruleRdfClass= ruleRdfClass EOF
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
    // InternalRdfMapping.g:1098:1: ruleRdfClass returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1104:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:1105:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:1105:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:1106:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:1106:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:1107:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:1126:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalRdfMapping.g:1126:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalRdfMapping.g:1127:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalRdfMapping.g:1133:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' ) ;
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
            // InternalRdfMapping.g:1139:2: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' ) )
            // InternalRdfMapping.g:1140:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' )
            {
            // InternalRdfMapping.g:1140:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}' )
            // InternalRdfMapping.g:1141:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )? otherlv_7= 'subject' ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) ) (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )? (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapKeyword_0());
            		
            // InternalRdfMapping.g:1145:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:1146:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:1146:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:1147:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:1167:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1168:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1168:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1169:5: ruleQualifiedName
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
            		
            // InternalRdfMapping.g:1187:3: (otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRdfMapping.g:1188:4: otherlv_5= 'use-vocabularies' ( ( ruleQualifiedName ) )+
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getUseVocabulariesKeyword_5_0());
                    			
                    // InternalRdfMapping.g:1192:4: ( ( ruleQualifiedName ) )+
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
                    	    // InternalRdfMapping.g:1193:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalRdfMapping.g:1193:5: ( ruleQualifiedName )
                    	    // InternalRdfMapping.g:1194:6: ruleQualifiedName
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getSubjectKeyword_6());
            		
            // InternalRdfMapping.g:1213:3: ( (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm ) )
            // InternalRdfMapping.g:1214:4: (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm )
            {
            // InternalRdfMapping.g:1214:4: (lv_subjectIriMapping_8_0= ruleTemplateValuedTerm )
            // InternalRdfMapping.g:1215:5: lv_subjectIriMapping_8_0= ruleTemplateValuedTerm
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

            // InternalRdfMapping.g:1232:3: (otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdfMapping.g:1233:4: otherlv_9= 'types' ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappingAccess().getTypesKeyword_8_0());
                    			
                    // InternalRdfMapping.g:1237:4: ( (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1238:5: (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping )
                    	    {
                    	    // InternalRdfMapping.g:1238:5: (lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping )
                    	    // InternalRdfMapping.g:1239:6: lv_subjectTypeMappings_10_0= ruleSubjectTypeMapping
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
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;

            }

            // InternalRdfMapping.g:1257:3: (otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRdfMapping.g:1258:4: otherlv_11= 'properties' ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getMappingAccess().getPropertiesKeyword_9_0());
                    			
                    // InternalRdfMapping.g:1262:4: ( (lv_poMappings_12_0= rulePredicateObjectMapping ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1263:5: (lv_poMappings_12_0= rulePredicateObjectMapping )
                    	    {
                    	    // InternalRdfMapping.g:1263:5: (lv_poMappings_12_0= rulePredicateObjectMapping )
                    	    // InternalRdfMapping.g:1264:6: lv_poMappings_12_0= rulePredicateObjectMapping
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
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
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
    // InternalRdfMapping.g:1290:1: entryRuleSubjectTypeMapping returns [EObject current=null] : iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF ;
    public final EObject entryRuleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectTypeMapping = null;


        try {
            // InternalRdfMapping.g:1290:59: (iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF )
            // InternalRdfMapping.g:1291:2: iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF
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
    // InternalRdfMapping.g:1297:1: ruleSubjectTypeMapping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1303:2: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:1304:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:1304:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1305:3: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1305:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:1306:4: ruleQualifiedName
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
    // InternalRdfMapping.g:1323:1: entryRulePredicateObjectMapping returns [EObject current=null] : iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF ;
    public final EObject entryRulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObjectMapping = null;


        try {
            // InternalRdfMapping.g:1323:63: (iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF )
            // InternalRdfMapping.g:1324:2: iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF
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
    // InternalRdfMapping.g:1330:1: rulePredicateObjectMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) ) ;
    public final EObject rulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_term_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1336:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) ) )
            // InternalRdfMapping.g:1337:2: ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) )
            {
            // InternalRdfMapping.g:1337:2: ( ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) ) )
            // InternalRdfMapping.g:1338:3: ( ( ruleQualifiedName ) ) ( (lv_term_1_0= ruleValuedTerm ) )
            {
            // InternalRdfMapping.g:1338:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1339:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1339:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1340:5: ruleQualifiedName
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

            // InternalRdfMapping.g:1354:3: ( (lv_term_1_0= ruleValuedTerm ) )
            // InternalRdfMapping.g:1355:4: (lv_term_1_0= ruleValuedTerm )
            {
            // InternalRdfMapping.g:1355:4: (lv_term_1_0= ruleValuedTerm )
            // InternalRdfMapping.g:1356:5: lv_term_1_0= ruleValuedTerm
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
    // InternalRdfMapping.g:1377:1: entryRuleValuedTerm returns [EObject current=null] : iv_ruleValuedTerm= ruleValuedTerm EOF ;
    public final EObject entryRuleValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedTerm = null;


        try {
            // InternalRdfMapping.g:1377:51: (iv_ruleValuedTerm= ruleValuedTerm EOF )
            // InternalRdfMapping.g:1378:2: iv_ruleValuedTerm= ruleValuedTerm EOF
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
    // InternalRdfMapping.g:1384:1: ruleValuedTerm returns [EObject current=null] : (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm ) ;
    public final EObject ruleValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceValuedTerm_0 = null;

        EObject this_TemplateValuedTerm_1 = null;

        EObject this_LinkedResourceTerm_2 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1390:2: ( (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm ) )
            // InternalRdfMapping.g:1391:2: (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm )
            {
            // InternalRdfMapping.g:1391:2: (this_ReferenceValuedTerm_0= ruleReferenceValuedTerm | this_TemplateValuedTerm_1= ruleTemplateValuedTerm | this_LinkedResourceTerm_2= ruleLinkedResourceTerm )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt24=1;
                }
                break;
            case 36:
                {
                alt24=2;
                }
                break;
            case 37:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRdfMapping.g:1392:3: this_ReferenceValuedTerm_0= ruleReferenceValuedTerm
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
                    // InternalRdfMapping.g:1401:3: this_TemplateValuedTerm_1= ruleTemplateValuedTerm
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
                    // InternalRdfMapping.g:1410:3: this_LinkedResourceTerm_2= ruleLinkedResourceTerm
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
    // InternalRdfMapping.g:1422:1: entryRuleReferenceValuedTerm returns [EObject current=null] : iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF ;
    public final EObject entryRuleReferenceValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValuedTerm = null;


        try {
            // InternalRdfMapping.g:1422:60: (iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF )
            // InternalRdfMapping.g:1423:2: iv_ruleReferenceValuedTerm= ruleReferenceValuedTerm EOF
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
    // InternalRdfMapping.g:1429:1: ruleReferenceValuedTerm returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? ) ;
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
            // InternalRdfMapping.g:1435:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? ) )
            // InternalRdfMapping.g:1436:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? )
            {
            // InternalRdfMapping.g:1436:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )? )
            // InternalRdfMapping.g:1437:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceValuedTermAccess().getFromKeyword_0());
            		
            // InternalRdfMapping.g:1441:3: ( (otherlv_1= RULE_ID ) )
            // InternalRdfMapping.g:1442:4: (otherlv_1= RULE_ID )
            {
            // InternalRdfMapping.g:1442:4: (otherlv_1= RULE_ID )
            // InternalRdfMapping.g:1443:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceValuedTermRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceValuedTermAccess().getReferenceReferenceableCrossReference_1_0());
            				

            }


            }

            // InternalRdfMapping.g:1454:3: ( (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==35) ) {
                    alt25=2;
                }
                else if ( (LA25_1==34) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalRdfMapping.g:1455:4: (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalRdfMapping.g:1455:4: (otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) ) )
                    // InternalRdfMapping.g:1456:5: otherlv_2= 'with' otherlv_3= 'datatype' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_31); 

                    					newLeafNode(otherlv_2, grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_0_0());
                    				
                    otherlv_3=(Token)match(input,34,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getReferenceValuedTermAccess().getDatatypeKeyword_2_0_1());
                    				
                    // InternalRdfMapping.g:1464:5: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:1465:6: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:1465:6: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:1466:7: otherlv_4= RULE_ID
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
                    // InternalRdfMapping.g:1479:4: (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalRdfMapping.g:1479:4: (otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) ) )
                    // InternalRdfMapping.g:1480:5: otherlv_5= 'with' otherlv_6= 'language-tag' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getReferenceValuedTermAccess().getWithKeyword_2_1_0());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_9); 

                    					newLeafNode(otherlv_6, grammarAccess.getReferenceValuedTermAccess().getLanguageTagKeyword_2_1_1());
                    				
                    // InternalRdfMapping.g:1488:5: ( (otherlv_7= RULE_ID ) )
                    // InternalRdfMapping.g:1489:6: (otherlv_7= RULE_ID )
                    {
                    // InternalRdfMapping.g:1489:6: (otherlv_7= RULE_ID )
                    // InternalRdfMapping.g:1490:7: otherlv_7= RULE_ID
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
    // InternalRdfMapping.g:1507:1: entryRuleTemplateValuedTerm returns [EObject current=null] : iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF ;
    public final EObject entryRuleTemplateValuedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateValuedTerm = null;


        try {
            // InternalRdfMapping.g:1507:59: (iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF )
            // InternalRdfMapping.g:1508:2: iv_ruleTemplateValuedTerm= ruleTemplateValuedTerm EOF
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
    // InternalRdfMapping.g:1514:1: ruleTemplateValuedTerm returns [EObject current=null] : (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) ;
    public final EObject ruleTemplateValuedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_template_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1520:2: ( (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) )
            // InternalRdfMapping.g:1521:2: (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            {
            // InternalRdfMapping.g:1521:2: (otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            // InternalRdfMapping.g:1522:3: otherlv_0= 'template' ( (lv_template_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateValuedTermAccess().getTemplateKeyword_0());
            		
            // InternalRdfMapping.g:1526:3: ( (lv_template_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:1527:4: (lv_template_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:1527:4: (lv_template_1_0= RULE_STRING )
            // InternalRdfMapping.g:1528:5: lv_template_1_0= RULE_STRING
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
            		
            // InternalRdfMapping.g:1548:3: ( (otherlv_3= RULE_ID ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==EOF||LA26_2==RULE_ID||LA26_2==13||LA26_2==26||LA26_2==32) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalRdfMapping.g:1549:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRdfMapping.g:1549:4: (otherlv_3= RULE_ID )
            	    // InternalRdfMapping.g:1550:5: otherlv_3= RULE_ID
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
    // $ANTLR end "ruleTemplateValuedTerm"


    // $ANTLR start "entryRuleLinkedResourceTerm"
    // InternalRdfMapping.g:1565:1: entryRuleLinkedResourceTerm returns [EObject current=null] : iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF ;
    public final EObject entryRuleLinkedResourceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedResourceTerm = null;


        try {
            // InternalRdfMapping.g:1565:59: (iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF )
            // InternalRdfMapping.g:1566:2: iv_ruleLinkedResourceTerm= ruleLinkedResourceTerm EOF
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
    // InternalRdfMapping.g:1572:1: ruleLinkedResourceTerm returns [EObject current=null] : (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) ;
    public final EObject ruleLinkedResourceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1578:2: ( (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ ) )
            // InternalRdfMapping.g:1579:2: (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            {
            // InternalRdfMapping.g:1579:2: (otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+ )
            // InternalRdfMapping.g:1580:3: otherlv_0= 'link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkedResourceTermAccess().getLinkKeyword_0());
            		
            // InternalRdfMapping.g:1584:3: ( (otherlv_1= RULE_ID ) )
            // InternalRdfMapping.g:1585:4: (otherlv_1= RULE_ID )
            {
            // InternalRdfMapping.g:1585:4: (otherlv_1= RULE_ID )
            // InternalRdfMapping.g:1586:5: otherlv_1= RULE_ID
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
            		
            // InternalRdfMapping.g:1601:3: ( (otherlv_3= RULE_ID ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==EOF||LA27_2==RULE_ID||LA27_2==13) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalRdfMapping.g:1602:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRdfMapping.g:1602:4: (otherlv_3= RULE_ID )
            	    // InternalRdfMapping.g:1603:5: otherlv_3= RULE_ID
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // InternalRdfMapping.g:1618:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRdfMapping.g:1618:47: (iv_ruleImport= ruleImport EOF )
            // InternalRdfMapping.g:1619:2: iv_ruleImport= ruleImport EOF
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
    // InternalRdfMapping.g:1625:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1631:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRdfMapping.g:1632:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRdfMapping.g:1632:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRdfMapping.g:1633:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRdfMapping.g:1637:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:1638:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:1638:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:1639:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalRdfMapping.g:1660:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRdfMapping.g:1660:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:1661:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:1667:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1673:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalRdfMapping.g:1674:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalRdfMapping.g:1674:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalRdfMapping.g:1675:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRdfMapping.g:1685:3: (kw= '.*' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRdfMapping.g:1686:4: kw= '.*'
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
    // InternalRdfMapping.g:1696:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRdfMapping.g:1696:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRdfMapping.g:1697:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRdfMapping.g:1703:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1709:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRdfMapping.g:1710:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRdfMapping.g:1710:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRdfMapping.g:1711:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRdfMapping.g:1718:3: (kw= '.' this_ID_2= RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRdfMapping.g:1719:4: kw= '.' this_ID_2= RULE_ID
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
            	    break loop29;
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