/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.client.Camera
 *  net.minecraft.client.CameraType
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Pose
 *  net.minecraft.world.level.material.FogType
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Constant
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.ModifyConstant
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package com.github.epsilon.mixins;

import com.github.epsilon.W;
import com.github.epsilon.dD;
import com.github.epsilon.eC;
import com.github.epsilon.eZ;
import com.github.epsilon.i;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.Camera;
import net.minecraft.client.CameraType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.material.FogType;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={Camera.class})
public class MixinCamera {
    @Shadow
    private Entity entity;
    @Shadow
    private boolean detached;
    @Shadow
    private float eyeHeight;
    @Shadow
    private float eyeHeightOld;
    @Unique
    private Pose[] epsilon$lastPoses;

    @Unique
    private Pose[] epsilon$getLastPoses() {
        if (this.epsilon$lastPoses == null) {
            this.epsilon$lastPoses = new Pose[2];
        }
        return this.epsilon$lastPoses;
    }

    @Unique
    private boolean epsilon$isStandingCrouchingTransition() {
        Pose[] poseArray = this.epsilon$getLastPoses();
        return poseArray[1] == Pose.STANDING && poseArray[0] == Pose.CROUCHING || poseArray[1] == Pose.CROUCHING && poseArray[0] == Pose.STANDING;
    }

    @Inject(method={"getFluidInCamera"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetFluidInCamera(CallbackInfoReturnable<FogType> callbackInfoReturnable) {
        if (eC.T.N() && ((Boolean)eC.T.l.z()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)FogType.NONE);
        }
    }

    @Inject(method={"getMaxZoom"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookGetMaxZoom(float f, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (i.N.N()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        } else {
            W w = W.h;
            if (w.N()) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(((Double)w.y.z()).floatValue()));
            }
        }
    }

    @Inject(method={"alignWithEntity"}, at={@At(value="TAIL")})
    private void onAlignWithEntityTail(float f, CallbackInfo callbackInfo) {
        if (i.N.N()) {
            this.detached = true;
        }
    }

    @ModifyArgs(method={"alignWithEntity"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/Camera;setPosition(DDD)V"))
    private void onAlignSetPosArgs(Args args, @Local(argsOnly=true) float f) {
        i i2 = i.N;
        if (i2.N()) {
            args.set(0, (Object)i2.J(new Object[]{Float.valueOf(f)}));
            args.set(1, (Object)i2.c(new Object[]{Float.valueOf(f)}));
            args.set(2, (Object)i2.D(new Object[]{Float.valueOf(f)}));
        } else {
            W w = W.h;
            if (w.N() && ((Boolean)w.O.z()).booleanValue()) {
                if (dD.d.options.getCameraType() == CameraType.THIRD_PERSON_BACK) {
                    Vec3 vec3 = new Vec3(((Double)args.get(0)).doubleValue(), ((Double)args.get(1)).doubleValue(), ((Double)args.get(2)).doubleValue());
                    w.j(new Object[]{vec3});
                    Vec3 vec32 = w.Q(new Object[0]);
                    if (vec32 != null) {
                        args.set(0, (Object)vec32.x);
                        args.set(1, (Object)vec32.y);
                        args.set(2, (Object)vec32.z);
                    }
                } else {
                    w.J(new Object[0]);
                }
            }
        }
    }

    @ModifyArgs(method={"alignWithEntity"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/Camera;setRotation(FF)V"))
    private void onAlignSetRotationArgs(Args args, @Local(argsOnly=true) float f) {
        i i2 = i.N;
        if (i2.N()) {
            args.set(0, (Object)Float.valueOf((float)i2.v(new Object[]{Float.valueOf(f)})));
            args.set(1, (Object)Float.valueOf((float)i2.n(new Object[]{Float.valueOf(f)})));
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void hookSneakTweakCameraTick(CallbackInfo callbackInfo) {
        if (this.entity == null) {
            return;
        }
        Pose[] poseArray = this.epsilon$getLastPoses();
        Pose pose = this.entity.getPose();
        if (pose != poseArray[0]) {
            poseArray[1] = poseArray[0];
            poseArray[0] = pose;
        }
        if (eZ.d.V(new Object[0]) && this.epsilon$isStandingCrouchingTransition()) {
            this.eyeHeightOld = this.eyeHeight = this.entity.getEyeHeight();
        }
    }

    @ModifyConstant(method={"tick"}, constant={@Constant(floatValue=0.5f)})
    private float hookSneakTweakCameraSpeed(float f) {
        if (this.epsilon$isStandingCrouchingTransition()) {
            return eZ.d.Q(new Object[]{Float.valueOf(f)});
        }
        return f;
    }
}
