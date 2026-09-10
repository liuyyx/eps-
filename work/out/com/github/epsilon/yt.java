/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.platform.Window
 *  me.sofurry.iiIllIllli.IlilIlIlil
 *  me.sofurry.iiIllIllli.hidden.Hidden0
 *  net.minecraft.client.DeltaTracker
 *  net.minecraft.client.gui.Font
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.components.IMEPreeditOverlay
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.input.CharacterEvent
 *  net.minecraft.client.input.KeyEvent
 *  net.minecraft.client.input.MouseButtonEvent
 *  net.minecraft.client.input.PreeditEvent
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.Identifier
 *  org.joml.Matrix3x2fStack
 */
package com.github.epsilon;

import com.github.epsilon.DF;
import com.github.epsilon.Dl;
import com.github.epsilon.Ow;
import com.github.epsilon._j;
import com.github.epsilon.dd;
import com.github.epsilon.e;
import com.github.epsilon.eh;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.iu;
import com.github.epsilon.l5;
import com.github.epsilon.lm;
import com.github.epsilon.vr;
import com.github.epsilon.yP;
import com.github.epsilon.zU;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.Window;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import me.sofurry.iiIllIllli.IlilIlIlil;
import me.sofurry.iiIllIllli.hidden.Hidden0;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.IMEPreeditOverlay;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.input.PreeditEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.joml.Matrix3x2fStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class yt
extends Screen {
    private vr E;
    private int H;
    private boolean w;
    private lm c;
    private float S;
    private final DF n;
    private static final float D = 3.0f;
    private int A;
    private iu T;
    private final Ow K;
    private final _j X;
    private static final float a = 13.0f;
    private zU v;
    private dd C;
    private eh V;
    private IMEPreeditOverlay B;
    private int Y;
    private float y;
    private eh G;
    public static final yt L;
    private static final float Z = 95.0f;
    private static final float h = 6.0f;
    private static final String[] b;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    private void Z() {
        Object[] objectArray = new Object[2];
        objectArray[1] = (int)hi.a("\u00e9", (Object)((Object)this), (long)951524135517732280L);
        objectArray[0] = hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)((Object)this), (long)615991602451078021L)}, (long)763132020515120236L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)676734129948172895L), (Object)objectArray, (long)982426259859459404L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseScrolled(double var1_1, double var3_2, double var5_3, double var7_4) {
        block12: {
            var9_5 = Dl.t();
            var14_6 /* !! */  = (yt.a(27529, 6606003086668776329L) / 5 + yt.a(30469, 4500933835571485815L) ^ yt.a(19904, 8265344951637075772L)) + yt.a(19070, 7031904034507809209L) ^ yt.a(8571, 7207226702581172602L);
            if (!var9_5) break block12;
lbl4:
            // 2 sources

            while (true) {
                var10_7 = yt.W("qOSlWGrPYqi1kjt7", M(double ), (double)var1_1);
                var12_8 = yt.W("qOSlWGrPYqi1kjt7", z(double ), (double)var3_2);
                if (var9_5) ** GOTO lbl38
                if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) ** GOTO lbl37
                ** GOTO lbl39
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (double)var10_7, (double)var12_8, (double)var7_4, (long)942989199724952777L);
                if (var9_5) ** GOTO lbl42
                if (v0 /* !! */  == false) ** GOTO lbl41
                if (true) ** GOTO lbl44
                break;
            }
        }
        while (true) {
            switch (var14_6 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -319050146: 
            }
            hi.a("G", (long)594486037717116399L);
            var14_6 /* !! */  = ((yt.a(12385, 7389124375375944212L) ^ yt.a(3055, 8429559085617521421L)) * yt.a(14935, 2373896753136275781L) + yt.a(3047, 7724908366785192827L)) * yt.a(21453, 7464393144423414040L) + yt.a(26896, 8251163397638079154L);
        }
        block11: while (true) {
            switch (var14_6 /* !! */ ) {
                default: {
                    ** GOTO lbl10
                }
                case -2023140583: {
                    hi.a("G", (long)1208540510591910900L);
                    yt.W("qOSlWGrPYqi1kjt7", values());
                    if (var9_5) ** break;
                    ** continue;
lbl37:
                    // 2 sources

                    var14_6 /* !! */  = hi.a("G", (int)yt.a(54, 7547596480762949573L), (int)yt.a(16658, 1539520939990477512L), (long)834203424483934088L) / 4 - yt.a(15432, 2283714002681403346L) + yt.a(22122, 7986429467568995923L) ^ yt.a(22332, 7222799787241832192L);
lbl38:
                    // 2 sources

                    if (!var9_5) continue block11;
lbl39:
                    // 2 sources

                    var14_6 /* !! */  = yt.a(14983, 282391570955768236L) - yt.a(32231, 3510285583373227610L) ^ yt.a(31471, 2530015983887241579L) ^ yt.a(20061, 1759147239132455411L);
                    if (!var9_5) continue block11;
lbl41:
                    // 2 sources

                    v0 /* !! */  = (CallSite)(hi.a("G", (int)yt.a(22876, 5974643500212547911L), (int)yt.a(19492, 4477182586418194325L), (long)834203424483934088L) / 4 - yt.a(4909, 6412951305488677851L) + yt.a(27566, 8889133973746303310L) ^ yt.a(17476, 3934593590629854969L));
lbl42:
                    // 2 sources

                    var14_6 /* !! */  = (int)v0 /* !! */ ;
                    if (!var9_5) continue block11;
lbl44:
                    // 2 sources

                    var14_6 /* !! */  = yt.a(3252, 3299653573173781804L) / 3 + yt.a(11893, 8679769143663068427L) ^ yt.a(22859, 7662555996020273825L);
                    continue block11;
                }
                case -2023140582: {
                    return true;
                }
                case -2023140581: 
            }
            break;
        }
        return super.mouseScrolled((double)var10_7, (double)var12_8, var5_3, var7_4);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void D(Object[] var1_1) {
        block28: {
            block25: {
                block24: {
                    var2_2 = Dl.S();
                    var6_3 /* !! */  = yt.a(16375, 9196003346049210030L) - yt.a(2182, 1686568485197881360L) + yt.a(1994, 184016642619518617L);
                    if (var2_2) break block24;
lbl5:
                    // 2 sources

                    while (true) {
                        block27: {
                            block26: {
                                v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)611041330006314377L);
                                if (!var2_2) break block26;
                                if (v0 /* !! */  != false) break block27;
                                v0 /* !! */  = (CallSite)((yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(11896, 3248875459136521987L) + yt.a(10818, 6383968538665582798L)), (int)yt.a(30596, 1956658098131787006L)), (int)yt.a(16505, 8424467471752128947L)) ^ yt.a(26875, 163578004659453979L)) - yt.a(13513, 7806417553244789828L));
                            }
                            var6_3 /* !! */  = (int)v0 /* !! */ ;
                            if (var2_2) break block24;
                        }
                        var6_3 /* !! */  = yt.a(29324, 3388687461512108060L) - yt.a(23584, 1607268005672514991L) + yt.a(16256, 7121319188579194534L);
                        if (var2_2) break block24;
                        ** GOTO lbl48
                        break;
                    }
lbl17:
                    // 2 sources

                    while (true) {
                        v1 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", hasNext(), (Iterator)var4_5);
                        if (!var2_2) ** GOTO lbl59
                        if (v1 /* !! */  == false) ** GOTO lbl58
                        ** GOTO lbl61
                        break;
                    }
lbl22:
                    // 2 sources

                    while (!var2_2) {
                        ** GOTO lbl91
                    }
                    break block28;
                }
                block19: while (true) {
                    switch (var6_3 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -110563007: {
                            if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)579320878743283099L), (long)907159218940561824L), (long)1017954173869996748L) != this) ** GOTO lbl48
                            ** GOTO lbl50
                        }
                        case -110563008: {
                            if (hi.a("\u00e9", (Object)this, (long)757894035959722330L) != null) ** GOTO lbl52
                            ** GOTO lbl54
                        }
                        case -110563009: {
                            var3_4 = hi.a("G", (long)1184702471901219908L);
                            yt.W("qOSlWGrPYqi1kjt7", z(com.github.epsilon.dd ), (dd)hi.a("\u00e9", (Object)this, (long)757894035959722330L));
                            var4_5 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)728001790887212699L), (Object)new Object[0], (long)921838225654585516L), (long)1240653736693366367L);
                            if (var2_2) ** GOTO lbl56
                            ** GOTO lbl17
                        }
                        case -110563010: {
                            hi.a("G", (long)1033419646183286307L);
                            var6_3 /* !! */  = yt.a(29999, 2312369810054275037L) ^ yt.a(17506, 1087512838338767908L) ^ yt.a(21607, 6004228793080413258L) ^ yt.a(4450, 1752394609052400379L);
                            continue block19;
                        }
lbl48:
                        // 2 sources

                        var6_3 /* !! */  = (yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)hi.a("G", (int)(yt.a(28088, 5201710422078113098L) + yt.a(24113, 2868375735621285689L)), (int)yt.a(31093, 3226883726820757744L), (long)834203424483934088L), (int)yt.a(3562, 7509211396089456414L)) ^ yt.a(13507, 6820127600730382000L)) - yt.a(31418, 1494316396354097198L);
                        if (var2_2) continue block19;
lbl50:
                        // 2 sources

                        var6_3 /* !! */  = (yt.a(7935, 8049390664165537602L) / yt.a(27173, 1576664469249147698L) ^ yt.a(25175, 896165973690797481L)) + yt.a(24144, 9104292234734663584L);
                        if (var2_2) continue block19;
lbl52:
                        // 2 sources

                        var6_3 /* !! */  = (yt.a(28507, 5938783822960445095L) / yt.a(13357, 4003432969004261202L) / yt.a(31232, 1824473493713408704L) ^ yt.a(24316, 2874889044173190199L)) * yt.a(15353, 7493550611301897391L) - yt.a(8582, 3465681087104650091L);
                        if (var2_2) continue block19;
lbl54:
                        // 2 sources

                        var6_3 /* !! */  = (hi.a("G", (int)hi.a("G", (int)(yt.a(28088, 5201710422078113098L) + yt.a(24113, 2868375735621285689L)), (int)yt.a(31093, 3226883726820757744L), (long)834203424483934088L), (int)yt.a(3562, 7509211396089456414L), (long)834203424483934088L) ^ yt.a(13507, 6820127600730382000L)) - yt.a(31418, 1494316396354097198L);
                        continue block19;
lbl56:
                        // 1 sources

                        var6_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(yt.a(11885, 1515897272134960917L) * yt.a(16194, 7651857462384564122L) ^ yt.a(14484, 6519884543739105283L)), (int)yt.a(30420, 2139210986489929280L), (long)834203424483934088L), (int)yt.a(15020, 7963000991791223005L), (long)834203424483934088L) + yt.a(2652, 8502007144300847277L));
                        if (var2_2) break block25;
lbl58:
                        // 2 sources

                        v1 /* !! */  = (CallSite)(hi.a("G", (int)(yt.a(20167, 5591923381782701155L) * yt.a(12655, 6548708673673402378L) * yt.a(19395, 9126616209601421635L)), (int)yt.a(28309, 1961945522606425841L), (long)834203424483934088L) ^ yt.a(12124, 2638646950824378618L));
lbl59:
                        // 2 sources

                        var6_3 /* !! */  = (int)v1 /* !! */ ;
                        if (var2_2) break block25;
lbl61:
                        // 2 sources

                        var6_3 /* !! */  = yt.a(32321, 2183169417239909575L) / yt.a(31232, 1824473493713408704L) + yt.a(2388, 780353151768830379L) + yt.a(10359, 1077171981815185543L);
                        break block25;
                        case -110563011: 
                    }
                    break;
                }
                return;
            }
lbl66:
            // 2 sources

            while (true) {
                block32: {
                    block31: {
                        block30: {
                            block29: {
                                switch (var6_3 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case 1817160976: {
                                        var5_6 = (eh)hi.a("\u00a5", (Object)var4_5, (long)470012372636416268L);
                                        v2 /* !! */  = hi.a("\u00a5", (Object)var5_6, (long)1099153674733698693L);
                                        if (!var2_2) break block29;
                                        if (v2 /* !! */  == false) break;
                                        break block30;
                                    }
                                    case 1817160975: {
                                        break block31;
                                    }
                                    case 1817160977: {
                                        hi.a("G", (long)636853863237534702L);
                                        hi.a("G", (long)594486037717116399L);
                                        return;
                                    }
                                }
                                v2 /* !! */  = (CallSite)(yt.a(13892, 6412966344817318915L) / yt.a(4051, 5811331067696588479L) - yt.a(5632, 3319045434002784242L));
                            }
                            var6_3 /* !! */  = (int)v2 /* !! */ ;
                            if (var2_2) break block32;
                        }
                        var6_3 /* !! */  = hi.a("G", (int)yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)hi.a("G", (int)(yt.a(15558, 5449228691771234215L) ^ yt.a(4123, 7221622558743051206L)), (int)yt.a(25582, 8371396541031828528L), (long)834203424483934088L), (int)yt.a(15184, 8213280892417806659L)), (int)yt.a(19487, 7398694443962885977L), (long)834203424483934088L) ^ yt.a(8404, 8361839735345023200L);
                        if (var2_2) break block32;
                        ** GOTO lbl114
                    }
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)477459963365500240L), (long)1133897508038181906L);
                    hi.a("\u00f2", (Object)this, (boolean)false, (long)611041330006314377L);
                    yt.W("qOSlWGrPYqi1kjt7", z(com.github.epsilon.dd ), (dd)var3_4);
                    return;
                }
                do {
                    switch (var6_3 /* !! */ ) {
                        default: {
                            v3 = new Object[2];
                            v3[1] = yt.a(27976, 5146759837551839166L);
                            v3[0] = hi.a("j", (long)882827338724254838L);
                            yt.W("qOSlWGrPYqi1kjt7", M(net.minecraft.client.DeltaTracker com.github.epsilon.lm ), (eh)var5_6, (DeltaTracker)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)579320878743283099L), (long)915271048386335996L), (lm)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)477459963365500240L), (Object)v3, (long)552889054143910312L));
                            if (var2_2) break;
                            ** GOTO lbl22
                        }
                        case 309077811: {
                            ** GOTO lbl22
                        }
                        case 309077810: {
                            hi.a("G", (long)705339817202267199L);
                            hi.a("G", (double)1.0, (double)-4.0, (long)449984074118786580L);
                            return;
                        }
                    }
lbl114:
                    // 2 sources

                    var6_3 /* !! */  = yt.a(17903, 5130928950193155857L) / yt.a(4051, 5811331067696588479L) - yt.a(28887, 35356709465644005L);
                } while (var2_2);
                break;
            }
        }
        var6_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(yt.a(6253, 3531402243569758758L) * yt.a(28529, 1417803117128433862L) ^ yt.a(19317, 4423049994188382742L)), (int)yt.a(18489, 3404765169790280372L), (long)834203424483934088L), (int)yt.a(11029, 365923785699689235L), (long)834203424483934088L) + yt.a(25975, 3963895625827307024L));
        ** while (true)
    }

    private void lambda$drawPanel$1(int n, int n2, zU zU2) {
        Object[] objectArray = new Object[4];
        objectArray[3] = n2;
        objectArray[2] = n;
        objectArray[1] = hi.a("\u00e9", (Object)((Object)this), (long)1011787142149536499L);
        objectArray[0] = zU2;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)606438669286401880L), (Object)objectArray, (long)870349993101032010L);
    }

    public void removed() {
        super.removed();
        hi.a("\u00f2", (Object)((Object)this), (boolean)false, (long)611041330006314377L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)477459963365500240L), (Object)new Object[0], (long)1294970901470652421L);
        hi.a("\u00f2", (Object)((Object)this), null, (long)1302971948309712589L);
        hi.a("\u00f2", (Object)((Object)this), (vr)((Object)hi.a("G", (long)1098023335145461947L)), (long)953386256987960056L);
        yt.W("qOSlWGrPYqi1kjt7", m());
        hi.a("\u00f2", (Object)((Object)this), null, (long)947006031877009741L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void w(Object[] var1_1) {
        block28: {
            block31: {
                block30: {
                    block29: {
                        var2_2 = Dl.t();
                        var6_3 /* !! */  = hi.a("G", (int)yt.a(10505, 8911817872208756905L), (int)yt.a(20951, 1197247364902320509L), (long)834203424483934088L) * yt.a(26337, 5013079764024151631L) - yt.a(25020, 7757824780038000215L);
                        if (var2_2) ** GOTO lbl-1000
                        v0 = var6_3 /* !! */ ;
                        if (var2_2) ** GOTO lbl10
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                v0 = var3_4 = yt.W("qOSlWGrPYqi1kjt7", size(), (List)hi.a("\u00a5", (Object)hi.a("j", (long)728001790887212699L), (Object)new Object[0], (long)921838225654585516L));
lbl10:
                                // 2 sources

                                if (var2_2) break block29;
                                if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) break;
                                break block30;
                            }
                            case 1963031382: {
                                hi.a("G", (float)2.0f, (long)391647354171730378L);
                                hi.a("G", (float)-13.0f, (long)690989554677196856L);
                                return;
                            }
                        }
                        var6_3 /* !! */  = (reference)(((yt.a(11711, 8454195696846669352L) ^ yt.a(30676, 1575147663261816989L)) * yt.a(9565, 3330719970958446110L) + yt.a(31235, 6695357194488926813L)) * yt.a(856, 2362641658663938824L) - yt.a(4754, 4180113871035742761L));
                    }
                    if (!var2_2) break block31;
                }
                var6_3 /* !! */  = (reference)((hi.a("G", (int)yt.a(11302, 4993555540622051121L), (int)yt.a(18197, 8466469149243731699L), (long)834203424483934088L) ^ yt.a(13676, 504980121523986274L)) + yt.a(25714, 42534007282126529L));
                if (!var2_2) break block31;
                ** GOTO lbl89
lbl26:
                // 2 sources

                while (true) {
                    block35: {
                        block34: {
                            block33: {
                                block32: {
                                    var4_5 /* !! */  = v1 /* !! */ ;
                                    if (var2_2) break block32;
                                    if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) break block33;
                                    var6_3 /* !! */  = hi.a("G", (int)(yt.a(16497, 6391277399649282531L) * yt.a(19791, 4647933057010426920L) - yt.a(21914, 901786396394127141L)), (int)yt.a(26778, 2046122851410167555L), (long)834203424483934088L) - yt.a(21342, 3901153264944315266L);
                                }
                                if (!var2_2) break block34;
                            }
                            var6_3 /* !! */  = (reference)((yt.a(27816, 5314324112474588285L) * yt.a(12544, 2944441571841810012L) ^ yt.a(29522, 6519779891487136583L)) + yt.a(6007, 7319455873226161280L) + yt.a(10941, 8535891456048137702L));
                        }
                        switch (var6_3 /* !! */ ) {
                            default: {
                                v2 /* !! */  = 20.0f;
                                var6_3 /* !! */  = (reference)(yt.a(20948, 3009738168573787713L) - yt.a(19684, 5535999998238548862L) + yt.a(32120, 3706910283804726583L) + yt.a(350, 1141079210683477635L) - yt.a(19335, 4828426106456532022L) ^ yt.a(5903, 3506243837695606617L));
                                if (var2_2) {
                                    break;
                                }
                                break block35;
                            }
                            case 916981721: {
                                v2 /* !! */  = (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)1183567479019984898L);
                                if (!var2_2) break;
                                ** GOTO lbl-1000
                            }
                            case 916981723: {
                                hi.a("G", (long)838624670787528729L);
                                return;
                            }
                        }
                        var6_3 /* !! */  = (reference)(yt.a(8705, 3713824084292668042L) - yt.a(3810, 8586575549434766420L) + yt.a(22688, 1726679233414132674L) + yt.a(16503, 4286465071455005037L) - yt.a(16339, 5147416278668842555L) ^ yt.a(29321, 7621573856915118944L));
                    }
                    switch (var6_3 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var5_6 /* !! */  = v2 /* !! */ ;
                            hi.a("\u00f2", (Object)this, (iu)new iu(yt.a(-26606, 4320), yt.a(-26602, -31271), "\ue1bd", 0, (List<? extends e>)hi.a("\u00a5", (Object)hi.a("j", (long)728001790887212699L), (Object)new Object[0], (long)921838225654585516L)), (long)606438669286401880L);
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)new Object[]{true}, (long)636467708964734443L);
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)new Object[]{true}, (long)882705255860052915L);
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (float)var4_5 /* !! */ , (float)var5_6 /* !! */ , (long)1056483459672017518L);
                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)new Object[]{Float.valueOf((float)hi.a("\u00a5", (Object)this, (long)1295034926075292245L))}, (long)1280299986488197532L);
                            hi.a("\u00f2", (Object)this, (int)var3_4, (long)674648282472168837L);
                            return;
                        }
                        case 1814875376: 
                    }
                    return;
                }
            }
            block21: while (true) {
                switch (var6_3 /* !! */ ) {
                    default: {
                        v3 /* !! */  = hi.a("\u00e9", (Object)this, (long)674648282472168837L);
                        v4 /* !! */  = var3_4;
                        if (var2_2) ** GOTO lbl91
                        if (v3 /* !! */  != v4 /* !! */ ) ** GOTO lbl89
                        ** GOTO lbl93
                    }
                    case -1790506624: {
                        if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) != null) ** GOTO lbl95
                        ** GOTO lbl97
                    }
                    case -1790506622: {
                        v1 /* !! */  = 20.0f;
                        var6_3 /* !! */  = (reference)(yt.a(22297, 7091838817179106329L) * yt.a(9675, 2708523349082181610L) * yt.a(23822, 2357060861931058842L) + yt.a(21488, 2269191142707690237L) + yt.a(30175, 5972996764517785022L) ^ yt.a(19183, 7564817195764114109L));
                        if (!var2_2) break block28;
                        ** GOTO lbl99
                    }
                    case -1790506626: {
                        v1 /* !! */  = (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)975517958870901414L);
                        if (!var2_2) ** GOTO lbl99
                        ** GOTO lbl26
                    }
                    case -1790506623: {
                        throw null;
                    }
lbl89:
                    // 2 sources

                    v3 /* !! */  = (CallSite)(((yt.a(16958, 3435875661788868031L) ^ yt.a(8510, 4036427778971175431L)) * yt.a(2944, 2121947942733161306L) + yt.a(260, 6021353210608495303L)) * yt.a(12903, 402644678941120613L));
                    v4 /* !! */  = (reference)yt.a(3384, 6998007240915232231L);
lbl91:
                    // 2 sources

                    var6_3 /* !! */  = v3 /* !! */  - v4 /* !! */ ;
                    if (!var2_2) continue block21;
lbl93:
                    // 2 sources

                    var6_3 /* !! */  = (reference)((yt.a(19218, 4708710676229743361L) * yt.a(18886, 9154376486315156197L) / 5 ^ yt.a(22293, 8011825727485869059L)) - yt.a(9641, 6815078673725459661L));
                    if (!var2_2) continue block21;
lbl95:
                    // 2 sources

                    var6_3 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(14173, 7066921727280749658L) + yt.a(31282, 1769187294373565938L)), (int)yt.a(15408, 7506788263386912714L)) - yt.a(4037, 5967659566538041150L);
                    if (!var2_2) continue block21;
lbl97:
                    // 2 sources

                    var6_3 /* !! */  = hi.a("G", (int)yt.a(6857, 5737641315873502150L), (int)yt.a(11355, 2950570152737015360L), (long)834203424483934088L) - yt.a(16979, 2836232347141335182L);
                    continue block21;
