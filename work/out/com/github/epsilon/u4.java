/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.gui.Font
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.components.IMEPreeditOverlay
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.input.CharacterEvent
 *  net.minecraft.client.input.KeyEvent
 *  net.minecraft.client.input.MouseButtonEvent
 *  net.minecraft.client.input.PreeditEvent
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.DF;
import com.github.epsilon.Dl;
import com.github.epsilon.O5;
import com.github.epsilon.Ow;
import com.github.epsilon.XF;
import com.github.epsilon.Xe;
import com.github.epsilon._6;
import com.github.epsilon._E;
import com.github.epsilon._j;
import com.github.epsilon.dd;
import com.github.epsilon.dp;
import com.github.epsilon.hi;
import com.github.epsilon.i1;
import com.github.epsilon.iC;
import com.github.epsilon.id;
import com.github.epsilon.ih;
import com.github.epsilon.it;
import com.github.epsilon.iu;
import com.github.epsilon.l5;
import com.github.epsilon.lH;
import com.github.epsilon.lK;
import com.github.epsilon.lm;
import com.github.epsilon.nH;
import com.github.epsilon.uT;
import com.github.epsilon.vP;
import com.github.epsilon.vY;
import com.github.epsilon.y0;
import com.github.epsilon.zJ;
import com.github.epsilon.zU;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.IMEPreeditOverlay;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.input.PreeditEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u4
extends Screen {
    private IMEPreeditOverlay A;
    private final List<vP> B = new ArrayList<vP>();
    private final y0 T;
    private lm k;
    private final Ow F;
    private dd v;
    private boolean K;
    public static final u4 t;
    private final _j f = hi.a("G", (long)1215511131780764219L);
    private final DF R = new O5(this);
    private final dp V;
    private int c;
    private int G;
    private final Set<String> J;
    private final _E w;
    private zU p;
    private final _6 o;
    private int a;
    private static final String[] b;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] g;
    private static final long h;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void extractRenderState(GuiGraphicsExtractor var1_1, int var2_2, int var3_3, float var4_4) {
        block17: {
            var5_5 = Dl.t();
            var9_6 /* !! */  = (u4.a(361, 4924995598044026365L) ^ u4.a(13487, 847825557687263237L)) + u4.a(13576, 6661803210743111738L) ^ u4.a(2873, 3453859641312205708L) ^ u4.a(12459, 6049066871047250860L);
            if (var5_5) ** GOTO lbl-1000
            switch (var9_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1224104592017354011L), (long)501728103734382890L);
                    if (var5_5) ** GOTO lbl58
                    if (hi.a("\u00e9", (Object)this, (long)972581272395555360L) != null) ** GOTO lbl57
                    if (true) ** GOTO lbl59
                }
                case 114920946: {
                    throw null;
                }
            }
lbl13:
            // 2 sources

            while (true) {
                block19: {
                    block18: {
                        u4.l("pTiajDqPZyR9lRxG", n(int int ), (dd)hi.a("\u00e9", (Object)this, (long)972581272395555360L), (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L), (int)hi.a("\u00a5", (Object)var6_7, (long)1111753302704211661L));
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)972581272395555360L), (long)747195180656453255L);
                        hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)972581272395555360L), (long)354958188171490714L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)457572362580939452L), (Object)new Object[0], (long)784770621003871767L);
                        var7_8 = hi.a("G", (int)var2_2, (long)801972633595358600L);
                        var8_9 = u4.l("pTiajDqPZyR9lRxG", l(int ), (int)var3_3);
                        v0 = new Object[4];
                        v0[3] = Float.valueOf(var4_4);
                        v0[2] = (int)var8_9;
                        v0[1] = (int)var7_8;
                        v0[0] = var1_1;
                        hi.a("\u00a5", (Object)this, (Object)v0, (long)1157185898359889440L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)457572362580939452L), (Object)new Object[0], (long)1294970901470652421L);
                        hi.a("G", null, (long)354958188171490714L);
                        if (var5_5) break block18;
                        if (hi.a("\u00e9", (Object)this, (long)1069321673429942123L) != null) break block19;
                        var9_6 /* !! */  = u4.a(29530, 9087414573270476360L) * u4.a(1322, 6886144331687089965L) ^ u4.a(1356, 4699442923522052208L) ^ u4.a(23608, 4520632236424726616L);
                    }
                    if (!var5_5) break block17;
                }
                var9_6 /* !! */  = (int)(hi.a("G", (int)(u4.a(23810, 3277772303242529968L) * u4.a(10113, 179157760643887902L)), (int)u4.a(19801, 6567617946719984925L), (long)834203424483934088L) - u4.a(30780, 2418351137067215241L));
                if (!var5_5) break block17;
                ** GOTO lbl77
                break;
            }
lbl37:
            // 2 sources

            while (true) {
                hi.a("G", (long)441264294682620418L);
lbl40:
                // 2 sources

                while (true) {
                    u4.l("pTiajDqPZyR9lRxG", blit(net.minecraft.resources.Identifier int int int int float float float float ), (GuiGraphicsExtractor)var1_1, (Identifier)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)972581272395555360L), (long)800909747388376883L), (int)0, (int)0, (int)hi.a("\u00a5", (Object)var6_7, (long)932549962227715674L), (int)hi.a("\u00a5", (Object)var6_7, (long)1259377200156611885L), (float)0.0f, (float)1.0f, (float)1.0f, (float)0.0f);
                    u4.l("pTiajDqPZyR9lRxG", F(net.minecraft.client.gui.GuiGraphicsExtractor int int float ), (_6)hi.a("\u00e9", (Object)this, (long)992215096265638109L), (GuiGraphicsExtractor)var1_1, (int)var7_8, (int)var8_9, (float)var4_4);
                    return;
                }
                break;
            }
            block14: while (true) {
                block20: {
                    switch (var9_6 /* !! */ ) {
                        default: {
                            hi.a("\u00f2", (Object)this, (dd)u4.l("pTiajDqPZyR9lRxG", w(java.lang.String int int ), (String)u4.a(5167, -20363), (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L), (int)hi.a("\u00a5", (Object)var6_7, (long)1111753302704211661L)), (long)972581272395555360L);
                            if (!var5_5) break block20;
                            ** GOTO lbl13
                        }
                        case -782826297: {
                            ** continue;
                        }
                        case -782826296: {
                            hi.a("G", (long)767645364166240833L);
                            var9_6 /* !! */  = hi.a("G", (int)hi.a("G", (int)u4.a(5673, 8003298629526766925L), (int)u4.a(26820, 1545297126015907879L), (long)834203424483934088L), (int)u4.a(16049, 4707038488756415731L), (long)834203424483934088L) * u4.a(28959, 5768163685057340271L) ^ u4.a(28442, 3825610261294595871L);
                            if (!var5_5) continue block14;
                        }
                    }
lbl57:
                    // 2 sources

                    var9_6 /* !! */  = u4.a(986, 7373168864946540620L) * u4.a(24978, 7039334556347708631L) * u4.a(3019, 2143436086545670040L) - u4.a(30655, 4759551649173808722L) ^ u4.a(25363, 8292755920067277674L);
lbl58:
                    // 2 sources

                    if (!var5_5) continue;
lbl59:
                    // 2 sources

                    var9_6 /* !! */  = (u4.a(22510, 3974637965749978890L) + u4.a(31355, 142168467280244622L) ^ u4.a(7747, 8420947491378384651L)) / 5 * u4.a(26208, 1303980209237734368L) - u4.a(5757, 2317176879011513638L);
                    if (!var5_5) continue;
                }
                var9_6 /* !! */  = u4.a(30447, 8479713824172156746L) * u4.a(10206, 4003786217778673232L) * u4.a(11490, 2252679955121731982L) - u4.a(17650, 8291699548759725869L) ^ u4.a(8327, 9168064234510938552L);
            }
        }
        while (true) {
            switch (var9_6 /* !! */ ) {
                default: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1069321673429942123L), (int)((int)hi.a("j", (long)817515226557096230L)), (int)((int)hi.a("j", (long)660311983048283728L)), (long)965929651793311435L);
                    hi.a("\u00a5", (Object)var1_1, (Object)hi.a("\u00e9", (Object)this, (long)1069321673429942123L), (long)1320594276746924013L);
                    if (!var5_5) break;
                    ** GOTO lbl37
                }
                case -1701138428: {
                    ** continue;
                }
                case -1701138429: {
                    ** continue;
                }
            }
lbl77:
            // 2 sources

            var9_6 /* !! */  = u4.a(14434, 7286333424728140615L) * u4.a(11798, 8443881471205014102L) ^ u4.a(14594, 6021312155674962129L) ^ u4.a(28904, 3137923680897737108L);
        }
    }

    private float y(Object[] objectArray) {
        return 20.0f;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected void init() {
        block20: {
            block21: {
                var1_1 = Dl.S();
                var4_2 /* !! */  = (u4.a(23432, 6955251614890331953L) / u4.a(17353, 4883691124845876070L) ^ u4.a(18161, 7527527047034966816L) ^ u4.a(13227, 4772828167432135272L)) + u4.a(32227, 6936871977593317855L);
                if (var1_1) break block21;
lbl4:
                // 2 sources

                while (true) {
                    super.init();
                    v0 = this;
                    hi.a("\u00f2", (Object)v0, (int)(hi.a("\u00e9", (Object)v0, (long)357795449132459672L) + true), (long)357795449132459672L);
                    v1 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)795253276283686245L);
                    if (!var1_1) ** GOTO lbl83
                    if (v1 /* !! */  == false) ** GOTO lbl82
                    ** GOTO lbl85
                    break;
                }
lbl12:
                // 2 sources

                while (true) {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)499251176883354940L), (float)0.0f, (long)1165334323158006666L);
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)499251176883354940L), (float)0.0f, (long)439674605800943152L);
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)499251176883354940L), (float)1.0f, (long)439674605800943152L);
                    v2 = hi.a("\u00e9", (Object)this, (long)984926080198582417L);
                    if (!var1_1) ** GOTO lbl90
                    if (v2 != false) ** GOTO lbl89
                    ** GOTO lbl92
                    break;
                }
lbl20:
                // 2 sources

                while (true) {
                    block22: {
                        var2_3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                        if (!var1_1) break block22;
                        var4_2 /* !! */  = (u4.a(22604, 6955603920289205753L) / 5 / 4 - u4.a(4845, 1235858428950266255L)) / u4.a(6041, 414971714435760649L) - u4.a(26551, 256024920342115607L);
                        if (var1_1) break block20;
                        ** GOTO lbl31
                    }
lbl27:
                    // 2 sources

                    while (true) {
                        block24: {
                            block23: {
                                v3 = hi.a("\u00a5", (Object)var2_3, (long)984088978567310565L);
                                if (!var1_1) break block23;
                                if (v3 != false) break block24;
lbl31:
                                // 2 sources

                                v3 = hi.a("G", (int)((u4.a(21878, 7102119571028674428L) ^ u4.a(10611, 6306890016255474877L)) - u4.a(20770, 73686059947721522L)), (int)u4.a(29704, 4427138990855530135L), (long)834203424483934088L) + u4.a(13338, 8003762026161137409L);
                            }
                            var4_2 /* !! */  = (int)v3;
                            if (var1_1) break block20;
                        }
                        var4_2 /* !! */  = u4.a(27462, 3921674459008580480L) + u4.a(25278, 5267124017615484690L) + u4.a(7575, 291369961482997593L);
                        break block20;
                        break;
                    }
                    break;
                }
            }
lbl39:
            // 7 sources

            while (true) {
                switch (var4_2 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -512358620: {
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)570438417053457860L), (Object)new Object[]{(int)hi.a("\u00e9", (Object)this, (long)357795449132459672L)}, (long)959274254595874985L);
                        if (var1_1) ** GOTO lbl87
                        ** GOTO lbl12
                    }
                    case -512358622: {
                        ** continue;
                    }
                    case -512358621: {
                        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)536393061699435999L);
                        hi.a("\u00f2", (Object)this, (boolean)true, (long)984926080198582417L);
                        if (var1_1) ** GOTO lbl94
                        ** GOTO lbl20
                    }
                    case -512358618: {
                        ** continue;
                    }
                    case -512358619: {
                        hi.a("G", (long)397288152806896377L);
                        hi.a("G", (long)1165493072225073635L);
                        var4_2 /* !! */  = (int)(hi.a("G", (int)(u4.a(15619, 7895282807035783328L) + u4.a(26260, 7385140792961807938L) + u4.a(21765, 5219275985214146556L) - u4.a(12068, 8395122700146179554L)), (int)u4.a(15153, 526258121294637728L), (long)834203424483934088L) - u4.a(28199, 2180274474021566989L));
                        break;
                    }
                }
                continue;
                break;
            }
        }
        block17: while (true) {
            switch (var4_2 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 669420708: {
                    var3_4 = (vP)hi.a("\u00a5", (Object)var2_3, (long)470012372636416268L);
                    hi.a("\u00a5", (Object)var3_4, (Object)new Object[]{Float.valueOf((float)hi.a("\u00a5", (Object)this, (Object)new Object[]{var3_4}, (long)432543487538970545L))}, (long)1034828108854264538L);
                    hi.a("\u00a5", (Object)var3_4, (long)657315854892289670L);
                    if (!var1_1) {
                        return;
                    }
                    ** GOTO lbl96
                }
                case 669420709: {
                    hi.a("G", (long)469227558286542455L);
                    hi.a("G", (long)802702781471349640L);
                    if (var1_1 != false) return;
lbl82:
                    // 2 sources

                    v1 /* !! */  = (CallSite)(u4.a(24644, 6228176986964340873L) / u4.a(27591, 506855209608854107L) / u4.a(11725, 4898740626741394818L) / u4.a(25125, 5921502028165656615L) + u4.a(29233, 6507106162593472944L));
lbl83:
                    // 2 sources

                    var4_2 /* !! */  = (int)v1 /* !! */ ;
                    if (var1_1) ** GOTO lbl39
lbl85:
                    // 2 sources

                    var4_2 /* !! */  = (hi.a("G", (int)u4.a(21542, 510039481974032112L), (int)u4.a(28173, 1449694791992490766L), (long)834203424483934088L) ^ u4.a(19478, 1981025684028528653L)) + u4.a(28545, 2112894864596582271L);
                    if (var1_1) ** GOTO lbl39
lbl87:
                    // 2 sources

                    var4_2 /* !! */  = u4.a(22424, 3699521643262575939L) / u4.a(27591, 506855209608854107L) / u4.a(11725, 4898740626741394818L) / u4.a(25125, 5921502028165656615L) + u4.a(12141, 3602021214438883267L);
                    if (var1_1) ** GOTO lbl39
lbl89:
                    // 2 sources

                    v2 = hi.a("G", (int)((hi.a("G", (int)u4.a(5025, 35562119062962633L), (int)u4.a(2442, 3095593154742672026L), (long)834203424483934088L) ^ u4.a(2678, 7334075212020539233L)) / u4.a(29893, 6849000444088002215L)), (int)u4.a(21429, 216765643403001887L), (long)834203424483934088L) + u4.a(7527, 875239024948562166L);
lbl90:
                    // 2 sources

                    var4_2 /* !! */  = (int)v2;
                    if (var1_1) ** GOTO lbl39
lbl92:
                    // 2 sources

                    var4_2 /* !! */  = u4.a(32653, 6482490950648901132L) - u4.a(28535, 7125280191615220314L) + u4.a(2231, 6014561457102871868L);
                    if (var1_1) ** GOTO lbl39
lbl94:
                    // 2 sources

                    var4_2 /* !! */  = (int)(hi.a("G", (int)((hi.a("G", (int)u4.a(9433, 1827817007360209287L), (int)u4.a(1623, 7067066996635981159L), (long)834203424483934088L) ^ u4.a(8552, 2283711025166020634L)) / u4.a(29893, 6849000444088002215L)), (int)u4.a(32410, 5297423691524680747L), (long)834203424483934088L) + u4.a(13365, 2366838013090326072L));
                    ** continue;
                }
lbl96:
                // 1 sources

                var4_2 /* !! */  = (u4.a(26127, 3960392646051870569L) / 5 / 4 - u4.a(22422, 4283455990059927384L)) / u4.a(6041, 414971714435760649L) - u4.a(21709, 1475228126040654318L);
                continue block17;
                case 669420711: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private float V(Object var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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

    public int D(Object[] objectArray) {
        return (int)hi.a("\u00e9", (Object)((Object)this), (long)357795449132459672L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean charTyped(CharacterEvent var1_1) {
        block35: {
            block42: {
                block34: {
                    block32: {
                        block33: {
                            block31: {
                                var2_2 = Dl.t();
                                var6_3 /* !! */  = (u4.a(11411, 7012104528077519229L) + u4.a(26878, 7219117129530260298L)) * u4.a(25946, 6318579869425612165L) ^ u4.a(20701, 1492395879431471646L);
                                if (!var2_2) break block31;
lbl4:
                                // 2 sources

                                while (true) {
                                    block37: {
                                        block36: {
                                            v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)992215096265638109L), (Object)new Object[]{var1_1}, (long)452698738089697197L);
                                            if (var2_2) break block36;
                                            if (v0 != false) break block37;
                                            v0 = hi.a("G", (int)(u4.a(21808, 6111499484434367530L) / u4.a(901, 1978768100137587150L)), (int)u4.a(30959, 5247007674221701258L), (long)834203424483934088L) + u4.a(22710, 4435070075407632455L) + u4.a(2728, 4038021295103269499L);
                                        }
                                        var6_3 /* !! */  = (int)v0;
                                        if (!var2_2) break block31;
                                    }
                                    var6_3 /* !! */  = hi.a("G", (int)u4.a(28664, 2408489618423857135L), (int)u4.a(30547, 7652875956698785373L), (long)834203424483934088L) - u4.a(21899, 8696806148201973467L) ^ u4.a(30574, 6611572014038886123L);
                                    if (!var2_2) break block31;
                                    ** GOTO lbl63
                                    break;
                                }
lbl16:
                                // 2 sources

                                while (true) {
                                    v1 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)984088978567310565L);
                                    if (var2_2) break block32;
                                    if (v1 /* !! */  == false) break block33;
                                    break block34;
                                    break;
                                }
lbl21:
                                // 2 sources

                                while (true) {
                                    block39: {
                                        block38: {
                                            var5_6 = hi.a("\u00a5", (Object)var1_1, (long)520692021534834522L);
                                            v2 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)361382094905603987L);
                                            if (var2_2) break block38;
                                            if (v2 /* !! */  == false) break block39;
                                            v2 /* !! */  = (CallSite)(((u4.a(7978, 8889126678059404510L) ^ u4.a(32263, 513404335545561041L)) + u4.a(13213, 7862729694013710741L)) / u4.a(6291, 5790459789310412952L) - u4.a(3505, 3234815081588022719L) + u4.a(18448, 1159186556451462645L));
                                        }
                                        var6_3 /* !! */  = (int)v2 /* !! */ ;
                                        if (!var2_2) break block35;
                                    }
                                    var6_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)(hi.a("G", (int)u4.a(26076, 126031068144054515L), (int)u4.a(899, 5664454409778909564L), (long)834203424483934088L) / u4.a(23191, 8854903074037664542L)), (int)u4.a(1155, 4852380046595412339L), (long)834203424483934088L), (int)u4.a(12241, 1476747672386666075L), (long)834203424483934088L) ^ u4.a(213, 6968900954573230638L);
                                    if (!var2_2) break block35;
                                    ** GOTO lbl128
                                    break;
                                }
                            }
                            block24: while (true) {
                                block41: {
                                    block40: {
                                        switch (var6_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case 71077570: {
                                                hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)543566076446335695L), (long)433704824712272587L);
                                                return true;
                                            }
                                            case 71077569: {
                                                v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (Object)new Object[]{var1_1}, (long)492777507481249662L);
                                                if (var2_2) break block40;
                                                if (v3 /* !! */  == false) break;
                                                break block41;
                                            }
                                            case 71077566: {
                                                hi.a("\u00a5", (Object)this, (long)439254618482708644L);
                                                hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)543566076446335695L), (long)433704824712272587L);
                                                return true;
                                            }
                                            case 71077571: {
                                                var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                                                if (!var2_2) break block24;
                                                ** GOTO lbl16
                                            }
                                            case 71077568: {
                                                hi.a("G", (long)405872435149102496L);
                                                hi.a("G", (long)850375381118395903L);
                                                var6_3 /* !! */  = u4.a(9221, 5102180242269763249L) * u4.a(24488, 8678736024570007311L) * u4.a(10985, 4226604022450223113L) - u4.a(1961, 1468952600815523057L);
                                                continue block24;
                                            }
                                        }
