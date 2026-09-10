/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.level.block.CarvedPumpkinBlock
 *  net.minecraft.world.level.block.EntityBlock
 *  net.minecraft.world.level.block.FallingBlock
 *  net.minecraft.world.level.block.PumpkinBlock
 *  net.minecraft.world.level.block.SlimeBlock
 *  net.minecraft.world.level.block.TntBlock
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.XG;
import com.github.epsilon.Xn;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.yi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.PumpkinBlock;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.phys.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eI
extends e {
    public static final eI O;
    private final Xn e;
    private int k;
    private final Xn v;
    private final Xn h;
    private final Xn E;
    private final Xn K;
    private final XG Q = hi.a("\u00a5", (Object)this, (Object)eI.b(-28039, -10578), (int)2, (int)0, (int)eI.c(25372, 1746137917073159856L), (int)1, (long)1094453040828645510L);
    private final XG J = eI.E("IJ5oOVJRoiNCcnwe", b(java.lang.String int int int int ), (eI)this, (String)eI.b(-28037, 1739), (int)3, (int)0, (int)eI.c(32589, 7807639088688622265L), (int)1);
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public boolean J(Object[] objectArray) {
        CallSite callSite = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)766985543651748157L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1288045356464090616L), (double)hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L), (double)0.0, (double)hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L), (long)1050989166521321638L);
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("\u00a5", (Object)eI.E("IJ5oOVJRoiNCcnwe", getBoundingBox(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L)), (double)hi.a("\u00e9", (Object)callSite2, (long)1300412705618690751L), (double)-1.0, (double)hi.a("\u00e9", (Object)callSite2, (long)1282612456329596420L), (long)738081145657832578L), (long)558760737377141885L);
    }

    static {
        IlilIlIlil.registerNativesForClass((int)6, eI.class);
        Hidden0.special_clinit_6_10(eI.class);
    }

    private eI() {
        super(eI.b(-28033, 6509), (vY)((Object)hi.a("j", (long)456237291118568391L)));
        this.E = hi.a("\u00a5", (Object)this, (Object)eI.b(-28035, 31116), (boolean)true, (long)1230617056439551805L);
        this.v = hi.a("\u00a5", (Object)this, (Object)eI.b(-28038, 28064), (boolean)true, (long)1230617056439551805L);
        this.h = hi.a("\u00a5", (Object)this, (Object)eI.b(-28047, -28822), (boolean)true, (long)1230617056439551805L);
        this.e = hi.a("\u00a5", (Object)this, (Object)eI.b(-28040, 11833), (boolean)true, (long)1230617056439551805L);
        this.K = eI.E("IJ5oOVJRoiNCcnwe", U(java.lang.String boolean ), (eI)this, (String)eI.b(-28034, 21736), (boolean)false);
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

    private float J(Object[] objectArray) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1116845415202981531L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)callSite, (long)419122760578116751L), (long)1154638568918062781L), (long)1283637419335929226L);
        return (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)828256384970449005L) * (0.21600002f / (callSite2 * callSite2 * callSite2)));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean T(Object[] var1_1) {
        block26: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = eI.c(22002, 253480629253226770L) / eI.c(23674, 5564717686378416551L) * eI.c(12954, 7354982267359373247L) + eI.c(10392, 5633954522911522127L) + eI.c(19896, 8039746128079771852L);
            if (!var2_2) ** GOTO lbl16
            block22: while (true) {
                block29: {
                    block28: {
                        block27: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)500762536299398415L), (long)789438897355831922L)), (long)1000026253634408124L);
                            if (var2_2) break block27;
                            if (v0 /* !! */  != false) break block28;
                            v0 /* !! */  = (CallSite)(((eI.c(27191, 5929603232262717325L) ^ eI.c(21200, 8560801252369876523L) ^ eI.c(32712, 3032303458348296813L)) - eI.c(4354, 8344741217841579143L) ^ eI.c(22066, 5918637978661471053L)) + eI.c(10727, 510606157217741910L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block29;
                    }
                    var3_3 /* !! */  = (eI.c(5945, 1881906638779220692L) - eI.c(16803, 5688309134384190532L)) * eI.c(13964, 4923065760385147855L) * eI.c(17330, 408981000717457189L) ^ eI.c(13733, 5441659702150275122L);
                    if (var2_2) ** GOTO lbl87
                }
                block23: while (true) {
                    switch (var3_3 /* !! */ ) {
                        default: {
                            continue block22;
                        }
                        case 1098757855: {
                            v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)746342926556941089L), (long)622868109502394347L);
                            if (var2_2) ** GOTO lbl88
                            if (v1 /* !! */  == false) ** GOTO lbl87
                            ** GOTO lbl90
                        }
                        case 1098757852: {
                            v2 /* !! */  = hi.a("\u00a5", (Object)((Boolean)eI.E("IJ5oOVJRoiNCcnwe", z(), (Xn)hi.a("\u00e9", (Object)this, (long)437524889439814083L))), (long)1000026253634408124L);
                            if (var2_2) ** GOTO lbl93
                            if (v2 /* !! */  == false) ** GOTO lbl92
                            ** GOTO lbl95
                        }
                        case 1098757845: {
                            v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1282175146993233974L), (long)622868109502394347L);
                            if (var2_2) ** GOTO lbl98
                            if (v3 /* !! */  == false) ** GOTO lbl97
                            ** GOTO lbl100
                        }
                        case 1098757858: {
                            v4 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)789555055604814061L), (long)789438897355831922L)), (long)1000026253634408124L);
                            if (var2_2) ** GOTO lbl103
                            if (v4 /* !! */  == false) ** GOTO lbl102
                            ** GOTO lbl105
                        }
                        case 1098757842: {
                            cfr_temp_0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1280994566116072355L) - 69.0f;
                            v5 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var2_2) ** GOTO lbl108
                            if (v5 /* !! */  >= 0) ** GOTO lbl107
                            ** GOTO lbl110
                        }
                        case 1098757854: {
                            v6 = hi.a("\u00a5", (Object)((Boolean)eI.E("IJ5oOVJRoiNCcnwe", z(), (Xn)hi.a("\u00e9", (Object)this, (long)1265665447390892615L))), (long)1000026253634408124L);
                            if (var2_2) ** GOTO lbl113
                            if (v6 == false) ** GOTO lbl112
                            ** GOTO lbl115
                        }
                        case 1098757856: {
                            v7 = hi.a("G", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)961150177177550205L), (long)463539385705767039L);
                            if (var2_2) ** GOTO lbl118
                            if (v7 != false) ** GOTO lbl117
                            ** GOTO lbl120
                        }
                        case 1098757851: {
                            v8 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)860984189805438167L), (long)789438897355831922L)), (long)1000026253634408124L);
                            if (var2_2) ** GOTO lbl123
                            if (v8 /* !! */  == false) ** GOTO lbl122
                            ** GOTO lbl125
                        }
                        case 1098757848: {
                            v9 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1221119019717654623L);
                            if (var2_2) ** GOTO lbl128
                            if (v9 /* !! */  == false) ** GOTO lbl127
                            ** GOTO lbl130
                        }
                        case 1098757857: {
                            v10 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)412409060139490357L);
                            if (var2_2) ** GOTO lbl133
                            if (v10 /* !! */  == false) ** GOTO lbl132
                            ** GOTO lbl135
                        }
                        case 1098757847: {
                            v11 = true;
                            var3_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)eI.c(19295, 3670171616056827792L), (int)eI.c(1089, 5664244639404230L), (long)834203424483934088L) / eI.c(1987, 1655520424498467360L)), (int)eI.c(25291, 2709538321051088719L), (long)834203424483934088L) - eI.c(30400, 7010003424020095904L) ^ eI.c(2465, 3364719722463927612L);
                            if (!var2_2) break block26;
                            ** GOTO lbl137
                        }
                        case 1098757841: {
                            v11 = false;
                            if (var2_2) {
                                return v11;
                            }
                            ** GOTO lbl137
                        }
                        case 1098757844: {
                            hi.a("G", (long)868272870930574387L);
                            return false;
                        }
