#!/bin/bash
# Batch decompile epsilon classes with CFR into mirrored java tree
SRC="/c/Users/liuyyx/Desktop/eps+/work/classes"
DST="/c/Users/liuyyx/Desktop/eps+/work/out"
CFR='C:\tools\cfr.jar'
mkdir -p "$DST"
count=0
fail=0
shopt -s globstar nullglob
for f in "$SRC"/**/*.class; do
  rel="${f#$SRC/}"
  b="${rel%.class}"
  mkdir -p "$DST/$(dirname "$rel")"
  outfile="$DST/$b.java"
  java -jar "$CFR" --silent true "$f" > "$outfile" 2>/dev/null
  count=$((count+1))
  if ! grep -q "Decompiled with CFR" "$outfile" 2>/dev/null; then
    fail=$((fail+1))
    echo "EMPTY: $rel"
  fi
done
echo "DONE total=$count empty=$fail"
