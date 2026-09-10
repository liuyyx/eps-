/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.Difficulty
 */
package com.github.epsilon;

import com.github.epsilon.DQ;
import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.Difficulty;

class z9 {
    static final int[] Y = new int[((CallSite)hi.a("G", (long)1220332909359061582L)).length];
    static final int[] z;

    public static /* bridge */ /* synthetic */ CallSite K(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            hi.a("j", (long)950846016263654610L)[hi.a("\u00a5", (Object)hi.a("j", (long)611676127937866617L), (long)1320683233325471278L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)950846016263654610L)[z9.K("0lo2DSIjPStuF9jL", ordinal(), (DQ)((Object)hi.a("j", (long)612342838893000495L)))] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)950846016263654610L)[hi.a("\u00a5", (Object)hi.a("j", (long)864683030835001341L), (long)1320683233325471278L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        z = new int[((CallSite)hi.a("G", (long)1080379906743939039L)).length];
        try {
            hi.a("j", (long)852535230699198619L)[z9.K("0lo2DSIjPStuF9jL", ordinal(), (Difficulty)hi.a("j", (long)973837948338575353L))] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)852535230699198619L)[hi.a("\u00a5", (Object)hi.a("j", (long)695220550601190099L), (long)1273261724944232661L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)852535230699198619L)[hi.a("\u00a5", (Object)hi.a("j", (long)655238963614238467L), (long)1273261724944232661L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
