/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.client.player.KeyboardInput
 *  net.minecraft.world.entity.player.Input
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.vy;
import com.github.epsilon.yi;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.world.entity.player.Input;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={KeyboardInput.class})
public class MixinKeyboardInput {
    @Shadow
    private static float calculateImpulse(boolean bl, boolean bl2) {
        return bl == bl2 ? 0.0f : (bl ? 1.0f : -1.0f);
    }

    @ModifyExpressionValue(method={"tick"}, at={@At(value="NEW", target="(ZZZZZZZ)Lnet/minecraft/world/entity/player/Input;")})
    private Input redirectKeyPresses(Input input) {
        float f = MixinKeyboardInput.calculateImpulse(input.forward(), input.backward());
        float f2 = MixinKeyboardInput.calculateImpulse(input.left(), input.right());
        yi yi2 = (yi)vy.j.d(new Object[]{new yi(f, f2, input.jump(), input.shift(), input.sprint())});
        return yi2.A(new Object[0]);
    }
}
