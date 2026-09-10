/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.BlockHitResult
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.Xn;
import com.github.epsilon.d9;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.le;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.z4;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;

public class D
extends e {
    private final Dx<z4> X = hi.a("\u00a5", (Object)this, (Object)D.b(-13788, -17052), (Object)hi.a("j", (long)582893590657786848L), (long)426795652261052192L);
    private final Xn u;
    private final DM F;
    public static final D v;
    private final DV M;
    private final DM k;
    private final DV x = hi.a("\u00a5", (Object)this, (Object)D.b(-13789, 14644), (Object)new Color(D.c(3265, 6549967538115469207L), D.c(10804, 1150778555544402223L), D.c(10804, 1150778555544402223L), D.c(18220, 1465188704392090702L)), this::lambda$new$0, (long)1241661680830497550L);
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$2() {
        Object object;
        block3: {
            block4: {
                boolean bl;
                block2: {
                    bl = Dl.t();
                    object = hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)897333804283335909L), (long)789438897355831922L))), (long)1000026253634408124L);
                    if (bl) break block2;
                    if (object == false) break block3;
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)969239672674210396L), (long)511460060498514638L);
                }
                if (bl) return (boolean)object;
                if (object != false) break block4;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)444903241092774113L), (long)511460060498514638L);
                if (bl) return (boolean)object;
                if (object != false) break block4;
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)678157694992657530L), (long)511460060498514638L);
                if (bl) return (boolean)object;
                if (object == false) break block3;
            }
            object = true;
            return (boolean)object;
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void p(d9 var1_1) {
        block42: {
            var2_2 = Dl.S();
            var10_3 /* !! */  = (D.c(23423, 6608083090755979280L) + D.c(21436, 7282778098774278364L)) * D.c(28720, 8452502579097445217L) - D.c(23062, 7075507016860895597L);
            if (!var2_2) ** GOTO lbl-1000
            switch (var10_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var3_4 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)428516247733622110L);
                    if (!var2_2) ** GOTO lbl104
                    if (var3_4 == null) ** GOTO lbl103
                    if (true) ** GOTO lbl105
                }
                case 2079895001: {
                    return;
                }
            }
lbl12:
            // 2 sources

            while (true) {
                var5_6 = hi.a("\u00a5", (Object)((Double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)677250368557089411L), (long)789438897355831922L)), (long)371266768739483732L);
                var6_7 = new AABB((BlockPos)hi.a("\u00a5", (Object)var4_5, (long)367457867556936554L));
                var7_8 = hi.a("\u00a5", (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1022111400281912654L), (long)789438897355831922L)), (long)921162811333111485L);
                var8_9 = hi.a("\u00a5", (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1061806222416493989L), (long)789438897355831922L)), (long)921162811333111485L);
                var9_10 = hi.a("\u00a5", (Object)var4_5, (long)1085058882649236422L);
                v0 /* !! */  = hi.a("\u00a5", (Object)((z4)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (long)789438897355831922L)), (long)781781222706254678L);
                if (var2_2) {
                    switch (v0 /* !! */ ) {
                        case 0: {
                            var10_3 /* !! */  = (int)(hi.a("G", (int)D.c(16475, 3768716751884948225L), (int)D.c(13817, 6466991383743555218L), (long)834203424483934088L) - D.c(31338, 8022664654131112221L) - D.c(13681, 8147452490108692072L));
                            if (var2_2) break block42;
                        }
                        case 1: {
                            var10_3 /* !! */  = hi.a("G", (int)(D.c(9149, 664840336723505349L) ^ D.c(18890, 8609377252675197624L)), (int)D.c(16331, 2587271021492858014L), (long)834203424483934088L) + D.c(22973, 8150664510467214052L) ^ D.c(2169, 6527784071660723003L);
                            if (var2_2) break block42;
                        }
                        case 2: {
                            var10_3 /* !! */  = (D.c(24340, 1976423078017666131L) - D.c(20469, 835515045257845999L) - D.c(26932, 34375046647921246L)) * D.c(2465, 3651495101574830833L) ^ D.c(13715, 2017137098186647173L);
                            if (var2_2) break block42;
                        }
                        case 3: {
                            var10_3 /* !! */  = D.c(151, 2894667560471516158L) + D.c(9232, 6867762539308480357L) ^ D.c(2174, 7387809875855104799L) ^ D.c(31304, 2341244634143271256L);
                            if (var2_2) break block42;
                        }
                        case 4: {
                            var10_3 /* !! */  = hi.a("G", (int)(D.c(21117, 3388909467063386394L) ^ D.c(15514, 694290597903265770L) ^ D.c(18624, 1955050707908336535L)), (int)D.c(24232, 6518028492576230901L), (long)834203424483934088L) ^ D.c(13202, 4816363154281062546L);
                            if (var2_2) break block42;
                        }
                        case 5: {
                            var10_3 /* !! */  = ((D.c(9344, 3920595200289961933L) + D.c(18973, 4714755516032522608L)) / D.c(156, 1020294765905368048L) - D.c(13414, 5966000919327270761L) ^ D.c(27157, 8492899397487081840L)) + D.c(10435, 1517355471241640840L);
                            if (var2_2) ** break;
                            break;
                        }
                    }
                    v0 /* !! */  = (CallSite)(D.c(15142, 8091669206782994512L) + D.c(11846, 1226362400335527197L) - D.c(27244, 711945356878133544L));
                }
                var10_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) break block42;
                ** GOTO lbl141
                break;
            }
