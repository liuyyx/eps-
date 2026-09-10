/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.network.protocol.game.ServerboundAttackPacket
 *  net.minecraft.network.protocol.game.ServerboundContainerClosePacket
 *  net.minecraft.network.protocol.game.ServerboundInteractPacket
 *  net.minecraft.network.protocol.game.ServerboundMovePlayerPacket
 *  net.minecraft.network.protocol.game.ServerboundPlayerActionPacket
 *  net.minecraft.network.protocol.game.ServerboundUseItemOnPacket
 *  net.minecraft.network.protocol.game.ServerboundUseItemPacket
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.item.AxeItem
 *  net.minecraft.world.item.BowItem
 *  net.minecraft.world.item.CrossbowItem
 *  net.minecraft.world.item.FishingRodItem
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.ShovelItem
 *  net.minecraft.world.item.StandingAndWallBlockItem
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.XG;
import com.github.epsilon.Xj;
import com.github.epsilon.Xn;
import com.github.epsilon._Z;
import com.github.epsilon._y;
import com.github.epsilon.dQ;
import com.github.epsilon.d_;
import com.github.epsilon.e;
import com.github.epsilon.gx;
import com.github.epsilon.hi;
import com.github.epsilon.ul;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.network.protocol.game.ServerboundAttackPacket;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.network.protocol.game.ServerboundInteractPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemOnPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.StandingAndWallBlockItem;

public class up
extends e {
    public static final up N;
    public final Xn V;
    private final XG Xn;
    private final Xn F;
    private final Xn K;
    private final XG M;
    private final XG x;
    public final XG w;
    private final Dx<gx> h;
    private final XG X7;
    private final Xn a;
    private final XG W;
    private final XG C;
    private final XG v;
    public final XG Q;
    private final XG y;
    private boolean o;
    private final Xn H;
    private final Xn P;
    private final XG z;
    private final Xn S;
    public final XG XW;
    private int X3;
    private final Xn Xl;
    private final Xn O;
    private final Xn m;
    private final Dx<d_> X;
    private final Dx<Xj> e = hi.a("\u00a5", (Object)this, (Object)up.b(19184, -23080), (Object)hi.a("j", (long)925497335648930051L), (long)426795652261052192L);
    private final Xn n;
    private final _Z b;
    private final XG t;
    private final Xn XR;
    private final Xn c;
    private final Xn Xg;
    private final XG d;
    private boolean L;
    private boolean X5;
    private final XG u;
    private ul J;
    private int k;
    private final Xn q;
    public final XG E;
    private final XG l;
    private final Xn T;
    private final Xn D;
    public final XG B;
    private static final String[] cb;
    private static final String[] db;
    private static final long[] eb;
    private static final Integer[] jb;
    private static final long kb;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean F(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        boolean bl = Dl.S();
        int n2 = hi.a("G", (int)((up.c(6583, 2181026497983638317L) + up.c(22552, 3412794247990815311L)) / up.c(12325, 5153503090871124677L)), (int)up.c(26786, 2138993748432132459L), (long)834203424483934088L) ^ up.c(32084, 4477983718761729800L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        Object object2 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1038710010063338291L);
                        if (!bl) break block9;
                        if (object2 == false) break block10;
                        object2 = object = (Object)(hi.a("G", (int)(up.c(169, 2639899114428788830L) - up.c(7896, 1865784187309092821L)), (int)up.c(27435, 535678562242337704L), (long)834203424483934088L) / 3 ^ up.c(9943, 1195207307325920813L));
                    }
                    if (bl) break block8;
                }
                object = (up.c(22113, 3324186464063136907L) ^ up.c(17533, 2952201542394459645L)) + up.c(9573, 7179034261067256992L) + up.c(20322, 6614939512272239846L) - up.c(8135, 600423531127533407L) - up.c(20858, 7186068510997618772L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case -1801465117: {
                    return false;
                }
                case -1801465120: {
                    up.V("9JSdvelroRuMtddK", H(int ), (int)n);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)555034192595512565L);
                    return true;
                }
                case -1801465118: 
            }
            break;
        }
        throw null;
    }

    private boolean lambda$new$2() {
        boolean bl = Dl.t();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L), (Object)hi.a("j", (long)1302083182012203900L), (long)511460060498514638L);
        if (!bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean A(Object var1_1) {
        block106: {
            var2_2 = Dl.t();
            var5_3 /* !! */  = hi.a("G", (int)up.c(16655, 6123184253268504614L), (int)up.c(21661, 7228564720886851003L), (long)834203424483934088L) ^ up.c(7076, 3758978760934189364L) ^ up.c(25459, 58523493554721371L);
            if (!var2_2) ** GOTO lbl15
            block85: while (true) {
                block109: {
                    block108: {
                        block107: {
                            v0 /* !! */  = up.V("9JSdvelroRuMtddK", isEmpty(), (ItemStack)((ItemStack)var1_1));
                            if (var2_2) break block107;
                            if (v0 /* !! */  != false) break block108;
                            v0 /* !! */  = (CallSite)(up.c(6116, 5907500976739378566L) + up.c(14752, 2587655459325233371L) + up.c(19933, 4839643042389179592L));
                        }
                        var5_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block109;
                    }
                    var5_3 /* !! */  = (up.c(23516, 7588779684761479202L) + up.c(14641, 5282084778081339480L)) / 5 ^ up.c(22967, 2478422780296013942L);
                    if (var2_2) ** GOTO lbl260
                }
                block86: while (true) {
                    switch (var5_3 /* !! */ ) {
                        default: {
                            continue block85;
                        }
                        case -1261965207: {
                            v1 /* !! */  = hi.a("G", (Object)new Object[]{(ItemStack)var1_1}, (long)1252112210213067715L);
                            if (var2_2) ** GOTO lbl261
                            if (v1 /* !! */  == false) ** GOTO lbl260
                            ** GOTO lbl263
                        }
                        case -1261965231: {
                            v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)923433247397949520L), (long)445233814433577985L), (Object)up.b(19176, 9433), (long)1195372608991279295L);
                            if (var2_2) ** GOTO lbl266
                            if (v2 /* !! */  == false) ** GOTO lbl265
                            ** GOTO lbl268
                        }
                        case -1261965234: {
                            v3 = hi.a("G", (Object)new Object[]{(ItemStack)var1_1}, (long)844101561541465633L);
                            if (var2_2) ** GOTO lbl271
                            if (v3 == false) ** GOTO lbl270
                            ** GOTO lbl273
                        }
                        case -1261965241: {
                            var3_4 = hi.a("G", (Object)((ItemStack)var1_1), (long)367628606640672521L);
                            cfr_temp_0 = up.V("9JSdvelroRuMtddK", X(net.minecraft.world.entity.EquipmentSlot ), (EquipmentSlot)hi.a("G", (Object)((ItemStack)var1_1), (long)1280162559367933539L)) - var3_4;
                            v4 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            if (var2_2) ** GOTO lbl276
                            if (v4 /* !! */  < 0) ** GOTO lbl275
                            ** GOTO lbl278
                        }
                        case -1261965230: {
                            v5 = hi.a("G", (Object)((ItemStack)var1_1), (long)572443712987471620L);
                            if (var2_2) ** GOTO lbl316
                            if (v5 == false) ** GOTO lbl315
                            ** GOTO lbl318
                        }
                        case -1261965200: {
                            if (hi.a("G", (long)1201432730590593927L) != (ItemStack)var1_1) ** GOTO lbl320
                            ** GOTO lbl322
                        }
                        case -1261965238: {
                            v6 = true;
                            var5_3 /* !! */  = hi.a("G", (int)(up.c(9180, 836722171214123565L) + up.c(5142, 7281553818289792983L) + up.c(17072, 2256493419915456873L)), (int)up.c(23773, 3386781576857726776L), (long)834203424483934088L) ^ up.c(9017, 3167175197068546617L);
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl324
                        }
                        case -1261965227: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl324
                        }
                        case -1261965198: {
                            v7 /* !! */  = hi.a("G", (Object)((ItemStack)var1_1), (long)691855746686294592L);
                            if (var2_2) ** GOTO lbl327
                            if (v7 /* !! */  == false) ** GOTO lbl326
                            ** GOTO lbl329
                        }
                        case -1261965205: {
                            if (hi.a("G", (long)487733742417394326L) != (ItemStack)var1_1) ** GOTO lbl331
                            ** GOTO lbl333
                        }
                        case -1261965248: {
                            v6 = true;
                            var5_3 /* !! */  = (up.c(27229, 2704997321262832594L) ^ up.c(19476, 8279426037957606597L)) - up.c(19641, 6689272837641616427L) - up.c(24910, 1523983297986466479L);
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl335
                        }
                        case -1261965244: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl335
                        }
                        case -1261965229: {
                            v8 = up.V("9JSdvelroRuMtddK", getItem(), (ItemStack)((ItemStack)var1_1)) instanceof AxeItem;
                            if (var2_2) ** GOTO lbl338
                            if (v8 == 0) ** GOTO lbl337
                            ** GOTO lbl339
                        }
                        case -1261965215: {
                            v9 /* !! */  = hi.a("G", (Object)new Object[]{(ItemStack)var1_1}, (long)535187538840369779L);
                            if (var2_2) ** GOTO lbl342
                            if (v9 /* !! */  != false) ** GOTO lbl341
                            ** GOTO lbl344
                        }
                        case -1261965218: {
                            if (up.V("9JSdvelroRuMtddK", I()) != (ItemStack)var1_1) ** GOTO lbl346
                            ** GOTO lbl348
                        }
                        case -1261965252: {
                            v6 = true;
                            var5_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)((up.c(26062, 1503171027928848043L) - up.c(12471, 5695596487521059533L)) * up.c(14059, 8137953048499308469L)), (int)up.c(12241, 7643445689775807737L), (long)834203424483934088L), (int)up.c(13407, 8401326671181989098L), (long)834203424483934088L) - up.c(24925, 5327314410206466667L));
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl350
                        }
                        case -1261965209: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl350
                        }
                        case -1261965253: {
                            v10 = up.V("9JSdvelroRuMtddK", getItem(), (ItemStack)((ItemStack)var1_1)) instanceof ShovelItem;
                            if (var2_2) ** GOTO lbl353
                            if (v10 == 0) ** GOTO lbl352
                            ** GOTO lbl354
                        }
                        case -1261965240: {
                            if (hi.a("G", (long)634433114371939498L) != (ItemStack)var1_1) ** GOTO lbl356
                            ** GOTO lbl358
                        }
                        case -1261965225: {
                            v6 = true;
                            var5_3 /* !! */  = (hi.a("G", (int)(up.c(23736, 65906331759128332L) - up.c(26510, 7894147831365801393L) ^ up.c(9788, 1962017201818522873L)), (int)up.c(12234, 1947857517586144614L), (long)834203424483934088L) ^ up.c(1904, 8572479967628031359L)) - up.c(28920, 4255631874230026902L);
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl360
                        }
                        case -1261965257: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl360
                        }
                        case -1261965212: {
                            v11 = hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) instanceof CrossbowItem;
                            if (var2_2) ** GOTO lbl363
                            if (v11 == 0) ** GOTO lbl362
                            ** GOTO lbl364
                        }
                        case -1261965259: {
                            if (hi.a("G", (long)666523559234091957L) != (ItemStack)var1_1) ** GOTO lbl366
                            ** GOTO lbl368
                        }
                        case -1261965201: {
                            v6 = true;
                            var5_3 /* !! */  = ((up.c(18538, 4487794072780716757L) - up.c(18430, 1990769384579478724L)) / 4 ^ up.c(18572, 2230468984584092395L)) - up.c(25887, 6151047540723619659L) ^ up.c(29769, 185378615390242304L);
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl370
                        }
                        case -1261965245: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl370
                        }
                        case -1261965254: {
                            v12 = hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) instanceof BowItem;
                            if (var2_2) ** GOTO lbl373
                            if (v12 == 0) ** GOTO lbl372
                            ** GOTO lbl374
                        }
                        case -1261965260: {
                            v13 /* !! */  = hi.a("G", (Object)new Object[]{(ItemStack)var1_1}, (long)1182227506803120564L);
                            if (var2_2) ** GOTO lbl377
                            if (v13 /* !! */  == false) ** GOTO lbl376
                            ** GOTO lbl379
                        }
                        case -1261965232: {
                            if (hi.a("G", (long)1272073180734162189L) != (ItemStack)var1_1) ** GOTO lbl381
                            ** GOTO lbl383
                        }
                        case -1261965246: {
                            v6 = true;
                            var5_3 /* !! */  = ((up.c(8370, 4974962386691609500L) ^ up.c(28784, 3704385350997345100L)) / up.c(11499, 8560006226523742001L) ^ up.c(8107, 8884485474278960923L)) - up.c(21744, 6641947802066756657L);
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl385
                        }
                        case -1261965211: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl385
                        }
                        case -1261965243: {
                            v14 = hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) instanceof BowItem;
                            if (var2_2) ** GOTO lbl388
                            if (v14 == 0) ** GOTO lbl387
                            ** GOTO lbl389
                        }
                        case -1261965217: {
                            v15 /* !! */  = hi.a("G", (Object)((ItemStack)var1_1), (long)996091315745437025L);
                            if (var2_2) ** GOTO lbl392
                            if (v15 /* !! */  == false) ** GOTO lbl391
                            ** GOTO lbl394
                        }
                        case -1261965203: {
                            if (hi.a("G", (long)1312822163333810930L) != (ItemStack)var1_1) ** GOTO lbl396
                            ** GOTO lbl398
                        }
                        case -1261965236: {
                            v6 = true;
                            var5_3 /* !! */  = up.c(24592, 2679324972187652301L) / up.c(12325, 5153503090871124677L) + up.c(480, 3357687394362061506L);
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl400
                        }
                        case -1261965251: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl400
                        }
                        case -1261965255: {
                            v16 = hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) instanceof BowItem;
                            if (var2_2) ** GOTO lbl403
                            if (v16 == 0) ** GOTO lbl402
                            ** GOTO lbl404
                        }
                        case -1261965258: {
                            v17 /* !! */  = hi.a("G", (Object)new Object[]{hi.a("j", (long)648260005455339403L)}, (long)1222370090952811324L);
                            v18 = 1;
                            if (var2_2) ** GOTO lbl408
                            if (v17 /* !! */  <= v18) ** GOTO lbl406
                            ** GOTO lbl410
                        }
                        case -1261965220: {
                            if (hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) != hi.a("j", (long)1027046646164874027L)) ** GOTO lbl412
                            ** GOTO lbl414
                        }
                        case -1261965199: {
                            v19 /* !! */  = hi.a("G", (Object)new Object[]{hi.a("j", (long)1027046646164874027L)}, (long)1222370090952811324L);
                            v20 /* !! */  = hi.a("\u00a5", (Object)((Integer)up.V("9JSdvelroRuMtddK", z(), (XG)hi.a("\u00e9", (Object)this, (long)1283400372509535049L))), (long)1260538186742955956L);
                            if (var2_2) ** GOTO lbl418
                            if (v19 /* !! */  <= v20 /* !! */ ) ** GOTO lbl416
                            ** GOTO lbl420
                        }
                        case -1261965228: {
                            if (hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) != hi.a("j", (long)637532570234665752L)) ** GOTO lbl422
                            ** GOTO lbl424
                        }
                        case -1261965206: {
                            v21 = hi.a("G", (Object)new Object[]{hi.a("j", (long)637532570234665752L)}, (long)1222370090952811324L);
                            v22 /* !! */  = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1189942152624766205L), (long)789438897355831922L)), (long)1260538186742955956L);
                            if (var2_2) ** GOTO lbl428
                            if (v21 <= v22 /* !! */ ) ** GOTO lbl426
                            ** GOTO lbl430
                        }
                        case -1261965222: {
                            v23 /* !! */  = hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) instanceof FishingRodItem;
                            if (var2_2) ** GOTO lbl433
                            if (v23 /* !! */  == 0) ** GOTO lbl432
                            ** GOTO lbl434
                        }
                        case -1261965219: {
                            v24 = hi.a("G", (Object)new Object[]{hi.a("j", (long)1098295467496268757L)}, (long)1222370090952811324L);
                            v25 = 1;
                            if (var2_2) ** GOTO lbl438
                            if (v24 <= v25) ** GOTO lbl436
                            ** GOTO lbl440
                        }
                        case -1261965247: {
                            if (hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) == hi.a("j", (long)403740683659965780L)) ** GOTO lbl442
                            ** GOTO lbl444
                        }
                        case -1261965216: {
                            if (up.V("9JSdvelroRuMtddK", getItem(), (ItemStack)((ItemStack)var1_1)) != hi.a("j", (long)823347519655685809L)) ** GOTO lbl446
                            ** GOTO lbl448
                        }
                        case -1261965249: {
                            v26 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1120046356273634799L), (long)789438897355831922L)), (long)1000026253634408124L);
                            if (var2_2) ** GOTO lbl451
                            if (v26 != false) ** GOTO lbl450
                            ** GOTO lbl453
                        }
                        case -1261965204: {
                            if (hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) == hi.a("j", (long)666291799354649379L)) ** GOTO lbl455
                            ** GOTO lbl457
                        }
                        case -1261965224: {
                            if (hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) != hi.a("j", (long)468634451082859931L)) ** GOTO lbl459
                            ** GOTO lbl461
                        }
                        case -1261965202: {
                            v27 /* !! */  = hi.a("\u00a5", (Object)((ItemStack)var1_1), (long)769006157898026769L) instanceof StandingAndWallBlockItem;
                            if (var2_2) ** GOTO lbl464
                            if (v27 /* !! */  != 0) ** GOTO lbl463
                            ** GOTO lbl465
                        }
                        case -1261965239: {
                            v28 = hi.a("G", (Object)new Object[]{(ItemStack)var1_1}, (long)926064535806007772L);
                            if (var2_2) ** GOTO lbl468
                            if (v28 == false) ** GOTO lbl467
                            ** GOTO lbl470
                        }
                        case -1261965226: {
                            v6 = true;
                            var5_3 /* !! */  = (int)(hi.a("G", (int)(up.c(11829, 1423800885234753202L) * up.c(18802, 919896858643806777L) / 2), (int)up.c(32407, 5093236588615961614L), (long)834203424483934088L) + up.c(18668, 1368184254565169579L) - up.c(28199, 8329403253716590410L));
                            if (!var2_2) ** GOTO lbl473
                            ** GOTO lbl472
                        }
                        case -1261965250: {
                            v6 = false;
                            if (var2_2) {
                                return v6;
                            }
                            ** GOTO lbl472
                        }
