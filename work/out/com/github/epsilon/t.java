/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.multiplayer.ClientPacketListener
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.common.ClientboundPingPacket
 *  net.minecraft.network.protocol.game.ClientboundAddEntityPacket
 *  net.minecraft.network.protocol.game.ClientboundBlockEventPacket
 *  net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket
 *  net.minecraft.network.protocol.game.ClientboundEntityEventPacket
 *  net.minecraft.network.protocol.game.ClientboundMoveEntityPacket
 *  net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket
 *  net.minecraft.network.protocol.game.ClientboundSetHealthPacket
 *  net.minecraft.network.protocol.game.ClientboundSystemChatPacket
 *  net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket
 *  net.minecraft.network.protocol.game.ServerboundPlayerActionPacket
 *  net.minecraft.network.protocol.game.ServerboundPlayerActionPacket$Action
 *  net.minecraft.network.protocol.game.ServerboundUseItemPacket
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.item.ItemStack
 */
package com.github.epsilon;

import com.github.epsilon.D2;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.Xn;
import com.github.epsilon.dP;
import com.github.epsilon.dQ;
import com.github.epsilon.dY;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.lq;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Predicate;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ClientboundPingPacket;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.protocol.game.ClientboundBlockEventPacket;
import net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.network.protocol.game.ClientboundMoveEntityPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundSetHealthPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;

public class t
extends e {
    private final Xn w;
    private final Xn H;
    private int c;
    private final Queue<Packet<?>> h;
    private int u;
    private final Dx<lq> t = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.t.b(-20290, 26590), (Object)hi.a("j", (long)741347967217910910L), (long)426795652261052192L);
    private final Xn N;
    private final Xn d = com.github.epsilon.t.E("DZYOta6dqi7RJjOj", U(java.lang.String boolean ), (t)this, (String)com.github.epsilon.t.b(-20295, 18624), (boolean)true);
    public static final t J;
    private boolean e;
    private static final String[] a;
    private static final String[] b;
    private static final long[] k;
    private static final Integer[] l;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean P(Object[] var1_1) {
        block13: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = (com.github.epsilon.t.c(25210, 6869540903777917972L) ^ com.github.epsilon.t.c(3658, 106578755704697288L)) / com.github.epsilon.t.c(2257, 3069158278182811324L) ^ com.github.epsilon.t.c(9654, 7603935637428771382L);
            if (var2_2) ** GOTO lbl16
            block10: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1099153674733698693L);
                            if (!var2_2) break block14;
                            if (v0 /* !! */  != false) break block15;
                            v0 /* !! */  = (CallSite)(hi.a("G", (int)((com.github.epsilon.t.c(31876, 8648132943844885051L) * com.github.epsilon.t.c(20858, 788021538101981001L) ^ com.github.epsilon.t.c(4037, 792791863175066412L)) / com.github.epsilon.t.c(31819, 4115033044911145786L)), (int)com.github.epsilon.t.c(14655, 7120463207905166784L), (long)834203424483934088L) ^ com.github.epsilon.t.c(11641, 7556219321069015601L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) break block16;
                    }
                    var3_3 /* !! */  = (com.github.epsilon.t.c(20469, 5148451320927482175L) + com.github.epsilon.t.c(9743, 8218306389878381036L) - com.github.epsilon.t.c(2809, 7314337221493274083L)) / com.github.epsilon.t.c(2257, 3069158278182811324L) + com.github.epsilon.t.c(20414, 8063113172472623105L);
                    if (!var2_2) ** GOTO lbl47
                }
                while (true) {
                    block21: {
                        block19: {
                            block20: {
                                block18: {
                                    block17: {
                                        switch (var3_3 /* !! */ ) {
                                            default: {
                                                continue block10;
                                            }
                                            case 514378782: {
                                                v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)409394569713009562L), (long)511460060498514638L);
                                                if (!var2_2) break block17;
                                                if (v1 /* !! */  == false) break;
                                                break block18;
                                            }
                                            case 514378781: {
                                                v2 /* !! */  = hi.a("\u00e9", (Object)this, (long)730053250739050863L);
                                                if (!var2_2) break block19;
                                                if (v2 /* !! */  == false) break block20;
                                                break block21;
                                            }
                                            case 514378779: {
                                                v3 = true;
                                                var3_3 /* !! */  = com.github.epsilon.t.c(19580, 6795644228664750935L) - com.github.epsilon.t.c(5037, 886008337325632594L) - com.github.epsilon.t.c(49, 4492095910704234130L);
                                                if (!var2_2) {
                                                    break block10;
                                                }
                                                break block13;
                                            }
                                            case 514378778: {
                                                v3 = false;
                                                if (var2_2) break block10;
                                                return v3;
                                            }
                                            case 514378783: {
                                                hi.a("G", (float)1.0f, (long)450110752184348458L);
                                                hi.a("G", (long)859382720121195521L);
                                                return true;
                                            }
                                        }
lbl47:
                                        // 2 sources

                                        v1 /* !! */  = (CallSite)(hi.a("G", (int)((com.github.epsilon.t.c(23602, 6203816353547936763L) * com.github.epsilon.t.c(9291, 6518581128669010511L) ^ com.github.epsilon.t.c(7635, 2244478840004977160L)) / com.github.epsilon.t.c(31819, 4115033044911145786L)), (int)com.github.epsilon.t.c(3377, 1638313176218153893L), (long)834203424483934088L) ^ com.github.epsilon.t.c(23240, 8010607154562589764L));
                                    }
                                    var3_3 /* !! */  = (int)v1 /* !! */ ;
                                    if (var2_2) continue;
                                }
                                var3_3 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.t.c(4603, 7020946773881532065L), (int)com.github.epsilon.t.c(17229, 2670720723116588358L), (long)834203424483934088L) + com.github.epsilon.t.c(8797, 3567059117321821458L) - com.github.epsilon.t.c(9599, 4884051924094654989L) + com.github.epsilon.t.c(21307, 8861952435450670351L));
                                if (var2_2) continue;
                            }
                            v2 /* !! */  = (CallSite)(hi.a("G", (int)((com.github.epsilon.t.c(23602, 6203816353547936763L) * com.github.epsilon.t.c(9291, 6518581128669010511L) ^ com.github.epsilon.t.c(7635, 2244478840004977160L)) / com.github.epsilon.t.c(31819, 4115033044911145786L)), (int)com.github.epsilon.t.c(3377, 1638313176218153893L), (long)834203424483934088L) ^ com.github.epsilon.t.c(23240, 8010607154562589764L));
                        }
                        var3_3 /* !! */  = (int)v2 /* !! */ ;
                        if (var2_2) continue;
                    }
                    var3_3 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.t.c(25761, 4824940038110665227L), (int)com.github.epsilon.t.c(13225, 5937767205652204669L), (long)834203424483934088L) + com.github.epsilon.t.c(3303, 2356870899004486343L));
                }
                break;
            }
            var3_3 /* !! */  = com.github.epsilon.t.c(15972, 2269723177649209635L) - com.github.epsilon.t.c(15817, 7943571952674833156L) - com.github.epsilon.t.c(1070, 3410552000339196800L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v3;
            }
            case 1139217141: 
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void I(Object[] var1_1) {
        block18: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = com.github.epsilon.t.c(10419, 5989005699221198758L) ^ com.github.epsilon.t.c(9283, 8681284924509658005L) ^ com.github.epsilon.t.c(29766, 6417577660380695160L);
            if (var3_3) break block18;
lbl6:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1015148049117770214L);
                if (!var3_3) ** GOTO lbl63
                if (v0 /* !! */  == false) ** GOTO lbl62
                ** GOTO lbl65
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                v1 /* !! */  = com.github.epsilon.t.E("DZYOta6dqi7RJjOj", getUseItemRemainingTicks(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                v2 = com.github.epsilon.t.c(24878, 9042674282475249316L);
                if (!var3_3) ** GOTO lbl69
                if (v1 /* !! */  >= v2) ** GOTO lbl67
                ** GOTO lbl71
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                v3 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1062363401682879978L)}, (long)886483173019937015L);
                if (!var3_3) ** GOTO lbl74
                if (v3 /* !! */  == false) ** GOTO lbl73
                ** GOTO lbl76
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                v4 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1175532240973568599L)}, (long)886483173019937015L);
                if (!var3_3) ** GOTO lbl79
                if (v4 /* !! */  != false) ** GOTO lbl78
                ** GOTO lbl81
                break;
            }
lbl27:
            // 1 sources

            while (true) {
                v5 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)913395637666077032L)}, (long)886483173019937015L);
                if (!var3_3) ** GOTO lbl84
                if (v5 /* !! */  == false) ** GOTO lbl83
                ** GOTO lbl86
                break;
            }
lbl32:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)((D2)var2_2), (Object)new Object[]{false}, (long)1284770739508758974L);
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (boolean)true, (long)453484615985537282L);
                if (!var3_3) lbl-1000:
                // 3 sources

                {
                    return;
                }
                ** GOTO lbl88
                break;
            }
        }
        while (true) {
            switch (var4_4 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 2141371089: {
                    ** continue;
                }
                case 2141371088: {
                    ** continue;
                }
                case 2141371090: {
                    ** continue;
                }
                case 2141371087: {
                    ** continue;
                }
                case 2141371083: {
                    ** continue;
                }
                case 2141371086: {
                    ** GOTO lbl-1000
                }
                case 2141371085: 
            }
            hi.a("G", (long)388723803836383585L);
            hi.a("G", (long)957299721117170898L);
            if (!var3_3) ** break;
            ** continue;
lbl62:
            // 2 sources

            v0 /* !! */  = (CallSite)(com.github.epsilon.t.c(7135, 6185187075222152283L) * com.github.epsilon.t.c(11945, 6152226472901152954L) / com.github.epsilon.t.c(3698, 6973947980607434872L) - com.github.epsilon.t.c(10200, 8833910430423784235L));
lbl63:
            // 2 sources

            var4_4 /* !! */  = (int)v0 /* !! */ ;
            if (var3_3) continue;
lbl65:
            // 2 sources

            var4_4 /* !! */  = (int)(com.github.epsilon.t.E("DZYOta6dqi7RJjOj", max(int int ), (int)com.github.epsilon.t.c(21897, 2728484965055589044L), (int)com.github.epsilon.t.c(17542, 5075601395002439784L)) + com.github.epsilon.t.c(1022, 5069597392242392217L) - com.github.epsilon.t.c(4068, 7194306366678085889L) - com.github.epsilon.t.c(10961, 6569977045163873829L));
            if (var3_3) continue;
lbl67:
            // 2 sources

            v1 /* !! */  = (CallSite)(com.github.epsilon.t.c(13189, 6642242898998496309L) * com.github.epsilon.t.c(25258, 327264950335790226L) / com.github.epsilon.t.c(3698, 6973947980607434872L));
            v2 = com.github.epsilon.t.c(28889, 1362038479096008673L);
lbl69:
            // 2 sources

            var4_4 /* !! */  = (int)(v1 /* !! */  - v2);
            if (var3_3) continue;
lbl71:
            // 2 sources

            var4_4 /* !! */  = com.github.epsilon.t.c(867, 6340739741576510632L) - com.github.epsilon.t.c(20534, 8980989396464791116L) ^ com.github.epsilon.t.c(7964, 3016303926233407950L);
            if (var3_3) continue;
lbl73:
            // 2 sources

            v3 /* !! */  = (CallSite)(com.github.epsilon.t.c(10064, 7211324294110419136L) + com.github.epsilon.t.c(24439, 8933157218235670684L) - com.github.epsilon.t.c(8861, 2373124477500497407L));
lbl74:
            // 2 sources

            var4_4 /* !! */  = (int)v3 /* !! */ ;
            if (var3_3) continue;
lbl76:
            // 2 sources

            var4_4 /* !! */  = (com.github.epsilon.t.c(6710, 8073473551152719049L) ^ com.github.epsilon.t.c(11411, 307735255234810387L)) + com.github.epsilon.t.c(14563, 3669856174937638490L) + com.github.epsilon.t.c(5667, 8599398964194912690L);
            if (var3_3) continue;
lbl78:
            // 2 sources

            v4 /* !! */  = (CallSite)(com.github.epsilon.t.c(13189, 6642242898998496309L) * com.github.epsilon.t.c(25258, 327264950335790226L) / com.github.epsilon.t.c(3698, 6973947980607434872L) - com.github.epsilon.t.c(28889, 1362038479096008673L));
lbl79:
            // 2 sources

            var4_4 /* !! */  = (int)v4 /* !! */ ;
            if (var3_3) continue;
lbl81:
            // 2 sources

            var4_4 /* !! */  = com.github.epsilon.t.c(24333, 7211057219479625757L) + com.github.epsilon.t.c(16536, 1218227095856086746L) - com.github.epsilon.t.c(5317, 1088769334432836477L);
            if (var3_3) continue;
lbl83:
            // 2 sources

            v5 /* !! */  = (CallSite)(com.github.epsilon.t.c(13189, 6642242898998496309L) * com.github.epsilon.t.c(25258, 327264950335790226L) / com.github.epsilon.t.c(3698, 6973947980607434872L) - com.github.epsilon.t.c(28889, 1362038479096008673L));
lbl84:
            // 2 sources

            var4_4 /* !! */  = (int)v5 /* !! */ ;
            if (var3_3) continue;
lbl86:
            // 2 sources

            var4_4 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.t.c(19939, 1736993201950684062L), (int)com.github.epsilon.t.c(17352, 3615845015442324496L), (long)834203424483934088L) + com.github.epsilon.t.c(13261, 5231266442672377013L));
            if (var3_3) continue;
