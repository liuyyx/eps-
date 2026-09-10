/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Ok;
import com.github.epsilon.hi;
import com.github.epsilon.vq;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class vO
extends LinkedHashMap<Ok, Float> {
    final vq a;
    private static final long[] b;
    private static final Integer[] c;

    vO(vq vq2, int n, float f, boolean bl) {
        vq vq3 = vq2;
        Objects.requireNonNull(vq3);
        this.a = vq3;
        super(n, f, bl);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<Ok, Float> var1_1) {
        block14: {
            var2_2 = Dl.S();
            var3_3 = vO.a(24763, 7608923558695776985L) / vO.a(1134, 8011934162753443352L) * vO.a(30417, 1971786356157588670L) - vO.a(21359, 6980340976137994501L) ^ vO.a(10680, 8972223118454782924L);
            if (var2_2) ** GOTO lbl16
            block8: while (true) {
                block17: {
                    block16: {
                        block15: {
                            v0 = hi.a("\u00a5", (Object)this, (long)882935411634547788L);
                            v1 = vO.a(31375, 7203044700012062950L);
                            if (!var2_2) break block15;
                            if (v0 > v1) break block16;
                            v0 = hi.a("G", (int)(vO.a(131, 6488511147342713570L) / 5), (int)vO.a(190, 3519294475030418121L), (long)834203424483934088L) * vO.a(25706, 2722199074358244874L) + vO.a(29964, 8982223481708586878L);
                            v1 = vO.a(3885, 6724589201090501962L);
                        }
                        var3_3 = v0 ^ v1;
                        if (var2_2) break block17;
                    }
                    var3_3 = vO.a(21015, 5269462401044185186L) / vO.a(28026, 5294530009576849177L) ^ vO.a(13757, 4924678485365843929L);
                }
                switch (var3_3) {
                    default: {
                        continue block8;
                    }
                    case 1525155828: {
                        v2 = true;
                        var3_3 = (vO.a(16277, 7243529481179885054L) - vO.a(6452, 3477602804290866012L) ^ vO.a(8813, 1436018452716711937L)) - vO.a(1288, 4377981009122842477L);
                        if (!var2_2) {
                            break block8;
                        }
                        break block14;
                    }
                    case 1525155829: {
                        v2 = false;
                        if (var2_2) break block8;
                        ** GOTO lbl-1000
                    }
                    case 1525155830: {
                        throw null;
                    }
                }
                break;
            }
            var3_3 = (vO.a(21572, 7200945404144092727L) - vO.a(12685, 5411957719911130083L) ^ vO.a(30421, 7787681008191874227L)) - vO.a(5614, 7547368677506238339L);
        }
        switch (var3_3) {
            case 517598413: lbl-1000:
            // 2 sources

            {
                hi.a("G", (double)1.0, (float)-9.0f, (boolean)false, (boolean)true, (boolean)true, (boolean)true, (boolean)true, (boolean)false, (boolean)false, (boolean)true, (int)-1, (long)1218704056816907128L);
                return v2;
            }
        }
        return v2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7275164126796061600L;
                var6_1 = new long[22];
                var3_2 = 0;
                var4_3 = "^\u0089\u0091og\u001e\u007f\u00c2\u00bc0\u00c4V\u00b9<\u00ab\u00ea\u009f\u001a\u00d4\u00bbz\u009bq\u00ca.\u00d3\u00f8\u000b6,U\u00e3\u0002\u00e4\u007f\u001aD'{\u00c2|\u00e8\u0090\u0011\u00ad!$\u00b7\u00f6\\>\u00ae\u0084\u00ed\u00fd\u0003<\u00ed\u0016\u008a\u00c2v\u00a3\u00c9Li\u00cb\u00f1\u00d0\u00e0\u008d\u00fcu\u008e\u00abL\u0092+O\u00b5x\u00c8zcw^\u00abp\u00bc\u00e6z\u009bg\u00abE\r\n\b{\u00cf7/\u00d7\u00d9\u00e4K\u00b6\u00b3\u00ae\u00b5\u00cc\u00b4\u00fb1Ip\u00c1\u00f4%C\u000e\u00d5mv\u0091\"\u00b2F\u0012P\u00eb\u00e4R\u00e4M\u00b5\u00c2\u0089\u00e1\u00d1`\u009d}@\u0096\u0007m\u00bcr\u00ba&_>\u0083\u0013\u00ea\b\u00e8\u0094\u001b";
                var5_4 = "^\u0089\u0091og\u001e\u007f\u00c2\u00bc0\u00c4V\u00b9<\u00ab\u00ea\u009f\u001a\u00d4\u00bbz\u009bq\u00ca.\u00d3\u00f8\u000b6,U\u00e3\u0002\u00e4\u007f\u001aD'{\u00c2|\u00e8\u0090\u0011\u00ad!$\u00b7\u00f6\\>\u00ae\u0084\u00ed\u00fd\u0003<\u00ed\u0016\u008a\u00c2v\u00a3\u00c9Li\u00cb\u00f1\u00d0\u00e0\u008d\u00fcu\u008e\u00abL\u0092+O\u00b5x\u00c8zcw^\u00abp\u00bc\u00e6z\u009bg\u00abE\r\n\b{\u00cf7/\u00d7\u00d9\u00e4K\u00b6\u00b3\u00ae\u00b5\u00cc\u00b4\u00fb1Ip\u00c1\u00f4%C\u000e\u00d5mv\u0091\"\u00b2F\u0012P\u00eb\u00e4R\u00e4M\u00b5\u00c2\u0089\u00e1\u00d1`\u009d}@\u0096\u0007m\u00bcr\u00ba&_>\u0083\u0013\u00ea\b\u00e8\u0094\u001b".length();
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
                    var4_3 = "\u00c9\u00a8\u00a9`\u000bo\u00cf\u0013\u00c8A\u00c6\u008d\u009f\u0083\u00a7}";
                    var5_4 = "\u00c9\u00a8\u00a9`\u000bo\u00cf\u0013\u00c8A\u00c6\u008d\u009f\u0083\u00a7}".length();
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
        vO.b = var6_1;
        vO.c = new Integer[22];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5266;
        if (c[n2] == null) {
            vO.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
