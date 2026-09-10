/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.DeltaTracker
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.DW;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.X7;
import com.github.epsilon.XG;
import com.github.epsilon.Xn;
import com.github.epsilon._j;
import com.github.epsilon.dI;
import com.github.epsilon.e;
import com.github.epsilon.eh;
import com.github.epsilon.hi;
import com.github.epsilon.n_;
import com.github.epsilon.u7;
import com.github.epsilon.v6;
import com.github.epsilon.vC;
import com.github.epsilon.zU;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.DeltaTracker;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class es
extends eh {
    private final XG u;
    private final DV W;
    private final DM h;
    private final DV m;
    private final DM J;
    private final Supplier<_j> w;
    private final Dx<DW> t;
    private final DM d;
    private final Xn ks;
    private static final float F = 20.0f;
    private final DM l;
    private final Map<e, Float> N;
    private final Xn ka;
    private final Xn T;
    private final DM x;
    private final DV D;
    private final Map<e, vC> kQ;
    private final DV o;
    public static final es n;
    private final DM kD;
    private final Xn kq;
    private final XG C;
    private static final int X;
    private final DM z;
    private final DV ku;
    private static final int P;
    private final Dx<X7> b = hi.a("\u00a5", (Object)this, (Object)es.b(22944, 27552), (Object)hi.a("j", (long)681556865598572403L), (long)426795652261052192L);
    private final DM Q;
    private List<e> M;
    private final Xn kj;
    private final Dx<DW> E;
    private final DM y;
    private static final String[] db;
    private static final String[] eb;
    private static final long[] lb;
    private static final Integer[] mb;
    private static final long[] nb;
    private static final Long[] ob;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$10() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.S();
                    object = es.n("jP5Jbrj5GNBqGIdF", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L)), (Enum)((Object)hi.a("j", (long)681556865598572403L)));
                    if (!bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)779354614032407436L), (long)789438897355831922L))), (long)1000026253634408124L);
                }
                if (!bl) break block6;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503779284687127672L), (Object)hi.a("j", (long)544272986501020421L), (long)511460060498514638L);
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
    private boolean o(Object[] var1_1) {
        var2_2 = var1_1[0];
        var3_3 = Dl.S();
        var4_4 /* !! */  = hi.a("G", (int)((es.d(29113, 7614858243969952215L) - es.d(22838, 3332256269629882980L)) / es.d(21028, 4384493998733396722L)), (int)es.d(16931, 6488013799064541504L), (long)834203424483934088L) ^ es.d(15887, 8049046699680949791L);
        if (var3_3) ** GOTO lbl17
        block10: while (true) {
            block15: {
                block14: {
                    block13: {
                        v0 = hi.a("\u00a5", (Object)((e)var2_2), (long)1099153674733698693L);
                        if (!var3_3) break block13;
                        if (v0 != false) break block14;
                        v0 = hi.a("G", (int)(hi.a("G", (int)es.d(11069, 6711612881560040024L), (int)es.d(21356, 619577786059459139L), (long)834203424483934088L) * es.d(31381, 7314019357502611712L)), (int)es.d(20529, 7735513995231529842L), (long)834203424483934088L) * es.d(16089, 4195296381522633878L) + es.d(29466, 3110434152496605622L);
                    }
                    var4_4 /* !! */  = (int)v0;
                    if (var3_3) break block15;
                }
                var4_4 /* !! */  = (es.d(17184, 8412933569484298313L) - es.d(11709, 941713426580174790L) ^ es.d(3150, 7450320043802219568L)) + es.d(31464, 4963325290267844813L);
                if (!var3_3) ** GOTO lbl42
            }
            block11: while (true) {
                switch (var4_4 /* !! */ ) {
                    default: {
                        continue block10;
                    }
                    case 549210991: {
                        v1 = hi.a("\u00a5", (Object)((e)var2_2), (Object)new Object[0], (long)648732541034311433L);
                        if (!var3_3) ** GOTO lbl43
                        if (v1 != false) ** GOTO lbl42
                        ** GOTO lbl45
                    }
                    case 549210990: {
                        v2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((e)var2_2), (long)1025159459230292690L), (long)361382094905603987L);
                        if (!var3_3) ** GOTO lbl48
                        if (v2 != false) ** GOTO lbl47
                        ** GOTO lbl50
                    }
                    case 549210995: {
                        v3 = true;
                        var4_4 /* !! */  = es.d(7620, 8410024242969822840L) * es.d(27103, 7213627282297532918L) / es.d(6655, 8472383157657780504L) ^ es.d(20480, 2910486502748425211L);
                        if (var3_3) ** GOTO lbl53
                        ** GOTO lbl52
                    }
                    case 549210993: {
                        v3 = false;
                        if (!var3_3) {
                            return v3;
                        }
                        ** GOTO lbl52
                    }
lbl42:
                    // 2 sources

                    v1 = hi.a("G", (int)(hi.a("G", (int)es.d(25932, 816802672072408189L), (int)es.d(26724, 5646147155218379447L), (long)834203424483934088L) * es.d(19200, 3459665699223900201L)), (int)es.d(23976, 5205557808276702505L), (long)834203424483934088L) * es.d(29060, 3369766049908763590L) + es.d(19963, 7578082931165173731L);
lbl43:
                    // 2 sources

                    var4_4 /* !! */  = (int)v1;
                    if (var3_3) continue block11;
lbl45:
                    // 2 sources

                    var4_4 /* !! */  = (int)(hi.a("G", (int)((es.d(16290, 3567056943751653212L) - es.d(27431, 8878230609528893515L)) * es.d(13488, 1107322941386813116L) + es.d(28393, 7068148841991747088L)), (int)es.d(23047, 8232139007271272780L), (long)834203424483934088L) - es.d(24924, 252433160319645989L));
                    if (var3_3) continue block11;
lbl47:
                    // 2 sources

                    v2 = es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)(hi.a("G", (int)es.d(25932, 816802672072408189L), (int)es.d(26724, 5646147155218379447L), (long)834203424483934088L) * es.d(19200, 3459665699223900201L)), (int)es.d(23976, 5205557808276702505L)) * es.d(29060, 3369766049908763590L) + es.d(19963, 7578082931165173731L);
lbl48:
                    // 2 sources

                    var4_4 /* !! */  = (int)v2;
                    if (var3_3) continue block11;
lbl50:
                    // 2 sources

                    var4_4 /* !! */  = (int)(hi.a("G", (int)(es.d(29608, 6980872635922590442L) - es.d(15586, 64700624389859065L) - es.d(17563, 2131843618058869818L) + es.d(1849, 4059075784539528355L)), (int)es.d(19665, 5830085862797744087L), (long)834203424483934088L) + es.d(32054, 5264806506639239124L));
                    continue block11;
lbl52:
                    // 2 sources

                    var4_4 /* !! */  = es.d(17544, 5069295427730873584L) * es.d(26824, 6386749529021985245L) / es.d(6655, 8472383157657780504L) ^ es.d(7089, 6654057132785320759L);
lbl53:
                    // 2 sources

                    switch (var4_4 /* !! */ ) {
                        default: {
                            return v3;
                        }
                        case 202835555: 
                    }
                    hi.a("G", (int)es.d(28867, 3171709480168434451L), (long)525303406604919947L);
                    hi.a("G", (long)1264004642033370356L);
                    return true;
                    case 549210992: 
                }
                break;
            }
            break;
        }
        return false;
    }

    private boolean lambda$new$12() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private List S(Object var1_1, float var2_2, boolean var3_3) {
        block64: {
            block66: {
                block63: {
                    block65: {
                        block62: {
                            block61: {
                                block67: {
                                    var4_4 = Dl.S();
                                    var14_5 /* !! */  = hi.a("G", (int)(es.d(8304, 463274003825457982L) + es.d(21177, 4220622683164248693L)), (int)es.d(26699, 2862873684470248021L), (long)834203424483934088L) + es.d(13316, 461699028954083086L);
                                    if (var4_4) break block67;
lbl4:
                                    // 2 sources

                                    while (true) {
                                        block68: {
                                            var5_6 = new ArrayList<E>();
                                            var6_7 = hi.a("\u00a5", (Object)es.n("jP5Jbrj5GNBqGIdF", entrySet(), (Map)hi.a("\u00e9", (Object)this, (long)1234253238249565815L)), (long)1297238455825536256L);
                                            if (!var4_4) break block68;
                                            var14_5 /* !! */  = (reference)(es.d(1176, 2803672413949680750L) * es.d(2970, 5201278502746149332L) * es.d(14707, 1877755353314353232L) + es.d(9049, 7847727930897464262L) - es.d(13957, 5234471964427087104L) + es.d(22495, 8348328237469109690L));
                                            if (var4_4) break block61;
                                            ** GOTO lbl16
                                        }
lbl12:
                                        // 2 sources

                                        while (true) {
                                            block70: {
                                                block69: {
                                                    v0 /* !! */  = hi.a("\u00a5", (Object)var6_7, (long)984088978567310565L);
                                                    if (!var4_4) break block69;
                                                    if (v0 /* !! */  != false) break block70;
lbl16:
                                                    // 2 sources

                                                    v0 /* !! */  = var14_5 /* !! */  = (reference)(es.d(698, 8225656763476695470L) * es.d(22751, 2885903368333722103L) - es.d(5269, 216561250190315228L) ^ es.d(30184, 2409915880229351415L));
                                                }
                                                if (var4_4) break block61;
                                            }
                                            var14_5 /* !! */  = (reference)((es.d(12194, 5333188791464654753L) * es.d(26101, 9097326551872290197L) - es.d(10032, 7445082845700389950L) + es.d(2670, 7263252264729072241L)) * es.d(16152, 6227837486679844367L) ^ es.d(26461, 1214702636232326562L));
                                            break block61;
                                            break;
                                        }
                                        break;
                                    }
lbl22:
                                    // 2 sources

                                    while (true) {
                                        block72: {
                                            block71: {
                                                var9_11 = (e)hi.a("\u00a5", (Object)var7_8, (long)374171850520217279L);
                                                var10_12 = es.n("jP5Jbrj5GNBqGIdF", M(), (e)var9_11);
                                                v1 = var3_3;
                                                if (!var4_4) break block71;
                                                if (v1 != 0) break block72;
                                                v1 = (es.d(4328, 8559615707626227800L) - es.d(9798, 3869449619336887778L) ^ es.d(31938, 6928227809881662870L)) - es.d(24951, 6107467827400063775L);
                                            }
                                            var14_5 /* !! */  = (reference)v1;
                                            if (var4_4) break block62;
                                        }
                                        var14_5 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)es.d(14990, 8621553760821765109L), (int)es.d(13962, 7019063000475365030L)) - es.d(18826, 8425506120131285716L);
                                        break block62;
                                        break;
                                    }
lbl35:
                                    // 2 sources

                                    while (true) {
                                        hi.a("G", (long)422762540714773170L);
lbl38:
                                        // 2 sources

                                        while (true) {
                                            block74: {
                                                block73: {
                                                    var11_13 = v2;
                                                    var12_14 = hi.a("\u00a5", (Object)((_j)var1_1), (Object)var10_12, (float)var2_2, (long)665434286926928221L);
                                                    v3 /* !! */  = hi.a("\u00a5", var11_13, (long)361382094905603987L);
                                                    if (!var4_4) break block73;
                                                    if (v3 /* !! */  != false) break block74;
                                                    v3 /* !! */  = var14_5 /* !! */  = (reference)(es.d(23703, 4512991540829554564L) + es.d(21014, 722569773267913357L) ^ es.d(10382, 5052428462596387032L));
                                                }
                                                if (var4_4) break block63;
                                            }
                                            var14_5 /* !! */  = (reference)(es.d(15467, 5417263183774967617L) * es.d(14691, 7590684905142969041L) / es.d(32133, 4396395990465750563L) - es.d(28656, 6017016423946695750L) - es.d(20176, 6821442917916677505L));
                                            break block63;
                                            break;
                                        }
                                        break;
                                    }
lbl50:
                                    // 2 sources

                                    while (true) {
                                        var13_15 /* !! */  = v4 /* !! */ ;
                                        hi.a("\u00a5", var5_6, (Object)new n_(var9_11, (String)var10_12, var11_13, (float)var12_14, (float)(var12_14 + var13_15 /* !! */ ), (float)var8_9), (long)615358212536192384L);
                                        if (var4_4) {
                                            var14_5 /* !! */  = (reference)(es.d(21074, 5015940593793435846L) * es.d(25481, 8974818345771743957L) * es.d(16793, 4385199640262678711L) + es.d(24041, 5414942947875685726L) - es.d(31195, 3666379433653412632L) + es.d(7496, 4901586213694588177L));
                                            break block61;
                                        }
lbl57:
                                        // 3 sources

                                        while (true) {
                                            block76: {
                                                block75: {
                                                    hi.a("\u00a5", var5_6, (Object)hi.a("\u00a5", (Object)hi.a("G", (ToDoubleFunction<n_>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, gN(), (Lcom/github/epsilon/n_;)D)(), (long)1110573410300049240L), (long)1011334880947717168L), (long)1121017606236678262L);
                                                    var6_7 = new ArrayList<E>((int)hi.a("\u00a5", var5_6, (long)417939159730395915L));
                                                    var7_8 = es.n("jP5Jbrj5GNBqGIdF", iterator(), var5_6);
                                                    if (var4_4) break block75;
                                                    break block76;
                                                }
                                                var14_5 /* !! */  = (reference)(es.d(6231, 8599292907091902563L) * es.d(13609, 4379646844991074279L) + es.d(21672, 1015656672884330165L));
                                                if (var4_4) break block64;
                                                ** GOTO lbl77
                                            }
lbl69:
                                            // 2 sources

                                            while (true) {
                                                es.n("jP5Jbrj5GNBqGIdF", E());
                                                hi.a("G", (boolean)false, (long)951202213413429819L);
lbl73:
                                                // 2 sources

                                                while (true) {
                                                    block78: {
                                                        block77: {
                                                            v5 /* !! */  = hi.a("\u00a5", (Object)var7_8, (long)984088978567310565L);
                                                            if (!var4_4) break block77;
                                                            if (v5 /* !! */  != false) break block78;
lbl77:
                                                            // 2 sources

                                                            v5 /* !! */  = var14_5 /* !! */  = (reference)(hi.a("G", (int)((es.d(13011, 1677407997643221890L) - es.d(23402, 528065373303342023L) + es.d(21399, 7203294575447280610L)) * es.d(10073, 3148851318804021154L)), (int)es.d(14067, 8387975421346410213L), (long)834203424483934088L) ^ es.d(5438, 2435488613386243852L));
                                                        }
                                                        if (var4_4) break block64;
                                                    }
                                                    var14_5 /* !! */  = (reference)(es.d(30372, 5622571286008770041L) - es.d(14703, 7850153408439870256L) + es.d(886, 3353711758334777937L));
                                                    break block64;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
lbl83:
                                    // 2 sources

                                    while (true) {
                                        v6 /* !! */  = var6_7.equals(hi.a("\u00e9", (Object)this, (long)512365434507538441L));
                                        if (!var4_4) ** GOTO lbl223
                                        if (v6 /* !! */ ) ** GOTO lbl222
                                        ** GOTO lbl225
                                        break;
                                    }
                                }
                                while (true) {
                                    switch (var14_5 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case -56614750: 
                                    }
                                    hi.a("G", (float)-1.0f, (long)681697085620050089L);
                                    hi.a("G", (boolean)true, (long)758395134657997950L);
                                    var14_5 /* !! */  = hi.a("G", (int)(es.d(8488, 224987159330191951L) * es.d(27639, 8745453843169816642L)), (int)es.d(18916, 1188429036226384256L), (long)834203424483934088L) - es.d(12976, 2836159942321465992L) - es.d(22424, 4708942058036268782L);
                                }
                            }
                            while (true) {
                                block82: {
                                    block81: {
                                        block80: {
                                            block79: {
                                                switch (var14_5 /* !! */ ) {
                                                    default: {
                                                        ** continue;
                                                    }
                                                    case 1204391984: {
                                                        var7_8 = (Map.Entry)hi.a("\u00a5", (Object)var6_7, (long)470012372636416268L);
                                                        var8_9 = hi.a("\u00a5", (Object)((vC)es.n("jP5Jbrj5GNBqGIdF", getValue(), (Map.Entry)var7_8)), (Object)new Object[0], (long)525436428419044985L);
                                                        cfr_temp_0 = var8_9 - 0.001f;
                                                        v7 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                        if (!var4_4) break block79;
                                                        if (v7 /* !! */  > 0) break;
                                                        break block80;
                                                    }
                                                    case 1204391983: {
                                                        ** continue;
                                                    }
                                                    case 1204391982: {
                                                        hi.a("G", (int)2, (int)0, (int)-1, (long)1066719768155535037L);
                                                        hi.a("G", (int)es.d(3601, 3462886638348916393L), (int)0, (long)682117342267402956L);
                                                        return null;
                                                    }
                                                }
                                                v7 /* !! */  = var14_5 /* !! */  = hi.a("G", (int)((es.d(31166, 7986793318754754761L) * es.d(26297, 338870855084915830L) ^ es.d(23504, 4840584610396209988L)) + es.d(4684, 4804432381215656813L)), (int)es.d(32712, 2200555640506393614L), (long)834203424483934088L) - es.d(9435, 5680042708896743053L);
                                            }
                                            if (var4_4) break block81;
                                        }
                                        var14_5 /* !! */  = (reference)(es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)es.d(25270, 3974572666936080483L), (int)es.d(1141, 5140808006321626343L)) * es.d(28340, 8767708427464389759L) * es.d(11101, 8617674093600895590L) ^ es.d(11755, 8489072547229857161L));
                                        if (!var4_4) break block82;
                                    }
                                    block45: while (true) {
                                        switch (var14_5 /* !! */ ) {
                                            default: {
                                                if (var4_4) break block45;
                                                ** GOTO lbl22
                                            }
                                            case -643877067: {
                                                ** continue;
                                            }
                                            case -643877065: {
                                                hi.a("G", (int)es.d(478, 5843126436287666673L), (long)1168948165950154490L);
                                                var14_5 /* !! */  = (reference)(es.d(7762, 7464340695574627628L) / 4 * es.d(963, 5178441579232844169L) + es.d(3423, 9151667950296520224L));
                                                continue block45;
                                            }
                                        }
                                        break;
                                    }
                                }
                                var14_5 /* !! */  = (reference)(es.d(21074, 5015940593793435846L) * es.d(25481, 8974818345771743957L) * es.d(16793, 4385199640262678711L) + es.d(24041, 5414942947875685726L) - es.d(31195, 3666379433653412632L) + es.d(7496, 4901586213694588177L));
                            }
                        }
                        block46: while (true) {
                            switch (var14_5 /* !! */ ) {
                                default: {
                                    v2 = hi.a("\u00a5", (Object)this, (Object)new Object[]{hi.a("\u00a5", (Object)var9_11, (Object)new Object[0], (long)874952544071855486L)}, (long)1106412819161412840L);
                                    var14_5 /* !! */  = (reference)((es.d(1654, 7744012948575968501L) - es.d(11205, 4148844676395528689L)) * es.d(26383, 2364837359983279982L) - es.d(11850, 5580337544278078974L));
                                    if (!var4_4) {
                                        break block46;
                                    }
                                    break block65;
                                }
                                case -1392583365: {
                                    v2 = "";
                                    if (var4_4) break block46;
                                    ** GOTO lbl35
                                }
                                case -1392583364: {
                                    hi.a("G", (int)-1, (long)1311780045343811872L);
                                    hi.a("G", (float)2.0f, (float)-1.0f, (int)es.d(6655, 8472383157657780504L), (long)803182559024134953L);
                                    var14_5 /* !! */  = (reference)(es.d(18793, 8416950771659870263L) / 3 - es.d(25447, 1268026165246179688L));
                                    continue block46;
                                }
                            }
                            break;
                        }
                        var14_5 /* !! */  = (reference)((es.d(31868, 2538842729723897175L) - es.d(960, 1390915658227669679L)) * es.d(24006, 3550132777457255882L) - es.d(321, 369669439762258802L));
                    }
                    switch (var14_5 /* !! */ ) {
                        case 2056382565: {
                            ** continue;
                        }
                    }
                    ** while (true)
                }
                block47: while (true) {
                    switch (var14_5 /* !! */ ) {
                        default: {
                            v4 /* !! */  = 0.0f;
                            var14_5 /* !! */  = (reference)((es.d(23130, 2175741701010621104L) ^ es.d(10643, 2300055739488399969L) ^ es.d(3798, 3714083426949879407L)) + es.d(22050, 2812166952303857207L) + es.d(392, 1417689988893301723L));
                            if (!var4_4) {
                                break block47;
                            }
                            break block66;
                        }
                        case 1706241554: {
                            v4 /* !! */  = (float)hi.a("\u00a5", (Object)((_j)var1_1), (Object)(" " + var11_13), (float)var2_2, (long)665434286926928221L);
                            if (var4_4) break block47;
                            ** GOTO lbl50
                        }
                        case 1706241555: {
                            hi.a("G", (long)1060921528960496445L);
                            var14_5 /* !! */  = (reference)(es.d(19742, 7827445746709173286L) / es.d(9211, 7013553097766763518L) + es.d(15494, 1276456694529451619L) - es.d(30720, 7541371758006149634L) + es.d(16011, 1243024857550677561L));
                            continue block47;
                        }
                    }
                    break;
                }
                var14_5 /* !! */  = (reference)((es.d(4998, 2534626767459339100L) ^ es.d(12020, 6767958250963006865L) ^ es.d(32590, 6303592965795718271L)) + es.d(364, 7186871617508563799L) + es.d(17201, 3937334687318612398L));
            }
            switch (var14_5 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1377215401: 
            }
            hi.a("G", (boolean)false, (float)-0.5f, (long)1038439073664936945L);
            return null;
        }
        block48: while (true) {
            switch (var14_5 /* !! */ ) {
                case 260146325: {
                    ** continue;
                }
                default: {
                    ** continue;
                }
                case 260146327: {
                    var8_10 = (n_)es.n("jP5Jbrj5GNBqGIdF", next(), (Iterator)var7_8);
                    hi.a("\u00a5", (Object)var6_7, (Object)hi.a("\u00a5", (Object)var8_10, (long)423804310028895217L), (long)615358212536192384L);
                    if (var4_4) ** GOTO lbl220
                    ** GOTO lbl83
                }
                case 260146324: {
                    ** continue;
                }
                case 260146323: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)795860636314569014L), (long)1321656001466046640L);
                    hi.a("\u00f2", (Object)this, (List)var6_7, (long)512365434507538441L);
                    if (!var4_4) {
                        return var5_6;
                    }
                    ** GOTO lbl227
                }