lbl88:
            // 2 sources

            var4_4 /* !! */  = com.github.epsilon.t.c(13189, 6642242898998496309L) * com.github.epsilon.t.c(25258, 327264950335790226L) / com.github.epsilon.t.c(3698, 6973947980607434872L) - com.github.epsilon.t.c(28889, 1362038479096008673L);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void b(dP var1_1) {
        block27: {
            block28: {
                var2_2 = Dl.t();
                var4_3 /* !! */  = (com.github.epsilon.t.c(9457, 2398274216630885283L) ^ com.github.epsilon.t.c(25804, 5767672110644550263L) ^ com.github.epsilon.t.c(19608, 2927422951361868617L)) + com.github.epsilon.t.c(23237, 7534102993054852141L);
                if (!var2_2) ** GOTO lbl15
                block23: while (true) {
                    block31: {
                        block30: {
                            block29: {
                                v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                if (var2_2) break block29;
                                if (v0 /* !! */  == false) break block30;
                                v0 /* !! */  = (CallSite)(com.github.epsilon.t.c(3621, 4656353748508553546L) * com.github.epsilon.t.c(27264, 7345405976430007309L) * com.github.epsilon.t.c(26719, 3337076303746684766L) / 4 - com.github.epsilon.t.c(806, 3912673385301195828L));
                            }
                            var4_3 /* !! */  = (int)v0 /* !! */ ;
                            if (!var2_2) break block31;
                        }
                        var4_3 /* !! */  = (com.github.epsilon.t.c(11923, 2103095893170982934L) ^ com.github.epsilon.t.c(21115, 6867553093801995383L)) + com.github.epsilon.t.c(1073, 4439116013635386315L) ^ com.github.epsilon.t.c(7888, 9087441726804926540L);
                        if (var2_2) ** GOTO lbl44
                    }
                    block24: while (true) {
                        switch (var4_3 /* !! */ ) {
                            default: {
                                continue block23;
                            }
                            case -207727750: {
                                v1 /* !! */  = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)843081131751977988L);
                                v2 = com.github.epsilon.t.c(600, 3895419856331685559L);
                                if (var2_2) ** GOTO lbl46
                                if (v1 /* !! */  < v2) ** GOTO lbl44
                                ** GOTO lbl48
                            }
                            case -207727746: {
                                v3 /* !! */  = hi.a("\u00e9", (Object)this, (long)730053250739050863L);
                                if (var2_2) ** GOTO lbl51
                                if (v3 /* !! */  == false) ** GOTO lbl50
                                ** GOTO lbl53
                            }
                            case -207727752: {
                                v4 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)409394569713009562L), (long)511460060498514638L);
                                if (var2_2) ** GOTO lbl56
                                if (v4 /* !! */  != false) ** GOTO lbl55
                                ** GOTO lbl58
                            }
                            case -207727747: {
                                var3_4 = hi.a("\u00a5", (Object)var1_1, (long)634364534990057548L);
                                v5 = var3_4 instanceof ClientboundPlayerPositionPacket;
                                if (var2_2) ** GOTO lbl61
                                if (v5 == 0) ** GOTO lbl60
                                ** GOTO lbl62
                            }
                            case -207727751: {
                                break block27;
                            }
lbl44:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(com.github.epsilon.t.c(21810, 4198982979153750670L) * com.github.epsilon.t.c(27287, 3927513298446636532L) * com.github.epsilon.t.c(31466, 1728744122930677234L) / 4);
                            v2 = com.github.epsilon.t.c(25328, 3069392742384852442L);
lbl46:
                            // 2 sources

                            var4_3 /* !! */  = (int)(v1 /* !! */  - v2);
                            if (!var2_2) continue block24;
lbl48:
                            // 2 sources

                            var4_3 /* !! */  = (com.github.epsilon.t.c(6814, 2537282619324867624L) - com.github.epsilon.t.c(17379, 317788512075873759L) + com.github.epsilon.t.c(22073, 2396148923667245080L)) * com.github.epsilon.t.c(8257, 7282284447039331978L) * com.github.epsilon.t.c(3877, 2828458788014370984L) ^ com.github.epsilon.t.c(21076, 5043744381957205312L);
                            if (!var2_2) continue block24;
lbl50:
                            // 2 sources

                            v3 /* !! */  = (CallSite)(com.github.epsilon.t.c(21810, 4198982979153750670L) * com.github.epsilon.t.c(27287, 3927513298446636532L) * com.github.epsilon.t.c(31466, 1728744122930677234L) / 4 - com.github.epsilon.t.c(25328, 3069392742384852442L));
lbl51:
                            // 2 sources

                            var4_3 /* !! */  = (int)v3 /* !! */ ;
                            if (!var2_2) continue block24;
lbl53:
                            // 2 sources

                            var4_3 /* !! */  = (int)(hi.a("G", (int)(com.github.epsilon.t.c(26870, 4783780927991109577L) * com.github.epsilon.t.c(30114, 6079235452811365205L) ^ com.github.epsilon.t.c(20356, 7756902825181966838L)), (int)com.github.epsilon.t.c(15832, 63313220904354588L), (long)834203424483934088L) - com.github.epsilon.t.c(16876, 8079181562448117376L));
                            if (!var2_2) continue block24;
lbl55:
                            // 2 sources

                            v4 /* !! */  = (CallSite)(com.github.epsilon.t.c(31764, 5162484379926512162L) / com.github.epsilon.t.c(2257, 3069158278182811324L) / com.github.epsilon.t.c(29496, 7826296873851899004L) ^ com.github.epsilon.t.c(18536, 737512995674388471L));
lbl56:
                            // 2 sources

                            var4_3 /* !! */  = (int)v4 /* !! */ ;
                            if (!var2_2) continue block24;
lbl58:
                            // 2 sources

                            var4_3 /* !! */  = com.github.epsilon.t.c(21810, 4198982979153750670L) * com.github.epsilon.t.c(27287, 3927513298446636532L) * com.github.epsilon.t.c(31466, 1728744122930677234L) / 4 - com.github.epsilon.t.c(25328, 3069392742384852442L);
                            continue block24;
lbl60:
                            // 1 sources

                            v5 = var4_3 /* !! */  = (com.github.epsilon.t.c(28510, 1892512344649716166L) + com.github.epsilon.t.c(21570, 3817026042602154676L)) * com.github.epsilon.t.c(21675, 1628755396173949947L) - com.github.epsilon.t.c(3377, 134955975865021187L);
lbl61:
                            // 2 sources

                            if (!var2_2) break block28;
lbl62:
                            // 2 sources

                            var4_3 /* !! */  = com.github.epsilon.t.c(19803, 881129504258519997L) - com.github.epsilon.t.c(2490, 2423359029704799804L) - com.github.epsilon.t.c(24889, 1824365336000618124L) + com.github.epsilon.t.c(26860, 2468400827084265237L) + com.github.epsilon.t.c(5197, 2430994246776138668L);
                            if (!var2_2) break block28;
                            ** GOTO lbl125
                            case -207727748: 
                        }
                        break;
                    }
                    break;
                }
                return;
            }
            block25: while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        hi.a("\u00a5", (Object)this, (long)915704847731565449L);
                        return;
                    }
                    case -354132724: {
                        v6 = var3_4 instanceof ClientboundSetHealthPacket;
                        if (var2_2) ** GOTO lbl126
                        if (v6 != 0) ** GOTO lbl125
                        ** GOTO lbl127
                    }
                    case -354132733: {
                        v7 = var3_4 instanceof ClientboundSystemChatPacket;
                        if (var2_2) ** GOTO lbl130
                        if (v7 != 0) ** GOTO lbl129
                        ** GOTO lbl131
                    }
                    case -354132730: {
                        v8 = var3_4 instanceof ClientboundMoveEntityPacket;
                        if (var2_2) ** GOTO lbl134
                        if (v8 != 0) ** GOTO lbl133
                        ** GOTO lbl135
                    }
                    case -354132732: {
                        v9 = var3_4 instanceof ClientboundTeleportEntityPacket;
                        if (var2_2) ** GOTO lbl138
                        if (v9 != 0) ** GOTO lbl137
                        ** GOTO lbl139
                    }
                    case -354132722: {
                        v10 = var3_4 instanceof ClientboundEntityEventPacket;
                        if (var2_2) ** GOTO lbl142
                        if (v10 != 0) ** GOTO lbl141
                        ** GOTO lbl143
                    }
                    case -354132731: {
                        v11 = var3_4 instanceof ClientboundAddEntityPacket;
                        if (var2_2) ** GOTO lbl146
                        if (v11 != 0) ** GOTO lbl145
                        ** GOTO lbl147
                    }
                    case -354132726: {
                        v12 = var3_4 instanceof ClientboundBlockUpdatePacket;
                        if (var2_2) ** GOTO lbl150
                        if (v12 != 0) ** GOTO lbl149
                        ** GOTO lbl151
                    }
                    case -354132720: {
                        v13 = var3_4 instanceof ClientboundBlockEventPacket;
                        if (var2_2) ** GOTO lbl154
                        if (v13 == 0) ** GOTO lbl153
                        ** GOTO lbl155
                    }
                    case -354132725: {
                        if (hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var3_4, (long)916638375369888217L), (long)1046355724390072568L) != hi.a("j", (long)800485894103332850L)) ** GOTO lbl157
                        ** GOTO lbl159
                    }
                    case -354132721: {
                        hi.a("\u00a5", (Object)var1_1, (long)1159641526413061244L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)574721318267708693L), (Object)var3_4, (long)1313612628732931680L);
                        if (var2_2) {
                            return;
                        }
                        ** GOTO lbl161
                    }
                    case -354132727: {
                        break block27;
                    }
lbl125:
                    // 2 sources

                    v6 = var4_3 /* !! */  = com.github.epsilon.t.c(14996, 6063323452588918127L) - com.github.epsilon.t.c(4060, 3840563727116447968L) - com.github.epsilon.t.c(3657, 6848064188102488568L);
