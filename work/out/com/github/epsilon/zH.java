/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

final class zH {
    private long v;
    private float H;
    private float N;
    private static final long[] a;
    private static final Integer[] b;

    public static /* bridge */ /* synthetic */ CallSite U(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private zH() {
        hi.a("\u00f2", (Object)this, (float)Float.NaN, (long)766026047858138346L);
        hi.a("\u00f2", (Object)this, (long)hi.a("G", (long)1081758078654608138L), (long)1335636667936052895L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    float F(Object[] var1_1) {
        var2_2 = ((Float)var1_1[0]).floatValue();
        var3_3 = Dl.S();
        var9_4 /* !! */  = zH.a(28983, 8668126451545319021L) * zH.a(1055, 5375192721460777803L) + zH.a(2760, 6605268955130289572L);
        if (!var3_3) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var4_5 = hi.a("G", (long)1081758078654608138L);
                v0 /* !! */  = hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)766026047858138346L), (long)619542100356072855L);
                if (!var3_3) ** GOTO lbl71
                if (v0 /* !! */  != false) ** GOTO lbl70
                if (true) ** GOTO lbl73
            }
            case -241337031: {
                throw null;
            }
        }
        block12: while (true) {
            block17: {
                block16: {
                    block15: {
                        switch (var9_4 /* !! */ ) {
                            default: {
                                hi.a("\u00f2", (Object)this, (float)var2_2, (long)766026047858138346L);
                                hi.a("\u00f2", (Object)this, (long)var4_5, (long)1335636667936052895L);
                                return (float)hi.a("\u00e9", (Object)this, (long)766026047858138346L);
                            }
                            case 2125266105: {
                                var6_6 = hi.a("G", (float)((float)(var4_5 - hi.a("\u00e9", (Object)this, (long)1335636667936052895L)) / 1.0E9f), (float)0.1f, (long)971000971621905228L);
                                hi.a("\u00f2", (Object)this, (long)var4_5, (long)1335636667936052895L);
                                var7_7 = hi.a("\u00e9", (Object)this, (long)766026047858138346L) - var2_2;
                                var8_8 = -200.0f * var7_7 - 25.0f * hi.a("\u00e9", (Object)this, (long)497876444380376931L);
                                v1 = this;
                                hi.a("\u00f2", (Object)v1, (float)(hi.a("\u00e9", (Object)v1, (long)497876444380376931L) + var8_8 * var6_6), (long)497876444380376931L);
                                v2 = this;
                                hi.a("\u00f2", (Object)v2, (float)(hi.a("\u00e9", (Object)v2, (long)766026047858138346L) + hi.a("\u00e9", (Object)this, (long)497876444380376931L) * var6_6), (long)766026047858138346L);
                                cfr_temp_0 = hi.a("G", (float)var7_7, (long)400111314131951612L) - 0.5f;
                                v3 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (!var3_3) break block15;
                                if (v3 /* !! */  >= 0) break;
                                break block16;
                            }
                            case 2125266103: {
                                hi.a("G", (float)-1.0f, (long)670532585860963011L);
                                return 0.0f;
                            }
                        }
                        v3 /* !! */  = (reference)((zH.a(28667, 1942731855716890787L) ^ zH.a(1478, 6143748999568970397L) ^ zH.a(18045, 3883064362213937456L)) / zH.a(14466, 6506862087175040970L) - zH.a(32271, 3108379306479298902L));
                    }
                    var9_4 /* !! */  = (int)v3 /* !! */ ;
                    if (var3_3) break block17;
                }
                var9_4 /* !! */  = hi.a("G", (int)(zH.a(7224, 3778189021735799677L) * zH.a(14201, 552406730908688441L)), (int)zH.a(7934, 7818410479077083564L), (long)834203424483934088L) ^ zH.a(18412, 1339953685413236899L);
                if (!var3_3) ** GOTO lbl75
            }
            block13: while (true) {
                switch (var9_4 /* !! */ ) {
                    default: {
                        cfr_temp_1 = hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)497876444380376931L), (long)400111314131951612L) - 5.0f;
                        v4 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        if (!var3_3) ** GOTO lbl76
                        if (v4 /* !! */  >= 0) ** GOTO lbl75
                        ** GOTO lbl78
                    }
                    case -900046665: {
                        hi.a("\u00f2", (Object)this, (float)var2_2, (long)766026047858138346L);
                        hi.a("\u00f2", (Object)this, (float)0.0f, (long)497876444380376931L);
                        if (!var3_3) {
                            return (float)hi.a("\u00e9", (Object)this, (long)766026047858138346L);
                        }
                        ** GOTO lbl80
                    }
                    case -900046664: {
                        hi.a("G", (long)782721573726732509L);
                        hi.a("G", (long)1312822163333810930L);
                        var9_4 /* !! */  = (zH.a(2338, 401840877930700387L) - zH.a(15508, 7459842775869877193L) + zH.a(19612, 5925040856141274097L) + zH.a(10647, 147057750663331527L)) * zH.a(26383, 4031453058770251849L) - zH.a(16218, 3402835175284762628L);
                        if (var3_3) continue block13;
lbl70:
                        // 2 sources

                        v0 /* !! */  = (CallSite)((zH.a(13478, 8179613320175182821L) / zH.a(13269, 8628786479202165918L) ^ zH.a(17893, 8626014325759873697L)) + zH.a(14451, 6808838137462714169L));
lbl71:
                        // 2 sources

                        var9_4 /* !! */  = (int)v0 /* !! */ ;
                        if (var3_3) continue block12;
lbl73:
                        // 2 sources

                        var9_4 /* !! */  = zH.a(20971, 2657090211462776492L) + zH.a(29107, 3641144757419681508L) + zH.a(23483, 7083946261264633074L);
                        continue block12;
                    }
