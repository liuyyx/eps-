/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.l5;
import com.github.epsilon.nT;
import java.lang.invoke.CallSite;

public class XZ {
    private final nT D = new nT((l5)((Object)hi.a("j", (long)791229020891128130L)));
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean F(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        ih ih2 = (ih)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f2 = ((Float)objectArray[4]).floatValue();
        boolean bl = Dl.t();
        int n = (XZ.a(10058, 8242338545378389789L) / 5 - XZ.a(956, 5613433408736349176L) ^ XZ.a(29143, 523861324992493954L)) - XZ.a(5223, 5259498332171426817L) - XZ.a(29153, 4678154939952806320L);
        boolean bl2 = true;
        block5: while (true) {
            block8: {
                block10: {
                    float f3;
                    block9: {
                        if (bl2 && !(bl2 = false) && !bl) break block8;
                        float f4 = f2 - 0.0f;
                        f3 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
                        if (bl) break block9;
                        if (f3 <= 0) break block10;
                        f3 = XZ.a(17828, 6626953920761564611L) * XZ.a(22521, 6906637282836193209L) - XZ.a(2705, 7021764357081809628L) + XZ.a(21573, 7639482457227336733L) + XZ.a(10020, 7094409539083235184L);
                    }
                    n = (int)f3;
                    if (!bl) break block8;
                }
                n = ((XZ.a(27788, 3107107583230813394L) - XZ.a(3306, 2687560741352391853L)) * XZ.a(31689, 416428111077454721L) ^ XZ.a(14018, 4051187792540794516L)) - XZ.a(3838, 280249784513939124L);
            }
            switch (n) {
                default: {
                    continue block5;
                }
                case 395573120: {
                    return false;
                }
                case 395573122: {
                    float f5 = f2 + hi.a("\u00a5", (Object)ih2, (long)665954777623212870L);
                    return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)702186541132690847L), (double)d, (double)d2, (Object)ih2, (float)f, (float)f2, (float)f5, (long)426112027242925109L);
                }
                case 395573123: 
            }
            break;
        }
        return true;
    }

    public void V() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)702186541132690847L), (Object)new Object[0], (long)842104927008513023L);
    }

    public boolean a() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)702186541132690847L), (Object)new Object[0], (long)753131185934852406L);
    }

    public boolean l() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)702186541132690847L), (Object)new Object[0], (long)1272429687628048271L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float u(double var1_1, ih var3_2, float var4_3) {
        block17: {
            block15: {
                block16: {
                    block14: {
                        block12: {
                            block13: {
                                var5_4 = Dl.S();
                                var7_5 /* !! */  = XZ.a(20570, 4334219244109764613L) * XZ.a(18139, 3812049332618006173L) + XZ.a(3813, 3590616767269684865L);
                                if (!var5_4) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)702186541132690847L), (Object)new Object[0], (long)1272429687628048271L);
                                        if (!var5_4) break block12;
                                        if (v0 /* !! */  == false) break block13;
                                        break block14;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        cfr_temp_0 = var4_3 - 0.0f;
                                        v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                        if (!var5_4) break block15;
                                        if (v1 > 0) break block16;
                                        break block17;
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    return -1.0f;
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = var4_3 + hi.a("\u00a5", (Object)var3_2, (long)665954777623212870L);
                                        return (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)702186541132690847L), (double)var1_1, (Object)var3_2, (float)var4_3, (float)var6_6, (long)1293232622283319871L);
                                    }
                                }