lbl220:
                // 1 sources

                var14_5 /* !! */  = (reference)(es.d(10458, 7487586072949223860L) * es.d(22512, 1927954707518230499L) + es.d(16844, 7851314787853441362L));
                if (var4_4) continue block48;
lbl222:
                // 2 sources

                v6 /* !! */  = hi.a("G", (int)((es.d(32142, 5433894072756381186L) ^ es.d(16688, 8167730324808866136L)) * es.d(21713, 2106064728630759394L)), (int)es.d(21197, 7457611171399141404L), (long)834203424483934088L) + es.d(18232, 4895053229379820865L);
lbl223:
                // 2 sources

                var14_5 /* !! */  = (reference)v6 /* !! */ ;
                if (var4_4) continue block48;
lbl225:
                // 2 sources

                var14_5 /* !! */  = (reference)((es.d(17277, 5898433097953941922L) / es.d(27504, 4647254018579641243L) ^ es.d(21330, 1307617203959990547L)) - es.d(20850, 265841578914450031L));
                if (var4_4) continue block48;
lbl227:
                // 2 sources

                var14_5 /* !! */  = hi.a("G", (int)((es.d(13239, 1658354097771768040L) ^ es.d(18499, 5515964959566566134L)) * es.d(30909, 494449897653477492L)), (int)es.d(5959, 1745753681381936396L), (long)834203424483934088L) + es.d(3288, 9169385609529219067L);
                continue block48;
                case 260146326: 
            }
            break;
        }
        return var5_6;
    }

    private es() {
        super(es.b(22949, -24851), 4.0f, 16.0f, 96.0f, 20.0f);
        this.d = hi.a("\u00a5", (Object)this, (Object)es.b(22964, -19862), (double)3.0, (double)0.0, (double)20.0, (double)0.5, this::lambda$new$0, (long)988474938581310011L);
        this.x = es.n("jP5Jbrj5GNBqGIdF", H(java.lang.String double double double double com.github.epsilon.yx ), (es)this, (String)es.b(22945, -7072), (double)2.0, (double)0.0, (double)20.0, (double)0.5, this::lambda$new$1);
        this.l = hi.a("\u00a5", (Object)this, (Object)es.b(22954, 435), (double)2.0, (double)0.0, (double)5.0, (double)0.5, this::lambda$new$2, (long)988474938581310011L);
        this.ka = hi.a("\u00a5", (Object)this, (Object)es.b(22957, -26633), (boolean)true, (long)1230617056439551805L);
        this.Q = hi.a("\u00a5", (Object)this, (Object)es.b(22948, 5837), (double)13.0, (double)8.0, (double)32.0, (double)1.0, (long)1077996338587307774L);
        this.kj = hi.a("\u00a5", (Object)this, (Object)es.b(22960, 5332), (boolean)true, (long)1230617056439551805L);
        String string = es.b(22966, -17537);
        CallSite callSite = hi.a("\u00e9", (Object)this, (long)1178990095831168438L);
        hi.a("G", (Object)callSite, (long)374764797691957710L);
        this.z = es.n("jP5Jbrj5GNBqGIdF", H(java.lang.String double double double double com.github.epsilon.yx ), (es)this, (String)string, (double)3.0, (double)0.1, (double)6.0, (double)0.1, ((Xn)((Object)callSite))::z);
        String string2 = es.b(22951, 10231);
        CallSite callSite2 = hi.a("\u00e9", (Object)this, (long)1178990095831168438L);
        hi.a("G", (Object)callSite2, (long)374764797691957710L);
        this.u = hi.a("\u00a5", (Object)this, (Object)string2, (int)2, (int)1, (int)5, (int)1, ((Xn)((Object)callSite2))::z, (long)958246524790962697L);
        this.kD = hi.a("\u00a5", (Object)this, (Object)es.b(22947, -25827), (double)100.0, (double)10.0, (double)1000.0, (double)10.0, this::lambda$new$3, (long)988474938581310011L);
        this.y = hi.a("\u00a5", (Object)this, (Object)es.b(22965, -16649), (double)0.2, (double)0.01, (double)1.0, (double)0.01, (long)1077996338587307774L);
        this.kq = es.n("jP5Jbrj5GNBqGIdF", M(java.lang.String boolean com.github.epsilon.yx ), (es)this, (String)es.b(22962, 32647), (boolean)true, this::lambda$new$4);
        this.ku = hi.a("\u00a5", (Object)this, (Object)es.b(22959, -3075), (Object)new Color(0, 0, 0, es.d(7761, 8874385032680162530L)), this::lambda$new$5, (long)1241661680830497550L);
        this.ks = hi.a("\u00a5", (Object)this, (Object)es.b(22967, -19069), (boolean)true, this::lambda$new$6, (long)1197648209052129808L);
        this.h = hi.a("\u00a5", (Object)this, (Object)es.b(22950, -15281), (double)9.0, (double)2.0, (double)32.0, (double)1.0, this::lambda$new$7, (long)988474938581310011L);
        this.E = es.n("jP5Jbrj5GNBqGIdF", V(java.lang.String E com.github.epsilon.yx ), (es)this, (String)es.b(22958, -12408), (Enum)((Object)hi.a("j", (long)919627862893990774L)), this::lambda$new$8);
        this.J = hi.a("\u00a5", (Object)this, (Object)es.b(22955, 6253), (double)100.0, (double)10.0, (double)1000.0, (double)10.0, this::lambda$new$9, (long)988474938581310011L);
        this.o = hi.a("\u00a5", (Object)this, (Object)es.b(22952, -29053), (Object)new Color(es.d(14367, 3372200817182499547L), es.d(14367, 3372200817182499547L), es.d(14367, 3372200817182499547L), es.d(839, 9182216531960257016L)), this::lambda$new$10, (long)1241661680830497550L);
        this.D = hi.a("\u00a5", (Object)this, (Object)es.b(22953, -26326), (Object)new Color(es.d(14367, 3372200817182499547L), 0, 0, es.d(28422, 5360092960588674503L)), this::lambda$new$11, (long)1241661680830497550L);
        this.t = es.n("jP5Jbrj5GNBqGIdF", J(java.lang.String E ), (es)this, (String)es.b(22956, 25478), (Enum)((Object)hi.a("j", (long)919627862893990774L)));
        this.T = hi.a("\u00a5", (Object)this, (Object)es.b(22963, 7391), (boolean)true, this::lambda$new$12, (long)1197648209052129808L);
        this.C = hi.a("\u00a5", (Object)this, (Object)es.b(22946, 26916), (int)es.d(27460, 9014880752662983141L), (int)1, (int)es.d(27083, 4834070986566906866L), (int)1, this::lambda$new$13, (long)958246524790962697L);
        this.W = hi.a("\u00a5", (Object)this, (Object)es.b(22971, -9742), (Object)hi.a("j", (long)1173447058378651714L), (boolean)false, this::lambda$new$14, (long)393916397130120306L);
        this.m = hi.a("\u00a5", (Object)this, (Object)es.b(22961, 14059), (Object)hi.a("j", (long)624057616205429839L), (boolean)false, this::lambda$new$15, (long)393916397130120306L);
        this.kQ = new HashMap<e, vC>();
        this.N = new HashMap<e, Float>();
        hi.a("\u00f2", (Object)this, new ArrayList(), (long)512365434507538441L);
        this.w = hi.a("G", _j::S, (long)906022743474534178L);
    }

    private boolean lambda$new$3() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
    }

    /*
     * Exception decompiling
     */
    private void N(Object[] var1_1) {
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
    private dI B(Object[] var1_1) {
        block28: {
            block29: {
                var2_2 = var1_1[0];
                var3_3 = ((Float)var1_1[1]).floatValue();
                var4_4 = Dl.S();
                var13_5 /* !! */  = es.d(10965, 3144974391845680112L) / es.d(2473, 3811259855323255461L) / es.d(15918, 7075013919416837313L) + es.d(21872, 7688911612263370199L) + es.d(15311, 2599220761477046782L);
                if (!var4_4) ** GOTO lbl-1000
                v0 /* !! */  = var13_5 /* !! */ ;
                if (!var4_4) ** GOTO lbl12
                switch (v0 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v0 /* !! */  = (int)hi.a("\u00a5", (Object)((List)var2_2), (long)417939159730395915L);
lbl12:
                        // 2 sources

                        var5_6 = new float[v0 /* !! */ ];
                        var6_7 = 0.0f;
                        var7_8 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)386083147116695688L), (long)789438897355831922L)), (long)371266768739483732L);
                        var8_9 = 0;
                        if (var4_4) break;
                        break block29;
                    }
                    case -677012555: {
                        throw null;
                    }
                }
                var13_5 /* !! */  = (es.d(28121, 6045440703067763939L) ^ es.d(4515, 7364800018353408632L)) + es.d(27852, 3708602529425012582L) - es.d(24920, 5890203677257775386L) + es.d(13155, 1700016356122388697L) - es.d(21558, 2578731488984960962L);
                if (var4_4) break block28;
                ** GOTO lbl29
            }
