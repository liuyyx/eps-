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

final class gx
extends Enum<gx> {
    public static final /* enum */ gx PunchBow;
    public static final /* enum */ gx PowerBow;
    public static final /* enum */ gx Crossbow;
    private static final gx[] s;

    private static gx[] k() {
        return new gx[]{hi.a("j", (long)1000392985961835910L), hi.a("j", (long)378626109586840057L), hi.a("j", (long)659940523103047483L)};
    }

    public static gx[] values() {
        return (gx[])((Enum)((Object)hi.a("j", (long)1066062379890162528L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "x\\\rIVX\u0018_\bk[\fYMx\u0018_\bxF\u0014OLX\u0018_";
            var5_3 = "x\\\rIVX\u0018_\bk[\fYMx\u0018_\bxF\u0014OLX\u0018_".length();
            var2_4 = 8;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 103;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 79;
                            break;
                        }
                        case 1: {
                            v11 = 78;
                            break;
                        }
                        case 2: {
                            v11 = 4;
                            break;
                        }
                        case 3: {
                            v11 = 77;
                            break;
                        }
                        case 4: {
                            v11 = 89;
                            break;
                        }
                        case 5: {
                            v11 = 125;
                            break;
                        }
                        default: {
                            v11 = 16;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
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
            } while (v6 > var6_6);
            ** while (true)
        }
        gx.Crossbow = new gx((Object)var0[1], 0);
        gx.PowerBow = new gx((Object)var0[2], 1);
        gx.PunchBow = new gx((Object)var0[0], 2);
        gx.s = gx.w("pd2gI21ocRJe2AWN", k());
    }

    public static /* bridge */ /* synthetic */ CallSite w(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static gx valueOf(String string) {
        return (gx)((Object)hi.a("G", gx.class, (Object)string, (long)703426484721789552L));
    }
}
