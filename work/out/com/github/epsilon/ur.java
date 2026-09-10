/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.DynamicUniformStorage;

record ur(float gO, float gE, float gw) implements DynamicUniformStorage.DynamicUniform
{
    private final float gO;
    private final float gE;
    private final float gw;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ur.class, "gO;gw;gE", "gO", "gw", "gE"}, this);
    }

    public void write(ByteBuffer byteBuffer) {
        hi.a("\u00a5", (Object)ur.S("W129Bn7edY2oaCBZ", intoBuffer(java.nio.ByteBuffer ), (ByteBuffer)byteBuffer), (float)hi.a("\u00e9", (Object)this, (long)1286190181566886908L), (float)hi.a("\u00e9", (Object)this, (long)1041484583118190644L), (float)hi.a("\u00e9", (Object)this, (long)704972656940285972L), (float)0.0f, (long)651805384725515153L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ur.class, "gO;gw;gE", "gO", "gw", "gE"}, this, object);
    }

    public float gO() {
        return (float)hi.a("\u00e9", (Object)this, (long)1286190181566886908L);
    }

    public float gw() {
        return (float)hi.a("\u00e9", (Object)this, (long)1041484583118190644L);
    }

    public float gE() {
        return (float)hi.a("\u00e9", (Object)this, (long)704972656940285972L);
    }

    private ur(float f, float f2, float f3) {
        this.gO = f;
        this.gw = f2;
        this.gE = f3;
    }

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ur.class, "gO;gw;gE", "gO", "gw", "gE"}, this);
    }
}