lbl87:
                        // 2 sources

                        v1 /* !! */  = (CallSite)(((eI.c(18116, 901978507475178291L) ^ eI.c(2797, 446890562567577540L) ^ eI.c(10473, 2841922419405929861L)) - eI.c(8582, 1239685235437548835L) ^ eI.c(4659, 7701500078755350405L)) + eI.c(13205, 6491385876385736432L));
lbl88:
                        // 2 sources

                        var3_3 /* !! */  = (int)v1 /* !! */ ;
                        if (!var2_2) continue block23;
lbl90:
                        // 2 sources

                        var3_3 /* !! */  = eI.c(32124, 8764307078672836781L) / 3 / 3 ^ eI.c(25467, 4310328764543235645L);
                        if (!var2_2) continue block23;
lbl92:
                        // 2 sources

                        v2 /* !! */  = (CallSite)((eI.c(21571, 3407864955689222459L) / 3 - eI.c(17156, 2265900243900094197L) ^ eI.c(8182, 6064904731825244714L)) - eI.c(30964, 6925802042661989862L));
lbl93:
                        // 2 sources

                        var3_3 /* !! */  = (int)v2 /* !! */ ;
                        if (!var2_2) continue block23;
lbl95:
                        // 2 sources

                        var3_3 /* !! */  = (eI.c(29661, 8024116795701487185L) - eI.c(4354, 7900095425028949487L)) / eI.c(24422, 1847315109159160538L) - eI.c(21005, 1696281758465247205L);
                        if (!var2_2) continue block23;
lbl97:
                        // 2 sources

                        v3 /* !! */  = (CallSite)((eI.c(31759, 6944810707766634669L) / 3 - eI.c(18100, 355657669095805803L) ^ eI.c(31870, 3902259913198266497L)) - eI.c(3457, 823025383444027592L));
lbl98:
                        // 2 sources

                        var3_3 /* !! */  = (int)v3 /* !! */ ;
                        if (!var2_2) continue block23;
lbl100:
                        // 2 sources

                        var3_3 /* !! */  = (eI.c(6395, 8636203499198385175L) ^ eI.c(31971, 4241407720617175121L) ^ eI.c(1834, 6669389203799839246L) ^ eI.c(1253, 3157791906094092799L)) + eI.c(7506, 4156607427223193762L) - eI.c(20317, 8218633766696671812L);
                        if (!var2_2) continue block23;
lbl102:
                        // 2 sources

                        v4 /* !! */  = (CallSite)(hi.a("G", (int)(eI.c(939, 3867653896831243854L) / eI.c(12998, 5186338243810699137L)), (int)eI.c(13492, 9212428778439647315L), (long)834203424483934088L) ^ eI.c(26563, 1306373034558976710L));
lbl103:
                        // 2 sources

                        var3_3 /* !! */  = (int)v4 /* !! */ ;
                        if (!var2_2) continue block23;
lbl105:
                        // 2 sources

                        var3_3 /* !! */  = hi.a("G", (int)(eI.c(13254, 9150838024106911333L) * eI.c(3808, 2027283718569925603L)), (int)eI.c(1719, 6213263791773291395L), (long)834203424483934088L) ^ eI.c(8102, 3414714306795047564L);
                        if (!var2_2) continue block23;
lbl107:
                        // 2 sources

                        v5 /* !! */  = (reference)(hi.a("G", (int)(eI.c(15118, 7740254297534246581L) / eI.c(12998, 5186338243810699137L)), (int)eI.c(12776, 171144373979817150L), (long)834203424483934088L) ^ eI.c(32717, 4560234966935890755L));
lbl108:
                        // 2 sources

                        var3_3 /* !! */  = (int)v5 /* !! */ ;
                        if (!var2_2) continue block23;
lbl110:
                        // 2 sources

                        var3_3 /* !! */  = (int)(hi.a("G", (int)((eI.c(1508, 4783288632656728100L) + eI.c(26570, 4064956136093250284L)) * eI.c(4102, 656483371278959965L)), (int)eI.c(21908, 7976490363504574701L), (long)834203424483934088L) + eI.c(29624, 7281321707526088451L));
                        if (!var2_2) continue block23;
lbl112:
                        // 2 sources

                        v6 = hi.a("G", (int)eI.c(15141, 3056919129835613851L), (int)eI.c(22887, 8586746611520556525L), (long)834203424483934088L) + eI.c(19406, 1317262933281594913L);
lbl113:
                        // 2 sources

                        var3_3 /* !! */  = (int)v6;
                        if (!var2_2) continue block23;
lbl115:
                        // 2 sources

                        var3_3 /* !! */  = (eI.c(23936, 4973441990477105355L) ^ eI.c(9778, 5414958680801817277L)) + eI.c(13841, 5887417408270443165L);
                        if (!var2_2) continue block23;
lbl117:
                        // 2 sources

                        v7 = hi.a("G", (int)eI.c(22647, 3644051367299796380L), (int)eI.c(27033, 5449145486643592509L), (long)834203424483934088L) + eI.c(2388, 7522108644966800885L);
lbl118:
                        // 2 sources

                        var3_3 /* !! */  = (int)v7;
                        if (!var2_2) continue block23;
lbl120:
                        // 2 sources

                        var3_3 /* !! */  = (int)(hi.a("G", (int)(eI.c(10041, 6166831604278997980L) + eI.c(26372, 7340784193262318198L) ^ eI.c(24712, 832341333508257237L)), (int)eI.c(21133, 4412313230540490625L), (long)834203424483934088L) + eI.c(14398, 8991315277376204072L));
                        if (!var2_2) continue block23;
lbl122:
                        // 2 sources

                        v8 /* !! */  = (CallSite)((eI.c(27933, 3025439068339599798L) ^ eI.c(25701, 6511314993200525812L)) * eI.c(11912, 4561229148865772156L) / eI.c(1987, 1655520424498467360L) - eI.c(2116, 8629023939079445737L));
lbl123:
                        // 2 sources

                        var3_3 /* !! */  = (int)v8 /* !! */ ;
                        if (!var2_2) continue block23;
lbl125:
                        // 2 sources

                        var3_3 /* !! */  = eI.c(32239, 7871180603017521184L) * eI.c(11153, 3004570423579295475L) - eI.c(19040, 2345959521049567187L) + eI.c(16410, 5094390207968892305L) - eI.c(23998, 9069997823299111155L);
                        if (!var2_2) continue block23;
lbl127:
                        // 2 sources

                        v9 /* !! */  = (CallSite)(eI.c(26500, 4297079754154341175L) * eI.c(28463, 3466917505693383652L) - eI.c(12561, 4586411601294796024L) ^ eI.c(15251, 6897123377102827348L));
lbl128:
                        // 2 sources

                        var3_3 /* !! */  = (int)v9 /* !! */ ;
                        if (!var2_2) continue block23;
lbl130:
                        // 2 sources

                        var3_3 /* !! */  = (eI.c(18924, 7326722355299933543L) ^ eI.c(9966, 7372995161086898804L)) * eI.c(7331, 3289672856584128785L) / eI.c(1987, 1655520424498467360L) - eI.c(28661, 8202259861435644771L);
                        if (!var2_2) continue block23;
lbl132:
                        // 2 sources

                        v10 /* !! */  = (CallSite)(eI.c(26399, 1960562773275046790L) * eI.c(12396, 615205726799275323L) - eI.c(23239, 5023010717034860437L) ^ eI.c(13904, 7003527972818887648L));
lbl133:
                        // 2 sources

                        var3_3 /* !! */  = (int)v10 /* !! */ ;
                        if (!var2_2) continue block23;
lbl135:
                        // 2 sources

                        var3_3 /* !! */  = (eI.c(171, 6189182506442495234L) ^ eI.c(30407, 5874339318078923683L)) - eI.c(5236, 5620853387396546844L) - eI.c(20886, 4813963272721843581L);
                        continue block23;
