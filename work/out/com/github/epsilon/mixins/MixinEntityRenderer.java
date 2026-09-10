/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.entity.EntityRenderer
 *  net.minecraft.client.renderer.entity.state.EntityRenderState
 *  net.minecraft.client.renderer.entity.state.LivingEntityRenderState
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.boss.enderdragon.EndCrystal
 *  net.minecraft.world.entity.item.FallingBlockEntity
 *  net.minecraft.world.entity.player.Player
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.epsilon.mixins;

import com.github.epsilon.Z;
import com.github.epsilon.eB;
import com.github.epsilon.eC;
import com.github.epsilon.u;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={EntityRenderer.class})
public class MixinEntityRenderer<T extends Entity, S extends EntityRenderState> {
    @Inject(method={"extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V"}, at={@At(value="RETURN")})
    private void onExtractRenderStateReturn(T t, S s, float f, CallbackInfo callbackInfo) {
        u u2 = u.H;
        if (u2.N() && u2.X(new Object[]{t})) {
            Object[] objectArray = new Object[2];
            objectArray[1] = u2.y;
            objectArray[0] = t;
            ((EntityRenderState)s).outlineColor = u2.a(objectArray);
        }
    }

    @Inject(method={"shouldRender"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookShouldRender(T t, Frustum frustum, double d, double d2, double d3, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (eB.u.N() && t instanceof EndCrystal) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        eC eC2 = eC.T;
        if (eC2.N() && (eC2.j(new Object[]{t.getType()}) || ((Boolean)eC2.O.z()).booleanValue() && t instanceof FallingBlockEntity)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"extractNameTags(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;FDD)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookExtractNameTags(T t, S s, float f, double d, double d2, CallbackInfo callbackInfo) {
        boolean bl;
        boolean bl2 = eC.T.N() && (Boolean)eC.T.F.z() != false;
        boolean bl3 = bl = Z.k.N() && t instanceof Player;
        if (bl2 || bl) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"finalizeRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onFinalizeRenderState(T t, S s, CallbackInfo callbackInfo) {
        if (eC.T.N() && ((Boolean)eC.T.x.z()).booleanValue() && s instanceof LivingEntityRenderState) {
            LivingEntityRenderState livingEntityRenderState = (LivingEntityRenderState)s;
            if (livingEntityRenderState.deathTime > 0.0f) {
                callbackInfo.cancel();
            }
        }
    }
}
