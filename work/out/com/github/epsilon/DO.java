/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.state.level.CameraRenderState
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
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
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class DO {
    private static final Matrix4f C;
    private static final Matrix4f B;
    private static final Matrix4f r;
    private static final float a = 20.0f;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    private DO() {
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static Matrix4f i(Object[] var0) {
        block17: {
            var1_1 = var0[0];
            var2_2 = Dl.S();
            var8_3 = hi.a("G", (int)DO.a(3102, 5870351525454675037L), (int)DO.a(858, 686979724083229472L), (long)834203424483934088L) + DO.a(28303, 454602245862727407L);
            if (var2_2) break block17;
lbl6:
            // 2 sources

            while (true) {
                block19: {
                    block18: {
                        hi.a("\u00a5", (Object)hi.a("j", (long)981291768988375608L), (Object)hi.a("\u00e9", (Object)((CameraRenderState)var1_1), (long)856437852468692681L), (long)1282039496083742471L);
                        hi.a("\u00a5", (Object)hi.a("j", (long)962730105418496537L), (long)850002673771525846L);
                        v0 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)824644249180421663L), (long)656075002402330740L), (long)440897130179186046L);
                        if (!var2_2) break block18;
                        if (v0 != false) break block19;
                        v0 = var8_3 = DO.a("gYlmQnoqJsh6agFO", max(int int ), (int)(DO.a(16786, 8935448448433828306L) * DO.a(14419, 1481861116752480274L)), (int)DO.a(6320, 8262873133904717957L)) / DO.a(28110, 3628751245172088232L) + DO.a(14465, 7647449090912078000L);
                    }
                    if (var2_2) break block17;
                }
                var8_3 = hi.a("G", (int)(DO.a(17210, 2201192724393931520L) * DO.a(5439, 8343884220079826178L) / DO.a(9513, 1154395130663425296L)), (int)DO.a(1241, 5355911115371082909L), (long)834203424483934088L) + DO.a(9660, 7919337829150873072L) + DO.a(21713, 4287299620129416322L);
                if (var2_2) break block17;
                ** GOTO lbl58
                break;
            }
lbl21:
            // 2 sources

            while (true) {
                hi.a("\u00a5", (Object)hi.a("j", (long)962730105418496537L), (float)((float)DO.a("gYlmQnoqJsh6agFO", toRadians(double ), (double)((double)(var5_6 * var4_5 * 3.0f)))), (long)1137082902724348930L);
                hi.a("\u00a5", (Object)hi.a("j", (long)962730105418496537L), (float)((float)hi.a("G", (double)((double)(hi.a("G", (float)(DO.a("gYlmQnoqJsh6agFO", cos(double ), (double)((double)(var3_4 * 3.1415927f - 0.2f))) * var4_5), (long)400111314131951612L) * 5.0f)), (long)689781824688360657L)), (long)890462003045152075L);
                hi.a("\u00a5", (Object)hi.a("j", (long)981291768988375608L), (Object)hi.a("j", (long)962730105418496537L), (long)1304758311789857469L);
                if (!var2_2) {
                    return hi.a("j", (long)981291768988375608L);
                }
                ** GOTO lbl96
                break;
            }
        }
        block13: while (true) {
            block20: {
                switch (var8_3) {
                    default: {
                        ** continue;
                    }
                    case -1486794221: {
                        v1 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)((CameraRenderState)var1_1), (long)630849446219292611L), (long)1064316190186872364L);
                        if (!var2_2) ** GOTO lbl59
                        if (v1 == false) ** GOTO lbl58
                        ** GOTO lbl60
                    }
                    case -1486794220: {
                        var3_4 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)((CameraRenderState)var1_1), (long)630849446219292611L), (long)845042898454301061L);
                        var4_5 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)((CameraRenderState)var1_1), (long)630849446219292611L), (long)1181160258820368311L);
                        var5_6 = hi.a("G", (double)((double)(var3_4 * 3.1415927f)), (long)651411597689335820L);
                        var6_7 = hi.a("G", (double)((double)(var3_4 * 3.1415927f)), (long)665261795861296096L);
                        var7_8 = hi.a("j", (long)1130375494444832873L);
                        v2 = hi.a("\u00a5", (Object)var7_8, (long)1099153674733698693L);
                        if (!var2_2) ** GOTO lbl63
                        if (v2 == false) ** GOTO lbl62
                        ** GOTO lbl64
                    }
                    case -1486794224: {
                        hi.a("G", (int)DO.a(24725, 7992795235015299327L), (int)DO.a(2234, 7922594985421994130L), (float)-1.0f, (long)853719768120194366L);
                        hi.a("G", (long)894998098924207757L);
                        var8_3 = (reference)(DO.a(3995, 1400028254710988755L) + DO.a(926, 3433182924871922626L) ^ DO.a(11165, 1175380591918865379L) ^ DO.a(12003, 574112813622648475L) ^ DO.a(8412, 2371912894428860661L));
                        continue block13;
                    }
