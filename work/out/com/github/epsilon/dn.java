/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexConsumer
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.lang.invoke.CallSite;

final class dn
implements VertexConsumer {
    private int P;
    private final float[] B = new float[4];
    private final float[] O = new float[4];
    private final float[] v = new float[4];
    private static final long[] a;
    private static final Integer[] b;

    public VertexConsumer setNormal(float f, float f2, float f3) {
        return this;
    }

    private dn() {
    }

    public VertexConsumer setColor(int n) {
        return this;
    }

    public VertexConsumer setUv2(int n, int n2) {
        return this;
    }

    public VertexConsumer setUv1(int n, int n2) {
        return this;
    }

    public VertexConsumer setLineWidth(float f) {
        return this;
    }

    private void s() {
        hi.a("\u00f2", (Object)this, (int)0, (long)1113887490963442852L);
    }

    public VertexConsumer setColor(int n, int n2, int n3, int n4) {
        return this;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public VertexConsumer addVertex(float var1_1, float var2_2, float var3_3) {
        block10: {
            var4_4 = Dl.t();
            var5_5 /* !! */  = dn.a(29477, 173330108030657455L) * dn.a(8488, 1683835658920522157L) * dn.a(25957, 6961419364798707169L) - dn.a(27046, 5491302819349084454L);
            if (!var4_4) break block10;
lbl4:
            // 2 sources

            while (true) {
                hi.a("\u00e9", (Object)this, (long)625767429637122598L)[hi.a("\u00e9", (Object)this, (long)1113887490963442852L)] = (CallSite)var1_1;
                hi.a("\u00e9", (Object)this, (long)987824746620973241L)[hi.a("\u00e9", (Object)this, (long)1113887490963442852L)] = (CallSite)var2_2;
                hi.a("\u00e9", (Object)this, (long)568777335872749623L)[hi.a("\u00e9", (Object)this, (long)1113887490963442852L)] = (CallSite)var3_3;
                v0 = this;
                hi.a("\u00f2", (Object)v0, (int)(hi.a("\u00e9", (Object)v0, (long)1113887490963442852L) + true), (long)1113887490963442852L);
                v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)1113887490963442852L);
                v2 = 4;
                if (var4_4) ** GOTO lbl52
                if (v1 /* !! */  != v2) ** GOTO lbl50
                ** GOTO lbl54
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                v3 = new Object[12];
                v3[11] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)568777335872749623L)[3]);
                v3[10] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)987824746620973241L)[3]);
                v3[9] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)625767429637122598L)[3]);
                v3[8] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)568777335872749623L)[2]);
                v3[7] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)987824746620973241L)[2]);
                v3[6] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)625767429637122598L)[2]);
                v3[5] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)568777335872749623L)[1]);
                v3[4] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)987824746620973241L)[1]);
                v3[3] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)625767429637122598L)[1]);
                v3[2] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)568777335872749623L)[0]);
                v3[1] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)987824746620973241L)[0]);
                v3[0] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)625767429637122598L)[0]);
                hi.a("G", (Object)v3, (long)973822257038090802L);
                hi.a("\u00f2", (Object)this, (int)0, (long)1113887490963442852L);
                if (var4_4) lbl-1000:
                // 2 sources

                {
                    return this;
                }
                ** GOTO lbl56
                break;
            }
        }
        while (true) {
            switch (var5_5 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1742491985: {
                    ** continue;
                }
                case 1742491987: {
                    ** continue;
                }
                case 1742491988: 
            }
            hi.a("G", (boolean)false, (long)1096505374926936287L);
            var5_5 /* !! */  = (int)(hi.a("G", (int)(dn.a(30662, 6278369422325688128L) / dn.a(32257, 1013220136132619928L)), (int)dn.a(13999, 6046225894197978663L), (long)834203424483934088L) - dn.a(5059, 2667557841952031556L) + dn.a(29062, 5465894585875210500L));
            if (!var4_4) continue;
lbl50:
            // 2 sources

            v1 /* !! */  = (CallSite)(dn.a(16500, 4754279595461808377L) * dn.a(19396, 306325948691749709L));
            v2 = dn.a(32016, 8394114517888150929L);
lbl52:
            // 2 sources

            var5_5 /* !! */  = (int)(v1 /* !! */  + v2);
            if (!var4_4) continue;
lbl54:
            // 2 sources

            var5_5 /* !! */  = dn.a(15082, 3671990132185852516L) ^ dn.a(21422, 649028946348344109L) ^ dn.a(31187, 543420115387623775L);
            if (!var4_4) continue;
lbl56:
            // 2 sources

            var5_5 /* !! */  = dn.a(27530, 3382992811346279173L) * dn.a(6134, 2855552247711647598L) + dn.a(7557, 4138061393627434254L);
        }
    }

    public VertexConsumer setUv(float f, float f2) {
        return this;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2097377991304273390L;
                var6_1 = new long[18];
                var3_2 = 0;
                var4_3 = "]\u00c3\u00d0\b4\u00fc\u00bc7\u00ce\u00d1f8*4\u0089F\u00b5U>\u00e2w\u00f6\u00e0d(i\u0092\u00b19\u008bv\u0019~\u00e0\u00e4\u0099\u009a\u00d3H\u00df\u00969\u00cawN\u0019\u009aE\u00dd\u00faz\u00eeb\u009eap\u0018\u00bc\u00ab \u00a1\u0084\u00b1\u00b9w\u0089<\u0001\u0088\f\u000f\u000f\u00dd\u0011\u0081\u009c\u00e2\u00cc\u0096\u0086\u008b\u00f5\u00a0\u0087\t\u00c0\u008f5Itm]\u00b2$\u00e5\u0006\u0002\u00b5^k\u001f>zl\u009cB\u00a7\u0080\u00d2\u00fb\u0094T\u00f2-1\u000f\u0016\u0096\u00e0N\u009a\u00f7)\u0098l\u0090\u00f9r";
                var5_4 = "]\u00c3\u00d0\b4\u00fc\u00bc7\u00ce\u00d1f8*4\u0089F\u00b5U>\u00e2w\u00f6\u00e0d(i\u0092\u00b19\u008bv\u0019~\u00e0\u00e4\u0099\u009a\u00d3H\u00df\u00969\u00cawN\u0019\u009aE\u00dd\u00faz\u00eeb\u009eap\u0018\u00bc\u00ab \u00a1\u0084\u00b1\u00b9w\u0089<\u0001\u0088\f\u000f\u000f\u00dd\u0011\u0081\u009c\u00e2\u00cc\u0096\u0086\u008b\u00f5\u00a0\u0087\t\u00c0\u008f5Itm]\u00b2$\u00e5\u0006\u0002\u00b5^k\u001f>zl\u009cB\u00a7\u0080\u00d2\u00fb\u0094T\u00f2-1\u000f\u0016\u0096\u00e0N\u009a\u00f7)\u0098l\u0090\u00f9r".length();
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
                    var4_3 = "\u001e\u0002\u0003m5\u001e\u00d5eZ\u0019\u00f7\u0013\u00c6\u001c\u00f3f";
                    var5_4 = "\u001e\u0002\u0003m5\u001e\u00d5eZ\u0019\u00f7\u0013\u00c6\u001c\u00f3f".length();
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
        dn.a = var6_1;
        dn.b = new Integer[18];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5088;
        if (b[n2] == null) {
            dn.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
