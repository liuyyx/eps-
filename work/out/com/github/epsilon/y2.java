/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.minecraft.client.gui.navigation.ScreenRectangle
 *  net.minecraft.client.gui.render.TextureSetup
 *  net.minecraft.client.renderer.StagedVertexBuffer$Draw
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.gui.render.TextureSetup;
import net.minecraft.client.renderer.StagedVertexBuffer;

final class y2
extends Record {
    private final TextureSetup ul;
    private final ScreenRectangle dv;
    private final StagedVertexBuffer.Draw SG;
    private final RenderPipeline gs;

    public ScreenRectangle Dv() {
        return hi.a("\u00e9", (Object)this, (long)848308305836102011L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{y2.class, "SG;gs;ul;dv", "SG", "gs", "ul", "dv"}, this, object);
    }

    private y2(StagedVertexBuffer.Draw draw, RenderPipeline renderPipeline, TextureSetup textureSetup, ScreenRectangle screenRectangle) {
        this.SG = draw;
        this.gs = renderPipeline;
        this.ul = textureSetup;
        this.dv = screenRectangle;
    }

    public StagedVertexBuffer.Draw SG() {
        return hi.a("\u00e9", (Object)this, (long)1081675366265155799L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{y2.class, "SG;gs;ul;dv", "SG", "gs", "ul", "dv"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{y2.class, "SG;gs;ul;dv", "SG", "gs", "ul", "dv"}, this);
    }

    public RenderPipeline gs() {
        return hi.a("\u00e9", (Object)this, (long)404064843334172543L);
    }

    public TextureSetup ul() {
        return hi.a("\u00e9", (Object)this, (long)1056628561634893820L);
    }
}
