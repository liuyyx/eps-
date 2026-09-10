/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.ni;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class Xk {
    private Xk() {
    }

    public static ni x(int n, int n2, float f) {
        CallSite callSite = hi.a("G", (float)((float)n * 0.56f), (float)584.0f, (long)971000971621905228L);
        CallSite callSite2 = hi.a("G", (float)((float)n2 * 0.56f), (float)324.0f, (long)971000971621905228L);
        callSite = Xk.G("ZEnJ9FDvSeZpVDnJ", max(float float ), (float)callSite, (float)528.0f);
        callSite2 = Xk.G("ZEnJ9FDvSeZpVDnJ", max(float float ), (float)callSite2, (float)300.0f);
        float f2 = ((float)n - callSite) / 2.0f;
        float f3 = ((float)n2 - callSite2) / 2.0f;
        float f4 = 3.0f;
        reference var8_8 = callSite2 - 10.0f;
        float f5 = f2 + 5.0f;
        float f6 = f5 + f + f4;
        float f7 = f2 + callSite - 5.0f;
        CallSite callSite3 = hi.a("G", (float)164.0f, (float)(callSite * 0.292f), (long)971000971621905228L);
        float f8 = f6 + callSite3 + f4;
        float f9 = f7 - f8;
        ih ih2 = new ih(f2, f3, (float)callSite, (float)callSite2);
        ih ih3 = new ih(f5, f3 + 5.0f, f, (float)var8_8);
        ih ih4 = new ih(f6, f3 + 5.0f, (float)callSite3, (float)var8_8);
        ih ih5 = new ih(f8, f3 + 5.0f, f9, (float)var8_8);
        return new ni(ih2, ih3, ih4, ih5);
    }

    public static /* bridge */ /* synthetic */ CallSite G(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
