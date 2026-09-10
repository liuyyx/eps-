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

public final class lJ {
    public static final uT u;
    public static final uT C;
    public static final uT H;
    public static final uT k;
    public static final uT j;
    public static final uT a;
    public static final uT p;
    public static final uT L;
    public static final uT n;
    public static final uT R;
    public static final uT J;
    public static final uT B;
    public static final uT W;

    private lJ() {
    }

    public static /* bridge */ /* synthetic */ CallSite x(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
                var0 = new String[15];
                var4_1 = 0;
                var3_2 = "5\"Mo\u0004A}6?Le\u000ep%'$K`\u0004\u00131,LiOjj!*Zx>hn!>Vc\u000f\u00191,LiOmd>(Kd\bpl\f:Zb\u0015A|!\"Qk\u0018'?^b\u0012rj'$PbOnj0&Zx>{y!\"M\u0003%$^\f1,LiOln5?Z\u007f\t\u0014 .Mi\u0004p%5\"Mo\u0004A}6?Le\u000ep\u00151,LiO}j=.Z`>\u007fe7\u0012Mi\u0012{\u007f 1,LiOjc:>`{\brg\f?Z}\u0014wy6\u0012^S\u0013{x',Mx\u000b1,LiO}j=.Z`\u00101,LiOmn'\u0012Ii\u0013mb<#\u001d9,ImOxj:!Zh>jd\f;Z~\bxr\f>Z\u007f\u0012wd=\u0003%$^";
                var5_3 = "5\"Mo\u0004A}6?Le\u000ep%'$K`\u0004\u00131,LiOjj!*Zx>hn!>Vc\u000f\u00191,LiOmd>(Kd\bpl\f:Zb\u0015A|!\"Qk\u0018'?^b\u0012rj'$PbOnj0&Zx>{y!\"M\u0003%$^\f1,LiOln5?Z\u007f\t\u0014 .Mi\u0004p%5\"Mo\u0004A}6?Le\u000ep\u00151,LiO}j=.Z`>\u007fe7\u0012Mi\u0012{\u007f 1,LiOjc:>`{\brg\f?Z}\u0014wy6\u0012^S\u0013{x',Mx\u000b1,LiO}j=.Z`\u00101,LiOmn'\u0012Ii\u0013mb<#\u001d9,ImOxj:!Zh>jd\f;Z~\bxr\f>Z\u007f\u0012wd=\u0003%$^".length();
                var2_4 = 19;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 96;
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
                    var3_2 = "dy\u0019<\u001a8;tn\u000f+k=;tk\u00036Z\u001ddy\u0019<\u001a/;r}\t-]%9Yk\u000f+B.,Yn\u000f+G\"1h";
                    var5_3 = "dy\u0019<\u001a8;tn\u000f+k=;tk\u00036Z\u001ddy\u0019<\u001a/;r}\t-]%9Yk\u000f+B.,Yn\u000f+G\"1h".length();
                    var2_4 = 19;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 53;
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
                            v15 = 51;
                            break;
                        }
                        case 1: {
                            v15 = 45;
                            break;
                        }
                        case 2: {
                            v15 = 95;
                            break;
                        }
                        case 3: {
                            v15 = 108;
                            break;
                        }
                        case 4: {
                            v15 = 1;
                            break;
                        }
                        case 5: {
                            v15 = 126;
                            break;
                        }
                        default: {
                            v15 = 107;
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
        lJ.H = hi.a("G", var0[4], (Object)var0[9], (long)552744722789337767L);
        lJ.a = hi.a("G", var0[12], (Object)var0[5], (long)552744722789337767L);
        lJ.k = hi.a("G", var0[12], (Object)var0[2], (long)552744722789337767L);
        lJ.n = hi.a("G", var0[12], (Object)var0[10], (long)552744722789337767L);
        lJ.p = lJ.x("7G8WKUEW5nRjDGA6", S(java.lang.String java.lang.String ), (String)var0[12], (String)var0[7]);
        lJ.u = hi.a("G", var0[12], (Object)var0[14], (long)552744722789337767L);
        lJ.B = hi.a("G", var0[12], (Object)var0[1], (long)552744722789337767L);
        lJ.R = hi.a("G", var0[12], (Object)var0[13], (long)552744722789337767L);
        lJ.C = hi.a("G", var0[12], (Object)var0[8], (long)552744722789337767L);
        lJ.J = hi.a("G", var0[12], (Object)var0[6], (long)552744722789337767L);
        lJ.j = hi.a("G", var0[12], (Object)var0[0], (long)552744722789337767L);
        lJ.L = hi.a("G", var0[12], (Object)var0[11], (long)552744722789337767L);
        lJ.W = lJ.x("7G8WKUEW5nRjDGA6", S(java.lang.String java.lang.String ), (String)var0[12], (String)var0[3]);
    }
}
