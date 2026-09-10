/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.Camera
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Quaternionfc
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.Xi;
import com.github.epsilon.hi;
import com.github.epsilon.u8;
import com.mojang.blaze3d.vertex.PoseStack;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.client.Camera;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionfc;

class lW {
    protected int O;
    protected float p;
    protected int k;
    protected float B;
    protected float P;
    protected float t;
    protected float f;
    protected float A;
    final u8 l;
    protected float X;
    protected float U;
    protected float g;
    private static final long[] a;
    private static final Integer[] b;
    private static final long e;

    protected void z(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        Xi xi = (Xi)objectArray[1];
        Vec3 vec3 = (Vec3)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)lW.Q("wbDHYh2QYJNe1zbQ", S(com.github.epsilon.u8 ), (u8)((Object)hi.a("\u00e9", (Object)this, (long)877644815450331971L))), (long)968554650154943535L), (long)529286173586661242L);
        hi.a("\u00a5", (Object)poseStack, (long)1071718823859296201L);
        hi.a("\u00a5", (Object)poseStack, (double)hi.a("\u00e9", (Object)vec3, (long)1300412705618690751L), (double)hi.a("\u00e9", (Object)vec3, (long)1294071886475894755L), (double)hi.a("\u00e9", (Object)vec3, (long)1282612456329596420L), (long)620263633503696695L);
        hi.a("\u00a5", (Object)poseStack, (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1127026054009023181L), (float)(-hi.a("\u00a5", (Object)callSite, (long)1213801091369692128L)), (long)1092969023430285433L), (long)1164958652490596778L);
        lW.Q("wbDHYh2QYJNe1zbQ", mulPose(org.joml.Quaternionfc ), (PoseStack)poseStack, (Quaternionfc)hi.a("\u00a5", (Object)hi.a("j", (long)477439033901842617L), (float)lW.Q("wbDHYh2QYJNe1zbQ", xRot(), (Camera)callSite), (long)1092969023430285433L));
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)poseStack, (long)970332505425455960L), (long)795986877611440477L);
        CallSite callSite3 = hi.a("\u00a5", (Object)color, (long)921162811333111485L);
        hi.a("\u00a5", (Object)xi, (Object)callSite2, (float)0.0f, (float)(-f), (float)0.0f, (float)0.0f, (float)1.0f, (int)callSite3, (long)684582632005063774L);
        hi.a("\u00a5", (Object)xi, (Object)callSite2, (float)(-f), (float)(-f), (float)0.0f, (float)1.0f, (float)1.0f, (int)callSite3, (long)684582632005063774L);
        hi.a("\u00a5", (Object)xi, (Object)callSite2, (float)(-f), (float)0.0f, (float)0.0f, (float)1.0f, (float)0.0f, (int)callSite3, (long)684582632005063774L);
        hi.a("\u00a5", (Object)xi, (Object)callSite2, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (int)callSite3, (long)684582632005063774L);
        hi.a("\u00a5", (Object)poseStack, (long)1236740458305185158L);
    }

    private lW(u8 u82, float f, float f2, float f3, float f4, float f5, float f6) {
        u8 u83 = u82;
        Objects.requireNonNull(u83);
        this.l = u83;
        hi.a("\u00f2", (Object)this, (float)f, (long)1141429539856857333L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)644201099244004518L);
        hi.a("\u00f2", (Object)this, (float)f3, (long)415024438651040127L);
        hi.a("\u00f2", (Object)this, (float)f, (long)1114370634898441364L);
        hi.a("\u00f2", (Object)this, (float)f2, (long)1214884810806366594L);
        hi.a("\u00f2", (Object)this, (float)f3, (long)638021415577947262L);
        hi.a("\u00f2", (Object)this, (float)f4, (long)1015420793800209769L);
        hi.a("\u00f2", (Object)this, (float)f5, (long)962709178578300432L);
        hi.a("\u00f2", (Object)this, (float)f6, (long)943698945869655336L);
        hi.a("\u00f2", (Object)this, (int)((int)hi.a("G", (float)100.0f, (float)300.0f, (long)869562683730491792L)), (long)1180840049333207886L);
        hi.a("\u00f2", (Object)this, (int)hi.a("\u00e9", (Object)this, (long)1180840049333207886L), (long)1302392262134783894L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean O() {
        block20: {
            var1_1 = Dl.S();
            var2_2 /* !! */  = hi.a("G", (int)lW.a(4631, 8716751236642931142L), (int)lW.a(8826, 5496431211432292771L), (long)834203424483934088L) / 2 * lW.a(31804, 4899161140409298930L) + lW.a(11015, 5439703214814738643L);
            if (var1_1) break block20;
lbl4:
            // 2 sources

            while (true) {
                cfr_temp_0 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)877644815450331971L)}, (long)732713066324004591L), (long)1285467445182668332L), (double)((double)hi.a("\u00e9", (Object)this, (long)1141429539856857333L)), (double)((double)hi.a("\u00e9", (Object)this, (long)644201099244004518L)), (double)((double)hi.a("\u00e9", (Object)this, (long)415024438651040127L)), (long)1299228347982494967L) - 4096.0;
                v0 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                if (!var1_1) ** GOTO lbl79
                if (v0 /* !! */  <= 0) ** GOTO lbl78
                ** GOTO lbl80
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                v1 = this;
                hi.a("\u00f2", (Object)v1, (int)(hi.a("\u00e9", (Object)v1, (long)1180840049333207886L) - lW.a(32254, 1197948432544460333L)), (long)1180840049333207886L);
                if (var1_1) ** GOTO lbl82