lbl24:
            // 2 sources

            while (true) {
                block31: {
                    block30: {
                        v1 /* !! */  = var8_9;
                        v2 /* !! */  = hi.a("\u00a5", (Object)((List)var2_2), (long)417939159730395915L);
                        if (!var4_4) break block30;
                        if (v1 /* !! */  < v2 /* !! */ ) break block31;
lbl29:
                        // 2 sources

                        v1 /* !! */  = hi.a("G", (int)es.d(22879, 2132376955703460719L), (int)es.d(16150, 3795700062905394284L), (long)834203424483934088L);
                        v2 /* !! */  = (CallSite)es.d(10795, 4619498833028510536L);
                    }
                    var13_5 /* !! */  = v1 /* !! */  ^ v2 /* !! */ ;
                    if (var4_4) break block28;
                }
                var13_5 /* !! */  = (es.d(9121, 8752616725408086354L) + es.d(9619, 7900319379534675674L)) * es.d(15992, 7165774494248002753L) ^ es.d(17054, 7960308944707918455L);
                break block28;
                break;
            }
lbl37:
            // 2 sources

            while (true) {
                block33: {
                    block32: {
                        var11_12 /* !! */  = (CallSite)v3 /* !! */ ;
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)795860636314569014L), (Object)hi.a("\u00a5", (Object)var9_10, (long)423804310028895217L), (Object)hi.a("G", (float)var11_12 /* !! */ , (long)1097085248186378937L), (long)1121879748672195632L);
                        var5_6[var8_9] = (float)var11_12 /* !! */ ;
                        cfr_temp_0 = hi.a("\u00a5", (Object)var9_10, (long)380809573685820132L) - 0.01f;
                        v4 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                        if (!var4_4) break block32;
                        if (v4 /* !! */  > 0) break block33;
                        v4 /* !! */  = (reference)((es.d(22428, 4957140135266421885L) ^ es.d(9360, 2828968613504810615L)) + es.d(28965, 1213333150338984372L));
                    }
                    var13_5 /* !! */  = (int)v4 /* !! */ ;
                    if (var4_4) ** GOTO lbl85
                }
                var13_5 /* !! */  = es.d(3113, 4662180635826345667L) - es.d(28645, 4636958126209939417L) - es.d(7927, 511767718958744862L);
                if (var4_4) ** GOTO lbl85
                ** GOTO lbl115
lbl54:
                // 2 sources

                while (true) {
                    ++var8_9;
                    if (!var4_4) {
                        return new dI(var5_6, var6_7);
                    }
                    ** GOTO lbl118
                    break;
                }
                break;
            }
        }
        while (true) {
            block34: {
                switch (var13_5 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1560368376: {
                        var9_10 = (n_)hi.a("\u00a5", (Object)((List)var2_2), (int)var8_9, (long)516183098926246296L);
                        var10_11 = var6_7;
                        var11_12 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", floatValue(), (Float)((Float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)795860636314569014L), (Object)hi.a("\u00a5", (Object)var9_10, (long)423804310028895217L), (Object)hi.a("G", (float)var10_11, (long)1097085248186378937L), (long)1241751088262622582L)));
                        var12_13 = var10_11 - var11_12 /* !! */ ;
                        cfr_temp_1 = es.n("jP5Jbrj5GNBqGIdF", abs(float ), (float)var12_13) - 0.1f;
                        v5 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                        if (!var4_4) ** GOTO lbl78
                        if (v5 <= 0) ** GOTO lbl77
                        ** GOTO lbl80
                    }
                    case -1560368377: {
                        throw null;
                    }
lbl77:
                    // 1 sources

                    v5 = hi.a("G", (int)es.d(10942, 4333774522201698587L), (int)es.d(30020, 1850551371651035084L), (long)834203424483934088L) + es.d(32079, 2187844384778691912L);
lbl78:
                    // 2 sources

                    var13_5 /* !! */  = (int)v5;
                    if (var4_4) break block34;
lbl80:
                    // 2 sources

                    var13_5 /* !! */  = (int)(hi.a("G", (int)(es.d(9782, 212184895993806166L) * es.d(24737, 5200636411276213245L)), (int)es.d(8281, 78085335807851276L), (long)834203424483934088L) + es.d(8814, 7673034876085697320L) - es.d(17241, 5282951491953531231L));
                    break block34;
                    case -1560368378: 
                }
                return new dI(var5_6, var6_7);
            }
            do {
                block36: {
                    block35: {
                        switch (var13_5 /* !! */ ) {
                            default: {
                                v3 /* !! */  = (float)(var11_12 /* !! */  + var12_13 * var7_8);
                                var13_5 /* !! */  = (int)(hi.a("G", (int)es.d(19447, 5287172428762321111L), (int)es.d(23615, 6130458547992593922L), (long)834203424483934088L) + es.d(20233, 1698638354003793489L));
                                if (!var4_4) {
                                    break;
                                }
                                break block35;
                            }
                            case -329487827: {
                                v3 /* !! */  = var10_11;
                                if (var4_4) break;
                                ** GOTO lbl37
                            }
                            case -329487828: {
                                var6_7 += var3_3 * hi.a("\u00a5", (Object)var9_10, (long)380809573685820132L);
                                if (var4_4) break block36;
                                ** GOTO lbl54
                            }
                            case -329487830: {
                                ** continue;
                            }
                            case -329487826: {
                                throw null;
                            }
                        }
                        var13_5 /* !! */  = (int)(hi.a("G", (int)es.d(2194, 6119105625268015585L), (int)es.d(6341, 4276160578642166771L), (long)834203424483934088L) + es.d(10300, 5215349734139818542L));
                    }
                    switch (var13_5 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -767095729: 
                    }
                    hi.a("G", (long)1255795479521008361L);
                    return null;
                }
                var13_5 /* !! */  = (es.d(26499, 4200237660708585246L) ^ es.d(10734, 5612268350811664810L)) + es.d(4322, 1938972560322808478L);
            } while (var4_4);
lbl118:
            // 2 sources

            var13_5 /* !! */  = (es.d(23362, 737124239464595666L) ^ es.d(21794, 6241193538193722756L)) + es.d(31991, 2268151996505302683L) - es.d(24861, 5728936735556680323L) + es.d(26650, 1011924118592139467L) - es.d(7365, 963643139514385838L);
        }
    }

    private boolean lambda$new$1() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
    }

    private static boolean lambda$render$0(Set set, e e2) {
        boolean bl = Dl.S();
        Object object = hi.a("\u00a5", (Object)set, (Object)e2, (long)1128025236213057684L);
        if (bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    private Color I(Object object, float f) {
        CallSite callSite = es.n("jP5Jbrj5GNBqGIdF", clamp(int int int ), (int)((int)((float)hi.a("\u00a5", (Object)((Color)object), (long)999912139159319168L) * hi.a("G", (float)f, (float)0.0f, (float)1.0f, (long)390336973585993938L))), (int)0, (int)es.d(3257, 8605507755476506049L));
        return new Color((int)hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L), (int)hi.a("\u00a5", (Object)((Color)object), (long)791634218836538619L), (int)hi.a("\u00a5", (Object)((Color)object), (long)505295769199362574L), (int)callSite);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void v(Object[] var1_1) {
        block26: {
            block27: {
                var2_2 = var1_1[0];
                var3_3 = var1_1[1];
                var4_4 = Dl.t();
                var13_5 /* !! */  = hi.a("G", (int)(es.d(30517, 224484219775790562L) - es.d(10409, 8781750722021815166L)), (int)es.d(26789, 2408785040127308236L), (long)834203424483934088L) + es.d(10467, 1945469787631612925L);
                if (!var4_4) break block27;
lbl7:
                // 2 sources

                while (true) {
                    v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)867445517361122361L), (long)789438897355831922L);
                    while (true) {
                        block28: {
                            var5_6 = hi.a("\u00a5", (Object)((Double)v0), (long)371266768739483732L);
                            var6_7 = (Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1333010226243749387L), (long)789438897355831922L);
                            var7_8 = es.n("jP5Jbrj5GNBqGIdF", iterator(), (List)((List)var3_3));
                            if (var4_4) break block28;
                            var13_5 /* !! */  = (reference)(es.d(9823, 5139629037835157359L) * es.d(8889, 3305655137258535629L) - es.d(29279, 3554028805986461981L));
                            if (!var4_4) break block26;
                            ** GOTO lbl22
                        }
lbl18:
                        // 2 sources

                        while (true) {
                            block30: {
                                block29: {
                                    v1 /* !! */  = hi.a("\u00a5", (Object)var7_8, (long)984088978567310565L);
                                    if (var4_4) break block29;
                                    if (v1 /* !! */  != false) break block30;
lbl22:
                                    // 2 sources

                                    v1 /* !! */  = var13_5 /* !! */  = (reference)((es.d(10187, 4762486469059443751L) + es.d(10562, 8979352011000804007L)) / es.d(2473, 3811259855323255461L) * es.d(28739, 6333950241154149322L) ^ es.d(27230, 4745394564691341401L));
                                }
                                if (!var4_4) break block26;
                            }
                            var13_5 /* !! */  = (reference)(es.d(8543, 8798008805990660389L) / es.d(17118, 4924909746511092266L) - es.d(4701, 6010932328688928784L));
                            break block26;
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl28:
                // 2 sources

                while (true) {
                    v2 = var10_11;
                    v3 /* !! */  = hi.a("\u00a5", (Object)var8_9, (long)545766742407236658L);
                    if (var4_4) ** GOTO lbl85
                    if (v2 >= v3 /* !! */ ) ** GOTO lbl83
                    ** GOTO lbl87
                    break;
                }
lbl34:
                // 2 sources

                while (true) {
                    v4 = new Object[11];
                    v4[10] = (int)hi.a("\u00a5", (Object)var8_9, (long)545766742407236658L);
                    v4[9] = var9_10;
                    v4[8] = hi.a("\u00a5", (Object)var8_9, (long)473306292828969671L);
                    v4[7] = hi.a("\u00a5", (Object)var8_9, (long)1042325500829534786L);
                    v4[6] = var6_7;
                    v4[5] = Float.valueOf((float)var5_6);
                    v4[4] = Float.valueOf(0.0f);
                    v4[3] = Float.valueOf((float)hi.a("\u00a5", (Object)var8_9, (long)1090745703527116091L));
                    v4[2] = Float.valueOf((float)hi.a("\u00a5", (Object)var8_9, (long)996229149080624171L));
                    v4[1] = Float.valueOf((float)es.n("jP5Jbrj5GNBqGIdF", E6(), (u7)var8_9));
                    v4[0] = Float.valueOf((float)hi.a("\u00a5", (Object)var8_9, (long)1038396558164732124L));
                    hi.a("\u00a5", (Object)((zU)var2_2), (Object)v4, (long)362552523947415887L);
                    if (var4_4) {
                        return;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
            while (true) {
                switch (var13_5 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -2089648654: 
                }
                v0 = es.n("jP5Jbrj5GNBqGIdF", t());
                if (var4_4) ** continue;
                var13_5 /* !! */  = (reference)((es.d(2280, 7308953297815228648L) ^ es.d(23039, 2200016510740333074L) ^ es.d(4891, 60166404827007207L)) / 3 + es.d(25766, 8432993816533155729L));
            }
        }
        block19: while (true) {
            block31: {
                switch (var13_5 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -285737402: {
                        var8_9 = (u7)hi.a("\u00a5", (Object)var7_8, (long)470012372636416268L);
                        var9_10 = new float[es.n("jP5Jbrj5GNBqGIdF", Ej(), (u7)var8_9) * 3];
                        var10_11 = 0;
                        if (!var4_4) ** GOTO lbl81
                        ** GOTO lbl28
                    }
                    case -285737401: {
                        hi.a("G", (long)1115568667421921156L);
                        hi.a("G", (int)es.d(2057, 2674750728077169019L), (long)453709928243117811L);
                        var13_5 /* !! */  = (reference)((es.d(276, 7971041985416453097L) / es.d(2473, 3811259855323255461L) - es.d(21612, 5702510240774261763L)) * es.d(15267, 886224422951870810L) ^ es.d(18208, 1828224634521132993L));
                        continue block19;
                    }
lbl81:
                    // 1 sources

                    var13_5 /* !! */  = hi.a("G", (int)es.d(13237, 5680538739642132899L), (int)es.d(27800, 6276628471905302040L), (long)834203424483934088L) + es.d(23666, 6790227895203399421L);
                    if (!var4_4) break block31;
lbl83:
                    // 2 sources

                    v2 = es.d(3283, 8372865185251054660L) / es.d(27071, 8847748210050446310L) - es.d(31129, 7302763461202813283L) - es.d(15081, 6361882854968483918L);
                    v3 /* !! */  = (CallSite)es.d(13389, 8773948576586165921L);
lbl85:
                    // 2 sources

                    var13_5 /* !! */  = (reference)(v2 + v3 /* !! */ );
                    if (!var4_4) break block31;
lbl87:
                    // 2 sources

                    var13_5 /* !! */  = (reference)((hi.a("G", (int)es.d(11326, 5375410313259448246L), (int)es.d(13893, 7606221760661450334L), (long)834203424483934088L) - es.d(28753, 7626926959133108981L) ^ es.d(23178, 2402959583335809345L)) + es.d(28951, 8648683154662599156L));
                    break block31;
                    case -285737399: 
                }
                return;
            }
            do {
                switch (var13_5 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1209543259: {
                        var11_12 = hi.a("\u00a5", (Object)var8_9, (long)1300708930084764139L)[var10_11];
                        var12_13 = var10_11 * 3;
                        var9_10[var12_13] = (float)hi.a("\u00a5", (Object)var11_12, (long)634502724407806770L) / 255.0f;
                        var9_10[var12_13 + 1] = (float)hi.a("\u00a5", (Object)var11_12, (long)791634218836538619L) / 255.0f;
                        var9_10[var12_13 + 2] = (float)hi.a("\u00a5", (Object)var11_12, (long)505295769199362574L) / 255.0f;
                        ++var10_11;
                        if (!var4_4) break;
                        ** GOTO lbl34
                    }
                    case 1209543262: {
                        ** continue;
                    }
                    case 1209543260: {
                        return;
                    }
                }
                var13_5 /* !! */  = hi.a("G", (int)es.d(7069, 4920984024997577696L), (int)es.d(344, 3444375127602420490L), (long)834203424483934088L) + es.d(3340, 2577149887972201744L);
            } while (!var4_4);
lbl112:
            // 2 sources

            var13_5 /* !! */  = (reference)(es.d(17579, 840855226584080253L) * es.d(1600, 5903628776891800779L) - es.d(2265, 473486967823421861L));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$13() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.S();
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
                if (!bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)786181053306409187L), (long)789438897355831922L))), (long)1000026253634408124L);
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
    private boolean lambda$new$7() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)779354614032407436L), (long)789438897355831922L))), (long)1000026253634408124L);
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
    private Color v(Object var1_1, Object var2_2, long var3_3) {
        block11: {
            block10: {
                block9: {
                    var5_4 = Dl.S();
                    var8_5 = hi.a("G", (int)(es.d(27817, 2698561334110434809L) - es.d(22825, 7194982329211453853L)), (int)es.d(28786, 6110201744099649658L), (long)834203424483934088L) * es.d(31353, 7133365414011216241L) ^ es.d(17377, 3306034533579134982L);
                    if (!var5_4) ** GOTO lbl-1000
                    switch (var8_5) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var6_6 = (double)((hi.a("G", (long)658960450018995719L) + var3_3) % es.e(17319, 6214729890155116976L)) / 2000.0;
                            cfr_temp_0 = var6_6 - 1.0;
                            v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (!var5_4) break block9;
                            if (v0 <= 0) break;
                            break block10;
                        }
                        case 738802299: {
                            throw null;
                        }
                    }
                    v0 = es.d(28253, 7701206964611298837L) / es.d(15952, 7380463911934485655L) / es.d(3717, 3635705080450536851L) + es.d(28791, 7030283080736025175L);
                }
                var8_5 = (int)v0;
                if (var5_4) break block11;
            }
            var8_5 = es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)es.d(29414, 2301374613036509350L), (int)es.d(16876, 8604315274351647438L)) ^ es.d(8681, 3399436944242735940L);
            if (!var5_4) ** GOTO lbl33
        }
        block7: while (true) {
            switch (var8_5) {
                default: {
                    var6_6 = 1.0 - var6_6 % 1.0;
                    if (!var5_4) {
                        return hi.a("G", (Object)((Color)var1_1), (Object)((Color)var2_2), (float)((float)var6_6), (long)1040237525350741921L);
                    }
                    ** GOTO lbl33
                }
                case 1444307578: {
                    throw null;
                }
lbl33:
                // 2 sources

                var8_5 = es.d(25769, 929682513839537905L) / es.d(16355, 6881960157086377211L) / es.d(2473, 3811259855323255461L) + es.d(23703, 221036808309376197L);
                continue block7;
                case 1444307577: 
            }
            break;
        }
        return hi.a("G", (Object)((Color)var1_1), (Object)((Color)var2_2), (float)((float)var6_6), (long)1040237525350741921L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void c(Object[] var1_1) {
        block15: {
            var2_2 = var1_1[0];
            var3_3 = Dl.t();
            var6_4 /* !! */  = (es.d(17717, 3799736129737662414L) ^ es.d(7882, 7182882021109253817L)) / 5 - es.d(5979, 2082455947249536546L);
            if (var3_3) ** GOTO lbl-1000
            switch (var6_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var4_5 = hi.a("\u00a5", (Object)((List)var2_2), (long)1240653736693366367L);
                    if (!var3_3) break;
                    break block15;
                }
                case -1915089871: {
                    throw null;
                }
            }
            var6_4 /* !! */  = (es.d(16900, 4060623379270408913L) + es.d(18640, 6643313205581090958L) - es.d(25004, 4292040467647543795L)) * es.d(13258, 2231856659005500386L) + es.d(17241, 6372199163145361741L);
            if (!var3_3) ** GOTO lbl28
            ** GOTO lbl22
        }
        block8: while (true) {
            block18: {
                block17: {
                    block16: {
                        v0 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", hasNext(), (Iterator)var4_5);
                        if (var3_3) break block16;
                        if (v0 /* !! */  != false) break block17;
lbl22:
                        // 2 sources

                        v0 /* !! */  = (CallSite)(es.d(983, 5096552342602471509L) + es.d(30048, 4018804827625139468L) - es.d(9322, 1833462438128811206L) - es.d(9192, 7805089601198455498L) ^ es.d(14918, 6630862499979255936L));
                    }
                    var6_4 /* !! */  = (int)v0 /* !! */ ;
                    if (!var3_3) break block18;
                }
                var6_4 /* !! */  = es.d(3396, 2294892416767153802L) / es.d(27504, 4647254018579641243L) ^ es.d(3504, 5801947942770759567L);
            }
            block9: while (true) {
                switch (var6_4 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case -16938876: {
                        var5_6 = (u7)hi.a("\u00a5", (Object)var4_5, (long)470012372636416268L);
                        v1 = new Object[9];
                        v1[8] = (int)hi.a("\u00a5", (Object)var5_6, (long)545766742407236658L);
                        v1[7] = hi.a("\u00a5", (Object)var5_6, (long)473306292828969671L);
                        v1[6] = hi.a("\u00a5", (Object)var5_6, (long)1042325500829534786L);
                        v1[5] = Float.valueOf((float)hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)771995081308692417L), (long)789438897355831922L)), (long)1260538186742955956L));
                        v1[4] = Float.valueOf(0.0f);
                        v1[3] = Float.valueOf((float)hi.a("\u00a5", (Object)var5_6, (long)1090745703527116091L));
                        v1[2] = Float.valueOf((float)hi.a("\u00a5", (Object)var5_6, (long)996229149080624171L));
                        v1[1] = Float.valueOf((float)hi.a("\u00a5", (Object)var5_6, (long)497274501924143973L));
                        v1[0] = Float.valueOf((float)hi.a("\u00a5", (Object)var5_6, (long)1038396558164732124L));
                        hi.a("\u00a5", (Object)hi.a("j", (long)889421552268440488L), (Object)v1, (long)871990790695770602L);
                        if (var3_3) {
                            return;
                        }
                        ** GOTO lbl52
                    }
                    case -16938873: {
                        throw null;
                    }
