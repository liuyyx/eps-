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

class z_ {
    static final int[] s = new int[((CallSite)hi.a("G", (long)692983194225517364L)).length];

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

    static {
        try {
            hi.a("j", (long)417365536574794928L)[hi.a("\u00a5", (Object)hi.a("j", (long)539835456405589235L), (long)448396670558950902L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)417365536574794928L)[z_.W("evMtqdgDDbZfvZy5", ordinal(), (g7)((Object)hi.a("j", (long)886195673375969875L)))] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)417365536574794928L)[hi.a("\u00a5", (Object)hi.a("j", (long)1104786362878008527L), (long)448396670558950902L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