lbl75:
                    // 2 sources

                    v4 /* !! */  = (reference)((zH.a(27719, 594467488933526313L) ^ zH.a(15730, 3727602551265520188L) ^ zH.a(22392, 3413678520786157620L)) / zH.a(30401, 8303054769682817411L) - zH.a(25542, 4471464135080588435L));
lbl76:
                    // 2 sources

                    var9_4 /* !! */  = (int)v4 /* !! */ ;
                    if (var3_3) continue block13;
lbl78:
                    // 2 sources

                    var9_4 /* !! */  = (zH.U("DHXniBHbFPn8vS4e", max(int int ), (int)zH.a(19654, 3926842547769449360L), (int)zH.a(12557, 8324541588719593041L)) / zH.a(4527, 1259700886081455870L) ^ zH.a(10637, 5106739790153023186L)) + zH.a(28603, 2876025642273028328L);
                    if (var3_3) continue block13;
lbl80:
                    // 2 sources

                    var9_4 /* !! */  = (zH.a(27719, 594467488933526313L) ^ zH.a(15730, 3727602551265520188L) ^ zH.a(22392, 3413678520786157620L)) / zH.a(30401, 8303054769682817411L) - zH.a(25542, 4471464135080588435L);
                    continue block13;
                    case -900046666: 
                }
                break;
            }
            break;
        }
        return (float)hi.a("\u00e9", (Object)this, (long)766026047858138346L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8292393199205956962L;
                var6_1 = new long[35];
                var3_2 = 0;
                var4_3 = "\u00ea\u0010I\u00e1am8DD\u0010pC\u0094\u0007\u00a9@6\u0082B\u0087s&\u00ec\u0090\u00849\u0018\u00925\u00fe\u00df\bD\u00fb\u00ae\u00c6\u00ec\u000fR\u00a41)\u00ff\u0094\u0089\u00ca\u0011v*O\u00bf\u00e6e\u0081\u00b8\u00b3\u00fe\u007f*Q\u00e7\u0000\u00d9\u00f3\u00e2\u0099\u00b8\u00a1P[v\u00da\u00c9px\u00ec\u0001\u00df\f\u00dc3\n\u00fb\u00cb\u00c4)\u009f\u0016\u0014\u007f\u0080|\u00b3O\u00c4\u00c0\u0080<\n\u0088\u00bfo\u0093\u00fc.\u001b\u008e\u00c6\u00c2\t\u0005\u008b\u008efv\u009bQ\u0007\u009c\u00ed\u00f3'\u00db\u0092\u00d4u\u009d*\u008bY\u0004\u00f3,]\u00a4gZ4[\u0091/1\u00f0-\u0018Z\u000fp7z*V\u00b1D\u008e\u0015Y*0Ll!\u00ca\u00d3\u0099E\u00ce\u0095\u0091\u00ea\u00d6,\u0089\u008d\u00bd\"Q\u00d2N\u00e0\u008b,\u0001D\u00a4\u00c9h\u00ad;[\u00d41'\u00bd\u00b0R\u0083kAH\u00a2\u00d8\u00fe\u00dd\u00892\u00a0\u00e7z+$o\u008a\u0019\u00b1d\u00f8\u00a0RsHS\u00c7B\u00fc\u00a1|rbwY>\\'\u001cz\u001e\u00a8{\u0092\u00f3W\u00a6\u00f4\u00c4\u00b8f\u00be\u0017\u00f3F\u00f4\u00cf\u00c6P\u00cb\b\u0015\u009c\u001d\u001b\u0000\u00a1\t";
                var5_4 = "\u00ea\u0010I\u00e1am8DD\u0010pC\u0094\u0007\u00a9@6\u0082B\u0087s&\u00ec\u0090\u00849\u0018\u00925\u00fe\u00df\bD\u00fb\u00ae\u00c6\u00ec\u000fR\u00a41)\u00ff\u0094\u0089\u00ca\u0011v*O\u00bf\u00e6e\u0081\u00b8\u00b3\u00fe\u007f*Q\u00e7\u0000\u00d9\u00f3\u00e2\u0099\u00b8\u00a1P[v\u00da\u00c9px\u00ec\u0001\u00df\f\u00dc3\n\u00fb\u00cb\u00c4)\u009f\u0016\u0014\u007f\u0080|\u00b3O\u00c4\u00c0\u0080<\n\u0088\u00bfo\u0093\u00fc.\u001b\u008e\u00c6\u00c2\t\u0005\u008b\u008efv\u009bQ\u0007\u009c\u00ed\u00f3'\u00db\u0092\u00d4u\u009d*\u008bY\u0004\u00f3,]\u00a4gZ4[\u0091/1\u00f0-\u0018Z\u000fp7z*V\u00b1D\u008e\u0015Y*0Ll!\u00ca\u00d3\u0099E\u00ce\u0095\u0091\u00ea\u00d6,\u0089\u008d\u00bd\"Q\u00d2N\u00e0\u008b,\u0001D\u00a4\u00c9h\u00ad;[\u00d41'\u00bd\u00b0R\u0083kAH\u00a2\u00d8\u00fe\u00dd\u00892\u00a0\u00e7z+$o\u008a\u0019\u00b1d\u00f8\u00a0RsHS\u00c7B\u00fc\u00a1|rbwY>\\'\u001cz\u001e\u00a8{\u0092\u00f3W\u00a6\u00f4\u00c4\u00b8f\u00be\u0017\u00f3F\u00f4\u00cf\u00c6P\u00cb\b\u0015\u009c\u001d\u001b\u0000\u00a1\t".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00cb\u000b\u0089\u00e4L\u008b\u00cb\u00fc\u00d6\u000e\u00cc\u00db\u00e4\u00f4M\u001f";
                    var5_4 = "\u00cb\u000b\u0089\u00e4L\u008b\u00cb\u00fc\u00d6\u000e\u00cc\u00db\u00e4\u00f4M\u001f".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        zH.a = var6_1;
        zH.b = new Integer[35];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x574C;
        if (b[n2] == null) {
            zH.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
