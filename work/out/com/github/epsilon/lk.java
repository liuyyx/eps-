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

final class lk
extends Enum<lk> {
    public static final /* enum */ lk Default;
    private static final lk[] Q;
    public static final /* enum */ lk OsakaChips;

    public static /* bridge */ /* synthetic */ CallSite U(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static lk[] values() {
        return (lk[])lk.U("cG10rVvrUQ29btsV", clone(), (lk[])hi.a("j", (long)1325323516047337859L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = ";\u001d_1(<\u0018\n0\u000bX;<\u0013\u0004\u0016\bJ";
            var5_3 = ";\u001d_1(<\u0018\n0\u000bX;<\u0013\u0004\u0016\bJ".length();
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
                            v11 = 114;
                            break;
                        }
                        case 1: {
                            v11 = 117;
                            break;
                        }
                        case 2: {
                            v11 = 52;
                            break;
                        }
                        case 3: {
                            v11 = 93;
                            break;
                        }
                        case 4: {
                            v11 = 80;
                            break;
                        }
                        case 5: {
                            v11 = 93;
                            break;
                        }
                        default: {
                            v11 = 97;
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
        lk.Default = new lk((Object)var0[0], 0);
        lk.OsakaChips = new lk((Object)var0[1], 1);
        lk.Q = hi.a("G", (Object)new Object[0], (long)973440317988779096L);
    }

    private static lk[] h(Object[] objectArray) {
        return new lk[]{hi.a("j", (long)1090963251299071321L), hi.a("j", (long)1110280528979187261L)};
    }

    public static lk valueOf(String string) {
        return (lk)((Object)hi.a("G", lk.class, (Object)string, (long)703426484721789552L));
    }
}
