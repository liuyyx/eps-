/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class nw
extends Enum<nw> {
    public static final /* enum */ nw Hold;
    private static final nw[] H;
    public static final /* enum */ nw Toggle;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "6\u001dY\u00182_\u0004*\u001dR\u001b";
            var5_3 = "6\u001dY\u00182_\u0004*\u001dR\u001b".length();
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
            v4 = 81;
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
                            v11 = 35;
                            break;
                        }
                        case 2: {
                            v11 = 111;
                            break;
                        }
                        case 3: {
                            v11 = 46;
                            break;
                        }
                        case 4: {
                            v11 = 15;
                            break;
                        }
                        case 5: {
                            v11 = 107;
                            break;
                        }
                        default: {
                            v11 = 36;
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
        nw.Toggle = new nw((Object)var0[0], 0);
        nw.Hold = new nw((Object)var0[1], 1);
        nw.H = hi.a("G", (Object)new Object[0], (long)757723548476936443L);
    }

    public static nw valueOf(String string) {
        return (nw)((Object)hi.a("G", nw.class, (Object)string, (long)703426484721789552L));
    }

    public static nw[] values() {
        return (nw[])((Enum)((Object)hi.a("j", (long)1070943618074428013L))).clone();
    }

    private static nw[] C(Object[] objectArray) {
        return new nw[]{hi.a("j", (long)1014858373276070925L), hi.a("j", (long)1172200057356308032L)};
    }
}
