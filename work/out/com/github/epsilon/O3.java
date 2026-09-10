/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;

public record O3(float qC, float qL, float qp, float qx) {
    private final float qC;
    private final float qL;
    private final float qp;
    private final float qx;

    public float qx() {
        return (float)hi.a("\u00e9", (Object)this, (long)612964688870044051L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{O3.class, "qp;qC;qL;qx", "qp", "qC", "qL", "qx"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{O3.class, "qp;qC;qL;qx", "qp", "qC", "qL", "qx"}, this);
    }

    public static O3 p(float f) {
        return new O3(f, f, f, f);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{O3.class, "qp;qC;qL;qx", "qp", "qC", "qL", "qx"}, this);
    }

    public static O3 w(float f, float f2) {
        return new O3(f, f2, f, f2);
    }

    public float qL() {
        return (float)hi.a("\u00e9", (Object)this, (long)1327108342321722473L);
    }

    public O3(float f, float f2, float f3, float f4) {
        this.qp = f;
        this.qC = f2;
        this.qL = f3;
        this.qx = f4;
    }

    public static /* bridge */ /* synthetic */ CallSite O(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public float qp() {
        return (float)hi.a("\u00e9", (Object)this, (long)1152988419572104946L);
    }

    public ih e(ih ih2) {
        return new ih((float)(O3.O("HB96Q2HCWcafIxvg", Ke(), (ih)ih2) + hi.a("\u00e9", (Object)this, (long)1152988419572104946L)), (float)(hi.a("\u00a5", (Object)ih2, (long)1092110395291557528L) + hi.a("\u00e9", (Object)this, (long)473635440622987642L)), (float)hi.a("G", (float)0.0f, (float)(hi.a("\u00a5", (Object)ih2, (long)1210563473410659836L) - hi.a("\u00e9", (Object)this, (long)1152988419572104946L) - hi.a("\u00e9", (Object)this, (long)1327108342321722473L)), (long)1021203527991582354L), (float)hi.a("G", (float)0.0f, (float)(hi.a("\u00a5", (Object)ih2, (long)665954777623212870L) - hi.a("\u00e9", (Object)this, (long)473635440622987642L) - hi.a("\u00e9", (Object)this, (long)612964688870044051L)), (long)1021203527991582354L));
    }

    public float qC() {
        return (float)hi.a("\u00e9", (Object)this, (long)473635440622987642L);
    }
}
