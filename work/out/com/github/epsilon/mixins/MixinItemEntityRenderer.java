/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.math.Axis
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.entity.ItemEntityRenderer
 *  net.minecraft.client.renderer.entity.state.ItemEntityRenderState
 *  net.minecraft.client.renderer.state.level.CameraRenderState
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.item.ItemEntity
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.S;
import com.github.epsilon.Xr;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.ItemEntityRenderer;
import net.minecraft.client.renderer.entity.state.ItemEntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ItemEntityRenderer.class})
public abstract class MixinItemEntityRenderer {
    @Inject(method={"extractRenderState(Lnet/minecraft/world/entity/item/ItemEntity;Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;F)V"}, at={@At(value="RETURN")})
    private void captureItemEntity(ItemEntity itemEntity, ItemEntityRenderState itemEntityRenderState, float f, CallbackInfo callbackInfo) {
        ((Xr)itemEntityRenderState).epsilon$setEntity((Entity)itemEntity);
    }

    @Inject(method={"submit(Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V"}, at={@At(value="INVOKE", target="Lcom/mojang/blaze3d/vertex/PoseStack;pushPose()V", shift=At.Shift.AFTER)})
    private void applyItemPhysics(ItemEntityRenderState itemEntityRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState, CallbackInfo callbackInfo) {
        Entity entity;
        if (S.J.N() && (entity = ((Xr)itemEntityRenderState).epsilon$getEntity()) instanceof ItemEntity) {
            ItemEntity itemEntity = (ItemEntity)entity;
            float f = (float)(-itemEntityRenderState.item.getModelBoundingBox().minY) + 0.0625f;
            poseStack.translate(0.0f, f, 0.0f);
            poseStack.mulPose((Quaternionfc)Axis.XP.rotationDegrees(90.0f));
            poseStack.mulPose((Quaternionfc)Axis.ZP.rotationDegrees(itemEntity.getYRot()));
            if (!itemEntity.onGround()) {
                poseStack.mulPose((Quaternionfc)Axis.XP.rotationDegrees(itemEntityRenderState.ageInTicks * 8.0f));
            }
        }
    }

    @Redirect(method={"submit(Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V"}, at=@At(value="INVOKE", target="Lcom/mojang/blaze3d/vertex/PoseStack;translate(FFF)V"))
    private void suppressVanillaBob(PoseStack poseStack, float f, float f2, float f3) {
        if (!S.J.N()) {
            poseStack.translate(f, f2, f3);
        }
    }

    @Redirect(method={"submit(Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V"}, at=@At(value="INVOKE", target="Lcom/mojang/blaze3d/vertex/PoseStack;mulPose(Lorg/joml/Quaternionfc;)V"))
    private void suppressVanillaSpin(PoseStack poseStack, Quaternionfc quaternionfc) {
        if (!S.J.N()) {
            poseStack.mulPose(quaternionfc);
        }
    }
}
