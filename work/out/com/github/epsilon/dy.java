/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uT;

public class dy {
    private static final String W;
    private static final String[] a;
    private static final String[] b;

    public static uT q(String string, String string2) {
        return hi.a("G", (Object)new Object[]{dy.a(-2026, -7742) + string + "." + string2}, (long)761180053284047754L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u00d5\u00f3\u00a8\u0017\u00fa\u00ac\u00d0\b\u0083\u00f6b\u00b7\u00a3\u00b8\u00fbp";
            var4_3 = "\u00d5\u00f3\u00a8\u0017\u00fa\u00ac\u00d0\b\u0083\u00f6b\u00b7\u00a3\u00b8\u00fbp".length();
            var1_4 = 7;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 88;
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
                            v11 = 118;
                            break;
                        }
                        case 1: {
                            v11 = 57;
                            break;
                        }
                        case 2: {
                            v11 = 53;
                            break;
                        }
                        case 3: {
                            v11 = 10;
                            break;
                        }
                        case 4: {
                            v11 = 107;
                            break;
                        }
                        case 5: {
                            v11 = 119;
                            break;
                        }
                        default: {
                            v11 = 62;
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
        dy.a = var5;
        dy.b = new String[2];
        dy.W = dy.a(-2025, -26540);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFF817) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 169;
                case 1 -> 213;
                case 2 -> 160;
                case 3 -> 95;
                case 4 -> 195;
                case 5 -> 226;
                case 6 -> 125;
                case 7 -> 201;
                case 8 -> 178;
                case 9 -> 20;
                case 10 -> 80;
                case 11 -> 35;
                case 12 -> 244;
                case 13 -> 90;
                case 14 -> 215;
                case 15 -> 205;
                case 16 -> 224;
                case 17 -> 67;
                case 18 -> 137;
                case 19 -> 79;
                case 20 -> 41;
                case 21 -> 39;
                case 22 -> 89;
                case 23 -> 38;
                case 24 -> 124;
                case 25 -> 113;
                case 26 -> 6;
                case 27 -> 242;
                case 28 -> 229;
                case 29 -> 248;
                case 30 -> 22;
                case 31 -> 112;
                case 32 -> 132;
                case 33 -> 144;
                case 34 -> 153;
                case 35 -> 219;
                case 36 -> 118;
                case 37 -> 15;
                case 38 -> 69;
                case 39 -> 65;
                case 40 -> 145;
                case 41 -> 14;
                case 42 -> 72;
                case 43 -> 212;
                case 44 -> 82;
                case 45 -> 177;
                case 46 -> 29;
                case 47 -> 255;
                case 48 -> 77;
                case 49 -> 233;
                case 50 -> 209;
                case 51 -> 27;
                case 52 -> 190;
                case 53 -> 175;
                case 54 -> 155;
                case 55 -> 197;
                case 56 -> 1;
                case 57 -> 116;
                case 58 -> 8;
                case 59 -> 86;
                case 60 -> 192;
                case 61 -> 249;
                case 62 -> 12;
                case 63 -> 140;
                case 64 -> 237;
                case 65 -> 16;
                case 66 -> 97;
                case 67 -> 247;
                case 68 -> 13;
                case 69 -> 176;
                case 70 -> 3;
                case 71 -> 76;
                case 72 -> 134;
                case 73 -> 33;
                case 74 -> 198;
                case 75 -> 68;
                case 76 -> 71;
                case 77 -> 227;
                case 78 -> 228;
                case 79 -> 136;
                case 80 -> 74;
                case 81 -> 181;
                case 82 -> 55;
                case 83 -> 216;
                case 84 -> 121;
                case 85 -> 127;
                case 86 -> 5;
                case 87 -> 243;
                case 88 -> 240;
                case 89 -> 106;
                case 90 -> 36;
                case 91 -> 24;
                case 92 -> 148;
                case 93 -> 23;
                case 94 -> 238;
                case 95 -> 161;
                case 96 -> 166;
                case 97 -> 162;
                case 98 -> 147;
                case 99 -> 17;
                case 100 -> 99;
                case 101 -> 109;
                case 102 -> 44;
                case 103 -> 119;
                case 104 -> 60;
                case 105 -> 206;
                case 106 -> 135;
                case 107 -> 49;
                case 108 -> 251;
                case 109 -> 64;
                case 110 -> 232;
                case 111 -> 203;
                case 112 -> 96;
                case 113 -> 131;
                case 114 -> 143;
                case 115 -> 104;
                case 116 -> 117;
                case 117 -> 193;
                case 118 -> 94;
                case 119 -> 78;
                case 120 -> 141;
                case 121 -> 157;
                case 122 -> 235;
                case 123 -> 58;
                case 124 -> 50;
                case 125 -> 98;
                case 126 -> 139;
                case 127 -> 129;
                case 128 -> 102;
                case 129 -> 61;
                case 130 -> 107;
                case 131 -> 9;
                case 132 -> 187;
                case 133 -> 151;
                case 134 -> 185;
                case 135 -> 51;
                case 136 -> 189;
                case 137 -> 75;
                case 138 -> 214;
                case 139 -> 222;
                case 140 -> 183;
                case 141 -> 184;
                case 142 -> 83;
                case 143 -> 37;
                case 144 -> 231;
                case 145 -> 246;
                case 146 -> 0;
                case 147 -> 207;
                case 148 -> 34;
                case 149 -> 85;
                case 150 -> 115;
                case 151 -> 200;
                case 152 -> 18;
                case 153 -> 223;
                case 154 -> 2;
                case 155 -> 110;
                case 156 -> 32;
                case 157 -> 254;
                case 158 -> 57;
                case 159 -> 252;
                case 160 -> 163;
                case 161 -> 26;
                case 162 -> 84;
                case 163 -> 174;
                case 164 -> 7;
                case 165 -> 103;
                case 166 -> 70;
                case 167 -> 146;
                case 168 -> 63;
                case 169 -> 101;
                case 170 -> 48;
                case 171 -> 46;
                case 172 -> 211;
                case 173 -> 250;
                case 174 -> 202;
                case 175 -> 130;
                case 176 -> 208;
                case 177 -> 66;
                case 178 -> 158;
                case 179 -> 230;
                case 180 -> 150;
                case 181 -> 173;
                case 182 -> 152;
                case 183 -> 111;
                case 184 -> 172;
                case 185 -> 47;
                case 186 -> 170;
                case 187 -> 30;
                case 188 -> 210;
                case 189 -> 114;
                case 190 -> 221;
                case 191 -> 156;
                case 192 -> 105;
                case 193 -> 186;
                case 194 -> 138;
                case 195 -> 179;
                case 196 -> 168;
                case 197 -> 194;
                case 198 -> 199;
                case 199 -> 253;
                case 200 -> 196;
                case 201 -> 171;
                case 202 -> 62;
                case 203 -> 10;
                case 204 -> 204;
                case 205 -> 245;
                case 206 -> 241;
                case 207 -> 100;
                case 208 -> 225;
                case 209 -> 45;
                case 210 -> 122;
                case 211 -> 31;
                case 212 -> 43;
                case 213 -> 92;
                case 214 -> 40;
                case 215 -> 120;
                case 216 -> 28;
                case 217 -> 126;
                case 218 -> 59;
                case 219 -> 11;
                case 220 -> 239;
                case 221 -> 234;
                case 222 -> 128;
                case 223 -> 217;
                case 224 -> 191;
                case 225 -> 164;
                case 226 -> 180;
                case 227 -> 142;
                case 228 -> 21;
                case 229 -> 25;
                case 230 -> 88;
                case 231 -> 42;
                case 232 -> 52;
                case 233 -> 220;
                case 234 -> 87;
                case 235 -> 133;
                case 236 -> 73;
                case 237 -> 108;
                case 238 -> 91;
                case 239 -> 53;
                case 240 -> 4;
                case 241 -> 165;
                case 242 -> 188;
                case 243 -> 159;
                case 244 -> 149;
                case 245 -> 81;
                case 246 -> 123;
                case 247 -> 154;
                case 248 -> 167;
                case 249 -> 54;
                case 250 -> 93;
                case 251 -> 182;
                case 252 -> 19;
                case 253 -> 236;
                case 254 -> 218;
                default -> 56;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            dy.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
