/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.DeltaTracker$Timer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.no;
import net.minecraft.client.DeltaTracker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={DeltaTracker.Timer.class})
public class MixinDeltaTrackerTimer {
    @Shadow
    private float deltaTicks;

    @Inject(method={"advanceGameTime(J)I"}, at={@At(value="FIELD", target="Lnet/minecraft/client/DeltaTracker$Timer;lastMs:J", opcode=181)})
    public void onBeginRenderTick(long l, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        this.deltaTicks *= no.B.C(new Object[0]);
    }
}
