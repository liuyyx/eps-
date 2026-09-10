/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.gui.screens.RecoverWorldDataScreen
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.client.player.RemotePlayer
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ServerboundMovePlayerPacket
 *  net.minecraft.network.protocol.handshake.ClientIntentionPacket
 *  net.minecraft.network.protocol.login.ServerboundHelloPacket
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.Dl;
import com.github.epsilon.Xn;
import com.github.epsilon.d9;
import com.github.epsilon.dQ;
import com.github.epsilon.dY;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.gui.screens.RecoverWorldDataScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.handshake.ClientIntentionPacket;
import net.minecraft.network.protocol.login.ServerboundHelloPacket;
import net.minecraft.world.entity.Entity;

public class eN
extends e {
    public static final eN W;
    private double z;
    private float H;
    public RemotePlayer q;
    private double k;
    private double F;
    private double e;
    private double m;
    private final Xn b;
    private final Xn N;
    private float Q;
    private float n;
    private double C;
    private float y;
    private final DM l;
    private float X;
    private final DM E = hi.a("\u00a5", (Object)this, (Object)eN.b(-25379, 11717), (double)30.0, (double)5.0, (double)200.0, (double)1.0, (long)1077996338587307774L);
    private final ConcurrentLinkedQueue<Packet<?>> t;
    private double u;
    private final Xn a = hi.a("\u00a5", (Object)this, (Object)eN.b(-25377, 4549), (boolean)true, (long)1230617056439551805L);
    private float K;
    private double x;
    private double O;
    private static final String[] c;
    private static final String[] d;
    private static final long[] h;
    private static final Integer[] o;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void q(Object[] var1_1) {
        block10: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = (eN.c(30621, 7729081048216355302L) / eN.c(1111, 5215961395006353975L) ^ eN.c(884, 7245588990669141453L)) + eN.c(30557, 9037396822917333491L) ^ eN.c(2912, 7814419369547742713L) ^ eN.c(14918, 2458790416799304935L);
            if (var3_3) break block10;
lbl6:
            // 3 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)583889075344562953L), (long)596089672069306848L);
                hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)1289905174225586233L), (long)842082491367220027L);
                hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)577939685024172433L), (long)1319402415235994422L);
                hi.a("\u00f2", (Object)this, (double)hi.a("\u00a5", (Object)((ServerboundMovePlayerPacket)var2_2), (double)hi.a("\u00e9", (Object)this, (long)583889075344562953L), (long)680879759610336565L), (long)583889075344562953L);
                hi.a("\u00f2", (Object)this, (double)eN.F("3DEa1RDfYTTNptd1", getY(double ), (ServerboundMovePlayerPacket)((ServerboundMovePlayerPacket)var2_2), (double)hi.a("\u00e9", (Object)this, (long)1289905174225586233L)), (long)1289905174225586233L);
                hi.a("\u00f2", (Object)this, (double)hi.a("\u00a5", (Object)((ServerboundMovePlayerPacket)var2_2), (double)hi.a("\u00e9", (Object)this, (long)577939685024172433L), (long)561216719658068425L), (long)577939685024172433L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)573129390128351636L), (long)1024090951018574749L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)514709753514806834L), (long)964838954944860320L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)653637791936038136L), (long)1279936763150152943L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00a5", (Object)((ServerboundMovePlayerPacket)var2_2), (float)hi.a("\u00e9", (Object)this, (long)573129390128351636L), (long)835132910775221989L), (long)573129390128351636L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00a5", (Object)((ServerboundMovePlayerPacket)var2_2), (float)hi.a("\u00e9", (Object)this, (long)514709753514806834L), (long)711563731977773757L), (long)514709753514806834L);
                v0 = hi.a("\u00a5", (Object)((ServerboundMovePlayerPacket)var2_2), (long)1076625777993044923L);
                if (!var3_3) ** GOTO lbl45
                if (v0 == false) ** GOTO lbl44
                ** GOTO lbl47
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00a5", (Object)((ServerboundMovePlayerPacket)var2_2), (float)hi.a("\u00e9", (Object)this, (long)653637791936038136L), (long)835132910775221989L), (long)653637791936038136L);
                if (!var3_3) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl49
                break;
            }
        }
        while (true) {
            switch (var4_4 /* !! */ ) {
                default: {
                    ** GOTO lbl6
                }
                case 1879050490: {
                    ** continue;
                }
                case 1879050491: {
                    ** continue;
                }
                case 1879050489: 
            }
            eN.F("3DEa1RDfYTTNptd1", s());
            hi.a("G", (long)763209694749933009L);
            if (!var3_3) ** break;
            ** continue;
lbl44:
            // 2 sources

            v0 = hi.a("G", (int)eN.c(1413, 1163159964859380263L), (int)eN.c(23263, 5716273650586610872L), (long)834203424483934088L) - eN.c(24092, 7573326353271875673L);
lbl45:
            // 2 sources

            var4_4 /* !! */  = (int)v0;
            if (var3_3) continue;
lbl47:
            // 2 sources

            var4_4 /* !! */  = (int)(hi.a("G", (int)(eN.c(30152, 6860785512519287387L) + eN.c(5837, 235014708137533670L)), (int)eN.c(9630, 7643212108751770513L), (long)834203424483934088L) / eN.c(11987, 5784573269235275966L) - eN.c(26768, 1193748321890000513L));
            if (var3_3) continue;
lbl49:
            // 2 sources

            var4_4 /* !! */  = (int)(eN.F("3DEa1RDfYTTNptd1", max(int int ), (int)eN.c(564, 8042323540908717117L), (int)eN.c(19034, 4014985464091016321L)) - eN.c(4443, 7007291166544766745L));
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    public void f(dQ var1_1) {
        block13: {
            var2_2 = Dl.t();
            var4_3 /* !! */  = ((eN.c(10063, 2341845020285866314L) / eN.c(4032, 2749447056273029397L) ^ eN.c(28290, 4609298017932728378L)) / eN.c(28554, 1425362668313139620L) ^ eN.c(1237, 4795544904182248124L)) - eN.c(7864, 5933353571584092380L);
            if (!var2_2) break block13;
lbl4:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                if (var2_2) ** GOTO lbl53
                if (v0 /* !! */  == false) ** GOTO lbl52
                ** GOTO lbl55
                break;
            }
        }
        block11: while (true) {
            block14: {
                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 77283876: {
                        var3_4 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L);
                        v1 = var3_4 instanceof ServerboundHelloPacket;
                        if (var2_2) ** GOTO lbl27
                        if (v1 != 0) ** GOTO lbl26
                        ** GOTO lbl28
                    }
                    case 77283875: {
                        eN.F("3DEa1RDfYTTNptd1", Z(float float float float int ), (float)10.0f, (float)0.0f, (float)1.0f, (float)0.0f, (int)eN.c(6546, 6503715835987537798L));
                        var4_3 /* !! */  = (int)(hi.a("G", (int)eN.c(1322, 5776572986272166677L), (int)eN.c(16201, 4789542173699016957L), (long)834203424483934088L) / 2 - eN.c(9230, 1932499741967979189L));
                        continue block11;
                    }
lbl26:
                    // 1 sources

                    v1 = var4_3 /* !! */  = eN.c(24766, 3826412388588181234L) ^ eN.c(27274, 5589736464955432153L) ^ eN.c(21223, 4352145015989200004L);
lbl27:
                    // 2 sources

                    if (!var2_2) break block14;
lbl28:
                    // 2 sources

                    var4_3 /* !! */  = (eN.c(31504, 7154119476913622182L) / eN.c(22152, 1012279468116336762L) ^ eN.c(27739, 4035710234256104034L)) - eN.c(19352, 1136451740859825176L) - eN.c(20567, 5490106684072421078L);
                    if (!var2_2) break block14;
                    ** GOTO lbl57
                    case 77283874: 
                }
                return;
            }
            block12: while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        v2 = var3_4 instanceof ClientIntentionPacket;
                        if (var2_2) ** GOTO lbl58
                        if (v2 == 0) ** GOTO lbl57
                        ** GOTO lbl59
                    }
                    case 1550342573: {
                        eN.F("3DEa1RDfYTTNptd1", F(), (dQ)var1_1);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)583781764643229412L), (Object)var3_4, (long)794996245834222328L);
                        return;
                    }
                    case 1550342571: {
                        hi.a("G", (long)1184702471901219908L);
                        var4_3 /* !! */  = (eN.c(10809, 825220193088838659L) + eN.c(9045, 8193518804197348586L)) * eN.c(14025, 6276502860876742659L) + eN.c(14057, 4974527909767479338L) - eN.c(17520, 7799867825424757357L);
                        if (!var2_2) continue block12;
lbl52:
                        // 2 sources

                        v0 /* !! */  = (CallSite)(eN.c(12369, 5574954261247985369L) - eN.c(8392, 3846442068907300720L) + eN.c(23908, 365320738775493503L));
lbl53:
                        // 2 sources

                        var4_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) continue block11;
