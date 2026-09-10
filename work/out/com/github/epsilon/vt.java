/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

final class vt
extends Enum<vt> {
    public static final /* enum */ vt ENTER_CONTENT;
    public static final /* enum */ vt HIDDEN;
    public static final /* enum */ vt ENTER_BAR;
    private static final vt[] B;
    public static final /* enum */ vt EXIT_CONTENT;
    public static final /* enum */ vt EXIT_BAR;
    public static final /* enum */ vt SHOW;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "\u0003nJq0dy\bbFk;\u0004\u0015~Lr\t\u0003xW`=xt\u0007d\u0006\u000e\u007fGa*i";
                var7_3 = "\u0003nJq0dy\bbFk;\u0004\u0015~Lr\t\u0003xW`=xt\u0007d\u0006\u000e\u007fGa*i".length();
                var4_4 = 12;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 44;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "]&\t>c&+W&\t>\u007f-\b]0\u0014/n;)J";
                    var7_3 = "]&\t>c&+W&\t>\u007f-\b]0\u0014/n;)J".length();
                    var4_4 = 13;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 114;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 106;
                            break;
                        }
                        case 1: {
                            v15 = 26;
                            break;
                        }
                        case 2: {
                            v15 = 47;
                            break;
                        }
                        case 3: {
                            v15 = 9;
                            break;
                        }
                        case 4: {
                            v15 = 67;
                            break;
                        }
                        case 5: {
                            v15 = 11;
                            break;
                        }
                        default: {
                            v15 = 26;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 4391557490460357412L;
        ** while (true)
        vt.a = 5385958770148406050L ^ var0_7;
        vt.ENTER_BAR = new vt((Object)var2[2], 0);
        vt.ENTER_CONTENT = new vt((Object)var2[4], 1);
        vt.SHOW = new vt((Object)var2[1], 2);
        vt.EXIT_CONTENT = new vt((Object)var2[0], 3);
        vt.EXIT_BAR = new vt((Object)var2[5], 4);
        vt.HIDDEN = new vt((Object)var2[3], 5);
        vt.B = hi.a("G", (Object)new Object[0], (long)1192096155569910597L);
    }

    public static vt valueOf(String string) {
        return (vt)((Object)vt.T("mdT7GRAKlBx9Gnbd", valueOf(java.lang.Class<T> java.lang.String ), vt.class, (String)string));
    }

    private static vt[] p(Object[] objectArray) {
        vt[] vtArray = new vt[(int)a];
        vtArray[0] = hi.a("j", (long)609347977568045248L);
        vtArray[1] = hi.a("j", (long)1179058053095019367L);
        vtArray[2] = hi.a("j", (long)428561711062999056L);
        vtArray[3] = hi.a("j", (long)467765807302426635L);
        vtArray[4] = hi.a("j", (long)1162895853191382211L);
        vtArray[5] = hi.a("j", (long)615527275038428645L);
        return vtArray;
    }

    public static vt[] values() {
        return (vt[])vt.T("mdT7GRAKlBx9Gnbd", clone(), (vt[])hi.a("j", (long)1261268770257828139L));
    }

    public static /* bridge */ /* synthetic */ CallSite T(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }
}
