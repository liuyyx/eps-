/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.ClientPacketListener
 *  net.minecraft.network.protocol.Packet
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.Packet;

public class _5 {
    public static final Set<Packet<?>> P;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2118766799898427491L;
                var6_1 = new long[16];
                var3_2 = 0;
                var4_3 = "\u00dc\u00a4\u0099l[\u00dc@|D\b|\u00d5\u001c\u009a\u00f6\u00b4l\u00f53\u0097\u00e4\u0082!x\u008dM\u0010[\u00a4I\u0006\u0010tO<\u0087]A\r\u00129uyy3\u0006\u008b\u00be\u00b3\u00c0C\u00e7i\u00de\u00ba\u00d6\u00e1\u0081\u001b\u00f9\u0000\u008b\u0094Zh\u00bf\u00e5\u0011\\\u00d2\u00fe\u0018\u00aa\u00aa\u009e:<\u00b8\u00d5\u009b\u0017\u00e7\r\u00d2\u00f2d\u00ccZ\u0017\u00e1\u00ee\u00d8=\u00f5,$U;\r\u009e\u0003sup\u008b\u001d\u00c1\u00be\u00e3\u00c8\u00bc\u00ae";
                var5_4 = "\u00dc\u00a4\u0099l[\u00dc@|D\b|\u00d5\u001c\u009a\u00f6\u00b4l\u00f53\u0097\u00e4\u0082!x\u008dM\u0010[\u00a4I\u0006\u0010tO<\u0087]A\r\u00129uyy3\u0006\u008b\u00be\u00b3\u00c0C\u00e7i\u00de\u00ba\u00d6\u00e1\u0081\u001b\u00f9\u0000\u008b\u0094Zh\u00bf\u00e5\u0011\\\u00d2\u00fe\u0018\u00aa\u00aa\u009e:<\u00b8\u00d5\u009b\u0017\u00e7\r\u00d2\u00f2d\u00ccZ\u0017\u00e1\u00ee\u00d8=\u00f5,$U;\r\u009e\u0003sup\u008b\u001d\u00c1\u00be\u00e3\u00c8\u00bc\u00ae".length();
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
                    var4_3 = "\u00c7\u0098\u0019\u00ab\u00b6\u00b3]\u00b5\u00cc\u0081\\\u00cd]+p\u0090";
                    var5_4 = "\u00c7\u0098\u0019\u00ab\u00b6\u00b3]\u00b5\u00cc\u0081\\\u00cd]+p\u0090".length();
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
        _5.a = var6_1;
        _5.b = new Integer[16];
        _5.P = new HashSet<Packet<?>>();
    }

    public static /* bridge */ /* synthetic */ CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public static void q(Packet<?> var0) {
        block11: {
            block10: {
                block13: {
                    block12: {
                        var1_1 = Dl.t();
                        var2_2 = _5.a(4665, 701182567637603070L) ^ _5.a(2353, 3332135453494790655L) ^ _5.a(4906, 4982714392699655148L);
                        if (!var1_1) break block12;
lbl4:
                        // 3 sources

                        while (hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)496902820059807729L) != null) {
                            break block10;
                        }
                        break block13;
lbl7:
                        // 1 sources

                        while (true) {
                            hi.a("\u00a5", (Object)hi.a("j", (long)452943119127626332L), var0, (long)489810460382064611L);
                            _5.j("lDSMnqPJYyAbO8g5", send(net.minecraft.network.protocol.Packet ), (ClientPacketListener)_5.j("lDSMnqPJYyAbO8g5", getConnection(), (Minecraft)hi.a("j", (long)1080602109828736465L)), var0);
                            if (var1_1) lbl-1000:
                            // 2 sources

                            {
                                return;
                            }
                            break block11;
                            break;
                        }
                    }
lbl16:
                    // 4 sources

                    while (true) {
                        switch (var2_2) {
                            default: {
                                ** GOTO lbl4
                            }
                            case 1900215123: {
                                ** continue;
                            }
                            case 1900215121: {
                                ** continue;
                            }
                            case 1900215120: 
                        }
                        hi.a("G", (int)2, (long)902898246708732704L);
                        _5.j("lDSMnqPJYyAbO8g5", S());
                        if (!var1_1) ** GOTO lbl4
                        break;
                    }
                }
                var2_2 = ((_5.a(29638, 1078851714645635851L) - _5.a(401, 4643584355309764954L) ^ _5.a(28495, 6670924479377584010L)) / 5 ^ _5.a(931, 2919225456882238305L)) - _5.a(20289, 4478495757676679041L);
                if (!var1_1) ** GOTO lbl16
            }
            var2_2 = _5.a(31764, 592877669078678747L) * _5.a(18750, 7097044139134880244L) - _5.a(31971, 8673468203634179104L);
            if (!var1_1) ** GOTO lbl16
        }
        var2_2 = ((_5.a(1354, 4185227213041583499L) - _5.a(6227, 6822875784606177435L) ^ _5.a(9897, 43862460800362085L)) / 5 ^ _5.a(30991, 8177261460468840907L)) - _5.a(16916, 9052610171680752349L);
        ** while (true)
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x40C2;
        if (b[n2] == null) {
            _5.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
