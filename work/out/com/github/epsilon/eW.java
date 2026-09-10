/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket
 *  net.minecraft.network.protocol.game.ServerboundUseItemPacket
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.player.Inventory
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.StandingAndWallBlockItem
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.BushBlock
 *  net.minecraft.world.level.block.CropBlock
 *  net.minecraft.world.level.block.FlowerBlock
 *  net.minecraft.world.level.block.NetherFungusBlock
 *  net.minecraft.world.level.block.SlabBlock
 *  net.minecraft.world.phys.Vec3
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package com.github.epsilon;

import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dr;
import com.github.epsilon.Dx;
import com.github.epsilon.XG;
import com.github.epsilon.XU;
import com.github.epsilon.Xe;
import com.github.epsilon.Xn;
import com.github.epsilon.d9;
import com.github.epsilon.dP;
import com.github.epsilon.dQ;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.gD;
import com.github.epsilon.gJ;
import com.github.epsilon.hi;
import com.github.epsilon.i5;
import com.github.epsilon.lz;
import com.github.epsilon.nu;
import com.github.epsilon.uK;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.yi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.NetherFungusBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public class eW
extends e {
    private final Xn M;
    public static final eW X;
    private int L;
    private final XG k;
    private final Xn d;
    private boolean W;
    private final Xe<Block> D;
    private boolean a;
    private final Xn v;
    private final Xn E;
    private float T;
    private final XG t;
    private final DV J;
    private int m;
    private int z;
    private float V;
    private Direction S;
    private final Xn h;
    private final List<Dr> l;
    private final Xn u;
    private final XG Q;
    private final Dx<i5> O;
    private final XG q;
    private lz K;
    private final Dx<gJ> y;
    private float e;
    private uK c;
    private final XG B;
    private float H;
    private final Dx<nu> o;
    private final Xn P;
    private double n;
    private BlockPos b;
    private final Xn C;
    private boolean x;
    private final DV N;
    private final Dx<XU> F;
    private static final String[] w;
    private static final String[] cb;
    private static final long[] db;
    private static final Integer[] eb;
    private static final long[] jb;
    private static final Long[] kb;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean t(ItemStack var1_1) {
        block36: {
            block35: {
                block34: {
                    var2_2 = Dl.t();
                    var5_3 /* !! */  = eW.c(13891, 2507985773406702301L) * eW.c(19856, 2840511411440595058L) ^ eW.c(31838, 3854951820009768065L);
                    if (!var2_2) break block34;
lbl4:
                    // 2 sources

                    while (true) {
                        if (var1_1 == null) {
                            var5_3 /* !! */  = (int)(hi.a("G", (int)eW.c(26781, 401498245890642238L), (int)eW.c(27575, 4598525839179847322L), (long)834203424483934088L) + eW.c(17070, 6652187238164249817L) + eW.c(3115, 3378329637168476294L) + eW.c(10175, 5563812994365250522L));
                            if (!var2_2) break block34;
                        }
                        var5_3 /* !! */  = (eW.c(16345, 2011793954202370693L) * eW.c(14477, 3286132806745999017L) ^ eW.c(3308, 850839418900083357L)) / eW.c(24203, 4700334821015005101L) + eW.c(21575, 613720322193534036L);
                        if (!var2_2) break block34;
                        ** GOTO lbl43
                        break;
                    }
lbl11:
                    // 2 sources

                    while (true) {
                        v0 = var4_5 instanceof CropBlock;
                        if (var2_2) ** GOTO lbl153
                        if (v0 == 0) ** GOTO lbl152
                        ** GOTO lbl154
                        break;
                    }
                }
                block29: while (true) {
                    switch (var5_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 582844061: {
                            v1 = hi.a("\u00a5", (Object)var1_1, (long)675687955611242108L);
                            if (var2_2) ** GOTO lbl44
                            if (v1 != false) ** GOTO lbl43
                            ** GOTO lbl46
                        }
                        case 582844060: {
                            v2 = hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) instanceof BlockItem;
                            if (var2_2) ** GOTO lbl49
                            if (v2 != 0) ** GOTO lbl48
                            ** GOTO lbl50
                        }
                        case 582844056: {
                            var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var1_1, (long)923433247397949520L), (long)445233814433577985L);
                            v3 /* !! */  = hi.a("\u00a5", (Object)var3_4, (Object)eW.b(-16471, 15887), (long)1195372608991279295L);
                            if (var2_2) ** GOTO lbl53
                            if (v3 /* !! */  != false) ** GOTO lbl52
                            ** GOTO lbl55
                        }
                        case 582844058: {
                            hi.a("G", (long)369479218486228686L);
                            var5_3 /* !! */  = eW.c(6499, 8365531765559781323L) * eW.c(5268, 1799829524357114923L) + eW.c(14116, 1510499530485320018L);
                            continue block29;
                        }
lbl43:
                        // 2 sources

                        v1 = hi.a("G", (int)eW.c(5443, 780820473712143188L), (int)eW.c(28706, 4184354488992565586L), (long)834203424483934088L) + eW.c(6449, 2587601940794074949L) + eW.c(25822, 2230511161939991686L) + eW.c(16487, 1481477899164597537L);
lbl44:
                        // 2 sources

                        var5_3 /* !! */  = (int)v1;
                        if (!var2_2) continue block29;
lbl46:
                        // 2 sources

                        var5_3 /* !! */  = (int)((hi.a("G", (int)eW.c(15898, 6987787604741308859L), (int)eW.c(12114, 826359907545798545L), (long)834203424483934088L) - eW.c(3813, 4029425547576734256L)) / eW.c(15119, 7164539058895144795L) - eW.c(4236, 704911662336436336L));
                        if (!var2_2) continue block29;
lbl48:
                        // 2 sources

                        v2 = var5_3 /* !! */  = (eW.c(24175, 2104352596315416178L) + eW.c(25055, 2692322511909756087L) ^ eW.c(26639, 3831829105705881909L)) / eW.c(11040, 7117522510885967068L) + eW.c(14506, 1694006503041909988L);
lbl49:
                        // 2 sources

                        if (!var2_2) continue block29;
lbl50:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)eW.c(5443, 780820473712143188L), (int)eW.c(28706, 4184354488992565586L), (long)834203424483934088L) + eW.c(6449, 2587601940794074949L) + eW.c(25822, 2230511161939991686L) + eW.c(16487, 1481477899164597537L));
                        continue block29;
lbl52:
                        // 1 sources

                        v3 /* !! */  = (CallSite)(eW.c(21915, 2490519428325682380L) - eW.c(11647, 5011829952787337700L) - eW.c(6018, 3413813045149560652L));
lbl53:
                        // 2 sources

                        var5_3 /* !! */  = (int)v3 /* !! */ ;
                        if (!var2_2) break block35;
lbl55:
                        // 2 sources

                        var5_3 /* !! */  = (eW.c(24267, 3510407735060472398L) ^ eW.c(4264, 1128223596825407105L)) + eW.c(16952, 8879478856354873219L);
                        if (!var2_2) break block35;
                        ** GOTO lbl85
                        case 582844059: 
                    }
                    break;
                }
                return false;
            }
            block30: while (true) {
                switch (var5_3 /* !! */ ) {
                    default: {
                        v4 /* !! */  = eW.F("9hlJEIowNbw9SkuG", contains(java.lang.CharSequence ), (String)var3_4, (CharSequence)eW.b(-16457, 8985));
                        if (var2_2) ** GOTO lbl86
                        if (v4 /* !! */  == false) ** GOTO lbl85
                        ** GOTO lbl88
                    }
                    case 415068222: {
                        v5 = hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L) instanceof StandingAndWallBlockItem;
                        if (var2_2) ** GOTO lbl91
                        if (v5 == 0) ** GOTO lbl90
                        ** GOTO lbl92
                    }
                    case 415068223: {
                        var4_5 = hi.a("\u00a5", (Object)((BlockItem)hi.a("\u00a5", (Object)var1_1, (long)769006157898026769L)), (long)708963368116028632L);
                        v6 /* !! */  = var4_5 instanceof FlowerBlock;
                        if (var2_2) ** GOTO lbl95
                        if (v6 /* !! */  != 0) ** GOTO lbl94
                        ** GOTO lbl96
                    }
                    case 415068221: {
                        hi.a("G", (long)698875808952297500L);
                        eW.F("9hlJEIowNbw9SkuG", values());
                        return (boolean)hi.a("G", (long)373721845012904719L);
                    }
lbl85:
                    // 2 sources

                    v4 /* !! */  = (CallSite)((eW.c(10284, 4003616905817444433L) ^ eW.c(24679, 8581647698845212274L)) * eW.c(15871, 3669262889325019582L) - eW.c(27863, 6850501175093498781L));
lbl86:
                    // 2 sources

                    var5_3 /* !! */  = (int)v4 /* !! */ ;
                    if (!var2_2) continue block30;
lbl88:
                    // 2 sources

                    var5_3 /* !! */  = eW.c(3923, 4593640038074741260L) - eW.c(23547, 6937048259486557759L) - eW.c(1080, 4269761617389255856L);
                    if (!var2_2) continue block30;
lbl90:
                    // 2 sources

                    v5 = var5_3 /* !! */  = hi.a("G", (int)(eW.c(28377, 8140691384754704683L) * eW.c(30810, 5063357453782253629L)), (int)eW.c(32336, 1933171069251717091L), (long)834203424483934088L) + eW.c(11907, 3690069032255017572L) ^ eW.c(8047, 5218643504490899088L);
lbl91:
                    // 2 sources

                    if (!var2_2) continue block30;
lbl92:
                    // 2 sources

                    var5_3 /* !! */  = (hi.a("G", (int)(eW.c(5367, 2744368834027612774L) / eW.c(15287, 4391928138228516140L) + eW.c(28519, 2502075621551345970L)), (int)eW.c(8372, 5234466040381954191L), (long)834203424483934088L) ^ eW.c(3093, 701179551672234248L)) + eW.c(16878, 2813625594153188850L);
                    continue block30;
lbl94:
                    // 1 sources

                    v6 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)eW.c(27890, 2772016030972776829L), (int)eW.c(20197, 6864630804504981875L), (long)834203424483934088L) + eW.c(23334, 2185090175939290278L));
lbl95:
                    // 2 sources

                    if (!var2_2) break block36;
lbl96:
                    // 2 sources

                    var5_3 /* !! */  = eW.c(3775, 2264890777106773897L) / eW.c(23509, 1465630396050449587L) + eW.c(19921, 1264857134072476647L);
                    if (!var2_2) break block36;
                    ** GOTO lbl144
                    case 415068224: {
                        return false;
                    }
                    case 415068219: 
                }
                break;
            }
            return false;
        }
        block31: while (true) {
            switch (var5_3 /* !! */ ) {
                default: {
                    v7 /* !! */  = var4_5 instanceof BushBlock;
                    if (var2_2) ** GOTO lbl145
                    if (v7 /* !! */  != 0) ** GOTO lbl144
                    ** GOTO lbl146
                }
                case -977216755: {
                    v8 /* !! */  = var4_5 instanceof NetherFungusBlock;
                    if (var2_2) ** GOTO lbl149
                    if (v8 /* !! */  != 0) ** GOTO lbl148
                    ** GOTO lbl150
                }
                case -977216750: {
                    hi.a("G", (boolean)true, (long)1315516439304393687L);
                    hi.a("G", (long)1072168011298293672L);
                    ** GOTO lbl11
                }
                case -977216754: {
                    ** continue;
                }
                case -977216747: {
                    v9 /* !! */  = var4_5 instanceof SlabBlock;
                    if (var2_2) ** GOTO lbl157
                    if (v9 /* !! */  != 0) ** GOTO lbl156
                    ** GOTO lbl158
                }
                case -977216753: {
                    v10 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)585662094747217787L), (Object)var4_5, (long)1134577943252936452L);
                    if (var2_2) ** GOTO lbl161
                    if (v10 != false) ** GOTO lbl160
                    ** GOTO lbl163
                }
                case -977216752: {
                    v11 = true;
                    var5_3 /* !! */  = hi.a("G", (int)(eW.c(31913, 4368108743360676422L) - eW.c(24900, 578021853671005604L)), (int)eW.c(14673, 3479295828198245783L), (long)834203424483934088L) * eW.c(5562, 200345019339336677L) + eW.c(20210, 6437950326893719623L) ^ eW.c(11662, 1837020191466607025L);
                    if (!var2_2) ** GOTO lbl166
                    ** GOTO lbl165
                }
                case -977216749: {
                    v11 = false;
                    if (var2_2) {
                        return v11;
                    }
                    ** GOTO lbl165
                }
lbl144:
                // 2 sources

                v7 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)eW.c(3173, 7359525355990413439L), (int)eW.c(6989, 8537859074837210620L), (long)834203424483934088L) + eW.c(19484, 8557134170187772763L));
lbl145:
                // 2 sources

                if (!var2_2) continue block31;
lbl146:
                // 2 sources

                var5_3 /* !! */  = (eW.c(29753, 1201292213023639993L) ^ eW.c(5036, 7099880742570520011L) ^ eW.c(23990, 3717572035175687154L)) + eW.c(6840, 7112680031270168118L);
                if (!var2_2) continue block31;
lbl148:
                // 2 sources

                v8 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)eW.c(3173, 7359525355990413439L), (int)eW.c(6989, 8537859074837210620L), (long)834203424483934088L) + eW.c(19484, 8557134170187772763L));
lbl149:
                // 2 sources

                if (!var2_2) continue block31;
lbl150:
                // 2 sources

                var5_3 /* !! */  = (int)(hi.a("G", (int)eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(11076, 6799566641461548468L), (int)eW.c(1301, 7833377088675577318L)), (int)eW.c(20713, 7133319482748644844L), (long)834203424483934088L) * eW.c(17240, 6889294761916120883L) / eW.c(23509, 1465630396050449587L) - eW.c(25929, 748184570874502122L));
                if (!var2_2) continue block31;
lbl152:
                // 2 sources

                v0 = var5_3 /* !! */  = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)(eW.c(23935, 5352609533872775451L) / eW.c(31764, 6863189154801353676L) / eW.c(22434, 1754800183921453428L)), (int)eW.c(30880, 8245919812810015838L)) ^ eW.c(10707, 4627946537806909530L);
lbl153:
                // 2 sources

                if (!var2_2) continue block31;
lbl154:
                // 2 sources

                var5_3 /* !! */  = (int)(hi.a("G", (int)eW.c(3173, 7359525355990413439L), (int)eW.c(6989, 8537859074837210620L), (long)834203424483934088L) + eW.c(19484, 8557134170187772763L));
                if (!var2_2) continue block31;
lbl156:
                // 2 sources

                v9 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)(eW.c(32299, 8174223432724711010L) ^ eW.c(13595, 2007349989310385547L)), (int)eW.c(15829, 6014443132286288052L), (long)834203424483934088L) - eW.c(21570, 8248743509787388162L));
lbl157:
                // 2 sources

                if (!var2_2) continue block31;
lbl158:
                // 2 sources

                var5_3 /* !! */  = (eW.c(30335, 889063696474540161L) - eW.c(18160, 4902498597211290159L) + eW.c(21921, 8067252121358740965L) - eW.c(24501, 1768740738544280497L)) / 5 - eW.c(21996, 8797410343139585367L);
                if (!var2_2) continue block31;
lbl160:
                // 2 sources

                v10 = hi.a("G", (int)(eW.c(24578, 2196092494143332183L) ^ eW.c(20029, 3981357107339080191L)), (int)eW.c(16970, 8675505529851034938L), (long)834203424483934088L) - eW.c(16134, 6713706508261246686L);
lbl161:
                // 2 sources

                var5_3 /* !! */  = (int)v10;
                if (!var2_2) continue block31;
lbl163:
                // 2 sources

                var5_3 /* !! */  = eW.c(11915, 7717023588829352204L) * eW.c(4022, 5591367611157050059L) + eW.c(2741, 5498029025485190796L) - eW.c(5093, 5599443380476439434L);
                continue block31;
lbl165:
                // 2 sources

                var5_3 /* !! */  = hi.a("G", (int)(eW.c(13865, 2271966896305457791L) - eW.c(15967, 3863635574224635597L)), (int)eW.c(3302, 2409484463521296801L), (long)834203424483934088L) * eW.c(11543, 207019346189832263L) + eW.c(1311, 6087758113300643283L) ^ eW.c(634, 8783698087528921998L);
lbl166:
                // 2 sources

                switch (var5_3 /* !! */ ) {
                    default: {
                        return v11;
                    }
                    case -1672475412: 
                }
                throw null;
                case -977216748: 
            }
            break;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private void d(Object[] var1_1) {
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

    static {
        IlilIlIlil.registerNativesForClass((int)11, eW.class);
        Hidden0.special_clinit_11_20(eW.class);
    }

    private boolean z() {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1133521407411179272L);
        CallSite callSite2 = hi.a("G", (double)hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L), (double)((double)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)516855823746183673L)), (double)hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L), (long)921489941210881726L);
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)callSite2, (long)419122760578116751L), (long)1329471762216420120L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ItemStack B() {
        block27: {
            block26: {
                var1_1 = Dl.S();
                var4_2 /* !! */  = eW.c(24256, 7400227938834752285L) / eW.c(7419, 649002713630565316L) - eW.c(26332, 8129524441929751459L) - eW.c(10667, 409642203984483447L);
                if (var1_1) {
                    switch (var4_2 /* !! */ ) {
                        case -1175378681: {
                            hi.a("G", (long)889012284371480360L);
                            break;
                        }
                    }
                }
                var2_3 = eW.F("9hlJEIowNbw9SkuG", getOffhandItem(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                v0 /* !! */  = hi.a("\u00a5", (Object)this, (Object)var2_3, (long)1216873899594628740L);
                if (!var1_1) break block26;
                if (v0 /* !! */  != false) break block27;
                v0 /* !! */  = (CallSite)(eW.c(15926, 9199463062639003524L) + eW.c(640, 7395503262322949680L) ^ eW.c(7503, 4349283021986848901L));
            }
            var4_2 /* !! */  = (int)v0 /* !! */ ;
            if (var1_1) ** GOTO lbl39
        }
        var4_2 /* !! */  = (int)(hi.a("G", (int)eW.c(26743, 2422415600223065575L), (int)eW.c(32182, 5781938241553269376L), (long)834203424483934088L) + eW.c(12411, 3542698492338294538L) - eW.c(15892, 1432948178825920724L));
        if (var1_1) ** GOTO lbl39
        if (true) ** GOTO lbl70
        block18: while (true) {
            block30: {
                block29: {
                    block28: {
                        var3_4 = v1;
                        v2 = hi.a("\u00a5", (Object)this, (Object)var3_4, (long)1216873899594628740L);
                        if (!var1_1) break block28;
                        if (v2 != false) break block29;
                        v2 = hi.a("G", (int)hi.a("G", (int)eW.c(30166, 5803329401926552743L), (int)eW.c(20077, 1585932412230415320L), (long)834203424483934088L), (int)eW.c(12216, 7380967747111047403L), (long)834203424483934088L) / eW.c(15287, 4391928138228516140L) + eW.c(29059, 5838587621198237193L);
                    }
                    var4_2 /* !! */  = (int)v2;
                    if (var1_1) break block30;
                }
                var4_2 /* !! */  = (int)(hi.a("G", (int)(eW.c(25588, 5791263675965841096L) ^ eW.c(23087, 1429750652706104384L)), (int)eW.c(10185, 800006046044610555L), (long)834203424483934088L) - eW.c(24390, 8571300572369266325L));
                switch (var4_2 /* !! */ ) {
                    case -1797531723: {
                        eW.F("9hlJEIowNbw9SkuG", w());
                        return var3_4;
                    }
                }
                return var3_4;
            }
            block19: while (true) {
                switch (var4_2 /* !! */ ) {
                    case -203583658: {
                        if (hi.a("\u00e9", (Object)this, (long)963573612004996929L) == null) ** GOTO lbl70
                        ** GOTO lbl72
                    }
                    case -203583659: {
                        v3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)963573612004996929L), (long)429462471063532441L);
                        if (!var1_1) ** GOTO lbl75
                        if (v3 == false) ** GOTO lbl74
                        ** GOTO lbl77
                    }
                    case -203583660: {
                        v4 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)963573612004996929L), (long)669662444188596841L);
                        if (!var1_1) ** GOTO lbl80
                        if (v4 /* !! */  == false) ** GOTO lbl79
                        ** GOTO lbl82
                    }
                    case -203583662: {
                        v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1175532240973568599L);
                        var4_2 /* !! */  = eW.c(24703, 8885466198919420315L) * eW.c(7785, 5271148462422909196L) / eW.c(31764, 6863189154801353676L) - eW.c(3416, 2599087739373088993L);
                        if (var1_1) ** GOTO lbl85
                        ** GOTO lbl84
                    }
                    case -203583661: {
                        v1 = hi.a("\u00a5", (Object)eW.F("9hlJEIowNbw9SkuG", getInventory(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)963573612004996929L), (long)1221194514962317539L), (long)449627806291078247L);
                        if (!var1_1) {
                            continue block18;
                        }
                        ** GOTO lbl84
                    }
                    case -203583664: {
                        hi.a("G", (long)690575877997121757L);
                        var4_2 /* !! */  = eW.c(935, 9013318843999321862L) - eW.c(19104, 1893424029824365575L) - eW.c(6854, 2980911865064383213L);
                        continue block19;
                    }
