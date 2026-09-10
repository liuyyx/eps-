/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.particles.BlockParticleOption
 *  net.minecraft.core.particles.ParticleType
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.block.state.BlockState
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xn;
import com.github.epsilon._v;
import com.github.epsilon.dN;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m
extends e {
    private final Xn v;
    private final Xn P;
    private static final double L = 0.9;
    private final Set<LivingEntity> W;
    public static final m x;
    private static final double h = 0.0;
    private final Xn y = hi.a("\u00a5", (Object)this, (Object)m.b(31142, 9288), (boolean)true, (long)1230617056439551805L);
    private static final long u;
    private int F;
    private final List<_v> X;
    private final Xn t;
    private final Set<Entity> C;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    @Override
    protected void M(Object[] objectArray) {
        m.h("1aOAObmvhGjw2Bl6", Y(), (m)this);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void D(Object[] var1_1) {
        block22: {
            block21: {
                var2_2 = Dl.t();
                var5_3 /* !! */  = (m.c(2138, 5778608968268419333L) - m.c(27519, 7415411944731538028L)) / m.c(26905, 5735244709391364260L) + m.c(20586, 1128311816761428344L) - m.c(26678, 369060445549261133L);
                if (!var2_2) break block21;
lbl5:
                // 2 sources

                while (true) {
                    v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)710308901307699396L), (long)401227543875717476L);
                    if (var2_2) ** GOTO lbl83
                    if (v0 == false) ** GOTO lbl82
                    ** GOTO lbl85
                    break;
                }
lbl10:
                // 2 sources

                while (true) {
                    v1 /* !! */  = m.h("1aOAObmvhGjw2Bl6", hasNext(), (Iterator)var3_4);
                    if (var2_2) ** GOTO lbl34
                    if (v1 /* !! */  == false) ** GOTO lbl33
                    ** GOTO lbl36
                    break;
                }
lbl15:
                // 2 sources

                while (var2_2) {
                    return;
                }
                break block22;
            }
            block18: while (true) {
                switch (var5_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1922381794: {
                        hi.a("G", (long)986682684396269627L);
                        hi.a("G", (long)692983194225517364L);
                        return;
                    }
                    case -1922381796: {
                        var3_4 = m.h("1aOAObmvhGjw2Bl6", iterator(), (Set)hi.a("\u00e9", (Object)this, (long)710308901307699396L));
                        if (var2_2) ** GOTO lbl10
                        var5_3 /* !! */  = (m.c(30254, 5014134502284062599L) + m.c(27572, 5787170750785942080L)) / 3 + m.c(29890, 114288544690466229L) + m.c(13068, 2558508850855717537L) ^ m.c(22608, 1850209519706161636L);
                        if (!var2_2) break;
lbl33:
                        // 2 sources

                        v1 /* !! */  = (CallSite)((m.c(5984, 8411325978235833933L) ^ m.c(2393, 7314102705867132987L) ^ m.c(27914, 5407259672372343848L)) / m.c(25284, 5832475665314347928L) ^ m.c(8049, 5759224978215372355L));
lbl34:
                        // 2 sources

                        var5_3 /* !! */  = (int)v1 /* !! */ ;
                        if (!var2_2) break;
lbl36:
                        // 2 sources

                        var5_3 /* !! */  = (m.c(12477, 5353378915005540845L) - m.c(12965, 1434256790152260473L) ^ m.c(32636, 7888105372724717111L)) - m.c(24119, 6513116530294933267L) - m.c(28714, 8419093299441658170L) - m.c(25828, 3727089363237371282L);
                        break;
                    }
                    case -1922381795: {
                        return;
                    }
                }
lbl40:
                // 4 sources

                while (true) {
                    block23: {
                        switch (var5_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 1340577680: {
                                var4_5 = (LivingEntity)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                                v2 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)772193471335404748L);
                                if (var2_2) ** GOTO lbl54
                                if (v2 /* !! */  != false) ** GOTO lbl53
                                ** GOTO lbl56
                            }
                            case 1340577678: {
                                throw null;
                            }
lbl53:
                            // 1 sources

                            v2 /* !! */  = (CallSite)(m.c(5646, 2272865469802614647L) + m.c(30799, 5561783831314457053L) - m.c(23992, 2747261398610855124L));
lbl54:
                            // 2 sources

                            var5_3 /* !! */  = (int)v2 /* !! */ ;
                            if (!var2_2) break block23;
lbl56:
                            // 2 sources

                            var5_3 /* !! */  = (m.c(6722, 592903433611019022L) + m.c(30082, 3926415890674805891L) ^ m.c(17763, 7073510288005946374L) ^ m.c(9389, 8252823221066743120L)) - m.c(12230, 5860843825958532844L) + m.c(1303, 5646892345336798429L);
                            if (!var2_2) break block23;
                            ** GOTO lbl87
                            case 1340577679: 
                        }
                        return;
                    }
                    do lbl-1000:
                    // 5 sources

                    {
                        block26: {
                            block25: {
                                block24: {
                                    switch (var5_3 /* !! */ ) {
                                        default: {
                                            if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (int)m.h("1aOAObmvhGjw2Bl6", getId(), (LivingEntity)var4_5), (long)589839494272680763L) == var4_5) break block24;
                                            break block25;
                                        }
                                        case -2100394643: {
                                            hi.a("\u00a5", (Object)var3_4, (long)798035814993215984L);
                                            m.h("1aOAObmvhGjw2Bl6", B(java.lang.Object ), (m)this, (Object)var4_5);
                                            if (!var2_2) break block26;
                                            ** GOTO lbl15
                                        }
                                        case -2100394644: {
                                            ** GOTO lbl15
                                        }
                                        case -2100394641: {
                                            hi.a("G", (long)867976699951098165L);
                                            hi.a("G", (float)100.0f, (float)1.0f, (long)735515674673248892L);
                                            var5_3 /* !! */  = (int)(m.h("1aOAObmvhGjw2Bl6", max(int int ), (int)m.c(9300, 2600490552766807324L), (int)m.c(510, 970839651191101534L)) / m.c(25284, 5832475665314347928L) * m.c(3271, 6684216676636169694L) / m.c(20701, 7321794212466608538L) + m.c(1763, 1354357117435355135L));
                                            if (!var2_2) ** GOTO lbl-1000
                                        }
                                    }
lbl82:
                                    // 2 sources

                                    v0 = hi.a("G", (int)m.c(9543, 3695825832377465878L), (int)m.c(13860, 4171135102352338727L), (long)834203424483934088L) + m.c(5572, 9170612029352315950L);
lbl83:
                                    // 2 sources

                                    var5_3 /* !! */  = (int)v0;
                                    if (!var2_2) continue block18;
lbl85:
                                    // 2 sources

                                    var5_3 /* !! */  = (hi.a("G", (int)((m.c(4442, 4087470124685133942L) ^ m.c(31722, 2194569393883898409L)) * m.c(7777, 7292152704395642822L)), (int)m.c(19381, 7060482967757738581L), (long)834203424483934088L) ^ m.c(20654, 2711770659177712038L)) - m.c(17895, 8545376836683226305L);
                                    continue block18;
                                }
                                var5_3 /* !! */  = (m.c(27070, 2575453511948431504L) / m.c(9640, 3629655102222777508L) + m.c(878, 4283102173408795365L) ^ m.c(26651, 3999823456286601583L)) * m.c(3799, 8490882171740198767L) - m.c(18474, 8086007176246907389L);
                                if (!var2_2) ** GOTO lbl-1000
                            }
                            var5_3 /* !! */  = m.c(20841, 6803074176362760444L) + m.c(31352, 8129544707903284094L) - m.c(13081, 8988213464549108384L);
                            if (!var2_2) ** GOTO lbl-1000
                        }
                        var5_3 /* !! */  = (m.c(20722, 8244599384099735968L) / m.c(9640, 3629655102222777508L) + m.c(23906, 57818381514589338L) ^ m.c(22893, 2502492502739796002L)) * m.c(30651, 9056616942955196102L) - m.c(21433, 3640905268921354785L);
                    } while (!var2_2);
                    break;
                }
                break;
            }
        }
        var5_3 /* !! */  = (m.c(20912, 8364187987119327449L) + m.c(13121, 8667760806181513941L)) / 3 + m.c(2328, 323146673105408217L) + m.c(5010, 2576750418410572462L) ^ m.c(15325, 1355356189277594313L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void d(Object[] var1_1) {
        block16: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = m.c(3373, 8067470665948435516L) / m.c(28258, 4877373351951103913L) ^ m.c(8174, 242315639929734740L);
            if (var2_2) break block16;
lbl5:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)1176074800604658842L);
                if (!var2_2) ** GOTO lbl49
                if (v0 /* !! */  == false) ** GOTO lbl48
                ** GOTO lbl51
                break;
            }
lbl10:
            // 1 sources

            return;
lbl12:
            // 1 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1147462419762608207L), (long)789438897355831922L)), (long)1000026253634408124L);
                if (!var2_2) ** GOTO lbl54
                if (v1 /* !! */  == false) ** GOTO lbl53
                ** GOTO lbl56
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)389008679376154053L);
                if (var2_2) ** GOTO lbl58
lbl20:
                // 2 sources

                while (true) {
                    m.h("1aOAObmvhGjw2Bl6", l(), (m)this);
                    if (!var2_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)724731356792276814L);
                            return;
                        }
                    }
                    ** GOTO lbl60
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
                case 596723954: {
                    ** continue;
                }
                case 596723959: {
                    ** continue;
                }
                case 596723960: {
                    ** continue;
                }
                case 596723955: {
                    ** continue;
                }
                case 596723958: {
                    ** continue;
                }
                case 596723957: 
            }
            hi.a("G", (float)1.0f, (long)671146500863747464L);
            var3_3 /* !! */  = (int)(hi.a("G", (int)(m.c(20759, 7054588953125963860L) / 5), (int)m.c(14805, 8387565126618259575L), (long)834203424483934088L) / m.c(26905, 5735244709391364260L) + m.c(14844, 3987118249671041038L));
            if (var2_2) continue;
