/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.DepthStencilState
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.CompareOp
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.LivingEntity
 *  org.joml.Matrix4f
 *  org.joml.Vector2f
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.lZ;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.LivingEntity;
import org.joml.Matrix4f;
import org.joml.Vector2f;

public class _C {
    private static final RenderPipeline U;
    private static final RenderPipeline Y;
    private static final RenderPipeline H;
    private static final RenderPipeline K;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var10 = new String[4];
                            var14_1 = 0;
                            var13_2 = "\u0002\u001e+\u001cU\u001b<\u0017X/\u000bP\u0013<\u0015\u001b>&J\u0006 \u001b\u0007\u0015\u0002\u001e+\u001cU\u001b<\u0017X8\u0010K\u0011>\u0017(7\u0010W\u0017!";
                            var15_3 = "\u0002\u001e+\u001cU\u001b<\u0017X/\u000bP\u0013<\u0015\u001b>&J\u0006 \u001b\u0007\u0015\u0002\u001e+\u001cU\u001b<\u0017X8\u0010K\u0011>\u0017(7\u0010W\u0017!".length();
                            var12_4 = 23;
                            var11_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 72;
                                v1 = ++var11_5;
                                v2 = var13_2.substring(v1, v1 + var12_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var10[var14_1++] = v4.intern();
                                if ((var11_5 += var12_4) < var15_3) {
                                    var12_4 = var13_2.charAt(var11_5);
                                    ** continue;
                                }
                                var13_2 = "FZoX\u0011_xS\u001c|T\u000fUzSlsT\u0013Se\u0017FZoX\u0011_xS\u001ckO\u0014WxQ_zb\u000eBd_C";
                                var15_3 = "FZoX\u0011_xS\u001c|T\u000fUzSlsT\u0013Se\u0017FZoX\u0011_xS\u001ckO\u0014WxQ_zb\u000eBd_C".length();
                                var12_4 = 21;
                                var11_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 12;
                                    v5 = ++var11_5;
                                    v2 = var13_2.substring(v5, v5 + var12_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var10[var14_1++] = v4.intern();
                                if ((var11_5 += var12_4) < var15_3) {
                                    var12_4 = var13_2.charAt(var11_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 58;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 63;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 19;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 49;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 113;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 58;
                                        break;
                                    }
                                    default: {
                                        v15 = 26;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    var2_7 = 3495181255456842137L;
                    var8_8 = new long[78];
                    var5_9 = 0;
                    var6_10 = "o\u00d9\b\u0094\u00f8_j\u00c4=a\u0006O\u0001X\f@\u00c4x\n\u0003\u0001W\u0097\u0082\u007f\u00d6#$\u00c4\u0015\u0088M`\u00d9\u00b6\u00bd\u00eca\u00abv;\u009f\"\u0010\u00fc\u00f3\u001e5-\u00100\u0082rp\u0099\u001c\u00ba8\u001c\u00ab\u00a9^\u00c5\u000f6\u0012[u[\u000b\u00bd\u00a6\u00ed\u00b1ps2\u00e2\u00cc\u0082w\u00e8&\u00e8\u00c3\u00983{\u008b\u008b5\u007f\u0000\u008a\u001c55\u0007\u0094z*\u0086\u009bT\u00cf\u00e6\u00e6\u0090\u001d5\u0019\\\u0097\u0011\u00dbA\u00d8tJ\u00e3\u00ff\u00de}v\u00cc\u00e9\u00ef\u0018\u00ea\u00a6afK\u008f\u00f5\\\u00ae\u001f\u00b5\u00e0\u00c1Zn\u0005\u00bd\u00a1\u001c\u00a1\u0084d'\u00e2;^\u00e9\u009f\u0005\u00a11\u008bn\u00a1\u00d1\u00c2>\u00f1\u0096\u00bdP\u0085R\u00b3w\u0087\u0099\u0012\u000f\u00c9\u00c3\tjl\u00e1\u0085\u0004\u008f\u00b0m\u00f4>\u00bd/\u00a9\u00da\u00f7P\u0096\u00c2\u00f7\u00d1\u00adq\u00dd\u0012UUC\u00b8~\u001f\u00a6*\u001d\u0002\u009b#\u0088d\u0012\u009f\u008a\u00c1\u00a7z\u00b5H\u00d4\u00c7\u00b7\u00c7\u00ee):\u0005\u00e4=4\u00c05\u008d!H\u0099%j\u00f9Yj\u0017N\u0098<\u00cf\u00d0\u0004-J\u00fe\u00a5\u00c4n\u00b7\u00c1\u0015'\u00bd|F\u00f2\u00dd\u008bFC\u00b6\u0002+\u00e3\u008f\u00c2\u008dP\u00a1\u0087P\u0094F`\u00b7\u0090C\u00df'\u00edC0|l\u0016\u00d8\u00dc6a_\u00ae\u00f5\\\u009f\u00bb\u00f0\u0016\b\u00b3[\u00fe\u00b8fC\u00ac\u0015\u00fb\u00c33\u00a1\r\u00d7\u00c7\u00c16\u0002w\u00e9\u008f\u00f4\u0090.\u001c\u00d8\u00bd\u009a\u00dd\\\u00a8\u0090l-\u00cf\u00bbnT<\u0010}\u00a1\u0010\u00aau\u00ba\u00c0\u00ff\u00dc;\u00f01\u00e2gZ\u00e9\u00db\u0005\u009c\u001a$\u0095\u0003\u00ef\u00f0bQ\u0000\u0000l\u00db[\u00c9\u001b\u0000\u000e)&f\u0011\u009b\u00dd\u00b3\u000b\bq\u00d0\u00c6\u00dch\u00c2\u00b9\u00cb\u00e7\u00cd\u00b7|\u00bc2\u0098G\u00b5\u00d8\u00c95f%\u00cc+\u00e3\u00ef\u0000\u001f\u00dd\u00d0\u00f6\u00aa\u00cf\u0099|\u0012YQ\u000e\u00cf\r\u00b4\u00fb\u0086P\u00e9\u00faa\u00a5\u0000\u001c\u0002j\u00c21\u008b)h\u00cfF\u001e>L`3\u001b\u009a\u00c0\r\u00f80\u00ef\u0013\u00e4&q\u00f5l6\u00c7\u00fb\u0087:\u0096\u00cf8\u0004l\u00ae\u009bsSt~T\u00e4\u00dcE\u00a8\u00a40z\u00f9\t\u008c|@\u009d\u00e5<\u0087\u001fuL_]\u00a6\u00c7E\u00e1\u00b8+\u0001\u0090W]\u0007a;\u00bdMbCCR\u0084y@\u00b0\u00c8\u00b6$I.\u00b4\u00a5\u00fa\u0005\u00e6\u00a3\u00d81\t\u00b7\u0001\u00aa\u008b\u00c9Ei}3 \u0017$-\u00c4\u00fa\u00d5\u00c0\u0006H\u00f7NK\u0018\u00aeL\u00e2\u00c8\b\u00e1\u00ba;\u00be\u0098[\u00de\u00dc\u00a6\u00f4V6\u0084\u00b2\u00c9\u00c0\u00bd\u00d2$\u0097\u00ce\u00c4\u001a\u008eV\u009b\u0080^WW\u0090";
                    var7_11 = "o\u00d9\b\u0094\u00f8_j\u00c4=a\u0006O\u0001X\f@\u00c4x\n\u0003\u0001W\u0097\u0082\u007f\u00d6#$\u00c4\u0015\u0088M`\u00d9\u00b6\u00bd\u00eca\u00abv;\u009f\"\u0010\u00fc\u00f3\u001e5-\u00100\u0082rp\u0099\u001c\u00ba8\u001c\u00ab\u00a9^\u00c5\u000f6\u0012[u[\u000b\u00bd\u00a6\u00ed\u00b1ps2\u00e2\u00cc\u0082w\u00e8&\u00e8\u00c3\u00983{\u008b\u008b5\u007f\u0000\u008a\u001c55\u0007\u0094z*\u0086\u009bT\u00cf\u00e6\u00e6\u0090\u001d5\u0019\\\u0097\u0011\u00dbA\u00d8tJ\u00e3\u00ff\u00de}v\u00cc\u00e9\u00ef\u0018\u00ea\u00a6afK\u008f\u00f5\\\u00ae\u001f\u00b5\u00e0\u00c1Zn\u0005\u00bd\u00a1\u001c\u00a1\u0084d'\u00e2;^\u00e9\u009f\u0005\u00a11\u008bn\u00a1\u00d1\u00c2>\u00f1\u0096\u00bdP\u0085R\u00b3w\u0087\u0099\u0012\u000f\u00c9\u00c3\tjl\u00e1\u0085\u0004\u008f\u00b0m\u00f4>\u00bd/\u00a9\u00da\u00f7P\u0096\u00c2\u00f7\u00d1\u00adq\u00dd\u0012UUC\u00b8~\u001f\u00a6*\u001d\u0002\u009b#\u0088d\u0012\u009f\u008a\u00c1\u00a7z\u00b5H\u00d4\u00c7\u00b7\u00c7\u00ee):\u0005\u00e4=4\u00c05\u008d!H\u0099%j\u00f9Yj\u0017N\u0098<\u00cf\u00d0\u0004-J\u00fe\u00a5\u00c4n\u00b7\u00c1\u0015'\u00bd|F\u00f2\u00dd\u008bFC\u00b6\u0002+\u00e3\u008f\u00c2\u008dP\u00a1\u0087P\u0094F`\u00b7\u0090C\u00df'\u00edC0|l\u0016\u00d8\u00dc6a_\u00ae\u00f5\\\u009f\u00bb\u00f0\u0016\b\u00b3[\u00fe\u00b8fC\u00ac\u0015\u00fb\u00c33\u00a1\r\u00d7\u00c7\u00c16\u0002w\u00e9\u008f\u00f4\u0090.\u001c\u00d8\u00bd\u009a\u00dd\\\u00a8\u0090l-\u00cf\u00bbnT<\u0010}\u00a1\u0010\u00aau\u00ba\u00c0\u00ff\u00dc;\u00f01\u00e2gZ\u00e9\u00db\u0005\u009c\u001a$\u0095\u0003\u00ef\u00f0bQ\u0000\u0000l\u00db[\u00c9\u001b\u0000\u000e)&f\u0011\u009b\u00dd\u00b3\u000b\bq\u00d0\u00c6\u00dch\u00c2\u00b9\u00cb\u00e7\u00cd\u00b7|\u00bc2\u0098G\u00b5\u00d8\u00c95f%\u00cc+\u00e3\u00ef\u0000\u001f\u00dd\u00d0\u00f6\u00aa\u00cf\u0099|\u0012YQ\u000e\u00cf\r\u00b4\u00fb\u0086P\u00e9\u00faa\u00a5\u0000\u001c\u0002j\u00c21\u008b)h\u00cfF\u001e>L`3\u001b\u009a\u00c0\r\u00f80\u00ef\u0013\u00e4&q\u00f5l6\u00c7\u00fb\u0087:\u0096\u00cf8\u0004l\u00ae\u009bsSt~T\u00e4\u00dcE\u00a8\u00a40z\u00f9\t\u008c|@\u009d\u00e5<\u0087\u001fuL_]\u00a6\u00c7E\u00e1\u00b8+\u0001\u0090W]\u0007a;\u00bdMbCCR\u0084y@\u00b0\u00c8\u00b6$I.\u00b4\u00a5\u00fa\u0005\u00e6\u00a3\u00d81\t\u00b7\u0001\u00aa\u008b\u00c9Ei}3 \u0017$-\u00c4\u00fa\u00d5\u00c0\u0006H\u00f7NK\u0018\u00aeL\u00e2\u00c8\b\u00e1\u00ba;\u00be\u0098[\u00de\u00dc\u00a6\u00f4V6\u0084\u00b2\u00c9\u00c0\u00bd\u00d2$\u0097\u00ce\u00c4\u001a\u008eV\u009b\u0080^WW\u0090".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v17 = var8_8;
                        v18 = var5_9++;
                        v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl110:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "\u0098\u00b2\u00a2\u00e9\u00e4k\u001dL\u00f4lX$\u00a4`\u0089\u00b4";
                        var7_11 = "\u0098\u00b2\u00a2\u00e9\u00e4k\u001dL\u00f4lX$\u00a4`\u0089\u00b4".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v17 = var8_8;
                            v18 = var5_9++;
                            v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl123:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var2_7;
                switch (v20) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl134:
                    // 1 sources

                    ** continue;
                }
            }
            _C.a = var8_8;
            _C.b = new Integer[78];
            break block31;
lbl139:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 2378978736134812573L;
        ** while (true)
        _C.c = 2378978736135123421L ^ var0_14;
        _C.Y = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)1167515402784077163L)}, (long)731833861383729593L), (Object)hi.a("G", var10[3], (long)1218614314410685839L), (long)438264672872939574L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (int)0, (Object)hi.a("j", (long)409278652241869602L), (long)926989055136329680L), (Object)hi.a("j", (long)989844084367066487L), (long)1075846269101555222L), (long)974970866675039906L);
        _C.K = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)_C.i("1seb6OJ6TyeoxFF9", withVertexBinding(int com.mojang.blaze3d.vertex.VertexFormat ), (RenderPipeline.Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)1167515402784077163L)}, (long)731833861383729593L), (Object)hi.a("G", var10[0], (long)1218614314410685839L), (long)438264672872939574L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)503151544299192490L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (int)0, (VertexFormat)hi.a("j", (long)409278652241869602L)), (Object)hi.a("j", (long)989844084367066487L), (long)1075846269101555222L), (long)974970866675039906L);
        _C.H = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)_C.i("1seb6OJ6TyeoxFF9", withLocation(net.minecraft.resources.Identifier ), (RenderPipeline.Builder)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)1038139946397753316L)}, (long)731833861383729593L), (Identifier)hi.a("G", var10[2], (long)1218614314410685839L)), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (long)974970866675039906L);
        _C.U = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)_C.i("1seb6OJ6TyeoxFF9", builder(com.mojang.blaze3d.pipeline.RenderPipeline$Snippet[] ), (RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{hi.a("j", (long)1038139946397753316L)}), (Object)hi.a("G", var10[1], (long)1218614314410685839L), (long)438264672872939574L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)503151544299192490L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (long)974970866675039906L);
    }

    private static Vector2f K(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return new Vector2f((float)(-hi.a("G", (double)f, (long)892033460936563353L)), (float)(-hi.a("G", (double)f, (long)920621527924433365L)));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void P(Object[] var0) {
        block40: {
            block42: {
                block39: {
                    block41: {
                        block45: {
                            block44: {
                                block43: {
                                    var4_1 = (PoseStack)var0[0];
                                    var5_2 = (LivingEntity)var0[1];
                                    var2_3 = ((Float)var0[2]).floatValue();
                                    var6_4 = (Color)var0[3];
                                    var3_5 = (Color)var0[4];
                                    var1_6 = ((Float)var0[5]).floatValue();
                                    var7_7 = Dl.S();
                                    var30_8 /* !! */  = _C.a(23813, 7601946747198890883L) * _C.a(26119, 2243049428198283500L) ^ _C.a(2590, 4861312920407225552L);
                                    if (!var7_7) ** GOTO lbl-1000
                                    v0 /* !! */  = var30_8 /* !! */ ;
                                    if (!var7_7) ** GOTO lbl16
                                    switch (v0 /* !! */ ) {
                                        default: lbl-1000:
                                        // 2 sources

                                        {
                                            v0 /* !! */  = (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (Object)var5_2, (long)840818949646731448L);
lbl16:
                                            // 2 sources

                                            var8_9 = v0 /* !! */ ;
                                            var9_10 = (float)(hi.a("G", (long)658960450018995719L) % _C.c) * 0.004f;
                                            var10_11 = 0.35f + 0.65f * ((hi.a("G", (double)(var9_10 * 1.8f), (long)651411597689335820L) + 1.0f) * 0.5f) * var1_6;
                                            var11_12 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
                                            var12_13 = hi.a("G", (double)((double)var11_12), (double)hi.a("\u00e9", (Object)var5_2, (long)1198013811462394707L), (double)hi.a("\u00a5", (Object)var5_2, (long)907047849049535430L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)948190297084541702L), (long)617137790396262668L), (long)888968013430088728L), (long)1300412705618690751L);
                                            var14_14 = hi.a("G", (double)((double)var11_12), (double)hi.a("\u00e9", (Object)var5_2, (long)881614067421035868L), (double)hi.a("\u00a5", (Object)var5_2, (long)1235747372608796815L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)948190297084541702L), (long)617137790396262668L), (long)888968013430088728L), (long)1294071886475894755L) + hi.a("G", (double)var9_10, (long)920621527924433365L) + 1.0;
                                            var16_15 = hi.a("G", (double)((double)var11_12), (double)hi.a("\u00e9", (Object)var5_2, (long)817754572554122991L), (double)hi.a("\u00a5", (Object)var5_2, (long)619188567151638994L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)948190297084541702L), (long)617137790396262668L), (long)888968013430088728L), (long)1282612456329596420L);
                                            _C.i("1seb6OJ6TyeoxFF9", pushPose(), (PoseStack)var4_1);
                                            hi.a("\u00a5", (Object)var4_1, (double)var12_13, (double)var14_14, (double)var16_15, (long)620263633503696695L);
                                            var18_16 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var4_1, (long)970332505425455960L), (long)795986877611440477L);
                                            v1 /* !! */  = var8_9;
                                            if (!var7_7) break block43;
                                            if (v1 /* !! */  == 0) break;
                                            break block44;
                                        }
                                        case -2071792612: {
                                            throw null;
                                        }
                                    }
                                    v1 /* !! */  = var30_8 /* !! */  = (int)(hi.a("G", (int)_C.a(13465, 7366061375766039137L), (int)_C.a(28740, 1293616759378464392L), (long)834203424483934088L) + _C.a(30045, 3174512403692178320L) - _C.a(25289, 1027708425636535340L));
                                }
                                if (var7_7) break block45;
                            }
                            var30_8 /* !! */  = _C.a(26743, 164043224586639010L) / _C.a(20238, 7119519326057001455L) * _C.a(13903, 237047283871090827L) + _C.a(22698, 7563067791817270851L);
                            break block45;
