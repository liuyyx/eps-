/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.core.component.DataComponents
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.eC;
import com.github.epsilon.e_;
import com.github.epsilon.nS;
import com.github.epsilon.s;
import com.github.epsilon.up;
import com.github.epsilon.vB;
import com.github.epsilon.vy;
import com.github.epsilon.zV;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={LivingEntity.class})
public class MixinLivingEntity {
    @Inject(method={"setSprinting"}, at={@At(value="HEAD")}, cancellable=true)
    private void preventSprintDuringInventorySorting(boolean bl, CallbackInfo callbackInfo) {
        up up2 = up.N;
        if (bl && (LivingEntity)this == dD.d.player && up2.N() && up2.E()) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"tickHeadTurn"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/LivingEntity;getYRot()F")})
    private float modifyHeadYaw(LivingEntity livingEntity, Operation<Float> operation) {
        if (livingEntity == dD.d.player) {
            vB vB2 = (vB)vy.j.d(new Object[]{new vB(livingEntity.getYRot(), 0.0f, 0.0f, 0.0f)});
            return vB2.S(new Object[0]);
        }
        return ((Float)operation.call(new Object[]{livingEntity})).floatValue();
    }

    @ModifyExpressionValue(method={"jumpFromGround"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/LivingEntity;getYRot()F")})
    private float modifyJumpYaw(float f) {
        if (this == dD.d.player) {
            nS nS2 = (nS)vy.j.d(new Object[]{new nS(f)});
            return nS2.F(new Object[0]);
        }
        return f;
    }

    @ModifyExpressionValue(method={"updateFallFlyingMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/LivingEntity;getLookAngle()Lnet/minecraft/world/phys/Vec3;")})
    private Vec3 modifyFallFlyingLookAngle(Vec3 vec3) {
        if (this == dD.d.player) {
            zV zV2 = (zV)vy.j.d(new Object[]{new zV(dD.d.player.getYRot(), dD.d.player.getXRot())});
            return dD.d.player.calculateViewVector(zV2.N(new Object[0]), zV2.q(new Object[0]));
        }
        return vec3;
    }

    @ModifyExpressionValue(method={"updateFallFlyingMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/LivingEntity;getXRot()F")})
    private float modifyFallFlyingPitch(float f) {
        if (this == dD.d.player) {
            zV zV2 = (zV)vy.j.d(new Object[]{new zV(dD.d.player.getYRot(), f)});
            return zV2.N(new Object[0]);
        }
        return f;
    }

    @WrapOperation(method={"aiStep"}, at={@At(value="FIELD", target="Lnet/minecraft/world/entity/LivingEntity;noJumpDelay:I", opcode=181, ordinal=1)})
    private void redirectJumpingCooldown(LivingEntity livingEntity, int n, Operation<Void> operation) {
        s s2 = s.u;
        int n2 = n;
        if (livingEntity == dD.d.player && s2.N()) {
            n2 = (Integer)s2.P.z();
        }
        operation.call(new Object[]{livingEntity, n2});
    }

    @Inject(method={"getCurrentSwingDuration"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookGetCurrentSwingDuration(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        e_ e_2 = e_.k;
        if ((LivingEntity)this == dD.d.player && e_2.N() && ((Boolean)e_2.L.z()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)((Integer)e_2.a.z()));
        }
    }

    @Inject(method={"spawnItemParticles"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSpawnItemParticles(ItemStack itemStack, int n, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.e.z()).booleanValue() && itemStack.getComponents().has(DataComponents.FOOD)) {
            callbackInfo.cancel();
        }
    }
}
