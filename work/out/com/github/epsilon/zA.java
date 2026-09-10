/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.XF;
import com.github.epsilon.hi;
import com.github.epsilon.u4;
import com.github.epsilon.zv;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class zA
extends zv<XF> {
    @Override
    protected int Y(Object[] objectArray) {
        return (int)hi.a("\u00a5", (Object)((XF)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))), (long)962890414522495733L);
    }

    public static /* bridge */ /* synthetic */ CallSite q(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    protected String L(Object[] objectArray) {
        return hi.a("\u00a5", (Object)hi.a("j", (long)979246128202833610L), (long)1335171215242130397L);
    }

    public zA(XF xF) {
        super(xF);
    }

    @Override
    protected void X(Object[] objectArray) {
        zA.q("W2BkScJVq7azO7wv", M(com.github.epsilon.XF ), (u4)((Object)hi.a("j", (long)1112562866355832122L)), (XF)((XF)((Object)hi.a("\u00e9", (Object)this, (long)636594523535374631L))));
    }
}