lbl55:
                        // 2 sources

                        var4_3 /* !! */  = (int)(hi.a("G", (int)((eN.c(11049, 2867302299035409899L) + eN.c(11299, 9023600191383706141L) - eN.c(7986, 1815368863640430914L)) / eN.c(1111, 5215961395006353975L)), (int)eN.c(20492, 8059592275280881280L), (long)834203424483934088L) + eN.c(1080, 4323105419243631221L));
                        continue block11;
                    }
lbl57:
                    // 2 sources

                    v2 = var4_3 /* !! */  = eN.c(8075, 2667531193896020407L) * eN.c(29055, 5893981913921079049L) - eN.c(29309, 3286371572937901074L) - eN.c(32185, 2910169152316295718L);
lbl58:
                    // 2 sources

                    if (!var2_2) continue block12;
lbl59:
                    // 2 sources

                    var4_3 /* !! */  = eN.c(24043, 3800734657131211773L) ^ eN.c(16705, 5724805899385304896L) ^ eN.c(25043, 1798628034271467405L);
                    continue block12;
                    case 1550342572: 
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
    @yE
    public void J(d9 var1_1) {
        block23: {
            block22: {
                block20: {
                    block21: {
                        block19: {
                            block25: {
                                block18: {
                                    block16: {
                                        block17: {
                                            block24: {
                                                var2_2 = Dl.t();
                                                var13_3 /* !! */  = hi.a("G", (int)(eN.c(24077, 4788058539642055067L) * eN.c(20236, 1234154346888001667L) / 4), (int)eN.c(22446, 299797949180862752L), (long)834203424483934088L) - eN.c(9681, 6356960814611665700L);
                                                if (!var2_2) break block24;
lbl4:
                                                // 2 sources

                                                while (true) {
                                                    v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                                    if (var2_2) break block16;
                                                    if (v0 /* !! */  == false) break block17;
                                                    break block18;
                                                    break;
                                                }
lbl9:
                                                // 1 sources

                                                return;
lbl11:
                                                // 1 sources

                                                while (hi.a("\u00e9", (Object)this, (long)527091654294005381L) != null) {
                                                    break block19;
                                                }
                                                break block25;
lbl14:
                                                // 1 sources

                                                while (true) {
                                                    v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)867381889368980735L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                    if (var2_2) break block20;
                                                    if (v1 /* !! */  == false) break block21;
                                                    break block22;
                                                    break;
                                                }
lbl19:
                                                // 1 sources

                                                while (true) {
                                                    var3_4 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
                                                    var4_5 = hi.a("\u00e9", (Object)this, (long)596089672069306848L) + (hi.a("\u00e9", (Object)this, (long)583889075344562953L) - hi.a("\u00e9", (Object)this, (long)596089672069306848L)) * (double)var3_4;
                                                    var6_6 = hi.a("\u00e9", (Object)this, (long)842082491367220027L) + (hi.a("\u00e9", (Object)this, (long)1289905174225586233L) - hi.a("\u00e9", (Object)this, (long)842082491367220027L)) * (double)var3_4;
                                                    var8_7 = hi.a("\u00e9", (Object)this, (long)1319402415235994422L) + (hi.a("\u00e9", (Object)this, (long)577939685024172433L) - hi.a("\u00e9", (Object)this, (long)1319402415235994422L)) * (double)var3_4;
                                                    hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (double)hi.a("\u00e9", (Object)this, (long)908700828522605286L), (long)570793254671654364L);
                                                    hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (double)hi.a("\u00e9", (Object)this, (long)884249215543617459L), (long)1098234107183603064L);
                                                    hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (double)hi.a("\u00e9", (Object)this, (long)1156328803758153991L), (long)1265350532039842383L);
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (double)var4_5, (double)var6_6, (double)var8_7, (long)1214943892469634078L);
                                                    hi.a("\u00f2", (Object)this, (double)var4_5, (long)908700828522605286L);
                                                    hi.a("\u00f2", (Object)this, (double)var6_6, (long)884249215543617459L);
                                                    hi.a("\u00f2", (Object)this, (double)var8_7, (long)1156328803758153991L);
                                                    var10_8 = hi.a("\u00e9", (Object)this, (long)1024090951018574749L) + (hi.a("\u00e9", (Object)this, (long)573129390128351636L) - hi.a("\u00e9", (Object)this, (long)1024090951018574749L)) * var3_4;
                                                    var11_9 = hi.a("\u00e9", (Object)this, (long)964838954944860320L) + (hi.a("\u00e9", (Object)this, (long)514709753514806834L) - hi.a("\u00e9", (Object)this, (long)964838954944860320L)) * var3_4;
                                                    var12_10 = hi.a("\u00e9", (Object)this, (long)1279936763150152943L) + (hi.a("\u00e9", (Object)this, (long)653637791936038136L) - hi.a("\u00e9", (Object)this, (long)1279936763150152943L)) * var3_4;
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)var10_8, (long)921051144565095639L);
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)var11_9, (long)639435552786660247L);
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)var12_10, (long)458666610564949616L);
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)var10_8, (long)493521354278100650L);
                                                    if (var2_2) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        return;
                                                    }
                                                    break block23;
                                                    break;
                                                }
                                            }
