/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 */
package com.github.epsilon;

import com.github.epsilon.Oq;
import com.github.epsilon.hi;
import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.DynamicUniformStorage;

final class O6
extends Record
implements DynamicUniformStorage.DynamicUniform {
    private final float cF;
    private final Oq KA;

    private O6(Oq oq, float f) {
        this.KA = oq;
        this.cF = f;
    }

    public void write(ByteBuffer byteBuffer) {
        CallSite callSite = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)1096141600595379408L);
        hi.a("\u00a5", (Object)O6.s("l4ExnLPyIuoAwyF9", putVec4(float float float float ), (Std140Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)byteBuffer, (long)1267780619223285422L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)1149921013811144383L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)514020660621652191L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)1322509246911744776L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)418240784820606591L), (long)651805384725515153L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)862138918466090350L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)558873969929256701L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)1091565493957249381L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)399642750984721975L), (long)651805384725515153L), (float)((float)hi.a("\u00a5", (Object)callSite, (long)634502724407806770L) / 255.0f), (float)((float)hi.a("\u00a5", (Object)callSite, (long)791634218836538619L) / 255.0f), (float)((float)O6.s("l4ExnLPyIuoAwyF9", getBlue(), (Color)((Object)callSite)) / 255.0f), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1287929479206555453L), (long)880522906549586679L)), (float)hi.a("\u00e9", (Object)this, (long)1264686342140221384L), (float)0.0f, (float)0.0f, (float)0.0f, (long)651805384725515153L);
    }

    public float cF() {
        return (float)hi.a("\u00e9", (Object)this, (long)1264686342140221384L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{O6.class, "KA;cF", "KA", "cF"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{O6.class, "KA;cF", "KA", "cF"}, this, object);
    }

    public Oq KA() {
        return hi.a("\u00e9", (Object)this, (long)1287929479206555453L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{O6.class, "KA;cF", "KA", "cF"}, this);
    }

    public static /* bridge */ /* synthetic */ CallSite s(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
