/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.resources.Identifier;

public final class iE
extends Enum<iE> {
    public static final /* enum */ iE DISABLE;
    public static final /* enum */ iE MOAN1;
    private final String h;
    public static final /* enum */ iE MOAN4;
    public static final /* enum */ iE ENABLE;
    public static final /* enum */ iE REISA_WELCOME;
    public static final /* enum */ iE MOAN3;
    private static final /* synthetic */ iE[] E;
    public static final /* enum */ iE SETTINGS_OPEN;
    public static final /* enum */ iE REISA_BYE;
    public static final /* enum */ iE MOAN2;
    public static final /* enum */ iE SETTINGS_CLOSE;
    public static final /* enum */ iE NYA;
    public static final /* enum */ iE SHUTDOWN;
    public static final /* enum */ iE UWU;
    private static final long[] a;
    private static final Integer[] b;

    public static iE valueOf(String string) {
        return (iE)((Object)hi.a("G", iE.class, (Object)string, (long)703426484721789552L));
    }

    private static /* synthetic */ iE[] o(Object[] objectArray) {
        iE[] iEArray = new iE[iE.a(15394, 6181320383095081284L)];
        iEArray[0] = hi.a("j", (long)1100636635296036596L);
        iEArray[1] = hi.a("j", (long)581773496316059622L);
        iEArray[2] = hi.a("j", (long)1162970244660412433L);
        iEArray[3] = hi.a("j", (long)372542407579359642L);
        iEArray[4] = hi.a("j", (long)621839539995830229L);
        iEArray[5] = hi.a("j", (long)539892748581911763L);
        iEArray[iE.a((int)19470, (long)1206344342712023396L)] = hi.a("j", (long)590696168751285995L);
        iEArray[iE.a((int)16518, (long)8699133293853963745L)] = hi.a("j", (long)951608962001514353L);
        iEArray[iE.a((int)29333, (long)8736063447372941296L)] = hi.a("j", (long)900619380119032286L);
        iEArray[iE.a((int)30872, (long)343343678331112953L)] = hi.a("j", (long)633686469269710236L);
        iEArray[iE.a((int)11731, (long)8847220252716374204L)] = hi.a("j", (long)1191993916253928232L);
        iEArray[iE.a((int)628, (long)2186583570028640029L)] = hi.a("j", (long)675107491001726717L);
        iEArray[iE.a((int)10572, (long)2050960224564976680L)] = hi.a("j", (long)939098812287086872L);
        return iEArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[26];
                        var12_1 = 0;
                        var11_2 = "M\u0019\u0014\tJ\u000b\be\r\\KA\u000b\u0003m94\u0007|'2W.ol\rK\u000b\u0015b\u0005MNK\u0011\u000ef\tM\u0005U\u0001\u0000xx\u0006]\u0000\u0000t\u0000F\u0005u! Xx\u0003V\u0017\u0000\u000ek+5B%mnk\u0011\"Z#pl\bk&4B(l~v\u0006}  T f\u0007\\\u0007\u0012w\u000eOL\u0005U\u0001\u0000x}\rJ\u000b\be\r\\^]\u0002\u0002y\u0001F\bK\u0006\u0014b\bL^V\u0005u! X~\u0005U\u0001\u0000x~\u000eK\u000b\u0015b\u0005MNK\u0011\u0002z\u0003PL\rk+5B%mnk\u0011.F)m\u0005u! X}\rj+(E-\\~}\"\"Y!f\tj+(E-\\ka+\u0005U\u0001\u0000x\u007f";
                        var13_3 = "M\u0019\u0014\tJ\u000b\be\r\\KA\u000b\u0003m94\u0007|'2W.ol\rK\u000b\u0015b\u0005MNK\u0011\u000ef\tM\u0005U\u0001\u0000xx\u0006]\u0000\u0000t\u0000F\u0005u! Xx\u0003V\u0017\u0000\u000ek+5B%mnk\u0011\"Z#pl\bk&4B(l~v\u0006}  T f\u0007\\\u0007\u0012w\u000eOL\u0005U\u0001\u0000x}\rJ\u000b\be\r\\^]\u0002\u0002y\u0001F\bK\u0006\u0014b\bL^V\u0005u! X~\u0005U\u0001\u0000x~\u000eK\u000b\u0015b\u0005MNK\u0011\u0002z\u0003PL\rk+5B%mnk\u0011.F)m\u0005u! X}\rj+(E-\\~}\"\"Y!f\tj+(E-\\ka+\u0005U\u0001\u0000x\u007f".length();
                        var10_4 = 3;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 56;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "P\u0004\u0005}Z\u0003S\u0012\u0005";
                            var13_3 = "P\u0004\u0005}Z\u0003S\u0012\u0005".length();
                            var10_4 = 5;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 29;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
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
                                    v15 = 32;
                                    break;
                                }
                                case 1: {
                                    v15 = 118;
                                    break;
                                }
                                case 2: {
                                    v15 = 121;
                                    break;
                                }
                                case 3: {
                                    v15 = 14;
                                    break;
                                }
                                case 4: {
                                    v15 = 116;
                                    break;
                                }
                                case 5: {
                                    v15 = 59;
                                    break;
                                }
                                default: {
                                    v15 = 49;
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
                var0_7 = 1247888970801588139L;
                var6_8 = new long[15];
                var3_9 = 0;
                var4_10 = "\u00a9\u0017\u009d\"vg;\u008f\u00d8_sN41\u00e0S@\u00b5l+*\u0082.\u00e2c\u00eb\u009d\u00c5N1\u00d2M\u00b47&\u00ec@\u0002\u00fc\u00c5\u00db\u0089\u00adV\u00d9\f\u00ea[l\u0091\u00e6\u00be<\u00d1:8\u008a[\u00bd.\u00a8\u00df\u0081U\u0085\u00fe\u0094\u00a7m\u00e1a@\u00ca\u00e6$\u008c\u00bd\u0083\u0011V\\\u00aca\u00e6\u00d1vS\u007fh\u00b3\u00a3v\u00bb\f\u00bf\u001d\u001c\u00b3@.M\u00a8\rn";
                var5_11 = "\u00a9\u0017\u009d\"vg;\u008f\u00d8_sN41\u00e0S@\u00b5l+*\u0082.\u00e2c\u00eb\u009d\u00c5N1\u00d2M\u00b47&\u00ec@\u0002\u00fc\u00c5\u00db\u0089\u00adV\u00d9\f\u00ea[l\u0091\u00e6\u00be<\u00d1:8\u008a[\u00bd.\u00a8\u00df\u0081U\u0085\u00fe\u0094\u00a7m\u00e1a@\u00ca\u00e6$\u008c\u00bd\u0083\u0011V\\\u00aca\u00e6\u00d1vS\u007fh\u00b3\u00a3v\u00bb\f\u00bf\u001d\u001c\u00b3@.M\u00a8\rn".length();
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
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00a9\\(\u0089D\u0082\u0090\u00bd\u00e0\u00ae\u00b4:\u008f\u00e7^\u00c9";
                    var5_11 = "\u00a9\\(\u0089D\u0082\u0090\u00bd\u00e0\u00ae\u00b4:\u008f\u00e7^\u00c9".length();
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
lbl123:
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
lbl134:
                // 1 sources

                ** continue;
            }
        }
        iE.a = var6_8;
        iE.b = new Integer[15];
        iE.ENABLE = new iE((Object)var8[6], 0, (Object)var8[11]);
        iE.DISABLE = new iE((Object)var8[12], 1, (Object)var8[3]);
        iE.SETTINGS_OPEN = new iE((Object)var8[4], 2, (Object)var8[19]);
        iE.SETTINGS_CLOSE = new iE((Object)var8[18], 3, (Object)var8[9]);
        iE.SHUTDOWN = new iE((Object)var8[15], 4, (Object)var8[10]);
        iE.REISA_WELCOME = new iE((Object)var8[14], 5, (Object)var8[21]);
        iE.REISA_BYE = new iE((Object)var8[1], iE.a(918, 6804444510031099643L), (Object)var8[22]);
        iE.UWU = new iE((Object)var8[0], iE.a(5018, 4716304854469715705L), (Object)var8[2]);
        iE.NYA = new iE((Object)var8[8], iE.a(8101, 2585688960838249165L), (Object)var8[25]);
        iE.MOAN1 = new iE((Object)var8[13], iE.a(29582, 2335119383910729442L), (Object)var8[20]);
        iE.MOAN2 = new iE((Object)var8[17], iE.a(10491, 6929669570811698585L), (Object)var8[16]);
        iE.MOAN3 = new iE((Object)var8[23], iE.a(28165, 6283830964301028197L), (Object)var8[24]);
        iE.MOAN4 = new iE((Object)var8[5], iE.a(16822, 6325066148844401880L), (Object)var8[7]);
        iE.E = hi.a("G", (Object)new Object[0], (long)429769768911820099L);
    }

    public static iE[] values() {
        return (iE[])((Enum)((Object)hi.a("j", (long)665500879631261248L))).clone();
    }

    private iE(String string2) {
        this.h = string2;
    }

    public Identifier g() {
        return iE.R("yeZ7rxAfi78PGojg", G(java.lang.String ), (String)((Object)hi.a("\u00e9", (Object)((Object)this), (long)663196948184188826L)));
    }

    public static /* bridge */ /* synthetic */ CallSite R(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3564;
        if (b[n2] == null) {
            iE.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
