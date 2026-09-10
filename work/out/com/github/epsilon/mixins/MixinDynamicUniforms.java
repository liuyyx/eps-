/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.DynamicUniforms
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.Oe;
import com.github.epsilon.dB;
import com.github.epsilon.nK;
import net.minecraft.client.renderer.DynamicUniforms;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={DynamicUniforms.class})
public class MixinDynamicUniforms {
    @Inject(method={"reset"}, at={@At(value="RETURN")})
    private void onReset(CallbackInfo callbackInfo) {
        dB.b();
        Oe.B();
        dB.Z();
        nK.Z();
    }
}