lbl260:
                        // 2 sources

                        v1 /* !! */  = (CallSite)((up.c(10115, 7303355010047759724L) * up.c(3080, 2973793347575053378L) / up.c(21522, 5752179181841687918L) + up.c(13645, 2078186116225615570L)) * up.c(3654, 8038485185035435571L) + up.c(24783, 3618577838677954560L));
lbl261:
                        // 2 sources

                        var5_3 /* !! */  = (int)v1 /* !! */ ;
                        if (!var2_2) continue block86;
lbl263:
                        // 2 sources

                        var5_3 /* !! */  = up.c(28999, 6475014591366202226L) / 4 - up.c(20183, 7471616997778340985L);
                        if (!var2_2) continue block86;
lbl265:
                        // 2 sources

                        v2 /* !! */  = (CallSite)((up.c(15862, 801552120011607468L) + up.c(6898, 7707526731800079329L)) * up.c(4914, 8930495809577050796L) - up.c(23732, 387301558635376463L));
lbl266:
                        // 2 sources

                        var5_3 /* !! */  = (int)v2 /* !! */ ;
                        if (!var2_2) continue block86;
lbl268:
                        // 2 sources

                        var5_3 /* !! */  = up.c(3269, 1290408952483413904L) ^ up.c(26340, 3229771977287603557L) ^ up.c(22359, 6779577358449616846L);
                        if (!var2_2) continue block86;
lbl270:
                        // 2 sources

                        v3 = hi.a("G", (int)(up.c(8087, 4937543077180042694L) / up.c(23740, 7778447115784433176L)), (int)up.c(10055, 7074581435678643206L), (long)834203424483934088L) - up.c(6068, 4136578774700942768L);
lbl271:
                        // 2 sources

                        var5_3 /* !! */  = (int)v3;
                        if (!var2_2) continue block86;
lbl273:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(330, 1730051832216351698L) - up.c(5524, 1510141341411075859L) ^ up.c(9152, 433259200723669374L) ^ up.c(23828, 1148970141554945379L)) / up.c(19555, 6416917978405911779L) + up.c(26857, 100067941565799284L);
                        continue block86;
lbl275:
                        // 1 sources

                        v4 /* !! */  = (reference)((up.c(6024, 9166288364601566673L) ^ up.c(9623, 8617762620424312622L)) + up.c(19193, 8454370074840938500L));
lbl276:
                        // 2 sources

                        var5_3 /* !! */  = (int)v4 /* !! */ ;
                        if (!var2_2) ** GOTO lbl279
lbl278:
                        // 2 sources

                        var5_3 /* !! */  = up.c(26, 1100212760245301483L) + up.c(15295, 6111920803786836666L) + up.c(26002, 6845579897350100265L) + up.c(26445, 4191577340900710157L) - up.c(14486, 288315729289431960L);
lbl279:
                        // 2 sources

                        v29 = var5_3 /* !! */ ;
                        if (var2_2 != false) return v29;
                        switch (v29) {
                            default: {
                                return false;
                            }
                            case -1862006584: {
                                var4_5 = hi.a("G", (Object)new Object[]{hi.a("G", (Object)((ItemStack)var1_1), (long)1280162559367933539L)}, (long)895313906875509614L);
                                v30 /* !! */  = var3_4 == var4_5 ? 0 : (var3_4 < var4_5 ? -1 : 1);
                                if (var2_2) ** GOTO lbl294
                                if (v30 /* !! */  < 0) break;
                                ** GOTO lbl296
                            }
                            case -1862006583: {
                                throw null;
                            }
                        }
                        v30 /* !! */  = (reference)((up.c(887, 2785455343342743885L) * up.c(15426, 7346554585656675734L) + up.c(11597, 7560312615152836021L)) / up.c(23740, 7778447115784433176L) - up.c(20957, 8545835363068486222L) + up.c(28405, 9207335105263115320L));
lbl294:
                        // 2 sources

                        var5_3 /* !! */  = (int)v30 /* !! */ ;
                        if (!var2_2) ** GOTO lbl297
lbl296:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(up.V("9JSdvelroRuMtddK", max(int int ), (int)up.c(19391, 8368837587087997256L), (int)up.c(13006, 2237885486257127429L)) / up.c(12325, 5153503090871124677L)), (int)up.c(11878, 589913177897525105L), (long)834203424483934088L) + up.c(2417, 6125356165311625348L));
lbl297:
                        // 2 sources

                        v6 = var5_3 /* !! */ ;
                        if (var2_2) ** GOTO lbl311
                        switch (v6) {
                            default: {
                                v6 = true;
                                break;
                            }
                            case 578595622: {
                                v6 = false;
                                if (var2_2) {
                                    return v6;
                                }
                                ** GOTO lbl313
                            }
                            case 578595623: {
                                throw null;
                            }
                        }
lbl311:
                        // 2 sources

                        var5_3 /* !! */  = up.c(22135, 3310670712559478229L) - up.c(23377, 3750351448464403155L) + up.c(28489, 2866469935103024350L) - up.c(32319, 2443111094430600271L) - up.c(25946, 370645896413124571L) + up.c(5424, 6885365607456105705L);
                        if (!var2_2) break block106;
lbl313:
                        // 2 sources

                        var5_3 /* !! */  = up.c(6265, 5762849508491815778L) - up.c(26694, 6645317252945877824L) + up.c(29412, 4541747085655539871L) - up.c(12850, 1325137220176397285L) - up.c(10140, 7552887669681149682L) + up.c(22537, 2026445826215815344L);
                        break block106;
lbl315:
                        // 1 sources

                        v5 = hi.a("G", (int)(up.c(2943, 5729236129938700786L) ^ up.c(25390, 1767744024613982280L)), (int)up.c(30105, 4045412353408369677L), (long)834203424483934088L) + up.c(12490, 5847754865642685396L);
lbl316:
                        // 2 sources

                        var5_3 /* !! */  = (int)v5;
                        if (!var2_2) continue block86;
lbl318:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(31452, 2260264507003668552L) + up.c(7564, 4403555108829392482L)) * up.c(19351, 2337195413268904098L) ^ up.c(16520, 5648481687604343137L);
                        if (!var2_2) continue block86;
lbl320:
                        // 2 sources

                        var5_3 /* !! */  = up.c(28597, 2147318979026427501L) / up.c(12650, 5843564102462030482L) / up.c(19555, 6416917978405911779L) * up.c(7254, 2297940515675729148L) + up.c(25585, 6771349962824585871L) + up.c(10040, 577821936075822729L);
                        if (!var2_2) continue block86;
lbl322:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(20855, 1998113199694881480L) + up.c(15324, 606988342334802723L)) / 4 ^ up.c(15637, 272967331341650970L);
                        continue block86;
lbl324:
                        // 2 sources

                        var5_3 /* !! */  = hi.a("G", (int)(up.c(24799, 4756858858445410610L) + up.c(11279, 8626432857856401268L) + up.c(17711, 8191391282302858264L)), (int)up.c(14725, 2304396221380184932L), (long)834203424483934088L) ^ up.c(30579, 4343188800155780517L);
                        ** GOTO lbl473
lbl326:
                        // 1 sources

                        v7 /* !! */  = (CallSite)((up.c(31487, 7203121316062693646L) + up.c(12160, 5248263551868788430L)) * up.c(16697, 6712630825544463236L) - up.c(30748, 2201230976691308688L) + up.c(14400, 6984731583116527836L));
lbl327:
                        // 2 sources

                        var5_3 /* !! */  = (int)v7 /* !! */ ;
                        if (!var2_2) continue block86;
lbl329:
                        // 2 sources

                        var5_3 /* !! */  = (int)(up.V("9JSdvelroRuMtddK", max(int int ), (int)((up.c(8229, 7025653650795155554L) + up.c(4131, 5899378959729189385L)) * up.c(9199, 9134293382180557404L)), (int)up.c(5260, 6410306157306176842L)) - up.c(5962, 2575203621776254955L));
                        if (!var2_2) continue block86;
lbl331:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(up.c(25007, 4198960966413980310L) - up.c(11790, 1081688914321235686L) ^ up.c(29789, 1976387418147849532L)), (int)up.c(4958, 5950571756864758550L), (long)834203424483934088L) + up.c(3277, 3358187363247193584L));
                        if (!var2_2) continue block86;
lbl333:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)((up.c(15417, 1444955390327639146L) ^ up.c(13825, 388145929273394432L)) * up.c(22266, 6965019220447864082L)), (int)up.c(30756, 80540225323207017L), (long)834203424483934088L) + up.c(12247, 7424387520924114463L));
                        continue block86;
lbl335:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(18433, 4140392484903893931L) ^ up.c(8133, 3877216277472341197L)) - up.c(20204, 6099887167923011111L) - up.c(13303, 4324387601898226567L);
                        ** GOTO lbl473
lbl337:
                        // 1 sources

                        v8 = var5_3 /* !! */  = ((up.c(26112, 6246870857350321634L) ^ up.c(12801, 6168115568315941100L)) + up.c(17761, 576198618258945686L)) * up.c(19032, 4273853249795996496L) ^ up.c(17204, 4247740073436721240L);
lbl338:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl339:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(31026, 1757914878755277347L) ^ up.c(25008, 2582932710484742170L)) - up.c(24424, 8081886955542687165L);
                        if (!var2_2) continue block86;
lbl341:
                        // 2 sources

                        v9 /* !! */  = (CallSite)(((up.c(9539, 766952534555186746L) ^ up.c(5722, 4418825631632123845L)) + up.c(17998, 7359777736711255306L)) * up.c(30556, 8016733797862704328L) ^ up.c(15880, 6689768548515925428L));
lbl342:
                        // 2 sources

                        var5_3 /* !! */  = (int)v9 /* !! */ ;
                        if (!var2_2) continue block86;
lbl344:
                        // 2 sources

                        var5_3 /* !! */  = up.c(21781, 6431264619114505384L) - up.c(10348, 5781077353348881050L) ^ up.c(29653, 1606547411678790133L) ^ up.c(24159, 2006194381322759315L);
                        if (!var2_2) continue block86;
lbl346:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(up.c(2308, 3321982145919809697L) / up.c(28003, 7146748952301083670L)), (int)up.c(5504, 3094265860774388875L), (long)834203424483934088L) * up.c(32719, 3060341319103024379L) + up.c(6684, 4130352343819905937L));
                        if (!var2_2) continue block86;
lbl348:
                        // 2 sources

                        var5_3 /* !! */  = up.c(31360, 8211110929552378686L) ^ up.c(16177, 9091931174362074289L) ^ up.c(10797, 7536404104120686691L);
                        continue block86;
lbl350:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)((up.c(19568, 4470619725827849787L) - up.c(30441, 4243274652160853424L)) * up.c(24597, 512633706434925174L)), (int)up.c(31327, 2755900596114492322L), (long)834203424483934088L), (int)up.c(12567, 3165726127744139689L), (long)834203424483934088L) - up.c(6858, 5285598484104145873L));
                        ** GOTO lbl473
lbl352:
                        // 1 sources

                        v10 = var5_3 /* !! */  = (up.c(24423, 5896284931454512506L) ^ up.c(24620, 1311393769580532413L) ^ up.c(18217, 1332755658944591320L)) + up.c(25977, 8304598242957924304L) - up.c(13265, 3993163531806229319L);
lbl353:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl354:
                        // 2 sources

                        var5_3 /* !! */  = up.c(15827, 7264886908244151888L) / up.c(12325, 5153503090871124677L) * up.c(14200, 4102180075122804674L) + up.c(2076, 4577697753661733644L) ^ up.c(15136, 1857014581435975885L);
                        if (!var2_2) continue block86;
lbl356:
                        // 2 sources

                        var5_3 /* !! */  = hi.a("G", (int)up.c(20165, 6021751197204364728L), (int)up.c(21759, 9070136853810423545L), (long)834203424483934088L) ^ up.c(3767, 3481170882403368546L);
                        if (!var2_2) continue block86;
lbl358:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(up.c(25146, 8390507803859226996L) + up.c(7854, 2950320556363542495L)), (int)up.c(30662, 6678493247444551070L), (long)834203424483934088L) + up.c(30481, 7531426243018262518L));
                        continue block86;
lbl360:
                        // 2 sources

                        var5_3 /* !! */  = (hi.a("G", (int)(up.c(8337, 6769492156677640737L) - up.c(28166, 1401857810049081139L) ^ up.c(18970, 3164877851960753097L)), (int)up.c(16583, 2375840607000375331L), (long)834203424483934088L) ^ up.c(599, 7798857861563904932L)) - up.c(15961, 929516230960631765L);
                        ** GOTO lbl473
lbl362:
                        // 1 sources

                        v11 = var5_3 /* !! */  = up.c(9432, 2723233970547020918L) * up.c(17835, 4145802384447452795L) + up.c(28838, 5288221140578894245L) + up.c(18286, 5353076344198280210L) - up.c(19769, 6283328138090201029L);
lbl363:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl364:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(2135, 8434359238478297948L) + up.c(28170, 7236660674437258732L)) * up.c(31147, 7675731225928043155L) * up.c(22415, 7166274826847003921L) ^ up.c(22394, 5210285681808286914L);
                        if (!var2_2) continue block86;
lbl366:
                        // 2 sources

                        var5_3 /* !! */  = ((up.c(24508, 3957056975803330391L) * up.c(11231, 7022818149572302983L) - up.c(29960, 7618979792957539660L)) * up.c(11357, 6874236042391674527L) ^ up.c(17668, 5904145930923259737L)) + up.c(14235, 5759707961480627376L);
                        if (!var2_2) continue block86;
lbl368:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(854, 7105347455988527447L) - up.c(17385, 4376014304570585398L) ^ up.c(25480, 3151436390259364284L)) - up.c(1738, 1445147319201691109L) ^ up.c(23134, 2383296636795005027L);
                        continue block86;
lbl370:
                        // 2 sources

                        var5_3 /* !! */  = ((up.c(15431, 7569571470281428579L) - up.c(13742, 5584767482628064401L)) / 4 ^ up.c(25600, 4700995457927517706L)) - up.c(10594, 2443637572915419342L) ^ up.c(3474, 5474383198350769175L);
                        ** GOTO lbl473
lbl372:
                        // 1 sources

                        v12 = var5_3 /* !! */  = up.c(30994, 9008502413480463027L) ^ up.c(4054, 5749937081488604424L) ^ up.c(14038, 2890947764037109363L);
lbl373:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl374:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(14299, 6418294181054203239L) ^ up.c(16430, 4303473639725970265L)) * up.c(31682, 1866288499042453592L) ^ up.c(26877, 7176667251132668249L);
                        if (!var2_2) continue block86;
lbl376:
                        // 2 sources

                        v13 /* !! */  = (CallSite)(up.c(16705, 5582202393546928597L) ^ up.c(4548, 559035332181713890L) ^ up.c(16398, 8541737416504356977L));
lbl377:
                        // 2 sources

                        var5_3 /* !! */  = (int)v13 /* !! */ ;
                        if (!var2_2) continue block86;
lbl379:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(28159, 8993823095681294134L) * up.c(18851, 7087923360488569076L) ^ up.c(8105, 3569741724467358910L) ^ up.c(1825, 3037226813821252678L)) - up.c(23385, 7128891786126633027L) + up.c(11317, 8230718495089122784L);
                        if (!var2_2) continue block86;
lbl381:
                        // 2 sources

                        var5_3 /* !! */  = up.c(4481, 7549018713940353761L) - up.c(10198, 554489895790433494L) + up.c(27792, 2501430576212549446L);
                        if (!var2_2) continue block86;
lbl383:
                        // 2 sources

                        var5_3 /* !! */  = hi.a("G", (int)(up.c(28024, 8296698441429360619L) * up.c(2474, 5634280628697954364L)), (int)up.c(8719, 6542009804903698784L), (long)834203424483934088L) ^ up.c(7382, 9048163635482947547L);
                        continue block86;
lbl385:
                        // 2 sources

                        var5_3 /* !! */  = ((up.c(10719, 6350788346500765823L) ^ up.c(10627, 8044413551527680096L)) / up.c(11499, 8560006226523742001L) ^ up.c(32053, 3156573454498271186L)) - up.c(32701, 3074201001210809497L);
                        ** GOTO lbl473
lbl387:
                        // 1 sources

                        v14 = var5_3 /* !! */  = hi.a("G", (int)up.c(27712, 6488631613998603516L), (int)up.c(23821, 3519561381435944012L), (long)834203424483934088L) + up.c(1607, 2700258981254199101L) ^ up.c(24378, 4298262167563571L);
lbl388:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl389:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(32053, 5391418451730468853L) ^ up.c(16073, 3290165164749475321L)) - up.c(23767, 404922711718801386L);
                        if (!var2_2) continue block86;
lbl391:
                        // 2 sources

                        v15 /* !! */  = (CallSite)(hi.a("G", (int)up.c(2913, 1787197817232980720L), (int)up.c(23672, 7660431445844700622L), (long)834203424483934088L) + up.c(6111, 4489275976620762877L) ^ up.c(26622, 5374413839625229453L));
lbl392:
                        // 2 sources

                        var5_3 /* !! */  = (int)v15 /* !! */ ;
                        if (!var2_2) continue block86;
lbl394:
                        // 2 sources

                        var5_3 /* !! */  = up.c(20999, 7789381589854430184L) / up.c(11090, 1586421477612346324L) - up.c(10438, 6621715166915975885L);
                        if (!var2_2) continue block86;
lbl396:
                        // 2 sources

                        var5_3 /* !! */  = (int)(up.V("9JSdvelroRuMtddK", max(int int ), (int)up.c(9902, 1132177752036300726L), (int)up.c(16058, 1220992610460684046L)) - up.c(5655, 756304094456899051L));
                        if (!var2_2) continue block86;
lbl398:
                        // 2 sources

                        var5_3 /* !! */  = up.c(11395, 3291304720500841571L) * up.c(3480, 6635905705175284954L) + up.c(32389, 4301774528911347525L);
                        continue block86;
lbl400:
                        // 2 sources

                        var5_3 /* !! */  = up.c(16861, 4571794489760625009L) / up.c(12325, 5153503090871124677L) + up.c(6607, 7556077076471507781L);
                        ** GOTO lbl473
