/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.ScreenEffectRenderer
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.texture.TextureAtlasSprite
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.O;
import com.github.epsilon.eC;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ScreenEffectRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ScreenEffectRenderer.class})
public class MixinScreenEffectRenderer {
    @Inject(method={"displayItemActivation"}, at={@At(value="HEAD")}, cancellable=true)
    private void onDisplayItemActivation(ItemStack itemStack, RandomSource randomSource, CallbackInfo callbackInfo) {
        if (O.D.N()) {
            O.D.q(new Object[]{itemStack});
            callbackInfo.cancel();
        }
    }

    @Inject(method={"submitBlockSprite"}, at={@At(value="HEAD")}, cancellable=true)
    private static void onRenderBlockOverlay(TextureAtlasSprite textureAtlasSprite, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int n, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.N.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"submitWater"}, at={@At(value="HEAD")}, cancellable=true)
    private static void onRenderWater(Minecraft minecraft, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.l.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"submitFire"}, at={@At(value="HEAD")}, cancellable=true)
    private static void onRenderFire(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, TextureAtlasSprite textureAtlasSprite, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.D.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderItemActivationAnimation"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderItemActivationAnimation(PoseStack poseStack, float f, SubmitNodeCollector submitNodeCollector, CallbackInfo callbackInfo) {
        if (O.D.N()) {
            Object[] objectArray = new Object[3];
            objectArray[2] = submitNodeCollector;
            objectArray[1] = poseStack;
            objectArray[0] = Float.valueOf(f);
            O.D.m(objectArray);
            callbackInfo.cancel();
        } else if (eC.T.N() && ((Boolean)eC.T.X.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }
}