lbl126:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl127:
                    // 2 sources

                    var4_3 /* !! */  = (int)(hi.a("G", (int)(com.github.epsilon.t.c(12281, 633644750735774198L) * com.github.epsilon.t.c(10696, 2412992931500726074L)), (int)com.github.epsilon.t.c(19547, 5449005342214452211L), (long)834203424483934088L) - com.github.epsilon.t.c(18170, 3633718600217688266L));
                    if (!var2_2) continue block25;
lbl129:
                    // 2 sources

                    v7 = var4_3 /* !! */  = com.github.epsilon.t.c(7128, 6332499684280313208L) - com.github.epsilon.t.c(25531, 7309524418477481153L) - com.github.epsilon.t.c(23348, 8283968803255477603L);
lbl130:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl131:
                    // 2 sources

                    var4_3 /* !! */  = com.github.epsilon.t.c(13740, 1951702679321086475L) * com.github.epsilon.t.c(19144, 5598859053105083517L) + com.github.epsilon.t.c(18186, 3258536659069827183L) + com.github.epsilon.t.c(23983, 8730675978925891915L) - com.github.epsilon.t.c(2036, 7123587949892680079L) - com.github.epsilon.t.c(19590, 1065839882092409708L);
                    if (!var2_2) continue block25;
lbl133:
                    // 2 sources

                    v8 = var4_3 /* !! */  = com.github.epsilon.t.c(7128, 6332499684280313208L) - com.github.epsilon.t.c(25531, 7309524418477481153L) - com.github.epsilon.t.c(23348, 8283968803255477603L);
lbl134:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl135:
                    // 2 sources

                    var4_3 /* !! */  = com.github.epsilon.t.c(28880, 3955745896392609400L) / 5 + com.github.epsilon.t.c(21333, 1817181829765131712L);
                    if (!var2_2) continue block25;
lbl137:
                    // 2 sources

                    v9 = var4_3 /* !! */  = com.github.epsilon.t.c(7128, 6332499684280313208L) - com.github.epsilon.t.c(25531, 7309524418477481153L) - com.github.epsilon.t.c(23348, 8283968803255477603L);
lbl138:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl139:
                    // 2 sources

                    var4_3 /* !! */  = (com.github.epsilon.t.c(12813, 1672040151040429537L) - com.github.epsilon.t.c(20300, 1869441913045709722L) ^ com.github.epsilon.t.c(17869, 2463467748160174963L)) - com.github.epsilon.t.c(4316, 6189804179047558741L) ^ com.github.epsilon.t.c(4843, 993255003617307977L);
                    if (!var2_2) continue block25;
lbl141:
                    // 2 sources

                    v10 = var4_3 /* !! */  = com.github.epsilon.t.c(7128, 6332499684280313208L) - com.github.epsilon.t.c(25531, 7309524418477481153L) - com.github.epsilon.t.c(23348, 8283968803255477603L);
lbl142:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl143:
                    // 2 sources

                    var4_3 /* !! */  = (com.github.epsilon.t.c(13019, 3336816622244171232L) * com.github.epsilon.t.c(22172, 1992278497489086710L) - com.github.epsilon.t.c(19043, 6310821243922740466L)) * com.github.epsilon.t.c(15599, 898185248181486084L) ^ com.github.epsilon.t.c(3322, 4369439572970943295L);
                    if (!var2_2) continue block25;
lbl145:
                    // 2 sources

                    v11 = var4_3 /* !! */  = com.github.epsilon.t.c(7128, 6332499684280313208L) - com.github.epsilon.t.c(25531, 7309524418477481153L) - com.github.epsilon.t.c(23348, 8283968803255477603L);
lbl146:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl147:
                    // 2 sources

                    var4_3 /* !! */  = (com.github.epsilon.t.c(23280, 6300320070320547175L) ^ com.github.epsilon.t.c(28033, 8007398609582510658L)) - com.github.epsilon.t.c(8282, 1447536163379355265L);
                    if (!var2_2) continue block25;
lbl149:
                    // 2 sources

                    v12 = var4_3 /* !! */  = com.github.epsilon.t.c(7128, 6332499684280313208L) - com.github.epsilon.t.c(25531, 7309524418477481153L) - com.github.epsilon.t.c(23348, 8283968803255477603L);
lbl150:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl151:
                    // 2 sources

                    var4_3 /* !! */  = (hi.a("G", (int)(com.github.epsilon.t.c(3480, 7513551370603901872L) / com.github.epsilon.t.c(9133, 376976205636312239L)), (int)com.github.epsilon.t.c(22168, 7089431324608784606L), (long)834203424483934088L) ^ com.github.epsilon.t.c(10556, 7286110770936354702L)) - com.github.epsilon.t.c(21965, 8486111704214858314L) + com.github.epsilon.t.c(31680, 7057725329510876526L);
                    if (!var2_2) continue block25;
lbl153:
                    // 2 sources

                    v13 = var4_3 /* !! */  = com.github.epsilon.t.c(29175, 8292459015426690761L) + com.github.epsilon.t.c(29142, 5380045480102678378L) - com.github.epsilon.t.c(28788, 7833255105239338729L) ^ com.github.epsilon.t.c(376, 934703688935849496L);
lbl154:
                    // 2 sources

                    if (!var2_2) continue block25;
lbl155:
                    // 2 sources

                    var4_3 /* !! */  = com.github.epsilon.t.c(7128, 6332499684280313208L) - com.github.epsilon.t.c(25531, 7309524418477481153L) - com.github.epsilon.t.c(23348, 8283968803255477603L);
                    if (!var2_2) continue block25;
lbl157:
                    // 2 sources

                    var4_3 /* !! */  = (com.github.epsilon.t.c(32495, 5501350276503028064L) - com.github.epsilon.t.c(6575, 8716271957860722205L)) * com.github.epsilon.t.c(12097, 974060313502519759L) + com.github.epsilon.t.c(28232, 789013511885476088L);
                    if (!var2_2) continue block25;
lbl159:
                    // 2 sources

                    var4_3 /* !! */  = (hi.a("G", (int)com.github.epsilon.t.c(26425, 5747177608335415573L), (int)com.github.epsilon.t.c(12249, 6737467775266459797L), (long)834203424483934088L) + com.github.epsilon.t.c(4237, 1820553055748108162L) - com.github.epsilon.t.c(25217, 1127223443529948255L) ^ com.github.epsilon.t.c(16116, 1412714163455492392L)) + com.github.epsilon.t.c(16219, 938405468295528659L);
                    if (!var2_2) continue block25;
lbl161:
                    // 2 sources

                    var4_3 /* !! */  = (com.github.epsilon.t.c(1711, 2857594077047765352L) - com.github.epsilon.t.c(15650, 6558405656153097176L)) * com.github.epsilon.t.c(9186, 544952730291248384L) + com.github.epsilon.t.c(9156, 6434008088879308161L);
                    continue block25;
                    case -354132729: {
                        return;
                    }
                    case -354132723: 
                }
                break;
            }
            return;
        }
        hi.a("G", (long)542073908063082347L);
    }

    @Override
    protected void b(Object[] objectArray) {
        com.github.epsilon.t.E("DZYOta6dqi7RJjOj", w(), (t)this);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)730053250739050863L);
        hi.a("\u00f2", (Object)this, (int)0, (long)1238143094422900030L);
        hi.a("\u00f2", (Object)this, (int)com.github.epsilon.t.c(28290, 261490497343901910L), (long)410693938552110621L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean g(Object[] var1_1) {
        block13: {
            block16: {
                block15: {
                    block14: {
                        var2_2 = var1_1[0];
                        var3_3 = Dl.t();
                        var5_4 /* !! */  = com.github.epsilon.t.c(1221, 464460474347305704L) ^ com.github.epsilon.t.c(13969, 4781088369416636529L) ^ com.github.epsilon.t.c(32280, 3578358031501574518L) ^ com.github.epsilon.t.c(28945, 7553307397636902777L);
                        if (var3_3) ** GOTO lbl-1000
                        v0 /* !! */  = var5_4 /* !! */ ;
                        if (var3_3 != false) return (boolean)v0 /* !! */ ;
                        switch (v0 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var4_5 = hi.a("\u00a5", (Object)((ItemStack)var2_2), (long)875492260708828291L);
                                if (var3_3) break block14;
                                if (var4_5 == hi.a("j", (long)1140640193062829998L)) break;
                                break block15;
                            }
                            case 112848337: {
                                hi.a("G", (long)438677556143749811L);
                                hi.a("G", (long)480259620120811363L);
                                v0 /* !! */  = hi.a("G", (long)373721845012904719L);
                                return (boolean)v0 /* !! */ ;
                            }
                        }
                        var5_4 /* !! */  = com.github.epsilon.t.c(12693, 4484437131227270768L) / com.github.epsilon.t.c(31819, 4115033044911145786L) ^ com.github.epsilon.t.c(23293, 6879873096398300190L);
                    }
                    if (!var3_3) break block16;
                }
                var5_4 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.t.c(1428, 8698985945657293697L), (int)com.github.epsilon.t.c(7800, 8176062353622278476L), (long)834203424483934088L) - com.github.epsilon.t.c(8654, 8304471988625514084L) + com.github.epsilon.t.c(9505, 2719360896390601423L) - com.github.epsilon.t.c(29406, 4175850022164319239L));
                if (var3_3) ** GOTO lbl46
            }
            block11: while (true) {
                block17: {
                    switch (var5_4 /* !! */  ? 1 : 0) {
                        default: {
                            if (var4_5 != hi.a("j", (long)454303356060981862L)) break;
                            break block17;
                        }
                        case -1456815719: {
                            v1 = true;
                            var5_4 /* !! */  = (com.github.epsilon.t.c(31806, 446638727249281901L) - com.github.epsilon.t.c(16300, 4042412312829067574L)) / 5 + com.github.epsilon.t.c(23308, 5704133378226185702L);
                            if (var3_3) {
                                break block11;
                            }
                            break block13;
                        }
                        case -1456815720: {
                            v1 = false;
                            if (!var3_3) break block11;
                            return v1;
                        }
                        case -1456815718: {
                            com.github.epsilon.t.E("DZYOta6dqi7RJjOj", Q());
                            return (boolean)hi.a("G", (long)561677051612723832L);
                        }
                    }
lbl46:
                    // 2 sources

                    var5_4 /* !! */  = com.github.epsilon.t.c(1711, 4869733373678762228L) / com.github.epsilon.t.c(8697, 5414661807968853762L) * com.github.epsilon.t.c(5042, 1455828746749947279L) ^ com.github.epsilon.t.c(28222, 2835979314720428078L);
                    if (!var3_3) continue;
                }
                var5_4 /* !! */  = com.github.epsilon.t.c(16401, 3103529051814231868L) / com.github.epsilon.t.c(31819, 4115033044911145786L) ^ com.github.epsilon.t.c(5821, 1729803015741647436L);
            }
            var5_4 /* !! */  = (com.github.epsilon.t.c(25504, 3089539306835598362L) - com.github.epsilon.t.c(4441, 7311407299141545929L)) / 5 + com.github.epsilon.t.c(996, 9124688835455564893L);
        }
        switch (var5_4 /* !! */ ) {
            default: {
                return v1;
            }
            case 228130689: 
        }
        throw null;
    }

    public static /* bridge */ /* synthetic */ CallSite E(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private t() {
        super(com.github.epsilon.t.b(-20294, -23667), (vY)((Object)hi.a("j", (long)456237291118568391L)));
        this.w = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.t.b(-20293, 25819), (boolean)true, this::lambda$new$0, (long)1197648209052129808L);
        this.N = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.t.b(-20289, -2812), (boolean)true, this::lambda$new$1, (long)1197648209052129808L);
        this.H = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.t.b(-20296, -5266), (boolean)true, this::lambda$new$2, (long)1197648209052129808L);
        hi.a("\u00f2", (Object)this, (int)com.github.epsilon.t.c(17222, 9113421035695045706L), (long)410693938552110621L);
        this.h = new LinkedBlockingQueue();
    }

    private boolean lambda$new$1() {
        boolean bl = Dl.t();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)409394569713009562L), (long)511460060498514638L);
        if (!bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    private boolean lambda$new$2() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)741347967217910910L), (long)511460060498514638L);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)25, t.class);
        Hidden0.special_clinit_25_90(t.class);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void v(Object[] var1_1) {
        block12: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = (com.github.epsilon.t.E("DZYOta6dqi7RJjOj", max(int int ), (int)(com.github.epsilon.t.c(15023, 777334294524659110L) + com.github.epsilon.t.c(23379, 994147547168629978L)), (int)com.github.epsilon.t.c(16537, 5511319565495139840L)) - com.github.epsilon.t.c(20249, 7148491046080147762L)) / com.github.epsilon.t.c(29293, 7674356144553151761L) ^ com.github.epsilon.t.c(15737, 4637917296614441729L);
            if (var3_3) break block12;
lbl6:
            // 2 sources

            while (true) {
                v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)576702934539419094L) % 2;
                if (!var3_3) ** GOTO lbl40
                if (v0 != false) ** GOTO lbl39
                ** GOTO lbl42
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                v1 = com.github.epsilon.t.E("DZYOta6dqi7RJjOj", getUseItemRemainingTicks(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                v2 = com.github.epsilon.t.c(24878, 9042674282475249316L);
                if (!var3_3) ** GOTO lbl46
                if (v1 > v2) ** GOTO lbl44
                ** GOTO lbl48
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)((D2)var2_2), (Object)new Object[]{false}, (long)1284770739508758974L);
                if (!var3_3) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl50
                break;
            }
        }
        while (true) {
            switch (var4_4 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 2054843872: {
                    ** continue;
                }
                case 2054843871: {
                    ** continue;
                }
                case 2054843868: {
                    ** continue;
                }
                case 2054843870: 
            }
            hi.a("G", (long)767645364166240833L);
            var4_4 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.t.c(31172, 788255704647222921L), (int)com.github.epsilon.t.c(29177, 1776928801671564935L), (long)834203424483934088L) - com.github.epsilon.t.c(21074, 963417424101928229L));
            if (var3_3) continue;
