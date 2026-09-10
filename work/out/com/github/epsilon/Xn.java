/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.yx;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;

public class Xn
extends Dl<Boolean> {
    private static boolean j;

    public static /* bridge */ /* synthetic */ CallSite J(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public Xn(String string, boolean bl, yx yx2, Consumer<Boolean> consumer) {
        super(string, yx2, consumer);
        hi.a("\u00f2", (Object)this, (Object)Xn.J("LIAvGY0swONr8oAN", valueOf(boolean ), (boolean)bl), (long)1032787230140776349L);
        hi.a("\u00f2", (Object)this, (Object)hi.a("G", (boolean)bl, (long)827866887164769227L), (long)1134770596330567404L);
    }

    public static void Y(boolean bl) {
        j = bl;
    }

    public static boolean R() {
        return j;
    }

    public static boolean i() {
        boolean bl = Xn.R();
        return !bl;
    }

    static {
        if (!Xn.i()) {
            Xn.Y(true);
        }
    }
}