lbl402:
                        // 1 sources

                        v16 = var5_3 /* !! */  = (up.c(2290, 225672854665787914L) - up.c(26906, 7907163086589794754L)) / 3 + up.c(17069, 7344093937396330984L) ^ up.c(16016, 9079570517396311552L);
lbl403:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl404:
                        // 2 sources

                        var5_3 /* !! */  = (int)(up.V("9JSdvelroRuMtddK", max(int int ), (int)(up.c(22736, 3425019543994935594L) - up.c(30067, 269387877957633670L)), (int)up.c(18428, 6615993451934758058L)) * up.c(8960, 544405669316842364L) - up.c(29681, 2786122151377240561L));
                        if (!var2_2) continue block86;
lbl406:
                        // 2 sources

                        v17 /* !! */  = (CallSite)((up.c(538, 2111382844114989814L) - up.c(5241, 4219716757168449073L)) / 3 + up.c(4007, 6196431692809666213L));
                        v18 = up.c(21441, 8302536437712691315L);
lbl408:
                        // 2 sources

                        var5_3 /* !! */  = v17 /* !! */  ^ v18;
                        if (!var2_2) continue block86;
lbl410:
                        // 2 sources

                        var5_3 /* !! */  = up.c(7951, 2991290162081263015L) * up.c(18790, 9078247419993340532L) + up.c(8768, 6460510653610906460L);
                        if (!var2_2) continue block86;
lbl412:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(8605, 2942045315602371208L) - up.c(27159, 4492445799925782945L)) * up.c(5254, 6628783512574387317L) / up.c(12325, 5153503090871124677L) + up.c(30395, 3191490686016619651L);
                        if (!var2_2) continue block86;
lbl414:
                        // 2 sources

                        var5_3 /* !! */  = up.c(6653, 1062770292228680593L) + up.c(20561, 8579478512301744641L) ^ up.c(4061, 650779767050239513L);
                        if (!var2_2) continue block86;
lbl416:
                        // 2 sources

                        v19 /* !! */  = (CallSite)((up.c(31356, 8008704443197294949L) - up.c(11445, 6239563880512577518L)) * up.c(24281, 3511444959737622084L) / up.c(12325, 5153503090871124677L));
                        v20 /* !! */  = (CallSite)up.c(17667, 6605376863545079276L);
lbl418:
                        // 2 sources

                        var5_3 /* !! */  = (int)(v19 /* !! */  + v20 /* !! */ );
                        if (!var2_2) continue block86;
lbl420:
                        // 2 sources

                        var5_3 /* !! */  = up.c(25510, 3643097314351452577L) / up.c(23740, 7778447115784433176L) / up.c(12325, 5153503090871124677L) ^ up.c(7194, 4551098929615826334L);
                        if (!var2_2) continue block86;
lbl422:
                        // 2 sources

                        var5_3 /* !! */  = hi.a("G", (int)(up.c(3445, 3554331280984538125L) / up.c(12650, 5843564102462030482L)), (int)up.c(22604, 2170334407974267841L), (long)834203424483934088L) ^ up.c(18491, 7214527596290882531L);
                        if (!var2_2) continue block86;
lbl424:
                        // 2 sources

                        var5_3 /* !! */  = up.c(25245, 2851353733516366626L) - up.c(25327, 6030223743468868359L) - up.c(27181, 8771284787481975779L);
                        if (!var2_2) continue block86;
lbl426:
                        // 2 sources

                        v21 = up.V("9JSdvelroRuMtddK", max(int int ), (int)(up.c(18256, 7438607218881770892L) / up.c(12650, 5843564102462030482L)), (int)up.c(8658, 3704077123462156384L));
                        v22 /* !! */  = (CallSite)up.c(27103, 1197492496312212139L);
lbl428:
                        // 2 sources

                        var5_3 /* !! */  = v21 ^ v22 /* !! */ ;
                        if (!var2_2) continue block86;
lbl430:
                        // 2 sources

                        var5_3 /* !! */  = up.c(28534, 39347574548340358L) + up.c(23149, 806096745978342181L) - up.c(7763, 6643512287317749600L);
                        if (!var2_2) continue block86;
lbl432:
                        // 2 sources

                        v23 /* !! */  = var5_3 /* !! */  = (int)(up.V("9JSdvelroRuMtddK", max(int int ), (int)(((up.c(18100, 2473237128445605317L) ^ up.c(15161, 7778079399987006150L)) - up.c(19925, 3861495837795040825L)) * up.c(2324, 8394281889137719977L)), (int)up.c(13638, 7299133641321367287L)) - up.c(24689, 1812930254237831503L));
lbl433:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl434:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)up.c(18864, 4507731401081830306L), (int)up.c(10670, 2593298187434810162L), (long)834203424483934088L) - up.c(15244, 8411489237800373193L));
                        if (!var2_2) continue block86;
lbl436:
                        // 2 sources

                        v24 = hi.a("G", (int)(((up.c(17653, 9069178839914493240L) ^ up.c(31184, 5006680015541898146L)) - up.c(3575, 1282646782351998833L)) * up.c(5105, 5228005501280412135L)), (int)up.c(8698, 631878262666318551L), (long)834203424483934088L);
                        v25 = up.c(22536, 6611321329199232L);
lbl438:
                        // 2 sources

                        var5_3 /* !! */  = (int)(v24 - v25);
                        if (!var2_2) continue block86;
lbl440:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)up.c(22888, 7906212068871875058L), (int)up.c(709, 5107398337239970335L), (long)834203424483934088L) - up.c(20618, 4230380635327013795L));
                        if (!var2_2) continue block86;
lbl442:
                        // 2 sources

                        var5_3 /* !! */  = (hi.a("G", (int)(up.c(16776, 2614481511386951784L) / up.c(28003, 7146748952301083670L) - up.c(32649, 2322114155818127354L)), (int)up.c(26827, 8238212875241429295L), (long)834203424483934088L) ^ up.c(24964, 8972006785257181359L)) + up.c(5030, 2940175644324324066L);
                        if (!var2_2) continue block86;
lbl444:
                        // 2 sources

                        var5_3 /* !! */  = (up.c(11705, 2460892708950138521L) + up.c(116, 2912790676364555166L) ^ up.c(16868, 402425066742755589L)) + up.c(19458, 188462502432980272L) - up.c(31877, 5099041909881802315L);
                        if (!var2_2) continue block86;
lbl446:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)up.c(21788, 3008556466741912600L), (int)up.c(29946, 4158496727283533202L), (long)834203424483934088L), (int)up.c(25939, 9036173066044937737L), (long)834203424483934088L) * up.c(24531, 7203908450297425344L) * up.c(20232, 4141930775202217420L) + up.c(1491, 3105637637101581464L));
                        if (!var2_2) continue block86;
lbl448:
                        // 2 sources

                        var5_3 /* !! */  = (hi.a("G", (int)(up.c(16149, 4271055900361543511L) / up.c(28003, 7146748952301083670L) - up.c(29628, 2427905197147881611L)), (int)up.c(22777, 5805250977898736011L), (long)834203424483934088L) ^ up.c(10484, 6174495190665189670L)) + up.c(27581, 560565384810273021L);
                        if (!var2_2) continue block86;
lbl450:
                        // 2 sources

                        v26 = hi.a("G", (int)hi.a("G", (int)up.c(28047, 5583166716226247837L), (int)up.c(794, 8596928384677179755L), (long)834203424483934088L), (int)up.c(8954, 4018362685792473154L), (long)834203424483934088L) * up.c(24738, 8211864462586385184L) * up.c(3518, 858643522526543626L) + up.c(1510, 8760850054208911165L);
lbl451:
                        // 2 sources

                        var5_3 /* !! */  = (int)v26;
                        if (!var2_2) continue block86;
lbl453:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(up.c(30945, 3717795154785831766L) * up.c(6047, 2079630636702492516L) + up.c(19330, 2574236537489963510L)), (int)up.c(25625, 6315252436517491888L), (long)834203424483934088L) / up.c(28003, 7146748952301083670L) + up.c(3800, 2221459168139116540L));
                        if (!var2_2) continue block86;
lbl455:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)up.c(28297, 7301637563891326502L), (int)up.c(12546, 315631787040326306L), (long)834203424483934088L) + up.c(32272, 809137822691298485L));
                        if (!var2_2) continue block86;
lbl457:
                        // 2 sources

                        var5_3 /* !! */  = (hi.a("G", (int)up.c(20530, 940832714575553476L), (int)up.c(18383, 4019940931515856620L), (long)834203424483934088L) + up.c(4780, 6930839281229848930L)) / up.c(8826, 7353724606566420550L) ^ up.c(8603, 5115292194785022498L);
                        if (!var2_2) continue block86;
lbl459:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(up.c(12604, 8296732751342256319L) - up.c(65, 35902105467187970L)), (int)up.c(6224, 1203333896891132411L), (long)834203424483934088L) + up.c(15537, 853421850125258459L) + up.c(25325, 5057493915971293773L));
                        if (!var2_2) continue block86;
lbl461:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)up.c(3, 2224805219657413016L), (int)up.c(7481, 1487028308243279818L), (long)834203424483934088L) + up.c(28360, 2208952958499692014L));
                        if (!var2_2) continue block86;
lbl463:
                        // 2 sources

                        v27 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)up.c(25924, 8230513118632842287L), (int)up.c(15675, 7703176185116118958L), (long)834203424483934088L), (int)up.c(10338, 3042329156126235095L), (long)834203424483934088L) - up.c(19650, 1356373039012363631L));
lbl464:
                        // 2 sources

                        if (!var2_2) continue block86;
lbl465:
                        // 2 sources

                        var5_3 /* !! */  = (hi.a("G", (int)up.c(3709, 5237159730680003881L), (int)up.c(10041, 2097377927671240353L), (long)834203424483934088L) * up.c(18816, 3556751646034180935L) - up.c(24231, 3810799377916276475L) ^ up.c(2679, 357222085947947333L)) + up.c(7276, 2206866629627112509L);
                        if (!var2_2) continue block86;
lbl467:
                        // 2 sources

                        v28 = hi.a("G", (int)hi.a("G", (int)up.c(30448, 2254734022029510035L), (int)up.c(1218, 3152758375638561799L), (long)834203424483934088L), (int)up.c(27492, 6068415777948604932L), (long)834203424483934088L) - up.c(20074, 3973728729086704966L);
lbl468:
                        // 2 sources

                        var5_3 /* !! */  = (int)v28;
                        if (!var2_2) continue block86;
lbl470:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)up.c(10745, 1334351783284071224L), (int)up.c(11094, 3083665397369035674L), (long)834203424483934088L) / up.c(21522, 5752179181841687918L) - up.c(14581, 3403209331982650314L));
                        continue block86;
lbl472:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(up.c(7203, 7021212014509157771L) * up.c(32622, 5817953773223480694L) / 2), (int)up.c(30207, 8191032503997466481L), (long)834203424483934088L) + up.c(1721, 1673167985214781253L) - up.c(25038, 8115057177586471259L));
lbl473:
                        // 16 sources

                        switch (var5_3 /* !! */ ) {
                            default: {
                                return v6;
                            }
                            case 1877394286: {
                                return v6;
                            }
                            case 1877394288: {
                                return v6;
                            }
                            case 1877394285: {
                                return v6;
                            }
                            case 1877394284: {
                                return v6;
                            }
                            case 1877394281: {
                                return v6;
                            }
                            case 1877394283: {
                                return v6;
                            }
                            case 1877394289: {
                                return v6;
                            }
                            case 1877394287: 
                        }
                        return true;
                        case -1261965221: {
                            return false;
                        }
                        case -1261965256: {
                            return true;
                        }
                        case -1261965214: {
                            return true;
                        }
                        case -1261965242: {
                            return false;
                        }
                        case -1261965233: {
                            return false;
                        }
                        case -1261965237: {
                            return false;
                        }
                        case -1261965223: {
                            return false;
                        }
                        case -1261965208: {
                            return false;
                        }
                        case -1261965210: {
                            return true;
                        }
                        case -1261965235: 
                    }
                    break;
                }
                break;
            }
            return false;
        }
        do {
            switch (var5_3 /* !! */ ) {
                default: {
                    return v6;
                }
                case 613468264: 
            }
            hi.a("G", (long)1132178910276236922L);
            hi.a("G", (long)1125327632940799645L);
            var5_3 /* !! */  = hi.a("G", (int)(up.c(10287, 3380571832816589408L) * up.c(2063, 6828145165215627589L)), (int)up.c(24100, 6489400787965751215L), (long)834203424483934088L) / up.c(20263, 1297044987970633448L) ^ up.c(23292, 9146398540884257654L);
        } while (!var2_2);
        return true;
    }

    private boolean lambda$new$0() {
        boolean bl = Dl.t();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L), (Object)hi.a("j", (long)564288606335379272L), (long)511460060498514638L);
        if (!bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void y(int var1_1, ItemStack var2_2) {
        block18: {
            var3_3 = Dl.S();
            var6_4 /* !! */  = up.c(30376, 552204159717017359L) / up.c(19555, 6416917978405911779L) + up.c(26186, 556562295497299105L) - up.c(31687, 5129728607311792772L) + up.c(15445, 3282754990235078088L) - up.c(22909, 3673206111787723647L);
            if (!var3_3) ** GOTO lbl-1000
            v0 /* !! */  = var6_4 /* !! */ ;
            if (!var3_3) break block18;
            switch (v0 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var4_5 = up.V("9JSdvelroRuMtddK", H(int ), (int)var1_1);
                    v1 /* !! */  = hi.a("G", (Object)var4_5, (long)865432144196367974L);
                    if (!var3_3) ** GOTO lbl78
                    if (v1 /* !! */  == false) ** GOTO lbl77
                    ** GOTO lbl80
                }
                case -1954544268: {
                    v0 /* !! */  = (int)hi.a("G", (long)1018118041190145658L);
                }
            }
        }
        up.V("9JSdvelroRuMtddK", values());
        return;
lbl19:
        // 2 sources

        while (true) {
            hi.a("\u00a5", (Object)this, (int)(var5_6 + up.c(5449, 4795181062324807050L)), (int)var1_1, (long)421777221889031566L);
            if (var3_3) ** GOTO lbl100
lbl23:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (int)var5_6, (int)var1_1, (long)421777221889031566L);
                if (var3_3) ** GOTO lbl102
                return;
            }
            break;
        }
lbl-1000:
        // 10 sources

        {
            block19: {
                switch (var6_4 /* !! */ ) {
                    default: {
                        if (var2_2 == var4_5) ** GOTO lbl82
                        ** GOTO lbl84
                    }
                    case -195619193: {
                        v2 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1185054242439577997L);
                        if (!var3_3) ** GOTO lbl87
                        if (v2 /* !! */  == false) ** GOTO lbl86
                        ** GOTO lbl89
                    }
                    case -195619192: {
                        v3 /* !! */  = var5_6 = hi.a("G", (Object)new Object[]{var2_2}, (long)412971908298639953L);
                        v4 = -1;
                        if (!var3_3) ** GOTO lbl52
                        if (v3 /* !! */  == v4) ** GOTO lbl50
                        ** GOTO lbl54
                    }
                    case -195619195: {
                        hi.a("G", (long)836611189179038322L);
                        hi.a("G", (float)2.0f, (float)4.0f, (float)0.5f, (float)9.0f, (float)-0.5f, (long)1187820213443169771L);
                        var6_4 /* !! */  = (int)(hi.a("G", (int)(up.c(23761, 556787901603458850L) / 2 * up.c(23742, 6336382312633609732L)), (int)up.c(25537, 1039649302873576227L), (long)834203424483934088L) - up.c(11718, 9178410694916234332L));
                        continue block16;
                    }
lbl50:
                    // 1 sources

                    v3 /* !! */  = (CallSite)(hi.a("G", (int)(up.c(15602, 9209289097052671448L) / 3 * up.c(30971, 59654510749616651L)), (int)up.c(15889, 5607871473770286956L), (long)834203424483934088L) ^ up.c(28709, 5653600905179136521L));
                    v4 = up.c(32410, 1383785934756482163L);
lbl52:
                    // 2 sources

                    var6_4 /* !! */  = v3 /* !! */  ^ v4;
                    if (var3_3) continue block16;
lbl54:
                    // 2 sources

                    var6_4 /* !! */  = hi.a("G", (int)up.c(21221, 3543289595490705622L), (int)up.c(16374, 4608272818955078768L), (long)834203424483934088L) / 3 ^ up.c(4439, 6100596251142349716L) ^ up.c(17965, 7919535340504691732L) ^ up.c(26188, 4489330356994414361L);
                    if (var3_3) break block19;
                    ** GOTO lbl91
                    case -195619194: 
                }
                return;
            }
            do lbl-1000:
            // 3 sources

            {
                block22: {
                    block20: {
                        block21: {
                            switch (var6_4 /* !! */ ) {
                                default: {
                                    v5 = var5_6;
                                    v6 = up.c(23740, 7778447115784433176L);
                                    if (!var3_3) break block20;
                                    if (v5 >= v6) break block21;
                                    break block22;
                                }
                                case -1530591310: {
                                    ** GOTO lbl19
                                }
                                case -1530591311: {
                                    ** continue;
                                }
                                case -1530591309: {
                                    hi.a("G", (long)up.kb, (float)-9.0f, (float)0.0f, (float)0.0f, (float)-0.5f, (int)up.c(31164, 8845944542961666184L), (long)375734786785774161L);
                                    if (!var3_3) break;
                                    ** continue;
                                }
                            }
lbl77:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(hi.a("G", (int)(up.c(28295, 7661455786029325618L) / 3 * up.c(26327, 6254668233781090064L)), (int)up.c(4377, 2490240853631164431L), (long)834203424483934088L) ^ up.c(23100, 594738530506779429L) ^ up.c(2146, 1528754630711671029L));
lbl78:
                            // 2 sources

                            var6_4 /* !! */  = (int)v1 /* !! */ ;
                            if (var3_3) continue block16;
lbl80:
                            // 2 sources

                            var6_4 /* !! */  = (up.c(12727, 5725860946504926166L) ^ up.c(12476, 3004107345531617480L)) + up.c(5214, 971491306900186644L);
                            if (var3_3) continue block16;
lbl82:
                            // 2 sources

                            var6_4 /* !! */  = hi.a("G", (int)(up.c(15602, 9209289097052671448L) / 3 * up.c(30971, 59654510749616651L)), (int)up.c(15889, 5607871473770286956L), (long)834203424483934088L) ^ up.c(28709, 5653600905179136521L) ^ up.c(32410, 1383785934756482163L);
                            if (var3_3) continue block16;
lbl84:
                            // 2 sources

                            var6_4 /* !! */  = (int)(hi.a("G", (int)(up.c(17950, 275725853276091573L) - up.c(5942, 6762070910962623853L)), (int)up.c(32039, 7623792246239825918L), (long)834203424483934088L) - up.c(30794, 5672545488658237914L) - up.c(6763, 3812500561897646574L));
                            if (var3_3) continue block16;
lbl86:
                            // 2 sources

                            v2 /* !! */  = (CallSite)(hi.a("G", (int)(up.c(15602, 9209289097052671448L) / 3 * up.c(30971, 59654510749616651L)), (int)up.c(15889, 5607871473770286956L), (long)834203424483934088L) ^ up.c(28709, 5653600905179136521L) ^ up.c(32410, 1383785934756482163L));
lbl87:
                            // 2 sources

                            var6_4 /* !! */  = (int)v2 /* !! */ ;
                            if (var3_3) continue block16;
lbl89:
                            // 2 sources

                            var6_4 /* !! */  = (up.c(2060, 1177831065594952631L) - up.c(26292, 7825330097091942125L) ^ up.c(12289, 1210117694891409859L)) / up.c(31164, 8845944542961666184L) + up.c(8059, 3943847883838418231L) - up.c(9094, 6159028756768969561L);
                            continue block16;
                        }
                        v5 = hi.a("G", (int)(up.c(31327, 9033656624206481420L) / up.c(19376, 1556583175771339766L) * up.c(29949, 6097251952972268704L)), (int)up.c(527, 8358948145013485829L), (long)834203424483934088L);
                        v6 = up.c(6996, 5024044328932240298L);
                    }
                    var6_4 /* !! */  = (int)(v5 - v6);
                    if (var3_3) ** GOTO lbl-1000
                }
                var6_4 /* !! */  = (int)(hi.a("G", (int)(up.c(617, 4328117048676315302L) - up.c(27351, 5211029834083310382L) + up.c(9702, 6933045839444694838L) ^ up.c(32368, 6394451586783219553L)), (int)up.c(2937, 4803241255973124623L), (long)834203424483934088L) - up.c(30990, 8396963207975406357L));
            } while (var3_3);
