/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class uq
extends Enum<uq> {
    public static final /* enum */ uq Quantum;
    private static final uq[] J;
    public static final /* enum */ uq NVIDIA;
    public static final /* enum */ uq Akarin;

    private static uq[] t(Object[] objectArray) {
        return new uq[]{hi.a("j", (long)1133441806695453014L), hi.a("j", (long)722526013355296270L), hi.a("j", (long)942554129368418860L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "3-\u0005\u0000\u001f17\u0006#3\u0005\u001c\u0002*\u0006,\u000e-*\"\u0005";
            var5_3 = "3-\u0005\u0000\u001f17\u0006#3\u0005\u001c\u0002*\u0006,\u000e-*\"\u0005".length();
            var2_4 = 7;
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
            v4 = 56;
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
                            v11 = 90;
                            break;
                        }
                        case 1: {
                            v11 = 96;
                            break;
                        }
                        case 2: {
                            v11 = 92;
                            break;
                        }
                        case 3: {
                            v11 = 86;
                            break;
                        }
                        case 4: {
                            v11 = 83;
                            break;
                        }
                        case 5: {
                            v11 = 124;
                            break;
                        }
                        default: {
                            v11 = 98;
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
        uq.NVIDIA = new uq((Object)var0[2], 0);
        uq.Quantum = new uq((Object)var0[0], 1);
        uq.Akarin = new uq((Object)var0[1], 2);
        uq.J = hi.a("G", (Object)new Object[0], (long)747766822763242347L);
    }

    public static uq[] values() {
        return (uq[])((Enum)((Object)hi.a("j", (long)398463577067846499L))).clone();
    }

    public static uq valueOf(String string) {
        return (uq)((Object)hi.a("G", uq.class, (Object)string, (long)703426484721789552L));
    }
}
