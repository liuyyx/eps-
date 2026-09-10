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

final class n0
extends Enum<n0> {
    public static final /* enum */ n0 POSITION_DRAG_GRAVITY;
    public static final /* enum */ n0 GRAVITY_DRAG_POSITION;
    private static final n0[] w;
    public static final /* enum */ n0 GRAVITY_POSITION_DRAG;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "`b\u0005?g\u001b\u001dx`\u000b:g\u001b\rh~\u001b-|\u000e\u0003\u0015`b\u0005?g\u001b\u001dxt\u0016(i\u0010\u0014hc\r=g\u0000\n\u0015w\u007f\u0017 z\u0006\u000bio\u0000;o\b\u001b`b\u0005?g\u001b\u001d";
            var5_3 = "`b\u0005?g\u001b\u001dx`\u000b:g\u001b\rh~\u001b-|\u000e\u0003\u0015`b\u0005?g\u001b\u001dxt\u0016(i\u0010\u0014hc\r=g\u0000\n\u0015w\u007f\u0017 z\u0006\u000bio\u0000;o\b\u001b`b\u0005?g\u001b\u001d".length();
            var2_4 = 21;
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
            v4 = 47;
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
                            v11 = 8;
                            break;
                        }
                        case 1: {
                            v11 = 31;
                            break;
                        }
                        case 2: {
                            v11 = 107;
                            break;
                        }
                        case 3: {
                            v11 = 70;
                            break;
                        }
                        case 4: {
                            v11 = 1;
                            break;
                        }
                        case 5: {
                            v11 = 96;
                            break;
                        }
                        default: {
                            v11 = 107;
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
        n0.GRAVITY_DRAG_POSITION = new n0();
        n0.POSITION_DRAG_GRAVITY = new n0();
        n0.GRAVITY_POSITION_DRAG = new n0();
        n0.w = hi.a("G", (Object)new Object[0], (long)1222267401620602910L);
    }

    public static n0 valueOf(String string) {
        return (n0)((Object)hi.a("G", n0.class, (Object)string, (long)703426484721789552L));
    }

    private static n0[] N(Object[] objectArray) {
        return new n0[]{hi.a("j", (long)467405720064103077L), hi.a("j", (long)1185924290499110809L), hi.a("j", (long)1300329826348312605L)};
    }

    public static /* bridge */ /* synthetic */ CallSite K(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static n0[] values() {
        return (n0[])n0.K("dbk40vQrkod4Vkhy", clone(), (n0[])hi.a("j", (long)553312014459546426L));
    }
}
