/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.MultiPlayerGameMode
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Vec3i
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.boss.enderdragon.EndCrystal
 *  net.minecraft.world.entity.player.Inventory
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.level.ClipContext
 *  net.minecraft.world.level.ClipContext$Block
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.phys.BlockHitResult
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.Oh;
import com.github.epsilon.XG;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.lz;
import com.github.epsilon.vY;
import com.github.epsilon.yD;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class r
extends e {
    private int F;
    private int Q;
    private final Dx<Oh> S;
    private int K;
    private final XG z;
    public static final r m;
    private boolean e;
    private final Dx<yD> C;
    private final XG B;
    private final DM c = hi.a("\u00a5", (Object)this, (Object)r.b(21947, -25069), (double)4.0, (double)1.0, (double)6.0, (double)0.1, (long)1077996338587307774L);
    private final XG E;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] h;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void J(dR var1_1) {
        block85: {
            block95: {
                block94: {
                    block84: {
                        block82: {
                            block83: {
                                block81: {
                                    block80: {
                                        var2_2 = Dl.t();
                                        var18_3 /* !! */  = (r.c(11994, 1455474628472273171L) + r.c(28079, 1497302660461050573L) - r.c(7041, 6988196162760461620L)) / r.c(22864, 2864829883165314729L) + r.c(22441, 6863351144063303914L);
                                        if (!var2_2) break block80;
lbl4:
                                        // 2 sources

                                        while (true) {
                                            block87: {
                                                block86: {
                                                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)412409060139490357L);
                                                    if (var2_2) break block86;
                                                    if (v0 /* !! */  == false) break block87;
                                                    v0 /* !! */  = (CallSite)((hi.a("G", (int)(r.c(10714, 8868138207266111216L) ^ r.c(32104, 5997776738225269386L)), (int)r.c(28836, 5737391610706634524L), (long)834203424483934088L) ^ r.c(25339, 1714800862022874603L)) / r.c(8967, 527072312931546252L) + r.c(4910, 6997688664365843486L));
                                                }
                                                var18_3 /* !! */  = (int)v0 /* !! */ ;
                                                if (!var2_2) break block80;
                                            }
                                            var18_3 /* !! */  = ((hi.a("G", (int)r.c(14323, 3964986552328314940L), (int)r.c(15052, 1102464541092801881L), (long)834203424483934088L) - r.c(29548, 3358553315016287697L)) * r.c(7366, 1852731449835997806L) ^ r.c(6541, 963972099768176156L)) - r.c(20467, 1264081703171430421L);
                                            if (!var2_2) break block80;
                                            ** GOTO lbl115
                                            break;
                                        }
lbl16:
                                        // 2 sources

                                        while (true) {
                                            block92: {
                                                block91: {
                                                    block90: {
                                                        block89: {
                                                            block88: {
                                                                var3_4 = (EndCrystal)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), EndCrystal.class, (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)766380852710420164L), (double)hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)797187085685389137L), (long)789438897355831922L)), (long)637262500311742568L), (long)939956135489390941L), (Predicate<EndCrystal>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$0(net.minecraft.world.entity.boss.enderdragon.EndCrystal ), (Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;)Z)((r)this), (long)1257472219554705125L), (long)415197394286909465L), (Object)hi.a("G", (ToDoubleFunction<EndCrystal>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$onTick$1(net.minecraft.world.entity.boss.enderdragon.EndCrystal ), (Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;)D)((r)this), (long)1110573410300049240L), (long)966808767256027499L), null, (long)535909545969414314L);
                                                                if (var2_2) break block88;
                                                                if (var3_4 == null) break block89;
                                                                var18_3 /* !! */  = (int)(hi.a("G", (int)r.c(22357, 4399785753126961182L), (int)r.c(21759, 6999866393241584449L), (long)834203424483934088L) * r.c(13064, 3028228550720283771L) + r.c(5485, 7449690187516658418L) + r.c(29537, 8973453996624749601L) + r.c(4534, 3866671124760577774L));
                                                            }
                                                            if (!var2_2) break block90;
                                                        }
                                                        var18_3 /* !! */  = hi.a("G", (int)(r.c(9328, 5938251562744902572L) / 5 ^ r.c(6406, 6640242992963407428L)), (int)r.c(20650, 7390372348278572860L), (long)834203424483934088L) ^ r.c(11261, 4814218730300374270L);
                                                    }
                                                    switch (var18_3 /* !! */ ) {
                                                        default: {
                                                            return;
                                                        }
                                                        case 96997984: {
                                                            var4_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1133521407411179272L);
                                                            var5_6 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var3_4, (long)410151044975148381L), (double)0.0, (double)0.5, (double)0.0, (long)1050989166521321638L);
                                                            var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)new ClipContext((Vec3)var4_5, (Vec3)var5_6, (ClipContext.Block)hi.a("j", (long)1246558594152704253L), (ClipContext.Fluid)hi.a("j", (long)747535818869381789L), (Entity)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (long)438016674394306919L);
                                                            if (var2_2) break block91;
                                                            if (hi.a("\u00a5", (Object)var6_7, (long)760876273703437601L) != hi.a("j", (long)1164827453998066990L)) break;
                                                            break block92;
                                                        }
                                                        case 96997983: {
                                                            throw null;
                                                        }
                                                    }
                                                    var18_3 /* !! */  = (r.c(21124, 4824876758582494594L) ^ r.c(23081, 8198994478412598780L)) * r.c(13690, 1811022621706609614L) - r.c(29226, 2232310807498564926L);
                                                }
                                                if (!var2_2) break block81;
                                            }
                                            var18_3 /* !! */  = (r.c(9428, 1443876088149537692L) ^ r.c(14716, 5317730696135405177L)) * r.c(7768, 3172218331385907711L) - r.c(15677, 1556977185418636007L);
                                            break block81;
                                            break;
                                        }
lbl45:
                                        // 2 sources

                                        while (true) {
                                            v1 /* !! */  = hi.a("G", (Object)var10_11, (long)465631626898234663L);
                                            if (var2_2) ** GOTO lbl239
                                            if (v1 /* !! */  != false) ** GOTO lbl238
                                            ** GOTO lbl241
                                            break;
                                        }
lbl50:
                                        // 2 sources

                                        while (true) {
                                            v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)929367222150810165L), (Object)hi.a("j", (long)445698929824880422L), (long)511460060498514638L);
                                            if (var2_2) ** GOTO lbl318
                                            if (v2 /* !! */  == false) ** GOTO lbl317
                                            ** GOTO lbl320
                                            break;
                                        }
