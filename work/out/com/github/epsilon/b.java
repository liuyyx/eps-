/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
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
import net.minecraft.client.player.LocalPlayer;

public class b
extends e {
    public static final b x;
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
                v0 = "cz\u001d\r\u001c\\iZj\u0004".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 13;
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
                                v9 = 36;
                                break;
                            }
                            case 1: {
                                v9 = 2;
                                break;
                            }
                            case 2: {
                                v9 = 125;
                                break;
                            }
                            case 3: {
                                v9 = 112;
                                break;
                            }
                            case 4: {
                                v9 = 49;
                                break;
                            }
                            case 5: {
                                v9 = 3;
                                break;
                            }
                            default: {
                                v9 = 1;
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
                com.github.epsilon.b.a = new String(v10).intern();
                var0_1 = 1573281993390048118L;
                var6_2 = new long[30];
                var3_3 = 0;
                var4_4 = "\u00c8\u00ca\u0084;/!A*{\u00b6\u00ae\u00a4\u0018\u00c0a)h\u00ee.\u00c7\u00be\u0011\u00c2\u009d\u0005D+\u0090\u00d7%\u0092\u001f\u00e7B\u00cd\u0011\u0013y\u00d0\u00bb\u00d15'A\u0017\u0001K\u0094\u0084\u008d%t\u00b3\u0081\u00cf\u00ca|\u00cd\u00f5\u00ae1x,<\u00d8\u00fe\u0094\u00b1n[ \u00a7~Y\u0007\u001b\u00f4H\u00b3'X\u0007\u00f0&\u00de\u00adxa\u00b3\u0087\u00db\u00a1\u0099H\u0004n\\U\n\u00daG%i\u0013\u00df\u00f9\u001bw\u009d)_\u00c5\u00eb\u00e4~\u00cey\u008f\u00f0\u0095\u00b5\u00ef%Q\u009a\u00ea\u00a5\u0098\u00f9,\u00cb\u00fb\u0019\u00bf\u00c5\u00a7'\u00ae\u007f\u00d6\u00b7,\u007f(J\u0083h\u00f3\u0006h\u00e69\u00a1vm\u00a1\u00d6\u00e8\u00e1\u0085\u00b3\u0096\u0083\u00a4\u00a1;\u00a1LSw\u0085\u00f6S\u00e9\u00fc9\n\u00e3%H\u00a2$\u008c6\u0086&\u0086\u00d3\u00fa\u001di\u00ccle\u00b1ux\u00ef\u0083;R\u0091\u00ec\u00f4\t\u00eb\u00f9dq\"0\u0099&\u009a-\u008c%\u00c9\u00df\u00c7\u001f<\u00f0\u000b";
                var5_5 = "\u00c8\u00ca\u0084;/!A*{\u00b6\u00ae\u00a4\u0018\u00c0a)h\u00ee.\u00c7\u00be\u0011\u00c2\u009d\u0005D+\u0090\u00d7%\u0092\u001f\u00e7B\u00cd\u0011\u0013y\u00d0\u00bb\u00d15'A\u0017\u0001K\u0094\u0084\u008d%t\u00b3\u0081\u00cf\u00ca|\u00cd\u00f5\u00ae1x,<\u00d8\u00fe\u0094\u00b1n[ \u00a7~Y\u0007\u001b\u00f4H\u00b3'X\u0007\u00f0&\u00de\u00adxa\u00b3\u0087\u00db\u00a1\u0099H\u0004n\\U\n\u00daG%i\u0013\u00df\u00f9\u001bw\u009d)_\u00c5\u00eb\u00e4~\u00cey\u008f\u00f0\u0095\u00b5\u00ef%Q\u009a\u00ea\u00a5\u0098\u00f9,\u00cb\u00fb\u0019\u00bf\u00c5\u00a7'\u00ae\u007f\u00d6\u00b7,\u007f(J\u0083h\u00f3\u0006h\u00e69\u00a1vm\u00a1\u00d6\u00e8\u00e1\u0085\u00b3\u0096\u0083\u00a4\u00a1;\u00a1LSw\u0085\u00f6S\u00e9\u00fc9\n\u00e3%H\u00a2$\u008c6\u0086&\u0086\u00d3\u00fa\u001di\u00ccle\u00b1ux\u00ef\u0083;R\u0091\u00ec\u00f4\t\u00eb\u00f9dq\"0\u0099&\u009a-\u008c%\u00c9\u00df\u00c7\u001f<\u00f0\u000b".length();
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
                    var4_4 = "m\u00e2\u00ac\u00d1A\u00c8\u00d6\u00a2=\u00c0\u00ad\u0006\u00b3\u009c\u00a0\u001f";
                    var5_5 = "m\u00e2\u00ac\u00d1A\u00c8\u00d6\u00a2=\u00c0\u00ad\u0006\u00b3\u009c\u00a0\u001f".length();
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
        com.github.epsilon.b.b = var6_2;
        com.github.epsilon.b.c = new Integer[30];
        com.github.epsilon.b.x = new b();
    }

    private b() {
        super(a, (vY)((Object)hi.a("j", (long)456237291118568391L)));
    }

    public static /* bridge */ /* synthetic */ CallSite U(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @yE
    private void x(yi var1_1) {
        block12: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = (com.github.epsilon.b.c(5028, 5266328869097613340L) * com.github.epsilon.b.c(9886, 493062630475734320L) + com.github.epsilon.b.c(25356, 6072407310563858598L)) * com.github.epsilon.b.c(7237, 2101111054999332842L) + com.github.epsilon.b.c(15839, 5036735484074034810L) ^ com.github.epsilon.b.c(15827, 6372845396439664243L);
            if (var2_2) break block12;
lbl4:
            // 2 sources

            while (true) {
                v0 /* !! */  = com.github.epsilon.b.U("8UrwBnQfeF6bn9zd", onGround(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                if (!var2_2) ** GOTO lbl40
                if (v0 /* !! */  == false) ** GOTO lbl39
                ** GOTO lbl42
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)421196756403279538L);
                v2 = com.github.epsilon.b.c(6635, 6260930753459659350L);
                if (!var2_2) ** GOTO lbl46
                if (v1 /* !! */  != v2) ** GOTO lbl44
                ** GOTO lbl48
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                hi.a("\u00a5", (Object)var1_1, (Object)new Object[]{true}, (long)795320219994177176L);
                if (!var2_2) lbl-1000:
                // 2 sources

                {
                    return;
                }
                ** GOTO lbl50
                break;
            }
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1189684138: {
                    ** continue;
                }
                case -1189684140: {
                    ** continue;
                }
                case -1189684141: {
                    ** continue;
                }
                case -1189684139: 
            }
            hi.a("G", (long)740307216543007282L);
            hi.a("G", (int)1, (long)1303164259642563020L);
            var3_3 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.b.c(15815, 8211184790442247801L), (int)com.github.epsilon.b.c(8355, 7492827446332529433L), (long)834203424483934088L) * com.github.epsilon.b.c(18354, 4545672394694261762L) + com.github.epsilon.b.c(17825, 3395171796383890965L) + com.github.epsilon.b.c(13814, 9080933658410061379L));
            if (var2_2) continue;
