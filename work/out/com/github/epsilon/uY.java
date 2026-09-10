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

class uY {
    static final int[] r;

    public static /* bridge */ /* synthetic */ CallSite A(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l = 2618971242940258009L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "K\u0017M\f4j\u00d6\u00de\u00d3\n\u00fd\u008b4j\u00d6\u00df";
        int n2 = "K\u0017M\f4j\u00d6\u00de\u00d3\n\u00fd\u008b4j\u00d6\u00df".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        r = new int[((CallSite)uY.A("SDvDwizWi6yBetRg", values())).length];
        try {
            hi.a("j", (long)926151554834857109L)[hi.a("\u00a5", (Object)hi.a("j", (long)1064517587532835889L), (long)1191685439297015310L)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)926151554834857109L)[uY.A("SDvDwizWi6yBetRg", ordinal(), (MobCategory)hi.a("j", (long)861378548057300637L))] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)926151554834857109L)[uY.A("SDvDwizWi6yBetRg", ordinal(), (MobCategory)hi.a("j", (long)549225870658472996L))] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)926151554834857109L)[hi.a("\u00a5", (Object)hi.a("j", (long)731500926881276127L), (long)1191685439297015310L)] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)926151554834857109L)[uY.A("SDvDwizWi6yBetRg", ordinal(), (MobCategory)hi.a("j", (long)949263707806015001L))] = (CallSite)5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)926151554834857109L)[hi.a("\u00a5", (Object)hi.a("j", (long)889307774484594055L), (long)1191685439297015310L)] = (CallSite)((int)lArray[1]);
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            hi.a("j", (long)926151554834857109L)[hi.a("\u00a5", (Object)hi.a("j", (long)1175184184470366548L), (long)1191685439297015310L)] = (CallSite)((int)lArray[0]);
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
