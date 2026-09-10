/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.ClipContext
 *  net.minecraft.world.level.ClipContext$Block
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.u9;
import com.github.epsilon.uK;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class uf
extends u9 {
    private int F;
    private BlockPos a;
    private uK g;
    private boolean L;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    @Override
    public uK g(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)1250396749876087207L);
    }

    @Override
    public void c() {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)799616369909378767L);
    }

    private void O(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, null, (long)810987892598049213L);
        hi.a("\u00f2", (Object)this, null, (long)1250396749876087207L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)498017717146701645L);
        hi.a("\u00f2", (Object)this, (int)0, (long)764092275066852871L);
    }

    @Override
    public void h() {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)799616369909378767L);
    }

    public uf() {
        super(b);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean Y(Object[] var1_1) {
        block14: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = uf.a(17207, 7121860087882226643L) / 2 ^ uf.a(30010, 7439815733190536272L);
            if (!var2_2) ** GOTO lbl11
            block8: while (true) {
                block16: {
                    block15: {
                        if (hi.a("\u00e9", (Object)this, (long)1250396749876087207L) != null) break block15;
                        var3_3 /* !! */  = uf.a(14797, 6441368050505802102L) * uf.a(11660, 1612197341443454184L) - uf.a(11480, 6135594877613143112L) - uf.a(9360, 5053273058847554600L);
                        if (!var2_2) break block16;
                    }
                    var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(uf.a(1137, 7290049562830232585L) + uf.a(32247, 1083806779659461997L)), (int)uf.a(16749, 6067239506750806274L), (long)834203424483934088L) ^ uf.a(29079, 8728973027457018330L)), (int)uf.a(22139, 2187375426199981751L), (long)834203424483934088L) - uf.a(13199, 4468392563178564346L));
                }
                switch (var3_3 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case 348873813: {
                        v0 = true;
                        var3_3 /* !! */  = uf.a(31568, 3701412410368926542L) - uf.a(543, 3689353007811451588L) ^ uf.a(26277, 5350374345274211873L);
                        if (var2_2) {
                            break block8;
                        }
                        break block14;
                    }
                    case 348873812: {
                        v0 = false;
                        if (!var2_2) break block8;
                        return v0;
                    }
                    case 348873815: {
                        hi.a("G", (long)723518858017143060L);
                        hi.a("G", (long)692983194225517364L);
                        return true;
                    }
                }
                break;
            }
            var3_3 /* !! */  = uf.a(32280, 5893899268110952079L) - uf.a(1007, 8145378253360716571L) ^ uf.a(26441, 396993282871967731L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v0;
            }
            case 825450705: 
        }
        hi.a("G", (long)568661647584527448L);
        return (boolean)hi.a("G", (int)0, (long)1235507535267189928L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void T() {
        block14: {
            block12: {
                block13: {
                    block11: {
                        block16: {
                            block15: {
                                var1_1 = Dl.t();
                                var2_2 /* !! */  = uf.a(9135, 8451903212380027676L) - uf.a(15898, 3055362209628087905L) + uf.a(3404, 4609861642874803241L);
                                if (!var1_1) break block15;
lbl4:
                                // 2 sources

                                while (hi.a("\u00e9", (Object)this, (long)810987892598049213L) != null) {
                                    break block11;
                                }
                                break block16;
lbl7:
                                // 1 sources

                                while (true) {
                                    v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)498017717146701645L);
                                    if (var1_1) break block12;
                                    if (v0 /* !! */  != false) break block13;
                                    break block14;
                                    break;
                                }
lbl12:
                                // 1 sources

                                return;
lbl14:
                                // 1 sources

                                while (true) {
                                    hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)new AABB((BlockPos)hi.a("\u00e9", (Object)this, (long)810987892598049213L)), (Object)new Color(uf.a(12480, 6503611130179053617L), 0, 0, uf.a(24309, 8151072159959811621L)), (long)1122650864820283854L);
                                    hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)new AABB((BlockPos)hi.a("\u00e9", (Object)this, (long)810987892598049213L)), (Object)new Color(uf.a(11754, 4130877930526602711L), 0, 0, uf.a(25365, 8081610268800596991L)), (long)454910854240223822L);
                                    return;
                                }
                            }
lbl19:
                            // 5 sources

                            while (true) {
                                switch (var2_2 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl4
                                    }
                                    case 1409575413: {
                                        ** continue;
                                    }
                                    case 1409575415: {
                                        ** continue;
                                    }
                                    case 1409575416: {
                                        ** continue;
                                    }
                                    case 1409575414: 
                                }
                                throw null;
                            }
                        }
                        var2_2 /* !! */  = (int)(hi.a("G", (int)uf.a(4618, 1895947943230229050L), (int)uf.a(21873, 2287059918863437298L), (long)834203424483934088L) * uf.a(27902, 7983642680501122236L) * uf.a(17096, 7473916603210570422L) + uf.a(12135, 640870813714380667L));
                        if (!var1_1) ** GOTO lbl19
                    }
                    var2_2 /* !! */  = (int)(hi.a("G", (int)uf.a(5717, 232944913623600665L), (int)uf.a(27545, 7991973488952619787L), (long)834203424483934088L) + uf.a(8176, 7708606708980664250L));
                    if (!var1_1) ** GOTO lbl19
                }
                v0 /* !! */  = (CallSite)(((uf.a(5919, 5780885127269306275L) + uf.a(967, 8354149675926575797L)) / 2 ^ uf.a(21941, 2972287042861206891L)) - uf.a(3345, 3668436862114911625L));
            }
            var2_2 /* !! */  = (int)v0 /* !! */ ;
            if (!var1_1) ** GOTO lbl19
        }
        var2_2 /* !! */  = (int)(hi.a("G", (int)uf.a(30421, 8543222438410956288L), (int)uf.a(21481, 5506783821018336154L), (long)834203424483934088L) * uf.a(15751, 5758138715221452142L) * uf.a(25006, 4212004346882898226L) + uf.a(29829, 7195061053819071660L));
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void H(Object[] var1_1) {
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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void A(Object[] var1_1) {
        block51: {
            block50: {
                block54: {
                    block52: {
                        block53: {
                            var2_2 = Dl.S();
                            var14_3 /* !! */  = uf.u("4ieSQ1QLaCvedeoK", max(int int ), (int)(uf.a(31403, 3042435923041919956L) - uf.a(20027, 7162080799260481364L)), (int)uf.a(5700, 8437577112220454405L)) ^ uf.a(15760, 6242808771471107426L);
                            if (!var2_2) break block52;
                            v0 = var14_3 /* !! */ ;
                            if (!var2_2) break block53;
                            switch (v0) {
                                default: {
                                    break block52;
                                }
                                case 1349804694: {
                                    hi.a("G", (long)447560916480552025L);
                                    v0 = 5;
                                }
                            }
                        }
                        hi.a("G", (int)v0, (int)1, (int)2, (int)0, (long)936415413245529974L);
                    }
                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1287749508287635914L);
                    var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L);
                    hi.a("\u00f2", (Object)this, null, (long)810987892598049213L);
                    var5_6 /* !! */  = 1.7976931348623157E308;
                    var7_7 = uf.a(15518, 3396594598442460206L);
                    if (!var2_2) break block54;
                    var14_3 /* !! */  = uf.a(2867, 1954894536383583087L) * uf.a(22712, 468424789184872658L) ^ uf.a(14833, 4809923076464664923L);
                    if (var2_2) ** GOTO lbl123
                    ** GOTO lbl33
                }
lbl28:
                // 2 sources

                while (true) {
                    block56: {
                        block55: {
                            v1 = var7_7;
                            v2 = uf.a(14541, 5056557135672598684L);
                            if (!var2_2) break block55;
                            if (v1 <= v2) break block56;
lbl33:
                            // 2 sources

                            v1 = (hi.a("G", (int)(uf.a(14194, 4337573037544173385L) + uf.a(5567, 639984577717423299L)), (int)uf.a(17977, 6287014497063640758L), (long)834203424483934088L) ^ uf.a(31991, 8169313775099946388L)) / 5;
                            v2 = uf.a(22157, 8621247370394799841L);
                        }
                        var14_3 /* !! */  = v1 ^ v2;
                        if (var2_2) ** GOTO lbl123
                    }
                    var14_3 /* !! */  = uf.a(6698, 1079136843599921996L) + uf.a(23776, 4231371103589401760L) - uf.a(27437, 8627814943015252862L) - uf.a(26817, 3703870960917524581L) - uf.a(3234, 8096326538862023719L) ^ uf.a(26913, 8465586156466483468L);
                    ** GOTO lbl123
                    break;
                }
lbl41:
                // 2 sources

                while (true) {
                    v3 /* !! */  = var8_8;
                    v4 = 2;
                    if (!var2_2) ** GOTO lbl138
                    if (v3 /* !! */  > v4) ** GOTO lbl136
                    ** GOTO lbl140
                    break;
                }
lbl47:
                // 2 sources

                while (true) {
                    v5 = var9_9;
                    v6 = uf.a(14541, 5056557135672598684L);
                    if (!var2_2) ** GOTO lbl158
                    if (v5 > v6) ** GOTO lbl156
                    ** GOTO lbl160
                    break;
                }
lbl53:
                // 2 sources

                while (true) {
                    block58: {
                        block57: {
                            var10_10 = hi.a("\u00a5", (Object)var3_4, (int)var7_7, (int)var8_8, (int)var9_9, (long)472712578670837724L);
                            v7 /* !! */  = uf.u("4ieSQ1QLaCvedeoK", is(java.lang.Object ), (BlockState)uf.u("4ieSQ1QLaCvedeoK", getBlockState(net.minecraft.core.BlockPos ), (ClientLevel)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (BlockPos)var10_10), (Object)hi.a("j", (long)460604126438957175L));
                            if (!var2_2) break block57;
                            if (v7 /* !! */  != false) break block58;
                            v7 /* !! */  = (CallSite)(uf.a(4680, 710904012946524710L) * uf.a(25637, 5224544961202896010L) ^ uf.a(16418, 2015402453528058079L));
                        }
                        var14_3 /* !! */  = (int)v7 /* !! */ ;
                        if (var2_2) ** GOTO lbl178
                    }
                    var14_3 /* !! */  = (uf.a(21433, 9024354078352903147L) + uf.a(31172, 4285161514737508537L) - uf.a(3976, 6307767572405606386L)) / uf.a(6054, 7685002726541676359L) + uf.a(32612, 903152889341126540L);
                    if (var2_2) ** GOTO lbl178
                    ** GOTO lbl197
                    break;
                }
lbl66:
                // 2 sources

                while (true) {
                    block60: {
                        block59: {
                            var11_11 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var10_10}, (long)855584828650138012L);
                            if (!var2_2) break block59;
                            if (var11_11 == null) break block60;
                            var14_3 /* !! */  = (uf.a(18362, 7368452417837670239L) ^ uf.a(23489, 7437830583932814298L)) + uf.a(881, 3203069552864123778L) + uf.a(2669, 3666679556123054792L);
                        }
                        if (var2_2) break block50;
                    }
                    var14_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)uf.a(15460, 3102805791125595405L), (int)uf.a(19868, 7536885721145742752L), (long)834203424483934088L), (int)uf.a(2258, 3303019277171806365L), (long)834203424483934088L) ^ uf.a(18791, 6583179060895584527L);
                    if (var2_2) break block50;
                    break block51;
                    break;
                }
