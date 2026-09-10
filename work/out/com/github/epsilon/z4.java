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

final class z4
extends Enum<z4> {
    private static final z4[] I;
    public static final /* enum */ z4 OutlinedSide;
    public static final /* enum */ z4 BothSide;
    public static final /* enum */ z4 Fill;
    public static final /* enum */ z4 Both;
    public static final /* enum */ z4 Outline;
    public static final /* enum */ z4 FilledSide;
    private static final long a;

    public static z4[] values() {
        return (z4[])((Enum)((Object)hi.a("j", (long)1270577492880413430L))).clone();
    }

    public static z4 valueOf(String string) {
        return (z4)((Object)hi.a("G", z4.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "icGD\u0006\"\u001fN\u0004icGD\u0004me_@\u0007dyG@<%\u001e";
                var7_3 = "icGD\u0006\"\u001fN\u0004icGD\u0004me_@\u0007dyG@<%\u001e".length();
                var4_4 = 8;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 99;
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
                    var5_2 = "lqOH4-\u0016GWR@8\nemWH8' J`^";
                    var7_3 = "lqOH4-\u0016GWR@8\nemWH8' J`^".length();
                    var4_4 = 12;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 107;
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
                            v15 = 72;
                            break;
                        }
                        case 1: {
                            v15 = 111;
                            break;
                        }
                        case 2: {
                            v15 = 80;
                            break;
                        }
                        case 3: {
                            v15 = 79;
                            break;
                        }
                        case 4: {
                            v15 = 54;
                            break;
                        }
                        case 5: {
                            v15 = 40;
                            break;
                        }
                        default: {
                            v15 = 24;
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
        var0_7 = 2324091581398636943L;
        ** while (true)
        z4.a = 8804385246020491657L ^ var0_7;
        z4.Both = new z4((Object)var2[1], 0);
        z4.BothSide = new z4((Object)var2[0], 1);
        z4.Fill = new z4((Object)var2[2], 2);
        z4.FilledSide = new z4((Object)var2[5], 3);
        z4.Outline = new z4((Object)var2[3], 4);
        z4.OutlinedSide = new z4((Object)var2[4], 5);
        z4.I = z4.N("6I0X3FqgLWHXOJ4i", s());
    }

    public static /* bridge */ /* synthetic */ CallSite N(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static z4[] s() {
        z4[] z4Array = new z4[(int)a];
        z4Array[0] = hi.a("j", (long)969239672674210396L);
        z4Array[1] = hi.a("j", (long)444903241092774113L);
        z4Array[2] = hi.a("j", (long)678157694992657530L);
        z4Array[3] = hi.a("j", (long)849572296136731576L);
        z4Array[4] = hi.a("j", (long)582893590657786848L);
        z4Array[5] = hi.a("j", (long)1032034325003815305L);
        return z4Array;
    }
}