lbl99:
                    // 2 sources

                    var6_3 /* !! */  = (reference)(yt.a(6200, 3310067369247061916L) * yt.a(28675, 8092782946916915970L) * yt.a(10849, 3006882669154435488L) + yt.a(13979, 7221878586343923471L) + yt.a(18827, 4486159098116137508L) ^ yt.a(22791, 4581763387012149547L));
                    break block28;
                    case -1790506625: 
                }
                break;
            }
            return;
        }
        while (true) {
            switch (var6_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 202303244: 
            }
            yt.W("qOSlWGrPYqi1kjt7", B());
            var6_3 /* !! */  = (reference)(hi.a("G", (int)(yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)yt.a(17640, 2602925301527473258L), (int)yt.a(32096, 5693107103472605160L)) + yt.a(351, 7133647451123526182L) ^ yt.a(7223, 7687794903919081106L)), (int)yt.a(23184, 3595336908047642969L), (long)834203424483934088L) ^ yt.a(16480, 8532190235916036640L));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean keyPressed(KeyEvent var1_1) {
        block43: {
            block41: {
                block42: {
                    block40: {
                        block46: {
                            block39: {
                                block37: {
                                    block38: {
                                        block36: {
                                            block34: {
                                                block35: {
                                                    block33: {
                                                        block31: {
                                                            block32: {
                                                                block30: {
                                                                    block28: {
                                                                        block29: {
                                                                            block27: {
                                                                                block45: {
                                                                                    block44: {
                                                                                        var2_2 = Dl.t();
                                                                                        var3_3 /* !! */  = (yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(6280, 1778247329689841817L) / yt.a(30910, 4575174221423301359L) + yt.a(30773, 4115649491406803441L)), (int)yt.a(22958, 3722532725332373569L)) ^ yt.a(31282, 5068791114441675338L)) - yt.a(11483, 8436366560123290409L);
                                                                                        if (!var2_2) break block44;
lbl4:
                                                                                        // 2 sources

                                                                                        while (hi.a("\u00e9", (Object)this, (long)606438669286401880L) != null) {
                                                                                            break block27;
                                                                                        }
                                                                                        break block45;
lbl7:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)398309882655218983L);
                                                                                            if (var2_2) break block28;
                                                                                            if (v0 /* !! */  == false) break block29;
                                                                                            break block30;
                                                                                            break;
                                                                                        }
lbl12:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v1 = new Object[3];
                                                                                            v1[2] = (int)hi.a("\u00a5", (Object)var1_1, (long)467516039285710079L);
                                                                                            v1[1] = (int)yt.W("qOSlWGrPYqi1kjt7", scancode(), (KeyEvent)var1_1);
                                                                                            v1[0] = (int)hi.a("\u00a5", (Object)var1_1, (long)1074920233927690084L);
                                                                                            v2 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)v1, (long)1090378464120062996L);
                                                                                            if (var2_2) break block31;
                                                                                            if (v2 /* !! */  == false) break block32;
                                                                                            break block33;
                                                                                            break;
                                                                                        }
lbl21:
                                                                                        // 1 sources

                                                                                        return true;
lbl23:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v3 /* !! */  = hi.a("\u00a5", (Object)var1_1, (long)1165402552935856797L);
                                                                                            if (var2_2) break block34;
                                                                                            if (v3 /* !! */  == false) break block35;
                                                                                            break block36;
                                                                                            break;
                                                                                        }
lbl28:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            hi.a("\u00a5", (Object)this, (long)931475399594256317L);
                                                                                            return true;
                                                                                        }
lbl31:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v4 = hi.a("\u00a5", (Object)this, (Object)new Object[]{var1_1}, (long)641587332598759672L);
                                                                                            if (var2_2) break block37;
                                                                                            if (v4 == false) break block38;
                                                                                            break block39;
                                                                                            break;
                                                                                        }
lbl36:
                                                                                        // 1 sources

                                                                                        return true;
lbl38:
                                                                                        // 1 sources

                                                                                        while (hi.a("\u00e9", (Object)this, (long)606438669286401880L) != null) {
                                                                                            break block40;
                                                                                        }
                                                                                        break block46;
lbl41:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v5 = new Object[3];
                                                                                            v5[2] = (int)hi.a("\u00a5", (Object)var1_1, (long)467516039285710079L);
                                                                                            v5[1] = (int)hi.a("\u00a5", (Object)var1_1, (long)1312356386924423981L);
                                                                                            v5[0] = (int)hi.a("\u00a5", (Object)var1_1, (long)1074920233927690084L);
                                                                                            v6 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)v5, (long)1090378464120062996L);
                                                                                            if (var2_2) break block41;
                                                                                            if (v6 /* !! */  == false) break block42;
                                                                                            break block43;
                                                                                            break;
                                                                                        }
lbl50:
                                                                                        // 1 sources

                                                                                        return true;
lbl52:
                                                                                        // 1 sources

                                                                                        return super.keyPressed(var1_1);
                                                                                    }
lbl55:
                                                                                    // 15 sources

                                                                                    while (true) {
                                                                                        switch (var3_3 /* !! */ ) {
                                                                                            default: {
                                                                                                ** GOTO lbl4
                                                                                            }
                                                                                            case -577043263: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043269: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043262: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043266: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043261: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043260: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043265: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043268: {
                                                                                                ** GOTO lbl38
                                                                                            }
                                                                                            case -577043259: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043270: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043264: {
                                                                                                ** continue;
                                                                                            }
                                                                                            case -577043267: 
                                                                                        }
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                var3_3 /* !! */  = (yt.a(24659, 4564103383628040278L) ^ yt.a(12651, 6387357624415066970L) ^ yt.a(22215, 5337511456878099522L)) + yt.a(11927, 8370279894358984511L) ^ yt.a(8452, 8766694002391615930L);
                                                                                if (!var2_2) ** GOTO lbl55
                                                                            }
                                                                            var3_3 /* !! */  = hi.a("G", (int)(yt.a(11846, 468641028185458666L) * yt.a(4344, 714506490771487304L)), (int)yt.a(23028, 5396528794168850091L), (long)834203424483934088L) ^ yt.a(15541, 2433961272852813216L);
                                                                            if (!var2_2) ** GOTO lbl55
                                                                        }
                                                                        v0 /* !! */  = (CallSite)((yt.a(8735, 3878235667678497688L) ^ yt.a(27852, 6443816639340398476L) ^ yt.a(21725, 4147401083911339349L)) + yt.a(11818, 3224792605105260430L) ^ yt.a(4872, 4840013041333582260L));
                                                                    }
                                                                    var3_3 /* !! */  = (int)v0 /* !! */ ;
                                                                    if (!var2_2) ** GOTO lbl55
                                                                }
                                                                var3_3 /* !! */  = yt.a(14014, 8331283613214842671L) * yt.a(25276, 4774453887901060408L) ^ yt.a(21719, 8050406569944711129L);
                                                                if (!var2_2) ** GOTO lbl55
                                                            }
                                                            v2 /* !! */  = (CallSite)((yt.a(8735, 3878235667678497688L) ^ yt.a(27852, 6443816639340398476L) ^ yt.a(21725, 4147401083911339349L)) + yt.a(11818, 3224792605105260430L) ^ yt.a(4872, 4840013041333582260L));
                                                        }
                                                        var3_3 /* !! */  = (int)v2 /* !! */ ;
                                                        if (!var2_2) ** GOTO lbl55
                                                    }
                                                    var3_3 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)yt.a(3130, 1774695245742384063L), (int)yt.a(23715, 6665019046063993958L)) ^ yt.a(13831, 4484721426741599239L) ^ yt.a(22826, 3101035586877255686L);
                                                    if (!var2_2) ** GOTO lbl55
                                                }
                                                v3 /* !! */  = (CallSite)((yt.a(1318, 3114748180088564407L) * yt.a(20447, 8079708114146517150L) + yt.a(28860, 3297293432611657813L)) * yt.a(2248, 8110900999609132823L) ^ yt.a(16633, 2440443918153411475L) ^ yt.a(662, 2117249558388452013L));
                                            }
                                            var3_3 /* !! */  = (int)v3 /* !! */ ;
                                            if (!var2_2) ** GOTO lbl55
                                        }
                                        var3_3 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)yt.a(8143, 7439386034407519523L), (int)yt.a(6056, 7625302481817189852L)) ^ yt.a(31199, 2064677952538858004L);
                                        if (!var2_2) ** GOTO lbl55
                                    }
                                    v4 = hi.a("G", (int)(yt.a(18465, 4511225778403467480L) / yt.a(6850, 2885134092015940205L)), (int)yt.a(20950, 4468891582927993469L), (long)834203424483934088L) + yt.a(1861, 3818316952968572088L);
                                }
                                var3_3 /* !! */  = (int)v4;
                                if (!var2_2) ** GOTO lbl55
                            }
                            var3_3 /* !! */  = (hi.a("G", (int)yt.a(3393, 9156135895738328817L), (int)yt.a(18310, 2574523531193018443L), (long)834203424483934088L) / 5 ^ yt.a(26731, 5748742431154684541L)) - yt.a(7837, 8104303204983420362L);
                            if (!var2_2) ** GOTO lbl55
                        }
                        var3_3 /* !! */  = yt.a(26963, 1892925761564754156L) * yt.a(28504, 1911276241982965076L) + yt.a(11652, 7576630316208194936L) + yt.a(28104, 5370735341361907324L);
                        if (!var2_2) ** GOTO lbl55
                    }
                    var3_3 /* !! */  = (yt.a(2319, 8237182885233139987L) * yt.a(29687, 8969714312594381109L) ^ yt.a(13338, 6993828439867858693L)) + yt.a(9946, 2643900889872437122L);
                    if (!var2_2) ** GOTO lbl55
                }
                v6 /* !! */  = (CallSite)(yt.a(1656, 7789840121119092103L) * yt.a(10623, 3913775483168555240L) + yt.a(13394, 1765317831831199079L) + yt.a(687, 6893218136531118230L));
            }
            var3_3 /* !! */  = (int)v6 /* !! */ ;
            if (!var2_2) ** GOTO lbl55
        }
        var3_3 /* !! */  = yt.a(4140, 8488494839561206743L) * yt.a(21688, 8532737779974897311L) ^ yt.a(18328, 7491030301515541678L) ^ yt.a(29636, 4841017686612269214L) ^ yt.a(11333, 3227053953916962011L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void H(Object[] var1_1) {
        block22: {
            block21: {
                block23: {
                    var2_2 = var1_1[0];
                    var3_3 = Dl.S();
                    var7_4 /* !! */  = (hi.a("G", (int)yt.a(29603, 5115185085577779642L), (int)yt.a(14600, 5837767671024292138L), (long)834203424483934088L) * yt.a(10753, 7340629944896062270L) ^ yt.a(7330, 2688435900227696088L)) - yt.a(11408, 9195147877299488298L);
                    if (var3_3) break block23;
lbl6:
                    // 2 sources

                    while (true) {
                        block24: {
                            var4_5 = (float)(hi.a("G", (long)1186314902226853278L) / (double)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)579320878743283099L), (long)501728103734382890L), (long)735459544375077882L));
                            yt.W("qOSlWGrPYqi1kjt7", pushMatrix(), (Matrix3x2fStack)hi.a("\u00a5", (Object)((GuiGraphicsExtractor)var2_2), (long)1227623791103851245L));
                            hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)((GuiGraphicsExtractor)var2_2), (long)1227623791103851245L), (float)var4_5, (float)var4_5, (long)1039894135575066481L);
                            var5_6 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)728001790887212699L), (Object)new Object[0], (long)921838225654585516L), (long)1240653736693366367L);
                            if (!var3_3) break block24;
                            var7_4 /* !! */  = (int)(yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(26955, 1805505218649899038L) / yt.a(16785, 1606185229615294964L) / yt.a(31232, 1824473493713408704L)), (int)yt.a(25937, 59280149299547202L)) - yt.a(20654, 8286956974178959177L));
                            if (var3_3) break block21;
                            ** GOTO lbl22
                        }
lbl18:
                        // 2 sources

                        while (true) {
                            block26: {
                                block25: {
                                    v0 = hi.a("\u00a5", (Object)var5_6, (long)984088978567310565L);
                                    if (!var3_3) break block25;
                                    if (v0 != false) break block26;
lbl22:
                                    // 2 sources

                                    v0 = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(hi.a("G", (int)yt.a(19309, 1780387231550137008L), (int)yt.a(19026, 7493941300896522254L), (long)834203424483934088L) / 4 ^ yt.a(5265, 5385469079827299286L)), (int)yt.a(6110, 8845030459743944054L)) - yt.a(575, 5766559586533812621L);
                                }
                                var7_4 /* !! */  = (int)v0;
                                if (var3_3) break block21;
                            }
                            var7_4 /* !! */  = (yt.a(6042, 3491499632151903250L) + yt.a(16846, 4779531291524720886L) ^ yt.a(11661, 668845919044503137L)) - yt.a(4053, 7641834358799148064L);
                            break block21;
                            break;
                        }
                        break;
                    }
lbl29:
                    // 2 sources

                    while (true) {
                        v1 = new Object[2];
                        v1[1] = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)579320878743283099L), (long)915271048386335996L);
                        v1[0] = (GuiGraphicsExtractor)var2_2;
                        hi.a("\u00a5", (Object)var6_7, (Object)v1, (long)994870944240479919L);
                        if (!var3_3) {
                            break block22;
                        }
                        ** GOTO lbl85
                        break;
                    }
                }
                while (true) {
                    switch (var7_4 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -385352661: 
                    }
                    hi.a("G", (long)602162150318222526L);
                    hi.a("G", (long)891539368048632717L);
                    var7_4 /* !! */  = yt.a(667, 8748632050658519641L) + yt.a(20530, 5826967136909523259L) ^ yt.a(10257, 7172798319480012897L);
                }
            }
            block16: while (true) {
                block30: {
                    block29: {
                        block28: {
                            block27: {
                                switch (var7_4 /* !! */ ) {
                                    default: {
                                        ** continue;
                                    }
                                    case 1523033110: {
                                        var6_7 = (eh)hi.a("\u00a5", (Object)var5_6, (long)470012372636416268L);
                                        v2 /* !! */  = hi.a("\u00a5", (Object)var6_7, (long)1099153674733698693L);
                                        if (!var3_3) break block27;
                                        if (v2 /* !! */  != false) break;
                                        break block28;
                                    }
                                    case 1523033107: {
                                        break block16;
                                    }
                                    case 1523033108: {
                                        throw null;
                                    }
                                }
                                v2 /* !! */  = (CallSite)((yt.a(32752, 1896119868071139063L) + yt.a(22964, 6968920469461824232L) - yt.a(29699, 6675580762202791776L)) / yt.a(16342, 2434717189355378108L) * yt.a(31277, 7390559951318602508L) + yt.a(28347, 3669291608215143589L));
                            }
                            var7_4 /* !! */  = (int)v2 /* !! */ ;
                            if (var3_3) break block29;
                        }
                        var7_4 /* !! */  = yt.a(9014, 4512460906271180960L) + yt.a(2917, 7601080267931329042L) - yt.a(4314, 7739242111757432998L) ^ yt.a(23633, 7813994353660786359L);
                        if (!var3_3) break block30;
                    }
                    switch (var7_4 /* !! */ ) {
                        default: {
                            if (var3_3) break;
                            ** GOTO lbl29
                        }
                        case 475396842: {
                            ** continue;
                        }
                        case 475396841: {
                            return;
                        }
                    }
                }
                var7_4 /* !! */  = (int)(hi.a("G", (int)(yt.a(7276, 8422865464581240029L) / yt.a(28081, 6409172708747396195L) / yt.a(31232, 1824473493713408704L)), (int)yt.a(32302, 6322895639808727013L), (long)834203424483934088L) - yt.a(13718, 3949479537933786430L));
                if (var3_3) continue;
lbl85:
                // 2 sources

                var7_4 /* !! */  = (int)(hi.a("G", (int)(yt.a(7276, 8422865464581240029L) / yt.a(28081, 6409172708747396195L) / yt.a(31232, 1824473493713408704L)), (int)yt.a(32302, 6322895639808727013L), (long)834203424483934088L) - yt.a(13718, 3949479537933786430L));
            }
        }
        hi.a("\u00a5", (Object)yt.W("qOSlWGrPYqi1kjt7", pose(), (GuiGraphicsExtractor)((GuiGraphicsExtractor)var2_2)), (long)759265041509996590L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void o(Object[] var1_1) {
        block17: {
            block16: {
                block14: {
                    block15: {
                        block13: {
                            block19: {
                                block18: {
                                    var2_2 = Dl.S();
                                    var3_3 /* !! */  = yt.a(7717, 3566304420644730095L) / 5 / 5 - yt.a(31657, 7231473744140849341L);
                                    if (var2_2) break block18;
lbl5:
                                    // 2 sources

                                    while (hi.a("\u00e9", (Object)this, (long)1303607583673849847L) != null) {
                                        break block13;
                                    }
                                    break block19;
lbl8:
                                    // 1 sources

                                    while (true) {
                                        v0 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", N(), (eh)hi.a("\u00e9", (Object)this, (long)1303607583673849847L));
                                        if (!var2_2) break block14;
                                        if (v0 /* !! */  != false) break block15;
                                        break block16;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        hi.a("G", (int)-1, (long)801972633595358600L);
                                        yt.W("qOSlWGrPYqi1kjt7", I());
lbl18:
                                        // 2 sources

                                        while (true) {
                                            hi.a("\u00f2", (Object)this, null, (long)1303607583673849847L);
                                            hi.a("\u00f2", (Object)this, null, (long)1302971948309712589L);
                                            hi.a("\u00f2", (Object)this, (vr)hi.a("G", (long)1098023335145461947L), (long)953386256987960056L);
                                            if (!var2_2) lbl-1000:
                                            // 2 sources

                                            {
                                                return;
                                            }
                                            break block17;
                                            break;
                                        }
                                        break;
                                    }
                                }
lbl27:
                                // 6 sources

                                while (true) {
                                    switch (var3_3 /* !! */ ) {
                                        default: {
                                            ** GOTO lbl5
                                        }
                                        case 286533163: {
                                            ** continue;
                                        }
                                        case 286533160: {
                                            ** continue;
                                        }
                                        case 286533159: {
                                            ** continue;
                                        }
                                        ** case 286533162:
lbl38:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                            }
                            var3_3 /* !! */  = (yt.a(2629, 7688390274604344235L) + yt.a(24440, 8408068141777582006L) - yt.a(7174, 2604062427283928283L)) * yt.a(3378, 2898564858972284673L) ^ yt.a(25318, 1128224412803942719L);
                            if (var2_2) ** GOTO lbl27
                        }
                        var3_3 /* !! */  = yt.a(31864, 8972741069146674997L) - yt.a(28952, 7227221563805850534L) + yt.a(24046, 5322414108615374395L) - yt.a(5513, 4455586891625086559L);
                        if (var2_2) ** GOTO lbl27
                    }
                    v0 /* !! */  = (CallSite)((yt.a(27823, 7621784632763008369L) + yt.a(14604, 6691243886850773545L) - yt.a(24705, 1704516707555527214L)) * yt.a(1795, 5689775662209379387L) ^ yt.a(30717, 7293623775279013251L));
                }
                var3_3 /* !! */  = (int)v0 /* !! */ ;
                if (var2_2) ** GOTO lbl27
            }
            var3_3 /* !! */  = yt.a(27727, 9181790998956851998L) / yt.a(18243, 5521236278038064926L) - yt.a(26104, 1000977866122546293L);
            if (var2_2) ** GOTO lbl27
        }
        var3_3 /* !! */  = (yt.a(27823, 7621784632763008369L) + yt.a(14604, 6691243886850773545L) - yt.a(24705, 1704516707555527214L)) * yt.a(1795, 5689775662209379387L) ^ yt.a(30717, 7293623775279013251L);
        ** while (true)
    }

    private void lambda$drawPanel$0(zU zU2) {
        Object[] objectArray = new Object[2];
        objectArray[1] = hi.a("\u00e9", (Object)((Object)this), (long)1011787142149536499L);
        objectArray[0] = zU2;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)606438669286401880L), (Object)objectArray, (long)1155910212241388078L);
    }

    /*
     * Unable to fully structure code
     */
    private dd D(Object[] var1_1) {
        block11: {
            block10: {
                block13: {
                    block12: {
                        var2_2 = (Integer)var1_1[0];
                        var3_3 = (Integer)var1_1[1];
                        var4_4 = Dl.t();
                        var5_5 = yt.a(24284, 3887124478664471899L) * yt.a(9419, 3002770429536177553L) + yt.a(6486, 4569098983607743078L) + yt.a(24867, 8140014661909104831L);
                        if (!var4_4) break block12;
lbl7:
                        // 2 sources

                        while (hi.a("\u00e9", (Object)this, (long)757894035959722330L) == null) {
                            break block10;
                        }
                        break block13;
lbl10:
                        // 1 sources

                        while (true) {
                            hi.a("\u00f2", (Object)this, (dd)hi.a("G", yt.a(-26604, 1015), (int)var2_2, (int)var3_3, (long)1217897332705552569L), (long)757894035959722330L);
                            if (var4_4) lbl-1000:
                            // 2 sources

                            {
                                return hi.a("\u00e9", (Object)this, (long)757894035959722330L);
                            }
                            break block11;
                            break;
                        }
                    }
lbl17:
                    // 4 sources

                    while (true) {
                        switch (var5_5) {
                            default: {
                                ** GOTO lbl7
                            }
                            case -410760132: {
                                ** continue;
                            }
                            case -410760134: {
                                ** continue;
                            }
                            case -410760133: 
                        }
                        return hi.a("G", (long)1184702471901219908L);
                    }
                }
                var5_5 = yt.a(8622, 8974732948570868540L) + yt.a(24892, 8069066714567592028L) ^ yt.a(19306, 8987004969548571602L);
                if (!var4_4) ** GOTO lbl17
            }
            var5_5 = (yt.a(10004, 765321118171499678L) + yt.a(3068, 1292474315480605641L)) / yt.a(31456, 6159207061937738747L) ^ yt.a(3420, 6170119802419652203L) ^ yt.a(799, 8439626050200644347L);
            if (!var4_4) ** GOTO lbl17
        }
        var5_5 = yt.a(9841, 2100381819638124430L) + yt.a(25690, 2726972835763801053L) ^ yt.a(10530, 8357717545527542465L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean k(Object[] var1_1) {
        block17: {
            block18: {
                block16: {
                    var2_2 = (Double)var1_1[0];
                    var4_3 = (Double)var1_1[1];
                    var6_4 = Dl.t();
                    var7_5 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)hi.a("G", (int)((yt.a(22907, 5708988219653584430L) ^ yt.a(1436, 5162204587760987380L)) * yt.a(20666, 6221102694301465422L)), (int)yt.a(29073, 5610334761170590403L), (long)834203424483934088L), (int)yt.a(27844, 1427747157049853349L)) + yt.a(16715, 1092311237250804496L);
                    if (!var6_4) break block16;
lbl7:
                    // 2 sources

                    while (true) {
                        if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) {
                            var7_5 /* !! */  = (reference)(yt.a(15560, 3992078852892137450L) / yt.a(25101, 399195519822940453L) ^ yt.a(30134, 5854976022020120415L));
                            if (!var6_4) break block16;
                        }
                        var7_5 /* !! */  = (reference)(yt.a(11653, 1753349424945760126L) / yt.a(18243, 5521236278038064926L) + yt.a(2623, 6064919921568982501L));
                        if (!var6_4) break block16;
                        ** GOTO lbl60
                        break;
                    }
lbl14:
                    // 2 sources

                    while (true) {
                        v0 = true;
                        var7_5 /* !! */  = hi.a("G", (int)yt.a(10770, 9104805032963999062L), (int)yt.a(8903, 413075749981358249L), (long)834203424483934088L) + yt.a(4686, 6584549123658758658L);
                        if (!var6_4) break block17;
                        break block18;
                        break;
                    }
                }
                block14: while (true) {
                    block29: {
                        block27: {
                            block28: {
                                block26: {
                                    block24: {
                                        block25: {
                                            block23: {
                                                block21: {
                                                    block22: {
                                                        block20: {
                                                            block19: {
                                                                switch (var7_5 /* !! */ ) {
                                                                    default: {
                                                                        ** continue;
                                                                    }
                                                                    case 834910083: {
                                                                        cfr_temp_0 = var2_2 - (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)975517958870901414L);
                                                                        v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                        if (var6_4) break block19;
                                                                        if (v1 < 0) break;
                                                                        break block20;
                                                                    }
                                                                    case 834910087: {
                                                                        cfr_temp_1 = var2_2 - (double)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)975517958870901414L) + hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)1260495607849894898L));
                                                                        v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                        if (var6_4) break block21;
                                                                        if (v2 > 0) break block22;
                                                                        break block23;
                                                                    }
                                                                    case 834910086: {
                                                                        cfr_temp_2 = var4_3 - (double)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)1183567479019984898L);
                                                                        v3 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                        if (var6_4) break block24;
                                                                        if (v3 < 0) break block25;
                                                                        break block26;
                                                                    }
                                                                    case 834910085: {
                                                                        cfr_temp_3 = var4_3 - (double)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)1183567479019984898L) + yt.W("qOSlWGrPYqi1kjt7", A(), (iu)hi.a("\u00e9", (Object)this, (long)606438669286401880L)));
                                                                        v4 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                                        if (var6_4) break block27;
                                                                        if (v4 > 0) break block28;
                                                                        break block29;
                                                                    }
                                                                    case 834910089: {
                                                                        ** GOTO lbl14
                                                                    }
                                                                    case 834910090: {
                                                                        v0 = false;
                                                                        if (!var6_4) break block14;
                                                                        return v0;
                                                                    }
                                                                    case 834910088: {
                                                                        hi.a("G", (long)1139342403621005073L);
                                                                        yt.W("qOSlWGrPYqi1kjt7", K(int int ), (int)-1, (int)yt.a(14762, 8021240280402597431L));
                                                                        ** continue;
                                                                    }
                                                                }
lbl60:
                                                                // 2 sources

                                                                v1 = yt.a(26425, 3199206686958275969L) / yt.a(25101, 399195519822940453L) ^ yt.a(26646, 758688693163444213L);
                                                            }
                                                            var7_5 /* !! */  = (reference)v1;
                                                            if (!var6_4) continue;
                                                        }
                                                        var7_5 /* !! */  = (reference)(hi.a("G", (int)yt.a(10907, 7799885697034223700L), (int)yt.a(2041, 8612663562455984175L), (long)834203424483934088L) ^ yt.a(15126, 6012175253099779029L));
                                                        if (!var6_4) continue;
                                                    }
                                                    v2 = yt.a(26425, 3199206686958275969L) / yt.a(25101, 399195519822940453L) ^ yt.a(26646, 758688693163444213L);
                                                }
                                                var7_5 /* !! */  = (reference)v2;
                                                if (!var6_4) continue;
                                            }
                                            var7_5 /* !! */  = (reference)((yt.a(846, 48024770514954765L) * yt.a(25832, 2369507555001256874L) ^ yt.a(29064, 3967044385091771351L) ^ yt.a(21381, 5204204227648355182L)) - yt.a(31354, 7849920866879000766L));
                                            if (!var6_4) continue;
                                        }
                                        v3 = yt.a(26425, 3199206686958275969L) / yt.a(25101, 399195519822940453L) ^ yt.a(26646, 758688693163444213L);
                                    }
                                    var7_5 /* !! */  = (reference)v3;
                                    if (!var6_4) continue;
                                }
                                var7_5 /* !! */  = hi.a("G", (int)yt.a(27850, 9036459243370759328L), (int)yt.a(24093, 1264522365489936306L), (long)834203424483934088L) / 5 + yt.a(14919, 3413831242037236465L);
                                if (!var6_4) continue;
                            }
                            v4 = yt.a(26425, 3199206686958275969L) / yt.a(25101, 399195519822940453L) ^ yt.a(26646, 758688693163444213L);
                        }
                        var7_5 /* !! */  = (reference)v4;
                        if (!var6_4) continue;
                    }
                    var7_5 /* !! */  = (reference)(yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(13704, 413279602285387076L) / yt.a(30910, 4575174221423301359L)), (int)yt.a(28065, 7945880889235850855L)) + yt.a(12625, 7101038421967936364L) ^ yt.a(6100, 6303605491728332907L));
                }
            }
            var7_5 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)yt.a(12350, 4304149705391413388L), (int)yt.a(201, 1642174807913147154L)) + yt.a(28798, 5177310698831304763L);
        }
        switch (var7_5 /* !! */ ) {
            default: {
                return v0;
            }
            case -777496583: 
        }
        throw null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void b(Object[] var1_1) {
        block18: {
            var3_2 = var1_1[0];
            var4_3 = ((Float)var1_1[1]).floatValue();
            var2_4 = ((Float)var1_1[2]).floatValue();
            var5_5 = Dl.S();
            var8_6 /* !! */  = hi.a("G", (int)(yt.a(16272, 930642251253388511L) - yt.a(26365, 4669180575028530615L) ^ yt.a(13305, 5027767499166620492L)), (int)yt.a(7235, 1240285149329306381L), (long)834203424483934088L) + yt.a(18469, 729461827235996234L) ^ yt.a(13827, 7496547356413566204L);
            if (var5_5) break block18;
lbl8:
            // 2 sources

            while (true) {
                block20: {
                    block19: {
                        v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)953386256987960056L), (long)1147131604351688068L);
                        if (!var5_5) break block19;
                        if (v0 /* !! */  != false) break block20;
                        v0 /* !! */  = (CallSite)((yt.a(10661, 9078943761905517486L) ^ yt.a(4017, 3772951254279661172L)) - yt.a(1398, 1156226551945473983L));
                    }
                    var8_6 /* !! */  = (int)v0 /* !! */ ;
                    if (var5_5) break block18;
                }
                var8_6 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)yt.a(5040, 7425485222881966842L), (int)yt.a(4990, 4482588289039187110L), (long)834203424483934088L), (int)yt.a(28906, 8997926613260949827L), (long)834203424483934088L) - yt.a(8452, 6396893407813142583L));
                break block18;
                break;
            }
