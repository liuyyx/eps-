/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.ColorTargetState
 *  com.mojang.blaze3d.pipeline.DepthStencilState
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.CompareOp
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.math.Axis
 *  net.minecraft.client.renderer.GameRenderer
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.LivingEntity
 *  org.joml.Matrix4f
 */
package com.github.epsilon;

import com.github.epsilon.Xi;
import com.github.epsilon.hi;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.LivingEntity;
import org.joml.Matrix4f;

public class lN {
    private static final Identifier U;
    private static final RenderPipeline x;

    public static /* bridge */ /* synthetic */ CallSite H(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    private static Color p(float f, double d, Object object, Object object2, double d2) {
        float f2 = (float)hi.a("G", (double)((double)f * Math.PI * 2.0 + d2 * d), (long)920621527924433365L);
        f2 = (f2 + 1.0f) / 2.0f;
        return hi.a("G", (Object)((Color)object), (Object)((Color)object2), (float)f2, (long)1040237525350741921L);
    }

    public static void v(Object[] objectArray) {
        PoseStack poseStack = (PoseStack)objectArray[0];
        LivingEntity livingEntity = (LivingEntity)objectArray[1];
        double d = (Double)objectArray[2];
        double d2 = (Double)objectArray[3];
        double d3 = (Double)objectArray[4];
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        double d4 = (double)hi.a("G", (long)1081758078654608138L) * 1.0E-9;
        float f = (float)(-(d4 * d2 * 60.0 % 360.0));
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)948190297084541702L), (long)617137790396262668L), (long)888968013430088728L);
        CallSite callSite2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
        reference var16_12 = hi.a("G", (double)((double)callSite2), (double)hi.a("\u00e9", (Object)livingEntity, (long)1024587687775419334L), (double)hi.a("\u00a5", (Object)livingEntity, (long)907047849049535430L), (long)634868052102297765L) - hi.a("\u00e9", (Object)callSite, (long)1300412705618690751L);
        reference var18_13 = hi.a("G", (double)((double)callSite2), (double)hi.a("\u00e9", (Object)livingEntity, (long)695040648270641891L), (double)hi.a("\u00a5", (Object)livingEntity, (long)1235747372608796815L), (long)634868052102297765L) - hi.a("\u00e9", (Object)callSite, (long)1294071886475894755L);
        reference var20_14 = hi.a("G", (double)((double)callSite2), (double)hi.a("\u00e9", (Object)livingEntity, (long)798780023308919439L), (double)hi.a("\u00a5", (Object)livingEntity, (long)619188567151638994L), (long)634868052102297765L) - hi.a("\u00e9", (Object)callSite, (long)1282612456329596420L);
        float f2 = (float)d * 0.5f;
        hi.a("\u00a5", (Object)poseStack, (long)1071718823859296201L);
        hi.a("\u00a5", (Object)poseStack, (double)var16_12, (double)(var18_13 + (double)hi.a("\u00a5", (Object)livingEntity, (long)393528877412216214L) * 0.5), (double)var20_14, (long)620263633503696695L);
        CallSite callSite3 = lN.H("WoL1pP7lqVitmZWE", mainCamera(), (GameRenderer)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)968554650154943535L));
        hi.a("\u00a5", (Object)poseStack, (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1127026054009023181L), (float)(-hi.a("\u00a5", (Object)callSite3, (long)1213801091369692128L)), (long)1092969023430285433L), (long)1164958652490596778L);
        hi.a("\u00a5", (Object)poseStack, (Object)lN.H("WoL1pP7lqVitmZWE", rotationDegrees(float ), (Axis)hi.a("j", (long)477439033901842617L), (float)hi.a("\u00a5", (Object)callSite3, (long)710018603518281346L)), (long)1164958652490596778L);
        hi.a("\u00a5", (Object)poseStack, (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1210199949807736021L), (float)f, (long)1092969023430285433L), (long)1164958652490596778L);
        CallSite callSite4 = hi.a("G", (Object)hi.a("j", (long)498500472229397478L), (Object)hi.a("j", (long)611860668176981478L), (long)1025704845774671219L);
        CallSite callSite5 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)poseStack, (long)970332505425455960L), (long)795986877611440477L);
        CallSite callSite6 = hi.a("G", (float)0.0f, (double)d3, (Object)color, (Object)color2, (double)d4, (long)612181017191192445L);
        CallSite callSite7 = hi.a("G", (float)0.25f, (double)d3, (Object)color, (Object)color2, (double)d4, (long)612181017191192445L);
        CallSite callSite8 = lN.H("WoL1pP7lqVitmZWE", p(float double java.lang.Object java.lang.Object double ), (float)0.5f, (double)d3, (Object)color, (Object)color2, (double)d4);
        CallSite callSite9 = hi.a("G", (float)0.75f, (double)d3, (Object)color, (Object)color2, (double)d4, (long)612181017191192445L);
        lN.H("WoL1pP7lqVitmZWE", J(org.joml.Matrix4f float float float float float int ), (Xi)((Object)callSite4), (Matrix4f)callSite5, (float)(-f2), (float)(-f2), (float)0.0f, (float)0.0f, (float)0.0f, (int)hi.a("\u00a5", (Object)callSite6, (long)921162811333111485L));
        hi.a("\u00a5", (Object)callSite4, (Object)callSite5, (float)(-f2), (float)f2, (float)0.0f, (float)0.0f, (float)1.0f, (int)hi.a("\u00a5", (Object)callSite7, (long)921162811333111485L), (long)684582632005063774L);
        hi.a("\u00a5", (Object)callSite4, (Object)callSite5, (float)f2, (float)f2, (float)0.0f, (float)1.0f, (float)1.0f, (int)hi.a("\u00a5", (Object)callSite8, (long)921162811333111485L), (long)684582632005063774L);
        hi.a("\u00a5", (Object)callSite4, (Object)callSite5, (float)f2, (float)(-f2), (float)0.0f, (float)1.0f, (float)0.0f, (int)hi.a("\u00a5", (Object)callSite9, (long)921162811333111485L), (long)684582632005063774L);
        hi.a("\u00a5", (Object)callSite4, (long)912586339289712984L);
        hi.a("\u00a5", (Object)poseStack, (long)1236740458305185158L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u001f4s\u000bd1X\u0018~{\u001ec7T\b=n\f>7\\\u00196n\u000b?3S\f\u001c\u001b8{\u001a}*S\u000e~n\u000fb*Q\u0004?T\u000bp1Z\u000e%T\u0016r,S";
            var5_3 = "\u001f4s\u000bd1X\u0018~{\u001ec7T\b=n\f>7\\\u00196n\u000b?3S\f\u001c\u001b8{\u001a}*S\u000e~n\u000fb*Q\u0004?T\u000bp1Z\u000e%T\u0016r,S".length();
            var2_4 = 29;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 102;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 13;
                            break;
                        }
                        case 1: {
                            v11 = 55;
                            break;
                        }
                        case 2: {
                            v11 = 109;
                            break;
                        }
                        case 3: {
                            v11 = 25;
                            break;
                        }
                        case 4: {
                            v11 = 119;
                            break;
                        }
                        case 5: {
                            v11 = 37;
                            break;
                        }
                        default: {
                            v11 = 91;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        lN.U = hi.a("G", var0[0], (long)1218614314410685839L);
        lN.x = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new RenderPipeline.Snippet[]{hi.a("j", (long)644676233272493604L)}, (long)731833861383729593L), (Object)var0[1], (long)774963328677840218L), (Object)new ColorTargetState((BlendFunction)hi.a("j", (long)852805897089623173L)), (long)725018889764347121L), (Object)new DepthStencilState((CompareOp)hi.a("j", (long)984351313890709619L), false), (long)685240794813097508L), (boolean)false, (long)801787097910002170L), (long)974970866675039906L);
    }
}
