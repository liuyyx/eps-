/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.gui.screens.inventory.AbstractContainerScreen
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.e0;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Screen.class})
public class MixinScreen {
    @Unique
    private boolean epsilon$inventoryTransform;
    @Unique
    private float epsilon$inventoryScale = 1.0f;

    @Inject(method={"added"}, at={@At(value="HEAD")})
    private void beginInventoryAnimation(CallbackInfo callbackInfo) {
        if ((Screen)this instanceof AbstractContainerScreen) {
            e0.B.L(new Object[0]);
        }
    }

    @Inject(method={"extractRenderStateWithTooltipAndSubtitles"}, at={@At(value="HEAD")})
    private void pushInventoryAnimation(GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, float f, CallbackInfo callbackInfo) {
        if (!((Screen)this instanceof AbstractContainerScreen)) {
            return;
        }
        this.epsilon$inventoryScale = e0.B.s(new Object[0]);
        if (this.epsilon$inventoryScale >= 1.0f) {
            return;
        }
        this.epsilon$inventoryTransform = true;
        this.epsilon$scaleAroundCenter(guiGraphicsExtractor, this.epsilon$inventoryScale);
    }

    @Inject(method={"extractRenderStateWithTooltipAndSubtitles"}, at={@At(value="RETURN")})
    private void popInventoryAnimation(GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, float f, CallbackInfo callbackInfo) {
        if (!this.epsilon$inventoryTransform) {
            return;
        }
        guiGraphicsExtractor.pose().popMatrix();
        this.epsilon$inventoryTransform = false;
    }

    @Inject(method={"extractTransparentBackground"}, at={@At(value="HEAD")})
    private void neutralizeBackgroundScale(GuiGraphicsExtractor guiGraphicsExtractor, CallbackInfo callbackInfo) {
        if (!this.epsilon$inventoryTransform) {
            return;
        }
        this.epsilon$scaleAroundCenter(guiGraphicsExtractor, 1.0f / this.epsilon$inventoryScale);
    }

    @Inject(method={"extractTransparentBackground"}, at={@At(value="RETURN")})
    private void restoreBackgroundScale(GuiGraphicsExtractor guiGraphicsExtractor, CallbackInfo callbackInfo) {
        if (this.epsilon$inventoryTransform) {
            guiGraphicsExtractor.pose().popMatrix();
        }
    }

    @WrapOperation(method={"extractRenderStateWithTooltipAndSubtitles"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/screens/Screen;extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V")})
    private void transformBackgroundMouse(Screen screen, GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, float f, Operation<Void> operation) {
        operation.call(new Object[]{screen, guiGraphicsExtractor, this.epsilon$mouseX(guiGraphicsExtractor, n), this.epsilon$mouseY(guiGraphicsExtractor, n2), Float.valueOf(f)});
    }

    @WrapOperation(method={"extractRenderStateWithTooltipAndSubtitles"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/screens/Screen;extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V")})
    private void transformContentMouse(Screen screen, GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, float f, Operation<Void> operation) {
        operation.call(new Object[]{screen, guiGraphicsExtractor, this.epsilon$mouseX(guiGraphicsExtractor, n), this.epsilon$mouseY(guiGraphicsExtractor, n2), Float.valueOf(f)});
    }

    @WrapOperation(method={"extractRenderStateWithTooltipAndSubtitles"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;extractDeferredElements(IIF)V")})
    private void transformDeferredMouse(GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, float f, Operation<Void> operation) {
        operation.call(new Object[]{guiGraphicsExtractor, this.epsilon$mouseX(guiGraphicsExtractor, n), this.epsilon$mouseY(guiGraphicsExtractor, n2), Float.valueOf(f)});
    }

    @Unique
    private void epsilon$scaleAroundCenter(GuiGraphicsExtractor guiGraphicsExtractor, float f) {
        guiGraphicsExtractor.pose().pushMatrix();
        guiGraphicsExtractor.pose().translate((float)guiGraphicsExtractor.guiWidth() / 2.0f, (float)guiGraphicsExtractor.guiHeight() / 2.0f);
        guiGraphicsExtractor.pose().scale(f, f);
        guiGraphicsExtractor.pose().translate((float)(-guiGraphicsExtractor.guiWidth()) / 2.0f, (float)(-guiGraphicsExtractor.guiHeight()) / 2.0f);
    }

    @Unique
    private int epsilon$mouseX(GuiGraphicsExtractor guiGraphicsExtractor, int n) {
        if (!this.epsilon$inventoryTransform) {
            return n;
        }
        float f = (float)guiGraphicsExtractor.guiWidth() / 2.0f;
        return Math.round(f + ((float)n - f) / this.epsilon$inventoryScale);
    }

    @Unique
    private int epsilon$mouseY(GuiGraphicsExtractor guiGraphicsExtractor, int n) {
        if (!this.epsilon$inventoryTransform) {
            return n;
        }
        float f = (float)guiGraphicsExtractor.guiHeight() / 2.0f;
        return Math.round(f + ((float)n - f) / this.epsilon$inventoryScale);
    }
}
