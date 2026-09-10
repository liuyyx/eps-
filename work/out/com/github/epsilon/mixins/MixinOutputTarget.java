/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderTarget
 *  net.minecraft.client.renderer.rendertype.OutputTarget
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.z2;
import com.mojang.blaze3d.pipeline.RenderTarget;
import net.minecraft.client.renderer.rendertype.OutputTarget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={OutputTarget.class})
public class MixinOutputTarget {
    @Inject(method={"getRenderTarget"}, at={@At(value="HEAD")}, cancellable=true)
    private void redirectHandOutlineTarget(CallbackInfoReturnable<RenderTarget> callbackInfoReturnable) {
        RenderTarget renderTarget;
        if ((OutputTarget)this == OutputTarget.OUTLINE_TARGET && (renderTarget = z2.a.R(new Object[0])) != null) {
            callbackInfoReturnable.setReturnValue((Object)renderTarget);
        }
    }
}