lbl52:
                    // 1 sources

                    var6_4 /* !! */  = (es.d(5494, 8296064847558856360L) + es.d(2461, 6635144562702766508L) - es.d(9570, 8859629085296098655L)) * es.d(28093, 4847689086295914145L) + es.d(17559, 2927507003027922912L);
                    continue block9;
                    case -16938875: 
                }
                break;
            }
            break;
        }
    }

    private static boolean lambda$render$1(Set set, e e2) {
        boolean bl = Dl.S();
        Object object = hi.a("\u00a5", (Object)set, (Object)e2, (long)1128025236213057684L);
        if (bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    private boolean lambda$new$6() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
    }

    private boolean lambda$new$4() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private List Y(Object[] var1_1) {
        var2_2 = var1_1[0];
        var3_3 = Dl.S();
        var19_4 /* !! */  = es.d(18215, 888215456809917446L) - es.d(4748, 2026940344080255052L) + es.d(4286, 4733584801745685381L);
        if (var3_3) {
            switch (var19_4 /* !! */ ) {
                case -2109247575: {
                    hi.a("G", (long)1318921989870229166L);
                    hi.a("G", (long)1005006586280819563L);
                    break;
                }
            }
        }
        var4_5 = new ArrayList<E>((int)((hi.a("\u00a5", (Object)((List)var2_2), (long)417939159730395915L) + es.d(17928, 2468196140425813493L) - true) / es.d(20885, 6023852260970433077L)));
        var5_6 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1026756793792603186L), (long)789438897355831922L)), (long)1283122622052954325L);
        var7_7 = 0;
        if (var3_3) ** GOTO lbl115
lbl17:
        // 2 sources

        while (true) {
            v0 = var7_7;
            v1 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", size(), (List)((List)var2_2));
            if (!var3_3) ** GOTO lbl119
            if (v0 >= v1 /* !! */ ) ** GOTO lbl117
            ** GOTO lbl121
            break;
        }
lbl23:
        // 2 sources

        while (true) {
            v2 = var16_16;
            v3 /* !! */  = var8_8;
            if (!var3_3) ** GOTO lbl65
            if (v2 >= v3 /* !! */ ) ** GOTO lbl63
            ** GOTO lbl67
            break;
        }
lbl29:
        // 3 sources

        while (true) {
            v4 = var14_14 /* !! */  == var12_12 /* !! */  ? 0 : (var14_14 /* !! */  > var12_12 /* !! */  ? 1 : -1);
            if (!var3_3) ** GOTO lbl127
            if (v4 <= 0) ** GOTO lbl126
            ** GOTO lbl129
            break;
        }
lbl34:
        // 2 sources

        while (true) {
            var7_7 += 64;
            if (var3_3) ** GOTO lbl142
            return var4_5;
        }
lbl-1000:
        // 5 sources

        {
            block25: {
                switch (var19_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 65118974: {
                        var8_8 = hi.a("G", (int)es.d(20885, 6023852260970433077L), (int)(es.n("jP5Jbrj5GNBqGIdF", size(), (List)((List)var2_2)) - var7_7), (long)476721548361853495L);
                        var9_9 = new float[var8_8 * 4];
                        var10_10 = new float[var8_8];
                        var11_11 = new Color[var8_8];
                        var12_12 /* !! */  = Infinityf;
                        var13_13 /* !! */  = Infinityf;
                        var14_14 /* !! */  = -Infinityf;
                        var15_15 /* !! */  = -Infinityf;
                        var16_16 = 0;
                        if (var3_3) ** GOTO lbl61
                        ** GOTO lbl23
                    }
                    case 65118972: {
                        hi.a("G", (long)1186314902226853278L);
                        hi.a("G", (double)-0.5, (long)653179046978634595L);
                        var19_4 /* !! */  = es.d(25956, 7809132061026500543L) * es.d(21434, 7477221528441882882L) ^ es.d(29293, 1508779308759165411L) ^ es.d(3487, 7728735842193987332L);
                        continue block20;
                    }
lbl61:
                    // 1 sources

                    var19_4 /* !! */  = es.d(32506, 842984746621412882L) / es.d(31354, 2850607641924248338L) - es.d(28920, 2670947134896679436L);
                    if (var3_3) break block25;
lbl63:
                    // 2 sources

                    v2 = es.d(2543, 2688759468907450799L) * es.d(31607, 8724274484584718820L) * es.d(859, 191362748218890559L) * es.d(12800, 4926367957747100043L) + es.d(36, 6471771445991070348L);
                    v3 /* !! */  = (CallSite)es.d(21958, 4534759390600891948L);
lbl65:
                    // 2 sources

                    var19_4 /* !! */  = v2 - v3 /* !! */ ;
                    if (var3_3) break block25;
lbl67:
                    // 2 sources

                    var19_4 /* !! */  = (int)(es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)(es.d(22029, 41421198348520834L) / es.d(15242, 7779352603937792137L)), (int)es.d(18656, 6851740413806448775L)) - es.d(19940, 5552416485502424511L) - es.d(16801, 4303319363156613368L));
                    break block25;
                    case 65118973: 
                }
                return var4_5;
            }
            do lbl-1000:
            // 7 sources

            {
                block30: {
                    block29: {
                        block27: {
                            block28: {
                                block26: {
                                    switch (var19_4 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 620160702: {
                                            var17_17 = (v6)hi.a("\u00a5", (Object)((List)var2_2), (int)(var7_7 + var16_16), (long)516183098926246296L);
                                            var18_18 = var16_16 * 4;
                                            var9_9[var18_18] = (float)hi.a("\u00a5", (Object)var17_17, (long)844970894639470288L);
                                            var9_9[var18_18 + 1] = (float)hi.a("\u00a5", (Object)var17_17, (long)1317173955808843309L);
                                            var9_9[var18_18 + 2] = (float)hi.a("\u00a5", (Object)var17_17, (long)570748422758692752L);
                                            var9_9[var18_18 + 3] = (float)hi.a("\u00a5", (Object)var17_17, (long)1281772845863858816L);
                                            v5 = new Object[2];
                                            v5[1] = (long)var5_6;
                                            v5[0] = var7_7 + var16_16;
                                            var11_11[var16_16] = hi.a("\u00a5", (Object)this, (Object)v5, (long)894333581620785356L);
                                            var12_12 /* !! */  = (float)hi.a("G", (float)var12_12 /* !! */ , (float)hi.a("\u00a5", (Object)var17_17, (long)844970894639470288L), (long)971000971621905228L);
                                            var13_13 /* !! */  = (float)hi.a("G", (float)var13_13 /* !! */ , (float)hi.a("\u00a5", (Object)var17_17, (long)1317173955808843309L), (long)971000971621905228L);
                                            var14_14 /* !! */  = (float)hi.a("G", (float)var14_14 /* !! */ , (float)(hi.a("\u00a5", (Object)var17_17, (long)844970894639470288L) + hi.a("\u00a5", (Object)var17_17, (long)570748422758692752L)), (long)1021203527991582354L);
                                            var15_15 /* !! */  = (float)hi.a("G", (float)var15_15 /* !! */ , (float)(es.n("jP5Jbrj5GNBqGIdF", EB(), (v6)var17_17) + es.n("jP5Jbrj5GNBqGIdF", EG(), (v6)var17_17)), (long)1021203527991582354L);
                                            ++var16_16;
                                            if (var3_3) break block26;
                                            ** GOTO lbl29
                                        }
                                        case 620160700: {
                                            ** GOTO lbl29
                                        }
                                        case 620160705: {
                                            v6 = var15_15 /* !! */  == var13_13 /* !! */  ? 0 : (var15_15 /* !! */  > var13_13 /* !! */  ? 1 : -1);
                                            if (!var3_3) break block27;
                                            if (v6 <= 0) break block28;
                                            break block29;
                                        }
                                        case 620160704: {
                                            hi.a("\u00a5", var4_5, (Object)new u7(var12_12 /* !! */ , var13_13 /* !! */ , var14_14 /* !! */  - var12_12 /* !! */ , var15_15 /* !! */  - var13_13 /* !! */ , var9_9, var10_10, var11_11, (int)var8_8), (long)615358212536192384L);
                                            if (var3_3) break block30;
                                            ** GOTO lbl34
                                        }
                                        case 620160706: {
                                            ** continue;
                                        }
                                        case 620160703: {
                                            es.n("jP5Jbrj5GNBqGIdF", w());
                                            if (!var3_3) break;
                                            ** continue;
                                        }
                                    }
lbl115:
                                    // 2 sources

                                    var19_4 /* !! */  = ((es.d(22277, 3470586761729478597L) + es.d(99, 8023540882009643754L)) / es.d(26201, 5164924062461181412L) - es.d(14270, 3504284586695684091L) ^ es.d(32074, 7208628894892926677L)) + es.d(12765, 3603196371532933255L);
                                    if (var3_3) continue block20;
lbl117:
                                    // 2 sources

                                    v0 = es.d(885, 7355905884342245447L) - es.d(27682, 8786045969078203477L);
                                    v1 /* !! */  = (CallSite)es.d(28259, 7171052851315554084L);
lbl119:
                                    // 2 sources

                                    var19_4 /* !! */  = v0 - v1 /* !! */ ;
                                    if (var3_3) continue block20;
lbl121:
                                    // 2 sources

                                    var19_4 /* !! */  = es.d(3649, 1114828517079274989L) * es.d(609, 1031453954674645697L) + es.d(13582, 4830638814975716652L) - es.d(6749, 5950231783633731982L);
                                    continue block20;
                                }
                                var19_4 /* !! */  = es.d(30954, 3583348505448915579L) / es.d(17118, 4924909746511092266L) - es.d(17487, 7105769610313015138L);
                                if (var3_3) ** GOTO lbl-1000
lbl126:
                                // 2 sources

                                v4 = (es.d(27610, 809192177336497091L) ^ es.d(12401, 7455760787192474280L)) - es.d(12392, 3678155080559323215L);
lbl127:
                                // 2 sources

                                var19_4 /* !! */  = (int)v4;
                                if (var3_3) ** GOTO lbl-1000
lbl129:
                                // 2 sources

                                var19_4 /* !! */  = hi.a("G", (int)hi.a("G", (int)es.d(26909, 2940130879089684748L), (int)es.d(13680, 1377222382486875615L), (long)834203424483934088L), (int)es.d(1548, 4349775465841417218L), (long)834203424483934088L) - es.d(18119, 1308417108920015941L) ^ es.d(9177, 229212851140754367L);
                                if (var3_3) ** GOTO lbl-1000
                            }
                            v6 = (es.d(28379, 6730607093974022030L) ^ es.d(13471, 7097598187182845582L)) - es.d(17777, 3249392129751555852L);
                        }
                        var19_4 /* !! */  = (int)v6;
                        if (var3_3) ** GOTO lbl-1000
                    }
                    var19_4 /* !! */  = es.d(12179, 7549196630926882638L) ^ es.d(20191, 2887285490049782854L) ^ es.d(18470, 8420201171804000939L);
                    if (var3_3) ** GOTO lbl-1000
                }
                var19_4 /* !! */  = (es.d(28379, 6730607093974022030L) ^ es.d(13471, 7097598187182845582L)) - es.d(17777, 3249392129751555852L);
            } while (var3_3);
