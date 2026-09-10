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

public final class nf
extends Enum<nf> {
    private final Identifier o;
    public static final /* enum */ nf Niuren;
    public static final /* enum */ nf Mengcha;
    private static final nf[] B;

    private static nf[] P(Object[] objectArray) {
        return new nf[]{hi.a("j", (long)949717741617800714L), hi.a("j", (long)749010665741364879L)};
    }

    public static nf[] values() {
        return (nf[])((Enum)((Object)hi.a("j", (long)1077963965575428988L))).clone();
    }

    public static nf valueOf(String string) {
        return (nf)((Object)hi.a("G", nf.class, (Object)string, (long)703426484721789552L));
    }

    public static /* bridge */ /* synthetic */ CallSite J(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private nf(Identifier identifier) {
        this.o = identifier;
    }

    public Identifier M(Object[] objectArray) {
        return hi.a("\u00e9", (Object)((Object)this), (long)1331427493545378858L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "GsD\u0007\u0010W\u001b@9Y\u0000\u0015\n\u0010ZcN\u0016\u000b\u000b\u000e]q\u0007~sR\u0014\u0006M\u001f";
                var5_3 = "GsD\u0007\u0010W\u001b@9Y\u0000\u0015\n\u0010ZcN\u0016\u000b\u000b\u000e]q\u0007~sR\u0014\u0006M\u001f".length();
                var2_4 = 23;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 92;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "-\u0019.mz=q*S3j\u007f`y<\u00121zg.:)\u00121\u0006\u0017\u0015#kj!";
                    var5_3 = "-\u0019.mz=q*S3j\u007f`y<\u00121zg.:)\u00121\u0006\u0017\u0015#kj!".length();
                    var2_4 = 24;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 54;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 111;
                            break;
                        }
                        case 1: {
                            v15 = 74;
                            break;
                        }
                        case 2: {
                            v15 = 96;
                            break;
                        }
                        case 3: {
                            v15 = 47;
                            break;
                        }
                        case 4: {
                            v15 = 57;
                            break;
                        }
                        case 5: {
                            v15 = 121;
                            break;
                        }
                        default: {
                            v15 = 34;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        nf.Niuren = new nf((Object)var0[3], 0, (Object)nf.J("oSOFbAgqguAjNeg2", G(java.lang.String ), (String)var0[0]));
        nf.Mengcha = new nf((Object)var0[1], 1, (Object)hi.a("G", var0[2], (long)1218614314410685839L));
        nf.B = hi.a("G", (Object)new Object[0], (long)600923888783697176L);
    }
}
