/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.protocol.game.ServerboundPlayerActionPacket
 *  net.minecraft.world.food.FoodProperties
 *  net.minecraft.world.item.ItemStack
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.dQ;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.nj;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

public class k
extends e {
    public static final k h;
    private ItemStack V;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\\:\u001eI*\u0002\u0012I:\t".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 113;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 125;
                                break;
                            }
                            case 1: {
                                v9 = 42;
                                break;
                            }
                            case 2: {
                                v9 = 12;
                                break;
                            }
                            case 3: {
                                v9 = 83;
                                break;
                            }
                            case 4: {
                                v9 = 62;
                                break;
                            }
                            case 5: {
                                v9 = 7;
                                break;
                            }
                            default: {
                                v9 = 67;
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
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                k.a = new String(v10).intern();
                var0_1 = 1850814550292532590L;
                var6_2 = new long[53];
                var3_3 = 0;
                var4_4 = "\u00a3\"\u0017\u00e1h\u0087Gw[h\u0015\u00dfh-\u00b60y\u00b0\u00b8;\u0091y\u00be\u00db\u000f%\u0080\u00b2\u00a6\u00f8\u00bd)\u0098\u00d2\u00b8#\u00b1x\u008a`\u00f8y\u00a9\u00b3m\u008f\u001c\u00e9d+b%\u00d32g\u00f8l\\\u00f42o\u0014%/\u00f4\u001dw\u0003\u00ca\u007f\u0096\u00ce\u008c\u00ba \u00c6\u001c9\u00e0\u001f\u0094\u00ec\u00b0\u001erS\t~^\u0001N,\r\u009dUbf\u00e1>\u00df,C\u0003\u00f3\u00e2Q\u0080Z\u00e8\u0013\u00a5\u00b93\u00e4\u00b9G\u00fd\u00be\u009d\u009d]_?\u00e6\u00ac\u00cb\u00ee\u00f8\u0097\u000eTo\u0000\u0089\f\u00872\u008a\u0099R\u009b\u00d7\u00d5(n<{:\u00ed}A\u00b5\u00b1\u0091\u0001\u00f5\u0006u\u00d1\u00ff\u00b71\u00ed\u000bA\u0098=\r\u00f7\u00bf3\u00ddsw\u00cf\u009c\u007f\u00dd\u00e4\u00ed\u00b2\u007f\u008c\u00f8\u00d8\u0095Nt\u00a6\u0010\u0098`\u0088\u00b1\u00e3\u0090\u0089\u0091\u0014\u009dp\u0082\u0098\u00e7\u00d7\u00d1\u0010q!|RE1\u0081\u00f8s\u008dV$\u00d2\u001d\u000f\u00bfR\u00b98\u0099\u0007=\u00acGM\u0017M\u00e4\u0085\u00e7\u0080@\t\u001f\u0092\u0091\u0086e\u00fbA\u00fd,\u00c1q9\t\u00dd\t\u00c4\u000b\u0002\u00ef\u009f\u00d7\u00db!-\u00f8\u00c9\u00b0\u0090\u00c1E\u00f5\u00fa\u000f\u00c1P \u00b0bk\u008a\u001e\u00ea\u000e\u0000\u0087\u00a2o4\u008f\u00e4@\u001aT\u00e1\u00cc\u0091\u00bek\u00b6I\u000f \u0093\u0090\u0013NY\u00a6\u00ff\u00ea\u008a\u00e5\u00d9\u00e4G\u00e07\u00e6\u00b0\u00a0\u0081\u0084\u00aeMFG\u00eb3~\u00e3\u00d5w\u00136\u00c7B\u0081\u00f5\u00a4:\u00be<:K\u00f9\u0003\u00e2a\u00bb#\u0017\u00ae\u0017\u00b3\u00eff\u00e0\u00d8,9\u00d4\u00adx\u001d\u0010\u000e^r#\u00c4\u0086n\u00a4\u00e6\u00f2\u0016]\u009b9o\u001b\u00fdm\u008d\u00b5\u00baq\u00ee\u0086\u0011\u00f0k\u00d5\u0007\u00d5\u008c\u008e%\u00ed\u00c3\u0089\u0004\u0016\u00a1\u00bbfDX";
                var5_5 = "\u00a3\"\u0017\u00e1h\u0087Gw[h\u0015\u00dfh-\u00b60y\u00b0\u00b8;\u0091y\u00be\u00db\u000f%\u0080\u00b2\u00a6\u00f8\u00bd)\u0098\u00d2\u00b8#\u00b1x\u008a`\u00f8y\u00a9\u00b3m\u008f\u001c\u00e9d+b%\u00d32g\u00f8l\\\u00f42o\u0014%/\u00f4\u001dw\u0003\u00ca\u007f\u0096\u00ce\u008c\u00ba \u00c6\u001c9\u00e0\u001f\u0094\u00ec\u00b0\u001erS\t~^\u0001N,\r\u009dUbf\u00e1>\u00df,C\u0003\u00f3\u00e2Q\u0080Z\u00e8\u0013\u00a5\u00b93\u00e4\u00b9G\u00fd\u00be\u009d\u009d]_?\u00e6\u00ac\u00cb\u00ee\u00f8\u0097\u000eTo\u0000\u0089\f\u00872\u008a\u0099R\u009b\u00d7\u00d5(n<{:\u00ed}A\u00b5\u00b1\u0091\u0001\u00f5\u0006u\u00d1\u00ff\u00b71\u00ed\u000bA\u0098=\r\u00f7\u00bf3\u00ddsw\u00cf\u009c\u007f\u00dd\u00e4\u00ed\u00b2\u007f\u008c\u00f8\u00d8\u0095Nt\u00a6\u0010\u0098`\u0088\u00b1\u00e3\u0090\u0089\u0091\u0014\u009dp\u0082\u0098\u00e7\u00d7\u00d1\u0010q!|RE1\u0081\u00f8s\u008dV$\u00d2\u001d\u000f\u00bfR\u00b98\u0099\u0007=\u00acGM\u0017M\u00e4\u0085\u00e7\u0080@\t\u001f\u0092\u0091\u0086e\u00fbA\u00fd,\u00c1q9\t\u00dd\t\u00c4\u000b\u0002\u00ef\u009f\u00d7\u00db!-\u00f8\u00c9\u00b0\u0090\u00c1E\u00f5\u00fa\u000f\u00c1P \u00b0bk\u008a\u001e\u00ea\u000e\u0000\u0087\u00a2o4\u008f\u00e4@\u001aT\u00e1\u00cc\u0091\u00bek\u00b6I\u000f \u0093\u0090\u0013NY\u00a6\u00ff\u00ea\u008a\u00e5\u00d9\u00e4G\u00e07\u00e6\u00b0\u00a0\u0081\u0084\u00aeMFG\u00eb3~\u00e3\u00d5w\u00136\u00c7B\u0081\u00f5\u00a4:\u00be<:K\u00f9\u0003\u00e2a\u00bb#\u0017\u00ae\u0017\u00b3\u00eff\u00e0\u00d8,9\u00d4\u00adx\u001d\u0010\u000e^r#\u00c4\u0086n\u00a4\u00e6\u00f2\u0016]\u009b9o\u001b\u00fdm\u008d\u00b5\u00baq\u00ee\u0086\u0011\u00f0k\u00d5\u0007\u00d5\u008c\u008e%\u00ed\u00c3\u0089\u0004\u0016\u00a1\u00bbfDX".length();
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
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00a9v\u0007\u00a4\u0000\u00e5\u0005\u000bny\u008c}\u001f\u00e9O\u0007";
                    var5_5 = "\u00a9v\u0007\u00a4\u0000\u00e5\u0005\u000bny\u008c}\u001f\u00e9O\u0007".length();
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
lbl88:
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
lbl99:
                // 1 sources

                ** continue;
            }
        }
        k.b = var6_2;
        k.c = new Integer[53];
        k.h = new k();
    }

    private k() {
        super(a, (vY)((Object)hi.a("j", (long)526176563220736169L)));
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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @yE
    private void t(dQ var1_1) {
        block22: {
            block26: {
                block25: {
                    block21: {
                        block20: {
                            block24: {
                                block23: {
                                    var2_2 = Dl.S();
                                    var5_3 /* !! */  = k.c(8342, 623383063849299408L) * k.c(3762, 6081230002345821138L) - k.c(16182, 2834030621672632902L) + k.c(4120, 5016215195683020135L);
                                    if (!var2_2) ** GOTO lbl-1000
                                    switch (var5_3 /* !! */ ) {
                                        default: lbl-1000:
                                        // 2 sources

                                        {
                                            var4_4 = hi.a("\u00a5", (Object)var1_1, (long)868519411919774313L);
                                            v0 = var4_4 instanceof ServerboundPlayerActionPacket;
                                            if (!var2_2) break block23;
                                            if (v0 == 0) break;
                                            break block24;
                                        }
                                        case 2003396464: {
                                            throw null;
                                        }
                                    }
                                    v0 = var5_3 /* !! */  = (k.c(31377, 3245182063540254661L) * k.c(17787, 588738194118182913L) - k.c(27447, 114272690812364357L) ^ k.c(2434, 563170257648338170L)) * k.c(11446, 6818066778610491848L) + k.c(11758, 1647156121438118034L);
                                }
                                if (var2_2) break block22;
                            }
                            var5_3 /* !! */  = k.c(30590, 6126125413147851316L) ^ k.c(9490, 5200195414013470789L) ^ k.c(27036, 5796412040745821421L);
                            block16: while (true) {
                                switch (var5_3 /* !! */ ) {
                                    default: {
                                        var3_5 = (ServerboundPlayerActionPacket)var4_4;
                                        if (!var2_2) break block20;
                                        if (hi.a("\u00a5", (Object)var3_5, (long)1329132940748540815L) != hi.a("j", (long)848845832377421936L)) break block16;
                                        break block21;
                                    }
                                    case 403833460: {
                                        hi.a("G", (int)2, (int)0, (long)682117342267402956L);
                                        var5_3 /* !! */  = k.c(13873, 689841751289854825L) - k.c(31167, 3133778735084713201L) + k.c(30032, 6663936983767889940L) - k.c(19446, 3276549238037546645L);
                                        if (var2_2) {
                                            continue block16;
                                        }
                                        break block22;
                                    }
                                }
                                break;
                            }
                            var5_3 /* !! */  = (k.c(30152, 5612193653950167228L) * k.c(24169, 6188699148325524264L) - k.c(28552, 2499768041402147579L) ^ k.c(7120, 6779250554558273168L)) * k.c(31757, 8848347096825016648L) + k.c(7494, 8997695567184810008L);
                        }
                        if (var2_2) break block22;
                    }
                    var5_3 /* !! */  = k.c(30969, 3891312825132135857L) + k.c(21217, 4731520481436147622L) - k.c(23538, 727958193347663547L);
                    switch (var5_3 /* !! */ ) {
                        default: {
                            var4_4 = (FoodProperties)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)668749055294445821L), (Object)hi.a("j", (long)792564722244485672L), (long)1154011740135286234L);
                            if (!var2_2) break block25;
                            if (var4_4 == null) break;
                            break block26;
                        }
                        case -1028442219: {
                            return;
                        }
                    }
                    var5_3 /* !! */  = (k.c(30152, 5612193653950167228L) * k.c(24169, 6188699148325524264L) - k.c(28552, 2499768041402147579L) ^ k.c(7120, 6779250554558273168L)) * k.c(31757, 8848347096825016648L) + k.c(7494, 8997695567184810008L);
                }
                if (var2_2) break block22;
            }
            var5_3 /* !! */  = k.c(32310, 1482870906996601708L) ^ k.c(3752, 684165546254418935L) ^ k.c(7206, 1758726786722419044L);
            if (!var2_2) ** GOTO lbl66
            block17: do {
                block28: {
                    block27: {
                        switch (var5_3 /* !! */ ) {
                            default: {
                                v1 /* !! */  = hi.a("\u00a5", (Object)var4_4, (long)743512556739352138L);
                                if (!var2_2) break block27;
                                if (v1 /* !! */  == false) break;
                                break block28;
                            }
                            case 164705680: {
                                hi.a("\u00a5", (Object)var1_1, (long)1159641526413061244L);
                                if (var2_2) break block17;
                                return;
                            }
                            case 164705682: {
                                hi.a("G", (long)397471851942621184L);
                                return;
                            }
                        }
lbl66:
                        // 2 sources

                        v1 /* !! */  = (CallSite)((k.c(30152, 5612193653950167228L) * k.c(24169, 6188699148325524264L) - k.c(28552, 2499768041402147579L) ^ k.c(7120, 6779250554558273168L)) * k.c(31757, 8848347096825016648L) + k.c(7494, 8997695567184810008L));
                    }
                    var5_3 /* !! */  = (int)v1 /* !! */ ;
                    if (var2_2) break block22;
                }
                var5_3 /* !! */  = hi.a("G", (int)(hi.a("G", (int)(k.c(5489, 8311408381398505534L) / k.c(17664, 9019098010791610466L)), (int)k.c(28062, 7157373971949691080L), (long)834203424483934088L) ^ k.c(14459, 8720988449852749096L)), (int)k.c(6171, 4221183075319141705L), (long)834203424483934088L) ^ k.c(24826, 6643634428787666331L);
            } while (var2_2);
            var5_3 /* !! */  = (k.c(30152, 5612193653950167228L) * k.c(24169, 6188699148325524264L) - k.c(28552, 2499768041402147579L) ^ k.c(7120, 6779250554558273168L)) * k.c(31757, 8848347096825016648L) + k.c(7494, 8997695567184810008L);
        }
        block18: while (true) {
            switch (var5_3 /* !! */ ) {
                case 364793654: {
                    hi.a("G", (long)1220332909359061582L);
                    k.o("mqGwsOZ4AJn5IWHa", x(boolean ), (boolean)false);
                    var5_3 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)hi.a("G", (int)k.c(25979, 7392610559074281528L), (int)k.c(26063, 5039743580688033951L), (long)834203424483934088L), (int)k.c(22787, 765321852403029080L), (long)834203424483934088L) * k.c(18702, 8089249200838837330L)), (int)k.c(12395, 7689281193907617056L), (long)834203424483934088L) + k.c(22450, 8474983550728248039L));
                    continue block18;
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    private void z(nj var1_1) {
        block10: {
            var2_2 = Dl.S();
            var3_3 = hi.a("G", (int)k.c(25926, 769595015311206423L), (int)k.c(31187, 2943088266904482982L), (long)834203424483934088L) + k.c(16536, 3583842908369358307L);
            if (var2_2) break block10;
lbl4:
            // 3 sources

            while (true) {
                v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1015148049117770214L);
                if (!var2_2) ** GOTO lbl31
                if (v0 == false) ** GOTO lbl30
                ** GOTO lbl32
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (ItemStack)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)913395637666077032L), (long)668749055294445821L);
                if (!var2_2) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl34
                break;
            }
        }
        while (true) {
            switch (var3_3) {
                default: {
                    ** GOTO lbl4
                }
                case 1983098913: {
                    ** continue;
                }
                case 1983098912: {
                    ** continue;
                }
                case 1983098910: 
            }
            k.o("mqGwsOZ4AJn5IWHa", values());
            if (!var2_2) ** break;
            ** continue;
lbl30:
            // 2 sources

            v0 = var3_3 = hi.a("G", (int)k.c(6299, 7306570103480669655L), (int)k.c(18697, 3308805983645729876L), (long)834203424483934088L) - k.c(6184, 4095550623111370078L);
lbl31:
            // 2 sources

            if (var2_2) continue;
lbl32:
            // 2 sources

            var3_3 = (reference)(k.c(25197, 7149133796213010228L) * k.c(149, 6879782941854485986L) ^ k.c(1215, 7199396842761636290L));
            if (var2_2) continue;
lbl34:
            // 2 sources

            var3_3 = hi.a("G", (int)k.c(8158, 2489738449638675091L), (int)k.c(8685, 4572321713565527188L), (long)834203424483934088L) - k.c(26524, 7997838670971349753L);
        }
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D51;
        if (c[n2] == null) {
            k.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
