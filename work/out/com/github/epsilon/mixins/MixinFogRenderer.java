/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.client.renderer.fog.FogData
 *  net.minecraft.client.renderer.fog.FogRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eC;
import com.github.epsilon.eu;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import java.awt.Color;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.renderer.fog.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={FogRenderer.class})
public abstract class MixinFogRenderer {
    @ModifyExpressionValue(method={"getBuffer"}, at={@At(value="FIELD", target="Lnet/minecraft/client/renderer/fog/FogRenderer;fogEnabled:Z", opcode=178)})
    private boolean modifyFogEnabled(boolean bl) {
        if (eC.T.N() && ((Boolean)eC.T.W.z()).booleanValue()) {
            return false;
        }
        return bl;
    }

    @ModifyReturnValue(method={"setupFog"}, at={@At(value="RETURN")})
    private FogData modifyFog(FogData fogData) {
        eu eu2 = eu.n;
        if (eu2.N() && ((Boolean)eu2.m.z()).booleanValue()) {
            fogData.environmentalStart = ((Integer)eu2.W.z()).intValue();
            fogData.environmentalEnd = ((Integer)eu2.O.z()).intValue();
            Color color = (Color)eu2.E.z();
            fogData.color.set((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 1.0f);
            return fogData;
        }
        return fogData;
    }
}