lbl100:
            // 2 sources

            var6_4 /* !! */  = up.V("9JSdvelroRuMtddK", max(int int ), (int)(up.c(15602, 9209289097052671448L) / 3 * up.c(30971, 59654510749616651L)), (int)up.c(15889, 5607871473770286956L)) ^ up.c(28709, 5653600905179136521L) ^ up.c(32410, 1383785934756482163L);
            if (var3_3) continue;
lbl102:
            // 2 sources

            var6_4 /* !! */  = hi.a("G", (int)(up.c(15602, 9209289097052671448L) / 3 * up.c(30971, 59654510749616651L)), (int)up.c(15889, 5607871473770286956L), (long)834203424483934088L) ^ up.c(28709, 5653600905179136521L) ^ up.c(32410, 1383785934756482163L);
            ** while (true)
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean E() {
        block12: {
            var1_1 = Dl.t();
            var2_2 /* !! */  = hi.a("G", (int)(up.c(3205, 1905108994410970189L) / up.c(21522, 5752179181841687918L) * up.c(9138, 5027397005908824230L)), (int)up.c(7108, 3717225168819382350L), (long)834203424483934088L) * up.c(25339, 4208701840033485116L) - up.c(31421, 5486687949225266122L);
            if (!var1_1) ** GOTO lbl14
            block9: while (true) {
                block15: {
                    block14: {
                        block13: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1265602133107695556L), (Object)hi.a("j", (long)925497335648930051L), (long)511460060498514638L);
                            if (var1_1) break block13;
                            if (v0 /* !! */  != false) break block14;
                            v0 /* !! */  = var2_2 /* !! */  = (CallSite)(hi.a("G", (int)up.c(24822, 2740249193426980918L), (int)up.c(29122, 5767437613030735900L), (long)834203424483934088L) - up.c(9571, 4992166523111429537L) ^ up.c(20488, 7205588384011395658L) ^ up.c(20799, 4678605934661673635L) ^ up.c(4157, 1397433699082068619L));
                        }
                        if (!var1_1) break block15;
                    }
                    var2_2 /* !! */  = (CallSite)((up.c(6643, 9142197270379752171L) ^ up.c(12503, 1112654666595188786L) ^ up.c(9203, 1668550862731334415L)) + up.c(17434, 4559349054159107485L) ^ up.c(30893, 4534621968816966504L));
                    if (var1_1) ** GOTO lbl35
                }
                while (true) {
                    block16: {
                        switch (var2_2 /* !! */ ) {
                            default: {
                                continue block9;
                            }
                            case -1116114473: {
                                if (hi.a("\u00e9", (Object)this, (long)863823602747816557L) == hi.a("j", (long)669539097074851102L)) break;
                                break block16;
                            }
                            case -1116114474: {
                                v1 = true;
                                var2_2 /* !! */  = (CallSite)(up.c(21565, 3399673137712604827L) / up.c(12325, 5153503090871124677L) ^ up.c(12310, 227288707272229845L) ^ up.c(4411, 7670037557230723462L));
                                if (var1_1) {
                                    break block9;
                                }
                                break block12;
                            }
                            case -1116114475: {
                                v1 = false;
                                if (!var1_1) break block9;
                                return v1;
                            }
                            case -1116114476: {
                                up.V("9JSdvelroRuMtddK", H(int ), (int)up.c(8318, 1058456429391434143L));
                                return (boolean)hi.a("G", (long)1031195239253115725L);
                            }
                        }
lbl35:
                        // 2 sources

                        var2_2 /* !! */  = (CallSite)(hi.a("G", (int)up.c(28162, 785280072893537969L), (int)up.c(22787, 6351324903551773352L), (long)834203424483934088L) - up.c(18367, 1369042790132266183L) ^ up.c(6333, 6841122835809298827L) ^ up.c(19708, 7998273521332010698L) ^ up.c(6989, 8634333433788131871L));
                        if (!var1_1) continue;
                    }
                    var2_2 /* !! */  = (CallSite)((up.c(11138, 4683474736758544740L) - up.c(19241, 615801314730850624L)) / 2 * up.c(16892, 4772837877730194032L) + up.c(32062, 8885154339852258793L));
                }
                break;
            }
            var2_2 /* !! */  = (CallSite)(up.c(27063, 2581047095796406499L) / up.c(12325, 5153503090871124677L) ^ up.c(27594, 5810311830367771521L) ^ up.c(24812, 9066545620919357514L));
        }
        switch (var2_2 /* !! */ ) {
            case -1560129478: {
                hi.a("G", (float)-1.0f, (float)100.0f, (int)up.c(20263, 1297044987970633448L), (long)1082687364106926467L);
                return v1;
            }
        }
        return v1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void f(int var1_1) {
        block12: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = up.c(28478, 7255868624952171680L) * up.c(17074, 3321009243605643469L) * up.c(15545, 4123976962206846047L) + up.c(24764, 1608871485333639565L) - up.c(15866, 6463096010375351491L);
            if (!var2_2) break block12;
lbl4:
            // 2 sources

            while (true) {
                v0 = var1_1;
                v1 = up.c(23740, 7778447115784433176L);
                if (var2_2) ** GOTO lbl42
                if (v0 >= v1) ** GOTO lbl40
                ** GOTO lbl44
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (int)(var1_1 + up.c(5449, 4795181062324807050L)), (int)up.c(4053, 6052619909514001812L), (long)421777221889031566L);
                if (!var2_2) ** GOTO lbl46
lbl14:
                // 2 sources

                while (true) {
                    hi.a("\u00a5", (Object)this, (int)var1_1, (int)up.c(2700, 1782874958843082904L), (long)421777221889031566L);
                    if (var2_2) lbl-1000:
                    // 2 sources

                    {
                        return;
                    }
                    ** GOTO lbl48
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
                case 2117422585: {
                    ** continue;
                }
                case 2117422587: {
                    ** continue;
                }
                case 2117422584: {
                    ** continue;
                }
                case 2117422583: 
            }
            hi.a("G", (long)513793135028248171L);
            hi.a("G", (long)930884602760909661L);
            var3_3 /* !! */  = up.c(25531, 7099461494496432469L) / up.c(21522, 5752179181841687918L) / up.c(11499, 8560006226523742001L) - up.c(16848, 1026397056439956074L);
            if (!var2_2) continue;
lbl40:
            // 2 sources

            v0 = up.c(1924, 2091801881112639346L) * up.c(3701, 783974715495742717L) + up.c(6216, 361003728142985410L) - up.c(2509, 7543648463364815251L);
            v1 = up.c(28007, 4356370543258902216L);
lbl42:
            // 2 sources

            var3_3 /* !! */  = v0 - v1;
            if (!var2_2) continue;
lbl44:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)(up.c(5159, 2603539925828855461L) - up.c(10888, 7764761212478576740L)), (int)up.c(8653, 7620479705948803216L), (long)834203424483934088L) + up.c(9053, 2233398115385889700L));
            if (!var2_2) continue;
lbl46:
            // 2 sources

            var3_3 /* !! */  = (up.c(13892, 1291474240298797031L) + up.c(12323, 7448360207451046609L)) / 2 - up.c(28167, 8377377490249129837L);
            if (!var2_2) continue;
lbl48:
            // 2 sources

            var3_3 /* !! */  = (up.c(24416, 3353079627731709628L) + up.c(10976, 5499848225124735835L)) / 2 - up.c(31558, 5211242151201769660L);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean l(int var1_1) {
        block9: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = (up.c(22771, 8135535263492319883L) ^ up.c(20207, 7192439504723852510L)) - up.c(14285, 529131053709968403L) + up.c(7372, 2606199623973105438L);
            if (var2_2) break block9;
lbl4:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1038710010063338291L);
                if (!var2_2) ** GOTO lbl31
                if (v0 /* !! */  != false) ** GOTO lbl30
                ** GOTO lbl33
                break;
            }
lbl9:
            // 1 sources

            return false;
lbl11:
            // 1 sources

            while (true) {
                hi.a("G", (int)var1_1, (long)1040117516474656258L);
                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)555034192595512565L);
                return true;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1148995660: {
                    ** continue;
                }
                case 1148995658: {
                    ** continue;
                }
                case 1148995659: 
            }
            hi.a("G", (long)1232023252855193994L);
            var3_3 /* !! */  = hi.a("G", (int)(up.c(6018, 97745255407805984L) ^ up.c(19894, 7690729116572499251L)), (int)up.c(16816, 7297197651819180317L), (long)834203424483934088L) - up.c(27300, 5970693494871890701L) - up.c(4909, 6815922588453691982L) ^ up.c(27782, 3475889157319171919L);
            if (var2_2) continue;
lbl30:
            // 2 sources

            v0 /* !! */  = (CallSite)(up.c(19894, 2385702150851444664L) / up.c(23740, 7778447115784433176L) + up.c(4381, 7229556707797754738L));
lbl31:
            // 2 sources

            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (var2_2) continue;