lbl63:
                                        // 2 sources

                                        v3 /* !! */  = (CallSite)((u4.a(26842, 7817067038882445331L) * u4.a(9545, 1605532252705453293L) / u4.a(25080, 4740648951608390309L) ^ u4.a(29449, 7160608351502540976L)) / u4.a(17308, 2312386775688124167L) + u4.a(21862, 3242261281514751907L));
                                    }
                                    var6_3 /* !! */  = (int)v3 /* !! */ ;
                                    if (!var2_2) continue;
                                }
                                var6_3 /* !! */  = (u4.a(18456, 8045509716795170150L) * u4.a(29961, 7342246683768759502L) ^ u4.a(19348, 8283814050481413856L) ^ u4.a(691, 7063507523633435309L) ^ u4.a(28809, 3587741374592099001L)) + u4.a(972, 777008655089325053L);
                            }
                            var6_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)u4.a(14306, 8735891379436185500L), (int)u4.a(13123, 2835174889650479801L), (long)834203424483934088L), (int)u4.a(25443, 2764790569079943994L), (long)834203424483934088L) ^ u4.a(19043, 1064336647964172048L);
                            if (!var2_2) break block42;
                        }
                        v1 /* !! */  = (CallSite)((u4.a(27096, 4833235783258913648L) - u4.a(214, 4173908889534386841L)) / u4.a(10166, 6546914413571176352L) + u4.a(5797, 6388190727427146770L) - u4.a(10805, 128168207180627494L));
                    }
                    var6_3 /* !! */  = (int)v1 /* !! */ ;
                    if (!var2_2) break block42;
                }
                var6_3 /* !! */  = u4.a(26744, 1364981537976138288L) + u4.a(9477, 2216381010790905452L) + u4.a(16203, 3451382116374932597L);
            }
lbl80:
            // 2 sources

            block25: while (true) {
                switch (var6_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1248551690: {
                        var4_5 = (vP)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                        v4 /* !! */  = u4.l("pTiajDqPZyR9lRxG", S(), (vP)var4_5);
                        if (var2_2) ** GOTO lbl95
                        if (v4 /* !! */  != false) ** GOTO lbl94
                        ** GOTO lbl97
                    }
                    case 1248551688: {
                        hi.a("G", (long)411152158456204314L);
                        return false;
                    }
lbl94:
                    // 1 sources

                    v4 /* !! */  = (CallSite)(((u4.a(3973, 3159797014856195213L) ^ u4.a(23101, 8833778781704325181L)) / 3 ^ u4.a(16861, 4195367583669785613L)) + u4.a(19273, 618378650701176491L));
lbl95:
                    // 2 sources

                    var6_3 /* !! */  = (int)v4 /* !! */ ;
                    if (!var2_2) ** GOTO lbl99
lbl97:
                    // 2 sources

                    var6_3 /* !! */  = u4.a(8102, 2994345242914475585L) * u4.a(17433, 2350723038811164808L) + u4.a(9799, 58094813404033977L);
                    if (var2_2) ** GOTO lbl107
lbl99:
                    // 2 sources

                    switch (var6_3 /* !! */ ) {
                        default: {
                            if (!var2_2) break;
                            ** GOTO lbl21
                        }
                        case -1280894818: {
                            ** continue;
                        }
                        case -1280894819: {
                            throw null;
                        }
                    }
lbl107:
                    // 2 sources

                    var6_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)u4.a(13050, 5999194550445072953L), (int)u4.a(26887, 8121717310018370213L), (long)834203424483934088L), (int)u4.a(28575, 3203060731118402748L), (long)834203424483934088L) ^ u4.a(5560, 6210416060480013350L);
                    continue block25;
                    case 1248551691: 
                }
                return super.charTyped(var1_1);
            }
        }
        block26: do lbl-1000:
        // 3 sources

        {
            block45: {
                block43: {
                    block44: {
                        switch (var6_3 /* !! */ ) {
                            default: {
                                v5 /* !! */  = hi.a("\u00a5", (Object)var4_5, (Object)new Object[]{var5_6}, (long)483022751010555320L);
                                if (var2_2) break block43;
                                if (v5 /* !! */  == false) break block44;
                                break block45;
                            }
                            case 226994193: {
                                u4.l("pTiajDqPZyR9lRxG", M(com.github.epsilon.zJ ), (u4)this, (zJ)hi.a("j", (long)543566076446335695L));
                                return true;
                            }
                            case 226994195: {
                                if (!var2_2) break block26;
                                return super.charTyped(var1_1);
                            }
                            case 226994196: {
                            }
                        }
                        throw null;
                    }
                    v5 /* !! */  = (CallSite)(((u4.a(16419, 3251059158599865145L) ^ u4.a(5816, 537215361942963744L)) + u4.a(17348, 2072569208708469504L)) / u4.a(2071, 8873719142974642416L) - u4.a(27585, 8921329762137914958L) + u4.a(15707, 8939061704639506440L));
                }
                var6_3 /* !! */  = (int)v5 /* !! */ ;
                if (!var2_2) ** GOTO lbl-1000
            }
            var6_3 /* !! */  = u4.a(31016, 3706228949915053013L) - u4.a(12766, 3414825664434824612L) + u4.a(25002, 465830203703931791L) - u4.a(24418, 1718100304714140782L) ^ u4.a(3810, 972555995836504964L);
        } while (!var2_2);
        var6_3 /* !! */  = hi.a("G", (int)u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)u4.a(13050, 5999194550445072953L), (int)u4.a(26887, 8121717310018370213L)), (int)u4.a(28575, 3203060731118402748L), (long)834203424483934088L) ^ u4.a(5560, 6210416060480013350L);
        ** while (true)
    }

    private float n(Object[] objectArray) {
        return (float)hi.a("G", (float)(hi.a("G", (long)1052312102167579273L) - 40.0f), (float)140.0f, (float)200.0f, (long)390336973585993938L);
    }

    private boolean q(Object[] objectArray) {
        return (boolean)hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)888472211745929366L), (long)789438897355831922L))), (long)1000026253634408124L);
    }

    private void z(Object[] objectArray) {
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (int)hi.a("\u00e9", (Object)((Object)this), (long)1131180864929461629L);
        objectArray2[0] = hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)((Object)this), (long)901658386266653190L)}, (long)763132020515120236L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)697911340874823326L), (Object)objectArray2, (long)982426259859459404L);
    }

    private boolean P(String string) {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)1275384119516968842L), (Object)string, (long)1128025236213057684L);
    }

    public void M(XF xF) {
        Object[] objectArray = new Object[2];
        objectArray[1] = Float.valueOf((float)hi.a("G", (float)260.0f, (float)(hi.a("G", (long)1101389884075884739L) - 28.0f), (long)971000971621905228L));
        objectArray[0] = Float.valueOf((float)hi.a("G", (float)300.0f, (float)(hi.a("G", (long)1052312102167579273L) - 28.0f), (long)971000971621905228L));
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)992215096265638109L), (Object)objectArray, (long)1032244419502627218L);
        CallSite callSite2 = hi.a("\u00e9", (Object)((Object)this), (long)992215096265638109L);
        XF xF2 = xF;
        hi.a("G", (Object)xF2, (long)374764797691957710L);
        Consumer<String> consumer = xF2::W;
        XF xF3 = xF;
        hi.a("G", (Object)xF3, (long)374764797691957710L);
        hi.a("\u00a5", (Object)callSite2, (Object)new Object[]{new lK((ih)((Object)callSite), xF, consumer, xF3::z)}, (long)685365308510818775L);
        hi.a("\u00a5", (Object)((Object)this), (Object)hi.a("j", (long)1158716554595397923L), (long)433704824712272587L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void J(Object[] var1_1) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            var2_2 = Dl.t();
                            var6_3 /* !! */  = hi.a("G", (int)((u4.a(28894, 7538181545651445954L) / u4.a(13813, 9181340926782792805L) ^ u4.a(5760, 9119389471788910457L)) + u4.a(20846, 5807217377813594816L)), (int)u4.a(14977, 1225061483076415116L), (long)834203424483934088L) + u4.a(466, 5563508780186489364L);
                            if (var2_2) {
lbl6:
                                // 2 sources

                                while (true) {
                                    hi.a("G", (long)422153257485810645L);
                                    u4.l("pTiajDqPZyR9lRxG", Q());
lbl10:
                                    // 2 sources

                                    while (true) {
                                        v0 = this;
                                        v1 = hi.a("\u00e9", (Object)v0, (long)486358810569479112L) + true;
                                        v2 = v1;
                                        hi.a("\u00f2", (Object)v0, (int)v1, (long)486358810569479112L);
lbl15:
                                        // 2 sources

                                        while (true) {
                                            var3_4 = v2;
                                            var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                                            if (!var2_2) break block17;
lbl19:
                                            // 2 sources

                                            while (true) {
                                                v3 /* !! */  = u4.l("pTiajDqPZyR9lRxG", hasNext(), (Iterator)var4_5);
                                                if (var2_2) break block18;
                                                if (v3 /* !! */  == false) break block19;
                                                break block20;
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var5_6 = (vP)hi.a("\u00a5", (Object)var4_5, (long)470012372636416268L);
                                    u4.l("pTiajDqPZyR9lRxG", D(int ), (vP)var5_6, (int)var3_4);
                                    if (var2_2) lbl-1000:
                                    // 2 sources

                                    {
                                        return;
                                    }
                                    break block21;
                                    break;
                                }
                            }
                            v2 = var6_3 /* !! */ ;
                            ** while (var2_2)
lbl33:
                            // 1 sources

                            switch (v2) {
                                case -554391461: {
                                    ** continue;
                                }
                                ** default:
lbl37:
                                // 1 sources

                                ** continue;
                            }
lbl38:
                            // 4 sources

                            while (true) {
                                switch (var6_3 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -872841823: {
                                        ** continue;
                                    }
                                    case -872841824: {
                                        ** continue;
                                    }
                                    case -872841825: 
                                }
                                return;
                            }
                        }
                        var6_3 /* !! */  = (reference)(u4.a(31048, 9056497043379333647L) - u4.a(12248, 1134102939276016939L) - u4.a(27229, 6009195439948085766L) + u4.a(8600, 1931516564715073718L) - u4.a(12128, 7295788337166252895L));
                        if (!var2_2) ** GOTO lbl38
                    }
                    v3 /* !! */  = var6_3 /* !! */  = hi.a("G", (int)(u4.a(18038, 286305700453126781L) + u4.a(1072, 3302941004122345743L)), (int)u4.a(18214, 1425116162510132646L), (long)834203424483934088L) - u4.a(10452, 3336161088818904432L);
                }
                if (!var2_2) ** GOTO lbl38
            }
            var6_3 /* !! */  = (reference)(u4.a(13445, 121665415821419544L) * u4.a(25761, 3754875046379140300L) - u4.a(6442, 245723688513031131L));
            ** GOTO lbl38
        }
        var6_3 /* !! */  = (reference)(u4.a(10006, 2692935090508592235L) - u4.a(1842, 7518694911919641417L) - u4.a(14803, 9111926651788290693L) + u4.a(14256, 6876699578766059400L) - u4.a(9541, 6223740221804312301L));
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void l(Object[] var1_1) {
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

    static {
        IlilIlIlil.registerNativesForClass((int)26, u4.class);
        Hidden0.special_clinit_26_130(u4.class);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void M(zJ var1_1) {
        block10: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = (hi.a("G", (int)(u4.a(6205, 4305846752747047945L) + u4.a(3031, 5508336092542360222L)), (int)u4.a(21740, 2396176641179157616L), (long)834203424483934088L) / u4.a(2071, 8873719142974642416L) ^ u4.a(24470, 5556365025591267060L)) + u4.a(17685, 8430450533798646076L);
            if (!var2_2) break block10;
lbl4:
            // 2 sources

            while (true) {
                v0 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)795253276283686245L);
                if (var2_2) ** GOTO lbl32
                if (v0 == false) ** GOTO lbl31
                ** GOTO lbl34
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)570438417053457860L), (Object)new Object[]{(int)hi.a("\u00e9", (Object)this, (long)357795449132459672L)}, (long)959274254595874985L);
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)570438417053457860L), (Object)new Object[]{var1_1}, (long)1082938257691441920L);
                if (var2_2) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl36
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1373881019: {
                    ** continue;
                }
                case 1373881020: {
                    ** continue;
                }
                case 1373881022: 
            }
            hi.a("G", (float)-1.0f, (float)-13.0f, (float)-1.0f, (float)1.0f, (double)15.0, (int)2, (long)1270986612680661754L);
            var3_3 /* !! */  = u4.a(18269, 1343528794623088351L) / u4.a(17193, 8856143133706000316L) + u4.a(2655, 5822854430586527657L);
            if (!var2_2) continue;
lbl31:
            // 2 sources

            v0 = u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)hi.a("G", (int)(u4.a(26435, 1323864990418187625L) ^ u4.a(9823, 1250543582024660118L)), (int)u4.a(1488, 961289265486778514L), (long)834203424483934088L), (int)u4.a(23274, 5607785407509531262L)) - u4.a(30065, 214856442582246448L);
lbl32:
            // 2 sources

            var3_3 /* !! */  = (int)v0;
            if (!var2_2) continue;
lbl34:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(u4.a(16524, 4783705836467982677L) + u4.a(32367, 5357516053884120890L)), (int)u4.a(8548, 5997376014184837938L), (long)834203424483934088L), (int)u4.a(27925, 1571313874145426968L), (long)834203424483934088L) - u4.a(14180, 2271920727140328210L) - u4.a(4804, 1580523844355637337L));
            if (!var2_2) continue;
