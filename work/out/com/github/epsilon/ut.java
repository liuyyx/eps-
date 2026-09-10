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

final class ut
extends Enum<ut> {
    public static final /* enum */ ut UwU;
    public static final /* enum */ ut Nya;
    public static final /* enum */ ut Moan;
    private static final ut[] R;
    public static final /* enum */ ut OFF;

    private static ut[] S(Object[] objectArray) {
        return new ut[]{hi.a("j", (long)795395803466572403L), hi.a("j", (long)781432140493879067L), hi.a("j", (long)850193434249155046L), hi.a("j", (long)1313402786802828467L)};
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

    public static ut valueOf(String string) {
        return (ut)((Object)ut.g("naJ6V0P6AXTqbifv", valueOf(java.lang.Class<T> java.lang.String ), ut.class, (String)string));
    }

    public static ut[] values() {
        return (ut[])((Enum)((Object)hi.a("j", (long)1334001315398566800L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "?`Q\u0019\u0003<vQ";
                var5_3 = "?`Q\u0019\u0003<vQ".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 90;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "s\u00078\u0003i6+";
                    var5_3 = "s\u00078\u0003i6+".length();
                    var2_4 = 3;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 20;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 40;
                            break;
                        }
                        case 1: {
                            v15 = 85;
                            break;
                        }
                        case 2: {
                            v15 = 106;
                            break;
                        }
                        case 3: {
                            v15 = 45;
                            break;
                        }
                        case 4: {
                            v15 = 97;
                            break;
                        }
                        case 5: {
                            v15 = 60;
                            break;
                        }
                        default: {
                            v15 = 112;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        ut.UwU = new ut((Object)var0[3], 0);
        ut.Nya = new ut((Object)var0[1], 1);
        ut.Moan = new ut((Object)var0[0], 2);
        ut.OFF = new ut((Object)var0[2], 3);
        ut.R = hi.a("G", (Object)new Object[0], (long)420280321514549536L);
    }
}
