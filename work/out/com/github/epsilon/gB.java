/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import net.minecraft.resources.Identifier;

public class gB {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static /* bridge */ /* synthetic */ CallSite Y(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public static ByteBuffer T(Object[] var0) {
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

    public static Identifier G(String string) {
        return gB.Y("laZBprhge6apBfj4", fromNamespaceAndPath(java.lang.String java.lang.String ), (String)gB.a(2171, 4755), (String)string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "X\u00d3\u001f]Y\u00f2\u00a1\u0013M\u000b\u00e0p\u00f6\u00f92Ks\u001d\u00ae)\u00fa\u008d\u00daA\u00b8\u00de\u00fd\u001a\u0002/\u00b0;b\u009a\u0086lM\u00bf\u00d4\u00f8\u00c8\u0099k\f\u008c\u00172`\u00fb\u00bd.\u00b1\u00a5\u0090";
                    var12_3 = "X\u00d3\u001f]Y\u00f2\u00a1\u0013M\u000b\u00e0p\u00f6\u00f92Ks\u001d\u00ae)\u00fa\u008d\u00daA\u00b8\u00de\u00fd\u001a\u0002/\u00b0;b\u009a\u0086lM\u00bf\u00d4\u00f8\u00c8\u0099k\f\u008c\u00172`\u00fb\u00bd.\u00b1\u00a5\u0090".length();
                    var9_4 = 7;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 85;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 26;
                                    break;
                                }
                                case 1: {
                                    v11 = 7;
                                    break;
                                }
                                case 2: {
                                    v11 = 18;
                                    break;
                                }
                                case 3: {
                                    v11 = 47;
                                    break;
                                }
                                case 4: {
                                    v11 = 118;
                                    break;
                                }
                                case 5: {
                                    v11 = 104;
                                    break;
                                }
                                default: {
                                    v11 = 52;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                gB.a = var13;
                gB.b = new String[3];
                var0_7 = 4342812620987520624L;
                var6_8 = new long[87];
                var3_9 = 0;
                var4_10 = "_\u00c9\u00a3a%\u00ed\u009b\u008f\u0002\u008c\u0084\u00fa\u00e7N\u00a8x~_\u00b6\u0017\t\u00cb \u00e7\u00b0\u00b0\u0080\u00f1\u001d\u00d0y\u0088\u00fc\u00f6\u001dk\u009e+\u0095\u0097\u00e36\u00fb\u00c8J/\u00b7\u00ack\u00e9\u00c7<p\u00da8\u00d0\u0012a\u009bGlW\u0099)w\u00ec\u00ae\u0093\u0096\u00c0\u0007+\u00e0~[\u00fbmW\u001c\u00bf\u0005\u0014\u00de\u0013w\u0090b\u00f8X^\u00f0i\u00b3\u00d7=c&\u0094od>+P\u00072o\u00fc\u0014\u00e7\u00a0\u00eaZV\u0003\u00a7\u0094\u00fe\u00ff\u00b3~X\u00a5N\u0013\u00dc?(\u007fi\u0086\u00de~K\u00cb\u0002e\u0098[Zg\u0016\u00f8\u0007\u00c2\u00d6\u00b6\u00a8\u00a5\t\u00f9|\u00e9G\u00bcF\"\u00ca\u008e\u0002[1\u0093\u00da\u0082Z\u0006\u00e6Cxo\u000b\u00b3@\u00a6\u00b5\u00da\u00de}\u00a7%`lE\u00a31\\\u008eN\u00b5\u0093M\u0092hl\u00d5\u00e2\u00cd\u00de\u0090IX\u00b9b\u00deA\u0093\u00d66\u0004\u00cd\u008d@\u00d2\u0092\u00ee\u00f8\u00ea\u00a0?|g\u00de\u0098\u00cb#\u00e4\u008dz\u009c:\u0003\u00c2\u00a1\u00aeB\u00d0\u00f2\u0001J\u00fb\u00ee\u00d9\n\u007f\u00b9R\u00a9\u00f3t\u00cd\\\u00d6bkL\u00e8\u001aw2\u0086\u0004\u00d6{J|HF\u008c\u00b0\u00c3\u00aa\u00fcS\u0007\u00fd\u00f56|\u0006-v^\u00a5\u00b2\u00eb9WH\u00d6\u00be\u00db\u001f\u00ac&e\u00bb\u0090\t9\u0012\u001d&\u00e0\u00c5'\u00db\u00e2#\u000b\t=\u009dfr\u00ce\u0087C\u001a\u00fd\u00c8\u00cf\u00ba\u00c1P\u00b7\u0003U^\u00c5\\a\u00ae\u009f\u00fc\u0004$\u00f5\u00f9\r\u00a7\u00fb\u0015\u00a6\u00c0\u00c4\u0010\u00b4\u00f8\u00ca\u0012\u00b7L\u00fa|\u00bb\u00ac\u00f4{{\u00bf5]PMu\u00fcO)\u0087\u0011\u00ce\u00d4kX\u0091\u00a5\u00ec\u00fa\u0093_>\u00aa\u0095\u008f\u00e9\u00d1\u00b5b\u00a2X<\u00fb5\u001a(\u00a8\u00ab\u0089\u00ff#\u0017\u0087&\u00a1Q\u00f5p?\b\u00ab\u00c1\u0090x\u00d1F\r\u0080or\u00dd\u00a9nF\u009e\u0012\u0015I\u00ad\u00eb&\u00b5\u000ei\u00ce\u00f7l\u0085Tn\u00f4\u00e9\u008b\u00a9\u00ef\u00bf\u001a\u00fd\u0017\u00d2q\u00d6(\u008b\u00ff\u0088B\u000e;\u00d1\u00e7\u00f7!\u00b5f,\u0019\u0010\u00e5\u00dd\u00e6\u0013\u00e3\u00b3\u00d0\u0086\n\u0005cx\u00fc\u00bb\u00f8u\t\u00cd\u00ce!\u00d79\u0098\u00fc\u001aw\u00f8&\u00b5\u00aa\u00d1\u00af\u001b\u00cfRK:\u001aS9\u0016W \u0011>\u001fJ\u0001\u00f4'\u008b\u00dfk*\u00a7\u00a6\u00d1\n\u00d1a14?\u00efBGne\u00dd\u00b0\u00c0\u00cc z5\u00dc\u008e\u00afB.\u00daF\u00f8f\u0093T\u00b2\u00f6\u00a4\u0018\u008e\u00deX\u0004\u00ec$Lk]\u009e\u00bf4\u0007J\u00b0\u00f6\f\u0085o\u0006\u00c0\u00cbuXn\u00f1Y\u0001H\u00b4\u00aa!\u00b3A&S\u00dc`\u0001\u0097@;P\u00af\u00d7\u00f6\u008eK?I\u00bd\u00e7)\u00a47\fx\u00816\u0013d\u00a0\u00c50\r\u0098\u00b4\u00fe4\u00c9SW\u00d2\u00e9K\u00a7)=\u0098-\u00cf3G\u00bc\u0012\u00cb&>\u00e2\u00e6\u00bd\u0083W\u00f86\n8R\u00d6L\u00ee}5n\u0095\u00e2\u00e2\u00e1\u00d2\u00ab\u00f2\u001a\u0018b\f*\u00f3\u000b0\u00d4\u00ef?q";
                var5_11 = "_\u00c9\u00a3a%\u00ed\u009b\u008f\u0002\u008c\u0084\u00fa\u00e7N\u00a8x~_\u00b6\u0017\t\u00cb \u00e7\u00b0\u00b0\u0080\u00f1\u001d\u00d0y\u0088\u00fc\u00f6\u001dk\u009e+\u0095\u0097\u00e36\u00fb\u00c8J/\u00b7\u00ack\u00e9\u00c7<p\u00da8\u00d0\u0012a\u009bGlW\u0099)w\u00ec\u00ae\u0093\u0096\u00c0\u0007+\u00e0~[\u00fbmW\u001c\u00bf\u0005\u0014\u00de\u0013w\u0090b\u00f8X^\u00f0i\u00b3\u00d7=c&\u0094od>+P\u00072o\u00fc\u0014\u00e7\u00a0\u00eaZV\u0003\u00a7\u0094\u00fe\u00ff\u00b3~X\u00a5N\u0013\u00dc?(\u007fi\u0086\u00de~K\u00cb\u0002e\u0098[Zg\u0016\u00f8\u0007\u00c2\u00d6\u00b6\u00a8\u00a5\t\u00f9|\u00e9G\u00bcF\"\u00ca\u008e\u0002[1\u0093\u00da\u0082Z\u0006\u00e6Cxo\u000b\u00b3@\u00a6\u00b5\u00da\u00de}\u00a7%`lE\u00a31\\\u008eN\u00b5\u0093M\u0092hl\u00d5\u00e2\u00cd\u00de\u0090IX\u00b9b\u00deA\u0093\u00d66\u0004\u00cd\u008d@\u00d2\u0092\u00ee\u00f8\u00ea\u00a0?|g\u00de\u0098\u00cb#\u00e4\u008dz\u009c:\u0003\u00c2\u00a1\u00aeB\u00d0\u00f2\u0001J\u00fb\u00ee\u00d9\n\u007f\u00b9R\u00a9\u00f3t\u00cd\\\u00d6bkL\u00e8\u001aw2\u0086\u0004\u00d6{J|HF\u008c\u00b0\u00c3\u00aa\u00fcS\u0007\u00fd\u00f56|\u0006-v^\u00a5\u00b2\u00eb9WH\u00d6\u00be\u00db\u001f\u00ac&e\u00bb\u0090\t9\u0012\u001d&\u00e0\u00c5'\u00db\u00e2#\u000b\t=\u009dfr\u00ce\u0087C\u001a\u00fd\u00c8\u00cf\u00ba\u00c1P\u00b7\u0003U^\u00c5\\a\u00ae\u009f\u00fc\u0004$\u00f5\u00f9\r\u00a7\u00fb\u0015\u00a6\u00c0\u00c4\u0010\u00b4\u00f8\u00ca\u0012\u00b7L\u00fa|\u00bb\u00ac\u00f4{{\u00bf5]PMu\u00fcO)\u0087\u0011\u00ce\u00d4kX\u0091\u00a5\u00ec\u00fa\u0093_>\u00aa\u0095\u008f\u00e9\u00d1\u00b5b\u00a2X<\u00fb5\u001a(\u00a8\u00ab\u0089\u00ff#\u0017\u0087&\u00a1Q\u00f5p?\b\u00ab\u00c1\u0090x\u00d1F\r\u0080or\u00dd\u00a9nF\u009e\u0012\u0015I\u00ad\u00eb&\u00b5\u000ei\u00ce\u00f7l\u0085Tn\u00f4\u00e9\u008b\u00a9\u00ef\u00bf\u001a\u00fd\u0017\u00d2q\u00d6(\u008b\u00ff\u0088B\u000e;\u00d1\u00e7\u00f7!\u00b5f,\u0019\u0010\u00e5\u00dd\u00e6\u0013\u00e3\u00b3\u00d0\u0086\n\u0005cx\u00fc\u00bb\u00f8u\t\u00cd\u00ce!\u00d79\u0098\u00fc\u001aw\u00f8&\u00b5\u00aa\u00d1\u00af\u001b\u00cfRK:\u001aS9\u0016W \u0011>\u001fJ\u0001\u00f4'\u008b\u00dfk*\u00a7\u00a6\u00d1\n\u00d1a14?\u00efBGne\u00dd\u00b0\u00c0\u00cc z5\u00dc\u008e\u00afB.\u00daF\u00f8f\u0093T\u00b2\u00f6\u00a4\u0018\u008e\u00deX\u0004\u00ec$Lk]\u009e\u00bf4\u0007J\u00b0\u00f6\f\u0085o\u0006\u00c0\u00cbuXn\u00f1Y\u0001H\u00b4\u00aa!\u00b3A&S\u00dc`\u0001\u0097@;P\u00af\u00d7\u00f6\u008eK?I\u00bd\u00e7)\u00a47\fx\u00816\u0013d\u00a0\u00c50\r\u0098\u00b4\u00fe4\u00c9SW\u00d2\u00e9K\u00a7)=\u0098-\u00cf3G\u00bc\u0012\u00cb&>\u00e2\u00e6\u00bd\u0083W\u00f86\n8R\u00d6L\u00ee}5n\u0095\u00e2\u00e2\u00e1\u00d2\u00ab\u00f2\u001a\u0018b\f*\u00f3\u000b0\u00d4\u00ef?q".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0013IS(\u00a6/p\u00a5\u0098\u00c4\u00ae{\u00b1i\u00e1l";
                    var5_11 = "\u0013IS(\u00a6/p\u00a5\u0098\u00c4\u00ae{\u00b1i\u00e1l".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        gB.c = var6_8;
        gB.d = new Integer[87];
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x87B) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 177;
                case 1 -> 106;
                case 2 -> 226;
                case 3 -> 166;
                case 4 -> 118;
                case 5 -> 63;
                case 6 -> 158;
                case 7 -> 221;
                case 8 -> 39;
                case 9 -> 131;
                case 10 -> 225;
                case 11 -> 180;
                case 12 -> 232;
                case 13 -> 252;
                case 14 -> 130;
                case 15 -> 69;
                case 16 -> 46;
                case 17 -> 244;
                case 18 -> 104;
                case 19 -> 228;
                case 20 -> 115;
                case 21 -> 216;
                case 22 -> 20;
                case 23 -> 33;
                case 24 -> 132;
                case 25 -> 113;
                case 26 -> 45;
                case 27 -> 119;
                case 28 -> 238;
                case 29 -> 125;
                case 30 -> 204;
                case 31 -> 78;
                case 32 -> 40;
                case 33 -> 77;
                case 34 -> 136;
                case 35 -> 6;
                case 36 -> 219;
                case 37 -> 49;
                case 38 -> 74;
                case 39 -> 227;
                case 40 -> 229;
                case 41 -> 234;
                case 42 -> 29;
                case 43 -> 91;
                case 44 -> 44;
                case 45 -> 92;
                case 46 -> 155;
                case 47 -> 251;
                case 48 -> 97;
                case 49 -> 103;
                case 50 -> 123;
                case 51 -> 80;
                case 52 -> 243;
                case 53 -> 102;
                case 54 -> 253;
                case 55 -> 186;
                case 56 -> 38;
                case 57 -> 114;
                case 58 -> 30;
                case 59 -> 241;
                case 60 -> 96;
                case 61 -> 67;
                case 62 -> 81;
                case 63 -> 212;
                case 64 -> 79;
                case 65 -> 0;
                case 66 -> 190;
                case 67 -> 121;
                case 68 -> 181;
                case 69 -> 205;
                case 70 -> 47;
                case 71 -> 59;
                case 72 -> 17;
                case 73 -> 4;
                case 74 -> 52;
                case 75 -> 137;
                case 76 -> 62;
                case 77 -> 90;
                case 78 -> 165;
                case 79 -> 178;
                case 80 -> 23;
                case 81 -> 14;
                case 82 -> 99;
                case 83 -> 112;
                case 84 -> 248;
                case 85 -> 250;
                case 86 -> 196;
                case 87 -> 254;
                case 88 -> 200;
                case 89 -> 189;
                case 90 -> 237;
                case 91 -> 176;
                case 92 -> 231;
                case 93 -> 203;
                case 94 -> 116;
                case 95 -> 173;
                case 96 -> 230;
                case 97 -> 160;
                case 98 -> 11;
                case 99 -> 147;
                case 100 -> 135;
                case 101 -> 191;
                case 102 -> 50;
                case 103 -> 124;
                case 104 -> 195;
                case 105 -> 134;
                case 106 -> 223;
                case 107 -> 35;
                case 108 -> 83;
                case 109 -> 65;
                case 110 -> 233;
                case 111 -> 57;
                case 112 -> 242;
                case 113 -> 19;
                case 114 -> 161;
                case 115 -> 68;
                case 116 -> 26;
                case 117 -> 206;
                case 118 -> 110;
                case 119 -> 245;
                case 120 -> 184;
                case 121 -> 246;
                case 122 -> 151;
                case 123 -> 145;
                case 124 -> 140;
                case 125 -> 58;
                case 126 -> 120;
                case 127 -> 101;
                case 128 -> 201;
                case 129 -> 3;
                case 130 -> 171;
                case 131 -> 95;
                case 132 -> 172;
                case 133 -> 93;
                case 134 -> 144;
                case 135 -> 1;
                case 136 -> 60;
                case 137 -> 157;
                case 138 -> 138;
                case 139 -> 100;
                case 140 -> 55;
                case 141 -> 51;
                case 142 -> 75;
                case 143 -> 170;
                case 144 -> 36;
                case 145 -> 98;
                case 146 -> 37;
                case 147 -> 7;
                case 148 -> 207;
                case 149 -> 150;
                case 150 -> 179;
                case 151 -> 139;
                case 152 -> 159;
                case 153 -> 117;
                case 154 -> 143;
                case 155 -> 152;
                case 156 -> 198;
                case 157 -> 162;
                case 158 -> 129;
                case 159 -> 193;
                case 160 -> 111;
                case 161 -> 236;
                case 162 -> 194;
                case 163 -> 224;
                case 164 -> 183;
                case 165 -> 13;
                case 166 -> 217;
                case 167 -> 61;
                case 168 -> 86;
                case 169 -> 182;
                case 170 -> 8;
                case 171 -> 188;
                case 172 -> 25;
                case 173 -> 32;
                case 174 -> 210;
                case 175 -> 128;
                case 176 -> 197;
                case 177 -> 122;
                case 178 -> 24;
                case 179 -> 28;
                case 180 -> 141;
                case 181 -> 12;
                case 182 -> 127;
                case 183 -> 168;
                case 184 -> 211;
                case 185 -> 218;
                case 186 -> 43;
                case 187 -> 41;
                case 188 -> 10;
                case 189 -> 16;
                case 190 -> 239;
                case 191 -> 175;
                case 192 -> 202;
                case 193 -> 2;
                case 194 -> 21;
                case 195 -> 54;
                case 196 -> 66;
                case 197 -> 214;
                case 198 -> 42;
                case 199 -> 48;
                case 200 -> 71;
                case 201 -> 249;
                case 202 -> 213;
                case 203 -> 108;
                case 204 -> 235;
                case 205 -> 174;
                case 206 -> 87;
                case 207 -> 82;
                case 208 -> 169;
                case 209 -> 109;
                case 210 -> 185;
                case 211 -> 27;
                case 212 -> 167;
                case 213 -> 5;
                case 214 -> 255;
                case 215 -> 89;
                case 216 -> 73;
                case 217 -> 240;
                case 218 -> 133;
                case 219 -> 107;
                case 220 -> 247;
                case 221 -> 208;
                case 222 -> 70;
                case 223 -> 31;
                case 224 -> 85;
                case 225 -> 164;
                case 226 -> 126;
                case 227 -> 154;
                case 228 -> 76;
                case 229 -> 56;
                case 230 -> 146;
                case 231 -> 192;
                case 232 -> 84;
                case 233 -> 148;
                case 234 -> 199;
                case 235 -> 222;
                case 236 -> 9;
                case 237 -> 156;
                case 238 -> 153;
                case 239 -> 22;
                case 240 -> 187;
                case 241 -> 88;
                case 242 -> 18;
                case 243 -> 220;
                case 244 -> 15;
                case 245 -> 209;
                case 246 -> 105;
                case 247 -> 142;
                case 248 -> 34;
                case 249 -> 72;
                case 250 -> 94;
                case 251 -> 163;
                case 252 -> 215;
                case 253 -> 149;
                case 254 -> 53;
                default -> 64;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            gB.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D4B;
        if (d[n2] == null) {
            gB.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
