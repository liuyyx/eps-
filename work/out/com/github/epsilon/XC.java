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

final class XC
extends Enum<XC> {
    private static final XC[] d;
    public static final /* enum */ XC Potion;
    public static final /* enum */ XC Gamma;

    public static XC[] values() {
        return (XC[])((Enum)((Object)hi.a("j", (long)894885540248345339L))).clone();
    }

    public static XC valueOf(String string) {
        return (XC)((Object)hi.a("G", XC.class, (Object)string, (long)703426484721789552L));
    }

    private static XC[] A() {
        return new XC[]{hi.a("j", (long)662170914640071745L), hi.a("j", (long)648144184065652072L)};
    }

    public static /* bridge */ /* synthetic */ CallSite L(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            var3_2 = "^v;vv!\u0005Ix\"rx";
            var5_3 = "^v;vv!\u0005Ix\"rx".length();
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
            v4 = 2;
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
                            v11 = 12;
                            break;
                        }
                        case 1: {
                            v11 = 27;
                            break;
                        }
                        case 2: {
                            v11 = 77;
                            break;
                        }
                        case 3: {
                            v11 = 29;
                            break;
                        }
                        case 4: {
                            v11 = 27;
                            break;
                        }
                        case 5: {
                            v11 = 77;
                            break;
                        }
                        default: {
                            v11 = 111;
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
        XC.Gamma = new XC((Object)var0[1], 0);
        XC.Potion = new XC((Object)var0[0], 1);
        XC.d = XC.L("l17Y49HcxMIN3gvI", A());
    }
}
