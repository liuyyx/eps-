/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class X7
extends Enum<X7> {
    private static final X7[] C;
    public static final /* enum */ X7 Simple;
    public static final /* enum */ X7 Normal;

    private static X7[] Y(Object[] objectArray) {
        return new X7[]{hi.a("j", (long)623279982452957424L), hi.a("j", (long)681556865598572403L)};
    }

    public static X7 valueOf(String string) {
        return (X7)((Object)hi.a("G", X7.class, (Object)string, (long)703426484721789552L));
    }

    public static X7[] values() {
        return (X7[])((Enum)((Object)hi.a("j", (long)1093949109409610066L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u001b\u0014\u001bx\u0012\u0016\u0006\u0006\u0012\u0004e\u001f\u001f";
            var5_3 = "\u001b\u0014\u001bx\u0012\u0016\u0006\u0006\u0012\u0004e\u001f\u001f".length();
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
            v4 = 113;
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
                            v11 = 36;
                            break;
                        }
                        case 1: {
                            v11 = 10;
                            break;
                        }
                        case 2: {
                            v11 = 24;
                            break;
                        }
                        case 3: {
                            v11 = 100;
                            break;
                        }
                        case 4: {
                            v11 = 2;
                            break;
                        }
                        case 5: {
                            v11 = 11;
                            break;
                        }
                        default: {
                            v11 = 114;
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
        X7.Simple = new X7((Object)var0[1], 0);
        X7.Normal = new X7((Object)var0[0], 1);
        X7.C = hi.a("G", (Object)new Object[0], (long)867689420902192432L);
    }
}