lbl137:
                        // 2 sources

                        var3_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)eI.c(25109, 4390509140462368555L), (int)eI.c(25474, 2151715342576154484L), (long)834203424483934088L) / eI.c(1987, 1655520424498467360L)), (int)eI.c(19741, 5536628302368397352L), (long)834203424483934088L) - eI.c(4507, 1742048673491911829L) ^ eI.c(7767, 5422529899773856583L);
                        break block26;
                        case 1098757853: {
                            return false;
                        }
                        case 1098757846: {
                            return false;
                        }
                        case 1098757843: {
                            return false;
                        }
                        case 1098757850: 
                    }
                    break;
                }
                break;
            }
            return false;
        }
        block24: while (true) {
            switch (var3_3 /* !! */ ) {
                case -737586717: {
                    hi.a("G", (long)1326027102069805806L);
                    hi.a("G", (long)976103121275918466L);
                    var3_3 /* !! */  = (eI.c(15402, 2799474103925287069L) * eI.c(21618, 2224341750281290170L) + eI.c(28097, 1915427068067870878L) + eI.c(21586, 5749183092197671275L)) / eI.c(32589, 7807639088688622265L) - eI.c(12363, 4052986667103233381L);
                    continue block24;
                }
            }
            break;
        }
        return v11;
    }

    @Override
    protected void u(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)0, (long)1224674642068939559L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean w(Object[] var1_1) {
        block43: {
            block42: {
                block41: {
                    block37: {
                        block40: {
                            block39: {
                                block38: {
                                    var2_2 = Dl.t();
                                    var7_3 /* !! */  = (eI.c(24224, 8097862001139108673L) ^ eI.c(16355, 555542100458580518L)) * eI.c(28216, 6916327423274974007L) ^ eI.c(948, 554391718201562722L);
                                    if (var2_2) ** GOTO lbl-1000
                                    v0 = var7_3 /* !! */ ;
                                    if (var2_2 != false) return v0;
                                    switch (v0) {
                                        default: lbl-1000:
                                        // 2 sources

                                        {
                                            var3_4 = eI.E("IJ5oOVJRoiNCcnwe", getMainHandItem(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                                            v1 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)675687955611242108L);
                                            if (var2_2) break block38;
                                            if (v1 /* !! */  != false) break;
                                            break block39;
                                        }
                                        case 467447105: {
                                            hi.a("G", (float)1.0f, (long)1329648085340989328L);
                                            return false;
                                        }
                                    }
                                    var7_3 /* !! */  = (int)((CallSite)(eI.c(11720, 8063868527003187367L) / eI.c(23137, 8252693688759439335L) + eI.c(21183, 3255575478564997094L)));
                                    v1 /* !! */  = (CallSite)var7_3 /* !! */ ;
                                }
                                if (!var2_2) break block40;
                            }
                            var7_3 /* !! */  = eI.c(20610, 8902572379732100607L) * eI.c(26482, 6223106038407655953L) - eI.c(26161, 6208825023888093848L);
                        }
                        block29: while (true) {
                            switch (var7_3 /* !! */  ? 1 : 0) {
                                default: {
                                    var5_5 = hi.a("\u00a5", (Object)var3_4, (long)769006157898026769L);
                                    v2 = var5_5 instanceof BlockItem;
                                    if (var2_2) ** GOTO lbl40
                                    if (v2 == 0) ** GOTO lbl39
                                    ** GOTO lbl42
                                }
                                case -865768343: {
                                    hi.a("G", (long)1201432730590593927L);
                                    var7_3 /* !! */  = ((eI.c(9718, 6724802005148643526L) * eI.c(14124, 3907533265801290463L) ^ eI.c(10350, 6444370697418095989L)) + eI.c(18711, 2962685470357609971L)) * eI.c(14962, 11005542816460604L) ^ eI.c(11971, 2613622802251102821L);
                                    continue block29;
                                }
lbl39:
                                // 1 sources

                                v2 = var7_3 /* !! */  = eI.c(25045, 757684585267426377L) / eI.c(23137, 8252693688759439335L) + eI.c(28763, 245265622662243713L);
lbl40:
                                // 2 sources

                                if (var2_2) ** break;
                                continue block29;
lbl42:
                                // 2 sources

                                var7_3 /* !! */  = (eI.c(24426, 3968245822815029837L) ^ eI.c(15730, 8655845287512483952L)) - eI.c(27867, 4813284072099182920L) + eI.c(974, 2445897607305533070L) - eI.c(11969, 7971143640250628674L) + eI.c(26460, 675259784888676948L);
                                break block37;
                                case -865768344: 
                            }
                            break;
                        }
                        return false;
                    }
                    block30: while (true) {
                        switch (var7_3 /* !! */ ) {
                            default: {
                                var4_6 = (BlockItem)var5_5;
                                if (!var2_2) break block30;
                                return false;
                            }
                            case 705951980: {
                                hi.a("G", (long)625190853617808643L);
                                hi.a("G", (long)592969102983354683L);
                                var7_3 /* !! */  = eI.c(30463, 4063346872800109318L) / eI.c(10161, 3932399442004914880L) ^ eI.c(9616, 8571528757556785306L);
                                continue block30;
                            }
                        }
                        break;
                    }
                    var7_3 /* !! */  = (int)(hi.a("G", (int)(eI.c(4618, 3247442657795344352L) ^ eI.c(5137, 3776851740170944861L)), (int)eI.c(30247, 5305922568079467445L), (long)834203424483934088L) - eI.c(6794, 2087996425002684328L));
                    switch (var7_3 /* !! */ ) {
                        default: {
                            var5_5 = hi.a("\u00a5", (Object)var4_6, (long)708963368116028632L);
                            var6_7 = hi.a("\u00a5", (Object)var5_5, (long)879105531338288678L);
                            v3 = var5_5 instanceof EntityBlock;
                            if (var2_2) break block41;
                            if (v3 != 0) break;
                            break block42;
                        }
                        case 1943560459: {
                            throw null;
                        }
                    }
                    v3 = var7_3 /* !! */  = (eI.c(31806, 5580848194628610359L) + eI.c(32196, 4149295768476018867L)) / eI.c(206, 4460808974328272178L) ^ eI.c(24514, 2448129952954436416L);
                }
                if (!var2_2) break block43;
            }
            var7_3 /* !! */  = eI.c(5279, 455929314659860754L) * eI.c(22784, 1830047987252939984L) - eI.c(895, 142416401038087915L) + eI.c(22278, 5414450940354413223L);
            if (var2_2) ** GOTO lbl133
        }
        block31: while (true) {
            switch (var7_3 /* !! */ ) {
                default: {
                    if (hi.a("\u00a5", (Object)var6_7, (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)430579852159213241L), (Object)hi.a("j", (long)470615637083542920L), (long)1328180378428801803L) == null) ** GOTO lbl133
                    ** GOTO lbl135
                }
                case 993766423: {
                    v4 /* !! */  = hi.a("\u00a5", (Object)var6_7, (Object)hi.a("j", (long)1054776084767175835L), (Object)hi.a("j", (long)470615637083542920L), (long)1202128290176401762L);
                    if (var2_2) ** GOTO lbl138
                    if (v4 /* !! */  != false) ** GOTO lbl137
                    ** GOTO lbl140
                }
                case 993766420: {
                    v5 /* !! */  = var5_5 instanceof FallingBlock;
                    if (var2_2) ** GOTO lbl143
                    if (v5 /* !! */  != 0) ** GOTO lbl142
                    ** GOTO lbl144
                }
                case 993766418: {
                    v6 /* !! */  = var5_5 instanceof PumpkinBlock;
                    if (var2_2) ** GOTO lbl147
                    if (v6 /* !! */  != 0) ** GOTO lbl146
                    ** GOTO lbl148
                }
                case 993766424: {
                    v7 /* !! */  = var5_5 instanceof CarvedPumpkinBlock;
                    if (var2_2) ** GOTO lbl151
                    if (v7 /* !! */  != 0) ** GOTO lbl150
                    ** GOTO lbl152
                }
                case 993766421: {
                    v8 /* !! */  = var5_5 instanceof SlimeBlock;
                    if (var2_2) ** GOTO lbl155
                    if (v8 /* !! */  != 0) ** GOTO lbl154
                    ** GOTO lbl156
                }
                case 993766426: {
                    v9 /* !! */  = var5_5 instanceof TntBlock;
                    if (var2_2) ** GOTO lbl159
                    if (v9 /* !! */  != 0) ** GOTO lbl158
                    ** GOTO lbl160
                }
                case 993766425: {
                    v10 = true;
                    var7_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)eI.c(22710, 2022099939443789254L), (int)eI.c(15912, 2613042744857012916L), (long)834203424483934088L), (int)eI.c(29715, 4582522603415265625L), (long)834203424483934088L) + eI.c(26689, 7795818160002235706L));
                    if (!var2_2) ** GOTO lbl163
                    ** GOTO lbl162
                }
                case 993766422: {
                    v10 = false;
                    if (var2_2) {
                        return v10;
                    }
                    ** GOTO lbl162
                }
                case 993766417: {
                    hi.a("G", (float)-1.0f, (long)671146500863747464L);
                    hi.a("G", (long)818835474660401656L);
                    var7_3 /* !! */  = hi.a("G", (int)(eI.c(28261, 9041853785274579887L) * eI.c(27073, 1732831005301013887L)), (int)eI.c(19304, 1794585568640098264L), (long)834203424483934088L) + eI.c(11816, 8120162896765401940L) ^ eI.c(690, 3769612743358977866L);
                    continue block31;
                }
