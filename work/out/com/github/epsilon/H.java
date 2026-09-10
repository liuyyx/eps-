/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.ColorTargetState
 *  com.mojang.blaze3d.pipeline.DepthStencilState
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.CompareOp
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.math.Axis
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4f
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.Dl;
import com.github.epsilon.Dp;
import com.github.epsilon.Dx;
import com.github.epsilon.Xi;
import com.github.epsilon.Xn;
import com.github.epsilon._Z;
import com.github.epsilon._f;
import com.github.epsilon.d9;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class H
extends e {
    private static final RenderPipeline V;
    private final Xn M;
    private final List<Dp> Q;
    private final Dx<_f> W = H.d("Ca0Boq6WRWJErvf0", J(java.lang.String E ), (H)this, (String)H.b(26251, -25186), (Enum)((Object)hi.a("j", (long)1210633535099315848L)));
    private final Xn O = hi.a("\u00a5", (Object)this, (Object)H.b(26254, -18353), (boolean)true, (long)1230617056439551805L);
    public static final H a;
    private final DM x;
    private static final Identifier P;
    private final List<UUID> h;
    private final DM L = H.d("Ca0Boq6WRWJErvf0", E(java.lang.String double double double double ), (H)this, (String)H.b(26248, 23506), (double)2.0, (double)0.5, (double)5.0, (double)0.1);
    private static final Identifier B;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;
    private static final long[] k;
    private static final Long[] l;

    public static /* bridge */ /* synthetic */ CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private Color y(Object object, float f) {
        CallSite callSite = hi.a("G", (int)hi.a("G", (float)((float)hi.a("\u00a5", (Object)((Color)object), (long)999912139159319168L) * hi.a("G", (float)f, (float)0.0f, (float)1.0f, (long)390336973585993938L)), (long)400355798406630015L), (int)0, (int)H.c(17381, 1214853164814759774L), (long)1051766797435725461L);
        return new Color((int)hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L), (int)H.d("Ca0Boq6WRWJErvf0", getGreen(), (Color)((Color)object)), (int)hi.a("\u00a5", (Object)((Color)object), (long)505295769199362574L), (int)callSite);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void D(dR var1_1) {
        block40: {
            block28: {
                block27: {
                    block30: {
                        block29: {
                            var2_2 = Dl.t();
                            var6_3 /* !! */  = (H.c(3174, 2565340601945405642L) ^ H.c(18248, 3162196227370841065L)) + H.c(30836, 2997897323345955997L) - H.c(10131, 7188596964090483570L);
                            if (!var2_2) break block29;
                            ** GOTO lbl-1000
                        }
                        v0 /* !! */  = var6_3 /* !! */ ;
                        if (var2_2) break block30;
                        switch (v0 /* !! */ ) {
                            case 1203756520: lbl-1000:
                            // 2 sources

                            {
                                v0 /* !! */  = (int)H.d("Ca0Boq6WRWJErvf0", m());
                                break;
                            }
                        }
                    }
                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (long)1072499766950682963L), (long)1240653736693366367L);
                    if (!var2_2) ** GOTO lbl119
lbl16:
                    // 2 sources

                    while (true) {
                        v1 = H.d("Ca0Boq6WRWJErvf0", hasNext(), (Iterator)var3_4);
                        if (var2_2) ** GOTO lbl122
                        if (v1 == false) ** GOTO lbl121
                        ** GOTO lbl124
                        break;
                    }
lbl21:
                    // 2 sources

                    while (true) {
                        block39: {
                            block37: {
                                block38: {
                                    block34: {
                                        block36: {
                                            block35: {
                                                block33: {
                                                    block32: {
                                                        block31: {
                                                            var4_5 = (Player)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                                                            v2 /* !! */  = H.d("Ca0Boq6WRWJErvf0", H(java.lang.Object ), (H)this, (Object)var4_5);
                                                            if (var2_2) break block31;
                                                            if (v2 /* !! */  == false) break block32;
                                                            v2 /* !! */  = (CallSite)((H.c(964, 3182658399463913221L) - H.c(9631, 5229540688268792123L)) / H.c(2824, 2252428330211721118L) / H.c(10407, 3822160562592259188L) - H.c(31249, 1514848127933566512L));
                                                        }
                                                        var6_3 /* !! */  = (int)v2 /* !! */ ;
                                                        if (!var2_2) break block33;
                                                    }
                                                    var6_3 /* !! */  = H.c(19893, 7580797747694074163L) * H.c(25851, 5541220968640106706L) ^ H.c(24095, 2746862755062180482L);
                                                    if (var2_2) break block34;
                                                }
                                                v3 /* !! */  = var6_3 /* !! */ ;
                                                if (var2_2) break block35;
                                                switch (v3 /* !! */ ) {
                                                    default: {
                                                        break;
                                                    }
                                                    case 1553181849: {
                                                        break block36;
                                                    }
                                                    case 1553181848: {
                                                        hi.a("G", (float)-1.0f, (float)0.5f, (float)1.0f, (float)1.0f, (double)1.0, (int)H.c(23744, 5268037113450227936L), (long)1270986612680661754L);
                                                    }
                                                }
                                                v3 /* !! */  = (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1195717878135465684L), (Object)hi.a("\u00a5", (Object)var4_5, (long)976874867855354577L), (long)948569440323252867L);
                                            }
                                            if (!var2_2) break block34;
                                        }
                                        var5_6 = H.d("Ca0Boq6WRWJErvf0", getUUID(), (Player)var4_5);
                                        v4 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)479686824571376352L);
                                        if (var2_2) break block37;
                                        if (v4 /* !! */  == false) break block38;
                                        break block39;
                                    }
                                    var6_3 /* !! */  = (H.c(8893, 3682039123156637223L) / H.c(16253, 3800931098718735294L) + H.c(19917, 1013967005943658800L)) / H.c(5651, 7293864143929090604L) - H.c(744, 4432015458422896358L);
                                    break block27;
                                }
                                v4 /* !! */  = (CallSite)(H.c(19927, 3153306417931221346L) * H.c(12666, 8888886081001981385L) + H.c(1101, 6146466941436965113L));
                            }
                            var6_3 /* !! */  = (int)v4 /* !! */ ;
                            if (!var2_2) break block28;
                        }
                        var6_3 /* !! */  = hi.a("G", (int)(H.c(24156, 5599877444129319532L) * H.c(455, 7385531369856644441L)), (int)H.c(5449, 1667877357346300315L), (long)834203424483934088L) * H.c(14240, 4648274014399071008L) ^ H.c(31727, 1169857317108338518L);
                        if (!var2_2) break block28;
                        ** GOTO lbl126
                        break;
                    }
lbl66:
                    // 2 sources

                    while (true) {
                        v5 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1195717878135465684L), (Object)var5_6, (long)948569440323252867L);
                        if (var2_2) ** GOTO lbl138
                        if (v5 /* !! */  == false) ** GOTO lbl137
                        ** GOTO lbl140
                        break;
                    }
lbl71:
                    // 2 sources

                    while (var2_2) {
                        ** GOTO lbl87
                    }
                    break block40;
                }
lbl75:
                // 5 sources

                while (true) {
                    switch (var6_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -635667229: {
                            hi.a("G", (long)510943974080801881L);
                            hi.a("G", (long)1082807210064546197L);
                            ** GOTO lbl21
                        }
                        case -635667226: {
                            ** continue;
                        }
                        case -635667228: 
                    }
lbl87:
                    // 2 sources

                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)807020555339575946L), (Predicate<Dp>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$0(com.github.epsilon.Dp ), (Lcom/github/epsilon/Dp;)Z)((H)this), (long)646075409365692299L);
                    return;
                }
            }
            do lbl-1000:
            // 8 sources

            {
                block45: {
                    block44: {
                        block43: {
                            block41: {
                                block42: {
                                    switch (var6_3 /* !! */ ) {
                                        default: {
                                            v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1195717878135465684L), (Object)var5_6, (long)798696353081318619L);
                                            if (var2_2) break block41;
                                            if (v6 /* !! */  != false) break block42;
                                            break block43;
                                        }
                                        case 1909367098: {
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1195717878135465684L), (Object)var5_6, (long)615358212536192384L);
                                            if (!var2_2) break block44;
                                            ** GOTO lbl66
                                        }
                                        case 1909367100: {
                                            ** continue;
                                        }
                                        case 1909367102: {
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)807020555339575946L), (Object)new Dp(new Vec3((double)hi.a("\u00a5", (Object)var4_5, (long)763291916151551942L), (double)(hi.a("G", (double)hi.a("\u00a5", (Object)var4_5, (long)473036431630206163L), (long)1288953694489625895L) + 0.001), (double)hi.a("\u00a5", (Object)var4_5, (long)1092038166332254994L)), new _Z()), (long)615358212536192384L);
                                            if (!var2_2) break block45;
                                            ** GOTO lbl71
                                        }
                                        case 1909367101: {
                                            ** GOTO lbl71
                                        }
                                        case 1909367097: {
                                            hi.a("G", (long)1215511131780764219L);
                                            hi.a("G", (long)1058499983070318781L);
                                            var6_3 /* !! */  = (H.c(1227, 2568059499384516668L) + H.c(20089, 5479265170121423454L) ^ H.c(1776, 665768424575873632L)) / 4 + H.c(32061, 7418091256397023685L) + H.c(10749, 2906576818356461002L);
                                            if (!var2_2) ** GOTO lbl-1000
                                        }
                                    }