lbl14:
                // 2 sources

                while (true) {
                    v2 = this;
                    hi.a("\u00f2", (Object)v2, (int)(hi.a("\u00e9", (Object)v2, (long)1180840049333207886L) - true), (long)1180840049333207886L);
                    if (var1_1) ** GOTO lbl84
lbl18:
                    // 2 sources

                    while (true) {
                        v3 /* !! */  = hi.a("\u00e9", (Object)this, (long)1180840049333207886L);
                        if (!var1_1) ** GOTO lbl87
                        if (v3 /* !! */  >= 0) ** GOTO lbl86
                        ** GOTO lbl88
                        break;
                    }
                    break;
                }
                break;
            }
lbl23:
            // 1 sources

            return true;
lbl25:
            // 1 sources

            while (true) {
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)1141429539856857333L), (long)1114370634898441364L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)644201099244004518L), (long)1214884810806366594L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)415024438651040127L), (long)638021415577947262L);
                v4 = this;
                hi.a("\u00f2", (Object)v4, (float)(hi.a("\u00e9", (Object)v4, (long)1141429539856857333L) + hi.a("\u00e9", (Object)this, (long)1015420793800209769L)), (long)1141429539856857333L);
                v5 = this;
                hi.a("\u00f2", (Object)v5, (float)(hi.a("\u00e9", (Object)v5, (long)644201099244004518L) + hi.a("\u00e9", (Object)this, (long)962709178578300432L)), (long)644201099244004518L);
                v6 = this;
                hi.a("\u00f2", (Object)v6, (float)(hi.a("\u00e9", (Object)v6, (long)415024438651040127L) + hi.a("\u00e9", (Object)this, (long)943698945869655336L)), (long)415024438651040127L);
                v7 = this;
                hi.a("\u00f2", (Object)v7, (float)(hi.a("\u00e9", (Object)v7, (long)1015420793800209769L) * 0.9f), (long)1015420793800209769L);
                v8 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)877644815450331971L), (long)1152746431707548119L), (Object)hi.a("j", (long)1073641351692122726L), (long)511460060498514638L);
                if (!var1_1) ** GOTO lbl91
                if (v8 == false) ** GOTO lbl90
                ** GOTO lbl92
                break;
            }
