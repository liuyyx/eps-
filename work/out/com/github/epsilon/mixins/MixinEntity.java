/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package com.github.epsilon.mixins;

import com.github.epsilon.DY;
import com.github.epsilon.Dn;
import com.github.epsilon.Du;
import com.github.epsilon.dD;
import com.github.epsilon.i;
import com.github.epsilon.vy;
import com.github.epsilon.w;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={Entity.class})
public class MixinEntity {
    @Inject(method={"turn"}, at={@At(value="HEAD")}, cancellable=true)
    private void updateTurn(double d, double d2, CallbackInfo callbackInfo) {
        i i2;
        if (this == dD.d.player && (i2 = i.N).N()) {
            Object[] objectArray = new Object[2];
            objectArray[1] = d2 * 0.15;
            objectArray[0] = d * 0.15;
            i2.Q(objectArray);
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"getViewVector"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/Entity;calculateViewVector(FF)Lnet/minecraft/world/phys/Vec3;")})
    private Vec3 redirectGetViewYRot(Entity entity, float f, float f2, Operation<Vec3> operation) {
        if (entity == dD.d.player) {
            DY dY = (DY)vy.j.d(new Object[]{new DY(f2, f)});
            return (Vec3)operation.call(new Object[]{entity, Float.valueOf(dY.W(new Object[0])), Float.valueOf(dY.K(new Object[0]))});
        }
        return (Vec3)operation.call(new Object[]{entity, Float.valueOf(f), Float.valueOf(f2)});
    }

    @WrapOperation(method={"moveRelative"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/Entity;getYRot()F")})
    private float redirectGetYRotInMoveRelative(Entity entity, Operation<Float> operation) {
        if (entity == dD.d.player) {
            Dn dn = (Dn)vy.j.d(new Object[]{new Dn(entity.getYRot())});
            return dn.w(new Object[0]);
        }
        return ((Float)operation.call(new Object[]{entity})).floatValue();
    }

    @ModifyArgs(method={"push(Lnet/minecraft/world/entity/Entity;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/entity/Entity;push(DDD)V"))
    private void pushAwayFromHook(Args args) {
        if ((Entity)this == dD.d.player && w.a.N() && w.a.d.i(Du.Cancel) && ((Boolean)w.a.F.z()).booleanValue()) {
            args.set(0, (Object)0.0);
            args.set(1, (Object)0.0);
            args.set(2, (Object)0.0);
        }
    }
}
