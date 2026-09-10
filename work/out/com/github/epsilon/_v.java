/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.animal.squid.Squid
 *  net.minecraft.world.level.Level
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon._E;
import com.github.epsilon.hi;
import com.github.epsilon.lH;
import com.github.epsilon.m;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.squid.Squid;
import net.minecraft.world.level.Level;

final class _v {
    private final _E d;
    private final double p;
    private final Squid m;
    final m i;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    private _v(m m2, LivingEntity livingEntity) {
        m m3 = m2;
        Objects.requireNonNull(m3);
        this.i = m3;
        this.m = new Squid((EntityType)hi.a("j", (long)660058592568255473L), (Level)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{m2}, (long)1092816487597210265L), (long)430579852159213241L));
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (int)_v.p("dzvWWcBQIXmbB27t", s(), (m)m2), (long)686142633841562871L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (boolean)true, (long)1033059814852662665L);
        this.p = (double)(hi.a("\u00a5", (Object)livingEntity, (long)1235747372608796815L) + 0.0);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (double)hi.a("\u00a5", (Object)livingEntity, (long)907047849049535430L), (double)hi.a("\u00e9", (Object)this, (long)1303430274971299362L), (double)_v.p("dzvWWcBQIXmbB27t", getZ(), (LivingEntity)livingEntity), (long)383234900240655967L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)1143054432885102821L);
        this.d = new _E((lH)((Object)hi.a("j", (long)1134504607802496720L)), c);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1259942927068477969L), (float)0.0f, (long)1165334323158006666L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)m2, (long)913793225776308375L), (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)489810460382064611L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{m2}, (long)1004523361058080552L), (long)430579852159213241L), (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)689999981825014241L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void K(Object[] var1_1) {
        block13: {
            block12: {
                block15: {
                    block14: {
                        var2_2 = Dl.t();
                        var3_3 /* !! */  = _v.a(28189, 4806056021401030497L) * _v.a(28582, 1763032439931064037L) - _v.a(9440, 7928908031719933368L) + _v.a(29644, 4378900314105008807L);
                        if (!var2_2) break block14;
lbl5:
                        // 2 sources

                        while (true) {
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)512720911508439506L), (long)913793225776308375L), (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)1015445622538637854L);
                            if (var2_2) ** GOTO lbl38
                            if (hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)512720911508439506L)}, (long)749624317527096021L), (long)430579852159213241L) == null) ** GOTO lbl37
                            ** GOTO lbl39
                            break;
                        }
lbl11:
                        // 1 sources

                        while (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)_v.p("dzvWWcBQIXmbB27t", h(com.github.epsilon.m ), (m)hi.a("\u00e9", (Object)this, (long)512720911508439506L)), (long)430579852159213241L), (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)786144959816719273L), (long)589839494272680763L) == hi.a("\u00e9", (Object)this, (long)357306107873218257L)) {
                            break block12;
                        }
                        break block15;
lbl14:
                        // 1 sources

                        while (true) {
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)512720911508439506L)}, (long)573912614467700115L), (long)430579852159213241L), (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)786144959816719273L), (Object)hi.a("j", (long)766574543120786341L), (long)551753935029264404L);
                            if (var2_2) lbl-1000:
                            // 2 sources

                            {
                                return;
                            }
                            break block13;
                            break;
                        }
                    }