lbl36:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(u4.a(11715, 7959771777461844034L) ^ u4.a(18884, 7426962173931428333L)), (int)u4.a(26116, 2944510724311757322L), (long)834203424483934088L), (int)u4.a(13687, 4227235964605325632L), (long)834203424483934088L) - u4.a(22850, 1464506976716294844L));
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void V(Object[] var1_1) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        var2_2 = (Integer)var1_1[0];
                        var3_3 = Dl.t();
                        var4_4 = u4.a(10067, 3292981696612528718L) - u4.a(16228, 953427767301271140L) - u4.a(31768, 3692110110812448831L);
                        if (var3_3) ** GOTO lbl-1000
                        switch (var4_4) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                v0 = var2_2;
                                v1 = 1;
                                if (var3_3) break block15;
                                if (v0 != v1) break;
                                break block16;
                            }
                            case 322007117: {
                                return;
                            }
                        }
                        v0 = u4.a(14336, 1128955598947936354L) * u4.a(24116, 7397921916910504919L) * u4.a(17809, 3660484525736923248L) / 3;
                        v1 = u4.a(30444, 153190434665047493L);
                    }
                    var4_4 = v0 ^ v1;
                    if (!var3_3) break block17;
                }
                var4_4 = u4.a(20442, 5980075239232969634L) * u4.a(29473, 9183172440812921565L) - u4.a(29164, 3539896431290098279L);
            }
            switch (var4_4) {
                default: {
                    v2 = hi.a("j", (long)1089638728845495349L);
                    var4_4 = (u4.a(1939, 3373252408352986818L) ^ u4.a(4070, 776729391388744996L)) - u4.a(8331, 8825364720516330183L);
                    if (var3_3) {
                        break;
                    }
                    break block18;
                }
                case 1223308186: {
                    v2 = hi.a("j", (long)1108946086899355849L);
                    if (!var3_3) break;
                    ** GOTO lbl-1000
                }
                case 1223308185: {
                    throw null;
                }
            }
            var4_4 = (u4.a(14911, 6029888506985507352L) ^ u4.a(1920, 312747073888277865L)) - u4.a(21686, 2797631563681596681L);
        }
        switch (var4_4) {
            default: lbl-1000:
            // 2 sources

            {
                hi.a("\u00a5", (Object)this, (Object)v2, (long)433704824712272587L);
                return;
            }
            case 335400623: 
        }
        u4.l("pTiajDqPZyR9lRxG", values());
    }

    public void onClose() {
        u4.l("pTiajDqPZyR9lRxG", m());
        hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)((Object)this), (long)669801794204839990L)}, (long)1191344772110161467L);
        super.onClose();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean preeditUpdated(PreeditEvent var1_1) {
        block16: {
            block17: {
                var2_2 = Dl.S();
                var3_3 = hi.a("G", (int)((u4.a(31759, 6790667993192311125L) - u4.a(32469, 864785293600435294L)) * u4.a(26260, 5903485567923860895L)), (int)u4.a(7345, 4521123103887084809L), (long)834203424483934088L) ^ u4.a(2067, 3324941491012066660L) ^ u4.a(32563, 1650083153089015537L);
                if (var2_2) break block17;
lbl4:
                // 2 sources

                while (true) {
                    block19: {
                        block18: {
                            if (!var2_2) break block18;
                            if (var1_1 != null) break block19;
                            var3_3 = hi.a("G", (int)u4.a(20415, 1899008694007897580L), (int)u4.a(30026, 3337435950043865219L), (long)834203424483934088L) + u4.a(13811, 5674573040684066783L) ^ u4.a(180, 1599885577653473889L);
                        }
                        if (var2_2) break block16;
                    }
                    var3_3 = (u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)u4.a(21154, 5649498331122436030L), (int)u4.a(8474, 4164967439551427928L)) - u4.a(21602, 6443199943077595024L) ^ u4.a(124, 1820551022469107736L)) + u4.a(1983, 21308333586765734L);
                    break block16;
                    break;
                }
lbl13:
                // 1 sources

                return true;
            }
            while (true) {
                switch (var3_3) {
                    default: {
                        ** continue;
                    }
                    case 601078397: 
                }
                u4.l("pTiajDqPZyR9lRxG", E(int int int ), (int)2, (int)0, (int)u4.a(29893, 6849000444088002215L));
                hi.a("G", (long)426324660506778941L);
                var3_3 = hi.a("G", (int)hi.a("G", (int)(u4.a(16567, 869618094526928198L) / u4.a(31246, 1453847242613336743L)), (int)u4.a(4057, 5213465955091045831L), (long)834203424483934088L), (int)u4.a(30898, 4456992143027284028L), (long)834203424483934088L) * u4.a(7057, 4011688180994558670L) ^ u4.a(29438, 7427350590229358208L);
                if (!var2_2) ** GOTO lbl13
            }
        }
        block13: while (true) {
            switch (var3_3) {
                default: {
                    v0 = new IMEPreeditOverlay(var1_1, (Font)hi.a("\u00e9", (Object)this, (long)1166792753393736904L), u4.a(29893, 6849000444088002215L));
                    var3_3 = (u4.a(24047, 4993732667189530307L) - u4.a(12928, 6246593709691953671L)) / u4.a(30272, 7954503872998319187L) * u4.a(29705, 1685216778149176388L) + u4.a(12258, 1290503771093695550L);
                    break block13;
                }
                case -1868409023: {
                    v0 = null;
                    var3_3 = (u4.a(8639, 2574857281772647710L) - u4.a(28797, 8671337815398031548L)) / u4.a(30272, 7954503872998319187L) * u4.a(12064, 2787707436517425113L) + u4.a(23101, 358216544510413295L);
                    break block13;
                }
                case -1868409025: {
                    hi.a("G", (long)1228793555023716746L);
                    var3_3 = u4.a(10401, 6355687480144984575L) + u4.a(24217, 4647907395339979778L) + u4.a(20631, 8111344938427810193L) + u4.a(18485, 4748864963072727302L) - u4.a(10307, 7360509660607118793L);
                    continue block13;
                }
            }
            break;
        }
        while (true) {
            switch (var3_3) {
                default: {
                    hi.a("\u00f2", (Object)this, (IMEPreeditOverlay)v0, (long)1069321673429942123L);
                    return true;
                }
                case 785828084: 
            }
            hi.a("G", (boolean)false, (long)591462649743999036L);
            var3_3 = ((u4.a(686, 6881739009137365192L) ^ u4.a(26048, 8422756452611077882L)) * u4.a(11753, 5155463389060004350L) ^ u4.a(16707, 4771847553331892272L)) + u4.a(24850, 4827761314842652961L) - u4.a(22181, 2021884242627691764L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$anySubPanelVisible$0(vP vP2) {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", u4.a(5162, 27836), (Object)hi.a("\u00a5", (Object)vP2, (long)1012893017700285154L), (long)734234975012314075L);
                if (!bl) break block4;
                if (object != false) break block5;
                object = hi.a("\u00a5", (Object)vP2, (long)543613291937030899L);
            }
            if (!bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    public boolean isPauseScreen() {
        return false;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void s(String var1_1) {
        block72: {
            block84: {
                block71: {
                    block70: {
                        block68: {
                            block69: {
                                block67: {
                                    block65: {
                                        block66: {
                                            block62: {
                                                block78: {
                                                    block64: {
                                                        block63: {
                                                            block61: {
                                                                var2_2 = Dl.S();
                                                                var5_3 /* !! */  = u4.a(24625, 1392467801838465636L) * u4.a(27405, 1936248163081304127L) ^ u4.a(1960, 1224159547398084547L);
                                                                if (var2_2) ** GOTO lbl14
                                                                block33: while (true) {
                                                                    block75: {
                                                                        block74: {
                                                                            block73: {
                                                                                v0 /* !! */  = u4.l("pTiajDqPZyR9lRxG", equals(java.lang.Object ), (String)u4.a(5163, -10235), (Object)var1_1);
                                                                                if (!var2_2) break block73;
                                                                                if (v0 /* !! */  != false) break block74;
                                                                                v0 /* !! */  = (CallSite)(u4.a(6202, 9073010964393774250L) * u4.a(1579, 7043907151190184757L) ^ u4.a(10489, 5356966152773073462L));
                                                                            }
                                                                            var5_3 /* !! */  = (int)v0 /* !! */ ;
                                                                            if (var2_2) break block75;
                                                                        }
                                                                        var5_3 /* !! */  = ((u4.a(19779, 6552200378032232745L) * u4.a(864, 1110578363558089179L) - u4.a(4181, 8603015422594236825L)) * u4.a(10018, 5645358785928853225L) ^ u4.a(18365, 9011958976683972461L)) - u4.a(7660, 4250489844570442217L);
                                                                    }
                                                                    switch (var5_3 /* !! */ ) {
                                                                        default: {
                                                                            continue block33;
                                                                        }
                                                                        case -320622543: {
                                                                            var3_4 = u4.l("pTiajDqPZyR9lRxG", iterator(), (List)hi.a("\u00e9", (Object)this, (long)669801794204839990L));
                                                                            if (var2_2) break block33;
                                                                            break block61;
                                                                        }
                                                                        case -320622541: {
                                                                            var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                                                                            if (var2_2) break block62;
                                                                            break block63;
                                                                        }
                                                                        case -320622540: {
                                                                            u4.l("pTiajDqPZyR9lRxG", j(int ), (int)1);
                                                                            return;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                var5_3 /* !! */  = (int)(hi.a("G", (int)u4.a(30265, 8880357079269615507L), (int)u4.a(22257, 1337355387621245707L), (long)834203424483934088L) / u4.a(13813, 9181340926782792805L) + u4.a(19705, 7106390759361224007L));
                                                                if (var2_2) break block64;
                                                                ** GOTO lbl37
                                                            }
lbl33:
                                                            // 2 sources

                                                            while (true) {
                                                                block77: {
                                                                    block76: {
                                                                        v1 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)984088978567310565L);
                                                                        if (!var2_2) break block76;
                                                                        if (v1 /* !! */  != false) break block77;
lbl37:
                                                                        // 2 sources

                                                                        v1 /* !! */  = (CallSite)(u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)hi.a("G", (int)u4.a(19214, 6308331309652975288L), (int)u4.a(17372, 7970993844002591045L), (long)834203424483934088L), (int)u4.a(12707, 234981307170481233L)) - u4.a(4532, 449440483069608320L) ^ u4.a(10340, 268092460083313780L));
                                                                    }
                                                                    var5_3 /* !! */  = (int)v1 /* !! */ ;
                                                                    if (var2_2) break block64;
                                                                }
                                                                var5_3 /* !! */  = (int)(hi.a("G", (int)u4.a(5481, 7067493078547611776L), (int)u4.a(3927, 6516143555154894191L), (long)834203424483934088L) * u4.a(26983, 2489296992085523446L) + u4.a(23676, 617639731114182727L));
                                                                break block64;
                                                                break;
                                                            }
lbl44:
                                                            // 2 sources

                                                            while (!var2_2) {
                                                                ** GOTO lbl131
                                                            }
                                                            break block78;
                                                        }
lbl48:
                                                        // 2 sources

                                                        while (true) {
                                                            v2 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)984088978567310565L);
                                                            if (!var2_2) break block65;
                                                            if (v2 /* !! */  == false) break block66;
                                                            break block67;
                                                            break;
                                                        }
lbl53:
                                                        // 2 sources

                                                        while (true) {
                                                            block82: {
                                                                block81: {
                                                                    block80: {
                                                                        block79: {
                                                                            hi.a("\u00a5", (Object)var4_5, (Object)new Object[]{v3}, (long)717159333591175622L);
                                                                            hi.a("\u00a5", (Object)var4_5, (Object)new Object[]{false}, (long)494028318362415033L);
                                                                            hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)669801794204839990L)}, (long)1191344772110161467L);
                                                                            v4 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)543613291937030899L);
                                                                            if (!var2_2) break block79;
                                                                            if (v4 /* !! */  != false) break block80;
                                                                            v4 /* !! */  = (CallSite)((u4.a(23842, 8023809701736878029L) * u4.a(5590, 2038187993502762853L) + u4.a(24452, 4911316741412687631L) - u4.a(13052, 6902815185434896369L)) / 4 - u4.a(6915, 5749251628189108453L));
                                                                        }
                                                                        var5_3 /* !! */  = (int)v4 /* !! */ ;
                                                                        if (var2_2) break block81;
                                                                    }
                                                                    var5_3 /* !! */  = (hi.a("G", (int)hi.a("G", (int)u4.a(14613, 7898776401689962558L), (int)u4.a(9550, 3497266482108364553L), (long)834203424483934088L), (int)u4.a(23217, 231836728593615018L), (long)834203424483934088L) + u4.a(30364, 6018895422031471276L) ^ u4.a(203, 4047144928460197900L)) + u4.a(5322, 5456403623015925507L);
                                                                }
                                                                switch (var5_3 /* !! */ ) {
                                                                    default: {
                                                                        v5 = hi.a("j", (long)1158716554595397923L);
                                                                        var5_3 /* !! */  = (u4.a(4979, 7678217702461785036L) * u4.a(14051, 3753677381453244405L) * u4.a(26081, 2360524207516759478L) ^ u4.a(29276, 2323965029833384705L)) + u4.a(22559, 2502219607013559690L) - u4.a(13961, 6799293825304912662L);
                                                                        if (!var2_2) {
                                                                            break;
                                                                        }
                                                                        break block82;
                                                                    }
                                                                    case 1241784485: {
                                                                        v5 = hi.a("j", (long)597645201562828599L);
                                                                        if (var2_2) break;
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    case 1241784486: {
                                                                        hi.a("G", (boolean)false, (long)765835270298926806L);
                                                                        return;
                                                                    }
                                                                }
                                                                var5_3 /* !! */  = (u4.a(25822, 6785865203924874274L) * u4.a(6990, 9053267627672259012L) * u4.a(21108, 2082152901914329812L) ^ u4.a(24972, 3921745290161860877L)) + u4.a(8566, 7473358070949049627L) - u4.a(18785, 5231801998208702466L);
                                                            }
                                                            switch (var5_3 /* !! */ ) {
                                                                default: lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    hi.a("\u00a5", (Object)this, (Object)v5, (long)433704824712272587L);
                                                                    return;
                                                                }
                                                                case -1392698376: 
                                                            }
                                                            u4.l("pTiajDqPZyR9lRxG", P());
                                                            return;
                                                        }
lbl92:
                                                        // 2 sources

                                                        while (true) {
                                                            hi.a("G", (float)6.0f, (long)551872630485081828L);
                                                            return;
                                                        }
                                                    }
lbl97:
                                                    // 6 sources

                                                    block39: while (true) {
                                                        block83: {
                                                            switch (var5_3 /* !! */ ) {
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case -1087734870: {
                                                                    var4_5 = (vP)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                                                                    v6 /* !! */  = hi.a("\u00a5", u4.a(5162, 27836), (Object)hi.a("\u00a5", (Object)var4_5, (long)1012893017700285154L), (long)734234975012314075L);
                                                                    if (!var2_2) ** GOTO lbl120
                                                                    if (v6 /* !! */  != false) ** GOTO lbl119
                                                                    ** GOTO lbl122
                                                                }
                                                                case -1087734872: {
                                                                    ** GOTO lbl131
                                                                }
                                                                case -1087734873: {
                                                                    ** continue;
                                                                }
                                                                case -1087734871: {
                                                                    var4_5 = (vP)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                                                                    v7 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var4_5, (long)1012893017700285154L), (Object)var1_1, (long)734234975012314075L);
                                                                    if (!var2_2) ** GOTO lbl126
                                                                    if (v7 /* !! */  == false) ** GOTO lbl125
                                                                    ** GOTO lbl128
                                                                }
                                                                case -1087734869: {
                                                                    ** GOTO lbl92
                                                                }
lbl119:
                                                                // 1 sources

                                                                v6 /* !! */  = (CallSite)(u4.a(8351, 7821665101700624573L) - u4.a(19651, 1942079126535051661L) + u4.a(25729, 5973794572286375915L) ^ u4.a(12503, 681801311787279520L));
lbl120:
                                                                // 2 sources

                                                                var5_3 /* !! */  = (int)v6 /* !! */ ;
                                                                if (var2_2) break block83;
lbl122:
                                                                // 2 sources

                                                                var5_3 /* !! */  = (int)(hi.a("G", (int)(u4.a(31543, 797860706601021103L) * u4.a(20072, 1747083687706500124L) ^ u4.a(8463, 6995891781325845497L)), (int)u4.a(19650, 8917234322285795561L), (long)834203424483934088L) + u4.a(882, 5729127674158370854L));
                                                                if (var2_2) break block83;
                                                                ** GOTO lbl161
lbl125:
                                                                // 1 sources

                                                                v7 /* !! */  = (CallSite)(hi.a("G", (int)(u4.a(8203, 6478887505357600123L) * u4.a(28717, 7127191971776733788L)), (int)u4.a(32296, 5287613894468741741L), (long)834203424483934088L) / u4.a(11725, 4898740626741394818L) ^ u4.a(20900, 36149574098224586L) ^ u4.a(9948, 4467905317880132599L));
lbl126:
                                                                // 2 sources

                                                                var5_3 /* !! */  = (int)v7 /* !! */ ;
                                                                if (var2_2) break block83;
lbl128:
                                                                // 2 sources

                                                                var5_3 /* !! */  = u4.a(29824, 4751479252304308222L) - u4.a(15360, 7043653454299785564L) + u4.a(25527, 645806122653332335L) ^ u4.a(24146, 3599252194891992812L);
                                                                break block83;
lbl131:
                                                                // 2 sources

                                                                hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)669801794204839990L)}, (long)1191344772110161467L);
                                                                hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)597645201562828599L), (long)433704824712272587L);
                                                                return;
                                                                case -1087734867: 
                                                            }
                                                            return;
                                                        }
                                                        block40: while (true) {
                                                            switch (var5_3 /* !! */ ) {
                                                                default: {
                                                                    hi.a("\u00a5", (Object)var4_5, (Object)new Object[]{false}, (long)717159333591175622L);
                                                                    hi.a("\u00a5", (Object)var4_5, (Object)new Object[]{false}, (long)494028318362415033L);
                                                                    if (var2_2) break;
                                                                    ** GOTO lbl44
                                                                }
                                                                case 624685137: {
                                                                    ** GOTO lbl44
                                                                }
                                                                case 624685136: {
                                                                    v8 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)543613291937030899L);
                                                                    if (!var2_2) break block68;
                                                                    if (v8 /* !! */  != false) break block69;
                                                                    break block70;
                                                                }
                                                                case 624685135: {
                                                                    if (!var2_2) {
                                                                        ** continue;
                                                                    }
                                                                    break block71;
                                                                }
                                                                case 624685138: {
                                                                    hi.a("G", (long)414670365113859210L);
                                                                    var5_3 /* !! */  = (u4.a(29005, 6059018574334206961L) ^ u4.a(9397, 8841073121416017081L)) - u4.a(8261, 2675301207872533735L);
                                                                    continue block40;
                                                                }
                                                            }
