/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.network.protocol.game.ServerboundPlayerActionPacket
 *  net.minecraft.network.protocol.game.ServerboundPlayerActionPacket$Action
 */
package com.github.epsilon;

import com.github.epsilon.eb;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;

class nC
extends TimerTask {
    final eb E;
    final BlockPos h;
    final Timer l;

    private void lambda$run$0(BlockPos blockPos) {
        hi.a("\u00a5", (Object)nC.T("qqXvedRlSVb2lHuk", getConnection(), (Minecraft)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)910942982764424574L)}, (long)445967056438668250L)), (Object)new ServerboundPlayerActionPacket((ServerboundPlayerActionPacket.Action)hi.a("j", (long)863379848889925463L), blockPos, (Direction)hi.a("G", (Object)new Object[]{blockPos}, (long)763692859447227856L)), (long)367302555785540234L);
    }

    nC(eb eb2, BlockPos blockPos, Timer timer) {
        this.h = blockPos;
        this.l = timer;
        eb eb3 = eb2;
        Objects.requireNonNull(eb3);
        this.E = eb3;
    }

    @Override
    public void run() {
        hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)910942982764424574L)}, (long)920751587941449982L), () -> this.lambda$run$0((BlockPos)hi.a("\u00e9", (Object)this, (long)703660883465157187L)), (long)795757481256886430L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)749224013091472025L), (long)858514297348930932L);
    }

    public static /* bridge */ /* synthetic */ CallSite T(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }
}