lbl21:
                    // 4 sources

                    while (true) {
                        switch (var3_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -242394063: {
                                ** GOTO lbl11
                            }
                            case -242394064: {
                                ** continue;
                            }
                            case -242394062: {
                                ** continue;
                            }
                            case -242394061: 
                        }
                        hi.a("G", (long)659151967568421102L);
                        var3_3 /* !! */  = (_v.a(232, 7751188275046654455L) ^ _v.a(12247, 831791711308385955L)) - _v.a(16071, 2746143182507679627L);
                        if (!var2_2) continue;
lbl37:
                        // 2 sources

                        var3_3 /* !! */  = (int)(hi.a("G", (int)(_v.a(1754, 4935668062532380550L) + _v.a(13026, 4226649156804088721L)), (int)_v.a(8293, 3579528340462174518L), (long)834203424483934088L) * _v.a(7554, 295846244454284513L) + _v.a(21093, 6454994709646177071L));
lbl38:
                        // 2 sources

                        if (!var2_2) continue;
lbl39:
                        // 2 sources

                        var3_3 /* !! */  = _v.a(6921, 355259024370448988L) / _v.a(20435, 28361637277232818L) ^ _v.a(28522, 4818019095037660686L);
                        if (!var2_2) continue;
                        break;
                    }
                }
                var3_3 /* !! */  = (int)(hi.a("G", (int)(_v.a(14589, 5692703601082112391L) + _v.a(3976, 4190406298231516870L)), (int)_v.a(10134, 3779176893240313567L), (long)834203424483934088L) * _v.a(17138, 665958542353064887L) + _v.a(2338, 7997405880204634199L));
                if (!var2_2) ** GOTO lbl21
            }
            var3_3 /* !! */  = _v.a(26097, 8067528361474245800L) / 5 - _v.a(6206, 6061587491274078540L);
            if (!var2_2) ** GOTO lbl21
        }
        var3_3 /* !! */  = (int)(hi.a("G", (int)(_v.a(14589, 5692703601082112391L) + _v.a(3976, 4190406298231516870L)), (int)_v.a(10134, 3779176893240313567L), (long)834203424483934088L) * _v.a(17138, 665958542353064887L) + _v.a(2338, 7997405880204634199L));
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite p(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    private boolean d(Object[] var1_1) {
        block20: {
            block19: {
                var2_2 = Dl.S();
                var4_3 /* !! */  = (_v.a(6233, 2730504911473391934L) - _v.a(3329, 5578490568025975875L) ^ _v.a(12750, 2148434493867004053L)) + _v.a(25832, 1496532436885194142L);
                if (var2_2) break block19;
lbl5:
                // 2 sources

                while (true) {
                    block22: {
                        block21: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)418549208678793659L);
                            if (!var2_2) break block21;
                            if (v0 /* !! */  == false) break block22;
                            v0 /* !! */  = (CallSite)(_v.a(12041, 9106078133579812443L) / _v.a(28980, 5287071119593820259L) + _v.a(9813, 9108826399741904686L));
                        }
                        var4_3 /* !! */  = (int)v0 /* !! */ ;
                        if (var2_2) break block19;
                    }
                    var4_3 /* !! */  = (_v.a(13599, 1805920413576565873L) / _v.a(2646, 4085479407013210927L) ^ _v.a(17279, 8904727828441948709L)) * _v.a(19668, 2986539660012416441L) ^ _v.a(16966, 4180424171958035202L) ^ _v.a(18949, 7970047418116959048L);
                    if (var2_2) break block19;
                    ** GOTO lbl53
                    break;
                }
lbl17:
                // 2 sources

                while (true) {
                    v1 = var3_4;
                    v2 = _v.a(5351, 3249870037371762099L);
                    if (!var2_2) ** GOTO lbl66
                    if (v1 > v2) ** GOTO lbl64
                    ** GOTO lbl68
                    break;
                }
            }
            block15: while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 962791647: {
                        if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)512720911508439506L)}, (long)1139150174874794435L), (long)430579852159213241L), (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)786144959816719273L), (long)589839494272680763L) == hi.a("\u00e9", (Object)this, (long)357306107873218257L)) ** GOTO lbl53
                        ** GOTO lbl55
                    }
                    case 962791649: {
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1259942927068477969L), (float)1.0f, (long)439674605800943152L);
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)1267660810272162099L), (double)(hi.a("\u00e9", (Object)this, (long)1303430274971299362L) + (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1259942927068477969L), (long)1167668381225401548L) * 0.9), (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (long)584139407518977681L), (long)383234900240655967L);
                        hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (float)0.0f, (long)1312565515359813764L);
                        hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (float)0.0f, (long)545337923374329045L);
                        hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (float)0.0f, (long)1058166899360742185L);
                        hi.a("\u00f2", (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (float)0.0f, (long)384854166305610145L);
                        v3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1259942927068477969L), (long)1048531528246468125L);
                        if (!var2_2) ** GOTO lbl58
                        if (v3 == false) ** GOTO lbl57
                        ** GOTO lbl60
                    }
                    case 962791650: {
                        var3_4 = 0;
                        if (var2_2) ** GOTO lbl62
                        ** GOTO lbl17
                    }
                    case 962791646: {
                        _v.p("dzvWWcBQIXmbB27t", p());
                        hi.a("G", (long)818835474660401656L);
                        var4_3 /* !! */  = (int)(hi.a("G", (int)(_v.a(16538, 9148654552424899029L) / _v.a(17798, 2985297951157970076L)), (int)_v.a(17968, 5141774657166337878L), (long)834203424483934088L) + _v.a(14002, 8050956940117743587L));
                        continue block15;
                    }
