/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XG;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;

public class B
extends e {
    public final XG S = hi.a("\u00a5", (Object)this, (Object)B.b(22511, 32647), (int)0, (int)0, (int)4, (int)1, (long)1094453040828645510L);
    public static final B L;
    private static final String[] a;
    private static final String[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u0006\u00a1;\u0097{[\u0005$$k\u0085\u0017\b\u00d1\u008a\u001f!\u0093H\u00c3D";
            var4_3 = "\u0006\u00a1;\u0097{[\u0005$$k\u0085\u0017\b\u00d1\u008a\u001f!\u0093H\u00c3D".length();
            var1_4 = 12;
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
            v4 = 6;
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
                            v11 = 38;
                            break;
                        }
                        case 1: {
                            v11 = 73;
                            break;
                        }
                        case 2: {
                            v11 = 99;
                            break;
                        }
                        case 3: {
                            v11 = 113;
                            break;
                        }
                        case 4: {
                            v11 = 60;
                            break;
                        }
                        case 5: {
                            v11 = 10;
                            break;
                        }
                        default: {
                            v11 = 111;
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
        B.a = var5;
        B.b = new String[2];
        B.L = new B();
    }

    private B() {
        super(B.b(22510, 27971), (vY)((Object)hi.a("j", (long)526176563220736169L)));
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x57EE) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 47;
                case 1 -> 249;
                case 2 -> 21;
                case 3 -> 61;
                case 4 -> 164;
                case 5 -> 194;
                case 6 -> 140;
                case 7 -> 192;
                case 8 -> 101;
                case 9 -> 157;
                case 10 -> 67;
                case 11 -> 200;
                case 12 -> 18;
                case 13 -> 152;
                case 14 -> 168;
                case 15 -> 82;
                case 16 -> 63;
                case 17 -> 20;
                case 18 -> 23;
                case 19 -> 247;
                case 20 -> 6;
                case 21 -> 236;
                case 22 -> 215;
                case 23 -> 186;
                case 24 -> 234;
                case 25 -> 214;
                case 26 -> 44;
                case 27 -> 251;
                case 28 -> 83;
                case 29 -> 182;
                case 30 -> 114;
                case 31 -> 60;
                case 32 -> 51;
                case 33 -> 183;
                case 34 -> 0;
                case 35 -> 2;
                case 36 -> 135;
                case 37 -> 154;
                case 38 -> 208;
                case 39 -> 163;
                case 40 -> 116;
                case 41 -> 171;
                case 42 -> 129;
                case 43 -> 142;
                case 44 -> 40;
                case 45 -> 235;
                case 46 -> 239;
                case 47 -> 123;
                case 48 -> 87;
                case 49 -> 16;
                case 50 -> 216;
                case 51 -> 248;
                case 52 -> 55;
                case 53 -> 166;
                case 54 -> 133;
                case 55 -> 80;
                case 56 -> 100;
                case 57 -> 136;
                case 58 -> 86;
                case 59 -> 117;
                case 60 -> 209;
                case 61 -> 128;
                case 62 -> 52;
                case 63 -> 17;
                case 64 -> 237;
                case 65 -> 165;
                case 66 -> 178;
                case 67 -> 96;
                case 68 -> 32;
                case 69 -> 38;
                case 70 -> 104;
                case 71 -> 30;
                case 72 -> 199;
                case 73 -> 84;
                case 74 -> 228;
                case 75 -> 110;
                case 76 -> 112;
                case 77 -> 108;
                case 78 -> 7;
                case 79 -> 12;
                case 80 -> 150;
                case 81 -> 159;
                case 82 -> 25;
                case 83 -> 119;
                case 84 -> 252;
                case 85 -> 122;
                case 86 -> 74;
                case 87 -> 11;
                case 88 -> 149;
                case 89 -> 176;
                case 90 -> 97;
                case 91 -> 76;
                case 92 -> 33;
                case 93 -> 90;
                case 94 -> 65;
                case 95 -> 185;
                case 96 -> 139;
                case 97 -> 161;
                case 98 -> 56;
                case 99 -> 253;
                case 100 -> 225;
                case 101 -> 196;
                case 102 -> 9;
                case 103 -> 57;
                case 104 -> 59;
                case 105 -> 203;
                case 106 -> 14;
                case 107 -> 160;
                case 108 -> 158;
                case 109 -> 50;
                case 110 -> 31;
                case 111 -> 53;
                case 112 -> 4;
                case 113 -> 66;
                case 114 -> 127;
                case 115 -> 229;
                case 116 -> 220;
                case 117 -> 218;
                case 118 -> 162;
                case 119 -> 206;
                case 120 -> 45;
                case 121 -> 226;
                case 122 -> 34;
                case 123 -> 13;
                case 124 -> 205;
                case 125 -> 8;
                case 126 -> 62;
                case 127 -> 217;
                case 128 -> 91;
                case 129 -> 19;
                case 130 -> 58;
                case 131 -> 175;
                case 132 -> 204;
                case 133 -> 138;
                case 134 -> 224;
                case 135 -> 232;
                case 136 -> 242;
                case 137 -> 151;
                case 138 -> 191;
                case 139 -> 141;
                case 140 -> 202;
                case 141 -> 118;
                case 142 -> 211;
                case 143 -> 37;
                case 144 -> 54;
                case 145 -> 222;
                case 146 -> 71;
                case 147 -> 146;
                case 148 -> 106;
                case 149 -> 46;
                case 150 -> 39;
                case 151 -> 99;
                case 152 -> 179;
                case 153 -> 193;
                case 154 -> 24;
                case 155 -> 156;
                case 156 -> 153;
                case 157 -> 233;
                case 158 -> 93;
                case 159 -> 28;
                case 160 -> 79;
                case 161 -> 134;
                case 162 -> 36;
                case 163 -> 77;
                case 164 -> 120;
                case 165 -> 41;
                case 166 -> 245;
                case 167 -> 145;
                case 168 -> 89;
                case 169 -> 223;
                case 170 -> 88;
                case 171 -> 98;
                case 172 -> 103;
                case 173 -> 148;
                case 174 -> 48;
                case 175 -> 188;
                case 176 -> 155;
                case 177 -> 241;
                case 178 -> 81;
                case 179 -> 69;
                case 180 -> 115;
                case 181 -> 130;
                case 182 -> 219;
                case 183 -> 78;
                case 184 -> 15;
                case 185 -> 173;
                case 186 -> 244;
                case 187 -> 250;
                case 188 -> 131;
                case 189 -> 143;
                case 190 -> 255;
                case 191 -> 181;
                case 192 -> 42;
                case 193 -> 137;
                case 194 -> 210;
                case 195 -> 121;
                case 196 -> 187;
                case 197 -> 75;
                case 198 -> 72;
                case 199 -> 109;
                case 200 -> 227;
                case 201 -> 26;
                case 202 -> 174;
                case 203 -> 35;
                case 204 -> 3;
                case 205 -> 111;
                case 206 -> 231;
                case 207 -> 105;
                case 208 -> 230;
                case 209 -> 238;
                case 210 -> 95;
                case 211 -> 167;
                case 212 -> 144;
                case 213 -> 212;
                case 214 -> 169;
                case 215 -> 177;
                case 216 -> 184;
                case 217 -> 172;
                case 218 -> 125;
                case 219 -> 107;
                case 220 -> 64;
                case 221 -> 124;
                case 222 -> 49;
                case 223 -> 68;
                case 224 -> 102;
                case 225 -> 243;
                case 226 -> 85;
                case 227 -> 207;
                case 228 -> 195;
                case 229 -> 10;
                case 230 -> 180;
                case 231 -> 29;
                case 232 -> 70;
                case 233 -> 5;
                case 234 -> 43;
                case 235 -> 221;
                case 236 -> 132;
                case 237 -> 27;
                case 238 -> 73;
                case 239 -> 246;
                case 240 -> 189;
                case 241 -> 213;
                case 242 -> 126;
                case 243 -> 197;
                case 244 -> 198;
                case 245 -> 92;
                case 246 -> 113;
                case 247 -> 254;
                case 248 -> 1;
                case 249 -> 190;
                case 250 -> 201;
                case 251 -> 240;
                case 252 -> 147;
                case 253 -> 94;
                case 254 -> 170;
                default -> 22;
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
            B.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
