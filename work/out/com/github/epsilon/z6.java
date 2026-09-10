/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class z6
extends Record {
    private final GpuBufferSlice ci;
    private final GpuBufferSlice ct;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{z6.class, "ci;ct", "ci", "ct"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z6.class, "ci;ct", "ci", "ct"}, this);
    }

    private z6(GpuBufferSlice gpuBufferSlice, GpuBufferSlice gpuBufferSlice2) {
        this.ci = gpuBufferSlice;
        this.ct = gpuBufferSlice2;
    }

    public GpuBufferSlice Ci() {
        return hi.a("\u00e9", (Object)this, (long)571133323203057322L);
    }

    public GpuBufferSlice Ct() {
        return hi.a("\u00e9", (Object)this, (long)1132122069128745271L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z6.class, "ci;ct", "ci", "ct"}, this, object);
    }
}
