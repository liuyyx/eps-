/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.projectile.FireworkRocketEntity
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.vy;
import com.github.epsilon.yC;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={FireworkRocketEntity.class})
public class MixinFireworkRocketEntity {
    @WrapOperation(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/LivingEntity;getLookAngle()Lnet/minecraft/world/phys/Vec3;")})
    private Vec3 redirectMovement(LivingEntity livingEntity, Operation<Vec3> operation) {
        if (livingEntity == dD.d.player) {
            yC yC2 = (yC)vy.j.d(new Object[]{new yC(livingEntity.getYRot(), livingEntity.getXRot())});
            return livingEntity.calculateViewVector(yC2.g(new Object[0]), yC2.h(new Object[0]));
        }
        return (Vec3)operation.call(new Object[]{livingEntity});
    }
}