lbl33:
            // 2 sources

            var3_3 /* !! */  = up.c(23090, 917138806452071356L) * up.c(29275, 5284687588022255801L) + up.c(22030, 6297247371375780895L) ^ up.c(3547, 3848069802435936142L);
        }
    }

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1220030166447599141L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1301392709081523158L);
        hi.a("\u00f2", (Object)this, (ul)((Object)hi.a("j", (long)669539097074851102L)), (long)863823602747816557L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)934570417537298009L);
        hi.a("\u00f2", (Object)this, (int)hi.a("G", (int)up.V("9JSdvelroRuMtddK", intValue(), (Integer)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1154369137446364194L), (long)789438897355831922L)))), (int)up.V("9JSdvelroRuMtddK", intValue(), (Integer)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1015559347108412289L), (long)789438897355831922L)))), (long)656208795491924261L), (long)540033440955626761L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)710652402433032063L), (long)779279608538024261L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    private void F(dQ var1_1) {
        block62: {
            block61: {
                block59: {
                    block60: {
                        block58: {
                            block56: {
                                block57: {
                                    block55: {
                                        block53: {
                                            block54: {
                                                block52: {
                                                    block50: {
                                                        block51: {
                                                            block49: {
                                                                block47: {
                                                                    block48: {
                                                                        block46: {
                                                                            block44: {
                                                                                block45: {
                                                                                    block43: {
                                                                                        block41: {
                                                                                            block42: {
                                                                                                block40: {
                                                                                                    block38: {
                                                                                                        block39: {
                                                                                                            block37: {
                                                                                                                block36: {
                                                                                                                    block34: {
                                                                                                                        block35: {
                                                                                                                            block33: {
                                                                                                                                block31: {
                                                                                                                                    block32: {
                                                                                                                                        var2_2 = Dl.S();
                                                                                                                                        var3_3 /* !! */  = up.c(21216, 7573838356888495034L) * up.c(12613, 5026672022652174959L) ^ up.c(26221, 3457377030881383538L) ^ up.c(5313, 7850048545238377905L);
                                                                                                                                        if (!var2_2) lbl-1000:
                                                                                                                                        // 2 sources

                                                                                                                                        {
                                                                                                                                            while (true) {
                                                                                                                                                v0 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L) instanceof ServerboundContainerClosePacket;
                                                                                                                                                if (!var2_2) break block31;
                                                                                                                                                if (v0 == 0) break block32;
                                                                                                                                                break block33;
                                                                                                                                                break;
                                                                                                                                            }
lbl9:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                hi.a("\u00f2", (Object)this, (boolean)false, (long)1301392709081523158L);
                                                                                                                                                if (!var2_2) break block34;
                                                                                                                                                if (hi.a("\u00e9", (Object)this, (long)863823602747816557L) != hi.a("j", (long)557927702321373114L)) break block35;
                                                                                                                                                break block36;
                                                                                                                                                break;
                                                                                                                                            }
lbl14:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                hi.a("\u00f2", (Object)this, (ul)hi.a("j", (long)669539097074851102L), (long)863823602747816557L);
                                                                                                                                                if (var2_2) break block37;
lbl17:
                                                                                                                                                // 2 sources

                                                                                                                                                while (true) {
                                                                                                                                                    v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)1301392709081523158L);
                                                                                                                                                    if (!var2_2) break block38;
                                                                                                                                                    if (v1 /* !! */  == false) break block39;
                                                                                                                                                    break block40;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
lbl22:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1265602133107695556L), (Object)hi.a("j", (long)925497335648930051L), (long)511460060498514638L);
                                                                                                                                                if (!var2_2) break block41;
                                                                                                                                                if (v2 /* !! */  == false) break block42;
                                                                                                                                                break block43;
                                                                                                                                                break;
                                                                                                                                            }
lbl27:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v3 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L) instanceof ServerboundMovePlayerPacket;
                                                                                                                                                if (!var2_2) break block44;
                                                                                                                                                if (v3 != 0) break block45;
                                                                                                                                                break block46;
                                                                                                                                                break;
                                                                                                                                            }
lbl32:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v4 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L) instanceof ServerboundUseItemOnPacket;
                                                                                                                                                if (!var2_2) break block47;
                                                                                                                                                if (v4 != 0) break block48;
                                                                                                                                                break block49;
                                                                                                                                                break;
                                                                                                                                            }
lbl37:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v5 = up.V("9JSdvelroRuMtddK", N(), (dQ)var1_1) instanceof ServerboundUseItemPacket;
                                                                                                                                                if (!var2_2) break block50;
                                                                                                                                                if (v5 != 0) break block51;
                                                                                                                                                break block52;
                                                                                                                                                break;
                                                                                                                                            }
lbl42:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v6 = up.V("9JSdvelroRuMtddK", N(), (dQ)var1_1) instanceof ServerboundInteractPacket;
                                                                                                                                                if (!var2_2) break block53;
                                                                                                                                                if (v6 != 0) break block54;
                                                                                                                                                break block55;
                                                                                                                                                break;
                                                                                                                                            }
lbl47:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v7 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L) instanceof ServerboundAttackPacket;
                                                                                                                                                if (!var2_2) break block56;
                                                                                                                                                if (v7 != 0) break block57;
                                                                                                                                                break block58;
                                                                                                                                                break;
                                                                                                                                            }
lbl52:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v8 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L) instanceof ServerboundPlayerActionPacket;
                                                                                                                                                if (!var2_2) break block59;
                                                                                                                                                if (v8 == 0) break block60;
                                                                                                                                                break block61;
                                                                                                                                                break;
                                                                                                                                            }
lbl57:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                hi.a("\u00f2", (Object)this, (boolean)false, (long)1301392709081523158L);
                                                                                                                                                hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (Object)new ServerboundContainerClosePacket((int)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1223784520533413643L), (long)836509641775052142L)), (long)367302555785540234L);
                                                                                                                                                if (!var2_2) lbl-1000:
                                                                                                                                                // 2 sources

                                                                                                                                                {
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                break block62;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
lbl64:
                                                                                                                                        // 24 sources

                                                                                                                                        while (true) {
                                                                                                                                            switch (var3_3 /* !! */ ) {
                                                                                                                                                default: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536245: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536248: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536244: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536241: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536247: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536249: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536251: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536246: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536254: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536250: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536253: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536243: {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                case -1304536252: 
                                                                                                                                            }
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v0 = var3_3 /* !! */  = (up.c(19176, 149102438307183511L) - up.c(2839, 4282324062493276179L) ^ up.c(5285, 3082348806011839514L) ^ up.c(28676, 6495658145161184053L) ^ up.c(6293, 3130114471895788060L)) - up.c(7456, 551787081564876203L);
                                                                                                                                }
                                                                                                                                if (var2_2) ** GOTO lbl64
                                                                                                                            }
                                                                                                                            var3_3 /* !! */  = up.c(28872, 4162029686905176663L) - up.c(17804, 4398837217070396620L) + up.c(25615, 4343912047349766107L);
                                                                                                                            if (var2_2) ** GOTO lbl64
                                                                                                                        }
                                                                                                                        var3_3 /* !! */  = (up.c(30938, 8718913274671139306L) - up.c(28186, 5927730611747527918L) ^ up.c(18803, 5008410490289732005L) ^ up.c(31432, 686822072940103948L) ^ up.c(4324, 3161970019617038905L)) - up.c(12848, 6899147212533285328L);
                                                                                                                    }
                                                                                                                    if (var2_2) ** GOTO lbl64
                                                                                                                }
                                                                                                                var3_3 /* !! */  = hi.a("G", (int)(up.c(1949, 3272594945421800807L) - up.c(26578, 284154431255811338L)), (int)up.c(19473, 1123273947614953310L), (long)834203424483934088L) + up.c(10193, 784156397104780417L) ^ up.c(26134, 4277843471190824391L);
                                                                                                                if (var2_2) ** GOTO lbl64
                                                                                                            }
                                                                                                            var3_3 /* !! */  = (up.c(30938, 8718913274671139306L) - up.c(28186, 5927730611747527918L) ^ up.c(18803, 5008410490289732005L) ^ up.c(31432, 686822072940103948L) ^ up.c(4324, 3161970019617038905L)) - up.c(12848, 6899147212533285328L);
                                                                                                            if (var2_2) ** GOTO lbl64
                                                                                                        }
                                                                                                        v1 /* !! */  = (CallSite)(up.c(7480, 2837809606295579735L) + up.c(25716, 8939981024048519096L) ^ up.c(6653, 6838427541101897915L));
                                                                                                    }
                                                                                                    var3_3 /* !! */  = (int)v1 /* !! */ ;
                                                                                                    if (var2_2) ** GOTO lbl64
                                                                                                }
                                                                                                var3_3 /* !! */  = (up.c(27338, 8853021102291196170L) + up.c(18418, 5947615503330588140L) ^ up.c(27036, 3978219519789963586L)) / up.c(19555, 6416917978405911779L) * up.c(8080, 4259761908772760802L) + up.c(27527, 3957668862512535791L);
                                                                                                if (var2_2) ** GOTO lbl64
                                                                                            }
                                                                                            v2 /* !! */  = (CallSite)(up.c(32761, 4857104230363303080L) + up.c(4085, 8676716698308804230L) ^ up.c(21260, 6369196135099998946L));
                                                                                        }
                                                                                        var3_3 /* !! */  = (int)v2 /* !! */ ;
                                                                                        if (var2_2) ** GOTO lbl64
                                                                                    }
                                                                                    var3_3 /* !! */  = up.c(21013, 4913131678706213266L) ^ up.c(31165, 6070472483258698022L) ^ up.c(16743, 8682622754063265978L);
                                                                                    if (var2_2) ** GOTO lbl64
                                                                                }
                                                                                v3 = var3_3 /* !! */  = (up.c(17286, 5972744564591342345L) * up.c(25164, 6612932182444118439L) + up.c(7039, 4590539995903453875L) - up.c(13979, 4173377267087295762L)) * up.c(31997, 2282163829385366806L) + up.c(25519, 6536356530375693002L);
                                                                            }
                                                                            if (var2_2) ** GOTO lbl64
                                                                        }
                                                                        var3_3 /* !! */  = (up.c(11557, 5492489042389229045L) - up.c(25225, 6245942647277818760L) ^ up.c(19023, 7162712847863298361L)) + up.c(26641, 4904117448451594772L) - up.c(19871, 2389758106865483351L) + up.c(11328, 8339888534550896254L);
                                                                        if (var2_2) ** GOTO lbl64
                                                                    }
                                                                    v4 = var3_3 /* !! */  = (up.c(23600, 7855197996462616133L) * up.c(23990, 7409824933253918387L) + up.c(13267, 1493324673300054537L) - up.c(24298, 1801475960067993039L)) * up.c(28238, 2594570387904011925L) + up.c(3159, 9222477077763424100L);
                                                                }
                                                                if (var2_2) ** GOTO lbl64
                                                            }
                                                            var3_3 /* !! */  = (hi.a("G", (int)hi.a("G", (int)up.c(7357, 2444541918045499322L), (int)up.c(12556, 9170339031194944015L), (long)834203424483934088L), (int)up.c(28231, 6301961809438121101L), (long)834203424483934088L) ^ up.c(6686, 8400615395455101157L)) * up.c(3883, 4758663698871778428L) - up.c(23552, 6483894016829304050L);
                                                            if (var2_2) ** GOTO lbl64
                                                        }
                                                        v5 = var3_3 /* !! */  = (up.c(23600, 7855197996462616133L) * up.c(23990, 7409824933253918387L) + up.c(13267, 1493324673300054537L) - up.c(24298, 1801475960067993039L)) * up.c(28238, 2594570387904011925L) + up.c(3159, 9222477077763424100L);
                                                    }
                                                    if (var2_2) ** GOTO lbl64
                                                }
                                                var3_3 /* !! */  = up.c(8189, 5423428812448656792L) ^ up.c(7195, 5477933531190128402L) ^ up.c(21463, 3052699202345246966L);
                                                if (var2_2) ** GOTO lbl64
                                            }
                                            v6 = var3_3 /* !! */  = (up.c(23600, 7855197996462616133L) * up.c(23990, 7409824933253918387L) + up.c(13267, 1493324673300054537L) - up.c(24298, 1801475960067993039L)) * up.c(28238, 2594570387904011925L) + up.c(3159, 9222477077763424100L);
                                        }
                                        if (var2_2) ** GOTO lbl64
                                    }
                                    var3_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(up.c(6399, 1771119247035951582L) + up.c(4530, 7295086479503090370L)), (int)up.c(20287, 7583710076113206997L), (long)834203424483934088L) + up.c(9732, 787623110074356857L)), (int)up.c(27035, 2192061373640513762L), (long)834203424483934088L) ^ up.c(14474, 4922078992648358537L);
                                    if (var2_2) ** GOTO lbl64
                                }
                                v7 = var3_3 /* !! */  = (up.c(23600, 7855197996462616133L) * up.c(23990, 7409824933253918387L) + up.c(13267, 1493324673300054537L) - up.c(24298, 1801475960067993039L)) * up.c(28238, 2594570387904011925L) + up.c(3159, 9222477077763424100L);
                            }
                            if (var2_2) ** GOTO lbl64
                        }
                        var3_3 /* !! */  = up.c(13627, 331772769924039852L) + up.c(24859, 4205746400575165321L) - up.c(25242, 4742881411447329669L) + up.c(13052, 7289069567373033659L);
                        if (var2_2) ** GOTO lbl64
                    }
                    v8 = var3_3 /* !! */  = up.c(32761, 4857104230363303080L) + up.c(4085, 8676716698308804230L) ^ up.c(21260, 6369196135099998946L);
                }
                if (var2_2) ** GOTO lbl64
            }
            var3_3 /* !! */  = (up.c(23600, 7855197996462616133L) * up.c(23990, 7409824933253918387L) + up.c(13267, 1493324673300054537L) - up.c(24298, 1801475960067993039L)) * up.c(28238, 2594570387904011925L) + up.c(3159, 9222477077763424100L);
            if (var2_2) ** GOTO lbl64
        }
        var3_3 /* !! */  = up.c(32761, 4857104230363303080L) + up.c(4085, 8676716698308804230L) ^ up.c(21260, 6369196135099998946L);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$5() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)up.V("9JSdvelroRuMtddK", z(), (Xn)((Object)hi.a("\u00e9", (Object)this, (long)601812877219896921L))))), (long)1000026253634408124L);
                    if (bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1120046356273634799L), (long)789438897355831922L))), (long)1000026253634408124L);
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L), (Object)hi.a("j", (long)911553817953895964L), (long)511460060498514638L);
            }
            if (bl) return (boolean)object;
            if (object == false) {
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
                bl = Dl.S();
                object = up.V("9JSdvelroRuMtddK", booleanValue(), (Boolean)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)772548289890747595L), (long)789438897355831922L))));
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L), (Object)hi.a("j", (long)1031859173964222050L), (long)511460060498514638L);
            }
            if (!bl) return (boolean)object;
            if (object == false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean W(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        boolean bl = Dl.S();
        int n2 = hi.a("G", (int)(up.c(5755, 2157838786819549140L) ^ up.c(8680, 1380228135216205906L)), (int)up.c(6569, 4830527947087735775L), (long)834203424483934088L) + up.c(18238, 797359220444411222L) ^ up.c(11013, 5988765211705531219L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        Object object2 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1038710010063338291L);
                        if (!bl) break block9;
                        if (object2 == false) break block10;
                        object2 = object = (Object)(up.c(18613, 8915935185753553191L) - up.c(13333, 1627835566930019412L) - up.c(30969, 1882890808224680894L) - up.c(7359, 3163306797428337782L) - up.c(15619, 8421091797487177521L));
                    }
                    if (bl) break block8;
                }
                object = hi.a("G", (int)up.c(26990, 7133001423369771841L), (int)up.c(17068, 1380748566175723787L), (long)834203424483934088L) ^ up.c(12447, 4022513941570142267L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case -1371003511: {
                    return false;
                }
                case -1371003508: {
                    hi.a("G", (int)n, (long)902898246708732704L);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)555034192595512565L);
                    return true;
                }
                case -1371003510: 
            }
            break;
        }
        hi.a("G", (long)1296298356484719498L);
        up.V("9JSdvelroRuMtddK", Q());
        return (boolean)up.V("9JSdvelroRuMtddK", L(int ), (int)1);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void v(Object[] var1_1) {
        block28: {
            var3_2 = (Integer)var1_1[0];
            var2_3 = (Item)var1_1[1];
            var4_4 = Dl.t();
            var8_5 /* !! */  = up.c(20738, 6829118367471345675L) - up.c(13644, 8922220515736176057L) - up.c(16288, 5924547023700545489L);
            if (!var4_4) break block28;
lbl7:
            // 2 sources

            while (true) {
                v0 = var3_2;
                while (true) {
                    var5_6 = hi.a("G", (int)v0, (long)1303164259642563020L);
                    v1 /* !! */  = hi.a("G", (Object)var5_6, (long)865432144196367974L);
                    if (var4_4) ** GOTO lbl116
                    if (v1 /* !! */  == false) ** GOTO lbl115
                    ** GOTO lbl118
                    break;
                }
                break;
            }
lbl15:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (int)var6_7, (int)var3_2, (long)421777221889031566L);
                if (var4_4) {
                    return;
                }
                ** GOTO lbl151
                break;
            }
        }
        while (true) {
            switch (var8_5 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 455332041: 
            }
            hi.a("G", (long)1327200575414382593L);
            hi.a("G", (long)1229653054671944966L);
            v0 = (up.c(19382, 6718523000628624127L) / up.c(16292, 4263942471320850288L) - up.c(11330, 9185754130098839148L)) / 2 ^ up.c(29466, 6949078455488971181L);
            if (var4_4) ** continue;
            var8_5 /* !! */  = v0;
        }
lbl-1000:
        // 10 sources

        {
            block30: {
                block27: {
                    block26: {
                        block29: {
                            switch (var8_5 /* !! */ ) {
                                default: {
                                    v2 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1185054242439577997L);
                                    if (var4_4) ** GOTO lbl121
                                    if (v2 /* !! */  == false) ** GOTO lbl120
                                    ** GOTO lbl123
                                }
                                case -1358618748: {
                                    v3 /* !! */  = var6_7 = hi.a("G", (Object)var2_3, (long)829003731361397758L);
                                    v4 = -1;
                                    if (var4_4) ** GOTO lbl54
                                    if (v3 /* !! */  == v4) ** GOTO lbl52
                                    ** GOTO lbl56
                                }
                                case -1358618747: {
                                    hi.a("G", (long)1254720339774257797L);
                                    return;
                                }
lbl52:
                                // 1 sources

                                v3 /* !! */  = (CallSite)(up.c(29098, 6631101025112326690L) / up.c(21522, 5752179181841687918L) * up.c(16573, 2149018891720012186L) * up.c(17567, 3690358674055476691L));
                                v4 = up.c(52, 3203030653509759314L);
lbl54:
                                // 2 sources

                                var8_5 /* !! */  = v3 /* !! */  ^ v4;
                                if (!var4_4) continue block22;
lbl56:
                                // 2 sources

                                var8_5 /* !! */  = (int)(up.V("9JSdvelroRuMtddK", max(int int ), (int)up.c(25362, 261020627320672922L), (int)up.c(1714, 8254489167286564618L)) - up.c(8773, 314802725040017637L));
                                break block29;
                                case -1358618750: 
                            }
                            return;
                        }
                        block23: while (true) {
                            switch (var8_5 /* !! */ ) {
                                default: {
                                    var7_8 = hi.a("G", (int)var6_7, (long)1303164259642563020L);
                                    if (var4_4) break block26;
                                    if (up.V("9JSdvelroRuMtddK", getItem(), (ItemStack)var5_6) != var2_3) break block23;
                                    break block27;
                                }
                                case 1010159747: {
                                    hi.a("G", (long)461891726241433586L);
                                    hi.a("G", (float)0.5f, (float)0.0f, (float)100.0f, (float)10.0f, (long)796776827756410481L);
                                    var8_5 /* !! */  = hi.a("G", (int)up.c(6745, 3362283788732623746L), (int)up.c(26992, 8250190676582603190L), (long)834203424483934088L) - up.c(26364, 4343191320968861127L) - up.c(30909, 3722360979793185341L) ^ up.c(24820, 4591090689013223697L);
                                    if (var4_4) continue block22;
                                    continue block23;
                                }
                            }
                            break;
                        }
                        var8_5 /* !! */  = ((up.c(11894, 5003736605970161399L) ^ up.c(1557, 1863069728698397894L)) + up.c(12918, 2823115188960608399L)) / up.c(23740, 7778447115784433176L) / up.c(28003, 7146748952301083670L) + up.c(23709, 6689346650718842544L);
                    }
                    if (!var4_4) break block30;
                }
                var8_5 /* !! */  = hi.a("G", (int)(hi.a("G", (int)up.c(11190, 3260388940287826537L), (int)up.c(5571, 3704935918268737247L), (long)834203424483934088L) / up.c(27960, 6075589669033156489L) * up.c(26665, 3453573202946922654L)), (int)up.c(18714, 7344223811734158009L), (long)834203424483934088L) ^ up.c(32275, 3604631696186379997L);
                if (var4_4) ** GOTO lbl125
            }
            block24: do lbl-1000:
            // 6 sources

            {
                block38: {
                    block36: {
                        block37: {
                            block35: {
                                block33: {
                                    block34: {
                                        block32: {
                                            block31: {
                                                switch (var8_5 /* !! */ ) {
                                                    default: {
                                                        if (hi.a("\u00a5", (Object)var5_6, (long)769006157898026769L) != var2_3) break block31;
                                                        break block32;
                                                    }
                                                    case 1344980016: {
                                                        v5 /* !! */  = up.V("9JSdvelroRuMtddK", getCount(), (ItemStack)var5_6);
                                                        v6 /* !! */  = up.V("9JSdvelroRuMtddK", getCount(), (ItemStack)var7_8);
                                                        if (var4_4) break block33;
                                                        if (v5 /* !! */  >= v6 /* !! */ ) break block34;
                                                        break block35;
                                                    }
                                                    case 1344980013: {
                                                        v7 /* !! */  = var6_7;
                                                        v8 = up.c(25796, 4768274114001278937L);
                                                        if (var4_4) break block36;
                                                        if (v7 /* !! */  >= v8) break block37;
                                                        break block38;
                                                    }
                                                    case 1344980014: {
                                                        up.V("9JSdvelroRuMtddK", l(int int ), (up)this, (int)(var6_7 + up.c(2591, 5287091690370989013L)), (int)var3_2);
                                                        if (!var4_4) break block24;
                                                        ** GOTO lbl15
                                                    }
                                                    case 1344980015: {
                                                        ** continue;
                                                    }
                                                    case 1344980018: {
                                                        hi.a("G", (int)0, (long)661332433958006309L);
                                                        hi.a("G", (long)1115568667421921156L);
                                                        var8_5 /* !! */  = (int)(hi.a("G", (int)(up.c(31207, 3282342569912928272L) / 4), (int)up.c(16775, 4960836406039032284L), (long)834203424483934088L) - up.c(21717, 7855242466251613259L));
                                                        if (!var4_4) ** GOTO lbl-1000
                                                    }
                                                }
lbl115:
                                                // 2 sources

                                                v1 /* !! */  = (CallSite)(up.c(29388, 1196669257794584959L) / up.c(23491, 5859134561753475462L) * up.c(21156, 8526201185206936076L) * up.c(13919, 5743500856207230918L) ^ up.c(8990, 3522255452389593830L));
lbl116:
                                                // 2 sources

                                                var8_5 /* !! */  = (int)v1 /* !! */ ;
                                                if (!var4_4) continue block22;
lbl118:
                                                // 2 sources

                                                var8_5 /* !! */  = (up.c(10153, 1742973982881535968L) - up.c(25259, 6879340633420993357L) - up.c(5306, 5813283889698628713L)) / up.c(28003, 7146748952301083670L) - up.c(21505, 237781348829636606L);
                                                if (!var4_4) continue block22;
lbl120:
                                                // 2 sources

                                                v2 /* !! */  = (CallSite)(up.c(29098, 6631101025112326690L) / up.c(21522, 5752179181841687918L) * up.c(16573, 2149018891720012186L) * up.c(17567, 3690358674055476691L) ^ up.c(52, 3203030653509759314L));
lbl121:
                                                // 2 sources

                                                var8_5 /* !! */  = (int)v2 /* !! */ ;
                                                if (!var4_4) continue block22;
lbl123:
                                                // 2 sources

                                                var8_5 /* !! */  = up.c(30319, 4528152219342439527L) / up.c(23740, 7778447115784433176L) / 4 + up.c(14558, 7902325371598687072L) + up.c(401, 1602289907306033868L);
                                                continue block22;
                                            }
                                            var8_5 /* !! */  = up.c(29098, 6631101025112326690L) / up.c(21522, 5752179181841687918L) * up.c(16573, 2149018891720012186L) * up.c(17567, 3690358674055476691L) ^ up.c(52, 3203030653509759314L);
                                            if (!var4_4) continue block22;
                                        }
                                        var8_5 /* !! */  = (up.c(55, 3832231418154414736L) * up.c(1980, 298955637044115100L) + up.c(24889, 406108211883806825L)) / up.c(30005, 383898177146619350L) * up.c(25818, 8558713604122678736L) ^ up.c(23610, 8955903467995868543L);
                                        if (!var4_4) ** GOTO lbl-1000
                                    }
                                    v5 /* !! */  = (CallSite)(up.c(29098, 6631101025112326690L) / up.c(21522, 5752179181841687918L) * up.c(16573, 2149018891720012186L) * up.c(17567, 3690358674055476691L));
                                    v6 /* !! */  = (CallSite)up.c(52, 3203030653509759314L);
                                }
                                var8_5 /* !! */  = v5 /* !! */  ^ v6 /* !! */ ;
                                if (!var4_4) continue block22;
                            }
                            var8_5 /* !! */  = ((up.c(14169, 8061127506504500298L) ^ up.c(19293, 90979048864299206L)) + up.c(4320, 7633808634063216974L)) / up.c(23740, 7778447115784433176L) / up.c(28003, 7146748952301083670L) + up.c(31440, 5889231584307480701L);
                            if (!var4_4) ** GOTO lbl-1000
                        }
                        v7 /* !! */  = (CallSite)((up.c(20838, 2470538683572822215L) ^ up.c(3390, 8794280082298895852L)) * up.c(8419, 6324895882105049111L));
                        v8 = up.c(18818, 5606220648477276814L);
                    }
                    var8_5 /* !! */  = (int)(v7 /* !! */  - v8);
                    if (!var4_4) ** GOTO lbl-1000
                }
                var8_5 /* !! */  = up.c(31276, 1373183781425318384L) + up.c(10327, 8541723281474411268L) + up.c(4845, 7138131919141921379L);
            } while (!var4_4);
            var8_5 /* !! */  = up.c(29098, 6631101025112326690L) / up.c(21522, 5752179181841687918L) * up.c(16573, 2149018891720012186L) * up.c(17567, 3690358674055476691L) ^ up.c(52, 3203030653509759314L);
            if (!var4_4) continue;
