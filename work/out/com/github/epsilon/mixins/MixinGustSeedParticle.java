/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.particle.GustSeedParticle
 *  net.minecraft.client.particle.NoRenderParticle
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.e8;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.GustSeedParticle;
import net.minecraft.client.particle.NoRenderParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GustSeedParticle.class})
public abstract class MixinGustSeedParticle
extends NoRenderParticle {
    protected MixinGustSeedParticle(ClientLevel clientLevel, double d, double d2, double d3) {
        super(clientLevel, d, d2, d3);
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void onTick(CallbackInfo callbackInfo) {
        if (this.age == 0) {
            Object[] objectArray = new Object[3];
            objectArray[2] = this.z;
            objectArray[1] = this.y;
            objectArray[0] = this.x;
            e8.d.T(objectArray);
        }
    }
}