lbl53:
                    // 2 sources

                    var4_3 /* !! */  = _v.a(31953, 5598255421723565455L) ^ _v.a(10252, 3901495792570141038L) ^ _v.a(15609, 7014498064099319185L);
                    if (var2_2) continue block15;
lbl55:
                    // 2 sources

                    var4_3 /* !! */  = _v.a(188, 5464489512013865466L) / _v.a(17128, 4624129510550758385L) + _v.a(8679, 7604409428142358687L);
                    if (var2_2) continue block15;
lbl57:
                    // 2 sources

                    v3 = _v.p("dzvWWcBQIXmbB27t", max(int int ), (int)(_v.a(27673, 5026320708828319081L) * _v.a(29588, 6775956119839265531L)), (int)_v.a(210, 4923206744606482872L)) / _v.a(15017, 7498598582797212662L) * _v.a(11128, 3357795640807393855L) - _v.a(25323, 5197907061736489973L);
lbl58:
                    // 2 sources

                    var4_3 /* !! */  = (int)v3;
                    if (var2_2) continue block15;
lbl60:
                    // 2 sources

                    var4_3 /* !! */  = (int)(_v.p("dzvWWcBQIXmbB27t", max(int int ), (int)_v.a(24628, 2415438146334671202L), (int)_v.a(25766, 8765555394591311293L)) - _v.a(5314, 4013899845922076035L));
                    continue block15;
lbl62:
                    // 1 sources

                    var4_3 /* !! */  = (_v.a(28608, 1016263712496569992L) ^ _v.a(789, 6022666908914360930L)) + _v.a(13967, 6176674838864107505L);
                    if (var2_2) break block20;
lbl64:
                    // 2 sources

                    v1 = _v.a(6186, 706690751552010566L) ^ _v.a(5794, 2201844587280381929L);
                    v2 = _v.a(4163, 1140296133553467690L);
lbl66:
                    // 2 sources

                    var4_3 /* !! */  = v1 ^ v2;
                    if (var2_2) break block20;
lbl68:
                    // 2 sources

                    var4_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)hi.a("G", (int)_v.a(21355, 498642423627641387L), (int)_v.a(11304, 9074392356351839577L), (long)834203424483934088L), (int)_v.a(6763, 1438751282192038670L), (long)834203424483934088L) ^ _v.a(12695, 2585763877776134376L)), (int)_v.a(15567, 4568208436219092439L), (long)834203424483934088L) + _v.a(17212, 7729556895806906945L));
                    if (var2_2) break block20;
                    ** GOTO lbl92
                    case 962791648: {
                        return true;
                    }
                    case 962791645: 
                }
                break;
            }
            return false;
        }
        block16: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -615046277: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)512720911508439506L)}, (long)499477384284778456L), (long)418187901895148915L), (Object)hi.a("\u00e9", (Object)this, (long)357306107873218257L), (Object)hi.a("j", (long)439508429653473991L), (long)1020762449247353352L);
                    ++var3_4;
                    if (!var2_2) {
                        return true;
                    }
                    ** GOTO lbl92
                }
                case -615046274: {
                    _v.p("dzvWWcBQIXmbB27t", h());
                    hi.a("G", (long)1018118041190145658L);
                    return (boolean)_v.p("dzvWWcBQIXmbB27t", e());
                }
