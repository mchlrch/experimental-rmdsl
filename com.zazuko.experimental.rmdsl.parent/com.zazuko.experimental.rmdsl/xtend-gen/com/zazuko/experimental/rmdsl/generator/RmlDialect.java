package com.zazuko.experimental.rmdsl.generator;

import com.zazuko.experimental.rmdsl.generator.ModelAccess;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RmlDialect {
  public CharSequence staticPrefixes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PREFIX rr: <http://www.w3.org/ns/r2rml#>");
    _builder.newLine();
    _builder.append("PREFIX rml: <http://semweb.mmlab.be/ns/rml#>");
    _builder.newLine();
    _builder.append("PREFIX ql: <http://semweb.mmlab.be/ns/ql#>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence logicalSource(final Mapping m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rml:logicalSource [");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rml:source \"");
    String _sourceResolved = ModelAccess.sourceResolved(m.getSource());
    _builder.append(_sourceResolved, "\t");
    _builder.append("\" ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rml:referenceFormulation ");
    SourceType _typeResolved = ModelAccess.typeResolved(m.getSource());
    String _referenceFormulation = null;
    if (_typeResolved!=null) {
      _referenceFormulation=_typeResolved.getReferenceFormulation();
    }
    _builder.append(_referenceFormulation, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence objectMapReferencePredicate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rml:reference");
    return _builder;
  }
}