lbl70:
                    // 2 sources

                    var4_2 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)eW.c(5155, 4666185933386640453L), (int)eW.c(22217, 835426204664180384L), (long)834203424483934088L), (int)eW.c(25534, 4500910927430327696L), (long)834203424483934088L) / eW.c(30215, 2696983299288795206L) + eW.c(27941, 3957795707370016841L));
                    if (var1_1) continue block19;
lbl72:
                    // 2 sources

                    var4_2 /* !! */  = (int)(hi.a("G", (int)eW.c(7873, 6491038634097566283L), (int)eW.c(27071, 6554466784256529565L), (long)834203424483934088L) * eW.c(23263, 2619760684841706245L) + eW.c(26021, 542214549247957675L) + eW.c(18091, 1672172866107554522L));
                    if (var1_1) continue block19;
lbl74:
                    // 2 sources

                    v3 = hi.a("G", (int)eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(30166, 5803329401926552743L), (int)eW.c(20077, 1585932412230415320L)), (int)eW.c(12216, 7380967747111047403L), (long)834203424483934088L) / eW.c(15287, 4391928138228516140L) + eW.c(29059, 5838587621198237193L);
lbl75:
                    // 2 sources

                    var4_2 /* !! */  = (int)v3;
                    if (var1_1) continue block19;
lbl77:
                    // 2 sources

                    var4_2 /* !! */  = eW.c(31373, 16462456298145310L) - eW.c(3330, 5108816910018901094L) - eW.c(9293, 8755865689593142115L) + eW.c(8631, 2385020952522086465L);
                    if (var1_1) continue block19;
lbl79:
                    // 2 sources

                    v4 /* !! */  = (CallSite)((eW.c(13496, 7684081192201309552L) * eW.c(16597, 740513914413235389L) - eW.c(27962, 5289687598599541110L) + eW.c(21733, 2455588284128176238L)) * eW.c(9782, 1763042743628519514L) + eW.c(32612, 8843220470364111479L));
lbl80:
                    // 2 sources

                    var4_2 /* !! */  = (int)v4 /* !! */ ;
                    if (var1_1) continue block19;
lbl82:
                    // 2 sources

                    var4_2 /* !! */  = ((eW.c(5819, 391068674953209999L) + eW.c(27056, 4582473937081963672L)) / eW.c(15119, 7164539058895144795L) - eW.c(19617, 8122140741209272334L)) * eW.c(7138, 8227628878005428995L) - eW.c(805, 13300108259130659L);
                    continue block19;
lbl84:
                    // 2 sources

                    var4_2 /* !! */  = eW.c(21576, 2253814448953109629L) * eW.c(9788, 5533334094214617720L) / eW.c(31764, 6863189154801353676L) - eW.c(21169, 3129658094108978072L);
lbl85:
                    // 2 sources

                    switch (var4_2 /* !! */ ) {
                        default: {
                            continue block18;
                        }
                        case -1314821917: 
                    }
                    throw null;
                    default: {
                        return var2_3;
                    }
                    case -203583657: 
                }
                break;
            }
            break;
        }
        return hi.a("j", (long)989520643504678076L);
    }

    private void lambda$new$0(d9 d92) {
        boolean bl;
        block12: {
            block11: {
                CallSite callSite;
                block10: {
                    bl = Dl.t();
                    callSite = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)561568277276180739L), (long)789438897355831922L))), (long)1000026253634408124L);
                    if (bl) break block10;
                    if (callSite == false) break block11;
                    callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)908003781362226090L), (long)1256913436411747171L);
                }
                if (callSite == false) break block12;
            }
            return;
        }
        CallSite callSite = hi.a("G", (long)658960450018995719L);
        CallSite callSite2 = hi.a("\u00a5", (Object)((Integer)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1091416552663955589L), (long)789438897355831922L))), (long)777001174361220699L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)908003781362226090L), arg_0 -> eW.lambda$new$1((long)callSite, (long)callSite2, arg_0), (long)646075409365692299L);
        CallSite callSite3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)908003781362226090L), (long)1240653736693366367L);
        while (hi.a("\u00a5", (Object)callSite3, (long)984088978567310565L) != false) {
            Object object;
            double d;
            CallSite callSite4;
            Dr dr;
            block13: {
                block14: {
                    dr = (Dr)((Object)hi.a("\u00a5", (Object)callSite3, (long)470012372636416268L));
                    callSite4 = hi.a("G", (float)((float)(callSite - hi.a("\u00a5", (Object)dr, (long)558215302332514818L)) / (float)callSite2), (float)0.0f, (float)1.0f, (long)390336973585993938L);
                    d = 1.0;
                    object = hi.a("\u00a5", (Object)dr, (long)871227681734501961L);
                    if (bl) break block13;
                    if (object == false) break block14;
                    d = 1.0 - (double)hi.a("\u00a5", (Object)((Float)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1040600083952144213L), (long)1141210563691722787L), (Object)hi.a("G", (float)callSite4, (long)1097085248186378937L), (long)1109315089994431641L))), (long)1263586790430806583L);
                    double d2 = d - 0.0;
                    object = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                    if (bl) break block13;
                    if (object < 0) {
                        d = 0.0;
                    }
                }
                object = hi.a("\u00a5", (Object)dr, (long)1202886901314453432L);
            }
            float f = object != false ? (float)hi.a("G", (float)(1.0f - callSite4), (float)0.0f, (float)1.0f, (long)390336973585993938L) : 1.0f;
            CallSite callSite5 = hi.a("\u00a5", (Object)dr, (long)602872773814910692L);
            CallSite callSite6 = hi.a("\u00a5", (Object)dr, (long)627346769190763154L);
            Color color = new Color((int)hi.a("\u00a5", (Object)callSite5, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)callSite5, (long)791634218836538619L), (int)hi.a("\u00a5", (Object)callSite5, (long)505295769199362574L), (int)((float)eW.F("9hlJEIowNbw9SkuG", getAlpha(), (Color)((Object)callSite5)) * f));
            Color color2 = new Color((int)hi.a("\u00a5", (Object)callSite6, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)callSite6, (long)791634218836538619L), (int)hi.a("\u00a5", (Object)callSite6, (long)505295769199362574L), (int)((float)hi.a("\u00a5", (Object)callSite6, (long)999912139159319168L) * f));
            CallSite callSite7 = hi.a("\u00e9", (Object)dr, (long)599623574744424828L);
            if (!bl) {
                if (hi.a("\u00a5", (Object)dr, (long)871227681734501961L) != false) {
                    callSite7 = hi.a("G", (Object)hi.a("\u00a5", (Object)callSite7, (long)511202903915214145L), (double)(hi.a("\u00a5", (Object)callSite7, (long)790218627852900409L) * d), (double)(hi.a("\u00a5", (Object)callSite7, (long)903099462766898894L) * d), (double)(hi.a("\u00a5", (Object)callSite7, (long)462133279192389617L) * d), (long)1112822372070347233L);
                }
                hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)callSite7, (Object)color, (long)1122650864820283854L);
                hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)callSite7, (Object)color2, (long)454910854240223822L);
            }
            if (!bl) continue;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void k(Object[] var1_1) {
        block95: {
            block97: {
                block96: {
                    var2_2 = Dl.S();
                    var14_3 /* !! */  = eW.c(19313, 427080791261918525L) / eW.c(15119, 7164539058895144795L) - eW.c(28601, 6386525809455173880L) + eW.c(19309, 7283940455881815505L) - eW.c(17553, 2351603971182836812L);
                    if (!var2_2) ** GOTO lbl-1000
                    switch (var14_3 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            hi.a("\u00f2", (Object)this, (double)20.25, (long)595391600233351183L);
                            hi.a("\u00f2", (Object)this, null, (long)985566735315510172L);
                            hi.a("\u00f2", (Object)this, null, (long)884843840457466393L);
                            var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1133521407411179272L);
                            var4_5 = hi.a("G", (double)hi.a("\u00e9", (Object)var3_4, (long)1300412705618690751L), (double)((double)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)516855823746183673L)), (double)hi.a("\u00e9", (Object)var3_4, (long)1282612456329596420L), (long)921489941210881726L);
                            var5_6 = hi.a("\u00a5", (Object)var4_5, (long)918555824711552631L);
                            var6_7 = hi.a("\u00a5", (Object)var4_5, (long)1003954676294969181L);
                            v0 /* !! */  = eW.F("9hlJEIowNbw9SkuG", z(), (eW)this);
                            if (!var2_2) break block96;
                            if (v0 /* !! */  != false) break;
                            break block97;
                        }
                        case 386290885: {
                            throw null;
                        }
                    }
                    v0 /* !! */  = (CallSite)(eW.c(15130, 5257231892577108609L) * eW.c(6624, 4787728143396724887L) + eW.c(19955, 3169077437378835565L));
                }
                var14_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) ** GOTO lbl39
            }
            var14_3 /* !! */  = (hi.a("G", (int)eW.c(10802, 9222318123686516267L), (int)eW.c(21714, 1250447984879478815L), (long)834203424483934088L) * eW.c(20376, 8598722175755597595L) ^ eW.c(2326, 3597118191001530513L)) - eW.c(9578, 5036867632188218196L) - eW.c(17375, 7053492267713609423L);
            if (var2_2) ** GOTO lbl39
            if (true) ** GOTO lbl33
            block50: while (true) {
                block100: {
                    block99: {
                        block98: {
                            v1 /* !! */  = hi.a("\u00a5", (Object)this, (Object)var3_4, (Object)var4_5, (long)871294022731989722L);
                            if (!var2_2) break block98;
                            if (v1 /* !! */  != false) break block99;
lbl33:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(hi.a("G", (int)(eW.c(23595, 979357660351799517L) * eW.c(11268, 5293711723056747231L)), (int)eW.c(12796, 4671135743856987683L), (long)834203424483934088L) ^ eW.c(2014, 1635088323708550843L));
                        }
                        var14_3 /* !! */  = (int)v1 /* !! */ ;
                        if (var2_2) break block100;
                    }
                    var14_3 /* !! */  = eW.c(16892, 8573808699296661486L) ^ eW.c(8220, 4911500496860569398L) ^ eW.c(19743, 4773850989792179700L);
                }
                switch (var14_3 /* !! */ ) {
                    default: {
                        return;
                    }
                    case -1262661529: {
                        continue block50;
                    }
                    case -1262661530: {
                        return;
                    }
                    case -1262661531: {
                        var7_8 = 1;
                        if (var2_2) break block50;
                        break block95;
                    }
                    case -1262661528: {
                        hi.a("G", (long)588120149496418092L);
                        continue block50;
                    }
                }
                break;
            }
            var14_3 /* !! */  = (eW.c(29467, 8997003813096655762L) ^ eW.c(25962, 4509258457289891063L)) / eW.c(24203, 4700334821015005101L) ^ eW.c(15750, 7881462506146481531L);
            if (var2_2) ** GOTO lbl167
            ** GOTO lbl64
        }
lbl59:
        // 2 sources

        while (true) {
            block102: {
                block101: {
                    v2 = var7_8;
                    v3 = eW.c(31764, 6863189154801353676L);
                    if (!var2_2) break block101;
                    if (v2 <= v3) break block102;
lbl64:
                    // 2 sources

                    v2 = eW.c(10177, 2597636387908968081L) + eW.c(31887, 517559166720279161L);
                    v3 = eW.c(6388, 2721882254582540028L);
                }
                var14_3 /* !! */  = v2 - v3;
                if (var2_2) ** GOTO lbl167
            }
            var14_3 /* !! */  = (eW.c(6708, 1871528655169840641L) ^ eW.c(15874, 6164383329555891983L)) + eW.c(20928, 6963423869411470540L);
            if (var2_2) ** GOTO lbl167
            ** GOTO lbl182
            break;
        }
lbl73:
        // 2 sources

        while (true) {
            v4 = var8_9;
            v5 = var7_8;
            if (!var2_2) ** GOTO lbl191
            if (v4 > v5) ** GOTO lbl189
            ** GOTO lbl193
            break;
        }
lbl79:
        // 2 sources

        while (true) {
            hi.a("G", (int)1, (long)1040117516474656258L);
lbl81:
            // 2 sources

            while (true) {
                v6 = var9_10;
                v7 = var7_8 - var8_9;
                if (!var2_2) ** GOTO lbl208
                if (v6 > v7) ** GOTO lbl206
                ** GOTO lbl210
                break;
            }
            break;
        }
lbl87:
        // 2 sources

        while (true) {
            v8 = var11_12;
            v9 = 1;
            if (!var2_2) ** GOTO lbl227
            if (v8 > v9) ** GOTO lbl225
            ** GOTO lbl229
            break;
        }
