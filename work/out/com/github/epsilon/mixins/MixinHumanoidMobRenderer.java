/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.client.renderer.entity.HumanoidMobRenderer
 *  net.minecraft.client.renderer.entity.state.HumanoidRenderState
 *  net.minecraft.client.renderer.item.ItemModelResolver
 *  net.minecraft.world.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.uj;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={HumanoidMobRenderer.class})
public class MixinHumanoidMobRenderer {
    @ModifyExpressionValue(method={"extractHumanoidRenderState"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/LivingEntity;isFallFlying()Z")})
    private static boolean spoofFallFlyingVisualState(boolean bl, LivingEntity livingEntity, HumanoidRenderState humanoidRenderState, float f, ItemModelResolver itemModelResolver) {
        if (uj.a.A(new Object[0]) && livingEntity == dD.d.player) {
            return false;
        }
        return bl;
    }
}
