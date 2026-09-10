/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.GpuFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$Builder
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class lR {
    public static final VertexFormat s;
    public static final VertexFormat k;
    public static final VertexFormat o;
    public static final VertexFormat Y;
    public static final VertexFormat U;

    public static /* bridge */ /* synthetic */ CallSite h(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private lR() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[17];
                var4_1 = 0;
                var3_2 = "Q+ILI'Fo\u000bL-^AQ+jn(UW\nR0[WI\rFm+H\u0003T\u0012\n\tH*T@O\u001cLb0\u0006B-HFQ+\u0005B+VJO\u0005B+VJO\u0003T\u0012\n\u0006S%^LH=\tH*T@O\u001cLb0\bQ+ILI'Fo\bD*^fR\"Fs\rF(CUU\u001b_C+OKY=\u0005R3_@M";
                var5_3 = "Q+ILI'Fo\u000bL-^AQ+jn(UW\nR0[WI\rFm+H\u0003T\u0012\n\tH*T@O\u001cLb0\u0006B-HFQ+\u0005B+VJO\u0005B+VJO\u0003T\u0012\n\u0006S%^LH=\tH*T@O\u001cLb0\bQ+ILI'Fo\bD*^fR\"Fs\rF(CUU\u001b_C+OKY=\u0005R3_@M".length();
                var2_4 = 8;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 42;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = ":L7%!T\f'X' =I%?D78<";
                    var5_3 = ":L7%!T\f'X' =I%?D78<".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 67;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 43;
                            break;
                        }
                        case 1: {
                            v15 = 110;
                            break;
                        }
                        case 2: {
                            v15 = 16;
                            break;
                        }
                        case 3: {
                            v15 = 15;
                            break;
                        }
                        case 4: {
                            v15 = 23;
                            break;
                        }
                        case 5: {
                            v15 = 100;
                            break;
                        }
                        default: {
                            v15 = 3;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        lR.Y = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)lR.h("nnQNg1nONMs16tI8", builder(int ), (int)0), (Object)var0[0], (Object)hi.a("j", (long)521180705597482036L), (long)835980413001924552L), (Object)var0[6], (Object)hi.a("j", (long)916145123275436280L), (long)835980413001924552L), (Object)var0[10], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (Object)var0[15], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (long)946116107829850153L);
        lR.U = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)lR.h("nnQNg1nONMs16tI8", addAttribute(java.lang.String com.mojang.blaze3d.GpuFormat ), (VertexFormat.Builder)hi.a("G", (int)0, (long)754918776384327067L), (String)var0[11], (GpuFormat)hi.a("j", (long)521180705597482036L)), (Object)var0[7], (Object)hi.a("j", (long)916145123275436280L), (long)835980413001924552L), (Object)var0[4], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (Object)var0[9], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (Object)var0[16], (Object)hi.a("j", (long)824712100235848767L), (long)835980413001924552L), (long)946116107829850153L);
        lR.o = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (int)0, (long)754918776384327067L), (Object)var0[11], (Object)hi.a("j", (long)521180705597482036L), (long)835980413001924552L), (Object)var0[2], (Object)hi.a("j", (long)916145123275436280L), (long)835980413001924552L), (Object)var0[1], (Object)hi.a("j", (long)916145123275436280L), (long)835980413001924552L), (Object)var0[12], (Object)hi.a("j", (long)916145123275436280L), (long)835980413001924552L), (Object)var0[5], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (Object)var0[14], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (long)946116107829850153L);
        lR.k = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)lR.h("nnQNg1nONMs16tI8", builder(int ), (int)0), (Object)var0[11], (Object)hi.a("j", (long)521180705597482036L), (long)835980413001924552L), (Object)var0[7], (Object)hi.a("j", (long)916145123275436280L), (long)835980413001924552L), (Object)var0[8], (Object)hi.a("j", (long)1331175408909319217L), (long)835980413001924552L), (Object)var0[4], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (Object)var0[9], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (long)946116107829850153L);
        lR.s = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (int)0, (long)754918776384327067L), (Object)var0[11], (Object)hi.a("j", (long)521180705597482036L), (long)835980413001924552L), (Object)var0[3], (Object)hi.a("j", (long)1331175408909319217L), (long)835980413001924552L), (Object)var0[7], (Object)hi.a("j", (long)916145123275436280L), (long)835980413001924552L), (Object)var0[13], (Object)hi.a("j", (long)937955445373838660L), (long)835980413001924552L), (long)946116107829850153L);
    }
}
