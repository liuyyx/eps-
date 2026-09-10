const { readdirSync, readFileSync, writeFileSync, existsSync } = require('fs');
const path = require('path');
const DIR = 'C:/Users/liuyyx/Desktop/eps+/work/out/com/github/epsilon';
// Parse decompiled top-level classes only (single letters / 2-char obfuscated, excludes mixins/fabric)
const files = readdirSync(DIR).filter(f => /^[A-Za-z_][A-Za-z0-9_]*\.java$/.test(f) && existsSync(path.join(DIR, f)));
function analyze(f) {
  const s = readFileSync(path.join(DIR, f), 'utf8');
  const name = f.replace('.java', '');
  const out = { name };
  // class/interface/enum/record decl line
  const m = s.match(/(?:public|protected|private)?\s*(?:abstract\s+|final\s+)*((?:class|interface|enum|record))\s+(\w+)((?:<[^>]*>)?)(?:\s+extends\s+([\w.]+))?(?:\s+implements\s+([\w., <>]+))?/);
  if (m) { out.kind = m[1]; out.super = m[4] ? m[4].split('.')[0] : null; out.ifaces = m[5] ? m[5].split(',').map(x => x.trim().split('.')[0]).filter(Boolean) : []; }
  // does it extend e (Module)? implements v8 (SettingHost)?
  out.isModule = !!out.super && out.super === 'e';
  out.isSettingHost = !!out.ifaces && out.ifaces.includes('v8');
  out.isEventBusHolderRef = /import com\.github\.epsilon\.vy;/.test(s);
  // references to key structural hubs
  const hubs = {};
  for (const hub of ['vy', 'hi', 'DM', 'Managers']) {}
  // INSTANCE static pattern
  out.hasInstance = /static\s+(final\s+)?\w+\s+[A-Za-z0-9_]+\s*=\s*new\s+\w+/.test(s);
  // settings DSL calls (methods returning settings): heuristics via method call counts to SettingHost-style
  // count methods with hi.a dispatch (string-encrypted bodies)
  out.stringEncryptedMethods = (s.match(/hi\.a\(/g) || []).length;
  out.sizeLines = s.split('\n').length;
  // count distinct other-epsilon refs used (proxy for dependency size)
  const used = new Set();
  for (const mm of s.matchAll(/import com\.github\.epsilon\.([A-Za-z_][A-Za-z0-9_]*);/g)) used.add(mm[1]);
  out.refs = [...used];
  return out;
}
const recs = files.map(analyze);
writeFileSync('C:/Users/liuyyx/Desktop/eps+/work/obf_class_signatures.json', JSON.stringify(recs, null, 1));
// summary
const count = k => recs.filter(r => r[k]).length;
console.log('top-level obfuscated classes:', recs.length);
console.log('extends e (Module?) :', count('isModule'));
console.log('implements v8 (SettingHost?):', count('isSettingHost'));
console.log('has static INSTANCE new:', count('hasInstance'));
console.log('refs eventbus holder vy:', count('isEventBusHolderRef'));
console.log('kinds:', [...new Set(recs.map(r => r.kind))].join(','));
console.log('kinds count:', recs.reduce((a, r) => (a[r.kind] = (a[r.kind] || 0) + 1, a), {}));
// modules: extends e but not v8 directly (Module implements SettingHost via e)
console.log('\nsample modules (extends e):');
recs.filter(r => r.isModule).slice(0, 15).forEach(r => console.log(' ', r.name, 'size=' + r.sizeLines, 'refs=' + r.refs.length));