lbl119:
                                    // 2 sources

                                    var6_3 /* !! */  = (H.c(32634, 6116340605172141008L) / H.c(28870, 7465912180414301385L) + H.c(9728, 3693876334441272021L)) / H.c(21030, 5352566566459729635L) - H.c(25011, 5884756777376732582L);
                                    if (!var2_2) ** GOTO lbl75
lbl121:
                                    // 2 sources

                                    v1 = hi.a("G", (int)H.c(323, 5037296200964552101L), (int)H.c(675, 6495995484468983363L), (long)834203424483934088L) / H.c(19424, 3893470868969357063L) - H.c(32508, 4345765041663167016L);
lbl122:
                                    // 2 sources

                                    var6_3 /* !! */  = (int)v1;
                                    if (!var2_2) ** GOTO lbl75
lbl124:
                                    // 2 sources

                                    var6_3 /* !! */  = H.c(10476, 679454391845919841L) * H.c(17703, 2216341462941495709L) + H.c(26165, 6377844567076393664L);
                                    ** GOTO lbl75
                                }
                                v6 /* !! */  = (CallSite)(((H.c(7159, 4910125788209524603L) ^ H.c(5010, 7765413316563085241L)) - H.c(23356, 3005210456140148505L)) * H.c(31550, 817575360116903823L) + H.c(28749, 4091530807053534331L));
                            }
                            var6_3 /* !! */  = (int)v6 /* !! */ ;
                            if (!var2_2) ** GOTO lbl-1000
                        }
                        var6_3 /* !! */  = H.c(27936, 2439937601945426205L) * H.c(16950, 5950798764090652365L) + H.c(10913, 5581135546186636847L);
                        if (!var2_2) ** GOTO lbl-1000
                    }
                    var6_3 /* !! */  = ((H.c(6074, 7623184962646713204L) ^ H.c(28289, 6555879478857292388L)) - H.c(3490, 8862953823714818451L)) * H.c(27461, 3411102403156565841L) + H.c(3983, 5475460334976121732L);
                    if (!var2_2) ** GOTO lbl-1000
lbl137:
                    // 2 sources

                    v5 /* !! */  = (CallSite)(((H.c(6074, 7623184962646713204L) ^ H.c(28289, 6555879478857292388L)) - H.c(3490, 8862953823714818451L)) * H.c(27461, 3411102403156565841L) + H.c(3983, 5475460334976121732L));
lbl138:
                    // 2 sources

                    var6_3 /* !! */  = (int)v5 /* !! */ ;
                    if (!var2_2) ** GOTO lbl-1000
lbl140:
                    // 2 sources

                    var6_3 /* !! */  = H.c(17601, 3392250991463886858L) + H.c(24204, 6511426059385727606L) - H.c(8332, 8705822135459288223L);
                    if (!var2_2) ** GOTO lbl-1000
                }
                var6_3 /* !! */  = ((H.c(6074, 7623184962646713204L) ^ H.c(28289, 6555879478857292388L)) - H.c(3490, 8862953823714818451L)) * H.c(27461, 3411102403156565841L) + H.c(3983, 5475460334976121732L);
            } while (!var2_2);
        }
        var6_3 /* !! */  = (H.c(8893, 3682039123156637223L) / H.c(16253, 3800931098718735294L) + H.c(19917, 1013967005943658800L)) / H.c(5651, 7293864143929090604L) - H.c(744, 4432015458422896358L);
        ** while (true)
    }

    private boolean lambda$onTick$0(Dp dp) {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)dp, (long)665352895526054996L), (long)(hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)618966972013216132L), (long)789438897355831922L))), (long)1000026253634408124L) != false ? H.d(14701, 1792718075731099865L) : H.d(25930, 24166319501450493L)), (long)1224860919547296605L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void k(Object[] var1_1) {
        block17: {
            block18: {
                block19: {
                    var2_2 = var1_1[0];
                    var4_3 = var1_1[1];
                    var3_4 = var1_1[2];
                    var5_5 = Dl.S();
                    var12_6 /* !! */  = H.c(20212, 2865356290793503236L) / H.c(12596, 4387512623108621611L) + H.c(24966, 5899597716488476038L) + H.c(7424, 2197427477174167977L);
                    if (var5_5) break block19;
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = var3_4;
                        while (true) {
                            var6_7 = (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Dp)v0), (long)665352895526054996L), (Object)new Object[0], (long)1287352790692638878L) / 6000.0f;
                            v1 = H.d("Ca0Boq6WRWJErvf0", floatValue(), (Double)((Double)H.d("Ca0Boq6WRWJErvf0", z(), (DM)hi.a("\u00e9", (Object)this, (long)668190063287610630L))));
                            v2 = (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Dp)var3_4), (long)665352895526054996L), (Object)new Object[0], (long)1287352790692638878L);
                            v3 /* !! */  = hi.a("\u00a5", (Object)((Boolean)H.d("Ca0Boq6WRWJErvf0", z(), (Xn)hi.a("\u00e9", (Object)this, (long)618966972013216132L))), (long)1000026253634408124L);
                            if (!var5_5) ** GOTO lbl73
                            if (v3 /* !! */  == false) ** GOTO lbl72
                            if (true) ** GOTO lbl75
                            break;
                        }
                        break;
                    }
lbl18:
                    // 2 sources

                    while (true) {
                        v4 = 2.0f;
                        var12_6 /* !! */  = (H.c(14227, 7929521268493910954L) - H.c(8341, 4590544608437408901L)) / H.c(12596, 4387512623108621611L) + H.c(19141, 571327235140156974L);
                        if (var5_5) break block17;
                        break block18;
                        break;
                    }
