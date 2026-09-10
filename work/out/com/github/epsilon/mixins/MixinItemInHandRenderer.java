/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.player.AbstractClientPlayer
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.client.renderer.ItemInHandRenderer
 *  net.minecraft.client.renderer.SubmitNodeCollector
 *  net.minecraft.tags.ItemTags
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.HumanoidArm
 *  net.minecraft.world.item.ItemStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.dD;
import com.github.epsilon.e_;
import com.github.epsilon.lx;
import com.github.epsilon.n1;
import com.github.epsilon.u;
import com.github.epsilon.vy;
import com.github.epsilon.yF;
import com.github.epsilon.z2;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ItemInHandRenderer.class})
public abstract class MixinItemInHandRenderer {
    @Unique
    private boolean epsilon$blocked;
    @Final
    @Shadow
    private Minecraft minecraft;
    @Shadow
    private float mainHandHeight;
    @Shadow
    private float offHandHeight;
    @Shadow
    private ItemStack mainHandItem;
    @Shadow
    private ItemStack offHandItem;

    @Shadow
    protected abstract void applyItemArmAttackTransform(PoseStack var1, HumanoidArm var2, float var3);

    @Inject(method={"submitHandsWithItems"}, at={@At(value="HEAD")})
    private void beginShadersHandCapture(float f, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, LocalPlayer localPlayer, int n, CallbackInfo callbackInfo) {
        u u2 = u.H;
        if (u2.N() && ((Boolean)u2.W.z()).booleanValue()) {
            Object[] objectArray = new Object[2];
            objectArray[1] = dD.d.gameRenderer.mainRenderTarget().height;
            objectArray[0] = dD.d.gameRenderer.mainRenderTarget().width;
            z2.a.i(objectArray);
        }
    }

    @Inject(method={"submitArmWithItem"}, at={@At(value="HEAD")})
    private void cacheBlockingState(AbstractClientPlayer abstractClientPlayer, float f, float f2, InteractionHand interactionHand, float f3, ItemStack itemStack, float f4, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int n, CallbackInfo callbackInfo) {
        Object[] objectArray = new Object[2];
        objectArray[1] = itemStack;
        objectArray[0] = interactionHand;
        this.epsilon$blocked = e_.k.J(objectArray);
    }

    @Inject(method={"submitArmWithItem"}, at={@At(value="RETURN")})
    private void clearBlockingState(AbstractClientPlayer abstractClientPlayer, float f, float f2, InteractionHand interactionHand, float f3, ItemStack itemStack, float f4, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int n, CallbackInfo callbackInfo) {
        this.epsilon$blocked = false;
    }

    @Inject(method={"tick"}, at={@At(value="RETURN")})
    private void hideHotbarSwitchAnimation(CallbackInfo callbackInfo) {
        boolean bl;
        boolean bl2;
        e_ e_2 = e_.k;
        boolean bl3 = bl2 = e_2.N() && (Boolean)e_2.v.z() != false;
        if (bl2) {
            this.mainHandHeight = 1.0f;
            this.mainHandItem = this.minecraft.player.getMainHandItem();
        }
        boolean bl4 = bl = e_2.N() && (Boolean)e_2.d.z() != false;
        if (bl) {
            this.offHandHeight = 1.0f;
            this.offHandItem = this.minecraft.player.getOffhandItem();
        }
    }

    @Inject(method={"submitArmWithItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/ItemInHandRenderer;applyItemArmTransform(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/entity/HumanoidArm;F)V", ordinal=2, shift=At.Shift.AFTER)})
    private void addSwingToEating(AbstractClientPlayer abstractClientPlayer, float f, float f2, InteractionHand interactionHand, float f3, ItemStack itemStack, float f4, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int n, CallbackInfo callbackInfo) {
        e_ e_2 = e_.k;
        if (e_2.N() && ((Boolean)e_2.q.z()).booleanValue() && f3 > 0.0f) {
            HumanoidArm humanoidArm = interactionHand == InteractionHand.MAIN_HAND ? abstractClientPlayer.getMainArm() : abstractClientPlayer.getMainArm().getOpposite();
            this.applyItemArmAttackTransform(poseStack, humanoidArm, f3);
        }
    }

    @Inject(method={"swingArm"}, at={@At(value="HEAD")}, cancellable=true)
    private void cancelSwingForBlocking(float f, PoseStack poseStack, int n, HumanoidArm humanoidArm, CallbackInfo callbackInfo) {
        if (this.epsilon$blocked) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"submitArmWithItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/ItemInHandRenderer;renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V", shift=At.Shift.BEFORE)})
    private void beforeRenderHeldItem(AbstractClientPlayer abstractClientPlayer, float f, float f2, InteractionHand interactionHand, float f3, ItemStack itemStack, float f4, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int n, CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new lx(interactionHand, poseStack)});
        if (this.epsilon$blocked) {
            HumanoidArm humanoidArm = interactionHand == InteractionHand.MAIN_HAND ? abstractClientPlayer.getMainArm() : abstractClientPlayer.getMainArm().getOpposite();
            Object[] objectArray = new Object[3];
            objectArray[2] = Float.valueOf(f3);
            objectArray[1] = humanoidArm;
            objectArray[0] = poseStack;
            e_.k.I(objectArray);
        }
    }

    @Inject(method={"submitArmWithItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/ItemInHandRenderer;renderPlayerArm(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IFFLnet/minecraft/world/entity/HumanoidArm;)V")})
    private void beforeRenderArm(AbstractClientPlayer abstractClientPlayer, float f, float f2, InteractionHand interactionHand, float f3, ItemStack itemStack, float f4, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int n, CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new yF(interactionHand, poseStack)});
    }

    @WrapOperation(method={"swingArm"}, at={@At(value="INVOKE", target="Lcom/mojang/blaze3d/vertex/PoseStack;translate(FFF)V")})
    private void wrapSwingArmTranslate(PoseStack poseStack, float f, float f2, float f3, Operation<Void> operation) {
        ItemStack itemStack;
        boolean bl;
        e_ e_2 = e_.k;
        boolean bl2 = bl = e_2.N() && e_2.o.i(n1.Flux);
        if (bl && ((Boolean)e_2.m.z()).booleanValue() && !(itemStack = dD.d.player.getMainHandItem()).is(ItemTags.SWORDS) && !itemStack.is(ItemTags.AXES)) {
            bl = false;
        }
        if (!bl) {
            operation.call(new Object[]{poseStack, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)});
        }
    }

    @ModifyArg(method={"renderItem"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/renderer/item/ItemStackRenderState;submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V"), index=4)
    private int applyShadersHandOutline(int n) {
        u u2 = u.H;
        return u2.N() && (Boolean)u2.W.z() != false ? u2.r(new Object[]{u2.d}) : n;
    }
}
