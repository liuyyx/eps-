/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Direction
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.state.BlockState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.U;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Block.class})
public class MixinBlock {
    @Inject(method={"shouldRenderFace"}, at={@At(value="HEAD")}, cancellable=true)
    private static void hookShouldRenderFace(BlockState blockState, BlockState blockState2, Direction direction, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        U u = U.W;
        if (u.N() && ((Boolean)u.a.z()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)u.C(new Object[]{blockState.getBlock()}));
        }
    }
}
