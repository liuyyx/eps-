/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class n7
extends Enum<n7> {
    public static final /* enum */ n7 Cine;
    public static final /* enum */ n7 Euabe;
    public static final /* enum */ n7 Local;
    private static final n7[] m;

    public static n7[] values() {
        return (n7[])((Enum)((Object)hi.a("j", (long)855049510818264847L))).clone();
    }

    public static n7 valueOf(String string) {
        return (n7)((Object)hi.a("G", n7.class, (Object)string, (long)703426484721789552L));
    }

    private static n7[] z(Object[] objectArray) {
        return new n7[]{hi.a("j", (long)732131261974035966L), hi.a("j", (long)1137869405568846441L), hi.a("j", (long)754329703682313305L)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u00114w\rP\u0005\u0018.u\u000eY\u0004\u0017(x\n";
            var5_3 = "\u00114w\rP\u0005\u0018.u\u000eY\u0004\u0017(x\n".length();
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
            v4 = 10;
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
                            v11 = 94;
                            break;
                        }
                        case 1: {
                            v11 = 75;
                            break;
                        }
                        case 2: {
                            v11 = 28;
                            break;
                        }
                        case 3: {
                            v11 = 101;
                            break;
                        }
                        case 4: {
                            v11 = 63;
                            break;
                        }
                        case 5: {
                            v11 = 67;
                            break;
                        }
                        default: {
                            v11 = 45;
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
        n7.Cine = new n7((Object)var0[2], 0);
        n7.Euabe = new n7((Object)var0[0], 1);
        n7.Local = new n7((Object)var0[1], 2);
        n7.m = hi.a("G", (Object)new Object[0], (long)742449074498887883L);
    }
}
