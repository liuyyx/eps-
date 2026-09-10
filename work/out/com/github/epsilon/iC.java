/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DF;
import com.github.epsilon.Dl;
import com.github.epsilon._E;
import com.github.epsilon.dK;
import com.github.epsilon.hi;
import com.github.epsilon.iN;
import com.github.epsilon.l1;
import com.github.epsilon.lE;
import com.github.epsilon.nH;
import com.github.epsilon.uT;
import com.github.epsilon.vY;
import com.github.epsilon.zU;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iC
extends iN {
    private static final float l = 7.0f;
    private static final int m;
    private final List<l1> F = new ArrayList<l1>();
    private static final float K = 0.88f;
    private static final float C = 30.0f;
    private final lE E;
    private static final float D = 7.0f;
    private static final String[] d;
    private static final String[] i;
    private static final long[] n;
    private static final Integer[] s;

    private int y() {
        return (int)hi.a("G", (double)((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)647941093962333774L), (long)417939159730395915L) / 4.0f), (long)765596804033182836L);
    }

    @Override
    public boolean M(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n3;
        objectArray2[1] = n2;
        objectArray2[0] = n;
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)635740873171577152L), (Object)objectArray2, (long)688430707181207232L);
    }

    public iC(int n, Consumer<String> consumer, BooleanSupplier booleanSupplier, nH nH2) {
        super(iC.b(-1770, -1137), (String)((Object)hi.a("j", (long)830189880791915820L)), "", n);
        hi.a("\u00f2", (Object)this, (float)160.0f, (long)658297474044504383L);
        this.E = new lE(iC.b(-1769, -7004), (List<Dl<?>>)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)805278995556620379L), (long)1326963796677527158L)));
        hi.a("\u00a5", (Object)this, (Object)new Object[]{true}, (long)636467708964734443L);
        hi.a("\u00a5", (Object)this, (Object)new Object[]{true}, (long)882705255860052915L);
        CallSite callSite = hi.a("j", (long)1119278030115886606L);
        hi.a("G", (Object)callSite, (long)374764797691957710L);
        hi.a("\u00a5", (Object)this, ((vY)((Object)callSite))::R, (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1119278030115886606L), (long)1218053806151603752L), (Object)iC.b(-1774, 17800), consumer, (Object)nH2, (long)1124103987076204866L);
        CallSite callSite2 = hi.a("j", (long)526176563220736169L);
        hi.a("G", (Object)callSite2, (long)374764797691957710L);
        hi.a("\u00a5", (Object)this, ((vY)((Object)callSite2))::R, (Object)hi.a("\u00e9", (Object)hi.a("j", (long)526176563220736169L), (long)1218053806151603752L), (Object)iC.b(-1771, 27254), consumer, (Object)nH2, (long)1124103987076204866L);
        CallSite callSite3 = hi.a("j", (long)456237291118568391L);
        hi.a("G", (Object)callSite3, (long)374764797691957710L);
        iC.E("Hvr6PoJyaDIcd4wo", h(java.lang.Object java.lang.Object java.lang.Object java.lang.Object java.lang.Object ), (iC)this, ((vY)((Object)callSite3))::R, (Object)hi.a("\u00e9", (Object)hi.a("j", (long)456237291118568391L), (long)1218053806151603752L), (Object)iC.b(-1775, -14177), consumer, (Object)nH2);
        CallSite callSite4 = hi.a("j", (long)1050408241407708132L);
        hi.a("G", (Object)callSite4, (long)374764797691957710L);
        hi.a("\u00a5", (Object)this, ((vY)((Object)callSite4))::R, (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1050408241407708132L), (long)1218053806151603752L), (Object)iC.b(-1773, 2389), consumer, (Object)nH2, (long)1124103987076204866L);
        CallSite callSite5 = hi.a("j", (long)1086737293243383048L);
        hi.a("G", (Object)callSite5, (long)374764797691957710L);
        hi.a("\u00a5", (Object)this, ((uT)((Object)callSite5))::a, (Object)"\uea21", (Object)iC.b(-1776, -2384), consumer, (Object)nH2, (long)1124103987076204866L);
        CallSite callSite6 = hi.a("j", (long)924353054980639537L);
        hi.a("G", (Object)callSite6, (long)374764797691957710L);
        hi.a("\u00a5", (Object)this, ((uT)((Object)callSite6))::a, (Object)"\ue8b8", (Object)iC.b(-1762, -5459), consumer, (Object)nH2, (long)1124103987076204866L);
        CallSite callSite7 = hi.a("j", (long)361617621454431721L);
        iC.E("Hvr6PoJyaDIcd4wo", requireNonNull(T ), (Object)callSite7);
        hi.a("\u00a5", (Object)this, ((uT)((Object)callSite7))::a, (Object)"\ue145", (Object)iC.b(-1761, 25177), consumer, (Object)nH2, (long)1124103987076204866L);
        CallSite callSite8 = hi.a("\u00e9", (Object)this, (long)647941093962333774L);
        CallSite callSite9 = hi.a("j", (long)864821098406590967L);
        hi.a("G", (Object)callSite9, (long)374764797691957710L);
        hi.a("\u00a5", (Object)callSite8, (Object)new l1(this, ((uT)((Object)callSite9))::a, "\ue5cd", iC.b(-1772, 22450), consumer, booleanSupplier), (long)615358212536192384L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected void p(Object[] var1_1) {
        block59: {
            block58: {
                block57: {
                    block60: {
                        var2_2 = (zU)var1_1[0];
                        var3_3 = (DF)var1_1[1];
                        var6_4 = (Integer)var1_1[2];
                        var5_5 = (Integer)var1_1[3];
                        var4_6 = ((Float)var1_1[4]).floatValue();
                        var7_7 = Dl.S();
                        var24_8 /* !! */  = hi.a("G", (int)(iC.b(16215, 6998589996447995731L) + iC.b(11513, 6476756021119681770L)), (int)iC.b(17265, 8519503847937698583L), (long)834203424483934088L) - iC.b(13021, 1584219679395748598L) + iC.b(22092, 6423594833767562822L) + iC.b(17473, 3768423026514095216L);
                        if (var7_7) break block60;
lbl10:
                        // 2 sources

                        while (true) {
                            block61: {
                                var8_9 = hi.a("\u00e9", (Object)this, (long)779410745152911181L) + 28.0f - hi.a("\u00e9", (Object)this, (long)566188503515283251L) + 7.0f;
                                iC.E("Hvr6PoJyaDIcd4wo", m(float float float float java.awt.Color ), (zU)var2_2, (float)(hi.a("\u00e9", (Object)this, (long)1002927700257889382L) + 7.0f), (float)(hi.a("\u00e9", (Object)this, (long)779410745152911181L) + 28.0f), (float)(hi.a("\u00e9", (Object)this, (long)658297474044504383L) - 14.0f), (float)0.7f, (Color)hi.a("G", (Object)hi.a("j", (long)787573419855687315L), (int)iC.b(29565, 5168601869543660465L), (long)950630386023407477L));
                                var9_10 = 0;
                                if (!var7_7) break block61;
                                var24_8 /* !! */  = (CallSite)(iC.E("Hvr6PoJyaDIcd4wo", max(int int ), (int)iC.b(13649, 3173120440847998317L), (int)iC.b(17203, 4825102020061621058L)) / 4 ^ iC.b(29950, 805610594838436916L));
                                if (var7_7) break block57;
                                ** GOTO lbl24
                            }
lbl19:
                            // 2 sources

                            while (true) {
                                block63: {
                                    block62: {
                                        v0 = var9_10;
                                        v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)647941093962333774L), (long)417939159730395915L);
                                        if (!var7_7) break block62;
                                        if (v0 < v1 /* !! */ ) break block63;
lbl24:
                                        // 2 sources

                                        v0 = (iC.b(6696, 7252948538945974853L) / iC.b(16196, 6802485838156601101L) + iC.b(24619, 8998681730125940829L)) * iC.b(19699, 5044754295202538532L);
                                        v1 /* !! */  = (CallSite)iC.b(23916, 6366003098566751651L);
                                    }
                                    var24_8 /* !! */  = (CallSite)(v0 ^ v1 /* !! */ );
                                    if (var7_7) break block57;
                                }
                                var24_8 /* !! */  = (CallSite)((iC.b(5554, 459977836759399871L) ^ iC.b(15568, 4348563151650460694L)) + iC.b(570, 4065307134251117290L));
                                break block57;
                                break;
                            }
                            break;
                        }
lbl32:
                        // 2 sources

                        while (true) {
                            hi.a("G", (long)767645364166240833L);
lbl34:
                            // 2 sources

                            while (true) {
                                block76: {
                                    block75: {
                                        block73: {
                                            block74: {
                                                block72: {
                                                    block71: {
                                                        block70: {
                                                            block68: {
                                                                block69: {
                                                                    block67: {
                                                                        block66: {
                                                                            block65: {
                                                                                block64: {
                                                                                    iC.E("Hvr6PoJyaDIcd4wo", g(float ), (_E)v2, (float)v3);
                                                                                    var16_17 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)var10_11, (long)678083580429231675L), (long)1167668381225401548L);
                                                                                    v4 /* !! */  = var15_16;
                                                                                    if (!var7_7) break block64;
                                                                                    if (v4 /* !! */  != false) break block65;
                                                                                    v4 /* !! */  = var24_8 /* !! */  = (CallSite)((iC.b(13126, 3054122881493605300L) * iC.b(8460, 2793326370710292749L) ^ iC.b(9567, 2383056032715509092L)) / iC.b(32751, 7322109111712110387L) - iC.b(6610, 1491260864120729992L) + iC.b(27308, 2749687422720393967L));
                                                                                }
                                                                                if (var7_7) break block66;
                                                                            }
                                                                            var24_8 /* !! */  = (CallSite)((hi.a("G", (int)iC.b(21883, 5763097351588314415L), (int)iC.b(27441, 3633132642969764622L), (long)834203424483934088L) ^ iC.b(13196, 3933096828874038246L)) * iC.b(27472, 1853767858005951261L) ^ iC.b(4622, 4511419686258391561L));
                                                                        }
                                                                        switch (var24_8 /* !! */ ) {
                                                                            default: {
                                                                                v5 = hi.a("j", (long)817827339599640798L);
                                                                                var24_8 /* !! */  = (CallSite)(iC.b(2071, 2741276301312663620L) + iC.b(13648, 2049239176461327688L) + iC.b(13648, 5190727374456495478L));
                                                                                if (!var7_7) {
                                                                                    break;
                                                                                }
                                                                                break block67;
                                                                            }
                                                                            case -602326609: {
                                                                                v5 = hi.a("j", (long)1257914836987805569L);
                                                                                if (var7_7) break;
                                                                                break block68;
                                                                            }
                                                                            case -602326608: {
                                                                                hi.a("G", (int)iC.b(24599, 1230753657221531694L), (boolean)false, (long)1190895299724682476L);
                                                                                hi.a("G", (int)1, (long)407949291996956271L);
                                                                                return;
                                                                            }
                                                                        }
                                                                        var24_8 /* !! */  = (CallSite)(iC.b(6594, 8050364532864037334L) + iC.b(21070, 4338106304628718187L) + iC.b(13466, 5680726574456249427L));
                                                                    }
                                                                    v6 /* !! */  = var24_8 /* !! */ ;
                                                                    if (!var7_7) break block69;
                                                                    switch (v6 /* !! */ ) {
                                                                        default: {
                                                                            break block68;
                                                                        }
                                                                        case -805461102: {
                                                                            v6 /* !! */  = (CallSite)true;
                                                                        }
                                                                    }
                                                                }
                                                                hi.a("G", (boolean)v6 /* !! */ , (long)1315516439304393687L);
                                                                hi.a("G", (long)1085489360135419778L);
                                                            }
                                                            hi.a("\u00a5", (Object)var2_2, (float)var11_12, (float)var13_14, (float)30.0f, (float)30.0f, (float)5.0f, (Object)hi.a("G", (Object)v5, (Object)hi.a("j", (long)817827339599640798L), (float)(var16_17 * 0.5f), (long)1032418514208893637L), (long)776507817655946365L);
                                                            var17_18 = 0.88f;
                                                            v7 = new Object[3];
                                                            v7[2] = hi.a("j", (long)1254631756863587562L);
                                                            v7[1] = Float.valueOf(var17_18);
                                                            v7[0] = hi.a("\u00e9", (Object)var10_11, (long)1159945039918925651L);
                                                            var18_19 = hi.a("\u00a5", (Object)var3_3, (Object)v7, (long)1311465436116519370L);
                                                            v8 = new Object[2];
                                                            v8[1] = hi.a("j", (long)1254631756863587562L);
                                                            v8[0] = Float.valueOf(var17_18);
                                                            var19_20 = hi.a("\u00a5", (Object)var3_3, (Object)v8, (long)664409803410481719L);
                                                            v9 = hi.a("\u00e9", (Object)var10_11, (long)1159945039918925651L);
                                                            v10 = var11_12 + (30.0f - var18_19) * 0.5f;
                                                            v11 = var13_14 + (30.0f - var19_20) / 2.0f;
                                                            v12 /* !! */  = var15_16;
                                                            if (!var7_7) break block70;
                                                            if (v12 /* !! */  != false) break block71;
                                                            v12 /* !! */  = var24_8 /* !! */  = hi.a("G", (int)iC.b(14068, 2699891658196491939L), (int)iC.b(26710, 5564720770394210397L), (long)834203424483934088L) + iC.b(254, 2123878411574945855L) - iC.b(20231, 1991618345477793581L);
                                                        }
                                                        if (var7_7) break block72;
                                                    }
                                                    var24_8 /* !! */  = (CallSite)((iC.b(24542, 9191322548832565013L) ^ iC.b(7183, 6449347320329057482L)) * iC.b(21921, 6163487503271558561L) + iC.b(13704, 1997704050035924303L));
                                                }
                                                switch (var24_8 /* !! */ ) {
                                                    default: {
                                                        v13 = hi.a("j", (long)433333639448026825L);
                                                        var24_8 /* !! */  = (CallSite)(iC.b(25959, 7619461814733458717L) + iC.b(23104, 4513078430278906423L) + iC.b(17312, 3689158508733688776L) ^ iC.b(18755, 4470410231419134255L));
                                                        if (var7_7) break block73;
                                                        break block74;
                                                    }
                                                    case 1040726684: {
                                                        hi.a("G", (long)1206926475581937118L);
                                                        hi.a("G", (long)881105324151579743L);
                                                        break;
                                                    }
                                                    case 1040726686: 
                                                }
                                                v13 = hi.a("j", (long)692578069409858836L);
                                                if (var7_7) break block74;
                                                ** GOTO lbl-1000
                                            }
                                            var24_8 /* !! */  = (CallSite)(iC.b(11476, 4117800001902085371L) + iC.b(29429, 4925780907903769278L) + iC.b(26370, 5147735342168199020L) ^ iC.b(28673, 6553947527320754416L));
                                        }
                                        switch (var24_8 /* !! */ ) {
                                            case 1799028672: lbl-1000:
                                            // 2 sources

                                            {
                                                hi.a("G", (long)859258361668446808L);
                                                break;
                                            }
                                        }
                                        hi.a("\u00a5", (Object)var2_2, (Object)v9, (float)v10, (float)v11, (float)var17_18, (Object)v13, (Object)hi.a("j", (long)1254631756863587562L), (long)1054750863256699983L);
                                        v14 /* !! */  = var14_15;
                                        if (!var7_7) break block75;
                                        if (v14 /* !! */  != false) break block76;
                                        v14 /* !! */  = var24_8 /* !! */  = (CallSite)(iC.b(19459, 8374197775875171441L) * iC.b(18069, 7802639206209252965L) - iC.b(9677, 5549458321198878176L));
                                    }
                                    if (var7_7) break block58;
                                }
                                var24_8 /* !! */  = (CallSite)(hi.a("G", (int)(iC.b(6763, 7482115048724476539L) ^ iC.b(17376, 6493513125409024819L) ^ iC.b(7102, 5124853242951283598L)), (int)iC.b(6755, 1556522697867473497L), (long)834203424483934088L) ^ iC.b(26360, 6026885666414317286L) ^ iC.b(24114, 1945003552746206975L));
                                break block58;
                                break;
                            }
                            break;
                        }
