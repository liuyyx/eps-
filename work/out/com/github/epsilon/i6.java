/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.Window
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.components.IMEPreeditOverlay
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.input.CharacterEvent
 *  net.minecraft.client.input.KeyEvent
 *  net.minecraft.client.input.MouseButtonEvent
 *  net.minecraft.client.input.PreeditEvent
 *  net.minecraft.network.chat.Component
 */
package com.github.epsilon;

import com.github.epsilon.DN;
import com.github.epsilon.Dl;
import com.github.epsilon.OU;
import com.github.epsilon.Ow;
import com.github.epsilon.Xy;
import com.github.epsilon._6;
import com.github.epsilon._j;
import com.github.epsilon.dd;
import com.github.epsilon.e;
import com.github.epsilon.gW;
import com.github.epsilon.hi;
import com.github.epsilon.iA;
import com.github.epsilon.ih;
import com.github.epsilon.l5;
import com.github.epsilon.lm;
import com.github.epsilon.ni;
import com.github.epsilon.vN;
import com.github.epsilon.v_;
import com.github.epsilon.y9;
import com.github.epsilon.zU;
import com.mojang.blaze3d.platform.Window;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.IMEPreeditOverlay;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.input.PreeditEvent;
import net.minecraft.network.chat.Component;

public class i6
extends Screen {
    private final y9 P;
    private String k;
    private final Ow W;
    public static final i6 D;
    private final gW T;
    private final iA U;
    private boolean O;
    private final OU N;
    private final _6 v;
    private int H;
    private final _j j;
    private final v_ q = new v_();
    private String l;
    private boolean z;
    private final DN V;
    private dd Y;
    private int X;
    private long t;
    private IMEPreeditOverlay n;
    private vN h;
    private final Xy B = new Xy();
    private String M;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long e;

    private i6() {
        super((Component)Component.literal((String)i6.a(19083, -13464)));
        this.j = hi.a("G", (long)1215511131780764219L);
        this.W = new Ow((l5)((Object)hi.a("j", (long)791229020891128130L)));
        this.v = new _6();
        this.V = new DN();
        this.T = new gW((v_)((Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L)), (_j)((Object)hi.a("\u00e9", (Object)((Object)this), (long)416508057231374457L)));
        this.U = new iA((v_)((Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L)), (_j)((Object)hi.a("\u00e9", (Object)((Object)this), (long)416508057231374457L)));
        this.P = new y9((v_)((Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L)), (_j)((Object)hi.a("\u00e9", (Object)((Object)this), (long)416508057231374457L)), (_6)((Object)hi.a("\u00e9", (Object)((Object)this), (long)581180575341734145L)));
        this.N = new OU((v_)((Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L)), (_j)((Object)hi.a("\u00e9", (Object)((Object)this), (long)416508057231374457L)), (_6)((Object)hi.a("\u00e9", (Object)((Object)this), (long)581180575341734145L)));
        hi.a("\u00f2", (Object)((Object)this), (int)-1, (long)1017791793068355724L);
        hi.a("\u00f2", (Object)((Object)this), (int)-1, (long)773026192959362422L);
        hi.a("\u00f2", (Object)((Object)this), (String)"", (long)626564947769387495L);
        hi.a("\u00f2", (Object)((Object)this), (String)"", (long)459796433040357163L);
        hi.a("\u00f2", (Object)((Object)this), (String)"", (long)647702719972832544L);
        hi.a("\u00f2", (Object)((Object)this), (long)e, (long)1048030592728036748L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseScrolled(double var1_1, double var3_2, double var5_3, double var7_4) {
        var9_5 = Dl.t();
        var14_6 /* !! */  = i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)hi.a("G", (int)(i6.a(7680, 3415765171723942944L) ^ i6.a(1625, 719082859167262346L)), (int)i6.a(17408, 8502053918021183394L), (long)834203424483934088L), (int)i6.a(15057, 4751719713679481037L)) - i6.a(4708, 3295863329775071373L);
        if (var9_5) ** GOTO lbl-1000
        v0 /* !! */  = var14_6 /* !! */ ;
        if (var9_5 != false) return (boolean)v0 /* !! */ ;
        switch (v0 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var10_7 = hi.a("G", (double)var1_1, (long)1273198203909826830L);
                var12_8 = hi.a("G", (double)var3_2, (long)1327728264718092753L);
                v1 = new Object[4];
                v1[3] = var7_4;
                v1[2] = var5_3;
                v1[1] = (double)var12_8;
                v1[0] = (double)var10_7;
                v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)v1, (long)472110698065940720L);
                if (var9_5) ** GOTO lbl98
                if (v2 /* !! */  == false) ** GOTO lbl97
                ** GOTO lbl99
            }
            case -15515077: {
                i6.S("WXpn7wn1OpxkZYds", O());
                v0 /* !! */  = (reference)true;
                return (boolean)v0 /* !! */ ;
            }
        }
lbl28:
        // 2 sources

        while (true) {
            v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
            if (var9_5) ** GOTO lbl102
            if (v3 /* !! */  == false) ** GOTO lbl101
            if (true) ** GOTO lbl103
            break;
        }
        block15: while (true) {
            switch (var14_6 /* !! */ ) {
                default: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                    return true;
                }
                case 788701307: {
                    ** GOTO lbl28
                }
                case 788701306: {
                    v4 = new Object[4];
                    v4[3] = var7_4;
                    v4[2] = var5_3;
                    v4[1] = (double)var12_8;
                    v4[0] = (double)var10_7;
                    v5 /* !! */  = (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)815581130301596177L), (Object)v4, (long)1221559985403254020L);
                    if (var9_5) ** GOTO lbl106
                    if (v5 /* !! */  == 0) ** GOTO lbl105
                    ** GOTO lbl108
                }
                case 788701304: {
                    i6.S("WXpn7wn1OpxkZYds", i(), (Xy)hi.a("\u00e9", (Object)this, (long)1148606078306715269L));
                    return true;
                }
                case 788701302: {
                    v6 = new Object[4];
                    v6[3] = var7_4;
                    v6[2] = var5_3;
                    v6[1] = (double)var12_8;
                    v6[0] = (double)var10_7;
                    v7 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1140477812933766157L), (Object)v6, (long)619498790071296508L);
                    if (var9_5) ** GOTO lbl111
                    if (v7 /* !! */  == false) ** GOTO lbl110
                    ** GOTO lbl112
                }
                case 788701301: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (Object)new Object[0], (long)569596580725293360L);
                    return true;
                }
                case 788701303: {
                    v8 = new Object[4];
                    v8[3] = var7_4;
                    v8[2] = var5_3;
                    v8[1] = (double)var12_8;
                    v8[0] = (double)var10_7;
                    v9 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043582042434162575L), (Object)v8, (long)592208638451758590L);
                    if (var9_5) ** GOTO lbl115
                    if (v9 /* !! */  == false) ** GOTO lbl114
                    ** GOTO lbl116
                }
                case 788701298: {
                    i6.S("WXpn7wn1OpxkZYds", v(), (Xy)hi.a("\u00e9", (Object)this, (long)1148606078306715269L));
                    return true;
                }
                case 788701305: {
                    hi.a("G", (long)633547218849443973L);
                    if (var9_5) ** break;
                    ** continue;
lbl97:
                    // 2 sources

                    v2 /* !! */  = var14_6 /* !! */  = (reference)(i6.a(31837, 1879842712577695658L) ^ i6.a(23695, 577920533459041915L) ^ i6.a(11116, 8957726953016396111L));
lbl98:
                    // 2 sources

                    if (!var9_5) continue block15;
lbl99:
                    // 2 sources

                    var14_6 /* !! */  = hi.a("G", (int)((i6.a(16511, 445288652722365190L) ^ i6.a(25078, 4338933736954151908L)) * i6.a(12517, 3725274460044301031L)), (int)i6.a(2972, 1486768394142263538L), (long)834203424483934088L) + i6.a(13660, 7721457504064378874L);
                    if (!var9_5) continue block15;
lbl101:
                    // 2 sources

                    v3 /* !! */  = var14_6 /* !! */  = (reference)(((i6.a(23193, 6920881101617560026L) - i6.a(10589, 4406884380806351496L)) * i6.a(3303, 797327853447884636L) ^ i6.a(10358, 1779530790755437277L)) + i6.a(4647, 6299384813497987543L));
lbl102:
                    // 2 sources

                    if (!var9_5) continue block15;
lbl103:
                    // 2 sources

                    var14_6 /* !! */  = (reference)((i6.a(28195, 5118232849638379171L) ^ i6.a(23241, 9096243955574274150L)) + i6.a(11248, 1780096955132184704L) - i6.a(31921, 7139800652937190962L));
                    if (!var9_5) continue block15;
lbl105:
                    // 2 sources

                    v5 /* !! */  = i6.a(12665, 603285004452270565L) + i6.a(27874, 3868948513535020930L) - i6.a(15763, 6021720150059032078L);
lbl106:
                    // 2 sources

                    var14_6 /* !! */  = (reference)v5 /* !! */ ;
                    if (!var9_5) continue block15;
lbl108:
                    // 2 sources

                    var14_6 /* !! */  = (reference)((i6.a(24167, 7089607500067831494L) + i6.a(22976, 6112883457972468302L)) * i6.a(19061, 752665356087257361L) - i6.a(4361, 7023599056398725778L));
                    if (!var9_5) continue block15;
lbl110:
                    // 2 sources

                    v7 /* !! */  = var14_6 /* !! */  = (reference)(i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)(i6.a(5269, 7331569509220004974L) ^ i6.a(23340, 1362998201104267741L)), (int)i6.a(26185, 1533271892450821872L)) ^ i6.a(21794, 7833001579458655809L));
lbl111:
                    // 2 sources

                    if (!var9_5) continue block15;
lbl112:
                    // 2 sources

                    var14_6 /* !! */  = hi.a("G", (int)(i6.a(4636, 8787018262720884870L) ^ i6.a(5098, 4445703582118064195L)), (int)i6.a(8464, 7663564130928656923L), (long)834203424483934088L) - i6.a(686, 3794652039159128492L);
                    if (!var9_5) continue block15;
lbl114:
                    // 2 sources

                    v9 /* !! */  = var14_6 /* !! */  = (reference)(i6.a(22552, 1078649351111441229L) + i6.a(11021, 8976991882034415967L) - i6.a(26397, 2318720251933017514L));
lbl115:
                    // 2 sources

                    if (!var9_5) continue block15;
lbl116:
                    // 2 sources

                    var14_6 /* !! */  = (reference)(hi.a("G", (int)(i6.a(6976, 9170761871363947463L) * i6.a(30850, 6906004830139308584L) - i6.a(29055, 6317339045985014457L)), (int)i6.a(10346, 6535259221948009139L), (long)834203424483934088L) ^ i6.a(369, 3696804450131747232L));
                    continue block15;
                }
                case 788701299: 
            }
            break;
        }
        return super.mouseScrolled((double)var10_7, (double)var12_8, var5_3, var7_4);
    }

    public i6 r(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L), (Object)new Object[]{true}, (long)587578511147709593L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L), (Object)new Object[]{hi.a("j", (long)1216665040131297294L)}, (long)1108440468926973192L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)1148606078306715269L), (long)1118264225753943113L);
        return this;
    }

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean charTyped(CharacterEvent characterEvent) {
        boolean bl = Dl.t();
        int n = (i6.a(10162, 5778101258784212220L) + i6.a(18824, 5528670657427696269L)) * i6.a(29722, 1527832015316473017L) / i6.a(22404, 7629416812521747578L) ^ i6.a(10777, 1619298423278766744L);
        boolean bl2 = true;
        block5: while (true) {
            reference var3_4;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && !bl) break block8;
                        Object[] objectArray = new Object[6];
                        objectArray[5] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L), (long)1042869732176404860L);
                        objectArray[4] = hi.a("\u00e9", (Object)((Object)this), (long)815581130301596177L);
                        objectArray[3] = hi.a("\u00e9", (Object)((Object)this), (long)1140477812933766157L);
                        objectArray[2] = hi.a("\u00e9", (Object)((Object)this), (long)1043582042434162575L);
                        objectArray[1] = hi.a("\u00e9", (Object)((Object)this), (long)581180575341734145L);
                        objectArray[0] = characterEvent;
                        reference v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)674994765408234880L), (Object)objectArray, (long)588009643021116501L);
                        if (bl) break block9;
                        if (v1 != false) break block10;
                        v1 = var3_4 = (reference)(i6.a(2809, 7925032812646377507L) * i6.a(23077, 5991138924860897548L) - i6.a(32406, 5351619268631682077L));
                    }
                    if (!bl) break block8;
                }
                var3_4 = hi.a("G", (int)(i6.a(6887, 6696164074876155907L) - i6.a(7450, 2252139559318568727L) + i6.a(21010, 3957662312295068053L)), (int)i6.a(1993, 739784698341500413L), (long)834203424483934088L) + i6.a(2373, 600545600728443674L);
            }
            switch (var3_4) {
                default: {
                    continue block5;
                }
                case -834323710: {
                    i6.S("WXpn7wn1OpxkZYds", k(), (Xy)((Object)hi.a("\u00e9", (Object)((Object)this), (long)1148606078306715269L)));
                    return true;
                }
                case -834323712: {
                    return super.charTyped(characterEvent);
                }
                case -834323709: 
            }
            break;
        }
        hi.a("G", (boolean)true, (long)529149675032995021L);
        hi.a("G", (long)470763965112580742L);
        return (boolean)hi.a("G", (int)0, (long)1236006381065832221L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void w(Object[] var1_1) {
        block12: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = hi.a("G", (int)(i6.a(22194, 5900075411724399699L) - i6.a(15877, 7187302199713242398L)), (int)i6.a(2387, 7096741441658366589L), (long)834203424483934088L) - i6.a(15781, 750854660417331022L);
            if (var2_2) break block12;
lbl5:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
                if (!var2_2) ** GOTO lbl38
                if (v0 /* !! */  == false) ** GOTO lbl37
                ** GOTO lbl39
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                i6.S("WXpn7wn1OpxkZYds", q(), (OU)hi.a("\u00e9", (Object)this, (long)815581130301596177L));
                if (var2_2) ** GOTO lbl41
lbl13:
                // 2 sources

                while (true) {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1140477812933766157L), (Object)new Object[0], (long)1126130682758048900L);
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043582042434162575L), (Object)new Object[0], (long)728686432756788972L);
                    if (!var2_2) lbl-1000:
                    // 2 sources

                    {
                        return;
                    }
                    ** GOTO lbl43
                    break;
                }
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1341005568: {
                    ** continue;
                }
                case 1341005567: {
                    ** continue;
                }
                case 1341005565: {
                    ** continue;
                }
                case 1341005564: 
            }
            i6.S("WXpn7wn1OpxkZYds", j());
            var3_3 /* !! */  = hi.a("G", (int)(i6.a(10010, 1486607820956697719L) - i6.a(14351, 1030249798401988756L)), (int)i6.a(12080, 2284285875390090345L), (long)834203424483934088L) / i6.a(31819, 3117762324691934888L) + i6.a(17971, 2345885008455198057L);
            if (var2_2) continue;
