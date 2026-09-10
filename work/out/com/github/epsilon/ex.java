/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.item.CrossbowItem
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.dR;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.CrossbowItem;

public class ex
extends e {
    public static final ex z;
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
                v0 = "{d'z\\m>Ub w\u0013Ylht?p\u001d])".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 30;
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
                                v9 = 15;
                                break;
                            }
                            case 2: {
                                v9 = 77;
                                break;
                            }
                            case 3: {
                                v9 = 11;
                                break;
                            }
                            case 4: {
                                v9 = 98;
                                break;
                            }
                            case 5: {
                                v9 = 48;
                                break;
                            }
                            default: {
                                v9 = 82;
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
                ex.a = new String(v10).intern();
                var0_1 = 7945228754562460271L;
                var6_2 = new long[31];
                var3_3 = 0;
                var4_4 = "\u001f2\u00ae\u0007\u008e\u00b6\u00c1Jt~\u00a9\u008a\u00f37\u00a03g\u008ddI\u00d7R\u0014\u0003b\u00b2&2z~A\u0006,\u00a6\u009a\u00e32\u00b9\u0011\u00d9\u0082\u008f\u00c4-eD\u00df\u00a7*\u00fc\u00fe\u0081\u0086\u0003\u00da\u00c6\u00a8\u008c\u00cf}S\u00eb\u000f\u0013\u00ba\u00aa\u0088u]\u001f/\u001f\u001e\u00d1\u00fd\u00ca\u00eaUf\u00d5\u00fc\u008d\u001e\u008a5\u00ca2\u000b]Q\u0085\u00d9\u0005\u00fa\u00aab\u00c0\u00df\u0012\u00ce\u00df\u001d\u0017\u0089n\u00d3y\u00c4<\u00bc\u00fe1\u00b9]\u00fa\u00cf\u00a8\u00b5\u00bf-\u00a1\u00c2<\u00de\u000f\u00cc\\g\u007f\\\u00c8\u0099\u0090\u00e9]2\u0015CKq iI\u00aa\u008eq\u00b7M\u0095\u001e^\u0011\u00fe\u0097\u000b+\u00ce\u00c8&?\u0094W\u00d6\u001f#q\u00f0\u00bc\u0014\u0001\u009e\u009a{U\u0007\u00a1\u00d3\u0086B\u0096\u00a4\u00d9\u001eu\u00e9\u00c6\u00f4\u0080\u00f8\u00eb\u0086A\u00db8\u00b9x1`\u00bc\u00b6\u00b2\u00f1\u00a8\u00b2\u00e1\u0086\u00cffB\u00f5\u0095\"\u00fc\f\u00f9\u00e9\u0000\u008e\u0094\u001f\u001d \u00a0]\u0002\u0012\u00920\u00c6\u001eN\u00ae";
                var5_5 = "\u001f2\u00ae\u0007\u008e\u00b6\u00c1Jt~\u00a9\u008a\u00f37\u00a03g\u008ddI\u00d7R\u0014\u0003b\u00b2&2z~A\u0006,\u00a6\u009a\u00e32\u00b9\u0011\u00d9\u0082\u008f\u00c4-eD\u00df\u00a7*\u00fc\u00fe\u0081\u0086\u0003\u00da\u00c6\u00a8\u008c\u00cf}S\u00eb\u000f\u0013\u00ba\u00aa\u0088u]\u001f/\u001f\u001e\u00d1\u00fd\u00ca\u00eaUf\u00d5\u00fc\u008d\u001e\u008a5\u00ca2\u000b]Q\u0085\u00d9\u0005\u00fa\u00aab\u00c0\u00df\u0012\u00ce\u00df\u001d\u0017\u0089n\u00d3y\u00c4<\u00bc\u00fe1\u00b9]\u00fa\u00cf\u00a8\u00b5\u00bf-\u00a1\u00c2<\u00de\u000f\u00cc\\g\u007f\\\u00c8\u0099\u0090\u00e9]2\u0015CKq iI\u00aa\u008eq\u00b7M\u0095\u001e^\u0011\u00fe\u0097\u000b+\u00ce\u00c8&?\u0094W\u00d6\u001f#q\u00f0\u00bc\u0014\u0001\u009e\u009a{U\u0007\u00a1\u00d3\u0086B\u0096\u00a4\u00d9\u001eu\u00e9\u00c6\u00f4\u0080\u00f8\u00eb\u0086A\u00db8\u00b9x1`\u00bc\u00b6\u00b2\u00f1\u00a8\u00b2\u00e1\u0086\u00cffB\u00f5\u0095\"\u00fc\f\u00f9\u00e9\u0000\u008e\u0094\u001f\u001d \u00a0]\u0002\u0012\u00920\u00c6\u001eN\u00ae".length();
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
                    var4_4 = "\u00c6\u00cf_D9;A\u00c4:_\u0093\u00d6\u000b\u00cf\u00a3\u00e5";
                    var5_5 = "\u00c6\u00cf_D9;A\u00c4:_\u0093\u00d6\u000b\u00cf\u00a3\u00e5".length();
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
        ex.b = var6_2;
        ex.c = new Integer[31];
        ex.z = new ex();
    }

    private ex() {
        super(a, (vY)((Object)hi.a("j", (long)526176563220736169L)));
    }

    public static /* bridge */ /* synthetic */ CallSite Z(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    private void N(dR var1_1) {
        block23: {
            var2_2 = Dl.t();
            var5_3 /* !! */  = ((ex.c(31386, 8784711600312224587L) ^ ex.c(31180, 2019473316127279111L)) * ex.c(14022, 3903448259341240065L) - ex.c(18870, 1960744648854976623L)) * ex.c(4055, 8812315843670932999L) + ex.c(29253, 583990420769473415L);
            if (!var2_2) break block23;
lbl5:
            // 2 sources

            while (true) {
                hi.a("G", (int)ex.c(21071, 1463863439735202700L), (int)1, (long)682117342267402956L);
lbl7:
                // 2 sources

                while (true) {
                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)1015148049117770214L);
                    if (var2_2) ** GOTO lbl60
                    if (v0 /* !! */  != false) ** GOTO lbl59
                    ** GOTO lbl62
                    break;
                }
                break;
            }
        }
        block15: while (true) {
            switch (var5_3 /* !! */ ) {
                case -609103088: {
                    ** continue;
                }
                default: {
                    ** continue;
                }
                case -609103085: {
                    var3_4 = ex.Z("Ps9N6B3ZDvjW4ktu", getUseItem(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                    v1 /* !! */  = hi.a("\u00a5", (Object)var3_4, (long)769006157898026769L) instanceof CrossbowItem;
                    if (var2_2) ** GOTO lbl25
                    if (v1 /* !! */  == 0) ** GOTO lbl26
                    v1 /* !! */  = var5_3 /* !! */  = (int)(hi.a("G", (int)(ex.c(32167, 5217235729398238322L) / ex.c(6819, 9130579421375523705L)), (int)ex.c(30242, 7769885568013633516L), (long)834203424483934088L) + ex.c(31743, 4321328837563222582L));
lbl25:
                    // 2 sources

                    if (!var2_2) ** GOTO lbl27
lbl26:
                    // 2 sources

                    var5_3 /* !! */  = ex.c(28099, 618388377640836123L) / ex.c(20400, 8960725501819240043L) * ex.c(11505, 2838717545017892148L) + ex.c(7276, 444481931538754988L) - ex.c(24463, 5987883123361918552L);
lbl27:
                    // 2 sources

                    switch (var5_3 /* !! */ ) {
                        default: {
                            return;
                        }
                        case -1028370299: {
                            var4_5 = hi.a("G", (Object)var3_4, (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L), (long)706786213707504960L);
                            v2 /* !! */  = ex.Z("Ps9N6B3ZDvjW4ktu", getTicksUsingItem(), (LocalPlayer)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1285467445182668332L));
                            v3 /* !! */  = var4_5 + true;
                            if (var2_2) ** GOTO lbl43
                            if (v2 /* !! */  >= v3 /* !! */ ) break;
                            ** GOTO lbl45
                        }
                        case -1028370297: {
                            hi.a("G", (long)916259186308446368L);
                            return;
                        }
                    }
                    v2 /* !! */  = (CallSite)(ex.c(2361, 1361651354560264436L) * ex.c(31665, 2849040669119122021L) / ex.c(2008, 885463333671958030L));
                    v3 /* !! */  = (reference)ex.c(5003, 6176915283903078979L);
lbl43:
                    // 2 sources

                    var5_3 /* !! */  = (int)(v2 /* !! */  - v3 /* !! */ );
                    if (!var2_2) ** GOTO lbl46
lbl45:
                    // 2 sources

                    var5_3 /* !! */  = (ex.c(24518, 2349660528809717273L) ^ ex.c(22232, 1696877318344517399L)) - ex.c(11181, 2997724987083315817L);
lbl46:
                    // 2 sources

                    v4 /* !! */  = var5_3 /* !! */ ;
                    if (!var2_2) {
                        switch (v4 /* !! */ ) {
                            default: {
                                return;
                            }
                            case 1900026873: {
                                hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)1187940231439308830L), (long)1250868354805814437L), (long)1330274766107390732L), (boolean)false, (long)1105814777951322808L);
                                return;
                            }
                            case 1900026874: 
                        }
                        v4 /* !! */  = ex.c(21672, 1033421919602419062L);
                    }
                    hi.a("G", (int)v4 /* !! */ , (boolean)true, (long)541412231224622628L);
                    if (var2_2 == false) return;
lbl59:
                    // 2 sources

                    v0 /* !! */  = (CallSite)((ex.c(10666, 8122462628565899385L) ^ ex.c(24010, 2309295437217934347L) ^ ex.c(32022, 2378448145263955140L)) + ex.c(8343, 5281239092568281437L));
lbl60:
                    // 2 sources

                    var5_3 /* !! */  = (int)v0 /* !! */ ;
                    if (!var2_2) continue block15;
lbl62:
                    // 2 sources

                    var5_3 /* !! */  = ex.c(31166, 4385832414361880690L) * ex.c(29615, 1011763601992876659L) ^ ex.c(27949, 7484257141844286704L);
                    continue block15;
                }
                case -609103086: 
            }
            break;
        }
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x71D9;
        if (c[n2] == null) {
            ex.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
