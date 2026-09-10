/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.DynamicUniformStorage;

record lu(float ay, float ar, float aF, float a4) implements DynamicUniformStorage.DynamicUniform
{
    private final float ay;
    private final float ar;
    private final float aF;
    private final float a4;

    public float ar() {
        return (float)hi.a("\u00e9", (Object)this, (long)546739308473877712L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lu.class, "aF;a4;ar;ay", "aF", "a4", "ar", "ay"}, this);
    }

    public float aF() {
        return (float)hi.a("\u00e9", (Object)this, (long)491974613959269557L);
    }

    public void write(ByteBuffer byteBuffer) {
        hi.a("\u00a5", (Object)hi.a("G", (Object)byteBuffer, (long)1267780619223285422L), (float)hi.a("\u00e9", (Object)this, (long)491974613959269557L), (float)hi.a("\u00e9", (Object)this, (long)947460969808389145L), (float)hi.a("\u00e9", (Object)this, (long)546739308473877712L), (float)hi.a("\u00e9", (Object)this, (long)364659045714822123L), (long)651805384725515153L);
    }

    public float ay() {
        return (float)hi.a("\u00e9", (Object)this, (long)364659045714822123L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lu.class, "aF;a4;ar;ay", "aF", "a4", "ar", "ay"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lu.class, "aF;a4;ar;ay", "aF", "a4", "ar", "ay"}, this);
    }

    private lu(Color color) {
        this((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    private lu(float f, float f2, float f3, float f4) {
        this.aF = f;
        this.a4 = f2;
        this.ar = f3;
        this.ay = f4;
    }

    public float a4() {
        return (float)hi.a("\u00e9", (Object)this, (long)947460969808389145L);
    }
}
