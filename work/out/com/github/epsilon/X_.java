/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.client.Minecraft
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.yy;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.Minecraft;

public class X_ {
    private yy T;
    public String y;
    public String S;
    private volatile boolean m;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public yy P(Object[] var1_1) {
        block14: {
            var2_2 = Dl.t();
            var3_3 = (X_.a(2006, 859996002744319204L) ^ X_.a(15419, 6550638022226380609L) ^ X_.a(98, 3191794087905114902L)) / X_.a(22708, 541229858829755285L) + X_.a(14672, 7073741359343305336L) - X_.a(10076, 4988328438431784013L);
            if (!var2_2) ** GOTO lbl11
            block8: while (true) {
                block16: {
                    block15: {
                        if (hi.a("\u00e9", (Object)this, (long)703104856148595415L) != null) break block15;
                        var3_3 = X_.a(4990, 5359480991023868028L) * X_.a(27669, 9135887790968002333L) ^ X_.a(26575, 3436987897263873233L);
                        if (!var2_2) break block16;
                    }
                    var3_3 = hi.a("G", (int)(X_.a(17094, 7699429106870483451L) + X_.a(19787, 6547155757224326761L)), (int)X_.a(2243, 1166067996135404540L), (long)834203424483934088L) - X_.a(62, 4358651387161819965L) ^ X_.a(15709, 2730347234978203214L);
                }
                switch (var3_3) {
                    default: {
                        continue block8;
                    }
                    case 983813399: {
                        v0 = hi.a("\u00e9", (Object)this, (long)703104856148595415L);
                        var3_3 = X_.a(20085, 6868354781952963956L) * X_.a(19097, 2970284036253643234L) / X_.a(3548, 5800454932360279722L) / X_.a(4976, 4639671436531804258L) + X_.a(22043, 5661753150491782452L);
                        if (var2_2) {
                            break block8;
                        }
                        break block14;
                    }
                    case 983813402: {
                        v0 = hi.a("\u00e9", (Object)hi.a("j", (long)1137355358188687327L), (long)1180390042577123797L);
                        if (!var2_2) break block8;
                        return v0;
                    }
                    case 983813400: {
                        throw null;
                    }
                }
                break;
            }
            var3_3 = X_.a(25423, 5795879363887093809L) * X_.a(18064, 6577232910651522464L) / X_.a(1486, 7471395278503165629L) / X_.a(10143, 3437753098860469397L) + X_.a(9196, 5693752895212755180L);
        }
        switch (var3_3) {
            default: {
                return v0;
            }
            case -1382571931: 
        }
        hi.a("G", (long)461891726241433586L);
        hi.a("G", (long)1254720339774257797L);
        return null;
    }

    public void I(Object[] objectArray) {
        JsonObject jsonObject = (JsonObject)objectArray[0];
        hi.a("\u00a5", (Object)jsonObject, (Object)X_.a(1474, 18513), (Object)hi.a("\u00e9", (Object)this, (long)487305887145600804L), (long)853340881431046684L);
        hi.a("\u00a5", (Object)jsonObject, (Object)X_.a(1475, 14696), (Object)hi.a("\u00e9", (Object)this, (long)719730683012248778L), (long)853340881431046684L);
    }

    public X_() {
        hi.a("\u00f2", (Object)this, (String)"", (long)487305887145600804L);
        hi.a("\u00f2", (Object)this, (String)"", (long)719730683012248778L);
    }

