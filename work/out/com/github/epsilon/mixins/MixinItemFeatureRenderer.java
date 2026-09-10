/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.feature.ItemFeatureRenderer
 *  net.minecraft.client.renderer.feature.ItemFeatureRenderer$Submit
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eC;
import net.minecraft.client.renderer.feature.ItemFeatureRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ItemFeatureRenderer.class})
public abstract class MixinItemFeatureRenderer {
    @Inject(method={"prepareFoilSubmit"}, at={@At(value="HEAD")}, cancellable=true)
    private void cancelEnchantGlint(ItemFeatureRenderer.Submit submit, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.L.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }
}
