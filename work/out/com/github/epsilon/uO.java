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

public final class uO
extends Enum<uO> {
    public static final /* enum */ uO RANDOM;
    public static final /* enum */ uO SEQUENTIAL;
    private static final uO[] I;

    private static uO[] p(Object[] objectArray) {
        return new uO[]{hi.a("j", (long)579557432986525097L), hi.a("j", (long)507348656200983237L)};
    }

    public static uO[] values() {
        return (uO[])((Enum)((Object)hi.a("j", (long)859818300342242775L))).clone();
    }

    public static uO valueOf(String string) {
        return (uO)((Object)uO.m("nO7ayjp9X1lYSvBZ", valueOf(java.lang.Class<T> java.lang.String ), uO.class, (String)string));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "Z$\u0011w\u001e2\n[ \u000ef\u00141OA$\u0013";
            var5_3 = "Z$\u0011w\u001e2\n[ \u000ef\u00141OA$\u0013".length();
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
            v4 = 111;
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
                            v11 = 103;
                            break;
                        }
                        case 1: {
                            v11 = 10;
                            break;
                        }
                        case 2: {
                            v11 = 48;
                            break;
                        }
                        case 3: {
                            v11 = 92;
                            break;
                        }
                        case 4: {
                            v11 = 62;
                            break;
                        }
                        case 5: {
                            v11 = 16;
                            break;
                        }
                        default: {
                            v11 = 116;
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
        uO.SEQUENTIAL = new uO((Object)var0[1], 0);
        uO.RANDOM = new uO((Object)var0[0], 1);
        uO.I = hi.a("G", (Object)new Object[0], (long)1317005359035562401L);
    }

    public static /* bridge */ /* synthetic */ CallSite m(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
