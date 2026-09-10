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

final class i0
extends Enum<i0> {
    public static final /* enum */ i0 Grim;
    public static final /* enum */ i0 Strafe;
    private static final i0[] Z;
    public static final /* enum */ i0 StrafeStrict;

    private static i0[] l(Object[] objectArray) {
        return new i0[]{hi.a("j", (long)1322590767973445544L), hi.a("j", (long)1102871904960232143L), hi.a("j", (long)667310628638969805L)};
    }

    public static /* bridge */ /* synthetic */ CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            var3_2 = "\u001cdQ\u001fjb\u0004\bbJ\u0013\f\u001cdQ\u001fjbO;bJ\u001dx";
            var5_3 = "\u001cdQ\u001fjb\u0004\bbJ\u0013\f\u001cdQ\u001fjbO;bJ\u001dx".length();
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
            v4 = 70;
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
                            v11 = 9;
                            break;
                        }
                        case 1: {
                            v11 = 86;
                            break;
                        }
                        case 2: {
                            v11 = 101;
                            break;
                        }
                        case 3: {
                            v11 = 56;
                            break;
                        }
                        case 4: {
                            v11 = 74;
                            break;
                        }
                        case 5: {
                            v11 = 65;
                            break;
                        }
                        default: {
                            v11 = 90;
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
        i0.Strafe = new i0((Object)var0[0], 0);
        i0.StrafeStrict = new i0((Object)var0[2], 1);
        i0.Grim = new i0((Object)var0[1], 2);
        i0.Z = hi.a("G", (Object)new Object[0], (long)867910047835651447L);
    }

    public static i0[] values() {
        return (i0[])i0.d("lTnNErBe44gzslgb", clone(), (i0[])hi.a("j", (long)881497831429543817L));
    }

    public static i0 valueOf(String string) {
        return (i0)((Object)hi.a("G", i0.class, (Object)string, (long)703426484721789552L));
    }
}