lbl37:
            // 2 sources

            v0 /* !! */  = var3_3 /* !! */  = (reference)((hi.a("G", (int)(hi.a("G", (int)i6.a(19410, 5893342732368374554L), (int)i6.a(25645, 8093919339376854647L), (long)834203424483934088L) - i6.a(26151, 5811999977309783517L)), (int)i6.a(25890, 6055461617122592153L), (long)834203424483934088L) ^ i6.a(12139, 3447789069290409917L)) + i6.a(12774, 3307128937534787948L));
lbl38:
            // 2 sources

            if (var2_2) continue;
lbl39:
            // 2 sources

            var3_3 /* !! */  = hi.a("G", (int)i6.a(31404, 6512287196107364498L), (int)i6.a(15169, 603007697226930399L), (long)834203424483934088L) - i6.a(23748, 5918302532519919311L) - i6.a(18498, 4195690380712536997L) - i6.a(24082, 2718390896356359865L);
            if (var2_2) continue;
lbl41:
            // 2 sources

            var3_3 /* !! */  = (reference)(i6.a(21824, 6174921412613240578L) / 4 * i6.a(27067, 8562558842750651351L) + i6.a(2133, 5054599733058349899L));
            if (var2_2) continue;
lbl43:
            // 2 sources

            var3_3 /* !! */  = (reference)(i6.a(8340, 3821339716315873986L) / 4 * i6.a(23401, 5325152125133224362L) + i6.a(529, 1232262738538438831L));
        }
    }

    /*
     * Exception decompiling
     */
    public boolean preeditUpdated(PreeditEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void lambda$drawChrome$1(ni ni2, zU zU2) {
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)i6.S("WXpn7wn1OpxkZYds", Kt(), (ih)((Object)hi.a("\u00a5", (Object)ni2, (long)455665241571922040L))), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)455665241571922040L), (long)665954777623212870L), (float)17.0f, (float)24.0f, (Object)hi.a("G", (Object)hi.a("j", (long)1292984830373578835L), (int)i6.a(17888, 5930175029218469513L), (long)950630386023407477L), (long)1008283404322600030L);
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)455665241571922040L), (long)1210563473410659836L), (float)i6.S("WXpn7wn1OpxkZYds", K5(), (ih)((Object)hi.a("\u00a5", (Object)ni2, (long)455665241571922040L))), (float)17.0f, (Object)hi.a("j", (long)1196268543698104759L), (long)776507817655946365L);
    }

    /*
     * Unable to fully structure code
     */
    private void C(Object[] var1_1) {
        block9: {
            block11: {
                block10: {
                    var4_2 = var1_1[0];
                    var2_3 = (Integer)var1_1[1];
                    var3_4 = (Integer)var1_1[2];
                    var5_5 = ((Float)var1_1[3]).floatValue();
                    var6_6 = Dl.S();
                    var7_7 = hi.a("G", (int)hi.a("G", (int)i6.a(1630, 1210077982798652834L), (int)i6.a(31182, 513484289250417601L), (long)834203424483934088L), (int)i6.a(22366, 2571848092464641390L), (long)834203424483934088L) ^ i6.a(9225, 8090985871456896527L);
                    if (var6_6) break block10;
lbl9:
                    // 2 sources

                    while (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)new Object[0], (long)599891721978873359L) == null) {
                        break block9;
                    }
                    break block11;
lbl12:
                    // 1 sources

                    return;
lbl14:
                    // 1 sources

                    while (true) {
                        v0 = new Object[5];
                        v0[4] = Float.valueOf(var5_5);
                        v0[3] = var3_4;
                        v0[2] = var2_3;
                        v0[1] = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)hi.a("j", (long)908139053228126372L), (long)530968903561563099L);
                        v0[0] = (GuiGraphicsExtractor)var4_2;
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)v0, (long)807859445821025702L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (long)724200594907917803L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)new Object[0], (long)696010471794104612L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)new Object[0], (long)1294970901470652421L);
                        return;
                    }
                }
lbl27:
                // 3 sources

                while (true) {
                    switch (var7_7) {
                        default: {
                            ** GOTO lbl9
                        }
                        case -135762279: {
                            ** continue;
                        }
                        case -135762278: {
                            ** continue;
                        }
                        case -135762280: 
                    }
                    hi.a("G", (long)782721573726732509L);
                    var7_7 = hi.a("G", (int)i6.a(26241, 8458216995032319275L), (int)i6.a(20650, 8383015285651174051L), (long)834203424483934088L) * i6.a(31273, 3905636501006538963L) ^ i6.a(776, 1934608168234492381L);
                    if (var6_6) continue;
                    break;
                }
            }
            var7_7 = i6.a(11685, 1881451099807550997L) - i6.a(12828, 6971592136566280421L) ^ i6.a(8660, 5756584445510943529L);
            if (var6_6) ** GOTO lbl27
        }
        var7_7 = i6.a(30182, 2988323027661346069L) + i6.a(24995, 7205308027697808283L) + i6.a(16219, 6442864531607493909L) + i6.a(32735, 2026859139724795102L);
        ** while (true)
    }

    private static void lambda$drawChrome$2(ni ni2, zU zU2) {
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)361994811018392101L), (long)1210563473410659836L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)361994811018392101L), (long)665954777623212870L), (float)13.0f, (Object)hi.a("j", (long)1028544513022896375L), (long)776507817655946365L);
    }

    private static void lambda$drawChrome$5(ni ni2, zU zU2) {
        i6.S("WXpn7wn1OpxkZYds", J(float float float float float java.awt.Color ), (zU)zU2, (float)0.0f, (float)0.0f, (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1197677846395598513L), (long)1210563473410659836L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1197677846395598513L), (long)665954777623212870L), (float)13.0f, (Color)((Object)hi.a("j", (long)1028544513022896375L)));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseDragged(MouseButtonEvent var1_1, double var2_2, double var4_3) {
        block11: {
            block10: {
                block9: {
                    var6_4 = Dl.t();
                    var12_5 /* !! */  = i6.a(13616, 4413411999601334085L) / i6.a(23819, 8955899960437243399L) - i6.a(18219, 2908733525941511407L);
                    if (var6_4) ** GOTO lbl-1000
                    v0 = var12_5 /* !! */ ;
                    if (var6_4 != false) return v0;
                    switch (v0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var7_6 = hi.a("G", (Object)var1_1, (long)387410669818340308L);
                            var8_7 = hi.a("G", (double)var2_2, (long)1273198203909826830L);
                            var10_8 = hi.a("G", (double)var4_3, (long)1327728264718092753L);
                            v1 = new Object[8];
                            v1[7] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
                            v1[6] = hi.a("\u00e9", (Object)this, (long)815581130301596177L);
                            v1[5] = hi.a("\u00e9", (Object)this, (long)1140477812933766157L);
                            v1[4] = hi.a("\u00e9", (Object)this, (long)1043582042434162575L);
                            v1[3] = hi.a("\u00e9", (Object)this, (long)581180575341734145L);
                            v1[2] = (double)var10_8;
                            v1[1] = (double)var8_7;
                            v1[0] = var7_6;
                            v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)674994765408234880L), (Object)v1, (long)1320633710965058609L);
                            if (var6_4) break block9;
                            if (v2 /* !! */  == false) break;
                            break block10;
                        }
                        case -606483884: {
                            hi.a("G", (float)0.0f, (float)0.0f, (float)10.0f, (float)1.0f, (long)796776827756410481L);
                            hi.a("G", (long)1033419646183286307L);
                            return false;
                        }
                    }
                    var12_5 /* !! */  = (int)((CallSite)(i6.a(31300, 8917048534142998571L) * i6.a(21397, 7990180422406992033L) * i6.a(18381, 5282050420080108726L) / i6.a(18098, 3555195828289856860L) ^ i6.a(19646, 6990580231375941298L)));
                    v2 /* !! */  = (CallSite)var12_5 /* !! */ ;
                }
                if (!var6_4) break block11;
            }
            var12_5 /* !! */  = (i6.a(25632, 4334565392697542357L) ^ i6.a(14917, 6388006500484159498L) ^ i6.a(28266, 6474865226918219232L)) * i6.a(6678, 5217062255328016612L) - i6.a(29599, 7915738108805206453L) ^ i6.a(4341, 7518116152024838940L);
        }
        v3 /* !! */  = var12_5 /* !! */ ;
        if (var6_4 != false) return v3 /* !! */ ;
        switch (v3 /* !! */  ? 1 : 0) {
            default: {
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                return true;
            }
            case -610304035: {
                return super.mouseDragged((MouseButtonEvent)var7_6, (double)var8_7, (double)var10_8);
            }
            case -610304036: 
        }
        hi.a("G", (long)1072168011298293672L);
        hi.a("G", (long)1077881734840925226L);
        v3 /* !! */  = hi.a("G", (long)700213693910295881L);
        return v3 /* !! */ ;
    }

    private void lambda$drawChrome$0(ni ni2, zU zU2) {
        block4: {
            block2: {
                block3: {
                    boolean bl = Dl.S();
                    hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00a5", (Object)ni2, (long)455665241571922040L), arg_0 -> i6.lambda$drawChrome$1(ni2, arg_0), (long)449141544506485015L);
                    boolean bl2 = bl;
                    hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00a5", (Object)ni2, (long)361994811018392101L), arg_0 -> i6.lambda$drawChrome$2(ni2, arg_0), (long)449141544506485015L);
                    if (!bl2) break block2;
                    if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L), (long)1042869732176404860L) == false) break block3;
                    reference var4_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1197677846395598513L), (long)889595511813135488L) - hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1031610004723161893L), (long)906597334513960415L);
                    CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1031610004723161893L), (long)665954777623212870L);
                    i6.S("WXpn7wn1OpxkZYds", iW(float float java.util.function.Consumer<com.github.epsilon.zU> ), (zU)zU2, (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1031610004723161893L), (long)906597334513960415L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1031610004723161893L), (long)1092110395291557528L), arg_0 -> i6.lambda$drawChrome$3((float)var4_4, (float)callSite, arg_0));
                    if (bl2) break block4;
                }
                hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00a5", (Object)ni2, (long)1031610004723161893L), arg_0 -> i6.lambda$drawChrome$4(ni2, arg_0), (long)449141544506485015L);
            }
            hi.a("\u00a5", (Object)zU2, (Object)hi.a("\u00a5", (Object)ni2, (long)1197677846395598513L), arg_0 -> i6.lambda$drawChrome$5(ni2, arg_0), (long)449141544506485015L);
        }
    }

    private static void lambda$drawChrome$3(float f, float f2, zU zU2) {
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)f, (float)f2, (float)13.0f, (Object)hi.a("j", (long)1028544513022896375L), (long)776507817655946365L);
    }

    private void T(Object[] objectArray) {
        Object object = objectArray[0];
        CallSite callSite = i6.S("WXpn7wn1OpxkZYds", h(java.util.function.Consumer<com.github.epsilon.zU> ), arg_0 -> this.lambda$drawChrome$0((ni)object, arg_0));
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = callSite;
        objectArray2[1] = i6.a(28821, 343692994439205454L);
        objectArray2[0] = hi.a("j", (long)940179441753858572L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)1130886441489985965L), (Object)objectArray2, (long)828574603683538025L);
    }

    public void removed() {
        super.removed();
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)581180575341734145L), (Object)new Object[0], (long)532225526543774215L);
        i6.S("WXpn7wn1OpxkZYds", a(), (iA)((Object)hi.a("\u00e9", (Object)((Object)this), (long)1140477812933766157L)));
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L), (Object)new Object[]{""}, (long)950399320462489728L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)1043582042434162575L), (Object)new Object[0], (long)438516933646452704L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)815581130301596177L), (Object)new Object[0], (long)540691836537382083L);
        i6.S("WXpn7wn1OpxkZYds", g(com.github.epsilon.e ), (v_)((Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L)), null);
        i6.S("WXpn7wn1OpxkZYds", J(com.github.epsilon.X0 ), (v_)((Object)hi.a("\u00e9", (Object)((Object)this), (long)790809536263885830L)), null);
        hi.a("G", (long)414670365113859210L);
        hi.a("\u00f2", (Object)((Object)this), null, (long)1318739863688053612L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void extractRenderState(GuiGraphicsExtractor var1_1, int var2_2, int var3_3, float var4_4) {
        block103: {
            block102: {
                block101: {
                    block100: {
                        block104: {
                            var5_5 = Dl.S();
                            var23_6 /* !! */  = i6.a(5938, 3715781808532894935L) + i6.a(28601, 2586167736929766710L) + i6.a(25671, 471631846866142966L);
                            if (var5_5) break block104;
lbl4:
                            // 2 sources

                            while (true) {
                                block114: {
                                    block113: {
                                        block111: {
                                            block112: {
                                                block110: {
                                                    block109: {
                                                        block108: {
                                                            block107: {
                                                                block106: {
                                                                    block105: {
                                                                        var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)553658746464011754L), (long)501728103734382890L);
                                                                        if (!var5_5) break block105;
                                                                        if (hi.a("\u00e9", (Object)this, (long)399044337443078029L) == null) break block106;
                                                                        var23_6 /* !! */  = hi.a("G", (int)(hi.a("G", (int)i6.a(2684, 8844080140417739262L), (int)i6.a(26658, 6568862144870206394L), (long)834203424483934088L) - i6.a(12031, 4883525838039911913L)), (int)i6.a(24276, 5976484966357859457L), (long)834203424483934088L) ^ i6.a(9843, 7294692764904851120L);
                                                                    }
                                                                    if (var5_5) ** GOTO lbl19
                                                                }
                                                                var23_6 /* !! */  = i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)i6.a(1190, 1802777767517955093L), (int)i6.a(25953, 396786123525834281L)) - i6.a(2981, 5109600737975674994L) ^ i6.a(25098, 7274051773610705571L);
                                                                if (var5_5) ** GOTO lbl19
                                                                if (true) ** GOTO lbl18
                                                                block67: while (true) {
                                                                    hi.a("\u00f2", (Object)this, (dd)hi.a("G", i6.a(19082, -11793), (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L), (int)hi.a("\u00a5", (Object)var6_7, (long)1111753302704211661L), (long)1217897332705552569L), (long)399044337443078029L);
                                                                    if (!var5_5) break;
lbl18:
                                                                    // 2 sources

                                                                    var23_6 /* !! */  = hi.a("G", (int)(hi.a("G", (int)i6.a(1079, 5710281713351107738L), (int)i6.a(30449, 1912473425546728546L), (long)834203424483934088L) - i6.a(4134, 8510000723097498372L)), (int)i6.a(22269, 6456691278124873248L), (long)834203424483934088L) ^ i6.a(23908, 2019408605674438065L);
lbl19:
                                                                    // 3 sources

                                                                    switch (var23_6 /* !! */ ) {
                                                                        case 1870444755: {
                                                                            hi.a("G", (float)0.5f, (long)542180438698619312L);
                                                                            continue block67;
                                                                        }
                                                                        default: {
                                                                            continue block67;
                                                                        }
                                                                        case 1870444756: 
                                                                    }
                                                                    break;
                                                                }
                                                                i6.S("WXpn7wn1OpxkZYds", F(), (dd)hi.a("\u00e9", (Object)this, (long)399044337443078029L));
                                                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)399044337443078029L), (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L), (int)hi.a("\u00a5", (Object)var6_7, (long)1111753302704211661L), (long)1136979599976336456L);
                                                                hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)399044337443078029L), (long)354958188171490714L);
                                                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)new Object[0], (long)784770621003871767L);
                                                                var7_8 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (Object)new Object[0], (long)985697099431536369L), (long)616202396584022832L);
                                                                if (!var5_5) break block107;
                                                                if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (Object)new Object[0], (long)1204939940045754575L) == null) break block108;
                                                                var23_6 /* !! */  = i6.a(25733, 1437406479173928745L) - i6.a(3757, 7736761169342475538L) + i6.a(20370, 6239965010316193017L) + i6.a(4536, 6526248348472029855L) - i6.a(22307, 91767017389880469L);
                                                            }
                                                            if (var5_5) break block109;
                                                        }
                                                        var23_6 /* !! */  = (i6.a(15749, 1399866183564631880L) ^ i6.a(3018, 4050503738491611514L)) / i6.a(23819, 8955899960437243399L) - i6.a(4031, 6818077078521097413L);
                                                    }
                                                    v0 /* !! */  = var23_6 /* !! */ ;
                                                    if (!var5_5) break block110;
                                                    switch (v0 /* !! */ ) {
                                                        default: {
                                                            v1 = "";
                                                            var23_6 /* !! */  = i6.a(18347, 1269186327485506862L) / i6.a(23819, 8955899960437243399L) * i6.a(15486, 1085241055976595392L) ^ i6.a(14319, 5038288516383643032L);
                                                            if (var5_5) break block111;
                                                            break block112;
                                                        }
                                                        case -1498958287: {
                                                            v1 = i6.S("WXpn7wn1OpxkZYds", G(), (e)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (Object)new Object[0], (long)1204939940045754575L));
                                                            if (var5_5) break block112;
                                                            ** GOTO lbl-1000
                                                        }
                                                        case -1498958286: {
                                                            v0 /* !! */  = (int)i6.S("WXpn7wn1OpxkZYds", X(int ), (int)i6.a(32759, 7694928314923375828L));
                                                        }
                                                    }
                                                }
                                                return;
                                            }
                                            var23_6 /* !! */  = i6.a(22103, 1489162805072754136L) / i6.a(23819, 8955899960437243399L) * i6.a(22934, 4445814268288891213L) ^ i6.a(26387, 2920357928583808983L);
                                        }
                                        switch (var23_6 /* !! */ ) {
                                            default: lbl-1000:
                                            // 2 sources

                                            {
                                                var8_9 = v1;
                                                var9_10 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1230603049132032047L);
                                                var10_11 = (vN)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)596570188656015243L), (long)789438897355831922L);
                                                var11_12 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)499952637869567416L);
                                                var12_13 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
                                                var13_14 = hi.a("\u00a5", (Object)hi.a("j", (long)1217461351966232571L), (long)1158125653534168986L);
                                                v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)626564947769387495L), (Object)var7_8, (long)734234975012314075L);
                                                if (!var5_5) break block113;
                                                if (v2 /* !! */  == false) break;
                                                break block114;
                                            }
                                            case -12327822: {
                                                return;
                                            }
                                        }
                                        v2 /* !! */  = (CallSite)(i6.a(1545, 1154661091367134385L) * i6.a(17329, 7690917294882513157L) - i6.a(30845, 968570501796158196L) + i6.a(11500, 8147637211263045503L));
                                    }
                                    var23_6 /* !! */  = (int)v2 /* !! */ ;
                                    if (var5_5) break block100;
                                }
                                var23_6 /* !! */  = (int)(i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)i6.a(15158, 2741407504663418894L), (int)i6.a(14727, 4170500800398793087L)) - i6.a(29427, 8423036218232033854L));
                                if (var5_5) break block100;
                                ** GOTO lbl383
                                break;
                            }
