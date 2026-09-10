/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  net.minecraft.core.Holder
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.enchantment.Enchantment
 *  net.minecraft.world.item.enchantment.ItemEnchantments
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ItemEnchantments;

public class io {
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Enabled aggressive block sorting
     */
    public static int b(ItemStack itemStack, ResourceKey<Enchantment> resourceKey) {
        int n = (io.a(24647, 6551111326443612167L) + io.a(22272, 1654514889780469703L) + io.a(4709, 7448891873099602617L)) * io.a(16509, 4681033578788128782L) ^ io.a(11627, 681242255804982600L);
        block5: while (true) {
            Object object;
            switch (object) {
                default: {
                    if (hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L) == false) break;
                    object = io.a(29595, 7986426367250611184L) / io.a(29065, 2342430628758206884L) + io.a(19891, 3990568163468674425L);
                    continue block5;
                }
                case -705632698: {
                    return 0;
                }
                case -705632697: {
                    Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
                    Object[] objectArray = new Object[2];
                    objectArray[1] = object2IntArrayMap;
                    objectArray[0] = itemStack;
                    hi.a("G", (Object)objectArray, (long)1326732325858324336L);
                    return (int)io.o("zfyywcAyWBSxmC8q", z(it.unimi.dsi.fastutil.objects.Object2IntMap<net.minecraft.core.Holder<net.minecraft.world.item.enchantment.Enchantment>> net.minecraft.resources.ResourceKey<net.minecraft.world.item.enchantment.Enchantment> ), (Object2IntMap)object2IntArrayMap, resourceKey);
                }
                case -705632695: {
                    return (int)hi.a("G", (long)495291380660240240L);
                }
            }
            object = hi.a("G", (int)io.a(7572, 6395057833156793679L), (int)io.a(12639, 6930296688731617571L), (long)834203424483934088L) / 3 - io.a(28319, 136027673906456193L);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void B(Object[] var0) {
        var1_1 = (ItemStack)var0[0];
        var2_2 = (Object2IntMap)var0[1];
        var6_3 /* !! */  = ((io.a(21341, 2154251450267147145L) + io.a(22563, 2139046115368636483L)) * io.a(23719, 1290282193568208012L) ^ io.a(31150, 457798827888456167L)) + io.a(22900, 6416046563247755704L);
        if (true) ** GOTO lbl12
        block14: while (true) {
            block22: {
                block20: {
                    block21: {
                        if (io.o("zfyywcAyWBSxmC8q", hasNext(), (Iterator)var4_5) == false) break block21;
                        var6_3 /* !! */  = hi.a("G", (int)((io.a(29167, 5698156185968916960L) / io.a(31132, 6722266317524775405L) + io.a(5926, 650757255162519498L)) / io.a(26558, 1657320681626054502L)), (int)io.a(17130, 1824851581775809246L), (long)834203424483934088L) ^ io.a(3947, 356646241943275309L);
                        break block22;
                    }
                    var6_3 /* !! */  = io.a(1424, 3928144944779185588L) + io.a(7490, 6925366707501847933L) + io.a(28335, 6632942635378026056L) - io.a(27061, 4762258383005262322L);
lbl12:
                    // 2 sources

                    block15: while (true) {
                        switch (var6_3 /* !! */ ) {
                            default: {
                                hi.a("\u00a5", (Object)var2_2, (long)1194157547961479379L);
                                if (hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L) == false) {
                                    var6_3 /* !! */  = (io.a(8580, 6549769412101794133L) + io.a(21342, 2288928652365011800L)) / 3 - io.a(32255, 8052059323146843413L) + io.a(3865, 7907343954291410795L);
                                    continue block15;
                                }
                                ** GOTO lbl39
                            }
                            case -4521108: {
                                if (hi.a("\u00a5", (Object)var1_1, (Object)hi.a("j", (long)974191755862957402L), (long)484703308447361578L) != false) {
                                    var6_3 /* !! */  = (int)(hi.a("G", (int)io.o("zfyywcAyWBSxmC8q", max(int int ), (int)io.a(566, 1423614111841667649L), (int)io.a(9645, 4900732908698168734L)), (int)io.a(20099, 7099747139521316473L), (long)834203424483934088L) + io.a(5487, 6495493319477189991L) - io.a(9603, 304548455174041083L));
                                    continue block15;
                                }
                                ** GOTO lbl41
                            }
                            case -4521109: {
                                v0 = hi.a("\u00a5", (Object)((ItemEnchantments)hi.a("\u00a5", (Object)var1_1, (Object)hi.a("j", (long)870123359365915608L), (Object)hi.a("j", (long)661837464011696949L), (long)1215946747243718231L)), (long)425162445159825238L);
                                var6_3 /* !! */  = io.a(3228, 4301386732834505928L) / io.a(26109, 1721361795711741330L) - io.a(1048, 5741431710922296321L);
                                break block20;
                            }
                            case -4521106: {
                                v0 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var1_1, (long)951555796323743358L), (long)425162445159825238L);
                                var6_3 /* !! */  = io.a(18061, 734273178977406651L) / io.a(27352, 1454472023674725074L) - io.a(3903, 950958729156085578L);
                                break block20;
                            }
                            case -4521110: {
                                io.o("zfyywcAyWBSxmC8q", s());
                                var6_3 /* !! */  = (int)((hi.a("G", (int)io.a(24057, 2592356490919220647L), (int)io.a(31214, 5742649694942441959L), (long)834203424483934088L) - io.a(18903, 473148555156848927L) + io.a(8961, 7267457038910712642L)) / 2 + io.a(4992, 114798135866678123L));
                                continue block15;
                            }
lbl39:
                            // 1 sources

                            var6_3 /* !! */  = io.a(14399, 2930029275337879745L) + io.a(9035, 6456177129435458323L) + io.a(29585, 4208821111475780457L) - io.a(20595, 3761247942342580299L);
                            continue block15;
lbl41:
                            // 1 sources

                            var6_3 /* !! */  = (io.a(25612, 7134461679629773941L) ^ io.a(4498, 8418488757836143027L) ^ io.a(19181, 5160818945369703055L)) - io.a(9682, 3167254978880925109L);
                            continue block15;
                            case -4521107: 
                        }
                        break;
                    }
                    return;
                }
                block16: while (true) {
                    switch (var6_3 /* !! */ ) {
                        default: {
                            var3_4 = v0;
                            var4_5 = hi.a("\u00a5", (Object)var3_4, (long)1297238455825536256L);
                            var6_3 /* !! */  = (int)(hi.a("G", (int)io.a(9898, 3899174485487709951L), (int)io.a(24612, 1146229065443158262L), (long)834203424483934088L) + io.a(12875, 2929736772707252835L));
                            break block16;
                        }
                        case -1589783198: {
                            hi.a("G", (float)2.0f, (float)10.0f, (long)1060325894040809393L);
                            hi.a("G", (double)1.0, (double)0.0, (long)449984074118786580L);
                            var6_3 /* !! */  = (int)(hi.a("G", (int)(io.a(14386, 4963571276735410384L) + io.a(11662, 1614746388466001221L)), (int)io.a(4710, 8764349830045522574L), (long)834203424483934088L) - io.a(20087, 1976792302594000545L));
                            continue block16;
                        }
                    }
                    break;
                }
            }
            while (true) {
                switch (var6_3 /* !! */ ) {
                    case 1074171992: {
                        hi.a("G", (long)889012284371480360L);
                        continue block14;
                    }
                    default: {
                        continue block14;
                    }
                    case 1074171990: 
                }
                var5_6 = (Object2IntMap.Entry)hi.a("\u00a5", (Object)var4_5, (long)470012372636416268L);
                hi.a("\u00a5", (Object)var2_2, (Object)((Holder)hi.a("\u00a5", (Object)var5_6, (long)525127359171215100L)), (int)hi.a("\u00a5", (Object)var5_6, (long)1298478528577372504L), (long)568289350613885719L);
                var6_3 /* !! */  = (int)(hi.a("G", (int)io.a(10511, 7556114924911092017L), (int)io.a(9421, 258909352157342941L), (long)834203424483934088L) + io.a(21482, 2319047928551676923L));
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @SafeVarargs
    public static boolean q(Object ... var0) {
        block28: {
            var1_1 = (ItemStack)var0[0];
            var2_2 = (ResourceKey[])var0[1];
            var3_3 = Dl.S();
            var9_4 /* !! */  = (io.a(12074, 5281332844931246043L) + io.a(22910, 4761019596682891655L)) * io.a(4176, 6677479741469776018L) / io.a(18427, 5757390675492114391L) + io.a(2510, 7439474901338538283L) ^ io.a(32408, 8809328005615466055L);
            if (var3_3) break block28;
lbl7:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                if (!var3_3) ** GOTO lbl90
                if (v0 /* !! */  == false) ** GOTO lbl89
                ** GOTO lbl92
                break;
            }
lbl12:
            // 2 sources

            while (true) {
                v1 = var7_8;
                v2 = var6_7;
                if (!var3_3) ** GOTO lbl42
                if (v1 >= v2) ** GOTO lbl40
                ** GOTO lbl44
                break;
            }
        }
        block16: while (true) {
            block29: {
                switch (var9_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 827777417: {
                        var4_5 = new Object2IntArrayMap();
                        v3 = new Object[2];
                        v3[1] = var4_5;
                        v3[0] = var1_1;
                        hi.a("G", (Object)v3, (long)1326732325858324336L);
                        var5_6 = var2_2;
                        var6_7 = var5_6.length;
                        var7_8 = 0;
                        if (var3_3) ** GOTO lbl38
                        ** GOTO lbl12
                    }
                    case 827777415: {
                        hi.a("G", (long)1220332909359061582L);
                        return false;
                    }
lbl38:
                    // 1 sources

                    var9_4 /* !! */  = hi.a("G", (int)io.a(12231, 7631510209671718662L), (int)io.a(23092, 5270437544454984286L), (long)834203424483934088L) - io.a(26382, 5163834998818320367L) - io.a(28154, 6634792582992963063L) ^ io.a(24320, 8851126829085988613L);
                    if (var3_3) break block29;
lbl40:
                    // 2 sources

                    v1 = io.a(19252, 3370177759944508174L) * io.a(7917, 1040719101803157027L) - io.a(20662, 5639592092445350049L);
                    v2 = io.a(32214, 3933759213210383810L);
lbl42:
                    // 2 sources

                    var9_4 /* !! */  = v1 - v2;
                    if (var3_3) break block29;
lbl44:
                    // 2 sources

                    var9_4 /* !! */  = io.a(3852, 7857274288108488572L) / 4 - io.a(4859, 6960546676858051302L) - io.a(22790, 8553274444628169070L);
                    break block29;
                    case 827777416: 
                }
                return false;
            }
            while (true) {
                block27: {
                    switch (var9_4 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -347202197: {
                            var8_9 = var5_6[var7_8];
                            v4 = new Object[2];
                            v4[1] = var8_9;
                            v4[0] = var4_5;
                            v5 = hi.a("G", (Object)v4, (long)1149017997674918831L);
                            if (!var3_3) ** GOTO lbl63
                            if (v5 == false) ** GOTO lbl65
                            v5 = hi.a("G", (int)(io.a(383, 4796919846669863193L) + io.a(17807, 2151736049611902424L)), (int)io.a(15174, 5948383087188931420L), (long)834203424483934088L) / io.a(6356, 1424292233650753696L) + io.a(29089, 7702553307289139553L);
lbl63:
                            // 2 sources

                            var9_4 /* !! */  = (int)v5;
                            if (var3_3) break;
lbl65:
                            // 2 sources

                            var9_4 /* !! */  = io.a(27386, 4344077292433154720L) ^ io.a(9623, 8707565542255554035L) ^ io.a(27238, 1953645080902410943L);
                            if (var3_3) break;
                            break block27;
                        }
                        case -347202196: {
                            return true;
                        }
                        case -347202195: {
                            return true;
                        }
                    }
                    block18: while (true) {
                        switch (var9_4 /* !! */ ) {
                            default: {
                                return false;
                            }
                            case -202860772: {
                                ++var7_8;
                                if (!var3_3) {
                                    return true;
                                }
                                break block27;
                            }
                            case -202860771: {
                                hi.a("G", (long)1264004642033370356L);
                                hi.a("G", (long)676982026178831098L);
                                var9_4 /* !! */  = io.a(8163, 5429321451280652269L) / io.a(26558, 1657320681626054502L) + io.a(6611, 2099841174754709766L);
                                if (var3_3) continue block18;
                            }
                        }
                        break;
                    }
lbl89:
                    // 2 sources

                    v0 /* !! */  = (CallSite)((io.a(15145, 7942258317863711700L) ^ io.a(32217, 8977527108253070647L)) / 4 + io.a(11876, 561880880618563149L));
lbl90:
                    // 2 sources

                    var9_4 /* !! */  = (int)v0 /* !! */ ;
                    if (var3_3) continue block16;
lbl92:
                    // 2 sources

                    var9_4 /* !! */  = io.a(28641, 1810390392799045584L) - io.a(27614, 6795362336725181345L) - io.a(30380, 8532550074739048054L);
                    continue block16;
                }
                var9_4 /* !! */  = hi.a("G", (int)io.a(9545, 1858969628521360809L), (int)io.a(28379, 3217198231860717192L), (long)834203424483934088L) - io.a(32291, 1612320070498334301L) - io.a(29094, 1271201441905293715L) ^ io.a(23749, 604128553953104917L);
            }
            break;
        }
    }

