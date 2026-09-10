/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

final class im {
    private final float u;
    private final float t;
    private final float x;
    private final float U;
    private static final long[] a;
    private static final Integer[] b;

    private im(float f, float f2, float f3, float f4) {
        this.t = f;
        this.x = f2;
        this.U = f3;
        this.u = f4;
    }

    public static /* bridge */ /* synthetic */ CallSite R(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    private static im L(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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

    private float P(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = 2.0f + hi.a("\u00e9", (Object)this, (long)1151916760804709076L) / 4.0f;
        CallSite callSite = hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)544359803893996929L) - f / f2), (float)(hi.a("\u00e9", (Object)this, (long)544359803893996929L) * 0.2f), (float)20.0f, (long)390336973585993938L);
        float f3 = f * (1.0f - callSite / 25.0f);
        return f3 * hi.a("\u00e9", (Object)this, (long)1324923632568382412L) * hi.a("\u00e9", (Object)this, (long)491630114268448273L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2290512274043371278L;
                var6_1 = new long[73];
                var3_2 = 0;
                var4_3 = "\u0016\u00bfh\u00b7\u00bcfXd*\u00d9X\u00e5&C\u001fK\u00cb]^\u0096\u00cfI\u008e\u00abOJq\u0088\b11\u007fMv\u009c\u00de\u00caa,\u00b35)7\u00f2\u00d1\u00b3\u0099\u0087\u00e5>\u0011\u008e\u00f0\u000bnZz\u00e9^\u00d2\u00cfz\u00baOU\u0001]\u00a7\u000e\u00bb\u009eb]~S\u00ed\u00ef\u00deh]\u00ad\u00fb\u008a\u009e\u001fK\u009d\u00bf\u00c7&\u0081\u00ed\u00e2\u00f1 \u00ff[l\u009e\u0086\u00ec\u00ce\u001fKy\u00d9\u00b2]\u00cf]\u00e4\u00a3\u00ff\u0093V\u00de\u00bf\u00ae\u0006\u00d4Wb\u00ad\u00cevk\u00b6\u000f\u000b6\u0019\"\u00b6a\u00ec\u00d2\u000e1\u00929j$J\u0004\u001exp\u00d0\u001a\u00c8\u00d0\u0011\u00c9\r\u001c\u00f4\u0094*\u00e2\u0085\u00cd\u0013\u00a8w\u00fb(\u00ae\u00bf\u007f@\u00ce\u00de-bG\u00a0\u0088\u00c5\u008dK\u00a0y\u00df\u0002\u00ccXe\u0000\u00c5X\u00ce\u0007\u008d\u00ef\u00b6\u00ab\u0016\u0094\u0090\u00f6\u0016\u0002\u00bc*\u00c3a\u00af\u008e?\b\u00e0\u00e9j\u0095@\u00ed/\u0012\u009b\u00d3\u00cd\u00f5\u00a9\u0002\u0098\u00a9$r\u00dd\u00bd\u00b3\u00b2\u00a9&\u009f\n\u0081\u00a93\u001d\u00c2\u001f8G\u0099t\u0002\u00d1^\u00f3\u00ed1W\u00e9\u008ay\"\u008d\u007f\u00d9G&~\u0098K\u008ec\u00c3\u0017^\u00bd\u00d7\u00c3\u0018\u00ddd\u00e4\u00c9\u0095\u00aa/\u00f0\u000f\u0019\u00eb\u008a\u00e5\u00df57P\u0003\u0092R}\rP\u009aG\u001b.Ko\u00e8\u001b,\u0010-\f\u001al*ulz\u00fa3\u00bf3X\u00c2\u00bfu'\u0097v\u0084\u0098f\u00a2\u00fc\u0011\u00e1-i\u00d3}g\u00b8\u0085\u00ab&\u0082\u0016\u00e8\u0089X\u00b6e\u0081et\u00f1Os\u0091\u00ab|\u00ec\u0081\u00f6\u0004\t\u001d\\'j\u00c72\u00bd-\u00c1y\u001a\f\f\u00e9\u0003\u00e8%\u00f1\u00ce\u000f7C?\u0012\u00c7\u00bb\u0098\u00b7I\u0002?\u00a9\u0091\u009c\rg\u0093R\u00a6[J[5\u00dda\u00b9DL\u001e~\u0010v\u00dc9\u00d6\u00bb'\t\u0001L\u00f3\u0081\u00c5\u00a4\u00da\u00c991\u0093\u008d\u001c\u00fcs\u00e0\u0012O\u00aa\u009e\u00e2\u00ceIP\u001c\u00b4\u00eb\u00c8\u0085\u00c5Z7\u00e5\u00a6\u00b5\u000f\u0015\n\u00b0\u0012\u0001\u00a23L\u008f\u00c9\r\u00aa\u009as\u00a4\u00fd\u00aacP\u00f6\u001a\u00eb\u00c3\u00f6\u0096\u0081\u00c5PO_\u00e2\u00e7\"\u0094)\bU@^Z!\u0082B\u00b7\u00ba\u0084\u00d1\u00f3\u0081\u00d2^\u0000\u00ecg+\u001a\u0003\u0010N7\u00fe\u00f9T\u00ba\u008ez \u00b9\u00dd\u0017\nrZ\u00a7#\u00a2Y\u009d\u009ak(\u00ea\u0011`C\u001dv\u00ba\u00ba%\u00d2hg\u00dd\u0017\u0098\u00f6\u0092\u00beb\u00a2\u0082\u00c9Q\u0095\u000f\u00f4\u0089\u00bf\u0096;";
                var5_4 = "\u0016\u00bfh\u00b7\u00bcfXd*\u00d9X\u00e5&C\u001fK\u00cb]^\u0096\u00cfI\u008e\u00abOJq\u0088\b11\u007fMv\u009c\u00de\u00caa,\u00b35)7\u00f2\u00d1\u00b3\u0099\u0087\u00e5>\u0011\u008e\u00f0\u000bnZz\u00e9^\u00d2\u00cfz\u00baOU\u0001]\u00a7\u000e\u00bb\u009eb]~S\u00ed\u00ef\u00deh]\u00ad\u00fb\u008a\u009e\u001fK\u009d\u00bf\u00c7&\u0081\u00ed\u00e2\u00f1 \u00ff[l\u009e\u0086\u00ec\u00ce\u001fKy\u00d9\u00b2]\u00cf]\u00e4\u00a3\u00ff\u0093V\u00de\u00bf\u00ae\u0006\u00d4Wb\u00ad\u00cevk\u00b6\u000f\u000b6\u0019\"\u00b6a\u00ec\u00d2\u000e1\u00929j$J\u0004\u001exp\u00d0\u001a\u00c8\u00d0\u0011\u00c9\r\u001c\u00f4\u0094*\u00e2\u0085\u00cd\u0013\u00a8w\u00fb(\u00ae\u00bf\u007f@\u00ce\u00de-bG\u00a0\u0088\u00c5\u008dK\u00a0y\u00df\u0002\u00ccXe\u0000\u00c5X\u00ce\u0007\u008d\u00ef\u00b6\u00ab\u0016\u0094\u0090\u00f6\u0016\u0002\u00bc*\u00c3a\u00af\u008e?\b\u00e0\u00e9j\u0095@\u00ed/\u0012\u009b\u00d3\u00cd\u00f5\u00a9\u0002\u0098\u00a9$r\u00dd\u00bd\u00b3\u00b2\u00a9&\u009f\n\u0081\u00a93\u001d\u00c2\u001f8G\u0099t\u0002\u00d1^\u00f3\u00ed1W\u00e9\u008ay\"\u008d\u007f\u00d9G&~\u0098K\u008ec\u00c3\u0017^\u00bd\u00d7\u00c3\u0018\u00ddd\u00e4\u00c9\u0095\u00aa/\u00f0\u000f\u0019\u00eb\u008a\u00e5\u00df57P\u0003\u0092R}\rP\u009aG\u001b.Ko\u00e8\u001b,\u0010-\f\u001al*ulz\u00fa3\u00bf3X\u00c2\u00bfu'\u0097v\u0084\u0098f\u00a2\u00fc\u0011\u00e1-i\u00d3}g\u00b8\u0085\u00ab&\u0082\u0016\u00e8\u0089X\u00b6e\u0081et\u00f1Os\u0091\u00ab|\u00ec\u0081\u00f6\u0004\t\u001d\\'j\u00c72\u00bd-\u00c1y\u001a\f\f\u00e9\u0003\u00e8%\u00f1\u00ce\u000f7C?\u0012\u00c7\u00bb\u0098\u00b7I\u0002?\u00a9\u0091\u009c\rg\u0093R\u00a6[J[5\u00dda\u00b9DL\u001e~\u0010v\u00dc9\u00d6\u00bb'\t\u0001L\u00f3\u0081\u00c5\u00a4\u00da\u00c991\u0093\u008d\u001c\u00fcs\u00e0\u0012O\u00aa\u009e\u00e2\u00ceIP\u001c\u00b4\u00eb\u00c8\u0085\u00c5Z7\u00e5\u00a6\u00b5\u000f\u0015\n\u00b0\u0012\u0001\u00a23L\u008f\u00c9\r\u00aa\u009as\u00a4\u00fd\u00aacP\u00f6\u001a\u00eb\u00c3\u00f6\u0096\u0081\u00c5PO_\u00e2\u00e7\"\u0094)\bU@^Z!\u0082B\u00b7\u00ba\u0084\u00d1\u00f3\u0081\u00d2^\u0000\u00ecg+\u001a\u0003\u0010N7\u00fe\u00f9T\u00ba\u008ez \u00b9\u00dd\u0017\nrZ\u00a7#\u00a2Y\u009d\u009ak(\u00ea\u0011`C\u001dv\u00ba\u00ba%\u00d2hg\u00dd\u0017\u0098\u00f6\u0092\u00beb\u00a2\u0082\u00c9Q\u0095\u000f\u00f4\u0089\u00bf\u0096;".length();
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
                    var4_3 = "\u00d6\u00e7*0\u0089\u00b6]9-\u00c0\u00d5W\u0013e\u00ee'";
                    var5_4 = "\u00d6\u00e7*0\u0089\u00b6]9-\u00c0\u00d5W\u0013e\u00ee'".length();
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
        im.a = var6_1;
        im.b = new Integer[73];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x64D9;
        if (b[n2] == null) {
            im.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
