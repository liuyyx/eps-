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

public final class Xi {
    private final i2 P;

    public static /* bridge */ /* synthetic */ CallSite T(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public void I() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1271102740994027520L), (Object)new Object[0], (long)578427324800340770L);
    }

    private Xi(i2 i22) {
        this.P = i22;
    }

    public void J(Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, int n) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1271102740994027520L), (Object)matrix4f, (float)f, (float)f2, (float)f3, (long)1083060486119861636L);
        Xi.T("t3tpjQaaoqdo3tYW", R(float float ), (i2)((Object)hi.a("\u00e9", (Object)this, (long)1271102740994027520L)), (float)f4, (float)f5);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1271102740994027520L), (Object)new Object[]{n}, (long)927898986293301949L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1271102740994027520L), (Object)new Object[0], (long)913909293381332519L);
    }
}
