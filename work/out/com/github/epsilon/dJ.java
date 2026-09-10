/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientPacketListener
 *  net.minecraft.network.protocol.Packet
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.Packet;

final class dJ
extends Record {
    private final long cj;
    private final Packet<? super ClientPacketListener> ao;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dJ.class, "ao;cj", "ao", "cj"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dJ.class, "ao;cj", "ao", "cj"}, this, object);
    }

    private dJ(Packet<? super ClientPacketListener> packet, long l) {
        this.ao = packet;
        this.cj = l;
    }

    public long cj() {
        return (long)hi.a("\u00e9", (Object)this, (long)632302640681724679L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dJ.class, "ao;cj", "ao", "cj"}, this);
    }

    public Packet<? super ClientPacketListener> ao() {
        return hi.a("\u00e9", (Object)this, (long)704015553413273624L);
    }
}