lbl93:
        // 2 sources

        while (true) {
            v10 = var12_13;
            v11 = 1;
            if (!var2_2) ** GOTO lbl248
            if (v10 > v11) ** GOTO lbl246
            if (true) ** GOTO lbl250
            break;
        }
        block57: while (true) {
            v12 = -var8_9;
            if (var2_2) ** GOTO lbl281
            block58: while (true) {
                block106: {
                    block105: {
                        block104: {
                            block103: {
                                v13 = var5_6 + v12;
                                v14 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)516855823746183673L) - var10_11;
                                if (var12_13 == 0) break block103;
                                var14_3 /* !! */  = eW.c(15965, 7257584580238164588L) + eW.c(7372, 5109858301909558676L) + eW.c(8938, 1014785697984699532L) - eW.c(8941, 4641730607256526120L);
                                if (var2_2) break block104;
                            }
                            var14_3 /* !! */  = (int)(hi.a("G", (int)eW.c(29830, 6719251468841650657L), (int)eW.c(31740, 4706265425929733110L), (long)834203424483934088L) + eW.c(7797, 5037643019947336145L));
                        }
                        switch (var14_3 /* !! */ ) {
                            default: {
                                v15 = var9_10;
                                var14_3 /* !! */  = eW.c(7147, 5330486547776660021L) - eW.c(15552, 7830395155980632426L) + eW.c(32463, 4932505372089025535L);
                                if (!var2_2) {
                                    break;
                                }
                                break block105;
                            }
                            case -1999531746: {
                                v15 = -var9_10;
                                if (var2_2) break;
                                ** GOTO lbl-1000
                            }
                            case -1999531745: {
                                return;
                            }
                        }
                        var14_3 /* !! */  = eW.c(10739, 6988944745610335303L) - eW.c(19616, 6213878618453684647L) + eW.c(13682, 2642920926060890743L);
                    }
                    switch (var14_3 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var13_14 = new BlockPos((int)v13, (int)v14, (int)(var6_7 + v15));
                            eW.F("9hlJEIowNbw9SkuG", t(net.minecraft.world.phys.Vec3 net.minecraft.core.BlockPos ), (eW)this, (Vec3)var3_4, (BlockPos)var13_14);
                            ++var12_13;
                            if (var2_2) break;
                            break block106;
                        }
                        case 1303248279: {
                            throw null;
                        }
                    }
                    var14_3 /* !! */  = (eW.c(29399, 1191361187508063628L) ^ eW.c(28169, 4555540341643645750L) ^ eW.c(23366, 5408982294143772263L)) - eW.c(26674, 736148592480982191L);
                    if (var2_2) ** GOTO lbl251
                    ** GOTO lbl144
                }
                block59: while (true) {
                    block107: {
                        ++var11_12;
                        if (!var2_2) break block107;
lbl144:
                        // 2 sources

                        var14_3 /* !! */  = (int)(hi.a("G", (int)eW.c(24973, 376763120922664952L), (int)eW.c(23954, 3002858662504964665L), (long)834203424483934088L) / eW.c(22434, 1754800183921453428L) / 4 + eW.c(24106, 3741002434631934900L) + eW.c(31843, 4455001585510482745L));
                        if (var2_2) ** GOTO lbl230
                        ** GOTO lbl151
                    }
                    block60: while (true) {
                        block108: {
                            ++var9_10;
                            if (!var2_2) break block108;
lbl151:
                            // 2 sources

                            var14_3 /* !! */  = hi.a("G", (int)(eW.c(23731, 5394662897030243338L) ^ eW.c(8647, 7323155886321950576L)), (int)eW.c(30479, 6629513882784239425L), (long)834203424483934088L) ^ eW.c(32701, 6354104453257496511L);
                            if (var2_2) ** GOTO lbl211
                            ** GOTO lbl158
                        }
                        block61: while (true) {
                            block109: {
                                ++var8_9;
                                if (!var2_2) break block109;
lbl158:
                                // 2 sources

                                var14_3 /* !! */  = eW.c(31257, 3382377727817778421L) / eW.c(23509, 1465630396050449587L) + eW.c(30190, 5334903958149073538L) + eW.c(31420, 6338697372058026887L) - eW.c(13908, 1517928727892510879L);
                                if (var2_2) ** GOTO lbl194
                                ** GOTO lbl166
                            }
                            block62: while (true) {
                                ++var7_8;
                                if (!var2_2) {
                                    return;
                                }
lbl166:
                                // 3 sources

                                var14_3 /* !! */  = (eW.c(5956, 396697416058824926L) ^ eW.c(14452, 563010849533511584L)) / eW.c(24203, 4700334821015005101L) ^ eW.c(9787, 2573583305505562414L);
lbl167:
                                // 4 sources

                                block63: while (true) {
                                    switch (var14_3 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case -1120395218: {
                                            v16 /* !! */  = hi.a("\u00a5", (Object)this, (Object)var3_4, (Object)new BlockPos((int)var5_6, (int)(hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)516855823746183673L) - var7_8), (int)var6_7), (long)871294022731989722L);
                                            if (!var2_2) ** GOTO lbl183
                                            if (v16 /* !! */  == false) ** GOTO lbl182
                                            ** GOTO lbl185
                                        }
                                        case -1120395215: {
                                            var8_9 = 0;
                                            if (var2_2) ** GOTO lbl187
                                            ** GOTO lbl73
                                        }
                                        case -1120395216: {
                                            ** GOTO lbl241
                                        }
lbl182:
                                        // 2 sources

                                        v16 /* !! */  = (CallSite)((eW.c(20444, 8811556427471139078L) + eW.c(18311, 7504358119873951929L)) * eW.c(13809, 8588322322634525062L) - eW.c(24386, 1558706026313851615L) ^ eW.c(18515, 5232672338571048112L));
lbl183:
                                        // 2 sources

                                        var14_3 /* !! */  = (int)v16 /* !! */ ;
                                        if (var2_2) continue block63;
lbl185:
                                        // 2 sources

                                        var14_3 /* !! */  = (eW.c(31174, 2863333717067006091L) + eW.c(31228, 6603396532816347340L)) * eW.c(32436, 112086287628404681L) / eW.c(26580, 7334190056549652576L) / eW.c(25900, 2887432114424388876L) + eW.c(7355, 4193805169514243175L);
                                        continue block63;
lbl187:
                                        // 1 sources

                                        var14_3 /* !! */  = eW.c(31718, 6053761844819755656L) / eW.c(23509, 1465630396050449587L) + eW.c(13246, 6763118410740944485L) + eW.c(13173, 8754796983915432635L) - eW.c(25434, 7827009619036347000L);
                                        if (var2_2) ** GOTO lbl194
lbl189:
                                        // 2 sources

                                        v4 = (eW.c(3039, 4845814373024297985L) ^ eW.c(2853, 698216758161470948L)) * eW.c(17846, 560333129460104094L) - eW.c(17557, 7879154884457643079L);
                                        v5 = eW.c(29658, 3025503845085842444L);
lbl191:
                                        // 2 sources

                                        var14_3 /* !! */  = v4 + v5;
                                        if (var2_2) ** GOTO lbl194
lbl193:
                                        // 2 sources

                                        var14_3 /* !! */  = (int)(eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(5155, 1840011886119479929L), (int)eW.c(8786, 3181770443192327034L)) - eW.c(9481, 461846758651812529L) - eW.c(18405, 8911751740884434630L) - eW.c(5552, 8303561120894119212L));
lbl194:
                                        // 4 sources

                                        switch (var14_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case 1395354312: {
                                                var9_10 = 0;
                                                if (var2_2) ** GOTO lbl204
                                                ** GOTO lbl79
                                            }
                                            case 1395354314: {
                                                continue block62;
                                            }
lbl204:
                                            // 1 sources

                                            var14_3 /* !! */  = hi.a("G", (int)(eW.c(13882, 7980493391857012388L) ^ eW.c(9399, 155773108400872959L)), (int)eW.c(9136, 8870887497289326467L), (long)834203424483934088L) ^ eW.c(24507, 4765518132281385399L);
                                            if (var2_2) ** GOTO lbl211
lbl206:
                                            // 2 sources

                                            v6 = eW.c(7351, 4941237024432743656L) / eW.c(11040, 7117522510885967068L) + eW.c(22123, 2038912521139202386L) - eW.c(30309, 5696074243384019661L);
                                            v7 = eW.c(8127, 6468653586203632309L);
lbl208:
                                            // 2 sources

                                            var14_3 /* !! */  = v6 ^ v7;
                                            if (var2_2) ** GOTO lbl211
lbl210:
                                            // 2 sources

                                            var14_3 /* !! */  = hi.a("G", (int)(eW.c(7316, 393129339544691818L) + eW.c(8529, 923637168684818305L)), (int)eW.c(30246, 4480651216516745249L), (long)834203424483934088L) + eW.c(30502, 2931350977384090213L) + eW.c(32168, 750127352900387379L) ^ eW.c(4147, 8469710049543450126L);
lbl211:
                                            // 4 sources

                                            switch (var14_3 /* !! */ ) {
                                                case 638869141: {
                                                    ** continue;
                                                }
                                                default: {
                                                    ** continue;
                                                }
                                                case 638869139: {
                                                    var10_11 = var7_8 - var8_9 - var9_10;
                                                    var11_12 = 0;
                                                    if (var2_2) break;
                                                    ** GOTO lbl87
                                                }
                                                case 638869142: {
                                                    continue block61;
                                                }
                                            }
                                            var14_3 /* !! */  = (int)(eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(11886, 8174287985674244173L), (int)eW.c(32431, 224903088069083383L)) / eW.c(22434, 1754800183921453428L) / 4 + eW.c(22248, 4877133065890310928L) + eW.c(6851, 3598780823863059158L));
                                            if (var2_2) ** GOTO lbl230
lbl225:
                                            // 2 sources

                                            v8 = eW.c(18644, 8679704534854448932L) + eW.c(15578, 5379531916837995748L);
                                            v9 = eW.c(14897, 1710688263270286020L);
lbl227:
                                            // 2 sources

                                            var14_3 /* !! */  = v8 + v9;
                                            if (var2_2) ** GOTO lbl230
lbl229:
                                            // 2 sources

                                            var14_3 /* !! */  = (eW.c(26334, 2439057944133408834L) ^ eW.c(10611, 5808211424915968330L) ^ eW.c(5040, 7147736489022384873L)) - eW.c(29959, 8345520676843850241L);
lbl230:
                                            // 4 sources

                                            switch (var14_3 /* !! */ ) {
                                                default: {
                                                    ** continue;
                                                }
                                                case 1323108734: {
                                                    var12_13 = 0;
                                                    if (var2_2) ** GOTO lbl244
                                                    ** GOTO lbl93
                                                }
                                                case 1323108733: {
                                                    continue block60;
                                                }
                                                case 1323108736: 
                                            }
                                            case 1395354311: 
                                        }
lbl241:
                                        // 3 sources

                                        hi.a("G", (long)1296298356484719498L);
                                        return;
lbl244:
                                        // 1 sources

                                        var14_3 /* !! */  = (eW.c(16506, 5957976386973646548L) ^ eW.c(8590, 5275810476075637189L) ^ eW.c(15578, 2126797992375271848L)) - eW.c(15801, 8036555052230133205L);
                                        if (var2_2) ** GOTO lbl251
lbl246:
                                        // 2 sources

                                        v10 = (eW.c(8213, 3614033967326682961L) / eW.c(22434, 1754800183921453428L) - eW.c(15438, 5949184602403750287L)) / eW.c(24203, 4700334821015005101L);
                                        v11 = eW.c(24513, 4152794215848093320L);
lbl248:
                                        // 2 sources

                                        var14_3 /* !! */  = v10 + v11;
                                        if (var2_2) ** GOTO lbl251
lbl250:
                                        // 2 sources

                                        var14_3 /* !! */  = eW.c(10005, 5641530691276298920L) - eW.c(8622, 9147476642794921120L) ^ eW.c(8752, 2239087697206533494L);
lbl251:
                                        // 4 sources

                                        switch (var14_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -1750885908: {
                                                if (var11_12 != 0) break;
                                                ** GOTO lbl265
                                            }
                                            case -1750885907: {
                                                continue block59;
                                            }
                                            case -1750885910: {
                                                eW.F("9hlJEIowNbw9SkuG", C(double double ), (double)-1.0, (double)1.0);
                                                return;
                                            }
                                        }
                                        var14_3 /* !! */  = (eW.c(4139, 2633232961365438307L) ^ eW.c(18388, 8786436579901126951L) ^ eW.c(14029, 2694850632256506100L)) * eW.c(17071, 4936405954179709562L) ^ eW.c(8389, 428177390143200971L);
                                        if (var2_2) ** GOTO lbl266
lbl265:
                                        // 2 sources

                                        var14_3 /* !! */  = (eW.c(19844, 4765799407827693963L) * eW.c(6497, 6861653810584512008L) - eW.c(21634, 1105224250401107055L)) * eW.c(15983, 2694397112162664532L) ^ eW.c(27207, 4023957649694692116L);
lbl266:
                                        // 2 sources

                                        switch (var14_3 /* !! */ ) {
                                            default: {
                                                v12 = var8_9;
                                                var14_3 /* !! */  = (hi.a("G", (int)eW.c(9763, 204430420565057486L), (int)eW.c(8559, 7676629993491127512L), (long)834203424483934088L) / eW.c(8727, 1779277036266675306L) ^ eW.c(19254, 7529543166508610330L)) / 4 + eW.c(9448, 1230781887443065658L);
                                                if (!var2_2) {
                                                    break;
                                                }
                                                ** GOTO lbl282
                                            }
                                            case -1194966075: {
                                                hi.a("G", (long)980472709099540277L);
                                                eW.F("9hlJEIowNbw9SkuG", values());
                                                continue block57;
                                            }
                                            case -1194966074: {
                                                continue block57;
                                            }
                                        }
lbl281:
                                        // 2 sources

                                        var14_3 /* !! */  = (hi.a("G", (int)eW.c(4409, 7116645683906965483L), (int)eW.c(28278, 880635689004111537L), (long)834203424483934088L) / eW.c(8727, 1779277036266675306L) ^ eW.c(6687, 3520962651179181156L)) / 4 + eW.c(19432, 3229221296498717761L);
lbl282:
                                        // 2 sources

                                        switch (var14_3 /* !! */ ) {
                                            default: {
                                                continue block58;
                                            }
                                            case 639142194: 
                                        }
                                        hi.a("G", (long)1296298356484719498L);
                                        return;
                                        case -1120395214: {
                                            return;
                                        }
                                        case -1120395217: 
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
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
    @yE
    private void S(dQ var1_1) {
        block19: {
            block22: {
                block18: {
                    block17: {
                        block21: {
                            block20: {
                                var2_2 = Dl.t();
                                var5_3 = hi.a("G", (int)(eW.c(15217, 6268064849275273911L) - eW.c(32292, 4033602466014397411L)), (int)eW.c(928, 2635490652884368272L), (long)834203424483934088L) + eW.c(24903, 2057638484557568075L) + eW.c(15594, 996548172655510166L);
                                if (var2_2) ** GOTO lbl-1000
                                switch (var5_3) {
                                    default: lbl-1000:
                                    // 2 sources

                                    {
                                        var4_4 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L);
                                        v0 = var4_4 instanceof ServerboundUseItemPacket;
                                        if (var2_2) break block20;
                                        if (v0 == 0) break;
                                        break block21;
                                    }
                                    case -197302614: {
                                        hi.a("G", (float)0.0f, (float)10.0f, (long)443772702353985914L);
                                        hi.a("G", (long)487733742417394326L);
                                        return;
                                    }
                                }
                                v0 = eW.c(7528, 1589598927972229235L) * eW.c(3297, 5789520549925712226L) / eW.c(25900, 2887432114424388876L) + eW.c(3369, 6897201664440497181L) ^ eW.c(2, 8221909582894399323L);
                            }
                            var5_3 = (reference)v0;
                            if (!var2_2) break block19;
                        }
                        var5_3 = (reference)((eW.c(4920, 7548905890579312055L) * eW.c(943, 3272076252633202585L) ^ eW.c(6178, 1166541591537180738L)) - eW.c(26008, 3388261984697227659L));
                        block14: while (true) {
                            switch (var5_3) {
                                default: {
                                    var3_5 = (ServerboundUseItemPacket)var4_4;
                                    var4_4 = eW.F("9hlJEIowNbw9SkuG", getItemInHand(net.minecraft.world.InteractionHand ), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (InteractionHand)hi.a("\u00a5", (Object)var3_5, (long)529859688516141319L));
                                    v1 = hi.a("\u00a5", (Object)var4_4, (Object)hi.a("j", (long)832725519788462997L), (long)484703308447361578L);
                                    if (var2_2) break block17;
                                    if (v1 != false) break block14;
                                    break block18;
                                }
                                case -685559171: {
                                    hi.a("G", (float)-1.0f, (long)542180438698619312L);
                                    var5_3 = (reference)((hi.a("G", (int)eW.c(7892, 8106603695313576213L), (int)eW.c(11077, 2092557616994277123L), (long)834203424483934088L) ^ eW.c(31112, 5339320296822310242L)) + eW.c(26228, 5729310423167342829L));
                                    if (!var2_2) {
                                        continue block14;
                                    }
                                    break block19;
                                }
                            }
                            break;
                        }
                        v1 = var5_3 = (reference)(eW.c(2105, 465331728661378097L) + eW.c(7418, 5939833449895716207L) + eW.c(3526, 1516930016324711301L));
                    }
                    if (!var2_2) break block22;
                }
                var5_3 = (reference)((eW.c(26241, 7704205130149599283L) + eW.c(32677, 6271319463559103430L)) * eW.c(9870, 5626459098369514385L) / eW.c(705, 1190033084118400856L) + eW.c(19479, 1822387580735731127L));
                if (var2_2) ** GOTO lbl66
            }
            block15: do lbl-1000:
            // 3 sources

            {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                block23: {
                                    switch (var5_3) {
                                        default: {
                                            v2 = hi.a("\u00a5", (Object)var4_4, (long)675687955611242108L);
                                            if (var2_2) break block23;
                                            if (v2 == false) break;
                                            break block24;
                                        }
                                        case 288267189: {
                                            v3 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)686691195801221584L), (Object)hi.a("\u00a5", (Object)hi.a("j", (long)832725519788462997L), (long)430851306237619580L), (long)1036576191360399282L);
                                            if (var2_2) break block25;
                                            if (v3 == false) break block26;
                                            break block27;
                                        }
                                        case 288267190: {
                                            hi.a("\u00f2", (Object)this, (boolean)true, (long)468704053310521345L);
                                            if (!var2_2) break block15;
                                            return;
                                        }
                                        case 288267192: {
                                            throw null;
                                        }
                                    }
lbl66:
                                    // 2 sources

                                    v2 = var5_3 = (reference)(eW.c(26226, 248004544769661199L) * eW.c(32369, 3399363283990938278L) / eW.c(25900, 2887432114424388876L) + eW.c(2240, 8860212440557515904L) ^ eW.c(10330, 7711569299460018449L));
                                }
                                if (!var2_2) break block19;
                            }
                            var5_3 = hi.a("G", (int)(eW.c(29990, 6638588497962339627L) + eW.c(32440, 7363777253177622867L)), (int)eW.c(16055, 7356701245078684048L), (long)834203424483934088L) / eW.c(31764, 6863189154801353676L) / 3 - eW.c(25167, 1757605656189672512L);
                            if (!var2_2) ** GOTO lbl-1000
                        }
                        v3 = var5_3 = (reference)(eW.c(26226, 248004544769661199L) * eW.c(32369, 3399363283990938278L) / eW.c(25900, 2887432114424388876L) + eW.c(2240, 8860212440557515904L) ^ eW.c(10330, 7711569299460018449L));
                    }
                    if (!var2_2) break block19;
                }
                var5_3 = (reference)(eW.c(18471, 1760966488828195263L) + eW.c(6045, 8736502747441852160L) + eW.c(21890, 1508009850431121915L));
            } while (!var2_2);
            var5_3 = (reference)(eW.c(26226, 248004544769661199L) * eW.c(32369, 3399363283990938278L) / eW.c(25900, 2887432114424388876L) + eW.c(2240, 8860212440557515904L) ^ eW.c(10330, 7711569299460018449L));
        }
        switch (var5_3) {
            default: {
                return;
            }
            case -1011451197: 
        }
        throw null;
    }

    private eW() {
        super(eW.b(-16462, -4420), (vY)((Object)hi.a("j", (long)456237291118568391L)));
        Block[] blockArray = new Block[eW.c(12169, 8633664347491127409L)];
        blockArray[0] = hi.a("j", (long)1169697892110545896L);
        blockArray[1] = hi.a("j", (long)898724735523943778L);
        blockArray[2] = hi.a("j", (long)660192093904994570L);
        blockArray[3] = hi.a("j", (long)1173773611913828053L);
        blockArray[4] = hi.a("j", (long)851046977432255552L);
        blockArray[5] = hi.a("j", (long)363349036204362894L);
        blockArray[eW.c((int)31764, (long)6863189154801353676L)] = hi.a("j", (long)443994101585536672L);
        blockArray[eW.c((int)15119, (long)7164539058895144795L)] = hi.a("j", (long)418596069964505966L);
        blockArray[eW.c((int)8727, (long)1779277036266675306L)] = hi.a("j", (long)531685650367946780L);
        blockArray[eW.c((int)705, (long)1190033084118400856L)] = hi.a("j", (long)573397457859921139L);
        blockArray[eW.c((int)23509, (long)1465630396050449587L)] = hi.a("j", (long)686877768027849949L);
        blockArray[eW.c((int)26580, (long)7334190056549652576L)] = hi.a("j", (long)1092255920477751542L);
        blockArray[eW.c((int)25900, (long)2887432114424388876L)] = hi.a("j", (long)1209140392040401791L);
        blockArray[eW.c((int)28797, (long)956974345806449854L)] = hi.a("j", (long)696340380304019570L);
        blockArray[eW.c((int)15287, (long)4391928138228516140L)] = hi.a("j", (long)694622495755240452L);
        blockArray[eW.c((int)32689, (long)2231170359830577284L)] = hi.a("j", (long)896257828504110610L);
        blockArray[eW.c((int)24203, (long)4700334821015005101L)] = hi.a("j", (long)1319559131953185053L);
        blockArray[eW.c((int)28280, (long)3788344432096580003L)] = hi.a("j", (long)461938134506948982L);
        blockArray[eW.c((int)20341, (long)3367379194905932477L)] = hi.a("j", (long)644065802223130297L);
        blockArray[eW.c((int)5323, (long)1114227664493505931L)] = hi.a("j", (long)928681664285871549L);
        blockArray[eW.c((int)3073, (long)7612649336696401962L)] = hi.a("j", (long)911846036469730568L);
        blockArray[eW.c((int)13510, (long)559230148085893234L)] = hi.a("j", (long)1097654185112664546L);
        blockArray[eW.c((int)8837, (long)7778717840885963943L)] = hi.a("j", (long)967551618591194278L);
        blockArray[eW.c((int)18950, (long)396730100606710392L)] = hi.a("j", (long)618835658842314134L);
        blockArray[eW.c((int)6884, (long)4796508865969808577L)] = hi.a("j", (long)439541671078786774L);
        blockArray[eW.c((int)28647, (long)7936210180371583528L)] = hi.a("j", (long)380985543603591094L);
        blockArray[eW.c((int)20915, (long)4716939105129244770L)] = hi.a("j", (long)1323532595079436731L);
        blockArray[eW.c((int)3477, (long)707922531020305592L)] = hi.a("j", (long)607076523733980778L);
        blockArray[eW.c((int)9952, (long)6972533147913050191L)] = hi.a("j", (long)483913023078133907L);
        blockArray[eW.c((int)988, (long)4309973593819413054L)] = hi.a("j", (long)721129788130286989L);
        blockArray[eW.c((int)28273, (long)1007160247403222011L)] = hi.a("j", (long)776931456979385243L);
        blockArray[eW.c((int)25446, (long)5859395623641325080L)] = hi.a("j", (long)900827065102581385L);
        blockArray[eW.c((int)16921, (long)6372809509980978376L)] = hi.a("j", (long)387979104499917622L);
        blockArray[eW.c((int)27924, (long)8674273580278879623L)] = hi.a("j", (long)707486285922074725L);
        blockArray[eW.c((int)5333, (long)2902216490194135289L)] = hi.a("j", (long)698927342253240366L);
        blockArray[eW.c((int)19780, (long)1540640019451393476L)] = hi.a("j", (long)385874600954788561L);
        blockArray[eW.c((int)11715, (long)7278111952133313068L)] = hi.a("j", (long)1246808143812907089L);
        blockArray[eW.c((int)16428, (long)6848355501968604453L)] = hi.a("j", (long)1298858909206532011L);
        blockArray[eW.c((int)1617, (long)1410430866971983871L)] = hi.a("j", (long)1172072649967891401L);
        blockArray[eW.c((int)25366, (long)6118842248816270723L)] = hi.a("j", (long)367234782356911518L);
        blockArray[eW.c((int)16991, (long)2349110334397201586L)] = hi.a("j", (long)1002420679480783354L);
        blockArray[eW.c((int)4074, (long)4027693605544588871L)] = hi.a("j", (long)481356316423409617L);
        blockArray[eW.c((int)7810, (long)6736387254269797167L)] = hi.a("j", (long)1004347683734123504L);
        blockArray[eW.c((int)25158, (long)1970782425564224156L)] = hi.a("j", (long)1314104233469158520L);
        blockArray[eW.c((int)10489, (long)4871883893401800723L)] = hi.a("j", (long)923667716772460884L);
        blockArray[eW.c((int)18603, (long)5416484221953028143L)] = hi.a("j", (long)1285107510001261586L);
        blockArray[eW.c((int)15388, (long)8046487651919053519L)] = hi.a("j", (long)952949076318084994L);
        blockArray[eW.c((int)5907, (long)1956075185463290138L)] = hi.a("j", (long)1298625911374123789L);
        Object[] objectArray = new Object[2];
        objectArray[1] = hi.a("G", (Object)blockArray, (long)766237327738552430L);
        objectArray[0] = eW.b(-16480, 31369);
        this.D = hi.a("\u00a5", (Object)this, (Object)objectArray, (long)586128146662837186L);
        this.d = hi.a("\u00a5", (Object)this, (Object)eW.b(-16475, -31118), (boolean)false, (long)1230617056439551805L);
        this.y = hi.a("\u00a5", (Object)this, (Object)eW.b(-16469, -17023), (Object)hi.a("j", (long)714402968882141522L), (long)426795652261052192L);
        this.F = hi.a("\u00a5", (Object)this, (Object)eW.b(-16461, -8215), (Object)hi.a("j", (long)1053585327047994841L), (long)426795652261052192L);
        this.E = hi.a("\u00a5", (Object)this, (Object)eW.b(-16467, -20393), (boolean)true, this::lambda$new$2, (long)1197648209052129808L);
        this.P = hi.a("\u00a5", (Object)this, (Object)eW.b(-16465, 1159), (boolean)false, this::lambda$new$3, (long)1197648209052129808L);
        this.h = hi.a("\u00a5", (Object)this, (Object)eW.b(-16470, 7831), (boolean)false, (long)1230617056439551805L);
        this.o = eW.F("9hlJEIowNbw9SkuG", J(java.lang.String E ), (eW)this, (String)eW.b(-16468, -21110), (Enum)((Object)hi.a("j", (long)1208190623198428012L)));
        this.O = eW.F("9hlJEIowNbw9SkuG", J(java.lang.String E ), (eW)this, (String)eW.b(-16477, -9822), (Enum)((Object)hi.a("j", (long)585759406572355802L)));
        this.B = hi.a("\u00a5", (Object)this, (Object)eW.b(-16458, -2566), (int)eW.c(24108, 4292085506448793733L), (int)eW.c(23509, 1465630396050449587L), (int)eW.c(11279, 6750374163521654989L), (int)eW.c(23509, 1465630396050449587L), this::lambda$new$4, (long)958246524790962697L);
        this.q = hi.a("\u00a5", (Object)this, (Object)eW.b(-16473, 5906), (int)eW.c(12590, 6860765429073202567L), (int)eW.c(23509, 1465630396050449587L), (int)eW.c(6273, 2888123931160502414L), (int)eW.c(23509, 1465630396050449587L), this::lambda$new$5, (long)958246524790962697L);
        this.Q = hi.a("\u00a5", (Object)this, (Object)eW.b(-16460, -16016), (int)eW.c(6273, 2888123931160502414L), (int)eW.c(23509, 1465630396050449587L), (int)eW.c(6273, 2888123931160502414L), (int)eW.c(23509, 1465630396050449587L), this::lambda$new$6, (long)958246524790962697L);
        this.t = eW.F("9hlJEIowNbw9SkuG", m(java.lang.String int int int int com.github.epsilon.yx ), (eW)this, (String)eW.b(-16472, 21064), (int)1, (int)0, (int)eW.c(31764, 6863189154801353676L), (int)1, this::lambda$new$7);
        this.C = hi.a("\u00a5", (Object)this, (Object)eW.b(-16476, 14355), (boolean)true, (long)1230617056439551805L);
        this.u = hi.a("\u00a5", (Object)this, (Object)eW.b(-16474, 12495), (boolean)true, (long)1230617056439551805L);
        String string = eW.b(-16459, 29116);
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)561568277276180739L);
        hi.a("G", (Object)callSite, (long)374764797691957710L);
        this.v = hi.a("\u00a5", (Object)this, (Object)string, (boolean)true, ((Xn)((Object)callSite))::z, (long)1197648209052129808L);
        this.k = hi.a("\u00a5", (Object)this, (Object)eW.b(-16464, -31522), (int)eW.c(29578, 8797398509424053358L), (int)0, (int)eW.c(5556, 773555215549426185L), (int)eW.c(11568, 3563980672674616562L), this::lambda$new$8, (long)958246524790962697L);
        String string2 = eW.b(-16479, 25097);
        CallSite callSite2 = hi.a("\u00e9", (Object)this, (long)561568277276180739L);
        hi.a("G", (Object)callSite2, (long)374764797691957710L);
        this.M = hi.a("\u00a5", (Object)this, (Object)string2, (boolean)false, ((Xn)((Object)callSite2))::z, (long)1197648209052129808L);
        String string3 = eW.b(-16478, 22505);
        Color color = new Color(eW.c(24234, 1462826338391271412L), eW.c(30292, 441021148530839162L), eW.c(18395, 6301290558315313530L), eW.c(17961, 7146330177307852412L));
        CallSite callSite3 = hi.a("\u00e9", (Object)this, (long)561568277276180739L);
        eW.F("9hlJEIowNbw9SkuG", requireNonNull(T ), (Object)callSite3);
        this.N = hi.a("\u00a5", (Object)this, (Object)string3, (Object)color, ((Xn)((Object)callSite3))::z, (long)1241661680830497550L);
        String string4 = eW.b(-16466, -4046);
        Color color2 = new Color(eW.c(16686, 5556511807730300993L), eW.c(19660, 2597960453620019370L), eW.c(6273, 2888123931160502414L));
        CallSite callSite4 = hi.a("\u00e9", (Object)this, (long)561568277276180739L);
        hi.a("G", (Object)callSite4, (long)374764797691957710L);
        this.J = hi.a("\u00a5", (Object)this, (Object)string4, (Object)color2, ((Xn)((Object)callSite4))::z, (long)1241661680830497550L);
        hi.a("\u00f2", (Object)this, (int)0, (long)1204100870201044002L);
        hi.a("\u00f2", (Object)this, (double)20.25, (long)595391600233351183L);
        this.l = new ArrayList<Dr>();
        hi.a("\u00a5", (Object)hi.a("j", (long)519102950410566293L), (Object)new Object[]{new gD<d9>(d9.class, this::lambda$new$0)}, (long)603602610752793215L);
    }

    private boolean lambda$new$6() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)424948845096568270L), (Object)hi.a("j", (long)714402968882141522L), (long)511460060498514638L);
    }

    /*
     * Exception decompiling
     */
    private void j(Object[] var1_1) {
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

    private boolean lambda$new$7() {
        return (boolean)eW.F("9hlJEIowNbw9SkuG", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)424948845096568270L)), (Enum)((Object)hi.a("j", (long)714402968882141522L)));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean S(Object[] var1_1) {
        block17: {
            block16: {
                block15: {
                    var2_2 = Dl.t();
                    var3_3 /* !! */  = eW.c(22832, 6671308058100901380L) / eW.c(31764, 6863189154801353676L) + eW.c(19458, 3622005498904850507L);
                    if (!var2_2) break block15;
lbl5:
                    // 2 sources

                    while (true) {
                        block19: {
                            block18: {
                                v0 = hi.a("\u00a5", (Object)this, (long)1099153674733698693L);
                                if (var2_2) break block18;
                                if (v0 != false) break block19;
                                v0 = hi.a("G", (int)eW.c(16207, 485559395176333995L), (int)eW.c(29712, 3842560635489946785L), (long)834203424483934088L) + eW.c(13708, 2855088464393783502L);
                            }
                            var3_3 /* !! */  = (int)v0;
                            if (!var2_2) break block15;
                        }
                        var3_3 /* !! */  = eW.c(5546, 7520089846966052874L) + eW.c(20367, 8491524798432195237L) ^ eW.c(11614, 3827918014584574606L);
                        if (!var2_2) break block15;
                        ** GOTO lbl47
                        break;
                    }
lbl17:
                    // 2 sources

                    while (true) {
                        v1 = false;
                        if (var2_2) {
                            return v1;
                        }
                        break block16;
                        break;
                    }
                }
                block11: while (true) {
                    block21: {
                        block20: {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 1553987562: {
                                    v2 = hi.a("\u00e9", (Object)this, (long)1145101457761299088L);
                                    if (var2_2) break block20;
                                    if (v2 == false) break;
                                    break block21;
                                }
                                case 1553987561: {
                                    v1 = true;
                                    var3_3 /* !! */  = eW.c(16645, 2305343076344216810L) / eW.c(705, 1190033084118400856L) ^ eW.c(3671, 1758855895886557266L);
                                    if (var2_2) {
                                        break block11;
                                    }
                                    break block17;
                                }
                                case 1553987560: {
                                    ** GOTO lbl17
                                }
                                case 1553987559: {
                                    hi.a("G", (float)2.0f, (long)542180438698619312L);
                                    hi.a("G", (long)838624670787528729L);
                                    ** continue;
                                }
                            }
lbl47:
                            // 2 sources

                            v2 = hi.a("G", (int)eW.c(903, 7334706589174038339L), (int)eW.c(12580, 7939708459023058994L), (long)834203424483934088L) + eW.c(20081, 570525410812868330L);
                        }
                        var3_3 /* !! */  = (int)v2;
                        if (!var2_2) continue;
                    }
                    var3_3 /* !! */  = (hi.a("G", (int)hi.a("G", (int)eW.c(3652, 3465624714907316907L), (int)eW.c(8180, 3897985608325161420L), (long)834203424483934088L), (int)eW.c(16113, 7052046726921175351L), (long)834203424483934088L) + eW.c(29233, 2910140095847403311L) ^ eW.c(25974, 3444271288347138317L)) - eW.c(13361, 3398045439187144051L);
                }
            }
            var3_3 /* !! */  = eW.c(35, 4603918945309228592L) / eW.c(705, 1190033084118400856L) ^ eW.c(27796, 8951574520380888319L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v1;
            }
            case -1643507791: 
        }
        hi.a("G", (long)1033419646183286307L);
        return (boolean)hi.a("G", (int)eW.c(23509, 1465630396050449587L), (long)1235507535267189928L);
    }

    public static /* bridge */ /* synthetic */ CallSite F(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Exception decompiling
     */
    private void c(Object[] var1_1) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void v(Object[] var1_1) {
        block50: {
            block54: {
                block52: {
                    block53: {
                        block69: {
                            block68: {
                                block51: {
                                    block49: {
                                        var2_2 = Dl.S();
                                        var4_3 /* !! */  = eW.c(19817, 4002804206281863931L) / eW.c(20349, 8278065731534893624L) / 2 - eW.c(8843, 6166519657326926515L) - eW.c(3427, 1891457068377633221L);
                                        if (var2_2) break block49;
lbl5:
                                        // 2 sources

                                        while (true) {
                                            block56: {
                                                block55: {
                                                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)412409060139490357L);
                                                    if (!var2_2) break block55;
                                                    if (v0 /* !! */  != false) break block56;
                                                    v0 /* !! */  = (CallSite)(eW.c(27104, 8135760181832783836L) / eW.c(14097, 1424695784237124600L) - eW.c(1822, 2784950767794027023L) + eW.c(31576, 5367888042297524863L));
                                                }
                                                var4_3 /* !! */  = (int)v0 /* !! */ ;
                                                if (var2_2) break block49;
                                            }
                                            var4_3 /* !! */  = hi.a("G", (int)eW.c(19441, 8397414867203568244L), (int)eW.c(5919, 5302964765013830474L), (long)834203424483934088L) - eW.c(2474, 2077670047280820558L) + eW.c(2634, 7163465539397022507L) ^ eW.c(30013, 657331837461891639L);
                                            if (var2_2) break block49;
                                            ** GOTO lbl105
                                            break;
                                        }
lbl17:
                                        // 2 sources

                                        while (true) {
                                            block57: {
                                                var3_4 /* !! */  = (CallSite)v1;
                                                if (!var2_2) break block57;
                                                var4_3 /* !! */  = (int)(hi.a("G", (int)(eW.c(5945, 2789753331492089365L) + eW.c(25688, 2311192362055245046L) + eW.c(9179, 5828173117494057745L) ^ eW.c(16476, 476289170777390099L)), (int)eW.c(8063, 725529330424143904L), (long)834203424483934088L) + eW.c(26486, 3221685580079405580L));
                                                if (var2_2) break block50;
                                                ** GOTO lbl28
                                            }
lbl24:
                                            // 2 sources

                                            while (true) {
                                                block59: {
                                                    block58: {
                                                        v2 = eW.F("9hlJEIowNbw9SkuG", i(E ), (Dx)hi.a("\u00e9", (Object)this, (long)1115721325559177674L), (Enum)hi.a("j", (long)792803114442146796L));
                                                        if (!var2_2) break block58;
                                                        if (v2 != false) break block59;
lbl28:
                                                        // 2 sources

                                                        v2 = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)(eW.c(2863, 3075453869955019455L) + eW.c(8050, 4397668592557351855L) + eW.c(16680, 1188058735462136087L) ^ eW.c(25729, 2245200265571802466L)), (int)eW.c(22892, 1617786945813390531L)) + eW.c(3883, 5827619885011399280L);
                                                    }
                                                    var4_3 /* !! */  = (int)v2;
                                                    if (var2_2) break block50;
                                                }
                                                var4_3 /* !! */  = (eW.c(29121, 5451484536693590196L) - eW.c(431, 2597609216480705833L)) / 3 - eW.c(12410, 246923744937232389L) ^ eW.c(31733, 4102711896217060294L);
                                                if (var2_2) break block50;
                                                ** GOTO lbl222
                                                break;
                                            }
lbl36:
                                            // 2 sources

                                            while (true) {
                                                block60: {
                                                    var3_4 /* !! */  = hi.a("\u00a5", (Object)v3, (long)1260538186742955956L);
                                                    if (!var2_2) break block60;
                                                    var4_3 /* !! */  = (int)(hi.a("G", (int)(eW.c(2863, 3075453869955019455L) + eW.c(8050, 4397668592557351855L) + eW.c(16680, 1188058735462136087L) ^ eW.c(25729, 2245200265571802466L)), (int)eW.c(22892, 1617786945813390531L), (long)834203424483934088L) + eW.c(3883, 5827619885011399280L));
                                                    if (var2_2) break block50;
                                                    ** GOTO lbl53
                                                }
lbl43:
                                                // 2 sources

                                                while (true) {
                                                    block62: {
                                                        block61: {
                                                            v4 = new Object[2];
                                                            v4[1] = (double)var3_4 /* !! */ ;
                                                            v4[0] = hi.a("\u00e9", (Object)this, (long)682778962666815526L);
                                                            hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)v4, (long)1187190564022460656L);
                                                            v5 /* !! */  = hi.a("\u00e9", (Object)this, (long)899543353537815653L);
                                                            v6 /* !! */  = hi.a("\u00a5", (Object)((Integer)eW.F("9hlJEIowNbw9SkuG", z(), (XG)hi.a("\u00e9", (Object)this, (long)580294320352016076L))), (long)1260538186742955956L);
                                                            if (!var2_2) break block61;
                                                            if (v5 /* !! */  > v6 /* !! */ ) break block62;
lbl53:
                                                            // 2 sources

                                                            v5 /* !! */  = (CallSite)((eW.c(17208, 5502174203810299219L) - eW.c(2734, 5987011587998937839L) - eW.c(8908, 4354772124842252939L) - eW.c(20852, 4460348933657505746L)) / eW.c(8727, 1779277036266675306L));
                                                            v6 /* !! */  = (CallSite)eW.c(13001, 3850472969239874606L);
                                                        }
                                                        var4_3 /* !! */  = (int)(v5 /* !! */  - v6 /* !! */ );
                                                        if (var2_2) break block50;
                                                    }
                                                    var4_3 /* !! */  = eW.c(294, 5583973724100886089L) / eW.c(15119, 7164539058895144795L) * eW.c(26393, 5178846349915233938L) ^ eW.c(5322, 9109232260411517551L);
                                                    if (var2_2) break block50;
                                                    ** GOTO lbl66
                                                    break;
                                                }
lbl62:
                                                // 2 sources

                                                while (true) {
                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)848782481930292225L);
                                                    if (!var2_2) {
                                                        return;
                                                    }
lbl66:
                                                    // 3 sources

                                                    var4_3 /* !! */  = (eW.c(2680, 8166803080236364920L) - eW.c(16434, 1595565116058517150L) - eW.c(5067, 482071558207007375L) - eW.c(15356, 262610647102408335L)) / eW.c(8727, 1779277036266675306L) - eW.c(4476, 2300298315511230033L);
                                                    break block50;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    block38: while (true) {
                                        block67: {
                                            block65: {
                                                block66: {
                                                    block64: {
                                                        block63: {
                                                            switch (var4_3 /* !! */ ) {
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case 84161733: {
                                                                    cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)445553535294575111L) - 0.0f;
                                                                    v7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                    if (!var2_2) break block63;
                                                                    if (v7 != false) break;
                                                                    break block64;
                                                                }
                                                                case 84161735: {
                                                                    cfr_temp_1 = hi.a("\u00e9", (Object)this, (long)744563942973792377L) - 0.0f;
                                                                    v8 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                                                    if (!var2_2) break block65;
                                                                    if (v8 /* !! */  == false) break block66;
                                                                    break block67;
                                                                }
                                                                case 84161734: {
                                                                    v9 = hi.a("j", (long)1054285254962319361L);
                                                                    v10 = hi.a("\u00e9", (Object)this, (long)375925297147054743L);
                                                                    if (hi.a("\u00e9", (Object)this, (long)682778962666815526L) != null) break block38;
                                                                    break block51;
                                                                }
                                                                case 84161737: {
                                                                    v11 = new Object[2];
                                                                    v11[1] = hi.a("\u00e9", (Object)this, (long)884843840457466393L);
                                                                    v11[0] = hi.a("\u00e9", (Object)this, (long)985566735315510172L);
                                                                    hi.a("\u00f2", (Object)this, (uK)hi.a("\u00a5", (Object)this, (Object)v11, (long)1316419085178087934L), (long)682778962666815526L);
                                                                    var3_4 /* !! */  = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1323877220870992810L), (long)789438897355831922L)), (long)1260538186742955956L);
                                                                    v12 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1115721325559177674L), (Object)hi.a("j", (long)1270343827400781957L), (long)511460060498514638L);
                                                                    if (!var2_2) break block52;
                                                                    if (v12 /* !! */  == false) break block53;
                                                                    break block54;
                                                                }
                                                                case 84161738: {
                                                                    eW.F("9hlJEIowNbw9SkuG", R());
                                                                    hi.a("G", (float)-1.0f, (long)1329648085340989328L);
                                                                    return;
                                                                }
                                                            }
lbl105:
                                                            // 2 sources

                                                            v7 = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)(eW.c(2707, 2211797889538520383L) ^ eW.c(16779, 5557786080426932457L)), (int)eW.c(18082, 318445982225251166L)) * eW.c(7971, 6451946790936666965L) / 3 - eW.c(10981, 8737793574893049789L);
                                                        }
                                                        var4_3 /* !! */  = (int)v7;
                                                        if (var2_2) continue;
                                                    }
                                                    var4_3 /* !! */  = (int)((hi.a("G", (int)eW.c(24956, 4966149095677794611L), (int)eW.c(6354, 5959314811221861876L), (long)834203424483934088L) - eW.c(1137, 4993379148395215844L)) * eW.c(22626, 8634389762366513628L) - eW.c(9589, 6084680022199721304L));
                                                    if (var2_2) continue;
                                                }
                                                v8 /* !! */  = (reference)(eW.c(23811, 7499806126423483574L) / eW.c(25900, 2887432114424388876L) - eW.c(19849, 5243911733304308976L) + eW.c(10445, 3967048207293895974L));
                                            }
                                            var4_3 /* !! */  = (int)v8 /* !! */ ;
                                            if (var2_2) continue;
                                        }
                                        var4_3 /* !! */  = (int)(hi.a("G", (int)(eW.c(27690, 3027946619346129409L) ^ eW.c(5429, 7943187941861222932L)), (int)eW.c(29937, 2643906495143971128L), (long)834203424483934088L) * eW.c(17817, 8561544346002242019L) / 3 - eW.c(19193, 3987090342174209787L));
                                    }
                                    var4_3 /* !! */  = eW.c(12159, 8483272564539249095L) - eW.c(21743, 4559690435681724463L) - eW.c(8434, 435574132970118342L);
                                    if (var2_2) break block68;
                                }
                                var4_3 /* !! */  = (eW.c(25276, 5608890899588258474L) ^ eW.c(30417, 918983738836355617L)) + eW.c(28226, 589246928372634256L) - eW.c(23886, 1704170927091459224L);
                            }
                            switch (var4_3 /* !! */ ) {
                                default: {
                                    v13 = eW.F("9hlJEIowNbw9SkuG", getXRot(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                                    var4_3 /* !! */  = (int)(eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(10550, 5277377626909333108L), (int)eW.c(9975, 6312951482146905865L)) / 3 + eW.c(31617, 3973250621929981170L) - eW.c(28477, 99958069060964388L));
                                    if (!var2_2) {
                                        break;
                                    }
                                    break block69;
                                }
                                case -999844714: {
                                    v13 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)682778962666815526L), (long)1059675231579017960L);
                                    if (var2_2) break;
                                    ** GOTO lbl-1000
                                }
                                case -999844713: {
                                    hi.a("G", (long)698875808952297500L);
                                    hi.a("G", (long)723518858017143060L);
                                    return;
                                }
                            }
                            var4_3 /* !! */  = (int)(hi.a("G", (int)eW.c(22011, 3082623640993017327L), (int)eW.c(14009, 1548808259515174732L), (long)834203424483934088L) / 3 + eW.c(27343, 7693303695326516666L) - eW.c(1003, 6118533364066385064L));
                        }
                        switch (var4_3 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                v14 = new Object[2];
                                v14[1] = (double)eW.F("9hlJEIowNbw9SkuG", intValue(), (Integer)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1045504738566232598L), (long)789438897355831922L)));
                                v14[0] = new uK((float)v10, (float)v13);
                                hi.a("\u00a5", (Object)v9, (Object)v14, (long)1187190564022460656L);
                                return;
                            }
                            case 1113070455: 
                        }
                        throw null;
                    }
                    v12 /* !! */  = (CallSite)((eW.c(23920, 2193390274449712027L) - eW.c(32182, 3217144846434697734L) ^ eW.c(1897, 6297512715326225925L)) * eW.c(18234, 2938257267627343652L) / 3 ^ eW.c(13011, 7915129293950963682L));
                }
                var4_3 /* !! */  = (int)v12 /* !! */ ;
                if (var2_2) break block50;
            }
            var4_3 /* !! */  = eW.c(12716, 5694117613068961928L) + eW.c(8078, 4391656457709412464L) + eW.c(6369, 1194098673929970801L);
            if (!var2_2) ** GOTO lbl207
        }
        block39: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    v15 = hi.a("\u00e9", (Object)this, (long)899543353537815653L);
                    v16 = 1;
                    if (!var2_2) ** GOTO lbl209
                    if (v15 > v16) ** GOTO lbl207
                    ** GOTO lbl211
                }
                case 1930184310: {
                    v1 = eW.c(527, 8002036076973980275L);
                    var4_3 /* !! */  = (int)(hi.a("G", (int)((eW.c(3778, 1047310828019675875L) - eW.c(17200, 7840024773919358386L)) / eW.c(15119, 7164539058895144795L)), (int)eW.c(18649, 475903756663600495L), (long)834203424483934088L) + eW.c(13826, 3350005206395833142L));
                    if (var2_2) ** GOTO lbl214
                    ** GOTO lbl213
                }
                case 1930184303: {
                    v1 = eW.c(24467, 2315804349594838971L);
                    if (var2_2) ** GOTO lbl213
                    ** GOTO lbl17
                }
                case 1930184301: {
                    ** continue;
                }
                case 1930184311: {
                    v17 = hi.a("\u00e9", (Object)this, (long)899543353537815653L);
                    v18 = 1;
                    if (!var2_2) ** GOTO lbl224
                    if (v17 > v18) ** GOTO lbl222
                    ** GOTO lbl226
                }
                case 1930184302: {
                    v3 = (Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1323877220870992810L), (long)789438897355831922L);
                    var4_3 /* !! */  = (eW.c(8919, 8176864181300386868L) ^ eW.c(10786, 6586018074327307887L)) - eW.c(20841, 6249502844858051596L) + eW.c(30411, 6534948017684974126L);
                    if (var2_2) ** GOTO lbl229
                    ** GOTO lbl228
                }
                case 1930184307: {
                    v3 = (Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)524703183084174172L), (long)789438897355831922L);
                    if (var2_2) ** GOTO lbl228
                    ** GOTO lbl36
                }
                case 1930184309: {
                    ** continue;
                }
                case 1930184308: {
                    ** GOTO lbl62
                }
                case 1930184305: {
                    hi.a("G", (long)838624670787528729L);
                    ** continue;
                }
