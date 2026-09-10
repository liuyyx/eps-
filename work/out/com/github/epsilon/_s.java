/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class _s
extends Enum<_s> {
    private static final _s[] E;
    public static final /* enum */ _s Silent;
    public static final /* enum */ _s InvSwitch;

    public static _s valueOf(String string) {
        return (_s)((Object)hi.a("G", _s.class, (Object)string, (long)703426484721789552L));
    }

    private static _s[] D(Object[] objectArray) {
        return new _s[]{hi.a("j", (long)747009128757218761L), hi.a("j", (long)713565077183056566L)};
    }

    public static _s[] values() {
        return (_s[])((Enum)((Object)hi.a("j", (long)481022322097014378L))).clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "gXja%=\u0013M^\u0006}_pW< ";
            var5_3 = "gXja%=\u0013M^\u0006}_pW< ".length();
            var2_4 = 9;
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
            v4 = 97;
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
                            v11 = 79;
                            break;
                        }
                        case 1: {
                            v11 = 87;
                            break;
                        }
                        case 2: {
                            v11 = 125;
                            break;
                        }
                        case 3: {
                            v11 = 83;
                            break;
                        }
                        case 4: {
                            v11 = 51;
                            break;
                        }
                        case 5: {
                            v11 = 53;
                            break;
                        }
                        default: {
                            v11 = 6;
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
        _s.Silent = new _s((Object)var0[1], 0);
        _s.InvSwitch = new _s((Object)var0[0], 1);
        _s.E = hi.a("G", (Object)new Object[0], (long)1055049783398989354L);
    }
}
