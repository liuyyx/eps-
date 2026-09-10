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

public class np {
    private static final long[] a;
    private static final Long[] b;

    public static void d(long l, float f, float f2, float f3, float f4, int n) {
        np.G("SqYvdtIqF4whprjP", memPutFloat(long float ), (long)l, (float)f);
        hi.a("G", (long)(l + np.a(8623, 9188318693016350403L)), (float)f2, (long)642844282938217292L);
        hi.a("G", (long)(l + np.a(18463, 5612393103629567863L)), (float)0.0f, (long)642844282938217292L);
        np.G("SqYvdtIqF4whprjP", memPutFloat(long float ), (long)(l + np.a(3810, 1523061894076039560L)), (float)f3);
        np.G("SqYvdtIqF4whprjP", memPutFloat(long float ), (long)(l + np.a(13641, 6054721315031071266L)), (float)f4);
        hi.a("G", (long)(l + np.a(24451, 3310007237480468714L)), (int)n, (long)1265251801655364963L);
    }

    public static /* bridge */ /* synthetic */ CallSite G(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        block8: {
            block7: {
                var0 = 2775577289115062268L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "kg\u00ed\u001c}\u00e9\b\u0083\u000bkV\u00dd%\u00a6\u009f\u00023\u00a7\u00d4o\u00a3\u000eNx";
                var5_4 = "kg\u00ed\u001c}\u00e9\b\u0083\u000bkV\u00dd%\u00a6\u009f\u00023\u00a7\u00d4o\u00a3\u000eNx".length();
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
                    var4_3 = "r\u0082d\"P1\u00f5\u00ceY\u0007\u00a3\u00fd\u00d8\na;";
                    var5_4 = "r\u0082d\"P1\u00f5\u00ceY\u0007\u00a3\u00fd\u00d8\na;".length();
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
        np.a = var6_1;
        np.b = new Long[5];
    }

    private static long a(int n, long l) {
        int n2 = (n ^ (int)l ^ 0xF68) & Short.MAX_VALUE;
        if (b[n2] == null) {
            np.b[n2] = a[n2] ^ l;
        }
        return b[n2];
    }
}