lbl207:
                // 2 sources

                v15 = hi.a("G", (int)(eW.c(30002, 1422352093995468899L) * eW.c(15312, 988511481736807223L)), (int)eW.c(25198, 7547879674916150858L), (long)834203424483934088L);
                v16 = eW.c(13729, 8994973618097278214L);
lbl209:
                // 2 sources

                var4_3 /* !! */  = v15 ^ v16;
                if (var2_2) continue block39;
lbl211:
                // 2 sources

                var4_3 /* !! */  = eW.c(5447, 2073872243832188145L) / eW.c(7113, 4415099145136596817L) - eW.c(993, 7882919872394329998L) - eW.c(14100, 7036273957737515907L) ^ eW.c(6207, 5632863449084159901L);
                continue block39;
lbl213:
                // 2 sources

                var4_3 /* !! */  = (int)(hi.a("G", (int)((eW.c(30176, 3144164593295723498L) - eW.c(26812, 5777414862547784914L)) / eW.c(15119, 7164539058895144795L)), (int)eW.c(1164, 6164503329476279605L), (long)834203424483934088L) + eW.c(29428, 5007883088564915243L));
lbl214:
                // 2 sources

                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -948708855: 
                }
                hi.a("G", (long)1085489360135419778L);
                hi.a("G", (long)421642512486132857L);
                return;
lbl222:
                // 2 sources

                v17 = hi.a("G", (int)eW.c(22909, 4456309995508049736L), (int)eW.c(7671, 294771750011035886L), (long)834203424483934088L);
                v18 = eW.c(4961, 9122271808436203361L);
lbl224:
                // 2 sources

                var4_3 /* !! */  = v17 ^ v18;
                if (var2_2) continue block39;