lbl44:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)this, (Object)new Object[]{var6_7}, (long)594719109390394697L);
                D.j("opeA4lO0JNrGCPVT", X(net.minecraft.world.phys.AABB int float net.minecraft.core.Direction ), (le)hi.a("j", (long)472618207811515361L), (AABB)var6_7, (int)var8_9, (float)var5_6, (Direction)var9_10);
                v1 = new Object[3];
                v1[2] = var9_10;
                v1[1] = (int)var7_8;
                v1[0] = var6_7;
                hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)v1, (long)1129529514224350184L);
                if (var2_2) ** GOTO lbl143
lbl53:
                // 2 sources

                while (true) {
                    hi.a("\u00a5", (Object)this, (Object)new Object[]{var6_7}, (long)594719109390394697L);
                    v2 = new Object[2];
                    v2[1] = (int)var7_8;
                    v2[0] = var6_7;
                    hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)v2, (long)913259398591958532L);
                    if (var2_2) ** GOTO lbl145
lbl60:
                    // 2 sources

                    while (true) {
                        v3 = new Object[3];
                        v3[2] = var9_10;
                        v3[1] = (int)var7_8;
                        v3[0] = var6_7;
                        hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)v3, (long)1129529514224350184L);
                        if (var2_2) ** GOTO lbl147
lbl67:
                        // 2 sources

                        while (true) {
                            hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)var6_7, (int)var8_9, (float)var5_6, (long)739893072227345033L);
                            if (var2_2) ** GOTO lbl149
lbl70:
                            // 2 sources

                            while (true) {
                                hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)var6_7, (int)var8_9, (float)var5_6, (Object)var9_10, (long)480053476324237379L);
                                if (!var2_2) {
                                    return;
                                }
                                ** GOTO lbl151
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
            block35: while (true) {
                switch (var10_3 /* !! */ ) {
                    default: {
                        if (hi.a("\u00a5", (Object)var3_4, (long)760876273703437601L) != hi.a("j", (long)1164827453998066990L)) ** GOTO lbl107
                        ** GOTO lbl109
                    }
                    case 19425973: {
                        v4 = var3_4 instanceof BlockHitResult;
                        if (!var2_2) ** GOTO lbl112
                        if (v4 == 0) ** GOTO lbl111
                        ** GOTO lbl113
                    }
                    case 19425977: {
                        var4_5 = (BlockHitResult)var3_4;
                        if (!var2_2) {
                            return;
                        }
                        ** GOTO lbl93
                    }
                    case 19425975: {
                        throw null;
                    }
lbl93:
                    // 1 sources

                    var10_3 /* !! */  = (int)(hi.a("G", (int)(D.c(8146, 3656630725032824024L) / D.c(28488, 4934071614053235726L)), (int)D.c(25051, 3097868486036402853L), (long)834203424483934088L) + D.c(17833, 4902217339477006058L));
                    switch (var10_3 /* !! */ ) {
                        default: {
                            ** GOTO lbl12
                        }
                        case 12897082: 
                    }
                    hi.a("G", (long)711058383680228479L);
                    if (!var2_2) ** break;
                    ** continue;
lbl103:
                    // 2 sources

                    var10_3 /* !! */  = hi.a("G", (int)D.c(3599, 7342452778048642311L), (int)D.c(2525, 8260048299287599806L), (long)834203424483934088L) / D.c(28283, 8644681374277254435L) ^ D.c(4667, 3707521449477685557L);
lbl104:
                    // 2 sources

                    if (var2_2) continue block35;
lbl105:
                    // 2 sources

                    var10_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)D.c(231, 5065413015727035291L), (int)D.c(204, 5298793608592348097L), (long)834203424483934088L), (int)D.c(21344, 8937640037020893203L), (long)834203424483934088L) * D.c(8774, 6697193591162630408L) ^ D.c(15116, 2877949191083124830L);
                    if (var2_2) continue block35;
lbl107:
                    // 2 sources

                    var10_3 /* !! */  = hi.a("G", (int)D.c(11421, 5852300631834525673L), (int)D.c(7317, 223608082872881026L), (long)834203424483934088L) / D.c(1821, 5737166233800496150L) ^ D.c(21797, 586292178706269805L);
                    if (var2_2) continue block35;
