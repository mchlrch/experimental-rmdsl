#!/bin/sh

# i made this, because target/languageserver/bin/mydsl-ls didn't work properly 

BASEDIR=~/git/experimental-rmdsl/com.zazuko.experimental.rmdsl.parent/com.zazuko.experimental.rmdsl.ide/target/languageserver
REPO=$BASEDIR/repo
JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
JAVACMD="$JAVA_HOME/bin/java"
CLASSPATH="$REPO"/*

# uncomment this for remote debugging
#JAVA_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000"

ARGS="-trace -log -noValidate"

$JAVACMD $JAVA_OPTS  \
  -classpath "$CLASSPATH" \
  -Dapp.name="mydsl-ls" \
  -Dapp.pid="$$" \
  -Dapp.repo="$REPO" \
  -Dapp.home="$BASEDIR" \
  -Dbasedir="$BASEDIR" \
  org.eclipse.xtext.ide.server.ServerLauncher \
  $ARGS
