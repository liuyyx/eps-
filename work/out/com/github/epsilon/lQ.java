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

final class lQ
extends Enum<lQ> {
    public static final /* enum */ lQ IDLE;
    public static final /* enum */ lQ PLACE_SHIELD;
    public static final /* enum */ lQ CHARGE;
    public static final /* enum */ lQ DETONATE;
    public static final /* enum */ lQ PLACE_ANCHOR;
    public static final /* enum */ lQ WAIT_ANCHOR;
    public static final /* enum */ lQ WAIT_SHIELD;
    private static final lQ[] X;
    private static final long[] a;
    private static final Integer[] b;

    public static /* bridge */ /* synthetic */ CallSite O(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static lQ valueOf(String string) {
        return (lQ)((Object)hi.a("G", lQ.class, (Object)string, (long)703426484721789552L));
    }

    public static lQ[] values() {
        return (lQ[])((Enum)((Object)hi.a("j", (long)686199424776319916L))).clone();
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
                        var11_2 = "n\u0001)AE\r\u0003p\u000e MR\fn\u0001)AE\r\u0011v\u0004-ND\u000bi\f!V_\u0013\f}\u0005'P\bz\b<MN\u0013\u0016{\u0006}\u0005)PG\u0017";
                        var13_3 = "n\u0001)AE\r\u0003p\u000e MR\fn\u0001)AE\r\u0011v\u0004-ND\u000bi\f!V_\u0013\f}\u0005'P\bz\b<MN\u0013\u0016{\u0006}\u0005)PG\u0017".length();
                        var10_4 = 12;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 74;
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
                            var11_2 = "B<\u0011r\u000b\\9\u0014cj4?B=\u0011s";
                            var13_3 = "B<\u0011r\u000b\\9\u0014cj4?B=\u0011s".length();
                            var10_4 = 4;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 127;
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
                                    v15 = 116;
                                    break;
                                }
                                case 1: {
                                    v15 = 7;
                                    break;
                                }
                                case 2: {
                                    v15 = 34;
                                    break;
                                }
                                case 3: {
                                    v15 = 72;
                                    break;
                                }
                                case 4: {
                                    v15 = 74;
                                    break;
                                }
                                case 5: {
                                    v15 = 24;
                                    break;
                                }
                                default: {
                                    v15 = 8;
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
                var0_7 = 8878774717375382965L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u0086\u00ae\u00fc|\f#\u001d\u00cf\u009a\u0006\u0087\u00b0\u00ffPF\u00be(\r\u00804&\u00bb\u008b:";
                var5_11 = "\u0086\u00ae\u00fc|\f#\u001d\u00cf\u009a\u0006\u0087\u00b0\u00ffPF\u00be(\r\u00804&\u00bb\u008b:".length();
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
        lQ.a = var6_8;
        lQ.b = new Integer[3];
        lQ.IDLE = new lQ((Object)var8[5], 0);
        lQ.PLACE_ANCHOR = new lQ((Object)var8[0], 1);
        lQ.PLACE_SHIELD = new lQ((Object)var8[1], 2);
        lQ.CHARGE = new lQ((Object)var8[4], 3);
        lQ.DETONATE = new lQ((Object)var8[3], 4);
        lQ.WAIT_SHIELD = new lQ((Object)var8[6], 5);
        lQ.WAIT_ANCHOR = new lQ((Object)var8[2], lQ.a(30988, 3942709374561717897L));
        lQ.X = lQ.O("k8v2yjzg1z8GFyej", u());
    }

    private static lQ[] u() {
        lQ[] lQArray = new lQ[lQ.a(28666, 1673666731069020285L)];
        lQArray[0] = hi.a("j", (long)715200401487300967L);
        lQArray[1] = hi.a("j", (long)543323036054747572L);
        lQArray[2] = hi.a("j", (long)684017521508408752L);
        lQArray[3] = hi.a("j", (long)563222872451169543L);
        lQArray[4] = hi.a("j", (long)1136539307711161120L);
        lQArray[5] = hi.a("j", (long)916496125067267607L);
        lQArray[lQ.a((int)13451, (long)3501277361539728141L)] = hi.a("j", (long)717027022986904685L);
        return lQArray;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7787;
        if (b[n2] == null) {
            lQ.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
