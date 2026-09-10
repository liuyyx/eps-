/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon._Q;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.vI;
import com.github.epsilon.zU;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iB {
    private final boolean B;
    private final List<_Q> f;
    private static int A;

    public static iB P(Object[] objectArray) {
        ih ih2 = (ih)objectArray[0];
        Consumer consumer = (Consumer)objectArray[1];
        zU zU2 = new zU();
        hi.a("\u00a5", (Object)consumer, (Object)new vI(zU2, ih2), (long)1019739569891963411L);
        return new iB((List<_Q>)((Object)iB.S("oUkKYGoqBWhaEWAs", copyOf(java.util.Collection<? extends E> ), (Collection)((Object)hi.a("\u00e9", (Object)zU2, (long)757413814809215319L)))), (boolean)hi.a("\u00e9", (Object)zU2, (long)1332137600141344089L));
    }

    public List P(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)1257156364456282436L);
    }

    public static iB B(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        return hi.a("\u00a5", (Object)zU2, (Object)new Object[0], (long)1133596661728696011L);
    }

    public static iB h(Consumer<zU> consumer) {
        zU zU2 = new zU();
        iB.S("oUkKYGoqBWhaEWAs", accept(T ), consumer, (Object)zU2);
        return new iB((List<_Q>)((Object)hi.a("G", (Object)hi.a("\u00e9", (Object)zU2, (long)757413814809215319L), (long)497368790579535219L)), (boolean)hi.a("\u00e9", (Object)zU2, (long)1332137600141344089L));
    }

    private iB(List<_Q> list, boolean bl) {
        this.f = list;
        this.B = bl;
    }

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public boolean g(Object[] objectArray) {
        return (boolean)hi.a("\u00e9", (Object)this, (long)845650092994470518L);
    }

    public static void E(int n) {
        A = n;
    }

    public static int o() {
        return A;
    }

    public static int S() {
        int n = iB.o();
        if (n == 0) {
            return 115;
        }
        return 0;
    }

    static {
        if (iB.o() != 0) {
            iB.E(8);
        }
    }
}
