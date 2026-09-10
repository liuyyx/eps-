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

public final class Oh
extends Enum<Oh> {
    public static final /* enum */ Oh Normal;
    public static final /* enum */ Oh None;
    private static final Oh[] S;
    public static final /* enum */ Oh Silent;

    public static Oh[] values() {
        return (Oh[])Oh.M("nGr3NqAaJhlWOWSi", clone(), (Oh[])hi.a("j", (long)985056872488984620L));
    }

    public static Oh valueOf(String string) {
        return (Oh)((Object)hi.a("G", Oh.class, (Object)string, (long)703426484721789552L));
    }

    public static /* bridge */ /* synthetic */ CallSite M(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "K.~_5u\u0004V(|_\u0006V(`W:m";
            var5_3 = "K.~_5u\u0004V(|_\u0006V(`W:m".length();
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
                            v11 = 100;
                            break;
                        }
                        case 1: {
                            v11 = 59;
                            break;
                        }
                        case 2: {
                            v11 = 110;
                            break;
                        }
                        case 3: {
                            v11 = 70;
                            break;
                        }
                        case 4: {
                            v11 = 39;
                            break;
                        }
                        case 5: {
                            v11 = 125;
                            break;
                        }
                        default: {
                            v11 = 84;
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
        Oh.None = new Oh((Object)var0[1], 0);
        Oh.Normal = new Oh((Object)var0[2], 1);
        Oh.Silent = new Oh((Object)var0[0], 2);
        Oh.S = hi.a("G", (Object)new Object[0], (long)868364640373947385L);
    }

    private static Oh[] c(Object[] objectArray) {
        return new Oh[]{hi.a("j", (long)1156220098276424020L), hi.a("j", (long)548721359716521015L), hi.a("j", (long)445698929824880422L)};
    }
}
