/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.g7;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

class gF {
    static final int[] x;
    static final int[] s;

    public static /* bridge */ /* synthetic */ CallSite r(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
        s = new int[((CallSite)gF.r("1mzAkCBbSkIlJ6xB", values())).length];
        try {
            hi.a("j", (long)555164877037829090L)[hi.a("\u00a5", (Object)hi.a("j", (long)874559804203434005L), (long)580971443359699817L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)555164877037829090L)[hi.a("\u00a5", (Object)hi.a("j", (long)635693608394781037L), (long)580971443359699817L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)555164877037829090L)[hi.a("\u00a5", (Object)hi.a("j", (long)454792706565658633L), (long)580971443359699817L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        x = new int[((CallSite)hi.a("G", (long)692983194225517364L)).length];
        try {
            hi.a("j", (long)778007027168343186L)[hi.a("\u00a5", (Object)hi.a("j", (long)1104786362878008527L), (long)448396670558950902L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)778007027168343186L)[hi.a("\u00a5", (Object)hi.a("j", (long)886195673375969875L), (long)448396670558950902L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)778007027168343186L)[gF.r("1mzAkCBbSkIlJ6xB", ordinal(), (g7)((Object)hi.a("j", (long)539835456405589235L)))] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
