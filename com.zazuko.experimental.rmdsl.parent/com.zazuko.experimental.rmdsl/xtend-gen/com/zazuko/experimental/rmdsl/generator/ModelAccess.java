package com.zazuko.experimental.rmdsl.generator;

import com.google.common.collect.Iterables;
import com.zazuko.experimental.rmdsl.rdfMapping.Datatype;
import com.zazuko.experimental.rmdsl.rdfMapping.DatatypesDefinition;
import com.zazuko.experimental.rmdsl.rdfMapping.LogicalSource;
import com.zazuko.experimental.rmdsl.rdfMapping.Mapping;
import com.zazuko.experimental.rmdsl.rdfMapping.PredicateObjectMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.Prefix;
import com.zazuko.experimental.rmdsl.rdfMapping.PrefixHolder;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfClass;
import com.zazuko.experimental.rmdsl.rdfMapping.RdfProperty;
import com.zazuko.experimental.rmdsl.rdfMapping.ReferenceValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Referenceable;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceGroup;
import com.zazuko.experimental.rmdsl.rdfMapping.SourceType;
import com.zazuko.experimental.rmdsl.rdfMapping.SubjectTypeMapping;
import com.zazuko.experimental.rmdsl.rdfMapping.ValuedTerm;
import com.zazuko.experimental.rmdsl.rdfMapping.Vocabulary;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
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
  
  public static HashSet<PrefixHolder> prefixesUsed(final Mapping it) {
    final HashSet<PrefixHolder> result = new HashSet<PrefixHolder>();
    final Function1<SubjectTypeMapping, Vocabulary> _function = (SubjectTypeMapping m) -> {
      return ModelAccess.vocabulary(m.getType());
    };
    result.addAll(ListExtensions.<SubjectTypeMapping, Vocabulary>map(it.getSubjectTypeMappings(), _function));
    final Function1<PredicateObjectMapping, Vocabulary> _function_1 = (PredicateObjectMapping m) -> {
      return ModelAccess.vocabulary(m.getProperty());
    };
    result.addAll(ListExtensions.<PredicateObjectMapping, Vocabulary>map(it.getPoMappings(), _function_1));
    EList<PredicateObjectMapping> _poMappings = it.getPoMappings();
    for (final PredicateObjectMapping poMapping : _poMappings) {
      {
        final ValuedTerm term = poMapping.getTerm();
        if ((term instanceof ReferenceValuedTerm)) {
          Datatype _datatype = ((ReferenceValuedTerm)term).getDatatype();
          boolean _tripleNotEquals = (_datatype != null);
          if (_tripleNotEquals) {
            result.add(ModelAccess.datatypesDefinition(((ReferenceValuedTerm)term).getDatatype()));
          }
        }
      }
    }
    return result;
  }
  
  public static Set<PrefixHolder> prefixesUsed(final Iterable<Mapping> mappings) {
    final Function1<Mapping, HashSet<PrefixHolder>> _function = (Mapping m) -> {
      return ModelAccess.prefixesUsed(m);
    };
    return IterableExtensions.<PrefixHolder>toSet(Iterables.<PrefixHolder>concat(IterableExtensions.<Mapping, HashSet<PrefixHolder>>map(mappings, _function)));
  }
  
  public static List<PrefixHolder> inDeterministicOrder(final Iterable<PrefixHolder> prefixHolders) {
    final Function1<PrefixHolder, String> _function = (PrefixHolder s) -> {
      return s.getPrefix().getLabel();
    };
    return IterableExtensions.<PrefixHolder, String>sortBy(IterableExtensions.<PrefixHolder>toList(IterableExtensions.<PrefixHolder>toSet(prefixHolders)), _function);
  }
  
  public static DatatypesDefinition datatypesDefinition(final Datatype it) {
    EObject _eContainer = it.eContainer();
    return ((DatatypesDefinition) _eContainer);
  }
  
  public static Prefix prefix(final Datatype it) {
    return ModelAccess.datatypesDefinition(it).getPrefix();
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