lbl39:
            // 2 sources

            v0 = hi.a("G", (int)((com.github.epsilon.t.c(30865, 2182418797705414272L) ^ com.github.epsilon.t.c(11020, 2029542663531926676L)) / 5), (int)com.github.epsilon.t.c(1023, 2262418549383347391L), (long)834203424483934088L) * com.github.epsilon.t.c(22664, 756672633209251619L) - com.github.epsilon.t.c(3292, 5206920577513009907L);
lbl40:
            // 2 sources

            var4_4 /* !! */  = (int)v0;
            if (var3_3) continue;
lbl42:
            // 2 sources

            var4_4 /* !! */  = hi.a("G", (int)(com.github.epsilon.t.c(6815, 8497938622016398598L) * com.github.epsilon.t.c(3112, 4852738089467490520L)), (int)com.github.epsilon.t.c(30750, 2405000825163531515L), (long)834203424483934088L) ^ com.github.epsilon.t.c(10825, 8891871716155004372L);
            if (var3_3) continue;
lbl44:
            // 2 sources

            v1 = hi.a("G", (int)((com.github.epsilon.t.c(6275, 8144921272159053364L) ^ com.github.epsilon.t.c(892, 6933652068405362065L)) / 5), (int)com.github.epsilon.t.c(8918, 4973456945540373514L), (long)834203424483934088L) * com.github.epsilon.t.c(24282, 8516999305991938327L);
            v2 = com.github.epsilon.t.c(28805, 2641021659449904740L);
lbl46:
            // 2 sources

            var4_4 /* !! */  = (int)(v1 - v2);
            if (var3_3) continue;
lbl48:
            // 2 sources

            var4_4 /* !! */  = com.github.epsilon.t.c(7060, 6978867894778242214L) - com.github.epsilon.t.c(17651, 653312314830355029L) + com.github.epsilon.t.c(5308, 3156194843718101784L);
            if (var3_3) continue;
