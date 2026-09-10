/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XG;
import com.github.epsilon.hi;
import com.github.epsilon.z0;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class zn
extends z0<XG, Integer> {
    private static final String a;
    private static final long[] c;
    private static final Integer[] h;

    public zn(XG xG) {
        super(xG, zn.c(25415, 7964324788608427390L), zn::lambda$new$0);
    }

    protected String n(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        return hi.a("G", (int)zn.Q("afLwoAywI89XABJK", intValue(), (Integer)n), (long)1058131513164804440L);
    }

    @Override
    protected float o(Object[] objectArray) {
        return (float)(hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)this, (long)506958556113200645L))), (long)1260538186742955956L) - hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[0], (long)1019106921109057527L)) / (float)(hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)716549416793987840L) - hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[0], (long)1019106921109057527L));
    }

    @Override
    protected void D(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        reference var3_3 = hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)716549416793987840L) - hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[0], (long)1019106921109057527L);
        CallSite callSite = zn.Q("afLwoAywI89XABJK", S(), (XG)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))));
        reference var5_5 = hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[0], (long)1019106921109057527L) + hi.a("G", (float)(f * (float)var3_3 / (float)callSite), (long)400355798406630015L) * callSite;
        hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("G", (int)hi.a("G", (int)var5_5, (int)hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[0], (long)1019106921109057527L), (int)hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)716549416793987840L), (long)1051766797435725461L), (long)777027428917046763L)}, (long)597522462984691898L);
    }

    public static /* bridge */ /* synthetic */ CallSite Q(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    @Override
    protected void O() {
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

    protected Integer F(Object[] objectArray) {
        return zn.Q("afLwoAywI89XABJK", valueOf(int ), (int)hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)716549416793987840L));
    }

    @Override
    protected String c(Object[] objectArray) {
        return hi.a("G", (int)hi.a("\u00a5", (Object)((Integer)((Object)zn.Q("afLwoAywI89XABJK", P(), (zn)this))), (long)1260538186742955956L), (long)1058131513164804440L);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void D() {
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

    protected void S(Integer n) {
        hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[]{n}, (long)376891036046078279L);
    }

    private static boolean lambda$new$0(String string) {
        return (boolean)hi.a("\u00a5", string, (Object)a, (long)982124516597137659L);
    }

    protected Integer E(Object[] objectArray) {
        return zn.Q("afLwoAywI89XABJK", valueOf(int ), (int)hi.a("\u00a5", (Object)((XG)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (Object)new Object[0], (long)1019106921109057527L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "Xd+#ZH".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 89;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 90;
                                break;
                            }
                            case 1: {
                                v9 = 13;
                                break;
                            }
                            case 2: {
                                v9 = 95;
                                break;
                            }
                            case 3: {
                                v9 = 67;
                                break;
                            }
                            case 4: {
                                v9 = 46;
                                break;
                            }
                            case 5: {
                                v9 = 76;
                                break;
                            }
                            default: {
                                v9 = 80;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                zn.a = new String(v10).intern();
                var0_1 = 6261141783947467301L;
                var6_2 = new long[105];
                var3_3 = 0;
                var4_4 = "\u00e3c\u00ff\u00a0\u0006\u00c1\u00cd(\u008c2\u000eU:0\u00f2\u008c\u00ec\\x\"\u00b6\u0089\u00ecw\u00f4@\u00f4NV\u00f0\u00bfa\u0016D`\u00ab\u00e9\u00edY\u00dd\u009d\u0084\u00ce\u00cbL\t2j\u00f4w+D\u00d2\u00d9b\u0097\u00fe:\u00f9\u009c\u00b4 *\u00cd\u009c\u0090\u0095\u0082\\\\\u00bfW\u00caA\u00bb\u00bd\u0086s\u00b7A\n\u00ee'%\u00a3\u000f-\u001d\u00a7HPe\u00a4\u00f7\u00fb\u00a1\u00d6+\u00ce@&\u00bc\u0019DY\u00c6\u00b8\u00a6V|\u00f2{\u001e8$\u000bG\u00d2L{\u00ed\u00d1\u009a\f\u00ad\\\u0095\u00e4\u00be\u00e5b\u00b1e\r\u00ea\u00b9\u0093\u00ec\n\u0094\u00cc\u0080\u008e,\u00f8\u008eo\u0082\u0002\u00eaU\u00d1%UI\u00fd\u00d5\u00fa\u009f\u0080\u00fc\u00eb\u00e5\u00fa\r1$)mml\u001d\u009a\u0011\u0012\u00ed!\u00b61\u008e\u0088\u007f\u00b6\u0087\u00bd\u001b\u00a3<\u000e\u001b5\u00c2u\u0002|[\u00bb\u001c\u00aa\u00aaG*\u00ff\u0099\\\u0007$\u00be\u009e\u00efi\u00fbj\u00e9i+\u0007\u008e\u00e6\u00e1\u00d0$\u00e9\u00a5\u00822\u0089\u00f7\u001a'\u00de\u00c3\u00e5\u00b7\u00a2\u008c\u008d\u0088\u00e2\u001e\u00b2\u00a1L\u001a\u00de\u00fd\t\u0015\u00b0\u00c1nH\u001ba\u001c\u00be9\u001f\u00be7\r\"w\u009e*\u0007X\u0010\u0088\b\u00c5l\u00e9\u00c6\u00d92\u00e8\u00a5\u00c35\u00d4\u00f3\u00b3!\u00bc\u00e8~1\u0096lU\u00d8w\u0004x\u00b9\u00a7.j \u0085\u00a2\u00a0t\u0017\u00a505`S\u00a3\u00f4+\u0012MF\u00c7\u0096%=\u00f5\u00f4I\u0088\u0007\tgb\u00aeO\u0004\u0019a\u00b4\u00ee\u00a4\u00b5\u00b2\u0093\u0084\u0087\u00aa\u00c8\u00d4\u0015\u0013\u00f8\u00c4\u0080\u00ddK\u00ff\u008c\u009c\u00b9CJ\u00c5\u000e'\u00c0\u00a6^\u00ec\u00ddD%\u00c7\u00ebg\u00c0\u00cf \u00fc{\u0092u\r\u001c\b\u00a6*X_\u0081\u008e\u00d2:O\u00d7\u00bb\u00ab`$!chu\u0019\u00aa#_Y \u00a7\u00c0\u00e9\u0014\u000e\u000f\u00d3w\u0005r\u0083\u00a1\u00b3<A\u00a6\u0015\u00ba?u\u00c7\u00b6\u009d\u0006\u001e=\u0011\u0019\u009a\u00ce\u0088\u00e8\u00e5\u00cau\n(\u00d0\u00ba\u0099\u001a\b\u0007B\u001e1/xi\u00e7\u0013B\u00c4\u0092\u00a5 \u000b>\u0004\u0001\u008f\u00fc\u00a3:\u0006\u0001\u00c1K\u009di&\u00ec\u00c5\u00c3\u00ed0\u009b\u00a5X{\u00ac\u00f4F\u00f1\u00d1!j\n\u008b\u00fe)\u00f6tK\u0016s<>\u00ba9x\u0086\u008at<\u00fb~!N\u0086\u00d9\u00ff\u00b0\u00a0\u0011E\u008c\u0016fC\u00e6f\u0081\u001b\u00cc\u00de\u00cb]\u0014\u009bh\u00c0\u00c3\u00a9t\u00dcA\u00be\u00a0C\u00bc\u00a8Q&\u0014[\u00ccMAc0\u00fa\u00dd[fnE\u0013<\u0007\u001b\u00a4\u00d5\u00ebb\u00e3\u00af\u00ff\u00ac\r0\u00e1!\u00d9\u00ad\u00a0U\u0002\u0005\u00bb\u00e3\u008b\u00c4\u00d9\u00fd/\u0002\"\u001e\u00de>\u001b\u00f8\u008b\u009dP/lrzv\u00fd;n\u00a5\u0019\u0000\u00a4\u0096h\u00e2h\u00c3\u0003\u0019{A\u00d7\u00d4\u0097d\u00a3J\u00ec\u00de4\u00c1\u00f3|\u00b2\u001a\u00b3\u00da\u0091\u00d5D\u00f0\u00cb*\u00a4RG\u00f3\u008c1\u00993\u00ba@\u009a\u00a7A\u00b5s\u00ab\u00a0\u0084x\u00deq\u0012t\u0001\u00eaX\u00b5\u00c3\u00ca\u001e\u00e9c\u00f3r\u00aa\u00d3\u0085\u00e9\u00c1\u00a3<y\u00f4\u00df\u009a\u008a\u001dZ\u00a5Z~\"\u0083\u00a3D\u00d62\u008d\u00df\u008f\u00b5\u00d3\u00c9\u0098\u00a5n\u0000\r\u0004a\u00a1\u0088\u00fd\u00a8\u0000\\$\u00b6CsW\u0080\u00ae\u0088\u00d6\u00ba\u008ds\u00b2*x\u0093\u00d87\u0081\u00d4i\u0083\u000b\u00d0\u00e5{\u00fe\u009cE\u008d \u00a0\u00c4deA_\u00d1\u00bd.@\u008cP\u009f\u009a\u00e6\u009e\u00d9+lX.\\<\u008b\u000e\u0083Q0\u0082\u00dd^DGL\u000b \u0081\u00c7\u000f\u00f9\u00e9\u00c0`\u00bc\u0091\u00c5\u00fc\u009czKL\u00ac\u0001\u00d8Is6\u00a6T\u008dz\u00dbQ\u00b3\u0001\u008a\u009e\u00bb\u00dck\"\u00c6%}";
                var5_5 = "\u00e3c\u00ff\u00a0\u0006\u00c1\u00cd(\u008c2\u000eU:0\u00f2\u008c\u00ec\\x\"\u00b6\u0089\u00ecw\u00f4@\u00f4NV\u00f0\u00bfa\u0016D`\u00ab\u00e9\u00edY\u00dd\u009d\u0084\u00ce\u00cbL\t2j\u00f4w+D\u00d2\u00d9b\u0097\u00fe:\u00f9\u009c\u00b4 *\u00cd\u009c\u0090\u0095\u0082\\\\\u00bfW\u00caA\u00bb\u00bd\u0086s\u00b7A\n\u00ee'%\u00a3\u000f-\u001d\u00a7HPe\u00a4\u00f7\u00fb\u00a1\u00d6+\u00ce@&\u00bc\u0019DY\u00c6\u00b8\u00a6V|\u00f2{\u001e8$\u000bG\u00d2L{\u00ed\u00d1\u009a\f\u00ad\\\u0095\u00e4\u00be\u00e5b\u00b1e\r\u00ea\u00b9\u0093\u00ec\n\u0094\u00cc\u0080\u008e,\u00f8\u008eo\u0082\u0002\u00eaU\u00d1%UI\u00fd\u00d5\u00fa\u009f\u0080\u00fc\u00eb\u00e5\u00fa\r1$)mml\u001d\u009a\u0011\u0012\u00ed!\u00b61\u008e\u0088\u007f\u00b6\u0087\u00bd\u001b\u00a3<\u000e\u001b5\u00c2u\u0002|[\u00bb\u001c\u00aa\u00aaG*\u00ff\u0099\\\u0007$\u00be\u009e\u00efi\u00fbj\u00e9i+\u0007\u008e\u00e6\u00e1\u00d0$\u00e9\u00a5\u00822\u0089\u00f7\u001a'\u00de\u00c3\u00e5\u00b7\u00a2\u008c\u008d\u0088\u00e2\u001e\u00b2\u00a1L\u001a\u00de\u00fd\t\u0015\u00b0\u00c1nH\u001ba\u001c\u00be9\u001f\u00be7\r\"w\u009e*\u0007X\u0010\u0088\b\u00c5l\u00e9\u00c6\u00d92\u00e8\u00a5\u00c35\u00d4\u00f3\u00b3!\u00bc\u00e8~1\u0096lU\u00d8w\u0004x\u00b9\u00a7.j \u0085\u00a2\u00a0t\u0017\u00a505`S\u00a3\u00f4+\u0012MF\u00c7\u0096%=\u00f5\u00f4I\u0088\u0007\tgb\u00aeO\u0004\u0019a\u00b4\u00ee\u00a4\u00b5\u00b2\u0093\u0084\u0087\u00aa\u00c8\u00d4\u0015\u0013\u00f8\u00c4\u0080\u00ddK\u00ff\u008c\u009c\u00b9CJ\u00c5\u000e'\u00c0\u00a6^\u00ec\u00ddD%\u00c7\u00ebg\u00c0\u00cf \u00fc{\u0092u\r\u001c\b\u00a6*X_\u0081\u008e\u00d2:O\u00d7\u00bb\u00ab`$!chu\u0019\u00aa#_Y \u00a7\u00c0\u00e9\u0014\u000e\u000f\u00d3w\u0005r\u0083\u00a1\u00b3<A\u00a6\u0015\u00ba?u\u00c7\u00b6\u009d\u0006\u001e=\u0011\u0019\u009a\u00ce\u0088\u00e8\u00e5\u00cau\n(\u00d0\u00ba\u0099\u001a\b\u0007B\u001e1/xi\u00e7\u0013B\u00c4\u0092\u00a5 \u000b>\u0004\u0001\u008f\u00fc\u00a3:\u0006\u0001\u00c1K\u009di&\u00ec\u00c5\u00c3\u00ed0\u009b\u00a5X{\u00ac\u00f4F\u00f1\u00d1!j\n\u008b\u00fe)\u00f6tK\u0016s<>\u00ba9x\u0086\u008at<\u00fb~!N\u0086\u00d9\u00ff\u00b0\u00a0\u0011E\u008c\u0016fC\u00e6f\u0081\u001b\u00cc\u00de\u00cb]\u0014\u009bh\u00c0\u00c3\u00a9t\u00dcA\u00be\u00a0C\u00bc\u00a8Q&\u0014[\u00ccMAc0\u00fa\u00dd[fnE\u0013<\u0007\u001b\u00a4\u00d5\u00ebb\u00e3\u00af\u00ff\u00ac\r0\u00e1!\u00d9\u00ad\u00a0U\u0002\u0005\u00bb\u00e3\u008b\u00c4\u00d9\u00fd/\u0002\"\u001e\u00de>\u001b\u00f8\u008b\u009dP/lrzv\u00fd;n\u00a5\u0019\u0000\u00a4\u0096h\u00e2h\u00c3\u0003\u0019{A\u00d7\u00d4\u0097d\u00a3J\u00ec\u00de4\u00c1\u00f3|\u00b2\u001a\u00b3\u00da\u0091\u00d5D\u00f0\u00cb*\u00a4RG\u00f3\u008c1\u00993\u00ba@\u009a\u00a7A\u00b5s\u00ab\u00a0\u0084x\u00deq\u0012t\u0001\u00eaX\u00b5\u00c3\u00ca\u001e\u00e9c\u00f3r\u00aa\u00d3\u0085\u00e9\u00c1\u00a3<y\u00f4\u00df\u009a\u008a\u001dZ\u00a5Z~\"\u0083\u00a3D\u00d62\u008d\u00df\u008f\u00b5\u00d3\u00c9\u0098\u00a5n\u0000\r\u0004a\u00a1\u0088\u00fd\u00a8\u0000\\$\u00b6CsW\u0080\u00ae\u0088\u00d6\u00ba\u008ds\u00b2*x\u0093\u00d87\u0081\u00d4i\u0083\u000b\u00d0\u00e5{\u00fe\u009cE\u008d \u00a0\u00c4deA_\u00d1\u00bd.@\u008cP\u009f\u009a\u00e6\u009e\u00d9+lX.\\<\u008b\u000e\u0083Q0\u0082\u00dd^DGL\u000b \u0081\u00c7\u000f\u00f9\u00e9\u00c0`\u00bc\u0091\u00c5\u00fc\u009czKL\u00ac\u0001\u00d8Is6\u00a6T\u008dz\u00dbQ\u00b3\u0001\u008a\u009e\u00bb\u00dck\"\u00c6%}".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u0098<f\u00ae<e!\u0002\u00b3U\u00ab \u0086\u00b41\u00a9";
                    var5_5 = "\u0098<f\u00ae<e!\u0002\u00b3U\u00ab \u0086\u00b41\u00a9".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        zn.c = var6_2;
        zn.h = new Integer[105];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x631;
        if (h[n2] == null) {
            zn.h[n2] = (int)(c[n2] ^ l);
        }
        return h[n2];
    }
}
