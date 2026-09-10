/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.e8;
import com.github.epsilon.eC;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={ClientLevel.class})
public abstract class MixinClientLevel {
    @Inject(method={"levelEvent"}, at={@At(value="HEAD")})
    private void onLevelEvent(Entity entity, int n, BlockPos blockPos, int n2, CallbackInfo callbackInfo) {
        Object[] objectArray = new Object[2];
        objectArray[1] = Vec3.atCenterOf((Vec3i)blockPos).add(0.0, 0.5, 0.0);
        objectArray[0] = n;
        e8.d.X(objectArray);
    }

    @ModifyArgs(method={"animateTick"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/ClientLevel;doAnimateTick(IIIILnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos$MutableBlockPos;)V"))
    private void onAnimateTick(Args args) {
        if (eC.T.N() && ((Boolean)eC.T.h.z()).booleanValue()) {
            args.set(5, (Object)Blocks.BARRIER);
        }
    }

    @Redirect(method={"tickNonPassenger"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/entity/Entity;tick()V"))
    public void hookTickNonPassenger(Entity entity) {
        if (dD.G > 0 && entity == dD.d.player) {
            --dD.G;
        } else {
            entity.tick();
        }
    }
}
