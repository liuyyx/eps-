/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.resources.Identifier;

public class _V
implements AutoCloseable {
    public static final _V I;
    public static final Identifier K;
    public static final Identifier q;
    public static final Identifier m;
    public static final Identifier F;
    public static final Identifier a;
    private final Map<Identifier, RenderPipeline> Z = new HashMap<Identifier, RenderPipeline>();
    private static final int P;
    public static final Identifier b;
    public static final Identifier D;
    private long L;
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    public _V() {
        hi.a("\u00f2", (Object)this, (long)hi.a("G", (long)1328720830485890884L), (long)532065066128937192L);
    }

    public static /* bridge */ /* synthetic */ CallSite o(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public void Y(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (long)hi.a("G", (long)1328720830485890884L), (long)532065066128937192L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[13];
                        var11_1 = 0;
                        var10_2 = "\u0086\u00b8\u00b4J\u00ec\u00f5Rm!MS\u0088\u00bd\u00f0\u00fb\u00ac\u00e0W\f\u0095X\u00d6V\u00a0~\u00d9\u001a\u0012Q\u0004\u008f\u000f\u0088\u00dau\u0006\u00d4\u007fUW\u00c7\u0006IX\u00f4k\u008e\u0016\u00cf\u00bc\u009b\u00c4+\u00fa\u00e8\u00c0\u000e[9\u000bd_R\u00c5\u0007\u000f\u00b4\u00c5\u0099\u00ff\u000b`\u00a9hhw\u00a0!\u00fcD}\u00be\u000e\u00ca\u0084=\u00cd\u00dd\tqx\u00e0\u0005F8\u0094W\u000eo\u00ff\u0089\u00a2K\u00fa\u00af\u00d4\u008cq\u00a1O\u009eT\u0012\u00e0L~\u00da\u00979\u007f\u00b8\u00fcTg\u00ea\u00afc+B(\u00ff\u000f\u00ba>\u00e0\u00c1\u00f9\u0084\u00ff\bz\u0092\t\u001c\u00f1\u00d4v\u000f\u008e\u00aa\u00c79@\u00a16\u00ea\u00e8\u0010\u00aa?J\u0088r\u0011\"Kv\u0005z4\u00f3\u0002\u00b8Kq\u00c9\u00f5N\u0093\u0004t";
                        var12_3 = "\u0086\u00b8\u00b4J\u00ec\u00f5Rm!MS\u0088\u00bd\u00f0\u00fb\u00ac\u00e0W\f\u0095X\u00d6V\u00a0~\u00d9\u001a\u0012Q\u0004\u008f\u000f\u0088\u00dau\u0006\u00d4\u007fUW\u00c7\u0006IX\u00f4k\u008e\u0016\u00cf\u00bc\u009b\u00c4+\u00fa\u00e8\u00c0\u000e[9\u000bd_R\u00c5\u0007\u000f\u00b4\u00c5\u0099\u00ff\u000b`\u00a9hhw\u00a0!\u00fcD}\u00be\u000e\u00ca\u0084=\u00cd\u00dd\tqx\u00e0\u0005F8\u0094W\u000eo\u00ff\u0089\u00a2K\u00fa\u00af\u00d4\u008cq\u00a1O\u009eT\u0012\u00e0L~\u00da\u00979\u007f\u00b8\u00fcTg\u00ea\u00afc+B(\u00ff\u000f\u00ba>\u00e0\u00c1\u00f9\u0084\u00ff\bz\u0092\t\u001c\u00f1\u00d4v\u000f\u008e\u00aa\u00c79@\u00a16\u00ea\u00e8\u0010\u00aa?J\u0088r\u0011\"Kv\u0005z4\u00f3\u0002\u00b8Kq\u00c9\u00f5N\u0093\u0004t".length();
                        var9_4 = 18;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 17;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00af\u00fa%\u008bT\u00c3x\u00ba$o\u000b\u00a9\u008b\u00c5\u00d0\u00d1\u0011\u00bc\u00e9D\u00c7=\u00ae\u000b\u00b1IF`\u00a6\u00a6\u000fW\u008e\u00d2\u008c";
                            var12_3 = "\u00af\u00fa%\u008bT\u00c3x\u00ba$o\u000b\u00a9\u008b\u00c5\u00d0\u00d1\u0011\u00bc\u00e9D\u00c7=\u00ae\u000b\u00b1IF`\u00a6\u00a6\u000fW\u008e\u00d2\u008c".length();
                            var9_4 = 23;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 106;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 38;
                                    break;
                                }
                                case 1: {
                                    v15 = 30;
                                    break;
                                }
                                case 2: {
                                    v15 = 61;
                                    break;
                                }
                                case 3: {
                                    v15 = 17;
                                    break;
                                }
                                case 4: {
                                    v15 = 98;
                                    break;
                                }
                                case 5: {
                                    v15 = 23;
                                    break;
                                }
                                default: {
                                    v15 = 22;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                _V.c = var13;
                _V.d = new String[13];
                var0_7 = 1581516459198409034L;
                var6_8 = new long[127];
                var3_9 = 0;
                var4_10 = "\u0081\u009f)\u00a2\u001a\u009f\u0088\u00e6\u00b3{\u0012l\u00b3\u0002\u00f3\u0081\u0010?\u00a6!\u008aE2k\u00b8!\u0086|\u00ce\u008aj\u008c\u00f8\u00f2\u00b8\u00f5\u00f95a\u00c0\u0013c\u0017kn\u00a1\u00c5j\u009c\u00fb\u00e7\u00a4\u009b\u00c7\u0082 \u00a6{v\u00d9\u0011\u0090\u0017\u00ea\u00e5\u00f7\u00dc7\u000f\u0093\u0084\u00c3\u0018\u00bagT%Ol\u008c\u00ee\u0099~\u0086~{\u00c3d\u0097d\u0014\u00ae\u00e7\u008bPnJ\u00af\u0085T\u0098\u0094Y\u00a0i\u00d5\u00bf\u00e55\u00bf,x\u00d6\u0098\u008b2\u00eb\u0013\u0082\u00ca\u009e\u0089\u00f5\u0082dg C~\u00d5\u00ae\u00ca\u00e7\u00a34\u009c\fH\u00b1\u00a4\u00f2;\u00c6\u0006B\u00e5\u0084\u00ac\u00afk%\u000b<LK,\u008a\u00b0\u00d7\u00c9\u008dZ\u00ea\u008e\u00d5*\u0003\u0011\u00fe\u00d3\u00aa\u008d\u0097C'\u00ef\u00a9A\u00865\u00a6\u000f\u0096>\u00aa0\u0007~\u00f8T8\u00e8\u00c7\u00e6\u00afKRm\u00c1\u00d7\u00d5\u0007\u00f1\u00f3\u00fc\u00abtN\u00c7\u00fb\u00f1\u00cc\u001e\u0091\u0085a\u00b1\u00da\u00a2\u009ey{k10R\u00bc\u0014Z(h\u008b\u00c9-n{%\u008d\u00df\u007f\u00a8v\u001c\u00c3OP\u0095\u00b1\u00aa\u00d1k\u0012|;\u0091;\u00ad\u001e\u00d6`\u009e\u00dc\u0094\u008f$NdG\u00bb\b\u00ed\r+\u00bd\t\u00b0Q\u00aa\u00e9\u00b1_\u00ae\u0088=*\u00d0\u00c4\u00e6Q\u00af\u00e9\u00eeW{hY\u00b1\u00cdyT\r\u0013\u00c4L\u00b7\u00fe\u00f7Y\u00cf\t~\u00f6\u0081\u00de'\u00a0\u00ae\u0005\u00e5G\u009e@\u00bb\u00f8\u00f1P\u00e7\fE\u00f8u0\u00e04\u00f9\u00a3\u00ff\u009e\u00cf+\u00f0e{\u008f\u0013\u00b8\u009dJ\u00af\u0005\u00c2\u00939\u0004N\u00f8s)1\u00c8\u00e1r+\"\u00fc\u00bb\u0083\u00cd6\u00f12O\u00cb\u00a8\u00b9O\u00b5u\u0098O\fR\u00c5\u00a3\u00fd\u009eI\u00c4Z\u00c3\u00b0\u00e9l\u00bd\u008b=dX\u00f0Z\u00bf!j\u00c9`\u00b3:\u0088G=\u00e6DuU\u0092\u00b6G\u00cc\u00cc\u0096'\u00a4\u00aa\u0081S\u00e5\u0015\tnA\u0005\u00f6\u00cb\u00c0\u00c8\u009dc\u00dd\u00ee/\u00ea\u00eb=\u00dch6|7\u00b6\u00b2\u00c4\u00fb\u00d8\u0095A\u00c0\u00ff{]\u00a3\u001b`|w\u00e9l:\u00fa\u0005M\u00f40\u00a9\u00b9M\u0006\u00ff\u00d9[A\u00a3\u00f2\u00cb\u009d\u00e2pED\u0015\u00fe\u00b5\u00ab\u001a]\u00d5^k-2o\u008aN\u00ef\u00b5\u00b4::\u001d\u00e7\u00b3\u008cw\u0005jE\u00ba\u00d6\u00f53h\u0012~\u00f9\b\u00fd\u00ce\u00bb\u00dc\u00e5$\u0085q\u00f6F\u00a6\\\u000fo\u00df\u00fb\u00d5\u00eb}\u0086\u00a0\u00e8\u00dajI\n\u00a4\u00d3\u00c5\u00fe\u00d2yx\u00e7\u00f5\u0090\u00e6%\u0007'7\u00d7<O\u00d0\u00a9\u00d3\u008de\u0098\u0018\u00de\u009dv\u0012\u00a3\u00a0\u009a\u000fT\u000eiE8h\u009c~y8~Tv\u00cc{\u00e5j\u008a\u00a2\u00e2G\u00b3\u00d1M\u00d5\u00ac\u0017\u00dd\u00cfM\u001b3\u00cf\u00d5\u0005\u00d7\u000f\u0097B\u000eI\u00db\u00df\u00f1\u00faq\u0013\u00a6E\u0094k-\u008a\u00ab\u00fa\"\u009c\u00ca\u000b\u00db\u00ac\u008a\u00ed&d\u00ffl\u00e0\u0094\u008cO\u00c5\u00b2i\u00ba\u00f0\u00ee\\8S\u0096COV\u0015Y\u00fbV\u0094\u0083\u00e2\u00f5\u008e\u00bd\u00f1\u00c4\u0015v\u00a9a\u00e6\u00ef\u00ea\u0097\u00b3\u00c2=\u00e1\nn\u00a1\u00e9a\u00e1g3Meq>^\u00f7\r\u00f9\u0012\u00d2?X\u00b0\u00a3B\u00acZ\u008c\u00ca \u00ac\u00e2\u00e3!\u00a9\u0018\u00a8\u00c1\u00ddOD\u00a5\u0091\u00cf\u00f3 \u0091v_h\u0088\u00e0\u00a4\u00de\u00d6\u008aC\u0083\u00beT\u009a\u008bO\u00cbP\u00fcK-!\u00dcQE\u00bcz \u00b8\u00d38\u00c8\u00de\u00a4A*'\u0004\u009d3j_\u008cJY\u008f\u0098J\u00e7\u00da'!B\u00c09\u0091e\u00c7\u00f0\u009b \u00e0g\u00d6H_?\u0092\u00aa\u00a5\u00a0\bx\u0096\u00028-\u00dc\u009d\u00ef]\u00f2=\u008aa\u0019G\u00d9\u00ee\u00d5\u00e8\u00d1\u009b\u00c3P\b\u00c3\u00d5\u00e5\u00a0\u00b7\u00af`\u0085\u00e9n\u00d66\u00b7L85A\u00f9\u00b3\u00fa\u00d5\u00cd\u00d6\u0010q[\u00e7\u000bW\u00ac\u00e31\u0081\u00ed\u0082T1K\u008a\u00db1a\u00ac\u00fd(\u00a1\u00d0\u008b\u00f1\u00edU\u00be\u0084J\u00eb\u009d9g\u00ef\u00cc\u00d8V\u00c9w\u00d03\u008a{_1\u001c\u00f5\u0095\u00f8jft{VYB\u00ed\u009e\u00c6~0\"\u00af\u00bc\u0015]\u00d2\u00fef\u00a6\u00ab\u00938\u00d94\u009d\u0018\u0083&\u00a8\u000b/\u00f6Qr\u0096\u0012$\u00e17\u0084\u008f\u00be\u00ed\u0018\u0018a\u0006By\u0086\u00ab\u00f0\u00a9\u0018\u00fd\u00b0[\u00fb\r\u00ee\u00e2u\u007f:\u00a4\u00db@\u0014c#\b\u00d9\u00d8@\u00a2HP\u00a1J\\\u00a3\u0018]\u00a5\u00fan\u00a0n\u00baE\u009aQ";
                var5_11 = "\u0081\u009f)\u00a2\u001a\u009f\u0088\u00e6\u00b3{\u0012l\u00b3\u0002\u00f3\u0081\u0010?\u00a6!\u008aE2k\u00b8!\u0086|\u00ce\u008aj\u008c\u00f8\u00f2\u00b8\u00f5\u00f95a\u00c0\u0013c\u0017kn\u00a1\u00c5j\u009c\u00fb\u00e7\u00a4\u009b\u00c7\u0082 \u00a6{v\u00d9\u0011\u0090\u0017\u00ea\u00e5\u00f7\u00dc7\u000f\u0093\u0084\u00c3\u0018\u00bagT%Ol\u008c\u00ee\u0099~\u0086~{\u00c3d\u0097d\u0014\u00ae\u00e7\u008bPnJ\u00af\u0085T\u0098\u0094Y\u00a0i\u00d5\u00bf\u00e55\u00bf,x\u00d6\u0098\u008b2\u00eb\u0013\u0082\u00ca\u009e\u0089\u00f5\u0082dg C~\u00d5\u00ae\u00ca\u00e7\u00a34\u009c\fH\u00b1\u00a4\u00f2;\u00c6\u0006B\u00e5\u0084\u00ac\u00afk%\u000b<LK,\u008a\u00b0\u00d7\u00c9\u008dZ\u00ea\u008e\u00d5*\u0003\u0011\u00fe\u00d3\u00aa\u008d\u0097C'\u00ef\u00a9A\u00865\u00a6\u000f\u0096>\u00aa0\u0007~\u00f8T8\u00e8\u00c7\u00e6\u00afKRm\u00c1\u00d7\u00d5\u0007\u00f1\u00f3\u00fc\u00abtN\u00c7\u00fb\u00f1\u00cc\u001e\u0091\u0085a\u00b1\u00da\u00a2\u009ey{k10R\u00bc\u0014Z(h\u008b\u00c9-n{%\u008d\u00df\u007f\u00a8v\u001c\u00c3OP\u0095\u00b1\u00aa\u00d1k\u0012|;\u0091;\u00ad\u001e\u00d6`\u009e\u00dc\u0094\u008f$NdG\u00bb\b\u00ed\r+\u00bd\t\u00b0Q\u00aa\u00e9\u00b1_\u00ae\u0088=*\u00d0\u00c4\u00e6Q\u00af\u00e9\u00eeW{hY\u00b1\u00cdyT\r\u0013\u00c4L\u00b7\u00fe\u00f7Y\u00cf\t~\u00f6\u0081\u00de'\u00a0\u00ae\u0005\u00e5G\u009e@\u00bb\u00f8\u00f1P\u00e7\fE\u00f8u0\u00e04\u00f9\u00a3\u00ff\u009e\u00cf+\u00f0e{\u008f\u0013\u00b8\u009dJ\u00af\u0005\u00c2\u00939\u0004N\u00f8s)1\u00c8\u00e1r+\"\u00fc\u00bb\u0083\u00cd6\u00f12O\u00cb\u00a8\u00b9O\u00b5u\u0098O\fR\u00c5\u00a3\u00fd\u009eI\u00c4Z\u00c3\u00b0\u00e9l\u00bd\u008b=dX\u00f0Z\u00bf!j\u00c9`\u00b3:\u0088G=\u00e6DuU\u0092\u00b6G\u00cc\u00cc\u0096'\u00a4\u00aa\u0081S\u00e5\u0015\tnA\u0005\u00f6\u00cb\u00c0\u00c8\u009dc\u00dd\u00ee/\u00ea\u00eb=\u00dch6|7\u00b6\u00b2\u00c4\u00fb\u00d8\u0095A\u00c0\u00ff{]\u00a3\u001b`|w\u00e9l:\u00fa\u0005M\u00f40\u00a9\u00b9M\u0006\u00ff\u00d9[A\u00a3\u00f2\u00cb\u009d\u00e2pED\u0015\u00fe\u00b5\u00ab\u001a]\u00d5^k-2o\u008aN\u00ef\u00b5\u00b4::\u001d\u00e7\u00b3\u008cw\u0005jE\u00ba\u00d6\u00f53h\u0012~\u00f9\b\u00fd\u00ce\u00bb\u00dc\u00e5$\u0085q\u00f6F\u00a6\\\u000fo\u00df\u00fb\u00d5\u00eb}\u0086\u00a0\u00e8\u00dajI\n\u00a4\u00d3\u00c5\u00fe\u00d2yx\u00e7\u00f5\u0090\u00e6%\u0007'7\u00d7<O\u00d0\u00a9\u00d3\u008de\u0098\u0018\u00de\u009dv\u0012\u00a3\u00a0\u009a\u000fT\u000eiE8h\u009c~y8~Tv\u00cc{\u00e5j\u008a\u00a2\u00e2G\u00b3\u00d1M\u00d5\u00ac\u0017\u00dd\u00cfM\u001b3\u00cf\u00d5\u0005\u00d7\u000f\u0097B\u000eI\u00db\u00df\u00f1\u00faq\u0013\u00a6E\u0094k-\u008a\u00ab\u00fa\"\u009c\u00ca\u000b\u00db\u00ac\u008a\u00ed&d\u00ffl\u00e0\u0094\u008cO\u00c5\u00b2i\u00ba\u00f0\u00ee\\8S\u0096COV\u0015Y\u00fbV\u0094\u0083\u00e2\u00f5\u008e\u00bd\u00f1\u00c4\u0015v\u00a9a\u00e6\u00ef\u00ea\u0097\u00b3\u00c2=\u00e1\nn\u00a1\u00e9a\u00e1g3Meq>^\u00f7\r\u00f9\u0012\u00d2?X\u00b0\u00a3B\u00acZ\u008c\u00ca \u00ac\u00e2\u00e3!\u00a9\u0018\u00a8\u00c1\u00ddOD\u00a5\u0091\u00cf\u00f3 \u0091v_h\u0088\u00e0\u00a4\u00de\u00d6\u008aC\u0083\u00beT\u009a\u008bO\u00cbP\u00fcK-!\u00dcQE\u00bcz \u00b8\u00d38\u00c8\u00de\u00a4A*'\u0004\u009d3j_\u008cJY\u008f\u0098J\u00e7\u00da'!B\u00c09\u0091e\u00c7\u00f0\u009b \u00e0g\u00d6H_?\u0092\u00aa\u00a5\u00a0\bx\u0096\u00028-\u00dc\u009d\u00ef]\u00f2=\u008aa\u0019G\u00d9\u00ee\u00d5\u00e8\u00d1\u009b\u00c3P\b\u00c3\u00d5\u00e5\u00a0\u00b7\u00af`\u0085\u00e9n\u00d66\u00b7L85A\u00f9\u00b3\u00fa\u00d5\u00cd\u00d6\u0010q[\u00e7\u000bW\u00ac\u00e31\u0081\u00ed\u0082T1K\u008a\u00db1a\u00ac\u00fd(\u00a1\u00d0\u008b\u00f1\u00edU\u00be\u0084J\u00eb\u009d9g\u00ef\u00cc\u00d8V\u00c9w\u00d03\u008a{_1\u001c\u00f5\u0095\u00f8jft{VYB\u00ed\u009e\u00c6~0\"\u00af\u00bc\u0015]\u00d2\u00fef\u00a6\u00ab\u00938\u00d94\u009d\u0018\u0083&\u00a8\u000b/\u00f6Qr\u0096\u0012$\u00e17\u0084\u008f\u00be\u00ed\u0018\u0018a\u0006By\u0086\u00ab\u00f0\u00a9\u0018\u00fd\u00b0[\u00fb\r\u00ee\u00e2u\u007f:\u00a4\u00db@\u0014c#\b\u00d9\u00d8@\u00a2HP\u00a1J\\\u00a3\u0018]\u00a5\u00fan\u00a0n\u00baE\u009aQ".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00d7\u00eb\b\u0012\u0001\u0017\u008c\u00ddO\u0082\u0085K\u00ab\u00f5v\u00bc";
                    var5_11 = "\u00d7\u00eb\b\u0012\u0001\u0017\u008c\u00ddO\u0082\u0085K\u00ab\u00f5v\u00bc".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        _V.e = var6_8;
        _V.f = new Integer[127];
        _V.I = new _V();
        _V.a = hi.a("G", _V.a(-11010, 24318), (long)1218614314410685839L);
        _V.q = hi.a("G", _V.a(-11020, -7911), (long)1218614314410685839L);
        _V.m = hi.a("G", _V.a(-11016, -13098), (long)1218614314410685839L);
        _V.D = hi.a("G", _V.a(-11015, -16034), (long)1218614314410685839L);
        _V.K = hi.a("G", _V.a(-11012, -20184), (long)1218614314410685839L);
        _V.F = hi.a("G", _V.a(-11014, -23354), (long)1218614314410685839L);
        _V.b = hi.a("G", _V.a(-11011, 30489), (long)1218614314410685839L);
        _V.P = (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)new Std140SizeCalculator(), (long)730172894715575436L), (long)730172894715575436L), (long)764590848553612036L);
    }

    @Override
    public void close() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)371903579909859042L), (long)1321656001466046640L);
    }

    /*
     * Exception decompiling
     */
    public void S(Object[] var1_1) {
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

    private static RenderPipeline lambda$getOrCreatePipeline$0(Identifier identifier) {
        return hi.a("\u00a5", (Object)_V.o("1eOmSBl3hFfgRInl", withCull(boolean ), (RenderPipeline.Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)_V.o("1eOmSBl3hFfgRInl", builder(com.mojang.blaze3d.pipeline.RenderPipeline$Snippet[] ), (RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{hi.a("j", (long)1310054174759614142L)}), (Object)hi.a("G", (Object)hi.a("\u00a5", (Object)identifier, (long)727446834783527340L), (Object)(_V.a(-11021, -6510) + (String)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)identifier, (long)894075310972081045L), (char)_V.a(4067, 4836470088950533945L), (char)_V.a(28108, 2955114214349712640L), (long)526648328867971712L))), (long)914805107078568139L), (long)438264672872939574L), (Object)hi.a("G", _V.a(-11024, 26358), (long)490867849634283930L), (long)1132382657535976613L), (Object)identifier, (long)700916747502292664L), (Object)hi.a("j", (long)605312927836191834L), (long)717252947959573292L), (boolean)false), (long)974970866675039906L);
    }

    public void P(Object[] objectArray) {
        Identifier identifier = (Identifier)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = (long)hi.a("\u00e9", (Object)this, (long)532065066128937192L);
        objectArray2[2] = d2;
        objectArray2[1] = d;
        objectArray2[0] = identifier;
        hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)949149950487187691L);
    }

    private static String lambda$render$0() {
        return _V.a(-11009, 13979);
    }

    private RenderPipeline D(Object[] objectArray) {
        Object object = objectArray[0];
        return (RenderPipeline)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)371903579909859042L), (Object)((Identifier)object), _V::lambda$getOrCreatePipeline$0, (long)817175477130987234L);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFD4F8) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 91;
                case 1 -> 94;
                case 2 -> 68;
                case 3 -> 254;
                case 4 -> 133;
                case 5 -> 115;
                case 6 -> 195;
                case 7 -> 128;
                case 8 -> 242;
                case 9 -> 192;
                case 10 -> 247;
                case 11 -> 240;
                case 12 -> 186;
                case 13 -> 191;
                case 14 -> 124;
                case 15 -> 101;
                case 16 -> 228;
                case 17 -> 57;
                case 18 -> 73;
                case 19 -> 81;
                case 20 -> 219;
                case 21 -> 239;
                case 22 -> 86;
                case 23 -> 30;
                case 24 -> 125;
                case 25 -> 193;
                case 26 -> 63;
                case 27 -> 185;
                case 28 -> 225;
                case 29 -> 98;
                case 30 -> 132;
                case 31 -> 97;
                case 32 -> 213;
                case 33 -> 130;
                case 34 -> 31;
                case 35 -> 139;
                case 36 -> 71;
                case 37 -> 241;
                case 38 -> 223;
                case 39 -> 122;
                case 40 -> 207;
                case 41 -> 40;
                case 42 -> 66;
                case 43 -> 211;
                case 44 -> 72;
                case 45 -> 176;
                case 46 -> 221;
                case 47 -> 49;
                case 48 -> 148;
                case 49 -> 168;
                case 50 -> 70;
                case 51 -> 95;
                case 52 -> 111;
                case 53 -> 113;
                case 54 -> 234;
                case 55 -> 141;
                case 56 -> 1;
                case 57 -> 157;
                case 58 -> 131;
                case 59 -> 38;
                case 60 -> 10;
                case 61 -> 110;
                case 62 -> 245;
                case 63 -> 179;
                case 64 -> 15;
                case 65 -> 42;
                case 66 -> 114;
                case 67 -> 34;
                case 68 -> 6;
                case 69 -> 90;
                case 70 -> 58;
                case 71 -> 3;
                case 72 -> 109;
                case 73 -> 249;
                case 74 -> 88;
                case 75 -> 160;
                case 76 -> 153;
                case 77 -> 24;
                case 78 -> 96;
                case 79 -> 145;
                case 80 -> 235;
                case 81 -> 37;
                case 82 -> 233;
                case 83 -> 62;
                case 84 -> 25;
                case 85 -> 253;
                case 86 -> 144;
                case 87 -> 238;
                case 88 -> 201;
                case 89 -> 9;
                case 90 -> 174;
                case 91 -> 89;
                case 92 -> 44;
                case 93 -> 53;
                case 94 -> 215;
                case 95 -> 237;
                case 96 -> 77;
                case 97 -> 99;
                case 98 -> 28;
                case 99 -> 152;
                case 100 -> 118;
                case 101 -> 50;
                case 102 -> 165;
                case 103 -> 147;
                case 104 -> 190;
                case 105 -> 187;
                case 106 -> 45;
                case 107 -> 171;
                case 108 -> 20;
                case 109 -> 41;
                case 110 -> 18;
                case 111 -> 198;
                case 112 -> 142;
                case 113 -> 52;
                case 114 -> 140;
                case 115 -> 103;
                case 116 -> 14;
                case 117 -> 163;
                case 118 -> 108;
                case 119 -> 92;
                case 120 -> 206;
                case 121 -> 26;
                case 122 -> 4;
                case 123 -> 35;
                case 124 -> 248;
                case 125 -> 54;
                case 126 -> 210;
                case 127 -> 126;
                case 128 -> 121;
                case 129 -> 127;
                case 130 -> 204;
                case 131 -> 216;
                case 132 -> 85;
                case 133 -> 64;
                case 134 -> 29;
                case 135 -> 16;
                case 136 -> 217;
                case 137 -> 246;
                case 138 -> 177;
                case 139 -> 227;
                case 140 -> 196;
                case 141 -> 8;
                case 142 -> 135;
                case 143 -> 23;
                case 144 -> 2;
                case 145 -> 100;
                case 146 -> 164;
                case 147 -> 146;
                case 148 -> 75;
                case 149 -> 27;
                case 150 -> 182;
                case 151 -> 119;
                case 152 -> 69;
                case 153 -> 208;
                case 154 -> 200;
                case 155 -> 189;
                case 156 -> 84;
                case 157 -> 209;
                case 158 -> 230;
                case 159 -> 117;
                case 160 -> 252;
                case 161 -> 166;
                case 162 -> 143;
                case 163 -> 33;
                case 164 -> 178;
                case 165 -> 172;
                case 166 -> 48;
                case 167 -> 251;
                case 168 -> 188;
                case 169 -> 74;
                case 170 -> 104;
                case 171 -> 56;
                case 172 -> 47;
                case 173 -> 46;
                case 174 -> 232;
                case 175 -> 161;
                case 176 -> 169;
                case 177 -> 250;
                case 178 -> 83;
                case 179 -> 102;
                case 180 -> 151;
                case 181 -> 7;
                case 182 -> 218;
                case 183 -> 61;
                case 184 -> 32;
                case 185 -> 87;
                case 186 -> 105;
                case 187 -> 138;
                case 188 -> 183;
                case 189 -> 11;
                case 190 -> 36;
                case 191 -> 244;
                case 192 -> 21;
                case 193 -> 156;
                case 194 -> 51;
                case 195 -> 136;
                case 196 -> 129;
                case 197 -> 175;
                case 198 -> 197;
                case 199 -> 170;
                case 200 -> 112;
                case 201 -> 19;
                case 202 -> 5;
                case 203 -> 80;
                case 204 -> 134;
                case 205 -> 149;
                case 206 -> 39;
                case 207 -> 214;
                case 208 -> 107;
                case 209 -> 76;
                case 210 -> 60;
                case 211 -> 162;
                case 212 -> 199;
                case 213 -> 106;
                case 214 -> 78;
                case 215 -> 0;
                case 216 -> 13;
                case 217 -> 202;
                case 218 -> 173;
                case 219 -> 226;
                case 220 -> 167;
                case 221 -> 123;
                case 222 -> 93;
                case 223 -> 120;
                case 224 -> 243;
                case 225 -> 181;
                case 226 -> 224;
                case 227 -> 255;
                case 228 -> 205;
                case 229 -> 184;
                case 230 -> 154;
                case 231 -> 222;
                case 232 -> 220;
                case 233 -> 12;
                case 234 -> 236;
                case 235 -> 43;
                case 236 -> 155;
                case 237 -> 17;
                case 238 -> 158;
                case 239 -> 159;
                case 240 -> 116;
                case 241 -> 203;
                case 242 -> 55;
                case 243 -> 229;
                case 244 -> 59;
                case 245 -> 82;
                case 246 -> 231;
                case 247 -> 79;
                case 248 -> 194;
                case 249 -> 150;
                case 250 -> 180;
                case 251 -> 67;
                case 252 -> 212;
                case 253 -> 137;
                case 254 -> 22;
                default -> 65;
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
            _V.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4098;
        if (f[n2] == null) {
            _V.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }
}