    public static /* bridge */ /* synthetic */ CallSite C(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private void lambda$loadHead$1(byte[] byArray, Runnable runnable) {
        block6: {
            Runnable runnable2;
            block5: {
                boolean bl = Dl.t();
                if (!bl) {
                    if (byArray != null) {
                        hi.a("\u00f2", (Object)this, (yy)new yy(byArray), (long)703104856148595415L);
                    }
                    hi.a("\u00f2", (Object)this, (boolean)false, (long)708995819780551364L);
                }
                runnable2 = runnable;
                if (bl) break block5;
                if (runnable2 == null) break block6;
                runnable2 = runnable;
            }
            hi.a("\u00a5", (Object)runnable2, (long)771214481502331129L);
        }
    }

    public void S(Object[] objectArray) {
        JsonObject jsonObject = (JsonObject)objectArray[0];
        hi.a("\u00f2", (Object)this, (String)((Object)X_.C("gMvL1LD74nfigzLf", getAsString(), (JsonElement)hi.a("\u00a5", (Object)jsonObject, (Object)X_.a(1473, -29818), (long)762969773812762396L))), (long)487305887145600804L);
        hi.a("\u00f2", (Object)this, (String)((Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)jsonObject, (Object)X_.a(1472, -7970), (long)762969773812762396L), (long)444304451125411138L)), (long)719730683012248778L);
        X_.C("gMvL1LD74nfigzLf", y(), (X_)this);
    }

    private void lambda$loadHead$0(Runnable runnable) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("j", (long)1137355358188687327L), (Object)new Object[]{hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)719730683012248778L), (long)1216268965136849390L)}, (long)370386897459984147L);
        X_.C("gMvL1LD74nfigzLf", execute(java.lang.Runnable ), (Minecraft)hi.a("j", (long)1080602109828736465L), () -> this.lambda$loadHead$1((byte[])callSite, runnable));
    }

    public void y() {
        hi.a("\u00a5", (Object)this, (Object)new Object[]{null}, (long)386804207762694937L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void M(Object[] var1_1) {
        block30: {
            block28: {
                block29: {
                    block27: {
                        block26: {
                            block34: {
                                block25: {
                                    block23: {
                                        block24: {
                                            block22: {
                                                block33: {
                                                    block21: {
                                                        block32: {
                                                            block31: {
                                                                var2_2 = (Runnable)var1_1[0];
                                                                var3_3 = Dl.t();
                                                                var4_4 /* !! */  = (X_.a(17618, 7303787748801445870L) ^ X_.a(19865, 8266593223001044653L)) + X_.a(18548, 8658531089691341679L) + X_.a(12696, 8595329948331575955L);
                                                                if (!var3_3) break block31;
lbl6:
                                                                // 2 sources

                                                                while (hi.a("\u00e9", (Object)this, (long)703104856148595415L) == null) {
                                                                    break block21;
                                                                }
                                                                break block32;
lbl9:
                                                                // 1 sources

                                                                while (hi.a("\u00e9", (Object)this, (long)719730683012248778L) != null) {
                                                                    break block22;
                                                                }
                                                                break block33;
lbl12:
                                                                // 1 sources

                                                                while (true) {
                                                                    v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)719730683012248778L), (long)601063317567675907L);
                                                                    if (var3_3) break block23;
                                                                    if (v0 /* !! */  == false) break block24;
                                                                    break block25;
                                                                    break;
                                                                }
lbl17:
                                                                // 1 sources

                                                                while (var2_2 != null) {
                                                                    break block26;
                                                                }
                                                                break block34;
lbl20:
                                                                // 1 sources

                                                                while (true) {
                                                                    X_.C("gMvL1LD74nfigzLf", execute(java.lang.Runnable ), (Minecraft)hi.a("j", (long)1080602109828736465L), (Runnable)var2_2);
                                                                    if (!var3_3) break block27;
lbl23:
                                                                    // 2 sources

                                                                    return;
                                                                }
lbl25:
                                                                // 1 sources

                                                                while (true) {
                                                                    v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)708995819780551364L);
                                                                    if (var3_3) break block28;
                                                                    if (v1 /* !! */  == false) break block29;
                                                                    break block30;
                                                                    break;
                                                                }
lbl30:
                                                                // 1 sources

                                                                return;
lbl32:
                                                                // 1 sources

                                                                while (true) {
                                                                    hi.a("\u00f2", (Object)this, (boolean)true, (long)708995819780551364L);
                                                                    hi.a("\u00a5", (Object)hi.a("j", (long)872291112267464505L), (Object)new Object[]{(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$loadHead$0(java.lang.Runnable ), ()V)((X_)this, (Runnable)var2_2)}, (long)370960123775804214L);
                                                                    return;
                                                                }
                                                            }
lbl37:
                                                            // 12 sources

                                                            while (true) {
                                                                switch (var4_4 /* !! */ ) {
                                                                    default: {
                                                                        ** GOTO lbl6
                                                                    }
                                                                    case 1852619668: {
                                                                        ** GOTO lbl9
                                                                    }
                                                                    case 1852619665: {
                                                                        ** continue;
                                                                    }
                                                                    case 1852619667: {
                                                                        ** GOTO lbl17
                                                                    }
                                                                    case 1852619662: {
                                                                        ** continue;
                                                                    }
                                                                    case 1852619670: {
                                                                        ** continue;
                                                                    }
                                                                    case 1852619661: {
                                                                        ** continue;
                                                                    }
                                                                    case 1852619663: {
                                                                        ** continue;
                                                                    }
                                                                    case 1852619666: {
                                                                        ** continue;
                                                                    }
                                                                    case 1852619669: 
                                                                }
                                                                hi.a("G", (int)-1, (long)683539552130499618L);
                                                                var4_4 /* !! */  = X_.a(9249, 297193032460181294L) * X_.a(2871, 6992102625808330781L) * X_.a(27242, 8544732011128672536L) ^ X_.a(32164, 3334694873175705220L);
                                                                if (!var3_3) continue;
                                                                break;
                                                            }
                                                        }
                                                        var4_4 /* !! */  = hi.a("G", (int)X_.a(29251, 3216118005278427504L), (int)X_.a(30250, 8508169545339161904L), (long)834203424483934088L) ^ X_.a(12588, 8579009995243555412L) ^ X_.a(232, 3871820359273036785L);
                                                        if (!var3_3) ** GOTO lbl37
                                                    }
                                                    var4_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)X_.a(1580, 5207642719202524465L), (int)X_.a(17082, 75778711092623786L), (long)834203424483934088L) / X_.a(17637, 5290846664127840227L) - X_.a(29968, 6598752785518546455L)), (int)X_.a(6880, 7126227932287967703L), (long)834203424483934088L) + X_.a(30716, 3317231050449767629L));
                                                    if (!var3_3) ** GOTO lbl37
                                                }
                                                var4_4 /* !! */  = hi.a("G", (int)X_.a(373, 4126573188648516216L), (int)X_.a(26423, 9907620646804506L), (long)834203424483934088L) ^ X_.a(10275, 988614083354399495L) ^ X_.a(23260, 6507458954118554090L);
                                                if (!var3_3) ** GOTO lbl37
                                            }
                                            var4_4 /* !! */  = (int)(hi.a("G", (int)(hi.a("G", (int)X_.a(27911, 1136082785383306793L), (int)X_.a(5089, 6241607478579210442L), (long)834203424483934088L) * X_.a(12037, 9073004855580136508L)), (int)X_.a(4734, 3680416495418190150L), (long)834203424483934088L) + X_.a(10571, 5949566788855534183L) + X_.a(2825, 8626782554270969877L));
                                            if (!var3_3) ** GOTO lbl37
                                        }
                                        v0 /* !! */  = (CallSite)(hi.a("G", (int)hi.a("G", (int)((X_.a(23809, 4716977154693850737L) ^ X_.a(24340, 3154081966154900531L)) - X_.a(21852, 1585096183756123753L)), (int)X_.a(26936, 2431159245194383921L), (long)834203424483934088L), (int)X_.a(12088, 8704096063831086125L), (long)834203424483934088L) ^ X_.a(4206, 2558842923850738553L));
                                    }
                                    var4_4 /* !! */  = (int)v0 /* !! */ ;
                                    if (!var3_3) ** GOTO lbl37
                                }
                                var4_4 /* !! */  = hi.a("G", (int)X_.a(373, 4126573188648516216L), (int)X_.a(26423, 9907620646804506L), (long)834203424483934088L) ^ X_.a(10275, 988614083354399495L) ^ X_.a(23260, 6507458954118554090L);
                                if (!var3_3) ** GOTO lbl37
                            }
                            var4_4 /* !! */  = (int)(hi.a("G", (int)(X_.a(7102, 3579402160545013955L) - X_.a(19896, 4054275797636216521L)), (int)X_.a(18001, 333236572673539439L), (long)834203424483934088L) / X_.a(2817, 7565480335577100313L) + X_.a(31200, 3848040838939722459L));
                            if (!var3_3) ** GOTO lbl37
                        }
                        var4_4 /* !! */  = (int)(hi.a("G", (int)X_.C("gMvL1LD74nfigzLf", max(int int ), (int)X_.a(10304, 8006830580603392836L), (int)X_.a(31717, 3999020937965519004L)), (int)X_.a(25451, 5976974397236369431L), (long)834203424483934088L) + X_.a(4157, 535960616520723207L) + X_.a(20001, 6434071781065913686L));
                        if (!var3_3) ** GOTO lbl37
                    }
                    var4_4 /* !! */  = (int)(hi.a("G", (int)(X_.a(15485, 5574498330770048888L) - X_.a(1051, 4929098009240780644L)), (int)X_.a(30227, 1923739641602133260L), (long)834203424483934088L) / X_.a(26938, 8950501157737353759L) + X_.a(31136, 8715884854717104835L));
                    if (!var3_3) ** GOTO lbl37
                }
                v1 /* !! */  = (CallSite)(hi.a("G", (int)((X_.a(32332, 5087060440414471481L) - X_.a(4829, 8648315749279705595L)) / 3), (int)X_.a(18787, 5979926599265481325L), (long)834203424483934088L) ^ X_.a(23616, 5653974213389477731L) ^ X_.a(26931, 6513071329416041023L));
            }
            var4_4 /* !! */  = (int)v1 /* !! */ ;
            if (!var3_3) ** GOTO lbl37
        }
        var4_4 /* !! */  = X_.a(6638, 6526274857348440826L) / X_.a(21262, 7371956950213945368L) + X_.a(27155, 907217466784764218L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "\u00a5\u00b2\u00fcG\u0002\u008f>C\u0004\u00c7\u00d5\u00bc{";
                        var12_3 = "\u00a5\u00b2\u00fcG\u0002\u008f>C\u0004\u00c7\u00d5\u00bc{".length();
                        var9_4 = 8;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 115;
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
                            var10_2 = "e8\u008d\u00a3\b\u00cf\u00ce\u00d4\u00adb\u00b7W!";
                            var12_3 = "e8\u008d\u00a3\b\u00cf\u00ce\u00d4\u00adb\u00b7W!".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 27;
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
                                    v15 = 79;
                                    break;
                                }
                                case 1: {
                                    v15 = 67;
                                    break;
                                }
                                case 2: {
                                    v15 = 2;
                                    break;
                                }
                                case 3: {
                                    v15 = 11;
                                    break;
                                }
                                case 4: {
                                    v15 = 103;
                                    break;
                                }
                                case 5: {
                                    v15 = 70;
                                    break;
                                }
                                default: {
                                    v15 = 65;
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
                X_.a = var13;
                X_.b = new String[4];
                var0_7 = 1610299286266757927L;
                var6_8 = new long[81];
                var3_9 = 0;
                var4_10 = "\u00cak\u00c09\u008b\u00b6z\u00a4\u007fH\u0011\u00dcee\u00c6z\u00adz{\u001f&{\u00e8\u0013\u00f3\u00e0\u00f2\u00d4e\u00a2\u0013\u008c\u0086\u000e\u00dbq|x1k\u00df\u0017I)\u00d5\u00fa@>g\u00d3\u001b\u00e0\u0003\u00fc\u008c\u008bmv\u0010\u00ae\u00d0\u00f4\u00fc;\u00fcK\u00d1aC\u00c0\u00a8\u009au\u00dd\u008e\u00c5{<\u00c3A\u0013\u00b0\u00ae\u0004\u00d6\u00f3\u00ee\u00besLK&^\u008b\u00ac\u00ff\u00d8\u00f3]C\u00a5\u0013@2\u009bky\u009d\u00d9\u001f\u00fet\u00d72\t%pC\u00a2Y\u00b3\u00d6>~D\u00bd\u009b\u0082h\u00a7`\u00d4\u000b\u00b0\u00b3\u00c2\u00af?\u00eb\u0017\u00be\\\u00a5|\u0014\u00bfP..\u009f \u00b4\u000e1[\u0097%\u001a\u0007\u0011J\u0090\u00a1\u00f87\u001a\u00ae\u00aduA\u009d\"`\u00d8\u00ddY\u00bdqk\u00b2\u00dfV\u0091?U9M\u0011\u00cbg\u00f9\u00b3\u00bf\u00ca\u0084\u001bR \u00bf*\u00b1\u0005{U\u00126\"\u00d7q&\u008fT\u0080\u00aa\u00ac\u0082\u00a7'CO\u009c0\u001cVh\u00c2\u0089\u00a5\u00db\u0091\u00f7\u0003M\u00a3\u00b4a?'Q\u00f9\u0089\u00cd>\u00fc.0\u00f6\u00a1\u00ac[\b\u00c2!\t\tc\u00a5\u0083\u008bSmw\u00b5\u00df\u0089\u00e0\u00c9\u0017\u00a2\u00ff\u00ebN\u00fb\u00b7\u00b1ry\u00b8\u00ff\u00dfh\u0091E\u00eb\u00ea\u00c4\u00ef\u0091\u00cc)\u00bev\u00ec\u00860K\u00f3\u00ad\n\u000b\u00ff\u0007\u00ab2\u008f\u00efx\u00b0\u009f\u0015\u0013\u00e3\u00d9\u00db{M<\u0095\u00b9\u00f6\u00f4\u0014\u00ae\u001f\u00adg\u00b6\u0001\u00b8c\u00e4\u0012\u0011\u00b4\u00e7\u008b\u008e\u0092\u00a5A_\u00c9\u009a%P2xs^\u00b8s9\u00e8Q\u0095v\u0097HN\u0017\u0081\u00f5*\u00ad\u00bc\\\u0007W8\u00ff\u00ae\u00be\u0006\u0017K\u00aa\u0015)\u0083\u0016rR\u0002\twE\u00df\u00a3\u00d8\u00ec\u0013\f%\"\u00a4\u00cbw|\u0085\u009a[(v\u00c5\u0099\u0082Y/I\u00d3!\u00db\u0080\u0091\u0002\u00db\u0096\u00de\u00a4\u00c4\u0092a\u00a8\u00e2`\u00e1\u00a5\u00cd\u0003\u0098\u00bc\u00cc\u00c1A\u008a\u00f6\u00farUm\u00df\u00ee\u00ce\u00ab\u00b6\u00039M\u008e\u00a7\u00c4\u0015K\u00e2\u000f\u00f9dx?Y\u00f0\u00ed_\u00b9\u0004\u0019\u0087\u00ad3\u000f\u00b6J\u0007\u00c1\u00ec&\u008a\u00f7\u00cbA\u00ed\u0014\"\u00a7\u00a0\u0015\\\u001eky\t\u0010\u0019\u0089\u009e\u00a5=?\u008eU.\u00e6\t\u00ac\u00bb:_{\u00afX\u0012\u00e3\u00e5Q\u00feP\u00e4H\u00fd\u0093\u0087\u00d3E\u001f\u00c5\u0092\u0005n*\u0098\u00b4\u00c9\u00ac\u000e\u00a42\u00a0Vt\u00c6Q\u00dd)\u00b2.5]e\u0096G\u0090\u008e1Zh\u00f3)\u0001\u00f5\u0084\u00c7\u00fb\u00903|\u00b7\u0089\u008bD;\u0000Sj\u0092\u00c5\u0011\u00b6\u00e8\u0011\u0019\u0097/\u001f\u00ce\u008d\u009478\u00d3\u00e1$a\b\u0002\u00ed\u00e7\u0094\u00b5\u00d6\bO\u00eaq\u00bb\u008a*\u00e0\u00e0\u0018\u00b0:30~\u00ed\u009f4\u00bd\u00c5\u008b\u00f5\u00aa\u00f4j\u00bf\u00d7PQsq\u00f2\u00d6";
                var5_11 = "\u00cak\u00c09\u008b\u00b6z\u00a4\u007fH\u0011\u00dcee\u00c6z\u00adz{\u001f&{\u00e8\u0013\u00f3\u00e0\u00f2\u00d4e\u00a2\u0013\u008c\u0086\u000e\u00dbq|x1k\u00df\u0017I)\u00d5\u00fa@>g\u00d3\u001b\u00e0\u0003\u00fc\u008c\u008bmv\u0010\u00ae\u00d0\u00f4\u00fc;\u00fcK\u00d1aC\u00c0\u00a8\u009au\u00dd\u008e\u00c5{<\u00c3A\u0013\u00b0\u00ae\u0004\u00d6\u00f3\u00ee\u00besLK&^\u008b\u00ac\u00ff\u00d8\u00f3]C\u00a5\u0013@2\u009bky\u009d\u00d9\u001f\u00fet\u00d72\t%pC\u00a2Y\u00b3\u00d6>~D\u00bd\u009b\u0082h\u00a7`\u00d4\u000b\u00b0\u00b3\u00c2\u00af?\u00eb\u0017\u00be\\\u00a5|\u0014\u00bfP..\u009f \u00b4\u000e1[\u0097%\u001a\u0007\u0011J\u0090\u00a1\u00f87\u001a\u00ae\u00aduA\u009d\"`\u00d8\u00ddY\u00bdqk\u00b2\u00dfV\u0091?U9M\u0011\u00cbg\u00f9\u00b3\u00bf\u00ca\u0084\u001bR \u00bf*\u00b1\u0005{U\u00126\"\u00d7q&\u008fT\u0080\u00aa\u00ac\u0082\u00a7'CO\u009c0\u001cVh\u00c2\u0089\u00a5\u00db\u0091\u00f7\u0003M\u00a3\u00b4a?'Q\u00f9\u0089\u00cd>\u00fc.0\u00f6\u00a1\u00ac[\b\u00c2!\t\tc\u00a5\u0083\u008bSmw\u00b5\u00df\u0089\u00e0\u00c9\u0017\u00a2\u00ff\u00ebN\u00fb\u00b7\u00b1ry\u00b8\u00ff\u00dfh\u0091E\u00eb\u00ea\u00c4\u00ef\u0091\u00cc)\u00bev\u00ec\u00860K\u00f3\u00ad\n\u000b\u00ff\u0007\u00ab2\u008f\u00efx\u00b0\u009f\u0015\u0013\u00e3\u00d9\u00db{M<\u0095\u00b9\u00f6\u00f4\u0014\u00ae\u001f\u00adg\u00b6\u0001\u00b8c\u00e4\u0012\u0011\u00b4\u00e7\u008b\u008e\u0092\u00a5A_\u00c9\u009a%P2xs^\u00b8s9\u00e8Q\u0095v\u0097HN\u0017\u0081\u00f5*\u00ad\u00bc\\\u0007W8\u00ff\u00ae\u00be\u0006\u0017K\u00aa\u0015)\u0083\u0016rR\u0002\twE\u00df\u00a3\u00d8\u00ec\u0013\f%\"\u00a4\u00cbw|\u0085\u009a[(v\u00c5\u0099\u0082Y/I\u00d3!\u00db\u0080\u0091\u0002\u00db\u0096\u00de\u00a4\u00c4\u0092a\u00a8\u00e2`\u00e1\u00a5\u00cd\u0003\u0098\u00bc\u00cc\u00c1A\u008a\u00f6\u00farUm\u00df\u00ee\u00ce\u00ab\u00b6\u00039M\u008e\u00a7\u00c4\u0015K\u00e2\u000f\u00f9dx?Y\u00f0\u00ed_\u00b9\u0004\u0019\u0087\u00ad3\u000f\u00b6J\u0007\u00c1\u00ec&\u008a\u00f7\u00cbA\u00ed\u0014\"\u00a7\u00a0\u0015\\\u001eky\t\u0010\u0019\u0089\u009e\u00a5=?\u008eU.\u00e6\t\u00ac\u00bb:_{\u00afX\u0012\u00e3\u00e5Q\u00feP\u00e4H\u00fd\u0093\u0087\u00d3E\u001f\u00c5\u0092\u0005n*\u0098\u00b4\u00c9\u00ac\u000e\u00a42\u00a0Vt\u00c6Q\u00dd)\u00b2.5]e\u0096G\u0090\u008e1Zh\u00f3)\u0001\u00f5\u0084\u00c7\u00fb\u00903|\u00b7\u0089\u008bD;\u0000Sj\u0092\u00c5\u0011\u00b6\u00e8\u0011\u0019\u0097/\u001f\u00ce\u008d\u009478\u00d3\u00e1$a\b\u0002\u00ed\u00e7\u0094\u00b5\u00d6\bO\u00eaq\u00bb\u008a*\u00e0\u00e0\u0018\u00b0:30~\u00ed\u009f4\u00bd\u00c5\u008b\u00f5\u00aa\u00f4j\u00bf\u00d7PQsq\u00f2\u00d6".length();
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
                    var4_10 = "\u0099s\u00dd\u00a6\u00b4l\u00f2\u0017\u00bc\u00e1\u00f1\u008b\u00a9l\u00a8\u0082";
                    var5_11 = "\u0099s\u00dd\u00a6\u00b4l\u00f2\u0017\u00bc\u00e1\u00f1\u008b\u00a9l\u00a8\u0082".length();
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
        X_.c = var6_8;
        X_.d = new Integer[81];
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x5C1) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 106;
                case 1 -> 208;
                case 2 -> 22;
                case 3 -> 160;
                case 4 -> 93;
                case 5 -> 248;
                case 6 -> 11;
                case 7 -> 73;
                case 8 -> 177;
                case 9 -> 16;
                case 10 -> 203;
                case 11 -> 207;
                case 12 -> 152;
                case 13 -> 60;
                case 14 -> 194;
                case 15 -> 132;
                case 16 -> 141;
                case 17 -> 216;
                case 18 -> 234;
                case 19 -> 213;
                case 20 -> 103;
                case 21 -> 204;
                case 22 -> 178;
                case 23 -> 192;
                case 24 -> 125;
                case 25 -> 252;
                case 26 -> 108;
                case 27 -> 47;
                case 28 -> 18;
                case 29 -> 7;
                case 30 -> 15;
                case 31 -> 76;
                case 32 -> 158;
                case 33 -> 30;
                case 34 -> 105;
                case 35 -> 210;
                case 36 -> 94;
                case 37 -> 49;
                case 38 -> 107;
                case 39 -> 201;
                case 40 -> 151;
                case 41 -> 32;
                case 42 -> 82;
                case 43 -> 155;
                case 44 -> 135;
                case 45 -> 54;
                case 46 -> 143;
                case 47 -> 198;
                case 48 -> 241;
                case 49 -> 36;
                case 50 -> 44;
                case 51 -> 169;
                case 52 -> 83;
                case 53 -> 6;
                case 54 -> 211;
                case 55 -> 199;
                case 56 -> 59;
                case 57 -> 65;
                case 58 -> 48;
                case 59 -> 221;
                case 60 -> 254;
                case 61 -> 96;
                case 62 -> 133;
                case 63 -> 247;
                case 64 -> 84;
                case 65 -> 111;
                case 66 -> 197;
                case 67 -> 232;
                case 68 -> 195;
                case 69 -> 191;
                case 70 -> 225;
                case 71 -> 179;
                case 72 -> 74;
                case 73 -> 97;
                case 74 -> 173;
                case 75 -> 64;
                case 76 -> 188;
                case 77 -> 226;
                case 78 -> 167;
                case 79 -> 200;
                case 80 -> 1;
                case 81 -> 102;
                case 82 -> 77;
                case 83 -> 33;
                case 84 -> 38;
                case 85 -> 26;
                case 86 -> 186;
                case 87 -> 19;
                case 88 -> 144;
                case 89 -> 212;
                case 90 -> 238;
                case 91 -> 165;
                case 92 -> 137;
                case 93 -> 122;
                case 94 -> 136;
                case 95 -> 79;
                case 96 -> 119;
                case 97 -> 253;
                case 98 -> 220;
                case 99 -> 123;
                case 100 -> 89;
                case 101 -> 23;
                case 102 -> 53;
                case 103 -> 231;
                case 104 -> 224;
                case 105 -> 46;
                case 106 -> 42;
                case 107 -> 69;
                case 108 -> 162;
                case 109 -> 131;
                case 110 -> 246;
                case 111 -> 206;
                case 112 -> 110;
                case 113 -> 255;
                case 114 -> 88;
                case 115 -> 56;
                case 116 -> 166;
                case 117 -> 51;
                case 118 -> 163;
                case 119 -> 245;
                case 120 -> 14;
                case 121 -> 128;
                case 122 -> 174;
                case 123 -> 229;
                case 124 -> 157;
                case 125 -> 109;
                case 126 -> 4;
                case 127 -> 85;
                case 128 -> 39;
                case 129 -> 43;
                case 130 -> 209;
                case 131 -> 217;
                case 132 -> 25;
                case 133 -> 164;
                case 134 -> 190;
                case 135 -> 126;
                case 136 -> 8;
                case 137 -> 176;
                case 138 -> 40;
                case 139 -> 3;
                case 140 -> 41;
                case 141 -> 223;
                case 142 -> 115;
                case 143 -> 67;
                case 144 -> 61;
                case 145 -> 222;
                case 146 -> 218;
                case 147 -> 239;
                case 148 -> 230;
                case 149 -> 87;
                case 150 -> 81;
                case 151 -> 242;
                case 152 -> 159;
                case 153 -> 154;
                case 154 -> 189;
                case 155 -> 99;
                case 156 -> 68;
                case 157 -> 236;
                case 158 -> 127;
                case 159 -> 35;
                case 160 -> 98;
                case 161 -> 104;
                case 162 -> 182;
                case 163 -> 121;
                case 164 -> 114;
                case 165 -> 0;
                case 166 -> 228;
                case 167 -> 149;
                case 168 -> 57;
                case 169 -> 2;
                case 170 -> 187;
                case 171 -> 24;
                case 172 -> 134;
                case 173 -> 148;
                case 174 -> 17;
                case 175 -> 147;
                case 176 -> 100;
                case 177 -> 170;
                case 178 -> 205;
                case 179 -> 37;
                case 180 -> 95;
                case 181 -> 20;
                case 182 -> 28;
                case 183 -> 181;
                case 184 -> 58;
                case 185 -> 112;
                case 186 -> 124;
                case 187 -> 156;
                case 188 -> 150;
                case 189 -> 240;
                case 190 -> 161;
                case 191 -> 184;
                case 192 -> 52;
                case 193 -> 5;
                case 194 -> 113;
                case 195 -> 227;
                case 196 -> 193;
                case 197 -> 86;
                case 198 -> 91;
                case 199 -> 171;
                case 200 -> 140;
                case 201 -> 129;
                case 202 -> 145;
                case 203 -> 31;
                case 204 -> 90;
                case 205 -> 55;
                case 206 -> 120;
                case 207 -> 251;
                case 208 -> 139;
                case 209 -> 117;
                case 210 -> 202;
                case 211 -> 118;
                case 212 -> 70;
                case 213 -> 233;
                case 214 -> 172;
                case 215 -> 142;
                case 216 -> 27;
                case 217 -> 10;
                case 218 -> 34;
                case 219 -> 185;
                case 220 -> 235;
                case 221 -> 75;
                case 222 -> 153;
                case 223 -> 9;
                case 224 -> 101;
                case 225 -> 66;
                case 226 -> 244;
                case 227 -> 214;
                case 228 -> 196;
                case 229 -> 72;
                case 230 -> 168;
                case 231 -> 71;
                case 232 -> 130;
                case 233 -> 92;
                case 234 -> 13;
                case 235 -> 215;
                case 236 -> 116;
                case 237 -> 45;
                case 238 -> 183;
                case 239 -> 138;
                case 240 -> 175;
                case 241 -> 12;
                case 242 -> 63;
                case 243 -> 29;
                case 244 -> 219;
                case 245 -> 237;
                case 246 -> 21;
                case 247 -> 250;
                case 248 -> 146;
                case 249 -> 249;
                case 250 -> 180;
                case 251 -> 80;
                case 252 -> 243;
                case 253 -> 78;
                case 254 -> 50;
                default -> 62;
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
            X_.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B33;
        if (d[n2] == null) {
            X_.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }
}
