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

public final class gU
extends Record
implements yM {
    private final float rA;
    private final Xu scissor;
    private final int layer;
    private final float[] n8;
    private final float rL;
    private final long sequence;
    private final float rm;
    private final XL bounds;
    private final float[] nK;
    private final int zF;
    private final float[] nx;
    private final Color dg;
    private final float r8;
    private final float rE;

    public Color Dg() {
        return hi.a("\u00e9", (Object)this, (long)727288462058758451L);
    }

    public float r8() {
        return (float)hi.a("\u00e9", (Object)this, (long)811799636444369795L);
    }

    @Override
    public XL bounds() {
        return hi.a("\u00e9", (Object)this, (long)1267868653113913463L);
    }

    public float rL() {
        return (float)hi.a("\u00e9", (Object)this, (long)701168628032938877L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gU.class, "layer;sequence;bounds;scissor;rL;rE;r8;rm;rA;dg;nK;n8;nx;zF", "layer", "sequence", "bounds", "scissor", "rL", "rE", "r8", "rm", "rA", "dg", "nK", "n8", "nx", "zF"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gU.class, "layer;sequence;bounds;scissor;rL;rE;r8;rm;rA;dg;nK;n8;nx;zF", "layer", "sequence", "bounds", "scissor", "rL", "rE", "r8", "rm", "rA", "dg", "nK", "n8", "nx", "zF"}, this);
    }

    public float rA() {
        return (float)hi.a("\u00e9", (Object)this, (long)738755563415091150L);
    }

    @Override
    public long sequence() {
        return (long)hi.a("\u00e9", (Object)this, (long)613841542816180468L);
    }

    public float[] n8() {
        return hi.a("\u00e9", (Object)this, (long)1334708741381483618L);
    }

    public static /* bridge */ /* synthetic */ CallSite W(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public int layer() {
        return (int)hi.a("\u00e9", (Object)this, (long)1284656622634645879L);
    }

    @Override
    public XL g() {
        CallSite callSite = hi.a("G", (float)0.0f, (float)hi.a("\u00e9", (Object)this, (long)738755563415091150L), (long)1021203527991582354L);
        return gU.W("qIAfgSBtDwM9hJzE", F(float float float float ), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1267868653113913463L), (long)1000184271683925771L) - callSite), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1267868653113913463L), (long)1126301546035170366L) - callSite), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1267868653113913463L), (long)1144554771357166897L) + callSite * 2.0f), (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1267868653113913463L), (long)787161521195921883L) + callSite * 2.0f));
    }

    public float rm() {
        return (float)hi.a("\u00e9", (Object)this, (long)705992317607436120L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gU.class, "layer;sequence;bounds;scissor;rL;rE;r8;rm;rA;dg;nK;n8;nx;zF", "layer", "sequence", "bounds", "scissor", "rL", "rE", "r8", "rm", "rA", "dg", "nK", "n8", "nx", "zF"}, this, object);
    }

    @Override
    public Xu scissor() {
        return hi.a("\u00e9", (Object)this, (long)1174749680086084382L);
    }

    public float[] nx() {
        return hi.a("\u00e9", (Object)this, (long)1328561948319430800L);
    }

    public int zF() {
        return (int)hi.a("\u00e9", (Object)this, (long)1010111004944920813L);
    }

    @Override
    public y3 a() {
        return hi.a("j", (long)1073215605179372184L);
    }

    public gU(int n, long l, XL xL, Xu xu, float f, float f2, float f3, float f4, float f5, Color color, float[] fArray, float[] fArray2, float[] fArray3, int n2) {
        this.layer = n;
        this.sequence = l;
        this.bounds = xL;
        this.scissor = xu;
        this.rL = f;
        this.rE = f2;
        this.r8 = f3;
        this.rm = f4;
        this.rA = f5;
        this.dg = color;
        this.nK = fArray;
        this.n8 = fArray2;
        this.nx = fArray3;
        this.zF = n2;
    }

    public float rE() {
        return (float)hi.a("\u00e9", (Object)this, (long)1319900338498534673L);
    }

    public float[] nK() {
        return hi.a("\u00e9", (Object)this, (long)991066155969873376L);
    }
}