lbl109:
                    // 2 sources

                    var10_3 /* !! */  = (int)(hi.a("G", (int)((D.c(7738, 4869954597940514150L) - D.c(25152, 1314692334223274280L)) * D.c(21317, 3038059137820622935L) * D.c(6164, 3247113988074228592L)), (int)D.c(1369, 7359804538639013456L), (long)834203424483934088L) - D.c(12402, 1841938328274166654L));
                    if (var2_2) continue block35;
lbl111:
                    // 2 sources

                    v4 = var10_3 /* !! */  = hi.a("G", (int)D.c(11421, 5852300631834525673L), (int)D.c(7317, 223608082872881026L), (long)834203424483934088L) / D.c(1821, 5737166233800496150L) ^ D.c(21797, 586292178706269805L);
lbl112:
                    // 2 sources

                    if (var2_2) continue block35;
lbl113:
                    // 2 sources

                    var10_3 /* !! */  = D.c(4236, 1530798457085445021L) - D.c(2639, 3164220947680385328L) ^ D.c(12325, 1003958753972478842L);
                    continue block35;
                    case 19425976: 
                }
                break;
            }
            return;
        }
        block36: while (true) {
            switch (var10_3 /* !! */ ) {
                default: {
                    hi.a("\u00a5", (Object)this, (Object)new Object[]{var6_7}, (long)594719109390394697L);
                    v5 = new Object[2];
                    v5[1] = (int)var7_8;
                    v5[0] = var6_7;
                    hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)v5, (long)913259398591958532L);
                    hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)var6_7, (int)var8_9, (float)var5_6, (long)739893072227345033L);
                    if (var2_2) ** GOTO lbl141
                    ** GOTO lbl44
                }
                case -109173601: {
                    ** continue;
                }
                case -109173605: {
                    ** continue;
                }
                case -109173603: {
                    ** continue;
                }
                case -109173602: {
                    ** continue;
                }
                case -109173606: {
                    ** continue;
                }
                case -109173600: {
                    return;
                }
lbl141:
                // 2 sources

                var10_3 /* !! */  = D.c(11287, 4687091941653085960L) + D.c(21896, 8493272365093488369L) - D.c(24047, 6135455806049685155L);
                if (var2_2) continue block36;
lbl143:
                // 2 sources

                var10_3 /* !! */  = D.c(11287, 4687091941653085960L) + D.c(21896, 8493272365093488369L) - D.c(24047, 6135455806049685155L);
                if (var2_2) continue block36;
lbl145:
                // 2 sources

                var10_3 /* !! */  = D.c(11287, 4687091941653085960L) + D.c(21896, 8493272365093488369L) - D.c(24047, 6135455806049685155L);
                if (var2_2) continue block36;
lbl147:
                // 2 sources

                var10_3 /* !! */  = D.c(11287, 4687091941653085960L) + D.c(21896, 8493272365093488369L) - D.c(24047, 6135455806049685155L);
                if (var2_2) continue block36;
lbl149:
                // 2 sources

                var10_3 /* !! */  = D.c(11287, 4687091941653085960L) + D.c(21896, 8493272365093488369L) - D.c(24047, 6135455806049685155L);
                if (var2_2) continue block36;
