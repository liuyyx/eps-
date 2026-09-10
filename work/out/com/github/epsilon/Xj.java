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

final class Xj
extends Enum<Xj> {
    private static final Xj[] d;
    public static final /* enum */ Xj Silent;
    public static final /* enum */ Xj Inventory;

    public static Xj[] values() {
        return (Xj[])Xj.A("4ABM7ZFlADAvanea", clone(), (Xj[])hi.a("j", (long)444076692030791470L));
    }

    private static Xj[] E(Object[] objectArray) {
        return new Xj[]{hi.a("j", (long)877605356078264994L), hi.a("j", (long)925497335648930051L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = " \u0005 C]o\t:\u0002:C]o\u0005\u0001\u0015";
            var5_3 = " \u0005 C]o\t:\u0002:C]o\u0005\u0001\u0015".length();
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
            v4 = 33;
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
                            v11 = 82;
                            break;
                        }
                        case 1: {
                            v11 = 77;
                            break;
                        }
                        case 2: {
                            v11 = 109;
                            break;
                        }
                        case 3: {
                            v11 = 7;
                            break;
                        }
                        case 4: {
                            v11 = 18;
                            break;
                        }
                        case 5: {
                            v11 = 58;
                            break;
                        }
                        default: {
                            v11 = 75;
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
        Xj.Inventory = new Xj((Object)var0[1], 0);
        Xj.Silent = new Xj((Object)var0[0], 1);
        Xj.d = hi.a("G", (Object)new Object[0], (long)720903718507534848L);
    }

    public static Xj valueOf(String string) {
        return (Xj)((Object)hi.a("G", Xj.class, (Object)string, (long)703426484721789552L));
    }

    public static /* bridge */ /* synthetic */ CallSite A(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }
}
