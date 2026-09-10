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

record _F(float uc, float uN, float uU, float uo, float u9, float uj, float uq, float uw, float uK, float u6, float uY) implements DynamicUniformStorage.DynamicUniform
{
    private final float uc;
    private final float uN;
    private final float uU;
    private final float uo;
    private final float u9;
    private final float uj;
    private final float uq;
    private final float uw;
    private final float uK;
    private final float u6;
    private final float uY;

    public void write(ByteBuffer byteBuffer) {
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)_F.m("sGMOdSej10LgDZab", putVec4(float float float float ), (Std140Builder)hi.a("G", (Object)byteBuffer, (long)1267780619223285422L), (float)hi.a("\u00e9", (Object)this, (long)1331769047126084517L), (float)hi.a("\u00e9", (Object)this, (long)1202281788675139114L), (float)hi.a("\u00e9", (Object)this, (long)910510207452190733L), (float)hi.a("\u00e9", (Object)this, (long)1068733314509629180L)), (float)hi.a("\u00e9", (Object)this, (long)466980035945342664L), (float)hi.a("\u00e9", (Object)this, (long)547855986145846401L), (float)hi.a("\u00e9", (Object)this, (long)713966025469457984L), (float)hi.a("\u00e9", (Object)this, (long)937028120015111050L), (long)651805384725515153L), (float)hi.a("\u00e9", (Object)this, (long)1309279371745356098L), (float)hi.a("\u00e9", (Object)this, (long)1013259276946645231L), (float)hi.a("\u00e9", (Object)this, (long)780212421565188584L), (float)0.0f, (long)651805384725515153L);
    }

    public float uc() {
        return (float)hi.a("\u00e9", (Object)this, (long)780212421565188584L);
    }

    public float uo() {
        return (float)hi.a("\u00e9", (Object)this, (long)1202281788675139114L);
    }

    public float uK() {
        return (float)hi.a("\u00e9", (Object)this, (long)466980035945342664L);
    }

    public float uN() {
        return (float)hi.a("\u00e9", (Object)this, (long)937028120015111050L);
    }

    public float uU() {
        return (float)hi.a("\u00e9", (Object)this, (long)1331769047126084517L);
    }

    public float uY() {
        return (float)hi.a("\u00e9", (Object)this, (long)910510207452190733L);
    }

    public float u6() {
        return (float)hi.a("\u00e9", (Object)this, (long)1068733314509629180L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_F.class, "uU;uo;uY;u6;uK;uj;u9;uN;uw;uq;uc", "uU", "uo", "uY", "u6", "uK", "uj", "u9", "uN", "uw", "uq", "uc"}, this);
    }

    private _F(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.uU = f;
        this.uo = f2;
        this.uY = f3;
        this.u6 = f4;
        this.uK = f5;
        this.uj = f6;
        this.u9 = f7;
        this.uN = f8;
        this.uw = f9;
        this.uq = f10;
        this.uc = f11;
    }

    public float u9() {
        return (float)hi.a("\u00e9", (Object)this, (long)713966025469457984L);
    }

    public float uq() {
        return (float)hi.a("\u00e9", (Object)this, (long)1013259276946645231L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_F.class, "uU;uo;uY;u6;uK;uj;u9;uN;uw;uq;uc", "uU", "uo", "uY", "u6", "uK", "uj", "u9", "uN", "uw", "uq", "uc"}, this, object);
    }

    public float uj() {
        return (float)hi.a("\u00e9", (Object)this, (long)547855986145846401L);
    }

    public float uw() {
        return (float)hi.a("\u00e9", (Object)this, (long)1309279371745356098L);
    }

    private _F(Color color, Color color2, int n, int n2, float f) {
        this((float)color.getRed() / 255.0f, (float)_F.m("sGMOdSej10LgDZab", getGreen(), (Color)color) / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f, (float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)_F.m("sGMOdSej10LgDZab", getBlue(), (Color)color2) / 255.0f, (float)_F.m("sGMOdSej10LgDZab", getAlpha(), (Color)color2) / 255.0f, n, n2, f);
    }

    public static /* bridge */ /* synthetic */ CallSite m(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_F.class, "uU;uo;uY;u6;uK;uj;u9;uN;uw;uq;uc", "uU", "uo", "uY", "u6", "uK", "uj", "u9", "uN", "uw", "uq", "uc"}, this);
    }
}
