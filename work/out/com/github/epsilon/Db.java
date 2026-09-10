/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.is;
import com.github.epsilon.zc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.runtime.ObjectMethods;
import java.util.List;

final class Db
extends Record {
    private final is ng;
    private final List<zc<?>> yu;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Db.class, "ng;yu", "ng", "yu"}, this);
    }

    public is ng() {
        return hi.a("\u00e9", (Object)this, (long)1060622337751482087L);
    }

    private String g() {
        return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1060622337751482087L), (long)447743383369241810L);
    }

    private String l() {
        return hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1060622337751482087L), (long)361007567325081982L);
    }

    private boolean Z() {
        return (boolean)Db.j("1oVRiCFyRejIVQSS", u(), (is)((Object)hi.a("\u00e9", (Object)this, (long)1060622337751482087L)));
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Db.class, "ng;yu", "ng", "yu"}, this, object);
    }

    private void P() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1060622337751482087L), (long)374005330949123159L);
    }

    private boolean c() {
        return (boolean)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1060622337751482087L), (long)643647191917957279L);
    }

    public List<zc<?>> Yu() {
        return hi.a("\u00e9", (Object)this, (long)1034639970601284735L);
    }

    private Db(is is2, List<zc<?>> list) {
        this.ng = is2;
        this.yu = list;
    }

    public static /* bridge */ /* synthetic */ CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Db.class, "ng;yu", "ng", "yu"}, this);
    }
}