lbl226:
                // 2 sources

                var4_3 /* !! */  = (int)(hi.a("G", (int)eW.c(1730, 6764174033856821741L), (int)eW.c(29641, 2410826583218490976L), (long)834203424483934088L) + eW.c(11952, 1103221422203982644L));
                continue block39;
lbl228:
                // 2 sources

                var4_3 /* !! */  = (eW.c(4868, 8405393164670758169L) ^ eW.c(1463, 576966320101554876L)) - eW.c(691, 8562395185624644995L) + eW.c(32332, 5348277215898272539L);
lbl229:
                // 2 sources

                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1878839725: 
                }
                return;
                case 1930184304: 
            }
            break;
        }
    }

    private boolean lambda$new$2() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)729698410435221172L), (Object)hi.a("j", (long)1053585327047994841L), (long)511460060498514638L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$8() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)561568277276180739L), (long)789438897355831922L))), (long)1000026253634408124L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)413505599836502634L), (long)789438897355831922L))), (long)1000026253634408124L);
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

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)0, (long)899543353537815653L);
        hi.a("\u00f2", (Object)this, null, (long)985566735315510172L);
        hi.a("\u00f2", (Object)this, null, (long)884843840457466393L);
        hi.a("\u00f2", (Object)this, null, (long)682778962666815526L);
        hi.a("\u00f2", (Object)this, (int)0, (long)1204100870201044002L);
        hi.a("\u00f2", (Object)this, null, (long)963573612004996929L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)676622328071995195L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1145101457761299088L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)468704053310521345L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void Y(Object[] var1_1) {
        var2_2 = Dl.S();
        var3_3 /* !! */  = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)((eW.c(12994, 7715578801499393714L) - eW.c(31274, 8682076600495900105L)) / 4), (int)eW.c(28205, 3760628511617881709L)) ^ eW.c(21396, 871849739937721986L) ^ eW.c(24826, 1891207953207663738L);
        if (var2_2) ** GOTO lbl35
lbl5:
        // 2 sources

        while (true) {
            block26: {
                block25: {
                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("j", (long)557098869906896462L), (Object)new Object[0], (long)693370517752370281L);
                    if (!var2_2) break block25;
                    if (v0 /* !! */  == false) break block26;
                    v0 /* !! */  = (CallSite)(eW.c(21866, 6640368651951975075L) / eW.c(15287, 4391928138228516140L) - eW.c(6164, 8400854464806380994L));
                }
                var3_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) ** GOTO lbl35
            }
            var3_3 /* !! */  = (int)(hi.a("G", (int)eW.c(5327, 33883861303684014L), (int)eW.c(16958, 6629529647914794236L), (long)834203424483934088L) * eW.c(26557, 7348952281509566916L) / eW.c(705, 1190033084118400856L) + eW.c(6215, 8657699045420590627L));
            if (var2_2) ** GOTO lbl35
            ** GOTO lbl74
            break;
        }
lbl17:
        // 2 sources

        while (true) {
            v1 = 0;
            if (var2_2) ** GOTO lbl82
lbl20:
            // 2 sources

            while (true) {
                v2 /* !! */  = eW.F("9hlJEIowNbw9SkuG", onGround(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                if (!var2_2) ** GOTO lbl86
                if (v2 /* !! */  != false) ** GOTO lbl85
                if (true) ** GOTO lbl88
                break;
            }
            break;
        }
        block19: while (true) {
            block24: {
                block29: {
                    block28: {
                        block27: {
                            v3 /* !! */  = v1 | v4;
                            if (!var2_2) break block27;
                            if (v3 /* !! */  != 0) break block28;
                            v3 /* !! */  = var3_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)eW.c(14434, 4913910199887447359L), (int)eW.c(6657, 6660685942013354954L), (long)834203424483934088L), (int)eW.c(22653, 9203062516448862281L), (long)834203424483934088L) * eW.c(13692, 5935558527185374652L) - eW.c(20339, 422938823320743947L));
                        }
                        if (var2_2) break block29;
                    }
                    var3_3 /* !! */  = eW.c(5705, 8367987112245750488L) / eW.c(15287, 4391928138228516140L) - eW.c(27889, 2351111349875577297L);
                    if (!var2_2) ** GOTO lbl90
                }
                block20: while (true) {
                    block34: {
                        block33: {
                            block32: {
                                block30: {
                                    block31: {
                                        switch (var3_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -588324947: {
                                                v5 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)518838998869370586L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                if (!var2_2) break block30;
                                                if (v5 /* !! */  != false) break block31;
                                                break block32;
                                            }
                                            case -588324946: {
                                                v1 = 1;
                                                var3_3 /* !! */  = (eW.c(30007, 3834496189506455857L) / 4 ^ eW.c(14428, 3356393129332883895L)) / eW.c(25900, 2887432114424388876L) - eW.c(6725, 3106589559865500868L) ^ eW.c(2681, 7034653207906612942L);
                                                if (var2_2) break block20;
                                                break block33;
                                            }
                                            case -588324944: {
                                                hi.a("G", (long)1014665100432844273L);
                                                hi.a("G", (long)1134434820933353061L);
                                                ** GOTO lbl17
                                            }
                                            case -588324943: {
                                                ** continue;
                                            }
                                            case -588324948: {
                                                v6 = new Object[2];
                                                v6[1] = hi.a("\u00e9", (Object)this, (long)884843840457466393L);
                                                v6[0] = hi.a("\u00e9", (Object)this, (long)985566735315510172L);
                                                hi.a("\u00f2", (Object)this, (uK)hi.a("\u00a5", (Object)this, (Object)v6, (long)1316419085178087934L), (long)682778962666815526L);
                                                v7 = new Object[2];
                                                v7[1] = (double)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1323877220870992810L), (long)789438897355831922L)), (long)1260538186742955956L);
                                                v7[0] = hi.a("\u00e9", (Object)this, (long)682778962666815526L);
                                                hi.a("\u00a5", (Object)hi.a("j", (long)1054285254962319361L), (Object)v7, (long)1187190564022460656L);
                                                if (!var2_2) {
                                                    break;
                                                }
                                                break block34;
                                            }
                                            case -588324942: 
                                        }
                                        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)848782481930292225L);
                                        return;
                                    }
                                    v5 /* !! */  = (CallSite)(eW.c(28125, 4821085307017958384L) / eW.c(31764, 6863189154801353676L) - eW.c(9030, 7187319521619008465L));
                                }
                                var3_3 /* !! */  = (int)v5 /* !! */ ;
                                if (var2_2) continue;
                            }
                            var3_3 /* !! */  = (eW.c(2103, 6802629392552391851L) + eW.c(28889, 994175179089250490L)) * eW.c(5439, 347346197860871328L) * eW.c(32675, 4625236253889333138L) ^ eW.c(4855, 873241449609685991L);
                            continue;
                        }
                        var3_3 /* !! */  = (eW.c(22515, 3269018749607029666L) / 4 ^ eW.c(31890, 8262810699934335635L)) / eW.c(25900, 2887432114424388876L) - eW.c(24278, 195247322267066906L) ^ eW.c(18432, 2215842815618003296L);
                        if (var2_2) break;
lbl85:
                        // 2 sources

                        v2 /* !! */  = (CallSite)(eW.c(16416, 1502830591513836790L) + eW.c(29576, 7376140447794171142L) + eW.c(1714, 1833082520110955494L) - eW.c(13321, 8790008380822865949L) ^ eW.c(25262, 1384182391554285148L) ^ eW.c(6950, 4347780319499346796L));
lbl86:
                        // 2 sources

                        var3_3 /* !! */  = (int)v2 /* !! */ ;
                        if (var2_2) break;
lbl88:
                        // 2 sources

                        var3_3 /* !! */  = eW.c(10538, 5335316559424280539L) ^ eW.c(25633, 3554733339173592109L) ^ eW.c(25384, 4964146257807416760L);
                        break;
                    }
                    var3_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)eW.c(15083, 5008621413474420492L), (int)eW.c(32572, 3548030400393445471L), (long)834203424483934088L), (int)eW.c(21659, 6076565727141997378L), (long)834203424483934088L) * eW.c(20184, 283879003715547854L) - eW.c(6761, 1826369193013535954L));
                }
                block21: while (true) {
                    switch (var3_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -1310866757: {
                            v4 = 1;
                            var3_3 /* !! */  = eW.c(16091, 5405382934260139869L) / eW.c(705, 1190033084118400856L) * eW.c(23416, 5479062687877375677L) - eW.c(8056, 6853401714551579297L);
                            if (!var2_2) {
                                break block21;
                            }
                            break block24;
                        }
                        case -1310866755: {
                            v4 = 0;
                            if (var2_2) break block21;
                            continue block19;
                        }
                        case -1310866758: {
                            hi.a("G", (long)877399517904373040L);
                            hi.a("G", (long)1060921528960496445L);
                            var3_3 /* !! */  = eW.c(3717, 3371645727173015279L) / eW.c(31764, 6863189154801353676L) - eW.c(9525, 1402848044065052918L);
                            continue block21;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = eW.c(31190, 1471762295301637191L) / eW.c(705, 1190033084118400856L) * eW.c(2154, 1849836173291582646L) - eW.c(18818, 6476552825822492666L);
            }
            switch (var3_3 /* !! */ ) {
                default: {
                    continue block19;
                }
                case -835632076: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int m(Object[] var1_1) {
        block27: {
            block25: {
                block26: {
                    block24: {
                        block22: {
                            block23: {
                                block21: {
                                    block19: {
                                        block20: {
                                            block18: {
                                                block16: {
                                                    block17: {
                                                        var2_2 = Dl.t();
                                                        var3_3 /* !! */  = (hi.a("G", (int)eW.c(11945, 4863269675360735789L), (int)eW.c(23101, 5924716630208717525L), (long)834203424483934088L) ^ eW.c(29159, 6354485005135776192L)) * eW.c(21012, 4401917141723885373L) ^ eW.c(18694, 8954219432650125499L);
                                                        if (var2_2) lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1282175146993233974L), (long)622868109502394347L);
                                                                if (var2_2) break block16;
                                                                if (v0 /* !! */  != false) break block17;
                                                                break block18;
                                                                break;
                                                            }
lbl10:
                                                            // 1 sources

                                                            while (true) {
                                                                v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)628450052231870599L);
                                                                if (var2_2) break block19;
                                                                if (v1 /* !! */  == false) break block20;
                                                                break block21;
                                                                break;
                                                            }
lbl15:
                                                            // 1 sources

                                                            while (true) {
                                                                v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)424948845096568270L), (Object)hi.a("j", (long)714402968882141522L), (long)511460060498514638L);
                                                                if (var2_2) break block22;
                                                                if (v2 /* !! */  == false) break block23;
                                                                break block24;
                                                                break;
                                                            }
lbl20:
                                                            // 1 sources

                                                            while (true) {
                                                                cfr_temp_0 = (double)eW.F("9hlJEIowNbw9SkuG", abs(int ), (int)(hi.a("\u00e9", (Object)this, (long)693424316913199608L) - (hi.a("G", (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L), (long)1066335291226683535L) - true))) - 1.25;
                                                                v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                if (var2_2) break block25;
                                                                if (v3 > 0) break block26;
                                                                break block27;
                                                                break;
                                                            }
lbl26:
                                                            // 1 sources

                                                            return (int)hi.a("\u00e9", (Object)this, (long)693424316913199608L);
lbl28:
                                                            // 1 sources

                                                            return (int)(hi.a("G", (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L), (long)1066335291226683535L) - true);
                                                        }
lbl30:
                                                        // 10 sources

                                                        while (true) {
                                                            switch (var3_3 /* !! */ ) {
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case -1635683619: {
                                                                    ** continue;
                                                                }
                                                                case -1635683615: {
                                                                    ** continue;
                                                                }
                                                                case -1635683616: {
                                                                    ** continue;
                                                                }
                                                                case -1635683613: {
                                                                    ** continue;
                                                                }
                                                                case -1635683618: {
                                                                    ** continue;
                                                                }
                                                                case -1635683614: 
                                                            }
                                                            hi.a("G", (float)0.0f, (long)450110752184348458L);
                                                            hi.a("G", (int)1, (int)1, (long)656208795491924261L);
                                                            return -1;
                                                        }
                                                    }
                                                    v0 /* !! */  = (CallSite)((eW.c(6432, 1981847649471586769L) + eW.c(11769, 4608222584622896316L)) * eW.c(4093, 5348595027151909552L) ^ eW.c(18553, 1562932052520088587L) ^ eW.c(2588, 726255141612975294L) ^ eW.c(3701, 2655340520290382267L));
                                                }
                                                var3_3 /* !! */  = (int)v0 /* !! */ ;
                                                if (!var2_2) ** GOTO lbl30
                                            }
                                            var3_3 /* !! */  = (eW.c(19689, 1539651181987967613L) ^ eW.c(20768, 304664576858893642L)) * eW.c(26249, 8744371808577559084L) ^ eW.c(7892, 708008991899281096L);
                                            if (!var2_2) ** GOTO lbl30
                                        }
                                        v1 /* !! */  = (CallSite)((eW.c(27305, 7236183892154291896L) + eW.c(23716, 8843635199627927836L)) * eW.c(31069, 6833972816541253873L) ^ eW.c(1590, 1470790203222948830L) ^ eW.c(2976, 3672905100994868086L) ^ eW.c(32575, 938407275061018966L));
                                    }
                                    var3_3 /* !! */  = (int)v1 /* !! */ ;
                                    if (!var2_2) ** GOTO lbl30
                                }
                                var3_3 /* !! */  = (eW.c(14438, 5416799400520861694L) * eW.c(27984, 8523650951501418626L) ^ eW.c(5869, 7674956354693262048L)) / eW.c(23509, 1465630396050449587L) + eW.c(10256, 3988911418586093305L);
                                if (!var2_2) ** GOTO lbl30
                            }
                            v2 /* !! */  = (CallSite)((eW.c(27305, 7236183892154291896L) + eW.c(23716, 8843635199627927836L)) * eW.c(31069, 6833972816541253873L) ^ eW.c(1590, 1470790203222948830L) ^ eW.c(2976, 3672905100994868086L) ^ eW.c(32575, 938407275061018966L));
                        }
                        var3_3 /* !! */  = (int)v2 /* !! */ ;
                        if (!var2_2) ** GOTO lbl30
                    }
                    var3_3 /* !! */  = eW.c(12964, 2230402110936993158L) + eW.c(10051, 6386661631323856639L) + eW.c(21519, 6221895040039070532L);
                    if (!var2_2) ** GOTO lbl30
                }
                v3 = (eW.c(27305, 7236183892154291896L) + eW.c(23716, 8843635199627927836L)) * eW.c(31069, 6833972816541253873L) ^ eW.c(1590, 1470790203222948830L) ^ eW.c(2976, 3672905100994868086L) ^ eW.c(32575, 938407275061018966L);
            }
            var3_3 /* !! */  = (int)v3;
            if (!var2_2) ** GOTO lbl30
        }
        var3_3 /* !! */  = eW.c(13124, 3705445850640698278L) + eW.c(4403, 6007674721545808028L) - eW.c(16401, 8719507536294264759L) - eW.c(26013, 6054763775517694410L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE(P=200)
    private void h(yi var1_1) {
        block16: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)(eW.c(25816, 4494356161536596839L) ^ eW.c(20652, 6615607469262941220L) ^ eW.c(13407, 3920791081163279685L)), (int)eW.c(29553, 6375011816309820355L), (long)834203424483934088L), (int)eW.c(14273, 6117876394955557702L), (long)834203424483934088L) ^ eW.c(8242, 3894632511593765908L);
            if (var2_2) break block16;
lbl4:
            // 2 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00a5", (Object)var1_1, (long)390557783940660750L), (long)744563942973792377L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00a5", (Object)var1_1, (Object)new Object[0], (long)715093250942033582L), (long)445553535294575111L);
                hi.a("\u00f2", (Object)this, (float)hi.a("G", (float)((float)hi.a("G", (float)((hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)700108823764850555L) + (float)eW.F("9hlJEIowNbw9SkuG", toDegrees(double ), (double)hi.a("G", (double)((double)(-hi.a("\u00e9", (Object)this, (long)445553535294575111L))), (double)((double)hi.a("\u00e9", (Object)this, (long)744563942973792377L)), (long)500914284220543481L))) / 45.0f), (long)400355798406630015L) * 45.0f), (long)604508068528351008L), (long)509058717980894141L);
                hi.a("\u00f2", (Object)this, (float)((float)hi.a("G", (int)hi.a("G", (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)700108823764850555L) + (float)hi.a("G", (double)hi.a("G", (double)((double)(-hi.a("\u00e9", (Object)this, (long)445553535294575111L))), (double)((double)hi.a("\u00e9", (Object)this, (long)744563942973792377L)), (long)500914284220543481L), (long)1261399724580134246L)), (long)400355798406630015L), (long)1214164474150680858L)), (long)375925297147054743L);
                v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)424948845096568270L), (Object)hi.a("j", (long)714402968882141522L), (long)511460060498514638L);
                if (!var2_2) ** GOTO lbl55
                if (v0 == false) ** GOTO lbl54
                ** GOTO lbl57
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)412409060139490357L);
                if (!var2_2) ** GOTO lbl60
                if (v1 == false) ** GOTO lbl59
                ** GOTO lbl62
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                v2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1282175146993233974L), (long)622868109502394347L);
                if (!var2_2) ** GOTO lbl65
                if (v2 != false) ** GOTO lbl64
                ** GOTO lbl67
                break;
            }
lbl23:
            // 1 sources

            while (true) {
                v3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)628450052231870599L);
                if (!var2_2) ** GOTO lbl70
                if (v3 == false) ** GOTO lbl69
                ** GOTO lbl72
                break;
            }
lbl28:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{true}, (long)795320219994177176L);
                if (!var2_2) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl74
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 16551819: {
                    ** continue;
                }
                case 16551817: {
                    ** continue;
                }
                case 16551822: {
                    ** continue;
                }
                case 16551821: {
                    ** GOTO lbl28
                }
                case 16551818: {
                    ** continue;
                }
                case 0xFC8F8C: 
            }
            hi.a("G", (int)1, (long)1040117516474656258L);
            if (!var2_2) ** break;
            ** continue;
lbl54:
            // 2 sources

            v0 = hi.a("G", (int)eW.c(22339, 7052786854489959215L), (int)eW.c(31506, 7828686688847299839L), (long)834203424483934088L) + eW.c(23868, 2780151954732556351L) - eW.c(1008, 1691464244586445367L);
lbl55:
            // 2 sources

            var3_3 /* !! */  = (int)v0;
            if (var2_2) continue;
lbl57:
            // 2 sources

            var3_3 /* !! */  = eW.c(4718, 7410760825464220937L) * eW.c(17428, 3268857261463549987L) + eW.c(24962, 5326797162648116585L);
            if (var2_2) continue;
lbl59:
            // 2 sources

            v1 = hi.a("G", (int)eW.c(1911, 4164543650360360839L), (int)eW.c(15141, 7334925127414399645L), (long)834203424483934088L) + eW.c(16466, 2200151096335351230L) - eW.c(1383, 6857397812182449281L);
lbl60:
            // 2 sources

            var3_3 /* !! */  = (int)v1;
            if (var2_2) continue;
lbl62:
            // 2 sources

            var3_3 /* !! */  = eW.c(24450, 9090497815213680452L) / eW.c(25900, 2887432114424388876L) - eW.c(19229, 8374071428986123176L);
            if (var2_2) continue;
lbl64:
            // 2 sources

            v2 = hi.a("G", (int)eW.c(1911, 4164543650360360839L), (int)eW.c(15141, 7334925127414399645L), (long)834203424483934088L) + eW.c(16466, 2200151096335351230L) - eW.c(1383, 6857397812182449281L);
lbl65:
            // 2 sources

            var3_3 /* !! */  = (int)v2;
            if (var2_2) continue;
lbl67:
            // 2 sources

            var3_3 /* !! */  = (eW.c(11098, 1742065386530330405L) / eW.c(25900, 2887432114424388876L) + eW.c(23999, 6751108578247451973L)) / 2 ^ eW.c(22614, 8030159584063922371L);
            if (var2_2) continue;
lbl69:
            // 2 sources

            v3 = hi.a("G", (int)eW.c(1911, 4164543650360360839L), (int)eW.c(15141, 7334925127414399645L), (long)834203424483934088L) + eW.c(16466, 2200151096335351230L) - eW.c(1383, 6857397812182449281L);
lbl70:
            // 2 sources

            var3_3 /* !! */  = (int)v3;
            if (var2_2) continue;
lbl72:
            // 2 sources

            var3_3 /* !! */  = (eW.c(11444, 2302333582273205294L) ^ eW.c(24176, 375145395889381376L)) + eW.c(1665, 3726018747496987331L);
            if (var2_2) continue;
lbl74:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)eW.c(1911, 4164543650360360839L), (int)eW.c(15141, 7334925127414399645L), (long)834203424483934088L) + eW.c(16466, 2200151096335351230L) - eW.c(1383, 6857397812182449281L));
        }
    }

    private boolean lambda$new$3() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)424948845096568270L), (Object)hi.a("j", (long)906100654230355526L), (long)511460060498514638L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    private void U(dP var1_1) {
        block16: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = (eW.c(14375, 8993334751296898544L) ^ eW.c(18888, 262432512289976565L)) / eW.c(11040, 7117522510885967068L) ^ eW.c(21768, 1592323832740980877L) ^ eW.c(16409, 1967103190330981894L) ^ eW.c(3678, 1048116971862750148L);
            if (var2_2) break block16;
lbl4:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                if (!var2_2) ** GOTO lbl56
                if (v0 /* !! */  != false) ** GOTO lbl55
                ** GOTO lbl58
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)926034820796895418L), (long)789438897355831922L)), (long)1000026253634408124L);
                if (!var2_2) ** GOTO lbl61
                if (v1 /* !! */  == false) ** GOTO lbl60
                ** GOTO lbl63
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                v2 /* !! */  = hi.a("\u00e9", (Object)this, (long)468704053310521345L);
                if (!var2_2) ** GOTO lbl66
                if (v2 /* !! */  == false) ** GOTO lbl65
                ** GOTO lbl68
                break;
            }
