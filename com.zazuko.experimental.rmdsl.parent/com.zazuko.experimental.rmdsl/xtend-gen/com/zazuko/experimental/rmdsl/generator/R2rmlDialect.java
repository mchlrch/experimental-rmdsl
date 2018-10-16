package com.zazuko.experimental.rmdsl.generator;

import com.zazuko.experimental.rmdsl.generator.ModelAccess;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class R2rmlDialect {
  public CharSequence staticPrefixes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PREFIX rr: <http://www.w3.org/ns/r2rml#>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence logicalTable(final Mapping m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:logicalTable [ rr:tableName \"");
    String _sourceResolved = ModelAccess.sourceResolved(m.getSource());
    _builder.append(_sourceResolved);
    _builder.append("\" ];");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence objectMapReferencePredicate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rr:column");
    return _builder;
  }
}
