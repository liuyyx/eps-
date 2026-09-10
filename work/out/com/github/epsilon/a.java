/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.chat.MutableComponent
 *  net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket
 *  net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket
 *  net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket
 */
package com.github.epsilon;

import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Xc;
import com.github.epsilon.Xn;
import com.github.epsilon.dP;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket;
import net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket;
import net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket;

public class a
extends e {
    public static final a h;
    private final Xc y = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.a.b(-14313, -26920), (Object)com.github.epsilon.a.b(-14320, 25137), (long)968960764191203886L);
    private final DV S;
    private final Xn w = hi.a("\u00a5", (Object)this, (Object)com.github.epsilon.a.b(-14316, -3328), (boolean)true, (long)1230617056439551805L);
    private static final Pattern P;
    private final DV T;
    private final DV x;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    private boolean lambda$new$0() {
        boolean bl = Dl.t();
        Object object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)393000913149152142L), (long)789438897355831922L))), (long)1000026253634408124L);
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
    private Component x(Object[] var1_1) {
        block12: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var8_4 /* !! */  = (com.github.epsilon.a.c(17062, 2139783055848947352L) + com.github.epsilon.a.c(9231, 419109667658520657L) + com.github.epsilon.a.c(29202, 7345337671978421932L) ^ com.github.epsilon.a.c(26192, 873063810467928600L)) / com.github.epsilon.a.c(26907, 8430642403542046071L) - com.github.epsilon.a.c(16329, 4960526276011901821L);
            if (var3_3) break block12;
lbl6:
            // 2 sources

            while (true) {
                v0 = var2_2;
                while (true) {
                    block15: {
                        block14: {
                            block13: {
                                var4_5 = com.github.epsilon.a.U("6igsN133xYyJoDFI", getString(), (Component)((Component)v0));
                                var5_6 = hi.a("\u00a5", (Object)hi.a("j", (long)1254031206168717735L), (Object)var4_5, (long)909756653359432071L);
                                v1 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)1061476956687674712L);
                                if (!var3_3) break block13;
                                if (v1 /* !! */  == false) break block14;
                                v1 /* !! */  = (CallSite)((com.github.epsilon.a.c(3329, 5663508132856623460L) ^ com.github.epsilon.a.c(24470, 4384393528968618810L)) + com.github.epsilon.a.c(8231, 7771493926184246414L));
                            }
                            var8_4 /* !! */  = (int)v1 /* !! */ ;
                            if (var3_3) break block15;
                        }
                        var8_4 /* !! */  = (com.github.epsilon.a.c(7082, 6914827091983493085L) + com.github.epsilon.a.c(21333, 2243077143997984538L)) * com.github.epsilon.a.c(8670, 7574786505525845491L) ^ com.github.epsilon.a.c(2814, 855388407704057562L);
                    }
                    switch (var8_4 /* !! */ ) {
                        default: {
                            return null;
                        }
                        case -1234752909: {
                            var6_7 = (String)com.github.epsilon.a.U("6igsN133xYyJoDFI", substring(int int ), (String)var4_5, (int)0, (int)hi.a("\u00a5", (Object)var5_6, (long)1114129842868497354L)) + (String)com.github.epsilon.a.U("6igsN133xYyJoDFI", group(int ), (Matcher)var5_6, (int)1);
                            var7_8 = hi.a("\u00a5", (Object)var4_5, (int)com.github.epsilon.a.U("6igsN133xYyJoDFI", end(), (Matcher)var5_6), (long)824964209439198311L);
                            return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", var6_7, (long)1262634304799069784L), (Object)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1329122928620943146L), (long)1224058718624515155L), (Object)hi.a("G", (Object)var7_8, (long)1262634304799069784L), (long)1224058718624515155L);
                        }
                        case -1234752907: 
                    }
                    return null;
                }
                break;
            }
        }
        while (true) {
            switch (var8_4 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1984775: 
            }
            v0 = hi.a("G", (long)393077516895504904L);
            if (!var3_3) ** continue;
            var8_4 /* !! */  = com.github.epsilon.a.c(13700, 6732635418006931762L) ^ com.github.epsilon.a.c(29461, 4067563987814748040L) ^ com.github.epsilon.a.c(29818, 4365728917188348012L) ^ com.github.epsilon.a.c(8325, 546658291402267886L);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @yE
    private void R(dP var1_1) {
        block64: {
            block63: {
                block61: {
                    block65: {
                        block68: {
                            block67: {
                                block66: {
                                    var2_2 = Dl.S();
                                    var11_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)hi.a("G", (int)com.github.epsilon.a.c(27311, 8873104653641127561L), (int)com.github.epsilon.a.c(11924, 8430500075139125921L), (long)834203424483934088L), (int)com.github.epsilon.a.c(14150, 9103561596662893536L), (long)834203424483934088L), (int)com.github.epsilon.a.c(1002, 5102369032916041643L), (long)834203424483934088L) + com.github.epsilon.a.c(24524, 2931249158918054846L);
                                    if (!var2_2) ** GOTO lbl-1000
                                    switch (var11_3 /* !! */ ) {
                                        default: lbl-1000:
                                        // 2 sources

                                        {
                                            var9_4 = com.github.epsilon.a.U("6igsN133xYyJoDFI", B(), (dP)var1_1);
                                            v0 = var9_4 instanceof ClientboundSetTitleTextPacket;
                                            if (!var2_2) break block66;
                                            if (v0 == 0) break;
                                            break block67;
                                        }
                                        case -1189700785: {
                                            throw null;
                                        }
                                    }
                                    v0 = (com.github.epsilon.a.c(31957, 6005583151172386917L) - com.github.epsilon.a.c(32551, 281691290223608717L)) * com.github.epsilon.a.c(23728, 1045249123456196769L) / 5 + com.github.epsilon.a.c(30108, 710133802753657228L) + com.github.epsilon.a.c(223, 2167238682620755063L);
                                }
                                var11_3 /* !! */  = (CallSite)v0;
                                if (var2_2) break block68;
                            }
                            var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(29947, 7889860497120266452L) * com.github.epsilon.a.c(12850, 3981520730100256267L) - com.github.epsilon.a.c(3532, 8952362142210716135L) ^ com.github.epsilon.a.c(21534, 476258189682419846L));
                            break block68;
lbl20:
                            // 2 sources

                            while (true) {
                                block70: {
                                    block69: {
                                        v1 = com.github.epsilon.a.U("6igsN133xYyJoDFI", text(), (ClientboundSetTitleTextPacket)var3_5 /* !! */ );
                                        if (!var2_2) ** GOTO lbl-1000
                                        var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(19496, 6385268525569290374L) - com.github.epsilon.a.c(10712, 1875276214549304808L) - com.github.epsilon.a.c(26732, 2240381436102677616L) + com.github.epsilon.a.c(7739, 398698760889262655L) ^ com.github.epsilon.a.c(10066, 6949966963235904266L));
                                        switch (var11_3 /* !! */ ) {
                                            default: lbl-1000:
                                            // 2 sources

                                            {
                                                var4_7 = var10_6 = v1;
                                                var9_4 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var4_7}, (long)421833328600376771L);
                                                if (!var2_2) break block69;
                                                if (var9_4 == null) break;
                                                break block70;
                                            }
                                            case -279117313: {
                                                throw null;
                                            }
                                        }
                                        var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(20513, 36905919484079171L) - com.github.epsilon.a.c(11464, 1906495757172953285L) ^ com.github.epsilon.a.c(5542, 7712770977348348300L));
                                    }
                                    if (var2_2) break block61;
                                }
                                var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(9070, 841358648025636815L) - com.github.epsilon.a.c(5807, 7107588014086744627L) + com.github.epsilon.a.c(12918, 6015476622367149622L));
                                if (var2_2) break block61;
                                ** GOTO lbl201
                                break;
                            }
