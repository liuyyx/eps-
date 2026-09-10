/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Share
 *  com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef
 *  com.llamalad7.mixinextras.sugar.ref.LocalFloatRef
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl
 *  net.minecraft.client.multiplayer.ClientPacketListener
 *  net.minecraft.client.multiplayer.CommonListenerCookie
 *  net.minecraft.network.Connection
 *  net.minecraft.network.PacketListener
 *  net.minecraft.network.PacketProcessor
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.PacketUtils
 *  net.minecraft.network.protocol.game.ClientboundAddEntityPacket
 *  net.minecraft.network.protocol.game.ClientboundLoginPacket
 *  net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket
 *  net.minecraft.network.protocol.game.ClientboundRespawnPacket
 *  net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket
 *  net.minecraft.network.protocol.game.ClientboundStartConfigurationPacket
 *  net.minecraft.network.syncher.EntityDataSerializers
 *  net.minecraft.network.syncher.SynchedEntityData$DataValue
 *  net.minecraft.world.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.epsilon.mixins;

import com.github.epsilon.DK;
import com.github.epsilon.L;
import com.github.epsilon.XV;
import com.github.epsilon.eC;
import com.github.epsilon.eZ;
import com.github.epsilon.g3;
import com.github.epsilon.vy;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.CommonListenerCookie;
import net.minecraft.network.Connection;
import net.minecraft.network.PacketListener;
import net.minecraft.network.PacketProcessor;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketUtils;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.protocol.game.ClientboundLoginPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundRespawnPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket;
import net.minecraft.network.protocol.game.ClientboundStartConfigurationPacket;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ClientPacketListener.class})
public abstract class MixinClientPacketListener
extends ClientCommonPacketListenerImpl {
    protected MixinClientPacketListener(Minecraft minecraft, Connection connection, CommonListenerCookie commonListenerCookie) {
        super(minecraft, connection, commonListenerCookie);
    }

    @Inject(method={"handleLogin"}, at={@At(value="TAIL")})
    private void onHandleLoginTail(ClientboundLoginPacket clientboundLoginPacket, CallbackInfo callbackInfo, @Share(value="worldNotNull") LocalBooleanRef localBooleanRef) {
        if (localBooleanRef.get()) {
            vy.j.d(new Object[]{new g3()});
        }
        vy.j.d(new Object[]{new XV()});
    }

    @Inject(method={"handleConfigurationStart"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/protocol/PacketUtils;ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/PacketProcessor;)V", shift=At.Shift.AFTER)})
    private void onHandleConfigurationStart(ClientboundStartConfigurationPacket clientboundStartConfigurationPacket, CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new g3()});
    }

    @Inject(method={"handleRespawn"}, at={@At(value="RETURN")})
    private void onHandleRespawnReturn(ClientboundRespawnPacket clientboundRespawnPacket, CallbackInfo callbackInfo) {
        vy.j.d(new Object[]{new DK()});
    }

    @Inject(method={"handleSetEntityData"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookSneakTweakSetEntityData(ClientboundSetEntityDataPacket clientboundSetEntityDataPacket, CallbackInfo callbackInfo) {
        if (eZ.d.N()) {
            PacketUtils.ensureRunningOnSameThread((Packet)clientboundSetEntityDataPacket, (PacketListener)((ClientPacketListener)this), (PacketProcessor)this.minecraft.packetProcessor());
            if (this.minecraft.player == null || this.minecraft.level == null || clientboundSetEntityDataPacket.id() != this.minecraft.player.getId()) {
                return;
            }
            ArrayList<SynchedEntityData.DataValue> arrayList = new ArrayList<SynchedEntityData.DataValue>(clientboundSetEntityDataPacket.packedItems().size());
            boolean bl = false;
            for (SynchedEntityData.DataValue dataValue : clientboundSetEntityDataPacket.packedItems()) {
                if (dataValue.serializer() == EntityDataSerializers.POSE) {
                    bl = true;
                    continue;
                }
                arrayList.add(dataValue);
            }
            if (!bl) {
                return;
            }
            Entity entity = this.minecraft.level.getEntity(clientboundSetEntityDataPacket.id());
            if (entity != null && !arrayList.isEmpty()) {
                entity.getEntityData().assignValues(arrayList);
            }
            callbackInfo.cancel();
        }
    }

    @Inject(method={"handleMovePlayer"}, at={@At(value="HEAD")})
    private void onHandleMovePlayerHead(ClientboundPlayerPositionPacket clientboundPlayerPositionPacket, CallbackInfo callbackInfo, @Share(value="noRotateYaw") LocalFloatRef localFloatRef, @Share(value="noRotatePitch") LocalFloatRef localFloatRef2) {
        if (!L.X.N() || this.minecraft.player == null) {
            return;
        }
        localFloatRef.set(this.minecraft.player.getYRot());
        localFloatRef2.set(this.minecraft.player.getXRot());
    }

    @Inject(method={"handleMovePlayer"}, at={@At(value="RETURN")})
    private void onHandleMovePlayerReturn(ClientboundPlayerPositionPacket clientboundPlayerPositionPacket, CallbackInfo callbackInfo, @Share(value="noRotateYaw") LocalFloatRef localFloatRef, @Share(value="noRotatePitch") LocalFloatRef localFloatRef2) {
        if (!L.X.N() || this.minecraft.player == null) {
            return;
        }
        float f = localFloatRef.get();
        float f2 = localFloatRef2.get();
        this.minecraft.player.setYRot(f + 1.0E-6f);
        this.minecraft.player.setXRot(f2 + 1.0E-6f);
        this.minecraft.player.yHeadRot = f;
        this.minecraft.player.yBodyRot = f;
    }

    @Inject(method={"handleAddEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void onHandleAddEntity(ClientboundAddEntityPacket clientboundAddEntityPacket, CallbackInfo callbackInfo) {
        if (clientboundAddEntityPacket != null && eC.T.N() && eC.T.j(new Object[]{clientboundAddEntityPacket.getType()}) && ((Boolean)eC.T.J.z()).booleanValue()) {
            callbackInfo.cancel();
        }
    }
}
