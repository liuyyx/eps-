/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.client.Camera
 *  net.minecraft.client.renderer.item.properties.numeric.CompassAngleState
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.world.entity.ItemOwner
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.i;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.item.properties.numeric.CompassAngleState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.ItemOwner;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={CompassAngleState.class})
public class MixinCompassAngleState {
    @ModifyExpressionValue(method={"getWrappedVisualRotationY"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/ItemOwner;getVisualRotationYInDegrees()F")})
    private static float hookGetWrappedVisualRotationY(float f) {
        if (i.N.N()) {
            return dD.d.gameRenderer.mainCamera().yRot();
        }
        return f;
    }

    @ModifyReturnValue(method={"getAngleFromEntityToPos(Lnet/minecraft/world/entity/ItemOwner;Lnet/minecraft/core/BlockPos;)D"}, at={@At(value="RETURN")})
    private static double modifyGetAngleTo(double d, ItemOwner itemOwner, BlockPos blockPos) {
        if (i.N.N()) {
            Vec3 vec3 = Vec3.atCenterOf((Vec3i)blockPos);
            Camera camera = dD.d.gameRenderer.mainCamera();
            return Math.atan2(vec3.z() - camera.position().z, vec3.x() - camera.position().x) / 6.2831854820251465;
        }
        return d;
    }
}
