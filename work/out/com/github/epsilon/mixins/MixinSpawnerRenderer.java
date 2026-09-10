/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.client.renderer.blockentity.SpawnerRenderer
 *  net.minecraft.client.renderer.entity.EntityRenderDispatcher
 *  net.minecraft.client.renderer.entity.state.EntityRenderState
 *  net.minecraft.client.renderer.state.level.CameraRenderState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.eC;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.SpawnerRenderer;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={SpawnerRenderer.class})
public abstract class MixinSpawnerRenderer {
    @Inject(method={"submitEntityInSpawner"}, at={@At(value="HEAD")}, cancellable=true)
    private static void onRenderDisplayEntity(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, EntityRenderState entityRenderState, EntityRenderDispatcher entityRenderDispatcher, float f, float f2, CameraRenderState cameraRenderState, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.c.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }
}
