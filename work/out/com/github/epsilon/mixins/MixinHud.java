/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.DeltaTracker
 *  net.minecraft.client.gui.Font
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.gui.Hud
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.e0;
import com.github.epsilon.e9;
import com.github.epsilon.eC;
import com.github.epsilon.i;
import com.github.epsilon.u0;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.Hud;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Hud.class})
public class MixinHud {
    @ModifyArg(method={"extractItemHotbar"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIII)V", ordinal=1), index=2)
    private int modifyHotbarSelectionX(int n) {
        return e0.B.L(new Object[]{n});
    }

    @ModifyExpressionValue(method={"extractCrosshair"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/CameraType;isFirstPerson()Z")})
    private boolean alwaysRenderCrosshairInFreecam(boolean bl) {
        return i.N.N() || bl;
    }

    @Inject(method={"extractEffects"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractEffects(GuiGraphicsExtractor guiGraphicsExtractor, DeltaTracker deltaTracker, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.k.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractPortalOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractPortalOverlay(GuiGraphicsExtractor guiGraphicsExtractor, float f, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.n.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractVignette"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractVignette(GuiGraphicsExtractor guiGraphicsExtractor, Entity entity, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.w.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractScoreboardSidebar"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractScoreboardSidebar(GuiGraphicsExtractor guiGraphicsExtractor, DeltaTracker deltaTracker, CallbackInfo callbackInfo) {
        if (u0.J.N()) {
            u0.J.h(new Object[0]);
        }
        if (eC.T.N() && ((Boolean)eC.T.H.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractChat"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractChat(GuiGraphicsExtractor guiGraphicsExtractor, DeltaTracker deltaTracker, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.q.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"displayScoreboardSidebar"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;fill(IIIII)V")})
    private void replaceScoreboardBackground(GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, int n3, int n4, int n5, Operation<Void> operation) {
        if (u0.J.N()) {
            Object[] objectArray = new Object[4];
            objectArray[3] = n4;
            objectArray[2] = n3;
            objectArray[1] = n2;
            objectArray[0] = n;
            u0.J.K(objectArray);
        } else {
            operation.call(new Object[]{guiGraphicsExtractor, n, n2, n3, n4, n5});
        }
    }

    @WrapOperation(method={"displayScoreboardSidebar"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V")})
    private void offsetScoreboardText(GuiGraphicsExtractor guiGraphicsExtractor, Font font, Component component, int n, int n2, int n3, boolean bl, Operation<Void> operation) {
        if (u0.J.N()) {
            n += u0.J.Q(new Object[0]);
            n2 += u0.J.r(new Object[0]);
        }
        operation.call(new Object[]{guiGraphicsExtractor, font, component, n, n2, n3, bl});
    }

    @Inject(method={"extractSpyglassOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractSpyglassOverlay(GuiGraphicsExtractor guiGraphicsExtractor, float f, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.z.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractCrosshair"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractCrosshair(GuiGraphicsExtractor guiGraphicsExtractor, DeltaTracker deltaTracker, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.v.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractTitle"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractTitle(GuiGraphicsExtractor guiGraphicsExtractor, DeltaTracker deltaTracker, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.b.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractSelectedItemName"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractSelectedItemName(GuiGraphicsExtractor guiGraphicsExtractor, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.t.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractConfusionOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractConfusionOverlay(GuiGraphicsExtractor guiGraphicsExtractor, float f, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.M.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"extractTabList"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractTabList(GuiGraphicsExtractor guiGraphicsExtractor, DeltaTracker deltaTracker, CallbackInfo callbackInfo) {
        if (e9.d.N()) {
            callbackInfo.cancel();
        }
    }
}
