/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.particle.ParticleEngine
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleType
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.world.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.e8;
import com.github.epsilon.eC;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ParticleEngine.class})
public class MixinParticleManager {
    @Inject(method={"createParticle"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    private void onCreateParticle(ParticleOptions particleOptions, double d, double d2, double d3, double d4, double d5, double d6, CallbackInfoReturnable<Particle> callbackInfoReturnable) {
        if (this.shouldCancel(particleOptions)) {
            callbackInfoReturnable.setReturnValue(null);
        }
    }

    @Inject(method={"createTrackingEmitter(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/particles/ParticleOptions;I)V"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    private void onCreateTrackingEmitter(Entity entity, ParticleOptions particleOptions, int n, CallbackInfo callbackInfo) {
        if (this.shouldCancel(particleOptions)) {
            callbackInfo.cancel();
        }
    }

    private boolean shouldCancel(ParticleOptions particleOptions) {
        if (particleOptions == null) {
            return false;
        }
        ParticleType particleType = particleOptions.getType();
        if (particleType == ParticleTypes.FLAME) {
            return true;
        }
        if (particleType == ParticleTypes.TOTEM_OF_UNDYING && e8.d.I(new Object[0])) {
            return true;
        }
        if (eC.T.N()) {
            if (((Boolean)eC.T.E.z()).booleanValue() && particleType == ParticleTypes.RAIN) {
                return true;
            }
            if (((Boolean)eC.T.a.z()).booleanValue() && particleType == ParticleTypes.FIREWORK) {
                return true;
            }
        }
        return false;
    }
}
