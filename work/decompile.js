const { readdirSync, statSync, mkdirSync, writeFileSync } = require('fs');
const { spawnSync } = require('child_process');
const path = require('path');
const SRC = 'C:/Users/liuyyx/Desktop/eps+/work/classes';
const DST = 'C:/Users/liuyyx/Desktop/eps+/work/out';
function walk(d, out = []) { for (const e of readdirSync(d)) { const p = path.join(d, e); if (statSync(p).isDirectory()) walk(p, out); else if (e.endsWith('.class')) out.push(p); } return out; }
const classes = walk(SRC);
mkdirSync(DST, { recursive: true });
let ok = 0, empty = 0, skip = 0;
const t0 = Date.now();
const failLog = [];
for (const [i, f] of classes.entries()) {
  const rel = path.relative(SRC, f).replace(/\\/g, '/');
  const b = rel.replace(/\.class$/, '');
  const ofp = path.join(DST, b + '.java');
  if (require('fs').existsSync(ofp)) { skip++; continue; }
  mkdirSync(path.dirname(ofp), { recursive: true });
  const r = spawnSync('java', ['-jar', 'C:\\tools\\cfr.jar', '--silent', 'true', f], { encoding: 'utf8', maxBuffer: 512 * 1024 * 1024, timeout: 60000 });
  if (r.stdout && r.stdout.includes('Decompiled with CFR')) { writeFileSync(ofp, r.stdout); ok++; }
  else { empty++; failLog.push(rel); }
  if ((i + 1) % 200 === 0) console.log((i + 1) + '/' + classes.length + ' ok=' + ok + ' empty=' + empty + ' skip=' + skip + ' ' + ((Date.now() - t0) / 1000).toFixed(0) + 's');
}
writeFileSync('C:/Users/liuyyx/Desktop/eps+/work/decompile_failures.txt', failLog.join('\n'));
console.log('DONE total=' + classes.length + ' ok=' + ok + ' empty=' + empty + ' skip=' + skip + ' in ' + ((Date.now() - t0) / 1000).toFixed(0) + 's');
console.log('FAILURES first 20:\n' + failLog.slice(0, 20).join('\n'));
