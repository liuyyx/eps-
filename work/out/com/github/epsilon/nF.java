/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.core.BlockPos;

record nF(BlockPos _c, double zw, double z9) {
    private final BlockPos _c;
    private final double zw;
    private final double z9;

    public double zw() {
        return (double)hi.a("\u00e9", (Object)this, (long)858030426566143772L);
    }

    private double z() {
        return (double)(hi.a("\u00e9", (Object)this, (long)1106256443582836311L) + hi.a("\u00e9", (Object)this, (long)858030426566143772L));
    }

    private nF(BlockPos blockPos, double d, double d2) {
        this._c = blockPos;
        this.z9 = d;
        this.zw = d2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nF.class, "_c;z9;zw", "_c", "z9", "zw"}, this);
    }

    public double z9() {
        return (double)hi.a("\u00e9", (Object)this, (long)1106256443582836311L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nF.class, "_c;z9;zw", "_c", "z9", "zw"}, this);
    }

    public BlockPos _c() {
        return hi.a("\u00e9", (Object)this, (long)1003350343767375390L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nF.class, "_c;z9;zw", "_c", "z9", "zw"}, this, object);
    }
}
