/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class XW
extends Enum<XW> {
    public static final /* enum */ XW Multi;
    private static final XW[] D;
    public static final /* enum */ XW Single;
    public static final /* enum */ XW Off;

    public static XW valueOf(String string) {
        return (XW)((Object)hi.a("G", XW.class, (Object)string, (long)703426484721789552L));
    }

    public static XW[] values() {
        return (XW[])((Enum)((Object)hi.a("j", (long)502096462156441846L))).clone();
    }

    private static XW[] V(Object[] objectArray) {
        return new XW[]{hi.a("j", (long)511093898547023774L), hi.a("j", (long)1262931021482031356L), hi.a("j", (long)1023049491158032072L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "Hn\u0000I\na\u0003Ta\b\u0005Vr\u0002Z\u000f";
            var5_3 = "Hn\u0000I\na\u0003Ta\b\u0005Vr\u0002Z\u000f".length();
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
            v4 = 43;
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
                            v11 = 48;
                            break;
                        }
                        case 1: {
                            v11 = 44;
                            break;
                        }
                        case 2: {
                            v11 = 69;
                            break;
                        }
                        case 3: {
                            v11 = 5;
                            break;
                        }
                        case 4: {
                            v11 = 77;
                            break;
                        }
                        case 5: {
                            v11 = 47;
                            break;
                        }
                        default: {
                            v11 = 119;
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
        XW.Off = new XW();
        XW.Single = new XW();
        XW.Multi = new XW();
        XW.D = hi.a("G", (Object)new Object[0], (long)467872106321901312L);
    }
}