lbl43:
                                            // 8 sources

                                            while (true) {
                                                switch (var13_3 /* !! */ ) {
                                                    default: {
                                                        ** continue;
                                                    }
                                                    case 300112710: {
                                                        ** continue;
                                                    }
                                                    case 300112704: {
                                                        ** GOTO lbl11
                                                    }
                                                    case 300112709: {
                                                        ** continue;
                                                    }
                                                    case 300112707: {
                                                        ** continue;
                                                    }
                                                    case 300112705: {
                                                        ** continue;
                                                    }
                                                    case 300112708: 
                                                }
                                                return;
                                            }
                                        }
                                        v0 /* !! */  = var13_3 /* !! */  = (CallSite)(hi.a("G", (int)(eN.c(6113, 2633582230287425648L) ^ eN.c(15348, 8334980610020904032L)), (int)eN.c(4799, 7765764998853075995L), (long)834203424483934088L) * eN.c(16785, 8228736486701135620L) - eN.c(15761, 4912105131438607249L) ^ eN.c(15344, 1206668146526784595L));
                                    }
                                    if (!var2_2) ** GOTO lbl43
                                }
                                var13_3 /* !! */  = (CallSite)((eN.c(18944, 7180745439423167691L) * eN.c(25819, 156321385504690770L) - eN.c(20812, 5252983452691949309L)) * eN.c(17334, 5586393500393338165L) ^ eN.c(8587, 4317110448218052548L));
                                if (!var2_2) ** GOTO lbl43
                            }
                            var13_3 /* !! */  = (CallSite)(eN.c(8790, 2443239511280522277L) * eN.c(10313, 987584772287176251L) / eN.c(12963, 3247683574342878408L) - eN.c(2476, 2600495917993442822L));
                            if (!var2_2) ** GOTO lbl43
                        }
                        var13_3 /* !! */  = (CallSite)(eN.c(17717, 6359798421080732573L) * eN.c(3721, 5525611274805950632L) + eN.c(31266, 6328331088116861974L) - eN.c(7023, 8144545237230398938L));
                        if (!var2_2) ** GOTO lbl43
                    }
                    v1 /* !! */  = var13_3 /* !! */  = (CallSite)(eN.c(12449, 5940401344324011551L) * eN.c(26175, 8617179435068772600L) / eN.c(12963, 3247683574342878408L) - eN.c(13449, 8065509527337730776L));
                }
                if (!var2_2) ** GOTO lbl43
            }
            var13_3 /* !! */  = (CallSite)(eN.c(23675, 8703159969241361131L) / eN.c(1111, 5215961395006353975L) - eN.c(31723, 3191852643256552526L));
            ** GOTO lbl43
        }
        var13_3 /* !! */  = (CallSite)(eN.c(12449, 5940401344324011551L) * eN.c(26175, 8617179435068772600L) / eN.c(12963, 3247683574342878408L) - eN.c(13449, 8065509527337730776L));
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    public void U(dY var1_1) {
        block32: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = eN.c(21504, 8413921597906346560L) + eN.c(27393, 5902153553475460359L) + eN.c(26690, 4101853414520708725L);
            if (!var2_2) break block32;
lbl4:
            // 2 sources

            while (true) {
                v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)907159218940561824L), (long)1017954173869996748L) instanceof RecoverWorldDataScreen;
                if (var2_2) ** GOTO lbl101
                if (v0 == 0) ** GOTO lbl100
                ** GOTO lbl102
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00a5", (Object)this, (long)1099153674733698693L);
                if (var2_2) ** GOTO lbl105
                if (v1 /* !! */  == false) ** GOTO lbl104
                ** GOTO lbl107
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (boolean)false, (long)1197894287238472871L);
                if (!var2_2) ** GOTO lbl109
lbl17:
                // 2 sources

                while (true) {
                    v2 = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                    if (var2_2) ** GOTO lbl112
                    if (v2 == false) ** GOTO lbl111
                    ** GOTO lbl114
                    break;
                }
                break;
            }
lbl22:
            // 1 sources

            return;
lbl24:
            // 1 sources

            while (true) {
                v3 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1206526210287384334L), (long)789438897355831922L)), (long)1000026253634408124L);
                if (var2_2) ** GOTO lbl117
                if (v3 /* !! */  == false) ** GOTO lbl116
                ** GOTO lbl119
                break;
            }
lbl29:
            // 1 sources

            while (true) {
                cfr_temp_0 = (double)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)991673448144910307L) - hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)585060879531739786L), (long)789438897355831922L)), (long)637262500311742568L);
                v4 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var2_2) ** GOTO lbl122
                if (v4 <= 0) ** GOTO lbl121
                ** GOTO lbl124
                break;
            }
lbl35:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)493940708003697446L);
                if (!var2_2) ** GOTO lbl126
lbl38:
                // 2 sources

                while (true) {
                    cfr_temp_1 = (double)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)991673448144910307L) - eN.F("3DEa1RDfYTTNptd1", doubleValue(), (Double)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)585060879531739786L), (long)789438897355831922L)));
                    v5 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                    if (var2_2) ** GOTO lbl129
                    if (v5 <= 0) ** GOTO lbl128
                    ** GOTO lbl131
                    break;
                }
                break;
            }
lbl44:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)594204132228460448L);
                if (!var2_2) ** GOTO lbl133
lbl47:
                // 2 sources

                while (true) {
                    v6 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)919930029462883910L), (long)789438897355831922L)), (long)1000026253634408124L);
                    if (var2_2) ** GOTO lbl136
                    if (v6 /* !! */  == false) ** GOTO lbl135
                    ** GOTO lbl138
                    break;
                }
                break;
            }
lbl52:
            // 1 sources

            while (true) {
                v7 /* !! */  = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)843081131751977988L) % hi.a("\u00a5", (Object)((Double)eN.F("3DEa1RDfYTTNptd1", z(), (DM)hi.a("\u00e9", (Object)this, (long)778503719549637224L))), (long)948339721436851763L);
                if (var2_2) ** GOTO lbl141
                if (v7 /* !! */  != false) ** GOTO lbl140
                ** GOTO lbl143
                break;
            }
lbl57:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)493940708003697446L);
                if (var2_2) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl145
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 69031880: {
                    ** continue;
                }
                case 69031888: {
                    ** continue;
                }
                case 69031886: {
                    ** continue;
                }
                case 69031891: {
                    ** continue;
                }
                case 69031881: {
                    ** continue;
                }
                case 69031883: {
                    ** continue;
                }
                case 69031885: {
                    ** continue;
                }
                case 69031893: {
                    ** continue;
                }
                case 69031882: {
                    ** continue;
                }
                case 69031879: {
                    ** continue;
                }
                case 69031884: {
                    ** continue;
                }
                case 69031889: {
                    ** continue;
                }
                case 69031892: {
                    ** continue;
                }
                case 69031887: 
            }
            hi.a("G", (long)979899430926065004L);
            var3_3 /* !! */  = eN.F("3DEa1RDfYTTNptd1", max(int int ), (int)((eN.c(19698, 2477369564187884412L) - eN.c(30026, 3820200678926435180L)) * eN.c(20886, 1264573010110343086L)), (int)eN.c(24727, 7347336983035664102L)) ^ eN.c(28195, 3591844898940770399L);
            if (!var2_2) continue;
lbl100:
            // 2 sources

            v0 = var3_3 /* !! */  = (eN.c(1806, 3139405937360810151L) / eN.c(28993, 8376843457771718555L) + eN.c(5016, 3594307964191679986L)) * eN.c(10947, 588481576768478292L) - eN.c(856, 246728291319067894L);
lbl101:
            // 2 sources

            if (!var2_2) continue;
