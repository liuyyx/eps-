/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.util.FormattedCharSequence
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.I;
import com.github.epsilon.gp;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.util.FormattedCharSequence;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets={"net.minecraft.client.gui.components.ChatComponent$DrawingFocusedGraphicsAccess", "net.minecraft.client.gui.components.ChatComponent$DrawingBackgroundGraphicsAccess"})
public class MixinChatComponent {
    @ModifyVariable(method={"handleMessage"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private FormattedCharSequence onHandleMessage(FormattedCharSequence formattedCharSequence) {
        return gp.p.I(new Object[]{formattedCharSequence});
    }

    @ModifyVariable(method={"handleMessage"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private float animateMessageOpacity(float f) {
        return f * I.J.S(new Object[0]);
    }

    @Inject(method={"fill"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookFill(int n, int n2, int n3, int n4, int n5, CallbackInfo callbackInfo) {
        if (I.J.N() && (n5 & 0xFFFFFF) == 0) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"handleTag"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiGraphicsExtractor;fill(IIIII)V")})
    private void hideTagIndicator(GuiGraphicsExtractor guiGraphicsExtractor, int n, int n2, int n3, int n4, int n5, Operation<Void> operation) {
        if (!I.J.N()) {
            operation.call(new Object[]{guiGraphicsExtractor, n, n2, n3, n4, n5});
        }
    }
}
