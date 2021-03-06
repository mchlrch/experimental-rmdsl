package com.zazuko.experimental.rmdsl.generator;

import com.zazuko.experimental.rmdsl.generator.ModelAccess;
import com.zazuko.experimental.rmdsl.generator.RmlDialect;
import com.zazuko.experimental.rmdsl.rdfMapping.Datatype;
import com.zazuko.experimental.rmdsl.rdfMapping.LanguageTag;
import com.zazuko.experimental.rmdsl.rdfMapping.LinkedResourceTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.PrefixHolder;
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable;
import com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.TemplateValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.ValuedTerm;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RmlDialectGenerator {
  /**
   * RML broadens R2RML's scope of application beyond that of relational databases.
   * For details: http://rml.io/RML_R2RML.html
   * 
   * In places where RML and R2RML differ, this generator dispatches to the respective dialect.
   */
  @Extension
  private final RmlDialect dialect;
  
  public RmlDialectGenerator(final RmlDialect dialect) {
    this.dialect = dialect;
  }
  
  public String generateTurtle(final Iterable<Mapping> mappings) {
    CharSequence _prefixes = this.prefixes(mappings);
    final Function1<Mapping, CharSequence> _function = (Mapping it) -> {
      return this.triplesMap(it);
    };
    String _join = IterableExtensions.join(IterableExtensions.<Mapping, CharSequence>map(mappings, _function), "\n");
    return (_prefixes + _join);
  }
  
  public CharSequence prefixes(final Iterable<Mapping> mappings) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _staticPrefixes = this.dialect.staticPrefixes();
    _builder.append(_staticPrefixes);
    _builder.newLineIfNotEmpty();
    {
      List<PrefixHolder> _inDeterministicOrder = ModelAccess.inDeterministicOrder(ModelAccess.prefixesUsed(mappings));
      for(final PrefixHolder prefixHolder : _inDeterministicOrder) {
        _builder.append("PREFIX ");
        String _label = prefixHolder.getPrefix().getLabel();
        _builder.append(_label);
        _builder.append(" <");
        String _iri = prefixHolder.getPrefix().getIri();
        _builder.append(_iri);
        _builder.append(">");
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
  
  public CharSequence triplesMap(final Mapping m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<#");
    String _name = m.getName();
    _builder.append(_name);
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _logicalSource = this.dialect.logicalSource(m);
    _builder.append(_logicalSource, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _subjectMap = this.subjectMap(m);
    _builder.append(_subjectMap, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<PredicateObjectMapping> _poMappings = m.getPoMappings();
      boolean _hasElements = false;
      for(final PredicateObjectMapping pom : _poMappings) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(";", "\t");
        }
        _builder.append("\t");
        CharSequence _predicateObjectMap = this.predicateObjectMap(pom);
        _builder.append(_predicateObjectMap, "\t");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append(".", "\t");
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
        String _label = ModelAccess.vocabulary(stm.getType()).getPrefix().getLabel();
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
  
  public CharSequence predicateObjectMap(final PredicateObjectMapping pom) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:predicateObjectMap [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rr:predicate ");
    String _label = ModelAccess.vocabulary(pom.getProperty()).getPrefix().getLabel();
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
    CharSequence _objectMapReferencePredicate = this.dialect.objectMapReferencePredicate();
    _builder.append(_objectMapReferencePredicate);
    _builder.append(" \"");
    String _valueResolved = ModelAccess.valueResolved(it.getReference());
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
          String _label = ModelAccess.prefix(it.getDatatype()).getLabel();
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
  
  public String subjectIri(final Mapping it) {
    return this.toTemplateString(it.getSubjectIriMapping());
  }
  
  public String toTemplateString(final TemplateValuedTerm it) {
    return this.apply(it.getTemplate(), it.getReferences());
  }
  
  public String toTemplateString(final LinkedResourceTerm it) {
    return this.apply(it.getMapping().getSubjectIriMapping().getTemplate(), it.getReferences());
  }
  
  public String apply(final String template, final List<Referenceable> refs) {
    return MessageFormat.format(template, this.toMessageFormatArguments(refs));
  }
  
  public Object[] toMessageFormatArguments(final List<Referenceable> refs) {
    final Function1<Referenceable, String> _function = (Referenceable ref) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      String _valueResolved = ModelAccess.valueResolved(ref);
      _builder.append(_valueResolved);
      _builder.append("}");
      return _builder.toString();
    };
    return ListExtensions.<Referenceable, String>map(refs, _function).toArray();
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
