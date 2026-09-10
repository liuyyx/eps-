/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.multiplayer.MultiPlayerGameMode
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon._S;
import com.github.epsilon.dA;
import com.github.epsilon.dN;
import com.github.epsilon.dk;
import com.github.epsilon.et;
import com.github.epsilon.vy;
import com.github.epsilon.zZ;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={MultiPlayerGameMode.class})
public class MixinMultiPlayerGameMode {
    @Unique
    private float epsilon$oldYaw;
    @Unique
    private float epsilon$oldPitch;
    @Unique
    private boolean epsilon$rotationModified;

    @Inject(method={"useItem"}, at={@At(value="HEAD")})
    private void preUseItem(Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
        _S _S2 = (_S)vy.j.d(new Object[]{new _S(player.getYRot(), player.getXRot())});
        if (_S2.j(new Object[0])) {
            this.epsilon$oldYaw = player.getYRot();
            this.epsilon$oldPitch = player.getXRot();
            player.setYRot(_S2.I(new Object[0]));
            player.setXRot(_S2.J(new Object[0]));
            this.epsilon$rotationModified = true;
        }
    }

    @Inject(method={"useItem"}, at={@At(value="RETURN")})
    private void postUseItem(Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
        if (this.epsilon$rotationModified) {
            player.setYRot(this.epsilon$oldYaw);
            player.setXRot(this.epsilon$oldPitch);
            this.epsilon$rotationModified = false;
        }
    }

    @Inject(method={"attack"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAttackEntity(Player player, Entity entity, CallbackInfo callbackInfo) {
        dN dN2 = (dN)vy.j.d(new Object[]{new dN(player, entity)});
        if (dN2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"startDestroyBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void onStartDestroyBlock(BlockPos blockPos, Direction direction, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        dA dA2 = (dA)vy.j.d(new Object[]{new dA(blockPos, direction)});
        if (dA2.l(new Object[0])) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"destroyBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void onDestroyBlock(BlockPos blockPos, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        dk dk2 = (dk)vy.j.d(new Object[]{new dk(blockPos)});
        if (dk2.l(new Object[0])) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"destroyBlock"}, at={@At(value="RETURN")})
    private void onDestroyedBlock(BlockPos blockPos, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        vy.j.d(new Object[]{new zZ(blockPos)});
    }

    @WrapOperation(method={"continueDestroyBlock"}, at={@At(value="FIELD", target="Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;destroyDelay:I", opcode=181, ordinal=2)})
    private void survivalBreakDelayChange(MultiPlayerGameMode multiPlayerGameMode, int n, Operation<Void> operation) {
        et et2 = et.E;
        int n2 = et2.N() ? (Integer)et2.k.z() : n;
        operation.call(new Object[]{multiPlayerGameMode, n2});
    }

    @WrapOperation(method={"continueDestroyBlock"}, at={@At(value="FIELD", target="Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;destroyDelay:I", opcode=181, ordinal=1)})
    private void creativeBreakDelayChangeOne(MultiPlayerGameMode multiPlayerGameMode, int n, Operation<Void> operation) {
        et et2 = et.E;
        int n2 = et2.N() ? (Integer)et2.k.z() : n;
        operation.call(new Object[]{multiPlayerGameMode, n2});
    }

    @WrapOperation(method={"startDestroyBlock"}, at={@At(value="FIELD", target="Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;destroyDelay:I", opcode=181)})
    private void creativeBreakDelayChangeTwo(MultiPlayerGameMode multiPlayerGameMode, int n, Operation<Void> operation) {
        et et2 = et.E;
        int n2 = et2.N() ? (Integer)et2.k.z() : n;
        operation.call(new Object[]{multiPlayerGameMode, n2});
    }
}
