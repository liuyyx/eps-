/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuSampler
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.client.gui.font.TextRenderable
 *  net.minecraft.client.gui.render.TextureSetup
 *  net.minecraft.client.renderer.state.gui.GlyphRenderState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.Dk;
import com.mojang.blaze3d.textures.GpuSampler;
import com.mojang.blaze3d.textures.GpuTextureView;
import net.minecraft.client.gui.font.TextRenderable;
import net.minecraft.client.gui.render.TextureSetup;
import net.minecraft.client.renderer.state.gui.GlyphRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={GlyphRenderState.class})
public class MixinGlyphRenderState {
    @Inject(method={"textureSetup"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTextureSetup(CallbackInfoReturnable<TextureSetup> callbackInfoReturnable) {
        TextRenderable textRenderable = ((GlyphRenderState)this).renderable();
        if (textRenderable instanceof Dk) {
            Dk dk = (Dk)textRenderable;
            callbackInfoReturnable.setReturnValue((Object)TextureSetup.singleTexture((GpuTextureView)textRenderable.textureView(), (GpuSampler)dk.O()));
        }
    }
}
