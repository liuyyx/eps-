/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  net.minecraft.client.CameraType
 *  net.minecraft.client.OptionInstance
 *  net.minecraft.client.OptionInstance$IntRange
 *  net.minecraft.client.OptionInstance$ValueSet
 *  net.minecraft.client.Options
 *  net.minecraft.network.chat.Component
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.i;
import com.mojang.serialization.Codec;
import net.minecraft.client.CameraType;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Options.class})
public class MixinOptions {
    @Mutable
    @Shadow
    @Final
    private OptionInstance<Integer> fov;

    @Redirect(method={"<init>"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/Options;load()V"))
    private void replaceFovOption(Options options) {
        this.fov = new OptionInstance("options.fov", OptionInstance.noTooltip(), MixinOptions::lambda$replaceFovOption$0, (OptionInstance.ValueSet)new OptionInstance.IntRange(30, 150), Codec.DOUBLE.xmap(MixinOptions::lambda$replaceFovOption$1, MixinOptions::lambda$replaceFovOption$2), (Object)110, OptionInstance.NO_ACTION);
        options.load();
    }

    @Inject(method={"setCameraType"}, at={@At(value="HEAD")}, cancellable=true)
    private void setPerspective(CameraType cameraType, CallbackInfo callbackInfo) {
        if (i.N.N()) {
            callbackInfo.cancel();
        }
    }

    private static Double lambda$replaceFovOption$2(Integer n) {
        return ((double)n.intValue() - 70.0) / 40.0;
    }

    private static Integer lambda$replaceFovOption$1(Double d) {
        return (int)(d * 40.0 + 70.0);
    }

    private static Component lambda$replaceFovOption$0(Component component, Integer n) {
        return switch (n) {
            case 70 -> Options.genericValueLabel((Component)component, (Component)Component.translatable((String)"options.fov.min"));
            case 150 -> Options.genericValueLabel((Component)component, (Component)Component.translatable((String)"options.fov.max"));
            default -> Options.genericValueLabel((Component)component, (int)n);
        };
    }
}
