/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class uQ
extends Enum<uQ> {
    private static final uQ[] J;
    public static final /* enum */ uQ GroundSpoof;
    public static final /* enum */ uQ GrimJump;

    public static uQ valueOf(String string) {
        return (uQ)((Object)hi.a("G", uQ.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "g~\u0002 #[*Pc\u00023\bg~\u00048\u0007J\u0014P";
            var5_3 = "g~\u0002 #[*Pc\u00023\bg~\u00048\u0007J\u0014P".length();
            var2_4 = 11;
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
            v4 = 19;
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
                            v11 = 51;
                            break;
                        }
                        case 1: {
                            v11 = 31;
                            break;
                        }
                        case 2: {
                            v11 = 126;
                            break;
                        }
                        case 3: {
                            v11 = 70;
                            break;
                        }
                        case 4: {
                            v11 = 94;
                            break;
                        }
                        case 5: {
                            v11 = 44;
                            break;
                        }
                        default: {
                            v11 = 106;
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
        uQ.GroundSpoof = new uQ((Object)var0[0], 0);
        uQ.GrimJump = new uQ((Object)var0[1], 1);
        uQ.J = hi.a("G", (Object)new Object[0], (long)1097850299909240103L);
    }

    private static uQ[] H(Object[] objectArray) {
        return new uQ[]{hi.a("j", (long)882525679941026972L), hi.a("j", (long)390415303888212331L)};
    }

    public static uQ[] values() {
        return (uQ[])((Enum)((Object)hi.a("j", (long)1039374763007319006L))).clone();
    }
}