lbl48:
            // 2 sources

            v0 /* !! */  = (CallSite)(m.c(4277, 5644580405126269374L) / 2 - m.c(30476, 5548108153966423663L) ^ m.c(2047, 1686983349727600233L));
lbl49:
            // 2 sources

            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (var2_2) continue;
lbl51:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)m.c(10884, 1183371941048365887L), (int)m.c(7951, 3542100060402943713L), (long)834203424483934088L) / 5), (int)m.c(24949, 1874842603561711692L), (long)834203424483934088L) - m.c(967, 8184867090792389149L));
            if (var2_2) continue;
lbl53:
            // 2 sources

            v1 /* !! */  = (CallSite)((m.c(17984, 8784548988550832067L) ^ m.c(25917, 8803060003458022452L)) + m.c(27316, 6945711773704450985L) - m.c(15538, 8513705412791018981L));
lbl54:
            // 2 sources

            var3_3 /* !! */  = (int)v1 /* !! */ ;
            if (var2_2) continue;
lbl56:
            // 2 sources

            var3_3 /* !! */  = (m.c(21269, 6906387723160865316L) ^ m.c(24828, 6816657491707853136L)) + m.c(4658, 4804709860935502657L);
            if (var2_2) continue;
lbl58:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)(m.c(5050, 1326344464193686022L) * m.c(23101, 1107784193425982335L) / m.c(9640, 3629655102222777508L)), (int)m.c(8760, 401620324359256902L), (long)834203424483934088L) - m.c(24480, 9063662115737552494L));
            if (var2_2) continue;
lbl60:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)(m.c(28964, 5800017670986852605L) * m.c(19609, 4283037976100328718L) / m.c(9640, 3629655102222777508L)), (int)m.c(28480, 6805415011692967618L), (long)834203424483934088L) - m.c(20433, 5350514602573092496L));
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void O(Object[] var1_1) {
        block22: {
            block18: {
                block19: {
                    var2_2 = Dl.S();
                    var5_3 /* !! */  = (m.c(12083, 7952650588114564794L) + m.c(15529, 2493868558732633381L)) / m.c(8462, 7787870870902519910L) / m.c(1655, 6925517227603304264L) + m.c(12653, 4567570610930755738L) - m.c(30430, 8953653135601201088L);
                    if (!var2_2) ** GOTO lbl-1000
                    switch (var5_3 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1159318096951901328L), (long)1240653736693366367L);
                            if (var2_2) break;
                            break block19;
                        }
                        case -636938056: {
                            m.h("1aOAObmvhGjw2Bl6", values());
                            hi.a("G", (long)1254720339774257797L);
                            return;
                        }
                    }
                    var5_3 /* !! */  = (int)(hi.a("G", (int)((m.c(25788, 2475121905069587762L) / m.c(25391, 5542512296335211032L) - m.c(29410, 8941545491414870910L)) / m.c(31862, 4365847789131457840L)), (int)m.c(13723, 4144550320452545577L), (long)834203424483934088L) + m.c(28120, 4722411974448575628L));
                    if (var2_2) break block18;
                    ** GOTO lbl24
                }
lbl20:
                // 2 sources

                while (true) {
                    block21: {
                        block20: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)984088978567310565L);
                            if (!var2_2) break block20;
                            if (v0 /* !! */  != false) break block21;
lbl24:
                            // 2 sources

                            v0 /* !! */  = (CallSite)((hi.a("G", (int)hi.a("G", (int)m.c(18456, 7962723362673021207L), (int)m.c(8781, 7852643183207627686L), (long)834203424483934088L), (int)m.c(11039, 510413495204885109L), (long)834203424483934088L) * m.c(17348, 1849518469283961372L) ^ m.c(26067, 1232831482890288136L)) - m.c(31401, 7266846882107253558L));
                        }
                        var5_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) break block18;
                    }
                    var5_3 /* !! */  = ((m.c(25295, 8458153246967397123L) + m.c(15487, 1969761853644055873L)) * m.c(27951, 4785838998714545344L) ^ m.c(4321, 5744818470595725592L)) + m.c(25342, 619906240568359766L);
                    break block18;
                    break;
                }
lbl31:
                // 2 sources

                while (!var2_2) {
lbl33:
                    // 2 sources

                    while (true) {
                        hi.a("G", (boolean)true, (long)1315516439304393687L);
                        return;
                    }
                }
                break block22;
            }