lbl133:
                // 2 sources

                var7_3 /* !! */  = (int)(eI.E("IJ5oOVJRoiNCcnwe", max(int int ), (int)(eI.c(14656, 2269677335748422673L) * eI.c(29442, 2637742204875106195L)), (int)eI.c(25645, 950479134215958825L)) - eI.c(324, 3304732975498401256L) + eI.c(1590, 5804261208843227811L));
                if (!var2_2) continue block31;
lbl135:
                // 2 sources

                var7_3 /* !! */  = (eI.c(9674, 5294363302194851954L) + eI.c(26528, 3267291360011481929L)) / eI.c(1067, 5926648735419634057L) ^ eI.c(3520, 4220007281435220277L);
                if (!var2_2) continue block31;
lbl137:
                // 2 sources

                v4 /* !! */  = (CallSite)(eI.c(22398, 4285340479584879316L) + eI.c(19213, 3885656611927055921L) ^ eI.c(28669, 4008241429871786783L));
lbl138:
                // 2 sources

                var7_3 /* !! */  = (int)v4 /* !! */ ;
                if (!var2_2) continue block31;
lbl140:
                // 2 sources

                var7_3 /* !! */  = (int)(hi.a("G", (int)(eI.c(35, 3149418119400330508L) ^ eI.c(3252, 4654470716009912589L)), (int)eI.c(23380, 5273002672591065006L), (long)834203424483934088L) * eI.c(2362, 2984281455012781170L) + eI.c(21973, 5914913743643197573L));
                if (!var2_2) continue block31;
lbl142:
                // 2 sources

                v5 /* !! */  = var7_3 /* !! */  = (int)(hi.a("G", (int)(eI.c(29716, 6186443037166592366L) * eI.c(15169, 1962436939302875093L)), (int)eI.c(16328, 3894750599069477475L), (long)834203424483934088L) + eI.c(29306, 3227959848441767902L));
lbl143:
                // 2 sources

                if (!var2_2) continue block31;
lbl144:
                // 2 sources

                var7_3 /* !! */  = eI.c(19732, 111918391777056815L) / eI.c(6601, 633679257409555663L) + eI.c(5978, 2254800779124933540L);
                if (!var2_2) continue block31;
lbl146:
                // 2 sources

                v6 /* !! */  = var7_3 /* !! */  = (int)(hi.a("G", (int)(eI.c(13884, 36774713510044352L) * eI.c(20829, 8398377978200868244L)), (int)eI.c(26778, 4980662054636321840L), (long)834203424483934088L) + eI.c(31397, 1327312950511955544L));
lbl147:
                // 2 sources

                if (!var2_2) continue block31;
lbl148:
                // 2 sources

                var7_3 /* !! */  = eI.c(12782, 3801154165400085718L) / 5 + eI.c(8551, 1029626769986172104L);
                if (!var2_2) continue block31;
lbl150:
                // 2 sources

                v7 /* !! */  = var7_3 /* !! */  = (int)(hi.a("G", (int)(eI.c(13884, 36774713510044352L) * eI.c(20829, 8398377978200868244L)), (int)eI.c(26778, 4980662054636321840L), (long)834203424483934088L) + eI.c(31397, 1327312950511955544L));
lbl151:
                // 2 sources

                if (!var2_2) continue block31;
lbl152:
                // 2 sources

                var7_3 /* !! */  = (eI.c(13812, 8354427274675724327L) - eI.c(11861, 8187879538869386197L) - eI.c(9266, 8973855021175320745L) ^ eI.c(22447, 7027823862838641469L)) + eI.c(16423, 46889144063710650L);
                if (!var2_2) continue block31;
lbl154:
                // 2 sources

                v8 /* !! */  = var7_3 /* !! */  = (int)(eI.E("IJ5oOVJRoiNCcnwe", max(int int ), (int)(eI.c(13884, 36774713510044352L) * eI.c(20829, 8398377978200868244L)), (int)eI.c(26778, 4980662054636321840L)) + eI.c(31397, 1327312950511955544L));
lbl155:
                // 2 sources

                if (!var2_2) continue block31;
lbl156:
                // 2 sources

                var7_3 /* !! */  = eI.c(15556, 8242872761794865586L) - eI.c(31936, 2999402329860041090L) + eI.c(14262, 4863880019727229449L) ^ eI.c(14847, 3304927520730655959L);
                if (!var2_2) continue block31;
lbl158:
                // 2 sources

                v9 /* !! */  = var7_3 /* !! */  = (int)(hi.a("G", (int)(eI.c(13884, 36774713510044352L) * eI.c(20829, 8398377978200868244L)), (int)eI.c(26778, 4980662054636321840L), (long)834203424483934088L) + eI.c(31397, 1327312950511955544L));
lbl159:
                // 2 sources

                if (!var2_2) continue block31;
lbl160:
                // 2 sources

                var7_3 /* !! */  = (eI.c(30271, 3179728266913440431L) - eI.c(705, 969819529363822395L) ^ eI.c(988, 7671245991954421565L)) + eI.c(27561, 8207421758782537546L);
                continue block31;
lbl162:
                // 2 sources

                var7_3 /* !! */  = (int)(hi.a("G", (int)eI.E("IJ5oOVJRoiNCcnwe", max(int int ), (int)eI.c(2915, 3608376214707347109L), (int)eI.c(30015, 7748347365556019336L)), (int)eI.c(27778, 2887618961633343762L), (long)834203424483934088L) + eI.c(4583, 43468589113836582L));
