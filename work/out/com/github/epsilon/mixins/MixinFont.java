/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.client.gui.Font
 *  net.minecraft.client.gui.font.glyphs.BakedGlyph
 *  net.minecraft.network.chat.FormattedText
 *  net.minecraft.network.chat.Style
 *  net.minecraft.util.FormattedCharSequence
 *  net.minecraft.util.Mth
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eC;
import com.github.epsilon.gG;
import com.github.epsilon.ls;
import com.github.epsilon.uc;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.Mth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Font.class})
public class MixinFont {
    @Inject(method={"getGlyph"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetGlyph(int n, Style style, CallbackInfoReturnable<BakedGlyph> callbackInfoReturnable) {
        gG gG2;
        if (((Boolean)uc.v.u2.z()).booleanValue() && (gG2 = gG.g(n)) != null) {
            callbackInfoReturnable.setReturnValue((Object)gG2);
        }
    }

    @Inject(method={"width(Ljava/lang/String;)I"}, at={@At(value="HEAD")}, cancellable=true)
    private void onWidthString(String string, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        Float f;
        if (((Boolean)uc.v.u2.z()).booleanValue() && (f = ls.Y(new Object[]{string})) != null) {
            callbackInfoReturnable.setReturnValue((Object)Mth.ceil((float)f.floatValue()));
        }
    }

    @Inject(method={"width(Lnet/minecraft/util/FormattedCharSequence;)I"}, at={@At(value="HEAD")}, cancellable=true)
    private void onWidthFormattedCharSequence(FormattedCharSequence formattedCharSequence, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        Float f;
        if (((Boolean)uc.v.u2.z()).booleanValue() && (f = ls.U(new Object[]{formattedCharSequence})) != null) {
            callbackInfoReturnable.setReturnValue((Object)Mth.ceil((float)f.floatValue()));
        }
    }

    @Inject(method={"width(Lnet/minecraft/network/chat/FormattedText;)I"}, at={@At(value="HEAD")}, cancellable=true)
    private void onWidthFormattedText(FormattedText formattedText, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        Float f;
        if (((Boolean)uc.v.u2.z()).booleanValue() && (f = ls.k(new Object[]{formattedText})) != null) {
            callbackInfoReturnable.setReturnValue((Object)Mth.ceil((float)f.floatValue()));
        }
    }

    @ModifyExpressionValue(method={"getGlyph"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/chat/Style;isObfuscated()Z")})
    private boolean onIsObfuscated(boolean bl) {
        if (eC.T.N() && ((Boolean)eC.T.S.z()).booleanValue()) {
            return false;
        }
        return bl;
    }
}
