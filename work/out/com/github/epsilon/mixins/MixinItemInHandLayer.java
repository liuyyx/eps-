/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.entity.layers.ItemInHandLayer
 *  net.minecraft.client.renderer.entity.state.ArmedEntityRenderState
 *  net.minecraft.client.renderer.item.ItemStackRenderState
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.HumanoidArm
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.C;
import com.github.epsilon.Xr;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.state.ArmedEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={ItemInHandLayer.class})
public class MixinItemInHandLayer {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WrapOperation(method={"submitArmWithItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/item/ItemStackRenderState;submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V")})
    private void applyChamsToHeldItem(ItemStackRenderState itemStackRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int n, int n2, int n3, Operation<Void> operation, ArmedEntityRenderState armedEntityRenderState, ItemStackRenderState itemStackRenderState2, ItemStack itemStack, HumanoidArm humanoidArm, PoseStack poseStack2, SubmitNodeCollector submitNodeCollector2, int n4) {
        C c = C.S;
        Entity entity = ((Xr)armedEntityRenderState).epsilon$getEntity();
        if (entity instanceof Player) {
            Player player = (Player)entity;
            if (c.d(new Object[]{player})) {
                c.z(new Object[0]);
                try {
                    operation.call(new Object[]{itemStackRenderState, poseStack, submitNodeCollector, n, n2, n3});
                    return;
                }
                finally {
                    c.k(new Object[0]);
                }
            }
        }
        operation.call(new Object[]{itemStackRenderState, poseStack, submitNodeCollector, n, n2, n3});
    }
}
