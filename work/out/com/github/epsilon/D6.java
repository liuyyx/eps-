/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class D6
extends Enum<D6> {
    public static final /* enum */ D6 Box;
    public static final /* enum */ D6 Model;
    private static final D6[] x;

    private static D6[] A(Object[] objectArray) {
        return new D6[]{hi.a("j", (long)985404149574448132L), hi.a("j", (long)362907992843969317L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "^\f\u0000H\u0006\u0003Q\f\u001c";
            var5_3 = "^\f\u0000H\u0006\u0003Q\f\u001c".length();
            var2_4 = 5;
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
            v4 = 123;
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
                            v11 = 104;
                            break;
                        }
                        case 1: {
                            v11 = 24;
                            break;
                        }
                        case 2: {
                            v11 = 31;
                            break;
                        }
                        case 3: {
                            v11 = 86;
                            break;
                        }
                        case 4: {
                            v11 = 17;
                            break;
                        }
                        case 5: {
                            v11 = 112;
                            break;
                        }
                        default: {
                            v11 = 28;
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
        D6.Model = new D6((Object)var0[0], 0);
        D6.Box = new D6((Object)var0[1], 1);
        D6.x = hi.a("G", (Object)new Object[0], (long)1000688417333698823L);
    }

    public static D6[] values() {
        return (D6[])((Enum)((Object)hi.a("j", (long)963093735430268880L))).clone();
    }

    public static D6 valueOf(String string) {
        return (D6)((Object)hi.a("G", D6.class, (Object)string, (long)703426484721789552L));
    }
}
