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

final class nI
extends Enum<nI> {
    public static final /* enum */ nI Sync;
    public static final /* enum */ nI Custom;
    private static final nI[] S;

    public static nI valueOf(String string) {
        return (nI)((Object)nI.a("VymNnFBm6dJv6AZw", valueOf(java.lang.Class<T> java.lang.String ), nI.class, (String)string));
    }

    private static nI[] b(Object[] objectArray) {
        return new nI[]{hi.a("j", (long)768238996598666167L), hi.a("j", (long)1146400490650230939L)};
    }

    public static /* bridge */ /* synthetic */ CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static nI[] values() {
        return (nI[])((Enum)((Object)hi.a("j", (long)602375779703631999L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "Z}?\u0018\u0006Jq\"\u000fT%";
            var5_3 = "Z}?\u0018\u0006Jq\"\u000fT%".length();
            var2_4 = 4;
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
            v4 = 48;
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
                            v11 = 57;
                            break;
                        }
                        case 1: {
                            v11 = 52;
                            break;
                        }
                        case 2: {
                            v11 = 97;
                            break;
                        }
                        case 3: {
                            v11 = 75;
                            break;
                        }
                        case 4: {
                            v11 = 11;
                            break;
                        }
                        case 5: {
                            v11 = 120;
                            break;
                        }
                        default: {
                            v11 = 52;
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
        nI.Custom = new nI((Object)var0[1], 0);
        nI.Sync = new nI((Object)var0[0], 1);
        nI.S = hi.a("G", (Object)new Object[0], (long)865781856336220815L);
    }
}
