/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.gui.screens.TitleScreen
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.iS;
import com.github.epsilon.uc;
import com.github.epsilon.vc;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={TitleScreen.class})
public class MixinTitleScreen {
    @Unique
    private static boolean epsilon$welcomeHandled;

    @Inject(method={"init"}, at={@At(value="HEAD")}, cancellable=true)
    private void onInit(CallbackInfo callbackInfo) {
        if (!epsilon$welcomeHandled) {
            epsilon$welcomeHandled = true;
            if (((Boolean)uc.v.X.z()).booleanValue()) {
                callbackInfo.cancel();
                dD.d.gui.setScreen((Screen)iS.Y);
                dD.d.options.screenEffectScale().set((Object)0.0);
                dD.d.options.fovEffectScale().set((Object)0.0);
                dD.d.options.darknessEffectScale().set((Object)0.0);
                dD.d.options.damageTiltStrength().set((Object)0.0);
                return;
            }
        }
        if (((Boolean)uc.v.uT.z()).booleanValue()) {
            callbackInfo.cancel();
            dD.d.gui.setScreen((Screen)vc.l);
        }
    }
}
