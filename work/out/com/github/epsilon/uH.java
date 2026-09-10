/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.components.ChatComponent
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.chat.MutableComponent
 *  net.minecraft.network.chat.Style
 *  net.minecraft.util.FormattedCharSequence
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.i8;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;

public class uH {
    private static final double m = 0.55;
    public static final String r;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static void A(Object[] objectArray) {
        Component component = (Component)objectArray[0];
        int n = (Integer)objectArray[1];
        uH.k("c3Iblfq2CP4Xw3fL", H(boolean net.minecraft.network.chat.Component int ), (boolean)true, (Component)component, (int)n);
    }

    public static void n(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        String string = (String)objectArray[1];
        int n = (Integer)objectArray[2];
        hi.a("G", (boolean)bl, (Object)hi.a("G", string, (long)1262634304799069784L), (int)n, (long)793748097040888169L);
    }

    public static void h(String string) {
        hi.a("G", (boolean)true, (Object)hi.a("G", string, (long)1262634304799069784L), (long)756900023154280079L);
    }

    public static void E(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        hi.a("G", (boolean)true, (Object)hi.a("G", string, (long)1262634304799069784L), (int)n, (long)793748097040888169L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void H(boolean var0, Component var1_1, int var2_2) {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            var3_3 = Dl.t();
                            var5_4 /* !! */  = hi.a("G", (int)(uH.a(27262, 3324319595323870526L) - uH.a(27603, 8309757928859585729L)), (int)uH.a(1489, 8159927338410582660L), (long)834203424483934088L) ^ uH.a(23309, 2365388298799021078L);
                            if (var3_3) break block15;
                            v0 = var5_4 /* !! */ ;
                            if (var3_3) break block16;
                            switch (v0 ? 1 : 0) {
                                case 1956053615: {
                                    hi.a("G", (long)916259186308446368L);
                                    hi.a("G", (long)459480616877844027L);
                                    break;
                                }
                            }
                        }
                        v0 = var0;
                    }
                    var4_5 = hi.a("G", (boolean)v0, (Object)var1_1, (long)725559251734464927L);
                    v1 /* !! */  = uH.k("c3Iblfq2CP4Xw3fL", isSameThread(), (Minecraft)hi.a("j", (long)1080602109828736465L));
                    if (var3_3) break block17;
                    if (v1 /* !! */  != false) break block18;
                    var5_4 /* !! */  = (int)((CallSite)(uH.a(4250, 5915687057638438786L) ^ uH.a(5018, 1007566338912924836L) ^ uH.a(29026, 4660239228271908402L)));
                    v1 /* !! */  = (CallSite)var5_4 /* !! */ ;
                }
                if (!var3_3) break block19;
            }
            var5_4 /* !! */  = uH.a(26432, 4264643090856689781L) * uH.a(28136, 3065114633662712556L) * uH.a(32348, 1419396393927563638L) - uH.a(26647, 7082749365937819504L);
            if (!var3_3) break block19;
            ** GOTO lbl48
lbl28:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (Object)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$addChatMessage$1(net.minecraft.network.chat.Component int ), ()V)((Component)var4_5, (int)var2_2), (long)795757481256886430L);
                if (var3_3) {
                    return;
                }
                ** GOTO lbl50
                break;
            }
        }
        block9: while (true) {
            switch (var5_4 /* !! */  ? 1 : 0) {
                default: {
                    hi.a("\u00a5", (Object)((i8)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)907159218940561824L), (long)681271407627774029L), (long)377126036033704318L)), (Object)var4_5, (int)var2_2, (long)524119468143506568L);
                    if (!var3_3) ** GOTO lbl48
                    ** GOTO lbl28
                }
                case 323059305: {
                    ** continue;
                }
                case 323059304: {
                    hi.a("G", (int)uH.a(28844, 7648503358413035421L), (int)5, (long)589346929323904906L);
                    hi.a("G", (long)703609663147646272L);
                    return;
                }
