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

final class OQ
extends Enum<OQ> {
    public static final /* enum */ OQ Auto;
    public static final /* enum */ OQ Assist;
    private static final OQ[] o;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u0019\u001d\"]\u0006\u0019\u001b%[}L";
            var5_3 = "\u0019\u001d\"]\u0006\u0019\u001b%[}L".length();
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
            v4 = 26;
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
                            v11 = 66;
                            break;
                        }
                        case 1: {
                            v11 = 114;
                            break;
                        }
                        case 2: {
                            v11 = 76;
                            break;
                        }
                        case 3: {
                            v11 = 40;
                            break;
                        }
                        case 4: {
                            v11 = 20;
                            break;
                        }
                        case 5: {
                            v11 = 34;
                            break;
                        }
                        default: {
                            v11 = 74;
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
        OQ.Assist = new OQ((Object)var0[1], 0);
        OQ.Auto = new OQ((Object)var0[0], 1);
        OQ.o = OQ.A("gWT9Qdc9qdVBYL76", Y());
    }

    public static /* bridge */ /* synthetic */ CallSite A(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static OQ valueOf(String string) {
        return (OQ)((Object)OQ.A("gWT9Qdc9qdVBYL76", valueOf(java.lang.Class<T> java.lang.String ), OQ.class, (String)string));
    }

    public static OQ[] values() {
        return (OQ[])OQ.A("gWT9Qdc9qdVBYL76", clone(), (OQ[])hi.a("j", (long)464018751540962487L));
    }

    private static OQ[] Y() {
        return new OQ[]{hi.a("j", (long)1030794526835389599L), hi.a("j", (long)1281752734593831821L)};
    }
}
