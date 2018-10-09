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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'source-group'", "'type'", "';'", "'source'", "'logical-source'", "'iterator'", "'referenceables'", "'vocabulary'", "'classes'", "'properties'", "'prefix'", "'map'", "'from'", "'subject'", "'template'", "'with'", "'types'", "'import'", "'.*'", "'.'"
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

                if ( (LA1_0==11||LA1_0==15||LA1_0==19||LA1_0==22||LA1_0==26||LA1_0==32) ) {
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
    // InternalRdfMapping.g:107:1: ruleElement returns [EObject current=null] : (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Vocabulary_4= ruleVocabulary | this_Mapping_5= ruleMapping ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_SourceTypesDefinition_1 = null;

        EObject this_SourceGroup_2 = null;

        EObject this_LogicalSource_3 = null;

        EObject this_Vocabulary_4 = null;

        EObject this_Mapping_5 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:113:2: ( (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Vocabulary_4= ruleVocabulary | this_Mapping_5= ruleMapping ) )
            // InternalRdfMapping.g:114:2: (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Vocabulary_4= ruleVocabulary | this_Mapping_5= ruleMapping )
            {
            // InternalRdfMapping.g:114:2: (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Vocabulary_4= ruleVocabulary | this_Mapping_5= ruleMapping )
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
                    // InternalRdfMapping.g:115:3: this_Import_0= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    			current = this_Import_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdfMapping.g:124:3: this_SourceTypesDefinition_1= ruleSourceTypesDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSourceTypesDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceTypesDefinition_1=ruleSourceTypesDefinition();

                    state._fsp--;


                    			current = this_SourceTypesDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdfMapping.g:133:3: this_SourceGroup_2= ruleSourceGroup
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSourceGroupParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceGroup_2=ruleSourceGroup();

                    state._fsp--;


                    			current = this_SourceGroup_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdfMapping.g:142:3: this_LogicalSource_3= ruleLogicalSource
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLogicalSourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalSource_3=ruleLogicalSource();

                    state._fsp--;


                    			current = this_LogicalSource_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRdfMapping.g:151:3: this_Vocabulary_4= ruleVocabulary
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVocabularyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vocabulary_4=ruleVocabulary();

                    state._fsp--;


                    			current = this_Vocabulary_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRdfMapping.g:160:3: this_Mapping_5= ruleMapping
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMappingParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapping_5=ruleMapping();

                    state._fsp--;


                    			current = this_Mapping_5;
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
    // InternalRdfMapping.g:172:1: entryRuleSourceTypesDefinition returns [EObject current=null] : iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF ;
    public final EObject entryRuleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceTypesDefinition = null;


        try {
            // InternalRdfMapping.g:172:62: (iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF )
            // InternalRdfMapping.g:173:2: iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF
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
    // InternalRdfMapping.g:179:1: ruleSourceTypesDefinition returns [EObject current=null] : ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) ;
    public final EObject ruleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:185:2: ( ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) )
            // InternalRdfMapping.g:186:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            {
            // InternalRdfMapping.g:186:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            // InternalRdfMapping.g:187:3: () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}'
            {
            // InternalRdfMapping.g:187:3: ()
            // InternalRdfMapping.g:188:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceTypesDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:202:3: ( (lv_types_3_0= ruleSourceType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRdfMapping.g:203:4: (lv_types_3_0= ruleSourceType )
            	    {
            	    // InternalRdfMapping.g:203:4: (lv_types_3_0= ruleSourceType )
            	    // InternalRdfMapping.g:204:5: lv_types_3_0= ruleSourceType
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
    // InternalRdfMapping.g:229:1: entryRuleSourceType returns [EObject current=null] : iv_ruleSourceType= ruleSourceType EOF ;
    public final EObject entryRuleSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceType = null;


        try {
            // InternalRdfMapping.g:229:51: (iv_ruleSourceType= ruleSourceType EOF )
            // InternalRdfMapping.g:230:2: iv_ruleSourceType= ruleSourceType EOF
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
    // InternalRdfMapping.g:236:1: ruleSourceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_referenceFormulation_2_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:242:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) )
            // InternalRdfMapping.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            {
            // InternalRdfMapping.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            // InternalRdfMapping.g:244:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            {
            // InternalRdfMapping.g:244:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:245:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:245:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:246:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRdfMapping.g:266:3: ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:267:4: (lv_referenceFormulation_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:267:4: (lv_referenceFormulation_2_0= RULE_STRING )
            // InternalRdfMapping.g:268:5: lv_referenceFormulation_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleSourceGroup"
    // InternalRdfMapping.g:288:1: entryRuleSourceGroup returns [EObject current=null] : iv_ruleSourceGroup= ruleSourceGroup EOF ;
    public final EObject entryRuleSourceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceGroup = null;


        try {
            // InternalRdfMapping.g:288:52: (iv_ruleSourceGroup= ruleSourceGroup EOF )
            // InternalRdfMapping.g:289:2: iv_ruleSourceGroup= ruleSourceGroup EOF
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
    // InternalRdfMapping.g:295:1: ruleSourceGroup returns [EObject current=null] : (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) ;
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
            // InternalRdfMapping.g:301:2: ( (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) )
            // InternalRdfMapping.g:302:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            {
            // InternalRdfMapping.g:302:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            // InternalRdfMapping.g:303:3: otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceGroupAccess().getSourceGroupKeyword_0());
            		
            // InternalRdfMapping.g:307:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:308:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:308:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:309:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSourceGroupAccess().getTypeKeyword_3());
            		
            // InternalRdfMapping.g:333:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdfMapping.g:334:4: (otherlv_4= RULE_ID )
            {
            // InternalRdfMapping.g:334:4: (otherlv_4= RULE_ID )
            // InternalRdfMapping.g:335:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceGroupRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getSourceGroupAccess().getTypeSourceTypeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSourceGroupAccess().getSemicolonKeyword_5());
            		
            // InternalRdfMapping.g:350:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRdfMapping.g:351:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSourceGroupAccess().getSourceKeyword_6_0());
                    			
                    // InternalRdfMapping.g:355:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:356:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:356:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:357:6: lv_source_7_0= RULE_STRING
                    {
                    lv_source_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

                    otherlv_8=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getSourceGroupAccess().getSemicolonKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:378:3: ( (lv_logicalSources_9_0= ruleLogicalSource ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:379:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    {
            	    // InternalRdfMapping.g:379:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    // InternalRdfMapping.g:380:5: lv_logicalSources_9_0= ruleLogicalSource
            	    {

            	    					newCompositeNode(grammarAccess.getSourceGroupAccess().getLogicalSourcesLogicalSourceParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop5;
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
    // InternalRdfMapping.g:405:1: entryRuleLogicalSource returns [EObject current=null] : iv_ruleLogicalSource= ruleLogicalSource EOF ;
    public final EObject entryRuleLogicalSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalSource = null;


        try {
            // InternalRdfMapping.g:405:54: (iv_ruleLogicalSource= ruleLogicalSource EOF )
            // InternalRdfMapping.g:406:2: iv_ruleLogicalSource= ruleLogicalSource EOF
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
    // InternalRdfMapping.g:412:1: ruleLogicalSource returns [EObject current=null] : (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
            // InternalRdfMapping.g:418:2: ( (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalRdfMapping.g:419:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalRdfMapping.g:419:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalRdfMapping.g:420:3: otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0());
            		
            // InternalRdfMapping.g:424:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:425:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:425:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:426:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:446:3: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdfMapping.g:447:4: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0());
                    			
                    // InternalRdfMapping.g:451:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:452:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:452:5: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:453:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalSourceRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getLogicalSourceAccess().getTypeSourceTypeCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:469:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdfMapping.g:470:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0());
                    			
                    // InternalRdfMapping.g:474:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:475:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:475:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:476:6: lv_source_7_0= RULE_STRING
                    {
                    lv_source_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

                    otherlv_8=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:497:3: (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:498:4: otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0());
                    			
                    // InternalRdfMapping.g:502:4: ( (lv_iterator_10_0= RULE_STRING ) )
                    // InternalRdfMapping.g:503:5: (lv_iterator_10_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:503:5: (lv_iterator_10_0= RULE_STRING )
                    // InternalRdfMapping.g:504:6: lv_iterator_10_0= RULE_STRING
                    {
                    lv_iterator_10_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

                    otherlv_11=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getLogicalSourceAccess().getSemicolonKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalSourceAccess().getReferenceablesKeyword_6());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalSourceAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalRdfMapping.g:533:3: ( (lv_referencables_14_0= ruleReferenceable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRdfMapping.g:534:4: (lv_referencables_14_0= ruleReferenceable )
            	    {
            	    // InternalRdfMapping.g:534:4: (lv_referencables_14_0= ruleReferenceable )
            	    // InternalRdfMapping.g:535:5: lv_referencables_14_0= ruleReferenceable
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
            	    break loop9;
                }
            } while (true);

            otherlv_15=(Token)match(input,13,FOLLOW_17); 

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
    // InternalRdfMapping.g:564:1: entryRuleReferenceable returns [EObject current=null] : iv_ruleReferenceable= ruleReferenceable EOF ;
    public final EObject entryRuleReferenceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceable = null;


        try {
            // InternalRdfMapping.g:564:54: (iv_ruleReferenceable= ruleReferenceable EOF )
            // InternalRdfMapping.g:565:2: iv_ruleReferenceable= ruleReferenceable EOF
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
    // InternalRdfMapping.g:571:1: ruleReferenceable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleReferenceable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:577:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalRdfMapping.g:578:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalRdfMapping.g:578:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalRdfMapping.g:579:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalRdfMapping.g:579:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:580:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:580:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:581:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalRdfMapping.g:597:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:598:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:598:4: (lv_value_1_0= RULE_STRING )
            // InternalRdfMapping.g:599:5: lv_value_1_0= RULE_STRING
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
    // InternalRdfMapping.g:619:1: entryRuleVocabulary returns [EObject current=null] : iv_ruleVocabulary= ruleVocabulary EOF ;
    public final EObject entryRuleVocabulary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVocabulary = null;


        try {
            // InternalRdfMapping.g:619:51: (iv_ruleVocabulary= ruleVocabulary EOF )
            // InternalRdfMapping.g:620:2: iv_ruleVocabulary= ruleVocabulary EOF
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
    // InternalRdfMapping.g:626:1: ruleVocabulary returns [EObject current=null] : (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' ) ;
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
            // InternalRdfMapping.g:632:2: ( (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' ) )
            // InternalRdfMapping.g:633:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' )
            {
            // InternalRdfMapping.g:633:2: (otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}' )
            // InternalRdfMapping.g:634:3: otherlv_0= 'vocabulary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefix_3_0= rulePrefix ) ) (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )? (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVocabularyAccess().getVocabularyKeyword_0());
            		
            // InternalRdfMapping.g:638:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:639:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:639:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:640:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getVocabularyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:660:3: ( (lv_prefix_3_0= rulePrefix ) )
            // InternalRdfMapping.g:661:4: (lv_prefix_3_0= rulePrefix )
            {
            // InternalRdfMapping.g:661:4: (lv_prefix_3_0= rulePrefix )
            // InternalRdfMapping.g:662:5: lv_prefix_3_0= rulePrefix
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

            // InternalRdfMapping.g:679:3: (otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdfMapping.g:680:4: otherlv_4= 'classes' ( (lv_classes_5_0= ruleRdfClass ) )* otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getVocabularyAccess().getClassesKeyword_4_0());
                    			
                    // InternalRdfMapping.g:684:4: ( (lv_classes_5_0= ruleRdfClass ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRdfMapping.g:685:5: (lv_classes_5_0= ruleRdfClass )
                    	    {
                    	    // InternalRdfMapping.g:685:5: (lv_classes_5_0= ruleRdfClass )
                    	    // InternalRdfMapping.g:686:6: lv_classes_5_0= ruleRdfClass
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getVocabularyAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRdfMapping.g:708:3: (otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRdfMapping.g:709:4: otherlv_7= 'properties' ( (lv_properties_8_0= ruleRdfProperty ) )* otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getVocabularyAccess().getPropertiesKeyword_5_0());
                    			
                    // InternalRdfMapping.g:713:4: ( (lv_properties_8_0= ruleRdfProperty ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRdfMapping.g:714:5: (lv_properties_8_0= ruleRdfProperty )
                    	    {
                    	    // InternalRdfMapping.g:714:5: (lv_properties_8_0= ruleRdfProperty )
                    	    // InternalRdfMapping.g:715:6: lv_properties_8_0= ruleRdfProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getVocabularyAccess().getPropertiesRdfPropertyParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_17); 

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
    // InternalRdfMapping.g:745:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalRdfMapping.g:745:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalRdfMapping.g:746:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalRdfMapping.g:752:1: rulePrefix returns [EObject current=null] : (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_iri_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:758:2: ( (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalRdfMapping.g:759:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalRdfMapping.g:759:2: (otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalRdfMapping.g:760:3: otherlv_0= 'prefix' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_iri_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getPrefixKeyword_0());
            		
            // InternalRdfMapping.g:764:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:765:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:765:4: (lv_label_1_0= RULE_STRING )
            // InternalRdfMapping.g:766:5: lv_label_1_0= RULE_STRING
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

            // InternalRdfMapping.g:782:3: ( (lv_iri_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:783:4: (lv_iri_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:783:4: (lv_iri_2_0= RULE_STRING )
            // InternalRdfMapping.g:784:5: lv_iri_2_0= RULE_STRING
            {
            lv_iri_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRdfMapping.g:808:1: entryRuleRdfProperty returns [EObject current=null] : iv_ruleRdfProperty= ruleRdfProperty EOF ;
    public final EObject entryRuleRdfProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfProperty = null;


        try {
            // InternalRdfMapping.g:808:52: (iv_ruleRdfProperty= ruleRdfProperty EOF )
            // InternalRdfMapping.g:809:2: iv_ruleRdfProperty= ruleRdfProperty EOF
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
    // InternalRdfMapping.g:815:1: ruleRdfProperty returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:821:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:822:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:822:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:823:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:823:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:824:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:843:1: entryRuleRdfClass returns [EObject current=null] : iv_ruleRdfClass= ruleRdfClass EOF ;
    public final EObject entryRuleRdfClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRdfClass = null;


        try {
            // InternalRdfMapping.g:843:49: (iv_ruleRdfClass= ruleRdfClass EOF )
            // InternalRdfMapping.g:844:2: iv_ruleRdfClass= ruleRdfClass EOF
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
    // InternalRdfMapping.g:850:1: ruleRdfClass returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRdfClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:856:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRdfMapping.g:857:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRdfMapping.g:857:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:858:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:858:3: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:859:4: lv_name_0_0= RULE_ID
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
    // InternalRdfMapping.g:878:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalRdfMapping.g:878:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalRdfMapping.g:879:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalRdfMapping.g:885:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'subject' otherlv_6= 'template' ( (lv_pattern_7_0= RULE_STRING ) ) otherlv_8= 'with' ( ( ruleQualifiedName ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ )? (otherlv_12= 'properties' ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+ )? otherlv_14= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_pattern_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_subjectTypeMappings_11_0 = null;

        EObject lv_poMappings_13_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:891:2: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'subject' otherlv_6= 'template' ( (lv_pattern_7_0= RULE_STRING ) ) otherlv_8= 'with' ( ( ruleQualifiedName ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ )? (otherlv_12= 'properties' ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+ )? otherlv_14= '}' ) )
            // InternalRdfMapping.g:892:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'subject' otherlv_6= 'template' ( (lv_pattern_7_0= RULE_STRING ) ) otherlv_8= 'with' ( ( ruleQualifiedName ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ )? (otherlv_12= 'properties' ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+ )? otherlv_14= '}' )
            {
            // InternalRdfMapping.g:892:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'subject' otherlv_6= 'template' ( (lv_pattern_7_0= RULE_STRING ) ) otherlv_8= 'with' ( ( ruleQualifiedName ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ )? (otherlv_12= 'properties' ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+ )? otherlv_14= '}' )
            // InternalRdfMapping.g:893:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'subject' otherlv_6= 'template' ( (lv_pattern_7_0= RULE_STRING ) ) otherlv_8= 'with' ( ( ruleQualifiedName ) ) (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ )? (otherlv_12= 'properties' ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+ )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapKeyword_0());
            		
            // InternalRdfMapping.g:897:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:898:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:898:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:899:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getFromKeyword_2());
            		
            // InternalRdfMapping.g:919:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:920:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:920:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:921:5: ruleQualifiedName
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

            otherlv_4=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getSubjectKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getTemplateKeyword_6());
            		
            // InternalRdfMapping.g:947:3: ( (lv_pattern_7_0= RULE_STRING ) )
            // InternalRdfMapping.g:948:4: (lv_pattern_7_0= RULE_STRING )
            {
            // InternalRdfMapping.g:948:4: (lv_pattern_7_0= RULE_STRING )
            // InternalRdfMapping.g:949:5: lv_pattern_7_0= RULE_STRING
            {
            lv_pattern_7_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_pattern_7_0, grammarAccess.getMappingAccess().getPatternSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getMappingAccess().getWithKeyword_8());
            		
            // InternalRdfMapping.g:969:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:970:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:970:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:971:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getReferenceReferenceableCrossReference_9_0());
            				
            pushFollow(FOLLOW_26);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdfMapping.g:985:3: (otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdfMapping.g:986:4: otherlv_10= 'types' ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getMappingAccess().getTypesKeyword_10_0());
                    			
                    // InternalRdfMapping.g:990:4: ( (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRdfMapping.g:991:5: (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping )
                    	    {
                    	    // InternalRdfMapping.g:991:5: (lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping )
                    	    // InternalRdfMapping.g:992:6: lv_subjectTypeMappings_11_0= ruleSubjectTypeMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getSubjectTypeMappingsSubjectTypeMappingParserRuleCall_10_1_0());
                    	    					
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }

            // InternalRdfMapping.g:1010:3: (otherlv_12= 'properties' ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdfMapping.g:1011:4: otherlv_12= 'properties' ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getMappingAccess().getPropertiesKeyword_11_0());
                    			
                    // InternalRdfMapping.g:1015:4: ( (lv_poMappings_13_0= rulePredicateObjectMapping ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRdfMapping.g:1016:5: (lv_poMappings_13_0= rulePredicateObjectMapping )
                    	    {
                    	    // InternalRdfMapping.g:1016:5: (lv_poMappings_13_0= rulePredicateObjectMapping )
                    	    // InternalRdfMapping.g:1017:6: lv_poMappings_13_0= rulePredicateObjectMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getPoMappingsPredicateObjectMappingParserRuleCall_11_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_poMappings_13_0=rulePredicateObjectMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"poMappings",
                    	    							lv_poMappings_13_0,
                    	    							"com.zazuko.experimental.rmdsl.RdfMapping.PredicateObjectMapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalRdfMapping.g:1043:1: entryRuleSubjectTypeMapping returns [EObject current=null] : iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF ;
    public final EObject entryRuleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectTypeMapping = null;


        try {
            // InternalRdfMapping.g:1043:59: (iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF )
            // InternalRdfMapping.g:1044:2: iv_ruleSubjectTypeMapping= ruleSubjectTypeMapping EOF
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
    // InternalRdfMapping.g:1050:1: ruleSubjectTypeMapping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubjectTypeMapping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1056:2: ( ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:1057:2: ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:1057:2: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1058:3: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1058:3: ( ruleQualifiedName )
            // InternalRdfMapping.g:1059:4: ruleQualifiedName
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
    // InternalRdfMapping.g:1076:1: entryRulePredicateObjectMapping returns [EObject current=null] : iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF ;
    public final EObject entryRulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObjectMapping = null;


        try {
            // InternalRdfMapping.g:1076:63: (iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF )
            // InternalRdfMapping.g:1077:2: iv_rulePredicateObjectMapping= rulePredicateObjectMapping EOF
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
    // InternalRdfMapping.g:1083:1: rulePredicateObjectMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'from' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePredicateObjectMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1089:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'from' ( ( ruleQualifiedName ) ) ) )
            // InternalRdfMapping.g:1090:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'from' ( ( ruleQualifiedName ) ) )
            {
            // InternalRdfMapping.g:1090:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'from' ( ( ruleQualifiedName ) ) )
            // InternalRdfMapping.g:1091:3: ( ( ruleQualifiedName ) ) otherlv_1= 'from' ( ( ruleQualifiedName ) )
            {
            // InternalRdfMapping.g:1091:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1092:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1092:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1093:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateObjectMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPredicateObjectMappingAccess().getPropertyRdfPropertyCrossReference_0_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPredicateObjectMappingAccess().getFromKeyword_1());
            		
            // InternalRdfMapping.g:1111:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:1112:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:1112:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:1113:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateObjectMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPredicateObjectMappingAccess().getReferenceReferenceableCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:1131:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRdfMapping.g:1131:47: (iv_ruleImport= ruleImport EOF )
            // InternalRdfMapping.g:1132:2: iv_ruleImport= ruleImport EOF
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
    // InternalRdfMapping.g:1138:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1144:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRdfMapping.g:1145:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRdfMapping.g:1145:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRdfMapping.g:1146:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRdfMapping.g:1150:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:1151:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:1151:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:1152:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalRdfMapping.g:1173:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRdfMapping.g:1173:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:1174:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:1180:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:1186:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalRdfMapping.g:1187:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalRdfMapping.g:1187:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalRdfMapping.g:1188:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRdfMapping.g:1198:3: (kw= '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdfMapping.g:1199:4: kw= '.*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalRdfMapping.g:1209:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRdfMapping.g:1209:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRdfMapping.g:1210:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRdfMapping.g:1216:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:1222:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRdfMapping.g:1223:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRdfMapping.g:1223:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRdfMapping.g:1224:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRdfMapping.g:1231:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRdfMapping.g:1232:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000104488802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000350000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000081002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001002010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});

}