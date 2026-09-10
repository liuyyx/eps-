/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MouseHandler
 *  net.minecraft.client.input.MouseButtonInfo
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dW;
import com.github.epsilon.dm;
import com.github.epsilon.vy;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.input.MouseButtonInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MouseHandler.class})
public class MixinMouseHandler {
    @Inject(method={"onButton"}, at={@At(value="HEAD")}, cancellable=true)
    private void onButton(long l, MouseButtonInfo mouseButtonInfo, int n, CallbackInfo callbackInfo) {
        dW dW2 = (dW)vy.j.d(new Object[]{new dW(mouseButtonInfo.button(), n, mouseButtonInfo.modifiers())});
        if (dW2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onScroll"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMouseScroll(long l, double d, double d2, CallbackInfo callbackInfo) {
        dm dm2 = (dm)vy.j.d(new Object[]{new dm(d2)});
        if (dm2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }
}
