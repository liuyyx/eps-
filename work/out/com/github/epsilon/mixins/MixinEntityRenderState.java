/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.state.EntityRenderState
 *  net.minecraft.world.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package com.github.epsilon.mixins;

import com.github.epsilon.Xr;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={EntityRenderState.class})
public class MixinEntityRenderState
implements Xr {
    @Unique
    private Entity epsilon$entity;

    @Override
    public Entity epsilon$getEntity() {
        return this.epsilon$entity;
    }

    @Override
    public void epsilon$setEntity(Entity entity) {
        this.epsilon$entity = entity;
    }
}