lbl58:
                    // 2 sources

                    v1 = var8_3 = hi.a("G", (int)(DO.a(28383, 5671380896397663927L) * DO.a(2083, 5506844568573605996L)), (int)DO.a(1271, 6276528580064277657L), (long)834203424483934088L) / DO.a(28110, 3628751245172088232L) + DO.a(28358, 2477591358639152769L);
lbl59:
                    // 2 sources

                    if (var2_2) continue block13;
lbl60:
                    // 2 sources

                    var8_3 = (reference)(((DO.a(31589, 3801200391972883217L) ^ DO.a(19736, 6305686577917115749L)) - DO.a(14881, 7006701390687881839L)) * DO.a(6370, 2199286933759060146L) + DO.a(2142, 4362434912598063205L) + DO.a(10738, 2015450085311011213L));
                    continue block13;
lbl62:
                    // 1 sources

                    v2 = var8_3 = (reference)((DO.a(24539, 8225254116873351086L) - DO.a(996, 1866411517331141561L) + DO.a(17580, 4271538968124994798L) ^ DO.a(13879, 2902158355807323736L)) - DO.a(15374, 9129641192780352574L));
lbl63:
                    // 2 sources

                    if (var2_2) break block20;
lbl64:
                    // 2 sources

                    var8_3 = (reference)((DO.a(4266, 7306124435194896615L) ^ DO.a(15510, 6968622950012046530L)) - DO.a(12673, 1762827092051837373L) - DO.a(32243, 6383358972773338496L));
                    if (var2_2) break block20;
                    ** GOTO lbl87
                    case -1486794223: 
                }
                return hi.a("j", (long)981291768988375608L);
            }
            do lbl-1000:
            // 4 sources

            {
                block23: {
                    block22: {
                        block21: {
                            switch (var8_3) {
                                default: {
                                    v3 = DO.a("gYlmQnoqJsh6agFO", booleanValue(), (Boolean)((Boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)var7_8, (long)1120188312081377238L), (long)789438897355831922L)));
                                    if (!var2_2) break block21;
                                    if (v3 != false) break;
                                    break block22;
                                }
                                case 1523754870: {
                                    DO.a("gYlmQnoqJsh6agFO", translate(float float float ), (Matrix4f)hi.a("j", (long)962730105418496537L), (float)(var5_6 * var4_5 * 0.5f), (float)(-hi.a("G", (float)(var6_7 * var4_5), (long)400111314131951612L)), (float)0.0f);
                                    if (var2_2) break block23;
                                    ** GOTO lbl21
                                }
                                case 1523754869: {
                                    ** continue;
                                }
                                case 1523754871: {
                                    throw null;
                                }
                            }
lbl87:
                            // 2 sources

                            v3 = var8_3 = (reference)(DO.a(25105, 672814861100782159L) - DO.a(13615, 7559188571078083917L) - DO.a(10922, 966244660036950674L));
                        }
                        if (var2_2) ** GOTO lbl-1000
                    }
                    var8_3 = (reference)((DO.a(13519, 1011455335473300662L) - DO.a(2570, 617697655573379689L) + DO.a(10092, 8983945681574680320L) ^ DO.a(15841, 2293166526152887737L)) - DO.a(16592, 8494520720166269094L));
                    if (var2_2) ** GOTO lbl-1000
                }
                var8_3 = (reference)(DO.a(59, 4238734377823072336L) - DO.a(6497, 2813551991691274555L) - DO.a(19581, 1554991174201392206L));
            } while (var2_2);
