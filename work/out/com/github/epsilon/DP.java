/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;

public final class DP
extends Record {
    private final boolean hB;
    private final String bq;
    private final String b6;
    private final e os;
    private final vY bW;
    private final String bI;

    public String bI() {
        return hi.a("\u00e9", (Object)this, (long)1146748236011544854L);
    }

    public static DP Z(e e2) {
        CallSite callSite = hi.a("\u00a5", (Object)e2, (long)721675246255933332L);
        CallSite callSite2 = hi.a("\u00a5", (Object)e2, (long)1025159459230292690L);
        CallSite callSite3 = DP.r("kgjiVJZbGPfZeAnf", R(), (vY)((Object)hi.a("\u00a5", (Object)e2, (long)726480729306514365L)));
        CallSite callSite4 = DP.r("kgjiVJZbGPfZeAnf", toLowerCase(), (String)((String)((Object)callSite) + " " + (String)((Object)callSite2) + " " + (String)((Object)callSite3)));
        return new DP(e2, (String)((Object)callSite), (String)((Object)callSite2), (boolean)hi.a("\u00a5", (Object)e2, (long)1099153674733698693L), (vY)((Object)hi.a("\u00a5", (Object)e2, (long)726480729306514365L)), (String)((Object)callSite4));
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{DP.class, "os;b6;bq;hB;bW;bI", "os", "b6", "bq", "hB", "bW", "bI"}, this, object);
    }

    public DP(e e2, String string, String string2, boolean bl, vY vY2, String string3) {
        this.os = e2;
        this.b6 = string;
        this.bq = string2;
        this.hB = bl;
        this.bW = vY2;
        this.bI = string3;
    }

    public e os() {
        return hi.a("\u00e9", (Object)this, (long)1037061931666171891L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{DP.class, "os;b6;bq;hB;bW;bI", "os", "b6", "bq", "hB", "bW", "bI"}, this);
    }

    public static /* bridge */ /* synthetic */ CallSite r(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public String bq() {
        return hi.a("\u00e9", (Object)this, (long)975367162979475655L);
    }

    public String b6() {
        return hi.a("\u00e9", (Object)this, (long)1071684618352905386L);
    }

    public boolean hB() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1335283620480135506L);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{DP.class, "os;b6;bq;hB;bW;bI", "os", "b6", "bq", "hB", "bW", "bI"}, this);
    }

    public vY bW() {
        return hi.a("\u00e9", (Object)this, (long)695246148269048843L);
    }
}
