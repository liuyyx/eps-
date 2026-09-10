/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.iH;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class iP
extends iH {
    private static final String[] c;
    private static final String[] d;

    @Override
    public void e(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("j", (long)930465074088781133L), (Object)iP.b(30466, 7937), (long)1194075376202915765L);
    }

    @Override
    public List<String> w() {
        return iP.f("BGt7jznBjmfv5FYv", of(E E ), (Object)iP.b(30468, 8473), (Object)iP.b(30470, -2582));
    }

    @Override
    public String V(Object[] objectArray) {
        return hi.a("j", (long)870601565218635290L);
    }

    public iP() {
        super(iP.b(30467, 29450));
    }

    public static /* bridge */ /* synthetic */ CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    @Override
    public String R() {
        return iP.b(30469, -14079);
    }

    @Override
    public String z() {
        return iP.b(30471, -478);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = "\u00d0\u0090\u00cf!\u0018J\u0088\u001cZ\u0081\u00d2\u00bd\u00fe\u0080:\u0005\u0007u\u00d8jU0\u00e1Mf\u0012Z\u00bf7\u001b\u0081\u0098|\u009c9\u00fa\u008f\u0099\u0083\u00e7t\u00b7$\u0010\u00b8|D@\u00c5\u001f\u00ca\u00fd\u00c0\u00da\u0093\u00a3\u00f9\u0018v\n\u0004z\nJ\u0003n\u00cc\u00eb\u00ce\u00c1\u0005\u00a4\u0000\u00dd\u009d\u00be";
                var4_3 = "\u00d0\u0090\u00cf!\u0018J\u0088\u001cZ\u0081\u00d2\u00bd\u00fe\u0080:\u0005\u0007u\u00d8jU0\u00e1Mf\u0012Z\u00bf7\u001b\u0081\u0098|\u009c9\u00fa\u008f\u0099\u0083\u00e7t\u00b7$\u0010\u00b8|D@\u00c5\u001f\u00ca\u00fd\u00c0\u00da\u0093\u00a3\u00f9\u0018v\n\u0004z\nJ\u0003n\u00cc\u00eb\u00ce\u00c1\u0005\u00a4\u0000\u00dd\u009d\u00be".length();
                var1_4 = 15;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 14;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u0084;\u009e\u00f1\u0089\u00a9\u00dco\u00d0\u008cS\u0085\u0091\u008d\"DB\u00d0\u00f6v=\u00c8_\u00df@\u00ef\b\u00d4\u00bb\u00f2\u00e5K}k\u0094\u0089\u00b7u\b\u0002\u00fd\u00d1F\u0095b\u009d\u00ec\u00c9\u00c6";
                    var4_3 = "\u0084;\u009e\u00f1\u0089\u00a9\u00dco\u00d0\u008cS\u0085\u0091\u008d\"DB\u00d0\u00f6v=\u00c8_\u00df@\u00ef\b\u00d4\u00bb\u00f2\u00e5K}k\u0094\u0089\u00b7u\b\u0002\u00fd\u00d1F\u0095b\u009d\u00ec\u00c9\u00c6".length();
                    var1_4 = 14;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 2;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 39;
                            break;
                        }
                        case 1: {
                            v15 = 100;
                            break;
                        }
                        case 2: {
                            v15 = 18;
                            break;
                        }
                        case 3: {
                            v15 = 79;
                            break;
                        }
                        case 4: {
                            v15 = 43;
                            break;
                        }
                        case 5: {
                            v15 = 23;
                            break;
                        }
                        default: {
                            v15 = 69;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        iP.c = var5;
        iP.d = new String[6];
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x7707) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 153;
                case 1 -> 115;
                case 2 -> 131;
                case 3 -> 239;
                case 4 -> 17;
                case 5 -> 61;
                case 6 -> 114;
                case 7 -> 48;
                case 8 -> 198;
                case 9 -> 139;
                case 10 -> 0;
                case 11 -> 5;
                case 12 -> 11;
                case 13 -> 56;
                case 14 -> 138;
                case 15 -> 31;
                case 16 -> 24;
                case 17 -> 91;
                case 18 -> 191;
                case 19 -> 89;
                case 20 -> 66;
                case 21 -> 180;
                case 22 -> 35;
                case 23 -> 168;
                case 24 -> 178;
                case 25 -> 64;
                case 26 -> 100;
                case 27 -> 249;
                case 28 -> 65;
                case 29 -> 248;
                case 30 -> 238;
                case 31 -> 165;
                case 32 -> 13;
                case 33 -> 39;
                case 34 -> 116;
                case 35 -> 113;
                case 36 -> 57;
                case 37 -> 92;
                case 38 -> 117;
                case 39 -> 47;
                case 40 -> 214;
                case 41 -> 159;
                case 42 -> 223;
                case 43 -> 209;
                case 44 -> 112;
                case 45 -> 211;
                case 46 -> 204;
                case 47 -> 193;
                case 48 -> 228;
                case 49 -> 196;
                case 50 -> 197;
                case 51 -> 200;
                case 52 -> 94;
                case 53 -> 245;
                case 54 -> 140;
                case 55 -> 83;
                case 56 -> 172;
                case 57 -> 109;
                case 58 -> 206;
                case 59 -> 54;
                case 60 -> 224;
                case 61 -> 85;
                case 62 -> 146;
                case 63 -> 122;
                case 64 -> 50;
                case 65 -> 33;
                case 66 -> 121;
                case 67 -> 95;
                case 68 -> 7;
                case 69 -> 38;
                case 70 -> 129;
                case 71 -> 67;
                case 72 -> 163;
                case 73 -> 176;
                case 74 -> 167;
                case 75 -> 145;
                case 76 -> 28;
                case 77 -> 118;
                case 78 -> 96;
                case 79 -> 240;
                case 80 -> 123;
                case 81 -> 222;
                case 82 -> 201;
                case 83 -> 120;
                case 84 -> 132;
                case 85 -> 80;
                case 86 -> 111;
                case 87 -> 207;
                case 88 -> 32;
                case 89 -> 143;
                case 90 -> 161;
                case 91 -> 187;
                case 92 -> 55;
                case 93 -> 134;
                case 94 -> 182;
                case 95 -> 225;
                case 96 -> 156;
                case 97 -> 218;
                case 98 -> 184;
                case 99 -> 124;
                case 100 -> 250;
                case 101 -> 171;
                case 102 -> 69;
                case 103 -> 154;
                case 104 -> 77;
                case 105 -> 162;
                case 106 -> 190;
                case 107 -> 150;
                case 108 -> 133;
                case 109 -> 6;
                case 110 -> 192;
                case 111 -> 30;
                case 112 -> 142;
                case 113 -> 25;
                case 114 -> 230;
                case 115 -> 243;
                case 116 -> 74;
                case 117 -> 208;
                case 118 -> 4;
                case 119 -> 213;
                case 120 -> 160;
                case 121 -> 93;
                case 122 -> 215;
                case 123 -> 88;
                case 124 -> 255;
                case 125 -> 130;
                case 126 -> 40;
                case 127 -> 247;
                case 128 -> 234;
                case 129 -> 52;
                case 130 -> 226;
                case 131 -> 82;
                case 132 -> 183;
                case 133 -> 90;
                case 134 -> 76;
                case 135 -> 53;
                case 136 -> 21;
                case 137 -> 149;
                case 138 -> 175;
                case 139 -> 173;
                case 140 -> 81;
                case 141 -> 27;
                case 142 -> 44;
                case 143 -> 199;
                case 144 -> 106;
                case 145 -> 251;
                case 146 -> 135;
                case 147 -> 185;
                case 148 -> 41;
                case 149 -> 157;
                case 150 -> 2;
                case 151 -> 152;
                case 152 -> 72;
                case 153 -> 68;
                case 154 -> 210;
                case 155 -> 203;
                case 156 -> 43;
                case 157 -> 71;
                case 158 -> 164;
                case 159 -> 158;
                case 160 -> 137;
                case 161 -> 70;
                case 162 -> 58;
                case 163 -> 42;
                case 164 -> 36;
                case 165 -> 126;
                case 166 -> 232;
                case 167 -> 84;
                case 168 -> 151;
                case 169 -> 110;
                case 170 -> 166;
                case 171 -> 244;
                case 172 -> 63;
                case 173 -> 62;
                case 174 -> 105;
                case 175 -> 237;
                case 176 -> 188;
                case 177 -> 219;
                case 178 -> 169;
                case 179 -> 127;
                case 180 -> 59;
                case 181 -> 235;
                case 182 -> 189;
                case 183 -> 148;
                case 184 -> 205;
                case 185 -> 101;
                case 186 -> 202;
                case 187 -> 14;
                case 188 -> 10;
                case 189 -> 136;
                case 190 -> 252;
                case 191 -> 242;
                case 192 -> 45;
                case 193 -> 220;
                case 194 -> 78;
                case 195 -> 217;
                case 196 -> 51;
                case 197 -> 229;
                case 198 -> 37;
                case 199 -> 125;
                case 200 -> 119;
                case 201 -> 233;
                case 202 -> 29;
                case 203 -> 141;
                case 204 -> 128;
                case 205 -> 26;
                case 206 -> 87;
                case 207 -> 34;
                case 208 -> 236;
                case 209 -> 144;
                case 210 -> 15;
                case 211 -> 254;
                case 212 -> 23;
                case 213 -> 195;
                case 214 -> 194;
                case 215 -> 104;
                case 216 -> 212;
                case 217 -> 49;
                case 218 -> 231;
                case 219 -> 12;
                case 220 -> 22;
                case 221 -> 253;
                case 222 -> 8;
                case 223 -> 241;
                case 224 -> 75;
                case 225 -> 179;
                case 226 -> 9;
                case 227 -> 19;
                case 228 -> 246;
                case 229 -> 177;
                case 230 -> 86;
                case 231 -> 79;
                case 232 -> 73;
                case 233 -> 102;
                case 234 -> 170;
                case 235 -> 46;
                case 236 -> 174;
                case 237 -> 16;
                case 238 -> 227;
                case 239 -> 186;
                case 240 -> 1;
                case 241 -> 221;
                case 242 -> 181;
                case 243 -> 60;
                case 244 -> 108;
                case 245 -> 107;
                case 246 -> 155;
                case 247 -> 3;
                case 248 -> 20;
                case 249 -> 99;
                case 250 -> 103;
                case 251 -> 216;
                case 252 -> 18;
                case 253 -> 98;
                case 254 -> 97;
                default -> 147;
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
            iP.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }
}
