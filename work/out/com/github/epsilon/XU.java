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

final class XU
extends Enum<XU> {
    public static final /* enum */ XU None;
    private static final XU[] D;
    public static final /* enum */ XU Normal;
    public static final /* enum */ XU Silent;
    public static final /* enum */ XU InvSwitch;

    public static /* bridge */ /* synthetic */ CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static XU[] values() {
        return (XU[])((Enum)((Object)hi.a("j", (long)912723213320928825L))).clone();
    }

    public static XU valueOf(String string) {
        return (XU)((Object)hi.a("G", XU.class, (Object)string, (long)703426484721789552L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "Fx/i,:\t\\\u007f5_5'\u0002vy";
                var5_3 = "Fx/i,:\t\\\u007f5_5'\u0002vy".length();
                var2_4 = 6;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 60;
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
                    var3_2 = "`E\nZ\u0018\u0019\u0004`E\u0016R";
                    var5_3 = "`E\nZ\u0018\u0019\u0004`E\u0016R".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 7;
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
                            v15 = 41;
                            break;
                        }
                        case 1: {
                            v15 = 45;
                            break;
                        }
                        case 2: {
                            v15 = 127;
                            break;
                        }
                        case 3: {
                            v15 = 48;
                            break;
                        }
                        case 4: {
                            v15 = 126;
                            break;
                        }
                        case 5: {
                            v15 = 114;
                            break;
                        }
                        default: {
                            v15 = 74;
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
        XU.None = new XU((Object)var0[3], 0);
        XU.Normal = new XU((Object)var0[2], 1);
        XU.Silent = new XU((Object)var0[0], 2);
        XU.InvSwitch = new XU((Object)var0[1], 3);
        XU.D = XU.a("uowqBINeRb3eHFcm", H());
    }

    private static XU[] H() {
        return new XU[]{hi.a("j", (long)916789227560389476L), hi.a("j", (long)1053585327047994841L), hi.a("j", (long)367852909727936803L), hi.a("j", (long)1028094451671047525L)};
    }
}
