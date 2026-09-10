/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.ON;
import com.github.epsilon.Ok;
import com.github.epsilon.hi;
import com.github.epsilon.vq;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class vG
extends LinkedHashMap<Ok, ON> {
    final vq K;
    private static final long[] a;
    private static final Integer[] b;

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

    vG(vq vq2, int n, float f, boolean bl) {
        vq vq3 = vq2;
        Objects.requireNonNull(vq3);
        this.K = vq3;
        super(n, f, bl);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<Ok, ON> var1_1) {
        block15: {
            var2_2 = Dl.S();
            var3_3 /* !! */  = hi.a("G", (int)vG.a(30131, 1000912854149489243L), (int)vG.a(6544, 1454783426179894882L), (long)834203424483934088L) * vG.a(20481, 576830509147408356L) + vG.a(10825, 6958551855233449400L);
            if (var2_2) ** GOTO lbl16
            block8: while (true) {
                block18: {
                    block17: {
                        block16: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)this, (long)943513205160339422L);
                            v1 = vG.a(31627, 2269402931438414955L);
                            if (!var2_2) break block16;
                            if (v0 /* !! */  > v1) break block17;
                            v0 /* !! */  = (CallSite)(vG.a(18755, 8430106183584800432L) / vG.a(14096, 3008811255569916138L) * vG.a(9020, 3632935823861396688L) * vG.a(3232, 2485668074531330890L) ^ vG.a(17454, 4359338913398510540L));
                            v1 = vG.a(13458, 1448174679734854501L);
                        }
                        var3_3 /* !! */  = v0 /* !! */  - v1;
                        if (var2_2) break block18;
                    }
                    var3_3 /* !! */  = (reference)(((vG.a(31044, 2209218389150756522L) ^ vG.a(32151, 3744147267547556449L)) - vG.a(5257, 1631295316277789556L)) / vG.a(24481, 5019053726345513029L) ^ vG.a(17522, 7226692809729823630L));
                }
                block9: while (true) {
                    switch (var3_3 /* !! */ ) {
                        default: {
                            continue block8;
                        }
                        case 899016866: {
                            v2 = true;
                            var3_3 /* !! */  = vG.Z("i7eo8uV7EJx0AZTS", max(int int ), (int)(vG.Z("i7eo8uV7EJx0AZTS", max(int int ), (int)vG.a(17294, 6144977725786281079L), (int)vG.a(20956, 6826657333489026623L)) - vG.a(3971, 613891870399436925L)), (int)vG.a(21385, 1640746109017572465L)) + vG.a(26464, 9018166296765165705L);
                            if (!var2_2) {
                                break block8;
                            }
                            break block15;
                        }
                        case 899016867: {
                            v2 = false;
                            if (var2_2) break block8;
                            return v2;
                        }
                        case 899016865: {
                            hi.a("G", (long)804704677991023612L);
                            hi.a("G", (long)818835474660401656L);
                            var3_3 /* !! */  = (reference)(((vG.a(11174, 1349798845472652377L) ^ vG.a(9685, 756496297302307360L)) / vG.a(829, 2579837990487004380L) + vG.a(17538, 5321204007557714802L)) / vG.a(18070, 1618434905947525497L) - vG.a(6787, 2089846290120346990L));
                            continue block9;
                        }
                    }
                    break;
                }
                break;
            }
            var3_3 /* !! */  = vG.Z("i7eo8uV7EJx0AZTS", max(int int ), (int)(hi.a("G", (int)vG.a(22464, 6583565638006554667L), (int)vG.a(26032, 4327682226180518487L), (long)834203424483934088L) - vG.a(32342, 3226175701030005165L)), (int)vG.a(15743, 2006714996090186393L)) + vG.a(31887, 5866033016389397371L);
        }
        switch (var3_3 /* !! */ ) {
            default: {
                return v2;
            }
            case -341989636: 
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 815314921195627922L;
                var6_1 = new long[32];
                var3_2 = 0;
                var4_3 = "\u00a4u\u00fd\"h<\u0006\u00e1\u00d8\n=+B\u009c-\u00dc\u00c86;\u0015y\u00ed\u00eb\u00f7\u00ecS\u0082\u00a7J\u00c4\u0003\n\u001c\u008fO\u00f98\u00f9\u00f1@\u00c6v\u0013?\u00ddm\b\u00f91\u00a8\u000f\u00a3\u00ccB\u00df\u009f\u00c8\u0094\u008d\u0083R\u001c~U\u00b2\u009c\u009bo\u009f\u0082h\u008d\u00e0\u0092\u00d8\u009c\"\u009b=\u00f7\u0096\u00a6\u00c0\u009d<\u00e8\u00b4\u00ed\u00da%W\u00f2\u008a\u00c0\u0019A\u0098\u00e2\u0092\u00d2\u0000jw\u009b\u00df\u00dab\u0012\u00c0z\u00cdQ\u0011\u00ab\u00f0\u00a2{\u00e6\u0081\u0097s\u000e'?\u00c6\u001e\u00d9\u00f9\u00d7\u00ebz\u00f2$'o\u00f8\u00a1&\u00e27\u0092\u00e6li\u00b7\u00d4\u00dd\u00d4_q\u00cfP\u00af\u0093\u00eaaL\u00a1\u0093\u00fbx+\u00bfQ\u00c51\u00d0\u00d6\u0012m\u00db\u009a\u0084\u0097\u00c2\u007f/'dZ\u00e2\u00b4\u00907\u00d2\u00ce\u0004\u0084\u008e\u0087\u00dag\u00f1\u00ab\u00d8\u001c\u00e5\u0007\u0094\u00f64\u00d3g<KC\u00e2}\u0004\u0080\u00af\u0017\u00f1\u0081<\u0007\u00ab\u001b\u0006X2\u0017JXQ\u00d4$\u00c0Q\u0012\u0015\u00cb\u00a4oh\u00c4\u00c3;m\u00e2";
                var5_4 = "\u00a4u\u00fd\"h<\u0006\u00e1\u00d8\n=+B\u009c-\u00dc\u00c86;\u0015y\u00ed\u00eb\u00f7\u00ecS\u0082\u00a7J\u00c4\u0003\n\u001c\u008fO\u00f98\u00f9\u00f1@\u00c6v\u0013?\u00ddm\b\u00f91\u00a8\u000f\u00a3\u00ccB\u00df\u009f\u00c8\u0094\u008d\u0083R\u001c~U\u00b2\u009c\u009bo\u009f\u0082h\u008d\u00e0\u0092\u00d8\u009c\"\u009b=\u00f7\u0096\u00a6\u00c0\u009d<\u00e8\u00b4\u00ed\u00da%W\u00f2\u008a\u00c0\u0019A\u0098\u00e2\u0092\u00d2\u0000jw\u009b\u00df\u00dab\u0012\u00c0z\u00cdQ\u0011\u00ab\u00f0\u00a2{\u00e6\u0081\u0097s\u000e'?\u00c6\u001e\u00d9\u00f9\u00d7\u00ebz\u00f2$'o\u00f8\u00a1&\u00e27\u0092\u00e6li\u00b7\u00d4\u00dd\u00d4_q\u00cfP\u00af\u0093\u00eaaL\u00a1\u0093\u00fbx+\u00bfQ\u00c51\u00d0\u00d6\u0012m\u00db\u009a\u0084\u0097\u00c2\u007f/'dZ\u00e2\u00b4\u00907\u00d2\u00ce\u0004\u0084\u008e\u0087\u00dag\u00f1\u00ab\u00d8\u001c\u00e5\u0007\u0094\u00f64\u00d3g<KC\u00e2}\u0004\u0080\u00af\u0017\u00f1\u0081<\u0007\u00ab\u001b\u0006X2\u0017JXQ\u00d4$\u00c0Q\u0012\u0015\u00cb\u00a4oh\u00c4\u00c3;m\u00e2".length();
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
                    var4_3 = "\u00e2yq\u00d9a\\;\u0088\u00d5\u00b0\u00a4\u00bf\u00a5\u0081\u00c5u";
                    var5_4 = "\u00e2yq\u00d9a\\;\u0088\u00d5\u00b0\u00a4\u00bf\u00a5\u0081\u00c5u".length();
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
        vG.a = var6_1;
        vG.b = new Integer[32];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17E5;
        if (b[n2] == null) {
            vG.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
