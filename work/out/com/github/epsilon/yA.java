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

final class yA
extends Enum<yA> {
    private static final yA[] j;
    public static final /* enum */ yA Fade;
    public static final /* enum */ yA Sexy;
    public static final /* enum */ yA Astolfo;

    public static yA valueOf(String string) {
        return (yA)((Object)hi.a("G", yA.class, (Object)string, (long)703426484721789552L));
    }

    public static /* bridge */ /* synthetic */ CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            var3_2 = "@UT3I=\u0000\u0004GGD9\u0004RCX%";
            var5_3 = "@UT3I=\u0000\u0004GGD9\u0004RCX%".length();
            var2_4 = 7;
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
            v4 = 57;
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
                            v11 = 56;
                            break;
                        }
                        case 1: {
                            v11 = 31;
                            break;
                        }
                        case 2: {
                            v11 = 25;
                            break;
                        }
                        case 3: {
                            v11 = 101;
                            break;
                        }
                        case 4: {
                            v11 = 28;
                            break;
                        }
                        case 5: {
                            v11 = 98;
                            break;
                        }
                        default: {
                            v11 = 86;
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
        yA.Astolfo = new yA((Object)var0[0], 0);
        yA.Sexy = new yA((Object)var0[2], 1);
        yA.Fade = new yA((Object)var0[1], 2);
        yA.j = hi.a("G", (Object)new Object[0], (long)1103088659567449247L);
    }

    public static yA[] values() {
        return (yA[])yA.c("AAk4A8DP2Vht7fZ6", clone(), (yA[])hi.a("j", (long)905061270982202201L));
    }

    private static yA[] U(Object[] objectArray) {
        return new yA[]{hi.a("j", (long)581459497336039857L), hi.a("j", (long)944908528885752368L), hi.a("j", (long)944743921845417396L)};
    }
}