lbl77:
                // 2 sources

                while (true) {
                    block63: {
                        block65: {
                            block64: {
                                block62: {
                                    block61: {
                                        var12_12 = hi.a("\u00a5", (Object)hi.a("G", (Object)var10_10, (long)968425374253918917L), (Object)var4_5, (long)1291060754145254714L);
                                        v8 /* !! */  = var12_12 == var5_6 /* !! */  ? 0 : (var12_12 < var5_6 /* !! */  ? -1 : 1);
                                        if (!var2_2) break block61;
                                        if (v8 /* !! */  < 0) break block62;
                                        v8 /* !! */  = (reference)(uf.a(15125, 6649812553880691675L) * uf.a(10121, 6789567099199979510L) ^ uf.a(25433, 8273148048268966839L));
                                    }
                                    var14_3 /* !! */  = (int)v8 /* !! */ ;
                                    if (var2_2) break block63;
                                }
                                var14_3 /* !! */  = uf.a(1672, 6953729715466067627L) - uf.a(7726, 3314875296734594576L) - uf.a(8795, 4426484150707386956L);
                                if (!var2_2) break block64;
                                switch (var14_3 /* !! */ ) {
                                    default: {
                                        var5_6 /* !! */  = (double)var12_12;
                                        hi.a("\u00f2", (Object)this, (BlockPos)var10_10, (long)810987892598049213L);
                                        if (var2_2) break;
                                        break block65;
                                    }
                                    case 288974225: {
                                        throw null;
                                    }
                                }
                            }
                            var14_3 /* !! */  = uf.a(15125, 6649812553880691675L) * uf.a(10121, 6789567099199979510L) ^ uf.a(25433, 8273148048268966839L);
                            if (var2_2) break block63;
                            ** GOTO lbl106
                        }
lbl103:
                        // 2 sources

                        while (true) {
                            block66: {
                                ++var9_9;
                                if (!var2_2) break block66;
lbl106:
                                // 2 sources

                                var14_3 /* !! */  = uf.a(27914, 4747626955940279793L) / uf.a(27617, 63398844784128793L) ^ uf.a(29522, 2521363584613657585L) ^ uf.a(13146, 8444976410384165691L);
                                if (var2_2) ** GOTO lbl161
                                ** GOTO lbl113
                            }
                            block38: while (true) {
                                block69: {
                                    block67: {
                                        ++var8_8;
                                        if (!var2_2) break block67;
lbl113:
                                        // 2 sources

                                        var14_3 /* !! */  = (uf.a(27884, 6425176165631571128L) - uf.a(6467, 685185130371629525L)) / uf.a(16969, 7624593554923002478L) + uf.a(8772, 8284846288315382451L);
                                        if (var2_2) ** GOTO lbl141
                                        ** GOTO lbl122
                                    }
                                    block39: while (true) {
                                        block68: {
                                            ++var7_7;
                                            if (!var2_2) {
                                                break block38;
                                            }
lbl122:
                                            // 3 sources

                                            var14_3 /* !! */  = uf.a(4094, 5746774346506033149L) * uf.a(9410, 4357362181906463920L) ^ uf.a(5196, 4451976342203256057L);
lbl123:
                                            // 4 sources

                                            switch (var14_3 /* !! */ ) {
                                                default: {
                                                    ** continue;
                                                }
                                                case -621194934: {
                                                    var8_8 = uf.a(32064, 8697876124067341734L);
                                                    if (var2_2) break;
                                                    ** GOTO lbl41
                                                }
                                                case -621194936: {
                                                    break block38;
                                                }
                                                case -621194937: {
                                                    return;
                                                }
                                            }
                                            var14_3 /* !! */  = (uf.a(13735, 1482274841990917377L) - uf.a(24143, 4057136070929844002L)) / uf.a(1655, 9111869940658822707L) + uf.a(17188, 9153537001270025182L);
                                            if (var2_2) break block68;
lbl136:
                                            // 2 sources

                                            v3 /* !! */  = (int)(hi.a("G", (int)uf.a(12313, 8883958931105147039L), (int)uf.a(4945, 6548674205575727876L), (long)834203424483934088L) - uf.a(30789, 3169007047252484215L));
                                            v4 = uf.a(7873, 8490575396811621906L);
lbl138:
                                            // 2 sources

                                            var14_3 /* !! */  = v3 /* !! */  + v4;
                                            if (var2_2) break block68;
lbl140:
                                            // 2 sources

                                            var14_3 /* !! */  = (uf.a(24478, 7543322336637290490L) ^ uf.a(19106, 2856449696937185944L)) * uf.a(18526, 3244939936573690034L) / uf.a(1432, 5015726116886764847L) - uf.a(13837, 2794231271412067974L);
                                        }
                                        switch (var14_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case 1281827836: {
                                                var9_9 = uf.a(27939, 135242467996218837L);
                                                if (var2_2) break block39;
                                                ** GOTO lbl47
                                            }
                                            case 1281827837: {
                                                continue block39;
                                            }
                                            case 1281827835: {
                                                throw null;
                                            }
                                        }
                                        break;
                                    }
                                    var14_3 /* !! */  = uf.a(9744, 6230964947453804178L) / uf.a(26335, 8734198552870764251L) ^ uf.a(7640, 7043355820631704750L) ^ uf.a(19581, 5636088248405955862L);
                                    if (var2_2) break block69;
lbl156:
                                    // 2 sources

                                    v5 = uf.a(27104, 1064063285596729823L) / uf.a(18188, 2868522227291823723L);
                                    v6 = uf.a(19622, 6711959121181742287L);
lbl158:
                                    // 2 sources

                                    var14_3 /* !! */  = v5 - v6;
                                    if (var2_2) break block69;
lbl160:
                                    // 2 sources

                                    var14_3 /* !! */  = ((uf.a(24891, 7402736379210610982L) ^ uf.a(8899, 7519193031134640759L)) - uf.a(248, 5129637201504786623L) + uf.a(11955, 8460239614242715386L)) / 2 ^ uf.a(9843, 3613873055066684970L);
                                }
                                switch (var14_3 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case 2123507007: {
                                        hi.a("G", (long)1109407344178516224L);
                                        ** GOTO lbl53
                                    }
                                    case 2123507005: {
                                        ** continue;
                                    }
                                    case 2123507008: 
                                }
                            }
                            hi.a("G", (double)0.5, (long)514485682373957547L);
                            hi.a("G", (long)426324660506778941L);
                            return;
                        }
                    }
lbl179:
                    // 2 sources

                    while (true) {
                        block72: {
                            block71: {
                                block70: {
                                    switch (var14_3 /* !! */ ) {
                                        default: {
                                            cfr_temp_0 = hi.a("\u00a5", (Object)hi.a("G", (Object)var10_10, (long)968425374253918917L), (Object)var4_5, (long)1291060754145254714L) - 25.0;
                                            v9 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                            if (!var2_2) break block70;
                                            if (v9 /* !! */  <= 0) break;
                                            break block71;
                                        }
                                        case 440468831: {
                                            if (var2_2) break block72;
                                            ** GOTO lbl66
                                        }
                                        case 440468835: {
                                            ** continue;
                                        }
                                        case 440468833: {
                                            ** continue;
                                        }
                                        case 440468834: {
                                            hi.a("G", (long)397471851942621184L);
                                            return;
                                        }
                                    }
lbl197:
                                    // 2 sources

                                    v9 /* !! */  = (reference)(uf.a(24930, 2010180867982342491L) / 2 / 5 - uf.a(4206, 6002721800884603046L));
                                }
                                var14_3 /* !! */  = (int)v9 /* !! */ ;
                                if (var2_2) continue;
                            }
                            var14_3 /* !! */  = (uf.a(19954, 6720797034707752312L) + uf.a(14679, 2222372185568567691L)) / uf.a(27617, 63398844784128793L) + uf.a(30321, 6697208944561565273L);
                            if (var2_2) continue;
                        }
                        var14_3 /* !! */  = uf.a(15125, 6649812553880691675L) * uf.a(10121, 6789567099199979510L) ^ uf.a(25433, 8273148048268966839L);
                        continue;
                        break;
                    }
                    break;
                }
            }
            block41: while (true) {
                switch (var14_3 /* !! */ ) {
                    default: {
                        if (var2_2) break block41;
                        ** GOTO lbl77
                    }
                    case -1268141570: {
                        ** continue;
                    }
                    case -1268141569: {
                        hi.a("G", (long)1217681287799928622L);
                        var14_3 /* !! */  = uf.a(23662, 6360834326690268331L) / 3 ^ uf.a(11992, 6409407038169282163L);
                        continue block41;
                    }
                }
                break;
            }
        }
        var14_3 /* !! */  = uf.a(15125, 6649812553880691675L) * uf.a(10121, 6789567099199979510L) ^ uf.a(25433, 8273148048268966839L);
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite u(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    private Vec3 Z(Object[] var1_1) {
        block28: {
            block23: {
                block25: {
                    block24: {
                        var2_2 = var1_1[0];
                        var3_3 = Dl.t();
                        var14_4 /* !! */  = uf.a(4508, 6935161879800564003L) * uf.a(3973, 6892845850790287174L) ^ uf.a(20110, 4052087549496399449L);
                        if (var3_3) ** GOTO lbl-1000
                        v0 = var14_4 /* !! */ ;
                        if (var3_3) break block24;
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1133521407411179272L);
                                var5_6 = null;
                                var6_7 /* !! */  = 1.7976931348623157E308;
                                var8_8 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)((BlockPos)var2_2), (long)419122760578116751L), (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)((BlockPos)var2_2), (long)908879246535330338L), (long)948473201875045121L), (long)1240653736693366367L);
                                var14_4 /* !! */  = (uf.a(21405, 542278197586758495L) + uf.a(20078, 8629982809129948715L)) * uf.a(12080, 3381168733658085257L) * uf.a(29836, 2636494814566034563L) - uf.a(6437, 6791521029069160891L);
                                break block25;
                            }
                            case 1367324383: {
                                v0 = uf.a(2675, 3394962480461140541L);
                            }
                        }
                    }
                    hi.a("G", (int)v0, (long)1311780045343811872L);
                    hi.a("G", (long)405104411746105969L);
                    return null;
