/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.renderer.Panorama
 *  net.minecraft.client.renderer.RenderPipelines
 *  net.minecraft.resources.Identifier
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.gB;
import com.github.epsilon.uc;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.Panorama;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Panorama.class})
public class MixinPanorama {
    @Unique
    private static final Identifier BACKGROUND_TEXTURE = gB.G("textures/background/bluearchive.png");
    @Unique
    private static final int EPSILON_PARALLAX_PADDING = 24;

    @Inject(method={"extractRenderState"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractRenderState(GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, CallbackInfo callbackInfo) {
        if (((Boolean)uc.v.q.z()).booleanValue()) {
            int n3 = 2880;
            int n4 = 1620;
            int n5 = 48;
            float f = Math.max((float)(n + n5) / (float)n3, (float)(n2 + n5) / (float)n4);
            int n6 = Math.round((float)n3 * f);
            int n7 = Math.round((float)n4 * f);
            int n8 = -Math.round((float)((double)(n6 - n) * (1.0 - dD.d.mouseHandler.getScaledXPos(dD.d.getWindow()) / (double)n)));
            int n10 = -Math.round((float)((double)(n7 - n2) * (1.0 - dD.d.mouseHandler.getScaledYPos(dD.d.getWindow()) / (double)n2)));
            guiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND_TEXTURE, n8, n10, 0.0f, 0.0f, n6, n7, n3, n4, n3, n4);
            callbackInfo.cancel();
        }
    }
}