lbl19:
            // 2 sources

            while (true) {
                v1 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", isNaN(float ), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)953386256987960056L), (long)1318551789242681697L));
                if (!var5_5) ** GOTO lbl71
                if (v1 /* !! */  != false) ** GOTO lbl70
                ** GOTO lbl73
                break;
            }
        }
        block12: while (true) {
            block21: {
                switch (var8_6 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1328624082: {
                        var6_7 = hi.a("G", (Object)hi.a("j", (long)501800615308669146L), (int)yt.a(1648, 5918565256405199893L), (long)950630386023407477L);
                        v2 /* !! */  = hi.a("G", (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)953386256987960056L), (long)1331610715158753763L), (long)1001310143529805074L);
                        if (!var5_5) ** GOTO lbl40
                        if (v2 /* !! */  != false) ** GOTO lbl39
                        ** GOTO lbl42
                    }
                    case 1328624083: {
                        hi.a("G", (long)829648466043852550L);
                        return;
                    }
lbl39:
                    // 1 sources

                    v2 /* !! */  = (CallSite)((yt.a(23137, 2245102327496307367L) ^ yt.a(6899, 226288786709722556L)) - yt.a(12350, 1164490670912314138L));
lbl40:
                    // 2 sources

                    var8_6 /* !! */  = (int)v2 /* !! */ ;
                    if (var5_5) break block21;
lbl42:
                    // 2 sources

                    var8_6 /* !! */  = yt.a(11106, 80239894842212633L) / 5 * yt.a(29973, 2680732145571585510L) * yt.a(12301, 7365192111437814256L) - yt.a(4290, 3164925623171136441L) ^ yt.a(7091, 4395583997821137286L);
                    break block21;
                    case 1328624080: 
                }
                return;
            }
            block13: while (true) {
                switch (var8_6 /* !! */ ) {
                    default: {
                        var7_8 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)953386256987960056L), (long)1331610715158753763L);
                        hi.a("\u00a5", (Object)((zU)var3_2), (float)(var7_8 - 0.5f), (float)0.0f, (float)1.0f, (float)var2_4, (Object)var6_7, (long)941115194411145692L);
                        if (var5_5) break;
                        ** GOTO lbl19
                    }
                    case 646694560: {
                        ** continue;
                    }
                    case 646694559: {
                        var7_8 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)953386256987960056L), (long)1318551789242681697L);
                        hi.a("\u00a5", (Object)((zU)var3_2), (float)0.0f, (float)(var7_8 - 0.5f), (float)var4_3, (float)1.0f, (Object)var6_7, (long)941115194411145692L);
                        if (var5_5) break block13;
                        return;
                    }
                    case 646694562: {
                        hi.a("G", (boolean)false, (float)-0.5f, (long)499998531297741759L);
                        hi.a("G", (long)976103121275918466L);
                        return;
                    }
                }
                var8_6 /* !! */  = (yt.a(8447, 3567368203427121234L) ^ yt.a(2817, 5400219795466494659L)) - yt.a(19186, 7169338327765541684L);
                if (var5_5) continue;
lbl70:
                // 2 sources

                v1 /* !! */  = (CallSite)((yt.a(4728, 280143452779657430L) ^ yt.a(6308, 4208925068311671506L)) - yt.a(11826, 475187076319805885L));
lbl71:
                // 2 sources

                var8_6 /* !! */  = (int)v1 /* !! */ ;
                if (var5_5) continue block12;
lbl73:
                // 2 sources

                var8_6 /* !! */  = yt.a(3730, 4467306816703047651L) - yt.a(774, 1927809095698065518L) + yt.a(23607, 6304071630411691301L);
            }
            var8_6 /* !! */  = (yt.a(4728, 280143452779657430L) ^ yt.a(6308, 4208925068311671506L)) - yt.a(11826, 475187076319805885L);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void J(Object var1_1, Object var2_2, Object var3_3, boolean var4_4, boolean var5_5) {
        block59: {
            block60: {
                block58: {
                    var6_6 = Dl.S();
                    var13_7 /* !! */  = (yt.a(12634, 5685135291582421747L) ^ yt.a(32232, 9164870603743254025L)) / yt.a(31232, 1824473493713408704L) ^ yt.a(12233, 6581722773994014174L) ^ yt.a(7289, 800439376796398535L);
                    if (var6_6) {
                        switch (var13_7 /* !! */ ) {
                            case 1157365042: {
                                hi.a("G", (long)541698517340995912L);
                                break;
                            }
                        }
                    }
                    var7_8 = hi.a("\u00e9", (Object)((eh)var3_3), (long)934067547881438154L) - 3.0f;
                    var8_9 = hi.a("\u00e9", (Object)((eh)var3_3), (long)423210454345410312L) - 3.0f;
                    var9_10 = hi.a("\u00e9", (Object)((eh)var3_3), (long)757761617965287585L) + 6.0f;
                    var10_11 = hi.a("\u00e9", (Object)((eh)var3_3), (long)1164498346519456838L) + 6.0f;
                    v0 = var4_4;
                    if (!var6_6) ** GOTO lbl192
                    if (v0 == 0) ** GOTO lbl191
                    ** GOTO lbl193
lbl18:
                    // 2 sources

                    while (true) {
                        block65: {
                            block64: {
                                block63: {
                                    block62: {
                                        block61: {
                                            var11_12 = v1;
                                            v2 = var4_4;
                                            if (!var6_6) break block61;
                                            if (v2 != 0) break block62;
                                            v2 = var13_7 /* !! */  = yt.a(12173, 7832489654321120483L) + yt.a(26333, 1274141379796389119L) ^ yt.a(25290, 3485150714087393718L);
                                        }
                                        if (var6_6) break block63;
                                    }
                                    var13_7 /* !! */  = yt.a(10612, 7710733902494302557L) + yt.a(21808, 6457183728545365904L) ^ yt.a(12144, 5508700400119088599L) ^ yt.a(32266, 7634890548066145865L);
                                }
                                switch (var13_7 /* !! */ ) {
                                    default: {
                                        v3 = hi.a("G", (Object)hi.a("j", (long)817827339599640798L), (int)yt.a(7722, 6435327622066320447L), (long)950630386023407477L);
                                        var13_7 /* !! */  = (yt.a(10972, 5665637043154813464L) / yt.a(1559, 6643513011041414677L) ^ yt.a(32604, 7557653732400451786L)) + yt.a(16047, 7509153140965381334L);
                                        if (!var6_6) {
                                            break;
                                        }
                                        break block58;
                                    }
                                    case -1432316966: {
                                        v3 = hi.a("j", (long)1257914836987805569L);
                                        v4 = var5_5;
                                        if (!var6_6) break block64;
                                        if (v4 == 0) break;
                                        break block65;
                                    }
                                    case -1432316964: {
                                        hi.a("G", (long)877399517904373040L);
                                        return;
                                    }
                                }
                                v4 = var13_7 /* !! */  = hi.a("G", (int)hi.a("G", (int)yt.a(26367, 6745195985254272701L), (int)yt.a(1498, 5011012557983886866L), (long)834203424483934088L), (int)yt.a(18973, 2457365288841831011L), (long)834203424483934088L) ^ yt.a(24553, 1552470019048174605L);
                            }
                            if (var6_6) break block58;
                        }
                        var13_7 /* !! */  = (yt.a(27789, 6243853235752650600L) ^ yt.a(31178, 4153432700925956687L)) + yt.a(25996, 860500155735165456L);
                        break block58;
                        break;
                    }
lbl52:
                    // 2 sources

                    while (true) {
                        v3 = hi.a("G", (Object)v3, (int)v5, (long)950630386023407477L);
                        if (var6_6) {
                            var13_7 /* !! */  = (yt.a(2238, 5004296485880406633L) / yt.a(18243, 5521236278038064926L) ^ yt.a(29830, 8302535405559537177L)) + yt.a(22513, 1399264166377684373L);
                            break block58;
                        }
lbl57:
                        // 3 sources

                        while (true) {
                            block72: {
                                block71: {
                                    block70: {
                                        block69: {
                                            block68: {
                                                block67: {
                                                    block66: {
                                                        var12_13 = v3;
                                                        hi.a("\u00a5", (Object)((zU)var1_1), (float)var7_8, (float)var8_9, (float)var9_10, (float)var10_11, (Object)var12_13, (long)941115194411145692L);
                                                        v6 = (zU)var1_1;
                                                        v7 = var4_4;
                                                        if (!var6_6) break block66;
                                                        if (v7 != 0) break block67;
                                                        v7 = var13_7 /* !! */  = yt.a(8761, 8416343669314062616L) - yt.a(11028, 9038497466587807829L) - yt.a(16648, 6692952422697134297L) + yt.a(4726, 6601724633598048380L);
                                                    }
                                                    if (var6_6) break block68;
                                                }
                                                var13_7 /* !! */  = (yt.a(31723, 7017777325978604278L) ^ yt.a(31409, 3264055069891384815L)) + yt.a(6870, 7889537940900393755L) - yt.a(28195, 4535656414640096928L);
                                            }
                                            switch (var13_7 /* !! */ ) {
                                                default: {
                                                    v8 = 1.2f;
                                                    var13_7 /* !! */  = hi.a("G", (int)yt.a(21372, 8711399797690333875L), (int)yt.a(18500, 2818115620411597290L), (long)834203424483934088L) ^ yt.a(25938, 584900999911854026L);
                                                    if (!var6_6) {
                                                        break;
                                                    }
                                                    break block69;
                                                }
                                                case -2006917506: {
                                                    v8 = 0.8f;
                                                    if (var6_6) break;
                                                    break block70;
                                                }
                                                case -2006917507: {
                                                    return;
                                                }
                                            }
                                            var13_7 /* !! */  = hi.a("G", (int)yt.a(7062, 2849897859828756812L), (int)yt.a(8357, 2006431774234020358L), (long)834203424483934088L) ^ yt.a(4979, 4368022953960749645L);
                                        }
                                        switch (var13_7 /* !! */ ) {
                                            case -1816547421: {
                                                hi.a("G", (long)1033419646183286307L);
                                                break;
                                            }
                                        }
                                    }
                                    v9 = new Object[6];
                                    v9[5] = var11_12;
                                    v9[4] = Float.valueOf(v8);
                                    v9[3] = Float.valueOf((float)var10_11);
                                    v9[2] = Float.valueOf((float)var9_10);
                                    v9[1] = Float.valueOf((float)var8_9);
                                    v9[0] = Float.valueOf((float)var7_8);
                                    hi.a("\u00a5", (Object)v6, (Object)v9, (long)496696192049424877L);
                                    v10 = var4_4;
                                    if (!var6_6) break block71;
                                    if (v10 != 0) break block72;
                                    v10 = var13_7 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(yt.a(26882, 4085941921640203844L) + yt.a(455, 6898915243851033255L)), (int)yt.a(1294, 8503232664196558337L), (long)834203424483934088L) * yt.a(11883, 7671782627976873632L)), (int)yt.a(4121, 2545261739639781800L), (long)834203424483934088L) ^ yt.a(6362, 1631312267125110548L);
                                }
                                if (var6_6) break block59;
                            }
                            var13_7 /* !! */  = (yt.a(3211, 6161455903626076968L) ^ yt.a(30417, 4330947177474154126L)) / yt.a(12971, 4372842151893309769L) + yt.a(8994, 5632850219945691564L) - yt.a(17460, 2098340148529818945L);
                            if (var6_6) break block59;
                            ** GOTO lbl195
                            break;
                        }
                        break;
                    }
lbl110:
                    // 2 sources

                    block36: while (true) {
                        block73: {
                            switch (var13_7 /* !! */ ) {
                                default: {
                                    v1 = hi.a("j", (long)501800615308669146L);
                                    var13_7 /* !! */  = hi.a("G", (int)(yt.a(3950, 1144263003397956662L) ^ yt.a(22511, 2024216039754333626L)), (int)yt.a(8439, 2737457351976783618L), (long)834203424483934088L) ^ yt.a(56, 7818984290397694036L);
                                    if (!var6_6) {
                                        break;
                                    }
                                    break block73;
                                }
                                case 1706057251: {
                                    v1 = hi.a("G", (Object)hi.a("j", (long)787573419855687315L), (int)yt.a(1593, 1697527284072492593L), (long)950630386023407477L);
                                    if (var6_6) break;
                                    ** GOTO lbl18
                                }
                                case 1706057250: {
                                    hi.a("G", (float)10.0f, (float)-1.0f, (float)10.0f, (float)10.0f, (long)796776827756410481L);
                                    hi.a("G", (int)yt.a(6850, 2885134092015940205L), (int)0, (long)737592949251754456L);
                                    var13_7 /* !! */  = (int)(hi.a("G", (int)yt.a(31362, 179578143014900007L), (int)yt.a(26887, 8532979430542786640L), (long)834203424483934088L) * yt.a(2084, 3708178654573175697L) - yt.a(20766, 4858519125586575067L));
                                    continue block36;
                                }
                            }
                            var13_7 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(9372, 2530420590708854084L) ^ yt.a(18156, 5742795066394995719L)), (int)yt.a(17512, 150485814049565794L)) ^ yt.a(9761, 8382264891736821631L);
                        }
                        switch (var13_7 /* !! */ ) {
                            default: {
                                ** continue;
                            }
                            case -84851948: 
                        }
                        return;
                    }
                }
                block37: while (true) {
                    switch (var13_7 /* !! */ ) {
                        default: {
                            v5 = yt.a(27927, 5865027538398430502L);
                            var13_7 /* !! */  = hi.a("G", (int)(yt.a(28652, 3743283339020551619L) ^ yt.a(1966, 7126940841868799420L)), (int)yt.a(8944, 6943982334551821168L), (long)834203424483934088L) - yt.a(25076, 4674616778786328075L) ^ yt.a(16452, 3545911044060901347L) ^ yt.a(21123, 1471870938723614021L);
                            if (!var6_6) {
                                break block37;
                            }
                            break block60;
                        }
                        case 221076737: {
                            v5 = yt.a(26710, 4986184431191245397L);
                            if (var6_6) break block37;
                            ** GOTO lbl52
                        }
                        case 221076739: {
                            ** continue;
                        }
                        case 221076738: {
                            hi.a("G", (int)2, (long)532165785136172044L);
                            yt.W("qOSlWGrPYqi1kjt7", E());
                            var13_7 /* !! */  = yt.a(14205, 8911475396939783394L) - yt.a(4246, 3942593247131876351L) - yt.a(22902, 9142568896014021235L);
                            continue block37;
                        }
                    }
                    break;
                }
                var13_7 /* !! */  = hi.a("G", (int)(yt.a(17440, 8477496908591623752L) ^ yt.a(0, 5076246893043034897L)), (int)yt.a(27442, 3715760540388475378L), (long)834203424483934088L) - yt.a(13935, 5430089216039886779L) ^ yt.a(32208, 5444185725248034414L) ^ yt.a(17886, 1839573312640445850L);
            }
            switch (var13_7 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 223071519: 
            }
            return;
        }
        block38: while (true) {
            switch (var13_7 /* !! */ ) {
                default: {
                    v11 = new Object[3];
                    v11[2] = var11_12;
                    v11[1] = (eh)var3_3;
                    v11[0] = (zU)var1_1;
                    hi.a("\u00a5", (Object)this, (Object)v11, (long)1280775375389078902L);
                    v12 = new Object[5];
                    v12[4] = Float.valueOf((float)var8_9);
                    v12[3] = Float.valueOf((float)var7_8);
                    v12[2] = (eh)var3_3;
                    v12[1] = (DF)var2_2;
                    v12[0] = (zU)var1_1;
                    hi.a("\u00a5", (Object)this, (Object)v12, (long)1190382155946879876L);
                    if (!var6_6) {
                        return;
                    }
                    ** GOTO lbl195
                }
                case 1752850651: {
                    hi.a("G", (long)1060921528960496445L);
                    hi.a("G", (long)850375381118395903L);
                    if (var6_6 != false) return;
lbl191:
                    // 2 sources

                    v0 = var13_7 /* !! */  = ((yt.a(29070, 6143684230965878366L) ^ yt.a(25865, 8718653578806676691L)) / yt.a(30057, 4901477608012536969L) ^ yt.a(6207, 5796996462735471603L)) * yt.a(9036, 6792477896365967459L) - yt.a(22242, 3940573140737654493L);
lbl192:
                    // 2 sources

                    if (var6_6) ** GOTO lbl110
lbl193:
                    // 2 sources

                    var13_7 /* !! */  = yt.a(19716, 785687988181820054L) - yt.a(12750, 1881112542164195514L) ^ yt.a(19559, 1453382341953709667L);
                    ** continue;
                }
lbl195:
                // 2 sources

                var13_7 /* !! */  = hi.a("G", (int)(yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(18331, 4249745986313448571L) + yt.a(28792, 508392581096921410L)), (int)yt.a(30427, 8942845421794647360L)) * yt.a(2325, 3258079394637324329L)), (int)yt.a(15170, 1581054517106119211L), (long)834203424483934088L) ^ yt.a(12277, 1364271590095127958L);
                continue block38;
                case 1752850652: 
            }
            break;
        }
    }

    public boolean isPauseScreen() {
        return false;
    }

    static {
        IlilIlIlil.registerNativesForClass((int)32, yt.class);
        Hidden0.special_clinit_32_150(yt.class);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean preeditUpdated(PreeditEvent var1_1) {
        block15: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = (yt.a(29618, 566114238808251444L) * yt.a(13156, 3450808319474539500L) + yt.a(6988, 976178096059724666L) ^ yt.a(32742, 8960759359840735276L)) + yt.a(17973, 8493164364345928037L);
            if (var2_2) break block15;
lbl4:
            // 2 sources

            while (true) {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                block16: {
                                    if (!var2_2) break block16;
                                    if (var1_1 == null) break block17;
                                    var3_3 /* !! */  = yt.a(22191, 8096075483343583506L) * yt.a(24918, 8742271384565140996L) ^ yt.a(16713, 3234695128112916535L);
                                }
                                if (var2_2) break block18;
                            }
                            var3_3 /* !! */  = (int)(hi.a("G", (int)(yt.a(26743, 8948336776488042593L) ^ yt.a(13528, 3492147508067867651L)), (int)yt.a(4373, 2228911881756031941L), (long)834203424483934088L) / yt.a(31456, 6159207061937738747L) - yt.a(24518, 5872866547967981171L));
                        }
                        switch (var3_3 /* !! */ ) {
                            default: {
                                v0 = null;
                                var3_3 /* !! */  = yt.a(19243, 6273335832594670260L) - yt.a(1191, 5712617862587166672L) - yt.a(3774, 759729659240588687L);
                                break block19;
                            }
                            case 1951643226: {
                                v0 = new IMEPreeditOverlay(var1_1, (Font)hi.a("\u00e9", (Object)this, (long)388530397870575427L), yt.a(31232, 1824473493713408704L));
                                if (var2_2) break;
                                break block20;
                            }
                            case 1951643225: {
                                hi.a("G", (long)1229653054671944966L);
                                hi.a("G", (long)660349619478157975L);
                                return false;
                            }
                        }
                        var3_3 /* !! */  = yt.a(17175, 5057605047081199837L) - yt.a(25770, 5364901300750503386L) - yt.a(17910, 4840125066783747428L);
                    }
                    switch (var3_3 /* !! */ ) {
                        case 1184153488: {
                            hi.a("G", (long)659151967568421102L);
                            hi.a("G", (long)614553230640737479L);
                            break;
                        }
                    }
                }
                hi.a("\u00f2", (Object)this, (IMEPreeditOverlay)v0, (long)947006031877009741L);
                return true;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case 1122814522: 
            }
            hi.a("G", (long)979899430926065004L);
            hi.a("G", (boolean)true, (long)529149675032995021L);
            var3_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(yt.a(17236, 7430807060413836308L) - yt.a(13929, 3969851805834485236L)), (int)yt.a(15874, 6200198793406256684L), (long)834203424483934088L), (int)yt.a(6076, 5571901580689554966L), (long)834203424483934088L) * yt.a(12476, 105741966419565228L) - yt.a(27580, 1368768692591281381L));
            if (!var2_2) ** continue;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean charTyped(CharacterEvent var1_1) {
        block12: {
            block11: {
                block10: {
                    var2_2 = Dl.t();
                    var4_3 /* !! */  = hi.a("G", (int)(yt.a(5812, 8997713193924115905L) + yt.a(14956, 1517612604314882338L)), (int)yt.a(8774, 2797382926494435983L), (long)834203424483934088L) + yt.a(3404, 5187236703822390892L) ^ yt.a(5986, 6118988829680287393L);
                    if (var2_2) ** GOTO lbl-1000
                    switch (var4_3 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var3_4 = hi.a("\u00a5", (Object)var1_1, (long)520692021534834522L);
                            if (var2_2) break block10;
                            if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) break;
                            break block11;
                        }
                        case -2048336928: {
                            throw null;
                        }
                    }
                    var4_3 /* !! */  = (yt.a(12707, 3652640892955761308L) ^ yt.a(1470, 904563402010275591L)) - yt.a(25330, 8668903397662083354L) + yt.a(18474, 1896526568240767711L) ^ yt.a(9517, 5785479395734785213L);
                }
                if (!var2_2) break block12;
            }
            var4_3 /* !! */  = ((yt.a(5732, 8103825456723868779L) + yt.a(3169, 3710802355220686539L)) * yt.a(7238, 2732460719063545145L) ^ yt.a(9221, 4305676778143846051L)) - yt.a(25597, 1353572539940326204L) - yt.a(27689, 5594830883433236292L);
            if (var2_2) ** GOTO lbl35
        }
        block9: while (true) {
            switch (var4_3 /* !! */ ) {
                default: {
                    v0 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)361382094905603987L);
                    if (var2_2) ** GOTO lbl36
                    if (v0 /* !! */  != false) ** GOTO lbl35
                    ** GOTO lbl38
                }
                case 1772072006: {
                    v1 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)new Object[]{var3_4}, (long)990794705177567151L);
                    if (var2_2) ** GOTO lbl41
                    if (v1 /* !! */  == false) ** GOTO lbl40
                    ** GOTO lbl43
                }
                case 1772072007: {
                    yt.W("qOSlWGrPYqi1kjt7", B());
                    return false;
                }
