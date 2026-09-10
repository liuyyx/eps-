/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.InputConstants$Key
 *  net.minecraft.client.KeyMapping
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.uT;
import com.mojang.blaze3d.platform.InputConstants;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.KeyMapping;

public class dF {
    public static final int p = -1;
    public static final int s;
    private static String[] O;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    /*
     * Enabled aggressive block sorting
     */
    public static String a(int n) {
        int n2 = hi.a("G", (int)(dF.a(10184, 3465148699271218165L) / dF.a(3990, 1353927222468635551L) - dF.a(15623, 4199774266598381878L)), (int)dF.a(29347, 863488584811190013L), (long)834203424483934088L) / dF.a(23851, 2702290001297553670L) ^ dF.a(6014, 4547522184020882288L);
        block7: while (true) {
            block9: {
                switch (n2) {
                    default: {
                        if (n != -1) break;
                        n2 = dF.a(26315, 5178537133920387799L) - dF.a(10131, 6962959120211821480L) - dF.a(13110, 7837453833485113127L);
                        continue block7;
                    }
                    case -2073603376: {
                        return dF.K("gqIliCKoiu6azXXj", a(), (uT)((Object)hi.a("j", (long)863310461756277359L)));
                    }
                    case -2073603372: {
                        if (hi.a("G", (int)n, (long)525303406604919947L) != false) {
                            n2 = dF.a(18417, 4222464975235687338L) * dF.a(3039, 2832551647493681130L) + dF.a(5922, 3932526465405481732L);
                            continue block7;
                        }
                        break block9;
                    }
                    case -2073603373: {
                        return a + (int)(hi.a("G", (int)n, (long)1236006381065832221L) + true);
                    }
                    case -2073603374: {
                        return hi.a("\u00a5", (Object)dF.K("gqIliCKoiu6azXXj", getDisplayName(), (InputConstants.Key)hi.a("\u00a5", (Object)hi.a("j", (long)885657136869177664L), (int)n, (long)610860604259025224L)), (long)445233814433577985L);
                    }
                    case -2073603375: {
                        return hi.a("G", (int)1, (long)683539552130499618L);
                    }
                }
                n2 = hi.a("G", (int)(dF.a(6431, 4674980142004600096L) - dF.a(5021, 7668690959926589383L)), (int)dF.a(26108, 162802019295756752L), (long)834203424483934088L) + dF.a(16155, 6895032048120486658L) ^ dF.a(26896, 4274592033579371841L) ^ dF.a(28072, 3049403310683621800L);
                continue;
            }
            n2 = (dF.a(30971, 5420077418011598013L) ^ dF.a(4565, 7807606347215140312L)) / 4 - dF.a(13547, 5737051881072742587L);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean B(int var0) {
        block24: {
            block28: {
                block23: {
                    block22: {
                        var1_1 = Dl.t();
                        var3_2 /* !! */  = dF.K("gqIliCKoiu6azXXj", max(int int ), (int)dF.a(24070, 4541142419155171887L), (int)dF.a(14675, 5854357317698706787L)) ^ dF.a(11020, 4246181978895863625L);
                        if (!var1_1) ** GOTO lbl16
                        block14: while (true) {
                            block27: {
                                block26: {
                                    block25: {
                                        v0 = var0;
                                        v1 = -1;
                                        if (var1_1) break block25;
                                        if (v0 == v1) break block26;
                                        v0 = dF.a(32512, 6940960798414183215L) + dF.a(28782, 7960287436882941043L) - dF.a(12586, 6368243868835108105L) ^ dF.a(26091, 8030012946783863260L);
                                        v1 = dF.a(32097, 6391153633878907210L);
                                    }
                                    var3_2 /* !! */  = v0 ^ v1;
                                    if (!var1_1) break block27;
                                }
                                var3_2 /* !! */  = dF.a(12030, 4299687679089855225L) * dF.a(23533, 8920276339205783483L) * dF.a(24356, 3810599652535712545L) + dF.a(5329, 1636676177797410946L) + dF.a(29026, 5710003466474165626L);
                            }
                            switch (var3_2 /* !! */ ) {
                                default: {
                                    continue block14;
                                }
                                case 2104796497: {
                                    return false;
                                }
                                case 2104796496: {
                                    var2_3 = hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)501728103734382890L);
                                    v2 /* !! */  = hi.a("G", (int)var0, (long)525303406604919947L);
                                    if (var1_1) break block22;
                                    if (v2 /* !! */  == false) break block14;
                                    break block23;
                                }
                                case 2104796495: {
                                    return false;
                                }
                            }
                            break;
                        }
                        v2 /* !! */  = (CallSite)(dF.a(26121, 8699165438115250716L) - dF.a(10594, 3008071454092741943L) ^ dF.a(13949, 7910265624456188519L));
                    }
                    var3_2 /* !! */  = (int)v2 /* !! */ ;
                    if (!var1_1) break block28;
                }
                var3_2 /* !! */  = hi.a("G", (int)dF.a(17829, 8676128394233455003L), (int)dF.a(8520, 859654179814163825L), (long)834203424483934088L) - dF.a(18973, 3887722357808803391L) ^ dF.a(28349, 4746708148415695548L);
                if (var1_1) ** GOTO lbl59
            }
            block15: while (true) {
                switch (var3_2 /* !! */ ) {
                    default: {
                        v3 /* !! */  = hi.a("G", (long)hi.a("\u00a5", (Object)var2_3, (long)1197494539237906052L), (int)hi.a("G", (int)var0, (long)1236006381065832221L), (long)605397934897782849L);
                        v4 = 1;
                        if (var1_1) ** GOTO lbl61
                        if (v3 /* !! */  != v4) ** GOTO lbl59
                        ** GOTO lbl63
                    }
                    case -1431749188: {
                        v5 = true;
                        var3_2 /* !! */  = (dF.a(31614, 4664736242140028766L) ^ dF.a(9298, 1558286503920058470L)) * dF.a(8749, 7863624714800121449L) ^ dF.a(29935, 2282246542880641235L);
                        if (!var1_1) break block24;
                        ** GOTO lbl65
                    }
                    case -1431749185: {
                        v5 = false;
                        if (var1_1) {
                            return v5;
                        }
                        ** GOTO lbl65
                    }
                    case -1431749184: {
                        throw null;
                    }
lbl59:
                    // 2 sources

                    v3 /* !! */  = (CallSite)(dF.a(31943, 896185063692605633L) + dF.a(32568, 7202229287873190716L));
                    v4 = dF.a(27480, 2324870280190758774L);
lbl61:
                    // 2 sources

                    var3_2 /* !! */  = (int)(v3 /* !! */  - v4);
                    if (!var1_1) continue block15;
lbl63:
                    // 2 sources

                    var3_2 /* !! */  = dF.a(21282, 4332087335734228756L) + dF.a(10893, 2677987925022723718L) - dF.a(26638, 9210470792084818991L);
                    continue block15;
lbl65:
                    // 2 sources

                    var3_2 /* !! */  = (dF.a(236, 4061314726571533534L) ^ dF.a(8474, 9092583654666880278L)) * dF.a(371, 5587440690447902004L) ^ dF.a(4051, 7164477434130000859L);
                    break block24;
                    case -1431749187: 
                }
                break;
            }
            return (boolean)hi.a("G", (Object)var2_3, (int)var0, (long)396354291557487238L);
        }
        block16: while (true) {
            switch (var3_2 /* !! */ ) {
                case 1115853581: {
                    dF.K("gqIliCKoiu6azXXj", B());
                    var3_2 /* !! */  = (dF.a(31454, 6232999955235937998L) + dF.a(27823, 8317418336283920632L) + dF.a(18669, 7811076535461063882L)) / dF.a(5034, 2681170604617332622L) + dF.a(24515, 527059604348484573L) ^ dF.a(18238, 1845276726827361127L);
                    continue block16;
                }
            }
            break;
        }
        return v5;
    }

