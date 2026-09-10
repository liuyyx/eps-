/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.is;
import com.github.epsilon.zc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;
import java.util.List;

final class Xw
extends Record {
    private final is o4;
    private final List<zc<?>> bM;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Xw.class, "o4;bM", "o4", "bM"}, this);
    }

    private String c() {
        return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)734535144706315337L), (long)361007567325081982L);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Xw.class, "o4;bM", "o4", "bM"}, this, object);
    }

    private String D() {
        return Xw.c("wU7lr5utRtaB37B4", Vc(), (is)((Object)hi.a("\u00e9", (Object)this, (long)734535144706315337L)));
    }

    private boolean b() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)734535144706315337L), (long)1269159223051778366L);
    }

    private void K() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)734535144706315337L), (long)374005330949123159L);
    }

    public static /* bridge */ /* synthetic */ CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Xw.class, "o4;bM", "o4", "bM"}, this);
    }

    public is O4() {
        return hi.a("\u00e9", (Object)this, (long)734535144706315337L);
    }

    public List<zc<?>> bM() {
        return hi.a("\u00e9", (Object)this, (long)1254207880195761575L);
    }

    private boolean H() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)734535144706315337L), (long)643647191917957279L);
    }

    private Xw(is is2, List<zc<?>> list) {
        this.o4 = is2;
        this.bM = list;
    }
}
