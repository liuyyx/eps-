/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon._Z;
import com.github.epsilon.gk;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class l8 {
    protected final gk d;
    private final _Z K = new _Z();
    protected float P;
    protected float k;
    private float N;
    protected float Z;
    private final int I;
    private static final long[] ab;
    private static final Integer[] bb;

    public abstract void B(Object[] var1);

    public void b(Object[] objectArray) {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected Color V(Color color) {
        boolean bl = Dl.S();
        int n = l8.a(6206, 2343857132311543266L) * l8.a(22148, 3897721636154815307L) * l8.a(29687, 7365698842811045417L) ^ l8.a(19879, 5510078145941809264L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        reference cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)512562801530728585L) - 1.0f;
                        Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                        if (!bl) break block9;
                        if (object2 >= 0) break block10;
                        object2 = object = (Object)(hi.a("G", (int)l8.a(13741, 5613243930017288319L), (int)l8.a(5299, 3817144219677323609L), (long)834203424483934088L) ^ l8.a(5515, 8410166170098135124L));
                    }
                    if (bl) break block8;
                }
                object = (l8.a(11372, 7927177770419636621L) ^ l8.a(262, 3296767628958950621L)) * l8.a(2817, 8156771280302698220L) + l8.a(21540, 8701784037562331620L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case 1630549065: {
                    return color;
                }
                case 1630549064: {
                    CallSite callSite = hi.a("G", (int)((int)((float)hi.a("\u00a5", (Object)color, (long)999912139159319168L) * hi.a("\u00e9", (Object)this, (long)512562801530728585L))), (int)0, (int)l8.a(26850, 3856415386115181873L), (long)1051766797435725461L);
                    return new Color((int)hi.a("\u00a5", (Object)color, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)color, (long)791634218836538619L), (int)hi.a("\u00a5", (Object)color, (long)505295769199362574L), (int)callSite);
                }
                case 1630549063: 
            }
            break;
        }
        throw null;
    }

    protected l8(gk gk2, int n) {
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)512562801530728585L);
        this.d = gk2;
        this.I = n;
    }

    public static /* bridge */ /* synthetic */ CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    /*
     * Exception decompiling
     */
    public boolean C() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void C(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)f, (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)512562801530728585L);
    }

    public float E(Object[] objectArray) {
        return (float)hi.a("\u00e9", (Object)this, (long)473417052379647873L);
    }

    public abstract void n(Object[] var1);

    public int K() {
        return (int)hi.a("\u00e9", (Object)this, (long)911330066392900063L);
    }

    public float S(Object[] objectArray) {
        return (float)hi.a("\u00e9", (Object)this, (long)499790097997204220L);
    }

    public float C(Object[] objectArray) {
        return (float)hi.a("\u00e9", (Object)this, (long)1201138026471431927L);
    }

    public boolean S() {
        return (boolean)hi.a("\u00a5", (Object)this, (long)1305017658517506148L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6718792725890677179L;
                var6_1 = new long[42];
                var3_2 = 0;
                var4_3 = "M/\u00e2\u0084Itzj\u0092\u00fd})\u00a3\u00dd,A<\u009f/2\u00aa\u00df\u009d\u0015=\u00bd\u0018\u00da\"\u001dgX\u001f\u00f8\u00af\u00b4\u00f8\u00ba\u0087\n8X\u00c8\u001e\"\u0098\u000e\u00b1S=n\u00bf?}\u0091\u00e3\u0096\u008a)\u0089>\u00f7\u00c0>\u00f5\u00bcp0X9\u0004\u001b\u0094<\u009bR\u008e4h\u0095\u00e3\u00e7\u00ab\u00b5\u00e2-3\u0091\u000bw\u00f03\u000332\r\u00d4\u0002\u0080c\u00d8)\u00c8\u0017\u00aa\u0092\u00bd\u001c\u0000|?\u008b\u008b{k<\u00fe\u0002\u00b5qA\u009f\u00b5\u00ff\nv\u008b\u00bc\u001e\u0090b(p\u00b5\u00cbZ\u00e6\u0091\u001ew<7u\u00c4?\u0017\u00fb\u00c6g\u00b7\u00ddx\u00f6\u00b2\u0090M \u0085\u0016\u00de\u00df\u00fb\u00f9\u00ddz\u00e6\u0015\u00af\u0010\u0003oI\u0004\u008d\u0013\u00ae\u00df\u00eb<\u0002\u00f1;K~\r\u0016$E\u0097+\u00caY\u008e\u00c7HF(\u00dbc^\u00b3\u00a0\u00a3\u00ac\u00146x\u008e\u0086\u00e7B\u009dy\u008e4u_\u0006o\"\u0017\u00a8\u001e\u008d\u00ad\u00a6!\u00ca\u00f5\u00a7}\u0080\u008f9\u00a2\u0099y\u00d8.H2R\u00fe3\u00b9\"\r\u00e6am<\u0011\u0019\u00cb'2iX\u0018\u00f8\u00ce\u00f6\u0098\u0017\u0098\u001b\u0011\u0014\u00f1Q\u00a2\u0019\u00d9\u00e2u\ny\b8N\u00c4\u0096\u00fa\t\u0098\u00f2\u00fe;.\u00b8\u0007\u00b0pG8\f\u00ff\u009f\u00f2{\u000f\u008b=\u00e0\u00a0\u00d3\u0083]\bume\u00be\u00ac\u00078\u00b0\u00f0\u009br";
                var5_4 = "M/\u00e2\u0084Itzj\u0092\u00fd})\u00a3\u00dd,A<\u009f/2\u00aa\u00df\u009d\u0015=\u00bd\u0018\u00da\"\u001dgX\u001f\u00f8\u00af\u00b4\u00f8\u00ba\u0087\n8X\u00c8\u001e\"\u0098\u000e\u00b1S=n\u00bf?}\u0091\u00e3\u0096\u008a)\u0089>\u00f7\u00c0>\u00f5\u00bcp0X9\u0004\u001b\u0094<\u009bR\u008e4h\u0095\u00e3\u00e7\u00ab\u00b5\u00e2-3\u0091\u000bw\u00f03\u000332\r\u00d4\u0002\u0080c\u00d8)\u00c8\u0017\u00aa\u0092\u00bd\u001c\u0000|?\u008b\u008b{k<\u00fe\u0002\u00b5qA\u009f\u00b5\u00ff\nv\u008b\u00bc\u001e\u0090b(p\u00b5\u00cbZ\u00e6\u0091\u001ew<7u\u00c4?\u0017\u00fb\u00c6g\u00b7\u00ddx\u00f6\u00b2\u0090M \u0085\u0016\u00de\u00df\u00fb\u00f9\u00ddz\u00e6\u0015\u00af\u0010\u0003oI\u0004\u008d\u0013\u00ae\u00df\u00eb<\u0002\u00f1;K~\r\u0016$E\u0097+\u00caY\u008e\u00c7HF(\u00dbc^\u00b3\u00a0\u00a3\u00ac\u00146x\u008e\u0086\u00e7B\u009dy\u008e4u_\u0006o\"\u0017\u00a8\u001e\u008d\u00ad\u00a6!\u00ca\u00f5\u00a7}\u0080\u008f9\u00a2\u0099y\u00d8.H2R\u00fe3\u00b9\"\r\u00e6am<\u0011\u0019\u00cb'2iX\u0018\u00f8\u00ce\u00f6\u0098\u0017\u0098\u001b\u0011\u0014\u00f1Q\u00a2\u0019\u00d9\u00e2u\ny\b8N\u00c4\u0096\u00fa\t\u0098\u00f2\u00fe;.\u00b8\u0007\u00b0pG8\f\u00ff\u009f\u00f2{\u000f\u008b=\u00e0\u00a0\u00d3\u0083]\bume\u00be\u00ac\u00078\u00b0\u00f0\u009br".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00a8X\bcR\u000e\u00d9\u0085\u0098\u008e3\u0004C\u0092\u00048";
                    var5_4 = "\u00a8X\bcR\u000e\u00d9\u0085\u0098\u008e3\u0004C\u0092\u00048".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        l8.ab = var6_1;
        l8.bb = new Integer[42];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x65C9;
        if (bb[n2] == null) {
            l8.bb[n2] = (int)(ab[n2] ^ l);
        }
        return bb[n2];
    }
}
