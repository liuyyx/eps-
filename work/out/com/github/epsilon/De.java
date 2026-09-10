/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.i2;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import org.joml.Matrix4f;

public final class De {
    private final i2 h;

    public void z(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        int n = (Integer)objectArray[4];
        De.e("YJtXVdnJ7UO4SULe", f(org.joml.Matrix4f float float float ), (i2)((Object)hi.a("\u00e9", (Object)this, (long)827298739942791759L)), (Matrix4f)matrix4f, (float)f, (float)f2, (float)f3);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)827298739942791759L), (Object)new Object[]{n}, (long)927898986293301949L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)827298739942791759L), (Object)new Object[0], (long)913909293381332519L);
    }

    public void p(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)827298739942791759L), (Object)new Object[0], (long)578427324800340770L);
    }

    private De(i2 i22) {
        this.h = i22;
    }

    public static /* bridge */ /* synthetic */ CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
