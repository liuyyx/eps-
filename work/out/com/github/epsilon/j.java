/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.DeltaTracker
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Position
 *  net.minecraft.core.Vec3i
 *  net.minecraft.world.InteractionResult$Fail
 *  net.minecraft.world.InteractionResult$Success
 *  net.minecraft.world.phys.BlockHitResult
 *  net.minecraft.world.phys.HitResult
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.dj;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class j
extends e {
    public static final j B;
    private final Set<BlockPos> D = new ObjectOpenHashSet();
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void Y(dj var1_1) {
        block51: {
            block60: {
                block54: {
                    block52: {
                        block53: {
                            block59: {
                                block50: {
                                    block49: {
                                        var2_2 = Dl.t();
                                        var12_3 /* !! */  = hi.a("G", (int)j.c(12654, 7851022138311092147L), (int)j.c(23149, 7594782596236692608L), (long)834203424483934088L) * j.c(18417, 3253400661208093015L) + j.c(12399, 4087165307108959902L);
                                        if (!var2_2) ** GOTO lbl13
                                        block29: while (true) {
                                            block58: {
                                                block57: {
                                                    block56: {
                                                        v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1330274766107390732L), (long)622868109502394347L);
                                                        if (var2_2) break block56;
                                                        if (v0 /* !! */  == false) break block57;
                                                        v0 /* !! */  = var12_3 /* !! */  = (reference)((j.c(24812, 6470525584825349689L) * j.c(31956, 2984722821779089988L) / j.c(15631, 3633732529656736711L) ^ j.c(20811, 3348701426564122619L)) - j.c(17622, 6278612151684747789L));
                                                    }
                                                    if (!var2_2) break block58;
                                                }
                                                var12_3 /* !! */  = (reference)(hi.a("G", (int)(j.c(27255, 4479422386248907986L) / j.c(14296, 4417495541825216833L)), (int)j.c(17847, 172078716919206752L), (long)834203424483934088L) ^ j.c(13753, 3363307981630219075L));
                                            }
                                            switch (var12_3 /* !! */ ) {
                                                default: {
                                                    continue block29;
                                                }
                                                case 643255481: {
                                                    return;
                                                }
                                                case 643255483: {
                                                    var3_4 = j.O("9OBJlLfqOrjedap6", pick(double float boolean ), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)903666710190175438L), (float)j.O("9OBJlLfqOrjedap6", getGameTimeDeltaPartialTick(boolean ), (DeltaTracker)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)915271048386335996L), (boolean)true), (boolean)false);
                                                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)hi.a("G", (Object)j.O("9OBJlLfqOrjedap6", getLocation(), (HitResult)var3_4), (long)980631921738979478L), (long)419122760578116751L), (long)614064756822617967L);
                                                    if (var2_2) break block49;
                                                    if (v1 /* !! */  == false) break block29;
                                                    break block50;
                                                }
                                                case 643255482: {
                                                    break block51;
                                                }
                                            }
                                            break;
                                        }
                                        v1 /* !! */  = var12_3 /* !! */  = (reference)(j.c(18165, 2214997870536577116L) / j.c(12058, 264953681142233544L) + j.c(6314, 2886658613690404440L));
                                    }
                                    if (!var2_2) break block59;
                                }
                                var12_3 /* !! */  = (reference)(j.c(18260, 5514241785831018988L) / j.c(30348, 6247402299627626544L) / j.c(26700, 2497244728187813520L) + j.c(17319, 3881072721125627224L));
                                break block59;
lbl33:
                                // 2 sources

                                while (true) {
                                    cfr_temp_0 = (double)var5_6 - hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)903666710190175438L) * 10.0;
                                    v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                    if (var2_2) break block52;
                                    if (v2 >= 0) break block53;
                                    break block54;
                                    break;
                                }
lbl39:
                                // 2 sources

                                while (true) {
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)650240553476041582L), (Object)var6_7, (long)489810460382064611L);
                                    v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)var6_7, (long)419122760578116751L), (long)614064756822617967L);
                                    if (var2_2) ** GOTO lbl129
                                    if (v3 /* !! */  == false) ** GOTO lbl128
                                    ** GOTO lbl130
                                    break;
                                }
