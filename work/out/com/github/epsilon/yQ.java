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

final class yQ
extends Enum<yQ> {
    public static final /* enum */ yQ Closest;
    public static final /* enum */ yQ Up;
    private static final yQ[] i;
    public static final /* enum */ yQ Down;

    public static yQ valueOf(String string) {
        return (yQ)((Object)yQ.I("aeYDF8OTOouVV2cq", valueOf(java.lang.Class<T> java.lang.String ), yQ.class, (String)string));
    }

    private static yQ[] n(Object[] objectArray) {
        return new yQ[]{hi.a("j", (long)451425339671198203L), hi.a("j", (long)1306091007099868342L), hi.a("j", (long)1237179127320522368L)};
    }

    public static yQ[] values() {
        return (yQ[])yQ.I("aeYDF8OTOouVV2cq", clone(), (yQ[])hi.a("j", (long)686983698267439932L));
    }

    public static /* bridge */ /* synthetic */ CallSite I(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            var3_2 = "iN\u0018a\u0007nM\u0000|\fh\u0012\u0002xQ";
            var5_3 = "iN\u0018a\u0007nM\u0000|\fh\u0012\u0002xQ".length();
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
            v4 = 110;
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
                            v11 = 67;
                            break;
                        }
                        case 1: {
                            v11 = 79;
                            break;
                        }
                        case 2: {
                            v11 = 1;
                            break;
                        }
                        case 3: {
                            v11 = 97;
                            break;
                        }
                        case 4: {
                            v11 = 7;
                            break;
                        }
                        case 5: {
                            v11 = 117;
                            break;
                        }
                        default: {
                            v11 = 8;
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
        yQ.Up = new yQ();
        yQ.Down = new yQ();
        yQ.Closest = new yQ();
        yQ.i = hi.a("G", (Object)new Object[0], (long)468332893323408207L);
    }
}