lbl136:
                        // 2 sources

                        while (true) {
                            ++var9_10;
                            if (var7_7) break block59;
                            ** GOTO lbl195
                            break;
                        }
                    }
                    while (true) {
                        switch (var24_8 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -33229663: 
                        }
                        hi.a("G", (long)1208540510591910900L);
                        hi.a("G", (long)1127763923712469243L);
                        var24_8 /* !! */  = (CallSite)(iC.b(29949, 4251741068136471741L) / iC.b(29051, 4414885129883441411L) ^ iC.b(24549, 530610564149344255L));
                    }
                }
lbl153:
                // 2 sources

                while (true) {
                    switch (var24_8 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -927324106: {
                            var10_11 = (l1)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)647941093962333774L), (int)var9_10, (long)516183098926246296L);
                            var11_12 = hi.a("\u00a5", (Object)this, (int)var9_10, (long)838980452495114316L);
                            var12_13 = var9_10 / 4;
                            var13_14 = var8_9 + (float)var12_13 * 37.0f;
                            var14_15 = hi.a("\u00a5", (Object)this, (double)var6_4, (double)var5_5, (float)var11_12, (float)var13_14, (float)30.0f, (float)30.0f, (long)418030414959741088L);
                            var15_16 = hi.a("\u00a5", (Object)var10_11, (Object)new Object[0], (long)1236988309355389425L);
                            v2 = hi.a("\u00e9", (Object)var10_11, (long)678083580429231675L);
                            v15 /* !! */  = var14_15;
                            if (!var7_7) ** GOTO lbl172
                            if (v15 /* !! */  == false) ** GOTO lbl171
                            ** GOTO lbl173
                        }
                        case -927324107: {
                            ** GOTO lbl195
                        }
