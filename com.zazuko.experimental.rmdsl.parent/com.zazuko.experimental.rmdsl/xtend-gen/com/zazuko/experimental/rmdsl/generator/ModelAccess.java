package com.zazuko.experimental.rmdsl.generator;

import com.google.common.collect.Iterables;
import com.zazuko.experimental.rmdsl.rdfMapping.Datatype;
import com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition;
import com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.Prefix;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfClass;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty;
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceType;
import com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ModelAccess {
  public static String sourceResolved(final LogicalSource it) {
    String _xifexpression = null;
    String _source = it.getSource();
    boolean _tripleNotEquals = (_source != null);
    if (_tripleNotEquals) {
      _xifexpression = it.getSource();
    } else {
      SourceGroup _sourceGroup = ModelAccess.sourceGroup(it);
      String _source_1 = null;
      if (_sourceGroup!=null) {
        _source_1=_sourceGroup.getSource();
      }
      _xifexpression = _source_1;
    }
    return _xifexpression;
  }
  
  public static SourceType typeResolved(final LogicalSource it) {
    SourceType _xifexpression = null;
    SourceType _type = it.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      _xifexpression = it.getType();
    } else {
      SourceGroup _sourceGroup = ModelAccess.sourceGroup(it);
      SourceType _type_1 = null;
      if (_sourceGroup!=null) {
        _type_1=_sourceGroup.getType();
      }
      _xifexpression = _type_1;
    }
    return _xifexpression;
  }
  
  public static SourceGroup sourceGroup(final LogicalSource it) {
    EObject _eContainer = it.eContainer();
    if ((_eContainer instanceof SourceGroup)) {
      EObject _eContainer_1 = it.eContainer();
      return ((SourceGroup) _eContainer_1);
    } else {
      return null;
    }
  }
  
  public static Vocabulary vocabulary(final RdfClass it) {
    EObject _eContainer = it.eContainer();
    return ((Vocabulary) _eContainer);
  }
  
  public static Vocabulary vocabulary(final RdfProperty it) {
    EObject _eContainer = it.eContainer();
    return ((Vocabulary) _eContainer);
  }
  
  public static HashSet<Vocabulary> vocabulariesUsed(final Mapping it) {
    HashSet<Vocabulary> _xblockexpression = null;
    {
      final HashSet<Vocabulary> result = new HashSet<Vocabulary>();
      final Function1<SubjectTypeMapping, Vocabulary> _function = (SubjectTypeMapping m) -> {
        return ModelAccess.vocabulary(m.getType());
      };
      result.addAll(ListExtensions.<SubjectTypeMapping, Vocabulary>map(it.getSubjectTypeMappings(), _function));
      final Function1<PredicateObjectMapping, Vocabulary> _function_1 = (PredicateObjectMapping m) -> {
        return ModelAccess.vocabulary(m.getProperty());
      };
      result.addAll(ListExtensions.<PredicateObjectMapping, Vocabulary>map(it.getPoMappings(), _function_1));
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static Set<Vocabulary> vocabulariesUsed(final Iterable<Mapping> mappings) {
    final Function1<Mapping, HashSet<Vocabulary>> _function = (Mapping m) -> {
      return ModelAccess.vocabulariesUsed(m);
    };
    return IterableExtensions.<Vocabulary>toSet(Iterables.<Vocabulary>concat(IterableExtensions.<Mapping, HashSet<Vocabulary>>map(mappings, _function)));
  }
  
  public static List<Vocabulary> inDeterministicOrder(final Iterable<Vocabulary> vocabularies) {
    final Function1<Vocabulary, String> _function = (Vocabulary s) -> {
      return s.getPrefix().getLabel();
    };
    return IterableExtensions.<Vocabulary, String>sortBy(IterableExtensions.<Vocabulary>toList(IterableExtensions.<Vocabulary>toSet(vocabularies)), _function);
  }
  
  public static Prefix prefix(final Datatype it) {
    EObject _eContainer = it.eContainer();
    return ((DatatypesDefinition) _eContainer).getPrefix();
  }
  
  public static String valueResolved(final Referenceable it) {
    String _value = it.getValue();
    boolean _tripleNotEquals = (_value != null);
    if (_tripleNotEquals) {
      return it.getValue();
    } else {
      return it.getName();
    }
  }
}