lbl102:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)eN.c(22195, 5945849359382732852L), (int)eN.c(28855, 3392546312491878061L), (long)834203424483934088L) * eN.c(6538, 5848345785869905425L) + eN.c(20208, 6955647888030562319L) + eN.c(30972, 3203153347420376651L));
            if (!var2_2) continue;
lbl104:
            // 2 sources

            v1 /* !! */  = (CallSite)((eN.c(1406, 4412916440887374769L) / eN.c(28993, 8376843457771718555L) + eN.c(16305, 8239566771307907583L)) * eN.c(16839, 2474767511439275590L) - eN.c(5356, 2854019347129607025L));
lbl105:
            // 2 sources

            var3_3 /* !! */  = (int)v1 /* !! */ ;
            if (!var2_2) continue;
lbl107:
            // 2 sources

            var3_3 /* !! */  = hi.a("G", (int)(eN.c(27864, 6075133333971524454L) ^ eN.c(14244, 5016876313704300838L)), (int)eN.c(31560, 2869175106819575198L), (long)834203424483934088L) ^ eN.c(17884, 3286333534074368818L) ^ eN.c(22902, 1767787365056573225L);
            if (!var2_2) continue;
lbl109:
            // 2 sources

            var3_3 /* !! */  = (eN.c(1406, 4412916440887374769L) / eN.c(28993, 8376843457771718555L) + eN.c(16305, 8239566771307907583L)) * eN.c(16839, 2474767511439275590L) - eN.c(5356, 2854019347129607025L);
            if (!var2_2) continue;
lbl111:
            // 2 sources

            v2 = hi.a("G", (int)eN.c(30251, 7713935144711733305L), (int)eN.c(4932, 5823297953186096414L), (long)834203424483934088L) + eN.c(30660, 1960600260244848935L);
lbl112:
            // 2 sources

            var3_3 /* !! */  = (int)v2;
            if (!var2_2) continue;
lbl114:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)((eN.c(3135, 630613860735269598L) ^ eN.c(12914, 7003344322877129964L)) - eN.c(6689, 2811874904653049004L)), (int)eN.c(13269, 2001346871004005675L), (long)834203424483934088L) - eN.c(3548, 8113158847940410321L));
            if (!var2_2) continue;
lbl116:
            // 2 sources

            v3 /* !! */  = (CallSite)(((eN.c(20834, 1008861987722323816L) ^ eN.c(23918, 2924746986274712561L) ^ eN.c(869, 5377878327929255217L)) + eN.c(613, 9200966804137096693L)) * eN.c(9392, 5638683288240525933L) + eN.c(31571, 940045840674639171L));
lbl117:
            // 2 sources

            var3_3 /* !! */  = (int)v3 /* !! */ ;
            if (!var2_2) continue;
lbl119:
            // 2 sources

            var3_3 /* !! */  = eN.c(9953, 622030790570152028L) + eN.c(12989, 5526857309960701013L) - eN.c(8280, 6825947024636024501L);
            if (!var2_2) continue;
lbl121:
            // 2 sources

            v4 = eN.c(22612, 7440621394131152515L) + eN.c(14777, 5785243421838741364L) ^ eN.c(12314, 863813415818528412L) ^ eN.c(14332, 1599545026542108964L);
lbl122:
            // 2 sources

            var3_3 /* !! */  = (int)v4;
            if (!var2_2) continue;
lbl124:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)((eN.c(12229, 3258825477912598930L) - eN.c(31563, 4430406539015769441L)) * eN.c(2459, 4522540205979615181L)), (int)eN.c(31559, 5416148013928140208L), (long)834203424483934088L) / eN.c(27078, 2989871543183728418L) + eN.c(24272, 5470874969168799989L));
            if (!var2_2) continue;
lbl126:
            // 2 sources

            var3_3 /* !! */  = eN.c(966, 2231765515638191508L) + eN.c(26152, 4813420777739211140L) ^ eN.c(28835, 2352492036046177938L) ^ eN.c(28260, 8823919985567946828L);
            if (!var2_2) continue;
lbl128:
            // 2 sources

            v5 = eN.c(966, 2231765515638191508L) + eN.c(26152, 4813420777739211140L) ^ eN.c(28835, 2352492036046177938L) ^ eN.c(28260, 8823919985567946828L);
lbl129:
            // 2 sources

            var3_3 /* !! */  = (int)v5;
            if (!var2_2) continue;
lbl131:
            // 2 sources

            var3_3 /* !! */  = eN.c(1150, 6391402920865051319L) * eN.c(7383, 6579677834212027049L) - eN.c(27407, 5861649891512343688L);
            if (!var2_2) continue;
lbl133:
            // 2 sources

            var3_3 /* !! */  = eN.c(966, 2231765515638191508L) + eN.c(26152, 4813420777739211140L) ^ eN.c(28835, 2352492036046177938L) ^ eN.c(28260, 8823919985567946828L);
            if (!var2_2) continue;
lbl135:
            // 2 sources

            v6 /* !! */  = (CallSite)(eN.c(8511, 4120295438798526328L) - eN.c(2220, 8332661253834227274L) - eN.c(15124, 5096768808253263029L) + eN.c(1453, 8596096838734492456L));
lbl136:
            // 2 sources

            var3_3 /* !! */  = (int)v6 /* !! */ ;
            if (!var2_2) continue;
lbl138:
            // 2 sources

            var3_3 /* !! */  = hi.a("G", (int)(eN.c(13126, 8326250136805442998L) - eN.c(18844, 1005349729232092929L)), (int)eN.c(12119, 7518353834091682102L), (long)834203424483934088L) ^ eN.c(24422, 4437257578398148802L) ^ eN.c(5354, 8685396978481046093L);
            if (!var2_2) continue;
lbl140:
            // 2 sources

            v7 /* !! */  = (reference)(eN.c(25889, 9009339492042658676L) - eN.c(11914, 1869375951167133795L) - eN.c(6241, 8368405609918606861L) + eN.c(22895, 4305371588895764218L));
lbl141:
            // 2 sources

            var3_3 /* !! */  = (int)v7 /* !! */ ;
            if (!var2_2) continue;
lbl143:
            // 2 sources

            var3_3 /* !! */  = eN.c(11111, 8657289596752862673L) * eN.c(30196, 6296916775964459904L) ^ eN.c(24975, 2546398507538699823L);
            if (!var2_2) continue;
