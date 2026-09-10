/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uT;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;

public final class vY
extends Enum<vY> {
    public final String icon;
    public static final /* enum */ vY RENDER;
    private final String t;
    private static final /* synthetic */ vY[] F;
    public static final /* enum */ vY PLAYER;
    private final uT n;
    public static final /* enum */ vY MOVEMENT;
    public static final /* enum */ vY COMBAT;
    private static int u;
    private static final String[] a;
    private static final String[] b;

    public static vY valueOf(String string) {
        return (vY)((Object)hi.a("G", vY.class, (Object)string, (long)703426484721789552L));
    }

    private vY(String string2, String string3) {
        this.icon = string2;
        this.t = string3;
        this.n = hi.a("G", vY.a(13104, 17338), (Object)string3, (long)985871884373461503L);
    }

    public String toString() {
        return hi.a("\u00e9", (Object)((Object)this), (long)427240939266460497L);
    }

    public static vY[] values() {
        return (vY[])((Enum)((Object)hi.a("j", (long)1056523497094167735L))).clone();
    }

    static {
        IlilIlIlil.registerNativesForClass((int)29, vY.class);
        Hidden0.special_clinit_29_40(vY.class);
    }

    private static /* synthetic */ vY[] z(Object[] objectArray) {
        return new vY[]{hi.a("j", (long)1119278030115886606L), hi.a("j", (long)526176563220736169L), hi.a("j", (long)456237291118568391L), hi.a("j", (long)1050408241407708132L)};
    }

    public String R() {
        return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)955267469605516895L), (long)1335171215242130397L);
    }

    public static void f(int n) {
        u = n;
    }

    public static int n() {
        return u;
    }

    public static int Q() {
        int n = vY.n();
        if (n == 0) {
            return 102;
        }
        return 0;
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x3331) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 135;
                case 1 -> 133;
                case 2 -> 124;
                case 3 -> 56;
                case 4 -> 13;
                case 5 -> 214;
                case 6 -> 58;
                case 7 -> 146;
                case 8 -> 197;
                case 9 -> 153;
                case 10 -> 193;
                case 11 -> 223;
                case 12 -> 230;
                case 13 -> 49;
                case 14 -> 98;
                case 15 -> 62;
                case 16 -> 189;
                case 17 -> 194;
                case 18 -> 161;
                case 19 -> 68;
                case 20 -> 100;
                case 21 -> 140;
                case 22 -> 86;
                case 23 -> 51;
                case 24 -> 154;
                case 25 -> 137;
                case 26 -> 184;
                case 27 -> 9;
                case 28 -> 206;
                case 29 -> 177;
                case 30 -> 25;
                case 31 -> 156;
                case 32 -> 65;
                case 33 -> 69;
                case 34 -> 226;
                case 35 -> 80;
                case 36 -> 138;
                case 37 -> 165;
                case 38 -> 73;
                case 39 -> 238;
                case 40 -> 235;
                case 41 -> 234;
                case 42 -> 252;
                case 43 -> 79;
                case 44 -> 55;
                case 45 -> 163;
                case 46 -> 101;
                case 47 -> 114;
                case 48 -> 195;
                case 49 -> 134;
                case 50 -> 88;
                case 51 -> 121;
                case 52 -> 64;
                case 53 -> 164;
                case 54 -> 190;
                case 55 -> 82;
                case 56 -> 212;
                case 57 -> 96;
                case 58 -> 187;
                case 59 -> 61;
                case 60 -> 236;
                case 61 -> 2;
                case 62 -> 75;
                case 63 -> 222;
                case 64 -> 54;
                case 65 -> 246;
                case 66 -> 242;
                case 67 -> 243;
                case 68 -> 94;
                case 69 -> 120;
                case 70 -> 210;
                case 71 -> 247;
                case 72 -> 203;
                case 73 -> 97;
                case 74 -> 179;
                case 75 -> 188;
                case 76 -> 52;
                case 77 -> 106;
                case 78 -> 71;
                case 79 -> 225;
                case 80 -> 201;
                case 81 -> 99;
                case 82 -> 237;
                case 83 -> 143;
                case 84 -> 171;
                case 85 -> 170;
                case 86 -> 147;
                case 87 -> 60;
                case 88 -> 39;
                case 89 -> 23;
                case 90 -> 7;
                case 91 -> 50;
                case 92 -> 22;
                case 93 -> 126;
                case 94 -> 4;
                case 95 -> 180;
                case 96 -> 176;
                case 97 -> 228;
                case 98 -> 44;
                case 99 -> 232;
                case 100 -> 110;
                case 101 -> 209;
                case 102 -> 57;
                case 103 -> 63;
                case 104 -> 148;
                case 105 -> 249;
                case 106 -> 27;
                case 107 -> 72;
                case 108 -> 29;
                case 109 -> 245;
                case 110 -> 142;
                case 111 -> 239;
                case 112 -> 160;
                case 113 -> 53;
                case 114 -> 231;
                case 115 -> 136;
                case 116 -> 127;
                case 117 -> 151;
                case 118 -> 47;
                case 119 -> 208;
                case 120 -> 248;
                case 121 -> 158;
                case 122 -> 18;
                case 123 -> 33;
                case 124 -> 111;
                case 125 -> 91;
                case 126 -> 0;
                case 127 -> 205;
                case 128 -> 141;
                case 129 -> 8;
                case 130 -> 129;
                case 131 -> 174;
                case 132 -> 255;
                case 133 -> 128;
                case 134 -> 30;
                case 135 -> 250;
                case 136 -> 24;
                case 137 -> 5;
                case 138 -> 181;
                case 139 -> 155;
                case 140 -> 90;
                case 141 -> 218;
                case 142 -> 178;
                case 143 -> 105;
                case 144 -> 45;
                case 145 -> 3;
                case 146 -> 46;
                case 147 -> 192;
                case 148 -> 26;
                case 149 -> 19;
                case 150 -> 215;
                case 151 -> 76;
                case 152 -> 107;
                case 153 -> 119;
                case 154 -> 168;
                case 155 -> 48;
                case 156 -> 84;
                case 157 -> 217;
                case 158 -> 95;
                case 159 -> 37;
                case 160 -> 109;
                case 161 -> 199;
                case 162 -> 113;
                case 163 -> 145;
                case 164 -> 204;
                case 165 -> 59;
                case 166 -> 221;
                case 167 -> 89;
                case 168 -> 15;
                case 169 -> 103;
                case 170 -> 66;
                case 171 -> 253;
                case 172 -> 85;
                case 173 -> 172;
                case 174 -> 14;
                case 175 -> 191;
                case 176 -> 78;
                case 177 -> 35;
                case 178 -> 173;
                case 179 -> 125;
                case 180 -> 254;
                case 181 -> 102;
                case 182 -> 21;
                case 183 -> 166;
                case 184 -> 93;
                case 185 -> 28;
                case 186 -> 224;
                case 187 -> 167;
                case 188 -> 219;
                case 189 -> 152;
                case 190 -> 229;
                case 191 -> 83;
                case 192 -> 200;
                case 193 -> 32;
                case 194 -> 183;
                case 195 -> 117;
                case 196 -> 149;
                case 197 -> 251;
                case 198 -> 38;
                case 199 -> 196;
                case 200 -> 40;
                case 201 -> 144;
                case 202 -> 74;
                case 203 -> 108;
                case 204 -> 70;
                case 205 -> 227;
                case 206 -> 34;
                case 207 -> 132;
                case 208 -> 123;
                case 209 -> 87;
                case 210 -> 116;
                case 211 -> 31;
                case 212 -> 244;
                case 213 -> 157;
                case 214 -> 240;
                case 215 -> 43;
                case 216 -> 175;
                case 217 -> 112;
                case 218 -> 6;
                case 219 -> 12;
                case 220 -> 42;
                case 221 -> 104;
                case 222 -> 150;
                case 223 -> 169;
                case 224 -> 207;
                case 225 -> 20;
                case 226 -> 233;
                case 227 -> 92;
                case 228 -> 198;
                case 229 -> 241;
                case 230 -> 186;
                case 231 -> 216;
                case 232 -> 17;
                case 233 -> 115;
                case 234 -> 77;
                case 235 -> 220;
                case 236 -> 162;
                case 237 -> 67;
                case 238 -> 211;
                case 239 -> 159;
                case 240 -> 16;
                case 241 -> 1;
                case 242 -> 11;
                case 243 -> 213;
                case 244 -> 41;
                case 245 -> 131;
                case 246 -> 118;
                case 247 -> 10;
                case 248 -> 202;
                case 249 -> 130;
                case 250 -> 182;
                case 251 -> 139;
                case 252 -> 122;
                case 253 -> 185;
                case 254 -> 81;
                default -> 36;
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
            vY.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
