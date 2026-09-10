/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.player.AbstractClientPlayer
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.MoverType
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.D2;
import com.github.epsilon.Du;
import com.github.epsilon._J;
import com.github.epsilon.d3;
import com.github.epsilon.dD;
import com.github.epsilon.dR;
import com.github.epsilon.dY;
import com.github.epsilon.db;
import com.github.epsilon.nj;
import com.github.epsilon.up;
import com.github.epsilon.vy;
import com.github.epsilon.w;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={LocalPlayer.class})
public class MixinLocalPlayer
extends AbstractClientPlayer {
    @Shadow
    protected int sprintTriggerTime;
    @Unique
    private dY epsilon$sendPositionEvent;
    @Unique
    private boolean epsilon$dispatchPositionEvents;

    protected MixinLocalPlayer(ClientLevel clientLevel, GameProfile gameProfile) {
        super(clientLevel, gameProfile);
    }

    @Inject(method={"canStartSprinting"}, at={@At(value="HEAD")}, cancellable=true)
    private void preventSprintDuringInventorySorting(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        up up2 = up.N;
        if (up2.N() && up2.E()) {
            this.sprintTriggerTime = 0;
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/AbstractClientPlayer;tick()V", shift=At.Shift.BEFORE, ordinal=0)}, cancellable=true)
    private void onPreTick(CallbackInfo callbackInfo) {
        dR dR2 = (dR)vy.j.d(new Object[]{new dR()});
        if (dR2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/AbstractClientPlayer;tick()V", shift=At.Shift.AFTER, ordinal=0)})
    private void onPostTick(CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new nj()});
    }

    @Inject(method={"sendPosition"}, at={@At(value="HEAD")}, cancellable=true)
    private void onPreSendPosition(CallbackInfo callbackInfo) {
        LocalPlayer localPlayer = (LocalPlayer)this;
        dY dY2 = new dY(localPlayer.getX(), localPlayer.getY(), localPlayer.getZ(), localPlayer.getYRot(), localPlayer.getXRot(), localPlayer.onGround());
        this.epsilon$dispatchPositionEvents = localPlayer == dD.d.player;
        dY dY3 = this.epsilon$sendPositionEvent = this.epsilon$dispatchPositionEvents ? (dY)vy.j.d(new Object[]{dY2}) : dY2;
        if (this.epsilon$sendPositionEvent.l(new Object[0])) {
            callbackInfo.cancel();
            boolean bl = this.epsilon$dispatchPositionEvents && localPlayer == dD.d.player;
            this.epsilon$dispatchPositionEvents = false;
            if (bl) {
                vy.j.d(new Object[]{new _J()});
            }
        }
    }

    @Inject(method={"sendPosition"}, at={@At(value="TAIL")})
    private void onPostSendPosition(CallbackInfo callbackInfo) {
        boolean bl = this.epsilon$dispatchPositionEvents && (LocalPlayer)this == dD.d.player;
        this.epsilon$dispatchPositionEvents = false;
        if (bl) {
            vy.j.d(new Object[]{new _J()});
        }
    }

    @Inject(method={"swing"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSwing(InteractionHand interactionHand, CallbackInfo callbackInfo) {
        d3 d32 = (d3)vy.j.d(new Object[]{new d3()});
        if (d32.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"sendPosition"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;position()Lnet/minecraft/world/phys/Vec3;")})
    private Vec3 redirectPosition(LocalPlayer localPlayer, Operation<Vec3> operation) {
        return new Vec3(this.epsilon$sendPositionEvent.c(new Object[0]), this.epsilon$sendPositionEvent.A(new Object[0]), this.epsilon$sendPositionEvent.f(new Object[0]));
    }

    @WrapOperation(method={"sendPosition"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;getX()D")})
    private double redirectGetX(LocalPlayer localPlayer, Operation<Double> operation) {
        return this.epsilon$sendPositionEvent.c(new Object[0]);
    }

    @WrapOperation(method={"sendPosition"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;getY()D")})
    private double redirectGetY(LocalPlayer localPlayer, Operation<Double> operation) {
        return this.epsilon$sendPositionEvent.A(new Object[0]);
    }

    @WrapOperation(method={"sendPosition"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;getZ()D")})
    private double redirectGetZ(LocalPlayer localPlayer, Operation<Double> operation) {
        return this.epsilon$sendPositionEvent.f(new Object[0]);
    }

    @WrapOperation(method={"sendPosition"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;getYRot()F")})
    private float redirectGetYRot(LocalPlayer localPlayer, Operation<Float> operation) {
        return this.epsilon$sendPositionEvent.h(new Object[0]);
    }

    @WrapOperation(method={"sendPosition"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;getXRot()F")})
    private float redirectGetXRot(LocalPlayer localPlayer, Operation<Float> operation) {
        return this.epsilon$sendPositionEvent.V(new Object[0]);
    }

    @WrapOperation(method={"sendPosition"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;onGround()Z")})
    private boolean redirectOnGround(LocalPlayer localPlayer, Operation<Boolean> operation) {
        return this.epsilon$sendPositionEvent.s();
    }

    @Inject(method={"moveTowardsClosestSpace"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookPushOutOfBlocks(double d, double d2, CallbackInfo callbackInfo) {
        if (w.a.N() && w.a.d.i(Du.Cancel) && ((Boolean)w.a.W.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"modifyInput"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;isUsingItem()Z")})
    private boolean onSlowdown(LocalPlayer localPlayer, Operation<Boolean> operation) {
        D2 d2 = (D2)vy.j.d(new Object[]{new D2((Boolean)operation.call(new Object[]{localPlayer}))});
        return d2.d(new Object[0]);
    }

    @Inject(method={"move"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/AbstractClientPlayer;move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V")}, cancellable=true)
    private void onMove(MoverType moverType, Vec3 vec3, CallbackInfo callbackInfo) {
        db db2 = (db)vy.j.d(new Object[]{new db(vec3.x, vec3.y, vec3.z)});
        if (db2.l(new Object[0])) {
            super.move(moverType, new Vec3(db2.h(new Object[0]), db2.P(new Object[0]), db2.L(new Object[0])));
            callbackInfo.cancel();
        }
    }
}