lbl145:
            // 2 sources

            var3_3 /* !! */  = eN.c(25889, 9009339492042658676L) - eN.c(11914, 1869375951167133795L) - eN.c(6241, 8368405609918606861L) + eN.c(22895, 4305371588895764218L);
        }
    }

    private static boolean lambda$getBlinkTicks$0(Packet packet) {
        return packet instanceof ServerboundMovePlayerPacket;
    }

    private int f(Object[] objectArray) {
        return (int)hi.a("G", (long)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)583781764643229412L), (long)1144801505124028684L), eN::lambda$getBlinkTicks$0, (long)1143211481283200773L), (long)917299983733623274L), (long)1201976680630014545L);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)7, eN.class);
        Hidden0.special_clinit_7_60(eN.class);
    }

    public eN() {
        super(eN.b(-25384, -25997), (vY)((Object)hi.a("j", (long)456237291118568391L)));
        this.N = eN.F("3DEa1RDfYTTNptd1", U(java.lang.String boolean ), (eN)this, (String)eN.b(-25383, -5635), (boolean)false);
        String string = eN.b(-25378, 19421);
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)919930029462883910L);
        eN.F("3DEa1RDfYTTNptd1", requireNonNull(T ), (Object)callSite);
        this.l = hi.a("\u00a5", (Object)this, (Object)string, (double)5.0, (double)2.0, (double)5.0, (double)1.0, ((Xn)((Object)callSite))::z, (long)988474938581310011L);
        this.b = hi.a("\u00a5", (Object)this, (Object)eN.b(-25380, -15466), (boolean)false, (long)1230617056439551805L);
        this.t = new ConcurrentLinkedQueue();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void M(Object[] var1_1) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            block15: {
                                block16: {
                                    var2_2 = Dl.t();
                                    var3_3 /* !! */  = hi.a("G", (int)(eN.c(13432, 6259106946120319684L) + eN.c(3511, 1766925788192881613L)), (int)eN.c(13578, 485169738753704812L), (long)834203424483934088L) * eN.c(659, 4463451744375256252L) - eN.c(30451, 7075452352611893622L) - eN.c(12394, 1205042136953063131L);
                                    if (var2_2) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                            if (var2_2) break block15;
                                            if (v0 /* !! */  == false) break block16;
                                            break block17;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        return;
lbl12:
                                        // 1 sources

                                        while (true) {
                                            v1 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)822283321678704529L);
                                            hi.a("\u00f2", (Object)this, (double)v1, (long)596089672069306848L);
                                            hi.a("\u00f2", (Object)this, (double)v1, (long)583889075344562953L);
                                            v2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L);
                                            hi.a("\u00f2", (Object)this, (double)v2, (long)842082491367220027L);
                                            hi.a("\u00f2", (Object)this, (double)v2, (long)1289905174225586233L);
                                            v3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1024017773186779925L);
                                            hi.a("\u00f2", (Object)this, (double)v3, (long)1319402415235994422L);
                                            hi.a("\u00f2", (Object)this, (double)v3, (long)577939685024172433L);
                                            v4 = eN.F("3DEa1RDfYTTNptd1", getYRot(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                                            hi.a("\u00f2", (Object)this, (float)v4, (long)1024090951018574749L);
                                            hi.a("\u00f2", (Object)this, (float)v4, (long)573129390128351636L);
                                            v5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1280994566116072355L);
                                            hi.a("\u00f2", (Object)this, (float)v5, (long)964838954944860320L);
                                            hi.a("\u00f2", (Object)this, (float)v5, (long)514709753514806834L);
                                            v6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)521022578735217283L);
                                            hi.a("\u00f2", (Object)this, (float)v6, (long)1279936763150152943L);
                                            hi.a("\u00f2", (Object)this, (float)v6, (long)653637791936038136L);
                                            v7 /* !! */  = (int)hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)867381889368980735L), (long)789438897355831922L)), (long)1000026253634408124L);
                                            if (var2_2) break block18;
                                            if (v7 /* !! */  == 0) break block19;
                                            break block20;
                                            break;
                                        }
lbl35:
                                        // 1 sources

                                        while (true) {
                                            hi.a("\u00f2", (Object)this, (RemotePlayer)new RemotePlayer((ClientLevel)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), new GameProfile((UUID)eN.F("3DEa1RDfYTTNptd1", nameUUIDFromBytes(byte[] ), (byte[])hi.a("\u00a5", "", (Object)hi.a("j", (long)474395730668135972L), (long)1215255432464776904L)), "")), (long)527091654294005381L);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (int)eN.c(16090, 1521794093222201374L), (long)1031501230150888363L);
                                            eN.F("3DEa1RDfYTTNptd1", copyPosition(net.minecraft.world.entity.Entity ), (RemotePlayer)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (Entity)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)eN.F("3DEa1RDfYTTNptd1", getYRot(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (long)921051144565095639L);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1280994566116072355L), (long)639435552786660247L);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)eN.F("3DEa1RDfYTTNptd1", getYHeadRot(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (long)458666610564949616L);
                                            eN.F("3DEa1RDfYTTNptd1", setHealth(float ), (RemotePlayer)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)542592610276054931L));
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)526922821695017757L), (long)666626080459940786L);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (long)689999981825014241L);
                                            if (var2_2) lbl-1000:
                                            // 2 sources

                                            {
                                                return;
                                            }
                                            break block21;
                                            break;
                                        }
                                    }
lbl49:
                                    // 7 sources

                                    while (true) {
                                        switch (var3_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -1193771975: {
                                                ** continue;
                                            }
                                            case -1193771974: {
                                                ** continue;
                                            }
                                            case -1193771978: {
                                                ** continue;
                                            }
                                            case -1193771979: {
                                                ** continue;
                                            }
                                            case -1193771977: 
                                        }
                                        return;
                                    }
                                }
                                v0 /* !! */  = var3_3 /* !! */  = (CallSite)(eN.c(28381, 1976630606195743099L) + eN.c(12149, 5433558387036461272L) ^ eN.c(5354, 5482698743570965039L));
                            }
                            if (!var2_2) ** GOTO lbl49
                        }
                        var3_3 /* !! */  = (CallSite)((eN.c(28270, 2543890545490942006L) * eN.c(1252, 4980720622537290305L) - eN.c(5005, 4027213179892835828L)) * eN.c(26803, 4770564707667598874L) + eN.c(10133, 4629036890871501127L) ^ eN.c(4896, 1248848084330653013L));
                        if (!var2_2) ** GOTO lbl49
                    }
                    v7 /* !! */  = (eN.c(2283, 3741941493124841302L) - eN.c(29143, 4541258762107766589L) - eN.c(32640, 7357103363046033864L)) / eN.c(29135, 3547027969757136459L) - eN.c(6697, 7648418852066143433L);
                }
                var3_3 /* !! */  = (CallSite)v7 /* !! */ ;
                if (!var2_2) ** GOTO lbl49
            }
            var3_3 /* !! */  = (CallSite)(((eN.c(29517, 8030277496002037075L) - eN.c(8729, 4721605648296678834L) ^ eN.c(31526, 3827775310604684602L)) + eN.c(13, 7643231506089424820L)) * eN.c(30905, 751472320024465034L) + eN.c(2974, 2970279836706979262L));
            if (!var2_2) ** GOTO lbl49
        }
        var3_3 /* !! */  = (CallSite)((eN.c(30314, 854095856024174624L) - eN.c(4566, 4212361388037088848L) - eN.c(4207, 6471606330710140604L)) / eN.c(11987, 5784573269235275966L) - eN.c(4534, 7994806380363622283L));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void e(Object[] var1_1) {
        block13: {
            var2_2 = Dl.t();
            var4_3 /* !! */  = hi.a("G", (int)((eN.c(25021, 4242722584194537277L) ^ eN.c(19147, 2743578974758239608L)) / eN.c(1111, 5215961395006353975L)), (int)eN.c(1838, 5040646766611476878L), (long)834203424483934088L) / 2 ^ eN.c(1540, 5384483014104133638L);
            if (!var2_2) break block13;
lbl5:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)583781764643229412L), (long)371165648327601127L);
                if (var2_2) ** GOTO lbl53
                if (v0 /* !! */  != false) ** GOTO lbl52
                ** GOTO lbl55
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[]{(ServerboundMovePlayerPacket)var3_4}, (long)793540661162421947L);
                if (!var2_2) ** GOTO lbl57