lbl42:
                            // 2 sources

                            while (true) {
                                block72: {
                                    block71: {
                                        block62: {
                                            v2 = com.github.epsilon.a.U("6igsN133xYyJoDFI", text(), (ClientboundSetSubtitleTextPacket)v3);
                                            if (!var2_2) break block62;
                                            var11_3 /* !! */  = hi.a("G", (int)com.github.epsilon.a.c(17015, 7267529775367994945L), (int)com.github.epsilon.a.c(5720, 3095143753826364004L), (long)834203424483934088L) - com.github.epsilon.a.c(5550, 405988880006277535L);
                                            v4 = var11_3 /* !! */ ;
                                            if (var2_2) {
                                                switch (v4) {
                                                    default: {
                                                        break;
                                                    }
                                                    case -600150974: {
                                                        hi.a("G", (float)-14.0f, (float)1.0f, (float)2.0f, (float)0.0f, (double)1.0, (long)754865965182321349L);
                                                        v4 = hi.a("G", (int)1, (long)525303406604919947L);
                                                    }
                                                }
                                            }
                                        }
                                        var6_9 = var10_6 = v2;
                                        var9_4 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var6_9}, (long)421833328600376771L);
                                        if (!var2_2) break block71;
                                        if (var9_4 != null) break block72;
                                        var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(21187, 4164725765725302352L) / 3 / com.github.epsilon.a.c(22879, 555913981119407384L) + com.github.epsilon.a.c(3667, 5068563745886335681L) - com.github.epsilon.a.c(29901, 1882067431469516958L));
                                    }
                                    if (var2_2) break block63;
                                }
                                var11_3 /* !! */  = (CallSite)((com.github.epsilon.a.c(29251, 3124713193475771996L) + com.github.epsilon.a.c(15411, 8881719980068356264L) ^ com.github.epsilon.a.c(11329, 6090291353032609842L)) + com.github.epsilon.a.c(6972, 3990892215345637177L));
                                if (var2_2) break block63;
                                ** GOTO lbl216
                                break;
                            }