lbl55:
                                        // 2 sources

                                        while (true) {
                                            cfr_temp_0 = var16_16 - 15.0;
                                            v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                            if (var2_2) ** GOTO lbl332
                                            if (v3 <= 0) ** GOTO lbl331
                                            ** GOTO lbl335
lbl61:
                                            // 2 sources

                                            while (true) {
                                                v4 = var13_14;
                                                if (var2_2) ** GOTO lbl352
                                                if (v4 == 0) ** GOTO lbl351
                                                ** GOTO lbl353
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    block58: while (true) {
                                        switch (var18_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -2107428548: {
                                                v5 /* !! */  = hi.a("\u00e9", (Object)this, (long)765716040858293100L);
                                                if (var2_2) ** GOTO lbl116
                                                if (v5 /* !! */  == false) ** GOTO lbl115
                                                ** GOTO lbl118
                                            }
                                            case -2107428549: {
                                                v6 /* !! */  = hi.a("\u00e9", (Object)this, (long)675223623661782433L);
                                                if (var2_2) ** GOTO lbl121
                                                if (v6 /* !! */  <= 0) ** GOTO lbl120
                                                ** GOTO lbl123
                                            }
                                            case -2107428539: {
                                                v7 = this;
                                                hi.a("\u00f2", (Object)v7, (int)(hi.a("\u00e9", (Object)v7, (long)675223623661782433L) - true), (long)675223623661782433L);
                                                v8 /* !! */  = hi.a("\u00e9", (Object)this, (long)675223623661782433L);
                                                if (var2_2) ** GOTO lbl126
                                                if (v8 /* !! */  <= 0) ** GOTO lbl125
                                                ** GOTO lbl128
                                            }
                                            case -2107428547: {
                                                v9 /* !! */  = hi.a("\u00e9", (Object)this, (long)1164218155521350028L);
                                                if (var2_2) ** GOTO lbl131
                                                if (v9 /* !! */  < 0) ** GOTO lbl130
                                                ** GOTO lbl133
                                            }
                                            case -2107428540: {
                                                r.d("OSWeBVQn73rGihge", setSelectedSlot(int ), (Inventory)r.d("OSWeBVQn73rGihge", getInventory(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (int)hi.a("\u00e9", (Object)this, (long)1164218155521350028L));
                                                if (!var2_2) ** GOTO lbl135
                                                ** GOTO lbl-1000
                                            }
                                            case -2107428545: lbl-1000:
                                            // 2 sources

                                            {
                                                hi.a("\u00f2", (Object)this, (boolean)false, (long)765716040858293100L);
                                                hi.a("\u00f2", (Object)this, (int)-1, (long)1164218155521350028L);
                                                return;
                                            }
                                            case -2107428544: {
                                                v10 /* !! */  = hi.a("\u00e9", (Object)this, (long)1044238316923513333L);
                                                if (var2_2) ** GOTO lbl138
                                                if (v10 /* !! */  <= 0) ** GOTO lbl137
                                                ** GOTO lbl140
                                            }
                                            case -2107428541: {
                                                v11 = this;
                                                hi.a("\u00f2", (Object)v11, (int)(hi.a("\u00e9", (Object)v11, (long)1044238316923513333L) - true), (long)1044238316923513333L);
                                                if (!var2_2) ** GOTO lbl142
                                                ** GOTO lbl16
                                            }
                                            case -2107428542: {
                                                ** continue;
                                            }
                                            case -2107428546: {
                                                ** GOTO lbl-1000
                                            }
lbl115:
                                            // 2 sources

                                            v5 /* !! */  = (CallSite)((r.c(589, 1665104113695282464L) ^ r.c(32259, 1584471458926930274L)) - r.c(22661, 8984685472257937200L) + r.c(633, 6862608254347597276L));
lbl116:
                                            // 2 sources

                                            var18_3 /* !! */  = (int)v5 /* !! */ ;
                                            if (!var2_2) continue block58;
lbl118:
                                            // 2 sources

                                            var18_3 /* !! */  = r.c(24605, 994573885754685227L) * r.c(2509, 2156878870912589557L) / r.c(23169, 7606642705303539009L) + r.c(12539, 564903725308208730L) + r.c(7200, 312946943827495915L) + r.c(27941, 2565974213358926568L);
                                            if (!var2_2) continue block58;
lbl120:
                                            // 2 sources

                                            v6 /* !! */  = (CallSite)(r.c(15614, 6366245044090235864L) / 4 ^ r.c(15421, 3717815522511973283L) ^ r.c(14481, 25421863265824571L));
lbl121:
                                            // 2 sources

                                            var18_3 /* !! */  = (int)v6 /* !! */ ;
                                            if (!var2_2) continue block58;
lbl123:
                                            // 2 sources

                                            var18_3 /* !! */  = (r.c(1538, 922492774670258353L) ^ r.c(16626, 3592324232499337098L)) / 5 + r.c(31216, 5297920039557377765L);
                                            if (!var2_2) continue block58;
lbl125:
                                            // 2 sources

                                            v8 /* !! */  = (CallSite)(r.c(22981, 5976443203826781887L) / 4 ^ r.c(23356, 8619097420263460077L) ^ r.c(21573, 93508846490845932L));
lbl126:
                                            // 2 sources

                                            var18_3 /* !! */  = (int)v8 /* !! */ ;
                                            if (!var2_2) continue block58;
lbl128:
                                            // 2 sources

                                            var18_3 /* !! */  = (int)(hi.a("G", (int)(r.c(25174, 2770885758705677658L) + r.c(3648, 3506583542253312250L)), (int)r.c(26849, 1720443991221059505L), (long)834203424483934088L) + r.c(22769, 7848702551064776522L));
                                            if (!var2_2) continue block58;
lbl130:
                                            // 2 sources

                                            v9 /* !! */  = (CallSite)(r.c(7264, 3627206043381320476L) - r.c(27182, 5424989572249206218L) - r.c(31695, 8966477268002843653L));
lbl131:
                                            // 2 sources

                                            var18_3 /* !! */  = (int)v9 /* !! */ ;
                                            if (!var2_2) continue block58;
lbl133:
                                            // 2 sources

                                            var18_3 /* !! */  = r.c(2874, 308574883923123304L) / r.c(23856, 182679749737187926L) / 3 * r.c(7823, 3863808705078413655L) - r.c(1037, 5221176864056398497L);
                                            if (!var2_2) continue block58;
lbl135:
                                            // 2 sources

                                            var18_3 /* !! */  = r.c(18477, 8724249750009520052L) - r.c(11764, 6886183871129614989L) - r.c(21690, 6652173982226088803L);
                                            if (!var2_2) continue block58;
lbl137:
                                            // 2 sources

                                            v10 /* !! */  = (CallSite)(r.d("OSWeBVQn73rGihge", max(int int ), (int)(r.c(2131, 2818265420361752368L) / r.c(23214, 3949417774482852895L)), (int)r.c(3821, 5826183475106535503L)) * r.c(20362, 608853515675375911L) ^ r.c(22390, 8195161025415938177L));
lbl138:
                                            // 2 sources

                                            var18_3 /* !! */  = (int)v10 /* !! */ ;
                                            if (!var2_2) continue block58;
lbl140:
                                            // 2 sources

                                            var18_3 /* !! */  = r.c(25865, 47031219926086150L) - r.c(19019, 5390421508761984397L) + r.c(13826, 4725342002890007011L);
                                            if (!var2_2) continue block58;
lbl142:
                                            // 2 sources

                                            var18_3 /* !! */  = hi.a("G", (int)(r.c(17630, 3335997913095148432L) / r.c(23214, 3949417774482852895L)), (int)r.c(28843, 5143136122510813016L), (long)834203424483934088L) * r.c(16082, 6910366664279288200L) ^ r.c(28951, 5073902742895437544L);
                                            continue block58;
                                            case -2107428551: {
                                                return;
                                            }
                                            case -2107428543: 
                                        }
                                        break;
                                    }
                                    return;
                                }
                                block59: do {
                                    block93: {
                                        switch (var18_3 /* !! */ ) {
                                            default: {
                                                var7_8 = hi.a("\u00a5", (Object)((BlockHitResult)var6_7), (long)367457867556936554L);
                                                v12 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)var7_8, (long)419122760578116751L), (Object)hi.a("j", (long)1146475133277880362L), (long)1333463834707911712L);
                                                if (!var2_2) {
                                                    if (v12 /* !! */  == false) break;
                                                    break block59;
                                                }
                                                break block93;
                                            }
                                            case 44605609: {
                                                var7_8 = hi.a("\u00a5", (Object)var3_4, (long)410151044975148381L);
                                                var8_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1045344535518524325L);
                                                var9_10 = hi.a("\u00a5", (Object)var8_9, (Object)var7_8, (double)0.5, (long)1123644657718867006L);
                                                var10_11 = hi.a("G", (double)hi.a("\u00e9", (Object)var9_10, (long)1300412705618690751L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L), (double)hi.a("\u00e9", (Object)var9_10, (long)1282612456329596420L), (long)921489941210881726L);
                                                v13 = hi.a("\u00a5", (Object)var10_11, (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1287749508287635914L), (long)1203894332961133998L);
                                                if (var2_2) break block82;
                                                if (v13 != false) break block83;
                                                break block84;
                                            }
                                            case 44605610: {
                                                throw null;
                                            }
                                        }
                                        v12 /* !! */  = (CallSite)((r.c(14899, 3550411372886945031L) ^ r.c(16828, 1819643265539315361L)) * r.c(1172, 1583537749546947497L) - r.c(9229, 3200327242298127207L));
                                    }
                                    var18_3 /* !! */  = (int)v12 /* !! */ ;
                                } while (!var2_2);
                                break block94;
                            }
                            v13 = hi.a("G", (int)r.c(26907, 2930321203748028021L), (int)r.c(30766, 6568474328597082090L), (long)834203424483934088L) - r.c(1008, 226249603279934681L);
                        }
                        var18_3 /* !! */  = (int)v13;
                        if (!var2_2) break block95;
                    }
                    var18_3 /* !! */  = hi.a("G", (int)r.c(3427, 705292753401535181L), (int)r.c(21720, 5669097690591822612L), (long)834203424483934088L) / 5 ^ r.c(30934, 8123478709580738536L);
                    if (!var2_2) break block95;
                    ** GOTO lbl231
                }
                var18_3 /* !! */  = (int)(hi.a("G", (int)(r.c(26261, 858259249940508984L) - r.c(11790, 7594289286374684849L)), (int)r.c(14584, 6884424703103037318L), (long)834203424483934088L) - r.c(16814, 1831548360443958905L));
                block60: while (true) {
                    switch (var18_3 /* !! */ ) {
                        case 1882302803: {
                            hi.a("G", (long)829648466043852550L);
                            hi.a("G", (float)10.0f, (float)1.0f, (int)0, (long)803182559024134953L);
                            var18_3 /* !! */  = (int)(hi.a("G", (int)(r.c(23849, 1493195811120483018L) * r.c(8125, 1283340047879457039L) / r.c(25727, 1116268778844795658L) + r.c(8274, 8161984412129785749L)), (int)r.c(22407, 6113294562118172824L), (long)834203424483934088L) + r.c(15269, 7064103440645090571L));
                            continue block60;
                        }
                    }
                    break;
                }
                return;
            }
            block61: while (true) {
                switch (var18_3 /* !! */ ) {
                    default: {
                        v14 = r.d("OSWeBVQn73rGihge", equals(java.lang.Object ), (BlockPos)var10_11, (Object)hi.a("\u00a5", (Object)var3_4, (long)650741614550217483L));
                        if (var2_2) ** GOTO lbl232
                        if (v14 == false) ** GOTO lbl231
                        ** GOTO lbl234
                    }
                    case -1366146337: {
                        var11_12 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var7_8, (Object)var8_9, (long)1082050008038634828L), (long)1049603101739605009L);
                        var10_11 = hi.a("G", (double)(hi.a("\u00e9", (Object)var8_9, (long)1300412705618690751L) + hi.a("\u00e9", (Object)var11_12, (long)1300412705618690751L)), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L), (double)(hi.a("\u00e9", (Object)var8_9, (long)1282612456329596420L) + hi.a("\u00e9", (Object)var11_12, (long)1282612456329596420L)), (long)921489941210881726L);
                        if (!var2_2) ** GOTO lbl236
                        ** GOTO lbl45
                    }
                    case -1366146334: {
                        ** continue;
                    }
                    case -1366146336: {
                        v15 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)hi.a("\u00a5", (Object)var10_11, (long)658569932818975326L), (long)419122760578116751L), (long)1221982383002585683L);
                        if (var2_2) ** GOTO lbl244
                        if (v15 /* !! */  != false) ** GOTO lbl243
                        ** GOTO lbl246
                    }
                    case -1366146333: {
                        var11_12 = hi.a("G", (Object)new Item[]{hi.a("j", (long)659740464421689022L)}, (long)1292196553031238656L);
                        v16 = hi.a("\u00a5", (Object)var11_12, (long)429462471063532441L);
                        if (var2_2) ** GOTO lbl249
                        if (v16 != false) ** GOTO lbl248
                        ** GOTO lbl251
                    }
                    case -1366146335: {
                        hi.a("G", (long)641038085929903199L);
                        hi.a("G", (long)589253768936098215L);
                        var18_3 /* !! */  = r.c(4050, 4342747718746986713L) - r.c(13719, 2531483287661077174L) - r.c(7346, 3694231149656558482L);
                        continue block61;
                    }
lbl231:
                    // 2 sources

                    v14 = hi.a("G", (int)r.c(25809, 3264027342676079587L), (int)r.c(19212, 1070958080283024438L), (long)834203424483934088L) - r.c(24124, 3996076645691459944L) + r.c(23888, 7868261529417124364L);
lbl232:
                    // 2 sources

                    var18_3 /* !! */  = (int)v14;
                    if (!var2_2) continue block61;
lbl234:
                    // 2 sources

                    var18_3 /* !! */  = (int)(hi.a("G", (int)r.c(6767, 7851183743289347474L), (int)r.c(9201, 6675431565185283201L), (long)834203424483934088L) - r.c(9833, 6766277393117147467L));
                    continue block61;
lbl236:
                    // 1 sources

                    var18_3 /* !! */  = (int)(r.d("OSWeBVQn73rGihge", max(int int ), (int)r.c(20922, 5189800400783607531L), (int)r.c(19702, 8644152010651147081L)) - r.c(685, 7700092259137639694L) + r.c(27217, 4250342386073288057L));
                    if (!var2_2) continue block61;
lbl238:
                    // 2 sources

                    v1 /* !! */  = (CallSite)(((r.c(29065, 5936550050831148605L) ^ r.c(2754, 4319973811852696989L)) * r.c(15581, 5726778561979050831L) - r.c(18516, 3999400488747966372L)) / r.c(23214, 3949417774482852895L) ^ r.c(30247, 9148956605286654307L));
lbl239:
                    // 2 sources

                    var18_3 /* !! */  = (int)v1 /* !! */ ;
                    if (!var2_2) continue block61;
lbl241:
                    // 2 sources

                    var18_3 /* !! */  = (hi.a("G", (int)r.c(10242, 8323196331560566572L), (int)r.c(4343, 3709051123454625606L), (long)834203424483934088L) / r.c(3601, 1307144206035573034L) ^ r.c(30177, 7785220694938296914L)) + r.c(16818, 4557401017131112114L) - r.c(11744, 8268251015689304711L);
                    if (!var2_2) continue block61;
lbl243:
                    // 2 sources

                    v15 /* !! */  = (CallSite)(hi.a("G", (int)((r.c(31197, 1556729935919394686L) + r.c(18097, 810958374043193699L)) * r.c(16736, 4796915132375963239L)), (int)r.c(14740, 8462264475276668518L), (long)834203424483934088L) * r.c(30446, 1044489256395120896L) ^ r.c(2120, 3124290126109171704L));
lbl244:
                    // 2 sources

                    var18_3 /* !! */  = (int)v15 /* !! */ ;
                    if (!var2_2) continue block61;
lbl246:
                    // 2 sources

                    var18_3 /* !! */  = (int)(r.d("OSWeBVQn73rGihge", max(int int ), (int)(r.c(17639, 8337924348482097735L) / r.c(27134, 2341535485715431238L)), (int)r.c(23844, 104619889112418827L)) / 4 - r.c(17431, 2410912301717230384L));
                    continue block61;
lbl248:
                    // 1 sources

                    v16 = hi.a("G", (int)(r.c(5584, 3099739241938338460L) ^ r.c(11234, 2035937686802365520L)), (int)r.c(13494, 2918716415370126135L), (long)834203424483934088L) + r.c(6753, 3811814217467022829L) + r.c(22149, 1627437344438616470L);
lbl249:
                    // 2 sources

                    var18_3 /* !! */  = (int)v16;
                    if (!var2_2) ** GOTO lbl252
