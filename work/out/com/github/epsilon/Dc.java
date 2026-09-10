/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 */
package com.github.epsilon;

import com.github.epsilon.hi;
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

record Dc(Color ht, Color hU, Color hw, Color h3, Color he, Color hQ) implements DynamicUniformStorage.DynamicUniform
{
    private final Color ht;
    private final Color hU;
    private final Color hw;
    private final Color h3;
    private final Color he;
    private final Color hQ;

    public Color ht() {
        return hi.a("\u00e9", (Object)this, (long)658504217987229498L);
    }

    public Color h3() {
        return hi.a("\u00e9", (Object)this, (long)481499621109623539L);
    }

    private Dc(Color color, Color color2, Color color3, Color color4, Color color5, Color color6) {
        this.h3 = color;
        this.hU = color2;
        this.ht = color3;
        this.hQ = color4;
        this.he = color5;
        this.hw = color6;
    }

    public Color hQ() {
        return hi.a("\u00e9", (Object)this, (long)537208058740947499L);
    }

    public void write(ByteBuffer byteBuffer) {
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)byteBuffer, (long)1267780619223285422L), (float)Dc.y("zlyeGnrn709S3YqQ", x(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)481499621109623539L))), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)481499621109623539L), (long)1180883530842216139L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)481499621109623539L), (long)396679003820117897L), (float)Dc.y("zlyeGnrn709S3YqQ", h(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)481499621109623539L))), (long)651805384725515153L), (float)Dc.y("zlyeGnrn709S3YqQ", x(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)1129478093656833091L))), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)1129478093656833091L), (long)1180883530842216139L), (float)Dc.y("zlyeGnrn709S3YqQ", Q(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)1129478093656833091L))), (float)Dc.y("zlyeGnrn709S3YqQ", h(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)1129478093656833091L))), (long)651805384725515153L), (float)Dc.y("zlyeGnrn709S3YqQ", x(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)658504217987229498L))), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)658504217987229498L), (long)1180883530842216139L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)658504217987229498L), (long)396679003820117897L), (float)Dc.y("zlyeGnrn709S3YqQ", h(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)658504217987229498L))), (long)651805384725515153L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)537208058740947499L), (long)1313007246918311527L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)537208058740947499L), (long)1180883530842216139L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)537208058740947499L), (long)396679003820117897L), (float)Dc.y("zlyeGnrn709S3YqQ", h(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)537208058740947499L))), (long)651805384725515153L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)838187648309494962L), (long)1313007246918311527L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)838187648309494962L), (long)1180883530842216139L), (float)Dc.y("zlyeGnrn709S3YqQ", Q(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)838187648309494962L))), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)838187648309494962L), (long)1328659948673854564L), (long)651805384725515153L), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)466313049879494470L), (long)1313007246918311527L), (float)Dc.y("zlyeGnrn709S3YqQ", k(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)466313049879494470L))), (float)Dc.y("zlyeGnrn709S3YqQ", Q(java.awt.Color ), (Color)((Object)hi.a("\u00e9", (Object)this, (long)466313049879494470L))), (float)hi.a("G", (Object)hi.a("\u00e9", (Object)this, (long)466313049879494470L), (long)1328659948673854564L), (long)651805384725515153L);
    }

    public Color he() {
        return hi.a("\u00e9", (Object)this, (long)838187648309494962L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dc.class, "h3;hU;ht;hQ;he;hw", "h3", "hU", "ht", "hQ", "he", "hw"}, this);
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

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dc.class, "h3;hU;ht;hQ;he;hw", "h3", "hU", "ht", "hQ", "he", "hw"}, this);
    }

    public Color hw() {
        return hi.a("\u00e9", (Object)this, (long)466313049879494470L);
    }

    public Color hU() {
        return hi.a("\u00e9", (Object)this, (long)1129478093656833091L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dc.class, "h3;hU;ht;hQ;he;hw", "h3", "hU", "ht", "hQ", "he", "hw"}, this, object);
    }
}
