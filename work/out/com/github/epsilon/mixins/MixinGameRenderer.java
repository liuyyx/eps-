/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.DeltaTracker
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GameRenderer
 *  net.minecraft.client.renderer.GlobalSettingsUniform
 *  net.minecraft.client.renderer.ItemInHandRenderer
 *  net.minecraft.client.renderer.SubmitNodeStorage
 *  net.minecraft.client.renderer.feature.FeatureRenderDispatcher
 *  net.minecraft.client.renderer.feature.FeatureRenderDispatcher$PreparedFrame
 *  net.minecraft.client.renderer.state.level.CameraRenderState
 *  net.minecraft.client.resources.model.ModelManager
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.W;
import com.github.epsilon.i;
import com.github.epsilon.u;
import com.github.epsilon.z2;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.GlobalSettingsUniform;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.feature.FeatureRenderDispatcher;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GameRenderer.class})
public class MixinGameRenderer {
    @Final
    @Shadow
    private Minecraft minecraft;
    @Final
    @Shadow
    private GlobalSettingsUniform globalSettingsUniform;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void initializeGlobalSettingsUniform(Minecraft minecraft, ItemInHandRenderer itemInHandRenderer, ModelManager modelManager, CallbackInfo callbackInfo) {
        this.globalSettingsUniform.update(minecraft.getWindow().getWidth(), minecraft.getWindow().getHeight(), 0.0, 0L, DeltaTracker.ZERO, 0, Vec3.ZERO, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WrapOperation(method={"renderItemInHand"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/feature/FeatureRenderDispatcher;renderAllFeatures(Lnet/minecraft/client/renderer/SubmitNodeStorage;)V")})
    private void renderHandFeaturesWithOutline(FeatureRenderDispatcher featureRenderDispatcher, SubmitNodeStorage submitNodeStorage, Operation<Void> operation) {
        block10: {
            if (u.H.N() && ((Boolean)u.H.W.z()).booleanValue()) {
                try (FeatureRenderDispatcher.PreparedFrame preparedFrame = featureRenderDispatcher.prepareFrame(submitNodeStorage);){
                    preparedFrame.executeSolid();
                    preparedFrame.executeTranslucent();
                    preparedFrame.executeOutline();
                    preparedFrame.executeTranslucentAfterTerrain();
                    preparedFrame.executeAlwaysOnTop();
                    break block10;
                }
                finally {
                    z2.a.h(new Object[0]);
                }
            }
            operation.call(new Object[]{featureRenderDispatcher, submitNodeStorage});
        }
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/LevelRenderer;doEntityOutline()V", shift=At.Shift.BEFORE)})
    private void processShadersOutline(DeltaTracker deltaTracker, boolean bl, CallbackInfo callbackInfo) {
        u u2 = u.H;
        if (u2.N()) {
            z2.a.u(this.minecraft.levelRenderer.entityOutlineTarget, u2.y);
            z2.a.p(new Object[]{this.minecraft.gameRenderer.mainRenderTarget()});
            z2.a.J(new Object[]{this.minecraft.gameRenderer.mainRenderTarget()});
        }
    }

    @Inject(method={"renderItemInHand"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderItemInHand(CameraRenderState cameraRenderState, float f, Matrix4fc matrix4fc, CallbackInfo callbackInfo) {
        if (!i.N.z(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"bobView"}, at={@At(value="INVOKE", target="Lcom/mojang/blaze3d/vertex/PoseStack;translate(FFF)V")})
    private void hookBobView(PoseStack poseStack, float f, float f2, float f3, Operation<Void> operation) {
        W w = W.h;
        if (!w.N() || !((Boolean)w.t.z()).booleanValue()) {
            operation.call(new Object[]{poseStack, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)});
        }
    }
}