lbl151:
            // 2 sources

            var8_5 /* !! */  = up.c(29098, 6631101025112326690L) / up.c(21522, 5752179181841687918L) * up.c(16573, 2149018891720012186L) * up.c(17567, 3690358674055476691L) ^ up.c(52, 3203030653509759314L);
            ** while (true)
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean l(int n, int n2) {
        boolean bl = Dl.t();
        int n3 = up.c(17810, 3349180761236812819L) * up.c(10460, 8579275053010311555L) - up.c(4197, 4115892671494775703L) ^ up.c(23592, 2504784222245694841L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && !bl) break block8;
                        Object object2 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1038710010063338291L);
                        if (bl) break block9;
                        if (object2 == false) break block10;
                        object2 = object = (Object)(up.c(17218, 9180491827209908673L) + up.c(24674, 5143971799477392127L) - up.c(5228, 3673693866864567499L) + up.c(809, 7376567369731797285L));
                    }
                    if (!bl) break block8;
                }
                object = (up.c(24613, 7945502335726195710L) + up.c(17213, 1497486602121621788L)) * up.c(24252, 966926922309184681L) + up.c(15874, 5696756137142734173L) ^ up.c(17700, 8489004298040194795L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case -1227911182: {
                    return false;
                }
                case -1227911181: {
                    up.V("9JSdvelroRuMtddK", t(int int ), (int)n, (int)n2);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)555034192595512565L);
                    return true;
                }
                case -1227911180: 
            }
            break;
        }
        return (boolean)hi.a("G", (int)4, (long)525303406604919947L);
    }

    public static /* bridge */ /* synthetic */ CallSite V(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)28, up.class);
        Hidden0.special_clinit_28_160(up.class);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected void b(Object[] var1_1) {
        block23: {
            block22: {
                var2_2 = Dl.t();
                var4_3 /* !! */  = up.c(20647, 4672784300879061832L) * up.c(6263, 2044110151996238540L) ^ up.c(2506, 2719603726173239452L);
                if (!var2_2) break block22;
lbl5:
                // 2 sources

                while (true) {
                    block25: {
                        block24: {
                            v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)1301392709081523158L);
                            if (var2_2) break block24;
                            if (v0 /* !! */  != false) break block25;
                            v0 /* !! */  = (CallSite)(hi.a("G", (int)(up.c(11811, 8823611841697275283L) - up.c(19627, 2722516913872944157L)), (int)up.c(31494, 6064777173762214101L), (long)834203424483934088L) ^ up.c(5440, 4131837332354786954L));
                        }
                        var4_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block22;
                    }
                    var4_3 /* !! */  = (up.c(9386, 475281789027276007L) + up.c(13290, 7735229716541522629L)) * up.c(24531, 4460376601083227148L) / 2 - up.c(9891, 8498810164394153415L);
                    if (!var2_2) break block22;
                    ** GOTO lbl59
                    break;
                }
lbl17:
                // 2 sources

                while (true) {
                    block27: {
                        block26: {
                            var3_4 = v1;
                            hi.a("\u00f2", (Object)this, (boolean)false, (long)1220030166447599141L);
                            hi.a("\u00f2", (Object)this, (boolean)false, (long)1301392709081523158L);
                            hi.a("\u00f2", (Object)this, (ul)hi.a("j", (long)669539097074851102L), (long)863823602747816557L);
                            hi.a("\u00f2", (Object)this, (boolean)false, (long)934570417537298009L);
                            hi.a("\u00f2", (Object)this, (int)0, (long)540033440955626761L);
                            v2 = var3_4;
                            if (var2_2) break block26;
                            if (v2 != 0) break block27;
                            v2 = var4_3 /* !! */  = up.c(3359, 8165534807467720451L) - up.c(25894, 8218565079604958612L) + up.c(5129, 3077344701842941936L) + up.c(21303, 2710304912504922458L);
                        }
                        if (!var2_2) break block23;
                    }
                    var4_3 /* !! */  = up.c(9195, 6476013550498533559L) / up.c(12325, 5153503090871124677L) - up.c(1627, 8647465516715897993L) - up.c(31396, 7175349592603658316L) + up.c(6219, 878687658087246729L);
                    if (!var2_2) break block23;
                    ** GOTO lbl95
                    break;
                }
            }
            block17: while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1020578854: {
                        v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1265602133107695556L), (Object)hi.a("j", (long)925497335648930051L), (long)511460060498514638L);
                        if (var2_2) ** GOTO lbl60
                        if (v3 /* !! */  == false) ** GOTO lbl59
                        ** GOTO lbl62
                    }
                    case 1020578853: {
                        if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L) == null) ** GOTO lbl64
                        ** GOTO lbl66
                    }
                    case 1020578855: {
                        if (hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L) == null) ** GOTO lbl68
                        ** GOTO lbl70
                    }
                    case 1020578852: {
                        v1 = 1;
                        var4_3 /* !! */  = (up.c(2243, 3543755773187062665L) ^ up.c(5653, 298238919123002720L)) / up.c(21522, 5752179181841687918L) - up.c(23381, 5135098238331103894L) - up.c(8643, 8203428422059151609L) - up.c(9924, 5701889239192360296L);
                        if (!var2_2) ** GOTO lbl73
                        ** GOTO lbl72
                    }
                    case 1020578858: {
                        v1 = 0;
                        if (!var2_2) ** GOTO lbl72
                        ** GOTO lbl17
                    }
lbl59:
                    // 2 sources

                    v3 /* !! */  = (CallSite)(hi.a("G", (int)(up.c(11625, 2304926439194057839L) - up.c(6202, 8662108152366426961L)), (int)up.c(2452, 3295133397767289394L), (long)834203424483934088L) ^ up.c(15907, 8212430610841914766L));
lbl60:
                    // 2 sources

                    var4_3 /* !! */  = (int)v3 /* !! */ ;
                    if (!var2_2) continue block17;
lbl62:
                    // 2 sources

                    var4_3 /* !! */  = up.c(25617, 2904472351492052743L) - up.c(17946, 5518995953378375166L) ^ up.c(11635, 4807972427404828497L);
                    if (!var2_2) continue block17;
lbl64:
                    // 2 sources

                    var4_3 /* !! */  = hi.a("G", (int)(up.c(11625, 2304926439194057839L) - up.c(6202, 8662108152366426961L)), (int)up.c(2452, 3295133397767289394L), (long)834203424483934088L) ^ up.c(15907, 8212430610841914766L);
                    if (!var2_2) continue block17;
lbl66:
                    // 2 sources

                    var4_3 /* !! */  = (up.c(22075, 4322310163518072679L) ^ up.c(30520, 1088316820213499277L) ^ up.c(7706, 3260881366160011028L)) - up.c(18680, 5807926641653791208L) ^ up.c(26272, 973284847117734967L);
                    if (!var2_2) continue block17;
lbl68:
                    // 2 sources

                    var4_3 /* !! */  = hi.a("G", (int)(up.c(11625, 2304926439194057839L) - up.c(6202, 8662108152366426961L)), (int)up.c(2452, 3295133397767289394L), (long)834203424483934088L) ^ up.c(15907, 8212430610841914766L);
                    if (!var2_2) continue block17;
lbl70:
                    // 2 sources

                    var4_3 /* !! */  = (hi.a("G", (int)up.c(22562, 6793315054588046045L), (int)up.c(22158, 8888640599571047916L), (long)834203424483934088L) ^ up.c(6497, 5354408287139097572L)) / up.c(21522, 5752179181841687918L) + up.c(12954, 1536657390532215127L);
                    continue block17;
lbl72:
                    // 2 sources

                    var4_3 /* !! */  = (up.c(13391, 1330048077941720087L) ^ up.c(2896, 432662456027379909L)) / up.c(21522, 5752179181841687918L) - up.c(14321, 2324761678274053741L) - up.c(2076, 4834556915668646524L) - up.c(14783, 5151540692174392155L);
lbl73:
                    // 2 sources

                    switch (var4_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 250947941: 
                    }
                    hi.a("G", (long)437292628650123400L);
                    hi.a("G", (long)946490586356608614L);
                    return;
                    case 1020578856: 
                }
                break;
            }
            return;
        }
        block18: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)496902820059807729L), (Object)new ServerboundContainerClosePacket((int)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1223784520533413643L), (long)836509641775052142L)), (long)367302555785540234L);
                    if (var2_2) {
                        return;
                    }
                    ** GOTO lbl95
                }
                case 2091517269: {
                    throw null;
                }
lbl95:
                // 2 sources

                var4_3 /* !! */  = up.c(11100, 671115437904845453L) - up.c(22534, 3596432232546576650L) + up.c(21349, 8981753745689879481L) + up.c(28124, 6063182413466442952L);
                continue block18;
                case 2091517271: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean H(Object[] var1_1) {
        var2_2 = Dl.t();
        var3_3 /* !! */  = up.c(11588, 2706272264096702128L) / up.c(17870, 9082877568364524908L) * up.c(14984, 334209629934177188L) + up.c(28899, 207876976103522981L);
        if (!var2_2) ** GOTO lbl16
        block9: while (true) {
            block14: {
                block13: {
                    block12: {
                        v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)934570417537298009L);
                        if (var2_2) break block12;
                        if (v0 /* !! */  == false) break block13;
                        v0 /* !! */  = (CallSite)(up.c(20358, 663036758903995456L) * up.c(8066, 5263978784595602634L) + up.c(29777, 2680368926194108184L) ^ up.c(27007, 9036436142185159457L));
                    }
                    var3_3 /* !! */  = (int)v0 /* !! */ ;
                    if (!var2_2) break block14;
                }
                var3_3 /* !! */  = up.c(11178, 8323255518802303036L) * up.c(16191, 1259568393795685556L) - up.c(8346, 7661769107392418129L) - up.c(6139, 8999512442526590335L);
                if (var2_2) ** GOTO lbl36
            }
            block10: while (true) {
                switch (var3_3 /* !! */ ) {
                    default: {
                        continue block9;
                    }
                    case 880846043: {
                        v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)710652402433032063L), (long)((long)hi.a("\u00e9", (Object)this, (long)540033440955626761L)), (long)1224860919547296605L);
                        if (var2_2) ** GOTO lbl37
                        if (v1 /* !! */  == false) ** GOTO lbl36
                        ** GOTO lbl39
                    }
                    case 880846045: {
                        v2 = true;
                        var3_3 /* !! */  = up.c(17070, 7687193177103052829L) + up.c(10899, 4803507068694485712L) ^ up.c(11492, 7539002479609634468L);
                        if (!var2_2) ** GOTO lbl42
                        ** GOTO lbl41
                    }
                    case 880846042: {
                        v2 = false;
                        if (var2_2) {
                            return v2;
                        }
                        ** GOTO lbl41
                    }
lbl36:
                    // 2 sources

                    v1 /* !! */  = (CallSite)(up.c(11599, 7873556558150851839L) * up.c(2818, 2054814582882793596L) + up.c(16452, 4531670093411725750L) ^ up.c(23087, 52622293021862482L));
lbl37:
                    // 2 sources

                    var3_3 /* !! */  = (int)v1 /* !! */ ;
                    if (!var2_2) continue block10;
lbl39:
                    // 2 sources

                    var3_3 /* !! */  = (up.c(9941, 1756687949882087173L) * up.c(20184, 8833471156417740104L) ^ up.c(23245, 3923572935482747440L)) - up.c(1876, 5349727525304268555L);
                    continue block10;
lbl41:
                    // 2 sources

                    var3_3 /* !! */  = up.c(9933, 1984036278467581871L) + up.c(2385, 5876918109433231829L) ^ up.c(7744, 6273815176347151440L);
