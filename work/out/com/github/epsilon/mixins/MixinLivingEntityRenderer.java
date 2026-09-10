/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.client.renderer.entity.LivingEntityRenderer
 *  net.minecraft.client.renderer.entity.state.LivingEntityRenderState
 *  net.minecraft.client.renderer.rendertype.RenderType
 *  net.minecraft.resources.Identifier
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.C;
import com.github.epsilon.Xr;
import com.github.epsilon.dD;
import com.github.epsilon.i;
import com.github.epsilon.vB;
import com.github.epsilon.vy;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={LivingEntityRenderer.class})
public abstract class MixinLivingEntityRenderer<T extends LivingEntity, S extends LivingEntityRenderState> {
    @Shadow
    public abstract Identifier getTextureLocation(S var1);

    @ModifyReturnValue(method={"getRenderType"}, at={@At(value="RETURN")})
    private RenderType modifyRenderType(RenderType renderType, S s, boolean bl, boolean bl2, boolean bl3) {
        C c = C.S;
        Entity entity = ((Xr)s).epsilon$getEntity();
        if (entity instanceof Player) {
            Player player = (Player)entity;
            if (c.d(new Object[]{player})) {
                return c.c(new Object[]{this.getTextureLocation(s)});
            }
        }
        return renderType;
    }

    @ModifyExpressionValue(method={"shouldShowName(Lnet/minecraft/world/entity/LivingEntity;D)Z"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/Minecraft;getCameraEntity()Lnet/minecraft/world/entity/Entity;")})
    private Entity hookShouldShowName(Entity entity) {
        return i.N.N() ? null : entity;
    }

    @ModifyExpressionValue(method={"extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/entity/LivingEntityRenderer;solveBodyRot(Lnet/minecraft/world/entity/LivingEntity;FF)F")})
    private float modifyBodyYaw(float f, LivingEntity livingEntity, S s, float f2) {
        if (livingEntity == dD.d.player) {
            vB vB2 = (vB)vy.j.d(new Object[]{new vB(livingEntity.yBodyRot, livingEntity.yBodyRotO, 0.0f, 0.0f)});
            return Mth.rotLerp((float)f2, (float)vB2.N(new Object[0]), (float)vB2.S(new Object[0]));
        }
        return f;
    }

    @ModifyExpressionValue(method={"extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/Mth;rotLerp(FFF)F")})
    private float modifyHeadYaw(float f, LivingEntity livingEntity, S s, float f2) {
        if (livingEntity == dD.d.player) {
            vB vB2 = (vB)vy.j.d(new Object[]{new vB(livingEntity.yHeadRot, livingEntity.yHeadRotO, 0.0f, 0.0f)});
            return Mth.rotLerp((float)f2, (float)vB2.N(new Object[0]), (float)vB2.S(new Object[0]));
        }
        return f;
    }

    @ModifyExpressionValue(method={"extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/entity/LivingEntity;getXRot(F)F")})
    private float modifyPitch(float f, LivingEntity livingEntity, S s, float f2) {
        if (livingEntity == dD.d.player) {
            vB vB2 = (vB)vy.j.d(new Object[]{new vB(0.0f, 0.0f, livingEntity.getXRot(), livingEntity.getXRot(0.0f))});
            return Mth.rotLerp((float)f2, (float)vB2.M(new Object[0]), (float)vB2.p(new Object[0]));
        }
        return f;
    }
}
