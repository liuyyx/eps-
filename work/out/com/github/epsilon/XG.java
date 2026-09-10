/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.yx;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;

public class XG
extends Dl<Integer> {
    private final int M;
    private final int z;
    private final int k;
    private static e[] H;

    public int e(Object[] objectArray) {
        return (int)hi.a("\u00e9", (Object)this, (long)674718932100820335L);
    }

    public void q(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        super.j(n);
    }

    public int r() {
        return (int)hi.a("\u00e9", (Object)this, (long)1236474120318018084L);
    }

    public static /* bridge */ /* synthetic */ CallSite Z(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public int S() {
        return (int)hi.a("\u00e9", (Object)this, (long)774367497432175366L);
    }

    public void t(Object[] objectArray) {
        Integer n = (Integer)objectArray[0];
        super.j(hi.a("G", (int)hi.a("G", (int)XG.Z("TobbgSXu4DmtLaQc", intValue(), (Integer)n), (int)hi.a("\u00e9", (Object)this, (long)674718932100820335L), (int)hi.a("\u00e9", (Object)this, (long)1236474120318018084L), (long)1051766797435725461L), (long)777027428917046763L));
    }

    public XG(String string, int n, int n2, int n3, int n4, yx yx2, Consumer<Integer> consumer) {
        super(string, yx2, consumer);
        hi.a("\u00f2", (Object)this, (Object)hi.a("G", (int)n, (long)777027428917046763L), (long)1032787230140776349L);
        hi.a("\u00f2", (Object)this, (Object)hi.a("G", (int)n, (long)777027428917046763L), (long)1134770596330567404L);
        this.z = n2;
        this.k = n3;
        this.M = n4;
    }

    public static void m(e[] eArray) {
        H = eArray;
    }

    public static e[] m() {
        return H;
    }

    static {
        if (XG.m() == null) {
            XG.m(new e[1]);
        }
    }
}