lbl46:
                                // 2 sources

                                while (true) {
                                    v4 = var9_10;
                                    v5 = var8_9;
                                    if (var2_2) ** GOTO lbl137
                                    if (v4 >= v5) ** GOTO lbl135
                                    ** GOTO lbl140
lbl52:
                                    // 2 sources

                                    while (true) {
                                        ++var5_6;
                                        if (var2_2) {
                                            return;
                                        }
                                        ** GOTO lbl191
                                        break;
                                    }
                                    break;
                                }
                            }
                            block34: while (true) {
                                switch (var12_3 /* !! */ ) {
                                    case -152147288: {
                                        var4_5 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)new Vec3(0.0, 0.0, 0.1), (float)(-((float)hi.a("G", (double)((double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1280994566116072355L)), (long)689781824688360657L))), (long)812631177467119124L), (float)(-((float)hi.a("G", (double)((double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)700108823764850555L)), (long)689781824688360657L))), (long)696286329017326132L);
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)650240553476041582L), (long)699241984088282032L);
                                        var5_6 = 1;
                                        if (!var2_2) break block34;
                                        ** GOTO lbl33
                                    }
                                    case -152147286: {
                                        j.O("9OBJlLfqOrjedap6", R());
                                        hi.a("G", (long)447560916480552025L);
                                        var12_3 /* !! */  = (reference)((hi.a("G", (int)j.c(11686, 7452193013772139319L), (int)j.c(17141, 8932983820241032250L), (long)834203424483934088L) ^ j.c(13921, 8528044556467347623L)) + j.c(8119, 2414095062281587041L) - j.c(14426, 5377074787216928417L));
                                        continue block34;
                                    }
                                }
                                break;
                            }
                            var12_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)j.c(20669, 286253656778884733L), (int)j.c(31215, 8145924367748787972L), (long)834203424483934088L), (int)j.c(21354, 4112256593463297437L), (long)834203424483934088L) * j.c(3917, 9031264799069804956L) * j.c(8675, 7411828664422086473L) - j.c(8755, 5720081646517859541L);
                            if (!var2_2) break block60;
                        }
                        v2 = j.c(31018, 4009036733140332530L) * j.c(2213, 8206495368789335637L) * j.c(1956, 4095606817888637264L) ^ j.c(5923, 5890432559439020471L);
                    }
                    var12_3 /* !! */  = (reference)v2;
                    if (!var2_2) break block60;
                }
                var12_3 /* !! */  = hi.a("G", (int)((j.c(8670, 8252130402835216151L) ^ j.c(25298, 5746287250107823115L)) * j.c(209, 3262658514172614163L)), (int)j.c(13851, 5270110872231158007L), (long)834203424483934088L) + j.c(24115, 7869712889777932439L);
                break block60;
                return;
            }
            block35: while (true) {
                block55: {
                    block61: {
                        switch (var12_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 657121556: {
                                var6_7 = j.O("9OBJlLfqOrjedap6", containing(net.minecraft.core.Position ), (Position)j.O("9OBJlLfqOrjedap6", add(net.minecraft.world.phys.Vec3 ), (Vec3)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L), (long)471623755036185916L), (Vec3)j.O("9OBJlLfqOrjedap6", scale(double ), (Vec3)var4_5, (double)var5_6)));
                                v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)650240553476041582L), (Object)var6_7, (long)1128025236213057684L);
                                if (var2_2) ** GOTO lbl98
                                if (v6 /* !! */  == false) ** GOTO lbl97
                                ** GOTO lbl99
                            }
                            case 657121554: {
                                break block35;
                            }
lbl97:
                            // 1 sources

                            v6 /* !! */  = var12_3 /* !! */  = (reference)((j.c(27961, 5494579295627869145L) ^ j.c(5777, 4586562583091839088L)) * j.c(19347, 3487721540460829993L) ^ j.c(11468, 1906888971334793827L));
lbl98:
                            // 2 sources

                            if (!var2_2) break block61;
