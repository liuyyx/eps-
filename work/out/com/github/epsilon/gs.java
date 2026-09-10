/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xi;
import com.github.epsilon.hi;
import com.github.epsilon.iJ;
import com.mojang.blaze3d.vertex.PoseStack;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

abstract class gs {
    protected float J;
    protected float K;
    protected int r;
    protected float n;
    protected float Y;
    protected float w;
    protected double A;
    protected double c;
    protected boolean T;
    private final Identifier[] h;
    protected double N;
    protected double t;
    private boolean E;
    protected final int F;
    protected double I;
    protected float O;
    protected boolean u;
    protected double G;
    protected float s;
    protected double M;
    protected double m;
    protected double X;
    private static final long[] b;
    private static final Integer[] i;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected boolean Z() {
        block12: {
            var1_1 = Dl.t();
            var2_2 /* !! */  = gs.a(16037, 6187386843533372883L) - gs.a(28925, 5690102075610669904L) - gs.a(4883, 354311828727677081L);
            if (!var1_1) ** GOTO lbl15
            block9: while (true) {
                block15: {
                    block14: {
                        block13: {
                            v0 /* !! */  = (cfr_temp_0 = hi.a("\u00e9", (Object)this, (long)813589640703568556L) - 0.0f) == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            if (var1_1) break block13;
                            if (v0 /* !! */  > 0) break block14;
                            v0 /* !! */  = (reference)((gs.a(7239, 4975430601856077623L) + gs.a(7639, 3920646887499255476L) ^ gs.a(13473, 4487818713396144086L)) - gs.a(30010, 860345607247767106L));
                        }
                        var2_2 /* !! */  = (int)v0 /* !! */ ;
                        if (!var1_1) break block15;
                    }
                    var2_2 /* !! */  = gs.a(5384, 5645813410668398218L) / gs.a(13103, 4544769490293350471L) - gs.a(30075, 1629839885776365231L);
                    if (var1_1) ** GOTO lbl41
                }
                block10: while (true) {
                    block17: {
                        block16: {
                            switch (var2_2 /* !! */ ) {
                                default: {
                                    continue block9;
                                }
                                case 1339116480: {
                                    cfr_temp_1 = hi.a("\u00e9", (Object)this, (long)737001268924615182L) - 0.0f;
                                    v1 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                    if (var1_1) break block16;
                                    if (v1 /* !! */  <= 0) break;
                                    break block17;
                                }
                                case 1339116478: {
                                    v2 = true;
                                    var2_2 /* !! */  = (gs.a(18357, 8542531429148955660L) / gs.a(10322, 8161630548044184476L) + gs.a(32336, 967120917029760386L)) * gs.a(17579, 4838656010361214831L) - gs.a(19741, 2419499986949414638L);
                                    if (var1_1) {
                                        break block9;
                                    }
                                    break block12;
                                }
                                case 1339116479: {
                                    v2 = false;
                                    if (!var1_1) break block9;
                                    return v2;
                                }
                                case 1339116482: {
                                    hi.a("G", (long)763209694749933009L);
                                    var2_2 /* !! */  = (int)((gs.i("WxgCMo73rFCtdKJi", max(int int ), (int)gs.a(31564, 1707793488987793594L), (int)gs.a(30550, 7409755380427564237L)) - gs.a(6779, 7609931212280088970L) - gs.a(28116, 5129542149060705810L)) * gs.a(15416, 2635388151094276042L) - gs.a(17324, 2010051293897232585L));
                                    continue block10;
                                }
                            }
lbl41:
                            // 2 sources

                            v1 /* !! */  = (reference)((gs.a(14099, 3368044570580083916L) + gs.a(614, 2303825322985574875L) ^ gs.a(23940, 2918783098707611174L)) - gs.a(1520, 7206079450515494432L));
                        }
                        var2_2 /* !! */  = (int)v1 /* !! */ ;
                        if (!var1_1) continue;
                    }
                    var2_2 /* !! */  = hi.a("G", (int)hi.a("G", (int)(gs.a(16739, 5678634387949261452L) * gs.a(13686, 4163139351790216908L) - gs.a(17649, 3314123094234011514L)), (int)gs.a(28806, 2038567434534298422L), (long)834203424483934088L), (int)gs.a(3150, 8178134170393272273L), (long)834203424483934088L) ^ gs.a(25096, 6497573369317470564L);
                }
                break;
            }
            var2_2 /* !! */  = (gs.a(935, 2059553414684856410L) / gs.a(28835, 8685765099753382755L) + gs.a(4604, 1668099934152114778L)) * gs.a(313, 3431753856139121351L) - gs.a(29556, 8303195564668559385L);
        }
        switch (var2_2 /* !! */ ) {
            default: {
                return v2;
            }
            case -2128290352: 
        }
        hi.a("G", (long)1115568667421921156L);
        return false;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected Identifier X(Object[] objectArray) {
        boolean bl = Dl.t();
        reference var5_3 = hi.a("G", (int)(gs.a(22635, 2919322758392122125L) + gs.a(18534, 4839764153653828486L) + gs.a(14507, 156709232506170234L) + gs.a(23694, 8072956735065362277L)), (int)gs.a(17458, 7969331388854310793L), (long)834203424483934088L) + gs.a(2046, 7739017900400661611L);
        boolean bl2 = true;
        block5: while (true) {
            Object object;
            block8: {
                block10: {
                    int n;
                    int n2;
                    block9: {
                        if (bl2 && !(bl2 = false) && !bl) break block8;
                        n2 = ((CallSite)hi.a("\u00e9", (Object)this, (long)1279692830229923453L)).length;
                        n = 1;
                        if (bl) break block9;
                        if (n2 == n) break block10;
                        n2 = (gs.a(6393, 5113605689529191289L) ^ gs.a(19369, 4428087491702986753L)) * gs.a(9162, 3866599113823318060L);
                        n = gs.a(21910, 7063342929571415671L);
                    }
                    object = n2 ^ n;
                    if (!bl) break block8;
                }
                object = gs.i("WxgCMo73rFCtdKJi", max(int int ), (int)hi.a("G", (int)gs.a(23608, 8917036582509842386L), (int)gs.a(4922, 4135671431874297939L), (long)834203424483934088L), (int)gs.a(26138, 3607243407498655087L)) + gs.a(20466, 371477126011722858L) + gs.a(25790, 8251359551122094029L);
            }
            switch (object) {
                default: {
                    continue block5;
                }
                case 41197453: {
                    return hi.a("\u00e9", (Object)this, (long)1279692830229923453L)[0];
                }
                case 41197454: {
                    CallSite callSite = hi.a("G", (int)1, (int)gs.i("WxgCMo73rFCtdKJi", C(), (gs)this), (long)834203424483934088L);
                    reference var4_6 = hi.a("G", (int)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)939296606393445613L), (int)0, (int)callSite, (long)1051766797435725461L) * (((CallSite)hi.a("\u00e9", (Object)this, (long)1279692830229923453L)).length - 1) / callSite;
                    return hi.a("\u00e9", (Object)this, (long)1279692830229923453L)[var4_6];
                }
                case 41197455: 
            }
            break;
        }
        hi.a("G", (long)1101389884075884739L);
        return hi.a("G", (long)1309558455265531753L);
    }

    protected gs(iJ iJ2, Vec3 vec3, int n, Identifier ... identifierArray) {
        Objects.requireNonNull(iJ2);
        hi.a("\u00f2", (Object)this, (float)0.98f, (long)1041393923578088373L);
        hi.a("\u00f2", (Object)this, (float)0.1f, (long)737001268924615182L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)813589640703568556L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)1009326797419192685L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)748132799987884835L);
        hi.a("\u00f2", (Object)this, (float)1.0f, (long)1334802402800276645L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)vec3, (long)1300412705618690751L), (long)792301987515869896L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)vec3, (long)1294071886475894755L), (long)1061381010527330786L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)vec3, (long)1282612456329596420L), (long)598428387898362242L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)792301987515869896L), (long)1310362632454636610L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)1061381010527330786L), (long)1160689651374182918L);
        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)598428387898362242L), (long)902193762500645392L);
        this.F = n;
        this.h = identifierArray;
    }

    protected int n(Object[] objectArray) {
        return (int)hi.a("\u00e9", (Object)this, (long)932224973340092472L);
    }

    protected void s(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        Xi xi = (Xi)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        Quaternionf quaternionf = (Quaternionf)objectArray[3];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)529286173586661242L);
        reference var7_7 = hi.a("G", (double)f, (double)hi.a("\u00e9", (Object)this, (long)1310362632454636610L), (double)hi.a("\u00e9", (Object)this, (long)792301987515869896L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1300412705618690751L);
        reference var9_8 = hi.a("G", (double)f, (double)hi.a("\u00e9", (Object)this, (long)1160689651374182918L), (double)hi.a("\u00e9", (Object)this, (long)1061381010527330786L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1294071886475894755L);
        reference var11_9 = hi.a("G", (double)f, (double)hi.a("\u00e9", (Object)this, (long)902193762500645392L), (double)hi.a("\u00e9", (Object)this, (long)598428387898362242L), (long)634868052102297765L) - hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)callSite, (long)888968013430088728L), (long)1282612456329596420L);
        hi.a("\u00a5", (Object)poseStack, (long)1071718823859296201L);
        hi.a("\u00a5", (Object)poseStack, (double)var7_7, (double)var9_8, (double)var11_9, (long)620263633503696695L);
        gs.i("WxgCMo73rFCtdKJi", mulPose(org.joml.Quaternionfc ), (PoseStack)poseStack, (Quaternionfc)quaternionf);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)poseStack, (long)970332505425455960L), (long)795986877611440477L);
        CallSite callSite3 = hi.a("\u00e9", (Object)this, (long)737001268924615182L);
        CallSite callSite4 = hi.a("G", (float)gs.i("WxgCMo73rFCtdKJi", clamp(float float float ), (float)hi.a("\u00e9", (Object)this, (long)813589640703568556L), (float)0.0f, (float)1.0f), (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)1009326797419192685L), (float)0.0f, (float)1.0f, (long)390336973585993938L), (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)748132799987884835L), (float)0.0f, (float)1.0f, (long)390336973585993938L), (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)1334802402800276645L), (float)0.0f, (float)1.0f, (long)390336973585993938L), (long)362202441641532421L);
        hi.a("\u00a5", (Object)xi, (Object)callSite2, (float)(-callSite3), (float)(-callSite3), (float)0.0f, (float)0.0f, (float)1.0f, (int)callSite4, (long)684582632005063774L);
        gs.i("WxgCMo73rFCtdKJi", J(org.joml.Matrix4f float float float float float int ), (Xi)xi, (Matrix4f)callSite2, (float)callSite3, (float)(-callSite3), (float)0.0f, (float)1.0f, (float)1.0f, (int)callSite4);
        gs.i("WxgCMo73rFCtdKJi", J(org.joml.Matrix4f float float float float float int ), (Xi)xi, (Matrix4f)callSite2, (float)callSite3, (float)callSite3, (float)0.0f, (float)1.0f, (float)0.0f, (int)callSite4);
        gs.i("WxgCMo73rFCtdKJi", J(org.joml.Matrix4f float float float float float int ), (Xi)xi, (Matrix4f)callSite2, (float)(-callSite3), (float)callSite3, (float)0.0f, (float)0.0f, (float)0.0f, (int)callSite4);
        hi.a("\u00a5", (Object)poseStack, (long)1236740458305185158L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected Entity K(Object[] var1_1) {
        block11: {
            var2_2 = (Integer)var1_1[0];
            var3_3 = Dl.t();
            var4_4 = gs.a(18001, 2883876951297791410L) * gs.a(28423, 7873183113760357578L) - gs.a(1877, 642469220040856800L) + gs.a(24037, 1280160955715030643L);
            if (!var3_3) ** GOTO lbl12
            block8: while (true) {
                block13: {
                    block12: {
                        if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L) == null) break block12;
                        var4_4 = (gs.a(24561, 4005073071660076122L) ^ gs.a(14682, 8601174189320170017L)) * gs.a(20837, 3044740019809878657L) + gs.a(31767, 280652025919516636L);
                        if (!var3_3) break block13;
                    }
                    var4_4 = gs.a(1030, 6719832449656215503L) * gs.a(31826, 1620376493725954030L) + gs.a(5589, 5205945957378115233L);
                }
                switch (var4_4) {
                    default: {
                        continue block8;
                    }
                    case 1337629854: {
                        v0 = null;
                        var4_4 = gs.a(25013, 41449275109519938L) / gs.a(11505, 6824869875805880161L) / gs.a(691, 2187444319220551972L) - gs.a(16414, 4312098883286438769L) + gs.a(11825, 9095208770276326720L) + gs.a(16324, 7303707755884178458L);
                        break block11;
                    }
                    case 1337629852: {
                        v0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (int)var2_2, (long)589839494272680763L);
                        if (!var3_3) break block8;
                        ** GOTO lbl-1000
                    }
                    case 1337629853: {
                        throw null;
                    }
                }
                break;
            }
            var4_4 = gs.a(7036, 1195330593800964244L) / gs.a(691, 2187444319220551972L) / gs.a(691, 2187444319220551972L) - gs.a(13677, 3773833620616242892L) + gs.a(20262, 4854319441992785136L) + gs.a(19803, 3907824371690118810L);
        }
        switch (var4_4) {
            case -1586007127: lbl-1000:
            // 2 sources

            {
                gs.i("WxgCMo73rFCtdKJi", j(double ), (double)0.0);
                hi.a("G", (long)589253768936098215L);
                return v0;
            }
        }
        return v0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean J() {
        boolean bl = Dl.S();
        int n = (gs.a(17045, 1804766801101787449L) + gs.a(29616, 9132222085129052201L)) / gs.a(30280, 7515401909485381095L) + gs.a(26371, 8660443017459119347L) - gs.a(24640, 2789316620809122802L) - gs.a(25719, 5322948097093777406L);
        boolean bl2 = true;
        block5: while (true) {
            reference var2_3;
            block8: {
                block10: {
                    Object object;
                    Object object2;
                    block9: {
                        if (bl2 && !(bl2 = false) && bl) break block8;
                        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)792301987515869896L), (long)1310362632454636610L);
                        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)1061381010527330786L), (long)1160689651374182918L);
                        hi.a("\u00f2", (Object)this, (double)hi.a("\u00e9", (Object)this, (long)598428387898362242L), (long)902193762500645392L);
                        gs gs2 = this;
                        CallSite callSite = hi.a("\u00e9", (Object)gs2, (long)932224973340092472L);
                        object2 = callSite;
                        hi.a("\u00f2", (Object)gs2, (int)(callSite + true), (long)932224973340092472L);
                        object = hi.a("\u00e9", (Object)this, (long)1064144588222028637L);
                        if (!bl) break block9;
                        if (object2 >= object) break block10;
                        Object object = gs.a(2293, 651521555906419504L) - gs.a(6813, 8057815118595017029L) + gs.a(16648, 5904906604932141767L) ^ gs.a(30008, 7993784107885274761L);
                        object = gs.a(21859, 2000960782419068420L);
                    }
                    var2_3 = object2 - object;
                    if (bl) break block8;
                }
                var2_3 = hi.a("G", (int)(gs.a(4430, 3434200668498706995L) ^ gs.a(23512, 3558063862513600516L)), (int)gs.a(14142, 6450870122925647032L), (long)834203424483934088L) + gs.a(30032, 5029015327549368001L);
            }
            switch (var2_3) {
                default: {
                    continue block5;
                }
                case 1330178001: {
                    return true;
                }
                case 1330178000: {
                    gs gs3 = this;
                    hi.a("\u00f2", (Object)gs3, (double)(hi.a("\u00e9", (Object)gs3, (long)1078706094324596397L) - 0.04 * (double)hi.a("\u00e9", (Object)this, (long)592263982715586114L)), (long)1078706094324596397L);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)452147973678042070L);
                    gs gs4 = this;
                    hi.a("\u00f2", (Object)gs4, (double)(hi.a("\u00e9", (Object)gs4, (long)609409853844784478L) * (double)hi.a("\u00e9", (Object)this, (long)1041393923578088373L)), (long)609409853844784478L);
                    gs gs5 = this;
                    hi.a("\u00f2", (Object)gs5, (double)(hi.a("\u00e9", (Object)gs5, (long)1078706094324596397L) * (double)hi.a("\u00e9", (Object)this, (long)1041393923578088373L)), (long)1078706094324596397L);
                    gs gs6 = this;
                    hi.a("\u00f2", (Object)gs6, (double)(hi.a("\u00e9", (Object)gs6, (long)669321080678999846L) * (double)hi.a("\u00e9", (Object)this, (long)1041393923578088373L)), (long)669321080678999846L);
                    hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)429411644560892499L);
                    return (boolean)hi.a("\u00e9", (Object)this, (long)844761422910984970L);
                }
                case 1330177999: 
            }
            break;
        }
        hi.a("G", (long)1208540510591910900L);
        hi.a("G", (int)-1, (long)1235507535267189928L);
        return false;
    }

    public static /* bridge */ /* synthetic */ CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    protected void M(Object[] objectArray) {
    }

    protected int C() {
        return (int)hi.a("\u00e9", (Object)this, (long)1064144588222028637L);
    }

    protected void o(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        Xi xi = (Xi)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L), (long)529286173586661242L), (long)509712524370456873L);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = xi;
        objectArray2[0] = poseStack;
        hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)693677239411801080L);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void e(Object[] var1_1) {
        block32: {
            block36: {
                block31: {
                    block30: {
                        var2_2 = Dl.t();
                        var6_3 /* !! */  = (hi.a("G", (int)gs.a(1943, 7035584334125225086L), (int)gs.a(30547, 1592282597849670697L), (long)834203424483934088L) ^ gs.a(10420, 40236010107009903L)) - gs.a(29492, 889940235909079265L);
                        if (!var2_2) ** GOTO lbl15
                        block20: while (true) {
                            block35: {
                                block34: {
                                    block33: {
                                        v0 /* !! */  = hi.a("\u00e9", (Object)this, (long)1069607802131985702L);
                                        if (var2_2) break block33;
                                        if (v0 /* !! */  != false) break block34;
                                        v0 /* !! */  = (CallSite)(gs.a(8691, 6717625311683080746L) + gs.a(12182, 8661518987796315162L) + gs.a(5740, 2800565612737971470L) - gs.a(18555, 3869678464093461409L));
                                    }
                                    var6_3 /* !! */  = (int)v0 /* !! */ ;
                                    if (!var2_2) break block35;
                                }
                                var6_3 /* !! */  = gs.a(18484, 7854557799144168397L) - gs.a(26295, 6872014206013846793L) + gs.a(13165, 2297962889990660249L) - gs.a(20301, 4826789675991145535L) ^ gs.a(21787, 2631286853140874852L);
                            }
                            switch (var6_3 /* !! */ ) {
                                default: {
                                    continue block20;
                                }
                                case -670095019: {
                                    return;
                                }
                                case -670095021: {
                                    var3_4 = new Vec3((double)hi.a("\u00e9", (Object)this, (long)609409853844784478L), (double)hi.a("\u00e9", (Object)this, (long)1078706094324596397L), (double)hi.a("\u00e9", (Object)this, (long)669321080678999846L));
                                    v1 /* !! */  = hi.a("\u00e9", (Object)this, (long)839845615772263865L);
                                    if (var2_2) break block30;
                                    if (v1 /* !! */  == false) break block20;
                                    break block31;
                                }
                                case -670095022: {
                                    return;
                                }
                            }
                            break;
                        }
                        v1 /* !! */  = (CallSite)(gs.a(7246, 7645159760587870145L) + gs.a(3659, 2737689527660502501L) + gs.a(30509, 9161640539275633748L) - gs.a(8860, 4232042672015110447L));
                    }
                    var6_3 /* !! */  = (int)v1 /* !! */ ;
                    if (!var2_2) break block36;
                }
                var6_3 /* !! */  = (int)(hi.a("G", (int)(gs.a(17411, 5663988625151563759L) / gs.a(19544, 2891668760942813126L)), (int)gs.a(12820, 2426717752103657967L), (long)834203424483934088L) + gs.a(10772, 8830258039101487476L));
                if (!var2_2) break block36;
                ** GOTO lbl83
lbl37:
                // 2 sources

                while (true) {
                    cfr_temp_0 = hi.a("\u00e9", (Object)var3_4, (long)1300412705618690751L) - hi.a("\u00e9", (Object)var5_6, (long)1300412705618690751L);
                    v2 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (var2_2) ** GOTO lbl137
                    if (v2 /* !! */  == false) ** GOTO lbl136
                    ** GOTO lbl139
                    break;
                }
lbl43:
                // 2 sources

                while (true) {
                    cfr_temp_1 = hi.a("\u00e9", (Object)var3_4, (long)1282612456329596420L) - hi.a("\u00e9", (Object)var5_6, (long)1282612456329596420L);
                    v3 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                    if (var2_2) ** GOTO lbl144
                    if (v3 /* !! */  == false) ** GOTO lbl143
                    ** GOTO lbl146
                    break;
                }
            }
            block23: while (true) {
                switch (var6_3 /* !! */ ) {
                    default: {
                        if (hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L) == null) ** GOTO lbl83
                        ** GOTO lbl85
                    }
                    case -1477499195: {
                        cfr_temp_2 = hi.a("\u00a5", (Object)var3_4, (long)431225985925845942L) - 10000.0;
                        v4 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                        if (var2_2) ** GOTO lbl88
                        if (v4 /* !! */  < 0) ** GOTO lbl87
                        ** GOTO lbl90
                    }
                    case -1477499196: {
                        v5 = this;
                        hi.a("\u00f2", (Object)v5, (double)(hi.a("\u00e9", (Object)v5, (long)792301987515869896L) + hi.a("\u00e9", (Object)this, (long)609409853844784478L)), (long)792301987515869896L);
                        v6 = this;
                        hi.a("\u00f2", (Object)v6, (double)(hi.a("\u00e9", (Object)v6, (long)1061381010527330786L) + hi.a("\u00e9", (Object)this, (long)1078706094324596397L)), (long)1061381010527330786L);
                        v7 = this;
                        hi.a("\u00f2", (Object)v7, (double)(hi.a("\u00e9", (Object)v7, (long)598428387898362242L) + hi.a("\u00e9", (Object)this, (long)669321080678999846L)), (long)598428387898362242L);
                        return;
                    }
                    case -1477499197: {
                        var4_5 = new AABB((double)(hi.a("\u00e9", (Object)this, (long)792301987515869896L) - 0.1), (double)hi.a("\u00e9", (Object)this, (long)1061381010527330786L), (double)(hi.a("\u00e9", (Object)this, (long)598428387898362242L) - 0.1), (double)(hi.a("\u00e9", (Object)this, (long)792301987515869896L) + 0.1), (double)(hi.a("\u00e9", (Object)this, (long)1061381010527330786L) + 0.2), (double)(hi.a("\u00e9", (Object)this, (long)598428387898362242L) + 0.1));
                        var5_6 = gs.i("WxgCMo73rFCtdKJi", collideBoundingBox(net.minecraft.world.entity.Entity net.minecraft.world.phys.Vec3 net.minecraft.world.phys.AABB net.minecraft.world.level.Level java.util.List ), null, (Vec3)var3_4, (AABB)var4_5, (Level)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)430579852159213241L), (List)hi.a("G", (long)1104179098836104202L));
                        v8 = this;
                        hi.a("\u00f2", (Object)v8, (double)(hi.a("\u00e9", (Object)v8, (long)792301987515869896L) + hi.a("\u00e9", (Object)var5_6, (long)1300412705618690751L)), (long)792301987515869896L);
                        v9 = this;
                        hi.a("\u00f2", (Object)v9, (double)(hi.a("\u00e9", (Object)v9, (long)1061381010527330786L) + hi.a("\u00e9", (Object)var5_6, (long)1294071886475894755L)), (long)1061381010527330786L);
                        v10 = this;
                        hi.a("\u00f2", (Object)v10, (double)(hi.a("\u00e9", (Object)v10, (long)598428387898362242L) + hi.a("\u00e9", (Object)var5_6, (long)1282612456329596420L)), (long)598428387898362242L);
                        cfr_temp_3 = hi.a("G", (double)hi.a("\u00e9", (Object)var3_4, (long)1294071886475894755L), (long)1220789442640140846L) - 9.999999747378752E-6;
                        v11 /* !! */  = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                        if (var2_2) ** GOTO lbl93
                        if (v11 /* !! */  < 0) ** GOTO lbl92
                        ** GOTO lbl95
                    }
lbl83:
                    // 2 sources

                    var6_3 /* !! */  = gs.a(25935, 469627791426729518L) + gs.a(8749, 1202881101010465173L) + gs.a(8867, 8876909228708655360L) - gs.a(5228, 1645098528503121867L);
                    if (!var2_2) continue block23;
lbl85:
                    // 2 sources

                    var6_3 /* !! */  = ((gs.a(26219, 7092410931178321334L) - gs.a(14362, 6023942110129679269L)) * gs.a(1235, 6280562146075563828L) ^ gs.a(30751, 5927753702827633612L)) - gs.a(20920, 3768015087183757901L) ^ gs.a(14253, 6159360888195867683L);
                    if (!var2_2) continue block23;
lbl87:
                    // 2 sources

                    v4 /* !! */  = (reference)(gs.a(14760, 3428435317863803462L) * gs.a(1940, 3572796520448283709L) ^ gs.a(13314, 3131845901765011329L));
lbl88:
                    // 2 sources

                    var6_3 /* !! */  = (int)v4 /* !! */ ;
                    if (!var2_2) continue block23;
lbl90:
                    // 2 sources

                    var6_3 /* !! */  = gs.a(25935, 469627791426729518L) + gs.a(8749, 1202881101010465173L) + gs.a(8867, 8876909228708655360L) - gs.a(5228, 1645098528503121867L);
                    continue block23;
lbl92:
                    // 1 sources

                    v11 /* !! */  = (reference)(gs.a(1844, 2273837218096141386L) * gs.a(12286, 6333882235891776666L) - gs.a(8479, 5790461512572105445L));
lbl93:
                    // 2 sources

                    var6_3 /* !! */  = (int)v11 /* !! */ ;
                    if (!var2_2) break block32;
lbl95:
                    // 2 sources

                    var6_3 /* !! */  = (int)(hi.a("G", (int)gs.a(26767, 7833631969465154373L), (int)gs.a(19370, 9206522928530692111L), (long)834203424483934088L) - gs.a(20287, 4816714085412609276L));
                    if (!var2_2) break block32;
                    ** GOTO lbl129
                    case -1477499194: 
                }
                break;
            }
            return;
        }
        block24: while (true) {
            switch (var6_3 /* !! */ ) {
                default: {
                    cfr_temp_4 = hi.a("G", (double)hi.a("\u00e9", (Object)var5_6, (long)1294071886475894755L), (long)1220789442640140846L) - 9.999999747378752E-6;
                    v12 /* !! */  = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 < 0 ? -1 : 1);
                    if (var2_2) ** GOTO lbl130
                    if (v12 /* !! */  >= 0) ** GOTO lbl129
                    ** GOTO lbl132
                }
                case -1673438365: {
                    hi.a("\u00f2", (Object)this, (boolean)true, (long)1069607802131985702L);
                    if (!var2_2) ** GOTO lbl134
                    ** GOTO lbl37
                }
                case -1673438367: {
                    ** continue;
                }
                case -1673438364: {
                    hi.a("\u00f2", (Object)this, (double)0.0, (long)609409853844784478L);
                    if (!var2_2) ** GOTO lbl141
                    ** GOTO lbl43
                }
                case -1673438368: {
                    ** continue;
                }
                case -1673438370: {
                    hi.a("\u00f2", (Object)this, (double)0.0, (long)669321080678999846L);
                    if (var2_2) {
                        return;
                    }
                    ** GOTO lbl148
                }
                case -1673438363: {
                    throw null;
                }
lbl129:
                // 2 sources

                v12 /* !! */  = (reference)(gs.a(12603, 7475157072410010364L) * gs.a(24099, 6741508444248837596L) - gs.a(30604, 1549865409805657112L));
lbl130:
                // 2 sources

                var6_3 /* !! */  = (int)v12 /* !! */ ;
                if (!var2_2) continue block24;
lbl132:
                // 2 sources

                var6_3 /* !! */  = gs.a(24364, 5360572196924886206L) + gs.a(1837, 3742158471485772968L) - gs.a(10337, 1699023971970153409L) + gs.a(20374, 3373158477774134304L) ^ gs.a(25001, 910792005313409576L);
                if (!var2_2) continue block24;
lbl134:
                // 2 sources

                var6_3 /* !! */  = gs.a(12603, 7475157072410010364L) * gs.a(24099, 6741508444248837596L) - gs.a(30604, 1549865409805657112L);
                if (!var2_2) continue block24;
lbl136:
                // 2 sources

                v2 /* !! */  = (reference)((gs.a(375, 512656870616814314L) / gs.a(25613, 6758619969139619717L) ^ gs.a(6274, 8384122536480197381L)) * gs.a(2199, 4621886016837966706L) + gs.a(1639, 840575807512139173L));
lbl137:
                // 2 sources

                var6_3 /* !! */  = (int)v2 /* !! */ ;
                if (!var2_2) continue block24;
lbl139:
                // 2 sources

                var6_3 /* !! */  = hi.a("G", (int)((gs.a(4747, 191624044332564841L) ^ gs.a(19147, 4107047939237288273L)) * gs.a(14031, 5506672011632600344L)), (int)gs.a(19785, 8453610021671313150L), (long)834203424483934088L) ^ gs.a(24196, 3031795176642055433L);
                if (!var2_2) continue block24;
lbl141:
                // 2 sources

                var6_3 /* !! */  = (gs.a(15040, 5209855752557652412L) / gs.a(25603, 3865772248739526559L) ^ gs.a(14926, 2676741153187752374L)) * gs.a(11806, 1116453778392776048L) + gs.a(29764, 1444809156108232632L);
                if (!var2_2) continue block24;
lbl143:
                // 2 sources

                v3 /* !! */  = (reference)(gs.a(27000, 8910987707808365260L) ^ gs.a(8054, 1115778954354543806L) ^ gs.a(22784, 4145782078120823460L));
lbl144:
                // 2 sources

                var6_3 /* !! */  = (int)v3 /* !! */ ;
                if (!var2_2) continue block24;
lbl146:
                // 2 sources

                var6_3 /* !! */  = (gs.a(25279, 1708422114119266642L) ^ gs.a(29179, 6674763458174755383L)) * gs.a(30621, 8504439103786919159L) - gs.a(16310, 5458555143113206821L);
                if (!var2_2) continue block24;
lbl148:
                // 2 sources

                var6_3 /* !! */  = gs.a(7002, 4151025631949146352L) ^ gs.a(19290, 114348687277955121L) ^ gs.a(6969, 4181253530206947517L);
                continue block24;
                case -1673438366: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6614806120715078782L;
                var6_1 = new long[160];
                var3_2 = 0;
                var4_3 = "\r\u0013\u0080\u0093\u00a7;@P\u00c8\u00d0\u00a9\u00feu\u00ffh:\u0081\u00f4\u0013\u000e\"\u0091\u009c\u00a5\u0007a\u00ea>\u00f7\u00adQOC\u00eb\u00fe0\u00dd~\u00e1\u00b7\u0085\u00b5?xj\u00fcka\u00a8\u0080\u009d9\u00c7`\u00fb\u00d6S\u008d\u00a0Q;XFkk\u001cP\u0091O.I\u00c8^'\u0093\u00f9\u0007\u0003\u00a7n\u0089\u000b\u00af\u00daR(a -\b\u00d9^K\u00e5T\u00b2\u00ee\tKRb\u00c2\u00c4-\u00d0\u00e6\u008e\u00c4\u00c3e\u00a7\u00d6\u00c7\"\u00a9\u000b\u00f5\u00ed\u0003M2\u00e7L.%\u00c9\u001fA?ZnX\u00ea\u0093\u00c2\u00edy\u00e3M\u00f8*\u008f\u00f0\u0088k\u00d4\u0097>Z\u00cc\u00b5T\u0003\u00ef\u00ae\u0014\u000f\u0088\u00c4\u00f8\u00a3\u00ee&T\u00d2\u0007Y_\u00f7\u00ea\u0097\u00fa\u00bd\u0098\u001b\u00f6\u0005K\u0091\u00f8\u00e3a-nd\u00f9f\u0017\u00fc\u00e5+\u008aV\u00d9\u0010\u00d1\u00b1Y\u00aa\u00ebm;\u00b2\\\u008f{_\u0000\u0084\u00aa9?J\u00a4\u00d4\u00ac2\u008a\u00d4~\u0012\u00e9\u00a3/a\u00df\u009d\u00b3\u0006{\u001f\u00ae'\u00a0\u00dd\u00a5-\u00a7Y\u00a9\u0096C\u00b7\u00b7\u00ccpL\u00d86\u00e1I\u0084O\u001f\u0084b\u00bc\u000fN\u00c4G\u00ec>\u00c5\u00c1\u0015\u00ed\u00c3\u00e9\u00016\u00d1\u0093\u00bd\u00f6\u00abv\u0004o\u001a#\u009d\u009cJ\u00f4\u00f7\u00a86v\u00d4\u00e3\u00b8 K>\u00ce\u00b3\u00dd\u00d2m\u0005\u0000{\u0091\u00e0\u00877if'Z\u0006B\u0080\u009b\u0004\u00e8\u00da5\u00c8\u00e68dB\u001ea6\u0089H\u00f9\u00bf\u00e1W\u00bbqe y\u0096\u0089\u00a6\u00dd\fu\u0096\u00fc,Q\u008b\u00ccYy\u00f71kr\u007fk7\u00e5\u0018\u00db\u0094\u00ee1Kj\u00f48&;\u0089d\u001e\u0098\u00d1L\u001a\u00f8\u00a9oR\u00e3[\u00c2\u009a\u0085.v\u00cb;\u009e\u00e0de\\\u0003\u009eX\u001d\u00ce\u00b6>hX\u00b0UE\u0092\u00edOB\u0001\u00a7|\u00d4;\u00f1\u0081\u00c3Z\u00c5\u0098\u009bF\u00f5\u00ac\"\u00ec\u0007\u00ae\u001f\u00e0\u00bb\u0005\u0093\u00bf\u009c\u00b1=\u00af\u0085G>f\u00b1\u00a0\u0005\u00dd\u0086\u00f8\u0019\u0015\u00d0\u007f\u00be-\u00b29*\u00a7Q\u0092Q\u00cd\u00a2\u0099\u00c6V\u00e9\u00f9\u00a7\u0086cp\u001a\u0010}v\u00d7\r\u0098\u0099\u009b\u0097~Z\u00b6\u0085%\r\u00a2\u00ba0P\u0001\u00de\u0081\u00b5cK\u00fa\u00fb\u00ac\u0083;^\\N\u0089\u008a(r\u00a8\u00e5\u009e|\u0002\u00dc\u00c3^\u00e8\u009d\u0087\u00dd\u0096\u0081XUL\u00c0\u00d8\u00be\u00aa\u00b4N$\u00ban\u009bJS&\u00cc\u0084W\u00d3\u00ff\u00b4^\u00d4F\u0013\u00d7<\ni#H\u00f4\u0085\u00e0\u00fd\u00d4\u001c\u00c8#\u009b\u0016\u00e4 \u00ac{\u00a8\u00dfc\u00e4\u00d9\u00b9-\u0084}\u00b6\u0018\u00e5\u00ad\u00abi\u00b6\u0085\u009e\u00bb\u0096\"\u0093(\u00db^Y\u00e4\u009d\u008d\u00b5\u009d!\u0005;N\u00a6\u00f8\u008aQ\u0086w\u00d8\u0002L\u0092\u00b7\u00eb\\fi\u0092\u00ca g\u0011d0\u00fb\u00a40\u00f2\u00b7\u00a6\u00d0\u00ecaP\u0092\u00d07L#\u00d4D\u00a1\u0003\u0094\u008d\u0006a\u0010~\u0010\u0096A\u00ec0\u00b1\u00e2\th\u00b3\u00de\u00cc\u0016\u000biQ\f\u00a7\u0096\u0085\u00d0\u00bb\u0098\u009e\u00e6\u00adL\u001e\u008aD+\u00b8`c\u0092\u009e$\u00a8iD$\u00e4\u00f9\u0095\u00e35\u00aa\u00f2\u00d0\u009e\u00f9ujW\u009c\u0012\u00a7\u001f\u008aSf\u0011\u00dd\u009cu`<\u0001(\u00a37tr=v\u00cb=t,\u00c04\u00e9phd^\u0013B?YLed\u00aa\u00d8\u00e2e3\u008a\u00c7\u00d2`-<U\u008a\u00a7\u00d4\u0010\u00f6\u009c\u0096+\u00c6\u00de.\u0084\u0003\u008e\u00b7\u00a8x\u00cc\u0017\u00cbo\u00c3\u00d7-\u0005x\u00fcU\u00aar\u00ef\u00b4s@\u00e7\u00c2\u00a8\u00c9\u00a3\u0095\u00ffUa~\u0007A\u0002\u00dd\u009a\u00d2\u00ba'y\u00f7\u00f6\u001f+\u0080~r\u0019\u008f\u00e1\u0082\u00ed\u00d0\u00car b\u00c8Gs\u00de\u0089N\u00bbd\u0096{\u00c1\u00ee\u00ff\u00edD\u00b6*\u00b7\u00a4\u00b8\u0082\u00bb\u001b \u00fb\u00f1\u00dc5\u00b3\u001d\u00d8\u00d6[\u0081R\u0004~\u00ba\u00d7\u00924\u00f81\u00e0w\u00bc\u00119\u00e7\u00f9\u0018\u00ed\u0081\u00821\u001bv\u00b8m\u00e7\u00ef/4rp\u00f3\u00b7\u00d9n\u008e\u0086!+\u0088\u00cc\u0088\u0011\u001c\u00ba\u009b\u0002\u00c6K\u0084\u001d\u00bd\u00b2\u00e13\u0011Y3C\u00ce\u00f9\u00fdW\tL\u00a4\u0084\u00b6\u00d6KbN\n&~\u00e3v[\u001dT\u0098b\u00cb\u00a6F\u0016|\u0016\u0007\u00fe\u009e;\u00ddS\u00c0\u001f\u00acy=\tA\u00ce\u00a0C\u0017r\u001e\u00feM\u009cc\u00a6\u008ev\u000e\u009f\\6!\u00fbZ\u00aa\u00f9\u00a4\u0089\u00e7\u008d\u0099\u00fc8:\u00b5cZS\u00b4\u00e7\u00c1\u00afX+\u0007\u0004\u00b7\u008d7]\u0094_\u00e3\u00fb\u00eb\u001a-\u00db\u008b/\u00a9\u00d8\u00ca!\u00c9\u008c7t\u00da\u00cb%ax\u00f7@|\u00a4\tD:\u00c5\u007f\u009f\u00fao\u0001\u00bf&\u00c21<\u0001n\u009e\u0016\u0000|\u00d2\u00bfqx\u00dd\u00fc\u00a8\u00ceB\u00efV?3\u0086{\u00d3\u00a9\u00a2\u00a7d\u00a8\u00ef&\u0010J)E\u007f\u008fLAX\u008e\u0006\u00b0\u00d0\u0019\u00a6QJ\u0099\u008e\u00cdI\u00d8\u00fa^?@F\u0015\u00ba\u00ac1\u00d3\u00175\u00a4\u00b6F0J\u00b41Q#\u00df\u009e\u00e0i\u00e6\u0084z\u00a2\u00da\u00b7SqTas\u0085g$\u00a1\u00bc\u0099\u000b\u008a\u00ec\u00d6\nN\u007f\u00b1\u00eb\u00f9\u0089<(\u0017Xo\u00df\u0097\u0004\u0016\u009f\u008a\u0084\u00feB&\u00e8\u00ff\u0016\u00fb\u00fa\u008e2qlR\u00d3y+\u00a8\u00b0\u008bc\u00ad&Uv\u0099(\u00e0HV\u00b0\u00b53D\u0091\u0083a\f'\u008ailx\u00c6\u00ecB\u0096\u00ad\u0012\u0086\u00ce\u009dq\u00a1L\u00b8\u00f9\u00ae\u009aD\u0093)E\u00c0\r\u001a\u00fd\u00e8Ew\u0095\u00a5'\u00ce\u0099\u00de=\u0012Q\u00d4\f\u00a5\u0080?\u00cc\u009d\u0091\u00cd'\u00047\u0004\u00dd\u00f1\f\u0010\u008b";
                var5_4 = "\r\u0013\u0080\u0093\u00a7;@P\u00c8\u00d0\u00a9\u00feu\u00ffh:\u0081\u00f4\u0013\u000e\"\u0091\u009c\u00a5\u0007a\u00ea>\u00f7\u00adQOC\u00eb\u00fe0\u00dd~\u00e1\u00b7\u0085\u00b5?xj\u00fcka\u00a8\u0080\u009d9\u00c7`\u00fb\u00d6S\u008d\u00a0Q;XFkk\u001cP\u0091O.I\u00c8^'\u0093\u00f9\u0007\u0003\u00a7n\u0089\u000b\u00af\u00daR(a -\b\u00d9^K\u00e5T\u00b2\u00ee\tKRb\u00c2\u00c4-\u00d0\u00e6\u008e\u00c4\u00c3e\u00a7\u00d6\u00c7\"\u00a9\u000b\u00f5\u00ed\u0003M2\u00e7L.%\u00c9\u001fA?ZnX\u00ea\u0093\u00c2\u00edy\u00e3M\u00f8*\u008f\u00f0\u0088k\u00d4\u0097>Z\u00cc\u00b5T\u0003\u00ef\u00ae\u0014\u000f\u0088\u00c4\u00f8\u00a3\u00ee&T\u00d2\u0007Y_\u00f7\u00ea\u0097\u00fa\u00bd\u0098\u001b\u00f6\u0005K\u0091\u00f8\u00e3a-nd\u00f9f\u0017\u00fc\u00e5+\u008aV\u00d9\u0010\u00d1\u00b1Y\u00aa\u00ebm;\u00b2\\\u008f{_\u0000\u0084\u00aa9?J\u00a4\u00d4\u00ac2\u008a\u00d4~\u0012\u00e9\u00a3/a\u00df\u009d\u00b3\u0006{\u001f\u00ae'\u00a0\u00dd\u00a5-\u00a7Y\u00a9\u0096C\u00b7\u00b7\u00ccpL\u00d86\u00e1I\u0084O\u001f\u0084b\u00bc\u000fN\u00c4G\u00ec>\u00c5\u00c1\u0015\u00ed\u00c3\u00e9\u00016\u00d1\u0093\u00bd\u00f6\u00abv\u0004o\u001a#\u009d\u009cJ\u00f4\u00f7\u00a86v\u00d4\u00e3\u00b8 K>\u00ce\u00b3\u00dd\u00d2m\u0005\u0000{\u0091\u00e0\u00877if'Z\u0006B\u0080\u009b\u0004\u00e8\u00da5\u00c8\u00e68dB\u001ea6\u0089H\u00f9\u00bf\u00e1W\u00bbqe y\u0096\u0089\u00a6\u00dd\fu\u0096\u00fc,Q\u008b\u00ccYy\u00f71kr\u007fk7\u00e5\u0018\u00db\u0094\u00ee1Kj\u00f48&;\u0089d\u001e\u0098\u00d1L\u001a\u00f8\u00a9oR\u00e3[\u00c2\u009a\u0085.v\u00cb;\u009e\u00e0de\\\u0003\u009eX\u001d\u00ce\u00b6>hX\u00b0UE\u0092\u00edOB\u0001\u00a7|\u00d4;\u00f1\u0081\u00c3Z\u00c5\u0098\u009bF\u00f5\u00ac\"\u00ec\u0007\u00ae\u001f\u00e0\u00bb\u0005\u0093\u00bf\u009c\u00b1=\u00af\u0085G>f\u00b1\u00a0\u0005\u00dd\u0086\u00f8\u0019\u0015\u00d0\u007f\u00be-\u00b29*\u00a7Q\u0092Q\u00cd\u00a2\u0099\u00c6V\u00e9\u00f9\u00a7\u0086cp\u001a\u0010}v\u00d7\r\u0098\u0099\u009b\u0097~Z\u00b6\u0085%\r\u00a2\u00ba0P\u0001\u00de\u0081\u00b5cK\u00fa\u00fb\u00ac\u0083;^\\N\u0089\u008a(r\u00a8\u00e5\u009e|\u0002\u00dc\u00c3^\u00e8\u009d\u0087\u00dd\u0096\u0081XUL\u00c0\u00d8\u00be\u00aa\u00b4N$\u00ban\u009bJS&\u00cc\u0084W\u00d3\u00ff\u00b4^\u00d4F\u0013\u00d7<\ni#H\u00f4\u0085\u00e0\u00fd\u00d4\u001c\u00c8#\u009b\u0016\u00e4 \u00ac{\u00a8\u00dfc\u00e4\u00d9\u00b9-\u0084}\u00b6\u0018\u00e5\u00ad\u00abi\u00b6\u0085\u009e\u00bb\u0096\"\u0093(\u00db^Y\u00e4\u009d\u008d\u00b5\u009d!\u0005;N\u00a6\u00f8\u008aQ\u0086w\u00d8\u0002L\u0092\u00b7\u00eb\\fi\u0092\u00ca g\u0011d0\u00fb\u00a40\u00f2\u00b7\u00a6\u00d0\u00ecaP\u0092\u00d07L#\u00d4D\u00a1\u0003\u0094\u008d\u0006a\u0010~\u0010\u0096A\u00ec0\u00b1\u00e2\th\u00b3\u00de\u00cc\u0016\u000biQ\f\u00a7\u0096\u0085\u00d0\u00bb\u0098\u009e\u00e6\u00adL\u001e\u008aD+\u00b8`c\u0092\u009e$\u00a8iD$\u00e4\u00f9\u0095\u00e35\u00aa\u00f2\u00d0\u009e\u00f9ujW\u009c\u0012\u00a7\u001f\u008aSf\u0011\u00dd\u009cu`<\u0001(\u00a37tr=v\u00cb=t,\u00c04\u00e9phd^\u0013B?YLed\u00aa\u00d8\u00e2e3\u008a\u00c7\u00d2`-<U\u008a\u00a7\u00d4\u0010\u00f6\u009c\u0096+\u00c6\u00de.\u0084\u0003\u008e\u00b7\u00a8x\u00cc\u0017\u00cbo\u00c3\u00d7-\u0005x\u00fcU\u00aar\u00ef\u00b4s@\u00e7\u00c2\u00a8\u00c9\u00a3\u0095\u00ffUa~\u0007A\u0002\u00dd\u009a\u00d2\u00ba'y\u00f7\u00f6\u001f+\u0080~r\u0019\u008f\u00e1\u0082\u00ed\u00d0\u00car b\u00c8Gs\u00de\u0089N\u00bbd\u0096{\u00c1\u00ee\u00ff\u00edD\u00b6*\u00b7\u00a4\u00b8\u0082\u00bb\u001b \u00fb\u00f1\u00dc5\u00b3\u001d\u00d8\u00d6[\u0081R\u0004~\u00ba\u00d7\u00924\u00f81\u00e0w\u00bc\u00119\u00e7\u00f9\u0018\u00ed\u0081\u00821\u001bv\u00b8m\u00e7\u00ef/4rp\u00f3\u00b7\u00d9n\u008e\u0086!+\u0088\u00cc\u0088\u0011\u001c\u00ba\u009b\u0002\u00c6K\u0084\u001d\u00bd\u00b2\u00e13\u0011Y3C\u00ce\u00f9\u00fdW\tL\u00a4\u0084\u00b6\u00d6KbN\n&~\u00e3v[\u001dT\u0098b\u00cb\u00a6F\u0016|\u0016\u0007\u00fe\u009e;\u00ddS\u00c0\u001f\u00acy=\tA\u00ce\u00a0C\u0017r\u001e\u00feM\u009cc\u00a6\u008ev\u000e\u009f\\6!\u00fbZ\u00aa\u00f9\u00a4\u0089\u00e7\u008d\u0099\u00fc8:\u00b5cZS\u00b4\u00e7\u00c1\u00afX+\u0007\u0004\u00b7\u008d7]\u0094_\u00e3\u00fb\u00eb\u001a-\u00db\u008b/\u00a9\u00d8\u00ca!\u00c9\u008c7t\u00da\u00cb%ax\u00f7@|\u00a4\tD:\u00c5\u007f\u009f\u00fao\u0001\u00bf&\u00c21<\u0001n\u009e\u0016\u0000|\u00d2\u00bfqx\u00dd\u00fc\u00a8\u00ceB\u00efV?3\u0086{\u00d3\u00a9\u00a2\u00a7d\u00a8\u00ef&\u0010J)E\u007f\u008fLAX\u008e\u0006\u00b0\u00d0\u0019\u00a6QJ\u0099\u008e\u00cdI\u00d8\u00fa^?@F\u0015\u00ba\u00ac1\u00d3\u00175\u00a4\u00b6F0J\u00b41Q#\u00df\u009e\u00e0i\u00e6\u0084z\u00a2\u00da\u00b7SqTas\u0085g$\u00a1\u00bc\u0099\u000b\u008a\u00ec\u00d6\nN\u007f\u00b1\u00eb\u00f9\u0089<(\u0017Xo\u00df\u0097\u0004\u0016\u009f\u008a\u0084\u00feB&\u00e8\u00ff\u0016\u00fb\u00fa\u008e2qlR\u00d3y+\u00a8\u00b0\u008bc\u00ad&Uv\u0099(\u00e0HV\u00b0\u00b53D\u0091\u0083a\f'\u008ailx\u00c6\u00ecB\u0096\u00ad\u0012\u0086\u00ce\u009dq\u00a1L\u00b8\u00f9\u00ae\u009aD\u0093)E\u00c0\r\u001a\u00fd\u00e8Ew\u0095\u00a5'\u00ce\u0099\u00de=\u0012Q\u00d4\f\u00a5\u0080?\u00cc\u009d\u0091\u00cd'\u00047\u0004\u00dd\u00f1\f\u0010\u008b".length();
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
                    var4_3 = "\u0085\u00b0\u0013\u00b01W\u00e3\u009c\u00d8\u0096\u00b6\u00c8R$/\u0016";
                    var5_4 = "\u0085\u00b0\u0013\u00b01W\u00e3\u009c\u00d8\u0096\u00b6\u00c8R$/\u0016".length();
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
        gs.b = var6_1;
        gs.i = new Integer[160];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53E2;
        if (i[n2] == null) {
            gs.i[n2] = (int)(b[n2] ^ l);
        }
        return i[n2];
    }
}