lbl142:
            // 2 sources

            var19_4 /* !! */  = ((es.d(5666, 5188735911714049150L) + es.d(21759, 80882699557900032L)) / es.d(32133, 4396395990465750563L) - es.d(4339, 2380157311917378014L) ^ es.d(2479, 239536764145324726L)) + es.d(30030, 2412517402633154191L);
            ** while (true)
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$11() {
        Object object;
        block5: {
            boolean bl;
            block6: {
                block4: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
                    if (bl) break block4;
                    if (object == false) break block5;
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)779354614032407436L), (long)789438897355831922L))), (long)1000026253634408124L);
                }
                if (bl) break block6;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503779284687127672L), (Object)hi.a("j", (long)759653898638966483L), (long)511460060498514638L);
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
    private Color C(Object[] var1_1) {
        block28: {
            block30: {
                block29: {
                    var4_2 = (Integer)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    var5_4 = Dl.t();
                    var6_5 /* !! */  = hi.a("G", (int)(es.d(23357, 1886806621475340520L) - es.d(18483, 5959952867192345180L) - es.d(6869, 7109952859875721317L) - es.d(15043, 4155950181560246367L)), (int)es.d(23604, 8846377514395043602L), (long)834203424483934088L) + es.d(7109, 1731557383870333818L);
                    if (!var5_4) ** GOTO lbl28
                    block17: while (true) {
                        block32: {
                            block31: {
                                v0 /* !! */  = hi.a("\u00a5", (Object)((DW)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503779284687127672L), (long)789438897355831922L)), (long)532669071872144130L);
                                if (var5_4) break block31;
                                switch (v0 /* !! */ ) {
                                    case 0: {
                                        var6_5 /* !! */  = (CallSite)(hi.a("G", (int)es.d(6495, 5449556573401924495L), (int)es.d(12225, 8843085680098866875L), (long)834203424483934088L) ^ es.d(17843, 6638732886285164229L));
                                        if (!var5_4) break block32;
                                    }
                                    case 1: {
                                        var6_5 /* !! */  = (CallSite)(hi.a("G", (int)(es.d(10736, 9005209593688355824L) ^ es.d(10727, 7297342766467543392L)), (int)es.d(14952, 1735198109802586579L), (long)834203424483934088L) - es.d(1851, 6458900395576614687L) ^ es.d(31816, 5587199109926266116L));
                                        if (!var5_4) break block32;
                                    }
                                    case 2: {
                                        var6_5 /* !! */  = (CallSite)(es.d(21864, 1298150633402503008L) ^ es.d(19713, 3122085845253952860L) ^ es.d(7050, 4900490326201680650L));
                                        if (!var5_4) break block32;
                                    }
                                    case 3: {
                                        var6_5 /* !! */  = (CallSite)((es.d(18568, 1522831958710653860L) - es.d(6565, 3132892977823531238L) ^ es.d(18095, 8084237080560705106L)) - es.d(12467, 7026168431230707804L));
                                        if (!var5_4) ** break;
                                        break;
                                    }
                                    {
                                    }
                                }
                                v0 /* !! */  = (CallSite)(es.d(1904, 6855628930041733080L) + es.d(29244, 7787164486518777933L) + es.d(6243, 577321856512311373L));
                            }
                            var6_5 /* !! */  = v0 /* !! */ ;
                        }
                        switch (var6_5 /* !! */ ) {
                            default: {
                                continue block17;
                            }
                            case 1375749028: {
                                throw new MatchException(null, null);
                            }
                            case 1375749026: {
                                v1 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var4_2}, (long)1184153232512897776L);
                                var6_5 /* !! */  = (CallSite)(es.d(30340, 8066404780094959179L) / es.d(11811, 3245928198570702161L) * es.d(24736, 6574168701875764092L) - es.d(13569, 5043558924199063122L));
                                if (var5_4) {
                                    break block17;
                                }
                                break block28;
                            }
                            case 1375749032: {
                                v1 = es.n("jP5Jbrj5GNBqGIdF", v(java.lang.Object java.lang.Object long ), (es)this, (Object)((Color)es.n("jP5Jbrj5GNBqGIdF", z(), (DV)hi.a("\u00e9", (Object)this, (long)1333010226243749387L))), (Object)((Color)es.n("jP5Jbrj5GNBqGIdF", z(), (DV)hi.a("\u00e9", (Object)this, (long)623092294311383695L))), (long)((long)var4_2 * var2_3));
                                break block17;
                            }
                            case 1375749031: {
                                v1 = hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1333010226243749387L), (long)789438897355831922L)), (Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{(Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1333010226243749387L), (long)789438897355831922L)}, (long)1170753145577908550L), (long)((long)var4_2 * var2_3), (long)1016953385461643557L);
                                break block29;
                            }
                            case 1375749029: {
                                v1 = (Color)es.n("jP5Jbrj5GNBqGIdF", z(), (DV)hi.a("\u00e9", (Object)this, (long)1333010226243749387L));
                                if (var5_4) {
                                    return v1;
                                }
                                break block30;
                            }
                            case 1375749027: {
                                throw null;
                            }
                        }
                        break;
                    }
                    var6_5 /* !! */  = (CallSite)(es.d(14728, 924727418075177850L) / es.d(27504, 4647254018579641243L) * es.d(27458, 4336745126001521160L) - es.d(19069, 4105350532136046954L));
                    if (!var5_4) break block28;
                }
                var6_5 /* !! */  = (CallSite)(es.d(14728, 924727418075177850L) / es.d(27504, 4647254018579641243L) * es.d(27458, 4336745126001521160L) - es.d(19069, 4105350532136046954L));
                if (!var5_4) break block28;
            }
            var6_5 /* !! */  = (CallSite)(es.d(14728, 924727418075177850L) / es.d(27504, 4647254018579641243L) * es.d(27458, 4336745126001521160L) - es.d(19069, 4105350532136046954L));
        }
        switch (var6_5 /* !! */ ) {
            default: {
                return v1;
            }
            case 344697668: 
        }
        return null;
    }

    private boolean lambda$new$2() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private String y(Object[] var1_1) {
        block15: {
            block16: {
                block14: {
                    var2_2 = var1_1[0];
                    var3_3 = Dl.S();
                    var4_4 /* !! */  = (es.d(10956, 197903045788004775L) ^ es.d(31019, 876304271139545376L)) + es.d(4729, 1444183643611514985L);
                    if (var3_3) break block14;
lbl6:
                    // 2 sources

                    while (true) {
                        if ((String)var2_2 == null) {
                            var4_4 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)hi.a("G", (int)(es.d(26687, 4041935421878022157L) ^ es.d(10756, 4227533854683722046L)), (int)es.d(16913, 7256912454651877685L), (long)834203424483934088L), (int)es.d(27652, 4290095172407277095L)) ^ es.d(31627, 1602948276765991281L);
                            if (var3_3) break block14;
                        }
                        var4_4 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)es.d(14864, 8965548582406414874L), (int)es.d(15665, 2143508224368961432L)) * es.d(25354, 310983769625344219L) ^ es.d(6303, 7193092824848909231L);
                        if (var3_3) break block14;
                        ** GOTO lbl39
                        break;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        v0 = "";
                        var4_4 /* !! */  = (es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)es.d(19930, 1368803109355755032L), (int)es.d(17032, 4390360565733660714L)) ^ es.d(26002, 1853045053042868140L)) * es.d(24037, 6737746211581855737L) / es.d(16355, 6881960157086377211L) + es.d(29713, 1565952414978879012L);
                        if (var3_3) break block15;
                        break block16;
                        break;
                    }
                }
                block11: while (true) {
                    block18: {
                        block17: {
                            switch (var4_4 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case -2071089147: {
                                    v1 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", isBlank(), (String)((String)var2_2));
                                    if (!var3_3) break block17;
                                    if (v1 /* !! */  == false) break;
                                    break block18;
                                }
                                case -2071089149: {
                                    ** GOTO lbl13
                                }
                                case -2071089151: {
                                    v0 = (String)var2_2;
                                    if (var3_3) break block11;
                                    return v0;
                                }
                                case -2071089150: {
                                    hi.a("G", (long)919703241060757748L);
                                    ** continue;
                                }
                            }
lbl39:
                            // 2 sources

                            v1 /* !! */  = (CallSite)(((es.d(24372, 6963750814376657921L) ^ es.d(10340, 1832679996634559390L)) * es.d(5704, 885556412792032993L) ^ es.d(5973, 753532157620342639L)) + es.d(3434, 8053247738899420452L));
                        }
                        var4_4 /* !! */  = (int)v1 /* !! */ ;
                        if (var3_3) continue;
                    }
                    var4_4 /* !! */  = hi.a("G", (int)hi.a("G", (int)(es.d(30630, 8644880728097861316L) ^ es.d(11910, 1139322892047152587L)), (int)es.d(5330, 5385258682449448060L), (long)834203424483934088L), (int)es.d(6120, 2485057340010647201L), (long)834203424483934088L) ^ es.d(16763, 6834502477016111900L);
                }
            }
            var4_4 /* !! */  = (hi.a("G", (int)es.d(24036, 2754221747078628570L), (int)es.d(29779, 1830203746054417462L), (long)834203424483934088L) ^ es.d(5051, 1070222448601811775L)) * es.d(15969, 1979624014797366309L) / es.d(16355, 6881960157086377211L) + es.d(28879, 379043116365392775L);
        }
        block12: while (true) {
            switch (var4_4 /* !! */ ) {
                case -861386407: {
                    hi.a("G", (long)919703241060757748L);
                    var4_4 /* !! */  = es.d(20426, 3546868519230575916L) - es.d(25749, 5619681583734931447L) + es.d(32762, 7927351934046381402L) - es.d(29166, 5230681099009206493L) ^ es.d(24713, 6484283791130867967L);
                    continue block12;
                }
            }
            break;
        }
        return v0;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void O(Object var1_1, Object var2_2, float var3_3, float var4_4, float var5_5, Object var6_6, float var7_7) {
        var8_8 = Dl.t();
        var14_9 /* !! */  = es.d(7124, 1581973346580414678L) * es.d(22044, 6217169063209831659L) + es.d(31314, 7646828623323275436L);
        if (var8_8) ** GOTO lbl-1000
        switch (var14_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var9_10 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)522526848323788392L), (long)789438897355831922L)), (long)371266768739483732L);
                var10_11 = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1250924675837899561L), (long)789438897355831922L)), (long)1260538186742955956L);
                v0 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1178990095831168438L), (long)789438897355831922L)), (long)1000026253634408124L);
                if (var8_8) ** GOTO lbl66
                if (v0 /* !! */  == false) ** GOTO lbl65
                ** GOTO lbl68
            }
            case 1533473431: {
                return;
            }
        }
lbl14:
        // 2 sources

        while (true) {
            hi.a("\u00a5", (Object)((zU)var1_1), (Object)hi.a("\u00e9", (Object)((n_)var2_2), (long)414894262663300713L), (float)var3_3, (float)var4_4, (float)var5_5, (Object)((Color)var6_6), (long)487875072643634565L);
            v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((n_)var2_2), (long)839643879083142689L), (long)361382094905603987L);
            if (var8_8) ** GOTO lbl73
            if (v1 /* !! */  != false) ** GOTO lbl72
            ** GOTO lbl75
            break;
        }
lbl20:
        // 2 sources

        while (true) {
            hi.a("\u00a5", (Object)((zU)var1_1), (Object)var11_12, (float)var12_13, (float)var4_4, (float)var5_5, (Object)var13_14, (long)487875072643634565L);
            if (!var8_8) ** GOTO lbl80
            return;
        }
lbl-1000:
        // 6 sources

        {
            block17: {
                switch (var14_9 /* !! */ ) {
                    default: {
                        es.n("jP5Jbrj5GNBqGIdF", F(java.lang.String float float float float int java.awt.Color ), (zU)((zU)var1_1), (String)hi.a("\u00e9", (Object)((n_)var2_2), (long)414894262663300713L), (float)var3_3, (float)var4_4, (float)var5_5, (float)(var9_10 * var5_5), (int)var10_11, (Color)((Color)var6_6));
                        if (!var8_8) ** GOTO lbl70
                        ** GOTO lbl14
                    }
                    case 2036541372: {
                        ** continue;
                    }
                    case 2036541374: {
                        var11_12 = " " + (String)hi.a("\u00e9", (Object)((n_)var2_2), (long)839643879083142689L);
                        var12_13 = var3_3 + hi.a("\u00e9", (Object)((n_)var2_2), (long)1227090444208356693L);
                        var13_14 = hi.a("\u00a5", (Object)this, (Object)new Color(es.d(5133, 2578239847795576721L), es.d(25295, 5740392479092193714L), es.d(25295, 5740392479092193714L)), (float)var7_7, (long)1281379301646514049L);
                        v2 = es.n("jP5Jbrj5GNBqGIdF", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1178990095831168438L), (long)789438897355831922L)));
                        if (var8_8) ** GOTO lbl43
                        if (v2 == false) ** GOTO lbl42
                        ** GOTO lbl45
                    }
                    case 2036541373: {
                        throw null;
                    }
lbl42:
                    // 1 sources

                    v2 = hi.a("G", (int)(es.d(10338, 5284987419298788087L) * es.d(23499, 1670321637378818052L)), (int)es.d(30303, 1516664671699185312L), (long)834203424483934088L) - es.d(15777, 1846183555230426409L);
lbl43:
                    // 2 sources

                    var14_9 /* !! */  = (int)v2;
                    if (!var8_8) break block17;