lbl81:
                            // 2 sources

                            while (true) {
                                v3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)860555669846755118L), (Object)new Object[0], (long)803239026892190194L);
                                if (!var5_5) ** GOTO lbl434
                                if (v3 != false) ** GOTO lbl433
                                ** GOTO lbl436
                                break;
                            }
lbl86:
                            // 2 sources

                            while (true) {
                                v4 = hi.a("\u00e9", (Object)this, (long)706366691792929152L);
                                v5 /* !! */  = hi.a("\u00e9", (Object)this, (long)1017791793068355724L);
                                if (!var5_5) ** GOTO lbl467
                                if (v4 != v5 /* !! */ ) ** GOTO lbl465
                                ** GOTO lbl469
                                break;
                            }
lbl92:
                            // 2 sources

                            while (true) {
                                v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (Object)new Object[0], (long)522564779207165779L);
                                if (!var5_5) ** GOTO lbl484
                                if (v6 /* !! */  == false) ** GOTO lbl483
                                ** GOTO lbl486
                                break;
                            }
lbl97:
                            // 2 sources

                            while (true) {
                                v7 /* !! */  = i6.S("WXpn7wn1OpxkZYds", k(), (Xy)hi.a("\u00e9", (Object)this, (long)1148606078306715269L));
                                if (!var5_5) ** GOTO lbl492
                                if (v7 /* !! */  == false) ** GOTO lbl491
                                ** GOTO lbl494
                                break;
                            }
lbl102:
                            // 2 sources

                            while (true) {
                                v8 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (Object)new Object[0], (long)552839726213855760L);
                                if (!var5_5) ** GOTO lbl500
                                if (v8 /* !! */  == false) ** GOTO lbl499
                                ** GOTO lbl502
                                break;
                            }
lbl107:
                            // 2 sources

                            while (true) {
                                block120: {
                                    block119: {
                                        block118: {
                                            block117: {
                                                block116: {
                                                    block115: {
                                                        var15_15 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)860555669846755118L), (Object)new Object[0], (long)1172873998299390751L);
                                                        var16_16 = hi.a("G", (int)hi.a("G", (long)938841799815187197L), (int)hi.a("G", (long)1217681287799928622L), (float)var15_15, (long)853719768120194366L);
                                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)new Object[]{hi.a("\u00a5", (Object)var16_16, (long)455665241571922040L)}, (long)1220909898201058695L);
                                                        hi.a("\u00a5", (Object)this, (Object)new Object[]{var16_16}, (long)793029269026049091L);
                                                        var17_17 = hi.a("G", (int)var2_2, (long)801972633595358600L);
                                                        var18_18 = hi.a("G", (int)var3_3, (long)701518974625326203L);
                                                        if (!var5_5) break block115;
                                                        if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)new Object[0], (long)599891721978873359L) != null) break block116;
                                                        var23_6 /* !! */  = (int)(hi.a("G", (int)i6.a(29206, 8647431901665808454L), (int)i6.a(14299, 7004502659597407412L), (long)834203424483934088L) * i6.a(14768, 6874880814510774892L) - i6.a(15283, 581573740863756454L));
                                                    }
                                                    if (var5_5) break block117;
                                                }
                                                var23_6 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)i6.a(23928, 2470103964619931012L), (int)i6.a(12362, 4293735363992064152L), (long)834203424483934088L) * i6.a(9055, 6095122864379330918L)), (int)i6.a(4326, 8725027920678695896L), (long)834203424483934088L) * i6.a(12747, 165091522483131012L) + i6.a(2871, 1181887038081149337L));
                                            }
                                            v9 /* !! */  = var23_6 /* !! */ ;
                                            if (!var5_5) break block118;
                                            switch (v9 /* !! */ ) {
                                                default: {
                                                    v9 /* !! */  = 1;
                                                    break;
                                                }
                                                case -1119029864: {
                                                    v9 /* !! */  = 0;
                                                    if (var5_5) break block119;
                                                    break block120;
                                                }
                                                case -1119029863: {
                                                    throw null;
                                                }
                                            }
                                        }
                                        var23_6 /* !! */  = (i6.a(9558, 6966501259934926678L) ^ i6.a(12415, 5670747744554062800L)) / i6.a(23819, 8955899960437243399L) + i6.a(25165, 7519671383760846907L);
                                        if (var5_5) break block101;
                                    }
                                    var23_6 /* !! */  = (i6.a(32572, 6837252082796026934L) ^ i6.a(18937, 4015095712324250483L)) / i6.a(23819, 8955899960437243399L) + i6.a(25886, 5451986570332915298L);
                                    break block101;
                                }
lbl142:
                                // 2 sources

                                while (true) {
                                    block134: {
                                        block133: {
                                            block132: {
                                                block131: {
                                                    block130: {
                                                        block129: {
                                                            block128: {
                                                                block127: {
                                                                    block126: {
                                                                        block125: {
                                                                            block124: {
                                                                                block123: {
                                                                                    block122: {
                                                                                        block121: {
                                                                                            v10 /* !! */  = var19_19 /* !! */  = v9 /* !! */ ;
                                                                                            if (!var5_5) break block121;
                                                                                            if (v10 /* !! */  != 0) break block122;
                                                                                            v10 /* !! */  = var23_6 /* !! */  = (i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)i6.a(32679, 6755930748742917126L), (int)i6.a(5911, 8058154636317013256L)) ^ i6.a(15913, 5395298794069794213L)) - i6.a(2182, 7099747677267503668L);
                                                                                        }
                                                                                        if (var5_5) break block123;
                                                                                    }
                                                                                    var23_6 /* !! */  = (i6.a(5860, 9025230703592519265L) + i6.a(21309, 5962128079279878155L)) / i6.a(22404, 7629416812521747578L) - i6.a(26437, 686840048062153897L);
                                                                                }
                                                                                v11 /* !! */  = var23_6 /* !! */ ;
                                                                                if (!var5_5) break block124;
                                                                                switch (v11 /* !! */ ) {
                                                                                    default: {
                                                                                        v11 /* !! */  = i6.a(25990, 4586282071727228231L);
                                                                                        break;
                                                                                    }
                                                                                    case -569912504: {
                                                                                        v11 /* !! */  = (int)var17_17;
                                                                                        if (var5_5) break block125;
                                                                                        ** GOTO lbl-1000
                                                                                    }
                                                                                    case -569912503: {
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                            var23_6 /* !! */  = (i6.a(15779, 2038219874111266742L) * i6.a(18281, 2291107720015898605L) / i6.a(8071, 5822306901834186070L) ^ i6.a(3502, 9210191763337850373L)) - i6.a(18977, 8765059416600537240L) - i6.a(16772, 2530237036197307252L);
                                                                            if (var5_5) break block126;
                                                                        }
                                                                        var23_6 /* !! */  = (i6.a(2224, 1060647803398826588L) * i6.a(10161, 1293125911390749704L) / i6.a(8071, 5822306901834186070L) ^ i6.a(32552, 8565488413435157901L)) - i6.a(4250, 5389792878614164211L) - i6.a(21183, 446078163461107962L);
                                                                    }
                                                                    switch (var23_6 /* !! */ ) {
                                                                        default: lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var20_20 /* !! */  = v11 /* !! */ ;
                                                                            v12 /* !! */  = var19_19 /* !! */ ;
                                                                            if (!var5_5) break block127;
                                                                            if (v12 /* !! */  == 0) break;
                                                                            break block128;
                                                                        }
                                                                        case 1652012354: {
                                                                            hi.a("G", (long)1330918851199290462L);
                                                                            return;
                                                                        }
                                                                    }
                                                                    v12 /* !! */  = var23_6 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)i6.a(29498, 3724520852952731954L), (int)i6.a(9706, 3967401975422846963L), (long)834203424483934088L) / i6.a(4573, 194352531328316122L)), (int)i6.a(21404, 8942223173864452928L), (long)834203424483934088L) + i6.a(19702, 662621044199026528L));
                                                                }
                                                                if (var5_5) break block129;
                                                            }
                                                            var23_6 /* !! */  = hi.a("G", (int)i6.a(25640, 7222262172609005302L), (int)i6.a(25007, 1656085971990922210L), (long)834203424483934088L) + i6.a(6588, 8242921029710363452L) ^ i6.a(27555, 5146425047611033722L);
                                                        }
                                                        v13 /* !! */  = var23_6 /* !! */ ;
                                                        if (!var5_5) break block130;
                                                        switch (v13 /* !! */ ) {
                                                            default: {
                                                                v13 /* !! */  = i6.a(11063, 286635013311170802L);
                                                                break block130;
                                                            }
                                                            case -1534920887: {
                                                                break;
                                                            }
                                                            case -1534920888: {
                                                                hi.a("G", (long)1309558455265531753L);
                                                            }
                                                        }
                                                        v13 /* !! */  = (int)var18_18;
                                                        if (var5_5) break block131;
                                                        ** GOTO lbl-1000
                                                    }
                                                    var23_6 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)i6.a(29923, 4488458307446495174L), (int)i6.a(23862, 8432708792448286204L), (long)834203424483934088L), (int)i6.a(27644, 1126598955786946685L), (long)834203424483934088L) - i6.a(13848, 3820647811122336843L));
                                                    if (var5_5) break block132;
                                                }
                                                var23_6 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)i6.a(16412, 8462672776796725884L), (int)i6.a(10851, 555213309679077660L), (long)834203424483934088L), (int)i6.a(1225, 1862588953952265239L), (long)834203424483934088L) - i6.a(32372, 3580545009994390694L));
                                            }
                                            switch (var23_6 /* !! */ ) {
                                                default: lbl-1000:
                                                // 2 sources

                                                {
                                                    var21_21 /* !! */  = v13 /* !! */ ;
                                                    v14 = new Object[2];
                                                    v14[1] = i6.a(12570, 8472015432464962534L);
                                                    v14[0] = hi.a("j", (long)882827338724254838L);
                                                    v15 = new Object[6];
                                                    v15[5] = Float.valueOf(var4_4);
                                                    v15[4] = var21_21 /* !! */ ;
                                                    v15[3] = var20_20 /* !! */ ;
                                                    v15[2] = hi.a("\u00a5", (Object)var16_16, (long)361994811018392101L);
                                                    v15[1] = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)v14, (long)552889054143910312L);
                                                    v15[0] = var1_1;
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)860555669846755118L), (Object)v15, (long)364488316607645807L);
                                                    v16 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
                                                    if (!var5_5) break block133;
                                                    if (v16 /* !! */  == false) break;
                                                    break block134;
                                                }
                                                case 326562634: {
                                                    i6.S("WXpn7wn1OpxkZYds", x(double ), (double)1.0);
                                                    hi.a("G", (double)2.0, (float)-0.5f, (boolean)false, (boolean)true, (boolean)false, (boolean)false, (boolean)true, (boolean)true, (boolean)true, (boolean)true, (int)i6.a(19961, 6725184406629314557L), (long)1218704056816907128L);
                                                    return;
                                                }
                                            }
                                            v16 /* !! */  = (CallSite)(i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)(i6.a(23647, 5058719179216813894L) * i6.a(22320, 1675617997045167191L)), (int)i6.a(8850, 5607224522264543757L)) / i6.a(4573, 194352531328316122L) ^ i6.a(32432, 8085622860741271021L));
                                        }
                                        var23_6 /* !! */  = (int)v16 /* !! */ ;
                                        if (var5_5) break block102;
                                    }
                                    var23_6 /* !! */  = (i6.a(7045, 3839849321634085161L) / i6.a(18854, 3323650617789377448L) / i6.a(8071, 5822306901834186070L) + i6.a(924, 9166390132080157458L) ^ i6.a(24900, 9001092887400366727L)) + i6.a(31578, 996064631984445698L);
                                    break block102;
                                    break;
                                }
                                break;
                            }
