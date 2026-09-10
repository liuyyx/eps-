/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.IndexType
 *  com.mojang.blaze3d.ProjectionType
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderTarget
 *  com.mojang.blaze3d.systems.RenderSystem$AutoStorageIndexBuffer
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.input.MouseButtonEvent
 *  net.minecraft.client.input.MouseButtonInfo
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 *  net.minecraft.client.renderer.Projection
 *  net.minecraft.client.renderer.ProjectionMatrixBuffer
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.d5;
import com.github.epsilon.dd;
import com.github.epsilon.hi;
import com.github.epsilon.iW;
import com.github.epsilon.yJ;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.ProjectionType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.input.MouseButtonInfo;
import net.minecraft.client.renderer.DynamicUniformStorage;
import net.minecraft.client.renderer.Projection;
import net.minecraft.client.renderer.ProjectionMatrixBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dB {
    public static final Projection A;
    private static long n;
    private static dd x;
    private static final ProjectionMatrixBuffer b;
    private static String[] u;
    private static final long[] a;
    private static final Integer[] c;

    public static d5 A(int n) {
        return hi.a("G", (int)n, (boolean)true, (long)1190895299724682476L);
    }

    public static float K() {
        CallSite callSite = hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)824644249180421663L), (long)1260730226022079596L);
        return (float)((double)hi.a("\u00e9", (Object)callSite, (long)1031103645754504908L) / dB.q("eT702qIQAChSBeaO", w()));
    }

    public static IndexType N() {
        CallSite callSite = hi.a("G", (Object)hi.a("j", (long)1302937374850483722L), (long)373198204852348021L);
        return dB.q("eT702qIQAChSBeaO", type(), (RenderSystem.AutoStorageIndexBuffer)callSite);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static GpuTextureView P() {
        reference var0 = hi.a("G", (int)(dB.a(28722, 1064225668183408618L) * dB.a(32639, 78433299653406902L) * dB.a(17691, 918222817188285163L)), (int)dB.a(16571, 1694788974459883382L), (long)834203424483934088L) + dB.a(5573, 2384864535369407003L);
        block5: while (true) {
            Object object;
            switch (object) {
                default: {
                    if (hi.a("j", (long)1090587039551063020L) == null) break;
                    object = (hi.a("G", (int)dB.a(14283, 3034604008695920656L), (int)dB.a(14305, 2768725763336828988L), (long)834203424483934088L) / dB.a(5696, 1284663800621029772L) ^ dB.a(15269, 4927028061947786323L)) + dB.a(6169, 6399282430712371179L);
                    continue block5;
                }
                case -2146500038: {
                    return hi.a("\u00a5", (Object)hi.a("j", (long)1090587039551063020L), (Object)new Object[0], (long)1173523914187233092L);
                }
                case -2146500037: {
                    return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)1229368878430606156L), (long)717806976401584216L);
                }
                case -2146500036: {
                    throw null;
                }
            }
            object = hi.a("G", (int)dB.a(16474, 8195381749734182804L), (int)dB.a(12975, 9076535811674930515L), (long)834203424483934088L) - dB.a(26286, 9012804231860300123L) + dB.a(7418, 6003338437803102981L);
        }
    }

    public static yJ x(float f, float f2, float f3, float f4) {
        return dB.q("eT702qIQAChSBeaO", q(float float float float ), (float)f, (float)f2, (float)f3, (float)f4);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    if (dB.z() != null) break block20;
                    dB.E(new String[5]);
                    break block20;
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "_`\u0011Y\u001e\u001f\u0003F|".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 96;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl57
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var9_1;
                    while (true) {
                        switch (var9_1 % 7) {
                            case 0: {
                                v9 = 83;
                                break;
                            }
                            case 1: {
                                v9 = 117;
                                break;
                            }
                            case 2: {
                                v9 = 28;
                                break;
                            }
                            case 3: {
                                v9 = 80;
                                break;
                            }
                            case 4: {
                                v9 = 16;
                                break;
                            }
                            case 5: {
                                v9 = 82;
                                break;
                            }
                            default: {
                                v9 = 4;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var9_1;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl57:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var9_1);
                ** while (true)
                var8 = new String(v10).intern();
                var0_2 = 7673148388190459881L;
                var6_3 = new long[57];
                var3_4 = 0;
                var4_5 = "\u009f\u00adr\u0088\u00c8+\u0085,\u00d8\u000f\u008f\f\u00dc\u00db\u0006\u000f?':\u00e0:\t(\u00b0\u00ac\u00b2~V#\u008e\u00d9T\u00d9`\u00bc\u00c9\u00d9k\u00cf\u0090$\u00e6\u0010V\u0004\u00ed\u00fa\u00ab\\*\u0014-\no\u0081X\u00bb\u0088\u00f8\u001e\u0094\u00a7q\u00b9\u000ft\u0092\u00d65\u00a2\u00b3\u009d\u001ce\u00aaH\u00af4\u000f\u00e4\u00dd*A\u00a5\u00b3\u00ac}\u00f9\u00f5\u00ac\u00c4\u001d\u00e8\u00faRk\u00d2\u00a9>\u00fa5\u0080F\u00c7\u00f6\u009f\u0007\u00f9R*!\u00e8\r\u00afT\u00d2\u0093Q[\u00b2[/\u00a5\u0086\u00f6\u008d)\u00e1U~=G(\u00eb\u009a\t\u009a3p\u00a7\u0016\u007fCq\u00a4\u008ehm\u00e4\u0094\u008a\u00e38\u00c0\u00b9\u00fd\u00b5\u0086\u00c5\"\u00ea\u00fb\u00c6\u00c1\u00e6\u00e7m\u0010\u008e\u00bd\u0014@\u00fc3s\u00b9:]~$\u0013\u00a4\u0087bL\u00e2\u00b0\u00aa\u0011\u00f3,7\u0088\u0006:J\t\u00d2n\u009e#`\u009e\u00a3\u00d6\u00b1\u00cd\u008a_b2gS\u0091\u009eN\u00ab\u00f2G\b\u0096\u0018[\t\u00e8\u00f3 \u0090;=\u00e6+VH\u00d3m\n>U\u00cd\u00ee\n\u00ee\u0099;\u00e0\b\u00b3X*\u0093\u000f[Ei\u00a5\u0014\u00d3\u00da\u00f1\u0012\u0015\u00fc\u00fe\\N\u00f5I\u00dc\u008dC\u00b7P\u00bb\u00f4\u001d\u0081%\u00cejs\u00c4t\u00ed\u00ce\t\u00e0\u00cd\u00cb\u00f1\u0003a\u000b\u0094\u00cbu:\u00bc\u009f\u00e7\u00a3_W]\u0019F]\u0000\u0014\u00eb\u00c2\u00e0`w\u00cf\u00efh\u0014y\u001a\u00c1O\u00c4T|\u00a5\u00f0\u00d5\u00cb\u00ba\u00a3\u008fV\u00d6HY\u00eb\u00e0\u00f6`iF2\u0005\u00d98\u00ce\u001f@\u009af(j\u00b2\u0016\u0093|4\u0096\u001d\u00caXY\u00a0U\u00f3>,\u0099\u008b?\u00b9\u00075x\u00d0cG\u000f6({\u0007u\u0015:\u001bt\u00ba\u0011\u00c4\u00198\u00ae\u009e\u008bu0x\u00be\u00aa@D=8\u00df\u00c6\u00f9\u00a8\u0001\u0013\u00deP\u00c3\u0014\u0085\u00f5\r\u0084\u0002\u00db%u\u00e3\u00efY\u0095\u009c|=-\u00f48\u0004\u00b3#\u00c1>\u00a4\u001c";
                var5_6 = "\u009f\u00adr\u0088\u00c8+\u0085,\u00d8\u000f\u008f\f\u00dc\u00db\u0006\u000f?':\u00e0:\t(\u00b0\u00ac\u00b2~V#\u008e\u00d9T\u00d9`\u00bc\u00c9\u00d9k\u00cf\u0090$\u00e6\u0010V\u0004\u00ed\u00fa\u00ab\\*\u0014-\no\u0081X\u00bb\u0088\u00f8\u001e\u0094\u00a7q\u00b9\u000ft\u0092\u00d65\u00a2\u00b3\u009d\u001ce\u00aaH\u00af4\u000f\u00e4\u00dd*A\u00a5\u00b3\u00ac}\u00f9\u00f5\u00ac\u00c4\u001d\u00e8\u00faRk\u00d2\u00a9>\u00fa5\u0080F\u00c7\u00f6\u009f\u0007\u00f9R*!\u00e8\r\u00afT\u00d2\u0093Q[\u00b2[/\u00a5\u0086\u00f6\u008d)\u00e1U~=G(\u00eb\u009a\t\u009a3p\u00a7\u0016\u007fCq\u00a4\u008ehm\u00e4\u0094\u008a\u00e38\u00c0\u00b9\u00fd\u00b5\u0086\u00c5\"\u00ea\u00fb\u00c6\u00c1\u00e6\u00e7m\u0010\u008e\u00bd\u0014@\u00fc3s\u00b9:]~$\u0013\u00a4\u0087bL\u00e2\u00b0\u00aa\u0011\u00f3,7\u0088\u0006:J\t\u00d2n\u009e#`\u009e\u00a3\u00d6\u00b1\u00cd\u008a_b2gS\u0091\u009eN\u00ab\u00f2G\b\u0096\u0018[\t\u00e8\u00f3 \u0090;=\u00e6+VH\u00d3m\n>U\u00cd\u00ee\n\u00ee\u0099;\u00e0\b\u00b3X*\u0093\u000f[Ei\u00a5\u0014\u00d3\u00da\u00f1\u0012\u0015\u00fc\u00fe\\N\u00f5I\u00dc\u008dC\u00b7P\u00bb\u00f4\u001d\u0081%\u00cejs\u00c4t\u00ed\u00ce\t\u00e0\u00cd\u00cb\u00f1\u0003a\u000b\u0094\u00cbu:\u00bc\u009f\u00e7\u00a3_W]\u0019F]\u0000\u0014\u00eb\u00c2\u00e0`w\u00cf\u00efh\u0014y\u001a\u00c1O\u00c4T|\u00a5\u00f0\u00d5\u00cb\u00ba\u00a3\u008fV\u00d6HY\u00eb\u00e0\u00f6`iF2\u0005\u00d98\u00ce\u001f@\u009af(j\u00b2\u0016\u0093|4\u0096\u001d\u00caXY\u00a0U\u00f3>,\u0099\u008b?\u00b9\u00075x\u00d0cG\u000f6({\u0007u\u0015:\u001bt\u00ba\u0011\u00c4\u00198\u00ae\u009e\u008bu0x\u00be\u00aa@D=8\u00df\u00c6\u00f9\u00a8\u0001\u0013\u00deP\u00c3\u0014\u0085\u00f5\r\u0084\u0002\u00db%u\u00e3\u00efY\u0095\u009c|=-\u00f48\u0004\u00b3#\u00c1>\u00a4\u001c".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v11 = var6_3;
                    v12 = var3_4++;
                    v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "w\u001b\u0014\u00b2\u00d2`\u000b\u00f3\u00ab'\u0014;\u00da\u00b8\u008f\u00ac";
                    var5_6 = "w\u001b\u0014\u00b2\u00d2`\u000b\u00f3\u00ab'\u0014;\u00da\u00b8\u008f\u00ac".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v11 = var6_3;
                        v12 = var3_4++;
                        v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_2;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl102:
                // 1 sources

                ** continue;
            }
        }
        dB.a = var6_3;
        dB.c = new Integer[57];
        dB.A = new Projection();
        dB.b = new ProjectionMatrixBuffer(var8);
        hi.a("\u00d2", null, (long)1090587039551063020L);
    }

    public static int T(int n) {
        return (int)hi.a("G", (double)hi.a("G", (double)n, (long)1273198203909826830L), (long)656829459129041302L);
    }

    public static yJ m(float f, float f2, float f3, float f4, double d) {
        return hi.a("G", (float)f, (float)f2, (float)f3, (float)f4, (float)((float)d), (long)1187820213443169771L);
    }

    public static double z(double d) {
        return d * (double)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)501728103734382890L), (long)735459544375077882L) / hi.a("G", (long)1186314902226853278L);
    }

    public static /* bridge */ /* synthetic */ CallSite q(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static float M() {
        CallSite callSite = hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)824644249180421663L), (long)1260730226022079596L);
        return (float)((double)hi.a("\u00e9", (Object)callSite, (long)594431848411198533L) / hi.a("G", (long)1186314902226853278L));
    }

    public static void b() {
        hi.a("G", (Object)new Object[0], (long)946447537050303330L);
    }

    public static GpuBuffer P(int n) {
        CallSite callSite = hi.a("G", (Object)hi.a("j", (long)1302937374850483722L), (long)373198204852348021L);
        return hi.a("\u00a5", (Object)callSite, (int)n, (long)534831045882997393L);
    }

    public static yJ Z(float f, float f2, float f3, float f4, int n) {
        return hi.a("G", (float)f, (float)f2, (float)f3, (float)f4, (float)n, (long)1187820213443169771L);
    }

    public static MouseButtonEvent z(MouseButtonEvent mouseButtonEvent) {
        return new MouseButtonEvent((double)hi.a("G", (double)hi.a("\u00a5", (Object)mouseButtonEvent, (long)1321164245525494063L), (long)1273198203909826830L), (double)hi.a("G", (double)hi.a("\u00a5", (Object)mouseButtonEvent, (long)1045026150751632794L), (long)1327728264718092753L), (MouseButtonInfo)hi.a("\u00a5", (Object)mouseButtonEvent, (long)586454630754982755L));
    }

    public static yJ Z(float f, float f2, float f3, float f4, float f5) {
        return hi.a("G", (float)f, (float)f2, (float)f3, (float)f4, (float)f5, (long)412744401362924088L);
    }

    public static <T extends DynamicUniformStorage.DynamicUniform> GpuBufferSlice p(String string, String string2, int n, int n2, T t) {
        return dB.q("eT702qIQAChSBeaO", b(java.lang.String java.lang.String int int T ), (String)string, (String)string2, (int)n, (int)n2, t);
    }

    public static int l(int n) {
        return (int)hi.a("G", (double)hi.a("G", (double)n, (long)1327728264718092753L), (long)656829459129041302L);
    }

    public static int z() {
        return (int)hi.a("G", (double)((double)hi.a("G", (long)1101389884075884739L)), (long)765596804033182836L);
    }

    public static double x(double d) {
        return d * hi.a("G", (long)1186314902226853278L) / (double)hi.a("\u00a5", (Object)dB.q("eT702qIQAChSBeaO", getWindow(), (Minecraft)hi.a("j", (long)1080602109828736465L)), (long)735459544375077882L);
    }

    public static void Z() {
        hi.a("\u00d2", (long)(hi.a("j", (long)1321096917605314172L) + 1L), (long)1321096917605314172L);
    }

    public static void z(dd dd2) {
        hi.a("\u00d2", (dd)dd2, (long)1090587039551063020L);
    }

    public static double M(double d) {
        return d * (double)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)501728103734382890L), (long)735459544375077882L) / hi.a("G", (long)1186314902226853278L);
    }

    public static GpuBufferSlice q(Object[] objectArray) {
        Matrix4fc matrix4fc = (Matrix4fc)objectArray[0];
        Vector4fc vector4fc = (Vector4fc)objectArray[1];
        Vector3fc vector3fc = (Vector3fc)objectArray[2];
        Matrix4fc matrix4fc2 = (Matrix4fc)objectArray[3];
        return hi.a("\u00a5", (Object)hi.a("G", (long)839054890611494409L), (Object)new Matrix4f(matrix4fc), (Object)new Vector4f(vector4fc), (Object)new Vector3f(vector3fc), (Object)new Matrix4f(matrix4fc2), (long)654985649416412567L);
    }

    public static dd O() {
        return hi.a("j", (long)1090587039551063020L);
    }

    public static double w() {
        return (double)hi.a("\u00a5", (Object)hi.a("j", (long)805278995556620379L), (Object)new Object[0], (long)620558558523018323L);
    }

    public static int T() {
        return (int)hi.a("G", (double)((double)hi.a("G", (long)1052312102167579273L)), (long)765596804033182836L);
    }

    public static double h(double d) {
        return d * hi.a("G", (long)1186314902226853278L) / (double)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)501728103734382890L), (long)735459544375077882L);
    }

    public static GpuBufferSlice W() {
        Object[] objectArray = new Object[4];
        objectArray[3] = hi.a("\u00a5", (Object)hi.a("j", (long)693814981360120245L), (long)1290622724364747069L);
        objectArray[2] = new Vector3f(0.0f, 0.0f, 0.0f);
        objectArray[1] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        objectArray[0] = hi.a("G", (long)584359175261052923L);
        return hi.a("G", (Object)objectArray, (long)743917414058014351L);
    }

    public static void S() {
        hi.a("\u00a5", (Object)hi.a("j", (long)1137975554409695095L), (float)-1000.0f, (float)1000.0f, (float)hi.a("G", (long)1052312102167579273L), (float)hi.a("G", (long)1101389884075884739L), (boolean)true, (long)755714812168047127L);
        dB.q("eT702qIQAChSBeaO", setProjectionMatrix(com.mojang.blaze3d.buffers.GpuBufferSlice com.mojang.blaze3d.ProjectionType ), (GpuBufferSlice)hi.a("\u00a5", (Object)hi.a("j", (long)378007823041379020L), (Object)hi.a("j", (long)1137975554409695095L), (long)1188895601824277321L), (ProjectionType)hi.a("j", (long)661916197607913531L));
    }

    public static void Q() {
        dB.q("eT702qIQAChSBeaO", close(), (ProjectionMatrixBuffer)hi.a("j", (long)378007823041379020L));
        dB.q("eT702qIQAChSBeaO", I(), (iW)((Object)hi.a("j", (long)650457993885554843L)));
        hi.a("G", (Object)new Object[0], (long)1141559976258670964L);
        hi.a("\u00a5", (Object)hi.a("j", (long)695546891165599310L), (Object)new Object[0], (long)527608772694261724L);
        hi.a("\u00a5", (Object)hi.a("j", (long)1163648134382305495L), (Object)new Object[0], (long)555604863857203447L);
        hi.a("G", (long)1208540510591910900L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static d5 a(int n, boolean bl) {
        CallSite callSite;
        CallSite callSite2;
        Object object = (dB.a(11736, 127030911753708088L) * dB.a(15344, 4050656834444489791L) + dB.a(3367, 5216988059625374412L) - dB.a(931, 412706557092842575L) ^ dB.a(15117, 7157028766831998206L)) - dB.a(17887, 8604943929434966537L);
        block9: while (true) {
            switch (object) {
                default: {
                    if (!bl) break;
                    object = dB.q("eT702qIQAChSBeaO", max(int int ), (int)hi.a("G", (int)(dB.a(22465, 1181372437546571832L) ^ dB.a(24232, 7281060187454509428L)), (int)dB.a(9200, 1272518836282485779L), (long)834203424483934088L), (int)dB.a(12045, 2151547342222647532L)) - dB.a(30172, 6820753949491509766L);
                    continue block9;
                }
                case -456456488: {
                    hi.a("G", (long)672565527819449937L);
                    object = hi.a("G", (int)hi.a("G", (int)(dB.a(20675, 6920904036077182758L) * dB.a(28610, 8644421096877596681L)), (int)dB.a(20524, 8175897796260077531L), (long)834203424483934088L), (int)dB.a(16000, 311861923854578024L), (long)834203424483934088L) - dB.a(32718, 2698915129126989868L);
                    continue block9;
                }
                case -456456489: {
                    callSite2 = dB.q("eT702qIQAChSBeaO", T());
                    callSite = hi.a("G", (long)399723549164886403L);
                    object = callSite2 == null ? (Object)(hi.a("G", (int)(dB.a(21034, 348928091801624020L) * dB.a(12076, 8552599257841787096L)), (int)dB.a(27471, 7734887801280373925L), (long)834203424483934088L) - dB.a(30120, 1878139992273664597L)) : (dB.a(12437, 3696744197147033468L) + dB.a(12568, 8182167618754641653L) - dB.a(8033, 2528080878998999206L)) * dB.a(17099, 7499853058638286081L) / dB.a(27170, 2043864948424189414L) ^ dB.a(196, 3502173550819266366L);
                }
                case -456456490: {
                    throw null;
                }
            }
            object = dB.q("eT702qIQAChSBeaO", max(int int ), (int)dB.q("eT702qIQAChSBeaO", max(int int ), (int)(dB.a(31276, 8941308589481965043L) * dB.a(19222, 5315742326476506349L)), (int)dB.a(6859, 404848773914580275L)), (int)dB.a(14800, 559675490234201663L)) - dB.a(18936, 6669090840179050046L);
        }
        switch (object) {
            default: {
                return null;
            }
            case 147551536: {
                int n2 = n / 4 * dB.a(24411, 2647196226219348122L);
                CallSite callSite3 = dB.q("eT702qIQAChSBeaO", P(int ), (int)n2);
                Object[] objectArray = new Object[4];
                objectArray[3] = hi.a("\u00a5", (Object)hi.a("j", (long)693814981360120245L), (long)1290622724364747069L);
                objectArray[2] = new Vector3f(0.0f, 0.0f, 0.0f);
                objectArray[1] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
                objectArray[0] = hi.a("G", (long)584359175261052923L);
                CallSite callSite4 = hi.a("G", (Object)objectArray, (long)743917414058014351L);
                return new d5((GpuTextureView)callSite2, (GpuTextureView)callSite, (IndexType)hi.a("G", (long)1127763923712469243L), (GpuBuffer)callSite3, n2, (GpuBufferSlice)callSite4);
            }
            case 147551535: 
        }
        dB.q("eT702qIQAChSBeaO", C());
        hi.a("G", (long)979899430926065004L);
        return hi.a("G", (int)0, (long)1168948165950154490L);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static GpuTextureView T() {
        boolean bl = Dl.S();
        int n = (dB.a(15112, 4989351440214521041L) + dB.a(2954, 8508081424551887972L)) / 2 / 5 + dB.a(2106, 2665456443741816831L);
        boolean bl2 = true;
        block5: while (true) {
            block8: {
                block9: {
                    if (bl2 && !(bl2 = false) && bl) break block8;
                    if (hi.a("j", (long)1090587039551063020L) != null) break block9;
                    n = (dB.a(13645, 1364280147326663339L) - dB.a(11007, 2728433501560399118L) ^ dB.a(11240, 3630904792198603819L)) * dB.a(5829, 8102765016846981410L) ^ dB.a(25127, 8692452405102161391L);
                    if (bl) break block8;
                }
                n = dB.a(16963, 1008470694547754407L) * dB.a(15677, 9076536051921941247L) + dB.a(23013, 6419266271430088229L);
            }
            switch (n) {
                default: {
                    continue block5;
                }
                case 873669369: {
                    return hi.a("\u00a5", (Object)hi.a("j", (long)1090587039551063020L), (Object)new Object[0], (long)809958202025513194L);
                }
                case 873669371: {
                    return dB.q("eT702qIQAChSBeaO", getColorTextureView(), (RenderTarget)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)1229368878430606156L));
                }
                case 873669370: 
            }
            break;
        }
        return null;
    }

    public static long E() {
        return (long)hi.a("j", (long)1321096917605314172L);
    }

    public static void E(String[] stringArray) {
        u = stringArray;
    }

    public static String[] z() {
        return u;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4FEE;
        if (c[n2] == null) {
            dB.c[n2] = (int)(a[n2] ^ l);
        }
        return c[n2];
    }
}
