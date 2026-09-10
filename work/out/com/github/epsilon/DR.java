/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

final class DR
extends Enum<DR> {
    public static final /* enum */ DR ALPHA;
    public static final /* enum */ DR RED;
    public static final /* enum */ DR BLUE;
    public static final /* enum */ DR GREEN;
    private final Color p;
    private final String o;
    private static final DR[] J;

    public static DR[] values() {
        return (DR[])((Enum)((Object)hi.a("j", (long)1029614977463085486L))).clone();
    }

    private DR(String string2, Color color) {
        this.o = string2;
        this.p = color;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[4];
                        var12_1 = 0;
                        var11_2 = ",as\u00032\u0004)\u007fc\u0003";
                        var13_3 = ",as\u00032\u0004)\u007fc\u0003".length();
                        var10_4 = 5;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 118;
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
                            var11_2 = "H\u0007\u0003\u0005[\u000e\u0017\u007fL";
                            var13_3 = "H\u0007\u0003\u0005[\u000e\u0017\u007fL".length();
                            var10_4 = 3;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 7;
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
                                    v15 = 29;
                                    break;
                                }
                                case 1: {
                                    v15 = 69;
                                    break;
                                }
                                case 2: {
                                    v15 = 64;
                                    break;
                                }
                                case 3: {
                                    v15 = 48;
                                    break;
                                }
                                case 4: {
                                    v15 = 10;
                                    break;
                                }
                                case 5: {
                                    v15 = 85;
                                    break;
                                }
                                default: {
                                    v15 = 64;
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
                var1_7 = 7162042052928625646L;
                var0_8 = new long[9];
                var4_9 = 0;
                var5_10 = "\u0013\u00a5\u00bb\u00fa\u000f8[\u0084\u00e1\u0083|\u0017\u000f8[\u00be\u00ed\u008e\u00d9\u009f\u000f8[K\u00bdg\u001b\u008e\u000f8[U\u00f9\u00e4\u0085\u00b9\u000f8[\u00bd\u0085H\u00b0j\u000f8[\u00acC\u00de\u00bcp\u000f8[\u0001";
                var6_11 = "\u0013\u00a5\u00bb\u00fa\u000f8[\u0084\u00e1\u0083|\u0017\u000f8[\u00be\u00ed\u008e\u00d9\u009f\u000f8[K\u00bdg\u001b\u008e\u000f8[U\u00f9\u00e4\u0085\u00b9\u000f8[\u00bd\u0085H\u00b0j\u000f8[\u00acC\u00de\u00bcp\u000f8[\u0001".length();
                var3_12 = 0;
                while (true) {
                    var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                    v17 = var0_8;
                    v18 = var4_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var3_12 < var6_11) ** continue;
                    var5_10 = "U\u00e6#\u001a\u000f8[\u0088\u0015c\u00c2W\u000f8[\u001b";
                    var6_11 = "U\u00e6#\u001a\u000f8[\u0088\u0015c\u00c2W\u000f8[\u001b".length();
                    var3_12 = 0;
                    while (true) {
                        var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                        v17 = var0_8;
                        v18 = var4_9++;
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
                    if (var3_12 < var6_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var1_7;
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
        DR.RED = new DR((Object)var8[2], 0, (Object)"R", (Object)new Color((int)var0_8[6], (int)var0_8[4], (int)var0_8[1]));
        DR.GREEN = new DR((Object)var8[0], 1, (Object)"G", (Object)new Color((int)var0_8[7], (int)var0_8[3], (int)var0_8[0]));
        DR.BLUE = new DR((Object)var8[1], 2, (Object)"B", (Object)new Color((int)var0_8[5], (int)var0_8[2], (int)var0_8[8]));
        DR.ALPHA = new DR((Object)var8[3], 3, (Object)"A", (Object)hi.a("j", (long)501800615308669146L));
        DR.J = hi.a("G", (Object)new Object[0], (long)550988623598689117L);
    }

    public static DR valueOf(String string) {
        return (DR)((Object)DR.Y("nYEev7RsAv75rZQn", valueOf(java.lang.Class<T> java.lang.String ), DR.class, (String)string));
    }

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

    private static DR[] m(Object[] objectArray) {
        return new DR[]{hi.a("j", (long)603938908991161154L), hi.a("j", (long)943120094513612362L), hi.a("j", (long)1049507690467797679L), hi.a("j", (long)1067279844671967505L)};
    }
}