lbl41:
            // 1 sources

            while (true) {
                v9 = this;
                hi.a("\u00f2", (Object)v9, (float)(hi.a("\u00e9", (Object)v9, (long)962709178578300432L) * 0.9f), (long)962709178578300432L);
                if (!var1_1) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        v10 = this;
                        hi.a("\u00f2", (Object)v10, (float)(hi.a("\u00e9", (Object)v10, (long)943698945869655336L) * 0.9f), (long)943698945869655336L);
                        v11 = this;
                        hi.a("\u00f2", (Object)v11, (float)(hi.a("\u00e9", (Object)v11, (long)962709178578300432L) - 0.001f), (long)962709178578300432L);
                        return false;
                    }
                }
                ** GOTO lbl94
                break;
            }
        }
        while (true) {
            switch (var2_2 /* !! */ ) {
                default: {
                    ** continue;
                }
                case -587350530: {
                    ** GOTO lbl10
                }
                case -587350533: {
                    ** continue;
                }
                case -587350526: {
                    ** continue;
                }
                case -587350531: {
                    ** continue;
                }
                case -587350532: {
                    ** continue;
                }
                case -587350527: {
                    ** continue;
                }
                case -587350529: {
                    ** continue;
                }
                case -587350528: 
            }
            hi.a("G", (long)lW.e, (long)542844126275779296L);
            hi.a("G", (int)1, (long)1007835440002559292L);
            if (!var1_1) ** break;
            ** continue;
lbl78:
            // 2 sources

            v0 /* !! */  = var2_2 /* !! */  = hi.a("G", (int)lW.a(18528, 6081410965070404484L), (int)lW.a(30303, 2017901525625300413L), (long)834203424483934088L) + lW.a(2978, 6374354749478213703L);
lbl79:
            // 2 sources

            if (var1_1) continue;
lbl80:
            // 2 sources

            var2_2 /* !! */  = (CallSite)(lW.a(20086, 355124610531351998L) + lW.a(21667, 2883538311434946405L) - lW.a(5865, 4283144816011248953L));
            if (var1_1) continue;
lbl82:
            // 2 sources

            var2_2 /* !! */  = (CallSite)(hi.a("G", (int)lW.Q("wbDHYh2QYJNe1zbQ", max(int int ), (int)lW.a(8353, 6144036687041442631L), (int)lW.a(12572, 7904803816548213447L)), (int)lW.a(13247, 7286507911089987679L), (long)834203424483934088L) ^ lW.a(21803, 4045184312044275454L));
            if (var1_1) continue;
lbl84:
            // 2 sources

            var2_2 /* !! */  = (CallSite)(hi.a("G", (int)hi.a("G", (int)lW.a(23798, 3300566653233516330L), (int)lW.a(11565, 283536917007646440L), (long)834203424483934088L), (int)lW.a(6654, 911282596254386748L), (long)834203424483934088L) ^ lW.a(14214, 3248945675893482603L));
            if (var1_1) continue;
lbl86:
            // 2 sources

            v3 /* !! */  = var2_2 /* !! */  = (CallSite)(hi.a("G", (int)(lW.a(20264, 1532412163991231742L) / 4), (int)lW.a(16325, 3177617902802447368L), (long)834203424483934088L) + lW.a(22778, 2840041284421438261L) ^ lW.a(15379, 2299924496689180660L));
lbl87:
            // 2 sources

            if (var1_1) continue;
lbl88:
            // 2 sources

            var2_2 /* !! */  = (CallSite)((lW.a(15377, 4734925049734311893L) - lW.a(8622, 8809501081839121011L) ^ lW.a(9, 3863460692209538006L)) * lW.a(17910, 1480215793489499669L) + lW.a(14316, 6295787061255054368L));
            if (var1_1) continue;
lbl90:
            // 2 sources

            v8 = var2_2 /* !! */  = hi.a("G", (int)((lW.a(11190, 7215733013031925878L) ^ lW.a(7744, 1503061717930806686L)) * lW.a(12279, 2147381726035393588L)), (int)lW.a(6092, 595864088751899659L), (long)834203424483934088L) + lW.a(32214, 7759509297608060420L);
lbl91:
            // 2 sources

            if (var1_1) continue;
lbl92:
            // 2 sources

            var2_2 /* !! */  = (CallSite)(lW.a(14449, 1983939030829018000L) + lW.a(22310, 2203948804183442671L) - lW.a(16967, 4841050824791085446L));
            if (var1_1) continue;
lbl94:
            // 2 sources

            var2_2 /* !! */  = hi.a("G", (int)((lW.a(32529, 9177964248148372698L) ^ lW.a(11526, 4229077534668832460L)) * lW.a(16731, 4174273369725751939L)), (int)lW.a(26706, 2719987380899216261L), (long)834203424483934088L) + lW.a(14913, 6989114603602258331L);
        }
    }

    public static /* bridge */ /* synthetic */ CallSite Q(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public void f(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        Xi xi = (Xi)objectArray[1];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (int)(255.0f * ((float)hi.a("\u00e9", (Object)this, (long)1180840049333207886L) / (float)hi.a("\u00e9", (Object)this, (long)1302392262134783894L)));
        objectArray2[0] = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)877644815450331971L), (Object)new Object[]{(int)(hi.a("\u00e9", (Object)this, (long)1180840049333207886L) * 2)}, (long)1109660635574303213L);
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)877644815450331971L), (Object)objectArray2, (long)1170238699884798924L);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = callSite;
        objectArray3[3] = Float.valueOf((float)hi.a("\u00a5", (Object)((Double)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)877644815450331971L), (long)423519434042745708L), (long)789438897355831922L))), (long)371266768739483732L));
        objectArray3[2] = hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)862577473837998011L);
        objectArray3[1] = xi;
        objectArray3[0] = poseStack;
        hi.a("\u00a5", (Object)this, (Object)objectArray3, (long)686296006556132141L);
    }

    protected Vec3 q(Object[] objectArray) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)877644815450331971L)}, (long)1317361365126625457L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)877644815450331971L)}, (long)493482591839819106L), (long)968554650154943535L), (long)529286173586661242L), (long)888968013430088728L);
        double d = (double)hi.a("G", (float)callSite, (float)hi.a("\u00e9", (Object)this, (long)1114370634898441364L), (float)hi.a("\u00e9", (Object)this, (long)1141429539856857333L), (long)899322658622726380L) - hi.a("\u00e9", (Object)callSite2, (long)1300412705618690751L);
        double d2 = (double)hi.a("G", (float)callSite, (float)hi.a("\u00e9", (Object)this, (long)1214884810806366594L), (float)hi.a("\u00e9", (Object)this, (long)644201099244004518L), (long)899322658622726380L) - hi.a("\u00e9", (Object)callSite2, (long)1294071886475894755L);
        double d3 = (double)hi.a("G", (float)callSite, (float)hi.a("\u00e9", (Object)this, (long)638021415577947262L), (float)hi.a("\u00e9", (Object)this, (long)415024438651040127L), (long)899322658622726380L) - hi.a("\u00e9", (Object)callSite2, (long)1282612456329596420L);
        return new Vec3(d, d2, d3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 927309485719244420L;
                    var8_1 = new long[41];
                    var5_2 = 0;
                    var6_3 = "04\u00e1\u00a1\u0007A\u0089wk\u009f\u0007\u00c1\u00b8\u00b7-f0\u0017\u009a\u0011cf\u00fdx\u0093k\u0000\u00c0\u00d1\u00ca\u00ae\u0006\u00e5\u001a\u0002\u00ef\u00b4\u00f1\u00aa\u00e7|z~\u00ec\u0019\u00a1X\u0091\u00dd\u00fa\u00d1Y\u0094\u00ff-S\u0015\u00cf\u00b8E\u001e\u00fd\u0090m\u0000\u00d1\u00af\u00f7\u0004(&\u001f\u008a\u00bc\u00a0\u00f0.\u00da\u00e5\u00c7\u0099\u0098\u00cfM\u00e9\u00f2\u00b8G\u0005\u00c0\u00d7\"0gG\u00b3\u00d6m\u00c3\u00e3\u009f\b(`>\u00e3\u0090\u00d2\u00cc\u008f\u0005\u0012r\u00c2\f!\u0096l\u008c=<\u00de\u00f7_\u00f0\u00be\t\u00c7\u00f1\u009e\u0007\u00f9\u00bf\u00dc\u00e2\u00ad_\u00c0DMql\u00ae\u00de\u001a\u00d0og\u0093\u0014\u0002\u00f6\u00d0\u009b\u0091enm\u00b4S~a2,\u00b7cR8,v M\u00eaxK\u00ac\u00001\u00cb\u00b1\u00f0) \u00a1\u00f5\u00df\u00e2\u0012 \u00a3\u00a6\u0088\u00cc \u00f1\u00eb%C\u00e7y\u0096\t7\u0086)z\u00dd~\u00a5\u00bd\u00c8\u00d6\u00f7\u00d6\u00d4\u00ed\u009f\u00bf7\r\u00b9\u00fa:\u0095\u009d@Sb\u0014\u00d4\u000f\u0083\u001b\u00bf\u00f5\u00f1\u0090\u009eC\u00e4\u00f6\u00b7\u00a8\u00aau0\u0095X\u00b7\u00d4A\u00e9\u00a9\u00d2a\u0017\u00b5\u00cd\u0085T\u00bc\u008b\u00f6o\u0091>*b\u0082\u0095>\b\u009c\u00ed\u00c7\u00cc\u00bf7\u00fb\f\u008e\u009aJ\u0091\u0018\u0013\u00a1\u0013\u00d4\u00eb'\u00c7\u00c1Q4\u00cf$\u0007\u00ae3\u009c\u00d7:\u000e\u00f1}\u00c5\u00de\u00e3\u0018\u0006\u0016";
                    var7_4 = "04\u00e1\u00a1\u0007A\u0089wk\u009f\u0007\u00c1\u00b8\u00b7-f0\u0017\u009a\u0011cf\u00fdx\u0093k\u0000\u00c0\u00d1\u00ca\u00ae\u0006\u00e5\u001a\u0002\u00ef\u00b4\u00f1\u00aa\u00e7|z~\u00ec\u0019\u00a1X\u0091\u00dd\u00fa\u00d1Y\u0094\u00ff-S\u0015\u00cf\u00b8E\u001e\u00fd\u0090m\u0000\u00d1\u00af\u00f7\u0004(&\u001f\u008a\u00bc\u00a0\u00f0.\u00da\u00e5\u00c7\u0099\u0098\u00cfM\u00e9\u00f2\u00b8G\u0005\u00c0\u00d7\"0gG\u00b3\u00d6m\u00c3\u00e3\u009f\b(`>\u00e3\u0090\u00d2\u00cc\u008f\u0005\u0012r\u00c2\f!\u0096l\u008c=<\u00de\u00f7_\u00f0\u00be\t\u00c7\u00f1\u009e\u0007\u00f9\u00bf\u00dc\u00e2\u00ad_\u00c0DMql\u00ae\u00de\u001a\u00d0og\u0093\u0014\u0002\u00f6\u00d0\u009b\u0091enm\u00b4S~a2,\u00b7cR8,v M\u00eaxK\u00ac\u00001\u00cb\u00b1\u00f0) \u00a1\u00f5\u00df\u00e2\u0012 \u00a3\u00a6\u0088\u00cc \u00f1\u00eb%C\u00e7y\u0096\t7\u0086)z\u00dd~\u00a5\u00bd\u00c8\u00d6\u00f7\u00d6\u00d4\u00ed\u009f\u00bf7\r\u00b9\u00fa:\u0095\u009d@Sb\u0014\u00d4\u000f\u0083\u001b\u00bf\u00f5\u00f1\u0090\u009eC\u00e4\u00f6\u00b7\u00a8\u00aau0\u0095X\u00b7\u00d4A\u00e9\u00a9\u00d2a\u0017\u00b5\u00cd\u0085T\u00bc\u008b\u00f6o\u0091>*b\u0082\u0095>\b\u009c\u00ed\u00c7\u00cc\u00bf7\u00fb\f\u008e\u009aJ\u0091\u0018\u0013\u00a1\u0013\u00d4\u00eb'\u00c7\u00c1Q4\u00cf$\u0007\u00ae3\u009c\u00d7:\u000e\u00f1}\u00c5\u00de\u00e3\u0018\u0006\u0016".length();
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
                        var6_3 = "\u0002\u0086\u00b7'\u009e\u001e6v\u00c2\u0016\u0019\u008cG\u0091\u00008";
                        var7_4 = "\u0002\u0086\u00b7'\u009e\u001e6v\u00c2\u0016\u0019\u008cG\u0091\u00008".length();
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
            lW.a = var8_1;
            lW.b = new Integer[41];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 255642981002331612L;
        ** while (true)
        lW.e = -255642981002331611L ^ var0_7;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x13C5;
        if (b[n2] == null) {
            lW.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