lbl45:
                    // 2 sources

                    var14_9 /* !! */  = es.d(23219, 1331280873198846407L) + es.d(13951, 4392520836580404978L) + es.d(8274, 3356888115804404339L);
                    if (!var8_8) break block17;
                    ** GOTO lbl77
                    case 2036541376: 
                }
                return;
            }
            do lbl-1000:
            // 3 sources

            {
                block18: {
                    switch (var14_9 /* !! */ ) {
                        default: {
                            es.n("jP5Jbrj5GNBqGIdF", F(java.lang.String float float float float int java.awt.Color ), (zU)((zU)var1_1), (String)var11_12, (float)var12_13, (float)var4_4, (float)var5_5, (float)(var9_10 * var5_5), (int)var10_11, (Color)var13_14);
                            if (!var8_8) break block18;
                            ** GOTO lbl20
                        }
                        case -1253730994: {
                            ** continue;
                        }
                        case -1253730993: {
                            hi.a("G", (long)963057718638705759L);
                            hi.a("G", (int)2, (long)1007835440002559292L);
                            var14_9 /* !! */  = (hi.a("G", (int)(es.d(23590, 4375054920268416022L) + es.d(21290, 2336920123393247615L)), (int)es.d(5858, 7766417934878657636L), (long)834203424483934088L) ^ es.d(21725, 3839419338980855731L)) + es.d(19745, 1832949891940456419L) + es.d(23305, 8195506012758049370L);
                            if (!var8_8) ** GOTO lbl-1000
                        }
                    }
lbl65:
                    // 2 sources

                    v0 /* !! */  = (CallSite)((es.d(5132, 7384131179760110786L) * es.d(5369, 7417313756283981750L) + es.d(1417, 3484130528391028390L) + es.d(16175, 7210012239364056697L) ^ es.d(6910, 8917931557707038805L)) + es.d(23114, 7903999441744495245L));
lbl66:
                    // 2 sources

                    var14_9 /* !! */  = (int)v0 /* !! */ ;
                    if (!var8_8) continue block15;
lbl68:
                    // 2 sources

                    var14_9 /* !! */  = es.d(2001, 3752780281777609913L) ^ es.d(4395, 1506694865241754476L) ^ es.d(19177, 7941992508347879604L);
                    if (!var8_8) continue block15;
lbl70:
                    // 2 sources

                    var14_9 /* !! */  = (es.d(4062, 7381309510346855470L) * es.d(22657, 4240146784475218571L) + es.d(23861, 4406253524171294606L) + es.d(6224, 3376703450429211458L) ^ es.d(9800, 3398538705246518584L)) + es.d(6142, 670082599253135307L);
                    if (!var8_8) continue block15;
lbl72:
                    // 2 sources

                    v1 /* !! */  = (CallSite)(es.d(24054, 4488200260338451869L) - es.d(32423, 6299213811543647896L) + es.d(8853, 1024125021240293383L));
lbl73:
                    // 2 sources

                    var14_9 /* !! */  = (int)v1 /* !! */ ;
                    if (!var8_8) continue block15;
lbl75:
                    // 2 sources

                    var14_9 /* !! */  = (es.d(1201, 8910064171599060205L) * es.d(5457, 7663714489491639783L) ^ es.d(26562, 8292261741599931394L)) / es.d(16355, 6881960157086377211L) ^ es.d(25966, 2253170308592942522L);
                    continue block15;
                }
                var14_9 /* !! */  = (int)(hi.a("G", (int)(es.d(19575, 5053482882493192189L) * es.d(21711, 1371391665000550334L)), (int)es.d(3361, 2775857016225519141L), (long)834203424483934088L) - es.d(16977, 6103500583749491211L));
            } while (!var8_8);
lbl80:
            // 2 sources

            var14_9 /* !! */  = es.d(4435, 8115917399007054255L) - es.d(17678, 4323772553633406647L) + es.d(27701, 3663825648645224131L);
            ** while (true)
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Color N(Object[] var1_1) {
        block28: {
            block30: {
                block29: {
                    var2_2 = (Integer)var1_1[0];
                    var3_3 = (Long)var1_1[1];
                    var5_4 = Dl.t();
                    var6_5 /* !! */  = es.d(21647, 5360377146964511960L) / es.d(9432, 1500415591680835313L) + es.d(11826, 3820213401661338646L) ^ es.d(17757, 8044072692630921159L) ^ es.d(7897, 5123407963920680598L);
                    if (!var5_4) ** GOTO lbl28
                    block17: while (true) {
                        block32: {
                            block31: {
                                v0 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", ordinal(), (DW)((DW)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1291403366754824763L), (long)789438897355831922L)));
                                if (var5_4) break block31;
                                switch (v0 /* !! */ ) {
                                    case 0: {
                                        var6_5 /* !! */  = (es.d(4013, 1982168068057289941L) * es.d(1473, 3431508936585076194L) - es.d(20575, 3715218628443867292L) ^ es.d(10449, 1068997275323560728L)) + es.d(1029, 7946436912173408186L) - es.d(7933, 6434019861307213428L);
                                        if (!var5_4) break block32;
                                    }
                                    case 1: {
                                        var6_5 /* !! */  = (hi.a("G", (int)hi.a("G", (int)es.d(26544, 2188122706328075604L), (int)es.d(4417, 1338572305183623980L), (long)834203424483934088L), (int)es.d(797, 7941598513048312127L), (long)834203424483934088L) ^ es.d(25657, 5722176011977473404L)) - es.d(10968, 4926724757851763435L) + es.d(28627, 8854463954836927749L);
                                        if (!var5_4) break block32;
                                    }
                                    case 2: {
                                        var6_5 /* !! */  = (int)(es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)(hi.a("G", (int)(es.d(1584, 1522748637482245352L) / es.d(6655, 8472383157657780504L)), (int)es.d(7359, 7241176484015850944L), (long)834203424483934088L) - es.d(21401, 5628464297864137495L)), (int)es.d(4171, 8220982093428770849L)) - es.d(17774, 7865458868301045504L));
                                        if (!var5_4) break block32;
                                    }
                                    case 3: {
                                        var6_5 /* !! */  = es.d(31941, 6026239961191786107L) + es.d(20830, 9033654861049923587L) ^ es.d(22517, 4302258285407178093L);
                                        if (!var5_4) ** break;
                                        break;
                                    }
                                    {
                                    }
                                }
                                v0 /* !! */  = (CallSite)((es.d(13704, 8631717203893546399L) + es.d(17498, 7029098770868707275L)) * es.d(9998, 6645020179020644169L) ^ es.d(19560, 7911590403854505658L));
                            }
                            var6_5 /* !! */  = (int)v0 /* !! */ ;
                        }
                        switch (var6_5 /* !! */ ) {
                            default: {
                                continue block17;
                            }
                            case -690210496: {
                                throw new MatchException(null, null);
                            }
                            case -690210493: {
                                v1 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var2_2}, (long)1184153232512897776L);
                                var6_5 /* !! */  = (es.d(29930, 6231190617060650592L) ^ es.d(28145, 2857613676987791055L)) * es.d(8576, 4308956292126800859L) - es.d(6871, 5499813229250789796L);
                                if (var5_4) {
                                    break block17;
                                }
                                break block28;
                            }
                            case -690210495: {
                                v1 = hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)403161186438047724L), (long)789438897355831922L)), (Object)((Color)es.n("jP5Jbrj5GNBqGIdF", z(), (DV)hi.a("\u00e9", (Object)this, (long)917645153836106411L))), (long)((long)var2_2 * var3_3), (long)1016953385461643557L);
                                break block17;
                            }
                            case -690210492: {
                                v1 = hi.a("\u00a5", (Object)this, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)403161186438047724L), (long)789438897355831922L)), (Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{(Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)403161186438047724L), (long)789438897355831922L)}, (long)1170753145577908550L), (long)((long)var2_2 * var3_3), (long)1016953385461643557L);
                                break block29;
                            }
                            case -690210494: {
                                v1 = (Color)es.n("jP5Jbrj5GNBqGIdF", z(), (DV)hi.a("\u00e9", (Object)this, (long)403161186438047724L));
                                if (var5_4) {
                                    return v1;
                                }
                                break block30;
                            }
                            case -690210490: {
                                throw null;
                            }
                        }
                        break;
                    }
                    var6_5 /* !! */  = (es.d(13598, 6743143412274556192L) ^ es.d(27411, 7513409395642839049L)) * es.d(29236, 7384650477906307630L) - es.d(26575, 5140909052942433983L);
                    if (!var5_4) break block28;
                }
                var6_5 /* !! */  = (es.d(13598, 6743143412274556192L) ^ es.d(27411, 7513409395642839049L)) * es.d(29236, 7384650477906307630L) - es.d(26575, 5140909052942433983L);
                if (!var5_4) break block28;
            }
            var6_5 /* !! */  = (es.d(13598, 6743143412274556192L) ^ es.d(27411, 7513409395642839049L)) * es.d(29236, 7384650477906307630L) - es.d(26575, 5140909052942433983L);
        }
        switch (var6_5 /* !! */ ) {
            default: {
                return v1;
            }
            case 649494317: 
        }
        throw null;
    }

    public static /* bridge */ /* synthetic */ CallSite n(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private boolean lambda$new$14() {
        boolean bl = Dl.S();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1291403366754824763L), (Object)hi.a("j", (long)544272986501020421L), (long)511460060498514638L);
        if (bl) {
            object = object == false ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    private Color V(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (int)((hi.a("G", (long)658960450018995719L) / es.e(30196, 7660023642249695202L) + (long)n * es.e(26562, 3404158388848958934L)) % es.e(32041, 7629564959940216632L));
        return new Color((int)hi.a("G", (float)((float)n2 / 360.0f), (float)0.5f, (float)1.0f, (long)563346150223406001L));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void e(Object[] var1_1) {
        block46: {
            block47: {
                block45: {
                    block43: {
                        block44: {
                            block53: {
                                block42: {
                                    block41: {
                                        block48: {
                                            var2_2 = (DeltaTracker)var1_1[0];
                                            var3_3 = Dl.t();
                                            var12_4 /* !! */  = (es.d(10060, 6542269623966466041L) * es.d(31547, 2713573240837514157L) ^ es.d(32180, 1305609997730752403L)) + es.d(10513, 4501453360332272524L);
                                            if (!var3_3) {
                                                switch (var12_4 /* !! */ ) {
                                                    case -812576145: {
                                                        hi.a("G", (long)895068744616129065L);
                                                        break;
                                                    }
                                                }
                                            }
                                            var4_5 = (_j)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)627672117785209085L), (long)876941681548788276L);
                                            var5_6 = hi.a("\u00a5", (Object)hi.a("j", (long)784151999793788327L), (Object)new Object[0], (long)747510335972292358L);
                                            var6_7 = new HashSet<E>(var5_6);
                                            hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1234253238249565815L), (long)816527764288583577L), (Predicate<e>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$render$0(java.util.Set com.github.epsilon.e ), (Lcom/github/epsilon/e;)Z)(var6_7), (long)519274218091013055L);
                                            hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)795860636314569014L), (long)816527764288583577L), (Predicate<e>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$render$1(java.util.Set com.github.epsilon.e ), (Lcom/github/epsilon/e;)Z)(var6_7), (long)519274218091013055L);
                                            var7_8 = hi.a("G", (long)658960450018995719L);
                                            var9_9 = hi.a("\u00a5", (Object)var5_6, (long)1240653736693366367L);
                                            if (var3_3) break block48;
                                            var12_4 /* !! */  = (es.d(21857, 6952647624327466274L) ^ es.d(2313, 2199226172275675728L)) - es.d(6936, 6186764722050908564L) ^ es.d(10721, 3535469498402074947L);
                                            if (!var3_3) break block41;
                                            ** GOTO lbl30
                                        }
lbl26:
                                        // 2 sources

                                        while (true) {
                                            block50: {
                                                block49: {
                                                    v0 /* !! */  = hi.a("\u00a5", (Object)var9_9, (long)984088978567310565L);
                                                    if (var3_3) break block49;
                                                    if (v0 /* !! */  != false) break block50;
lbl30:
                                                    // 2 sources

                                                    v0 /* !! */  = (CallSite)((es.d(31386, 1280522588087689880L) * es.d(5820, 1828132024915545833L) ^ es.d(31986, 3013118140832883816L)) * es.d(1881, 4147016113946320445L) + es.d(17500, 1536524369277295628L));
                                                }
                                                var12_4 /* !! */  = (int)v0 /* !! */ ;
                                                if (!var3_3) break block41;
                                            }
                                            var12_4 /* !! */  = es.d(8422, 4220499874943171359L) * es.d(19991, 5250723946429224447L) ^ es.d(29936, 4182841593696267911L);
                                            break block41;
                                            break;
                                        }
lbl37:
                                        // 2 sources

                                        while (true) {
                                            v1 = new Object[2];
                                            v1[1] = (long)var7_8;
                                            v1[0] = true;
                                            hi.a("\u00a5", (Object)((vC)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1234253238249565815L), (Object)var10_10, (Function<e, vC>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$render$2(long com.github.epsilon.e ), (Lcom/github/epsilon/e;)Lcom/github/epsilon/vC;)((long)var7_8), (long)817175477130987234L)), (Object)v1, (long)686839304972451387L);
                                            if (!var3_3) ** GOTO lbl133
lbl45:
                                            // 2 sources

                                            while (true) {
                                                var9_9 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1234253238249565815L), (long)564642612070665456L), (long)1297238455825536256L);
                                                if (!var3_3) ** GOTO lbl135
lbl48:
                                                // 3 sources

                                                while (true) {
                                                    v2 /* !! */  = hi.a("\u00a5", (Object)var9_9, (long)984088978567310565L);
                                                    if (var3_3) ** GOTO lbl138
                                                    if (v2 /* !! */  == false) ** GOTO lbl137
                                                    ** GOTO lbl140
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
lbl53:
                                        // 2 sources

                                        while (true) {
                                            block52: {
                                                block51: {
                                                    v3 = new Object[2];
                                                    v3[1] = (long)var7_8;
                                                    v3[0] = false;
                                                    var11_11 = hi.a("\u00a5", (Object)((vC)hi.a("\u00a5", (Object)var10_10, (long)1134935675208353020L)), (Object)v3, (long)686839304972451387L);
                                                    cfr_temp_0 = var11_11 - 0.0f;
                                                    v4 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                    if (var3_3) break block51;
                                                    if (v4 /* !! */  <= 0) break block52;
                                                    v4 /* !! */  = (reference)(es.d(17563, 6205901877924568705L) - es.d(8116, 2828081290919462366L) ^ es.d(7623, 3629509124437231525L));
                                                }
                                                var12_4 /* !! */  = (int)v4 /* !! */ ;
                                                if (!var3_3) break block42;
                                            }
                                            var12_4 /* !! */  = es.d(11719, 2940407437436318979L) / 4 / es.d(28867, 3171709480168434451L) * es.d(8214, 7917018234463287362L) + es.d(12729, 1252213325812558844L) + es.d(447, 9105924022988757983L);
                                            if (!var3_3) break block42;
                                            ** GOTO lbl183
                                            break;
                                        }
lbl71:
                                        // 2 sources

                                        while (var3_3) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                v5 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)623279982452957424L), (long)511460060498514638L);
                                                if (var3_3) break block43;
                                                if (v5 /* !! */  == false) break block44;
                                                break block45;
                                                break;
                                            }
                                        }
                                        break block53;
lbl78:
                                        // 2 sources

                                        while (true) {
                                            hi.a("\u00a5", (Object)this, (Object)new Object[]{var4_5}, (long)1124521192324658531L);
                                            if (var3_3) {
                                                return;
                                            }
                                            break block46;
                                            break;
                                        }
                                    }