lbl99:
                            // 2 sources

                            var12_3 /* !! */  = (reference)((j.c(19939, 9066559911921736452L) + j.c(9537, 2439455385739080593L) ^ j.c(8226, 1390603878912472806L)) + j.c(15728, 2872753160242768833L));
                            if (!var2_2) break block61;
                            ** GOTO lbl126
                            case 657121555: 
                        }
                        return;
                    }
                    block36: while (true) {
                        block62: {
                            switch (var12_3 /* !! */ ) {
                                default: {
                                    if (!var2_2) break;
                                    ** GOTO lbl39
                                }
                                case 2057469165: {
                                    ** continue;
                                }
                                case 2057469167: {
                                    var7_8 = hi.a("G", (long)955013155371689075L);
                                    var8_9 = ((CallSite)var7_8).length;
                                    var9_10 = 0;
                                    if (!var2_2) break block62;
                                    ** GOTO lbl46
                                }
                                case 2057469166: {
                                    ** GOTO lbl52
                                }
                                case 2057469169: {
                                    hi.a("G", (long)703609663147646272L);
                                    var12_3 /* !! */  = (reference)((j.c(20544, 2703280303195571925L) ^ j.c(3752, 7657773344282810434L)) + j.c(30920, 7520152528078564903L) + j.c(26303, 6354315335168258058L));
                                    continue block36;
                                }
                            }
lbl126:
                            // 2 sources

                            var12_3 /* !! */  = (reference)(j.c(18963, 4868808052010572978L) * j.c(2542, 6864923824718880553L) * j.c(13600, 4098416646090728408L) / j.c(2573, 4031241626959912126L) + j.c(7307, 1268736875758946926L) ^ j.c(31200, 6329272376765443960L));
                            if (!var2_2) continue;
lbl128:
                            // 2 sources

                            v3 /* !! */  = var12_3 /* !! */  = (reference)(j.c(11086, 4414393961210330499L) * j.c(14905, 684782654745324702L) * j.c(14031, 2507077584989462620L) / j.c(12461, 8564520422778349155L) + j.c(6625, 1420387067508559625L) ^ j.c(3096, 8086672303483755151L));
lbl129:
                            // 2 sources

                            if (!var2_2) continue;
lbl130:
                            // 2 sources

                            var12_3 /* !! */  = (reference)((j.c(13330, 665644163650298607L) - j.c(16721, 2330854889141786620L) ^ j.c(20577, 412288769476019907L)) + j.c(19407, 4182099018768014695L) - j.c(15361, 5117363989883103970L));
                            continue;
                        }
                        var12_3 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)(j.c(7028, 1483471422230302146L) / 2), (int)j.c(10645, 3924403222237003643L), (long)834203424483934088L), (int)j.c(7409, 4281515918929168942L), (long)834203424483934088L) ^ j.c(29333, 1163259339514963051L));
                        if (!var2_2) break block55;
lbl135:
                        // 2 sources

                        v4 = j.c(11086, 4414393961210330499L) * j.c(14905, 684782654745324702L) * j.c(14031, 2507077584989462620L) / j.c(12461, 8564520422778349155L) + j.c(6625, 1420387067508559625L);
                        v5 = j.c(3096, 8086672303483755151L);
lbl137:
                        // 2 sources

                        var12_3 /* !! */  = (reference)(v4 ^ v5);
                        if (var2_2) break;
                    }