lbl239:
                            // 2 sources

                            while (true) {
                                v17 = new Object[2];
                                v17[1] = 0;
                                v17[0] = hi.a("j", (long)882827338724254838L);
                                v18 = new Object[6];
                                v18[5] = Float.valueOf(var4_4);
                                v18[4] = var21_21 /* !! */ ;
                                v18[3] = var20_20 /* !! */ ;
                                v18[2] = hi.a("\u00a5", (Object)var16_16, (long)1031610004723161893L);
                                v18[1] = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)v17, (long)552889054143910312L);
                                v18[0] = var1_1;
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1140477812933766157L), (Object)v18, (long)611780174374888210L);
                                v19 = new Object[2];
                                v19[1] = i6.a(9045, 8587444321371259211L);
                                v19[0] = hi.a("j", (long)882827338724254838L);
                                i6.S("WXpn7wn1OpxkZYds", T(net.minecraft.client.gui.GuiGraphicsExtractor com.github.epsilon.lm com.github.epsilon.ih int int float ), (y9)hi.a("\u00e9", (Object)this, (long)1043582042434162575L), (GuiGraphicsExtractor)var1_1, (lm)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)v19, (long)552889054143910312L), (ih)hi.a("\u00a5", (Object)var16_16, (long)1197677846395598513L), (int)var20_20 /* !! */ , (int)var21_21 /* !! */ , (float)var4_4);
                                if (var5_5) ** GOTO lbl554
lbl256:
                                // 2 sources

                                while (true) {
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (long)724200594907917803L);
                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)899389715054224957L);
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)new Object[0], (long)1294970901470652421L);
                                    v20 = new Object[4];
                                    v20[3] = Float.valueOf(var4_4);
                                    v20[2] = (int)var18_18;
                                    v20[1] = (int)var17_17;
                                    v20[0] = var1_1;
                                    hi.a("\u00a5", (Object)this, (Object)v20, (long)826019119573916060L);
                                    hi.a("G", null, (long)354958188171490714L);
                                    if (!var5_5) ** GOTO lbl557
                                    if (hi.a("\u00e9", (Object)this, (long)1318739863688053612L) == null) ** GOTO lbl556
                                    ** GOTO lbl558
                                    break;
                                }
                                break;
                            }
                        }
                        while (true) {
                            switch (var23_6 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 1872389362: 
                            }
                            hi.a("G", (long)964250018269559427L);
                            var23_6 /* !! */  = i6.a(10729, 755820131112192826L) / i6.a(22767, 7729107895029102705L) - i6.a(5840, 6284120189240849792L);
                        }
                    }
                    while (true) {
                        block168: {
                            block167: {
                                block166: {
                                    block165: {
                                        block164: {
                                            block162: {
                                                block163: {
                                                    block161: {
                                                        block160: {
                                                            block158: {
                                                                block159: {
                                                                    block157: {
                                                                        block155: {
                                                                            block156: {
                                                                                block154: {
                                                                                    block152: {
                                                                                        block153: {
                                                                                            block151: {
                                                                                                block150: {
                                                                                                    block148: {
                                                                                                        block149: {
                                                                                                            block147: {
                                                                                                                block145: {
                                                                                                                    block146: {
                                                                                                                        block144: {
                                                                                                                            block142: {
                                                                                                                                block143: {
                                                                                                                                    block141: {
                                                                                                                                        block140: {
                                                                                                                                            block139: {
                                                                                                                                                block137: {
                                                                                                                                                    block138: {
                                                                                                                                                        block136: {
                                                                                                                                                            block135: {
                                                                                                                                                                switch (var23_6 /* !! */ ) {
                                                                                                                                                                    default: {
                                                                                                                                                                        v21 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)459796433040357163L), (Object)var8_9, (long)734234975012314075L);
                                                                                                                                                                        if (!var5_5) break block135;
                                                                                                                                                                        if (v21 /* !! */  == false) break;
                                                                                                                                                                        break block136;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909504: {
                                                                                                                                                                        v22 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)647702719972832544L), (Object)var9_10, (long)734234975012314075L);
                                                                                                                                                                        if (!var5_5) break block137;
                                                                                                                                                                        if (v22 /* !! */  == false) break block138;
                                                                                                                                                                        break block139;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909506: {
                                                                                                                                                                        if (hi.a("\u00e9", (Object)this, (long)1244351233703808238L) != var10_11) break block140;
                                                                                                                                                                        break block141;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909493: {
                                                                                                                                                                        v23 /* !! */  = hi.a("\u00e9", (Object)this, (long)1063401158932046783L);
                                                                                                                                                                        v24 /* !! */  = var11_12;
                                                                                                                                                                        if (!var5_5) break block142;
                                                                                                                                                                        if (v23 /* !! */  != v24 /* !! */ ) break block143;
                                                                                                                                                                        break block144;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909494: {
                                                                                                                                                                        v25 /* !! */  = hi.a("\u00e9", (Object)this, (long)455964360113390980L);
                                                                                                                                                                        v26 /* !! */  = var12_13;
                                                                                                                                                                        if (!var5_5) break block145;
                                                                                                                                                                        if (v25 /* !! */  != v26 /* !! */ ) break block146;
                                                                                                                                                                        break block147;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909495: {
                                                                                                                                                                        cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)1048030592728036748L) - var13_14;
                                                                                                                                                                        v27 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                                                                                                                        if (!var5_5) break block148;
                                                                                                                                                                        if (v27 /* !! */  == false) break block149;
                                                                                                                                                                        break block150;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909501: {
                                                                                                                                                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (String)var7_8, (long)626564947769387495L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (String)var8_9, (long)459796433040357163L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (String)var9_10, (long)647702719972832544L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (vN)var10_11, (long)1244351233703808238L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (boolean)var11_12, (long)1063401158932046783L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (boolean)var12_13, (long)455964360113390980L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (long)var13_14, (long)1048030592728036748L);
                                                                                                                                                                        if (var5_5) break block151;
                                                                                                                                                                        ** GOTO lbl81
                                                                                                                                                                    }
                                                                                                                                                                    case -551909502: {
                                                                                                                                                                        ** continue;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909505: {
                                                                                                                                                                        v28 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1140477812933766157L), (Object)new Object[0], (long)1009288651713599537L);
                                                                                                                                                                        if (!var5_5) break block152;
                                                                                                                                                                        if (v28 != false) break block153;
                                                                                                                                                                        break block154;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909490: {
                                                                                                                                                                        v29 = i6.S("WXpn7wn1OpxkZYds", a(), (y9)hi.a("\u00e9", (Object)this, (long)1043582042434162575L));
                                                                                                                                                                        if (!var5_5) break block155;
                                                                                                                                                                        if (v29 != false) break block156;
                                                                                                                                                                        break block157;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909503: {
                                                                                                                                                                        v30 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)815581130301596177L), (Object)new Object[0], (long)986604902053387166L);
                                                                                                                                                                        if (!var5_5) break block158;
                                                                                                                                                                        if (v30 == false) break block159;
                                                                                                                                                                        break block160;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909492: {
                                                                                                                                                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                                                                                                                                                                        if (var5_5) break block161;
                                                                                                                                                                        ** GOTO lbl86
                                                                                                                                                                    }
                                                                                                                                                                    case -551909499: {
                                                                                                                                                                        ** continue;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909512: {
                                                                                                                                                                        v31 /* !! */  = hi.a("\u00e9", (Object)this, (long)571996097568868172L);
                                                                                                                                                                        v32 /* !! */  = hi.a("\u00e9", (Object)this, (long)773026192959362422L);
                                                                                                                                                                        if (!var5_5) break block162;
                                                                                                                                                                        if (v31 /* !! */  == v32 /* !! */ ) break block163;
                                                                                                                                                                        break block164;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909491: {
                                                                                                                                                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (Object)new Object[0], (long)417292948955480930L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (int)hi.a("\u00e9", (Object)this, (long)706366691792929152L), (long)1017791793068355724L);
                                                                                                                                                                        hi.a("\u00f2", (Object)this, (int)hi.a("\u00e9", (Object)this, (long)571996097568868172L), (long)773026192959362422L);
                                                                                                                                                                        if (var5_5) break block165;
                                                                                                                                                                        ** GOTO lbl92
                                                                                                                                                                    }
                                                                                                                                                                    case -551909497: {
                                                                                                                                                                        ** continue;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909507: {
                                                                                                                                                                        i6.S("WXpn7wn1OpxkZYds", s(), (iA)hi.a("\u00e9", (Object)this, (long)1140477812933766157L));
                                                                                                                                                                        if (var5_5) break block166;
                                                                                                                                                                        ** GOTO lbl97
                                                                                                                                                                    }
                                                                                                                                                                    case -551909509: {
                                                                                                                                                                        ** continue;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909500: {
                                                                                                                                                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043582042434162575L), (long)553915784785043814L);
                                                                                                                                                                        if (var5_5) break block167;
                                                                                                                                                                        ** GOTO lbl102
                                                                                                                                                                    }
                                                                                                                                                                    case -551909508: {
                                                                                                                                                                        ** continue;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909498: {
                                                                                                                                                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)815581130301596177L), (Object)new Object[0], (long)865516889850803634L);
                                                                                                                                                                        if (var5_5) break block168;
                                                                                                                                                                        ** GOTO lbl107
                                                                                                                                                                    }
                                                                                                                                                                    case -551909511: {
                                                                                                                                                                        ** continue;
                                                                                                                                                                    }
                                                                                                                                                                    case -551909510: {
                                                                                                                                                                        break block103;
                                                                                                                                                                    }
                                                                                                                                                                }
lbl383:
                                                                                                                                                                // 2 sources

                                                                                                                                                                v21 /* !! */  = (CallSite)(i6.a(19476, 5302197662525091368L) * i6.a(9889, 5528217071417001005L) - i6.a(18702, 9005784039242066398L) + i6.a(16950, 8082138239223160902L));
                                                                                                                                                            }
                                                                                                                                                            var23_6 /* !! */  = (int)v21 /* !! */ ;
                                                                                                                                                            if (var5_5) continue;
                                                                                                                                                        }
                                                                                                                                                        var23_6 /* !! */  = (int)(hi.a("G", (int)(i6.a(5481, 6693985702481934101L) / i6.a(20477, 561992227960516460L) - i6.a(9416, 1908464463018624810L)), (int)i6.a(6580, 6723286161986960151L), (long)834203424483934088L) - i6.a(32230, 1548778769702051608L));
                                                                                                                                                        if (var5_5) continue;
                                                                                                                                                    }
                                                                                                                                                    v22 /* !! */  = (CallSite)(i6.a(19476, 5302197662525091368L) * i6.a(9889, 5528217071417001005L) - i6.a(18702, 9005784039242066398L) + i6.a(16950, 8082138239223160902L));
                                                                                                                                                }
                                                                                                                                                var23_6 /* !! */  = (int)v22 /* !! */ ;
                                                                                                                                                if (var5_5) continue;
                                                                                                                                            }
                                                                                                                                            var23_6 /* !! */  = i6.a(28513, 6237290347249061874L) * i6.a(20116, 8935087151071948227L) / i6.a(27756, 5106164921458937473L) - i6.a(5951, 9187421673827611692L);
                                                                                                                                            if (var5_5) continue;
                                                                                                                                        }
                                                                                                                                        var23_6 /* !! */  = i6.a(19476, 5302197662525091368L) * i6.a(9889, 5528217071417001005L) - i6.a(18702, 9005784039242066398L) + i6.a(16950, 8082138239223160902L);
                                                                                                                                        if (var5_5) continue;
                                                                                                                                    }
                                                                                                                                    var23_6 /* !! */  = i6.a(1454, 6878369837179381032L) - i6.a(4405, 7151880564110602881L) + i6.a(23055, 1570975298133883532L);
                                                                                                                                    if (var5_5) continue;
                                                                                                                                }
                                                                                                                                v23 /* !! */  = (CallSite)(i6.a(19476, 5302197662525091368L) * i6.a(9889, 5528217071417001005L) - i6.a(18702, 9005784039242066398L));
                                                                                                                                v24 /* !! */  = (CallSite)i6.a(16950, 8082138239223160902L);
                                                                                                                            }
                                                                                                                            var23_6 /* !! */  = (int)(v23 /* !! */  + v24 /* !! */ );
                                                                                                                            if (var5_5) continue;
                                                                                                                        }
                                                                                                                        var23_6 /* !! */  = (i6.a(24894, 3528735333461279216L) + i6.a(22459, 1547414294720214083L) ^ i6.a(16814, 749561592679588863L)) - i6.a(25216, 8856840873185329498L);
                                                                                                                        if (var5_5) continue;
                                                                                                                    }
                                                                                                                    v25 /* !! */  = (CallSite)(i6.a(19476, 5302197662525091368L) * i6.a(9889, 5528217071417001005L) - i6.a(18702, 9005784039242066398L));
                                                                                                                    v26 /* !! */  = (CallSite)i6.a(16950, 8082138239223160902L);
                                                                                                                }
                                                                                                                var23_6 /* !! */  = (int)(v25 /* !! */  + v26 /* !! */ );
                                                                                                                if (var5_5) continue;
                                                                                                            }
                                                                                                            var23_6 /* !! */  = (i6.a(13156, 7244066528611045637L) * i6.a(26292, 2054710481525916961L) - i6.a(22638, 2104813118229543935L) ^ i6.a(30424, 2643965522481894958L)) + i6.a(4941, 7898116682032427369L) + i6.a(12636, 3166000369750676004L);
                                                                                                            if (var5_5) continue;
                                                                                                        }
                                                                                                        v27 /* !! */  = (reference)((i6.a(1629, 4940425671211951849L) + i6.a(3299, 6383892976916278309L) ^ i6.a(10238, 6559781522450941211L)) - i6.a(20893, 7560095198099731145L) + i6.a(4489, 503924722345881883L) + i6.a(23676, 3647622672924278709L));
                                                                                                    }
                                                                                                    var23_6 /* !! */  = (int)v27 /* !! */ ;
                                                                                                    if (var5_5) continue;
                                                                                                }
                                                                                                var23_6 /* !! */  = i6.a(19476, 5302197662525091368L) * i6.a(9889, 5528217071417001005L) - i6.a(18702, 9005784039242066398L) + i6.a(16950, 8082138239223160902L);
                                                                                                if (var5_5) continue;
                                                                                            }
                                                                                            var23_6 /* !! */  = (i6.a(24627, 2668587121873567977L) + i6.a(16782, 2706663010735612744L) ^ i6.a(2707, 3913969084606753389L)) - i6.a(24457, 8802861647832054934L) + i6.a(22089, 2425280872610755826L) + i6.a(21577, 880684048493639307L);
                                                                                            if (var5_5) continue;
lbl433:
                                                                                            // 2 sources

                                                                                            v3 = i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)hi.a("G", (int)i6.a(5991, 2050115458956244052L), (int)i6.a(2969, 5993412593558890712L), (long)834203424483934088L), (int)i6.a(12020, 6070417104191884389L)) * i6.a(28894, 6103937581156324335L) * i6.a(13013, 4760310835304402982L) - i6.a(16944, 5758481618900574645L);
lbl434:
                                                                                            // 2 sources

                                                                                            var23_6 /* !! */  = (int)v3;
                                                                                            if (var5_5) continue;
lbl436:
                                                                                            // 2 sources

                                                                                            var23_6 /* !! */  = i6.a(14368, 6879588306047933240L) + i6.a(30724, 8485321199102319355L) + i6.a(31082, 3719905125235252030L) - i6.a(28175, 4321655542804073802L);
                                                                                            if (var5_5) continue;
                                                                                        }
                                                                                        v28 = hi.a("G", (int)hi.a("G", (int)i6.a(11497, 7979465739869556348L), (int)i6.a(29975, 3270712239674152575L), (long)834203424483934088L), (int)i6.a(1069, 4104658785998743481L), (long)834203424483934088L) * i6.a(16293, 8881774904711978231L) * i6.a(25837, 3428580156885517394L) - i6.a(19291, 8285423719874587621L);
                                                                                    }
                                                                                    var23_6 /* !! */  = (int)v28;
                                                                                    if (var5_5) continue;
                                                                                }
                                                                                var23_6 /* !! */  = hi.a("G", (int)i6.a(4164, 1955669154150363742L), (int)i6.a(22342, 7382342954668061881L), (long)834203424483934088L) ^ i6.a(14350, 2352409019609291572L) ^ i6.a(7088, 1991255595042879806L);
                                                                                if (var5_5) continue;
                                                                            }
                                                                            v29 = hi.a("G", (int)hi.a("G", (int)i6.a(11497, 7979465739869556348L), (int)i6.a(29975, 3270712239674152575L), (long)834203424483934088L), (int)i6.a(1069, 4104658785998743481L), (long)834203424483934088L) * i6.a(16293, 8881774904711978231L) * i6.a(25837, 3428580156885517394L) - i6.a(19291, 8285423719874587621L);
                                                                        }
                                                                        var23_6 /* !! */  = (int)v29;
                                                                        if (var5_5) continue;
                                                                    }
                                                                    var23_6 /* !! */  = i6.a(12821, 4940173986724844245L) - i6.a(4136, 3293301183660405254L) - i6.a(5946, 2701213238958634297L) - i6.a(2295, 6579907730515241652L);
                                                                    if (var5_5) continue;
                                                                }
                                                                v30 = i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)(hi.a("G", (int)i6.a(31614, 4160164149659752508L), (int)i6.a(17148, 7131458751041298552L), (long)834203424483934088L) * i6.a(6002, 3139902079771424073L)), (int)i6.a(17374, 1270372550770516077L)) + i6.a(14612, 5819457416039176941L) + i6.a(14950, 2006578870381025951L);
                                                            }
                                                            var23_6 /* !! */  = (int)v30;
                                                            if (var5_5) continue;
                                                        }
                                                        var23_6 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)i6.a(11497, 7979465739869556348L), (int)i6.a(29975, 3270712239674152575L), (long)834203424483934088L), (int)i6.a(1069, 4104658785998743481L), (long)834203424483934088L) * i6.a(16293, 8881774904711978231L) * i6.a(25837, 3428580156885517394L) - i6.a(19291, 8285423719874587621L));
                                                        if (var5_5) continue;
                                                    }
                                                    var23_6 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)i6.a(5351, 3265549922062022512L), (int)i6.a(7336, 8876345845533687572L), (long)834203424483934088L) * i6.a(7755, 4270858606658862408L)), (int)i6.a(46, 6127221248448209902L), (long)834203424483934088L) + i6.a(23016, 7876577606377634077L) + i6.a(5299, 1250763459115923221L));
                                                    if (var5_5) continue;
