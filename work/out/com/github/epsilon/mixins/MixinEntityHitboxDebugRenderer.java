/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.debug.EntityHitboxDebugRenderer
 *  net.minecraft.world.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.e8;
import net.minecraft.client.renderer.debug.EntityHitboxDebugRenderer;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={EntityHitboxDebugRenderer.class})
public abstract class MixinEntityHitboxDebugRenderer {
    @Inject(method={"showHitboxes"}, at={@At(value="HEAD")}, cancellable=true)
    private void onShowHitboxes(Entity entity, float f, boolean bl, CallbackInfo callbackInfo) {
        Object[] objectArray = new Object[2];
        objectArray[1] = Float.valueOf(f);
        objectArray[0] = entity;
        if (e8.d.O(objectArray)) {
            callbackInfo.cancel();
        }
    }
}
