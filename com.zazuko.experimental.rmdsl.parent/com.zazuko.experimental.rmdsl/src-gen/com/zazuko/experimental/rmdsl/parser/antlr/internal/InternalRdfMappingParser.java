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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source-types'", "'{'", "'}'", "'referenceFormulation'", "'source-group'", "'type'", "';'", "'source'", "'logical-source'", "'iterator'", "'referenceables'", "'map'", "'from'", "'iri'", "'import'", "'.*'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
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

                if ( (LA1_0==11||LA1_0==15||LA1_0==19||LA1_0==22||LA1_0==25) ) {
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
    // InternalRdfMapping.g:107:1: ruleElement returns [EObject current=null] : (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Mapping_4= ruleMapping ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_SourceTypesDefinition_1 = null;

        EObject this_SourceGroup_2 = null;

        EObject this_LogicalSource_3 = null;

        EObject this_Mapping_4 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:113:2: ( (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Mapping_4= ruleMapping ) )
            // InternalRdfMapping.g:114:2: (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Mapping_4= ruleMapping )
            {
            // InternalRdfMapping.g:114:2: (this_Import_0= ruleImport | this_SourceTypesDefinition_1= ruleSourceTypesDefinition | this_SourceGroup_2= ruleSourceGroup | this_LogicalSource_3= ruleLogicalSource | this_Mapping_4= ruleMapping )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 25:
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
                    // InternalRdfMapping.g:151:3: this_Mapping_4= ruleMapping
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMappingParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapping_4=ruleMapping();

                    state._fsp--;


                    			current = this_Mapping_4;
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
    // InternalRdfMapping.g:163:1: entryRuleSourceTypesDefinition returns [EObject current=null] : iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF ;
    public final EObject entryRuleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceTypesDefinition = null;


        try {
            // InternalRdfMapping.g:163:62: (iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF )
            // InternalRdfMapping.g:164:2: iv_ruleSourceTypesDefinition= ruleSourceTypesDefinition EOF
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
    // InternalRdfMapping.g:170:1: ruleSourceTypesDefinition returns [EObject current=null] : ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) ;
    public final EObject ruleSourceTypesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:176:2: ( ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' ) )
            // InternalRdfMapping.g:177:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            {
            // InternalRdfMapping.g:177:2: ( () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}' )
            // InternalRdfMapping.g:178:3: () otherlv_1= 'source-types' otherlv_2= '{' ( (lv_types_3_0= ruleSourceType ) )* otherlv_4= '}'
            {
            // InternalRdfMapping.g:178:3: ()
            // InternalRdfMapping.g:179:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceTypesDefinitionAccess().getSourceTypesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceTypesDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdfMapping.g:193:3: ( (lv_types_3_0= ruleSourceType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRdfMapping.g:194:4: (lv_types_3_0= ruleSourceType )
            	    {
            	    // InternalRdfMapping.g:194:4: (lv_types_3_0= ruleSourceType )
            	    // InternalRdfMapping.g:195:5: lv_types_3_0= ruleSourceType
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
    // InternalRdfMapping.g:220:1: entryRuleSourceType returns [EObject current=null] : iv_ruleSourceType= ruleSourceType EOF ;
    public final EObject entryRuleSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceType = null;


        try {
            // InternalRdfMapping.g:220:51: (iv_ruleSourceType= ruleSourceType EOF )
            // InternalRdfMapping.g:221:2: iv_ruleSourceType= ruleSourceType EOF
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
    // InternalRdfMapping.g:227:1: ruleSourceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_referenceFormulation_2_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:233:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) ) )
            // InternalRdfMapping.g:234:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            {
            // InternalRdfMapping.g:234:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) ) )
            // InternalRdfMapping.g:235:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'referenceFormulation' ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            {
            // InternalRdfMapping.g:235:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:236:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:236:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:237:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRdfMapping.g:257:3: ( (lv_referenceFormulation_2_0= RULE_STRING ) )
            // InternalRdfMapping.g:258:4: (lv_referenceFormulation_2_0= RULE_STRING )
            {
            // InternalRdfMapping.g:258:4: (lv_referenceFormulation_2_0= RULE_STRING )
            // InternalRdfMapping.g:259:5: lv_referenceFormulation_2_0= RULE_STRING
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
    // InternalRdfMapping.g:279:1: entryRuleSourceGroup returns [EObject current=null] : iv_ruleSourceGroup= ruleSourceGroup EOF ;
    public final EObject entryRuleSourceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceGroup = null;


        try {
            // InternalRdfMapping.g:279:52: (iv_ruleSourceGroup= ruleSourceGroup EOF )
            // InternalRdfMapping.g:280:2: iv_ruleSourceGroup= ruleSourceGroup EOF
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
    // InternalRdfMapping.g:286:1: ruleSourceGroup returns [EObject current=null] : (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) ;
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
            // InternalRdfMapping.g:292:2: ( (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' ) )
            // InternalRdfMapping.g:293:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            {
            // InternalRdfMapping.g:293:2: (otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}' )
            // InternalRdfMapping.g:294:3: otherlv_0= 'source-group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? ( (lv_logicalSources_9_0= ruleLogicalSource ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceGroupAccess().getSourceGroupKeyword_0());
            		
            // InternalRdfMapping.g:298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:299:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:300:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:324:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdfMapping.g:325:4: (otherlv_4= RULE_ID )
            {
            // InternalRdfMapping.g:325:4: (otherlv_4= RULE_ID )
            // InternalRdfMapping.g:326:5: otherlv_4= RULE_ID
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
            		
            // InternalRdfMapping.g:341:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRdfMapping.g:342:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSourceGroupAccess().getSourceKeyword_6_0());
                    			
                    // InternalRdfMapping.g:346:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:347:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:347:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:348:6: lv_source_7_0= RULE_STRING
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

            // InternalRdfMapping.g:369:3: ( (lv_logicalSources_9_0= ruleLogicalSource ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdfMapping.g:370:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    {
            	    // InternalRdfMapping.g:370:4: (lv_logicalSources_9_0= ruleLogicalSource )
            	    // InternalRdfMapping.g:371:5: lv_logicalSources_9_0= ruleLogicalSource
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
    // InternalRdfMapping.g:396:1: entryRuleLogicalSource returns [EObject current=null] : iv_ruleLogicalSource= ruleLogicalSource EOF ;
    public final EObject entryRuleLogicalSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalSource = null;


        try {
            // InternalRdfMapping.g:396:54: (iv_ruleLogicalSource= ruleLogicalSource EOF )
            // InternalRdfMapping.g:397:2: iv_ruleLogicalSource= ruleLogicalSource EOF
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
    // InternalRdfMapping.g:403:1: ruleLogicalSource returns [EObject current=null] : (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
            // InternalRdfMapping.g:409:2: ( (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalRdfMapping.g:410:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalRdfMapping.g:410:2: (otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalRdfMapping.g:411:3: otherlv_0= 'logical-source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )? (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )? otherlv_12= 'referenceables' otherlv_13= '{' ( (lv_referencables_14_0= ruleReferenceable ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalSourceAccess().getLogicalSourceKeyword_0());
            		
            // InternalRdfMapping.g:415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:416:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:417:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRdfMapping.g:437:3: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdfMapping.g:438:4: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalSourceAccess().getTypeKeyword_3_0());
                    			
                    // InternalRdfMapping.g:442:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRdfMapping.g:443:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRdfMapping.g:443:5: (otherlv_4= RULE_ID )
                    // InternalRdfMapping.g:444:6: otherlv_4= RULE_ID
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

            // InternalRdfMapping.g:460:3: (otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdfMapping.g:461:4: otherlv_6= 'source' ( (lv_source_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalSourceAccess().getSourceKeyword_4_0());
                    			
                    // InternalRdfMapping.g:465:4: ( (lv_source_7_0= RULE_STRING ) )
                    // InternalRdfMapping.g:466:5: (lv_source_7_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:466:5: (lv_source_7_0= RULE_STRING )
                    // InternalRdfMapping.g:467:6: lv_source_7_0= RULE_STRING
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

            // InternalRdfMapping.g:488:3: (otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdfMapping.g:489:4: otherlv_9= 'iterator' ( (lv_iterator_10_0= RULE_STRING ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalSourceAccess().getIteratorKeyword_5_0());
                    			
                    // InternalRdfMapping.g:493:4: ( (lv_iterator_10_0= RULE_STRING ) )
                    // InternalRdfMapping.g:494:5: (lv_iterator_10_0= RULE_STRING )
                    {
                    // InternalRdfMapping.g:494:5: (lv_iterator_10_0= RULE_STRING )
                    // InternalRdfMapping.g:495:6: lv_iterator_10_0= RULE_STRING
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
            		
            // InternalRdfMapping.g:524:3: ( (lv_referencables_14_0= ruleReferenceable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRdfMapping.g:525:4: (lv_referencables_14_0= ruleReferenceable )
            	    {
            	    // InternalRdfMapping.g:525:4: (lv_referencables_14_0= ruleReferenceable )
            	    // InternalRdfMapping.g:526:5: lv_referencables_14_0= ruleReferenceable
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
    // InternalRdfMapping.g:555:1: entryRuleReferenceable returns [EObject current=null] : iv_ruleReferenceable= ruleReferenceable EOF ;
    public final EObject entryRuleReferenceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceable = null;


        try {
            // InternalRdfMapping.g:555:54: (iv_ruleReferenceable= ruleReferenceable EOF )
            // InternalRdfMapping.g:556:2: iv_ruleReferenceable= ruleReferenceable EOF
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
    // InternalRdfMapping.g:562:1: ruleReferenceable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleReferenceable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:568:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalRdfMapping.g:569:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalRdfMapping.g:569:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalRdfMapping.g:570:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalRdfMapping.g:570:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdfMapping.g:571:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRdfMapping.g:571:4: (lv_name_0_0= RULE_ID )
            // InternalRdfMapping.g:572:5: lv_name_0_0= RULE_ID
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

            // InternalRdfMapping.g:588:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalRdfMapping.g:589:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalRdfMapping.g:589:4: (lv_value_1_0= RULE_STRING )
            // InternalRdfMapping.g:590:5: lv_value_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleMapping"
    // InternalRdfMapping.g:610:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalRdfMapping.g:610:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalRdfMapping.g:611:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalRdfMapping.g:617:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'iri' ( (lv_pattern_6_0= RULE_STRING ) ) ( ( ruleQualifiedName ) ) otherlv_8= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_pattern_6_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:623:2: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'iri' ( (lv_pattern_6_0= RULE_STRING ) ) ( ( ruleQualifiedName ) ) otherlv_8= '}' ) )
            // InternalRdfMapping.g:624:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'iri' ( (lv_pattern_6_0= RULE_STRING ) ) ( ( ruleQualifiedName ) ) otherlv_8= '}' )
            {
            // InternalRdfMapping.g:624:2: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'iri' ( (lv_pattern_6_0= RULE_STRING ) ) ( ( ruleQualifiedName ) ) otherlv_8= '}' )
            // InternalRdfMapping.g:625:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'iri' ( (lv_pattern_6_0= RULE_STRING ) ) ( ( ruleQualifiedName ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapKeyword_0());
            		
            // InternalRdfMapping.g:629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdfMapping.g:630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdfMapping.g:630:4: (lv_name_1_0= RULE_ID )
            // InternalRdfMapping.g:631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getFromKeyword_2());
            		
            // InternalRdfMapping.g:651:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:652:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:652:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:653:5: ruleQualifiedName
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

            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getIriKeyword_5());
            		
            // InternalRdfMapping.g:675:3: ( (lv_pattern_6_0= RULE_STRING ) )
            // InternalRdfMapping.g:676:4: (lv_pattern_6_0= RULE_STRING )
            {
            // InternalRdfMapping.g:676:4: (lv_pattern_6_0= RULE_STRING )
            // InternalRdfMapping.g:677:5: lv_pattern_6_0= RULE_STRING
            {
            lv_pattern_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_pattern_6_0, grammarAccess.getMappingAccess().getPatternSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRdfMapping.g:693:3: ( ( ruleQualifiedName ) )
            // InternalRdfMapping.g:694:4: ( ruleQualifiedName )
            {
            // InternalRdfMapping.g:694:4: ( ruleQualifiedName )
            // InternalRdfMapping.g:695:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getReferenceReferenceableCrossReference_7_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleImport"
    // InternalRdfMapping.g:717:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRdfMapping.g:717:47: (iv_ruleImport= ruleImport EOF )
            // InternalRdfMapping.g:718:2: iv_ruleImport= ruleImport EOF
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
    // InternalRdfMapping.g:724:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:730:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRdfMapping.g:731:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRdfMapping.g:731:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRdfMapping.g:732:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRdfMapping.g:736:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRdfMapping.g:737:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRdfMapping.g:737:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRdfMapping.g:738:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalRdfMapping.g:759:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRdfMapping.g:759:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRdfMapping.g:760:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalRdfMapping.g:766:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalRdfMapping.g:772:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalRdfMapping.g:773:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalRdfMapping.g:773:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalRdfMapping.g:774:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRdfMapping.g:784:3: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdfMapping.g:785:4: kw= '.*'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalRdfMapping.g:795:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRdfMapping.g:795:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRdfMapping.g:796:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRdfMapping.g:802:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRdfMapping.g:808:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRdfMapping.g:809:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRdfMapping.g:809:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRdfMapping.g:810:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRdfMapping.g:817:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRdfMapping.g:818:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002488802L});
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});

}