lbl69:
                            // 2 sources

                            while (true) {
                                block75: {
                                    block74: {
                                        block73: {
                                            try {
                                                v5 = hi.a("\u00a5", (Object)v6, (long)1043440603635489145L);
                                                if (!var2_2) ** GOTO lbl-1000
                                            }
                                            catch (Throwable v7) {
                                                var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(23432, 9008155164731221963L) - com.github.epsilon.a.c(1633, 6559078591562611454L) ^ com.github.epsilon.a.c(17860, 7023032391653308820L));
                                            }
                                            var11_3 /* !! */  = (CallSite)((hi.a("G", (int)com.github.epsilon.a.c(4853, 4268058155513802457L), (int)com.github.epsilon.a.c(28818, 5929713141184433198L), (long)834203424483934088L) - com.github.epsilon.a.c(6890, 7220558050738726596L) ^ com.github.epsilon.a.c(10176, 328489673519094643L)) - com.github.epsilon.a.c(16667, 2866647966675025313L));
                                            switch (var11_3 /* !! */ ) {
                                                default: lbl-1000:
                                                // 2 sources

                                                {
                                                    var8_11 = var10_6 = v5;
                                                    var9_4 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var8_11}, (long)421833328600376771L);
                                                    if (!var2_2) break block73;
                                                    if (var9_4 == null) break;
                                                    break block74;
                                                }
                                                case -1981655179: {
                                                    throw null;
                                                }
                                            }
                                            var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(20505, 4108150252376960033L) ^ com.github.epsilon.a.c(24958, 5798318681298279800L) ^ com.github.epsilon.a.c(17823, 2625339692764150218L));
                                        }
                                        if (var2_2) break block64;
                                    }
                                    var11_3 /* !! */  = (CallSite)((com.github.epsilon.a.c(23994, 6606153839481299367L) / com.github.epsilon.a.c(25621, 3471927880949372957L) + com.github.epsilon.a.c(29800, 5456002066556553280L) ^ com.github.epsilon.a.c(30917, 351778454293447819L)) - com.github.epsilon.a.c(25316, 741533740608036545L));
                                    if (!var2_2) break block75;
                                    switch (var11_3 /* !! */ ) {
                                        default: {
                                            hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{new ClientboundSetActionBarTextPacket((Component)var9_4)}, (long)664098309786242986L);
                                            if (var2_2) break;
                                            ** GOTO lbl-1000
                                        }
                                        case -1775146568: {
                                            throw null;
                                        }
                                    }
                                }
                                var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(20505, 4108150252376960033L) ^ com.github.epsilon.a.c(24958, 5798318681298279800L) ^ com.github.epsilon.a.c(17823, 2625339692764150218L));
                                if (var2_2) break block64;
                                ** GOTO lbl-1000
                                switch (var11_3 /* !! */ ) {
                                    default: {
                                        var3_5 /* !! */  = v7;
                                        throw new MatchException((String)hi.a("\u00a5", (Object)var3_5 /* !! */ , (long)1078596985450647053L), (Throwable)var3_5 /* !! */ );
                                    }
                                    case 1606896485: 
                                }
                                hi.a("G", (long)636853863237534702L);
                                hi.a("G", (float)-1.0f, (float)1.0f, (float)-1.0f, (float)2.0f, (long)796776827756410481L);
                                return;
                            }
                        }
                        block53: while (true) {
                            block82: {
                                block80: {
                                    block81: {
                                        block79: {
                                            block78: {
                                                block76: {
                                                    block77: {
                                                        switch (var11_3 /* !! */ ) {
                                                            default: {
                                                                var3_5 /* !! */  = (ClientboundSetTitleTextPacket)var9_4;
                                                                if (var2_2) break;
                                                                ** GOTO lbl20
                                                            }
                                                            case 917905361: {
                                                                var9_4 = hi.a("\u00a5", (Object)var1_1, (long)634364534990057548L);
                                                                v8 = var9_4 instanceof ClientboundSetSubtitleTextPacket;
                                                                if (!var2_2) break block76;
                                                                if (v8 == 0) break block77;
                                                                break block78;
                                                            }
                                                            case 917905357: {
                                                                v3 = var5_8 = (ClientboundSetSubtitleTextPacket)var9_4;
                                                                if (var2_2) break block79;
                                                                ** GOTO lbl42
                                                            }
                                                            case 917905358: {
                                                                var9_4 = hi.a("\u00a5", (Object)var1_1, (long)634364534990057548L);
                                                                v9 = var9_4 instanceof ClientboundSetActionBarTextPacket;
                                                                if (!var2_2) break block80;
                                                                if (v9 == 0) break block81;
                                                                break block82;
                                                            }
                                                            case 917905359: {
                                                                v6 = var7_10 = (ClientboundSetActionBarTextPacket)var9_4;
                                                                if (var2_2) break block53;
                                                                ** GOTO lbl69
                                                            }
                                                            case 917905360: {
                                                                hi.a("G", (float)-0.5f, (float)1.0f, (long)730361849522875513L);
                                                                return;
                                                            }
                                                        }
                                                        break block65;
                                                    }
                                                    v8 = com.github.epsilon.a.c(6592, 4121276150532269415L) + com.github.epsilon.a.c(6445, 3524410775422854512L) + com.github.epsilon.a.c(13031, 8292289379422522965L) ^ com.github.epsilon.a.c(19440, 7977806081432467271L);
                                                }
                                                var11_3 /* !! */  = (CallSite)v8;
                                                if (var2_2) continue;
                                            }
                                            var11_3 /* !! */  = (CallSite)((hi.a("G", (int)com.github.epsilon.a.c(6892, 7002797562320807608L), (int)com.github.epsilon.a.c(9933, 7649096617347340960L), (long)834203424483934088L) / 5 - com.github.epsilon.a.c(5018, 7671895099730751416L) ^ com.github.epsilon.a.c(24325, 2729041306485433094L)) + com.github.epsilon.a.c(28951, 6860431939231583669L));
                                            continue;
                                        }
                                        var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(30828, 1655607940609705054L) + com.github.epsilon.a.c(11309, 441438498732986498L) + com.github.epsilon.a.c(6619, 1857144503545685466L) - com.github.epsilon.a.c(23015, 951693340427199889L));
                                        switch (var11_3 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -532517497: 
                                        }
                                        return;
                                    }
                                    v9 = com.github.epsilon.a.c(20505, 4108150252376960033L) ^ com.github.epsilon.a.c(24958, 5798318681298279800L) ^ com.github.epsilon.a.c(17823, 2625339692764150218L);
                                }
                                var11_3 /* !! */  = (CallSite)v9;
                                if (var2_2) break block64;
                            }
                            var11_3 /* !! */  = (CallSite)(hi.a("G", (int)(com.github.epsilon.a.c(26420, 3012447623341579023L) ^ com.github.epsilon.a.c(25278, 1935284594575973889L)), (int)com.github.epsilon.a.c(4651, 1504736195360222859L), (long)834203424483934088L) ^ com.github.epsilon.a.c(23128, 1076746081013900895L));
                        }
                        var11_3 /* !! */  = (CallSite)(((com.github.epsilon.a.c(20481, 381098261063576600L) + com.github.epsilon.a.c(3616, 6617940303536714372L)) / com.github.epsilon.a.c(32498, 7607439533970096837L) - com.github.epsilon.a.c(26340, 9158710581536889525L)) * com.github.epsilon.a.c(32142, 5301775213724402069L) + com.github.epsilon.a.c(22692, 1013818785019896990L));
                        switch (var11_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -1605824072: 
                        }
                        hi.a("G", (long)1184702471901219908L);
                        hi.a("G", (double)10.0, (long)977232075298570964L);
                        return;
                    }
                    var11_3 /* !! */  = (CallSite)((com.github.epsilon.a.c(28185, 1950937815375581732L) ^ com.github.epsilon.a.c(3026, 2636453477340575641L)) * com.github.epsilon.a.c(9091, 7346044758502727453L) / 2 * com.github.epsilon.a.c(831, 9134713170599673600L) ^ com.github.epsilon.a.c(3378, 5215878617455358304L));
                    while (true) {
                        switch (var11_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -1005685865: 
                        }
                        hi.a("G", (long)487615547825844238L);
                        hi.a("G", (long)829648466043852550L);
                        var11_3 /* !! */  = (CallSite)((com.github.epsilon.a.c(30357, 5955441276100184811L) ^ com.github.epsilon.a.c(14190, 3998519155033328399L)) + com.github.epsilon.a.c(4735, 3148097680149606013L) ^ com.github.epsilon.a.c(15637, 4613808985639731632L));
                    }
                }
                block55: do {
                    switch (var11_3 /* !! */ ) {
                        default: {
                            hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{new ClientboundSetTitleTextPacket((Component)var9_4)}, (long)664098309786242986L);
                            if (var2_2) break;
                            break block55;
                        }
                        case 1698172992: {
                            break block55;
                        }
                        case 1698172993: {
                            return;
                        }
                    }