lbl35:
                // 2 sources

                v0 /* !! */  = (CallSite)((yt.a(567, 2290734466910694292L) ^ yt.a(22609, 7390514534590412742L)) - yt.a(24000, 5571335021912487031L) + yt.a(23521, 7734243735140234086L) ^ yt.a(28255, 4486504884829798895L));
lbl36:
                // 2 sources

                var4_3 /* !! */  = (int)v0 /* !! */ ;
                if (!var2_2) continue block9;
lbl38:
                // 2 sources

                var4_3 /* !! */  = hi.a("G", (int)(yt.a(5954, 5067581058577186587L) * yt.a(25860, 4469204882121641659L)), (int)yt.a(32165, 2248423376989705401L), (long)834203424483934088L) - yt.a(26708, 1116901730203157322L) ^ yt.a(13498, 3239187534626528933L);
                if (!var2_2) continue block9;
lbl40:
                // 2 sources

                v1 /* !! */  = (CallSite)((yt.a(567, 2290734466910694292L) ^ yt.a(22609, 7390514534590412742L)) - yt.a(24000, 5571335021912487031L) + yt.a(23521, 7734243735140234086L) ^ yt.a(28255, 4486504884829798895L));
lbl41:
                // 2 sources

                var4_3 /* !! */  = (int)v1 /* !! */ ;
                if (!var2_2) continue block9;
lbl43:
                // 2 sources

                var4_3 /* !! */  = yt.a(11208, 3481025008403973169L) * yt.a(30155, 7928828005298233148L) ^ yt.a(23535, 2961620727216993032L) ^ yt.a(21277, 8858745799581531066L);
                continue block9;
                case 1772072004: {
                    return true;
                }
                case 1772072005: 
            }
            break;
        }
        return super.charTyped(var1_1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void extractRenderState(GuiGraphicsExtractor var1_1, int var2_2, int var3_3, float var4_4) {
        block17: {
            block16: {
                block14: {
                    block15: {
                        var5_5 = Dl.S();
                        var10_6 /* !! */  = hi.a("G", (int)yt.a(25765, 6779016166673828681L), (int)yt.a(32622, 1713025778253452987L), (long)834203424483934088L) + yt.a(325, 7291469614529488897L);
                        if (!var5_5) {
lbl5:
                            // 2 sources

                            while (true) {
                                hi.a("G", (double)0.0, (long)1273198203909826830L);
                                v0 = hi.a("G", (long)487615547825844238L);
lbl9:
                                // 3 sources

                                while (true) {
                                    var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)579320878743283099L), (long)501728103734382890L);
                                    v1 = new Object[2];
                                    v1[1] = (int)hi.a("\u00a5", (Object)var6_7, (long)1111753302704211661L);
                                    v1[0] = (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L);
                                    var7_8 = hi.a("\u00a5", (Object)this, (Object)v1, (long)391999609565778585L);
                                    hi.a("\u00a5", (Object)var7_8, (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L), (int)yt.W("qOSlWGrPYqi1kjt7", getHeight(), (Window)var6_7), (long)1136979599976336456L);
                                    hi.a("\u00a5", (Object)var7_8, (long)747195180656453255L);
                                    hi.a("G", (Object)var7_8, (long)354958188171490714L);
                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)477459963365500240L), (Object)new Object[0], (long)784770621003871767L);
                                    var8_9 = hi.a("G", (int)var2_2, (long)801972633595358600L);
                                    var9_10 = hi.a("G", (int)var3_3, (long)701518974625326203L);
                                    v2 = new Object[2];
                                    v2[1] = (int)var9_10;
                                    v2[0] = (int)var8_9;
                                    hi.a("\u00a5", (Object)this, (Object)v2, (long)814270959387112937L);
                                    hi.a("\u00f2", (Object)this, (boolean)true, (long)611041330006314377L);
                                    hi.a("G", null, (long)354958188171490714L);
                                    if (!var5_5) break block14;
                                    if (hi.a("\u00e9", (Object)this, (long)947006031877009741L) == null) break block15;
                                    break block16;
                                    break;
                                }
                                break;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)947006031877009741L), (int)((int)hi.a("j", (long)817515226557096230L)), (int)((int)hi.a("j", (long)660311983048283728L)), (long)965929651793311435L);
                                hi.a("\u00a5", (Object)var1_1, (Object)hi.a("\u00e9", (Object)this, (long)947006031877009741L), (long)1320594276746924013L);
                                if (!var5_5) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        yt.W("qOSlWGrPYqi1kjt7", blit(com.mojang.blaze3d.pipeline.RenderPipeline net.minecraft.resources.Identifier int int float float int int int int int int ), (GuiGraphicsExtractor)var1_1, (RenderPipeline)hi.a("j", (long)557403599261798098L), (Identifier)hi.a("\u00a5", (Object)var7_8, (long)800909747388376883L), (int)0, (int)0, (float)0.0f, (float)((float)hi.a("\u00a5", (Object)var6_7, (long)1111753302704211661L)), (int)hi.a("\u00a5", (Object)var6_7, (long)932549962227715674L), (int)hi.a("\u00a5", (Object)var6_7, (long)1259377200156611885L), (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L), (int)(-yt.W("qOSlWGrPYqi1kjt7", getHeight(), (Window)var6_7)), (int)hi.a("\u00a5", (Object)var6_7, (long)942674706230755144L), (int)hi.a("\u00a5", (Object)var6_7, (long)1111753302704211661L));
                                        hi.a("\u00a5", (Object)this, (Object)new Object[]{var1_1}, (long)810791856081105726L);
                                        return;
                                    }
                                }
                                break block17;
                                break;
                            }
                        }
                        v0 = var10_6 /* !! */ ;
                        if (!var5_5) ** GOTO lbl9
                        switch (v0) {
                            case 1407039026: {
                                ** continue;
                            }
                            ** default:
lbl45:
                            // 1 sources

                            ** continue;
                        }
lbl46:
                        // 3 sources

                        while (true) {
                            switch (var10_6 /* !! */ ) {
                                default: {
                                    ** continue;
                                }
                                case 346488621: {
                                    ** continue;
                                }
                                case 346488622: 
                            }
                            return;
                        }
                    }
                    var10_6 /* !! */  = (reference)(hi.a("G", (int)((yt.a(11278, 7026702634709582967L) ^ yt.a(6017, 8390479343408922080L)) - yt.a(7224, 8588135692984136640L)), (int)yt.a(27695, 4343876373373109920L), (long)834203424483934088L) - yt.a(12345, 6730942258035956572L) ^ yt.a(12738, 3648921777528512056L));
                }
                if (var5_5) ** GOTO lbl46
            }
            var10_6 /* !! */  = hi.a("G", (int)((yt.a(4831, 4054224094607392140L) ^ yt.a(29503, 940619539321379959L)) * yt.a(12748, 8267692545277860856L)), (int)yt.a(20734, 1766693511228554122L), (long)834203424483934088L) - yt.a(19781, 4422317439776908593L) + yt.a(3263, 5240046097680147677L);
            if (var5_5) ** GOTO lbl46
        }
        var10_6 /* !! */  = (reference)(hi.a("G", (int)((yt.a(25182, 4148382438028364215L) ^ yt.a(17083, 2522053649306118949L)) - yt.a(27494, 5399481726713380992L)), (int)yt.a(7794, 8867535904049903507L), (long)834203424483934088L) - yt.a(6290, 4600506832477827969L) ^ yt.a(14523, 8544301718774388520L));
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite W(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private void l(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = Float.valueOf((float)hi.a("\u00e9", (Object)((eh)object2), (long)757761617965287585L));
        objectArray2[1] = Float.valueOf((float)hi.a("\u00e9", (Object)((eh)object2), (long)934067547881438154L));
        objectArray2[0] = yt.W("qOSlWGrPYqi1kjt7", s(), (eh)((eh)object2));
        CallSite callSite = hi.a("G", (Object)objectArray2, (long)1119064728124897674L);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = Float.valueOf((float)hi.a("\u00e9", (Object)((eh)object2), (long)1164498346519456838L));
        objectArray3[1] = Float.valueOf((float)hi.a("\u00e9", (Object)((eh)object2), (long)423210454345410312L));
        objectArray3[0] = hi.a("\u00a5", (Object)((eh)object2), (Object)new Object[0], (long)1010006864413992336L);
        CallSite callSite2 = hi.a("G", (Object)objectArray3, (long)446536886269873158L);
        hi.a("\u00a5", (Object)((zU)object), (float)(callSite - 2.5f), (float)(callSite2 - 2.5f), (float)5.0f, (float)5.0f, (Object)((Color)object3), (long)941115194411145692L);
    }

    /*
     * Exception decompiling
     */
    public void onClose() {
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
    public boolean mouseClicked(MouseButtonEvent var1_1, boolean var2_2) {
        block21: {
            var3_3 = Dl.t();
            var6_4 = hi.a("G", (int)(yt.a(10634, 4663289045918515884L) ^ yt.a(22698, 3153695069698486957L)), (int)yt.a(3709, 8538708959324087966L), (long)834203424483934088L) / 3 - yt.a(539, 8985699883021413320L);
            if (!var3_3) break block21;
lbl4:
            // 2 sources

            while (true) {
                var4_5 = hi.a("G", (Object)var1_1, (long)387410669818340308L);
                if (var3_3) ** GOTO lbl79
                if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) ** GOTO lbl78
                if (true) ** GOTO lbl80
                break;
            }
        }
        while (true) {
            switch (var6_4) {
                default: {
                    ** continue;
                }
                case -591830371: 
            }
            hi.a("G", (long)369479218486228686L);
            hi.a("G", (long)561677051612723832L);
            var6_4 = (reference)(yt.a(801, 491598179501975809L) ^ yt.a(31888, 2961012997324789755L) ^ yt.a(4243, 8126842212428462761L));
        }
        block16: while (true) {
            switch (var6_4) {
                default: {
                    v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (double)hi.a("\u00a5", (Object)var4_5, (long)1321164245525494063L), (double)hi.a("\u00a5", (Object)var4_5, (long)1045026150751632794L), (int)hi.a("\u00a5", (Object)var4_5, (long)1304202693631103201L), (long)1082526165719206739L);
                    if (var3_3) ** GOTO lbl83
                    if (v0 == false) ** GOTO lbl82
                    ** GOTO lbl84
                }
                case 815061394: {
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)502996981711719326L);
                    return true;
                }
                case 815061391: {
                    v1 = hi.a("\u00a5", (Object)var4_5, (long)1304202693631103201L);
                    if (var3_3) ** GOTO lbl87
                    if (v1 != false) ** GOTO lbl86
                    ** GOTO lbl88
                }
                case 815061392: {
                    v2 = new Object[3];
                    v2[2] = false;
                    v2[1] = (double)hi.a("\u00a5", (Object)var4_5, (long)1045026150751632794L);
                    v2[0] = (double)yt.W("qOSlWGrPYqi1kjt7", x(), (MouseButtonEvent)var4_5);
                    var5_6 = hi.a("\u00a5", (Object)this, (Object)v2, (long)1255479385100548196L);
                    if (var3_3) ** GOTO lbl55
                    if (var5_6 == null) ** GOTO lbl54
                    ** GOTO lbl56
                }
                case 815061396: {
                    hi.a("G", (int)yt.a(30520, 4389747249371864617L), (int)1, (int)1, (int)yt.a(31232, 1824473493713408704L), (long)936415413245529974L);
                    hi.a("G", (long)1064615117133635571L);
                    return false;
                }
lbl54:
                // 1 sources

                var6_4 = hi.a("G", (int)yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(16825, 1326766067788572969L) * yt.a(9050, 1724936309288274132L)), (int)yt.a(11816, 1850583876039476702L)), (int)yt.a(13812, 6237881314976898820L), (long)834203424483934088L) + yt.a(13778, 1965808984454274450L);
lbl55:
                // 2 sources

                if (!var3_3) ** GOTO lbl57
lbl56:
                // 2 sources

                var6_4 = (reference)((yt.a(6724, 2915431135477182492L) ^ yt.a(19847, 617062176381200148L)) + yt.a(9981, 2560614089471463118L));
lbl57:
                // 2 sources

                v3 /* !! */  = var6_4;
                if (var3_3) ** GOTO lbl72
                switch (v3 /* !! */ ) {
                    default: {
                        hi.a("\u00f2", (Object)this, (eh)var5_6, (long)1303607583673849847L);
                        hi.a("\u00f2", (Object)this, (eh)var5_6, (long)1302971948309712589L);
                        hi.a("\u00f2", (Object)this, (float)((float)hi.a("\u00a5", (Object)var4_5, (long)1321164245525494063L) - hi.a("\u00e9", (Object)var5_6, (long)934067547881438154L)), (long)687610466452657847L);
                        hi.a("\u00f2", (Object)this, (float)((float)hi.a("\u00a5", (Object)var4_5, (long)1045026150751632794L) - hi.a("\u00e9", (Object)var5_6, (long)423210454345410312L)), (long)631399249667459864L);
                        hi.a("\u00f2", (Object)this, (vr)hi.a("G", (long)1098023335145461947L), (long)953386256987960056L);
                        return true;
                    }
                    case -330906216: {
                        ** GOTO lbl75
                    }
                    case -330906217: {
                        v3 /* !! */  = hi.a("G", (int)4, (long)1024745345430233792L);
                    }
                }
lbl72:
                // 2 sources

                hi.a("G", (long)1026165039297148217L);
                if (var3_3) ** GOTO lbl78
lbl75:
                // 2 sources

                hi.a("\u00f2", (Object)this, null, (long)1303607583673849847L);
                hi.a("\u00f2", (Object)this, (vr)hi.a("G", (long)1098023335145461947L), (long)953386256987960056L);
                return true;
lbl78:
                // 2 sources

                var6_4 = hi.a("G", (int)(yt.a(31891, 509334984577766350L) + yt.a(25376, 6865946498659535494L)), (int)yt.a(14375, 2428585636776121199L), (long)834203424483934088L) - yt.a(11384, 6834525909616887557L);
lbl79:
                // 2 sources

                if (!var3_3) continue block16;
lbl80:
                // 2 sources

                var6_4 = (reference)((yt.a(7963, 1618789515293537664L) ^ yt.a(31447, 8416018230872036028L)) + yt.a(6464, 2025693114832828143L));
                if (!var3_3) continue block16;
lbl82:
                // 2 sources

                v0 = var6_4 = hi.a("G", (int)(yt.a(13663, 8067329946992057436L) + yt.a(31330, 8790616771607253240L)), (int)yt.a(7266, 3735607551079757053L), (long)834203424483934088L) - yt.a(7521, 8544947727983686337L);
lbl83:
                // 2 sources

                if (!var3_3) continue block16;
lbl84:
                // 2 sources

                var6_4 = (reference)(hi.a("G", (int)(yt.a(22385, 3244650607582117403L) + yt.a(32348, 6841559380039489467L)), (int)yt.a(23903, 6767885349965263913L), (long)834203424483934088L) - yt.a(5945, 6448054911483723364L) ^ yt.a(24191, 2444552061776262414L));
                if (!var3_3) continue block16;
lbl86:
                // 2 sources

                v1 = var6_4 = (reference)((yt.a(11287, 1484492264300676577L) ^ yt.a(31153, 3445126490719605076L)) - yt.a(15374, 3917486693601416252L));
lbl87:
                // 2 sources

                if (!var3_3) continue block16;
lbl88:
                // 2 sources

                var6_4 = (reference)(((yt.a(7592, 2571801753231635476L) ^ yt.a(1327, 7923870255230889509L)) / yt.a(31232, 1824473493713408704L) ^ yt.a(10488, 8057964270146978049L)) + yt.a(29816, 4884771363208421280L));
                continue block16;
                case 815061393: 
            }
            break;
        }
        return super.mouseClicked((MouseButtonEvent)var4_5, var2_2);
    }

    private void J(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f2 = ((Float)objectArray[4]).floatValue();
        CallSite callSite = hi.a("\u00a5", (Object)((eh)object3), (long)721675246255933332L);
        float f3 = 0.48f;
        CallSite callSite2 = hi.a("\u00a5", (Object)((DF)object2), (Object)callSite, (float)f3, (long)1155556520700012610L);
        reference var10_10 = callSite2 + 10.0f;
        float f4 = f2 - 13.0f - 3.0f;
        float f5 = f4 + (13.0f - hi.a("\u00a5", (Object)((DF)object2), (float)f3, (long)470446160550961215L)) * 0.5f;
        yt.W("qOSlWGrPYqi1kjt7", J(float float float float float java.awt.Color ), (zU)((zU)object), (float)f, (float)f4, (float)var10_10, (float)13.0f, (float)6.5f, (Color)((Object)hi.a("j", (long)817827339599640798L)));
        hi.a("\u00a5", (Object)((zU)object), (Object)callSite, (float)(f + (var10_10 - callSite2) / 2.0f), (float)f5, (float)f3, (Object)hi.a("j", (long)433333639448026825L), (long)487875072643634565L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private void n(Object[] objectArray) {
        Object object;
        String string;
        block20: {
            Object object2;
            block19: {
                boolean bl;
                block23: {
                    block22: {
                        block21: {
                            bl = Dl.S();
                            object2 = yt.a(19052, 847050760703370683L) * yt.a(812, 7702390206514932291L) * yt.a(20009, 2961869824629597435L) + yt.a(17529, 2796228333625764866L);
                            if (bl) {
                                Object object3 = object2;
                                if (bl) {
                                    switch (object3) {
                                        default: {
                                            break;
                                        }
                                        case -2091293921: {
                                            object3 = hi.a("G", (int)1, (long)701518974625326203L);
                                        }
                                    }
                                }
                            }
                            string = yt.a(-26605, 7699);
                            if (!bl) break block21;
                            if (hi.a("\u00e9", (Object)((Object)this), (long)1303607583673849847L) == null) break block22;
                            object2 = hi.a("G", (int)yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)yt.a(14502, 7010627149874827328L), (int)yt.a(27128, 8778544139608965309L)), (int)yt.a(28404, 11319905813315916L), (long)834203424483934088L) - yt.a(24341, 4591842586416672906L);
                        }
                        if (bl) break block23;
                    }
                    object2 = (yt.a(8923, 7844778751966677597L) - yt.a(1111, 7009996017094994871L)) * yt.a(9135, 138021599577507935L) - yt.a(11740, 1648025750616671481L) + yt.a(27753, 2549601116768486729L);
                }
                block10: while (true) {
                    switch (object2) {
                        default: {
                            object = yt.a(-26603, 24769);
                            object2 = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(201, 6064127771774822930L) - yt.a(8049, 5005490323710456963L)), (int)yt.a(9180, 2236654525781543471L)) - yt.a(4765, 8925695217554733355L);
                            if (!bl) {
                                break block10;
                            }
                            break block19;
                        }
                        case -361517877: {
                            object = yt.W("qOSlWGrPYqi1kjt7", M(), (eh)((Object)hi.a("\u00e9", (Object)((Object)this), (long)1303607583673849847L)));
                            if (bl) break block10;
                            break block20;
                        }
                        case -361517876: {
                            hi.a("G", (int)0, (int)2, (long)1169154015991105135L);
                            object2 = hi.a("G", (int)yt.a(12284, 2503702583434348448L), (int)yt.a(2907, 8803251945647022377L), (long)834203424483934088L) + yt.a(32439, 3167090992169111879L) ^ yt.a(25180, 6535142502767512843L);
                            continue block10;
                        }
                    }
                    break;
                }
                object2 = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(26004, 5389562320974039670L) - yt.a(6548, 6523056707253744151L)), (int)yt.a(24190, 521945086767724202L)) - yt.a(28014, 1604425366133458917L);
            }
            block11: while (true) {
                switch (object2) {
                    default: {
                        break block11;
                    }
                    case 889957671: {
                        hi.a("G", (long)625190853617808643L);
                        hi.a("G", (long)1326027102069805806L);
                        object2 = (yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(29965, 2756097307862457653L) - yt.a(25536, 4024769743574452224L) ^ yt.a(16219, 6320764572130940145L)), (int)yt.a(1199, 1230689045776051941L)) ^ yt.a(29922, 168717758265679034L)) + yt.a(1639, 1901363015304064956L);
                        continue block11;
                    }
                }
                break;
            }
        }
        Object object4 = object;
        float f = 0.64f;
        float f2 = 0.56f;
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)592786035772032999L), (Object)string, (float)f, (long)665434286926928221L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)592786035772032999L), (Object)object4, (float)f2, (long)665434286926928221L);
        CallSite callSite3 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)592786035772032999L), (float)f, (long)441868902805229185L);
        CallSite callSite4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)592786035772032999L), (float)f2, (long)441868902805229185L);
        reference var11_12 = hi.a("G", (float)callSite, (float)callSite2, (long)1021203527991582354L) + 24.0f;
        float f3 = 32.0f;
        float f4 = 8.0f;
        float f5 = 3.0f;
        reference var15_16 = (hi.a("G", (long)1052312102167579273L) - var11_12) * 0.5f;
        float f6 = 22.0f;
        float f7 = f6 + (f3 - callSite3 - f5 - callSite4) * 0.5f;
        float f8 = f7 + callSite3 + f5;
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[]{yt.a(31232, 1824473493713408704L)}, (long)655585783115174022L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)615991602451078021L), (float)var15_16, (float)f6, (float)var11_12, (float)f3, (float)f4, (float)12.0f, (Object)hi.a("G", (Object)hi.a("j", (long)1292984830373578835L), (int)yt.a(30377, 1034296523778317984L), (long)950630386023407477L), (long)1008283404322600030L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)615991602451078021L), (float)var15_16, (float)f6, (float)var11_12, (float)f3, (float)f4, (Object)hi.a("G", (Object)hi.a("j", (long)762043382858456424L), (int)yt.a(30979, 2928242689485854407L), (long)950630386023407477L), (long)776507817655946365L);
        yt.W("qOSlWGrPYqi1kjt7", R(java.lang.String float float float java.awt.Color ), (zU)((Object)hi.a("\u00e9", (Object)((Object)this), (long)615991602451078021L)), (String)string, (float)(var15_16 + 12.0f), (float)f7, (float)f, (Color)((Object)hi.a("j", (long)692578069409858836L)));
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)615991602451078021L), (Object)object4, (float)(var15_16 + 12.0f), (float)f8, (float)f2, (Object)hi.a("j", (long)574625695807352444L), (long)487875072643634565L);
        hi.a("\u00a5", (Object)((Object)this), (long)786322989063051975L);
    }

    private void U(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        float f4 = ((Float)objectArray[4]).floatValue();
        Object object = objectArray[5];
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Consumer)object;
        objectArray2[1] = new ih(f, f2, f3, f4);
        objectArray2[0] = bl;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)615991602451078021L), (Object)objectArray2, (long)869042146772271573L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseReleased(MouseButtonEvent var1_1) {
        block12: {
            block15: {
                block14: {
                    block13: {
                        var2_2 = Dl.S();
                        var4_3 /* !! */  = hi.a("G", (int)((yt.a(9275, 6321432220526087568L) + yt.a(29922, 3042684512465903611L) ^ yt.a(17526, 5579083461824802239L)) / yt.a(22114, 6638916072089058465L)), (int)yt.a(26310, 2562284084168183499L), (long)834203424483934088L) - yt.a(4577, 7693255173571984910L);
                        if (!var2_2) ** GOTO lbl-1000
                        v0 = var4_3 /* !! */ ;
                        if (var2_2 == false) return (boolean)v0;
                        switch (v0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var3_4 = hi.a("G", (Object)var1_1, (long)387410669818340308L);
                                if (!var2_2) break block13;
                                if (hi.a("\u00e9", (Object)this, (long)1302971948309712589L) == null) break;
                                break block14;
                            }
                            case 1984200257: {
                                break block12;
                            }
                        }
                        var4_3 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)hi.a("G", (int)(yt.a(14702, 4652448131175551004L) / yt.a(6850, 2885134092015940205L)), (int)yt.a(31187, 4716471446143094802L), (long)834203424483934088L), (int)yt.a(5643, 3235329720134647733L)) + yt.a(267, 1747686789203503299L);
                    }
                    if (var2_2) break block15;
                }
                var4_3 /* !! */  = (reference)((yt.a(9293, 6320135936210406863L) + yt.a(16562, 4897008267183090342L)) / yt.a(10827, 6280435058699108403L) + yt.a(18156, 1644516535649364225L) ^ yt.a(30026, 2615529511009410341L));
                if (!var2_2) ** GOTO lbl42
            }
            block11: while (true) {
                switch (var4_3 /* !! */ ) {
                    default: {
                        v1 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)1304202693631103201L);
                        if (!var2_2) ** GOTO lbl43
                        if (v1 /* !! */  != false) ** GOTO lbl42
                        ** GOTO lbl44
                    }
                    case 80694364: {
                        hi.a("\u00f2", (Object)this, null, (long)1302971948309712589L);
                        hi.a("\u00f2", (Object)this, (vr)hi.a("G", (long)1098023335145461947L), (long)953386256987960056L);
                        return true;
                    }
                    case 80694363: {
                        if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) ** GOTO lbl46
                        ** GOTO lbl48
                    }
                    case 80694365: {
                        v2 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", b(double double int ), (iu)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (double)yt.W("qOSlWGrPYqi1kjt7", x(), (MouseButtonEvent)var3_4), (double)hi.a("\u00a5", (Object)var3_4, (long)1045026150751632794L), (int)hi.a("\u00a5", (Object)var3_4, (long)1304202693631103201L));
                        if (!var2_2) ** GOTO lbl51
                        if (v2 /* !! */  == false) ** GOTO lbl50
                        ** GOTO lbl52
                    }
                    case 80694360: {
                        break block12;
                    }
