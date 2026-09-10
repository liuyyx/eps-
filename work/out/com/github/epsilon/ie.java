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

final class ie
extends Enum<ie> {
    public static final /* enum */ ie WATER;
    private static final ie[] b;
    public static final /* enum */ ie NONE;
    public static final /* enum */ ie WATER_SUPPORT;

    private static ie[] H(Object[] objectArray) {
        return new ie[]{hi.a("j", (long)1204877550308200782L), hi.a("j", (long)665861599020836809L), hi.a("j", (long)833875893369649659L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "cs]fu\u0018\u001dabYlu\u0013\u0004z}Gf\u0005cs]fu";
            var5_3 = "cs]fu\u0018\u001dabYlu\u0013\u0004z}Gf\u0005cs]fu".length();
            var2_4 = 13;
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
            v4 = 55;
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
                            v11 = 3;
                            break;
                        }
                        case 1: {
                            v11 = 5;
                            break;
                        }
                        case 2: {
                            v11 = 62;
                            break;
                        }
                        case 3: {
                            v11 = 20;
                            break;
                        }
                        case 4: {
                            v11 = 16;
                            break;
                        }
                        case 5: {
                            v11 = 112;
                            break;
                        }
                        default: {
                            v11 = 121;
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
        ie.NONE = new ie((Object)var0[1], 0);
        ie.WATER = new ie((Object)var0[2], 1);
        ie.WATER_SUPPORT = new ie((Object)var0[0], 2);
        ie.b = hi.a("G", (Object)new Object[0], (long)1196549419633741058L);
    }

    public static /* bridge */ /* synthetic */ CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static ie valueOf(String string) {
        return (ie)((Object)ie.e("YbtH0wg8tQifVAo7", valueOf(java.lang.Class<T> java.lang.String ), ie.class, (String)string));
    }

    public static ie[] values() {
        return (ie[])((Enum)((Object)hi.a("j", (long)856314259756818973L))).clone();
    }
}