    public static /* bridge */ /* synthetic */ CallSite o(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean S(Object[] var0) {
        block24: {
            block22: {
                block23: {
                    block21: {
                        block26: {
                            block25: {
                                break block25;
lbl1:
                                // 1 sources

                                while (true) {
                                    hi.a("G", (long)1312822163333810930L);
                                    io.o("zfyywcAyWBSxmC8q", e());
lbl6:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (io.o("zfyywcAyWBSxmC8q", hasNext(), (Iterator)var3_4) != false) {
                                    break block21;
                                }
                                break block26;
lbl11:
                                // 1 sources

                                while (true) {
                                    hi.a("G", (int)1, (long)902898246708732704L);
lbl13:
                                    // 2 sources

                                    while (hi.a("\u00a5", (Object)(var4_5 = (Holder)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L)), (Object)var2_2, (long)888834519151347687L) != false) {
                                        break block22;
                                    }
                                    break block23;
                                    break;
                                }
lbl16:
                                // 1 sources

                                return true;
lbl18:
                                // 1 sources

                                return false;
                            }
                            var1_1 = (Object2IntMap)var0[0];
                            var2_2 = (ResourceKey)var0[1];
                            var5_3 /* !! */  = (hi.a("G", (int)hi.a("G", (int)io.a(9445, 7362282486261968126L), (int)io.a(23399, 7737410100425790393L), (long)834203424483934088L), (int)io.a(15718, 8810876518157743401L), (long)834203424483934088L) + io.a(32562, 6865383261778425720L)) / io.a(1699, 1399235405439716952L) - io.a(8872, 5976485080070908626L);
                            switch (var5_3 /* !! */ ) {
                                case -1201846233: {
                                    ** continue;
                                }
                                ** default:
lbl29:
                                // 1 sources

                                ** continue;
                            }
lbl30:
                            // 4 sources

                            while (true) {
                                switch (var5_3 /* !! */ ) {
                                    default: {
                                        ** GOTO lbl8
                                    }
                                    case -1776479559: {
                                        ** continue;
                                    }
                                    case -1776479556: {
                                        ** GOTO lbl13
                                    }
                                    ** case -1776479557:
lbl39:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
lbl40:
                            // 2 sources

                            while (true) {
                                switch (var5_3 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -1604585042: {
                                        break block24;
                                    }
                                    case -1604585041: {
                                        hi.a("G", (long)976103121275918466L);
                                        hi.a("G", (long)1147173558201835878L);
                                        return (boolean)hi.a("G", (long)1326027102069805806L);
                                    }
                                }
                                break;
                            }
                            var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var1_1, (long)978418942225583327L), (long)541149908096080920L);
                            var5_3 /* !! */  = (reference)(io.a(28958, 3282863118613100834L) - io.a(16447, 6776402924638701654L) - io.a(15221, 5505585732466013065L));
                            ** GOTO lbl30
                        }
                        var5_3 /* !! */  = (reference)((hi.a("G", (int)io.a(24873, 5189794229653449064L), (int)io.a(24675, 7575656513860970556L), (long)834203424483934088L) / io.a(28002, 6529511460026066238L) + io.a(16108, 1159600894125110974L) ^ io.a(16070, 4940571401721149085L)) - io.a(25091, 6339739426015685121L));
                        ** GOTO lbl30
                    }
                    var5_3 /* !! */  = (reference)(hi.a("G", (int)(io.a(1327, 8729187578210733367L) * io.a(25104, 4143271908095142453L) - io.a(28682, 2262628261214173233L)), (int)io.a(9191, 2685882069053696898L), (long)834203424483934088L) * io.a(4853, 31321116929186454L) ^ io.a(881, 1812402272647859030L));
                    ** GOTO lbl30
                }
                var5_3 /* !! */  = (reference)((io.a(9008, 5216911586417568767L) / io.a(1445, 8810875143275367915L) ^ io.a(31879, 6929725227769935052L)) + io.a(30421, 4583124562686098986L));
                ** GOTO lbl40
            }
            var5_3 /* !! */  = (reference)((io.a(8845, 3043338476358658656L) * io.a(9298, 3694066573955918913L) + io.a(21826, 3793893940888870237L)) / io.a(20270, 3171791885486753638L) + io.a(23881, 5917592579982529823L));
            ** while (true)
        }
        var5_3 /* !! */  = (reference)(io.a(26474, 4180648102393655098L) - io.a(2550, 2978607780061036848L) - io.a(6654, 6238353547660710389L));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int z(Object2IntMap<Holder<Enchantment>> var0, ResourceKey<Enchantment> var1_1) {
        var2_2 = Dl.t();
        var5_3 /* !! */  = (io.a(2966, 5653081443515188082L) - io.a(27796, 278524663731561680L) - io.a(28982, 8174202333135190297L)) / io.a(30901, 2145973070538453125L) ^ io.a(3596, 5102917784730519078L) ^ io.a(12287, 7316035015490791416L);
        if (var2_2) ** GOTO lbl-1000
        v0 = var5_3 /* !! */ ;
        if (var2_2 != false) return v0;
        switch (v0) {
            default: lbl-1000:
            // 2 sources

            {
                var3_4 = hi.a("\u00a5", (Object)hi.a("G", var0, (long)899159428750882932L), (long)474343691986561702L);
                if (var2_2) {
                    break;
                }
                ** GOTO lbl52
            }
            case 1958463004: {
                return 1;
            }
        }
lbl14:
        // 2 sources

        while (true) {
            v1 = hi.a("\u00a5", (Object)var3_4, (long)984088978567310565L);
            if (var2_2) ** GOTO lbl55
            if (v1 == false) ** GOTO lbl54
            if (true) ** GOTO lbl57
            break;
        }
        while (true) {
            block21: {
                switch (var5_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1395785875: {
                        var4_5 = (Object2IntMap.Entry)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                        v2 = hi.a("\u00a5", (Object)((Holder)hi.a("\u00a5", (Object)var4_5, (long)525127359171215100L)), var1_1, (long)888834519151347687L);
                        if (var2_2) ** GOTO lbl29
                        if (v2 != false) ** GOTO lbl31
                        v2 = hi.a("G", (int)io.a(28134, 3276635790467540453L), (int)io.a(10056, 5373985437575474995L), (long)834203424483934088L) + io.a(25342, 5207536323294603837L);
lbl29:
                        // 2 sources

                        var5_3 /* !! */  = (int)v2;
                        if (!var2_2) break;
lbl31:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)(io.a(557, 232945897302313528L) * io.a(20027, 8734325499816936962L)), (int)io.a(27261, 5048772361747374683L), (long)834203424483934088L) - io.a(20003, 2640799558788548175L) - io.a(16351, 5857499976462628831L));
                        if (!var2_2) break;
                        break block21;
                    }
                    case 1395785877: {
                        return 0;
                    }
                    case 1395785874: {
                        return 4;
                    }
                }
                block14: while (true) {
                    switch (var5_3 /* !! */ ) {
                        default: {
                            return (int)io.o("zfyywcAyWBSxmC8q", getIntValue(), (Object2IntMap.Entry)var4_5);
                        }
                        case 1634780316: {
                            if (var2_2) {
                                return 0;
                            }
                            break block21;
                        }
                        case 1634780314: {
                            hi.a("G", (long)661981318591720701L);
                            var5_3 /* !! */  = io.o("zfyywcAyWBSxmC8q", max(int int ), (int)io.a(13572, 4650338607331900677L), (int)io.a(25769, 322022268453596359L)) ^ io.a(8885, 1058024766517865129L);
                            if (!var2_2) continue block14;
                        }
                    }
                    break;
                }
lbl52:
                // 2 sources

                var5_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)io.a(27312, 3526339801360802429L), (int)io.a(14594, 883937856741732642L), (long)834203424483934088L), (int)io.a(18985, 8317775949335462407L), (long)834203424483934088L) ^ io.a(2799, 290481979288175266L) ^ io.a(25535, 9047719176858971003L);
                if (!var2_2) continue;
