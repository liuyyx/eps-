/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.Dx;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.n7;
import com.github.epsilon.vY;
import java.awt.Color;

public class e5
extends e {
    public static final e5 F;
    public final DM d;
    public final DV K;
    public final DV h;
    public final Dx<n7> D = hi.a("\u00a5", (Object)this, (Object)e5.b(1869, 28512), (Object)hi.a("j", (long)732131261974035966L), (long)426795652261052192L);
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    private e5() {
        super(e5.b(1866, 7693), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        this.d = hi.a("\u00a5", (Object)this, (Object)e5.b(1870, -25767), (double)4.0, (double)0.0, (double)20.0, (double)0.1, (long)1077996338587307774L);
        this.K = hi.a("\u00a5", (Object)this, (Object)e5.b(1871, -14129), (Object)new Color(e5.c(28591, 164231644307328263L), e5.c(19247, 7121954304968010118L), e5.c(19247, 7121954304968010118L), e5.c(16390, 3011671501363356332L)), (long)1301745618538958839L);
        this.h = hi.a("\u00a5", (Object)this, (Object)e5.b(1868, -887), (Object)new Color(0, 0, 0, e5.c(19247, 7121954304968010118L)), this::lambda$new$0, (long)1241661680830497550L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "%\u0099\u00c7\u008d-\u0005r\u001a6\u000b-\u0018p\u009bX\u00f0\u001b|\u0099\u008e.Q\u00e3\u00f9!f\u0081\u00ae\u00add\u00a5\u00d8\f\u00b0\u0013M";
                        var12_3 = "%\u0099\u00c7\u008d-\u0005r\u001a6\u000b-\u0018p\u009bX\u00f0\u001b|\u0099\u008e.Q\u00e3\u00f9!f\u0081\u00ae\u00add\u00a5\u00d8\f\u00b0\u0013M".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 20;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00d2\u00a5\u00b5\u0098n\u0017\t\u00c8\u00b0\u00f6\u0094\\\u009b\u00cc\u0018\u00a0";
                            var12_3 = "\u00d2\u00a5\u00b5\u0098n\u0017\t\u00c8\u00b0\u00f6\u0094\\\u009b\u00cc\u0018\u00a0".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 57;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 55;
                                    break;
                                }
                                case 1: {
                                    v15 = 106;
                                    break;
                                }
                                case 2: {
                                    v15 = 79;
                                    break;
                                }
                                case 3: {
                                    v15 = 126;
                                    break;
                                }
                                case 4: {
                                    v15 = 7;
                                    break;
                                }
                                case 5: {
                                    v15 = 79;
                                    break;
                                }
                                default: {
                                    v15 = 104;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                e5.a = var13;
                e5.b = new String[5];
                var0_7 = 4181148136500879933L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u00da\u00b4gE\u00a6\u00ba\u00ef\u00c5Jk\u0082\u00dc3EKD\u0095UNg\u00f7\u0085\u00c0Y";
                var5_11 = "\u00da\u00b4gE\u00a6\u00ba\u00ef\u00c5Jk\u0082\u00dc3EKD\u0095UNg\u00f7\u0085\u00c0Y".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        e5.c = var6_8;
        e5.e = new Integer[3];
        e5.F = new e5();
    }

    private boolean lambda$new$0() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)949510162187835053L), (Object)hi.a("j", (long)754329703682313305L), (long)511460060498514638L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x74E) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 9;
                case 1 -> 6;
                case 2 -> 12;
                case 3 -> 201;
                case 4 -> 249;
                case 5 -> 191;
                case 6 -> 4;
                case 7 -> 158;
                case 8 -> 182;
                case 9 -> 80;
                case 10 -> 94;
                case 11 -> 32;
                case 12 -> 174;
                case 13 -> 91;
                case 14 -> 93;
                case 15 -> 55;
                case 16 -> 27;
                case 17 -> 171;
                case 18 -> 67;
                case 19 -> 213;
                case 20 -> 125;
                case 21 -> 8;
                case 22 -> 185;
                case 23 -> 244;
                case 24 -> 42;
                case 25 -> 222;
                case 26 -> 162;
                case 27 -> 73;
                case 28 -> 198;
                case 29 -> 88;
                case 30 -> 150;
                case 31 -> 192;
                case 32 -> 223;
                case 33 -> 139;
                case 34 -> 58;
                case 35 -> 212;
                case 36 -> 29;
                case 37 -> 43;
                case 38 -> 114;
                case 39 -> 103;
                case 40 -> 163;
                case 41 -> 82;
                case 42 -> 100;
                case 43 -> 77;
                case 44 -> 59;
                case 45 -> 102;
                case 46 -> 242;
                case 47 -> 87;
                case 48 -> 161;
                case 49 -> 175;
                case 50 -> 53;
                case 51 -> 255;
                case 52 -> 152;
                case 53 -> 184;
                case 54 -> 128;
                case 55 -> 146;
                case 56 -> 126;
                case 57 -> 248;
                case 58 -> 46;
                case 59 -> 160;
                case 60 -> 217;
                case 61 -> 57;
                case 62 -> 188;
                case 63 -> 167;
                case 64 -> 194;
                case 65 -> 41;
                case 66 -> 199;
                case 67 -> 49;
                case 68 -> 147;
                case 69 -> 79;
                case 70 -> 236;
                case 71 -> 159;
                case 72 -> 0;
                case 73 -> 10;
                case 74 -> 68;
                case 75 -> 149;
                case 76 -> 96;
                case 77 -> 170;
                case 78 -> 151;
                case 79 -> 20;
                case 80 -> 251;
                case 81 -> 189;
                case 82 -> 35;
                case 83 -> 120;
                case 84 -> 132;
                case 85 -> 36;
                case 86 -> 61;
                case 87 -> 50;
                case 88 -> 22;
                case 89 -> 99;
                case 90 -> 153;
                case 91 -> 166;
                case 92 -> 117;
                case 93 -> 74;
                case 94 -> 109;
                case 95 -> 52;
                case 96 -> 235;
                case 97 -> 19;
                case 98 -> 17;
                case 99 -> 164;
                case 100 -> 65;
                case 101 -> 3;
                case 102 -> 169;
                case 103 -> 181;
                case 104 -> 141;
                case 105 -> 108;
                case 106 -> 237;
                case 107 -> 110;
                case 108 -> 144;
                case 109 -> 208;
                case 110 -> 69;
                case 111 -> 95;
                case 112 -> 62;
                case 113 -> 221;
                case 114 -> 78;
                case 115 -> 214;
                case 116 -> 33;
                case 117 -> 106;
                case 118 -> 243;
                case 119 -> 200;
                case 120 -> 40;
                case 121 -> 113;
                case 122 -> 54;
                case 123 -> 37;
                case 124 -> 31;
                case 125 -> 97;
                case 126 -> 241;
                case 127 -> 90;
                case 128 -> 202;
                case 129 -> 219;
                case 130 -> 92;
                case 131 -> 21;
                case 132 -> 190;
                case 133 -> 66;
                case 134 -> 124;
                case 135 -> 145;
                case 136 -> 186;
                case 137 -> 11;
                case 138 -> 85;
                case 139 -> 71;
                case 140 -> 134;
                case 141 -> 123;
                case 142 -> 16;
                case 143 -> 245;
                case 144 -> 18;
                case 145 -> 165;
                case 146 -> 64;
                case 147 -> 56;
                case 148 -> 238;
                case 149 -> 121;
                case 150 -> 84;
                case 151 -> 63;
                case 152 -> 72;
                case 153 -> 143;
                case 154 -> 129;
                case 155 -> 227;
                case 156 -> 140;
                case 157 -> 28;
                case 158 -> 230;
                case 159 -> 111;
                case 160 -> 234;
                case 161 -> 231;
                case 162 -> 206;
                case 163 -> 119;
                case 164 -> 70;
                case 165 -> 187;
                case 166 -> 137;
                case 167 -> 118;
                case 168 -> 179;
                case 169 -> 239;
                case 170 -> 24;
                case 171 -> 14;
                case 172 -> 207;
                case 173 -> 98;
                case 174 -> 157;
                case 175 -> 104;
                case 176 -> 76;
                case 177 -> 253;
                case 178 -> 105;
                case 179 -> 254;
                case 180 -> 155;
                case 181 -> 131;
                case 182 -> 122;
                case 183 -> 211;
                case 184 -> 225;
                case 185 -> 26;
                case 186 -> 127;
                case 187 -> 45;
                case 188 -> 176;
                case 189 -> 156;
                case 190 -> 112;
                case 191 -> 247;
                case 192 -> 193;
                case 193 -> 218;
                case 194 -> 39;
                case 195 -> 233;
                case 196 -> 240;
                case 197 -> 172;
                case 198 -> 136;
                case 199 -> 47;
                case 200 -> 116;
                case 201 -> 215;
                case 202 -> 210;
                case 203 -> 250;
                case 204 -> 180;
                case 205 -> 177;
                case 206 -> 228;
                case 207 -> 195;
                case 208 -> 216;
                case 209 -> 5;
                case 210 -> 135;
                case 211 -> 130;
                case 212 -> 154;
                case 213 -> 252;
                case 214 -> 138;
                case 215 -> 220;
                case 216 -> 44;
                case 217 -> 30;
                case 218 -> 101;
                case 219 -> 205;
                case 220 -> 209;
                case 221 -> 25;
                case 222 -> 38;
                case 223 -> 115;
                case 224 -> 173;
                case 225 -> 1;
                case 226 -> 13;
                case 227 -> 148;
                case 228 -> 7;
                case 229 -> 83;
                case 230 -> 60;
                case 231 -> 229;
                case 232 -> 34;
                case 233 -> 142;
                case 234 -> 183;
                case 235 -> 51;
                case 236 -> 226;
                case 237 -> 196;
                case 238 -> 75;
                case 239 -> 232;
                case 240 -> 197;
                case 241 -> 23;
                case 242 -> 86;
                case 243 -> 107;
                case 244 -> 133;
                case 245 -> 178;
                case 246 -> 2;
                case 247 -> 89;
                case 248 -> 204;
                case 249 -> 224;
                case 250 -> 203;
                case 251 -> 246;
                case 252 -> 15;
                case 253 -> 168;
                case 254 -> 81;
                default -> 48;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                char[] cArray2 = cArray;
                char c = cArray[n10];
                if (n9 == 0) {
                    cArray2[n10] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                } else {
                    cArray2[n10] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n8]) & 0xFF;
                }
                ++n8;
            }
            e5.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x62A8;
        if (e[n2] == null) {
            e5.e[n2] = (int)(c[n2] ^ l);
        }
        return e[n2];
    }
}