lbl251:
                    // 2 sources

                    var18_3 /* !! */  = (r.c(5106, 2029194328415257851L) + r.c(26444, 7903160405943365668L) - r.c(28100, 4669179482999241392L)) / r.c(28081, 7292793842260425240L) + r.c(28568, 8747674639599614190L);
lbl252:
                    // 2 sources

                    switch (var18_3 /* !! */ ) {
                        default: {
                            return;
                        }
                        case 1847392252: {
                            var12_13 = r.d("OSWeBVQn73rGihge", J(net.minecraft.world.phys.Vec3 net.minecraft.world.phys.Vec3 ), (Vec3)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1133521407411179272L), (Vec3)hi.a("G", (Object)var10_11, (long)968425374253918917L));
                            var13_14 = 1;
                            v17 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)929367222150810165L), (Object)hi.a("j", (long)548721359716521015L), (long)511460060498514638L);
                            if (var2_2) ** GOTO lbl267
                            if (v17 /* !! */  == false) break;
                            ** GOTO lbl269
                        }
                        case 1847392253: lbl-1000:
                        // 2 sources

                        {
                            hi.a("G", (long)1186314902226853278L);
                            return;
                        }
                    }
                    v17 /* !! */  = (CallSite)(hi.a("G", (int)((r.c(21034, 6317089742997816798L) + r.c(22092, 6246535392642826589L)) / r.c(12225, 6364413510552287303L)), (int)r.c(13214, 5627159715560383733L), (long)834203424483934088L) + r.c(12616, 3827888380863604721L) ^ r.c(9164, 4228551653950321862L));
lbl267:
                    // 2 sources

                    var18_3 /* !! */  = (int)v17 /* !! */ ;
                    if (!var2_2) break block85;
lbl269:
                    // 2 sources

                    var18_3 /* !! */  = r.c(18340, 5621710162234773647L) + r.c(20446, 1117651006687123681L) - r.c(12114, 1594395996671375387L) - r.c(15485, 5402251684732758808L);
                    if (!var2_2) break block85;
                    ** GOTO lbl315
                    case -1366146331: {
                        return;
                    }
                    case -1366146338: 
                }
                break;
            }
            return;
        }
        block62: while (true) {
            switch (var18_3 /* !! */ ) {
                default: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (float)hi.a("\u00a5", (Object)var12_13, (long)1049231279723202751L), (long)1214614963582978512L);
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (float)hi.a("G", (float)hi.a("\u00a5", (Object)var12_13, (long)1059675231579017960L), (float)-90.0f, (float)90.0f, (long)390336973585993938L), (long)579382921061737669L);
                    if (!var2_2) ** GOTO lbl315
                    ** GOTO lbl50
                }
                case 922132246: {
                    ** continue;
                }
                case 922132248: {
                    hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)var12_13, (double)((double)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1065338250192452276L), (long)789438897355831922L)), (long)1260538186742955956L)), (Object)hi.a("j", (long)1061553595500331636L), (long)1303508973408765465L);
                    if (var2_2) ** GOTO lbl323
                    if (hi.a("\u00e9", (Object)hi.a("j", (long)1054285254962319361L), (long)603873101947865664L) == null) ** GOTO lbl322
                    ** GOTO lbl324
                }
                case 922132247: {
                    var14_15 = (double)hi.a("G", (float)hi.a("G", (float)(hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)new Object[0], (long)1186016776197838097L) - hi.a("\u00a5", (Object)var12_13, (long)1049231279723202751L)), (long)604508068528351008L), (long)400111314131951612L);
                    var16_16 = (double)hi.a("G", (float)(hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)new Object[0], (long)1020209408883681757L) - hi.a("\u00a5", (Object)var12_13, (long)1059675231579017960L)), (long)400111314131951612L);
                    cfr_temp_1 = var14_15 - 15.0;
                    v18 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                    if (var2_2) ** GOTO lbl327
                    if (v18 > 0) ** GOTO lbl326
                    ** GOTO lbl329
                }
                case 922132243: {
                    ** GOTO lbl61
                }
                case 922132244: {
                    v19 /* !! */  = hi.a("\u00e9", (Object)this, (long)1044238316923513333L);
                    if (var2_2) ** GOTO lbl356
                    if (v19 /* !! */  > 0) ** GOTO lbl355
                    ** GOTO lbl358
                }
                case 922132241: {
                    v20 = new Object[2];
                    v20[1] = var11_12;
                    v20[0] = var10_11;
                    hi.a("\u00a5", (Object)this, (Object)v20, (long)1084324886274108388L);
                    hi.a("\u00f2", (Object)this, (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)596213899475878793L), (long)789438897355831922L)), (long)1260538186742955956L), (long)1044238316923513333L);
                    if (var2_2) {
                        return;
                    }
                    ** GOTO lbl360
                }
lbl315:
                // 2 sources

                var18_3 /* !! */  = (hi.a("G", (int)r.c(17487, 2835770813552563189L), (int)r.c(6202, 824476935443468035L), (long)834203424483934088L) + r.c(7080, 8356035725179178215L) ^ r.c(30048, 8245293960086266523L)) + r.c(2541, 6290617785989422929L);
                if (!var2_2) continue block62;
lbl317:
                // 2 sources

                v2 /* !! */  = (CallSite)((hi.a("G", (int)r.c(9038, 6354469735284896981L), (int)r.c(3611, 4057781018102061546L), (long)834203424483934088L) + r.c(31474, 7129496554106006894L) ^ r.c(1356, 4276596997355819537L)) + r.c(2509, 5077609987388792534L));
lbl318:
                // 2 sources

                var18_3 /* !! */  = (int)v2 /* !! */ ;
                if (!var2_2) continue block62;
lbl320:
                // 2 sources

                var18_3 /* !! */  = r.c(27206, 2463415613824580921L) * r.c(12033, 282344456912893975L) + r.c(20890, 1778461103180809763L);
                if (!var2_2) continue block62;
lbl322:
                // 2 sources

                var18_3 /* !! */  = (hi.a("G", (int)r.c(9038, 6354469735284896981L), (int)r.c(3611, 4057781018102061546L), (long)834203424483934088L) + r.c(31474, 7129496554106006894L) ^ r.c(1356, 4276596997355819537L)) + r.c(2509, 5077609987388792534L);
lbl323:
                // 2 sources

                if (!var2_2) continue block62;
lbl324:
                // 2 sources

                var18_3 /* !! */  = (r.c(30654, 2825798940819562578L) + r.c(30606, 758607879998775530L) ^ r.c(5415, 3440991314500436623L)) + r.c(10166, 7133747016131932170L);
                continue block62;
lbl326:
                // 1 sources

                v18 = r.c(31765, 4934638005201972163L) * r.c(13090, 910728811157382267L) ^ r.c(17650, 5763595303734809528L) ^ r.c(17117, 6452743745082365234L);
lbl327:
                // 2 sources

                var18_3 /* !! */  = (int)v18;
                if (!var2_2) ** GOTO lbl337
lbl329:
                // 2 sources

                var18_3 /* !! */  = (int)(hi.a("G", (int)(r.c(8611, 100865863937980038L) - r.c(3379, 3230384829107067606L)), (int)r.c(29368, 1616215899095213366L), (long)834203424483934088L) - r.c(4049, 947814807533541459L));
                if (!var2_2) ** GOTO lbl337
lbl331:
                // 2 sources

                v3 = (r.d("OSWeBVQn73rGihge", max(int int ), (int)r.c(9038, 6354469735284896981L), (int)r.c(3611, 4057781018102061546L)) + r.c(31474, 7129496554106006894L) ^ r.c(1356, 4276596997355819537L)) + r.c(2509, 5077609987388792534L);
lbl332:
                // 2 sources

                var18_3 /* !! */  = (int)v3;
                if (!var2_2) continue block62;
lbl335:
                // 2 sources

                var18_3 /* !! */  = r.c(25724, 6167879321149027297L) * r.c(20766, 5871183892829374388L) ^ r.c(11781, 4448040787133921565L) ^ r.c(9597, 6848601130293031483L);
                if (var2_2) ** GOTO lbl349
lbl337:
                // 3 sources

                switch (var18_3 /* !! */ ) {
                    case 742814920: {
                        hi.a("G", (int)-1, (boolean)true, (long)541412231224622628L);
                        hi.a("G", (long)357835453833397902L);
                        ** GOTO lbl55
                    }
                    default: {
                        ** continue;
                    }
                    case 742814922: 
                }
                var13_14 = 0;
                if (!var2_2) ** break;
                ** continue;
lbl349:
                // 2 sources

                var18_3 /* !! */  = (hi.a("G", (int)r.c(9038, 6354469735284896981L), (int)r.c(3611, 4057781018102061546L), (long)834203424483934088L) + r.c(31474, 7129496554106006894L) ^ r.c(1356, 4276596997355819537L)) + r.c(2509, 5077609987388792534L);
                if (!var2_2) continue block62;
lbl351:
                // 2 sources

                v4 = var18_3 /* !! */  = r.c(10665, 4082284133769215497L) + r.c(16646, 6759040271350535706L) - r.c(6229, 1784194737806266309L);
lbl352:
                // 2 sources

                if (!var2_2) continue block62;
lbl353:
                // 2 sources

                var18_3 /* !! */  = ((r.c(9133, 4910018161794806852L) ^ r.c(19064, 1759297718729907476L)) - r.c(10604, 71393516115689426L)) * r.c(17811, 2545606178557924083L) - r.c(32349, 7072778237703530823L);
                if (!var2_2) continue block62;
lbl355:
                // 2 sources

                v19 /* !! */  = (CallSite)(r.c(19242, 554750925257153775L) + r.c(24635, 7536860826994980785L) - r.c(20349, 5815545026430474474L));
lbl356:
                // 2 sources

                var18_3 /* !! */  = (int)v19 /* !! */ ;
                if (!var2_2) continue block62;
lbl358:
                // 2 sources

                var18_3 /* !! */  = (r.c(5044, 4322281519783986358L) ^ r.c(21155, 1781020459776050530L)) + r.c(8123, 5410859161261099173L) ^ r.c(19174, 8321071222821297610L);
                if (!var2_2) continue block62;
lbl360:
                // 2 sources

                var18_3 /* !! */  = r.c(19242, 554750925257153775L) + r.c(24635, 7536860826994980785L) - r.c(20349, 5815545026430474474L);
                continue block62;
                case 922132242: {
                    return;
                }
                case 922132245: 
            }
            break;
        }
    }

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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void f(Object[] var1_1) {
        block40: {
            var2_2 = var1_1[0];
            var3_3 = var1_1[1];
            var4_4 = Dl.t();
            var11_5 /* !! */  = (r.c(18477, 1089733753671720841L) - r.c(8419, 2335445608440034892L)) * r.c(22910, 8717504888992272081L) * r.c(31960, 6892334394857696213L) / 3 + r.c(8608, 3199513771412551179L);
            if (var4_4) ** GOTO lbl-1000
            v0 /* !! */  = var11_5 /* !! */ ;
            if (var4_4 != false) return;
            switch (v0 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var5_6 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1119095325570777413L), (long)588501882833882098L);
                    var6_7 = hi.a("G", (Object)new Object[]{(BlockPos)var2_2}, (long)763692859447227856L);
                    var7_8 = new BlockHitResult((Vec3)r.d("OSWeBVQn73rGihge", atCenterOf(net.minecraft.core.Vec3i ), (Vec3i)((BlockPos)var2_2)), (Direction)var6_7, (BlockPos)var2_2, false);
                    v1 = r.d("OSWeBVQn73rGihge", i(E ), (Dx)hi.a("\u00e9", (Object)this, (long)433427519838562534L), (Enum)hi.a("j", (long)1242535819607886805L));
                    if (var4_4) ** GOTO lbl147
                    if (v1 == false) ** GOTO lbl146
                    ** GOTO lbl149
                }
                case 1877898549: {
                    v0 /* !! */  = (int)hi.a("G", (long)411152158456204314L);
                    return;
                }
            }
