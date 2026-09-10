/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.network.protocol.game.ServerboundSwingPacket
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.phys.EntityHitResult
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.OW;
import com.github.epsilon.XG;
import com.github.epsilon.Xn;
import com.github.epsilon._Z;
import com.github.epsilon._c;
import com.github.epsilon._y;
import com.github.epsilon.d6;
import com.github.epsilon.d9;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.gD;
import com.github.epsilon.hi;
import com.github.epsilon.lh;
import com.github.epsilon.nf;
import com.github.epsilon.uK;
import com.github.epsilon.vY;
import com.github.epsilon.w;
import com.github.epsilon.y6;
import com.github.epsilon.yE;
import com.github.epsilon.ya;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.network.protocol.game.ServerboundSwingPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.EntityHitResult;

public class eY
extends e {
    private final DV n;
    private final DM P;
    private final DV vE;
    private final Xn e;
    private final Xn E;
    private final DM u;
    private final Xn X;
    public final DM vy;
    private final Xn d;
    private final DM vl;
    private final DM a;
    private final Xn vF;
    private final DM C;
    private final DV vK;
    private int m;
    private final DM o;
    private final DM l;
    private int O;
    private final DM vB;
    private final DM vg;
    private final XG vj;
    public final Dx<nf> vm;
    private final DM c;
    private final XG L;
    private final DV W;
    private final Dx<ya> t;
    private final DM v;
    private final Dx<OW> vk;
    public LivingEntity vb;
    private final DM z;
    public static final eY M;
    private final XG vn;
    private final XG B;
    private final Dx<lh> vz;
    private final Xn V;
    private final Dx<y6> va;
    private List<LivingEntity> vX;
    private final Xn F;
    private final XG b;
    private final DV H;
    private final Dx<d6> q;
    public final DM S;
    private final DV k;
    private final DM y;
    private final Xn Q;
    private final Xn T;
    private final DM N;
    private final XG vL;
    private final _Z K;
    private final Xn vI;
    private final Xn h;
    private long w;
    private final DM D;
    private final Xn x;
    private final DM vx;
    private final Dx<_c> vt;
    private final Xn J = eY.r("ZL24Z0B2i2NZTo3v", U(java.lang.String boolean ), (eY)this, (String)eY.b(30003, -27911), (boolean)true);
    private static final String[] cb;
    private static final String[] db;
    private static final long[] eb;
    private static final Integer[] jb;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$23() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                    if (!bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)754997473815367169L), (Object)hi.a("j", (long)664922924664801820L), (long)511460060498514638L);
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

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$12() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L))))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)1193866327045333285L), (long)511460060498514638L);
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

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$15() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)918502104200369066L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void E(dR var1_1) {
        block29: {
            block30: {
                var2_2 = Dl.t();
                var6_3 /* !! */  = (eY.c(5993, 4192922268292039800L) - eY.c(12421, 5453035902200865552L) ^ eY.c(13830, 3991575353834759628L)) - eY.c(13373, 4341879482797451073L);
                if (var2_2) ** GOTO lbl-1000
                switch (var6_3 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var3_4 = hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (long)448833838692499857L);
                        if (!var2_2) break;
                        break block30;
                    }
                    case 90855158: {
                        throw null;
                    }
                }
                var6_3 /* !! */  = (eY.c(6810, 2255778956753783236L) - eY.c(4988, 2366119299585524189L)) / eY.c(19232, 6484538535955306755L) + eY.c(4991, 897697943709303245L);
                if (!var2_2) break block29;
                ** GOTO lbl19
            }
lbl15:
            // 2 sources

            while (true) {
                block32: {
                    block31: {
                        v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)832352583946560914L);
                        if (var2_2) break block31;
                        if (v0 /* !! */  > 0) break block32;
lbl19:
                        // 2 sources

                        v0 /* !! */  = (CallSite)(hi.a("G", (int)(eY.c(27992, 5560962211215949683L) * eY.c(31771, 6964765835959774727L) + eY.c(31175, 3229481178383100729L)), (int)eY.c(11581, 203555165749903347L), (long)834203424483934088L) ^ eY.c(17062, 3576976299526819915L));
                    }
                    var6_3 /* !! */  = (int)v0 /* !! */ ;
                    if (!var2_2) break block29;
                }
                var6_3 /* !! */  = eY.c(21602, 1139186992747447961L) - eY.c(22892, 5121343293374892798L) - eY.c(28510, 5974339222132341957L);
                if (!var2_2) break block29;
                ** GOTO lbl80
                break;
            }
lbl27:
            // 2 sources

            while (true) {
                v1 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1007762102459795861L), (long)789438897355831922L)), (long)1000026253634408124L);
                if (var2_2) ** GOTO lbl145
                if (v1 == false) ** GOTO lbl144
                ** GOTO lbl147
                break;
            }
lbl32:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (Object)new ServerboundSwingPacket((InteractionHand)hi.a("j", (long)844572035549319610L)), (long)367302555785540234L);
                if (!var2_2) ** GOTO lbl151
