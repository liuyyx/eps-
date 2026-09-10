/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.v2.WrapWithCondition
 *  net.minecraft.client.Camera
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.renderer.WeatherEffectRenderer
 *  net.minecraft.client.renderer.WorldBorderRenderer
 *  net.minecraft.client.renderer.extract.LevelExtractor
 *  net.minecraft.client.renderer.state.level.LevelRenderState
 *  net.minecraft.client.renderer.state.level.WeatherRenderState
 *  net.minecraft.client.renderer.state.level.WorldBorderRenderState
 *  net.minecraft.world.level.border.WorldBorder
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eC;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.WeatherEffectRenderer;
import net.minecraft.client.renderer.WorldBorderRenderer;
import net.minecraft.client.renderer.extract.LevelExtractor;
import net.minecraft.client.renderer.state.level.LevelRenderState;
import net.minecraft.client.renderer.state.level.WeatherRenderState;
import net.minecraft.client.renderer.state.level.WorldBorderRenderState;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={LevelExtractor.class})
public class MixinLevelExtractor {
    @WrapWithCondition(method={"extract"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/WeatherEffectRenderer;extractRenderState(Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/state/level/WeatherRenderState;)V")})
    private boolean extract$noWeather(WeatherEffectRenderer weatherEffectRenderer, ClientLevel clientLevel, float f, Vec3 vec3, WeatherRenderState weatherRenderState) {
        if (eC.T.N() && ((Boolean)eC.T.E.z()).booleanValue()) {
            weatherRenderState.intensity = 0.0f;
            return false;
        }
        return true;
    }

    @WrapWithCondition(method={"extract"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/WorldBorderRenderer;extract(Lnet/minecraft/world/level/border/WorldBorder;FLnet/minecraft/world/phys/Vec3;DLnet/minecraft/client/renderer/state/level/WorldBorderRenderState;)V")})
    private boolean extract$noWorldBorder(WorldBorderRenderer worldBorderRenderer, WorldBorder worldBorder, float f, Vec3 vec3, double d, WorldBorderRenderState worldBorderRenderState) {
        if (eC.T.N() && ((Boolean)eC.T.m.z()).booleanValue()) {
            worldBorderRenderState.alpha = 0.0;
            return false;
        }
        return true;
    }

    @Inject(method={"extractBlockDestroyAnimation"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExtractBlockDestroyAnimation(Camera camera, LevelRenderState levelRenderState, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.mT.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }
}