lbl201:
                    // 2 sources

                    var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(23228, 8315487964265326330L) - com.github.epsilon.a.c(24214, 4952896401694728757L) ^ com.github.epsilon.a.c(19260, 7017764491606013742L));
                } while (var2_2);
                var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(6307, 6833948039759488132L) ^ com.github.epsilon.a.c(19817, 5017032050681262437L) ^ com.github.epsilon.a.c(31299, 1115056915135071992L));
                break block64;
            }
            block56: do {
                switch (var11_3 /* !! */ ) {
                    default: {
                        hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{new ClientboundSetSubtitleTextPacket((Component)var9_4)}, (long)664098309786242986L);
                        if (var2_2) break;
                        break block56;
                    }
                    case 2104124631: {
                        break block56;
                    }
                    case 2104124630: {
                        return;
                    }
                }
lbl216:
                // 2 sources

                var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(23606, 1407678591114354812L) / 3 / com.github.epsilon.a.c(28589, 4031400552154174409L) + com.github.epsilon.a.c(23572, 7147231694967119924L) - com.github.epsilon.a.c(27107, 8990759475223336313L));
            } while (var2_2);
            var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(20505, 4108150252376960033L) ^ com.github.epsilon.a.c(24958, 5798318681298279800L) ^ com.github.epsilon.a.c(17823, 2625339692764150218L));
        }
        block57: while (true) {
            switch (var11_3 /* !! */ ) {
                default: lbl-1000:
                // 3 sources

                {
                    var11_3 /* !! */  = (CallSite)(com.github.epsilon.a.c(25390, 7553348058468982557L) * com.github.epsilon.a.c(7309, 7501383833096904853L) ^ com.github.epsilon.a.c(3809, 1621545822603473482L));
                    continue block57;
                }
                case -2018135330: {
                    return;
                }
                case -2018135329: 
            }
            break;
        }
        hi.a("G", (long)369479218486228686L);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)3, a.class);
        Hidden0.special_clinit_3_30(a.class);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Component c(Object[] var1_1) {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var2_2 = Dl.t();
                        var9_3 /* !! */  = hi.a("G", (int)com.github.epsilon.a.c(30497, 4869147295466195821L), (int)com.github.epsilon.a.c(2237, 6971143820754613440L), (long)834203424483934088L) * com.github.epsilon.a.c(28413, 3077109342849143443L) * com.github.epsilon.a.c(5955, 2689720253686606802L) - com.github.epsilon.a.c(7636, 3674420889367044473L);
                        if (var2_2) ** GOTO lbl-1000
                        v0 = var9_3 /* !! */ ;
                        if (var2_2 != false) return null;
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var3_4 = (String)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1239232284573236436L), (long)789438897355831922L);
                                v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)393000913149152142L), (long)789438897355831922L)), (long)1000026253634408124L);
                                if (var2_2) break block26;
                                if (v1 /* !! */  != false) break;
                                break block27;
                            }
                            case 352504925: {
                                ** GOTO lbl-1000
                            }
                        }
                        v1 /* !! */  = var9_3 /* !! */  = (reference)(hi.a("G", (int)com.github.epsilon.a.c(31533, 5195793944441259872L), (int)com.github.epsilon.a.c(19067, 6275890453946938884L), (long)834203424483934088L) ^ com.github.epsilon.a.c(10605, 6057265135517652326L) ^ com.github.epsilon.a.c(15173, 6148538803722635052L));
                    }
                    if (!var2_2) break block28;
                }
                var9_3 /* !! */  = (reference)(com.github.epsilon.a.c(12025, 7133047579603456588L) / com.github.epsilon.a.c(9614, 3543800647535909175L) + com.github.epsilon.a.c(17795, 3542042722491054535L) - com.github.epsilon.a.c(30128, 4739799371886922200L));
            }
            v0 = var9_3 /* !! */ ;
            if (var2_2 != false) return null;
            switch (v0) {
                default: {
                    return hi.a("\u00a5", (Object)hi.a("G", var3_4, (long)1262634304799069784L), (int)(hi.a("\u00a5", (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)721740377859322647L), (long)789438897355831922L)), (long)921162811333111485L) & com.github.epsilon.a.c(30428, 7180455670732262061L)), (long)680106319761801775L);
                }
                case -508221790: {
                    var4_5 = hi.a("\u00a5", (Object)hi.a("\u00a5", var3_4, (long)861253379497611487L), (long)761876676687843553L);
                    var5_6 = hi.a("G", (long)1322076422542474619L);
                    var6_7 = 0;
                    if (!var2_2) break;
                    break block29;
                }
                case -508221791: lbl-1000:
                // 2 sources

                {
                    hi.a("G", (long)986682684396269627L);
                    v0 = hi.a("G", (int)1, (int)0, (long)589346929323904906L);
                    return null;
                }
            }
            var9_3 /* !! */  = (reference)((com.github.epsilon.a.c(30749, 7023530662561154136L) ^ com.github.epsilon.a.c(1856, 6575015079479049013L)) + com.github.epsilon.a.c(11091, 3813035938032965418L));
            if (!var2_2) ** GOTO lbl64
            ** GOTO lbl46
        }
