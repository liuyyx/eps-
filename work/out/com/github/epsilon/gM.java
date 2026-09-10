/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.gs;
import com.github.epsilon.hi;
import com.github.epsilon.iJ;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;

final class gM
extends gs {
    final iJ l;
    private float D;
    private static final long[] a;
    private static final Integer[] d;

    private gM(iJ iJ2, Vec3 vec3, Vec3 vec32) {
        iJ iJ3 = iJ2;
        Objects.requireNonNull(iJ3);
        this.l = iJ3;
        super(iJ2, vec3, gM.b(7939, 2298350563910677424L), (Identifier[])hi.a("j", (long)821119583805244540L));
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)675456699806064317L);
        hi.a("\u00f2", (Object)this, (double)(hi.a("\u00e9", (Object)vec32, (long)1300412705618690751L) + (double)((float)hi.a("\u00a5", (Object)iJ2, (int)gM.b(18465, 5483306435468076188L), (int)gM.b(10979, 4389045315738388055L), (long)402873961194657983L) * 0.005f)), (long)609409853844784478L);
        hi.a("\u00f2", (Object)this, (double)(hi.a("\u00e9", (Object)vec32, (long)1294071886475894755L) + (double)((float)hi.a("\u00a5", (Object)iJ2, (int)gM.b(20387, 4133358868447404829L), (int)gM.b(10979, 4389045315738388055L), (long)402873961194657983L) * 0.005f)), (long)1078706094324596397L);
        boolean bl = Dl.S();
        hi.a("\u00f2", (Object)this, (double)(hi.a("\u00e9", (Object)vec32, (long)1282612456329596420L) + (double)((float)hi.a("\u00a5", (Object)iJ2, (int)gM.b(20387, 4133358868447404829L), (int)gM.b(10979, 4389045315738388055L), (long)402873961194657983L) * 0.005f)), (long)669321080678999846L);
        boolean bl2 = bl;
        hi.a("\u00f2", (Object)this, (float)0.98f, (long)1041393923578088373L);
        if (bl2) {
            if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) != null && hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1045344535518524325L), (Object)vec3, (long)1256728004038227497L) < 6.0) {
                gM gM2 = this;
                hi.a("\u00f2", (Object)gM2, (float)(hi.a("\u00e9", (Object)gM2, (long)675456699806064317L) - 0.8f), (long)675456699806064317L);
            }
            hi.a("\u00f2", (Object)this, (float)gM.y("PyFT6otaAWxWGYrq", clamp(float float float ), (float)(hi.a("\u00e9", (Object)this, (long)675456699806064317L) * hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)iJ2, (long)996942242067786222L), (Object)new Object[0], (long)1022326263013439043L)), (float)0.0f, (float)1.0f), (long)813589640703568556L);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void M(Object[] var1_1) {
        block19: {
            block18: {
                block16: {
                    block17: {
                        block15: {
                            block13: {
                                block14: {
                                    var2_2 = Dl.t();
                                    var3_3 /* !! */  = gM.b(10339, 5073809520569238751L) ^ gM.b(10484, 7422095471047263318L) ^ gM.b(6128, 4887542794704747348L) ^ gM.b(18776, 3926423455444608500L);
                                    if (var2_2) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            hi.a("\u00f2", (Object)this, (float)((1.0f - (float)hi.a("\u00e9", (Object)this, (long)932224973340092472L) / (float)hi.a("\u00e9", (Object)this, (long)1064144588222028637L)) * 0.15f), (long)737001268924615182L);
                                            v0 = this;
                                            hi.a("\u00f2", (Object)v0, (float)(hi.a("\u00e9", (Object)v0, (long)675456699806064317L) - 0.1f), (long)675456699806064317L);
                                            if (var2_2) break block13;
                                            if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null) break block14;
                                            break block15;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            cfr_temp_0 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1045344535518524325L), (Object)new Vec3((double)hi.a("\u00e9", (Object)this, (long)792301987515869896L), (double)hi.a("\u00e9", (Object)this, (long)1061381010527330786L), (double)hi.a("\u00e9", (Object)this, (long)598428387898362242L)), (long)1256728004038227497L) - 6.0;
                                            v1 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                            if (var2_2) break block16;
                                            if (v1 >= 0) break block17;
                                            break block18;
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            v2 = this;
                                            hi.a("\u00f2", (Object)v2, (float)(hi.a("\u00e9", (Object)v2, (long)675456699806064317L) - 0.8f), (long)675456699806064317L);
                                            if (var2_2) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)(hi.a("\u00e9", (Object)this, (long)675456699806064317L) * hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1286650094337192810L), (long)996942242067786222L), (Object)new Object[0], (long)1022326263013439043L)), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)813589640703568556L);
                                                    return;
                                                }
                                            }
                                            break block19;
                                            break;
                                        }
                                    }
