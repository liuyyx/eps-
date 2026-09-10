/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XG;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;

public class et
extends e {
    public static final et E;
    public final XG k = hi.a("\u00a5", (Object)this, (Object)et.b(-5210, -18711), (int)0, (int)0, (int)5, (int)1, (long)1094453040828645510L);
    private static final String[] a;
    private static final String[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u0092T\u0010\f\u0090A\u008f\u00c8h\u00da0\u00e54\u0088\b\u0002\u00a1)\u0001\u00f3\u00039'";
            var4_3 = "\u0092T\u0010\f\u0090A\u008f\u00c8h\u00da0\u00e54\u0088\b\u0002\u00a1)\u0001\u00f3\u00039'".length();
            var1_4 = 14;
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
            v4 = 37;
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
                            v11 = 19;
                            break;
                        }
                        case 2: {
                            v11 = 69;
                            break;
                        }
                        case 3: {
                            v11 = 56;
                            break;
                        }
                        case 4: {
                            v11 = 25;
                            break;
                        }
                        case 5: {
                            v11 = 43;
                            break;
                        }
                        default: {
                            v11 = 122;
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
        et.a = var5;
        et.b = new String[2];
        et.E = new et();
    }

    private et() {
        super(et.b(-5209, -5998), (vY)((Object)hi.a("j", (long)526176563220736169L)));
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFEBA7) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 231;
                case 1 -> 149;
                case 2 -> 165;
                case 3 -> 168;
                case 4 -> 211;
                case 5 -> 142;
                case 6 -> 67;
                case 7 -> 75;
                case 8 -> 162;
                case 9 -> 199;
                case 10 -> 150;
                case 11 -> 77;
                case 12 -> 241;
                case 13 -> 173;
                case 14 -> 167;
                case 15 -> 201;
                case 16 -> 213;
                case 17 -> 195;
                case 18 -> 56;
                case 19 -> 158;
                case 20 -> 32;
                case 21 -> 85;
                case 22 -> 114;
                case 23 -> 247;
                case 24 -> 66;
                case 25 -> 230;
                case 26 -> 188;
                case 27 -> 128;
                case 28 -> 242;
                case 29 -> 192;
                case 30 -> 212;
                case 31 -> 178;
                case 32 -> 136;
                case 33 -> 97;
                case 34 -> 223;
                case 35 -> 138;
                case 36 -> 107;
                case 37 -> 151;
                case 38 -> 45;
                case 39 -> 3;
                case 40 -> 225;
                case 41 -> 227;
                case 42 -> 10;
                case 43 -> 2;
                case 44 -> 83;
                case 45 -> 249;
                case 46 -> 11;
                case 47 -> 218;
                case 48 -> 159;
                case 49 -> 43;
                case 50 -> 215;
                case 51 -> 179;
                case 52 -> 121;
                case 53 -> 135;
                case 54 -> 254;
                case 55 -> 116;
                case 56 -> 14;
                case 57 -> 146;
                case 58 -> 127;
                case 59 -> 102;
                case 60 -> 187;
                case 61 -> 185;
                case 62 -> 1;
                case 63 -> 124;
                case 64 -> 94;
                case 65 -> 63;
                case 66 -> 19;
                case 67 -> 143;
                case 68 -> 90;
                case 69 -> 5;
                case 70 -> 219;
                case 71 -> 60;
                case 72 -> 200;
                case 73 -> 117;
                case 74 -> 81;
                case 75 -> 7;
                case 76 -> 133;
                case 77 -> 240;
                case 78 -> 184;
                case 79 -> 170;
                case 80 -> 64;
                case 81 -> 152;
                case 82 -> 76;
                case 83 -> 248;
                case 84 -> 17;
                case 85 -> 68;
                case 86 -> 115;
                case 87 -> 24;
                case 88 -> 104;
                case 89 -> 203;
                case 90 -> 42;
                case 91 -> 214;
                case 92 -> 193;
                case 93 -> 105;
                case 94 -> 182;
                case 95 -> 229;
                case 96 -> 183;
                case 97 -> 220;
                case 98 -> 228;
                case 99 -> 113;
                case 100 -> 92;
                case 101 -> 144;
                case 102 -> 23;
                case 103 -> 221;
                case 104 -> 190;
                case 105 -> 74;
                case 106 -> 204;
                case 107 -> 22;
                case 108 -> 238;
                case 109 -> 160;
                case 110 -> 0;
                case 111 -> 156;
                case 112 -> 120;
                case 113 -> 131;
                case 114 -> 108;
                case 115 -> 250;
                case 116 -> 148;
                case 117 -> 101;
                case 118 -> 125;
                case 119 -> 147;
                case 120 -> 164;
                case 121 -> 111;
                case 122 -> 166;
                case 123 -> 163;
                case 124 -> 106;
                case 125 -> 205;
                case 126 -> 194;
                case 127 -> 96;
                case 128 -> 145;
                case 129 -> 65;
                case 130 -> 207;
                case 131 -> 137;
                case 132 -> 196;
                case 133 -> 47;
                case 134 -> 139;
                case 135 -> 161;
                case 136 -> 110;
                case 137 -> 118;
                case 138 -> 243;
                case 139 -> 141;
                case 140 -> 8;
                case 141 -> 55;
                case 142 -> 73;
                case 143 -> 244;
                case 144 -> 20;
                case 145 -> 172;
                case 146 -> 255;
                case 147 -> 236;
                case 148 -> 232;
                case 149 -> 98;
                case 150 -> 6;
                case 151 -> 57;
                case 152 -> 36;
                case 153 -> 69;
                case 154 -> 180;
                case 155 -> 79;
                case 156 -> 174;
                case 157 -> 78;
                case 158 -> 130;
                case 159 -> 39;
                case 160 -> 12;
                case 161 -> 206;
                case 162 -> 175;
                case 163 -> 18;
                case 164 -> 239;
                case 165 -> 25;
                case 166 -> 99;
                case 167 -> 109;
                case 168 -> 224;
                case 169 -> 89;
                case 170 -> 233;
                case 171 -> 208;
                case 172 -> 112;
                case 173 -> 177;
                case 174 -> 49;
                case 175 -> 38;
                case 176 -> 16;
                case 177 -> 29;
                case 178 -> 126;
                case 179 -> 82;
                case 180 -> 251;
                case 181 -> 48;
                case 182 -> 62;
                case 183 -> 140;
                case 184 -> 226;
                case 185 -> 9;
                case 186 -> 217;
                case 187 -> 37;
                case 188 -> 21;
                case 189 -> 93;
                case 190 -> 189;
                case 191 -> 209;
                case 192 -> 72;
                case 193 -> 35;
                case 194 -> 191;
                case 195 -> 91;
                case 196 -> 71;
                case 197 -> 245;
                case 198 -> 28;
                case 199 -> 58;
                case 200 -> 253;
                case 201 -> 52;
                case 202 -> 171;
                case 203 -> 27;
                case 204 -> 119;
                case 205 -> 70;
                case 206 -> 61;
                case 207 -> 80;
                case 208 -> 103;
                case 209 -> 44;
                case 210 -> 237;
                case 211 -> 41;
                case 212 -> 53;
                case 213 -> 13;
                case 214 -> 84;
                case 215 -> 34;
                case 216 -> 155;
                case 217 -> 134;
                case 218 -> 222;
                case 219 -> 95;
                case 220 -> 197;
                case 221 -> 122;
                case 222 -> 31;
                case 223 -> 15;
                case 224 -> 246;
                case 225 -> 153;
                case 226 -> 100;
                case 227 -> 176;
                case 228 -> 33;
                case 229 -> 169;
                case 230 -> 50;
                case 231 -> 123;
                case 232 -> 186;
                case 233 -> 30;
                case 234 -> 132;
                case 235 -> 54;
                case 236 -> 87;
                case 237 -> 26;
                case 238 -> 51;
                case 239 -> 181;
                case 240 -> 157;
                case 241 -> 129;
                case 242 -> 210;
                case 243 -> 40;
                case 244 -> 59;
                case 245 -> 235;
                case 246 -> 46;
                case 247 -> 154;
                case 248 -> 216;
                case 249 -> 234;
                case 250 -> 4;
                case 251 -> 88;
                case 252 -> 202;
                case 253 -> 86;
                case 254 -> 252;
                default -> 198;
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
            et.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