lbl140:
                    // 2 sources

                    var12_3 /* !! */  = j.O("9OBJlLfqOrjedap6", max(int int ), (int)(j.c(15999, 1053039231581661396L) + j.c(5722, 1025427317244133580L) ^ j.c(11585, 417549098103028645L)), (int)j.c(17301, 7460008120947791199L)) - j.c(2640, 8950109058116852868L);
                }
                do {
                    block65: {
                        block64: {
                            block63: {
                                switch (var12_3 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case -1062553248: {
                                        var10_11 = var7_8[var9_10];
                                        var11_12 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)var10_11, (Object)new BlockHitResult((Vec3)j.O("9OBJlLfqOrjedap6", atCenterOf(net.minecraft.core.Vec3i ), (Vec3i)var6_7), (Direction)hi.a("G", (Object)new Object[]{var6_7}, (long)763692859447227856L), (BlockPos)var6_7, true), (long)851891616776239775L);
                                        v7 = var11_12 instanceof InteractionResult.Success;
                                        if (var2_2) break block63;
                                        if (v7 != 0) break;
                                        break block64;
                                    }
                                    case -1062553247: {
                                        throw null;
                                    }
                                }
                                v7 = hi.a("G", (int)(hi.a("G", (int)j.c(26092, 7646068398337618770L), (int)j.c(18102, 8022059052980785231L), (long)834203424483934088L) + j.c(29827, 6898079380721427050L)), (int)j.c(7403, 8395706375746554414L), (long)834203424483934088L) ^ j.c(25597, 3207856153104545086L);
                            }
                            var12_3 /* !! */  = (reference)v7;
                            if (!var2_2) break block65;
                        }
                        var12_3 /* !! */  = (reference)(j.c(24857, 1525726214524041133L) * j.c(12164, 4981844667295774998L) + j.c(23722, 5928951512081418773L) - j.c(17672, 2487640522694448086L));
                        if (var2_2) ** GOTO lbl182
                    }
                    block38: do lbl-1000:
                    // 3 sources

                    {
                        block67: {
                            block66: {
                                switch (var12_3 /* !! */ ) {
                                    default: {
                                        v8 = var11_12 instanceof InteractionResult.Fail;
                                        if (var2_2) break block66;
                                        if (v8 == 0) break;
                                        break block67;
                                    }
                                    case -188137405: {
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)var10_11, (long)1027340002540470646L);
                                        hi.a("\u00a5", (Object)var1_1, (long)1159641526413061244L);
                                        return;
                                    }
                                    case -188137408: {
                                        ++var9_10;
                                        if (!var2_2) break block38;
                                        ** continue;
                                    }
                                    case -188137407: {
                                        throw null;
                                    }
                                }
lbl182:
                                // 2 sources

                                v8 = j.c(16262, 6055418231655049557L) / j.c(19526, 2056114412207135485L) + j.c(17323, 7576799462559208791L) - j.c(23683, 1474439562462612040L);
                            }
                            var12_3 /* !! */  = (reference)v8;
                            if (!var2_2) ** GOTO lbl-1000
                        }
                        var12_3 /* !! */  = (reference)(hi.a("G", (int)(hi.a("G", (int)j.c(31020, 8010585134772383711L), (int)j.c(8759, 4671654349987001581L), (long)834203424483934088L) + j.c(27043, 5161339016406859523L)), (int)j.c(9721, 1764779954758660954L), (long)834203424483934088L) ^ j.c(18323, 3225173802726543711L));
                    } while (!var2_2);
                    var12_3 /* !! */  = (reference)(hi.a("G", (int)j.O("9OBJlLfqOrjedap6", max(int int ), (int)(j.c(19745, 2007170975956720525L) / 2), (int)j.c(12454, 8864537841497318920L)), (int)j.c(24068, 4017578767767685299L), (long)834203424483934088L) ^ j.c(7148, 7661204171480010078L));
                } while (!var2_2);
lbl191:
                // 2 sources

                var12_3 /* !! */  = hi.a("G", (int)j.O("9OBJlLfqOrjedap6", max(int int ), (int)j.c(19231, 4343960709643951582L), (int)j.c(1221, 1711178331114213927L)), (int)j.c(2957, 4745148072686165300L), (long)834203424483934088L) * j.c(20858, 2545336747241129871L) * j.c(27088, 4076685861682982L) - j.c(30746, 1744285888872345255L);
            }
        }
        hi.a("G", (long)850375381118395903L);
    }

    private j() {
        super(a, (vY)((Object)hi.a("j", (long)526176563220736169L)));
    }

    public static /* bridge */ /* synthetic */ CallSite O(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        IlilIlIlil.registerNativesForClass((int)22, j.class);
        Hidden0.special_clinit_22_30(j.class);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16F1;
        if (c[n2] == null) {
            j.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