lbl20:
                                // 6 sources

                                while (true) {
                                    switch (var7_5 /* !! */ ) {
                                        default: {
                                            ** continue;
                                        }
                                        case 612412022: {
                                            ** continue;
                                        }
                                        case 612412024: {
                                            ** continue;
                                        }
                                        case 612412025: {
                                            ** continue;
                                        }
                                        case 612412026: 
                                    }
                                    return (float)hi.a("G", (long)562426116161301804L);
                                }
                            }
                            v0 /* !! */  = (CallSite)((XZ.a(23901, 3620082932164891960L) + XZ.a(14512, 6583462318748430569L) ^ XZ.a(2642, 5392445876950057480L)) - XZ.a(23138, 5421162654300410414L) + XZ.a(2105, 8204706157157957751L));
                        }
                        var7_5 /* !! */  = (int)v0 /* !! */ ;
                        if (var5_4) ** GOTO lbl20
                    }
                    var7_5 /* !! */  = (XZ.a(13096, 4868219753576168299L) + XZ.a(23061, 3792919807897637448L)) / XZ.a(7711, 5083091358241379926L) + XZ.a(21798, 5084151512686566774L);
                    if (var5_4) ** GOTO lbl20
                }
                v1 = XZ.a(11631, 3816129025610704173L) * XZ.a(22976, 2453279589371154834L) - XZ.a(10986, 942848345668739745L) ^ XZ.a(9653, 464796420334546409L);
            }
            var7_5 /* !! */  = (int)v1;
            if (var5_4) ** GOTO lbl20
        }
        var7_5 /* !! */  = (XZ.a(4108, 3582597740791617623L) + XZ.a(21039, 4585342804614191712L) ^ XZ.a(690, 6012744609253804787L)) - XZ.a(12254, 7469298744559986573L) + XZ.a(1772, 7533177514889367209L);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4186287839568894549L;
                var6_1 = new long[36];
                var3_2 = 0;
                var4_3 = "\u009f\u00adZS\u00ed\u00e0\u00c8\nf\u00a8_\u00ce\u00c5\u00b4RZ\u0003.\u00e2\u00d9A\u00f6\u0088\u00d3\u00b8\\tw\u008a\u00cd\u009a\u00ff\u00a9\u00ad\u0003\u00da\u00e5\u0093\u00f3\u00ab?\u00a3%(\u0007\u0092\u00b9MhA\u00bfkr\u00f8\u0097^\u000f\u0013\u0083g-[\u00e14\u0011\u00b8&\u00d5r\u00c6\u0006&\u00135\"\u00fd \u0081Nw9AR\u00db\u00c6\u0098\u00dc\u0084\u0018\u00a6\u00d5\u00a7\u009f-D\u00e7\u00f3\u0093B\u00ed\u008c\u0091\u001a'`\u00c8\u00fb\u00fa\u0085\u00dfL\t\u00ec\u000b\u009f\u00af22TK\u00b1-\u008d\u00c8\u0013\u00c6\u00f2\u008aG!g\u00ab\u00ea#\u00e84\u0084p\u00aa\u00b8$\u00e1\u00e0@\u008a\u00d5\u00b9:\u001d\u0091\u00b9\u00bfj\u0018+\u00d5\u00f4\u001a\u00a0\u00f0d\u0083\u0004U\u000f\u00f3;\u00cdG\u00d6\u008d\u001df=Q\u00fc\u00a3\u00e5\u00a5\n\u000b\u00da\u0000^\u00fc\u00ee\u00d4\r\u00032s\u0085=\u00de)\u00e1<\u00aa\u000b\u00fd\u00fe,\u00aa\u00a2\u00ac1\u00cfW\u00a2\u008f\u00a0\u00a6\u00ca|\u00f4\u00e4\u0080\u00a6\u0091(\u00b7?:/\u00cc6B\u009e\u0094\u00fcx\u00a4\u00ab.\u00dc|(j.n\u001c\u00f8\u0092P\u001e\u0005\u00b1\u00b6G#\u0017G\u00cf\u00bfT\u00f06\u00fb\u00ed\u0005\u00e4\u00a6\r\u00c6\u00c5Dh\u00ea\u0013\u009b\u0099\u009f";
                var5_4 = "\u009f\u00adZS\u00ed\u00e0\u00c8\nf\u00a8_\u00ce\u00c5\u00b4RZ\u0003.\u00e2\u00d9A\u00f6\u0088\u00d3\u00b8\\tw\u008a\u00cd\u009a\u00ff\u00a9\u00ad\u0003\u00da\u00e5\u0093\u00f3\u00ab?\u00a3%(\u0007\u0092\u00b9MhA\u00bfkr\u00f8\u0097^\u000f\u0013\u0083g-[\u00e14\u0011\u00b8&\u00d5r\u00c6\u0006&\u00135\"\u00fd \u0081Nw9AR\u00db\u00c6\u0098\u00dc\u0084\u0018\u00a6\u00d5\u00a7\u009f-D\u00e7\u00f3\u0093B\u00ed\u008c\u0091\u001a'`\u00c8\u00fb\u00fa\u0085\u00dfL\t\u00ec\u000b\u009f\u00af22TK\u00b1-\u008d\u00c8\u0013\u00c6\u00f2\u008aG!g\u00ab\u00ea#\u00e84\u0084p\u00aa\u00b8$\u00e1\u00e0@\u008a\u00d5\u00b9:\u001d\u0091\u00b9\u00bfj\u0018+\u00d5\u00f4\u001a\u00a0\u00f0d\u0083\u0004U\u000f\u00f3;\u00cdG\u00d6\u008d\u001df=Q\u00fc\u00a3\u00e5\u00a5\n\u000b\u00da\u0000^\u00fc\u00ee\u00d4\r\u00032s\u0085=\u00de)\u00e1<\u00aa\u000b\u00fd\u00fe,\u00aa\u00a2\u00ac1\u00cfW\u00a2\u008f\u00a0\u00a6\u00ca|\u00f4\u00e4\u0080\u00a6\u0091(\u00b7?:/\u00cc6B\u009e\u0094\u00fcx\u00a4\u00ab.\u00dc|(j.n\u001c\u00f8\u0092P\u001e\u0005\u00b1\u00b6G#\u0017G\u00cf\u00bfT\u00f06\u00fb\u00ed\u0005\u00e4\u00a6\r\u00c6\u00c5Dh\u00ea\u0013\u009b\u0099\u009f".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00b9\u00ee\u00d5\u00e7\u00d1\u00e4r\u008d\u00ff\u0083\u00a4eK\u00fc$s";
                    var5_4 = "\u00b9\u00ee\u00d5\u00e7\u00d1\u00e4r\u008d\u00ff\u0083\u00a4eK\u00fc$s".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        XZ.a = var6_1;
        XZ.b = new Integer[36];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4844;
        if (b[n2] == null) {
            XZ.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