lbl92:
                // 2 sources

                var4_3 /* !! */  = (_v.a(13781, 7667374671854867637L) ^ _v.a(24467, 6884040892351053518L)) + _v.a(3655, 2676259532472790807L);
                continue block16;
                case -615046276: 
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 6655418750356196422L;
                    var8_1 = new long[70];
                    var5_2 = 0;
                    var6_3 = "1\u00b4D$J\u0099\u00be<=34K\u00b6\u00c3\u00c9y\u0004\u0019r\u00c42N\u0095\u00f7\u0089\u00ab\u00bb\u00cc\u00cc\u00d1G\u00a2\u000e\u00d3$\u008e\u00e6\u0094\u0097\u00b7<\u00ef\u00d4\u00bc)\u00db\u00d2W\u0005{~9L/\u008f\u00c3\u009c\u00b3\u00ea\u009cFZN\u00f0.3[\u0083\u00f9\u00c8\u008f\\\u00c3\u00f8\u008b`2\u00b1\u00ea\u0088R\u00efK\u00ba&}\u00f0\u00c9\u00df;\\(\u0095\u00ac\u00ddb\u00f0\u00c5\u0087\u000f\u00bf\u00e9\\/\u00daG\u00e2\u00f9\u0086\u0081`\u00edO{\u00a0e\u00b0\u00e5\u00c0\u0001$\u001f-\u001a\u00f9\u00ce9\u00fd3DxX\u0089n\u00f5\u008d\u009bw)0\u00fa\u00f8\u00ff\u00ea\u00dcaF\u008f\r\u008d\u0088\u00b5e\u0081\u0090\u00a3\u00b9\u00ce\u009a\u00cf\u00dd\u00a1\u00f7\u0082\u0015\u00e9\u0010T\u00e7J\u009f\u00a3\u00d2dg\u00ad\u00ed\u000f\u008e\u0091&p\u00aaj\u0081\u00a0\u009d\u00bc\u00e5\u00a0\u00fa\u0084\u0082\u0000-4l\")\u0014\u001a?\u0094\u00bfu\u00e0C\u00d2>b}\u0002^\u0004\u009d\"f\u00e0\u00a6\n\u00ae\u00b4{\\\u00ea+\u00e8\\Xk\u00d2x\u0084\u00c7\u00c2\u00cc`$\u00c5)\u00c8%\u00b2\u00d2\u00b9\u00e1\u001a\u008a~\u008a\u00c1\u00dfg\u000f\u0085\u00c0\u001c\u00b1m\u00d0\u00cb\f\u00f5\u0003\u0015\u00d1\u0000\u0011\b7\u00f0\u00f12Pc\u00ba\u0096F\u00a7f\u0001\u00f4\u00c0\u00c6\u009dSr\u00b2\u001aR\u0019lR72\u00d9\u00bc3\u00e5\nM\u00f1e\u0084\u001c\u00d1f\u0000\u00f3\u00ab\u00c1j\u0085\u00f8\u0095\u00d8[,\u0082i\u00bb\u00c1\u00d1\u0001\u00e9AZ\u00fa 8\u00e9\u0014Zi\u0003dXX\u008f\u00f693\u0010k^\u00e9\u0086\u00ebV`k\u00a0\u00ff\u00c3D&A\u00a0So\u00f5\u00bd\u001b\u00ed\u0004\u00d3\u00ea\u0005j\u007f\u00af3[\u00b3$\u0092\u0003$\u0017\u00d6F\u00a1X\u00e4\u00f1Ad\u00e8c/\u00bf/\u00be\u00b2\u00f1\u008f\u00d4Z\\\u0082\f\u00f5G\u00ce\u00ca\u0004-Rf\u00fcjE\u0001*[\u008dp\u00e3\u0017z\u0081\u009b\u009f\u00ac\u00bdL\u00ee\u00e5R\u0092~0\u00e4\u00c9A`^\u0016\u00f7\u00e2a\u0092\u00040\u00baD\u00c8`\u00bc`\u009c\u00bc-\"\u00c5\u00dc\u0018\u00acja\u00e6\u00c7\u00c4\r\b\u000eJ&-\\\u00e2\u00favSp8\u000f\b@\u00f2\b\u0087\u000bw\u008dL\u001c\u009f\u00dcPp\u00ccn\u0003\u00e3U\u00fe*qw}wy\u0018w\u0084\u0015\u000bo8}\u00a7*\u00ceE\u00cd`\u000f\u00f4\u00ca\u008c\u0017$\t\u0019\fh\u00dc\u00be{\u00f3@)\u00b3\u00ef\u00bd\u0086\u0018b&\u00d0H\u00e5\u009f";
                    var7_4 = "1\u00b4D$J\u0099\u00be<=34K\u00b6\u00c3\u00c9y\u0004\u0019r\u00c42N\u0095\u00f7\u0089\u00ab\u00bb\u00cc\u00cc\u00d1G\u00a2\u000e\u00d3$\u008e\u00e6\u0094\u0097\u00b7<\u00ef\u00d4\u00bc)\u00db\u00d2W\u0005{~9L/\u008f\u00c3\u009c\u00b3\u00ea\u009cFZN\u00f0.3[\u0083\u00f9\u00c8\u008f\\\u00c3\u00f8\u008b`2\u00b1\u00ea\u0088R\u00efK\u00ba&}\u00f0\u00c9\u00df;\\(\u0095\u00ac\u00ddb\u00f0\u00c5\u0087\u000f\u00bf\u00e9\\/\u00daG\u00e2\u00f9\u0086\u0081`\u00edO{\u00a0e\u00b0\u00e5\u00c0\u0001$\u001f-\u001a\u00f9\u00ce9\u00fd3DxX\u0089n\u00f5\u008d\u009bw)0\u00fa\u00f8\u00ff\u00ea\u00dcaF\u008f\r\u008d\u0088\u00b5e\u0081\u0090\u00a3\u00b9\u00ce\u009a\u00cf\u00dd\u00a1\u00f7\u0082\u0015\u00e9\u0010T\u00e7J\u009f\u00a3\u00d2dg\u00ad\u00ed\u000f\u008e\u0091&p\u00aaj\u0081\u00a0\u009d\u00bc\u00e5\u00a0\u00fa\u0084\u0082\u0000-4l\")\u0014\u001a?\u0094\u00bfu\u00e0C\u00d2>b}\u0002^\u0004\u009d\"f\u00e0\u00a6\n\u00ae\u00b4{\\\u00ea+\u00e8\\Xk\u00d2x\u0084\u00c7\u00c2\u00cc`$\u00c5)\u00c8%\u00b2\u00d2\u00b9\u00e1\u001a\u008a~\u008a\u00c1\u00dfg\u000f\u0085\u00c0\u001c\u00b1m\u00d0\u00cb\f\u00f5\u0003\u0015\u00d1\u0000\u0011\b7\u00f0\u00f12Pc\u00ba\u0096F\u00a7f\u0001\u00f4\u00c0\u00c6\u009dSr\u00b2\u001aR\u0019lR72\u00d9\u00bc3\u00e5\nM\u00f1e\u0084\u001c\u00d1f\u0000\u00f3\u00ab\u00c1j\u0085\u00f8\u0095\u00d8[,\u0082i\u00bb\u00c1\u00d1\u0001\u00e9AZ\u00fa 8\u00e9\u0014Zi\u0003dXX\u008f\u00f693\u0010k^\u00e9\u0086\u00ebV`k\u00a0\u00ff\u00c3D&A\u00a0So\u00f5\u00bd\u001b\u00ed\u0004\u00d3\u00ea\u0005j\u007f\u00af3[\u00b3$\u0092\u0003$\u0017\u00d6F\u00a1X\u00e4\u00f1Ad\u00e8c/\u00bf/\u00be\u00b2\u00f1\u008f\u00d4Z\\\u0082\f\u00f5G\u00ce\u00ca\u0004-Rf\u00fcjE\u0001*[\u008dp\u00e3\u0017z\u0081\u009b\u009f\u00ac\u00bdL\u00ee\u00e5R\u0092~0\u00e4\u00c9A`^\u0016\u00f7\u00e2a\u0092\u00040\u00baD\u00c8`\u00bc`\u009c\u00bc-\"\u00c5\u00dc\u0018\u00acja\u00e6\u00c7\u00c4\r\b\u000eJ&-\\\u00e2\u00favSp8\u000f\b@\u00f2\b\u0087\u000bw\u008dL\u001c\u009f\u00dcPp\u00ccn\u0003\u00e3U\u00fe*qw}wy\u0018w\u0084\u0015\u000bo8}\u00a7*\u00ceE\u00cd`\u000f\u00f4\u00ca\u008c\u0017$\t\u0019\fh\u00dc\u00be{\u00f3@)\u00b3\u00ef\u00bd\u0086\u0018b&\u00d0H\u00e5\u009f".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "~\u00f5\u00d6\"\u0083C\u0018r\u0012XR\u00b7#@B{";
                        var7_4 = "~\u00f5\u00d6\"\u0083C\u0018r\u0012XR\u00b7#@B{".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
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
            _v.a = var8_1;
            _v.b = new Integer[70];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 758618300024230594L;
        ** while (true)
        _v.c = 758618300024230656L ^ var0_7;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x215B;
        if (b[n2] == null) {
            _v.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
