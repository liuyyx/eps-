/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.apache.logging.log4j.Logger
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

public class dD {
    public static final String I;
    public static int G;
    public static final Logger r;
    public static String D;
    public static final String z;
    public static Minecraft d;
    private static e[] S;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\t@4?hBt\u0007)@4?hBt";
            var5_3 = "\t@4?hBt\u0007)@4?hBt".length();
            var2_4 = 7;
            var1_5 = -1;
            dD.z(new e[4]);
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v4 = 107;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 39;
                            break;
                        }
                        case 1: {
                            v11 = 91;
                            break;
                        }
                        case 2: {
                            v11 = 44;
                            break;
                        }
                        case 3: {
                            v11 = 61;
                            break;
                        }
                        case 4: {
                            v11 = 111;
                            break;
                        }
                        case 5: {
                            v11 = 70;
                            break;
                        }
                        default: {
                            v11 = 113;
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
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        dD.I = var0[1];
        hi.a("\u00d2", var0[0], (long)830189880791915820L);
        dD.z = hi.a("j", (long)863276998585859301L);
        dD.r = hi.a("G", (Object)hi.a("j", (long)830189880791915820L), (long)901559238579878805L);
        hi.a("\u00d2", (int)0, (long)1057741999361169463L);
    }

    public static void z(e[] eArray) {
        S = eArray;
    }

    public static e[] e() {
        return S;
    }
}