lbl19:
            // 2 sources

            while (true) {
                v3 = hi.a("\u00a5", (Object)var1_1, (long)634364534990057548L) instanceof ClientboundPlayerPositionPacket;
                if (!var2_2) ** GOTO lbl71
                if (v3 == 0) ** GOTO lbl70
                ** GOTO lbl72
                break;
            }
lbl24:
            // 1 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (boolean)false, (long)468704053310521345L);
                v4 = new Object[2];
                v4[1] = hi.a("\u00a5", (Object)hi.a("j", (long)1234432929393677227L), (long)1335171215242130397L);
                v4[0] = hi.a("\u00a5", (Object)this, (long)721675246255933332L);
                hi.a("\u00a5", (Object)hi.a("j", (long)549148920996267385L), (Object)v4, (long)676286131554098443L);
                hi.a("\u00a5", (Object)this, (boolean)false, (long)1197894287238472871L);
                if (!var2_2) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl74
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1457898574: {
                    ** continue;
                }
                case -1457898569: {
                    ** continue;
                }
                case -1457898575: {
                    ** GOTO lbl19
                }
                case -1457898571: {
                    ** continue;
                }
                case -1457898573: {
                    ** continue;
                }
                case -1457898570: 
            }
            hi.a("G", (long)eW.d(9199, 5430266581344710266L), (float)2.0f, (float)-1.0f, (float)1.0f, (float)-1.0f, (int)0, (long)375734786785774161L);
            if (!var2_2) ** break;
            ** continue;
lbl55:
            // 2 sources

            v0 /* !! */  = (CallSite)(hi.a("G", (int)((eW.c(6654, 8146503114739639478L) - eW.c(23945, 7307949330144698412L)) / 2), (int)eW.c(15880, 6756045762261270819L), (long)834203424483934088L) + eW.c(4989, 5945985145674459999L) ^ eW.c(18059, 6038841347093870942L));
lbl56:
            // 2 sources

            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (var2_2) continue;
lbl58:
            // 2 sources

            var3_3 /* !! */  = (eW.c(1112, 3601453580782958728L) + eW.c(10417, 767154113760581003L)) * eW.c(18445, 3596520301300396511L) * eW.c(16891, 3113150891139383017L) * eW.c(25245, 7793222972758760381L) - eW.c(26000, 1543292407069054999L);
            if (var2_2) continue;
lbl60:
            // 2 sources

            v1 /* !! */  = (CallSite)(hi.a("G", (int)((eW.c(21102, 4617088315015342930L) - eW.c(31610, 1136552089001689932L)) / 2), (int)eW.c(8762, 6770809919817015235L), (long)834203424483934088L) + eW.c(352, 2667545476319082506L) ^ eW.c(11804, 4065251657834549317L));
lbl61:
            // 2 sources

            var3_3 /* !! */  = (int)v1 /* !! */ ;
            if (var2_2) continue;
lbl63:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)(eW.c(30328, 2098179348997410432L) - eW.c(11802, 3296479019023519986L)), (int)eW.c(21485, 259308895757217446L), (long)834203424483934088L) / eW.c(8727, 1779277036266675306L) + eW.c(31587, 7048482545266066694L) + eW.c(24744, 6798175655462574544L));
            if (var2_2) continue;
lbl65:
            // 2 sources

            v2 /* !! */  = (CallSite)(hi.a("G", (int)((eW.c(21102, 4617088315015342930L) - eW.c(31610, 1136552089001689932L)) / 2), (int)eW.c(8762, 6770809919817015235L), (long)834203424483934088L) + eW.c(352, 2667545476319082506L) ^ eW.c(11804, 4065251657834549317L));
lbl66:
            // 2 sources

            var3_3 /* !! */  = (int)v2 /* !! */ ;
            if (var2_2) continue;
lbl68:
            // 2 sources

            var3_3 /* !! */  = eW.c(7996, 6347647130863003460L) / eW.c(26580, 7334190056549652576L) / eW.c(705, 1190033084118400856L) + eW.c(11135, 4742107192411903484L) ^ eW.c(912, 1084501236211580302L);
            if (var2_2) continue;
lbl70:
            // 2 sources

            v3 = var3_3 /* !! */  = hi.a("G", (int)((eW.c(21102, 4617088315015342930L) - eW.c(31610, 1136552089001689932L)) / 2), (int)eW.c(8762, 6770809919817015235L), (long)834203424483934088L) + eW.c(352, 2667545476319082506L) ^ eW.c(11804, 4065251657834549317L);
lbl71:
            // 2 sources

            if (var2_2) continue;
lbl72:
            // 2 sources

            var3_3 /* !! */  = eW.c(9686, 8981837636008500380L) ^ eW.c(8237, 1958679114737211772L) ^ eW.c(24912, 3010188242786588895L);
            if (var2_2) continue;
lbl74:
            // 2 sources

            var3_3 /* !! */  = hi.a("G", (int)((eW.c(21102, 4617088315015342930L) - eW.c(31610, 1136552089001689932L)) / 2), (int)eW.c(8762, 6770809919817015235L), (long)834203424483934088L) + eW.c(352, 2667545476319082506L) ^ eW.c(11804, 4065251657834549317L);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean t(Vec3 var1_1, BlockPos var2_2) {
        block44: {
            block51: {
                block50: {
                    block48: {
                        block49: {
                            block47: {
                                block45: {
                                    block46: {
                                        block43: {
                                            block55: {
                                                block42: {
                                                    block52: {
                                                        var3_3 = Dl.t();
                                                        var15_4 = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)(hi.a("G", (int)(eW.c(27524, 6582838982379312296L) + eW.c(8551, 9202276652080781406L)), (int)eW.c(25530, 4342008801210802100L), (long)834203424483934088L) ^ eW.c(19573, 6446635068549575402L)), (int)eW.c(22888, 5472474250947404174L)) + eW.c(23843, 3574647654743188846L);
                                                        if (!var3_3) break block52;
lbl4:
                                                        // 2 sources

                                                        while (true) {
                                                            v0 = hi.a("\u00a5", (Object)this, (long)1226068188099526649L);
                                                            if (var3_3) ** GOTO lbl155
                                                            if (v0 == false) ** GOTO lbl154
                                                            ** GOTO lbl156
                                                            break;
                                                        }
lbl9:
                                                        // 2 sources

                                                        while (true) {
                                                            v1 = var7_8;
                                                            v2 = var6_7;
                                                            if (var3_3) ** GOTO lbl60
                                                            if (v1 >= v2) ** GOTO lbl58
                                                            ** GOTO lbl62
                                                            break;
                                                        }
lbl15:
                                                        // 2 sources

                                                        while (true) {
                                                            block54: {
                                                                block53: {
                                                                    var13_14 = eW.F("9hlJEIowNbw9SkuG", getOpposite(), (Direction)var8_9);
                                                                    var14_15 = hi.a("\u00a5", (Object)var10_11, (Object)var1_1, (long)1082050008038634828L);
                                                                    cfr_temp_0 = hi.a("\u00a5", (Object)var14_15, (long)431225985925845942L) - hi.a("\u00e9", (Object)this, (long)595391600233351183L);
                                                                    v3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                    if (var3_3) break block53;
                                                                    if (v3 <= 0) break block54;
                                                                    v3 = var15_4 = (reference)(hi.a("G", (int)(eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(26423, 8050924629027166601L), (int)eW.c(19165, 3015204244304114534L)) - eW.c(18654, 1459625370058077909L)), (int)eW.c(28582, 5060760713578025751L), (long)834203424483934088L) ^ eW.c(6889, 6545313726677771549L) ^ eW.c(10137, 4359403105831411683L));
                                                                }
                                                                if (!var3_3) ** GOTO lbl90
                                                            }
                                                            var15_4 = (reference)(eW.c(28746, 2035805015333539510L) - eW.c(28569, 2972068668935279597L) - eW.c(14985, 8359587364256826031L));
                                                            if (!var3_3) break block42;
                                                            ** GOTO lbl164
                                                            break;
                                                        }
lbl29:
                                                        // 2 sources

                                                        while (var13_14 == hi.a("j", (long)1151726402263101942L)) {
                                                            break block43;
                                                        }
                                                        break block55;
                                                    }
lbl33:
                                                    // 5 sources

                                                    block30: while (true) {
                                                        block56: {
                                                            switch (var15_4) {
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case -52643627: {
                                                                    v4 /* !! */  = hi.a("\u00a5", (Object)var2_2, (long)491002271509294121L);
                                                                    v5 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)516855823746183673L);
                                                                    if (var3_3) ** GOTO lbl160
                                                                    if (v4 /* !! */  <= v5 /* !! */ ) ** GOTO lbl158
                                                                    ** GOTO lbl162
                                                                }
                                                                case -52643626: {
                                                                    var4_5 = hi.a("G", (Object)var2_2, (long)414024409078792884L);
                                                                    var5_6 = hi.a("G", (long)971290628791266084L);
                                                                    var6_7 = ((CallSite)var5_6).length;
                                                                    var7_8 = 0;
                                                                    if (!var3_3) ** GOTO lbl56
                                                                    ** GOTO lbl9
                                                                }
                                                                case -52643628: {
                                                                    eW.F("9hlJEIowNbw9SkuG", r());
                                                                    var15_4 = (reference)(eW.c(23565, 2533375365610086648L) * eW.c(19824, 2046177917758747323L) / eW.c(22434, 1754800183921453428L) + eW.c(18810, 6668289598625264663L) ^ eW.c(28014, 7958131036180976360L));
                                                                    continue block30;
                                                                }
lbl56:
                                                                // 1 sources

                                                                var15_4 = (reference)(hi.a("G", (int)eW.c(17415, 6434110458577075266L), (int)eW.c(26718, 150904837832972175L), (long)834203424483934088L) + eW.c(11332, 1188599045541810651L) + eW.c(24063, 5396675496223220940L) ^ eW.c(29380, 2251732771353201266L));
                                                                if (!var3_3) break block56;
lbl58:
                                                                // 2 sources

                                                                v1 = hi.a("G", (int)eW.c(30011, 4020986212567124467L), (int)eW.c(14712, 2352876503631119785L), (long)834203424483934088L) * eW.c(29090, 8112325690775604735L) - eW.c(32554, 792198897675960336L) ^ eW.c(26982, 8303378164468815537L);
                                                                v2 = eW.c(7574, 5366353345938875775L);
lbl60:
                                                                // 2 sources

                                                                var15_4 = (reference)(v1 + v2);
                                                                if (!var3_3) break block56;
lbl62:
                                                                // 2 sources

                                                                var15_4 = (reference)((hi.a("G", (int)((eW.c(20425, 6255458396062595026L) ^ eW.c(27573, 5824685275099174670L)) / 3), (int)eW.c(26981, 946106438575757185L), (long)834203424483934088L) ^ eW.c(3327, 1709888097718595709L)) + eW.c(10273, 3408395536332968186L));
                                                                break block56;
                                                                case -52643630: 
                                                            }
                                                            return false;
                                                        }
lbl68:
                                                        // 2 sources

                                                        while (true) {
                                                            switch (var15_4) {
                                                                default: {
                                                                    ** continue;
                                                                }
                                                                case -161200730: {
                                                                    var8_9 = var5_6[var7_8];
                                                                    var9_10 = hi.a("\u00a5", (Object)var8_9, (long)359514828120398179L);
                                                                    var10_11 = eW.F("9hlJEIowNbw9SkuG", add(net.minecraft.world.phys.Vec3 ), (Vec3)var4_5, (Vec3)eW.F("9hlJEIowNbw9SkuG", scale(double ), (Vec3)var9_10, (double)0.5));
                                                                    var11_12 = hi.a("\u00a5", (Object)var2_2, (Object)var8_9, (long)531922423199390482L);
                                                                    var12_13 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)var11_12, (long)419122760578116751L);
                                                                    v6 = eW.F("9hlJEIowNbw9SkuG", isEmpty(), (VoxelShape)hi.a("\u00a5", (Object)var12_13, (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)var11_12, (long)826970659746530362L));
                                                                    if (var3_3) ** GOTO lbl82
                                                                    if (v6 == false) ** GOTO lbl83
                                                                    v6 = var15_4 = (reference)(hi.a("G", (int)(hi.a("G", (int)eW.c(11072, 13691380006803065L), (int)eW.c(6592, 3862469126623192172L), (long)834203424483934088L) - eW.c(18947, 5822404829832951613L)), (int)eW.c(2928, 6719486247709013059L), (long)834203424483934088L) ^ eW.c(13772, 800493598053911828L) ^ eW.c(7829, 5911594868897670743L));
lbl82:
                                                                    // 2 sources

                                                                    if (!var3_3) break;
lbl83:
                                                                    // 2 sources

                                                                    var15_4 = hi.a("G", (int)hi.a("G", (int)(eW.c(15915, 5529723626956802020L) * eW.c(24265, 6581727336095392396L)), (int)eW.c(26236, 655880336305725291L), (long)834203424483934088L), (int)eW.c(6138, 881126899963488822L), (long)834203424483934088L) - eW.c(31577, 957980295749174176L);
                                                                    if (!var3_3) break;
                                                                    ** GOTO lbl108
                                                                }
                                                                case -161200728: {
                                                                    return false;
                                                                }
                                                                case -161200729: {
                                                                    return false;
                                                                }
                                                            }
lbl90:
                                                            // 5 sources

                                                            while (true) {
                                                                block58: {
                                                                    block57: {
                                                                        switch (var15_4) {
                                                                            default: {
                                                                                if (hi.a("\u00a5", (Object)var12_13, (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)var11_12, (long)1328180378428801803L) == null) break;
                                                                                break block57;
                                                                            }
                                                                            case -1982426196: {
                                                                                if (!var3_3) break block58;
                                                                                ** GOTO lbl15
                                                                            }
                                                                            case -1982426193: {
                                                                                ** continue;
                                                                            }
                                                                            case -1982426194: {
                                                                                ++var7_8;
                                                                                if (var3_3) {
                                                                                    return false;
                                                                                }
                                                                                break block44;
                                                                            }
                                                                            case -1982426197: {
                                                                                throw null;
                                                                            }
                                                                        }
lbl108:
                                                                        // 2 sources

                                                                        var15_4 = (reference)(eW.c(30993, 474184764035761391L) + eW.c(7761, 7606294101634114156L) + eW.c(15634, 240968313539084401L) + eW.c(3433, 2223758623161249821L) + eW.c(17856, 3458141391400352467L));
                                                                        if (!var3_3) continue;
                                                                    }
                                                                    var15_4 = hi.a("G", (int)eW.c(14067, 8782804336994602552L), (int)eW.c(10639, 5848134936669835283L), (long)834203424483934088L) + eW.c(27222, 4489944694208566343L);
                                                                    if (!var3_3) continue;
                                                                }
                                                                var15_4 = (reference)(hi.a("G", (int)(hi.a("G", (int)eW.c(26423, 8050924629027166601L), (int)eW.c(19165, 3015204244304114534L), (long)834203424483934088L) - eW.c(18654, 1459625370058077909L)), (int)eW.c(28582, 5060760713578025751L), (long)834203424483934088L) ^ eW.c(6889, 6545313726677771549L) ^ eW.c(10137, 4359403105831411683L));
                                                                continue;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
lbl117:
                                                // 7 sources

                                                while (true) lbl-1000:
                                                // 4 sources

                                                {
                                                    block62: {
                                                        block61: {
                                                            block59: {
                                                                block60: {
                                                                    switch (var15_4) {
                                                                        default: {
                                                                            cfr_temp_1 = hi.a("\u00a5", (Object)var14_15, (Object)var9_10, (long)775234009870370927L) - 0.0;
                                                                            v7 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                            if (var3_3) break block59;
                                                                            if (v7 >= 0) break block60;
                                                                            break block61;
                                                                        }
                                                                        case 69138043: {
                                                                            if (!var3_3) break block62;
                                                                            ** GOTO lbl29
                                                                        }
                                                                        case 69138044: {
                                                                            ** GOTO lbl29
                                                                        }
                                                                        case 69138038: {
                                                                            v8 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)628450052231870599L);
                                                                            if (var3_3) break block45;
                                                                            if (v8 == false) break block46;
                                                                            break block47;
                                                                        }
                                                                        case 69138040: {
                                                                            v9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1282175146993233974L), (long)622868109502394347L);
                                                                            if (var3_3) break block48;
                                                                            if (v9 != false) break block49;
                                                                            break block50;
                                                                        }
                                                                        case 69138041: {
                                                                            if (!var3_3) break block51;
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        case 69138042: lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            hi.a("\u00f2", (Object)this, (double)hi.a("\u00a5", (Object)var14_15, (long)431225985925845942L), (long)595391600233351183L);
                                                                            hi.a("\u00f2", (Object)this, (BlockPos)var11_12, (long)985566735315510172L);
                                                                            hi.a("\u00f2", (Object)this, (Direction)var13_14, (long)884843840457466393L);
                                                                            return true;
                                                                        }
                                                                        case 69138039: 
                                                                    }
                                                                    hi.a("G", (long)459480616877844027L);
                                                                    hi.a("G", (long)804704677991023612L);
                                                                    var15_4 = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)(eW.c(280, 3830475330038136615L) / 4), (int)eW.c(11391, 5660411540978324459L)) - eW.c(12587, 4981728850721230295L);
                                                                    if (!var3_3) ** GOTO lbl-1000
lbl154:
                                                                    // 2 sources

                                                                    v0 = var15_4 = (reference)(eW.c(18009, 3082079462439305165L) / 3 - eW.c(15582, 8138839784873869915L) - eW.c(13499, 4242662800064727884L));
lbl155:
                                                                    // 2 sources

                                                                    if (!var3_3) ** GOTO lbl33
lbl156:
                                                                    // 2 sources

                                                                    var15_4 = hi.a("G", (int)eW.c(351, 3057705809161027122L), (int)eW.c(19838, 8457452165591347502L), (long)834203424483934088L) - eW.c(28241, 2994652119969272346L);
                                                                    if (!var3_3) ** GOTO lbl33
lbl158:
                                                                    // 2 sources

                                                                    v4 /* !! */  = (CallSite)(eW.c(707, 8823880972637962065L) * eW.c(15072, 7735539801453609638L));
                                                                    v5 /* !! */  = (CallSite)eW.c(2806, 1677363155835155254L);
lbl160:
                                                                    // 2 sources

                                                                    var15_4 = (reference)(v4 /* !! */  ^ v5 /* !! */ );
                                                                    if (!var3_3) ** GOTO lbl33
lbl162:
                                                                    // 2 sources

                                                                    var15_4 = (reference)(eW.c(6688, 2844668397027517235L) / 3 - eW.c(32277, 3292574239430443570L) - eW.c(9937, 7925357305571137869L));
                                                                    ** continue;
                                                                }
                                                                v7 = var15_4 = (reference)(hi.a("G", (int)(eW.c(22157, 361061010050100963L) / eW.c(31764, 6863189154801353676L)), (int)eW.c(12928, 8445762025264663548L), (long)834203424483934088L) ^ eW.c(7262, 8187419653318599234L));
                                                            }
                                                            if (!var3_3) ** GOTO lbl-1000
                                                        }
                                                        var15_4 = (reference)(hi.a("G", (int)hi.a("G", (int)eW.c(31641, 5910607646251026337L), (int)eW.c(26877, 6424434523537511897L), (long)834203424483934088L), (int)eW.c(23254, 548816120797471533L), (long)834203424483934088L) ^ eW.c(18227, 395906488767856265L));
                                                        if (!var3_3) ** GOTO lbl-1000
                                                    }
                                                    var15_4 = (reference)(hi.a("G", (int)(eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(26423, 8050924629027166601L), (int)eW.c(19165, 3015204244304114534L)) - eW.c(18654, 1459625370058077909L)), (int)eW.c(28582, 5060760713578025751L), (long)834203424483934088L) ^ eW.c(6889, 6545313726677771549L) ^ eW.c(10137, 4359403105831411683L));
                                                    if (!var3_3) ** GOTO lbl90
                                                    break;
                                                }
                                            }
                                            var15_4 = (reference)((eW.c(10694, 4285647759713883749L) * eW.c(4344, 1092927172051856879L) ^ eW.c(27281, 297209112085206829L)) * eW.c(20940, 9191485549048965214L) ^ eW.c(5243, 122663030483381580L) ^ eW.c(6092, 6448951539420883522L));
                                            if (!var3_3) ** GOTO lbl117
                                        }
                                        var15_4 = (reference)((eW.c(4760, 5577615223739346345L) + eW.c(10447, 9031642905112072663L) ^ eW.c(31661, 2735182668747277511L)) - eW.c(1802, 2579012617162587753L) ^ eW.c(8511, 1263275603783769729L));
                                        if (!var3_3) ** GOTO lbl117
                                    }
                                    v8 = var15_4 = (reference)((eW.c(22753, 988835468675260515L) * eW.c(4938, 8296006421900619618L) ^ eW.c(19479, 6530995679482556801L)) * eW.c(26068, 2336361177675209140L) ^ eW.c(20330, 1386938069403743966L) ^ eW.c(3396, 5617950642524714323L));
                                }
                                if (!var3_3) ** GOTO lbl117
                            }
                            var15_4 = hi.a("G", (int)hi.a("G", (int)((eW.c(12820, 6924291795130076246L) ^ eW.c(12790, 7377996356214574504L)) / 5), (int)eW.c(1419, 6100629262463270274L), (long)834203424483934088L), (int)eW.c(5067, 7528113201676610409L), (long)834203424483934088L) + eW.c(13401, 8349152053706410927L);
                            if (!var3_3) ** GOTO lbl117
                        }
                        v9 = var15_4 = (reference)((eW.c(22753, 988835468675260515L) * eW.c(4938, 8296006421900619618L) ^ eW.c(19479, 6530995679482556801L)) * eW.c(26068, 2336361177675209140L) ^ eW.c(20330, 1386938069403743966L) ^ eW.c(3396, 5617950642524714323L));
                    }
                    if (!var3_3) ** GOTO lbl117
                }
                var15_4 = (reference)(eW.c(16136, 6353850766445985942L) + eW.c(8600, 1121176529932213308L) - eW.c(24664, 8824443313405566442L));
                ** while (!var3_3)
            }
            var15_4 = (reference)(eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)(hi.a("G", (int)eW.c(26423, 8050924629027166601L), (int)eW.c(19165, 3015204244304114534L), (long)834203424483934088L) - eW.c(18654, 1459625370058077909L)), (int)eW.c(28582, 5060760713578025751L)) ^ eW.c(6889, 6545313726677771549L) ^ eW.c(10137, 4359403105831411683L));
            if (var3_3) ** break;
            ** while (true)
        }
        var15_4 = (reference)(hi.a("G", (int)eW.c(22554, 4253937732357891395L), (int)eW.c(6907, 4633557759916466922L), (long)834203424483934088L) + eW.c(23351, 3248444815636341621L) + eW.c(10174, 1573966279900354751L) ^ eW.c(22112, 7478465089840066160L));
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private uK g(Object[] var1_1) {
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
    public int C(Object[] var1_1) {
        block41: {
            block42: {
                block46: {
                    block40: {
                        block39: {
                            var2_2 = Dl.S();
                            var7_3 /* !! */  = eW.c(24370, 9143839531572111000L) / eW.c(8727, 1779277036266675306L) + eW.c(27155, 6687065341111702478L);
                            if (var2_2) ** GOTO lbl15
                            block23: while (true) {
                                block45: {
                                    block44: {
                                        block43: {
                                            v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                            if (!var2_2) break block43;
                                            if (v0 /* !! */  != false) break block44;
                                            v0 /* !! */  = (CallSite)((eW.c(587, 4688261490294718138L) - eW.c(4639, 5093538266550988455L)) / eW.c(8727, 1779277036266675306L) - eW.c(9802, 2533729056509417525L) + eW.c(8412, 6386937871393609887L) - eW.c(2309, 1425979505486131604L));
                                        }
                                        var7_3 /* !! */  = (int)v0 /* !! */ ;
                                        if (var2_2) break block45;
                                    }
                                    var7_3 /* !! */  = eW.c(30331, 4017897794573667881L) / 2 * eW.c(9280, 5243975151765413116L) ^ eW.c(15145, 3684743750998804004L);
                                }
                                switch (var7_3 /* !! */ ) {
                                    default: {
                                        continue block23;
                                    }
                                    case -1263585888: {
                                        return eW.c(19976, 9053506720465891398L);
                                    }
                                    case -1263585887: {
                                        var3_4 = 0;
                                        v1 /* !! */  = eW.F("9hlJEIowNbw9SkuG", t(net.minecraft.world.item.ItemStack ), (eW)this, (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1175532240973568599L));
                                        if (!var2_2) break block39;
                                        if (v1 /* !! */  == false) break block23;
                                        break block40;
                                    }
                                    case -1263585889: {
                                        hi.a("G", (long)979875262789802604L);
                                        return eW.c(24203, 4700334821015005101L);
                                    }
                                }
                                break;
                            }
                            v1 /* !! */  = (CallSite)(eW.c(12646, 1105796191986896814L) ^ eW.c(32111, 2329776742130681321L) ^ eW.c(571, 605897858644278743L) ^ eW.c(19737, 4770125088742847974L) ^ eW.c(5434, 8884756912922355851L));
                        }
                        var7_3 /* !! */  = (int)v1 /* !! */ ;
                        if (var2_2) break block46;
                    }
                    var7_3 /* !! */  = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(21183, 1959941349859077696L), (int)eW.c(16668, 6667719379407224731L)) + eW.c(17363, 5924821863120976882L) ^ eW.c(24077, 6541876774405187246L);
                    if (var2_2) break block46;
                    ** GOTO lbl93
lbl39:
                    // 2 sources

                    while (true) {
                        v2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)729698410435221172L), (Object)hi.a("j", (long)1028094451671047525L), (long)511460060498514638L);
                        if (!var2_2) ** GOTO lbl96
                        if (v2 == false) ** GOTO lbl95
                        ** GOTO lbl98
                        break;
                    }
lbl44:
                    // 2 sources

                    while (true) {
                        block47: {
                            var4_5 = v3 /* !! */ ;
                            var5_6 = 0;
                            if (!var2_2) break block47;
                            var7_3 /* !! */  = eW.c(7599, 2417302913901028396L) / 5 / eW.c(26580, 7334190056549652576L) ^ eW.c(19646, 6098780306132513426L);
                            if (var2_2) break block41;
                            ** GOTO lbl57
                        }
lbl52:
                        // 2 sources

                        while (true) {
                            block49: {
                                block48: {
                                    v4 = var5_6;
                                    v5 = var4_5;
                                    if (!var2_2) break block48;
                                    if (v4 < v5) break block49;
lbl57:
                                    // 2 sources

                                    v4 = eW.c(20774, 9188747428106677257L) - eW.c(15275, 9173218640017016261L) + eW.c(30386, 8600980755619155482L);
                                    v5 = eW.c(8236, 6806772420627978334L);
                                }
                                var7_3 /* !! */  = v4 ^ v5;
                                if (var2_2) break block41;
                            }
                            var7_3 /* !! */  = (eW.c(31630, 3447985833449325920L) + eW.c(18288, 3216307671827102091L) - eW.c(9914, 1617175748444773191L) ^ eW.c(10171, 7559108560142686491L)) + eW.c(7846, 7018843239898179353L);
                            break block41;
                            break;
                        }
                        break;
                    }
lbl65:
                    // 2 sources

                    while (true) {
                        ++var5_6;
                        if (!var2_2) {
                            return var3_4;
                        }
                        ** GOTO lbl152
                        break;
                    }
                }
                block28: while (true) {
                    switch (var7_3 /* !! */ ) {
                        default: {
                            var3_4 += eW.F("9hlJEIowNbw9SkuG", getCount(), (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1175532240973568599L));
                            if (var2_2) break;
                            ** GOTO lbl39
                        }
                        case -1114789278: {
                            ** continue;
                        }
                        case -1114789277: {
                            v3 /* !! */  = (int)eW.F("9hlJEIowNbw9SkuG", getContainerSize(), (Inventory)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1119095325570777413L));
                            var7_3 /* !! */  = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)eW.c(24385, 4513553749960269828L), (int)eW.c(26504, 1590262332743294865L)) / eW.c(26580, 7334190056549652576L) ^ eW.c(32129, 7659641666527167088L) ^ eW.c(24392, 4141589152119267761L);
                            if (!var2_2) {
                                break block28;
                            }
                            break block42;
                        }
                        case -1114789275: {
                            v3 /* !! */  = eW.c(705, 1190033084118400856L);
                            if (var2_2) break block28;
                            ** GOTO lbl44
                        }
                        case -1114789276: {
                            hi.a("G", (long)1082142115168457609L);
                            return (int)hi.a("G", (long)979899430926065004L);
                        }
                    }