lbl39:
            // 2 sources

            while (true) {
                block23: {
                    switch (var5_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case 575731252: {
                            var4_5 = (_v)hi.a("\u00a5", (Object)var3_4, (long)470012372636416268L);
                            v1 /* !! */  = hi.a("\u00a5", (Object)var4_5, (Object)new Object[0], (long)1134215638393251368L);
                            if (!var2_2) ** GOTO lbl52
                            if (v1 /* !! */  == false) ** GOTO lbl51
                            ** GOTO lbl54
                        }
                        case 575731251: {
                            ** continue;
                        }
lbl51:
                        // 1 sources

                        v1 /* !! */  = (CallSite)(m.c(25371, 2380126011354446550L) - m.c(5249, 281718549082344826L) - m.c(27049, 8140993282305880254L));
lbl52:
                        // 2 sources

                        var5_3 /* !! */  = (int)v1 /* !! */ ;
                        if (var2_2) break block23;
lbl54:
                        // 2 sources

                        var5_3 /* !! */  = (int)(hi.a("G", (int)((m.c(7128, 5488976790516826637L) + m.c(16563, 525385539756513670L)) * m.c(3458, 6207960048853226562L)), (int)m.c(23463, 8796205288810431065L), (long)834203424483934088L) * m.c(25092, 8372987635972111172L) - m.c(24654, 6847487864916375964L));
                        if (var2_2) break block23;
                        ** GOTO lbl71
                        case 575731253: 
                    }
                    return;
                }
                do {
                    switch (var5_3 /* !! */ ) {
                        default: {
                            hi.a("\u00a5", (Object)var4_5, (Object)new Object[0], (long)866047999238534240L);
                            m.h("1aOAObmvhGjw2Bl6", remove(), (Iterator)var3_4);
                            if (var2_2) break;
                            ** GOTO lbl31
                        }
                        case -918073624: {
                            ** GOTO lbl31
                        }
                        case -918073626: {
                            return;
                        }
                    }
lbl71:
                    // 2 sources

                    var5_3 /* !! */  = m.c(14175, 8135296315479797370L) - m.c(3500, 5762107957981713486L) - m.c(31268, 5767698442707723068L);
                } while (var2_2);
                break;
            }
        }
        var5_3 /* !! */  = (int)(hi.a("G", (int)((m.c(30150, 1044494915942280390L) / m.c(27190, 3786474978489398167L) - m.c(14825, 4395755823656575108L)) / m.c(25284, 5832475665314347928L)), (int)m.c(1970, 1169274181785198100L), (long)834203424483934088L) + m.c(14222, 2458494284483800716L));
        ** while (true)
    }

    static Minecraft L(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        return hi.a("\u00e9", (Object)m2, (long)1187940231439308830L);
    }

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (long)1024914644942963329L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var17 = new String[5];
                            var15_1 = 0;
                            var14_2 = "\u00bb\u00047\u00b1JTSoM\u000b\u0017bqNR\u009d\u00f9\u00af\u00fd\u00e1(\t\u00e4\u009b\u00e3u>U\u00a5\u00f0\u009a";
                            var16_3 = "\u00bb\u00047\u00b1JTSoM\u000b\u0017bqNR\u009d\u00f9\u00af\u00fd\u00e1(\t\u00e4\u009b\u00e3u>U\u00a5\u00f0\u009a".length();
                            var13_4 = 9;
                            var12_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 113;
                                v1 = ++var12_5;
                                v2 = var14_2.substring(v1, v1 + var13_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                var14_2 = "|\u000f\u001ah5\u0005|c3]I";
                                var16_3 = "|\u000f\u001ah5\u0005|c3]I".length();
                                var13_4 = 5;
                                var12_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 89;
                                    v5 = ++var12_5;
                                    v2 = var14_2.substring(v5, v5 + var13_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var18_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v15 = 101;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 27;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 46;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 22;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 39;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 109;
                                        break;
                                    }
                                    default: {
                                        v15 = 74;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var18_6;
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
                        } while (v10 > var18_6);
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
                    m.a = var17;
                    m.b = new String[5];
                    var4_7 = 6663962461177165985L;
                    var10_8 = new long[258];
                    var7_9 = 0;
                    var8_10 = "Ik\u00ce\u00d3&\u0087\u00cci\u0019\u00e7=b\u0005\u0007\u00b8YZ\u0018\u00edf\u00faS(<c\u00e8\u0012\u00e3s\u001d\u00ef\u00b9\u00d9Z\u0097\u0006\u00dc\u0000\u00cb\u00d0\u000129\u0015\u00aaQ\u0000\r&-~\u00cd\u0084\u000fz6\u00b9\u008c\u0095)\u00e6\u0017\u000f\u00b70Iq\u00a2\u008f\u00b1q\u00c7\u00cf\u00f9\u0091\u00bf\u00f8\u00d3\u001c\u00b7\u00ed\u00ee\u00b2'\u00c4\r^0\u009f\u00da\u00f3\u00c4\u0017i\u00ec=e[\u00feh\u00aft\u00ae\u0090\u00fd\u00d79\u00e9\u00c4\u001f\u00c0\u00be\u0019\u00fe\u00f0\u00c5]pao\u00174n\u00f8\u00aa=F\u00eb\u00c2\u00d8\u00f3\u00a6\\\u007f-\u0006\u001bJ<6\u0006\u00b7\u00f3\\\u008dh\u009b\u00e1\u00bb\u0005\u009f\u00f5\u0005\r\u0001X\u001bsB\u00ea\u00b4h\u00fc\u0002\u00d4\u00a4\u00c1\u00e7\u008a@J\u00b8\u00cf`\u0088\u00d6r\u0016\u00fd\u00d89W|\u00ef\u0013t\u009ac\u00f61\u00e9(\u00d9C\u00a7\"c\u00d0)\u0093\bF\n&9\u0000\u00f6O\u00e2{\u00a8\u00dcRZc5M\u00d2\u00d0\u00b9\u008cG\u00a1\u00a9\u00973\u00ea>%U\u00b1\u00be\u00a8y\u0094]\u00a7k\u0015Zie\u00ae\u00f6\u00ff\u0000\u00cf\u0001\u00c1\u00d3\u0093\u001a\u00e3\u00f3\u00db\u00cd\u00f6U0\u0018$\u00fe\u009fU\u00a0=$\u00c8\u0011^\u00804m\u0005\u001f^\u00f6s\u0097Fb\u00c6\u001bP\u00a5\u00a2\u0089\u0096\u00a8\u008d[\u00efG\u00e0\u00fc\u008e\u0091(\u00b1[\u00a6v\u0084\u00ac\u0091bT\u00c0\u008c\u00e1\u00c4\u00cf\u00dc\u0081\u00be?\u00f6\u001f\u008d\u00a1^\u00fe\u0018[\u00bb9\u0006\u0086:\u00a6\u00b5\u00ea>\u00f1\u009a\u00af\u00ec0\u00a3~\u008d\u00ee\u0099\u0015gV\u009b\u009b\u00ca\u00c6\u00f0\u0000\u00ed\u0095\u00ff\u0096\u00b9\u00c0\u00f3ri\u0010\u00d7=G0L[\"\u00b53\u000f\u00da\u00fe\u009e'\u00f07\u00dd\b\u00db\u00cfV\u0085\u00e7\u000f)\u0005$\u00b6\u008b\u00d6i\u00d3\"\u00ban\u00aa\u00a1\u008e\u00ca\u00d7\u00828W\b<Q8><\u00e3\u0014\u0083\u0080\u00fc(\u00f1 sY\u00a1d\u0096\u0097\u007f\u0004\u00d1\u00e9E!\u00ba\u0006o\bF%;LV\u00c3=\u008a5n\u00bc\u0007\u0013\u00df\u00de\u001c<7\u00e6i\u00cd,\u00a9\u00ee\u008d\u0004\u00b6\u00be.\\\u0000+\u0095B.\u00ef|\u0007Z\u00acR-f\u00b8\u000e\u00ff\u00b9Ax\u008e\u0019:i7;\u00ccv\u00b9J\\\u001c\u00c2\u00e5\u00e8\"\u00ed\u00c4(\u00da\u00ca`\u001946\u001e\u009cC\u0083\u0003\u00f5Z\u00b1\u009f\u00bb\u0007\u00e0'\u008f\u0085L\u00feX\u00a1\u0005\u0014L\u0018\u0012a\\\u008e\u00a4`C$W\u0016b4\u00e1\u001e;\u00e4,\u0082\u00f7B\u00fes\fRoCT\u00efD>k\u00fd\u00fe\u00e3'Z\u00a8\u00b1\u0082\u00a3r\u0087\u00bcl\u00bd\u009en\u0019\u0097\u00a8a\u00a4L\u00d97\bIk\u00ce\u00be\u00ba\u00dd\u00bcG\u00f7\u00a9Y\u008b\u00cdy\u0085\u00acj\u00f2k\u00b3C{\u00c4]#]\u00cc\u0019\u0098\u00ccUI\u00ab\u00c03\u00e0`\u00e2M\u00eb\u001d\u00c8\u00ba\u00fbS\u00fd\u00edK\u00b9]M\u00ff\u007f\u0018,6\u00c5\u001c_\u009av\n\u00c0\u00e5\"\u0016\u0094\u00b2\u0004\u001a,i\u009d.\u0091\u00a8\u00cc\u008e1\u008b\u001f\u009a\u0011\u007f9\u0016;b\u0018\u001e\u00922s\u0002KW\u0019E\u0091S\u00ab\u00ed+\u0002\u008ec\\\u00fe\u00d8\u00e3\u00e7e,\u0088u\u00f2\u0088\u00ca\u00cbbp\u00f3\u00da\u009f\u001e\u0099}\u00e8\u0083\u00e7\u0014<\u009cK@\nj\u00fe\u00ba\u00cf\u00fda!\u0084\u0091\u00cf\u008e\u008d\u00d7K\u00d2f\u00ba\u009da3V\u00f3\u00db\u00b1)\u00e4b\u00a5xF\u00de\u00dbb&\u0012$\u00ae\u0010\u00c72\u00e3\u00c7\u009b\u00a2o\u00a2w\u008d\u00bbX\u00b6\u00ac@?!\u00c5\u00e2\u0086\u00eb\u008f\r\u00cd5Y\u00b3\u00c2\f\u009c\u00a0\u00dc\u00ec}\u0082\u00c3\"7\u00d6\u00d1\u00c0\u0080^j\u0089\u00e6\u009e,7z\u00c0(\u00cd\u009b\u00cc\u0088\u0005\u00fac\u00a3\u00e8U\u00f3!0\u001e\u00e5\u00ddg\u009c\u009e~\u00d7\u00fd,5H\u000e\u00b9-\u000e\u0090kNLke4\u00e9F\u00a4rf\u0005\u00e9\u00ff5\u00ee\u00ad\u00ca\u00ba\u00a0\u0012\u00f7)\u00ea_\u000f\u00b8\u00fc\u001f\u00a3\u00b2\u009aSyC\u00b9q\u008e3<\u00d9;[\u00abZ\u00c8C\u0087Y\u00e0F\t\u00b6\b\u0019>\u00ecB\u00e8\u0018v\u009e\u0090S\tv'fq\u00e3\u00ed\u00ca\u00d8\u001e'\u00cc\u00adCRH{\u00c4\u00d5\u00a1\u00d5q\u0010\u00f4t\u00c3K>)\u0093h\u0090\u00dd\u001d{\u009b1\u00aa\u00c9\u0096q\u00b6cQ{\u0096[8\u00f6/\u00ee\u00cf)\u0088@zS_\u0086\u00da\u0084O\u00c9#\u009d\u00b7Q\u00ea\u00bd\u00f2\u00dc\u00ff\u0010T\u00ed\u00ee\u001c\u001c\u0080G\u00d5\u00a5\u00c5{{\r\u0000[\u009cT\u009e\u00b2M\u0092I\u00f8\u00b1\u00be_\u00b8\u00a6\u00af\u0086Y\u0013\u00a4Q\u0016\u00a5\u0086?\u0090o\u00d9\u0012UANk\u00bd\u00f0\u0003O\u00fc\u00aa\u000e\u0099\u00c3`\u00b3O\u000f\u00f1v\u00f0\u00cba{\u00ff \u0082\u001e\u0091\u00c4v\u00a71\u00d3}X\u0098\u00d4\u00f7\f\u00f4\u008dV\u00b6\u0007l\u00a1\nf1\u00b9+}\u00968\u00cd\u00b4\u0092r\u00be\u00b8\u00ba\u00d1\u00d5`b\u0012^\u0083\u009c6k\u0005\u00ff3\u00eb\u00ff\u00a8_+C)\\y\"[E\u00de\u00ca\u00c6\u0010\u00f3\u00a6\u00d5\u009905\u00ae\u00c1\u00ab\u00d0\u00e3\u00ef\u001b\u0096\u00f1\u00f6>\u00a9\u0097\u00cd\u00e7\u00b4\u00f2\u008c\u00af\u009bi\u00a4u+\u00eb\u008a#\u0004\u0019\u00ebH\u0084\u0098\u00feq.g^a\u00de\u00ce\u00e1\u00ecV\u00c0\\T\u00eb\u0090\u000e\u0014I\u00bc/\u0095\u00f1<\u00bfa\u00e4\u00dd\u00c9\u009a]\u0081>k}\u00df\u0003\u001c\u00b1WR\u00b5\u008f\u0012\u00bc\u0098\u009e\u00d8\u0084\u008c\u00a9x\u00bc\u0097\u00ff\u00ab\u009f\u00a8\u00a6\u00fb\u001edJ\u00ff\u00f9\u00f5\u00b7Y1\u00a6\u00ff\u0083\u0084\u0083\u00b9)\u00bf\u00f6\u00fa\u00ea\u00e7\u00c0R?,2\u00e1>\t\u00dd\u009fl\u00cb\u00b8T\u00da\u00ca\u00a8\u00d2\u00fd6\u00ae\u00e5\u00ec\u00df.u!.(%k\u00bd\u00c1\u00a8=Pe\u00ea\u009e3\u00b1\u00c4Y\u00e3\u0006\u00f0\u009e\u00f4\u00b9\u0018\u0083\u008cy\u00cc?T\u00c57\u00f7\u00de\u00ecPs2X\u00bb\u00f1\\C<\u008b\u00c7\u00e7\u0004-\u00a4\u00e5\\6\u00ad{\u000e\u00ce\u000fK\u009f\u00e2\u00f00\u00e1\u00be\u00c0\u00a01\u00aaza\u00d2\u00b0\u00b8\u00dfZt\u00ffu\u00bc7\u00e1\u00e3\u00af-\u00efh)jH\u009c:\u0010)\u00c9\u0098<;#^{\u00b8\u00dcS'\u001f\u00ab\u0006\u00ac>\u00f7K\u00e6\r\u009b8v\u00f3?Z\u0014\u00ba\u00f5\u00fc\u008c#0>B\u0015<\u008e\u008c3\u0094\\\u00ae\u00b9By.\u00b0\u00dd\u008fhw>\u000b!pP\tA2\u00e5Rz\f\"\u0095\u00fa\u0000`X\u00e5\u00e5n\u008d\u0019\u00cf\u00f1_\u0014dc\u00eb\u0013\u00afr\u007f\u0003\u0089\u0092(\u008d\u00de\u00f8N\u0017\u00d3\r\u00ceW^\u00a0|*z\u0084K\u00efZ|#~\u0088p\r\u001e\u0016=\u0012\u00ed\u0000\u00f3\u0098[\u008b\u00cb\u0005D|\u00f7\u00c9\u0088\u00d9\u008dV\u0088_\u00d5T\u00f0\u001b\u00db\u00ceJ\u00d8\u0006e\u00ee\u00f3G\u0012\u00e9\u00d3J\u00c5'\u00ba)9\u00ec\u000e\u00dfl\u007f\u008f\u00c1\u0000\u00cd\u00d7L\u009c\u009d\u00b0t\u001f\u0089\u00ff\u00b7\u0090\u00c7g\u00b6\u00adv\u00c8\u0001m'1\u008cfD4\u0095\u00a9WR\u00a3\u0088\u00a2bQ\u00cfiT\u00a5\u00b9\u001f\u0016TI(&\u00175O\u009b\u00f8gB\u00a4\u007f\u009c\u00d6\u000f\u009b\t\u00f9\u00ed\u00de\u00cd\u009c8p\u00c8\u00b3\u00c7\u008d\u00a9L\u00af\u0094\u00dd\u0099\u00d6W\u00ea\u0014TZ\u0082\u00ecW\u00bdd\u00da\u00f6n\u0086\u00c4\u00ba\u009bs}\u00a8\u0019\u00d2s\u00ba\u0002\u0083M\u00f9\u00c4\u000b\u00a6Q@\u0080!\u00c3\u00bf\u00c6\u00041-|\u00de\u00ff\u00b3\u00cf\u00efc!\u00aa\u009d\u0006_\u0094b\u00044\u009fe\u00b1\u009f\u00ba\u0015L\u00e9\u00a6\u0094\f\u00a0\u00a8\u00b4\b\u00fd\u0083FIY\u00c3&\u00ce\u00feo\u00f8\u00e1\u00f34\u0004\u00b2G\u00f0\u00eb2\u0006\u0089\u00e0\u00c9\u00be\u00be\u00cf%\u008f\u0089\u0013\u0003\u001c\u0080\u000fu\u00f4#\u00dbD\u00ca\u009fy\u00c7x\u00dfA\u008c\u00db\u0088\u00d6\u009b\u00d4\u008a\u00bePA\u0095\u000f\r]\u0080\u00fd\u00be0\u001f51\u00ce\u00f8\u00c7\u00ae,\u0084\tk~\u00f5N(\u00ca`\u00b6q\u00b9\u00dc\u007f3\u00a1\u0003p\u000e\u00a9\u008ei\u00d3\u0092\u0004\u008c_\u00a8\u0083\u00aaU\u00b9)'\u0018\u0010/*\u00d3b2hh\u00cf.\u00e6\u0082-F\u00a0\u00db ]\u00f2\u0016s\u00b2+ \u00e7n\u00aaK\u00b5\u0095\u00ba\u0097\u00e9}\u0010uK\u00c2\u00b1t^\u00d5\u00db\u00e8\u0095a\u00f4\u00031MV`9\u00bd\u00fam\u00eb\u0083\u0013\u00a8.\u0012\u00c0s\u0013Z\u00ac\u00f3^h\u008e\u008b\u00c0\u00b5\u00ff\u00f6\u009f$\u0086\u00f8\u0095\u00fe\u00b0\u0007\u00f2z\u00c4T7\n\u00ed\u00ae\u009e\u00a6\u00d5\u0092ok\u0085\u00a2$'\u00e5\u00f9F\u00a6\u00d6CIQy\u00e4_;\u0093L\u00cc\u00ed\u00a4\u00f3\u0085\u00c4s\u00e1\u00ef\u00d4S^W\u00c1\u009dP\u0002i\u0085\u0004\u007f\u00b5!\u00f6\u0087`J\u00b2\u0094\u00b4\u00c9\"\u0015}?C\u00ce\u00d0#\u0084\u00c8\u00f0\u00d8\u00d3\u00a1\u001a\u00a3\u0099\u00ce\u00abd\u00e2G\u009b\u001b\u00f7C/1\u009b:\u00e6q\u00eeL\u00a3\u0018/\u009a\u00dc\u00e0\u000e\u00e4Ej\u00da\u0014\u0089/\u00c2?t\u00e2\u00d0\u0083<\u0099\u00c6\u00e5\u008b\u00ediK\u0016~\u00fa \u0095H\u00ab\u00d4bP\u00e5\u00caMvTm\u008b\u00af\u00cc;u\u009e\u0006\u00bbd\u00b1vI\u00d9R\u00e9\u009c\u00ed\u0012!F\u00ca\u00b3\u00c3\u00b7\u0097\u00c0\u00ec\u0084\u00f4\t\u008f\u008eh\u0099\u00b2X\u00f4 \u000f<\u00de\u00ee\u00df\u0087\u0095V";
                    var9_11 = "Ik\u00ce\u00d3&\u0087\u00cci\u0019\u00e7=b\u0005\u0007\u00b8YZ\u0018\u00edf\u00faS(<c\u00e8\u0012\u00e3s\u001d\u00ef\u00b9\u00d9Z\u0097\u0006\u00dc\u0000\u00cb\u00d0\u000129\u0015\u00aaQ\u0000\r&-~\u00cd\u0084\u000fz6\u00b9\u008c\u0095)\u00e6\u0017\u000f\u00b70Iq\u00a2\u008f\u00b1q\u00c7\u00cf\u00f9\u0091\u00bf\u00f8\u00d3\u001c\u00b7\u00ed\u00ee\u00b2'\u00c4\r^0\u009f\u00da\u00f3\u00c4\u0017i\u00ec=e[\u00feh\u00aft\u00ae\u0090\u00fd\u00d79\u00e9\u00c4\u001f\u00c0\u00be\u0019\u00fe\u00f0\u00c5]pao\u00174n\u00f8\u00aa=F\u00eb\u00c2\u00d8\u00f3\u00a6\\\u007f-\u0006\u001bJ<6\u0006\u00b7\u00f3\\\u008dh\u009b\u00e1\u00bb\u0005\u009f\u00f5\u0005\r\u0001X\u001bsB\u00ea\u00b4h\u00fc\u0002\u00d4\u00a4\u00c1\u00e7\u008a@J\u00b8\u00cf`\u0088\u00d6r\u0016\u00fd\u00d89W|\u00ef\u0013t\u009ac\u00f61\u00e9(\u00d9C\u00a7\"c\u00d0)\u0093\bF\n&9\u0000\u00f6O\u00e2{\u00a8\u00dcRZc5M\u00d2\u00d0\u00b9\u008cG\u00a1\u00a9\u00973\u00ea>%U\u00b1\u00be\u00a8y\u0094]\u00a7k\u0015Zie\u00ae\u00f6\u00ff\u0000\u00cf\u0001\u00c1\u00d3\u0093\u001a\u00e3\u00f3\u00db\u00cd\u00f6U0\u0018$\u00fe\u009fU\u00a0=$\u00c8\u0011^\u00804m\u0005\u001f^\u00f6s\u0097Fb\u00c6\u001bP\u00a5\u00a2\u0089\u0096\u00a8\u008d[\u00efG\u00e0\u00fc\u008e\u0091(\u00b1[\u00a6v\u0084\u00ac\u0091bT\u00c0\u008c\u00e1\u00c4\u00cf\u00dc\u0081\u00be?\u00f6\u001f\u008d\u00a1^\u00fe\u0018[\u00bb9\u0006\u0086:\u00a6\u00b5\u00ea>\u00f1\u009a\u00af\u00ec0\u00a3~\u008d\u00ee\u0099\u0015gV\u009b\u009b\u00ca\u00c6\u00f0\u0000\u00ed\u0095\u00ff\u0096\u00b9\u00c0\u00f3ri\u0010\u00d7=G0L[\"\u00b53\u000f\u00da\u00fe\u009e'\u00f07\u00dd\b\u00db\u00cfV\u0085\u00e7\u000f)\u0005$\u00b6\u008b\u00d6i\u00d3\"\u00ban\u00aa\u00a1\u008e\u00ca\u00d7\u00828W\b<Q8><\u00e3\u0014\u0083\u0080\u00fc(\u00f1 sY\u00a1d\u0096\u0097\u007f\u0004\u00d1\u00e9E!\u00ba\u0006o\bF%;LV\u00c3=\u008a5n\u00bc\u0007\u0013\u00df\u00de\u001c<7\u00e6i\u00cd,\u00a9\u00ee\u008d\u0004\u00b6\u00be.\\\u0000+\u0095B.\u00ef|\u0007Z\u00acR-f\u00b8\u000e\u00ff\u00b9Ax\u008e\u0019:i7;\u00ccv\u00b9J\\\u001c\u00c2\u00e5\u00e8\"\u00ed\u00c4(\u00da\u00ca`\u001946\u001e\u009cC\u0083\u0003\u00f5Z\u00b1\u009f\u00bb\u0007\u00e0'\u008f\u0085L\u00feX\u00a1\u0005\u0014L\u0018\u0012a\\\u008e\u00a4`C$W\u0016b4\u00e1\u001e;\u00e4,\u0082\u00f7B\u00fes\fRoCT\u00efD>k\u00fd\u00fe\u00e3'Z\u00a8\u00b1\u0082\u00a3r\u0087\u00bcl\u00bd\u009en\u0019\u0097\u00a8a\u00a4L\u00d97\bIk\u00ce\u00be\u00ba\u00dd\u00bcG\u00f7\u00a9Y\u008b\u00cdy\u0085\u00acj\u00f2k\u00b3C{\u00c4]#]\u00cc\u0019\u0098\u00ccUI\u00ab\u00c03\u00e0`\u00e2M\u00eb\u001d\u00c8\u00ba\u00fbS\u00fd\u00edK\u00b9]M\u00ff\u007f\u0018,6\u00c5\u001c_\u009av\n\u00c0\u00e5\"\u0016\u0094\u00b2\u0004\u001a,i\u009d.\u0091\u00a8\u00cc\u008e1\u008b\u001f\u009a\u0011\u007f9\u0016;b\u0018\u001e\u00922s\u0002KW\u0019E\u0091S\u00ab\u00ed+\u0002\u008ec\\\u00fe\u00d8\u00e3\u00e7e,\u0088u\u00f2\u0088\u00ca\u00cbbp\u00f3\u00da\u009f\u001e\u0099}\u00e8\u0083\u00e7\u0014<\u009cK@\nj\u00fe\u00ba\u00cf\u00fda!\u0084\u0091\u00cf\u008e\u008d\u00d7K\u00d2f\u00ba\u009da3V\u00f3\u00db\u00b1)\u00e4b\u00a5xF\u00de\u00dbb&\u0012$\u00ae\u0010\u00c72\u00e3\u00c7\u009b\u00a2o\u00a2w\u008d\u00bbX\u00b6\u00ac@?!\u00c5\u00e2\u0086\u00eb\u008f\r\u00cd5Y\u00b3\u00c2\f\u009c\u00a0\u00dc\u00ec}\u0082\u00c3\"7\u00d6\u00d1\u00c0\u0080^j\u0089\u00e6\u009e,7z\u00c0(\u00cd\u009b\u00cc\u0088\u0005\u00fac\u00a3\u00e8U\u00f3!0\u001e\u00e5\u00ddg\u009c\u009e~\u00d7\u00fd,5H\u000e\u00b9-\u000e\u0090kNLke4\u00e9F\u00a4rf\u0005\u00e9\u00ff5\u00ee\u00ad\u00ca\u00ba\u00a0\u0012\u00f7)\u00ea_\u000f\u00b8\u00fc\u001f\u00a3\u00b2\u009aSyC\u00b9q\u008e3<\u00d9;[\u00abZ\u00c8C\u0087Y\u00e0F\t\u00b6\b\u0019>\u00ecB\u00e8\u0018v\u009e\u0090S\tv'fq\u00e3\u00ed\u00ca\u00d8\u001e'\u00cc\u00adCRH{\u00c4\u00d5\u00a1\u00d5q\u0010\u00f4t\u00c3K>)\u0093h\u0090\u00dd\u001d{\u009b1\u00aa\u00c9\u0096q\u00b6cQ{\u0096[8\u00f6/\u00ee\u00cf)\u0088@zS_\u0086\u00da\u0084O\u00c9#\u009d\u00b7Q\u00ea\u00bd\u00f2\u00dc\u00ff\u0010T\u00ed\u00ee\u001c\u001c\u0080G\u00d5\u00a5\u00c5{{\r\u0000[\u009cT\u009e\u00b2M\u0092I\u00f8\u00b1\u00be_\u00b8\u00a6\u00af\u0086Y\u0013\u00a4Q\u0016\u00a5\u0086?\u0090o\u00d9\u0012UANk\u00bd\u00f0\u0003O\u00fc\u00aa\u000e\u0099\u00c3`\u00b3O\u000f\u00f1v\u00f0\u00cba{\u00ff \u0082\u001e\u0091\u00c4v\u00a71\u00d3}X\u0098\u00d4\u00f7\f\u00f4\u008dV\u00b6\u0007l\u00a1\nf1\u00b9+}\u00968\u00cd\u00b4\u0092r\u00be\u00b8\u00ba\u00d1\u00d5`b\u0012^\u0083\u009c6k\u0005\u00ff3\u00eb\u00ff\u00a8_+C)\\y\"[E\u00de\u00ca\u00c6\u0010\u00f3\u00a6\u00d5\u009905\u00ae\u00c1\u00ab\u00d0\u00e3\u00ef\u001b\u0096\u00f1\u00f6>\u00a9\u0097\u00cd\u00e7\u00b4\u00f2\u008c\u00af\u009bi\u00a4u+\u00eb\u008a#\u0004\u0019\u00ebH\u0084\u0098\u00feq.g^a\u00de\u00ce\u00e1\u00ecV\u00c0\\T\u00eb\u0090\u000e\u0014I\u00bc/\u0095\u00f1<\u00bfa\u00e4\u00dd\u00c9\u009a]\u0081>k}\u00df\u0003\u001c\u00b1WR\u00b5\u008f\u0012\u00bc\u0098\u009e\u00d8\u0084\u008c\u00a9x\u00bc\u0097\u00ff\u00ab\u009f\u00a8\u00a6\u00fb\u001edJ\u00ff\u00f9\u00f5\u00b7Y1\u00a6\u00ff\u0083\u0084\u0083\u00b9)\u00bf\u00f6\u00fa\u00ea\u00e7\u00c0R?,2\u00e1>\t\u00dd\u009fl\u00cb\u00b8T\u00da\u00ca\u00a8\u00d2\u00fd6\u00ae\u00e5\u00ec\u00df.u!.(%k\u00bd\u00c1\u00a8=Pe\u00ea\u009e3\u00b1\u00c4Y\u00e3\u0006\u00f0\u009e\u00f4\u00b9\u0018\u0083\u008cy\u00cc?T\u00c57\u00f7\u00de\u00ecPs2X\u00bb\u00f1\\C<\u008b\u00c7\u00e7\u0004-\u00a4\u00e5\\6\u00ad{\u000e\u00ce\u000fK\u009f\u00e2\u00f00\u00e1\u00be\u00c0\u00a01\u00aaza\u00d2\u00b0\u00b8\u00dfZt\u00ffu\u00bc7\u00e1\u00e3\u00af-\u00efh)jH\u009c:\u0010)\u00c9\u0098<;#^{\u00b8\u00dcS'\u001f\u00ab\u0006\u00ac>\u00f7K\u00e6\r\u009b8v\u00f3?Z\u0014\u00ba\u00f5\u00fc\u008c#0>B\u0015<\u008e\u008c3\u0094\\\u00ae\u00b9By.\u00b0\u00dd\u008fhw>\u000b!pP\tA2\u00e5Rz\f\"\u0095\u00fa\u0000`X\u00e5\u00e5n\u008d\u0019\u00cf\u00f1_\u0014dc\u00eb\u0013\u00afr\u007f\u0003\u0089\u0092(\u008d\u00de\u00f8N\u0017\u00d3\r\u00ceW^\u00a0|*z\u0084K\u00efZ|#~\u0088p\r\u001e\u0016=\u0012\u00ed\u0000\u00f3\u0098[\u008b\u00cb\u0005D|\u00f7\u00c9\u0088\u00d9\u008dV\u0088_\u00d5T\u00f0\u001b\u00db\u00ceJ\u00d8\u0006e\u00ee\u00f3G\u0012\u00e9\u00d3J\u00c5'\u00ba)9\u00ec\u000e\u00dfl\u007f\u008f\u00c1\u0000\u00cd\u00d7L\u009c\u009d\u00b0t\u001f\u0089\u00ff\u00b7\u0090\u00c7g\u00b6\u00adv\u00c8\u0001m'1\u008cfD4\u0095\u00a9WR\u00a3\u0088\u00a2bQ\u00cfiT\u00a5\u00b9\u001f\u0016TI(&\u00175O\u009b\u00f8gB\u00a4\u007f\u009c\u00d6\u000f\u009b\t\u00f9\u00ed\u00de\u00cd\u009c8p\u00c8\u00b3\u00c7\u008d\u00a9L\u00af\u0094\u00dd\u0099\u00d6W\u00ea\u0014TZ\u0082\u00ecW\u00bdd\u00da\u00f6n\u0086\u00c4\u00ba\u009bs}\u00a8\u0019\u00d2s\u00ba\u0002\u0083M\u00f9\u00c4\u000b\u00a6Q@\u0080!\u00c3\u00bf\u00c6\u00041-|\u00de\u00ff\u00b3\u00cf\u00efc!\u00aa\u009d\u0006_\u0094b\u00044\u009fe\u00b1\u009f\u00ba\u0015L\u00e9\u00a6\u0094\f\u00a0\u00a8\u00b4\b\u00fd\u0083FIY\u00c3&\u00ce\u00feo\u00f8\u00e1\u00f34\u0004\u00b2G\u00f0\u00eb2\u0006\u0089\u00e0\u00c9\u00be\u00be\u00cf%\u008f\u0089\u0013\u0003\u001c\u0080\u000fu\u00f4#\u00dbD\u00ca\u009fy\u00c7x\u00dfA\u008c\u00db\u0088\u00d6\u009b\u00d4\u008a\u00bePA\u0095\u000f\r]\u0080\u00fd\u00be0\u001f51\u00ce\u00f8\u00c7\u00ae,\u0084\tk~\u00f5N(\u00ca`\u00b6q\u00b9\u00dc\u007f3\u00a1\u0003p\u000e\u00a9\u008ei\u00d3\u0092\u0004\u008c_\u00a8\u0083\u00aaU\u00b9)'\u0018\u0010/*\u00d3b2hh\u00cf.\u00e6\u0082-F\u00a0\u00db ]\u00f2\u0016s\u00b2+ \u00e7n\u00aaK\u00b5\u0095\u00ba\u0097\u00e9}\u0010uK\u00c2\u00b1t^\u00d5\u00db\u00e8\u0095a\u00f4\u00031MV`9\u00bd\u00fam\u00eb\u0083\u0013\u00a8.\u0012\u00c0s\u0013Z\u00ac\u00f3^h\u008e\u008b\u00c0\u00b5\u00ff\u00f6\u009f$\u0086\u00f8\u0095\u00fe\u00b0\u0007\u00f2z\u00c4T7\n\u00ed\u00ae\u009e\u00a6\u00d5\u0092ok\u0085\u00a2$'\u00e5\u00f9F\u00a6\u00d6CIQy\u00e4_;\u0093L\u00cc\u00ed\u00a4\u00f3\u0085\u00c4s\u00e1\u00ef\u00d4S^W\u00c1\u009dP\u0002i\u0085\u0004\u007f\u00b5!\u00f6\u0087`J\u00b2\u0094\u00b4\u00c9\"\u0015}?C\u00ce\u00d0#\u0084\u00c8\u00f0\u00d8\u00d3\u00a1\u001a\u00a3\u0099\u00ce\u00abd\u00e2G\u009b\u001b\u00f7C/1\u009b:\u00e6q\u00eeL\u00a3\u0018/\u009a\u00dc\u00e0\u000e\u00e4Ej\u00da\u0014\u0089/\u00c2?t\u00e2\u00d0\u0083<\u0099\u00c6\u00e5\u008b\u00ediK\u0016~\u00fa \u0095H\u00ab\u00d4bP\u00e5\u00caMvTm\u008b\u00af\u00cc;u\u009e\u0006\u00bbd\u00b1vI\u00d9R\u00e9\u009c\u00ed\u0012!F\u00ca\u00b3\u00c3\u00b7\u0097\u00c0\u00ec\u0084\u00f4\t\u008f\u008eh\u0099\u00b2X\u00f4 \u000f<\u00de\u00ee\u00df\u0087\u0095V".length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                        v17 = var10_8;
                        v18 = var7_9++;
                        v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 = "\u000b=\u00dfM\u00d7\u00e2\u00aa0&2=\u00f1\t\u008c\u00dd\u00d5";
                        var9_11 = "\u000b=\u00dfM\u00d7\u00e2\u00aa0&2=\u00f1\t\u008c\u00dd\u00d5".length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                            v17 = var10_8;
                            v18 = var7_9++;
                            v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var4_7;
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
            m.c = var10_8;
            m.d = new Integer[258];
            break block31;
lbl141:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 6545917166334208306L;
        ** while (true)
        m.u = var0_15 = 6545917166334208240L ^ var2_14;
        m.x = new m();
    }

    static Minecraft K(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        return hi.a("\u00e9", (Object)m2, (long)1187940231439308830L);
    }

    static Minecraft h(m m2) {
        return hi.a("\u00e9", (Object)m2, (long)1187940231439308830L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void B(Object var1_1) {
        block26: {
            var2_2 = Dl.t();
            var4_3 /* !! */  = m.c(9122, 7483759497581116029L) * m.c(26011, 3812970366895258673L) + m.c(7155, 1135103648135873214L);
            if (!var2_2) break block26;
lbl4:
            // 2 sources

            while (true) {
                block28: {
                    block27: {
                        v0 /* !! */  = m.h("1aOAObmvhGjw2Bl6", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)957831630270790389L), (long)789438897355831922L)));
                        if (var2_2) break block27;
                        if (v0 /* !! */  != false) break block28;
                        v0 /* !! */  = (CallSite)((m.c(12347, 6900182362787555806L) * m.c(15445, 2209331189895275984L) ^ m.c(22289, 6815429059634581040L)) + m.c(27686, 4795792960898364923L) - m.c(15517, 5264893075974989082L));
                    }
                    var4_3 /* !! */  = (int)v0 /* !! */ ;
                    if (!var2_2) break block26;
                }
                var4_3 /* !! */  = (m.c(15197, 6321512521329713790L) ^ m.c(21890, 6095823619201420363L)) + m.c(29568, 2740637422884448989L) + m.c(3561, 1458972688432698454L) - m.c(12671, 7425440108794128480L) + m.c(7413, 1701195530552706510L);
                break block26;
                break;
            }
