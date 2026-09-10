/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.phys.BlockHitResult
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;

final class di
extends Record {
    private final boolean pe;
    private final BlockHitResult cx;
    private final BlockPos ds;

    public BlockHitResult Cx() {
        return hi.a("\u00e9", (Object)this, (long)971319454722928667L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{di.class, "ds;cx;pe", "ds", "cx", "pe"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{di.class, "ds;cx;pe", "ds", "cx", "pe"}, this);
    }

    public boolean pe() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)698332063773795367L);
    }

    public BlockPos ds() {
        return hi.a("\u00e9", (Object)this, (long)902616351299197447L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{di.class, "ds;cx;pe", "ds", "cx", "pe"}, this);
    }

    private di(BlockPos blockPos, BlockHitResult blockHitResult, boolean bl) {
        this.ds = blockPos;
        this.cx = blockHitResult;
        this.pe = bl;
    }
}
