/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon._K;
import com.github.epsilon.vy;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={Item.class})
public class MixinItem {
    @ModifyExpressionValue(method={"getPlayerPOVHitResult"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/player/Player;calculateViewVector(FF)Lnet/minecraft/world/phys/Vec3;")})
    private static Vec3 hookUseItemRayTrace(Vec3 vec3, Level level, Player player, ClipContext.Fluid fluid) {
        _K _K2 = (_K)vy.j.d(new Object[]{new _K(player.getYRot(), player.getXRot())});
        return player.calculateViewVector(_K2.W(new Object[0]), _K2.R(new Object[0]));
    }
}