    public static int e(int n) {
        return dF.a(17197, 1111278543072896789L) - n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean L(int var0) {
        var1_1 /* !! */  = dF.a(9740, 5958332098285650456L) / dF.a(24686, 4186978647446946925L) / dF.a(10844, 8723192805419306574L) - dF.a(31587, 9053551055928401727L);
        block8: while (true) {
            block10: {
                switch (var1_1 /* !! */ ) {
                    default: {
                        if (var0 <= dF.a(29099, 247716012223010209L)) {
                            var1_1 /* !! */  = (int)(hi.a("G", (int)hi.a("G", (int)(hi.a("G", (int)dF.a(32750, 7989365289623526365L), (int)dF.a(14640, 7318980111086607725L), (long)834203424483934088L) + dF.a(31379, 546559693718986368L)), (int)dF.a(24043, 451925540216814015L), (long)834203424483934088L), (int)dF.a(14758, 2166893823790702013L), (long)834203424483934088L) - dF.a(24547, 8539066865354030001L));
                            continue block8;
                        }
                        break block10;
                    }
                    case -18963036: {
                        v0 = true;
                        var1_1 /* !! */  = (dF.a(12541, 4085424266398684322L) ^ dF.a(1871, 958181781365941109L)) + dF.a(13582, 5620086992332345612L);
                        ** GOTO lbl16
                    }
                    case -18963038: {
                        v0 = false;
                        var1_1 /* !! */  = (dF.a(10265, 2860301944245308438L) ^ dF.a(4195, 3598799691524961404L)) + dF.a(12713, 3950277512957810060L);
lbl16:
                        // 2 sources

                        switch (var1_1 /* !! */ ) {
                            case -623808179: {
                                hi.a("G", (long)672565527819449937L);
                                return v0;
                            }
                        }
                        return v0;
                    }
                    case -18963035: 
                }
                throw null;
            }
            var1_1 /* !! */  = dF.a(30529, 9101132637933409111L) + dF.a(5758, 973550629369508436L) ^ dF.a(30129, 663637345109578217L) ^ dF.a(26745, 9041806003589942353L);
        }
    }

    public static int B(KeyMapping keyMapping) {
        return (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)keyMapping, (long)524216041579424984L), (long)1316914862415438553L);
    }

    public static int F(int n) {
        return dF.a(29099, 247716012223010209L) - n;
    }

    public static /* bridge */ /* synthetic */ CallSite K(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static boolean h(KeyMapping keyMapping) {
        return (boolean)hi.a("G", (int)hi.a("G", (Object)keyMapping, (long)665194623226448465L), (long)759451198843871681L);
    }

    private dF() {
    }

    public static void E(String[] stringArray) {
        O = stringArray;
    }

    public static String[] d() {
        return O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    if (dF.d() != null) break block20;
                    dF.E(new String[1]);
                    break block20;
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "<j\u0013\b;%".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 15;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl57
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 126;
                                break;
                            }
                            case 1: {
                                v9 = 10;
                                break;
                            }
                            case 2: {
                                v9 = 105;
                                break;
                            }
                            case 3: {
                                v9 = 116;
                                break;
                            }
                            case 4: {
                                v9 = 81;
                                break;
                            }
                            case 5: {
                                v9 = 10;
                                break;
                            }
                            default: {
                                v9 = 104;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl57:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                dF.a = new String(v10).intern();
                var0_1 = 8961480734858854897L;
                var6_2 = new long[84];
                var3_3 = 0;
                var4_4 = "\u0095?\u0099\u00a7\u0099\u00f8\u00ea?\u0087\u00f6Jgb'\u00d5?\u00e1\u0097\u00e1+\u00bew^\u008eU\u0004C}\u009dw\u00e1\u00b8\u00b2\u00c1\u00843\u0080\"&E-\u008a_\u00e3\f\u0086\u000f\u00b2)\u00a6\u007f\u00a1\t\u0088\u00fa\u00a8\u00b3\u00cb5\u00eay\u00cc\u0087\u00bf.\u00a9%\u0095\fY\u00cd3N(\u008e\u0092\u00f8\u00af\u0003\u00ad\f\u00a2\u00da^\u00a3)\u00fc\u00bd\u0097\u00c7\u00b1\u001a\u00db%^\u00a3\u00df\u00d0ep\u0003\t,\u00e3R\u008d\u009b\u00c1\u001d\u008ejX$~\u0002\u0000\u00d5:\u00cfk\u0098\u008c\u00ee\u009a\u0090Px\u00d4\u00a80`\u00c1/\u00ba\u0091\u009fB\u00ac\u00ac\u00ea\u0007\u00b9\u001a\u008a\u00fbj,ws\u00c1\u00073\u0015\u00f2\u001c\u00bc\u0013\u00ee\u0097\u00cb%o\u00f5\u00cf\u00e5\u00fcE\u0092\u001a\u00f0A\u0085|\u00e7=\u00bfO\u0085\u00d0\u0086\u00fc\u00d2<1#\u0014:\u00f4F\u00b0\u00fb_\u00d8\u00b9\u008a\u00eb\u00a5\u0091\u00b1S\u001e\u000e^\u00c48Ti\u00e4-\u00f1\u00f0\u009c\u0088zb\u0018|\u0001X\u00f0\u00cc$\u00b8\u00ec :\u00a8j\u00982qG\u00ac3\r\u00ba\u00f8\u0081\u00ab\u00aev\u0083\u00dd\u00d6<=\u00aaa\u00bduD\u0015\u00a1\u0081\u00b0m\u00dejc\u00deXm\u00af\"m\u00e5+R\u0094-\u001c\tg\u001f\u00f6>G\u00b7\u00fe2\u0096\u00aa\u00fb\u008c\u00b2\u00a5=\u009c\u001c&\u00f67\u00809y\u0001O\u00f7\u0012m\u00f0#\u00c0\u0011\u00da\u00ae\u00d9Y\u00dbqk\u0018\u009c\u0015\u009d\u00ddo\u00eeyD\u0085\u00d0\u00cd\u00ac\u00ed\u00a4\u0005\t\u00d9\u001f\u00e3DV\u0003\u00f1W\u00c3\"iR,\u00eas\u00d3\u00a7\u00a2|\u00a3A\\\u00cbe:3\u00a9\u0085\u0084\u0002\\no\u00b3\u00de\u00abg\u00e9\u00da:\u00b0\u00fbM\u0013\u00f3\u00cfA\u0002\u001a\u00c5\u00dd\u0090\u001fd\u0099\u001a\u0014\u00ae\u0080C\u00e3C\u0088BY\u00b3n#\u00c5K(\u00b4e\u0016I8X49?\u0087\u00e5\fu\b\u00ab\u00b6wJ\u00d0$\u0011w\u0003S\u0097N\u0089\u00d5\u00d5\u00ca]\u0015\u000e \u00ab_s-\u0099f\u00be\u00ab;\u009c\u00c4\u0095\u00dd\u00bb\u0091f\u0086b\u0092\u009a\u0012\u00f2\nh\u008a\u00a1\u00a5yx\u001d\u00868\u00bd\u000eR\u00c1\u00aa\u00f8\u00f1Xt\u00d0\tO\u00d5\u00f2!`M\u00b9\u00d7{~\u0098@\u00c5\u0016?2\u00df\u00d3\u00c7l\u00a5W\u00d2|\u0015\u00da\u0091\u00f4\u0013z\u008a\u00b0=zo\u00f0A\u00d1\u00f7\u008e\u000f`\u00ado:\u00fe\u0002\u00c5\u00d5\u00d0\u0000g\u0007V\u00b5Xj\u00c6T6<\u0090\u0085\u00ab\u00ec\b\u00ebs\u009cY\u00ddj\u00de\u00cdU\u00c20\u00f9\u0094\u00bb\u009b\u00ea\u0088\u00e4\n\u00cc\u00eapss\u00aa\u00far\u00ac\u00956%vJ\u00d8\u0014\u0004nI\u0097\u00fc)\u00e7\u00ca\u00fa7\u00b7Z\u00aem\f\u007f\u00d3\u008f\u001e\u00ad\u0097\u0003\u0088`=\u00b1\t\"\u00c5D&\u009deI@J\u00ba\u00bc\u0019\u0010\u00e1\u00a7\u00e9\u00d0\u00fc\u0090\u0085\u000e\u00ad\u00c9\u009dPn\r\u00f3R\u00c8\u00fe=\u00a6t+\u0088\u0015\u009c\u001a\u00adf\u00b3\f\u00ba\u00d8I\u00c1G1=\u00b2\u00ee";
                var5_5 = "\u0095?\u0099\u00a7\u0099\u00f8\u00ea?\u0087\u00f6Jgb'\u00d5?\u00e1\u0097\u00e1+\u00bew^\u008eU\u0004C}\u009dw\u00e1\u00b8\u00b2\u00c1\u00843\u0080\"&E-\u008a_\u00e3\f\u0086\u000f\u00b2)\u00a6\u007f\u00a1\t\u0088\u00fa\u00a8\u00b3\u00cb5\u00eay\u00cc\u0087\u00bf.\u00a9%\u0095\fY\u00cd3N(\u008e\u0092\u00f8\u00af\u0003\u00ad\f\u00a2\u00da^\u00a3)\u00fc\u00bd\u0097\u00c7\u00b1\u001a\u00db%^\u00a3\u00df\u00d0ep\u0003\t,\u00e3R\u008d\u009b\u00c1\u001d\u008ejX$~\u0002\u0000\u00d5:\u00cfk\u0098\u008c\u00ee\u009a\u0090Px\u00d4\u00a80`\u00c1/\u00ba\u0091\u009fB\u00ac\u00ac\u00ea\u0007\u00b9\u001a\u008a\u00fbj,ws\u00c1\u00073\u0015\u00f2\u001c\u00bc\u0013\u00ee\u0097\u00cb%o\u00f5\u00cf\u00e5\u00fcE\u0092\u001a\u00f0A\u0085|\u00e7=\u00bfO\u0085\u00d0\u0086\u00fc\u00d2<1#\u0014:\u00f4F\u00b0\u00fb_\u00d8\u00b9\u008a\u00eb\u00a5\u0091\u00b1S\u001e\u000e^\u00c48Ti\u00e4-\u00f1\u00f0\u009c\u0088zb\u0018|\u0001X\u00f0\u00cc$\u00b8\u00ec :\u00a8j\u00982qG\u00ac3\r\u00ba\u00f8\u0081\u00ab\u00aev\u0083\u00dd\u00d6<=\u00aaa\u00bduD\u0015\u00a1\u0081\u00b0m\u00dejc\u00deXm\u00af\"m\u00e5+R\u0094-\u001c\tg\u001f\u00f6>G\u00b7\u00fe2\u0096\u00aa\u00fb\u008c\u00b2\u00a5=\u009c\u001c&\u00f67\u00809y\u0001O\u00f7\u0012m\u00f0#\u00c0\u0011\u00da\u00ae\u00d9Y\u00dbqk\u0018\u009c\u0015\u009d\u00ddo\u00eeyD\u0085\u00d0\u00cd\u00ac\u00ed\u00a4\u0005\t\u00d9\u001f\u00e3DV\u0003\u00f1W\u00c3\"iR,\u00eas\u00d3\u00a7\u00a2|\u00a3A\\\u00cbe:3\u00a9\u0085\u0084\u0002\\no\u00b3\u00de\u00abg\u00e9\u00da:\u00b0\u00fbM\u0013\u00f3\u00cfA\u0002\u001a\u00c5\u00dd\u0090\u001fd\u0099\u001a\u0014\u00ae\u0080C\u00e3C\u0088BY\u00b3n#\u00c5K(\u00b4e\u0016I8X49?\u0087\u00e5\fu\b\u00ab\u00b6wJ\u00d0$\u0011w\u0003S\u0097N\u0089\u00d5\u00d5\u00ca]\u0015\u000e \u00ab_s-\u0099f\u00be\u00ab;\u009c\u00c4\u0095\u00dd\u00bb\u0091f\u0086b\u0092\u009a\u0012\u00f2\nh\u008a\u00a1\u00a5yx\u001d\u00868\u00bd\u000eR\u00c1\u00aa\u00f8\u00f1Xt\u00d0\tO\u00d5\u00f2!`M\u00b9\u00d7{~\u0098@\u00c5\u0016?2\u00df\u00d3\u00c7l\u00a5W\u00d2|\u0015\u00da\u0091\u00f4\u0013z\u008a\u00b0=zo\u00f0A\u00d1\u00f7\u008e\u000f`\u00ado:\u00fe\u0002\u00c5\u00d5\u00d0\u0000g\u0007V\u00b5Xj\u00c6T6<\u0090\u0085\u00ab\u00ec\b\u00ebs\u009cY\u00ddj\u00de\u00cdU\u00c20\u00f9\u0094\u00bb\u009b\u00ea\u0088\u00e4\n\u00cc\u00eapss\u00aa\u00far\u00ac\u00956%vJ\u00d8\u0014\u0004nI\u0097\u00fc)\u00e7\u00ca\u00fa7\u00b7Z\u00aem\f\u007f\u00d3\u008f\u001e\u00ad\u0097\u0003\u0088`=\u00b1\t\"\u00c5D&\u009deI@J\u00ba\u00bc\u0019\u0010\u00e1\u00a7\u00e9\u00d0\u00fc\u0090\u0085\u000e\u00ad\u00c9\u009dPn\r\u00f3R\u00c8\u00fe=\u00a6t+\u0088\u0015\u009c\u001a\u00adf\u00b3\f\u00ba\u00d8I\u00c1G1=\u00b2\u00ee".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = ":\u0081\u0010\u0094?]A\u00c0g\u00cb\u0098\r\u00ff\u00a2/\u00e7";
                    var5_5 = ":\u0081\u0010\u0094?]A\u00c0g\u00cb\u0098\r\u00ff\u00a2/\u00e7".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl102:
                // 1 sources

                ** continue;
            }
        }
        dF.b = var6_2;
        dF.c = new Integer[84];
        dF.s = dF.a(12327, 5865228096738939952L);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6417;
        if (c[n2] == null) {
            dF.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