lbl42:
                    // 2 sources

                    v1 /* !! */  = var4_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)(yt.a(8687, 7768805162855532718L) / yt.a(6850, 2885134092015940205L)), (int)yt.a(14563, 2658965434578932351L), (long)834203424483934088L), (int)yt.a(17089, 8053758513277856101L), (long)834203424483934088L) + yt.a(5309, 8830518664939552338L);
lbl43:
                    // 2 sources

                    if (var2_2) continue block11;
lbl44:
                    // 2 sources

                    var4_3 /* !! */  = (reference)(yt.a(28056, 4247670396575597880L) / yt.a(12037, 7215152550726895101L) * yt.a(4180, 1416150126556527370L) - yt.a(19885, 8188804511125136886L) + yt.a(18293, 8347867146971999390L));
                    if (var2_2) continue block11;
lbl46:
                    // 2 sources

                    var4_3 /* !! */  = (reference)((yt.a(26519, 3025027417197989187L) - yt.a(22903, 7538157376306639225L)) * yt.a(5469, 101587909340478946L) * yt.a(4462, 8169261813148105287L) * yt.a(28589, 4099603138213168158L) ^ yt.a(23349, 270751904447033812L));
                    if (var2_2) continue block11;
lbl48:
                    // 2 sources

                    var4_3 /* !! */  = (reference)((yt.a(25351, 3351868418099137273L) ^ yt.a(23697, 8966873444992612310L)) / yt.a(23347, 7485131496861168259L) + yt.a(16744, 652966651539188005L));
                    if (var2_2) continue block11;
lbl50:
                    // 2 sources

                    v2 /* !! */  = var4_3 /* !! */  = (reference)((yt.a(21732, 6372278167401004893L) - yt.a(7987, 123740722601277343L)) * yt.a(26022, 38344329263009554L) * yt.a(32229, 598207894792590708L) * yt.a(19573, 7840477412293207234L) ^ yt.a(28589, 3398752949551350889L));
lbl51:
                    // 2 sources

                    if (var2_2) continue block11;
lbl52:
                    // 2 sources

                    var4_3 /* !! */  = (reference)(yt.a(17544, 9093809533964447650L) + yt.a(24852, 6599804005587209030L) + yt.a(16493, 999031797114661297L));
                    continue block11;
                    case 80694362: {
                        return true;
                    }
                    case 80694361: 
                }
                break;
            }
            return super.mouseReleased((MouseButtonEvent)var3_4);
        }
        hi.a("G", (long)1139342403621005073L);
        v0 = hi.a("G", (int)0, (long)1236006381065832221L);
        return (boolean)v0;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private vr o(Object[] var1_1) {
        block40: {
            block43: {
                block42: {
                    block41: {
                        var2_2 = var1_1[0];
                        var4_3 = ((Float)var1_1[1]).floatValue();
                        var3_4 = ((Float)var1_1[2]).floatValue();
                        var5_5 = Dl.t();
                        var22_6 /* !! */  = hi.a("G", (int)yt.a(1633, 892815013282491429L), (int)yt.a(9768, 5065179949227445799L), (long)834203424483934088L) + yt.a(11922, 6729649464985618152L) ^ yt.a(26261, 4235440068957457800L);
                        if (var5_5) ** GOTO lbl-1000
                        switch (var22_6 /* !! */ ) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var6_7 = hi.a("G", (long)1052312102167579273L);
                                var7_8 = hi.a("G", (long)1101389884075884739L);
                                var8_9 /* !! */  = var4_3;
                                var9_10 /* !! */  = var3_4;
                                var10_11 /* !! */  = NaNf;
                                var11_12 /* !! */  = NaNf;
                                var12_13 = hi.a("G", (float)var4_3, (long)400111314131951612L);
                                var13_14 = hi.a("G", (float)(var4_3 + hi.a("\u00e9", (Object)((eh)var2_2), (long)757761617965287585L) / 2.0f - var6_7 / 2.0f), (long)400111314131951612L);
                                var14_15 = hi.a("G", (float)(var4_3 + hi.a("\u00e9", (Object)((eh)var2_2), (long)757761617965287585L) - var6_7), (long)400111314131951612L);
                                var15_16 = var12_13;
                                var16_17 = 0;
                                v0 /* !! */  = var13_14 == var15_16 ? 0 : (var13_14 < var15_16 ? -1 : 1);
                                if (var5_5) break block41;
                                if (v0 /* !! */  >= 0) break;
                                break block42;
                            }
                            case -1312638576: {
                                throw null;
                            }
                        }
                        v0 /* !! */  = (reference)((yt.a(29573, 6126632466829072569L) / yt.a(4051, 5811331067696588479L) * yt.a(144, 5602014652303616398L) ^ yt.a(8606, 3528147376605694542L) ^ yt.a(5347, 2584809133077741204L)) + yt.a(32157, 2028180855235237553L));
                    }
                    var22_6 /* !! */  = (int)v0 /* !! */ ;
                    if (!var5_5) break block43;
                }
                var22_6 /* !! */  = (yt.a(15597, 8740153006638044466L) - yt.a(7124, 4076759386970993652L) + yt.a(17699, 2168218493981813450L)) / yt.a(10758, 4419487384925471317L) - yt.a(5847, 5187766674210896902L);
                if (!var5_5) break block43;
                ** GOTO lbl138
lbl36:
                // 2 sources

                while (true) {
                    v1 = var14_15 == var15_16 ? 0 : (var14_15 < var15_16 ? -1 : 1);
                    if (var5_5) ** GOTO lbl141
                    if (v1 >= 0) ** GOTO lbl140
                    ** GOTO lbl143
                    break;
                }
lbl41:
                // 2 sources

                while (true) {
                    cfr_temp_0 = var15_16 - 6.0f;
                    v2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (var5_5) ** GOTO lbl149
                    if (v2 > 0) ** GOTO lbl148
                    ** GOTO lbl151
                    break;
                }
lbl47:
                // 2 sources

                while (true) {
                    v3 = var16_17;
                    v4 = 1;
                    if (var5_5) ** GOTO lbl165
                    if (v3 != v4) ** GOTO lbl163
                    ** GOTO lbl167
                    break;
                }
lbl53:
                // 2 sources

                while (true) {
                    var8_9 /* !! */  = (float)(var6_7 - hi.a("\u00e9", (Object)((eh)var2_2), (long)757761617965287585L));
                    var10_11 /* !! */  = (float)var6_7;
                    if (!var5_5) ** GOTO lbl172
lbl57:
                    // 2 sources

                    while (true) {
                        block45: {
                            block44: {
                                var17_18 = hi.a("G", (float)var3_4, (long)400111314131951612L);
                                var18_19 = hi.a("G", (float)(var3_4 + hi.a("\u00e9", (Object)((eh)var2_2), (long)1164498346519456838L) / 2.0f - var7_8 / 2.0f), (long)400111314131951612L);
                                var19_20 = yt.W("qOSlWGrPYqi1kjt7", abs(float ), (float)(var3_4 + hi.a("\u00e9", (Object)((eh)var2_2), (long)1164498346519456838L) - var7_8));
                                var20_21 = var17_18;
                                var21_22 = 0;
                                v5 /* !! */  = var18_19 == var20_21 ? 0 : (var18_19 < var20_21 ? -1 : 1);
                                if (var5_5) break block44;
                                if (v5 /* !! */  < 0) break block45;
                                v5 /* !! */  = (reference)((yt.a(22058, 7791815116117966690L) ^ yt.a(31559, 3354195813828350805L)) / yt.a(7219, 846431463207711933L) ^ yt.a(3634, 6754210151100851347L));
                            }
                            var22_6 /* !! */  = (int)v5 /* !! */ ;
                            if (!var5_5) break block40;
                        }
                        var22_6 /* !! */  = hi.a("G", (int)yt.a(17177, 3648884493004958797L), (int)yt.a(17517, 766331795654601919L), (long)834203424483934088L) ^ yt.a(2101, 8186528346470130054L);
                        if (!var5_5) break block40;
                        ** GOTO lbl213
                        break;
                    }
                    break;
                }
lbl74:
                // 2 sources

                while (true) {
                    v6 /* !! */  = var19_20 == var20_21 ? 0 : (var19_20 < var20_21 ? -1 : 1);
                    if (var5_5) ** GOTO lbl216
                    if (v6 /* !! */  >= 0) ** GOTO lbl215
                    ** GOTO lbl218
                    break;
                }
lbl79:
                // 2 sources

                while (true) {
                    cfr_temp_1 = var20_21 - 6.0f;
                    v7 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                    if (var5_5) ** GOTO lbl223
                    if (v7 /* !! */  > 0) ** GOTO lbl222
                    ** GOTO lbl225
                    break;
                }
lbl85:
                // 2 sources

                while (true) {
                    v8 /* !! */  = var21_22;
                    v9 = 1;
                    if (var5_5) ** GOTO lbl235
                    if (v8 /* !! */  != v9) ** GOTO lbl233
                    ** GOTO lbl237
                    break;
                }
lbl91:
                // 2 sources

                while (true) {
                    var9_10 /* !! */  = (float)(var7_8 - hi.a("\u00e9", (Object)((eh)var2_2), (long)1164498346519456838L));
                    var11_12 /* !! */  = (float)var7_8;
                    if (var5_5) {
                        return new vr(var8_9 /* !! */ , var9_10 /* !! */ , var10_11 /* !! */ , var11_12 /* !! */ );
                    }
                    ** GOTO lbl241
                    break;
                }
            }
            while (true) {
                block51: {
                    block50: {
                        block49: {
                            block47: {
                                block48: {
                                    block46: {
                                        switch (var22_6 /* !! */ ) {
                                            default: {
                                                var15_16 = var13_14;
                                                var16_17 = 1;
                                                if (!var5_5) break;
                                                ** GOTO lbl36
                                            }
                                            case 1551104881: {
                                                ** continue;
                                            }
                                            case 1551104879: {
                                                var15_16 = var14_15;
                                                var16_17 = 2;
                                                if (!var5_5) break block46;
                                                ** GOTO lbl41
                                            }
                                            case 1551104886: {
                                                ** continue;
                                            }
                                            case 1551104888: {
                                                v10 = var16_17;
                                                if (var5_5) break block47;
                                                if (v10 != 0) break block48;
                                                break block49;
                                            }
                                            case 1551104878: {
                                                var8_9 /* !! */  = 0.0f;
                                                var10_11 /* !! */  = 0.0f;
                                                if (!var5_5) break block50;
                                                ** GOTO lbl47
                                            }
                                            case 1551104885: {
                                                ** continue;
                                            }
                                            case 1551104880: {
                                                var8_9 /* !! */  = (float)(var6_7 / 2.0f - hi.a("\u00e9", (Object)((eh)var2_2), (long)757761617965287585L) / 2.0f);
                                                var10_11 /* !! */  = (float)(var6_7 / 2.0f);
                                                if (!var5_5) break block51;
                                                ** GOTO lbl53
                                            }
                                            case 1551104882: {
                                                ** continue;
                                            }
                                            case 1551104884: {
                                                ** continue;
                                            }
                                            case 1551104883: {
                                                throw null;
                                            }
                                        }
lbl138:
                                        // 2 sources

                                        var22_6 /* !! */  = (yt.a(11618, 758874569211642978L) / yt.a(4051, 5811331067696588479L) * yt.a(11417, 6187286298062751448L) ^ yt.a(26725, 5838549179905687568L) ^ yt.a(5904, 7263158833648352939L)) + yt.a(4838, 243478271460194506L);
                                        if (!var5_5) continue;
lbl140:
                                        // 2 sources

                                        v1 = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(21931, 8450463296353894139L) * yt.a(6213, 4001445152926609466L)), (int)yt.a(22802, 3389603476356067745L)) - yt.a(24352, 8560906040022333187L);
lbl141:
                                        // 2 sources

                                        var22_6 /* !! */  = (int)v1;
                                        if (!var5_5) continue;
lbl143:
                                        // 2 sources

                                        var22_6 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)hi.a("G", (int)(yt.a(23070, 5226304316559389571L) * yt.a(12631, 7333114485575818971L)), (int)yt.a(19380, 8553926755738608684L), (long)834203424483934088L), (int)yt.a(25556, 7405355375594097594L)) ^ yt.a(9972, 4465926436759374882L);
                                        if (!var5_5) continue;
                                    }
                                    var22_6 /* !! */  = (int)(hi.a("G", (int)(yt.a(14529, 599933128508150711L) * yt.a(8074, 5987045046513643530L)), (int)yt.a(19410, 3222916426088210655L), (long)834203424483934088L) - yt.a(11334, 2519246263068886367L));
                                    if (!var5_5) continue;
lbl148:
                                    // 2 sources

                                    v2 = hi.a("G", (int)(yt.a(11044, 5170159483880080211L) + yt.a(2239, 1778841427326018029L) ^ yt.a(18768, 7270569965785212442L)), (int)yt.a(472, 2653819587319376302L), (long)834203424483934088L) - yt.a(32567, 7663476096434065660L);
lbl149:
                                    // 2 sources

                                    var22_6 /* !! */  = (int)v2;
                                    if (!var5_5) continue;
lbl151:
                                    // 2 sources

                                    var22_6 /* !! */  = yt.a(16181, 7265442832522811359L) + yt.a(2708, 6957112385584210186L) - yt.a(11022, 6297979994648018979L);
                                    if (!var5_5) continue;
                                }
                                v10 = var22_6 /* !! */  = (hi.a("G", (int)(yt.a(28888, 2466020037179726581L) / 3), (int)yt.a(25493, 9079969173059652493L), (long)834203424483934088L) + yt.a(29936, 6837494384729546620L)) / yt.a(25101, 399195519822940453L) ^ yt.a(26473, 2543959199447371094L);
                            }
                            if (!var5_5) continue;
                        }
                        var22_6 /* !! */  = (int)(hi.a("G", (int)yt.a(21574, 3083550460257238626L), (int)yt.a(29969, 4953264156067749787L), (long)834203424483934088L) + yt.a(307, 7492186020100778559L));
                        if (!var5_5) continue;
                    }
                    var22_6 /* !! */  = (int)(hi.a("G", (int)(yt.a(13315, 1531068734703476353L) + yt.a(23426, 2090180837553991959L) ^ yt.a(32006, 6522926217246561353L)), (int)yt.a(25367, 3939810356712655126L), (long)834203424483934088L) - yt.a(22991, 1501464284857988031L));
                    if (!var5_5) continue;
lbl163:
                    // 2 sources

                    v3 = yt.a(25099, 8007381660325759670L) / yt.a(6850, 2885134092015940205L) + yt.a(28532, 7629262878026548836L);
                    v4 = yt.a(14437, 517107586418610775L);
lbl165:
                    // 2 sources

                    var22_6 /* !! */  = v3 - v4;
                    if (!var5_5) continue;
lbl167:
                    // 2 sources

                    var22_6 /* !! */  = (yt.a(9800, 1742255371549871579L) - yt.a(10030, 1547407614987668655L) ^ yt.a(3272, 5430848518436103441L)) + yt.a(13648, 5996256156462194685L);
                    if (!var5_5) continue;
                }
                var22_6 /* !! */  = (int)(hi.a("G", (int)(yt.a(13315, 1531068734703476353L) + yt.a(23426, 2090180837553991959L) ^ yt.a(32006, 6522926217246561353L)), (int)yt.a(25367, 3939810356712655126L), (long)834203424483934088L) - yt.a(22991, 1501464284857988031L));
                if (!var5_5) continue;
