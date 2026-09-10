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

public final class z8
extends Enum<z8> {
    private static final z8[] E;
    public static final /* enum */ z8 Top;
    public static final /* enum */ z8 Bottom;
    public static final /* enum */ z8 Center;

    public static /* bridge */ /* synthetic */ CallSite C(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static z8[] n() {
        return new z8[]{hi.a("j", (long)874559804203434005L), hi.a("j", (long)635693608394781037L), hi.a("j", (long)454792706565658633L)};
    }

    public static z8 valueOf(String string) {
        return (z8)((Object)hi.a("G", z8.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "7\\\u0003},\u001f\u00066V\u0019}&\u0000\u0003!\\\u0007";
            var5_3 = "7\\\u0003},\u001f\u00066V\u0019}&\u0000\u0003!\\\u0007".length();
            var2_4 = 6;
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
            v4 = 59;
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
                            v11 = 78;
                            break;
                        }
                        case 1: {
                            v11 = 8;
                            break;
                        }
                        case 2: {
                            v11 = 76;
                            break;
                        }
                        case 3: {
                            v11 = 50;
                            break;
                        }
                        case 4: {
                            v11 = 120;
                            break;
                        }
                        case 5: {
                            v11 = 73;
                            break;
                        }
                        default: {
                            v11 = 4;
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
        z8.Top = new z8((Object)var0[2], 0);
        z8.Center = new z8((Object)var0[1], 1);
        z8.Bottom = new z8((Object)var0[0], 2);
        z8.E = z8.C("nW1Xgr23rQ2su4st", n());
    }

    public static z8[] values() {
        return (z8[])((Enum)((Object)hi.a("j", (long)749495685995148166L))).clone();
    }
}
