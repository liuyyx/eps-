/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.v2.WrapWithCondition
 *  com.llamalad7.mixinextras.sugar.Share
 *  com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon._z;
import com.github.epsilon.dD;
import com.github.epsilon.da;
import com.github.epsilon.dv;
import com.github.epsilon.vy;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Player.class})
public class MixinPlayer {
    @Inject(method={"travel"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTravelPre(Vec3 vec3, CallbackInfo callbackInfo) {
        dv dv2;
        if ((Player)this == dD.d.player && (dv2 = (dv)vy.j.d(new Object[]{new dv()})).l(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @ModifyExpressionValue(method={"causeExtraKnockback", "doSweepAttack"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/player/Player;getYRot()F")})
    private float modifyAttackYaw(float f) {
        _z _z2 = (_z)vy.j.d(new Object[]{new _z(f)});
        return _z2.Q(new Object[0]);
    }

    @WrapWithCondition(method={"causeExtraKnockback"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/player/Player;setDeltaMovement(Lnet/minecraft/world/phys/Vec3;)V")})
    private boolean onAttackSlowdown(Player player, Vec3 vec3, @Share(value="cancelAttackSlowdown") LocalBooleanRef localBooleanRef) {
        da da2 = (da)vy.j.d(new Object[]{new da()});
        localBooleanRef.set(da2.l(new Object[0]));
        return !localBooleanRef.get();
    }

    @WrapWithCondition(method={"causeExtraKnockback"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/player/Player;setSprinting(Z)V")})
    private boolean onAttackStopSprinting(Player player, boolean bl, @Share(value="cancelAttackSlowdown") LocalBooleanRef localBooleanRef) {
        return !localBooleanRef.get();
    }
}
