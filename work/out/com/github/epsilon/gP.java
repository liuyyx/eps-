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

final class gP
extends Enum<gP> {
    public static final /* enum */ gP GREEN;
    public static final /* enum */ gP ALPHA;
    public static final /* enum */ gP RED;
    public static final /* enum */ gP BLUE;
    private static final gP[] S;
    private final String r;

    public static gP valueOf(String string) {
        return (gP)((Object)hi.a("G", gP.class, (Object)string, (long)703426484721789552L));
    }

    public static gP[] values() {
        return (gP[])gP.M("gIIL6h1ZBlB0Oydq", clone(), (gP[])hi.a("j", (long)1292858288644225527L));
    }

    private static gP[] C() {
        return new gP[]{hi.a("j", (long)829226316604602448L), hi.a("j", (long)1187031714015228271L), hi.a("j", (long)464416258947676038L), hi.a("j", (long)513250137675314153L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "quz\u0005db{5}";
                var5_3 = "quz\u0005db{5}".length();
                var2_4 = 3;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 54;
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
                    var3_2 = "/2%{\u0005,2 v<";
                    var5_3 = "/2%{\u0005,2 v<".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 120;
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
                            v15 = 21;
                            break;
                        }
                        case 1: {
                            v15 = 6;
                            break;
                        }
                        case 2: {
                            v15 = 8;
                            break;
                        }
                        case 3: {
                            v15 = 70;
                            break;
                        }
                        case 4: {
                            v15 = 5;
                            break;
                        }
                        case 5: {
                            v15 = 107;
                            break;
                        }
                        default: {
                            v15 = 45;
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
        gP.RED = new gP((Object)var0[0], 0, (Object)"R");
        gP.GREEN = new gP((Object)var0[1], 1, (Object)"G");
        gP.BLUE = new gP((Object)var0[2], 2, (Object)"B");
        gP.ALPHA = new gP((Object)var0[3], 3, (Object)"A");
        gP.S = gP.M("gIIL6h1ZBlB0Oydq", C());
    }

    public static /* bridge */ /* synthetic */ CallSite M(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private gP(String string2) {
        this.r = string2;
    }
}
