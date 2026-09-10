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

public final class X2
extends Enum<X2> {
    private static final X2[] C;
    public static final /* enum */ X2 Custom;
    public static final /* enum */ X2 Default;

    public static X2[] values() {
        return (X2[])((Enum)((Object)hi.a("j", (long)592715538708830897L))).clone();
    }

    public static /* bridge */ /* synthetic */ CallSite R(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static X2 valueOf(String string) {
        return (X2)((Object)hi.a("G", X2.class, (Object)string, (long)703426484721789552L));
    }

    private static X2[] s() {
        return new X2[]{hi.a("j", (long)542668645859404350L), hi.a("j", (long)1233170613900815070L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "b<'P\u001a\u0003\u0007e,2E\u0000\u0002W";
            var5_3 = "b<'P\u001a\u0003\u0007e,2E\u0000\u0002W".length();
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
            v4 = 124;
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
                            v11 = 93;
                            break;
                        }
                        case 1: {
                            v11 = 53;
                            break;
                        }
                        case 2: {
                            v11 = 40;
                            break;
                        }
                        case 3: {
                            v11 = 88;
                            break;
                        }
                        case 4: {
                            v11 = 9;
                            break;
                        }
                        case 5: {
                            v11 = 18;
                            break;
                        }
                        default: {
                            v11 = 95;
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
        X2.Default = new X2((Object)var0[1], 0);
        X2.Custom = new X2((Object)var0[0], 1);
        X2.C = X2.R("i497iIbFVNDE0yoL", s());
    }
}