lbl15:
            // 2 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00a5", (Object)((Boolean)m.h("1aOAObmvhGjw2Bl6", z(), (Xn)hi.a("\u00e9", (Object)this, (long)1187635013172973743L))), (long)1000026253634408124L);
                if (var2_2) ** GOTO lbl77
                if (v1 /* !! */  == false) ** GOTO lbl76
                ** GOTO lbl79
                break;
            }
lbl20:
            // 2 sources

            while (true) {
                v2 /* !! */  = var3_5;
                v3 = m.c(27190, 3786474978489398167L);
                if (var2_2) ** GOTO lbl85
                if (v2 /* !! */  > v3) ** GOTO lbl83
                ** GOTO lbl87
                break;
            }
lbl26:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)822283321678704529L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1024017773186779925L), (Object)hi.a("j", (long)1173726279416449043L), (Object)hi.a("j", (long)890089859787295302L), (float)1.0f, (float)1.0f, (boolean)false, (long)576940889871806666L);
                if (!var2_2) ** GOTO lbl111
lbl29:
                // 2 sources

                while (true) {
                    v4 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1147462419762608207L), (long)789438897355831922L)), (long)1000026253634408124L);
                    if (var2_2) ** GOTO lbl114
                    if (v4 /* !! */  == false) ** GOTO lbl113
                    ** GOTO lbl116
                    break;
                }
                break;
            }