lbl161:
                                                            // 2 sources

                                                            var5_3 /* !! */  = u4.a(11056, 9188288957008837602L) - u4.a(3510, 7766089608601917877L) + u4.a(19205, 444805183862447948L) ^ u4.a(3740, 3766092299669723800L);
                                                            if (!var2_2) break block39;
                                                        }
                                                        break;
                                                    }
                                                }
                                                var5_3 /* !! */  = (int)(hi.a("G", (int)u4.a(27259, 3449549458316803703L), (int)u4.a(22820, 3450153185426869185L), (long)834203424483934088L) / u4.a(13813, 9181340926782792805L) + u4.a(1276, 2709431416544088517L));
                                                if (var2_2) ** GOTO lbl97
                                            }
                                            var5_3 /* !! */  = (hi.a("G", (int)((u4.a(21292, 5284270143857885722L) ^ u4.a(17474, 236426875540772855L)) + u4.a(3362, 7524898797291198622L)), (int)u4.a(5434, 3372357043293667340L), (long)834203424483934088L) ^ u4.a(25126, 2374704516910264865L)) - u4.a(23161, 96477917269626689L);
                                            if (var2_2) ** GOTO lbl97
                                        }
                                        v2 /* !! */  = (CallSite)(u4.a(30718, 4702989949292324353L) + u4.a(5114, 3181902403653615693L) + u4.a(4444, 2957818335914869931L) + u4.a(14991, 1754387472901991269L));
                                    }
                                    var5_3 /* !! */  = (int)v2 /* !! */ ;
                                    if (var2_2) ** GOTO lbl97
                                }
                                var5_3 /* !! */  = u4.a(19671, 8952486753581834171L) * u4.a(11257, 7824711763418119841L) + u4.a(12305, 3807418834267071328L);
                                ** GOTO lbl97
                            }
                            v8 /* !! */  = (CallSite)((u4.a(6034, 8395945529964610549L) ^ u4.a(5160, 6188063401581855933L)) * u4.a(4471, 7608034376880341022L) * u4.a(5928, 5233423062058058935L) ^ u4.a(16214, 2553890047624244295L));
                        }
                        var5_3 /* !! */  = (int)v8 /* !! */ ;
                        if (var2_2) break block84;
                    }
                    var5_3 /* !! */  = u4.a(17753, 5631129193784120922L) * u4.a(18917, 9192739184140393301L) - u4.a(21254, 1188957318624544445L);
                    break block84;
                }
                var5_3 /* !! */  = (hi.a("G", (int)((u4.a(26069, 2286699338930499744L) ^ u4.a(11003, 5554305442341224072L)) + u4.a(12824, 6041983960121828016L)), (int)u4.a(31751, 8199679459479202252L), (long)834203424483934088L) ^ u4.a(910, 506382821681844505L)) - u4.a(16359, 5779033376904769348L);
                ** while (true)
            }
            block41: while (true) {
                switch (var5_3 /* !! */ ) {
                    default: {
                        v3 = true;
                        var5_3 /* !! */  = (u4.a(17377, 2250559420464435889L) - u4.a(12493, 8156629032165663445L) - u4.a(28818, 2754839513772827046L)) / u4.a(2071, 8873719142974642416L) / u4.a(19555, 3572186701621338065L) - u4.a(31388, 8141215916124909427L);
                        if (!var2_2) {
                            break block41;
                        }
                        break block72;
                    }
                    case 757018310: {
                        v3 = false;
                        if (var2_2) break block41;
                        ** GOTO lbl53
                    }
                    case 757018311: {
                        hi.a("G", (int)0, (int)u4.a(10911, 2495649901956888732L), (long)656208795491924261L);
                        var5_3 /* !! */  = (u4.a(27807, 3229794419269582167L) ^ u4.a(8948, 1465193951425818625L)) + u4.a(14304, 4147934501635023531L);
                        continue block41;
                    }
                }
                break;
            }
            var5_3 /* !! */  = (u4.a(31790, 6642650400012742116L) - u4.a(423, 593548058121523400L) - u4.a(31164, 1239077697124379773L)) / u4.a(2071, 8873719142974642416L) / u4.a(19555, 3572186701621338065L) - u4.a(28443, 5491704390847217511L);
        }
        switch (var5_3 /* !! */ ) {
            default: {
                ** continue;
            }
            case 673404580: 
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void g(Object[] var1_1) {
        block20: {
            block23: {
                block21: {
                    block22: {
                        var2_2 = Dl.t();
                        var5_3 /* !! */  = (u4.a(27632, 1663547761458854579L) / u4.a(11725, 4898740626741394818L) - u4.a(16388, 8021725428726305430L)) * u4.a(19375, 6020467987794041251L) + u4.a(25430, 8362935472936595581L);
                        if (var2_2) break block21;
                        v0 = var5_3 /* !! */ ;
                        if (var2_2) break block22;
                        switch (v0) {
                            default: {
                                break block21;
                            }
                            case -1228622706: {
                                v0 = true;
                            }
                        }
                    }
                    hi.a("G", (boolean)v0, (float)0.0f, (long)1038439073664936945L);
                    hi.a("G", (long)355962802566144244L);
                }
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1275384119516968842L), (long)699241984088282032L);
                var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                if (var2_2) break block23;
                var5_3 /* !! */  = (hi.a("G", (int)u4.a(16871, 5303379277176967190L), (int)u4.a(29347, 1797186778124101399L), (long)834203424483934088L) * u4.a(18885, 8085341747409919190L) / u4.a(2071, 8873719142974642416L) ^ u4.a(27662, 686974534611877283L)) - u4.a(24811, 5103170961050481542L);
                if (!var2_2) break block20;
                ** GOTO lbl30
            }
lbl26:
            // 2 sources

            while (true) {
                block25: {
                    block24: {
                        v1 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)984088978567310565L);
                        if (var2_2) break block24;
                        if (v1 /* !! */  != false) break block25;
lbl30:
                        // 2 sources

                        v1 /* !! */  = (CallSite)(var5_3 /* !! */  = (CallSite)((u4.a(8577, 2164065886259868353L) - u4.a(31297, 7302075062900074588L) - u4.a(7759, 5109810411272031048L)) * u4.a(6747, 1848385741536808937L) ^ u4.a(32457, 961769707099205143L) ^ u4.a(233, 6927741471489184570L)));
                    }
                    if (!var2_2) break block20;
                }
                var5_3 /* !! */  = (u4.a(12307, 6027041534603649354L) ^ u4.a(10043, 5546677905044796664L)) - u4.a(2438, 7711363842079284200L);
                break block20;
                break;
            }
lbl36:
            // 2 sources

            while (true) {
                hi.a("G", (float)-1.0f, (float)10.0f, (float)-1.0f, (float)1.0f, (long)796776827756410481L);
                hi.a("G", (long)802702781471349640L);
lbl40:
                // 2 sources

                while (var2_2) {
                    return;
                }
                ** GOTO lbl77
                break;
            }
        }
        while (true) {
            switch (var5_3 /* !! */  ? 1 : 0) {
                default: {
                    ** continue;
                }
                case 118189192: {
                    var4_5 = (vP)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                    v2 /* !! */  = u4.l("pTiajDqPZyR9lRxG", S(), (vP)var4_5);
                    if (var2_2) ** GOTO lbl54
                    if (v2 /* !! */  != false) ** GOTO lbl56
                    v2 /* !! */  = (CallSite)((u4.a(9971, 3491063051889734511L) / u4.a(27591, 506855209608854107L) * u4.a(1077, 7748126860517070663L) ^ u4.a(417, 1948471162599035815L)) / u4.a(19555, 3572186701621338065L) + u4.a(8163, 5103717059937651788L));
lbl54:
                    // 2 sources

                    var5_3 /* !! */  = (int)v2 /* !! */ ;
                    if (!var2_2) break;
lbl56:
                    // 2 sources

                    var5_3 /* !! */  = (u4.a(20375, 7924290573022502801L) / 2 ^ u4.a(8660, 8021767782695661655L)) * u4.a(18694, 516570668278061743L) ^ u4.a(24293, 1500580498963565445L) ^ u4.a(17645, 4682187331309868524L);
                    if (!var2_2) break;
                    ** GOTO lbl75
                }
                case 118189194: {
                    return;
                }
                case 118189193: {
                    return;
                }
            }
            do {
                switch (var5_3 /* !! */ ) {
                    default: {
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1275384119516968842L), (Object)u4.l("pTiajDqPZyR9lRxG", Y(), (vP)var4_5), (long)489810460382064611L);
                        if (!var2_2) break;
                        ** GOTO lbl36
                    }
                    case -1760276604: {
                        ** continue;
                    }
                    case -1760276603: {
                        ** GOTO lbl40
                    }
                }
lbl75:
                // 2 sources

                var5_3 /* !! */  = (u4.a(22306, 6657431430433965781L) / u4.a(27591, 506855209608854107L) * u4.a(11775, 8224243213982300664L) ^ u4.a(14524, 2777876356120897734L)) / u4.a(19555, 3572186701621338065L) + u4.a(21584, 1452293588774979440L);
            } while (!var2_2);
lbl77:
            // 2 sources

            var5_3 /* !! */  = (hi.a("G", (int)u4.a(25868, 4242693069673084250L), (int)u4.a(18332, 5614911065281041078L), (long)834203424483934088L) * u4.a(23149, 7417948761966676060L) / u4.a(2071, 8873719142974642416L) ^ u4.a(18060, 1195524104256099377L)) - u4.a(23842, 4508597979335527689L);
        }
    }

    /*
     * Exception decompiling
     */
    public boolean mouseReleased(MouseButtonEvent var1_1) {
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

    public static /* bridge */ /* synthetic */ CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private u4() {
        super((Component)u4.l("pTiajDqPZyR9lRxG", literal(java.lang.String ), (String)u4.a(5160, 17470)));
        this.F = new Ow((l5)((Object)hi.a("j", (long)791229020891128130L)));
        this.o = new _6();
        this.w = new _E((lH)((Object)hi.a("j", (long)447210230030827536L)), h);
        this.V = new dp(u4.a(31040, 8814814955597048283L));
        this.T = new y0();
        this.J = new HashSet<String>();
    }

    private float L(Object[] objectArray) {
        Object object = objectArray[0];
        return (float)hi.a("\u00a5", (Object)((Object)this), (Object)((vP)object), (float)(u4.l("pTiajDqPZyR9lRxG", M()) * 0.72f), (long)1107060992774926664L);
    }

    private void x(Object[] objectArray) {
        u4 u42 = this;
        hi.a("\u00f2", (Object)((Object)u42), (int)(hi.a("\u00e9", (Object)((Object)u42), (long)1131180864929461629L) + u4.a(29893, 6849000444088002215L)), (long)1131180864929461629L);
        hi.a("\u00f2", (Object)((Object)this), (zU)new zU(), (long)901658386266653190L);
    }

    private vP C(Object[] objectArray) {
        Object object = objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        u4.l("pTiajDqPZyR9lRxG", z(float float ), (vP)((vP)object), (float)f, (float)f2);
        hi.a("\u00a5", (Object)((vP)object), (Object)new Object[]{false}, (long)717159333591175622L);
        hi.a("\u00a5", (Object)((vP)object), (Object)new Object[]{false}, (long)494028318362415033L);
        return (vP)object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseClicked(MouseButtonEvent var1_1, boolean var2_2) {
        block43: {
            block42: {
                block41: {
                    var3_3 = Dl.S();
                    var14_4 /* !! */  = hi.a("G", (int)(u4.a(15388, 6567983474611678995L) * u4.a(12577, 8473667066504602275L) ^ u4.a(11666, 8546041035910446721L)), (int)u4.a(13006, 224724137904924335L), (long)834203424483934088L) ^ u4.a(26738, 8497086616318131168L);
                    if (!var3_3) ** GOTO lbl-1000
                    switch (var14_4 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var4_5 = hi.a("G", (Object)var1_1, (long)387410669818340308L);
                            var5_6 = hi.a("\u00a5", (Object)var4_5, (long)1321164245525494063L);
                            var7_7 = hi.a("\u00a5", (Object)var4_5, (long)1045026150751632794L);
                            var9_8 = hi.a("\u00a5", (Object)var4_5, (long)1304202693631103201L);
                            v0 = new Object[2];
                            v0[1] = var2_2;
                            v0[0] = var4_5;
                            v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)992215096265638109L), (Object)v0, (long)698490212489121946L);
                            if (!var3_3) ** GOTO lbl178
                            if (v1 /* !! */  == false) ** GOTO lbl177
                            ** GOTO lbl180
                        }
                        case -1800152865: {
                            throw null;
                        }
                    }
lbl20:
                    // 2 sources

                    while (true) {
                        block44: {
                            var10_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)417939159730395915L) - true;
                            if (!var3_3) break block44;
                            var14_4 /* !! */  = u4.a(1629, 1333879376451687506L) * u4.a(15267, 4737223025202130576L) ^ u4.a(28894, 2561744580634386644L);
                            if (var3_3) break block41;
                            ** GOTO lbl31
                        }
lbl27:
                        // 3 sources

                        while (true) {
                            block46: {
                                block45: {
                                    v2 /* !! */  = var10_9;
                                    if (!var3_3) break block45;
                                    if (v2 /* !! */  >= 0) break block46;
lbl31:
                                    // 2 sources

                                    v2 /* !! */  = (CallSite)(u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)(u4.a(28823, 5189145526398329913L) - u4.a(2610, 3576901850100882994L)), (int)u4.a(14548, 6524497553570556270L)), (int)u4.a(32651, 4672149936988564735L)) ^ u4.a(28782, 5662031941291680584L));
                                }
                                var14_4 /* !! */  = (int)v2 /* !! */ ;
                                if (var3_3) break block41;
                            }
                            var14_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)u4.a(372, 8966299694241141366L), (int)u4.a(27081, 6869557096267397587L), (long)834203424483934088L) - u4.a(18282, 6766984720024900411L)), (int)u4.a(19573, 8040688215484538678L), (long)834203424483934088L) ^ u4.a(22450, 724249961245837028L);
                            break block41;
                            break;
                        }
                        break;
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        block48: {
                            block47: {
                                var12_11 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)570438417053457860L), (Object)new Object[0], (long)956059696907860250L);
                                v3 /* !! */  = u4.l("pTiajDqPZyR9lRxG", G(double double int ), (vP)var11_10, (double)var5_6, (double)var7_7, (int)var9_8);
                                if (!var3_3) break block47;
                                if (v3 /* !! */  != false) break block48;
                                v3 /* !! */  = (CallSite)((u4.a(10957, 900280701935026117L) - u4.a(1740, 5091541279973496623L)) * u4.a(3191, 2754423419540854893L) - u4.a(13934, 3076260165004715741L));
                            }
                            var14_4 /* !! */  = (int)v3 /* !! */ ;
                            if (var3_3) ** GOTO lbl122
                        }
                        var14_4 /* !! */  = hi.a("G", (int)((u4.a(7959, 7136844182628224900L) ^ u4.a(1647, 5468815564939876107L)) + u4.a(26986, 8873766587407022692L) - u4.a(28512, 7645564076111904140L)), (int)u4.a(5059, 619045988406706247L), (long)834203424483934088L) ^ u4.a(7822, 2867700337796009189L);
                        if (var3_3) break block42;
                        ** GOTO lbl204
                        break;
                    }
lbl51:
                    // 2 sources

                    while (true) {
                        hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)669801794204839990L)}, (long)1191344772110161467L);
                        cfr_temp_0 = var12_11 - hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)570438417053457860L), (Object)new Object[0], (long)956059696907860250L);
                        v4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (!var3_3) ** GOTO lbl217
                        if (v4 != false) ** GOTO lbl216
                        ** GOTO lbl219
                        break;
                    }
lbl58:
                    // 11 sources

                    while (true) {
                        switch (var14_4 /* !! */ ) {
                            default: {
                                hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)1203662346844571369L), (long)433704824712272587L);
                                return true;
                            }
                            case 799191722: {
                                v5 /* !! */  = var9_8;
                                if (!var3_3) ** GOTO lbl183
                                if (v5 /* !! */  != false) ** GOTO lbl182
                                ** GOTO lbl185
                            }
                            case 799191717: {
                                v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (double)var5_6, (double)var7_7, (float)u4.l("pTiajDqPZyR9lRxG", L(), (u4)this), (float)hi.a("\u00a5", (Object)this, (long)1103199697574428242L), (float)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)643459240536420126L), (float)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)753383085489382820L), (long)504308767754376974L);
                                if (!var3_3) ** GOTO lbl188
                                if (v6 /* !! */  == false) ** GOTO lbl187
                                ** GOTO lbl190
                            }
                            case 799191721: {
                                break;
                            }
                            case 799191719: {
                                v7 /* !! */  = var9_8;
                                if (!var3_3) ** GOTO lbl193
                                if (v7 /* !! */  != false) ** GOTO lbl192
                                ** GOTO lbl195
                            }
                            case 799191718: {
                                v8 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (long)1190607133431666050L);
                                if (!var3_3) ** GOTO lbl198
                                if (v8 /* !! */  == false) ** GOTO lbl197
                                ** GOTO lbl200
                            }
                            case 799191725: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (long)473572582501778629L);
                                if (var3_3) ** GOTO lbl202
                                ** GOTO lbl20
                            }
                            case 799191723: {
                                ** continue;
                            }
                            case 799191720: {
                                hi.a("G", (float)0.0f, (float)100.0f, (long)1060325894040809393L);
                            }
                        }
                        hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)543566076446335695L), (long)433704824712272587L);
                        return true;
                    }
                }
lbl98:
                // 2 sources

                while (true) {
                    block49: {
                        switch (var14_4 /* !! */ ) {
                            default: {
                                ** GOTO lbl27
                            }
                            case -1232897553: {
                                var11_10 = (vP)u4.l("pTiajDqPZyR9lRxG", get(int ), (List)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (int)var10_9);
                                v9 = hi.a("\u00a5", (Object)var11_10, (long)543613291937030899L);
                                if (!var3_3) ** GOTO lbl115
                                if (v9 != false) ** GOTO lbl114
                                ** GOTO lbl117
                            }
                            case -1232897554: {
                                hi.a("G", (long)437292628650123400L);
                                hi.a("G", (long)1058499983070318781L);
                                ** continue;
                            }
lbl114:
                            // 1 sources

                            v9 = hi.a("G", (int)hi.a("G", (int)(u4.a(3042, 8381702841470540436L) - u4.a(3077, 8183303318603324500L)), (int)u4.a(12620, 9008496288487695452L), (long)834203424483934088L), (int)u4.a(27595, 186007617195752116L), (long)834203424483934088L) + u4.a(11579, 3594090602021649970L);
lbl115:
                            // 2 sources

                            var14_4 /* !! */  = (int)v9;
                            if (var3_3) break block49;
lbl117:
                            // 2 sources

                            var14_4 /* !! */  = u4.a(31860, 1331118229708517297L) * u4.a(361, 553617878818510120L) * u4.a(27239, 6924849673774774803L) + u4.a(6947, 4441819910256544503L) - u4.a(27476, 6571642188880068143L);
                            if (var3_3) break block49;
                            ** GOTO lbl143
                            case -1232897555: 
                        }
                        return super.mouseClicked((MouseButtonEvent)var4_5, var2_2);
                    }
                    block36: while (true) {
                        switch (var14_4 /* !! */ ) {
                            default: {
                                if (var3_3) break;
                                ** GOTO lbl38
                            }
                            case -2103255928: {
                                ** continue;
                            }
                            case -2103255929: {
                                --var10_9;
                                if (!var3_3) {
                                    return super.mouseClicked((MouseButtonEvent)var4_5, var2_2);
                                }
                                break block43;
                            }
                            case -2103255927: {
                                hi.a("G", (int)1, (long)683539552130499618L);
                                hi.a("G", (long)964250018269559427L);
                                var14_4 /* !! */  = u4.a(29182, 3061996080830981312L) + u4.a(30015, 8724393087262991492L) ^ u4.a(11289, 7785465619271516131L);
                                continue block36;
                            }
                        }
lbl143:
                        // 2 sources

                        var14_4 /* !! */  = (u4.a(9854, 9121806502953808589L) - u4.a(6965, 6437954256290663007L)) * u4.a(9294, 5887348921373454456L) - u4.a(11679, 2981496369411096074L);
                    }
                    break;
                }
            }
            do lbl-1000:
            // 8 sources

            {
                block54: {
                    block53: {
                        block52: {
                            block50: {
                                block51: {
                                    switch (var14_4 /* !! */ ) {
                                        default: {
                                            v10 = var10_9;
                                            v11 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)417939159730395915L) - true;
                                            if (!var3_3) break block50;
                                            if (v10 >= v11 /* !! */ ) break block51;
                                            break block52;
                                        }
                                        case -95077030: {
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (int)var10_9, (long)425652558447251471L);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (Object)var11_10, (long)615358212536192384L);
                                            if (var3_3) break block53;
                                            ** GOTO lbl51
                                        }
                                        case -95077032: {
                                            ** continue;
                                        }
                                        case -95077031: {
                                            hi.a("\u00a5", (Object)this, (Object)new Object[]{(int)var9_8}, (long)924485156037941986L);
                                            if (!var3_3) {
                                                return true;
                                            }
                                            break block54;
                                        }
                                        case -95077028: {
                                            return true;
                                        }
                                        case -95077029: {
                                            hi.a("G", (long)513793135028248171L);
                                            hi.a("G", (long)801548298614655873L);
                                            var14_4 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)u4.a(11789, 7408532497369366006L), (int)u4.a(4548, 8752179154512855724L), (long)834203424483934088L), (int)u4.a(2902, 5539246816356096751L), (long)834203424483934088L) + u4.a(15228, 6497319820409007689L));
                                            if (var3_3) ** GOTO lbl-1000
                                        }
                                    }
