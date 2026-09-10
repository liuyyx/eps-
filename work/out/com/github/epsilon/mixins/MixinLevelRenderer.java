/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.framegraph.FrameGraphBuilder
 *  com.mojang.blaze3d.framegraph.FramePass
 *  com.mojang.blaze3d.pipeline.RenderTarget
 *  com.mojang.blaze3d.resource.GraphicsResourceAllocator
 *  com.mojang.blaze3d.resource.ResourceHandle
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.DeltaTracker
 *  net.minecraft.client.renderer.LevelRenderer
 *  net.minecraft.client.renderer.LevelTargetBundle
 *  net.minecraft.client.renderer.PostChain
 *  net.minecraft.client.renderer.PostChain$TargetBundle
 *  net.minecraft.client.renderer.state.level.CameraRenderState
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.d9;
import com.github.epsilon.e5;
import com.github.epsilon.eC;
import com.github.epsilon.u;
import com.github.epsilon.ua;
import com.github.epsilon.vy;
import com.github.epsilon.yK;
import com.github.epsilon.yZ;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.framegraph.FrameGraphBuilder;
import com.mojang.blaze3d.framegraph.FramePass;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.resource.GraphicsResourceAllocator;
import com.mojang.blaze3d.resource.ResourceHandle;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.LevelTargetBundle;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={LevelRenderer.class})
public class MixinLevelRenderer {
    @Shadow
    @Final
    private LevelTargetBundle targets;

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void onPostRenderLevel(GraphicsResourceAllocator graphicsResourceAllocator, DeltaTracker deltaTracker, boolean bl, CameraRenderState cameraRenderState, Matrix4fc matrix4fc, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl2, CallbackInfo callbackInfo) {
        Object[] objectArray = new Object[2];
        objectArray[1] = matrix4fc;
        objectArray[0] = cameraRenderState;
        ua.H.z(objectArray);
        PoseStack poseStack = new PoseStack();
        poseStack.mulPose(matrix4fc);
        vy.j.d(new Object[]{new d9(poseStack)});
        vy.j.d(new Object[]{new yZ()});
    }

    @Inject(method={"addSkyPass(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"}, at={@At(value="RETURN")})
    private void addCustomSkyPass(FrameGraphBuilder frameGraphBuilder, CameraRenderState cameraRenderState, GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
        if (e5.F.N()) {
            ResourceHandle resourceHandle;
            FramePass framePass = frameGraphBuilder.addPass("epsilon_custom_sky");
            this.targets.main = resourceHandle = framePass.readsAndWrites(this.targets.main);
            framePass.executes(() -> MixinLevelRenderer.lambda$addCustomSkyPass$0(resourceHandle));
        }
    }

    @WrapOperation(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/PostChain;addToFrame(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;IILnet/minecraft/client/renderer/PostChain$TargetBundle;)V", ordinal=0)})
    private void replaceEntityOutlineShader(PostChain postChain, FrameGraphBuilder frameGraphBuilder, int n, int n2, PostChain.TargetBundle targetBundle, Operation<Void> operation) {
        if (!u.H.N()) {
            operation.call(new Object[]{postChain, frameGraphBuilder, n, n2, targetBundle});
        }
    }

    @ModifyExpressionValue(method={"addSkyPass(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", "addSkyPass(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4fc;)V"}, at={@At(value="FIELD", target="Lnet/minecraft/client/renderer/state/level/CameraEntityRenderState;doesMobEffectBlockSky:Z", opcode=180)}, require=0)
    private boolean modifyMobEffectBlocksSky(boolean bl) {
        if (eC.T.N() && (((Boolean)eC.T.u.z()).booleanValue() || ((Boolean)eC.T.o.z()).booleanValue())) {
            return false;
        }
        return bl;
    }

    private static void lambda$addCustomSkyPass$0(ResourceHandle resourceHandle) {
        Object[] objectArray = new Object[2];
        objectArray[1] = e5.F;
        objectArray[0] = (RenderTarget)resourceHandle.get();
        yK.b.q(objectArray);
    }
}