lbl465:
                                                    // 2 sources

                                                    v4 = hi.a("G", (int)i6.a(24699, 3824066415369371828L), (int)i6.a(10677, 1270494149295540833L), (long)834203424483934088L) + i6.a(6563, 7670077273870187396L) - i6.a(25459, 5678613576642150555L);
                                                    v5 /* !! */  = (CallSite)i6.a(20243, 2121921435248127237L);
lbl467:
                                                    // 2 sources

                                                    var23_6 /* !! */  = v4 ^ v5 /* !! */ ;
                                                    if (var5_5) continue;
lbl469:
                                                    // 2 sources

                                                    var23_6 /* !! */  = (int)(hi.a("G", (int)i6.a(16965, 3821073180215173144L), (int)i6.a(31575, 5570253026655558085L), (long)834203424483934088L) / 3 * i6.a(24322, 4008286671459253487L) - i6.a(4320, 4041254480845779554L));
                                                    if (var5_5) continue;
                                                }
                                                v31 /* !! */  = (CallSite)(i6.a(23494, 3079469705111205998L) - i6.a(27034, 4094253802329197276L));
                                                v32 /* !! */  = (CallSite)i6.a(18045, 5322062250301154668L);
                                            }
                                            var23_6 /* !! */  = (int)(v31 /* !! */  - v32 /* !! */ );
                                            if (var5_5) continue;
                                        }
                                        var23_6 /* !! */  = hi.a("G", (int)i6.a(29900, 1791805043743938055L), (int)i6.a(31017, 272474518675315458L), (long)834203424483934088L) + i6.a(384, 5882945379695436116L) - i6.a(17780, 548234768430327445L) ^ i6.a(22131, 5290761416517940652L);
                                        if (var5_5) continue;
                                    }
                                    var23_6 /* !! */  = i6.a(16236, 6691544066289867928L) - i6.a(3533, 5234386117176274892L) - i6.a(32632, 2927709003565686729L);
                                    if (var5_5) continue;
lbl483:
                                    // 2 sources

                                    v6 /* !! */  = (CallSite)((hi.a("G", (int)(i6.a(11782, 7517680714041691183L) ^ i6.a(6447, 4491198740473985568L)), (int)i6.a(24458, 8577843977178971958L), (long)834203424483934088L) ^ i6.a(12986, 1535319876625174917L)) + i6.a(32377, 4432316323339525140L) - i6.a(31076, 3727636942716492384L));
lbl484:
                                    // 2 sources

                                    var23_6 /* !! */  = (int)v6 /* !! */ ;
                                    if (var5_5) continue;
lbl486:
                                    // 2 sources

                                    var23_6 /* !! */  = i6.a(21588, 6880312211795015324L) - i6.a(5707, 3769471956017231009L) - i6.a(32717, 2135936792211479962L);
                                    if (var5_5) continue;
                                }
                                var23_6 /* !! */  = (hi.a("G", (int)(i6.a(25964, 5916145895944636123L) ^ i6.a(8944, 6116892185832915266L)), (int)i6.a(29908, 3657910220812572402L), (long)834203424483934088L) ^ i6.a(3784, 8486334231414484250L)) + i6.a(26245, 3314045888163365932L) - i6.a(9768, 8645555909781947576L);
                                if (var5_5) continue;
lbl491:
                                // 2 sources

                                v7 /* !! */  = (CallSite)(i6.a(20064, 2289292053625269591L) * i6.a(1068, 654442156445345430L) - i6.a(17695, 1102354317469214404L));
lbl492:
                                // 2 sources

                                var23_6 /* !! */  = (int)v7 /* !! */ ;
                                if (var5_5) continue;
lbl494:
                                // 2 sources

                                var23_6 /* !! */  = i6.a(18304, 3587882113330570739L) * i6.a(9713, 6152326105256265014L) + i6.a(13251, 7173994535754436887L) + i6.a(25168, 6634057128606286051L);
                                if (var5_5) continue;
                            }
                            var23_6 /* !! */  = i6.a(16023, 765984993746263454L) * i6.a(30104, 5111252172185687692L) - i6.a(9418, 2990455365618206417L);
                            if (var5_5) continue;
lbl499:
                            // 2 sources

                            v8 /* !! */  = (CallSite)((i6.a(24964, 5333906575750873900L) + i6.a(14428, 896526132201528077L) - i6.a(22892, 9111236882253577166L)) / i6.a(12386, 9203611559979389776L) ^ i6.a(27128, 854268372444891845L));
lbl500:
                            // 2 sources

                            var23_6 /* !! */  = (int)v8 /* !! */ ;
                            if (var5_5) continue;
lbl502:
                            // 2 sources

                            var23_6 /* !! */  = hi.a("G", (int)(i6.a(27072, 4233266519746234703L) ^ i6.a(24756, 7773493258735534134L)), (int)i6.a(10848, 7491701785312266506L), (long)834203424483934088L) * i6.a(30863, 2555843435761097553L) ^ i6.a(19182, 5408310418303609224L);
                            if (var5_5) continue;
                        }
                        var23_6 /* !! */  = (i6.a(15174, 493983309937449446L) + i6.a(10434, 156042179334506599L) - i6.a(26832, 8161622484477561725L)) / i6.a(22404, 7629416812521747578L) ^ i6.a(24146, 7161496575740410992L);
                    }
                }
                while (true) {
                    switch (var23_6 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -629615161: 
                    }
                    hi.a("G", (long)672840781314038705L);
                    var23_6 /* !! */  = i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)i6.a(20135, 8820798319401495947L), (int)i6.a(1257, 83849709786080840L)) ^ i6.a(23443, 5582108569381239014L) ^ i6.a(2638, 1140629666286676111L) ^ i6.a(8571, 3704908045337199533L);
                }
            }
            while (true) {
                block170: {
                    block169: {
                        switch (var23_6 /* !! */ ) {
                            default: {
                                var22_22 = new ih((float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var16_16, (long)1031610004723161893L), (long)906597334513960415L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var16_16, (long)1031610004723161893L), (long)1092110395291557528L), (float)(hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var16_16, (long)1197677846395598513L), (long)889595511813135488L) - hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var16_16, (long)1031610004723161893L), (long)906597334513960415L)), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var16_16, (long)1031610004723161893L), (long)665954777623212870L));
                                v33 = new Object[2];
                                v33[1] = i6.a(19760, 7641023867043671535L);
                                v33[0] = hi.a("j", (long)882827338724254838L);
                                v34 = new Object[6];
                                v34[5] = Float.valueOf(var4_4);
                                v34[4] = var21_21 /* !! */ ;
                                v34[3] = var20_20 /* !! */ ;
                                v34[2] = var22_22;
                                v34[1] = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1130886441489985965L), (Object)v33, (long)552889054143910312L);
                                v34[0] = var1_1;
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)815581130301596177L), (Object)v34, (long)1023361839016354468L);
                                if (var5_5) break block169;
                                ** GOTO lbl239
                            }
                            case 997832585: {
                                ** continue;
                            }
                            case 997832586: {
                                ** continue;
                            }
                            case 997832584: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1318739863688053612L), (int)((int)hi.a("j", (long)817515226557096230L)), (int)((int)hi.a("j", (long)660311983048283728L)), (long)965929651793311435L);
                                hi.a("\u00a5", (Object)var1_1, (Object)hi.a("\u00e9", (Object)this, (long)1318739863688053612L), (long)1320594276746924013L);
                                if (var5_5) break block170;
                                ** GOTO lbl-1000
                            }
                            case 997832589: lbl-1000:
                            // 2 sources

                            {
                                hi.a("\u00a5", (Object)var1_1, (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)399044337443078029L), (long)800909747388376883L), (int)0, (int)0, (int)hi.a("\u00a5", (Object)var6_7, (long)932549962227715674L), (int)i6.S("WXpn7wn1OpxkZYds", getGuiScaledHeight(), (Window)var6_7), (float)0.0f, (float)1.0f, (float)1.0f, (float)0.0f, (long)811711583575022319L);
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)var1_1, (int)var17_17, (int)var18_18, (float)var4_4, (long)572520461329062390L);
                                return;
                            }
                            case 997832588: 
                        }
                        break;
                    }
                    var23_6 /* !! */  = (i6.a(11583, 7442734004584582728L) ^ i6.a(23575, 8618312352360004768L) ^ i6.a(744, 4501170258254635187L)) + i6.a(7332, 4480551200145522339L);
                    if (var5_5) continue;