lbl163:
                // 2 sources

                switch (var7_3 /* !! */ ) {
                    default: {
                        return v10;
                    }
                    case -333801720: 
                }
                eI.E("IJ5oOVJRoiNCcnwe", values());
                hi.a("G", (int)2, (long)801972633595358600L);
                return true;
                case 993766419: {
                    return false;
                }
                case 993766416: 
            }
            break;
        }
        return false;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float Z(Object[] var1_1) {
        var3_2 = ((Boolean)var1_1[0]).booleanValue();
        var2_3 = ((Boolean)var1_1[1]).booleanValue();
        var4_4 = Dl.S();
        var5_5 = hi.a("G", (int)((eI.c(24775, 7211134868718220366L) ^ eI.c(20273, 546116821369805330L)) + eI.c(5438, 2730395653446008970L)), (int)eI.c(13544, 2066489887992291771L), (long)834203424483934088L) + eI.c(12925, 1248984824133494620L) - eI.c(20195, 8955845345884691308L);
        if (var4_4) ** GOTO lbl20
        block10: while (true) {
            block15: {
                block14: {
                    block13: {
                        v0 = var3_2;
                        v1 = var2_3;
                        if (!var4_4) break block13;
                        if (v0 == v1) break block14;
                        v0 = eI.c(14876, 513465478006550394L) + eI.c(14750, 560252407584173301L) + eI.c(32047, 8957479164657396151L);
                        v1 = eI.c(29159, 7159718675176678417L);
                    }
                    var5_5 = (reference)(v0 - v1);
                    if (var4_4) break block15;
                }
                var5_5 = hi.a("G", (int)(eI.c(14805, 2133687267550440462L) * eI.c(23728, 5962145729841482076L)), (int)eI.c(1553, 6136316364023567254L), (long)834203424483934088L) * eI.c(22961, 2595624981305937159L) + eI.c(9835, 533912647076950808L);
                if (!var4_4) ** GOTO lbl43
            }
            block11: while (true) {
                switch (var5_5) {
                    default: {
                        continue block10;
                    }
                    case -937632665: {
                        v2 = var3_2;
                        if (!var4_4) ** GOTO lbl44
                        if (v2 == 0) ** GOTO lbl43
                        ** GOTO lbl46
                    }
                    case -937632664: {
                        v3 = 1.0f;
                        var5_5 = (reference)(eI.c(29295, 2906711814899132343L) / 5 - eI.c(3378, 6638382695562680792L) + eI.c(16467, 4898337622020478186L));
                        if (var4_4) ** GOTO lbl49
                        ** GOTO lbl48
                    }
                    case -937632666: {
                        v3 = -1.0f;
                        if (!var4_4) {
                            return v3;
                        }
                        ** GOTO lbl48
                    }
                    case -937632663: {
                        throw null;
                    }
lbl43:
                    // 2 sources

                    v2 = (eI.c(31295, 7984700788340649747L) + eI.c(25667, 6338626841620115724L) ^ eI.c(13131, 2357386996456728074L)) / eI.c(30051, 5887975919285100769L) - eI.c(17688, 5584660150699315373L);
lbl44:
                    // 2 sources

                    var5_5 = (reference)v2;
                    if (var4_4) continue block11;
lbl46:
                    // 2 sources

                    var5_5 = (reference)((eI.c(22742, 4291866320790048107L) ^ eI.c(26561, 6255343164331487965L) ^ eI.c(1287, 107331693582029050L)) - eI.c(15928, 8942057744753339381L));
                    continue block11;
lbl48:
                    // 2 sources

                    var5_5 = (reference)(eI.c(138, 6268768873747649808L) / 5 - eI.c(24559, 3992045218179304046L) + eI.c(8671, 4002687883600147750L));
lbl49:
                    // 2 sources

                    switch (var5_5) {
                        default: {
                            return v3;
                        }
                        case 770175789: 
                    }
                    throw null;
                    case -937632662: 
                }
                break;
            }
            break;
        }
        return 0.0f;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE(P=-200)
    private void E(yi var1_1) {
        block55: {
            block54: {
                block52: {
                    block53: {
                        block51: {
                            block49: {
                                block50: {
                                    block48: {
                                        block46: {
                                            block47: {
                                                block45: {
                                                    block43: {
                                                        block44: {
                                                            block42: {
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
                                                                                                        block57: {
                                                                                                            block56: {
                                                                                                                var2_2 = Dl.S();
                                                                                                                var4_3 /* !! */  = (hi.a("G", (int)eI.c(25826, 4187630427862069627L), (int)eI.c(14167, 1438397346212684412L), (long)834203424483934088L) + eI.c(15344, 4900976686747823676L) ^ eI.c(19059, 8421203264567107358L)) + eI.c(27679, 3423454148910119086L) ^ eI.c(26745, 4015172012082494860L);
                                                                                                                if (var2_2) break block56;
lbl4:
                                                                                                                // 2 sources

                                                                                                                while (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)907159218940561824L), (long)1017954173869996748L) != null) {
                                                                                                                    break block32;
                                                                                                                }
                                                                                                                break block57;
lbl7:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    eI.E("IJ5oOVJRoiNCcnwe", G());
lbl10:
                                                                                                                    // 2 sources

                                                                                                                    return;
                                                                                                                }
lbl12:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    var3_4 = hi.a("G", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)961150177177550205L), (long)463539385705767039L);
                                                                                                                    v0 /* !! */  = hi.a("\u00a5", (Object)((Boolean)eI.E("IJ5oOVJRoiNCcnwe", z(), (Xn)hi.a("\u00e9", (Object)this, (long)1265665447390892615L))), (long)1000026253634408124L);
                                                                                                                    if (!var2_2) break block33;
                                                                                                                    if (v0 /* !! */  == false) break block34;
                                                                                                                    break block35;
                                                                                                                    break;
                                                                                                                }
lbl18:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    v1 /* !! */  = var3_4;
                                                                                                                    if (!var2_2) break block36;
                                                                                                                    if (v1 /* !! */  == false) break block37;
                                                                                                                    break block38;
                                                                                                                    break;
                                                                                                                }
lbl23:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    v2 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1174361989732756733L);
                                                                                                                    if (!var2_2) break block39;
                                                                                                                    if (v2 /* !! */  == false) break block40;
                                                                                                                    break block41;
                                                                                                                    break;
                                                                                                                }
lbl28:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{false}, (long)374643115609907404L);
                                                                                                                    if (var2_2) break block42;
lbl31:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        v3 /* !! */  = hi.a("\u00a5", (Object)var1_1, (Object)new Object[0], (long)1182702535832391124L);
                                                                                                                        if (!var2_2) break block43;
                                                                                                                        if (v3 /* !! */  != false) break block44;
                                                                                                                        break block45;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
lbl36:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    v4 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1174361989732756733L);
                                                                                                                    if (!var2_2) break block46;
                                                                                                                    if (v4 /* !! */  == false) break block47;
                                                                                                                    break block48;
                                                                                                                    break;
                                                                                                                }
lbl41:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    v5 /* !! */  = hi.a("\u00e9", (Object)this, (long)1224674642068939559L);
                                                                                                                    if (!var2_2) break block49;
                                                                                                                    if (v5 /* !! */  > 0) break block50;
                                                                                                                    break block51;
                                                                                                                    break;
                                                                                                                }
lbl46:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    v6 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)693370517752370281L);
                                                                                                                    if (!var2_2) break block52;
                                                                                                                    if (v6 /* !! */  == false) break block53;
                                                                                                                    break block54;
                                                                                                                    break;
                                                                                                                }
lbl51:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{true}, (long)374643115609907404L);
                                                                                                                    if (!var2_2) lbl-1000:
                                                                                                                    // 2 sources

                                                                                                                    {
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    break block55;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
lbl58:
                                                                                                            // 3 sources

                                                                                                            while (true) {
                                                                                                                switch (var4_3 /* !! */ ) {
                                                                                                                    default: {
                                                                                                                        ** GOTO lbl4
                                                                                                                    }
                                                                                                                    case 1053411906: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case 1053411904: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    ** case 1053411905:
lbl67:
                                                                                                                    // 1 sources

                                                                                                                    ** continue;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
lbl68:
                                                                                                            // 16 sources

                                                                                                            while (true) {
                                                                                                                switch (var4_3 /* !! */ ) {
                                                                                                                    default: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768634: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768637: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768640: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768639: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768636: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768633: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768638: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768635: {
                                                                                                                        ** continue;
                                                                                                                    }
                                                                                                                    case -1592768642: 
                                                                                                                }
                                                                                                                hi.a("G", (boolean)true, (float)2.0f, (long)1038439073664936945L);
                                                                                                                hi.a("G", (long)736398430265084806L);
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        var4_3 /* !! */  = eI.c(10471, 1163670454469901682L) * eI.c(22333, 2814357895297909302L) / eI.c(14967, 6412434102641143595L) - eI.c(23335, 84302778637733414L);
                                                                                                        if (var2_2) ** GOTO lbl58
                                                                                                    }
                                                                                                    var4_3 /* !! */  = eI.c(16371, 24563450018835284L) - eI.c(21786, 6392496826050626004L) + eI.c(2924, 3407033210968350455L);
                                                                                                    ** while (true)
                                                                                                }
                                                                                                v0 /* !! */  = (CallSite)(eI.c(30378, 7834922586291233348L) - eI.c(18605, 1620539310518984152L) - eI.c(18867, 4639216936843729949L) - eI.c(23333, 3171519072103779894L));
                                                                                            }
                                                                                            var4_3 /* !! */  = (int)v0 /* !! */ ;
                                                                                            if (var2_2) ** GOTO lbl68
                                                                                        }
                                                                                        var4_3 /* !! */  = eI.c(17207, 3259935971471087347L) / eI.c(26557, 1366464051293713209L) / eI.c(10639, 1228881862499745074L) + eI.c(9370, 9137843601904087463L) ^ eI.c(27164, 1372238231617437420L);
                                                                                        if (var2_2) ** GOTO lbl68
                                                                                    }
                                                                                    v1 /* !! */  = (CallSite)(eI.c(6370, 7931520278829960514L) - eI.c(16101, 3556332542435535441L) - eI.c(14206, 5854960799683453513L) - eI.c(5728, 25093049137562471L));
                                                                                }
                                                                                var4_3 /* !! */  = (int)v1 /* !! */ ;
                                                                                if (var2_2) ** GOTO lbl68
                                                                            }
                                                                            var4_3 /* !! */  = (int)(hi.a("G", (int)eI.c(6797, 6646541863667863424L), (int)eI.c(16111, 7198643376095570801L), (long)834203424483934088L) / eI.c(17791, 6194040871633604853L) * eI.c(30181, 1531772652323495970L) - eI.c(7130, 3684088618904718873L));
                                                                            if (var2_2) ** GOTO lbl68
                                                                        }
                                                                        v2 /* !! */  = (CallSite)(eI.c(6370, 7931520278829960514L) - eI.c(16101, 3556332542435535441L) - eI.c(14206, 5854960799683453513L) - eI.c(5728, 25093049137562471L));
                                                                    }
                                                                    var4_3 /* !! */  = (int)v2 /* !! */ ;
                                                                    if (var2_2) ** GOTO lbl68
                                                                }
                                                                var4_3 /* !! */  = (int)(eI.E("IJ5oOVJRoiNCcnwe", max(int int ), (int)eI.c(20643, 8004549547243848786L), (int)eI.c(4956, 8593944345033541530L)) - eI.c(27270, 8692375017789029888L) + eI.c(8090, 2695215418182011599L) + eI.c(28073, 2839626373670369558L));
                                                                if (var2_2) ** GOTO lbl68
                                                            }
                                                            var4_3 /* !! */  = eI.c(6370, 7931520278829960514L) - eI.c(16101, 3556332542435535441L) - eI.c(14206, 5854960799683453513L) - eI.c(5728, 25093049137562471L);
                                                            if (var2_2) ** GOTO lbl68
                                                        }
                                                        v3 /* !! */  = (CallSite)(hi.a("G", (int)eI.c(27720, 3303387293311957122L), (int)eI.c(15557, 5312990824240195949L), (long)834203424483934088L) / eI.c(22625, 4556365382053219681L) * eI.c(849, 384146477668636334L) ^ eI.c(1268, 9210373725996814610L));
                                                    }
                                                    var4_3 /* !! */  = (int)v3 /* !! */ ;
                                                    if (var2_2) ** GOTO lbl68
                                                }
                                                var4_3 /* !! */  = eI.c(32361, 5336672529714801526L) - eI.c(2685, 7679079928667020977L) + eI.c(15619, 7931410028473133304L);
                                                if (var2_2) ** GOTO lbl68
                                            }
                                            v4 /* !! */  = (CallSite)(hi.a("G", (int)eI.c(19852, 9041971944882657515L), (int)eI.c(3633, 5992137227609315981L), (long)834203424483934088L) / eI.c(12998, 5186338243810699137L) * eI.c(30900, 8278444467561033194L) ^ eI.c(12459, 6479361113836889107L));
                                        }
                                        var4_3 /* !! */  = (int)v4 /* !! */ ;
                                        if (var2_2) ** GOTO lbl68
                                    }
                                    var4_3 /* !! */  = hi.a("G", (int)eI.c(2123, 1110906453718441332L), (int)eI.c(1167, 2577909805506269586L), (long)834203424483934088L) / 2 ^ eI.c(6501, 3410130976460377475L);
                                    if (var2_2) ** GOTO lbl68
                                }
                                v5 /* !! */  = (CallSite)((eI.c(24721, 8790207020065748412L) - eI.c(8731, 6948604651560515475L)) * eI.c(15682, 525024238347266260L) - eI.c(27901, 66157153239431427L));
                            }
                            var4_3 /* !! */  = (int)v5 /* !! */ ;
                            if (var2_2) ** GOTO lbl68
                        }
                        var4_3 /* !! */  = (eI.c(11340, 6951226693630638444L) - eI.c(14657, 3758970203571662306L) + eI.c(30250, 7827030514314339124L) ^ eI.c(7336, 2584093367076194682L)) + eI.c(14046, 1117971655339975245L);
                        if (var2_2) ** GOTO lbl68
                    }
                    v6 /* !! */  = (CallSite)(hi.a("G", (int)eI.c(19852, 9041971944882657515L), (int)eI.c(3633, 5992137227609315981L), (long)834203424483934088L) / eI.c(12998, 5186338243810699137L) * eI.c(30900, 8278444467561033194L) ^ eI.c(12459, 6479361113836889107L));
                }
                var4_3 /* !! */  = (int)v6 /* !! */ ;
                if (var2_2) ** GOTO lbl68
            }
            var4_3 /* !! */  = (eI.c(10575, 5766630800842898665L) - eI.c(21464, 7065974437476484634L)) * eI.c(3762, 5385171672287157212L) - eI.c(23691, 8445761446009031121L);
            if (var2_2) ** GOTO lbl68
        }
        var4_3 /* !! */  = hi.a("G", (int)eI.c(19852, 9041971944882657515L), (int)eI.c(3633, 5992137227609315981L), (long)834203424483934088L) / eI.c(12998, 5186338243810699137L) * eI.c(30900, 8278444467561033194L) ^ eI.c(12459, 6479361113836889107L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public String g(Object[] var1_1) {
        block14: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = eI.c(15465, 939183710262667500L) + eI.c(21177, 7408247528654915424L) ^ eI.c(13025, 7743558027183793682L);
            if (!var2_2) ** GOTO lbl15
            block8: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1005219483234430943L), (long)789438897355831922L)), (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)743517135174305621L), (long)789438897355831922L), (long)631204568898345464L);
                            if (var2_2) break block15;
                            if (v0 /* !! */  != false) break block16;
                            v0 /* !! */  = (CallSite)((eI.c(22391, 2420336205279314601L) + eI.c(5584, 8672542565205344552L)) * eI.c(28894, 8027672040756307211L) + eI.c(17660, 5963515818132263370L));
                        }
                        var3_3 /* !! */  = (int)v0 /* !! */ ;
                        if (!var2_2) break block17;
                    }
                    var3_3 /* !! */  = eI.c(27308, 954098559385337694L) / eI.c(23674, 5564717686378416551L) + eI.c(3084, 1564197363195123876L);
                }
                switch (var3_3 /* !! */ ) {
                    default: {
                        continue block8;
                    }
                    case -1931241753: {
                        v1 = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1005219483234430943L), (long)789438897355831922L)), (long)518511143488095322L);
                        var3_3 /* !! */  = (eI.c(8020, 1665714522004818535L) - eI.c(11613, 6818334083310139465L)) * eI.c(28048, 8039838584219170835L) ^ eI.c(11306, 1668459318209919438L) ^ eI.c(31828, 1097377128863951261L);
                        if (var2_2) {
                            break block8;
                        }
                        break block14;
                    }
                    case -1931241752: {
                        v1 = (String)hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1005219483234430943L), (long)789438897355831922L), (long)1151956270580063272L) + "-" + (String)hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)743517135174305621L), (long)789438897355831922L), (long)1151956270580063272L);
                        if (!var2_2) break block8;
                        return v1;
                    }
                    case -1931241751: {
                        hi.a("G", (long)578153914721391355L);
                        hi.a("G", (long)373721845012904719L);
                        return eI.b(-28036, 16934);
                    }
                }
                break;
            }
            var3_3 /* !! */  = (eI.c(927, 453545143359346536L) - eI.c(28414, 5329874533720161183L)) * eI.c(14107, 8357695700263936522L) ^ eI.c(10728, 1535608872795782426L) ^ eI.c(21029, 8056340075732846449L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v1;
            }
            case -1651228356: 
        }
        throw null;
    }

    @Override
    protected void b(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)0, (long)1224674642068939559L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE(P=-200)
    private void w(dR var1_1) {
        block27: {
            block26: {
                block24: {
                    block25: {
                        block23: {
                            block21: {
                                block22: {
                                    block20: {
                                        block19: {
                                            block17: {
                                                block18: {
                                                    var2_2 = Dl.S();
                                                    var3_3 /* !! */  = eI.c(26845, 8028729031919139954L) + eI.c(26773, 7393889960690253173L) + eI.c(4889, 8674496274415486865L) ^ eI.c(21424, 6233524244742358622L);
                                                    if (!var2_2) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)1224674642068939559L);
                                                            if (!var2_2) break block17;
                                                            if (v0 /* !! */  <= 0) break block18;
                                                            break block19;
                                                            break;
                                                        }
lbl9:
                                                        // 1 sources

                                                        while (true) {
                                                            v1 = this;
                                                            hi.a("\u00f2", (Object)v1, (int)(hi.a("\u00e9", (Object)v1, (long)1224674642068939559L) - true), (long)1224674642068939559L);
                                                            if (var2_2) break block20;
lbl13:
                                                            // 2 sources

                                                            while (true) {
                                                                v2 /* !! */  = hi.a("\u00e9", (Object)this, (long)1224674642068939559L);
                                                                if (!var2_2) break block21;
                                                                if (v2 /* !! */  != false) break block22;
                                                                break block23;
                                                                break;
                                                            }
                                                            break;
                                                        }
lbl18:
                                                        // 1 sources

                                                        while (true) {
                                                            v3 /* !! */  = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)693370517752370281L);
                                                            if (!var2_2) break block24;
                                                            if (v3 /* !! */  == false) break block25;
                                                            break block26;
                                                            break;
                                                        }
lbl23:
                                                        // 1 sources

                                                        while (true) {
                                                            hi.a("\u00f2", (Object)this, (int)eI.E("IJ5oOVJRoiNCcnwe", H(int int ), (int)hi.a("\u00a5", (Object)((Integer)eI.E("IJ5oOVJRoiNCcnwe", z(), (XG)hi.a("\u00e9", (Object)this, (long)1005219483234430943L))), (long)1260538186742955956L), (int)eI.E("IJ5oOVJRoiNCcnwe", intValue(), (Integer)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)743517135174305621L), (long)789438897355831922L)))), (long)1224674642068939559L);
                                                            if (!var2_2) lbl-1000:
                                                            // 2 sources

                                                            {
                                                                return;
                                                            }
                                                            break block27;
                                                            break;
                                                        }
                                                    }
lbl29:
                                                    // 10 sources

                                                    while (true) {
                                                        switch (var3_3 /* !! */ ) {
                                                            default: {
                                                                ** continue;
                                                            }
                                                            case 866719265: {
                                                                ** continue;
                                                            }
                                                            case 866719269: {
                                                                ** continue;
                                                            }
                                                            case 866719263: {
                                                                ** continue;
                                                            }
                                                            case 866719266: {
                                                                ** continue;
                                                            }
                                                            case 866719267: {
                                                                ** continue;
                                                            }
                                                            case 866719268: 
                                                        }
                                                        hi.a("G", (long)1318921989870229166L);
                                                        return;
                                                    }
                                                }
                                                v0 /* !! */  = (CallSite)(eI.c(13578, 1792754840905654667L) * eI.c(27860, 5440844373719087550L) - eI.c(17830, 4602167674888605758L) - eI.c(899, 7322181520777221866L));
                                            }
                                            var3_3 /* !! */  = (int)v0 /* !! */ ;
                                            if (var2_2) ** GOTO lbl29
                                        }
                                        var3_3 /* !! */  = eI.c(28967, 4524082128548488320L) ^ eI.c(355, 7895143904042783773L) ^ eI.c(16895, 487674536124273869L);
                                        if (var2_2) ** GOTO lbl29
                                    }
                                    var3_3 /* !! */  = eI.c(29296, 4547087746556159728L) * eI.c(26240, 5607287424922284986L) - eI.c(4470, 1513731018374677918L) - eI.c(9399, 719964290254221653L);
                                    if (var2_2) ** GOTO lbl29
                                }
                                v2 /* !! */  = (CallSite)(eI.c(10346, 8899885674288823713L) + eI.c(2245, 6891039143315119570L) + eI.c(25940, 5285926634270585291L));
                            }
                            var3_3 /* !! */  = (int)v2 /* !! */ ;
                            if (var2_2) ** GOTO lbl29
                        }
                        var3_3 /* !! */  = eI.c(26973, 6778559936460618946L) - eI.c(17078, 881507080960530239L) + eI.c(26900, 53035064369577036L);
                        if (var2_2) ** GOTO lbl29
                    }
                    v3 /* !! */  = (CallSite)(eI.c(19058, 4073732908916367270L) + eI.c(29953, 4696908013785571471L) + eI.c(4331, 6073413434057294923L));
                }
                var3_3 /* !! */  = (int)v3 /* !! */ ;
                if (var2_2) ** GOTO lbl29
            }
            var3_3 /* !! */  = eI.c(3080, 7704006101960497573L) - eI.c(8235, 8345864605574149438L) - eI.c(1947, 1285273683570758453L);
            if (var2_2) ** GOTO lbl29
        }
        var3_3 /* !! */  = eI.c(19058, 4073732908916367270L) + eI.c(29953, 4696908013785571471L) + eI.c(4331, 6073413434057294923L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Vec3 y(Object[] var1_1) {
        block14: {
            block12: {
                block13: {
                    var2_2 = Dl.t();
                    var9_3 /* !! */  = eI.c(3138, 5217995261669415175L) + eI.c(9905, 2524266566669742639L) ^ eI.c(12449, 5076715289750316076L) ^ eI.c(23619, 5655274450942249357L);
                    if (var2_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            v0 = new Object[2];
                            v0[1] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1181070455859876505L), (long)622868109502394347L);
                            v0[0] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)884774916442844591L), (long)622868109502394347L);
                            var3_4 = hi.a("\u00a5", (Object)this, (Object)v0, (long)905963404781254732L) * 0.98f;
                            v1 = new Object[2];
                            v1[1] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)890373966890392112L), (long)622868109502394347L);
                            v1[0] = (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)746342926556941089L), (long)622868109502394347L);
                            var4_5 = hi.a("\u00a5", (Object)this, (Object)v1, (long)905963404781254732L) * 0.98f;
                            var5_6 = var3_4 * var3_4 + var4_5 * var4_5;
                            cfr_temp_0 = var5_6 - 1.0E-4f;
                            v2 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var2_2) break block12;
                            if (v2 /* !! */  >= 0) break block13;
                            break block14;
                            break;
                        }
