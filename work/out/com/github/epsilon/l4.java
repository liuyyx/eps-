/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class l4
extends Enum<l4> {
    public static final /* enum */ l4 Disabled;
    public static final /* enum */ l4 Auto;
    private static final l4[] x;
    public static final /* enum */ l4 Enabled;

    public static l4 valueOf(String string) {
        return (l4)((Object)hi.a("G", l4.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "S\u0002_K\bV\u001eXE\u000ea\u000bv\u0007W\u0019JF\u0000h\n";
            var5_3 = "S\u0002_K\bV\u001eXE\u000ea\u000bv\u0007W\u0019JF\u0000h\n".length();
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
            v4 = 30;
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
                            v11 = 12;
                            break;
                        }
                        case 1: {
                            v11 = 105;
                            break;
                        }
                        case 2: {
                            v11 = 53;
                            break;
                        }
                        case 3: {
                            v11 = 58;
                            break;
                        }
                        case 4: {
                            v11 = 114;
                            break;
                        }
                        case 5: {
                            v11 = 19;
                            break;
                        }
                        default: {
                            v11 = 112;
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
        l4.Auto = new l4((Object)var0[0], 0);
        l4.Enabled = new l4((Object)var0[2], 1);
        l4.Disabled = new l4((Object)var0[1], 2);
        l4.x = hi.a("G", (Object)new Object[0], (long)1146905983832235404L);
    }

    private static l4[] m(Object[] objectArray) {
        return new l4[]{hi.a("j", (long)824385988595756726L), hi.a("j", (long)742681797716493164L), hi.a("j", (long)437223317772576144L)};
    }

    public static l4[] values() {
        return (l4[])((Enum)((Object)hi.a("j", (long)923018465926086716L))).clone();
    }
}