lbl26:
                                    // 7 sources

                                    while (true) {
                                        switch (var3_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case 581434048: {
                                                ** continue;
                                            }
                                            case 581434046: {
                                                ** continue;
                                            }
                                            case 581434047: {
                                                ** continue;
                                            }
                                            case 581434050: 
                                        }
                                        hi.a("G", (long)414670365113859210L);
                                        return;
                                    }
                                }
                                var3_3 /* !! */  = (int)(hi.a("G", (int)((gM.b(24477, 6059214460644340540L) * gM.b(8976, 4693031201667895225L) ^ gM.b(1282, 2411730692263209383L)) * gM.b(15121, 5042585847070644142L)), (int)gM.b(30826, 3586875222695548100L), (long)834203424483934088L) - gM.b(25175, 1676117172586155751L));
                            }
                            if (!var2_2) ** GOTO lbl26
                        }
                        var3_3 /* !! */  = (int)(hi.a("G", (int)(gM.b(19676, 7620948820367941755L) + gM.b(7957, 1737706445829305248L)), (int)gM.b(27816, 379835346057232386L), (long)834203424483934088L) + gM.b(7886, 1545763636668133992L));
                        if (!var2_2) ** GOTO lbl26
                    }
                    v1 = hi.a("G", (int)((gM.b(10794, 7007420320780961432L) * gM.b(4841, 5690872063981649473L) ^ gM.b(1314, 4184086677188340111L)) * gM.b(29399, 4890905280438935159L)), (int)gM.b(14812, 1952021485160813951L), (long)834203424483934088L) - gM.b(24012, 1479413600603386211L);
                }
                var3_3 /* !! */  = (int)v1;
                if (!var2_2) ** GOTO lbl26
            }
            var3_3 /* !! */  = (gM.b(4750, 8840352623651225125L) - gM.b(3242, 5086525758525464604L) ^ gM.b(29614, 2012500797206535961L)) / 5 - gM.b(28181, 7565302303398494884L);
            if (!var2_2) ** GOTO lbl26
        }
        var3_3 /* !! */  = (int)(hi.a("G", (int)((gM.b(10794, 7007420320780961432L) * gM.b(4841, 5690872063981649473L) ^ gM.b(1314, 4184086677188340111L)) * gM.b(29399, 4890905280438935159L)), (int)gM.b(14812, 1952021485160813951L), (long)834203424483934088L) - gM.b(24012, 1479413600603386211L));
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite y(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        block8: {
            block7: {
                var0 = 4177771838212264263L;
                var6_1 = new long[28];
                var3_2 = 0;
                var4_3 = "_\u00dcL\u00fd\u00acV@ij\u00e1le\u00fb\u0081f\u0017<\u00eb\u00a1+W\f\u00c4P\u00ad\u00ee\u008657N\u00b8\u00b7\u00ad\u008e\u0018\u0091\u00e9\u009a`\fU%69\u00d7[\u0087\u00e4u\u0090Y\u00d4\u000e\u00fcxv%!\u00e7\u00c7\u00d5L\u00a0\u00b5Y\u00c8\u0011\u00bb\u000f\u001a\tQ\u0003\u0010\u001a+\u00f7\u0001\u00a1\u00b7Q&\u00fc!\u0016\f\u00c4x\u0091\u00c6g<9^R>\u0007BSj\u00f2\u001aL y\u00df\u008fr\u00fc\u001b\u0014\u00c9\u0013\u00c2\u008fgT\u0011P\u0013\u00aa.\u0018S\u0090\u00fd\u00e1\u00eb\u00a5\u001f\u008f\u00b5\u009d\u00ed\b\u0082\u00e7\u00b6\u00e6WJ\u0005^\u00c5`\u00e17\u001d\u0083g\u00a6\u00d4>\u0011\u00c1\u00ed\u00c2\u00e8\u0017\u001a\u00dapK\n\u0002s\"\u00fdF\u0002W\u00a8Ba\r\u00d2\u001dT\u00e8\u00cbt<\u00a5\u00b9p\u0094\u00ee\u00b2\u00f5,\u00b6\u00d5\u00ce}\u00f1x\u00df\u00e7il\u0003CI\u00a2\u0015\u00be\u008d\u00ac";
                var5_4 = "_\u00dcL\u00fd\u00acV@ij\u00e1le\u00fb\u0081f\u0017<\u00eb\u00a1+W\f\u00c4P\u00ad\u00ee\u008657N\u00b8\u00b7\u00ad\u008e\u0018\u0091\u00e9\u009a`\fU%69\u00d7[\u0087\u00e4u\u0090Y\u00d4\u000e\u00fcxv%!\u00e7\u00c7\u00d5L\u00a0\u00b5Y\u00c8\u0011\u00bb\u000f\u001a\tQ\u0003\u0010\u001a+\u00f7\u0001\u00a1\u00b7Q&\u00fc!\u0016\f\u00c4x\u0091\u00c6g<9^R>\u0007BSj\u00f2\u001aL y\u00df\u008fr\u00fc\u001b\u0014\u00c9\u0013\u00c2\u008fgT\u0011P\u0013\u00aa.\u0018S\u0090\u00fd\u00e1\u00eb\u00a5\u001f\u008f\u00b5\u009d\u00ed\b\u0082\u00e7\u00b6\u00e6WJ\u0005^\u00c5`\u00e17\u001d\u0083g\u00a6\u00d4>\u0011\u00c1\u00ed\u00c2\u00e8\u0017\u001a\u00dapK\n\u0002s\"\u00fdF\u0002W\u00a8Ba\r\u00d2\u001dT\u00e8\u00cbt<\u00a5\u00b9p\u0094\u00ee\u00b2\u00f5,\u00b6\u00d5\u00ce}\u00f1x\u00df\u00e7il\u0003CI\u00a2\u0015\u00be\u008d\u00ac".length();
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
                    var4_3 = "2\u00bd\u00ef\u00a6f\n\n-*T\u00b6Z\u00e5\u00c8\u00c9\u0085";
                    var5_4 = "2\u00bd\u00ef\u00a6f\n\n-*T\u00b6Z\u00e5\u00c8\u00c9\u0085".length();
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
        gM.a = var6_1;
        gM.d = new Integer[28];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6CA7;
        if (d[n2] == null) {
            gM.d[n2] = (int)(a[n2] ^ l);
        }
        return d[n2];
    }
}