lbl13:
                // 2 sources

                while (var2_2) {
                    return;
                }
                ** GOTO lbl59
                break;
            }
        }
        block12: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1672133758: {
                    var3_4 = (Packet)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)583781764643229412L), (long)782961236213699132L);
                    hi.a("G", (Object)var3_4, (long)862951805677234099L);
                    v1 /* !! */  = var3_4 instanceof ServerboundMovePlayerPacket;
                    if (var2_2) ** GOTO lbl37
                    if (v1 /* !! */  == 0) ** GOTO lbl36
                    ** GOTO lbl38
                }
                case 1672133757: {
                    hi.a("G", (long)1097773666732108654L);
                    hi.a("G", (long)594486037717116399L);
                    var4_3 /* !! */  = (eN.c(29069, 2142478755607037779L) ^ eN.c(15869, 1950759537875028982L) ^ eN.c(31133, 5385392801540067249L) ^ eN.c(14216, 8096092442036338981L)) + eN.c(11550, 1314555880193596348L);
                    continue block12;
                }
lbl36:
                // 1 sources

                v1 /* !! */  = var4_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)(eN.c(4820, 5620315712390767775L) + eN.c(908, 7447815843695474153L)), (int)eN.c(21575, 2540241643974746774L), (long)834203424483934088L) + eN.c(3343, 6159144818456705676L)), (int)eN.c(28440, 3161914648545581529L), (long)834203424483934088L) + eN.c(26719, 6960616124342361843L));
lbl37:
                // 2 sources

                if (!var2_2) ** GOTO lbl40
lbl38:
                // 2 sources

                var4_3 /* !! */  = (int)(hi.a("G", (int)(eN.c(31411, 6143147501745818747L) + eN.c(6303, 7898679811473321524L) - eN.c(18545, 88789375896616926L)), (int)eN.c(30665, 6835363340236931377L), (long)834203424483934088L) - eN.c(25744, 2412983587666547204L));
                if (var2_2) ** GOTO lbl57
lbl40:
                // 2 sources

                switch (var4_3 /* !! */ ) {
                    default: {
                        ** GOTO lbl10
                    }
                    case 878376156: {
                        ** GOTO lbl13
                    }
                    case 878376157: 
                }
                eN.F("3DEa1RDfYTTNptd1", X(float float int ), (float)0.0f, (float)-1.0f, (int)eN.c(96, 4031834280251307730L));
                hi.a("G", (long)957299721117170898L);
                if (var2_2) ** break;
                ** continue;
lbl52:
                // 2 sources

                v0 /* !! */  = (CallSite)((eN.c(6033, 3088763480726381038L) ^ eN.c(9595, 7593122370384368459L) ^ eN.c(22346, 7600573029631091022L) ^ eN.c(10741, 6017839375474499496L)) + eN.c(6818, 1457451378056211469L));
lbl53:
                // 2 sources

                var4_3 /* !! */  = (int)v0 /* !! */ ;
                if (!var2_2) continue block12;
lbl55:
                // 2 sources

                var4_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)eN.c(6751, 5688971413633740028L), (int)eN.c(14248, 7070299131015135723L), (long)834203424483934088L), (int)eN.c(5029, 9025425634414437397L), (long)834203424483934088L) / 4 + eN.c(3422, 8866638000716463023L) - eN.c(20084, 5503270846278465558L));
                continue block12;
lbl57:
                // 2 sources

                var4_3 /* !! */  = (eN.c(25739, 4719428769262719698L) ^ eN.c(475, 3521079987318503001L) ^ eN.c(12296, 3806331122533074641L) ^ eN.c(14700, 5157658848623365948L)) + eN.c(4306, 1208113726923974475L);
                if (!var2_2) continue block12;
lbl59:
                // 2 sources

                var4_3 /* !! */  = hi.a("G", (int)((eN.c(26754, 58463591833984708L) ^ eN.c(30489, 8931226829509050686L)) / eN.c(1111, 5215961395006353975L)), (int)eN.c(24734, 2809726451659101885L), (long)834203424483934088L) / 2 ^ eN.c(3806, 4847192104054765569L);
                continue block12;
                case 1672133759: 
            }
            break;
        }
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void B(Object[] var1_1) {
        block22: {
            block21: {
                var2_2 = Dl.S();
                var6_3 /* !! */  = eN.c(25480, 3848816967097406975L) * eN.c(19438, 1292178846276746698L) ^ eN.c(22791, 5538485365119479702L) ^ eN.c(26197, 5364081040974467182L) ^ eN.c(12379, 2216534148057040544L);
                if (var2_2) break block21;
lbl5:
                // 2 sources

                while (true) {
                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)583781764643229412L), (long)371165648327601127L);
                    if (!var2_2) ** GOTO lbl69
                    if (v0 /* !! */  != false) ** GOTO lbl68
                    ** GOTO lbl71
                    break;
                }
lbl10:
                // 2 sources

                while (true) {
                    v1 /* !! */  = eN.F("3DEa1RDfYTTNptd1", hasNext(), (Iterator)var3_4);
                    if (!var2_2) ** GOTO lbl29
                    if (v1 /* !! */  == false) ** GOTO lbl28
                    ** GOTO lbl31
                    break;
                }
lbl15:
                // 2 sources

                while (!var2_2) {
                    return;
                }
                break block22;
            }
            block16: while (true) {
                switch (var6_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1418577041: {
                        var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)583781764643229412L), (long)516243337181930536L);
                        if (!var2_2) ** GOTO lbl10
                        var6_3 /* !! */  = hi.a("G", (int)((eN.c(18649, 1660052921001934371L) ^ eN.c(28053, 4065323374502402573L)) * eN.c(3440, 1564677582617885595L) ^ eN.c(23310, 8841573880082787741L)), (int)eN.c(10587, 5414135049731252034L), (long)834203424483934088L) ^ eN.c(27960, 1488842345780730856L);
                        if (var2_2) break;
lbl28:
                        // 2 sources

                        v1 /* !! */  = (CallSite)((hi.a("G", (int)eN.c(2275, 2733777896692727620L), (int)eN.c(5670, 6268128125783482493L), (long)834203424483934088L) + eN.c(14662, 5905266176377884528L) ^ eN.c(24335, 1371306324663625907L)) / eN.c(27380, 3469716657499593838L) - eN.c(16144, 4277374388078283235L));
lbl29:
                        // 2 sources

                        var6_3 /* !! */  = (int)v1 /* !! */ ;
                        if (var2_2) continue block16;
lbl31:
                        // 2 sources

                        var6_3 /* !! */  = hi.a("G", (int)eN.c(13995, 3449471158300639541L), (int)eN.c(23513, 6335752768873393413L), (long)834203424483934088L) ^ eN.c(7336, 5554641669308983847L);
                        break;
                    }
                    case 1418577044: {
                        return;
                    }
                    case 1418577043: {
                        return;
                    }
                }