lbl50:
            // 2 sources

            var4_4 /* !! */  = (int)(hi.a("G", (int)((com.github.epsilon.t.c(6275, 8144921272159053364L) ^ com.github.epsilon.t.c(892, 6933652068405362065L)) / 5), (int)com.github.epsilon.t.c(8918, 4973456945540373514L), (long)834203424483934088L) * com.github.epsilon.t.c(24282, 8516999305991938327L) - com.github.epsilon.t.c(28805, 2641021659449904740L));
        }
    }

    private void x(Object[] objectArray) {
        Object object = objectArray[0];
        hi.a("\u00a5", (Object)((D2)object), (Object)new Object[]{false}, (long)1284770739508758974L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    private void Y(dY var1_1) {
        block92: {
            block91: {
                block89: {
                    block90: {
                        block88: {
                            block87: {
                                block85: {
                                    block86: {
                                        block84: {
                                            block82: {
                                                block83: {
                                                    block81: {
                                                        block80: {
                                                            block78: {
                                                                block79: {
                                                                    block77: {
                                                                        block75: {
                                                                            block76: {
                                                                                block74: {
                                                                                    block73: {
                                                                                        block71: {
                                                                                            block72: {
                                                                                                block70: {
                                                                                                    block68: {
                                                                                                        block69: {
                                                                                                            block67: {
                                                                                                                block65: {
                                                                                                                    block66: {
                                                                                                                        block64: {
                                                                                                                            block63: {
                                                                                                                                block61: {
                                                                                                                                    block62: {
                                                                                                                                        block60: {
                                                                                                                                            block58: {
                                                                                                                                                block59: {
                                                                                                                                                    block57: {
                                                                                                                                                        block55: {
                                                                                                                                                            block56: {
                                                                                                                                                                block54: {
                                                                                                                                                                    block52: {
                                                                                                                                                                        block53: {
                                                                                                                                                                            var2_2 = Dl.t();
                                                                                                                                                                            var4_3 /* !! */  = com.github.epsilon.t.c(4647, 541343982790389010L) - com.github.epsilon.t.c(28058, 6179169937963668263L) - com.github.epsilon.t.c(2469, 6243720629404186516L);
                                                                                                                                                                            if (var2_2) lbl-1000:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            {
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)409394569713009562L), (long)511460060498514638L);
                                                                                                                                                                                    if (var2_2) break block52;
                                                                                                                                                                                    if (v0 /* !! */  != false) break block53;
                                                                                                                                                                                    break block54;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl9:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                return;
lbl11:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)730053250739050863L);
                                                                                                                                                                                    if (var2_2) break block55;
                                                                                                                                                                                    if (v1 /* !! */  == false) break block56;
                                                                                                                                                                                    break block57;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl16:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v2 = this;
                                                                                                                                                                                    hi.a("\u00f2", (Object)v2, (int)(hi.a("\u00e9", (Object)v2, (long)1238143094422900030L) + true), (long)1238143094422900030L);
                                                                                                                                                                                    v3 /* !! */  = hi.a("G", (long)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)574721318267708693L), (long)1156419347669670908L), (Predicate<Packet>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onSendPosition$0(net.minecraft.network.protocol.Packet ), (Lnet/minecraft/network/protocol/Packet;)Z)(), (long)1143211481283200773L), (long)917299983733623274L), (long)1201976680630014545L);
                                                                                                                                                                                    v4 = com.github.epsilon.t.c(17129, 2455852682999135695L);
                                                                                                                                                                                    if (var2_2) break block58;
                                                                                                                                                                                    if (v3 /* !! */  <= v4) break block59;
                                                                                                                                                                                    break block60;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl24:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    com.github.epsilon.t.E("DZYOta6dqi7RJjOj", l(float ), (float)-1.0f);
lbl27:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        v5 /* !! */  = hi.a("\u00e9", (Object)this, (long)1238143094422900030L);
                                                                                                                                                                                        v6 = 1;
                                                                                                                                                                                        if (var2_2) break block61;
                                                                                                                                                                                        if (v5 /* !! */  <= v6) break block62;
                                                                                                                                                                                        break block63;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl33:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v7 = new Object[2];
                                                                                                                                                                                    v7[1] = hi.a("\u00a5", (Object)hi.a("j", (long)836238345609589224L), (long)1335171215242130397L);
                                                                                                                                                                                    v7[0] = hi.a("\u00a5", (Object)this, (long)721675246255933332L);
                                                                                                                                                                                    hi.a("\u00a5", (Object)hi.a("j", (long)549148920996267385L), (Object)v7, (long)676286131554098443L);
                                                                                                                                                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1330274766107390732L), (boolean)false, (long)1105814777951322808L);
                                                                                                                                                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)980544755166241964L);
                                                                                                                                                                                    if (!var2_2) break block64;
lbl41:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        v8 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1015148049117770214L);
                                                                                                                                                                                        if (var2_2) break block65;
                                                                                                                                                                                        if (v8 /* !! */  == false) break block66;
                                                                                                                                                                                        break block67;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl46:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v9 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)913395637666077032L)}, (long)886483173019937015L);
                                                                                                                                                                                    if (var2_2) break block68;
                                                                                                                                                                                    if (v9 /* !! */  == false) break block69;
                                                                                                                                                                                    break block70;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl51:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v10 /* !! */  = hi.a("\u00e9", (Object)this, (long)730053250739050863L);
                                                                                                                                                                                    if (var2_2) break block71;
                                                                                                                                                                                    if (v10 /* !! */  != false) break block72;
                                                                                                                                                                                    break block73;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl56:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    hi.a("\u00f2", (Object)this, (boolean)true, (long)730053250739050863L);
                                                                                                                                                                                    hi.a("\u00f2", (Object)this, (int)0, (long)1238143094422900030L);
                                                                                                                                                                                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)913395637666077032L);
                                                                                                                                                                                    hi.a("\u00f2", (Object)this, (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var3_4, (long)769006157898026769L), (Object)var3_4, (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)891398038159096577L), (long)410693938552110621L);
                                                                                                                                                                                    if (!var2_2) break block74;
lbl62:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        v11 /* !! */  = hi.a("\u00e9", (Object)this, (long)730053250739050863L);
                                                                                                                                                                                        if (var2_2) break block75;
                                                                                                                                                                                        if (v11 /* !! */  == false) break block76;
                                                                                                                                                                                        break block77;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl67:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v12 /* !! */  = hi.a("\u00e9", (Object)this, (long)1238143094422900030L);
                                                                                                                                                                                    v13 = 1;
                                                                                                                                                                                    if (var2_2) break block78;
                                                                                                                                                                                    if (v12 /* !! */  != v13) break block79;
                                                                                                                                                                                    break block80;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl73:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    hi.a("G", (Object)new ServerboundPlayerActionPacket((ServerboundPlayerActionPacket.Action)hi.a("j", (long)587093938807128863L), (BlockPos)hi.a("j", (long)470615637083542920L), (Direction)hi.a("j", (long)1264475993069188471L)), (long)862951805677234099L);
                                                                                                                                                                                    hi.a("G", (Object)new ServerboundPlayerActionPacket((ServerboundPlayerActionPacket.Action)hi.a("j", (long)848845832377421936L), (BlockPos)hi.a("j", (long)470615637083542920L), (Direction)hi.a("j", (long)1264475993069188471L)), (long)862951805677234099L);
                                                                                                                                                                                    if (!var2_2) break block81;
lbl77:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        v14 /* !! */  = hi.a("\u00e9", (Object)this, (long)1238143094422900030L);
                                                                                                                                                                                        v15 = 2;
                                                                                                                                                                                        if (var2_2) break block82;
                                                                                                                                                                                        if (v14 /* !! */  != v15) break block83;
                                                                                                                                                                                        break block84;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl83:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v16 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1086290461730127835L);
lbl85:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (v16 == hi.a("j", (long)674060366868096922L)) {
                                                                                                                                                                                        break block85;
                                                                                                                                                                                    }
                                                                                                                                                                                    break block86;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl88:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    continue;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl90:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v16 = hi.a("j", (long)674060366868096922L);
                                                                                                                                                                                    if (!var2_2) break block87;
lbl93:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        var3_4 = v16;
                                                                                                                                                                                        com.github.epsilon.t.E("DZYOta6dqi7RJjOj", send(net.minecraft.network.protocol.Packet ), (ClientPacketListener)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (Packet)new ServerboundUseItemPacket((InteractionHand)var3_4, (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (long)1334946007788996857L), (long)434462414426861306L), (long)675508859882252821L), (float)hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)new Object[0], (long)1186016776197838097L), (float)hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)new Object[0], (long)1020209408883681757L)));
                                                                                                                                                                                        if (!var2_2) break block88;
lbl97:
                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            v17 /* !! */  = hi.a("\u00e9", (Object)this, (long)1238143094422900030L);
                                                                                                                                                                                            v18 /* !! */  = hi.a("\u00e9", (Object)this, (long)410693938552110621L) + 3;
                                                                                                                                                                                            if (var2_2) break block89;
                                                                                                                                                                                            if (v17 /* !! */  <= v18 /* !! */ ) break block90;
                                                                                                                                                                                            break block91;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl103:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (Object)new ServerboundPlayerActionPacket((ServerboundPlayerActionPacket.Action)hi.a("j", (long)848845832377421936L), (BlockPos)hi.a("j", (long)470615637083542920L), (Direction)hi.a("j", (long)1264475993069188471L)), (long)367302555785540234L);
                                                                                                                                                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1330274766107390732L), (boolean)false, (long)1105814777951322808L);
                                                                                                                                                                                    hi.a("\u00f2", (Object)this, (int)0, (long)1238143094422900030L);
                                                                                                                                                                                    hi.a("\u00f2", (Object)this, (boolean)false, (long)730053250739050863L);
                                                                                                                                                                                    if (var2_2) lbl-1000:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    {
                                                                                                                                                                                        return;
                                                                                                                                                                                    }
                                                                                                                                                                                    break block92;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                            }
lbl112:
                                                                                                                                                                            // 31 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                switch (var4_3 /* !! */ ) {
                                                                                                                                                                                    default: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054102: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054098: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054103: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054096: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054089: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054097: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054093: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054100: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054088: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054085: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054099: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054105: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054101: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054092: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054094: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054086: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054091: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054095: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 1585054090: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    ** case 1585054104:
lbl155:
                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                    ** continue;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            }
lbl156:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                switch (var4_3 /* !! */ ) {
                                                                                                                                                                                    default: {
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    case -2087884917: 
                                                                                                                                                                                }
                                                                                                                                                                                hi.a("G", (float)0.0f, (float)2.0f, (float)-1.0f, (float)1.0f, (long)1107932821409857423L);
                                                                                                                                                                                var4_3 /* !! */  = (int)(hi.a("G", (int)(com.github.epsilon.t.c(182, 5131030592669040342L) ^ com.github.epsilon.t.c(15558, 297129172639351381L) ^ com.github.epsilon.t.c(21479, 5685411720945986668L)), (int)com.github.epsilon.t.c(10502, 5574960398778996550L), (long)834203424483934088L) + com.github.epsilon.t.c(19747, 1767617955097571877L));
                                                                                                                                                                                if (var2_2) ** GOTO lbl85
                                                                                                                                                                                continue;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v0 /* !! */  = (CallSite)((com.github.epsilon.t.c(10240, 7990771479578547725L) * com.github.epsilon.t.c(8897, 7046494649212148738L) / com.github.epsilon.t.c(5671, 5891784006326888575L) ^ com.github.epsilon.t.c(7609, 7823669788044370684L)) + com.github.epsilon.t.c(28432, 5908664381249966182L));
                                                                                                                                                                    }
                                                                                                                                                                    var4_3 /* !! */  = (int)v0 /* !! */ ;
                                                                                                                                                                    if (!var2_2) ** GOTO lbl112
                                                                                                                                                                }
                                                                                                                                                                var4_3 /* !! */  = (int)(hi.a("G", (int)(com.github.epsilon.t.c(30675, 2959733948396325147L) + com.github.epsilon.t.c(28148, 6004096314697404681L) - com.github.epsilon.t.c(29707, 956128333645204104L)), (int)com.github.epsilon.t.c(2292, 1835210372055316159L), (long)834203424483934088L) / com.github.epsilon.t.c(32184, 1596051901519282713L) + com.github.epsilon.t.c(32249, 2896931024437756562L));
                                                                                                                                                                if (!var2_2) ** GOTO lbl112
                                                                                                                                                            }
                                                                                                                                                            v1 /* !! */  = (CallSite)((com.github.epsilon.t.c(26774, 7748869948293928640L) + com.github.epsilon.t.c(17413, 5074086435246111484L) ^ com.github.epsilon.t.c(32155, 211429905068737096L)) + com.github.epsilon.t.c(26382, 4781844356126791689L));
                                                                                                                                                        }
                                                                                                                                                        var4_3 /* !! */  = (int)v1 /* !! */ ;
                                                                                                                                                        if (!var2_2) ** GOTO lbl112
                                                                                                                                                    }
                                                                                                                                                    var4_3 /* !! */  = (com.github.epsilon.t.c(3607, 8452715958557782120L) + com.github.epsilon.t.c(32380, 6039820662553133492L) + com.github.epsilon.t.c(13317, 6643719932478491153L)) / com.github.epsilon.t.c(20508, 3557593939801960429L) - com.github.epsilon.t.c(26975, 7439785108486641601L);
                                                                                                                                                    if (!var2_2) ** GOTO lbl112
                                                                                                                                                }
                                                                                                                                                v3 /* !! */  = (CallSite)(com.github.epsilon.t.c(27448, 4319229560230040897L) + com.github.epsilon.t.c(17419, 3129371062214359924L) ^ com.github.epsilon.t.c(15419, 368770144545473461L));
                                                                                                                                                v4 = com.github.epsilon.t.c(27519, 5773595868166182348L);
                                                                                                                                            }
                                                                                                                                            var4_3 /* !! */  = (int)(v3 /* !! */  + v4);
                                                                                                                                            if (!var2_2) ** GOTO lbl112
                                                                                                                                        }
                                                                                                                                        var4_3 /* !! */  = com.github.epsilon.t.c(1361, 9177910028213369254L) / com.github.epsilon.t.c(31819, 4115033044911145786L) - com.github.epsilon.t.c(21298, 8604364723617557992L) ^ com.github.epsilon.t.c(25079, 6877890384424034081L);
                                                                                                                                        if (!var2_2) ** GOTO lbl112
                                                                                                                                    }
                                                                                                                                    v5 /* !! */  = (CallSite)(com.github.epsilon.t.c(27448, 4319229560230040897L) + com.github.epsilon.t.c(17419, 3129371062214359924L) ^ com.github.epsilon.t.c(15419, 368770144545473461L));
                                                                                                                                    v6 = com.github.epsilon.t.c(27519, 5773595868166182348L);
                                                                                                                                }
                                                                                                                                var4_3 /* !! */  = (int)(v5 /* !! */  + v6);
                                                                                                                                if (!var2_2) ** GOTO lbl112
                                                                                                                            }
                                                                                                                            var4_3 /* !! */  = com.github.epsilon.t.c(14383, 1281772641228621567L) - com.github.epsilon.t.c(435, 8998500714830806355L) ^ com.github.epsilon.t.c(26274, 2417203701750192569L);
                                                                                                                            if (!var2_2) ** GOTO lbl112
                                                                                                                        }
                                                                                                                        var4_3 /* !! */  = (com.github.epsilon.t.c(27448, 4319229560230040897L) + com.github.epsilon.t.c(17419, 3129371062214359924L) ^ com.github.epsilon.t.c(15419, 368770144545473461L)) + com.github.epsilon.t.c(27519, 5773595868166182348L);
                                                                                                                        if (!var2_2) ** GOTO lbl112
                                                                                                                    }
                                                                                                                    v8 /* !! */  = (CallSite)(hi.a("G", (int)(com.github.epsilon.t.c(12991, 5804201536673582136L) / com.github.epsilon.t.c(19481, 3381444535283544793L)), (int)com.github.epsilon.t.c(20273, 6830014039009161580L), (long)834203424483934088L) ^ com.github.epsilon.t.c(29982, 626187844535569241L));
                                                                                                                }
                                                                                                                var4_3 /* !! */  = (int)v8 /* !! */ ;
                                                                                                                if (!var2_2) ** GOTO lbl112
                                                                                                            }
                                                                                                            var4_3 /* !! */  = com.github.epsilon.t.c(27738, 8860522993914336186L) - com.github.epsilon.t.c(17518, 9108179435890670141L) - com.github.epsilon.t.c(4348, 324041339567026082L) + com.github.epsilon.t.c(16628, 2566896386791800629L);
                                                                                                            if (!var2_2) ** GOTO lbl112
                                                                                                        }
                                                                                                        v9 /* !! */  = (CallSite)(hi.a("G", (int)(com.github.epsilon.t.c(26824, 1158763642141890261L) / com.github.epsilon.t.c(2257, 3069158278182811324L)), (int)com.github.epsilon.t.c(1932, 863270975848593763L), (long)834203424483934088L) ^ com.github.epsilon.t.c(11682, 7888851141931078290L));
                                                                                                    }
                                                                                                    var4_3 /* !! */  = (int)v9 /* !! */ ;
                                                                                                    if (!var2_2) ** GOTO lbl112
                                                                                                }
                                                                                                var4_3 /* !! */  = com.github.epsilon.t.c(31616, 69087773312435339L) * com.github.epsilon.t.c(20897, 6642975253173858217L) / 4 ^ com.github.epsilon.t.c(23405, 8582253908485956784L);
                                                                                                if (!var2_2) ** GOTO lbl112
                                                                                            }
                                                                                            v10 /* !! */  = (CallSite)(hi.a("G", (int)(com.github.epsilon.t.c(26824, 1158763642141890261L) / com.github.epsilon.t.c(2257, 3069158278182811324L)), (int)com.github.epsilon.t.c(1932, 863270975848593763L), (long)834203424483934088L) ^ com.github.epsilon.t.c(11682, 7888851141931078290L));
                                                                                        }
                                                                                        var4_3 /* !! */  = (int)v10 /* !! */ ;
                                                                                        if (!var2_2) ** GOTO lbl112
                                                                                    }
                                                                                    var4_3 /* !! */  = com.github.epsilon.t.c(4232, 5478480148945546782L) / com.github.epsilon.t.c(28224, 5742723874724827414L) * com.github.epsilon.t.c(21859, 4755162024973363959L) + com.github.epsilon.t.c(30651, 2599839694951041296L);
                                                                                    ** GOTO lbl112
                                                                                }
                                                                                var4_3 /* !! */  = hi.a("G", (int)(com.github.epsilon.t.c(26824, 1158763642141890261L) / com.github.epsilon.t.c(2257, 3069158278182811324L)), (int)com.github.epsilon.t.c(1932, 863270975848593763L), (long)834203424483934088L) ^ com.github.epsilon.t.c(11682, 7888851141931078290L);
                                                                                if (!var2_2) ** GOTO lbl112
                                                                            }
                                                                            v11 /* !! */  = (CallSite)((com.github.epsilon.t.c(1759, 4642336983132125381L) ^ com.github.epsilon.t.c(28041, 7703609468947616705L)) / com.github.epsilon.t.c(18849, 376525174699652724L) / com.github.epsilon.t.c(9150, 518369894273457658L) - com.github.epsilon.t.c(2116, 2041887359888865207L) + com.github.epsilon.t.c(8450, 4074014943496478718L));
                                                                        }
                                                                        var4_3 /* !! */  = (int)v11 /* !! */ ;
                                                                        if (!var2_2) ** GOTO lbl112
                                                                    }
                                                                    var4_3 /* !! */  = ((com.github.epsilon.t.c(22414, 8061194466801543643L) ^ com.github.epsilon.t.c(8156, 3176238751773827441L)) / com.github.epsilon.t.c(18346, 6113141954787113317L) ^ com.github.epsilon.t.c(19972, 5067652445011243750L)) / com.github.epsilon.t.c(2257, 3069158278182811324L) + com.github.epsilon.t.c(4020, 3533039197143838872L);
                                                                    if (!var2_2) ** GOTO lbl112
                                                                }
                                                                v12 /* !! */  = (CallSite)(((com.github.epsilon.t.c(24251, 2790407016551145719L) ^ com.github.epsilon.t.c(17415, 7663048219880651546L)) * com.github.epsilon.t.c(3497, 483959777406464752L) + com.github.epsilon.t.c(2532, 2550147167020201958L)) / com.github.epsilon.t.c(20836, 41633708009614748L));
                                                                v13 = com.github.epsilon.t.c(5128, 1414162470302329433L);
                                                            }
                                                            var4_3 /* !! */  = (int)(v12 /* !! */  + v13);
                                                            if (!var2_2) ** GOTO lbl112
                                                        }
                                                        var4_3 /* !! */  = com.github.epsilon.t.c(13544, 3917450040120904503L) / com.github.epsilon.t.c(12911, 6372129312419581130L) ^ com.github.epsilon.t.c(512, 8313743820423117854L);
                                                        if (!var2_2) ** GOTO lbl112
                                                    }
                                                    var4_3 /* !! */  = ((com.github.epsilon.t.c(6763, 2999073507189499349L) ^ com.github.epsilon.t.c(31727, 5531525608273364083L)) * com.github.epsilon.t.c(21145, 776949489893535077L) + com.github.epsilon.t.c(15884, 7937141186672001767L)) / com.github.epsilon.t.c(20836, 41633708009614748L) + com.github.epsilon.t.c(963, 1580466459024637027L);
                                                    if (!var2_2) ** GOTO lbl112
                                                }
                                                v14 /* !! */  = (CallSite)((com.github.epsilon.t.c(14420, 9153078713438111712L) ^ com.github.epsilon.t.c(22652, 2070770906389899211L)) + com.github.epsilon.t.c(18016, 2450344523016141145L) + com.github.epsilon.t.c(4050, 1662799074395140904L));
                                                v15 = com.github.epsilon.t.c(21824, 6313225716177300086L);
                                            }
                                            var4_3 /* !! */  = (int)(v14 /* !! */  + v15);
                                            if (!var2_2) ** GOTO lbl112
                                        }
                                        var4_3 /* !! */  = com.github.epsilon.t.c(18043, 839854978466576829L) / 5 - com.github.epsilon.t.c(20884, 5212342084364037915L);
                                        if (!var2_2) ** GOTO lbl112
                                    }
                                    var4_3 /* !! */  = (com.github.epsilon.t.c(3652, 3241878345416487315L) - com.github.epsilon.t.c(24716, 606679280201391966L)) * com.github.epsilon.t.c(11841, 5009657472229773326L) + com.github.epsilon.t.c(9908, 5834023396114078160L);
                                    if (!var2_2) ** GOTO lbl112
                                }
                                var4_3 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.t.c(1979, 2771225467663366989L), (int)com.github.epsilon.t.c(16909, 3096414755727638240L), (long)834203424483934088L) - com.github.epsilon.t.c(27683, 4839368119580185172L));
                                ** GOTO lbl112
                                v16 = hi.a("j", (long)844572035549319610L);
                                var4_3 /* !! */  = com.github.epsilon.t.c(15657, 6864321820156658442L) + com.github.epsilon.t.c(4457, 6728029149519818438L) ^ com.github.epsilon.t.c(16307, 3593205679658533011L) ^ com.github.epsilon.t.c(19587, 7818954681209942535L) ^ com.github.epsilon.t.c(12294, 2852023486047751786L);
                                if (!var2_2) ** GOTO lbl156
                            }
                            var4_3 /* !! */  = com.github.epsilon.t.c(31193, 6212523356103395171L) + com.github.epsilon.t.c(18426, 602221131504417179L) ^ com.github.epsilon.t.c(23328, 8346943534575969320L) ^ com.github.epsilon.t.c(19494, 4568256898320724657L) ^ com.github.epsilon.t.c(19318, 3326323611370550501L);
                            ** while (true)
                        }
                        var4_3 /* !! */  = (com.github.epsilon.t.c(9043, 5548376132477787200L) ^ com.github.epsilon.t.c(9248, 4079345376831412927L)) + com.github.epsilon.t.c(26829, 1651847938564511380L) + com.github.epsilon.t.c(26850, 1394424362076493589L) + com.github.epsilon.t.c(9589, 3433452382807497433L);
                        if (!var2_2) ** GOTO lbl112
                    }
                    v17 /* !! */  = (CallSite)((com.github.epsilon.t.c(4336, 2679292389063176021L) ^ com.github.epsilon.t.c(7808, 2494473723905646665L)) / com.github.epsilon.t.c(18346, 6113141954787113317L) / com.github.epsilon.t.c(8697, 5414661807968853762L) - com.github.epsilon.t.c(18967, 6736764991957300232L));
                    v18 /* !! */  = (reference)com.github.epsilon.t.c(32634, 310862301114548579L);
                }
                var4_3 /* !! */  = (int)(v17 /* !! */  + v18 /* !! */ );
                if (!var2_2) ** GOTO lbl112
            }
            var4_3 /* !! */  = hi.a("G", (int)(com.github.epsilon.t.c(27868, 1339066911462609737L) * com.github.epsilon.t.c(8098, 7286247144690688453L)), (int)com.github.epsilon.t.c(14863, 1361522687494424057L), (long)834203424483934088L) * com.github.epsilon.t.c(25150, 5037584380374277579L) ^ com.github.epsilon.t.c(20715, 8636971139445223388L);
            if (!var2_2) ** GOTO lbl112
        }
        var4_3 /* !! */  = (com.github.epsilon.t.c(4336, 2679292389063176021L) ^ com.github.epsilon.t.c(7808, 2494473723905646665L)) / com.github.epsilon.t.c(18346, 6113141954787113317L) / com.github.epsilon.t.c(8697, 5414661807968853762L) - com.github.epsilon.t.c(18967, 6736764991957300232L) + com.github.epsilon.t.c(32634, 310862301114548579L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void w() {
        var1_1 = Dl.S();
        var3_2 = hi.a("G", (int)(com.github.epsilon.t.c(29419, 490464102955961868L) - com.github.epsilon.t.c(14806, 2579771348476462614L) ^ com.github.epsilon.t.c(24181, 4392982951946510383L) ^ com.github.epsilon.t.c(20834, 155181242503982607L)), (int)com.github.epsilon.t.c(26449, 1139031313032436143L), (long)834203424483934088L) ^ com.github.epsilon.t.c(8084, 9064398977562157926L);
        if (var1_1) ** GOTO lbl28
lbl4:
        // 2 sources

        while (true) {
            block18: {
                if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L) == null) break block18;
                var3_2 = (com.github.epsilon.t.c(883, 1312115362857827597L) / com.github.epsilon.t.c(31819, 4115033044911145786L) + com.github.epsilon.t.c(23476, 5149486392304789313L) ^ com.github.epsilon.t.c(11833, 5202889418672181502L)) + com.github.epsilon.t.c(31947, 1324964913519870498L);
                if (var1_1) ** GOTO lbl28
            }
            var3_2 = com.github.epsilon.t.c(12361, 1020780858291195783L) * com.github.epsilon.t.c(24421, 4961098083765116984L) / com.github.epsilon.t.c(2257, 3069158278182811324L) / com.github.epsilon.t.c(14656, 5283305419909040024L) - com.github.epsilon.t.c(3441, 4808042748519527281L) - com.github.epsilon.t.c(20478, 7005853606468481132L);
            if (var1_1) ** GOTO lbl28
            if (true) ** GOTO lbl48
            break;
        }
        block10: while (true) {
            block20: {
                block19: {
                    if ((var2_3 = (Packet)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)574721318267708693L), (long)1301437844313763062L)) != null) break block19;
                    var3_2 = (hi.a("G", (int)((com.github.epsilon.t.c(17614, 4154202871621975000L) ^ com.github.epsilon.t.c(22715, 6555972905433294690L)) - com.github.epsilon.t.c(30050, 3630928567353297785L)), (int)com.github.epsilon.t.c(11067, 6712740036608235485L), (long)834203424483934088L) ^ com.github.epsilon.t.c(6583, 5701661444009076582L)) - com.github.epsilon.t.c(22153, 3768015604813195459L);
                    if (var1_1) break block20;
                }
                var3_2 = (com.github.epsilon.t.c(4927, 8904520184366935078L) - com.github.epsilon.t.c(31373, 8148102575087043720L)) * com.github.epsilon.t.c(11100, 7049512583315952754L) ^ com.github.epsilon.t.c(26355, 6242153358883412212L);
                if (var1_1) {
                    switch (var3_2) {
                        default: {
                            hi.a("\u00a5", (Object)var2_3, (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (long)706660186889672229L);
                            if (var1_1) break;
                            return;
                        }
                        case 1569380400: {
                            throw null;
                        }
                    }
                }
                var3_2 = (com.github.epsilon.t.c(2994, 4549158118289323099L) / com.github.epsilon.t.c(31819, 4115033044911145786L) + com.github.epsilon.t.c(10488, 8591258070401881620L) ^ com.github.epsilon.t.c(5649, 2895195741807651169L)) + com.github.epsilon.t.c(32075, 2733317307159659254L);
            }
            block11: while (true) {
                switch (var3_2) {
                    default: {
                        ** continue;
                    }
                    case 1970819482: {
                        com.github.epsilon.t.E("DZYOta6dqi7RJjOj", clear(), (Queue)hi.a("\u00e9", (Object)this, (long)574721318267708693L));
                        if (!var1_1) {
                            continue block10;
                        }
                        ** GOTO lbl48
                    }
                    case 1970819484: {
                        continue block10;
                    }
                    case 1970819485: {
                        hi.a("G", (float)9.0f, (float)-1.0f, (float)10.0f, (float)0.0f, (float)0.5f, (long)1187820213443169771L);
                        hi.a("G", (long)950198111158744364L);
                        var3_2 = com.github.epsilon.t.c(26057, 1441946254701091820L) + com.github.epsilon.t.c(27805, 4724658997407929081L) ^ com.github.epsilon.t.c(4470, 1059583410081836444L);
                        continue block11;
                    }
lbl48:
                    // 2 sources

                    var3_2 = (hi.a("G", (int)((com.github.epsilon.t.c(14036, 2367534166013151340L) ^ com.github.epsilon.t.c(11774, 3754574290549248263L)) - com.github.epsilon.t.c(18837, 9010902718915868403L)), (int)com.github.epsilon.t.c(10764, 7330425233277654281L), (long)834203424483934088L) ^ com.github.epsilon.t.c(30245, 7055440577655818622L)) - com.github.epsilon.t.c(3343, 5038846202590442062L);
                    continue block11;
                    case 1970819483: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void H(Object[] var1_1) {
        block19: {
            block18: {
                block16: {
                    block17: {
                        block15: {
                            block13: {
                                block14: {
                                    var2_2 = var1_1[0];
                                    var3_3 = Dl.t();
                                    var4_4 /* !! */  = (com.github.epsilon.t.c(28487, 995012493319918507L) ^ com.github.epsilon.t.c(19945, 6765108511314866803L) ^ com.github.epsilon.t.c(10725, 4984364847155549839L)) - com.github.epsilon.t.c(7856, 1211877908752114137L) - com.github.epsilon.t.c(28317, 618521837842387344L);
                                    if (var3_3) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)576702934539419094L) % 3;
                                            if (var3_3) break block13;
                                            if (v0 != false) break block14;
                                            break block15;
                                            break;
                                        }
lbl11:
                                        // 1 sources

                                        while (true) {
                                            v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)576702934539419094L);
                                            v2 = com.github.epsilon.t.c(24878, 9042674282475249316L);
                                            if (var3_3) break block16;
                                            if (v1 > v2) break block17;
                                            break block18;
                                            break;
                                        }
lbl17:
                                        // 1 sources

                                        while (true) {
                                            hi.a("\u00a5", (Object)((D2)var2_2), (Object)new Object[]{false}, (long)1284770739508758974L);
                                            if (var3_3) lbl-1000:
                                            // 2 sources

                                            {
                                                return;
                                            }
                                            break block19;
                                            break;
                                        }
                                    }
lbl23:
                                    // 7 sources

                                    while (true) {
                                        switch (var4_4 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -1371268271: {
                                                ** continue;
                                            }
                                            case -1371268273: {
                                                ** continue;
                                            }
                                            case -1371268274: {
                                                ** continue;
                                            }
                                            case -1371268272: 
                                        }
                                        throw null;
                                    }
                                }
                                v0 = hi.a("G", (int)com.github.epsilon.t.c(8221, 903583117108026914L), (int)com.github.epsilon.t.c(18653, 3154981098268817394L), (long)834203424483934088L) - com.github.epsilon.t.c(20514, 3829985775468801959L);
                            }
                            var4_4 /* !! */  = (int)v0;
                            if (!var3_3) ** GOTO lbl23
                        }
                        var4_4 /* !! */  = (com.github.epsilon.t.c(30814, 5428627772999813020L) + com.github.epsilon.t.c(4612, 8613829724746493319L)) / 4 / com.github.epsilon.t.c(18346, 6113141954787113317L) ^ com.github.epsilon.t.c(24927, 5690535328000892437L);
                        if (!var3_3) ** GOTO lbl23
                    }
                    v1 = hi.a("G", (int)com.github.epsilon.t.c(4333, 241541477767032349L), (int)com.github.epsilon.t.c(21060, 6038150647114558661L), (long)834203424483934088L);
                    v2 = com.github.epsilon.t.c(29304, 6466632728509206009L);
                }
                var4_4 /* !! */  = (int)(v1 - v2);
                if (!var3_3) ** GOTO lbl23
            }
            var4_4 /* !! */  = com.github.epsilon.t.c(28340, 9066037034158084517L) / com.github.epsilon.t.c(2257, 3069158278182811324L) - com.github.epsilon.t.c(31507, 6279360104886125873L) - com.github.epsilon.t.c(23758, 7549600193567908749L);
            if (!var3_3) ** GOTO lbl23
        }
        var4_4 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.t.c(4333, 241541477767032349L), (int)com.github.epsilon.t.c(21060, 6038150647114558661L), (long)834203424483934088L) - com.github.epsilon.t.c(29304, 6466632728509206009L));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean l(Object[] var1_1) {
        block13: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = com.github.epsilon.t.c(13329, 8030342118925404943L) / 3 / com.github.epsilon.t.c(14656, 5283305419909040024L) - com.github.epsilon.t.c(24541, 6811225604633813378L);
            if (var2_2) ** GOTO lbl16
            block10: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 = hi.a("\u00a5", (Object)this, (long)1099153674733698693L);
                            if (!var2_2) break block14;
                            if (v0 != false) break block15;
                            v0 = hi.a("G", (int)(com.github.epsilon.t.c(20410, 4399177314793124047L) / com.github.epsilon.t.c(8697, 5414661807968853762L)), (int)com.github.epsilon.t.c(21098, 2832734107180330346L), (long)834203424483934088L) * com.github.epsilon.t.c(30698, 3352057879852173763L) - com.github.epsilon.t.c(25536, 280407050752351244L);
                        }
                        var3_3 /* !! */  = (int)v0;
                        if (var2_2) break block16;
                    }
                    var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)com.github.epsilon.t.c(16147, 5692849290965483964L), (int)com.github.epsilon.t.c(15241, 6266993114621576647L), (long)834203424483934088L) + com.github.epsilon.t.c(19383, 7205304137801201118L) - com.github.epsilon.t.c(8227, 6846200459217477359L)), (int)com.github.epsilon.t.c(3161, 7088149596545921580L), (long)834203424483934088L) + com.github.epsilon.t.c(31256, 4994071193443157731L));
                    if (!var2_2) ** GOTO lbl44
                }
                while (true) {
                    block21: {
                        block19: {
                            block20: {
                                block18: {
                                    block17: {
                                        switch (var3_3 /* !! */ ) {
                                            default: {
                                                continue block10;
                                            }
                                            case 1169036385: {
                                                v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)741347967217910910L), (long)511460060498514638L);
                                                if (!var2_2) break block17;
                                                if (v1 == false) break;
                                                break block18;
                                            }
                                            case 1169036382: {
                                                v2 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1120064086041354320L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                if (!var2_2) break block19;
                                                if (v2 == false) break block20;
                                                break block21;
                                            }
                                            case 1169036383: {
                                                v3 = true;
                                                var3_3 /* !! */  = com.github.epsilon.t.c(29840, 4729617866077162052L) / com.github.epsilon.t.c(9133, 376976205636312239L) - com.github.epsilon.t.c(29522, 6080776836975217850L);
                                                if (!var2_2) {
                                                    break block10;
                                                }
                                                break block13;
                                            }
                                            case 1169036384: {
                                                v3 = false;
                                                if (var2_2) break block10;
                                                return v3;
                                            }
                                            case 1169036386: {
                                                throw null;
                                            }
                                        }
lbl44:
                                        // 2 sources

                                        v1 = hi.a("G", (int)(com.github.epsilon.t.c(28205, 3142195458471317720L) / com.github.epsilon.t.c(8697, 5414661807968853762L)), (int)com.github.epsilon.t.c(9504, 4696982680183643017L), (long)834203424483934088L) * com.github.epsilon.t.c(12597, 3210515603014979382L) - com.github.epsilon.t.c(19902, 9185046590603489631L);
                                    }
                                    var3_3 /* !! */  = (int)v1;
                                    if (var2_2) continue;
                                }
                                var3_3 /* !! */  = com.github.epsilon.t.c(5233, 8902399897861139258L) / com.github.epsilon.t.c(30911, 1420881018311362553L) - com.github.epsilon.t.c(25387, 6827537775228345677L);
                                if (var2_2) continue;
                            }
                            v2 = hi.a("G", (int)(com.github.epsilon.t.c(28205, 3142195458471317720L) / com.github.epsilon.t.c(8697, 5414661807968853762L)), (int)com.github.epsilon.t.c(9504, 4696982680183643017L), (long)834203424483934088L) * com.github.epsilon.t.c(12597, 3210515603014979382L) - com.github.epsilon.t.c(19902, 9185046590603489631L);
                        }
                        var3_3 /* !! */  = (int)v2;
                        if (var2_2) continue;
                    }
                    var3_3 /* !! */  = (com.github.epsilon.t.c(17909, 8513882355461028695L) / 5 ^ com.github.epsilon.t.c(16691, 665124517194923856L)) / 5 + com.github.epsilon.t.c(3244, 464442365458395810L) + com.github.epsilon.t.c(28633, 2374145959290949661L);
                }
                break;
            }
            var3_3 /* !! */  = com.github.epsilon.t.c(1834, 9168863527369226588L) / com.github.epsilon.t.c(9133, 376976205636312239L) - com.github.epsilon.t.c(32517, 8271878833857151458L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v3;
            }
            case -1825726564: 
        }
        com.github.epsilon.t.E("DZYOta6dqi7RJjOj", t());
        return true;
    }

    public void i() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1330274766107390732L), (boolean)false, (long)1105814777951322808L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1216963348506174510L);
    }

    private static boolean lambda$onSendPosition$0(Packet packet) {
        return packet instanceof ClientboundPingPacket;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void J(dQ var1_1) {
        block16: {
            var2_2 = Dl.S();
            var5_3 /* !! */  = hi.a("G", (int)(com.github.epsilon.t.c(15196, 7289413696987170023L) - com.github.epsilon.t.c(1733, 2458846513925535911L) + com.github.epsilon.t.c(25986, 1734672826131077888L)), (int)com.github.epsilon.t.c(416, 6142544392950267780L), (long)834203424483934088L) - com.github.epsilon.t.c(2035, 9100796473246234627L);
            if (var2_2) break block16;
lbl4:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)409394569713009562L), (long)511460060498514638L);
                if (!var2_2) ** GOTO lbl63
                if (v0 /* !! */  == false) ** GOTO lbl62
                ** GOTO lbl64
                break;
            }