lbl93:
                    // 2 sources

                    var7_3 /* !! */  = eW.c(21057, 2765540208875744288L) ^ eW.c(4863, 8759236779066354910L) ^ eW.c(23123, 4555377780462364640L) ^ eW.c(23592, 5353679425425121290L) ^ eW.c(17831, 1932439079787052449L);
                    if (var2_2) continue;
lbl95:
                    // 2 sources

                    v2 = hi.a("G", (int)(eW.c(3174, 6023778867630896619L) * eW.c(30115, 6578730139315374929L) * eW.c(16341, 7266529922409285480L)), (int)eW.c(10679, 3263873999477231749L), (long)834203424483934088L) - eW.c(29266, 2547299840924355191L);
lbl96:
                    // 2 sources

                    var7_3 /* !! */  = (int)v2;
                    if (var2_2) continue;
lbl98:
                    // 2 sources

                    var7_3 /* !! */  = (eW.c(13980, 5470377621979090472L) * eW.c(26428, 2288608818556279352L) ^ eW.c(26179, 8595120212188045079L)) + eW.c(15272, 3507788635678951135L);
                }
                var7_3 /* !! */  = hi.a("G", (int)eW.c(17821, 1113485664677017905L), (int)eW.c(28629, 6455928726936131542L), (long)834203424483934088L) / eW.c(26580, 7334190056549652576L) ^ eW.c(20787, 508269071310499024L) ^ eW.c(28183, 4722562116754019231L);
            }
            while (true) {
                switch (var7_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 33630275: 
                }
                hi.a("G", (long)427998708925187485L);
                hi.a("G", (long)957299721117170898L);
                var7_3 /* !! */  = eW.c(31960, 4091965627166228826L) + eW.c(19947, 8917935289588428853L) - eW.c(2416, 176229990445118670L);
            }
        }
        while (true) {
            block50: {
                switch (var7_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1605706552: {
                        var6_7 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1119095325570777413L), (int)var5_6, (long)449627806291078247L);
                        v6 /* !! */  = hi.a("\u00a5", (Object)this, (Object)var6_7, (long)1216873899594628740L);
                        if (!var2_2) ** GOTO lbl131
                        if (v6 /* !! */  == false) ** GOTO lbl130
                        ** GOTO lbl133
                    }
                    case -1605706550: {
                        hi.a("G", (long)541698517340995912L);
                        hi.a("G", (boolean)false, (long)765835270298926806L);
                        return (int)hi.a("G", (long)405872435149102496L);
                    }
lbl130:
                    // 1 sources

                    v6 /* !! */  = (CallSite)((hi.a("G", (int)hi.a("G", (int)eW.c(4462, 643660488748066966L), (int)eW.c(27360, 8960927528952895248L), (long)834203424483934088L), (int)eW.c(30744, 6378011586225505503L), (long)834203424483934088L) ^ eW.c(6261, 4305253795116771191L)) + eW.c(5420, 3950981209701772425L));
lbl131:
                    // 2 sources

                    var7_3 /* !! */  = (int)v6 /* !! */ ;
                    if (var2_2) break block50;
lbl133:
                    // 2 sources

                    var7_3 /* !! */  = eW.c(5982, 6628974890604423184L) + eW.c(18036, 1109902976872823628L) - eW.c(21523, 5262776474322872918L);
                    if (var2_2) break block50;
                    ** GOTO lbl150
                    case -1605706549: 
                }
                return var3_4;
            }
            do {
                switch (var7_3 /* !! */ ) {
                    default: {
                        var3_4 += hi.a("\u00a5", (Object)var6_7, (long)1254473531759764347L);
                        if (var2_2) break;
                        ** GOTO lbl65
                    }
                    case -1892706760: {
                        ** continue;
                    }
                    case -1892706759: {
                        throw null;
                    }
                }
lbl150:
                // 2 sources

                var7_3 /* !! */  = (eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)hi.a("G", (int)eW.c(31976, 8051589217183761484L), (int)eW.c(96, 2266682884394941933L), (long)834203424483934088L), (int)eW.c(20787, 2043123489720740140L)) ^ eW.c(19192, 4655350762020844674L)) + eW.c(31551, 3579584751058322573L);
            } while (var2_2);
lbl152:
            // 2 sources

            var7_3 /* !! */  = eW.c(6832, 5229941012613981439L) / 5 / eW.c(26580, 7334190056549652576L) ^ eW.c(6149, 4359631802105357584L);
        }
    }

    private boolean lambda$new$4() {
        boolean bl = Dl.S();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1115721325559177674L), (Object)hi.a("j", (long)1270343827400781957L), (long)511460060498514638L);
        if (bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    private static boolean lambda$new$1(long l, long l2, Dr dr) {
        boolean bl = Dl.S();
        long l3 = l - hi.a("\u00a5", (Object)dr, (long)558215302332514818L) - l2;
        long l5 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (bl) {
            l5 = l5 > 0 ? (long)1 : (long)0;
        }
        return (boolean)l5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void b(Object[] var1_1) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var2_2 = Dl.t();
                        var3_3 /* !! */  = eW.c(14593, 6557312120728766411L) / eW.c(8727, 1779277036266675306L) * eW.c(18743, 4605031582456264040L) * eW.c(16920, 2039528561775688852L) / eW.c(8727, 1779277036266675306L) ^ eW.c(24638, 4326250026448264426L);
                        if (var2_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                hi.a("\u00f2", (Object)this, (int)0, (long)693424316913199608L);
                                hi.a("\u00f2", (Object)this, (boolean)false, (long)1145101457761299088L);
                                hi.a("\u00f2", (Object)this, (boolean)false, (long)468704053310521345L);
                                v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)676622328071995195L);
                                if (var2_2) break block12;
                                if (v0 /* !! */  == false) break block13;
                                break block14;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                eW.F("9hlJEIowNbw9SkuG", l());
                                hi.a("\u00f2", (Object)this, (boolean)false, (long)676622328071995195L);
                                if (var2_2) {
lbl18:
                                    // 2 sources

                                    while (true) {
                                        hi.a("G", (long)692983194225517364L);
lbl21:
                                        // 2 sources

                                        return;
                                    }
                                }
                                break block15;
                                break;
                            }
                        }
