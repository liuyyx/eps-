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

public final class O2
extends Enum<O2> {
    public static final /* enum */ O2 Columbina;
    public static final /* enum */ O2 Classic;
    private static final O2[] L;

    public static /* bridge */ /* synthetic */ CallSite h(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static O2[] values() {
        return (O2[])((Enum)((Object)hi.a("j", (long)431196477440692290L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\t9\u000ev\u0017i\u0018\t\t:\u0003p\tb\u0012$4";
            var5_3 = "\t9\u000ev\u0017i\u0018\t\t:\u0003p\tb\u0012$4".length();
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
            v4 = 8;
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
                            v11 = 66;
                            break;
                        }
                        case 1: {
                            v11 = 93;
                            break;
                        }
                        case 2: {
                            v11 = 103;
                            break;
                        }
                        case 3: {
                            v11 = 13;
                            break;
                        }
                        case 4: {
                            v11 = 108;
                            break;
                        }
                        case 5: {
                            v11 = 8;
                            break;
                        }
                        default: {
                            v11 = 115;
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
        O2.Columbina = new O2((Object)var0[1], 0);
        O2.Classic = new O2((Object)var0[0], 1);
        O2.L = O2.h("DrLBYAB77nyeLHi7", X());
    }

    private static O2[] X() {
        return new O2[]{hi.a("j", (long)849367965469748573L), hi.a("j", (long)397342608046074113L)};
    }

    public static O2 valueOf(String string) {
        return (O2)((Object)hi.a("G", O2.class, (Object)string, (long)703426484721789552L));
    }
}