lbl54:
                // 2 sources

                v1 = hi.a("G", (int)hi.a("G", (int)io.a(15992, 6346735822703228506L), (int)io.a(18916, 4265423916567429544L), (long)834203424483934088L), (int)io.a(12343, 3715062493957781738L), (long)834203424483934088L) + io.a(25176, 5781224764440193589L);
lbl55:
                // 2 sources

                var5_3 /* !! */  = (int)v1;
                if (!var2_2) continue;
lbl57:
                // 2 sources

                var5_3 /* !! */  = hi.a("G", (int)(io.a(16496, 475889370246580295L) ^ io.a(5340, 7261981978061921421L)), (int)io.a(20936, 8725033675899672871L), (long)834203424483934088L) + io.a(11163, 7365540230589473786L) + io.a(21430, 2184997273039805279L) ^ io.a(15965, 4692903357755127328L);
                continue;
            }
            var5_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)io.a(14674, 3082053460872589583L), (int)io.a(31003, 7248652570490450242L), (long)834203424483934088L), (int)io.a(23981, 1717803260360299995L), (long)834203424483934088L) ^ io.a(12425, 8474247089193973915L) ^ io.a(27748, 9090719786187236448L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean U(Object[] objectArray) {
        ItemStack itemStack = (ItemStack)objectArray[0];
        ResourceKey resourceKey = (ResourceKey)objectArray[1];
        int n = (io.a(20910, 8502901609768196446L) ^ io.a(13194, 7945161032031960008L)) / io.a(30735, 7310781647869030425L) + io.a(25116, 6625550470841051865L);
        block5: while (true) {
            switch (n) {
                default: {
                    if (hi.a("\u00a5", (Object)itemStack, (long)675687955611242108L) == false) break;
                    n = (io.a(29934, 2238453193727884327L) + io.a(14187, 54771312235544508L)) / io.a(18599, 1875588227134423105L) - io.a(13072, 8874008897980398364L) ^ io.a(26993, 3350528995693994292L);
                    continue block5;
                }
                case 1451110621: {
                    return false;
                }
                case 1451110620: {
                    Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = object2IntArrayMap;
                    objectArray2[0] = itemStack;
                    hi.a("G", (Object)objectArray2, (long)1326732325858324336L);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = resourceKey;
                    objectArray3[0] = object2IntArrayMap;
                    return (boolean)hi.a("G", (Object)objectArray3, (long)1149017997674918831L);
                }
                case 1451110622: {
                    hi.a("G", (long)459480616877844027L);
                    hi.a("G", (double)10.0, (long)1273198203909826830L);
                    return true;
                }
            }
            n = (io.a(22361, 6007420123161042788L) + io.a(25752, 8353857181197478987L)) * io.a(16938, 8100234578485873353L) ^ io.a(30347, 2726624475217444537L);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5096870323699422586L;
                var6_1 = new long[186];
                var3_2 = 0;
                var4_3 = "\u00d9\u0019\u00b0\u00bd\u0006\u008b<\u00c0\u00cd\u0094\u0014\u0099-\u00b2\u0012\fz5u4+~j\u00c7\u000b\u00dck\u0083'V\u0006i\u00d9/\u00b1\u0096/Jd\u009d\u0082\u00da\u00b7\u00fc}\u0001\u00e4\u00ec\u00c2]\u009bj\u00aa\u00cf'0\u007fA\u00f7\u00db\u00d5j\u00d8\u0098?\u0018M\u0018N\u0098\u00ad\u008a\u00b7<k\u00fe\u00c2\u00a8\u00fd\u00e8\u00bag\u00deq\u0089?\u007f\u00a2\u008c\u00c7\u009f\u00ac\u009f\u00fa-Ss\u00ad\u00bd:\u00a4\u0094\u0094\u00ae\u00a2U\u0098\u00dd)e\u0004T\u00b0C\u001f~\u0010~K\u0016u\\\u00c3\u0099.\u001b\u00e2\u009e\u00e4\u00d7~\u00e8\u00c3\u00a6\u00b6q\u00ac\u0006]\u001f\u008al{\u00b5\n\u00e8\u00e1\u0090\u0094m\u0019\u00e7&\u0005\u008b\u00c8\u00c7\u0004\u0018J\u00cb\u001cb\u00ce\u00a8\u0004\u008c\u0006\u008f\u00a907\u00ed\u00e7\u00b0H\u009b&0[\u00d5\u008e+6Ej\u008da\u009b6\u0010*\u00b1N\u0012\u007f-\u00dd\u0017\u000ftD\u0019\u00f5\u001a=3\u0018`\u00c7\u00d3p\\&;>\u00fb\u0083f\u0019\u0080E{\u00b3\u00a5*\u009f`\u00a4B\u00ba1f3?\u00d2\u00ee\u0007\u00c5a@a4\u000fD\u0083\u00ee\u00ed\u00bc\u0099\u0019\u0082\u00f3YF@\u0084\u00e8h\u0018\u0096#\u00fa6\u00ff/\u0095\u00a4Al&rj\u0086\u00e5o\u00a5=\u00f3\u009c\u009dr'\f\u009a+\u008f\u00e8vd\u00f3\u0084\u001c\u00c18\u00f6\u00a1v\u0091\u0082\u008af\u00ef\u0081\u009bA$\u00ab\u00cd\u00068\u00e6\u0019v\u00e8p\u000e\f\u0010\u0089m>3\u00df\u00f5T\u00ef\u0002B6\u0083\u00a4\u00bcu\u00c6\u0012\u00ee \u0001<\u00df\u009e\u0085%\u00c3\u00f6\u00f4\u00f9N\"\u0084\u00ac0v\u00eeg\u00cbyW\u0082\u001f\u00d4\"c`\u0082g\u00d7\u0019G\u009c\u008aT\u0095\u000bJ\u0017\u00ca\u009b\u009eG\u008a\u00c9eo\\\u00be\u00b6\u00e7\u0092<\u001c\u00bd\u0086\u009ay\u0017\u001di!~\u00e2\u00e1\u00ea\u000e{\u0082\u00c7B\u00e1\u00ede\u00a2\u00f1p\u00c6\u00da,\u00e8o\u0092\u0082\u0087'u\u0085\u0083\u00ebn\u00bf\u00b3\u00df\u00a6\u00c3\u0014\u0004\u00d6D~O\u00d6\u009c\u00dd\u00df\u009e\u00fc\u00c9\u008f\u0002\u001d\u0002G\u0093\u00f6\u00a4\u009c=\u00af\u007f\u00f6\u00d7\u00a5\u008eOX\u0017wB\u00bf\u00be@\u00e5/\t\u009e\u0086\u00cf\u00ff\u00fb\u00a3\u001f\u00fe\u0086\u00fe\u008c\u00dd\u008b\u00e2\u00c2\r\u00ea2\u0095LE\u00d5\u00d8\u000f`Xw\u00f2\u0082\u00af\u00e59@\u00e8\u00bcz\u008e\u0091\u00b23\u00e75\u008a\u00fa\u00be\u00d7\u009d\u00e2\u0011\u0002\u00cb;\u000e\u00b6\u0018\u00a0\u00b4/,#K\u000bdDv\u00afd\u00b5\u00b7\u00a6\t]\u001f\u00ae\u00af\u00f5r\u00f8\u00de\u00f3\u00c29)\u001ay+\u0090\u0089\u00f5\u0091\u008a\u008a(\u00fbO\u000f\u00c4\u00edH\f\u00a3\u0012\u00b8\u00f1\u00c1s$>d\u001c\u00df\u00ecL\u0089\u0017\u00a4\u00a5>\u00f3\u00b7\u00b3/\u008c\f]BLy\u0096\u0000ta\u00b2\u00e0\u00c0F|MW\u00bf\u00c0-\u0082i#A<\u00ce\f\u00fbYM\u0019\u00c4\u001f\u00d6,l\u00b1&\u009e+,ymI\u00fe\u001eY\u0091\u00cc\u0015\u0080\u00a92:\u009a\u00a3\u001f\u009a\u0089\u0085\u0006\u00e6\u00c6,\u0002\u009f\u00cc[\u00bd\u00b1\u0017\u001f\u00c5\u00beX\u00b8c&\u00ac\u009d\u001cy\u0098\u00dd\u0016\u0007\u00c4\u001d\u00a2*\u0010\u00f6\u00a4\u00d8c\u00f26\u001d\u00da\u0019\u0083\u00fe\u00ff\u00f7\u00f2j\u00ee\u0001Y\u0084\u00c2\u0086\u00a5Rk\u00c0\u0019\u00daY\u00d9\u00d8\u0094\u00d2\u00b1(n\u00e9\u0095\u00d0\u00ed\u0085\u0006\u008a\u00e5\u001c9X\u001e\u00de\u00a4b\u00a6J&D\u00d3t\u00acW\u00a48\u00fc\u00c6qQ\u00cc$\u00c4\u0015\u00ed\u00ce\u00d9\u00efZV\u00bc\u008d\u00a5\u00b9\u00f8%k\u00f1\u00ae\u0015\u009fKAj\u00c5\u0013J2b\u00fd\u00a2\u008aXm\u00d9\u00cbd5\u00b2\u008a)\u00f3\u00da\u0003\"f\u0081Q\u00f7\u000fo?G\u0014u,\u00d6\u008d\u009bO\u008c\u00ab\u008f\u001a\u00a2\u00a0-\u0006V\u0018\u00a1\u00b4\u00f4qWS\u00c8v\u00df\u0099M\u00ba\u008d^\u00b8\u0099\u00f1,p\u0089\u00c7\u00fe\u00fb}t\u00f6\u0011\u00158-\u00aes\r\f{\u00cc\u00c7\u0097d\u00afyJ\u00f1\u0004\u00de@\u00f20\u00fb\u00a0\u00f4\u009c\u0085w\u00fd\u00b8?\u00c9\u00e2%(\u00af&\u00eb\u00fc\u0098Z!+\u00ef\u00ca\u0018\u000e\u00c6\u00a9Mi\u00e6\u0005\u0002[>\u008by\u0091m\u00fe\u00c4\u00a6r\u00af\u008en\u00c0\u00b9I\u00f1qM0\u00c8N\u00e3\u008cL\u0019\u009d\u00f39\u00e6\u00df\u00bce\rt\u009bk\u009f\u00eeg\u0002\u00a5\u0000\u0096w\u0083\u00e2\u0016\u009a\u00c5\u00db\u00c2\u00f0\u00f6l\u00f5\u00da5\u00ff\u00d1o\u0010\u0016\u008dP?\u009bu\u00b1#SP\u00aa%\u00f9\u00ed\u0004(\u00c29`\u00c8xWJ#\u0095#\u00fc4\u00f9\u0092\u00d8\u001f\u00a6\u00da\u00fe\u00ee\u009cq\u00f19\u0017$\u0012?;\u00fc\b=\u00ff|\u00fb\u0004\u0098\u0011p;\u00a9\u0093!\u008f\u0012&zO'\u00f7|\u00c8P\u00f8\u0010\u0016\u00b5\u0000\u00a7\u00db\u00a0\u00ed\u00a3k\u00cb\u00f6\u00c0\u00db\u00c4\u0007\u0087\u0012(\u00cd!\u00aa\u00a7\u00c0P\u008e \u000bx\u00dft=;\u0097\u00fa5\u00bc\u00bf\u00c5\u00d2\u00dcs\u00e6\u00a1\u00b2\u00ebB\u0014U*\u00a1\u00f1\u00a4a\u00e0\u00f1o\u00d6^QZ~%?\u00f6\u00c6\"\u00ab\u00ceG\u00ab\u00feU\u00cbr\u00f81sI\u00e6i\u001d\u00a4\u0005\u00b2\u00e6o=\u0017\u0099\u00c0\u00ec7\u0094\u00bf\u00b6`Y\u00ea\u00a8\u00ab\u0003\u00e0m\u00cb\u00de\u00db\u00ec\u0019u\u00b5\u00c7\u00e3\u0092\u0093\u0093\u00e13P\u00ba\u00bcVb\"\u0098\u0090\u0015KgS\u00f4\u001do:\f\u00f3\u00ad\u008f\u00fa[\u00ab\u008c\u00f0\u00d3\u00ece\u001c\u00b9\u00e2H\u0019\u00bca\u00ddO\u00f1\u0090\u0015L'\u00fe^\u00a7)Fr\u0017d\u00f0\u009c\u0087\u0080\u00ac\u00bf)\u00d4d\u00a3\u0094P\u000b0_~\u00d6\u009d\u0097,\u0090\u009dhP\u0083\rs\u00eb-\u00c3=t\u00996\u00c1^\u0096\u00b5m\u00d9@\u00f2N\u00d0>\u0016\u009ac\u00c8\u00b3\u008b2\t\u0002I\u00c8^*N\u00e4N-\u00b3\u0014Xd\u00fd\r\u00b8\u0093\u00a0P\u00e2\u001e\u00aa\u00a1\u0083a\u008b\u008b\u0093\u008dm \u00be\n*\u00a6\u0003\u0003J0\u00c7\u0087z\u008d&\u00ae@\u00d9x\u0019\u00ac[\u0080\u00e8\u00af\u0098\u009f\u00b2\u00edh\u007fM\u00e1\u00be\u00a5\u00cd_c7\u00de\u00db\u00cb\u00f0\\\u001eFA\u00fb\u00b0P\u00eb\fx\\\u00d7\u00a0\u0000\u00cb\u00b2\u00ad\u00deO$M\u00fc+\u00feP=\u008b\u00f6,\u00a1^$\u00f4\u008aj^\u00a4\t\u00c6<\t\u0002\u009a\u0016\u0094Lu\u00a2+\u009d>\u00b6}\u000f\u00b6=\b\u00a4 \u0000\u00d4\u00dc\u0017g:\u00c0\u00a9\u00d1\u00ce\u007f\u0003}_1\u00ce\u0083\u0092\u00c31\u0015\u00157\u00df\u00a7\u00ce~\nVS\u00f7s\u00fb-Yv\u0090\u00c2\u0010\\s0\u00b8\u00047\u00db(D\u0088p\bu\\]ca<\u009d\u00eai\u00e6\u00f5f\u001f\u00c8$[3\u00a6iw\u00bb\u0087-\u0004r~]\u00e8\u008a\u0098r\u00b7y\u00f2\u00f4\u0097";
                var5_4 = "\u00d9\u0019\u00b0\u00bd\u0006\u008b<\u00c0\u00cd\u0094\u0014\u0099-\u00b2\u0012\fz5u4+~j\u00c7\u000b\u00dck\u0083'V\u0006i\u00d9/\u00b1\u0096/Jd\u009d\u0082\u00da\u00b7\u00fc}\u0001\u00e4\u00ec\u00c2]\u009bj\u00aa\u00cf'0\u007fA\u00f7\u00db\u00d5j\u00d8\u0098?\u0018M\u0018N\u0098\u00ad\u008a\u00b7<k\u00fe\u00c2\u00a8\u00fd\u00e8\u00bag\u00deq\u0089?\u007f\u00a2\u008c\u00c7\u009f\u00ac\u009f\u00fa-Ss\u00ad\u00bd:\u00a4\u0094\u0094\u00ae\u00a2U\u0098\u00dd)e\u0004T\u00b0C\u001f~\u0010~K\u0016u\\\u00c3\u0099.\u001b\u00e2\u009e\u00e4\u00d7~\u00e8\u00c3\u00a6\u00b6q\u00ac\u0006]\u001f\u008al{\u00b5\n\u00e8\u00e1\u0090\u0094m\u0019\u00e7&\u0005\u008b\u00c8\u00c7\u0004\u0018J\u00cb\u001cb\u00ce\u00a8\u0004\u008c\u0006\u008f\u00a907\u00ed\u00e7\u00b0H\u009b&0[\u00d5\u008e+6Ej\u008da\u009b6\u0010*\u00b1N\u0012\u007f-\u00dd\u0017\u000ftD\u0019\u00f5\u001a=3\u0018`\u00c7\u00d3p\\&;>\u00fb\u0083f\u0019\u0080E{\u00b3\u00a5*\u009f`\u00a4B\u00ba1f3?\u00d2\u00ee\u0007\u00c5a@a4\u000fD\u0083\u00ee\u00ed\u00bc\u0099\u0019\u0082\u00f3YF@\u0084\u00e8h\u0018\u0096#\u00fa6\u00ff/\u0095\u00a4Al&rj\u0086\u00e5o\u00a5=\u00f3\u009c\u009dr'\f\u009a+\u008f\u00e8vd\u00f3\u0084\u001c\u00c18\u00f6\u00a1v\u0091\u0082\u008af\u00ef\u0081\u009bA$\u00ab\u00cd\u00068\u00e6\u0019v\u00e8p\u000e\f\u0010\u0089m>3\u00df\u00f5T\u00ef\u0002B6\u0083\u00a4\u00bcu\u00c6\u0012\u00ee \u0001<\u00df\u009e\u0085%\u00c3\u00f6\u00f4\u00f9N\"\u0084\u00ac0v\u00eeg\u00cbyW\u0082\u001f\u00d4\"c`\u0082g\u00d7\u0019G\u009c\u008aT\u0095\u000bJ\u0017\u00ca\u009b\u009eG\u008a\u00c9eo\\\u00be\u00b6\u00e7\u0092<\u001c\u00bd\u0086\u009ay\u0017\u001di!~\u00e2\u00e1\u00ea\u000e{\u0082\u00c7B\u00e1\u00ede\u00a2\u00f1p\u00c6\u00da,\u00e8o\u0092\u0082\u0087'u\u0085\u0083\u00ebn\u00bf\u00b3\u00df\u00a6\u00c3\u0014\u0004\u00d6D~O\u00d6\u009c\u00dd\u00df\u009e\u00fc\u00c9\u008f\u0002\u001d\u0002G\u0093\u00f6\u00a4\u009c=\u00af\u007f\u00f6\u00d7\u00a5\u008eOX\u0017wB\u00bf\u00be@\u00e5/\t\u009e\u0086\u00cf\u00ff\u00fb\u00a3\u001f\u00fe\u0086\u00fe\u008c\u00dd\u008b\u00e2\u00c2\r\u00ea2\u0095LE\u00d5\u00d8\u000f`Xw\u00f2\u0082\u00af\u00e59@\u00e8\u00bcz\u008e\u0091\u00b23\u00e75\u008a\u00fa\u00be\u00d7\u009d\u00e2\u0011\u0002\u00cb;\u000e\u00b6\u0018\u00a0\u00b4/,#K\u000bdDv\u00afd\u00b5\u00b7\u00a6\t]\u001f\u00ae\u00af\u00f5r\u00f8\u00de\u00f3\u00c29)\u001ay+\u0090\u0089\u00f5\u0091\u008a\u008a(\u00fbO\u000f\u00c4\u00edH\f\u00a3\u0012\u00b8\u00f1\u00c1s$>d\u001c\u00df\u00ecL\u0089\u0017\u00a4\u00a5>\u00f3\u00b7\u00b3/\u008c\f]BLy\u0096\u0000ta\u00b2\u00e0\u00c0F|MW\u00bf\u00c0-\u0082i#A<\u00ce\f\u00fbYM\u0019\u00c4\u001f\u00d6,l\u00b1&\u009e+,ymI\u00fe\u001eY\u0091\u00cc\u0015\u0080\u00a92:\u009a\u00a3\u001f\u009a\u0089\u0085\u0006\u00e6\u00c6,\u0002\u009f\u00cc[\u00bd\u00b1\u0017\u001f\u00c5\u00beX\u00b8c&\u00ac\u009d\u001cy\u0098\u00dd\u0016\u0007\u00c4\u001d\u00a2*\u0010\u00f6\u00a4\u00d8c\u00f26\u001d\u00da\u0019\u0083\u00fe\u00ff\u00f7\u00f2j\u00ee\u0001Y\u0084\u00c2\u0086\u00a5Rk\u00c0\u0019\u00daY\u00d9\u00d8\u0094\u00d2\u00b1(n\u00e9\u0095\u00d0\u00ed\u0085\u0006\u008a\u00e5\u001c9X\u001e\u00de\u00a4b\u00a6J&D\u00d3t\u00acW\u00a48\u00fc\u00c6qQ\u00cc$\u00c4\u0015\u00ed\u00ce\u00d9\u00efZV\u00bc\u008d\u00a5\u00b9\u00f8%k\u00f1\u00ae\u0015\u009fKAj\u00c5\u0013J2b\u00fd\u00a2\u008aXm\u00d9\u00cbd5\u00b2\u008a)\u00f3\u00da\u0003\"f\u0081Q\u00f7\u000fo?G\u0014u,\u00d6\u008d\u009bO\u008c\u00ab\u008f\u001a\u00a2\u00a0-\u0006V\u0018\u00a1\u00b4\u00f4qWS\u00c8v\u00df\u0099M\u00ba\u008d^\u00b8\u0099\u00f1,p\u0089\u00c7\u00fe\u00fb}t\u00f6\u0011\u00158-\u00aes\r\f{\u00cc\u00c7\u0097d\u00afyJ\u00f1\u0004\u00de@\u00f20\u00fb\u00a0\u00f4\u009c\u0085w\u00fd\u00b8?\u00c9\u00e2%(\u00af&\u00eb\u00fc\u0098Z!+\u00ef\u00ca\u0018\u000e\u00c6\u00a9Mi\u00e6\u0005\u0002[>\u008by\u0091m\u00fe\u00c4\u00a6r\u00af\u008en\u00c0\u00b9I\u00f1qM0\u00c8N\u00e3\u008cL\u0019\u009d\u00f39\u00e6\u00df\u00bce\rt\u009bk\u009f\u00eeg\u0002\u00a5\u0000\u0096w\u0083\u00e2\u0016\u009a\u00c5\u00db\u00c2\u00f0\u00f6l\u00f5\u00da5\u00ff\u00d1o\u0010\u0016\u008dP?\u009bu\u00b1#SP\u00aa%\u00f9\u00ed\u0004(\u00c29`\u00c8xWJ#\u0095#\u00fc4\u00f9\u0092\u00d8\u001f\u00a6\u00da\u00fe\u00ee\u009cq\u00f19\u0017$\u0012?;\u00fc\b=\u00ff|\u00fb\u0004\u0098\u0011p;\u00a9\u0093!\u008f\u0012&zO'\u00f7|\u00c8P\u00f8\u0010\u0016\u00b5\u0000\u00a7\u00db\u00a0\u00ed\u00a3k\u00cb\u00f6\u00c0\u00db\u00c4\u0007\u0087\u0012(\u00cd!\u00aa\u00a7\u00c0P\u008e \u000bx\u00dft=;\u0097\u00fa5\u00bc\u00bf\u00c5\u00d2\u00dcs\u00e6\u00a1\u00b2\u00ebB\u0014U*\u00a1\u00f1\u00a4a\u00e0\u00f1o\u00d6^QZ~%?\u00f6\u00c6\"\u00ab\u00ceG\u00ab\u00feU\u00cbr\u00f81sI\u00e6i\u001d\u00a4\u0005\u00b2\u00e6o=\u0017\u0099\u00c0\u00ec7\u0094\u00bf\u00b6`Y\u00ea\u00a8\u00ab\u0003\u00e0m\u00cb\u00de\u00db\u00ec\u0019u\u00b5\u00c7\u00e3\u0092\u0093\u0093\u00e13P\u00ba\u00bcVb\"\u0098\u0090\u0015KgS\u00f4\u001do:\f\u00f3\u00ad\u008f\u00fa[\u00ab\u008c\u00f0\u00d3\u00ece\u001c\u00b9\u00e2H\u0019\u00bca\u00ddO\u00f1\u0090\u0015L'\u00fe^\u00a7)Fr\u0017d\u00f0\u009c\u0087\u0080\u00ac\u00bf)\u00d4d\u00a3\u0094P\u000b0_~\u00d6\u009d\u0097,\u0090\u009dhP\u0083\rs\u00eb-\u00c3=t\u00996\u00c1^\u0096\u00b5m\u00d9@\u00f2N\u00d0>\u0016\u009ac\u00c8\u00b3\u008b2\t\u0002I\u00c8^*N\u00e4N-\u00b3\u0014Xd\u00fd\r\u00b8\u0093\u00a0P\u00e2\u001e\u00aa\u00a1\u0083a\u008b\u008b\u0093\u008dm \u00be\n*\u00a6\u0003\u0003J0\u00c7\u0087z\u008d&\u00ae@\u00d9x\u0019\u00ac[\u0080\u00e8\u00af\u0098\u009f\u00b2\u00edh\u007fM\u00e1\u00be\u00a5\u00cd_c7\u00de\u00db\u00cb\u00f0\\\u001eFA\u00fb\u00b0P\u00eb\fx\\\u00d7\u00a0\u0000\u00cb\u00b2\u00ad\u00deO$M\u00fc+\u00feP=\u008b\u00f6,\u00a1^$\u00f4\u008aj^\u00a4\t\u00c6<\t\u0002\u009a\u0016\u0094Lu\u00a2+\u009d>\u00b6}\u000f\u00b6=\b\u00a4 \u0000\u00d4\u00dc\u0017g:\u00c0\u00a9\u00d1\u00ce\u007f\u0003}_1\u00ce\u0083\u0092\u00c31\u0015\u00157\u00df\u00a7\u00ce~\nVS\u00f7s\u00fb-Yv\u0090\u00c2\u0010\\s0\u00b8\u00047\u00db(D\u0088p\bu\\]ca<\u009d\u00eai\u00e6\u00f5f\u001f\u00c8$[3\u00a6iw\u00bb\u0087-\u0004r~]\u00e8\u008a\u0098r\u00b7y\u00f2\u00f4\u0097".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u008b\u00b0:\u00b6c\u00b9\u008d\u009b\u0082}?\u00f2'\u00ec\u00e2>";
                    var5_4 = "\u008b\u00b0:\u00b6c\u00b9\u008d\u009b\u0082}?\u00f2'\u00ec\u00e2>".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        io.a = var6_1;
        io.b = new Integer[186];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4849;
        if (b[n2] == null) {
            io.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