lbl21:
            // 2 sources

            while (true) {
                v2 = 0;
                if (!var4_4) ** GOTO lbl98
lbl25:
                // 2 sources

                while (true) {
                    hi.a("G", (double)-5.0, (long)1327728264718092753L);
lbl28:
                    // 2 sources

                    while (true) {
                        block42: {
                            block41: {
                                v3 = var9_10 = v2;
                                if (var4_4) break block41;
                                if (v3 != 0) break block42;
                                v3 = var11_5 /* !! */  = (r.c(22335, 8430074233323159787L) + r.c(13169, 4018800651828651457L)) / 5 * r.c(29272, 6256152152886552024L) - r.c(1165, 2471741370310611790L);
                            }
                            if (!var4_4) break block40;
                        }
                        var11_5 /* !! */  = r.c(13915, 7160274077086146934L) * r.c(2825, 2655955220631051306L) ^ r.c(28756, 5935992865867179944L);
                        if (!var4_4) break block40;
                        ** GOTO lbl121
                        break;
                    }
                    break;
                }
                break;
            }
lbl39:
            // 2 sources

            while (true) {
                r.d("OSWeBVQn73rGihge", useItemOn(net.minecraft.client.player.LocalPlayer net.minecraft.world.InteractionHand net.minecraft.world.phys.BlockHitResult ), (MultiPlayerGameMode)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (InteractionHand)hi.a("j", (long)844572035549319610L), (BlockHitResult)var7_8);
                r.d("OSWeBVQn73rGihge", swing(net.minecraft.world.InteractionHand ), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (InteractionHand)hi.a("j", (long)844572035549319610L));
                v4 = var9_10;
                if (var4_4) ** GOTO lbl124
                if (v4 == 0) ** GOTO lbl123
                ** GOTO lbl125
                break;
            }
lbl47:
            // 3 sources

            while (true) {
                hi.a("G", (long)957299721117170898L);
                if (!var4_4) ** GOTO lbl153
lbl50:
                // 2 sources

                while (var4_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        hi.a("G", (int)r.d("OSWeBVQn73rGihge", p6(), (lz)((lz)var3_3)), (long)532165785136172044L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (Object)var7_8, (long)851891616776239775L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)1027340002540470646L);
                        hi.a("G", (long)767645364166240833L);
                        if (var4_4) {
                            return;
                        }
                        ** GOTO lbl158
                        break;
                    }
                }
                ** GOTO lbl156
                break;
            }
lbl61:
            // 4 sources

            while (true) {
                switch (var11_5 /* !! */ ) {
                    default: {
                        var8_9 = hi.a("\u00a5", (Object)((lz)var3_3), (long)1221194514962317539L);
                        v5 = var5_6;
                        v6 /* !! */  = var8_9;
                        if (var4_4) ** GOTO lbl79
                        if (v5 == v6 /* !! */ ) ** GOTO lbl77
                        ** GOTO lbl81
                    }
                    case -680486571: {
                        ** GOTO lbl-1000
                    }
                    case -680486572: {
                        hi.a("G", (long)369479218486228686L);
                        ** continue;
                    }
lbl77:
                    // 1 sources

                    v5 = hi.a("G", (int)(hi.a("G", (int)(r.c(14943, 9198787051302514065L) - r.c(6687, 8634047621531127179L)), (int)r.c(17667, 724078850710442546L), (long)834203424483934088L) + r.c(31869, 6268745441389357957L)), (int)r.c(21389, 1757276058163020859L), (long)834203424483934088L);
                    v6 /* !! */  = (CallSite)r.c(11291, 1238116269875624929L);
lbl79:
                    // 2 sources

                    var11_5 /* !! */  = (int)(v5 - v6 /* !! */ );
                    if (!var4_4) ** GOTO lbl82
lbl81:
                    // 2 sources

                    var11_5 /* !! */  = (hi.a("G", (int)r.c(16730, 2499027428759442989L), (int)r.c(2680, 8345798878579678419L), (long)834203424483934088L) ^ r.c(29400, 896372091763467600L) ^ r.c(2128, 7890330101015666597L)) + r.c(28504, 4587822781015833070L) + r.c(11822, 3491139706994588134L);
lbl82:
                    // 2 sources

                    v7 /* !! */  = var11_5 /* !! */ ;
                    if (var4_4) ** GOTO lbl96
                    switch (v7 /* !! */ ) {
                        default: {
                            v2 = 1;
                            var11_5 /* !! */  = (r.c(31586, 8147928984229719170L) + r.c(22333, 8415138282609573939L) ^ r.c(7199, 3758893129256946621L)) - r.c(14102, 5443959248277725601L);
                            if (!var4_4) ** GOTO lbl99
                            ** GOTO lbl98
                        }
                        case 1604901673: {
                            ** GOTO lbl21
                        }
                        case 1604901672: {
                            hi.a("G", (long)461891726241433586L);
                            v7 /* !! */  = -1;
                        }
                    }
lbl96:
                    // 2 sources

                    hi.a("G", (int)v7 /* !! */ , (boolean)true, (long)541412231224622628L);
                    ** continue;
lbl98:
                    // 2 sources

                    var11_5 /* !! */  = (r.c(16697, 2105578897709143740L) + r.c(23898, 3151616981733280434L) ^ r.c(25459, 3475588911299277930L)) - r.c(15880, 6242840318259227126L);
lbl99:
                    // 2 sources

                    switch (var11_5 /* !! */ ) {
                        case -1322739003: {
                            ** continue;
                        }
                    }
                    ** continue;
                    case -680486574: 
                }
                return;
            }
        }
        block33: while (true) {
            switch (var11_5 /* !! */ ) {
                default: {
                    hi.a("G", (int)var8_9, (boolean)true, (long)541412231224622628L);
                    if (!var4_4) ** GOTO lbl121
                    ** GOTO lbl39
                }
                case -197770776: {
                    ** continue;
                }
                case -197770779: {
                    v8 = var10_11 = hi.a("\u00a5", (Object)((Integer)r.d("OSWeBVQn73rGihge", z(), (XG)hi.a("\u00e9", (Object)this, (long)390311807938937169L))), (long)1260538186742955956L);
                    if (var4_4) ** GOTO lbl128
                    if (v8 <= 0) ** GOTO lbl127
                    ** GOTO lbl130
                }
                case -197770778: {
                    ** GOTO lbl50
                }
lbl121:
                // 2 sources

                var11_5 /* !! */  = (r.c(8271, 4433330900645214120L) + r.c(5603, 4492801427876037334L)) / 5 * r.c(10933, 7309443282744016223L) - r.c(16506, 8524219643429787641L);
                if (!var4_4) continue block33;
lbl123:
                // 2 sources

                v4 = var11_5 /* !! */  = (r.c(28971, 2078711839035631270L) / r.c(9413, 4682586844642931507L) * r.c(2632, 4297204274869591446L) ^ r.c(23860, 7481704434247666322L)) - r.c(17551, 8135398255215514466L);
lbl124:
                // 2 sources

                if (!var4_4) continue block33;
lbl125:
                // 2 sources

                var11_5 /* !! */  = r.c(27096, 3094269625565331075L) - r.c(505, 260973868386440848L) ^ r.c(878, 5163083226032034851L);
                continue block33;
lbl127:
                // 1 sources

                v8 = r.d("OSWeBVQn73rGihge", max(int int ), (int)hi.a("G", (int)(r.c(7330, 393877114736331731L) + r.c(6207, 6937562401778454444L)), (int)r.c(20121, 3059558534819813685L), (long)834203424483934088L), (int)r.c(11381, 2749324985636748098L)) - r.c(2538, 6362321271426571886L) + r.c(28909, 3301178231487932339L);
lbl128:
                // 2 sources

                var11_5 /* !! */  = (int)v8;
                if (!var4_4) ** GOTO lbl132
lbl130:
                // 2 sources

                var11_5 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)r.c(1947, 4969975861081362654L), (int)r.c(32367, 933804928583084371L), (long)834203424483934088L) + r.c(25539, 2112186297729430552L)), (int)r.c(13427, 4277668777292358606L), (long)834203424483934088L) - r.c(20524, 7924899375031322399L) + r.c(30118, 9094959425128932085L));
                if (var4_4) ** GOTO lbl151
lbl132:
                // 2 sources

                switch (var11_5 /* !! */ ) {
                    default: {
                        hi.a("\u00f2", (Object)this, (boolean)true, (long)765716040858293100L);
                        hi.a("\u00f2", (Object)this, (int)var10_11, (long)675223623661782433L);
                        hi.a("\u00f2", (Object)this, (int)var5_6, (long)1164218155521350028L);
                        if (!var4_4) ** GOTO lbl151
                        ** GOTO lbl47
                    }
                    case -1304381237: {
                        ** GOTO lbl47
                    }
                    case -1304381238: {
                        hi.a("G", (long)397471851942621184L);
                        if (var4_4) break;
                        ** continue;
                    }
                }
lbl146:
                // 2 sources

                v1 = r.d("OSWeBVQn73rGihge", max(int int ), (int)r.c(12123, 6489575178176919745L), (int)r.c(1062, 4494179549586051937L)) - r.c(2150, 1665441441367941045L) + r.c(10859, 4403162684672343402L);
lbl147:
                // 2 sources

                var11_5 /* !! */  = (int)v1;
                if (!var4_4) ** GOTO lbl61
lbl149:
                // 2 sources

                var11_5 /* !! */  = (int)(hi.a("G", (int)(r.c(10975, 7140397516613614850L) / r.c(23214, 3949417774482852895L)), (int)r.c(32566, 7833365123266619467L), (long)834203424483934088L) + r.c(24910, 7157755804437362316L));
                ** GOTO lbl61
lbl151:
                // 2 sources

                var11_5 /* !! */  = (r.c(20445, 7160878569195214930L) / r.c(10202, 2956185259312443397L) * r.c(11977, 7612298080646494620L) ^ r.c(11999, 3585887907826334038L)) - r.c(26340, 7385732356727419328L);
                if (!var4_4) continue block33;
lbl153:
                // 2 sources

                var11_5 /* !! */  = (r.c(20445, 7160878569195214930L) / r.c(10202, 2956185259312443397L) * r.c(11977, 7612298080646494620L) ^ r.c(11999, 3585887907826334038L)) - r.c(26340, 7385732356727419328L);
                if (var4_4) ** break;
                continue block33;
lbl156:
                // 2 sources

                var11_5 /* !! */  = (int)(r.d("OSWeBVQn73rGihge", max(int int ), (int)((r.c(27520, 1747801110086696068L) + r.c(28351, 5626920124517923305L) ^ r.c(16202, 1006570785220257885L)) * r.c(15167, 718652880747129936L)), (int)r.c(26642, 4720542397719527273L)) - r.c(17032, 3268403714072286552L));
                if (!var4_4) ** GOTO lbl61