lbl554:
                    // 2 sources

                    var23_6 /* !! */  = (i6.a(7714, 4602909512944368680L) ^ i6.a(21295, 432460573832967098L) ^ i6.a(17929, 3657996881211123039L)) + i6.a(18000, 4789818404624065638L);
                    if (var5_5) continue;
lbl556:
                    // 2 sources

                    var23_6 /* !! */  = i6.a(32613, 864785109717834964L) - i6.a(19911, 5995820534836162396L) + i6.a(20775, 4379490587725525905L) + i6.a(1730, 6035748831557919758L) + i6.a(8998, 8089266827225923664L);
lbl557:
                    // 2 sources

                    if (var5_5) continue;
lbl558:
                    // 2 sources

                    var23_6 /* !! */  = i6.a(31013, 7094318251769584586L) ^ i6.a(14882, 6185896137742129435L) ^ i6.a(21738, 8350810828480083713L);
                    if (var5_5) continue;
                }
                var23_6 /* !! */  = i6.a(16772, 1058419231849538494L) - i6.a(23497, 11769421725497782L) + i6.a(21060, 943854696244244884L) + i6.a(11283, 7393479466578054794L) + i6.a(27479, 6288346556213086216L);
            }
        }
        hi.a("G", (long)1201432730590593927L);
        i6.S("WXpn7wn1OpxkZYds", values());
    }

    public void onClose() {
        i6.S("WXpn7wn1OpxkZYds", m());
        super.onClose();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean mouseReleased(MouseButtonEvent var1_1) {
        block16: {
            block14: {
                block15: {
                    var2_2 = Dl.S();
                    var4_3 = (i6.a(16744, 1000422749605454511L) ^ i6.a(7245, 7214737564712255309L)) + i6.a(30709, 3504257952583242943L);
                    if (!var2_2) {
lbl5:
                        // 2 sources

                        while (true) {
                            hi.a("G", (long)357835453833397902L);
lbl8:
                            // 2 sources

                            while (true) {
                                var3_4 = hi.a("G", (Object)var1_1, (long)387410669818340308L);
                                v0 = new Object[6];
                                v0[5] = (boolean)i6.S("WXpn7wn1OpxkZYds", c(), (v_)hi.a("\u00e9", (Object)this, (long)790809536263885830L));
                                v0[4] = hi.a("\u00e9", (Object)this, (long)815581130301596177L);
                                v0[3] = hi.a("\u00e9", (Object)this, (long)1140477812933766157L);
                                v0[2] = hi.a("\u00e9", (Object)this, (long)1043582042434162575L);
                                v0[1] = hi.a("\u00e9", (Object)this, (long)581180575341734145L);
                                v0[0] = var3_4;
                                v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)674994765408234880L), (Object)v0, (long)683148557619645559L);
                                if (!var2_2) break block14;
                                if (v1 /* !! */  == false) break block15;
                                break block16;
                                break;
                            }
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                            return true;
                        }
lbl24:
                        // 1 sources

                        return super.mouseReleased((MouseButtonEvent)var3_4);
                    }
                    switch (var4_3) {
                        case 1252643810: {
                            ** continue;
                        }
                        ** default:
lbl30:
                        // 1 sources

                        ** continue;
                    }
lbl31:
                    // 2 sources

                    while (true) {
                        v2 = var4_3;
                        if (var2_2) {
                            switch (v2) {
                                default: {
                                    ** continue;
                                }
                                case -353028456: {
                                    ** continue;
                                }
                                case -353028455: 
                            }
                            i6.S("WXpn7wn1OpxkZYds", values());
                            hi.a("G", (long)859258361668446808L);
                            v2 = true;
                        }
                        return v2;
                    }
                }
                v1 /* !! */  = (CallSite)(i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)(i6.a(5285, 2800908906632853502L) * i6.a(27772, 1358055641870061121L)), (int)i6.a(12413, 6996557791091757598L)), (int)i6.a(27299, 2349638598590220432L)) - i6.a(9239, 8380924563643795189L) ^ i6.a(22877, 6947283701613361690L));
            }
            var4_3 = (boolean)v1 /* !! */ ;
            if (var2_2) ** GOTO lbl31
        }
        var4_3 = (i6.a(23128, 1134850668535937467L) + i6.a(23992, 61511321949929161L)) * i6.a(11605, 7714630163986812741L) * i6.a(7822, 1296681931615976899L) + i6.a(5641, 8634052536223642953L) ^ i6.a(15089, 1590075150150474168L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean keyPressed(KeyEvent var1_1) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        block14: {
                            block15: {
                                var2_2 = Dl.S();
                                var3_3 /* !! */  = i6.a(21743, 5654662197452404733L) * i6.a(15059, 1204189921816942828L) * i6.a(8256, 4875829687487005533L) + i6.a(21302, 400026228224159890L) + i6.a(19041, 4706361983546517929L);
                                if (!var2_2) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 = new Object[6];
                                        v0[5] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
                                        v0[4] = hi.a("\u00e9", (Object)this, (long)815581130301596177L);
                                        v0[3] = hi.a("\u00e9", (Object)this, (long)1140477812933766157L);
                                        v0[2] = hi.a("\u00e9", (Object)this, (long)1043582042434162575L);
                                        v0[1] = hi.a("\u00e9", (Object)this, (long)581180575341734145L);
                                        v0[0] = var1_1;
                                        v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)674994765408234880L), (Object)v0, (long)637175081949782650L);
                                        if (!var2_2) break block14;
                                        if (v1 == false) break block15;
                                        break block16;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    while (true) {
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                                        return true;
                                    }
lbl19:
                                    // 1 sources

                                    while (true) {
                                        v2 /* !! */  = i6.S("WXpn7wn1OpxkZYds", key(), (KeyEvent)var1_1);
                                        v3 = i6.a(6488, 4624913448510601637L);
                                        if (!var2_2) break block17;
                                        if (v2 /* !! */  != v3) break block18;
                                        break block19;
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        hi.a("\u00a5", (Object)this, (long)568160980884901890L);
                                        return true;
                                    }
lbl28:
                                    // 1 sources

                                    return super.keyPressed(var1_1);
                                }
lbl30:
                                // 6 sources

                                while (true) {
                                    switch (var3_3 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case -302776349: {
                                            ** continue;
                                        }
                                        case -302776346: {
                                            ** continue;
                                        }
                                        case -302776347: {
                                            ** continue;
                                        }
                                        case -302776350: {
                                            ** continue;
                                        }
                                        case -302776348: 
                                    }
                                    throw null;
                                }
                            }
                            v1 = hi.a("G", (int)(i6.a(16827, 2492675005944259123L) * i6.a(26551, 6894751163383531374L)), (int)i6.a(25575, 5166407654609077118L), (long)834203424483934088L) - i6.a(15979, 7062391491733626176L) - i6.a(22634, 575194566308690477L);
                        }
                        var3_3 /* !! */  = (int)v1;
                        if (var2_2) ** GOTO lbl30
                    }
                    var3_3 /* !! */  = (hi.a("G", (int)i6.a(4950, 1540172226032644300L), (int)i6.a(21672, 245098646688986726L), (long)834203424483934088L) + i6.a(25425, 5515208861173432475L) ^ i6.a(21193, 553026482363494745L)) + i6.a(25361, 4710218458155106402L);
                    if (var2_2) ** GOTO lbl30
                }
                v2 /* !! */  = (CallSite)(i6.a(14573, 948713671693113995L) / i6.a(25327, 7925435277340492104L) + i6.a(8416, 6326928207299805826L) ^ i6.a(24890, 7897655943263273453L));
                v3 = i6.a(13262, 8946031806903522154L);
            }
            var3_3 /* !! */  = (int)(v2 /* !! */  + v3);
            if (var2_2) ** GOTO lbl30
        }
        var3_3 /* !! */  = i6.a(24442, 709968038260211109L) * i6.a(17036, 7709915115239334446L) ^ i6.a(16018, 8513303845070347594L);
        ** while (true)
    }

    public boolean isPauseScreen() {
        return false;
    }

    public dd F(Object[] objectArray) {
        return hi.a("\u00e9", (Object)((Object)this), (long)399044337443078029L);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)21, i6.class);
        Hidden0.special_clinit_21_220(i6.class);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseClicked(MouseButtonEvent var1_1, boolean var2_2) {
        block62: {
            block60: {
                block61: {
                    block59: {
                        block58: {
                            var3_3 = Dl.S();
                            var11_4 /* !! */  = i6.a(15243, 8856295922395519318L) * i6.a(4762, 3819441627561439758L) - i6.a(18335, 5584698694020327190L);
                            if (!var3_3) ** GOTO lbl-1000
                            switch (var11_4 /* !! */ ) {
                                default: lbl-1000:
                                // 2 sources

                                {
                                    var4_5 = i6.S("WXpn7wn1OpxkZYds", z(net.minecraft.client.input.MouseButtonEvent ), (MouseButtonEvent)var1_1);
                                    var5_6 = i6.S("WXpn7wn1OpxkZYds", x(), (MouseButtonEvent)var4_5);
                                    var7_7 = hi.a("\u00a5", (Object)var4_5, (long)1045026150751632794L);
                                    v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1304202693631103201L);
                                    if (!var3_3) ** GOTO lbl224
                                    if (v0 /* !! */  == false) ** GOTO lbl223
                                    ** GOTO lbl226
                                }
                                case 924561479: {
                                    throw null;
                                }
                            }
lbl15:
                            // 2 sources

                            while (true) {
                                block64: {
                                    block63: {
                                        var9_8 /* !! */  = v1 /* !! */ ;
                                        v2 = var9_8 /* !! */ ;
                                        if (!var3_3) break block63;
                                        if (v2 != false) break block64;
                                        v2 = var11_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(i6.a(11900, 8183684128437309138L) / i6.a(8071, 5822306901834186070L)), (int)i6.a(29055, 5971499478976877236L), (long)834203424483934088L) + i6.a(32405, 6086882418566356401L)), (int)i6.a(2230, 3832747839288945281L), (long)834203424483934088L) ^ i6.a(177, 1399808246489784941L);
                                    }
                                    if (var3_3) break block58;
                                }
                                var11_4 /* !! */  = (hi.a("G", (int)(i6.a(520, 7436291338648723664L) + i6.a(6239, 1120530620950919896L)), (int)i6.a(26013, 8985444526630356542L), (long)834203424483934088L) ^ i6.a(10361, 697872375631907377L) ^ i6.a(23513, 3514777854576851039L)) - i6.a(10602, 178710306305870386L);
                                if (var3_3) break block59;
                                ** GOTO lbl144
                                break;
                            }
lbl27:
                            // 2 sources

                            while (true) {
                                block66: {
                                    block65: {
                                        v3 = new Object[8];
                                        v3[7] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
                                        v3[6] = hi.a("\u00e9", (Object)this, (long)815581130301596177L);
                                        v3[5] = hi.a("\u00e9", (Object)this, (long)860555669846755118L);
                                        v3[4] = hi.a("\u00e9", (Object)this, (long)1140477812933766157L);
                                        v3[3] = hi.a("\u00e9", (Object)this, (long)1043582042434162575L);
                                        v3[2] = hi.a("\u00e9", (Object)this, (long)581180575341734145L);
                                        v3[1] = var2_2;
                                        v3[0] = var4_5;
                                        v4 /* !! */  = var10_10 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)674994765408234880L), (Object)v3, (long)981366307726286852L);
                                        if (!var3_3) break block65;
                                        if (v4 /* !! */  != false) break block66;
                                        v4 /* !! */  = (CallSite)(i6.a(25249, 5310013569134477543L) - i6.a(15805, 8935325155672170241L) + i6.a(31534, 6620844106361691103L));
                                    }
                                    var11_4 /* !! */  = (int)v4 /* !! */ ;
                                    if (var3_3) break block60;
                                }
                                var11_4 /* !! */  = (int)(hi.a("G", (int)((i6.a(18073, 886577098257818965L) + i6.a(7793, 6526496387387702979L)) * i6.a(18652, 662846956265663057L)), (int)i6.a(1096, 3857832473912386691L), (long)834203424483934088L) * i6.a(24097, 2674036526205533196L) + i6.a(11814, 1760324356583329489L));
                                if (var3_3) break block60;
                                ** GOTO lbl289
                                break;
                            }
lbl48:
                            // 2 sources

                            while (true) {
                                v5 /* !! */  = var10_10;
                                if (!var3_3) ** GOTO lbl292
                                if (v5 /* !! */  != false) ** GOTO lbl291
                                ** GOTO lbl294
                                break;
                            }
