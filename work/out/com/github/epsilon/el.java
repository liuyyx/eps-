/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;

public class el
extends e {
    public final DM C = hi.a("\u00a5", (Object)this, (Object)el.b(-12473, 26986), (double)1.78, (double)0.1, (double)8.0, (double)0.1, (long)1077996338587307774L);
    public static final el h;
    private static final String[] a;
    private static final String[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "h\u00b8,L\u00fdd\u0089^\u0012\u009fE\u0003\u0005C`<\u000bw";
            var4_3 = "h\u00b8,L\u00fdd\u0089^\u0012\u009fE\u0003\u0005C`<\u000bw".length();
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
            v4 = 32;
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
                            v11 = 120;
                            break;
                        }
                        case 1: {
                            v11 = 105;
                            break;
                        }
                        case 2: {
                            v11 = 19;
                            break;
                        }
                        case 3: {
                            v11 = 42;
                            break;
                        }
                        case 4: {
                            v11 = 35;
                            break;
                        }
                        case 5: {
                            v11 = 49;
                            break;
                        }
                        default: {
                            v11 = 89;
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
        el.a = var5;
        el.b = new String[2];
        el.h = new el();
    }

    private el() {
        super(el.b(-12474, -15695), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFCF46) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 22;
                case 1 -> 0;
                case 2 -> 218;
                case 3 -> 51;
                case 4 -> 170;
                case 5 -> 101;
                case 6 -> 194;
                case 7 -> 183;
                case 8 -> 105;
                case 9 -> 32;
                case 10 -> 230;
                case 11 -> 139;
                case 12 -> 8;
                case 13 -> 147;
                case 14 -> 201;
                case 15 -> 138;
                case 16 -> 235;
                case 17 -> 242;
                case 18 -> 161;
                case 19 -> 205;
                case 20 -> 31;
                case 21 -> 191;
                case 22 -> 133;
                case 23 -> 166;
                case 24 -> 82;
                case 25 -> 225;
                case 26 -> 37;
                case 27 -> 33;
                case 28 -> 120;
                case 29 -> 119;
                case 30 -> 255;
                case 31 -> 75;
                case 32 -> 251;
                case 33 -> 198;
                case 34 -> 247;
                case 35 -> 200;
                case 36 -> 79;
                case 37 -> 153;
                case 38 -> 208;
                case 39 -> 176;
                case 40 -> 53;
                case 41 -> 58;
                case 42 -> 220;
                case 43 -> 142;
                case 44 -> 188;
                case 45 -> 12;
                case 46 -> 41;
                case 47 -> 184;
                case 48 -> 64;
                case 49 -> 77;
                case 50 -> 10;
                case 51 -> 67;
                case 52 -> 233;
                case 53 -> 185;
                case 54 -> 132;
                case 55 -> 2;
                case 56 -> 108;
                case 57 -> 196;
                case 58 -> 74;
                case 59 -> 164;
                case 60 -> 238;
                case 61 -> 56;
                case 62 -> 72;
                case 63 -> 81;
                case 64 -> 136;
                case 65 -> 253;
                case 66 -> 52;
                case 67 -> 143;
                case 68 -> 68;
                case 69 -> 154;
                case 70 -> 65;
                case 71 -> 240;
                case 72 -> 15;
                case 73 -> 162;
                case 74 -> 125;
                case 75 -> 149;
                case 76 -> 7;
                case 77 -> 98;
                case 78 -> 181;
                case 79 -> 4;
                case 80 -> 46;
                case 81 -> 140;
                case 82 -> 13;
                case 83 -> 224;
                case 84 -> 209;
                case 85 -> 190;
                case 86 -> 186;
                case 87 -> 211;
                case 88 -> 207;
                case 89 -> 45;
                case 90 -> 103;
                case 91 -> 124;
                case 92 -> 135;
                case 93 -> 24;
                case 94 -> 9;
                case 95 -> 21;
                case 96 -> 23;
                case 97 -> 71;
                case 98 -> 232;
                case 99 -> 165;
                case 100 -> 241;
                case 101 -> 203;
                case 102 -> 189;
                case 103 -> 96;
                case 104 -> 93;
                case 105 -> 34;
                case 106 -> 92;
                case 107 -> 169;
                case 108 -> 173;
                case 109 -> 84;
                case 110 -> 192;
                case 111 -> 197;
                case 112 -> 215;
                case 113 -> 111;
                case 114 -> 178;
                case 115 -> 39;
                case 116 -> 137;
                case 117 -> 28;
                case 118 -> 239;
                case 119 -> 106;
                case 120 -> 223;
                case 121 -> 195;
                case 122 -> 117;
                case 123 -> 204;
                case 124 -> 187;
                case 125 -> 85;
                case 126 -> 210;
                case 127 -> 252;
                case 128 -> 159;
                case 129 -> 110;
                case 130 -> 104;
                case 131 -> 227;
                case 132 -> 141;
                case 133 -> 35;
                case 134 -> 76;
                case 135 -> 88;
                case 136 -> 78;
                case 137 -> 199;
                case 138 -> 50;
                case 139 -> 16;
                case 140 -> 171;
                case 141 -> 127;
                case 142 -> 151;
                case 143 -> 254;
                case 144 -> 237;
                case 145 -> 174;
                case 146 -> 116;
                case 147 -> 216;
                case 148 -> 175;
                case 149 -> 70;
                case 150 -> 145;
                case 151 -> 244;
                case 152 -> 25;
                case 153 -> 54;
                case 154 -> 172;
                case 155 -> 214;
                case 156 -> 202;
                case 157 -> 47;
                case 158 -> 6;
                case 159 -> 43;
                case 160 -> 86;
                case 161 -> 246;
                case 162 -> 156;
                case 163 -> 95;
                case 164 -> 206;
                case 165 -> 131;
                case 166 -> 115;
                case 167 -> 160;
                case 168 -> 180;
                case 169 -> 3;
                case 170 -> 48;
                case 171 -> 80;
                case 172 -> 148;
                case 173 -> 44;
                case 174 -> 234;
                case 175 -> 102;
                case 176 -> 248;
                case 177 -> 219;
                case 178 -> 90;
                case 179 -> 107;
                case 180 -> 62;
                case 181 -> 163;
                case 182 -> 36;
                case 183 -> 89;
                case 184 -> 17;
                case 185 -> 212;
                case 186 -> 109;
                case 187 -> 243;
                case 188 -> 118;
                case 189 -> 179;
                case 190 -> 193;
                case 191 -> 59;
                case 192 -> 14;
                case 193 -> 27;
                case 194 -> 49;
                case 195 -> 157;
                case 196 -> 228;
                case 197 -> 73;
                case 198 -> 245;
                case 199 -> 99;
                case 200 -> 30;
                case 201 -> 66;
                case 202 -> 83;
                case 203 -> 112;
                case 204 -> 250;
                case 205 -> 11;
                case 206 -> 221;
                case 207 -> 144;
                case 208 -> 1;
                case 209 -> 177;
                case 210 -> 146;
                case 211 -> 114;
                case 212 -> 213;
                case 213 -> 5;
                case 214 -> 87;
                case 215 -> 134;
                case 216 -> 182;
                case 217 -> 152;
                case 218 -> 249;
                case 219 -> 61;
                case 220 -> 236;
                case 221 -> 122;
                case 222 -> 129;
                case 223 -> 229;
                case 224 -> 29;
                case 225 -> 18;
                case 226 -> 167;
                case 227 -> 155;
                case 228 -> 121;
                case 229 -> 217;
                case 230 -> 63;
                case 231 -> 150;
                case 232 -> 69;
                case 233 -> 126;
                case 234 -> 168;
                case 235 -> 38;
                case 236 -> 91;
                case 237 -> 20;
                case 238 -> 97;
                case 239 -> 130;
                case 240 -> 128;
                case 241 -> 226;
                case 242 -> 123;
                case 243 -> 113;
                case 244 -> 40;
                case 245 -> 55;
                case 246 -> 42;
                case 247 -> 26;
                case 248 -> 19;
                case 249 -> 158;
                case 250 -> 60;
                case 251 -> 100;
                case 252 -> 94;
                case 253 -> 222;
                case 254 -> 231;
                default -> 57;
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
            el.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
