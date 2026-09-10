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

final class lq
extends Enum<lq> {
    public static final /* enum */ lq Vanilla;
    public static final /* enum */ lq Grim1_3;
    private static final lq[] j;
    public static final /* enum */ lq Grim1_2;
    public static final /* enum */ lq GrimBlink;

    public static lq[] values() {
        return (lq[])((Enum)((Object)hi.a("j", (long)492188445059001494L))).clone();
    }

    public static lq valueOf(String string) {
        return (lq)((Object)lq.K("iO27E4tQ92vIu19i", valueOf(java.lang.Class<T> java.lang.String ), lq.class, (String)string));
    }

    private static lq[] V(Object[] objectArray) {
        return new lq[]{hi.a("j", (long)741347967217910910L), hi.a("j", (long)409394569713009562L), hi.a("j", (long)1043134422381068570L), hi.a("j", (long)1139951441082417885L)};
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

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u0017{o\u0016WK\u0010\t\u0017{o\u0016$xJ>b";
                var5_3 = "\u0017{o\u0016WK\u0010\t\u0017{o\u0016$xJ>b".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 59;
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
                    var3_2 = "\u0017yy\u0003\u001biS\u0007\u0006j~\u0007FZ\u0000";
                    var5_3 = "\u0017yy\u0003\u001biS\u0007\u0006j~\u0007FZ\u0000".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 42;
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
                            v15 = 107;
                            break;
                        }
                        case 1: {
                            v15 = 50;
                            break;
                        }
                        case 2: {
                            v15 = 61;
                            break;
                        }
                        case 3: {
                            v15 = 64;
                            break;
                        }
                        case 4: {
                            v15 = 93;
                            break;
                        }
                        case 5: {
                            v15 = 47;
                            break;
                        }
                        default: {
                            v15 = 24;
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
        lq.Vanilla = new lq((Object)var0[2], 0);
        lq.GrimBlink = new lq((Object)var0[1], 1);
        lq.Grim1_2 = new lq((Object)var0[3], 2);
        lq.Grim1_3 = new lq((Object)var0[0], 3);
        lq.j = hi.a("G", (Object)new Object[0], (long)1095512330517187753L);
    }
}
