/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.equipment.Equippable
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.X0;
import com.github.epsilon.XG;
import com.github.epsilon.Xn;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.Equippable;

public class uk
extends e {
    private boolean P;
    private final XG F;
    private final XG l;
    private boolean N;
    private final XG n;
    private boolean q;
    public static final uk X;
    private int y;
    private final X0 T = uk.o("KnArujWOU9t2sdpL", t(java.lang.String int ), (uk)this, (String)uk.b(15121, 21837), (int)uk.c(8434, 5100385089057318947L));
    private int B;
    private int h;
    private final Xn H;
    private final Xn V;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    private static boolean lambda$onTick$1(ItemStack itemStack) {
        return (boolean)hi.a("\u00a5", (Object)itemStack, (Object)hi.a("j", (long)1102241310816947156L), (long)484703308447361578L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$onTick$0(ItemStack itemStack) {
        Equippable equippable;
        boolean bl = Dl.t();
        Object object = itemStack;
        if (!bl) {
            if (hi.a("\u00a5", (Object)object, (long)675687955611242108L) != false) {
                return false;
            }
            object = hi.a("\u00a5", (Object)itemStack, (Object)hi.a("j", (long)1032628210763254783L), (long)1154011740135286234L);
        }
        Equippable equippable2 = equippable = (Equippable)object;
        if (!bl) {
            if (equippable2 == null) return false;
            equippable2 = equippable;
        }
        if (hi.a("\u00a5", (Object)equippable2, (long)1011902985141598383L) != hi.a("j", (long)1054923417099375911L)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void K() {
        block21: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            block15: {
                                block16: {
                                    var1_1 = Dl.t();
                                    var2_2 = uk.c(7357, 4514195727934149867L) / uk.c(2804, 2861070124436832945L) - uk.c(20793, 4412820403663837555L);
                                    if (var1_1) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            v0 = hi.a("\u00e9", (Object)this, (long)924080238676557191L);
                                            v1 /* !! */  = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)475464460510933546L), (long)789438897355831922L)), (long)1260538186742955956L);
                                            if (var1_1) break block15;
                                            if (v0 >= v1 /* !! */ ) break block16;
                                            break block17;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            v2 = this;
                                            hi.a("\u00f2", (Object)v2, (int)(hi.a("\u00e9", (Object)v2, (long)924080238676557191L) + true), (long)924080238676557191L);
                                            return;
                                        }
lbl14:
                                        // 1 sources

                                        while (true) {
                                            v3 /* !! */  = hi.a("\u00e9", (Object)this, (long)807531261500505640L);
                                            v4 = -1;
                                            if (var1_1) break block18;
                                            if (v3 /* !! */  == v4) break block19;
                                            break block20;
                                            break;
                                        }
lbl20:
                                        // 1 sources

                                        while (true) {
                                            uk.o("KnArujWOU9t2sdpL", C(int boolean ), (int)hi.a("\u00e9", (Object)this, (long)807531261500505640L), (boolean)false);
                                            if (var1_1) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1136600556468966226L);
                                                    return;
                                                }
                                            }
                                            break block21;
                                            break;
                                        }
                                    }
lbl27:
                                    // 7 sources

                                    while (true) {
                                        switch (var2_2) {
                                            default: {
                                                ** continue;
                                            }
                                            case -1091223156: {
                                                ** continue;
                                            }
                                            case -1091223160: {
                                                ** continue;
                                            }
                                            case -1091223155: {
                                                ** continue;
                                            }
                                            case -1091223159: {
                                                ** continue;
                                            }
                                            case -1091223158: 
                                        }
                                        throw null;
                                    }
                                }
                                v0 = hi.a("G", (int)((uk.c(4091, 4384912300118460161L) + uk.c(5020, 5761585568104405842L)) / 2), (int)uk.c(10560, 3209230557663781257L), (long)834203424483934088L);
                                v1 /* !! */  = (CallSite)uk.c(31431, 2949873258167382769L);
                            }
                            var2_2 = v0 ^ v1 /* !! */ ;
                            if (!var1_1) ** GOTO lbl27
                        }
                        var2_2 = hi.a("G", (int)uk.c(32208, 3288048111032972695L), (int)uk.c(32408, 3755597123257185921L), (long)834203424483934088L) ^ uk.c(3194, 5114419230274503710L);
                        if (!var1_1) ** GOTO lbl27
                    }
                    v3 /* !! */  = (CallSite)(uk.c(20215, 8736773679738816215L) / 5 * uk.c(26306, 7157213985662840538L) - uk.c(9015, 5290130213979548667L) ^ uk.c(23650, 2925351481257596089L));
                    v4 = uk.c(10695, 5164595727239569724L);
                }
                var2_2 = v3 /* !! */  ^ v4;
                if (!var1_1) ** GOTO lbl27
            }
            var2_2 = uk.c(25459, 6183069961020713779L) + uk.c(23595, 2127337388716791004L) - uk.c(14677, 846630393023361364L);
            if (!var1_1) ** GOTO lbl27
        }
        var2_2 = uk.c(20681, 4040319435599911154L) / 5 * uk.c(17252, 7252697507457403753L) - uk.c(16036, 1850706533009094213L) ^ uk.c(18511, 4347403262685282371L) ^ uk.c(26463, 1676119815204745133L);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void O(dR var1_1) {
        block88: {
            block91: {
                block87: {
                    block85: {
                        block86: {
                            block90: {
                                block84: {
                                    block82: {
                                        block83: {
                                            block92: {
                                                block81: {
                                                    block80: {
                                                        block89: {
                                                            block79: {
                                                                var2_2 = Dl.t();
                                                                var10_3 /* !! */  = (uk.c(24163, 4306109770691417724L) - uk.c(23427, 5505941292738647038L)) * uk.c(17726, 4108948604516797823L) + uk.c(10418, 8200524757390581855L) - uk.c(31976, 6394197468461544538L);
                                                                if (!var2_2) break block79;
lbl4:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)907159218940561824L), (long)1017954173869996748L) == null) {
                                                                        var10_3 /* !! */  = uk.c(1310, 4271460570423840027L) - uk.c(11651, 5090724694977078611L) ^ uk.c(11787, 1808976887487948483L) ^ uk.c(9018, 9083392290440375054L);
                                                                        if (!var2_2) break block79;
                                                                    }
                                                                    var10_3 /* !! */  = hi.a("G", (int)(uk.c(6034, 2359116839688953665L) * uk.c(25638, 6999477119497514058L) - uk.c(6676, 1699906632300319444L)), (int)uk.c(19998, 6054464474861405719L), (long)834203424483934088L) + uk.c(2066, 8193099291914616924L) ^ uk.c(13631, 243901532957146475L);
                                                                    break block79;
                                                                    break;
                                                                }
lbl10:
                                                                // 2 sources

                                                                while (true) {
                                                                    v0 /* !! */  = var3_4;
                                                                    if (var2_2) ** GOTO lbl140
                                                                    if (v0 /* !! */  == false) ** GOTO lbl139
                                                                    ** GOTO lbl142
                                                                    break;
                                                                }
lbl15:
                                                                // 2 sources

                                                                while (true) {
                                                                    v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)999733118546759259L);
                                                                    v2 /* !! */  = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)461546679671781454L), (long)789438897355831922L)), (long)1260538186742955956L);
                                                                    if (var2_2) ** GOTO lbl165
                                                                    if (v1 /* !! */  >= v2 /* !! */ ) ** GOTO lbl163
                                                                    ** GOTO lbl167
                                                                    break;
                                                                }
lbl21:
                                                                // 2 sources

                                                                while (true) {
                                                                    hi.a("G", (long)1184702471901219908L);
lbl24:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        block94: {
                                                                            block93: {
                                                                                var5_6 = v3;
                                                                                v4 /* !! */  = hi.a("\u00e9", (Object)this, (long)705397552631581979L);
                                                                                if (var2_2) break block93;
                                                                                if (v4 /* !! */  == false) break block94;
                                                                                v4 /* !! */  = (CallSite)((uk.c(21375, 5314499086377065385L) ^ uk.c(23626, 2216252818902488153L)) - uk.c(14528, 102913483292405997L));
                                                                            }
                                                                            var10_3 /* !! */  = (int)v4 /* !! */ ;
                                                                            if (!var2_2) break block80;
                                                                        }
                                                                        var10_3 /* !! */  = (uk.c(21575, 5997950515353197670L) - uk.c(1138, 1093097415374883871L)) * uk.c(21897, 8306541431492582737L) + uk.c(15696, 7521689563804235180L) ^ uk.c(28753, 10035469629372471L);
                                                                        break block80;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl36:
                                                                // 2 sources

                                                                while (true) {
                                                                    block96: {
                                                                        block95: {
                                                                            var8_9 /* !! */  = v5 /* !! */ ;
                                                                            v6 = var7_8;
                                                                            v7 = uk.c(15778, 7658051282744702453L);
                                                                            if (var2_2) break block95;
                                                                            if (v6 < v7) break block96;
                                                                            v6 = hi.a("G", (int)(uk.c(4529, 5020367335189076462L) ^ uk.c(1949, 700415036853374799L)), (int)uk.c(21962, 1393528865235279257L), (long)834203424483934088L) * uk.c(31534, 1150045776336598009L) / 3;
                                                                            v7 = uk.c(13355, 8616190843159968828L);
                                                                        }
                                                                        var10_3 /* !! */  = (int)(v6 - v7);
                                                                        if (!var2_2) break block81;
                                                                    }
                                                                    var10_3 /* !! */  = (uk.c(11919, 8583747933715490487L) / 4 - uk.c(19704, 3569719168485459191L)) / uk.c(24478, 7659055421582612397L) ^ uk.c(5876, 7588885398891421334L);
                                                                    if (!var2_2) break block81;
                                                                    ** GOTO lbl297
                                                                    break;
                                                                }
lbl51:
                                                                // 2 sources

                                                                while (true) {
                                                                    v8 /* !! */  = hi.a("\u00e9", (Object)this, (long)1158229808847301287L);
                                                                    if (var2_2) break block82;
                                                                    if (v8 /* !! */  != false) break block83;
                                                                    break block84;
                                                                    break;
                                                                }
lbl56:
                                                                // 2 sources

                                                                while (true) {
                                                                    v9 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)849435489971432276L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                    if (var2_2) break block85;
                                                                    if (v9 /* !! */  == false) break block86;
                                                                    break block87;
                                                                    break;
                                                                }
lbl61:
                                                                // 2 sources

                                                                while (true) {
                                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1136600556468966226L);
                                                                    if (var2_2) {
                                                                        return;
                                                                    }
                                                                    break block88;
                                                                    break;
                                                                }
                                                            }
                                                            block56: while (true) {
                                                                switch (var10_3 /* !! */ ) {
                                                                    default: {
                                                                        ** continue;
                                                                    }
                                                                    case -1680405994: {
                                                                        v10 = var3_4 = hi.a("G", (int)hi.a("\u00a5", (Object)((Integer)uk.o("KnArujWOU9t2sdpL", z(), (X0)hi.a("\u00e9", (Object)this, (long)920492910074476289L))), (long)1260538186742955956L), (long)759451198843871681L);
                                                                        if (var2_2) ** GOTO lbl83
                                                                        if (v10 != false) ** GOTO lbl82
                                                                        ** GOTO lbl85
                                                                    }
                                                                    case -1680405993: {
                                                                        hi.a("G", (float)2.0f, (float)2.0f, (long)869562683730491792L);
                                                                        var10_3 /* !! */  = uk.c(13881, 8546287305477946963L) / uk.c(5217, 3651902133948963850L) ^ uk.c(20517, 5894412612861663431L);
                                                                        continue block56;
                                                                    }
lbl82:
                                                                    // 1 sources

                                                                    v10 = hi.a("G", (int)uk.c(23211, 14376803727151646L), (int)uk.c(31297, 3258846284122600038L), (long)834203424483934088L) + uk.c(16623, 1606824708874373273L) + uk.c(27435, 1596314326757974902L);
lbl83:
                                                                    // 2 sources

                                                                    var10_3 /* !! */  = (int)v10;
                                                                    if (!var2_2) break block89;
lbl85:
                                                                    // 2 sources

                                                                    var10_3 /* !! */  = (int)(hi.a("G", (int)(uk.c(5443, 1065199932341574964L) / uk.c(929, 8027855569654500334L)), (int)uk.c(2135, 4869051348063797254L), (long)834203424483934088L) - uk.c(23120, 7168910397889483369L));
                                                                    if (!var2_2) break block89;
                                                                    ** GOTO lbl137
                                                                    case -1680405995: 
                                                                }
                                                                break;
                                                            }
                                                            return;
                                                        }
