/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XG;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;

public class s
extends e {
    public static final s u;
    public final XG P = hi.a("\u00a5", (Object)this, (Object)s.b(-18022, -19294), (int)0, (int)0, (int)((int)c), (int)1, (long)1094453040828645510L);
    private static final String[] a;
    private static final String[] b;
    private static final long c;

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block14: {
                var7 = new String[2];
                var5_1 = 0;
                var4_2 = "\u008b\u00dd\u0085\u0003t\u0002\u00df\u00a8\u00e3i\u00e1\u0096\u008f\bv3\u0010\u009b\u00c0\u00a2\u009d\u0014";
                var6_3 = "\u008b\u00dd\u0085\u0003t\u0002\u00df\u00a8\u00e3i\u00e1\u0096\u008f\bv3\u0010\u009b\u00c0\u00a2\u009d\u0014".length();
                var3_4 = 13;
                var2_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var7[var5_1++] = new String(v0).intern();
                    if ((var2_5 += var3_4) < var6_3) {
                        var3_4 = var4_2.charAt(var2_5);
                        ** continue;
                    }
                    break block14;
                    break;
                }
                v1 = ++var2_5;
                v2 = var4_2.substring(v1, v1 + var3_4).toCharArray();
                v3 = v2.length;
                var8_6 = 0;
                v4 = 32;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl67
                do {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v11 = 39;
                                break;
                            }
                            case 1: {
                                v11 = 56;
                                break;
                            }
                            case 2: {
                                v11 = 90;
                                break;
                            }
                            case 3: {
                                v11 = 48;
                                break;
                            }
                            case 4: {
                                v11 = 75;
                                break;
                            }
                            case 5: {
                                v11 = 125;
                                break;
                            }
                            default: {
                                v11 = 87;
                            }
                        }
                        v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                        ++var8_6;
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
                } while (v6 > var8_6);
                ** while (true)
            }
            s.a = var7;
            s.b = new String[2];
            break block15;
