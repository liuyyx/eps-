/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.vz;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.Objects;

class _L
extends SimpleFileVisitor<Path> {
    final Path J;
    final boolean T;
    final Path Z;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public static /* bridge */ /* synthetic */ CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    _L(vz vz2, Path path, Path path2, boolean bl) {
        this.J = path;
        this.Z = path2;
        this.T = bl;
        Objects.requireNonNull(vz2);
    }

    public FileVisitResult f(Object[] objectArray) throws IOException {
        Path path = (Path)objectArray[0];
        BasicFileAttributes basicFileAttributes = (BasicFileAttributes)objectArray[1];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)601310414845751565L), (Object)path, (long)608889929230925223L);
        hi.a("G", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)782141587063596776L), (Object)callSite, (long)952472340457046995L), (Object)new FileAttribute[0], (long)1206614350194113747L);
        return hi.a("j", (long)398111437174590526L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public FileVisitResult y(Object[] var1_1) throws IOException {
        block11: {
            var3_2 = (Path)var1_1[0];
            var2_3 = (BasicFileAttributes)var1_1[1];
            var4_4 = Dl.S();
            var6_5 /* !! */  = hi.a("G", (int)(_L.a(18157, 5847975958966508411L) * _L.a(14767, 1933333973706957886L)), (int)_L.a(26036, 1446067524367333431L), (long)834203424483934088L) / _L.a(6177, 7341498683128890784L) + _L.a(13734, 2520648957330581546L);
            if (var4_4) break block11;
lbl7:
            // 2 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)624655226720191544L);
                if (!var4_4) ** GOTO lbl42
                if (v0 /* !! */  == false) ** GOTO lbl41
                ** GOTO lbl43
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                v1 /* !! */  = hi.a("\u00a5", _L.a, (Object)hi.a("\u00a5", (Object)var3_2, (long)1018608905646810350L).toString(), (long)734234975012314075L);
                if (!var4_4) ** GOTO lbl46
                if (v1 /* !! */  == false) ** GOTO lbl45
                ** GOTO lbl47
                break;
            }
lbl17:
            // 1 sources

            return hi.a("j", (long)398111437174590526L);
lbl19:
            // 1 sources

            while (true) {
                var5_6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)601310414845751565L), (Object)var3_2, (long)608889929230925223L);
                hi.a("G", (Object)var3_2, (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)782141587063596776L), (Object)var5_6, (long)952472340457046995L), (Object)new CopyOption[]{hi.a("j", (long)431733479577082419L)}, (long)994562017563638208L);
                return hi.a("j", (long)398111437174590526L);
            }
        }
        while (true) {
            switch (var6_5 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1011678560: {
                    ** continue;
                }
                case -1011678556: {
                    ** continue;
                }
                case -1011678558: {
                    ** continue;
                }
                case -1011678559: 
            }
            hi.a("G", (float)-1.0f, (float)0.0f, (float)1.0f, (float)1.0f, (float)2.0f, (long)412744401362924088L);
            var6_5 /* !! */  = (reference)(((_L.f("xqeNLAuq27RWU75b", max(int int ), (int)_L.a(7315, 8419163838572085529L), (int)_L.a(8164, 435794100885537391L)) ^ _L.a(9371, 4128932846553495817L)) - _L.a(6098, 839909602398128726L)) / 3 + _L.a(10877, 2257883362514794491L));
            if (var4_4) continue;
lbl41:
            // 2 sources

            v0 /* !! */  = var6_5 /* !! */  = (reference)(_L.a(16079, 3265931765109351258L) - _L.a(30876, 8920440904326423827L) ^ _L.a(1608, 5455568498897378253L));
lbl42:
            // 2 sources

            if (var4_4) continue;
lbl43:
            // 2 sources

            var6_5 /* !! */  = hi.a("G", (int)(_L.a(28167, 6968190456594543504L) + _L.a(1769, 9223365298712402813L)), (int)_L.a(28394, 7037538096919458659L), (long)834203424483934088L) - _L.a(25742, 2413540172980304142L);
            if (var4_4) continue;
lbl45:
            // 2 sources

            v1 /* !! */  = var6_5 /* !! */  = (reference)(_L.a(10514, 1655607053355545754L) - _L.a(18638, 116440738474890590L) ^ _L.a(16205, 6067377841855324867L));
lbl46:
            // 2 sources

            if (var4_4) continue;
lbl47:
            // 2 sources

            var6_5 /* !! */  = (reference)(_L.a(2276, 1168949915244844387L) / _L.a(29861, 1343612086553880872L) - _L.a(10113, 2298756059074296323L));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "8ADU&h,2@L\\aer4@".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 11;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 80;
                                break;
                            }
                            case 1: {
                                v9 = 37;
                                break;
                            }
                            case 2: {
                                v9 = 33;
                                break;
                            }
                            case 3: {
                                v9 = 56;
                                break;
                            }
                            case 4: {
                                v9 = 68;
                                break;
                            }
                            case 5: {
                                v9 = 4;
                                break;
                            }
                            default: {
                                v9 = 10;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                _L.a = new String(v10).intern();
                var0_1 = 516026048327221463L;
                var6_2 = new long[23];
                var3_3 = 0;
                var4_4 = "\u009bs\t\u009c\u00d1\u0091\u00eeh\u00af\u00acj\u00dcy\u0004&f\u0011\u0089N2 \u00d9\u00835R\u00f1ls\u0010\u001e\u00f5M\u00eaLJJu\u0083\u00df\\07\u00c7\u00db?\u0081\u00c5\u007f\u0091\u00d3\u008c[\u001c\u0098\u0095\u001dY\u0002!\u00e0Q\u001aS\">\u0092\u009d\u00f5c\u00a2u\u00af\u0018:\u0093\u00d2\u0017\u0093\u00a9\u00f8\u0005\u00d1~vTN\u001fhQb\u00fb+`\u00b2\u0094\u00e7\u00bf\u000f\u00fb9t\u00b6\u00c5L\nG\u00dd\u008c\u00a9\\\r\u00b9\u00ac\u00ce+!\u00a4Cp\u0098\u00ac\u0092\u00ba\u00bf\u00a5\u00e9\u00f4\u00c1,\u00b9\u00e6iu\u0090\u009f\u000b\u00aa?@\u00bc\u00aaTR\u008ci\u00c0_\u00a6\u000f|\u00b4\u00b4\u00ba\u00a3\u00ab\u008ct\u00aa\u0097\u00c3`\u0019\u00f2\u00fb\u0018\u00a1$\u00aa";
                var5_5 = "\u009bs\t\u009c\u00d1\u0091\u00eeh\u00af\u00acj\u00dcy\u0004&f\u0011\u0089N2 \u00d9\u00835R\u00f1ls\u0010\u001e\u00f5M\u00eaLJJu\u0083\u00df\\07\u00c7\u00db?\u0081\u00c5\u007f\u0091\u00d3\u008c[\u001c\u0098\u0095\u001dY\u0002!\u00e0Q\u001aS\">\u0092\u009d\u00f5c\u00a2u\u00af\u0018:\u0093\u00d2\u0017\u0093\u00a9\u00f8\u0005\u00d1~vTN\u001fhQb\u00fb+`\u00b2\u0094\u00e7\u00bf\u000f\u00fb9t\u00b6\u00c5L\nG\u00dd\u008c\u00a9\\\r\u00b9\u00ac\u00ce+!\u00a4Cp\u0098\u00ac\u0092\u00ba\u00bf\u00a5\u00e9\u00f4\u00c1,\u00b9\u00e6iu\u0090\u009f\u000b\u00aa?@\u00bc\u00aaTR\u008ci\u00c0_\u00a6\u000f|\u00b4\u00b4\u00ba\u00a3\u00ab\u008ct\u00aa\u0097\u00c3`\u0019\u00f2\u00fb\u0018\u00a1$\u00aa".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00b8\u00b1\u0080Xd\u000b\u00aa\u00d2\u0005}\u00e6\u00f7\u00c4\u000f\u00d8\u0016";
                    var5_5 = "\u00b8\u00b1\u0080Xd\u000b\u00aa\u00d2\u0005}\u00e6\u00f7\u00c4\u000f\u00d8\u0016".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        _L.b = var6_2;
        _L.c = new Integer[23];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5D84;
        if (c[n2] == null) {
            _L.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