lbl24:
                    // 2 sources

                    while (true) {
                        block27: {
                            block26: {
                                var12_12 = uf.u("4ieSQ1QLaCvedeoK", distanceToSqr(net.minecraft.world.phys.Vec3 ), (Vec3)var10_10, (Vec3)var4_5);
                                v1 /* !! */  = var12_12 == var6_7 /* !! */  ? 0 : (var12_12 < var6_7 /* !! */  ? -1 : 1);
                                if (var3_3) break block26;
                                if (v1 /* !! */  < 0) break block27;
                                v1 /* !! */  = (reference)(uf.a(30819, 1165620431658688769L) ^ uf.a(18170, 3480833706148732663L) ^ uf.a(26885, 4569997717069476206L));
                            }
                            var14_4 /* !! */  = (int)v1 /* !! */ ;
                            if (!var3_3) break block23;
                        }
                        var14_4 /* !! */  = hi.a("G", (int)(uf.a(27579, 3366988891975955404L) / uf.a(1432, 5015726116886764847L)), (int)uf.a(18431, 6382088093542981476L), (long)834203424483934088L) ^ uf.a(19839, 871724829695710658L);
                        if (!var3_3) break block23;
                        ** GOTO lbl111
                        break;
                    }
lbl37:
                    // 2 sources

                    while (var3_3) {
                        return var5_6;
                    }
                    break block28;
                }
lbl41:
                // 2 sources

                block19: while (true) {
                    block29: {
                        switch (var14_4 /* !! */ ) {
                            default: {
                                v2 = hi.a("\u00a5", (Object)var8_8, (long)984088978567310565L);
                                if (var3_3) ** GOTO lbl62
                                if (v2 == false) ** GOTO lbl61
                                ** GOTO lbl64
                            }
                            case -391274315: {
                                var9_9 = (AABB)hi.a("\u00a5", (Object)var8_8, (long)470012372636416268L);
                                var10_10 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var9_9, (Object)((BlockPos)var2_2), (long)640574092556455400L), (long)511202903915214145L);
                                var11_11 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (Object)new ClipContext((Vec3)var4_5, (Vec3)var10_10, (ClipContext.Block)hi.a("j", (long)1246558594152704253L), (ClipContext.Fluid)hi.a("j", (long)747535818869381789L), (Entity)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L)), (long)438016674394306919L);
                                if (var3_3) ** GOTO lbl67
                                if (hi.a("\u00a5", (Object)var11_11, (long)628689410903398059L) != hi.a("j", (long)1164827453998066990L)) ** GOTO lbl66
                                ** GOTO lbl68
                            }
                            case -391274313: {
                                uf.u("4ieSQ1QLaCvedeoK", g());
                                var14_4 /* !! */  = uf.a(7198, 3053021136226370921L) - uf.a(2131, 6570473470151053553L) - uf.a(23159, 386209855751848686L) - uf.a(4832, 7318921501396880017L);
                                continue block19;
                            }
