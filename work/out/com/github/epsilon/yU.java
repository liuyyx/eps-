/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.EquipmentSlot
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.entity.EquipmentSlot;

class yU {
    static final int[] B = new int[((CallSite)hi.a("G", (long)379808346647654855L)).length];

    static {
        try {
            hi.a("j", (long)1261667925996692661L)[yU.m("BioDedGsr79VsJad", ordinal(), (EquipmentSlot)hi.a("j", (long)775170544810875557L))] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1261667925996692661L)[hi.a("\u00a5", (Object)hi.a("j", (long)519683754008057371L), (long)628776075692801234L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1261667925996692661L)[hi.a("\u00a5", (Object)hi.a("j", (long)1054923417099375911L), (long)628776075692801234L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1261667925996692661L)[hi.a("\u00a5", (Object)hi.a("j", (long)1176677532982660135L), (long)628776075692801234L)] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ CallSite m(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
