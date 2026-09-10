/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.MobCategory
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.entity.MobCategory;

class uu {
    static final int[] r = new int[((CallSite)hi.a("G", (long)1205521894234078413L)).length];

    static {
        try {
            hi.a("j", (long)846819024050374239L)[hi.a("\u00a5", (Object)hi.a("j", (long)889307774484594055L), (long)1191685439297015310L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)846819024050374239L)[hi.a("\u00a5", (Object)hi.a("j", (long)1175184184470366548L), (long)1191685439297015310L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)846819024050374239L)[hi.a("\u00a5", (Object)hi.a("j", (long)861378548057300637L), (long)1191685439297015310L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)846819024050374239L)[uu.M("8frZIw2Dtfyt0oVO", ordinal(), (MobCategory)hi.a("j", (long)549225870658472996L))] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)846819024050374239L)[hi.a("\u00a5", (Object)hi.a("j", (long)731500926881276127L), (long)1191685439297015310L)] = (CallSite)5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ CallSite M(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