lbl24:
                        // 5 sources

                        while (true) {
                            switch (var3_3 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case -70931478: {
                                    ** continue;
                                }
                                case -70931476: {
                                    ** continue;
                                }
                                ** case -70931479:
lbl33:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    v0 /* !! */  = (CallSite)((eW.c(23069, 9205563406740203393L) - eW.c(22261, 5137553594018769811L) - eW.c(22971, 6339634386749465812L) - eW.c(31233, 3653433402079511533L)) / 2 ^ eW.c(31346, 6331419806693033901L));
                }
                var3_3 /* !! */  = (int)v0 /* !! */ ;
                if (!var2_2) ** GOTO lbl24
            }
            var3_3 /* !! */  = (eW.c(1217, 8584764178839010166L) ^ eW.c(20176, 1957163287278958244L)) - eW.c(18590, 1158085362974242386L) + eW.c(21917, 7949819485390743668L);
            if (!var2_2) ** GOTO lbl24
        }
        var3_3 /* !! */  = (eW.c(8609, 1654662051756629666L) - eW.c(4199, 8955453485619539665L) - eW.c(20721, 3278803837968853398L) - eW.c(12900, 3701697136233335565L)) / 2 ^ eW.c(11798, 2435706853143761055L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Vec3 r(Object[] var1_1) {
        block43: {
            block42: {
                block47: {
                    block40: {
                        block41: {
                            block39: {
                                block38: {
                                    block46: {
                                        block36: {
                                            block37: {
                                                block35: {
                                                    block34: {
                                                        block33: {
                                                            block45: {
                                                                block32: {
                                                                    block30: {
                                                                        block31: {
                                                                            block44: {
                                                                                var3_2 = (BlockPos)var1_1[0];
                                                                                var2_3 = (Direction)var1_1[1];
                                                                                var4_4 = Dl.S();
                                                                                var11_5 /* !! */  = eW.c(2899, 7378265547357189210L) * eW.c(5327, 7162221870502537450L) + eW.c(16278, 4507124612490413848L) + eW.c(22823, 8690455727224595932L);
                                                                                if (var4_4) break block44;
lbl8:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    eW.F("9hlJEIowNbw9SkuG", Z());
lbl10:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        v0 /* !! */  = (int)hi.a("\u00a5", (Object)var3_2, (long)918555824711552631L);
lbl12:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            var5_6 = (double)v0 /* !! */  + 0.5;
                                                                                            var7_7 = (double)hi.a("\u00a5", (Object)var3_2, (long)491002271509294121L) + 0.5;
                                                                                            var9_8 = (double)hi.a("\u00a5", (Object)var3_2, (long)1003954676294969181L) + 0.5;
                                                                                            if (!var4_4) break block30;
                                                                                            if (var2_3 == hi.a("j", (long)1151726402263101942L)) break block31;
                                                                                            break block32;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
lbl19:
                                                                                // 1 sources

                                                                                while (var2_3 != hi.a("j", (long)1264475993069188471L)) {
                                                                                    break block33;
                                                                                }
                                                                                break block45;
lbl22:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var7_7 += 0.08;
                                                                                    if (var4_4) break block34;
lbl25:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var5_6 += hi.a("G", (double)-0.3, (double)0.3, (long)449984074118786580L);
                                                                                        var9_8 += hi.a("G", (double)-0.3, (double)0.3, (long)449984074118786580L);
                                                                                        if (var4_4) break block35;
lbl29:
                                                                                        // 2 sources

                                                                                        while (var2_3 != hi.a("j", (long)1288569935803079200L)) {
                                                                                            break block36;
                                                                                        }
                                                                                        break block37;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
lbl32:
                                                                                // 1 sources

                                                                                while (var2_3 == hi.a("j", (long)1329014337449352013L)) {
                                                                                    break block38;
                                                                                }
                                                                                break block46;
lbl35:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var9_8 += eW.F("9hlJEIowNbw9SkuG", C(double double ), (double)-0.3, (double)0.3);
                                                                                    if (var4_4) break block39;
lbl38:
                                                                                    // 2 sources

                                                                                    while (var2_3 != hi.a("j", (long)632856347589150308L)) {
                                                                                        break block40;
                                                                                    }
                                                                                    break block41;
                                                                                    break;
                                                                                }
lbl41:
                                                                                // 1 sources

                                                                                while (var2_3 == hi.a("j", (long)588800373273392023L)) {
                                                                                    break block42;
                                                                                }
                                                                                break block47;
lbl44:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var5_6 += hi.a("G", (double)-0.3, (double)0.3, (long)449984074118786580L);
                                                                                    if (!var4_4) lbl-1000:
                                                                                    // 2 sources

                                                                                    {
                                                                                        return new Vec3(var5_6, var7_7, var9_8);
                                                                                    }
                                                                                    break block43;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            v0 /* !! */  = var11_5 /* !! */ ;
                                                                            ** while (!var4_4)
lbl53:
                                                                            // 1 sources

                                                                            switch (v0 /* !! */ ) {
                                                                                case -1267386092: {
                                                                                    ** continue;
                                                                                }
                                                                                ** default:
lbl57:
                                                                                // 1 sources

                                                                                ** continue;
                                                                            }
lbl58:
                                                                            // 16 sources

                                                                            while (true) {
                                                                                switch (var11_5 /* !! */ ) {
                                                                                    default: {
                                                                                        ** GOTO lbl19
                                                                                    }
                                                                                    case -201819257: {
                                                                                        ** continue;
                                                                                    }
                                                                                    case -201819249: {
                                                                                        ** continue;
                                                                                    }
                                                                                    case -201819248: {
                                                                                        ** GOTO lbl29
                                                                                    }
                                                                                    case -201819258: {
                                                                                        ** GOTO lbl32
                                                                                    }
                                                                                    case -201819254: {
                                                                                        ** continue;
                                                                                    }
                                                                                    case -201819250: {
                                                                                        ** GOTO lbl38
                                                                                    }
                                                                                    case -201819255: {
                                                                                        ** GOTO lbl41
                                                                                    }
                                                                                    case -201819252: {
                                                                                        ** continue;
                                                                                    }
                                                                                    case -201819256: {
                                                                                        ** continue;
                                                                                    }
                                                                                    case -201819251: 
                                                                                }
                                                                                hi.a("G", (long)1081365241454200148L);
                                                                                return null;
                                                                            }
                                                                        }
                                                                        var11_5 /* !! */  = (int)(hi.a("G", (int)eW.c(30397, 55244628372556228L), (int)eW.c(6152, 5581740676899661467L), (long)834203424483934088L) * eW.c(1455, 3566219073390017402L) + eW.c(4259, 91286606127393230L));
                                                                    }
                                                                    if (var4_4) ** GOTO lbl58
                                                                }
                                                                var11_5 /* !! */  = (eW.c(1185, 2296252155422112620L) - eW.c(9258, 4553716660723211046L)) * eW.c(23125, 4243350753813111839L) ^ eW.c(12132, 8962691131507659155L);
                                                                if (var4_4) ** GOTO lbl58
                                                            }
                                                            var11_5 /* !! */  = (int)(hi.a("G", (int)eW.c(5596, 1142970063816943814L), (int)eW.c(25262, 1887006844034877L), (long)834203424483934088L) * eW.c(32177, 1373254874641663463L) + eW.c(18620, 4162309467159115640L));
                                                            if (var4_4) ** GOTO lbl58
                                                        }
                                                        var11_5 /* !! */  = (int)(hi.a("G", (int)(eW.c(27077, 642684450553468247L) ^ eW.c(31166, 1120951173429823178L)), (int)eW.c(2801, 3415086770696680708L), (long)834203424483934088L) - eW.c(10135, 7782819284901517439L));
                                                        if (var4_4) ** GOTO lbl58
                                                    }
                                                    var11_5 /* !! */  = (int)(hi.a("G", (int)eW.c(20660, 1900305257816074605L), (int)eW.c(31087, 4310479945227108760L), (long)834203424483934088L) + eW.c(15501, 8316897876098695721L));
                                                    if (var4_4) ** GOTO lbl58
                                                }
                                                var11_5 /* !! */  = (int)(hi.a("G", (int)eW.c(16926, 8134741351702576458L), (int)eW.c(4056, 3562219010991354869L), (long)834203424483934088L) + eW.c(23467, 741537313834051516L));
                                                if (var4_4) ** GOTO lbl58
                                            }
                                            var11_5 /* !! */  = (eW.c(8041, 1712908228668121150L) + eW.c(14547, 4404563904932955994L) ^ eW.c(6599, 8076439180442166495L) ^ eW.c(22408, 2330842474868844910L)) - eW.c(21629, 5625455462428847319L);
                                            if (var4_4) ** GOTO lbl58
                                        }
                                        var11_5 /* !! */  = (int)(hi.a("G", (int)eW.c(3037, 6042667891923547244L), (int)eW.c(32376, 1370018040620384871L), (long)834203424483934088L) + eW.c(11535, 611247327909400668L));
                                        if (var4_4) ** GOTO lbl58
                                    }
                                    var11_5 /* !! */  = ((eW.c(16457, 3046667555533700322L) ^ eW.c(27367, 581222506557215734L)) + eW.c(1183, 1863945908377582316L)) / 3 + eW.c(1940, 6597946585793296509L);
                                    if (var4_4) ** GOTO lbl58
                                }
                                var11_5 /* !! */  = (eW.c(13582, 7794622892824250735L) + eW.c(17403, 2472443122498583489L) ^ eW.c(19422, 3790720315871179978L) ^ eW.c(22496, 6426743016746789863L)) - eW.c(9313, 3785289572190705943L);
                                if (var4_4) ** GOTO lbl58
                            }
                            var11_5 /* !! */  = ((eW.c(17534, 9196593649299439009L) ^ eW.c(7449, 3841883809365189984L)) + eW.c(21357, 2143904349423840689L)) / 3 + eW.c(20636, 5804627236564971153L);
                            if (var4_4) ** GOTO lbl58
                        }
                        var11_5 /* !! */  = eW.c(11205, 7223602877418854184L) * eW.c(21574, 5605059624569842199L) - eW.c(15191, 497580473851953713L) ^ eW.c(25513, 3155958129980153587L);
                        if (var4_4) ** GOTO lbl58
                    }
                    var11_5 /* !! */  = eW.c(3945, 6858975451175875093L) - eW.c(646, 8698121070229225253L) + eW.c(8965, 1642277732719516340L);
                    if (var4_4) ** GOTO lbl58
                }
                var11_5 /* !! */  = (eW.c(23064, 8451304130648843378L) - eW.c(27433, 2737163934908847276L)) / eW.c(8727, 1779277036266675306L) + eW.c(20500, 157077494984517851L);
                if (var4_4) ** GOTO lbl58
            }
            var11_5 /* !! */  = eW.c(25506, 5273917496507013880L) * eW.c(550, 3198964900443094165L) - eW.c(14956, 3701881674062546580L) ^ eW.c(16850, 3180463143160364552L);
            if (var4_4) ** GOTO lbl58
        }
        var11_5 /* !! */  = (eW.c(4322, 6540999778294295746L) - eW.c(596, 2881045280133054077L)) / eW.c(8727, 1779277036266675306L) + eW.c(27929, 5453732701057258206L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean f() {
        var1_1 = Dl.S();
        var2_2 /* !! */  = hi.a("G", (int)eW.c(30018, 6221049462931884228L), (int)eW.c(21620, 4012703385498429786L), (long)834203424483934088L) - eW.c(19455, 2829125440004699017L);
        if (var1_1) ** GOTO lbl14
        block11: while (true) {
            block16: {
                block15: {
                    block14: {
                        v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)963573612004996929L), (long)669662444188596841L);
                        if (!var1_1) break block14;
                        if (v0 /* !! */  != false) break block15;
                        v0 /* !! */  = var2_2 /* !! */  = (reference)((eW.c(16530, 8437171315761593744L) ^ eW.c(17562, 1964989868779814186L) ^ eW.c(11299, 1439886643105845817L)) / eW.c(8727, 1779277036266675306L) ^ eW.c(21930, 8649028100593855095L));
                    }
                    if (var1_1) break block16;
                }
                var2_2 /* !! */  = hi.a("G", (int)((eW.c(1050, 8510977864768388238L) - eW.c(26466, 1063695644429588637L)) * eW.c(22543, 292622917998945957L) * eW.c(435, 9005034541447937451L)), (int)eW.c(12415, 3100161541445176529L), (long)834203424483934088L) - eW.c(22134, 4926808237040742255L);
                if (!var1_1) ** GOTO lbl43
            }
            block12: while (true) {
                switch (var2_2 /* !! */ ) {
                    default: {
                        continue block11;
                    }
                    case 293755986: {
                        v1 /* !! */  = eW.F("9hlJEIowNbw9SkuG", i(E ), (Dx)hi.a("\u00e9", (Object)this, (long)729698410435221172L), (Enum)hi.a("j", (long)916789227560389476L));
                        if (!var1_1) ** GOTO lbl44
                        if (v1 /* !! */  == false) ** GOTO lbl43
                        ** GOTO lbl45
                    }
                    case 293755987: {
                        v2 /* !! */  = hi.a("\u00a5", (Object)this, (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1119095325570777413L), (long)959943593820214765L), (long)1216873899594628740L);
                        if (!var1_1) ** GOTO lbl48
                        if (v2 /* !! */  == false) ** GOTO lbl47
                        ** GOTO lbl49
                    }
                    case 293755991: {
                        v3 = true;
                        var2_2 /* !! */  = (reference)(eW.c(29623, 7649943241077820509L) + eW.c(4903, 4677926469252148650L) ^ eW.c(10648, 5129860541127841601L));
                        if (var1_1) ** GOTO lbl52
                        ** GOTO lbl51
                    }
                    case 293755992: {
                        v3 = false;
                        if (!var1_1) {
                            return v3;
                        }
                        ** GOTO lbl51
                    }
                    case 293755990: {
                        hi.a("G", (float)0.0f, (long)671146500863747464L);
                        return false;
                    }
lbl43:
                    // 2 sources

                    v1 /* !! */  = var2_2 /* !! */  = (reference)(eW.c(11745, 1443628085862617359L) - eW.c(30771, 7245871594304276225L) + eW.c(30103, 2760241535454022377L));
lbl44:
                    // 2 sources

                    if (var1_1) continue block12;
lbl45:
                    // 2 sources

                    var2_2 /* !! */  = (reference)((eW.c(13855, 8748556257130924303L) + eW.c(3459, 5356863690789877105L) - eW.c(17403, 2537564191684770533L)) * eW.c(12846, 8860595696895871631L) - eW.c(15138, 5707335862992258734L) ^ eW.c(24855, 3842869429440027960L));
                    if (var1_1) continue block12;
lbl47:
                    // 2 sources

                    v2 /* !! */  = var2_2 /* !! */  = hi.a("G", (int)(eW.c(15610, 3010733299885359489L) / eW.c(8727, 1779277036266675306L)), (int)eW.c(12068, 6135181750037270693L), (long)834203424483934088L) + eW.c(9917, 4149156710065756720L);
lbl48:
                    // 2 sources

                    if (var1_1) continue block12;
lbl49:
                    // 2 sources

                    var2_2 /* !! */  = (reference)(eW.c(1533, 647070004226226778L) - eW.c(15513, 430567995434353197L) + eW.c(27749, 1465194854586978393L));
                    continue block12;
lbl51:
                    // 2 sources

                    var2_2 /* !! */  = (reference)(eW.c(32677, 6343459163422131926L) + eW.c(23345, 7726175340563802088L) ^ eW.c(26735, 252630918438098722L));
lbl52:
                    // 2 sources

                    switch (var2_2 /* !! */ ) {
                        default: {
                            return v3;
                        }
                        case -1631420647: 
                    }
                    throw null;
                    case 293755988: 
                }
                break;
            }
            break;
        }
        return (boolean)eW.F("9hlJEIowNbw9SkuG", t(net.minecraft.world.item.ItemStack ), (eW)this, (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1175532240973568599L));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private lz u(Object[] var1_1) {
        block18: {
            block17: {
                block19: {
                    var2_2 = Dl.S();
                    var4_3 = hi.a("G", (int)((eW.c(10643, 7253493526465335298L) ^ eW.c(10917, 7225022054629069870L)) + eW.c(22059, 2009653219885263585L)), (int)eW.c(16372, 8030250052394336983L), (long)834203424483934088L) + eW.c(12887, 8948282533641998178L);
                    if (var2_2) break block19;
lbl5:
                    // 2 sources

                    while (true) {
                        block21: {
                            block20: {
                                var3_4 = eW.F("9hlJEIowNbw9SkuG", getOffhandItem(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                                v0 = eW.F("9hlJEIowNbw9SkuG", t(net.minecraft.world.item.ItemStack ), (eW)this, (ItemStack)var3_4);
                                if (!var2_2) break block20;
                                if (v0 != false) break block21;
                                v0 = var4_3 = (reference)(hi.a("G", (int)(hi.a("G", (int)(eW.c(9711, 9169679959980104310L) + eW.c(24625, 3159863686931586611L)), (int)eW.c(15830, 5099918772469711553L), (long)834203424483934088L) ^ eW.c(12255, 6683698230163461976L)), (int)eW.c(2792, 973202165015442021L), (long)834203424483934088L) ^ eW.c(25247, 5253199913052970139L));
                            }
                            if (var2_2) break block17;
                        }
                        var4_3 = (reference)(hi.a("G", (int)hi.a("G", (int)eW.c(6351, 1651069367024116135L), (int)eW.c(18878, 1254113389330773575L), (long)834203424483934088L), (int)eW.c(4320, 7946071624017668226L), (long)834203424483934088L) ^ eW.c(28729, 4883078821509401786L));
                        if (var2_2) break block17;
                        ** GOTO lbl49
                        break;
                    }
                }
                while (true) {
                    switch (var4_3) {
                        default: {
                            ** continue;
                        }
                        case -195118611: 
                    }
                    hi.a("G", (float)-13.0f, (float)1.0f, (long)730361849522875513L);
                    hi.a("G", (int)5, (int)-1, (long)1169154015991105135L);
                    var4_3 = (reference)((eW.c(12626, 4096711415619866024L) + eW.c(1913, 1489178662982121667L)) * eW.c(23141, 861914720670394325L) + eW.c(2092, 4296738012298835175L) ^ eW.c(18589, 2518864331606964071L));
                }
            }
            block14: while (true) {
                block23: {
                    block22: {
                        switch (var4_3) {
                            case 1825922424: {
                                v1 = eW.F("9hlJEIowNbw9SkuG", i(E ), (Dx)hi.a("\u00e9", (Object)this, (long)729698410435221172L), (Enum)hi.a("j", (long)1028094451671047525L));
                                if (!var2_2) break block22;
                                if (v1 == false) break;
                                break block23;
                            }
                            case 1825922425: {
                                v2 = hi.a("G", (Object)new Object[]{(Predicate<ItemStack>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, t(net.minecraft.world.item.ItemStack ), (Lnet/minecraft/world/item/ItemStack;)Z)((eW)this)}, (long)402614237701564139L);
                                var4_3 = hi.a("G", (int)(hi.a("G", (int)eW.c(29583, 4476100004711042297L), (int)eW.c(25360, 7974539261756480197L), (long)834203424483934088L) * eW.c(2034, 3777451550530731841L)), (int)eW.c(32124, 5759753331882263929L), (long)834203424483934088L) - eW.c(186, 6952838986207657892L) - eW.c(6659, 1276513873520944560L);
                                if (!var2_2) {
                                    break block14;
                                }
                                break block18;
                            }
                            case 1825922422: {
                                v2 = hi.a("G", (Predicate<ItemStack>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, t(net.minecraft.world.item.ItemStack ), (Lnet/minecraft/world/item/ItemStack;)Z)((eW)this), (long)597481681569354723L);
                                if (var2_2) break block14;
                                return v2;
                            }
                            case 1825922426: {
                                throw null;
                            }
                        }
lbl49:
                        // 2 sources

                        v1 = var4_3 = (reference)((hi.a("G", (int)(eW.c(13712, 5166913444822665992L) / eW.c(26580, 7334190056549652576L)), (int)eW.c(17477, 4111683828855585399L), (long)834203424483934088L) - eW.c(8594, 1458023798678838675L)) / eW.c(8727, 1779277036266675306L) ^ eW.c(18671, 1073805451584975167L));
                    }
                    if (var2_2) continue;
                }
                var4_3 = (reference)(eW.c(12825, 6737060281683726280L) ^ eW.c(9431, 8797045352863881246L) ^ eW.c(2546, 5239565426819954445L));
            }
            var4_3 = eW.F("9hlJEIowNbw9SkuG", max(int int ), (int)(hi.a("G", (int)eW.c(23524, 2623123820294678397L), (int)eW.c(11671, 8178885927327978931L), (long)834203424483934088L) * eW.c(12970, 3946674888100957862L)), (int)eW.c(15237, 1687496232187119190L)) - eW.c(3352, 3624472210931446531L) - eW.c(24628, 2703628042216806673L);
        }
        switch (var4_3) {
            default: {
                return v2;
            }
            case 1457430307: 
        }
        hi.a("G", (long)513075350433525267L);
        hi.a("G", (long)eW.d(16799, 8925036700034173963L), (long)542844126275779296L);
        return null;
        return new lz(eW.c(23790, 4026622898719760799L), (int)hi.a("\u00a5", (Object)var3_4, (long)1254473531759764347L), (int)hi.a("\u00a5", (Object)var3_4, (long)1262789791163377495L));
    }

    /*
     * Exception decompiling
     */
    @yE
    private void F(dR var1_1) {
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

    private boolean lambda$new$5() {
        return (boolean)eW.F("9hlJEIowNbw9SkuG", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)1115721325559177674L)), (Enum)((Object)hi.a("j", (long)792803114442146796L)));
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFBFA6) & 0xFFFF;
        if (cb[n3] == null) {
            int n4;
            char[] cArray = w[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 2;
                case 1 -> 29;
                case 2 -> 31;
                case 3 -> 183;
                case 4 -> 146;
                case 5 -> 36;
                case 6 -> 54;
                case 7 -> 55;
                case 8 -> 8;
                case 9 -> 175;
                case 10 -> 118;
                case 11 -> 252;
                case 12 -> 10;
                case 13 -> 238;
                case 14 -> 40;
                case 15 -> 254;
                case 16 -> 117;
                case 17 -> 81;
                case 18 -> 69;
                case 19 -> 59;
                case 20 -> 30;
                case 21 -> 112;
                case 22 -> 190;
                case 23 -> 187;
                case 24 -> 88;
                case 25 -> 217;
                case 26 -> 197;
                case 27 -> 50;
                case 28 -> 126;
                case 29 -> 144;
                case 30 -> 5;
                case 31 -> 166;
                case 32 -> 210;
                case 33 -> 136;
                case 34 -> 221;
                case 35 -> 237;
                case 36 -> 201;
                case 37 -> 131;
                case 38 -> 184;
                case 39 -> 104;
                case 40 -> 233;
                case 41 -> 16;
                case 42 -> 91;
                case 43 -> 179;
                case 44 -> 108;
                case 45 -> 203;
                case 46 -> 63;
                case 47 -> 66;
                case 48 -> 28;
                case 49 -> 189;
                case 50 -> 60;
                case 51 -> 214;
                case 52 -> 32;
                case 53 -> 132;
                case 54 -> 107;
                case 55 -> 148;
                case 56 -> 33;
                case 57 -> 96;
                case 58 -> 70;
                case 59 -> 200;
                case 60 -> 247;
                case 61 -> 15;
                case 62 -> 128;
                case 63 -> 99;
                case 64 -> 231;
                case 65 -> 215;
                case 66 -> 191;
                case 67 -> 80;
                case 68 -> 253;
                case 69 -> 93;
                case 70 -> 174;
                case 71 -> 145;
                case 72 -> 109;
                case 73 -> 45;
                case 74 -> 194;
                case 75 -> 234;
                case 76 -> 171;
                case 77 -> 100;
                case 78 -> 58;
                case 79 -> 94;
                case 80 -> 106;
                case 81 -> 115;
                case 82 -> 23;
                case 83 -> 134;
                case 84 -> 84;
                case 85 -> 138;
                case 86 -> 52;
                case 87 -> 236;
                case 88 -> 75;
                case 89 -> 25;
                case 90 -> 224;
                case 91 -> 227;
                case 92 -> 11;
                case 93 -> 230;
                case 94 -> 74;
                case 95 -> 235;
                case 96 -> 101;
                case 97 -> 251;
                case 98 -> 216;
                case 99 -> 186;
                case 100 -> 24;
                case 101 -> 95;
                case 102 -> 82;
                case 103 -> 123;
                case 104 -> 193;
                case 105 -> 9;
                case 106 -> 218;
                case 107 -> 199;
                case 108 -> 244;
                case 109 -> 17;
                case 110 -> 67;
                case 111 -> 76;
                case 112 -> 142;
                case 113 -> 68;
                case 114 -> 103;
                case 115 -> 158;
                case 116 -> 182;
                case 117 -> 209;
                case 118 -> 113;
                case 119 -> 245;
                case 120 -> 122;
                case 121 -> 89;
                case 122 -> 85;
                case 123 -> 151;
                case 124 -> 162;
                case 125 -> 188;
                case 126 -> 129;
                case 127 -> 239;
                case 128 -> 223;
                case 129 -> 90;
                case 130 -> 196;
                case 131 -> 72;
                case 132 -> 154;
                case 133 -> 13;
                case 134 -> 157;
                case 135 -> 212;
                case 136 -> 143;
                case 137 -> 57;
                case 138 -> 56;
                case 139 -> 116;
                case 140 -> 205;
                case 141 -> 219;
                case 142 -> 61;
                case 143 -> 4;
                case 144 -> 178;
                case 145 -> 51;
                case 146 -> 232;
                case 147 -> 6;
                case 148 -> 37;
                case 149 -> 192;
                case 150 -> 27;
                case 151 -> 243;
                case 152 -> 153;
                case 153 -> 249;
                case 154 -> 250;
                case 155 -> 35;
                case 156 -> 170;
                case 157 -> 0;
                case 158 -> 26;
                case 159 -> 241;
                case 160 -> 169;
                case 161 -> 97;
                case 162 -> 53;
                case 163 -> 92;
                case 164 -> 79;
                case 165 -> 163;
                case 166 -> 198;
                case 167 -> 164;
                case 168 -> 119;
                case 169 -> 149;
                case 170 -> 160;
                case 171 -> 207;
                case 172 -> 124;
                case 173 -> 202;
                case 174 -> 12;
                case 175 -> 156;
                case 176 -> 240;
                case 177 -> 204;
                case 178 -> 3;
                case 179 -> 83;
                case 180 -> 78;
                case 181 -> 48;
                case 182 -> 46;
                case 183 -> 77;
                case 184 -> 181;
                case 185 -> 44;
                case 186 -> 177;
                case 187 -> 43;
                case 188 -> 65;
                case 189 -> 229;
                case 190 -> 242;
                case 191 -> 220;
                case 192 -> 62;
                case 193 -> 105;
                case 194 -> 165;
                case 195 -> 167;
                case 196 -> 127;
                case 197 -> 73;
                case 198 -> 64;
                case 199 -> 139;
                case 200 -> 137;
                case 201 -> 49;
                case 202 -> 18;
                case 203 -> 152;
                case 204 -> 172;
                case 205 -> 7;
                case 206 -> 86;
                case 207 -> 222;
                case 208 -> 98;
                case 209 -> 248;
                case 210 -> 150;
                case 211 -> 246;
                case 212 -> 133;
                case 213 -> 147;
                case 214 -> 176;
                case 215 -> 87;
                case 216 -> 228;
                case 217 -> 19;
                case 218 -> 111;
                case 219 -> 206;
                case 220 -> 39;
                case 221 -> 225;
                case 222 -> 114;
                case 223 -> 135;
                case 224 -> 41;
                case 225 -> 159;
                case 226 -> 141;
                case 227 -> 168;
                case 228 -> 155;
                case 229 -> 110;
                case 230 -> 208;
                case 231 -> 185;
                case 232 -> 121;
                case 233 -> 130;
                case 234 -> 22;
                case 235 -> 173;
                case 236 -> 14;
                case 237 -> 20;
                case 238 -> 211;
                case 239 -> 195;
                case 240 -> 161;
                case 241 -> 120;
                case 242 -> 102;
                case 243 -> 21;
                case 244 -> 255;
                case 245 -> 71;
                case 246 -> 42;
                case 247 -> 125;
                case 248 -> 47;
                case 249 -> 38;
                case 250 -> 1;
                case 251 -> 226;
                case 252 -> 34;
                case 253 -> 140;
                case 254 -> 213;
                default -> 180;
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
            eW.cb[n3] = new String(cArray).intern();
        }
        return cb[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7CFD;
        if (eb[n2] == null) {
            eW.eb[n2] = (int)(db[n2] ^ l);
        }
        return eb[n2];
    }

    private static long d(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x4D95) & Short.MAX_VALUE;
        if (kb[n2] == null) {
            eW.kb[n2] = jb[n2] ^ l;
        }
        return kb[n2];
    }
}