lbl37:
                // 3 sources

                while (true) {
                    switch (var6_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 1617691376: {
                            var4_5 = (Packet)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                            hi.a("G", (Object)var4_5, (long)862951805677234099L);
                            v2 = var4_5 instanceof ServerboundMovePlayerPacket;
                            if (!var2_2) ** GOTO lbl48
                            if (v2 != 0) ** GOTO lbl49
                            v2 = var6_3 /* !! */  = hi.a("G", (int)eN.c(6259, 1226096007735389943L), (int)eN.c(22240, 3524046629911879928L), (long)834203424483934088L) * eN.c(14990, 3105114036633210137L) + eN.c(4354, 3563596239812503464L) ^ eN.c(14677, 9130811055195164615L) ^ eN.c(10200, 209653975673278744L);
lbl48:
                            // 2 sources

                            if (var2_2) break;
lbl49:
                            // 2 sources

                            var6_3 /* !! */  = eN.c(20255, 3742899061371206131L) - eN.c(20606, 3581877659681089155L) + eN.c(29283, 8138312428862882927L);
                            break;
                        }
                        case 1617691377: {
                            return;
                        }
                    }
                    do lbl-1000:
                    // 3 sources

                    {
                        block23: {
                            switch (var6_3 /* !! */ ) {
                                default: {
                                    var5_6 = (ServerboundMovePlayerPacket)var4_5;
                                    hi.a("\u00a5", (Object)this, (Object)new Object[]{var5_6}, (long)793540661162421947L);
                                    if (var2_2) break block23;
                                    ** GOTO lbl15
                                }
                                case -1284070282: {
                                    ** GOTO lbl15
                                }
                                case -1284070280: {
                                    hi.a("G", (long)1109407344178516224L);
                                    var6_3 /* !! */  = (int)(hi.a("G", (int)((eN.c(12056, 1993543640799746393L) ^ eN.c(10711, 363635655544315806L)) + eN.c(12891, 4048678645553923125L)), (int)eN.c(25218, 5444999150293177578L), (long)834203424483934088L) + eN.c(14690, 3949359990211022576L) + eN.c(32030, 3948934977167281098L));
                                    if (var2_2) ** GOTO lbl-1000
                                }
                            }
lbl68:
                            // 2 sources

                            v0 /* !! */  = (CallSite)((hi.a("G", (int)eN.c(8274, 1016773369484089064L), (int)eN.c(9974, 5859891111365939273L), (long)834203424483934088L) + eN.c(21236, 7792678086868526428L) ^ eN.c(6879, 4169568060270390434L)) / eN.c(27380, 3469716657499593838L) - eN.c(8908, 8052373585739289602L));
lbl69:
                            // 2 sources

                            var6_3 /* !! */  = (int)v0 /* !! */ ;
                            if (var2_2) continue block16;
lbl71:
                            // 2 sources

                            var6_3 /* !! */  = (int)((hi.a("G", (int)eN.c(6136, 5372242091584397756L), (int)eN.c(22943, 8111719392746762215L), (long)834203424483934088L) - eN.c(3047, 3635678927766437122L)) / eN.c(31362, 7339588974542638196L) - eN.c(3183, 1448582587533277859L));
                            continue block16;
                        }
                        var6_3 /* !! */  = eN.F("3DEa1RDfYTTNptd1", max(int int ), (int)eN.c(19639, 6481663480202885812L), (int)eN.c(18702, 4117541223016169148L)) * eN.c(26831, 8998632261258338042L) + eN.c(5293, 4868450014191034939L) ^ eN.c(1011, 7473285499762161016L) ^ eN.c(1647, 2505286843442016376L);
                    } while (var2_2);
                    break;
                }
                break;
            }
        }
        var6_3 /* !! */  = hi.a("G", (int)((eN.c(31789, 5816936620265097770L) ^ eN.c(6819, 4058598733508586597L)) * eN.c(25681, 6183531435801891575L) ^ eN.c(25976, 6981743714780140258L)), (int)eN.c(404, 1091262225942361979L), (long)834203424483934088L) ^ eN.c(26971, 7241829434245439394L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void b(Object[] var1_1) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            block15: {
                                block16: {
                                    var2_2 = Dl.S();
                                    var3_3 /* !! */  = eN.c(17703, 8760428656283874104L) * eN.c(11506, 1832421798649535168L) - eN.c(16213, 8169218436445342135L) ^ eN.c(29203, 5583055152850748569L) ^ eN.c(18500, 1412728850433244916L);
                                    if (!var2_2) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            v0 = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                                            if (!var2_2) break block15;
                                            if (v0 == false) break block16;
                                            break block17;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        return;
lbl12:
                                        // 1 sources

                                        while (true) {
                                            v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)867381889368980735L), (long)789438897355831922L)), (long)1000026253634408124L);
                                            if (!var2_2) break block18;
                                            if (v1 /* !! */  == false) break block19;
                                            break block20;
                                            break;
                                        }
lbl17:
                                        // 1 sources

                                        while (true) {
                                            eN.F("3DEa1RDfYTTNptd1", removeEntity(int net.minecraft.world.entity.Entity$RemovalReason ), (ClientLevel)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)527091654294005381L), (long)931876227016865691L), (Entity.RemovalReason)hi.a("j", (long)766574543120786341L));
                                            if (!var2_2) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)594204132228460448L);
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)583781764643229412L), (long)1087243057585807523L);
                                                    return;
                                                }
                                            }
                                            break block21;
                                            break;
                                        }
                                    }
