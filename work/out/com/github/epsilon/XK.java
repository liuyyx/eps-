/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._A;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XK {
    private final List<_A> R = new ArrayList<_A>();
    public static final XK Y;
    private static final long[] a;
    private static final Integer[] b;

    public synchronized void q(_A _A2) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)509551995580654771L), (Object)_A2, (long)948569440323252867L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 280296429178717949L;
                var6_1 = new long[21];
                var3_2 = 0;
                var4_3 = "\u00ade\u0016\u00a5e\u000e;\u00f6\by]\u00d4D\u000f\u0089\u000f6l=n\u00a8\u00c6+&i\u00ee\u00c4\u0001_'\u0016-\u00b4(C\u00a7\u0090\u00a7\u00fa\u00e9[@Mf\u00f4\u008bbeS\u0094O\u00c7\b\u00cd\u0082\u00c4\u00fa\u00c1\u00fa\u0083\u0093E\u00ab(\u00dc0\u007f\u001c\u0010Ob\u00f1\u00fa\u00fe\\\u00a0&\u00e6\u0000\u009c\u00ff&o\u00ee\u00c2\u00bdZ\u00df\u00fa\"\u000bRX\u000b\u001f\u009a\u00c2)\u0093\u0016;W\u0090zu\\_\u00b5:\u00cck$\u00ae\u00f3U\u00d2a\",-\u00bfjm\u00d0\u0092x\u001d`\u008a7\u0018\u00e5\u0095\u00ff\u0000\u00a6Z\u00a5\u00e6\u0080\u00d9;\u00b4\u00ba\u001f\u0084f\u00a3\u00b0\u001dv\u0096";
                var5_4 = "\u00ade\u0016\u00a5e\u000e;\u00f6\by]\u00d4D\u000f\u0089\u000f6l=n\u00a8\u00c6+&i\u00ee\u00c4\u0001_'\u0016-\u00b4(C\u00a7\u0090\u00a7\u00fa\u00e9[@Mf\u00f4\u008bbeS\u0094O\u00c7\b\u00cd\u0082\u00c4\u00fa\u00c1\u00fa\u0083\u0093E\u00ab(\u00dc0\u007f\u001c\u0010Ob\u00f1\u00fa\u00fe\\\u00a0&\u00e6\u0000\u009c\u00ff&o\u00ee\u00c2\u00bdZ\u00df\u00fa\"\u000bRX\u000b\u001f\u009a\u00c2)\u0093\u0016;W\u0090zu\\_\u00b5:\u00cck$\u00ae\u00f3U\u00d2a\",-\u00bfjm\u00d0\u0092x\u001d`\u008a7\u0018\u00e5\u0095\u00ff\u0000\u00a6Z\u00a5\u00e6\u0080\u00d9;\u00b4\u00ba\u001f\u0084f\u00a3\u00b0\u001dv\u0096".length();
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
                    var4_3 = "\u00e7\u00dc\u00d9\u0010\u00ae\u0083\u00adH\u00ac]-\u0001\u00c2x\u0000\u00f6";
                    var5_4 = "\u00e7\u00dc\u00d9\u0010\u00ae\u0083\u00adH\u00ac]-\u0001\u00c2x\u0000\u00f6".length();
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
        XK.a = var6_1;
        XK.b = new Integer[21];
        XK.Y = new XK();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public synchronized void S(Object[] var1_1) {
        var4_2 /* !! */  = (hi.a("G", (int)(XK.a(865, 8301647193696664669L) / XK.a(6971, 6262583898753819654L)), (int)XK.a(31509, 8383236825678087214L), (long)834203424483934088L) + XK.a(11781, 7840780837211099426L)) * XK.a(11419, 7788957533701067710L) + XK.a(8950, 1224635044697791951L);
        switch (var4_2 /* !! */ ) {
            default: {
                var2_3 = hi.a("\u00a5", (Object)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)509551995580654771L), (long)497368790579535219L), (long)1240653736693366367L);
                var4_2 /* !! */  = (reference)(XK.a(15407, 2459522594901869339L) / XK.a(31010, 1444133385977595395L) ^ XK.a(1685, 7249186731675482547L));
                break;
            }
            case 1781280204: {
                throw null;
            }
        }
        block8: while (true) {
            switch (var4_2 /* !! */ ) {
                default: {
                    if (hi.a("\u00a5", (Object)var2_3, (long)984088978567310565L) != false) {
                        var4_2 /* !! */  = (reference)((XK.a(11087, 7716263919681852523L) ^ XK.a(9478, 2230650717855439420L) ^ XK.a(19441, 2362934839796511950L)) - XK.a(12580, 8574755726355123731L));
                        continue block8;
                    }
                    ** GOTO lbl26
                }
                case -350721127: {
                    var3_4 = (_A)XK.M("eQ9K318yiBQJjL5y", next(), (Iterator)var2_3);
                    hi.a("\u00a5", (Object)var3_4, (long)701344156013538941L);
                    var4_2 /* !! */  = (reference)(XK.a(3799, 3227536879115956706L) / XK.a(26193, 4358025599378856303L) ^ XK.a(20771, 2281206550902713874L));
                    continue block8;
                }
                case -350721125: {
                    hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)509551995580654771L), (long)400728262949485023L);
                    return;
                }
lbl26:
                // 1 sources

                var4_2 /* !! */  = (reference)(XK.a(10241, 647712360583223089L) / XK.a(28653, 5655405541504389339L) / XK.a(31492, 3235385077463483447L) + XK.a(21689, 2816600082153188235L) ^ XK.a(4875, 2601250813818727475L));
                continue block8;
                case -350721126: 
            }
            break;
        }
    }

    private XK() {
    }

    public synchronized <T extends _A> T W(T t) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)509551995580654771L), t, (long)615358212536192384L);
        return t;
    }

    public static /* bridge */ /* synthetic */ CallSite M(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F35;
        if (b[n2] == null) {
            XK.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
