/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.minecraft.client.renderer.Lightmap
 *  net.minecraft.client.renderer.state.LightmapRenderState
 *  net.minecraft.util.ARGB
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.U;
import com.github.epsilon.e6;
import com.github.epsilon.uA;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import net.minecraft.client.renderer.Lightmap;
import net.minecraft.client.renderer.state.LightmapRenderState;
import net.minecraft.util.ARGB;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Lightmap.class})
public class MixinLightmap {
    @Final
    @Shadow
    private GpuTexture texture;

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRender(LightmapRenderState lightmapRenderState, CallbackInfo callbackInfo) {
        if (U.W.N() || uA.W.I(new Object[0]) || e6.c.X(new Object[0])) {
            if (e6.c.X(new Object[0])) {
                RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.texture, (Vector4fc)ARGB.setVector4fFromARGB32((Vector4f)new Vector4f(), (int)e6.c.f(new Object[0]).getRGB()));
            } else {
                RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.texture, (Vector4fc)new Vector4f(1.0f));
            }
            callbackInfo.cancel();
        }
    }
}
