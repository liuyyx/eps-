/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public final class lM
extends Enum<lM> {
    public static final /* enum */ lM Epsilon;
    public static final /* enum */ lM Minecraft_1_8_9;
    public static final /* enum */ lM Vanilla;
    private static final lM[] I;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "3^\u001b\t&!2\u0018C*]\u001ak\fG\u0007(V\u001b\u0005)?2\u0007;G\u0006\u0005)<=";
            var5_3 = "3^\u001b\t&!2\u0018C*]\u001ak\fG\u0007(V\u001b\u0005)?2\u0007;G\u0006\u0005)<=".length();
            var2_4 = 15;
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
            v4 = 14;
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
                            v11 = 112;
                            break;
                        }
                        case 1: {
                            v11 = 57;
                            break;
                        }
                        case 2: {
                            v11 = 123;
                            break;
                        }
                        case 3: {
                            v11 = 98;
                            break;
                        }
                        case 4: {
                            v11 = 75;
                            break;
                        }
                        case 5: {
                            v11 = 93;
                            break;
                        }
                        default: {
                            v11 = 93;
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
        lM.Vanilla = new lM((Object)var0[1], 0);
        lM.Minecraft_1_8_9 = new lM((Object)var0[0], 1);
        lM.Epsilon = new lM((Object)var0[2], 2);
        lM.I = hi.a("G", (Object)new Object[0], (long)829602239111576204L);
    }

    private static lM[] Q(Object[] objectArray) {
        return new lM[]{hi.a("j", (long)992288705828145214L), hi.a("j", (long)418395701380608287L), hi.a("j", (long)800205556272907491L)};
    }

    public static lM valueOf(String string) {
        return (lM)((Object)hi.a("G", lM.class, (Object)string, (long)703426484721789552L));
    }

    public static lM[] values() {
        return (lM[])((Enum)((Object)hi.a("j", (long)1053524448636674628L))).clone();
    }
}
