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
 *  net.minecraft.client.Minecraft
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.DB;
import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.XD;
import com.github.epsilon.XG;
import com.github.epsilon.Xn;
import com.github.epsilon._I;
import com.github.epsilon.d9;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.nI;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;

public class eR
extends e {
    private final XG W;
    private final XG P;
    private final DV l;
    private final List<_I> m;
    public static final eR T;
    private static final RenderPipeline C;
    private final Xn c;
    private final Dx<DB> a;
    private final XG O;
    private final Dx<nI> X;
    private static final Identifier w;
    private static final Identifier N;
    private final DM D;
    private final Dx<XD> K = hi.a("\u00a5", (Object)this, (Object)eR.b(-163, 21815), (Object)hi.a("j", (long)1230185026334181397L), (long)426795652261052192L);
    private static final Identifier M;
    private static final String[] b;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] h;
    private static final long k;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Color I(Object[] var1_1) {
        block14: {
            var2_2 = (Integer)var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = eR.c(7592, 7272120434688648909L) - eR.c(11347, 3057318372064253700L) ^ eR.c(23154, 9000024159229026600L);
            if (var3_3) ** GOTO lbl16
            block8: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1245844351718932087L), (Object)hi.a("j", (long)1146400490650230939L), (long)511460060498514638L);
                            if (!var3_3) break block15;
                            if (v0 /* !! */  != false) break block16;
                            v0 /* !! */  = (CallSite)(hi.a("G", (int)(eR.c(30329, 7608873432508108070L) ^ eR.c(10131, 7721535295845325977L)), (int)eR.c(583, 3086826403312695633L), (long)834203424483934088L) ^ eR.c(8166, 3559886365391250530L) ^ eR.c(19264, 2318924819780907104L));
                        }
                        var4_4 /* !! */  = (int)v0 /* !! */ ;
                        if (var3_3) break block17;
                    }
                    var4_4 /* !! */  = hi.a("G", (int)(eR.c(26295, 1825132735842196938L) / 4), (int)eR.c(6401, 2169904217405415994L), (long)834203424483934088L) * eR.c(24573, 7581930277042988163L) ^ eR.c(15281, 7506301173902393400L);
                }
                switch (var4_4 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case 1783963239: {
                        v1 = eR.y("9QjdJCrmtYKoKt4r", u(int ), (eR)this, (int)var2_2);
                        var4_4 /* !! */  = eR.c(13153, 2529512992671647974L) / eR.c(30794, 8848749349543936853L) + eR.c(23578, 5023388020810753833L);
                        if (!var3_3) {
                            break block8;
                        }
                        break block14;
                    }
                    case 1783963241: {
                        v1 = (Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)912428582448635970L), (long)789438897355831922L);
                        if (var3_3) break block8;
                        return v1;
                    }
                    case 1783963240: {
                        hi.a("G", (long)588120149496418092L);
                        hi.a("G", (long)480507656276889797L);
                        return null;
                    }
                }
                break;
            }
            var4_4 /* !! */  = eR.c(11829, 1535703999895590184L) / eR.c(26077, 7497763091849682652L) + eR.c(15786, 8945080171944855081L);
        }
        switch (var4_4 /* !! */ ) {
            default: {
                return v1;
            }
            case 1705766230: 
        }
        hi.a("G", (float)6.0f, (float)-1.0f, (long)1060325894040809393L);
        hi.a("G", (long)868272870930574387L);
        return hi.a("G", (boolean)false, (long)529149675032995021L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var15 = new String[14];
                            var13_1 = 0;
                            var12_2 = "\u000e$\u00de\u0098\u001b\u00b7\u00c0\u00eb^\u00ef\u00d1u\u00d7\u00e5\b\u00ec\u009d6\u00d0\u00fd\u009fJ\u009a?\u00afo+\u00c8\u0099\u00ae&^\u0005&T\u0007j\u00dd\tp\u0018[\":\u00d30\u008d\u0004\u0007I\u00a9\u0095\u00d8\u001d\u00f7\u00a2\u0005s\u00db\u00a9\u00e3\u008d\u0006\u008e\u00e8HSuW\u0005\u00ed\u0005e\u00b6\u00af\r\u00c4\u00e32\u00e3|\u00ab\u0091\u00ee\u00ca\u00db\u008a\u0081Q\nN\u0088\u0011\u0007!\u00d0c\u00f3A\u0006\u001e\u0084\u0099\u008du#\u00b4\u00ec{\u00d6\u009d\u008a/\u00fa\u0086dUy\u00c3Y\u0091\u00beH[\u00cc5\u00da\u00fbKX\u00dd\t\u00c6\u00b5\u00e4l\u0086\u0082\u00abA\u00f9";
                            var14_3 = "\u000e$\u00de\u0098\u001b\u00b7\u00c0\u00eb^\u00ef\u00d1u\u00d7\u00e5\b\u00ec\u009d6\u00d0\u00fd\u009fJ\u009a?\u00afo+\u00c8\u0099\u00ae&^\u0005&T\u0007j\u00dd\tp\u0018[\":\u00d30\u008d\u0004\u0007I\u00a9\u0095\u00d8\u001d\u00f7\u00a2\u0005s\u00db\u00a9\u00e3\u008d\u0006\u008e\u00e8HSuW\u0005\u00ed\u0005e\u00b6\u00af\r\u00c4\u00e32\u00e3|\u00ab\u0091\u00ee\u00ca\u00db\u008a\u0081Q\nN\u0088\u0011\u0007!\u00d0c\u00f3A\u0006\u001e\u0084\u0099\u008du#\u00b4\u00ec{\u00d6\u009d\u008a/\u00fa\u0086dUy\u00c3Y\u0091\u00beH[\u00cc5\u00da\u00fbKX\u00dd\t\u00c6\u00b5\u00e4l\u0086\u0082\u00abA\u00f9".length();
                            var11_4 = 4;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 101;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "\t5#\u00efu\\\u0084\u009b\"\u00d3\u0096\u00c3\u00c4\u00ac\u0082$\u0081'\u00ee\u00f4c%\u0087\u00a4\u00a1\u00c2\u00ac\u00d5\u00ce\u0016\u001c\u00ceCW\u00bd\u00eb>f\u00b9\u0014VA\u00c5\u0010H\u00aa\u001f3\u0019\u0083Wz\u00df\u00ca\u00ce#P\u00e0\u00b6";
                                var14_3 = "\t5#\u00efu\\\u0084\u009b\"\u00d3\u0096\u00c3\u00c4\u00ac\u0082$\u0081'\u00ee\u00f4c%\u0087\u00a4\u00a1\u00c2\u00ac\u00d5\u00ce\u0016\u001c\u00ceCW\u00bd\u00eb>f\u00b9\u0014VA\u00c5\u0010H\u00aa\u001f3\u0019\u0083Wz\u00df\u00ca\u00ce#P\u00e0\u00b6".length();
                                var11_4 = 30;
                                var10_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 80;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
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
                                        v15 = 105;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 67;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 123;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 90;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 54;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 16;
                                        break;
                                    }
                                    default: {
                                        v15 = 57;
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
                    eR.b = var15;
                    eR.d = new String[14];
                    var2_7 = 8426213357228370971L;
                    var8_8 = new long[146];
                    var5_9 = 0;
                    var6_10 = "\u0010/\u00cd\u00f5\u00ec\u0096\u0018\u00eccoK\u0013\u00c8Hg\u001b\u0017\u00a8\u009ap#\u00e7B\u00e0\u00c6R\t\u00e0\u0015\u00f6i}!\u0098\u00df\u00f1=\u00b1c\u00fb\u00b5\u00c1\u00f3r\u00f1Kk\u00b5#c\u009f\u00f4\u00b2\u00a41[!>\u00e0\u00c1\u00d5\u0094@\u00da\u00ceE\u00ce\u00e7\u00e5\u00d0\u00ba\u001f\u0091\u00c7\u00b0\u008d\u00eb\f9\u00fb\u00d5\u0018E\u00bd*\u00a3CD\u0001\u00d5#\u00b0]Oq\u00e4\u00b2jF\u00a5\u00b5['\u0090\u00ec!\u00b5p\u00be|\u0007f\u0091\u00e6\u00daD$\u0083\u00b2\u00cdT\u00c8\b&l#K\u0093 \u00ba9\u00e5\u00116\u00afD*\u00e9\u00b6\u00f87\u00ed\u00f1@\u0000\u00d4f\u00d7\u001d\u00e8\u00cdEM@t\u00f1\u00ae\u009d\u0017q\u00fbT.\u0087!\u00cd\u0017\u00d0\u00da\u00f8\u00ac5\u0099\u0091\u00a4)\u00d52\u00c8\u00cb\u0019I\u0019^^ D\u009f$\u00f7^\u00a6\u00e4fw\u009b\u00eb\u00d6\u00a4pA\u001ek\u00e9\u00a1\u00f3p\u00dc\u00e3\u00d1YhSa\u00f8'\u00ad\u00ed\u00d6\u0096\u0099.\u00d1i\u001e=P\u00dd\u00d9\u00c8\u00e7^!\u00ff#\u00a5\u0002\u00b5\r\u00b1\u00b1L\u00a4Ui|Oo#\u00f1s=\nh\u00812\u008e)!\u00b9\u00e9\u00a0eb\u00bb\u00d9;\u00fa\u00de`\u0000\u008a5\u00basHP4)\u00f0\u00df\u00fe\u0001\u009c\u00c6\u0001e\u008cf2\u00e5\u0085\u00ee\u00c7\u0000\u00c5\u00c6Z\u00b6\u00a7\u00f0\u00af\u008e\u00e4\u00bd\u0082\u00a4\u00c3\u00a8\u000eY\u0093;j\u0006k\u0096\u00ee-\u00aeU\u00fa\u00fdm\u00f5\u00e7\b\u00ca\u0096(\u00fc\u00a3\u00c8\u0085\u0019\u00c9\u00fdm<\r-\u008e\u00a7_t\u00c9\u00cd\u0016\u0086\u00dd\u00e80\u00a8\u00f9\f\\\u00b4\u008bY\u00b4%\u00f9\u00e8s\u00f8@4\u0090\u00f5\u00d5\u0005\u0097\u00999\u0014\u00a4\u0091\u009f\u0015T0H+\u0011\u00f6p<!.\u00b7\u00f9\u0019\u00c4B\u0083\u0015\u00dexF\u00ad\\\u0001\u00e7\u000f\u008d\u00f1\u001e\n\u00aa-\u00f6\u0086\u00e4G\u00ee\u00d4\u00e1\u00f1\u001e\u00d7\u00a9\u001b\u009f\u0097\u000f\u0012Z2-P\r\u009ee\u00de\u00c3\u00df\u00a2h|\u00ee5\u0015w\u0015%I\u00bd\u00b7\u00da\u0010\u00956\u00dc\u0011|\u00dd\t\u0001+\u00eb\u00c5\u000f\u0013\u00a5\u009c(,\u00125\u00c2,\u00ac\u0005\u0084Z\u0016\u0082Z\\\u00c6\u00e4$\u00ff\u001c\u00ee\u00d3c*\\G\u00d2\u00c3\u00126\u00b5#\u008c\u00ea;BF8\u009f\f\u0089\u00e6\u00f3\u00f17\u00af\u00ab\u0081\u00c1\u00fb\u00dc)\u00f0\u00b2k8\u007f\u0012\u00e2`\u00cen\u00c96\u00d7Q\u0087\u00f5\u0097V\u008c\u00c0\u00de\n\u00ec\u00b5\u00ca\u0017\u00ef\u00d2W\u0092)G\u0002\u00c0s\t\u00bf\u001d5\u008e\u00cbM\u008a\u008d[\u00df\b\u00b8\u0085\u0094\u00a1K\u0087I\u00da\t7\u00bc\u00b3\u00ee\u00bb\u008e\u0016 \u00cc\u00c8D\u00f5\u0084\u0092\u00d1\u00bc\u0014Z\u000b\u001bs4\u00c9\u00d5\u008c\u0018\u00df\u008cE\u0003l}\u0088U\u00f71\u00d4\u00e4\u00c7,\u008a\u00a6\u00c2y\u00be\u00fd[=\u001d\u00bd\u00c4\u0018\u00c1\t4\u0096\u00ec\u00b1\u00ca\u0013Y*\u00e9\u0084\u0013\u001a~?&\u00aaQv`/\u0091\u007f\u00fb\u00aa\u0086\u0092\u001av\u0017\u00aaA\u0000\u00d3\u00c9\u0083y,\u00cat]\u00db\u0089\u00a6\u007fL\u00a9G\u00dc\u00ffS{\u00df\u00ea\u001f\u0088OO\u00be\u0002Z_\r[\u00d60E\u00bc\u00e4\n\u00eb\u00c0\u00d8XP\u00d8Y\u00d4\u00fa\u0086\u0090\u0011\u00f3\u0096P\u000b{-Q]!\u0092\u00d4\u00c4\u00c8\u00f5\u0099\u00ea\u001c\u00f2\u00d3\u00c5\u00be\u008e\"_\u00e7K\u00e6Q\u00c5Mx_\u009a\u008505\u0006\u00d1>\u00df\u00ad\u00bc\u00c9\u00eb\u00ac\u00aa\u00cc\u00a0\u0014Z\t\u00fa\u0002\u0012a}\u0010\u00ff\u00bb.G\u00d6s\u00cd%\u00f3\u00b7m\u0085\u0014\u00b8\u00d3\u00f0\u00cc\u009a\u000eA\u00e2\u00a2\u0096\u001b\u00b4\u0002\u0098\u008e\u0080\u00fb\u00fbR\u00ceLJ\u00e6c!6TDgCT\u00a6\u00f7Q\u00d3\u001f6TQ\u00b0\u00f0Bj\u00aa]IR\u00b1$\u00e7\u00ee2\u00f0\u00a7\u008d\u00bd\u00a3\u008f\u001bU\u0088\u00f7\u00b8X1\u00d0Q\u00afK\u00c3\u00c5U:\u00f6w\u0087{vj\u008e\u00cd\u00ff\u00a7\u00a2@\u0096\u00f3;\u00a0#7\u00f3\u00ca\u0017\u00c3\u00ed\u00f5\u00da\u008a1\u00a6\t\u0019\u00bd\u00e1\u008dd\u0093~\u00fdN2\u00df\u001cD\u00da_\u009b\u00d8e\u00b6\u00afb\u0091\u00e4U\u00c16GZ\u001ft\u00c0\u00d5\u00b9U\u0094u_\u00b5?\u00bd\u0005$\u00e2\u00f0C\u00a6\u0082\u00c0\u00d8\u001f\u00fd)\u00a1\u0004\u00ba\u0094\u00dd\u00bb\u0003\u00fc)\u00e425\u00d8\u0093\u0081\u00abF<4\u00be\u0004\u0016$\u0004\u00ed\u001cuB3b\u00f0Q\u00fa\u00e4\u00a1\u00aef\u00b0F\u00d1\u00e9V\u00e9d\u00a4\u00a0\u00b3\u00f6\u00e0\u00e6#\u0089\u00fb\tn_\u009e\u00f7\u0015\u00e0\u0092\u00a6\u00d59Y\u00ed\u00a4\u001c*\u00ce\u0093~\u008ae\u00ba\u0015[bl\bG\u00a1\u008e\u0017Q\u00b4 \u00f6\u00c6\u008a\u00a6\u000e\u00f8\u0018{\u00adA\u00cf8\u009d\u000bm\u00dcQ\u00cf\u00de\u00b5\u00a9\u00e1\u00ad\u00e9=\r\u0010\u00a4\u00e7+\u00c7\u0003\u0090\u00b2\\#xR\u008bA/\u0092\f\u00b9^\u00b8\u0082\u00b1\u00d7?\u001dS\u008e\u00b2\u00aa\u00db\u0080b\u00b9\u00d2\u00f8\u0091\u00d4\rS\u00fc{>8\u00a1\u00fd\u00da\u00e7s\u00ea\u00e9P\u008b\u00c4\u00e3F\u00c3\u00d2?s\u00ef.#\u00fc\u00dd\u009d0%G\u00e46\u00dcX\u00behD\u00ec\u0019\u0019T\u000b#\u009a\u0002*\u00ca\u00bfV!\u00d3\u00af\u00ee\u00e5}\u008e:/\u00f8N?\u00ce\u00b2\u00d0\u00ab\u00cb\u009fh\u00edb";
                    var7_11 = "\u0010/\u00cd\u00f5\u00ec\u0096\u0018\u00eccoK\u0013\u00c8Hg\u001b\u0017\u00a8\u009ap#\u00e7B\u00e0\u00c6R\t\u00e0\u0015\u00f6i}!\u0098\u00df\u00f1=\u00b1c\u00fb\u00b5\u00c1\u00f3r\u00f1Kk\u00b5#c\u009f\u00f4\u00b2\u00a41[!>\u00e0\u00c1\u00d5\u0094@\u00da\u00ceE\u00ce\u00e7\u00e5\u00d0\u00ba\u001f\u0091\u00c7\u00b0\u008d\u00eb\f9\u00fb\u00d5\u0018E\u00bd*\u00a3CD\u0001\u00d5#\u00b0]Oq\u00e4\u00b2jF\u00a5\u00b5['\u0090\u00ec!\u00b5p\u00be|\u0007f\u0091\u00e6\u00daD$\u0083\u00b2\u00cdT\u00c8\b&l#K\u0093 \u00ba9\u00e5\u00116\u00afD*\u00e9\u00b6\u00f87\u00ed\u00f1@\u0000\u00d4f\u00d7\u001d\u00e8\u00cdEM@t\u00f1\u00ae\u009d\u0017q\u00fbT.\u0087!\u00cd\u0017\u00d0\u00da\u00f8\u00ac5\u0099\u0091\u00a4)\u00d52\u00c8\u00cb\u0019I\u0019^^ D\u009f$\u00f7^\u00a6\u00e4fw\u009b\u00eb\u00d6\u00a4pA\u001ek\u00e9\u00a1\u00f3p\u00dc\u00e3\u00d1YhSa\u00f8'\u00ad\u00ed\u00d6\u0096\u0099.\u00d1i\u001e=P\u00dd\u00d9\u00c8\u00e7^!\u00ff#\u00a5\u0002\u00b5\r\u00b1\u00b1L\u00a4Ui|Oo#\u00f1s=\nh\u00812\u008e)!\u00b9\u00e9\u00a0eb\u00bb\u00d9;\u00fa\u00de`\u0000\u008a5\u00basHP4)\u00f0\u00df\u00fe\u0001\u009c\u00c6\u0001e\u008cf2\u00e5\u0085\u00ee\u00c7\u0000\u00c5\u00c6Z\u00b6\u00a7\u00f0\u00af\u008e\u00e4\u00bd\u0082\u00a4\u00c3\u00a8\u000eY\u0093;j\u0006k\u0096\u00ee-\u00aeU\u00fa\u00fdm\u00f5\u00e7\b\u00ca\u0096(\u00fc\u00a3\u00c8\u0085\u0019\u00c9\u00fdm<\r-\u008e\u00a7_t\u00c9\u00cd\u0016\u0086\u00dd\u00e80\u00a8\u00f9\f\\\u00b4\u008bY\u00b4%\u00f9\u00e8s\u00f8@4\u0090\u00f5\u00d5\u0005\u0097\u00999\u0014\u00a4\u0091\u009f\u0015T0H+\u0011\u00f6p<!.\u00b7\u00f9\u0019\u00c4B\u0083\u0015\u00dexF\u00ad\\\u0001\u00e7\u000f\u008d\u00f1\u001e\n\u00aa-\u00f6\u0086\u00e4G\u00ee\u00d4\u00e1\u00f1\u001e\u00d7\u00a9\u001b\u009f\u0097\u000f\u0012Z2-P\r\u009ee\u00de\u00c3\u00df\u00a2h|\u00ee5\u0015w\u0015%I\u00bd\u00b7\u00da\u0010\u00956\u00dc\u0011|\u00dd\t\u0001+\u00eb\u00c5\u000f\u0013\u00a5\u009c(,\u00125\u00c2,\u00ac\u0005\u0084Z\u0016\u0082Z\\\u00c6\u00e4$\u00ff\u001c\u00ee\u00d3c*\\G\u00d2\u00c3\u00126\u00b5#\u008c\u00ea;BF8\u009f\f\u0089\u00e6\u00f3\u00f17\u00af\u00ab\u0081\u00c1\u00fb\u00dc)\u00f0\u00b2k8\u007f\u0012\u00e2`\u00cen\u00c96\u00d7Q\u0087\u00f5\u0097V\u008c\u00c0\u00de\n\u00ec\u00b5\u00ca\u0017\u00ef\u00d2W\u0092)G\u0002\u00c0s\t\u00bf\u001d5\u008e\u00cbM\u008a\u008d[\u00df\b\u00b8\u0085\u0094\u00a1K\u0087I\u00da\t7\u00bc\u00b3\u00ee\u00bb\u008e\u0016 \u00cc\u00c8D\u00f5\u0084\u0092\u00d1\u00bc\u0014Z\u000b\u001bs4\u00c9\u00d5\u008c\u0018\u00df\u008cE\u0003l}\u0088U\u00f71\u00d4\u00e4\u00c7,\u008a\u00a6\u00c2y\u00be\u00fd[=\u001d\u00bd\u00c4\u0018\u00c1\t4\u0096\u00ec\u00b1\u00ca\u0013Y*\u00e9\u0084\u0013\u001a~?&\u00aaQv`/\u0091\u007f\u00fb\u00aa\u0086\u0092\u001av\u0017\u00aaA\u0000\u00d3\u00c9\u0083y,\u00cat]\u00db\u0089\u00a6\u007fL\u00a9G\u00dc\u00ffS{\u00df\u00ea\u001f\u0088OO\u00be\u0002Z_\r[\u00d60E\u00bc\u00e4\n\u00eb\u00c0\u00d8XP\u00d8Y\u00d4\u00fa\u0086\u0090\u0011\u00f3\u0096P\u000b{-Q]!\u0092\u00d4\u00c4\u00c8\u00f5\u0099\u00ea\u001c\u00f2\u00d3\u00c5\u00be\u008e\"_\u00e7K\u00e6Q\u00c5Mx_\u009a\u008505\u0006\u00d1>\u00df\u00ad\u00bc\u00c9\u00eb\u00ac\u00aa\u00cc\u00a0\u0014Z\t\u00fa\u0002\u0012a}\u0010\u00ff\u00bb.G\u00d6s\u00cd%\u00f3\u00b7m\u0085\u0014\u00b8\u00d3\u00f0\u00cc\u009a\u000eA\u00e2\u00a2\u0096\u001b\u00b4\u0002\u0098\u008e\u0080\u00fb\u00fbR\u00ceLJ\u00e6c!6TDgCT\u00a6\u00f7Q\u00d3\u001f6TQ\u00b0\u00f0Bj\u00aa]IR\u00b1$\u00e7\u00ee2\u00f0\u00a7\u008d\u00bd\u00a3\u008f\u001bU\u0088\u00f7\u00b8X1\u00d0Q\u00afK\u00c3\u00c5U:\u00f6w\u0087{vj\u008e\u00cd\u00ff\u00a7\u00a2@\u0096\u00f3;\u00a0#7\u00f3\u00ca\u0017\u00c3\u00ed\u00f5\u00da\u008a1\u00a6\t\u0019\u00bd\u00e1\u008dd\u0093~\u00fdN2\u00df\u001cD\u00da_\u009b\u00d8e\u00b6\u00afb\u0091\u00e4U\u00c16GZ\u001ft\u00c0\u00d5\u00b9U\u0094u_\u00b5?\u00bd\u0005$\u00e2\u00f0C\u00a6\u0082\u00c0\u00d8\u001f\u00fd)\u00a1\u0004\u00ba\u0094\u00dd\u00bb\u0003\u00fc)\u00e425\u00d8\u0093\u0081\u00abF<4\u00be\u0004\u0016$\u0004\u00ed\u001cuB3b\u00f0Q\u00fa\u00e4\u00a1\u00aef\u00b0F\u00d1\u00e9V\u00e9d\u00a4\u00a0\u00b3\u00f6\u00e0\u00e6#\u0089\u00fb\tn_\u009e\u00f7\u0015\u00e0\u0092\u00a6\u00d59Y\u00ed\u00a4\u001c*\u00ce\u0093~\u008ae\u00ba\u0015[bl\bG\u00a1\u008e\u0017Q\u00b4 \u00f6\u00c6\u008a\u00a6\u000e\u00f8\u0018{\u00adA\u00cf8\u009d\u000bm\u00dcQ\u00cf\u00de\u00b5\u00a9\u00e1\u00ad\u00e9=\r\u0010\u00a4\u00e7+\u00c7\u0003\u0090\u00b2\\#xR\u008bA/\u0092\f\u00b9^\u00b8\u0082\u00b1\u00d7?\u001dS\u008e\u00b2\u00aa\u00db\u0080b\u00b9\u00d2\u00f8\u0091\u00d4\rS\u00fc{>8\u00a1\u00fd\u00da\u00e7s\u00ea\u00e9P\u008b\u00c4\u00e3F\u00c3\u00d2?s\u00ef.#\u00fc\u00dd\u009d0%G\u00e46\u00dcX\u00behD\u00ec\u0019\u0019T\u000b#\u009a\u0002*\u00ca\u00bfV!\u00d3\u00af\u00ee\u00e5}\u008e:/\u00f8N?\u00ce\u00b2\u00d0\u00ab\u00cb\u009fh\u00edb".length();
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
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "6;\u0080\u00df5\u00deL~\u001f@\u00e3\u008f[\u00cd\tv";
                        var7_11 = "6;\u0080\u00df5\u00deL~\u001f@\u00e3\u008f[\u00cd\tv".length();
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
lbl125:
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
lbl136:
                    // 1 sources

                    ** continue;
                }
            }
            eR.e = var8_8;
            eR.h = new Integer[146];
            break block31;
