/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.item.ItemStackRenderState$FoilType
 *  net.minecraft.client.renderer.item.ItemStackRenderState$LayerRenderState
 *  net.minecraft.client.resources.model.geometry.BakedQuad
 *  net.minecraft.world.item.ItemDisplayContext
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.C;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={ItemStackRenderState.LayerRenderState.class})
public class MixinItemStackLayerRenderState {
    @WrapOperation(method={"submit"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/SubmitNodeCollector;submitItem(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/item/ItemDisplayContext;III[ILjava/util/List;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V")})
    private void applyChamsRenderType(SubmitNodeCollector submitNodeCollector, PoseStack poseStack, ItemDisplayContext itemDisplayContext, int n, int n2, int n3, int[] nArray, List<BakedQuad> list, ItemStackRenderState.FoilType foilType, Operation<Void> operation) {
        C c = C.S;
        if (c.v(new Object[0])) {
            Object[] objectArray = new Object[2];
            objectArray[1] = c;
            objectArray[0] = list;
            list = c.W(objectArray);
        }
        operation.call(new Object[]{submitNodeCollector, poseStack, itemDisplayContext, n, n2, n3, nArray, list, foilType});
    }
}
