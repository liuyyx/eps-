/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.world.entity.Avatar
 *  net.minecraft.world.entity.EntityDimensions
 *  net.minecraft.world.entity.Pose
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.eZ;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.world.entity.Avatar;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={Avatar.class})
public class MixinAvatar {
    @ModifyReturnValue(method={"getDefaultDimensions"}, at={@At(value="RETURN")})
    private EntityDimensions hookSneakTweakDefaultDimensions(EntityDimensions entityDimensions, Pose pose) {
        eZ eZ2 = eZ.d;
        if ((Avatar)this == dD.d.player && eZ2.N() && pose == Pose.CROUCHING && dD.d.player.canPlayerFitWithinBlocksAndEntitiesWhen(Pose.STANDING)) {
            return entityDimensions.withEyeHeight(eZ2.h(new Object[]{Float.valueOf(entityDimensions.eyeHeight())}));
        }
        return entityDimensions;
    }
}
