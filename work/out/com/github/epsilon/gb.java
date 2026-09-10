/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 */
package com.github.epsilon;

import com.github.epsilon._X;
import com.github.epsilon.hi;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class gb
extends Record {
    private final _X gl;
    private final RenderPipeline zj;

    private gb(RenderPipeline renderPipeline, _X _X2) {
        this.zj = renderPipeline;
        this.gl = _X2;
    }

    public RenderPipeline Zj() {
        return hi.a("\u00e9", (Object)this, (long)586287514259576596L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gb.class, "zj;gl", "zj", "gl"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gb.class, "zj;gl", "zj", "gl"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gb.class, "zj;gl", "zj", "gl"}, this);
    }

    public _X Gl() {
        return hi.a("\u00e9", (Object)this, (long)1219473342703433394L);
    }
}
