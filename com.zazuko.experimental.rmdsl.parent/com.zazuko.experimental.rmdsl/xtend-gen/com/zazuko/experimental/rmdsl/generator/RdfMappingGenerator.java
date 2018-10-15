/**
 * generated by Xtext 2.14.0
 */
package com.zazuko.experimental.rmdsl.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.zazuko.experimental.rmdsl.rdfMapping.Datatype;
import com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition;
import com.zazuko.experimental.rmdsl.rdfMapping.LanguageTag;
import com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.Prefix;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfClass;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty;
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceType;
import com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.ValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RdfMappingGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Iterable<Mapping> mappings = IteratorExtensions.<Mapping>toList(Iterators.<Mapping>filter(resource.getAllContents(), Mapping.class));
    fsa.generateFile("rml.ttl", this.rml(mappings));
    fsa.generateFile("r2rml.ttl", this.r2rml(mappings));
  }
  
  public String rml(final Iterable<Mapping> mappings) {
    CharSequence _prefixes = this.prefixes(mappings);
    final Function1<Mapping, CharSequence> _function = (Mapping it) -> {
      return this.rmlTriplesMap(it);
    };
    String _join = IterableExtensions.join(IterableExtensions.<Mapping, CharSequence>map(mappings, _function), "\n");
    return (_prefixes + _join);
  }
  
  public String r2rml(final Iterable<Mapping> mappings) {
    CharSequence _prefixes = this.prefixes(mappings);
    final Function1<Mapping, CharSequence> _function = (Mapping it) -> {
      return this.r2rmlTriplesMap(it);
    };
    String _join = IterableExtensions.join(IterableExtensions.<Mapping, CharSequence>map(mappings, _function), "\n");
    return (_prefixes + _join);
  }
  
  public CharSequence prefixes(final Iterable<Mapping> mappings) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PREFIX rr: <http://www.w3.org/ns/r2rml#>");
    _builder.newLine();
    _builder.append("PREFIX rml: <http://semweb.mmlab.be/ns/rml#>");
    _builder.newLine();
    _builder.append("PREFIX ql: <http://semweb.mmlab.be/ns/ql#>");
    _builder.newLine();
    {
      List<String> _prefixStatements = this.toPrefixStatements(this.vocabulariesUsed(mappings));
      for(final String prefixStmt : _prefixStatements) {
        _builder.append(prefixStmt);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("# debug output ..");
    _builder.newLine();
    {
      for(final Mapping m : mappings) {
        _builder.append("# ");
        String _name = m.getName();
        _builder.append(_name);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence rmlTriplesMap(final Mapping m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<#");
    String _name = m.getName();
    _builder.append(_name);
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rml:logicalSource [  ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("rml:source \"");
    String _sourceResolved = this.sourceResolved(m.getSource());
    _builder.append(_sourceResolved, "\t\t");
    _builder.append("\" ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("rml:referenceFormulation ");
    SourceType _typeResolved = this.typeResolved(m.getSource());
    String _referenceFormulation = null;
    if (_typeResolved!=null) {
      _referenceFormulation=_typeResolved.getReferenceFormulation();
    }
    _builder.append(_referenceFormulation, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _subjectMap = this.subjectMap(m);
    _builder.append(_subjectMap, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<PredicateObjectMapping> _poMappings = m.getPoMappings();
      for(final PredicateObjectMapping pom : _poMappings) {
        _builder.append("\t");
        CharSequence _rmlPredicateObjectMap = this.rmlPredicateObjectMap(pom);
        _builder.append(_rmlPredicateObjectMap, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence r2rmlTriplesMap(final Mapping m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<#");
    String _name = m.getName();
    _builder.append(_name);
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("rr:logicalTable [ rr:tableName \"");
    String _sourceResolved = this.sourceResolved(m.getSource());
    _builder.append(_sourceResolved, "    ");
    _builder.append("\" ];");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _subjectMap = this.subjectMap(m);
    _builder.append(_subjectMap, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    {
      EList<PredicateObjectMapping> _poMappings = m.getPoMappings();
      boolean _hasElements = false;
      for(final PredicateObjectMapping pom : _poMappings) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(";", "    ");
        }
        _builder.append("    ");
        CharSequence _r2rmlPredicateObjectMap = this.r2rmlPredicateObjectMap(pom);
        _builder.append(_r2rmlPredicateObjectMap, "    ");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append(".", "    ");
      }
    }
    return _builder;
  }
  
  public CharSequence subjectMap(final Mapping m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:subjectMap [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rr:template \"");
    String _subjectIri = this.subjectIri(m);
    _builder.append(_subjectIri, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    {
      EList<SubjectTypeMapping> _subjectTypeMappings = m.getSubjectTypeMappings();
      for(final SubjectTypeMapping stm : _subjectTypeMappings) {
        _builder.append("\t");
        _builder.append("rr:class ");
        String _label = this.vocabulary(stm.getType()).getPrefix().getLabel();
        _builder.append(_label, "\t");
        String _name = stm.getType().getName();
        _builder.append(_name, "\t");
        _builder.append(" ;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence rmlPredicateObjectMap(final PredicateObjectMapping pom) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:predicateObjectMap [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rr:predicate ");
    String _label = this.vocabulary(pom.getProperty()).getPrefix().getLabel();
    _builder.append(_label, "\t");
    String _name = pom.getProperty().getName();
    _builder.append(_name, "\t");
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rr:objectMap [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("].");
    _builder.newLine();
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence r2rmlPredicateObjectMap(final PredicateObjectMapping pom) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:predicateObjectMap [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rr:predicate ");
    String _label = this.vocabulary(pom.getProperty()).getPrefix().getLabel();
    _builder.append(_label, "\t");
    String _name = pom.getProperty().getName();
    _builder.append(_name, "\t");
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rr:objectMap [");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _objectTermMap = this.objectTermMap(pom.getTerm());
    _builder.append(_objectTermMap, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("];");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _objectTermMap(final ValuedTerm it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# TODO: implementation missing for ");
    String _name = it.getClass().getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _objectTermMap(final ReferenceValuedTerm it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:column \"");
    String _valueResolved = this.valueResolved(it.getReference());
    _builder.append(_valueResolved);
    _builder.append("\" ;");
    _builder.newLineIfNotEmpty();
    CharSequence _termMapAnnex = this.termMapAnnex(it);
    _builder.append(_termMapAnnex);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _objectTermMap(final TemplateValuedTerm it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:template \"");
    String _templateString = this.toTemplateString(it);
    _builder.append(_templateString);
    _builder.append("\" ;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _objectTermMap(final LinkedResourceTerm it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:template \"");
    String _templateString = this.toTemplateString(it);
    _builder.append(_templateString);
    _builder.append("\" ;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence termMapAnnex(final ReferenceValuedTerm it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      LanguageTag _languageTag = it.getLanguageTag();
      boolean _tripleNotEquals = (_languageTag != null);
      if (_tripleNotEquals) {
        _builder.append("rr:language \"");
        String _name = it.getLanguageTag().getName();
        _builder.append(_name);
        _builder.append("\" ;");
        _builder.newLineIfNotEmpty();
      } else {
        Datatype _datatype = it.getDatatype();
        boolean _tripleNotEquals_1 = (_datatype != null);
        if (_tripleNotEquals_1) {
          _builder.append("rr:datatype ");
          String _label = this.prefix(it.getDatatype()).getLabel();
          _builder.append(_label);
          String _name_1 = it.getDatatype().getName();
          _builder.append(_name_1);
          _builder.append(" ;");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public String subjectIri(final Mapping m) {
    String _pattern = m.getPattern();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    String _valueResolved = this.valueResolved(m.getReference());
    _builder.append(_valueResolved);
    _builder.append("}");
    return MessageFormat.format(_pattern, _builder);
  }
  
  public String toTemplateString(final TemplateValuedTerm it) {
    String _pattern = it.getPattern();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    String _valueResolved = this.valueResolved(it.getReference());
    _builder.append(_valueResolved);
    _builder.append("}");
    return MessageFormat.format(_pattern, _builder);
  }
  
  public String toTemplateString(final LinkedResourceTerm it) {
    String _pattern = it.getMapping().getPattern();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    String _valueResolved = this.valueResolved(it.getReference());
    _builder.append(_valueResolved);
    _builder.append("}");
    return MessageFormat.format(_pattern, _builder);
  }
  
  public String sourceResolved(final LogicalSource it) {
    String _xifexpression = null;
    String _source = it.getSource();
    boolean _tripleNotEquals = (_source != null);
    if (_tripleNotEquals) {
      _xifexpression = it.getSource();
    } else {
      EObject _eContainer = it.eContainer();
      String _source_1 = null;
      if (((SourceGroup) _eContainer)!=null) {
        _source_1=((SourceGroup) _eContainer).getSource();
      }
      _xifexpression = _source_1;
    }
    return _xifexpression;
  }
  
  public SourceType typeResolved(final LogicalSource it) {
    SourceType _xifexpression = null;
    SourceType _type = it.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      _xifexpression = it.getType();
    } else {
      EObject _eContainer = it.eContainer();
      SourceType _type_1 = null;
      if (((SourceGroup) _eContainer)!=null) {
        _type_1=((SourceGroup) _eContainer).getType();
      }
      _xifexpression = _type_1;
    }
    return _xifexpression;
  }
  
  public Vocabulary vocabulary(final RdfClass it) {
    EObject _eContainer = it.eContainer();
    return ((Vocabulary) _eContainer);
  }
  
  public Vocabulary vocabulary(final RdfProperty it) {
    EObject _eContainer = it.eContainer();
    return ((Vocabulary) _eContainer);
  }
  
  public HashSet<Vocabulary> vocabulariesUsed(final Mapping it) {
    HashSet<Vocabulary> _xblockexpression = null;
    {
      final HashSet<Vocabulary> result = new HashSet<Vocabulary>();
      final Function1<SubjectTypeMapping, Vocabulary> _function = (SubjectTypeMapping m) -> {
        return this.vocabulary(m.getType());
      };
      result.addAll(ListExtensions.<SubjectTypeMapping, Vocabulary>map(it.getSubjectTypeMappings(), _function));
      final Function1<PredicateObjectMapping, Vocabulary> _function_1 = (PredicateObjectMapping m) -> {
        return this.vocabulary(m.getProperty());
      };
      result.addAll(ListExtensions.<PredicateObjectMapping, Vocabulary>map(it.getPoMappings(), _function_1));
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public Iterable<Vocabulary> vocabulariesUsed(final Iterable<Mapping> mappings) {
    final Function1<Mapping, HashSet<Vocabulary>> _function = (Mapping m) -> {
      return this.vocabulariesUsed(m);
    };
    return Iterables.<Vocabulary>concat(IterableExtensions.<Mapping, HashSet<Vocabulary>>map(mappings, _function));
  }
  
  public List<String> toPrefixStatements(final Iterable<Vocabulary> vocabularies) {
    final Function1<Vocabulary, String> _function = (Vocabulary voc) -> {
      return this.prefixStatement(voc).toString();
    };
    final Function1<String, String> _function_1 = (String s) -> {
      return s;
    };
    return IterableExtensions.<String, String>sortBy(IterableExtensions.<String>toList(IterableExtensions.<String>toSet(IterableExtensions.<Vocabulary, String>map(vocabularies, _function))), _function_1);
  }
  
  public CharSequence prefixStatement(final Vocabulary voc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PREFIX ");
    String _label = voc.getPrefix().getLabel();
    _builder.append(_label);
    _builder.append(" <");
    String _iri = voc.getPrefix().getIri();
    _builder.append(_iri);
    _builder.append(">");
    return _builder;
  }
  
  public Prefix prefix(final Datatype it) {
    EObject _eContainer = it.eContainer();
    return ((DatatypesDefinition) _eContainer).getPrefix();
  }
  
  public String valueResolved(final Referenceable it) {
    String _value = it.getValue();
    boolean _tripleNotEquals = (_value != null);
    if (_tripleNotEquals) {
      return it.getValue();
    } else {
      return it.getName();
    }
  }
  
  public CharSequence objectTermMap(final ValuedTerm it) {
    if (it instanceof LinkedResourceTerm) {
      return _objectTermMap((LinkedResourceTerm)it);
    } else if (it instanceof ReferenceValuedTerm) {
      return _objectTermMap((ReferenceValuedTerm)it);
    } else if (it instanceof TemplateValuedTerm) {
      return _objectTermMap((TemplateValuedTerm)it);
    } else if (it != null) {
      return _objectTermMap(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
