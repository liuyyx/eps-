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
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.DynamicUniformStorage;

record uw(float kZ, float kB) implements DynamicUniformStorage.DynamicUniform
{
    private final float kZ;
    private final float kB;

    public void write(ByteBuffer byteBuffer) {
        uw.y("vtaZUCATgp5l9oyD", putVec4(float float float float ), (Std140Builder)hi.a("G", (Object)byteBuffer, (long)1267780619223285422L), (float)hi.a("\u00e9", (Object)this, (long)432105528606528882L), (float)hi.a("\u00e9", (Object)this, (long)409669150142335101L), (float)(1.0f / hi.a("\u00e9", (Object)this, (long)432105528606528882L)), (float)(1.0f / hi.a("\u00e9", (Object)this, (long)409669150142335101L)));
    }

    public float kZ() {
        return (float)hi.a("\u00e9", (Object)this, (long)432105528606528882L);
    }

    public float kB() {
        return (float)hi.a("\u00e9", (Object)this, (long)409669150142335101L);
    }

    public static /* bridge */ /* synthetic */ CallSite y(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
