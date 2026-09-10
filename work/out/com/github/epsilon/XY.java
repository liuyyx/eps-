/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DJ;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

class XY {
    static final int[] x = new int[((CallSite)hi.a("G", (long)397288152806896377L)).length];

    public static /* bridge */ /* synthetic */ CallSite L(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            hi.a("j", (long)676847350659429011L)[hi.a("\u00a5", (Object)hi.a("j", (long)803108192655186905L), (long)914869437740376795L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)676847350659429011L)[hi.a("\u00a5", (Object)hi.a("j", (long)874965402212012820L), (long)914869437740376795L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)676847350659429011L)[XY.L("2kiE4Awn2uDn9qTz", ordinal(), (DJ)((Object)hi.a("j", (long)897826413736069381L)))] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)676847350659429011L)[hi.a("\u00a5", (Object)hi.a("j", (long)1231058544381614959L), (long)914869437740376795L)] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
