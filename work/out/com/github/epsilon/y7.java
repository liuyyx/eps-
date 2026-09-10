/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.configuration.AbstractViaConfig
 *  com.viaversion.viaversion.util.ConfigSection
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.viaversion.viaversion.configuration.AbstractViaConfig;
import com.viaversion.viaversion.util.ConfigSection;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

final class y7
extends AbstractViaConfig {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isServersideBlockConnections() {
        block16: {
            var1_1 = Dl.t();
            var2_2 /* !! */  = y7.a(10007, 4406050173337496916L) - y7.a(5557, 6435719561452150675L) + y7.a(11353, 7731572982701549128L);
            if (!var1_1) ** GOTO lbl26
lbl4:
            // 2 sources

            while (true) {
                block18: {
                    block17: {
                        v0 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)649202845256019622L), (long)789438897355831922L)), (long)1000026253634408124L);
                        if (var1_1) break block17;
                        if (v0 == false) break block18;
                        v0 = hi.a("G", (int)((y7.a(16359, 90665458050987491L) ^ y7.a(14791, 5255445369492140960L)) - y7.a(1368, 4872326835689934690L)), (int)y7.a(10203, 2488975342314909177L), (long)834203424483934088L) + y7.a(19096, 6227740748057346260L);
                    }
                    var2_2 /* !! */  = (int)v0;
                    if (!var1_1) ** GOTO lbl26
                }
                var2_2 /* !! */  = (y7.a(31236, 4705051262827212848L) + y7.a(14160, 7113986699829345646L)) / y7.a(31027, 3065492846495970136L) + y7.a(12210, 6880354762248938959L);
                if (!var1_1) ** GOTO lbl26
                if (true) ** GOTO lbl20
                break;
            }
            block10: while (true) {
                block21: {
                    block20: {
                        block19: {
                            v1 /* !! */  = super.isServersideBlockConnections();
                            if (var1_1) break block19;
                            if (v1 /* !! */ ) break block20;
lbl20:
                            // 2 sources

                            v1 /* !! */  = hi.a("G", (int)((y7.a(10571, 5914349687610270490L) ^ y7.a(8055, 3023804717666096430L)) - y7.a(23229, 7355292049720381580L)), (int)y7.a(14336, 6974787419175318019L), (long)834203424483934088L) + y7.a(16242, 144883817638655354L);
                        }
                        var2_2 /* !! */  = (int)v1 /* !! */ ;
                        if (!var1_1) break block21;
                    }
                    var2_2 /* !! */  = y7.a(14559, 5426844349493572237L) / y7.a(13951, 4918005952677969023L) - y7.a(12291, 7746123666252888598L) + y7.a(16844, 3843588289598065556L);
                }
                switch (var2_2 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 2101444688: {
                        continue block10;
                    }
                    case 2101444689: {
                        v2 = true;
                        var2_2 /* !! */  = (y7.a(32134, 5852417671043463125L) + y7.a(28879, 5254188362645879431L)) * y7.a(27580, 4061290146260427193L) + y7.a(19333, 301023927893918144L);
                        if (var1_1) {
                            break block10;
                        }
                        break block16;
                    }
                    case 2101444690: {
                        v2 = false;
                        if (!var1_1) break block10;
                        return v2;
                    }
                    case 2101444691: {
                        hi.a("G", (long)1186314902226853278L);
                        hi.a("G", (long)561677051612723832L);
                        continue block10;
                    }
                }
                break;
            }
            var2_2 /* !! */  = (y7.a(20252, 4947170918013699384L) + y7.a(4792, 7798931510865942711L)) * y7.a(31396, 4677752822219190463L) + y7.a(17484, 1708847353603886597L);
        }
        switch (var2_2 /* !! */ ) {
            default: {
                return v2;
            }
            case -818577364: 
        }
        throw null;
    }

    public boolean use1_8HitboxMargin() {
        return false;
    }

    public static /* bridge */ /* synthetic */ CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private y7(File file, Logger logger) {
        super(file, logger);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean cancelBlockSounds() {
        block25: {
            block24: {
                block22: {
                    block23: {
                        block21: {
                            block19: {
                                block20: {
                                    var1_1 = Dl.t();
                                    var2_2 /* !! */  = hi.a("G", (int)(y7.a(17993, 6491501152044944409L) * y7.a(18744, 1387448810080863005L)), (int)y7.a(9078, 7740312099252332860L), (long)834203424483934088L) - y7.a(3151, 9100525936880141915L);
                                    if (var1_1) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)1088710534636774411L), (Object)new Object[0], (long)1207470196233632057L);
                                            if (var1_1) break block19;
                                            if (v0 /* !! */  != false) break block20;
                                            break block21;
                                            break;
                                        }
lbl9:
                                        // 1 sources

                                        while (true) {
                                            hi.a("G", (long)1033419646183286307L);
                                            hi.a("G", (int)1, (long)525303406604919947L);
lbl14:
                                            // 2 sources

                                            while (true) {
                                                v1 = super.cancelBlockSounds();
                                                if (var1_1) break block22;
                                                if (v1 == 0) break block23;
                                                break block24;
                                                break;
                                            }
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            v2 = false;
                                            if (var1_1) lbl-1000:
                                            // 2 sources

                                            {
                                                return v2;
                                            }
                                            break block25;
                                            break;
                                        }
                                    }
lbl27:
                                    // 6 sources

                                    while (true) {
                                        switch (var2_2 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -772750639: {
                                                ** continue;
                                            }
                                            case -772750642: {
                                                ** continue;
                                            }
                                            case -772750643: {
                                                ** continue;
                                            }
                                            ** case -772750640:
lbl38:
                                            // 1 sources

                                            ** continue;
                                        }
                                        break;
                                    }
lbl39:
                                    // 2 sources

                                    while (true) {
                                        switch (var2_2 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case 284857017: 
                                        }
                                        return false;
                                    }
                                }
                                v0 /* !! */  = var2_2 /* !! */  = (CallSite)((y7.a(576, 4902415234900674574L) ^ y7.a(1098, 3619979126198619828L)) + y7.a(16082, 5953357150529090795L) - y7.a(21882, 1133445246646394633L) ^ y7.a(21543, 1758384305909964381L));
                            }
                            if (!var1_1) ** GOTO lbl27
                        }
                        var2_2 /* !! */  = (CallSite)((y7.a(25120, 8114133095822534758L) - y7.a(5122, 938924243559374429L)) / y7.a(4674, 8730658203808618538L) * y7.a(3032, 7888654214322110753L) / y7.a(24703, 7177191531290208782L) - y7.a(21717, 7652658543544344279L));
                        if (!var1_1) ** GOTO lbl27
                    }
                    v1 = (y7.a(15341, 8747511880203104682L) ^ y7.a(10157, 1597401766841806220L)) + y7.a(16216, 1426370956631405890L) - y7.a(23255, 6499062812810514472L) ^ y7.a(32576, 2371690334058919346L);
                }
                var2_2 /* !! */  = (CallSite)v1;
                if (!var1_1) ** GOTO lbl27
            }
            var2_2 /* !! */  = (CallSite)(y7.a(1832, 1887020519206309124L) * y7.a(10988, 4591555932419219649L) - y7.a(25711, 3244226501369736774L));
            ** while (true)
            v2 = true;
            var2_2 /* !! */  = (CallSite)(hi.a("G", (int)(y7.a(20937, 325029724909345703L) - y7.a(17966, 4381532099063155787L) ^ y7.a(22904, 8609389609876001553L)), (int)y7.a(19733, 8442901244152547136L), (long)834203424483934088L) ^ y7.a(7435, 8665014986899740460L));
            if (!var1_1) ** GOTO lbl39
        }
        var2_2 /* !! */  = (CallSite)(hi.a("G", (int)(y7.a(15856, 8843116743807989735L) - y7.a(22875, 8697218715490947956L) ^ y7.a(30039, 6956107853576519458L)), (int)y7.a(10299, 4751311661300474426L), (long)834203424483934088L) ^ y7.a(1568, 5620036939142188099L));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected boolean updateConfig() {
        block20: {
            block23: {
                block22: {
                    block21: {
                        var1_1 = Dl.t();
                        var4_2 /* !! */  = (y7.a(11292, 7477248493777249834L) * y7.a(13577, 7354718350524546898L) * y7.a(19695, 6134195125890385655L) ^ y7.a(22478, 5535606719436889512L)) + y7.a(26361, 588232718815571161L);
                        if (var1_1) ** GOTO lbl-1000
                        v0 = var4_2 /* !! */ ;
                        if (var1_1 != false) return (boolean)v0;
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var2_3 = 0;
                                var3_4 = hi.a("\u00a5", (Object)this, (long)837669825039824805L);
                                if (var1_1) break block21;
                                if (var3_4 != null) break;
                                break block22;
                            }
                            case -661828233: {
                                hi.a("G", (long)1275757049065691860L);
                                return (boolean)1;
                            }
                        }
                        var4_2 /* !! */  = ((y7.a(23858, 1347484955366234056L) + y7.a(24951, 3463170080349334272L)) * y7.a(9150, 5140685845148395954L) + y7.a(16963, 4233307012184049693L)) / y7.a(10110, 636714240327445794L) + y7.a(15663, 4482947321454196534L);
                    }
                    if (!var1_1) break block23;
                }
                var4_2 /* !! */  = (int)(hi.a("G", (int)y7.a(7076, 4528442025019855314L), (int)y7.a(32231, 7053711162645264333L), (long)834203424483934088L) * y7.a(27423, 165322120921293090L) * y7.a(14436, 6518568178116948563L) - y7.a(2395, 4369965399311762207L));
                if (!var1_1) break block23;
                ** GOTO lbl80
lbl24:
                // 2 sources

                while (true) {
                    v1 /* !! */  = var2_3;
                    if (var1_1) ** GOTO lbl83
                    if (v1 /* !! */  != 0) ** GOTO lbl82
                    ** GOTO lbl84
                    break;
                }
lbl29:
                // 2 sources

                while (true) {
                    v2 = super.updateConfig();
                    if (var1_1) ** GOTO lbl97
                    if (v2 != 0) ** GOTO lbl96
                    ** GOTO lbl98
                    break;
                }
            }
            block18: while (true) {
                block30: {
                    block28: {
                        block29: {
                            block27: {
                                block26: {
                                    block24: {
                                        block25: {
                                            switch (var4_2 /* !! */  ? 1 : 0) {
                                                default: {
                                                    hi.a("\u00a5", (Object)this, (Object)y7.a(8287, -17011), (Object)hi.a("G", (boolean)false, (long)827866887164769227L), (long)1260886985086216657L);
                                                    hi.a("\u00a5", (Object)this, (Object)y7.a(8280, 29628), (Object)y7.g("RJOFZbAh68yamDq5", valueOf(boolean ), (boolean)false), (long)1260886985086216657L);
                                                    hi.a("\u00a5", (Object)this, (Object)y7.a(8273, 385), (Object)hi.a("G", (boolean)true, (long)827866887164769227L), (long)1260886985086216657L);
                                                    hi.a("\u00a5", (Object)this, (Object)y7.a(8275, 19342), (Object)hi.a("G", (boolean)true, (long)827866887164769227L), (long)1260886985086216657L);
                                                    hi.a("\u00a5", (Object)this, (Object)y7.a(8286, 27526), (Object)hi.a("G", (boolean)true, (long)827866887164769227L), (long)1260886985086216657L);
                                                    var2_3 = 1;
                                                    if (!var1_1) break;
                                                    ** GOTO lbl24
                                                }
                                                case 982842409: {
                                                    ** continue;
                                                }
                                                case 982842406: {
                                                    v3 /* !! */  = y7.g("RJOFZbAh68yamDq5", contains(java.lang.String ), (ConfigSection)var3_4, (String)y7.a(8282, 28746));
                                                    if (var1_1) break block24;
                                                    if (v3 /* !! */  != false) break block25;
                                                    break block26;
                                                }
                                                case 982842411: {
                                                    hi.a("\u00a5", (Object)this, (Object)y7.a(8285, 4731), (Object)hi.a("G", (boolean)false, (long)827866887164769227L), (long)1260886985086216657L);
                                                    var2_3 = 1;
                                                    if (!var1_1) break block27;
                                                    ** GOTO lbl29
                                                }
                                                case 982842412: {
                                                    ** continue;
                                                }
                                                case 982842407: {
                                                    v4 = var2_3;
                                                    if (var1_1) break block28;
                                                    if (v4 == 0) break block29;
                                                    break block30;
                                                }
                                                case 982842414: {
                                                    v5 = true;
                                                    var4_2 /* !! */  = (int)(hi.a("G", (int)y7.g("RJOFZbAh68yamDq5", max(int int ), (int)y7.a(11041, 1400085087715320141L), (int)y7.a(15621, 4145223893359851367L)), (int)y7.a(16105, 7767541919977436322L), (long)834203424483934088L) + y7.a(17001, 95450940684863637L));
                                                    if (var1_1) {
                                                        break block18;
                                                    }
                                                    break block20;
                                                }
                                                case 982842410: {
                                                    v5 = false;
                                                    if (!var1_1) break block18;
                                                    return v5;
                                                }
                                                case 982842413: {
                                                    hi.a("G", (long)963057718638705759L);
                                                    var4_2 /* !! */  = hi.a("G", (int)(y7.a(23779, 8210103818339260124L) - y7.a(7875, 5897494133894796455L) - y7.a(29726, 9056822319002435110L)), (int)y7.a(795, 4668158236686338400L), (long)834203424483934088L) * y7.a(15652, 7391421156739053322L) ^ y7.a(27155, 530086375856545884L);
                                                    continue block18;
                                                }
                                            }
lbl80:
                                            // 2 sources

                                            var4_2 /* !! */  = ((y7.a(27368, 2458158747329732835L) + y7.a(9168, 5674237853091654117L)) * y7.a(15076, 3219765016341049510L) + y7.a(17153, 1614835201680542003L)) / y7.a(25374, 4967671718723758339L) + y7.a(25642, 5942301161735597593L);
                                            if (!var1_1) continue;
lbl82:
                                            // 2 sources

                                            v1 /* !! */  = var4_2 /* !! */  = (int)(hi.a("G", (int)(y7.a(24604, 737415551205943834L) - y7.a(22439, 3679375291159846321L) + y7.a(13043, 5617644417269070048L) ^ y7.a(1850, 2811627645760621862L)), (int)y7.a(29958, 5804189517483556726L), (long)834203424483934088L) + y7.a(7285, 6382033903043958307L));
lbl83:
                                            // 2 sources

                                            if (!var1_1) continue;
lbl84:
                                            // 2 sources

                                            var4_2 /* !! */  = (y7.a(13609, 7155564689421827907L) * y7.a(13527, 6678866522003373733L) + y7.a(5562, 5510302088328011714L)) / y7.a(4991, 1328811900461275476L) / y7.a(23174, 5876858780482769044L) + y7.a(21572, 8223269310075117104L);
                                            if (!var1_1) continue;
                                        }
                                        v3 /* !! */  = (CallSite)(var4_2 /* !! */  = (CallSite)((y7.a(3367, 4293850060298045287L) - y7.a(14916, 8574333536194162731L)) / y7.a(31633, 5960069261681275334L) ^ y7.a(7378, 2951836561719383695L)));
                                    }
                                    if (!var1_1) continue;
                                }
                                var4_2 /* !! */  = (int)(hi.a("G", (int)(y7.a(31645, 1002848727017795971L) - y7.a(32552, 6950792022368662795L) + y7.a(3407, 3456955084774229807L) ^ y7.a(16094, 5799096292651398291L)), (int)y7.a(11320, 2140439005120816837L), (long)834203424483934088L) + y7.a(13633, 6577058042405748550L));
                                if (!var1_1) continue;
                            }
                            var4_2 /* !! */  = (y7.a(25117, 3904901216971958292L) - y7.a(27085, 5420375840917169056L)) / y7.a(4674, 8730658203808618538L) ^ y7.a(26853, 286347902091207324L);
                            if (!var1_1) continue;
lbl96:
                            // 2 sources

                            v2 = var4_2 /* !! */  = y7.a(24176, 5195449694895117423L) / 5 / 4 - y7.a(30353, 2703702258684771433L) ^ y7.a(27584, 7510700582030549499L);
lbl97:
                            // 2 sources

                            if (!var1_1) continue;
lbl98:
                            // 2 sources

                            var4_2 /* !! */  = hi.a("G", (int)(y7.a(15906, 6266385933420196958L) * y7.a(2477, 3293429513551889309L)), (int)y7.a(20328, 8236378113783203113L), (long)834203424483934088L) * y7.a(19357, 9114723070169121185L) ^ y7.a(31227, 8223801745948586997L);
                            if (!var1_1) continue;
                        }
                        v4 = var4_2 /* !! */  = y7.a(11547, 4558425137516210020L) ^ y7.a(16525, 264568371211963116L) ^ y7.a(27489, 70457821087998261L);
                    }
                    if (!var1_1) continue;
                }
                var4_2 /* !! */  = y7.a(6184, 1911826790879449714L) / 5 / 4 - y7.a(23971, 3479966050406143913L) ^ y7.a(10764, 1628865439251062898L);
            }
            var4_2 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)y7.a(14890, 4852260869757038594L), (int)y7.a(3395, 6591527761987716947L), (long)834203424483934088L), (int)y7.a(32251, 7316188721241372662L), (long)834203424483934088L) + y7.a(4678, 5050217015855438013L));
        }
        switch (var4_2 /* !! */ ) {
            default: {
                return v5;
            }
            case -1006243730: 
        }
        throw null;
    }

    public List<String> getUnsupportedOptions() {
        List list = super.getUnsupportedOptions();
        hi.a("\u00a5", (Object)list, (Object)y7.a(8283, -1563), (long)615358212536192384L);
        hi.a("\u00a5", (Object)list, (Object)y7.a(8284, -14685), (long)615358212536192384L);
        hi.a("\u00a5", (Object)list, (Object)y7.a(8281, -26740), (long)615358212536192384L);
        hi.a("\u00a5", (Object)list, (Object)y7.a(8272, 6681), (long)615358212536192384L);
        hi.a("\u00a5", (Object)list, (Object)y7.a(8274, -10651), (long)615358212536192384L);
        return list;
    }

    public synchronized void save(File file, Map<String, Object> map) {
    }

    public boolean cancelSwingInInventory() {
        return false;
    }

    public boolean isSimulatePlayerTick() {
        return false;
    }

    public boolean is1_13TeamColourFix() {
        return false;
    }

    public boolean isCheckForUpdates() {
        return false;
    }

    public boolean fix1_21PlacementRotation() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[12];
                        var11_1 = 0;
                        var10_2 = "HF8+\u00cd\u0080\u00a0\u00b0p|d/\u00a9\u00f5\u0016\u00ea\u00132\u0011\u000b\bd3\u00f3\u008e\u00b9\u00b9\u00a0\u001c\u00ef1\u000f\u00cbEO\u00e6\u0085\f\u0081\u00b4(\u0095\u00c9\u001f\"v\u00d8\u000f\u00a6\u00da\r\u00b1\u0085\u00e8\u00aa\u00c1D\u00ee6o\u00e1\u00f1Q\u0010\u00bf\u00ab\u00cf0\r\u00f58\u00e6\u00a7x\u00e3\u00d1\u00e5\u009d\u00e2\u009d\u001b\u00e2\u00df\u00cc\u00dc\u00c3\u0000\u00a7y\u00d1\u00d0\f\u00c0\u0018oXP\u00cb\u00ad\u001f\u00ac\u00e4a=\u00cc\u00cd\u00b5\u00e7\u001b\u00fa\u00b4\u00cf\u00b1\u00fb\u009c\u00a7\u00a9Q\u0010\u0080Y\u00ef\u00fe \u008f\u00e8\u0002\u00d7\u00b5\u00e0A\u0003\u00e4\nM\u0016\u0013\u00deC\u00ea\u008b\u0097\u0094\u00eb2\u0019,I%\f\u00b4\u00a2\u00c2\u00857\u00c3\u0015\u00f1\u0004\u00c2\u00fe\u00e4uN\u0088b\u00b2\u00134\u008a-AC\u0083\u0094\u001e\u00ba\u00db\u0019:\u00ec\u000e\u00faJ\u00afx\u00ea\u0015-.5\u009c\u00deE\u00a6\u0016\u00bb\u0011\u00ee|\u0085\t\u001e\u00c0";
                        var12_3 = "HF8+\u00cd\u0080\u00a0\u00b0p|d/\u00a9\u00f5\u0016\u00ea\u00132\u0011\u000b\bd3\u00f3\u008e\u00b9\u00b9\u00a0\u001c\u00ef1\u000f\u00cbEO\u00e6\u0085\f\u0081\u00b4(\u0095\u00c9\u001f\"v\u00d8\u000f\u00a6\u00da\r\u00b1\u0085\u00e8\u00aa\u00c1D\u00ee6o\u00e1\u00f1Q\u0010\u00bf\u00ab\u00cf0\r\u00f58\u00e6\u00a7x\u00e3\u00d1\u00e5\u009d\u00e2\u009d\u001b\u00e2\u00df\u00cc\u00dc\u00c3\u0000\u00a7y\u00d1\u00d0\f\u00c0\u0018oXP\u00cb\u00ad\u001f\u00ac\u00e4a=\u00cc\u00cd\u00b5\u00e7\u001b\u00fa\u00b4\u00cf\u00b1\u00fb\u009c\u00a7\u00a9Q\u0010\u0080Y\u00ef\u00fe \u008f\u00e8\u0002\u00d7\u00b5\u00e0A\u0003\u00e4\nM\u0016\u0013\u00deC\u00ea\u008b\u0097\u0094\u00eb2\u0019,I%\f\u00b4\u00a2\u00c2\u00857\u00c3\u0015\u00f1\u0004\u00c2\u00fe\u00e4uN\u0088b\u00b2\u00134\u008a-AC\u0083\u0094\u001e\u00ba\u00db\u0019:\u00ec\u000e\u00faJ\u00afx\u00ea\u0015-.5\u009c\u00deE\u00a6\u0016\u00bb\u0011\u00ee|\u0085\t\u001e\u00c0".length();
                        var9_4 = 19;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 33;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "?\\\u009b\u00b4\u00ae\u00d7\u0093\u0088.x#7\u00c8\u00a6\u001f\u001e44\u00afb\u0081\u0011_\u00b7\u0001\u0018\u0092q\u00c1\u00d9\u00ce\u009d\u00d3\u00cb\u00b9A\u00c6G\u00fab\u0012#\u00d5\u0091\u00e0\u0092W\u00d4!\u00a4";
                            var12_3 = "?\\\u009b\u00b4\u00ae\u00d7\u0093\u0088.x#7\u00c8\u00a6\u001f\u001e44\u00afb\u0081\u0011_\u00b7\u0001\u0018\u0092q\u00c1\u00d9\u00ce\u009d\u00d3\u00cb\u00b9A\u00c6G\u00fab\u0012#\u00d5\u0091\u00e0\u0092W\u00d4!\u00a4".length();
                            var9_4 = 25;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 80;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 49;
                                    break;
                                }
                                case 1: {
                                    v15 = 83;
                                    break;
                                }
                                case 2: {
                                    v15 = 97;
                                    break;
                                }
                                case 3: {
                                    v15 = 33;
                                    break;
                                }
                                case 4: {
                                    v15 = 109;
                                    break;
                                }
                                case 5: {
                                    v15 = 92;
                                    break;
                                }
                                default: {
                                    v15 = 85;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                y7.a = var13;
                y7.b = new String[12];
                var0_7 = 1379119373349642741L;
                var6_8 = new long[137];
                var3_9 = 0;
                var4_10 = "\u00f6\u00ac[~Q;\u00f6\u00cf\u00fcd\b\u001d;\u00fb\u0098\u00ac\u00ec\u009a\u00e2V\u008b\u0002\u00b9\u00ed\u00ac\u0003\u0019\u008f9\u00b0\u0000G>\u00a9j\u00ca\u00d0;\u00b7\u0003d\u0081\u00a7\u00d7\u00a9\u00a5\u00c2\u0006\u00bf\u00ab\"\u00a6 ]\u00c0\u001a\u00cbd\u0091\u00ab\u00f25\u00c4!e\u00e96\u0092\u00f8#\u00c5%\u0096\u0002:\u00db\u00a19\u0002\u0012\u00c0\u00c8\u0016l\u00d1\u0018\u00f9\u00b1|0\u00d4\u00fd\u0084#\u00cb\u00f3\u00a8\u00d9U\u00dfd\u00f8\u0016m}\u00e9\u00f4^\u00e0\u00d9\u00c0\u00d7\u0007t\u0013x\u0002\u0006Yx\u0082\u00f8\u0081\u00f3\u00a4\u001b\u00a96\u00a6m\u00f3\u00bfg\u00ac\u00ecZ\u00da\u0082\u00ae{\u00cf\u00b9\u00d2\u00a78K\u0014\u00e6B\u0001\u00b9\u00d2XRR\u00ce.9\u0005\u0005P\u00de\u00ebS\u00b6\u00e9Jd\u00bf\u00e2$f\u00a5\u0085\u00a2B\u00a0\u001b\u009e\u00e80\u00a9\u0088S=\u00be@\u00a2e\u00ed\u00f1\u00c9\u00b0\u00c9\u00ed~\u00f6>\u000b\u00df\u00ad\u00fa\u00f8\u00a9\u00cf\u00a9\u00dag\u00a84\u00f1\u00d5.R\u0085M\"v\u00ff\u00f2K*\u00a1?\u0010\u0006\nH\u00e6\u00a5\u00d03b\u001d!\\\u009f\u00ba(\u00c6^nFL\u00f1`\u00a3\u00cd\u008a\u00e8\u00fd1\u00a1|\u009b\u00a6\u00061 \u0013\u0094]d\u009b}.%\u000b\u0016\u00beB8R\u00d6\u00f9a\u00a0 \u001c\u0081gA\u00db\u0086<\u0015\u008eH\u00c1\u00f3\u00fb\u00b5Y\u00bf\u00bb\u0082\u00aa\u00fa\u00e8p=\u00a6cy\u00bd\u001cL+9{\f\u00d8o|p5\u00c3\u00a8tT\u0005\u0092\u009f\u00f6\u0015\u001c\u001a\u0084f\u00ab\u008c\u008d\u0003n\u00ee\u00cb\u0097a\u00cd\u00c9\u00b0\u000b-\u00c4\u00e2o)\u000f\u008d\u00e9\u00c8\u00e2\u0083;\b\u00b9\u0005;{\u0087\u0093\u00e6)\u00eb4a\u00d0>\u008eG\u0019\u0098\u00aa\u00e62[\u0012\u008fl_\u00c2\u001d\u0003\u00dc\u0099Nd\u00a8\u00e9\u00e3\u00fe\u00c7\u0097\u009987\u008c*\u0082\u0002&\u00e3\u00de\u00bf-{\u00b8g\u0089X\u0016\u001b\u00f8\u00b9s\u00dd\u00b9\u00924m1\u0085\u0090\u0082\u0095?\u00174\u00dd\u00d0\u00c1\u00cceun\u00d4\u00e3\u00a7\b\u00c48\u008cW\"YR\u00dbn \u00dc\u00037U\f\nj\u001f\t\u0088F\u00fe\u00a3\u00de\u00abt\u00bd7\u00f6=\u00f1\u00c0,M+\u00eb\u00c6\u00be\u00b9\u009fB\u00b2=\u00e3\u0015s\u00baS\u00d8\u00c0\u00aa\u0095\u00eb\u00d81\u00a9&NtAyF&i\\\u00f4f\u00cdn%V\u00fc\u0018\u008f\\\u0007\u00e2\u008c\u00bd\u00c2r\u00d5\u00f2A\u009e\u00bb\u0003\u00f6\u008a\u0014bF\u0014\u00ceg(cC\u0099\u0099/\u001b?\u0002\u00a4,\u008f\u0015\u0083\u00d6\u00f3\u00e2S[\u00efM\u00e4\u0016\u001cV\u00ba\u001d9B\u000f\u00d5p\u00d6a\u00ef\u00d5\u0097\u00bds\u00b8\u00d90J\u00ae\u0090\u0091Q.:\u00ac1\u0095\u00ca\u00bd(y(\u009c$\u00abu\u00b5\u00e4\u00c0g\u00bb[\u00dcxq\u0080\u008d\u009d\u009c9n,bUdfa\u00d6E\u00db\u00d0\u001a\u00da\u00a2\u00a3\u00c3cMK\u000eQR\u008a\u00b6\u00cc\u00a1\u00c5\u0097\u00b8\u00022:\u00b8\u0086}\u0082X\u008b\u0000\u0002\u00eb\u00eaoK\u00138\u00a8\u00fcgI\u00f0o[\u0019\u001cv\u00ea\u001czv\n\u00a1/t\u0018H\u000f\u00fb\u00cc\u00f0\u0080\u00b1k\u00e6\u0016\u00f7j\u0084\u0099x\u000e\u00bb>CP\u0099\u00ba\u00ddj\u00d1N\u00a5\u00a5\u00a6\u00af\u00c6\u00aa\u00bf\u0013\u00bdS\u009aa\u00e9\u008ae{uD\n\u00a6\u00a0?\u00d2\u0002\u0002Y\u001a\u008a\u00c5&\u00dfX.\u0089\u0005\u00eb6+r\u001dl\u00e9\u00aaD\u00e3L\u009bp\u0082\u0015A\b\u0006\u00be\u00b5Y_\u00f4\u00dc&F\u00f6Fw\u00e3\u009f_\u00d1\u00aei\t\u0094\u00b2\u009c\u0083\rpV\u00b0\u00ce\u00c8(\u00d75\u00eaj\u0016\u00e6\be\u00dc]\u00e7\u000f\u00fb<?\u00cd\u00f1\u00b3p\u00c0R\u0092i\u00c6\u00cc\u00e5\u009cv\u0017HZ\u008e\"\u0086\u00adC\u00e6NN\u00adb\u00dbF\u00ad\u001e\"\u00e4\u0015\u00c8\u00f9\u0097n\u0087\u0098\u00da\u0092\u00f1i\u00fe\n=\u00b7+\u00e7:\u0082_\u00e9\u0088\u00a0\u00a4u\u00bb\u00eb\u00dd\u00ae\u00ac?\u00ae\u00dd\u00c5\u00da\u00c3\u00e8\u00d4\u00a4EM\u00a2\u001c\u00bc\u00aaa\u00e2\u00e5\u00b8\u00a6$\u00a8\u00a5O\u00fa)/\u00a9\u00b7\u0001t\u00d9\u008bG\u00ec\u00df\u00bf\u0083p\u0098\u0001\u00de\u0006\u0090\"}y\u00fb\u009e$\u008fR\u00f6^\u000e\r\u001b\u0086\u0085\u00fdj\u00f3Xjo\u00b7\u00b1\u00af_\u0081\u00c1\u00e5\u00f5\u00c4\u00b5\u00c5\u0091\u00b3>\u0007K\u000b\u00c7\u00daW\u00cah}\u00f3[\u00c2\u0013~\u00f05\u00f5\u0015UP\u00c1V\u00c8\u008f\t\u00d44\u00a7j\u0001\u0080\u00bd\u00f3yg\u00ff\u0085\u009b\u00e6e\u00ff3+\u00fd\u001d\u0080\u00cb\u0082\u00db\u0019u\u008b\u00e6\u00a6\u00a2\u008f\u00ac\u0012\u009d\u00e5W|\u00c1e\u00ca[.\u00ecR\u00e2J\n\u0085K\u00f6\u001c\u00de\u001b\u00ec\u00a1\u00f1*j\u00f9\u00c63\u00b7\u0001\u0017\u00e5\u0004]e\u00dd\u00a2\u00ec\u00c5\u00cbCM\u00de\u00ca\u008f\u0002\u00c6\u001e\u0095\u00b5\u00bb\u00e2\u0018\u00fa\t'-\u00bfTq\u0097\u0003neU\u00c3&\u00d3\u001c\u00e0\u00eb\u00c3)\n\r3?\u0011\u00bb`\u00d3\u0000\u000e\u00e2";
                var5_11 = "\u00f6\u00ac[~Q;\u00f6\u00cf\u00fcd\b\u001d;\u00fb\u0098\u00ac\u00ec\u009a\u00e2V\u008b\u0002\u00b9\u00ed\u00ac\u0003\u0019\u008f9\u00b0\u0000G>\u00a9j\u00ca\u00d0;\u00b7\u0003d\u0081\u00a7\u00d7\u00a9\u00a5\u00c2\u0006\u00bf\u00ab\"\u00a6 ]\u00c0\u001a\u00cbd\u0091\u00ab\u00f25\u00c4!e\u00e96\u0092\u00f8#\u00c5%\u0096\u0002:\u00db\u00a19\u0002\u0012\u00c0\u00c8\u0016l\u00d1\u0018\u00f9\u00b1|0\u00d4\u00fd\u0084#\u00cb\u00f3\u00a8\u00d9U\u00dfd\u00f8\u0016m}\u00e9\u00f4^\u00e0\u00d9\u00c0\u00d7\u0007t\u0013x\u0002\u0006Yx\u0082\u00f8\u0081\u00f3\u00a4\u001b\u00a96\u00a6m\u00f3\u00bfg\u00ac\u00ecZ\u00da\u0082\u00ae{\u00cf\u00b9\u00d2\u00a78K\u0014\u00e6B\u0001\u00b9\u00d2XRR\u00ce.9\u0005\u0005P\u00de\u00ebS\u00b6\u00e9Jd\u00bf\u00e2$f\u00a5\u0085\u00a2B\u00a0\u001b\u009e\u00e80\u00a9\u0088S=\u00be@\u00a2e\u00ed\u00f1\u00c9\u00b0\u00c9\u00ed~\u00f6>\u000b\u00df\u00ad\u00fa\u00f8\u00a9\u00cf\u00a9\u00dag\u00a84\u00f1\u00d5.R\u0085M\"v\u00ff\u00f2K*\u00a1?\u0010\u0006\nH\u00e6\u00a5\u00d03b\u001d!\\\u009f\u00ba(\u00c6^nFL\u00f1`\u00a3\u00cd\u008a\u00e8\u00fd1\u00a1|\u009b\u00a6\u00061 \u0013\u0094]d\u009b}.%\u000b\u0016\u00beB8R\u00d6\u00f9a\u00a0 \u001c\u0081gA\u00db\u0086<\u0015\u008eH\u00c1\u00f3\u00fb\u00b5Y\u00bf\u00bb\u0082\u00aa\u00fa\u00e8p=\u00a6cy\u00bd\u001cL+9{\f\u00d8o|p5\u00c3\u00a8tT\u0005\u0092\u009f\u00f6\u0015\u001c\u001a\u0084f\u00ab\u008c\u008d\u0003n\u00ee\u00cb\u0097a\u00cd\u00c9\u00b0\u000b-\u00c4\u00e2o)\u000f\u008d\u00e9\u00c8\u00e2\u0083;\b\u00b9\u0005;{\u0087\u0093\u00e6)\u00eb4a\u00d0>\u008eG\u0019\u0098\u00aa\u00e62[\u0012\u008fl_\u00c2\u001d\u0003\u00dc\u0099Nd\u00a8\u00e9\u00e3\u00fe\u00c7\u0097\u009987\u008c*\u0082\u0002&\u00e3\u00de\u00bf-{\u00b8g\u0089X\u0016\u001b\u00f8\u00b9s\u00dd\u00b9\u00924m1\u0085\u0090\u0082\u0095?\u00174\u00dd\u00d0\u00c1\u00cceun\u00d4\u00e3\u00a7\b\u00c48\u008cW\"YR\u00dbn \u00dc\u00037U\f\nj\u001f\t\u0088F\u00fe\u00a3\u00de\u00abt\u00bd7\u00f6=\u00f1\u00c0,M+\u00eb\u00c6\u00be\u00b9\u009fB\u00b2=\u00e3\u0015s\u00baS\u00d8\u00c0\u00aa\u0095\u00eb\u00d81\u00a9&NtAyF&i\\\u00f4f\u00cdn%V\u00fc\u0018\u008f\\\u0007\u00e2\u008c\u00bd\u00c2r\u00d5\u00f2A\u009e\u00bb\u0003\u00f6\u008a\u0014bF\u0014\u00ceg(cC\u0099\u0099/\u001b?\u0002\u00a4,\u008f\u0015\u0083\u00d6\u00f3\u00e2S[\u00efM\u00e4\u0016\u001cV\u00ba\u001d9B\u000f\u00d5p\u00d6a\u00ef\u00d5\u0097\u00bds\u00b8\u00d90J\u00ae\u0090\u0091Q.:\u00ac1\u0095\u00ca\u00bd(y(\u009c$\u00abu\u00b5\u00e4\u00c0g\u00bb[\u00dcxq\u0080\u008d\u009d\u009c9n,bUdfa\u00d6E\u00db\u00d0\u001a\u00da\u00a2\u00a3\u00c3cMK\u000eQR\u008a\u00b6\u00cc\u00a1\u00c5\u0097\u00b8\u00022:\u00b8\u0086}\u0082X\u008b\u0000\u0002\u00eb\u00eaoK\u00138\u00a8\u00fcgI\u00f0o[\u0019\u001cv\u00ea\u001czv\n\u00a1/t\u0018H\u000f\u00fb\u00cc\u00f0\u0080\u00b1k\u00e6\u0016\u00f7j\u0084\u0099x\u000e\u00bb>CP\u0099\u00ba\u00ddj\u00d1N\u00a5\u00a5\u00a6\u00af\u00c6\u00aa\u00bf\u0013\u00bdS\u009aa\u00e9\u008ae{uD\n\u00a6\u00a0?\u00d2\u0002\u0002Y\u001a\u008a\u00c5&\u00dfX.\u0089\u0005\u00eb6+r\u001dl\u00e9\u00aaD\u00e3L\u009bp\u0082\u0015A\b\u0006\u00be\u00b5Y_\u00f4\u00dc&F\u00f6Fw\u00e3\u009f_\u00d1\u00aei\t\u0094\u00b2\u009c\u0083\rpV\u00b0\u00ce\u00c8(\u00d75\u00eaj\u0016\u00e6\be\u00dc]\u00e7\u000f\u00fb<?\u00cd\u00f1\u00b3p\u00c0R\u0092i\u00c6\u00cc\u00e5\u009cv\u0017HZ\u008e\"\u0086\u00adC\u00e6NN\u00adb\u00dbF\u00ad\u001e\"\u00e4\u0015\u00c8\u00f9\u0097n\u0087\u0098\u00da\u0092\u00f1i\u00fe\n=\u00b7+\u00e7:\u0082_\u00e9\u0088\u00a0\u00a4u\u00bb\u00eb\u00dd\u00ae\u00ac?\u00ae\u00dd\u00c5\u00da\u00c3\u00e8\u00d4\u00a4EM\u00a2\u001c\u00bc\u00aaa\u00e2\u00e5\u00b8\u00a6$\u00a8\u00a5O\u00fa)/\u00a9\u00b7\u0001t\u00d9\u008bG\u00ec\u00df\u00bf\u0083p\u0098\u0001\u00de\u0006\u0090\"}y\u00fb\u009e$\u008fR\u00f6^\u000e\r\u001b\u0086\u0085\u00fdj\u00f3Xjo\u00b7\u00b1\u00af_\u0081\u00c1\u00e5\u00f5\u00c4\u00b5\u00c5\u0091\u00b3>\u0007K\u000b\u00c7\u00daW\u00cah}\u00f3[\u00c2\u0013~\u00f05\u00f5\u0015UP\u00c1V\u00c8\u008f\t\u00d44\u00a7j\u0001\u0080\u00bd\u00f3yg\u00ff\u0085\u009b\u00e6e\u00ff3+\u00fd\u001d\u0080\u00cb\u0082\u00db\u0019u\u008b\u00e6\u00a6\u00a2\u008f\u00ac\u0012\u009d\u00e5W|\u00c1e\u00ca[.\u00ecR\u00e2J\n\u0085K\u00f6\u001c\u00de\u001b\u00ec\u00a1\u00f1*j\u00f9\u00c63\u00b7\u0001\u0017\u00e5\u0004]e\u00dd\u00a2\u00ec\u00c5\u00cbCM\u00de\u00ca\u008f\u0002\u00c6\u001e\u0095\u00b5\u00bb\u00e2\u0018\u00fa\t'-\u00bfTq\u0097\u0003neU\u00c3&\u00d3\u001c\u00e0\u00eb\u00c3)\n\r3?\u0011\u00bb`\u00d3\u0000\u000e\u00e2".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "#\u00a3\u009aI\u00ac\" \u0002\u000bE-<\u00eb\u0096] ";
                    var5_11 = "#\u00a3\u009aI\u00ac\" \u0002\u000bE-<\u00eb\u0096] ".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        y7.c = var6_8;
        y7.d = new Integer[137];
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x205A) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 58;
                case 1 -> 127;
                case 2 -> 90;
                case 3 -> 103;
                case 4 -> 223;
                case 5 -> 19;
                case 6 -> 206;
                case 7 -> 157;
                case 8 -> 200;
                case 9 -> 114;
                case 10 -> 82;
                case 11 -> 158;
                case 12 -> 191;
                case 13 -> 32;
                case 14 -> 184;
                case 15 -> 54;
                case 16 -> 100;
                case 17 -> 193;
                case 18 -> 87;
                case 19 -> 12;
                case 20 -> 83;
                case 21 -> 11;
                case 22 -> 67;
                case 23 -> 144;
                case 24 -> 122;
                case 25 -> 24;
                case 26 -> 29;
                case 27 -> 117;
                case 28 -> 240;
                case 29 -> 69;
                case 30 -> 28;
                case 31 -> 175;
                case 32 -> 52;
                case 33 -> 49;
                case 34 -> 161;
                case 35 -> 99;
                case 36 -> 211;
                case 37 -> 26;
                case 38 -> 199;
                case 39 -> 59;
                case 40 -> 236;
                case 41 -> 142;
                case 42 -> 76;
                case 43 -> 162;
                case 44 -> 227;
                case 45 -> 185;
                case 46 -> 136;
                case 47 -> 98;
                case 48 -> 143;
                case 49 -> 134;
                case 50 -> 78;
                case 51 -> 106;
                case 52 -> 205;
                case 53 -> 47;
                case 54 -> 148;
                case 55 -> 124;
                case 56 -> 215;
                case 57 -> 101;
                case 58 -> 120;
                case 59 -> 174;
                case 60 -> 27;
                case 61 -> 3;
                case 62 -> 173;
                case 63 -> 135;
                case 64 -> 110;
                case 65 -> 57;
                case 66 -> 70;
                case 67 -> 246;
                case 68 -> 126;
                case 69 -> 248;
                case 70 -> 231;
                case 71 -> 25;
                case 72 -> 207;
                case 73 -> 180;
                case 74 -> 139;
                case 75 -> 15;
                case 76 -> 8;
                case 77 -> 179;
                case 78 -> 121;
                case 79 -> 235;
                case 80 -> 40;
                case 81 -> 188;
                case 82 -> 56;
                case 83 -> 189;
                case 84 -> 74;
                case 85 -> 80;
                case 86 -> 118;
                case 87 -> 45;
                case 88 -> 31;
                case 89 -> 218;
                case 90 -> 88;
                case 91 -> 9;
                case 92 -> 196;
                case 93 -> 221;
                case 94 -> 220;
                case 95 -> 171;
                case 96 -> 198;
                case 97 -> 44;
                case 98 -> 172;
                case 99 -> 116;
                case 100 -> 169;
                case 101 -> 141;
                case 102 -> 63;
                case 103 -> 96;
                case 104 -> 216;
                case 105 -> 95;
                case 106 -> 234;
                case 107 -> 0;
                case 108 -> 242;
                case 109 -> 147;
                case 110 -> 65;
                case 111 -> 137;
                case 112 -> 251;
                case 113 -> 163;
                case 114 -> 30;
                case 115 -> 217;
                case 116 -> 17;
                case 117 -> 108;
                case 118 -> 250;
                case 119 -> 160;
                case 120 -> 165;
                case 121 -> 38;
                case 122 -> 53;
                case 123 -> 105;
                case 124 -> 10;
                case 125 -> 4;
                case 126 -> 113;
                case 127 -> 214;
                case 128 -> 131;
                case 129 -> 245;
                case 130 -> 84;
                case 131 -> 112;
                case 132 -> 5;
                case 133 -> 51;
                case 134 -> 72;
                case 135 -> 178;
                case 136 -> 21;
                case 137 -> 60;
                case 138 -> 153;
                case 139 -> 181;
                case 140 -> 64;
                case 141 -> 237;
                case 142 -> 94;
                case 143 -> 203;
                case 144 -> 210;
                case 145 -> 145;
                case 146 -> 79;
                case 147 -> 164;
                case 148 -> 241;
                case 149 -> 34;
                case 150 -> 159;
                case 151 -> 156;
                case 152 -> 219;
                case 153 -> 130;
                case 154 -> 41;
                case 155 -> 86;
                case 156 -> 7;
                case 157 -> 225;
                case 158 -> 37;
                case 159 -> 213;
                case 160 -> 166;
                case 161 -> 42;
                case 162 -> 182;
                case 163 -> 149;
                case 164 -> 154;
                case 165 -> 140;
                case 166 -> 243;
                case 167 -> 129;
                case 168 -> 43;
                case 169 -> 102;
                case 170 -> 115;
                case 171 -> 39;
                case 172 -> 183;
                case 173 -> 2;
                case 174 -> 138;
                case 175 -> 186;
                case 176 -> 204;
                case 177 -> 177;
                case 178 -> 68;
                case 179 -> 85;
                case 180 -> 254;
                case 181 -> 128;
                case 182 -> 202;
                case 183 -> 91;
                case 184 -> 104;
                case 185 -> 89;
                case 186 -> 232;
                case 187 -> 244;
                case 188 -> 1;
                case 189 -> 50;
                case 190 -> 13;
                case 191 -> 150;
                case 192 -> 33;
                case 193 -> 22;
                case 194 -> 36;
                case 195 -> 239;
                case 196 -> 233;
                case 197 -> 195;
                case 198 -> 247;
                case 199 -> 18;
                case 200 -> 192;
                case 201 -> 119;
                case 202 -> 93;
                case 203 -> 226;
                case 204 -> 61;
                case 205 -> 107;
                case 206 -> 190;
                case 207 -> 35;
                case 208 -> 125;
                case 209 -> 66;
                case 210 -> 197;
                case 211 -> 152;
                case 212 -> 92;
                case 213 -> 62;
                case 214 -> 238;
                case 215 -> 252;
                case 216 -> 208;
                case 217 -> 46;
                case 218 -> 170;
                case 219 -> 20;
                case 220 -> 111;
                case 221 -> 109;
                case 222 -> 133;
                case 223 -> 229;
                case 224 -> 97;
                case 225 -> 209;
                case 226 -> 212;
                case 227 -> 222;
                case 228 -> 224;
                case 229 -> 16;
                case 230 -> 71;
                case 231 -> 168;
                case 232 -> 155;
                case 233 -> 151;
                case 234 -> 23;
                case 235 -> 194;
                case 236 -> 187;
                case 237 -> 123;
                case 238 -> 167;
                case 239 -> 14;
                case 240 -> 55;
                case 241 -> 176;
                case 242 -> 249;
                case 243 -> 228;
                case 244 -> 253;
                case 245 -> 75;
                case 246 -> 6;
                case 247 -> 146;
                case 248 -> 255;
                case 249 -> 201;
                case 250 -> 48;
                case 251 -> 81;
                case 252 -> 77;
                case 253 -> 132;
                case 254 -> 230;
                default -> 73;
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
            y7.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4A7A;
        if (d[n2] == null) {
            y7.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
