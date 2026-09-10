/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Direction
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.core.Direction;

class na {
    static final int[] K;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l = 7992769181750714456L;
        long l2 = 0x810C863D29F0E05EL ^ l;
        K = new int[((CallSite)hi.a("G", (long)971290628791266084L)).length];
        try {
            hi.a("j", (long)1279865724138908935L)[hi.a("\u00a5", (Object)hi.a("j", (long)1264475993069188471L), (long)1317840160279033201L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1279865724138908935L)[hi.a("\u00a5", (Object)hi.a("j", (long)588800373273392023L), (long)1317840160279033201L)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1279865724138908935L)[hi.a("\u00a5", (Object)hi.a("j", (long)1329014337449352013L), (long)1317840160279033201L)] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1279865724138908935L)[na.L("1QuEpQ9bdJgTPcz2", ordinal(), (Direction)hi.a("j", (long)632856347589150308L))] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1279865724138908935L)[hi.a("\u00a5", (Object)hi.a("j", (long)1288569935803079200L), (long)1317840160279033201L)] = (CallSite)5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1279865724138908935L)[hi.a("\u00a5", (Object)hi.a("j", (long)1151726402263101942L), (long)1317840160279033201L)] = (CallSite)((int)l2);
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

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
}
