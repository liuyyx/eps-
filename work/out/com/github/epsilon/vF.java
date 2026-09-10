/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Xf;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

class vF {
    static final int[] p = new int[((CallSite)vF.F("ggpWFMCuoJqEAUMl", values())).length];

    public static /* bridge */ /* synthetic */ CallSite F(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    static {
        try {
            hi.a("j", (long)1250175979512648048L)[hi.a("\u00a5", (Object)hi.a("j", (long)1308936498861545106L), (long)1289485465083253814L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1250175979512648048L)[vF.F("ggpWFMCuoJqEAUMl", ordinal(), (Xf)((Object)hi.a("j", (long)937098041521777781L)))] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1250175979512648048L)[hi.a("\u00a5", (Object)hi.a("j", (long)979048685352821956L), (long)1289485465083253814L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1250175979512648048L)[hi.a("\u00a5", (Object)hi.a("j", (long)1265570870147036333L), (long)1289485465083253814L)] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1250175979512648048L)[vF.F("ggpWFMCuoJqEAUMl", ordinal(), (Xf)((Object)hi.a("j", (long)1160005898052550614L)))] = (CallSite)5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