lbl48:
                // 2 sources

                var5_4 /* !! */  = uH.a(6923, 1640282392827313231L) / 4 - uH.a(31348, 4655482207939190109L) + uH.a(2125, 3344167857365135201L) ^ uH.a(11071, 4205137393976937524L);
                if (!var3_3) continue block9;
lbl50:
                // 2 sources

                var5_4 /* !! */  = uH.a(152, 5302296891436738483L) / 4 - uH.a(29886, 7955752890914853764L) + uH.a(1940, 258006029431251091L) ^ uH.a(5291, 8613457318311343082L);
                continue block9;
                case 323059303: 
            }
            break;
        }
    }

    public static void L(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        String string = (String)objectArray[1];
        uH.k("c3Iblfq2CP4Xw3fL", z(boolean net.minecraft.network.chat.Component ), (boolean)bl, (Component)hi.a("G", string, (long)1262634304799069784L));
    }

    private static void lambda$addChatMessage$1(Component component, int n) {
        hi.a("\u00a5", (Object)((i8)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)907159218940561824L), (long)681271407627774029L), (long)377126036033704318L))), (Object)component, (int)n, (long)524119468143506568L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static void z(boolean bl, Component component) {
        CallSite callSite;
        int n = uH.a(30566, 7206155880467615826L) * uH.a(3210, 7089791121541901269L) - uH.a(21310, 8274493501111104552L);
        switch (n) {
            default: {
                callSite = uH.k("c3Iblfq2CP4Xw3fL", x(boolean net.minecraft.network.chat.Component ), (boolean)bl, (Component)component);
                n = hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)888498356480924575L) != false ? hi.a("G", (int)((uH.a(23887, 1002845786306017819L) - uH.a(6546, 9043714653097344664L)) * uH.a(15762, 4149251660305046217L)), (int)uH.a(31998, 4194624220758170595L), (long)834203424483934088L) ^ uH.a(28313, 7704817172525730231L) ^ uH.a(15386, 1539084667147295514L) : uH.a(1443, 2653023873095541482L) * uH.a(5170, 8594254217480778603L) + uH.a(11029, 1229745956705111080L) + uH.a(13598, 316086112938332703L) ^ uH.a(31059, 825547873620549235L);
            }
            case -96101707: {
                throw null;
            }
        }
        block8: while (true) {
            switch (n) {
                default: {
                    hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)907159218940561824L), (long)681271407627774029L), (long)377126036033704318L), (Object)callSite, (long)427022843302302280L);
                    n = uH.a(19997, 1128889369439955227L) / uH.a(3932, 9060403391413233744L) / 4 + uH.a(7673, 3604804721893423795L);
                    continue block8;
                }
                case -1523748358: {
                    hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), () -> uH.lambda$addChatMessage$0((Component)callSite), (long)795757481256886430L);
                    n = uH.a(31043, 5716266684955876974L) / uH.a(28906, 5705607628703225767L) / 4 + uH.a(9805, 7404563564736217431L);
                    continue block8;
                }
                case -1523748360: {
                    return;
                }
                case -1523748359: 
            }
            break;
        }
        throw null;
    }

    private static String d(Object[] objectArray) {
        Object object = objectArray[0];
        StringBuilder stringBuilder = new StringBuilder();
        hi.a("\u00a5", (Object)((FormattedCharSequence)object), (arg_0, arg_1, arg_2) -> uH.lambda$toPlainString$0(stringBuilder, arg_0, arg_1, arg_2), (long)1158366190198570135L);
        return hi.a("\u00a5", (Object)stringBuilder, (long)1264577378468501174L);
    }

    private static boolean lambda$appendStyledSuffix$0(int[] nArray, int n, MutableComponent mutableComponent, int n2, Style style, int n3) {
        boolean bl = Dl.t();
        int n4 = nArray[0];
        int n5 = n4;
        nArray[0] = n4 + 1;
        if (!bl) {
            if (n5 >= n) {
                hi.a("\u00a5", (Object)mutableComponent, (Object)hi.a("\u00a5", (Object)hi.a("G", new String((char[])hi.a("G", (int)n3, (long)1179352197199142661L)), (long)1262634304799069784L), (Object)style, (long)1183389538035419169L), (long)1224058718624515155L);
            }
            n5 = 1;
        }
        return n5 != 0;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static Component x(boolean var0, Component var1_1) {
        var2_2 = Dl.S();
        var4_3 = (uH.a(11463, 7087853352755989493L) ^ uH.a(28782, 2788946513216821044L)) / 2 - uH.a(7691, 6063648612222449967L);
        if (!var2_2) ** GOTO lbl-1000
        switch (var4_3) {
            default: lbl-1000:
            // 2 sources

            {
                var3_4 = hi.a("G", (long)1322076422542474619L);
                v0 = var0;
                if (!var2_2) ** GOTO lbl29
                if (v0 == 0) ** GOTO lbl28
                if (true) ** GOTO lbl30
            }
            case 1397060510: {
                throw null;
            }
        }
        block7: while (true) {
            switch (var4_3) {
                default: {
                    hi.a("\u00a5", (Object)var3_4, (Object)uH.k("c3Iblfq2CP4Xw3fL", literal(java.lang.String ), (String)uH.a(29345, 11022)), (long)1224058718624515155L);
                    if (!var2_2) {
                        return uH.k("c3Iblfq2CP4Xw3fL", append(net.minecraft.network.chat.Component ), (MutableComponent)var3_4, (Component)var1_1);
                    }
                    ** GOTO lbl32
                }
                case -112700039: {
                    uH.k("c3Iblfq2CP4Xw3fL", values());
                    var4_3 = uH.a(1269, 2903536777161057271L) / 5 / uH.a(615, 1158427138485429584L) * uH.a(31583, 786808369785330814L) + uH.a(8783, 2625439049396323708L) - uH.a(13704, 6743521147830801024L);
                    if (var2_2) continue block7;
lbl28:
                    // 2 sources

                    v0 = var4_3 = uH.a(31326, 5403597314890456341L) * uH.a(32078, 7378870265831021072L) - uH.a(9667, 4922298668018401957L) - uH.a(31335, 5303953778358115642L);
lbl29:
                    // 2 sources

                    if (var2_2) continue block7;
lbl30:
                    // 2 sources

                    var4_3 = uH.k("c3Iblfq2CP4Xw3fL", max(int int ), (int)uH.a(13921, 1652106461447557447L), (int)uH.a(11254, 1865662507733257396L)) ^ uH.a(30601, 4160930569794605209L);
                    if (var2_2) continue block7;
lbl32:
                    // 2 sources

                    var4_3 = uH.a(26788, 8637472030593306610L) * uH.a(25125, 7519580186377110883L) - uH.a(8767, 6920395030174172454L) - uH.a(22648, 3487735243202920311L);
                    continue block7;
                }
                case -112700038: 
            }
            break;
        }
        return uH.k("c3Iblfq2CP4Xw3fL", append(net.minecraft.network.chat.Component ), (MutableComponent)var3_4, (Component)var1_1);
    }

    private static void l(Object object, Object object2, int n) {
        int[] nArray = new int[]{0};
        hi.a("\u00a5", (Object)((FormattedCharSequence)object2), (arg_0, arg_1, arg_2) -> uH.lambda$appendStyledSuffix$0(nArray, n, (MutableComponent)object, arg_0, arg_1, arg_2), (long)1158366190198570135L);
    }

    public static void D(Component component) {
        hi.a("G", (boolean)true, (Object)component, (long)756900023154280079L);
    }

    public static /* bridge */ /* synthetic */ CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static FormattedCharSequence a(Object[] var0) {
        block25: {
            block30: {
                block29: {
                    block24: {
                        block23: {
                            var1_1 = (FormattedCharSequence)var0[0];
                            var2_2 = Dl.t();
                            var13_3 /* !! */  = (hi.a("G", (int)uH.a(5094, 1725625056497218746L), (int)uH.a(17030, 938583176909186517L), (long)834203424483934088L) + uH.a(16885, 4354088160805217981L) ^ uH.a(9522, 346065109625405968L)) - uH.a(17804, 7757096643602375344L);
                            if (!var2_2) ** GOTO lbl16
                            block14: while (true) {
                                block28: {
                                    block27: {
                                        block26: {
                                            v0 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)1304610435635038960L), (long)789438897355831922L)), (long)1000026253634408124L);
                                            if (var2_2) break block26;
                                            if (v0 == false) break block27;
                                            v0 = hi.a("G", (int)(uH.a(10289, 5463969628025818898L) - uH.a(19575, 3952676966334655280L)), (int)uH.a(938, 1384901701026292892L), (long)834203424483934088L) * uH.a(6876, 2718781917326720505L) - uH.a(29995, 2634682765857018428L);
                                        }
                                        var13_3 /* !! */  = (int)v0;
                                        if (!var2_2) break block28;
                                    }
                                    var13_3 /* !! */  = uH.a(24463, 3798952645198018755L) * uH.a(24658, 3269820636584953667L) * uH.a(17457, 2192028101275149070L) / uH.a(14381, 8559193626493460303L) / uH.a(27860, 245299343054752715L) + uH.a(27652, 6443088049522559807L);
                                }
                                switch (var13_3 /* !! */ ) {
                                    default: {
                                        continue block14;
                                    }
                                    case 880556915: {
                                        return var1_1;
                                    }
                                    case 880556913: {
                                        var3_4 = hi.a("G", (Object)new Object[]{var1_1}, (long)578329709835669300L);
                                        v1 /* !! */  = hi.a("\u00a5", (Object)var3_4, (Object)uH.a(29344, 19642), (long)543003574592908858L);
                                        if (var2_2) break block23;
                                        if (v1 /* !! */  != false) break block14;
                                        break block24;
                                    }
                                    case 880556916: {
                                        break block25;
                                    }
                                }
                                break;
                            }
                            v1 /* !! */  = (CallSite)(hi.a("G", (int)uH.a(32201, 4620877509761391325L), (int)uH.a(19794, 754135322993584640L), (long)834203424483934088L) + uH.a(5478, 9123164856808190581L) ^ uH.a(27750, 4622144777263041391L));
                        }
                        var13_3 /* !! */  = (int)v1 /* !! */ ;
                        if (!var2_2) break block29;
                    }
                    var13_3 /* !! */  = (uH.a(4124, 5439294473523443492L) - uH.a(22136, 1421646977278439797L) ^ uH.a(3420, 3946734371221842521L)) / 3 - uH.a(25592, 7006766087973782728L);
                }
                switch (var13_3 /* !! */ ) {
                    default: {
                        return var1_1;
                    }
                    case -473932664: {
                        var4_5 = hi.a("G", (long)1322076422542474619L);
                        var5_6 = (double)hi.a("G", (long)658960450018995719L) / 180.0 * hi.a("\u00a5", (Object)((Double)uH.k("c3Iblfq2CP4Xw3fL", z(), (DM)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)1053299314495572139L))), (long)637262500311742568L);
                        var7_7 = 0;
                        var8_8 = 0;
                        if (!var2_2) break;
                        break block30;
                    }
                    case -473932663: {
                        throw null;
                    }
                }
                var13_3 /* !! */  = (hi.a("G", (int)(uH.a(20558, 5392932890576090923L) / 2), (int)uH.a(11791, 5091853567928699243L), (long)834203424483934088L) - uH.a(30162, 8187632699383829125L)) * uH.a(12625, 4253786437769500281L) ^ uH.a(14190, 1523258459581124653L);
                if (!var2_2) ** GOTO lbl66
                ** GOTO lbl59
            }
            block15: while (true) {
                block33: {
                    block32: {
                        block31: {
                            v2 = var8_8;
                            v3 /* !! */  = hi.a("\u00a5", uH.a(29344, 19642), (long)1118066305939579746L);
                            if (var2_2) break block31;
                            if (v2 < v3 /* !! */ ) break block32;
lbl59:
                            // 2 sources

                            v2 = (uH.a(24329, 8280264601902118922L) + uH.a(5834, 3874404610310320598L)) / uH.a(10691, 8069496706630422221L);
                            v3 /* !! */  = (CallSite)uH.a(3007, 568741314314022032L);
                        }
                        var13_3 /* !! */  = v2 ^ v3 /* !! */ ;
                        if (!var2_2) break block33;
                    }
                    var13_3 /* !! */  = uH.a(10199, 8703161105442439321L) * uH.a(16655, 8602666842693428810L) - uH.a(30049, 4884612772362277424L);
                }
                while (true) {
                    block34: {
                        switch (var13_3 /* !! */ ) {
                            default: {
                                continue block15;
                            }
                            case 1151829773: {
                                var9_9 = hi.a("\u00a5", uH.a(29344, 19642), (int)var8_8, (long)494422114701607773L);
                                var10_10 = new String((char[])hi.a("G", (int)var9_9, (long)1179352197199142661L));
                                var11_11 = (float)((hi.a("G", (double)(var5_6 - (double)var7_7 * 0.55), (long)920621527924433365L) + 1.0) * 0.5);
                                var12_12 = uH.k("c3Iblfq2CP4Xw3fL", getRGB(), (Color)hi.a("G", (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)479532142734583359L), (long)789438897355831922L)), (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)590348262488789057L), (long)789438897355831922L)), (float)var11_11, (long)1040237525350741921L)) & uH.a(30962, 5834485453014949835L);
                                hi.a("\u00a5", (Object)var4_5, (Object)hi.a("\u00a5", (Object)hi.a("G", var10_10, (long)1262634304799069784L), (Object)hi.a("\u00a5", (Object)hi.a("j", (long)480948852268970665L), (int)var12_12, (long)1067874061528227759L), (long)1183389538035419169L), (long)1224058718624515155L);
                                var8_8 += hi.a("G", (int)var9_9, (long)1095596949921591408L);
                                ++var7_7;
                                if (!var2_2) break block34;
                                ** GOTO lbl-1000
                            }
                            case 1151829774: lbl-1000:
                            // 2 sources

                            {
                                uH.k("c3Iblfq2CP4Xw3fL", l(java.lang.Object java.lang.Object int ), (Object)var4_5, (Object)var1_1, (int)uH.k("c3Iblfq2CP4Xw3fL", length(), (String)uH.a(29344, 19642)));
                                return uH.k("c3Iblfq2CP4Xw3fL", getVisualOrderText(), (MutableComponent)var4_5);
                            }
                            case 1151829775: 
                        }
                        break block15;
                    }
                    var13_3 /* !! */  = (hi.a("G", (int)(uH.a(31219, 5549841034388594406L) / 2), (int)uH.a(11703, 6282551446820555503L), (long)834203424483934088L) - uH.a(6401, 3714231613870849614L)) * uH.a(16693, 294725712917128747L) ^ uH.a(10871, 7925959123839323472L);
                }
                break;
            }
        }
        uH.k("c3Iblfq2CP4Xw3fL", h());
        hi.a("G", (long)1139342403621005073L);
        return null;
    }

    public static Component W(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        String string = (String)objectArray[1];
        return hi.a("G", (boolean)bl, (Object)hi.a("G", string, (long)1262634304799069784L), (long)725559251734464927L);
    }

    private static void lambda$addChatMessage$0(Component component) {
        uH.k("c3Iblfq2CP4Xw3fL", addClientSystemMessage(net.minecraft.network.chat.Component ), (ChatComponent)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)907159218940561824L), (long)681271407627774029L), (long)377126036033704318L), (Component)component);
    }

    private static boolean lambda$toPlainString$0(StringBuilder stringBuilder, int n, Style style, int n2) {
        hi.a("\u00a5", (Object)stringBuilder, (int)n2, (long)645858932681244600L);
        return true;
    }

    static {
        IlilIlIlil.registerNativesForClass((int)27, uH.class);
        Hidden0.special_clinit_27_190(uH.class);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x72A1) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 255;
                case 1 -> 9;
                case 2 -> 185;
                case 3 -> 148;
                case 4 -> 54;
                case 5 -> 214;
                case 6 -> 106;
                case 7 -> 101;
                case 8 -> 84;
                case 9 -> 139;
                case 10 -> 240;
                case 11 -> 196;
                case 12 -> 175;
                case 13 -> 202;
                case 14 -> 99;
                case 15 -> 161;
                case 16 -> 123;
                case 17 -> 107;
                case 18 -> 249;
                case 19 -> 229;
                case 20 -> 169;
                case 21 -> 0;
                case 22 -> 60;
                case 23 -> 89;
                case 24 -> 2;
                case 25 -> 189;
                case 26 -> 44;
                case 27 -> 122;
                case 28 -> 3;
                case 29 -> 136;
                case 30 -> 225;
                case 31 -> 172;
                case 32 -> 236;
                case 33 -> 149;
                case 34 -> 135;
                case 35 -> 43;
                case 36 -> 48;
                case 37 -> 156;
                case 38 -> 206;
                case 39 -> 254;
                case 40 -> 36;
                case 41 -> 170;
                case 42 -> 132;
                case 43 -> 82;
                case 44 -> 32;
                case 45 -> 100;
                case 46 -> 59;
                case 47 -> 85;
                case 48 -> 245;
                case 49 -> 164;
                case 50 -> 65;
                case 51 -> 28;
                case 52 -> 186;
                case 53 -> 160;
                case 54 -> 238;
                case 55 -> 96;
                case 56 -> 152;
                case 57 -> 223;
                case 58 -> 142;
                case 59 -> 162;
                case 60 -> 140;
                case 61 -> 219;
                case 62 -> 248;
                case 63 -> 117;
                case 64 -> 78;
                case 65 -> 222;
                case 66 -> 75;
                case 67 -> 109;
                case 68 -> 179;
                case 69 -> 210;
                case 70 -> 180;
                case 71 -> 243;
                case 72 -> 90;
                case 73 -> 23;
                case 74 -> 224;
                case 75 -> 203;
                case 76 -> 212;
                case 77 -> 11;
                case 78 -> 16;
                case 79 -> 163;
                case 80 -> 104;
                case 81 -> 57;
                case 82 -> 56;
                case 83 -> 158;
                case 84 -> 157;
                case 85 -> 7;
                case 86 -> 80;
                case 87 -> 13;
                case 88 -> 53;
                case 89 -> 230;
                case 90 -> 27;
                case 91 -> 174;
                case 92 -> 87;
                case 93 -> 51;
                case 94 -> 129;
                case 95 -> 191;
                case 96 -> 49;
                case 97 -> 235;
                case 98 -> 111;
                case 99 -> 94;
                case 100 -> 15;
                case 101 -> 127;
                case 102 -> 193;
                case 103 -> 131;
                case 104 -> 194;
                case 105 -> 150;
                case 106 -> 155;
                case 107 -> 208;
                case 108 -> 91;
                case 109 -> 29;
                case 110 -> 10;
                case 111 -> 209;
                case 112 -> 228;
                case 113 -> 165;
                case 114 -> 241;
                case 115 -> 178;
                case 116 -> 25;
                case 117 -> 97;
                case 118 -> 182;
                case 119 -> 42;
                case 120 -> 116;
                case 121 -> 188;
                case 122 -> 184;
                case 123 -> 237;
                case 124 -> 108;
                case 125 -> 61;
                case 126 -> 221;
                case 127 -> 1;
                case 128 -> 115;
                case 129 -> 66;
                case 130 -> 35;
                case 131 -> 128;
                case 132 -> 227;
                case 133 -> 76;
                case 134 -> 130;
                case 135 -> 195;
                case 136 -> 134;
                case 137 -> 232;
                case 138 -> 112;
                case 139 -> 190;
                case 140 -> 69;
                case 141 -> 119;
                case 142 -> 14;
                case 143 -> 40;
                case 144 -> 246;
                case 145 -> 220;
                case 146 -> 197;
                case 147 -> 45;
                case 148 -> 5;
                case 149 -> 37;
                case 150 -> 204;
                case 151 -> 168;
                case 152 -> 146;
                case 153 -> 39;
                case 154 -> 81;
                case 155 -> 151;
                case 156 -> 176;
                case 157 -> 239;
                case 158 -> 68;
                case 159 -> 217;
                case 160 -> 70;
                case 161 -> 19;
                case 162 -> 31;
                case 163 -> 92;
                case 164 -> 77;
                case 165 -> 22;
                case 166 -> 102;
                case 167 -> 41;
                case 168 -> 26;
                case 169 -> 63;
                case 170 -> 20;
                case 171 -> 47;
                case 172 -> 105;
                case 173 -> 64;
                case 174 -> 147;
                case 175 -> 153;
                case 176 -> 213;
                case 177 -> 21;
                case 178 -> 67;
                case 179 -> 12;
                case 180 -> 167;
                case 181 -> 251;
                case 182 -> 38;
                case 183 -> 88;
                case 184 -> 159;
                case 185 -> 141;
                case 186 -> 173;
                case 187 -> 252;
                case 188 -> 71;
                case 189 -> 143;
                case 190 -> 6;
                case 191 -> 24;
                case 192 -> 79;
                case 193 -> 121;
                case 194 -> 125;
                case 195 -> 154;
                case 196 -> 74;
                case 197 -> 113;
                case 198 -> 144;
                case 199 -> 145;
                case 200 -> 120;
                case 201 -> 247;
                case 202 -> 242;
                case 203 -> 250;
                case 204 -> 8;
                case 205 -> 93;
                case 206 -> 126;
                case 207 -> 177;
                case 208 -> 58;
                case 209 -> 33;
                case 210 -> 34;
                case 211 -> 138;
                case 212 -> 216;
                case 213 -> 114;
                case 214 -> 18;
                case 215 -> 233;
                case 216 -> 207;
                case 217 -> 30;
                case 218 -> 211;
                case 219 -> 192;
                case 220 -> 73;
                case 221 -> 198;
                case 222 -> 124;
                case 223 -> 199;
                case 224 -> 231;
                case 225 -> 218;
                case 226 -> 118;
                case 227 -> 103;
                case 228 -> 62;
                case 229 -> 187;
                case 230 -> 50;
                case 231 -> 183;
                case 232 -> 137;
                case 233 -> 46;
                case 234 -> 253;
                case 235 -> 55;
                case 236 -> 110;
                case 237 -> 201;
                case 238 -> 205;
                case 239 -> 200;
                case 240 -> 244;
                case 241 -> 166;
                case 242 -> 226;
                case 243 -> 52;
                case 244 -> 171;
                case 245 -> 98;
                case 246 -> 215;
                case 247 -> 4;
                case 248 -> 181;
                case 249 -> 17;
                case 250 -> 95;
                case 251 -> 133;
                case 252 -> 72;
                case 253 -> 83;
                case 254 -> 234;
                default -> 86;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                char[] cArray2 = cArray;
                char c = cArray[n10];
                if (n9 == 0) {
                    cArray2[n10] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                } else {
                    cArray2[n10] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n8]) & 0xFF;
                }
                ++n8;
            }
            uH.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2706;
        if (d[n2] == null) {
            uH.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
