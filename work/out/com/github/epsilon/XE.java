/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class XE
extends Enum<XE> {
    public static final /* enum */ XE NONE;
    public static final /* enum */ XE LAVA;
    public static final /* enum */ XE LAVA_SUPPORT;
    private static final XE[] Q;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "r\u0015(5cKFn\u00041&h\u0004p\u001b01\u0004r\u0015(5";
            var5_3 = "r\u0015(5cKFn\u00041&h\u0004p\u001b01\u0004r\u0015(5".length();
            var2_4 = 12;
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
            v4 = 35;
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
                            v11 = 29;
                            break;
                        }
                        case 1: {
                            v11 = 119;
                            break;
                        }
                        case 2: {
                            v11 = 93;
                            break;
                        }
                        case 3: {
                            v11 = 87;
                            break;
                        }
                        case 4: {
                            v11 = 31;
                            break;
                        }
                        case 5: {
                            v11 = 59;
                            break;
                        }
                        default: {
                            v11 = 48;
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
        XE.NONE = new XE((Object)var0[1], 0);
        XE.LAVA = new XE((Object)var0[2], 1);
        XE.LAVA_SUPPORT = new XE((Object)var0[0], 2);
        XE.Q = hi.a("G", (Object)new Object[0], (long)1095281206585064145L);
    }

    public static XE valueOf(String string) {
        return (XE)((Object)hi.a("G", XE.class, (Object)string, (long)703426484721789552L));
    }

    private static XE[] j(Object[] objectArray) {
        return new XE[]{hi.a("j", (long)679632521798027425L), hi.a("j", (long)775790100740265311L), hi.a("j", (long)555490909843606941L)};
    }

    public static XE[] values() {
        return (XE[])((Enum)((Object)hi.a("j", (long)1045857078801315161L))).clone();
    }
}
