/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.ColorTargetState
 *  com.mojang.blaze3d.pipeline.DepthStencilState
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.CompareOp
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.LivingEntity
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.ya;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.PoseStack;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.LivingEntity;

public class vo {
    private static final RenderPipeline y;
    private static final Identifier Y;
    private static final RenderPipeline o;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Exception decompiling
     */
    public static void v(PoseStack var0, LivingEntity var1_1, int var2_2, int var3_3, double var4_4, double var6_5, Color var8_6, ya var9_7, Color var10_8, double var11_9, double var13_10, double var15_11, double var17_12, double var19_13) {
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

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var8 = new String[3];
                    var12_1 = 0;
                    var11_2 = "@\u0017U(C\u007f=G]]=Dy1W\u001eH/\u0019k1F\u0017K0O#(Z\u0015\u001cD\u001b]9Zd6Q]H,Ed4[\u001cr(W\u007f?Q\u0006r5Ub6\u001cD\u001b]9Zd6Q]H,Ed4[\u001cr(W\u007f?Q\u0006r5Ub6";
                    var13_3 = "@\u0017U(C\u007f=G]]=Dy1W\u001eH/\u0019k1F\u0017K0O#(Z\u0015\u001cD\u001b]9Zd6Q]H,Ed4[\u001cr(W\u007f?Q\u0006r5Ub6\u001cD\u001b]9Zd6Q]H,Ed4[\u001cr(W\u007f?Q\u0006r5Ub6".length();
                    var10_4 = 30;
                    var9_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var8[var12_1++] = new String(v0).intern();
                        if ((var9_5 += var10_4) < var13_3) {
                            var10_4 = var11_2.charAt(var9_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var9_5;
                    v2 = var11_2.substring(v1, v1 + var10_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 80;
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
                                    v11 = 100;
                                    break;
                                }
                                case 1: {
                                    v11 = 34;
                                    break;
                                }
                                case 2: {
                                    v11 = 125;
                                    break;
                                }
                                case 3: {
                                    v11 = 12;
                                    break;
                                }
                                case 4: {
                                    v11 = 102;
                                    break;
                                }
                                case 5: {
                                    v11 = 93;
                                    break;
                                }
                                default: {
                                    v11 = 8;
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
                var0_7 = 8267744674629746651L;
                var6_8 = new long[103];
                var3_9 = 0;
                var4_10 = "`\u0014\u00d1\u0097\u0005\u00f4\u00f2\u00c2\u00c4\u00fa\u00aa\u00b4\u009c\u009a\u0095\u0084\u00d6&\u0087 /\u00d6oY\u00ee\u0017&y\u00fc\u00f0\u00bemp\t\u00bbK\u0084:Y\u00fd\u00a1\u0000\u00d1S\u000f\u0085k\u00bc\u0080S~\u00f8>-`\u00170G\u00e7\u0095NdzphA\u0087\u00cb#\u00f5\u00e0\u00e1S\u00d58K\u009a6\u00c3\u00c8\u0016\u00e6Ps;\u00e9A\u00f9\u00b1\u0088\u0097\u00c8 \u008e\u009a!\u008911\u0007\u0004\u00b7vM\u00cf\u00b5aKK\u00be\u00c8g\u00cc\u00bf\u0090\u00ad\u00ce\\\u009e\u00b8v\u00d1\u00fa;W\u00fa\u0087R\u00efM\u00a8\u00e0\u00a0\u00db\u00a5\u00ab\u0096=\u00db>`\u00daH9\u0083\u00f6\u00d35\u00bf\u008dRy8\u00e7\u00ad\u00dc\u00f3_/\u008b\u008c\u00faD\u00fc\u00f6s+m\u00b9\u0084\u00f6o\u00b49\u00cf\u008e\u0012\u00f1\u00d4\u0000\u00039\u000b.an^2\u0099\u00b9\u00fd\u00eb l\u001b\u0010y\u00e6}Z\u00fa<\u009d,4\u00db\r&\u00b2{kd\u00e1*\u00c5%\u000e\u00d4\u00e2\u000f\u00f3N\u00179\u00a5^\u00c6\u00d1\u001d\u009dg\u0018\u00a6\u00a1\u00a0\u00b1\u0089\u000en\u00f3\u009aGmZ\u0091Jc\t\u00e0\u00f8\u0088\u00f4(\u0088\u001ew\u0084\u00bf#\u0001\r\u00ca\rk\u00fb\t\u00ec:\u00036\u00ef\u00c4\u00d8l<\u00e9|Wb\u00b5\u00a0\u008dQ\u00a0\u00c7\u001d\u0018N\u008b5u\u00aa\u0090\u000ex\u001c?\u00a4\u007fRB\u00d5\u00c6\u00een\u0092f\u00b2\u00efR\f\u008d\u00a3r\u00eeS\u0089\u00f2O\u00c1\u0087y\u0088\u00ac_\u000e\u0089\u0014NVz\u00a9=\u00bb>W\u0082'\u00cb>\u00c3\u00d0\u00db\u00ebvU\u0005\u0014@6\u00ae\f\u000f\u00b3\u00c9\u0097,\u00a0\u0004e\\G\u00d3\u00fdj\u0006\u00f7\u00dd\u00ad[\u0016\u00a4@\u00ba\u00a5\u0087T,.-\u008c\u00abk\u00c0\u00b2H.\u00bfCZ}TQd=\u00edW2\u00d5 &V\u0007\u00b8\u00e7s\u0096`\u009c\u00c8}\u0088\u001a6\u00ea\u00b1\u0098\u00e1\u00e4{d,\u00e9X\u00e4\u00f4\u00e2\u00be\u00e8\u00ec~o\u00cf\u00d3%\u00c3\u0098/Q\u00143\u008e\u001f6C^3\u00ff\u00b7\u00ae\u00f26\n\u0089\u001a\u00a6U\u00b6[P4(\u00b7:\u00d5\u00fd\u00b1\u00a8_\u00a1\u00bc\u00e8\u0096\u00f9\u00dd\u00a3f\u00e3\u008cm\u000b\\Zu\u00108\u0089\u008b\u008e\u00de4-5\u00ee^\u009d\u00df\u008b\u008f+\u00ad\u00b7\u00d9\u00f01\u00d6;\u008b\u0082\u009b\u00canM \u000ff\u0019\u00af40LZ\u0094\u00ec\"c\u00c8H\u00cd\u00d5&\u00e4\u00dd\u00bdg&\u00cf\u00d1\u0086Z\u00bf%\u00f6v01\u0096y\n\u00c5\u00fb>\u00be\u0093\u00ae<\u00c5\u0007a\u00d4T\u00b1\u001a\u0083U\u00c9n\u00ba\u00e9\u001f\u0094\u0014\u008eN%f\u00b7\u00be\u00c3\u008e\u0014\u00f5\u0095U\u00b4\u0013\u00cc\u00df\u00a49\u008a\u00c6t`\u00cf\u00ce\u00cd\u00b3\u0086\u00bd-G\u0001\u0091\u00fa\u00b1C\u00faJ\u009b\u00a5\u00e0\u00ec\u0014\u00fe\u00ec\u009an\u0017\u00aa\u00e2<\u0094U\u009f\u0091\u00b3_\u0011\u00ec\u00a0\f\u0085\u00cf\u00f3\u00b5\u00cbr\u00fc3d\f^<\u0093\u0099\u0004<\u00c7l\u00aa\u00b8\u00bc\u00abi\u00cc\u00c5Y{\u0003\u00d8\u00eb\u00e0K\u0002\u008f\u00f9\u0090^S\u0016\u0080\u00a1\u00ef\u00cc\u00a8\u0096\u001d\u00ef\u00c9MbI\u00ee\u001a\u00ee\u0096\u00f9\u00eao\u00c0\"\t\u008a\u00a8\u009d\r\u00d5\u009b\u0088\u00d0\u0013f\u0015\u008a`\t\u00db\u0093\u009c\u008d\u00f0>\u0092S\u0010\u0010\u00eaN~\u00a3\u00f5D'$'\u00bc!p\u00cfV8\u00bc\u0094\f\u00b4\u00f0\u0089|\u001f\u0093\u001d\u00f4\u0005j\u001dA\u00da\u0088\u00abau\u00b1\u009f\u00e2k\u008a\u0016\u00be\u00ed\u00b7(\u00c6LJ]\u00f2\u00eak\u00ff\u00c1\u00e3\u00e0a\u0003W$\u0082~\u00bc2M\u00f7\u00b5\u0094\u00eb\u00a45\u00a9\u00de\u00d7\u000b'g\u00d5\u00c4\u0089X\u001fg\u00d2%\tJ\u0099Q\u00e19";
                var5_11 = "`\u0014\u00d1\u0097\u0005\u00f4\u00f2\u00c2\u00c4\u00fa\u00aa\u00b4\u009c\u009a\u0095\u0084\u00d6&\u0087 /\u00d6oY\u00ee\u0017&y\u00fc\u00f0\u00bemp\t\u00bbK\u0084:Y\u00fd\u00a1\u0000\u00d1S\u000f\u0085k\u00bc\u0080S~\u00f8>-`\u00170G\u00e7\u0095NdzphA\u0087\u00cb#\u00f5\u00e0\u00e1S\u00d58K\u009a6\u00c3\u00c8\u0016\u00e6Ps;\u00e9A\u00f9\u00b1\u0088\u0097\u00c8 \u008e\u009a!\u008911\u0007\u0004\u00b7vM\u00cf\u00b5aKK\u00be\u00c8g\u00cc\u00bf\u0090\u00ad\u00ce\\\u009e\u00b8v\u00d1\u00fa;W\u00fa\u0087R\u00efM\u00a8\u00e0\u00a0\u00db\u00a5\u00ab\u0096=\u00db>`\u00daH9\u0083\u00f6\u00d35\u00bf\u008dRy8\u00e7\u00ad\u00dc\u00f3_/\u008b\u008c\u00faD\u00fc\u00f6s+m\u00b9\u0084\u00f6o\u00b49\u00cf\u008e\u0012\u00f1\u00d4\u0000\u00039\u000b.an^2\u0099\u00b9\u00fd\u00eb l\u001b\u0010y\u00e6}Z\u00fa<\u009d,4\u00db\r&\u00b2{kd\u00e1*\u00c5%\u000e\u00d4\u00e2\u000f\u00f3N\u00179\u00a5^\u00c6\u00d1\u001d\u009dg\u0018\u00a6\u00a1\u00a0\u00b1\u0089\u000en\u00f3\u009aGmZ\u0091Jc\t\u00e0\u00f8\u0088\u00f4(\u0088\u001ew\u0084\u00bf#\u0001\r\u00ca\rk\u00fb\t\u00ec:\u00036\u00ef\u00c4\u00d8l<\u00e9|Wb\u00b5\u00a0\u008dQ\u00a0\u00c7\u001d\u0018N\u008b5u\u00aa\u0090\u000ex\u001c?\u00a4\u007fRB\u00d5\u00c6\u00een\u0092f\u00b2\u00efR\f\u008d\u00a3r\u00eeS\u0089\u00f2O\u00c1\u0087y\u0088\u00ac_\u000e\u0089\u0014NVz\u00a9=\u00bb>W\u0082'\u00cb>\u00c3\u00d0\u00db\u00ebvU\u0005\u0014@6\u00ae\f\u000f\u00b3\u00c9\u0097,\u00a0\u0004e\\G\u00d3\u00fdj\u0006\u00f7\u00dd\u00ad[\u0016\u00a4@\u00ba\u00a5\u0087T,.-\u008c\u00abk\u00c0\u00b2H.\u00bfCZ}TQd=\u00edW2\u00d5 &V\u0007\u00b8\u00e7s\u0096`\u009c\u00c8}\u0088\u001a6\u00ea\u00b1\u0098\u00e1\u00e4{d,\u00e9X\u00e4\u00f4\u00e2\u00be\u00e8\u00ec~o\u00cf\u00d3%\u00c3\u0098/Q\u00143\u008e\u001f6C^3\u00ff\u00b7\u00ae\u00f26\n\u0089\u001a\u00a6U\u00b6[P4(\u00b7:\u00d5\u00fd\u00b1\u00a8_\u00a1\u00bc\u00e8\u0096\u00f9\u00dd\u00a3f\u00e3\u008cm\u000b\\Zu\u00108\u0089\u008b\u008e\u00de4-5\u00ee^\u009d\u00df\u008b\u008f+\u00ad\u00b7\u00d9\u00f01\u00d6;\u008b\u0082\u009b\u00canM \u000ff\u0019\u00af40LZ\u0094\u00ec\"c\u00c8H\u00cd\u00d5&\u00e4\u00dd\u00bdg&\u00cf\u00d1\u0086Z\u00bf%\u00f6v01\u0096y\n\u00c5\u00fb>\u00be\u0093\u00ae<\u00c5\u0007a\u00d4T\u00b1\u001a\u0083U\u00c9n\u00ba\u00e9\u001f\u0094\u0014\u008eN%f\u00b7\u00be\u00c3\u008e\u0014\u00f5\u0095U\u00b4\u0013\u00cc\u00df\u00a49\u008a\u00c6t`\u00cf\u00ce\u00cd\u00b3\u0086\u00bd-G\u0001\u0091\u00fa\u00b1C\u00faJ\u009b\u00a5\u00e0\u00ec\u0014\u00fe\u00ec\u009an\u0017\u00aa\u00e2<\u0094U\u009f\u0091\u00b3_\u0011\u00ec\u00a0\f\u0085\u00cf\u00f3\u00b5\u00cbr\u00fc3d\f^<\u0093\u0099\u0004<\u00c7l\u00aa\u00b8\u00bc\u00abi\u00cc\u00c5Y{\u0003\u00d8\u00eb\u00e0K\u0002\u008f\u00f9\u0090^S\u0016\u0080\u00a1\u00ef\u00cc\u00a8\u0096\u001d\u00ef\u00c9MbI\u00ee\u001a\u00ee\u0096\u00f9\u00eao\u00c0\"\t\u008a\u00a8\u009d\r\u00d5\u009b\u0088\u00d0\u0013f\u0015\u008a`\t\u00db\u0093\u009c\u008d\u00f0>\u0092S\u0010\u0010\u00eaN~\u00a3\u00f5D'$'\u00bc!p\u00cfV8\u00bc\u0094\f\u00b4\u00f0\u0089|\u001f\u0093\u001d\u00f4\u0005j\u001dA\u00da\u0088\u00abau\u00b1\u009f\u00e2k\u008a\u0016\u00be\u00ed\u00b7(\u00c6LJ]\u00f2\u00eak\u00ff\u00c1\u00e3\u00e0a\u0003W$\u0082~\u00bc2M\u00f7\u00b5\u0094\u00eb\u00a45\u00a9\u00de\u00d7\u000b'g\u00d5\u00c4\u0089X\u001fg\u00d2%\tJ\u0099Q\u00e19".length();
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
lbl88:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00f9!\u0092qVdL\u0082\u00e1y\u0099\u00be\u00cd+d\u00c4";
                    var5_11 = "\u00f9!\u0092qVdL\u0082\u00e1y\u0099\u00be\u00cd+d\u00c4".length();
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
lbl101:
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
lbl112:
                // 1 sources

                ** continue;
            }
        }
        vo.a = var6_8;
        vo.b = new Integer[103];
        vo.Y = hi.a("G", var8[0], (long)1218614314410685839L);
        vo.y = vo.c("wadF7s9jBAyy4crS", build(), (RenderPipeline.Builder)vo.c("wadF7s9jBAyy4crS", withCull(boolean ), (RenderPipeline.Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)644676233272493604L)}, (long)731833861383729593L), (Object)var8[2], (long)774963328677840218L), (Object)new ColorTargetState((BlendFunction)hi.a("j", (long)804551088968673257L)), (long)725018889764347121L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false));
        vo.o = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)644676233272493604L)}, (long)731833861383729593L), (Object)var8[1], (long)774963328677840218L), (Object)new ColorTargetState((BlendFunction)hi.a("j", (long)804551088968673257L)), (long)725018889764347121L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)503151544299192490L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (long)974970866675039906L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static Color Z(Object[] var0) {
        block45: {
            block46: {
                block44: {
                    block43: {
                        block41: {
                            block42: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                var10_1 = ((Float)var0[0]).floatValue();
                                                var4_2 = (Integer)var0[1];
                                                var2_3 = (Integer)var0[2];
                                                var6_4 = (Integer)var0[3];
                                                var11_5 = var0[4];
                                                var3_6 = var0[5];
                                                var9_7 = var0[6];
                                                var5_8 = ((Float)var0[7]).floatValue();
                                                var7_9 = ((Float)var0[8]).floatValue();
                                                var12_10 = ((Float)var0[9]).floatValue();
                                                var8_11 = ((Float)var0[10]).floatValue();
                                                var1_12 = ((Float)var0[11]).floatValue();
                                                var13_13 = Dl.S();
                                                var18_14 /* !! */  = hi.a("G", (int)vo.a(25849, 3833683272689826196L), (int)vo.a(25611, 3556701021548296546L), (long)834203424483934088L) ^ vo.a(22213, 8148514380452105206L);
                                                if (var13_13) {
                                                    switch (var18_14 /* !! */ ) {
                                                        case 1505484678: {
                                                            vo.c("wadF7s9jBAyy4crS", E());
                                                            hi.a("G", (long)421370710175267624L);
                                                            break;
                                                        }
                                                    }
                                                }
                                                var14_15 = vo.c("wadF7s9jBAyy4crS", clamp(float float float ), (float)var5_8, (float)0.0f, (float)1.0f);
                                                v0 = var6_4;
                                                if (!var13_13) break block37;
                                                if (v0 <= 0) break block38;
                                                v0 = var18_14 /* !! */  = vo.a(25887, 6654603451067545611L) - vo.a(10982, 5228553287243036561L) + vo.a(23324, 6429053198340195952L);
                                            }
                                            if (var13_13) break block39;
                                        }
                                        var18_14 /* !! */  = vo.a(20622, 839354360969137574L) * vo.a(1612, 6972476814797822789L) ^ vo.a(7000, 6735984683910710845L);
                                    }
                                    switch (var18_14 /* !! */ ) {
                                        default: {
                                            break;
                                        }
                                        case -1656033155: {
                                            v1 = (float)var4_2 / (float)var6_4;
                                            if (var13_13) break block40;
                                            break block41;
                                        }
                                        case -1656033157: {
                                            hi.a("G", (long)1064615117133635571L);
                                        }
                                    }
                                    v1 = 0.0f;
                                    var18_14 /* !! */  = hi.a("G", (int)vo.a(526, 2605484623353798440L), (int)vo.a(30515, 2169640727154403858L), (long)834203424483934088L) ^ vo.a(18270, 2311552642884180561L);
                                    if (var13_13) break block42;
                                }
                                var18_14 /* !! */  = hi.a("G", (int)vo.a(10009, 8226966840146426469L), (int)vo.a(5659, 8981245692746582801L), (long)834203424483934088L) ^ vo.a(6427, 8681107232417170444L);
                            }
                            switch (var18_14 /* !! */ ) {
                                case -520464869: {
                                    hi.a("G", (long)1325413874281312291L);
                                    hi.a("G", (long)957299721117170898L);
                                    break;
                                }
                            }
                        }
                        var15_16 = v1;
                        v2 /* !! */  = hi.a("\u00a5", (Object)((ya)var11_5), (long)923100095582242299L);
                        if (!var13_13) break block43;
                        switch (v2 /* !! */ ) {
                            case 0: {
                                var18_14 /* !! */  = vo.a(4240, 9071662423039102352L) * vo.a(26595, 4771718085729762027L) - vo.a(3157, 3608398665261961593L) + vo.a(17823, 857225385811351777L);
                                if (var13_13) break block44;
                            }
                            case 1: {
                                var18_14 /* !! */  = (vo.a(30111, 8570041602430675117L) - vo.a(2398, 278290309002843243L) - vo.a(28357, 8469876655777297406L) ^ vo.a(3677, 4935848878171575158L)) + vo.a(10981, 8540279564120225779L) ^ vo.a(19183, 4749873821328054169L);
                                if (var13_13) break block44;
                            }
                            case 2: {
                                var18_14 /* !! */  = hi.a("G", (int)vo.a(28607, 4952365522740327069L), (int)vo.a(2257, 9216089998016632303L), (long)834203424483934088L) ^ vo.a(2228, 5660016016279229867L);
                                if (var13_13) ** break;
                                break;
                            }
                            {
                            }
                        }
                        v2 /* !! */  = (CallSite)((vo.a(10813, 6617226346564188012L) + vo.a(3405, 1898929967312752713L)) / vo.a(22937, 1941109628186854632L) ^ vo.a(13126, 4049184888341622289L) ^ vo.a(21557, 7996173731417262418L));
                    }
                    var18_14 /* !! */  = (int)v2 /* !! */ ;
                }
                switch (var18_14 /* !! */ ) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case -3554931: {
                        var16_17 = (vo.c("wadF7s9jBAyy4crS", sin(double ), (double)(var10_1 * var7_9 * 0.25f + var15_16 * 6.2831855f + (float)var2_3)) + 1.0f) * 0.5f;
                        var17_18 = hi.a("G", (float)(var16_17 * var14_15), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                        v3 = hi.a("G", (Object)((Color)var3_6), (Object)((Color)var9_7), (float)var17_18, (long)1040237525350741921L);
                        var18_14 /* !! */  = (int)(hi.a("G", (int)vo.a(15153, 8717109216020653577L), (int)vo.a(9646, 7073826266987854013L), (long)834203424483934088L) - vo.a(10878, 5131216625507956511L) - vo.a(1422, 7736801403692144779L));
                        break block45;
                    }
                    case -3554930: {
                        var16_17 = hi.a("G", (float)(var10_1 * 0.01f * var12_10 + var15_16 + (float)var2_3 * 0.17f), (long)819393344494525742L);
                        var17_19 = hi.a("G", (float)var16_17, (float)hi.a("G", (float)var8_11, (float)0.0f, (float)1.0f, (long)390336973585993938L), (float)hi.a("G", (float)var1_12, (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)614858597337907880L);
                        v3 = new Color((int)hi.a("\u00a5", (Object)var17_19, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)var17_19, (long)791634218836538619L), (int)hi.a("\u00a5", (Object)var17_19, (long)505295769199362574L), (int)hi.a("\u00a5", (Object)((Color)var3_6), (long)999912139159319168L));
                        var18_14 /* !! */  = (int)(hi.a("G", (int)vo.a(22138, 7188477599276927752L), (int)vo.a(462, 1180780303979633837L), (long)834203424483934088L) - vo.a(20987, 6813724679532678275L) - vo.a(10696, 4625921672491660491L));
                        if (var13_13) break block45;
                        break block46;
                    }
                    case -3554929: {
                        hi.a("G", (long)872630577218346603L);
                        hi.a("G", (int)1, (long)1040117516474656258L);
                        break;
                    }
                    case -3554928: 
                }
                v3 = (Color)var3_6;
                if (!var13_13) {
                    return v3;
                }
            }
            var18_14 /* !! */  = (int)(hi.a("G", (int)vo.a(22138, 7188477599276927752L), (int)vo.a(462, 1180780303979633837L), (long)834203424483934088L) - vo.a(20987, 6813724679532678275L) - vo.a(10696, 4625921672491660491L));
        }
        block24: while (true) {
            switch (var18_14 /* !! */ ) {
                case 665897691: {
                    hi.a("G", (long)1014665100432844273L);
                    hi.a("G", (long)803447087172553064L);
                    var18_14 /* !! */  = (int)(hi.a("G", (int)(vo.a(19873, 611850901399179394L) * vo.a(7104, 6240381269908801271L) ^ vo.a(7318, 5310179104873890288L)), (int)vo.a(12364, 8419412231800679757L), (long)834203424483934088L) + vo.a(19225, 3916825626673616422L));
                    continue block24;
                }
            }
            break;
        }
        return v3;
    }

    public static /* bridge */ /* synthetic */ CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5D35;
        if (b[n2] == null) {
            vo.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
