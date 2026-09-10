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

public final class nP {
    public static final uT t;
    public static final uT l;
    public static final uT m;
    public static final uT Z;
    public static final uT v;
    public static final uT j;
    public static final uT b;
    public static final uT d;
    public static final uT J;
    public static final uT N;

    private nP() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[12];
                var4_1 = 0;
                var3_2 = "U\u0015t\u0003',OWZj\u001385BD\u0015u\u0013U\u0015t\u0003',OW+x\n/1_m\u0000|\u001e>\u0015_\u001b}\u0013&&X\u001c\u0004u\u00073&Y\u0012\u0015u\u00078.X\u000fX\u001bp\b\u0015\"GW\u0006m9>&SF\u0012U\u0015t\u0003',OWZj\u0016/ _S\u0000v\u0014\u0010G\u001ar\b%4Em\u0013x\u000b/.DV\u0011\u0012U\u0015t\u0003',OWZx\u0002<&EF\u0001k\u0003\u0015_\u001b}\u0013&&X\u001c\u0004u\u00073&Y\u0012\u0015u\u00078.X\u0013^\u0011x\u0010/\u001cYV+x\n/1_m\u0000|\u001e>\u0013W\u001am\u00038\u001cYV+x\n/1_m\u0000|\u001e>";
                var5_3 = "U\u0015t\u0003',OWZj\u001385BD\u0015u\u0013U\u0015t\u0003',OW+x\n/1_m\u0000|\u001e>\u0015_\u001b}\u0013&&X\u001c\u0004u\u00073&Y\u0012\u0015u\u00078.X\u000fX\u001bp\b\u0015\"GW\u0006m9>&SF\u0012U\u0015t\u0003',OWZj\u0016/ _S\u0000v\u0014\u0010G\u001ar\b%4Em\u0013x\u000b/.DV\u0011\u0012U\u0015t\u0003',OWZx\u0002<&EF\u0001k\u0003\u0015_\u001b}\u0013&&X\u001c\u0004u\u00073&Y\u0012\u0015u\u00078.X\u0013^\u0011x\u0010/\u001cYV+x\n/1_m\u0000|\u001e>\u0013W\u001am\u00038\u001cYV+x\n/1_m\u0000|\u001e>".length();
                var2_4 = 17;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 39;
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
                    var3_2 = "\u0007H!IvE\u0013\u0007H2KLn\u0017\u0013Y\u0011\fL-Z~u\u0016\u000e\u0003#Mv{\u0006\u0002[%";
                    var5_3 = "\u0007H!IvE\u0013\u0007H2KLn\u0017\u0013Y\u0011\fL-Z~u\u0016\u000e\u0003#Mv{\u0006\u0002[%".length();
                    var2_4 = 16;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 126;
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
                            v15 = 21;
                            break;
                        }
                        case 1: {
                            v15 = 83;
                            break;
                        }
                        case 2: {
                            v15 = 62;
                            break;
                        }
                        case 3: {
                            v15 = 65;
                            break;
                        }
                        case 4: {
                            v15 = 109;
                            break;
                        }
                        case 5: {
                            v15 = 100;
                            break;
                        }
                        default: {
                            v15 = 12;
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
        nP.Z = hi.a("G", var0[7], (Object)var0[3], (long)552744722789337767L);
        nP.J = hi.a("G", var0[2], (Object)var0[10], (long)552744722789337767L);
        nP.d = hi.a("G", var0[2], (Object)var0[9], (long)552744722789337767L);
        nP.l = nP.P("yJyng3Wap3Fll4Zz", S(java.lang.String java.lang.String ), (String)var0[2], (String)var0[8]);
        nP.t = hi.a("G", var0[2], (Object)var0[1], (long)552744722789337767L);
        nP.m = hi.a("G", var0[2], (Object)var0[0], (long)552744722789337767L);
        nP.v = hi.a("G", var0[2], (Object)var0[11], (long)552744722789337767L);
        nP.N = hi.a("G", var0[2], (Object)var0[6], (long)552744722789337767L);
        nP.j = hi.a("G", var0[2], (Object)var0[4], (long)552744722789337767L);
        nP.b = hi.a("G", var0[2], (Object)var0[5], (long)552744722789337767L);
    }

    public static /* bridge */ /* synthetic */ CallSite P(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
