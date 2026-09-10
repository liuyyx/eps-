/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.IndexType
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.textures.GpuTextureView
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class d5
extends Record {
    private final IndexType LY;
    private final GpuBufferSlice FX;
    private final int a2;
    private final GpuTextureView tu;
    private final GpuTextureView tO;
    private final GpuBuffer qS;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{d5.class, "tO;tu;LY;qS;a2;FX", "tO", "tu", "LY", "qS", "a2", "FX"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d5.class, "tO;tu;LY;qS;a2;FX", "tO", "tu", "LY", "qS", "a2", "FX"}, this, object);
    }

    public d5(GpuTextureView gpuTextureView, GpuTextureView gpuTextureView2, IndexType indexType, GpuBuffer gpuBuffer, int n, GpuBufferSlice gpuBufferSlice) {
        this.tO = gpuTextureView;
        this.tu = gpuTextureView2;
        this.LY = indexType;
        this.qS = gpuBuffer;
        this.a2 = n;
        this.FX = gpuBufferSlice;
    }

    public GpuBuffer qS() {
        return hi.a("\u00e9", (Object)this, (long)1193427857936142041L);
    }

    public int A2() {
        return (int)hi.a("\u00e9", (Object)this, (long)1104912988475952786L);
    }

    public GpuTextureView tO() {
        return hi.a("\u00e9", (Object)this, (long)491076956765119819L);
    }

    public IndexType LY() {
        return hi.a("\u00e9", (Object)this, (long)687422961552741215L);
    }

    public GpuTextureView tu() {
        return hi.a("\u00e9", (Object)this, (long)507735967250224125L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d5.class, "tO;tu;LY;qS;a2;FX", "tO", "tu", "LY", "qS", "a2", "FX"}, this);
    }

    public GpuBufferSlice FX() {
        return hi.a("\u00e9", (Object)this, (long)1036058845946861481L);
    }
}