lbl39:
                            // 2 sources

                            while (true) {
                                block46: {
                                    var19_17 = v2;
                                    var20_18 = hi.a("G", (Object)new Object[]{var19_17}, (long)1263219612550322114L);
                                    var21_19 = 0.0f;
                                    if (!var7_7) break block46;
                                    var30_8 /* !! */  = (int)((_C.i("1seb6OJ6TyeoxFF9", max(int int ), (int)_C.a(738, 3752482374978288645L), (int)_C.a(30543, 48100402341857669L)) - _C.a(22823, 2830903750607562744L)) * _C.a(611, 9083214951762967692L) + _C.a(8813, 2742436188464880802L));
                                    if (var7_7) break block39;
                                    ** GOTO lbl53
                                }
lbl48:
                                // 2 sources

                                while (true) {
                                    block48: {
                                        block47: {
                                            cfr_temp_0 = (double)var21_19 - 6.283185307179586;
                                            v3 /* !! */  = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                            if (!var7_7) break block47;
                                            if (v3 /* !! */  <= 0) break block48;
lbl53:
                                            // 2 sources

                                            v3 /* !! */  = (double)(hi.a("G", (int)(_C.a(12981, 7262067339773348988L) * _C.a(25511, 5571912686933302570L)), (int)_C.a(17237, 7300994782800281004L), (long)834203424483934088L) * _C.a(15764, 2856515705495257978L) / _C.a(19079, 9010501690104214634L) - _C.a(23972, 3449680801830134628L));
                                        }
                                        var30_8 /* !! */  = (int)v3 /* !! */ ;
                                        if (var7_7) break block39;
                                    }
                                    var30_8 /* !! */  = (_C.a(9478, 2672064788159798257L) - _C.a(31110, 4266907793625433934L)) / 3 + _C.a(16358, 1353313000560525574L) ^ _C.a(11269, 6074420595360895721L);
                                    break block39;
                                    break;
                                }
                                break;
                            }
