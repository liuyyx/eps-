/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.Holder
 *  net.minecraft.core.NonNullList
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.ai.attributes.AttributeModifier
 *  net.minecraft.world.entity.player.Inventory
 *  net.minecraft.world.item.ArrowItem
 *  net.minecraft.world.item.AxeItem
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.BowItem
 *  net.minecraft.world.item.CrossbowItem
 *  net.minecraft.world.item.ExperienceBottleItem
 *  net.minecraft.world.item.FireworkRocketItem
 *  net.minecraft.world.item.FishingRodItem
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.KnowledgeBookItem
 *  net.minecraft.world.item.PlayerHeadItem
 *  net.minecraft.world.item.ShovelItem
 *  net.minecraft.world.item.StandingAndWallBlockItem
 *  net.minecraft.world.item.WritableBookItem
 *  net.minecraft.world.item.WrittenBookItem
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.BushBlock
 *  net.minecraft.world.level.block.CropBlock
 *  net.minecraft.world.level.block.FlowerBlock
 *  net.minecraft.world.level.block.NetherFungusBlock
 *  net.minecraft.world.level.block.SkullBlock
 *  net.minecraft.world.level.block.SlabBlock
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Holder;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ExperienceBottleItem;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.KnowledgeBookItem;
import net.minecraft.world.item.PlayerHeadItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.item.WritableBookItem;
import net.minecraft.world.item.WrittenBookItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.NetherFungusBlock;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.SlabBlock;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class vM {
    private static final Set<Item> e;
    private static final Set<Item> X;
    public static final List<Block> s;
    private static int[] H;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static /* bridge */ /* synthetic */ CallSite s(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static float f() {
        return (float)vM.s("K1l8O0aBxboBdllv", floatValue(), (Float)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", map(java.util.function.Function<? super T, ? extends R> ), (Stream)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", x()), (long)415197394286909465L), vM::lambda$getBestShovelScore$0, (long)1143211481283200773L)), vM::b), Float::compareTo, (long)364845113189698498L), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L), (long)535909545969414314L))));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getWorstArrow$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (!bl) break block4;
                    if (object != false) break block5;
                    object = vM.s("K1l8O0aBxboBdllv", getItem(), (ItemStack)itemStack) instanceof ArrowItem;
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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

    private static int lambda$getBestShovel$1(ItemStack itemStack) {
        return (int)(vM.s("K1l8O0aBxboBdllv", b(net.minecraft.world.item.ItemStack ), (ItemStack)itemStack) * 100.0f);
    }

    private static int lambda$getBestAxe$1(ItemStack itemStack) {
        return (int)(hi.a("G", (Object)itemStack, (long)1237074617426313755L) * 100.0f);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int T(Object[] var0) {
        block20: {
            block19: {
                var1_1 = (ItemStack)var0[0];
                var2_2 = Dl.t();
                var4_3 = vM.a(21242, 991403693573410830L) * vM.a(8045, 2588376518849420053L) + vM.a(3083, 6077879756441145199L) - vM.a(27629, 5921241323128794391L);
                if (!var2_2) break block19;
lbl6:
                // 2 sources

                while (true) {
                    if (var1_1 == null) {
                        var4_3 = (vM.a(17729, 258700263505429359L) ^ vM.a(30576, 5296274914627203931L)) + vM.a(17088, 640694954518544762L) + vM.a(9702, 5293044197936359006L);
                        if (!var2_2) break block19;
                    }
                    var4_3 = vM.a(15920, 2473235526261012619L) + vM.a(21892, 8614661687987376974L) ^ vM.a(11071, 4214939091762145667L) ^ vM.a(2766, 2655481007358070545L);
                    if (!var2_2) break block19;
                    ** GOTO lbl37
                    break;
                }
lbl13:
                // 2 sources

                while (true) {
                    v0 /* !! */  = var3_4;
                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (long)1083370172219505635L);
                    if (var2_2) ** GOTO lbl45
                    if (v0 /* !! */  >= v1 /* !! */ ) ** GOTO lbl43
                    ** GOTO lbl47
                    break;
                }
            }
            block15: while (true) {
                switch (var4_3) {
                    default: {
                        ** continue;
                    }
                    case 1709699699: {
                        if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) != null) ** GOTO lbl37
                        ** GOTO lbl39
                    }
                    case 1709699695: {
                        var3_4 = 0;
                        if (!var2_2) ** GOTO lbl41
                        ** GOTO lbl13
                    }
                    case 1709699698: {
                        hi.a("G", (long)545824520147797887L);
                        hi.a("G", (long)637561819799202476L);
                        var4_3 = vM.a(24253, 3518174648636251416L) + vM.a(19025, 4545353118708174743L) - vM.a(1804, 8796710162272731737L);
                        continue block15;
                    }
lbl37:
                    // 2 sources

                    var4_3 = hi.a("G", (int)(vM.a(28312, 5893522660905200588L) / vM.a(32266, 2877241253800065138L) / vM.a(20192, 813614737635445453L)), (int)vM.a(11860, 4412350693815806425L), (long)834203424483934088L) ^ vM.a(6732, 1293290806864402649L);
                    if (!var2_2) continue block15;
lbl39:
                    // 2 sources

                    var4_3 = (vM.a(4481, 3665362450867607294L) ^ vM.a(29172, 600383224580060193L)) + vM.a(8400, 1614609706332611851L) + vM.a(26039, 342493494443581793L);
                    continue block15;
lbl41:
                    // 1 sources

                    var4_3 = vM.a(2064, 703332489285192427L) / vM.a(32266, 2877241253800065138L) / 5 / vM.a(20192, 813614737635445453L) + vM.a(27467, 7851684748794572196L);
                    if (!var2_2) break block20;
lbl43:
                    // 2 sources

                    v0 /* !! */  = (int)(hi.a("G", (int)vM.a(28046, 6976388013576761083L), (int)vM.a(1844, 4540524112603889906L), (long)834203424483934088L) + vM.a(3000, 1410313250551975244L));
                    v1 /* !! */  = (CallSite)vM.a(4410, 1111431479440561418L);
lbl45:
                    // 2 sources

                    var4_3 = v0 /* !! */  + v1 /* !! */ ;
                    if (!var2_2) break block20;
lbl47:
                    // 2 sources

                    var4_3 = (vM.a(21690, 141537474540704721L) / vM.a(20192, 813614737635445453L) ^ vM.a(6838, 6699277988394524404L)) + vM.a(7438, 7873386236031064758L);
                    if (!var2_2) break block20;
                    ** GOTO lbl68
                    case 1709699697: 
                }
                break;
            }
            return -1;
        }
        block16: while (true) {
            switch (var4_3) {
                default: {
                    ** continue;
                }
                case 2005484025: {
                    if (hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (int)var3_4, (long)449627806291078247L) != var1_1) ** GOTO lbl68
                    ** GOTO lbl70
                }
                case 2005484027: {
                    ++var3_4;
                    if (var2_2) {
                        return -1;
                    }
                    ** GOTO lbl72
                }
                case 2005484023: {
                    hi.a("G", (int)0, (long)1040117516474656258L);
                    return (int)vM.s("K1l8O0aBxboBdllv", T(int ), (int)0);
                }
lbl68:
                // 2 sources

                var4_3 = vM.a(7852, 2620852823818493423L) / vM.a(6959, 7226212375651702819L) - vM.a(10470, 3372849206426660478L);
                if (!var2_2) continue block16;
lbl70:
                // 2 sources

                var4_3 = vM.a(17191, 3256315398862832736L) + vM.a(10290, 7417007146487705032L) + vM.a(27031, 2140347263035878259L) - vM.a(4606, 957931541849560365L) + vM.a(4452, 3347035868840285355L);
                if (!var2_2) continue block16;
lbl72:
                // 2 sources

                var4_3 = vM.a(11419, 1489446497126213954L) / vM.a(32266, 2877241253800065138L) / 5 / vM.a(20192, 813614737635445453L) + vM.a(20327, 5848427606311766488L);
                continue block16;
                case 2005484026: {
                    return var3_4;
                }
                case 2005484024: 
            }
            break;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestBlock$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block7: {
                block6: {
                    block4: {
                        bl = Dl.t();
                        object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                        if (bl) break block4;
                        if (object != false) break block5;
                        object = vM.s("K1l8O0aBxboBdllv", getItem(), (ItemStack)itemStack) instanceof BlockItem;
                    }
                    if (bl) break block6;
                    if (object == false) break block5;
                    object = hi.a("G", (Object)itemStack, (long)940583092663856915L);
                }
                if (bl) break block7;
                if (object == false) break block5;
                object = vM.s("K1l8O0aBxboBdllv", z(net.minecraft.world.item.ItemStack ), (ItemStack)itemStack);
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
    private static boolean lambda$getBestPickaxe$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("G", (Object)itemStack, (long)691855746686294592L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static ItemStack I(Object[] objectArray) {
        EquipmentSlot equipmentSlot = (EquipmentSlot)objectArray[0];
        boolean bl = Dl.S();
        int n = ((vM.a(7639, 3590034746757766011L) - vM.a(16184, 1119412273198528852L)) * vM.a(7155, 8626435613331414225L) / vM.a(32472, 5205922672955373614L) ^ vM.a(31322, 3674560569975978489L)) + vM.a(23567, 428292919379861437L);
        boolean bl2 = true;
        block5: while (true) {
            block8: {
                block9: {
                    if (bl2 && !(bl2 = false) && bl) break block8;
                    if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null) break block9;
                    n = hi.a("G", (int)((vM.a(29312, 7916747209565943320L) * vM.a(4134, 5612594490194088974L) ^ vM.a(1058, 4008906815955190600L)) + vM.a(503, 4840146782373856727L)), (int)vM.a(4768, 8687842256358200449L), (long)834203424483934088L) ^ vM.a(30891, 3382990427434335054L);
                    if (bl) break block8;
                }
                n = (vM.a(22077, 3528250314707342519L) * vM.a(7645, 6221191857788018520L) + vM.a(26619, 4270329068086371108L)) * vM.a(16705, 1763723151583184597L) + vM.a(30010, 7463297851511845030L);
            }
            switch (n) {
                default: {
                    continue block5;
                }
                case 1265640065: {
                    return hi.a("j", (long)989520643504678076L);
                }
                case 1265640064: {
                    return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (int)hi.a("\u00a5", (Object)equipmentSlot, (int)vM.a(25615, 2645844577291641639L), (long)482491641221374219L), (long)449627806291078247L);
                }
                case 1265640067: 
            }
            break;
        }
        hi.a("G", (int)-1, (long)525303406604919947L);
        return null;
    }

    public static float Q() {
        return (float)hi.a("\u00a5", (Object)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::W, (long)1143211481283200773L), vM::j, (long)935650006110027503L), Float::compareTo, (long)364845113189698498L), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L), (long)535909545969414314L))), (long)1263586790430806583L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean x(Object[] var0) {
        block13: {
            var1_1 = (ItemStack)var0[0];
            var2_2 = Dl.S();
            var3_3 /* !! */  = hi.a("G", (int)((hi.a("G", (int)vM.a(21776, 4223974537747632703L), (int)vM.a(24883, 7165414650539319902L), (long)834203424483934088L) ^ vM.a(22408, 2470791948062396630L)) * vM.a(15798, 7066686862665776869L)), (int)vM.a(32493, 4738140768114261298L), (long)834203424483934088L) - vM.a(174, 750956029294855218L);
            if (var2_2) ** GOTO lbl16
            block10: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                            if (!var2_2) break block14;
                            if (v0 /* !! */  == false) break block15;
                            v0 /* !! */  = var3_3 /* !! */  = (reference)(vM.a(23522, 3885364050898164035L) / vM.a(2904, 2062424234454896584L) + vM.a(22198, 3573322723221476844L));
                        }
                        if (var2_2) break block16;
                    }
                    var3_3 /* !! */  = (reference)(vM.a(1184, 2635075672620221357L) - vM.a(21679, 5233301505424463633L) + vM.a(12358, 5253603909875726201L) + vM.a(25311, 5945758945147036736L));
                    if (!var2_2) ** GOTO lbl45
                }
                while (true) {
                    block20: {
                        block18: {
                            block19: {
                                block17: {
                                    switch (var3_3 /* !! */ ) {
                                        default: {
                                            continue block10;
                                        }
                                        case 282659656: {
                                            if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) != hi.a("j", (long)978043674506515603L)) break;
                                            break block17;
                                        }
                                        case 282659653: {
                                            v1 /* !! */  = hi.a("G", (Object)var1_1, (Object)hi.a("j", (long)869065030302155908L), (long)1072650197384473271L);
                                            v2 = vM.a(18447, 8909522339197062651L);
                                            if (!var2_2) break block18;
                                            if (v1 /* !! */  <= v2) break block19;
                                            break block20;
                                        }
                                        case 282659651: {
                                            v3 = true;
                                            var3_3 /* !! */  = hi.a("G", (int)vM.a(24233, 5795677069515004077L), (int)vM.a(28290, 7630791669416963429L), (long)834203424483934088L) / vM.a(1869, 968455849344319811L) - vM.a(19159, 3123663011360148512L);
                                            if (!var2_2) {
                                                break block10;
                                            }
                                            break block13;
                                        }
                                        case 282659652: {
                                            v3 = false;
                                            if (var2_2) break block10;
                                            return v3;
                                        }
                                        case 282659654: {
                                            vM.s("K1l8O0aBxboBdllv", D());
                                            vM.s("K1l8O0aBxboBdllv", c());
                                            return (boolean)vM.s("K1l8O0aBxboBdllv", d());
                                        }
                                    }
lbl45:
                                    // 2 sources

                                    var3_3 /* !! */  = (reference)(vM.a(31404, 6165223618473474534L) / vM.a(2904, 2062424234454896584L) + vM.a(27574, 601481285699610935L));
                                    if (var2_2) continue;
                                }
                                var3_3 /* !! */  = (reference)(vM.a(26911, 4220107571038170523L) / vM.a(20192, 813614737635445453L) ^ vM.a(21597, 8607247428758901319L) ^ vM.a(22128, 8898007125701694861L));
                                if (var2_2) continue;
                            }
                            v1 /* !! */  = (CallSite)(vM.a(31404, 6165223618473474534L) / vM.a(2904, 2062424234454896584L));
                            v2 = vM.a(27574, 601481285699610935L);
                        }
                        var3_3 /* !! */  = v1 /* !! */  + v2;
                        if (var2_2) continue;
                    }
                    var3_3 /* !! */  = (reference)(vM.a(29749, 1817356736168046820L) / 4 + vM.a(8831, 1270453214055524044L));
                }
                break;
            }
            var3_3 /* !! */  = hi.a("G", (int)vM.a(6693, 6967892261208185003L), (int)vM.a(1090, 4417475831979296664L), (long)834203424483934088L) / vM.a(1869, 968455849344319811L) - vM.a(18210, 4148697233376084929L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v3;
            }
            case -1577340003: 
        }
        vM.s("K1l8O0aBxboBdllv", e());
        hi.a("G", (long)641038085929903199L);
        return false;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean K(Object[] var0) {
        var1_1 = (ItemStack)var0[0];
        var2_2 = Dl.t();
        var3_3 /* !! */  = hi.a("G", (int)(vM.a(2329, 5156276955243925211L) * vM.a(26410, 3914750432836133429L) ^ vM.a(20249, 2633691282639030493L)), (int)vM.a(13645, 4094782896544478079L), (long)834203424483934088L) - vM.a(31524, 8464756302095203574L);
        if (!var2_2) ** GOTO lbl16
        block18: while (true) {
            block23: {
                block22: {
                    block21: {
                        v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                        if (var2_2) break block21;
                        if (v0 /* !! */  != false) break block22;
                        v0 /* !! */  = var3_3 /* !! */  = (reference)(((vM.a(19516, 1366347006376021722L) ^ vM.a(30975, 5807789142311976757L)) - vM.a(9253, 6569790738111291661L) ^ vM.a(28227, 4786048952847444672L)) - vM.a(19877, 2922096699480312442L));
                    }
                    if (!var2_2) break block23;
                }
                var3_3 /* !! */  = hi.a("G", (int)(vM.a(1438, 2178343411989266951L) * vM.a(9441, 7171372747277296346L)), (int)vM.a(22031, 5037217494182957119L), (long)834203424483934088L) / vM.a(32266, 2877241253800065138L) / vM.a(20192, 813614737635445453L) + vM.a(18562, 7827772682406890030L);
                if (var2_2) ** GOTO lbl63
            }
            block19: while (true) {
                switch (var3_3 /* !! */ ) {
                    default: {
                        continue block18;
                    }
                    case 1660567310: {
                        v1 = hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) instanceof AxeItem;
                        if (var2_2) ** GOTO lbl64
                        if (v1 == 0) ** GOTO lbl63
                        ** GOTO lbl66
                    }
                    case 1660567307: {
                        if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) != hi.a("j", (long)978043674506515603L)) ** GOTO lbl68
                        ** GOTO lbl70
                    }
                    case 1660567313: {
                        v2 /* !! */  = vM.s("K1l8O0aBxboBdllv", b(net.minecraft.world.item.ItemStack net.minecraft.resources.ResourceKey<net.minecraft.world.item.enchantment.Enchantment> ), (ItemStack)var1_1, (ResourceKey)hi.a("j", (long)869065030302155908L));
                        v3 = vM.a(30442, 2708677689568801251L);
                        if (var2_2) ** GOTO lbl74
                        if (v2 /* !! */  <= v3) ** GOTO lbl72
                        ** GOTO lbl76
                    }
                    case 1660567312: {
                        if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) != hi.a("j", (long)724096539273128411L)) ** GOTO lbl78
                        ** GOTO lbl80
                    }
                    case 1660567311: {
                        v4 = hi.a("G", (Object)var1_1, (Object)hi.a("j", (long)1160948181640913288L), (long)1072650197384473271L);
                        v5 = 1;
                        if (var2_2) ** GOTO lbl84
                        if (v4 <= v5) ** GOTO lbl82
                        ** GOTO lbl86
                    }
                    case 1660567306: {
                        if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) == hi.a("j", (long)1122047338066269970L)) ** GOTO lbl88
                        ** GOTO lbl90
                    }
                    case 1660567302: {
                        if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) != hi.a("j", (long)952039448062095237L)) ** GOTO lbl92
                        ** GOTO lbl94
                    }
                    case 1660567308: {
                        v6 = true;
                        var3_3 /* !! */  = (reference)((vM.a(9478, 2557525402657186658L) / 4 / vM.a(32266, 2877241253800065138L) ^ vM.a(22320, 2758798536746636440L)) - vM.a(30401, 1731244040648929702L));
                        if (!var2_2) ** GOTO lbl97
                        ** GOTO lbl96
                    }
                    case 1660567303: {
                        v6 = false;
                        if (var2_2) {
                            return v6;
                        }
                        ** GOTO lbl96
                    }
                    case 1660567309: {
                        throw null;
                    }
lbl63:
                    // 2 sources

                    v1 = ((vM.a(127, 6459931287967614652L) * vM.a(6081, 8190986522648892381L) ^ vM.a(21129, 9085024122130830414L)) / vM.a(25729, 5959736332929900787L) ^ vM.a(26240, 7660456354373902483L)) - vM.a(21960, 6897278856878298095L);
lbl64:
                    // 2 sources

                    var3_3 /* !! */  = (reference)v1;
                    if (!var2_2) continue block19;
lbl66:
                    // 2 sources

                    var3_3 /* !! */  = hi.a("G", (int)vM.a(25164, 494454087525607025L), (int)vM.a(3620, 3428257703059179651L), (long)834203424483934088L) + vM.a(3203, 1889126813495839510L);
                    if (!var2_2) continue block19;
lbl68:
                    // 2 sources

                    var3_3 /* !! */  = (reference)(((vM.a(13406, 1033875713740896009L) * vM.a(31782, 3602524662839785487L) ^ vM.a(1609, 7696382170226868311L)) / vM.a(25729, 5959736332929900787L) ^ vM.a(32669, 183123204322965594L)) - vM.a(31894, 3840584535668144308L));
                    if (!var2_2) continue block19;
lbl70:
                    // 2 sources

                    var3_3 /* !! */  = (reference)(((vM.a(5456, 8600236684828037699L) ^ vM.a(27995, 5318974519685360062L)) + vM.a(4523, 2148862525468006261L) - vM.a(28272, 2975098923326122820L) ^ vM.a(6871, 5039614535504027585L)) - vM.a(25160, 4291640526456661549L));
                    if (!var2_2) continue block19;
lbl72:
                    // 2 sources

                    v2 /* !! */  = (CallSite)((vM.a(13406, 1033875713740896009L) * vM.a(31782, 3602524662839785487L) ^ vM.a(1609, 7696382170226868311L)) / vM.a(25729, 5959736332929900787L) ^ vM.a(32669, 183123204322965594L));
                    v3 = vM.a(31894, 3840584535668144308L);
lbl74:
                    // 2 sources

                    var3_3 /* !! */  = v2 /* !! */  - v3;
                    if (!var2_2) continue block19;
lbl76:
                    // 2 sources

                    var3_3 /* !! */  = (reference)((vM.s("K1l8O0aBxboBdllv", max(int int ), (int)vM.a(27349, 1832183982844751465L), (int)vM.a(8647, 6519423203531220151L)) - vM.a(16786, 7781912121687541106L) ^ vM.a(14375, 2558077700453301802L)) - vM.a(5036, 833556459901341763L));
                    if (!var2_2) continue block19;
lbl78:
                    // 2 sources

                    var3_3 /* !! */  = (reference)(hi.a("G", (int)(((vM.a(11120, 1474069903305894946L) ^ vM.a(19664, 3636371390534715786L)) + vM.a(32696, 6770076969484893361L)) / vM.a(32050, 5888244596651114117L)), (int)vM.a(13859, 2800621533539660968L), (long)834203424483934088L) ^ vM.a(20199, 5698846444656495735L));
                    if (!var2_2) continue block19;
lbl80:
                    // 2 sources

                    var3_3 /* !! */  = hi.a("G", (int)vM.a(6934, 4393531235152158585L), (int)vM.a(31920, 1989013907744045351L), (long)834203424483934088L) / vM.a(32266, 2877241253800065138L) / 5 + vM.a(10507, 6139719647632058999L);
                    if (!var2_2) continue block19;
lbl82:
                    // 2 sources

                    v4 = hi.a("G", (int)(((vM.a(18538, 4919798532286582240L) ^ vM.a(22588, 6988020948112317587L)) + vM.a(27988, 902599295676000687L)) / vM.a(32050, 5888244596651114117L)), (int)vM.a(21711, 9149907589205103513L), (long)834203424483934088L);
                    v5 = vM.a(22622, 2305175880886852812L);
lbl84:
                    // 2 sources

                    var3_3 /* !! */  = (reference)(v4 ^ v5);
                    if (!var2_2) continue block19;
lbl86:
                    // 2 sources

                    var3_3 /* !! */  = (reference)(vM.a(21092, 4726770020831990992L) * vM.a(4537, 7973048390940119571L) + vM.a(10796, 6537691634821656226L) - vM.a(27976, 5936169451010729989L));
                    if (!var2_2) continue block19;
lbl88:
                    // 2 sources

                    var3_3 /* !! */  = (reference)((vM.a(20726, 7516212883252679519L) ^ vM.a(16004, 3188595099090450982L)) + vM.a(31869, 8069355868748529373L));
                    if (!var2_2) continue block19;
lbl90:
                    // 2 sources

                    var3_3 /* !! */  = hi.a("G", (int)vM.a(18490, 1618315750139071633L), (int)vM.a(237, 7016184678637749099L), (long)834203424483934088L) - vM.a(17535, 497753076087128675L);
                    if (!var2_2) continue block19;
lbl92:
                    // 2 sources

                    var3_3 /* !! */  = (reference)(vM.a(12814, 3692214265958823191L) - vM.a(10505, 8441780590620502932L) ^ vM.a(3276, 1084810158754746231L));
                    if (!var2_2) continue block19;
lbl94:
                    // 2 sources

                    var3_3 /* !! */  = (reference)((vM.a(25832, 6147359100085445201L) ^ vM.a(21307, 2412142537553187200L)) + vM.a(23506, 9213573044617845947L));
                    continue block19;
lbl96:
                    // 2 sources

                    var3_3 /* !! */  = (reference)((vM.a(7100, 7571969564829441844L) / 4 / vM.a(32266, 2877241253800065138L) ^ vM.a(14744, 2414172259356244716L)) - vM.a(11878, 7785858081942268113L));
lbl97:
                    // 2 sources

                    switch (var3_3 /* !! */ ) {
                        default: {
                            return v6;
                        }
                        case -304548011: 
                    }
                    throw null;
                    case 1660567305: {
                        return false;
                    }
                    case 1660567300: {
                        return true;
                    }
                    case 1660567304: 
                }
                break;
            }
            break;
        }
        return true;
    }

    public static ItemStack l() {
        return (ItemStack)vM.s("K1l8O0aBxboBdllv", orElse(T ), (Optional)((Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", filter(java.util.function.Predicate<? super T> ), (Stream)((Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L)), vM::lambda$getBestPowerBow$0), (Object)vM.s("K1l8O0aBxboBdllv", comparingInt(java.util.function.ToIntFunction<? super T> ), vM::lambda$getBestPowerBow$1), (long)364845113189698498L)), null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$getBestArmorScore$0(EquipmentSlot equipmentSlot, ItemStack itemStack) {
        boolean bl = Dl.t();
        ItemStack itemStack2 = itemStack;
        if (!bl) {
            if (hi.a("\u00a5", (Object)itemStack2, (long)675687955611242108L) != false) return false;
            itemStack2 = itemStack;
        }
        if (hi.a("G", (Object)itemStack2, (long)1280162559367933539L) != equipmentSlot) return false;
        return true;
    }

    public static ItemStack o() {
        return (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", stream(), (List)((Object)hi.a("G", (long)989880202519854622L))), vM::lambda$getWorstProjectile$0, (long)1143211481283200773L), (Object)hi.a("G", ItemStack::getCount, (long)860018880249920103L), (long)966808767256027499L), null, (long)535909545969414314L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static float N(Object[] var0) {
        block19: {
            block20: {
                var1_1 = var0[0];
                var2_2 = Dl.S();
                var4_3 /* !! */  = (hi.a("G", (int)vM.a(13686, 5370135717099927105L), (int)vM.a(24654, 5366483315520284206L), (long)834203424483934088L) * vM.a(9996, 578418840126841216L) ^ vM.a(22356, 770041851538542771L)) - vM.a(16418, 163565536933808038L) - vM.a(19996, 1094712567348529377L);
                if (var2_2) break block20;
lbl6:
                // 2 sources

                while (true) {
                    v0 /* !! */  = hi.a("G", (Object)((ItemStack)var1_1), (Object)hi.a("j", (long)869065030302155908L), (long)1072650197384473271L);
                    while (true) {
                        block23: {
                            block22: {
                                block21: {
                                    v1 /* !! */  = var3_4 = v0 /* !! */ ;
                                    if (!var2_2) break block21;
                                    if (v1 /* !! */  > 0) break block22;
                                    v1 /* !! */  = (CallSite)(vM.s("K1l8O0aBxboBdllv", max(int int ), (int)vM.a(13813, 8058627165583274707L), (int)vM.a(13797, 208752304052171011L)) ^ vM.a(29720, 3492887911280096242L) ^ vM.a(10909, 1504809384375871948L));
                                }
                                var4_3 /* !! */  = (int)v1 /* !! */ ;
                                if (var2_2) break block23;
                            }
                            var4_3 /* !! */  = (vM.a(31538, 7943931749526585222L) ^ vM.a(19205, 2283569332012322032L)) + vM.a(24367, 7565847853885955304L) - vM.a(21947, 3842168156925727680L) ^ vM.a(10922, 6985590905314601304L);
                        }
                        switch (var4_3 /* !! */ ) {
                            default: {
                                v2 = 0.5f * (float)var3_4 + 0.5f;
                                var4_3 /* !! */  = vM.a(20904, 4085239513044554477L) * vM.a(13269, 2009367539372061869L) / vM.a(8116, 8991856463935626295L) ^ vM.a(32260, 6329780663786485868L);
                                if (!var2_2) {
                                    break;
                                }
                                break block19;
                            }
                            case -45053229: {
                                v2 = 0.0f;
                                if (var2_2) break;
                                return v2;
                            }
                            case -45053230: {
                                return (float)hi.a("G", (long)964250018269559427L);
                            }
                        }
                        var4_3 /* !! */  = vM.a(23618, 5982367261869217942L) * vM.a(17992, 8054546059144889205L) / vM.a(1869, 968455849344319811L) ^ vM.a(13019, 5542357991885829821L);
                        break block19;
                        break;
                    }
                    break;
                }
            }
            while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1122868312: 
                }
                hi.a("G", (long)437292628650123400L);
                v0 /* !! */  = (CallSite)((hi.a("G", (int)vM.a(2815, 7184145140513165230L), (int)vM.a(8806, 8620200813296215832L), (long)834203424483934088L) + vM.a(20199, 5553111932996487847L) ^ vM.a(17802, 392884177807377142L)) + vM.a(15670, 2964162803381829508L));
                if (!var2_2) ** continue;
                var4_3 /* !! */  = (int)v0 /* !! */ ;
            }
        }
        block13: while (true) {
            switch (var4_3 /* !! */ ) {
                case -1486004931: {
                    hi.a("G", (int)vM.a(10995, 2661321827228806173L), (int)2, (long)656208795491924261L);
                    hi.a("G", (long)829648466043852550L);
                    var4_3 /* !! */  = (vM.a(10967, 5465859681510485930L) + vM.a(21208, 8499973287957010069L) ^ vM.a(16844, 3118152313625151225L)) + vM.a(17752, 6442987971891167499L);
                    continue block13;
                }
            }
            break;
        }
        return v2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBlockCountInInventory$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block7: {
                block6: {
                    block4: {
                        bl = Dl.t();
                        object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                        if (bl) break block4;
                        if (object != false) break block5;
                        object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof BlockItem;
                    }
                    if (bl) break block6;
                    if (object == false) break block5;
                    object = hi.a("G", (Object)itemStack, (long)940583092663856915L);
                }
                if (bl) break block7;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
    public static boolean q(Object[] var0) {
        block19: {
            block15: {
                block14: {
                    var1_1 = (ItemStack)var0[0];
                    var2_2 = Dl.t();
                    var5_3 /* !! */  = hi.a("G", (int)(vM.a(17794, 2918429888763462419L) / 5), (int)vM.a(19289, 7572594030493306051L), (long)834203424483934088L) - vM.a(14804, 6124607864454872840L) - vM.a(8641, 6995742299756848931L);
                    if (!var2_2) ** GOTO lbl15
                    block9: while (true) {
                        block18: {
                            block17: {
                                block16: {
                                    v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                                    if (var2_2) break block16;
                                    if (v0 /* !! */  != false) break block17;
                                    v0 /* !! */  = var5_3 /* !! */  = (reference)((hi.a("G", (int)vM.a(6043, 3083116780712874540L), (int)vM.a(23275, 4541135271140071895L), (long)834203424483934088L) - vM.a(26799, 3949112424129211669L)) * vM.a(16155, 8352626210121841847L) ^ vM.a(17007, 3420220434810437766L));
                                }
                                if (!var2_2) break block18;
                            }
                            var5_3 /* !! */  = hi.a("G", (int)vM.a(27949, 6184556274523515781L), (int)vM.a(4984, 8152488326199432638L), (long)834203424483934088L) - vM.a(3642, 7148811196465629904L) + vM.a(14213, 7185478733005583598L);
                        }
                        switch (var5_3 /* !! */ ) {
                            default: {
                                continue block9;
                            }
                            case 1021166666: {
                                return false;
                            }
                            case 1021166667: {
                                var4_4 = hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L);
                                v1 = var4_4 instanceof BlockItem;
                                if (var2_2) break block14;
                                if (v1 == 0) break block9;
                                break block15;
                            }
                            case 1021166668: {
                                throw null;
                            }
                        }
                        break;
                    }
                    v1 = (vM.a(14120, 5777927172697748191L) - vM.a(17169, 4427199217296475864L) ^ vM.a(10782, 5279981993298816519L)) - vM.a(12094, 2547357111249168486L);
                }
                var5_3 /* !! */  = (reference)v1;
                if (!var2_2) break block19;
            }
            var5_3 /* !! */  = (reference)((vM.s("K1l8O0aBxboBdllv", max(int int ), (int)(vM.a(6716, 7529230101767117071L) - vM.a(22101, 1346677718128038766L) + vM.a(18313, 7015216003226207023L)), (int)vM.a(21915, 4748321879104983285L)) ^ vM.a(22377, 292802317033443531L)) - vM.a(14943, 6430553765187254445L));
        }
        v2 /* !! */  = var5_3 /* !! */ ;
        if (var2_2 != false) return (boolean)v2 /* !! */ ;
        switch (v2 /* !! */ ) {
            default: {
                var3_5 = (BlockItem)var4_4;
                return hi.a("\u00a5", (Object)var3_5, (long)708963368116028632L) instanceof SkullBlock;
            }
            case -506447565: {
                return false;
            }
            case -506447564: 
        }
        vM.s("K1l8O0aBxboBdllv", d());
        v2 /* !! */  = hi.a("G", (long)938841799815187197L);
        return (boolean)v2 /* !! */ ;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean i(Object[] var0) {
        block14: {
            var1_1 = (ItemStack)var0[0];
            var2_2 = Dl.S();
            var3_3 /* !! */  = vM.a(28422, 4923470329061125204L) * vM.a(12507, 7183321231653402496L) / 3 / vM.a(1758, 6355102919804338912L) - vM.a(27899, 3505258549708335189L);
            if (var2_2) ** GOTO lbl17
            block10: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                            if (!var2_2) break block15;
                            if (v0 == false) break block16;
                            v0 = vM.s("K1l8O0aBxboBdllv", max(int int ), (int)vM.a(6824, 4453850197942885927L), (int)vM.a(6834, 1295739792510737667L)) / vM.a(381, 1648969827804234736L) + vM.a(24749, 3309994195208349571L);
                        }
                        var3_3 /* !! */  = (int)v0;
                        if (var2_2) break block17;
                    }
                    var3_3 /* !! */  = vM.a(13582, 9023167946135597696L) * vM.a(18929, 7129041086240721768L) ^ vM.a(19715, 7988859424175656522L);
                    if (!var2_2) ** GOTO lbl41
                }
                block11: while (true) {
                    switch (var3_3 /* !! */ ) {
                        default: {
                            continue block10;
                        }
                        case 1899148184: {
                            if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) != hi.a("j", (long)724096539273128411L)) ** GOTO lbl41
                            ** GOTO lbl43
                        }
                        case 1899148186: {
                            v1 = hi.a("G", (Object)var1_1, (Object)hi.a("j", (long)1160948181640913288L), (long)1072650197384473271L);
                            v2 = 1;
                            if (!var2_2) ** GOTO lbl47
                            if (v1 <= v2) ** GOTO lbl45
                            ** GOTO lbl49
                        }
                        case 1899148183: {
                            v3 = true;
                            var3_3 /* !! */  = (vM.a(7837, 2527028708679080935L) ^ vM.a(32604, 6139184519873378745L)) - vM.a(8940, 768237055997108590L);
                            if (var2_2) break block14;
                            ** GOTO lbl51
                        }
                        case 1899148181: {
                            v3 = false;
                            if (!var2_2) {
                                return v3;
                            }
                            ** GOTO lbl51
                        }
lbl41:
                        // 2 sources

                        var3_3 /* !! */  = (int)(hi.a("G", (int)vM.a(20265, 1188331462175820848L), (int)vM.a(13750, 8352412645954876104L), (long)834203424483934088L) / vM.a(32472, 5205922672955373614L) + vM.a(31656, 1647527354160988047L));
                        if (var2_2) continue block11;
lbl43:
                        // 2 sources

                        var3_3 /* !! */  = (vM.a(12754, 6314115824106239354L) + vM.a(1473, 7983065390440497728L)) / vM.a(22897, 2572309982388952884L) - vM.a(31321, 6902960272196123998L) + vM.a(21876, 3865083604738774701L);
                        if (var2_2) continue block11;
lbl45:
                        // 2 sources

                        v1 = hi.a("G", (int)vM.a(20265, 1188331462175820848L), (int)vM.a(13750, 8352412645954876104L), (long)834203424483934088L) / vM.a(32472, 5205922672955373614L);
                        v2 = vM.a(31656, 1647527354160988047L);
lbl47:
                        // 2 sources

                        var3_3 /* !! */  = (int)(v1 + v2);
                        if (var2_2) continue block11;
lbl49:
                        // 2 sources

                        var3_3 /* !! */  = (int)(vM.s("K1l8O0aBxboBdllv", max(int int ), (int)vM.a(10557, 1081809739560872979L), (int)vM.a(31849, 3769569906562283993L)) + vM.a(21922, 7958680551933973347L) + vM.a(25400, 844762582014403896L));
                        continue block11;
lbl51:
                        // 2 sources

                        var3_3 /* !! */  = (vM.a(20334, 7342361876756302708L) ^ vM.a(4346, 885780213913081183L)) - vM.a(12559, 7532454042465759942L);
                        break block14;
                        case 1899148185: 
                    }
                    break;
                }
                break;
            }
            return (boolean)hi.a("G", (long)487615547825844238L);
        }
        block12: while (true) {
            switch (var3_3 /* !! */ ) {
                case 1695921444: {
                    hi.a("G", (long)671058646027606858L);
                    hi.a("G", (float)100.0f, (long)671146500863747464L);
                    var3_3 /* !! */  = (vM.a(26793, 7619287350003510907L) + vM.a(4237, 792352635594593723L) + vM.a(20908, 8520402001645311181L)) / vM.a(11063, 8344225301177035975L) - vM.a(1415, 19863305253110449L) ^ vM.a(4142, 7054302939661031177L);
                    continue block12;
                }
            }
            break;
        }
        return v3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestAxe$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block7: {
                block6: {
                    block4: {
                        bl = Dl.t();
                        object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                        if (bl) break block4;
                        if (object != false) break block5;
                        object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof AxeItem;
                    }
                    if (bl) break block6;
                    if (object == false) break block5;
                    object = hi.a("G", (Object)new Object[]{itemStack}, (long)535187538840369779L);
                }
                if (bl) break block7;
                if (object != false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
    public static boolean J(Object[] var0) {
        block12: {
            block13: {
                block11: {
                    block15: {
                        block14: {
                            var1_1 = (ItemStack)var0[0];
                            var2_2 = Dl.t();
                            var3_3 /* !! */  = vM.a(19954, 3157665533101771111L) * vM.a(29133, 7005790582200710004L) ^ vM.a(11808, 7782891324384438964L);
                            if (!var2_2) break block14;
lbl6:
                            // 2 sources

                            while (hi.a("G", (Object)var1_1, (long)1280162559367933539L) != null) {
                                break block11;
                            }
                            break block15;
lbl9:
                            // 2 sources

                            while (true) {
                                hi.a("G", (long)889012284371480360L);
                                return v0;
                            }
                        }
lbl13:
                        // 3 sources

                        block10: while (true) {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    ** GOTO lbl6
                                }
                                case 1754630942: {
                                    v0 = true;
                                    var3_3 /* !! */  = (int)(hi.a("G", (int)(((vM.a(4741, 289364756356487003L) ^ vM.a(6762, 2539697525078286220L)) - vM.a(6221, 263506703676628238L)) / 2), (int)vM.a(9528, 6043983187653027558L), (long)834203424483934088L) - vM.a(12565, 587968928693483002L));
                                    if (!var2_2) break block12;
                                    break block13;
                                }
                                case 1754630944: {
                                    v0 = false;
                                    if (!var2_2) break block13;
                                    ** GOTO lbl9
                                }
                                case 1754630941: {
                                    hi.a("G", (long)872630577218346603L);
                                    hi.a("G", (long)989880202519854622L);
                                    var3_3 /* !! */  = (vM.a(11040, 6504131329479765639L) - vM.a(9572, 2995516967558276754L) + vM.a(3058, 5121100264848476433L) + vM.a(21520, 3138635518693741361L)) * vM.a(17745, 1793645235623397311L) - vM.a(29377, 4985459416198002175L);
                                    if (!var2_2) continue block10;
                                }
                            }
                            break;
                        }
                    }
                    var3_3 /* !! */  = (vM.a(3321, 4652700481230229373L) * vM.a(16148, 6237489746066733601L) - vM.a(293, 4192213611744970394L) ^ vM.a(21958, 8347039213390205383L)) - vM.a(24445, 3318249766478715740L) + vM.a(31913, 7660349735613874079L);
                    if (!var2_2) ** GOTO lbl13
                }
                var3_3 /* !! */  = (vM.a(3596, 2342281673667464041L) - vM.a(18427, 4692232567593534326L) + vM.a(12919, 4244855344393319564L) ^ vM.a(418, 8473648341767046278L)) - vM.a(2252, 5000147400010779242L) - vM.a(2335, 3480911755192258402L);
                ** while (true)
            }
            var3_3 /* !! */  = (int)(hi.a("G", (int)(((vM.a(22208, 5697122003945755622L) ^ vM.a(19127, 4201282148109684018L)) - vM.a(277, 7956794837811709113L)) / 2), (int)vM.a(24853, 3208208964877100798L), (long)834203424483934088L) - vM.a(23228, 481673637675605328L));
        }
        switch (var3_3 /* !! */ ) {
            case 1560308435: {
                ** continue;
            }
        }
        return v0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ItemStack H(int n) {
        reference var1_1 = hi.a("G", (int)(vM.a(31769, 2217034870124559334L) / 4 * vM.a(21746, 980007054098370724L)), (int)vM.a(23095, 8780588899400425426L), (long)834203424483934088L) * vM.a(15570, 4361248748380354739L) + vM.a(19672, 8422067838639180542L);
        block7: while (true) {
            Object object;
            block11: {
                block10: {
                    switch (object) {
                        default: {
                            if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null) break;
                            object = (vM.a(6033, 2737502942831628668L) ^ vM.a(791, 4524657964966561140L) ^ vM.a(31169, 6566091122992201473L)) * vM.a(17365, 3835687189849048919L) / vM.a(27468, 241825219865587143L) ^ vM.a(17344, 6553935973063034453L);
                            continue block7;
                        }
                        case -460577075: {
                            if (n >= 0) {
                                object = hi.a("G", (int)vM.a(32243, 3956532596004370889L), (int)vM.a(9952, 4886230909117194545L), (long)834203424483934088L) ^ vM.a(14248, 8612144076859372469L) ^ vM.a(10929, 4708619592551721238L);
                                continue block7;
                            }
                            break block10;
                        }
                        case -460577078: {
                            if (n >= hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (long)652319075623640586L), (long)1309741251727777634L)) {
                                object = (vM.a(25127, 5344865142909249433L) ^ vM.a(17810, 6901633861363041223L) ^ vM.a(10559, 572735725796912766L)) / vM.a(1869, 968455849344319811L) / vM.a(32050, 5888244596651114117L) ^ vM.a(3454, 5060184359414810845L);
                                continue block7;
                            }
                            break block11;
                        }
                        case -460577076: {
                            return hi.a("j", (long)989520643504678076L);
                        }
                        case -460577077: {
                            return (ItemStack)vM.s("K1l8O0aBxboBdllv", get(int ), (NonNullList)vM.s("K1l8O0aBxboBdllv", getNonEquipmentItems(), (Inventory)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L)), (int)n);
                        }
                        case -460577074: {
                            hi.a("G", (long)1018118041190145658L);
                            hi.a("G", (boolean)true, (long)1096505374926936287L);
                            object = vM.s("K1l8O0aBxboBdllv", max(int int ), (int)((vM.a(14299, 8714293008252727755L) - vM.a(8225, 3918024267459323088L)) * vM.a(10358, 7206748423302508286L)), (int)vM.a(31514, 362166408238972902L)) - vM.a(21013, 8963065558812528815L);
                            continue block7;
                        }
                    }
                    object = (vM.a(7579, 2848478399560309310L) ^ vM.a(16400, 8702976154807633675L) ^ vM.a(25268, 4065957718974276633L)) / vM.a(1869, 968455849344319811L) / vM.a(32050, 5888244596651114117L) ^ vM.a(1533, 1616512652654035552L);
                    continue;
                }
                object = (vM.a(25127, 5344865142909249433L) ^ vM.a(17810, 6901633861363041223L) ^ vM.a(10559, 572735725796912766L)) / vM.a(1869, 968455849344319811L) / vM.a(32050, 5888244596651114117L) ^ vM.a(3454, 5060184359414810845L);
                continue;
            }
            object = vM.a(10025, 7221089883907745180L) * vM.a(13529, 6463188267891192096L) + vM.a(3091, 2433712917071481298L);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float E(Object var0) {
        block14: {
            block12: {
                block13: {
                    block11: {
                        block16: {
                            block15: {
                                var1_1 = Dl.t();
                                var3_2 /* !! */  = (vM.a(29541, 6276166135096520760L) / 2 + vM.a(2935, 6507504956370505103L)) / vM.a(32050, 5888244596651114117L) ^ vM.a(17237, 1383342697074820560L);
                                if (!var1_1) break block15;
lbl4:
                                // 2 sources

                                while ((ItemStack)var0 != null) {
                                    break block11;
                                }
                                break block16;
lbl7:
                                // 1 sources

                                while (true) {
                                    v0 /* !! */  = hi.a("\u00a5", (Object)((ItemStack)var0), (long)675687955611242108L);
                                    if (var1_1) break block12;
                                    if (v0 /* !! */  == false) break block13;
                                    break block14;
                                    break;
                                }
lbl12:
                                // 1 sources

                                return 0.0f;
lbl14:
                                // 1 sources

                                while (true) {
                                    var2_3 = new float[]{0.0f};
                                    hi.a("\u00a5", (Object)((ItemStack)var0), (Object)hi.a("j", (long)583531068633733756L), (BiConsumer<Holder, AttributeModifier>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$getMainhandAttackDamage$0(float[] net.minecraft.core.Holder net.minecraft.world.entity.ai.attributes.AttributeModifier ), (Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V)((float[])var2_3), (long)914026240430918984L);
                                    return var2_3[0];
                                }
                            }
lbl19:
                            // 5 sources

                            while (true) {
                                switch (var3_2 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl4
                                    }
                                    case -126637982: {
                                        ** continue;
                                    }
                                    case -126637983: {
                                        ** continue;
                                    }
                                    case -126637986: {
                                        ** continue;
                                    }
                                    case -126637985: 
                                }
                                throw null;
                            }
                        }
                        var3_2 /* !! */  = (vM.a(5367, 3750664306857039839L) ^ vM.a(21169, 4531512793092658414L)) / vM.a(4367, 5285942171892568993L) - vM.a(21628, 3211016090972918613L);
                        if (!var1_1) ** GOTO lbl19
                    }
                    var3_2 /* !! */  = hi.a("G", (int)(vM.a(18054, 8191740732881961820L) ^ vM.a(9205, 4455845955444105262L)), (int)vM.a(24120, 2859387564741336398L), (long)834203424483934088L) ^ vM.a(516, 8681009078983870436L);
                    if (!var1_1) ** GOTO lbl19
                }
                v0 /* !! */  = (CallSite)((vM.a(15645, 9045238095535896704L) ^ vM.a(683, 4552016769531725278L)) + vM.a(6555, 320842222332337749L) - vM.a(29792, 1870650567446966589L));
            }
            var3_2 /* !! */  = (int)v0 /* !! */ ;
            if (!var1_1) ** GOTO lbl19
        }
        var3_2 /* !! */  = (vM.a(27943, 4497895464672636648L) ^ vM.a(26542, 6094069542629909196L)) / vM.a(4367, 5285942171892568993L) - vM.a(16581, 2761987249302472476L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int e() {
        block20: {
            var0 = Dl.S();
            var2_1 /* !! */  = (vM.a(9040, 7888129796669138522L) ^ vM.a(13292, 6994521906778009712L)) / 5 + vM.a(1980, 4453701579618009691L);
            if (var0) ** GOTO lbl10
            block12: while (true) {
                block22: {
                    block21: {
                        if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null) break block21;
                        var2_1 /* !! */  = (int)(hi.a("G", (int)((vM.a(16255, 7108856123548269545L) * vM.a(30202, 5190246832292508487L) ^ vM.a(1584, 2348270294587949579L)) * vM.a(14276, 4159488484463800869L)), (int)vM.a(6201, 1181400903616618459L), (long)834203424483934088L) - vM.a(20544, 6423206096907310424L));
                        if (var0) break block22;
                    }
                    var2_1 /* !! */  = vM.a(27548, 8072670493786450166L) * vM.a(31465, 3798626130915213026L) * vM.a(23530, 2067283830818020818L) ^ vM.a(6156, 7103355986353937491L);
                }
                switch (var2_1 /* !! */ ) {
                    default: {
                        continue block12;
                    }
                    case 572061092: {
                        return -1;
                    }
                    case 572061091: {
                        var1_2 = 0;
                        if (var0) break block12;
                        break block20;
                    }
                    case 572061093: {
                        hi.a("G", (boolean)false, (long)529149675032995021L);
                        hi.a("G", (float)1.0f, (float)6.0f, (float)1.0f, (float)0.0f, (float)-1.0f, (long)1187820213443169771L);
                        return (int)vM.s("K1l8O0aBxboBdllv", Z());
                    }
                }
                break;
            }
            var2_1 /* !! */  = vM.a(11503, 8101469064181411650L) + vM.a(14333, 4886913082603107050L) - vM.a(17176, 1767946003903907122L);
            if (var0) ** GOTO lbl43
            ** GOTO lbl35
        }
        block13: while (true) {
            block25: {
                block24: {
                    block23: {
                        v0 = var1_2;
                        v1 = vM.a(25729, 5959736332929900787L);
                        if (!var0) break block23;
                        if (v0 < v1) break block24;
lbl35:
                        // 2 sources

                        v0 = vM.a(31150, 1837200596055506749L) / vM.a(32266, 2877241253800065138L) + vM.a(12196, 764605834629442636L) - vM.a(19488, 416224874004351052L) - vM.a(8842, 5335764336162562171L);
                        v1 = vM.a(28652, 1974848475527785681L);
                    }
                    var2_1 /* !! */  = v0 ^ v1;
                    if (var0) break block25;
                }
                var2_1 /* !! */  = (vM.a(31708, 3171687548832562566L) - vM.a(25793, 1155225227952726404L) + vM.a(28003, 1361971683723783929L) ^ vM.a(21522, 3535459782949737296L)) / vM.a(4367, 5285942171892568993L) - vM.a(3863, 4106373954845527171L);
                if (!var0) ** GOTO lbl61
            }
            block14: while (true) {
                switch (var2_1 /* !! */ ) {
                    default: {
                        continue block13;
                    }
                    case 1299885451: {
                        v2 = vM.s("K1l8O0aBxboBdllv", isEmpty(), (ItemStack)hi.a("G", (int)var1_2, (long)1303164259642563020L));
                        if (!var0) ** GOTO lbl62
                        if (v2 == false) ** GOTO lbl61
                        ** GOTO lbl64
                    }
                    case 1299885454: {
                        ++var1_2;
                        if (!var0) {
                            return -1;
                        }
                        ** GOTO lbl66
                    }
                    case 1299885449: {
                        throw null;
                    }
lbl61:
                    // 2 sources

                    v2 = hi.a("G", (int)(vM.a(29955, 3171035919732748820L) / vM.a(12041, 2158887759308548889L) ^ vM.a(30710, 578641618000916533L)), (int)vM.a(10998, 3880317911270484450L), (long)834203424483934088L) - vM.a(6611, 6276489783527464038L) + vM.a(8207, 4831661595059971430L);
lbl62:
                    // 2 sources

                    var2_1 /* !! */  = (int)v2;
                    if (var0) continue block14;
lbl64:
                    // 2 sources

                    var2_1 /* !! */  = vM.a(19060, 2211718119117031744L) - vM.a(29949, 8457248253089133055L) - vM.a(16657, 6706463061938865958L) ^ vM.a(5184, 6033796661039223103L);
                    if (var0) continue block14;
lbl66:
                    // 2 sources

                    var2_1 /* !! */  = vM.a(6532, 4402814136471904198L) + vM.a(22026, 3359854854079942662L) - vM.a(3552, 8095403639098886236L);
                    continue block14;
                    case 1299885453: {
                        return var1_2;
                    }
                    case 1299885452: 
                }
                break;
            }
            break;
        }
        return -1;
    }

    public static int n(Object[] objectArray) {
        ItemStack itemStack = (ItemStack)objectArray[0];
        return (int)hi.a("G", (Object)itemStack, (Object)hi.a("j", (long)510297413883108058L), (long)1072650197384473271L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[14];
                        var11_1 = 0;
                        vM.I(null);
                        var10_2 = "\u797a\u5fd6\u6ee6\u62bd\u0002\u4f9f\u9006\u0002\u9029\u628a\u0002\u4fb4\u75a3\b\u00fctpJiS8\u00a0\u0005y\u00d00\u00f0\u00df\b\u00fc\u00d2p\u009ei\u00c98\u00f3\u0002\u51c4\u67fe\u0005`\u00bd.\u00f3\u00cc\u0002\u7093\u5106\u0002\u512e\u6774\u0005c\u00d3s\u0090\u00b7";
                        var12_3 = "\u797a\u5fd6\u6ee6\u62bd\u0002\u4f9f\u9006\u0002\u9029\u628a\u0002\u4fb4\u75a3\b\u00fctpJiS8\u00a0\u0005y\u00d00\u00f0\u00df\b\u00fc\u00d2p\u009ei\u00c98\u00f3\u0002\u51c4\u67fe\u0005`\u00bd.\u00f3\u00cc\u0002\u7093\u5106\u0002\u512e\u6774\u0005c\u00d3s\u0090\u00b7".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 106;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u007f\u00de\u0092\u00c0\u0004\u0002\u7044\u5133";
                            var12_3 = "\u007f\u00de\u0092\u00c0\u0004\u0002\u7044\u5133".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 27;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 121;
                                    break;
                                }
                                case 1: {
                                    v15 = 88;
                                    break;
                                }
                                case 2: {
                                    v15 = 85;
                                    break;
                                }
                                case 3: {
                                    v15 = 68;
                                    break;
                                }
                                case 4: {
                                    v15 = 123;
                                    break;
                                }
                                case 5: {
                                    v15 = 19;
                                    break;
                                }
                                default: {
                                    v15 = 81;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                vM.a = var13;
                vM.b = new String[14];
                var0_7 = 8422212327020837463L;
                var6_8 = new long[1386];
                var3_9 = 0;
                var4_10 = "~\u00beI?s\u0091-\u00e4&\u00e1\u00cf\u009c\u008e`K\u00b9\u0015\u00ccM\u00f0bzd\u00c1\u0018~\u00cc\u00a8V\u009d\u00cd\u0090\u00f1\u0089Q*\u00e2YQ\n\u001b\u00f4\u008dY\u009eD\u00adAt\u00df\u009a\u00c5\u0094\u00ff\u0090B\u00c8\u00df[X\u00e5\u00ce{cw*{(\u00b2\u00b42M\u00dbr\u0099\u009c\u0010U;t\u00071\u0019xOm\u00b7\u00af\u00cb\u0084\u00a09\u00e8\u0081Z\u00d2\u00d3\u00fb\u0095\u00e9U\u00e0\u00bd\u001a\u0089\u0090\u00b3^X]\u00ea%n\u00ea\u00bb\u001d\u00a4\u0013\u00f3c\u00e1\u00f4z\u00e4$P%\u00be\u00c2.\u00ac\u00151\u00fd\u001f*\u0017+\u0010\u00f2\u00811\u00a5hK\u00c4\u001fp\u00ee\u0095\u00c7\u00bdE\u00bd\u00e0\u0013u\u00c2\u0015\u00ee\u00ec\u0018\u00dd\u00b6\u00cc\u00d0\u00b7e\u000e)\u0081\u00cb>\u00e1\u00c6\u007fZ\u00fekdo\u007f\u008fT\u0014:Q4\u00e65\u00f7\u0091\u00da\u0090\u00aa\u008a$\u0087>1J\u001a\u00e5\t\u00a1\u00d0\u0018\u009a\u00ece\u009fh\u00a1\u00e7S_\u00ca\u00ff#;\u007fT\u0096\u001aSl\u00de\u00ab\u0092/Us{\u0092\u00e7\u00eb\u00cc'\u00a0\u00e1\u00b9\u0098\u0091H\u0007n9\u00e4\u00a2f\u0089\u0006\u00856?)\u00e6&\u00c1\u00ee\u00da\u000by\u0080\u0095\u00a1\u00a5\u0004U\u0006\u0019\u0006$|\u00db\u00a5T\u00a3X\u00da\u0012\u00c7*C\u0011\u0081e\u00ad\u001a\u0087.\u00c6N:9\u0093H%\u0000\u00e1\u00ee\u00b38o\u0081\ra?\u0096\u00e7\u00fc%]g5\u00fbdf\u00b7\b\u00fd\u00e2z\u00db\u009c\u00f6\u0099\u0088\u001a\u00f1\u0082\u000eNT\u00c2\u001eD\u0082\u00ec\u00a6\u00e5gX\u008b\u00c2\u0015\u00a8\u001fJH\u00ba\u0015\f\u008e\u00ad\u00d9m\u0092\u009d!\u0089+\u00ad\u00e0y\u00f8^\u00bf\u008d\u00e3\u001a sv\\\u00e4\u00f5]\u0091M\u0019\u0002\u00f6\u00b5\u00de\u001a\u008a\u000f\u0000i\u0098\u00ecH!\u00f3]UKc\u00d9%g\u00c6\b]\u001aO\u00f4\r\u000e\u00eb\u001d\u0000\u00a6`\u0019H[Q\u00aa\u0006*\u0018v\u001e\u0095\u00ba\u00c2\u00a2\u00a5U\u00a7\u00f4\u0016\u0005\u00c9\u00ce\u008fS@8F\u00c1jl\u008cW\u0091f\u009a\u00dcqvv\u00e6\u00dd\u00a8BP\u00fd\u001e\u0091\u00be\u00b0\u00bc\u0093\u00a4\u007ff\u00ca\u001e\u0089@FM\u00d4c]?\u0096\u0013\u0081\u000e7s\u0004\u00f4\u00af7\u008b>p\u0098*\u0085@\u00dc-\u009a\u00e8\u00des\u009d\u001d\u0094\u00f4\u0019YGD\u00a9\u00ac\u0090)nbTCS6\u00cb\u0088\u009c\u00fc\u0017\u0015\u00b7\u00853\u00fa\u00e5,\u00d3\u00cc\u00b0\n\u00c2s\u00c2)\u00a0\u00b37\u00a4\u0019!\u001e\u00bc\u001aZu\u00f4\u00ca\u009d6\u0002\u00bf\b\u0099\u00ee\u0089\u0096p\u00efS\u0005x\u001a\u00ed\u009d\u00bej3\u0081\u00bfe\u00e1\u0090\u008b\u00c9N\u0003X\u0014V\u0016-\u00a1\u00b1\u00b1p[u\u00e4\u0099\u0089\u0017\u00d1\u0004\u00cb\u008a\u00ca\u00f5\u00b8\u00bc\u0085\u00d6\u0080\u00f3\u00c9'\u008bQ\r\u0088pCo\u0093\u0002\u001a\u00fc\u00da\u00de\u00d6U\u001a\u00fa\u00ca(>\u00fb\u0095\u00cb^\u0091\u0001Z`\u00b1\u00c2.\u00d3\u00f9\u00c3PX\u00e4\u00f6R\u00da\u00be\u00cd\u00d1a\u00cb\u008aA\u00af\u008d\u00a5}\u00d3Y\u001c\u00b4\u00c9\u00d7I\u008d\u00a2\u00bf\u00db-[{\u00f9\u0015Nj\u00de\u00d4\u0001)]{K[\u00d7\u0091\u009a\u0016\u0099\u008b\u00fd%\u009f\u00da\u00cby\u0089j\u00a2|\u00a4 \u00e3j\u00feL\u00ee\u0010\u00e8\u00e3\u009a\u00df\u0017{Z}\u00d4\u00da\n\u00c4\u0010c\u00e4\u00f9\u00b4r\u0003\u00a50\u00f0\u00ca\u00fd\u00bb)\u00ad\u001cO\u00aeK\u0080h.\u0094\u00be\u0086^\u00c5\u0010\u00bc\fEh\u0019\u0019\u00d8\u00c2\u00c7\u00a0\u00a1\\\u00dfx\u00dcL\u0012Y\u0089\u00e7\u00a1mDX\b\u00c1\u0015\u008av\u0002\t\u00db\u001a\u00a5E\u00df\u001f\u00cdg1\u00a2\u00bf^\u0002\u00ce':m\u00dd\u00e0\u00e7?D\u00c5!\u00ab\u00bdL\u00b2\u000e\u00b0\u00e1\u0018\u0014\u00cb\u00db\u0095\u001d\u00ae\u00cbA\u00abP\u00c1\u00c5\u00b5t\u00efvH\u0004\u00b0\u0099b\u00021 P9\u009e\u00bctO\u00d0\u001eF\u0000z`\u00ae\u00c2ra\u000bs;\u00e8Fj\u001c\u00ab\u00a9RX\u00ec\u00d7\u00b9j\u00f5Hs\r\u009e\\\u00a1$<\u009e\u00cd$\u00bbT{fC\u00fb2\u00c7\u007fT\u00bdw.\u0098\u00fa\u009c\u0013\u00d7\r\u00bb\u00ec\u008c\u00bcz\u00c2)\u00e5\u00bd\u00f8\\&\u00a6\u00e9\u00fa3\u00a4\u00d4\u0005\u00d4K\u001c\u00b0v\u00fc5z\u00f76\u00d9&\u00c7\u00ba2U\u00f7\u000fk\u00ad\u00db1\u009b\u00de\u00b4\u000b\u00fd\u00c8\u0083H\"elk\u00d3\u00d4\u0014\u0087\u000e\u00e7\u0084x\f=\u00e4\u00eb\u00c3\u00ec\u00df\u00c7 $\u00e1w?kr'b$\u00a3\u0006Mv\u00d8\u0014\u001a\u00a7\u0098?b\u00fbEw\tK\u00e6\u0013\u009b3!\u001c\u00da\u0014\u00d3\u00d9x\u0093\u009e!\u008ez\u00a2\u008a\u00e3k\u00ca|R\u00a8\u00dd\b\u00ec\u00db\u00b8\u00a4_\u00e0\u0093%n\u00cc\u00b14\u00cbPK\u0000\u00d3\u00d2\u000bmQ\u0092.wO\u00e4\u00bdZ\u00cf\u0003\u0000\u00b0\u00eey\u00d31\u001c\u00e3\u00a0<\u00e6\u00aa\u0005\u00de\tTw\u009a\u00b0\u00cb\u00ae\u009dq^\u00e2\u001c\u00ba\u0003\u000e63?E\u00e3\u00a2mF\u00b4X\u00cd \u00a8\u00b3\u0019\u00a2\u00bf/\u00bb\u00c8\u001a\u00c7_)\u0091\u000e_<!\u0018\u00ab0\u00ac\n\u00b9m#\u00a0-)\u00e4\u00a0C\u0088M\u00adV\u00f5\u00ef\u00afz\u00c2\u009c<@\u0085\u00f9L\u0089\u00d1\u0010\u000e\u00c6\u00a6\u0010Ye3\u00c1\u00b6\u00ce3\u00caS\u008d\t8\u00bb\u00eb\u00fd\u00cdPj\u00049D\u00f4\u00ad\u00e4v\u00d2%\u0099sx<VT\u00d5\u00e6\u00a2\u0099T\u0095g\u0084\u00c8I,\u00aa\u00a1\u00fe}\u00dc\u00af\u0095\u00ce\u00ad\u0006\u008f\u008a\u00e2oQ\u00bb\u00cac\u00f4\u0002\u00d5(~\u0001q/-y<\u001eA.(\u00d9\u00d0lGl\u0096\u000e\u00c7\u00f596\u00b33l\u008a\u0093cV\\\u001e\u0090\u00e1\f\u00da\u00f7\u0002x\u00f5\u0004m\u00ef0I\u009d\u00a1\u00ad\u00eb\u001f%M\u0006GD\u00bf\u009fIH\u00d3\u00b9\u00c5\u0006\u0001\u008c\"\u00a0d/\u00a3\u0090p@\u00b2\u00a8o\u00a11\u00942b\u00e6\u00d5\u00cc\b\u0013\u00ed\u00d3\u00a9\u001bU\u0001!\u00ce1#\u001f\u00b2\u00f7\u009b\u00de\u00e6\u00a5\u00ac\u00f3\u0086\u00142\u00c4\u00ce\u007fK\u00caR\u00c6\u00da\u00b8\u0017*S\u00f9>\u0089(\u009c\u00bf\u0019\u009e1\u00b3C\u00b8R\u00b1\u008d.\u00fbu\u00d7\u0081\u00fd\u009b\u00c9\u0098\u00d5t\u0095\u00ba\u0007\u001c\u0080\u00bb(M<&\u00b6\u00fb\u00c5:\u0097i\u0005\u008e\u00e2\u00a5\u00b6u\u0002\u00f4\u00db\u00d7\u00ab\u00c22\u0085V\u00e1\u00d8\u00a3\u00df)g\u000f\u00ec>\u00f0\u0018>\u00f2\u00c2\f\\\u00abl\u00e6?\u0099*P\u00e07JR*\u001bQ\u0088N\u00b0o>\u00f6V\u00b2\u00c0#\u00ff8\u000b\u00d0\u00eaB!2\u0092J\u00b8[@\u00bcs\u00dbf\u00cd\u009ee\u00e7\u00a5\u00fc\u0014\u001c\u009b7D2x\u0092&f\u00caXJ*I\u0006 C\u00f1\u00b0\u0081,_\u00ff\u001c\u00f0 \u00e9\u00fa\u0001\u00ba1\\c\u0016\u00c5\u00e8\u009di\u0082qP\u0089\u00b3i\u00fc\u00c0\\\u00de\u001au\u00f8\u00a9\u0012\u00a7\u00b8C\u00e3\u00b3\u0091O\u00f7\u0090YOXuL\u00c2\u00aeG\u0091\u00ef0!\u00a6wZ\u00c0[\u007fTn\u00eb\u0087;8r\u008d;\u00ac\u00ab@[eF6\u00ae\u00dc(\u001e\u00dc.\u00d9r\u00eeE\u00a1\u00f8\u00b0\f\u0015\u00f8\u00cfjj\u00f5\u009ee\u00bb\u00e0N]\rhy\u00e3E}\u00c1\u0003\u0098d\u0091p\bs58 \u009f\u00f9:\u001d\u00e0\u0096`\u0013H\u00b1\u00d3\u00f5\u00c3+6W\u0091\u00b3\u00c38\u00a7\u0011\u00cd '\u00a5\u00f7\u00d5r\u00ad\u009b\u008f\u00f3\\\u00db\u00e8{\u00bfg\u00b8'\u00aax:j\u00b1<\u0092T\u00996\u00e6\u0086zu;\u00fb9\u00a4Ei\u00c9\u00a2\u00da\u0003\r\u008eX\u0084[U\u00b8\u00de`\u00bd'W/\u0004Op\u0098\u001b\u009a\u001a\u00a2f\u00e3H{\u00d2\t\u0089;\u00a3=d\u007f\u0016\u0095\u0087*\u00b1\u0017\u00a1g\u00fa\u0094F\u00f8p\u00e6PF\u00fbO\u00b3\u000b>J\u00ef\u008f\u00b8\u0092\u008b\u0002\u00d1H\u00c7i\u00ecWSV\u00ed\u00938C\t#\u001a\u00df\u00b4\u0017\u00d1M\u00baX=<X\u00ec\u00e9\u00ff.\u00b5\u00ad\u0016+\u00a2\u00fd2\u00b3\u00b4\tm\u0000\u00fb\u00dd\u00e6>$\u00cbB{\u0004x\u000e\u0082\u00f9\u0086\u000fo,\u00c7\u00b8d\u00d2<\u00fe\u00b3?\u009f\u00b8\u00b9\u0097A6i\u0010\u009d\u00fc\u0002E\u0014\u00a9\u00b9\u001cJN\u00b0\u008c\u00af\u0080\u001d\u00e9\u00de-\u001d.a1\u00af\u00caH\u00a8?\u00bd\u00b6\u0082&\u0083E\u00f1\u008a\u00a4\u0085YF\u00c0\u00f3\u007f\u00a3\u00e3 \u00feS\u0085\u0094\u00b8\u00db\u00e9 \u00c4\u0016nv\u0018\u00ec\u0091\u00e6\u008f\u00ac\u00c67\u001bH\u00de\u00fd\u0092\u0013\u00d4 \u0085\u00ba\u0001\u0085\u00de0\r\u0010(3\u00c9i\u001d\u0012\u00a3\u00e8\u00bd\u00c4\u00eb2\u0017\u0010\u0003\u00de\u0092\u008b\u00a0\u0018\u00ae\u0012\u0092\u0000>m $\u00c0N\u00b8d&K\u009e\u0082\"#\u0001\u00de0u.ZT\u00ab&\u009d\u0094\u0080\u00a3*\u0096\u00f0DXUK\u0016G\u00ec\u0011{\u00f8\u0091\u00af\u00e1\u00bf@\u001b\u0012\u0006\u0010K\u0082%\u00cbo\u00f0\u0097\u0082\u0094i\u00dbl\u0088<oAz\u00f1\u001d\u0005\u00966\u00d5R\\M\u0098\u0000\u00ce\u0003\u00b9\n\u000bg\u00a2a\u0013\u0085\u00a7\u00c9\u0006{\u00e4\u00b1\u00ce,\".\u00b9\u0084\u00f4\u00bfA\u009f\u008c\u00ba_*\u0082\u00a5=:qo\u000b+\u00eb{\u00c4\u00d5[.F\u00fa\u00fb\u009cm$]OO\u00f9\u00a4\u0004\u00ec\u009cy\u00dd\u0014;\u008b\u00e5\f\u0092\u00c7\u008a\u00ed\u0006\u00b7\u009d\u00da3\u00cc\u00af\u0007$\u00ce\u00ba\f\u00ee\u00b5m\u00ec\u00f7O\u00f8\u00fc^2\u00ec\u00cd\u00d7\u00c1YEu\u00bf\u007fh\u0089[wF\u00b7\u0012C26\u008c\u0091\u00baI^\u00ee\u0010O\u00das\u00ba\u00db\u0099\u00c2S\u00a2cK\u00e60\u00df\u00bd\u00a16\"%\\\u000b\n\u00fe\r\u0082\u0005M\u008e\u00ad\u00c5\u00dd\u0088wI}d\u0098\u0098\u0019\u00ee*\u00c8\u00b4\u009c\u0012/-<\u009d\u00f9\u00a1\u0017)8j5!\t\u0091\u00da\u00dd\u000f\u00aaa\u00b9\u00c8!Bd\n\u00bd\u00cb[1\u00d6!_\u0007\u00dcN\u00ef\u00db2\u0003\u00ff\u00d4\u001a\u00dc\u0006\u00e90x`\u00c9&5}t\u0004\u00b76\u009b\u00e8d\u0005K\u00c9q\u00b2\u00ac\u0093\u00d9\u00f5*\u00d0t\u0087&%\u00ea\u00de\n\u009d\u00ee\u008b2uu\u00f4\u00ef\u00ad\u00b1\u0007L\u00e7X\u008c\u0000\u00ccI\u00f0\u0016i\u0010\u00a5\\\u00b8Y\u00e6\u0011\u0083\u00b1\u0000 \u00ca\u00fb0\u00f4py\u00c0\"\u0098{u'p\u00a7\u001b<\u0091\u0000k\u008c\u0014\u00c0\u00b9\u008d\u00d0\u00a1\u00beoM\u00eb\u0090\u0083\\\u00f4c\u00b2\u00d6\u00c0?{\u00a3\u00f71\u00cd\u0007:\u00bc\u00ef\u00e0\u00bb,\u00f0\u00a7\u00df\u008d\u00bb\u00c8>)D\u000f<_\u009c\u00c7\u008f`/\u0000\u00a5\u0093\u00bc=\u00f2o\u00cc\u00ab\u00a7\u0007\u00b0\u0011(4\u00a5\u00a8^T\t1\u00a9v1\u00b8!\r\f\u00aeG3]\u00c6\u00b0\u008a\u00d9\u000f\u009d{d[\u00cd$\u00ff\u001a\u0002\u00ce\u00ed:\u0099\u00ad=N\u008em9z\u00fcf\u00d60h\u0001@\u0005fkf_\u00e5\u00fa/\u0000c\u00c69\u00c3\u008a\u009c&\u00dcX\u00ddN\u00b7\u00bc\u0097\u0006L\u00e7/\u0003\u00f8A>\u00fd\u00e1\u0082I\u00ad6\u00e2\u00f6\u009d\u00f4\u0085\u00c87\u00a1\u00ee\r\u00de\u0086\u0015v'\u00e4`\u00b4\u00cc\u00ea\u00f9\u00c53\u0081/\u0097\u009e\u00ccP\u00d5\u00bdb5\u00dbDr\u0015\u00b6\u00d2qz\u0013z\u00af\u00ddC\"\u0013\u00bce\u009aU\u001f\u00c7g\u009d7\u00fd\u0090\u00e1\n\u00b8\u00b3\u0006.\u00f4Y.g\u00bd|F\u00dc\u0012\u00e4\u00e1A\u000f\u0016P\u0003\u007f\u00f4\u00f9\u00de\u0003\u008b\u00e1\u0092/o\u0011\u000f\u0097\\oDO\u0014B\u00f91(\u0002\u00f9\u00c9\u00b1\u00e4\u00ab\u00a7S0\u00c04\u00cei4\u00f16\u00d6\u009bl\u00dc|\u00bf\u00f7\u00c3\u00fe\u00c3,T\u00a7\u009c\u001d\u00e1\u009c\u0080\u00f8\u00a0\u0095\u00baN\u00cef\u0005\u00b7\u0095\u009bp\u00bc{\u00a8D\u0088Y\u00e3c\u00b4\u00b4t\u00a9:~\u00e8\u00aaZ0\u008e\u00fb\u00feLY\u00d5\u00b3\u008f\u0092\u00b2\rm\u00ef[\u00b4S\u00d3\u00c5T\u00aeq\u0093\u009b\u0086{\u00bc.\u00ff\u0002T\u0017e\u00b6\u001ek9 v\u00dc\u00f8\u00d2\u009c\u00b8\u0001D?\u009a\u008b\u00a7\u0001x\u00b7<kb\u00caO\u00a15GF\u009a\u008b\u001e\u00e5\u0005\u00c1\u0018h`\u00ae\u00f3\u00f7\u00ff1\u00b2\u00aa\u00f0\u00d5\u0016\u0007\u00a4\u0005\u0011\u00db\u00da\u0087\b\u00d7V\u0002s\u00bb\u0011\u000e\u00a6\u00e8\u00c2\u00b8>\u00bbps\u00f7y\u0091i\u00c0\u00fe\u0006n;-\u00ab\u0092?\u00aa\u008aH\u001b\u00cc\u00ed\u00bf\u001b\u00c99CV\u0015\u0019Pb6!\u00e0@Mv\\\u00c3\u00b7\"\u00e1\u00ef\u00b57\u00ed\"\u00ef\u00aa\u008aX\u0016\tWJ\u00b8\t\u00d7W4 \u00d0_S2+*G\u0019\u00bc\u00c7\u0092@\u00c7\u00b0\u00c2S\u00f9\u00bf!\u00fd\u00cd[\u00f0DW29\fvy\u007f\u00c3Q)\r\u0081jh1!\u0096\u0004Ao\u00fd\b\u007f\u00a85\u0096^\u0012\u0084\u00f6\u008e\u0081\u00a2R\u00fcO\u00e1\u000f\u0003J\u00f6\"\u0016\u001b\u00d4 x\u008fN\t\u0084\u00b1\u00e5]\u00be\t\u00b6>\u0098t\u0005\u00f0\u00f7\u00e1\u00b9K\u0006\u00fb\u00b6\u00b79\u00f5L\u00de\u0093xU\u00a2\u0019iS_\u008c\u00afS\u00c6\u00b9:{]\u00e8\u0081\u00e7\u00f8T\u00a3#b:\u00eeR\u00bdCB}`\u00a1Gc~\u0080Y$\\\u00ac\u00fc\u001b\u00a0\u00cfV\u00c2`\u0019q\u00c6\u00b1\u0010\u009dY1\u0006\u009c\u00ba\u0099\u00b0\u00a8m)I\u008ev\u0018\u0015\u00bc\u008c\u001a\u00fb\u00cb\u0003\fh\u001a\u00cb@\u00e4\u00eaq\u00afm\u00ca>\n\u00be\u0012\u00e9%\u00fd\u00b8\u00f1\u00e4\u00b8Q\u00abb\u00e0V\n\u001a=\u0099\u000e\u00fc\u009d\u0098\u0089y\u00b0\n2\u00ff\u00f4\u001d5T\u00b2\u009f0X\u00a4\u00c0C\u000f4&Q\u008dt\u0000\u0011N\u0081h\u008a\u009e>EO\u0002\u00ec\u00b6\u00fb\u0092\u0094f\u0014s\u00d6\u00e1\u009a KG*u\u009f\u00ac\u001a\u00a9\u0004\u00ec\u00b7\u0084|\u00d7\u00d5t~\u0015\u00f4\u0019\u00fe&|\u0006\u0085*D\u00d3\u00c1\u00c8\u00d3b\u0019\b\n\u00be\u00c9%\u00e2nL\u001f&[\u0094\u00cf\u00d2\u0007\u00edB\u00e9\u00ff\u001e$\u00c0d\u00e1\u00a8C\u00b3K\u00caE[X\u0013\u00c1\u0006&\u0083\u00ba>\u0096\u0092\u00be\u00f08\u00d4\u00cd:\u00efP\u0080F,u\u00e5A\u008c\u0005\u0001\u00cb\u0086\u00be\u00fb\u0011\u008c\u00ef[\u00c7\u0003\u009fJ\u0014\u00d0\u008c<f\u0007\u00e4C\u00db\u00c4\u00a8\u00e1S`\u008a\u00af`\t\u0013\u008f\u00a2\u0090O\u0015Y\u00b4\u0014\u00b4.l\u00a22F\u00d9G\u00873\u00bb\u009b\u00ea_\u0004\u00a3\u0099';\u000el|\u00c9\u00dc{\u00930[\u00df\u00d1\u00ee\u00a4\"\u0088\u001c=@,]\u00c7\r8\u00f0\u0015\u00b7B\u00e0\u00e0\u00e3]\u0093\u00d2p\u00ad\u00c6.Ov\u00c3\u0091\u00c9v#\u00c2\u009c&\u000f \u00fe\u001b0&\u0092a\u008a\u00e1\u00fc\u00b99\u00c5\u0003X\u00cb:\u00af\u00e4\u0088\u00ca\u000b\u0007\u00d5\u0016\u00cd+\u0006T\u00f0I\u0087\u0002\u009a.\u0011\u00bd\u009e;\u0001\u00a7d\u00dd\u00d5\u00d7\u0011\u00f68z\u0017$:\u00d3X\u00f9$\u00fboB\u0018w=\u00b24\u0091\u00b2'\u00dc\bJ\u00ea\u00d7\u00e0\n\u00f6\u00cb\u00ed\u00f7\u00e9\u00f0 \u001f\u00bc\u00c9\u008a\u00d49\u00f0\u00ec1\u0007\u0085p\u0093\u00af\u00b1M6\u0001\u00bb\u0089\u001d\u0007\u0010\b\u0085.\u00b0\u0087\u009c6\u0083-\u00a9\u00c2\u00ac\u00eb\u0017*\u00c6\u0011\u00ad&P=\u001f!\u0001;dQ\u00a7J\u00cb\u00d6\u00f9T\u00b4\u00e9\u000em\u00f8'\u00d2\u009e\u00aaG\u00d6\u0093\u0003\u000f\u008bs\u00d7\u00ab\u0019>=\u00ad\u00ddm\u00caB\u009eh\u00f3R\u0000\u00d0v\u00b8\u00f40F\u0015+\u0085\u00b5\u0083\u009a1\u00bd\u00e6E\u008d\u00133&s\u00ba\u00d4\u0015\u00af\u00e0N\u0090\u00f0n`-v\u00e4\u001e\u00ca\t\u0083\u00faHE/s\u00e5\u0019\u00fb\u00af\u0088\u00abj\u0015z3\u00ad~\u00b2\b=ow'\u00bcz\u0089_3|\u008el,^M\u008d\u009c\u00a8\u0082/\u00b6<\u0097\u0085M\u00bb\u00d9\u0089\u0011AB\u00e7H7\u00a9\u00c6\u00e1\u00ae\u00028\u00fc\u00bf\u001fX\u00df\u00ef\b\u009d}\u0004\u00b7\u00a0\u008e!z\u0003\f\u00f8rn\u0083oIb}'i@\u00ce\u0000\u0005\u0014\u00ef\u00a9\rA\u00d7\u0097\u001b\u0098\t\u0093\u00d6/{\u0013\u000e\u0093W\u0000B\u0014}\u00f4z\u00d26^\u0092\u009ef\u00d6\b\u0004!\u0080\u00a9\u008c\u00a4\u00c1#\u008b\u0001Xa0L\u0081\u00fe?\u00e7\u0001\u0086\u001c\u008b\u00b6t\u0091\u00ce\u0017*\u001f\u0089\u0015\u00e6U\u00db\u00f71\u0091Py\u00e9h\u0002\u00dc\u00deq\u0083\u00ffu\u001c\u00980\u009f\u0081\u00a3\u008d\u00f16O!\u00ed\u00e8\u00f3\u00e7\u001bDQ:\n./\u00c5\u00c1\u0000(t\u0080Y\u0099O\u0097]-\u00ba\u00be\u0001\"\u00f4[\u00f9\u00df!\u0007$\u0002-k\u00dd\u0087\u0019t\u0090\u00c0\u00a6lMb\u00e4\u0086\u0089+\u0084$h\u00a9\u009b|!\u00a8\u0007c\u00ccmuw4\t\u00c7\u0082+\u00bf2?U\u0091\u00dfR&Ov\u00ee\u00b4\u00de\u0010\u00dd[\u00b7 %Pl\u00aa\u0004\u00fe\u00e7\u008a\u00a8\u00a7M\u00b5\u00a2V\u00cc\u0098V\u0001>\u0093Lx\u00b9s\u00db!\u00c6\u00eb\u00cfB\u001d\u00abyU[\u00abH(\u0094hx/7\u00f9\u00c8_\u00bd\u001a\u00e1q@\u00a9anm\u00fa\tr\b\u008e\u00da\u00acP\u00aa\u00ba-\u00f5\u00a9\u008e7oF\u009d\u00c6*r\u00d2w\u0085\u00e7c\u00fb\u001eS8=m\u00d420q{\u00c3\u00e4\u00e9a~xAt\u00a9\u0099>\u00c479\u00c1a\u00b2\u00e2b\u0081\u00b7S\u00b0\u00d1\u00f4\u00a6-\u00d9\u00bc\"\u00f3m\u00d7@\u00d9\u00075\u00f9\u0001\u008f\u0013;\u000b\u00de\u00a3\u007f'TY\u00e4\u0084KF\u00d2\u001b]\u00ddp*\u00c1\u00ce\u0096\\\u00e6\u00cf\u00dd\f\u001f\u0016\u0002\u00f5\u00fbZ_\u00b3Z/_\u00d4\u00952B#~B\u0083\u00c3\u00e09\u0087\u00a8S\u00f0)\u00a2C\u00e0\u00d6G\u0003\u001f9.\u00d3\u0086,\u00f7\u00f2\u009e-\u0089\u00f2\u00deg\u00e2<\u00fa\u008d\u00c0\t)z\u0086C\u0011K\u0005K\u00c5\u0080\u00a6\u00ee`i\u001e\u00a2\u00b7\u00fb XT'\u0090\u0016\u00ff\u00d4\u00e6\u00ab4\u00a8\u00d8\u00a7cKt\u00f7\u00d5\u00fc6\u00c4\u000f\u0001\u00ab\u0017\u001b\u009aX<\u00fd\u00f8\u0014d1\u00801\u00ba\u0010Q(\u00eb\u00e8\u00c9]\u00a7k\u00d5\u0006\u00f4.8\u00f0y{\u00a0\u0097TR\u00f3km\u00cf*\u00e91\u00b6\u00828\u00b8\u001c\u00dd\u00fa%=.x\u0002\u00d9\u00e8\u0010\u00deW\u00ea\u00cf\u0095\u00e3\u0000\u0091\u00ae\u0080\u009f\u0006q\u00d8\u00e3\u00a2j6X\u0013\u00aaT\u0018\u00a0\u000e\u0002\u00dai\u008ai\u00ad\u00e3\u00f4\u0018\bRy9s\u009e\u00e0g\u00ac\u00f8\u008f\u00c7u\u00b9\u009e\u00aa\u0091;\u00f2\u0093\u008e\u00ea\u001d\u00cb\u00e4Wu\u00e5\u0007\u0001|@\u00c4p\u00f4\u000bX\u0003A\u00f9'I\u00ebl)\u008d\u00c6\u00d3\u0000\u00f5Z[9\u0001@\u00cb\u00d4\u00da@\u00c3\u000fx+\u000b\u00a0\u008b\u00a3\u00fc\u00f5g\u00d1\u00f6\u0082%m\u0088\u001f\u00866F\u00ef\u0084\u00bd@\u00a6\u0006\u00eee\u00a4\f\b\u00d6\u001f\u00d5\u001a\u0085\u00fc9\u00a0\u00e6\t@\u00fb [fA\u001f\u00e0\u00bd}\u008cn\u00db\u00f67\u00a2\u00ca>\u0081\u001bV]\u00fe\u001e7\u0099D=DC\u0090\u001f$g\u0086\u00868M\u001c\u0006\u0014\u00abm\u00edFi\u00d5\u00b3\u00d7\u00aa\u0011Y\u00ba\u0001pa\u0080\u00d8A\u00d1\u00ae\u0086\u00c3\u00b8\u0010\u00bc\u00a8\u00feU\u00b5\u00db\u0088\u00c1\u0090\u00d1\u00f0z\u001d\u0086\u00e3z\u00d0\u00de_\u00eb\u00aa\u001c\u00b2!\u00e9Q\u00db\u008ccD\u00cbN\u00ccn5\u009c\u001d\u00a1I\u00a2\u00bdQ\u0090\u00cd\u00d1\u000fR\u00a85\u00f2\u009e\u00d9:\"*\u00e4\u00b1d\u00a0*\u00fc\u00cd%r\u0018\u00a4\u00baE\u0097\u00e5E\u00e1\u00fa0\u0003\u0016W\u00ea\u00c7h\u008d\u0013*\n \u00be\u008f\u00f2\u00b97.\u00fa\u00cc{\u00bc\u00ab/v7\u00a3\u0098\u00d9d\u00a7\u00ef\u00b8'u\u008d\u0091\u008e\u00db\u009b\u009aQ\u00f6\u0098\u00850\u009c\u0087E\u00da\u00b6\u00043\u00a5\"\u008dj\u0093\u00e7(\u0083&\u00e8\u009d\u00d7\u001a2F\u00f0\u00f5\u00d0\u00e3\u00eb\u00e9\u00f2\u000b\u00b5\u00195\u00b7\u009eK\u00cao\u00a2\u00ac\u0087\u00ee\u0011\u00b0\u001a\u00c4\u0098\u00ff\u00f5\u00e2\u008c\u00db\u00e2!\u00cc\u0097\u00da\u001c\u00ec\u001a\u00b5\u00af\u00fd;\u0005\u00f2\u0085\u00d6\u00c2e\u0001\u00e7\u00b7\u0012\u0089\u00b5\u0095\u00c0\u00f2\u00ec\u00b6\u00ea\u00bd\u00f9r\u00fb\u0007\u00b9g\u00f0k'd\u0093B\u00e05 Nt\u00b7\u0016\u00e3\u0090*\u00c7`\u00d8\u00f3\u0014\u00d2\u00f1A0\u00fbY\u00cf\u00df\u00d0\u00a8\u00c2\u008d;'\u00d09\u0015\u0091\u00f9\u00c6\u0012\u00af\u00bf\u00ae 9\u00efB\u00c5\u00b3?\u00cc\u00bf\u00fe\u00ba^Ao\u008c\u009cy\u00b7\u00bd\u00ea\u00d6\u00e1\u00f1\u0013\u00beLn:\u00f6s\u001f\nimsG\u00e61\u00f6:\u00e00\u00e3\u0003\u00e7:\u00f9T\u0016U,v\u00b4\u0012b\u00e8\u009e\u00d9\u000b\u00a0U\u00fal\u00d2\u001e\u0086\u00e6o\u009b\u0094\u0083\u00b0;^\u00e2\u008e_@2\u009fd\u001c\f\u00df\u00b9e\u00c6YE\u00c3k7\u0086\u00a8Y`y\u00f2\u0086\u00c7xB\u00efT\u00a7\u00927\u001b\u00b4h\u00f3\u00ea\u0084\u000f*5\u00e8\u009d \"0\u00aco\u00e8\u000bfV>\u001a\u00de\u0094F\u0099\u0003P\u0098K\u00b8\u00a0+\u00d2f\\1\u0013\u00ee\u00b0\r4\u001f\u00a5p\u00b7^aE\"\u00da\u00a9\u00dfjP\u00d4\u00fc\u008e\u00985t\u0018(I\u00c1\u00aa\b\u00ff\u008aE\u00e0\u00ae\u00cb\u00a0Q?K\u00e6\u00b2\u0016J-\u00d3\u00b8R\u009c\u0017$u\u00d0\u009b\u00db\u0012\u00a1F\u00c6{\u00d7\u0099\u00f3\u00c7\u00bbL\u00f1dM\u0010\u00e0'L\u00d9\u00f1\u00dc\u00f1\u00cc\u008c\\\u0017wv\b\u0014\u00b5z'\u00e1^S\u00de\u00db\u001ai\u00b9\u0014/\u00c5\u00f7\u00a1\u009e\u00b7\u0095\u00e8\u0019$\u00dc\u000b\u00f7\u00cb\u00a3NA\u00f3\u009d\u00daq\u00f9\u0082\u00a7d\u0006\u0001\u00f9\u00e2;\u0006S\u00e6\u00a1\u00danX\u0003\u0086\u00bd|$\u0013'H7\"\u0096\u0001YT\u0005s\u00ebs\u00ca\u009d\u00df\u0015\u00f4\u00c1\u00b7\u00c87s3&OMLsB,\u00df\u0017\u00c4\u009d2\u00d8R<8\u00ae\u0090'f\t\u00ee\u008fM\f\u009b\u00f8\u00d3\u00d5\u00efl\u00c8\u00ba\u0018\u00b6\u0001\u0005Xl\u0084\u00be*\u00ad\u0013z<D\u009d=\u0080`1e\u008f[H\u00cb\u0002Vq\u00be\u0017ch\u0011\u00a9;\u00d9\t\u00daO\u00db,6q\u00df\u009ed\u00af\u00b8'{\u00e6\u0005\u00ab\u00d4\u00cb\u00f4g\u00f2m\u001d<\u00d2\u001d\u00d1]i\u0010&\u00cf\u0015\u008c\u00d9\u00c8\u001a\r\u00cf\u00a3\u009f\u001f\u009f\u008a\u001e\u00d4!S\u00c5\u00bem\u0085+\u00b9\u009a\u001f\u0081\u00d4\u00c6\u00d1\u00d87\u00c1M\u008e\u00f3\u00a3\u0012\u00f1eha\u00c2b.Ft\u001c\u00eb22\u00d7\u00ba\u00dc\u00baKn\u00b2\u00c2\u00a8\u001b\u00d3/R\u00b4!\u0087l\u00a0i\u00e8V,\u0088\u0089\u00e3I\u00b0=\u00991\u0016\u000b\u00bb\u00e5D=\u00d6$3q\u001a\u00cb\u0091\u00c2\u00a2\u00a4[H^\u00bds\u00f3\u00de!\u00f7[~\u00b2\u00f9\u00b3\u009f7\u009c\u00f7\u00faNi\u0010\u001f\u00e8:\u00a1\u0088\u0095z\u00a9GYB\u0090\u00d1\u00eb[\u00e7&\u00a1Ix+RK\u00b9)jA\u00b1 \u00e1!\u00c0\u00f1\u0088e\u00e2\u00e6[\n\u00b0s\u00e2V\u001a\u00ba\u00a3\u00f8\u0081`r^\u00bbVA\u00f6\u0094\u0083tN1b\u00d7J\u00f7F\u00bd!-\u00a7\u00c2\u00a1\u00a2\u007f\tO\u00ac\u00d3s\u0004\u00b8\u0092\u000f&\u009e\u00dc.K\u0094\u008e\"vi\u0000\u00c4\u00b6\u00b1\u00e5\u00f4`\u000e\u008e\u00b5\u0083\f\u00b65\u00cb%h\u00fefWl|\u00ee\u00a2%\u00b6\u00dc\u00e3\u00b1\u00ecB\u00b8\u00ce3\u000b.\u0092\u000b\u00eey\u00c1\u00ba\u00b8R\u00a8^/\u00e0\u00c6X\u00dey\u0006\u009a\u00a3\u00c0\u0087\u00a6\u00a34\u00ca\u0014F\u00cb\u00f8\u00ea\u00a0\u00ae\u00fd\u00adVL\u00ad\u00df\u0089\u00e8D\u00a51p\u00edn\u0085\u00f3]\u00c5\u008c\u0091$ZY\u00ee\u00b5\u00b0\u00ab\u00b3\u00bd\u0004\u00da\u00d6\u00de\u0092\u0090-!\u00b2\u00c8\u00c6\u00bf6C\u000b\u0096WB\u008f\u000e\u0002a\u00ef\u0016\u001c\u009c\u0002H\u001d-e\t\u00aa\u00eeM\u00ae\u0081\u00e7\u008e]\u0090\u00b4~o\u0091\u001d\u00bb\u00dd\u0081\u00b0E\u0096\u008eCRD\u00e7\u0099\u00fa\u00bf%\u00f51\u001a\u001d\u00d0\u0095>2P\u00d8\u00aeG\u0016\u00ca\u00d3\u00db\u00d6:G\u00ca\u00c9\u00fa\u0095\u0099n\u001a\u00bb\u008f\u00e2\u00a1\u00fb\u0080\u00c1c\u00f3/f\u00c2\u00ea\u0083\u008dq\u0002\u0014\u000e\u00f2\u0002\u0093O\u0016L\u001b\\B=\u0003*\u0081n\u0001\u0011\u0013lj\u008e<\u00f9qk\u00ea\u008f?\u00c2-\u0004h$\u00d9'\u00b6\u009d\u00df?T\u00186\u009c_\t\u00c6\u00ac\u00d7\u001by&\u0016x\u0092\u001a\u00ea\u00f9\u0092\u00f9\u009d\u0093\u00a3\u00f9@\u00b9\u00bd\u00f8\u0092\u008e\u00a9\u00ce\u00dbU*W\u00b3+\u00f18\u00c2P\n\u00b8\u00c2\u00c6\u00c4\u0016g\u00de\u00d2>w-\u00f9\u00e0\u0091\u001c\u001c\u00c9kg\u00f7#k\u00ba\u00b6L\u00e85UNt\u00ef\u0016\u00b9\u00fd\u0001\u00b8\u00ff\u00f8my\u0006S\u00f8yhGi/wFF\u00ff9c;\u00cd\u00a7\u0016\u00b2\u0011\u008d\u0004A\u0090\u0010^`\u00d9\u00ecy\u0001\u000f\u00f0@7,&\u00a1\u0094j\u0096\u00b0\u00d9\u0088Gb\u00a3\u00b4'\u00de\u00f5\u0003\u00d1\"\u00c3\u00eb\u00deq)T\u00bb\u001e\u00c1\u00abs\u0086f+Z>-~\u0081{]z\u00b9I5\u00bc\u00efE\u00de\u00e4\u0081\u00e3)\u00afua\u0088Ux\b\u008f!\u00e5\u0001\u0005\u00b3\u00ee:\u0006P\u0014\u0084:\u00e0\u00fa\u008a[?\u0093\u00f3\u001e\u0096>\u0011#i\u00f2\u0095D\u00f4\u0090w\u00bdl\u00f1\u00ae\u00a8\u0007\u00ca\u00bbEy%\u001f\u00a3\u00a9[\u009c\u00f8\u00dc\b\u0007\u00b4\u00e6+\u008b\u00bd\u00eb\u00df\u0094~\u00dbO\u001e\u00bdu\u0091\u00ddn\u0003\u00cc\u00b5\u00b0\u0095\u00b6\u0088\u0081>\u00d9\u00da\u0011\u00f2\u0088\u0011\u00a6\u00e1~\u00b1v[t\u00ec\r\u0018\u00e2\u00d3\u00f7U\u0095&\u009c\u0001\u00cd\u001a\u00bce#\u0092\u0010\u0084\u0019\u0012\u007f8\u0007\u001e\u001d\u00c8\b\u00b2R[\u00cfgT\u0007k\u0091y\u00c7\u007f4\u00a9YBc6\u009er\u0094\u0018\u00dd\u00a2\u00e9b.I\u00029\u00b3f\u00d7\u00df/'\u0093\u0014\u000b\u0083sy\u001c\u00e85\u00f1\u00fa4\u00ed\u001b}\u00ea\u0000\u00e5\u00d4\u00e1[,w\u0007r\u0089U\u00e9]J(LO\u0081,\u00b4\u00fa\u0091.\u00fb\u00df$\u00fd\u00e1\u00b7\u00e1\u00c8\u00d2\u0093S\u000b\u008c\u0002\u00f0\u00aa\u00d7W\u00f5\u00da\u00ee\u0019d\u00f7_\u00b0\u00ee\u009f\u0005\u00bba\u00a83\u00f0\u00cd1\u00ef\u00b2_I+^\u00c6s\fa}4 \u00ed\u00a0\u00c9\u0001}|\u0006\u00ae\u00b8\u009a\u00df7\u00fc\u0006\u00c2v\u00b3\u000f\u00e8\u0004;d\u00e0\u00b2\u0001\u00aa\u0096\u00de\u00c2B3\u00e6\u0001k\u00bfD\u00c6\u00b9\u0086\u00f5\u0094\u0012\u00fbX[hF\u0016\u00c73\u00068$\u00de@E5\u0083i5\u00f3\u0007\u00b4\u0000\u00c4\f\u009c\u00f6\u0092\u00c8\\\u0012\u00ac\u0013\u00a6\u00c1\u00a5t!\u00c8R\u000f\u00abn\u00e9\u00d6\u00d1q\u00fc\u00ac\u00ff\u00d5\u00d0{\u0001\u00a1\u00a4\u00d5e\u0013!\u00a6r\u0084\u00bf\u00e7z\u00bc\u0006\u001d^\u0090\u00e0\u00d9om\u00f5\u00b3:B\u00dd`?^r\f\u00b9\u001bv+\u0099\u00dat\r=\u0016f$\u0098X\u00fa\u00b9\u0084_T\b\u00e3\u0092\u00b1C\u00b7\u0013-\u009a\u00d1\u00d6\u00fb\u00e9Eg\u00d3L\u00c0\u0003\u00ce\u00d2\u0097eY\u00f1\u00be\u00d2\u0095\u00f0\u00ba\u0007P\u00ab\u0097\u00ea\u00f3\u00c0\u00ab=:\u0097\u0083lF\u00c3\u001f\u0096\u00fc`\u0092\u00a1O\u00a4\u0095s\u00fd\u009eb=H\u00d3\u00f3w\u00a3\u00d4\u0018\u008a-Z\u00d6\u00d3\u00aa\u00eeU\u00a2\u00f8\u00df\u0090!S\u00c7\u009a\u001b\u0081!\u008bD\u00e0\u00ad\u00ef\u00fa1y4\u00bb\u00ac\u00ab([\u00db\u00fe[q\u00f0N0\u00a0\u00f3I\u00e9\u001b\u00ad\u0090-8\u00f2yL \u00ef\u00c5\u00bdaD\u0001\u00b0\u00fd\u00f9>\u00e8u\u0016k\u0013\u0003\u00ecs\u00e4\u00e1\u00feR\u0015\u00f389\u00d1\u00c3\u00bb'\u000er<\u00de\u00c9\u0093j\u001a\u0088\u0014\u008a\u00ef\u00df1\u00d61s\u001cdio\u0007\u0084`\u00e0\u00c4\u00da\u0091d}\u00da\u00ce\u00ab@\u00ba%i}(~\u0091v\u0086=\u00d9r\u0095\u00ea\u00f8\u00c1\u00b8N\u0081T\u0085\u00a77gMsE;v\u0014W\u00e6\u001f9\u001b|\u00f9hV\u0004\u001a\u00d9\"K\u00ff\u00a5V\u00de\u00ec:\u0019\u008a\u00e7\u00a8\u009aU8\u00edE.\u00e1\u0086\u00d6\u0019\u00d4\u0003;\u00d8\u00ce\u00c4j\u009eq\u0093\u008e8$\u0093\u00ac\u008f\u00b8vOg\u0017\u00b4\u00a7\u00bdS\u00d9\u00fb\u00c3\u00d2\u00e3\u001a\u0086\u00c3\u00aa\u00e2\u00f4~;>\u00b4\u00e0Q\u0012\u00fd\u0085i\u009f\u009d\u00fc\u008c\u00ea\u0010\u00ac%\u00ff\u0086\u009d1\u0010\u0017\u00be0[C\u009a\u00bfX\u0005_\u0092\u00c5\u00cf\u00ba\\g\u00ce\u00b0RPVx\"Ki\u00f2\u008ac\r\u00beO\u0010\u00bbG\u00fa9\u00ea\u00fa\u00f3\u00f1D\u00bbCmu4\u0002\u00e4\u00d5O\u0081\u008d\u00dc\u00c20,\u00ec\u00b1\u00d79U\u00dbr\u008a\u008e\u00d7\u00acJ\u0089\u0093\u00bc\u0000\u00ae\u00e1a\u00e6\u008f\u009dz\u001bU\u00b4d\u00eae1*|K6iS\u00c4\u0083\u0098\u00a5f\u00f1\u00f3\u009a\u0011\u00ac\u00a5\u00b2U\u00dd?\u0003\u0014\u0085\u001a\u00cb\u0081\u0090\u0082X\u008b#\u009c@\u0099_9\u00e67\u00fe\u00926\u00ee\u00a1}'\u00cd\u00fa\u00fb\u00f0T\u0006\u00c2H\u00fd\u00b9\u000b\u001c\u00d7\u00eewD\u0098\u00e9y\u0018\u00ff:\u00d4\u00d5\u0090\u00e1\u00ce7\u00cf\u00d6v$\u00efu\u00e9\u0080JA\\\u00a6\"B\u00a9z\tI\u00c9\u00c2\u00d2\u00c55\u00f9_{\u00a8\u00fe\u00ef\u000eLH\u0092\u0000N<\u00b5\u00a4z\u00a5\u00e9\u000b_\u00e6c\u0097\u00c7xL1\u008d#\u0084\u00947O\u0019\u00bc\u00af\u001bn\u008a\u0091[d\u00ab\u00fd3\u00967\u00da:\u00fd\u00f4\u00fa\u008c zV\u000e\u007f\u00a3\u009eefY\u00b3\u00a3\u00f9\u00dfL\f\u00aaM\u00d0\u0092\u008e\"B\u00c6\u0017CX\u00859\u0085\u0011MI|\u008a\u00af9y\u008f\u00f5w\u009f\u0090s\u00a13\u00cfB\u0084\u00c7\u00bc\u0086\u00c0$|\u00eb\bc\"ad\u00b6\u00a6\u00f0\u00ba%@\u0091\u00e2S\u0006^\u00ebXrX\u00d2\u0016\u00ced\u00f9y6\u00a4r\u00dc\u008cC\n\u00d1?\u000e\u00c3R0\u00e8)u\u0090\u009b\u0018m\u0088G\u00fd\u00a8\r\u00b5f\u009ev\u0091\u00e48\u00d8P\u001b\u00eb\u0092\u00ad\u00af\u0006\u00f8\u00a3\u00e1\u0001\u0018\u00ceq\u008b\u0084be\u00f6X'Bs EAY\u0093\u00a7\u00dcp\u000e}C@)\u00eb\u0082\u008e\u00fcV\u00ebm\u00b5\u0007\u008e\u00e8\u00c36\u000e\u00f5\u00ef\u0082-\u007f\u00e5S\u00bd\u00cf\u00dc\u00f4U2\u00dbOL\u00fbtU0\"\u00a8\u00dc\u00cc26\u00bf7\\P\u00fbS\u001e/S\u00e0t\u00f649\u001b\u00fb\u00de\u00cb\b\u0015\u00d2\r\u00baj\u00fe\u0094\u00cf\u0011\u00abc*\u0085\u0084Iv\u009c5\u0002\u00ea\u00b4R\u00a9\u00bf]\b\u00e8h\u008b\u000e\u00c3dn\u0080\u0082\u0006@+\u00ba#\u00f1\u00e4i\u00b0\u00dc\u00ea\u00d8\u0095e\u00fe\u009c\u00efTo\u00ae@Rn\u00a1\u00bef/\u008cY\u00c3\u00fd\u009f \u00ce\u0088\u00c3\u00f8=8G\u0006\u0015\u0095\u0002\u001d8\t\u00c5Hm}\u00b3\u00c8\u000e\u00d3\u0007\u0019\u0002\u00b3\u00e5\u00b5\u00b6N\u00d4\u00d8\n\u00b9m6\u00ad\"\u00d2\u00f4!K\u00bf.R:\u008d\u00dbA#\u00f5Ryb\u00cf\\^\u001cK\u00a1\u00cd\u00ef\u0018\u00aa\u0096\u001c\u0092F\u00b4\u0087\u00f0!6\u00cb\u00e6z\u009b\u0003\u00c8WB\tG\u00db\u001e\u00a5PT_\u00e7\u0094\u0092k\u00bfb\u0004\u00c9\u00d8\u0083\u00c1\u00a2\u0098\u0092f\u00d7\u00cb\u00ed9\u00d3&\n\u00da\u00be\u0010\u0090o\u00df\u0080\u00aa\u0087\u00db\u0095\u00b8~k\u00f4A\u00fa\u00efI\u009b\u00af\u0019~!Y<\u00fcK \u00d6\u00e6g\u00f7\u00e4\u0083\u0084J\u00d6\n\u00f9\u00cc\u00c5\u00c4\u007f\u0091\u00e2S\u001b\u0088%2{C\u00d9W#\u0012\u00b0'U\u00b7\u00e6\u00cb\u00c9R\u001fU\u0085\n\u00f0\u00c9\u0016\u0002B\u00899\u000eS\u0006\u00c1\u008e4?s8\u00e3\u008a\u008b\u00a5\u00886\u0012\u00eb\u00d2\u00a8\u00a5\"d\u008c\u0003!\u00db\u00baLk\u0015\u0081\u00ebp\u0018\u00d7\u009c \u00ad\u0084\u00a4B\u00cd\u00be\u00d4Y\u008c\u00e2\u001e\u0082\u001e,\u00b6\u008fQ\u00bas\u00b3\u0086\u00a6\u00dbR?\u00c9\u00df\u008e\u009eZ\u00973\u00ad(\u0007@v$:\u00cbD\u0082O%\u0083_\u00d4x\u00c8f\u00af\u0085@0\u001c\u00f0j\u00c5\"\u001c>h\u00af\u009ftY\u00dc%_\u00d2X\u00d5mH\u00beG\u0085y\u0013\u0093m\u0099TX\u001a\u000e\u0085\u00c5\u00d8\u00f3u\u00a5\u00c4\t\u00ca\u00af_G28\u00ec\u00cbv2w\"rM\u00b5+\u0081\u00b1z%\u00a3\u00185\u00df\u00aa\u00a92\u0017]U\\\u0098\u00c6)|\u00a2g\u00c0K\u009c\u00ef\u0001\u00b3Ux!\u0098\u00eaS]c\u0096\u00c5\u0091\u00f7\u00c3\b\u009e\u0084\u00cb%X)\u00c4\u00be\u00a4\u0019\u0093qt<\u00a7\u008b\u0012m\u00f3\u00cf'\u0089\u00c6O\u00ea\r\u008e\u0082\u00fc\u00b2}\u009e*\u00aa\u00ffG'\u00e7\u008b|\u0084\u00ce!Q\u00c0\u0002\u001f\u00e4\u00afq|\u009c\u001a\u0004\u00dd\u008cdsN\u00bd\u00df#H\u00deh\u000f\u00e6\u00ab\u0016\u0080\u0091\u009c&\u00ec.`\u0090\u00cdv\u00ce%\u00e5\u00b0\u0019\u00f8\u009e\u0093X\u00fbmY\u00b1g\u00c1\u00b8;\u00c0\u00c4\u0007\u00b8u\u00f1\u0002\u0093\u00c8tJ\u00cf\u00b7i)\u00c9\u00aa\u00d2\u00ab\u00b3Ow\u0015\u00eem\u008e3w\u0094\u00f5b\u00c1R<\u0003\u00b3_\u00df\u00d3\u000f`\u0013\u00c1\u00a9\u001e\u001f?\u00c0\u00d53\u0007\u0007\u0010\u00c8\u001d\u00db\u00d9\u00a4\u0097\u00ba\u00ba\u0099\u007fwt\u00c4[\u0002x\u00bbP\u00aay\u00a6\u00d8\u00b6\u00b1\u00b9\u009a\u0086\u00fb7\u0095*:\u00e7U\u00b3\u00e1\u00ab\f\u00dc\u00be\u0089\u00dd\u00e4\u00fa\u0080\u00f7f\u0010\u0018\u00df\u00e8\u00ce\u00f8\u00f0\u00a2}\u00d0i\u008e\u00e2\u00c9\u00d6\u008bO\u00ba4\u00af\u0084e#N\u0018\f\u00e2W'p\u00d5!c\u001d\u0012\u00bc\u00ee\u001b\u00ba\u00ca\u009bZ\u00fc0\u00a7v\u00c7\u00c4\"\u00bf\u0018\u00cc\u00ad\u009cp1m;\u00ea\u001fBH\u0087\u008c\u0094-\u0014\u00a5\u0004\u00c65\u0085\u00ce\u00a3X\u00b5\u001f\u0088\u00ff)\u00c5\u00d2\u00fc\u00f3d\u00bax@\u00fc\u00ec\u001f\u00a8S\u0098\u00c2\u00a8?~\u0010\u00db[\u00ee\u001a6\u00b0\u009c\u001b^)7\u00169}`\u008f\u00f2@\u008d\u00ca\u00d2\u00ce'G`\u00a0\u0083w\u00d77m\u00af\"H\u0003\u00a2h\u0092\u0082\u00ce\u00c2\u008c\u0012bI\u0094A\u00f4p\u00ecT.\u00b05\n1\u0084\u0012\u00ad\u0011\u00f5\u0012\u0086\u0012\u00d7\u00c7,B+\u00edD\u0005\u00f6g\u001b\u00c3\u0095\u00b3\u00e1\u008ax\u00a8*\u00f4\u00c1\u0087FY\u0081\u00c9\u00e6\u0005n\u00a2\u001ao\u008c\u0086\u00b2\u00c8\u0017\\\u00ba\u00f1\"\u00fe\u00a5\u00ab/j\u000f\u001d)\u0019\u008d\u0014RUK\u00e3\u007f=\u00eb\u00d2\t\u00c5\u00fd\u00d0\u00df\u00c9`\u009ed\u00f55\u00f1\u00ddD'\b\u00dc%q\u0081\u009a\u00cb\u009a%\u00fb3\u00ab\u00a2\u00ebF\u00c7\u00b7\u00c9\u0089\u0086.[\u00de\u00a0$j\u009c\u007f\u00c8\u00e9$&\u0085xQE\n\u00cbD^\u00c7\u0099\u00a3\u00a9\u00c6\u00b2\u0014\u008f$\u0005L\u00c0\u00c9\u00be}+\u0080lljq\r\u00c0M]\u0003\u00fd\u007f\u0007\u0000\u001b.A\u0080\u008f\u00bcb\u00eb\u00edA\u00af\u00ff\u0011\u00ab\u00b9&\u0015B@\u00bc\u00ff\u00c5\u00c6\u0080u7i\u00b6sf\u0089\u0011|#@\u0002\u008b\u00cd\t\u00e6\u00d7\u00cd\u0085Z6n\u00d8_h\u00d2V\u00de5\u0081\u00b02\u00c8>h\u0001?\u0007\u00fc\u00f6@\u00fbE\u00c2S\u0094\u00db\u0012\u00f8\u0017\u0000\u009es\u00fa\u00c5\u00a3#\u00d9\u00a2-~\u0083\u00bb\u00fd\u0096jXF\u00d9g\u008bQB\u00ca}\u0082\u00d0F\u00f6b\u001b\bNf`8\u0010\u00e4_B\u00f9y\u000b\u00a6\u008d\u0099\u0006\u0089\u00e37\u00df\u008f\u0006\u0099]L\u0084n\u0016\u00d1\u00c2\u009f\u00bcL\u00c0\u00a6l\u00ad\u0082uy\u0018\u00ea\u0084,a\u009f\u00bf\u00cc+\"'\u00d4\u0011\u00810\u008c\u00de\u00e5E\u00d3\u00a7\u00c4\u00a17\u0003\t\u0092\u00c97\u00fc\u00b2\u00e8x\u00e8\u0000\u0089\u00cd\u0080\u00fc\u00c5\u00b7r\u00ab{\u00df/\u00d6o\u00e4\u00f9\u00df\u00d6B\u00d60\u00ec\u001fq\u00b8\u009a\u00ad\u0081\u008d\u00f0\u00b6\u00c0\u00a7\u00cao\u00ef\u00a0\u00dcY\u0099\u00e3\u0007\u00b2]\u009c<\u00d8\u001c\u0007BE\u00a44\u00aa,\u0082\u0098t\u0012\u00c1\u0004\u00c7<\u0083%K\u008d\u00ec\u0012\u00fd\u00e4\u0007\u00deS\u0081}\u00e8\u000f\u00c8O\\\u00e2\u00de\u00ec\u00a3\u0096\u00c6\u00d9;\u000fA!\u0002D3W\u00cc\u0000\u00e4\u00125\b>\u00cbK\u00d7\u00ae\u00f0\u00c2*\u00fa\u00f5s\u0094\u00f0a=\u001c\u0019\u00a7\u00ae-\u00f1\u00eb\u0003\u000f)\u00f3\u00d2\u008bP\u00fe\u00fe\u00ea\u0099m\u0006q\u0093\u00b3\u0083\u008b\u00eb\u00da\u0004\u0090o_@\u009bpP(\u00dd!\t\u0084\u0092\u001a\u0090\u001ewM7\u009b\u009cG\u008fU\u00fd-\u00bd\u0082\u00e3C\u0012\u00bbu\u00e4\u00b2\u001b\u0085\u00b3\"\u0081\u00e4\u00a31\u00af\u00ee\u00ef\u00d4\u008c\u00bf\u00ac\u00d7\u00da\u00d3a\u00e9:\u009b\u00c0;\u00fe[\u008f\u00ce\u00d3s\u00aa\u00f0$\u0081\u001a2v\u0092(\u00cd\u00fb\u00f2\u0011vAb\u00cc.\u00c9\u00c9\u00c4\u00ca\u00a3\u00a5^z\b'x\u0095\u00cc\u00da\u00ac\u00a3\u00b0\u00ad\u00f4\u0087\u00eem\u000f\u00c2\u00f4\u00d1N\u00a9\u00b8\u00a5=\u00e4\u009aM\u00dc4\u00d6\u0082\u0088\u00ca\u0096\u00ee8\u0086\u00e6\u00c9\u00f1\u00f8\u00dd\u0016\u00b1\u0089\u00e7\u00db\t\u0000\u0011\u00a5\u00c5\u00c3X\u00b1u\"\u00aa]\u000b\u0004!p\u0005/\u00ad\u00ab\n\u009dy\u00b8\u00e5\u00eak\u00af\u001f\u0003\u00a5\u00c3xz\bq\u008f\u00ca}\u0086QV_\u0012\u00eb+U_we*\u00de\u00ad]X\r\u00a8\u0019\u001e\u00f7H\u000e\u00f2\u00aa\u00f8\u00d9\u00a7\u00ffB\u00cc\u00cce\u00cf\u00e8\u0002\u00b0\u0015\u0006\u009d\u00da0\u0089\r,\u0014\u000f\u009b.\u0092k\u00db\u0091o\u00bc\u0011\u0089D\u0016<\u0007\u00eaW\u00ed^)\u00ea\u009a\u00af\u00ac\u0091R\r>\u0002\u00f6\u0080\u00f6<Ur\u0081D\u0007V\u00eb-\u00af!\u0002\u00be\u00ff\u0090\u00da\u0086\u00d2\u0097\u00d0\u00aa\u00c1t\u00f5\u00bf\u00f05Sq?d\u00db$0\u00aeJ\u00b3\u0006\u00d2\u00db\u00ed\u0004oO\u0006\u0097\u0094l\u00b6\u00fb\r\u00f2\u00fa\u00f2\u00bdn\u00ce\u00fb\u0087\u0018\u00e2\u00bdSy\u00de\u0005t\u00c5\u0092\u00dd\u00d1 Q\u009b%<\u0004k\u00cf\u00e0J`\u009e\u0080\u00cb\u00f6A\u0002\u00ab\u001c\u0012c\u00bf)87\u0093\u00a7\n\u00d2q||}\u009cc\u00c2pRHWL\u009c\b|\u0014\u00d8\u001b\u00de\u001a\u00a3\u00b3\u00b3I!T[\u001eB\u0087-\u0088s\u00de\u0019\u008f\u0091h\u009e\u00f3L,\u00e2\u00ce\u00c8\u0019r\u00bb\u00e8\u00b8\u00d0\u00e7;\u0013\u00aaN\u0017#\u0019\u0094x\u00fe\u0084\u00df\u00ed\u0010N\u00b9\u0003\u008b\u00f7\u000fK\u0093\u00bc\u0087\u00b5\u00de\u0084\u00e8\u0003}W\u00c8|z\u0083\u00b2L@\u00cc\u0084\u00e1\u00d7\u00e1\u0099OO\u00a8\u001d\u0092\u0091\u0017C\u00f9\u00fd\u008d\u00ec cD\u00b1\u0088\u00cb)c\u00e7d\u00fc\u007f\u00db^\u00aaS\u00d6 \u0099!\u00a1\u00b4\u00ed\u0005\u00af\u0016\u0098\u00d9\u00ee\f\u00e1\u00ff\u00c9\u00e4\u00c0p.\u00c7\u008e\u001d0q 1E\u00f5\u00a9\u00ef\t4\u0019{[.\u00ae}\u00a1]\u000e=w\u007f\u009ed\u0094{T\u0095\u00ac\u00b7\u00ad\u0091p0(\u0093\u0084\u00f1\u0081\u00d5\u00e1\u00c0\u00f31\u00e6\u0095\u00e9\u00b4\u00e3\u0080(\u00d8\u00ce\u001b\u00e6\u00b1\u00a2<\u00f4\u0010\u008bb!\u00e1\u00ef\\\u00bbu\u009dk7\u0084FN\u008e;5S\u00f6,\u0096\u00c09\u00a2\u008f\u0092\u009cs\u00f2~\u0018\u00ef_\to{\ft\u00d3I#\u0003\u00ab4\u00a1\u009cz\u00c5\u0093\u0086\u00d4\u00ac\u00e2\u009b\u008f\u00d47%\u00e0\u00b5Z\u00d4\u00ff\f/1&\u00f4\u00c6Mc\u00ed\u00b1\u000b\u00c4=\u0092\u00d09\u00878r\u00bf\u00df\u0019\u00d5d\u00fe\u0097,'R\u008f\u0096\u001b\f\u00d9\u00afj \u0006\u00f8C<\u008c\u001c\u00c5\u00d2\u00a3\u00d3P\u00c58\u00c2[\u00dcb1&\u00b7>\u00ccJ\u0016\u001b\u00984\u00c1-{\u00bb\u00c4^\u00b0i\u00ebPr\u00c5\u00cf\u0085\u0012\u00b5J\u007f\u00cdG57\u00b3\u00e0\u0013\u00ac|W\u0088\u0013_\u00ab\u00fd\u0005h\u00e4P-\u00b84-\u00fe\u0001}y'\u00e9\u009e\u00ef\u00aef\u0084[\u0005G\n\u00dd\u00ff\u0081A%G\u00d8\u00c2\u009b\u001e/\u0092^hs\u0098b\u00e7\u00f7\b`2\u00d0\u00e6gb\u00d8\u00dd\u00a6\u00bd\u00d4j\u00ebZ\u00ab\u008a\u00a7\u00aa\u00d3\b\u00b4.\u00fcj\u00efYn-\u00b4\u00e0y\u00f6\u00af\u00bf\u0088\u0005\u0017$\u00d3\u00b4\u00de\u0013\u0092W\u00ea(\"f\u0015.U3\u008aA\u0007\u00cf|\u00ed\u0010l=\u00ad\u00d9w\u00dd1\u0012C\u00a9\u008f\u00faa\u00c0\u00eb\u00c3\u00b7|\u00b3\u008b\u000e\u009be\u00d2\u009a\\\u008e~\u00bc\u00e3\u00e7R\u00b4\u0092N\u00db0\u008b.\u0096b@\\\u000f\u00c7\u00bf\u00c6\u0091\u00d4\u00d7\u0095\u00dd\u00e6&\u0086\u0094\u00daGh\u00fe\u0090O\u00e3\u00e6\u00f6\u00af%\u001bIb\u00a60\u008b\u0084[\u00b5\u00b0\u0080\u0000x\u00d1\u0095Z\u00ab\u00c0\b\u00b8\u0014\u0001V\u00bd\u00e9#\u00ecF\u0086\u00e2\u0018\u0010u\u0002\u00d6\u00dd]\u001b\u00ccO\u0096\u00bd\u00c6B\u00d2:Z'E8\u00b1\u001d\u009cpk\bC\u0084g\u00ebc>lP\u00d1\u00e3h\u00ad\u00d1dGn\u0098\u00d0|H\u00ecz\u00da\u0011\u00c3\f\u0016w\u00e59\u0097\u00a5\u00d4\u00e5\u0080\u00e7\u00a8\u00d8f\u009bY\b,NdY\u00dc\u0000W\u00bb-\u008aE$1\u00c2\u00cf\u00c1\u0086\u00b2R5'\u00da\u00fd\u00ab\u00c6n<A\u0096:\u00b3\u00d7H\u009bs\u0006K\u00de\u00c6\u0084uU\u00a2|\u000f\u00aa\u00ff\u00c0m\u00e1\u00c0\u00ab\u00ee\u00ecz\u00c4#\u0099\u00c7\u0000%~o\u00a0s`\u00bbi^\u00c5\u008d\u00c5\u00d4\u00d3\u000e{\u009b<G\u00f3\u000f\u00fd\u001e^\u00e0kXB\u00e1\u0013\u0007\u0003M\u001f\u00fc\u00d9[\u009f\u0003\u00fd\u00d8Z\u0016&\u00db\u00d2\u00df\u0003\u00a3u\u00e0\u00d7\u0087Y\u0081/\u00c5m\u0093\u00df\u0019\u00aa\u0087\u00f4{\u00c3\u0082\u008f\u00d1(\u00cf\u00df\u00b6Q2\u0017,W\u0094\u0098\u00fc\u00caR=\u00ed\u00f4j\u009a\u0097K\u0094L\u0015o\u00f6r\u001d\u00bb\u00a9\u00b8\u0004R\u00a9\u00cb\u00e8\u00d1\\\u00b3Y\u00e1.\u00d1,\u0087$\u00c2\u00d6\u00bf\u00e4N\u008e\u00a8\u00cb\u00b0\u0095\u00bd\u0094-6\u0093{\b\u00fe\u00fbF9\u00ce%\u0093P\u00c0\u00f1\u0080\u00b8IgA\t\u00ce\u00b9l\u00d9\u000b\u00f00\u00b4\u00bfF\u008c\u009d\u00e1\u008eC\u0005uj \u00b4\u008c\u0005-\u00bf1\u00ec\u00a3\u00f6a8\u00a4E\u001a\u0084\u000b\u00f9C\u00d8EB\u007f\u00dc\u00f9K\u000eH\u00171\u00aa\u00e8\u00e7\u00d7\u00b2\t\u00fa\u00f9\u00a09-\u009d\u00c0)\u00e8Z\u0080\u008d!\u0019\u00845\u00ca\u00b6\u0017#\u00f7\u00c2\u0019\u00b8\u009a)n\u001b\u000b)5\u00f9HeQD\u00e9\u00c7\u00f4\u0017\u009a\u00a4'\u00f8\u00e1\u00d9>\u00b1z/\u0010\u0001V_6\u00a3\u00c1\u0004\u0000\u00fcs\u00a0\u00b9\"\u0092\u00fb\r\u00ea\u001fC\u0080\u00a2\u00ad|\u00aa\u00da\u0092b\u0000\u0001D\u00d0\u00efw\u008d45\u00cb\u0094\u00df\u00e9\r\u00f8\u00cf\u0097\u00de\u00ed\u00a0\u00fb'F\u0012L1\u00de\u00e3\u00841\u00b5\u001a\u00d6Y}/\u00d3\r\u00c9\u009c`\u00f6\u0097[X\r\u00f2:\u00c9\u00b1\u009f;\u0003$\u001f\u007f|\u00f6:Z\u0092\u00c3x\u00d0\u00ae\u00daL&\u0093\u00a6\u0003e\u009c^\u00aa)/\u00cc\u00c8}9\u0099j\u00ff\u0010c\u0015\u00b2\u00a9w\u008e\u00ad\u0005\u00bfd\u00bda;\u00e1b\u00f5X\t(\u00fd\u00e0\u001c\u00a8\u00a0n!T_\u00cd\u001b\u00ee)!\"\u00ec8\u00b7\u00c98\u00b8\u00d2i\u00be`\u00bb\u00f8U\u00b8\u00b3\u00bc\u00fa\u0080\u00a8\u00fc]\u009d{\u00c5\u00ee\u00c4\f}N\u00f5\u00afQ\u00f7\u00aa\u00a7\u00d7\u00ba\u0096%\u007f\u008aa\u00d0mz\u00bfy\u00b3\u00ae\u0085\u00e2\u00ef\u0003\u0003\u0084\u0083gM\u001b\u00e8\u00ea\u0095=\u00d0\u0086\u00f4\u00b4\f\u00fe~\u0015s9\u00dch\u00ec\u00bc\\k\u0095Y\u001b\u00a34e3:\u0005\u009b\u00dc\u00c2\u0016\u00aa\u00ab;_\u00c9A\u0012\u00e1\n\u001e\u00aa\u009b\u009f\u0087E\u0099\u001f`DU\u00d9\u00f8\u00b1\u0096U\u00cc\u00b0W\u00fd\u00a0\u0002\u00f0\u0088\u009f\u00b0\u00b0\u001f\u008d\u000f\u0019\u00c4b<j\u00b4o\u008c\u0000\u008f>N\u00f7\u00e7L\u00f56\u00eeEf09.\u00fb6(D\u00b9\u00ff\u00c9\u0001\u007f\u00ff\u00e9\u00a7\u00e7t-\u00f2\u0010\u00c6\u0015,\u00cb\u007f\u00811?\u00c2\u00f9\u00de\u00ff\u0001\u00f8j\u0081\u0018\u0099\u001aY\u009c\u00df\u0017\u00d7:\u00df\u00b9\u00aaE\u00c7\u008fY\u0004\t\u00ffw\u00e8\u00da\u000b%a\u00dd\u00b6\u00a3\u00f3!\u00a5\u00dd\u00aa\u00ffo8\u00e3{zm!\u00e9\u00bc\u00ae}\u00939\u0085\u00b5\u00d0)\u00b8\u00ab$A\u00866\u0083ij\u0001\u000eQ\u00c7j\u000b\u00f4\u009a\u0097c3_\u008c\u0096\u0013\u00a0\u00913\u0012\u00c3f\u00c2\u0006\u0004\n\u00e4\u00a8I\u0091\u00c8\u00a4\u00f9p\u00f6\u0013\u00c5E \u00d5\u00beK\u00a2WJ\u0013\u0089\u0017\u00f2\u00d4ULSug\u00bf\u0088\u00cb\u0082^\u00ce\u0002}\u00ad\u000f\u00b0\u00bb\u00c1-\u00f3C\u00be\u008e\u00f0\u001d__`\u00ca\u00d6\u0005\u00bf\u00a5\u00d9_vS\u00d5\u008c\u00bebx\u008d\u000b\u0081b\u001dqz\u0082\u00e2w\u008d'\u00bc\u0019\u00d8\u00c3\u0014\u00a6\u0087\u00de\u00f67\u0093ryr]\u0082X{\u00f0\u00c6.\u00aa\u00b2\nQ\u00dd\u00b3u\u00fb\u001e\u0088<\u00bekc\u00b4\u00f4k_\u00b7y\u00bb\u00f6p\u0018^\u0002P\u0018\u00e7o\u00a7N\u00deh\u00c8\u00da\u00afHG\u0095\u007f\u00b8\u008e\u0097qw\u00ceg=\u001c\u0001\u0092\f\u0011v\u00886\u00c1,_:Hq5\u0091\u00af}Q\u00cf\u009c\u007f\u00d5\u0096\u00a6\u0092\u0080)\u00f4\b\u00bf\u00b3\u00a1\u0099?[Fj\u00aa2\u00de\u00b3\u001a;\u00c2\u00b9Oz\u009c,\u00f2\u00c4\u00b5\u00achf>k\u00e2\u0081y$\u00e9`_\u000b\u00eeSI\u00bf1\u0000\u00f9\u000e\u008f\u00e5\u0099\u00fb\u009c\u00a6\\\u0011\u0090\u0083\u00e0\u000f\u001f\u00a6\u00b9&AKo\u00f4\u00dbU\\Q\n\u00ccA\u00ea``\\\u00ee\u00ebE\u0092\u000b\u00f41\u0014,Q\u00f4\u00f2\u00fb\u00d0\u00c6\u0097+\f\u00fe\u00b3\u00c5\u0014\u001e\u00a9\u00eb\u00b6\u00ca\u00e4\u0095\u0089M\u0086+'_\u00b1\u0090\u00e4f\u001e\u00bfC\u00bd\u0090#\f\u0088\u009c\u000et\u0080\u00e3\u00e3\u00f1Kp\u00de8\u00f5\u0014\u00e8Sa\u0099\u00c2\u0001\u00df\u00a0\u00a6\u00ee\u00bd\n\u00fe\u00a8\u001b\u00dc)#\u00e3\u000b1Q\u00cd\u0006\u00d4\u001f\u00d8\u009d\u00ec$u\u007fz\u00bc\u009dn\u0012\u00db+c\u007f\u0007q\u00d3\u0082;\u0080\u00bc\u00e11\u00ecl\u00b0\u0006t>\n \u008d\u00e2\u00cdgV\u001a\u00c5\u001f\u00b9\b\u00d6-\u00b0X\u00f0\u008f\u00d75\r?&\u0099\u00f0\u0089l\u00b9\u00d7\u00a2\u00b3c\u00f2\u0010\u00d9-\u00f5\u00ba\u00a1\u008d\u00e4\u008c/\u00ff\u00a9l\u0081\"8\u0085wa\u00ed\u0085\u00a3\u00b6\u00ac\u00da\u00ab|M\u008d.\u0094\u0083\u00d4\u0096K\u00d92\r\u00dd\u00ab6*\u00b3\n\u00aed\u001e\u00baty\u0017Q\u0006\u00e2'O\u00ffb6I.\u00a9\u00eb\u00aagT\u00cf\u00d4\u00c6\u00c34\u00a4k\u00b7j-_e\u00c2\u00b1t\u00d9u\u001e!\u00c5\u00c5\u00ac\u00baA\u00a0\u00a1\u00ef\u009bo\u00b3\u00db\u00f00\u00ef\u008b!\u00f0C\u0006\u009dTm\u0083\u00b3)\u00e0\u00b7\u00e2\n\u00f0\u0017\u0095\u00ffAP\u00146\u00f1\u00f0\u00f13\u001bR5[\u00fdt\u0093\u009e\u0015\\c\u00d6l\u00d8S\u00c8\u00f3\u000e\u00d6\u00c7\u009c\u00b3\u0087\u0001\u00f9M3\u00e3L\u009f\u00f0\u0016J+l\u00b5\u00ad\u0090\u00d3U\u0010\u00af7>\u009f\u00c4\u001a\u00fe\u0010:\u0082\u0016\b\u00f8\u00e3WS)&\u009fB\u0093\u00bf4+\u00c8WYS\u00fc\u000e\u00da\u00d2 yP\u009bV\u00a5b\u00e1\u0017q\u0001\u00e1\u00d9=u]\u00f6^\u00b6F\u0001w\u0010\u001fW\u000b\u00a2\u00ec?\u00b5+\u00e3\u00e3\u00e2P\u00adZr#\u00dd\u0000\u00ba\u00be\u001b!N\u00e5\u00ea\u00f2m\u00cc\u0084B\u0091\u0081qh\u00bf\u00cbl\u00a4\u0093J$m\u009c\u00e9_Us\u008b-\u00c1h\u00f5-`\u00f4\u0014\u00bb\u00b2f\u0083qF\u0011\u0092\u00a8\u0014\u0084\u0013}\u00c6\u0003l\u00b3l\u00ef\"\u0014\u00c1\u0016\u00a8v>\u008f\u00d8\u008fb\u0017\u00cd\u00a3\u0017\u00d5\u009b\u00b8=\u009a7\u00adFrbdlm\u001b\u00d6\u00f1\u00f0\u0012\u001c\u00ed\u00e2\u00e0is|\u0010\u000bs\u00cb(\u00b1\u00b7A\u00ba\u001a\u00c5^\u00e5\u00a8G\u00c4 \u0004\u00eb\u008c\u00df\u007f\u008f\u00ac\u00a6\u0087\u0097\u00a6<m\u00a63mT/\u00bb\u00c5\u00e9\u0087\u000efIh\u00a9\u0017s{\u0090$\u00ad\u00b3%c\u001c\u00be\u0000w\u00181\u0012P\u00b3\u00ad.\u00e9a\u00c9HD\u00c6P&\u00eb\u0001$\u0017\u00e9\u00e6\u00c5\u00b6g3\u0097\u0096\u00ec~+j\u00e5\u000es/\u0000\u0014\u009b\u00cc\u00fcya\u00b5\u00b1!Zt\u00fd\u000f\u00e7\u00fb\u001a\u001d\u0089\u009c\nAg\u00df\u0013\u00be$8\u00bc\u00f0\u00a5\u00d4\u009f\u0002\u00e8$\u001e\u00d0\u00ac\u0011\u0097\u00d0\u00e4\u00ea\u00b2u\u00b7Gf\u00ac}*\u00e0\u00d4V\u00ee\u00daAM\u00a0Js\u00af}Zy%\u00fd]\u00f5\u001e\u00f4e\u00ac\u00f8kw\u0082\u001a\u00d9\u00f8a\u008b\u0016_K\u00c4\u00f9\u00a30\u0017\u00bb\u00ba+F9\u00a5q\u00f2\u00c8\u00ecg29\u00e7\u00c5\u00c8\u008b\u00a0\u00e7\u00d6\u00fb\u0010]j\u0003Xi\u00bc%\u00de\u00bc\u001c\u00b2S\u009ccne\"Z.\u00f1/\u00964\u00f0\u0012\u00bdna\u0084\nB\u00c3\u00df\u0091:\u0089\u0090\u00a6\u00af\u0087\u00e4\u00f6+s\u00b8\u00ba\u00c9\u00e9\u008d\u00a9l<\u00a8\u00f1\u00ca\f\u0084\u0014\u0090\u0012mH1\u00f6\u00ef\u0087y\"\u0093\u008d\u00f7\u00f3\u00dc\u00a7D\u00dd\u00d0-\u0095\u0081\u00baJ\u00b5{A\u00d6\u0086\u00dfU\u00dc\u0019-\u00dfMP2\u001ew\u00c3l1=h\u00ad\u0015j<\u00e3\u0088\u00ea\u0093@\u0096\u00beS:\u00efv\u00e2\u0099\u00faY^\u00a3\u00f0z8\u00b3\u00e12uh{Ie\u00f9\u00ad\u00b3\u00ab\u00e2+\u00e0\u00e5\u00a1sE\u00dfE\u0098\u0096\u0014'\u00fb=\u00cb\u00ba\u00ec\u00f9\u001b\u00b1\u009d#b\u00af\u00ea\u00e6\u00ea_)\u00fe-\u00c9\u00ed\u0095\u00e1|\u00b8\u0018V\u00f0\u0087\u00ff\u00f2\u00cd\u008e\"\u001d\u00d0<\u00fe\u001dB*\u00ee\b\u0095k\u00bbM\u00e2\u00b85\u00dcF\u0087\u00874cTS\u0094\u00f0u\u00c7\u00e1H\u009b\u00e9`\u00e0\u0080\u00b1\u0081\u00dd\u00021Sx\u00a7\u00b3ic]4A'\u008a\u0086\u00f8\u00b95\u00a5\u00ed\u008d\u00a6\u00ab'\u008d\u0085\u00d0\u0084\u008fJ+\u0013H\u00d4W\u0006\u00f0\u00ec_+6\u0083\u0012F2?\u00d1\u00ff\u009b\u00fe\u00baz\u00be\u0016\u00aa\u00fd\u00aa\u0092\u0011\u00cb\u00f2\u0012t\u00c2\u00c1\u00c5d\u00bdG\u00d1\u00cc\u0096\u0005\u00fa7r\u0097\u000e\u00cd\u00f8Ho\u0002'\u00f6B\u00ab\u0015\u000f\u0081\u00fb<\u009c]\\\u0018\u000b\u00fe*|\u0018mH\u00a6R\u00eb\u00b9\u00db8\t\u00e5e\u0099\u009b\u00d6\u00e8\u0082\u00fc0\u009d\u00eb\u00b8\u00cd/\u000e\u00ee\u0088\u00fe\u0085\u0089*d\u00a1\u00e7\u0083\u00bbo\u0085\u00d7\u00c6sW\u00b3\u00ff\u0011\u0080\u0017\u00b0\u00ae\u0092\u0080\u0015k\u000bX\\p\u001e\u00ed@\u0089i\u00db\u0082T\u001e\u00efe\u008c\u0095J7E\u00a7\u00c8\u00fc\u00ec\u00bfw?\f\u00db-\u0091\u0095\u0093\u0015\u00cb\u00a8b<\u00b0\u0004X\u00c2\u000e\u00902\u00ac\u009a\u0084=\u0089\u00c6\u00b4J\u0011\u00c9\u00c3MPQ\u00ad\u00f9\u00a01\b\u0007p^\u00b2\u001a\r7\u00d0>\u0017L\u001d~\u00a7\u001f\u00dc\u00f0\u00b3\u00c5VM\\\u00c0\u0016T\u00ad\u00f8\u00b1c\u00dd\u009e\u00bf\u00c4\u0087\u00feb\u00a5\u0002z\u000e\u0085h\u00b2\u008e\u008a\u00830\u0096^\u00af\u0092\u0092,\u00cd\u00e7\u00b6\u0086\u0014\u00a3'\u000f\u00ea\u0096\u00a8\u0081\u00e9\u0084\u00cd\u00aa/\u00037\u00bbAT\u00d4\u00a4\u0001#pC\f\u00b6>\u00f2\u00d4\u00ea\"\u00cf";
                var5_11 = "~\u00beI?s\u0091-\u00e4&\u00e1\u00cf\u009c\u008e`K\u00b9\u0015\u00ccM\u00f0bzd\u00c1\u0018~\u00cc\u00a8V\u009d\u00cd\u0090\u00f1\u0089Q*\u00e2YQ\n\u001b\u00f4\u008dY\u009eD\u00adAt\u00df\u009a\u00c5\u0094\u00ff\u0090B\u00c8\u00df[X\u00e5\u00ce{cw*{(\u00b2\u00b42M\u00dbr\u0099\u009c\u0010U;t\u00071\u0019xOm\u00b7\u00af\u00cb\u0084\u00a09\u00e8\u0081Z\u00d2\u00d3\u00fb\u0095\u00e9U\u00e0\u00bd\u001a\u0089\u0090\u00b3^X]\u00ea%n\u00ea\u00bb\u001d\u00a4\u0013\u00f3c\u00e1\u00f4z\u00e4$P%\u00be\u00c2.\u00ac\u00151\u00fd\u001f*\u0017+\u0010\u00f2\u00811\u00a5hK\u00c4\u001fp\u00ee\u0095\u00c7\u00bdE\u00bd\u00e0\u0013u\u00c2\u0015\u00ee\u00ec\u0018\u00dd\u00b6\u00cc\u00d0\u00b7e\u000e)\u0081\u00cb>\u00e1\u00c6\u007fZ\u00fekdo\u007f\u008fT\u0014:Q4\u00e65\u00f7\u0091\u00da\u0090\u00aa\u008a$\u0087>1J\u001a\u00e5\t\u00a1\u00d0\u0018\u009a\u00ece\u009fh\u00a1\u00e7S_\u00ca\u00ff#;\u007fT\u0096\u001aSl\u00de\u00ab\u0092/Us{\u0092\u00e7\u00eb\u00cc'\u00a0\u00e1\u00b9\u0098\u0091H\u0007n9\u00e4\u00a2f\u0089\u0006\u00856?)\u00e6&\u00c1\u00ee\u00da\u000by\u0080\u0095\u00a1\u00a5\u0004U\u0006\u0019\u0006$|\u00db\u00a5T\u00a3X\u00da\u0012\u00c7*C\u0011\u0081e\u00ad\u001a\u0087.\u00c6N:9\u0093H%\u0000\u00e1\u00ee\u00b38o\u0081\ra?\u0096\u00e7\u00fc%]g5\u00fbdf\u00b7\b\u00fd\u00e2z\u00db\u009c\u00f6\u0099\u0088\u001a\u00f1\u0082\u000eNT\u00c2\u001eD\u0082\u00ec\u00a6\u00e5gX\u008b\u00c2\u0015\u00a8\u001fJH\u00ba\u0015\f\u008e\u00ad\u00d9m\u0092\u009d!\u0089+\u00ad\u00e0y\u00f8^\u00bf\u008d\u00e3\u001a sv\\\u00e4\u00f5]\u0091M\u0019\u0002\u00f6\u00b5\u00de\u001a\u008a\u000f\u0000i\u0098\u00ecH!\u00f3]UKc\u00d9%g\u00c6\b]\u001aO\u00f4\r\u000e\u00eb\u001d\u0000\u00a6`\u0019H[Q\u00aa\u0006*\u0018v\u001e\u0095\u00ba\u00c2\u00a2\u00a5U\u00a7\u00f4\u0016\u0005\u00c9\u00ce\u008fS@8F\u00c1jl\u008cW\u0091f\u009a\u00dcqvv\u00e6\u00dd\u00a8BP\u00fd\u001e\u0091\u00be\u00b0\u00bc\u0093\u00a4\u007ff\u00ca\u001e\u0089@FM\u00d4c]?\u0096\u0013\u0081\u000e7s\u0004\u00f4\u00af7\u008b>p\u0098*\u0085@\u00dc-\u009a\u00e8\u00des\u009d\u001d\u0094\u00f4\u0019YGD\u00a9\u00ac\u0090)nbTCS6\u00cb\u0088\u009c\u00fc\u0017\u0015\u00b7\u00853\u00fa\u00e5,\u00d3\u00cc\u00b0\n\u00c2s\u00c2)\u00a0\u00b37\u00a4\u0019!\u001e\u00bc\u001aZu\u00f4\u00ca\u009d6\u0002\u00bf\b\u0099\u00ee\u0089\u0096p\u00efS\u0005x\u001a\u00ed\u009d\u00bej3\u0081\u00bfe\u00e1\u0090\u008b\u00c9N\u0003X\u0014V\u0016-\u00a1\u00b1\u00b1p[u\u00e4\u0099\u0089\u0017\u00d1\u0004\u00cb\u008a\u00ca\u00f5\u00b8\u00bc\u0085\u00d6\u0080\u00f3\u00c9'\u008bQ\r\u0088pCo\u0093\u0002\u001a\u00fc\u00da\u00de\u00d6U\u001a\u00fa\u00ca(>\u00fb\u0095\u00cb^\u0091\u0001Z`\u00b1\u00c2.\u00d3\u00f9\u00c3PX\u00e4\u00f6R\u00da\u00be\u00cd\u00d1a\u00cb\u008aA\u00af\u008d\u00a5}\u00d3Y\u001c\u00b4\u00c9\u00d7I\u008d\u00a2\u00bf\u00db-[{\u00f9\u0015Nj\u00de\u00d4\u0001)]{K[\u00d7\u0091\u009a\u0016\u0099\u008b\u00fd%\u009f\u00da\u00cby\u0089j\u00a2|\u00a4 \u00e3j\u00feL\u00ee\u0010\u00e8\u00e3\u009a\u00df\u0017{Z}\u00d4\u00da\n\u00c4\u0010c\u00e4\u00f9\u00b4r\u0003\u00a50\u00f0\u00ca\u00fd\u00bb)\u00ad\u001cO\u00aeK\u0080h.\u0094\u00be\u0086^\u00c5\u0010\u00bc\fEh\u0019\u0019\u00d8\u00c2\u00c7\u00a0\u00a1\\\u00dfx\u00dcL\u0012Y\u0089\u00e7\u00a1mDX\b\u00c1\u0015\u008av\u0002\t\u00db\u001a\u00a5E\u00df\u001f\u00cdg1\u00a2\u00bf^\u0002\u00ce':m\u00dd\u00e0\u00e7?D\u00c5!\u00ab\u00bdL\u00b2\u000e\u00b0\u00e1\u0018\u0014\u00cb\u00db\u0095\u001d\u00ae\u00cbA\u00abP\u00c1\u00c5\u00b5t\u00efvH\u0004\u00b0\u0099b\u00021 P9\u009e\u00bctO\u00d0\u001eF\u0000z`\u00ae\u00c2ra\u000bs;\u00e8Fj\u001c\u00ab\u00a9RX\u00ec\u00d7\u00b9j\u00f5Hs\r\u009e\\\u00a1$<\u009e\u00cd$\u00bbT{fC\u00fb2\u00c7\u007fT\u00bdw.\u0098\u00fa\u009c\u0013\u00d7\r\u00bb\u00ec\u008c\u00bcz\u00c2)\u00e5\u00bd\u00f8\\&\u00a6\u00e9\u00fa3\u00a4\u00d4\u0005\u00d4K\u001c\u00b0v\u00fc5z\u00f76\u00d9&\u00c7\u00ba2U\u00f7\u000fk\u00ad\u00db1\u009b\u00de\u00b4\u000b\u00fd\u00c8\u0083H\"elk\u00d3\u00d4\u0014\u0087\u000e\u00e7\u0084x\f=\u00e4\u00eb\u00c3\u00ec\u00df\u00c7 $\u00e1w?kr'b$\u00a3\u0006Mv\u00d8\u0014\u001a\u00a7\u0098?b\u00fbEw\tK\u00e6\u0013\u009b3!\u001c\u00da\u0014\u00d3\u00d9x\u0093\u009e!\u008ez\u00a2\u008a\u00e3k\u00ca|R\u00a8\u00dd\b\u00ec\u00db\u00b8\u00a4_\u00e0\u0093%n\u00cc\u00b14\u00cbPK\u0000\u00d3\u00d2\u000bmQ\u0092.wO\u00e4\u00bdZ\u00cf\u0003\u0000\u00b0\u00eey\u00d31\u001c\u00e3\u00a0<\u00e6\u00aa\u0005\u00de\tTw\u009a\u00b0\u00cb\u00ae\u009dq^\u00e2\u001c\u00ba\u0003\u000e63?E\u00e3\u00a2mF\u00b4X\u00cd \u00a8\u00b3\u0019\u00a2\u00bf/\u00bb\u00c8\u001a\u00c7_)\u0091\u000e_<!\u0018\u00ab0\u00ac\n\u00b9m#\u00a0-)\u00e4\u00a0C\u0088M\u00adV\u00f5\u00ef\u00afz\u00c2\u009c<@\u0085\u00f9L\u0089\u00d1\u0010\u000e\u00c6\u00a6\u0010Ye3\u00c1\u00b6\u00ce3\u00caS\u008d\t8\u00bb\u00eb\u00fd\u00cdPj\u00049D\u00f4\u00ad\u00e4v\u00d2%\u0099sx<VT\u00d5\u00e6\u00a2\u0099T\u0095g\u0084\u00c8I,\u00aa\u00a1\u00fe}\u00dc\u00af\u0095\u00ce\u00ad\u0006\u008f\u008a\u00e2oQ\u00bb\u00cac\u00f4\u0002\u00d5(~\u0001q/-y<\u001eA.(\u00d9\u00d0lGl\u0096\u000e\u00c7\u00f596\u00b33l\u008a\u0093cV\\\u001e\u0090\u00e1\f\u00da\u00f7\u0002x\u00f5\u0004m\u00ef0I\u009d\u00a1\u00ad\u00eb\u001f%M\u0006GD\u00bf\u009fIH\u00d3\u00b9\u00c5\u0006\u0001\u008c\"\u00a0d/\u00a3\u0090p@\u00b2\u00a8o\u00a11\u00942b\u00e6\u00d5\u00cc\b\u0013\u00ed\u00d3\u00a9\u001bU\u0001!\u00ce1#\u001f\u00b2\u00f7\u009b\u00de\u00e6\u00a5\u00ac\u00f3\u0086\u00142\u00c4\u00ce\u007fK\u00caR\u00c6\u00da\u00b8\u0017*S\u00f9>\u0089(\u009c\u00bf\u0019\u009e1\u00b3C\u00b8R\u00b1\u008d.\u00fbu\u00d7\u0081\u00fd\u009b\u00c9\u0098\u00d5t\u0095\u00ba\u0007\u001c\u0080\u00bb(M<&\u00b6\u00fb\u00c5:\u0097i\u0005\u008e\u00e2\u00a5\u00b6u\u0002\u00f4\u00db\u00d7\u00ab\u00c22\u0085V\u00e1\u00d8\u00a3\u00df)g\u000f\u00ec>\u00f0\u0018>\u00f2\u00c2\f\\\u00abl\u00e6?\u0099*P\u00e07JR*\u001bQ\u0088N\u00b0o>\u00f6V\u00b2\u00c0#\u00ff8\u000b\u00d0\u00eaB!2\u0092J\u00b8[@\u00bcs\u00dbf\u00cd\u009ee\u00e7\u00a5\u00fc\u0014\u001c\u009b7D2x\u0092&f\u00caXJ*I\u0006 C\u00f1\u00b0\u0081,_\u00ff\u001c\u00f0 \u00e9\u00fa\u0001\u00ba1\\c\u0016\u00c5\u00e8\u009di\u0082qP\u0089\u00b3i\u00fc\u00c0\\\u00de\u001au\u00f8\u00a9\u0012\u00a7\u00b8C\u00e3\u00b3\u0091O\u00f7\u0090YOXuL\u00c2\u00aeG\u0091\u00ef0!\u00a6wZ\u00c0[\u007fTn\u00eb\u0087;8r\u008d;\u00ac\u00ab@[eF6\u00ae\u00dc(\u001e\u00dc.\u00d9r\u00eeE\u00a1\u00f8\u00b0\f\u0015\u00f8\u00cfjj\u00f5\u009ee\u00bb\u00e0N]\rhy\u00e3E}\u00c1\u0003\u0098d\u0091p\bs58 \u009f\u00f9:\u001d\u00e0\u0096`\u0013H\u00b1\u00d3\u00f5\u00c3+6W\u0091\u00b3\u00c38\u00a7\u0011\u00cd '\u00a5\u00f7\u00d5r\u00ad\u009b\u008f\u00f3\\\u00db\u00e8{\u00bfg\u00b8'\u00aax:j\u00b1<\u0092T\u00996\u00e6\u0086zu;\u00fb9\u00a4Ei\u00c9\u00a2\u00da\u0003\r\u008eX\u0084[U\u00b8\u00de`\u00bd'W/\u0004Op\u0098\u001b\u009a\u001a\u00a2f\u00e3H{\u00d2\t\u0089;\u00a3=d\u007f\u0016\u0095\u0087*\u00b1\u0017\u00a1g\u00fa\u0094F\u00f8p\u00e6PF\u00fbO\u00b3\u000b>J\u00ef\u008f\u00b8\u0092\u008b\u0002\u00d1H\u00c7i\u00ecWSV\u00ed\u00938C\t#\u001a\u00df\u00b4\u0017\u00d1M\u00baX=<X\u00ec\u00e9\u00ff.\u00b5\u00ad\u0016+\u00a2\u00fd2\u00b3\u00b4\tm\u0000\u00fb\u00dd\u00e6>$\u00cbB{\u0004x\u000e\u0082\u00f9\u0086\u000fo,\u00c7\u00b8d\u00d2<\u00fe\u00b3?\u009f\u00b8\u00b9\u0097A6i\u0010\u009d\u00fc\u0002E\u0014\u00a9\u00b9\u001cJN\u00b0\u008c\u00af\u0080\u001d\u00e9\u00de-\u001d.a1\u00af\u00caH\u00a8?\u00bd\u00b6\u0082&\u0083E\u00f1\u008a\u00a4\u0085YF\u00c0\u00f3\u007f\u00a3\u00e3 \u00feS\u0085\u0094\u00b8\u00db\u00e9 \u00c4\u0016nv\u0018\u00ec\u0091\u00e6\u008f\u00ac\u00c67\u001bH\u00de\u00fd\u0092\u0013\u00d4 \u0085\u00ba\u0001\u0085\u00de0\r\u0010(3\u00c9i\u001d\u0012\u00a3\u00e8\u00bd\u00c4\u00eb2\u0017\u0010\u0003\u00de\u0092\u008b\u00a0\u0018\u00ae\u0012\u0092\u0000>m $\u00c0N\u00b8d&K\u009e\u0082\"#\u0001\u00de0u.ZT\u00ab&\u009d\u0094\u0080\u00a3*\u0096\u00f0DXUK\u0016G\u00ec\u0011{\u00f8\u0091\u00af\u00e1\u00bf@\u001b\u0012\u0006\u0010K\u0082%\u00cbo\u00f0\u0097\u0082\u0094i\u00dbl\u0088<oAz\u00f1\u001d\u0005\u00966\u00d5R\\M\u0098\u0000\u00ce\u0003\u00b9\n\u000bg\u00a2a\u0013\u0085\u00a7\u00c9\u0006{\u00e4\u00b1\u00ce,\".\u00b9\u0084\u00f4\u00bfA\u009f\u008c\u00ba_*\u0082\u00a5=:qo\u000b+\u00eb{\u00c4\u00d5[.F\u00fa\u00fb\u009cm$]OO\u00f9\u00a4\u0004\u00ec\u009cy\u00dd\u0014;\u008b\u00e5\f\u0092\u00c7\u008a\u00ed\u0006\u00b7\u009d\u00da3\u00cc\u00af\u0007$\u00ce\u00ba\f\u00ee\u00b5m\u00ec\u00f7O\u00f8\u00fc^2\u00ec\u00cd\u00d7\u00c1YEu\u00bf\u007fh\u0089[wF\u00b7\u0012C26\u008c\u0091\u00baI^\u00ee\u0010O\u00das\u00ba\u00db\u0099\u00c2S\u00a2cK\u00e60\u00df\u00bd\u00a16\"%\\\u000b\n\u00fe\r\u0082\u0005M\u008e\u00ad\u00c5\u00dd\u0088wI}d\u0098\u0098\u0019\u00ee*\u00c8\u00b4\u009c\u0012/-<\u009d\u00f9\u00a1\u0017)8j5!\t\u0091\u00da\u00dd\u000f\u00aaa\u00b9\u00c8!Bd\n\u00bd\u00cb[1\u00d6!_\u0007\u00dcN\u00ef\u00db2\u0003\u00ff\u00d4\u001a\u00dc\u0006\u00e90x`\u00c9&5}t\u0004\u00b76\u009b\u00e8d\u0005K\u00c9q\u00b2\u00ac\u0093\u00d9\u00f5*\u00d0t\u0087&%\u00ea\u00de\n\u009d\u00ee\u008b2uu\u00f4\u00ef\u00ad\u00b1\u0007L\u00e7X\u008c\u0000\u00ccI\u00f0\u0016i\u0010\u00a5\\\u00b8Y\u00e6\u0011\u0083\u00b1\u0000 \u00ca\u00fb0\u00f4py\u00c0\"\u0098{u'p\u00a7\u001b<\u0091\u0000k\u008c\u0014\u00c0\u00b9\u008d\u00d0\u00a1\u00beoM\u00eb\u0090\u0083\\\u00f4c\u00b2\u00d6\u00c0?{\u00a3\u00f71\u00cd\u0007:\u00bc\u00ef\u00e0\u00bb,\u00f0\u00a7\u00df\u008d\u00bb\u00c8>)D\u000f<_\u009c\u00c7\u008f`/\u0000\u00a5\u0093\u00bc=\u00f2o\u00cc\u00ab\u00a7\u0007\u00b0\u0011(4\u00a5\u00a8^T\t1\u00a9v1\u00b8!\r\f\u00aeG3]\u00c6\u00b0\u008a\u00d9\u000f\u009d{d[\u00cd$\u00ff\u001a\u0002\u00ce\u00ed:\u0099\u00ad=N\u008em9z\u00fcf\u00d60h\u0001@\u0005fkf_\u00e5\u00fa/\u0000c\u00c69\u00c3\u008a\u009c&\u00dcX\u00ddN\u00b7\u00bc\u0097\u0006L\u00e7/\u0003\u00f8A>\u00fd\u00e1\u0082I\u00ad6\u00e2\u00f6\u009d\u00f4\u0085\u00c87\u00a1\u00ee\r\u00de\u0086\u0015v'\u00e4`\u00b4\u00cc\u00ea\u00f9\u00c53\u0081/\u0097\u009e\u00ccP\u00d5\u00bdb5\u00dbDr\u0015\u00b6\u00d2qz\u0013z\u00af\u00ddC\"\u0013\u00bce\u009aU\u001f\u00c7g\u009d7\u00fd\u0090\u00e1\n\u00b8\u00b3\u0006.\u00f4Y.g\u00bd|F\u00dc\u0012\u00e4\u00e1A\u000f\u0016P\u0003\u007f\u00f4\u00f9\u00de\u0003\u008b\u00e1\u0092/o\u0011\u000f\u0097\\oDO\u0014B\u00f91(\u0002\u00f9\u00c9\u00b1\u00e4\u00ab\u00a7S0\u00c04\u00cei4\u00f16\u00d6\u009bl\u00dc|\u00bf\u00f7\u00c3\u00fe\u00c3,T\u00a7\u009c\u001d\u00e1\u009c\u0080\u00f8\u00a0\u0095\u00baN\u00cef\u0005\u00b7\u0095\u009bp\u00bc{\u00a8D\u0088Y\u00e3c\u00b4\u00b4t\u00a9:~\u00e8\u00aaZ0\u008e\u00fb\u00feLY\u00d5\u00b3\u008f\u0092\u00b2\rm\u00ef[\u00b4S\u00d3\u00c5T\u00aeq\u0093\u009b\u0086{\u00bc.\u00ff\u0002T\u0017e\u00b6\u001ek9 v\u00dc\u00f8\u00d2\u009c\u00b8\u0001D?\u009a\u008b\u00a7\u0001x\u00b7<kb\u00caO\u00a15GF\u009a\u008b\u001e\u00e5\u0005\u00c1\u0018h`\u00ae\u00f3\u00f7\u00ff1\u00b2\u00aa\u00f0\u00d5\u0016\u0007\u00a4\u0005\u0011\u00db\u00da\u0087\b\u00d7V\u0002s\u00bb\u0011\u000e\u00a6\u00e8\u00c2\u00b8>\u00bbps\u00f7y\u0091i\u00c0\u00fe\u0006n;-\u00ab\u0092?\u00aa\u008aH\u001b\u00cc\u00ed\u00bf\u001b\u00c99CV\u0015\u0019Pb6!\u00e0@Mv\\\u00c3\u00b7\"\u00e1\u00ef\u00b57\u00ed\"\u00ef\u00aa\u008aX\u0016\tWJ\u00b8\t\u00d7W4 \u00d0_S2+*G\u0019\u00bc\u00c7\u0092@\u00c7\u00b0\u00c2S\u00f9\u00bf!\u00fd\u00cd[\u00f0DW29\fvy\u007f\u00c3Q)\r\u0081jh1!\u0096\u0004Ao\u00fd\b\u007f\u00a85\u0096^\u0012\u0084\u00f6\u008e\u0081\u00a2R\u00fcO\u00e1\u000f\u0003J\u00f6\"\u0016\u001b\u00d4 x\u008fN\t\u0084\u00b1\u00e5]\u00be\t\u00b6>\u0098t\u0005\u00f0\u00f7\u00e1\u00b9K\u0006\u00fb\u00b6\u00b79\u00f5L\u00de\u0093xU\u00a2\u0019iS_\u008c\u00afS\u00c6\u00b9:{]\u00e8\u0081\u00e7\u00f8T\u00a3#b:\u00eeR\u00bdCB}`\u00a1Gc~\u0080Y$\\\u00ac\u00fc\u001b\u00a0\u00cfV\u00c2`\u0019q\u00c6\u00b1\u0010\u009dY1\u0006\u009c\u00ba\u0099\u00b0\u00a8m)I\u008ev\u0018\u0015\u00bc\u008c\u001a\u00fb\u00cb\u0003\fh\u001a\u00cb@\u00e4\u00eaq\u00afm\u00ca>\n\u00be\u0012\u00e9%\u00fd\u00b8\u00f1\u00e4\u00b8Q\u00abb\u00e0V\n\u001a=\u0099\u000e\u00fc\u009d\u0098\u0089y\u00b0\n2\u00ff\u00f4\u001d5T\u00b2\u009f0X\u00a4\u00c0C\u000f4&Q\u008dt\u0000\u0011N\u0081h\u008a\u009e>EO\u0002\u00ec\u00b6\u00fb\u0092\u0094f\u0014s\u00d6\u00e1\u009a KG*u\u009f\u00ac\u001a\u00a9\u0004\u00ec\u00b7\u0084|\u00d7\u00d5t~\u0015\u00f4\u0019\u00fe&|\u0006\u0085*D\u00d3\u00c1\u00c8\u00d3b\u0019\b\n\u00be\u00c9%\u00e2nL\u001f&[\u0094\u00cf\u00d2\u0007\u00edB\u00e9\u00ff\u001e$\u00c0d\u00e1\u00a8C\u00b3K\u00caE[X\u0013\u00c1\u0006&\u0083\u00ba>\u0096\u0092\u00be\u00f08\u00d4\u00cd:\u00efP\u0080F,u\u00e5A\u008c\u0005\u0001\u00cb\u0086\u00be\u00fb\u0011\u008c\u00ef[\u00c7\u0003\u009fJ\u0014\u00d0\u008c<f\u0007\u00e4C\u00db\u00c4\u00a8\u00e1S`\u008a\u00af`\t\u0013\u008f\u00a2\u0090O\u0015Y\u00b4\u0014\u00b4.l\u00a22F\u00d9G\u00873\u00bb\u009b\u00ea_\u0004\u00a3\u0099';\u000el|\u00c9\u00dc{\u00930[\u00df\u00d1\u00ee\u00a4\"\u0088\u001c=@,]\u00c7\r8\u00f0\u0015\u00b7B\u00e0\u00e0\u00e3]\u0093\u00d2p\u00ad\u00c6.Ov\u00c3\u0091\u00c9v#\u00c2\u009c&\u000f \u00fe\u001b0&\u0092a\u008a\u00e1\u00fc\u00b99\u00c5\u0003X\u00cb:\u00af\u00e4\u0088\u00ca\u000b\u0007\u00d5\u0016\u00cd+\u0006T\u00f0I\u0087\u0002\u009a.\u0011\u00bd\u009e;\u0001\u00a7d\u00dd\u00d5\u00d7\u0011\u00f68z\u0017$:\u00d3X\u00f9$\u00fboB\u0018w=\u00b24\u0091\u00b2'\u00dc\bJ\u00ea\u00d7\u00e0\n\u00f6\u00cb\u00ed\u00f7\u00e9\u00f0 \u001f\u00bc\u00c9\u008a\u00d49\u00f0\u00ec1\u0007\u0085p\u0093\u00af\u00b1M6\u0001\u00bb\u0089\u001d\u0007\u0010\b\u0085.\u00b0\u0087\u009c6\u0083-\u00a9\u00c2\u00ac\u00eb\u0017*\u00c6\u0011\u00ad&P=\u001f!\u0001;dQ\u00a7J\u00cb\u00d6\u00f9T\u00b4\u00e9\u000em\u00f8'\u00d2\u009e\u00aaG\u00d6\u0093\u0003\u000f\u008bs\u00d7\u00ab\u0019>=\u00ad\u00ddm\u00caB\u009eh\u00f3R\u0000\u00d0v\u00b8\u00f40F\u0015+\u0085\u00b5\u0083\u009a1\u00bd\u00e6E\u008d\u00133&s\u00ba\u00d4\u0015\u00af\u00e0N\u0090\u00f0n`-v\u00e4\u001e\u00ca\t\u0083\u00faHE/s\u00e5\u0019\u00fb\u00af\u0088\u00abj\u0015z3\u00ad~\u00b2\b=ow'\u00bcz\u0089_3|\u008el,^M\u008d\u009c\u00a8\u0082/\u00b6<\u0097\u0085M\u00bb\u00d9\u0089\u0011AB\u00e7H7\u00a9\u00c6\u00e1\u00ae\u00028\u00fc\u00bf\u001fX\u00df\u00ef\b\u009d}\u0004\u00b7\u00a0\u008e!z\u0003\f\u00f8rn\u0083oIb}'i@\u00ce\u0000\u0005\u0014\u00ef\u00a9\rA\u00d7\u0097\u001b\u0098\t\u0093\u00d6/{\u0013\u000e\u0093W\u0000B\u0014}\u00f4z\u00d26^\u0092\u009ef\u00d6\b\u0004!\u0080\u00a9\u008c\u00a4\u00c1#\u008b\u0001Xa0L\u0081\u00fe?\u00e7\u0001\u0086\u001c\u008b\u00b6t\u0091\u00ce\u0017*\u001f\u0089\u0015\u00e6U\u00db\u00f71\u0091Py\u00e9h\u0002\u00dc\u00deq\u0083\u00ffu\u001c\u00980\u009f\u0081\u00a3\u008d\u00f16O!\u00ed\u00e8\u00f3\u00e7\u001bDQ:\n./\u00c5\u00c1\u0000(t\u0080Y\u0099O\u0097]-\u00ba\u00be\u0001\"\u00f4[\u00f9\u00df!\u0007$\u0002-k\u00dd\u0087\u0019t\u0090\u00c0\u00a6lMb\u00e4\u0086\u0089+\u0084$h\u00a9\u009b|!\u00a8\u0007c\u00ccmuw4\t\u00c7\u0082+\u00bf2?U\u0091\u00dfR&Ov\u00ee\u00b4\u00de\u0010\u00dd[\u00b7 %Pl\u00aa\u0004\u00fe\u00e7\u008a\u00a8\u00a7M\u00b5\u00a2V\u00cc\u0098V\u0001>\u0093Lx\u00b9s\u00db!\u00c6\u00eb\u00cfB\u001d\u00abyU[\u00abH(\u0094hx/7\u00f9\u00c8_\u00bd\u001a\u00e1q@\u00a9anm\u00fa\tr\b\u008e\u00da\u00acP\u00aa\u00ba-\u00f5\u00a9\u008e7oF\u009d\u00c6*r\u00d2w\u0085\u00e7c\u00fb\u001eS8=m\u00d420q{\u00c3\u00e4\u00e9a~xAt\u00a9\u0099>\u00c479\u00c1a\u00b2\u00e2b\u0081\u00b7S\u00b0\u00d1\u00f4\u00a6-\u00d9\u00bc\"\u00f3m\u00d7@\u00d9\u00075\u00f9\u0001\u008f\u0013;\u000b\u00de\u00a3\u007f'TY\u00e4\u0084KF\u00d2\u001b]\u00ddp*\u00c1\u00ce\u0096\\\u00e6\u00cf\u00dd\f\u001f\u0016\u0002\u00f5\u00fbZ_\u00b3Z/_\u00d4\u00952B#~B\u0083\u00c3\u00e09\u0087\u00a8S\u00f0)\u00a2C\u00e0\u00d6G\u0003\u001f9.\u00d3\u0086,\u00f7\u00f2\u009e-\u0089\u00f2\u00deg\u00e2<\u00fa\u008d\u00c0\t)z\u0086C\u0011K\u0005K\u00c5\u0080\u00a6\u00ee`i\u001e\u00a2\u00b7\u00fb XT'\u0090\u0016\u00ff\u00d4\u00e6\u00ab4\u00a8\u00d8\u00a7cKt\u00f7\u00d5\u00fc6\u00c4\u000f\u0001\u00ab\u0017\u001b\u009aX<\u00fd\u00f8\u0014d1\u00801\u00ba\u0010Q(\u00eb\u00e8\u00c9]\u00a7k\u00d5\u0006\u00f4.8\u00f0y{\u00a0\u0097TR\u00f3km\u00cf*\u00e91\u00b6\u00828\u00b8\u001c\u00dd\u00fa%=.x\u0002\u00d9\u00e8\u0010\u00deW\u00ea\u00cf\u0095\u00e3\u0000\u0091\u00ae\u0080\u009f\u0006q\u00d8\u00e3\u00a2j6X\u0013\u00aaT\u0018\u00a0\u000e\u0002\u00dai\u008ai\u00ad\u00e3\u00f4\u0018\bRy9s\u009e\u00e0g\u00ac\u00f8\u008f\u00c7u\u00b9\u009e\u00aa\u0091;\u00f2\u0093\u008e\u00ea\u001d\u00cb\u00e4Wu\u00e5\u0007\u0001|@\u00c4p\u00f4\u000bX\u0003A\u00f9'I\u00ebl)\u008d\u00c6\u00d3\u0000\u00f5Z[9\u0001@\u00cb\u00d4\u00da@\u00c3\u000fx+\u000b\u00a0\u008b\u00a3\u00fc\u00f5g\u00d1\u00f6\u0082%m\u0088\u001f\u00866F\u00ef\u0084\u00bd@\u00a6\u0006\u00eee\u00a4\f\b\u00d6\u001f\u00d5\u001a\u0085\u00fc9\u00a0\u00e6\t@\u00fb [fA\u001f\u00e0\u00bd}\u008cn\u00db\u00f67\u00a2\u00ca>\u0081\u001bV]\u00fe\u001e7\u0099D=DC\u0090\u001f$g\u0086\u00868M\u001c\u0006\u0014\u00abm\u00edFi\u00d5\u00b3\u00d7\u00aa\u0011Y\u00ba\u0001pa\u0080\u00d8A\u00d1\u00ae\u0086\u00c3\u00b8\u0010\u00bc\u00a8\u00feU\u00b5\u00db\u0088\u00c1\u0090\u00d1\u00f0z\u001d\u0086\u00e3z\u00d0\u00de_\u00eb\u00aa\u001c\u00b2!\u00e9Q\u00db\u008ccD\u00cbN\u00ccn5\u009c\u001d\u00a1I\u00a2\u00bdQ\u0090\u00cd\u00d1\u000fR\u00a85\u00f2\u009e\u00d9:\"*\u00e4\u00b1d\u00a0*\u00fc\u00cd%r\u0018\u00a4\u00baE\u0097\u00e5E\u00e1\u00fa0\u0003\u0016W\u00ea\u00c7h\u008d\u0013*\n \u00be\u008f\u00f2\u00b97.\u00fa\u00cc{\u00bc\u00ab/v7\u00a3\u0098\u00d9d\u00a7\u00ef\u00b8'u\u008d\u0091\u008e\u00db\u009b\u009aQ\u00f6\u0098\u00850\u009c\u0087E\u00da\u00b6\u00043\u00a5\"\u008dj\u0093\u00e7(\u0083&\u00e8\u009d\u00d7\u001a2F\u00f0\u00f5\u00d0\u00e3\u00eb\u00e9\u00f2\u000b\u00b5\u00195\u00b7\u009eK\u00cao\u00a2\u00ac\u0087\u00ee\u0011\u00b0\u001a\u00c4\u0098\u00ff\u00f5\u00e2\u008c\u00db\u00e2!\u00cc\u0097\u00da\u001c\u00ec\u001a\u00b5\u00af\u00fd;\u0005\u00f2\u0085\u00d6\u00c2e\u0001\u00e7\u00b7\u0012\u0089\u00b5\u0095\u00c0\u00f2\u00ec\u00b6\u00ea\u00bd\u00f9r\u00fb\u0007\u00b9g\u00f0k'd\u0093B\u00e05 Nt\u00b7\u0016\u00e3\u0090*\u00c7`\u00d8\u00f3\u0014\u00d2\u00f1A0\u00fbY\u00cf\u00df\u00d0\u00a8\u00c2\u008d;'\u00d09\u0015\u0091\u00f9\u00c6\u0012\u00af\u00bf\u00ae 9\u00efB\u00c5\u00b3?\u00cc\u00bf\u00fe\u00ba^Ao\u008c\u009cy\u00b7\u00bd\u00ea\u00d6\u00e1\u00f1\u0013\u00beLn:\u00f6s\u001f\nimsG\u00e61\u00f6:\u00e00\u00e3\u0003\u00e7:\u00f9T\u0016U,v\u00b4\u0012b\u00e8\u009e\u00d9\u000b\u00a0U\u00fal\u00d2\u001e\u0086\u00e6o\u009b\u0094\u0083\u00b0;^\u00e2\u008e_@2\u009fd\u001c\f\u00df\u00b9e\u00c6YE\u00c3k7\u0086\u00a8Y`y\u00f2\u0086\u00c7xB\u00efT\u00a7\u00927\u001b\u00b4h\u00f3\u00ea\u0084\u000f*5\u00e8\u009d \"0\u00aco\u00e8\u000bfV>\u001a\u00de\u0094F\u0099\u0003P\u0098K\u00b8\u00a0+\u00d2f\\1\u0013\u00ee\u00b0\r4\u001f\u00a5p\u00b7^aE\"\u00da\u00a9\u00dfjP\u00d4\u00fc\u008e\u00985t\u0018(I\u00c1\u00aa\b\u00ff\u008aE\u00e0\u00ae\u00cb\u00a0Q?K\u00e6\u00b2\u0016J-\u00d3\u00b8R\u009c\u0017$u\u00d0\u009b\u00db\u0012\u00a1F\u00c6{\u00d7\u0099\u00f3\u00c7\u00bbL\u00f1dM\u0010\u00e0'L\u00d9\u00f1\u00dc\u00f1\u00cc\u008c\\\u0017wv\b\u0014\u00b5z'\u00e1^S\u00de\u00db\u001ai\u00b9\u0014/\u00c5\u00f7\u00a1\u009e\u00b7\u0095\u00e8\u0019$\u00dc\u000b\u00f7\u00cb\u00a3NA\u00f3\u009d\u00daq\u00f9\u0082\u00a7d\u0006\u0001\u00f9\u00e2;\u0006S\u00e6\u00a1\u00danX\u0003\u0086\u00bd|$\u0013'H7\"\u0096\u0001YT\u0005s\u00ebs\u00ca\u009d\u00df\u0015\u00f4\u00c1\u00b7\u00c87s3&OMLsB,\u00df\u0017\u00c4\u009d2\u00d8R<8\u00ae\u0090'f\t\u00ee\u008fM\f\u009b\u00f8\u00d3\u00d5\u00efl\u00c8\u00ba\u0018\u00b6\u0001\u0005Xl\u0084\u00be*\u00ad\u0013z<D\u009d=\u0080`1e\u008f[H\u00cb\u0002Vq\u00be\u0017ch\u0011\u00a9;\u00d9\t\u00daO\u00db,6q\u00df\u009ed\u00af\u00b8'{\u00e6\u0005\u00ab\u00d4\u00cb\u00f4g\u00f2m\u001d<\u00d2\u001d\u00d1]i\u0010&\u00cf\u0015\u008c\u00d9\u00c8\u001a\r\u00cf\u00a3\u009f\u001f\u009f\u008a\u001e\u00d4!S\u00c5\u00bem\u0085+\u00b9\u009a\u001f\u0081\u00d4\u00c6\u00d1\u00d87\u00c1M\u008e\u00f3\u00a3\u0012\u00f1eha\u00c2b.Ft\u001c\u00eb22\u00d7\u00ba\u00dc\u00baKn\u00b2\u00c2\u00a8\u001b\u00d3/R\u00b4!\u0087l\u00a0i\u00e8V,\u0088\u0089\u00e3I\u00b0=\u00991\u0016\u000b\u00bb\u00e5D=\u00d6$3q\u001a\u00cb\u0091\u00c2\u00a2\u00a4[H^\u00bds\u00f3\u00de!\u00f7[~\u00b2\u00f9\u00b3\u009f7\u009c\u00f7\u00faNi\u0010\u001f\u00e8:\u00a1\u0088\u0095z\u00a9GYB\u0090\u00d1\u00eb[\u00e7&\u00a1Ix+RK\u00b9)jA\u00b1 \u00e1!\u00c0\u00f1\u0088e\u00e2\u00e6[\n\u00b0s\u00e2V\u001a\u00ba\u00a3\u00f8\u0081`r^\u00bbVA\u00f6\u0094\u0083tN1b\u00d7J\u00f7F\u00bd!-\u00a7\u00c2\u00a1\u00a2\u007f\tO\u00ac\u00d3s\u0004\u00b8\u0092\u000f&\u009e\u00dc.K\u0094\u008e\"vi\u0000\u00c4\u00b6\u00b1\u00e5\u00f4`\u000e\u008e\u00b5\u0083\f\u00b65\u00cb%h\u00fefWl|\u00ee\u00a2%\u00b6\u00dc\u00e3\u00b1\u00ecB\u00b8\u00ce3\u000b.\u0092\u000b\u00eey\u00c1\u00ba\u00b8R\u00a8^/\u00e0\u00c6X\u00dey\u0006\u009a\u00a3\u00c0\u0087\u00a6\u00a34\u00ca\u0014F\u00cb\u00f8\u00ea\u00a0\u00ae\u00fd\u00adVL\u00ad\u00df\u0089\u00e8D\u00a51p\u00edn\u0085\u00f3]\u00c5\u008c\u0091$ZY\u00ee\u00b5\u00b0\u00ab\u00b3\u00bd\u0004\u00da\u00d6\u00de\u0092\u0090-!\u00b2\u00c8\u00c6\u00bf6C\u000b\u0096WB\u008f\u000e\u0002a\u00ef\u0016\u001c\u009c\u0002H\u001d-e\t\u00aa\u00eeM\u00ae\u0081\u00e7\u008e]\u0090\u00b4~o\u0091\u001d\u00bb\u00dd\u0081\u00b0E\u0096\u008eCRD\u00e7\u0099\u00fa\u00bf%\u00f51\u001a\u001d\u00d0\u0095>2P\u00d8\u00aeG\u0016\u00ca\u00d3\u00db\u00d6:G\u00ca\u00c9\u00fa\u0095\u0099n\u001a\u00bb\u008f\u00e2\u00a1\u00fb\u0080\u00c1c\u00f3/f\u00c2\u00ea\u0083\u008dq\u0002\u0014\u000e\u00f2\u0002\u0093O\u0016L\u001b\\B=\u0003*\u0081n\u0001\u0011\u0013lj\u008e<\u00f9qk\u00ea\u008f?\u00c2-\u0004h$\u00d9'\u00b6\u009d\u00df?T\u00186\u009c_\t\u00c6\u00ac\u00d7\u001by&\u0016x\u0092\u001a\u00ea\u00f9\u0092\u00f9\u009d\u0093\u00a3\u00f9@\u00b9\u00bd\u00f8\u0092\u008e\u00a9\u00ce\u00dbU*W\u00b3+\u00f18\u00c2P\n\u00b8\u00c2\u00c6\u00c4\u0016g\u00de\u00d2>w-\u00f9\u00e0\u0091\u001c\u001c\u00c9kg\u00f7#k\u00ba\u00b6L\u00e85UNt\u00ef\u0016\u00b9\u00fd\u0001\u00b8\u00ff\u00f8my\u0006S\u00f8yhGi/wFF\u00ff9c;\u00cd\u00a7\u0016\u00b2\u0011\u008d\u0004A\u0090\u0010^`\u00d9\u00ecy\u0001\u000f\u00f0@7,&\u00a1\u0094j\u0096\u00b0\u00d9\u0088Gb\u00a3\u00b4'\u00de\u00f5\u0003\u00d1\"\u00c3\u00eb\u00deq)T\u00bb\u001e\u00c1\u00abs\u0086f+Z>-~\u0081{]z\u00b9I5\u00bc\u00efE\u00de\u00e4\u0081\u00e3)\u00afua\u0088Ux\b\u008f!\u00e5\u0001\u0005\u00b3\u00ee:\u0006P\u0014\u0084:\u00e0\u00fa\u008a[?\u0093\u00f3\u001e\u0096>\u0011#i\u00f2\u0095D\u00f4\u0090w\u00bdl\u00f1\u00ae\u00a8\u0007\u00ca\u00bbEy%\u001f\u00a3\u00a9[\u009c\u00f8\u00dc\b\u0007\u00b4\u00e6+\u008b\u00bd\u00eb\u00df\u0094~\u00dbO\u001e\u00bdu\u0091\u00ddn\u0003\u00cc\u00b5\u00b0\u0095\u00b6\u0088\u0081>\u00d9\u00da\u0011\u00f2\u0088\u0011\u00a6\u00e1~\u00b1v[t\u00ec\r\u0018\u00e2\u00d3\u00f7U\u0095&\u009c\u0001\u00cd\u001a\u00bce#\u0092\u0010\u0084\u0019\u0012\u007f8\u0007\u001e\u001d\u00c8\b\u00b2R[\u00cfgT\u0007k\u0091y\u00c7\u007f4\u00a9YBc6\u009er\u0094\u0018\u00dd\u00a2\u00e9b.I\u00029\u00b3f\u00d7\u00df/'\u0093\u0014\u000b\u0083sy\u001c\u00e85\u00f1\u00fa4\u00ed\u001b}\u00ea\u0000\u00e5\u00d4\u00e1[,w\u0007r\u0089U\u00e9]J(LO\u0081,\u00b4\u00fa\u0091.\u00fb\u00df$\u00fd\u00e1\u00b7\u00e1\u00c8\u00d2\u0093S\u000b\u008c\u0002\u00f0\u00aa\u00d7W\u00f5\u00da\u00ee\u0019d\u00f7_\u00b0\u00ee\u009f\u0005\u00bba\u00a83\u00f0\u00cd1\u00ef\u00b2_I+^\u00c6s\fa}4 \u00ed\u00a0\u00c9\u0001}|\u0006\u00ae\u00b8\u009a\u00df7\u00fc\u0006\u00c2v\u00b3\u000f\u00e8\u0004;d\u00e0\u00b2\u0001\u00aa\u0096\u00de\u00c2B3\u00e6\u0001k\u00bfD\u00c6\u00b9\u0086\u00f5\u0094\u0012\u00fbX[hF\u0016\u00c73\u00068$\u00de@E5\u0083i5\u00f3\u0007\u00b4\u0000\u00c4\f\u009c\u00f6\u0092\u00c8\\\u0012\u00ac\u0013\u00a6\u00c1\u00a5t!\u00c8R\u000f\u00abn\u00e9\u00d6\u00d1q\u00fc\u00ac\u00ff\u00d5\u00d0{\u0001\u00a1\u00a4\u00d5e\u0013!\u00a6r\u0084\u00bf\u00e7z\u00bc\u0006\u001d^\u0090\u00e0\u00d9om\u00f5\u00b3:B\u00dd`?^r\f\u00b9\u001bv+\u0099\u00dat\r=\u0016f$\u0098X\u00fa\u00b9\u0084_T\b\u00e3\u0092\u00b1C\u00b7\u0013-\u009a\u00d1\u00d6\u00fb\u00e9Eg\u00d3L\u00c0\u0003\u00ce\u00d2\u0097eY\u00f1\u00be\u00d2\u0095\u00f0\u00ba\u0007P\u00ab\u0097\u00ea\u00f3\u00c0\u00ab=:\u0097\u0083lF\u00c3\u001f\u0096\u00fc`\u0092\u00a1O\u00a4\u0095s\u00fd\u009eb=H\u00d3\u00f3w\u00a3\u00d4\u0018\u008a-Z\u00d6\u00d3\u00aa\u00eeU\u00a2\u00f8\u00df\u0090!S\u00c7\u009a\u001b\u0081!\u008bD\u00e0\u00ad\u00ef\u00fa1y4\u00bb\u00ac\u00ab([\u00db\u00fe[q\u00f0N0\u00a0\u00f3I\u00e9\u001b\u00ad\u0090-8\u00f2yL \u00ef\u00c5\u00bdaD\u0001\u00b0\u00fd\u00f9>\u00e8u\u0016k\u0013\u0003\u00ecs\u00e4\u00e1\u00feR\u0015\u00f389\u00d1\u00c3\u00bb'\u000er<\u00de\u00c9\u0093j\u001a\u0088\u0014\u008a\u00ef\u00df1\u00d61s\u001cdio\u0007\u0084`\u00e0\u00c4\u00da\u0091d}\u00da\u00ce\u00ab@\u00ba%i}(~\u0091v\u0086=\u00d9r\u0095\u00ea\u00f8\u00c1\u00b8N\u0081T\u0085\u00a77gMsE;v\u0014W\u00e6\u001f9\u001b|\u00f9hV\u0004\u001a\u00d9\"K\u00ff\u00a5V\u00de\u00ec:\u0019\u008a\u00e7\u00a8\u009aU8\u00edE.\u00e1\u0086\u00d6\u0019\u00d4\u0003;\u00d8\u00ce\u00c4j\u009eq\u0093\u008e8$\u0093\u00ac\u008f\u00b8vOg\u0017\u00b4\u00a7\u00bdS\u00d9\u00fb\u00c3\u00d2\u00e3\u001a\u0086\u00c3\u00aa\u00e2\u00f4~;>\u00b4\u00e0Q\u0012\u00fd\u0085i\u009f\u009d\u00fc\u008c\u00ea\u0010\u00ac%\u00ff\u0086\u009d1\u0010\u0017\u00be0[C\u009a\u00bfX\u0005_\u0092\u00c5\u00cf\u00ba\\g\u00ce\u00b0RPVx\"Ki\u00f2\u008ac\r\u00beO\u0010\u00bbG\u00fa9\u00ea\u00fa\u00f3\u00f1D\u00bbCmu4\u0002\u00e4\u00d5O\u0081\u008d\u00dc\u00c20,\u00ec\u00b1\u00d79U\u00dbr\u008a\u008e\u00d7\u00acJ\u0089\u0093\u00bc\u0000\u00ae\u00e1a\u00e6\u008f\u009dz\u001bU\u00b4d\u00eae1*|K6iS\u00c4\u0083\u0098\u00a5f\u00f1\u00f3\u009a\u0011\u00ac\u00a5\u00b2U\u00dd?\u0003\u0014\u0085\u001a\u00cb\u0081\u0090\u0082X\u008b#\u009c@\u0099_9\u00e67\u00fe\u00926\u00ee\u00a1}'\u00cd\u00fa\u00fb\u00f0T\u0006\u00c2H\u00fd\u00b9\u000b\u001c\u00d7\u00eewD\u0098\u00e9y\u0018\u00ff:\u00d4\u00d5\u0090\u00e1\u00ce7\u00cf\u00d6v$\u00efu\u00e9\u0080JA\\\u00a6\"B\u00a9z\tI\u00c9\u00c2\u00d2\u00c55\u00f9_{\u00a8\u00fe\u00ef\u000eLH\u0092\u0000N<\u00b5\u00a4z\u00a5\u00e9\u000b_\u00e6c\u0097\u00c7xL1\u008d#\u0084\u00947O\u0019\u00bc\u00af\u001bn\u008a\u0091[d\u00ab\u00fd3\u00967\u00da:\u00fd\u00f4\u00fa\u008c zV\u000e\u007f\u00a3\u009eefY\u00b3\u00a3\u00f9\u00dfL\f\u00aaM\u00d0\u0092\u008e\"B\u00c6\u0017CX\u00859\u0085\u0011MI|\u008a\u00af9y\u008f\u00f5w\u009f\u0090s\u00a13\u00cfB\u0084\u00c7\u00bc\u0086\u00c0$|\u00eb\bc\"ad\u00b6\u00a6\u00f0\u00ba%@\u0091\u00e2S\u0006^\u00ebXrX\u00d2\u0016\u00ced\u00f9y6\u00a4r\u00dc\u008cC\n\u00d1?\u000e\u00c3R0\u00e8)u\u0090\u009b\u0018m\u0088G\u00fd\u00a8\r\u00b5f\u009ev\u0091\u00e48\u00d8P\u001b\u00eb\u0092\u00ad\u00af\u0006\u00f8\u00a3\u00e1\u0001\u0018\u00ceq\u008b\u0084be\u00f6X'Bs EAY\u0093\u00a7\u00dcp\u000e}C@)\u00eb\u0082\u008e\u00fcV\u00ebm\u00b5\u0007\u008e\u00e8\u00c36\u000e\u00f5\u00ef\u0082-\u007f\u00e5S\u00bd\u00cf\u00dc\u00f4U2\u00dbOL\u00fbtU0\"\u00a8\u00dc\u00cc26\u00bf7\\P\u00fbS\u001e/S\u00e0t\u00f649\u001b\u00fb\u00de\u00cb\b\u0015\u00d2\r\u00baj\u00fe\u0094\u00cf\u0011\u00abc*\u0085\u0084Iv\u009c5\u0002\u00ea\u00b4R\u00a9\u00bf]\b\u00e8h\u008b\u000e\u00c3dn\u0080\u0082\u0006@+\u00ba#\u00f1\u00e4i\u00b0\u00dc\u00ea\u00d8\u0095e\u00fe\u009c\u00efTo\u00ae@Rn\u00a1\u00bef/\u008cY\u00c3\u00fd\u009f \u00ce\u0088\u00c3\u00f8=8G\u0006\u0015\u0095\u0002\u001d8\t\u00c5Hm}\u00b3\u00c8\u000e\u00d3\u0007\u0019\u0002\u00b3\u00e5\u00b5\u00b6N\u00d4\u00d8\n\u00b9m6\u00ad\"\u00d2\u00f4!K\u00bf.R:\u008d\u00dbA#\u00f5Ryb\u00cf\\^\u001cK\u00a1\u00cd\u00ef\u0018\u00aa\u0096\u001c\u0092F\u00b4\u0087\u00f0!6\u00cb\u00e6z\u009b\u0003\u00c8WB\tG\u00db\u001e\u00a5PT_\u00e7\u0094\u0092k\u00bfb\u0004\u00c9\u00d8\u0083\u00c1\u00a2\u0098\u0092f\u00d7\u00cb\u00ed9\u00d3&\n\u00da\u00be\u0010\u0090o\u00df\u0080\u00aa\u0087\u00db\u0095\u00b8~k\u00f4A\u00fa\u00efI\u009b\u00af\u0019~!Y<\u00fcK \u00d6\u00e6g\u00f7\u00e4\u0083\u0084J\u00d6\n\u00f9\u00cc\u00c5\u00c4\u007f\u0091\u00e2S\u001b\u0088%2{C\u00d9W#\u0012\u00b0'U\u00b7\u00e6\u00cb\u00c9R\u001fU\u0085\n\u00f0\u00c9\u0016\u0002B\u00899\u000eS\u0006\u00c1\u008e4?s8\u00e3\u008a\u008b\u00a5\u00886\u0012\u00eb\u00d2\u00a8\u00a5\"d\u008c\u0003!\u00db\u00baLk\u0015\u0081\u00ebp\u0018\u00d7\u009c \u00ad\u0084\u00a4B\u00cd\u00be\u00d4Y\u008c\u00e2\u001e\u0082\u001e,\u00b6\u008fQ\u00bas\u00b3\u0086\u00a6\u00dbR?\u00c9\u00df\u008e\u009eZ\u00973\u00ad(\u0007@v$:\u00cbD\u0082O%\u0083_\u00d4x\u00c8f\u00af\u0085@0\u001c\u00f0j\u00c5\"\u001c>h\u00af\u009ftY\u00dc%_\u00d2X\u00d5mH\u00beG\u0085y\u0013\u0093m\u0099TX\u001a\u000e\u0085\u00c5\u00d8\u00f3u\u00a5\u00c4\t\u00ca\u00af_G28\u00ec\u00cbv2w\"rM\u00b5+\u0081\u00b1z%\u00a3\u00185\u00df\u00aa\u00a92\u0017]U\\\u0098\u00c6)|\u00a2g\u00c0K\u009c\u00ef\u0001\u00b3Ux!\u0098\u00eaS]c\u0096\u00c5\u0091\u00f7\u00c3\b\u009e\u0084\u00cb%X)\u00c4\u00be\u00a4\u0019\u0093qt<\u00a7\u008b\u0012m\u00f3\u00cf'\u0089\u00c6O\u00ea\r\u008e\u0082\u00fc\u00b2}\u009e*\u00aa\u00ffG'\u00e7\u008b|\u0084\u00ce!Q\u00c0\u0002\u001f\u00e4\u00afq|\u009c\u001a\u0004\u00dd\u008cdsN\u00bd\u00df#H\u00deh\u000f\u00e6\u00ab\u0016\u0080\u0091\u009c&\u00ec.`\u0090\u00cdv\u00ce%\u00e5\u00b0\u0019\u00f8\u009e\u0093X\u00fbmY\u00b1g\u00c1\u00b8;\u00c0\u00c4\u0007\u00b8u\u00f1\u0002\u0093\u00c8tJ\u00cf\u00b7i)\u00c9\u00aa\u00d2\u00ab\u00b3Ow\u0015\u00eem\u008e3w\u0094\u00f5b\u00c1R<\u0003\u00b3_\u00df\u00d3\u000f`\u0013\u00c1\u00a9\u001e\u001f?\u00c0\u00d53\u0007\u0007\u0010\u00c8\u001d\u00db\u00d9\u00a4\u0097\u00ba\u00ba\u0099\u007fwt\u00c4[\u0002x\u00bbP\u00aay\u00a6\u00d8\u00b6\u00b1\u00b9\u009a\u0086\u00fb7\u0095*:\u00e7U\u00b3\u00e1\u00ab\f\u00dc\u00be\u0089\u00dd\u00e4\u00fa\u0080\u00f7f\u0010\u0018\u00df\u00e8\u00ce\u00f8\u00f0\u00a2}\u00d0i\u008e\u00e2\u00c9\u00d6\u008bO\u00ba4\u00af\u0084e#N\u0018\f\u00e2W'p\u00d5!c\u001d\u0012\u00bc\u00ee\u001b\u00ba\u00ca\u009bZ\u00fc0\u00a7v\u00c7\u00c4\"\u00bf\u0018\u00cc\u00ad\u009cp1m;\u00ea\u001fBH\u0087\u008c\u0094-\u0014\u00a5\u0004\u00c65\u0085\u00ce\u00a3X\u00b5\u001f\u0088\u00ff)\u00c5\u00d2\u00fc\u00f3d\u00bax@\u00fc\u00ec\u001f\u00a8S\u0098\u00c2\u00a8?~\u0010\u00db[\u00ee\u001a6\u00b0\u009c\u001b^)7\u00169}`\u008f\u00f2@\u008d\u00ca\u00d2\u00ce'G`\u00a0\u0083w\u00d77m\u00af\"H\u0003\u00a2h\u0092\u0082\u00ce\u00c2\u008c\u0012bI\u0094A\u00f4p\u00ecT.\u00b05\n1\u0084\u0012\u00ad\u0011\u00f5\u0012\u0086\u0012\u00d7\u00c7,B+\u00edD\u0005\u00f6g\u001b\u00c3\u0095\u00b3\u00e1\u008ax\u00a8*\u00f4\u00c1\u0087FY\u0081\u00c9\u00e6\u0005n\u00a2\u001ao\u008c\u0086\u00b2\u00c8\u0017\\\u00ba\u00f1\"\u00fe\u00a5\u00ab/j\u000f\u001d)\u0019\u008d\u0014RUK\u00e3\u007f=\u00eb\u00d2\t\u00c5\u00fd\u00d0\u00df\u00c9`\u009ed\u00f55\u00f1\u00ddD'\b\u00dc%q\u0081\u009a\u00cb\u009a%\u00fb3\u00ab\u00a2\u00ebF\u00c7\u00b7\u00c9\u0089\u0086.[\u00de\u00a0$j\u009c\u007f\u00c8\u00e9$&\u0085xQE\n\u00cbD^\u00c7\u0099\u00a3\u00a9\u00c6\u00b2\u0014\u008f$\u0005L\u00c0\u00c9\u00be}+\u0080lljq\r\u00c0M]\u0003\u00fd\u007f\u0007\u0000\u001b.A\u0080\u008f\u00bcb\u00eb\u00edA\u00af\u00ff\u0011\u00ab\u00b9&\u0015B@\u00bc\u00ff\u00c5\u00c6\u0080u7i\u00b6sf\u0089\u0011|#@\u0002\u008b\u00cd\t\u00e6\u00d7\u00cd\u0085Z6n\u00d8_h\u00d2V\u00de5\u0081\u00b02\u00c8>h\u0001?\u0007\u00fc\u00f6@\u00fbE\u00c2S\u0094\u00db\u0012\u00f8\u0017\u0000\u009es\u00fa\u00c5\u00a3#\u00d9\u00a2-~\u0083\u00bb\u00fd\u0096jXF\u00d9g\u008bQB\u00ca}\u0082\u00d0F\u00f6b\u001b\bNf`8\u0010\u00e4_B\u00f9y\u000b\u00a6\u008d\u0099\u0006\u0089\u00e37\u00df\u008f\u0006\u0099]L\u0084n\u0016\u00d1\u00c2\u009f\u00bcL\u00c0\u00a6l\u00ad\u0082uy\u0018\u00ea\u0084,a\u009f\u00bf\u00cc+\"'\u00d4\u0011\u00810\u008c\u00de\u00e5E\u00d3\u00a7\u00c4\u00a17\u0003\t\u0092\u00c97\u00fc\u00b2\u00e8x\u00e8\u0000\u0089\u00cd\u0080\u00fc\u00c5\u00b7r\u00ab{\u00df/\u00d6o\u00e4\u00f9\u00df\u00d6B\u00d60\u00ec\u001fq\u00b8\u009a\u00ad\u0081\u008d\u00f0\u00b6\u00c0\u00a7\u00cao\u00ef\u00a0\u00dcY\u0099\u00e3\u0007\u00b2]\u009c<\u00d8\u001c\u0007BE\u00a44\u00aa,\u0082\u0098t\u0012\u00c1\u0004\u00c7<\u0083%K\u008d\u00ec\u0012\u00fd\u00e4\u0007\u00deS\u0081}\u00e8\u000f\u00c8O\\\u00e2\u00de\u00ec\u00a3\u0096\u00c6\u00d9;\u000fA!\u0002D3W\u00cc\u0000\u00e4\u00125\b>\u00cbK\u00d7\u00ae\u00f0\u00c2*\u00fa\u00f5s\u0094\u00f0a=\u001c\u0019\u00a7\u00ae-\u00f1\u00eb\u0003\u000f)\u00f3\u00d2\u008bP\u00fe\u00fe\u00ea\u0099m\u0006q\u0093\u00b3\u0083\u008b\u00eb\u00da\u0004\u0090o_@\u009bpP(\u00dd!\t\u0084\u0092\u001a\u0090\u001ewM7\u009b\u009cG\u008fU\u00fd-\u00bd\u0082\u00e3C\u0012\u00bbu\u00e4\u00b2\u001b\u0085\u00b3\"\u0081\u00e4\u00a31\u00af\u00ee\u00ef\u00d4\u008c\u00bf\u00ac\u00d7\u00da\u00d3a\u00e9:\u009b\u00c0;\u00fe[\u008f\u00ce\u00d3s\u00aa\u00f0$\u0081\u001a2v\u0092(\u00cd\u00fb\u00f2\u0011vAb\u00cc.\u00c9\u00c9\u00c4\u00ca\u00a3\u00a5^z\b'x\u0095\u00cc\u00da\u00ac\u00a3\u00b0\u00ad\u00f4\u0087\u00eem\u000f\u00c2\u00f4\u00d1N\u00a9\u00b8\u00a5=\u00e4\u009aM\u00dc4\u00d6\u0082\u0088\u00ca\u0096\u00ee8\u0086\u00e6\u00c9\u00f1\u00f8\u00dd\u0016\u00b1\u0089\u00e7\u00db\t\u0000\u0011\u00a5\u00c5\u00c3X\u00b1u\"\u00aa]\u000b\u0004!p\u0005/\u00ad\u00ab\n\u009dy\u00b8\u00e5\u00eak\u00af\u001f\u0003\u00a5\u00c3xz\bq\u008f\u00ca}\u0086QV_\u0012\u00eb+U_we*\u00de\u00ad]X\r\u00a8\u0019\u001e\u00f7H\u000e\u00f2\u00aa\u00f8\u00d9\u00a7\u00ffB\u00cc\u00cce\u00cf\u00e8\u0002\u00b0\u0015\u0006\u009d\u00da0\u0089\r,\u0014\u000f\u009b.\u0092k\u00db\u0091o\u00bc\u0011\u0089D\u0016<\u0007\u00eaW\u00ed^)\u00ea\u009a\u00af\u00ac\u0091R\r>\u0002\u00f6\u0080\u00f6<Ur\u0081D\u0007V\u00eb-\u00af!\u0002\u00be\u00ff\u0090\u00da\u0086\u00d2\u0097\u00d0\u00aa\u00c1t\u00f5\u00bf\u00f05Sq?d\u00db$0\u00aeJ\u00b3\u0006\u00d2\u00db\u00ed\u0004oO\u0006\u0097\u0094l\u00b6\u00fb\r\u00f2\u00fa\u00f2\u00bdn\u00ce\u00fb\u0087\u0018\u00e2\u00bdSy\u00de\u0005t\u00c5\u0092\u00dd\u00d1 Q\u009b%<\u0004k\u00cf\u00e0J`\u009e\u0080\u00cb\u00f6A\u0002\u00ab\u001c\u0012c\u00bf)87\u0093\u00a7\n\u00d2q||}\u009cc\u00c2pRHWL\u009c\b|\u0014\u00d8\u001b\u00de\u001a\u00a3\u00b3\u00b3I!T[\u001eB\u0087-\u0088s\u00de\u0019\u008f\u0091h\u009e\u00f3L,\u00e2\u00ce\u00c8\u0019r\u00bb\u00e8\u00b8\u00d0\u00e7;\u0013\u00aaN\u0017#\u0019\u0094x\u00fe\u0084\u00df\u00ed\u0010N\u00b9\u0003\u008b\u00f7\u000fK\u0093\u00bc\u0087\u00b5\u00de\u0084\u00e8\u0003}W\u00c8|z\u0083\u00b2L@\u00cc\u0084\u00e1\u00d7\u00e1\u0099OO\u00a8\u001d\u0092\u0091\u0017C\u00f9\u00fd\u008d\u00ec cD\u00b1\u0088\u00cb)c\u00e7d\u00fc\u007f\u00db^\u00aaS\u00d6 \u0099!\u00a1\u00b4\u00ed\u0005\u00af\u0016\u0098\u00d9\u00ee\f\u00e1\u00ff\u00c9\u00e4\u00c0p.\u00c7\u008e\u001d0q 1E\u00f5\u00a9\u00ef\t4\u0019{[.\u00ae}\u00a1]\u000e=w\u007f\u009ed\u0094{T\u0095\u00ac\u00b7\u00ad\u0091p0(\u0093\u0084\u00f1\u0081\u00d5\u00e1\u00c0\u00f31\u00e6\u0095\u00e9\u00b4\u00e3\u0080(\u00d8\u00ce\u001b\u00e6\u00b1\u00a2<\u00f4\u0010\u008bb!\u00e1\u00ef\\\u00bbu\u009dk7\u0084FN\u008e;5S\u00f6,\u0096\u00c09\u00a2\u008f\u0092\u009cs\u00f2~\u0018\u00ef_\to{\ft\u00d3I#\u0003\u00ab4\u00a1\u009cz\u00c5\u0093\u0086\u00d4\u00ac\u00e2\u009b\u008f\u00d47%\u00e0\u00b5Z\u00d4\u00ff\f/1&\u00f4\u00c6Mc\u00ed\u00b1\u000b\u00c4=\u0092\u00d09\u00878r\u00bf\u00df\u0019\u00d5d\u00fe\u0097,'R\u008f\u0096\u001b\f\u00d9\u00afj \u0006\u00f8C<\u008c\u001c\u00c5\u00d2\u00a3\u00d3P\u00c58\u00c2[\u00dcb1&\u00b7>\u00ccJ\u0016\u001b\u00984\u00c1-{\u00bb\u00c4^\u00b0i\u00ebPr\u00c5\u00cf\u0085\u0012\u00b5J\u007f\u00cdG57\u00b3\u00e0\u0013\u00ac|W\u0088\u0013_\u00ab\u00fd\u0005h\u00e4P-\u00b84-\u00fe\u0001}y'\u00e9\u009e\u00ef\u00aef\u0084[\u0005G\n\u00dd\u00ff\u0081A%G\u00d8\u00c2\u009b\u001e/\u0092^hs\u0098b\u00e7\u00f7\b`2\u00d0\u00e6gb\u00d8\u00dd\u00a6\u00bd\u00d4j\u00ebZ\u00ab\u008a\u00a7\u00aa\u00d3\b\u00b4.\u00fcj\u00efYn-\u00b4\u00e0y\u00f6\u00af\u00bf\u0088\u0005\u0017$\u00d3\u00b4\u00de\u0013\u0092W\u00ea(\"f\u0015.U3\u008aA\u0007\u00cf|\u00ed\u0010l=\u00ad\u00d9w\u00dd1\u0012C\u00a9\u008f\u00faa\u00c0\u00eb\u00c3\u00b7|\u00b3\u008b\u000e\u009be\u00d2\u009a\\\u008e~\u00bc\u00e3\u00e7R\u00b4\u0092N\u00db0\u008b.\u0096b@\\\u000f\u00c7\u00bf\u00c6\u0091\u00d4\u00d7\u0095\u00dd\u00e6&\u0086\u0094\u00daGh\u00fe\u0090O\u00e3\u00e6\u00f6\u00af%\u001bIb\u00a60\u008b\u0084[\u00b5\u00b0\u0080\u0000x\u00d1\u0095Z\u00ab\u00c0\b\u00b8\u0014\u0001V\u00bd\u00e9#\u00ecF\u0086\u00e2\u0018\u0010u\u0002\u00d6\u00dd]\u001b\u00ccO\u0096\u00bd\u00c6B\u00d2:Z'E8\u00b1\u001d\u009cpk\bC\u0084g\u00ebc>lP\u00d1\u00e3h\u00ad\u00d1dGn\u0098\u00d0|H\u00ecz\u00da\u0011\u00c3\f\u0016w\u00e59\u0097\u00a5\u00d4\u00e5\u0080\u00e7\u00a8\u00d8f\u009bY\b,NdY\u00dc\u0000W\u00bb-\u008aE$1\u00c2\u00cf\u00c1\u0086\u00b2R5'\u00da\u00fd\u00ab\u00c6n<A\u0096:\u00b3\u00d7H\u009bs\u0006K\u00de\u00c6\u0084uU\u00a2|\u000f\u00aa\u00ff\u00c0m\u00e1\u00c0\u00ab\u00ee\u00ecz\u00c4#\u0099\u00c7\u0000%~o\u00a0s`\u00bbi^\u00c5\u008d\u00c5\u00d4\u00d3\u000e{\u009b<G\u00f3\u000f\u00fd\u001e^\u00e0kXB\u00e1\u0013\u0007\u0003M\u001f\u00fc\u00d9[\u009f\u0003\u00fd\u00d8Z\u0016&\u00db\u00d2\u00df\u0003\u00a3u\u00e0\u00d7\u0087Y\u0081/\u00c5m\u0093\u00df\u0019\u00aa\u0087\u00f4{\u00c3\u0082\u008f\u00d1(\u00cf\u00df\u00b6Q2\u0017,W\u0094\u0098\u00fc\u00caR=\u00ed\u00f4j\u009a\u0097K\u0094L\u0015o\u00f6r\u001d\u00bb\u00a9\u00b8\u0004R\u00a9\u00cb\u00e8\u00d1\\\u00b3Y\u00e1.\u00d1,\u0087$\u00c2\u00d6\u00bf\u00e4N\u008e\u00a8\u00cb\u00b0\u0095\u00bd\u0094-6\u0093{\b\u00fe\u00fbF9\u00ce%\u0093P\u00c0\u00f1\u0080\u00b8IgA\t\u00ce\u00b9l\u00d9\u000b\u00f00\u00b4\u00bfF\u008c\u009d\u00e1\u008eC\u0005uj \u00b4\u008c\u0005-\u00bf1\u00ec\u00a3\u00f6a8\u00a4E\u001a\u0084\u000b\u00f9C\u00d8EB\u007f\u00dc\u00f9K\u000eH\u00171\u00aa\u00e8\u00e7\u00d7\u00b2\t\u00fa\u00f9\u00a09-\u009d\u00c0)\u00e8Z\u0080\u008d!\u0019\u00845\u00ca\u00b6\u0017#\u00f7\u00c2\u0019\u00b8\u009a)n\u001b\u000b)5\u00f9HeQD\u00e9\u00c7\u00f4\u0017\u009a\u00a4'\u00f8\u00e1\u00d9>\u00b1z/\u0010\u0001V_6\u00a3\u00c1\u0004\u0000\u00fcs\u00a0\u00b9\"\u0092\u00fb\r\u00ea\u001fC\u0080\u00a2\u00ad|\u00aa\u00da\u0092b\u0000\u0001D\u00d0\u00efw\u008d45\u00cb\u0094\u00df\u00e9\r\u00f8\u00cf\u0097\u00de\u00ed\u00a0\u00fb'F\u0012L1\u00de\u00e3\u00841\u00b5\u001a\u00d6Y}/\u00d3\r\u00c9\u009c`\u00f6\u0097[X\r\u00f2:\u00c9\u00b1\u009f;\u0003$\u001f\u007f|\u00f6:Z\u0092\u00c3x\u00d0\u00ae\u00daL&\u0093\u00a6\u0003e\u009c^\u00aa)/\u00cc\u00c8}9\u0099j\u00ff\u0010c\u0015\u00b2\u00a9w\u008e\u00ad\u0005\u00bfd\u00bda;\u00e1b\u00f5X\t(\u00fd\u00e0\u001c\u00a8\u00a0n!T_\u00cd\u001b\u00ee)!\"\u00ec8\u00b7\u00c98\u00b8\u00d2i\u00be`\u00bb\u00f8U\u00b8\u00b3\u00bc\u00fa\u0080\u00a8\u00fc]\u009d{\u00c5\u00ee\u00c4\f}N\u00f5\u00afQ\u00f7\u00aa\u00a7\u00d7\u00ba\u0096%\u007f\u008aa\u00d0mz\u00bfy\u00b3\u00ae\u0085\u00e2\u00ef\u0003\u0003\u0084\u0083gM\u001b\u00e8\u00ea\u0095=\u00d0\u0086\u00f4\u00b4\f\u00fe~\u0015s9\u00dch\u00ec\u00bc\\k\u0095Y\u001b\u00a34e3:\u0005\u009b\u00dc\u00c2\u0016\u00aa\u00ab;_\u00c9A\u0012\u00e1\n\u001e\u00aa\u009b\u009f\u0087E\u0099\u001f`DU\u00d9\u00f8\u00b1\u0096U\u00cc\u00b0W\u00fd\u00a0\u0002\u00f0\u0088\u009f\u00b0\u00b0\u001f\u008d\u000f\u0019\u00c4b<j\u00b4o\u008c\u0000\u008f>N\u00f7\u00e7L\u00f56\u00eeEf09.\u00fb6(D\u00b9\u00ff\u00c9\u0001\u007f\u00ff\u00e9\u00a7\u00e7t-\u00f2\u0010\u00c6\u0015,\u00cb\u007f\u00811?\u00c2\u00f9\u00de\u00ff\u0001\u00f8j\u0081\u0018\u0099\u001aY\u009c\u00df\u0017\u00d7:\u00df\u00b9\u00aaE\u00c7\u008fY\u0004\t\u00ffw\u00e8\u00da\u000b%a\u00dd\u00b6\u00a3\u00f3!\u00a5\u00dd\u00aa\u00ffo8\u00e3{zm!\u00e9\u00bc\u00ae}\u00939\u0085\u00b5\u00d0)\u00b8\u00ab$A\u00866\u0083ij\u0001\u000eQ\u00c7j\u000b\u00f4\u009a\u0097c3_\u008c\u0096\u0013\u00a0\u00913\u0012\u00c3f\u00c2\u0006\u0004\n\u00e4\u00a8I\u0091\u00c8\u00a4\u00f9p\u00f6\u0013\u00c5E \u00d5\u00beK\u00a2WJ\u0013\u0089\u0017\u00f2\u00d4ULSug\u00bf\u0088\u00cb\u0082^\u00ce\u0002}\u00ad\u000f\u00b0\u00bb\u00c1-\u00f3C\u00be\u008e\u00f0\u001d__`\u00ca\u00d6\u0005\u00bf\u00a5\u00d9_vS\u00d5\u008c\u00bebx\u008d\u000b\u0081b\u001dqz\u0082\u00e2w\u008d'\u00bc\u0019\u00d8\u00c3\u0014\u00a6\u0087\u00de\u00f67\u0093ryr]\u0082X{\u00f0\u00c6.\u00aa\u00b2\nQ\u00dd\u00b3u\u00fb\u001e\u0088<\u00bekc\u00b4\u00f4k_\u00b7y\u00bb\u00f6p\u0018^\u0002P\u0018\u00e7o\u00a7N\u00deh\u00c8\u00da\u00afHG\u0095\u007f\u00b8\u008e\u0097qw\u00ceg=\u001c\u0001\u0092\f\u0011v\u00886\u00c1,_:Hq5\u0091\u00af}Q\u00cf\u009c\u007f\u00d5\u0096\u00a6\u0092\u0080)\u00f4\b\u00bf\u00b3\u00a1\u0099?[Fj\u00aa2\u00de\u00b3\u001a;\u00c2\u00b9Oz\u009c,\u00f2\u00c4\u00b5\u00achf>k\u00e2\u0081y$\u00e9`_\u000b\u00eeSI\u00bf1\u0000\u00f9\u000e\u008f\u00e5\u0099\u00fb\u009c\u00a6\\\u0011\u0090\u0083\u00e0\u000f\u001f\u00a6\u00b9&AKo\u00f4\u00dbU\\Q\n\u00ccA\u00ea``\\\u00ee\u00ebE\u0092\u000b\u00f41\u0014,Q\u00f4\u00f2\u00fb\u00d0\u00c6\u0097+\f\u00fe\u00b3\u00c5\u0014\u001e\u00a9\u00eb\u00b6\u00ca\u00e4\u0095\u0089M\u0086+'_\u00b1\u0090\u00e4f\u001e\u00bfC\u00bd\u0090#\f\u0088\u009c\u000et\u0080\u00e3\u00e3\u00f1Kp\u00de8\u00f5\u0014\u00e8Sa\u0099\u00c2\u0001\u00df\u00a0\u00a6\u00ee\u00bd\n\u00fe\u00a8\u001b\u00dc)#\u00e3\u000b1Q\u00cd\u0006\u00d4\u001f\u00d8\u009d\u00ec$u\u007fz\u00bc\u009dn\u0012\u00db+c\u007f\u0007q\u00d3\u0082;\u0080\u00bc\u00e11\u00ecl\u00b0\u0006t>\n \u008d\u00e2\u00cdgV\u001a\u00c5\u001f\u00b9\b\u00d6-\u00b0X\u00f0\u008f\u00d75\r?&\u0099\u00f0\u0089l\u00b9\u00d7\u00a2\u00b3c\u00f2\u0010\u00d9-\u00f5\u00ba\u00a1\u008d\u00e4\u008c/\u00ff\u00a9l\u0081\"8\u0085wa\u00ed\u0085\u00a3\u00b6\u00ac\u00da\u00ab|M\u008d.\u0094\u0083\u00d4\u0096K\u00d92\r\u00dd\u00ab6*\u00b3\n\u00aed\u001e\u00baty\u0017Q\u0006\u00e2'O\u00ffb6I.\u00a9\u00eb\u00aagT\u00cf\u00d4\u00c6\u00c34\u00a4k\u00b7j-_e\u00c2\u00b1t\u00d9u\u001e!\u00c5\u00c5\u00ac\u00baA\u00a0\u00a1\u00ef\u009bo\u00b3\u00db\u00f00\u00ef\u008b!\u00f0C\u0006\u009dTm\u0083\u00b3)\u00e0\u00b7\u00e2\n\u00f0\u0017\u0095\u00ffAP\u00146\u00f1\u00f0\u00f13\u001bR5[\u00fdt\u0093\u009e\u0015\\c\u00d6l\u00d8S\u00c8\u00f3\u000e\u00d6\u00c7\u009c\u00b3\u0087\u0001\u00f9M3\u00e3L\u009f\u00f0\u0016J+l\u00b5\u00ad\u0090\u00d3U\u0010\u00af7>\u009f\u00c4\u001a\u00fe\u0010:\u0082\u0016\b\u00f8\u00e3WS)&\u009fB\u0093\u00bf4+\u00c8WYS\u00fc\u000e\u00da\u00d2 yP\u009bV\u00a5b\u00e1\u0017q\u0001\u00e1\u00d9=u]\u00f6^\u00b6F\u0001w\u0010\u001fW\u000b\u00a2\u00ec?\u00b5+\u00e3\u00e3\u00e2P\u00adZr#\u00dd\u0000\u00ba\u00be\u001b!N\u00e5\u00ea\u00f2m\u00cc\u0084B\u0091\u0081qh\u00bf\u00cbl\u00a4\u0093J$m\u009c\u00e9_Us\u008b-\u00c1h\u00f5-`\u00f4\u0014\u00bb\u00b2f\u0083qF\u0011\u0092\u00a8\u0014\u0084\u0013}\u00c6\u0003l\u00b3l\u00ef\"\u0014\u00c1\u0016\u00a8v>\u008f\u00d8\u008fb\u0017\u00cd\u00a3\u0017\u00d5\u009b\u00b8=\u009a7\u00adFrbdlm\u001b\u00d6\u00f1\u00f0\u0012\u001c\u00ed\u00e2\u00e0is|\u0010\u000bs\u00cb(\u00b1\u00b7A\u00ba\u001a\u00c5^\u00e5\u00a8G\u00c4 \u0004\u00eb\u008c\u00df\u007f\u008f\u00ac\u00a6\u0087\u0097\u00a6<m\u00a63mT/\u00bb\u00c5\u00e9\u0087\u000efIh\u00a9\u0017s{\u0090$\u00ad\u00b3%c\u001c\u00be\u0000w\u00181\u0012P\u00b3\u00ad.\u00e9a\u00c9HD\u00c6P&\u00eb\u0001$\u0017\u00e9\u00e6\u00c5\u00b6g3\u0097\u0096\u00ec~+j\u00e5\u000es/\u0000\u0014\u009b\u00cc\u00fcya\u00b5\u00b1!Zt\u00fd\u000f\u00e7\u00fb\u001a\u001d\u0089\u009c\nAg\u00df\u0013\u00be$8\u00bc\u00f0\u00a5\u00d4\u009f\u0002\u00e8$\u001e\u00d0\u00ac\u0011\u0097\u00d0\u00e4\u00ea\u00b2u\u00b7Gf\u00ac}*\u00e0\u00d4V\u00ee\u00daAM\u00a0Js\u00af}Zy%\u00fd]\u00f5\u001e\u00f4e\u00ac\u00f8kw\u0082\u001a\u00d9\u00f8a\u008b\u0016_K\u00c4\u00f9\u00a30\u0017\u00bb\u00ba+F9\u00a5q\u00f2\u00c8\u00ecg29\u00e7\u00c5\u00c8\u008b\u00a0\u00e7\u00d6\u00fb\u0010]j\u0003Xi\u00bc%\u00de\u00bc\u001c\u00b2S\u009ccne\"Z.\u00f1/\u00964\u00f0\u0012\u00bdna\u0084\nB\u00c3\u00df\u0091:\u0089\u0090\u00a6\u00af\u0087\u00e4\u00f6+s\u00b8\u00ba\u00c9\u00e9\u008d\u00a9l<\u00a8\u00f1\u00ca\f\u0084\u0014\u0090\u0012mH1\u00f6\u00ef\u0087y\"\u0093\u008d\u00f7\u00f3\u00dc\u00a7D\u00dd\u00d0-\u0095\u0081\u00baJ\u00b5{A\u00d6\u0086\u00dfU\u00dc\u0019-\u00dfMP2\u001ew\u00c3l1=h\u00ad\u0015j<\u00e3\u0088\u00ea\u0093@\u0096\u00beS:\u00efv\u00e2\u0099\u00faY^\u00a3\u00f0z8\u00b3\u00e12uh{Ie\u00f9\u00ad\u00b3\u00ab\u00e2+\u00e0\u00e5\u00a1sE\u00dfE\u0098\u0096\u0014'\u00fb=\u00cb\u00ba\u00ec\u00f9\u001b\u00b1\u009d#b\u00af\u00ea\u00e6\u00ea_)\u00fe-\u00c9\u00ed\u0095\u00e1|\u00b8\u0018V\u00f0\u0087\u00ff\u00f2\u00cd\u008e\"\u001d\u00d0<\u00fe\u001dB*\u00ee\b\u0095k\u00bbM\u00e2\u00b85\u00dcF\u0087\u00874cTS\u0094\u00f0u\u00c7\u00e1H\u009b\u00e9`\u00e0\u0080\u00b1\u0081\u00dd\u00021Sx\u00a7\u00b3ic]4A'\u008a\u0086\u00f8\u00b95\u00a5\u00ed\u008d\u00a6\u00ab'\u008d\u0085\u00d0\u0084\u008fJ+\u0013H\u00d4W\u0006\u00f0\u00ec_+6\u0083\u0012F2?\u00d1\u00ff\u009b\u00fe\u00baz\u00be\u0016\u00aa\u00fd\u00aa\u0092\u0011\u00cb\u00f2\u0012t\u00c2\u00c1\u00c5d\u00bdG\u00d1\u00cc\u0096\u0005\u00fa7r\u0097\u000e\u00cd\u00f8Ho\u0002'\u00f6B\u00ab\u0015\u000f\u0081\u00fb<\u009c]\\\u0018\u000b\u00fe*|\u0018mH\u00a6R\u00eb\u00b9\u00db8\t\u00e5e\u0099\u009b\u00d6\u00e8\u0082\u00fc0\u009d\u00eb\u00b8\u00cd/\u000e\u00ee\u0088\u00fe\u0085\u0089*d\u00a1\u00e7\u0083\u00bbo\u0085\u00d7\u00c6sW\u00b3\u00ff\u0011\u0080\u0017\u00b0\u00ae\u0092\u0080\u0015k\u000bX\\p\u001e\u00ed@\u0089i\u00db\u0082T\u001e\u00efe\u008c\u0095J7E\u00a7\u00c8\u00fc\u00ec\u00bfw?\f\u00db-\u0091\u0095\u0093\u0015\u00cb\u00a8b<\u00b0\u0004X\u00c2\u000e\u00902\u00ac\u009a\u0084=\u0089\u00c6\u00b4J\u0011\u00c9\u00c3MPQ\u00ad\u00f9\u00a01\b\u0007p^\u00b2\u001a\r7\u00d0>\u0017L\u001d~\u00a7\u001f\u00dc\u00f0\u00b3\u00c5VM\\\u00c0\u0016T\u00ad\u00f8\u00b1c\u00dd\u009e\u00bf\u00c4\u0087\u00feb\u00a5\u0002z\u000e\u0085h\u00b2\u008e\u008a\u00830\u0096^\u00af\u0092\u0092,\u00cd\u00e7\u00b6\u0086\u0014\u00a3'\u000f\u00ea\u0096\u00a8\u0081\u00e9\u0084\u00cd\u00aa/\u00037\u00bbAT\u00d4\u00a4\u0001#pC\f\u00b6>\u00f2\u00d4\u00ea\"\u00cf".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0081U[\u008c4\u00bf\u001b\u0002!\u00c8>\u0084K\u0014\u00b9\u00a6";
                    var5_11 = "\u0081U[\u008c4\u00bf\u001b\u0002!\u00c8>\u0084K\u0014\u00b9\u00a6".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        vM.c = var6_8;
        vM.d = new Integer[1386];
        v22 = new Block[vM.a(5224, 3957828296803964629L)];
        v22[0] = hi.a("j", (long)1169697892110545896L);
        v22[1] = hi.a("j", (long)898724735523943778L);
        v22[2] = hi.a("j", (long)660192093904994570L);
        v22[3] = hi.a("j", (long)1173773611913828053L);
        v22[4] = hi.a("j", (long)851046977432255552L);
        v22[5] = hi.a("j", (long)851046977432255552L);
        v22[vM.a((int)20192, (long)813614737635445453L)] = hi.a("j", (long)363349036204362894L);
        v22[vM.a((int)1869, (long)968455849344319811L)] = hi.a("j", (long)443994101585536672L);
        v22[vM.a((int)32266, (long)2877241253800065138L)] = hi.a("j", (long)418596069964505966L);
        v22[vM.a((int)25729, (long)5959736332929900787L)] = hi.a("j", (long)531685650367946780L);
        v22[vM.a((int)32472, (long)5205922672955373614L)] = hi.a("j", (long)573397457859921139L);
        v22[vM.a((int)12041, (long)2158887759308548889L)] = hi.a("j", (long)686877768027849949L);
        v22[vM.a((int)6959, (long)7226212375651702819L)] = hi.a("j", (long)1092255920477751542L);
        v22[vM.a((int)32050, (long)5888244596651114117L)] = hi.a("j", (long)1209140392040401791L);
        v22[vM.a((int)27468, (long)241825219865587143L)] = hi.a("j", (long)696340380304019570L);
        v22[vM.a((int)2904, (long)2062424234454896584L)] = hi.a("j", (long)1092255920477751542L);
        v22[vM.a((int)4367, (long)5285942171892568993L)] = hi.a("j", (long)694622495755240452L);
        v22[vM.a((int)26528, (long)6151095402416973052L)] = hi.a("j", (long)896257828504110610L);
        v22[vM.a((int)32755, (long)8989110163649805457L)] = hi.a("j", (long)1319559131953185053L);
        v22[vM.a((int)1158, (long)7841108789600371403L)] = hi.a("j", (long)461938134506948982L);
        v22[vM.a((int)8619, (long)1399536109823091820L)] = hi.a("j", (long)644065802223130297L);
        v22[vM.a((int)24271, (long)993032175798393014L)] = hi.a("j", (long)928681664285871549L);
        v22[vM.a((int)28237, (long)3047433675766409868L)] = hi.a("j", (long)911846036469730568L);
        v22[vM.a((int)28382, (long)816961528986216559L)] = hi.a("j", (long)1097654185112664546L);
        v22[vM.a((int)6583, (long)3782169994438466574L)] = hi.a("j", (long)967551618591194278L);
        v22[vM.a((int)29866, (long)4508402737071534784L)] = hi.a("j", (long)618835658842314134L);
        v22[vM.a((int)25201, (long)3290377187618006046L)] = hi.a("j", (long)439541671078786774L);
        v22[vM.a((int)19129, (long)547467481251712957L)] = hi.a("j", (long)380985543603591094L);
        v22[vM.a((int)19399, (long)5078839368792149962L)] = hi.a("j", (long)1323532595079436731L);
        v22[vM.a((int)11646, (long)931247288188497631L)] = hi.a("j", (long)607076523733980778L);
        v22[vM.a((int)20981, (long)7168736143504020705L)] = hi.a("j", (long)483913023078133907L);
        v22[vM.a((int)8080, (long)6197090557822425711L)] = hi.a("j", (long)721129788130286989L);
        v22[vM.a((int)17291, (long)7104580048791864449L)] = hi.a("j", (long)776931456979385243L);
        v22[vM.a((int)15323, (long)1991674234760853819L)] = hi.a("j", (long)900827065102581385L);
        v22[vM.a((int)30660, (long)3698303197221204496L)] = hi.a("j", (long)387979104499917622L);
        v22[vM.a((int)24533, (long)4256070903909259862L)] = hi.a("j", (long)707486285922074725L);
        v22[vM.a((int)21099, (long)691926197763446290L)] = hi.a("j", (long)698927342253240366L);
        v22[vM.a((int)1928, (long)2433553497113968918L)] = hi.a("j", (long)385874600954788561L);
        v22[vM.a((int)25521, (long)8322599727878907721L)] = hi.a("j", (long)1246808143812907089L);
        v22[vM.a((int)3464, (long)2391670255893105034L)] = hi.a("j", (long)1298858909206532011L);
        v22[vM.a((int)6516, (long)8690711177230966352L)] = hi.a("j", (long)1172072649967891401L);
        v22[vM.a((int)19817, (long)7302189667162392801L)] = hi.a("j", (long)367234782356911518L);
        v22[vM.a((int)25961, (long)3762547336226382682L)] = hi.a("j", (long)1002420679480783354L);
        v22[vM.a((int)3098, (long)5297640019708004758L)] = hi.a("j", (long)481356316423409617L);
        v22[vM.a((int)23266, (long)107161801846430118L)] = hi.a("j", (long)1004347683734123504L);
        v22[vM.a((int)23538, (long)3279290268013862433L)] = hi.a("j", (long)1314104233469158520L);
        v22[vM.a((int)20359, (long)4797676088128571444L)] = hi.a("j", (long)923667716772460884L);
        v22[vM.a((int)28039, (long)2878314117037402682L)] = hi.a("j", (long)1285107510001261586L);
        v22[vM.a((int)18523, (long)5180716713663401666L)] = hi.a("j", (long)952949076318084994L);
        vM.s = hi.a("G", (Object)v22, (long)797352822582172327L);
        vM.X = hi.a("G", (Object)hi.a("j", (long)986445996347530085L), (Object)hi.a("j", (long)1330993261458815596L), (Object)hi.a("j", (long)1131382202004915476L), (Object)hi.a("j", (long)733416856695472865L), (Object)hi.a("j", (long)459631146300372999L), (Object)hi.a("j", (long)956962869439854084L), (Object)hi.a("j", (long)746003216798549543L), (long)713413043947887950L);
        vM.e = hi.a("G", (Object)hi.a("j", (long)574171627721984290L), (Object)hi.a("j", (long)1288390796365149005L), (Object)hi.a("j", (long)459436899056642693L), (Object)hi.a("j", (long)374886099742624924L), (Object)hi.a("j", (long)1204404659837043120L), (Object)hi.a("j", (long)540922305695630974L), (Object)hi.a("j", (long)399177842775595233L), (long)713413043947887950L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean I(Object[] var0) {
        block12: {
            var1_1 = (ItemStack)var0[0];
            var2_2 = Dl.t();
            var3_3 /* !! */  = vM.a(31100, 5410823729900403226L) / vM.a(12041, 2158887759308548889L) + vM.a(23394, 4511291312804896328L);
            if (!var2_2) ** GOTO lbl17
            block9: while (true) {
                block15: {
                    block14: {
                        block13: {
                            v0 /* !! */  = (cfr_temp_0 = hi.a("G", (Object)var1_1, (long)836140227727665517L) - 10.0f) == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            if (var2_2) break block13;
                            if (v0 /* !! */  > 0) break block14;
                            v0 /* !! */  = (reference)(hi.a("G", (int)(hi.a("G", (int)vM.a(1230, 4894257751482385310L), (int)vM.a(29356, 2955939662107653470L), (long)834203424483934088L) * vM.a(29609, 6111679711456245080L)), (int)vM.a(4722, 5868512470292027055L), (long)834203424483934088L) ^ vM.a(20767, 5327433200031831401L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block15;
                    }
                    var3_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)vM.a(30109, 6534642400741831413L), (int)vM.a(2522, 4862035056536865826L), (long)834203424483934088L) + vM.a(17707, 8932202225319379964L)), (int)vM.a(3122, 1934658140089700131L), (long)834203424483934088L) * vM.a(17182, 3975011009463355181L) ^ vM.a(26528, 9111160573056394140L);
                    if (var2_2) ** GOTO lbl43
                }
                while (true) {
                    block17: {
                        block16: {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    continue block9;
                                }
                                case 1057202491: {
                                    v1 /* !! */  = hi.a("G", (Object)var1_1, (long)865432144196367974L);
                                    if (var2_2) break block16;
                                    if (v1 /* !! */  == false) break;
                                    break block17;
                                }
                                case 1057202490: {
                                    v2 = true;
                                    var3_3 /* !! */  = vM.a(8895, 7320229336658273670L) / 2 - vM.a(29069, 1481976576194525145L);
                                    if (var2_2) {
                                        break block9;
                                    }
                                    break block12;
                                }
                                case 1057202493: {
                                    v2 = false;
                                    if (!var2_2) break block9;
                                    return v2;
                                }
                                case 1057202489: {
                                    hi.a("G", (Object)new Object[]{Float.valueOf(0.0f)}, (long)842688358493305377L);
                                    hi.a("G", (long)487733742417394326L);
                                    return true;
                                }
                            }
lbl43:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(hi.a("G", (int)(hi.a("G", (int)vM.a(9991, 5949528957680935073L), (int)vM.a(2193, 8080618176487017603L), (long)834203424483934088L) * vM.a(30113, 3420236087647254257L)), (int)vM.a(9602, 18530223345525208L), (long)834203424483934088L) ^ vM.a(12586, 5008882584318374975L));
                        }
                        var3_3 /* !! */  = (int)v1 /* !! */ ;
                        if (!var2_2) continue;
                    }
                    var3_3 /* !! */  = vM.a(29224, 4357838673311774338L) * vM.a(11835, 4419725085729450939L) * vM.a(4708, 7044425079785870463L) + vM.a(11901, 835923657822857248L);
                }
                break;
            }
            var3_3 /* !! */  = vM.a(20182, 7157304319432067120L) / 2 - vM.a(22386, 6484291461968400730L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v2;
            }
            case 1354142437: 
        }
        throw null;
    }

    public static float c() {
        return (float)hi.a("\u00a5", (Object)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestCrossbowScore$0, (long)1143211481283200773L), vM::V, (long)935650006110027503L), Float::compareTo, (long)364845113189698498L), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L), (long)535909545969414314L))), (long)1263586790430806583L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestCrossbow$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (bl) break block4;
                    if (object != false) break block5;
                    object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof CrossbowItem;
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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

    private static int lambda$getBestSword$0(ItemStack itemStack) {
        return (int)(hi.a("G", (Object)itemStack, (long)527893989680370563L) * 100.0f);
    }

    public static ItemStack z() {
        return (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestPickaxe$0, (long)1143211481283200773L), (Object)hi.a("G", vM::lambda$getBestPickaxe$1, (long)860018880249920103L), (long)364845113189698498L), null, (long)535909545969414314L);
    }

    public static ItemStack f() {
        return (ItemStack)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", max(java.util.Comparator<? super T> ), (Stream)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", x()), (long)415197394286909465L), vM::lambda$getBestPunchBow$0, (long)1143211481283200773L)), (Comparator)((Object)hi.a("G", vM::lambda$getBestPunchBow$1, (long)860018880249920103L))), null, (long)535909545969414314L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float d(ItemStack var0) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        block14: {
                            block15: {
                                block13: {
                                    block21: {
                                        block20: {
                                            var1_1 = Dl.S();
                                            var3_2 /* !! */  = hi.a("G", (int)(vM.a(23099, 2548364369024555212L) + vM.a(22708, 42104296760777624L)), (int)vM.a(9858, 3598489931763343979L), (long)834203424483934088L) * vM.a(31330, 2666768570773060731L) + vM.a(4788, 2329643178884452392L);
                                            if (var1_1) break block20;
lbl4:
                                            // 2 sources

                                            while (var0 != null) {
                                                break block13;
                                            }
                                            break block21;
lbl7:
                                            // 1 sources

                                            while (true) {
                                                v0 /* !! */  = vM.s("K1l8O0aBxboBdllv", isEmpty(), (ItemStack)var0);
                                                if (!var1_1) break block14;
                                                if (v0 /* !! */  != false) break block15;
                                                break block16;
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                v1 = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof BowItem;
                                                if (!var1_1) break block17;
                                                if (v1 != 0) break block18;
                                                break block19;
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            return 0.0f;
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var2_3 = 10.0f;
                                                var2_3 += (float)hi.a("G", (Object)var0, (Object)hi.a("j", (long)896815039905240446L), (long)1072650197384473271L) / 10.0f;
                                                var2_3 += (float)hi.a("G", (Object)var0, (Object)hi.a("j", (long)1201701952320829812L), (long)1072650197384473271L);
                                                var2_3 += (float)hi.a("G", (Object)var0, (Object)hi.a("j", (long)539413511416139578L), (long)1072650197384473271L);
                                                return (var2_3 += (float)vM.s("K1l8O0aBxboBdllv", b(net.minecraft.world.item.ItemStack net.minecraft.resources.ResourceKey<net.minecraft.world.item.enchantment.Enchantment> ), (ItemStack)var0, (ResourceKey)hi.a("j", (long)510297413883108058L))) + (float)hi.a("\u00a5", (Object)var0, (long)892466845450798011L) / (float)hi.a("\u00a5", (Object)var0, (long)927379308426146560L);
                                            }
                                        }
lbl26:
                                        // 7 sources

                                        while (true) {
                                            switch (var3_2 /* !! */ ) {
                                                default: {
                                                    ** GOTO lbl4
                                                }
                                                case 1294206544: {
                                                    ** continue;
                                                }
                                                case 1294206541: {
                                                    ** continue;
                                                }
                                                case 1294206540: {
                                                    ** continue;
                                                }
                                                case 1294206543: {
                                                    ** continue;
                                                }
                                                case 1294206542: 
                                            }
                                            throw null;
                                        }
                                    }
                                    var3_2 /* !! */  = (CallSite)((vM.a(26361, 4332436446678721088L) ^ vM.a(20750, 4796840015215400298L)) + vM.a(15606, 8590813149459872000L) ^ vM.a(12389, 2014116914122225406L));
                                    if (var1_1) ** GOTO lbl26
                                }
                                var3_2 /* !! */  = (CallSite)(vM.a(6213, 7372466775264354192L) * vM.a(15782, 1928809934912945807L) + vM.a(21618, 5835023934304784579L) + vM.a(15244, 2306584253105141940L) ^ vM.a(10952, 7194169166221962281L));
                                if (var1_1) ** GOTO lbl26
                            }
                            v0 /* !! */  = var3_2 /* !! */  = (CallSite)((vM.a(18672, 576477752004905845L) ^ vM.a(30174, 1572235389079729932L)) + vM.a(9904, 58442696170857332L) ^ vM.a(27503, 1040608607751777571L));
                        }
                        if (var1_1) ** GOTO lbl26
                    }
                    var3_2 /* !! */  = (CallSite)((vM.a(17975, 2411890374301975995L) ^ vM.a(16479, 8795181094461605597L)) + vM.a(7661, 2528478721880546101L));
                    if (var1_1) ** GOTO lbl26
                }
                v1 = (hi.a("G", (int)vM.a(13685, 7538722161949766445L), (int)vM.a(21049, 9078081925482092328L), (long)834203424483934088L) * vM.a(4425, 6191958757256353403L) ^ vM.a(6465, 4569858218940684950L)) + vM.a(24041, 4704238540629188126L) ^ vM.a(29634, 1634832962845257787L);
            }
            var3_2 /* !! */  = (CallSite)v1;
            if (var1_1) ** GOTO lbl26
        }
        var3_2 /* !! */  = (CallSite)((vM.a(18672, 576477752004905845L) ^ vM.a(30174, 1572235389079729932L)) + vM.a(9904, 58442696170857332L) ^ vM.a(27503, 1040608607751777571L));
        ** while (true)
    }

    public static ItemStack q() {
        return (ItemStack)vM.s("K1l8O0aBxboBdllv", orElse(T ), (Optional)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getFishingRod$0, (long)1143211481283200773L), (long)547712697874969327L)), null);
    }

    public static float B() {
        return (float)hi.a("\u00a5", (Object)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestPunchBowScore$0, (long)1143211481283200773L), vM::Q, (long)935650006110027503L), Float::compareTo, (long)364845113189698498L), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L), (long)535909545969414314L))), (long)1263586790430806583L);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static float j(ItemStack itemStack) {
        boolean bl = Dl.S();
        int n = vM.a(29264, 3788672717226915707L) * vM.a(32628, 2742159982706702861L) + vM.a(9742, 1920540905803703748L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        Object object2 = hi.a("G", (Object)itemStack, (long)572443712987471620L);
                        if (!bl) break block9;
                        if (object2 == false) break block10;
                        object2 = object = (Object)(hi.a("G", (int)vM.a(21898, 7077838381201887914L), (int)vM.a(31090, 728788738471738746L), (long)834203424483934088L) - vM.a(30691, 2355312296978952439L) ^ vM.a(26779, 5523929550603333034L));
                    }
                    if (bl) break block8;
                }
                object = vM.a(224, 2272493584439953113L) * vM.a(6783, 5407012929210736315L) ^ vM.a(16703, 1929982142604838779L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case -516508255: {
                    hi.a("G", (float)2.0f, (float)0.0f, (int)3, (long)803182559024134953L);
                    return 0.0f;
                }
                case -516508254: {
                    return 0.0f;
                }
                case -516508252: 
            }
            break;
        }
        return (float)(hi.a("G", (Object)itemStack, (long)798651376586263592L) + hi.a("G", (Object)new Object[]{itemStack}, (long)529641079332437369L));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getWorstBlock$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block7: {
                block6: {
                    block4: {
                        bl = Dl.t();
                        object = vM.s("K1l8O0aBxboBdllv", isEmpty(), (ItemStack)itemStack);
                        if (bl) break block4;
                        if (object != false) break block5;
                        object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof BlockItem;
                    }
                    if (bl) break block6;
                    if (object == false) break block5;
                    object = vM.s("K1l8O0aBxboBdllv", T(net.minecraft.world.item.ItemStack ), (ItemStack)itemStack);
                }
                if (bl) break block7;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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

    public static int p() {
        return (int)vM.s("K1l8O0aBxboBdllv", sum(), (IntStream)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", stream(), (List)((Object)hi.a("G", (long)989880202519854622L))), vM::lambda$getBlockCountInInventory$0, (long)1143211481283200773L), ItemStack::getCount, (long)637363739606702614L)));
    }

    private static int lambda$getBestPickaxe$1(ItemStack itemStack) {
        return (int)(hi.a("G", (Object)itemStack, (long)1237074617426313755L) * 100.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestShapeAxe$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block8: {
                block7: {
                    block6: {
                        block4: {
                            bl = Dl.S();
                            object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                            if (!bl) break block4;
                            if (object != false) break block5;
                            object = vM.s("K1l8O0aBxboBdllv", getItem(), (ItemStack)itemStack) instanceof AxeItem;
                        }
                        if (!bl) break block6;
                        if (object == false) break block5;
                        object = hi.a("G", (Object)new Object[]{itemStack}, (long)535187538840369779L);
                    }
                    if (!bl) break block7;
                    if (object == false) break block5;
                    object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
                }
                if (!bl) break block8;
                if (object == false) break block5;
                object = hi.a("G", (Object)new Object[]{itemStack}, (long)750191266578538241L);
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$getWorstProjectile$0(ItemStack itemStack) {
        boolean bl = Dl.S();
        ItemStack itemStack2 = itemStack;
        if (bl) {
            if (hi.a("\u00a5", (Object)itemStack2, (long)675687955611242108L) != false) return false;
            itemStack2 = itemStack;
        }
        CallSite callSite = hi.a("\u00a5", (Object)itemStack2, (long)769006157898026769L);
        CallSite callSite2 = hi.a("j", (long)823347519655685809L);
        if (bl) {
            if (callSite == callSite2) return true;
            callSite = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L);
            callSite2 = hi.a("j", (long)403740683659965780L);
        }
        if (callSite != callSite2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean T(ItemStack var0) {
        block35: {
            block34: {
                var1_1 = Dl.t();
                var4_2 /* !! */  = (vM.a(22141, 570466042723111544L) - vM.a(6051, 460630104551281553L) - vM.a(7817, 9001183148380576778L)) * vM.a(26856, 1206745991810690389L) + vM.a(9333, 3946855676344264442L);
                if (!var1_1) ** GOTO lbl11
                block29: while (true) {
                    block37: {
                        block36: {
                            if (var0 != null) break block36;
                            var4_2 /* !! */  = (vM.a(338, 5927464687568864461L) ^ vM.a(12401, 8737141140321105791L)) + vM.a(30834, 5671241931405016814L);
                            if (!var1_1) break block37;
                        }
                        var4_2 /* !! */  = (int)(hi.a("G", (int)(vM.a(27291, 4230635883190496575L) + vM.a(13974, 4300289874462798089L)), (int)vM.a(24274, 4522997829663922843L), (long)834203424483934088L) - vM.a(7654, 6946440693410422464L));
                        if (var1_1) ** GOTO lbl40
                    }
                    block30: while (true) {
                        switch (var4_2 /* !! */ ) {
                            default: {
                                continue block29;
                            }
                            case -796702231: {
                                v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                                if (var1_1) ** GOTO lbl41
                                if (v0 /* !! */  != false) ** GOTO lbl40
                                ** GOTO lbl43
                            }
                            case -796702234: {
                                v1 = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof BlockItem;
                                if (var1_1) ** GOTO lbl46
                                if (v1 != 0) ** GOTO lbl45
                                ** GOTO lbl47
                            }
                            case -796702237: {
                                hi.a("G", (long)636853863237534702L);
                                return false;
                            }
                            case -796702232: {
                                v2 /* !! */  = hi.a("G", (Object)var0, (long)865432144196367974L);
                                if (var1_1) ** GOTO lbl50
                                if (v2 /* !! */  != false) ** GOTO lbl49
                                ** GOTO lbl52
                            }
                            case -796702233: {
                                var2_3 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var0, (long)923433247397949520L), (long)445233814433577985L);
                                v3 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30165, -32484), (long)1195372608991279295L);
                                if (var1_1) ** GOTO lbl55
                                if (v3 /* !! */  != false) ** GOTO lbl54
                                ** GOTO lbl57
                            }
lbl40:
                            // 2 sources

                            v0 /* !! */  = (CallSite)((vM.a(7749, 8365493008926955998L) ^ vM.a(31056, 2860350556492447044L)) + vM.a(9365, 6161892073307071077L));
lbl41:
                            // 2 sources

                            var4_2 /* !! */  = (int)v0 /* !! */ ;
                            if (!var1_1) continue block30;
lbl43:
                            // 2 sources

                            var4_2 /* !! */  = vM.a(30371, 7842999237952288126L) * vM.a(26432, 7328332465686487575L) ^ vM.a(26776, 1967892564289924961L);
                            if (!var1_1) continue block30;
lbl45:
                            // 2 sources

                            v1 = var4_2 /* !! */  = (vM.a(10162, 6842919258055598265L) / vM.a(1869, 968455849344319811L) ^ vM.a(4973, 3363449382546232427L)) - vM.a(17053, 921504202391617833L) + vM.a(32557, 7372287996119432073L);
lbl46:
                            // 2 sources

                            if (!var1_1) continue block30;
lbl47:
                            // 2 sources

                            var4_2 /* !! */  = (vM.a(7749, 8365493008926955998L) ^ vM.a(31056, 2860350556492447044L)) + vM.a(9365, 6161892073307071077L);
                            if (!var1_1) continue block30;
lbl49:
                            // 2 sources

                            v2 /* !! */  = (CallSite)(vM.a(27204, 5755430799276812577L) / 3 - vM.a(27647, 2692015349473423000L));
lbl50:
                            // 2 sources

                            var4_2 /* !! */  = (int)v2 /* !! */ ;
                            if (!var1_1) continue block30;
lbl52:
                            // 2 sources

                            var4_2 /* !! */  = (vM.a(29487, 962925967086071829L) / vM.a(4367, 5285942171892568993L) / 5 ^ vM.a(16038, 1333195946603280403L)) + vM.a(26463, 726724494300914052L);
                            continue block30;
lbl54:
                            // 1 sources

                            v3 /* !! */  = (CallSite)((vM.a(32588, 2346579699249560046L) - vM.a(21548, 15145557517799427L) - vM.a(9413, 22323637587796323L)) / vM.a(27468, 241825219865587143L) + vM.a(5844, 403698964908856200L));
lbl55:
                            // 2 sources

                            var4_2 /* !! */  = (int)v3 /* !! */ ;
                            if (!var1_1) break block34;
lbl57:
                            // 2 sources

                            var4_2 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(vM.a(11851, 857664216072088241L) ^ vM.a(27783, 5306770702771170033L)), (int)vM.a(4738, 6768275041895438049L), (long)834203424483934088L), (int)vM.a(26127, 942873911789133910L), (long)834203424483934088L) + vM.a(18878, 8871237781715521151L));
                            if (!var1_1) break block34;
                            ** GOTO lbl83
                            case -796702235: {
                                return false;
                            }
                            case -796702236: 
                        }
                        break;
                    }
                    break;
                }
                return false;
            }
            block31: while (true) {
                switch (var4_2 /* !! */ ) {
                    default: {
                        v4 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30169, -22510), (long)1195372608991279295L);
                        if (var1_1) ** GOTO lbl84
                        if (v4 /* !! */  == false) ** GOTO lbl83
                        ** GOTO lbl86
                    }
                    case -52569910: {
                        v5 = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof StandingAndWallBlockItem;
                        if (var1_1) ** GOTO lbl89
                        if (v5 == 0) ** GOTO lbl88
                        ** GOTO lbl90
                    }
                    case -52569911: {
                        var3_4 = hi.a("\u00a5", (Object)((BlockItem)hi.a("\u00a5", (Object)var0, (long)769006157898026769L)), (long)708963368116028632L);
                        v6 = var3_4 instanceof FlowerBlock;
                        if (var1_1) ** GOTO lbl93
                        if (v6 != 0) ** GOTO lbl92
                        ** GOTO lbl94
                    }
lbl83:
                    // 2 sources

                    v4 /* !! */  = (CallSite)(vM.a(6671, 9012278990254136793L) - vM.a(22586, 2341287422710881678L) ^ vM.a(32714, 6039333524651261020L) ^ vM.a(12543, 7197804639753205104L));
lbl84:
                    // 2 sources

                    var4_2 /* !! */  = (int)v4 /* !! */ ;
                    if (!var1_1) continue block31;
lbl86:
                    // 2 sources

                    var4_2 /* !! */  = (vM.a(22070, 976803263803495927L) - vM.a(8165, 2928448390735026953L) - vM.a(18166, 8686371399398391944L)) / vM.a(27468, 241825219865587143L) + vM.a(1978, 826018207041044550L);
                    if (!var1_1) continue block31;
lbl88:
                    // 2 sources

                    v5 = var4_2 /* !! */  = vM.a(2712, 511376042587900328L) * vM.a(17318, 883056962653292503L) - vM.a(109, 6827756480927974971L);
lbl89:
                    // 2 sources

                    if (!var1_1) continue block31;
lbl90:
                    // 2 sources

                    var4_2 /* !! */  = (int)(hi.a("G", (int)(vM.a(18622, 6406035487363762974L) + vM.a(12362, 3607626637938717375L) + vM.a(24490, 4045203147918056303L) - vM.a(29338, 5561883995439412769L)), (int)vM.a(22868, 7329879350926514698L), (long)834203424483934088L) - vM.a(16236, 5524839512577571737L));
                    continue block31;
lbl92:
                    // 1 sources

                    v6 = var4_2 /* !! */  = (vM.a(26813, 1700373543764995369L) ^ vM.a(6090, 3027561150199092122L)) + vM.a(0, 3575746164562052268L) ^ vM.a(26246, 3628596873789416462L);
lbl93:
                    // 2 sources

                    if (!var1_1) break block35;
lbl94:
                    // 2 sources

                    var4_2 /* !! */  = (vM.a(3930, 6836117856738102072L) - vM.a(19323, 9146390078573055825L)) / vM.a(4367, 5285942171892568993L) * vM.a(4995, 3333860615161139357L) - vM.a(19804, 4073241100259167008L);
                    if (!var1_1) break block35;
                    ** GOTO lbl141
                    case -52569913: {
                        return false;
                    }
                    case -52569912: {
                        return false;
                    }
                    case -52569915: 
                }
                break;
            }
            return true;
        }
        block32: while (true) {
            switch (var4_2 /* !! */ ) {
                default: {
                    v7 = var3_4 instanceof BushBlock;
                    if (var1_1) ** GOTO lbl142
                    if (v7 != 0) ** GOTO lbl141
                    ** GOTO lbl143
                }
                case -1773966593: {
                    v8 = var3_4 instanceof NetherFungusBlock;
                    if (var1_1) ** GOTO lbl146
                    if (v8 != 0) ** GOTO lbl145
                    ** GOTO lbl147
                }
                case -1773966599: {
                    v9 = var3_4 instanceof CropBlock;
                    if (var1_1) ** GOTO lbl150
                    if (v9 == 0) ** GOTO lbl149
                    ** GOTO lbl151
                }
                case -1773966600: {
                    v10 = var3_4 instanceof SlabBlock;
                    if (var1_1) ** GOTO lbl154
                    if (v10 != 0) ** GOTO lbl153
                    ** GOTO lbl155
                }
                case -1773966595: {
                    v11 /* !! */  = hi.a("\u00a5", (Object)hi.a("j", (long)1270645178107105942L), (Object)var3_4, (long)798696353081318619L);
                    if (var1_1) ** GOTO lbl158
                    if (v11 /* !! */  != false) ** GOTO lbl157
                    ** GOTO lbl160
                }
                case -1773966596: {
                    v12 = true;
                    var4_2 /* !! */  = vM.a(21972, 6659909179304710324L) + vM.a(26215, 768401112268121084L) + vM.a(31994, 3880013177202653284L);
                    if (!var1_1) ** GOTO lbl163
                    ** GOTO lbl162
                }
                case -1773966592: {
                    v12 = false;
                    if (var1_1) {
                        return v12;
                    }
                    ** GOTO lbl162
                }
lbl141:
                // 2 sources

                v7 = var4_2 /* !! */  = (vM.a(14164, 350359074139304858L) ^ vM.a(16789, 4479207891451151905L)) + vM.a(2948, 6885976555675438314L) ^ vM.a(26335, 2158497112441627563L);
lbl142:
                // 2 sources

                if (!var1_1) continue block32;
lbl143:
                // 2 sources

                var4_2 /* !! */  = vM.a(25758, 6425197413515076565L) / vM.a(27468, 241825219865587143L) - vM.a(52, 6939428199208371928L);
                if (!var1_1) continue block32;
lbl145:
                // 2 sources

                v8 = var4_2 /* !! */  = (vM.a(14164, 350359074139304858L) ^ vM.a(16789, 4479207891451151905L)) + vM.a(2948, 6885976555675438314L) ^ vM.a(26335, 2158497112441627563L);
lbl146:
                // 2 sources

                if (!var1_1) continue block32;
lbl147:
                // 2 sources

                var4_2 /* !! */  = (int)(vM.s("K1l8O0aBxboBdllv", max(int int ), (int)(hi.a("G", (int)(vM.a(28495, 5082954618392258761L) / 4), (int)vM.a(23916, 2267524145734359176L), (long)834203424483934088L) / vM.a(27468, 241825219865587143L)), (int)vM.a(28130, 8179838809873263366L)) + vM.a(17318, 6741015280737191771L));
                if (!var1_1) continue block32;
lbl149:
                // 2 sources

                v9 = var4_2 /* !! */  = (vM.a(9256, 2728728427073397014L) ^ vM.a(27543, 7086310485532978775L)) / vM.a(2904, 2062424234454896584L) + vM.a(31858, 8203126335987529928L) - vM.a(21484, 1844716827914638876L);
lbl150:
                // 2 sources

                if (!var1_1) continue block32;
lbl151:
                // 2 sources

                var4_2 /* !! */  = (vM.a(14164, 350359074139304858L) ^ vM.a(16789, 4479207891451151905L)) + vM.a(2948, 6885976555675438314L) ^ vM.a(26335, 2158497112441627563L);
                if (!var1_1) continue block32;
lbl153:
                // 2 sources

                v10 = var4_2 /* !! */  = vM.a(18215, 6968235524653351576L) ^ vM.a(10286, 2787509659727162163L) ^ vM.a(29217, 5119967919994648254L);
lbl154:
                // 2 sources

                if (!var1_1) continue block32;
lbl155:
                // 2 sources

                var4_2 /* !! */  = (int)(hi.a("G", (int)(vM.a(28701, 467836587612878429L) ^ vM.a(5345, 4901603259829244024L) ^ vM.a(13743, 70008168612655344L) ^ vM.a(32258, 7990577395214040196L)), (int)vM.a(23632, 2803245979801952205L), (long)834203424483934088L) + vM.a(32753, 3231969796962892184L));
                if (!var1_1) continue block32;
lbl157:
                // 2 sources

                v11 /* !! */  = (CallSite)(vM.a(21971, 3847720169077675614L) ^ vM.a(18999, 6916451725985451523L) ^ vM.a(9133, 927389592962393519L));
lbl158:
                // 2 sources

                var4_2 /* !! */  = (int)v11 /* !! */ ;
                if (!var1_1) continue block32;
lbl160:
                // 2 sources

                var4_2 /* !! */  = (int)(hi.a("G", (int)vM.a(14832, 6024904411168341654L), (int)vM.a(8012, 1444469029700525540L), (long)834203424483934088L) / vM.a(27468, 241825219865587143L) + vM.a(16051, 8737065324622183097L));
                continue block32;
lbl162:
                // 2 sources

                var4_2 /* !! */  = vM.a(7614, 6783794108481855298L) + vM.a(26395, 1535202871975257061L) + vM.a(11376, 3902592221636749674L);
lbl163:
                // 2 sources

                switch (var4_2 /* !! */ ) {
                    case 673050751: {
                        vM.s("K1l8O0aBxboBdllv", h(double ), (double)4.0);
                        return v12;
                    }
                }
                return v12;
                case -1773966597: {
                    return false;
                }
                case -1773966594: 
            }
            break;
        }
        return true;
    }

    public static ItemStack L() {
        return (ItemStack)vM.s("K1l8O0aBxboBdllv", orElse(T ), (Optional)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestShapeAxe$0, (long)1143211481283200773L), (Object)vM.s("K1l8O0aBxboBdllv", comparingInt(java.util.function.ToIntFunction<? super T> ), vM::lambda$getBestShapeAxe$1), (long)364845113189698498L)), null);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float v(ItemStack var0) {
        var1_1 = Dl.S();
        var5_2 /* !! */  = hi.a("G", (int)vM.a(8750, 5794568781273621926L), (int)vM.a(745, 7957267377404855693L), (long)834203424483934088L) - vM.a(17155, 1530750650376423240L);
        if (var1_1) ** GOTO lbl11
        block10: while (true) {
            block15: {
                block14: {
                    if (var0 != null) break block14;
                    var5_2 /* !! */  = (CallSite)((vM.a(26463, 5990463020755394659L) + vM.a(18343, 7338999190826025677L)) * vM.a(31458, 6033352297247194630L) - vM.a(20653, 5107981625001939907L) - vM.a(5034, 1373645146819123174L) - vM.a(30979, 4904185807542893168L));
                    if (var1_1) break block15;
                }
                var5_2 /* !! */  = (CallSite)(hi.a("G", (int)(vM.a(24298, 6710854653233109702L) * vM.a(23249, 698463845360311715L) ^ vM.a(19756, 8177463248819488960L)), (int)vM.a(6906, 8071976096429825028L), (long)834203424483934088L) ^ vM.a(27625, 6065035461688372737L));
                if (!var1_1) ** GOTO lbl26
            }
            block11: while (true) {
                switch (var5_2 /* !! */ ) {
                    default: {
                        continue block10;
                    }
                    case -1552609489: {
                        v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                        if (!var1_1) ** GOTO lbl27
                        if (v0 /* !! */  == false) ** GOTO lbl26
                        ** GOTO lbl28
                    }
                    case -1552609486: {
                        var2_3 = hi.a("G", (Object)var0, (long)1280162559367933539L);
                        if (!var1_1) ** GOTO lbl31
                        if (var2_3 != null) ** GOTO lbl30
                        ** GOTO lbl32
                    }
lbl26:
                    // 2 sources

                    v0 /* !! */  = var5_2 /* !! */  = (CallSite)((vM.a(28302, 9104180227464146276L) * vM.a(1227, 5632688509606150928L) / vM.a(32472, 5205922672955373614L) + vM.a(2121, 4944271140874669844L) ^ vM.a(31896, 7132676184047073645L)) - vM.a(12099, 776341796053576874L));
lbl27:
                    // 2 sources

                    if (var1_1) continue block11;
lbl28:
                    // 2 sources

                    var5_2 /* !! */  = (CallSite)((vM.a(16723, 7169262809021089096L) + vM.a(23399, 3955668107398651001L)) * vM.a(18461, 2948915431133122228L) - vM.a(13704, 5871946265151239787L) - vM.a(32187, 5521575417939998768L) - vM.a(28984, 8161436270968452480L));
                    continue block11;
lbl30:
                    // 1 sources

                    var5_2 /* !! */  = (CallSite)(vM.a(12608, 6724488393957045246L) / vM.a(4367, 5285942171892568993L) - vM.a(10072, 4415476605803521083L));
lbl31:
                    // 2 sources

                    if (var1_1) ** GOTO lbl33
lbl32:
                    // 2 sources

                    var5_2 /* !! */  = (CallSite)(vM.a(30142, 8645546525676319011L) / 5 + vM.a(20114, 1748183036935113260L) - vM.a(7158, 2001550705603107068L) - vM.a(27455, 691014534495743792L));
lbl33:
                    // 2 sources

                    switch (var5_2 /* !! */ ) {
                        default: {
                            return 0.0f;
                        }
                        case 1897644907: {
                            var3_4 = new float[]{0.0f};
                            var4_5 = new float[]{0.0f};
                            hi.a("\u00a5", (Object)var0, (Object)var2_3, (BiConsumer<Holder, AttributeModifier>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$getProtection$0(float[] float[] net.minecraft.core.Holder net.minecraft.world.entity.ai.attributes.AttributeModifier ), (Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V)((float[])var3_4, (float[])var4_5), (long)914026240430918984L);
                            return var3_4[0] * 100.0f + var4_5[0] * 10.0f + (float)vM.s("K1l8O0aBxboBdllv", b(net.minecraft.world.item.ItemStack net.minecraft.resources.ResourceKey<net.minecraft.world.item.enchantment.Enchantment> ), (ItemStack)var0, (ResourceKey)hi.a("j", (long)841090519085723757L));
                        }
                        case 1897644909: 
                    }
                    return (float)hi.a("G", (Object)new Object[]{Float.valueOf(0.0f)}, (long)842688358493305377L);
                    case -1552609488: {
                        return 0.0f;
                    }
                    case -1552609485: 
                }
                break;
            }
            break;
        }
        return 10.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestPowerBow$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (bl) break block4;
                    if (object != false) break block5;
                    object = vM.s("K1l8O0aBxboBdllv", getItem(), (ItemStack)itemStack) instanceof BowItem;
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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

    public static ItemStack D() {
        return (ItemStack)vM.s("K1l8O0aBxboBdllv", orElse(T ), (Optional)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::W, (long)1143211481283200773L), (Object)hi.a("G", vM::lambda$getBestSword$0, (long)860018880249920103L), (long)364845113189698498L)), null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestCrossbowScore$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = vM.s("K1l8O0aBxboBdllv", isEmpty(), (ItemStack)itemStack);
                    if (!bl) break block4;
                    if (object != false) break block5;
                    object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof CrossbowItem;
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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

    private static void lambda$getMainhandAttackDamage$0(float[] fArray, Holder holder, AttributeModifier attributeModifier) {
        if (holder == hi.a("j", (long)539972798385498790L)) {
            fArray[0] = fArray[0] + hi.a("G", (Object)new Object[]{attributeModifier}, (long)902346763848515300L);
        }
    }

    public static float H() {
        return (float)vM.s("K1l8O0aBxboBdllv", floatValue(), (Float)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestPickaxeScore$0, (long)1143211481283200773L), vM::b, (long)935650006110027503L), Float::compareTo, (long)364845113189698498L), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L), (long)535909545969414314L))));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float u(ItemStack var0) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        block14: {
                            block15: {
                                block13: {
                                    block21: {
                                        block20: {
                                            var1_1 = Dl.t();
                                            var2_2 /* !! */  = (hi.a("G", (int)hi.a("G", (int)(vM.a(12597, 1821798880940389389L) / vM.a(27468, 241825219865587143L)), (int)vM.a(14625, 3658898604006375180L), (long)834203424483934088L), (int)vM.a(23129, 4912316594522823956L), (long)834203424483934088L) ^ vM.a(4108, 6526335969660785509L)) + vM.a(15448, 6081147334306724429L);
                                            if (!var1_1) break block20;
lbl4:
                                            // 2 sources

                                            while (var0 != null) {
                                                break block13;
                                            }
                                            break block21;
lbl7:
                                            // 1 sources

                                            while (true) {
                                                v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                                                if (var1_1) break block14;
                                                if (v0 /* !! */  != false) break block15;
                                                break block16;
                                                break;
                                            }
lbl12:
                                            // 2 sources

                                            while (true) {
                                                v1 = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof AxeItem;
                                                if (var1_1) break block17;
                                                if (v1 != 0) break block18;
                                                break block19;
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            return 0.0f;
lbl19:
                                            // 1 sources

                                            return (float)(vM.s("K1l8O0aBxboBdllv", E(java.lang.Object ), (Object)var0) + hi.a("G", (Object)new Object[]{var0}, (long)529641079332437369L));
                                        }
lbl22:
                                        // 7 sources

                                        while (true) {
                                            switch (var2_2 /* !! */ ) {
                                                default: {
                                                    ** GOTO lbl4
                                                }
                                                case -241776986: {
                                                    ** continue;
                                                }
                                                case -241776988: {
                                                    ** GOTO lbl12
                                                }
                                                case -241776985: {
                                                    ** continue;
                                                }
                                                case -241776984: {
                                                    ** continue;
                                                }
                                                case -241776987: 
                                            }
                                            hi.a("G", (long)1264004642033370356L);
                                            if (var1_1) ** break;
                                            break;
                                        }
                                        ** while (true)
                                    }
                                    var2_2 /* !! */  = ((vM.a(14859, 7237467849668263620L) - vM.a(300, 6568029892701701032L) - vM.a(21360, 6316422210402719418L)) / vM.a(32472, 5205922672955373614L) ^ vM.a(7018, 3085301952954849419L)) + vM.a(21745, 5820797426473833364L);
                                    if (!var1_1) ** GOTO lbl22
                                }
                                var2_2 /* !! */  = vM.a(8837, 6877901915422156539L) ^ vM.a(5675, 1301833348317861212L) ^ vM.a(9492, 2119279728593690632L);
                                if (!var1_1) ** GOTO lbl22
                            }
                            v0 /* !! */  = (CallSite)(((vM.a(26665, 1681883260669046674L) - vM.a(14616, 2416094643286277907L) - vM.a(7010, 780241052351191045L)) / vM.a(32472, 5205922672955373614L) ^ vM.a(22685, 2995534921090047564L)) + vM.a(21567, 1065127704620864251L));
                        }
                        var2_2 /* !! */  = (int)v0 /* !! */ ;
                        if (!var1_1) ** GOTO lbl22
                    }
                    var2_2 /* !! */  = (int)(hi.a("G", (int)(vM.a(14828, 7859290407461256669L) ^ vM.a(28376, 5755890441381948388L)), (int)vM.a(18765, 5793449840529705494L), (long)834203424483934088L) - vM.a(18841, 3689104791118253539L) - vM.a(32650, 1374749205857221778L));
                    if (!var1_1) ** GOTO lbl22
                }
                v1 = var2_2 /* !! */  = vM.a(1604, 4003585634542077426L) + vM.a(3394, 3189043162670909681L) ^ vM.a(13830, 5526798986773393890L);
            }
            if (!var1_1) ** GOTO lbl22
        }
        var2_2 /* !! */  = ((vM.a(26665, 1681883260669046674L) - vM.a(14616, 2416094643286277907L) - vM.a(7010, 780241052351191045L)) / vM.a(32472, 5205922672955373614L) ^ vM.a(22685, 2995534921090047564L)) + vM.a(21567, 1065127704620864251L);
        ** while (true)
    }

    private static int lambda$getBestShapeAxe$1(ItemStack itemStack) {
        return (int)(vM.s("K1l8O0aBxboBdllv", u(net.minecraft.world.item.ItemStack ), (ItemStack)itemStack) * 100.0f);
    }

    public static float u(Object[] objectArray) {
        EquipmentSlot equipmentSlot = (EquipmentSlot)objectArray[0];
        return (float)hi.a("\u00a5", (Object)((Float)((Object)vM.s("K1l8O0aBxboBdllv", orElse(T ), (Optional)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), arg_0 -> vM.lambda$getBestArmorScore$0(equipmentSlot, arg_0), (long)1143211481283200773L), vM::v, (long)935650006110027503L), Float::compareTo, (long)364845113189698498L)), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L)))), (long)1263586790430806583L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestPunchBow$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (!bl) break block4;
                    if (object != false) break block5;
                    object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof BowItem;
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static ItemStack e() {
        boolean bl = Dl.t();
        int n = (vM.a(29130, 3272143167782631329L) - vM.a(19890, 7038774357372864667L) - vM.a(15627, 7029821593994754387L)) / vM.a(25729, 5959736332929900787L) / vM.a(1869, 968455849344319811L) + vM.a(4066, 9060843884416124975L);
        boolean bl2 = true;
        block5: while (true) {
            block8: {
                block9: {
                    if (bl2 && !(bl2 = false) && !bl) break block8;
                    if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null) break block9;
                    n = vM.a(26113, 3020227816088150727L) / vM.a(6959, 7226212375651702819L) - vM.a(29083, 1739316358956627141L);
                    if (!bl) break block8;
                }
                n = (vM.a(2357, 6923571250666588912L) ^ vM.a(9710, 6082612902605055871L)) - vM.a(27925, 6164281433946597758L);
            }
            switch (n) {
                default: {
                    continue block5;
                }
                case 813782644: {
                    return hi.a("j", (long)989520643504678076L);
                }
                case 813782643: {
                    return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (int)vM.a(23958, 834060599876361998L), (long)449627806291078247L);
                }
                case 813782641: 
            }
            break;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestPickaxeScore$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("G", (Object)itemStack, (long)691855746686294592L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = vM.s("K1l8O0aBxboBdllv", z(net.minecraft.world.item.ItemStack ), (ItemStack)itemStack);
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
    private static boolean lambda$hasItem$0(Item item, ItemStack itemStack) {
        boolean bl = Dl.t();
        ItemStack itemStack2 = itemStack;
        if (!bl) {
            if (hi.a("\u00a5", (Object)itemStack2, (long)675687955611242108L) != false) return false;
            itemStack2 = itemStack;
        }
        if (hi.a("\u00a5", (Object)itemStack2, (long)769006157898026769L) != item) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float Q(ItemStack var0) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        block14: {
                            block15: {
                                block13: {
                                    block21: {
                                        block20: {
                                            var1_1 = Dl.S();
                                            var3_2 /* !! */  = vM.a(31012, 6907114699351047318L) - vM.a(26878, 562421993503664909L) - vM.a(24596, 6950744531350628045L) + vM.a(18049, 4716662788336157122L) ^ vM.a(11614, 8063331488195603078L);
                                            if (var1_1) break block20;
lbl4:
                                            // 2 sources

                                            while (var0 != null) {
                                                break block13;
                                            }
                                            break block21;
lbl7:
                                            // 1 sources

                                            while (true) {
                                                v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                                                if (!var1_1) break block14;
                                                if (v0 /* !! */  != false) break block15;
                                                break block16;
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                v1 /* !! */  = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof BowItem;
                                                if (!var1_1) break block17;
                                                if (v1 /* !! */  != 0) break block18;
                                                break block19;
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            return 0.0f;
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var2_3 = 10.0f;
                                                var2_3 += (float)hi.a("G", (Object)var0, (Object)hi.a("j", (long)896815039905240446L), (long)1072650197384473271L);
                                                var2_3 += (float)hi.a("G", (Object)var0, (Object)hi.a("j", (long)1201701952320829812L), (long)1072650197384473271L);
                                                var2_3 += (float)hi.a("G", (Object)var0, (Object)hi.a("j", (long)539413511416139578L), (long)1072650197384473271L);
                                                return (var2_3 += (float)vM.s("K1l8O0aBxboBdllv", b(net.minecraft.world.item.ItemStack net.minecraft.resources.ResourceKey<net.minecraft.world.item.enchantment.Enchantment> ), (ItemStack)var0, (ResourceKey)hi.a("j", (long)510297413883108058L)) / 10.0f) + (float)hi.a("\u00a5", (Object)var0, (long)892466845450798011L) / (float)hi.a("\u00a5", (Object)var0, (long)927379308426146560L);
                                            }
                                        }
lbl26:
                                        // 7 sources

                                        while (true) {
                                            switch (var3_2 /* !! */ ) {
                                                default: {
                                                    ** GOTO lbl4
                                                }
                                                case -1469071778: {
                                                    ** continue;
                                                }
                                                case -1469071777: {
                                                    ** continue;
                                                }
                                                case -1469071774: {
                                                    ** continue;
                                                }
                                                case -1469071773: {
                                                    ** continue;
                                                }
                                                case -1469071775: 
                                            }
                                            hi.a("G", (boolean)true, (long)591462649743999036L);
                                            hi.a("G", (double)-1.0, (long)1273198203909826830L);
                                            return 1.0f;
                                        }
                                    }
                                    var3_2 /* !! */  = vM.a(7297, 145976210598549700L) / vM.a(27468, 241825219865587143L) / 5 / vM.a(2904, 2062424234454896584L) + vM.a(2394, 6154910380145168188L);
                                    if (var1_1) ** GOTO lbl26
                                }
                                var3_2 /* !! */  = (vM.a(25736, 8043038478678860552L) / vM.a(1869, 968455849344319811L) ^ vM.a(23530, 7079250145954732336L)) + vM.a(8167, 654781237291179111L) - vM.a(19273, 7872374885817616489L);
                                if (var1_1) ** GOTO lbl26
                            }
                            v0 /* !! */  = (CallSite)(vM.a(3511, 2789932172971362844L) / vM.a(27468, 241825219865587143L) / 5 / vM.a(2904, 2062424234454896584L) + vM.a(13408, 8573439903641793140L));
                        }
                        var3_2 /* !! */  = (int)v0 /* !! */ ;
                        if (var1_1) ** GOTO lbl26
                    }
                    var3_2 /* !! */  = vM.s("K1l8O0aBxboBdllv", max(int int ), (int)vM.a(14534, 4309633444668964237L), (int)vM.a(27678, 2615158064903465459L)) - vM.a(14164, 6710384604632249397L) ^ vM.a(82, 1267649110237758221L);
                    if (var1_1) ** GOTO lbl26
                }
                v1 /* !! */  = var3_2 /* !! */  = (int)(hi.a("G", (int)vM.a(26323, 5359901274044342330L), (int)vM.a(14010, 1842753521759188409L), (long)834203424483934088L) * vM.a(14032, 2254580442346714583L) - vM.a(19880, 4065699788495554696L) - vM.a(13836, 6560312681502536666L) - vM.a(12829, 7211629525878436197L));
            }
            if (var1_1) ** GOTO lbl26
        }
        var3_2 /* !! */  = vM.a(3511, 2789932172971362844L) / vM.a(27468, 241825219865587143L) / 5 / vM.a(2904, 2062424234454896584L) + vM.a(13408, 8573439903641793140L);
        ** while (true)
    }

    private static int lambda$getBestCrossbow$1(ItemStack itemStack) {
        return (int)(hi.a("G", (Object)itemStack, (long)1270422669591476092L) * 100.0f);
    }

    public static ItemStack G() {
        return (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", stream(), (List)((Object)hi.a("G", (long)989880202519854622L))), vM::lambda$getWorstArrow$0, (long)1143211481283200773L), (Object)hi.a("G", ItemStack::getCount, (long)860018880249920103L), (long)966808767256027499L), null, (long)535909545969414314L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean a(Object[] var0) {
        block46: {
            block45: {
                var1_1 = (ItemStack)var0[0];
                var2_2 = Dl.S();
                var5_3 /* !! */  = (vM.a(9573, 6769507835497177956L) / vM.a(12041, 2158887759308548889L) - vM.a(28588, 2180190988499495783L)) / vM.a(27468, 241825219865587143L) / vM.a(2904, 2062424234454896584L) ^ vM.a(13282, 3013952194790618484L);
                if (var2_2) ** GOTO lbl16
                block34: while (true) {
                    block49: {
                        block48: {
                            block47: {
                                v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                                if (!var2_2) break block47;
                                if (v0 /* !! */  != false) break block48;
                                v0 /* !! */  = (CallSite)(vM.a(22184, 1352442389687473420L) ^ vM.a(30193, 3385775712529887721L) ^ vM.a(15479, 1319413788988145307L));
                            }
                            var5_3 /* !! */  = (int)v0 /* !! */ ;
                            if (var2_2) break block49;
                        }
                        var5_3 /* !! */  = vM.a(8379, 761355665245987417L) - vM.a(26893, 5962293796931645143L) + vM.a(4561, 2936807665085731540L);
                    }
                    block35: while (true) {
                        switch (var5_3 /* !! */ ) {
                            default: {
                                continue block34;
                            }
                            case 1424973292: {
                                var3_4 = hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L);
                                v1 /* !! */  = var3_4 instanceof BlockItem;
                                if (!var2_2) ** GOTO lbl33
                                if (v1 /* !! */  == 0) ** GOTO lbl32
                                ** GOTO lbl34
                            }
                            case 1424973291: {
                                hi.a("G", (long)636853863237534702L);
                                var5_3 /* !! */  = (hi.a("G", (int)vM.a(29997, 4613646298282308304L), (int)vM.a(8794, 9208550923238138313L), (long)834203424483934088L) ^ vM.a(2894, 6527256508662827453L)) + vM.a(11587, 1908586518731157084L) - vM.a(9750, 1167415150131307315L);
                                continue block35;
                            }
lbl32:
                            // 1 sources

                            v1 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)((vM.a(9721, 2365379821464412913L) - vM.a(28466, 2188591556873529721L)) / vM.a(32472, 5205922672955373614L) - vM.a(12546, 223185935116235348L)), (int)vM.a(7809, 2352994749956741398L), (long)834203424483934088L) + vM.a(8574, 6672070674833138727L));
lbl33:
                            // 2 sources

                            if (var2_2) break block45;
lbl34:
                            // 2 sources

                            var5_3 /* !! */  = (int)(hi.a("G", (int)((hi.a("G", (int)vM.a(15395, 4726208311586421712L), (int)vM.a(12696, 7146405233148130808L), (long)834203424483934088L) + vM.a(18172, 4181610067356091002L)) / vM.a(2904, 2062424234454896584L)), (int)vM.a(32392, 6327819789090405263L), (long)834203424483934088L) - vM.a(19401, 578980752160198395L));
                            break block45;
                            case 1424973294: 
                        }
                        break;
                    }
                    break;
                }
                return true;
            }
            block36: while (true) {
                switch (var5_3 /* !! */ ) {
                    default: {
                        var4_5 = (BlockItem)var3_4;
                        if (!var2_2) ** GOTO lbl101
                        if (vM.s("K1l8O0aBxboBdllv", getBlock(), (BlockItem)var4_5) == hi.a("j", (long)1173773611913828053L)) ** GOTO lbl100
                        ** GOTO lbl102
                    }
                    case -1725783474: {
                        v2 /* !! */  = var3_4 instanceof WritableBookItem;
                        if (!var2_2) ** GOTO lbl106
                        if (v2 /* !! */  != 0) ** GOTO lbl105
                        ** GOTO lbl107
                    }
                    case -1725783487: {
                        v3 /* !! */  = var3_4 instanceof WrittenBookItem;
                        if (!var2_2) ** GOTO lbl110
                        if (v3 /* !! */  != 0) ** GOTO lbl109
                        ** GOTO lbl111
                    }
                    case -1725783473: {
                        v4 = var3_4 instanceof KnowledgeBookItem;
                        if (!var2_2) ** GOTO lbl114
                        if (v4 == 0) ** GOTO lbl113
                        ** GOTO lbl115
                    }
                    case -1725783481: {
                        v5 = var3_4 instanceof ExperienceBottleItem;
                        if (!var2_2) ** GOTO lbl118
                        if (v5 != 0) ** GOTO lbl117
                        ** GOTO lbl119
                    }
                    case -1725783476: {
                        v6 = var3_4 instanceof FireworkRocketItem;
                        if (!var2_2) ** GOTO lbl122
                        if (v6 == 0) ** GOTO lbl121
                        ** GOTO lbl123
                    }
                    case -1725783485: {
                        if (var3_4 == hi.a("j", (long)764638687227453252L)) ** GOTO lbl125
                        ** GOTO lbl127
                    }
                    case -1725783482: {
                        if (var3_4 == hi.a("j", (long)609258717869691883L)) ** GOTO lbl129
                        ** GOTO lbl131
                    }
                    case -1725783475: {
                        if (var3_4 == hi.a("j", (long)662851561800421435L)) ** GOTO lbl133
                        ** GOTO lbl135
                    }
                    case -1725783483: {
                        if (var3_4 != hi.a("j", (long)983732687820945842L)) ** GOTO lbl137
                        ** GOTO lbl139
                    }
                    case -1725783477: {
                        if (var3_4 == hi.a("j", (long)478253779668057007L)) ** GOTO lbl141
                        ** GOTO lbl143
                    }
                    case -1725783480: {
                        v7 = true;
                        var5_3 /* !! */  = vM.a(5252, 8149813600008066592L) * vM.a(4342, 6333873922040977233L) + vM.a(19037, 927446075061078319L);
                        if (var2_2) ** GOTO lbl146
                        ** GOTO lbl145
                    }
                    case -1725783478: {
                        v7 = false;
                        if (!var2_2) {
                            return v7;
                        }
                        ** GOTO lbl145
                    }
                    case -1725783479: {
                        hi.a("G", (long)1109407344178516224L);
                        return false;
                    }
lbl100:
                    // 1 sources

                    var5_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)vM.a(20863, 7353364209289335487L), (int)vM.a(8820, 1960626466793087378L), (long)834203424483934088L), (int)vM.a(30809, 5651520884972239579L), (long)834203424483934088L) + vM.a(21506, 2946318557153367814L) ^ vM.a(14616, 7623132271298837599L);
lbl101:
                    // 2 sources

                    if (var2_2) break block46;
lbl102:
                    // 2 sources

                    var5_3 /* !! */  = vM.a(12735, 7509911951011968353L) * vM.a(21989, 8094865372814152223L) + vM.a(6345, 8595809703734861632L) ^ vM.a(19007, 5442785759421828721L);
                    if (var2_2) break block46;
                    ** GOTO lbl177
lbl105:
                    // 1 sources

                    v2 /* !! */  = var5_3 /* !! */  = (int)(vM.s("K1l8O0aBxboBdllv", max(int int ), (int)(vM.a(3389, 5883370259575950051L) / vM.a(12041, 2158887759308548889L)), (int)vM.a(22556, 5599338903226457905L)) - vM.a(28063, 920218975922858663L));
lbl106:
                    // 2 sources

                    if (var2_2) continue block36;
lbl107:
                    // 2 sources

                    var5_3 /* !! */  = hi.a("G", (int)(vM.a(21736, 8397267805824095839L) ^ vM.a(6957, 2726155457155194230L)), (int)vM.a(32151, 1395780657925961904L), (long)834203424483934088L) + vM.a(20866, 5414090418126033745L) + vM.a(10653, 8326526415524063926L) ^ vM.a(22875, 2775715146301676542L);
                    if (var2_2) continue block36;
lbl109:
                    // 2 sources

                    v3 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)(vM.a(22987, 6925829245454326448L) / vM.a(12041, 2158887759308548889L)), (int)vM.a(26023, 6735093501888569710L), (long)834203424483934088L) - vM.a(11585, 2926251188941383983L));
lbl110:
                    // 2 sources

                    if (var2_2) continue block36;
lbl111:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(4560, 1010730962044999471L) + vM.a(21090, 2425219503000359130L)) * vM.a(3958, 1707640975558495305L) - vM.a(23538, 472381189393325531L) ^ vM.a(27181, 1357050396636753443L);
                    if (var2_2) continue block36;
lbl113:
                    // 2 sources

                    v4 = var5_3 /* !! */  = vM.a(9287, 7333169195034894993L) + vM.a(26325, 436387388681855647L) + vM.a(6262, 8082990612380540334L);
lbl114:
                    // 2 sources

                    if (var2_2) continue block36;
lbl115:
                    // 2 sources

                    var5_3 /* !! */  = (int)(hi.a("G", (int)(vM.a(22987, 6925829245454326448L) / vM.a(12041, 2158887759308548889L)), (int)vM.a(26023, 6735093501888569710L), (long)834203424483934088L) - vM.a(11585, 2926251188941383983L));
                    if (var2_2) continue block36;
lbl117:
                    // 2 sources

                    v5 = var5_3 /* !! */  = vM.a(29871, 8445864510244336242L) / vM.a(32050, 5888244596651114117L) * vM.a(9003, 2624558726704391980L) / vM.a(1869, 968455849344319811L) * vM.a(24563, 6139635372287335045L) + vM.a(24074, 507662656055417404L);
lbl118:
                    // 2 sources

                    if (var2_2) continue block36;
lbl119:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(6243, 3278608982563249039L) + vM.a(29389, 4380533155629576290L) - vM.a(14703, 8490680549185683350L) ^ vM.a(17179, 645954871319463692L)) - vM.a(25865, 2626610722727502176L) ^ vM.a(3495, 6285554797807421802L);
                    if (var2_2) continue block36;
lbl121:
                    // 2 sources

                    v6 = var5_3 /* !! */  = (vM.a(3145, 36075957602077135L) ^ vM.a(9686, 2188226576796934204L) ^ vM.a(3558, 4858902226358356213L)) * vM.a(25567, 1122673126766978539L) + vM.a(4347, 6735208143771423651L) ^ vM.a(24503, 3268362542961629325L);
lbl122:
                    // 2 sources

                    if (var2_2) continue block36;
lbl123:
                    // 2 sources

                    var5_3 /* !! */  = vM.a(19156, 1305013317851614237L) / vM.a(32050, 5888244596651114117L) * vM.a(22140, 6787826547952358062L) / vM.a(1869, 968455849344319811L) * vM.a(1077, 4507586569623748991L) + vM.a(15576, 8525210650270169822L);
                    if (var2_2) continue block36;
lbl125:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(26700, 2244652921005682528L) + vM.a(14607, 5606695404058148666L)) * vM.a(22304, 309154328373170551L) + vM.a(2114, 8668809396122340633L) + vM.a(4527, 4865925641454965408L);
                    if (var2_2) continue block36;
lbl127:
                    // 2 sources

                    var5_3 /* !! */  = hi.a("G", (int)vM.a(18346, 5381971980155159662L), (int)vM.a(3508, 2580088851623497366L), (long)834203424483934088L) ^ vM.a(28829, 6064062656224179315L);
                    if (var2_2) continue block36;
lbl129:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(2751, 279357850320391815L) + vM.a(24225, 8869280499540433075L)) * vM.a(863, 8070989789963634416L) + vM.a(1926, 8180882313928491589L) + vM.a(3031, 7547344379441105092L);
                    if (var2_2) continue block36;
lbl131:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(1850, 8815823632243507623L) / 3 + vM.a(21203, 6842720754650846688L)) / vM.a(1869, 968455849344319811L) + vM.a(18162, 7416202152886502781L);
                    if (var2_2) continue block36;
lbl133:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(2751, 279357850320391815L) + vM.a(24225, 8869280499540433075L)) * vM.a(863, 8070989789963634416L) + vM.a(1926, 8180882313928491589L) + vM.a(3031, 7547344379441105092L);
                    if (var2_2) continue block36;
lbl135:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(22703, 6248327884566863334L) - vM.a(13206, 7791770360750569365L) ^ vM.a(30236, 1896630038823973324L)) / vM.a(25729, 5959736332929900787L) ^ vM.a(27279, 7520857988993592362L);
                    if (var2_2) continue block36;
lbl137:
                    // 2 sources

                    var5_3 /* !! */  = (int)(hi.a("G", (int)(vM.a(19443, 7561574479332773785L) + vM.a(25305, 4499449883867227918L) - vM.a(7580, 4345426368831512387L) - vM.a(7156, 4959845762502352230L)), (int)vM.a(575, 2688636921949669286L), (long)834203424483934088L) - vM.a(8325, 1796116656709690147L));
                    if (var2_2) continue block36;
lbl139:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(2751, 279357850320391815L) + vM.a(24225, 8869280499540433075L)) * vM.a(863, 8070989789963634416L) + vM.a(1926, 8180882313928491589L) + vM.a(3031, 7547344379441105092L);
                    if (var2_2) continue block36;
lbl141:
                    // 2 sources

                    var5_3 /* !! */  = (vM.a(5171, 8755589782026441286L) ^ vM.a(15788, 1374380204209863434L)) + vM.a(18738, 7172805086117891278L);
                    if (var2_2) continue block36;
lbl143:
                    // 2 sources

                    var5_3 /* !! */  = ((vM.a(16758, 3367724732098151037L) ^ vM.a(7475, 4508071430441687961L)) - vM.a(9058, 8449948942729634300L)) / 5 + vM.a(3302, 5341423861426440415L) - vM.a(30523, 1834297846585439466L);
                    continue block36;
lbl145:
                    // 2 sources

                    var5_3 /* !! */  = vM.a(4296, 9222953537317852515L) * vM.a(30931, 7850262761287236606L) + vM.a(1857, 335373750787851364L);
lbl146:
                    // 2 sources

                    switch (var5_3 /* !! */ ) {
                        case 1485442755: {
                            hi.a("G", (long)738323961753190111L);
                            vM.s("K1l8O0aBxboBdllv", e(float ), (float)0.0f);
                            return v7;
                        }
                    }
                    return v7;
                    case -1725783488: {
                        return false;
                    }
                    case -1725783489: {
                        return false;
                    }
                    case -1725783484: 
                }
                break;
            }
            return false;
        }
        block37: while (true) {
            switch (var5_3 /* !! */ ) {
                default: {
                    if (vM.s("K1l8O0aBxboBdllv", getBlock(), (BlockItem)var4_5) == hi.a("j", (long)481356316423409617L)) ** GOTO lbl177
                    ** GOTO lbl179
                }
                case -1021371093: {
                    v8 = true;
                    var5_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)vM.a(16761, 6119849989562303652L), (int)vM.a(31757, 3736149474613934474L), (long)834203424483934088L), (int)vM.a(32249, 4260454884226775641L), (long)834203424483934088L) ^ vM.a(29381, 2506374852036802165L);
                    if (var2_2) ** GOTO lbl182
                    ** GOTO lbl181
                }
                case -1021371094: {
                    v8 = false;
                    if (!var2_2) {
                        return v8;
                    }
                    ** GOTO lbl181
                }
lbl177:
                // 2 sources

                var5_3 /* !! */  = vM.s("K1l8O0aBxboBdllv", max(int int ), (int)hi.a("G", (int)vM.a(15736, 353683900986128637L), (int)vM.a(17774, 5597331375537095397L), (long)834203424483934088L), (int)vM.a(18166, 8790756131621536395L)) + vM.a(24116, 865713358536612461L) ^ vM.a(32566, 1218955146414602681L);
                if (var2_2) continue block37;
lbl179:
                // 2 sources

                var5_3 /* !! */  = hi.a("G", (int)(vM.a(3623, 8795235497622259808L) + vM.a(31377, 4881998992775561154L) + vM.a(6657, 1231498624434035787L)), (int)vM.a(15097, 2656808270984052085L), (long)834203424483934088L) - vM.a(4650, 7046386704006141430L) ^ vM.a(22897, 7138468528007224537L);
                continue block37;
lbl181:
                // 2 sources

                var5_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)vM.a(18431, 9087172987501412910L), (int)vM.a(25028, 2140052788181411577L), (long)834203424483934088L), (int)vM.a(15049, 4977129103364455994L), (long)834203424483934088L) ^ vM.a(29057, 4654513762518118958L);
lbl182:
                // 2 sources

                switch (var5_3 /* !! */ ) {
                    default: {
                        return v8;
                    }
                    case -264462658: 
                }
                vM.s("K1l8O0aBxboBdllv", B(int ), (int)0);
                return (boolean)hi.a("G", (long)723518858017143060L);
                case -1021371092: 
            }
            break;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$getBestProjectile$0(ItemStack itemStack) {
        ItemStack itemStack2;
        boolean bl;
        block4: {
            block5: {
                bl = Dl.t();
                itemStack2 = itemStack;
                if (!bl) {
                    if (hi.a("\u00a5", (Object)itemStack2, (long)675687955611242108L) != false) return false;
                    itemStack2 = itemStack;
                }
                if (bl) break block4;
                if (hi.a("\u00a5", (Object)itemStack2, (long)769006157898026769L) == hi.a("j", (long)823347519655685809L)) break block5;
                itemStack2 = itemStack;
                if (bl) break block4;
                if (hi.a("\u00a5", (Object)itemStack2, (long)769006157898026769L) != hi.a("j", (long)403740683659965780L)) return false;
            }
            itemStack2 = itemStack;
        }
        Object object = hi.a("G", (Object)itemStack2, (long)865432144196367974L);
        if (bl) return object;
        if (!object) return false;
        return 1;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean k(Object[] var0) {
        block13: {
            var1_1 = (ItemStack)var0[0];
            var2_2 = Dl.t();
            var3_3 /* !! */  = (vM.a(18252, 6685985280645628638L) ^ vM.a(6409, 8129212463329599263L)) * vM.a(23015, 3244369883792743790L) - vM.a(28850, 6565265163279710142L) ^ vM.a(29273, 3697667491041064955L);
            if (!var2_2) ** GOTO lbl17
            block9: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                            if (var2_2) break block14;
                            if (v0 /* !! */  == false) break block15;
                            v0 /* !! */  = (CallSite)(vM.a(9098, 7755336035521683579L) * vM.a(31412, 5580471493114969718L) - vM.a(28131, 2027079954005928588L) - vM.a(13352, 2846339939960156443L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block16;
                    }
                    var3_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)vM.a(6994, 2441073604750499024L), (int)vM.a(2596, 4617055174415862235L), (long)834203424483934088L), (int)vM.a(17853, 2654700665789613885L), (long)834203424483934088L) / vM.a(25729, 5959736332929900787L) ^ vM.a(29644, 7755083951000662367L);
                    if (var2_2) ** GOTO lbl38
                }
                while (true) {
                    block17: {
                        switch (var3_3 /* !! */ ) {
                            default: {
                                continue block9;
                            }
                            case 1611614944: {
                                if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) != hi.a("j", (long)952039448062095237L)) break;
                                break block17;
                            }
                            case 1611614941: {
                                v1 = true;
                                var3_3 /* !! */  = vM.a(12808, 1217343104971437700L) / vM.a(2904, 2062424234454896584L) + vM.a(2506, 4162515874780630731L);
                                if (var2_2) {
                                    break block9;
                                }
                                break block13;
                            }
                            case 1611614942: {
                                v1 = false;
                                if (!var2_2) break block9;
                                return v1;
                            }
                            case 1611614945: {
                                throw null;
                            }
                        }
lbl38:
                        // 2 sources

                        var3_3 /* !! */  = vM.a(14183, 4372970383389618491L) * vM.a(29568, 4744750602311610393L) - vM.a(24886, 8822191655218685158L) - vM.a(18282, 3597073215309185365L);
                        if (!var2_2) continue;
                    }
                    var3_3 /* !! */  = vM.a(11574, 685896054343821757L) * vM.a(21720, 960508699920602734L) - vM.a(17107, 7668852179359368341L) + vM.a(27497, 8615956688220597355L);
                }
                break;
            }
            var3_3 /* !! */  = vM.a(3473, 2797517551196359269L) / vM.a(2904, 2062424234454896584L) + vM.a(11071, 303079100013375433L);
        }
        block11: while (true) {
            switch (var3_3 /* !! */ ) {
                case 513366558: {
                    vM.s("K1l8O0aBxboBdllv", values());
                    hi.a("G", (boolean)true, (long)758395134657997950L);
                    var3_3 /* !! */  = (vM.a(10808, 931287896104169418L) ^ vM.a(19616, 7316602687267375939L)) - vM.a(6200, 4981461545809403595L) - vM.a(11637, 3048695718031845860L) ^ vM.a(348, 7757053196173887195L) ^ vM.a(21650, 675555542337492771L);
                    continue block11;
                }
            }
            break;
        }
        return v1;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int Z() {
        block17: {
            var1 /* !! */  = hi.a("G", (int)(hi.a("G", (int)vM.a(743, 193302559727174067L), (int)vM.a(17161, 5350953601689519175L), (long)834203424483934088L) * vM.a(10885, 6282173054922255767L)), (int)vM.a(12797, 3362829169873024748L), (long)834203424483934088L) - vM.a(560, 4330511699187647615L);
            block12: while (true) {
                switch (var1 /* !! */ ) {
                    default: {
                        if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null) {
                            var1 /* !! */  = (reference)((hi.a("G", (int)hi.a("G", (int)vM.a(14523, 4568797041846188915L), (int)vM.a(5327, 1957541665145246666L), (long)834203424483934088L), (int)vM.a(25339, 2618397848838842003L), (long)834203424483934088L) ^ vM.a(25277, 1314810007090143646L)) * vM.a(17710, 3773345795023209014L) + vM.a(5612, 5845170638765806024L));
                            continue block12;
                        }
                        ** GOTO lbl19
                    }
                    case 31529600: {
                        var0_1 = vM.a(25729, 5959736332929900787L);
                        var1 /* !! */  = hi.a("G", (int)vM.a(20716, 8668139839769515426L), (int)vM.a(12227, 300055534728146056L), (long)834203424483934088L) - vM.a(23413, 3158158640358399044L) + vM.a(8652, 3896110601107007012L);
                        break block17;
                    }
                    case 31529602: {
                        hi.a("G", (float)2.0f, (float)0.0f, (float)1.0f, (float)0.0f, (long)796776827756410481L);
                        hi.a("G", (long)850375381118395903L);
                        return (int)vM.s("K1l8O0aBxboBdllv", H());
                    }
lbl19:
                    // 1 sources

                    var1 /* !! */  = (reference)(vM.a(19899, 8587204559075871089L) + vM.a(19298, 6690453286157913909L) ^ vM.a(2098, 6201764000556174131L));
                    continue block12;
                    case 31529599: 
                }
                break;
            }
            return -1;
        }
        block13: while (true) {
            switch (var1 /* !! */ ) {
                default: {
                    if (var0_1 < hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (long)652319075623640586L), (long)1309741251727777634L)) {
                        var1 /* !! */  = (reference)((hi.a("G", (int)(vM.a(9113, 3532558022454961230L) * vM.a(4263, 1526689344142463969L)), (int)vM.a(26760, 924536945509641895L), (long)834203424483934088L) ^ vM.a(32371, 4095913182322638296L)) - vM.a(17653, 2838360346777485679L));
                        continue block13;
                    }
                    ** GOTO lbl46
                }
                case -722835021: {
                    if (hi.a("\u00a5", (Object)hi.a("G", (int)var0_1, (long)1303164259642563020L), (long)675687955611242108L) != false) {
                        var1 /* !! */  = hi.a("G", (int)vM.a(205, 1629582908767585071L), (int)vM.a(7921, 1402660058755685744L), (long)834203424483934088L) + vM.a(10873, 2862774458571353662L);
                        continue block13;
                    }
                    ** GOTO lbl48
                }
                case -722835019: {
                    ++var0_1;
                    var1 /* !! */  = hi.a("G", (int)vM.a(12209, 8744005069982591617L), (int)vM.a(29908, 3409418368395654116L), (long)834203424483934088L) - vM.a(29131, 3433627968639677850L) + vM.a(20318, 69445518974454062L);
                    continue block13;
                }
                case -722835023: {
                    hi.a("G", (long)1301756410258456892L);
                    var1 /* !! */  = (reference)(vM.a(7643, 5480366980931215010L) * vM.a(26857, 150110146207918670L) / 4 + vM.a(10132, 485023179124663364L) + vM.a(4519, 1726631987361370758L));
                    continue block13;
                }
lbl46:
                // 1 sources

                var1 /* !! */  = (reference)((vM.a(10893, 6557219532079360326L) - vM.a(13585, 8592702312867983645L)) * vM.a(29322, 427108328210085187L) / vM.a(32050, 5888244596651114117L) - vM.a(3537, 621464372356140000L));
                continue block13;
lbl48:
                // 1 sources

                var1 /* !! */  = (reference)((vM.a(29949, 3758077618067059628L) + vM.a(18873, 2436574302623337497L)) * vM.a(23645, 5748290429421821725L) + vM.a(20143, 5435281597844883907L));
                continue block13;
                case -722835018: {
                    return var0_1;
                }
                case -722835020: 
            }
            break;
        }
        return -1;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean z(ItemStack var0) {
        block28: {
            block27: {
                block26: {
                    var1_1 = Dl.S();
                    var3_2 /* !! */  = hi.a("G", (int)((vM.a(26293, 1302535948281291725L) ^ vM.a(10639, 9167482286270508642L)) - vM.a(5666, 5996609439762469275L)), (int)vM.a(16131, 4998593554848152789L), (long)834203424483934088L) - vM.a(6437, 5076081865754173190L);
                    if (var1_1) break block26;
lbl4:
                    // 2 sources

                    while (true) {
                        block30: {
                            block29: {
                                v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                                if (!var1_1) break block29;
                                if (v0 /* !! */  != false) break block30;
                                v0 /* !! */  = var3_2 /* !! */  = (CallSite)(hi.a("G", (int)hi.a("G", (int)vM.a(11909, 8769623365120027234L), (int)vM.a(19380, 447580514128070904L), (long)834203424483934088L), (int)vM.a(25745, 6110058029599957217L), (long)834203424483934088L) * vM.a(25139, 8724394624453978050L) * vM.a(790, 7282943530831857040L) ^ vM.a(28628, 4854980372563897362L));
                            }
                            if (var1_1) break block26;
                        }
                        var3_2 /* !! */  = (CallSite)(vM.a(18936, 8466044462201638780L) + vM.a(18830, 6774549304197843574L) + vM.a(14666, 1968163795211845273L));
                        if (var1_1) break block26;
                        ** GOTO lbl40
                        break;
                    }
lbl15:
                    // 2 sources

                    while (true) {
                        v1 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30163, -6137), (long)1195372608991279295L);
                        if (!var1_1) ** GOTO lbl121
                        if (v1 /* !! */  != false) ** GOTO lbl120
                        ** GOTO lbl122
                        break;
                    }
                }
                block22: while (true) {
                    switch (var3_2 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -2077103087: {
                            v2 = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof PlayerHeadItem;
                            if (!var1_1) ** GOTO lbl41
                            if (v2 == 0) ** GOTO lbl40
                            ** GOTO lbl43
                        }
                        case -2077103088: {
                            var2_3 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var0, (long)923433247397949520L), (long)445233814433577985L);
                            v3 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30171, 29465), (long)1195372608991279295L);
                            if (!var1_1) ** GOTO lbl46
                            if (v3 /* !! */  != false) ** GOTO lbl45
                            ** GOTO lbl47
                        }
                        case -2077103090: {
                            hi.a("G", (long)846570206106968939L);
                            return false;
                        }
lbl40:
                        // 2 sources

                        v2 = vM.a(3232, 1333785217755466030L) / vM.a(6273, 5569664815722191409L) * vM.a(25603, 7142538033483391980L) - vM.a(6498, 4972140485851537289L) + vM.a(7287, 3735007105682397701L) - vM.a(21316, 2483915475011572154L);
lbl41:
                        // 2 sources

                        var3_2 /* !! */  = (CallSite)v2;
                        if (var1_1) continue block22;
lbl43:
                        // 2 sources

                        var3_2 /* !! */  = (CallSite)(vM.a(20814, 5690813000454936186L) + vM.a(8609, 4659429361899102796L) + vM.a(19768, 2323746694315215389L));
                        continue block22;
lbl45:
                        // 1 sources

                        v3 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(24425, 4366498564879325293L) - vM.a(18550, 723341673765899450L) - vM.a(25126, 527746584473248244L) - vM.a(14863, 133810281443260783L));
lbl46:
                        // 2 sources

                        if (var1_1) break block27;
lbl47:
                        // 2 sources

                        var3_2 /* !! */  = (CallSite)(((vM.a(6880, 272401843556277744L) * vM.a(21516, 3102065587765319641L) + vM.a(19310, 1625286097041067623L)) / vM.a(28595, 915842295417678331L) ^ vM.a(1511, 8021823604505526957L)) - vM.a(13801, 3907605221484426771L));
                        if (var1_1) break block27;
                        ** GOTO lbl100
                        case -2077103089: {
                            return true;
                        }
                        case -2077103086: 
                    }
                    break;
                }
                return false;
            }
            block23: while (true) {
                block44: {
                    block42: {
                        block43: {
                            block41: {
                                block39: {
                                    block40: {
                                        block38: {
                                            block36: {
                                                block37: {
                                                    block35: {
                                                        block33: {
                                                            block34: {
                                                                block32: {
                                                                    block31: {
                                                                        switch (var3_2 /* !! */ ) {
                                                                            default: {
                                                                                v4 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30172, 19880), (long)1195372608991279295L);
                                                                                if (!var1_1) break block31;
                                                                                if (v4 /* !! */  != false) break;
                                                                                break block32;
                                                                            }
                                                                            case -932138496: {
                                                                                v5 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30173, 19552), (long)1195372608991279295L);
                                                                                if (!var1_1) break block33;
                                                                                if (v5 /* !! */  != false) break block34;
                                                                                break block35;
                                                                            }
                                                                            case -932138499: {
                                                                                v6 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30164, 12745), (long)1195372608991279295L);
                                                                                if (!var1_1) break block36;
                                                                                if (v6 /* !! */  != false) break block37;
                                                                                break block38;
                                                                            }
                                                                            case -932138495: {
                                                                                hi.a("G", (long)589253768936098215L);
                                                                                hi.a("G", (long)672840781314038705L);
                                                                                ** GOTO lbl15
                                                                            }
                                                                            case -932138502: {
                                                                                ** continue;
                                                                            }
                                                                            case -932138497: {
                                                                                v7 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30161, -14016), (long)1195372608991279295L);
                                                                                if (!var1_1) break block39;
                                                                                if (v7 /* !! */  != false) break block40;
                                                                                break block41;
                                                                            }
                                                                            case -932138494: {
                                                                                v8 /* !! */  = hi.a("\u00a5", (Object)var2_3, (Object)vM.a(30170, 8879), (long)1195372608991279295L);
                                                                                if (!var1_1) break block42;
                                                                                if (v8 /* !! */  != false) break block43;
                                                                                break block44;
                                                                            }
                                                                            case -932138500: {
                                                                                v9 = true;
                                                                                var3_2 /* !! */  = (CallSite)((hi.a("G", (int)(vM.a(3333, 2944426380230708014L) / vM.a(19962, 3038950754624081522L)), (int)vM.a(12359, 6880677105382225202L), (long)834203424483934088L) ^ vM.a(22287, 3034918895682524308L)) + vM.a(10249, 8160954706459913451L));
                                                                                if (!var1_1) {
                                                                                    break block23;
                                                                                }
                                                                                break block28;
                                                                            }
                                                                            case -932138498: {
                                                                                v9 = false;
                                                                                if (var1_1) break block23;
                                                                                return v9;
                                                                            }
                                                                        }
lbl100:
                                                                        // 2 sources

                                                                        v4 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(1024, 4452418706396168784L) - vM.a(21883, 4912517736708871835L) - vM.a(27121, 4873664753087721063L) - vM.a(18618, 3925945212051721409L));
                                                                    }
                                                                    if (var1_1) continue;
                                                                }
                                                                var3_2 /* !! */  = (CallSite)((vM.a(2733, 7995919151157201263L) + vM.a(18630, 7382232134934728080L) ^ vM.a(16728, 5640504224765773703L)) - vM.a(358, 5584638713730287573L));
                                                                if (var1_1) continue;
                                                            }
                                                            v5 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(1024, 4452418706396168784L) - vM.a(21883, 4912517736708871835L) - vM.a(27121, 4873664753087721063L) - vM.a(18618, 3925945212051721409L));
                                                        }
                                                        if (var1_1) continue;
                                                    }
                                                    var3_2 /* !! */  = (CallSite)((vM.a(10023, 9004669146406085511L) * vM.a(2230, 8712162017542425600L) - vM.a(30200, 1493898607561422621L)) / vM.a(25729, 5959736332929900787L) ^ vM.a(6129, 7228116940251190309L));
                                                    if (var1_1) continue;
                                                }
                                                v6 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(1024, 4452418706396168784L) - vM.a(21883, 4912517736708871835L) - vM.a(27121, 4873664753087721063L) - vM.a(18618, 3925945212051721409L));
                                            }
                                            if (var1_1) continue;
                                        }
                                        var3_2 /* !! */  = (CallSite)((vM.a(2752, 8179996535898885820L) / vM.a(25729, 5959736332929900787L) ^ vM.a(8640, 6122294438528083122L)) + vM.a(13777, 3611688749175271644L) + vM.a(23522, 5655464209596751019L));
                                        if (var1_1) continue;
lbl120:
                                        // 2 sources

                                        v1 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(1024, 4452418706396168784L) - vM.a(21883, 4912517736708871835L) - vM.a(27121, 4873664753087721063L) - vM.a(18618, 3925945212051721409L));
lbl121:
                                        // 2 sources

                                        if (var1_1) continue;
lbl122:
                                        // 2 sources

                                        var3_2 /* !! */  = (CallSite)(vM.a(24722, 3480622094982260616L) - vM.a(2947, 4442991975551618876L) - vM.a(7313, 6124751038492793245L) ^ vM.a(17581, 3463147379448808193L));
                                        if (var1_1) continue;
                                    }
                                    v7 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(1024, 4452418706396168784L) - vM.a(21883, 4912517736708871835L) - vM.a(27121, 4873664753087721063L) - vM.a(18618, 3925945212051721409L));
                                }
                                if (var1_1) continue;
                            }
                            var3_2 /* !! */  = (CallSite)(vM.a(7085, 3080701519780339398L) + vM.a(32675, 7426276445004806798L) - vM.a(28282, 3969086915009719161L) ^ vM.a(14167, 4138321486667674873L));
                            if (var1_1) continue;
                        }
                        v8 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(1024, 4452418706396168784L) - vM.a(21883, 4912517736708871835L) - vM.a(27121, 4873664753087721063L) - vM.a(18618, 3925945212051721409L));
                    }
                    if (var1_1) continue;
                }
                var3_2 /* !! */  = (CallSite)(vM.a(24130, 8564224198981327663L) / vM.a(32050, 5888244596651114117L) * vM.a(24678, 3469199171255379881L) ^ vM.a(32334, 4931180728035982076L));
            }
            var3_2 /* !! */  = (CallSite)((hi.a("G", (int)(vM.a(13228, 1751212618562697003L) / vM.a(32266, 2877241253800065138L)), (int)vM.a(29975, 530167626190926681L), (long)834203424483934088L) ^ vM.a(31552, 8522643774141087388L)) + vM.a(28347, 2663254215236856065L));
        }
        switch (var3_2 /* !! */ ) {
            default: {
                return v9;
            }
            case 1961768874: 
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float V(ItemStack var0) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        block14: {
                            block15: {
                                block13: {
                                    block21: {
                                        block20: {
                                            var1_1 = Dl.S();
                                            var3_2 /* !! */  = vM.s("K1l8O0aBxboBdllv", max(int int ), (int)(vM.a(3745, 7923186038872033385L) / vM.a(6959, 7226212375651702819L) ^ vM.a(20455, 5013231759230864134L)), (int)vM.a(24001, 503437143961933931L)) + vM.a(12812, 1068984155286599411L) - vM.a(14164, 4392508371819917635L);
                                            if (var1_1) break block20;
lbl4:
                                            // 2 sources

                                            while (var0 != null) {
                                                break block13;
                                            }
                                            break block21;
lbl7:
                                            // 1 sources

                                            while (true) {
                                                v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                                                if (!var1_1) break block14;
                                                if (v0 /* !! */  != false) break block15;
                                                break block16;
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                v1 /* !! */  = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof CrossbowItem;
                                                if (!var1_1) break block17;
                                                if (v1 /* !! */ ) break block18;
                                                break block19;
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            return 0.0f;
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var2_3 = 0;
                                                var2_3 += hi.a("G", (Object)var0, (Object)hi.a("j", (long)968176302803200274L), (long)1072650197384473271L);
                                                var2_3 += hi.a("G", (Object)var0, (Object)hi.a("j", (long)1065447464073742497L), (long)1072650197384473271L);
                                                return var2_3 += hi.a("G", (Object)var0, (Object)hi.a("j", (long)411860092987356637L), (long)1072650197384473271L);
                                            }
                                        }
lbl25:
                                        // 7 sources

                                        while (true) {
                                            switch (var3_2 /* !! */ ) {
                                                default: {
                                                    ** GOTO lbl4
                                                }
                                                case -50063190: {
                                                    ** continue;
                                                }
                                                case -50063191: {
                                                    ** continue;
                                                }
                                                case -50063192: {
                                                    ** continue;
                                                }
                                                case -50063195: {
                                                    ** continue;
                                                }
                                                case -50063193: 
                                            }
                                            hi.a("G", (long)1147173558201835878L);
                                            return 2.0f;
                                        }
                                    }
                                    var3_2 /* !! */  = (CallSite)(vM.a(6905, 3324264797345602803L) + vM.a(11116, 7290193591741475854L) + vM.a(32243, 3719942886578469757L));
                                    if (var1_1) ** GOTO lbl25
                                }
                                var3_2 /* !! */  = (CallSite)((vM.a(14578, 6947593580949766022L) - vM.a(31299, 6384694191296986589L)) / vM.a(1869, 968455849344319811L) - vM.a(30594, 3082669567093518803L) ^ vM.a(7478, 9075719852160113560L));
                                if (var1_1) ** GOTO lbl25
                            }
                            v0 /* !! */  = var3_2 /* !! */  = (CallSite)(vM.a(14351, 4447191574683941952L) + vM.a(30069, 5062619803852288076L) + vM.a(26760, 6072826440905108323L));
                        }
                        if (var1_1) ** GOTO lbl25
                    }
                    var3_2 /* !! */  = (CallSite)(vM.a(30404, 1091578687312671094L) - vM.a(15193, 6342836121025214537L) ^ vM.a(19030, 4321877670470847957L));
                    if (var1_1) ** GOTO lbl25
                }
                v1 /* !! */  = hi.a("G", (int)(((vM.a(27060, 4105099619215159092L) ^ vM.a(13434, 2954440042156749304L)) - vM.a(27911, 3955239879724673371L)) / vM.a(32266, 2877241253800065138L)), (int)vM.a(16909, 3846086153251030138L), (long)834203424483934088L) - vM.a(11919, 5077302976596895768L);
            }
            var3_2 /* !! */  = (CallSite)v1 /* !! */ ;
            if (var1_1) ** GOTO lbl25
        }
        var3_2 /* !! */  = (CallSite)(vM.a(14351, 4447191574683941952L) + vM.a(30069, 5062619803852288076L) + vM.a(26760, 6072826440905108323L));
        ** while (true)
    }

    public static ItemStack p() {
        return (ItemStack)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", min(java.util.Comparator<? super T> ), (Stream)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getWorstBlock$0, (long)1143211481283200773L)), (Comparator)((Object)vM.s("K1l8O0aBxboBdllv", comparingInt(java.util.function.ToIntFunction<? super T> ), ItemStack::getCount))), null, (long)535909545969414314L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static List<ItemStack> x() {
        var2 /* !! */  = vM.a(317, 6512227345360471213L) ^ vM.a(3114, 4618585840026503461L) ^ vM.a(11502, 6963029936621676844L);
        block12: while (true) {
            switch (var2 /* !! */ ) {
                default: {
                    var0_1 = new ArrayList<ItemStack>();
                    var2 /* !! */  = hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L) == null ? (vM.a(23770, 290244602849008043L) + vM.a(14272, 7193018176512028782L)) * vM.a(14140, 3461113161762043357L) ^ vM.a(6842, 1335351473258913439L) : (vM.a(26072, 1963533000277894114L) ^ vM.a(6636, 1091699543081277976L) ^ vM.a(18390, 7057365678374814687L)) + vM.a(13226, 7007857982051022023L) + vM.a(16384, 189433286493013210L);
                }
                case -296507903: {
                    hi.a("G", (long)355962802566144244L);
                    vM.s("K1l8O0aBxboBdllv", values());
                    var2 /* !! */  = vM.a(20151, 4243339573208747056L) / 4 - vM.a(15508, 6465226359163060080L);
                    continue block12;
                }
            }
            break;
        }
        switch (var2 /* !! */ ) {
            default: {
                return var0_1;
            }
            case -1173801350: {
                var1_2 = 0;
                var2 /* !! */  = (int)(hi.a("G", (int)vM.a(10269, 6900622577204588531L), (int)vM.a(28673, 7174252499485144789L), (long)834203424483934088L) - vM.a(29255, 7473334583872107953L) + vM.a(30687, 6331300619468190562L));
                break;
            }
            case -1173801351: {
                throw null;
            }
        }
        block13: while (true) {
            switch (var2 /* !! */ ) {
                default: {
                    if (var1_2 < hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L), (long)1119095325570777413L), (long)1083370172219505635L)) {
                        var2 /* !! */  = vM.s("K1l8O0aBxboBdllv", max(int int ), (int)(vM.a(8215, 1021161604567458697L) / vM.a(20192, 813614737635445453L)), (int)vM.a(18526, 4650792990456352755L)) ^ vM.a(3864, 1622003442905107652L);
                        continue block13;
                    }
                    ** GOTO lbl44
                }
                case -402080369: {
                    hi.a("\u00a5", var0_1, (Object)vM.s("K1l8O0aBxboBdllv", getItem(int ), (Inventory)vM.s("K1l8O0aBxboBdllv", getInventory(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1285467445182668332L)), (int)var1_2), (long)490119386715296288L);
                    ++var1_2;
                    var2 /* !! */  = (int)(hi.a("G", (int)vM.a(24069, 843869579247229362L), (int)vM.a(13337, 4606902648733855759L), (long)834203424483934088L) - vM.a(17716, 5838654690529706931L) + vM.a(20614, 402413946463490970L));
                    continue block13;
                }
                case -402080370: {
                    hi.a("G", (long)1132178910276236922L);
                    hi.a("G", (long)399723549164886403L);
                    return null;
                }
lbl44:
                // 1 sources

                var2 /* !! */  = (int)(hi.a("G", (int)(vM.a(16018, 7660418644828322508L) ^ vM.a(32747, 3426124482114304944L)), (int)vM.a(6072, 3315713507015808151L), (long)834203424483934088L) + vM.a(14794, 485428560327475064L));
                continue block13;
                case -402080368: 
            }
            break;
        }
        return var0_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestShovel$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (!bl) break block4;
                    if (object != false) break block5;
                    object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof ShovelItem;
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
    private static boolean lambda$getBestShovelScore$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (!bl) break block4;
                    if (object != false) break block5;
                    object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof ShovelItem;
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
    private static boolean lambda$getFishingRod$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = vM.s("K1l8O0aBxboBdllv", isEmpty(), (ItemStack)itemStack);
                    if (bl) break block4;
                    if (object != false) break block5;
                    object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof FishingRodItem;
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
    private static boolean lambda$shouldDisableFeatures$0(ItemStack itemStack) {
        boolean bl = Dl.t();
        ItemStack itemStack2 = itemStack;
        if (!bl) {
            if (hi.a("\u00a5", (Object)itemStack2, (long)675687955611242108L) != false) {
                return false;
            }
            itemStack2 = itemStack;
        }
        CallSite callSite = vM.s("K1l8O0aBxboBdllv", getString(), (Component)hi.a("\u00a5", (Object)itemStack2, (long)923433247397949520L));
        Object object = hi.a("\u00a5", (Object)callSite, (Object)vM.a(30165, -32484), (long)1195372608991279295L);
        if (bl) return (boolean)object;
        if (object == false) {
            object = hi.a("\u00a5", (Object)callSite, (Object)vM.a(30169, -22510), (long)1195372608991279295L);
            if (bl) return (boolean)object;
            if (object == false) {
                object = hi.a("\u00a5", (Object)callSite, (Object)vM.a(30168, 4685), (long)1195372608991279295L);
                if (bl) return (boolean)object;
                if (object == false) {
                    object = vM.s("K1l8O0aBxboBdllv", contains(java.lang.CharSequence ), (String)((Object)callSite), (CharSequence)vM.a(30166, -27703));
                    if (bl) return (boolean)object;
                    if (object == false) {
                        object = hi.a("\u00a5", (Object)callSite, (Object)vM.a(30160, 23883), (long)1195372608991279295L);
                        if (bl) return (boolean)object;
                        if (object == false) {
                            object = hi.a("\u00a5", (Object)callSite, (Object)vM.a(30162, -20848), (long)1195372608991279295L);
                            if (bl) return (boolean)object;
                            if (object == false) {
                                object = hi.a("\u00a5", (Object)callSite, (Object)vM.a(30167, 19452), (long)1195372608991279295L);
                                if (bl) return (boolean)object;
                                if (object == false) {
                                    object = false;
                                    return (boolean)object;
                                }
                            }
                        }
                    }
                }
            }
        }
        object = true;
        return (boolean)object;
    }

    private static int lambda$getBestPunchBow$1(ItemStack itemStack) {
        return (int)(vM.s("K1l8O0aBxboBdllv", Q(net.minecraft.world.item.ItemStack ), (ItemStack)itemStack) * 100.0f);
    }

    /*
     * Exception decompiling
     */
    public static int Q(Item var0) {
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
    public static boolean W(ItemStack var0) {
        block13: {
            var1_1 = Dl.S();
            var2_2 /* !! */  = hi.a("G", (int)(vM.a(5507, 2098550510656377512L) - vM.a(5368, 1597499090138485533L)), (int)vM.a(29730, 6784592411611705935L), (long)834203424483934088L) + vM.a(22703, 310067944617582569L) + vM.a(32099, 7270833901233355220L) ^ vM.a(4003, 4981836224958286416L);
            if (var1_1) ** GOTO lbl11
            block10: while (true) {
                block15: {
                    block14: {
                        if (var0 != null) break block14;
                        var2_2 /* !! */  = vM.a(754, 3741984230033474643L) ^ vM.a(30315, 5106881657907819065L) ^ vM.a(28754, 3140080801859613805L);
                        if (var1_1) break block15;
                    }
                    var2_2 /* !! */  = (vM.a(25755, 8930094159301780294L) - vM.a(3895, 3584375093312637914L)) / vM.a(26902, 2908950934052907641L) - vM.a(2840, 7502308859517683944L);
                    if (!var1_1) ** GOTO lbl42
                }
                block11: while (true) {
                    block20: {
                        block18: {
                            block19: {
                                block17: {
                                    block16: {
                                        switch (var2_2 /* !! */ ) {
                                            default: {
                                                continue block10;
                                            }
                                            case 179401293: {
                                                v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                                                if (!var1_1) break block16;
                                                if (v0 /* !! */  != false) break;
                                                break block17;
                                            }
                                            case 179401296: {
                                                v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("j", (long)1071997532801035536L), (Object)vM.s("K1l8O0aBxboBdllv", getItem(), (ItemStack)var0), (long)1128025236213057684L);
                                                if (!var1_1) break block18;
                                                if (v1 /* !! */  == false) break block19;
                                                break block20;
                                            }
                                            case 179401295: {
                                                v2 = true;
                                                var2_2 /* !! */  = (vM.a(26171, 2772225887460368504L) / vM.a(6959, 7226212375651702819L) / vM.a(24791, 5013081986464195495L) / vM.a(12041, 2158887759308548889L) ^ vM.a(27253, 8390806305484089658L)) + vM.a(16169, 7328888535556814890L);
                                                if (!var1_1) {
                                                    break block10;
                                                }
                                                break block13;
                                            }
                                            case 179401292: {
                                                v2 = false;
                                                if (var1_1) break block10;
                                                return v2;
                                            }
                                            case 179401297: {
                                                hi.a("G", (long)1018118041190145658L);
                                                var2_2 /* !! */  = (int)(vM.s("K1l8O0aBxboBdllv", max(int int ), (int)(hi.a("G", (int)vM.a(5126, 865735196764426407L), (int)vM.a(23979, 8518664030313093483L), (long)834203424483934088L) - vM.a(5025, 8807248806631822896L) + vM.a(2204, 5429536186618563959L)), (int)vM.a(4544, 6683242833674392376L)) + vM.a(18925, 4988830106946013910L));
                                                continue block11;
                                            }
                                        }
lbl42:
                                        // 2 sources

                                        v0 /* !! */  = (CallSite)(vM.a(4962, 166145124085191682L) ^ vM.a(3342, 2942964552664435174L) ^ vM.a(9651, 6640643217628652152L));
                                    }
                                    var2_2 /* !! */  = (int)v0 /* !! */ ;
                                    if (var1_1) continue;
                                }
                                var2_2 /* !! */  = vM.a(2177, 3748479057778265621L) - vM.a(16878, 4339490194639913641L) + vM.a(9190, 3140495002103046379L);
                                if (var1_1) continue;
                            }
                            v1 /* !! */  = (CallSite)(vM.a(4962, 166145124085191682L) ^ vM.a(3342, 2942964552664435174L) ^ vM.a(9651, 6640643217628652152L));
                        }
                        var2_2 /* !! */  = (int)v1 /* !! */ ;
                        if (var1_1) continue;
                    }
                    var2_2 /* !! */  = (vM.a(19846, 4236934908418525592L) - vM.a(5279, 9127043846834934638L)) / vM.a(25729, 5959736332929900787L) / 5 + vM.a(22819, 9008757901640048415L);
                }
                break;
            }
            var2_2 /* !! */  = (vM.a(2572, 1368768391180078915L) / vM.a(6959, 7226212375651702819L) / vM.a(12041, 2158887759308548889L) / vM.a(12041, 2158887759308548889L) ^ vM.a(20344, 6474038430336912053L)) + vM.a(7124, 6027400784561954807L);
        }
        switch (var2_2 /* !! */ ) {
            default: {
                return v2;
            }
            case 715963604: 
        }
        throw null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean g(ItemStack var0) {
        block13: {
            var1_1 = Dl.S();
            var2_2 /* !! */  = hi.a("G", (int)(vM.a(8689, 2172882742924829194L) / vM.a(1869, 968455849344319811L)), (int)vM.a(9352, 5606680995251675696L), (long)834203424483934088L) / vM.a(4367, 5285942171892568993L) / 4 + vM.a(24747, 2698892628202956500L);
            if (var1_1) ** GOTO lbl14
            block9: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 /* !! */  = (cfr_temp_0 = hi.a("G", (Object)var0, (long)961292845328887266L) - 10.0f) == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            if (!var1_1) break block14;
                            if (v0 /* !! */  > 0) break block15;
                            v0 /* !! */  = var2_2 /* !! */  = (reference)((vM.a(23776, 8298331273081428523L) ^ vM.a(13551, 5095547001672431461L)) - vM.a(10263, 2494485357753265054L));
                        }
                        if (var1_1) break block16;
                    }
                    var2_2 /* !! */  = hi.a("G", (int)(vM.a(8487, 6235075763727165079L) - vM.a(16996, 4377625751793927737L)), (int)vM.a(20040, 6876485761883245534L), (long)834203424483934088L) * vM.a(19537, 3998149115535788326L) - vM.a(14031, 4253254827956924590L);
                    if (!var1_1) ** GOTO lbl34
                }
                block10: while (true) {
                    switch (var2_2 /* !! */ ) {
                        default: {
                            continue block9;
                        }
                        case -1535931921: {
                            v1 /* !! */  = hi.a("G", (Object)var0, (long)865432144196367974L);
                            if (!var1_1) ** GOTO lbl35
                            if (v1 /* !! */  == false) ** GOTO lbl34
                            ** GOTO lbl36
                        }
                        case -1535931923: {
                            v2 = true;
                            var2_2 /* !! */  = (reference)(vM.a(3369, 755346878787144104L) / vM.a(20192, 813614737635445453L) * vM.a(25688, 1920114760872764203L) - vM.a(29335, 8707580365410022862L));
                            if (var1_1) break block13;
                            ** GOTO lbl38
                        }
                        case -1535931920: {
                            v2 = false;
                            if (!var1_1) {
                                return v2;
                            }
                            ** GOTO lbl38
                        }
lbl34:
                        // 2 sources

                        v1 /* !! */  = var2_2 /* !! */  = (reference)((vM.a(13046, 854352750232301583L) ^ vM.a(1351, 8845188518030459188L)) - vM.a(24215, 419132549550086340L));
lbl35:
                        // 2 sources

                        if (var1_1) continue block10;
lbl36:
                        // 2 sources

                        var2_2 /* !! */  = (reference)(vM.a(14059, 2511324002225320227L) - vM.a(21932, 2901823199077241568L) - vM.a(3827, 4966661223850821633L));
                        continue block10;
lbl38:
                        // 2 sources

                        var2_2 /* !! */  = (reference)(vM.a(26936, 511811582659079717L) / vM.a(20192, 813614737635445453L) * vM.a(13273, 6148493091688345907L) - vM.a(15528, 2761608064700546620L));
                        break block13;
                        case -1535931922: 
                    }
                    break;
                }
                break;
            }
            return (boolean)hi.a("G", (int)vM.a(4367, 5285942171892568993L), (long)801972633595358600L);
        }
        block11: while (true) {
            switch (var2_2 /* !! */ ) {
                case -144991080: {
                    hi.a("G", (long)437292628650123400L);
                    hi.a("G", (long)592969102983354683L);
                    var2_2 /* !! */  = (reference)(hi.a("G", (int)(hi.a("G", (int)(vM.a(5399, 8294304700004062854L) + vM.a(27194, 4229832396175159286L)), (int)vM.a(11822, 5724976153481177490L), (long)834203424483934088L) * vM.a(11310, 3348483522006247740L)), (int)vM.a(18352, 4607948741881431118L), (long)834203424483934088L) ^ vM.a(4513, 6924528736155162532L));
                    continue block11;
                }
            }
            break;
        }
        return v2;
    }

    public static ItemStack I() {
        return (ItemStack)vM.s("K1l8O0aBxboBdllv", orElse(T ), (Optional)((Object)vM.s("K1l8O0aBxboBdllv", max(java.util.Comparator<? super T> ), (Stream)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestAxe$0, (long)1143211481283200773L)), (Comparator)((Object)hi.a("G", vM::lambda$getBestAxe$1, (long)860018880249920103L)))), null);
    }

    public static boolean T(Item item) {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), arg_0 -> vM.lambda$hasItem$0(item, arg_0), (long)805579658527532940L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float b(ItemStack var0) {
        var1_1 = Dl.S();
        var4_2 /* !! */  = vM.s("K1l8O0aBxboBdllv", max(int int ), (int)(vM.a(16063, 2421671576876449207L) ^ vM.a(24835, 1537491426319049836L)), (int)vM.a(16592, 7430325174378661057L)) + vM.a(9161, 772760570970006665L);
        if (var1_1) ** GOTO lbl48
lbl4:
        // 2 sources

        while (true) {
            if (var0 == null) ** GOTO lbl44
            ** GOTO lbl46
            break;
        }
lbl7:
        // 2 sources

        while (true) {
            v0 = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof AxeItem;
            if (!var1_1) ** GOTO lbl112
            if (v0 == 0) ** GOTO lbl111
            ** GOTO lbl115
            break;
        }
lbl12:
        // 2 sources

        while (true) {
            v1 = hi.a("\u00a5", (Object)var0, (long)769006157898026769L) instanceof ShovelItem;
            if (!var1_1) ** GOTO lbl120
            if (v1 == 0) ** GOTO lbl119
            if (true) ** GOTO lbl123
            break;
        }
        block24: while (true) {
            block37: {
                block36: {
                    block35: {
                        v2 /* !! */  = var3_4 /* !! */  = v3 /* !! */ ;
                        if (!var1_1) break block35;
                        if (v2 /* !! */  > 0) break block36;
                        v2 /* !! */  = var4_2 /* !! */  = (reference)((vM.a(10120, 6603851814979068618L) - vM.a(717, 598345570192672130L) - vM.a(31701, 9150728687226403874L)) / 2 - vM.a(6564, 2500204744687771000L));
                    }
                    if (var1_1) ** GOTO lbl33
                }
                var4_2 /* !! */  = hi.a("G", (int)vM.a(16799, 1228613523160335490L), (int)vM.a(16422, 4198493281454065356L), (long)834203424483934088L) + vM.a(27892, 1009726079600437358L) - vM.a(8037, 5743024103636490294L) + vM.a(2099, 5676487461217782983L) - vM.a(1696, 8594360046346912116L);
                if (var1_1) ** GOTO lbl33
                if (true) ** GOTO lbl32
                block25: while (true) {
                    var2_3 += (float)var3_4 /* !! */  * 0.0075f;
                    if (!var1_1) {
                        return (float)var2_3;
                    }
lbl32:
                    // 3 sources

                    var4_2 /* !! */  = (reference)((vM.a(14694, 396292684332891566L) - vM.a(13975, 7555355185974670440L) - vM.a(3336, 2684160933588815511L)) / 2 - vM.a(25654, 1369644516467843779L));
lbl33:
                    // 3 sources

                    switch (var4_2 /* !! */ ) {
                        default: {
                            continue block25;
                        }
                        case -1776539986: {
                            return (float)var2_3;
                        }
                        case -1776539985: 
                    }
                    hi.a("G", (long)930884602760909661L);
                    if (!var1_1) break;
                }
lbl44:
                // 2 sources

                var4_2 /* !! */  = (reference)((vM.a(11868, 3768579941571816043L) - vM.a(9628, 2744489431816266140L)) / 5 - vM.a(4728, 215884713439973869L));
                if (var1_1) break block37;
lbl46:
                // 2 sources

                var4_2 /* !! */  = (reference)(vM.a(2062, 2135070027286334450L) * vM.a(13757, 3758966574103261892L) + vM.a(16160, 6668708130608708485L) + vM.a(8385, 5719717112493957913L));
                if (!var1_1) ** GOTO lbl93
            }
            block26: while (true) {
                switch (var4_2 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 655470187: {
                        v4 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                        if (!var1_1) ** GOTO lbl94
                        if (v4 /* !! */  != false) ** GOTO lbl93
                        ** GOTO lbl95
                    }
                    case 655470186: {
                        v5 /* !! */  = hi.a("G", (Object)new Object[]{var0}, (long)1252112210213067715L);
                        if (!var1_1) ** GOTO lbl98
                        if (v5 /* !! */  != false) ** GOTO lbl97
                        ** GOTO lbl99
                    }
                    case 655470188: {
                        v6 /* !! */  = hi.a("G", (Object)new Object[]{var0}, (long)535187538840369779L);
                        if (!var1_1) ** GOTO lbl102
                        if (v6 /* !! */  == false) ** GOTO lbl101
                        ** GOTO lbl103
                    }
                    case 655470193: {
                        v7 /* !! */  = hi.a("G", (Object)var0, (long)691855746686294592L);
                        if (!var1_1) ** GOTO lbl106
                        if (v7 /* !! */  == false) ** GOTO lbl105
                        ** GOTO lbl107
                    }
                    case 655470181: {
                        var2_3 = hi.a("\u00a5", (Object)var0, (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1262743291737783379L), (long)879105531338288678L), (long)939510294556438524L);
                        if (var1_1) ** GOTO lbl109
                        ** GOTO lbl7
                    }
                    case 655470182: {
                        ** continue;
                    }
                    case 655470185: {
                        var2_3 = hi.a("\u00a5", (Object)var0, (Object)vM.s("K1l8O0aBxboBdllv", defaultBlockState(), (Block)hi.a("j", (long)804264198193050337L)), (long)939510294556438524L);
                        if (var1_1) ** GOTO lbl117
                        ** GOTO lbl12
                    }
                    case 655470192: {
                        ** continue;
                    }
                    case 655470191: {
                        var2_3 = hi.a("\u00a5", (Object)var0, (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1161209414218551480L), (long)879105531338288678L), (long)939510294556438524L);
                        if (!var1_1) {
                            return 0.0f;
                        }
                        ** GOTO lbl125
                    }
                    case 655470184: {
                        throw null;
                    }
lbl93:
                    // 2 sources

                    v4 /* !! */  = var4_2 /* !! */  = (reference)((vM.a(6775, 227368210504310466L) - vM.a(29171, 8917191849599709957L)) / 5 - vM.a(25984, 1036598134343902736L));
lbl94:
                    // 2 sources

                    if (var1_1) continue block26;
lbl95:
                    // 2 sources

                    var4_2 /* !! */  = (reference)((vM.a(3929, 3390754796412718116L) ^ vM.a(13127, 8091902071334008673L)) / 2 ^ vM.a(18391, 4167145368737285073L));
                    if (var1_1) continue block26;
lbl97:
                    // 2 sources

                    v5 /* !! */  = var4_2 /* !! */  = (reference)((vM.a(6775, 227368210504310466L) - vM.a(29171, 8917191849599709957L)) / 5 - vM.a(25984, 1036598134343902736L));
lbl98:
                    // 2 sources

                    if (var1_1) continue block26;
lbl99:
                    // 2 sources

                    var4_2 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(vM.a(31864, 8040049191710734398L) + vM.a(26433, 5618007704534655136L)), (int)vM.a(30231, 8428562472621814118L), (long)834203424483934088L) / 5), (int)vM.a(17915, 5791717699579839475L), (long)834203424483934088L) - vM.a(23652, 1289052135352114974L);
                    if (var1_1) continue block26;
lbl101:
                    // 2 sources

                    v6 /* !! */  = var4_2 /* !! */  = (reference)((vM.a(29376, 1296101159876309493L) - vM.a(5661, 5175418728825868677L)) / 3 ^ vM.a(22763, 1445789334307117571L) ^ vM.a(7508, 1984535829790382120L));
lbl102:
                    // 2 sources

                    if (var1_1) continue block26;
lbl103:
                    // 2 sources

                    var4_2 /* !! */  = (reference)((vM.a(6775, 227368210504310466L) - vM.a(29171, 8917191849599709957L)) / 5 - vM.a(25984, 1036598134343902736L));
                    if (var1_1) continue block26;
lbl105:
                    // 2 sources

                    v7 /* !! */  = var4_2 /* !! */  = (reference)((vM.a(13663, 5098427103303791574L) * vM.a(1870, 6104534648767299971L) ^ vM.a(21008, 5484660509121516689L)) + vM.a(11192, 4577063208139845021L) - vM.a(3191, 9385562954713458L));
lbl106:
                    // 2 sources

                    if (var1_1) continue block26;
lbl107:
                    // 2 sources

                    var4_2 /* !! */  = (reference)((vM.a(18053, 4099170786994750216L) + vM.a(16048, 1770989136546495874L)) * vM.a(15360, 8097893782924917003L) / vM.a(1869, 968455849344319811L) ^ vM.a(29439, 5413118035857389390L));
                    continue block26;
lbl109:
                    // 1 sources

                    var4_2 /* !! */  = (reference)(vM.a(31476, 6299041748787411271L) + vM.a(23720, 4352056321126734803L) - vM.a(1806, 228675311738241583L));
                    if (var1_1) ** GOTO lbl126
lbl111:
                    // 2 sources

                    v0 = vM.a(23398, 8481776817416542378L) - vM.a(11538, 8678545443678873750L) - vM.a(28286, 7204789894059240676L) ^ vM.a(5502, 1172169595382321157L);
lbl112:
                    // 2 sources

                    var4_2 /* !! */  = (reference)v0;
                    if (var1_1) continue block26;
lbl115:
                    // 2 sources

                    var4_2 /* !! */  = (reference)((vM.a(18440, 6622002461307834008L) / 3 ^ vM.a(30011, 8772072176700437467L)) * vM.a(15782, 8854615103577487631L) - vM.a(24456, 9086552205675043556L));
                    continue block26;
lbl117:
                    // 1 sources

                    var4_2 /* !! */  = (reference)(vM.a(2535, 7212703798474919292L) + vM.a(28296, 4612746659797575963L) - vM.a(24444, 803224783540165168L));
                    if (var1_1) ** GOTO lbl126
lbl119:
                    // 2 sources

                    v1 = (vM.a(15947, 5777357559490476815L) - vM.a(31262, 2231134734340570127L) ^ vM.a(19881, 9177024849918462689L)) + vM.a(29036, 8225539574719330057L);
lbl120:
                    // 2 sources

                    var4_2 /* !! */  = (reference)v1;
                    if (var1_1) continue block26;
lbl123:
                    // 2 sources

                    var4_2 /* !! */  = (reference)(vM.a(4922, 2982140130282198159L) + vM.a(9619, 6563156666172760899L) + vM.a(8515, 3141395561031328325L));
                    continue block26;
lbl125:
                    // 1 sources

                    var4_2 /* !! */  = (reference)(vM.a(2535, 7212703798474919292L) + vM.a(28296, 4612746659797575963L) - vM.a(24444, 803224783540165168L));
lbl126:
                    // 3 sources

                    v3 /* !! */  = var4_2 /* !! */ ;
                    if (!var1_1) continue block24;
                    switch (v3 /* !! */ ) {
                        default: {
                            v3 /* !! */  = hi.a("G", (Object)var0, (Object)hi.a("j", (long)1034364158140147159L), (long)1072650197384473271L);
                            continue block24;
                        }
                        case -764051811: 
                    }
                    vM.s("K1l8O0aBxboBdllv", values());
                    hi.a("G", (long)666523559234091957L);
                    return (float)hi.a("G", (long)1052312102167579273L);
                    case 655470189: {
                        return 0.0f;
                    }
                    case 655470183: 
                }
                break;
            }
            break;
        }
        return 0.0f;
    }

    public static ItemStack d() {
        return (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestShovel$0, (long)1143211481283200773L), (Object)hi.a("G", vM::lambda$getBestShovel$1, (long)860018880249920103L), (long)364845113189698498L), null, (long)535909545969414314L);
    }

    public static ItemStack a() {
        return (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestCrossbow$0, (long)1143211481283200773L), (Object)hi.a("G", vM::lambda$getBestCrossbow$1, (long)860018880249920103L), (long)364845113189698498L), null, (long)535909545969414314L);
    }

    private static void lambda$getProtection$0(float[] fArray, float[] fArray2, Holder holder, AttributeModifier attributeModifier) {
        block6: {
            CallSite callSite;
            Holder holder2;
            block4: {
                block5: {
                    boolean bl = Dl.S();
                    holder2 = holder;
                    callSite = hi.a("j", (long)790786990245679744L);
                    if (!bl) break block4;
                    if (holder2 != callSite) break block5;
                    fArray[0] = fArray[0] + hi.a("G", (Object)new Object[]{attributeModifier}, (long)902346763848515300L);
                    if (bl) break block6;
                }
                holder2 = holder;
                callSite = hi.a("j", (long)1077212429032069813L);
            }
            if (holder2 == callSite) {
                fArray2[0] = fArray2[0] + hi.a("G", (Object)new Object[]{attributeModifier}, (long)902346763848515300L);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static Integer F(Object[] var0) {
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

    public static ItemStack j() {
        return (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", stream(), (List)((Object)hi.a("G", (long)989880202519854622L))), vM::lambda$getBestProjectile$0, (long)1143211481283200773L), (Object)hi.a("G", ItemStack::getCount, (long)860018880249920103L), (long)364845113189698498L), null, (long)535909545969414314L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean y(Object[] var0) {
        block15: {
            var1_1 = (ItemStack)var0[0];
            var2_2 = Dl.S();
            var3_3 = hi.a("G", (int)((vM.a(26807, 1592947770379153213L) - vM.a(16248, 453429299603634759L)) / vM.a(1869, 968455849344319811L)), (int)vM.a(13922, 5927040418212049764L), (long)834203424483934088L) - vM.a(20627, 4847619974952817738L);
            if (var2_2) ** GOTO lbl16
            block11: while (true) {
                block18: {
                    block17: {
                        block16: {
                            v0 = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                            if (!var2_2) break block16;
                            if (v0 == false) break block17;
                            v0 = var3_3 = (reference)(vM.a(19118, 3848072143270514281L) / 2 + vM.a(1334, 7649767320737792228L) - vM.a(18763, 4872783661486213721L) + vM.a(26550, 9135768332958114936L) + vM.a(19879, 4902311845024106635L));
                        }
                        if (var2_2) break block18;
                    }
                    var3_3 = (reference)(vM.a(24621, 2074950085108605685L) - vM.a(5829, 6913582846772401647L) + vM.a(1680, 6883773958758416773L) ^ vM.a(2037, 5979766432287638814L));
                    if (!var2_2) ** GOTO lbl56
                }
                block12: while (true) {
                    block26: {
                        block24: {
                            block25: {
                                block23: {
                                    block21: {
                                        block22: {
                                            block20: {
                                                block19: {
                                                    switch (var3_3) {
                                                        default: {
                                                            continue block11;
                                                        }
                                                        case 1139698959: {
                                                            v1 = hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) instanceof AxeItem;
                                                            if (!var2_2) break block19;
                                                            if (v1 == 0) break;
                                                            break block20;
                                                        }
                                                        case 1139698962: {
                                                            v2 /* !! */  = hi.a("G", (Object)var1_1, (Object)hi.a("j", (long)869065030302155908L), (long)1072650197384473271L);
                                                            v3 = vM.a(32266, 2877241253800065138L);
                                                            if (!var2_2) break block21;
                                                            if (v2 /* !! */  < v3) break block22;
                                                            break block23;
                                                        }
                                                        case 1139698961: {
                                                            v4 /* !! */  = hi.a("G", (Object)var1_1, (Object)hi.a("j", (long)869065030302155908L), (long)1072650197384473271L);
                                                            v5 = vM.a(26460, 8870331709566919909L);
                                                            if (!var2_2) break block24;
                                                            if (v4 /* !! */  >= v5) break block25;
                                                            break block26;
                                                        }
                                                        case 1139698957: {
                                                            v6 = true;
                                                            var3_3 = (reference)((vM.a(26844, 675839061182754453L) ^ vM.a(28576, 2175577035979237620L)) / vM.a(27468, 241825219865587143L) - vM.a(13908, 1175481879779471489L));
                                                            if (!var2_2) {
                                                                break block11;
                                                            }
                                                            break block15;
                                                        }
                                                        case 1139698958: {
                                                            v6 = false;
                                                            if (var2_2) break block11;
                                                            return v6;
                                                        }
                                                        case 1139698956: {
                                                            hi.a("G", (float)-5.0f, (float)2.0f, (long)443772702353985914L);
                                                            hi.a("G", (int)vM.a(12041, 2158887759308548889L), (long)1024745345430233792L);
                                                            var3_3 = (reference)(vM.s("K1l8O0aBxboBdllv", max(int int ), (int)vM.a(27787, 7350875993068709932L), (int)vM.a(20955, 892707239901861828L)) ^ vM.a(11505, 9096502754687348264L));
                                                            continue block12;
                                                        }
                                                    }
lbl56:
                                                    // 2 sources

                                                    v1 = vM.a(22218, 382870069088654180L) / 2 + vM.a(13335, 3483936644893636441L) - vM.a(10167, 727109381689762393L) + vM.a(26890, 4814372636964597353L) + vM.a(704, 8306130060250072767L);
                                                }
                                                var3_3 = (reference)v1;
                                                if (var2_2) continue;
                                            }
                                            var3_3 = (reference)((vM.a(27506, 6373420269322218942L) ^ vM.a(4382, 2958488142399066768L) ^ vM.a(32059, 9056502094056766093L)) - vM.a(31214, 6450346051404283726L));
                                            if (var2_2) continue;
                                        }
                                        v2 /* !! */  = (CallSite)(vM.a(22218, 382870069088654180L) / 2 + vM.a(13335, 3483936644893636441L) - vM.a(10167, 727109381689762393L) + vM.a(26890, 4814372636964597353L));
                                        v3 = vM.a(704, 8306130060250072767L);
                                    }
                                    var3_3 = v2 /* !! */  + v3;
                                    if (var2_2) continue;
                                }
                                var3_3 = (reference)((hi.a("G", (int)vM.a(25619, 155887735961921354L), (int)vM.a(19591, 1431124299722952604L), (long)834203424483934088L) ^ vM.a(2747, 5496312015445708633L)) / vM.a(32472, 5205922672955373614L) + vM.a(27877, 7257808269298871887L) ^ vM.a(21416, 124710450847487493L));
                                if (var2_2) continue;
                            }
                            v4 /* !! */  = (CallSite)(vM.a(22218, 382870069088654180L) / 2 + vM.a(13335, 3483936644893636441L) - vM.a(10167, 727109381689762393L) + vM.a(26890, 4814372636964597353L));
                            v5 = vM.a(704, 8306130060250072767L);
                        }
                        var3_3 = v4 /* !! */  + v5;
                        if (var2_2) continue;
                    }
                    var3_3 = (reference)(vM.a(4170, 4689052611067040510L) - vM.a(18084, 1934865020515517449L) + vM.a(22682, 1407813457941831044L) + vM.a(1606, 6350350362237845528L) - vM.a(25899, 6978678771070116837L));
                }
                break;
            }
            var3_3 = (reference)((vM.a(3551, 9075422029372574239L) ^ vM.a(7107, 5178290516378705488L)) / vM.a(27468, 241825219865587143L) - vM.a(7837, 5735321905738603623L));
        }
        block13: while (true) {
            switch (var3_3) {
                case -1255845709: {
                    hi.a("G", (int)vM.a(4367, 5285942171892568993L), (int)-1, (long)682117342267402956L);
                    hi.a("G", (boolean)true, (long)758395134657997950L);
                    var3_3 = hi.a("G", (int)(vM.a(6860, 1068452131760430150L) / vM.a(32050, 5888244596651114117L)), (int)vM.a(1568, 6997917500652699792L), (long)834203424483934088L) + vM.a(24464, 1118281513932004498L) + vM.a(26590, 2819204341414928991L) + vM.a(5561, 6933015259980715636L);
                    continue block13;
                }
            }
            break;
        }
        return v6;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestPowerBowScore$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (bl) break block4;
                    if (object != false) break block5;
                    object = vM.s("K1l8O0aBxboBdllv", getItem(), (ItemStack)itemStack) instanceof BowItem;
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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

    private static int lambda$getBestPowerBow$1(ItemStack itemStack) {
        return (int)(hi.a("G", (Object)itemStack, (long)961292845328887266L) * 100.0f);
    }

    public static ItemStack v() {
        return (ItemStack)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", max(java.util.Comparator<? super T> ), (Stream)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestBlock$0, (long)1143211481283200773L)), (Comparator)((Object)vM.s("K1l8O0aBxboBdllv", comparingInt(java.util.function.ToIntFunction<? super T> ), ItemStack::getCount))), null, (long)535909545969414314L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean p(ItemStack var0) {
        block14: {
            var1_1 = Dl.S();
            var2_2 /* !! */  = hi.a("G", (int)vM.a(1753, 4102017692895855551L), (int)vM.a(9950, 2498630608523191699L), (long)834203424483934088L) + vM.a(5071, 5121449692681426337L);
            if (var1_1) ** GOTO lbl11
            block10: while (true) {
                block16: {
                    block15: {
                        if (var0 != null) break block15;
                        var2_2 /* !! */  = (CallSite)(vM.a(200, 979286003923240752L) * vM.a(6559, 2086006185075661635L) * vM.a(17562, 7997069480042266834L) ^ vM.a(27897, 7640629349769357330L));
                        if (var1_1) break block16;
                    }
                    var2_2 /* !! */  = (CallSite)((vM.a(15050, 925900685046546314L) - vM.a(16626, 464897574578553677L) ^ vM.a(17653, 9119528364926370730L)) + vM.a(10399, 3719100913896942982L) + vM.a(24953, 2133903332293583774L) - vM.a(9078, 5462945374997178088L));
                    if (!var1_1) ** GOTO lbl39
                }
                while (true) {
                    block21: {
                        block19: {
                            block20: {
                                block18: {
                                    block17: {
                                        switch (var2_2 /* !! */ ) {
                                            default: {
                                                continue block10;
                                            }
                                            case -1688393378: {
                                                v0 /* !! */  = hi.a("\u00a5", (Object)var0, (long)675687955611242108L);
                                                if (!var1_1) break block17;
                                                if (v0 /* !! */  != false) break;
                                                break block18;
                                            }
                                            case -1688393376: {
                                                v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("j", (long)755907370327218347L), (Object)hi.a("\u00a5", (Object)var0, (long)769006157898026769L), (long)1128025236213057684L);
                                                if (!var1_1) break block19;
                                                if (v1 /* !! */  == false) break block20;
                                                break block21;
                                            }
                                            case -1688393379: {
                                                v2 = true;
                                                var2_2 /* !! */  = (CallSite)(hi.a("G", (int)vM.a(15158, 5790031996034283668L), (int)vM.a(19734, 8210551413506969509L), (long)834203424483934088L) ^ vM.a(30214, 7344331270276461733L));
                                                if (!var1_1) {
                                                    break block10;
                                                }
                                                break block14;
                                            }
                                            case -1688393377: {
                                                v2 = false;
                                                if (var1_1) break block10;
                                                return v2;
                                            }
                                            case -1688393374: {
                                                throw null;
                                            }
                                        }
lbl39:
                                        // 2 sources

                                        v0 /* !! */  = var2_2 /* !! */  = (CallSite)(vM.a(28083, 6922475048868686605L) * vM.a(7347, 1689923346337257537L) * vM.a(6052, 3109838716648379571L) ^ vM.a(24389, 6857841263769623039L));
                                    }
                                    if (var1_1) continue;
                                }
                                var2_2 /* !! */  = (CallSite)(vM.a(12942, 4980902845464801691L) / vM.a(32472, 5205922672955373614L) + vM.a(11224, 447295038364641354L));
                                if (var1_1) continue;
                            }
                            v1 /* !! */  = var2_2 /* !! */  = (CallSite)(vM.a(28083, 6922475048868686605L) * vM.a(7347, 1689923346337257537L) * vM.a(6052, 3109838716648379571L) ^ vM.a(24389, 6857841263769623039L));
                        }
                        if (var1_1) continue;
                    }
                    var2_2 /* !! */  = (CallSite)((vM.a(22895, 5595394433779309695L) + vM.a(4000, 4758844597025426697L)) * vM.a(8641, 5432529594574366458L) * vM.a(2248, 6139387880068108178L) / 3 ^ vM.a(25352, 4368442121574491820L));
                }
                break;
            }
            var2_2 /* !! */  = (CallSite)(hi.a("G", (int)vM.a(24924, 4812377972357440808L), (int)vM.a(18072, 5621935034276119117L), (long)834203424483934088L) ^ vM.a(27262, 8344142005965991261L));
        }
        block12: while (true) {
            switch (var2_2 /* !! */ ) {
                case -2112403581: {
                    hi.a("G", (long)480507656276889797L);
                    var2_2 /* !! */  = (CallSite)(vM.a(16121, 5344000859238561933L) / 3 - vM.a(29021, 5274361018816280462L));
                    continue block12;
                }
            }
            break;
        }
        return v2;
    }

    public static boolean O() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$shouldDisableFeatures$0, (long)805579658527532940L);
    }

    /*
     * Exception decompiling
     */
    public static EquipmentSlot U(ItemStack var0) {
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
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestAxeScore$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block7: {
                block6: {
                    block4: {
                        bl = Dl.S();
                        object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                        if (!bl) break block4;
                        if (object != false) break block5;
                        object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof AxeItem;
                    }
                    if (!bl) break block6;
                    if (object == false) break block5;
                    object = hi.a("G", (Object)new Object[]{itemStack}, (long)535187538840369779L);
                }
                if (!bl) break block7;
                if (object != false) break block5;
                object = vM.s("K1l8O0aBxboBdllv", z(net.minecraft.world.item.ItemStack ), (ItemStack)itemStack);
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

    private static float e(Object[] objectArray) {
        Object object = objectArray[0];
        return (float)hi.a("\u00a5", (Object)((AttributeModifier)object), (long)1101209990438577560L);
    }

    public static float N() {
        return (float)hi.a("\u00a5", (Object)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vM.s("K1l8O0aBxboBdllv", stream(), (List)((Object)hi.a("G", (long)989880202519854622L))), vM::lambda$getBestAxeScore$0, (long)1143211481283200773L), vM::b, (long)935650006110027503L), Float::compareTo, (long)364845113189698498L), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L), (long)535909545969414314L))), (long)1263586790430806583L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$getItemCount$0(Item item, ItemStack itemStack) {
        boolean bl = Dl.t();
        ItemStack itemStack2 = itemStack;
        if (!bl) {
            if (hi.a("\u00a5", (Object)itemStack2, (long)675687955611242108L) != false) return false;
            itemStack2 = itemStack;
        }
        if (hi.a("\u00a5", (Object)itemStack2, (long)769006157898026769L) != item) return false;
        return true;
    }

    public static float X(EquipmentSlot equipmentSlot) {
        return (float)hi.a("G", (Object)hi.a("G", (Object)new Object[]{equipmentSlot}, (long)1162325267698796834L), (long)367628606640672521L);
    }

    public static float h() {
        return (float)hi.a("\u00a5", (Object)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), vM::lambda$getBestPowerBowScore$0, (long)1143211481283200773L), vM::d, (long)935650006110027503L), Float::compareTo, (long)364845113189698498L), (Object)hi.a("G", (float)0.0f, (long)1097085248186378937L), (long)535909545969414314L))), (long)1263586790430806583L);
    }

    public static int H(Object[] objectArray) {
        ItemStack itemStack = (ItemStack)objectArray[0];
        return (int)hi.a("G", (Object)itemStack, (Object)hi.a("j", (long)896815039905240446L), (long)1072650197384473271L);
    }

    public static int q(Object[] objectArray) {
        Item item = (Item)objectArray[0];
        return (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (long)989880202519854622L), (long)415197394286909465L), arg_0 -> vM.lambda$getItemCount$0(item, arg_0), (long)1143211481283200773L), ItemStack::getCount, (long)637363739606702614L), (long)508158345415676277L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lambda$getBestPunchBowScore$0(ItemStack itemStack) {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L);
                    if (!bl) break block4;
                    if (object != false) break block5;
                    object = hi.a("\u00a5", (Object)itemStack, (long)769006157898026769L) instanceof BowItem;
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("G", (Object)itemStack, (long)865432144196367974L);
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean S(Object[] var0) {
        block24: {
            block22: {
                block23: {
                    block21: {
                        block19: {
                            block20: {
                                var1_1 = (ItemStack)var0[0];
                                var2_2 = Dl.t();
                                var3_3 /* !! */  = vM.a(28567, 7657014676388686722L) - vM.a(21653, 4604393831055790909L) ^ vM.a(30780, 8181938608646995279L);
                                if (var2_2) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                                        if (var2_2) break block19;
                                        if (v0 /* !! */  != false) break block20;
                                        break block21;
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        hi.a("G", (long)1229653054671944966L);
                                        vM.s("K1l8O0aBxboBdllv", K());
lbl16:
                                        // 2 sources

                                        while (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) == hi.a("j", (long)468634451082859931L)) {
                                            break block22;
                                        }
                                        break block23;
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
                                        v1 = false;
                                        if (var2_2) lbl-1000:
                                        // 2 sources

                                        {
                                            return v1;
                                        }
                                        break block24;
                                        break;
                                    }
                                }
lbl27:
                                // 6 sources

                                while (true) {
                                    switch (var3_3 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 448993511: {
                                            ** continue;
                                        }
                                        case 448993508: {
                                            ** GOTO lbl16
                                        }
                                        case 448993510: {
                                            ** continue;
                                        }
                                        ** case 448993512:
lbl38:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
lbl39:
                                // 2 sources

                                while (true) {
                                    switch (var3_3 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 1789986082: 
                                    }
                                    throw null;
                                }
                            }
                            v0 /* !! */  = (CallSite)(vM.a(29270, 5623113991790311276L) / vM.a(32472, 5205922672955373614L) ^ vM.a(21552, 6063766030527336548L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) ** GOTO lbl27
                    }
                    var3_3 /* !! */  = vM.a(7816, 963762501932341848L) - vM.a(21098, 5864703542668530105L) - vM.a(23555, 7506454618526325061L) ^ vM.a(27370, 207278186160073987L);
                    if (!var2_2) ** GOTO lbl27
                }
                var3_3 /* !! */  = vM.a(22152, 4138334085122266540L) / vM.a(32472, 5205922672955373614L) ^ vM.a(21497, 1170338633568687642L);
                if (!var2_2) ** GOTO lbl27
            }
            var3_3 /* !! */  = (vM.a(17848, 6432815067390968770L) ^ vM.a(25857, 1471646520821555618L)) / 3 ^ vM.a(22486, 1593421393612313571L);
            ** while (true)
            v1 = true;
            var3_3 /* !! */  = vM.a(3558, 6199346746519997386L) * vM.a(25215, 7116348706197448254L) + vM.a(14997, 340214563455564849L);
            if (!var2_2) ** GOTO lbl39
        }
        var3_3 /* !! */  = vM.a(26828, 2701248015067655759L) * vM.a(5747, 1037177554283582392L) + vM.a(8208, 3222608241772192462L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean n(Object[] var0) {
        block13: {
            var1_1 = (ItemStack)var0[0];
            var2_2 = Dl.S();
            var3_3 /* !! */  = (hi.a("G", (int)vM.a(1417, 1665870412837142577L), (int)vM.a(12858, 1251046205130732953L), (long)834203424483934088L) - vM.a(12674, 8694688846805463561L) - vM.a(4140, 1158490976017994843L)) / 5 + vM.a(23321, 8865664447015919436L);
            if (var2_2) ** GOTO lbl16
            block10: while (true) {
                block16: {
                    block15: {
                        block14: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                            if (!var2_2) break block14;
                            if (v0 /* !! */  == false) break block15;
                            v0 /* !! */  = var3_3 /* !! */  = (reference)(hi.a("G", (int)(vM.a(32270, 7755153025947352255L) / 5), (int)vM.a(29311, 870657949123784850L), (long)834203424483934088L) * vM.a(11412, 8564507368090987071L) / 3 ^ vM.a(10572, 5651618835123105775L));
                        }
                        if (var2_2) break block16;
                    }
                    var3_3 /* !! */  = hi.a("G", (int)(vM.a(25589, 3484919958738837834L) * vM.a(10119, 8018838593126524094L)), (int)vM.a(26447, 3381532761702802494L), (long)834203424483934088L) - vM.a(11749, 2911564672238972786L);
                    if (!var2_2) ** GOTO lbl48
                }
                block11: while (true) {
                    block20: {
                        block18: {
                            block19: {
                                block17: {
                                    switch (var3_3 /* !! */ ) {
                                        default: {
                                            continue block10;
                                        }
                                        case 698062905: {
                                            if (hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) != hi.a("j", (long)599985079866794996L)) break;
                                            break block17;
                                        }
                                        case 698062907: {
                                            v1 = vM.s("K1l8O0aBxboBdllv", b(net.minecraft.world.item.ItemStack net.minecraft.resources.ResourceKey<net.minecraft.world.item.enchantment.Enchantment> ), (ItemStack)var1_1, (ResourceKey)hi.a("j", (long)1160948181640913288L));
                                            v2 = 1;
                                            if (!var2_2) break block18;
                                            if (v1 <= v2) break block19;
                                            break block20;
                                        }
                                        case 698062909: {
                                            v3 = true;
                                            var3_3 /* !! */  = (reference)(vM.a(6691, 3469470325846597368L) ^ vM.a(28999, 1019347091752137297L) ^ vM.a(31867, 1405438576800217919L));
                                            if (!var2_2) {
                                                break block10;
                                            }
                                            break block13;
                                        }
                                        case 698062908: {
                                            v3 = false;
                                            if (var2_2) break block10;
                                            return v3;
                                        }
                                        case 698062906: {
                                            hi.a("G", (float)100.0f, (long)542180438698619312L);
                                            hi.a("G", (long)1060921528960496445L);
                                            var3_3 /* !! */  = (reference)((vM.a(27001, 1678277895275915916L) + vM.a(30757, 4000450026293017230L) ^ vM.a(32112, 4959820843971264466L)) + vM.a(28632, 3888559107695159936L));
                                            continue block11;
                                        }
                                    }
lbl48:
                                    // 2 sources

                                    var3_3 /* !! */  = (reference)(hi.a("G", (int)(vM.a(21723, 1165470175502897652L) / 5), (int)vM.a(28036, 6193721061721974849L), (long)834203424483934088L) * vM.a(10403, 1759087090344160674L) / 3 ^ vM.a(12423, 8071881833974395406L));
                                    if (var2_2) continue;
                                }
                                var3_3 /* !! */  = (reference)(vM.a(23302, 6215506292684823747L) / vM.a(2904, 2062424234454896584L) * vM.a(22483, 8577718102436155556L) / vM.a(32050, 5888244596651114117L) + vM.a(2753, 1273799195645626864L));
                                if (var2_2) continue;
                            }
                            v1 = hi.a("G", (int)(vM.a(21723, 1165470175502897652L) / 5), (int)vM.a(28036, 6193721061721974849L), (long)834203424483934088L) * vM.a(10403, 1759087090344160674L) / 3;
                            v2 = vM.a(12423, 8071881833974395406L);
                        }
                        var3_3 /* !! */  = (reference)(v1 ^ v2);
                        if (var2_2) continue;
                    }
                    var3_3 /* !! */  = (reference)(((vM.a(22429, 9042803909081993234L) - vM.a(29995, 7758204957688574019L)) * vM.a(21820, 6069825261699962835L) ^ vM.a(9948, 8358870864098943028L)) - vM.a(8304, 6056541659272766979L));
                }
                break;
            }
            var3_3 /* !! */  = (reference)(vM.a(18341, 8028016820252017108L) ^ vM.a(14492, 7065813198119795500L) ^ vM.a(14170, 3752939066494874855L));
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v3;
            }
            case -1201631561: 
        }
        throw null;
    }

    public static void I(int[] nArray) {
        H = nArray;
    }

    public static int[] g() {
        return H;
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x75D0) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 212;
                case 1 -> 119;
                case 2 -> 17;
                case 3 -> 40;
                case 4 -> 2;
                case 5 -> 12;
                case 6 -> 247;
                case 7 -> 202;
                case 8 -> 81;
                case 9 -> 16;
                case 10 -> 227;
                case 11 -> 22;
                case 12 -> 250;
                case 13 -> 158;
                case 14 -> 52;
                case 15 -> 55;
                case 16 -> 100;
                case 17 -> 76;
                case 18 -> 171;
                case 19 -> 213;
                case 20 -> 195;
                case 21 -> 74;
                case 22 -> 124;
                case 23 -> 170;
                case 24 -> 151;
                case 25 -> 225;
                case 26 -> 129;
                case 27 -> 68;
                case 28 -> 246;
                case 29 -> 89;
                case 30 -> 220;
                case 31 -> 164;
                case 32 -> 70;
                case 33 -> 165;
                case 34 -> 174;
                case 35 -> 237;
                case 36 -> 137;
                case 37 -> 205;
                case 38 -> 193;
                case 39 -> 240;
                case 40 -> 254;
                case 41 -> 27;
                case 42 -> 140;
                case 43 -> 208;
                case 44 -> 37;
                case 45 -> 110;
                case 46 -> 125;
                case 47 -> 186;
                case 48 -> 63;
                case 49 -> 232;
                case 50 -> 73;
                case 51 -> 91;
                case 52 -> 180;
                case 53 -> 241;
                case 54 -> 109;
                case 55 -> 10;
                case 56 -> 104;
                case 57 -> 39;
                case 58 -> 93;
                case 59 -> 233;
                case 60 -> 198;
                case 61 -> 255;
                case 62 -> 0;
                case 63 -> 90;
                case 64 -> 84;
                case 65 -> 96;
                case 66 -> 71;
                case 67 -> 177;
                case 68 -> 18;
                case 69 -> 135;
                case 70 -> 23;
                case 71 -> 223;
                case 72 -> 176;
                case 73 -> 72;
                case 74 -> 117;
                case 75 -> 54;
                case 76 -> 69;
                case 77 -> 57;
                case 78 -> 4;
                case 79 -> 201;
                case 80 -> 139;
                case 81 -> 169;
                case 82 -> 107;
                case 83 -> 92;
                case 84 -> 249;
                case 85 -> 75;
                case 86 -> 157;
                case 87 -> 160;
                case 88 -> 64;
                case 89 -> 28;
                case 90 -> 182;
                case 91 -> 211;
                case 92 -> 32;
                case 93 -> 83;
                case 94 -> 239;
                case 95 -> 3;
                case 96 -> 50;
                case 97 -> 97;
                case 98 -> 114;
                case 99 -> 144;
                case 100 -> 242;
                case 101 -> 51;
                case 102 -> 105;
                case 103 -> 24;
                case 104 -> 95;
                case 105 -> 121;
                case 106 -> 243;
                case 107 -> 8;
                case 108 -> 120;
                case 109 -> 188;
                case 110 -> 122;
                case 111 -> 235;
                case 112 -> 230;
                case 113 -> 238;
                case 114 -> 147;
                case 115 -> 44;
                case 116 -> 115;
                case 117 -> 226;
                case 118 -> 113;
                case 119 -> 13;
                case 120 -> 29;
                case 121 -> 161;
                case 122 -> 133;
                case 123 -> 99;
                case 124 -> 251;
                case 125 -> 87;
                case 126 -> 218;
                case 127 -> 155;
                case 128 -> 217;
                case 129 -> 189;
                case 130 -> 21;
                case 131 -> 172;
                case 132 -> 49;
                case 133 -> 45;
                case 134 -> 106;
                case 135 -> 102;
                case 136 -> 231;
                case 137 -> 98;
                case 138 -> 221;
                case 139 -> 173;
                case 140 -> 148;
                case 141 -> 252;
                case 142 -> 130;
                case 143 -> 167;
                case 144 -> 56;
                case 145 -> 150;
                case 146 -> 19;
                case 147 -> 15;
                case 148 -> 60;
                case 149 -> 38;
                case 150 -> 20;
                case 151 -> 59;
                case 152 -> 228;
                case 153 -> 253;
                case 154 -> 184;
                case 155 -> 127;
                case 156 -> 82;
                case 157 -> 145;
                case 158 -> 61;
                case 159 -> 136;
                case 160 -> 142;
                case 161 -> 229;
                case 162 -> 166;
                case 163 -> 128;
                case 164 -> 36;
                case 165 -> 215;
                case 166 -> 132;
                case 167 -> 47;
                case 168 -> 200;
                case 169 -> 210;
                case 170 -> 62;
                case 171 -> 222;
                case 172 -> 194;
                case 173 -> 245;
                case 174 -> 25;
                case 175 -> 152;
                case 176 -> 209;
                case 177 -> 203;
                case 178 -> 138;
                case 179 -> 33;
                case 180 -> 134;
                case 181 -> 204;
                case 182 -> 154;
                case 183 -> 199;
                case 184 -> 112;
                case 185 -> 5;
                case 186 -> 118;
                case 187 -> 185;
                case 188 -> 131;
                case 189 -> 88;
                case 190 -> 111;
                case 191 -> 103;
                case 192 -> 35;
                case 193 -> 66;
                case 194 -> 58;
                case 195 -> 149;
                case 196 -> 234;
                case 197 -> 153;
                case 198 -> 46;
                case 199 -> 216;
                case 200 -> 141;
                case 201 -> 30;
                case 202 -> 178;
                case 203 -> 236;
                case 204 -> 183;
                case 205 -> 123;
                case 206 -> 224;
                case 207 -> 34;
                case 208 -> 190;
                case 209 -> 85;
                case 210 -> 168;
                case 211 -> 53;
                case 212 -> 248;
                case 213 -> 179;
                case 214 -> 67;
                case 215 -> 162;
                case 216 -> 187;
                case 217 -> 80;
                case 218 -> 163;
                case 219 -> 78;
                case 220 -> 159;
                case 221 -> 219;
                case 222 -> 191;
                case 223 -> 126;
                case 224 -> 9;
                case 225 -> 65;
                case 226 -> 42;
                case 227 -> 86;
                case 228 -> 197;
                case 229 -> 31;
                case 230 -> 244;
                case 231 -> 7;
                case 232 -> 6;
                case 233 -> 11;
                case 234 -> 192;
                case 235 -> 143;
                case 236 -> 108;
                case 237 -> 1;
                case 238 -> 77;
                case 239 -> 14;
                case 240 -> 101;
                case 241 -> 48;
                case 242 -> 206;
                case 243 -> 175;
                case 244 -> 94;
                case 245 -> 181;
                case 246 -> 41;
                case 247 -> 196;
                case 248 -> 116;
                case 249 -> 43;
                case 250 -> 207;
                case 251 -> 146;
                case 252 -> 79;
                case 253 -> 214;
                case 254 -> 26;
                default -> 156;
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
            vM.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x47BB;
        if (d[n2] == null) {
            vM.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
