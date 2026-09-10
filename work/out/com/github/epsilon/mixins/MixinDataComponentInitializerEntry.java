/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.core.HolderLookup$Provider
 *  net.minecraft.core.component.DataComponentInitializers$Initializer
 *  net.minecraft.core.component.DataComponentMap$Builder
 *  net.minecraft.resources.ResourceKey
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponentInitializers;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.resources.ResourceKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(targets={"net.minecraft.core.component.DataComponentInitializers$InitializerEntry"})
public class MixinDataComponentInitializerEntry<T> {
    @WrapOperation(method={"run"}, at={@At(value="INVOKE", target="Lnet/minecraft/core/component/DataComponentInitializers$Initializer;run(Lnet/minecraft/core/component/DataComponentMap$Builder;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/resources/ResourceKey;)V")})
    private void skipMissingInstrument(DataComponentInitializers.Initializer<T> initializer, DataComponentMap.Builder builder, HolderLookup.Provider provider, ResourceKey<T> resourceKey, Operation<Void> operation) {
        try {
            operation.call(new Object[]{initializer, builder, provider, resourceKey});
        }
        catch (IllegalStateException illegalStateException) {
            // empty catch block
        }
    }
}
