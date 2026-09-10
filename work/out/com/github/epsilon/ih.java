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

public final class ih
extends Record {
    private final float k5;
    private final float kt;
    private final float ke;
    private final float kz;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public float Kz() {
        return (float)hi.a("\u00e9", (Object)this, (long)387004103855290270L);
    }

    public ih C(float f, float f2) {
        return new ih((float)(hi.a("\u00e9", (Object)this, (long)1280681041961199968L) + f), (float)(hi.a("\u00e9", (Object)this, (long)387004103855290270L) + f2), (float)hi.a("G", (float)0.0f, (float)(hi.a("\u00e9", (Object)this, (long)934154511961590414L) - f * 2.0f), (long)1021203527991582354L), (float)hi.a("G", (float)0.0f, (float)(hi.a("\u00e9", (Object)this, (long)764025848088813716L) - f2 * 2.0f), (long)1021203527991582354L));
    }

    public static /* bridge */ /* synthetic */ CallSite x(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public float Kb() {
        return (float)(hi.a("\u00e9", (Object)this, (long)1280681041961199968L) + hi.a("\u00e9", (Object)this, (long)934154511961590414L));
    }

    public ih(float f, float f2, float f3, float f4) {
        block6: {
            block3: {
                CallSite callSite;
                block5: {
                    boolean bl;
                    block4: {
                        block2: {
                            boolean bl2 = Dl.t();
                            bl = bl2;
                            callSite = hi.a("G", (float)f, (long)619542100356072855L);
                            if (bl) break block2;
                            if (callSite == false) break block3;
                            callSite = hi.a("G", (float)f2, (long)619542100356072855L);
                        }
                        if (bl) break block4;
                        if (callSite == false) break block3;
                        callSite = hi.a("G", (float)f3, (long)619542100356072855L);
                    }
                    if (bl) break block5;
                    if (callSite == false) break block3;
                    callSite = hi.a("G", (float)f4, (long)619542100356072855L);
                }
                if (callSite != false) break block6;
            }
            throw new IllegalArgumentException(a);
        }
        this.ke = f;
        this.kz = f2;
        this.kt = f3;
        this.k5 = f4;
    }

    public float Ke() {
        return (float)hi.a("\u00e9", (Object)this, (long)1280681041961199968L);
    }

    public float K5() {
        return (float)hi.a("\u00e9", (Object)this, (long)764025848088813716L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean X(double var1_1, double var3_2) {
        block15: {
            var5_3 = Dl.S();
            var6_4 /* !! */  = ih.a(10186, 4002845403900071639L) / 4 ^ ih.a(3579, 4566085444413449419L);
            if (var5_3) ** GOTO lbl15
            block11: while (true) {
                block18: {
                    block17: {
                        block16: {
                            v0 /* !! */  = (cfr_temp_0 = var1_1 - (double)hi.a("\u00e9", (Object)this, (long)1280681041961199968L)) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (!var5_3) break block16;
                            if (v0 /* !! */  >= 0) break block17;
                            v0 /* !! */  = (double)(hi.a("G", (int)ih.a(7868, 1289544798187059116L), (int)ih.a(24284, 8483645305439795151L), (long)834203424483934088L) * ih.a(9211, 5187779437565070061L) * ih.a(9536, 7501016262268636230L) - ih.a(10354, 4509472130325823818L));
                        }
                        var6_4 /* !! */  = (int)v0 /* !! */ ;
                        if (var5_3) break block18;
                    }
                    var6_4 /* !! */  = (int)(ih.x("mSsIxjf9Fg2C1tw8", max(int int ), (int)hi.a("G", (int)(ih.a(8410, 2119569994802645457L) - ih.a(14084, 4155947452408323632L)), (int)ih.a(2429, 8461082376911970395L), (long)834203424483934088L), (int)ih.a(17337, 3178425207300106894L)) - ih.a(1085, 815365075713748273L));
                    if (!var5_3) ** GOTO lbl48
                }
                block12: while (true) {
                    switch (var6_4 /* !! */ ) {
                        default: {
                            continue block11;
                        }
                        case 1662894155: {
                            cfr_temp_1 = var1_1 - (double)ih.x("mSsIxjf9Fg2C1tw8", Kb(), (ih)this);
                            v1 /* !! */  = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            if (!var5_3) ** GOTO lbl49
                            if (v1 /* !! */  > 0) ** GOTO lbl48
                            ** GOTO lbl51
                        }
                        case 1662894154: {
                            cfr_temp_2 = var3_2 - (double)hi.a("\u00e9", (Object)this, (long)387004103855290270L);
                            v2 /* !! */  = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                            if (!var5_3) ** GOTO lbl54
                            if (v2 /* !! */  < 0) ** GOTO lbl53
                            ** GOTO lbl56
                        }
                        case 1662894153: {
                            cfr_temp_3 = var3_2 - (double)hi.a("\u00a5", (Object)this, (long)1071165211830268448L);
                            v3 /* !! */  = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                            if (!var5_3) ** GOTO lbl59
                            if (v3 /* !! */  > 0) ** GOTO lbl58
                            ** GOTO lbl61
                        }
                        case 1662894151: {
                            v4 = true;
                            var6_4 /* !! */  = (int)(hi.a("G", (int)(ih.a(5188, 569374996891663711L) - ih.a(22774, 4268037461639508439L) ^ ih.a(8971, 110933046023473676L)), (int)ih.a(4841, 6627907683707026419L), (long)834203424483934088L) + ih.a(28812, 7145693394088008066L));
                            if (var5_3) break block15;
                            ** GOTO lbl63
                        }
                        case 1662894149: {
                            v4 = false;
                            if (!var5_3) {
                                return v4;
                            }
                            ** GOTO lbl63
                        }
lbl48:
                        // 2 sources

                        v1 /* !! */  = (double)(hi.a("G", (int)ih.a(3643, 4225414385885931280L), (int)ih.a(11697, 5627599289909691567L), (long)834203424483934088L) * ih.a(14362, 2707561089958760784L) * ih.a(22507, 6099887388711173853L) - ih.a(32077, 3235401839100859519L));
lbl49:
                        // 2 sources

                        var6_4 /* !! */  = (int)v1 /* !! */ ;
                        if (var5_3) continue block12;
lbl51:
                        // 2 sources

                        var6_4 /* !! */  = (int)(hi.a("G", (int)(ih.a(18573, 422830809693987250L) * ih.a(30690, 6016302104328019627L) + ih.a(11341, 3337389338730120572L)), (int)ih.a(27688, 2945396467737625861L), (long)834203424483934088L) - ih.a(3655, 4732386712209549157L) - ih.a(11838, 7046326428432418618L));
                        if (var5_3) continue block12;
lbl53:
                        // 2 sources

                        v2 /* !! */  = (double)(hi.a("G", (int)ih.a(3643, 4225414385885931280L), (int)ih.a(11697, 5627599289909691567L), (long)834203424483934088L) * ih.a(14362, 2707561089958760784L) * ih.a(22507, 6099887388711173853L) - ih.a(32077, 3235401839100859519L));
lbl54:
                        // 2 sources

                        var6_4 /* !! */  = (int)v2 /* !! */ ;
                        if (var5_3) continue block12;
lbl56:
                        // 2 sources

                        var6_4 /* !! */  = (ih.a(1869, 1446912148286533219L) * ih.a(680, 8105990568835378052L) * ih.a(3912, 651813391926060658L) + ih.a(25266, 7065426619786791815L)) / ih.a(12047, 4111208697647941167L) ^ ih.a(8888, 6383521745470933894L);
                        if (var5_3) continue block12;
lbl58:
                        // 2 sources

                        v3 /* !! */  = (double)(hi.a("G", (int)ih.a(3643, 4225414385885931280L), (int)ih.a(11697, 5627599289909691567L), (long)834203424483934088L) * ih.a(14362, 2707561089958760784L) * ih.a(22507, 6099887388711173853L) - ih.a(32077, 3235401839100859519L));
lbl59:
                        // 2 sources

                        var6_4 /* !! */  = (int)v3 /* !! */ ;
                        if (var5_3) continue block12;
lbl61:
                        // 2 sources

                        var6_4 /* !! */  = ih.a(13515, 391956702978989538L) - ih.a(10609, 3008565833702457454L) + ih.a(1685, 7057478712613302170L) - ih.a(29205, 1120676853715213077L) - ih.a(6766, 6825169762587669330L);
                        continue block12;
lbl63:
                        // 2 sources

                        var6_4 /* !! */  = (int)(hi.a("G", (int)(ih.a(2, 5077383605340465411L) - ih.a(2528, 1407554794416300253L) ^ ih.a(26592, 6260407983023591154L)), (int)ih.a(18600, 7680410941621772733L), (long)834203424483934088L) + ih.a(21264, 5476657045776448019L));
                        break block15;
                        case 1662894152: 
                    }
                    break;
                }
                break;
            }
            return false;
        }
        block13: while (true) {
            switch (var6_4 /* !! */ ) {
                case -947956742: {
                    hi.a("G", (double)14.0, (long)439999302750573161L);
                    hi.a("G", (long)393077516895504904L);
                    var6_4 /* !! */  = (ih.a(18500, 2643147779717669245L) - ih.a(21263, 7724293845961816586L)) * ih.a(12710, 4068025821233993859L) - ih.a(3865, 6305706908597249541L);
                    continue block13;
                }
            }
            break;
        }
        return v4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ih.class, "ke;kz;kt;k5", "ke", "kz", "kt", "k5"}, this);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ih t(ih var1_1) {
        block11: {
            block10: {
                block9: {
                    var2_2 = Dl.t();
                    var7_3 /* !! */  = (ih.a(28338, 7113168655088486294L) + ih.a(21761, 8828525480863153190L) ^ ih.a(17504, 3303653153602350434L) ^ ih.a(23977, 7494279872876295302L)) + ih.a(32378, 6389581969910896494L);
                    if (var2_2) ** GOTO lbl-1000
                    switch (var7_3 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var3_4 = hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)1280681041961199968L), (float)hi.a("\u00a5", (Object)var1_1, (long)906597334513960415L), (long)1021203527991582354L);
                            var4_5 = hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)387004103855290270L), (float)hi.a("\u00a5", (Object)var1_1, (long)1092110395291557528L), (long)1021203527991582354L);
                            var5_6 = hi.a("G", (float)hi.a("\u00a5", (Object)this, (long)889595511813135488L), (float)hi.a("\u00a5", (Object)var1_1, (long)889595511813135488L), (long)971000971621905228L);
                            var6_7 = hi.a("G", (float)hi.a("\u00a5", (Object)this, (long)1071165211830268448L), (float)hi.a("\u00a5", (Object)var1_1, (long)1071165211830268448L), (long)971000971621905228L);
                            v0 /* !! */  = var5_6 == var3_4 ? 0 : (var5_6 < var3_4 ? -1 : 1);
                            if (var2_2) break block9;
                            if (v0 /* !! */  <= 0) break;
                            break block10;
                        }
                        case 1613900336: {
                            throw null;
                        }
                    }
                    v0 /* !! */  = (reference)(ih.a(20206, 2282386522165159845L) ^ ih.a(20975, 4203636365696055543L) ^ ih.a(16291, 3241896835444496058L));
                }
                var7_3 /* !! */  = (int)v0 /* !! */ ;
                if (!var2_2) break block11;
            }
            var7_3 /* !! */  = (int)(hi.a("G", (int)(ih.x("mSsIxjf9Fg2C1tw8", max(int int ), (int)ih.a(27490, 1050626853764006515L), (int)ih.a(24508, 7729006378385356532L)) - ih.a(13689, 7289381308480216179L)), (int)ih.a(22927, 4017556199822504088L), (long)834203424483934088L) / ih.a(412, 4547238165136074919L) - ih.a(21093, 3962708559835741014L));
            if (var2_2) ** GOTO lbl33
        }
        block8: while (true) {
            switch (var7_3 /* !! */ ) {
                default: {
                    v1 /* !! */  = var6_7 == var4_5 ? 0 : (var6_7 < var4_5 ? -1 : 1);
                    if (var2_2) ** GOTO lbl34
                    if (v1 /* !! */  > 0) ** GOTO lbl33
                    ** GOTO lbl36
                }
                case -996385738: {
                    throw null;
                }
lbl33:
                // 2 sources

                v1 /* !! */  = (reference)(ih.a(4301, 1824455751149386213L) - ih.a(2293, 727768977806057981L) - ih.a(1420, 3625385515718503590L));
lbl34:
                // 2 sources

                var7_3 /* !! */  = (int)v1 /* !! */ ;
                if (!var2_2) continue block8;
lbl36:
                // 2 sources

                var7_3 /* !! */  = ih.a(24657, 4739632354801027442L) ^ ih.a(24720, 9129828012133484953L) ^ ih.a(13863, 6978026448044416810L);
                continue block8;
                case -996385737: {
                    return null;
                }
                case -996385735: 
            }
            break;
        }
        return new ih((float)var3_4, (float)var4_5, (float)(var5_6 - var3_4), (float)(var6_7 - var4_5));
    }

    public ih i(float f) {
        return hi.a("\u00a5", (Object)this, (float)f, (float)f, (long)873401751381742229L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ih.class, "ke;kz;kt;k5", "ke", "kz", "kt", "k5"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ih.class, "ke;kz;kt;k5", "ke", "kz", "kt", "k5"}, this);
    }

    public float Km() {
        return (float)(hi.a("\u00e9", (Object)this, (long)387004103855290270L) + hi.a("\u00e9", (Object)this, (long)764025848088813716L));
    }

    public float Kh() {
        return (float)(hi.a("\u00e9", (Object)this, (long)1280681041961199968L) + hi.a("\u00e9", (Object)this, (long)934154511961590414L) / 2.0f);
    }

    public float K() {
        return (float)(hi.a("\u00e9", (Object)this, (long)387004103855290270L) + hi.a("\u00e9", (Object)this, (long)764025848088813716L) / 2.0f);
    }

    public float Kt() {
        return (float)hi.a("\u00e9", (Object)this, (long)934154511961590414L);
    }

    public ih h(float f, float f2) {
        return new ih((float)(hi.a("\u00e9", (Object)this, (long)1280681041961199968L) + f), (float)(hi.a("\u00e9", (Object)this, (long)387004103855290270L) + f2), (float)hi.a("\u00e9", (Object)this, (long)934154511961590414L), (float)hi.a("\u00e9", (Object)this, (long)764025848088813716L));
    }

    public ih I() {
        return new ih(0.0f, 0.0f, (float)hi.a("\u00e9", (Object)this, (long)934154511961590414L), (float)hi.a("\u00e9", (Object)this, (long)764025848088813716L));
    }

    public ih f(ih ih2) {
        return new ih((float)(hi.a("\u00e9", (Object)this, (long)1280681041961199968L) - hi.a("\u00a5", (Object)ih2, (long)906597334513960415L)), (float)(hi.a("\u00e9", (Object)this, (long)387004103855290270L) - hi.a("\u00a5", (Object)ih2, (long)1092110395291557528L)), (float)hi.a("\u00e9", (Object)this, (long)934154511961590414L), (float)hi.a("\u00e9", (Object)this, (long)764025848088813716L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = ":!@RCr@\u000e\u0006\u0007LC1B\u000e\u0004\u0015EU1Y\u001a\u001b\u0014\u0000Dt\u0014\t\u0001\u000eIRt".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 54;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 89;
                                break;
                            }
                            case 1: {
                                v9 = 94;
                                break;
                            }
                            case 2: {
                                v9 = 86;
                                break;
                            }
                            case 3: {
                                v9 = 22;
                                break;
                            }
                            case 4: {
                                v9 = 16;
                                break;
                            }
                            case 5: {
                                v9 = 39;
                                break;
                            }
                            default: {
                                v9 = 2;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                ih.a = new String(v10).intern();
                var0_1 = 4618219559736476681L;
                var6_2 = new long[68];
                var3_3 = 0;
                var4_4 = "\u00a3\u008d\t\u001c<]R,+r\u00f9\u0091\u00da\u00d7\u00c0\u00fc\u00d9Th\u00bf\u00eb~\u0096\u00d8\u00e0\u00fb\u00cel\u00b7\u0085\u00a2~\u008d\"\u00da\u00ddh\u00898\u008dZvG\u0015\u00d6\u00c8 D7m\u00aa\u0087V\u00daB\u00fe\u00b3r\u00d8\u00cf\u00a0\u00ec\u00e0\u00eb\u0019\u00b9*\u00a1OQBx\u0089\u00a6nZ[\u0013\u007f\r\u00ddh\u008d\u00d7\u00e6\u00b1CzYRv\u0081H&\u00b7\u00bf@Z\u0092uv7+M\u00de\u00b0\u0097\u0087\u00b9\"\\\f\u00fe\u00af\u0012\u001f\u00cds\u00956C\u00d6\u00a1O\u00fb1\u00cfZ\u00daj\u0095\u00ca\u00e7_1\u001d\u00a0\u00a9\u001c\u001d\t\u00c7\u00e3B#\u00f8\u00d6\u00b3\u00a6S\u00d6$\u00f1\u00c8k\u00c7\u00e2\u00f5uAc~;\u00e12\u00cc\u009a>\u00a9\u000e\u001b\rd\u0004\u0015Y)\u00d5\u00e2\u00a4\u00c9\u00d9\u009bg\u0089\u00b4\u00f4Xl\u0016a\u0091G\u00ae\u00ff\u00c0\u00d7T\u009c\u00dd\f%\u00d9\u00bbP\u00b1!\u00a2\u00d7\u001a\u00cesv~\u0092\u00f1\u0099\u001e\u0093\u00a4vCQ\u00c8D\u008f\u0014\u0016\u00e1\u00e6\u00af\u000f\n\u00bf\u00b3o\u00df5k\u00fb\u0095\u0081Vh\u00b7TP\u00ad\u00a85\u0086:`\u008a[sr\u0010\nr\u00ac\u0000\u0006j\u0019M\u00e5\u00f5\u00c3q\u0010\u00ca\u0088\u00f1\u00d0\u00ad\u001a\u00db1\u001e\u007f\u00f3\u00b3\u0015\u00be,\u0003JP\u00b6.\u00ebn\u00ec\u0002\u0096M?\u00a0\u000bdh\u00fbBhA\u00e9~;#\u0080\u0011/\tj\u0014\u0085W\u00e1\u008d;\u00e7\u009f4\u0087\u007f\u0014\u0014b?\u009c\u0016\u00e4\u0017\u00c2*f\u0084\u00e4&>\u0018\u00ed^\u00ca:\u00c2\u00a5\u0086|R2\u0095\u0003\u00f7\u00dc\u0017\u00db\u0089\u00f5\u0016\u00ef\u0003\u00f4m\u00f5\u00a2\u00c9\u00e4c\u00f9{\nfF\u00a62d\u0087\u00e1\u0006\u00a0\u00ed\u0095\u00d0\u00a1,\u009f\u00de\u00b9\u00c4\u008eg\u00f2\u0017TW\u00a8\u00c7Cw\u00b8`dv\u00d2l\u00be\u00ff\u00f8T\u0087#\u0017T\u00d4t\u0016J\u000b\u0011~\u00c5\u001e\u00a1x\u001a'N8\u00fe\u00cd\u00ac$^\u00af\u0096\"\u00d0w/\u0083\u00b2A\u00fc\u00bf b\u008e\u00ddX\u00dc\u00ea\u008d5F\u0015\u00edY\u00e6\u00d2\u008b\u0094\u00bc\u0002\u008b\u00d5e\u0002\u0097\u0015S\r8*\u0093^p\u0012v&tq\u00dd$\u00a2\u00e8\u00c7\u0085T\u00ebV\u00f1R\u00df6t>\u00d8\u00ee\u0092S1\nJ\u00ae\u00d9Js\u00c1=\u00c1\u00d8\u008e\u00eb\u00b5\u00c8j\u009a}\u008d\u00ac|S\u00cdIm\u00bf";
                var5_5 = "\u00a3\u008d\t\u001c<]R,+r\u00f9\u0091\u00da\u00d7\u00c0\u00fc\u00d9Th\u00bf\u00eb~\u0096\u00d8\u00e0\u00fb\u00cel\u00b7\u0085\u00a2~\u008d\"\u00da\u00ddh\u00898\u008dZvG\u0015\u00d6\u00c8 D7m\u00aa\u0087V\u00daB\u00fe\u00b3r\u00d8\u00cf\u00a0\u00ec\u00e0\u00eb\u0019\u00b9*\u00a1OQBx\u0089\u00a6nZ[\u0013\u007f\r\u00ddh\u008d\u00d7\u00e6\u00b1CzYRv\u0081H&\u00b7\u00bf@Z\u0092uv7+M\u00de\u00b0\u0097\u0087\u00b9\"\\\f\u00fe\u00af\u0012\u001f\u00cds\u00956C\u00d6\u00a1O\u00fb1\u00cfZ\u00daj\u0095\u00ca\u00e7_1\u001d\u00a0\u00a9\u001c\u001d\t\u00c7\u00e3B#\u00f8\u00d6\u00b3\u00a6S\u00d6$\u00f1\u00c8k\u00c7\u00e2\u00f5uAc~;\u00e12\u00cc\u009a>\u00a9\u000e\u001b\rd\u0004\u0015Y)\u00d5\u00e2\u00a4\u00c9\u00d9\u009bg\u0089\u00b4\u00f4Xl\u0016a\u0091G\u00ae\u00ff\u00c0\u00d7T\u009c\u00dd\f%\u00d9\u00bbP\u00b1!\u00a2\u00d7\u001a\u00cesv~\u0092\u00f1\u0099\u001e\u0093\u00a4vCQ\u00c8D\u008f\u0014\u0016\u00e1\u00e6\u00af\u000f\n\u00bf\u00b3o\u00df5k\u00fb\u0095\u0081Vh\u00b7TP\u00ad\u00a85\u0086:`\u008a[sr\u0010\nr\u00ac\u0000\u0006j\u0019M\u00e5\u00f5\u00c3q\u0010\u00ca\u0088\u00f1\u00d0\u00ad\u001a\u00db1\u001e\u007f\u00f3\u00b3\u0015\u00be,\u0003JP\u00b6.\u00ebn\u00ec\u0002\u0096M?\u00a0\u000bdh\u00fbBhA\u00e9~;#\u0080\u0011/\tj\u0014\u0085W\u00e1\u008d;\u00e7\u009f4\u0087\u007f\u0014\u0014b?\u009c\u0016\u00e4\u0017\u00c2*f\u0084\u00e4&>\u0018\u00ed^\u00ca:\u00c2\u00a5\u0086|R2\u0095\u0003\u00f7\u00dc\u0017\u00db\u0089\u00f5\u0016\u00ef\u0003\u00f4m\u00f5\u00a2\u00c9\u00e4c\u00f9{\nfF\u00a62d\u0087\u00e1\u0006\u00a0\u00ed\u0095\u00d0\u00a1,\u009f\u00de\u00b9\u00c4\u008eg\u00f2\u0017TW\u00a8\u00c7Cw\u00b8`dv\u00d2l\u00be\u00ff\u00f8T\u0087#\u0017T\u00d4t\u0016J\u000b\u0011~\u00c5\u001e\u00a1x\u001a'N8\u00fe\u00cd\u00ac$^\u00af\u0096\"\u00d0w/\u0083\u00b2A\u00fc\u00bf b\u008e\u00ddX\u00dc\u00ea\u008d5F\u0015\u00edY\u00e6\u00d2\u008b\u0094\u00bc\u0002\u008b\u00d5e\u0002\u0097\u0015S\r8*\u0093^p\u0012v&tq\u00dd$\u00a2\u00e8\u00c7\u0085T\u00ebV\u00f1R\u00df6t>\u00d8\u00ee\u0092S1\nJ\u00ae\u00d9Js\u00c1=\u00c1\u00d8\u008e\u00eb\u00b5\u00c8j\u009a}\u008d\u00ac|S\u00cdIm\u00bf".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u0093\u009b\u00c2\u00f3\u00e2\u000e\u00c3\u0089\u00cf\u0095\u0094(\u00bb\u0007@\u00ce";
                    var5_5 = "\u0093\u009b\u00c2\u00f3\u00e2\u000e\u00c3\u0089\u00cf\u0095\u0094(\u00bb\u0007@\u00ce".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        ih.b = var6_2;
        ih.c = new Integer[68];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6909;
        if (c[n2] == null) {
            ih.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