lbl60:
                            // 2 sources

                            while (true) {
                                hi.a("\u00a5", (Object)var20_18, (Object)new Object[0], (long)788466097860348813L);
                                v4 /* !! */  = var8_9;
                                if (!var7_7) ** GOTO lbl161
                                if (v4 /* !! */  == 0) ** GOTO lbl160
                                ** GOTO lbl162
                                break;
                            }
lbl66:
                            // 2 sources

                            while (true) {
                                block49: {
                                    var21_20 = v5;
                                    var22_22 = _C.i("1seb6OJ6TyeoxFF9", s(com.mojang.blaze3d.pipeline.RenderPipeline ), (RenderPipeline)var21_20);
                                    var23_24 = hi.a("\u00a5", (Object)var4_1, (long)970332505425455960L);
                                    var24_25 = 0;
                                    if (!var7_7) break block49;
                                    var30_8 /* !! */  = _C.a(8104, 2576767204750500188L) * _C.a(8230, 6414734313215631090L) - _C.a(21435, 8855604943142153580L);
                                    if (var7_7) break block40;
                                    ** GOTO lbl81
                                }
lbl76:
                                // 2 sources

                                while (true) {
                                    block51: {
                                        block50: {
                                            v6 = var24_25;
                                            v7 = _C.a(9633, 4467116782812797736L);
                                            if (!var7_7) break block50;
                                            if (v6 <= v7) break block51;
lbl81:
                                            // 2 sources

                                            v6 = _C.a(23777, 6691508896804758050L) * _C.a(18383, 8273883402321099060L);
                                            v7 = _C.a(30291, 8890890780648851619L);
                                        }
                                        var30_8 /* !! */  = v6 - v7;
                                        if (var7_7) break block40;
                                    }
                                    var30_8 /* !! */  = _C.a(8277, 4766857139003989655L) * _C.a(10878, 3741861216277009562L) ^ _C.a(25038, 4776300835810598675L);
                                    break block40;
                                    break;
                                }
                                break;
                            }
                        }
                        block30: while (true) {
                            switch (var30_8 /* !! */ ) {
                                default: {
                                    v2 = hi.a("j", (long)583640087590243823L);
                                    var30_8 /* !! */  = (int)(hi.a("G", (int)_C.a(1816, 164622813505829357L), (int)_C.a(22759, 4158799986227930729L), (long)834203424483934088L) / _C.a(28354, 4194242003769937947L) / 5 + _C.a(11154, 4947502146363561325L));
                                    if (!var7_7) {
                                        break block30;
                                    }
                                    break block41;
                                }
                                case -1871092466: {
                                    v2 = hi.a("j", (long)1304542266275262213L);
                                    if (var7_7) break block30;
                                    ** GOTO lbl39
                                }
                                case -1871092465: {
                                    hi.a("G", (long)1115568667421921156L);
                                    var30_8 /* !! */  = (_C.a(23809, 2269665920898753498L) - _C.a(17853, 3591019102988532565L) + _C.a(16946, 865332570121108706L) ^ _C.a(6618, 8032473295948588809L)) / _C.a(10378, 6210608579093272152L) ^ _C.a(9353, 519102021031238220L);
                                    continue block30;
                                }
                            }
                            break;
                        }
                        var30_8 /* !! */  = (int)(hi.a("G", (int)_C.a(17027, 8063907011708288112L), (int)_C.a(22818, 8217563983127504860L), (long)834203424483934088L) / _C.a(26103, 6933314821821356806L) / 5 + _C.a(11269, 4942403752785482489L));
                    }
                    switch (var30_8 /* !! */ ) {
                        case -1649215493: {
                            hi.a("G", (long)633547218849443973L);
                            break;
                        }
                    }
                    ** while (true)
                }
                block31: while (true) {
                    switch (var30_8 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 674138072: {
                            var22_21 = (float)((double)var2_3 * hi.a("G", (double)var21_19, (long)892033460936563353L));
                            var23_23 = (float)((double)var2_3 * hi.a("G", (double)var21_19, (long)920621527924433365L));
                            v8 = new Object[5];
                            v8[4] = (int)hi.a("\u00a5", (Object)new Color((float)hi.a("\u00a5", (Object)var6_4, (long)999912139159319168L) / 255.0f, (float)hi.a("\u00a5", (Object)var6_4, (long)791634218836538619L) / 255.0f, (float)hi.a("\u00a5", (Object)var6_4, (long)505295769199362574L) / 255.0f, 0.0f), (long)921162811333111485L);
                            v8[3] = Float.valueOf(var23_23);
                            v8[2] = Float.valueOf((float)(-hi.a("G", (double)(var9_10 + 1.0f), (long)920621527924433365L) / 2.700000047683716));
                            v8[1] = Float.valueOf(var22_21);
                            v8[0] = var18_16;
                            hi.a("\u00a5", (Object)var20_18, (Object)v8, (long)841969190343275241L);
                            v9 = new Object[5];
                            v9[4] = (int)hi.a("\u00a5", (Object)new Color((float)hi.a("\u00a5", (Object)var6_4, (long)999912139159319168L) / 255.0f, (float)hi.a("\u00a5", (Object)var6_4, (long)791634218836538619L) / 255.0f, (float)_C.i("1seb6OJ6TyeoxFF9", getBlue(), (Color)var6_4) / 255.0f, 0.52f * var10_11), (long)921162811333111485L);
                            v9[3] = Float.valueOf(var23_23);
                            v9[2] = Float.valueOf(0.0f);
                            v9[1] = Float.valueOf(var22_21);
                            v9[0] = var18_16;
                            hi.a("\u00a5", (Object)var20_18, (Object)v9, (long)841969190343275241L);
                            var21_19 += 0.09817477f;
                            if (var7_7) break;
                            ** GOTO lbl60
                        }
                        case 674138074: {
                            ** continue;
                        }
                        case 674138070: {
                            v5 = hi.a("j", (long)448622476022448234L);
                            var30_8 /* !! */  = _C.a(23820, 1547491105468375942L) - _C.a(10915, 1482509395313005693L) + _C.a(31592, 934646027951228302L);
                            if (!var7_7) {
                                break block31;
                            }
                            break block42;
                        }
                        case 674138071: {
                            v5 = hi.a("j", (long)773703201233143192L);
                            if (var7_7) break block31;
                            ** GOTO lbl66
                        }
                        case 674138073: {
                            hi.a("G", (long)1330918851199290462L);
                            return;
                        }
                    }
                    var30_8 /* !! */  = (int)((_C.i("1seb6OJ6TyeoxFF9", max(int int ), (int)_C.a(29253, 8603553498699746434L), (int)_C.a(28388, 7550283576821403666L)) - _C.a(24690, 8318530701213064957L)) * _C.a(21521, 3024912220176312982L) + _C.a(32067, 8653808520381383585L));
                    if (var7_7) continue;
lbl160:
                    // 2 sources

                    v4 /* !! */  = var30_8 /* !! */  = (int)(_C.i("1seb6OJ6TyeoxFF9", max(int int ), (int)hi.a("G", (int)_C.a(31448, 3399701244534015010L), (int)_C.a(1632, 9189664785074698464L), (long)834203424483934088L), (int)_C.a(8092, 1377362556229460301L)) * _C.a(30989, 3184705798791415761L) + _C.a(31626, 6366774672049390924L));
lbl161:
                    // 2 sources

                    if (var7_7) continue;
lbl162:
                    // 2 sources

                    var30_8 /* !! */  = _C.a(5313, 7649794241633364514L) * _C.a(4885, 5498902000969461140L) + _C.a(8717, 223516048715881691L);
                }
                var30_8 /* !! */  = _C.a(5026, 6148087125637541200L) - _C.a(8255, 3271687223690272450L) + _C.a(662, 6111327511847877658L);
            }
            while (true) {
                switch (var30_8 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1197048832: 
                }
                hi.a("G", (int)1, (long)1235507535267189928L);
                _C.i("1seb6OJ6TyeoxFF9", f());
                var30_8 /* !! */  = (_C.a(17024, 4073121071880272961L) / _C.a(28125, 2136247813093151582L) - _C.a(12844, 3745470664224640174L)) * _C.a(15644, 3345479612635972548L) + _C.a(14768, 5752593126104467323L) + _C.a(3563, 2020304432245814112L);
            }
        }
        while (true) {
            block52: {
                switch (var30_8 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 820205277: {
                        var25_26 = (float)((double)var24_25 * 3.141592653589793 * 2.0 / 90.0);
                        var26_27 = (float)((double)(var24_25 + 1) * 3.141592653589793 * 2.0 / 90.0);
                        v10 = new Object[2];
                        v10[1] = Float.valueOf(var2_3);
                        v10[0] = Float.valueOf(var26_27);
                        var27_28 = hi.a("G", (Object)v10, (long)545264589354033881L);
                        v11 = new Object[2];
                        v11[1] = Float.valueOf(var2_3);
                        v11[0] = Float.valueOf(var25_26);
                        var28_29 = hi.a("G", (Object)v11, (long)545264589354033881L);
                        var29_30 = hi.a("G", (Object)new Object[]{Float.valueOf(var25_26)}, (long)1050901860603233374L);
                        _C.i("1seb6OJ6TyeoxFF9", Y(org.joml.Matrix4f com.mojang.blaze3d.vertex.PoseStack$Pose float float float int float float float float ), (lZ)var22_22, (Matrix4f)var18_16, (PoseStack.Pose)var23_24, (float)hi.a("\u00e9", (Object)var28_29, (long)1160769104037734813L), (float)0.0f, (float)hi.a("\u00e9", (Object)var28_29, (long)868288808962388683L), (int)hi.a("\u00a5", (Object)new Color((int)hi.a("\u00a5", (Object)var3_5, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)var3_5, (long)791634218836538619L), (int)_C.i("1seb6OJ6TyeoxFF9", getBlue(), (Color)var3_5), (int)hi.a("G", (float)((float)hi.a("\u00a5", (Object)var3_5, (long)999912139159319168L) * var10_11), (long)400355798406630015L)), (long)921162811333111485L), (float)hi.a("\u00e9", (Object)var29_30, (long)1160769104037734813L), (float)0.0f, (float)hi.a("\u00e9", (Object)var29_30, (long)868288808962388683L), (float)2.0f);
                        hi.a("\u00a5", (Object)var22_22, (Object)var18_16, (Object)var23_24, (float)hi.a("\u00e9", (Object)var27_28, (long)1160769104037734813L), (float)0.0f, (float)hi.a("\u00e9", (Object)var27_28, (long)868288808962388683L), (int)hi.a("\u00a5", (Object)new Color((int)hi.a("\u00a5", (Object)var3_5, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)var3_5, (long)791634218836538619L), (int)_C.i("1seb6OJ6TyeoxFF9", getBlue(), (Color)var3_5), (int)hi.a("G", (float)((float)hi.a("\u00a5", (Object)var3_5, (long)999912139159319168L) * var10_11), (long)400355798406630015L)), (long)921162811333111485L), (float)hi.a("\u00e9", (Object)var29_30, (long)1160769104037734813L), (float)0.0f, (float)hi.a("\u00e9", (Object)var29_30, (long)868288808962388683L), (float)2.0f, (long)761281777649130913L);
                        ++var24_25;
                        if (var7_7) break block52;
                        ** GOTO lbl-1000
                    }
                    case 820205278: lbl-1000:
                    // 2 sources

                    {
                        hi.a("\u00a5", (Object)var22_22, (long)1317137917028563034L);
                        _C.i("1seb6OJ6TyeoxFF9", popPose(), (PoseStack)var4_1);
                        return;
                    }
                    case 820205279: 
                }
                _C.i("1seb6OJ6TyeoxFF9", j());
                hi.a("G", (long)426324660506778941L);
                return;
            }
            var30_8 /* !! */  = _C.a(7742, 6761176817233305812L) * _C.a(18904, 8309503137992144720L) - _C.a(4967, 6309336033215491517L);
        }
    }

    public static /* bridge */ /* synthetic */ CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static Vector2f E(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        return new Vector2f((float)(-hi.a("G", (double)f, (long)920621527924433365L) * (double)f2), (float)(hi.a("G", (double)f, (long)892033460936563353L) * (double)f2));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3ECA;
        if (b[n2] == null) {
            _C.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