lbl172:
                // 2 sources

                var22_6 /* !! */  = (int)(hi.a("G", (int)(yt.a(13315, 1531068734703476353L) + yt.a(23426, 2090180837553991959L) ^ yt.a(32006, 6522926217246561353L)), (int)yt.a(25367, 3939810356712655126L), (long)834203424483934088L) - yt.a(22991, 1501464284857988031L));
            }
        }
        block37: while (true) {
            switch (var22_6 /* !! */ ) {
                default: {
                    var20_21 = var18_19;
                    var21_22 = 1;
                    if (!var5_5) ** GOTO lbl213
                    ** GOTO lbl74
                }
                case 1978312303: {
                    ** continue;
                }
                case 1978312302: {
                    var20_21 = var19_20;
                    var21_22 = 2;
                    if (!var5_5) ** GOTO lbl220
                    ** GOTO lbl79
                }
                case 1978312305: {
                    ** continue;
                }
                case 1978312306: {
                    v11 = var21_22;
                    if (var5_5) ** GOTO lbl228
                    if (v11 != 0) ** GOTO lbl227
                    ** GOTO lbl229
                }
                case 1978312300: {
                    var9_10 /* !! */  = 0.0f;
                    var11_12 /* !! */  = 0.0f;
                    if (!var5_5) ** GOTO lbl231
                    ** GOTO lbl85
                }
                case 1978312298: {
                    ** continue;
                }
                case 1978312301: {
                    var9_10 /* !! */  = (float)(var7_8 / 2.0f - hi.a("\u00e9", (Object)((eh)var2_2), (long)1164498346519456838L) / 2.0f);
                    var11_12 /* !! */  = (float)(var7_8 / 2.0f);
                    if (!var5_5) ** GOTO lbl239
                    ** GOTO lbl91
                }
                case 1978312297: {
                    ** continue;
                }
                case 1978312299: {
                    throw null;
                }
lbl213:
                // 2 sources

                var22_6 /* !! */  = (yt.a(26220, 5332357302605138330L) ^ yt.a(24349, 427754164254830792L)) / yt.a(7219, 846431463207711933L) ^ yt.a(14951, 4731677980031750831L);
                if (!var5_5) continue block37;
lbl215:
                // 2 sources

                v6 /* !! */  = (reference)((hi.a("G", (int)yt.a(11051, 6468291835813298235L), (int)yt.a(635, 2755200329116821666L), (long)834203424483934088L) ^ yt.a(32086, 8465747549829715720L)) - yt.a(27768, 2974675880992687308L));
lbl216:
                // 2 sources

                var22_6 /* !! */  = (int)v6 /* !! */ ;
                if (!var5_5) continue block37;
lbl218:
                // 2 sources

                var22_6 /* !! */  = yt.a(14639, 8678851930726437817L) / yt.a(25101, 399195519822940453L) + yt.a(9792, 5618618291195874754L) - yt.a(10403, 4584250453491679396L);
                if (!var5_5) continue block37;
lbl220:
                // 2 sources

                var22_6 /* !! */  = (hi.a("G", (int)yt.a(8683, 4810861744029272161L), (int)yt.a(2581, 5841314581853675694L), (long)834203424483934088L) ^ yt.a(24409, 4736698184567157911L)) - yt.a(29705, 4704529879491861437L);
                if (!var5_5) continue block37;
lbl222:
                // 2 sources

                v7 /* !! */  = (reference)((yt.a(4271, 7525206986943871925L) * yt.a(656, 2063273668617906497L) + yt.a(19498, 3067046694373614734L) ^ yt.a(3359, 5990846401393207287L)) - yt.a(25491, 4623988706754546102L));
lbl223:
                // 2 sources

                var22_6 /* !! */  = (int)v7 /* !! */ ;
                if (!var5_5) continue block37;
lbl225:
                // 2 sources

                var22_6 /* !! */  = yt.a(17717, 8576195415369740080L) - yt.a(21246, 6014043196671359373L) - yt.a(13487, 8557727255008320360L) + yt.a(22241, 8810118614320282875L);
                if (!var5_5) continue block37;
lbl227:
                // 2 sources

                v11 = var22_6 /* !! */  = yt.a(25424, 5866647426745814003L) - yt.a(9364, 4927766447582383635L) - yt.a(3954, 3265783675099915421L);
lbl228:
                // 2 sources

                if (!var5_5) continue block37;
lbl229:
                // 2 sources

                var22_6 /* !! */  = yt.a(21570, 2229935659391745769L) + yt.a(30975, 5953876879821164804L) + yt.a(29577, 4569677220311128511L);
                if (!var5_5) continue block37;
lbl231:
                // 2 sources

                var22_6 /* !! */  = (yt.a(12428, 7110391578980620691L) * yt.a(21270, 5257755044930387143L) + yt.a(1191, 6785485301134634056L) ^ yt.a(4511, 645298582070573670L)) - yt.a(19019, 6938919622257566575L);
                if (!var5_5) continue block37;
lbl233:
                // 2 sources

                v8 /* !! */  = (int)(hi.a("G", (int)yt.a(6586, 5163616832125907319L), (int)yt.a(29386, 711942514477391201L), (long)834203424483934088L) / yt.a(10758, 4419487384925471317L) / yt.a(10758, 4419487384925471317L));
                v9 = yt.a(17261, 2360419455738243662L);
lbl235:
                // 2 sources

                var22_6 /* !! */  = v8 /* !! */  ^ v9;
                if (!var5_5) continue block37;
lbl237:
                // 2 sources

                var22_6 /* !! */  = (hi.a("G", (int)yt.a(13442, 3689675102536966130L), (int)yt.a(16659, 8060067090228144354L), (long)834203424483934088L) ^ yt.a(11022, 2643018381810106549L)) + yt.a(22889, 1078561444824544991L) - yt.a(21904, 5181245931181178133L);
                if (!var5_5) continue block37;
lbl239:
                // 2 sources

                var22_6 /* !! */  = (yt.a(12428, 7110391578980620691L) * yt.a(21270, 5257755044930387143L) + yt.a(1191, 6785485301134634056L) ^ yt.a(4511, 645298582070573670L)) - yt.a(19019, 6938919622257566575L);
                if (!var5_5) continue block37;
lbl241:
                // 2 sources

                var22_6 /* !! */  = (yt.a(12428, 7110391578980620691L) * yt.a(21270, 5257755044930387143L) + yt.a(1191, 6785485301134634056L) ^ yt.a(4511, 645298582070573670L)) - yt.a(19019, 6938919622257566575L);
                continue block37;
                case 1978312304: 
            }
            break;
        }
        return new vr(var8_9 /* !! */ , var9_10 /* !! */ , var10_11 /* !! */ , var11_12 /* !! */ );
    }

    protected void init() {
        hi.a("\u00a5", (Object)hi.a("j", (long)549148920996267385L), (Object)new Object[0], (long)1122854488301310367L);
        hi.a("\u00a5", (Object)((Object)this), (Object)new Object[0], (long)1333350219999690541L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)606438669286401880L), (Object)new Object[]{true}, (long)636467708964734443L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)606438669286401880L), (Object)new Object[]{true}, (long)882705255860052915L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)((Object)this), (long)606438669286401880L), (Object)new Object[]{Float.valueOf((float)hi.a("\u00a5", (Object)((Object)this), (long)1295034926075292245L))}, (long)1280299986488197532L);
        yt.W("qOSlWGrPYqi1kjt7", w(), (iu)((Object)hi.a("\u00e9", (Object)((Object)this), (long)606438669286401880L)));
    }

    private void q(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        yt yt2 = this;
        hi.a("\u00f2", (Object)((Object)yt2), (int)(hi.a("\u00e9", (Object)((Object)yt2), (long)951524135517732280L) + n), (long)951524135517732280L);
        hi.a("\u00f2", (Object)((Object)this), (zU)new zU(), (long)615991602451078021L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void E(Object[] var1_1) {
        block14: {
            var5_2 = var1_1[0];
            var3_3 = ((Float)var1_1[1]).floatValue();
            var4_4 = ((Float)var1_1[2]).floatValue();
            var2_5 = ((Boolean)var1_1[3]).booleanValue();
            var6_6 = Dl.t();
            var8_7 = yt.a(8052, 6539795335979677326L) * yt.a(30862, 8924781699558297988L) / yt.a(4051, 5811331067696588479L) * yt.a(8498, 3566038884091824409L) * yt.a(14256, 4813097764380515674L) ^ yt.a(15903, 3733577470891922504L);
            if (!var6_6) ** GOTO lbl19
            block8: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = var2_5;
                            if (var6_6) break block15;
                            if (v0 != 0) break block16;
                            v0 = yt.a(18886, 741963940707033157L) + yt.a(30169, 3883468012606544455L) - yt.a(13915, 57274523973753894L);
                        }
                        var8_7 = v0;
                        if (!var6_6) break block17;
                    }
                    var8_7 = yt.a(13452, 6975324367867256761L) / 4 - yt.a(24593, 7385757855787305983L);
                }
                switch (var8_7) {
                    default: {
                        continue block8;
                    }
                    case -416795662: {
                        v1 = new Object[3];
                        v1[2] = Float.valueOf(var4_4);
                        v1[1] = Float.valueOf(var3_3);
                        v1[0] = (eh)var5_2;
                        v2 = hi.a("\u00a5", (Object)this, (Object)v1, (long)811546325804245172L);
                        var8_7 = (yt.a(28034, 7352294252757009540L) + yt.a(14941, 6392047079953667025L) ^ yt.a(24528, 2544738954184816187L)) - yt.a(3373, 4609354971406837608L);
                        if (var6_6) {
                            break block8;
                        }
                        break block14;
                    }
                    case -416795660: {
                        v2 = new vr(var3_3, var4_4, NaNf, NaNf);
                        if (!var6_6) break block8;
                        ** GOTO lbl-1000
                    }
                    case -416795661: {
                        return;
                    }
                }
                break;
            }
            var8_7 = (yt.a(3564, 6850862683641815562L) + yt.a(28898, 7936389504306634587L) ^ yt.a(1076, 5087691385183940185L)) - yt.a(30575, 7609486183962730335L);
        }
        switch (var8_7) {
            default: lbl-1000:
            // 2 sources

            {
                var7_8 = v2;
                hi.a("\u00f2", (Object)this, (vr)var7_8, (long)953386256987960056L);
                v3 = new Object[2];
                v3[1] = Float.valueOf((float)yt.W("qOSlWGrPYqi1kjt7", Nt(), (vr)var7_8));
                v3[0] = Float.valueOf((float)yt.W("qOSlWGrPYqi1kjt7", NM(), (vr)var7_8));
                hi.a("\u00a5", (Object)((eh)var5_2), (Object)v3, (long)388085152640050469L);
                return;
            }
            case -324795415: 
        }
        hi.a("G", (long)703609663147646272L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean L(Object[] var1_1) {
        block50: {
            block54: {
                block53: {
                    block52: {
                        block51: {
                            block48: {
                                block49: {
                                    block47: {
                                        var2_2 = var1_1[0];
                                        var3_3 = Dl.S();
                                        var5_4 /* !! */  = yt.a(8267, 4862518343775455793L) - yt.a(12219, 4450411518747739464L) + yt.a(2771, 6692729655233356003L) ^ yt.a(29672, 2663777909529205007L);
                                        if (var3_3) break block47;
lbl6:
                                        // 2 sources

                                        while (true) {
                                            if (hi.a("\u00e9", (Object)this, (long)1303607583673849847L) != null) {
                                                var5_4 /* !! */  = (int)(hi.a("G", (int)(yt.a(22621, 323353246360072704L) + yt.a(5797, 8868389693238787446L)), (int)yt.a(11976, 8221111577139480574L), (long)834203424483934088L) + yt.a(7684, 4796936389353026728L) - yt.a(24097, 1533904319165691193L));
                                                if (var3_3) break block47;
                                            }
                                            var5_4 /* !! */  = yt.a(5272, 6611376303507029062L) * yt.a(8289, 6836825404087765511L) + yt.a(26779, 3687510760423311217L) - yt.a(6909, 4908820101503955802L) ^ yt.a(6567, 6011263200432926867L);
                                            if (var3_3) break block47;
                                            ** GOTO lbl65
                                            break;
                                        }
lbl13:
                                        // 2 sources

                                        while (true) {
                                            var4_5 = v0;
                                            v1 /* !! */  = hi.a("\u00a5", (Object)((KeyEvent)var2_2), (long)1074920233927690084L);
                                            if (var3_3) {
                                                switch (v1 /* !! */ ) {
                                                    case 259: {
                                                        var5_4 /* !! */  = yt.a(21147, 2935926783281035903L) * yt.a(12837, 6208222309577038115L) * yt.a(9308, 7017246752188763710L) + yt.a(27001, 6742968159069225246L) + yt.a(24036, 4019249151607370334L);
                                                        if (var3_3) break block48;
                                                    }
                                                    case 260: {
                                                        var5_4 /* !! */  = (yt.a(5641, 4960766607509305819L) ^ yt.a(15757, 3288041336220914281L) ^ yt.a(28447, 2668925088395118444L) ^ yt.a(15154, 7136963112271843454L)) + yt.a(23593, 9126753131182716652L) ^ yt.a(2224, 5762935465847857996L);
                                                        if (var3_3) break block48;
                                                    }
                                                    case 261: {
                                                        var5_4 /* !! */  = yt.a(16764, 8895883061883726401L) * yt.a(32394, 8236167018259568440L) * yt.a(15500, 1013610365576091506L) + yt.a(9957, 2676239521729809615L) + yt.a(24425, 5801605088887961054L);
                                                        if (var3_3) break block48;
                                                    }
                                                    case 262: {
                                                        var5_4 /* !! */  = (int)(hi.a("G", (int)(yt.a(31178, 257859248764113390L) * yt.a(1802, 8710356363967737004L)), (int)yt.a(9966, 4453412270342279108L), (long)834203424483934088L) - yt.a(21145, 7456137122252749186L) - yt.a(1712, 867423222125047068L));
                                                        if (var3_3) break block48;
                                                    }
                                                    case 263: {
                                                        var5_4 /* !! */  = (int)(hi.a("G", (int)yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)yt.a(6875, 8560474938633531602L), (int)yt.a(14581, 8391310895692190670L)), (int)yt.a(9395, 3101649444236004418L), (long)834203424483934088L) / yt.a(15456, 5898204230380820181L) * yt.a(28661, 7944146407589430921L) + yt.a(17771, 7098549663589133403L));
                                                        if (var3_3) break block48;
                                                    }
                                                    case 264: {
                                                        var5_4 /* !! */  = (yt.a(1364, 7629618141087969024L) ^ yt.a(14464, 1234008796844757656L) ^ yt.a(5119, 7197415628496779982L)) + yt.a(21667, 939641561285656362L) - yt.a(28034, 3956006866290590726L) - yt.a(9711, 454007693992463825L);
                                                        if (var3_3) break block48;
                                                    }
                                                    case 265: {
                                                        var5_4 /* !! */  = (yt.a(27485, 143653184224673966L) ^ yt.a(32114, 7963322882716488398L) ^ yt.a(29284, 6949863154637560499L) ^ yt.a(14208, 531608910252613380L)) * yt.a(5432, 458730821923651030L) ^ yt.a(17813, 7876789104503483406L);
                                                        if (var3_3) ** break;
                                                        break;
                                                    }
                                                }
                                                v1 /* !! */  = (CallSite)((yt.a(1429, 4190193182013075371L) ^ yt.a(7646, 7316224240382719369L) ^ yt.a(319, 2824020337003572092L) ^ yt.a(30722, 2399899914409300877L)) + yt.a(12957, 1043721559048494392L) ^ yt.a(25086, 6995141491519244632L));
                                            }
                                            var5_4 /* !! */  = (int)v1 /* !! */ ;
                                            break block48;
                                            break;
                                        }
                                    }
                                    block32: while (true) {
                                        switch (var5_4 /* !! */ ) {
                                            default: {
                                                ** continue;
                                            }
                                            case -13872336: {
                                                v2 = yt.W("qOSlWGrPYqi1kjt7", hasShiftDown(), (KeyEvent)((KeyEvent)var2_2));
                                                if (!var3_3) ** GOTO lbl66
                                                if (v2 == false) ** GOTO lbl65
                                                ** GOTO lbl68
                                            }
                                            case -13872338: {
                                                v0 = 10.0f;
                                                var5_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)yt.a(9516, 1286187285634550849L), (int)yt.a(5931, 5473613153519747052L), (long)834203424483934088L) + yt.a(17695, 1135601157505314450L) ^ yt.a(3370, 2964023552884254129L)), (int)yt.a(25723, 2016961815537110356L), (long)834203424483934088L) ^ yt.a(21864, 7919463479009738151L);
                                                if (var3_3) break block49;
                                                ** GOTO lbl70
                                            }
                                            case -13872339: {
                                                v0 = 1.0f;
                                                if (var3_3) ** GOTO lbl70
                                                ** GOTO lbl13
                                            }
                                            case -13872335: {
                                                throw null;
                                            }
lbl65:
                                            // 2 sources

                                            v2 = hi.a("G", (int)(yt.a(540, 627459727748475415L) - yt.a(5947, 5421144802769420149L) + yt.a(8324, 3563519712545935167L)), (int)yt.a(4205, 4127112746068064346L), (long)834203424483934088L) + yt.a(13061, 6526624774343170861L);
lbl66:
                                            // 2 sources

                                            var5_4 /* !! */  = (int)v2;
                                            if (var3_3) continue block32;
lbl68:
                                            // 2 sources

                                            var5_4 /* !! */  = yt.a(24588, 9223017019148323109L) / 3 * yt.a(15891, 7976995968198841664L) - yt.a(26962, 8757159733472380555L);
                                            continue block32;
lbl70:
                                            // 2 sources

                                            var5_4 /* !! */  = hi.a("G", (int)(hi.a("G", (int)yt.a(779, 5568982385212926278L), (int)yt.a(10019, 6324843355864731506L), (long)834203424483934088L) + yt.a(505, 4116333611083213366L) ^ yt.a(19698, 4133916423072638887L)), (int)yt.a(31764, 1339917958952375583L), (long)834203424483934088L) ^ yt.a(20179, 9046639228483266048L);
                                            break block49;
                                            case -13872340: 
                                        }
                                        break;
                                    }
                                    return false;
                                }
                                while (true) {
                                    switch (var5_4 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 271996409: 
                                    }
                                    hi.a("G", (long)1264004642033370356L);
                                    hi.a("G", (int)yt.a(31232, 1824473493713408704L), (int)0, (long)735288420341019222L);
                                    var5_4 /* !! */  = yt.a(15188, 3678094230168965400L) / 4 * yt.a(7215, 3022997307525706965L) - yt.a(14325, 2055292334142692712L) + yt.a(20906, 5759687868601792934L);
                                }
                            }
                            block34: while (true) {
                                switch (var5_4 /* !! */ ) {
                                    default: {
                                        v3 = new Object[4];
                                        v3[3] = false;
                                        v3[2] = Float.valueOf((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)423210454345410312L));
                                        v3[1] = Float.valueOf((float)(hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)934067547881438154L) - var4_5));
                                        v3[0] = hi.a("\u00e9", (Object)this, (long)1303607583673849847L);
                                        hi.a("\u00a5", (Object)this, (Object)v3, (long)1302310740085720628L);
                                        v4 = true;
                                        var5_4 /* !! */  = yt.a(16935, 8112724047267653867L) + yt.a(12787, 8350695164172933694L) ^ yt.a(17369, 3153359854966336216L);
                                        if (!var3_3) {
                                            break block34;
                                        }
                                        break block50;
                                    }
                                    case 899320833: {
                                        v5 = new Object[4];
                                        v5[3] = false;
                                        v5[2] = Float.valueOf((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)423210454345410312L));
                                        v5[1] = Float.valueOf((float)(hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)934067547881438154L) + var4_5));
                                        v5[0] = hi.a("\u00e9", (Object)this, (long)1303607583673849847L);
                                        hi.a("\u00a5", (Object)this, (Object)v5, (long)1302310740085720628L);
                                        v4 = true;
                                        break block34;
                                    }
                                    case 899320830: {
                                        v6 = new Object[4];
                                        v6[3] = false;
                                        v6[2] = Float.valueOf((float)(hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)423210454345410312L) - var4_5));
                                        v6[1] = Float.valueOf((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)934067547881438154L));
                                        v6[0] = hi.a("\u00e9", (Object)this, (long)1303607583673849847L);
                                        hi.a("\u00a5", (Object)this, (Object)v6, (long)1302310740085720628L);
                                        v4 = true;
                                        break block51;
                                    }
                                    case 899320829: {
                                        v7 = new Object[4];
                                        v7[3] = false;
                                        v7[2] = Float.valueOf((float)(hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)423210454345410312L) + var4_5));
                                        v7[1] = Float.valueOf((float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (long)934067547881438154L));
                                        v7[0] = hi.a("\u00e9", (Object)this, (long)1303607583673849847L);
                                        hi.a("\u00a5", (Object)this, (Object)v7, (long)1302310740085720628L);
                                        v4 = true;
                                        break block52;
                                    }
                                    case 899320835: {
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1303607583673849847L), (boolean)false, (long)1197894287238472871L);
                                        hi.a("\u00f2", (Object)this, null, (long)1303607583673849847L);
                                        v4 = true;
                                        break block53;
                                    }
                                    case 899320834: {
                                        v4 = false;
                                        if (!var3_3) {
                                            return v4;
                                        }
                                        break block54;
                                    }
                                    case 899320831: {
                                        hi.a("G", (long)889012284371480360L);
                                        hi.a("G", (float)-15.0f, (long)391647354171730378L);
                                        var5_4 /* !! */  = ((yt.a(3653, 6632970126617912452L) + yt.a(11594, 5099333963233756815L)) / yt.a(25101, 399195519822940453L) ^ yt.a(21836, 7108162622885134070L)) - yt.a(12857, 3344476220083837710L);
                                        continue block34;
                                    }
                                }
                                break;
                            }
                            var5_4 /* !! */  = yt.a(32349, 7931149238924006875L) + yt.a(13408, 491064761457646621L) ^ yt.a(23530, 5501214049080078459L);
                            if (var3_3) break block50;
                        }
                        var5_4 /* !! */  = yt.a(32349, 7931149238924006875L) + yt.a(13408, 491064761457646621L) ^ yt.a(23530, 5501214049080078459L);
                        if (var3_3) break block50;
                    }
                    var5_4 /* !! */  = yt.a(32349, 7931149238924006875L) + yt.a(13408, 491064761457646621L) ^ yt.a(23530, 5501214049080078459L);
                    if (var3_3) break block50;
                }
                var5_4 /* !! */  = yt.a(32349, 7931149238924006875L) + yt.a(13408, 491064761457646621L) ^ yt.a(23530, 5501214049080078459L);
                if (var3_3) break block50;
            }
            var5_4 /* !! */  = yt.a(32349, 7931149238924006875L) + yt.a(13408, 491064761457646621L) ^ yt.a(23530, 5501214049080078459L);
        }
        block35: while (true) {
            switch (var5_4 /* !! */ ) {
                case -154810897: {
                    hi.a("G", (long)1058499983070318781L);
                    hi.a("G", (long)672565527819449937L);
                    var5_4 /* !! */  = (hi.a("G", (int)yt.a(27544, 7482682001344807891L), (int)yt.a(25439, 3474736052881247252L), (long)834203424483934088L) * yt.a(9424, 7980875086403702056L) ^ yt.a(25405, 2231970500202252647L)) - yt.a(18961, 5160714570203488450L);
                    continue block35;
                }
            }
            break;
        }
        return v4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void extractBackground(GuiGraphicsExtractor var1_1, int var2_2, int var3_3, float var4_4) {
        block11: {
            block10: {
                block13: {
                    block12: {
                        var5_5 = Dl.S();
                        var6_6 /* !! */  = yt.a(22647, 4661515885096694076L) - yt.a(26590, 8459035918258753042L) - yt.a(30719, 6176658366781250757L);
                        if (var5_5) break block12;
lbl4:
                        // 2 sources

                        while (hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)579320878743283099L), (long)430579852159213241L) == null) {
                            break block10;
                        }
                        break block13;
lbl7:
                        // 1 sources

                        while (true) {
                            hi.a("\u00a5", (Object)this, (Object)var1_1, (float)var4_4, (long)1023625214553839376L);
                            if (!var5_5) lbl-1000:
                            // 2 sources

                            {
                                return;
                            }
                            break block11;
                            break;
                        }
                    }
lbl14:
                    // 4 sources

                    while (true) {
                        switch (var6_6 /* !! */ ) {
                            default: {
                                ** GOTO lbl4
                            }
                            case -75776812: {
                                ** continue;
                            }
                            case -75776811: {
                                ** continue;
                            }
                            case -75776810: 
                        }
                        hi.a("G", (long)542784839547465897L);
                        var6_6 /* !! */  = (int)(yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(32730, 1459157053241448277L) / yt.a(7219, 846431463207711933L)), (int)yt.a(3049, 655341631645524463L)) + yt.a(24319, 2292146847543097300L));
                        if (var5_5) continue;
                        break;
                    }
                }
                var6_6 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)yt.a(25942, 1452633586010377489L), (int)yt.a(7356, 3053454387701954164L), (long)834203424483934088L) / yt.a(6850, 2885134092015940205L)), (int)yt.a(14016, 4643730259940122610L), (long)834203424483934088L) + yt.a(19809, 6759183053541173183L));
                if (var5_5) ** GOTO lbl14
            }
            var6_6 /* !! */  = (yt.a(32122, 6572227232916657896L) + yt.a(1159, 7219311926141234538L) ^ yt.a(13255, 8764792376385739009L)) + yt.a(22339, 3968228827581742442L) ^ yt.a(14765, 2443013350056727324L);
            if (var5_5) ** GOTO lbl14
        }
        var6_6 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)yt.a(2608, 7532580077446439252L), (int)yt.a(31008, 4953646944484151625L), (long)834203424483934088L) / yt.a(6850, 2885134092015940205L)), (int)yt.a(11329, 5369247080822441239L), (long)834203424483934088L) + yt.a(15332, 5180769797591634583L));
        ** while (true)
    }

    private yt() {
        super((Component)yt.W("qOSlWGrPYqi1kjt7", literal(java.lang.String ), (String)yt.a(-26601, 24582)));
        hi.a("\u00f2", (Object)((Object)this), (int)-1, (long)674648282472168837L);
        hi.a("\u00f2", (Object)((Object)this), (vr)((Object)hi.a("G", (long)1098023335145461947L)), (long)953386256987960056L);
        this.X = hi.a("G", (long)1215511131780764219L);
        this.n = new yP(this);
        this.K = new Ow((l5)((Object)hi.a("j", (long)791229020891128130L)));
    }

    private float t() {
        return (float)hi.a("G", (float)(hi.a("G", (long)1101389884075884739L) * 0.72f), (float)350.0f, (long)971000971621905228L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void R(Object[] var1_1) {
        block41: {
            block40: {
                block39: {
                    var2_2 = (Integer)var1_1[0];
                    var3_3 = (Integer)var1_1[1];
                    var4_4 = Dl.S();
                    var16_5 /* !! */  = yt.a(27817, 8991791141138712144L) - yt.a(21624, 5607129131934285112L) ^ yt.a(20487, 6442381337923582035L) ^ yt.a(9200, 1127583182580681791L);
                    if (var4_4) break block39;
                    ** GOTO lbl-1000
                }
                switch (var16_5 /* !! */ ) {
                    case -942276278: lbl-1000:
                    // 2 sources

                    {
                        hi.a("G", (long)659151967568421102L);
                        break;
                    }
                }
                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)new Object[]{Float.valueOf((float)yt.W("qOSlWGrPYqi1kjt7", t(), (yt)this))}, (long)1280299986488197532L);
                v0 = hi.a("\u00e9", (Object)this, (long)606438669286401880L);
                v1 = this;
                v2 = hi.a("\u00e9", (Object)v1, (long)875277367856533730L) + true;
                hi.a("\u00f2", (Object)v1, (int)v2, (long)875277367856533730L);
                yt.W("qOSlWGrPYqi1kjt7", D(int ), (iu)v0, (int)v2);
                var5_6 = 24.0f;
                var6_7 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)990997589210472802L);
                cfr_temp_0 = var6_7 - 0.001f;
                v3 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                if (!var4_4) break block40;
                if (v3 /* !! */  > 0) break block41;
                v3 /* !! */  = (reference)(((yt.a(31608, 7871982765346706221L) ^ yt.a(4800, 8959661126195427693L)) + yt.a(26030, 4501623550541090100L)) * yt.a(24879, 8767381443316697543L) + yt.a(25170, 6548672835523823881L));
            }
            var16_5 /* !! */  = (int)v3 /* !! */ ;
            if (var4_4) ** GOTO lbl81
        }
        var16_5 /* !! */  = (yt.a(21505, 6845087365007507050L) ^ yt.a(10199, 4494362689224347317L)) / yt.a(7219, 846431463207711933L) - yt.a(22823, 2300080179956052427L);
        ** GOTO lbl81
