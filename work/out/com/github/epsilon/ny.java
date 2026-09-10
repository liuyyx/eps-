/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uT;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public final class ny {
    public static final uT O;
    public static final uT r;
    public static final uT y;

    public static /* bridge */ /* synthetic */ CallSite y(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "n\u000fw?&}<\u0006q\u0005i:#v\u0007n\u000fw?&}<";
                var5_3 = "n\u000fw?&}<\u0006q\u0005i:#v\u0007n\u000fw?&}<".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 56;
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
                    var3_2 = "$J/w\u0004\"J-v";
                    var5_3 = "$J/w\u0004\"J-v".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 119;
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
                            v15 = 61;
                            break;
                        }
                        case 1: {
                            v15 = 82;
                            break;
                        }
                        case 2: {
                            v15 = 54;
                            break;
                        }
                        case 3: {
                            v15 = 101;
                            break;
                        }
                        case 4: {
                            v15 = 119;
                            break;
                        }
                        case 5: {
                            v15 = 43;
                            break;
                        }
                        default: {
                            v15 = 96;
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
        ny.y = hi.a("G", var0[0], (Object)var0[3], (long)552744722789337767L);
        ny.O = ny.y("b4G7SU1rtWS42Vbb", S(java.lang.String java.lang.String ), (String)var0[2], (String)var0[1]);
        ny.r = hi.a("G", var0[2], (Object)var0[4], (long)552744722789337767L);
    }

    private ny() {
    }
}
