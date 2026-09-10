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

record iz(float yM, float yN, float yY, float y5, float yw, float yZ, float yz, float yt, float yp, float yx, float ya, float ye, float yg, float yC) implements DynamicUniformStorage.DynamicUniform
{
    private final float yM;
    private final float yN;
    private final float yY;
    private final float y5;
    private final float yw;
    private final float yZ;
    private final float yz;
    private final float yt;
    private final float yp;
    private final float yx;
    private final float ya;
    private final float ye;
    private final float yg;
    private final float yC;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iz.class, "yg;yY;ya;yt;yN;yC;yZ;yz;y5;ye;yM;yp;yx;yw", "yg", "yY", "ya", "yt", "yN", "yC", "yZ", "yz", "y5", "ye", "yM", "yp", "yx", "yw"}, this);
    }

    public float ya() {
        return (float)hi.a("\u00e9", (Object)this, (long)980162077707865767L);
    }

    public float yp() {
        return (float)hi.a("\u00e9", (Object)this, (long)897131811940706518L);
    }

    public void write(ByteBuffer byteBuffer) {
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)iz.s("h8elCqqaD2Y5VDrN", putFloat(float ), (Std140Builder)iz.s("h8elCqqaD2Y5VDrN", putFloat(float ), (Std140Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)iz.s("h8elCqqaD2Y5VDrN", putFloat(float ), (Std140Builder)hi.a("\u00a5", (Object)iz.s("h8elCqqaD2Y5VDrN", putFloat(float ), (Std140Builder)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)iz.s("h8elCqqaD2Y5VDrN", intoBuffer(java.nio.ByteBuffer ), (ByteBuffer)byteBuffer), (float)hi.a("\u00e9", (Object)this, (long)1259288317507481101L), (float)hi.a("\u00e9", (Object)this, (long)771498408097030701L), (long)1226956754845660592L), (float)(1.0f / hi.a("\u00e9", (Object)this, (long)1259288317507481101L)), (float)(1.0f / hi.a("\u00e9", (Object)this, (long)771498408097030701L)), (long)1226956754845660592L), (float)hi.a("\u00e9", (Object)this, (long)980162077707865767L)), (float)hi.a("\u00e9", (Object)this, (long)1077756229359044639L), (long)501920775842554362L), (float)hi.a("\u00e9", (Object)this, (long)1124238209878183031L)), (float)hi.a("\u00e9", (Object)this, (long)663604653945469446L), (long)501920775842554362L), (float)hi.a("\u00e9", (Object)this, (long)565732805764570062L), (long)501920775842554362L), (float)hi.a("\u00e9", (Object)this, (long)839759968655887660L)), (float)hi.a("\u00e9", (Object)this, (long)597931243773351310L)), (float)hi.a("\u00e9", (Object)this, (long)1061196889739933631L), (long)501920775842554362L), (float)hi.a("\u00e9", (Object)this, (long)983266079106532020L), (long)501920775842554362L), (float)hi.a("\u00e9", (Object)this, (long)897131811940706518L), (float)hi.a("\u00e9", (Object)this, (long)654825797320499057L), (long)1226956754845660592L), (float)hi.a("\u00e9", (Object)this, (long)485960676831719872L), (long)501920775842554362L);
    }

    public float yN() {
        return (float)hi.a("\u00e9", (Object)this, (long)1124238209878183031L);
    }

    public float yY() {
        return (float)hi.a("\u00e9", (Object)this, (long)771498408097030701L);
    }

    public float yz() {
        return (float)hi.a("\u00e9", (Object)this, (long)839759968655887660L);
    }

    public float yg() {
        return (float)hi.a("\u00e9", (Object)this, (long)1259288317507481101L);
    }

    public float yZ() {
        return (float)hi.a("\u00e9", (Object)this, (long)565732805764570062L);
    }

    public float y5() {
        return (float)hi.a("\u00e9", (Object)this, (long)597931243773351310L);
    }

    public float yw() {
        return (float)hi.a("\u00e9", (Object)this, (long)485960676831719872L);
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

    public float yx() {
        return (float)hi.a("\u00e9", (Object)this, (long)654825797320499057L);
    }

    public float yt() {
        return (float)hi.a("\u00e9", (Object)this, (long)1077756229359044639L);
    }

    public float yC() {
        return (float)hi.a("\u00e9", (Object)this, (long)663604653945469446L);
    }

    public float yM() {
        return (float)hi.a("\u00e9", (Object)this, (long)983266079106532020L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iz.class, "yg;yY;ya;yt;yN;yC;yZ;yz;y5;ye;yM;yp;yx;yw", "yg", "yY", "ya", "yt", "yN", "yC", "yZ", "yz", "y5", "ye", "yM", "yp", "yx", "yw"}, this);
    }

    private iz(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.yg = f;
        this.yY = f2;
        this.ya = f3;
        this.yt = f4;
        this.yN = f5;
        this.yC = f6;
        this.yZ = f7;
        this.yz = f8;
        this.y5 = f9;
        this.ye = f10;
        this.yM = f11;
        this.yp = f12;
        this.yx = f13;
        this.yw = f14;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iz.class, "yg;yY;ya;yt;yN;yC;yZ;yz;y5;ye;yM;yp;yx;yw", "yg", "yY", "ya", "yt", "yN", "yC", "yZ", "yz", "y5", "ye", "yM", "yp", "yx", "yw"}, this, object);
    }

    public float ye() {
        return (float)hi.a("\u00e9", (Object)this, (long)1061196889739933631L);
    }
}
