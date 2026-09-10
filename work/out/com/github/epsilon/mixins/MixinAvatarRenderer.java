/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.model.HumanoidModel$ArmPose
 *  net.minecraft.client.model.geom.ModelPart
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.entity.player.AvatarRenderer
 *  net.minecraft.client.renderer.entity.state.AvatarRenderState
 *  net.minecraft.client.renderer.rendertype.RenderType
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 *  net.minecraft.world.entity.Avatar
 *  net.minecraft.world.entity.HumanoidArm
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.e_;
import com.github.epsilon.u;
import com.github.epsilon.uj;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.player.AvatarRenderer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.entity.Avatar;
import net.minecraft.world.entity.HumanoidArm;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={AvatarRenderer.class})
public class MixinAvatarRenderer {
    @Inject(method={"extractRenderState(Lnet/minecraft/world/entity/Avatar;Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;F)V"}, at={@At(value="RETURN")})
    private void applyThirdPersonBlockingPose(Avatar avatar, AvatarRenderState avatarRenderState, float f, CallbackInfo callbackInfo) {
        e_ e_2 = e_.k;
        Object[] objectArray = new Object[2];
        objectArray[1] = HumanoidArm.RIGHT;
        objectArray[0] = avatar;
        if (e_2.y(objectArray)) {
            avatarRenderState.rightArmPose = HumanoidModel.ArmPose.BLOCK;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = HumanoidArm.LEFT;
        objectArray2[0] = avatar;
        if (e_2.y(objectArray2)) {
            avatarRenderState.leftArmPose = HumanoidModel.ArmPose.BLOCK;
        }
    }

    @ModifyExpressionValue(method={"extractFlightData"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/Avatar;getFallFlyingTicks()I")})
    private int spoofFallFlyingTicks(int n, Avatar avatar, AvatarRenderState avatarRenderState, float f) {
        if (uj.a.A(new Object[0]) && avatar == dD.d.player) {
            return 0;
        }
        return n;
    }

    @WrapOperation(method={"renderHand"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/SubmitNodeCollector;submitModelPart(Lnet/minecraft/client/model/geom/ModelPart;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IILnet/minecraft/client/renderer/texture/TextureAtlasSprite;)V")})
    private void applyShadersHandArmOutline(SubmitNodeCollector submitNodeCollector, ModelPart modelPart, PoseStack poseStack, RenderType renderType, int n, int n2, TextureAtlasSprite textureAtlasSprite, Operation<Void> operation) {
        u u2 = u.H;
        if (u2.N() && ((Boolean)u2.W.z()).booleanValue()) {
            submitNodeCollector.submitModelPart(modelPart, poseStack, renderType, n, n2, textureAtlasSprite, -1, null, u2.r(new Object[]{u2.d}));
        } else {
            operation.call(new Object[]{submitNodeCollector, modelPart, poseStack, renderType, n, n2, textureAtlasSprite});
        }
    }
}