lbl35:
                // 2 sources

                while (var2_2) {
                    return;
                }
                ** GOTO lbl153
                break;
            }
        }
        block26: while (true) {
            block33: {
                switch (var6_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -632607359: {
                        v2 = this;
                        hi.a("\u00f2", (Object)v2, (int)(hi.a("\u00e9", (Object)v2, (long)832352583946560914L) - true), (long)832352583946560914L);
                        v3 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)741859457151787705L), (long)789438897355831922L)), (long)1000026253634408124L);
                        if (var2_2) ** GOTO lbl81
                        if (v3 /* !! */  == false) ** GOTO lbl80
                        ** GOTO lbl83
                    }
                    case -632607360: {
                        v4 = hi.a("G", (long)405872435149102496L);
                        if (var2_2) ** GOTO lbl86
                        if (v4 != false) ** GOTO lbl85
                        ** GOTO lbl88
                    }
                    case -632607353: {
                        v5 /* !! */  = hi.a("\u00a5", (Object)hi.a("j", (long)1099970570863166760L), (Object)new Object[0], (long)560263715272728412L);
                        if (var2_2) ** GOTO lbl91
                        if (v5 /* !! */  == false) ** GOTO lbl90
                        ** GOTO lbl93
                    }
                    case -632607356: {
                        v6 = var3_4 instanceof EntityHitResult;
                        if (var2_2) ** GOTO lbl96
                        if (v6 == 0) ** GOTO lbl95
                        ** GOTO lbl97
                    }
                    case -632607355: {
                        var4_5 = (EntityHitResult)var3_4;
                        var5_6 = hi.a("\u00a5", (Object)var4_5, (long)1041207400292436410L);
                        v7 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)411403637155787509L);
                        if (var2_2) ** GOTO lbl100
                        if (v7 /* !! */  != false) ** GOTO lbl99
                        ** GOTO lbl102
                    }
                    case -632607362: {
                        ** GOTO lbl35
                    }
                    case -632607361: {
                        hi.a("G", (float)-1.0f, (long)542180438698619312L);
                        hi.a("G", (boolean)false, (long)758395134657997950L);
                        return;
                    }
lbl80:
                    // 2 sources

                    v3 /* !! */  = (CallSite)((eY.c(20899, 5532280135932838829L) / 2 + eY.c(16700, 7317355590331142790L)) * eY.c(2704, 9010958246624974998L) + eY.c(32180, 595583125323067039L));
lbl81:
                    // 2 sources

                    var6_3 /* !! */  = (int)v3 /* !! */ ;
                    if (!var2_2) continue block26;
lbl83:
                    // 2 sources

                    var6_3 /* !! */  = (hi.a("G", (int)eY.c(31352, 7834337168757991675L), (int)eY.c(20677, 4251523830716826382L), (long)834203424483934088L) ^ eY.c(24847, 3955684390517781286L)) - eY.c(10862, 295818307606903089L);
                    if (!var2_2) continue block26;
lbl85:
                    // 2 sources

                    v4 = hi.a("G", (int)eY.r("ZL24Z0B2i2NZTo3v", max(int int ), (int)(eY.c(12719, 2744517025833738932L) - eY.c(31662, 5981554466147018878L) + eY.c(24787, 5013810247500051300L)), (int)eY.c(17717, 7431208130532218668L)), (int)eY.c(25328, 3557104742740406468L), (long)834203424483934088L) + eY.c(7774, 5470572131827862810L);
lbl86:
                    // 2 sources

                    var6_3 /* !! */  = (int)v4;
                    if (!var2_2) continue block26;
lbl88:
                    // 2 sources

                    var6_3 /* !! */  = (eY.c(16466, 6619050914458079812L) / 2 + eY.c(602, 7756487363757822128L)) * eY.c(2670, 3382258204016892236L) + eY.c(32455, 2119880292968377584L);
                    if (!var2_2) continue block26;
lbl90:
                    // 2 sources

                    v5 /* !! */  = (CallSite)(eY.c(4127, 1063703983119909584L) * eY.c(8474, 6806723773137318793L) + eY.c(17577, 7684240433245099599L) - eY.c(29657, 6196640764401885315L) ^ eY.c(18389, 3947505811910694125L));
lbl91:
                    // 2 sources

                    var6_3 /* !! */  = (int)v5 /* !! */ ;
                    if (!var2_2) continue block26;
lbl93:
                    // 2 sources

                    var6_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(eY.c(26949, 6599462542171814895L) - eY.c(23326, 9111982440820050062L) + eY.c(27744, 3925281814190800871L)), (int)eY.c(13905, 8148793437969966142L), (long)834203424483934088L), (int)eY.c(6285, 165827503840578145L), (long)834203424483934088L) + eY.c(26622, 3474669482383881276L));
                    if (!var2_2) continue block26;
lbl95:
                    // 2 sources

                    v6 = var6_3 /* !! */  = eY.c(24589, 6460835667868103313L) - eY.c(3860, 2103619626945829989L) - eY.c(30038, 2675112912204801946L);
lbl96:
                    // 2 sources

                    if (!var2_2) continue block26;
lbl97:
                    // 2 sources

                    var6_3 /* !! */  = (eY.c(5381, 4386304111566505696L) + eY.c(5929, 4116263587885565222L) - eY.c(29601, 4757656307856908412L)) * eY.c(5539, 7140809558910355093L) / eY.c(5910, 2412404142009238750L) - eY.c(14123, 3423918187187201462L);
                    continue block26;
lbl99:
                    // 1 sources

                    v7 /* !! */  = (CallSite)((eY.c(14446, 8167136850996358026L) ^ eY.c(8840, 6845148239161126959L)) * eY.c(743, 1777076065857916946L) / eY.c(19232, 6484538535955306755L) ^ eY.c(19892, 3101161152781262610L) ^ eY.c(1267, 199476760817424329L));
lbl100:
                    // 2 sources

                    var6_3 /* !! */  = (int)v7 /* !! */ ;
                    if (!var2_2) break block33;
