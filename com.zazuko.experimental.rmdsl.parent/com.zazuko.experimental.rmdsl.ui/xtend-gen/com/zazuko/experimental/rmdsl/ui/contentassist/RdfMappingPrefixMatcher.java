package com.zazuko.experimental.rmdsl.ui.contentassist;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher;

@SuppressWarnings("all")
public class RdfMappingPrefixMatcher extends FQNPrefixMatcher {
  @Inject(optional = true)
  @Named("org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.delimiter")
  private char delimiter = '.';
  
  @Override
  public boolean isCandidateMatchingPrefix(final String name, final String prefix) {
    final boolean match = super.isCandidateMatchingPrefix(name, prefix);
    if ((match && (prefix.indexOf(this.delimiter) >= 0))) {
      return name.contains(prefix);
    }
    return match;
  }
}