lbl53:
                            // 2 sources

                            while (true) {
                                hi.a("G", (float)1.0f, (float)0.0f, (float)10.0f, (float)0.0f, (long)1261564879016344598L);
                                hi.a("G", (long)819552573278442726L);
                                return v6;
                            }
                        }
lbl60:
                        // 11 sources

                        block48: while (true) {
                            switch (var11_4 /* !! */ ) {
                                default: {
                                    if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)879762376403862170L) == null) ** GOTO lbl228
                                    ** GOTO lbl230
                                }
                                case -846221071: {
                                    v7 = new Object[2];
                                    v7[1] = var2_2;
                                    v7[0] = var4_5;
                                    v8 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043582042434162575L), (Object)v7, (long)497710018752212573L);
                                    if (!var3_3) ** GOTO lbl233
                                    if (v8 /* !! */  == false) ** GOTO lbl232
                                    ** GOTO lbl235
                                }
                                case -846221063: {
                                    i6.S("WXpn7wn1OpxkZYds", k(), (Xy)hi.a("\u00e9", (Object)this, (long)1148606078306715269L));
                                    return true;
                                }
                                case -846221067: {
                                    if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)932830801827082701L) == null) ** GOTO lbl237
                                    ** GOTO lbl239
                                }
                                case -846221062: {
                                    v9 /* !! */  = i6.S("WXpn7wn1OpxkZYds", c(), (v_)hi.a("\u00e9", (Object)this, (long)790809536263885830L));
                                    if (!var3_3) ** GOTO lbl242
                                    if (v9 /* !! */  == false) ** GOTO lbl241
                                    ** GOTO lbl244
                                }
                                case -846221069: {
                                    v10 = new Object[2];
                                    v10[1] = var2_2;
                                    v10[0] = var4_5;
                                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)815581130301596177L), (Object)v10, (long)1307041151750706845L);
                                    var11_4 /* !! */  = (i6.a(23244, 3140793273825163583L) / i6.a(31440, 3259974667572140646L) ^ i6.a(4414, 3757762657178661390L)) * i6.a(12643, 1634290076772930027L) / i6.a(22404, 7629416812521747578L) + i6.a(5013, 8461664347544990093L);
                                    if (!var3_3) {
                                        ** break;
                                    }
                                    ** GOTO lbl158
                                }
                                case -846221068: {
                                    v11 = new Object[2];
                                    v11[1] = var2_2;
                                    v11[0] = var4_5;
                                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043582042434162575L), (Object)v11, (long)497710018752212573L);
                                    if (var3_3) ** GOTO lbl142
                                    ** GOTO lbl15
                                }
                                case -846221065: {
                                    if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)581180575341734145L), (Object)new Object[0], (long)599891721978873359L) == null) ** GOTO lbl144
                                    ** GOTO lbl146
                                }
                                case -846221074: {
                                    v12 = new Object[8];
                                    v12[7] = (boolean)i6.S("WXpn7wn1OpxkZYds", c(), (v_)hi.a("\u00e9", (Object)this, (long)790809536263885830L));
                                    v12[6] = hi.a("\u00e9", (Object)this, (long)815581130301596177L);
                                    v12[5] = hi.a("\u00e9", (Object)this, (long)860555669846755118L);
                                    v12[4] = hi.a("\u00e9", (Object)this, (long)1140477812933766157L);
                                    v12[3] = hi.a("\u00e9", (Object)this, (long)1043582042434162575L);
                                    v12[2] = hi.a("\u00e9", (Object)this, (long)581180575341734145L);
                                    v12[1] = var2_2;
                                    v12[0] = var4_5;
                                    v13 /* !! */  = (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)674994765408234880L), (Object)v12, (long)981366307726286852L);
                                    if (!var3_3) ** GOTO lbl149
                                    if (v13 /* !! */  != 0) ** GOTO lbl148
                                    ** GOTO lbl150
                                }
                                case -846221061: {
                                    v14 /* !! */  = super.mouseClicked((MouseButtonEvent)var4_5, var2_2);
                                    if (!var3_3) ** GOTO lbl153
                                    if (!v14 /* !! */ ) ** GOTO lbl152
                                    ** GOTO lbl155
                                }
                                case -846221075: {
                                    v1 /* !! */  = true;
                                    var11_4 /* !! */  = (int)(i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)(i6.a(9685, 2070012163758655307L) / i6.a(4573, 194352531328316122L)), (int)i6.a(25046, 3802202400381879030L)) / i6.a(9278, 2457938702071039227L) - i6.a(3765, 6280826803127299582L) + i6.a(1541, 8772882860368569344L));
                                    if (var3_3) ** GOTO lbl158
                                    ** GOTO lbl157
                                }
                                case -846221073: {
                                    v1 /* !! */  = false;
                                    if (!var3_3) {
                                        return v1 /* !! */ ;
                                    }
                                    ** GOTO lbl157
                                }
                                case -846221072: {
                                    var9_9 = hi.a("G", (int)hi.a("G", (long)938841799815187197L), (int)hi.a("G", (long)1217681287799928622L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)860555669846755118L), (Object)new Object[0], (long)1172873998299390751L), (long)853719768120194366L);
                                    v15 /* !! */  = i6.S("WXpn7wn1OpxkZYds", X(double double ), (ih)hi.a("\u00a5", (Object)var9_9, (long)455665241571922040L), (double)var5_6, (double)var7_7);
                                    if (!var3_3) ** GOTO lbl166
                                    if (v15 /* !! */  != false) ** GOTO lbl165
                                    ** GOTO lbl168
                                }
                                case -846221066: {
                                    hi.a("G", (long)1186314902226853278L);
                                    return true;
                                }
lbl142:
                                // 2 sources

                                var11_4 /* !! */  = (i6.a(8672, 2005797247076664166L) / i6.a(25659, 5549402291985106909L) ^ i6.a(25449, 498939126759931969L)) * i6.a(894, 5603202238232469747L) / i6.a(22404, 7629416812521747578L) + i6.a(9372, 5568376453669488187L);
                                ** GOTO lbl158
lbl144:
                                // 2 sources

                                var11_4 /* !! */  = i6.a(3598, 5650570912916450382L) * i6.a(17464, 2616530321043940979L) * i6.a(9738, 5531387262543529618L) ^ i6.a(7761, 1039324082051661561L) ^ i6.a(11964, 3442613334096121399L);
                                if (var3_3) continue block48;
lbl146:
                                // 2 sources

                                var11_4 /* !! */  = (int)(hi.a("G", (int)(i6.a(23275, 1897381908898773334L) + i6.a(4648, 3360382975335707110L) - i6.a(21207, 7874131276170359061L) ^ i6.a(4721, 2378665471550894147L)), (int)i6.a(18547, 709347793321191963L), (long)834203424483934088L) - i6.a(6970, 5270059975936358428L));
                                if (var3_3) continue block48;
lbl148:
                                // 2 sources

                                v13 /* !! */  = var11_4 /* !! */  = i6.a(31945, 3940692740225097388L) * i6.a(5996, 7428298218235704593L) + i6.a(19680, 8148422727067496029L);
lbl149:
                                // 2 sources

                                if (var3_3) continue block48;
lbl150:
                                // 2 sources

                                var11_4 /* !! */  = (hi.a("G", (int)i6.a(23182, 7373327566311225386L), (int)i6.a(21602, 1327079286664787596L), (long)834203424483934088L) - i6.a(10668, 18472090114886632L)) / 5 ^ i6.a(26875, 91405303971760237L);
                                if (var3_3) continue block48;
lbl152:
                                // 2 sources

                                v14 /* !! */  = hi.a("G", (int)(hi.a("G", (int)hi.a("G", (int)i6.a(23536, 4457089969490393486L), (int)i6.a(25295, 4715667789375783412L), (long)834203424483934088L), (int)i6.a(2227, 7800500744413391444L), (long)834203424483934088L) - i6.a(4555, 1691092426704335617L)), (int)i6.a(25452, 6916591966799774684L), (long)834203424483934088L) - i6.a(29113, 5804196210647978831L);
lbl153:
                                // 2 sources

                                var11_4 /* !! */  = (int)v14 /* !! */ ;
                                if (var3_3) continue block48;
lbl155:
                                // 2 sources

                                var11_4 /* !! */  = i6.a(22446, 3762057250177676741L) * i6.a(19676, 1605447685874806284L) + i6.a(26845, 9145559387903543883L);
                                continue block48;
lbl157:
                                // 2 sources

                                var11_4 /* !! */  = (int)(hi.a("G", (int)(i6.a(1776, 8050562327241893169L) / i6.a(4573, 194352531328316122L)), (int)i6.a(3044, 2671280938480708372L), (long)834203424483934088L) / i6.a(9278, 2457938702071039227L) - i6.a(31156, 1381539231739960177L) + i6.a(15460, 9109436643416383041L));
lbl158:
                                // 4 sources

                                switch (var11_4 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -428802112: {
                                        return v1 /* !! */ ;
                                    }
                                    case -428802111: 
                                }
                                return false;
lbl165:
                                // 1 sources

                                v15 /* !! */  = (CallSite)(((i6.a(12201, 7238749379156282605L) + i6.a(8789, 791653523810058562L)) * i6.a(17557, 8407539473077167112L) ^ i6.a(4501, 9080257894237188678L)) * i6.a(13912, 8373935818316223685L) - i6.a(5116, 5827787575333466988L));
lbl166:
                                // 2 sources

                                var11_4 /* !! */  = (int)v15 /* !! */ ;
                                if (var3_3) break block61;
lbl168:
                                // 2 sources

                                var11_4 /* !! */  = (i6.a(27811, 49448303450869449L) * i6.a(14243, 1689222414625575939L) ^ i6.a(11956, 1555184214228274382L)) - i6.a(22798, 3657970085733628567L);
                                if (var3_3) break block61;
                                ** GOTO lbl246
                                case -846221070: 
                            }
                            return super.mouseClicked((MouseButtonEvent)var4_5, var2_2);
                        }
                    }
                    while (true) {
                        switch (var11_4 /* !! */ ) {
                            default: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                                return true;
                            }
                            case -916811654: 
                        }
                        hi.a("G", (long)542784839547465897L);
                        var11_4 /* !! */  = (int)(hi.a("G", (int)(i6.a(23649, 1881509122689957493L) + i6.a(10876, 3138832273667491844L)), (int)i6.a(9690, 4090518388832536365L), (long)834203424483934088L) - i6.a(7115, 6242574541106198868L));
                        if (var3_3 == false) return true;
                    }
                }
                block50: while (true) {
                    switch (var11_4 /* !! */ ) {
                        default: {
                            v16 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)670352231055402846L), (long)789438897355831922L)), (long)1000026253634408124L);
                            if (!var3_3) ** GOTO lbl247
                            if (v16 /* !! */  == false) ** GOTO lbl246
                            ** GOTO lbl249
                        }
                        case -1255821434: {
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)553658746464011754L), (long)907159218940561824L), null, (long)413629821670745698L);
                            if (!var3_3) {
                                return true;
                            }
                            ** GOTO lbl251
                        }
                        case -1255821432: {
                            v17 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)790809536263885830L), (long)1042869732176404860L);
                            if (!var3_3) ** GOTO lbl254
                            if (v17 /* !! */  != false) ** GOTO lbl253
                            ** GOTO lbl256
                        }
                        case -1255821431: {
                            v18 = new Object[2];
                            v18[1] = (double)var7_7;
                            v18[0] = (double)var5_6;
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1140477812933766157L), (Object)v18, (long)374403568135649643L);
                            if (var3_3) ** GOTO lbl258
                            ** GOTO lbl27
                        }
                        case -1255821437: {
                            ** continue;
                        }
                        case -1255821435: {
                            i6.S("WXpn7wn1OpxkZYds", l(float ), (float)10.0f);
                            hi.a("G", (long)838624670787528729L);
                            var11_4 /* !! */  = hi.a("G", (int)((i6.a(31749, 204540911461162234L) + i6.a(29598, 2150875070693331222L)) * i6.a(22168, 4464250825577395562L)), (int)i6.a(24136, 1790934957155318884L), (long)834203424483934088L) ^ i6.a(23367, 6956712678582253801L);
                            if (var3_3) continue block50;
lbl223:
                            // 2 sources

                            v0 /* !! */  = (CallSite)((i6.a(29426, 777198690609779155L) ^ i6.a(23837, 495465875367034757L)) - i6.a(16176, 839190065376271557L) - i6.a(7633, 4862427633759698444L));
lbl224:
                            // 2 sources

                            var11_4 /* !! */  = (int)v0 /* !! */ ;
                            if (var3_3) ** GOTO lbl60
lbl226:
                            // 2 sources

                            var11_4 /* !! */  = (i6.a(31799, 7095940550674964412L) ^ i6.a(28335, 3618696896186207618L)) + i6.a(1783, 8243355074006164755L);
                            if (var3_3) ** GOTO lbl60
lbl228:
                            // 2 sources

                            var11_4 /* !! */  = i6.a(28899, 1406779920710226551L) + i6.a(21037, 2990585032104374623L) - i6.a(18120, 1319019095515096313L);
                            if (var3_3) ** GOTO lbl60
lbl230:
                            // 2 sources

                            var11_4 /* !! */  = i6.a(2118, 315966555084794498L) * i6.a(12257, 3198742062695353469L) + i6.a(9538, 5643861108462487458L);
                            if (var3_3) ** GOTO lbl60
lbl232:
                            // 2 sources

                            v8 /* !! */  = (CallSite)(i6.a(19719, 2088964115233009181L) + i6.a(2850, 3802387856223611085L) - i6.a(1343, 4779599977525815063L));
lbl233:
                            // 2 sources

                            var11_4 /* !! */  = (int)v8 /* !! */ ;
                            if (var3_3) ** GOTO lbl60
lbl235:
                            // 2 sources

                            var11_4 /* !! */  = i6.a(29859, 4619290137133078525L) - i6.a(22730, 3288711627477514802L) + i6.a(15626, 2831359676143607438L);
                            if (var3_3) ** GOTO lbl60
lbl237:
                            // 2 sources

                            var11_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(i6.a(13251, 1439948904946077777L) / i6.a(8071, 5822306901834186070L)), (int)i6.a(25112, 2653498856260649005L), (long)834203424483934088L) + i6.a(19523, 3005335903889551299L)), (int)i6.a(12892, 6240313705625391825L), (long)834203424483934088L) ^ i6.a(1280, 6115077687147275764L);
                            if (var3_3) ** GOTO lbl60