lbl171:
                        // 1 sources

                        v15 /* !! */  = var24_8 /* !! */  = (CallSite)((iC.b(27777, 7320473577022375140L) / iC.b(22603, 5374734164223553605L) - iC.b(25335, 3287120612484991630L)) / iC.b(11991, 7983964103275415246L) - iC.b(22202, 8047497511467155074L));
lbl172:
                        // 2 sources

                        if (var7_7) ** GOTO lbl174
lbl173:
                        // 2 sources

                        var24_8 /* !! */  = (CallSite)((iC.b(8282, 2072045241347868683L) ^ iC.b(27204, 8869093626262536785L)) - iC.b(16897, 7941765576088447589L));
lbl174:
                        // 2 sources

                        switch (var24_8 /* !! */ ) {
                            default: {
                                v3 = 1.0f;
                                var24_8 /* !! */  = (CallSite)(iC.E("Hvr6PoJyaDIcd4wo", max(int int ), (int)(iC.b(13902, 1989255951752207896L) ^ iC.b(19417, 1642532061293339600L)), (int)iC.b(25995, 2391284517305044471L)) ^ iC.b(3977, 1819556141294954472L));
                                if (!var7_7) {
                                    break;
                                }
                                ** GOTO lbl191
                            }
                            case 159417324: {
                                v3 = 0.0f;
                                if (var7_7) break;
                                ** GOTO lbl32
                            }
                            case 159417326: {
                                iC.E("Hvr6PoJyaDIcd4wo", values());
                                return;
                            }
                        }
                        var24_8 /* !! */  = (CallSite)(hi.a("G", (int)(iC.b(13249, 1966842698807188251L) ^ iC.b(2058, 4088946865422213314L)), (int)iC.b(1577, 5393757376645148233L), (long)834203424483934088L) ^ iC.b(24993, 6887262261186906550L));
lbl191:
                        // 2 sources

                        switch (var24_8 /* !! */ ) {
                            case -2100473572: {
                                ** continue;
                            }
                        }
                        ** continue;