lbl23:
                    // 2 sources

                    while (true) {
                        hi.a("G", (long)426324660506778941L);
                        hi.a("G", (long)1318921989870229166L);
lbl28:
                        // 2 sources

                        while (true) {
                            var7_8 = v1 - (float)hi.a("G", (double)(1.0f - v2 * v4 / 5000.0f), (double)4.0, (long)679604324721902255L);
                            var8_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)968554650154943535L), (long)529286173586661242L);
                            var9_10 = hi.a("\u00a5", (Object)((Dp)var3_4), (long)1078412353834906070L);
                            hi.a("\u00a5", (Object)((PoseStack)var2_2), (long)1071718823859296201L);
                            hi.a("\u00a5", (Object)((PoseStack)var2_2), (double)(hi.a("\u00e9", (Object)var9_10, (long)1300412705618690751L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)var8_9, (long)888968013430088728L), (long)1300412705618690751L)), (double)(hi.a("\u00e9", (Object)var9_10, (long)1294071886475894755L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)var8_9, (long)888968013430088728L), (long)1294071886475894755L)), (double)(hi.a("\u00e9", (Object)var9_10, (long)1282612456329596420L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)var8_9, (long)888968013430088728L), (long)1282612456329596420L)), (long)620263633503696695L);
                            hi.a("\u00a5", (Object)((PoseStack)var2_2), (Object)H.d("Ca0Boq6WRWJErvf0", rotationDegrees(float ), (Axis)hi.a("j", (long)477439033901842617L), (float)90.0f), (long)1164958652490596778L);
                            hi.a("\u00a5", (Object)((PoseStack)var2_2), (Object)H.d("Ca0Boq6WRWJErvf0", rotationDegrees(float ), (Axis)hi.a("j", (long)1210199949807736021L), (float)(var7_8 * hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287011443528460361L), (long)789438897355831922L)), (long)371266768739483732L) * 1000.0f)), (long)1164958652490596778L);
                            var10_11 = var7_8 * 2.0f;
                            var11_12 = hi.a("\u00a5", (Object)H.d("Ca0Boq6WRWJErvf0", last(), (PoseStack)((PoseStack)var2_2)), (long)795986877611440477L);
                            hi.a("\u00a5", (Object)((Xi)var4_3), (Object)var11_12, (float)(-var7_8), (float)(-var7_8 + var10_11), (float)0.0f, (float)0.0f, (float)1.0f, (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)H.d("Ca0Boq6WRWJErvf0", J(int ), (H)this, (int)H.c(5887, 1519753685579342581L)), (float)(1.0f - var6_7), (long)472965771678628762L), (long)921162811333111485L), (long)684582632005063774L);
                            hi.a("\u00a5", (Object)((Xi)var4_3), (Object)var11_12, (float)(-var7_8 + var10_11), (float)(-var7_8 + var10_11), (float)0.0f, (float)1.0f, (float)1.0f, (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)H.d("Ca0Boq6WRWJErvf0", J(int ), (H)this, (int)0), (float)(1.0f - var6_7), (long)472965771678628762L), (long)921162811333111485L), (long)684582632005063774L);
                            hi.a("\u00a5", (Object)((Xi)var4_3), (Object)var11_12, (float)(-var7_8 + var10_11), (float)(-var7_8), (float)0.0f, (float)1.0f, (float)0.0f, (int)H.d("Ca0Boq6WRWJErvf0", getRGB(), (Color)hi.a("\u00a5", (Object)this, (Object)hi.a("\u00a5", (Object)this, (int)H.c(2416, 8840760081163173208L), (long)996173800579645342L), (float)(1.0f - var6_7), (long)472965771678628762L)), (long)684582632005063774L);
                            H.d("Ca0Boq6WRWJErvf0", J(org.joml.Matrix4f float float float float float int ), (Xi)((Xi)var4_3), (Matrix4f)var11_12, (float)(-var7_8), (float)(-var7_8), (float)0.0f, (float)0.0f, (float)0.0f, (int)hi.a("\u00a5", (Object)H.d("Ca0Boq6WRWJErvf0", y(java.lang.Object float ), (H)this, (Object)hi.a("\u00a5", (Object)this, (int)H.c(11187, 4933777132045180789L), (long)996173800579645342L), (float)(1.0f - var6_7)), (long)921162811333111485L));
                            hi.a("\u00a5", (Object)((PoseStack)var2_2), (long)1236740458305185158L);
                            return;
                        }
                        break;
                    }
                }
                while (true) {
                    switch (var12_6 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -1411416034: 
                    }
                    H.d("Ca0Boq6WRWJErvf0", q());
                    v0 = hi.a("G", (long)803447087172553064L);
                    if (!var5_5) ** continue;
                    var12_6 /* !! */  = (H.c(18783, 2715839087712304505L) * H.c(5782, 3447601386606207647L) ^ H.c(16124, 7747990375972375256L)) / H.c(8768, 5062992448518985304L) ^ H.c(25989, 4707782321301639474L);
                }
                block16: while (true) {
                    switch (var12_6 /* !! */ ) {
                        default: {
                            ** GOTO lbl18
                        }
                        case 1255733929: {
                            v4 = 1.0f;
                            if (var5_5) break block16;
                            ** GOTO lbl23
                        }
                        case 1255733930: {
                            hi.a("G", (long)877399517904373040L);
                            if (!var5_5) break;
                            ** continue;
                        }
                    }
lbl72:
                    // 2 sources

                    v3 /* !! */  = (CallSite)(hi.a("G", (int)H.c(1570, 6621556713865884414L), (int)H.c(18000, 8847417554141147839L), (long)834203424483934088L) * H.c(12740, 103982787054306604L) ^ H.c(23440, 5501231372412612422L));
lbl73:
                    // 2 sources

                    var12_6 /* !! */  = (int)v3 /* !! */ ;
                    if (var5_5) continue;
lbl75:
                    // 2 sources

                    var12_6 /* !! */  = hi.a("G", (int)(H.c(11731, 6720460133557377396L) + H.c(7018, 4885459374500196338L)), (int)H.c(16931, 8466108158454003231L), (long)834203424483934088L) ^ H.c(12231, 8351657262442060557L);
                }
            }
            var12_6 /* !! */  = (H.c(25753, 8909240669212201142L) - H.c(31388, 2990068745682865749L)) / H.c(12596, 4387512623108621611L) + H.c(28734, 5240960184430118032L);
        }
        switch (var12_6 /* !! */ ) {
            case 1150585085: {
                ** continue;
            }
        }
        ** while (true)
    }

    @Override
    protected void b(Object[] objectArray) {
        H.d("Ca0Boq6WRWJErvf0", clear(), (List)((Object)hi.a("\u00e9", (Object)this, (long)807020555339575946L)));
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1195717878135465684L), (long)400728262949485023L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                var21 = new String[9];
                                var19_1 = 0;
                                var18_2 = "t\u00d3\u00cc\u00c9a\u007f\u00cf\u00f9\u00a5|C\u000f\fv\u00d4\u00b9\u00ed\u0011\u00b9\u00da!\u0014c\ri\u0004\u00f0\u00c5\u0085\u00cb\u000bj\u00d08%O\u00b5\u0086c\u00ec'c\u001d\u0099\u0000\u00aa)\u00ff\u0081c\u00f3\u0091\b\r\u00a5\u00b4\u00c3\u0083K\u0001on\u00bfL\u0006\u00b5\u008bH\u0016\u009ce\u0006\u001c\u0093Dg=V+g\u00c8{\u00aeA\u00c7\u0013\u00ab\u00c5\u00e1~a\u00a6J]Z\u00ad\u008d\\>\u00f7\u008f \u00ae\u00f8L6#b\u00f8\u008f\u00e2\u0087cTy\u00fd:\u008c6\u0097\u0088\u00ab\u0090\u00e8/\u0089= \u00c9mz\u000f\u00d1l";
                                var20_3 = "t\u00d3\u00cc\u00c9a\u007f\u00cf\u00f9\u00a5|C\u000f\fv\u00d4\u00b9\u00ed\u0011\u00b9\u00da!\u0014c\ri\u0004\u00f0\u00c5\u0085\u00cb\u000bj\u00d08%O\u00b5\u0086c\u00ec'c\u001d\u0099\u0000\u00aa)\u00ff\u0081c\u00f3\u0091\b\r\u00a5\u00b4\u00c3\u0083K\u0001on\u00bfL\u0006\u00b5\u008bH\u0016\u009ce\u0006\u001c\u0093Dg=V+g\u00c8{\u00aeA\u00c7\u0013\u00ab\u00c5\u00e1~a\u00a6J]Z\u00ad\u008d\\>\u00f7\u008f \u00ae\u00f8L6#b\u00f8\u008f\u00e2\u0087cTy\u00fd:\u008c6\u0097\u0088\u00ab\u0090\u00e8/\u0089= \u00c9mz\u000f\u00d1l".length();
                                var17_4 = 12;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 120;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "A\u009cn\u00ec\u009b\u00f4\u00c3\u0003\t\u008eM\u00c3$\u00d2n\u00fa\u00d7(";
                                    var20_3 = "A\u009cn\u00ec\u009b\u00f4\u00c3\u0003\t\u008eM\u00c3$\u00d2n\u00fa\u00d7(".length();
                                    var17_4 = 8;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 95;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 24;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 14;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 111;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 34;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 50;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 31;
                                            break;
                                        }
                                        default: {
                                            v15 = 19;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        H.b = var21;
                        H.c = new String[9];
                        var8_7 = 1865845629257362459L;
                        var14_8 = new long[187];
                        var11_9 = 0;
                        var12_10 = "0\u00cb\u0090~\u00f7\u00be\u00e4\u00cbB@\u0084-\u00e9\u0014@aY\u00e0\u0081\u00b6\u009e\u0093[\u00ba;\u00ec\u0000\u00a5\u0090Z\u00f3\u0085\u0093\u008bD_\u0011\u00b6\u00e8\u00bcM\u00cb*\u00e0Q1\r\u009f\u0095ixe\u00e6O\u00c2\u0081\u00d4\u00e2^wV\u00b5\u0099\u00b4HBjX\u00fa\u009e\u00d1\u000f\u0015(_\u00c3\u00dev\u0002h\u0005\u0095\u0006\u0093\u00abT`\u00d1\u0089T\u00d3\u00d6\u0015r(\u00f8\u00de \u00d7\u00eas\u00d7\u0088\u00e5\u0017RV\u00eb8\u00c6\u0010\u008a\u000f\u00beM\u00ee\u00d5\u0010\u00cb\u00bd\u00ab\u00be;\u00c4\u0085\u00a6\u0019r,\u001c\u008b\"\u0084\u0013\u00fd\u0015\u008a\u00b6\n\u00ba\u00c3u\u00a92\u00f6\u00d8\u00f7Gm\u0002qp\u00cf\u0019\u0016\u00f8\u0083e\u0099n\u0088\u00d38$\u008aV\f8\u00a9\u0003\u009e\u00d4\u00a5\u00c8\u00e3mca\u00fd\u00e90\u0083\u00dd0\u001e}\u00f1,\u008c\u00ed\u00a9W\u00d6*\u00ee\u00b7\u00f1\u00b4*y\u009f\u000b\u00e5\u0097\u00d95\u0083|\u0001\u0010h\u0019\u009d\u0005m\u00bf(\u000e\u0017\u00deN\u00cd\u0092\u00e2l\u00f2\u00f4\u0091\u00cf\ro\u0093\u001e'\u00fd\u00a5\u0080U\u000ek\u00d1\u0091P\u001b\u00c7JX\u00e1(\u00b1}p\u00078\u00d0\u00a0\u0019o\u00157\u008e\"+\u00d8a\u0096#\u00e7\u00e7\n\u009e&#@+\u00d7S\u00e2\u0090s_\u00d4\u00e2Xk'D\u0099\u00adkI\u00ceq\u00ffu\u008b\u0016Z5\u00bby8\u00e2\u0082\u0003\u0019\u00c2\u00b1o\u00fd\u0018\u00c4\u0091\u00e5W\u0094pY\u00df\u00db\u009ab\u009c\u00eaw\u008a\u00aa\u00c7\u0083\u00c4\r\u00fdw!\u0005\u00e9\u0096\u0096|\b\u00d6\u00b4\u00e6\u0081\u00eef\u009e\t+ai.fV\u00cc\u00a52\u00b7\"BG\u00e5G\u0000T\u00b0\u00e8\u0011o8\u0084\u008b8&\u00e3\u00c3\u00e3\u000e\u007fk9\u00d2\u0013\u0095a\b\u00e4\u0007\u00e8\u00a8n\u00e0U\u00ecUbn\u00e8\u00ed\u0007\u00ce\u00bc0\u00f9\u0088\u001c\u00a3=\u00f7\u00deh\u00a7\u00e0\u00e8\u0098\u009au\u00e2nn\u00fe\u009c\u00a5\u00bc\u00f0\u00e4\u00cbx\u00a9\u00b1\r\u00bft\u0096\u0004n\u0015=h\u009a\u00b8\u00c6)`\u00c8\u00c4p\u00c7\u00e5g\u00fdJ\u0095!R\\I\u00d1V.\u00dd\u008fw\u00ae\u00aa\u00ed\u00aa\u0088\u00e5\u0093\t\u00c6\u00f3\u00a1\u0088\u0017\u00c1\u001b\u00fbz\u00de\";\u00fd\u000b\u00e3\u00ac\u0000\f\u00f4\u0000g8\u0089\u00dd\u0006\u0096\u0010\u00d5dmsAf\u00178\u0013h\u00b3\u001a-\u0080\u008b\u00c0\u00900M\u008by\u00fb\\G\u00c7\u00a1r~[\u00f0\u00b8Geh\u00d3\u001d\u00e83\u001d\u00ca\u00d7\u00ddI\u00c1;,\u00a9Pb\u00ef\u00d2\u00e5G5\u0010\u00fdH\u00e3\u00be9QD\u00b1D\u00f4\u00b7\u00fe\u000e\u0001\u008c\u00a3/}obr\u0000\u0018\u0010\u00e9\u00d0\u00dc\u008ftl\u00f55\u00e4;x1i\u00d5\u00de]U\u00b1\u0098\u00e5P\u00f1\u0092b\u00c5\u00fe\u00c9\u00d8#S\u00e1\u008c\u000e\u00e8P\u0007kYO7\u00da\u008e\u00a2\b2\u001d2\u00a6e\n\u0094<<\u00c7J\u00cb\u00f3\u009by\u00851\u00a0E\u00b5@\u00ca6!\u00e1by3K\u00f1\u00ebiX\u00b6\u0086\u00c0\u00fd\u00b8-s\t\u0013\u00e9e)\u00c9\u00eav\u00e1TQ\u009f::\u0093u\u0007\u00f6S\u00bc\u001e\u00bc\u0005ix\u0012cL\u00c4\u001c\u001e<s@\u00d5\u00ffg\u0014\u008a\u0013\u00b3\u000f\u0086\u00b9\u0016.\u0081\u00bc@\u0018$\u00cb\u00fb\u009a\u00b9x\u00e1'n\u00b8\u008a\u0012\u0087\u00fa3\u009b\u009f\u00cdyY\r\u0016\u00ab\u00f8\u00d8\u00cb\u009d\u008c\u00c2\u00da\u0086\u0083\u00cf2\u001a8e\u001f\u00d8\u008a}G\u0018Z\u00a8\u00a9\u00a6S\fa\u0092\u00dd\u0004\u00cf\u00abHC\u00c0\u0094\u0095'\u00ba\u009f\u00e4\u0005\u0010\u0019,\u00e8\\\u00bcU\u00f4x\u00ca\u0095G\u009c9\u00ec\u00f5s\u0003CcO\u00ed78\u009a\u00f1\u00eb\u00e3a\u008d\u00cbO\u0082\u00d7\u00ae\u001e\u00fc\u00db\u00e1%O\u0085\u00fc\u0004\u00bc\u008f>\u00c8\u00c0p\u00e1/[\b\u0087\u0019\u00cb\f\u0096'\u0099\u0017?\u00f2\u00efvg\u0081\u0086[R3I\u00c9\u0017\u00b8>H0g\u001f\u00b2\u001b\u00fa\u00db\u00ae%\u0084\u0016\u00b7\u00bf\u00a2\u00f7A\u00ac\u00d0O\u00fb\u00be\u00e3-\u00ab`\u00dc\u00ca6\u0004\u00adsKG\u009a\u00dd\u00b5\u00c6;&\u00bd\u0082\u00d5\u00ae\u00f6\u008a\u0001\u001a\u0090y\u00a6\u00a9\u00e8\fmS\u0097\u0095\u00867.\u000b\u009d\u000b!Ej{\u000beTF\u00a6\u00c6\u00e3\u00e1\u009f)\u009e\u0091\u0082c\u00b6\u000ef\u008a\\@}\u0092\u00fcW\r\u009f\u008d4\u00ca/\n\u00a3Zg\u00d6\u0092\u00af\u0081\u00b0\u00fc\u00d3P\u00c3?6{\u0015\u00da\u0011\u0093\u0094?+8\u0089\u00c6\u00c2\u00d1\u00f2\u00e3D'\u00ac\u00b6\u00ffBO'\u00c3^\u00b7J\u00ac\u00acR\u000f\u00efJ\u00f3|}\"\u00e2\u00cd\u00ce\u001c\u0011i\u00c0U-U\u0082\u0099L]\u00e7Ta\u009d\u00e634\u00b2\u00fexb \u00c8\u00e9u\u00df\u00ff~\u0016\u0014\u00be\u00c8\u00ad(\u008eM\u009c-DU\u00c0\u007f\u0084\u00d6q'\u009a\u00e2\u00e7\u009bNgP\u00df\u00e3(\u00bd\u00ebfXD\u0084\u0012a\u0082e\u00ad\u00e4#\u008bC\u008e<\u00adAkx\u00de\u00f4A\u001c\u0094\\\u00fa/\u0090`\u008b\u00b4.\u00d0\u0093\u00ab\u00ee\u0097,\u0006\u00deM\u00f7\u0092\u00a8g\u00de\u001c\u00da\u007f\u00d7\u00e6o\u0002\u00ce\t\u00b2\u00b4)T\u00b3\u0091?\u00fe\f\u0004y1\\D\u00ce\u00ff\u00d5\u00e6\u007f]\u00a0\u00fe\u00b3wv\u00b2\u008e\u00e2\u00bazU<\u0001ME}ed$\u00a4S7\u00d3\u00a8\u00c7\u00b6\u0091\u00f7\u00e9\u008c\u00eb\u008f\u00a6\u00dd\u00fe\u0012\u0082\u00eb\u009cY\u00f6C7\u0006\u00ce6\u0014\u00a1\u0091\u00ed>S3[|\u00ab\u00b2\u00dd^q\u0006(\u0010e\u0095o\u00baiS\u00fbD\u001e\u0085U\u00abp\u008b\u0087\u00ab\u00ff\u00d8\u0019\u00f1\u00eb\u00ba\u00871\f;_\u00c4\u00f1\u0004\u00cd\u00b8\\\u0010Z\u00ee@\u00e8\u00b9E\u0017\u00fd\u0002X\u009d\u009d\u00e8\u0080|2\u00d3]>\u00d04\u0011`e\u008f\u00c8 B\u00de\u0085\u0006\u0095\u00e5\u00f4O\u0085\tu\u0086\u009af\u00cd\r\u00bb\u0018\u0001\u00f1\u0098\u00ba\u001f\u001b\u0017\u00f9+\u00d1K\u00ec:I\u001d\u0093\u00e6\u009duFq;n\u0083\t\u0080]\u0015\u00b9\u000b\u00b7HQJi\u009b5\u008aV\u00c5\u0012\u00f4F\u00ec\u00d6j\u0097\u00e9hv\u00c2w)?\u00a5q\u0080\u00e8\u00f2\u00d7\u0019d!,\u0089Y\u00e4\u00bc\u0097RF\u00d6s\u0004]\u0083\u00a3vw2\u0099/B$M\u00fa\u0012\u00daE\u00f1\u00b4\u00a9S\u0016\u00105\u0005\b\u00f4\u00feLb-\u00dd\u00b6\u00a2\u00b6\u00dfA\u00d1 \u00d1\u00ea\u00af\u00e1\u00b4\u000b\u0006;\u00dd~\u008b<\u00ab\u00c8o[\u0089\u00cfy\u00c6^w\u0017Sc\u00dbr\u0000_\u00bfSk\u00ab.\u0011\u00f8z*\u00c3m\u0006#|\u001e\u0095\u008f\u00e0M[\u0097\u00aa`O\u00daK\u00159Qb2o\u009c\u00d6#\u0002\u00fd\u00fa\u00bcB\u00e8\u00db\u0098x8\u00df\u0013\u00b4\u00af\"b,\u00dc\u0095Up\t\u00d1";
                        var13_11 = "0\u00cb\u0090~\u00f7\u00be\u00e4\u00cbB@\u0084-\u00e9\u0014@aY\u00e0\u0081\u00b6\u009e\u0093[\u00ba;\u00ec\u0000\u00a5\u0090Z\u00f3\u0085\u0093\u008bD_\u0011\u00b6\u00e8\u00bcM\u00cb*\u00e0Q1\r\u009f\u0095ixe\u00e6O\u00c2\u0081\u00d4\u00e2^wV\u00b5\u0099\u00b4HBjX\u00fa\u009e\u00d1\u000f\u0015(_\u00c3\u00dev\u0002h\u0005\u0095\u0006\u0093\u00abT`\u00d1\u0089T\u00d3\u00d6\u0015r(\u00f8\u00de \u00d7\u00eas\u00d7\u0088\u00e5\u0017RV\u00eb8\u00c6\u0010\u008a\u000f\u00beM\u00ee\u00d5\u0010\u00cb\u00bd\u00ab\u00be;\u00c4\u0085\u00a6\u0019r,\u001c\u008b\"\u0084\u0013\u00fd\u0015\u008a\u00b6\n\u00ba\u00c3u\u00a92\u00f6\u00d8\u00f7Gm\u0002qp\u00cf\u0019\u0016\u00f8\u0083e\u0099n\u0088\u00d38$\u008aV\f8\u00a9\u0003\u009e\u00d4\u00a5\u00c8\u00e3mca\u00fd\u00e90\u0083\u00dd0\u001e}\u00f1,\u008c\u00ed\u00a9W\u00d6*\u00ee\u00b7\u00f1\u00b4*y\u009f\u000b\u00e5\u0097\u00d95\u0083|\u0001\u0010h\u0019\u009d\u0005m\u00bf(\u000e\u0017\u00deN\u00cd\u0092\u00e2l\u00f2\u00f4\u0091\u00cf\ro\u0093\u001e'\u00fd\u00a5\u0080U\u000ek\u00d1\u0091P\u001b\u00c7JX\u00e1(\u00b1}p\u00078\u00d0\u00a0\u0019o\u00157\u008e\"+\u00d8a\u0096#\u00e7\u00e7\n\u009e&#@+\u00d7S\u00e2\u0090s_\u00d4\u00e2Xk'D\u0099\u00adkI\u00ceq\u00ffu\u008b\u0016Z5\u00bby8\u00e2\u0082\u0003\u0019\u00c2\u00b1o\u00fd\u0018\u00c4\u0091\u00e5W\u0094pY\u00df\u00db\u009ab\u009c\u00eaw\u008a\u00aa\u00c7\u0083\u00c4\r\u00fdw!\u0005\u00e9\u0096\u0096|\b\u00d6\u00b4\u00e6\u0081\u00eef\u009e\t+ai.fV\u00cc\u00a52\u00b7\"BG\u00e5G\u0000T\u00b0\u00e8\u0011o8\u0084\u008b8&\u00e3\u00c3\u00e3\u000e\u007fk9\u00d2\u0013\u0095a\b\u00e4\u0007\u00e8\u00a8n\u00e0U\u00ecUbn\u00e8\u00ed\u0007\u00ce\u00bc0\u00f9\u0088\u001c\u00a3=\u00f7\u00deh\u00a7\u00e0\u00e8\u0098\u009au\u00e2nn\u00fe\u009c\u00a5\u00bc\u00f0\u00e4\u00cbx\u00a9\u00b1\r\u00bft\u0096\u0004n\u0015=h\u009a\u00b8\u00c6)`\u00c8\u00c4p\u00c7\u00e5g\u00fdJ\u0095!R\\I\u00d1V.\u00dd\u008fw\u00ae\u00aa\u00ed\u00aa\u0088\u00e5\u0093\t\u00c6\u00f3\u00a1\u0088\u0017\u00c1\u001b\u00fbz\u00de\";\u00fd\u000b\u00e3\u00ac\u0000\f\u00f4\u0000g8\u0089\u00dd\u0006\u0096\u0010\u00d5dmsAf\u00178\u0013h\u00b3\u001a-\u0080\u008b\u00c0\u00900M\u008by\u00fb\\G\u00c7\u00a1r~[\u00f0\u00b8Geh\u00d3\u001d\u00e83\u001d\u00ca\u00d7\u00ddI\u00c1;,\u00a9Pb\u00ef\u00d2\u00e5G5\u0010\u00fdH\u00e3\u00be9QD\u00b1D\u00f4\u00b7\u00fe\u000e\u0001\u008c\u00a3/}obr\u0000\u0018\u0010\u00e9\u00d0\u00dc\u008ftl\u00f55\u00e4;x1i\u00d5\u00de]U\u00b1\u0098\u00e5P\u00f1\u0092b\u00c5\u00fe\u00c9\u00d8#S\u00e1\u008c\u000e\u00e8P\u0007kYO7\u00da\u008e\u00a2\b2\u001d2\u00a6e\n\u0094<<\u00c7J\u00cb\u00f3\u009by\u00851\u00a0E\u00b5@\u00ca6!\u00e1by3K\u00f1\u00ebiX\u00b6\u0086\u00c0\u00fd\u00b8-s\t\u0013\u00e9e)\u00c9\u00eav\u00e1TQ\u009f::\u0093u\u0007\u00f6S\u00bc\u001e\u00bc\u0005ix\u0012cL\u00c4\u001c\u001e<s@\u00d5\u00ffg\u0014\u008a\u0013\u00b3\u000f\u0086\u00b9\u0016.\u0081\u00bc@\u0018$\u00cb\u00fb\u009a\u00b9x\u00e1'n\u00b8\u008a\u0012\u0087\u00fa3\u009b\u009f\u00cdyY\r\u0016\u00ab\u00f8\u00d8\u00cb\u009d\u008c\u00c2\u00da\u0086\u0083\u00cf2\u001a8e\u001f\u00d8\u008a}G\u0018Z\u00a8\u00a9\u00a6S\fa\u0092\u00dd\u0004\u00cf\u00abHC\u00c0\u0094\u0095'\u00ba\u009f\u00e4\u0005\u0010\u0019,\u00e8\\\u00bcU\u00f4x\u00ca\u0095G\u009c9\u00ec\u00f5s\u0003CcO\u00ed78\u009a\u00f1\u00eb\u00e3a\u008d\u00cbO\u0082\u00d7\u00ae\u001e\u00fc\u00db\u00e1%O\u0085\u00fc\u0004\u00bc\u008f>\u00c8\u00c0p\u00e1/[\b\u0087\u0019\u00cb\f\u0096'\u0099\u0017?\u00f2\u00efvg\u0081\u0086[R3I\u00c9\u0017\u00b8>H0g\u001f\u00b2\u001b\u00fa\u00db\u00ae%\u0084\u0016\u00b7\u00bf\u00a2\u00f7A\u00ac\u00d0O\u00fb\u00be\u00e3-\u00ab`\u00dc\u00ca6\u0004\u00adsKG\u009a\u00dd\u00b5\u00c6;&\u00bd\u0082\u00d5\u00ae\u00f6\u008a\u0001\u001a\u0090y\u00a6\u00a9\u00e8\fmS\u0097\u0095\u00867.\u000b\u009d\u000b!Ej{\u000beTF\u00a6\u00c6\u00e3\u00e1\u009f)\u009e\u0091\u0082c\u00b6\u000ef\u008a\\@}\u0092\u00fcW\r\u009f\u008d4\u00ca/\n\u00a3Zg\u00d6\u0092\u00af\u0081\u00b0\u00fc\u00d3P\u00c3?6{\u0015\u00da\u0011\u0093\u0094?+8\u0089\u00c6\u00c2\u00d1\u00f2\u00e3D'\u00ac\u00b6\u00ffBO'\u00c3^\u00b7J\u00ac\u00acR\u000f\u00efJ\u00f3|}\"\u00e2\u00cd\u00ce\u001c\u0011i\u00c0U-U\u0082\u0099L]\u00e7Ta\u009d\u00e634\u00b2\u00fexb \u00c8\u00e9u\u00df\u00ff~\u0016\u0014\u00be\u00c8\u00ad(\u008eM\u009c-DU\u00c0\u007f\u0084\u00d6q'\u009a\u00e2\u00e7\u009bNgP\u00df\u00e3(\u00bd\u00ebfXD\u0084\u0012a\u0082e\u00ad\u00e4#\u008bC\u008e<\u00adAkx\u00de\u00f4A\u001c\u0094\\\u00fa/\u0090`\u008b\u00b4.\u00d0\u0093\u00ab\u00ee\u0097,\u0006\u00deM\u00f7\u0092\u00a8g\u00de\u001c\u00da\u007f\u00d7\u00e6o\u0002\u00ce\t\u00b2\u00b4)T\u00b3\u0091?\u00fe\f\u0004y1\\D\u00ce\u00ff\u00d5\u00e6\u007f]\u00a0\u00fe\u00b3wv\u00b2\u008e\u00e2\u00bazU<\u0001ME}ed$\u00a4S7\u00d3\u00a8\u00c7\u00b6\u0091\u00f7\u00e9\u008c\u00eb\u008f\u00a6\u00dd\u00fe\u0012\u0082\u00eb\u009cY\u00f6C7\u0006\u00ce6\u0014\u00a1\u0091\u00ed>S3[|\u00ab\u00b2\u00dd^q\u0006(\u0010e\u0095o\u00baiS\u00fbD\u001e\u0085U\u00abp\u008b\u0087\u00ab\u00ff\u00d8\u0019\u00f1\u00eb\u00ba\u00871\f;_\u00c4\u00f1\u0004\u00cd\u00b8\\\u0010Z\u00ee@\u00e8\u00b9E\u0017\u00fd\u0002X\u009d\u009d\u00e8\u0080|2\u00d3]>\u00d04\u0011`e\u008f\u00c8 B\u00de\u0085\u0006\u0095\u00e5\u00f4O\u0085\tu\u0086\u009af\u00cd\r\u00bb\u0018\u0001\u00f1\u0098\u00ba\u001f\u001b\u0017\u00f9+\u00d1K\u00ec:I\u001d\u0093\u00e6\u009duFq;n\u0083\t\u0080]\u0015\u00b9\u000b\u00b7HQJi\u009b5\u008aV\u00c5\u0012\u00f4F\u00ec\u00d6j\u0097\u00e9hv\u00c2w)?\u00a5q\u0080\u00e8\u00f2\u00d7\u0019d!,\u0089Y\u00e4\u00bc\u0097RF\u00d6s\u0004]\u0083\u00a3vw2\u0099/B$M\u00fa\u0012\u00daE\u00f1\u00b4\u00a9S\u0016\u00105\u0005\b\u00f4\u00feLb-\u00dd\u00b6\u00a2\u00b6\u00dfA\u00d1 \u00d1\u00ea\u00af\u00e1\u00b4\u000b\u0006;\u00dd~\u008b<\u00ab\u00c8o[\u0089\u00cfy\u00c6^w\u0017Sc\u00dbr\u0000_\u00bfSk\u00ab.\u0011\u00f8z*\u00c3m\u0006#|\u001e\u0095\u008f\u00e0M[\u0097\u00aa`O\u00daK\u00159Qb2o\u009c\u00d6#\u0002\u00fd\u00fa\u00bcB\u00e8\u00db\u0098x8\u00df\u0013\u00b4\u00af\"b,\u00dc\u0095Up\t\u00d1".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "7\u00aa\t\u00caq\u00f1v#=\u00c9\u00a1\u00e1u\u00fc#\u00cf";
                            var13_11 = "7\u00aa\t\u00caq\u00f1v#=\u00c9\u00a1\u00e1u\u00fc#\u00cf".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                H.d = var14_8;
                H.e = new Integer[187];
                var0_14 = 7298481323429318313L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "/\u00e6\u00d6\u00e8\u00bc\u001eK\u00d0e\u001c\u00b1;\u0083\u00baE$}\u00a8i\u008fL\u008c\u001d\u00f8";
                var5_18 = "/\u00e6\u00d6\u00e8\u00bc\u001eK\u00d0e\u001c\u00b1;\u0083\u00baE$}\u00a8i\u008fL\u008c\u001d\u00f8".length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl148:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v22 = var3_16++;
            ** while (true)
        }
        H.k = var6_15;
        H.l = new Long[3];
        H.a = new H();
        H.P = H.d("Ca0Boq6WRWJErvf0", G(java.lang.String ), (String)H.b(26255, 12286));
        H.B = hi.a("G", H.b(26253, -23522), (long)1218614314410685839L);
        H.V = H.d("Ca0Boq6WRWJErvf0", build(), (RenderPipeline.Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)644676233272493604L)}, (long)731833861383729593L), (Object)H.b(26252, -20778), (long)774963328677840218L), (Object)new ColorTargetState((BlendFunction)hi.a("j", (long)804551088968673257L)), (long)725018889764347121L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L));
    }

    private Color J(int n) {
        CallSite callSite = hi.a("G", (float)((float)(hi.a("G", (long)658960450018995719L) + (long)n * H.d(31963, 5381727820970820973L)) / 4500.0f), (long)819393344494525742L);
        CallSite callSite2 = hi.a("G", (float)callSite, (float)0.65f, (float)1.0f, (long)614858597337907880L);
        return new Color((int)hi.a("\u00a5", (Object)callSite2, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)callSite2, (long)791634218836538619L), (int)hi.a("\u00a5", (Object)callSite2, (long)505295769199362574L), H.c(32502, 8680017279136385637L));
    }

    private H() {
        super(H.b(26250, 10903), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        this.x = hi.a("\u00a5", (Object)this, (Object)H.b(26249, 8620), (double)1.0, (double)0.5, (double)5.0, (double)0.1, (long)1077996338587307774L);
        this.M = hi.a("\u00a5", (Object)this, (Object)H.b(26241, -6406), (boolean)false, (long)1230617056439551805L);
        this.Q = new ArrayList<Dp>();
        this.h = new ArrayList<UUID>();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void Z(d9 var1_1) {
        block41: {
            block40: {
                block39: {
                    block38: {
                        block37: {
                            var2_2 = Dl.S();
                            var8_3 /* !! */  = hi.a("G", (int)H.c(17390, 8456383633686361919L), (int)H.c(12419, 8590874224333063342L), (long)834203424483934088L) / H.c(8768, 5062992448518985304L) + H.c(26544, 679220785012200274L);
                            if (var2_2) ** GOTO lbl16
                            block17: while (true) {
                                hi.a("G", (long)802702781471349640L);
                                block18: while (true) {
                                    block36: {
                                        block35: {
                                            block34: {
                                                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)807020555339575946L), (long)1256913436411747171L);
                                                if (!var2_2) break block34;
                                                if (v0 /* !! */  != false) break block35;
                                                v0 /* !! */  = var8_3 /* !! */  = (reference)(H.c(25887, 9090484765322498458L) / H.c(2824, 2252428330211721118L) - H.c(23014, 6286720365138439545L));
                                            }
                                            if (var2_2) break block36;
                                        }
                                        var8_3 /* !! */  = (reference)(((H.c(24503, 6787157393332595560L) + H.c(28513, 3750685708022733806L)) / H.c(2824, 2252428330211721118L) ^ H.c(6209, 2518132843646692570L)) + H.c(13516, 927548064365281292L) ^ H.c(32623, 235225369434377213L));
                                    }
                                    switch (var8_3 /* !! */ ) {
                                        case 1426531189: {
                                            continue block17;
                                        }
                                        default: {
                                            continue block18;
                                        }
                                        case 1426531190: {
                                            return;
                                        }
                                        case 1426531187: 
                                    }
                                    break;
                                }
                                break;
                            }
                            var3_4 = hi.a("\u00a5", (Object)var1_1, (long)1109062203649823396L);
                            v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)597331030484700667L), (Object)hi.a("j", (long)636108743492895578L), (long)511460060498514638L);
                            if (!var2_2) break block37;
                            if (v1 /* !! */  != false) break block38;
                            v1 /* !! */  = var8_3 /* !! */  = (reference)((H.c(16891, 563648108630898032L) + H.c(6466, 4331540045523267005L)) / H.c(5651, 7293864143929090604L) - H.c(28527, 8060119103325461442L));
                        }
                        if (var2_2) break block39;
                    }
                    var8_3 /* !! */  = (reference)((hi.a("G", (int)H.c(6586, 3419238947728141721L), (int)H.c(8791, 8684895534803097249L), (long)834203424483934088L) ^ H.c(2476, 4518504643345857887L)) + H.c(14152, 8757218602411328457L) - H.c(5297, 6054770629515124840L));
                }
                switch (var8_3 /* !! */ ) {
                    default: {
                        v2 = hi.a("j", (long)785097452317523512L);
                        var8_3 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)(H.c(1700, 5179253524291465739L) / H.c(16253, 3800931098718735294L)), (int)H.c(7035, 5479566924601864042L), (long)834203424483934088L), (int)H.c(3291, 6499042916982798347L), (long)834203424483934088L) / H.c(4557, 3132214828230878668L) ^ H.c(4520, 7390435904901621013L));
                        if (!var2_2) {
                            break;
                        }
                        break block40;
                    }
                    case 1535545154: {
                        v2 = hi.a("j", (long)750967470473580851L);
                        if (var2_2) break;
                        ** GOTO lbl-1000
                    }
                    case 1535545152: {
                        throw null;
                    }
                }
                var8_3 /* !! */  = (reference)(H.d("Ca0Boq6WRWJErvf0", max(int int ), (int)hi.a("G", (int)(H.c(1721, 5819473779203453501L) / H.c(16253, 3800931098718735294L)), (int)H.c(15322, 9199883055405076224L), (long)834203424483934088L), (int)H.c(30626, 6444080734770152202L)) / H.c(4557, 3132214828230878668L) ^ H.c(28908, 1043705667792258159L));
            }
            switch (var8_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var4_5 = v2;
                    var5_6 = hi.a("G", (Object)hi.a("j", (long)1015245771087275473L), (Object)var4_5, (long)1025704845774671219L);
                    hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)807020555339575946L), (long)473196647699225745L);
                    var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)807020555339575946L), (long)1240653736693366367L);
                    if (var2_2) break;
                    break block41;
                }
                case 1477257729: {
                    throw null;
                }
            }
            var8_3 /* !! */  = (reference)(H.c(1797, 4263028400707285822L) / H.c(1216, 3082006345253629956L) + H.c(15852, 3414154070899263827L));
            if (var2_2) ** GOTO lbl75
            ** GOTO lbl70
        }
        block19: while (true) {
            block44: {
                block43: {
                    block42: {
                        v3 /* !! */  = hi.a("\u00a5", (Object)var6_7, (long)984088978567310565L);
                        if (!var2_2) break block42;
                        if (v3 /* !! */  != false) break block43;
lbl70:
                        // 2 sources

                        v3 /* !! */  = var8_3 /* !! */  = (reference)(H.c(31864, 4740185927282280580L) - H.c(18921, 5569134067715997009L) - H.c(18043, 5290253383027913401L) ^ H.c(5791, 3553724558353769017L) ^ H.c(18503, 3255357418956782802L));
                    }
                    if (var2_2) break block44;
                }
                var8_3 /* !! */  = hi.a("G", (int)(H.c(21842, 507748350256669085L) - H.c(32428, 4637854151642761828L)), (int)H.c(16043, 9207284683777936024L), (long)834203424483934088L) + H.c(31369, 8606375539850530451L) + H.c(20136, 469288117102639762L);
            }
            block20: while (true) {
                switch (var8_3 /* !! */ ) {
                    default: {
                        continue block19;
                    }
                    case -475690864: {
                        var7_8 = (Dp)H.d("Ca0Boq6WRWJErvf0", next(), (Iterator)var6_7);
                        v4 = new Object[3];
                        v4[2] = var7_8;
                        v4[1] = var5_6;
                        v4[0] = var3_4;
                        hi.a("\u00a5", (Object)this, (Object)v4, (long)1120358394083893239L);
                        if (var2_2) ** GOTO lbl93
                        ** GOTO lbl-1000
                    }
                    case -475690862: lbl-1000:
                    // 2 sources

                    {
                        hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)807020555339575946L), (long)473196647699225745L);
                        H.d("Ca0Boq6WRWJErvf0", I(), (Xi)var5_6);
                        return;
                    }
