/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Direction
 *  net.minecraft.world.level.block.state.BlockState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.fabric.mixins.sodium;

import com.github.epsilon.U;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets={"net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext"}, remap=false)
public class MixinSodiumAbstractBlockRenderContext {
    @Shadow
    protected BlockState state;

    @Inject(method={"isFaceCulled"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookIsFaceCulled(Direction direction, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        U u = U.W;
        if (u.N() && ((Boolean)u.a.z()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)(!u.C(new Object[]{this.state.getBlock()}) ? 1 : 0));
        }
    }
}
