/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuSampler
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.textures.GpuSampler;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class lD
extends Record {
    private final GpuTextureView WB;
    private final GpuTexture tn;
    private final GpuSampler cc;

    public GpuSampler Cc() {
        return hi.a("\u00e9", (Object)this, (long)922064448042630817L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lD.class, "tn;WB;cc", "tn", "WB", "cc"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lD.class, "tn;WB;cc", "tn", "WB", "cc"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lD.class, "tn;WB;cc", "tn", "WB", "cc"}, this);
    }

    public GpuTextureView WB() {
        return hi.a("\u00e9", (Object)this, (long)720850564632026289L);
    }

    public GpuTexture tn() {
        return hi.a("\u00e9", (Object)this, (long)695396925954319352L);
    }

    private lD(GpuTexture gpuTexture, GpuTextureView gpuTextureView, GpuSampler gpuSampler) {
        this.tn = gpuTexture;
        this.WB = gpuTextureView;
        this.cc = gpuSampler;
    }
}