lbl91:
                                                        // 3 sources

                                                        block57: while (true) {
                                                            switch (var10_3 /* !! */ ) {
                                                                default: {
                                                                    hi.a("\u00f2", (Object)this, (boolean)false, (long)462451321936636354L);
                                                                    if (!var2_2) ** GOTO lbl137
                                                                    ** GOTO lbl10
                                                                }
                                                                case 420070450: {
                                                                    ** continue;
                                                                }
                                                                case 420070449: {
                                                                    v11 /* !! */  = hi.a("\u00e9", (Object)this, (long)462451321936636354L);
                                                                    if (var2_2) ** GOTO lbl145
                                                                    if (v11 /* !! */  == false) ** GOTO lbl144
                                                                    ** GOTO lbl147
                                                                }
                                                                case 420070454: {
                                                                    v12 /* !! */  = hi.a("\u00e9", (Object)this, (long)807531261500505640L);
                                                                    v13 = -1;
                                                                    if (var2_2) ** GOTO lbl151
                                                                    if (v12 /* !! */  != v13) ** GOTO lbl149
                                                                    ** GOTO lbl153
                                                                }
                                                                case 420070457: {
                                                                    hi.a("\u00f2", (Object)this, (boolean)true, (long)462451321936636354L);
                                                                    v14 /* !! */  = hi.a("\u00e9", (Object)this, (long)807531261500505640L);
                                                                    v15 = -1;
                                                                    if (var2_2) ** GOTO lbl157
                                                                    if (v14 /* !! */  != v15) ** GOTO lbl155
                                                                    ** GOTO lbl159
                                                                }
                                                                case 420070451: {
                                                                    hi.a("\u00f2", (Object)this, (int)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1119095325570777413L), (long)588501882833882098L), (long)807531261500505640L);
                                                                    if (!var2_2) ** GOTO lbl161
                                                                    ** GOTO lbl15
                                                                }
                                                                case 420070460: {
                                                                    ** continue;
                                                                }
                                                                case 420070458: {
                                                                    v16 = this;
                                                                    hi.a("\u00f2", (Object)v16, (int)(hi.a("\u00e9", (Object)v16, (long)999733118546759259L) + true), (long)999733118546759259L);
                                                                    return;
                                                                }
                                                                case 420070453: {
                                                                    v17 = var4_5 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)1054923417099375911L), (long)1322864681657272727L), (Object)hi.a("j", (long)1102241310816947156L), (long)484703308447361578L);
                                                                    if (var2_2) ** GOTO lbl170
                                                                    if (v17 == false) ** GOTO lbl169
                                                                    ** GOTO lbl172
                                                                }
                                                                case 420070459: {
                                                                    hi.a("G", (long)397471851942621184L);
                                                                    var10_3 /* !! */  = uk.c(14197, 5639305634482552630L) * uk.c(16308, 1909968905569728322L) + uk.c(24454, 4606590862351177705L);
                                                                    continue block57;
                                                                }
lbl137:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(hi.a("G", (int)uk.c(19288, 5726701153067565928L), (int)uk.c(30340, 6517018590263918233L), (long)834203424483934088L) + uk.c(1036, 3409775158043757779L) + uk.c(29074, 5336665923471915348L));
                                                                if (!var2_2) continue block57;
lbl139:
                                                                // 2 sources

                                                                v0 /* !! */  = (reference)((uk.c(9036, 3657027955652225892L) / uk.c(26296, 8862259746734091946L) / 2 ^ uk.c(9842, 2527696834997120622L)) + uk.c(32416, 2017316553947330193L));
lbl140:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)v0 /* !! */ ;
                                                                if (!var2_2) continue block57;
lbl142:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(hi.a("G", (int)uk.c(16364, 6098513487247898396L), (int)uk.c(17760, 7204534696766410043L), (long)834203424483934088L) + uk.c(14026, 3515247261531471561L));
                                                                if (!var2_2) continue block57;
lbl144:
                                                                // 2 sources

                                                                v11 /* !! */  = (CallSite)(uk.c(12423, 5050305053602969762L) - uk.c(26729, 4507981573609463817L) ^ uk.c(31131, 7330653120337490353L));
lbl145:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)v11 /* !! */ ;
                                                                if (!var2_2) continue block57;
lbl147:
                                                                // 2 sources

                                                                var10_3 /* !! */  = uk.c(26684, 5955673800119951565L) ^ uk.c(17424, 1293294672001961178L) ^ uk.c(29960, 2882070820515429884L);
                                                                if (!var2_2) continue block57;
