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

final class _a
extends Enum<_a> {
    public static final /* enum */ _a IDLE;
    public static final /* enum */ _a PLACE_ANCHOR;
    public static final /* enum */ _a CHARGE;
    private static final _a[] I;
    public static final /* enum */ _a CLEANUP;
    public static final /* enum */ _a DETONATE;

    public static /* bridge */ /* synthetic */ CallSite P(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
                var3_2 = "\u0004tvE\b\tunOB=C\b\u0006\u000ex{RK9";
                var5_3 = "\u0004tvE\b\tunOB=C\b\u0006\u000ex{RK9".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 113;
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
                    var3_2 = "`\u0001\u0006>4^+~\u000e\u000f2#\u0007s\u0001\u0002<?T:";
                    var5_3 = "`\u0001\u0006>4^+~\u000e\u000f2#\u0007s\u0001\u0002<?T:".length();
                    var2_4 = 12;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 12;
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
                            v15 = 60;
                            break;
                        }
                        case 1: {
                            v15 = 65;
                            break;
                        }
                        case 2: {
                            v15 = 75;
                            break;
                        }
                        case 3: {
                            v15 = 113;
                            break;
                        }
                        case 4: {
                            v15 = 125;
                            break;
                        }
                        case 5: {
                            v15 = 13;
                            break;
                        }
                        default: {
                            v15 = 102;
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
        _a.IDLE = new _a((Object)var0[0], 0);
        _a.PLACE_ANCHOR = new _a((Object)var0[3], 1);
        _a.CHARGE = new _a((Object)var0[2], 2);
        _a.DETONATE = new _a((Object)var0[1], 3);
        _a.CLEANUP = new _a((Object)var0[4], 4);
        _a.I = hi.a("G", (Object)new Object[0], (long)1003440208368709635L);
    }

    private static _a[] n(Object[] objectArray) {
        return new _a[]{hi.a("j", (long)363604446727531847L), hi.a("j", (long)477247739795723475L), hi.a("j", (long)1323453332277629467L), hi.a("j", (long)971150793407881710L), hi.a("j", (long)788059175454268566L)};
    }

    public static _a[] values() {
        return (_a[])_a.P("BjBTZ4L1nYuIde91", clone(), (_a[])hi.a("j", (long)488267934333840994L));
    }

    public static _a valueOf(String string) {
        return (_a)((Object)hi.a("G", _a.class, (Object)string, (long)703426484721789552L));
    }
}
