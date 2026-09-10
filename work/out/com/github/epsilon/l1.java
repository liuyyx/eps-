/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon._E;
import com.github.epsilon.dK;
import com.github.epsilon.hi;
import com.github.epsilon.iC;
import com.github.epsilon.lH;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

final class l1 {
    private final _E C;
    private final dK z;
    private final Consumer<String> a;
    private final String N;
    private final BooleanSupplier L;
    private final String I;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private l1(iC iC2, dK dK2, String string, String string2, Consumer consumer, BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(iC2);
        this.C = new _E((lH)((Object)hi.a("j", (long)611443736556992631L)), d);
        this.z = dK2;
        this.N = string;
        this.I = string2;
        this.a = consumer;
        this.L = booleanSupplier;
    }

    public static /* bridge */ /* synthetic */ CallSite L(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    private boolean y(Object[] var1_1) {
        block16: {
            var2_2 = Dl.S();
            var3_3 = hi.a("G", (int)l1.a(1293, 3632384719078904482L), (int)l1.a(16159, 2994903648162179232L), (long)834203424483934088L) + l1.a(34, 4622066887574509444L);
            if (var2_2) ** GOTO lbl22
lbl5:
            // 2 sources

            while (true) {
                block17: {
                    if (hi.a("\u00e9", (Object)this, (long)1129579152225306486L) != null) break block17;
                    var3_3 = hi.a("G", (int)(l1.a(1442, 8222086571507601928L) / l1.a(32341, 2167989656200325616L)), (int)l1.a(18274, 4103399635980161227L), (long)834203424483934088L) + l1.a(30136, 2865825437842678298L) - l1.a(18069, 5432182622264627510L);
                    if (var2_2) ** GOTO lbl22
                }
                var3_3 = (reference)((hi.a("G", (int)hi.a("G", (int)(l1.a(15429, 7528373743122312165L) / 2), (int)l1.a(32311, 3307035096663599514L), (long)834203424483934088L), (int)l1.a(29325, 727037690743629108L), (long)834203424483934088L) ^ l1.a(12601, 1100654618325149320L)) + l1.a(5320, 6119558681512985471L));
                if (var2_2) ** GOTO lbl22
                if (true) ** GOTO lbl17
                break;
            }
            block10: while (true) {
                block20: {
                    block19: {
                        block18: {
                            v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1129579152225306486L), (long)748478658478100086L);
                            if (!var2_2) break block18;
                            if (v0 != false) break block19;
lbl17:
                            // 2 sources

                            v0 = var3_3 = hi.a("G", (int)(l1.a(9180, 7034705010717291616L) / l1.a(29822, 3464987828122330059L)), (int)l1.a(19855, 1048989147811093051L), (long)834203424483934088L) + l1.a(18612, 7013202969977528095L) - l1.a(30464, 4053288623544934561L);
                        }
                        if (var2_2) break block20;
                    }
                    var3_3 = l1.L("Iag2bSNSNTijHbJ6", max(int int ), (int)(l1.a(12449, 4862983055535040262L) / l1.a(9456, 8436931019616121675L) * l1.a(7329, 8435088701089106693L) - l1.a(22545, 7630659415140929443L)), (int)l1.a(21130, 3872536285043230002L)) + l1.a(28947, 3274648529104578217L);
                }
                switch (var3_3) {
                    default: {
                        ** continue;
                    }
                    case -719836851: {
                        continue block10;
                    }
                    case -719836852: {
                        v1 = true;
                        var3_3 = (reference)((l1.a(6219, 6225999895314321344L) ^ l1.a(26479, 5227317897719165121L)) * l1.a(2701, 4885281746557525309L) * l1.a(17311, 2997676276294849580L) ^ l1.a(20765, 6584646401816004256L));
                        if (!var2_2) {
                            break block10;
                        }
                        break block16;
                    }
                    case -719836853: {
                        v1 = false;
                        if (var2_2) break block10;
                        return v1;
                    }
                    case -719836854: {
                        l1.L("Iag2bSNSNTijHbJ6", Z(float float float float float ), (float)0.5f, (float)0.5f, (float)1.0f, (float)2.0f, (float)2.0f);
                        hi.a("G", (long)495291380660240240L);
                        continue block10;
                    }
                }
                break;
            }
            var3_3 = (reference)((l1.a(24703, 1137174791877736403L) ^ l1.a(25688, 470575147245614034L)) * l1.a(27238, 8328451126730145230L) * l1.a(15434, 7405589112142883828L) ^ l1.a(17696, 7051592934172758678L));
        }
        switch (var3_3) {
            default: {
                return v1;
            }
            case -1666186793: 
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 5112684251062334348L;
                    var8_1 = new long[34];
                    var5_2 = 0;
                    var6_3 = "\u00fc\u00161i\u00d5\u009c\u001f\u0080F\u0004\u0007\u009e\u00c5_+Uf\u0087\u001b5\u000fLB\u0001;\u00e8]j\u00b9\u00e5fm\u00e6\u00d6\u0006\u0090\u0096!\u009fD\u00f2s\u0098\u0087\u0095,\u0005\u00ac0y\u00dc\u001f![&\u00db\u00f0J4\u0081pI\u00db\u00e1\u00d9\u001cB\u00cd\u001c\u0082\u0096P[5\u00f3n\u009e\u00a4\u00c1\u001f\u00e4G\u00d4\u0098\u0011\u00de\u00e5\u00a2,6\u00e7\u00e7\u00df\u0001\u00f0\u0088.ARe\u0004C \u00cfw'\u00dbK\u00bfI>\u00e6@\u00daqhQ\u008fk(\u00efq\u00c9\u00f2\u00ef\u00c7Zu\u00156PI\u00d2\u009f\u00d2\u00b5\u00c4\u0096\u00a8\u0087;\u00fc\u0080\u00cb\u00c8hyE\u00e0\u0081\u001b6!\u00f2h+Tl\u001d<\u00ff\u008a)f\u00d9\u00c3\u00fe\u00a5%\u001c\u00fb\u009da\u008e\u00d6\u00d5\f\u009d\u00df\u00dc\u00c5\u00d2\u00b9\u00e8\u00e1\u00a9\u0005\u001e4=W\u0091\u00cc\u0094\u0099DN\u00eb4\u00d7\u00ca\u0093;\u00af\u00a4.\u0081}\u0096\u001b\u0019\u00ae\r\u00fd\"\u00f2\u0002\u0013\u008e\u009fM\u0012\u00e1\u00e0\u0096\u00f7\u00b8\u00bfe\u00f4\u00c3\u00a7\u00d9\u0010\u00ff\u009b2\u0000\u00af\u00b8\u00be:\u00b5\u00f6\u00abp\u00ec\u009d\u0084\u00c9\u00ce\u00ac\u00bf\u0005PN";
                    var7_4 = "\u00fc\u00161i\u00d5\u009c\u001f\u0080F\u0004\u0007\u009e\u00c5_+Uf\u0087\u001b5\u000fLB\u0001;\u00e8]j\u00b9\u00e5fm\u00e6\u00d6\u0006\u0090\u0096!\u009fD\u00f2s\u0098\u0087\u0095,\u0005\u00ac0y\u00dc\u001f![&\u00db\u00f0J4\u0081pI\u00db\u00e1\u00d9\u001cB\u00cd\u001c\u0082\u0096P[5\u00f3n\u009e\u00a4\u00c1\u001f\u00e4G\u00d4\u0098\u0011\u00de\u00e5\u00a2,6\u00e7\u00e7\u00df\u0001\u00f0\u0088.ARe\u0004C \u00cfw'\u00dbK\u00bfI>\u00e6@\u00daqhQ\u008fk(\u00efq\u00c9\u00f2\u00ef\u00c7Zu\u00156PI\u00d2\u009f\u00d2\u00b5\u00c4\u0096\u00a8\u0087;\u00fc\u0080\u00cb\u00c8hyE\u00e0\u0081\u001b6!\u00f2h+Tl\u001d<\u00ff\u008a)f\u00d9\u00c3\u00fe\u00a5%\u001c\u00fb\u009da\u008e\u00d6\u00d5\f\u009d\u00df\u00dc\u00c5\u00d2\u00b9\u00e8\u00e1\u00a9\u0005\u001e4=W\u0091\u00cc\u0094\u0099DN\u00eb4\u00d7\u00ca\u0093;\u00af\u00a4.\u0081}\u0096\u001b\u0019\u00ae\r\u00fd\"\u00f2\u0002\u0013\u008e\u009fM\u0012\u00e1\u00e0\u0096\u00f7\u00b8\u00bfe\u00f4\u00c3\u00a7\u00d9\u0010\u00ff\u009b2\u0000\u00af\u00b8\u00be:\u00b5\u00f6\u00abp\u00ec\u009d\u0084\u00c9\u00ce\u00ac\u00bf\u0005PN".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "\tN\u0099\u001aH\u0005\u009cWB\u00f5\u009fb\u009f\u00e9\u00de\u00c8";
                        var7_4 = "\tN\u0099\u001aH\u0005\u009cWB\u00f5\u009fb\u009f\u00e9\u00de\u00c8".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
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
            l1.b = var8_1;
            l1.c = new Integer[34];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 523611778383654403L;
        ** while (true)
        l1.d = 523611778383654523L ^ var0_7;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57AA;
        if (c[n2] == null) {
            l1.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
