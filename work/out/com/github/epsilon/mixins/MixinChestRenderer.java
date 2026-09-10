/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.model.Model
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.blockentity.ChestRenderer
 *  net.minecraft.client.renderer.blockentity.state.ChestRenderState
 *  net.minecraft.client.renderer.feature.ModelFeatureRenderer$CrumblingOverlay
 *  net.minecraft.client.resources.model.sprite.SpriteGetter
 *  net.minecraft.client.resources.model.sprite.SpriteId
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.github.epsilon.mixins;

import com.github.epsilon.C;
import com.github.epsilon.u;
import com.github.epsilon.z2;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.renderer.blockentity.state.ChestRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.resources.model.sprite.SpriteGetter;
import net.minecraft.client.resources.model.sprite.SpriteId;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ChestRenderer.class})
public class MixinChestRenderer {
    @Redirect(method={"submit*"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/renderer/SubmitNodeCollector;submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;IIILnet/minecraft/client/resources/model/sprite/SpriteId;Lnet/minecraft/client/resources/model/sprite/SpriteGetter;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V"))
    private <S> void applyShadersChestOutline(SubmitNodeCollector submitNodeCollector, Model<S> model, S s, PoseStack poseStack, int n, int n2, int n3, SpriteId spriteId, SpriteGetter spriteGetter, int n4, ModelFeatureRenderer.CrumblingOverlay crumblingOverlay, ChestRenderState chestRenderState) {
        u u2 = u.H;
        boolean bl = u2.N() && u2.O(new Object[]{chestRenderState.blockPos});
        int n5 = bl ? 0 : n4;
        C c = C.S;
        if (c.I(new Object[0])) {
            submitNodeCollector.submitModel(model, s, poseStack, c.c(new Object[]{spriteId.atlasLocation()}), n, n2, n3, spriteGetter.get(spriteId), n5, crumblingOverlay);
        } else {
            submitNodeCollector.submitModel(model, s, poseStack, n, n2, n3, spriteId, spriteGetter, n5, crumblingOverlay);
        }
        if (bl) {
            submitNodeCollector.submitModel(model, s, poseStack, z2.a.j(new Object[]{spriteId.atlasLocation()}), n, n2, u2.r(new Object[]{u2.E}), spriteGetter.get(spriteId), u2.r(new Object[]{u2.E}), null);
        }
    }
}
