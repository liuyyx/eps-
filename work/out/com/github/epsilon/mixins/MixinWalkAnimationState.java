/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.WalkAnimationState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package com.github.epsilon.mixins;

import com.github.epsilon.yL;
import net.minecraft.world.entity.WalkAnimationState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={WalkAnimationState.class})
public class MixinWalkAnimationState
implements yL {
    @Shadow
    private float speedOld;
    @Shadow
    private float speed;
    @Shadow
    private float position;
    @Shadow
    private float positionScale;

    @Override
    public void epsilon$freeze(float f, float f2, float f3) {
        this.speedOld = f2;
        this.speed = f2;
        this.positionScale = 1.0f;
        this.position = f + f2 * (1.0f - f3);
    }
}