lbl41:
        // 2 sources

        while (true) {
            block31: {
                block30: {
                    v2 = var6_7;
                    v3 = ((CallSite)var4_5).length;
                    if (var2_2) break block30;
                    if (v2 < v3) break block31;
lbl46:
                    // 2 sources

                    v2 = com.github.epsilon.a.c(26953, 2970511960675161592L) / 5 + com.github.epsilon.a.c(25669, 9080260729311172856L);
                    v3 = com.github.epsilon.a.c(18249, 50283516330294087L);
                }
                var9_3 /* !! */  = (reference)(v2 + v3);
                if (!var2_2) ** GOTO lbl64
            }
            var9_3 /* !! */  = hi.a("G", (int)com.github.epsilon.a.c(31986, 8279217558979150066L), (int)com.github.epsilon.a.c(14723, 4428021548544116181L), (long)834203424483934088L) * com.github.epsilon.a.c(12193, 8308859260905116670L) + com.github.epsilon.a.c(25815, 7773338454483933405L);
            if (!var2_2) ** GOTO lbl64
            if (true) ** GOTO lbl92
            break;
        }
        block18: while (true) {
            var7_8 = v4;
            var8_9 = hi.a("\u00a5", (Object)hi.a("G", (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)947433122945228771L), (long)789438897355831922L)), (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)500274307432066351L), (long)789438897355831922L)), (float)var7_8, (long)1040237525350741921L), (long)921162811333111485L) & com.github.epsilon.a.c(24606, 8880527795374267396L);
            com.github.epsilon.a.U("6igsN133xYyJoDFI", append(net.minecraft.network.chat.Component ), (MutableComponent)var5_6, (Component)hi.a("\u00a5", (Object)hi.a("G", (Object)hi.a("G", (int)var4_5[var6_7], (long)753269186540997929L), (long)1262634304799069784L), (int)var8_9, (long)680106319761801775L));
            ++var6_7;
            if (var2_2) {
                return var5_6;
            }
            var9_3 /* !! */  = (reference)((com.github.epsilon.a.c(1464, 6202908468826175897L) ^ com.github.epsilon.a.c(4045, 5399523239992751015L)) + com.github.epsilon.a.c(13967, 7718921437503638267L));