lbl151:
                // 2 sources

                var10_3 /* !! */  = D.c(11287, 4687091941653085960L) + D.c(21896, 8493272365093488369L) - D.c(24047, 6135455806049685155L);
                continue block36;
                case -109173607: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void B(Object[] var1_1) {
        block10: {
            var2_2 = var1_1[0];
            var3_3 = Dl.S();
            var4_4 /* !! */  = hi.a("G", (int)(D.c(25436, 2774311910676901967L) - D.c(23154, 3657179714775877947L) - D.c(9409, 8152302773613393881L)), (int)D.c(25667, 7525534575064495934L), (long)834203424483934088L) + D.c(17935, 8146023890590111067L) - D.c(23344, 8349538844383545395L);
            if (var3_3) break block10;
lbl6:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)897333804283335909L), (long)789438897355831922L)), (long)1000026253634408124L);
                if (!var3_3) ** GOTO lbl39
                if (v0 /* !! */  == false) ** GOTO lbl38
                ** GOTO lbl40
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                v1 = new Object[2];
                v1[1] = (double)hi.a("\u00a5", (Object)((Double)D.j("opeA4lO0JNrGCPVT", z(), (DM)hi.a("\u00e9", (Object)this, (long)1235270782879099796L))), (long)637262500311742568L);
                v1[0] = (AABB)var2_2;
                hi.a("\u00a5", (Object)hi.a("j", (long)472618207811515361L), (Object)v1, (long)691248361922580975L);
                if (!var3_3) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl42
                break;
            }
        }
        while (true) {
            switch (var4_4 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1044915014: {
                    ** continue;
                }
                case -1044915011: {
                    ** continue;
                }
                case -1044915013: 
            }
            D.j("opeA4lO0JNrGCPVT", g(int ), (int)0);
            D.j("opeA4lO0JNrGCPVT", g());
            var4_4 /* !! */  = (CallSite)((D.c(7794, 934354544204434796L) * D.c(14256, 8268971070351566046L) ^ D.c(21328, 7902707252886405174L)) - D.c(428, 9089923383321776825L) - D.c(2250, 1332042733121887114L));
            if (var3_3) continue;
lbl38:
            // 2 sources

            v0 /* !! */  = var4_4 /* !! */  = (CallSite)((D.c(22108, 6564550912755336470L) + D.c(21213, 1297574677986247084L)) * D.c(17174, 2078785636328050771L) + D.c(15954, 1949652419690098003L));
lbl39:
            // 2 sources

            if (var3_3) continue;
lbl40:
            // 2 sources

            var4_4 /* !! */  = (CallSite)((D.c(32692, 1631071721187617952L) - D.c(4698, 3484113611207557380L)) * D.c(21474, 3988581487663022335L) + D.c(9232, 8022767865033848643L));
            if (var3_3) continue;
lbl42:
            // 2 sources

            var4_4 /* !! */  = (CallSite)((D.c(28052, 8726331419220557550L) + D.c(4405, 3779719988553728628L)) * D.c(4546, 2143872964821402334L) + D.c(8833, 3964012601077723598L));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$1() {
        boolean bl = Dl.t();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)969239672674210396L), (long)511460060498514638L);
        if (bl) return (boolean)object;
        if (object == false) {
            object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)444903241092774113L), (long)511460060498514638L);
            if (bl) return (boolean)object;
            if (object == false) {
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)582893590657786848L), (long)511460060498514638L);
                if (bl) return (boolean)object;
                if (object == false) {
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)1032034325003815305L), (long)511460060498514638L);
                    if (bl) return (boolean)object;
                    if (object == false) {
                        object = false;
                        return (boolean)object;
                    }
                }
            }
        }
        object = true;
        return (boolean)object;
    }

    public static /* bridge */ /* synthetic */ CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Enabled aggressive block sorting
     */
    private boolean lambda$new$0() {
        boolean bl = Dl.t();
        Object object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)969239672674210396L), (long)511460060498514638L);
        if (bl) return (boolean)object;
        if (object == false) {
            object = D.j("opeA4lO0JNrGCPVT", i(E ), (Dx)((Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L)), (Enum)((Object)hi.a("j", (long)444903241092774113L)));
            if (bl) return (boolean)object;
            if (object == false) {
                object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)678157694992657530L), (long)511460060498514638L);
                if (bl) return (boolean)object;
                if (object == false) {
                    object = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)902062271395302475L), (Object)hi.a("j", (long)849572296136731576L), (long)511460060498514638L);
                    if (bl) return (boolean)object;
                    if (object == false) {
                        object = false;
                        return (boolean)object;
                    }
                }
            }
        }
        object = true;
        return (boolean)object;
    }

    private D() {
        super(D.b(-13792, 11844), (vY)((Object)hi.a("j", (long)1050408241407708132L)));
        this.M = hi.a("\u00a5", (Object)this, (Object)D.b(-13787, 32319), (Object)new Color(D.c(10804, 1150778555544402223L), D.c(10804, 1150778555544402223L), D.c(10804, 1150778555544402223L), D.c(10804, 1150778555544402223L)), this::lambda$new$1, (long)1241661680830497550L);
        this.k = hi.a("\u00a5", (Object)this, (Object)D.b(-13786, 25617), (double)2.0, (double)0.0, (double)5.0, (double)0.5, (long)1077996338587307774L);
        this.u = hi.a("\u00a5", (Object)this, (Object)D.b(-13785, 4135), (boolean)true, (long)1230617056439551805L);
        this.F = hi.a("\u00a5", (Object)this, (Object)D.b(-13791, -7992), (double)5.0, (double)0.0, (double)16.0, (double)0.5, this::lambda$new$2, (long)988474938581310011L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[7];
                        var11_1 = 0;
                        var10_2 = "\u0016\u00d85t\u00d8:3~\u009c\u0000\u0004i\u00ca\u00f1\u00f0\u0004\u00d94\u0018[\nh\u00ca\u00fa6!f\nkf\u00b1\r\u0088\u00b42K@8;2\u00efH\u001d#~";
                        var12_3 = "\u0016\u00d85t\u00d8:3~\u009c\u0000\u0004i\u00ca\u00f1\u00f0\u0004\u00d94\u0018[\nh\u00ca\u00fa6!f\nkf\u00b1\r\u0088\u00b42K@8;2\u00efH\u001d#~".length();
                        var9_4 = 10;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 31;
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
                            var10_2 = "0\"\u00e8_\u00de-!A\u00c2\u008f&\u00d7\u00abb#\u0005|\u007fC\u009b\u00d1";
                            var12_3 = "0\"\u00e8_\u00de-!A\u00c2\u008f&\u00d7\u00abb#\u0005|\u007fC\u009b\u00d1".length();
                            var9_4 = 15;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 67;
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
                                    v15 = 6;
                                    break;
                                }
                                case 1: {
                                    v15 = 44;
                                    break;
                                }
                                case 2: {
                                    v15 = 96;
                                    break;
                                }
                                case 3: {
                                    v15 = 55;
                                    break;
                                }
                                case 4: {
                                    v15 = 13;
                                    break;
                                }
                                case 5: {
                                    v15 = 36;
                                    break;
                                }
                                default: {
                                    v15 = 62;
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
                D.a = var13;
                D.b = new String[7];
                var0_7 = 2270563151853459257L;
                var6_8 = new long[91];
                var3_9 = 0;
                var4_10 = "\u00b3B\u00e3Y4K\u00edp\u001cv6V\u0094j*\u0012\u0006\u00c9\u00dd\u00b5\u00f3?\\\u001a\u00f7Yl\u0083\u009a6\f\u00cd.I\u00fd)j\u00dd\u007f5)\u00c3\u0018\u008d\u009e\u00c3\u00e86\u00c5Z\u00ac\u0007\u00ca{\u0099N'T\u00bfQ\u0083\u0002\u00195\u0015\u00bc\u00b7nrmN\u00e5\f\u00dbK\u00c9\u00d4\u00ea {\u0081\u00c6\u00e0\u0005\u00e6\u00cbs|\u008e\u009a\u008c\u00bb\u00d5\u00bd\u00df\u00b8\u00f0vf=\u009c\u00b3\u00d4\u000b\u00f91a(\u00bf\u0093\u00cb\u0000\u00ce\u00caq\u00a0d\u00c9@4\u008bQ\u00c1]\u00d5\u00e7HQ4\u00ae\u00d2%\u00cd\u0010\u00c7\u00d4\u00c8=\u00ff\u00c5A\u00aa\u00c3\u00d84>\u00a6\u001e\u00b9\u0015\u00b2&\u0013\u00dd\u008a\u001aNe\u00bbQS\u00ee>\u0014r\u00b9\u00d2WA];\u0013\u00b0\u001en\u00f2a\u0001\u0098\u00ee\u00c0\u00ec\u00c9\u00ef\u00ba\u00c4\u00c6\u008a \u00de\u00132\u00e3x\u0017<\u00da|w\b\u00b6\u00f7bu\u0081\u00b1[#\u00f9\u00ae-Si\u008a\u00faFG\\n\u00af\u00f5\u00a1\u00de\u0086\u00b3\u00f1\u00909\u00b14\u00d5\u001d^\u001c\u0001an\u0098\u00d9y\u00df\u00cbpK\u0004\u00a8\u00ff\u0005%\u00cd\u00c2\u0001\u00a1\u00aa+<\u00cbq\u00ef\u00be\u0088\u00d1\u00a7\u00f6\u00b2S\u009b\u00ff\u00f2\u00e1-\u001b#\u0013v\u0095t\u0085T\\\u00b4JP\u00c5\f\"\u0080\u00a9\u00c9V\u00ef7\u009b\u00ad\u0001\u00d5!\u009a3C\u00c5\u00b3\u00dd\u0081@\u000f\u00f8\u0006\u0010\u00a5e\t\u00f0\u0091\u00bf\u00fcWCn\u00b2\n\u000fEzh\u00a5\u00b4\u00d0\u00dc\u00a7\u000f\u00db9\u00e9\u00a1d\u00dew\u00b8\u00e6\u008e:\u008b\u00b3\u0002\u00ce\u00dc,\\Y\u0002\b\u00c1\u00fe\u00bb\u00d0M^\u001d\u000f\u00c8\u00f1j4\u0088\u0082\u00a9v\u0010Y\u0013\u00c5\u00dd6\u00ee\u001c\u00ec\u00c4z\u00e4m\u00fa\u009a\u00aacI=M\u00a6\u00d9\r\u0010\u009d\"\u00c8/NT\u00ca\u008fAW\u00c9\u00c5\u0002\u0087\u00f6\u00e2\u000e\u00d0oF\t\u0080/Xw-\u0090\u00fee\u00a1En\u00dd\u00fd.\u00e4\u0015\u00ab\u00c4\u00c7\u0019*\u00a1\n\u00b2\u00c3V\u00a1\u00b8Q\u00d1+\u00a1\u00b6\u00ea\u00c4z\u00c3Iy\u00f4b\u001aX+\u0019\u009c\u00c1\u00c5\u00f6\u00ec=Fr,\u0088\u00c2\u008e}q|@\\E\u0004e\u0083\u0013\u00d1\u00e26\u00ean\u00ee\u00a6\u00ab ~yv\u00c5\u00b4s\u0082\u0081\u00a2\u00fc*\u00a9V2\u001b\u0098\n\u00f6\u0007\u0095\u00de2JD6\u00ea\u00fb\u00f7\u00f5\u00e3$m\u00af\u00fc\u00bd\u00d3\u000f\u00dbk\u001f\u00d8;J\u00d0\rn\u00e9wb\u00c8\\W\u008fk<\u00d9\u00dc\u00bb=\u001b l\u00a9U\u00d9\u00ee\bG\u000e\u0007\u0090i6\u00f49hm\r\u00f2\u0092\u00fa\u00eeF\u009cix\u0097\u0080@\u00a9o\u001dKf\u0010O\u009d/\u00ef\u00a7\u008d\u008b\u00a85\u000ea\u0083\u00d13\u009f\u0007\u00d5\u0092\u00ebd!d\u00b3\u00c7i\u00a8\u00c8\u00b5\u0096\u00d5\u00c3\u0080\u00b6\u00f8\u00fd\u00cfZ\u00ff-\r/\u00cb\u00ba\u00fe<\u009ehM\fw{\u00b3(dd\u00d5\u00c4(\u00c3\u001d\u00c8\u00dc+\u00ca\u0004\u001b\u00bc\u00f90c\u008b\u0098\u0089\u00b1\u00cb\u00e0\u00edZC'\r3\u00c9\u00e0\u00e0$7\u00e5\u009c \u009b\t\u00faF\u00bb\u00a5\u00e97}>\u00a6\u00e3\u000b\u00a9\u00e0Sq\u00d4\u00e97s\u0010\u0085\u0080+3f\u0088\u0004\u0080\u00dd\u00f3\u00be\u007f[\u009f\u00d5r";
                var5_11 = "\u00b3B\u00e3Y4K\u00edp\u001cv6V\u0094j*\u0012\u0006\u00c9\u00dd\u00b5\u00f3?\\\u001a\u00f7Yl\u0083\u009a6\f\u00cd.I\u00fd)j\u00dd\u007f5)\u00c3\u0018\u008d\u009e\u00c3\u00e86\u00c5Z\u00ac\u0007\u00ca{\u0099N'T\u00bfQ\u0083\u0002\u00195\u0015\u00bc\u00b7nrmN\u00e5\f\u00dbK\u00c9\u00d4\u00ea {\u0081\u00c6\u00e0\u0005\u00e6\u00cbs|\u008e\u009a\u008c\u00bb\u00d5\u00bd\u00df\u00b8\u00f0vf=\u009c\u00b3\u00d4\u000b\u00f91a(\u00bf\u0093\u00cb\u0000\u00ce\u00caq\u00a0d\u00c9@4\u008bQ\u00c1]\u00d5\u00e7HQ4\u00ae\u00d2%\u00cd\u0010\u00c7\u00d4\u00c8=\u00ff\u00c5A\u00aa\u00c3\u00d84>\u00a6\u001e\u00b9\u0015\u00b2&\u0013\u00dd\u008a\u001aNe\u00bbQS\u00ee>\u0014r\u00b9\u00d2WA];\u0013\u00b0\u001en\u00f2a\u0001\u0098\u00ee\u00c0\u00ec\u00c9\u00ef\u00ba\u00c4\u00c6\u008a \u00de\u00132\u00e3x\u0017<\u00da|w\b\u00b6\u00f7bu\u0081\u00b1[#\u00f9\u00ae-Si\u008a\u00faFG\\n\u00af\u00f5\u00a1\u00de\u0086\u00b3\u00f1\u00909\u00b14\u00d5\u001d^\u001c\u0001an\u0098\u00d9y\u00df\u00cbpK\u0004\u00a8\u00ff\u0005%\u00cd\u00c2\u0001\u00a1\u00aa+<\u00cbq\u00ef\u00be\u0088\u00d1\u00a7\u00f6\u00b2S\u009b\u00ff\u00f2\u00e1-\u001b#\u0013v\u0095t\u0085T\\\u00b4JP\u00c5\f\"\u0080\u00a9\u00c9V\u00ef7\u009b\u00ad\u0001\u00d5!\u009a3C\u00c5\u00b3\u00dd\u0081@\u000f\u00f8\u0006\u0010\u00a5e\t\u00f0\u0091\u00bf\u00fcWCn\u00b2\n\u000fEzh\u00a5\u00b4\u00d0\u00dc\u00a7\u000f\u00db9\u00e9\u00a1d\u00dew\u00b8\u00e6\u008e:\u008b\u00b3\u0002\u00ce\u00dc,\\Y\u0002\b\u00c1\u00fe\u00bb\u00d0M^\u001d\u000f\u00c8\u00f1j4\u0088\u0082\u00a9v\u0010Y\u0013\u00c5\u00dd6\u00ee\u001c\u00ec\u00c4z\u00e4m\u00fa\u009a\u00aacI=M\u00a6\u00d9\r\u0010\u009d\"\u00c8/NT\u00ca\u008fAW\u00c9\u00c5\u0002\u0087\u00f6\u00e2\u000e\u00d0oF\t\u0080/Xw-\u0090\u00fee\u00a1En\u00dd\u00fd.\u00e4\u0015\u00ab\u00c4\u00c7\u0019*\u00a1\n\u00b2\u00c3V\u00a1\u00b8Q\u00d1+\u00a1\u00b6\u00ea\u00c4z\u00c3Iy\u00f4b\u001aX+\u0019\u009c\u00c1\u00c5\u00f6\u00ec=Fr,\u0088\u00c2\u008e}q|@\\E\u0004e\u0083\u0013\u00d1\u00e26\u00ean\u00ee\u00a6\u00ab ~yv\u00c5\u00b4s\u0082\u0081\u00a2\u00fc*\u00a9V2\u001b\u0098\n\u00f6\u0007\u0095\u00de2JD6\u00ea\u00fb\u00f7\u00f5\u00e3$m\u00af\u00fc\u00bd\u00d3\u000f\u00dbk\u001f\u00d8;J\u00d0\rn\u00e9wb\u00c8\\W\u008fk<\u00d9\u00dc\u00bb=\u001b l\u00a9U\u00d9\u00ee\bG\u000e\u0007\u0090i6\u00f49hm\r\u00f2\u0092\u00fa\u00eeF\u009cix\u0097\u0080@\u00a9o\u001dKf\u0010O\u009d/\u00ef\u00a7\u008d\u008b\u00a85\u000ea\u0083\u00d13\u009f\u0007\u00d5\u0092\u00ebd!d\u00b3\u00c7i\u00a8\u00c8\u00b5\u0096\u00d5\u00c3\u0080\u00b6\u00f8\u00fd\u00cfZ\u00ff-\r/\u00cb\u00ba\u00fe<\u009ehM\fw{\u00b3(dd\u00d5\u00c4(\u00c3\u001d\u00c8\u00dc+\u00ca\u0004\u001b\u00bc\u00f90c\u008b\u0098\u0089\u00b1\u00cb\u00e0\u00edZC'\r3\u00c9\u00e0\u00e0$7\u00e5\u009c \u009b\t\u00faF\u00bb\u00a5\u00e97}>\u00a6\u00e3\u000b\u00a9\u00e0Sq\u00d4\u00e97s\u0010\u0085\u0080+3f\u0088\u0004\u0080\u00dd\u00f3\u00be\u007f[\u009f\u00d5r".length();
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
                    var4_10 = "\u00da\u008e8G\u009cq6\u00cc1\u00acM+\u0083\u00fd\u0011r";
                    var5_11 = "\u00da\u008e8G\u009cq6\u00cc1\u00acM+\u0083\u00fd\u0011r".length();
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
        D.c = var6_8;
        D.d = new Integer[91];
        D.v = new D();
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFCA25) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 143;
                case 1 -> 132;
                case 2 -> 104;
                case 3 -> 178;
                case 4 -> 40;
                case 5 -> 42;
                case 6 -> 43;
                case 7 -> 75;
                case 8 -> 127;
                case 9 -> 215;
                case 10 -> 181;
                case 11 -> 105;
                case 12 -> 86;
                case 13 -> 209;
                case 14 -> 210;
                case 15 -> 252;
                case 16 -> 49;
                case 17 -> 129;
                case 18 -> 108;
                case 19 -> 56;
                case 20 -> 141;
                case 21 -> 66;
                case 22 -> 112;
                case 23 -> 58;
                case 24 -> 68;
                case 25 -> 136;
                case 26 -> 147;
                case 27 -> 98;
                case 28 -> 117;
                case 29 -> 96;
                case 30 -> 100;
                case 31 -> 119;
                case 32 -> 189;
                case 33 -> 123;
                case 34 -> 118;
                case 35 -> 134;
                case 36 -> 94;
                case 37 -> 163;
                case 38 -> 229;
                case 39 -> 188;
                case 40 -> 238;
                case 41 -> 41;
                case 42 -> 221;
                case 43 -> 25;
                case 44 -> 175;
                case 45 -> 182;
                case 46 -> 244;
                case 47 -> 78;
                case 48 -> 228;
                case 49 -> 126;
                case 50 -> 3;
                case 51 -> 57;
                case 52 -> 248;
                case 53 -> 239;
                case 54 -> 236;
                case 55 -> 208;
                case 56 -> 150;
                case 57 -> 186;
                case 58 -> 157;
                case 59 -> 170;
                case 60 -> 151;
                case 61 -> 85;
                case 62 -> 103;
                case 63 -> 29;
                case 64 -> 223;
                case 65 -> 93;
                case 66 -> 53;
                case 67 -> 144;
                case 68 -> 47;
                case 69 -> 161;
                case 70 -> 115;
                case 71 -> 240;
                case 72 -> 6;
                case 73 -> 62;
                case 74 -> 88;
                case 75 -> 7;
                case 76 -> 254;
                case 77 -> 169;
                case 78 -> 38;
                case 79 -> 17;
                case 80 -> 146;
                case 81 -> 22;
                case 82 -> 21;
                case 83 -> 27;
                case 84 -> 242;
                case 85 -> 79;
                case 86 -> 235;
                case 87 -> 122;
                case 88 -> 15;
                case 89 -> 148;
                case 90 -> 198;
                case 91 -> 233;
                case 92 -> 65;
                case 93 -> 145;
                case 94 -> 172;
                case 95 -> 18;
                case 96 -> 166;
                case 97 -> 197;
                case 98 -> 217;
                case 99 -> 216;
                case 100 -> 70;
                case 101 -> 72;
                case 102 -> 159;
                case 103 -> 5;
                case 104 -> 177;
                case 105 -> 231;
                case 106 -> 87;
                case 107 -> 206;
                case 108 -> 2;
                case 109 -> 180;
                case 110 -> 8;
                case 111 -> 130;
                case 112 -> 39;
                case 113 -> 212;
                case 114 -> 30;
                case 115 -> 120;
                case 116 -> 111;
                case 117 -> 13;
                case 118 -> 16;
                case 119 -> 121;
                case 120 -> 156;
                case 121 -> 251;
                case 122 -> 237;
                case 123 -> 195;
                case 124 -> 202;
                case 125 -> 10;
                case 126 -> 95;
                case 127 -> 33;
                case 128 -> 69;
                case 129 -> 116;
                case 130 -> 218;
                case 131 -> 153;
                case 132 -> 255;
                case 133 -> 110;
                case 134 -> 194;
                case 135 -> 173;
                case 136 -> 0;
                case 137 -> 199;
                case 138 -> 185;
                case 139 -> 162;
                case 140 -> 44;
                case 141 -> 19;
                case 142 -> 247;
                case 143 -> 74;
                case 144 -> 211;
                case 145 -> 245;
                case 146 -> 63;
                case 147 -> 34;
                case 148 -> 76;
                case 149 -> 102;
                case 150 -> 220;
                case 151 -> 1;
                case 152 -> 158;
                case 153 -> 67;
                case 154 -> 241;
                case 155 -> 83;
                case 156 -> 84;
                case 157 -> 225;
                case 158 -> 203;
                case 159 -> 179;
                case 160 -> 89;
                case 161 -> 46;
                case 162 -> 37;
                case 163 -> 205;
                case 164 -> 31;
                case 165 -> 190;
                case 166 -> 91;
                case 167 -> 109;
                case 168 -> 64;
                case 169 -> 36;
                case 170 -> 187;
                case 171 -> 207;
                case 172 -> 183;
                case 173 -> 155;
                case 174 -> 142;
                case 175 -> 224;
                case 176 -> 55;
                case 177 -> 133;
                case 178 -> 131;
                case 179 -> 45;
                case 180 -> 230;
                case 181 -> 82;
                case 182 -> 54;
                case 183 -> 227;
                case 184 -> 219;
                case 185 -> 35;
                case 186 -> 9;
                case 187 -> 243;
                case 188 -> 60;
                case 189 -> 125;
                case 190 -> 48;
                case 191 -> 52;
                case 192 -> 165;
                case 193 -> 11;
                case 194 -> 191;
                case 195 -> 176;
                case 196 -> 71;
                case 197 -> 92;
                case 198 -> 250;
                case 199 -> 124;
                case 200 -> 171;
                case 201 -> 23;
                case 202 -> 253;
                case 203 -> 192;
                case 204 -> 152;
                case 205 -> 81;
                case 206 -> 137;
                case 207 -> 200;
                case 208 -> 168;
                case 209 -> 149;
                case 210 -> 234;
                case 211 -> 193;
                case 212 -> 73;
                case 213 -> 99;
                case 214 -> 201;
                case 215 -> 204;
                case 216 -> 24;
                case 217 -> 196;
                case 218 -> 97;
                case 219 -> 106;
                case 220 -> 160;
                case 221 -> 14;
                case 222 -> 26;
                case 223 -> 4;
                case 224 -> 222;
                case 225 -> 51;
                case 226 -> 135;
                case 227 -> 213;
                case 228 -> 28;
                case 229 -> 50;
                case 230 -> 164;
                case 231 -> 59;
                case 232 -> 32;
                case 233 -> 167;
                case 234 -> 113;
                case 235 -> 77;
                case 236 -> 226;
                case 237 -> 101;
                case 238 -> 214;
                case 239 -> 114;
                case 240 -> 138;
                case 241 -> 154;
                case 242 -> 249;
                case 243 -> 140;
                case 244 -> 246;
                case 245 -> 107;
                case 246 -> 174;
                case 247 -> 232;
                case 248 -> 80;
                case 249 -> 20;
                case 250 -> 90;
                case 251 -> 61;
                case 252 -> 128;
                case 253 -> 184;
                case 254 -> 12;
                default -> 139;
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
            D.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5359;
        if (d[n2] == null) {
            D.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
