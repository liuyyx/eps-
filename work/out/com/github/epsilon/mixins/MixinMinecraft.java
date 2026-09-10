/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  me.sofurry.smtc.W
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.multiplayer.MultiPlayerGameMode
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.HitResult$Type
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

import com.github.epsilon.B;
import com.github.epsilon._U;
import com.github.epsilon.__;
import com.github.epsilon._y;
import com.github.epsilon.dB;
import com.github.epsilon.dD;
import com.github.epsilon.dE;
import com.github.epsilon.dj;
import com.github.epsilon.dz;
import com.github.epsilon.e_;
import com.github.epsilon.ew;
import com.github.epsilon.g3;
import com.github.epsilon.i;
import com.github.epsilon.iE;
import com.github.epsilon.lM;
import com.github.epsilon.lS;
import com.github.epsilon.uc;
import com.github.epsilon.vc;
import com.github.epsilon.vy;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import me.sofurry.smtc.W;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.HitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Minecraft.class})
public abstract class MixinMinecraft {
    @Shadow
    private int rightClickDelay;
    @Shadow
    public ClientLevel level;
    @Unique
    private boolean epsilon$freeCameraSet = false;

    @Shadow
    public abstract Entity getCameraEntity();

    @Shadow
    public abstract void pick(float var1);

    @Inject(method={"onGameLoadFinished"}, at={@At(value="TAIL")})
    private void onGameLoadFinished(CallbackInfo callbackInfo) {
        if (!((Boolean)uc.v.P.z()).booleanValue()) {
            return;
        }
        if (((Boolean)uc.v.uT.z()).booleanValue()) {
            vc.l.h(new Object[0]);
        } else {
            Object[] objectArray = new Object[2];
            objectArray[1] = Float.valueOf(((Double)uc.v.uF.z()).floatValue());
            objectArray[0] = iE.REISA_WELCOME;
            lS.q.c(objectArray);
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void onPreTick(CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new _y()});
    }

    @Inject(method={"tick"}, at={@At(value="TAIL")})
    private void onPostTick(CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new __()});
    }

    @ModifyArg(method={"updateTitle"}, at=@At(value="INVOKE", target="Lcom/mojang/blaze3d/platform/Window;setTitle(Ljava/lang/String;)V"))
    private String onUpdateTitle(String string) {
        lM lM2 = (lM)((Object)uc.v.u4.z());
        if (lM2 == lM.Vanilla) {
            return string;
        }
        if (lM2 == lM.Minecraft_1_8_9) {
            return "Minecraft 1.8.9";
        }
        return dD.D + " " + dD.z + " for " + string;
    }

    @Inject(method={"disconnect(Lnet/minecraft/client/gui/screens/Screen;ZZ)V"}, at={@At(value="HEAD")})
    private void onDisconnect(Screen screen, boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        if (this.level != null) {
            vy.j.d(new Object[]{new g3()});
        }
    }

    @Inject(method={"handleKeybinds"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;isUsingItem()Z", ordinal=0, shift=At.Shift.BEFORE)}, cancellable=true)
    private void onHandleKeybinds(CallbackInfo callbackInfo) {
        dz dz2 = (dz)vy.j.d(new Object[]{new dz()});
        if (dz2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"startUseItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/InteractionHand;values()[Lnet/minecraft/world/InteractionHand;")}, cancellable=true)
    private void onStartUseItemBeforeHands(CallbackInfo callbackInfo) {
        dj dj2 = (dj)vy.j.d(new Object[]{new dj()});
        if (dj2.l(new Object[0])) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"startUseItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/item/ItemStack;isItemEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z")})
    private void onStartUseItem(CallbackInfo callbackInfo) {
        B b = B.L;
        if (b.N()) {
            this.rightClickDelay = (Integer)b.S.z();
        }
    }

    @WrapOperation(method={"continueAttack"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/player/LocalPlayer;isUsingItem()Z")})
    private boolean attackMultiTask(LocalPlayer localPlayer, Operation<Boolean> operation) {
        return localPlayer == null || !ew.d.N() && (Boolean)operation.call(new Object[]{localPlayer}) != false;
    }

    @WrapOperation(method={"startUseItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;isDestroying()Z")})
    private boolean useMultiTask(MultiPlayerGameMode multiPlayerGameMode, Operation<Boolean> operation) {
        return !ew.d.N() && (Boolean)operation.call(new Object[]{multiPlayerGameMode}) != false;
    }

    @Inject(method={"handleKeybinds"}, at={@At(value="FIELD", target="Lnet/minecraft/client/Options;keyUse:Lnet/minecraft/client/KeyMapping;", ordinal=0, opcode=180)})
    private void onItemUseMouseHandle(CallbackInfo callbackInfo) {
        e_ e_2 = e_.k;
        Minecraft minecraft = (Minecraft)this;
        if (e_2.N() && ((Boolean)e_2.q.z()).booleanValue() && minecraft.options.keyAttack.isDown() && minecraft.options.keyAttack.consumeClick() && (!((Boolean)e_2.Q.z()).booleanValue() || minecraft.hitResult.getType() == HitResult.Type.BLOCK)) {
            minecraft.player.swing(InteractionHand.MAIN_HAND, false);
        }
    }

    @Inject(method={"updateLevelInEngines(Lnet/minecraft/client/multiplayer/ClientLevel;Z)V"}, at={@At(value="HEAD")})
    private void onUpdateLevelInEngines(ClientLevel clientLevel, boolean bl, CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new _U()});
    }

    @Inject(method={"close"}, at={@At(value="HEAD")})
    private void onClose(CallbackInfo callbackInfo) {
        W.Z.z(new Object[0]);
        dE.P();
        dB.Q();
    }

    @Inject(method={"pick"}, at={@At(value="HEAD")}, cancellable=true)
    private void updateTargetedEntityInvoke(float f, CallbackInfo callbackInfo) {
        i i2 = i.N;
        if (i2.N() && this.getCameraEntity() != null && !this.epsilon$freeCameraSet) {
            callbackInfo.cancel();
            Entity entity = this.getCameraEntity();
            double d = entity.getX();
            double d2 = entity.getY();
            double d3 = entity.getZ();
            double d4 = entity.xo;
            double d6 = entity.yo;
            double d7 = entity.zo;
            float f2 = entity.getYRot();
            float f3 = entity.getXRot();
            float f4 = entity.yRotO;
            float f5 = entity.xRotO;
            entity.position().x = i2.n.x;
            entity.position().y = i2.n.y - (double)entity.getEyeHeight(entity.getPose());
            entity.position().z = i2.n.z;
            entity.xo = i2.d.x;
            entity.yo = i2.d.y - (double)entity.getEyeHeight(entity.getPose());
            entity.zo = i2.d.z;
            entity.setYRot(i2.v);
            entity.setXRot(i2.e);
            entity.yRotO = i2.y;
            entity.xRotO = i2.T;
            this.epsilon$freeCameraSet = true;
            this.pick(f);
            this.epsilon$freeCameraSet = false;
            entity.position().x = d;
            entity.position().y = d2;
            entity.position().z = d3;
            entity.xo = d4;
            entity.yo = d6;
            entity.zo = d7;
            entity.setYRot(f2);
            entity.setXRot(f3);
            entity.yRotO = f4;
            entity.xRotO = f5;
        }
    }
}