lbl9:
            // 2 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (boolean)false, (long)730053250739050863L);
                hi.a("\u00f2", (Object)this, (int)0, (long)1238143094422900030L);
                hi.a("\u00a5", (Object)this, (long)915704847731565449L);
                hi.a("G", (Object)new ServerboundPlayerActionPacket((ServerboundPlayerActionPacket.Action)hi.a("j", (long)587093938807128863L), (BlockPos)hi.a("j", (long)470615637083542920L), (Direction)hi.a("j", (long)1264475993069188471L)), (long)862951805677234099L);
                if (!var2_2) {
                    return;
                }
                ** GOTO lbl70
                break;
            }
        }
        block14: while (true) {
            switch (var5_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 656866196: {
                    v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)730053250739050863L);
                    if (!var2_2) ** GOTO lbl67
                    if (v1 /* !! */  == false) ** GOTO lbl66
                    ** GOTO lbl68
                }
                case 656866197: {
                    var4_5 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L);
                    v2 = var4_5 instanceof ServerboundPlayerActionPacket;
                    if (!var2_2) ** GOTO lbl38
                    if (v2 == 0) ** GOTO lbl37
                    ** GOTO lbl40
                }
                case 656866195: {
                    com.github.epsilon.t.E("DZYOta6dqi7RJjOj", values());
                    return;
                }