lbl149:
                                                                // 2 sources

                                                                v12 /* !! */  = (CallSite)(uk.c(18261, 6152816313154867123L) - uk.c(27834, 9004439089270138031L));
                                                                v13 = uk.c(5625, 3606191633216429551L);
lbl151:
                                                                // 2 sources

                                                                var10_3 /* !! */  = v12 /* !! */  ^ v13;
                                                                if (!var2_2) continue block57;
lbl153:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (hi.a("G", (int)uk.c(21655, 3064743402116684911L), (int)uk.c(15904, 5135676104400565983L), (long)834203424483934088L) * uk.c(5134, 4777430935974075645L) / uk.c(31975, 2072417078995793115L) ^ uk.c(10817, 327380916080534191L)) - uk.c(17443, 1002164596102532131L);
                                                                if (!var2_2) continue block57;
lbl155:
                                                                // 2 sources

                                                                v14 /* !! */  = (CallSite)((uk.c(27342, 443493384814437004L) / uk.c(8232, 6988588589061793813L) - uk.c(11309, 463799787634811923L)) * uk.c(12549, 604292319776438569L));
                                                                v15 = uk.c(26110, 3449474191934238196L);
lbl157:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(v14 /* !! */  - v15);
                                                                if (!var2_2) continue block57;
lbl159:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(hi.a("G", (int)uk.c(20278, 3308208295405357023L), (int)uk.c(24050, 7673004079722796427L), (long)834203424483934088L) * uk.c(17749, 1295831741264989445L) + uk.c(14721, 7549403897934377455L));
                                                                if (!var2_2) continue block57;
lbl161:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (uk.c(12226, 7636827107547703241L) / uk.c(8232, 6988588589061793813L) - uk.c(2570, 4122479638874276468L)) * uk.c(31153, 6654705884779983197L) - uk.c(7948, 2663863213403035394L);
                                                                if (!var2_2) continue block57;
lbl163:
                                                                // 2 sources

                                                                v1 /* !! */  = (CallSite)((uk.c(30334, 3283552862970789521L) + uk.c(5285, 101009878207781979L)) / uk.c(19876, 272127672960812534L) ^ uk.c(20775, 8536460067000424928L));
                                                                v2 /* !! */  = (CallSite)uk.c(31241, 2255322180136219216L);
lbl165:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(v1 /* !! */  + v2 /* !! */ );
                                                                if (!var2_2) continue block57;
lbl167:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(uk.c(27893, 6394880553616286789L) + uk.c(28919, 4869639947140643043L)), (int)uk.c(8930, 2720199929987721766L), (long)834203424483934088L), (int)uk.c(18366, 1424913091331330027L), (long)834203424483934088L) + uk.c(18950, 7462822313443885798L));
                                                                continue block57;
lbl169:
                                                                // 1 sources

                                                                v17 = hi.a("G", (int)(uk.c(25135, 6683112965524204137L) ^ uk.c(12688, 4964102974124128628L)), (int)uk.c(1197, 2927343997605694533L), (long)834203424483934088L) - uk.c(32605, 3808970267270297528L);
lbl170:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)v17;
                                                                if (!var2_2) ** GOTO lbl173
lbl172:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(hi.a("G", (int)(uk.c(7359, 4028150787664434246L) / uk.c(11073, 7562216535815873290L)), (int)uk.c(14330, 4487853116380676064L), (long)834203424483934088L) - uk.c(1334, 8675904363936697820L));
lbl173:
                                                                // 2 sources

                                                                switch (var10_3 /* !! */ ) {
                                                                    default: {
                                                                        v3 = (Predicate<ItemStack>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$0(net.minecraft.world.item.ItemStack ), (Lnet/minecraft/world/item/ItemStack;)Z)();
                                                                        var10_3 /* !! */  = (uk.c(6707, 6177291802366923285L) * uk.c(15681, 5974488268448298271L) - uk.c(25290, 3372665692887165473L)) * uk.c(24349, 6711055733118506855L) - uk.c(29866, 9062671363212196971L);
                                                                        if (var2_2) {
                                                                            break;
                                                                        }
                                                                        ** GOTO lbl189
                                                                    }
                                                                    case -2095631002: {
                                                                        v3 = (Predicate<ItemStack>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$1(net.minecraft.world.item.ItemStack ), (Lnet/minecraft/world/item/ItemStack;)Z)();
                                                                        if (!var2_2) break;
                                                                        ** GOTO lbl21
                                                                    }
                                                                    case -2095631003: {
                                                                        throw null;
                                                                    }
                                                                }
                                                                var10_3 /* !! */  = (uk.c(3010, 3316429723711390618L) * uk.c(7931, 3070681586715842254L) - uk.c(22582, 4593828927884103698L)) * uk.c(28667, 604912979277522923L) - uk.c(1501, 1925693812874890604L);
lbl189:
                                                                // 2 sources

                                                                switch (var10_3 /* !! */ ) {
                                                                    case 1813166000: {
                                                                        ** continue;
                                                                    }
                                                                }
                                                                ** continue;
                                                                case 420070455: {
                                                                    return;
                                                                }
                                                                case 420070456: 
                                                            }
                                                            return;
                                                        }
                                                    }
lbl198:
                                                    // 7 sources

                                                    while (true) {
                                                        block99: {
                                                            block98: {
                                                                block97: {
                                                                    switch (var10_3 /* !! */ ) {
                                                                        default: {
                                                                            v18 /* !! */  = var6_7 = hi.a("\u00a5", (Object)hi.a("G", var5_6, (long)597481681569354723L), (long)1221194514962317539L);
                                                                            v19 = -1;
                                                                            if (var2_2) break block97;
                                                                            if (v18 /* !! */  != v19) break;
                                                                            break block98;
                                                                        }
                                                                        case -40517357: {
                                                                            ** GOTO lbl51
                                                                        }
                                                                        case -40517362: {
                                                                            hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)395593892412342457L), (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (Object)hi.a("j", (long)844572035549319610L), (long)872694920693261832L);
                                                                            uk.o("KnArujWOU9t2sdpL", swing(net.minecraft.world.InteractionHand ), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (InteractionHand)hi.a("j", (long)844572035549319610L));
                                                                            hi.a("\u00f2", (Object)this, (boolean)true, (long)1158229808847301287L);
                                                                            if (!var2_2) break block90;
                                                                            ** GOTO lbl56
                                                                        }
                                                                        case -40517360: {
                                                                            ** continue;
                                                                        }
                                                                        case -40517361: {
                                                                            uk.o("KnArujWOU9t2sdpL", K(), (uk)this);
                                                                            if (!var2_2) break block91;
                                                                            ** GOTO lbl61
                                                                        }
                                                                        case -40517358: {
                                                                            ** continue;
                                                                        }
                                                                        case -40517356: {
                                                                            uk.o("KnArujWOU9t2sdpL", values());
                                                                            return;
                                                                        }
                                                                    }
                                                                    v18 /* !! */  = (CallSite)(uk.c(19309, 530497469527425897L) / 3 / uk.c(16246, 8388153516514277129L) - uk.c(18842, 7681155853035209030L));
                                                                    v19 = uk.c(22217, 4445513234626551306L);
                                                                }
                                                                var10_3 /* !! */  = (int)(v18 /* !! */  - v19);
                                                                if (!var2_2) break block99;
                                                            }
                                                            var10_3 /* !! */  = (uk.c(2433, 9014881378331738463L) ^ uk.c(27190, 4287082083096339171L)) + uk.c(28143, 8717099567766250900L) + uk.c(18519, 3804434274198519839L);
                                                            if (var2_2) ** GOTO lbl258
                                                        }
                                                        block59: while (true) {
                                                            switch (var10_3 /* !! */ ) {
                                                                default: {
                                                                    v20 /* !! */  = hi.a("\u00a5", (Object)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)797781723037708531L), (long)789438897355831922L)), (long)1000026253634408124L);
                                                                    if (var2_2) ** GOTO lbl259
                                                                    if (v20 /* !! */  != false) ** GOTO lbl258
                                                                    ** GOTO lbl261
                                                                }
                                                                case 53488297: {
                                                                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1136600556468966226L);
                                                                    return;
                                                                }
                                                                case 53488295: {
                                                                    v21 = var7_8 = hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{var5_6}, (long)402614237701564139L), (long)1221194514962317539L);
                                                                    v22 = -1;
                                                                    if (var2_2) ** GOTO lbl265
                                                                    if (v21 == v22) ** GOTO lbl263
                                                                    ** GOTO lbl267
                                                                }
                                                                case 53488299: {
                                                                    hi.a("G", (int)var6_7, (boolean)false, (long)541412231224622628L);
                                                                    hi.a("\u00f2", (Object)this, (boolean)true, (long)705397552631581979L);
                                                                    if (var2_2) {
                                                                        ** continue;
                                                                    }
                                                                    break block92;
                                                                }
