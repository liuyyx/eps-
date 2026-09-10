/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class nn
extends Enum<nn> {
    public static final /* enum */ nn Cancel;
    public static final /* enum */ nn Kick;
    public static final /* enum */ nn CancelAndNotify;
    private static final nn[] w;

    public static nn[] values() {
        return (nn[])((Enum)((Object)hi.a("j", (long)1236266498479177598L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "qX\bG\u0004d\u000fqX\bG\u0004dp\\](K\u0015aWK\u0004yP\u0005O";
            var5_3 = "qX\bG\u0004d\u000fqX\bG\u0004dp\\](K\u0015aWK\u0004yP\u0005O".length();
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
            v4 = 85;
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
                            v11 = 103;
                            break;
                        }
                        case 1: {
                            v11 = 108;
                            break;
                        }
                        case 2: {
                            v11 = 51;
                            break;
                        }
                        case 3: {
                            v11 = 113;
                            break;
                        }
                        case 4: {
                            v11 = 52;
                            break;
                        }
                        case 5: {
                            v11 = 93;
                            break;
                        }
                        default: {
                            v11 = 100;
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
        nn.Kick = new nn((Object)var0[2], 0);
        nn.CancelAndNotify = new nn((Object)var0[1], 1);
        nn.Cancel = new nn((Object)var0[0], 2);
        nn.w = hi.a("G", (Object)new Object[0], (long)425421157874760611L);
    }

    public static nn valueOf(String string) {
        return (nn)((Object)hi.a("G", nn.class, (Object)string, (long)703426484721789552L));
    }

    private static nn[] R(Object[] objectArray) {
        return new nn[]{hi.a("j", (long)1192499576416938215L), hi.a("j", (long)1283850177378702548L), hi.a("j", (long)1100164105904688659L)};
    }
}
