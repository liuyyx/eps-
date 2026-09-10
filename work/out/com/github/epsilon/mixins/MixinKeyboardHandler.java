/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.KeyboardHandler
 *  net.minecraft.client.input.KeyEvent
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dL;
import com.github.epsilon.vy;
import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.input.KeyEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={KeyboardHandler.class})
public class MixinKeyboardHandler {
    @Inject(method={"keyPress"}, at={@At(value="HEAD")}, cancellable=true)
    private void keyPress(long l, int n, KeyEvent keyEvent, CallbackInfo callbackInfo) {
        dL dL2 = (dL)vy.j.d(new Object[]{new dL(keyEvent, n)});
        if (dL2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }
}