lbl34:
            // 2 sources

            while (true) {
                v5 = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1324588223223101459L), (long)789438897355831922L)), (long)1000026253634408124L);
                if (var2_2) ** GOTO lbl122
                if (v5 == false) ** GOTO lbl121
                ** GOTO lbl124
                break;
            }
        }
        block22: while (true) {
            block30: {
                block29: {
                    block31: {
                        switch (var4_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -2068246724: {
                                var3_4 = new LightningBolt((EntityType)hi.a("j", (long)432646070264526701L), (Level)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L));
                                m.h("1aOAObmvhGjw2Bl6", setId(int ), (LightningBolt)var3_4, (int)hi.a("\u00a5", (Object)this, (long)1174248451000710889L));
                                hi.a("\u00a5", (Object)var3_4, (boolean)true, (long)742077817519342568L);
                                m.h("1aOAObmvhGjw2Bl6", setPos(double double double ), (LightningBolt)var3_4, (double)hi.a("\u00a5", (Object)((LivingEntity)var1_1), (long)907047849049535430L), (double)hi.a("\u00a5", (Object)((LivingEntity)var1_1), (long)1235747372608796815L), (double)hi.a("\u00a5", (Object)((LivingEntity)var1_1), (long)619188567151638994L));
                                m.h("1aOAObmvhGjw2Bl6", setOldPosAndRot(), (LightningBolt)var3_4);
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)var3_4, (long)689999981825014241L);
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)822283321678704529L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)413756257338480558L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1024017773186779925L), (Object)hi.a("j", (long)915883349382624263L), (Object)hi.a("j", (long)1070567890369366591L), (float)1.0f, (float)1.0f, (boolean)false, (long)576940889871806666L);
                                if (!var2_2) ** GOTO lbl74
                                ** GOTO lbl15
                            }
                            case -2068246732: {
                                ** continue;
                            }
                            case -2068246726: {
                                var3_5 = 0;
                                if (!var2_2) ** GOTO lbl81
                                ** GOTO lbl20
                            }
                            case -2068246730: {
                                ** continue;
                            }
                            case -2068246727: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1159318096951901328L), (Object)new _v(this, (LivingEntity)var1_1), (long)615358212536192384L);
                                if (!var2_2) break block29;
                                ** GOTO lbl34
                            }
                            case -2068246731: {
                                ** continue;
                            }
                            case -2068246725: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)new BlockParticleOption((ParticleType)hi.a("j", (long)965548740326609110L), (BlockState)hi.a("\u00a5", (Object)hi.a("j", (long)411504834153039851L), (long)879105531338288678L)), (double)hi.a("\u00a5", (Object)((LivingEntity)var1_1), (long)907047849049535430L), (double)(hi.a("\u00a5", (Object)((LivingEntity)var1_1), (long)1235747372608796815L) + (double)hi.a("\u00a5", (Object)((LivingEntity)var1_1), (long)393528877412216214L) - 0.75), (double)m.h("1aOAObmvhGjw2Bl6", getZ(), (LivingEntity)((LivingEntity)var1_1)), (double)0.0, (double)0.0, (double)0.0, (long)952790076097585520L);
                                if (var2_2) {
                                    return;
                                }
                                break block30;
                            }