lbl158:
                // 2 sources

                var11_5 /* !! */  = (int)(hi.a("G", (int)((r.c(21588, 3831781912472683468L) + r.c(16134, 3544750849765468276L) ^ r.c(31395, 5838773098637700424L)) * r.c(25753, 1961285122814653400L)), (int)r.c(29176, 8205664944377341763L), (long)834203424483934088L) - r.c(6773, 5082158505612529138L));
                ** continue;
                case -197770777: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[7];
                        var11_1 = 0;
                        var10_2 = "L\u00f1\u0088\u00b0\u0011\u00e4\u0006\u00d2\u0098g\u0093E:\u000e\u00c8\u00ef$}-\u00eb\u0092\u00feP~=\u00b4\u00dc\u0099\u0005\u00c4yi\u00e4\u0092\u0005\\\u00b0\u00ac_t";
                        var12_3 = "L\u00f1\u0088\u00b0\u0011\u00e4\u0006\u00d2\u0098g\u0093E:\u000e\u00c8\u00ef$}-\u00eb\u0092\u00feP~=\u00b4\u00dc\u0099\u0005\u00c4yi\u00e4\u0092\u0005\\\u00b0\u00ac_t".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 1;
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
                            var10_2 = "i\u000e\u0012}>\u00c5\u0016Nr\u0081Y`\u00dd0\u00bc\u000f1\u00c3\u0013bQf(>0\u00e86\u008ey/\u00c4";
                            var12_3 = "i\u000e\u0012}>\u00c5\u0016Nr\u0081Y`\u00dd0\u00bc\u000f1\u00c3\u0013bQf(>0\u00e86\u008ey/\u00c4".length();
                            var9_4 = 15;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 49;
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
                                    v15 = 9;
                                    break;
                                }
                                case 1: {
                                    v15 = 65;
                                    break;
                                }
                                case 2: {
                                    v15 = 81;
                                    break;
                                }
                                case 3: {
                                    v15 = 106;
                                    break;
                                }
                                case 4: {
                                    v15 = 44;
                                    break;
                                }
                                case 5: {
                                    v15 = 12;
                                    break;
                                }
                                default: {
                                    v15 = 6;
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
                r.a = var13;
                r.b = new String[7];
                var0_7 = 5223535376146786115L;
                var6_8 = new long[284];
                var3_9 = 0;
                var4_10 = "\u0019\u00efo\u00a7b\u0099qc\u00a6\u0086\u00c9\u0095d\u00e9h\u00c1\u00ad\u00f9\u0003,\u0005\u00c8\u00bc<>m\u00e5\u00e2\u0014\u00b5\u00c6\u0093\u009c?(\u00b9\u001bs\u00dd\u00ce\u0006\u0097-\u00a8e\u00fb\u00a5t\u00ac\u000b\u000eJ\u009c\u00ea-\u00a6g\u008e\u00b4\u008e\u0010|M\u009d\u00d1OiwP\u009b\u009b\u00da\u00f5\u009b\u00fd\u00bf\u008a\u00c3\u00d02N\u00d9\u00ae\u00b9\u0088\u0002\bl\u00fcz\u0016\u00e2\u00af3ID\u00e4&\u001bD\u00cbp\u0002K1\u00af\u00d0\u00b8\u00b1\u009d\u0012\u007f\u009b\u00d4\u0089\fkT\u0013@\u001a\u00desu\t\u00e32\u0093\u00c2\u00a8\u008a\u009f\u00b5EK\u001a.s\u00ef\u00f9\u0092\u00fc\u00ddT\u00af\u00f1\u00e0\u00cf\u00c5\u00fd`\u001c\u00f0r\u00ca\u00b4\u0083\r\u001f\u00e5\t\u0099L\u008c\u0092\u00e7\u0006\n\u008c\u00f7\u00da\u009fS\u00fe/\u00f2\u00d6\u00c5\u00b4{\u00d6\u0098DhQ\u001fP[`uL\u000b\u00d1d*}\u0015\u0084q\u0094\u0016nJ {{M\u0090qK\u00e2U\u00e3T\u00874\u00ff\u0011\u0002\u00f9N\u0012q\u0016m\u00b5}\u0016?\u00a24Z\u00a7as\u0002\u00b0\u00c1HT\u00f0\u00f5\u00b4\u00e9\u0082T\u0082\u00b0\u00d4\u008b\u00e0\u00f4\u0000\t6\u008bj\u00d9Z\u00b9r\u00b5\u00c0&\u00f7k\u009a&O.\u008b@\u009a\u00e9M\u00d4\u00a9\u00de\u0099\u0010\u00db6\u00c9\u008aHP[\u001cX\u009c\u00e5\u0087\u00eb\u00ac\u00c6\u00bf\u00be\u0002\u00f3<\u00a7\u00c03Ha&\u009f\u00acoq`AkFiC\u0086\u0081\u00ff'}\u00c5\u00d4Z\u00c5k\u00e9\u00b2\u00c3\u0012\u00ddJq\u0001\u0006\u0091A\u001d`j\b\u00bd\u00e3?\u00cb\u0087\\\u00e5\u00e7\u0006\u0004T\u001c\u009d\u00f3\u00df\u009f\u00a2\u00d2\u00f2\u0005NT\u000e\u0081\u00a2\u00ba\u00b2\u00d1\u00caV\u00b57\u008aU\u00bc\u00ea&\u00d50C\u00d6>\u009d\u00a9\b\u0090\u00c0\u00e7\u00fb\u00a2j=\u0010\u00c2.)\u00c3\u00f1t\u00da\u00a86qv\u00e2\u00a7\u009a+\u00c2b\u0091\u0019\u00d0\u0013\u00dfV{\u00fd\u001a0\u00abz\u00fe]\u00e3\u0085J\u00d9\u0091=&\u00abd\fL\u00e5s\u00dc&\u00dc\u000b\u0080\u00d5\u00c9\u0019\u0083\u00d2\u00e1\u0017g\u0005\u00f2\u008b=t*\u00e3\u0007Zx\u00a0\u0012H\u00b1\u00e2\u00e1ws$\u0096\u009a\u00d0\u00b560x,\u00b23\u00f5\t\u008fBi\u0004\u00d8\u00e0\u00ea\u008a\u00d0\u00f0\u00d5S\u00f8\u00b0\u00db\u00b7\u00f2\u00df\u00e2\u00c0\u001f\b\u00b3$z\u00c1\u00d3\u00e3RF\u00c1r\u009c\u00d9\u00d2\u00a5\u00df\u0005\u00c7\u00ad\u0002%a\u0014i\u00e151Q\u00b1p\u0087\u0089\u00ad\u00fd\u00af\u00a7\u00be\u00e77\u0086\u00e8\u00e9Z\u00824\u00d7\u00fe\u0097\r\u00c93\u00ef\u009a\\\u0099b\u0092\u00f0\u00f8\u00e0$\u00eb\u00d8\u00809R\u0084}K\u00ef\u001cxe\u0096\u00cbB\u0097as\u00ae\u00f1p\u00ba\u000b\u00af\u00e8\u008dA\u009f\u00ef8\u009e\u00db\u00cdn\u00b0\u0011!1\u00fe7\u00f9}\u00f2Q\u0093\u00c2L\u00ab\u0004\u00ef`x\u00bbQ\u0011\u0001\u008dv@\u0016\u0011\u001bw\"\u00c61\u0094wb\u0000\u00d5\u00af\u00fd>\u00de\f\u00cf\u008c\u00f0t\u001e_\u0014\u00b86s\u00e2\u00ceH\u0099\u000f,0\u000f\u00ef\u0006:\u00c0e\u00f3\u00c4:\u00cb8:\u00a0\u00b5OH\u00f4y\u00bd/*\u00a0\u00d0j\u00c8cF%\u009b\u009e\u00f3\u00c9}`\u00d9N\u00da4\u00f4\u00aa\u00cc\u0096\u008e\u00ef\u00a1\u008f\u0091\u00c9\u00db\u00d3[\t\u00cf\u00c2\u008e\u009e\u00c3\u00b2\u0011Z9\u001a[\u00a1\u00d1dhg\f=\u0017Y/\u00ad\u0096\u0080\u00a5L\u0098\u00fd\u00c2\u00a2\u00ff^\u00a0\u0003\u00d6.\u0099\u00c0\u0017\u00c79e\u008f|\u0093\u0001\u00a8\u00a4\u00f2g4\u00e7:\u001f\u00d72Q\u0095\u00c4\u00c8\u0005B\u0017\u00aa\u0013\u0094cP\u009a\u000f\u00a5~a\u008d9\u00ed\u0096\u008f\u00d4\u000fz*\u0005\u000fkS\u0082o\u0081$ \u00d6\u00c6\u00a6\u00e0\u0007=!\u00d6H+\u0088O\u00b0\t\u00ca;>\u00a0\u0005=\u00a6\u00c8\u0095\u00ceh)\u00a2\u00c2iz\u0017A\u00b1\u00e9\u00c4\u0097\u00a7x\n\u00ec\u0004pW\u0014k\u00f9\u0007\u000f\u0017t\b\u00f4\u0005\u00e0\u00f2I\u00111\u007f\u00ea\u00e3If\u00a9\u00fdo?\u00b9\u00d9\u008fb\u0087\u00eagV$B\u00d0\u00fe\u0084!\u000e\u00b0\u00f0\u0006d+j4\u0000A\u00bd\u0095\u00ad\u00a0\u000b(\u00feK\u00d3\u00b1\u008f%Q\u0000\u009bR\u0000@\u00ca`+\u00f9\u0006IO\u0019#\u00a2_\u00f4\u00d8\u00b8\u0085%_\u0096L\u008aV\u001f\u0099\u001dp\u001fV\u00e6\u00f9\t\u00d6\u00b4\u00eb\u0003&\u00ef\u0000\u00c4\u00cc\u00d9\u00e4;/\u00cb\u0015\u00b6\u00db\r\u00c5\u00f2S\u00ba+\u00ff\u0091\u00d8\u0005j\na\u008b\u0081X\u001d0\u00f6m\u00d2\u00f2O_\n\u00c4\u00b2\u00b9p\u0080?tp&\u00f6\u0084\u0082?~yq\u0005+8\u00e7\u008c[O\u009a\u00c7\u0013r\u00d1&x\u00b9\u00a2\u00b3Yx\u00c1\u00c7Y\u0007)\u00a1a\u00e5H\u008a\u00ed\u00daV\u00d1\u00fbW\u0011\u00ef\u0084;&Z\u00d7v\u00d9\u00ccU\u00a7C\u00b1\u00ca\u00e2\u00a1Y\u00ce!\u0010\u001f\u00bef#\u00a2\u00fc\u00c2\u00af5\u0003\u00d8y\u00f8\u00e0E\u0000(7\u00d7\u0098\u0012\u008aQ:r\u00f5N\u00b0D9\u009d\u0001\u001cy\u00d0\u001b\u0014N\u00b2m\u0098_b\u000e\u0086y\u00b2\u00cb\u0015\u00abt\u00d852\u00b1\u009d\u00dci\u00da\u0091\u00bd~\u0089{\u00fd)l{cy\u00069C,L\u008a\u00bb\u00ef\u00de\u0001\u00a5Gy\u0011i\u00b8\u00fe\u008a\u008e\u007f\u0006\u00e3\u001fl\u00ad\u00c6_Y\u001c\u0099\u00fdW\u009an\u00c6\u0092\u00f9\u00867\u0083t\u00cd\u00e8\u0093(\u00ae\u0093\u00f5\u00fe|\u00e6\u00e98\u00e2\u00f8\u00c7\u00a0\u00a37\u00b2\u00a1W\"\u00e9:oZ\u0097\"m\u009c\u0010\u0010\u00eb\\'*n\u0096\u00eer\u001f\rF\u0095\u0085\r\u00f3\u00a0\u00bd\u00e2\u00cen\\\u00f2\u00b9\u00a3\u0093\u0003\u009bgi\u000f#Q\u0090^\u0014!u\u00f8\u0012\u00df\u009bz\u00b6\u00ban\u009euo\u00f6Z\u0086x[\u00ddj*y7<Qb\u009f\u00a7\u00ceZ\u00eeP\u00a9\u00dcL\u0099fY\u00ba[F\bKj\u0093\u00acy1\u0098\u00ac~\u00d6\u009aC/\u00a3\u0002{\u00b5h\u0084\u001e\u0017x\u00e3\\\u00df\u00e7\u0012$\u001e\u008a,Qv\u00ca\u009f\u000f\u00cco\u008ep\u001c\u00f98\u00d0\u001d\u00861\u00fcW\u00f4QG\u009b\u00e5\u00d9\u0098w\u00eb0\u008f\u00c5\u001a\u00f3\u00f2K{\u00cf\u00f679\u00f4\u001d\u00f2\u00e6\u00bf\u00fc\u00bb\u00acDv\u00d0\\z_\u0090B\u0098\u0084]\u000f\u0012\u00ad;*@\u0090\u00ab&\u001c{@\u00bf\u00ccm\u00db\u001c\u009aD\u00c5\u00ac\u0003\u00dd\u00cd'\u00bba\u00c9^2me\u0098\u00d0\u00bf\u00a9>\u00eb8\u00f8\u00fa\u001b@\u009epZt\u0089ha\u00a4\u00e2P\r\u00c5\u00f5\u00c5\u0016\u009b\u0091u\u001b2\u009f(\u00ecE\u0082\u009aB\u00a8\u00b2}.\u0085\u0005\u0096\u008a{sA\u00ea\u00a8ovAv?\u00cb\u000e/\u0015\u00a0\u00c9\u00bc\u00c31\b\u00b0\u00ae\u001e9\u008bZ\u00ca~\u00f3\t\u00e2\u00bb\tU1\u009b\u00f0E\u00e7[e\u00ec\u0001\u00e5\u00ee\u00ff\u0012\u0005\u0000\u00f0}\u00f8\u00eaO\n\u001cU\u00b9\u00c5\u001d\u001e\u00a6a\u0096\u00f9\u00c7\u0012\u00b1\u0007\u00c6\u007fn\u00fd\u0012\u00c2=\u00ca\u00e1\u0016\u00cb\u009d\u00f3\u00fa\u00ffVt\u00c4\u00c9\u00bb\u00cd \u00a5\u00e5\u00d4H;\u00b6\u00b8\u0010\u008eROj\u00a7\u00f4[:\u00d7\u00ba\b\u00c4\u0091|\u009cG\u0004\u00f7\u00c8>!\u00cc\u0018\u00958\u00de\u00aa\u0095^b\u00ba1u@\u00d1\u00df\u00e8\u00e5,\u00cc\u00ae\u0096\u00b4\u00ef\u00db\u00f5M\u00d7\u0004\u00ca\u00a9\u00dbA\u0015\u00fa\u009e\u00ed\u000b\u00efP3,>\u0089sL\u0004pS\u0095O\u00d0M+/\u00a55&\u00cc\u00b4*\u00bc\u00dd\u00f7\u0099ow`\u00a3\u000b\u00c8\u001e\u0097\u0090\u001f\u0092\u00c8\u0019\u00f1\u00dd\u008f\u00fe(<\u008b\u0082\rTC_[\u00b6\u00d5z\u00dehe\u0016\u00ba\u00f7\u00c9H\u00e4\u00c3yEEx\u0097)\u008d:d\u00acl\u00abI\u00a3\u001b`\u00b8\u0014\u008c\rj\u00db\u00ddzZ\u00ab\u009aI\u008d>f\u0018a\u00d7\u00ac\u0085s\u0012\b\u0095.\u00d8\u001e\u008e=$eh(\u007f\u00b8\u009a\u00bf\u00c2\u00be\u0011u\u0087\u00b5(+;?\u00ee\u00a0,\u00d5S\u008f\u00f1`\u0096\u00b9\u00e3\u00ccq\u008a\u0007\u0091\u00a4\u00eb\f\u001d.\u00c8\u00a1{\u0002\u0080}\u0096Q\u001f\u00e2J\u00a6\u008e\u00ca\u0013\u00fcw\u00b1\u001b\u0095,XD\u00a4\u009f\u00e0)[X\u00bc|4\u00edpTm\u0018\u00e5\u00ea\u00aa\u00e6D\u00cd\u00c37\u008f\u009b$\u00f7\u0012\u00b6\f\u00d1\u009e\u00d1f\u00c6\u000e\u00dbdW\u00de\u0010^p\u0089\u00d6\u0011\ny\f\u000eaw\u0089p,\u0006\u00d6\u0088\u0087E\u00ae%\u008c\u007fk\u00d3\u00dc\u00baOvb\u0010\u00b9\u00dce\u00a0\u00d3\u00a4\u00c8\u00a7\u00dd\u00b9\u00a6\u0087O\u00fa\rrn\u0096\u00b5E\r\u00f9\u0019f\u0089\u00a8f;a\u00dc\u00d2r\u009c\u00f37\u00aa]+\u00d2d8RM\u001f\u00cb\u00a5\u00b5\u00e5\u00cba\u00cd,\u001c\u00adpl\u00d8\u00a7.Q~\u00b1\u00c4\u001d@\u0019\u00d2,6&\u0004\u001d\u00f5\u00bc\u0086H\u00bb\u00bf>\u0005\u008a\u00bc\"\u00a9\u0015\u00b7:o\u000b\u00c7\u0098\u0089z\u00ca\u009be\r\u00ad``\u0086I\u00a7\u00c6 B\u00e8\u00d1\u0015`\u00f6\u00a8\u00b4\u00f4\u00d3\u0017\u001c\u00f83\u00bb\u00b0~\u008aj\u00e2*\u0004\u001e\u000bA\u0007x\\j.8\u001fz\u00bf<\u00b7\u00a76\u00a6P\u00f7\u00cd\u00e0X\u00ae\u000b%\u0013O\u00e5z!\u00b1(I\u00c2\nn\u00ae\u0093\u00b0F\u00ed5n\u00bd5\u00a8\u00f3c\u008e,\u001d\u009bFE\u00e49K\u0086_\u00e8\u00f4\u0095{Y\u009bq\u00a1#$\u0097\u00e8\u0098+\u001c\u0084\u00cb\u0015\u0081[\u00aa\u0091\u00ffRD\u0081\u00e0X\u0015\u00f4 \u00d6\u00d0#g\u00faH\u0015\u008af\u00a1k\u008ba\u00f6\u00cf\u00b8\u00a3B\u009e\u00e8\rt\u009a\u00f1>x\u008e#\u00ee\tj0a_\u0097\u00a0\u0019\u0085\u001c}a+\u00bcS\u009eg\u00d2%\u00d4\u00bf\u00ffN\u00e0\u00f6\u00f94\u0004\u00ed8\u0014\u00e0n\u0000\u00b6ZC\u00bb@kW-e\u0088<P\u00ad\u00b3\u00ef\u00b3\u007fZ\u0087>+-\u00e9E\u00ecX\u00ad\u00d5\u0006\u0007\u00b0\u00b59\u00e0\u00f5\u0097\u001f\u000e\u00caR\u00c6\u0015\u00ae\b*\u00b5\u008a\u0003\u00fb\u00e6\u00ee\u00a1\u00c0\u0088n\u00d5V\n\u009b\u00bb\u008b\u00ff\u00a8\u00dc3\u001e\u0096\u00e6\u00f0\r\u00cbI\u00f9\u00cea\u0082s\u0087\u0098\u008c\u0088:\u00e2\u0018\u00fa\u0017\u0015\u00deC\u00aeV>m\u0083T\u00ecF\u00d2\u00e2/\u00d3a\u00a5\u007fH#\u0097-}\u00b7c\u0094\u00e6P\u00a4t!\u00d7\u00b42\u008deK5V\u0000\u009b\u00c6\u00f1\u00a2\u0018>f\u00c7M";
                var5_11 = "\u0019\u00efo\u00a7b\u0099qc\u00a6\u0086\u00c9\u0095d\u00e9h\u00c1\u00ad\u00f9\u0003,\u0005\u00c8\u00bc<>m\u00e5\u00e2\u0014\u00b5\u00c6\u0093\u009c?(\u00b9\u001bs\u00dd\u00ce\u0006\u0097-\u00a8e\u00fb\u00a5t\u00ac\u000b\u000eJ\u009c\u00ea-\u00a6g\u008e\u00b4\u008e\u0010|M\u009d\u00d1OiwP\u009b\u009b\u00da\u00f5\u009b\u00fd\u00bf\u008a\u00c3\u00d02N\u00d9\u00ae\u00b9\u0088\u0002\bl\u00fcz\u0016\u00e2\u00af3ID\u00e4&\u001bD\u00cbp\u0002K1\u00af\u00d0\u00b8\u00b1\u009d\u0012\u007f\u009b\u00d4\u0089\fkT\u0013@\u001a\u00desu\t\u00e32\u0093\u00c2\u00a8\u008a\u009f\u00b5EK\u001a.s\u00ef\u00f9\u0092\u00fc\u00ddT\u00af\u00f1\u00e0\u00cf\u00c5\u00fd`\u001c\u00f0r\u00ca\u00b4\u0083\r\u001f\u00e5\t\u0099L\u008c\u0092\u00e7\u0006\n\u008c\u00f7\u00da\u009fS\u00fe/\u00f2\u00d6\u00c5\u00b4{\u00d6\u0098DhQ\u001fP[`uL\u000b\u00d1d*}\u0015\u0084q\u0094\u0016nJ {{M\u0090qK\u00e2U\u00e3T\u00874\u00ff\u0011\u0002\u00f9N\u0012q\u0016m\u00b5}\u0016?\u00a24Z\u00a7as\u0002\u00b0\u00c1HT\u00f0\u00f5\u00b4\u00e9\u0082T\u0082\u00b0\u00d4\u008b\u00e0\u00f4\u0000\t6\u008bj\u00d9Z\u00b9r\u00b5\u00c0&\u00f7k\u009a&O.\u008b@\u009a\u00e9M\u00d4\u00a9\u00de\u0099\u0010\u00db6\u00c9\u008aHP[\u001cX\u009c\u00e5\u0087\u00eb\u00ac\u00c6\u00bf\u00be\u0002\u00f3<\u00a7\u00c03Ha&\u009f\u00acoq`AkFiC\u0086\u0081\u00ff'}\u00c5\u00d4Z\u00c5k\u00e9\u00b2\u00c3\u0012\u00ddJq\u0001\u0006\u0091A\u001d`j\b\u00bd\u00e3?\u00cb\u0087\\\u00e5\u00e7\u0006\u0004T\u001c\u009d\u00f3\u00df\u009f\u00a2\u00d2\u00f2\u0005NT\u000e\u0081\u00a2\u00ba\u00b2\u00d1\u00caV\u00b57\u008aU\u00bc\u00ea&\u00d50C\u00d6>\u009d\u00a9\b\u0090\u00c0\u00e7\u00fb\u00a2j=\u0010\u00c2.)\u00c3\u00f1t\u00da\u00a86qv\u00e2\u00a7\u009a+\u00c2b\u0091\u0019\u00d0\u0013\u00dfV{\u00fd\u001a0\u00abz\u00fe]\u00e3\u0085J\u00d9\u0091=&\u00abd\fL\u00e5s\u00dc&\u00dc\u000b\u0080\u00d5\u00c9\u0019\u0083\u00d2\u00e1\u0017g\u0005\u00f2\u008b=t*\u00e3\u0007Zx\u00a0\u0012H\u00b1\u00e2\u00e1ws$\u0096\u009a\u00d0\u00b560x,\u00b23\u00f5\t\u008fBi\u0004\u00d8\u00e0\u00ea\u008a\u00d0\u00f0\u00d5S\u00f8\u00b0\u00db\u00b7\u00f2\u00df\u00e2\u00c0\u001f\b\u00b3$z\u00c1\u00d3\u00e3RF\u00c1r\u009c\u00d9\u00d2\u00a5\u00df\u0005\u00c7\u00ad\u0002%a\u0014i\u00e151Q\u00b1p\u0087\u0089\u00ad\u00fd\u00af\u00a7\u00be\u00e77\u0086\u00e8\u00e9Z\u00824\u00d7\u00fe\u0097\r\u00c93\u00ef\u009a\\\u0099b\u0092\u00f0\u00f8\u00e0$\u00eb\u00d8\u00809R\u0084}K\u00ef\u001cxe\u0096\u00cbB\u0097as\u00ae\u00f1p\u00ba\u000b\u00af\u00e8\u008dA\u009f\u00ef8\u009e\u00db\u00cdn\u00b0\u0011!1\u00fe7\u00f9}\u00f2Q\u0093\u00c2L\u00ab\u0004\u00ef`x\u00bbQ\u0011\u0001\u008dv@\u0016\u0011\u001bw\"\u00c61\u0094wb\u0000\u00d5\u00af\u00fd>\u00de\f\u00cf\u008c\u00f0t\u001e_\u0014\u00b86s\u00e2\u00ceH\u0099\u000f,0\u000f\u00ef\u0006:\u00c0e\u00f3\u00c4:\u00cb8:\u00a0\u00b5OH\u00f4y\u00bd/*\u00a0\u00d0j\u00c8cF%\u009b\u009e\u00f3\u00c9}`\u00d9N\u00da4\u00f4\u00aa\u00cc\u0096\u008e\u00ef\u00a1\u008f\u0091\u00c9\u00db\u00d3[\t\u00cf\u00c2\u008e\u009e\u00c3\u00b2\u0011Z9\u001a[\u00a1\u00d1dhg\f=\u0017Y/\u00ad\u0096\u0080\u00a5L\u0098\u00fd\u00c2\u00a2\u00ff^\u00a0\u0003\u00d6.\u0099\u00c0\u0017\u00c79e\u008f|\u0093\u0001\u00a8\u00a4\u00f2g4\u00e7:\u001f\u00d72Q\u0095\u00c4\u00c8\u0005B\u0017\u00aa\u0013\u0094cP\u009a\u000f\u00a5~a\u008d9\u00ed\u0096\u008f\u00d4\u000fz*\u0005\u000fkS\u0082o\u0081$ \u00d6\u00c6\u00a6\u00e0\u0007=!\u00d6H+\u0088O\u00b0\t\u00ca;>\u00a0\u0005=\u00a6\u00c8\u0095\u00ceh)\u00a2\u00c2iz\u0017A\u00b1\u00e9\u00c4\u0097\u00a7x\n\u00ec\u0004pW\u0014k\u00f9\u0007\u000f\u0017t\b\u00f4\u0005\u00e0\u00f2I\u00111\u007f\u00ea\u00e3If\u00a9\u00fdo?\u00b9\u00d9\u008fb\u0087\u00eagV$B\u00d0\u00fe\u0084!\u000e\u00b0\u00f0\u0006d+j4\u0000A\u00bd\u0095\u00ad\u00a0\u000b(\u00feK\u00d3\u00b1\u008f%Q\u0000\u009bR\u0000@\u00ca`+\u00f9\u0006IO\u0019#\u00a2_\u00f4\u00d8\u00b8\u0085%_\u0096L\u008aV\u001f\u0099\u001dp\u001fV\u00e6\u00f9\t\u00d6\u00b4\u00eb\u0003&\u00ef\u0000\u00c4\u00cc\u00d9\u00e4;/\u00cb\u0015\u00b6\u00db\r\u00c5\u00f2S\u00ba+\u00ff\u0091\u00d8\u0005j\na\u008b\u0081X\u001d0\u00f6m\u00d2\u00f2O_\n\u00c4\u00b2\u00b9p\u0080?tp&\u00f6\u0084\u0082?~yq\u0005+8\u00e7\u008c[O\u009a\u00c7\u0013r\u00d1&x\u00b9\u00a2\u00b3Yx\u00c1\u00c7Y\u0007)\u00a1a\u00e5H\u008a\u00ed\u00daV\u00d1\u00fbW\u0011\u00ef\u0084;&Z\u00d7v\u00d9\u00ccU\u00a7C\u00b1\u00ca\u00e2\u00a1Y\u00ce!\u0010\u001f\u00bef#\u00a2\u00fc\u00c2\u00af5\u0003\u00d8y\u00f8\u00e0E\u0000(7\u00d7\u0098\u0012\u008aQ:r\u00f5N\u00b0D9\u009d\u0001\u001cy\u00d0\u001b\u0014N\u00b2m\u0098_b\u000e\u0086y\u00b2\u00cb\u0015\u00abt\u00d852\u00b1\u009d\u00dci\u00da\u0091\u00bd~\u0089{\u00fd)l{cy\u00069C,L\u008a\u00bb\u00ef\u00de\u0001\u00a5Gy\u0011i\u00b8\u00fe\u008a\u008e\u007f\u0006\u00e3\u001fl\u00ad\u00c6_Y\u001c\u0099\u00fdW\u009an\u00c6\u0092\u00f9\u00867\u0083t\u00cd\u00e8\u0093(\u00ae\u0093\u00f5\u00fe|\u00e6\u00e98\u00e2\u00f8\u00c7\u00a0\u00a37\u00b2\u00a1W\"\u00e9:oZ\u0097\"m\u009c\u0010\u0010\u00eb\\'*n\u0096\u00eer\u001f\rF\u0095\u0085\r\u00f3\u00a0\u00bd\u00e2\u00cen\\\u00f2\u00b9\u00a3\u0093\u0003\u009bgi\u000f#Q\u0090^\u0014!u\u00f8\u0012\u00df\u009bz\u00b6\u00ban\u009euo\u00f6Z\u0086x[\u00ddj*y7<Qb\u009f\u00a7\u00ceZ\u00eeP\u00a9\u00dcL\u0099fY\u00ba[F\bKj\u0093\u00acy1\u0098\u00ac~\u00d6\u009aC/\u00a3\u0002{\u00b5h\u0084\u001e\u0017x\u00e3\\\u00df\u00e7\u0012$\u001e\u008a,Qv\u00ca\u009f\u000f\u00cco\u008ep\u001c\u00f98\u00d0\u001d\u00861\u00fcW\u00f4QG\u009b\u00e5\u00d9\u0098w\u00eb0\u008f\u00c5\u001a\u00f3\u00f2K{\u00cf\u00f679\u00f4\u001d\u00f2\u00e6\u00bf\u00fc\u00bb\u00acDv\u00d0\\z_\u0090B\u0098\u0084]\u000f\u0012\u00ad;*@\u0090\u00ab&\u001c{@\u00bf\u00ccm\u00db\u001c\u009aD\u00c5\u00ac\u0003\u00dd\u00cd'\u00bba\u00c9^2me\u0098\u00d0\u00bf\u00a9>\u00eb8\u00f8\u00fa\u001b@\u009epZt\u0089ha\u00a4\u00e2P\r\u00c5\u00f5\u00c5\u0016\u009b\u0091u\u001b2\u009f(\u00ecE\u0082\u009aB\u00a8\u00b2}.\u0085\u0005\u0096\u008a{sA\u00ea\u00a8ovAv?\u00cb\u000e/\u0015\u00a0\u00c9\u00bc\u00c31\b\u00b0\u00ae\u001e9\u008bZ\u00ca~\u00f3\t\u00e2\u00bb\tU1\u009b\u00f0E\u00e7[e\u00ec\u0001\u00e5\u00ee\u00ff\u0012\u0005\u0000\u00f0}\u00f8\u00eaO\n\u001cU\u00b9\u00c5\u001d\u001e\u00a6a\u0096\u00f9\u00c7\u0012\u00b1\u0007\u00c6\u007fn\u00fd\u0012\u00c2=\u00ca\u00e1\u0016\u00cb\u009d\u00f3\u00fa\u00ffVt\u00c4\u00c9\u00bb\u00cd \u00a5\u00e5\u00d4H;\u00b6\u00b8\u0010\u008eROj\u00a7\u00f4[:\u00d7\u00ba\b\u00c4\u0091|\u009cG\u0004\u00f7\u00c8>!\u00cc\u0018\u00958\u00de\u00aa\u0095^b\u00ba1u@\u00d1\u00df\u00e8\u00e5,\u00cc\u00ae\u0096\u00b4\u00ef\u00db\u00f5M\u00d7\u0004\u00ca\u00a9\u00dbA\u0015\u00fa\u009e\u00ed\u000b\u00efP3,>\u0089sL\u0004pS\u0095O\u00d0M+/\u00a55&\u00cc\u00b4*\u00bc\u00dd\u00f7\u0099ow`\u00a3\u000b\u00c8\u001e\u0097\u0090\u001f\u0092\u00c8\u0019\u00f1\u00dd\u008f\u00fe(<\u008b\u0082\rTC_[\u00b6\u00d5z\u00dehe\u0016\u00ba\u00f7\u00c9H\u00e4\u00c3yEEx\u0097)\u008d:d\u00acl\u00abI\u00a3\u001b`\u00b8\u0014\u008c\rj\u00db\u00ddzZ\u00ab\u009aI\u008d>f\u0018a\u00d7\u00ac\u0085s\u0012\b\u0095.\u00d8\u001e\u008e=$eh(\u007f\u00b8\u009a\u00bf\u00c2\u00be\u0011u\u0087\u00b5(+;?\u00ee\u00a0,\u00d5S\u008f\u00f1`\u0096\u00b9\u00e3\u00ccq\u008a\u0007\u0091\u00a4\u00eb\f\u001d.\u00c8\u00a1{\u0002\u0080}\u0096Q\u001f\u00e2J\u00a6\u008e\u00ca\u0013\u00fcw\u00b1\u001b\u0095,XD\u00a4\u009f\u00e0)[X\u00bc|4\u00edpTm\u0018\u00e5\u00ea\u00aa\u00e6D\u00cd\u00c37\u008f\u009b$\u00f7\u0012\u00b6\f\u00d1\u009e\u00d1f\u00c6\u000e\u00dbdW\u00de\u0010^p\u0089\u00d6\u0011\ny\f\u000eaw\u0089p,\u0006\u00d6\u0088\u0087E\u00ae%\u008c\u007fk\u00d3\u00dc\u00baOvb\u0010\u00b9\u00dce\u00a0\u00d3\u00a4\u00c8\u00a7\u00dd\u00b9\u00a6\u0087O\u00fa\rrn\u0096\u00b5E\r\u00f9\u0019f\u0089\u00a8f;a\u00dc\u00d2r\u009c\u00f37\u00aa]+\u00d2d8RM\u001f\u00cb\u00a5\u00b5\u00e5\u00cba\u00cd,\u001c\u00adpl\u00d8\u00a7.Q~\u00b1\u00c4\u001d@\u0019\u00d2,6&\u0004\u001d\u00f5\u00bc\u0086H\u00bb\u00bf>\u0005\u008a\u00bc\"\u00a9\u0015\u00b7:o\u000b\u00c7\u0098\u0089z\u00ca\u009be\r\u00ad``\u0086I\u00a7\u00c6 B\u00e8\u00d1\u0015`\u00f6\u00a8\u00b4\u00f4\u00d3\u0017\u001c\u00f83\u00bb\u00b0~\u008aj\u00e2*\u0004\u001e\u000bA\u0007x\\j.8\u001fz\u00bf<\u00b7\u00a76\u00a6P\u00f7\u00cd\u00e0X\u00ae\u000b%\u0013O\u00e5z!\u00b1(I\u00c2\nn\u00ae\u0093\u00b0F\u00ed5n\u00bd5\u00a8\u00f3c\u008e,\u001d\u009bFE\u00e49K\u0086_\u00e8\u00f4\u0095{Y\u009bq\u00a1#$\u0097\u00e8\u0098+\u001c\u0084\u00cb\u0015\u0081[\u00aa\u0091\u00ffRD\u0081\u00e0X\u0015\u00f4 \u00d6\u00d0#g\u00faH\u0015\u008af\u00a1k\u008ba\u00f6\u00cf\u00b8\u00a3B\u009e\u00e8\rt\u009a\u00f1>x\u008e#\u00ee\tj0a_\u0097\u00a0\u0019\u0085\u001c}a+\u00bcS\u009eg\u00d2%\u00d4\u00bf\u00ffN\u00e0\u00f6\u00f94\u0004\u00ed8\u0014\u00e0n\u0000\u00b6ZC\u00bb@kW-e\u0088<P\u00ad\u00b3\u00ef\u00b3\u007fZ\u0087>+-\u00e9E\u00ecX\u00ad\u00d5\u0006\u0007\u00b0\u00b59\u00e0\u00f5\u0097\u001f\u000e\u00caR\u00c6\u0015\u00ae\b*\u00b5\u008a\u0003\u00fb\u00e6\u00ee\u00a1\u00c0\u0088n\u00d5V\n\u009b\u00bb\u008b\u00ff\u00a8\u00dc3\u001e\u0096\u00e6\u00f0\r\u00cbI\u00f9\u00cea\u0082s\u0087\u0098\u008c\u0088:\u00e2\u0018\u00fa\u0017\u0015\u00deC\u00aeV>m\u0083T\u00ecF\u00d2\u00e2/\u00d3a\u00a5\u007fH#\u0097-}\u00b7c\u0094\u00e6P\u00a4t!\u00d7\u00b42\u008deK5V\u0000\u009b\u00c6\u00f1\u00a2\u0018>f\u00c7M".length();
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
                    var4_10 = "\u00ce\u0090\u00a3\u00db\u00b98\u008dFU=\u0002\u00d7\u00d2G\u001bt";
                    var5_11 = "\u00ce\u0090\u00a3\u00db\u00b98\u008dFU=\u0002\u00d7\u00d2G\u001bt".length();
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
        r.d = var6_8;
        r.h = new Integer[284];
        r.m = new r();
    }

    private r() {
        super(r.b(21945, -18881), (vY)((Object)hi.a("j", (long)1119278030115886606L)));
        this.S = hi.a("\u00a5", (Object)this, (Object)r.b(21950, 10232), (Object)hi.a("j", (long)445698929824880422L), (long)426795652261052192L);
        this.C = hi.a("\u00a5", (Object)this, (Object)r.b(21951, 595), (Object)hi.a("j", (long)1242535819607886805L), (long)426795652261052192L);
        this.B = hi.a("\u00a5", (Object)this, (Object)r.b(21948, 11866), (int)2, (int)0, (int)r.c(32102, 6791266746189818567L), (int)1, (long)1094453040828645510L);
        this.E = hi.a("\u00a5", (Object)this, (Object)r.b(21946, 1534), (int)0, (int)0, (int)r.c(24658, 4423802409420601178L), (int)1, this::lambda$new$0, (long)958246524790962697L);
        this.z = hi.a("\u00a5", (Object)this, (Object)r.b(21949, 19743), (int)r.c(723, 8360052896226170212L), (int)r.c(3872, 5757277326212716663L), (int)r.c(6821, 8919561466782240183L), (int)r.c(3872, 5757277326212716663L), this::lambda$new$1, (long)958246524790962697L);
        hi.a("\u00f2", (Object)this, (int)0, (long)1044238316923513333L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)765716040858293100L);
        hi.a("\u00f2", (Object)this, (int)0, (long)675223623661782433L);
        hi.a("\u00f2", (Object)this, (int)-1, (long)1164218155521350028L);
    }

    private boolean lambda$new$1() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)929367222150810165L), (Object)hi.a("j", (long)445698929824880422L), (long)511460060498514638L);
    }

    private double lambda$onTick$1(EndCrystal endCrystal) {
        return (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)endCrystal, (long)381917422772525830L);
    }

    private boolean lambda$new$0() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)433427519838562534L), (Object)hi.a("j", (long)1242535819607886805L), (long)511460060498514638L);
    }

    private boolean lambda$onTick$0(EndCrystal endCrystal) {
        boolean bl = Dl.t();
        reference cfr_temp_0 = hi.a("G", (double)(hi.a("\u00a5", (Object)endCrystal, (long)1038213256955650941L) - r.d("OSWeBVQn73rGihge", getY(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L))), (long)1220789442640140846L) - 1.0;
        Object object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
        if (!bl) {
            object = object < 0 ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x55BF) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 44;
                case 1 -> 135;
                case 2 -> 205;
                case 3 -> 229;
                case 4 -> 175;
                case 5 -> 10;
                case 6 -> 188;
                case 7 -> 200;
                case 8 -> 247;
                case 9 -> 245;
                case 10 -> 67;
                case 11 -> 157;
                case 12 -> 95;
                case 13 -> 24;
                case 14 -> 43;
                case 15 -> 16;
                case 16 -> 174;
                case 17 -> 192;
                case 18 -> 106;
                case 19 -> 158;
                case 20 -> 214;
                case 21 -> 127;
                case 22 -> 159;
                case 23 -> 185;
                case 24 -> 198;
                case 25 -> 90;
                case 26 -> 35;
                case 27 -> 231;
                case 28 -> 179;
                case 29 -> 213;
                case 30 -> 15;
                case 31 -> 181;
                case 32 -> 191;
                case 33 -> 161;
                case 34 -> 255;
                case 35 -> 37;
                case 36 -> 254;
                case 37 -> 219;
                case 38 -> 87;
                case 39 -> 117;
                case 40 -> 93;
                case 41 -> 83;
                case 42 -> 72;
                case 43 -> 164;
                case 44 -> 84;
                case 45 -> 40;
                case 46 -> 253;
                case 47 -> 109;
                case 48 -> 183;
                case 49 -> 56;
                case 50 -> 209;
                case 51 -> 92;
                case 52 -> 114;
                case 53 -> 45;
                case 54 -> 199;
                case 55 -> 64;
                case 56 -> 6;
                case 57 -> 1;
                case 58 -> 71;
                case 59 -> 162;
                case 60 -> 154;
                case 61 -> 152;
                case 62 -> 19;
                case 63 -> 42;
                case 64 -> 149;
                case 65 -> 186;
                case 66 -> 223;
                case 67 -> 124;
                case 68 -> 60;
                case 69 -> 4;
                case 70 -> 249;
                case 71 -> 130;
                case 72 -> 125;
                case 73 -> 173;
                case 74 -> 238;
                case 75 -> 38;
                case 76 -> 167;
                case 77 -> 11;
                case 78 -> 123;
                case 79 -> 62;
                case 80 -> 128;
                case 81 -> 252;
                case 82 -> 100;
                case 83 -> 89;
                case 84 -> 13;
                case 85 -> 18;
                case 86 -> 170;
                case 87 -> 129;
                case 88 -> 168;
                case 89 -> 221;
                case 90 -> 102;
                case 91 -> 12;
                case 92 -> 52;
                case 93 -> 206;
                case 94 -> 29;
                case 95 -> 142;
                case 96 -> 122;
                case 97 -> 136;
                case 98 -> 5;
                case 99 -> 166;
                case 100 -> 88;
                case 101 -> 150;
                case 102 -> 104;
                case 103 -> 7;
                case 104 -> 241;
                case 105 -> 20;
                case 106 -> 49;
                case 107 -> 227;
                case 108 -> 212;
                case 109 -> 36;
                case 110 -> 96;
                case 111 -> 57;
                case 112 -> 222;
                case 113 -> 116;
                case 114 -> 140;
                case 115 -> 228;
                case 116 -> 54;
                case 117 -> 190;
                case 118 -> 59;
                case 119 -> 33;
                case 120 -> 165;
                case 121 -> 176;
                case 122 -> 207;
                case 123 -> 137;
                case 124 -> 132;
                case 125 -> 41;
                case 126 -> 26;
                case 127 -> 53;
                case 128 -> 94;
                case 129 -> 86;
                case 130 -> 171;
                case 131 -> 144;
                case 132 -> 28;
                case 133 -> 134;
                case 134 -> 70;
                case 135 -> 85;
                case 136 -> 47;
                case 137 -> 172;
                case 138 -> 240;
                case 139 -> 58;
                case 140 -> 3;
                case 141 -> 108;
                case 142 -> 204;
                case 143 -> 0;
                case 144 -> 195;
                case 145 -> 250;
                case 146 -> 73;
                case 147 -> 25;
                case 148 -> 113;
                case 149 -> 31;
                case 150 -> 202;
                case 151 -> 251;
                case 152 -> 151;
                case 153 -> 189;
                case 154 -> 203;
                case 155 -> 178;
                case 156 -> 74;
                case 157 -> 147;
                case 158 -> 193;
                case 159 -> 218;
                case 160 -> 46;
                case 161 -> 103;
                case 162 -> 237;
                case 163 -> 121;
                case 164 -> 197;
                case 165 -> 169;
                case 166 -> 133;
                case 167 -> 75;
                case 168 -> 118;
                case 169 -> 119;
                case 170 -> 145;
                case 171 -> 14;
                case 172 -> 146;
                case 173 -> 66;
                case 174 -> 50;
                case 175 -> 138;
                case 176 -> 233;
                case 177 -> 65;
                case 178 -> 30;
                case 179 -> 184;
                case 180 -> 248;
                case 181 -> 55;
                case 182 -> 39;
                case 183 -> 8;
                case 184 -> 160;
                case 185 -> 246;
                case 186 -> 63;
                case 187 -> 143;
                case 188 -> 17;
                case 189 -> 2;
                case 190 -> 80;
                case 191 -> 101;
                case 192 -> 141;
                case 193 -> 91;
                case 194 -> 217;
                case 195 -> 242;
                case 196 -> 201;
                case 197 -> 131;
                case 198 -> 243;
                case 199 -> 76;
                case 200 -> 48;
                case 201 -> 224;
                case 202 -> 115;
                case 203 -> 27;
                case 204 -> 210;
                case 205 -> 68;
                case 206 -> 34;
                case 207 -> 82;
                case 208 -> 156;
                case 209 -> 232;
                case 210 -> 163;
                case 211 -> 215;
                case 212 -> 239;
                case 213 -> 208;
                case 214 -> 235;
                case 215 -> 81;
                case 216 -> 180;
                case 217 -> 9;
                case 218 -> 112;
                case 219 -> 51;
                case 220 -> 98;
                case 221 -> 216;
                case 222 -> 107;
                case 223 -> 105;
                case 224 -> 153;
                case 225 -> 111;
                case 226 -> 236;
                case 227 -> 182;
                case 228 -> 226;
                case 229 -> 148;
                case 230 -> 230;
                case 231 -> 187;
                case 232 -> 139;
                case 233 -> 22;
                case 234 -> 155;
                case 235 -> 79;
                case 236 -> 110;
                case 237 -> 21;
                case 238 -> 177;
                case 239 -> 220;
                case 240 -> 69;
                case 241 -> 234;
                case 242 -> 78;
                case 243 -> 225;
                case 244 -> 126;
                case 245 -> 211;
                case 246 -> 99;
                case 247 -> 77;
                case 248 -> 97;
                case 249 -> 23;
                case 250 -> 61;
                case 251 -> 194;
                case 252 -> 32;
                case 253 -> 196;
                case 254 -> 120;
                default -> 244;
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
                int n10 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n10];
                if (n8 == 0) {
                    cArray2[n10] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n10] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            r.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57B8;
        if (h[n2] == null) {
            r.h[n2] = (int)(d[n2] ^ l);
        }
        return h[n2];
    }
}
