/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.render.GuiRenderer
 *  net.minecraft.client.renderer.feature.FeatureRenderDispatcher
 *  net.minecraft.client.renderer.state.gui.GuiRenderState
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.OT;
import com.github.epsilon.dD;
import com.github.epsilon.vy;
import com.github.epsilon.yt;
import com.github.epsilon.zR;
import com.github.epsilon.zm;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.renderer.feature.FeatureRenderDispatcher;
import net.minecraft.client.renderer.state.gui.GuiRenderState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiRenderer.class})
public class MixinGuiRenderer {
    @Shadow
    @Final
    private FeatureRenderDispatcher featureRenderDispatcher;
    @Unique
    private GuiRenderState epsilon$levelRenderState;
    @Unique
    private OT epsilon$levelGuiRenderer;
    @Unique
    private GuiRenderState epsilon$renderState;
    @Unique
    private OT epsilon$guiRenderer;

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void onRenderHead(CallbackInfo callbackInfo) {
        if (((GuiRenderer)this).getClass() != GuiRenderer.class) {
            return;
        }
        if (this.epsilon$levelRenderState == null || this.epsilon$levelGuiRenderer == null) {
            this.epsilon$levelRenderState = new GuiRenderState();
            this.epsilon$levelGuiRenderer = new OT(this.epsilon$levelRenderState, this.featureRenderDispatcher);
        }
        if (this.epsilon$renderState == null || this.epsilon$guiRenderer == null) {
            this.epsilon$renderState = new GuiRenderState();
            this.epsilon$guiRenderer = new OT(this.epsilon$renderState, this.featureRenderDispatcher);
        }
        int n = (int)dD.d.mouseHandler.getScaledXPos(dD.d.getWindow());
        int n2 = (int)dD.d.mouseHandler.getScaledYPos(dD.d.getWindow());
        yt.L.D(new Object[0]);
        GuiGraphicsExtractor guiGraphicsExtractor = new GuiGraphicsExtractor(dD.d, this.epsilon$levelRenderState, n, n2);
        vy.j.d(new Object[]{new zm(guiGraphicsExtractor)});
        this.epsilon$levelGuiRenderer.w(new Object[0]);
        this.epsilon$levelGuiRenderer.H(new Object[0]);
        GuiGraphicsExtractor guiGraphicsExtractor2 = new GuiGraphicsExtractor(dD.d, this.epsilon$renderState, n, n2);
        vy.j.d(new Object[]{new zR(guiGraphicsExtractor2)});
        this.epsilon$guiRenderer.w(new Object[0]);
        this.epsilon$guiRenderer.H(new Object[0]);
    }
}
