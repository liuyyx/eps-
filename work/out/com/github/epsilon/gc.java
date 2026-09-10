/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.phys.Vec3
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.OH;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;

public class gc {
    public final Vec3 G;
    public final BlockPos l;
    public final BlockPos[] M;
    public final OH U;

    public static /* bridge */ /* synthetic */ CallSite D(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public BlockPos[] I(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)650201990325880389L);
    }

    public gc(BlockPos blockPos, OH oH) {
        block7: {
            block6: {
                this.l = blockPos;
                this.U = oH;
                boolean bl = Dl.t();
                if (bl) break block6;
                switch (hi.a("j", (long)1171662760430505759L)[hi.a("\u00a5", (Object)((Object)oH), (long)791115087570335659L)]) {
                    case 1: {
                        this.M = new BlockPos[]{blockPos};
                        this.G = new Vec3((double)hi.a("\u00a5", (Object)blockPos, (long)918555824711552631L) + 0.5, (double)hi.a("\u00a5", (Object)blockPos, (long)491002271509294121L), (double)hi.a("\u00a5", (Object)blockPos, (long)1003954676294969181L) + 0.5);
                        if (!bl) break block7;
                    }
                    case 2: {
                        this.M = new BlockPos[]{blockPos, gc.D("O6swkG1IvDBVbi9Q", offset(int int int ), (BlockPos)blockPos, (int)1, (int)0, (int)0)};
                        this.G = new Vec3((double)(hi.a("\u00a5", (Object)blockPos, (long)918555824711552631L) + true), (double)gc.D("O6swkG1IvDBVbi9Q", getY(), (BlockPos)blockPos), (double)hi.a("\u00a5", (Object)blockPos, (long)1003954676294969181L) + 0.5);
                        if (!bl) break block7;
                    }
                    case 3: {
                        this.M = new BlockPos[]{blockPos, hi.a("\u00a5", (Object)blockPos, (int)0, (int)0, (int)1, (long)472712578670837724L)};
                        this.G = new Vec3((double)hi.a("\u00a5", (Object)blockPos, (long)918555824711552631L) + 0.5, (double)hi.a("\u00a5", (Object)blockPos, (long)491002271509294121L), (double)(hi.a("\u00a5", (Object)blockPos, (long)1003954676294969181L) + true));
                        if (!bl) break block7;
                    }
                    case 4: {
                        this.M = new BlockPos[]{blockPos, hi.a("\u00a5", (Object)blockPos, (int)1, (int)0, (int)0, (long)472712578670837724L), gc.D("O6swkG1IvDBVbi9Q", offset(int int int ), (BlockPos)blockPos, (int)0, (int)0, (int)1), hi.a("\u00a5", (Object)blockPos, (int)1, (int)0, (int)1, (long)472712578670837724L)};
                        this.G = new Vec3((double)(hi.a("\u00a5", (Object)blockPos, (long)918555824711552631L) + true), (double)hi.a("\u00a5", (Object)blockPos, (long)491002271509294121L), (double)(hi.a("\u00a5", (Object)blockPos, (long)1003954676294969181L) + true));
                        if (!bl) break block7;
                    }
                    default: {
                        this.M = new BlockPos[0];
                    }
                }
            }
            this.G = new Vec3((double)hi.a("\u00a5", (Object)blockPos, (long)918555824711552631L) + 0.5, (double)hi.a("\u00a5", (Object)blockPos, (long)491002271509294121L), (double)hi.a("\u00a5", (Object)blockPos, (long)1003954676294969181L) + 0.5);
        }
    }
}