lbl37:
                // 1 sources

                v2 = com.github.epsilon.t.E("DZYOta6dqi7RJjOj", max(int int ), (int)hi.a("G", (int)(com.github.epsilon.t.c(244, 3892437906567741356L) / com.github.epsilon.t.c(31199, 8782495838086350768L) + com.github.epsilon.t.c(6459, 3616148710671951767L)), (int)com.github.epsilon.t.c(12291, 2900024464713813858L), (long)834203424483934088L), (int)com.github.epsilon.t.c(4587, 591919910128824245L)) ^ com.github.epsilon.t.c(29402, 6823780729422630043L);
lbl38:
                // 2 sources

                var5_3 /* !! */  = (reference)v2;
                if (var2_2) continue block14;
lbl40:
                // 2 sources

                var5_3 /* !! */  = (reference)(((com.github.epsilon.t.c(24495, 471999978288964063L) ^ com.github.epsilon.t.c(25321, 3543221487705316539L)) / com.github.epsilon.t.c(18346, 6113141954787113317L) ^ com.github.epsilon.t.c(22756, 7806330302101710488L)) - com.github.epsilon.t.c(10031, 6998992133513779415L) - com.github.epsilon.t.c(10326, 8041643251084006976L));
                switch (var5_3 /* !! */ ) {
                    default: {
                        var3_4 = (ServerboundPlayerActionPacket)var4_5;
                        if (!var2_2) ** GOTO lbl50
                        if (hi.a("\u00a5", (Object)var3_4, (long)1329132940748540815L) != hi.a("j", (long)848845832377421936L)) break;
                        ** GOTO lbl51
                    }
                    case -66407221: {
                        return;
                    }
                }
                var5_3 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)(com.github.epsilon.t.c(244, 3892437906567741356L) / com.github.epsilon.t.c(31199, 8782495838086350768L) + com.github.epsilon.t.c(6459, 3616148710671951767L)), (int)com.github.epsilon.t.c(12291, 2900024464713813858L), (long)834203424483934088L), (int)com.github.epsilon.t.c(4587, 591919910128824245L), (long)834203424483934088L) ^ com.github.epsilon.t.c(29402, 6823780729422630043L));
