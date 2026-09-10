/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.context.BlockPlaceContext
 *  net.minecraft.world.level.block.state.BlockState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dO;
import com.github.epsilon.ee;
import com.github.epsilon.vy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockItem.class})
public abstract class MixinBlockItem {
    @Shadow
    protected abstract BlockState getPlacementState(BlockPlaceContext var1);

    @Inject(method={"placeBlock(Lnet/minecraft/world/item/context/BlockPlaceContext;Lnet/minecraft/world/level/block/state/BlockState;)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void onPlace(BlockPlaceContext blockPlaceContext, BlockState blockState, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (!blockPlaceContext.getLevel().isClientSide()) {
            return;
        }
        if (((dO)vy.j.d(new Object[]{new dO(blockPlaceContext.getClickedPos(), blockState.getBlock())})).l(new Object[0])) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @ModifyVariable(method={"place(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/InteractionResult;"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"), name={"placedState"})
    private BlockState modifyState(BlockState blockState, BlockPlaceContext blockPlaceContext) {
        ee ee2 = ee.C;
        if (ee2.N() && ((Boolean)ee2.k.z()).booleanValue()) {
            return this.getPlacementState(blockPlaceContext);
        }
        return blockState;
    }
}