lbl74:
                            // 1 sources

                            var4_3 /* !! */  = (m.c(14454, 4151812049427079544L) * m.c(11580, 8941161078423958621L) ^ m.c(22185, 260739294839918367L)) + m.c(6496, 8126445514518266000L) - m.c(25115, 7099479664032938830L);
                            if (!var2_2) continue block22;
lbl76:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(m.c(623, 5585686108169575345L) ^ m.c(28881, 3713250009938880775L) ^ m.c(16455, 8609328316092963116L));
lbl77:
                            // 2 sources

                            var4_3 /* !! */  = (int)v1 /* !! */ ;
                            if (!var2_2) continue block22;
lbl79:
                            // 2 sources

                            var4_3 /* !! */  = m.c(15463, 531953689111897588L) / m.c(26905, 5735244709391364260L) - m.c(14788, 5640813297335443729L) - m.c(24046, 104808661309441026L);
                            continue block22;
lbl81:
                            // 1 sources

                            var4_3 /* !! */  = (int)(hi.a("G", (int)(m.c(479, 6729994245198092410L) / 2), (int)m.c(9464, 1502467838767054142L), (long)834203424483934088L) * m.c(28452, 7279687229712004823L) + m.c(25091, 1435137068973063154L));
                            if (!var2_2) break block31;
lbl83:
                            // 2 sources

                            v2 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)m.c(2111, 3781982507088810247L), (int)m.c(32170, 3644131947096499277L), (long)834203424483934088L), (int)m.c(13947, 1337773793755246347L), (long)834203424483934088L) / m.c(3833, 4483625001473480587L));
                            v3 = m.c(7618, 7265044829613327430L);
lbl85:
                            // 2 sources

                            var4_3 /* !! */  = v2 /* !! */  - v3;
                            if (!var2_2) break block31;
lbl87:
                            // 2 sources

                            var4_3 /* !! */  = (m.c(5113, 4596717006002948668L) + m.c(27755, 7820745778709067200L) + m.c(13174, 1249964592523094674L)) / m.c(9640, 3629655102222777508L) ^ m.c(28342, 3643117189468747673L);
                            if (!var2_2) break block31;
                            ** GOTO lbl109
                            case -2068246733: {
                                return;
                            }
                            case -2068246729: 
                        }
                        return;
                    }
                    do {
                        switch (var4_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 203985908: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)418187901895148915L), (Object)((LivingEntity)var1_1), (Object)hi.a("j", (long)439508429653473991L), (long)1020762449247353352L);
                                ++var3_5;
                                if (!var2_2) break;
                                ** GOTO lbl26
                            }
                            case 203985909: {
                                ** continue;
                            }
                            case 203985907: {
                                throw null;
                            }
                        }