lbl84:
                                    // 6 sources

                                    block34: while (true) {
                                        block55: {
                                            block54: {
                                                switch (var12_4 /* !! */ ) {
                                                    default: {
                                                        ** continue;
                                                    }
                                                    case 2060539042: {
                                                        var10_10 = (e)hi.a("\u00a5", (Object)var9_9, (long)470012372636416268L);
                                                        v6 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{var10_10}, (long)630476354135629302L);
                                                        if (var3_3) ** GOTO lbl118
                                                        if (v6 /* !! */  != false) ** GOTO lbl117
                                                        ** GOTO lbl120
                                                    }
                                                    case 2060539037: {
                                                        ** continue;
                                                    }
                                                    case 2060539040: {
                                                        ** GOTO lbl48
                                                    }
                                                    case 2060539044: {
                                                        var10_10 = (Map.Entry)hi.a("\u00a5", (Object)var9_9, (long)470012372636416268L);
                                                        v7 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[]{(e)hi.a("\u00a5", (Object)var10_10, (long)374171850520217279L)}, (long)630476354135629302L);
                                                        if (var3_3) ** GOTO lbl143
                                                        if (v7 /* !! */  == false) ** GOTO lbl142
                                                        ** GOTO lbl145
                                                    }
                                                    case 2060539039: {
                                                        ** continue;
                                                    }
                                                    case 2060539036: {
                                                        hi.a("\u00a5", (Object)this, (Object)new Object[]{var4_5}, (long)437590889438685110L);
                                                        if (!var3_3) break block47;
                                                        ** GOTO lbl78
                                                    }
                                                    case 2060539045: {
                                                        ** continue;
                                                    }
                                                    case 2060539038: {
                                                        hi.a("G", (long)818835474660401656L);
                                                        ** continue;
                                                    }
lbl117:
                                                    // 1 sources

                                                    v6 /* !! */  = (CallSite)(es.n("jP5Jbrj5GNBqGIdF", max(int int ), (int)es.d(11348, 4697424363488835313L), (int)es.d(7128, 2012807887314763838L)) ^ es.d(26546, 8912143035983740055L));
lbl118:
                                                    // 2 sources

                                                    var12_4 /* !! */  = (int)v6 /* !! */ ;
                                                    if (!var3_3) ** GOTO lbl122
lbl120:
                                                    // 2 sources

                                                    var12_4 /* !! */  = hi.a("G", (int)es.d(23093, 5054287652499914923L), (int)es.d(3158, 2577185741845321450L), (long)834203424483934088L) + es.d(14661, 1271806658018730408L) ^ es.d(31961, 163513520454116357L);
                                                    if (var3_3) ** GOTO lbl131
lbl122:
                                                    // 2 sources

                                                    switch (var12_4 /* !! */ ) {
                                                        default: {
                                                            if (!var3_3) break;
                                                            ** GOTO lbl37
                                                        }
                                                        case 1438524869: {
                                                            ** continue;
                                                        }
                                                        case 1438524870: {
                                                            hi.a("G", (long)984490452076593859L);
                                                            return;
                                                        }
                                                    }
lbl131:
                                                    // 2 sources

                                                    var12_4 /* !! */  = (es.d(24078, 4377174247561299613L) ^ es.d(13450, 6443401999447027135L)) - es.d(30667, 6457884979749957401L) ^ es.d(32427, 1648994099379840574L);
                                                    if (!var3_3) continue block34;
lbl133:
                                                    // 2 sources

                                                    var12_4 /* !! */  = (es.d(24078, 4377174247561299613L) ^ es.d(13450, 6443401999447027135L)) - es.d(30667, 6457884979749957401L) ^ es.d(32427, 1648994099379840574L);
                                                    if (!var3_3) continue block34;
lbl135:
                                                    // 2 sources

                                                    var12_4 /* !! */  = es.d(16135, 7021941691789501869L) * es.d(27727, 1715751412849587760L) - es.d(12717, 4330061746138770034L);
                                                    if (!var3_3) continue block34;
lbl137:
                                                    // 2 sources

                                                    v2 /* !! */  = (CallSite)((es.d(26657, 7451379797652058453L) + es.d(10643, 3667985745827427223L)) / es.d(27504, 4647254018579641243L) * es.d(25414, 7108636204460881983L) / es.d(27460, 9014880752662983141L) ^ es.d(20939, 5728442580906248959L));
lbl138:
                                                    // 2 sources

                                                    var12_4 /* !! */  = (int)v2 /* !! */ ;
                                                    if (!var3_3) continue block34;
lbl140:
                                                    // 2 sources

                                                    var12_4 /* !! */  = (hi.a("G", (int)(es.d(12961, 2909667442315127287L) - es.d(27587, 7234603991369429282L)), (int)es.d(23406, 3049954445530988901L), (long)834203424483934088L) ^ es.d(8830, 9194186487090149584L)) - es.d(16745, 114464355182418596L);
                                                    continue block34;
lbl142:
                                                    // 1 sources

                                                    v7 /* !! */  = (CallSite)(es.d(26023, 3243763748088593936L) - es.d(22974, 8296309774871953624L) + es.d(16084, 5602200707972130048L));
lbl143:
                                                    // 2 sources

                                                    var12_4 /* !! */  = (int)v7 /* !! */ ;
                                                    if (!var3_3) break block54;
lbl145:
                                                    // 2 sources

                                                    var12_4 /* !! */  = (es.d(1870, 6853673777775172740L) + es.d(22087, 922850312138657439L) ^ es.d(5378, 182062029597200069L)) * es.d(25823, 5897092261441879150L) + es.d(8104, 6150821137582703919L);
                                                    if (!var3_3) break block54;
                                                    break block55;
                                                    case 2060539041: 
                                                }
                                                return;
                                            }
                                            block35: while (true) {
                                                switch (var12_4 /* !! */ ) {
                                                    default: {
                                                        if (!var3_3) break block35;
                                                        ** GOTO lbl53
                                                    }
                                                    case -1700838908: {
                                                        ** continue;
                                                    }
                                                    case -1700838907: {
                                                        hi.a("G", (long)561677051612723832L);
                                                        hi.a("G", (long)1318921989870229166L);
                                                        var12_4 /* !! */  = es.d(5693, 3005726338675428664L) * es.d(21705, 8841533991613992601L) / es.d(16355, 6881960157086377211L) ^ es.d(19286, 5002961210010833736L) ^ es.d(16167, 3868103038067270882L);
                                                        continue block35;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        var12_4 /* !! */  = es.d(23696, 2543678066429330852L) * es.d(18643, 5676732350712517436L) - es.d(7851, 1357575602769871947L);
                                        continue;
                                        break;
                                    }
                                }
                                do {
                                    switch (var12_4 /* !! */ ) {
                                        default: {
                                            hi.a("\u00a5", (Object)var9_9, (long)798035814993215984L);
                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)795860636314569014L), (Object)hi.a("\u00a5", (Object)var10_10, (long)374171850520217279L), (long)1019364473046052899L);
                                            if (!var3_3) break;
                                            ** GOTO lbl71
                                        }
                                        case -2055957438: {
                                            ** GOTO lbl71
                                        }
                                        case -2055957439: {
                                            hi.a("G", (long)414670365113859210L);
                                            return;
                                        }
                                    }
lbl183:
                                    // 2 sources

                                    var12_4 /* !! */  = es.d(27454, 644637378098836051L) - es.d(4838, 3080263776688392310L) ^ es.d(3842, 1927058996968510585L);
                                } while (!var3_3);
                            }
                            var12_4 /* !! */  = es.d(23696, 2543678066429330852L) * es.d(18643, 5676732350712517436L) - es.d(7851, 1357575602769871947L);
                            if (!var3_3) ** GOTO lbl84
                        }
                        v5 /* !! */  = (CallSite)(hi.a("G", (int)es.d(13695, 6219976275213086588L), (int)es.d(28876, 2506010055409150767L), (long)834203424483934088L) - es.d(10617, 69777878745772906L) ^ es.d(25887, 2824097147104706282L));
                    }
                    var12_4 /* !! */  = (int)v5 /* !! */ ;
                    if (!var3_3) ** GOTO lbl84
                }
                var12_4 /* !! */  = es.d(26808, 642532460565738364L) ^ es.d(7241, 3961673156594059013L) ^ es.d(2636, 1532062051871445398L);
                if (!var3_3) ** GOTO lbl84
            }
            var12_4 /* !! */  = (int)(hi.a("G", (int)es.d(4958, 6838421752061970655L), (int)es.d(6362, 5872592552239448729L), (long)834203424483934088L) + es.d(30460, 7703675850040028737L));
            if (!var3_3) ** GOTO lbl84
        }
        var12_4 /* !! */  = (int)(hi.a("G", (int)es.d(16796, 8566920669800995649L), (int)es.d(25016, 8528276321497266490L), (long)834203424483934088L) + es.d(9994, 8543582771318161337L));
        ** while (true)
    }

    public Color M(int n, long l) {
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = n;
        return hi.a("\u00a5", (Object)this, (Object)objectArray, (long)405977691139822584L);
    }

    /*
     * Exception decompiling
     */
    private float d(Object[] var1_1) {
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

    static {
        IlilIlIlil.registerNativesForClass((int)18, es.class);
        Hidden0.special_clinit_18_320(es.class);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void D(Object[] var1_1) {
        block52: {
            block62: {
                block61: {
                    block60: {
                        block59: {
                            block58: {
                                block57: {
                                    block56: {
                                        block55: {
                                            block54: {
                                                block53: {
                                                    var2_2 = var1_1[0];
                                                    var3_3 = Dl.t();
                                                    var17_4 /* !! */  = es.d(24050, 5237459780744152255L) * es.d(32059, 872187273376212343L) + es.d(7833, 1985279108776511442L);
                                                    if (var3_3) ** GOTO lbl-1000
                                                    switch (var17_4 /* !! */ ) {
                                                        default: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var4_5 = hi.a("G", (float)0.1f, (float)(hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)425373487822507413L), (long)789438897355831922L)), (long)371266768739483732L) / 16.0f), (long)1021203527991582354L);
                                                            var5_6 = es.n("jP5Jbrj5GNBqGIdF", S(java.lang.Object float boolean ), (es)this, (Object)((_j)var2_2), (float)var4_5, (boolean)hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1063506180123882884L), (long)789438897355831922L)), (long)1000026253634408124L));
                                                            v0 = new Object[2];
                                                            v0[1] = Float.valueOf((float)(hi.a("\u00a5", (Object)((_j)var2_2), (float)var4_5, (long)441868902805229185L) + 3.0f));
                                                            v0[0] = var5_6;
                                                            var6_7 = hi.a("\u00a5", (Object)this, (Object)v0, (long)1023970100374907253L);
                                                            var7_8 = hi.a("G", (float)20.0f, (float)hi.a("\u00a5", (Object)this, (Object)new Object[]{var5_6}, (long)408226419456572861L), (long)1021203527991582354L);
                                                            hi.a("\u00a5", (Object)this, (float)var7_8, (float)es.n("jP5Jbrj5GNBqGIdF", max(float float ), (float)20.0f, (float)hi.a("\u00a5", (Object)var6_7, (long)1200691777712898038L)), (long)1276984734984451677L);
                                                            v1 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)1256913436411747171L);
                                                            if (var3_3) break block53;
                                                            if (v1 /* !! */  == false) break;
                                                            break block54;
                                                        }
                                                        case -1832464126: {
                                                            throw null;
                                                        }
                                                    }
                                                    v1 /* !! */  = (CallSite)(es.d(26582, 1991482440334163262L) ^ es.d(25450, 4636932029776771234L) ^ es.d(7046, 2350934078638964831L));
                                                }
                                                var17_4 /* !! */  = (int)v1 /* !! */ ;
                                                if (!var3_3) break block55;
                                            }
                                            var17_4 /* !! */  = (int)(hi.a("G", (int)(es.d(14579, 1423584020189373149L) - es.d(25403, 8723037199892461681L)), (int)es.d(31188, 2018707672447984085L), (long)834203424483934088L) - es.d(989, 7265523497256376446L) + es.d(26824, 6414897137326928568L) + es.d(10883, 555426683089777028L));
                                        }
                                        switch (var17_4 /* !! */ ) {
                                            case -1038774300: {
                                                hi.a("G", (long)671058646027606858L);
                                                hi.a("G", (long)872630577218346603L);
                                                return;
                                            }
                                            default: {
                                                return;
                                            }
                                            case -1038774298: 
                                        }
                                        var8_9 = hi.a("\u00a5", (Object)this, (long)567689278082192432L);
                                        cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + hi.a("\u00e9", (Object)this, (long)757761617965287585L) * 0.5f - hi.a("G", (long)1052312102167579273L) * 0.5f;
                                        v2 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                        if (var3_3) break block56;
                                        if (v2 /* !! */  > 0) break block57;
                                        v2 /* !! */  = (reference)(es.d(9898, 964340340486635467L) / 3 ^ es.d(23870, 6052597788701820406L));
                                    }
                                    var17_4 /* !! */  = (int)v2 /* !! */ ;
                                    if (!var3_3) break block58;
                                }
                                var17_4 /* !! */  = es.d(15418, 4957808341824038693L) + es.d(21024, 1660885938112760401L) ^ es.d(6412, 145385763817341595L);
                            }
                            v3 /* !! */  = var17_4 /* !! */ ;
                            if (var3_3) break block59;
                            switch (v3 /* !! */ ) {
                                default: {
                                    v3 /* !! */  = 1;
                                    break;
                                }
                                case 571430742: {
                                    v3 /* !! */  = 0;
                                    if (!var3_3) break block60;
                                    break block61;
                                }
                                case 571430743: {
                                    return;
                                }
                            }
                        }
                        var17_4 /* !! */  = es.d(2752, 5334479003653394793L) - es.d(29951, 263103008919432590L) + es.d(29087, 4378719545514174626L);
                        if (!var3_3) break block62;
                    }
                    var17_4 /* !! */  = es.d(20960, 7274700437989067283L) - es.d(5675, 836166490329140958L) + es.d(30765, 5818143323882398210L);
                    break block62;
                }
lbl70:
                // 2 sources

                while (true) {
                    block63: {
                        var9_10 /* !! */  = v3 /* !! */ ;
                        var10_11 = 0;
                        if (var3_3) break block63;
                        var17_4 /* !! */  = (es.d(29223, 6502829406558660729L) - es.d(421, 5359287854686689917L)) * es.d(4572, 5583628315411892893L) * es.d(17331, 9197906068543248494L) ^ es.d(8777, 1365753213068606313L);
                        if (!var3_3) ** GOTO lbl145
                        ** GOTO lbl83
                    }
lbl78:
                    // 2 sources

                    while (true) {
                        block65: {
                            block64: {
                                v4 /* !! */  = var10_11;
                                v5 /* !! */  = es.n("jP5Jbrj5GNBqGIdF", size(), (List)var5_6);
                                if (var3_3) break block64;
                                if (v4 /* !! */  < v5 /* !! */ ) break block65;
lbl83:
                                // 2 sources

                                v4 /* !! */  = (int)hi.a("G", (int)hi.a("G", (int)es.d(25804, 7240617180737388413L), (int)es.d(32599, 4546508117523048320L), (long)834203424483934088L), (int)es.d(15060, 8861531123029304029L), (long)834203424483934088L);
                                v5 /* !! */  = (CallSite)es.d(27561, 8458802017363898648L);
                            }
                            var17_4 /* !! */  = v4 /* !! */  - v5 /* !! */ ;
                            if (!var3_3) ** GOTO lbl145
                        }
                        var17_4 /* !! */  = es.d(16851, 4677008779975564011L) / 2 - es.d(24917, 8697795124390050513L) ^ es.d(24749, 8973619880748661387L);
                        ** GOTO lbl145
                        break;
                    }
                    break;
                }