lbl177:
                                    // 2 sources

                                    v1 /* !! */  = (CallSite)((u4.a(25811, 162371003067708605L) / 4 ^ u4.a(20918, 3959013364222100091L)) - u4.a(22346, 1950299801980733112L) - u4.a(29720, 4937479972292044408L));
lbl178:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)v1 /* !! */ ;
                                    if (var3_3) ** GOTO lbl58
lbl180:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)(hi.a("G", (int)((u4.a(4043, 454909672276221285L) + u4.a(2922, 717015776747085685L)) / u4.a(6041, 414971714435760649L)), (int)u4.a(2420, 4973848018434972780L), (long)834203424483934088L) + u4.a(21961, 6114358844702130258L));
                                    if (var3_3) ** GOTO lbl58
lbl182:
                                    // 2 sources

                                    v5 /* !! */  = (CallSite)((u4.a(23708, 6590146818160134449L) + u4.a(7076, 2891653059408187371L)) / 4 - u4.a(22834, 6060702728124172981L) - u4.a(30659, 6822542665008751915L) - u4.a(31081, 2160363779694405869L));
lbl183:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)v5 /* !! */ ;
                                    if (var3_3) ** GOTO lbl58
lbl185:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)(hi.a("G", (int)((u4.a(556, 3656076134341302252L) * u4.a(26952, 6674219544759909648L) ^ u4.a(13644, 8994541966447273711L)) * u4.a(2006, 1294658835817878347L)), (int)u4.a(6504, 677072711346670728L), (long)834203424483934088L) + u4.a(8374, 1209958509435875728L));
                                    if (var3_3) ** GOTO lbl58
lbl187:
                                    // 2 sources

                                    v6 /* !! */  = (CallSite)((u4.a(2677, 4513946114432753575L) + u4.a(28891, 2465001455448303097L)) / 4 - u4.a(14748, 2855496726589533665L) - u4.a(22018, 1031966371337438333L) - u4.a(11872, 3039635568552738187L));
lbl188:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)v6 /* !! */ ;
                                    if (var3_3) ** GOTO lbl58
lbl190:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)(u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)u4.a(539, 8804098878483486622L), (int)u4.a(22531, 4810190962601921350L)), (int)u4.a(12784, 1798804260827390445L)) + u4.a(11076, 9088177419161271824L));
                                    if (var3_3) ** GOTO lbl58
lbl192:
                                    // 2 sources

                                    v7 /* !! */  = (CallSite)(hi.a("G", (int)(u4.a(25509, 3327031514266842897L) ^ u4.a(18612, 4732611027208575513L)), (int)u4.a(20378, 8314722277918382892L), (long)834203424483934088L) ^ u4.a(27603, 9169121214083316710L));
lbl193:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)v7 /* !! */ ;
                                    if (var3_3) ** GOTO lbl58
lbl195:
                                    // 2 sources

                                    var14_4 /* !! */  = ((hi.a("G", (int)u4.a(6038, 77927046456919699L), (int)u4.a(32180, 7229317189158055166L), (long)834203424483934088L) ^ u4.a(11191, 2864620304400775907L)) + u4.a(29877, 3065961177083683071L)) * u4.a(13894, 4866081027968459365L) - u4.a(11734, 3306092557299809718L);
                                    if (var3_3) ** GOTO lbl58
lbl197:
                                    // 2 sources

                                    v8 /* !! */  = (CallSite)(hi.a("G", (int)(u4.a(437, 7871298070665220962L) ^ u4.a(12410, 8172530624553279754L)), (int)u4.a(866, 4974784640491018050L), (long)834203424483934088L) ^ u4.a(31103, 7043495450412984782L));
lbl198:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)v8 /* !! */ ;
                                    if (var3_3) ** GOTO lbl58
lbl200:
                                    // 2 sources

                                    var14_4 /* !! */  = (int)(hi.a("G", (int)u4.a(27568, 7234112355647928343L), (int)u4.a(23658, 4347947481045273953L), (long)834203424483934088L) + u4.a(27746, 6242174141055842733L));
                                    if (var3_3) ** GOTO lbl58
lbl202:
                                    // 2 sources

                                    var14_4 /* !! */  = hi.a("G", (int)(u4.a(437, 7871298070665220962L) ^ u4.a(12410, 8172530624553279754L)), (int)u4.a(866, 4974784640491018050L), (long)834203424483934088L) ^ u4.a(31103, 7043495450412984782L);
                                    ** continue;
                                }
                                v10 = u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)(hi.a("G", (int)u4.a(2618, 9060054293094095040L), (int)u4.a(10026, 562712214673978020L), (long)834203424483934088L) / u4.a(29893, 6849000444088002215L)), (int)u4.a(30542, 5439907915295303026L));
                                v11 /* !! */  = (reference)u4.a(32728, 8843653491644312207L);
                            }
                            var14_4 /* !! */  = (int)(v10 - v11 /* !! */ );
                            if (var3_3) ** GOTO lbl-1000
                        }
                        var14_4 /* !! */  = (u4.a(16344, 558178389696408796L) ^ u4.a(12552, 1344153845460886032L) ^ u4.a(9166, 6355617831530197844L)) * u4.a(31736, 6269843689483284135L) - u4.a(14719, 641207823906368558L);
                        if (var3_3) ** GOTO lbl-1000
                    }
                    var14_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)u4.a(26353, 4253190171895477179L), (int)u4.a(15823, 441612452702678381L), (long)834203424483934088L) / u4.a(29893, 6849000444088002215L)), (int)u4.a(13062, 8048277441675945581L), (long)834203424483934088L) - u4.a(23989, 3388420722509711851L));
                    if (var3_3) ** GOTO lbl-1000
lbl216:
                    // 2 sources

                    v4 = hi.a("G", (int)(u4.a(9674, 3820729774802596237L) ^ u4.a(23681, 6509405916215349172L)), (int)u4.a(18302, 6660036501007504491L), (long)834203424483934088L) * u4.a(8201, 8061896325262439441L) - u4.a(23609, 8859557209573526556L);
lbl217:
                    // 2 sources

                    var14_4 /* !! */  = (int)v4;
                    if (var3_3) ** GOTO lbl-1000
lbl219:
                    // 2 sources

                    var14_4 /* !! */  = (u4.a(12346, 3514655498885521880L) * u4.a(2604, 5525323382003882734L) + u4.a(20833, 8577538462279336112L)) / u4.a(13813, 9181340926782792805L) + u4.a(2002, 5040014899781555724L);
                    if (var3_3) ** GOTO lbl-1000
                }
                var14_4 /* !! */  = (int)(hi.a("G", (int)(u4.a(23496, 5110211941338745754L) ^ u4.a(11242, 7857082704791371594L)), (int)u4.a(2927, 3815433330178120667L), (long)834203424483934088L) * u4.a(10570, 4503592595195853128L) - u4.a(17695, 7284751738296866376L));
            } while (var3_3);
        }
        var14_4 /* !! */  = u4.a(3074, 7844402246570762182L) * u4.a(24255, 9143696705410927821L) ^ u4.a(14069, 6664372898263294733L);
        ** while (true)
    }

    public void N(Object[] objectArray) {
        Xe xe = (Xe)objectArray[0];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = Float.valueOf((float)hi.a("G", (float)300.0f, (float)(hi.a("G", (long)1101389884075884739L) - 28.0f), (long)971000971621905228L));
        objectArray2[0] = Float.valueOf((float)hi.a("G", (float)360.0f, (float)(hi.a("G", (long)1052312102167579273L) - 28.0f), (long)971000971621905228L));
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)992215096265638109L), (Object)objectArray2, (long)1032244419502627218L);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = xe;
        objectArray3[0] = callSite;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)992215096265638109L), (Object)new Object[]{hi.a("G", (Object)objectArray3, (long)797033255099012255L)}, (long)685365308510818775L);
        hi.a("\u00a5", (Object)((Object)this), (Object)hi.a("j", (long)1158716554595397923L), (long)433704824712272587L);
    }

    private void lambda$drawGui$0(vP vP2, zU zU2) {
        Object[] objectArray = new Object[2];
        objectArray[1] = hi.a("\u00e9", (Object)((Object)this), (long)924146795458613566L);
        objectArray[0] = zU2;
        hi.a("\u00a5", (Object)vP2, (Object)objectArray, (long)370770414491653131L);
    }

    private boolean e() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)669801794204839990L), (long)415197394286909465L), u4::lambda$anySubPanelVisible$0, (long)805579658527532940L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseScrolled(double var1_1, double var3_2, double var5_3, double var7_4) {
        var9_5 = Dl.t();
        var16_6 /* !! */  = (u4.a(31013, 9082174807727778545L) * u4.a(23429, 7947051713148620330L) + u4.a(11553, 1430720009280257226L)) * u4.a(25064, 2453239779346395518L) + u4.a(1111, 5086136494607553910L);
        if (var9_5) ** GOTO lbl-1000
        v0 = var16_6 /* !! */ ;
        if (var9_5 != false) return v0;
        switch (v0) {
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
                v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)992215096265638109L), (Object)v1, (long)472110698065940720L);
                if (var9_5) ** GOTO lbl112
                if (v2 /* !! */  == false) ** GOTO lbl111
                ** GOTO lbl113
            }
            case 975486020: {
                hi.a("G", (long)602162150318222526L);
                hi.a("G", (long)1147339583020672972L);
                return true;
            }
        }
lbl29:
        // 2 sources

        while (true) {
            v3 /* !! */  = var14_9;
            if (var9_5) ** GOTO lbl59
            if (v3 /* !! */  < 0) ** GOTO lbl58
            if (true) ** GOTO lbl61
            break;
        }
lbl34:
        // 2 sources

        while (true) {
            v4 /* !! */  = u4.l("pTiajDqPZyR9lRxG", t(double double double ), (vP)var15_10, (double)var10_7, (double)var12_8, (double)var7_4);
            if (var9_5) ** GOTO lbl119
            if (v4 /* !! */  == false) ** GOTO lbl118
            ** GOTO lbl121
            break;
        }
        block20: while (true) {
            block25: {
                v5 /* !! */  = var16_6 /* !! */ ;
                if (var9_5 != false) return v5 /* !! */ ;
                switch (v5 /* !! */  ? 1 : 0) {
                    default: {
                        v6 = new Object[1];
                        v6[0] = var7_4;
                        hi.a("\u00a5", (Object)this, (Object)v6, (long)1139481758260483456L);
                        return true;
                    }
                    case 1024304154: {
                        var14_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)417939159730395915L) - true;
                        if (!var9_5) break;
                        ** GOTO lbl29
                    }
                    case 1024304155: {
                        throw null;
                    }
                }
                var16_6 /* !! */  = hi.a("G", (int)u4.a(1486, 5751103806096790805L), (int)u4.a(1192, 4774885990433805404L), (long)834203424483934088L) + u4.a(31720, 6289753766992620157L) ^ u4.a(13452, 23263392304097115L);
                if (!var9_5) break block25;
lbl58:
                // 2 sources

                v3 /* !! */  = (reference)((u4.a(21663, 3118158663972193320L) / u4.a(994, 3504592721572974776L) * u4.a(9535, 3633041250483794183L) - u4.a(22078, 2110900616732739465L)) / 3 - u4.a(1260, 8310987539140433722L));
lbl59:
                // 2 sources

                var16_6 /* !! */  = (int)v3 /* !! */ ;
                if (!var9_5) break block25;