lbl195:
                        // 2 sources

                        var9_10 = iC.E("Hvr6PoJyaDIcd4wo", y(), (iC)this);
                        hi.a("\u00a5", (Object)var2_2, (float)(hi.a("\u00e9", (Object)this, (long)1002927700257889382L) + 7.0f), (float)((var8_9 += (float)var9_10 * 30.0f + (float)hi.a("G", (int)0, (int)(var9_10 - 1), (long)834203424483934088L) * 7.0f + 4.0f + 7.0f) - 3.0f), (float)(hi.a("\u00e9", (Object)this, (long)658297474044504383L) - 14.0f), (float)0.7f, (Object)iC.E("Hvr6PoJyaDIcd4wo", t(java.awt.Color int ), (Color)hi.a("j", (long)787573419855687315L), (int)iC.b(3383, 6077645599032124725L)), (long)941115194411145692L);
                        v16 = new Object[8];
                        v16[7] = (int)hi.a("\u00a5", (Object)this, (long)437369506342636652L);
                        v16[6] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)658297474044504383L));
                        v16[5] = Float.valueOf((float)var8_9);
                        v16[4] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)1002927700257889382L));
                        v16[3] = var5_5;
                        v16[2] = var6_4;
                        v16[1] = var3_3;
                        v16[0] = var2_2;
                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)635740873171577152L), (Object)v16, (long)1172577116858886200L);
                        return;
                        case -927324105: 
                    }
                    return;
                }
            }
            do {
                switch (var24_8 /* !! */ ) {
                    default: {
                        var20_21 = iC.E("Hvr6PoJyaDIcd4wo", A(), (dK)hi.a("\u00e9", (Object)var10_11, (long)925797021908234438L));
                        var21_22 = 0.42f;
                        var22_23 = hi.a("\u00a5", (Object)var3_3, (Object)var20_21, (float)var21_22, (long)1155556520700012610L);
                        var23_24 = hi.a("G", (float)(var11_12 + (30.0f - var22_23) * 0.5f), (float)(hi.a("\u00e9", (Object)this, (long)1002927700257889382L) + 2.0f), (float)(hi.a("\u00e9", (Object)this, (long)1002927700257889382L) + hi.a("\u00e9", (Object)this, (long)658297474044504383L) - var22_23 - 2.0f), (long)390336973585993938L);
                        hi.a("\u00a5", (Object)var2_2, (Object)var20_21, (float)var23_24, (float)(var13_14 + 30.0f + 1.0f), (float)var21_22, (Object)hi.a("j", (long)574625695807352444L), (long)487875072643634565L);
                        if (var7_7) break;
                        ** GOTO lbl136
                    }
                    case -41672099: {
                        ** continue;
                    }
                    case -41672100: {
                        return;
                    }
                }
                var24_8 /* !! */  = (CallSite)(iC.b(20809, 6976867745820113303L) * iC.b(2935, 8758158935888634670L) - iC.b(28341, 8678251878162056849L));
            } while (var7_7);
        }
        var24_8 /* !! */  = (CallSite)(hi.a("G", (int)iC.b(22350, 3310274145276493609L), (int)iC.b(15106, 7589376919179465559L), (long)834203424483934088L) / 4 ^ iC.b(3915, 4053614156405876605L));
        ** while (true)
    }

    @Override
    protected boolean N(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        int n = (Integer)objectArray[2];
        CallSite callSite = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)756685708618760569L);
        return (boolean)iC.E("Hvr6PoJyaDIcd4wo", D(double double int float float float ), (lE)((Object)hi.a("\u00e9", (Object)this, (long)635740873171577152L)), (double)d, (double)d2, (int)n, (float)hi.a("\u00e9", (Object)this, (long)1002927700257889382L), (float)callSite, (float)hi.a("\u00e9", (Object)this, (long)658297474044504383L));
    }

    public static /* bridge */ /* synthetic */ CallSite E(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    @Override
    public boolean v() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)635740873171577152L), (Object)new Object[0], (long)503322850480747549L);
    }

    private static boolean lambda$add$0(nH nH2, String string) {
        return (boolean)hi.a("\u00a5", (Object)nH2, (Object)string, (long)402322001901370044L);
    }

    @Override
    public boolean t(Object[] objectArray) {
        String string = (String)objectArray[0];
        return (boolean)iC.E("Hvr6PoJyaDIcd4wo", L(java.lang.String ), (lE)((Object)hi.a("\u00e9", (Object)this, (long)635740873171577152L)), (String)string);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private void h(Object object, Object object2, Object object3, Object object4, Object object5) {
        iC.E("Hvr6PoJyaDIcd4wo", add(E ), (List)((Object)hi.a("\u00e9", (Object)this, (long)647941093962333774L)), (Object)new l1(this, (dK)object, (String)object2, (String)object3, (Consumer)object4, () -> iC.lambda$add$0((nH)object5, (String)object3)));
    }

    private float g(int n) {
        int n2 = n / 4 * 4;
        CallSite callSite = hi.a("G", (int)4, (int)(iC.E("Hvr6PoJyaDIcd4wo", size(), (List)((Object)hi.a("\u00e9", (Object)this, (long)647941093962333774L))) - n2), (long)476721548361853495L);
        float f = (float)callSite * 30.0f + (float)hi.a("G", (int)0, (int)(callSite - true), (long)834203424483934088L) * 7.0f;
        reference var5_5 = hi.a("\u00e9", (Object)this, (long)1002927700257889382L) + (hi.a("\u00e9", (Object)this, (long)658297474044504383L) - f) * 0.5f;
        return (float)(var5_5 + (float)(n - n2) * 37.0f);
    }

    private float t(Object[] objectArray) {
        CallSite callSite = hi.a("\u00a5", (Object)this, (long)1156152195202378197L);
        return (float)(hi.a("\u00e9", (Object)this, (long)779410745152911181L) + 28.0f - hi.a("\u00e9", (Object)this, (long)566188503515283251L) + 7.0f + (float)callSite * 30.0f + (float)hi.a("G", (int)0, (int)(callSite - true), (long)834203424483934088L) * 7.0f + 8.0f + 7.0f);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void X(Object[] var1_1) {
        var3_2 = (zU)var1_1[0];
        var2_3 = (DF)var1_1[1];
        var4_4 = Dl.S();
        var11_5 /* !! */  = iC.b(16091, 7966204442263819992L) / iC.b(22889, 9100994532937068833L) ^ iC.b(9015, 9055634639395162984L);
        if (!var4_4) ** GOTO lbl-1000
        switch (var11_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v0 = new Object[2];
                v0[1] = var2_3;
                v0[0] = var3_2;
                super.X(v0);
                var5_6 = 0.48f;
                var6_7 = hi.a("\u00e9", (Object)this, (long)1002927700257889382L) + hi.a("\u00a5", (Object)var2_3, (Object)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1320040104140983002L), (float)0.82f, (long)1155556520700012610L) + 12.0f;
                var7_8 = hi.a("\u00e9", (Object)this, (long)1002927700257889382L) + hi.a("\u00e9", (Object)this, (long)658297474044504383L) - 17.0f - var6_7;
                cfr_temp_0 = var7_8 - 2.0f;
                v1 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (!var4_4) ** GOTO lbl61
                if (v1 /* !! */  > 0) ** GOTO lbl60
                if (true) ** GOTO lbl63
            }
            case 400799422: {
                throw null;
            }
        }
        block11: while (true) {
            block18: {
                block17: {
                    block16: {
                        switch (var11_5 /* !! */ ) {
                            case -1743005051: {
                                var8_9 = hi.a("\u00a5", (Object)this, (Object)hi.a("j", (long)870601565218635290L), (float)var5_6, (float)var7_8, (Object)var2_3, (long)1262471186607676853L);
                                v2 = hi.a("\u00a5", (Object)var8_9, (long)361382094905603987L);
                                if (!var4_4) break block16;
                                if (v2 != false) break;
                                break block17;
                            }
                            case -1743005052: {
                                throw null;
                            }
                        }
                        v2 = (hi.a("G", (int)iC.b(13672, 3771849632608722250L), (int)iC.b(24267, 4962580258392372880L), (long)834203424483934088L) - iC.b(9988, 1192388696016916471L)) / iC.b(6563, 5506596504327401842L) - iC.b(21868, 1781738140435447215L);
                    }
                    var11_5 /* !! */  = (int)v2;
                    if (var4_4) break block18;
                }
                var11_5 /* !! */  = (iC.b(18598, 4212750968429830304L) ^ iC.b(20633, 5513444393113385039L)) * iC.b(2923, 5695678977173857123L) - iC.b(28795, 3940397922317949019L) - iC.b(9689, 1210990113820642715L) + iC.b(29193, 755658626001459831L);
                break block18;
                return;
            }
            block12: while (true) {
                switch (var11_5 /* !! */ ) {
                    default: {
                        var9_10 = hi.a("\u00e9", (Object)this, (long)779410745152911181L) + (28.0f - hi.a("\u00a5", (Object)var2_3, (float)0.82f, (long)470446160550961215L)) * 0.5f;
                        var10_11 = var9_10 + hi.a("\u00a5", (Object)var2_3, (float)0.82f, (long)470446160550961215L) - hi.a("\u00a5", (Object)var2_3, (float)var5_6, (long)470446160550961215L);
                        hi.a("\u00a5", (Object)var3_2, (Object)var8_9, (float)var6_7, (float)var10_11, (float)var5_6, (Object)hi.a("j", (long)574625695807352444L), (long)487875072643634565L);
                        if (!var4_4) {
                            return;
                        }
                        ** GOTO lbl65
                    }
                    case 1477169203: {
                        hi.a("G", (float)-0.5f, (float)-1.0f, (float)-1.0f, (float)0.5f, (long)1107932821409857423L);
                        var11_5 /* !! */  = (int)(hi.a("G", (int)(iC.b(8771, 1246914371349875206L) + iC.b(32347, 3644968293788931698L)), (int)iC.b(2535, 3228526828907962875L), (long)834203424483934088L) / iC.b(29114, 613060685796334031L) - iC.b(4815, 3088130609366481599L));
                        if (var4_4) continue block12;
lbl60:
                        // 2 sources

                        v1 /* !! */  = (reference)((iC.b(24283, 5468229686080272032L) - iC.b(8751, 5462828330086140521L) ^ iC.b(2471, 3828439946844807544L)) - iC.b(19828, 2174962790906357164L));
lbl61:
                        // 2 sources

                        var11_5 /* !! */  = (int)v1 /* !! */ ;
                        if (var4_4) continue block11;
lbl63:
                        // 2 sources

                        var11_5 /* !! */  = (iC.b(6838, 6841232686912090754L) ^ iC.b(19952, 2176959967649326551L)) - iC.b(4800, 8724205747356089053L);
                        continue block11;
                    }
lbl65:
                    // 1 sources

                    var11_5 /* !! */  = (int)((hi.a("G", (int)iC.b(7465, 7377412474457503228L), (int)iC.b(150, 478852835855935649L), (long)834203424483934088L) - iC.b(26967, 7325780828743516556L)) / iC.b(22603, 5374734164223553605L) - iC.b(20801, 6192522896755194227L));
                    continue block12;
                    case 1477169204: 
                }
                break;
            }
            break;
        }
    }

    @Override
    protected float c() {
        CallSite callSite = iC.E("Hvr6PoJyaDIcd4wo", y(), (iC)this);
        return 7.0f + (float)callSite * 30.0f + (float)hi.a("G", (int)0, (int)(callSite - true), (long)834203424483934088L) * 7.0f + 8.0f + 7.0f + hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)635740873171577152L), (Object)new Object[]{(int)iC.E("Hvr6PoJyaDIcd4wo", x(), (iC)this)}, (long)618481399737948563L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean J(Object[] var1_1) {
        block27: {
            block26: {
                var2_2 = (Double)var1_1[0];
                var4_3 = (Double)var1_1[1];
                var6_4 = (Integer)var1_1[2];
                var7_5 = Dl.t();
                var13_6 /* !! */  = iC.b(2123, 6737644874104021046L) + iC.b(21767, 8569727349080390984L) - iC.b(10546, 2530389723909849351L);
                if (!var7_5) {
                    switch (var13_6 /* !! */ ) {
                        case -1162265817: {
                            hi.a("G", (long)1275757049065691860L);
                            hi.a("G", (long)1005006586280819563L);
                            break;
                        }
                    }
                }
                var8_7 = hi.a("\u00e9", (Object)this, (long)779410745152911181L) + 28.0f - hi.a("\u00e9", (Object)this, (long)566188503515283251L) + 7.0f;
                v0 = var6_4;
                if (var7_5) break block26;
                if (v0 == 0) break block27;
                v0 = var13_6 /* !! */  = hi.a("G", (int)iC.b(19442, 3959357660553274365L), (int)iC.b(23944, 6708691563169936887L), (long)834203424483934088L) / 2 - iC.b(7401, 246317866525832251L) ^ iC.b(10594, 5805790392785699072L);
            }
            if (!var7_5) ** GOTO lbl31
        }
        var13_6 /* !! */  = iC.b(29378, 7248238189558946316L) * iC.b(11439, 6486024256437683311L) ^ iC.b(4142, 8692864880976869610L);
        if (true) ** GOTO lbl31
        block15: while (true) {
            block25: {
                block24: {
                    block28: {
                        v1 = var9_8;
                        v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)647941093962333774L), (long)417939159730395915L);
                        if (var7_5) ** GOTO lbl49
                        if (v1 >= v2 /* !! */ ) ** GOTO lbl47
                        break block28;
lbl31:
                        // 2 sources

                        block16: while (true) {
                            switch (var13_6 /* !! */ ) {
                                default: {
                                    var9_8 = false;
                                    if (!var7_5) break;
                                    continue block15;
                                }
                                case 1504173575: {
                                    break block24;
                                }
                                case 1504173573: {
                                    iC.E("Hvr6PoJyaDIcd4wo", d());
                                    var13_6 /* !! */  = (int)(hi.a("G", (int)(iC.b(27659, 8853534297655100487L) ^ iC.b(5478, 7764426600212970792L)), (int)iC.b(21967, 4787729833524428219L), (long)834203424483934088L) + iC.b(15843, 5382845445537207741L));
                                    continue block16;
                                }
                            }
                            var13_6 /* !! */  = iC.b(4630, 8062723122800507513L) * iC.b(10496, 5112756543678546291L) / iC.b(8860, 5908102340031056528L) / iC.b(14270, 738207651262472097L) - iC.b(7921, 2229612899522623158L) - iC.b(23405, 7213442258037044046L);
                            if (!var7_5) break block25;
lbl47:
                            // 2 sources

                            v1 = hi.a("G", (int)iC.b(22198, 4947143142271483499L), (int)iC.b(10119, 2006106762556313413L), (long)834203424483934088L) / 2 - iC.b(8684, 496334971330693572L);
                            v2 /* !! */  = (CallSite)iC.b(16926, 7053309319976479299L);
lbl49:
                            // 2 sources

                            var13_6 /* !! */  = v1 ^ v2 /* !! */ ;
                            if (var7_5) break;
                        }
                    }
                    var13_6 /* !! */  = ((iC.b(12047, 2125977520420390689L) ^ iC.b(2827, 6237339576673608487L)) - iC.b(26909, 2583477246080762177L)) * iC.b(9956, 8716572930544275118L) ^ iC.b(8480, 4127197404980185441L);
                    break block25;
                }
