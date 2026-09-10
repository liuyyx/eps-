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

final class gJ
extends Enum<gJ> {
    public static final /* enum */ gJ TellyBridge;
    public static final /* enum */ gJ GodBridge;
    private static final gJ[] d;

    public static gJ valueOf(String string) {
        return (gJ)((Object)hi.a("G", gJ.class, (Object)string, (long)703426484721789552L));
    }

    private static gJ[] L(Object[] objectArray) {
        return new gJ[]{hi.a("j", (long)714402968882141522L), hi.a("j", (long)906100654230355526L)};
    }

    public static gJ[] values() {
        return (gJ[])gJ.g("lOqmeIakUaSxJDuq", clone(), (gJ[])hi.a("j", (long)445128599255912130L));
    }

    public static /* bridge */ /* synthetic */ CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = ".Ga\u0005g\u0010\u001f\u000eM\u000b=Mi+l;\t\u0000Lb\"";
            var5_3 = ".Ga\u0005g\u0010\u001f\u000eM\u000b=Mi+l;\t\u0000Lb\"".length();
            var2_4 = 9;
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
            v4 = 13;
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
                            v11 = 37;
                            break;
                        }
                        case 2: {
                            v11 = 8;
                            break;
                        }
                        case 3: {
                            v11 = 74;
                            break;
                        }
                        case 4: {
                            v11 = 24;
                            break;
                        }
                        case 5: {
                            v11 = 116;
                            break;
                        }
                        default: {
                            v11 = 118;
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
        gJ.TellyBridge = new gJ((Object)var0[1], 0);
        gJ.GodBridge = new gJ((Object)var0[0], 1);
        gJ.d = hi.a("G", (Object)new Object[0], (long)509439360536815113L);
    }
}
