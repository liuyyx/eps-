/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DF;
import com.github.epsilon._j;
import com.github.epsilon.hi;
import com.github.epsilon.nK;
import com.github.epsilon.u4;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

final class O5
implements DF {
    final u4 K;

    public static /* bridge */ /* synthetic */ CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    @Override
    public float q(String string, float f) {
        return (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)949831148187566241L), (long)928535281012372685L), (Object)string, (float)f, (long)665434286926928221L);
    }

    @Override
    public float O(float f) {
        return (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)949831148187566241L), (long)928535281012372685L), (float)f, (long)441868902805229185L);
    }

    @Override
    public float O(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        nK nK2 = (nK)objectArray[1];
        return (float)O5.k("PJcUKxLjp1IobFv8", V(float com.github.epsilon.nK ), (_j)((Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)949831148187566241L), (long)928535281012372685L)), (float)f, (nK)nK2);
    }

    private O5(u4 u42) {
        u4 u43 = u42;
        Objects.requireNonNull(u43);
        this.K = u43;
    }

    @Override
    public float X(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        nK nK2 = (nK)objectArray[2];
        return (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)949831148187566241L), (long)928535281012372685L), (Object)string, (float)f, (Object)nK2, (long)360006357769256977L);
    }
}