lbl102:
                    // 2 sources

                    var6_3 /* !! */  = ((eY.c(30343, 6023552110708433969L) ^ eY.c(15806, 4531688122170929038L)) - eY.c(30318, 1575786953033229804L)) * eY.c(21372, 2321072880512073906L) * eY.c(15739, 1439867063902170724L) + eY.c(3447, 257234513414971091L);
                    if (!var2_2) break block33;
                    ** GOTO lbl134
                    case -632607358: {
                        return;
                    }
                    case -632607354: 
                }
                return;
            }
            block27: do lbl-1000:
            // 6 sources

            {
                block36: {
                    block35: {
                        block34: {
                            switch (var6_3 /* !! */ ) {
                                default: {
                                    return;
                                }
                                case 71858526: {
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)var5_6, (long)899051199446605892L);
                                    v8 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)644742351621817192L), (long)511460060498514638L);
                                    if (var2_2) break block34;
                                    if (v8 == false) break;
                                    break block35;
                                }
                                case 71858525: {
                                    hi.a("G", (Object)new Object[]{var5_6}, (long)575386151991632296L);
                                    if (!var2_2) break block36;
                                    ** GOTO lbl27
                                }
                                case 71858523: {
                                    ** continue;
                                }
                                case 71858524: {
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)1027340002540470646L);
                                    if (!var2_2) break block27;
                                    ** GOTO lbl32
                                }
                                case 71858528: {
                                    ** continue;
                                }
                                case 71858529: {
                                    throw null;
                                }
                            }
lbl134:
                            // 2 sources

                            v8 = eY.r("ZL24Z0B2i2NZTo3v", max(int int ), (int)eY.c(21247, 3385078668909216029L), (int)eY.c(19612, 7224994160057229269L)) - eY.c(17284, 3840676709999907297L) + eY.c(16016, 4220694077144034566L);
                        }
                        var6_3 /* !! */  = (int)v8;
                        if (!var2_2) ** GOTO lbl-1000
                    }
                    var6_3 /* !! */  = eY.c(29419, 3153875927833059654L) / 2 - eY.c(13491, 5913941294998939647L);
                    if (!var2_2) ** GOTO lbl-1000
                }
                var6_3 /* !! */  = (int)(hi.a("G", (int)eY.c(6043, 4552350063878685991L), (int)eY.c(19238, 3177136883540236457L), (long)834203424483934088L) - eY.c(10746, 7532785234382486183L) + eY.c(19684, 7961347974625369794L));
                if (!var2_2) ** GOTO lbl-1000
lbl144:
                // 2 sources

                v1 = hi.a("G", (int)(eY.c(17875, 3768914240964728352L) + eY.c(31997, 2437363598228762515L)), (int)eY.c(16502, 2435535757088166610L), (long)834203424483934088L) / 2 + eY.c(18566, 2538406023528487875L);
lbl145:
                // 2 sources

                var6_3 /* !! */  = (int)v1;
                if (!var2_2) ** GOTO lbl-1000
lbl147:
                // 2 sources

                var6_3 /* !! */  = (eY.c(22537, 2909891143370476398L) ^ eY.c(17351, 6316196521995112524L)) + eY.c(30438, 2646187811789677620L);
            } while (!var2_2);
            var6_3 /* !! */  = eY.c(10722, 790497189735136059L) - eY.c(17493, 335225894138975872L) - eY.c(28209, 8525536876104236349L);
            if (!var2_2) continue;
lbl151:
            // 2 sources

            var6_3 /* !! */  = eY.c(10722, 790497189735136059L) - eY.c(17493, 335225894138975872L) - eY.c(28209, 8525536876104236349L);
            if (!var2_2) continue;