lbl61:
                // 2 sources

                var16_6 /* !! */  = (int)(hi.a("G", (int)u4.a(11059, 3709009674614700196L), (int)u4.a(27074, 1216399030817635750L), (long)834203424483934088L) / u4.a(30272, 7954503872998319187L) - u4.a(20833, 7231615125236810937L));
            }
            while (true) {
                block26: {
                    switch (var16_6 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -1874969563: {
                            var15_10 = (vP)u4.l("pTiajDqPZyR9lRxG", get(int ), (List)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (int)var14_9);
                            v7 /* !! */  = hi.a("\u00a5", (Object)var15_10, (long)543613291937030899L);
                            if (var9_5) ** GOTO lbl80
                            if (v7 /* !! */  != false) ** GOTO lbl79
                            ** GOTO lbl82
                        }
                        case -1874969560: {
                            hi.a("G", (int)u4.a(6041, 414971714435760649L), (long)990575212213547553L);
                            u4.l("pTiajDqPZyR9lRxG", X(int ), (int)2);
                            return super.mouseScrolled((double)var10_7, (double)var12_8, var5_3, var7_4);
                        }
lbl79:
                        // 1 sources

                        v7 /* !! */  = (CallSite)((u4.a(29258, 4491004885124620985L) ^ u4.a(23495, 2084167534240730698L)) - u4.a(32111, 8218834687314275379L) ^ u4.a(4229, 2129439140636345376L));
lbl80:
                        // 2 sources

                        var16_6 /* !! */  = (int)v7 /* !! */ ;
                        if (!var9_5) break block26;
lbl82:
                        // 2 sources

                        var16_6 /* !! */  = (hi.a("G", (int)(u4.a(11150, 2331394297716637645L) - u4.a(685, 9163062095160397967L) ^ u4.a(11408, 1190655275334074133L)), (int)u4.a(5963, 4449287613357016141L), (long)834203424483934088L) ^ u4.a(11332, 6602323622504332900L)) + u4.a(25080, 1131529789632295811L);
                        if (!var9_5) break block26;
                        ** GOTO lbl115
                        case -1874969561: 
                    }
                    return super.mouseScrolled((double)var10_7, (double)var12_8, var5_3, var7_4);
                }
                block22: do lbl-1000:
                // 5 sources

                {
                    block27: {
                        switch (var16_6 /* !! */ ) {
                            default: {
                                if (!var9_5) break block27;
                                ** GOTO lbl34
                            }
                            case -1626284839: {
                                ** continue;
                            }
                            case -1626284842: {
                                v8 = new Object[1];
                                v8[0] = var7_4;
                                hi.a("\u00a5", (Object)this, (Object)v8, (long)1139481758260483456L);
                                return true;
                            }
                            case -1626284840: {
                                --var14_9;
                                if (!var9_5) break block22;
                                return super.mouseScrolled((double)var10_7, (double)var12_8, var5_3, var7_4);
                            }
                            case -1626284843: {
                                hi.a("G", (long)393077516895504904L);
                                var16_6 /* !! */  = u4.a(19924, 8461476879476465085L) * u4.a(16549, 7264889038920782565L) * u4.a(14451, 6564519381263608809L) / 2 * u4.a(7389, 1730040553493318784L) - u4.a(20777, 4979872092404351748L);
                                if (!var9_5) ** GOTO lbl-1000
                            }
                        }
lbl111:
                        // 2 sources

                        v2 /* !! */  = (CallSite)(var16_6 /* !! */  = (CallSite)((u4.a(24594, 3138908482221028385L) ^ u4.a(28901, 2269921026979046255L)) + u4.a(5658, 3050629419066344667L) - u4.a(31743, 5661285237911924659L)));
lbl112:
                        // 2 sources

                        if (!var9_5) continue block20;
lbl113:
                        // 2 sources

                        var16_6 /* !! */  = u4.a(14721, 3428502894260775009L) + u4.a(28324, 4325454478602092360L) - u4.a(23783, 1332847910209097680L);
                        continue block20;
                    }
                    var16_6 /* !! */  = (u4.a(23338, 3276219371393125966L) - u4.a(3626, 5578277099642609528L)) / u4.a(17353, 4883691124845876070L) * u4.a(23828, 7444396800247991669L) ^ u4.a(24895, 1742869348454446316L);
                    if (!var9_5) ** GOTO lbl-1000
lbl118:
                    // 2 sources

                    v4 /* !! */  = (CallSite)((u4.a(16389, 2754539842603323810L) - u4.a(6255, 5938315072537087452L)) / u4.a(17353, 4883691124845876070L) * u4.a(16727, 7215930970311791784L) ^ u4.a(18991, 772880170879851256L));
lbl119:
                    // 2 sources

                    var16_6 /* !! */  = (int)v4 /* !! */ ;
                    if (!var9_5) ** GOTO lbl-1000
lbl121:
                    // 2 sources

                    var16_6 /* !! */  = u4.a(18210, 4892113736696402837L) - u4.a(13684, 4336531493794537728L) - u4.a(22432, 41940572911043522L);
                } while (!var9_5);
                var16_6 /* !! */  = hi.a("G", (int)u4.a(29997, 6409885421958373609L), (int)u4.a(11587, 1837656431494234062L), (long)834203424483934088L) + u4.a(27701, 2549923336336293841L) ^ u4.a(27751, 8297810804325104865L);
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void s() {
        block15: {
            var1_1 = Dl.S();
            var5_2 /* !! */  = hi.a("G", (int)((u4.a(14894, 2254300662637095428L) / 5 ^ u4.a(11830, 3076966813697965233L)) - u4.a(5053, 4539174595815752118L)), (int)u4.a(1798, 4282748196687107694L), (long)834203424483934088L) + u4.a(1446, 2798647392474060325L);
            if (!var1_1) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var2_3 = hi.a("G", (long)1101389884075884739L) * 0.72f;
                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                    if (var1_1) break;
                    break block15;
                }
                case 169715124: {
                    return;
                }
            }
            var5_2 /* !! */  = (reference)(hi.a("G", (int)(u4.a(18769, 6856895350981696750L) / u4.a(19555, 3572186701621338065L) ^ u4.a(12165, 7904423341305887403L)), (int)u4.a(21481, 3542639528890303089L), (long)834203424483934088L) ^ u4.a(19653, 4238302603064285564L));
            if (var1_1) ** GOTO lbl25
            ** GOTO lbl20
        }
        block8: while (true) {
            block18: {
                block17: {
                    block16: {
                        v0 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)984088978567310565L);
                        if (!var1_1) break block16;
                        if (v0 /* !! */  != false) break block17;
lbl20:
                        // 2 sources

                        v0 /* !! */  = var5_2 /* !! */  = (reference)(u4.a(1707, 3982924383538336272L) - u4.a(3485, 3282446457719675914L) + u4.a(5878, 516328909248349523L));
                    }
                    if (var1_1) break block18;
                }
                var5_2 /* !! */  = hi.a("G", (int)((u4.a(7631, 1501561026453456908L) - u4.a(13792, 2680422376582635770L)) / 4), (int)u4.a(17837, 7943032613498951233L), (long)834203424483934088L) - u4.a(16088, 6908754597654129426L) - u4.a(11375, 143624129575057493L);
            }
            block9: while (true) {
                switch (var5_2 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case -494596035: {
                        var4_5 = (vP)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                        hi.a("\u00a5", (Object)var4_5, (Object)new Object[]{Float.valueOf((float)u4.l("pTiajDqPZyR9lRxG", V(java.lang.Object float ), (u4)this, (Object)var4_5, (float)var2_3))}, (long)1034828108854264538L);
                        if (!var1_1) {
                            return;
                        }
                        ** GOTO lbl39
                    }
                    case -494596037: {
                        throw null;
                    }
lbl39:
                    // 1 sources

                    var5_2 /* !! */  = (reference)(u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)(u4.a(17307, 3757899729262351288L) / u4.a(19555, 3572186701621338065L) ^ u4.a(4880, 5716278419146522628L)), (int)u4.a(14792, 7645871470275553920L)) ^ u4.a(21170, 6812325982494130493L));
                    continue block9;
                    case -494596036: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void E(Object[] var1_1) {
        block16: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            var2_2 = (Double)var1_1[0];
                            var4_3 = Dl.S();
                            var5_4 = (u4.a(4085, 2287149640832638964L) * u4.a(2998, 1086794334203009998L) ^ u4.a(20317, 8388425190840377112L)) + u4.a(31464, 3415698427327949112L);
                            if (var4_3) break block17;
                            ** GOTO lbl-1000
                        }
                        v0 = var5_4;
                        if (!var4_3) ** GOTO lbl15
                        switch (v0) {
                            case 1193392684: lbl-1000:
                            // 2 sources

                            {
                                hi.a("G", (long)763209694749933009L);
                                v0 = 0;
lbl15:
                                // 2 sources

                                u4.l("pTiajDqPZyR9lRxG", a(boolean float ), (boolean)v0, (float)1.0f);
                                break;
                            }
                        }
                        v1 = (cfr_temp_0 = var2_2 - 0.0) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        if (!var4_3) break block18;
                        if (v1 >= 0) break block19;
                        var5_4 = (int)((double)(u4.a(18911, 3013722045450918812L) * u4.a(10296, 4423051253588720986L) ^ u4.a(19694, 3311586985651902754L) ^ u4.a(7467, 7041690988490509763L)));
                        v1 = var5_4;
                    }
                    if (var4_3) break block20;
                }
                var5_4 = hi.a("G", (int)hi.a("G", (int)u4.a(28574, 6404389985271267241L), (int)u4.a(22786, 4808483388440415355L), (long)834203424483934088L), (int)u4.a(24553, 8308984439918234766L), (long)834203424483934088L) ^ u4.a(20671, 6109739304561148505L);
            }
            block10: while (true) {
                switch (var5_4 ? 1 : 0) {
                    default: {
                        v2 = hi.a("j", (long)370549720774891894L);
                        var5_4 = (u4.a(11724, 2289485306455390353L) ^ u4.a(22808, 2575514270788717889L)) - u4.a(19277, 944681394675621476L);
                        if (!var4_3) {
                            break block10;
                        }
                        break block16;
                    }
                    case -614418740: {
                        v2 = hi.a("j", (long)669400933084822815L);
                        if (var4_3) break block10;
                        ** GOTO lbl-1000
                    }
                    case -614418742: {
                        hi.a("G", (long)357835453833397902L);
                        hi.a("G", (long)561066160558538168L);
                        var5_4 = u4.a(26131, 6609957987893555986L) * u4.a(25656, 248722968147571808L) + u4.a(22979, 2725718465953205718L) ^ u4.a(22457, 2990030251415569720L);
                        continue block10;
                    }
                }
                break;
            }
            var5_4 = (u4.a(13169, 5989091885046818329L) ^ u4.a(6923, 8948888465243261024L)) - u4.a(8003, 359377071538064451L);
        }
        switch (var5_4) {
            default: lbl-1000:
            // 2 sources

            {
                hi.a("\u00a5", (Object)this, (Object)v2, (long)433704824712272587L);
                return;
            }
            case 1938511926: 
        }
        hi.a("G", (double)1.0, (long)439999302750573161L);
    }

    /*
     * Exception decompiling
     */
    private void C(Object[] var1_1) {
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

    public void removed() {
        super.removed();
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)992215096265638109L), (Object)new Object[0], (long)532225526543774215L);
        u4.l("pTiajDqPZyR9lRxG", I(), (dp)((Object)hi.a("\u00e9", (Object)((Object)this), (long)842255329338200401L)));
        u4.l("pTiajDqPZyR9lRxG", B(), (u4)this);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)842255329338200401L), (long)473572582501778629L);
        hi.a("G", (long)414670365113859210L);
        hi.a("\u00f2", (Object)((Object)this), null, (long)1069321673429942123L);
    }

    /*
     * Exception decompiling
     */
    public boolean mouseDragged(MouseButtonEvent var1_1, double var2_2, double var4_3) {
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

    private void lambda$drawGui$1(vP vP2, int n, int n2, zU zU2) {
        Object[] objectArray = new Object[4];
        objectArray[3] = n2;
        objectArray[2] = n;
        objectArray[1] = hi.a("\u00e9", (Object)((Object)this), (long)924146795458613566L);
        objectArray[0] = zU2;
        hi.a("\u00a5", (Object)vP2, (Object)objectArray, (long)1209940557519708999L);
    }

    private void m(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        float f4 = ((Float)objectArray[4]).floatValue();
        Object object = objectArray[5];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Consumer)object;
        objectArray2[1] = new ih(f, f2, f3, f4);
        objectArray2[0] = bl;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)901658386266653190L), (Object)objectArray2, (long)869042146772271573L);
    }

    private void f(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)742865071587579341L);
        CallSite callSite = hi.a("\u00a5", (Object)((Object)this), (long)814380873692432890L);
        CallSite callSite2 = u4.l("pTiajDqPZyR9lRxG", c(), (u4)this);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)842255329338200401L), (Object)hi.a("\u00e9", (Object)((Object)this), (long)901658386266653190L), (Object)hi.a("\u00e9", (Object)((Object)this), (long)924146795458613566L), (float)callSite, (float)callSite2, (float)hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)643459240536420126L), (float)hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)753383085489382820L), (int)n, (int)n2, (Object)u4.l("pTiajDqPZyR9lRxG", a(), (uT)((Object)hi.a("j", (long)1129073613587931611L))), (float)0.58f, (long)596952978069528886L);
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)537761302337475922L);
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)948941432866701135L);
    }

    private float L() {
        return 20.0f;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean keyPressed(KeyEvent var1_1) {
        block94: {
            block95: {
                block117: {
                    block90: {
                        block89: {
                            block88: {
                                var2_2 = Dl.S();
                                var6_3 /* !! */  = hi.a("G", (int)(u4.a(24805, 5271534624226652605L) + u4.a(32764, 5803291822558489513L)), (int)u4.a(29548, 5809585774607475067L), (long)834203424483934088L) / 3 - u4.a(13295, 62370336382181590L);
                                if (var2_2) break block88;
lbl4:
                                // 2 sources

                                while (true) {
                                    block97: {
                                        block96: {
                                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)992215096265638109L), (Object)new Object[]{var1_1}, (long)1308824916970120241L);
                                            if (!var2_2) break block96;
                                            if (v0 /* !! */  != false) break block97;
                                            v0 /* !! */  = var6_3 /* !! */  = (reference)((u4.a(21338, 7701179491325609847L) ^ u4.a(12763, 2810798686870463860L)) + u4.a(19220, 6469920408409741873L));
                                        }
                                        if (var2_2) break block88;
                                    }
                                    var6_3 /* !! */  = (reference)((hi.a("G", (int)(u4.a(7666, 4602299269643094230L) - u4.a(29403, 6266319402017858357L)), (int)u4.a(3609, 3711078209213292308L), (long)834203424483934088L) ^ u4.a(19144, 1128710461860191007L)) / u4.a(6041, 414971714435760649L) + u4.a(13002, 5321627437000746850L));
                                    break block88;
                                    break;
                                }
lbl14:
                                // 2 sources

                                while (true) {
                                    v1 /* !! */  = u4.l("pTiajDqPZyR9lRxG", hasNext(), (Iterator)var4_5);
                                    if (!var2_2) ** GOTO lbl196
                                    if (v1 /* !! */  == false) ** GOTO lbl195
                                    ** GOTO lbl198
                                    break;
                                }
lbl19:
                                // 2 sources

                                while (true) {
                                    v2 = new Object[3];
                                    v2[2] = (int)hi.a("\u00a5", (Object)var1_1, (long)467516039285710079L);
                                    v2[1] = (int)hi.a("\u00a5", (Object)var1_1, (long)1312356386924423981L);
                                    v2[0] = (int)hi.a("\u00a5", (Object)var1_1, (long)1074920233927690084L);
                                    v3 /* !! */  = (int)hi.a("\u00a5", (Object)var5_6, (Object)v2, (long)359766996442178006L);
                                    if (!var2_2) ** GOTO lbl280
                                    if (v3 /* !! */  == 0) ** GOTO lbl279
                                    ** GOTO lbl282
                                    break;
                                }
lbl28:
                                // 2 sources

                                while (true) {
                                    v4 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1165402552935856797L);
                                    if (!var2_2) ** GOTO lbl295
                                    if (v4 /* !! */  == false) ** GOTO lbl294
                                    ** GOTO lbl296
                                    break;
                                }
lbl33:
                                // 2 sources

                                while (true) {
                                    v5 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)984088978567310565L);
                                    if (!var2_2) ** GOTO lbl204
                                    if (v5 /* !! */  == false) ** GOTO lbl203
                                    ** GOTO lbl205
                                    break;
                                }
lbl38:
                                // 2 sources

                                while (true) {
                                    v6 = new Object[3];
                                    v6[2] = (int)hi.a("\u00a5", (Object)var1_1, (long)467516039285710079L);
                                    v6[1] = (int)hi.a("\u00a5", (Object)var1_1, (long)1312356386924423981L);
                                    v6[0] = (int)hi.a("\u00a5", (Object)var1_1, (long)1074920233927690084L);
                                    v7 /* !! */  = hi.a("\u00a5", (Object)var5_6, (Object)v6, (long)359766996442178006L);
                                    if (!var2_2) ** GOTO lbl302
                                    if (v7 /* !! */  == false) ** GOTO lbl301
                                    ** GOTO lbl303
                                    break;
                                }
                            }
                            block59: while (true) {
                                block114: {
                                    block112: {
                                        block113: {
                                            block111: {
                                                block109: {
                                                    block110: {
                                                        block108: {
                                                            block106: {
                                                                block107: {
                                                                    block105: {
                                                                        block103: {
                                                                            block104: {
                                                                                block102: {
                                                                                    block100: {
                                                                                        block101: {
                                                                                            block116: {
                                                                                                block115: {
                                                                                                    block99: {
                                                                                                        block98: {
                                                                                                            switch (var6_3 /* !! */ ) {
                                                                                                                default: {
                                                                                                                    ** continue;
                                                                                                                }
                                                                                                                case 1048970677: {
                                                                                                                    v8 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1165402552935856797L);
                                                                                                                    if (!var2_2) break block98;
                                                                                                                    if (v8 /* !! */  == false) break;
                                                                                                                    break block99;
                                                                                                                }
                                                                                                                case 1048970670: {
                                                                                                                    v9 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1074920233927690084L);
                                                                                                                    v10 = u4.a(18243, 1072740724580094975L);
                                                                                                                    if (!var2_2) break block100;
                                                                                                                    if (v9 /* !! */  != v10) break block101;
                                                                                                                    break block102;
                                                                                                                }
                                                                                                                case 1048970673: {
                                                                                                                    v11 /* !! */  = hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1224104592017354011L), (long)501728103734382890L), (int)u4.a(25284, 5851083798309417644L), (long)396354291557487238L);
                                                                                                                    if (!var2_2) break block103;
                                                                                                                    if (v11 /* !! */  == false) break block104;
                                                                                                                    break block105;
                                                                                                                }
                                                                                                                case 1048970674: {
                                                                                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (Object)new Object[0], (long)1284629606148050412L);
                                                                                                                    hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)543566076446335695L), (long)433704824712272587L);
                                                                                                                    return true;
                                                                                                                }
                                                                                                                case 1048970672: {
                                                                                                                    v12 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (long)1190607133431666050L);
                                                                                                                    if (!var2_2) break block106;
                                                                                                                    if (v12 /* !! */  == false) break block107;
                                                                                                                    break block108;
                                                                                                                }
                                                                                                                case 1048970669: {
                                                                                                                    v13 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1165402552935856797L);
                                                                                                                    if (!var2_2) break block109;
                                                                                                                    if (v13 /* !! */  == false) break block110;
                                                                                                                    break block111;
                                                                                                                }
                                                                                                                case 1048970676: {
                                                                                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (long)473572582501778629L);
                                                                                                                    hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)771535224685464789L), (long)433704824712272587L);
                                                                                                                    return true;
                                                                                                                }
                                                                                                                case 1048970668: {
                                                                                                                    v14 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (Object)new Object[]{var1_1}, (long)572797178382722460L);
                                                                                                                    if (!var2_2) break block112;
                                                                                                                    if (v14 /* !! */  == false) break block113;
                                                                                                                    break block114;
                                                                                                                }
                                                                                                                case 1048970667: {
                                                                                                                    hi.a("\u00a5", (Object)this, (long)439254618482708644L);
                                                                                                                    hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)543566076446335695L), (long)433704824712272587L);
                                                                                                                    return true;
                                                                                                                }
                                                                                                                case 1048970675: {
                                                                                                                    v15 /* !! */  = var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)415197394286909465L), (Predicate<vP>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, S(), (Lcom/github/epsilon/vP;)Z)(), (long)1143211481283200773L), (Predicate<vP>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, v(), (Lcom/github/epsilon/vP;)Z)(), (long)805579658527532940L);
                                                                                                                    if (!var2_2) break block89;
                                                                                                                    if (v15 /* !! */  == false) break block59;
                                                                                                                    break block90;
                                                                                                                }
                                                                                                                case 1048970671: {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            }
                                                                                                            v8 /* !! */  = var6_3 /* !! */  = (reference)(u4.a(159, 8740708129637062074L) / 4 + u4.a(13504, 4217973272539522595L));
                                                                                                        }
                                                                                                        if (var2_2) break block115;
                                                                                                    }
                                                                                                    var6_3 /* !! */  = (reference)((u4.a(32228, 8778663767030409561L) ^ u4.a(21762, 5284004977588602830L)) + u4.a(17520, 3567473609201979765L));
                                                                                                }
                                                                                                switch (var6_3 /* !! */ ) {
                                                                                                    default: {
                                                                                                        v16 = hi.a("j", (long)771535224685464789L);
                                                                                                        var6_3 /* !! */  = u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)u4.a(2541, 3230999245267131088L), (int)u4.a(23010, 3931594117810686311L)) - u4.a(27544, 4862069280798097356L);
                                                                                                        if (!var2_2) {
                                                                                                            break;
                                                                                                        }
                                                                                                        break block116;
                                                                                                    }
                                                                                                    case 527102403: {
                                                                                                        v16 = hi.a("j", (long)1203662346844571369L);
                                                                                                        if (var2_2) break;
                                                                                                        ** GOTO lbl-1000
                                                                                                    }
                                                                                                    case 527102404: {
                                                                                                        return false;
                                                                                                    }
                                                                                                }
                                                                                                var6_3 /* !! */  = hi.a("G", (int)u4.a(29024, 4114990372759348562L), (int)u4.a(14792, 5774949755368040460L), (long)834203424483934088L) - u4.a(14763, 6601437998624598614L);
                                                                                            }
                                                                                            switch (var6_3 /* !! */ ) {
                                                                                                default: lbl-1000:
                                                                                                // 2 sources

                                                                                                {
                                                                                                    hi.a("\u00a5", (Object)this, (Object)v16, (long)433704824712272587L);
                                                                                                    return true;
                                                                                                }
                                                                                                case -315490154: 
                                                                                            }
                                                                                            return (boolean)hi.a("G", (long)700213693910295881L);
                                                                                        }
                                                                                        v9 /* !! */  = (CallSite)((u4.a(31247, 2650330953010129049L) * u4.a(8915, 7822556842719081289L) ^ u4.a(2365, 6072511481144760576L)) * u4.a(24512, 268262336896896185L));
                                                                                        v10 = u4.a(20661, 1609774413424592098L);
                                                                                    }
                                                                                    var6_3 /* !! */  = (reference)(v9 /* !! */  ^ v10);
                                                                                    if (var2_2) continue;
                                                                                }
                                                                                var6_3 /* !! */  = (reference)((u4.a(6345, 2389230576518843153L) + u4.a(2833, 5344569490215589904L) + u4.a(4462, 5879631304827356195L) + u4.a(9870, 5678527348425914034L)) / u4.a(11725, 4898740626741394818L) + u4.a(14059, 6343616574051083365L));
                                                                                if (var2_2) continue;
                                                                            }
                                                                            v11 /* !! */  = var6_3 /* !! */  = (reference)((u4.a(15078, 9005492611946606475L) * u4.a(3758, 465993575619222682L) ^ u4.a(19063, 7202195665273690996L)) * u4.a(3381, 4356258206502051083L) ^ u4.a(12656, 1318303964988662936L));
                                                                        }
                                                                        if (var2_2) continue;
                                                                    }
                                                                    var6_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)u4.a(21719, 5254590243957212284L), (int)u4.a(5904, 6191270733381191263L), (long)834203424483934088L) + u4.a(29931, 6080414304252043519L)), (int)u4.a(12314, 4537249739089502497L), (long)834203424483934088L) + u4.a(12308, 5952896373719851452L);
                                                                    if (var2_2) continue;
                                                                }
                                                                v12 /* !! */  = var6_3 /* !! */  = (reference)((u4.a(19075, 2582378330931731106L) ^ u4.a(25978, 1425890296319946975L)) + u4.a(14485, 1852609738087820729L));
                                                            }
                                                            if (var2_2) continue;
                                                        }
                                                        var6_3 /* !! */  = (reference)(((u4.a(25712, 5322004464083349820L) + u4.a(26425, 8671698251798688484L)) / u4.a(30272, 7954503872998319187L) ^ u4.a(20834, 1822663866406404319L)) * u4.a(439, 5450227702813512935L) - u4.a(2437, 1667362572662692946L));
                                                        if (var2_2) continue;
                                                    }
                                                    v13 /* !! */  = var6_3 /* !! */  = (reference)(u4.a(10921, 4786199515518369775L) + u4.a(24834, 2288156932631966632L) ^ u4.a(22496, 2383975055716943311L));
                                                }
                                                if (var2_2) continue;
                                            }
                                            var6_3 /* !! */  = (reference)(u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)(u4.a(12078, 6536743317878537015L) * u4.a(27742, 4804907036570204282L)), (int)u4.a(5896, 327153331430507081L)) * u4.a(15345, 2225778188032765907L) ^ u4.a(14015, 6555950841258960109L));
                                            if (var2_2) continue;
                                        }
                                        v14 /* !! */  = var6_3 /* !! */  = (reference)((u4.a(1139, 6111713940676367725L) ^ u4.a(14452, 3966227518237141360L)) + u4.a(10316, 2130386650506427299L));
                                    }
                                    if (var2_2) continue;
                                }
                                var6_3 /* !! */  = (reference)(u4.a(8251, 5646835593720918020L) + u4.a(29201, 6218615486365278320L) - u4.a(28292, 4927277454424456242L) - u4.a(14776, 2408034525177571384L) + u4.a(30664, 7689070578131870398L));
                            }
                            v15 /* !! */  = var6_3 /* !! */  = hi.a("G", (int)(u4.a(15005, 354498723301386620L) + u4.a(24021, 1485248533032734476L)), (int)u4.a(21421, 8066706793032090181L), (long)834203424483934088L) / u4.a(11725, 4898740626741394818L) + u4.a(5238, 2480333340070954124L) - u4.a(8242, 3085500384342078198L);
                        }
                        if (var2_2) break block117;
                    }
                    var6_3 /* !! */  = (reference)(u4.a(30847, 9166866451808824223L) / u4.a(19555, 3572186701621338065L) + u4.a(678, 3519051301713466339L));
                }
                block60: while (true) {
                    block119: {
                        block118: {
                            switch (var6_3 /* !! */ ) {
                                default: {
                                    var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                                    if (var2_2) break;
                                    ** GOTO lbl14
                                }
                                case 836366354: {
                                    ** GOTO lbl28
                                }
                                case 836366353: {
                                    hi.a("\u00a5", (Object)this, (long)618796015975410389L);
                                    return true;
                                }
                                case 836366355: {
                                    var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                                    if (var2_2) break block118;
                                    ** GOTO lbl33
                                }
                                case 836366357: {
                                    hi.a("G", (float)100.0f, (float)-1.0f, (float)0.0f, (float)9.0f, (float)16.0f, (long)1187820213443169771L);
                                    u4.l("pTiajDqPZyR9lRxG", N(int ), (int)u4.a(23517, 6861193887235967428L));
                                    return (boolean)hi.a("G", (int)u4.a(6389, 6662821491928058794L), (long)759451198843871681L);
                                }
                            }
                            var6_3 /* !! */  = (reference)(u4.a(25586, 5355556327299035557L) - u4.a(24139, 2614323954663950884L) + u4.a(3920, 2930695364072758581L));
                            if (var2_2) break block119;
lbl195:
                            // 2 sources

                            v1 /* !! */  = var6_3 /* !! */  = hi.a("G", (int)(u4.a(11295, 2352422714417806949L) + u4.a(16968, 4428934566362878771L)), (int)u4.a(25976, 5595555805394219154L), (long)834203424483934088L) / u4.a(11725, 4898740626741394818L) + u4.a(28104, 8728930605752204817L) - u4.a(5644, 7365902727653934079L);
lbl196:
                            // 2 sources

                            if (var2_2) continue;
lbl198:
                            // 2 sources

                            var6_3 /* !! */  = (reference)(hi.a("G", (int)(u4.a(16536, 5034613136928182784L) + u4.a(7658, 1136212972620402540L) ^ u4.a(12743, 7501792672301868406L) ^ u4.a(5730, 8755294869741422287L)), (int)u4.a(6200, 5250426219621174110L), (long)834203424483934088L) ^ u4.a(27846, 6599485068332416545L));
                            break block119;
                        }
                        var6_3 /* !! */  = u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)(u4.a(23894, 8740548399447936995L) * u4.a(4415, 6878339582301880499L)), (int)u4.a(20277, 7311896782386403876L)) + u4.a(11746, 2689014933988046984L);
                        if (var2_2) break block119;
