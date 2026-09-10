/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.client.renderer.blockentity.AbstractSignRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eC;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.renderer.blockentity.AbstractSignRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={AbstractSignRenderer.class})
public class MixinAbstractSignRenderer {
    @ModifyExpressionValue(method={"submitSignText"}, at={@At(value="CONSTANT", args={"intValue=4", "ordinal=1"})})
    private int loopTextLengthProxy(int n) {
        if (eC.T.N() && ((Boolean)eC.T.mq.z()).booleanValue()) {
            return 0;
        }
        return n;
    }
}