lbl96:
            // 2 sources

            var8_3 = DO.a("gYlmQnoqJsh6agFO", max(int int ), (int)(DO.a(28383, 5671380896397663927L) * DO.a(2083, 5506844568573605996L)), (int)DO.a(1271, 6276528580064277657L)) / DO.a(28110, 3628751245172088232L) + DO.a(28358, 2477591358639152769L);
        }
    }

    public static Vector3f H(Vec3 vec3) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)529286173586661242L);
        CallSite callSite2 = hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)824644249180421663L), (long)538452375068194790L), (long)1212178218618897878L);
        CallSite callSite3 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)vec3, (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1082050008038634828L), (long)1085694674330158529L);
        CallSite callSite4 = DO.a("gYlmQnoqJsh6agFO", transformPosition(org.joml.Vector3fc org.joml.Vector3f ), (Matrix4f)hi.a("\u00a5", (Object)callSite, (Object)hi.a("j", (long)1060175367224266830L), (long)924161495969582221L), (Vector3fc)callSite3, (Vector3f)new Vector3f());
        CallSite callSite5 = hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{callSite2}, (long)417677568990227864L), (Object)callSite4, (Object)new Vector3f(), (long)1186478476981962881L);
        CallSite callSite6 = hi.a("G", (long)1052312102167579273L);
        CallSite callSite7 = hi.a("G", (long)1101389884075884739L);
        return DO.a("gYlmQnoqJsh6agFO", set(float float float ), (Vector3f)callSite5, (float)((hi.a("\u00e9", (Object)callSite5, (long)719578877512501895L) + 1.0f) * 0.5f * callSite6), (float)((1.0f - hi.a("\u00e9", (Object)callSite5, (long)641683247927396683L)) * 0.5f * callSite7), (float)(-hi.a("\u00e9", (Object)callSite4, (long)1031437550468343246L)));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 7263464323880870480L;
                    var8_1 = new long[82];
                    var5_2 = 0;
                    var6_3 = "Oa\u001e\u00e9Gf\u00c2\u00a3#\u00eb(\u000fv\u00e6\u00dd\u0012\u001f\u00cb\u00f8NW\u00fe\u00b5U\u0094\u00f6\u0086\u00ef\u00ab\u00f1\u00aa\u001dz\u00aa}\n\u00f9c\u00f0\t\u00a0\u00175\u00fe\u008fi\u000bg]p\u00c9\u0099\u0002\u00b1\u00cf\u0000\u0007\u00bb\u0099\u00a8\u00b0\u00fb\u0088_\u00c8Z\u001e\u00b1\u00cd\u0089n\u008f\u00bd\u00d8\u00f7d&sR\u009c\u00b1\u0004\u00033Z![\u00b3&\u00daP\u0004\u00f1\u00a7\u0016>B\u0014\u000f\u00ce%\u00c7\u00efq\u0006\u0096\u00d9)\u0080g\u00b6\n\\\u00ec\u00e7\u00f4\u00d8\u00b9E\u0014\u00f4\u00bc\u00e5\u000b\u00de\u00b4\u00ea\u00d5Z\u0093\u0085zU\n\u00e1\u001e\u0001\u00f5\u00d27~\u0010\u009c\u0007\u00c4\u00d1\u00a46\u0086!\u00f2\u00bf\u00b0\u00a6\u00c0A\u00f7\u0084'8DO\u00d5\u00d5\u0096\u0018\u0017S\u0098\u001a\u00b9#cZ\u00d1\u0090\u001ae\u0006}/K\u0089\u001e\u00a5\u008b\u001a\u00b1t\u00f7\u00f3\u00ddR\u009a#\u00e9\u00d4\u00bc\u00d1R\u00e6\u007f\b*\u00c9\u0005af\u00e6\u00d5.\u00d1\u001d\u00cb~3\u0013.\u00bb\u00d1\u0091\u00c9\u00adS}g\u00c3\u00c6d\u00b9\u00b4#\u00ba\u00ad\u001a$o\u00ac\u0084V\u001d\u00e3U\u00bc\u00bd\u0019\u007f\u00f2\u00c5_9cZ\u00a6,\u00d3QC\u00ca\u0002\u00c9\f\u00f8<\u00a9\u0084b\u0095\u00a1\u0006\u00cc\u00ea\u008a|v\u009b\u00b1_\u00d2E\u00a3'7e\u00b1\u0011\u0087\u00de\u00c49gh@(\u009c\u008f8V\u00fe\u0010\u00cd\u00fb$\u00833\u008e\u0086\u001f\u00abaE'_\u0017\u00c2\u0093D$\u00c9;\u00c8\r\u00c2\u009f<\u00eb)\u00d9Fj\u009f\u00a3x\u00fa$\u0099C\u009eP\u00e3\u00e1KWf\u00b2r\u0011\u008f\u00b8q\u0014\u00fe8\u00fa\u00d0t\u0081\u00b4\u00ea\u00f8\u00ce\u0016\u0096\u0095\u00d8\u008c,\u0096%\u00f4\u00f04y\u00ce\u0095;\u00ba\u00a8\u0080\u00c1\u00ac\u0014\u0088\u00db]\u009e*wk\u0090(mN&\u001c\u00b3\u00c2R\u0000\u00c1\u00d8Rd\u0088\u00ef\u00af\u00ea\u00fee\u000e^\u001eq\u0084\u0086\u00f7\u00ee[\u00a7b\u00d9\u0019\u0085\u00e0\u00bd\nR}\u0087\u0012\u009bW\u0086\u00c0z\u00d6\u0001*~\u00a1\u0007\u00e7\u0094\u00b4]A\u008e\u0015k\u00d9\u00d8\u00d5C\u0004N{\u00c5N%\u00ec\u00a4!>kS\u00b8G+V\u00e5\u00f4\u00bd\u00155\u00e3\u00af\u001evO'\u00d8\u0093\u00fd\u0089\u00b5\u00a8\u00dbj\u00ec\u00a6\u008a#\u001a\f\u0087g'\u00cb{\u00a4Yu)b\u00b2bB\u00a2\u00b1\u00cc\u0019\u00ff\u00d0\u007fws\u0011v\u008cWj\u008f\u00a8<\u00e2\u00067F\u00bb)\u009c\u0000\u00c4\u0085\u0082B|`\u001d\u001b\u0013\u00c0\u00d6S\u000b\u00bfk\u00b5q\u00e9\u009f\u00c5\u00cd\u00ec\u008f.\u0012W\u0096G\u000e\u00dc\u00a8.\u000f\u00c6\u00e5\u00d5\u0016\u00dd\u00b8\u0087\u0087k\u0003n\u0013\u00d6\u00a8c(\u007f\u00b9\u008c\u00e4\u008f?\u0012*=O\u00ceJ\u008e\u00cai\u001d\u008b\u0091\u00c9\"2\u0019\u00d4\u00f9\u00ccj\u008b\u0098\u00a8?\u0093\u00b9i\u0007\u00d4\u00ca=I!(\u0098\u0095\u0002\u00a1\u00ff5,\u00f0j>X\u00c4\u0016\u0011\u001f\u001a\u00b9\u00bc\u00c4";
                    var7_4 = "Oa\u001e\u00e9Gf\u00c2\u00a3#\u00eb(\u000fv\u00e6\u00dd\u0012\u001f\u00cb\u00f8NW\u00fe\u00b5U\u0094\u00f6\u0086\u00ef\u00ab\u00f1\u00aa\u001dz\u00aa}\n\u00f9c\u00f0\t\u00a0\u00175\u00fe\u008fi\u000bg]p\u00c9\u0099\u0002\u00b1\u00cf\u0000\u0007\u00bb\u0099\u00a8\u00b0\u00fb\u0088_\u00c8Z\u001e\u00b1\u00cd\u0089n\u008f\u00bd\u00d8\u00f7d&sR\u009c\u00b1\u0004\u00033Z![\u00b3&\u00daP\u0004\u00f1\u00a7\u0016>B\u0014\u000f\u00ce%\u00c7\u00efq\u0006\u0096\u00d9)\u0080g\u00b6\n\\\u00ec\u00e7\u00f4\u00d8\u00b9E\u0014\u00f4\u00bc\u00e5\u000b\u00de\u00b4\u00ea\u00d5Z\u0093\u0085zU\n\u00e1\u001e\u0001\u00f5\u00d27~\u0010\u009c\u0007\u00c4\u00d1\u00a46\u0086!\u00f2\u00bf\u00b0\u00a6\u00c0A\u00f7\u0084'8DO\u00d5\u00d5\u0096\u0018\u0017S\u0098\u001a\u00b9#cZ\u00d1\u0090\u001ae\u0006}/K\u0089\u001e\u00a5\u008b\u001a\u00b1t\u00f7\u00f3\u00ddR\u009a#\u00e9\u00d4\u00bc\u00d1R\u00e6\u007f\b*\u00c9\u0005af\u00e6\u00d5.\u00d1\u001d\u00cb~3\u0013.\u00bb\u00d1\u0091\u00c9\u00adS}g\u00c3\u00c6d\u00b9\u00b4#\u00ba\u00ad\u001a$o\u00ac\u0084V\u001d\u00e3U\u00bc\u00bd\u0019\u007f\u00f2\u00c5_9cZ\u00a6,\u00d3QC\u00ca\u0002\u00c9\f\u00f8<\u00a9\u0084b\u0095\u00a1\u0006\u00cc\u00ea\u008a|v\u009b\u00b1_\u00d2E\u00a3'7e\u00b1\u0011\u0087\u00de\u00c49gh@(\u009c\u008f8V\u00fe\u0010\u00cd\u00fb$\u00833\u008e\u0086\u001f\u00abaE'_\u0017\u00c2\u0093D$\u00c9;\u00c8\r\u00c2\u009f<\u00eb)\u00d9Fj\u009f\u00a3x\u00fa$\u0099C\u009eP\u00e3\u00e1KWf\u00b2r\u0011\u008f\u00b8q\u0014\u00fe8\u00fa\u00d0t\u0081\u00b4\u00ea\u00f8\u00ce\u0016\u0096\u0095\u00d8\u008c,\u0096%\u00f4\u00f04y\u00ce\u0095;\u00ba\u00a8\u0080\u00c1\u00ac\u0014\u0088\u00db]\u009e*wk\u0090(mN&\u001c\u00b3\u00c2R\u0000\u00c1\u00d8Rd\u0088\u00ef\u00af\u00ea\u00fee\u000e^\u001eq\u0084\u0086\u00f7\u00ee[\u00a7b\u00d9\u0019\u0085\u00e0\u00bd\nR}\u0087\u0012\u009bW\u0086\u00c0z\u00d6\u0001*~\u00a1\u0007\u00e7\u0094\u00b4]A\u008e\u0015k\u00d9\u00d8\u00d5C\u0004N{\u00c5N%\u00ec\u00a4!>kS\u00b8G+V\u00e5\u00f4\u00bd\u00155\u00e3\u00af\u001evO'\u00d8\u0093\u00fd\u0089\u00b5\u00a8\u00dbj\u00ec\u00a6\u008a#\u001a\f\u0087g'\u00cb{\u00a4Yu)b\u00b2bB\u00a2\u00b1\u00cc\u0019\u00ff\u00d0\u007fws\u0011v\u008cWj\u008f\u00a8<\u00e2\u00067F\u00bb)\u009c\u0000\u00c4\u0085\u0082B|`\u001d\u001b\u0013\u00c0\u00d6S\u000b\u00bfk\u00b5q\u00e9\u009f\u00c5\u00cd\u00ec\u008f.\u0012W\u0096G\u000e\u00dc\u00a8.\u000f\u00c6\u00e5\u00d5\u0016\u00dd\u00b8\u0087\u0087k\u0003n\u0013\u00d6\u00a8c(\u007f\u00b9\u008c\u00e4\u008f?\u0012*=O\u00ceJ\u008e\u00cai\u001d\u008b\u0091\u00c9\"2\u0019\u00d4\u00f9\u00ccj\u008b\u0098\u00a8?\u0093\u00b9i\u0007\u00d4\u00ca=I!(\u0098\u0095\u0002\u00a1\u00ff5,\u00f0j>X\u00c4\u0016\u0011\u001f\u001a\u00b9\u00bc\u00c4".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "\u00f3kAHr\u00fa\u001a\u00c8XZ\u0097\u0091\u00b2\u0083Pp";
                        var7_4 = "\u00f3kAHr\u00fa\u001a\u00c8XZ\u0097\u0091\u00b2\u0083Pp".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
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
            DO.b = var8_1;
            DO.c = new Integer[82];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 8841320509428672336L;
        ** while (true)
        DO.d = -8841320509428672345L ^ var0_7;
        DO.C = new Matrix4f();
        DO.B = new Matrix4f();
        DO.r = new Matrix4f();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static Vector3f t(Object[] objectArray) {
        CallSite callSite;
        Object object;
        block17: {
            CallSite callSite2;
            boolean bl;
            block16: {
                block15: {
                    Object object2;
                    block14: {
                        Vec3 vec3 = (Vec3)objectArray[0];
                        bl = Dl.t();
                        object = DO.a(21093, 2726297668228882965L) + DO.a(10369, 1501243577118710013L) ^ DO.a(7230, 8131440462021225472L);
                        if (!bl) {
                            switch (object) {
                                case -1178201366: {
                                    hi.a("G", (long)1312822163333810930L);
                                    hi.a("G", (long)632688375482250411L);
                                    break;
                                }
                            }
                        }
                        callSite2 = DO.a("gYlmQnoqJsh6agFO", H(net.minecraft.world.phys.Vec3 ), (Vec3)vec3);
                        reference cfr_temp_0 = hi.a("\u00e9", (Object)callSite2, (long)1031437550468343246L) - 0.05f;
                        object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (bl) break block14;
                        if (object2 < 0) break block15;
                        object2 = DO.a(18397, 4818243029103327152L) / DO.a(30974, 7577185871050344585L) - DO.a(17181, 654152283731178312L);
                    }
                    object = object2;
                    if (!bl) break block16;
                }
                object = DO.a(14704, 7092044840999602452L) + DO.a(6160, 8825226681671444597L) - DO.a(18929, 5004060492902906243L);
            }
            switch (object) {
                default: {
                    callSite = null;
                    object = DO.a(31976, 3015802463300619407L) - DO.a(20796, 3292738429932708110L) + DO.a(29096, 2869815307938497015L);
                    break block17;
                }
                case -708891269: {
                    callSite = callSite2;
                    if (!bl) break;
                    return callSite;
                }
                case -708891271: {
                    hi.a("G", (float)3.0f, (float)100.0f, (float)0.5f, (float)0.0f, (float)2.0f, (long)412744401362924088L);
                    return null;
                }
            }
            object = DO.a(22489, 7211381383954933634L) - DO.a(27107, 1199207316005853605L) + DO.a(28664, 3989157266347040682L);
        }
        switch (object) {
            default: {
                return callSite;
            }
            case 1672256018: 
        }
        DO.a("gYlmQnoqJsh6agFO", d(long float float float float int ), (long)d, (float)1.0f, (float)10.0f, (float)1.0f, (float)1.0f, (int)1);
        return null;
    }

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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float Z(Object[] var0) {
        block11: {
            var1_1 = (Vec3)var0[0];
            var2_2 = Dl.t();
            var7_3 /* !! */  = hi.a("G", (int)DO.a(15762, 4140652225377979891L), (int)DO.a(21341, 1458073442813092620L), (long)834203424483934088L) - DO.a(19269, 6320176221654792979L);
            if (!var2_2) break block11;
lbl6:
            // 2 sources

            while (true) {
                block14: {
                    block13: {
                        block12: {
                            var3_4 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)529286173586661242L);
                            var4_5 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var1_1, (Object)hi.a("\u00a5", (Object)var3_4, (long)888968013430088728L), (long)1082050008038634828L), (long)1085694674330158529L);
                            var5_6 = -hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)var3_4, (Object)hi.a("j", (long)1060175367224266830L), (long)924161495969582221L), (Object)var4_5, (Object)new Vector3f(), (long)844293780866646462L), (long)1031437550468343246L);
                            cfr_temp_0 = var5_6 - 0.05f;
                            v0 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var2_2) break block12;
                            if (v0 /* !! */  < 0) break block13;
                            v0 /* !! */  = var7_3 /* !! */  = (reference)(DO.a(26357, 26999518166161087L) / 3 * DO.a(31833, 7253608654345276450L) / 2 - DO.a(8041, 3042603676724522800L) - DO.a(22212, 1172092576395896493L));
                        }
                        if (!var2_2) break block14;
                    }
                    var7_3 /* !! */  = (reference)(hi.a("G", (int)(DO.a(4846, 1638822893954785957L) - DO.a(16899, 5833857964374143558L) ^ DO.a(14738, 40724894466132451L)), (int)DO.a(22118, 8319023890286159409L), (long)834203424483934088L) * DO.a(22894, 6163923932711856473L) ^ DO.a(17035, 6502321402962424509L));
                }
                switch (var7_3 /* !! */ ) {
                    default: {
                        return 0.0f;
                    }
                    case -1640301679: {
                        var6_7 = 1.0f / (float)hi.a("G", (double)(hi.a("G", (double)((double)hi.a("\u00a5", (Object)var3_4, (long)1088537529688224470L)), (long)689781824688360657L) * 0.5), (long)998107280301296938L);
                        return (float)(hi.a("G", (long)1101389884075884739L) * var6_7 / (2.0f * var5_6 * 20.0f));
                    }
                    case -1640301678: 
                }
                DO.a("gYlmQnoqJsh6agFO", j());
                return -1.0f;
            }
        }
        while (true) {
            switch (var7_3 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -1876944564: 
            }
            hi.a("G", (double)2.0, (long)1327728264718092753L);
            var7_3 /* !! */  = (reference)(DO.a(13729, 3695044710665111016L) / DO.a(5560, 7815722567834887564L) + DO.a(31004, 3193330556707932451L));
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7078;
        if (c[n2] == null) {
            DO.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }
}
