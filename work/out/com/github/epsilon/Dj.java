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

final class Dj
extends Enum<Dj> {
    public static final /* enum */ Dj IDLE;
    public static final /* enum */ Dj CHARGE_2;
    public static final /* enum */ Dj CLEANUP;
    public static final /* enum */ Dj AIRPLACE;
    public static final /* enum */ Dj CHARGE;
    public static final /* enum */ Dj DETONATE;
    public static final /* enum */ Dj PLACE_ANCHOR;
    private static final Dj[] J;
    private static final long[] a;
    private static final Integer[] b;

    public static Dj[] values() {
        return (Dj[])((Enum)((Object)hi.a("j", (long)667084873180319593L))).clone();
    }

    private static Dj[] z(Object[] objectArray) {
        Dj[] djArray = new Dj[Dj.a(22946, 1523206584279285888L)];
        djArray[0] = hi.a("j", (long)798844272817323622L);
        djArray[1] = hi.a("j", (long)716188246683359285L);
        djArray[2] = hi.a("j", (long)565023122836551717L);
        djArray[3] = hi.a("j", (long)480107696177386303L);
        djArray[4] = hi.a("j", (long)1217315693335482606L);
        djArray[5] = hi.a("j", (long)531379312683816015L);
        djArray[Dj.a((int)2029, (long)5638719023403212493L)] = hi.a("j", (long)490642069936450357L);
        return djArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var8 = new String[7];
                        var12_1 = 0;
                        var11_2 = ".bZE\u0002\u0010\u0012_\u0006.bZE\u0002\u0010\u0004$nWR\b)oOX\u000b\u0014\u0019(\f=fZT\u0000\n\f#iSX\u0017";
                        var13_3 = ".bZE\u0002\u0010\u0012_\u0006.bZE\u0002\u0010\u0004$nWR\b)oOX\u000b\u0014\u0019(\f=fZT\u0000\n\f#iSX\u0017".length();
                        var10_4 = 8;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 81;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block21;
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
                            var11_2 = "V\u00193=sntR\u0007T\u001c$,qzg";
                            var13_3 = "V\u00193=sntR\u0007T\u001c$,qzg".length();
                            var10_4 = 8;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 43;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block21;
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
                            break block22;
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
                                    v15 = 60;
                                    break;
                                }
                                case 1: {
                                    v15 = 123;
                                    break;
                                }
                                case 2: {
                                    v15 = 74;
                                    break;
                                }
                                case 3: {
                                    v15 = 70;
                                    break;
                                }
                                case 4: {
                                    v15 = 20;
                                    break;
                                }
                                case 5: {
                                    v15 = 4;
                                    break;
                                }
                                default: {
                                    v15 = 28;
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
                var0_7 = 7444594024545996464L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u0086\"8\u0087\u00e0 \u00d0{T\u00b5g!\u00f5\u0011\u0084\u00efI\u00e9\t\u00d1\u0015\u008f\u008e7";
                var5_11 = "\u0086\"8\u0087\u00e0 \u00d0{T\u00b5g!\u00f5\u0011\u0084\u00efI\u00e9\t\u00d1\u0015\u008f\u008e7".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        Dj.a = var6_8;
        Dj.b = new Integer[3];
        Dj.IDLE = new Dj((Object)var8[2], 0);
        Dj.PLACE_ANCHOR = new Dj((Object)var8[4], 1);
        Dj.CHARGE = new Dj((Object)var8[1], 2);
        Dj.AIRPLACE = new Dj((Object)var8[5], 3);
        Dj.CHARGE_2 = new Dj((Object)var8[0], 4);
        Dj.DETONATE = new Dj((Object)var8[3], 5);
        Dj.CLEANUP = new Dj((Object)var8[6], Dj.a(21368, 6032835796508002905L));
        Dj.J = hi.a("G", (Object)new Object[0], (long)844433335767720493L);
    }

    public static /* bridge */ /* synthetic */ CallSite L(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static Dj valueOf(String string) {
        return (Dj)((Object)Dj.L("JwjF7KajyLcPSqBv", valueOf(java.lang.Class<T> java.lang.String ), Dj.class, (String)string));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1920;
        if (b[n2] == null) {
            Dj.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
