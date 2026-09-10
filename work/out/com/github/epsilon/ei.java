/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.DeltaTracker
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.d8;
import com.github.epsilon.eh;
import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.DeltaTracker;

public class ei
extends eh {
    private final DM W;
    public static final ei P;
    private final DM h = hi.a("\u00a5", (Object)this, (Object)ei.b(-4033, 11823), (double)32.0, (double)12.0, (double)96.0, (double)1.0, (long)1077996338587307774L);
    private final DV w;
    private static final String[] b;
    private static final String[] d;
    private static final long[] l;
    private static final Integer[] m;
    private static final long n;

    public static /* bridge */ /* synthetic */ CallSite s(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            var15 = new String[6];
                            var13_1 = 0;
                            var12_2 = "`H\u00da\u0002\ud8f3\udfd4\u0002\ud8d0\udf0d\u00050\u0096.\u00c6\u00ec";
                            var14_3 = "`H\u00da\u0002\ud8f3\udfd4\u0002\ud8d0\udf0d\u00050\u0096.\u00c6\u00ec".length();
                            var11_4 = 3;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 63;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block22;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "\u00aej\u001aS\u00a8\u0004\u00df\u00da0\u0089";
                                var14_3 = "\u00aej\u001aS\u00a8\u0004\u00df\u00da0\u0089".length();
                                var11_4 = 5;
                                var10_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 32;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block22;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block23;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 36;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 20;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 40;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 85;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 89;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 117;
                                        break;
                                    }
                                    default: {
                                        v15 = 41;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    ei.b = var15;
                    ei.d = new String[6];
                    var2_7 = 3420769083605144796L;
                    var8_8 = new long[2];
                    var5_9 = 0;
                    var6_10 = "\u00deRU\u00a8\u0015V*\u00a1\u001f\u00a5\u0085\t7\r\u0082\u00b0";
                    var7_11 = "\u00deRU\u00a8\u0015V*\u00a1\u001f\u00a5\u0085\t7\r\u0082\u00b0".length();
                    var4_12 = 0;
                    while (true) {
                        break block24;
                        break;
                    }
lbl107:
                    // 1 sources

                    while (true) {
                        var8_8[v17] = (((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L) ^ var2_7;
                        if (var4_12 < var7_11) ** continue;
                        break block25;
                        break;
                    }
                }
                var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                v17 = var5_9++;
                ** while (true)
            }
            ei.l = var8_8;
            ei.m = new Integer[2];
            break block26;
lbl122:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 8141438915934750984L;
        ** while (true)
        ei.n = 8141438915935725448L ^ var0_14;
        ei.P = new ei();
    }

    private ei() {
        super(ei.b(-4038, -4114), 0.0f, 0.0f, 36.0f, 36.0f);
        this.W = hi.a("\u00a5", (Object)this, (Object)ei.b(-4039, 18675), (double)160.0, (double)-720.0, (double)720.0, (double)5.0, (long)1077996338587307774L);
        Object[] objectArray = new Object[3];
        objectArray[2] = true;
        objectArray[1] = new Color(ei.d(19494, 2630736921405544083L), ei.d(25654, 5930923549865442946L), ei.d(25654, 5930923549865442946L), ei.d(25654, 5930923549865442946L));
        objectArray[0] = ei.b(-4034, 955);
        this.w = hi.a("\u00a5", (Object)this, (Object)objectArray, (long)1120824226995433289L);
    }

    @Override
    public void e(Object[] objectArray) {
        DeltaTracker deltaTracker = (DeltaTracker)objectArray[0];
        CallSite callSite = hi.a("\u00a5", (Object)((Double)((Object)ei.s("43SofYi6jGiY9wON", z(), (DM)((Object)hi.a("\u00e9", (Object)this, (long)462255032129846696L))))), (long)371266768739483732L);
        hi.a("\u00a5", (Object)this, (float)callSite, (float)callSite, (long)1276984734984451677L);
        reference var4_4 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + callSite / 2.0f;
        reference var5_5 = hi.a("\u00e9", (Object)this, (long)423210454345410312L) + callSite / 2.0f;
        float f = (float)(hi.a("G", (long)658960450018995719L) % n) / 1000.0f * hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1077062592203940367L), (long)789438897355831922L))), (long)371266768739483732L);
        String string = ei.b(-4040, -14469);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("j", (long)1171373380215371138L), (Object)new Object[]{ei.b(-4037, -32582)}, (long)1190197202969050547L);
        Object[] objectArray2 = new Object[13];
        objectArray2[12] = Float.valueOf(f);
        objectArray2[11] = Float.valueOf((float)var5_5);
        objectArray2[10] = Float.valueOf((float)var4_4);
        objectArray2[9] = (Color)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)411259183224053988L), (long)789438897355831922L));
        objectArray2[8] = Float.valueOf((float)hi.a("\u00a5", (Object)callSite2, (long)739678483257514213L));
        objectArray2[7] = Float.valueOf((float)hi.a("\u00a5", (Object)callSite2, (long)1033092818258960958L));
        objectArray2[6] = Float.valueOf((float)ei.s("43SofYi6jGiY9wON", xX(), (d8)((Object)callSite2)));
        objectArray2[5] = Float.valueOf((float)hi.a("\u00a5", (Object)callSite2, (long)547535752434231157L));
        objectArray2[4] = Float.valueOf((float)callSite);
        objectArray2[3] = Float.valueOf((float)callSite);
        objectArray2[2] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)423210454345410312L));
        objectArray2[1] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)934067547881438154L));
        objectArray2[0] = hi.a("\u00a5", (Object)callSite2, (long)441623534667149309L);
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (long)567689278082192432L), (Object)objectArray2, (long)627265675083114013L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFF03A) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 251;
                case 1 -> 178;
                case 2 -> 139;
                case 3 -> 159;
                case 4 -> 29;
                case 5 -> 200;
                case 6 -> 24;
                case 7 -> 218;
                case 8 -> 147;
                case 9 -> 146;
                case 10 -> 238;
                case 11 -> 17;
                case 12 -> 5;
                case 13 -> 157;
                case 14 -> 62;
                case 15 -> 201;
                case 16 -> 101;
                case 17 -> 136;
                case 18 -> 32;
                case 19 -> 89;
                case 20 -> 126;
                case 21 -> 154;
                case 22 -> 87;
                case 23 -> 16;
                case 24 -> 231;
                case 25 -> 40;
                case 26 -> 67;
                case 27 -> 242;
                case 28 -> 181;
                case 29 -> 36;
                case 30 -> 148;
                case 31 -> 88;
                case 32 -> 119;
                case 33 -> 96;
                case 34 -> 42;
                case 35 -> 243;
                case 36 -> 70;
                case 37 -> 103;
                case 38 -> 177;
                case 39 -> 194;
                case 40 -> 71;
                case 41 -> 220;
                case 42 -> 253;
                case 43 -> 123;
                case 44 -> 255;
                case 45 -> 124;
                case 46 -> 8;
                case 47 -> 55;
                case 48 -> 195;
                case 49 -> 221;
                case 50 -> 252;
                case 51 -> 111;
                case 52 -> 116;
                case 53 -> 4;
                case 54 -> 187;
                case 55 -> 28;
                case 56 -> 11;
                case 57 -> 18;
                case 58 -> 6;
                case 59 -> 74;
                case 60 -> 245;
                case 61 -> 30;
                case 62 -> 12;
                case 63 -> 179;
                case 64 -> 226;
                case 65 -> 134;
                case 66 -> 110;
                case 67 -> 155;
                case 68 -> 46;
                case 69 -> 0;
                case 70 -> 163;
                case 71 -> 164;
                case 72 -> 61;
                case 73 -> 212;
                case 74 -> 98;
                case 75 -> 121;
                case 76 -> 15;
                case 77 -> 232;
                case 78 -> 131;
                case 79 -> 214;
                case 80 -> 104;
                case 81 -> 117;
                case 82 -> 206;
                case 83 -> 169;
                case 84 -> 38;
                case 85 -> 186;
                case 86 -> 1;
                case 87 -> 175;
                case 88 -> 81;
                case 89 -> 76;
                case 90 -> 106;
                case 91 -> 141;
                case 92 -> 160;
                case 93 -> 174;
                case 94 -> 225;
                case 95 -> 37;
                case 96 -> 82;
                case 97 -> 45;
                case 98 -> 52;
                case 99 -> 211;
                case 100 -> 64;
                case 101 -> 31;
                case 102 -> 60;
                case 103 -> 93;
                case 104 -> 10;
                case 105 -> 171;
                case 106 -> 185;
                case 107 -> 122;
                case 108 -> 249;
                case 109 -> 209;
                case 110 -> 153;
                case 111 -> 190;
                case 112 -> 34;
                case 113 -> 78;
                case 114 -> 150;
                case 115 -> 115;
                case 116 -> 168;
                case 117 -> 113;
                case 118 -> 165;
                case 119 -> 23;
                case 120 -> 59;
                case 121 -> 125;
                case 122 -> 107;
                case 123 -> 184;
                case 124 -> 65;
                case 125 -> 127;
                case 126 -> 85;
                case 127 -> 120;
                case 128 -> 205;
                case 129 -> 162;
                case 130 -> 176;
                case 131 -> 109;
                case 132 -> 25;
                case 133 -> 26;
                case 134 -> 239;
                case 135 -> 248;
                case 136 -> 227;
                case 137 -> 19;
                case 138 -> 91;
                case 139 -> 128;
                case 140 -> 68;
                case 141 -> 203;
                case 142 -> 44;
                case 143 -> 73;
                case 144 -> 172;
                case 145 -> 86;
                case 146 -> 215;
                case 147 -> 182;
                case 148 -> 224;
                case 149 -> 196;
                case 150 -> 84;
                case 151 -> 7;
                case 152 -> 57;
                case 153 -> 97;
                case 154 -> 90;
                case 155 -> 217;
                case 156 -> 138;
                case 157 -> 51;
                case 158 -> 229;
                case 159 -> 222;
                case 160 -> 152;
                case 161 -> 100;
                case 162 -> 198;
                case 163 -> 133;
                case 164 -> 241;
                case 165 -> 130;
                case 166 -> 142;
                case 167 -> 247;
                case 168 -> 99;
                case 169 -> 183;
                case 170 -> 210;
                case 171 -> 145;
                case 172 -> 43;
                case 173 -> 236;
                case 174 -> 35;
                case 175 -> 228;
                case 176 -> 191;
                case 177 -> 72;
                case 178 -> 197;
                case 179 -> 3;
                case 180 -> 83;
                case 181 -> 80;
                case 182 -> 204;
                case 183 -> 48;
                case 184 -> 223;
                case 185 -> 234;
                case 186 -> 102;
                case 187 -> 219;
                case 188 -> 170;
                case 189 -> 144;
                case 190 -> 235;
                case 191 -> 22;
                case 192 -> 114;
                case 193 -> 63;
                case 194 -> 58;
                case 195 -> 192;
                case 196 -> 180;
                case 197 -> 233;
                case 198 -> 237;
                case 199 -> 77;
                case 200 -> 66;
                case 201 -> 250;
                case 202 -> 13;
                case 203 -> 132;
                case 204 -> 199;
                case 205 -> 92;
                case 206 -> 69;
                case 207 -> 254;
                case 208 -> 112;
                case 209 -> 33;
                case 210 -> 75;
                case 211 -> 20;
                case 212 -> 137;
                case 213 -> 166;
                case 214 -> 54;
                case 215 -> 50;
                case 216 -> 27;
                case 217 -> 189;
                case 218 -> 94;
                case 219 -> 167;
                case 220 -> 149;
                case 221 -> 53;
                case 222 -> 151;
                case 223 -> 193;
                case 224 -> 140;
                case 225 -> 173;
                case 226 -> 246;
                case 227 -> 95;
                case 228 -> 2;
                case 229 -> 143;
                case 230 -> 56;
                case 231 -> 156;
                case 232 -> 230;
                case 233 -> 216;
                case 234 -> 240;
                case 235 -> 49;
                case 236 -> 21;
                case 237 -> 161;
                case 238 -> 207;
                case 239 -> 135;
                case 240 -> 244;
                case 241 -> 158;
                case 242 -> 39;
                case 243 -> 208;
                case 244 -> 79;
                case 245 -> 213;
                case 246 -> 118;
                case 247 -> 47;
                case 248 -> 188;
                case 249 -> 105;
                case 250 -> 108;
                case 251 -> 41;
                case 252 -> 129;
                case 253 -> 14;
                case 254 -> 202;
                default -> 9;
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
            ei.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AB4;
        if (m[n2] == null) {
            ei.m[n2] = (int)(ei.l[n2] ^ l);
        }
        return m[n2];
    }
}
