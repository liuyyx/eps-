/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XL;
import com.github.epsilon.Xu;
import com.github.epsilon.hi;
import com.github.epsilon.y3;
import com.github.epsilon.yM;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;

public final class yX
extends Record
implements yM {
    private final float _P;
    private final long sequence;
    private final float _w;
    private final Xu scissor;
    private final int layer;
    private final float _y;
    private final float _v;
    private final float _b;
    private final Color cn;
    private final XL bounds;

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)1000115388002314339L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yX.class, "layer;sequence;bounds;scissor;_w;_y;_P;_b;_v;cn", "layer", "sequence", "bounds", "scissor", "_w", "_y", "_P", "_b", "_v", "cn"}, this, object);
    }

    @Override
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)1149301255194381821L);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)1049030266151094634L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yX.class, "layer;sequence;bounds;scissor;_w;_y;_P;_b;_v;cn", "layer", "sequence", "bounds", "scissor", "_w", "_y", "_P", "_b", "_v", "cn"}, this);
    }

    public float _P() {
        return (float)hi.a("\u00e9", (Object)this, (long)379548845785298541L);
    }

    public float _y() {
        return (float)hi.a("\u00e9", (Object)this, (long)535033985701545226L);
    }

    public float _v() {
        return (float)hi.a("\u00e9", (Object)this, (long)1023005502867094224L);
    }

    public float _b() {
        return (float)hi.a("\u00e9", (Object)this, (long)662302958009674851L);
    }

    public Color Cn() {
        return hi.a("\u00e9", (Object)this, (long)1143472916678779471L);
    }

    @Override
    public XL g() {
        CallSite callSite = hi.a("G", (float)0.0f, (float)(hi.a("\u00e9", (Object)this, (long)1023005502867094224L) * 0.5f), (long)1021203527991582354L);
        return yX.N("nd71qvErxIOkIG9S", F(float float float float ), (float)(yX.N("nd71qvErxIOkIG9S", bY(), (XL)((Object)hi.a("\u00e9", (Object)this, (long)1049030266151094634L))) - callSite), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1049030266151094634L), (long)1126301546035170366L) - callSite), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1049030266151094634L), (long)1144554771357166897L) + callSite * 2.0f), (float)(yX.N("nd71qvErxIOkIG9S", bo(), (XL)((Object)hi.a("\u00e9", (Object)this, (long)1049030266151094634L))) + callSite * 2.0f));
    }

    public float _w() {
        return (float)hi.a("\u00e9", (Object)this, (long)902977557883431555L);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)671395467168712317L);
    }

    public static /* bridge */ /* synthetic */ CallSite N(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public yX(int n, long l, XL xL, Xu xu, float f, float f2, float f3, float f4, float f5, Color color) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this._w = f;
        this._y = f2;
        this._P = f3;
        this._b = f4;
        this._v = f5;
        this.cn = color;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yX.class, "layer;sequence;bounds;scissor;_w;_y;_P;_b;_v;cn", "layer", "sequence", "bounds", "scissor", "_w", "_y", "_P", "_b", "_v", "cn"}, this);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)904093914666734581L);
    }
}
