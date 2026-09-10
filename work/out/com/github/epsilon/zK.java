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

final class zK
extends Enum<zK> {
    public static final /* enum */ zK Modern;
    private static final zK[] H;
    public static final /* enum */ zK Akrien;

    public static zK valueOf(String string) {
        return (zK)((Object)hi.a("G", zK.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "d\n\u0016bWb\u0006h\u000e\u0000n@b";
            var5_3 = "d\n\u0016bWb\u0006h\u000e\u0000n@b".length();
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
            v4 = 89;
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
                            v11 = 112;
                            break;
                        }
                        case 1: {
                            v11 = 60;
                            break;
                        }
                        case 2: {
                            v11 = 43;
                            break;
                        }
                        case 3: {
                            v11 = 94;
                            break;
                        }
                        case 4: {
                            v11 = 124;
                            break;
                        }
                        case 5: {
                            v11 = 85;
                            break;
                        }
                        default: {
                            v11 = 93;
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
        zK.Modern = new zK((Object)var0[0], 0);
        zK.Akrien = new zK((Object)var0[1], 1);
        zK.H = zK.S("zhr3wzqygefxay6h", s());
    }

    private static zK[] s() {
        return new zK[]{hi.a("j", (long)1011131828181797283L), hi.a("j", (long)1081054146114906732L)};
    }

    public static zK[] values() {
        return (zK[])((Enum)((Object)hi.a("j", (long)482356023153620086L))).clone();
    }

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