lbl42:
                    // 2 sources

                    switch (var3_3 /* !! */ ) {
                        case 1363434142: {
                            hi.a("G", (long)802702781471349640L);
                            return v2;
                        }
                    }
                    return v2;
                    case 880846044: 
                }
                break;
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private void Q() {
        block14: {
            block13: {
                block17: {
                    block12: {
                        block16: {
                            block15: {
                                var1_1 = Dl.S();
                                var2_2 = (up.c(17362, 8194759745301229747L) - up.c(9211, 6909066583165096721L)) * up.c(30136, 4981053990731646901L) * up.c(31946, 5714728694695497372L) ^ up.c(30544, 1429809460777387231L);
                                if (var1_1) break block15;
lbl4:
                                // 2 sources

                                while (hi.a("\u00e9", (Object)this, (long)863823602747816557L) != hi.a("j", (long)669539097074851102L)) {
                                    break block12;
                                }
                                break block16;
lbl7:
                                // 1 sources

                                while (hi.a("\u00e9", (Object)this, (long)863823602747816557L) != hi.a("j", (long)557927702321373114L)) {
                                    break block13;
                                }
                                break block17;
lbl10:
                                // 1 sources

                                while (true) {
                                    hi.a("\u00f2", (Object)this, (ul)hi.a("j", (long)669539097074851102L), (long)863823602747816557L);
                                    if (!var1_1) lbl-1000:
                                    // 2 sources

                                    {
                                        return;
                                    }
                                    break block14;
                                    break;
                                }
                            }
lbl17:
                            // 6 sources

                            while (true) {
                                switch (var2_2) {
                                    default: {
                                        ** GOTO lbl4
                                    }
                                    case -420519674: {
                                        ** GOTO lbl7
                                    }
                                    case -420519675: {
                                        ** continue;
                                    }
                                    case -420519672: {
                                        ** continue;
                                    }
                                    case -420519676: 
                                }
                                hi.a("G", (long)614553230640737479L);
                                up.V("9JSdvelroRuMtddK", T());
                                var2_2 = hi.a("G", (int)up.c(1487, 3031746374680147742L), (int)up.c(31314, 8352512882460035373L), (long)834203424483934088L) ^ up.c(8950, 6667333767940231844L);
                                if (var1_1) continue;
                                break;
                            }
                        }
                        var2_2 = up.c(3895, 523043492725816413L) * up.c(22890, 1585538863808817340L) - up.c(22015, 7254309293626140400L);
                        if (var1_1) ** GOTO lbl17
                    }
                    var2_2 = up.c(28739, 9007353934564655346L) + up.c(12603, 5193003028882014268L) + up.c(6138, 8499438166207751626L) - up.c(12129, 4611482071431929478L) + up.c(17049, 5176007508508454968L);
                    if (var1_1) ** GOTO lbl17
                }
                var2_2 = up.c(19179, 7427708064213481532L) * up.c(6338, 2204625300854401963L) - up.c(16714, 7009345761451225544L);
                if (var1_1) ** GOTO lbl17
            }
            var2_2 = up.c(17876, 5727988983975163514L) + up.c(21132, 5304303853640425495L) - up.c(29379, 2540505078769254528L);
            if (var1_1) ** GOTO lbl17
        }
        var2_2 = up.c(19179, 7427708064213481532L) * up.c(6338, 2204625300854401963L) - up.c(16714, 7009345761451225544L);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$4() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = up.V("9JSdvelroRuMtddK", booleanValue(), (Boolean)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1120046356273634799L), (long)789438897355831922L))));
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L), (Object)hi.a("j", (long)911553817953895964L), (long)511460060498514638L);
            }
            if (!bl) return (boolean)object;
            if (object == false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    private up() {
        super(up.b(19189, -20321), (vY)((Object)hi.a("j", (long)526176563220736169L)));
        this.Xl = hi.a("\u00a5", (Object)this, (Object)up.b(19195, 631), (boolean)true, (long)1230617056439551805L);
        this.q = hi.a("\u00a5", (Object)this, (Object)up.b(19181, -17721), (boolean)true, (long)1230617056439551805L);
        this.S = hi.a("\u00a5", (Object)this, (Object)up.b(19144, 21552), (boolean)true, (long)1230617056439551805L);
        this.W = hi.a("\u00a5", (Object)this, (Object)up.b(19191, 4949), (int)up.c(27875, 6902217418996685969L), (int)0, (int)up.c(29009, 7939413358015054714L), (int)up.c(24241, 6843822296087866847L), (long)1094453040828645510L);
        this.d = up.V("9JSdvelroRuMtddK", b(java.lang.String int int int int ), (up)this, (String)up.b(19172, 27474), (int)up.c(30939, 8242946341333535104L), (int)0, (int)up.c(18479, 2824860093123869237L), (int)up.c(28924, 7410171472851894680L));
        this.X = hi.a("\u00a5", (Object)this, (Object)up.b(19183, -18620), (Object)hi.a("j", (long)1225529495814893372L), (long)426795652261052192L);
        this.D = hi.a("\u00a5", (Object)this, (Object)up.b(19198, 11713), (boolean)true, (long)1230617056439551805L);
        this.H = up.V("9JSdvelroRuMtddK", U(java.lang.String boolean ), (up)this, (String)up.b(19199, 13371), (boolean)true);
        String string = up.b(19190, -8942);
        int n = up.c(23740, 7778447115784433176L);
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)479747917202292249L);
        hi.a("G", (Object)callSite, (long)374764797691957710L);
        this.u = hi.a("\u00a5", (Object)this, (Object)string, (int)1, (int)1, (int)n, (int)1, ((Xn)((Object)callSite))::z, (long)958246524790962697L);
        this.K = up.V("9JSdvelroRuMtddK", M(java.lang.String boolean com.github.epsilon.yx ), (up)this, (String)up.b(19182, -18153), (boolean)true, this::lambda$new$0);
        this.C = hi.a("\u00a5", (Object)this, (Object)up.b(19196, -5999), (int)2, (int)1, (int)up.c(23740, 7778447115784433176L), (int)1, this::lambda$new$1, (long)958246524790962697L);
        String string2 = up.b(19194, 1174);
        int n2 = up.c(28928, 741714160489791961L);
        int n3 = up.c(19214, 8750173246392581021L);
        int n4 = up.c(22146, 2660962799301207080L);
        int n5 = up.c(10316, 7711957550934350035L);
        CallSite callSite2 = hi.a("\u00e9", (Object)this, (long)560105990748116069L);
        up.V("9JSdvelroRuMtddK", requireNonNull(T ), (Object)callSite2);
        this.XW = up.V("9JSdvelroRuMtddK", m(java.lang.String int int int int com.github.epsilon.yx ), (up)this, (String)string2, (int)n2, (int)n3, (int)n4, (int)n5, ((Xn)((Object)callSite2))::z);
        this.T = hi.a("\u00a5", (Object)this, (Object)up.b(19146, -14293), (boolean)true, (long)1230617056439551805L);
        String string3 = up.b(19149, -2325);
        int n6 = up.c(23740, 7778447115784433176L);
        CallSite callSite3 = hi.a("\u00e9", (Object)this, (long)1290112090572498616L);
        hi.a("G", (Object)callSite3, (long)374764797691957710L);
        this.v = hi.a("\u00a5", (Object)this, (Object)string3, (int)3, (int)1, (int)n6, (int)1, ((Xn)((Object)callSite3))::z, (long)958246524790962697L);
        this.O = hi.a("\u00a5", (Object)this, (Object)up.b(19150, -32494), (boolean)true, (long)1230617056439551805L);
        String string4 = up.b(19147, -2887);
        int n7 = up.c(23740, 7778447115784433176L);
        CallSite callSite4 = hi.a("\u00e9", (Object)this, (long)966505572361037337L);
        hi.a("G", (Object)callSite4, (long)374764797691957710L);
        this.z = hi.a("\u00a5", (Object)this, (Object)string4, (int)4, (int)1, (int)n7, (int)1, ((Xn)((Object)callSite4))::z, (long)958246524790962697L);
        this.n = hi.a("\u00a5", (Object)this, (Object)up.b(19169, 1088), (boolean)true, (long)1230617056439551805L);
        String string5 = up.b(19175, -24907);
        int n8 = up.c(23740, 7778447115784433176L);
        CallSite callSite5 = hi.a("\u00e9", (Object)this, (long)428211704653022032L);
        hi.a("G", (Object)callSite5, (long)374764797691957710L);
        this.X7 = hi.a("\u00a5", (Object)this, (Object)string5, (int)5, (int)1, (int)n8, (int)1, ((Xn)((Object)callSite5))::z, (long)958246524790962697L);
        String string6 = up.b(19151, 31377);
        CallSite callSite6 = hi.a("j", (long)1000392985961835910L);
        CallSite callSite7 = hi.a("\u00e9", (Object)this, (long)428211704653022032L);
        hi.a("G", (Object)callSite7, (long)374764797691957710L);
        this.h = hi.a("\u00a5", (Object)this, (Object)string6, (Object)callSite6, ((Xn)((Object)callSite7))::z, (long)665992405927011769L);
        String string7 = up.b(19178, 31949);
        int n9 = up.c(13645, 6230611106716763861L);
        int n10 = up.c(10316, 7711957550934350035L);
        int n11 = up.c(8584, 6591552860671102977L);
        int n12 = up.c(10316, 7711957550934350035L);
        CallSite callSite8 = hi.a("\u00e9", (Object)this, (long)428211704653022032L);
        hi.a("G", (Object)callSite8, (long)374764797691957710L);
        this.Q = hi.a("\u00a5", (Object)this, (Object)string7, (int)n9, (int)n10, (int)n11, (int)n12, ((Xn)((Object)callSite8))::z, (long)958246524790962697L);
        this.c = hi.a("\u00a5", (Object)this, (Object)up.b(19171, -8461), (boolean)true, (long)1230617056439551805L);
        String string8 = up.b(19180, -8175);
        int n13 = up.c(19555, 6416917978405911779L);
        int n14 = up.c(23740, 7778447115784433176L);
        CallSite callSite9 = hi.a("\u00e9", (Object)this, (long)1301124548289237811L);
        hi.a("G", (Object)callSite9, (long)374764797691957710L);
        this.M = hi.a("\u00a5", (Object)this, (Object)string8, (int)n13, (int)1, (int)n14, (int)1, ((Xn)((Object)callSite9))::z, (long)958246524790962697L);
        this.P = hi.a("\u00a5", (Object)this, (Object)up.b(19173, -31628), (boolean)true, (long)1230617056439551805L);
        String string9 = up.b(19168, 30533);
        int n15 = up.c(28003, 7146748952301083670L);
        int n16 = up.c(23740, 7778447115784433176L);
        CallSite callSite10 = hi.a("\u00e9", (Object)this, (long)972797796334884924L);
        up.V("9JSdvelroRuMtddK", requireNonNull(T ), (Object)callSite10);
        this.t = hi.a("\u00a5", (Object)this, (Object)string9, (int)n15, (int)1, (int)n16, (int)1, ((Xn)((Object)callSite10))::z, (long)958246524790962697L);
        this.F = up.V("9JSdvelroRuMtddK", U(java.lang.String boolean ), (up)this, (String)up.b(19148, 30047), (boolean)true);
        String string10 = up.b(19174, -11462);
        int n17 = up.c(20263, 1297044987970633448L);
        int n18 = up.c(23740, 7778447115784433176L);
        CallSite callSite11 = hi.a("\u00e9", (Object)this, (long)459675594877420376L);
        hi.a("G", (Object)callSite11, (long)374764797691957710L);
        this.x = hi.a("\u00a5", (Object)this, (Object)string10, (int)n17, (int)1, (int)n18, (int)1, ((Xn)((Object)callSite11))::z, (long)958246524790962697L);
        this.XR = hi.a("\u00a5", (Object)this, (Object)up.b(19192, 31945), (boolean)true, this::lambda$new$2, (long)1197648209052129808L);
        this.Xn = hi.a("\u00a5", (Object)this, (Object)up.b(19185, -13893), (int)up.c(23740, 7778447115784433176L), (int)1, (int)up.c(23740, 7778447115784433176L), (int)1, this::lambda$new$3, (long)958246524790962697L);
        this.Xg = hi.a("\u00a5", (Object)this, (Object)up.b(19179, 24913), (boolean)true, (long)1230617056439551805L);
        String string11 = up.b(19145, 4026);
        CallSite callSite12 = hi.a("\u00e9", (Object)this, (long)772912008841765375L);
        hi.a("G", (Object)callSite12, (long)374764797691957710L);
        this.E = hi.a("\u00a5", (Object)this, (Object)string11, (int)1, (int)0, (int)5, (int)1, ((Xn)((Object)callSite12))::z, (long)958246524790962697L);
        String string12 = up.b(19188, 28855);
        CallSite callSite13 = hi.a("\u00e9", (Object)this, (long)772912008841765375L);
        up.V("9JSdvelroRuMtddK", requireNonNull(T ), (Object)callSite13);
        this.w = hi.a("\u00a5", (Object)this, (Object)string12, (int)1, (int)0, (int)5, (int)1, ((Xn)((Object)callSite13))::z, (long)958246524790962697L);
        this.V = hi.a("\u00a5", (Object)this, (Object)up.b(19187, 12904), (boolean)true, (long)1230617056439551805L);
        this.a = hi.a("\u00a5", (Object)this, (Object)up.b(19193, -20641), (boolean)false, this::lambda$new$4, (long)1197648209052129808L);
        this.l = hi.a("\u00a5", (Object)this, (Object)up.b(19170, 5317), (int)up.c(23740, 7778447115784433176L), (int)1, (int)up.c(23740, 7778447115784433176L), (int)1, this::lambda$new$5, (long)958246524790962697L);
        String string13 = up.b(19177, -27222);
        int n19 = up.c(10316, 7711957550934350035L);
        int n20 = up.c(8826, 7353724606566420550L);
        int n21 = up.c(13645, 6230611106716763861L);
        int n22 = up.c(8826, 7353724606566420550L);
        CallSite callSite14 = hi.a("\u00e9", (Object)this, (long)1120046356273634799L);
        hi.a("G", (Object)callSite14, (long)374764797691957710L);
        this.B = up.V("9JSdvelroRuMtddK", m(java.lang.String int int int int com.github.epsilon.yx ), (up)this, (String)string13, (int)n19, (int)n20, (int)n21, (int)n22, ((Xn)((Object)callSite14))::z);
        this.m = up.V("9JSdvelroRuMtddK", M(java.lang.String boolean com.github.epsilon.yx ), (up)this, (String)up.b(19197, -29159), (boolean)false, this::lambda$new$6);
        this.y = hi.a("\u00a5", (Object)this, (Object)up.b(19186, 18082), (int)up.c(23740, 7778447115784433176L), (int)1, (int)up.c(23740, 7778447115784433176L), (int)1, this::lambda$new$7, (long)958246524790962697L);
        hi.a("\u00f2", (Object)this, (int)0, (long)1044430345872965744L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1220030166447599141L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1301392709081523158L);
        hi.a("\u00f2", (Object)this, (ul)((Object)hi.a("j", (long)669539097074851102L)), (long)863823602747816557L);
        this.b = new _Z();
    }

    /*
     * Exception decompiling
     */
    @yE
    private void q(_y var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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
    private boolean lambda$new$1() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)560105990748116069L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = up.V("9JSdvelroRuMtddK", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L)), (Enum)((Object)hi.a("j", (long)564288606335379272L)));
            }
            if (!bl) return (boolean)object;
            if (object == false) {
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
    private void g(Object[] var1_1) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        var2_2 = Dl.S();
                        var3_3 /* !! */  = hi.a("G", (int)up.c(29310, 2986134607692399290L), (int)up.c(1326, 4020587434279532261L), (long)834203424483934088L) - up.c(14144, 8797506402198931134L) + up.c(28623, 2053268693547130743L);
                        if (!var2_2) ** GOTO lbl-1000
                        switch (var3_3 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)710652402433032063L), (long)779279608538024261L);
                                hi.a("\u00f2", (Object)this, (int)hi.a("G", (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1154369137446364194L), (long)789438897355831922L)), (long)1260538186742955956L), (int)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1015559347108412289L), (long)789438897355831922L)), (long)1260538186742955956L), (long)656208795491924261L), (long)540033440955626761L);
                                hi.a("\u00f2", (Object)this, (boolean)true, (long)1301392709081523158L);
                                hi.a("\u00f2", (Object)this, (boolean)true, (long)934570417537298009L);
                                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1265602133107695556L), (Object)hi.a("j", (long)925497335648930051L), (long)511460060498514638L);
                                if (!var2_2) break block15;
                                if (v0 /* !! */  == false) break;
                                break block16;
                            }
                            case -1557909160: {
                                hi.a("G", (long)1064615117133635571L);
                                hi.a("G", (long)1134434820933353061L);
                                return;
                            }
                        }
                        v0 /* !! */  = var3_3 /* !! */  = (CallSite)(up.c(23735, 1733834813241994329L) * up.c(32238, 2564832559336165221L) + up.c(12906, 1134480066814329821L));
                    }
                    if (var2_2) break block17;
                }
                var3_3 /* !! */  = (CallSite)(up.c(20640, 3731856443158405843L) + up.c(22907, 158122020452248537L) + up.c(23881, 571667569426771162L) + up.c(1153, 1928959879856617182L));
            }
            switch (var3_3 /* !! */ ) {
                default: {
                    v1 = hi.a("j", (long)557927702321373114L);
                    var3_3 /* !! */  = (CallSite)(hi.a("G", (int)(up.c(29785, 8360673607495747335L) - up.c(32358, 6991731604285754693L)), (int)up.c(8237, 185449633128665210L), (long)834203424483934088L) + up.c(25807, 8420254003493672307L) - up.c(9214, 355121546768961561L) ^ up.c(4865, 9060439576652669832L));
                    if (!var2_2) {
                        break;
                    }
                    break block18;
                }
                case -902000337: {
                    v1 = hi.a("j", (long)669539097074851102L);
                    if (var2_2) break;
                    ** GOTO lbl-1000
                }
                case -902000336: {
                    throw null;
                }
            }
            var3_3 /* !! */  = (CallSite)(hi.a("G", (int)(up.c(24628, 3623510837310296345L) - up.c(2622, 2296725589522676001L)), (int)up.c(28805, 8859629345040564262L), (long)834203424483934088L) + up.c(5830, 5473235207163504010L) - up.c(10115, 3456955472244397305L) ^ up.c(27164, 164153572177353141L));
        }
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                hi.a("\u00f2", (Object)this, (ul)v1, (long)863823602747816557L);
                return;
            }
            case 1679591629: 
        }
        hi.a("G", (long)1325413874281312291L);
        hi.a("G", (long)692983194225517364L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean l(Object[] var1_1) {
        block33: {
            block31: {
                block32: {
                    block30: {
                        block28: {
                            block29: {
                                block27: {
                                    block36: {
                                        block26: {
                                            block35: {
                                                block25: {
                                                    block23: {
                                                        block24: {
                                                            block34: {
                                                                var2_2 = Dl.t();
                                                                var3_3 /* !! */  = up.c(14154, 6141443831567042214L) - up.c(4440, 829667154155758387L) - up.c(28668, 5229319374666603710L);
                                                                if (!var2_2) break block34;
lbl5:
                                                                // 2 sources

                                                                while (true) {
                                                                    v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1265602133107695556L), (Object)hi.a("j", (long)925497335648930051L), (long)511460060498514638L);
                                                                    if (var2_2) break block23;
                                                                    if (v0 != false) break block24;
                                                                    break block25;
                                                                    break;
                                                                }
lbl10:
                                                                // 1 sources

                                                                return true;
lbl12:
                                                                // 1 sources

                                                                while (hi.a("\u00e9", (Object)this, (long)863823602747816557L) == hi.a("j", (long)1282602281907129836L)) {
                                                                    break block26;
                                                                }
                                                                break block35;
lbl15:
                                                                // 1 sources

                                                                return false;
lbl17:
                                                                // 1 sources

                                                                while (hi.a("\u00e9", (Object)this, (long)863823602747816557L) == hi.a("j", (long)472748872333798469L)) {
                                                                    break block27;
                                                                }
                                                                break block36;
lbl20:
                                                                // 1 sources

                                                                return true;
lbl22:
                                                                // 1 sources

                                                                while (true) {
                                                                    v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1292720448713888713L);
                                                                    if (var2_2) break block28;
                                                                    if (v1 != false) break block29;
                                                                    break block30;
                                                                    break;
                                                                }
lbl27:
                                                                // 1 sources

                                                                while (true) {
                                                                    v2 /* !! */  = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)693341624391332494L);
                                                                    if (var2_2) break block31;
                                                                    if (v2 /* !! */  == false) break block32;
                                                                    break block33;
                                                                    break;
                                                                }
lbl32:
                                                                // 1 sources

                                                                while (true) {
                                                                    hi.a("\u00f2", (Object)this, (ul)hi.a("j", (long)1282602281907129836L), (long)863823602747816557L);
                                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (boolean)false, (long)453484615985537282L);
                                                                    return false;
                                                                }
lbl36:
                                                                // 1 sources

                                                                return true;
                                                            }
lbl39:
                                                            // 11 sources

                                                            while (true) {
                                                                switch (var3_3 /* !! */ ) {
                                                                    default: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837210: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837207: {
                                                                        ** GOTO lbl12
                                                                    }
                                                                    case 324837214: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837213: {
                                                                        ** GOTO lbl17
                                                                    }
                                                                    case 324837211: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837216: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837212: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837206: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837208: {
                                                                        ** continue;
                                                                    }
                                                                    case 324837215: 
                                                                }
                                                                hi.a("G", (double)100.0, (long)514485682373957547L);
                                                                return false;
                                                            }
                                                        }
                                                        v0 = up.V("9JSdvelroRuMtddK", max(int int ), (int)up.c(17378, 9087281896186294605L), (int)up.c(9825, 612630601069253722L)) - up.c(6419, 3023918461612518154L);
                                                    }
                                                    var3_3 /* !! */  = (int)v0;
                                                    if (!var2_2) ** GOTO lbl39
                                                }
                                                var3_3 /* !! */  = (int)(up.V("9JSdvelroRuMtddK", max(int int ), (int)(up.c(13285, 4212426228165755048L) * up.c(17558, 977304358248855169L) / 4 ^ up.c(27801, 1936376357776367040L)), (int)up.c(24829, 2211447093044580699L)) + up.c(6578, 5462271054256499170L));
                                                if (!var2_2) ** GOTO lbl39
                                            }
                                            var3_3 /* !! */  = (up.c(30006, 1763432989666904019L) - up.c(19106, 7985355978372201243L)) * up.c(9746, 616455443930896169L) / 2 - up.c(4860, 3292047905552458506L);
                                            if (!var2_2) ** GOTO lbl39
                                        }
                                        var3_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)hi.a("G", (int)up.c(27377, 6600109944132933987L), (int)up.c(2941, 8786848347847260501L), (long)834203424483934088L), (int)up.c(5304, 2766686832744097100L), (long)834203424483934088L), (int)up.c(28260, 186900555392753081L), (long)834203424483934088L) - up.c(13691, 7105113784382997813L));
                                        if (!var2_2) ** GOTO lbl39
                                    }
                                    var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)up.c(11275, 6675216365769743514L), (int)up.c(4082, 1871132885034073770L), (long)834203424483934088L) + up.c(12468, 2746096882203804135L)), (int)up.c(7133, 3106259167146371562L), (long)834203424483934088L) + up.c(29480, 4838427806933483630L) - up.c(4534, 4692217488896353028L));
                                    if (!var2_2) ** GOTO lbl39
                                }
                                var3_3 /* !! */  = up.c(28549, 453224306283388880L) - up.c(31860, 8586840426252242195L) - up.c(7070, 6642416882936375570L);
                                if (!var2_2) ** GOTO lbl39
                            }
                            v1 = hi.a("G", (int)(hi.a("G", (int)up.c(29173, 840919401943793976L), (int)up.c(13131, 4226923945358770487L), (long)834203424483934088L) ^ up.c(10797, 4042203559367268425L)), (int)up.c(22350, 5517678430941947239L), (long)834203424483934088L) + up.c(469, 7728631669932290620L);
                        }
                        var3_3 /* !! */  = (int)v1;
                        if (!var2_2) ** GOTO lbl39
                    }
                    var3_3 /* !! */  = up.c(3303, 4279642207848332302L) / up.c(30142, 5595383829143193276L) ^ up.c(30816, 4656451421506243141L);
                    if (!var2_2) ** GOTO lbl39
                }
                v2 /* !! */  = (CallSite)((up.c(16013, 4045070489863998845L) - up.c(14367, 7636829854685939969L)) * up.c(31245, 5651863899062176218L) * up.c(947, 7254843861435641958L) + up.c(16530, 6176765323913900130L) - up.c(3293, 2928673647931194416L));
            }
            var3_3 /* !! */  = (int)v2 /* !! */ ;
            if (!var2_2) ** GOTO lbl39
        }
        var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)up.c(9385, 6929182638464751399L), (int)up.c(1630, 8470896233918953194L), (long)834203424483934088L) ^ up.c(12879, 3976760047047229979L)), (int)up.c(31746, 8861660182384316052L), (long)834203424483934088L) + up.c(3657, 8569164316958195331L));
        ** while (true)
    }

    private boolean lambda$new$6() {
        boolean bl = Dl.S();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L), (Object)hi.a("j", (long)1031859173964222050L), (long)511460060498514638L);
        if (bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
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
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)895297552108632110L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = up.V("9JSdvelroRuMtddK", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)383432960314970915L)), (Enum)((Object)hi.a("j", (long)1302083182012203900L)));
            }
            if (!bl) return (boolean)object;
            if (object == false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE(P=200)
    private void e(_y var1_1) {
        block22: {
            block21: {
                block19: {
                    block20: {
                        block18: {
                            block24: {
                                block17: {
                                    block15: {
                                        block16: {
                                            block23: {
                                                var2_2 = Dl.S();
                                                var3_3 /* !! */  = up.c(21432, 7076504877085532201L) - up.c(211, 4900167294816285321L) ^ up.c(2495, 7987568966606814000L);
                                                if (var2_2) break block23;
lbl4:
                                                // 2 sources

                                                while (true) {
                                                    v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                                    if (!var2_2) break block15;
                                                    if (v0 /* !! */  != false) break block16;
                                                    break block17;
                                                    break;
                                                }
lbl9:
                                                // 1 sources

                                                while (hi.a("\u00e9", (Object)this, (long)863823602747816557L) == hi.a("j", (long)1282602281907129836L)) {
                                                    break block18;
                                                }
                                                break block24;
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (boolean)false, (long)453484615985537282L);
                                                    v1 /* !! */  = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)693341624391332494L);
                                                    if (!var2_2) break block19;
                                                    if (v1 /* !! */  != false) break block20;
                                                    break block21;
                                                    break;
                                                }
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    hi.a("\u00f2", (Object)this, (ul)hi.a("j", (long)472748872333798469L), (long)863823602747816557L);
                                                    if (!var2_2) {
lbl22:
                                                        // 2 sources

                                                        while (true) {
                                                            hi.a("G", (Object)new Object[]{Float.valueOf(0.0f)}, (long)842688358493305377L);
lbl25:
                                                            // 2 sources

                                                            return;
                                                        }
                                                    }
                                                    break block22;
                                                    break;
                                                }
                                            }
lbl29:
                                            // 8 sources

                                            while (true) {
                                                switch (var3_3 /* !! */ ) {
                                                    default: {
                                                        ** continue;
                                                    }
                                                    case 1621075291: {
                                                        ** GOTO lbl9
                                                    }
                                                    case 1621075289: {
                                                        ** continue;
                                                    }
                                                    case 1621075286: {
                                                        ** continue;
                                                    }
                                                    case 1621075290: {
                                                        ** continue;
                                                    }
                                                    ** case 1621075288:
lbl42:
                                                    // 1 sources

                                                    ** continue;
                                                }
                                                break;
                                            }
                                        }
                                        v0 /* !! */  = (CallSite)((up.c(17108, 7123542334331007223L) ^ up.c(4678, 3362615612470125438L)) + up.c(18972, 3853051103008177008L));
                                    }
                                    var3_3 /* !! */  = (int)v0 /* !! */ ;
                                    if (var2_2) ** GOTO lbl29
                                }
                                var3_3 /* !! */  = up.c(183, 7341796453673661258L) / up.c(12650, 5843564102462030482L) ^ up.c(29859, 6786741111325689222L);
                                if (var2_2) ** GOTO lbl29
                            }
                            var3_3 /* !! */  = (up.c(5897, 8148793059406374122L) ^ up.c(10276, 4405100815581043584L)) + up.c(525, 7212823176651469224L);
                            if (var2_2) ** GOTO lbl29
                        }
                        var3_3 /* !! */  = (up.V("9JSdvelroRuMtddK", max(int int ), (int)(up.c(7492, 5345133898859376250L) * up.c(2650, 5695245712332421245L)), (int)up.c(30170, 7930341332071449692L)) ^ up.c(25481, 3362138612456526790L)) - up.c(327, 170644694357177150L) - up.c(12456, 5040441488180068839L);
                        if (var2_2) ** GOTO lbl29
                    }
                    v1 /* !! */  = (CallSite)((up.c(5897, 8148793059406374122L) ^ up.c(10276, 4405100815581043584L)) + up.c(525, 7212823176651469224L));
                }
                var3_3 /* !! */  = (int)v1 /* !! */ ;
                if (var2_2) ** GOTO lbl29
            }
            var3_3 /* !! */  = (up.c(20995, 5794483780190937305L) + up.c(7225, 4275401506132913580L) + up.c(2747, 4612685740095699141L)) * up.c(25039, 1196330072712745777L) ^ up.c(27692, 1754511620425424007L);
            if (var2_2) ** GOTO lbl29
        }
        var3_3 /* !! */  = (up.c(5897, 8148793059406374122L) ^ up.c(10276, 4405100815581043584L)) + up.c(525, 7212823176651469224L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean T(Object[] var1_1) {
        block14: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var5_4 /* !! */  = up.c(7983, 473216427671252331L) / up.c(4569, 3261696958212989870L) - up.c(14856, 2078840465292577660L);
            if (var3_3) ** GOTO lbl17
            block11: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 /* !! */  = hi.a("G", (Object)((ItemStack)var2_2), (long)865432144196367974L);
                            if (!var3_3) break block15;
                            if (v0 /* !! */  != false) break block16;
                            v0 /* !! */  = (CallSite)(up.c(26472, 7447259361359074763L) / up.c(11499, 8560006226523742001L) - up.c(5762, 8604720960592045920L));
                        }
                        var5_4 /* !! */  = (int)v0 /* !! */ ;
                        if (var3_3) break block17;
                    }
                    var5_4 /* !! */  = up.c(14921, 6962967459651209386L) / 2 + up.c(15274, 4614128030974068787L);
                    if (!var3_3) ** GOTO lbl36
                }
                block12: while (true) {
                    switch (var5_4 /* !! */ ) {
                        default: {
                            continue block11;
                        }
                        case -1658419252: {
                            v1 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1185054242439577997L);
                            if (!var3_3) ** GOTO lbl37
                            if (v1 /* !! */  == false) ** GOTO lbl36
                            ** GOTO lbl39
                        }
                        case -1658419254: {
                            v2 /* !! */  = var4_5 = hi.a("G", (Object)new Object[]{(ItemStack)var2_2}, (long)412971908298639953L);
                            v3 = -1;
                            if (!var3_3) ** GOTO lbl43
                            if (v2 /* !! */  == v3) ** GOTO lbl41
                            ** GOTO lbl46
                        }
                        case -1658419251: {
                            throw null;
                        }
lbl36:
                        // 2 sources

                        v1 /* !! */  = (CallSite)(up.c(16629, 4757826203030303399L) / up.c(11499, 8560006226523742001L) - up.c(11141, 1636353644940286184L));
lbl37:
                        // 2 sources

                        var5_4 /* !! */  = (int)v1 /* !! */ ;
                        if (var3_3) continue block12;
lbl39:
                        // 2 sources

                        var5_4 /* !! */  = up.c(25703, 113735842850903418L) / up.c(23553, 4847473482260164521L) - up.c(10056, 3059245413152904964L) - up.c(31605, 8026911198501472910L);
                        continue block12;
lbl41:
                        // 1 sources

                        v2 /* !! */  = (CallSite)(up.c(16629, 4757826203030303399L) / up.c(11499, 8560006226523742001L));
                        v3 = up.c(11141, 1636353644940286184L);
lbl43:
                        // 2 sources

                        var5_4 /* !! */  = (int)(v2 /* !! */  - v3);
                        if (!var3_3) ** break;
                        continue block12;
lbl46:
                        // 2 sources

                        var5_4 /* !! */  = (up.c(24764, 5027019997011677937L) / up.c(23740, 7778447115784433176L) - up.c(15450, 5291877504745852476L) + up.c(19748, 9120858833216880610L)) * up.c(14137, 2177172409808864753L) + up.c(16699, 1560422004279161806L);
                        if (var3_3) break block14;
                        ** GOTO lbl64
                        case -1658419253: 
                    }
                    break;
                }
                break;
            }
            return false;
        }
        block13: while (true) {
            switch (var5_4 /* !! */ ) {
                default: {
                    v4 /* !! */  = var4_5;
                    v5 = up.c(23740, 7778447115784433176L);
                    if (!var3_3) ** GOTO lbl66
                    if (v4 /* !! */  >= v5) ** GOTO lbl64
                    ** GOTO lbl68
                }
                case 702393909: {
                    hi.a("G", (float)100.0f, (long)945348514596968233L);
                    return false;
                }
lbl64:
                // 2 sources

                v4 /* !! */  = (CallSite)(up.c(6512, 7610583091597961322L) ^ up.c(962, 8123061827969282821L));
                v5 = up.c(23301, 9116119913663966088L);
lbl66:
                // 2 sources

                var5_4 /* !! */  = (int)(v4 /* !! */  + v5);
                if (var3_3) continue block13;
lbl68:
                // 2 sources

                var5_4 /* !! */  = (hi.a("G", (int)up.c(25721, 5426063507714151749L), (int)up.c(11194, 9182580015845661644L), (long)834203424483934088L) ^ up.c(11491, 9130197223400463927L)) + up.c(20642, 7549077735291954053L);
                continue block13;
                case 702393912: {
                    return (boolean)up.V("9JSdvelroRuMtddK", l(int ), (up)this, (int)(var4_5 + up.c(5449, 4795181062324807050L)));
                }
                case 702393910: 
            }
            break;
        }
        return (boolean)hi.a("\u00a5", (Object)this, (int)var4_5, (long)1073526005736789445L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x4AEE) & 0xFFFF;
        if (db[n3] == null) {
            int n4;
            char[] cArray = cb[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 172;
                case 1 -> 78;
                case 2 -> 39;
                case 3 -> 174;
                case 4 -> 202;
                case 5 -> 135;
                case 6 -> 249;
                case 7 -> 54;
                case 8 -> 171;
                case 9 -> 65;
                case 10 -> 84;
                case 11 -> 155;
                case 12 -> 103;
                case 13 -> 110;
                case 14 -> 163;
                case 15 -> 104;
                case 16 -> 114;
                case 17 -> 180;
                case 18 -> 100;
                case 19 -> 152;
                case 20 -> 87;
                case 21 -> 4;
                case 22 -> 98;
                case 23 -> 117;
                case 24 -> 181;
                case 25 -> 67;
                case 26 -> 46;
                case 27 -> 122;
                case 28 -> 201;
                case 29 -> 97;
                case 30 -> 175;
                case 31 -> 225;
                case 32 -> 9;
                case 33 -> 121;
                case 34 -> 240;
                case 35 -> 49;
                case 36 -> 82;
                case 37 -> 42;
                case 38 -> 1;
                case 39 -> 167;
                case 40 -> 205;
                case 41 -> 179;
                case 42 -> 106;
                case 43 -> 53;
                case 44 -> 92;
                case 45 -> 254;
                case 46 -> 48;
                case 47 -> 213;
                case 48 -> 130;
                case 49 -> 219;
                case 50 -> 203;
                case 51 -> 223;
                case 52 -> 178;
                case 53 -> 232;
                case 54 -> 227;
                case 55 -> 124;
                case 56 -> 35;
                case 57 -> 105;
                case 58 -> 88;
                case 59 -> 199;
                case 60 -> 21;
                case 61 -> 132;
                case 62 -> 194;
                case 63 -> 176;
                case 64 -> 131;
                case 65 -> 169;
                case 66 -> 189;
                case 67 -> 224;
                case 68 -> 58;
                case 69 -> 2;
                case 70 -> 186;
                case 71 -> 17;
                case 72 -> 68;
                case 73 -> 218;
                case 74 -> 18;
                case 75 -> 23;
                case 76 -> 90;
                case 77 -> 239;
                case 78 -> 164;
                case 79 -> 28;
                case 80 -> 133;
                case 81 -> 29;
                case 82 -> 123;
                case 83 -> 22;
                case 84 -> 148;
                case 85 -> 188;
                case 86 -> 134;
                case 87 -> 137;
                case 88 -> 94;
                case 89 -> 108;
                case 90 -> 70;
                case 91 -> 96;
                case 92 -> 0;
                case 93 -> 109;
                case 94 -> 187;
                case 95 -> 43;
                case 96 -> 200;
                case 97 -> 206;
                case 98 -> 51;
                case 99 -> 244;
                case 100 -> 184;
                case 101 -> 75;
                case 102 -> 36;
                case 103 -> 57;
                case 104 -> 76;
                case 105 -> 118;
                case 106 -> 83;
                case 107 -> 127;
                case 108 -> 19;
                case 109 -> 33;
                case 110 -> 146;
                case 111 -> 255;
                case 112 -> 16;
                case 113 -> 231;
                case 114 -> 55;
                case 115 -> 101;
                case 116 -> 60;
                case 117 -> 215;
                case 118 -> 185;
                case 119 -> 245;
                case 120 -> 69;
                case 121 -> 195;
                case 122 -> 74;
                case 123 -> 235;
                case 124 -> 230;
                case 125 -> 216;
                case 126 -> 222;
                case 127 -> 196;
                case 128 -> 238;
                case 129 -> 27;
                case 130 -> 234;
                case 131 -> 115;
                case 132 -> 204;
                case 133 -> 26;
                case 134 -> 251;
                case 135 -> 247;
                case 136 -> 207;
                case 137 -> 7;
                case 138 -> 141;
                case 139 -> 192;
                case 140 -> 71;
                case 141 -> 143;
                case 142 -> 3;
                case 143 -> 14;
                case 144 -> 191;
                case 145 -> 80;
                case 146 -> 86;
                case 147 -> 144;
                case 148 -> 81;
                case 149 -> 153;
                case 150 -> 52;
                case 151 -> 32;
                case 152 -> 25;
                case 153 -> 139;
                case 154 -> 161;
                case 155 -> 41;
                case 156 -> 13;
                case 157 -> 166;
                case 158 -> 40;
                case 159 -> 119;
                case 160 -> 116;
                case 161 -> 221;
                case 162 -> 102;
                case 163 -> 72;
                case 164 -> 126;
                case 165 -> 197;
                case 166 -> 85;
                case 167 -> 145;
                case 168 -> 217;
                case 169 -> 242;
                case 170 -> 241;
                case 171 -> 10;
                case 172 -> 229;
                case 173 -> 64;
                case 174 -> 158;
                case 175 -> 214;
                case 176 -> 138;
                case 177 -> 209;
                case 178 -> 233;
                case 179 -> 212;
                case 180 -> 168;
                case 181 -> 228;
                case 182 -> 193;
                case 183 -> 73;
                case 184 -> 210;
                case 185 -> 31;
                case 186 -> 250;
                case 187 -> 8;
                case 188 -> 236;
                case 189 -> 170;
                case 190 -> 12;
                case 191 -> 140;
                case 192 -> 246;
                case 193 -> 226;
                case 194 -> 165;
                case 195 -> 11;
                case 196 -> 150;
                case 197 -> 252;
                case 198 -> 173;
                case 199 -> 107;
                case 200 -> 56;
                case 201 -> 190;
                case 202 -> 15;
                case 203 -> 24;
                case 204 -> 99;
                case 205 -> 44;
                case 206 -> 112;
                case 207 -> 220;
                case 208 -> 59;
                case 209 -> 182;
                case 210 -> 142;
                case 211 -> 47;
                case 212 -> 63;
                case 213 -> 198;
                case 214 -> 154;
                case 215 -> 183;
                case 216 -> 156;
                case 217 -> 91;
                case 218 -> 208;
                case 219 -> 160;
                case 220 -> 177;
                case 221 -> 66;
                case 222 -> 125;
                case 223 -> 147;
                case 224 -> 5;
                case 225 -> 93;
                case 226 -> 20;
                case 227 -> 37;
                case 228 -> 111;
                case 229 -> 237;
                case 230 -> 159;
                case 231 -> 30;
                case 232 -> 149;
                case 233 -> 38;
                case 234 -> 248;
                case 235 -> 243;
                case 236 -> 157;
                case 237 -> 50;
                case 238 -> 89;
                case 239 -> 61;
                case 240 -> 6;
                case 241 -> 129;
                case 242 -> 151;
                case 243 -> 162;
                case 244 -> 211;
                case 245 -> 113;
                case 246 -> 128;
                case 247 -> 79;
                case 248 -> 253;
                case 249 -> 136;
                case 250 -> 34;
                case 251 -> 95;
                case 252 -> 120;
                case 253 -> 62;
                case 254 -> 45;
                default -> 77;
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
            up.db[n3] = new String(cArray).intern();
        }
        return db[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x73D5;
        if (jb[n2] == null) {
            up.jb[n2] = (int)(eb[n2] ^ l);
        }
        return jb[n2];
    }
}