lbl239:
                            // 2 sources

                            var11_4 /* !! */  = (int)(hi.a("G", (int)(i6.a(29911, 5358853596325074595L) - i6.a(17778, 4747663425607591623L)), (int)i6.a(8894, 8636961886406541744L), (long)834203424483934088L) + i6.a(27185, 881507309797591165L) - i6.a(28030, 1608152265827765644L) - i6.a(26635, 6029780930098219924L));
                            if (var3_3) ** GOTO lbl60
lbl241:
                            // 2 sources

                            v9 /* !! */  = (CallSite)(i6.a(25957, 128879570740299577L) / i6.a(4573, 194352531328316122L) + i6.a(608, 3982804759960592426L) + i6.a(7822, 2199563195877899714L));
lbl242:
                            // 2 sources

                            var11_4 /* !! */  = (int)v9 /* !! */ ;
                            if (var3_3) ** GOTO lbl60
lbl244:
                            // 2 sources

                            var11_4 /* !! */  = i6.a(26947, 8078684016002911025L) ^ i6.a(5563, 6557423649966372497L) ^ i6.a(17020, 3228629716767040240L);
                            ** continue;
                        }
lbl246:
                        // 2 sources

                        v16 /* !! */  = (CallSite)(i6.a(6755, 2279458784710605275L) * i6.a(15364, 8543476980877827810L) ^ i6.a(6050, 4788726782499501531L));
lbl247:
                        // 2 sources

                        var11_4 /* !! */  = (int)v16 /* !! */ ;
                        if (var3_3) continue block50;
lbl249:
                        // 2 sources

                        var11_4 /* !! */  = i6.a(13197, 4776356104514343030L) - i6.a(4100, 5704159122275676948L) ^ i6.a(1525, 6738367473895286674L);
                        if (var3_3) continue block50;
lbl251:
                        // 2 sources

                        var11_4 /* !! */  = i6.a(27310, 6342883594785245715L) * i6.a(29616, 8033694848458871560L) ^ i6.a(12968, 8664896802695614469L);
                        if (var3_3) continue block50;
lbl253:
                        // 2 sources

                        v17 /* !! */  = (CallSite)(hi.a("G", (int)(i6.a(23768, 1828427633115037531L) * i6.a(11519, 1013804785754541734L)), (int)i6.a(9132, 7287825670317048692L), (long)834203424483934088L) / 3 ^ i6.a(14562, 3931604727653833369L) ^ i6.a(13034, 6534551559492309243L));
lbl254:
                        // 2 sources

                        var11_4 /* !! */  = (int)v17 /* !! */ ;
                        if (var3_3) continue block50;
lbl256:
                        // 2 sources

                        var11_4 /* !! */  = hi.a("G", (int)(i6.a(30795, 361155044848393131L) / i6.a(9278, 2457938702071039227L)), (int)i6.a(18509, 1821046656935848751L), (long)834203424483934088L) + i6.a(8929, 4134693179671969935L) ^ i6.a(14299, 2680577052900463629L) ^ i6.a(23932, 3674146259313917392L);
                        if (var3_3) continue block50;
lbl258:
                        // 2 sources

                        var11_4 /* !! */  = hi.a("G", (int)(i6.a(15740, 5107216153464872693L) * i6.a(14968, 249748139756427469L)), (int)i6.a(1104, 1317411626064324280L), (long)834203424483934088L) / 3 ^ i6.a(6833, 1686026427771435247L) ^ i6.a(20649, 1326341395790590917L);
                        continue block50;
                        case -1255821433: 
                    }
                    break;
                }
                return true;
            }
            block51: while (true) {
                block69: {
                    block67: {
                        block68: {
                            switch (var11_4 /* !! */ ) {
                                default: {
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1148606078306715269L), (long)1118264225753943113L);
                                    if (var3_3) break;
                                    ** GOTO lbl48
                                }
                                case 1886117451: {
                                    ** continue;
                                }
                                case 1886117453: {
                                    v19 = super.mouseClicked((MouseButtonEvent)var4_5, var2_2);
                                    if (!var3_3) break block67;
                                    if (v19 == 0) break block68;
                                    break block69;
                                }
                                case 1886117452: {
                                    v6 = true;
                                    var11_4 /* !! */  = i6.S("WXpn7wn1OpxkZYds", max(int int ), (int)(i6.a(24607, 6527918336808140981L) * i6.a(28009, 4571749614534512078L)), (int)i6.a(13171, 5437944315354878114L)) ^ i6.a(3248, 1600457443350884106L) ^ i6.a(31276, 5511985690554489008L);
                                    if (!var3_3) {
                                        break block51;
                                    }
                                    break block62;
                                }
                                case 1886117456: {
                                    v6 = false;
                                    if (var3_3) break block51;
                                    ** GOTO lbl53
                                }
                                case 1886117454: {
                                    throw null;
                                }
                            }
lbl289:
                            // 2 sources

                            var11_4 /* !! */  = i6.a(15192, 4201303966401108036L) - i6.a(28805, 6856561566037300144L) + i6.a(30397, 2277308224565466569L);
                            if (var3_3) continue;
lbl291:
                            // 2 sources

                            v5 /* !! */  = (CallSite)(i6.a(24034, 4955951080418869026L) * i6.a(28979, 2566141680945812338L) - i6.a(236, 4862000900716437571L));
lbl292:
                            // 2 sources

                            var11_4 /* !! */  = (int)v5 /* !! */ ;
                            if (var3_3) continue;
lbl294:
                            // 2 sources

                            var11_4 /* !! */  = (int)(hi.a("G", (int)((i6.a(26270, 8255429787980121097L) + i6.a(6313, 2681740364251183956L)) * i6.a(31980, 3955315812783251109L)), (int)i6.a(16275, 9030813938466331972L), (long)834203424483934088L) - i6.a(25353, 3503018792978104410L));
                            if (var3_3) continue;
                        }
                        v19 = (i6.a(9408, 5079810575317305288L) - i6.a(3334, 9077353443917147921L)) * i6.a(25875, 996173090166884069L) - i6.a(7804, 1848398606292074214L) - i6.a(13508, 8286669398193412041L);
                    }
                    var11_4 /* !! */  = v19;
                    if (var3_3) continue;
                }
                var11_4 /* !! */  = i6.a(449, 8910498755215467390L) * i6.a(15897, 6935516102678158804L) - i6.a(27436, 3518412827752352650L);
            }
            var11_4 /* !! */  = hi.a("G", (int)(i6.a(17189, 638172748434038819L) * i6.a(32124, 4891872213192302515L)), (int)i6.a(22827, 5717706196008303530L), (long)834203424483934088L) ^ i6.a(9332, 6468680381590308046L) ^ i6.a(13416, 5214931112792135446L);
        }
        switch (var11_4 /* !! */ ) {
            case 1107074659: {
                ** continue;
            }
        }
        return v6;
    }

    private static void lambda$drawChrome$4(ni ni2, zU zU2) {
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1031610004723161893L), (long)1210563473410659836L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)ni2, (long)1031610004723161893L), (long)665954777623212870L), (float)13.0f, (Object)hi.a("j", (long)1028544513022896375L), (long)776507817655946365L);
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x4A8B) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 144;
                case 1 -> 15;
                case 2 -> 38;
                case 3 -> 238;
                case 4 -> 142;
                case 5 -> 30;
                case 6 -> 72;
                case 7 -> 123;
                case 8 -> 14;
                case 9 -> 217;
                case 10 -> 229;
                case 11 -> 32;
                case 12 -> 29;
                case 13 -> 58;
                case 14 -> 166;
                case 15 -> 252;
                case 16 -> 26;
                case 17 -> 128;
                case 18 -> 43;
                case 19 -> 193;
                case 20 -> 158;
                case 21 -> 81;
                case 22 -> 218;
                case 23 -> 9;
                case 24 -> 21;
                case 25 -> 178;
                case 26 -> 53;
                case 27 -> 111;
                case 28 -> 104;
                case 29 -> 248;
                case 30 -> 234;
                case 31 -> 102;
                case 32 -> 55;
                case 33 -> 207;
                case 34 -> 174;
                case 35 -> 20;
                case 36 -> 89;
                case 37 -> 73;
                case 38 -> 150;
                case 39 -> 191;
                case 40 -> 199;
                case 41 -> 232;
                case 42 -> 177;
                case 43 -> 16;
                case 44 -> 86;
                case 45 -> 201;
                case 46 -> 210;
                case 47 -> 54;
                case 48 -> 181;
                case 49 -> 175;
                case 50 -> 202;
                case 51 -> 132;
                case 52 -> 10;
                case 53 -> 156;
                case 54 -> 34;
                case 55 -> 200;
                case 56 -> 194;
                case 57 -> 237;
                case 58 -> 51;
                case 59 -> 6;
                case 60 -> 189;
                case 61 -> 170;
                case 62 -> 236;
                case 63 -> 251;
                case 64 -> 226;
                case 65 -> 56;
                case 66 -> 57;
                case 67 -> 66;
                case 68 -> 134;
                case 69 -> 126;
                case 70 -> 231;
                case 71 -> 214;
                case 72 -> 242;
                case 73 -> 163;
                case 74 -> 113;
                case 75 -> 244;
                case 76 -> 63;
                case 77 -> 110;
                case 78 -> 11;
                case 79 -> 253;
                case 80 -> 87;
                case 81 -> 1;
                case 82 -> 216;
                case 83 -> 161;
                case 84 -> 137;
                case 85 -> 45;
                case 86 -> 241;
                case 87 -> 208;
                case 88 -> 187;
                case 89 -> 179;
                case 90 -> 52;
                case 91 -> 203;
                case 92 -> 50;
                case 93 -> 25;
                case 94 -> 119;
                case 95 -> 185;
                case 96 -> 136;
                case 97 -> 74;
                case 98 -> 255;
                case 99 -> 78;
                case 100 -> 97;
                case 101 -> 196;
                case 102 -> 121;
                case 103 -> 250;
                case 104 -> 122;
                case 105 -> 212;
                case 106 -> 130;
                case 107 -> 204;
                case 108 -> 225;
                case 109 -> 221;
                case 110 -> 40;
                case 111 -> 48;
                case 112 -> 91;
                case 113 -> 239;
                case 114 -> 152;
                case 115 -> 127;
                case 116 -> 22;
                case 117 -> 117;
                case 118 -> 169;
                case 119 -> 68;
                case 120 -> 115;
                case 121 -> 160;
                case 122 -> 88;
                case 123 -> 186;
                case 124 -> 112;
                case 125 -> 209;
                case 126 -> 148;
                case 127 -> 47;
                case 128 -> 176;
                case 129 -> 138;
                case 130 -> 76;
                case 131 -> 39;
                case 132 -> 125;
                case 133 -> 116;
                case 134 -> 99;
                case 135 -> 59;
                case 136 -> 17;
                case 137 -> 80;
                case 138 -> 219;
                case 139 -> 42;
                case 140 -> 222;
                case 141 -> 96;
                case 142 -> 5;
                case 143 -> 147;
                case 144 -> 243;
                case 145 -> 151;
                case 146 -> 213;
                case 147 -> 77;
                case 148 -> 49;
                case 149 -> 131;
                case 150 -> 162;
                case 151 -> 146;
                case 152 -> 4;
                case 153 -> 61;
                case 154 -> 190;
                case 155 -> 114;
                case 156 -> 8;
                case 157 -> 240;
                case 158 -> 37;
                case 159 -> 197;
                case 160 -> 98;
                case 161 -> 2;
                case 162 -> 18;
                case 163 -> 35;
                case 164 -> 165;
                case 165 -> 82;
                case 166 -> 141;
                case 167 -> 109;
                case 168 -> 245;
                case 169 -> 93;
                case 170 -> 106;
                case 171 -> 124;
                case 172 -> 223;
                case 173 -> 79;
                case 174 -> 3;
                case 175 -> 157;
                case 176 -> 33;
                case 177 -> 227;
                case 178 -> 154;
                case 179 -> 211;
                case 180 -> 95;
                case 181 -> 246;
                case 182 -> 145;
                case 183 -> 249;
                case 184 -> 90;
                case 185 -> 19;
                case 186 -> 13;
                case 187 -> 205;
                case 188 -> 228;
                case 189 -> 44;
                case 190 -> 7;
                case 191 -> 139;
                case 192 -> 153;
                case 193 -> 129;
                case 194 -> 167;
                case 195 -> 84;
                case 196 -> 92;
                case 197 -> 235;
                case 198 -> 135;
                case 199 -> 31;
                case 200 -> 60;
                case 201 -> 41;
                case 202 -> 140;
                case 203 -> 143;
                case 204 -> 155;
                case 205 -> 171;
                case 206 -> 172;
                case 207 -> 62;
                case 208 -> 192;
                case 209 -> 67;
                case 210 -> 24;
                case 211 -> 230;
                case 212 -> 28;
                case 213 -> 149;
                case 214 -> 198;
                case 215 -> 188;
                case 216 -> 168;
                case 217 -> 164;
                case 218 -> 36;
                case 219 -> 103;
                case 220 -> 27;
                case 221 -> 254;
                case 222 -> 105;
                case 223 -> 46;
                case 224 -> 184;
                case 225 -> 159;
                case 226 -> 220;
                case 227 -> 0;
                case 228 -> 64;
                case 229 -> 206;
                case 230 -> 107;
                case 231 -> 83;
                case 232 -> 100;
                case 233 -> 12;
                case 234 -> 224;
                case 235 -> 180;
                case 236 -> 65;
                case 237 -> 71;
                case 238 -> 101;
                case 239 -> 247;
                case 240 -> 233;
                case 241 -> 183;
                case 242 -> 70;
                case 243 -> 94;
                case 244 -> 173;
                case 245 -> 23;
                case 246 -> 75;
                case 247 -> 195;
                case 248 -> 118;
                case 249 -> 108;
                case 250 -> 133;
                case 251 -> 182;
                case 252 -> 69;
                case 253 -> 120;
                case 254 -> 215;
                default -> 85;
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
            i6.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2295;
        if (d[n2] == null) {
            i6.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