lbl203:
                        // 2 sources

                        v5 /* !! */  = var6_3 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)u4.a(19846, 8467766476907486476L), (int)u4.a(30286, 2820921229013723095L), (long)834203424483934088L), (int)u4.a(24959, 6991010531604279370L), (long)834203424483934088L) ^ u4.a(27497, 2200855167699958274L) ^ u4.a(16119, 8046763139749932530L));
lbl204:
                        // 2 sources

                        if (var2_2) break block119;
lbl205:
                        // 2 sources

                        var6_3 /* !! */  = (reference)(u4.a(27896, 1400178566985268792L) - u4.a(20412, 1724697152036871228L) + u4.a(23474, 2067636877647317228L) + u4.a(14859, 3671268301410494928L) + u4.a(12744, 2356984572960104712L));
                    }
                    block61: while (true) {
                        block93: {
                            block92: {
                                block91: {
                                    block120: {
                                        switch (var6_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -2020465595: {
                                                var5_6 = (vP)hi.a("\u00a5", (Object)var4_5, (long)470012372636416268L);
                                                v17 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)543613291937030899L);
                                                if (!var2_2) ** GOTO lbl230
                                                if (v17 /* !! */  != false) ** GOTO lbl229
                                                ** GOTO lbl231
                                            }
                                            case -2020465596: {
                                                ** continue;
                                            }
                                            case -2020465591: {
                                                var5_6 = (vP)hi.a("\u00a5", (Object)var4_5, (long)470012372636416268L);
                                                v18 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)543613291937030899L);
                                                if (!var2_2) ** GOTO lbl235
                                                if (v18 /* !! */  != false) ** GOTO lbl234
                                                ** GOTO lbl236
                                            }
                                            case -2020465593: {
                                                hi.a("G", (long)399723549164886403L);
                                                return (boolean)hi.a("G", (long)1031195239253115725L);
                                            }
lbl229:
                                            // 1 sources

                                            v17 /* !! */  = var6_3 /* !! */  = hi.a("G", (int)(u4.a(15108, 8371792984426049368L) / 2), (int)u4.a(3709, 4543078298033676130L), (long)834203424483934088L) - u4.a(18433, 1033697903336036667L) - u4.a(4366, 3231668685307527317L);
lbl230:
                                            // 2 sources

                                            if (var2_2) break block120;
lbl231:
                                            // 2 sources

                                            var6_3 /* !! */  = (reference)(u4.a(24742, 6413232880437964875L) * u4.a(18209, 6982278122644018509L) * u4.a(28896, 7334035022086448610L) - u4.a(15066, 2724699481095072633L));
                                            if (var2_2) break block120;
                                            ** GOTO lbl277
lbl234:
                                            // 1 sources

                                            v18 /* !! */  = var6_3 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)(u4.a(31525, 3498629724411998056L) + u4.a(31964, 1380998915665866051L)), (int)u4.a(7231, 2745816758341750508L), (long)834203424483934088L), (int)u4.a(1461, 8461870656890623931L), (long)834203424483934088L) / u4.a(25125, 5921502028165656615L) ^ u4.a(3463, 3313800638125694062L));
lbl235:
                                            // 2 sources

                                            if (var2_2) break block120;
lbl236:
                                            // 2 sources

                                            var6_3 /* !! */  = (reference)((u4.a(15646, 4422275736124288957L) ^ u4.a(24493, 4878683498705620174L)) - u4.a(7113, 8190991718726323136L));
                                            if (var2_2) break block120;
                                            ** GOTO lbl298
                                            case -2020465594: 
                                        }
                                        return super.keyPressed(var1_1);
                                    }
                                    block62: while (true) {
                                        block125: {
                                            block124: {
                                                block123: {
                                                    block121: {
                                                        block122: {
                                                            switch (var6_3 /* !! */ ) {
                                                                default: {
                                                                    if (var2_2) break;
                                                                    ** GOTO lbl19
                                                                }
                                                                case -18189426: {
                                                                    ** continue;
                                                                }
                                                                case -18189421: {
                                                                    v19 = this;
                                                                    v20 /* !! */  = u4.l("pTiajDqPZyR9lRxG", isEscape(), (KeyEvent)var1_1);
                                                                    if (!var2_2) break block121;
                                                                    if (v20 /* !! */  == false) break block122;
                                                                    break block123;
                                                                }
                                                                case -18189422: {
                                                                    if (!var2_2) {
                                                                        ** continue;
                                                                    }
                                                                    break block124;
                                                                }
                                                                case -18189423: {
                                                                    if (var2_2) break block125;
                                                                    ** GOTO lbl38
                                                                }
                                                                case -18189420: {
                                                                    ** continue;
                                                                }
                                                                case -18189418: {
                                                                    v19 = this;
                                                                    v21 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1165402552935856797L);
                                                                    if (!var2_2) break block91;
                                                                    if (v21 /* !! */  == false) break block62;
                                                                    break block92;
                                                                }
                                                                case -18189424: {
                                                                    if (!var2_2) {
                                                                        return super.keyPressed(var1_1);
                                                                    }
                                                                    break block93;
                                                                }
                                                                case -18189419: {
                                                                    throw null;
                                                                }
                                                            }
lbl277:
                                                            // 2 sources

                                                            var6_3 /* !! */  = (reference)(u4.a(12774, 2483296719904989736L) - u4.a(23272, 942711087325547277L) + u4.a(10550, 3306985339498298612L));
                                                            if (var2_2) continue block61;
lbl279:
                                                            // 2 sources

                                                            v3 /* !! */  = (u4.a(32447, 9109525824833531641L) ^ u4.a(20793, 8607219376797515951L)) + u4.a(19957, 2654279349415911239L);
lbl280:
                                                            // 2 sources

                                                            var6_3 /* !! */  = (reference)v3 /* !! */ ;
                                                            if (var2_2) continue;
lbl282:
                                                            // 2 sources

                                                            var6_3 /* !! */  = (reference)(((u4.a(26038, 4189855660951581905L) ^ u4.a(3531, 296111421736050491L)) * u4.a(19935, 3470427390380580830L) ^ u4.a(14729, 1008578492845386896L) ^ u4.a(16287, 6136413748811524706L)) + u4.a(32350, 1304330168710507345L));
                                                            continue;
                                                        }
                                                        v20 /* !! */  = var6_3 /* !! */  = (reference)(u4.a(26601, 1839517267132625535L) + u4.a(7688, 269843824858910540L) - u4.a(30672, 2644730975468004220L));
                                                    }
                                                    if (var2_2) break block60;
                                                }
                                                var6_3 /* !! */  = (reference)((u4.a(4281, 3351666663734527417L) / 3 ^ u4.a(31158, 361566963371583996L)) - u4.a(32371, 8156185739399506665L));
                                                break block60;
                                            }
                                            var6_3 /* !! */  = (reference)(u4.a(12774, 2483296719904989736L) - u4.a(23272, 942711087325547277L) + u4.a(10550, 3306985339498298612L));
                                            if (var2_2) continue block61;
lbl294:
                                            // 2 sources

                                            v4 /* !! */  = var6_3 /* !! */  = (reference)(u4.a(23913, 273524008372505694L) + u4.a(27001, 1106476167732377791L) - u4.a(24223, 8974833986114718778L) - u4.a(12579, 8506330886203400199L) ^ u4.a(11407, 306369960152563408L));
lbl295:
                                            // 2 sources

                                            if (var2_2) continue block60;
lbl296:
                                            // 2 sources

                                            var6_3 /* !! */  = (reference)(((u4.a(25495, 1780103984404936355L) ^ u4.a(19862, 8047354640042957232L)) + u4.a(9324, 7991116113276825891L)) * u4.a(21989, 1968752719818295264L) * u4.a(8044, 4867639176831192888L) - u4.a(4354, 26499993261392595L));
                                            continue block60;
                                        }
                                        var6_3 /* !! */  = u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)(u4.a(5641, 5721251471243199400L) * u4.a(7820, 8508174731835625279L)), (int)u4.a(28550, 2633952354845310375L)) + u4.a(7636, 8564744997423499691L);
                                        if (var2_2) continue block61;
lbl301:
                                        // 2 sources

                                        v7 /* !! */  = var6_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)u4.a(10530, 1684263841733245618L), (int)u4.a(25509, 8941047336308815799L), (long)834203424483934088L) * u4.a(11382, 7897577271197695534L)), (int)u4.a(6829, 8008084880720645894L), (long)834203424483934088L) * u4.a(30174, 131111791084150917L) - u4.a(1492, 5298048770878985634L);
lbl302:
                                        // 2 sources

                                        if (var2_2) continue;
lbl303:
                                        // 2 sources

                                        var6_3 /* !! */  = (reference)((u4.a(8795, 5377220066004136214L) / u4.a(13813, 9181340926782792805L) * u4.a(15025, 4001020606776469740L) ^ u4.a(14614, 6954993636485032166L)) * u4.a(28544, 8585268097223507048L) ^ u4.a(5374, 3954828271178565433L));
                                    }
                                    v21 /* !! */  = var6_3 /* !! */  = (reference)(hi.a("G", (int)u4.a(12495, 4912244802171855571L), (int)u4.a(30575, 3894281726620673431L), (long)834203424483934088L) - u4.a(10140, 7420256120832062381L) ^ u4.a(7727, 834534660252191562L) ^ u4.a(31539, 420174657259581109L));
                                }
                                if (var2_2) break block60;
                            }
                            var6_3 /* !! */  = (reference)((u4.a(29618, 3887858635585331589L) / 3 * u4.a(8282, 2212771963693035751L) ^ u4.a(19609, 7511411003704614624L)) / u4.a(27591, 506855209608854107L) + u4.a(11802, 4101179634757237523L));
                            break block60;
                        }
                        var6_3 /* !! */  = hi.a("G", (int)(u4.a(5641, 5721251471243199400L) * u4.a(7820, 8508174731835625279L)), (int)u4.a(28550, 2633952354845310375L), (long)834203424483934088L) + u4.a(7636, 8564744997423499691L);
                    }
                    break;
                }
                block63: while (true) {
                    switch (var6_3 /* !! */ ) {
                        default: {
                            v22 = hi.a("j", (long)771535224685464789L);
                            var6_3 /* !! */  = (reference)((u4.a(2081, 1736855941223176274L) + u4.a(6733, 8134566817008012143L) ^ u4.a(25038, 794363719638365091L) ^ u4.a(11770, 8935419602442157448L)) + u4.a(4038, 4887630583995457011L) - u4.a(12607, 7695924023738131550L));
                            if (!var2_2) {
                                break block63;
                            }
                            break block94;
                        }
                        case 955398388: {
                            v22 = hi.a("j", (long)1203662346844571369L);
                            if (var2_2) break block63;
                            ** GOTO lbl-1000
                        }
                        case 955398385: {
                            v22 = hi.a("j", (long)771535224685464789L);
                            var6_3 /* !! */  = (reference)((u4.a(24848, 2684867387346137155L) / u4.a(11725, 4898740626741394818L) ^ u4.a(1241, 1470595861674678199L)) - u4.a(27384, 3280600368868309434L));
                            if (var2_2) break block94;
                            break block95;
                        }
                        case 955398387: {
                            v22 = hi.a("j", (long)1203662346844571369L);
                            if (var2_2) break block95;
                            ** GOTO lbl-1000
                        }
                        case 955398384: {
                            hi.a("G", (long)877399517904373040L);
                            var6_3 /* !! */  = hi.a("G", (int)(u4.a(29973, 119455418909206264L) * u4.a(20646, 733161430910403428L) ^ u4.a(21764, 4709774051850815405L)), (int)u4.a(12524, 905581137164263740L), (long)834203424483934088L) - u4.a(1215, 6536397529708516382L) + u4.a(25746, 8744175869192123486L);
                            continue block63;
                        }
                    }
                    break;
                }
                var6_3 /* !! */  = (reference)((u4.a(13729, 506355410786705827L) + u4.a(2423, 814396244900830099L) ^ u4.a(1087, 3650906097141862891L) ^ u4.a(17689, 5950476278038337088L)) + u4.a(9820, 3086240895148586176L) - u4.a(21470, 6280991806067378074L));
                break block94;
            }
            var6_3 /* !! */  = (reference)((u4.a(5929, 1869135596330305150L) / u4.a(11725, 4898740626741394818L) ^ u4.a(31980, 2358001383283306320L)) - u4.a(31109, 1593218059765525470L));
        }
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                hi.a("\u00a5", (Object)v19, (Object)v22, (long)433704824712272587L);
                return true;
            }
            case 1094040969: lbl-1000:
            // 2 sources

            {
                hi.a("\u00a5", (Object)v19, (Object)v22, (long)433704824712272587L);
                return true;
            }
            case 1094040968: 
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private void v(Object[] var1_1) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            var2_2 = Dl.t();
                            var11_3 = hi.a("G", (int)(u4.a(27646, 3926568854305585664L) - u4.a(4668, 2566575055677506228L) - u4.a(10006, 1815261766583317822L) ^ u4.a(13616, 2560359650620629337L)), (int)u4.a(20510, 8294658433497826105L), (long)834203424483934088L) ^ u4.a(20959, 5355762153556509848L);
                            if (var2_2) {
lbl6:
                                // 2 sources

                                while (true) {
                                    hi.a("G", (long)1147173558201835878L);
lbl9:
                                    // 2 sources

                                    while (true) {
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)400728262949485023L);
                                        v0 = 0;
lbl12:
                                        // 2 sources

                                        while (true) {
                                            var3_4 = v0;
                                            var4_5 = new iC(var3_4++, (Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, s(java.lang.String ), (Ljava/lang/String;)V)((u4)this), (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, e(), ()Z)((u4)this), (nH)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/String;)Z, P(java.lang.String ), (Ljava/lang/String;)Z)((u4)this));
                                            hi.a("\u00a5", (Object)var4_5, (float)20.0f, (float)20.0f, (long)1056483459672017518L);
                                            u4.l("pTiajDqPZyR9lRxG", add(E ), (List)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (Object)var4_5);
                                            var5_6 = 20.0f + hi.a("\u00a5", (Object)var4_5, (long)1260495607849894898L) + 14.0f;
                                            var6_7 = 20.0f;
                                            var7_8 = hi.a("G", (long)438677556143749811L);
                                            var8_9 = ((CallSite)var7_8).length;
                                            var9_10 = 0;
                                            if (!var2_2) break block17;
