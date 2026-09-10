/*
 * Decompiled with CFR 0.152.
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

record Dh(float zG, float zo, float z5, float z7) {
    private final float zG;
    private final float zo;
    private final float z5;
    private final float z7;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Dh.class, "zG;zo;z7;z5", "zG", "zo", "z7", "z5"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Dh.class, "zG;zo;z7;z5", "zG", "zo", "z7", "z5"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Dh.class, "zG;zo;z7;z5", "zG", "zo", "z7", "z5"}, this);
    }

    public float zG() {
        return (float)hi.a("\u00e9", (Object)this, (long)807290222534318127L);
    }

    public float zo() {
        return (float)hi.a("\u00e9", (Object)this, (long)1275863169383953995L);
    }

    private float K() {
        return (float)(hi.a("\u00e9", (Object)this, (long)1268031882135282751L) - hi.a("\u00e9", (Object)this, (long)807290222534318127L));
    }

    public float z5() {
        return (float)hi.a("\u00e9", (Object)this, (long)831907266935874213L);
    }

    private Dh(float f, float f2, float f3, float f4) {
        this.zG = f;
        this.zo = f2;
        this.z7 = f3;
        this.z5 = f4;
    }

    private float z() {
        return (float)(hi.a("\u00e9", (Object)this, (long)831907266935874213L) - hi.a("\u00e9", (Object)this, (long)1275863169383953995L));
    }

    public float z7() {
        return (float)hi.a("\u00e9", (Object)this, (long)1268031882135282751L);
    }

    private Dh z(Dh dh) {
        return new Dh((float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)807290222534318127L), (float)hi.a("\u00e9", (Object)dh, (long)807290222534318127L), (long)971000971621905228L), (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)1275863169383953995L), (float)hi.a("\u00e9", (Object)dh, (long)1275863169383953995L), (long)971000971621905228L), (float)Dh.x("YQTbGVIYwV9L7K72", max(float float ), (float)hi.a("\u00e9", (Object)this, (long)1268031882135282751L), (float)hi.a("\u00e9", (Object)dh, (long)1268031882135282751L)), (float)hi.a("G", (float)hi.a("\u00e9", (Object)this, (long)831907266935874213L), (float)hi.a("\u00e9", (Object)dh, (long)831907266935874213L), (long)1021203527991582354L));
    }

    public static /* bridge */ /* synthetic */ CallSite x(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
