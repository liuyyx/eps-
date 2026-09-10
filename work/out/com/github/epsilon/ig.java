/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.DynamicUniformStorage;

final class ig
extends Record
implements DynamicUniformStorage.DynamicUniform {
    private final float a3;
    private final float AM;
    private final float a9;
    private final float a1;
    private final float ag;
    private final float AE;
    private final float al;

    public float A1() {
        return (float)hi.a("\u00e9", (Object)this, (long)493802963822512616L);
    }

    public float Ag() {
        return (float)hi.a("\u00e9", (Object)this, (long)747120549650845456L);
    }

    public static /* bridge */ /* synthetic */ CallSite o(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public float AM() {
        return (float)hi.a("\u00e9", (Object)this, (long)551609650128350502L);
    }

    public float AE() {
        return (float)hi.a("\u00e9", (Object)this, (long)508514756218258885L);
    }

    public float A9() {
        return (float)hi.a("\u00e9", (Object)this, (long)901976122506591358L);
    }

    public float Al() {
        return (float)hi.a("\u00e9", (Object)this, (long)507681996347709103L);
    }

    public float A3() {
        return (float)hi.a("\u00e9", (Object)this, (long)422559178889745020L);
    }

    private ig(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a1 = f;
        this.AE = f2;
        this.ag = f3;
        this.AM = f4;
        this.al = f5;
        this.a3 = f6;
        this.a9 = f7;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ig.class, "a1;AE;ag;AM;al;a3;a9", "a1", "AE", "ag", "AM", "al", "a3", "a9"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ig.class, "a1;AE;ag;AM;al;a3;a9", "a1", "AE", "ag", "AM", "al", "a3", "a9"}, this, object);
    }

    public void write(ByteBuffer byteBuffer) {
        hi.a("\u00a5", (Object)ig.o("tOecfMSKN4R07W4t", putVec4(float float float float ), (Std140Builder)hi.a("G", (Object)byteBuffer, (long)1267780619223285422L), (float)hi.a("\u00e9", (Object)this, (long)493802963822512616L), (float)hi.a("\u00e9", (Object)this, (long)508514756218258885L), (float)hi.a("\u00e9", (Object)this, (long)747120549650845456L), (float)0.0f), (float)hi.a("\u00e9", (Object)this, (long)551609650128350502L), (float)hi.a("\u00e9", (Object)this, (long)507681996347709103L), (float)hi.a("\u00e9", (Object)this, (long)422559178889745020L), (float)hi.a("\u00e9", (Object)this, (long)901976122506591358L), (long)651805384725515153L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ig.class, "a1;AE;ag;AM;al;a3;a9", "a1", "AE", "ag", "AM", "al", "a3", "a9"}, this);
    }
}