lbl50:
                // 2 sources

                if (var2_2) continue block14;
lbl51:
                // 2 sources

                var5_3 /* !! */  = (reference)(com.github.epsilon.t.c(25941, 2443797625973529454L) * com.github.epsilon.t.c(8516, 5681264812482076661L) - com.github.epsilon.t.c(19841, 2819059706407940830L));
                if (!var2_2) ** GOTO lbl70
                switch (var5_3 /* !! */ ) {
                    default: {
                        ** GOTO lbl9
                    }
                    case -1755194926: 
                }
                hi.a("G", (long)1124891203117124897L);
                if (!var2_2) ** break;
                ** continue;
lbl62:
                // 2 sources

                v0 /* !! */  = var5_3 /* !! */  = (reference)(hi.a("G", (int)com.github.epsilon.t.E("DZYOta6dqi7RJjOj", max(int int ), (int)(com.github.epsilon.t.c(3774, 2217785165439840688L) / com.github.epsilon.t.c(31199, 8782495838086350768L) + com.github.epsilon.t.c(13418, 4006284656780872193L)), (int)com.github.epsilon.t.c(4199, 4618767003656564226L)), (int)com.github.epsilon.t.c(31048, 7259366036803045131L), (long)834203424483934088L) ^ com.github.epsilon.t.c(28930, 9176818439247810285L));
lbl63:
                // 2 sources

                if (var2_2) continue block14;
lbl64:
                // 2 sources

                var5_3 /* !! */  = hi.a("G", (int)com.github.epsilon.t.c(25586, 4544371333449702659L), (int)com.github.epsilon.t.c(22089, 2336789801845745901L), (long)834203424483934088L) / com.github.epsilon.t.c(3698, 6973947980607434872L) / 5 - com.github.epsilon.t.c(5110, 8475075858819165325L) - com.github.epsilon.t.c(22690, 6287283456518219419L);
                if (var2_2) continue block14;
lbl66:
                // 2 sources

                v1 /* !! */  = var5_3 /* !! */  = (reference)(hi.a("G", (int)com.github.epsilon.t.E("DZYOta6dqi7RJjOj", max(int int ), (int)(com.github.epsilon.t.c(244, 3892437906567741356L) / com.github.epsilon.t.c(31199, 8782495838086350768L) + com.github.epsilon.t.c(6459, 3616148710671951767L)), (int)com.github.epsilon.t.c(12291, 2900024464713813858L)), (int)com.github.epsilon.t.c(4587, 591919910128824245L), (long)834203424483934088L) ^ com.github.epsilon.t.c(29402, 6823780729422630043L));
lbl67:
                // 2 sources

                if (var2_2) continue block14;
lbl68:
                // 2 sources

                var5_3 /* !! */  = (reference)(com.github.epsilon.t.c(19414, 5940519608727565706L) / com.github.epsilon.t.c(24628, 5975763641803595527L) + com.github.epsilon.t.c(8149, 5180463568775586044L));
                continue block14;
lbl70:
                // 2 sources

                var5_3 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)(com.github.epsilon.t.c(244, 3892437906567741356L) / com.github.epsilon.t.c(31199, 8782495838086350768L) + com.github.epsilon.t.c(6459, 3616148710671951767L)), (int)com.github.epsilon.t.c(12291, 2900024464713813858L), (long)834203424483934088L), (int)com.github.epsilon.t.c(4587, 591919910128824245L), (long)834203424483934088L) ^ com.github.epsilon.t.c(29402, 6823780729422630043L));
                continue block14;
                case 656866199: 
            }
            break;
        }
    }

    private boolean lambda$new$0() {
        boolean bl = Dl.S();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)376754187223505341L), (Object)hi.a("j", (long)409394569713009562L), (long)511460060498514638L);
        if (bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    @yE
    private void M(D2 var1_1) {
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

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFB0BA) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 50;
                case 1 -> 172;
                case 2 -> 45;
                case 3 -> 218;
                case 4 -> 242;
                case 5 -> 32;
                case 6 -> 133;
                case 7 -> 251;
                case 8 -> 117;
                case 9 -> 34;
                case 10 -> 100;
                case 11 -> 222;
                case 12 -> 141;
                case 13 -> 227;
                case 14 -> 53;
                case 15 -> 55;
                case 16 -> 116;
                case 17 -> 47;
                case 18 -> 145;
                case 19 -> 7;
                case 20 -> 22;
                case 21 -> 231;
                case 22 -> 87;
                case 23 -> 188;
                case 24 -> 85;
                case 25 -> 83;
                case 26 -> 236;
                case 27 -> 26;
                case 28 -> 66;
                case 29 -> 63;
                case 30 -> 255;
                case 31 -> 150;
                case 32 -> 99;
                case 33 -> 237;
                case 34 -> 208;
                case 35 -> 249;
                case 36 -> 89;
                case 37 -> 2;
                case 38 -> 9;
                case 39 -> 35;
                case 40 -> 123;
                case 41 -> 176;
                case 42 -> 10;
                case 43 -> 49;
                case 44 -> 171;
                case 45 -> 110;
                case 46 -> 19;
                case 47 -> 16;
                case 48 -> 157;
                case 49 -> 247;
                case 50 -> 186;
                case 51 -> 59;
                case 52 -> 183;
                case 53 -> 158;
                case 54 -> 170;
                case 55 -> 138;
                case 56 -> 14;
                case 57 -> 175;
                case 58 -> 62;
                case 59 -> 233;
                case 60 -> 126;
                case 61 -> 139;
                case 62 -> 189;
                case 63 -> 103;
                case 64 -> 193;
                case 65 -> 67;
                case 66 -> 140;
                case 67 -> 224;
                case 68 -> 18;
                case 69 -> 223;
                case 70 -> 118;
                case 71 -> 38;
                case 72 -> 88;
                case 73 -> 200;
                case 74 -> 21;
                case 75 -> 54;
                case 76 -> 52;
                case 77 -> 153;
                case 78 -> 217;
                case 79 -> 203;
                case 80 -> 214;
                case 81 -> 230;
                case 82 -> 148;
                case 83 -> 185;
                case 84 -> 114;
                case 85 -> 253;
                case 86 -> 219;
                case 87 -> 77;
                case 88 -> 31;
                case 89 -> 241;
                case 90 -> 28;
                case 91 -> 93;
                case 92 -> 245;
                case 93 -> 1;
                case 94 -> 8;
                case 95 -> 248;
                case 96 -> 197;
                case 97 -> 121;
                case 98 -> 108;
                case 99 -> 72;
                case 100 -> 44;
                case 101 -> 210;
                case 102 -> 161;
                case 103 -> 68;
                case 104 -> 113;
                case 105 -> 137;
                case 106 -> 42;
                case 107 -> 74;
                case 108 -> 94;
                case 109 -> 184;
                case 110 -> 239;
                case 111 -> 211;
                case 112 -> 216;
                case 113 -> 13;
                case 114 -> 169;
                case 115 -> 182;
                case 116 -> 165;
                case 117 -> 164;
                case 118 -> 20;
                case 119 -> 156;
                case 120 -> 146;
                case 121 -> 90;
                case 122 -> 17;
                case 123 -> 65;
                case 124 -> 51;
                case 125 -> 221;
                case 126 -> 46;
                case 127 -> 0;
                case 128 -> 102;
                case 129 -> 229;
                case 130 -> 215;
                case 131 -> 27;
                case 132 -> 149;
                case 133 -> 250;
                case 134 -> 4;
                case 135 -> 244;
                case 136 -> 160;
                case 137 -> 124;
                case 138 -> 235;
                case 139 -> 225;
                case 140 -> 76;
                case 141 -> 125;
                case 142 -> 187;
                case 143 -> 159;
                case 144 -> 40;
                case 145 -> 81;
                case 146 -> 238;
                case 147 -> 132;
                case 148 -> 162;
                case 149 -> 142;
                case 150 -> 12;
                case 151 -> 3;
                case 152 -> 254;
                case 153 -> 180;
                case 154 -> 198;
                case 155 -> 206;
                case 156 -> 120;
                case 157 -> 181;
                case 158 -> 73;
                case 159 -> 41;
                case 160 -> 96;
                case 161 -> 147;
                case 162 -> 220;
                case 163 -> 204;
                case 164 -> 57;
                case 165 -> 243;
                case 166 -> 154;
                case 167 -> 112;
                case 168 -> 91;
                case 169 -> 69;
                case 170 -> 194;
                case 171 -> 43;
                case 172 -> 166;
                case 173 -> 61;
                case 174 -> 37;
                case 175 -> 109;
                case 176 -> 23;
                case 177 -> 92;
                case 178 -> 128;
                case 179 -> 136;
                case 180 -> 246;
                case 181 -> 106;
                case 182 -> 105;
                case 183 -> 60;
                case 184 -> 232;
                case 185 -> 80;
                case 186 -> 5;
                case 187 -> 111;
                case 188 -> 36;
                case 189 -> 86;
                case 190 -> 6;
                case 191 -> 196;
                case 192 -> 70;
                case 193 -> 130;
                case 194 -> 209;
                case 195 -> 11;
                case 196 -> 97;
                case 197 -> 163;
                case 198 -> 199;
                case 199 -> 134;
                case 200 -> 95;
                case 201 -> 101;
                case 202 -> 71;
                case 203 -> 129;
                case 204 -> 119;
                case 205 -> 207;
                case 206 -> 39;
                case 207 -> 226;
                case 208 -> 131;
                case 209 -> 56;
                case 210 -> 143;
                case 211 -> 240;
                case 212 -> 228;
                case 213 -> 192;
                case 214 -> 78;
                case 215 -> 135;
                case 216 -> 178;
                case 217 -> 75;
                case 218 -> 84;
                case 219 -> 115;
                case 220 -> 212;
                case 221 -> 155;
                case 222 -> 213;
                case 223 -> 104;
                case 224 -> 33;
                case 225 -> 205;
                case 226 -> 177;
                case 227 -> 190;
                case 228 -> 202;
                case 229 -> 29;
                case 230 -> 98;
                case 231 -> 252;
                case 232 -> 152;
                case 233 -> 179;
                case 234 -> 48;
                case 235 -> 82;
                case 236 -> 24;
                case 237 -> 167;
                case 238 -> 195;
                case 239 -> 201;
                case 240 -> 25;
                case 241 -> 151;
                case 242 -> 15;
                case 243 -> 144;
                case 244 -> 174;
                case 245 -> 127;
                case 246 -> 122;
                case 247 -> 173;
                case 248 -> 79;
                case 249 -> 107;
                case 250 -> 58;
                case 251 -> 191;
                case 252 -> 30;
                case 253 -> 64;
                case 254 -> 168;
                default -> 234;
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
            com.github.epsilon.t.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3EF6;
        if (com.github.epsilon.t.l[n2] == null) {
            com.github.epsilon.t.l[n2] = (int)(k[n2] ^ l);
        }
        return com.github.epsilon.t.l[n2];
    }
}
