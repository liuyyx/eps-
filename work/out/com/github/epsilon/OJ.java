/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.bo;
import com.github.epsilon.hi;
import com.github.epsilon.yE;
import com.github.epsilon.yc;
import com.github.epsilon.zI;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

public class OJ
implements zI {
    private static Method i;
    private final Class<?> j;
    private final boolean X;
    private final int I;
    private Consumer<Object> q;
    private static final String[] a;
    private static final String[] b;

    @Override
    public void z(Object[] objectArray) {
        Object object = objectArray[0];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1077391463388968063L), (Object)object, (long)1019739569891963411L);
    }

    public static /* bridge */ /* synthetic */ CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public boolean o(Object[] objectArray) {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1324717060863792043L);
    }

    @Override
    public Class J(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)946346209780888250L);
    }

    public OJ(yc yc2, Class<?> clazz, Object object, Method method) {
        block21: {
            boolean bl = Dl.t();
            this.j = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)method, (long)587000589680617178L)[0], (long)697248403045697302L);
            this.X = hi.a("G", (int)hi.a("\u00a5", (Object)method, (long)400507764269000133L), (long)1300561438282417942L);
            boolean bl2 = bl;
            this.I = (int)hi.a("\u00a5", (Object)((yE)((Object)hi.a("\u00a5", (Object)method, yE.class, (long)539288663910659452L))), (long)532421445007940115L);
            try {
                MethodHandle methodHandle;
                Object object2;
                MethodType methodType;
                MethodHandle methodHandle2;
                MethodType methodType2;
                CallSite callSite;
                block23: {
                    MethodType methodType3;
                    MethodHandle methodHandle3;
                    CallSite callSite2;
                    block22: {
                        MethodType methodType4;
                        MethodHandle methodHandle4;
                        MethodType methodType5;
                        callSite2 = hi.a("\u00a5", (Object)method, (long)676158832958172459L);
                        callSite = hi.a("\u00a5", (Object)yc2, (Object)hi.a("j", (long)1014855356862901063L), clazz, (long)1298693497256278511L);
                        try {
                            methodType5 = (MethodType)hi.d(1020074140494576131L).invoke(null, hi.a(hi.a("j", (long)1130747540279904546L), hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)method, (long)587000589680617178L)[0], (long)697248403045697302L)));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        methodType2 = methodType5;
                        if (hi.a("\u00e9", (Object)this, (long)1324717060863792043L) == false) break block22;
                        MethodType methodType6 = methodType2;
                        Class<?> clazz2 = clazz;
                        try {
                            methodHandle4 = (MethodHandle)hi.d(1144506818260784009L).invoke((Object)callSite, hi.a(clazz2, (Object)bo.b((String)((Object)callSite2), clazz2, methodType6.parameterArray()), (Object)methodType6));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        methodHandle2 = methodHandle4;
                        try {
                            methodType4 = (MethodType)hi.d(681829251518561475L).invoke(null, hi.a(Consumer.class));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        methodType = methodType4;
                        if (!bl2) break block23;
                    }
                    MethodType methodType7 = methodType2;
                    Class<?> clazz3 = clazz;
                    try {
                        methodHandle3 = (MethodHandle)hi.d(1141490081806474442L).invoke((Object)callSite, hi.a(clazz3, (Object)bo.b((String)((Object)callSite2), clazz3, methodType7.parameterArray()), (Object)methodType7));
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    methodHandle2 = methodHandle3;
                    try {
                        methodType3 = (MethodType)hi.d(1020074140494576131L).invoke(null, hi.a(Consumer.class, clazz));
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    methodType = methodType3;
                }
                try {
                    object2 = hi.d(690661761649603110L).invoke(null, hi.a(callSite, OJ.a(-19170, -15501), methodType, OJ.e("V4WYrI1tOk01a1r3", methodType(java.lang.Class<?> java.lang.Class<?> ), (Class)((Object)hi.a("j", (long)1130747540279904546L)), Object.class), methodHandle2, methodType2));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    methodHandle = (MethodHandle)hi.d(602629930789351641L).invoke(object2, hi.j());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                MethodHandle methodHandle5 = methodHandle;
                OJ oJ = this;
                if (!bl2) {
                    if (hi.a("\u00e9", (Object)oJ, (long)1324717060863792043L) != false) {
                        hi.a("\u00f2", (Object)this, (Consumer)((Object)OJ.e("V4WYrI1tOk01a1r3", invoke(), (MethodHandle)methodHandle5)), (long)1077391463388968063L);
                        if (!bl2) break block21;
                    }
                    oJ = this;
                }
                hi.a("\u00f2", (Object)oJ, (Consumer)((Object)OJ.e("V4WYrI1tOk01a1r3", invoke(java.lang.Object ), (MethodHandle)methodHandle5, (Object)object)), (long)1077391463388968063L);
            }
            catch (Throwable throwable) {
                throw new IllegalStateException(OJ.a(-19172, 19427) + (String)((Object)hi.a("\u00a5", clazz, (long)927605372257141128L)) + "#" + (String)((Object)hi.a("\u00a5", (Object)method, (long)676158832958172459L)), throwable);
            }
        }
    }

    @Override
    public int K(Object[] objectArray) {
        return (int)hi.a("\u00e9", (Object)this, (long)821187373261939850L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "L\u001b\u00f639\u0086\u00d2y^\u00ed8\u0088]^\u00a4$\u009cp\u001c5`\u000f8b\u00ee\u00fe&K\u0082\u00e9\u00f2\u00b7\u00ec@\r\u0088\u00aa\u00b3t\u0088\u00d9A'\u008do\u00bfT\u0004\u0012\u00e7GA";
                var4_3 = "L\u001b\u00f639\u0086\u00d2y^\u00ed8\u0088]^\u00a4$\u009cp\u001c5`\u000f8b\u00ee\u00fe&K\u0082\u00e9\u00f2\u00b7\u00ec@\r\u0088\u00aa\u00b3t\u0088\u00d9A'\u008do\u00bfT\u0004\u0012\u00e7GA".length();
                var1_4 = 15;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 40;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block21;
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
                    var2_2 = "\u00ad\u00f6\u00ff \u00d9h\u00caKu\u001e\u009a\u008e\u0097\u001e\u0005?%\u001c8K\n6c\u00c3\u009c\u00db5\u00c7X)\u0096\u0082A\u0015\u00e1\u0091\u0015\u00de'y\u00c2\u00b5?\u00b7\u00df\u0003\u0006\u00ca\u00cb\u00da\u00cc#\u00cd";
                    var4_3 = "\u00ad\u00f6\u00ff \u00d9h\u00caKu\u001e\u009a\u008e\u0097\u001e\u0005?%\u001c8K\n6c\u00c3\u009c\u00db5\u00c7X)\u0096\u0082A\u0015\u00e1\u0091\u0015\u00de'y\u00c2\u00b5?\u00b7\u00df\u0003\u0006\u00ca\u00cb\u00da\u00cc#\u00cd".length();
                    var1_4 = 46;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 100;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block21;
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
                    break block22;
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
                            v15 = 90;
                            break;
                        }
                        case 1: {
                            v15 = 41;
                            break;
                        }
                        case 2: {
                            v15 = 14;
                            break;
                        }
                        case 3: {
                            v15 = 18;
                            break;
                        }
                        case 4: {
                            v15 = 46;
                            break;
                        }
                        case 5: {
                            v15 = 67;
                            break;
                        }
                        default: {
                            v15 = 53;
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
        OJ.a = var5;
        OJ.b = new String[4];
        try {
            hi.a("\u00d2", (Method)hi.a("\u00a5", MethodHandles.class, (Object)OJ.a(-19171, 15651), (Object)new Class[]{Class.class, MethodHandles.Lookup.class}, (long)1080484002068830942L), (long)1014855356862901063L);
        }
        catch (NoSuchMethodException var7_7) {
            hi.a("\u00a5", (Object)hi.a("j", (long)930465074088781133L), (Object)OJ.a(-19169, -14655), (Object)var7_7, (long)441730471217663154L);
        }
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFB51D) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 183;
                case 1 -> 152;
                case 2 -> 8;
                case 3 -> 198;
                case 4 -> 65;
                case 5 -> 155;
                case 6 -> 228;
                case 7 -> 36;
                case 8 -> 118;
                case 9 -> 72;
                case 10 -> 199;
                case 11 -> 11;
                case 12 -> 90;
                case 13 -> 132;
                case 14 -> 158;
                case 15 -> 5;
                case 16 -> 92;
                case 17 -> 63;
                case 18 -> 43;
                case 19 -> 86;
                case 20 -> 28;
                case 21 -> 17;
                case 22 -> 240;
                case 23 -> 255;
                case 24 -> 4;
                case 25 -> 84;
                case 26 -> 3;
                case 27 -> 49;
                case 28 -> 57;
                case 29 -> 30;
                case 30 -> 121;
                case 31 -> 227;
                case 32 -> 142;
                case 33 -> 212;
                case 34 -> 167;
                case 35 -> 103;
                case 36 -> 70;
                case 37 -> 42;
                case 38 -> 164;
                case 39 -> 14;
                case 40 -> 24;
                case 41 -> 165;
                case 42 -> 176;
                case 43 -> 0;
                case 44 -> 245;
                case 45 -> 33;
                case 46 -> 141;
                case 47 -> 109;
                case 48 -> 48;
                case 49 -> 175;
                case 50 -> 122;
                case 51 -> 9;
                case 52 -> 101;
                case 53 -> 113;
                case 54 -> 249;
                case 55 -> 246;
                case 56 -> 2;
                case 57 -> 187;
                case 58 -> 91;
                case 59 -> 151;
                case 60 -> 184;
                case 61 -> 87;
                case 62 -> 213;
                case 63 -> 145;
                case 64 -> 192;
                case 65 -> 55;
                case 66 -> 137;
                case 67 -> 32;
                case 68 -> 173;
                case 69 -> 203;
                case 70 -> 10;
                case 71 -> 195;
                case 72 -> 120;
                case 73 -> 98;
                case 74 -> 196;
                case 75 -> 31;
                case 76 -> 80;
                case 77 -> 45;
                case 78 -> 139;
                case 79 -> 60;
                case 80 -> 107;
                case 81 -> 129;
                case 82 -> 238;
                case 83 -> 64;
                case 84 -> 201;
                case 85 -> 53;
                case 86 -> 149;
                case 87 -> 170;
                case 88 -> 85;
                case 89 -> 247;
                case 90 -> 133;
                case 91 -> 21;
                case 92 -> 47;
                case 93 -> 44;
                case 94 -> 7;
                case 95 -> 77;
                case 96 -> 46;
                case 97 -> 51;
                case 98 -> 128;
                case 99 -> 193;
                case 100 -> 163;
                case 101 -> 97;
                case 102 -> 197;
                case 103 -> 134;
                case 104 -> 174;
                case 105 -> 89;
                case 106 -> 37;
                case 107 -> 18;
                case 108 -> 169;
                case 109 -> 25;
                case 110 -> 82;
                case 111 -> 219;
                case 112 -> 153;
                case 113 -> 166;
                case 114 -> 12;
                case 115 -> 225;
                case 116 -> 188;
                case 117 -> 189;
                case 118 -> 81;
                case 119 -> 147;
                case 120 -> 35;
                case 121 -> 148;
                case 122 -> 250;
                case 123 -> 248;
                case 124 -> 146;
                case 125 -> 73;
                case 126 -> 61;
                case 127 -> 181;
                case 128 -> 19;
                case 129 -> 119;
                case 130 -> 191;
                case 131 -> 140;
                case 132 -> 251;
                case 133 -> 62;
                case 134 -> 52;
                case 135 -> 130;
                case 136 -> 159;
                case 137 -> 88;
                case 138 -> 234;
                case 139 -> 100;
                case 140 -> 202;
                case 141 -> 237;
                case 142 -> 27;
                case 143 -> 190;
                case 144 -> 74;
                case 145 -> 178;
                case 146 -> 78;
                case 147 -> 236;
                case 148 -> 112;
                case 149 -> 233;
                case 150 -> 215;
                case 151 -> 83;
                case 152 -> 38;
                case 153 -> 76;
                case 154 -> 209;
                case 155 -> 154;
                case 156 -> 54;
                case 157 -> 93;
                case 158 -> 204;
                case 159 -> 161;
                case 160 -> 244;
                case 161 -> 194;
                case 162 -> 20;
                case 163 -> 34;
                case 164 -> 15;
                case 165 -> 230;
                case 166 -> 221;
                case 167 -> 241;
                case 168 -> 26;
                case 169 -> 1;
                case 170 -> 172;
                case 171 -> 185;
                case 172 -> 125;
                case 173 -> 115;
                case 174 -> 135;
                case 175 -> 229;
                case 176 -> 168;
                case 177 -> 13;
                case 178 -> 124;
                case 179 -> 56;
                case 180 -> 108;
                case 181 -> 206;
                case 182 -> 223;
                case 183 -> 253;
                case 184 -> 105;
                case 185 -> 131;
                case 186 -> 157;
                case 187 -> 127;
                case 188 -> 156;
                case 189 -> 220;
                case 190 -> 40;
                case 191 -> 171;
                case 192 -> 16;
                case 193 -> 67;
                case 194 -> 94;
                case 195 -> 214;
                case 196 -> 144;
                case 197 -> 29;
                case 198 -> 208;
                case 199 -> 123;
                case 200 -> 231;
                case 201 -> 104;
                case 202 -> 210;
                case 203 -> 180;
                case 204 -> 143;
                case 205 -> 162;
                case 206 -> 66;
                case 207 -> 200;
                case 208 -> 41;
                case 209 -> 186;
                case 210 -> 79;
                case 211 -> 110;
                case 212 -> 226;
                case 213 -> 218;
                case 214 -> 68;
                case 215 -> 150;
                case 216 -> 126;
                case 217 -> 224;
                case 218 -> 99;
                case 219 -> 235;
                case 220 -> 205;
                case 221 -> 217;
                case 222 -> 242;
                case 223 -> 160;
                case 224 -> 75;
                case 225 -> 22;
                case 226 -> 116;
                case 227 -> 239;
                case 228 -> 50;
                case 229 -> 96;
                case 230 -> 117;
                case 231 -> 6;
                case 232 -> 177;
                case 233 -> 211;
                case 234 -> 252;
                case 235 -> 95;
                case 236 -> 232;
                case 237 -> 182;
                case 238 -> 59;
                case 239 -> 254;
                case 240 -> 216;
                case 241 -> 23;
                case 242 -> 111;
                case 243 -> 243;
                case 244 -> 222;
                case 245 -> 106;
                case 246 -> 114;
                case 247 -> 69;
                case 248 -> 39;
                case 249 -> 138;
                case 250 -> 58;
                case 251 -> 207;
                case 252 -> 71;
                case 253 -> 179;
                case 254 -> 102;
                default -> 136;
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
            OJ.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
}