lbl78:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 6030778140075161589L;
        ** while (true)
        s.c = 2432853645027375100L ^ var0_7;
        s.u = new s();
    }

    private s() {
        super(s.b(-18021, 5162), (vY)((Object)hi.a("j", (long)526176563220736169L)));
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFB99B) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 45;
                case 1 -> 162;
                case 2 -> 169;
                case 3 -> 238;
                case 4 -> 20;
                case 5 -> 167;
                case 6 -> 39;
                case 7 -> 46;
                case 8 -> 173;
                case 9 -> 228;
                case 10 -> 120;
                case 11 -> 202;
                case 12 -> 250;
                case 13 -> 22;
                case 14 -> 72;
                case 15 -> 188;
                case 16 -> 213;
                case 17 -> 16;
                case 18 -> 116;
                case 19 -> 243;
                case 20 -> 144;
                case 21 -> 210;
                case 22 -> 23;
                case 23 -> 67;
                case 24 -> 229;
                case 25 -> 52;
                case 26 -> 82;
                case 27 -> 179;
                case 28 -> 252;
                case 29 -> 130;
                case 30 -> 142;
                case 31 -> 38;
                case 32 -> 161;
                case 33 -> 92;
                case 34 -> 107;
                case 35 -> 124;
                case 36 -> 99;
                case 37 -> 127;
                case 38 -> 201;
                case 39 -> 36;
                case 40 -> 148;
                case 41 -> 2;
                case 42 -> 33;
                case 43 -> 58;
                case 44 -> 97;
                case 45 -> 30;
                case 46 -> 9;
                case 47 -> 88;
                case 48 -> 114;
                case 49 -> 18;
                case 50 -> 156;
                case 51 -> 200;
                case 52 -> 122;
                case 53 -> 7;
                case 54 -> 190;
                case 55 -> 224;
                case 56 -> 1;
                case 57 -> 147;
                case 58 -> 165;
                case 59 -> 68;
                case 60 -> 145;
                case 61 -> 196;
                case 62 -> 104;
                case 63 -> 141;
                case 64 -> 218;
                case 65 -> 195;
                case 66 -> 34;
                case 67 -> 254;
                case 68 -> 59;
                case 69 -> 6;
                case 70 -> 180;
                case 71 -> 137;
                case 72 -> 109;
                case 73 -> 106;
                case 74 -> 193;
                case 75 -> 219;
                case 76 -> 131;
                case 77 -> 31;
                case 78 -> 40;
                case 79 -> 255;
                case 80 -> 220;
                case 81 -> 79;
                case 82 -> 28;
                case 83 -> 71;
                case 84 -> 56;
                case 85 -> 160;
                case 86 -> 212;
                case 87 -> 168;
                case 88 -> 149;
                case 89 -> 232;
                case 90 -> 101;
                case 91 -> 121;
                case 92 -> 4;
                case 93 -> 75;
                case 94 -> 154;
                case 95 -> 172;
                case 96 -> 227;
                case 97 -> 166;
                case 98 -> 246;
                case 99 -> 32;
                case 100 -> 66;
                case 101 -> 207;
                case 102 -> 53;
                case 103 -> 138;
                case 104 -> 19;
                case 105 -> 51;
                case 106 -> 253;
                case 107 -> 64;
                case 108 -> 208;
                case 109 -> 176;
                case 110 -> 61;
                case 111 -> 69;
                case 112 -> 191;
                case 113 -> 112;
                case 114 -> 29;
                case 115 -> 81;
                case 116 -> 230;
                case 117 -> 80;
                case 118 -> 234;
                case 119 -> 151;
                case 120 -> 146;
                case 121 -> 235;
                case 122 -> 159;
                case 123 -> 83;
                case 124 -> 192;
                case 125 -> 247;
                case 126 -> 21;
                case 127 -> 93;
                case 128 -> 249;
                case 129 -> 183;
                case 130 -> 241;
                case 131 -> 204;
                case 132 -> 84;
                case 133 -> 221;
                case 134 -> 35;
                case 135 -> 248;
                case 136 -> 115;
                case 137 -> 77;
                case 138 -> 47;
                case 139 -> 153;
                case 140 -> 100;
                case 141 -> 189;
                case 142 -> 226;
                case 143 -> 70;
                case 144 -> 63;
                case 145 -> 62;
                case 146 -> 102;
                case 147 -> 119;
                case 148 -> 209;
                case 149 -> 12;
                case 150 -> 206;
                case 151 -> 136;
                case 152 -> 244;
                case 153 -> 27;
                case 154 -> 26;
                case 155 -> 163;
                case 156 -> 94;
                case 157 -> 233;
                case 158 -> 139;
                case 159 -> 155;
                case 160 -> 175;
                case 161 -> 111;
                case 162 -> 55;
                case 163 -> 95;
                case 164 -> 89;
                case 165 -> 105;
                case 166 -> 178;
                case 167 -> 43;
                case 168 -> 118;
                case 169 -> 14;
                case 170 -> 216;
                case 171 -> 177;
                case 172 -> 222;
                case 173 -> 132;
                case 174 -> 44;
                case 175 -> 98;
                case 176 -> 85;
                case 177 -> 215;
                case 178 -> 170;
                case 179 -> 3;
                case 180 -> 129;
                case 181 -> 87;
                case 182 -> 90;
                case 183 -> 203;
                case 184 -> 171;
                case 185 -> 74;
                case 186 -> 164;
                case 187 -> 8;
                case 188 -> 181;
                case 189 -> 78;
                case 190 -> 128;
                case 191 -> 133;
                case 192 -> 186;
                case 193 -> 54;
                case 194 -> 24;
                case 195 -> 194;
                case 196 -> 239;
                case 197 -> 57;
                case 198 -> 117;
                case 199 -> 76;
                case 200 -> 73;
                case 201 -> 15;
                case 202 -> 158;
                case 203 -> 174;
                case 204 -> 217;
                case 205 -> 245;
                case 206 -> 198;
                case 207 -> 37;
                case 208 -> 108;
                case 209 -> 25;
                case 210 -> 86;
                case 211 -> 96;
                case 212 -> 5;
                case 213 -> 103;
                case 214 -> 10;
                case 215 -> 125;
                case 216 -> 60;
                case 217 -> 240;
                case 218 -> 42;
                case 219 -> 0;
                case 220 -> 236;
                case 221 -> 251;
                case 222 -> 41;
                case 223 -> 17;
                case 224 -> 242;
                case 225 -> 187;
                case 226 -> 123;
                case 227 -> 140;
                case 228 -> 199;
                case 229 -> 205;
                case 230 -> 13;
                case 231 -> 184;
                case 232 -> 134;
                case 233 -> 110;
                case 234 -> 214;
                case 235 -> 197;
                case 236 -> 237;
                case 237 -> 91;
                case 238 -> 135;
                case 239 -> 150;
                case 240 -> 126;
                case 241 -> 152;
                case 242 -> 157;
                case 243 -> 225;
                case 244 -> 143;
                case 245 -> 211;
                case 246 -> 49;
                case 247 -> 182;
                case 248 -> 11;
                case 249 -> 231;
                case 250 -> 113;
                case 251 -> 185;
                case 252 -> 223;
                case 253 -> 65;
                case 254 -> 48;
                default -> 50;
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
            s.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