lbl258:
                                                                // 2 sources

                                                                v20 /* !! */  = (CallSite)(hi.a("G", (int)(uk.c(30858, 3338598497822748841L) * uk.c(20765, 9066030289041758553L)), (int)uk.c(15345, 4686831827880375274L), (long)834203424483934088L) + uk.c(1606, 5180753477094198812L) ^ uk.c(2491, 1863381954326544772L));
lbl259:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)v20 /* !! */ ;
                                                                if (!var2_2) continue block59;
lbl261:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (int)(hi.a("G", (int)(uk.c(22828, 1768239099460784601L) + uk.c(8608, 6124767494659729686L) ^ uk.c(32139, 4682392582614595014L) ^ uk.c(9508, 6600581331196505431L)), (int)uk.c(27740, 3173050695575938048L), (long)834203424483934088L) - uk.c(8392, 6700225083941152815L));
                                                                continue block59;
lbl263:
                                                                // 1 sources

                                                                v21 = hi.a("G", (int)((hi.a("G", (int)uk.c(10364, 1813526098360754274L), (int)uk.c(17562, 5961013049370020909L), (long)834203424483934088L) - uk.c(22063, 541181435703270953L)) * uk.c(17075, 1915137723308706417L)), (int)uk.c(2169, 401110907531935756L), (long)834203424483934088L);
                                                                v22 = uk.c(14585, 3642115403963658454L);
lbl265:
                                                                // 2 sources

                                                                var10_3 /* !! */  = v21 ^ v22;
                                                                if (!var2_2) ** GOTO lbl268
lbl267:
                                                                // 2 sources

                                                                var10_3 /* !! */  = (uk.c(3191, 327391881080685584L) + uk.c(16545, 6306463534135150803L)) / 4 ^ uk.c(28918, 6172390516314552511L);
lbl268:
                                                                // 2 sources

                                                                v5 /* !! */  = var10_3 /* !! */ ;
                                                                if (var2_2) ** GOTO lbl36
                                                                switch (v5 /* !! */ ) {
                                                                    default: {
                                                                        v5 /* !! */  = (int)var7_8;
                                                                        ** continue;
                                                                    }
                                                                    case 1336924788: {
                                                                        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1136600556468966226L);
                                                                        return;
                                                                    }
                                                                    case 1336924786: 
                                                                }
                                                                ** GOTO lbl294
                                                                case 53488298: 
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                }
                                                do {
                                                    block100: {
                                                        switch (var10_3 /* !! */ ) {
                                                            default: {
                                                                var8_9 /* !! */  += 36;
                                                                if (!var2_2) break block100;
                                                                ** GOTO lbl-1000
                                                            }
                                                            case 2101560219: lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var9_10 = hi.a("\u00a5", (Object)((Integer)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1177013823381692263L), (long)789438897355831922L)), (long)1260538186742955956L) - true;
                                                                hi.a("G", (int)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)922837473480332621L), (long)758229236411088228L), (int)var8_9 /* !! */ , (int)var9_10, (long)1066719768155535037L);
                                                                hi.a("\u00f2", (Object)this, (int)0, (long)999733118546759259L);
                                                                return;
                                                            }
                                                            case 2101560221: 
                                                        }