lbl61:
                            // 1 sources

                            v2 = hi.a("G", (int)(hi.a("G", (int)uf.a(18151, 1301489046534430359L), (int)uf.a(25203, 831439478601431837L), (long)834203424483934088L) - uf.a(28582, 6919590044827203338L) ^ uf.a(13101, 7372437395693464434L)), (int)uf.a(2984, 2898859602787816132L), (long)834203424483934088L) + uf.a(21319, 8676282165099465574L);
lbl62:
                            // 2 sources

                            var14_4 /* !! */  = (int)v2;
                            if (!var3_3) continue block19;
lbl64:
                            // 2 sources

                            var14_4 /* !! */  = (uf.a(24317, 365098449616078579L) ^ uf.a(23282, 3466831594976051765L) ^ uf.a(933, 47721759828695764L)) / uf.a(20807, 8833690247786072417L) ^ uf.a(9658, 8384332611585998243L);
                            continue block19;
lbl66:
                            // 1 sources

                            var14_4 /* !! */  = (uf.a(28088, 4006431072934835553L) + uf.a(13327, 678263116663450680L)) * uf.a(6778, 497367338795811532L) * uf.a(7892, 336791122781456116L) - uf.a(13693, 5746443424473804277L);
lbl67:
                            // 2 sources

                            if (!var3_3) continue block19;