lbl25:
                                    // 7 sources

                                    while (true) {
                                        switch (var3_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -1740563725: {
                                                ** continue;
                                            }
                                            case -1740563727: {
                                                ** continue;
                                            }
                                            case -1740563729: {
                                                ** continue;
                                            }
                                            case -1740563726: {
                                                ** continue;
                                            }
                                            case -1740563730: 
                                        }
                                        hi.a("G", (int)0, (int)0, (long)656208795491924261L);
                                        eN.F("3DEa1RDfYTTNptd1", A());
                                        return;
                                    }
                                }
                                v0 = hi.a("G", (int)(eN.c(1923, 5833366584476348799L) * eN.c(10003, 4722658516668289286L)), (int)eN.c(17952, 1292607280069079252L), (long)834203424483934088L) - eN.c(18974, 9150519045504760898L);
                            }
                            var3_3 /* !! */  = (int)v0;
                            if (var2_2) ** GOTO lbl25
                        }
                        var3_3 /* !! */  = (int)(hi.a("G", (int)eN.c(10834, 4012314528631954662L), (int)eN.c(20477, 9048230644944730446L), (long)834203424483934088L) / eN.c(29801, 7262395967692292672L) - eN.c(22739, 1435140510696271432L));
                        if (var2_2) ** GOTO lbl25
                    }
                    v1 /* !! */  = (CallSite)((eN.c(14891, 1023363097410342067L) - eN.c(2387, 8525907290570703L)) / eN.c(18214, 2755031246200762515L) / eN.c(31362, 7339588974542638196L) ^ eN.c(13899, 5379815404518638064L));
                }
                var3_3 /* !! */  = (int)v1 /* !! */ ;
                if (var2_2) ** GOTO lbl25
            }
            var3_3 /* !! */  = eN.F("3DEa1RDfYTTNptd1", max(int int ), (int)(eN.c(29275, 2160898297099797589L) * eN.c(21460, 3274127575979091399L) * eN.c(28219, 3357851580169378215L) * eN.c(22013, 5763291271312171999L)), (int)eN.c(13518, 3398570068042514985L)) ^ eN.c(22857, 3994778533734477555L);
            if (var2_2) ** GOTO lbl25
        }
        var3_3 /* !! */  = (eN.c(1249, 7348823110828569430L) - eN.c(5969, 7407105079359152508L)) / eN.c(31362, 7339588974542638196L) / eN.c(31362, 7339588974542638196L) ^ eN.c(2733, 3040618764391201957L);
        ** while (true)
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFF9CDC) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 12;
                case 1 -> 151;
                case 2 -> 63;
                case 3 -> 50;
                case 4 -> 72;
                case 5 -> 231;
                case 6 -> 168;
                case 7 -> 107;
                case 8 -> 98;
                case 9 -> 35;
                case 10 -> 247;
                case 11 -> 9;
                case 12 -> 192;
                case 13 -> 198;
                case 14 -> 5;
                case 15 -> 187;
                case 16 -> 222;
                case 17 -> 171;
                case 18 -> 37;
                case 19 -> 195;
                case 20 -> 167;
                case 21 -> 127;
                case 22 -> 86;
                case 23 -> 89;
                case 24 -> 122;
                case 25 -> 66;
                case 26 -> 140;
                case 27 -> 227;
                case 28 -> 13;
                case 29 -> 6;
                case 30 -> 17;
                case 31 -> 219;
                case 32 -> 131;
                case 33 -> 28;
                case 34 -> 244;
                case 35 -> 69;
                case 36 -> 162;
                case 37 -> 228;
                case 38 -> 78;
                case 39 -> 224;
                case 40 -> 70;
                case 41 -> 54;
                case 42 -> 211;
                case 43 -> 8;
                case 44 -> 150;
                case 45 -> 141;
                case 46 -> 254;
                case 47 -> 243;
                case 48 -> 26;
                case 49 -> 95;
                case 50 -> 124;
                case 51 -> 183;
                case 52 -> 145;
                case 53 -> 177;
                case 54 -> 32;
                case 55 -> 101;
                case 56 -> 184;
                case 57 -> 30;
                case 58 -> 147;
                case 59 -> 45;
                case 60 -> 144;
                case 61 -> 19;
                case 62 -> 196;
                case 63 -> 240;
                case 64 -> 93;
                case 65 -> 251;
                case 66 -> 146;
                case 67 -> 76;
                case 68 -> 68;
                case 69 -> 11;
                case 70 -> 149;
                case 71 -> 106;
                case 72 -> 236;
                case 73 -> 161;
                case 74 -> 75;
                case 75 -> 40;
                case 76 -> 128;
                case 77 -> 53;
                case 78 -> 132;
                case 79 -> 170;
                case 80 -> 43;
                case 81 -> 165;
                case 82 -> 80;
                case 83 -> 15;
                case 84 -> 48;
                case 85 -> 115;
                case 86 -> 234;
                case 87 -> 96;
                case 88 -> 135;
                case 89 -> 208;
                case 90 -> 176;
                case 91 -> 49;
                case 92 -> 178;
                case 93 -> 103;
                case 94 -> 91;
                case 95 -> 223;
                case 96 -> 60;
                case 97 -> 25;
                case 98 -> 148;
                case 99 -> 7;
                case 100 -> 20;
                case 101 -> 79;
                case 102 -> 82;
                case 103 -> 24;
                case 104 -> 157;
                case 105 -> 67;
                case 106 -> 130;
                case 107 -> 255;
                case 108 -> 90;
                case 109 -> 120;
                case 110 -> 241;
                case 111 -> 113;
                case 112 -> 193;
                case 113 -> 188;
                case 114 -> 81;
                case 115 -> 210;
                case 116 -> 100;
                case 117 -> 230;
                case 118 -> 186;
                case 119 -> 134;
                case 120 -> 87;
                case 121 -> 201;
                case 122 -> 111;
                case 123 -> 191;
                case 124 -> 229;
                case 125 -> 16;
                case 126 -> 175;
                case 127 -> 34;
                case 128 -> 94;
                case 129 -> 47;
                case 130 -> 116;
                case 131 -> 23;
                case 132 -> 97;
                case 133 -> 64;
                case 134 -> 174;
                case 135 -> 237;
                case 136 -> 108;
                case 137 -> 160;
                case 138 -> 226;
                case 139 -> 215;
                case 140 -> 52;
                case 141 -> 207;
                case 142 -> 99;
                case 143 -> 156;
                case 144 -> 31;
                case 145 -> 206;
                case 146 -> 202;
                case 147 -> 197;
                case 148 -> 85;
                case 149 -> 142;
                case 150 -> 153;
                case 151 -> 61;
                case 152 -> 14;
                case 153 -> 51;
                case 154 -> 166;
                case 155 -> 22;
                case 156 -> 59;
                case 157 -> 182;
                case 158 -> 169;
                case 159 -> 152;
                case 160 -> 225;
                case 161 -> 57;
                case 162 -> 84;
                case 163 -> 248;
                case 164 -> 102;
                case 165 -> 92;
                case 166 -> 65;
                case 167 -> 29;
                case 168 -> 189;
                case 169 -> 245;
                case 170 -> 213;
                case 171 -> 154;
                case 172 -> 214;
                case 173 -> 155;
                case 174 -> 217;
                case 175 -> 118;
                case 176 -> 137;
                case 177 -> 203;
                case 178 -> 55;
                case 179 -> 138;
                case 180 -> 125;
                case 181 -> 212;
                case 182 -> 41;
                case 183 -> 143;
                case 184 -> 252;
                case 185 -> 204;
                case 186 -> 3;
                case 187 -> 250;
                case 188 -> 18;
                case 189 -> 158;
                case 190 -> 10;
                case 191 -> 71;
                case 192 -> 242;
                case 193 -> 246;
                case 194 -> 233;
                case 195 -> 1;
                case 196 -> 105;
                case 197 -> 235;
                case 198 -> 216;
                case 199 -> 173;
                case 200 -> 253;
                case 201 -> 0;
                case 202 -> 27;
                case 203 -> 39;
                case 204 -> 199;
                case 205 -> 238;
                case 206 -> 77;
                case 207 -> 109;
                case 208 -> 2;
                case 209 -> 117;
                case 210 -> 114;
                case 211 -> 62;
                case 212 -> 129;
                case 213 -> 21;
                case 214 -> 133;
                case 215 -> 121;
                case 216 -> 164;
                case 217 -> 163;
                case 218 -> 136;
                case 219 -> 56;
                case 220 -> 126;
                case 221 -> 220;
                case 222 -> 123;
                case 223 -> 139;
                case 224 -> 180;
                case 225 -> 194;
                case 226 -> 110;
                case 227 -> 221;
                case 228 -> 44;
                case 229 -> 38;
                case 230 -> 42;
                case 231 -> 159;
                case 232 -> 73;
                case 233 -> 181;
                case 234 -> 249;
                case 235 -> 209;
                case 236 -> 119;
                case 237 -> 232;
                case 238 -> 185;
                case 239 -> 190;
                case 240 -> 200;
                case 241 -> 88;
                case 242 -> 179;
                case 243 -> 4;
                case 244 -> 46;
                case 245 -> 104;
                case 246 -> 239;
                case 247 -> 74;
                case 248 -> 58;
                case 249 -> 83;
                case 250 -> 33;
                case 251 -> 36;
                case 252 -> 112;
                case 253 -> 172;
                case 254 -> 218;
                default -> 205;
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
            eN.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36B7;
        if (o[n2] == null) {
            eN.o[n2] = (int)(h[n2] ^ l);
        }
        return o[n2];
    }
}