lbl109:
                        // 2 sources

                        var4_3 /* !! */  = (int)(hi.a("G", (int)(m.c(14313, 9033459953269452460L) / 2), (int)m.c(25110, 1666127310150138700L), (long)834203424483934088L) * m.c(24962, 6700135885990099115L) + m.c(324, 175998115339475017L));
                    } while (!var2_2);
lbl111:
                    // 2 sources

                    var4_3 /* !! */  = m.c(3836, 7889997237326354374L) ^ m.c(11135, 5268703124038562348L) ^ m.c(17910, 3375786960297352202L);
                    if (!var2_2) continue;
lbl113:
                    // 2 sources

                    v4 /* !! */  = (CallSite)(m.c(29109, 524902377775917140L) / m.c(17282, 8675221940361026058L) - m.c(26252, 7856106538330128229L));
lbl114:
                    // 2 sources

                    var4_3 /* !! */  = (int)v4 /* !! */ ;
                    if (!var2_2) continue;
lbl116:
                    // 2 sources

                    var4_3 /* !! */  = (m.c(9385, 1884912348861349172L) ^ m.c(26489, 1868285000457682650L) ^ m.c(22604, 8886350403516154305L)) / 3 - m.c(2808, 8685094707259773837L);
                    if (!var2_2) continue;
                }
                var4_3 /* !! */  = m.c(20503, 1278628582927878585L) / m.c(14405, 6845100234929742266L) - m.c(16374, 5357542656849815097L);
                if (!var2_2) continue;
lbl121:
                // 2 sources

                v5 = hi.a("G", (int)(m.c(32228, 8364918128639468596L) - m.c(26953, 3639516828513562832L)), (int)m.c(12518, 8075429950145604048L), (long)834203424483934088L) + m.c(30293, 393523999445610289L) + m.c(7016, 325855033003213366L);
lbl122:
                // 2 sources

                var4_3 /* !! */  = (int)v5;
                if (!var2_2) continue;