lbl68:
                            // 2 sources

                            var14_4 /* !! */  = uf.a(8410, 9189558313105651879L) / uf.a(31865, 4686111669487838448L) + uf.a(21230, 1177566730518989363L);
                            if (!var3_3) break block29;
                            ** GOTO lbl89
                            case -391274314: 
                        }
                        return var5_6;
                    }
                    block20: do lbl-1000:
                    // 3 sources

                    {
                        block31: {
                            block30: {
                                switch (var14_4 /* !! */ ) {
                                    default: {
                                        v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var11_11, (long)367457867556936554L), (Object)((BlockPos)var2_2), (long)1203894332961133998L);
                                        if (var3_3) break block30;
                                        if (v3 /* !! */  != false) break;
                                        break block31;
                                    }
                                    case -2107167032: {
                                        if (!var3_3) break block20;
                                        ** GOTO lbl24
                                    }
                                    case -2107167033: {
                                        ** continue;
                                    }
                                    case -2107167034: {
                                        throw null;
                                    }
                                }
lbl89:
                                // 2 sources

                                v3 /* !! */  = (CallSite)(uf.a(31712, 2941818613762827233L) * uf.a(11179, 8100016436043805479L) ^ uf.a(24744, 8119322934750853325L));
                            }
                            var14_4 /* !! */  = (int)v3 /* !! */ ;
                            if (!var3_3) ** GOTO lbl-1000
                        }
                        var14_4 /* !! */  = ((uf.a(31568, 494439588910375875L) - uf.a(27788, 4443274431721747612L)) / 4 ^ uf.a(5275, 4885442838506851559L)) / uf.a(8834, 5866742206384274064L) ^ uf.a(9346, 1275495545820544220L);
                    } while (!var3_3);
                    var14_4 /* !! */  = (uf.a(28088, 4006431072934835553L) + uf.a(13327, 678263116663450680L)) * uf.a(6778, 497367338795811532L) * uf.a(7892, 336791122781456116L) - uf.a(13693, 5746443424473804277L);
                    continue;
                    break;
                }
            }
            do {
                switch (var14_4 /* !! */ ) {
                    default: {
                        var6_7 /* !! */  = (double)var12_12;
                        var5_6 = var10_10;
                        if (!var3_3) break;
                        ** GOTO lbl37
                    }
                    case 1032439345: {
                        ** GOTO lbl37
                    }
                    case 1032439344: {
                        throw null;
                    }
                }
lbl111:
                // 2 sources

                var14_4 /* !! */  = uf.a(11266, 68777745429132373L) ^ uf.a(5372, 43516167592791057L) ^ uf.a(16324, 3699773490493646650L);
            } while (!var3_3);
        }
        var14_4 /* !! */  = (uf.a(28088, 4006431072934835553L) + uf.a(13327, 678263116663450680L)) * uf.a(6778, 497367338795811532L) * uf.a(7892, 336791122781456116L) - uf.a(13693, 5746443424473804277L);
        ** while (true)
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
                v0 = "\u001e\u0019_\u0018QHa2\u0012CQyFf>".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 57;
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
                                v9 = 98;
                                break;
                            }
                            case 1: {
                                v9 = 88;
                                break;
                            }
                            case 2: {
                                v9 = 18;
                                break;
                            }
                            case 3: {
                                v9 = 72;
                                break;
                            }
                            case 4: {
                                v9 = 6;
                                break;
                            }
                            case 5: {
                                v9 = 22;
                                break;
                            }
                            default: {
                                v9 = 45;
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
                uf.b = new String(v10).intern();
                var0_1 = 1297775041053207088L;
                var6_2 = new long[288];
                var3_3 = 0;
                var4_4 = "H!^\u00f5b\u0011,\u00b3j\u00ca\u00da\u009fq\u00da2\u000f\u0000\u0016\u00a6\u0010\u0082\u00c0\u00d7\u00a6\u00138\u00df\u00f2\u001bv<\u00a83Vb\u00dc\t\u0015\u00e0:\u007f\u0085\u0019yM\u00fc\u009c\u0011?\r\u00a2\u0094e\u00dc\u00b6$~L\u00d0\u00e7s\u00e4\u00c9z(\n?*s\u00f5[QQ\u00d3\u00908\u008f_\u001d\u00e4\u007ff\u00e6\u00b4\f\u00d7\u00b6\u00bc8\u00cdn\u00fd\u00da\u00f7{\tK\u007f/\u009b\u0006\u008d\u00f3?\u00f9\u00beF\u0082\u00b6;?\u00a5D\u00cc\u009f\u00ebY\u00d3\u0080j|\u00bd\u00c7@\u00d2\u00ec\u000b*\u00e5\u0089\tj\u00a3\u00cf\u0099=la\u008d\u0007\u000188[1\u0090q\u00d2Q\u00f0\u00a3\u001e\u00a6@\u0083\u00ed\u00a3\u00b5\u00b7\u0003+\u00f6\u00beH\u00ae\u009c\u00a2\u00e27\u00ffI\u00c2VqU\u00c2\\\u00daa\u00bc5\u0087R\u000e\u009eH5\u00e7\u0014\u00eb\u00c2\u0082C}\f\u00a6o\u009a\u00e0\u00ae\u00c2Y%\u00c1(\u00c1NmU\u00dc\u001e\u00c3\u00f3\u00d3CU%\u00b3\u009d_\u00cd\t\u00be\u00b1p\u008bq)\u0091\u00c5\u00a6\u00c9\u009e9\u00cfZ\u00a3\u0081\u00ce\u0012X\u0088`\rM\u00f1=\u00d1\u00d3v\u00b3\u00cdZ\u009dy\u0011\u0019\u00ee\u00fapv\u00b2\u00df\u0080\u00e6V\u00a9,\u0088\u009c\u0019M\u0095\u00ce\u00b4\u0014\u00b2cJ\u00a4aD\u00a66e\u00bf|\u00bd\u00e5.+F\u00b9\u00e2@\u00f8\u0091\u00eb\n\u00e0Y\u00aej\u0097\u0010`p!\u00bc\u00baf\u0001\u00d3\u001d\u00aeb\u00c8\u00f0G\u00b6X3\u00c8\u00a4\u0016\u0013I\u00bc\u00d10-Av\u009f:\u0011\u00ccu\u000bE+/{\u00f7M\u00cb`n&\u00f73\u00f3+;\u00fb\u009c\u00eb\u0016\u0013\u00c60\u00d6\u009d\u00f5G\u00a3\u00cdC\u009b\u0096\u00de\u00e2\u00f4`\\\b\u0093Ot\bEB\u0097\u001f\u0098|B_\u00f4}\\?b\u0004\u000f\rv\u00866\u0081\u00c2\u00bd?k/n\u00fc\u0014\u00a1tx*n.]\u00b5\u0018\u0083X<\u00c1]\u00a0\u00dcO\u009a\u00bf\u009c?\u009f0\u00fc\u00ae=\u00f5\u00df\u00a1\u001fe\u0003mu\u00e5\u0017\f\u00dft\r\u0000\u00e2\u00a19G#\u0086\u00b5\u00b4\u00b6\u0014\u00c4\u00c8\u00982\u0014\u00ae\u00ae\u001fI\u00d5\u00e0\u00e1\u00f2\u0097`\u0099\u00ceM\u00b1\u00138LnK$H\u00e4\u00e8\u0099\u00bfx<\u00bb\u00a1\u00f2x\u000b\u00af\u0080\u00d9d\u00b5\u00ea8\u00ae\u008f=\u00e9z\u00c5UA_\u00a7\u001b\u00c9\u00168\u009f \u008f\u0006!){\u00e7*\u00e0\u00cdmc]Q\u00b9\u000b\u00ec\u0092\u0090\u0099?xM\u008fY4\u0085\u00a7\u00c7\u00ca\u008e\r\u001f\u0010\u00ea\u00b7\u0011\u0086\u00059\u001c?(m_\u00ac\u00c23\u0000\u00a0\u00c49_\u00c441\u00f2f\u009b\u00b5\u008c\u00b6:>\u0018\u00a8\u00b941\u0000\u0007\u00a2\u00db\u00fb\u0096\u009f\u0002\u00ab\u00de\u000f\u00d4\u00c3\u0010\u0087\u00a7\u00d1\u0007\u00a4\u00e8#\u00bdHj\u0083\u00f2\u00c8\u00a1\u00ad8\u00d3L\u00ca\u00d4\u009dW\u00b4\u00de\u00d2\u00d0\u0012K\u00d1\u00df\u0018ENRU\u00e9\u0083\u008b\u00e3~\u008c\u00af\u0096p\u00b9\u00ca\u009b\u009a\u00e9\u00d0[$\u00cbj)\u00c0+-\u00bd\u001c\u009c\u0002'u2\u00a6\u00b12?\u00ac\u00bd\u0095\u00b2\\B\u00dd\u00b30P\u00b2\u00aa\u00014\u001bG#X\u0015\u00b9\u0015\u00a6\u00bf4\u00d5\u00f0\u00eb\u00a2g\u008e_\u0094\u00ee\u00b3\u00fa\u0084\u00e2\u00fa.\u00a7\u00dc/.\u00d2FX\u00f4\u0084r\u001c\u00ddI\u00ca\u00cf-\u0012\u00d9\u00143\u0017\u0092\u0087\u0003\u00d6\\\u00a9\u00ef\u0006\u00f8'\u00e4\u000b\u00c9\u00d7\u00a5\u00e5\u00f1w\u00a9\u00ed\u00fav\u00ab>\u00c4y\u00af@\u008dy\u00b4\u0087\u0090\u00f8\u00c6\u00ab\u0080\u008f>\u0000\r\u00b4\u00cb\u00e2\u0005\u0016\u0091O\u0013\u00d80\u000bP\u00a8\u00ad9\u00feO\u00e7\u00a4\u00fc\u00a3\u009f\u008bo{\u0004O\u0097B\u0002\u00b1\u00fa\u00f7\u00cb\u0092\u00cc\u00a0\u008edU\u0086E\u00fe\u00d8\u0013\u00d0\u008d\u00941\u00ef\fGS\u009b,\u0095\u00f7W\f8!%\u00d3\u0080o\u0005\u00fc\u00a7\u00b7\u00bcOr\u00ac[o\u0084\u00d8\u00c6\u00cci3\u00a5\u008b}\u00c6\u00e8\u00b3\u00e4DUw\u00e1B\u00e8D\u00d6&\u00da\u0011\u00fc\u00d9T\u001e\u001a\u00bf:_\u0081\u00a5t0\u00d4\u00bd\u000f\u00e5\u00ab\u00bf\u0085\u00f1\u00fd\u0096il\u0082\u00c3m\u0088FXl\u00ed\u0093\u008dr\u000br\u00a9\u00bf_\u00b6'6\u00f1\u000br\u00bcY\u008c\rW\u00b1q\u00cb.\u00c2$\u00ce)u\u00a6P\u0085a;*\u00f2\u0005aF\u00e32\u00d3+0F\u00dfx\u0095\u001cu8b2\u00bf\u0094\u00fd\u00cf\u0094\u00e0\u000e\u00c1Hy\u0093\u00ef>q\u00f1\u00bf}\u0083\u0091*\u00a3\u0003\u001a\u00c3\u00c2\u00ad\u0080\u0081k\rv\u00f9\u00e3\tj8?\u00f5\u0093(\u00dc\u0007|\u0085F\u00ca\u00ff\u00e2$z\u009c\u0001T\u0005\u001c\u00c93^\u00c0\u001e\u0017\u009bP#\u0002s\u00ceCb\u00a2\u0085\u00b8\u00d6\u0091`\u00b4\u00b5Zg\u000b\u007f&j\u008d/\u00e3{r.;\u00a3\u00c1B\u00feD\u00ae\u00b6r\f'\u0097w\u00bboH)\u008b.\u0093\u009b~\u0097\u0003\r\u0000\u00d1\u00e0\u001d\u00c4Q\tVD\u0098\u00b3\u0083,-jm\u0096\u00c1\u007f\u0087\u00ad!\u009a\u00a5\u00b1\u00f1u\u0017|\u0013\u0081\u001b\u00dd\u00f6\u00f2\u00f6\u0084&L\u00e6\u00f4\u0080\u0098n\u00ee\u00cb{\u0081\u00f6\u00df\u0019\"\fq\u0014\u00abt\u00b2\u008b\u00fb&\u00fe\u00f4]\u00b3\u0098\u00b6\u00faxCy\u00fb6\u00cd\u00eejmjP<\u00a1\u0082\u00e3\u00d8h(K0\u0080\u0001\u00b2\u000b\u0093y\u0096n\u00ce\u00f3\u00e6x\u00d4\u001a-\u00d1m4\u00e5g\u0000\u00c9\u00c2\u0088D\"\u0093g\u0098`\u00b7\u001f\u000e\u00d4HA\u00dd\u0082\u0016\u00ad\u00bc\u00c5ph7\u00ee\u00d9q\u00a6\u00faB.H\u00af^\u00eah\u00c6\u00c1-\u00c0\u0089\u0080U\u00b9\u00e2\t\u00b5\u001c\u0087y\u00a4\u0085Z\u0011q\u0094\u00d5\u00e6\u00ba&^gS@\u0013\u00fe-\u00b3\u0090@$\u00ef\u00bem\u00fd\u00cc\u00fa*\u0013/VL\u009fPy\u00cd\u0002\u00c5;Lz\u00cewE}\u00a0\u00f8\u00b7g0E\u00ba\u00ef[\u00c07\u00df\u001el\u00d5~\u00b5\u00a3\u00ad\u00b8C\u00bd\u000f\u00f0\u0002\u0095\u00e2\u0005\u00a3 \u0000\u00a8\u00eaOk\u00cdX\u00a3,U3b\u00b1\u008bY\u00fb\u00ed\u00c8qG\u00b5\u0015\u00d5#\u00a1\u00c74\u00ab\u009bd\u008f\u00f0=\u000e*\u00f2\u00f9M/\u00fep\u00aa\u00e2>\u001aLg\u009e~X\u0019\u00f1\u00aa\u00ca\u0006H\u00f8K\u00c8\u00d4\u00ec\u00fdXDV\u00ac\u00c9iU0\u00c9\u00e7\u00e3\u0001\u000f\u0084\u0097\u00ae\u000b\u008eK\u009a\u00f2\u00c36wW6L]R\u00b8}\u008b~\u00d6\u00e7\u00833\u0097;\u00db\u00a22i\u00b0\u00fe\u00e4\u00ef\u009c[[\u00b7\u00fb\f\u00d1\u001c\u001a\u00e7\u0083h\u0092\u0012\u00e9 \u00bd<p)\u0011\u009d?\u00a7\u00b7\u0085i\u0084y\u00efL:IRbw\u00deL\f43wQ\u00dfP\u00b0{\u00e8\u008a\u00df `\u0010L$\u00a8B\u0080\u008d\u0019\u00a8\u00a1[W\u00c7\u0018\u00aa\u00aek?\u008a2\u0085D28\u00e1\u00a2\u00f05\u00dcfH(O\u001c\u00db\u00a2yo\u00ec\u00f9\u00f7\u00d1(Y\n\u00d3H\u00c7dH\u00b0M\u00f7Ro\u00e7\u00ef=\u0084y\u00a9\u00d0J92\u0006G,(\u00ed\u00e1w\u00ec\u008c\"\\\u00b9\u00b3\u0015v\u009f\u00db_\u00c4\u000f:\u00cf\u00b8\u00a6~\u0002\u008e\u00be\u00cb6\u00e2O\u00c7\u00805\u00a3I\u008b\u00b1\u00e6\u00b06\u0095\u00a9\u000f\u00f7w\u0018\u00140ee\u00a1L\u00f8A\u00daZ]=\u00a1<\"@o%\u0095\u00f3g \u00c2U7\u0089\u00e2\u00db\u0012\u0010\u00a0\u001d\u00a4\u00a6P\u000f4L\u000f<\u00a1\u00e7y\u0095\u00b1\u00daM\u0004\u008f\\\u00d6\u0094\u00ec3\u008e\u00af\u00b8\u00b8\u00d0\u0088\u0089\u0017>(Q\u00b5\u00e9\u0001S\u00e5S\u00c6\u00f8K\u00f1\u0010R\u0093F.\u00daI)B\u0007\u0002Z\u00cel\u0017pV)\u00a2\u00b8\u00f9\u000b\u00da\u0019\u00e4\u0002\u0007\u00c5Z\u00b6\u008d\u0086\u0005\u00f8\u00d0\u00ffP*\u0003\u00dbI\u0013\u009a?H\u00a2S\u0090\u0017\u00e2\u009fMZ\u00c3J\u00caw{k\u001e\u000f\u008f\u0006\u00bbC%\u00d8\u008b\u0002\u00ca\u00faj\u000fb\u00bf\u00cb\u00e7\u00deS\u00fb|\u009e\u00ecD\u00b3\u001a\u00b7\u00d7\u00fb9\u00ea\u008f\u00e2\u00ce\u0002\u00c6\u00c7.\u00c6|\u00a1\u00b72y\u0012KJ\u0094(\u008a \u00d2\u0000\u00cd}\u00b0C]5\u00f6\u00ce\u0004Y\u00f7\u00a5K-\u0090\u0016Qsn1\u00fb\u008e\u00d4z>\u00acP{\u00a7.\u00f6\u00ba\u0080\u00ad\u00ac\u00fa\u00cb4\u00cdY]\u00cc\u0013lm\u0085\u00df\u00a25\bPP\u00cfWk \u00e0;\b\u00a4@\u0087\u00eb&\u00ec\u00ac\u0084d\u00a5\u0010s\u00bdv\u00bf\u00e7\u0005b[T\u00c5T|\u008d\u0012\u00e9)\u00fb\\}\u0015\u00c4\u00b5\u00e9\u000b\u008ez\u00ec\u001d\n\u00ba\u00ffX\u00c2en\u0098z\u00fd\u0095PQ\u0015g\u00dd\u00a9T\u00ed\u00cc!<\f\u0019(}\u00a6\u0090M\u00fa\u00a39\u009du0\u00b4\u00f4|3`\t\u00ca\u009a]\u00e4\u00be\u0090/|\u00eb\u00d2&-\u0080\u00c9\"\u009c!\u008f&\u00ed\u00e5\u001bX*\u00db5fD\u00ed\u0007\u00f6>t>\u00d3c\u0098FW;\u00b4,\u009e\u0080emf\u00c6\u00f8\u00eb\u00b7\u009a\u00fb(\u0013s^\u0089`\u00ab]\u00c9\u00e0\u0017\u0084\u000b\u00d88\u0006\u009e\u0084\u00fc\u0015!`\u0007\u0097>\u00ee\u000e\u00eeS\u00c7Y}\u00f4\t\\2\u00d6n\u00c2\u00b3\u00aa\u00b3\u00f7\u0082\u00dc\u00b0\"F\u001d\u00fa\u008e\u00c7\u00c4< \u001a\u0098\u0080\u00a5\u0084\u0018\u0095B\u00e3\u00c5~{}\u008e\\ik@\u00f2{j\u0010\u0086&X\u0085\u00cc\u00d4\u0085\u007f\u0089\u00d9\u00d0\u0001\ru\f\u00f2\u0087kDo\u00ff\u0093\u0090\r\u0007\u001cv\u00f1~\u00e6\u009d\u00be'n^\u00b1\u00e56 v\u0006\r\u00d3xg\u00ae\u00d7\u00c6-\u00b7\f\"$\u0017\u00db\u0092\u000bF[PL\u00d7\u00a6\u00f1?dN\"=\u0015\u00f5\u0012\u00ff\u0087\u00f0\bq\u009f\u00c9\u0097\u0016y'\u0000fu{\u0093\u00bd\u00af\u00c8\u0094,\u00de\u00a4\r@2\u009c\u00a0\u001c\u00a9\u00df\u00d0>\u008d\u00bd\u008br\u00db\u00e6\u0013\u0082+Nol\u00aam\"\u00ea\u0003H![\u00c7\u0004\"@\u008e\u0003\u00a9,.\u0097\u00ef\u00f9Has\u001cP7\u00e8\u00f6\u00a7ElE~\u00fcE\u00a7\u00ac\u000e^\u00d7\u0015\u00ac\u0014\u001d\u00ef\u00c5\u00a7\u0000\u0082\u0094\u00b1\u00c4\u00afrk\u00aa\u00df\u00f7\u00f5\r`\u00ce\u00a4R\u00b4R\u001a\"\u0011\u00d1\u00af\u00d4\u0007\u0010\u0082c\u00adQ\u001f\u0018'X\u0000\u008axz:\u0011\u00a5\u00bd\u00ef\u00ae\u00db,\u0084\u008d]3M\u009dS$\u00e0\u00d3ZQ5N\u009f\u0013\u0087\u00d2\u00c2H\u008d\u008f\u0088\u00db\u0012\u000e \u0088\u00de\u00a6\u00f15U\u0097\u009c\u0007\u008bt4I{s\u00fb.";
                var5_5 = "H!^\u00f5b\u0011,\u00b3j\u00ca\u00da\u009fq\u00da2\u000f\u0000\u0016\u00a6\u0010\u0082\u00c0\u00d7\u00a6\u00138\u00df\u00f2\u001bv<\u00a83Vb\u00dc\t\u0015\u00e0:\u007f\u0085\u0019yM\u00fc\u009c\u0011?\r\u00a2\u0094e\u00dc\u00b6$~L\u00d0\u00e7s\u00e4\u00c9z(\n?*s\u00f5[QQ\u00d3\u00908\u008f_\u001d\u00e4\u007ff\u00e6\u00b4\f\u00d7\u00b6\u00bc8\u00cdn\u00fd\u00da\u00f7{\tK\u007f/\u009b\u0006\u008d\u00f3?\u00f9\u00beF\u0082\u00b6;?\u00a5D\u00cc\u009f\u00ebY\u00d3\u0080j|\u00bd\u00c7@\u00d2\u00ec\u000b*\u00e5\u0089\tj\u00a3\u00cf\u0099=la\u008d\u0007\u000188[1\u0090q\u00d2Q\u00f0\u00a3\u001e\u00a6@\u0083\u00ed\u00a3\u00b5\u00b7\u0003+\u00f6\u00beH\u00ae\u009c\u00a2\u00e27\u00ffI\u00c2VqU\u00c2\\\u00daa\u00bc5\u0087R\u000e\u009eH5\u00e7\u0014\u00eb\u00c2\u0082C}\f\u00a6o\u009a\u00e0\u00ae\u00c2Y%\u00c1(\u00c1NmU\u00dc\u001e\u00c3\u00f3\u00d3CU%\u00b3\u009d_\u00cd\t\u00be\u00b1p\u008bq)\u0091\u00c5\u00a6\u00c9\u009e9\u00cfZ\u00a3\u0081\u00ce\u0012X\u0088`\rM\u00f1=\u00d1\u00d3v\u00b3\u00cdZ\u009dy\u0011\u0019\u00ee\u00fapv\u00b2\u00df\u0080\u00e6V\u00a9,\u0088\u009c\u0019M\u0095\u00ce\u00b4\u0014\u00b2cJ\u00a4aD\u00a66e\u00bf|\u00bd\u00e5.+F\u00b9\u00e2@\u00f8\u0091\u00eb\n\u00e0Y\u00aej\u0097\u0010`p!\u00bc\u00baf\u0001\u00d3\u001d\u00aeb\u00c8\u00f0G\u00b6X3\u00c8\u00a4\u0016\u0013I\u00bc\u00d10-Av\u009f:\u0011\u00ccu\u000bE+/{\u00f7M\u00cb`n&\u00f73\u00f3+;\u00fb\u009c\u00eb\u0016\u0013\u00c60\u00d6\u009d\u00f5G\u00a3\u00cdC\u009b\u0096\u00de\u00e2\u00f4`\\\b\u0093Ot\bEB\u0097\u001f\u0098|B_\u00f4}\\?b\u0004\u000f\rv\u00866\u0081\u00c2\u00bd?k/n\u00fc\u0014\u00a1tx*n.]\u00b5\u0018\u0083X<\u00c1]\u00a0\u00dcO\u009a\u00bf\u009c?\u009f0\u00fc\u00ae=\u00f5\u00df\u00a1\u001fe\u0003mu\u00e5\u0017\f\u00dft\r\u0000\u00e2\u00a19G#\u0086\u00b5\u00b4\u00b6\u0014\u00c4\u00c8\u00982\u0014\u00ae\u00ae\u001fI\u00d5\u00e0\u00e1\u00f2\u0097`\u0099\u00ceM\u00b1\u00138LnK$H\u00e4\u00e8\u0099\u00bfx<\u00bb\u00a1\u00f2x\u000b\u00af\u0080\u00d9d\u00b5\u00ea8\u00ae\u008f=\u00e9z\u00c5UA_\u00a7\u001b\u00c9\u00168\u009f \u008f\u0006!){\u00e7*\u00e0\u00cdmc]Q\u00b9\u000b\u00ec\u0092\u0090\u0099?xM\u008fY4\u0085\u00a7\u00c7\u00ca\u008e\r\u001f\u0010\u00ea\u00b7\u0011\u0086\u00059\u001c?(m_\u00ac\u00c23\u0000\u00a0\u00c49_\u00c441\u00f2f\u009b\u00b5\u008c\u00b6:>\u0018\u00a8\u00b941\u0000\u0007\u00a2\u00db\u00fb\u0096\u009f\u0002\u00ab\u00de\u000f\u00d4\u00c3\u0010\u0087\u00a7\u00d1\u0007\u00a4\u00e8#\u00bdHj\u0083\u00f2\u00c8\u00a1\u00ad8\u00d3L\u00ca\u00d4\u009dW\u00b4\u00de\u00d2\u00d0\u0012K\u00d1\u00df\u0018ENRU\u00e9\u0083\u008b\u00e3~\u008c\u00af\u0096p\u00b9\u00ca\u009b\u009a\u00e9\u00d0[$\u00cbj)\u00c0+-\u00bd\u001c\u009c\u0002'u2\u00a6\u00b12?\u00ac\u00bd\u0095\u00b2\\B\u00dd\u00b30P\u00b2\u00aa\u00014\u001bG#X\u0015\u00b9\u0015\u00a6\u00bf4\u00d5\u00f0\u00eb\u00a2g\u008e_\u0094\u00ee\u00b3\u00fa\u0084\u00e2\u00fa.\u00a7\u00dc/.\u00d2FX\u00f4\u0084r\u001c\u00ddI\u00ca\u00cf-\u0012\u00d9\u00143\u0017\u0092\u0087\u0003\u00d6\\\u00a9\u00ef\u0006\u00f8'\u00e4\u000b\u00c9\u00d7\u00a5\u00e5\u00f1w\u00a9\u00ed\u00fav\u00ab>\u00c4y\u00af@\u008dy\u00b4\u0087\u0090\u00f8\u00c6\u00ab\u0080\u008f>\u0000\r\u00b4\u00cb\u00e2\u0005\u0016\u0091O\u0013\u00d80\u000bP\u00a8\u00ad9\u00feO\u00e7\u00a4\u00fc\u00a3\u009f\u008bo{\u0004O\u0097B\u0002\u00b1\u00fa\u00f7\u00cb\u0092\u00cc\u00a0\u008edU\u0086E\u00fe\u00d8\u0013\u00d0\u008d\u00941\u00ef\fGS\u009b,\u0095\u00f7W\f8!%\u00d3\u0080o\u0005\u00fc\u00a7\u00b7\u00bcOr\u00ac[o\u0084\u00d8\u00c6\u00cci3\u00a5\u008b}\u00c6\u00e8\u00b3\u00e4DUw\u00e1B\u00e8D\u00d6&\u00da\u0011\u00fc\u00d9T\u001e\u001a\u00bf:_\u0081\u00a5t0\u00d4\u00bd\u000f\u00e5\u00ab\u00bf\u0085\u00f1\u00fd\u0096il\u0082\u00c3m\u0088FXl\u00ed\u0093\u008dr\u000br\u00a9\u00bf_\u00b6'6\u00f1\u000br\u00bcY\u008c\rW\u00b1q\u00cb.\u00c2$\u00ce)u\u00a6P\u0085a;*\u00f2\u0005aF\u00e32\u00d3+0F\u00dfx\u0095\u001cu8b2\u00bf\u0094\u00fd\u00cf\u0094\u00e0\u000e\u00c1Hy\u0093\u00ef>q\u00f1\u00bf}\u0083\u0091*\u00a3\u0003\u001a\u00c3\u00c2\u00ad\u0080\u0081k\rv\u00f9\u00e3\tj8?\u00f5\u0093(\u00dc\u0007|\u0085F\u00ca\u00ff\u00e2$z\u009c\u0001T\u0005\u001c\u00c93^\u00c0\u001e\u0017\u009bP#\u0002s\u00ceCb\u00a2\u0085\u00b8\u00d6\u0091`\u00b4\u00b5Zg\u000b\u007f&j\u008d/\u00e3{r.;\u00a3\u00c1B\u00feD\u00ae\u00b6r\f'\u0097w\u00bboH)\u008b.\u0093\u009b~\u0097\u0003\r\u0000\u00d1\u00e0\u001d\u00c4Q\tVD\u0098\u00b3\u0083,-jm\u0096\u00c1\u007f\u0087\u00ad!\u009a\u00a5\u00b1\u00f1u\u0017|\u0013\u0081\u001b\u00dd\u00f6\u00f2\u00f6\u0084&L\u00e6\u00f4\u0080\u0098n\u00ee\u00cb{\u0081\u00f6\u00df\u0019\"\fq\u0014\u00abt\u00b2\u008b\u00fb&\u00fe\u00f4]\u00b3\u0098\u00b6\u00faxCy\u00fb6\u00cd\u00eejmjP<\u00a1\u0082\u00e3\u00d8h(K0\u0080\u0001\u00b2\u000b\u0093y\u0096n\u00ce\u00f3\u00e6x\u00d4\u001a-\u00d1m4\u00e5g\u0000\u00c9\u00c2\u0088D\"\u0093g\u0098`\u00b7\u001f\u000e\u00d4HA\u00dd\u0082\u0016\u00ad\u00bc\u00c5ph7\u00ee\u00d9q\u00a6\u00faB.H\u00af^\u00eah\u00c6\u00c1-\u00c0\u0089\u0080U\u00b9\u00e2\t\u00b5\u001c\u0087y\u00a4\u0085Z\u0011q\u0094\u00d5\u00e6\u00ba&^gS@\u0013\u00fe-\u00b3\u0090@$\u00ef\u00bem\u00fd\u00cc\u00fa*\u0013/VL\u009fPy\u00cd\u0002\u00c5;Lz\u00cewE}\u00a0\u00f8\u00b7g0E\u00ba\u00ef[\u00c07\u00df\u001el\u00d5~\u00b5\u00a3\u00ad\u00b8C\u00bd\u000f\u00f0\u0002\u0095\u00e2\u0005\u00a3 \u0000\u00a8\u00eaOk\u00cdX\u00a3,U3b\u00b1\u008bY\u00fb\u00ed\u00c8qG\u00b5\u0015\u00d5#\u00a1\u00c74\u00ab\u009bd\u008f\u00f0=\u000e*\u00f2\u00f9M/\u00fep\u00aa\u00e2>\u001aLg\u009e~X\u0019\u00f1\u00aa\u00ca\u0006H\u00f8K\u00c8\u00d4\u00ec\u00fdXDV\u00ac\u00c9iU0\u00c9\u00e7\u00e3\u0001\u000f\u0084\u0097\u00ae\u000b\u008eK\u009a\u00f2\u00c36wW6L]R\u00b8}\u008b~\u00d6\u00e7\u00833\u0097;\u00db\u00a22i\u00b0\u00fe\u00e4\u00ef\u009c[[\u00b7\u00fb\f\u00d1\u001c\u001a\u00e7\u0083h\u0092\u0012\u00e9 \u00bd<p)\u0011\u009d?\u00a7\u00b7\u0085i\u0084y\u00efL:IRbw\u00deL\f43wQ\u00dfP\u00b0{\u00e8\u008a\u00df `\u0010L$\u00a8B\u0080\u008d\u0019\u00a8\u00a1[W\u00c7\u0018\u00aa\u00aek?\u008a2\u0085D28\u00e1\u00a2\u00f05\u00dcfH(O\u001c\u00db\u00a2yo\u00ec\u00f9\u00f7\u00d1(Y\n\u00d3H\u00c7dH\u00b0M\u00f7Ro\u00e7\u00ef=\u0084y\u00a9\u00d0J92\u0006G,(\u00ed\u00e1w\u00ec\u008c\"\\\u00b9\u00b3\u0015v\u009f\u00db_\u00c4\u000f:\u00cf\u00b8\u00a6~\u0002\u008e\u00be\u00cb6\u00e2O\u00c7\u00805\u00a3I\u008b\u00b1\u00e6\u00b06\u0095\u00a9\u000f\u00f7w\u0018\u00140ee\u00a1L\u00f8A\u00daZ]=\u00a1<\"@o%\u0095\u00f3g \u00c2U7\u0089\u00e2\u00db\u0012\u0010\u00a0\u001d\u00a4\u00a6P\u000f4L\u000f<\u00a1\u00e7y\u0095\u00b1\u00daM\u0004\u008f\\\u00d6\u0094\u00ec3\u008e\u00af\u00b8\u00b8\u00d0\u0088\u0089\u0017>(Q\u00b5\u00e9\u0001S\u00e5S\u00c6\u00f8K\u00f1\u0010R\u0093F.\u00daI)B\u0007\u0002Z\u00cel\u0017pV)\u00a2\u00b8\u00f9\u000b\u00da\u0019\u00e4\u0002\u0007\u00c5Z\u00b6\u008d\u0086\u0005\u00f8\u00d0\u00ffP*\u0003\u00dbI\u0013\u009a?H\u00a2S\u0090\u0017\u00e2\u009fMZ\u00c3J\u00caw{k\u001e\u000f\u008f\u0006\u00bbC%\u00d8\u008b\u0002\u00ca\u00faj\u000fb\u00bf\u00cb\u00e7\u00deS\u00fb|\u009e\u00ecD\u00b3\u001a\u00b7\u00d7\u00fb9\u00ea\u008f\u00e2\u00ce\u0002\u00c6\u00c7.\u00c6|\u00a1\u00b72y\u0012KJ\u0094(\u008a \u00d2\u0000\u00cd}\u00b0C]5\u00f6\u00ce\u0004Y\u00f7\u00a5K-\u0090\u0016Qsn1\u00fb\u008e\u00d4z>\u00acP{\u00a7.\u00f6\u00ba\u0080\u00ad\u00ac\u00fa\u00cb4\u00cdY]\u00cc\u0013lm\u0085\u00df\u00a25\bPP\u00cfWk \u00e0;\b\u00a4@\u0087\u00eb&\u00ec\u00ac\u0084d\u00a5\u0010s\u00bdv\u00bf\u00e7\u0005b[T\u00c5T|\u008d\u0012\u00e9)\u00fb\\}\u0015\u00c4\u00b5\u00e9\u000b\u008ez\u00ec\u001d\n\u00ba\u00ffX\u00c2en\u0098z\u00fd\u0095PQ\u0015g\u00dd\u00a9T\u00ed\u00cc!<\f\u0019(}\u00a6\u0090M\u00fa\u00a39\u009du0\u00b4\u00f4|3`\t\u00ca\u009a]\u00e4\u00be\u0090/|\u00eb\u00d2&-\u0080\u00c9\"\u009c!\u008f&\u00ed\u00e5\u001bX*\u00db5fD\u00ed\u0007\u00f6>t>\u00d3c\u0098FW;\u00b4,\u009e\u0080emf\u00c6\u00f8\u00eb\u00b7\u009a\u00fb(\u0013s^\u0089`\u00ab]\u00c9\u00e0\u0017\u0084\u000b\u00d88\u0006\u009e\u0084\u00fc\u0015!`\u0007\u0097>\u00ee\u000e\u00eeS\u00c7Y}\u00f4\t\\2\u00d6n\u00c2\u00b3\u00aa\u00b3\u00f7\u0082\u00dc\u00b0\"F\u001d\u00fa\u008e\u00c7\u00c4< \u001a\u0098\u0080\u00a5\u0084\u0018\u0095B\u00e3\u00c5~{}\u008e\\ik@\u00f2{j\u0010\u0086&X\u0085\u00cc\u00d4\u0085\u007f\u0089\u00d9\u00d0\u0001\ru\f\u00f2\u0087kDo\u00ff\u0093\u0090\r\u0007\u001cv\u00f1~\u00e6\u009d\u00be'n^\u00b1\u00e56 v\u0006\r\u00d3xg\u00ae\u00d7\u00c6-\u00b7\f\"$\u0017\u00db\u0092\u000bF[PL\u00d7\u00a6\u00f1?dN\"=\u0015\u00f5\u0012\u00ff\u0087\u00f0\bq\u009f\u00c9\u0097\u0016y'\u0000fu{\u0093\u00bd\u00af\u00c8\u0094,\u00de\u00a4\r@2\u009c\u00a0\u001c\u00a9\u00df\u00d0>\u008d\u00bd\u008br\u00db\u00e6\u0013\u0082+Nol\u00aam\"\u00ea\u0003H![\u00c7\u0004\"@\u008e\u0003\u00a9,.\u0097\u00ef\u00f9Has\u001cP7\u00e8\u00f6\u00a7ElE~\u00fcE\u00a7\u00ac\u000e^\u00d7\u0015\u00ac\u0014\u001d\u00ef\u00c5\u00a7\u0000\u0082\u0094\u00b1\u00c4\u00afrk\u00aa\u00df\u00f7\u00f5\r`\u00ce\u00a4R\u00b4R\u001a\"\u0011\u00d1\u00af\u00d4\u0007\u0010\u0082c\u00adQ\u001f\u0018'X\u0000\u008axz:\u0011\u00a5\u00bd\u00ef\u00ae\u00db,\u0084\u008d]3M\u009dS$\u00e0\u00d3ZQ5N\u009f\u0013\u0087\u00d2\u00c2H\u008d\u008f\u0088\u00db\u0012\u000e \u0088\u00de\u00a6\u00f15U\u0097\u009c\u0007\u008bt4I{s\u00fb.".length();
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
                    var4_4 = "~\u0096\u00d5\u00c1R\u00a3!\u00f2\u00a0\u00da\u00ef\u0010\u00a2\u001c\u0005\u00b1";
                    var5_5 = "~\u0096\u00d5\u00c1R\u00a3!\u00f2\u00a0\u00da\u00ef\u0010\u00a2\u001c\u0005\u00b1".length();
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
        uf.c = var6_2;
        uf.d = new Integer[288];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5873;
        if (d[n2] == null) {
            uf.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
