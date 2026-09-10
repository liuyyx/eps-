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

public final class iU
extends Enum<iU> {
    public static final /* enum */ iU Panel;
    private static final iU[] j;
    public static final /* enum */ iU Dropdown;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u0017}\u0006\u0006!r\u000f=\u0005\u0003n\u0007\u0013)";
            var5_3 = "\u0017}\u0006\u0006!r\u000f=\u0005\u0003n\u0007\u0013)".length();
            var2_4 = 8;
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
            v4 = 34;
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
                            v11 = 113;
                            break;
                        }
                        case 1: {
                            v11 = 45;
                            break;
                        }
                        case 2: {
                            v11 = 75;
                            break;
                        }
                        case 3: {
                            v11 = 84;
                            break;
                        }
                        case 4: {
                            v11 = 103;
                            break;
                        }
                        case 5: {
                            v11 = 63;
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
        iU.Dropdown = new iU((Object)var0[0], 0);
        iU.Panel = new iU((Object)var0[1], 1);
        iU.j = hi.a("G", (Object)new Object[0], (long)1109517827336141247L);
    }

    public static iU[] values() {
        return (iU[])((Enum)((Object)hi.a("j", (long)796358882613163601L))).clone();
    }

    public static iU valueOf(String string) {
        return (iU)((Object)iU.p("UNjOqo4yipGY3WSA", valueOf(java.lang.Class<T> java.lang.String ), iU.class, (String)string));
    }

    public static /* bridge */ /* synthetic */ CallSite p(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static iU[] X(Object[] objectArray) {
        return new iU[]{hi.a("j", (long)623526845604174659L), hi.a("j", (long)829164930869101015L)};
    }
}