lbl93:
                    // 1 sources

                    var8_3 /* !! */  = (reference)(H.c(28978, 6074062107869398321L) / H.c(24408, 7274197240780090255L) + H.c(4701, 5907217283545081557L));
                    continue block20;
                    case -475690865: 
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
    private boolean H(Object var1_1) {
        block14: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = H.d("Ca0Boq6WRWJErvf0", max(int int ), (int)((H.c(3228, 8301890577875384449L) ^ H.c(215, 2992408020207055909L)) / 5 + H.c(5042, 4861525036422276917L)), (int)H.c(13060, 1300877462746171270L)) ^ H.c(4005, 8744116123570322366L);
            if (var2_2) ** GOTO lbl11
            block11: while (true) {
                block16: {
                    block15: {
                        if ((Player)var1_1 != null) break block15;
                        var3_3 /* !! */  = H.c(8370, 2347368449816368130L) - H.c(14647, 1245112202955460011L) + H.c(22135, 1005228278852477593L) + H.c(26697, 6913454520798174434L) - H.c(20071, 6555432323728636607L);
                        if (var2_2) break block16;
                    }
                    var3_3 /* !! */  = (H.c(28621, 2529670177860377563L) - H.c(21859, 4722200367178146121L) + H.c(27240, 3711267632924221183L)) / H.c(29960, 3261350178751037867L) - H.c(20177, 2689175369774266908L);
                    if (!var2_2) ** GOTO lbl44
                }
                block12: while (true) {
                    block23: {
                        block22: {
                            block21: {
                                block19: {
                                    block20: {
                                        block18: {
                                            block17: {
                                                switch (var3_3 /* !! */ ) {
                                                    default: {
                                                        continue block11;
                                                    }
                                                    case 2134718074: {
                                                        v0 /* !! */  = hi.a("\u00a5", (Object)((Player)var1_1), (long)734391285421195537L);
                                                        if (!var2_2) break block17;
                                                        if (v0 /* !! */  == false) break;
                                                        break block18;
                                                    }
                                                    case 2134718077: {
                                                        v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)643184003515127822L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                        if (!var2_2) break block19;
                                                        if (v1 /* !! */  == false) break block20;
                                                        break block21;
                                                    }
                                                    case 2134718072: {
                                                        if ((Player)var1_1 != hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)) break block22;
                                                        break block23;
                                                    }
                                                    case 2134718078: {
                                                        v2 = true;
                                                        var3_3 /* !! */  = (H.c(32686, 147538560173984548L) ^ H.c(17408, 2055403206942322866L)) - H.c(31810, 7719228588470519886L) - H.c(17243, 1441251137184134998L) + H.c(12692, 5755795864100013352L);
                                                        if (!var2_2) {
                                                            break block11;
                                                        }
                                                        break block14;
                                                    }
                                                    case 2134718076: {
                                                        v2 = false;
                                                        if (var2_2) break block11;
                                                        return v2;
                                                    }
                                                    case 2134718075: {
                                                        H.d("Ca0Boq6WRWJErvf0", C(int boolean ), (int)H.c(2446, 1941112414087822599L), (boolean)false);
                                                        var3_3 /* !! */  = (H.d("Ca0Boq6WRWJErvf0", max(int int ), (int)(H.c(20797, 727530323482633487L) / H.c(12875, 8665858368060196570L) - H.c(1757, 1689460306252902974L)), (int)H.c(5804, 5322299691020624472L)) ^ H.c(10321, 5187563997717765351L)) - H.c(4165, 1045297519132517537L);
                                                        continue block12;
                                                    }
                                                }
lbl44:
                                                // 2 sources

                                                v0 /* !! */  = (CallSite)(H.c(12330, 8190362946119402632L) - H.c(11671, 9040861480464226682L) + H.c(26324, 6049187651830928097L) + H.c(19753, 3964702667243878851L) - H.c(20697, 2927316343269417988L));
                                            }
                                            var3_3 /* !! */  = (int)v0 /* !! */ ;
                                            if (var2_2) continue;
                                        }
                                        var3_3 /* !! */  = H.c(32638, 2933179840705285095L) * H.c(19074, 9065973990934838939L) - H.c(3525, 2435718149780191547L) - H.c(27861, 3056979958336346126L) - H.c(31145, 8232685869672779069L);
                                        if (var2_2) continue;
                                    }
                                    v1 /* !! */  = (CallSite)((H.c(23783, 6980273107506227417L) ^ H.c(20470, 3237090529690549226L) ^ H.c(48, 1920863679861077212L)) - H.c(28046, 6681896623666223479L) + H.c(29840, 2335268769873379506L));
                                }
                                var3_3 /* !! */  = (int)v1 /* !! */ ;
                                if (var2_2) continue;
                            }
                            var3_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)H.c(21994, 6957394995311075622L), (int)H.c(14581, 5207775191951150155L), (long)834203424483934088L), (int)H.c(11338, 750637293006723259L), (long)834203424483934088L) + H.c(9730, 4365362159442170588L) ^ H.c(15597, 2995036148075006202L);
                            if (var2_2) continue;
                        }
                        var3_3 /* !! */  = H.c(12330, 8190362946119402632L) - H.c(11671, 9040861480464226682L) + H.c(26324, 6049187651830928097L) + H.c(19753, 3964702667243878851L) - H.c(20697, 2927316343269417988L);
                        if (var2_2) continue;
                    }
                    var3_3 /* !! */  = (H.c(1215, 493586213005799585L) ^ H.c(22347, 2044504456465507199L) ^ H.c(16827, 1402501092805244329L)) - H.c(19153, 5365725991557136125L) + H.c(4980, 5587247571006400380L);
                }
                break;
            }
            var3_3 /* !! */  = (H.c(12075, 6244834388127882003L) ^ H.c(892, 6342731941548242905L)) - H.c(19398, 943588017491771368L) - H.c(6849, 1217649420578238049L) + H.c(9532, 1189365997617517051L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v2;
            }
            case -2058078440: 
        }
        hi.a("G", (long)405872435149102496L);
        return (boolean)hi.a("G", (long)979875262789802604L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x6689) & 0xFFFF;
        if (c[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 53;
                case 1 -> 245;
                case 2 -> 17;
                case 3 -> 100;
                case 4 -> 111;
                case 5 -> 212;
                case 6 -> 12;
                case 7 -> 192;
                case 8 -> 107;
                case 9 -> 48;
                case 10 -> 87;
                case 11 -> 244;
                case 12 -> 37;
                case 13 -> 156;
                case 14 -> 35;
                case 15 -> 79;
                case 16 -> 154;
                case 17 -> 237;
                case 18 -> 122;
                case 19 -> 253;
                case 20 -> 85;
                case 21 -> 57;
                case 22 -> 142;
                case 23 -> 65;
                case 24 -> 203;
                case 25 -> 215;
                case 26 -> 195;
                case 27 -> 19;
                case 28 -> 173;
                case 29 -> 14;
                case 30 -> 153;
                case 31 -> 234;
                case 32 -> 104;
                case 33 -> 179;
                case 34 -> 183;
                case 35 -> 138;
                case 36 -> 63;
                case 37 -> 26;
                case 38 -> 75;
                case 39 -> 204;
                case 40 -> 167;
                case 41 -> 66;
                case 42 -> 126;
                case 43 -> 29;
                case 44 -> 41;
                case 45 -> 152;
                case 46 -> 248;
                case 47 -> 141;
                case 48 -> 45;
                case 49 -> 92;
                case 50 -> 89;
                case 51 -> 250;
                case 52 -> 243;
                case 53 -> 160;
                case 54 -> 247;
                case 55 -> 101;
                case 56 -> 27;
                case 57 -> 134;
                case 58 -> 191;
                case 59 -> 230;
                case 60 -> 1;
                case 61 -> 131;
                case 62 -> 39;
                case 63 -> 132;
                case 64 -> 3;
                case 65 -> 254;
                case 66 -> 82;
                case 67 -> 222;
                case 68 -> 67;
                case 69 -> 224;
                case 70 -> 10;
                case 71 -> 252;
                case 72 -> 209;
                case 73 -> 84;
                case 74 -> 150;
                case 75 -> 115;
                case 76 -> 88;
                case 77 -> 226;
                case 78 -> 23;
                case 79 -> 0;
                case 80 -> 112;
                case 81 -> 208;
                case 82 -> 124;
                case 83 -> 217;
                case 84 -> 106;
                case 85 -> 108;
                case 86 -> 133;
                case 87 -> 60;
                case 88 -> 187;
                case 89 -> 242;
                case 90 -> 144;
                case 91 -> 246;
                case 92 -> 114;
                case 93 -> 61;
                case 94 -> 40;
                case 95 -> 175;
                case 96 -> 228;
                case 97 -> 194;
                case 98 -> 49;
                case 99 -> 59;
                case 100 -> 7;
                case 101 -> 157;
                case 102 -> 223;
                case 103 -> 2;
                case 104 -> 32;
                case 105 -> 102;
                case 106 -> 38;
                case 107 -> 46;
                case 108 -> 47;
                case 109 -> 5;
                case 110 -> 210;
                case 111 -> 96;
                case 112 -> 86;
                case 113 -> 137;
                case 114 -> 118;
                case 115 -> 4;
                case 116 -> 214;
                case 117 -> 174;
                case 118 -> 9;
                case 119 -> 77;
                case 120 -> 196;
                case 121 -> 51;
                case 122 -> 15;
                case 123 -> 43;
                case 124 -> 225;
                case 125 -> 98;
                case 126 -> 211;
                case 127 -> 235;
                case 128 -> 54;
                case 129 -> 201;
                case 130 -> 238;
                case 131 -> 125;
                case 132 -> 140;
                case 133 -> 123;
                case 134 -> 168;
                case 135 -> 42;
                case 136 -> 18;
                case 137 -> 232;
                case 138 -> 151;
                case 139 -> 80;
                case 140 -> 169;
                case 141 -> 181;
                case 142 -> 99;
                case 143 -> 52;
                case 144 -> 193;
                case 145 -> 120;
                case 146 -> 164;
                case 147 -> 162;
                case 148 -> 71;
                case 149 -> 31;
                case 150 -> 58;
                case 151 -> 165;
                case 152 -> 56;
                case 153 -> 147;
                case 154 -> 143;
                case 155 -> 146;
                case 156 -> 171;
                case 157 -> 119;
                case 158 -> 166;
                case 159 -> 139;
                case 160 -> 216;
                case 161 -> 94;
                case 162 -> 233;
                case 163 -> 198;
                case 164 -> 30;
                case 165 -> 34;
                case 166 -> 158;
                case 167 -> 76;
                case 168 -> 81;
                case 169 -> 148;
                case 170 -> 159;
                case 171 -> 93;
                case 172 -> 177;
                case 173 -> 213;
                case 174 -> 180;
                case 175 -> 255;
                case 176 -> 130;
                case 177 -> 185;
                case 178 -> 103;
                case 179 -> 8;
                case 180 -> 20;
                case 181 -> 135;
                case 182 -> 149;
                case 183 -> 95;
                case 184 -> 129;
                case 185 -> 155;
                case 186 -> 117;
                case 187 -> 178;
                case 188 -> 219;
                case 189 -> 206;
                case 190 -> 200;
                case 191 -> 70;
                case 192 -> 202;
                case 193 -> 113;
                case 194 -> 236;
                case 195 -> 72;
                case 196 -> 240;
                case 197 -> 62;
                case 198 -> 55;
                case 199 -> 231;
                case 200 -> 109;
                case 201 -> 116;
                case 202 -> 197;
                case 203 -> 249;
                case 204 -> 69;
                case 205 -> 136;
                case 206 -> 68;
                case 207 -> 21;
                case 208 -> 97;
                case 209 -> 13;
                case 210 -> 121;
                case 211 -> 163;
                case 212 -> 91;
                case 213 -> 73;
                case 214 -> 11;
                case 215 -> 218;
                case 216 -> 16;
                case 217 -> 110;
                case 218 -> 24;
                case 219 -> 176;
                case 220 -> 239;
                case 221 -> 6;
                case 222 -> 251;
                case 223 -> 186;
                case 224 -> 199;
                case 225 -> 189;
                case 226 -> 105;
                case 227 -> 188;
                case 228 -> 170;
                case 229 -> 78;
                case 230 -> 205;
                case 231 -> 127;
                case 232 -> 227;
                case 233 -> 44;
                case 234 -> 74;
                case 235 -> 221;
                case 236 -> 161;
                case 237 -> 25;
                case 238 -> 33;
                case 239 -> 36;
                case 240 -> 28;
                case 241 -> 50;
                case 242 -> 64;
                case 243 -> 83;
                case 244 -> 90;
                case 245 -> 128;
                case 246 -> 241;
                case 247 -> 207;
                case 248 -> 229;
                case 249 -> 145;
                case 250 -> 172;
                case 251 -> 220;
                case 252 -> 184;
                case 253 -> 182;
                case 254 -> 190;
                default -> 22;
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
            H.c[n3] = new String(cArray).intern();
        }
        return c[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x34B9;
        if (e[n2] == null) {
            H.e[n2] = (int)(d[n2] ^ l);
        }
        return e[n2];
    }

    private static long d(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x79B6) & Short.MAX_VALUE;
        if (H.l[n2] == null) {
            H.l[n2] = k[n2] ^ l;
        }
        return H.l[n2];
    }
}