lbl141:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 5883056576856158281L;
        ** while (true)
        eR.k = 5883056576856158301L ^ var0_14;
        eR.T = new eR();
        eR.N = hi.a("G", eR.b(-164, -23055), (long)1218614314410685839L);
        eR.w = hi.a("G", eR.b(-176, -13543), (long)1218614314410685839L);
        eR.M = hi.a("G", eR.b(-169, 8258), (long)1218614314410685839L);
        eR.C = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)eR.y("9QjdJCrmtYKoKt4r", withLocation(java.lang.String ), (RenderPipeline.Builder)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)644676233272493604L)}, (long)731833861383729593L), (String)eR.b(-175, 23372)), (Object)new ColorTargetState((BlendFunction)hi.a("j", (long)804551088968673257L)), (long)725018889764347121L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (long)974970866675039906L);
    }

    static Minecraft X(Object[] objectArray) {
        eR eR2 = (eR)objectArray[0];
        return hi.a("\u00e9", (Object)eR2, (long)1187940231439308830L);
    }

    static Minecraft F(Object[] objectArray) {
        eR eR2 = (eR)objectArray[0];
        return hi.a("\u00e9", (Object)eR2, (long)1187940231439308830L);
    }

    private eR() {
        super(eR.b(-171, -7241), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        this.a = hi.a("\u00a5", (Object)this, (Object)eR.b(-167, -9206), (Object)hi.a("j", (long)441303035586271029L), (long)426795652261052192L);
        this.X = hi.a("\u00a5", (Object)this, (Object)eR.b(-172, -27179), (Object)hi.a("j", (long)1146400490650230939L), (long)426795652261052192L);
        this.l = eR.y("9QjdJCrmtYKoKt4r", P(java.lang.String java.awt.Color boolean com.github.epsilon.yx ), (eR)this, (String)eR.b(-166, -22016), (Color)new Color(0, eR.c(12457, 2022806001735388090L), 0, eR.c(27958, 1963715438016665137L)), (boolean)true, this::lambda$new$0);
        this.c = eR.y("9QjdJCrmtYKoKt4r", U(java.lang.String boolean ), (eR)this, (String)eR.b(-162, 16419), (boolean)false);
        this.W = eR.y("9QjdJCrmtYKoKt4r", b(java.lang.String int int int int ), (eR)this, (String)eR.b(-165, 12368), (int)2, (int)1, (int)5, (int)1);
        this.P = hi.a("\u00a5", (Object)this, (Object)eR.b(-170, -17336), (int)2, (int)1, (int)eR.c(26077, 7497763091849682652L), (int)1, (long)1094453040828645510L);
        this.O = hi.a("\u00a5", (Object)this, (Object)eR.b(-161, 24277), (int)2, (int)1, (int)eR.c(31934, 6185309618568169358L), (int)1, (long)1094453040828645510L);
        this.D = hi.a("\u00a5", (Object)this, (Object)eR.b(-168, 23015), (double)3.0, (double)1.0, (double)10.0, (double)0.1, (long)1077996338587307774L);
        this.m = new ArrayList<_I>();
    }

    static Minecraft t(Object[] objectArray) {
        eR eR2 = (eR)objectArray[0];
        return hi.a("\u00e9", (Object)eR2, (long)1187940231439308830L);
    }

    /*
     * Exception decompiling
     */
    @yE
    private void X(dR var1_1) {
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

    private boolean lambda$new$0() {
        return (boolean)eR.y("9QjdJCrmtYKoKt4r", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)1245844351718932087L)), (Enum)((Object)hi.a("j", (long)768238996598666167L)));
    }

    static Minecraft D(Object[] objectArray) {
        eR eR2 = (eR)objectArray[0];
        return hi.a("\u00e9", (Object)eR2, (long)1187940231439308830L);
    }

    /*
     * Exception decompiling
     */
    @yE
    private void N(d9 var1_1) {
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

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)522209185622647764L), (long)400728262949485023L);
    }

    private Color u(int n) {
        CallSite callSite = eR.y("9QjdJCrmtYKoKt4r", frac(float ), (float)((float)(hi.a("G", (long)658960450018995719L) + (long)n * k) / 4500.0f));
        CallSite callSite2 = eR.y("9QjdJCrmtYKoKt4r", getHSBColor(float float float ), (float)callSite, (float)0.65f, (float)1.0f);
        return new Color((int)hi.a("\u00a5", (Object)callSite2, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)callSite2, (long)791634218836538619L), (int)hi.a("\u00a5", (Object)callSite2, (long)505295769199362574L), eR.c(31221, 4170184221251207810L));
    }

    public static /* bridge */ /* synthetic */ CallSite y(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFFF5D) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 252;
                case 1 -> 130;
                case 2 -> 232;
                case 3 -> 40;
                case 4 -> 66;
                case 5 -> 91;
                case 6 -> 133;
                case 7 -> 185;
                case 8 -> 69;
                case 9 -> 178;
                case 10 -> 67;
                case 11 -> 107;
                case 12 -> 251;
                case 13 -> 220;
                case 14 -> 165;
                case 15 -> 186;
                case 16 -> 108;
                case 17 -> 233;
                case 18 -> 239;
                case 19 -> 28;
                case 20 -> 183;
                case 21 -> 176;
                case 22 -> 159;
                case 23 -> 96;
                case 24 -> 214;
                case 25 -> 230;
                case 26 -> 244;
                case 27 -> 0;
                case 28 -> 22;
                case 29 -> 97;
                case 30 -> 31;
                case 31 -> 35;
                case 32 -> 142;
                case 33 -> 8;
                case 34 -> 219;
                case 35 -> 122;
                case 36 -> 200;
                case 37 -> 95;
                case 38 -> 52;
                case 39 -> 196;
                case 40 -> 112;
                case 41 -> 180;
                case 42 -> 92;
                case 43 -> 225;
                case 44 -> 102;
                case 45 -> 103;
                case 46 -> 151;
                case 47 -> 61;
                case 48 -> 12;
                case 49 -> 101;
                case 50 -> 38;
                case 51 -> 149;
                case 52 -> 144;
                case 53 -> 48;
                case 54 -> 223;
                case 55 -> 154;
                case 56 -> 191;
                case 57 -> 201;
                case 58 -> 235;
                case 59 -> 221;
                case 60 -> 189;
                case 61 -> 148;
                case 62 -> 246;
                case 63 -> 170;
                case 64 -> 227;
                case 65 -> 143;
                case 66 -> 212;
                case 67 -> 136;
                case 68 -> 64;
                case 69 -> 245;
                case 70 -> 164;
                case 71 -> 172;
                case 72 -> 58;
                case 73 -> 123;
                case 74 -> 204;
                case 75 -> 89;
                case 76 -> 237;
                case 77 -> 207;
                case 78 -> 167;
                case 79 -> 177;
                case 80 -> 109;
                case 81 -> 209;
                case 82 -> 255;
                case 83 -> 83;
                case 84 -> 11;
                case 85 -> 1;
                case 86 -> 72;
                case 87 -> 49;
                case 88 -> 181;
                case 89 -> 88;
                case 90 -> 173;
                case 91 -> 115;
                case 92 -> 169;
                case 93 -> 175;
                case 94 -> 57;
                case 95 -> 171;
                case 96 -> 121;
                case 97 -> 29;
                case 98 -> 36;
                case 99 -> 138;
                case 100 -> 20;
                case 101 -> 113;
                case 102 -> 226;
                case 103 -> 17;
                case 104 -> 18;
                case 105 -> 45;
                case 106 -> 56;
                case 107 -> 117;
                case 108 -> 75;
                case 109 -> 43;
                case 110 -> 213;
                case 111 -> 234;
                case 112 -> 21;
                case 113 -> 203;
                case 114 -> 242;
                case 115 -> 195;
                case 116 -> 81;
                case 117 -> 208;
                case 118 -> 166;
                case 119 -> 236;
                case 120 -> 249;
                case 121 -> 128;
                case 122 -> 90;
                case 123 -> 79;
                case 124 -> 240;
                case 125 -> 210;
                case 126 -> 197;
                case 127 -> 187;
                case 128 -> 24;
                case 129 -> 82;
                case 130 -> 141;
                case 131 -> 59;
                case 132 -> 106;
                case 133 -> 87;
                case 134 -> 243;
                case 135 -> 116;
                case 136 -> 70;
                case 137 -> 174;
                case 138 -> 155;
                case 139 -> 63;
                case 140 -> 163;
                case 141 -> 228;
                case 142 -> 27;
                case 143 -> 2;
                case 144 -> 100;
                case 145 -> 5;
                case 146 -> 76;
                case 147 -> 241;
                case 148 -> 68;
                case 149 -> 152;
                case 150 -> 206;
                case 151 -> 124;
                case 152 -> 147;
                case 153 -> 60;
                case 154 -> 32;
                case 155 -> 73;
                case 156 -> 80;
                case 157 -> 205;
                case 158 -> 54;
                case 159 -> 253;
                case 160 -> 238;
                case 161 -> 9;
                case 162 -> 247;
                case 163 -> 162;
                case 164 -> 146;
                case 165 -> 156;
                case 166 -> 139;
                case 167 -> 184;
                case 168 -> 99;
                case 169 -> 127;
                case 170 -> 125;
                case 171 -> 41;
                case 172 -> 53;
                case 173 -> 179;
                case 174 -> 145;
                case 175 -> 105;
                case 176 -> 157;
                case 177 -> 140;
                case 178 -> 111;
                case 179 -> 224;
                case 180 -> 37;
                case 181 -> 7;
                case 182 -> 211;
                case 183 -> 229;
                case 184 -> 135;
                case 185 -> 62;
                case 186 -> 131;
                case 187 -> 34;
                case 188 -> 19;
                case 189 -> 202;
                case 190 -> 26;
                case 191 -> 86;
                case 192 -> 216;
                case 193 -> 84;
                case 194 -> 23;
                case 195 -> 50;
                case 196 -> 71;
                case 197 -> 118;
                case 198 -> 193;
                case 199 -> 126;
                case 200 -> 55;
                case 201 -> 30;
                case 202 -> 194;
                case 203 -> 161;
                case 204 -> 3;
                case 205 -> 217;
                case 206 -> 33;
                case 207 -> 114;
                case 208 -> 134;
                case 209 -> 15;
                case 210 -> 215;
                case 211 -> 222;
                case 212 -> 231;
                case 213 -> 65;
                case 214 -> 254;
                case 215 -> 42;
                case 216 -> 153;
                case 217 -> 6;
                case 218 -> 120;
                case 219 -> 104;
                case 220 -> 14;
                case 221 -> 44;
                case 222 -> 51;
                case 223 -> 168;
                case 224 -> 119;
                case 225 -> 94;
                case 226 -> 218;
                case 227 -> 85;
                case 228 -> 192;
                case 229 -> 248;
                case 230 -> 25;
                case 231 -> 129;
                case 232 -> 132;
                case 233 -> 160;
                case 234 -> 74;
                case 235 -> 77;
                case 236 -> 110;
                case 237 -> 13;
                case 238 -> 158;
                case 239 -> 78;
                case 240 -> 137;
                case 241 -> 93;
                case 242 -> 190;
                case 243 -> 98;
                case 244 -> 46;
                case 245 -> 199;
                case 246 -> 198;
                case 247 -> 150;
                case 248 -> 47;
                case 249 -> 250;
                case 250 -> 188;
                case 251 -> 182;
                case 252 -> 16;
                case 253 -> 39;
                case 254 -> 4;
                default -> 10;
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
            eR.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B0F;
        if (h[n2] == null) {
            eR.h[n2] = (int)(e[n2] ^ l);
        }
        return h[n2];
    }
}
