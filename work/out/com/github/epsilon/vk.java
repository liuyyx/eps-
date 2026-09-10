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
import java.lang.runtime.ObjectMethods;

public final class vk
extends Record {
    private final float MC;
    private final float mw;
    private final float m3;
    private final float ML;
    private final float mi;
    private final float MJ;
    private final float m8;
    private final float MW;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean X(double var1_1, double var3_2) {
        block15: {
            var5_3 = Dl.t();
            var6_4 = vk.a(23509, 5131824156825179348L) / vk.a(297, 3772085457850437179L) + vk.a(7030, 5256375050464236546L) + vk.a(26999, 524953509521155648L) - vk.a(30725, 1947163589872809739L);
            if (!var5_3) ** GOTO lbl15
            block11: while (true) {
                block18: {
                    block17: {
                        block16: {
                            v0 = (cfr_temp_0 = var1_1 - (double)hi.a("\u00e9", (Object)this, (long)410934721429024937L)) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (var5_3) break block16;
                            if (v0 >= 0) break block17;
                            v0 = vk.a(12367, 8329273286159122238L) * vk.a(28943, 5811974114147499641L) / vk.a(21464, 6445015623217044721L) ^ vk.a(2602, 3555279868786607383L);
                        }
                        var6_4 = (int)v0;
                        if (!var5_3) break block18;
                    }
                    var6_4 = (vk.a(25378, 5916995406458940469L) * vk.a(884, 764440990616620123L) - vk.a(4062, 3603703735087202533L)) * vk.a(11012, 6370398579679503390L) / vk.a(2345, 3017911096435803652L) - vk.a(11966, 771455762953904527L);
                    if (var5_3) ** GOTO lbl52
                }
                while (true) {
                    block26: {
                        block24: {
                            block25: {
                                block23: {
                                    block21: {
                                        block22: {
                                            block20: {
                                                block19: {
                                                    switch (var6_4) {
                                                        default: {
                                                            continue block11;
                                                        }
                                                        case 711672709: {
                                                            cfr_temp_1 = var1_1 - (double)(hi.a("\u00e9", (Object)this, (long)410934721429024937L) + hi.a("\u00e9", (Object)this, (long)576399264130107637L));
                                                            v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                            if (var5_3) break block19;
                                                            if (v1 > 0) break;
                                                            break block20;
                                                        }
                                                        case 711672711: {
                                                            cfr_temp_2 = var3_2 - (double)hi.a("\u00e9", (Object)this, (long)436195854469252936L);
                                                            v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                            if (var5_3) break block21;
                                                            if (v2 < 0) break block22;
                                                            break block23;
                                                        }
                                                        case 711672708: {
                                                            cfr_temp_3 = var3_2 - (double)(hi.a("\u00e9", (Object)this, (long)436195854469252936L) + hi.a("\u00e9", (Object)this, (long)813416720066566711L));
                                                            v3 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                            if (var5_3) break block24;
                                                            if (v3 > 0) break block25;
                                                            break block26;
                                                        }
                                                        case 711672710: {
                                                            v4 = true;
                                                            var6_4 = hi.a("G", (int)vk.a(26331, 4994797208213809657L), (int)vk.a(13725, 6764325596203760367L), (long)834203424483934088L) + vk.a(27210, 4960195589960394080L) + vk.a(20137, 6491489540918329775L) ^ vk.a(8192, 1045508414338805525L);
                                                            if (var5_3) {
                                                                break block11;
                                                            }
                                                            break block15;
                                                        }
                                                        case 711672712: {
                                                            v4 = false;
                                                            if (!var5_3) break block11;
                                                            return v4;
                                                        }
                                                        case 711672707: {
                                                            hi.a("G", (long)705339817202267199L);
                                                            return true;
                                                        }
                                                    }
lbl52:
                                                    // 2 sources

                                                    v1 = vk.a(22020, 773177386181679412L) * vk.a(31314, 8335092289259435305L) / vk.a(18400, 5709541948116813975L) ^ vk.a(25220, 6648643345028410786L);
                                                }
                                                var6_4 = (int)v1;
                                                if (!var5_3) continue;
                                            }
                                            var6_4 = vk.a(10960, 5023064892219073993L) * vk.a(32521, 2594700088384811037L) / vk.a(8055, 7147277080693968998L) ^ vk.a(13507, 6063251997335337949L);
                                            if (!var5_3) continue;
                                        }
                                        v2 = vk.a(22020, 773177386181679412L) * vk.a(31314, 8335092289259435305L) / vk.a(18400, 5709541948116813975L) ^ vk.a(25220, 6648643345028410786L);
                                    }
                                    var6_4 = (int)v2;
                                    if (!var5_3) continue;
                                }
                                var6_4 = (vk.a(27651, 1115073691378770748L) * vk.a(20766, 2852639337162399290L) ^ vk.a(4917, 6500017109257493568L)) + vk.a(7803, 6786487395320140098L);
                                if (!var5_3) continue;
                            }
                            v3 = vk.a(22020, 773177386181679412L) * vk.a(31314, 8335092289259435305L) / vk.a(18400, 5709541948116813975L) ^ vk.a(25220, 6648643345028410786L);
                        }
                        var6_4 = (int)v3;
                        if (!var5_3) continue;
                    }
                    var6_4 = vk.a(28623, 5689750842027401411L) * vk.a(23386, 2700722555974571084L) ^ vk.a(31856, 5881227179692585811L) ^ vk.a(10676, 5912111783519069886L);
                }
                break;
            }
            var6_4 = hi.a("G", (int)vk.a(19643, 7347788580818863026L), (int)vk.a(9194, 7964439746614242546L), (long)834203424483934088L) + vk.a(15746, 444123531273810573L) + vk.a(13608, 1015463636176321115L) ^ vk.a(4214, 4978227515897847665L);
        }
        block13: while (true) {
            switch (var6_4) {
                case 1334378632: {
                    vk.O("elmB2tLtyRFhraaN", values());
                    vk.O("elmB2tLtyRFhraaN", A());
                    var6_4 = vk.a(19144, 436256578810004986L) - vk.a(21088, 6238556715802909983L) ^ vk.a(11678, 1139488381302842020L);
                    continue block13;
                }
            }
            break;
        }
        return v4;
    }

    public float ML() {
        return (float)hi.a("\u00e9", (Object)this, (long)1196004555201632953L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean n(double var1_1, double var3_2) {
        block14: {
            var5_3 = Dl.S();
            var6_4 /* !! */  = vk.a(22600, 6252810310600316747L) * vk.a(7110, 8618713509604725994L) + vk.a(18528, 5176932288583747400L);
            if (var5_3) ** GOTO lbl15
            block11: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = (cfr_temp_0 = var1_1 - (double)hi.a("\u00e9", (Object)this, (long)410934721429024937L)) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (!var5_3) break block15;
                            if (v0 >= 0) break block16;
                            v0 = hi.a("G", (int)vk.a(23569, 7878198466474758946L), (int)vk.a(31553, 8079343655994618977L), (long)834203424483934088L) + vk.a(9836, 4870136075244251496L) ^ vk.a(16470, 2759215987090542461L);
                        }
                        var6_4 /* !! */  = (int)v0;
                        if (var5_3) break block17;
                    }
                    var6_4 /* !! */  = (int)(hi.a("G", (int)(vk.a(8685, 7269063700175138515L) / vk.a(14770, 8242716101427705527L)), (int)vk.a(31796, 8661192475029893900L), (long)834203424483934088L) + vk.a(21780, 4107616173807491599L) - vk.a(30257, 6708939670578559311L));
                    if (!var5_3) ** GOTO lbl54
                }
                while (true) {
                    block25: {
                        block23: {
                            block24: {
                                block22: {
                                    block20: {
                                        block21: {
                                            block19: {
                                                block18: {
                                                    switch (var6_4 /* !! */ ) {
                                                        default: {
                                                            continue block11;
                                                        }
                                                        case -686533847: {
                                                            cfr_temp_1 = var1_1 - (double)(hi.a("\u00e9", (Object)this, (long)410934721429024937L) + hi.a("\u00e9", (Object)this, (long)576399264130107637L));
                                                            v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                            if (!var5_3) break block18;
                                                            if (v1 > 0) break;
                                                            break block19;
                                                        }
                                                        case -686533848: {
                                                            cfr_temp_2 = var3_2 - (double)hi.a("\u00e9", (Object)this, (long)885861884828158469L);
                                                            v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                            if (!var5_3) break block20;
                                                            if (v2 < 0) break block21;
                                                            break block22;
                                                        }
                                                        case -686533852: {
                                                            cfr_temp_3 = var3_2 - (double)(hi.a("\u00e9", (Object)this, (long)885861884828158469L) + hi.a("\u00e9", (Object)this, (long)1196004555201632953L));
                                                            v3 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                            if (!var5_3) break block23;
                                                            if (v3 > 0) break block24;
                                                            break block25;
                                                        }
                                                        case -686533851: {
                                                            v4 = true;
                                                            var6_4 /* !! */  = vk.a(23216, 8767554295056520606L) + vk.a(26105, 9119082952538516196L) - vk.a(10915, 6240795730586707388L) + vk.a(26491, 8315111053760325639L);
                                                            if (!var5_3) {
                                                                break block11;
                                                            }
                                                            break block14;
                                                        }
                                                        case -686533849: {
                                                            v4 = false;
                                                            if (var5_3) break block11;
                                                            return v4;
                                                        }
                                                        case -686533853: {
                                                            vk.O("elmB2tLtyRFhraaN", Y());
                                                            hi.a("G", (float)1.0f, (long)1257120842392389918L);
                                                            return false;
                                                        }
                                                    }
lbl54:
                                                    // 2 sources

                                                    v1 = hi.a("G", (int)vk.a(12910, 1631386385717149027L), (int)vk.a(30047, 5635780688361093739L), (long)834203424483934088L) + vk.a(1247, 1809187050851503098L) ^ vk.a(15807, 7704277547624051407L);
                                                }
                                                var6_4 /* !! */  = (int)v1;
                                                if (var5_3) continue;
                                            }
                                            var6_4 /* !! */  = (vk.a(4833, 165163156961271265L) ^ vk.a(9251, 2627300995974114142L)) + vk.a(22278, 579773831223334916L);
                                            if (var5_3) continue;
                                        }
                                        v2 = hi.a("G", (int)vk.a(12910, 1631386385717149027L), (int)vk.a(30047, 5635780688361093739L), (long)834203424483934088L) + vk.a(1247, 1809187050851503098L) ^ vk.a(15807, 7704277547624051407L);
                                    }
                                    var6_4 /* !! */  = (int)v2;
                                    if (var5_3) continue;
                                }
                                var6_4 /* !! */  = vk.a(24601, 4989058913955507977L) + vk.a(1624, 8520866954326935917L) ^ vk.a(14964, 1115256640422655317L);
                                if (var5_3) continue;
                            }
                            v3 = hi.a("G", (int)vk.a(12910, 1631386385717149027L), (int)vk.a(30047, 5635780688361093739L), (long)834203424483934088L) + vk.a(1247, 1809187050851503098L) ^ vk.a(15807, 7704277547624051407L);
                        }
                        var6_4 /* !! */  = (int)v3;
                        if (var5_3) continue;
                    }
                    var6_4 /* !! */  = (vk.a(8791, 5724562637526478177L) ^ vk.a(28437, 1125696973617618973L)) + vk.a(2246, 3245941088229459962L);
                }
                break;
            }
            var6_4 /* !! */  = vk.a(28447, 5426502616124055555L) + vk.a(22507, 7424749598959851724L) - vk.a(21884, 3168799488992533111L) + vk.a(23425, 8408633503760635026L);
        }
        switch (var6_4 /* !! */ ) {
            default: {
                return v4;
            }
            case -554947363: 
        }
        hi.a("G", (long)397288152806896377L);
        return false;
    }

    public float M8() {
        return (float)hi.a("\u00e9", (Object)this, (long)813416720066566711L);
    }

    public static /* bridge */ /* synthetic */ CallSite O(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public float MJ() {
        return (float)hi.a("\u00e9", (Object)this, (long)885861884828158469L);
    }

    public float M3() {
        return (float)hi.a("\u00e9", (Object)this, (long)776176543283436128L);
    }

    public float MC() {
        return (float)hi.a("\u00e9", (Object)this, (long)410934721429024937L);
    }

    public float Mi() {
        return (float)hi.a("\u00e9", (Object)this, (long)436195854469252936L);
    }

    public float Mw() {
        return (float)hi.a("\u00e9", (Object)this, (long)576399264130107637L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vk.class, "m3;MJ;MW;ML;MC;mi;mw;m8", "m3", "MJ", "MW", "ML", "MC", "mi", "mw", "m8"}, this);
    }

    public float MW() {
        return (float)hi.a("\u00e9", (Object)this, (long)412271145394140777L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vk.class, "m3;MJ;MW;ML;MC;mi;mw;m8", "m3", "MJ", "MW", "ML", "MC", "mi", "mw", "m8"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vk.class, "m3;MJ;MW;ML;MC;mi;mw;m8", "m3", "MJ", "MW", "ML", "MC", "mi", "mw", "m8"}, this);
    }

    public vk(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.m3 = f;
        this.MJ = f2;
        this.MW = f3;
        this.ML = f4;
        this.MC = f5;
        this.mi = f6;
        this.mw = f7;
        this.m8 = f8;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3822161641994446227L;
                var6_1 = new long[77];
                var3_2 = 0;
                var4_3 = "\u00e0&L\u00dd\u00cc\u0099\u0010\u009e\u00ab\\&P\u00f1C\u009d\u00ff\u001a\u00dc[\u0003<V\u001d\u00c3\u0088*_\u00c2C\u00bb\u00e2\u00bc}\u00ab\u0007z\u00eeI\u007f<l\u00c8\u000f\u00d8\u00cbdZ\u00d3\u0015\u0090\u00bd\u00e6L\u00dc\u00f0\u009b\u00e7\f\u00de\u009d\u000f:\u00ab\u00fa\u00bbZ\u009b6;1\u00f0\u00f6\u0086\u00ca\u00dfh\u00e2\u000f<\u00b4]\u0000B3\u00a9_\u00d3\u001b^\u0087\u00de\u0091'\u00dc-\u00f1\u00a4\u0006\u00e0\u00d0\u00c4\u00ff\u00b2\u00c3x\u00ea\u00ccH\u0018W\u00ce\u00dd\u0080\u00d8>9W\u008d\u00fe\u009c\n' \u009b\u00dd\u00a7.\u0097q\u00cc\u00dd\u008a{\u00e1\u00e6\u001f\u0007\u00fd\u00e1\u00e7\u00e3\u00ee\u00bb\u00ae\u0087\u00bb\u00ac\u00a4\u00a4f\u00d7h7(\u00fa4\u0088\u00c3\u0013\u00c0\u00c4Ij\u0081\u00faLw#\u0004\u0019H\u0091\b\u00abNa\u00d0\u00c5y\u000f>\u00e6 IPn7\u00e9\u00d3\u00a2l\u00b6\fGA\u0085\u00efC\u00a0\u00d7\u0096\u00b9\u0002\u00b5\u00eb\u009d\u00c7\u0091\u0096A\u0092\u001cS\u00f7\u00e3\u009c\u00d7\u00e0\u00a8\u008fKL\u00d6\u0096\u00c5\u00da\u00ba \u0001\u009f{G\u00e0.\u00ea@=0'\u00c9b\u00cey\u0000\u00a8\u00829l\u00abE\u00f5Qf\u00fd]>=\u0006\u00d0p}\u009b\u00d3c\u001ey\u00b4\u001b\f\u00de\u00c9.\u009f\u0097T\u00ce\u00bb\u0090\u0097\u0014>M\u00a5\u00b1(\u00e7>W\u009e\nQ\nP\u0019~\u00a3B\u000bl\u008eP\u00a4k\u00a0\u0087<g\u00f4S=\u00f5\u00f3\u00de\u00a7\u00d7\u00d4\u00d2D8\u00f4\u0004\u0091\u00a7W:\u00ce\u00b5\u008fLO\u00ac\u00e7\u00bd\u00d6oD\u0015\u00c0I\u00e8<\u00b8\u00d47\u008d\u00151\u00e7\u00c4\u009b\u00f2\f\tK%:o\u00a0<}2N\u00e9\u00bfj\u0002\u00d9\u001c\u009a\u00d6\u00e2a\u00b0\u009fVvT\u00c3LD\u000b^\u0084\u00ee\u00dc\u00e6\u009d }\u00e2\u00a7p}\u00ffN\u008d\rlLnX(J\u00de\u0018\u00ceS)|n\u009da:\u00e4\u00f5\u00fa\u00f7\u0016sg\u008d\u009b5\u0017\u0086\u00da\u00cdavC\u001f>\u00c2aNx\u009a\u00fe#c\u0086\u00ea\u0001\u00c1\u00d4\u00dc\u00d8\u00f0\u00fa#\u00a5:D\u00cb\u00f0$MY}\u00d8\u00cdl\u00a83!\u00d5\u00ac\u001d\u001a\u001c\u0011}\u00e9\u00ba\u00c5S\u00c7\u0019\u001d\u008f\u00c9R\u00a5\u00b8F}JDa9\\O(\u0087\u0090\u00a7\u0014\u007f+\u001eTxd*\u00cfS\u00e8\u00cc\u00b7\u00ac\u00d3\u000e\u00ef\u00df\u00f4\u0018\u00fe\u0082-\n\u00dd\u0088\u00d7\u00b7?\u00c5\u0012\u009d\"\u00b1\u009e9T_2e\b\u00a2\u00fe\nz\u0003\u00a9\r\u00d8\"z}\u001ch7\u009aa\u0084\u0088!\u00f2a\u0092\u00f3\u00d9\u0081(\u00b6\u0016)\u00cd\u00f0[\u00c4\"@\r\u00a5\u0006\u00f5\u00ac6\u00f5/1\u008f\u00c9\u00a1\u00b6>\u00e8\u0096\u00ef\u00dc\u00f4\u001c\u009c\u00fe\u00f0\u008a\\\u00a4\u00de0";
                var5_4 = "\u00e0&L\u00dd\u00cc\u0099\u0010\u009e\u00ab\\&P\u00f1C\u009d\u00ff\u001a\u00dc[\u0003<V\u001d\u00c3\u0088*_\u00c2C\u00bb\u00e2\u00bc}\u00ab\u0007z\u00eeI\u007f<l\u00c8\u000f\u00d8\u00cbdZ\u00d3\u0015\u0090\u00bd\u00e6L\u00dc\u00f0\u009b\u00e7\f\u00de\u009d\u000f:\u00ab\u00fa\u00bbZ\u009b6;1\u00f0\u00f6\u0086\u00ca\u00dfh\u00e2\u000f<\u00b4]\u0000B3\u00a9_\u00d3\u001b^\u0087\u00de\u0091'\u00dc-\u00f1\u00a4\u0006\u00e0\u00d0\u00c4\u00ff\u00b2\u00c3x\u00ea\u00ccH\u0018W\u00ce\u00dd\u0080\u00d8>9W\u008d\u00fe\u009c\n' \u009b\u00dd\u00a7.\u0097q\u00cc\u00dd\u008a{\u00e1\u00e6\u001f\u0007\u00fd\u00e1\u00e7\u00e3\u00ee\u00bb\u00ae\u0087\u00bb\u00ac\u00a4\u00a4f\u00d7h7(\u00fa4\u0088\u00c3\u0013\u00c0\u00c4Ij\u0081\u00faLw#\u0004\u0019H\u0091\b\u00abNa\u00d0\u00c5y\u000f>\u00e6 IPn7\u00e9\u00d3\u00a2l\u00b6\fGA\u0085\u00efC\u00a0\u00d7\u0096\u00b9\u0002\u00b5\u00eb\u009d\u00c7\u0091\u0096A\u0092\u001cS\u00f7\u00e3\u009c\u00d7\u00e0\u00a8\u008fKL\u00d6\u0096\u00c5\u00da\u00ba \u0001\u009f{G\u00e0.\u00ea@=0'\u00c9b\u00cey\u0000\u00a8\u00829l\u00abE\u00f5Qf\u00fd]>=\u0006\u00d0p}\u009b\u00d3c\u001ey\u00b4\u001b\f\u00de\u00c9.\u009f\u0097T\u00ce\u00bb\u0090\u0097\u0014>M\u00a5\u00b1(\u00e7>W\u009e\nQ\nP\u0019~\u00a3B\u000bl\u008eP\u00a4k\u00a0\u0087<g\u00f4S=\u00f5\u00f3\u00de\u00a7\u00d7\u00d4\u00d2D8\u00f4\u0004\u0091\u00a7W:\u00ce\u00b5\u008fLO\u00ac\u00e7\u00bd\u00d6oD\u0015\u00c0I\u00e8<\u00b8\u00d47\u008d\u00151\u00e7\u00c4\u009b\u00f2\f\tK%:o\u00a0<}2N\u00e9\u00bfj\u0002\u00d9\u001c\u009a\u00d6\u00e2a\u00b0\u009fVvT\u00c3LD\u000b^\u0084\u00ee\u00dc\u00e6\u009d }\u00e2\u00a7p}\u00ffN\u008d\rlLnX(J\u00de\u0018\u00ceS)|n\u009da:\u00e4\u00f5\u00fa\u00f7\u0016sg\u008d\u009b5\u0017\u0086\u00da\u00cdavC\u001f>\u00c2aNx\u009a\u00fe#c\u0086\u00ea\u0001\u00c1\u00d4\u00dc\u00d8\u00f0\u00fa#\u00a5:D\u00cb\u00f0$MY}\u00d8\u00cdl\u00a83!\u00d5\u00ac\u001d\u001a\u001c\u0011}\u00e9\u00ba\u00c5S\u00c7\u0019\u001d\u008f\u00c9R\u00a5\u00b8F}JDa9\\O(\u0087\u0090\u00a7\u0014\u007f+\u001eTxd*\u00cfS\u00e8\u00cc\u00b7\u00ac\u00d3\u000e\u00ef\u00df\u00f4\u0018\u00fe\u0082-\n\u00dd\u0088\u00d7\u00b7?\u00c5\u0012\u009d\"\u00b1\u009e9T_2e\b\u00a2\u00fe\nz\u0003\u00a9\r\u00d8\"z}\u001ch7\u009aa\u0084\u0088!\u00f2a\u0092\u00f3\u00d9\u0081(\u00b6\u0016)\u00cd\u00f0[\u00c4\"@\r\u00a5\u0006\u00f5\u00ac6\u00f5/1\u008f\u00c9\u00a1\u00b6>\u00e8\u0096\u00ef\u00dc\u00f4\u001c\u009c\u00fe\u00f0\u008a\\\u00a4\u00de0".length();
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
                    var4_3 = "\u00ef\u00cc\u0000\u009d\rNB6m\u00d1\u00e6fE$\u0019\u00cd";
                    var5_4 = "\u00ef\u00cc\u0000\u009d\rNB6m\u00d1\u00e6fE$\u0019\u00cd".length();
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
        vk.a = var6_1;
        vk.b = new Integer[77];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xF37;
        if (b[n2] == null) {
            vk.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