lbl153:
            // 2 sources

            var6_3 /* !! */  = (eY.c(21220, 3753854230611951834L) - eY.c(2942, 8550877087228975358L)) / eY.c(19232, 6484538535955306755L) + eY.c(6353, 1357446928710945691L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$10() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)1193866327045333285L), (long)511460060498514638L);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static double lambda$onClientTick$3(LivingEntity livingEntity) {
        boolean bl = Dl.S();
        LivingEntity livingEntity2 = livingEntity;
        if (bl) {
            if (!(livingEntity2 instanceof LivingEntity)) return 0.0;
            livingEntity2 = livingEntity;
        }
        LivingEntity livingEntity3 = livingEntity2;
        double d = (double)hi.a("\u00a5", (Object)livingEntity3, (long)1114676441025485758L);
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$4() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L))))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)644742351621817192L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$22() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                    if (bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = eY.r("ZL24Z0B2i2NZTo3v", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)754997473815367169L)), (Enum)((Object)hi.a("j", (long)664922924664801820L)));
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    private boolean lambda$new$1() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)742210860906462178L), (Object)hi.a("j", (long)1277974201562343194L), (long)511460060498514638L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$24() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L))))), (long)1000026253634408124L);
                    if (bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = eY.r("ZL24Z0B2i2NZTo3v", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)754997473815367169L)), (Enum)((Object)hi.a("j", (long)664922924664801820L)));
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$13() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)918502104200369066L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$7() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)644742351621817192L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$16() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)918502104200369066L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$20() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                    if (!bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = eY.r("ZL24Z0B2i2NZTo3v", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)754997473815367169L)), (Enum)((Object)hi.a("j", (long)1082285272310756216L)));
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

    /*
     * Exception decompiling
     */
    @yE
    private void J(_y var1_1) {
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

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1171766289211489313L);
        hi.a("G", (long)561066160558538168L);
    }

    private eY() {
        super(eY.b(30009, 1297), (vY)((Object)hi.a("j", (long)1119278030115886606L)));
        this.Q = hi.a("\u00a5", (Object)this, (Object)eY.b(29961, -10291), (boolean)true, (long)1230617056439551805L);
        this.x = hi.a("\u00a5", (Object)this, (Object)eY.b(29967, 26399), (boolean)true, (long)1230617056439551805L);
        this.q = hi.a("\u00a5", (Object)this, (Object)eY.b(30007, -31194), (Object)hi.a("j", (long)520935203988888442L), (long)426795652261052192L);
        this.vz = hi.a("\u00a5", (Object)this, (Object)eY.b(29981, 5713), (Object)hi.a("j", (long)1041055164235939153L), (long)426795652261052192L);
        this.vn = hi.a("\u00a5", (Object)this, (Object)eY.b(29978, 14373), (int)eY.c(23363, 2705278719716722759L), (int)0, (int)eY.c(21842, 7627876443469383169L), (int)1, this::lambda$new$1, (long)958246524790962697L);
        this.va = hi.a("\u00a5", (Object)this, (Object)eY.b(29982, 28407), (Object)hi.a("j", (long)1313151723732419313L), (long)426795652261052192L);
        this.S = hi.a("\u00a5", (Object)this, (Object)eY.b(29969, 21752), (double)4.0, (double)1.0, (double)6.0, (double)0.1, (long)1077996338587307774L);
        this.vy = hi.a("\u00a5", (Object)this, (Object)eY.b(29958, 9057), (double)3.0, (double)1.0, (double)6.0, (double)0.1, (long)1077996338587307774L);
        this.vj = hi.a("\u00a5", (Object)this, (Object)eY.b(29957, -17064), (int)eY.c(1392, 3147046852231091820L), (int)eY.c(7942, 3628123792898411824L), (int)eY.c(14699, 2625193432841513646L), (int)1, (long)1094453040828645510L);
        this.b = hi.a("\u00a5", (Object)this, (Object)eY.b(29972, -12359), (int)eY.c(11744, 8544919551553371723L), (int)eY.c(228, 1547619978453340874L), (int)eY.c(17951, 2054407872566072624L), (int)eY.c(228, 1547619978453340874L), (long)1094453040828645510L);
        this.vk = hi.a("\u00a5", (Object)this, (Object)eY.b(29979, 20991), (Object)hi.a("j", (long)1063001742459100658L), (long)426795652261052192L);
        this.B = hi.a("\u00a5", (Object)this, (Object)eY.b(29963, 13251), (int)eY.c(2429, 2301933571664337728L), (int)1, (int)eY.c(29172, 5325671831677543409L), (int)1, this::lambda$new$2, (long)958246524790962697L);
        this.E = hi.a("\u00a5", (Object)this, (Object)eY.b(29964, -22300), (boolean)true, (long)1230617056439551805L);
        this.h = hi.a("\u00a5", (Object)this, (Object)eY.b(29984, 32158), (boolean)true, (long)1230617056439551805L);
        this.X = eY.r("ZL24Z0B2i2NZTo3v", U(java.lang.String boolean ), (eY)this, (String)eY.b(30011, 2627), (boolean)true);
        this.F = hi.a("\u00a5", (Object)this, (Object)eY.b(29960, 12106), (boolean)false, (long)1230617056439551805L);
        this.d = hi.a("\u00a5", (Object)this, (Object)eY.b(29965, -18084), (boolean)false, (long)1230617056439551805L);
        this.T = hi.a("\u00a5", (Object)this, (Object)eY.b(30000, 15649), (boolean)false, (long)1230617056439551805L);
        this.vF = hi.a("\u00a5", (Object)this, (Object)eY.b(29983, 15985), (boolean)false, (long)1230617056439551805L);
        this.vI = hi.a("\u00a5", (Object)this, (Object)eY.b(29952, -18554), (boolean)true, (long)1230617056439551805L);
        this.e = hi.a("\u00a5", (Object)this, (Object)eY.b(30005, -32584), (boolean)true, (long)1230617056439551805L);
        this.V = hi.a("\u00a5", (Object)this, (Object)eY.b(30014, -28799), (boolean)true, (long)1230617056439551805L);
        String string = eY.b(29966, 16444);
        CallSite callSite = hi.a("j", (long)918502104200369066L);
        CallSite callSite2 = hi.a("\u00e9", (Object)this, (long)1327664652229106828L);
        hi.a("G", (Object)callSite2, (long)374764797691957710L);
        this.vt = hi.a("\u00a5", (Object)this, (Object)string, (Object)callSite, ((Xn)((Object)callSite2))::z, (long)665992405927011769L);
        this.vm = hi.a("\u00a5", (Object)this, (Object)eY.b(30001, 27860), (Object)hi.a("j", (long)749010665741364879L), this::lambda$new$3, (long)665992405927011769L);
        this.v = hi.a("\u00a5", (Object)this, (Object)eY.b(29970, 2789), (double)0.75, (double)0.25, (double)2.0, (double)0.05, this::lambda$new$4, (long)988474938581310011L);
        this.o = hi.a("\u00a5", (Object)this, (Object)eY.b(29954, 32078), (double)3.0, (double)0.5, (double)8.0, (double)0.25, this::lambda$new$5, (long)988474938581310011L);
        this.c = hi.a("\u00a5", (Object)this, (Object)eY.b(29971, -27959), (double)1.0, (double)0.0, (double)2.0, (double)0.1, this::lambda$new$6, (long)988474938581310011L);
        this.N = eY.r("ZL24Z0B2i2NZTo3v", H(java.lang.String double double double double com.github.epsilon.yx ), (eY)this, (String)eY.b(30004, 25200), (double)5.0, (double)1.0, (double)12.0, (double)0.5, this::lambda$new$7);
        this.W = hi.a("\u00a5", (Object)this, (Object)eY.b(29977, 30687), (Object)new Color(eY.c(10072, 3770237169021613402L), eY.c(26034, 802504279571249103L), eY.c(11366, 2138263944960638952L)), this::lambda$new$8, (long)1241661680830497550L);
        this.vE = eY.r("ZL24Z0B2i2NZTo3v", j(java.lang.String java.awt.Color com.github.epsilon.yx ), (eY)this, (String)eY.b(29956, -15047), (Color)new Color(eY.c(16403, 3548271972808397765L), eY.c(926, 4942840639760617551L), eY.c(1290, 1731029619637835315L)), this::lambda$new$9);
        this.z = eY.r("ZL24Z0B2i2NZTo3v", H(java.lang.String double double double double com.github.epsilon.yx ), (eY)this, (String)eY.b(29962, -3888), (double)1.2, (double)0.5, (double)3.0, (double)0.1, this::lambda$new$10);
        this.u = hi.a("\u00a5", (Object)this, (Object)eY.b(29955, 24286), (double)2.0, (double)0.5, (double)10.0, (double)0.1, this::lambda$new$11, (long)988474938581310011L);
        this.D = eY.r("ZL24Z0B2i2NZTo3v", H(java.lang.String double double double double com.github.epsilon.yx ), (eY)this, (String)eY.b(29959, -44), (double)3.0, (double)0.5, (double)10.0, (double)0.1, this::lambda$new$12);
        this.k = hi.a("\u00a5", (Object)this, (Object)eY.b(30008, -2511), (Object)hi.a("j", (long)1173447058378651714L), (boolean)false, this::lambda$new$13, (long)393916397130120306L);
        this.n = hi.a("\u00a5", (Object)this, (Object)eY.b(29953, 20777), (Object)new Color(eY.c(16403, 3548271972808397765L), eY.c(16403, 3548271972808397765L), eY.c(16403, 3548271972808397765L), eY.c(1345, 4743208380854589101L)), this::lambda$new$14, (long)1241661680830497550L);
        this.P = hi.a("\u00a5", (Object)this, (Object)eY.b(30012, 15), (double)0.75, (double)0.1, (double)2.0, (double)0.05, this::lambda$new$15, (long)988474938581310011L);
        this.vg = hi.a("\u00a5", (Object)this, (Object)eY.b(30002, 30495), (double)1.0, (double)0.0, (double)2.0, (double)0.05, this::lambda$new$16, (long)988474938581310011L);
        this.t = eY.r("ZL24Z0B2i2NZTo3v", V(java.lang.String E com.github.epsilon.yx ), (eY)this, (String)eY.b(30006, -27372), (Enum)((Object)hi.a("j", (long)1082285272310756216L)), this::lambda$new$17);
        this.vK = hi.a("\u00a5", (Object)this, (Object)eY.b(30013, 5688), (Object)new Color(eY.c(26735, 6012276851072809925L), eY.c(19219, 4961403574670301234L), eY.c(19219, 4961403574670301234L), eY.c(16403, 3548271972808397765L)), this::lambda$new$18, (long)1241661680830497550L);
        this.H = hi.a("\u00a5", (Object)this, (Object)eY.b(29980, -11448), (Object)new Color(eY.c(16403, 3548271972808397765L), eY.c(25625, 2789994603263768270L), eY.c(5652, 7568116756951778589L), eY.c(16403, 3548271972808397765L)), this::lambda$new$19, (long)1241661680830497550L);
        this.C = hi.a("\u00a5", (Object)this, (Object)eY.b(29973, 26972), (double)0.65, (double)0.0, (double)1.0, (double)0.05, this::lambda$new$20, (long)988474938581310011L);
        this.y = hi.a("\u00a5", (Object)this, (Object)eY.b(29974, -31378), (double)1.2, (double)0.1, (double)6.0, (double)0.1, this::lambda$new$21, (long)988474938581310011L);
        this.a = hi.a("\u00a5", (Object)this, (Object)eY.b(29975, -28505), (double)1.0, (double)0.1, (double)6.0, (double)0.1, this::lambda$new$22, (long)988474938581310011L);
        this.l = hi.a("\u00a5", (Object)this, (Object)eY.b(29987, 19909), (double)0.85, (double)0.1, (double)1.0, (double)0.05, this::lambda$new$23, (long)988474938581310011L);
        this.vx = hi.a("\u00a5", (Object)this, (Object)eY.b(29976, 260), (double)1.0, (double)0.1, (double)1.0, (double)0.05, this::lambda$new$24, (long)988474938581310011L);
        this.L = hi.a("\u00a5", (Object)this, (Object)eY.b(29985, 12136), (int)eY.c(5910, 2412404142009238750L), (int)eY.c(20732, 4041887379489358770L), (int)eY.c(882, 6906918175602462854L), (int)1, this::lambda$new$25, (long)958246524790962697L);
        this.vL = hi.a("\u00a5", (Object)this, (Object)eY.b(30015, -24908), (int)eY.c(20732, 4041887379489358770L), (int)1, (int)eY.c(228, 1547619978453340874L), (int)1, this::lambda$new$26, (long)958246524790962697L);
        this.vl = hi.a("\u00a5", (Object)this, (Object)eY.b(29968, 12893), (double)1.8, (double)0.25, (double)10.0, (double)0.25, this::lambda$new$27, (long)988474938581310011L);
        this.vB = hi.a("\u00a5", (Object)this, (Object)eY.b(30010, -14423), (double)3.0, (double)0.0, (double)10.0, (double)0.25, this::lambda$new$28, (long)988474938581310011L);
        this.K = new _Z();
        hi.a("\u00a5", (Object)hi.a("j", (long)519102950410566293L), (Object)new Object[]{new gD<d9>(d9.class, this::lambda$new$0)}, (long)603602610752793215L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$5() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = eY.r("ZL24Z0B2i2NZTo3v", booleanValue(), (Boolean)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))));
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)644742351621817192L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$17() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L))))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$9() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)1193866327045333285L), (long)511460060498514638L);
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

    private void lambda$new$0(d9 d92) {
        Object[] objectArray = new Object[5];
        objectArray[4] = Float.valueOf((float)hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)835435258536297962L), (long)789438897355831922L))), (long)371266768739483732L));
        objectArray[3] = Float.valueOf((float)hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)798982906660137843L), (long)789438897355831922L))), (long)371266768739483732L));
        objectArray[2] = Float.valueOf((float)hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)908662028655623675L), (long)789438897355831922L))), (long)371266768739483732L));
        objectArray[1] = Float.valueOf((float)eY.r("ZL24Z0B2i2NZTo3v", floatValue(), (Double)((Double)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (DM)((Object)hi.a("\u00e9", (Object)this, (long)1233222617164591002L)))))));
        objectArray[0] = hi.a("\u00a5", (Object)d92, (long)1109062203649823396L);
        hi.a("G", (Object)objectArray, (long)478072109224280037L);
    }

    private void X(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, null, (long)453994321016374417L);
        hi.a("\u00f2", (Object)this, null, (long)822769605158013849L);
        hi.a("\u00f2", (Object)this, (int)0, (long)832352583946560914L);
        hi.a("\u00f2", (Object)this, (long)0L, (long)644614952272032880L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String g(Object[] var1_1) {
        block17: {
            block16: {
                block19: {
                    block18: {
                        var2_2 = Dl.t();
                        var3_3 /* !! */  = hi.a("G", (int)eY.c(11572, 7337166023767130015L), (int)eY.c(31255, 1648092367839603169L), (long)834203424483934088L) - eY.c(12833, 1954915664923189257L) + eY.c(19887, 12218187539160586L) - eY.c(8459, 2540767376161141316L);
                        if (!var2_2) break block18;
lbl5:
                        // 2 sources

                        while (hi.a("\u00e9", (Object)this, (long)822769605158013849L) == null) {
                            break block16;
                        }
                        break block19;
lbl8:
                        // 1 sources

                        while (true) {
                            hi.a("G", (long)881105324151579743L);
                            eY.r("ZL24Z0B2i2NZTo3v", values());
lbl12:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            v0 = hi.a("\u00a5", (Object)eY.r("ZL24Z0B2i2NZTo3v", getName(), (LivingEntity)hi.a("\u00e9", (Object)this, (long)822769605158013849L)), (long)445233814433577985L);
                            if (var2_2) lbl-1000:
                            // 2 sources

                            {
                                return v0;
                            }
                            break block17;
                            break;
                        }
                    }
lbl21:
                    // 3 sources

                    while (true) {
                        switch (var3_3 /* !! */ ) {
                            default: {
                                ** GOTO lbl5
                            }
                            case -410216683: {
                                ** continue;
                            }
                            case -410216682: {
                                ** continue;
                            }
                            ** case -410216684:
lbl30:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
lbl31:
                    // 2 sources

                    while (true) {
                        switch (var3_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 977166810: 
                        }
                        return hi.a("G", (int)eY.c(12235, 192371011575479558L), (long)683539552130499618L);
                    }
                }
                var3_3 /* !! */  = (hi.a("G", (int)eY.c(22685, 5895126030106331938L), (int)eY.c(18152, 8711353621775652111L), (long)834203424483934088L) + eY.c(2521, 7582498786657196722L) + eY.c(715, 784781402905989414L)) * eY.c(13321, 2642817757027657459L) + eY.c(12739, 807972840007099321L);
                if (!var2_2) ** GOTO lbl21
            }
            var3_3 /* !! */  = (reference)(eY.c(26024, 4827589097647453782L) + eY.c(29062, 3709391707911365143L) - eY.c(26924, 9059110756063919090L) + eY.c(20186, 2279876035567525237L));
            ** while (true)
            v0 = null;
            var3_3 /* !! */  = (reference)(hi.a("G", (int)(eY.c(9742, 1335907981975188775L) + eY.c(3333, 6188638656845536963L)), (int)eY.c(23167, 6512392242310514792L), (long)834203424483934088L) * eY.c(31360, 2428087021783132526L) + eY.c(16325, 5445995676121525579L) ^ eY.c(8249, 7038513678545941273L));
            ** GOTO lbl31
        }
        var3_3 /* !! */  = (reference)(hi.a("G", (int)(eY.c(17901, 3082118521435133447L) + eY.c(20141, 4498346075809258539L)), (int)eY.c(27459, 3799727880476670336L), (long)834203424483934088L) * eY.c(21126, 4490700154388774999L) + eY.c(23549, 3393601579098507660L) ^ eY.c(14291, 5088088789619827900L));
        ** while (true)
    }

    private double lambda$onClientTick$2(LivingEntity livingEntity) {
        return (double)hi.a("G", (float)hi.a("G", (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1280994566116072355L) - hi.a("\u00a5", (Object)hi.a("G", (Object)livingEntity, (long)403301484301504030L), (long)1049231279723202751L)), (long)604508068528351008L), (long)400111314131951612L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$28() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = eY.r("ZL24Z0B2i2NZTo3v", booleanValue(), (Boolean)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))));
                if (!bl) break block4;
                if (object == false) break block5;
                object = eY.r("ZL24Z0B2i2NZTo3v", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L)), (Enum)((Object)hi.a("j", (long)442768343842576908L)));
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

    /*
     * Exception decompiling
     */
    @yE
    private void X(d9 var1_1) {
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

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$14() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L))))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)918502104200369066L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$8() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)1193866327045333285L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    private double lambda$onClientTick$1(LivingEntity livingEntity) {
        return (double)eY.r("ZL24Z0B2i2NZTo3v", distanceTo(net.minecraft.world.entity.Entity ), (LivingEntity)livingEntity, (Entity)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$25() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    private boolean lambda$new$2() {
        return (boolean)eY.r("ZL24Z0B2i2NZTo3v", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)1212466594112575810L)), (Enum)((Object)hi.a("j", (long)520935203988888442L)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$3() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L))))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)644742351621817192L), (long)511460060498514638L);
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

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$19() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                    if (!bl) break block4;
                    if (object == false) break block5;
                    object = eY.r("ZL24Z0B2i2NZTo3v", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L)), (Enum)((Object)hi.a("j", (long)442768343842576908L)));
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)754997473815367169L), (Object)hi.a("j", (long)1082285272310756216L), (long)511460060498514638L);
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

    private static double lambda$onClientTick$0(w w2, LivingEntity livingEntity) {
        return (double)hi.a("G", (float)(hi.a("\u00e9", (Object)w2, (long)1282215825261164316L) - hi.a("\u00a5", (Object)hi.a("G", (Object)livingEntity, (long)403301484301504030L), (long)1049231279723202751L)), (long)400111314131951612L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$18() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    public static /* bridge */ /* synthetic */ CallSite r(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$21() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = eY.r("ZL24Z0B2i2NZTo3v", booleanValue(), (Boolean)((Boolean)((Object)eY.r("ZL24Z0B2i2NZTo3v", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L))))));
                    if (bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)754997473815367169L), (Object)hi.a("j", (long)1082285272310756216L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$26() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = eY.r("ZL24Z0B2i2NZTo3v", booleanValue(), (Boolean)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))));
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    static {
        IlilIlIlil.registerNativesForClass((int)13, eY.class);
        Hidden0.special_clinit_13_380(eY.class);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$11() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = eY.r("ZL24Z0B2i2NZTo3v", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L)), (Enum)((Object)hi.a("j", (long)1193866327045333285L)));
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

    /*
     * Enabled aggressive block sorting
     */
    private Boolean lambda$onClientTick$4(uK uK2) {
        boolean bl;
        block5: {
            EntityHitResult entityHitResult;
            CallSite callSite;
            block4: {
                CallSite callSite2 = eY.r("ZL24Z0B2i2NZTo3v", f(com.github.epsilon.uK double ), (uK)uK2, (double)3.0);
                boolean bl2 = Dl.t();
                callSite = callSite2;
                if (bl2) break block4;
                if (!(callSite instanceof EntityHitResult)) break block5;
                callSite = callSite2;
            }
            if (eY.r("ZL24Z0B2i2NZTo3v", getEntity(), (EntityHitResult)(entityHitResult = (EntityHitResult)callSite)) == hi.a("\u00e9", (Object)this, (long)822769605158013849L)) {
                bl = true;
                return hi.a("G", (boolean)bl, (long)827866887164769227L);
            }
        }
        bl = false;
        return hi.a("G", (boolean)bl, (long)827866887164769227L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$27() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)442768343842576908L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$6() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1327664652229106828L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)905581740086838270L), (Object)hi.a("j", (long)644742351621817192L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x7511) & 0xFFFF;
        if (db[n3] == null) {
            int n4;
            char[] cArray = cb[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 134;
                case 1 -> 219;
                case 2 -> 127;
                case 3 -> 133;
                case 4 -> 203;
                case 5 -> 136;
                case 6 -> 250;
                case 7 -> 154;
                case 8 -> 122;
                case 9 -> 33;
                case 10 -> 140;
                case 11 -> 112;
                case 12 -> 234;
                case 13 -> 157;
                case 14 -> 193;
                case 15 -> 215;
                case 16 -> 204;
                case 17 -> 249;
                case 18 -> 245;
                case 19 -> 182;
                case 20 -> 104;
                case 21 -> 143;
                case 22 -> 53;
                case 23 -> 179;
                case 24 -> 66;
                case 25 -> 105;
                case 26 -> 55;
                case 27 -> 233;
                case 28 -> 54;
                case 29 -> 195;
                case 30 -> 0;
                case 31 -> 170;
                case 32 -> 45;
                case 33 -> 2;
                case 34 -> 159;
                case 35 -> 152;
                case 36 -> 72;
                case 37 -> 76;
                case 38 -> 176;
                case 39 -> 125;
                case 40 -> 85;
                case 41 -> 73;
                case 42 -> 83;
                case 43 -> 231;
                case 44 -> 251;
                case 45 -> 150;
                case 46 -> 166;
                case 47 -> 60;
                case 48 -> 126;
                case 49 -> 123;
                case 50 -> 244;
                case 51 -> 239;
                case 52 -> 227;
                case 53 -> 35;
                case 54 -> 246;
                case 55 -> 128;
                case 56 -> 118;
                case 57 -> 88;
                case 58 -> 191;
                case 59 -> 184;
                case 60 -> 79;
                case 61 -> 200;
                case 62 -> 149;
                case 63 -> 107;
                case 64 -> 31;
                case 65 -> 57;
                case 66 -> 169;
                case 67 -> 242;
                case 68 -> 15;
                case 69 -> 222;
                case 70 -> 10;
                case 71 -> 196;
                case 72 -> 208;
                case 73 -> 25;
                case 74 -> 187;
                case 75 -> 214;
                case 76 -> 86;
                case 77 -> 11;
                case 78 -> 21;
                case 79 -> 198;
                case 80 -> 156;
                case 81 -> 78;
                case 82 -> 90;
                case 83 -> 183;
                case 84 -> 213;
                case 85 -> 69;
                case 86 -> 32;
                case 87 -> 74;
                case 88 -> 3;
                case 89 -> 228;
                case 90 -> 253;
                case 91 -> 58;
                case 92 -> 226;
                case 93 -> 153;
                case 94 -> 56;
                case 95 -> 232;
                case 96 -> 255;
                case 97 -> 137;
                case 98 -> 178;
                case 99 -> 148;
                case 100 -> 27;
                case 101 -> 70;
                case 102 -> 254;
                case 103 -> 28;
                case 104 -> 14;
                case 105 -> 240;
                case 106 -> 106;
                case 107 -> 68;
                case 108 -> 171;
                case 109 -> 97;
                case 110 -> 241;
                case 111 -> 155;
                case 112 -> 103;
                case 113 -> 17;
                case 114 -> 5;
                case 115 -> 22;
                case 116 -> 23;
                case 117 -> 129;
                case 118 -> 34;
                case 119 -> 160;
                case 120 -> 238;
                case 121 -> 230;
                case 122 -> 139;
                case 123 -> 210;
                case 124 -> 16;
                case 125 -> 144;
                case 126 -> 9;
                case 127 -> 247;
                case 128 -> 138;
                case 129 -> 89;
                case 130 -> 164;
                case 131 -> 229;
                case 132 -> 165;
                case 133 -> 19;
                case 134 -> 162;
                case 135 -> 185;
                case 136 -> 49;
                case 137 -> 206;
                case 138 -> 51;
                case 139 -> 44;
                case 140 -> 217;
                case 141 -> 65;
                case 142 -> 81;
                case 143 -> 121;
                case 144 -> 211;
                case 145 -> 158;
                case 146 -> 41;
                case 147 -> 181;
                case 148 -> 161;
                case 149 -> 63;
                case 150 -> 151;
                case 151 -> 20;
                case 152 -> 108;
                case 153 -> 132;
                case 154 -> 64;
                case 155 -> 180;
                case 156 -> 248;
                case 157 -> 40;
                case 158 -> 207;
                case 159 -> 202;
                case 160 -> 93;
                case 161 -> 194;
                case 162 -> 50;
                case 163 -> 130;
                case 164 -> 173;
                case 165 -> 84;
                case 166 -> 38;
                case 167 -> 67;
                case 168 -> 95;
                case 169 -> 186;
                case 170 -> 61;
                case 171 -> 75;
                case 172 -> 43;
                case 173 -> 119;
                case 174 -> 8;
                case 175 -> 42;
                case 176 -> 29;
                case 177 -> 101;
                case 178 -> 1;
                case 179 -> 115;
                case 180 -> 6;
                case 181 -> 109;
                case 182 -> 98;
                case 183 -> 30;
                case 184 -> 209;
                case 185 -> 243;
                case 186 -> 120;
                case 187 -> 124;
                case 188 -> 82;
                case 189 -> 236;
                case 190 -> 37;
                case 191 -> 12;
                case 192 -> 252;
                case 193 -> 235;
                case 194 -> 80;
                case 195 -> 146;
                case 196 -> 224;
                case 197 -> 113;
                case 198 -> 47;
                case 199 -> 174;
                case 200 -> 102;
                case 201 -> 96;
                case 202 -> 71;
                case 203 -> 52;
                case 204 -> 220;
                case 205 -> 99;
                case 206 -> 167;
                case 207 -> 163;
                case 208 -> 131;
                case 209 -> 237;
                case 210 -> 201;
                case 211 -> 147;
                case 212 -> 114;
                case 213 -> 175;
                case 214 -> 110;
                case 215 -> 199;
                case 216 -> 59;
                case 217 -> 7;
                case 218 -> 218;
                case 219 -> 216;
                case 220 -> 13;
                case 221 -> 225;
                case 222 -> 205;
                case 223 -> 141;
                case 224 -> 46;
                case 225 -> 192;
                case 226 -> 62;
                case 227 -> 168;
                case 228 -> 87;
                case 229 -> 100;
                case 230 -> 77;
                case 231 -> 188;
                case 232 -> 24;
                case 233 -> 36;
                case 234 -> 223;
                case 235 -> 18;
                case 236 -> 26;
                case 237 -> 212;
                case 238 -> 197;
                case 239 -> 145;
                case 240 -> 142;
                case 241 -> 189;
                case 242 -> 48;
                case 243 -> 91;
                case 244 -> 190;
                case 245 -> 111;
                case 246 -> 135;
                case 247 -> 4;
                case 248 -> 177;
                case 249 -> 172;
                case 250 -> 39;
                case 251 -> 94;
                case 252 -> 117;
                case 253 -> 221;
                case 254 -> 92;
                default -> 116;
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
            eY.db[n3] = new String(cArray).intern();
        }
        return db[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53B9;
        if (jb[n2] == null) {
            eY.jb[n2] = (int)(eb[n2] ^ l);
        }
        return jb[n2];
    }
}