lbl56:
                // 2 sources

                while (true) {
                    var9_8 = hi.a("\u00a5", (Object)this, (long)1156152195202378197L);
                    var10_10 = var8_7 + (float)var9_8 * 30.0f + (float)hi.a("G", (int)0, (int)(var9_8 - 1), (long)834203424483934088L) * 7.0f + 8.0f + 7.0f;
                    v3 = new Object[6];
                    v3[5] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)658297474044504383L));
                    v3[4] = Float.valueOf((float)var10_10);
                    v3[3] = Float.valueOf((float)hi.a("\u00e9", (Object)this, (long)1002927700257889382L));
                    v3[2] = var6_4;
                    v3[1] = var4_3;
                    v3[0] = var2_2;
                    return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)635740873171577152L), (Object)v3, (long)1135412067593857731L);
                }
            }
            block18: while (true) {
                block32: {
                    block31: {
                        block30: {
                            block29: {
                                switch (var13_6 /* !! */ ) {
                                    default: {
                                        continue block15;
                                    }
                                    case 260862134: {
                                        var10_9 = (l1)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)647941093962333774L), (int)var9_8, (long)516183098926246296L);
                                        var11_11 = iC.E("Hvr6PoJyaDIcd4wo", g(int ), (iC)this, (int)var9_8);
                                        var12_12 = var8_7 + (float)(var9_8 / 4) * 37.0f;
                                        v4 /* !! */  = hi.a("\u00a5", (Object)this, (double)var2_2, (double)var4_3, (float)var11_11, (float)var12_12, (float)30.0f, (float)30.0f, (long)418030414959741088L);
                                        if (var7_5) break block29;
                                        if (v4 /* !! */  == false) break;
                                        break block30;
                                    }
                                    case 260862135: {
                                        hi.a("G", (float)10.0f, (long)945348514596968233L);
                                        hi.a("G", (long)1018118041190145658L);
                                        var13_6 /* !! */  = (iC.b(27387, 3893792986902381103L) - iC.b(22555, 4223670911305347139L) ^ iC.b(10581, 4049240191687197044L)) - iC.b(22340, 5806073463098408726L);
                                        continue block18;
                                    }
                                }
                                v4 /* !! */  = (CallSite)(iC.b(11575, 2008651999775360265L) - iC.b(27751, 6098065311272289397L) ^ iC.b(4824, 9071440014589082341L));
                            }
                            var13_6 /* !! */  = (int)v4 /* !! */ ;
                            if (!var7_5) break block31;
                        }
                        var13_6 /* !! */  = (int)(hi.a("G", (int)(iC.b(6140, 5839514650824589228L) - iC.b(10728, 2254098079072977389L)), (int)iC.b(30168, 5763829217041243627L), (long)834203424483934088L) + iC.b(18074, 1012884913374719710L) - iC.b(11079, 4234825432910693166L));
                        if (var7_5) break block32;
                    }
                    v5 = var13_6 /* !! */ ;
                    if (var7_5 != false) return v5;
                    switch (v5) {
                        default: {
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)var10_9, (long)517777167630257936L), (Object)hi.a("\u00e9", (Object)var10_9, (long)549521238263958359L), (long)1019739569891963411L);
                            return true;
                        }
                        case -1429233198: {
                            ++var9_8;
                            if (!var7_5) break;
                            ** continue;
                        }
                        case -1429233199: {
                            throw null;
                        }
                    }
                }
                var13_6 /* !! */  = iC.b(1106, 6340441613281766468L) * iC.b(15597, 305487636053660806L) / iC.b(423, 5865074511985027454L) / iC.b(11991, 7983964103275415246L) - iC.b(31872, 8551606149880304795L) - iC.b(16980, 3024152431506483781L);
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[10];
                        var11_1 = 0;
                        var10_2 = "\u0015\u00bar\u008a\u001d\nZ^1\u009fIz\u00f6M\u00ce\u00ea4\u001b\u00a2\u00e5\n\u00bc\u00b0n\u0088,V\u00f5_\u00f4[\u00a5\u00c5\u00c1\u0010\u001e\u00a6m\u00f1\u00b0\u0002\u0091\u0087\u00e3\u0092\u00c0\u0084\u0012\u00b6\u00aa\u0087\u000f\u00de\u00cf\u00d9/\u00d8\u0091\u00e5\u009fU\u00acE\u00f4\u00e2\u00b1.\u000fx&\r\u0012B6\u00b6k?!\u000b8S\u00a1f\u000f\u0000\u00c9\u0002\u00ef\u00a3\u0089\u008a\u009c\u00b8\u00ce\u00f1\u00f5A\u007f\u00e4\u0006P\u0091\u00b0\u0095B\u00cd\u0011$n\u0086\u001b3\u0017\u0098O\u00fa\u00ab\u00b3\u00bdCe\u0092\u00ed\u0096";
                        var12_3 = "\u0015\u00bar\u008a\u001d\nZ^1\u009fIz\u00f6M\u00ce\u00ea4\u001b\u00a2\u00e5\n\u00bc\u00b0n\u0088,V\u00f5_\u00f4[\u00a5\u00c5\u00c1\u0010\u001e\u00a6m\u00f1\u00b0\u0002\u0091\u0087\u00e3\u0092\u00c0\u0084\u0012\u00b6\u00aa\u0087\u000f\u00de\u00cf\u00d9/\u00d8\u0091\u00e5\u009fU\u00acE\u00f4\u00e2\u00b1.\u000fx&\r\u0012B6\u00b6k?!\u000b8S\u00a1f\u000f\u0000\u00c9\u0002\u00ef\u00a3\u0089\u008a\u009c\u00b8\u00ce\u00f1\u00f5A\u007f\u00e4\u0006P\u0091\u00b0\u0095B\u00cd\u0011$n\u0086\u001b3\u0017\u0098O\u00fa\u00ab\u00b3\u00bdCe\u0092\u00ed\u0096".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 126;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00ad{\u0098@\u0092\"\u0005\u00d5\u00f6\u00df\u00926";
                            var12_3 = "\u00ad{\u0098@\u0092\"\u0005\u00d5\u00f6\u00df\u00926".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 4;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
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
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 46;
                                    break;
                                }
                                case 1: {
                                    v15 = 49;
                                    break;
                                }
                                case 2: {
                                    v15 = 13;
                                    break;
                                }
                                case 3: {
                                    v15 = 105;
                                    break;
                                }
                                case 4: {
                                    v15 = 110;
                                    break;
                                }
                                case 5: {
                                    v15 = 78;
                                    break;
                                }
                                default: {
                                    v15 = 123;
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
lbl85:
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
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                iC.d = var13;
                iC.i = new String[10];
                var0_7 = 5343472568681437250L;
                var6_8 = new long[164];
                var3_9 = 0;
                var4_10 = "\u008e\u00a3x1\u00b6b\u00a5\u00bb~1\u00950\u0080\u0010\u008a\u008d9{\u009f?!\u00aa~d\n6\u00f0jYn\u00f6\u0019\u00dag\u00eb\u0084\u0091\u0089Do\u00dd\"\u0005\u0090\u00d7\u00e2\u00fb\r\u0095\\m\u00de\u00c9\bX\u00bbM\u00fe<;\tm\u009e\u00b8\u007f-\u000475\u0082\u0098\u00d5\u0001m\u00bb\u00ee\u00de\u00b7\u00ab\"\u00c4\u0098\u0097Y\u00df \u00104\u009a\u00f7\u00c4\u00e9\u00d0\u00da\u00db\u00ca_e\u001c#W\u0086+7\u0086\u00bc\u00a5o\u009b\u00e3[w\u00c4\u00e4\u00d6\u00c9\u00a9\u008dn\u00db<\u00f5J\u00a2\b_\u00d2XT\u00c8\u00a4\u00c9yR\u0085\u00c5\u0097\u00f1\u008e:\n\u00c6X\u00ba\u00de\u008cL|\u009c\u00ef\u00ad\u001b=q\u00d2\u00db\u009f\u0016\u00f9\u00ebJ\u008a\u00bb\u00cd\u00b3\u00d5\u0080\r\u0014n\u0088\u0012\u0000\u00ba\u00d3\u0000\u00f8\u00e5\u0086\u0091\u00f5\u0094\u0003\u008b_W\u00c9\u0091\u00d9J7N\u0002\u00fc\u00f2\u0019\u00a7\u00be\u000fEU\u00e1\\\u00e3}1ij\u00d9\u00c1\u007f\u009f\u00acsa`\u008d'\u0088\u001f\u00fa\u0001\u00c0\u00a5\u00ec~\u00a4s\u00c5\u0081\u00f3P\u0019']@Q7\u00f0(\u00a0\u00d6\u000f\u00b2\n\u00dc\u0092\u009e\no\u00fbhp\u00ddi\u001f\u0096\u00ba*\u00d9\u0091~<z\u00a65V+d\u0000\u00a4\u00fe\u00ef\u0012\u0097\u00e7\u00c4\u00f9u\u0002\u00c2\u00b5P\u00e8\u000f\u009b\u00b2b\u009d@Mo\u0091\u00e8\u00c1\u008a0\u0085|\u00d2\u0092\u0098\u0085\u00de\u0080v\u00b4\u00a5-2I\u00e9\u00be\u00a4\u00bb\u0099\u00bb\u00da\u0090Hu\u0016\u000b\u00c1w\u00e1\u00c3\"C\u0019\u00ebM\u00f1\u0096AQ\u00d2\\lf\u00dd9\u0004\u00ee(\u00db\u009c\u00c9\u00eam\u0019\u00101\u0095%\"\u0097A|\u00bd\u009aT\u00db\u0010Z*(\u0087\u00a4\u0017.?\u00db\u0099\u009c\u0092\u00f8\u008c\t\u00af\u00f1(\u001b0\u00f2#\u00de\u009f\u00fb\u00bc\u0082!\u00e2g\u00f4Z\u00bfbK9\u0014\u00eaZ#\u009d\u0094\u001d\u00dd\u009e\u00d5g\u00d3\u0099\u00fe@tK\u00c18&\u00d7ZJ\u00be\u00a8Mc\u00f3G|\u00b8\u00fd\u00f5|cn\u00ff\u00fc\u00fb\u009a\u00ec\u0086Xoj\u00bd\u008b\u00bbr\u00ee\u00e1\u00a3\u001b<\u00a6\u001f+\u00b9\u001c1\u00fb7\u00d4<\rd\u00ac\u0006\u00c3\u00ba`\u00f7\u00c3G\u000b\u00e0\u00f6\u000e\u00d4\u0007\u00c6\u0006n\u00f7\u00b4\u00db\u00b6i{\u0011\u00c8\r\u00cb\u00fe\u0091\r\u00ee\u00be\u00fc/\u00acf\u00b7\u00f3\u0003\u00dfB\u0096\u00c9\u00b1p\u0098\n'\u00ef\u00a0H\u00ff\u00f7\u000f\u009a\u0004\u0012\u00948\u0016\u00f1\u00c7UN\nfv\u00ba\u00c1\u0012\u0092\u00ca\u00aag\u00ef\u00aa=VQ\u00a3<\u00117\u00e4\u00a1&g\u00f9\u00b4\u001b^\u0099\u00ef\u00f6uaH\u00a19\u0087l\u007f\u00df8{p:\u007f!\u00ce\u00ed}=\u00f1\u0090~\u009e\u0084\u00a8\u009a2\r\u00aa\u0006ysjty\u00d0\u00ad\u0091\u00e1\u00a6\u00b6bW\u008a\u00ad\u0086\u00f7=;\u00b4\u00c1E\bD\u00f6l\u00f9\u00b0t\u00e8\u0094e\n\u009c\u00a68+s\u0014\u00b4\u0087\u00ebl\u00c4\u00ed$\u0006\u00e9\u00d19\u0083\tz\u00b4\u0086\u00b4n8t\u009f\u00b1 g\u00a9\u00f3\u0010\u0002PQ\u00c6\u00e3\u00e8+3\u00dc\u00b4\u00d9#:K\u00bd@\u009bN\u0096`^\u00b0cf\u00dc0V\u00ac\u00f1\u00a7\u0011\u0018\u00a7\u0097\u0092\u0087\u009dRjt\u001a\u009f\u00ccw\u00f4\u00da\u0000\u00a0\u00b5\u0091\u0085\u0098\u00d7\u0084\u008f\u00e0\u00b5E\u007f\u001d/\u00b0Q\u0004g\u0094\u00d1\u00b8Y\u00e5\t\u001e\u0080Jn\u00a8:\u00aa?\u00c9I\u00ceH*\\\u00f9}e\u009c\u00e1\u00d0\u00b4\u0019y\u0092\u00de\u00a7t]\u00d5\r\u00ce\u00e8\u009f\u009f\u009a\u00b4\u000bo\u00feh\u0001o`\u00ac\u00fbe\u0080\u0013\u00ef\u00dd\u00d4X\u00a1\u00e5x\u0099R\u00a2n4\u0002\u00a8{\u00fc\u000e]>\u0017x\u00d0\u00cb\u001da\u00d31\u009b\u00ed\u0098\u00c5\u0018p\u00f4\u00e5Fr\u00e4\u0003~\r!]]\u00c0\u009d\u0016N\u0005C\u0084\u00d4\u00deg\u00d8d\u00d9yN/!L\u0001/\u0092\u00b3\u00c6\u00d8a\u0014[,\u008d\u00c1h\u00e2\u00ac\u00eb\u008b\u00b8m\u00c4\u00c6E M\u00fb\u00d9\u00cc{\u00b0/\u00cb\u00fb/x- \u001e*g\u00b7\u00e7\u0019\u00de\u0004\u00af\u0019\u009a\u0000m\u00a0\u00b0\u0007\u00e4\u00dd\u00ed\u00c7h\u00c1\u00f2\u00f3\u0081\u0002/\u0093\u0090\u00d8\fcp@\u00fd\u00bd\u0013E\u00bd\u00f1,\b\u0095\u008cz\u00ee\u0004\u00b9\u00b6?4\u0094p\u00de\u00cfW\u00fa\u0098\u00f9\u00fb\u008a\u001eP\u001bh\u00ad\u00c7\u0007vW\u00ff\u0081RP\u00c5\u00d9n\u0006!]\u00aaINIIe\u0082\u009cm\u00ccr\u00d0e\u00f13\u0092(\u0004\u00c0\u00fb\u00fb\u0093\u00d9[\u00f4%u\u0094\u00aaGB\u00c56\u009c2\n\f\u00eb\u00d0\u00a1\u009exBH\u00a4\u001c\u008e\u00bb\u00f7\u00b6+>Y\u00b3\u0088\u00cd\u00b4C\u00b6\u0095\u00c0P\u00f6\u00ca\u00f7\u0018p\u00e3\u00fd\u0093\u00ca\u008d\u00f1\u00ed\u00d0\u00f2\u009a\u00a96<\u00db\u00fc\u00c2\u00e2\u008ax?\u00e8\u00d6\u0019\u00a7X\u000f\u00107\u00deJ\u0092VD$.&e\u00f0\t\u008b\u00c07vy\u001d\u00bc\u00ed\u0005\u00a80\u0080\u00d4O\u0084\u00fcK\u00e8\u0082\b\u00bb\u00bc\u009e\u0004J@\u000b\u00a7A50D\u00dc7]\u00b10`\u00d3\u00c7\u00a0\u00af\u00b3\u00f1\u00d4\u0005\u00ba\u0010\u0080\u009b8\u00ea\u0002x\u00da\u0095%-\u0091\u001b\u00bb#N\u00d5\u00ce\u0092(\u00f5\t\u00af\u0006O\u00b2\u00e1\rO{$<<\u00cb\u00d2\u0018\u001b\"R\u00efh\u00fa\u00c0\u0000\u00af\u0084\u008a=\u00b8(\u0082\u00a3\u00ce!\u00ed\u00ea\u00beEU\u00b5Y\u0092hU\u00a5\u0089;0\u0099\u00bdi\u0083\n\u00cd\u00a2Sf \u0082I+\u00df\"af\u00d8\u00ecq\u0096\u0084\u0093\u0015\u0092\u00b6\u0005`\u00ff\u00cb\u0017\u00a5\u00fc\u00a4 #I\u00c6\u00f3\u0083\u0089SW\u00c0\u00de\u00ee)\u00bfd\u00a7.\u00a1\u0004>P\u00e0\u00cc\u00f2\t\u0082\bg\u00e6v\u0085;\u00f134\u00ec\u001ak\u009f\u0090\u0013\u00e9,\u00d2F)\u00b8\u00a9\u009b\u00fby%\u0090\u00dc\u00c3\u00c4\u00c5\u008cW\u00a6\u00ecKNG\u00cc\u00a0\u00f3\u00f9\u0018\nK\u00a67z\u001b\u009a\u001d|(\u00d2\u00f9Ze\u0014\u00e5/\u00d5\u009e";
                var5_11 = "\u008e\u00a3x1\u00b6b\u00a5\u00bb~1\u00950\u0080\u0010\u008a\u008d9{\u009f?!\u00aa~d\n6\u00f0jYn\u00f6\u0019\u00dag\u00eb\u0084\u0091\u0089Do\u00dd\"\u0005\u0090\u00d7\u00e2\u00fb\r\u0095\\m\u00de\u00c9\bX\u00bbM\u00fe<;\tm\u009e\u00b8\u007f-\u000475\u0082\u0098\u00d5\u0001m\u00bb\u00ee\u00de\u00b7\u00ab\"\u00c4\u0098\u0097Y\u00df \u00104\u009a\u00f7\u00c4\u00e9\u00d0\u00da\u00db\u00ca_e\u001c#W\u0086+7\u0086\u00bc\u00a5o\u009b\u00e3[w\u00c4\u00e4\u00d6\u00c9\u00a9\u008dn\u00db<\u00f5J\u00a2\b_\u00d2XT\u00c8\u00a4\u00c9yR\u0085\u00c5\u0097\u00f1\u008e:\n\u00c6X\u00ba\u00de\u008cL|\u009c\u00ef\u00ad\u001b=q\u00d2\u00db\u009f\u0016\u00f9\u00ebJ\u008a\u00bb\u00cd\u00b3\u00d5\u0080\r\u0014n\u0088\u0012\u0000\u00ba\u00d3\u0000\u00f8\u00e5\u0086\u0091\u00f5\u0094\u0003\u008b_W\u00c9\u0091\u00d9J7N\u0002\u00fc\u00f2\u0019\u00a7\u00be\u000fEU\u00e1\\\u00e3}1ij\u00d9\u00c1\u007f\u009f\u00acsa`\u008d'\u0088\u001f\u00fa\u0001\u00c0\u00a5\u00ec~\u00a4s\u00c5\u0081\u00f3P\u0019']@Q7\u00f0(\u00a0\u00d6\u000f\u00b2\n\u00dc\u0092\u009e\no\u00fbhp\u00ddi\u001f\u0096\u00ba*\u00d9\u0091~<z\u00a65V+d\u0000\u00a4\u00fe\u00ef\u0012\u0097\u00e7\u00c4\u00f9u\u0002\u00c2\u00b5P\u00e8\u000f\u009b\u00b2b\u009d@Mo\u0091\u00e8\u00c1\u008a0\u0085|\u00d2\u0092\u0098\u0085\u00de\u0080v\u00b4\u00a5-2I\u00e9\u00be\u00a4\u00bb\u0099\u00bb\u00da\u0090Hu\u0016\u000b\u00c1w\u00e1\u00c3\"C\u0019\u00ebM\u00f1\u0096AQ\u00d2\\lf\u00dd9\u0004\u00ee(\u00db\u009c\u00c9\u00eam\u0019\u00101\u0095%\"\u0097A|\u00bd\u009aT\u00db\u0010Z*(\u0087\u00a4\u0017.?\u00db\u0099\u009c\u0092\u00f8\u008c\t\u00af\u00f1(\u001b0\u00f2#\u00de\u009f\u00fb\u00bc\u0082!\u00e2g\u00f4Z\u00bfbK9\u0014\u00eaZ#\u009d\u0094\u001d\u00dd\u009e\u00d5g\u00d3\u0099\u00fe@tK\u00c18&\u00d7ZJ\u00be\u00a8Mc\u00f3G|\u00b8\u00fd\u00f5|cn\u00ff\u00fc\u00fb\u009a\u00ec\u0086Xoj\u00bd\u008b\u00bbr\u00ee\u00e1\u00a3\u001b<\u00a6\u001f+\u00b9\u001c1\u00fb7\u00d4<\rd\u00ac\u0006\u00c3\u00ba`\u00f7\u00c3G\u000b\u00e0\u00f6\u000e\u00d4\u0007\u00c6\u0006n\u00f7\u00b4\u00db\u00b6i{\u0011\u00c8\r\u00cb\u00fe\u0091\r\u00ee\u00be\u00fc/\u00acf\u00b7\u00f3\u0003\u00dfB\u0096\u00c9\u00b1p\u0098\n'\u00ef\u00a0H\u00ff\u00f7\u000f\u009a\u0004\u0012\u00948\u0016\u00f1\u00c7UN\nfv\u00ba\u00c1\u0012\u0092\u00ca\u00aag\u00ef\u00aa=VQ\u00a3<\u00117\u00e4\u00a1&g\u00f9\u00b4\u001b^\u0099\u00ef\u00f6uaH\u00a19\u0087l\u007f\u00df8{p:\u007f!\u00ce\u00ed}=\u00f1\u0090~\u009e\u0084\u00a8\u009a2\r\u00aa\u0006ysjty\u00d0\u00ad\u0091\u00e1\u00a6\u00b6bW\u008a\u00ad\u0086\u00f7=;\u00b4\u00c1E\bD\u00f6l\u00f9\u00b0t\u00e8\u0094e\n\u009c\u00a68+s\u0014\u00b4\u0087\u00ebl\u00c4\u00ed$\u0006\u00e9\u00d19\u0083\tz\u00b4\u0086\u00b4n8t\u009f\u00b1 g\u00a9\u00f3\u0010\u0002PQ\u00c6\u00e3\u00e8+3\u00dc\u00b4\u00d9#:K\u00bd@\u009bN\u0096`^\u00b0cf\u00dc0V\u00ac\u00f1\u00a7\u0011\u0018\u00a7\u0097\u0092\u0087\u009dRjt\u001a\u009f\u00ccw\u00f4\u00da\u0000\u00a0\u00b5\u0091\u0085\u0098\u00d7\u0084\u008f\u00e0\u00b5E\u007f\u001d/\u00b0Q\u0004g\u0094\u00d1\u00b8Y\u00e5\t\u001e\u0080Jn\u00a8:\u00aa?\u00c9I\u00ceH*\\\u00f9}e\u009c\u00e1\u00d0\u00b4\u0019y\u0092\u00de\u00a7t]\u00d5\r\u00ce\u00e8\u009f\u009f\u009a\u00b4\u000bo\u00feh\u0001o`\u00ac\u00fbe\u0080\u0013\u00ef\u00dd\u00d4X\u00a1\u00e5x\u0099R\u00a2n4\u0002\u00a8{\u00fc\u000e]>\u0017x\u00d0\u00cb\u001da\u00d31\u009b\u00ed\u0098\u00c5\u0018p\u00f4\u00e5Fr\u00e4\u0003~\r!]]\u00c0\u009d\u0016N\u0005C\u0084\u00d4\u00deg\u00d8d\u00d9yN/!L\u0001/\u0092\u00b3\u00c6\u00d8a\u0014[,\u008d\u00c1h\u00e2\u00ac\u00eb\u008b\u00b8m\u00c4\u00c6E M\u00fb\u00d9\u00cc{\u00b0/\u00cb\u00fb/x- \u001e*g\u00b7\u00e7\u0019\u00de\u0004\u00af\u0019\u009a\u0000m\u00a0\u00b0\u0007\u00e4\u00dd\u00ed\u00c7h\u00c1\u00f2\u00f3\u0081\u0002/\u0093\u0090\u00d8\fcp@\u00fd\u00bd\u0013E\u00bd\u00f1,\b\u0095\u008cz\u00ee\u0004\u00b9\u00b6?4\u0094p\u00de\u00cfW\u00fa\u0098\u00f9\u00fb\u008a\u001eP\u001bh\u00ad\u00c7\u0007vW\u00ff\u0081RP\u00c5\u00d9n\u0006!]\u00aaINIIe\u0082\u009cm\u00ccr\u00d0e\u00f13\u0092(\u0004\u00c0\u00fb\u00fb\u0093\u00d9[\u00f4%u\u0094\u00aaGB\u00c56\u009c2\n\f\u00eb\u00d0\u00a1\u009exBH\u00a4\u001c\u008e\u00bb\u00f7\u00b6+>Y\u00b3\u0088\u00cd\u00b4C\u00b6\u0095\u00c0P\u00f6\u00ca\u00f7\u0018p\u00e3\u00fd\u0093\u00ca\u008d\u00f1\u00ed\u00d0\u00f2\u009a\u00a96<\u00db\u00fc\u00c2\u00e2\u008ax?\u00e8\u00d6\u0019\u00a7X\u000f\u00107\u00deJ\u0092VD$.&e\u00f0\t\u008b\u00c07vy\u001d\u00bc\u00ed\u0005\u00a80\u0080\u00d4O\u0084\u00fcK\u00e8\u0082\b\u00bb\u00bc\u009e\u0004J@\u000b\u00a7A50D\u00dc7]\u00b10`\u00d3\u00c7\u00a0\u00af\u00b3\u00f1\u00d4\u0005\u00ba\u0010\u0080\u009b8\u00ea\u0002x\u00da\u0095%-\u0091\u001b\u00bb#N\u00d5\u00ce\u0092(\u00f5\t\u00af\u0006O\u00b2\u00e1\rO{$<<\u00cb\u00d2\u0018\u001b\"R\u00efh\u00fa\u00c0\u0000\u00af\u0084\u008a=\u00b8(\u0082\u00a3\u00ce!\u00ed\u00ea\u00beEU\u00b5Y\u0092hU\u00a5\u0089;0\u0099\u00bdi\u0083\n\u00cd\u00a2Sf \u0082I+\u00df\"af\u00d8\u00ecq\u0096\u0084\u0093\u0015\u0092\u00b6\u0005`\u00ff\u00cb\u0017\u00a5\u00fc\u00a4 #I\u00c6\u00f3\u0083\u0089SW\u00c0\u00de\u00ee)\u00bfd\u00a7.\u00a1\u0004>P\u00e0\u00cc\u00f2\t\u0082\bg\u00e6v\u0085;\u00f134\u00ec\u001ak\u009f\u0090\u0013\u00e9,\u00d2F)\u00b8\u00a9\u009b\u00fby%\u0090\u00dc\u00c3\u00c4\u00c5\u008cW\u00a6\u00ecKNG\u00cc\u00a0\u00f3\u00f9\u0018\nK\u00a67z\u001b\u009a\u001d|(\u00d2\u00f9Ze\u0014\u00e5/\u00d5\u009e".length();
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
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "Z\u0080\u0015N\u0090\u00e0\u00a4y\u00fbL\u0092\u00b6\u008e\u0084\u0018N";
                    var5_11 = "Z\u0080\u0015N\u0090\u00e0\u00a4y\u00fbL\u0092\u00b6\u008e\u0084\u0018N".length();
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
lbl125:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        iC.n = var6_8;
        iC.s = new Integer[164];
        iC.m = iC.b(11768, 2281306673318004123L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFF916) & 0xFFFF;
        if (i[n3] == null) {
            int n4;
            char[] cArray = d[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 74;
                case 1 -> 159;
                case 2 -> 109;
                case 3 -> 240;
                case 4 -> 190;
                case 5 -> 35;
                case 6 -> 151;
                case 7 -> 182;
                case 8 -> 203;
                case 9 -> 31;
                case 10 -> 160;
                case 11 -> 194;
                case 12 -> 93;
                case 13 -> 76;
                case 14 -> 215;
                case 15 -> 106;
                case 16 -> 241;
                case 17 -> 133;
                case 18 -> 58;
                case 19 -> 39;
                case 20 -> 172;
                case 21 -> 43;
                case 22 -> 121;
                case 23 -> 185;
                case 24 -> 149;
                case 25 -> 55;
                case 26 -> 122;
                case 27 -> 91;
                case 28 -> 59;
                case 29 -> 144;
                case 30 -> 249;
                case 31 -> 60;
                case 32 -> 169;
                case 33 -> 48;
                case 34 -> 206;
                case 35 -> 63;
                case 36 -> 134;
                case 37 -> 130;
                case 38 -> 68;
                case 39 -> 42;
                case 40 -> 61;
                case 41 -> 218;
                case 42 -> 164;
                case 43 -> 110;
                case 44 -> 193;
                case 45 -> 14;
                case 46 -> 124;
                case 47 -> 175;
                case 48 -> 78;
                case 49 -> 171;
                case 50 -> 255;
                case 51 -> 254;
                case 52 -> 204;
                case 53 -> 250;
                case 54 -> 112;
                case 55 -> 28;
                case 56 -> 156;
                case 57 -> 8;
                case 58 -> 141;
                case 59 -> 102;
                case 60 -> 246;
                case 61 -> 1;
                case 62 -> 239;
                case 63 -> 227;
                case 64 -> 236;
                case 65 -> 143;
                case 66 -> 46;
                case 67 -> 82;
                case 68 -> 220;
                case 69 -> 103;
                case 70 -> 4;
                case 71 -> 75;
                case 72 -> 86;
                case 73 -> 80;
                case 74 -> 22;
                case 75 -> 165;
                case 76 -> 129;
                case 77 -> 117;
                case 78 -> 161;
                case 79 -> 167;
                case 80 -> 34;
                case 81 -> 119;
                case 82 -> 64;
                case 83 -> 5;
                case 84 -> 145;
                case 85 -> 177;
                case 86 -> 6;
                case 87 -> 38;
                case 88 -> 56;
                case 89 -> 73;
                case 90 -> 107;
                case 91 -> 234;
                case 92 -> 245;
                case 93 -> 219;
                case 94 -> 150;
                case 95 -> 104;
                case 96 -> 67;
                case 97 -> 36;
                case 98 -> 70;
                case 99 -> 155;
                case 100 -> 199;
                case 101 -> 158;
                case 102 -> 115;
                case 103 -> 228;
                case 104 -> 235;
                case 105 -> 166;
                case 106 -> 0;
                case 107 -> 2;
                case 108 -> 242;
                case 109 -> 125;
                case 110 -> 96;
                case 111 -> 192;
                case 112 -> 197;
                case 113 -> 7;
                case 114 -> 24;
                case 115 -> 116;
                case 116 -> 136;
                case 117 -> 100;
                case 118 -> 213;
                case 119 -> 209;
                case 120 -> 83;
                case 121 -> 21;
                case 122 -> 225;
                case 123 -> 69;
                case 124 -> 131;
                case 125 -> 11;
                case 126 -> 53;
                case 127 -> 15;
                case 128 -> 231;
                case 129 -> 211;
                case 130 -> 139;
                case 131 -> 77;
                case 132 -> 37;
                case 133 -> 126;
                case 134 -> 118;
                case 135 -> 201;
                case 136 -> 222;
                case 137 -> 16;
                case 138 -> 195;
                case 139 -> 20;
                case 140 -> 157;
                case 141 -> 196;
                case 142 -> 137;
                case 143 -> 217;
                case 144 -> 205;
                case 145 -> 97;
                case 146 -> 57;
                case 147 -> 79;
                case 148 -> 41;
                case 149 -> 176;
                case 150 -> 251;
                case 151 -> 65;
                case 152 -> 52;
                case 153 -> 230;
                case 154 -> 105;
                case 155 -> 147;
                case 156 -> 162;
                case 157 -> 88;
                case 158 -> 214;
                case 159 -> 200;
                case 160 -> 178;
                case 161 -> 148;
                case 162 -> 72;
                case 163 -> 29;
                case 164 -> 45;
                case 165 -> 202;
                case 166 -> 84;
                case 167 -> 26;
                case 168 -> 87;
                case 169 -> 208;
                case 170 -> 40;
                case 171 -> 12;
                case 172 -> 207;
                case 173 -> 98;
                case 174 -> 163;
                case 175 -> 229;
                case 176 -> 90;
                case 177 -> 27;
                case 178 -> 179;
                case 179 -> 66;
                case 180 -> 10;
                case 181 -> 226;
                case 182 -> 223;
                case 183 -> 210;
                case 184 -> 50;
                case 185 -> 221;
                case 186 -> 238;
                case 187 -> 181;
                case 188 -> 146;
                case 189 -> 99;
                case 190 -> 71;
                case 191 -> 152;
                case 192 -> 189;
                case 193 -> 111;
                case 194 -> 30;
                case 195 -> 120;
                case 196 -> 224;
                case 197 -> 188;
                case 198 -> 44;
                case 199 -> 3;
                case 200 -> 32;
                case 201 -> 33;
                case 202 -> 92;
                case 203 -> 114;
                case 204 -> 243;
                case 205 -> 101;
                case 206 -> 49;
                case 207 -> 191;
                case 208 -> 62;
                case 209 -> 135;
                case 210 -> 123;
                case 211 -> 108;
                case 212 -> 174;
                case 213 -> 13;
                case 214 -> 54;
                case 215 -> 244;
                case 216 -> 142;
                case 217 -> 180;
                case 218 -> 19;
                case 219 -> 248;
                case 220 -> 138;
                case 221 -> 170;
                case 222 -> 184;
                case 223 -> 173;
                case 224 -> 81;
                case 225 -> 168;
                case 226 -> 140;
                case 227 -> 132;
                case 228 -> 212;
                case 229 -> 253;
                case 230 -> 183;
                case 231 -> 237;
                case 232 -> 9;
                case 233 -> 128;
                case 234 -> 153;
                case 235 -> 25;
                case 236 -> 85;
                case 237 -> 233;
                case 238 -> 186;
                case 239 -> 232;
                case 240 -> 18;
                case 241 -> 113;
                case 242 -> 198;
                case 243 -> 17;
                case 244 -> 216;
                case 245 -> 154;
                case 246 -> 94;
                case 247 -> 23;
                case 248 -> 51;
                case 249 -> 47;
                case 250 -> 127;
                case 251 -> 247;
                case 252 -> 89;
                case 253 -> 95;
                case 254 -> 252;
                default -> 187;
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
            iC.i[n3] = new String(cArray).intern();
        }
        return i[n3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2851;
        if (s[n2] == null) {
            iC.s[n2] = (int)(iC.n[n2] ^ l);
        }
        return s[n2];
    }
}
