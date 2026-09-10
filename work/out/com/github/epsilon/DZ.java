/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.uT;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public final class DZ {
    public static final uT O;
    public static final uT o;
    public static final uT v;
    public static final uT e;
    public static final uT M;
    public static final uT I;

    public static /* bridge */ /* synthetic */ CallSite B(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[8];
                var4_1 = 0;
                var3_2 = "T\ftI\rA\nzP\u001de\r\\\u001fyH\u001d/\fA\nzP\u001de\u0018@\u001b}M\u0000\u0006_\u0011\u007fQ\u0014.\u0006_\u0011\u007fQ\u0014.\u0007D\u0017hM\u001a'\r";
                var5_3 = "T\ftI\rA\nzP\u001de\r\\\u001fyH\u001d/\fA\nzP\u001de\u0018@\u001b}M\u0000\u0006_\u0011\u007fQ\u0014.\u0006_\u0011\u007fQ\u0014.\u0007D\u0017hM\u001a'\r".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 7;
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
                    var3_2 = "\u001cQ9\u0006[c\u000e\u0007L<\u0016[#J\u001dK<\u0000RhJ";
                    var5_3 = "\u001cQ9\u0006[c\u000e\u0007L<\u0016[#J\u001dK<\u0000RhJ".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 65;
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
                            v15 = 53;
                            break;
                        }
                        case 1: {
                            v15 = 121;
                            break;
                        }
                        case 2: {
                            v15 = 28;
                            break;
                        }
                        case 3: {
                            v15 = 35;
                            break;
                        }
                        case 4: {
                            v15 = 127;
                            break;
                        }
                        case 5: {
                            v15 = 76;
                            break;
                        }
                        default: {
                            v15 = 111;
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
        DZ.e = hi.a("G", var0[3], (Object)var0[5], (long)552744722789337767L);
        DZ.v = DZ.B("Ka6KN6aiea4LWOoW", S(java.lang.String java.lang.String ), (String)var0[4], (String)var0[6]);
        DZ.I = hi.a("G", var0[4], (Object)var0[0], (long)552744722789337767L);
        DZ.M = hi.a("G", var0[4], (Object)var0[2], (long)552744722789337767L);
        DZ.o = hi.a("G", var0[4], (Object)var0[1], (long)552744722789337767L);
        DZ.O = hi.a("G", var0[4], (Object)var0[7], (long)552744722789337767L);
    }

    private DZ() {
    }
}
