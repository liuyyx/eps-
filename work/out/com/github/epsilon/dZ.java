/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.Difficulty
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.Difficulty;

class dZ {
    static final int[] y = new int[((CallSite)hi.a("G", (long)1080379906743939039L)).length];

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
            hi.a("j", (long)781154892418200889L)[hi.a("\u00a5", (Object)hi.a("j", (long)973837948338575353L), (long)1273261724944232661L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)781154892418200889L)[hi.a("\u00a5", (Object)hi.a("j", (long)695220550601190099L), (long)1273261724944232661L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)781154892418200889L)[dZ.S("rTD47oQ4vvo6p3Eo", ordinal(), (Difficulty)hi.a("j", (long)910433248053504774L))] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)781154892418200889L)[dZ.S("rTD47oQ4vvo6p3Eo", ordinal(), (Difficulty)hi.a("j", (long)655238963614238467L))] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
