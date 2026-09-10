/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  io.netty.channel.ChannelFutureListener
 *  net.minecraft.network.Connection
 *  net.minecraft.network.PacketListener
 *  net.minecraft.network.protocol.Packet
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package com.github.epsilon.mixins;

import com.github.epsilon.OK;
import com.github.epsilon._5;
import com.github.epsilon.dP;
import com.github.epsilon.dQ;
import com.github.epsilon.gH;
import com.github.epsilon.nO;
import com.github.epsilon.vy;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.netty.channel.ChannelFutureListener;
import net.minecraft.network.Connection;
import net.minecraft.network.PacketListener;
import net.minecraft.network.protocol.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={Connection.class})
public class MixinConnection {
    @WrapOperation(method={"channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/Connection;genericsFtw(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;)V")})
    private void onReceivePacket(Packet<?> packet, PacketListener packetListener, Operation<Void> operation) {
        if (OK.L.U(new Object[]{packet})) {
            return;
        }
        dP dP2 = (dP)vy.j.d(new Object[]{new dP(packet)});
        if (!dP2.l(new Object[0])) {
            operation.call(new Object[]{dP2.B(), packetListener});
        }
    }

    @WrapOperation(method={"send(Lnet/minecraft/network/protocol/Packet;Lio/netty/channel/ChannelFutureListener;Z)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/Connection;sendPacket(Lnet/minecraft/network/protocol/Packet;Lio/netty/channel/ChannelFutureListener;Z)V")})
    private void onSendPacket(Connection connection, Packet<?> packet, ChannelFutureListener channelFutureListener, boolean bl, Operation<Void> operation) {
        if (gH.v.A(new Object[]{packet})) {
            return;
        }
        if (_5.P.contains(packet)) {
            _5.P.remove(packet);
            Packet packet2 = nO.H(new Object[]{packet});
            if (packet2 != null) {
                operation.call(new Object[]{connection, packet2, channelFutureListener, bl});
            }
        } else {
            Packet packet3;
            dQ dQ2 = (dQ)vy.j.d(new Object[]{new dQ(packet)});
            if (!dQ2.l(new Object[0]) && (packet3 = nO.H(new Object[]{dQ2.N()})) != null) {
                operation.call(new Object[]{connection, packet3, channelFutureListener, bl});
            }
        }
    }
}
