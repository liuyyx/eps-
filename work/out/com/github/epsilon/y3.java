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

public final class y3
extends Enum<y3> {
    public static final /* enum */ y3 TEXT;
    public static final /* enum */ y3 TEXTURE;
    private static final /* synthetic */ y3[] p;
    public static final /* enum */ y3 ROUND_RECT_OUTLINE;
    public static final /* enum */ y3 RECT;
    public static final /* enum */ y3 ROUND_RECT;
    public static final /* enum */ y3 BLUR_TEXT;
    public static final /* enum */ y3 SHADOW;
    public static final /* enum */ y3 TRIANGLE;
    public static final /* enum */ y3 GLITCH_TEXT;
    public static final /* enum */ y3 ARC;
    private static final long[] a;
    private static final Integer[] b;

    public static /* bridge */ /* synthetic */ CallSite X(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[10];
                        var12_1 = 0;
                        var11_2 = ".\u000f^LO\u0015s9\u0003_]D\u001fu0\tEG\u0003=\u0012H\u0006/\bJFD\u001d\t>\f^PT\u001ed$\u0014\u0004.\u0005HV\u0004(\u0005SV\n.\u000f^LO\u0015s9\u0003_\u000b;\fBVH\u0002~(\u0005SV";
                        var13_3 = ".\u000f^LO\u0015s9\u0003_]D\u001fu0\tEG\u0003=\u0012H\u0006/\bJFD\u001d\t>\f^PT\u001ed$\u0014\u0004.\u0005HV\u0004(\u0005SV\n.\u000f^LO\u0015s9\u0003_\u000b;\fBVH\u0002~(\u0005SV".length();
                        var10_4 = 18;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 81;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "\n'qt|:F\b\n0`ag/O\u001b";
                            var13_3 = "\n'qt|:F\b\n0`ag/O\u001b".length();
                            var10_4 = 7;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 115;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
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
                                    v15 = 45;
                                    break;
                                }
                                case 1: {
                                    v15 = 17;
                                    break;
                                }
                                case 2: {
                                    v15 = 90;
                                    break;
                                }
                                case 3: {
                                    v15 = 83;
                                    break;
                                }
                                case 4: {
                                    v15 = 90;
                                    break;
                                }
                                case 5: {
                                    v15 = 27;
                                    break;
                                }
                                default: {
                                    v15 = 112;
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
                var0_7 = 7443412584744659621L;
                var6_8 = new long[9];
                var3_9 = 0;
                var4_10 = "\u00f9\u00e6\u00bc\u00b8]\u0086\u0001O\u0088r\u00b4U\u00c8\u009ex^\u0098\u0002W\u0083\"\u00afj\u00dd\u00a6\u00f2`D\u00a4%4J\u000e\u008b{\u0094\u00a0b\u00e5f9\u008eN\u0014\u00d9Rm\u00c3\r\u00ee\u00d4b\u0001\u00d7\u00ad\u008c";
                var5_11 = "\u00f9\u00e6\u00bc\u00b8]\u0086\u0001O\u0088r\u00b4U\u00c8\u009ex^\u0098\u0002W\u0083\"\u00afj\u00dd\u00a6\u00f2`D\u00a4%4J\u000e\u008b{\u0094\u00a0b\u00e5f9\u008eN\u0014\u00d9Rm\u00c3\r\u00ee\u00d4b\u0001\u00d7\u00ad\u008c".length();
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
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u007f\u008b\u00c8\u00d7\u008f:\u0099\u0005s\u00a2U}\u00ce\u00e5x\u009b";
                    var5_11 = "\u007f\u008b\u00c8\u00d7\u008f:\u0099\u0005s\u00a2U}\u00ce\u00e5x\u009b".length();
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
lbl123:
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
lbl134:
                // 1 sources

                ** continue;
            }
        }
        y3.a = var6_8;
        y3.b = new Integer[9];
        y3.SHADOW = new y3((Object)var8[2], 0);
        y3.ROUND_RECT = new y3((Object)var8[6], 1);
        y3.ROUND_RECT_OUTLINE = new y3((Object)var8[0], 2);
        y3.RECT = new y3((Object)var8[4], 3);
        y3.TRIANGLE = new y3((Object)var8[9], 4);
        y3.ARC = new y3((Object)var8[1], 5);
        y3.TEXTURE = new y3((Object)var8[8], y3.a(30640, 5781800480256994284L));
        y3.BLUR_TEXT = new y3((Object)var8[3], y3.a(23412, 8323615524482647854L));
        y3.GLITCH_TEXT = new y3((Object)var8[7], y3.a(7214, 3953687941415420016L));
        y3.TEXT = new y3((Object)var8[5], y3.a(17081, 478311690199736038L));
        y3.p = y3.X("edSLGoiOy6If22ca", u());
    }

    public static y3 valueOf(String string) {
        return (y3)((Object)hi.a("G", y3.class, (Object)string, (long)703426484721789552L));
    }

    public static y3[] values() {
        return (y3[])((Enum)((Object)hi.a("j", (long)428770528267614774L))).clone();
    }

    private static /* synthetic */ y3[] u() {
        y3[] y3Array = new y3[y3.a(6965, 8099525853705324396L)];
        y3Array[0] = hi.a("j", (long)1073215605179372184L);
        y3Array[1] = hi.a("j", (long)1247478983906742691L);
        y3Array[2] = hi.a("j", (long)904093914666734581L);
        y3Array[3] = hi.a("j", (long)866644956285896161L);
        y3Array[4] = hi.a("j", (long)767575397789638518L);
        y3Array[5] = hi.a("j", (long)686586743204655656L);
        y3Array[y3.a((int)28669, (long)7804891332519539622L)] = hi.a("j", (long)1260416271742983282L);
        y3Array[y3.a((int)3693, (long)2389394300145619513L)] = hi.a("j", (long)555470498943839798L);
        y3Array[y3.a((int)3758, (long)2394729972485772019L)] = hi.a("j", (long)490925869034129166L);
        y3Array[y3.a((int)5010, (long)5083431158960771018L)] = hi.a("j", (long)1130919292852837508L);
        return y3Array;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5C5C;
        if (b[n2] == null) {
            y3.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
