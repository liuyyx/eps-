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

final class _m
extends Enum<_m> {
    public static final /* enum */ _m Bloom;
    public static final /* enum */ _m Stars;
    public static final /* enum */ _m Dollars;
    public static final /* enum */ _m Off;
    public static final /* enum */ _m SnowFlake;
    private static final _m[] f;
    public static final /* enum */ _m Hearts;
    private static final long a;

    public static _m valueOf(String string) {
        return (_m)((Object)hi.a("G", _m.class, (Object)string, (long)703426484721789552L));
    }

    private static _m[] U(Object[] objectArray) {
        _m[] _mArray = new _m[(int)a];
        _mArray[0] = hi.a("j", (long)1319817899072846236L);
        _mArray[1] = hi.a("j", (long)977963622726365103L);
        _mArray[2] = hi.a("j", (long)671678827501843372L);
        _mArray[3] = hi.a("j", (long)359035254268862628L);
        _mArray[4] = hi.a("j", (long)1165196347951864433L);
        _mArray[5] = hi.a("j", (long)732961199541665115L);
        return _mArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = ";vO\u0005==\u0003\t,wL\u001e\u001a#\u0011\u0014|\u00067|B\u001b(<\u0005=uL\u00061";
                var7_3 = ";vO\u0005==\u0003\t,wL\u001e\u001a#\u0011\u0014|\u00067|B\u001b(<\u0005=uL\u00061".length();
                var4_4 = 7;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 107;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "F\t3\u0005Z\u001b4mY";
                    var7_3 = "F\t3\u0005Z\u001b4mY".length();
                    var4_4 = 3;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 29;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 20;
                            break;
                        }
                        case 1: {
                            v15 = 114;
                            break;
                        }
                        case 2: {
                            v15 = 72;
                            break;
                        }
                        case 3: {
                            v15 = 2;
                            break;
                        }
                        case 4: {
                            v15 = 55;
                            break;
                        }
                        case 5: {
                            v15 = 36;
                            break;
                        }
                        default: {
                            v15 = 27;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3383765845766998382L;
        ** while (true)
        _m.a = 4501930293171226984L ^ var0_7;
        _m.Off = new _m((Object)var2[4], 0);
        _m.SnowFlake = new _m((Object)var2[1], 1);
        _m.Stars = new _m((Object)var2[5], 2);
        _m.Hearts = new _m((Object)var2[2], 3);
        _m.Dollars = new _m((Object)var2[0], 4);
        _m.Bloom = new _m((Object)var2[3], 5);
        _m.f = hi.a("G", (Object)new Object[0], (long)657300618217517615L);
    }

    public static /* bridge */ /* synthetic */ CallSite t(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static _m[] values() {
        return (_m[])_m.t("yZD5IjBbQ16tvvRS", clone(), (_m[])hi.a("j", (long)1283328888664530566L));
    }
}