lbl124:
                // 2 sources

                var4_3 /* !! */  = (m.c(873, 7755859597412604438L) + m.c(10812, 2519980429630452642L)) / 5 + m.c(19306, 5973738704802960090L);
                if (!var2_2) continue;
            }
            var4_3 /* !! */  = (int)(hi.a("G", (int)(m.c(10669, 6150698863799742691L) - m.c(523, 8315676298239318959L)), (int)m.c(9519, 3113256854452911108L), (long)834203424483934088L) + m.c(11671, 9108333717731292306L) + m.c(15114, 2425642567102440130L));
        }
    }

    private void Y() {
        hi.a("\u00a5", (Object)this, (long)587687806635891914L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)913793225776308375L), (long)699241984088282032L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)710308901307699396L), (long)699241984088282032L);
    }

    static Minecraft l(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        return hi.a("\u00e9", (Object)m2, (long)1187940231439308830L);
    }

    private int s() {
        m m2 = this;
        CallSite callSite = hi.a("\u00e9", (Object)m2, (long)569888840775595860L);
        hi.a("\u00f2", (Object)m2, (int)(callSite - true), (long)569888840775595860L);
        return (int)callSite;
    }

    @yE
    private void g(dR dR2) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)587419938325296885L);
    }

    private m() {
        super(m.b(31141, 5628), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        this.P = hi.a("\u00a5", (Object)this, (Object)m.b(31140, 13577), (boolean)true, (long)1230617056439551805L);
        this.v = hi.a("\u00a5", (Object)this, (Object)m.b(31136, -8800), (boolean)true, (long)1230617056439551805L);
        this.t = hi.a("\u00a5", (Object)this, (Object)m.b(31143, -20849), (boolean)true, (long)1230617056439551805L);
        this.W = hi.a("G", new IdentityHashMap(), (long)892349217866810415L);
        this.C = hi.a("G", new IdentityHashMap(), (long)892349217866810415L);
        this.X = new ArrayList<_v>();
        hi.a("\u00f2", (Object)this, (int)m.c(30935, 6249834376764776909L), (long)569888840775595860L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void K(dN var1_1) {
        block16: {
            var2_2 = Dl.t();
            var5_3 /* !! */  = m.c(3210, 1996050556744078754L) * m.c(32052, 7244947640673363020L) - m.c(1742, 5418712662510641139L);
            if (var2_2) ** GOTO lbl-1000
            v0 = var5_3 /* !! */ ;
            if (var2_2) break block16;
            switch (v0) {
                default: lbl-1000:
                // 2 sources

                {
                    var3_4 = hi.a("\u00a5", (Object)var1_1, (long)1157675744453294354L);
                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)913793225776308375L), (Object)var3_4, (long)1128025236213057684L);
                    if (var2_2) ** GOTO lbl64
                    if (v1 /* !! */  != false) ** GOTO lbl63
                    ** GOTO lbl66
                }
                case 234885939: {
                    break;
                }
            }
            if (true) ** GOTO lbl-1000
            block11: while (true) {
                if (!var2_2) ** GOTO lbl41
                return;
lbl-1000:
                // 6 sources

                {
                    block19: {
                        block17: {
                            block18: {
                                block20: {
                                    switch (var5_3 /* !! */ ) {
                                        default: {
                                            v2 = var3_4 instanceof LivingEntity;
                                            if (var2_2) break block17;
                                            if (v2 == 0) break block18;
                                            break block19;
                                        }
                                        case 0xB99B090: {
                                            var4_5 = (LivingEntity)var3_4;
                                            v3 /* !! */  = hi.a("\u00a5", (Object)var4_5, (long)938038053496602901L);
                                            if (var2_2) ** GOTO lbl37
                                            if (v3 /* !! */  == false) ** GOTO lbl36
                                            ** GOTO lbl39
                                        }
                                        case 194621587: lbl-1000:
                                        // 2 sources

                                        {
                                            hi.a("G", (long)1082142115168457609L);
                                            v0 = m.c(29979, 8130145803692010556L);
                                            break block11;
                                        }
lbl36:
                                        // 1 sources

                                        v3 /* !! */  = (CallSite)(m.c(30181, 6571162378830670959L) * m.c(1975, 5892946674030485091L) + m.c(20309, 6789793996065494579L) - m.c(6665, 8821914505798648728L) + m.c(18972, 4393650560425218838L));
lbl37:
                                        // 2 sources

                                        var5_3 /* !! */  = (int)v3 /* !! */ ;
                                        if (!var2_2) continue block12;
lbl39:
                                        // 2 sources

                                        var5_3 /* !! */  = (hi.a("G", (int)m.c(19046, 1129235200719410005L), (int)m.c(19972, 2992962410872493901L), (long)834203424483934088L) ^ m.c(32312, 7018219261047105375L)) + m.c(5364, 9202898443975593364L) + m.c(28736, 6682577192365386165L);
                                        if (!var2_2) break block20;
lbl41:
                                        // 2 sources

                                        var5_3 /* !! */  = m.c(30181, 6571162378830670959L) * m.c(1975, 5892946674030485091L) + m.c(20309, 6789793996065494579L) - m.c(6665, 8821914505798648728L) + m.c(18972, 4393650560425218838L);
                                        continue block12;
                                        case 194621585: 
                                    }
                                    return;
                                }
                                do {
                                    switch (var5_3 /* !! */ ) {
                                        default: {
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)710308901307699396L), (Object)var4_5, (long)489810460382064611L);
                                            continue block11;
                                        }
                                        case -1240687889: 
                                    }
                                    hi.a("G", (double)0.0, (float)-2.0f, (boolean)true, (boolean)false, (boolean)false, (boolean)true, (boolean)false, (boolean)true, (boolean)false, (boolean)false, (int)1, (long)1218704056816907128L);
                                    hi.a("G", (int)m.c(5904, 7279168543392239110L), (long)1024745345430233792L);
                                    var5_3 /* !! */  = (m.c(6140, 8032794752609881734L) - m.c(3102, 9002732477380891950L) ^ m.c(8822, 8661465298067208970L)) + m.c(7240, 7366644277030487547L);
                                    if (!var2_2) ** break;
                                    continue block11;
                                } while (!var2_2);
lbl63:
                                // 2 sources

                                v1 /* !! */  = (CallSite)(m.c(25318, 3516597444200201041L) * m.c(17887, 2927511799699921932L) + m.c(22113, 1501048635665567604L) - m.c(31602, 5118552617049907755L) + m.c(14070, 7423112808285646713L));
lbl64:
                                // 2 sources

                                var5_3 /* !! */  = (int)v1 /* !! */ ;
                                if (!var2_2) continue;
lbl66:
                                // 2 sources

                                var5_3 /* !! */  = (m.c(19471, 8806743111707710910L) - m.c(23250, 1640367726162035608L) + m.c(15254, 6752983690123682326L) - m.c(26206, 1184756178893996011L) ^ m.c(30507, 2730172453919092433L)) + m.c(28685, 2886669164150024610L);
                                if (!var2_2) continue;
                            }
                            v2 = var5_3 /* !! */  = m.c(30181, 6571162378830670959L) * m.c(1975, 5892946674030485091L) + m.c(20309, 6789793996065494579L) - m.c(6665, 8821914505798648728L) + m.c(18972, 4393650560425218838L);
                        }
                        if (!var2_2) continue;
                    }
                    var5_3 /* !! */  = m.c(4698, 4478491982175144856L) * m.c(24754, 3796043023432710581L) + m.c(25823, 3971242593857011076L) - m.c(22522, 7977098573812649620L) + m.c(17423, 135867255070350814L);
                    ** while (true)
                }
                break;
            }
        }
        hi.a("G", (int)v0, (int)0, (int)1, (int)-1, (long)936415413245529974L);
    }

    static Minecraft D(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        return hi.a("\u00e9", (Object)m2, (long)1187940231439308830L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void l() {
        block12: {
            var1_1 = Dl.S();
            var4_2 /* !! */  = m.c(1456, 3156113139112483872L) / m.c(15929, 7430508282387310408L) + m.c(10241, 3659796422286029253L);
            if (!var1_1) ** GOTO lbl-1000
            switch (var4_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var2_3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1159318096951901328L), (long)1240653736693366367L);
                    if (var1_1) break;
                    break block12;
                }
                case -1145475796: {
                    throw null;
                }
            }
            var4_2 /* !! */  = hi.a("G", (int)((m.c(29785, 1870386584396590365L) + m.c(21024, 1403236191746837236L)) / m.c(27190, 3786474978489398167L)), (int)m.c(2708, 2593086638528107306L), (long)834203424483934088L) - m.c(9972, 7214495005496426268L) ^ m.c(1657, 7708170966996819810L);
            if (var1_1) ** GOTO lbl26
            ** GOTO lbl20
        }
        block8: while (true) {
            block15: {
                block14: {
                    block13: {
                        v0 = hi.a("\u00a5", (Object)var2_3, (long)984088978567310565L);
                        if (!var1_1) break block13;
                        if (v0 != false) break block14;
lbl20:
                        // 2 sources

                        v0 = (m.h("1aOAObmvhGjw2Bl6", max(int int ), (int)m.c(11723, 1765245849332757549L), (int)m.c(15700, 8756649924753532020L)) - m.c(22198, 7536530472162217952L)) * m.c(9842, 4562304001857470278L) - m.c(18997, 7136864998459036611L);
                    }
                    var4_2 /* !! */  = (int)v0;
                    if (var1_1) break block15;
                }
                var4_2 /* !! */  = (m.c(19919, 7220471369083573321L) * m.c(552, 3512236067716864947L) + m.c(21209, 5277519187163990842L)) * m.c(14782, 1747642708722917606L) + m.c(17292, 1909657413963962902L);
            }
            while (true) {
                block16: {
                    switch (var4_2 /* !! */ ) {
                        default: {
                            continue block8;
                        }
                        case 757701300: {
                            var3_4 = (_v)hi.a("\u00a5", (Object)var2_3, (long)470012372636416268L);
                            hi.a("\u00a5", (Object)var3_4, (Object)new Object[0], (long)866047999238534240L);
                            if (var1_1) break block16;
                            ** GOTO lbl-1000
                        }
                        case 757701298: lbl-1000:
                        // 2 sources

                        {
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1159318096951901328L), (long)400728262949485023L);
                            return;
                        }
                        case 757701301: 
                    }
                    hi.a("G", (long)711058383680228479L);
                    hi.a("G", (int)2, (int)-1, (int)2, (long)1066719768155535037L);
                    return;
                }
                var4_2 /* !! */  = hi.a("G", (int)((m.c(30381, 6184547367227748160L) + m.c(16388, 6086480226271746411L)) / m.c(27190, 3786474978489398167L)), (int)m.c(8761, 7857616024950258616L), (long)834203424483934088L) - m.c(25906, 3412928896746552565L) ^ m.c(30459, 3150949878836359167L);
            }
            break;
        }
    }

    static Minecraft H(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        return hi.a("\u00e9", (Object)m2, (long)1187940231439308830L);
    }

    static Minecraft k(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        return hi.a("\u00e9", (Object)m2, (long)1187940231439308830L);
    }

    public static /* bridge */ /* synthetic */ CallSite h(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x79A4) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 159;
                case 1 -> 250;
                case 2 -> 32;
                case 3 -> 180;
                case 4 -> 113;
                case 5 -> 217;
                case 6 -> 157;
                case 7 -> 216;
                case 8 -> 134;
                case 9 -> 143;
                case 10 -> 65;
                case 11 -> 209;
                case 12 -> 2;
                case 13 -> 254;
                case 14 -> 132;
                case 15 -> 92;
                case 16 -> 119;
                case 17 -> 227;
                case 18 -> 49;
                case 19 -> 34;
                case 20 -> 158;
                case 21 -> 231;
                case 22 -> 63;
                case 23 -> 100;
                case 24 -> 255;
                case 25 -> 242;
                case 26 -> 232;
                case 27 -> 12;
                case 28 -> 241;
                case 29 -> 35;
                case 30 -> 130;
                case 31 -> 70;
                case 32 -> 192;
                case 33 -> 47;
                case 34 -> 220;
                case 35 -> 228;
                case 36 -> 115;
                case 37 -> 188;
                case 38 -> 91;
                case 39 -> 237;
                case 40 -> 46;
                case 41 -> 150;
                case 42 -> 183;
                case 43 -> 120;
                case 44 -> 124;
                case 45 -> 176;
                case 46 -> 244;
                case 47 -> 199;
                case 48 -> 165;
                case 49 -> 41;
                case 50 -> 175;
                case 51 -> 28;
                case 52 -> 93;
                case 53 -> 177;
                case 54 -> 87;
                case 55 -> 62;
                case 56 -> 37;
                case 57 -> 156;
                case 58 -> 105;
                case 59 -> 39;
                case 60 -> 0;
                case 61 -> 190;
                case 62 -> 45;
                case 63 -> 4;
                case 64 -> 141;
                case 65 -> 122;
                case 66 -> 21;
                case 67 -> 195;
                case 68 -> 55;
                case 69 -> 200;
                case 70 -> 137;
                case 71 -> 155;
                case 72 -> 3;
                case 73 -> 193;
                case 74 -> 25;
                case 75 -> 154;
                case 76 -> 40;
                case 77 -> 246;
                case 78 -> 184;
                case 79 -> 111;
                case 80 -> 84;
                case 81 -> 117;
                case 82 -> 147;
                case 83 -> 89;
                case 84 -> 97;
                case 85 -> 126;
                case 86 -> 60;
                case 87 -> 52;
                case 88 -> 104;
                case 89 -> 161;
                case 90 -> 36;
                case 91 -> 7;
                case 92 -> 90;
                case 93 -> 222;
                case 94 -> 144;
                case 95 -> 226;
                case 96 -> 233;
                case 97 -> 78;
                case 98 -> 123;
                case 99 -> 44;
                case 100 -> 182;
                case 101 -> 215;
                case 102 -> 205;
                case 103 -> 251;
                case 104 -> 218;
                case 105 -> 15;
                case 106 -> 14;
                case 107 -> 139;
                case 108 -> 83;
                case 109 -> 80;
                case 110 -> 50;
                case 111 -> 243;
                case 112 -> 61;
                case 113 -> 99;
                case 114 -> 38;
                case 115 -> 43;
                case 116 -> 179;
                case 117 -> 17;
                case 118 -> 178;
                case 119 -> 58;
                case 120 -> 13;
                case 121 -> 121;
                case 122 -> 210;
                case 123 -> 249;
                case 124 -> 235;
                case 125 -> 185;
                case 126 -> 225;
                case 127 -> 167;
                case 128 -> 153;
                case 129 -> 189;
                case 130 -> 56;
                case 131 -> 207;
                case 132 -> 151;
                case 133 -> 248;
                case 134 -> 224;
                case 135 -> 173;
                case 136 -> 114;
                case 137 -> 160;
                case 138 -> 109;
                case 139 -> 164;
                case 140 -> 67;
                case 141 -> 202;
                case 142 -> 18;
                case 143 -> 116;
                case 144 -> 106;
                case 145 -> 219;
                case 146 -> 23;
                case 147 -> 107;
                case 148 -> 238;
                case 149 -> 103;
                case 150 -> 191;
                case 151 -> 186;
                case 152 -> 212;
                case 153 -> 129;
                case 154 -> 125;
                case 155 -> 201;
                case 156 -> 138;
                case 157 -> 136;
                case 158 -> 1;
                case 159 -> 9;
                case 160 -> 81;
                case 161 -> 68;
                case 162 -> 30;
                case 163 -> 19;
                case 164 -> 72;
                case 165 -> 8;
                case 166 -> 64;
                case 167 -> 204;
                case 168 -> 223;
                case 169 -> 170;
                case 170 -> 94;
                case 171 -> 148;
                case 172 -> 77;
                case 173 -> 198;
                case 174 -> 112;
                case 175 -> 31;
                case 176 -> 239;
                case 177 -> 230;
                case 178 -> 221;
                case 179 -> 24;
                case 180 -> 48;
                case 181 -> 73;
                case 182 -> 203;
                case 183 -> 171;
                case 184 -> 57;
                case 185 -> 11;
                case 186 -> 86;
                case 187 -> 149;
                case 188 -> 98;
                case 189 -> 26;
                case 190 -> 22;
                case 191 -> 27;
                case 192 -> 42;
                case 193 -> 208;
                case 194 -> 234;
                case 195 -> 131;
                case 196 -> 181;
                case 197 -> 20;
                case 198 -> 10;
                case 199 -> 166;
                case 200 -> 6;
                case 201 -> 152;
                case 202 -> 128;
                case 203 -> 162;
                case 204 -> 174;
                case 205 -> 53;
                case 206 -> 133;
                case 207 -> 29;
                case 208 -> 197;
                case 209 -> 33;
                case 210 -> 85;
                case 211 -> 194;
                case 212 -> 101;
                case 213 -> 169;
                case 214 -> 79;
                case 215 -> 245;
                case 216 -> 214;
                case 217 -> 110;
                case 218 -> 5;
                case 219 -> 118;
                case 220 -> 75;
                case 221 -> 16;
                case 222 -> 82;
                case 223 -> 146;
                case 224 -> 96;
                case 225 -> 247;
                case 226 -> 240;
                case 227 -> 76;
                case 228 -> 187;
                case 229 -> 253;
                case 230 -> 69;
                case 231 -> 59;
                case 232 -> 145;
                case 233 -> 66;
                case 234 -> 163;
                case 235 -> 229;
                case 236 -> 54;
                case 237 -> 236;
                case 238 -> 252;
                case 239 -> 211;
                case 240 -> 140;
                case 241 -> 172;
                case 242 -> 213;
                case 243 -> 102;
                case 244 -> 71;
                case 245 -> 88;
                case 246 -> 168;
                case 247 -> 142;
                case 248 -> 51;
                case 249 -> 196;
                case 250 -> 108;
                case 251 -> 95;
                case 252 -> 127;
                case 253 -> 135;
                case 254 -> 74;
                default -> 206;
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
            m.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x19D5;
        if (d[n2] == null) {
            m.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