lbl294:
                                                        // 2 sources

                                                        hi.a("G", (long)1124891203117124897L);
                                                        return;
                                                    }
                                                    var10_3 /* !! */  = (int)(hi.a("G", (int)(uk.c(5538, 5406041081588473232L) ^ uk.c(22658, 1969080680589201479L)), (int)uk.c(27890, 9203746142208730127L), (long)834203424483934088L) * uk.c(28357, 6042143995468228290L) / 3 - uk.c(14841, 8568833416519283176L));
                                                } while (!var2_2);
                                            }
                                            var10_3 /* !! */  = (uk.c(18992, 1856073796312728149L) ^ uk.c(20597, 1990573943758264492L)) - uk.c(19263, 8629096081734632421L);
                                            if (!var2_2) ** GOTO lbl198
                                        }
                                        v8 /* !! */  = (CallSite)(((uk.c(27656, 2622380555792426171L) - uk.c(26014, 6182391971900304878L) ^ uk.c(2975, 5798100354050606070L)) + uk.c(16336, 2506068491240798201L)) / 4 - uk.c(7090, 6167996890556355455L));
                                    }
                                    var10_3 /* !! */  = (int)v8 /* !! */ ;
                                    if (!var2_2) ** GOTO lbl198
                                }
                                var10_3 /* !! */  = hi.a("G", (int)uk.c(20990, 4201435648378739087L), (int)uk.c(14151, 5434416951640293221L), (long)834203424483934088L) ^ uk.c(31385, 4845478861578351186L);
                                if (!var2_2) ** GOTO lbl198
                            }
                            var10_3 /* !! */  = ((uk.c(996, 6402773838134266835L) - uk.c(30179, 9135122629315476971L) ^ uk.c(19077, 3234340297833972461L)) + uk.c(6943, 8117661424538735486L)) / 4 - uk.c(12399, 4477965805324990532L);
                            if (!var2_2) ** GOTO lbl198
                        }
                        v9 /* !! */  = (CallSite)((uk.c(1085, 4528893745531178121L) - uk.c(17157, 4476613317038082918L)) / uk.c(11073, 7562216535815873290L) ^ uk.c(15897, 1035018649290503715L));
                    }
                    var10_3 /* !! */  = (int)v9 /* !! */ ;
                    if (!var2_2) ** GOTO lbl198
                }
                var10_3 /* !! */  = uk.c(31500, 9027097110196073455L) / uk.c(1805, 5797804938659188688L) - uk.c(15387, 963751686557824087L) - uk.c(20698, 2879592612019214510L);
                ** while (!var2_2)
            }
            var10_3 /* !! */  = (uk.c(32081, 4668013753731855743L) / uk.c(8232, 6988588589061793813L) / 2 ^ uk.c(23442, 756465354244527086L)) + uk.c(24812, 7083467029067835448L);
            if (!var2_2) ** GOTO lbl91
        }
        var10_3 /* !! */  = (uk.c(32081, 4668013753731855743L) / uk.c(8232, 6988588589061793813L) / 2 ^ uk.c(23442, 756465354244527086L)) + uk.c(24812, 7083467029067835448L);
        ** while (true)
    }

    public static /* bridge */ /* synthetic */ CallSite o(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private void m(Object[] objectArray) {
        hi.a("\u00f2", (Object)this, (int)-1, (long)807531261500505640L);
        hi.a("\u00f2", (Object)this, (int)0, (long)924080238676557191L);
        hi.a("\u00f2", (Object)this, (int)0, (long)999733118546759259L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)1158229808847301287L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)705397552631581979L);
    }

    private uk() {
        super(uk.b(15125, 29624), (vY)((Object)hi.a("j", (long)526176563220736169L)));
        this.n = hi.a("\u00a5", (Object)this, (Object)uk.b(15126, 32249), (int)0, (int)0, (int)uk.c(18678, 8138126350574420025L), (int)1, (long)1094453040828645510L);
        this.V = hi.a("\u00a5", (Object)this, (Object)uk.b(15123, 27773), (boolean)true, (long)1230617056439551805L);
        this.l = hi.a("\u00a5", (Object)this, (Object)uk.b(15120, 13568), (int)0, (int)0, (int)uk.c(16410, 8893114036762642456L), (int)1, (long)1094453040828645510L);
        this.H = hi.a("\u00a5", (Object)this, (Object)uk.b(15127, 20263), (boolean)true, (long)1230617056439551805L);
        this.F = hi.a("\u00a5", (Object)this, (Object)uk.b(15124, 24688), (int)uk.c(22393, 341150613511085825L), (int)1, (int)uk.c(22393, 341150613511085825L), (int)1, (long)1094453040828645510L);
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
                        var10_2 = "zT\u00b2F\u00d9\u00c9\u00f0t\u0010\u00bf\u00b2\u000b\u0080\u00fb\u00ed\u00b32w\u008d\u00a3\u00a4KX\f|$t:\u00bd`+\u0085\u00c9\u0091\u0012\f\u0005\u00fa\u0015\u0096S\u00e1\f;S\u0013UE\u0015\u00b3\u00d9\u00f1\u00d0&\u00ea";
                        var12_3 = "zT\u00b2F\u00d9\u00c9\u00f0t\u0010\u00bf\u00b2\u000b\u0080\u00fb\u00ed\u00b32w\u008d\u00a3\u00a4KX\f|$t:\u00bd`+\u0085\u00c9\u0091\u0012\f\u0005\u00fa\u0015\u0096S\u00e1\f;S\u0013UE\u0015\u00b3\u00d9\u00f1\u00d0&\u00ea".length();
                        var9_4 = 11;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 54;
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
                            var10_2 = "\u009d\u00a0\u00ab\u0081\u00d8\u0019\u00c2pe\u00e6|\u00ce\u000b\u00b4\u00c1\u008e\u00ad|\u009cV\u00c6\u00f3\u00f9 ";
                            var12_3 = "\u009d\u00a0\u00ab\u0081\u00d8\u0019\u00c2pe\u00e6|\u00ce\u000b\u00b4\u00c1\u008e\u00ad|\u009cV\u00c6\u00f3\u00f9 ".length();
                            var9_4 = 12;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 55;
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
                                    v15 = 78;
                                    break;
                                }
                                case 1: {
                                    v15 = 12;
                                    break;
                                }
                                case 2: {
                                    v15 = 80;
                                    break;
                                }
                                case 3: {
                                    v15 = 40;
                                    break;
                                }
                                case 4: {
                                    v15 = 81;
                                    break;
                                }
                                case 5: {
                                    v15 = 111;
                                    break;
                                }
                                default: {
                                    v15 = 13;
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
                uk.a = var13;
                uk.b = new String[7];
                var0_7 = 2841432360488787717L;
                var6_8 = new long[200];
                var3_9 = 0;
                var4_10 = "`\\\u0094\u00ben\u000e\u00d2\u0092/6\u00f7\u00e63\u0004\u00df~\u00b5.\u0097'%\u00a9\u008f9_\u00f2/\u007f\u00cc\u00ea^\u00b8\u0081\u00e9\u0091Z9\u00973\u0098\u00e9\u0088/\u00e8N\u00bb\u00ff\u00ca\u00d0g{z\u00feNhGkQy\u008b\u00d1\u00ccm\u00a9\u008eVU{\u0089\u0007\u00c0\r\u00aa\u0001\u008d\u00c8\u0080\u00e7\u00161K{X\u001c!h\u0082\u00c7\u00d8q\u00be\u00c9\u00ed}\u0086\u00bc\u00d0\u000b\u0015\u00d3\u001aRr\u00c2\u00c8\u00c7\u0006n\u00cc\u00f3\u00d8^\u0005\u00b5\u0017\u001dmx\u00e2\u001b\u008d\u00d7=<5}(\u001c\u008b\u00eaU\u00a4c\u00c4\u00cdi\u00a5\u00977\u001b\u00ee\u001bs\u0099\u00dc\u00b7\u0005U\u00ea\t\u00a0\u00ceR/\u00d3\u00c0f\u001c\u008f\u0085\u0097\u009d\u0089\u00a8\u00a9\u00a1I\u00fb\u00fe\u00b1\u000e*\u0013]\u0092\u0003\u00e8-\u00dc.\u00ca\u00e8.\u00deT2\u00b0\u00fb=I<\u00d6~\"\u00b8 \u008a\u00e0Z\u00a8\u0013\u000f\u00cd>\u00ba\u0080\u009b\u00b3a\u0019\u00971q\u00c9\u00cdv\u00c0qL\u00d7\f\u00bf\u0003\t\u00afW\u008a\u00beh{\u0013\u00b2c\u0087\u00e79:]\u00a8\u00ea\u0016\u00cf\u00cb GO\tVz\u00cb\\d\u0001\u00e5\u00f3\u0088\u00ef\u009d\u00e2\u0001r\u00e7 \u000f\u008dbN\u00a1\u00ce\u00ce\u00996`\u0015W\u00c4$Y\u00da\u00fd\u001d<kL\u00d4\u000b\u00be^\u00a6\u00d1\u00c8I\u00c2\u00d3\u00950\u00d4m\u0004`\u00df\"[u\u00c2\u00dd\u00d7\u00faq\u00a5\u00e4/s\u007fIS/\u0083*\u00f9$c\u00fb\r\u00ee\u00c7U\u0085\u00a0\u00e9\u009bCq\u00ee'\u00f5\u00d3(B\u00a52\u00e0\u0094\u008aMR\u0086\u00c8\u0091*d\u0098\te{\u0012\u0000\u0084\u00b6\u00bb\u00f8\u001d\u00a1\u00f1\u00c4^0\u00f5\u00ba\u00a9\u00a0\u00ccS\u00dbj\u001d\u00cfN\u00ce\u00bf\u00d6fz\u00e8\u0098S\u0098\u00b6\u00be\u0081\u00ae\u0097\u0094\n\u0004\u0083G\u00ce\u00dc\u00d9\u0004\u008ck\u0019\u00a0%\u00d2jr6&\u00f1W@\u007f\u00ac<qc\u008d\u0089x\u001a\u00d5\n\u00fa|\u0019\u00f8\u00b1\u009d\u00a4R\u00a1YR}\u00ce\u0001\u00bc\u00aas\u0019\u0098\u0089-4\u00bd\u00c4A\u00cd##X\u00fe\u00f9~e\u0090Z\u0014\u0087\u009d\u00e4@\u00ba*\u00df\u00cc\u00c2{\u0004i\u00fe\u00acY\u001f\u00d8<\u0001\u00f3\u00fe\u0017\u00f7\u0016v\u00c6o\u0018\u008b\u00a9\u00ab\u00f9\u0080\u008b\u00145\u008a\u0004F\u0002\u00de\u0006A=\u001f\u00dc\u00e3\u0015^\u0014\u00e0V\u00c9\u0082d\u009d,m(\u00f2a8M?=\u00f1\u007fMu\u0087\u0010t\u00b2\u00fe\u0096\u00ca}\u009c\u00f0\u00f2M\u00c8\u00af\u0094\u0015\u00ff\u00938dK\u00f7?\u000f\u008a\u00c5\u0012\u00c5\u00c9\u00cc\t\u00a0\u008f\u00dc\u009dNrn\u0011\u00045\u00b9\u00e0@{r[~qU\u00b8L\u00e1&\u0097\u001a'b\u00a8\u009e\u00da\t\u0018Ku\u001e\u00d0\u00bbe\u00c1\u00dde\u00f9\u00bc\u00f1 \u00de\u0091\u0005<\b3\u000f\u00c4\u00eb\u00d1\u00a2\u0006$\u00cb\b[\u00b7\u001d\u008a\u00b0\u00d4\u0014\u00bdF\u00c4|\u00d5lI6\u00a6\u001fMU\u00bb\u00ca\u0081M|\u00fa@\u00b4\u00cf\u009dZ\u0087(\u00cb\u009dO\u00b8\u0011~\u001fl%\u00be^p\u00ca\u0080\u00ddx\u009a%%\u00af}\u000e|\u0085\u00e5\u0087\u00b7\u00d3m\u00d4\u0007\u00bc!\u00a0\u00a4\u00d3$/\u0010\u00b8\u0099D\n\u009d\u00bf\u008a\\\\\u00b2\u00da\u00b2\u00ef\u00a6\u00c5\u00a9\u00b0\u00f1\u0018U\u001a=:\u0085E\u00aaW\u001e \u00ddf\u00dfP'~\u0013\u0096\u00c7Ho\u00f3\u009c\u00d6B\u00a3\u00d7=\u0007\u00e3\u0083\u00e7W\u008fY\u0082B\u00b3X\u0013\u009d\u00bbS\u0004\u00e1\u00abp\u00c6N\u000b\u00a6\u00f7\u0096\u00ebWZ1\u00a2\u00be\u000f\u00bb\u0080\u00d42K\u00da\u00ab\u0094\u00ce\u00a4\u00f4\u00e7\u00d6=)\u00b4\u0083ko\u00f1\u00a2\u00cfG\u0084\u00a7\u00bc\u00ab\u00f9\u0087#\u009d0\u00cf;\u00c4\u00b5\u00dfF\u00ee\u00f6\u00b9\u00da\u00ad\u00c9\u00cfpj\u0089\u000f \u00ad\u0092M\u00c0%]L\u00c4Q\u00ea\u0002\u00b2\u00a3\u00af\u0090\u0087\u00d7k\u00da\u008f\u001c\u00b0E\u00d8\u009dz\u00e82,?\u00few\u00a7\u00feG\u00e9x\u0085\u001aY<\u00df\u000f\u0015\u00a5\u009a3C\u0011\u000fB\u00eb\u00a0\u00f0\u0092\u00a9DVM\u0004/\u00ae\u00ee\u00c6\u008f\u0007\u0081\u0001\u00ef\u00faM$\u0080\u00d2}1?q\u0092\u00ed\u00f6\u009b\u008f\u0014CF\u0015\u0087NxD+\u00aa\u009c' |\u00d7\tx\u0091\u0016qZY\u00acG{\u00d3\u00f0\u00c7\u00c9\u00e2=\u0089k\u0007\u00f2[k3\u008b\u00fc\u00fe\u00a5\u00d8\u008e\u0091\u009a\u0017\u00e7\u00b2\u00d8\u0092\u00af^\u0087\u00b9&\u00aaX*#\u00ee\u00ad\u00c2\u0097\u00a8\u00a3o\u008e\u00cb^}!\u0091\u00dbe\u00b0]'\u0014\u0011\u00bc\u00f2\u00c3\u00c1rH\u0017/\u00ba\u00a3xm\u00d2S\u00f6\u0086 c\u00e4\u00f2hoNi\u0006GcE\u00a8'n\u00e7\u000e\u00a4\u00e1g\u00c2B\u0099\u0013\u00a1\u0086\u00f3\u0011\u0016\u008eR\u00efD\u00fc\u001aJZ\u00e5\u00c1\u000e\u00c8+\u0096x\u000f\u00ca\u0004\u00f8w\r\u0018\u0097S>\u0097)\u001fj\u00d9\u00eb\u009c\u00e7\u00b1\u00f74\u00fb\u00b3\u008a\u0019;w\u00dcl>\u009dR\u00b3\u00d0\u0096\u0082\u00ce\u0088\u000bwx\u009d\u00f6\u00d8\u00f6\u00c8;*4>\u0010i\u0013\u0016\u00ff.c\u00e0\u00a1\u00cd\u00e5\u00daB^\u008e7\u00a5[$\u00e4\u00fft\u0007\u0012\u00cai_\u0005\u00e0_&<\u00ebH\u00d4\u00ab\u0084&!\u00a8\u0087\u00c8\u00caLwc=\u009e\u00edz\f\u00c4\u00d7\u00ab\u0096\u00c3\u0096\u00d7\u0003I\u00e6\u00fd)\u00e0\u00b1\u00d2\u00aa\u00a4\u00fe\u00a9\u00e9s\u00fe\f\u00c4\u00a5\u00b2<#\u00df\u00e4\u00ec\u0088\u009d\u0019\u00a0\u00cb\\i\u009b\u00f9nP\u00dd)j\u0018\u000f\u0092\u00c1b\u0007h\u00e9\u00cdz|\u0016'\r\u0082\u00af\u00d7\u00b5\u00a1\u0010G8{w/H6O\u00ec\u0002?\u0003\u00c8ms\u000f\u00a1\u00da\u00ed7/\u00c3p0\u0016\u00c7G\u0017\u00e9\u0084<[\u0090>\u00828=\u0084\u00ad\u00fe\u0096\b\\E\u00af#E'\u00d4\u00d4\u00c1=1\u00926xn\u0014`)\u00b9*a\u00c6\u008d.3\u00d2\u00c5\u00ea\u00bc\u00d4\u0004\u00c2\u0091\u00cf-:\u00a7\u0019\u00bf\u00feN\u00ce7a#\u00d2R\u009d\u00ee,\u009e\u00c5\u0012>_\u00fc;\u000f*:\u009f?\u00d5>'q\u00ef\u00d6\u00f2\t\u00a5u\u00be\u0096\u00f7\u0014d\u00c3s\u00acC\u00d8\u008b\u00ff\t\u00f5\u00fb\u00e5\u0088\u00d8,\u001dV\u00b0\u0013\u0086\u0096\u00fc-\u001d\u00edD;\u00fd\u007fS\u00f5r\u008b$\u00a1\u00b5\u00e1\u00e7\u00e0\u0095\u0080\u00ef\u00e8UFmb|j\u00fbN\u0003\u00c2\u0090\u00a3\u0083L|\u0001{\u00c1\u00f2\u0090\u00das&\u0001\u0000b\u00bc\u00980\u00b5\u0097Bm\t\u00af,\rJ\u00e5b\u00a2\u00db\u00d8\u00aa3\u001aM\u00ee\u00e0\u0019\u00c8F\u0011\u0092t\u00ae\u00c7D\u00e0j\u00f1\u00ff\u0011\u00a8\u0014\u00b4\b\u0007\u00fa|\u0087\u008b\u00c8\u00e9]\u00ed*\u001b\u00b3\u0092\u008bpJ\u00c1\u00cd4\u00e5\u009eX\u0005a*\u00d7\u000f]e\u00ee3\u00ef\u00da\u0097\u0011\u00bf:@S\u008aNZ\u00eb\u00a3\u009aa\u00d6\b\u00ea\u00ed\u00e6\u00c9\u00ee\u0093%\u00b2z!\u008f\u00c1\u00ff9\u00a1\u00dc\u00b5\u00ad\u0083\u001b\u00c9\u00c9\u0019<c\u00b2\u00d6[\u00edSPr}yF\u00d9\u0084\u0011A\u00e3\u00fa\u0091P\u0006c\u00a23\u0007\u00df(\u0004\u00f2\u00af\u00e2n\u00c0+$&\u00cbq\u009cO\u00057\u0016F\u0011i*\u00b7\u001f.n\u00a4E]\u00b2\u00b2\u008e\u0014\u001a\u0015\u00e1\u0082\u0012\u00c2\u0006\u008c\u00de\u00c9\u00d4\u00b7\u0016\u0091l|^";
                var5_11 = "`\\\u0094\u00ben\u000e\u00d2\u0092/6\u00f7\u00e63\u0004\u00df~\u00b5.\u0097'%\u00a9\u008f9_\u00f2/\u007f\u00cc\u00ea^\u00b8\u0081\u00e9\u0091Z9\u00973\u0098\u00e9\u0088/\u00e8N\u00bb\u00ff\u00ca\u00d0g{z\u00feNhGkQy\u008b\u00d1\u00ccm\u00a9\u008eVU{\u0089\u0007\u00c0\r\u00aa\u0001\u008d\u00c8\u0080\u00e7\u00161K{X\u001c!h\u0082\u00c7\u00d8q\u00be\u00c9\u00ed}\u0086\u00bc\u00d0\u000b\u0015\u00d3\u001aRr\u00c2\u00c8\u00c7\u0006n\u00cc\u00f3\u00d8^\u0005\u00b5\u0017\u001dmx\u00e2\u001b\u008d\u00d7=<5}(\u001c\u008b\u00eaU\u00a4c\u00c4\u00cdi\u00a5\u00977\u001b\u00ee\u001bs\u0099\u00dc\u00b7\u0005U\u00ea\t\u00a0\u00ceR/\u00d3\u00c0f\u001c\u008f\u0085\u0097\u009d\u0089\u00a8\u00a9\u00a1I\u00fb\u00fe\u00b1\u000e*\u0013]\u0092\u0003\u00e8-\u00dc.\u00ca\u00e8.\u00deT2\u00b0\u00fb=I<\u00d6~\"\u00b8 \u008a\u00e0Z\u00a8\u0013\u000f\u00cd>\u00ba\u0080\u009b\u00b3a\u0019\u00971q\u00c9\u00cdv\u00c0qL\u00d7\f\u00bf\u0003\t\u00afW\u008a\u00beh{\u0013\u00b2c\u0087\u00e79:]\u00a8\u00ea\u0016\u00cf\u00cb GO\tVz\u00cb\\d\u0001\u00e5\u00f3\u0088\u00ef\u009d\u00e2\u0001r\u00e7 \u000f\u008dbN\u00a1\u00ce\u00ce\u00996`\u0015W\u00c4$Y\u00da\u00fd\u001d<kL\u00d4\u000b\u00be^\u00a6\u00d1\u00c8I\u00c2\u00d3\u00950\u00d4m\u0004`\u00df\"[u\u00c2\u00dd\u00d7\u00faq\u00a5\u00e4/s\u007fIS/\u0083*\u00f9$c\u00fb\r\u00ee\u00c7U\u0085\u00a0\u00e9\u009bCq\u00ee'\u00f5\u00d3(B\u00a52\u00e0\u0094\u008aMR\u0086\u00c8\u0091*d\u0098\te{\u0012\u0000\u0084\u00b6\u00bb\u00f8\u001d\u00a1\u00f1\u00c4^0\u00f5\u00ba\u00a9\u00a0\u00ccS\u00dbj\u001d\u00cfN\u00ce\u00bf\u00d6fz\u00e8\u0098S\u0098\u00b6\u00be\u0081\u00ae\u0097\u0094\n\u0004\u0083G\u00ce\u00dc\u00d9\u0004\u008ck\u0019\u00a0%\u00d2jr6&\u00f1W@\u007f\u00ac<qc\u008d\u0089x\u001a\u00d5\n\u00fa|\u0019\u00f8\u00b1\u009d\u00a4R\u00a1YR}\u00ce\u0001\u00bc\u00aas\u0019\u0098\u0089-4\u00bd\u00c4A\u00cd##X\u00fe\u00f9~e\u0090Z\u0014\u0087\u009d\u00e4@\u00ba*\u00df\u00cc\u00c2{\u0004i\u00fe\u00acY\u001f\u00d8<\u0001\u00f3\u00fe\u0017\u00f7\u0016v\u00c6o\u0018\u008b\u00a9\u00ab\u00f9\u0080\u008b\u00145\u008a\u0004F\u0002\u00de\u0006A=\u001f\u00dc\u00e3\u0015^\u0014\u00e0V\u00c9\u0082d\u009d,m(\u00f2a8M?=\u00f1\u007fMu\u0087\u0010t\u00b2\u00fe\u0096\u00ca}\u009c\u00f0\u00f2M\u00c8\u00af\u0094\u0015\u00ff\u00938dK\u00f7?\u000f\u008a\u00c5\u0012\u00c5\u00c9\u00cc\t\u00a0\u008f\u00dc\u009dNrn\u0011\u00045\u00b9\u00e0@{r[~qU\u00b8L\u00e1&\u0097\u001a'b\u00a8\u009e\u00da\t\u0018Ku\u001e\u00d0\u00bbe\u00c1\u00dde\u00f9\u00bc\u00f1 \u00de\u0091\u0005<\b3\u000f\u00c4\u00eb\u00d1\u00a2\u0006$\u00cb\b[\u00b7\u001d\u008a\u00b0\u00d4\u0014\u00bdF\u00c4|\u00d5lI6\u00a6\u001fMU\u00bb\u00ca\u0081M|\u00fa@\u00b4\u00cf\u009dZ\u0087(\u00cb\u009dO\u00b8\u0011~\u001fl%\u00be^p\u00ca\u0080\u00ddx\u009a%%\u00af}\u000e|\u0085\u00e5\u0087\u00b7\u00d3m\u00d4\u0007\u00bc!\u00a0\u00a4\u00d3$/\u0010\u00b8\u0099D\n\u009d\u00bf\u008a\\\\\u00b2\u00da\u00b2\u00ef\u00a6\u00c5\u00a9\u00b0\u00f1\u0018U\u001a=:\u0085E\u00aaW\u001e \u00ddf\u00dfP'~\u0013\u0096\u00c7Ho\u00f3\u009c\u00d6B\u00a3\u00d7=\u0007\u00e3\u0083\u00e7W\u008fY\u0082B\u00b3X\u0013\u009d\u00bbS\u0004\u00e1\u00abp\u00c6N\u000b\u00a6\u00f7\u0096\u00ebWZ1\u00a2\u00be\u000f\u00bb\u0080\u00d42K\u00da\u00ab\u0094\u00ce\u00a4\u00f4\u00e7\u00d6=)\u00b4\u0083ko\u00f1\u00a2\u00cfG\u0084\u00a7\u00bc\u00ab\u00f9\u0087#\u009d0\u00cf;\u00c4\u00b5\u00dfF\u00ee\u00f6\u00b9\u00da\u00ad\u00c9\u00cfpj\u0089\u000f \u00ad\u0092M\u00c0%]L\u00c4Q\u00ea\u0002\u00b2\u00a3\u00af\u0090\u0087\u00d7k\u00da\u008f\u001c\u00b0E\u00d8\u009dz\u00e82,?\u00few\u00a7\u00feG\u00e9x\u0085\u001aY<\u00df\u000f\u0015\u00a5\u009a3C\u0011\u000fB\u00eb\u00a0\u00f0\u0092\u00a9DVM\u0004/\u00ae\u00ee\u00c6\u008f\u0007\u0081\u0001\u00ef\u00faM$\u0080\u00d2}1?q\u0092\u00ed\u00f6\u009b\u008f\u0014CF\u0015\u0087NxD+\u00aa\u009c' |\u00d7\tx\u0091\u0016qZY\u00acG{\u00d3\u00f0\u00c7\u00c9\u00e2=\u0089k\u0007\u00f2[k3\u008b\u00fc\u00fe\u00a5\u00d8\u008e\u0091\u009a\u0017\u00e7\u00b2\u00d8\u0092\u00af^\u0087\u00b9&\u00aaX*#\u00ee\u00ad\u00c2\u0097\u00a8\u00a3o\u008e\u00cb^}!\u0091\u00dbe\u00b0]'\u0014\u0011\u00bc\u00f2\u00c3\u00c1rH\u0017/\u00ba\u00a3xm\u00d2S\u00f6\u0086 c\u00e4\u00f2hoNi\u0006GcE\u00a8'n\u00e7\u000e\u00a4\u00e1g\u00c2B\u0099\u0013\u00a1\u0086\u00f3\u0011\u0016\u008eR\u00efD\u00fc\u001aJZ\u00e5\u00c1\u000e\u00c8+\u0096x\u000f\u00ca\u0004\u00f8w\r\u0018\u0097S>\u0097)\u001fj\u00d9\u00eb\u009c\u00e7\u00b1\u00f74\u00fb\u00b3\u008a\u0019;w\u00dcl>\u009dR\u00b3\u00d0\u0096\u0082\u00ce\u0088\u000bwx\u009d\u00f6\u00d8\u00f6\u00c8;*4>\u0010i\u0013\u0016\u00ff.c\u00e0\u00a1\u00cd\u00e5\u00daB^\u008e7\u00a5[$\u00e4\u00fft\u0007\u0012\u00cai_\u0005\u00e0_&<\u00ebH\u00d4\u00ab\u0084&!\u00a8\u0087\u00c8\u00caLwc=\u009e\u00edz\f\u00c4\u00d7\u00ab\u0096\u00c3\u0096\u00d7\u0003I\u00e6\u00fd)\u00e0\u00b1\u00d2\u00aa\u00a4\u00fe\u00a9\u00e9s\u00fe\f\u00c4\u00a5\u00b2<#\u00df\u00e4\u00ec\u0088\u009d\u0019\u00a0\u00cb\\i\u009b\u00f9nP\u00dd)j\u0018\u000f\u0092\u00c1b\u0007h\u00e9\u00cdz|\u0016'\r\u0082\u00af\u00d7\u00b5\u00a1\u0010G8{w/H6O\u00ec\u0002?\u0003\u00c8ms\u000f\u00a1\u00da\u00ed7/\u00c3p0\u0016\u00c7G\u0017\u00e9\u0084<[\u0090>\u00828=\u0084\u00ad\u00fe\u0096\b\\E\u00af#E'\u00d4\u00d4\u00c1=1\u00926xn\u0014`)\u00b9*a\u00c6\u008d.3\u00d2\u00c5\u00ea\u00bc\u00d4\u0004\u00c2\u0091\u00cf-:\u00a7\u0019\u00bf\u00feN\u00ce7a#\u00d2R\u009d\u00ee,\u009e\u00c5\u0012>_\u00fc;\u000f*:\u009f?\u00d5>'q\u00ef\u00d6\u00f2\t\u00a5u\u00be\u0096\u00f7\u0014d\u00c3s\u00acC\u00d8\u008b\u00ff\t\u00f5\u00fb\u00e5\u0088\u00d8,\u001dV\u00b0\u0013\u0086\u0096\u00fc-\u001d\u00edD;\u00fd\u007fS\u00f5r\u008b$\u00a1\u00b5\u00e1\u00e7\u00e0\u0095\u0080\u00ef\u00e8UFmb|j\u00fbN\u0003\u00c2\u0090\u00a3\u0083L|\u0001{\u00c1\u00f2\u0090\u00das&\u0001\u0000b\u00bc\u00980\u00b5\u0097Bm\t\u00af,\rJ\u00e5b\u00a2\u00db\u00d8\u00aa3\u001aM\u00ee\u00e0\u0019\u00c8F\u0011\u0092t\u00ae\u00c7D\u00e0j\u00f1\u00ff\u0011\u00a8\u0014\u00b4\b\u0007\u00fa|\u0087\u008b\u00c8\u00e9]\u00ed*\u001b\u00b3\u0092\u008bpJ\u00c1\u00cd4\u00e5\u009eX\u0005a*\u00d7\u000f]e\u00ee3\u00ef\u00da\u0097\u0011\u00bf:@S\u008aNZ\u00eb\u00a3\u009aa\u00d6\b\u00ea\u00ed\u00e6\u00c9\u00ee\u0093%\u00b2z!\u008f\u00c1\u00ff9\u00a1\u00dc\u00b5\u00ad\u0083\u001b\u00c9\u00c9\u0019<c\u00b2\u00d6[\u00edSPr}yF\u00d9\u0084\u0011A\u00e3\u00fa\u0091P\u0006c\u00a23\u0007\u00df(\u0004\u00f2\u00af\u00e2n\u00c0+$&\u00cbq\u009cO\u00057\u0016F\u0011i*\u00b7\u001f.n\u00a4E]\u00b2\u00b2\u008e\u0014\u001a\u0015\u00e1\u0082\u0012\u00c2\u0006\u008c\u00de\u00c9\u00d4\u00b7\u0016\u0091l|^".length();
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
                    var4_10 = "\u00ae\u00d3\u00ac\u0095\u009dk#%bp6\u00f8\u0005\u00ba/\u00c1";
                    var5_11 = "\u00ae\u00d3\u00ac\u0095\u009dk#%bp6\u00f8\u0005\u00ba/\u00c1".length();
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
        uk.c = var6_8;
        uk.d = new Integer[200];
        uk.X = new uk();
    }

    @Override
    protected void M(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1136600556468966226L);
        hi.a("\u00f2", (Object)this, (boolean)false, (long)462451321936636354L);
    }

    private static String b(int n, int n2) {
        int n3 = (n ^ 0x3B15) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 248;
                case 1 -> 58;
                case 2 -> 113;
                case 3 -> 202;
                case 4 -> 222;
                case 5 -> 155;
                case 6 -> 80;
                case 7 -> 190;
                case 8 -> 47;
                case 9 -> 210;
                case 10 -> 251;
                case 11 -> 115;
                case 12 -> 133;
                case 13 -> 135;
                case 14 -> 169;
                case 15 -> 87;
                case 16 -> 120;
                case 17 -> 196;
                case 18 -> 149;
                case 19 -> 72;
                case 20 -> 123;
                case 21 -> 70;
                case 22 -> 212;
                case 23 -> 57;
                case 24 -> 165;
                case 25 -> 88;
                case 26 -> 34;
                case 27 -> 229;
                case 28 -> 108;
                case 29 -> 38;
                case 30 -> 17;
                case 31 -> 193;
                case 32 -> 180;
                case 33 -> 94;
                case 34 -> 237;
                case 35 -> 5;
                case 36 -> 49;
                case 37 -> 131;
                case 38 -> 102;
                case 39 -> 134;
                case 40 -> 74;
                case 41 -> 30;
                case 42 -> 4;
                case 43 -> 160;
                case 44 -> 178;
                case 45 -> 200;
                case 46 -> 234;
                case 47 -> 119;
                case 48 -> 199;
                case 49 -> 93;
                case 50 -> 206;
                case 51 -> 42;
                case 52 -> 96;
                case 53 -> 218;
                case 54 -> 172;
                case 55 -> 39;
                case 56 -> 164;
                case 57 -> 124;
                case 58 -> 128;
                case 59 -> 79;
                case 60 -> 60;
                case 61 -> 76;
                case 62 -> 101;
                case 63 -> 54;
                case 64 -> 99;
                case 65 -> 170;
                case 66 -> 24;
                case 67 -> 75;
                case 68 -> 219;
                case 69 -> 52;
                case 70 -> 56;
                case 71 -> 163;
                case 72 -> 183;
                case 73 -> 103;
                case 74 -> 10;
                case 75 -> 26;
                case 76 -> 48;
                case 77 -> 187;
                case 78 -> 97;
                case 79 -> 154;
                case 80 -> 37;
                case 81 -> 201;
                case 82 -> 159;
                case 83 -> 130;
                case 84 -> 243;
                case 85 -> 238;
                case 86 -> 161;
                case 87 -> 242;
                case 88 -> 16;
                case 89 -> 245;
                case 90 -> 145;
                case 91 -> 86;
                case 92 -> 7;
                case 93 -> 176;
                case 94 -> 139;
                case 95 -> 104;
                case 96 -> 253;
                case 97 -> 114;
                case 98 -> 141;
                case 99 -> 77;
                case 100 -> 250;
                case 101 -> 150;
                case 102 -> 225;
                case 103 -> 59;
                case 104 -> 125;
                case 105 -> 171;
                case 106 -> 207;
                case 107 -> 126;
                case 108 -> 15;
                case 109 -> 8;
                case 110 -> 21;
                case 111 -> 231;
                case 112 -> 221;
                case 113 -> 50;
                case 114 -> 230;
                case 115 -> 157;
                case 116 -> 173;
                case 117 -> 137;
                case 118 -> 203;
                case 119 -> 106;
                case 120 -> 32;
                case 121 -> 33;
                case 122 -> 132;
                case 123 -> 98;
                case 124 -> 43;
                case 125 -> 191;
                case 126 -> 19;
                case 127 -> 216;
                case 128 -> 255;
                case 129 -> 92;
                case 130 -> 51;
                case 131 -> 36;
                case 132 -> 194;
                case 133 -> 29;
                case 134 -> 184;
                case 135 -> 208;
                case 136 -> 117;
                case 137 -> 192;
                case 138 -> 146;
                case 139 -> 18;
                case 140 -> 27;
                case 141 -> 209;
                case 142 -> 185;
                case 143 -> 226;
                case 144 -> 55;
                case 145 -> 246;
                case 146 -> 110;
                case 147 -> 11;
                case 148 -> 211;
                case 149 -> 122;
                case 150 -> 85;
                case 151 -> 109;
                case 152 -> 244;
                case 153 -> 22;
                case 154 -> 90;
                case 155 -> 240;
                case 156 -> 44;
                case 157 -> 148;
                case 158 -> 147;
                case 159 -> 63;
                case 160 -> 46;
                case 161 -> 214;
                case 162 -> 151;
                case 163 -> 45;
                case 164 -> 182;
                case 165 -> 177;
                case 166 -> 91;
                case 167 -> 41;
                case 168 -> 249;
                case 169 -> 81;
                case 170 -> 247;
                case 171 -> 62;
                case 172 -> 64;
                case 173 -> 227;
                case 174 -> 189;
                case 175 -> 152;
                case 176 -> 65;
                case 177 -> 197;
                case 178 -> 239;
                case 179 -> 166;
                case 180 -> 2;
                case 181 -> 217;
                case 182 -> 84;
                case 183 -> 95;
                case 184 -> 66;
                case 185 -> 9;
                case 186 -> 156;
                case 187 -> 83;
                case 188 -> 118;
                case 189 -> 82;
                case 190 -> 111;
                case 191 -> 107;
                case 192 -> 142;
                case 193 -> 89;
                case 194 -> 186;
                case 195 -> 14;
                case 196 -> 20;
                case 197 -> 100;
                case 198 -> 228;
                case 199 -> 12;
                case 200 -> 1;
                case 201 -> 0;
                case 202 -> 213;
                case 203 -> 167;
                case 204 -> 13;
                case 205 -> 223;
                case 206 -> 136;
                case 207 -> 35;
                case 208 -> 116;
                case 209 -> 252;
                case 210 -> 40;
                case 211 -> 205;
                case 212 -> 153;
                case 213 -> 215;
                case 214 -> 233;
                case 215 -> 195;
                case 216 -> 181;
                case 217 -> 138;
                case 218 -> 3;
                case 219 -> 53;
                case 220 -> 67;
                case 221 -> 31;
                case 222 -> 174;
                case 223 -> 71;
                case 224 -> 235;
                case 225 -> 175;
                case 226 -> 220;
                case 227 -> 162;
                case 228 -> 73;
                case 229 -> 78;
                case 230 -> 105;
                case 231 -> 140;
                case 232 -> 232;
                case 233 -> 6;
                case 234 -> 168;
                case 235 -> 241;
                case 236 -> 121;
                case 237 -> 68;
                case 238 -> 188;
                case 239 -> 129;
                case 240 -> 25;
                case 241 -> 127;
                case 242 -> 28;
                case 243 -> 254;
                case 244 -> 144;
                case 245 -> 158;
                case 246 -> 69;
                case 247 -> 143;
                case 248 -> 179;
                case 249 -> 23;
                case 250 -> 198;
                case 251 -> 112;
                case 252 -> 224;
                case 253 -> 61;
                case 254 -> 236;
                default -> 204;
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
            uk.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4870;
        if (d[n2] == null) {
            uk.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