lbl91:
                // 2 sources

                while (true) {
                    block70: {
                        block69: {
                            block68: {
                                block67: {
                                    block66: {
                                        var13_14 = hi.a("\u00a5", (Object)var11_12, (long)989337506262464487L) * (1.0f - var12_13);
                                        v6 /* !! */  = var9_10 /* !! */ ;
                                        if (var3_3) break block66;
                                        if (v6 /* !! */  != 0) break block67;
                                        v6 /* !! */  = var17_4 /* !! */  = (es.d(26268, 7556249446756498783L) ^ es.d(7391, 2044566853266163273L) ^ es.d(20251, 1093492028770194466L)) - es.d(25191, 8139675066937096496L);
                                    }
                                    if (!var3_3) break block68;
                                }
                                var17_4 /* !! */  = (int)(hi.a("G", (int)es.d(19859, 1738548003080213800L), (int)es.d(6744, 5393274830834581926L), (long)834203424483934088L) * es.d(2028, 5078337928089656985L) / es.d(27504, 4647254018579641243L) + es.d(4279, 4031826597217552947L));
                            }
                            switch (var17_4 /* !! */ ) {
                                default: {
                                    v7 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) + var7_8 - hi.a("\u00a5", (Object)var11_12, (long)989337506262464487L) + var13_14;
                                    var17_4 /* !! */  = (int)(hi.a("G", (int)es.d(3630, 3221215843991508015L), (int)es.d(27873, 3791437169534908053L), (long)834203424483934088L) + es.d(18176, 2947726905342663959L) + es.d(15735, 3982102549102683219L));
                                    if (var3_3) {
                                        break;
                                    }
                                    break block69;
                                }
                                case 1070123633: {
                                    v7 = hi.a("\u00e9", (Object)this, (long)934067547881438154L) - var13_14;
                                    if (!var3_3) break;
                                    ** GOTO lbl-1000
                                }
                                case 1070123632: {
                                    throw null;
                                }
                            }
                            var17_4 /* !! */  = (int)(hi.a("G", (int)es.d(9829, 387539091695861501L), (int)es.d(5833, 7365550132630343230L), (long)834203424483934088L) + es.d(11496, 4935933524709897602L) + es.d(5694, 4672928858488983218L));
                        }
                        switch (var17_4 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var14_15 = v7;
                                var15_16 = hi.a("\u00e9", (Object)this, (long)423210454345410312L) + hi.a("\u00a5", (Object)var6_7, (long)1199447600063985623L)[var10_11];
                                v8 = new Object[2];
                                v8[1] = es.e(7528, 1665074413217081213L);
                                v8[0] = var10_11;
                                var16_17 = hi.a("\u00a5", (Object)this, (Object)hi.a("\u00a5", (Object)this, (Object)v8, (long)405977691139822584L), (float)var12_13, (long)1281379301646514049L);
                                hi.a("\u00a5", (Object)this, (Object)var8_9, (Object)var11_12, (float)var14_15, (float)var15_16, (float)var4_5, (Object)var16_17, (float)var12_13, (long)1113096936571083231L);
                                if (!var3_3) break;
                                break block70;
                            }
                            case 1339692333: {
                                throw null;
                            }
                        }
                        var17_4 /* !! */  = (es.d(742, 4668856693460392140L) / es.d(28867, 3171709480168434451L) + es.d(3317, 2414362263306590099L)) * es.d(3899, 3266595803447515038L) ^ es.d(18110, 7085881439877308014L);
                        if (!var3_3) break block52;
                        ** GOTO lbl144
                    }
lbl137:
                    // 2 sources

                    while (true) {
                        hi.a("G", (long)1207087722114992771L);
lbl140:
                        // 2 sources

                        while (true) {
                            block72: {
                                block71: {
                                    ++var10_11;
                                    if (var3_3) {
                                        return;
                                    }
lbl144:
                                    // 3 sources

                                    var17_4 /* !! */  = (es.d(21848, 4578626245537500501L) - es.d(21210, 6538253718332409984L)) * es.d(24117, 6972683753600353554L) * es.d(25281, 3845714322890210038L) ^ es.d(23905, 4788207469238159123L);
lbl145:
                                    // 4 sources

                                    switch (var17_4 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 1950746702: {
                                            var11_12 = (n_)hi.a("\u00a5", (Object)var5_6, (int)var10_11, (long)516183098926246296L);
                                            var12_13 = es.n("jP5Jbrj5GNBqGIdF", gL(), (n_)var11_12);
                                            cfr_temp_1 = var12_13 - 0.01f;
                                            v9 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                            if (var3_3) break block71;
                                            if (v9 /* !! */  > 0) break;
                                            break block72;
                                        }
                                        case 1950746703: {
                                            return;
                                        }
                                        case 1950746705: {
                                            hi.a("G", (long)1254720339774257797L);
                                            return;
                                        }
                                    }
                                    v9 /* !! */  = (reference)((es.d(5715, 7817107862815395278L) - es.d(4570, 3444948231576701409L)) / es.d(6655, 8472383157657780504L) - es.d(26426, 8933248759187717986L) - es.d(24284, 4913296480444876771L));
                                }
                                var17_4 /* !! */  = (int)v9 /* !! */ ;
                                if (!var3_3) break block52;
                            }
                            var17_4 /* !! */  = es.d(23716, 2835552965618894216L) * es.d(4082, 6133139666286073643L) - es.d(21065, 1500255006732814769L);
                            if (!var3_3) break block52;
                            ** GOTO lbl194
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            while (true) {
                switch (var17_4 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 180382784: 
                }
                hi.a("G", (long)872630577218346603L);
                hi.a("G", (long)1103686052128593910L);
                var17_4 /* !! */  = es.d(3269, 9150259197793555659L) / es.d(32133, 4396395990465750563L) * es.d(29162, 2832545285892614593L) + es.d(2183, 2738692450613547499L);
            }
        }
        while (true) {
            switch (var17_4 /* !! */ ) {
                default: {
                    if (!var3_3) break;
                    ** GOTO lbl91
                }
                case 599270901: {
                    ** continue;
                }
                case 599270899: {
                    ** continue;
                }
                case 599270900: {
                    ** continue;
                }
            }
lbl194:
            // 2 sources

            var17_4 /* !! */  = (es.d(28920, 2939462926910302957L) / es.d(28867, 3171709480168434451L) + es.d(3289, 824023055775389166L)) * es.d(6426, 8660992649925673275L) ^ es.d(1021, 4822960517235006164L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$8() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
                if (bl) break block4;
                if (object == false) break block5;
                object = es.n("jP5Jbrj5GNBqGIdF", booleanValue(), (Boolean)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)779354614032407436L), (long)789438897355831922L))));
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

    private Color K(Object[] objectArray) {
        Object object = objectArray[0];
        CallSite callSite = hi.a("G", (int)hi.a("\u00a5", (Object)((Color)object), (long)634502724407806770L), (int)hi.a("\u00a5", (Object)((Color)object), (long)791634218836538619L), (int)hi.a("\u00a5", (Object)((Color)object), (long)505295769199362574L), null, (long)561994504247903076L);
        CallSite callSite2 = es.n("jP5Jbrj5GNBqGIdF", HSBtoRGB(float float float ), (float)callSite[0], (float)callSite[1], (float)(callSite[2] * 0.6f));
        return new Color((int)callSite2);
    }

    private static vC lambda$render$2(long l, e e2) {
        return new vC(l);
    }

    private boolean lambda$new$15() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1291403366754824763L), (Object)hi.a("j", (long)759653898638966483L), (long)511460060498514638L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$9() {
        Object object;
        block3: {
            block5: {
                boolean bl;
                block4: {
                    block2: {
                        bl = Dl.S();
                        object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
                        if (!bl) break block2;
                        if (object == false) break block3;
                        object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)779354614032407436L), (long)789438897355831922L))), (long)1000026253634408124L);
                    }
                    if (!bl) break block4;
                    if (object == false) break block3;
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503779284687127672L), (Object)hi.a("j", (long)759653898638966483L), (long)511460060498514638L);
                }
                if (!bl) return (boolean)object;
                if (object != false) break block5;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)503779284687127672L), (Object)hi.a("j", (long)366244132724352704L), (long)511460060498514638L);
                if (!bl) return (boolean)object;
                if (object == false) break block3;
            }
            object = true;
            return (boolean)object;
        }
        object = false;
        return (boolean)object;
    }

    private boolean lambda$new$0() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$5() {
        Object object;
        block5: {
            boolean bl;
            block4: {
                bl = Dl.t();
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)968680372016155750L), (Object)hi.a("j", (long)681556865598572403L), (long)511460060498514638L);
                if (bl) break block4;
                if (object == false) break block5;
                object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)837593051663616410L), (long)789438897355831922L))), (long)1000026253634408124L);
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

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x59A3) & 0xFFFF;
        if (eb[n3] == null) {
            int n4;
            char[] cArray = db[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 91;
                case 1 -> 222;
                case 2 -> 32;
                case 3 -> 92;
                case 4 -> 94;
                case 5 -> 22;
                case 6 -> 193;
                case 7 -> 108;
                case 8 -> 116;
                case 9 -> 7;
                case 10 -> 48;
                case 11 -> 14;
                case 12 -> 112;
                case 13 -> 141;
                case 14 -> 214;
                case 15 -> 93;
                case 16 -> 50;
                case 17 -> 245;
                case 18 -> 199;
                case 19 -> 23;
                case 20 -> 58;
                case 21 -> 90;
                case 22 -> 235;
                case 23 -> 11;
                case 24 -> 98;
                case 25 -> 120;
                case 26 -> 79;
                case 27 -> 168;
                case 28 -> 47;
                case 29 -> 158;
                case 30 -> 111;
                case 31 -> 55;
                case 32 -> 60;
                case 33 -> 20;
                case 34 -> 102;
                case 35 -> 5;
                case 36 -> 118;
                case 37 -> 30;
                case 38 -> 148;
                case 39 -> 229;
                case 40 -> 241;
                case 41 -> 150;
                case 42 -> 145;
                case 43 -> 96;
                case 44 -> 196;
                case 45 -> 2;
                case 46 -> 232;
                case 47 -> 176;
                case 48 -> 101;
                case 49 -> 226;
                case 50 -> 236;
                case 51 -> 9;
                case 52 -> 156;
                case 53 -> 165;
                case 54 -> 110;
                case 55 -> 191;
                case 56 -> 195;
                case 57 -> 212;
                case 58 -> 123;
                case 59 -> 82;
                case 60 -> 227;
                case 61 -> 80;
                case 62 -> 153;
                case 63 -> 190;
                case 64 -> 215;
                case 65 -> 52;
                case 66 -> 124;
                case 67 -> 21;
                case 68 -> 243;
                case 69 -> 27;
                case 70 -> 65;
                case 71 -> 87;
                case 72 -> 217;
                case 73 -> 140;
                case 74 -> 68;
                case 75 -> 131;
                case 76 -> 3;
                case 77 -> 249;
                case 78 -> 67;
                case 79 -> 155;
                case 80 -> 230;
                case 81 -> 142;
                case 82 -> 105;
                case 83 -> 206;
                case 84 -> 143;
                case 85 -> 0;
                case 86 -> 15;
                case 87 -> 252;
                case 88 -> 201;
                case 89 -> 77;
                case 90 -> 81;
                case 91 -> 132;
                case 92 -> 169;
                case 93 -> 202;
                case 94 -> 197;
                case 95 -> 159;
                case 96 -> 34;
                case 97 -> 104;
                case 98 -> 237;
                case 99 -> 209;
                case 100 -> 71;
                case 101 -> 170;
                case 102 -> 162;
                case 103 -> 228;
                case 104 -> 114;
                case 105 -> 220;
                case 106 -> 207;
                case 107 -> 205;
                case 108 -> 225;
                case 109 -> 181;
                case 110 -> 28;
                case 111 -> 128;
                case 112 -> 244;
                case 113 -> 13;
                case 114 -> 136;
                case 115 -> 152;
                case 116 -> 208;
                case 117 -> 224;
                case 118 -> 240;
                case 119 -> 43;
                case 120 -> 248;
                case 121 -> 36;
                case 122 -> 161;
                case 123 -> 129;
                case 124 -> 189;
                case 125 -> 31;
                case 126 -> 233;
                case 127 -> 247;
                case 128 -> 216;
                case 129 -> 179;
                case 130 -> 103;
                case 131 -> 167;
                case 132 -> 184;
                case 133 -> 49;
                case 134 -> 239;
                case 135 -> 242;
                case 136 -> 200;
                case 137 -> 174;
                case 138 -> 40;
                case 139 -> 223;
                case 140 -> 125;
                case 141 -> 151;
                case 142 -> 97;
                case 143 -> 17;
                case 144 -> 107;
                case 145 -> 26;
                case 146 -> 218;
                case 147 -> 78;
                case 148 -> 147;
                case 149 -> 74;
                case 150 -> 88;
                case 151 -> 163;
                case 152 -> 183;
                case 153 -> 130;
                case 154 -> 76;
                case 155 -> 83;
                case 156 -> 59;
                case 157 -> 188;
                case 158 -> 56;
                case 159 -> 234;
                case 160 -> 134;
                case 161 -> 231;
                case 162 -> 37;
                case 163 -> 10;
                case 164 -> 133;
                case 165 -> 4;
                case 166 -> 122;
                case 167 -> 61;
                case 168 -> 72;
                case 169 -> 221;
                case 170 -> 138;
                case 171 -> 57;
                case 172 -> 38;
                case 173 -> 46;
                case 174 -> 154;
                case 175 -> 160;
                case 176 -> 115;
                case 177 -> 66;
                case 178 -> 185;
                case 179 -> 139;
                case 180 -> 171;
                case 181 -> 144;
                case 182 -> 146;
                case 183 -> 149;
                case 184 -> 238;
                case 185 -> 246;
                case 186 -> 127;
                case 187 -> 19;
                case 188 -> 6;
                case 189 -> 204;
                case 190 -> 113;
                case 191 -> 44;
                case 192 -> 53;
                case 193 -> 8;
                case 194 -> 121;
                case 195 -> 41;
                case 196 -> 100;
                case 197 -> 24;
                case 198 -> 70;
                case 199 -> 69;
                case 200 -> 85;
                case 201 -> 95;
                case 202 -> 253;
                case 203 -> 213;
                case 204 -> 106;
                case 205 -> 109;
                case 206 -> 18;
                case 207 -> 250;
                case 208 -> 84;
                case 209 -> 33;
                case 210 -> 119;
                case 211 -> 135;
                case 212 -> 164;
                case 213 -> 166;
                case 214 -> 172;
                case 215 -> 117;
                case 216 -> 254;
                case 217 -> 255;
                case 218 -> 182;
                case 219 -> 99;
                case 220 -> 86;
                case 221 -> 173;
                case 222 -> 198;
                case 223 -> 175;
                case 224 -> 45;
                case 225 -> 12;
                case 226 -> 186;
                case 227 -> 62;
                case 228 -> 203;
                case 229 -> 64;
                case 230 -> 126;
                case 231 -> 137;
                case 232 -> 54;
                case 233 -> 180;
                case 234 -> 187;
                case 235 -> 63;
                case 236 -> 178;
                case 237 -> 42;
                case 238 -> 219;
                case 239 -> 29;
                case 240 -> 177;
                case 241 -> 251;
                case 242 -> 35;
                case 243 -> 157;
                case 244 -> 211;
                case 245 -> 192;
                case 246 -> 89;
                case 247 -> 210;
                case 248 -> 73;
                case 249 -> 25;
                case 250 -> 51;
                case 251 -> 1;
                case 252 -> 194;
                case 253 -> 16;
                case 254 -> 39;
                default -> 75;
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
            es.eb[n3] = new String(cArray).intern();
        }
        return eb[n3];
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A77;
        if (mb[n2] == null) {
            es.mb[n2] = (int)(lb[n2] ^ l);
        }
        return mb[n2];
    }

    private static long e(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x7A15) & Short.MAX_VALUE;
        if (ob[n2] == null) {
            es.ob[n2] = nb[n2] ^ l;
        }
        return ob[n2];
    }
}