lbl24:
                                            // 2 sources

                                            while (true) {
                                                v1 = var9_10;
                                                v2 = var8_9;
                                                if (var2_2) break block18;
                                                if (v1 >= v2) break block19;
                                                break block20;
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var10_11 = var7_8[var9_10];
                                    v3 = var3_4++;
                                    v4 = new Object[3];
                                    v4[2] = Float.valueOf(var6_7);
                                    v4[1] = Float.valueOf(var5_6);
                                    v4[0] = new iu((vY)var10_11, v3);
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (Object)hi.a("\u00a5", (Object)this, (Object)v4, (long)701085253942286255L), (long)615358212536192384L);
                                    var6_7 += 42.0f;
                                    ++var9_10;
                                    if (var2_2) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            v5 = var3_4++;
                                            v6 = new Object[3];
                                            v6[2] = Float.valueOf(var6_7);
                                            v6[1] = Float.valueOf(var5_6);
                                            v6[0] = new it(v5);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (Object)hi.a("\u00a5", (Object)this, (Object)v6, (long)701085253942286255L), (long)615358212536192384L);
                                            v7 = var3_4++;
                                            v8 = new Object[3];
                                            v8[2] = Float.valueOf(var6_7 += 42.0f);
                                            v8[1] = Float.valueOf(var5_6);
                                            v8[0] = new i1(v7);
                                            u4.l("pTiajDqPZyR9lRxG", add(E ), (List)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (Object)hi.a("\u00a5", (Object)this, (Object)v8, (long)701085253942286255L));
                                            v9 = new Object[3];
                                            v9[2] = Float.valueOf(var6_7 += 42.0f);
                                            v9[1] = Float.valueOf(var5_6);
                                            v9[0] = new id(var3_4);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (Object)hi.a("\u00a5", (Object)this, (Object)v9, (long)701085253942286255L), (long)615358212536192384L);
                                            hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)669801794204839990L)}, (long)927038849942801846L);
                                            return;
                                        }
                                    }
                                    break block21;
                                    break;
                                }
                            }
                            v0 = var11_3;
                            ** while (var2_2)
lbl68:
                            // 1 sources

                            switch (v0) {
                                case 1692281156: {
                                    ** continue;
                                }
                                ** default:
lbl72:
                                // 1 sources

                                ** continue;
                            }
lbl73:
                            // 4 sources

                            while (true) {
                                switch (var11_3) {
                                    default: {
                                        ** continue;
                                    }
                                    case -85887452: {
                                        ** continue;
                                    }
                                    case -85887454: {
                                        ** continue;
                                    }
                                    case -85887451: 
                                }
                                throw null;
                            }
                        }
                        var11_3 = u4.a(1646, 6576761602541081531L) * u4.a(29879, 1707941029848032511L) * u4.a(30002, 6021212818296972653L) ^ u4.a(17093, 2741529648109981794L);
                        if (!var2_2) ** GOTO lbl73
                    }
                    v1 = u4.a(3177, 503743723248770094L) * u4.a(19594, 5579168506427580096L);
                    v2 = u4.a(23821, 6994416065007945870L);
                }
                var11_3 = v1 ^ v2;
                if (!var2_2) ** GOTO lbl73
            }
            var11_3 = u4.a(23657, 4608204049182427164L) * u4.a(18765, 1914772698118363564L) + u4.a(28701, 3044983899306533497L) + u4.a(18722, 6218333522634643924L) - u4.a(18410, 8193770865031385687L) ^ u4.a(32292, 7047384744789191549L);
            ** GOTO lbl73
        }
        var11_3 = u4.a(19071, 5502988794500159975L) * u4.a(9738, 126172244250915737L) * u4.a(25278, 3621584309831709095L) ^ u4.a(13806, 2554752201026692339L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void B() {
        block21: {
            block20: {
                var1_1 = Dl.t();
                var6_2 /* !! */  = (u4.l("pTiajDqPZyR9lRxG", max(int int ), (int)u4.a(31745, 4667969596571626587L), (int)u4.a(5010, 4311808831636620141L)) - u4.a(31335, 4138067159592480534L) - u4.a(16727, 6849930716145816558L)) * u4.a(12288, 6405591048284005101L) ^ u4.a(16245, 4572635237002571432L);
                if (!var1_1) break block20;
lbl4:
                // 2 sources

                while (true) {
                    var2_3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)842255329338200401L), (long)677221781799462977L);
                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)669801794204839990L), (long)1240653736693366367L);
                    if (!var1_1) ** GOTO lbl70
lbl8:
                    // 2 sources

                    while (true) {
                        v0 /* !! */  = u4.l("pTiajDqPZyR9lRxG", hasNext(), (Iterator)var3_4);
                        if (var1_1) ** GOTO lbl73
                        if (v0 /* !! */  == false) ** GOTO lbl72
                        ** GOTO lbl75
                        break;
                    }
                    break;
                }
lbl13:
                // 2 sources

                while (var1_1) {
                    return;
                }
                break block21;
            }
            while (true) {
                switch (var6_2 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 604164946: 
                }
                hi.a("G", (long)513793135028248171L);
                hi.a("G", (long)487733742417394326L);
                var6_2 /* !! */  = (int)(hi.a("G", (int)(u4.a(13752, 4057452674707580367L) * u4.a(7148, 124872449458129913L) ^ u4.a(726, 118826583338864750L) ^ u4.a(26239, 3055000346724054190L)), (int)u4.a(13591, 5467646255906219287L), (long)834203424483934088L) - u4.a(12847, 1643649328940050321L));
            }
lbl29:
            // 1 sources

            block16: while (true) {
                block22: {
                    switch (var6_2 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 1514244143: {
                            var4_5 = (vP)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                            v1 = var4_5 instanceof iu;
                            if (var1_1) ** GOTO lbl46
                            if (v1 == 0) ** GOTO lbl45
                            ** GOTO lbl47
                        }
                        case 1514244144: {
                            hi.a("G", (long)868272870930574387L);
                            u4.l("pTiajDqPZyR9lRxG", Q());
                            return;
                        }
lbl45:
                        // 1 sources

                        v1 = var6_2 /* !! */  = (u4.a(16194, 4497101096416014020L) + u4.a(20177, 5172415171972832453L)) * u4.a(822, 2097119445932234253L) - u4.a(26968, 4853842003357121595L);
lbl46:
                        // 2 sources

                        if (!var1_1) break block22;
lbl47:
                        // 2 sources

                        var6_2 /* !! */  = (hi.a("G", (int)u4.a(23987, 1134500639259527253L), (int)u4.a(6379, 5780524177630218944L), (long)834203424483934088L) - u4.a(27350, 2076956822599154073L) ^ u4.a(8052, 8890830869229521770L)) - u4.a(7064, 1011653759384669994L);
                        break block22;
                        case 1514244146: 
                    }
                    return;
                }
                do lbl-1000:
                // 3 sources

                {
                    block23: {
                        switch (var6_2 /* !! */ ) {
                            default: {
                                var5_6 = (iu)var4_5;
                                u4.l("pTiajDqPZyR9lRxG", e(java.lang.String ), (iu)var5_6, (String)var2_3);
                                if (!var1_1) break block23;
                                ** GOTO lbl13
                            }
                            case 1308459122: {
                                ** GOTO lbl13
                            }
                            case 1308459124: {
                                hi.a("G", (double)-0.5, (long)653179046978634595L);
                                hi.a("G", (long)946490586356608614L);
                                var6_2 /* !! */  = ((u4.a(11105, 4248406355953645646L) ^ u4.a(13456, 4867958227290219744L)) * u4.a(6180, 1612296001425329576L) ^ u4.a(7228, 3961796101581524704L)) / u4.a(2071, 8873719142974642416L) ^ u4.a(24453, 3970549572891577573L);
                                if (!var1_1) ** GOTO lbl-1000
                            }
                        }
lbl70:
                        // 2 sources

                        var6_2 /* !! */  = (u4.a(14016, 4719530895468323996L) * u4.a(13646, 7429189488776470677L) ^ u4.a(23835, 126402377929428767L)) + u4.a(31043, 4051783810858526851L);
                        if (!var1_1) continue block16;
lbl72:
                        // 2 sources

                        v0 /* !! */  = (CallSite)(u4.a(28958, 5260281414812410715L) * u4.a(16831, 4906359760833516612L) * u4.a(16096, 5743045857194372607L) * u4.a(1235, 7342320861008451429L) / 4 - u4.a(19797, 261478627819822279L));
lbl73:
                        // 2 sources

                        var6_2 /* !! */  = (int)v0 /* !! */ ;
                        if (!var1_1) continue block16;
lbl75:
                        // 2 sources

                        var6_2 /* !! */  = (u4.a(6292, 7375465100463918425L) + u4.a(27733, 8953182282180181042L)) * u4.a(17141, 1103521895132600207L) ^ u4.a(17167, 2792995703323037721L);
                        continue block16;
                    }
                    var6_2 /* !! */  = (u4.a(23446, 2110041420056858130L) + u4.a(27540, 3493085240834340995L)) * u4.a(13629, 2266732987417093991L) - u4.a(2108, 4921134693696396249L);
                } while (!var1_1);
                break;
            }
        }
        var6_2 /* !! */  = (u4.a(22109, 2393890907518731277L) * u4.a(32254, 576988675184242245L) ^ u4.a(32057, 5916406673290406193L)) + u4.a(16214, 3495140805324270383L);
        ** while (true)
    }

    private float c() {
        return (float)(hi.a("G", (long)1101389884075884739L) - 20.0f - hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)753383085489382820L));
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x142C) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 137;
                case 1 -> 195;
                case 2 -> 118;
                case 3 -> 209;
                case 4 -> 21;
                case 5 -> 135;
                case 6 -> 212;
                case 7 -> 153;
                case 8 -> 237;
                case 9 -> 97;
                case 10 -> 168;
                case 11 -> 66;
                case 12 -> 202;
                case 13 -> 221;
                case 14 -> 235;
                case 15 -> 19;
                case 16 -> 204;
                case 17 -> 32;
                case 18 -> 40;
                case 19 -> 72;
                case 20 -> 250;
                case 21 -> 34;
                case 22 -> 187;
                case 23 -> 240;
                case 24 -> 92;
                case 25 -> 43;
                case 26 -> 14;
                case 27 -> 87;
                case 28 -> 172;
                case 29 -> 8;
                case 30 -> 28;
                case 31 -> 73;
                case 32 -> 80;
                case 33 -> 105;
                case 34 -> 11;
                case 35 -> 197;
                case 36 -> 115;
                case 37 -> 155;
                case 38 -> 184;
                case 39 -> 189;
                case 40 -> 27;
                case 41 -> 13;
                case 42 -> 113;
                case 43 -> 36;
                case 44 -> 219;
                case 45 -> 165;
                case 46 -> 117;
                case 47 -> 81;
                case 48 -> 25;
                case 49 -> 53;
                case 50 -> 200;
                case 51 -> 130;
                case 52 -> 142;
                case 53 -> 205;
                case 54 -> 85;
                case 55 -> 146;
                case 56 -> 45;
                case 57 -> 64;
                case 58 -> 162;
                case 59 -> 147;
                case 60 -> 225;
                case 61 -> 249;
                case 62 -> 253;
                case 63 -> 190;
                case 64 -> 169;
                case 65 -> 227;
                case 66 -> 151;
                case 67 -> 55;
                case 68 -> 98;
                case 69 -> 83;
                case 70 -> 52;
                case 71 -> 127;
                case 72 -> 37;
                case 73 -> 78;
                case 74 -> 188;
                case 75 -> 9;
                case 76 -> 241;
                case 77 -> 196;
                case 78 -> 76;
                case 79 -> 248;
                case 80 -> 15;
                case 81 -> 143;
                case 82 -> 62;
                case 83 -> 91;
                case 84 -> 231;
                case 85 -> 213;
                case 86 -> 182;
                case 87 -> 164;
                case 88 -> 185;
                case 89 -> 96;
                case 90 -> 24;
                case 91 -> 140;
                case 92 -> 18;
                case 93 -> 42;
                case 94 -> 39;
                case 95 -> 173;
                case 96 -> 31;
                case 97 -> 251;
                case 98 -> 56;
                case 99 -> 114;
                case 100 -> 254;
                case 101 -> 70;
                case 102 -> 160;
                case 103 -> 220;
                case 104 -> 224;
                case 105 -> 47;
                case 106 -> 100;
                case 107 -> 193;
                case 108 -> 170;
                case 109 -> 199;
                case 110 -> 75;
                case 111 -> 122;
                case 112 -> 180;
                case 113 -> 95;
                case 114 -> 12;
                case 115 -> 230;
                case 116 -> 138;
                case 117 -> 234;
                case 118 -> 69;
                case 119 -> 246;
                case 120 -> 232;
                case 121 -> 194;
                case 122 -> 20;
                case 123 -> 216;
                case 124 -> 58;
                case 125 -> 141;
                case 126 -> 186;
                case 127 -> 104;
                case 128 -> 38;
                case 129 -> 41;
                case 130 -> 210;
                case 131 -> 145;
                case 132 -> 35;
                case 133 -> 136;
                case 134 -> 177;
                case 135 -> 161;
                case 136 -> 226;
                case 137 -> 10;
                case 138 -> 107;
                case 139 -> 174;
                case 140 -> 154;
                case 141 -> 77;
                case 142 -> 255;
                case 143 -> 3;
                case 144 -> 103;
                case 145 -> 4;
                case 146 -> 128;
                case 147 -> 59;
                case 148 -> 109;
                case 149 -> 63;
                case 150 -> 48;
                case 151 -> 252;
                case 152 -> 5;
                case 153 -> 156;
                case 154 -> 119;
                case 155 -> 191;
                case 156 -> 167;
                case 157 -> 86;
                case 158 -> 108;
                case 159 -> 101;
                case 160 -> 229;
                case 161 -> 26;
                case 162 -> 57;
                case 163 -> 175;
                case 164 -> 242;
                case 165 -> 88;
                case 166 -> 217;
                case 167 -> 111;
                case 168 -> 239;
                case 169 -> 211;
                case 170 -> 166;
                case 171 -> 1;
                case 172 -> 215;
                case 173 -> 123;
                case 174 -> 94;
                case 175 -> 171;
                case 176 -> 84;
                case 177 -> 236;
                case 178 -> 176;
                case 179 -> 134;
                case 180 -> 6;
                case 181 -> 50;
                case 182 -> 144;
                case 183 -> 148;
                case 184 -> 74;
                case 185 -> 2;
                case 186 -> 198;
                case 187 -> 203;
                case 188 -> 54;
                case 189 -> 207;
                case 190 -> 223;
                case 191 -> 149;
                case 192 -> 152;
                case 193 -> 23;
                case 194 -> 30;
                case 195 -> 192;
                case 196 -> 89;
                case 197 -> 245;
                case 198 -> 179;
                case 199 -> 16;
                case 200 -> 61;
                case 201 -> 201;
                case 202 -> 22;
                case 203 -> 17;
                case 204 -> 129;
                case 205 -> 120;
                case 206 -> 183;
                case 207 -> 158;
                case 208 -> 206;
                case 209 -> 178;
                case 210 -> 90;
                case 211 -> 228;
                case 212 -> 244;
                case 213 -> 65;
                case 214 -> 222;
                case 215 -> 247;
                case 216 -> 112;
                case 217 -> 157;
                case 218 -> 110;
                case 219 -> 159;
                case 220 -> 208;
                case 221 -> 49;
                case 222 -> 124;
                case 223 -> 133;
                case 224 -> 44;
                case 225 -> 181;
                case 226 -> 139;
                case 227 -> 238;
                case 228 -> 33;
                case 229 -> 121;
                case 230 -> 102;
                case 231 -> 163;
                case 232 -> 233;
                case 233 -> 132;
                case 234 -> 29;
                case 235 -> 243;
                case 236 -> 79;
                case 237 -> 0;
                case 238 -> 46;
                case 239 -> 67;
                case 240 -> 68;
                case 241 -> 214;
                case 242 -> 218;
                case 243 -> 99;
                case 244 -> 131;
                case 245 -> 125;
                case 246 -> 60;
                case 247 -> 71;
                case 248 -> 93;
                case 249 -> 106;
                case 250 -> 116;
                case 251 -> 51;
                case 252 -> 7;
                case 253 -> 82;
                case 254 -> 150;
                default -> 126;
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
            u4.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x513D;
        if (g[n2] == null) {
            u4.g[n2] = (int)(e[n2] ^ l);
        }
        return g[n2];
    }
}