lbl64:
            // 4 sources

            block19: while (true) {
                switch (var9_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1614692600: {
                        v5 = ((CallSite)var4_5).length;
                        v6 = 1;
                        if (var2_2) ** GOTO lbl94
                        if (v5 != v6) ** GOTO lbl92
                        ** GOTO lbl96
                    }
                    case 1614692599: {
                        v4 = 0.0f;
                        var9_3 /* !! */  = (reference)((hi.a("G", (int)hi.a("G", (int)com.github.epsilon.a.c(21100, 4624961869776957055L), (int)com.github.epsilon.a.c(21861, 4719447715001772350L), (long)834203424483934088L), (int)com.github.epsilon.a.c(21216, 6842573357416263289L), (long)834203424483934088L) + com.github.epsilon.a.c(24215, 343941109684904688L)) * com.github.epsilon.a.c(12321, 8866220252425604148L) ^ com.github.epsilon.a.c(13209, 4511781865672069014L));
                        if (!var2_2) ** GOTO lbl99
                        ** GOTO lbl98
                    }
                    case 1614692598: {
                        v4 = (float)var6_7 / (float)(((CallSite)var4_5).length - 1);
                        if (var2_2) {
                            continue block18;
                        }
                        ** GOTO lbl98
                    }
                    case 1614692597: {
                        hi.a("G", (double)-1.0, (long)977232075298570964L);
                        hi.a("G", (long)1072168011298293672L);
                        var9_3 /* !! */  = (reference)((com.github.epsilon.a.c(8190, 4008529585948287906L) ^ com.github.epsilon.a.c(17986, 545600866480175661L)) - com.github.epsilon.a.c(4540, 6297213198615506344L));
                        continue block19;
                    }
lbl92:
                    // 2 sources

                    v5 = (com.github.epsilon.a.c(2038, 6742528353002224525L) ^ com.github.epsilon.a.c(7017, 5206616509718095742L)) / com.github.epsilon.a.c(26899, 3028520503452865963L) ^ com.github.epsilon.a.c(23187, 4912402402489247428L);
                    v6 = com.github.epsilon.a.c(23192, 5546980603109942956L);
lbl94:
                    // 2 sources

                    var9_3 /* !! */  = (reference)(v5 - v6);
                    if (!var2_2) continue block19;
lbl96:
                    // 2 sources

                    var9_3 /* !! */  = (reference)(com.github.epsilon.a.c(9695, 3265058707689724317L) / com.github.epsilon.a.c(13026, 7728192652610031356L) + com.github.epsilon.a.c(30850, 2467321369590138084L));
                    continue block19;
lbl98:
                    // 2 sources

                    var9_3 /* !! */  = (reference)((hi.a("G", (int)hi.a("G", (int)com.github.epsilon.a.c(14319, 4950116107212671887L), (int)com.github.epsilon.a.c(26367, 1530412188693928630L), (long)834203424483934088L), (int)com.github.epsilon.a.c(32556, 6934326772320732092L), (long)834203424483934088L) + com.github.epsilon.a.c(18684, 2617411146402837638L)) * com.github.epsilon.a.c(30153, 7080250212217358826L) ^ com.github.epsilon.a.c(9392, 4472841465748248787L));
lbl99:
                    // 2 sources

                    v7 /* !! */  = var9_3 /* !! */ ;
                    if (var2_2) continue block18;
                    switch (v7 /* !! */ ) {
                        default: {
                            continue block18;
                        }
                        case -1787047313: 
                    }
                    v7 /* !! */  = hi.a("G", (int)1, (long)701518974625326203L);
                    continue block18;
                    case 1614692602: 
                }
                break;
            }
            break;
        }
        return var5_6;
    }

    public static /* bridge */ /* synthetic */ CallSite U(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private a() {
        super(com.github.epsilon.a.b(-14314, 29364), (vY)((Object)hi.a("j", (long)526176563220736169L)));
        this.S = com.github.epsilon.a.U("6igsN133xYyJoDFI", P(java.lang.String java.awt.Color boolean com.github.epsilon.yx ), (a)this, (String)com.github.epsilon.a.b(-14319, -6816), (Color)new Color(com.github.epsilon.a.c(27538, 2267545052472186811L)), (boolean)false, this::lambda$new$0);
        String string = com.github.epsilon.a.b(-14315, 12958);
        Color color = new Color(com.github.epsilon.a.c(27059, 8474406036095440323L), com.github.epsilon.a.c(12851, 858992743631638091L), com.github.epsilon.a.c(29827, 4313576428604655871L));
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)393000913149152142L);
        hi.a("G", (Object)callSite, (long)374764797691957710L);
        this.T = hi.a("\u00a5", (Object)this, (Object)string, (Object)color, (boolean)false, ((Xn)((Object)callSite))::z, (long)393916397130120306L);
        String string2 = com.github.epsilon.a.b(-14317, -14775);
        Color color2 = new Color(com.github.epsilon.a.c(27677, 7266144930917093447L), com.github.epsilon.a.c(287, 2054259172198710550L), com.github.epsilon.a.c(2895, 8463576527556015894L));
        CallSite callSite2 = hi.a("\u00e9", (Object)this, (long)393000913149152142L);
        hi.a("G", (Object)callSite2, (long)374764797691957710L);
        this.x = hi.a("\u00a5", (Object)this, (Object)string2, (Object)color2, (boolean)false, ((Xn)((Object)callSite2))::z, (long)393916397130120306L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFC817) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 55;
                case 1 -> 91;
                case 2 -> 31;
                case 3 -> 232;
                case 4 -> 129;
                case 5 -> 202;
                case 6 -> 97;
                case 7 -> 209;
                case 8 -> 11;
                case 9 -> 44;
                case 10 -> 190;
                case 11 -> 220;
                case 12 -> 100;
                case 13 -> 205;
                case 14 -> 174;
                case 15 -> 171;
                case 16 -> 42;
                case 17 -> 47;
                case 18 -> 86;
                case 19 -> 59;
                case 20 -> 80;
                case 21 -> 35;
                case 22 -> 178;
                case 23 -> 218;
                case 24 -> 210;
                case 25 -> 132;
                case 26 -> 181;
                case 27 -> 113;
                case 28 -> 110;
                case 29 -> 184;
                case 30 -> 242;
                case 31 -> 60;
                case 32 -> 247;
                case 33 -> 65;
                case 34 -> 200;
                case 35 -> 213;
                case 36 -> 249;
                case 37 -> 19;
                case 38 -> 57;
                case 39 -> 222;
                case 40 -> 2;
                case 41 -> 223;
                case 42 -> 151;
                case 43 -> 114;
                case 44 -> 191;
                case 45 -> 50;
                case 46 -> 197;
                case 47 -> 145;
                case 48 -> 245;
                case 49 -> 135;
                case 50 -> 162;
                case 51 -> 85;
                case 52 -> 130;
                case 53 -> 128;
                case 54 -> 105;
                case 55 -> 175;
                case 56 -> 83;
                case 57 -> 124;
                case 58 -> 92;
                case 59 -> 241;
                case 60 -> 152;
                case 61 -> 234;
                case 62 -> 38;
                case 63 -> 225;
                case 64 -> 136;
                case 65 -> 104;
                case 66 -> 248;
                case 67 -> 10;
                case 68 -> 255;
                case 69 -> 73;
                case 70 -> 51;
                case 71 -> 90;
                case 72 -> 23;
                case 73 -> 102;
                case 74 -> 157;
                case 75 -> 153;
                case 76 -> 14;
                case 77 -> 170;
                case 78 -> 237;
                case 79 -> 126;
                case 80 -> 134;
                case 81 -> 160;
                case 82 -> 43;
                case 83 -> 183;
                case 84 -> 201;
                case 85 -> 72;
                case 86 -> 215;
                case 87 -> 189;
                case 88 -> 161;
                case 89 -> 34;
                case 90 -> 120;
                case 91 -> 108;
                case 92 -> 177;
                case 93 -> 133;
                case 94 -> 156;
                case 95 -> 146;
                case 96 -> 246;
                case 97 -> 95;
                case 98 -> 53;
                case 99 -> 9;
                case 100 -> 69;
                case 101 -> 235;
                case 102 -> 111;
                case 103 -> 18;
                case 104 -> 154;
                case 105 -> 96;
                case 106 -> 219;
                case 107 -> 62;
                case 108 -> 121;
                case 109 -> 147;
                case 110 -> 188;
                case 111 -> 186;
                case 112 -> 29;
                case 113 -> 63;
                case 114 -> 39;
                case 115 -> 195;
                case 116 -> 182;
                case 117 -> 82;
                case 118 -> 252;
                case 119 -> 8;
                case 120 -> 196;
                case 121 -> 27;
                case 122 -> 25;
                case 123 -> 142;
                case 124 -> 127;
                case 125 -> 173;
                case 126 -> 37;
                case 127 -> 56;
                case 128 -> 139;
                case 129 -> 227;
                case 130 -> 228;
                case 131 -> 231;
                case 132 -> 12;
                case 133 -> 107;
                case 134 -> 84;
                case 135 -> 64;
                case 136 -> 141;
                case 137 -> 77;
                case 138 -> 52;
                case 139 -> 207;
                case 140 -> 66;
                case 141 -> 204;
                case 142 -> 67;
                case 143 -> 159;
                case 144 -> 254;
                case 145 -> 250;
                case 146 -> 46;
                case 147 -> 122;
                case 148 -> 226;
                case 149 -> 158;
                case 150 -> 48;
                case 151 -> 22;
                case 152 -> 244;
                case 153 -> 137;
                case 154 -> 76;
                case 155 -> 45;
                case 156 -> 180;
                case 157 -> 253;
                case 158 -> 233;
                case 159 -> 33;
                case 160 -> 93;
                case 161 -> 224;
                case 162 -> 117;
                case 163 -> 193;
                case 164 -> 208;
                case 165 -> 251;
                case 166 -> 192;
                case 167 -> 125;
                case 168 -> 206;
                case 169 -> 71;
                case 170 -> 68;
                case 171 -> 101;
                case 172 -> 198;
                case 173 -> 24;
                case 174 -> 165;
                case 175 -> 221;
                case 176 -> 5;
                case 177 -> 94;
                case 178 -> 70;
                case 179 -> 103;
                case 180 -> 212;
                case 181 -> 4;
                case 182 -> 230;
                case 183 -> 109;
                case 184 -> 238;
                case 185 -> 3;
                case 186 -> 20;
                case 187 -> 118;
                case 188 -> 30;
                case 189 -> 17;
                case 190 -> 155;
                case 191 -> 169;
                case 192 -> 15;
                case 193 -> 163;
                case 194 -> 112;
                case 195 -> 88;
                case 196 -> 36;
                case 197 -> 89;
                case 198 -> 21;
                case 199 -> 164;
                case 200 -> 149;
                case 201 -> 168;
                case 202 -> 131;
                case 203 -> 7;
                case 204 -> 115;
                case 205 -> 138;
                case 206 -> 58;
                case 207 -> 49;
                case 208 -> 28;
                case 209 -> 81;
                case 210 -> 236;
                case 211 -> 167;
                case 212 -> 119;
                case 213 -> 13;
                case 214 -> 32;
                case 215 -> 79;
                case 216 -> 239;
                case 217 -> 0;
                case 218 -> 203;
                case 219 -> 240;
                case 220 -> 106;
                case 221 -> 187;
                case 222 -> 6;
                case 223 -> 172;
                case 224 -> 243;
                case 225 -> 194;
                case 226 -> 144;
                case 227 -> 98;
                case 228 -> 229;
                case 229 -> 185;
                case 230 -> 214;
                case 231 -> 211;
                case 232 -> 87;
                case 233 -> 176;
                case 234 -> 166;
                case 235 -> 41;
                case 236 -> 199;
                case 237 -> 75;
                case 238 -> 150;
                case 239 -> 179;
                case 240 -> 78;
                case 241 -> 99;
                case 242 -> 1;
                case 243 -> 143;
                case 244 -> 16;
                case 245 -> 116;
                case 246 -> 148;
                case 247 -> 217;
                case 248 -> 140;
                case 249 -> 54;
                case 250 -> 216;
                case 251 -> 40;
                case 252 -> 61;
                case 253 -> 123;
                case 254 -> 74;
                default -> 26;
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
            com.github.epsilon.a.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C39;
        if (d[n2] == null) {
            com.github.epsilon.a.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
