/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.vN;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

class gn {
    static final int[] f = new int[((CallSite)hi.a("G", (long)509388527202047725L)).length];

    static {
        try {
            hi.a("j", (long)997044493353346025L)[hi.a("\u00a5", (Object)hi.a("j", (long)420989547959966654L), (long)767157618144947850L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)997044493353346025L)[hi.a("\u00a5", (Object)hi.a("j", (long)395818649220901320L), (long)767157618144947850L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)997044493353346025L)[gn.D("Q2YLAJDDfeb17rOV", ordinal(), (vN)((Object)hi.a("j", (long)845471826287803998L)))] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ CallSite D(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
