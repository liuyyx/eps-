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

public final class uC
extends Enum<uC> {
    public static final /* enum */ uC Silent;
    public static final /* enum */ uC InvSwitch;
    private static final uC[] j;

    public static uC[] values() {
        return (uC[])((Enum)((Object)hi.a("j", (long)410309872430159375L))).clone();
    }

    public static uC valueOf(String string) {
        return (uC)((Object)uC.i("6DR18jtgkOGIcYLA", valueOf(java.lang.Class<T> java.lang.String ), uC.class, (String)string));
    }

    public static /* bridge */ /* synthetic */ CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static uC[] h(Object[] objectArray) {
        return new uC[]{hi.a("j", (long)784392876950468169L), hi.a("j", (long)702466191566775534L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "X\u007f}KXt\tBxg}AiUh~";
            var5_3 = "X\u007f}KXt\tBxg}AiUh~".length();
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
            v4 = 74;
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
                            v11 = 65;
                            break;
                        }
                        case 1: {
                            v11 = 92;
                            break;
                        }
                        case 2: {
                            v11 = 91;
                            break;
                        }
                        case 3: {
                            v11 = 100;
                            break;
                        }
                        case 4: {
                            v11 = 124;
                            break;
                        }
                        case 5: {
                            v11 = 74;
                            break;
                        }
                        default: {
                            v11 = 107;
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
        uC.Silent = new uC((Object)var0[0], 0);
        uC.InvSwitch = new uC((Object)var0[1], 1);
        uC.j = hi.a("G", (Object)new Object[0], (long)679323383311954625L);
    }
}