lbl34:
        // 3 sources

        while (true) {
            block43: {
                block42: {
                    v4 = new Object[6];
                    v4[5] = (Consumer<zU>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$drawPanel$0(com.github.epsilon.zU ), (Lcom/github/epsilon/zU;)V)((yt)this);
                    v4[4] = Float.valueOf((float)(var10_11 + var5_6 * 2.0f));
                    v4[3] = Float.valueOf((float)(yt.W("qOSlWGrPYqi1kjt7", f(), (iu)hi.a("\u00e9", (Object)this, (long)606438669286401880L)) + var5_6 * 2.0f));
                    v4[2] = Float.valueOf((float)(yt.W("qOSlWGrPYqi1kjt7", T(), (iu)hi.a("\u00e9", (Object)this, (long)606438669286401880L)) - var5_6));
                    v4[1] = Float.valueOf((float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)975517958870901414L) - var5_6));
                    v4[0] = v5;
                    hi.a("\u00a5", (Object)this, (Object)v4, (long)489669824513283803L);
                    hi.a("\u00a5", (Object)this, (long)786322989063051975L);
                    var11_12 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)824051474199580471L);
                    var12_13 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)806192178544601716L);
                    var13_14 = yt.W("qOSlWGrPYqi1kjt7", T(), (iu)hi.a("\u00e9", (Object)this, (long)606438669286401880L)) + var10_11;
                    var14_15 = hi.a("G", (float)var12_13, (float)(var13_14 - var11_12), (long)971000971621905228L);
                    cfr_temp_1 = var14_15 - 0.5f;
                    v6 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                    if (!var4_4) break block42;
                    if (v6 /* !! */  > 0) break block43;
                    v6 /* !! */  = (reference)(hi.a("G", (int)hi.a("G", (int)yt.a(30947, 7642815615494641582L), (int)yt.a(14458, 5948021952804065814L), (long)834203424483934088L), (int)yt.a(6526, 6973989870820176895L), (long)834203424483934088L) ^ yt.a(17634, 5541717412017073980L));
                }
                var16_5 /* !! */  = (int)v6 /* !! */ ;
                if (var4_4) ** GOTO lbl137
            }
            var16_5 /* !! */  = yt.a(15833, 1820348676862218812L) / 4 - yt.a(10989, 5291963617321157520L);
            if (var4_4) ** GOTO lbl137
            if (true) ** GOTO lbl169
            break;
        }
        block25: while (true) {
            block38: {
                block45: {
                    block44: {
                        var15_16 = v7;
                        v8 = new Object[6];
                        v8[5] = (Consumer<zU>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$drawPanel$1(int int com.github.epsilon.zU ), (Lcom/github/epsilon/zU;)V)((yt)this, (int)var2_2, (int)var3_3);
                        v8[4] = Float.valueOf((float)var14_15);
                        v8[3] = Float.valueOf((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)1260495607849894898L));
                        v8[2] = Float.valueOf((float)var11_12);
                        v8[1] = Float.valueOf((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)975517958870901414L));
                        v8[0] = var15_16;
                        hi.a("\u00a5", (Object)this, (Object)v8, (long)489669824513283803L);
                        hi.a("\u00a5", (Object)this, (long)786322989063051975L);
                        if (!var4_4) break block44;
                        var16_5 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)hi.a("G", (int)yt.a(29030, 708914332138756807L), (int)yt.a(1428, 2176026237683117754L), (long)834203424483934088L), (int)yt.a(22445, 4801581843974061729L)) ^ yt.a(14819, 8239315105692225657L);
                        if (var4_4) break block45;
                        ** GOTO lbl80
                    }
lbl76:
                    // 2 sources

                    while (true) {
                        block52: {
                            block51: {
                                block50: {
                                    block49: {
                                        block48: {
                                            block47: {
                                                block46: {
                                                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)975517958870901414L), (float)var8_9, (long)1056483459672017518L);
                                                    if (!var4_4) {
                                                        return;
                                                    }
lbl80:
                                                    // 3 sources

                                                    var16_5 /* !! */  = ((yt.a(8035, 4410279897525073396L) ^ yt.a(31691, 2218628036631876247L)) + yt.a(20023, 35970565592737475L)) * yt.a(18343, 423572956623826319L) + yt.a(14940, 8411652991511827173L);
lbl81:
                                                    // 3 sources

                                                    switch (var16_5 /* !! */ ) {
                                                        default: {
                                                            var7_8 = (1.0f - var6_7) * 10.0f;
                                                            var8_9 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)1183567479019984898L);
                                                            yt.W("qOSlWGrPYqi1kjt7", z(float float ), (iu)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)975517958870901414L), (float)(var8_9 - var7_8));
                                                            var9_10 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (long)719817058672322083L);
                                                            var10_11 = var9_10 * var6_7;
                                                            hi.a("\u00a5", (Object)this, (Object)new Object[]{yt.a(31232, 1824473493713408704L)}, (long)655585783115174022L);
                                                            cfr_temp_2 = var6_7 - 1.0f;
                                                            v9 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                                            if (!var4_4) break block46;
                                                            if (v9 >= 0) break;
                                                            break block47;
                                                        }
                                                        case 380312143: {
                                                            return;
                                                        }
                                                        case 380312145: {
                                                            throw null;
                                                        }
                                                    }
                                                    v9 = hi.a("G", (int)yt.a(27055, 8862486515900072685L), (int)yt.a(13969, 452615147642985833L), (long)834203424483934088L) - yt.a(21942, 6916592477018947177L) - yt.a(7290, 4187132318576227423L);
                                                }
                                                var16_5 /* !! */  = (int)v9;
                                                if (var4_4) break block48;
                                            }
                                            var16_5 /* !! */  = hi.a("G", (int)(yt.a(5799, 2549815572575108992L) / yt.a(4051, 5811331067696588479L)), (int)yt.a(21594, 1440319708571664346L), (long)834203424483934088L) ^ yt.a(14465, 1940586854077011794L);
                                        }
                                        v5 = var16_5 /* !! */ ;
                                        if (!var4_4) break block49;
                                        switch (v5) {
                                            default: {
                                                v5 = true;
                                                break;
                                            }
                                            case -970517707: {
                                                v5 = false;
                                                if (var4_4) break block50;
                                                ** GOTO lbl34
                                            }
                                            case -970517708: {
                                                throw null;
                                            }
                                        }
                                    }
                                    var16_5 /* !! */  = yt.a(6503, 6309528320482817743L) / yt.a(28081, 6409172708747396195L) + yt.a(10930, 577619358535713339L) ^ yt.a(16918, 8701158650896050879L);
                                    if (var4_4) break block51;
                                }
                                var16_5 /* !! */  = yt.a(21654, 9019127205780717345L) / yt.a(28081, 6409172708747396195L) + yt.a(7970, 4066143171661969125L) ^ yt.a(16596, 6312979229069109756L);
                            }
                            v10 = var16_5 /* !! */ ;
                            if (!var4_4) break block52;
                            switch (v10) {
                                default: {
                                    ** GOTO lbl34
                                }
                                case 925679086: 
                            }
                            v10 = false;
                        }
                        hi.a("G", (boolean)v10, (long)1315516439304393687L);
                        ** continue;
                        break;
                    }
                }
                block27: while (true) {
                    block57: {
                        block55: {
                            block56: {
                                block54: {
                                    block53: {
                                        switch (var16_5 /* !! */ ) {
                                            default: {
                                                hi.a("\u00a5", (Object)this, (Object)new Object[]{yt.a(31232, 1824473493713408704L)}, (long)655585783115174022L);
                                                cfr_temp_3 = var6_7 - 1.0f;
                                                v11 /* !! */  = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                                if (!var4_4) break block53;
                                                if (v11 /* !! */  < 0) break;
                                                break block54;
                                            }
                                            case -1928557093: {
                                                v12 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", O(), (iu)hi.a("\u00e9", (Object)this, (long)606438669286401880L));
                                                if (!var4_4) break block55;
                                                if (v12 /* !! */  == false) break block56;
                                                break block57;
                                            }
                                            case -1928557096: {
                                                v7 = true;
                                                var16_5 /* !! */  = ((yt.a(31257, 1709180264348570100L) ^ yt.a(4306, 2719409536418430871L)) / 3 ^ yt.a(1610, 1509390268642111249L)) * yt.a(30023, 4342685371004410507L) + yt.a(20118, 3543299323834852586L);
                                                if (!var4_4) {
                                                    break block27;
                                                }
                                                break block38;
                                            }
                                            case -1928557097: {
                                                v7 = false;
                                                if (var4_4) break block27;
                                                continue block25;
                                            }
                                            case -1928557094: {
                                                ** continue;
                                            }
                                            case -1928557095: {
                                                hi.a("G", (long)1288142874633235773L);
                                                var16_5 /* !! */  = yt.a(25731, 1358244479971674893L) + yt.a(26065, 2108471210182627192L) - yt.a(10877, 125492044624756871L);
                                                continue block27;
                                            }
                                        }
lbl169:
                                        // 2 sources

                                        v11 /* !! */  = (reference)(hi.a("G", (int)(yt.a(11414, 8001486972405220180L) - yt.a(30681, 7828308262889805973L) + yt.a(15382, 1757862006860552118L) ^ yt.a(12308, 3627864152584854014L)), (int)yt.a(32691, 886996172007364350L), (long)834203424483934088L) ^ yt.a(30163, 3198536337186445832L));
                                    }
                                    var16_5 /* !! */  = (int)v11 /* !! */ ;
                                    if (var4_4) continue;
                                }
                                var16_5 /* !! */  = (int)(yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(22242, 3383446313413738463L) - yt.a(552, 7849014972910086837L)), (int)yt.a(18812, 762285870012785567L)) + yt.a(12046, 1917905524959053581L));
                                if (var4_4) continue;
                            }
                            v12 /* !! */  = (CallSite)(yt.a(32685, 2134402596804712111L) / 4 + yt.a(12979, 2103355044209072604L));
                        }
                        var16_5 /* !! */  = (int)v12 /* !! */ ;
                        if (var4_4) continue;
                    }
                    var16_5 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(29506, 7334636726988134717L) - yt.a(19108, 6807811315471639277L) + yt.a(20555, 7791089097144891395L) ^ yt.a(4208, 4881427977995893014L)), (int)yt.a(4144, 1688794165637363936L)) ^ yt.a(3094, 718673565601834639L);
                }
                var16_5 /* !! */  = ((yt.a(27716, 3010300359471907929L) ^ yt.a(20192, 4207626723556910672L)) / 3 ^ yt.a(32158, 2808230630731863970L)) * yt.a(11162, 5117264884286751740L) + yt.a(12413, 1920245942421265196L);
            }
            switch (var16_5 /* !! */ ) {
                default: {
                    continue block25;
                }
                case -1267420970: 
            }
            break;
        }
        throw null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private eh c(Object[] var1_1) {
        block26: {
            block25: {
                var3_2 = (Double)var1_1[0];
                var5_3 = (Double)var1_1[1];
                var2_4 = ((Boolean)var1_1[2]).booleanValue();
                var7_5 = Dl.t();
                var11_6 /* !! */  = hi.a("G", (int)(yt.a(20076, 6135008633967142239L) + yt.a(3740, 3243723597684778737L) ^ yt.a(31753, 2795076375108769710L)), (int)yt.a(24427, 5888082883295541207L), (long)834203424483934088L) - yt.a(21461, 4014930337135065273L);
                if (!var7_5) break block25;
lbl8:
                // 2 sources

                while (true) {
                    block28: {
                        block27: {
                            v0 = var2_4;
                            if (var7_5) break block27;
                            if (v0 == 0) break block28;
                            v0 = yt.a(12577, 8132508837272656351L) - yt.a(4965, 3269260213941746499L) - yt.a(24642, 5573691896780443531L);
                        }
                        var11_6 /* !! */  = (reference)v0;
                        if (!var7_5) break block25;
                    }
                    var11_6 /* !! */  = (reference)(yt.a(24424, 6030558403255628002L) * yt.a(27692, 6128696834094155640L) + yt.a(22149, 4019016626695012210L) + yt.a(24446, 967925923531454090L) ^ yt.a(23486, 7520679025253478873L));
                    if (!var7_5) break block25;
                    ** GOTO lbl60
                    break;
                }
lbl20:
                // 2 sources

                while (true) {
                    v1 /* !! */  = var9_8;
                    if (var7_5) ** GOTO lbl67
                    if (v1 /* !! */  < 0) ** GOTO lbl66
                    ** GOTO lbl68
                    break;
                }
lbl25:
                // 2 sources

                while (true) {
                    v2 = new Object[2];
                    v2[1] = var5_3;
                    v2[0] = var3_2;
                    v3 /* !! */  = hi.a("\u00a5", (Object)var10_9, (Object)v2, (long)618468722838929503L);
                    if (var7_5) ** GOTO lbl112
                    if (v3 /* !! */  == false) ** GOTO lbl111
                    ** GOTO lbl113
                    break;
                }
            }
            block20: while (true) {
                switch (var11_6 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case 1064592862: {
                        v4 = new Object[2];
                        v4[1] = var5_3;
                        v4[0] = var3_2;
                        v5 /* !! */  = hi.a("\u00a5", (Object)this, (Object)v4, (long)514545044111118713L);
                        if (var7_5) ** GOTO lbl61
                        if (v5 /* !! */  == false) ** GOTO lbl60
                        ** GOTO lbl62
                    }
                    case 1064592861: {
                        var8_7 = hi.a("\u00a5", (Object)hi.a("j", (long)728001790887212699L), (Object)new Object[0], (long)921838225654585516L);
                        var9_8 = hi.a("\u00a5", (Object)var8_7, (long)417939159730395915L) - true;
                        if (!var7_5) ** GOTO lbl64
                        ** GOTO lbl20
                    }
                    case 1064592859: {
                        hi.a("G", (long)801548298614655873L);
                        hi.a("G", (long)437292628650123400L);
                        return null;
                    }
lbl60:
                    // 2 sources

                    v5 /* !! */  = var11_6 /* !! */  = (reference)(yt.a(5237, 7111255144013282296L) - yt.a(17781, 8322151036871207566L) - yt.a(15316, 8306016784620294541L));
lbl61:
                    // 2 sources

                    if (!var7_5) continue block20;
lbl62:
                    // 2 sources

                    var11_6 /* !! */  = (reference)(hi.a("G", (int)yt.a(3140, 9177494762654278813L), (int)yt.a(10952, 5158742184021033468L), (long)834203424483934088L) + yt.a(18637, 6236042509567746221L) ^ yt.a(5657, 6039436425791781300L));
                    continue block20;
lbl64:
                    // 1 sources

                    var11_6 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(16624, 537164170491456290L) + yt.a(13997, 3429347110840114601L) - yt.a(22487, 6476395011392601154L)), (int)yt.a(21456, 870334419927039044L)) - yt.a(23144, 4860733368261538686L);
                    if (!var7_5) break block26;
lbl66:
                    // 2 sources

                    v1 /* !! */  = var11_6 /* !! */  = (reference)((yt.a(29812, 354342003961880552L) + yt.a(8284, 4948337265346644236L) ^ yt.a(30872, 8254703736107717025L)) * yt.a(24066, 2700561470454428999L) ^ yt.a(20249, 2212361564896814988L) ^ yt.a(13913, 3440223680439950963L));
lbl67:
                    // 2 sources

                    if (!var7_5) break block26;
lbl68:
                    // 2 sources

                    var11_6 /* !! */  = (reference)(yt.a(23888, 2072200518504281944L) / yt.a(6850, 2885134092015940205L) - yt.a(14161, 3935847552421535359L));
                    break block26;
                    case 1064592858: 
                }
                break;
            }
            return null;
        }
        while (true) {
            block29: {
                switch (var11_6 /* !! */ ) {
                    default: {
                        ** continue;
                    }
                    case -1416817028: {
                        var10_9 = (eh)hi.a("\u00a5", (Object)var8_7, (int)var9_8, (long)516183098926246296L);
                        v6 /* !! */  = hi.a("\u00a5", (Object)var10_9, (long)1099153674733698693L);
                        if (var7_5) ** GOTO lbl87
                        if (v6 /* !! */  != false) ** GOTO lbl86
                        ** GOTO lbl88
                    }
                    case -1416817025: {
                        throw null;
                    }
lbl86:
                    // 1 sources

                    v6 /* !! */  = var11_6 /* !! */  = (reference)(yt.a(1026, 7478195871563984832L) / yt.a(6850, 2885134092015940205L) / yt.a(31232, 1824473493713408704L) + yt.a(16988, 7480037660465949566L) - yt.a(546, 5681392742841953664L) ^ yt.a(9064, 5473131643332463094L));
lbl87:
                    // 2 sources

                    if (!var7_5) break block29;
lbl88:
                    // 2 sources

                    var11_6 /* !! */  = (reference)(hi.a("G", (int)yt.a(29075, 5276347155468507980L), (int)yt.a(22562, 9197655563238338659L), (long)834203424483934088L) / 2 ^ yt.a(19013, 7074989214025672176L));
                    if (!var7_5) break block29;
                    ** GOTO lbl109
                    case -1416817026: 
                }
                return null;
            }
            block22: do lbl-1000:
            // 4 sources

            {
                switch (var11_6 /* !! */ ) {
                    default: {
                        if (!var7_5) break;
                        ** GOTO lbl25
                    }
                    case -1954048978: {
                        ** continue;
                    }
                    case -1954048977: {
                        return var10_9;
                    }
                    case -1954048980: {
                        --var9_8;
                        if (!var7_5) break block22;
                        return null;
                    }
                    case -1954048979: {
                        return null;
                    }
                }
lbl109:
                // 2 sources

                var11_6 /* !! */  = (reference)(((yt.a(22794, 4561987557793984603L) ^ yt.a(13696, 6791881650312191225L)) * yt.a(20906, 3515651215392864978L) ^ yt.a(16205, 5192106176088249412L) ^ yt.a(11656, 5117119447464445655L)) + yt.a(32201, 4993196169637025670L));
                if (!var7_5) ** GOTO lbl-1000
lbl111:
                // 2 sources

                v3 /* !! */  = var11_6 /* !! */  = (reference)(((yt.a(28361, 7850277117010362690L) ^ yt.a(30551, 4279294468381006028L)) * yt.a(28022, 2816765213420667612L) ^ yt.a(3868, 3444620584305008840L) ^ yt.a(1960, 3091463820930625375L)) + yt.a(18313, 1627215405117206316L));
lbl112:
                // 2 sources

                if (!var7_5) ** GOTO lbl-1000
lbl113:
                // 2 sources

                var11_6 /* !! */  = (reference)(yt.a(32682, 846692968262195145L) * yt.a(1364, 3312098857381310429L) * yt.a(11621, 5905154410478274347L) - yt.a(5323, 2220284134709476721L) ^ yt.a(2619, 1277111682461671538L));
            } while (!var7_5);
            var11_6 /* !! */  = hi.a("G", (int)(yt.a(16163, 4587960441307764330L) + yt.a(22057, 4911531817632825092L) - yt.a(27792, 7186076512853705832L)), (int)yt.a(15726, 376758633590199512L), (long)834203424483934088L) - yt.a(1965, 2063889897802673789L);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean mouseDragged(MouseButtonEvent var1_1, double var2_2, double var4_3) {
        block13: {
            block12: {
                block11: {
                    var6_4 = Dl.t();
                    var12_5 = yt.a(4104, 992087765849063248L) + yt.a(14404, 994244116001296720L) ^ yt.a(21206, 1203001949368482540L);
                    if (var6_4) ** GOTO lbl-1000
                    v0 = var12_5;
                    if (var6_4 != false) return (boolean)v0;
                    switch (v0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var7_6 = hi.a("G", (Object)var1_1, (long)387410669818340308L);
                            if (var6_4) break block11;
                            if (hi.a("\u00e9", (Object)this, (long)1302971948309712589L) == null) break;
                            break block12;
                        }
                        case -654139796: {
                            yt.W("qOSlWGrPYqi1kjt7", q());
                            return (boolean)1;
                        }
                    }
                    var12_5 = (yt.a(27660, 612270233558533006L) ^ yt.a(32627, 7119717435360466123L)) + yt.a(26532, 971774382575865731L);
                }
                if (!var6_4) break block13;
            }
            var12_5 = yt.a(29691, 6641579082379647671L) + yt.a(19487, 586560176040371690L) - yt.a(996, 5578154703563172859L);
            if (var6_4) ** GOTO lbl53
        }
        block9: while (true) {
            switch (var12_5 ? 1 : 0) {
                default: {
                    var8_7 = hi.a("G", (double)hi.a("\u00a5", (Object)var1_1, (long)1321164245525494063L), (long)1273198203909826830L);
                    var10_8 = hi.a("G", (double)yt.W("qOSlWGrPYqi1kjt7", y(), (MouseButtonEvent)var1_1), (long)1327728264718092753L);
                    v1 = new Object[4];
                    v1[3] = true;
                    v1[2] = Float.valueOf((float)var10_8 - hi.a("\u00e9", (Object)this, (long)631399249667459864L));
                    v1[1] = Float.valueOf((float)var8_7 - hi.a("\u00e9", (Object)this, (long)687610466452657847L));
                    v1[0] = hi.a("\u00e9", (Object)this, (long)1302971948309712589L);
                    hi.a("\u00a5", (Object)this, (Object)v1, (long)1302310740085720628L);
                    return true;
                }
                case 875192429: {
                    if (hi.a("\u00e9", (Object)this, (long)606438669286401880L) == null) ** GOTO lbl53
                    ** GOTO lbl55
                }
                case 875192427: {
                    v2 = new Object[2];
                    v2[1] = (double)hi.a("G", (double)hi.a("\u00a5", (Object)var1_1, (long)1045026150751632794L), (long)1327728264718092753L);
                    v2[0] = (double)hi.a("G", (double)hi.a("\u00a5", (Object)var1_1, (long)1321164245525494063L), (long)1273198203909826830L);
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)606438669286401880L), (Object)v2, (long)858345346840207195L);
                    if (var6_4) {
                        return super.mouseDragged((MouseButtonEvent)var7_6, (double)hi.a("G", (double)var2_2, (long)1273198203909826830L), (double)hi.a("G", (double)var4_3, (long)1327728264718092753L));
                    }
                    ** GOTO lbl57
                }
                case 875192430: {
                    hi.a("G", (long)877399517904373040L);
                    return (boolean)hi.a("G", (int)-1, (long)759451198843871681L);
                }
lbl53:
                // 2 sources

                var12_5 = yt.a(4498, 2186231265402042664L) - yt.a(26774, 6123395466843210247L) - yt.a(22658, 4570664254891422256L) ^ yt.a(14126, 7984707165143375811L);
                if (!var6_4) continue block9;
lbl55:
                // 2 sources

                var12_5 = yt.a(8330, 5625687118591332171L) * yt.a(29675, 5164375432623053503L) - yt.a(28292, 7227895026341463142L);
                if (!var6_4) continue block9;