lbl20:
                        // 1 sources

                        return hi.a("j", (long)861421277467195016L);
lbl22:
                        // 1 sources

                        while (true) {
                            var5_6 = hi.a("G", (float)hi.a("G", (float)var5_6, (long)1058598864707910295L), (float)1.0f, (long)1021203527991582354L);
                            var6_7 = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)477117314899401839L) / var5_6;
                            var7_8 = hi.a("G", (double)((double)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)700108823764850555L) * 0.017453292f)), (long)651411597689335820L);
                            var8_9 = hi.a("G", (double)((double)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)700108823764850555L) * 0.017453292f)), (long)665261795861296096L);
                            return new Vec3((double)((var3_4 *= var6_7) * var8_9 - (var4_5 *= var6_7) * var7_8), 0.0, (double)(var4_5 * var8_9 + var3_4 * var7_8));
                        }
                    }
                    switch (var9_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -249445438: {
                            return null;
                        }
                    }
lbl33:
                    // 2 sources

                    while (true) {
                        switch (var9_3 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case 319269492: {
                                ** continue;
                            }
                            case 319269491: {
                                return null;
                            }
                        }
                        break;
                    }
                }
                v2 /* !! */  = (reference)(eI.c(4173, 8270261059370386697L) * eI.c(2578, 2192458236775309023L) + eI.c(25853, 2888599303863464007L));
            }
            var9_3 /* !! */  = (int)v2 /* !! */ ;
            if (!var2_2) ** GOTO lbl33
        }
        var9_3 /* !! */  = (hi.a("G", (int)eI.c(20529, 3779687205938218116L), (int)eI.c(13510, 2442640973701193742L), (long)834203424483934088L) ^ eI.c(3236, 5027709884458801227L) ^ eI.c(9737, 6145509050747761464L)) + eI.c(3598, 5722540024793668374L);
        ** while (true)
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFF9279) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 144;
                case 1 -> 230;
                case 2 -> 218;
                case 3 -> 186;
                case 4 -> 55;
                case 5 -> 241;
                case 6 -> 170;
                case 7 -> 188;
                case 8 -> 206;
                case 9 -> 11;
                case 10 -> 0;
                case 11 -> 65;
                case 12 -> 50;
                case 13 -> 31;
                case 14 -> 228;
                case 15 -> 83;
                case 16 -> 14;
                case 17 -> 243;
                case 18 -> 174;
                case 19 -> 114;
                case 20 -> 38;
                case 21 -> 22;
                case 22 -> 142;
                case 23 -> 32;
                case 24 -> 23;
                case 25 -> 95;
                case 26 -> 12;
                case 27 -> 133;
                case 28 -> 124;
                case 29 -> 192;
                case 30 -> 33;
                case 31 -> 5;
                case 32 -> 27;
                case 33 -> 151;
                case 34 -> 184;
                case 35 -> 249;
                case 36 -> 157;
                case 37 -> 4;
                case 38 -> 120;
                case 39 -> 222;
                case 40 -> 67;
                case 41 -> 227;
                case 42 -> 53;
                case 43 -> 136;
                case 44 -> 48;
                case 45 -> 252;
                case 46 -> 195;
                case 47 -> 182;
                case 48 -> 99;
                case 49 -> 87;
                case 50 -> 88;
                case 51 -> 225;
                case 52 -> 34;
                case 53 -> 24;
                case 54 -> 135;
                case 55 -> 177;
                case 56 -> 84;
                case 57 -> 156;
                case 58 -> 162;
                case 59 -> 8;
                case 60 -> 104;
                case 61 -> 253;
                case 62 -> 137;
                case 63 -> 18;
                case 64 -> 126;
                case 65 -> 125;
                case 66 -> 93;
                case 67 -> 194;
                case 68 -> 205;
                case 69 -> 62;
                case 70 -> 9;
                case 71 -> 134;
                case 72 -> 143;
                case 73 -> 35;
                case 74 -> 37;
                case 75 -> 190;
                case 76 -> 149;
                case 77 -> 51;
                case 78 -> 158;
                case 79 -> 80;
                case 80 -> 223;
                case 81 -> 17;
                case 82 -> 43;
                case 83 -> 246;
                case 84 -> 129;
                case 85 -> 26;
                case 86 -> 89;
                case 87 -> 54;
                case 88 -> 69;
                case 89 -> 140;
                case 90 -> 47;
                case 91 -> 110;
                case 92 -> 203;
                case 93 -> 10;
                case 94 -> 86;
                case 95 -> 3;
                case 96 -> 85;
                case 97 -> 173;
                case 98 -> 185;
                case 99 -> 7;
                case 100 -> 204;
                case 101 -> 115;
                case 102 -> 78;
                case 103 -> 167;
                case 104 -> 213;
                case 105 -> 163;
                case 106 -> 193;
                case 107 -> 41;
                case 108 -> 52;
                case 109 -> 81;
                case 110 -> 40;
                case 111 -> 131;
                case 112 -> 101;
                case 113 -> 171;
                case 114 -> 191;
                case 115 -> 71;
                case 116 -> 148;
                case 117 -> 29;
                case 118 -> 189;
                case 119 -> 139;
                case 120 -> 76;
                case 121 -> 155;
                case 122 -> 251;
                case 123 -> 109;
                case 124 -> 220;
                case 125 -> 245;
                case 126 -> 187;
                case 127 -> 219;
                case 128 -> 239;
                case 129 -> 236;
                case 130 -> 224;
                case 131 -> 159;
                case 132 -> 105;
                case 133 -> 79;
                case 134 -> 39;
                case 135 -> 64;
                case 136 -> 160;
                case 137 -> 244;
                case 138 -> 180;
                case 139 -> 235;
                case 140 -> 102;
                case 141 -> 19;
                case 142 -> 200;
                case 143 -> 70;
                case 144 -> 73;
                case 145 -> 58;
                case 146 -> 150;
                case 147 -> 248;
                case 148 -> 6;
                case 149 -> 63;
                case 150 -> 107;
                case 151 -> 74;
                case 152 -> 117;
                case 153 -> 119;
                case 154 -> 215;
                case 155 -> 100;
                case 156 -> 154;
                case 157 -> 36;
                case 158 -> 122;
                case 159 -> 57;
                case 160 -> 166;
                case 161 -> 90;
                case 162 -> 183;
                case 163 -> 226;
                case 164 -> 198;
                case 165 -> 232;
                case 166 -> 111;
                case 167 -> 238;
                case 168 -> 217;
                case 169 -> 234;
                case 170 -> 123;
                case 171 -> 82;
                case 172 -> 75;
                case 173 -> 250;
                case 174 -> 118;
                case 175 -> 49;
                case 176 -> 108;
                case 177 -> 66;
                case 178 -> 132;
                case 179 -> 45;
                case 180 -> 1;
                case 181 -> 94;
                case 182 -> 231;
                case 183 -> 61;
                case 184 -> 147;
                case 185 -> 179;
                case 186 -> 216;
                case 187 -> 229;
                case 188 -> 128;
                case 189 -> 202;
                case 190 -> 97;
                case 191 -> 56;
                case 192 -> 176;
                case 193 -> 59;
                case 194 -> 165;
                case 195 -> 172;
                case 196 -> 237;
                case 197 -> 197;
                case 198 -> 221;
                case 199 -> 103;
                case 200 -> 145;
                case 201 -> 255;
                case 202 -> 181;
                case 203 -> 15;
                case 204 -> 21;
                case 205 -> 152;
                case 206 -> 16;
                case 207 -> 96;
                case 208 -> 113;
                case 209 -> 247;
                case 210 -> 164;
                case 211 -> 98;
                case 212 -> 68;
                case 213 -> 242;
                case 214 -> 212;
                case 215 -> 210;
                case 216 -> 254;
                case 217 -> 233;
                case 218 -> 209;
                case 219 -> 92;
                case 220 -> 116;
                case 221 -> 28;
                case 222 -> 199;
                case 223 -> 72;
                case 224 -> 30;
                case 225 -> 91;
                case 226 -> 20;
                case 227 -> 138;
                case 228 -> 208;
                case 229 -> 127;
                case 230 -> 46;
                case 231 -> 214;
                case 232 -> 196;
                case 233 -> 201;
                case 234 -> 175;
                case 235 -> 207;
                case 236 -> 42;
                case 237 -> 168;
                case 238 -> 161;
                case 239 -> 153;
                case 240 -> 60;
                case 241 -> 121;
                case 242 -> 178;
                case 243 -> 44;
                case 244 -> 25;
                case 245 -> 2;
                case 246 -> 106;
                case 247 -> 13;
                case 248 -> 211;
                case 249 -> 146;
                case 250 -> 77;
                case 251 -> 240;
                case 252 -> 130;
                case 253 -> 112;
                case 254 -> 169;
                default -> 141;
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
            eI.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x15AF;
        if (d[n2] == null) {
            eI.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