lbl39:
            // 2 sources

            v0 /* !! */  = (CallSite)(com.github.epsilon.b.c(2165, 2514049435987850188L) + com.github.epsilon.b.c(28100, 933602368971495016L) - com.github.epsilon.b.c(23875, 5255686100870620906L) - com.github.epsilon.b.c(2226, 7851041954491249409L));
lbl40:
            // 2 sources

            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (var2_2) continue;
lbl42:
            // 2 sources

            var3_3 /* !! */  = (int)(hi.a("G", (int)com.github.epsilon.b.c(21937, 3343047974638743043L), (int)com.github.epsilon.b.c(11135, 7503150936002776L), (long)834203424483934088L) + com.github.epsilon.b.c(8500, 7997608487530502812L) + com.github.epsilon.b.c(31211, 5889673891698393687L));
            if (var2_2) continue;
lbl44:
            // 2 sources

            v1 /* !! */  = (CallSite)(com.github.epsilon.b.c(7212, 7859303921955350429L) + com.github.epsilon.b.c(1096, 639517676859146227L) - com.github.epsilon.b.c(18612, 8876395897373422367L));
            v2 = com.github.epsilon.b.c(11782, 2752073135345276322L);
lbl46:
            // 2 sources

            var3_3 /* !! */  = (int)(v1 /* !! */  - v2);
            if (var2_2) continue;
lbl48:
            // 2 sources

            var3_3 /* !! */  = hi.a("G", (int)hi.a("G", (int)(com.github.epsilon.b.c(27161, 7999922662916477364L) + com.github.epsilon.b.c(5406, 5491935331884019391L) ^ com.github.epsilon.b.c(28708, 1413779935289985947L)), (int)com.github.epsilon.b.c(7148, 7596154946843975771L), (long)834203424483934088L), (int)com.github.epsilon.b.c(26444, 4914470181344173290L), (long)834203424483934088L) ^ com.github.epsilon.b.c(32199, 2066898418248140401L);
            if (var2_2) continue;
lbl50:
            // 2 sources

            var3_3 /* !! */  = com.github.epsilon.b.c(7212, 7859303921955350429L) + com.github.epsilon.b.c(1096, 639517676859146227L) - com.github.epsilon.b.c(18612, 8876395897373422367L) - com.github.epsilon.b.c(11782, 2752073135345276322L);
        }
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3BBC;
        if (c[n2] == null) {
            com.github.epsilon.b.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