lbl57:
                // 2 sources

                var12_5 = yt.a(22186, 5712020452787059907L) - yt.a(10367, 3197652557728055770L) - yt.a(29069, 5405234682003742329L) ^ yt.a(17094, 9171824543782955847L);
                continue block9;
                case 875192426: 
            }
            break;
        }
        return super.mouseDragged((MouseButtonEvent)var7_6, (double)hi.a("G", (double)var2_2, (long)1273198203909826830L), (double)hi.a("G", (double)var4_3, (long)1327728264718092753L));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void y(Object[] var1_1) {
        block53: {
            block52: {
                block54: {
                    block55: {
                        block51: {
                            block62: {
                                block50: {
                                    block59: {
                                        block56: {
                                            var2_2 = (Integer)var1_1[0];
                                            var3_3 = (Integer)var1_1[1];
                                            var4_4 = Dl.S();
                                            var16_5 /* !! */  = yt.a(16843, 2907150416029118018L) / yt.a(4051, 5811331067696588479L) ^ yt.a(13813, 4687297257594199380L);
                                            if (!var4_4) ** GOTO lbl-1000
                                            switch (var16_5 /* !! */ ) {
                                                default: lbl-1000:
                                                // 2 sources

                                                {
                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1333350219999690541L);
                                                    var5_6 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)728001790887212699L), (Object)new Object[0], (long)921838225654585516L), (long)1240653736693366367L);
                                                    if (var4_4) break;
                                                    break block56;
                                                }
                                                case -301547090: {
                                                    throw null;
                                                }
                                            }
                                            var16_5 /* !! */  = ((yt.a(31250, 552738278304010453L) ^ yt.a(13472, 2201866038216694902L)) + yt.a(19905, 3242335236148192901L)) / yt.a(4051, 5811331067696588479L) ^ yt.a(27788, 6885761812978582791L);
                                            if (var4_4) ** GOTO lbl36
                                            ** GOTO lbl24
                                        }
lbl20:
                                        // 2 sources

                                        while (true) {
                                            block58: {
                                                block57: {
                                                    v0 = yt.W("qOSlWGrPYqi1kjt7", hasNext(), (Iterator)var5_6);
                                                    if (!var4_4) break block57;
                                                    if (v0 != false) break block58;
lbl24:
                                                    // 2 sources

                                                    v0 = hi.a("G", (int)yt.a(10961, 2818444024727700799L), (int)yt.a(22413, 8530975075594928019L), (long)834203424483934088L) - yt.a(14088, 8757967429887041261L);
                                                }
                                                var16_5 /* !! */  = (int)v0;
                                                if (var4_4) ** GOTO lbl36
                                            }
                                            var16_5 /* !! */  = (hi.a("G", (int)yt.a(28498, 1574662488733270202L), (int)yt.a(5823, 4824220893516938372L), (long)834203424483934088L) + yt.a(8255, 816350883470478012L)) * yt.a(26858, 9120088112934306163L) ^ yt.a(3667, 8652076820101702107L) ^ yt.a(20209, 104986701618046569L);
                                            if (true) ** GOTO lbl36
                                            break;
                                        }
                                        block35: while (true) {
                                            var6_8 = (eh)hi.a("\u00a5", (Object)var5_6, (long)470012372636416268L);
                                            hi.a("\u00a5", (Object)var6_8, (Object)new Object[0], (long)1123491312995262364L);
                                            if (!var4_4) break;
                                            var16_5 /* !! */  = ((yt.a(1883, 5465786220215840721L) ^ yt.a(12923, 479258377769523612L)) + yt.a(12156, 4204994579637798634L)) / yt.a(4051, 5811331067696588479L) ^ yt.a(28752, 1480851412028709298L);
lbl36:
                                            // 4 sources

                                            switch (var16_5 /* !! */ ) {
                                                default: {
                                                    ** continue;
                                                }
                                                case 378540680: {
                                                    hi.a("G", (long)1264004642033370356L);
                                                    yt.W("qOSlWGrPYqi1kjt7", p());
                                                    continue block35;
                                                }
                                                case 378540681: {
                                                    continue block35;
                                                }
                                                case 378540679: 
                                            }
                                            break;
                                        }
                                        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)502996981711719326L);
                                        hi.a("\u00f2", (Object)this, (lm)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)477459963365500240L), (Object)hi.a("j", (long)882827338724254838L), (long)530968903561563099L), (long)676734129948172895L);
                                        hi.a("\u00f2", (Object)this, (int)yt.a(3101, 2973550479123425108L), (long)951524135517732280L);
                                        var5_7 = hi.a("G", (long)1052312102167579273L);
                                        var6_9 = yt.W("qOSlWGrPYqi1kjt7", M());
                                        hi.a("\u00a5", (Object)this, (Object)new Object[]{yt.a(31232, 1824473493713408704L)}, (long)655585783115174022L);
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)615991602451078021L), (float)0.0f, (float)0.0f, (float)var5_7, (float)var6_9, (Object)hi.a("G", (Object)hi.a("j", (long)1028544513022896375L), (int)yt.a(7895, 5307950165399090511L), (long)950630386023407477L), (long)941115194411145692L);
                                        hi.a("\u00a5", (Object)this, (long)786322989063051975L);
                                        var7_10 = var5_7 / 2.0f;
                                        var8_11 = var6_9 / 2.0f;
                                        var9_12 = yt.W("qOSlWGrPYqi1kjt7", t(java.awt.Color int ), (Color)hi.a("j", (long)787573419855687315L), (int)yt.a(19786, 660144337523500701L));
                                        hi.a("\u00a5", (Object)this, (Object)new Object[]{yt.a(31232, 1824473493713408704L)}, (long)655585783115174022L);
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)615991602451078021L), (float)(var7_10 - 0.5f), (float)0.0f, (float)1.0f, (float)var6_9, (Object)var9_12, (long)941115194411145692L);
                                        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)615991602451078021L), (float)0.0f, (float)(var8_11 - 0.5f), (float)var5_7, (float)1.0f, (Object)var9_12, (long)941115194411145692L);
                                        v1 = new Object[3];
                                        v1[2] = Float.valueOf((float)var6_9);
                                        v1[1] = Float.valueOf((float)var5_7);
                                        v1[0] = hi.a("\u00e9", (Object)this, (long)615991602451078021L);
                                        hi.a("\u00a5", (Object)this, (Object)v1, (long)485106573407803801L);
                                        yt.W("qOSlWGrPYqi1kjt7", Z(), (yt)this);
                                        hi.a("\u00a5", (Object)this, (Object)new Object[]{yt.a(28519, 2397213818034308315L)}, (long)655585783115174022L);
                                        var10_13 = hi.a("\u00a5", (Object)hi.a("j", (long)728001790887212699L), (Object)new Object[0], (long)921838225654585516L);
                                        v2 = new Object[3];
                                        v2[2] = true;
                                        v2[1] = (double)var3_3;
                                        v2[0] = (double)var2_2;
                                        var11_14 = hi.a("\u00a5", (Object)this, (Object)v2, (long)1255479385100548196L);
                                        var12_15 = hi.a("\u00a5", (Object)var10_13, (long)1240653736693366367L);
                                        if (!var4_4) break block59;
                                        var16_5 /* !! */  = (yt.a(16858, 5633076254937312062L) * yt.a(22976, 3067866813500616726L) - yt.a(7375, 7109786696251093779L)) * yt.a(31530, 825147668130714158L) / 4 + yt.a(20464, 8539321845756290299L);
                                        if (var4_4) break block50;
                                        ** GOTO lbl86
                                    }
lbl82:
                                    // 2 sources

                                    while (true) {
                                        block61: {
                                            block60: {
                                                v3 /* !! */  = hi.a("\u00a5", (Object)var12_15, (long)984088978567310565L);
                                                if (!var4_4) break block60;
                                                if (v3 /* !! */  != false) break block61;
lbl86:
                                                // 2 sources

                                                v3 /* !! */  = (CallSite)((yt.a(18336, 5860900890560753136L) + yt.a(7254, 2603396216621675655L)) / yt.a(25101, 399195519822940453L) - yt.a(10556, 2287904558892712815L));
                                            }
                                            var16_5 /* !! */  = (int)v3 /* !! */ ;
                                            if (var4_4) break block50;
                                        }
                                        var16_5 /* !! */  = (int)(yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)hi.a("G", (int)(yt.a(28167, 8162687992920851504L) + yt.a(16803, 1142667660881913893L)), (int)yt.a(7531, 7617163155651736315L), (long)834203424483934088L), (int)yt.a(12720, 3895540598792592232L)) + yt.a(15846, 6667944681714980602L) + yt.a(7539, 371559664688215608L));
                                        break block50;
                                        break;
                                    }
lbl93:
                                    // 2 sources

                                    while (var13_16 == hi.a("\u00e9", (Object)this, (long)1303607583673849847L)) {
                                        break block51;
                                    }
                                    break block62;
lbl96:
                                    // 2 sources

                                    while (true) {
                                        block70: {
                                            block69: {
                                                block68: {
                                                    block67: {
                                                        block66: {
                                                            block65: {
                                                                block64: {
                                                                    block63: {
                                                                        var14_17 = v4;
                                                                        if (!var4_4) break block63;
                                                                        if (var13_16 == var11_14) break block64;
                                                                        var16_5 /* !! */  = (hi.a("G", (int)hi.a("G", (int)hi.a("G", (int)yt.a(12442, 1263024919721287531L), (int)yt.a(29778, 8897298607059557371L), (long)834203424483934088L), (int)yt.a(27906, 1462311426203961248L), (long)834203424483934088L), (int)yt.a(4697, 729836069001902784L), (long)834203424483934088L) ^ yt.a(21932, 7253464395420073223L)) - yt.a(8563, 5354172728416733808L);
                                                                    }
                                                                    if (var4_4) break block65;
                                                                }
                                                                var16_5 /* !! */  = (int)(hi.a("G", (int)((yt.a(10851, 6534003921414881414L) * yt.a(6832, 503589339285697274L) ^ yt.a(32367, 1248801486954648641L)) - yt.a(28734, 7833418127538772054L)), (int)yt.a(17883, 5881646376799660602L), (long)834203424483934088L) - yt.a(19876, 2968729277255869674L));
                                                            }
                                                            v5 = var16_5 /* !! */ ;
                                                            if (!var4_4) break block66;
                                                            switch (v5) {
                                                                default: {
                                                                    v5 = true;
                                                                    break;
                                                                }
                                                                case 809188265: {
                                                                    v5 = false;
                                                                    if (var4_4) break block67;
                                                                    ** GOTO lbl-1000
                                                                }
                                                                case 809188263: {
                                                                    hi.a("G", (long)561066160558538168L);
                                                                    hi.a("G", (long)889012284371480360L);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        var16_5 /* !! */  = ((hi.a("G", (int)yt.a(20987, 2884535986051152154L), (int)yt.a(1430, 8154093187325308152L), (long)834203424483934088L) - yt.a(6422, 9181361143406342840L)) * yt.a(14769, 5183088904012240460L) ^ yt.a(32411, 2476753457180006165L)) - yt.a(22480, 6199108367854632730L);
                                                        if (var4_4) break block68;
                                                    }
                                                    var16_5 /* !! */  = ((hi.a("G", (int)yt.a(10052, 6544332343265955460L), (int)yt.a(31980, 7341574520108799868L), (long)834203424483934088L) - yt.a(5709, 3187142014448483355L)) * yt.a(7970, 3441128257630254337L) ^ yt.a(22611, 7110576815722754214L)) - yt.a(10561, 290876206974140899L);
                                                }
                                                switch (var16_5 /* !! */ ) {
                                                    default: lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var15_18 = v5;
                                                        v6 = var14_17;
                                                        if (!var4_4) break block69;
                                                        if (v6) break;
                                                        break block70;
                                                    }
                                                    case -304412395: {
                                                        return;
                                                    }
                                                }
                                                v6 = var16_5 /* !! */  = yt.a(21815, 2356908370587647994L) - yt.a(13172, 6480963591979407484L) + yt.a(14123, 4256147408506724092L) - yt.a(7790, 7663391447725192319L);
                                            }
                                            if (var4_4) break block52;
                                        }
                                        var16_5 /* !! */  = (int)(hi.a("G", (int)(yt.a(4014, 6671539426864342589L) - yt.a(5024, 2238521517783038896L) + yt.a(24451, 3941804988181836808L)), (int)yt.a(17823, 7731942283057163551L), (long)834203424483934088L) + yt.a(32361, 2381132097940869573L) + yt.a(28218, 973057071821046974L));
                                        if (var4_4) break block52;
                                        ** GOTO lbl244
                                        break;
                                    }
lbl142:
                                    // 2 sources

                                    while (true) {
                                        yt.W("qOSlWGrPYqi1kjt7", J(java.lang.Object java.lang.Object java.lang.Object boolean boolean ), (yt)this, (Object)hi.a("\u00e9", (Object)this, (long)615991602451078021L), (Object)hi.a("\u00e9", (Object)this, (long)1011787142149536499L), (Object)var13_16, (boolean)var14_17, (boolean)var15_18);
                                        if (var4_4) break block53;
                                        ** GOTO lbl175
                                        break;
                                    }
                                }
lbl147:
                                // 3 sources

                                block40: while (true) {
                                    v4 = var16_5 /* !! */ ;
                                    while (true) {
                                        block74: {
                                            block73: {
                                                block72: {
                                                    block71: {
                                                        switch (v4) {
                                                            default: {
                                                                ** continue;
                                                            }
                                                            case 1048191330: {
                                                                var13_16 = (eh)hi.a("\u00a5", (Object)var12_15, (long)470012372636416268L);
                                                                v7 /* !! */  = hi.a("\u00a5", (Object)var13_16, (long)1099153674733698693L);
                                                                if (!var4_4) break block71;
                                                                if (v7 /* !! */  != false) break;
                                                                break block72;
                                                            }
                                                            case 1048191328: {
                                                                break block73;
                                                            }
                                                            case 1048191329: {
                                                                hi.a("G", (long)1124891203117124897L);
                                                                yt.W("qOSlWGrPYqi1kjt7", U(float float int ), (float)1.0f, (float)-15.0f, (int)2);
                                                                return;
                                                            }
                                                        }
                                                        v7 /* !! */  = (CallSite)(yt.a(3621, 363673062768748331L) * yt.a(18996, 4347463481111864771L) - yt.a(23766, 6486017397344105917L));
                                                    }
                                                    var16_5 /* !! */  = (int)v7 /* !! */ ;
                                                    if (var4_4) break block74;
                                                }
                                                var16_5 /* !! */  = yt.W("qOSlWGrPYqi1kjt7", max(int int ), (int)(yt.a(2048, 5774605538508874535L) * yt.a(31697, 1516052856372908037L)), (int)yt.a(22719, 7499802597957366240L)) ^ yt.a(18313, 5186591609652539086L);
                                                if (var4_4) break block74;
                                                ** GOTO lbl204
                                            }
                                            hi.a("\u00a5", (Object)this, (long)786322989063051975L);
                                            hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)492906868870049201L);
                                            v8 = new Object[2];
                                            v8[1] = var3_3;
                                            v8[0] = var2_2;
                                            hi.a("\u00a5", (Object)this, (Object)v8, (long)363242700163840109L);
                                            return;
                                        }
lbl184:
                                        // 3 sources

                                        while (true) {
                                            switch (var16_5 /* !! */ ) {
                                                default: {
                                                    if (var4_4) break;
                                                    ** GOTO lbl93
                                                }
                                                case -1171666677: {
                                                    ** GOTO lbl93
                                                }
                                                case -1171666679: {
                                                    v4 = true;
                                                    var16_5 /* !! */  = yt.a(20027, 6393842467513328998L) - yt.a(14418, 8715228436732613098L) + yt.a(7243, 4968523375774872568L);
                                                    if (var4_4) break block54;
                                                    break block55;
                                                }
                                                case -1171666678: {
                                                    v4 = false;
                                                    if (var4_4) break block55;
                                                    ** GOTO lbl96
                                                }
                                                case -1171666676: {
                                                    hi.a("G", (long)1220332909359061582L);
                                                    return;
                                                }
                                            }
lbl204:
                                            // 2 sources

                                            var16_5 /* !! */  = (yt.a(29331, 8581129566952478901L) * yt.a(25617, 6211652698101993287L) - yt.a(1231, 1012690573447769307L)) * yt.a(8171, 3516041327958734002L) / 4 + yt.a(3610, 8843761080340947410L);
                                            if (var4_4) continue block40;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            var16_5 /* !! */  = (yt.a(2978, 2504823335345333123L) ^ yt.a(19942, 8758434261456479813L)) / yt.a(18243, 5521236278038064926L) - yt.a(30406, 4797927560944049749L);
                            if (var4_4) ** GOTO lbl184
                        }
                        var16_5 /* !! */  = hi.a("G", (int)(hi.a("G", (int)yt.a(32566, 2212436599446229124L), (int)yt.a(29577, 7420634482314041483L), (long)834203424483934088L) - yt.a(29821, 1429495246990597220L)), (int)yt.a(11379, 6151159938844788366L), (long)834203424483934088L) ^ yt.a(27536, 5148813402520273362L) ^ yt.a(5639, 6249448276576779893L);
                        ** while (true)
                    }
                    var16_5 /* !! */  = yt.a(27328, 1917072783446984033L) - yt.a(16467, 1933251081279138613L) + yt.a(6163, 4062968955132948578L);
                }
                while (true) {
                    switch (var16_5 /* !! */ ) {
                        default: {
                            ** continue;
                        }
                        case -618491131: 
                    }
                    hi.a("G", (long)872630577218346603L);
                    hi.a("G", (long)1330918851199290462L);
                    var16_5 /* !! */  = (hi.a("G", (int)(yt.a(2414, 2917725071350407507L) + yt.a(25592, 7342867012362259321L)), (int)yt.a(5812, 7148596908285114862L), (long)834203424483934088L) ^ yt.a(25946, 6295138435323808409L)) * yt.a(20240, 390875148941354462L) - yt.a(32536, 6932636389960341236L);
                    if (!var4_4) ** continue;
                }
            }
            block44: do lbl-1000:
            // 3 sources

            {
                block76: {
                    block75: {
                        switch (var16_5 /* !! */ ) {
                            default: {
                                v9 = var15_18;
                                if (!var4_4) break block75;
                                if (v9) break;
                                break block76;
                            }
                            case 1764982835: {
                                if (var4_4) break block44;
                                ** GOTO lbl142
                            }
                            case 1764982834: {
                                ** continue;
                            }
                            case 1764982833: {
                                throw null;
                            }
                        }
lbl244:
                        // 2 sources

                        v9 = var16_5 /* !! */  = yt.a(4970, 5554137003443370607L) - yt.a(7260, 4425422677571647095L) + yt.a(11275, 8952085580624463295L) - yt.a(10197, 2764221834792799467L);
                    }
                    if (var4_4) ** GOTO lbl-1000
                }
                var16_5 /* !! */  = ((yt.a(17726, 8098467333273906468L) + yt.a(21533, 6457816077357612808L)) / yt.a(31456, 6159207061937738747L) - yt.a(5300, 2165046104362893160L)) / 5 ^ yt.a(19555, 4964161298854470732L);
            } while (var4_4);
            var16_5 /* !! */  = (yt.a(29331, 8581129566952478901L) * yt.a(25617, 6211652698101993287L) - yt.a(1231, 1012690573447769307L)) * yt.a(8171, 3516041327958734002L) / 4 + yt.a(3610, 8843761080340947410L);
            if (var4_4) ** GOTO lbl147
        }
        var16_5 /* !! */  = (yt.a(29331, 8581129566952478901L) * yt.a(25617, 6211652698101993287L) - yt.a(1231, 1012690573447769307L)) * yt.a(8171, 3516041327958734002L) / 4 + yt.a(3610, 8843761080340947410L);
        ** while (true)
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF9816) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = b[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 50;
                case 1 -> 93;
                case 2 -> 252;
                case 3 -> 146;
                case 4 -> 207;
                case 5 -> 95;
                case 6 -> 83;
                case 7 -> 142;
                case 8 -> 202;
                case 9 -> 33;
                case 10 -> 89;
                case 11 -> 169;
                case 12 -> 193;
                case 13 -> 253;
                case 14 -> 55;
                case 15 -> 112;
                case 16 -> 28;
                case 17 -> 94;
                case 18 -> 98;
                case 19 -> 100;
                case 20 -> 178;
                case 21 -> 2;
                case 22 -> 79;
                case 23 -> 109;
                case 24 -> 96;
                case 25 -> 18;
                case 26 -> 157;
                case 27 -> 34;
                case 28 -> 180;
                case 29 -> 220;
                case 30 -> 12;
                case 31 -> 163;
                case 32 -> 113;
                case 33 -> 88;
                case 34 -> 209;
                case 35 -> 23;
                case 36 -> 234;
                case 37 -> 101;
                case 38 -> 118;
                case 39 -> 230;
                case 40 -> 218;
                case 41 -> 255;
                case 42 -> 72;
                case 43 -> 173;
                case 44 -> 238;
                case 45 -> 70;
                case 46 -> 103;
                case 47 -> 172;
                case 48 -> 194;
                case 49 -> 154;
                case 50 -> 215;
                case 51 -> 249;
                case 52 -> 127;
                case 53 -> 22;
                case 54 -> 107;
                case 55 -> 58;
                case 56 -> 152;
                case 57 -> 8;
                case 58 -> 176;
                case 59 -> 16;
                case 60 -> 203;
                case 61 -> 208;
                case 62 -> 191;
                case 63 -> 59;
                case 64 -> 245;
                case 65 -> 60;
                case 66 -> 14;
                case 67 -> 137;
                case 68 -> 242;
                case 69 -> 64;
                case 70 -> 29;
                case 71 -> 131;
                case 72 -> 251;
                case 73 -> 135;
                case 74 -> 247;
                case 75 -> 141;
                case 76 -> 170;
                case 77 -> 151;
                case 78 -> 91;
                case 79 -> 102;
                case 80 -> 43;
                case 81 -> 114;
                case 82 -> 185;
                case 83 -> 233;
                case 84 -> 143;
                case 85 -> 133;
                case 86 -> 140;
                case 87 -> 222;
                case 88 -> 11;
                case 89 -> 168;
                case 90 -> 106;
                case 91 -> 57;
                case 92 -> 232;
                case 93 -> 212;
                case 94 -> 3;
                case 95 -> 216;
                case 96 -> 201;
                case 97 -> 124;
                case 98 -> 188;
                case 99 -> 51;
                case 100 -> 235;
                case 101 -> 66;
                case 102 -> 156;
                case 103 -> 129;
                case 104 -> 48;
                case 105 -> 134;
                case 106 -> 97;
                case 107 -> 132;
                case 108 -> 211;
                case 109 -> 35;
                case 110 -> 200;
                case 111 -> 87;
                case 112 -> 54;
                case 113 -> 155;
                case 114 -> 186;
                case 115 -> 19;
                case 116 -> 40;
                case 117 -> 236;
                case 118 -> 190;
                case 119 -> 254;
                case 120 -> 162;
                case 121 -> 210;
                case 122 -> 206;
                case 123 -> 61;
                case 124 -> 144;
                case 125 -> 225;
                case 126 -> 128;
                case 127 -> 181;
                case 128 -> 17;
                case 129 -> 196;
                case 130 -> 0;
                case 131 -> 31;
                case 132 -> 158;
                case 133 -> 99;
                case 134 -> 159;
                case 135 -> 139;
                case 136 -> 108;
                case 137 -> 41;
                case 138 -> 184;
                case 139 -> 67;
                case 140 -> 138;
                case 141 -> 213;
                case 142 -> 119;
                case 143 -> 175;
                case 144 -> 197;
                case 145 -> 150;
                case 146 -> 9;
                case 147 -> 219;
                case 148 -> 68;
                case 149 -> 44;
                case 150 -> 65;
                case 151 -> 160;
                case 152 -> 189;
                case 153 -> 81;
                case 154 -> 52;
                case 155 -> 221;
                case 156 -> 130;
                case 157 -> 92;
                case 158 -> 36;
                case 159 -> 239;
                case 160 -> 123;
                case 161 -> 46;
                case 162 -> 237;
                case 163 -> 120;
                case 164 -> 20;
                case 165 -> 10;
                case 166 -> 126;
                case 167 -> 204;
                case 168 -> 217;
                case 169 -> 229;
                case 170 -> 224;
                case 171 -> 62;
                case 172 -> 248;
                case 173 -> 195;
                case 174 -> 147;
                case 175 -> 25;
                case 176 -> 53;
                case 177 -> 47;
                case 178 -> 226;
                case 179 -> 182;
                case 180 -> 39;
                case 181 -> 26;
                case 182 -> 71;
                case 183 -> 161;
                case 184 -> 115;
                case 185 -> 104;
                case 186 -> 231;
                case 187 -> 241;
                case 188 -> 227;
                case 189 -> 117;
                case 190 -> 116;
                case 191 -> 111;
                case 192 -> 148;
                case 193 -> 73;
                case 194 -> 149;
                case 195 -> 7;
                case 196 -> 27;
                case 197 -> 165;
                case 198 -> 69;
                case 199 -> 4;
                case 200 -> 174;
                case 201 -> 38;
                case 202 -> 250;
                case 203 -> 56;
                case 204 -> 228;
                case 205 -> 243;
                case 206 -> 164;
                case 207 -> 1;
                case 208 -> 153;
                case 209 -> 246;
                case 210 -> 21;
                case 211 -> 37;
                case 212 -> 30;
                case 213 -> 78;
                case 214 -> 13;
                case 215 -> 145;
                case 216 -> 75;
                case 217 -> 179;
                case 218 -> 42;
                case 219 -> 125;
                case 220 -> 198;
                case 221 -> 110;
                case 222 -> 244;
                case 223 -> 177;
                case 224 -> 183;
                case 225 -> 85;
                case 226 -> 192;
                case 227 -> 63;
                case 228 -> 105;
                case 229 -> 84;
                case 230 -> 5;
                case 231 -> 49;
                case 232 -> 166;
                case 233 -> 122;
                case 234 -> 214;
                case 235 -> 82;
                case 236 -> 6;
                case 237 -> 77;
                case 238 -> 121;
                case 239 -> 90;
                case 240 -> 223;
                case 241 -> 240;
                case 242 -> 136;
                case 243 -> 74;
                case 244 -> 24;
                case 245 -> 199;
                case 246 -> 32;
                case 247 -> 15;
                case 248 -> 76;
                case 249 -> 45;
                case 250 -> 86;
                case 251 -> 205;
                case 252 -> 171;
                case 253 -> 187;
                case 254 -> 167;
                default -> 80;
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
            yt.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BDC;
        if (f[n2] == null) {
            yt.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }
}
