/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

public class de {
    private boolean X;
    private static int[] K;

    public de() {
        hi.a("\u00f2", (Object)this, (boolean)false, (long)502612679376507777L);
    }

    public void F() {
        hi.a("\u00f2", (Object)this, (boolean)true, (long)502612679376507777L);
    }

    public boolean l(Object[] objectArray) {
        return (boolean)hi.a("\u00e9", (Object)this, (long)502612679376507777L);
    }

    public static void h(int[] nArray) {
        K = nArray;
    }

    public static int[] p() {
        return K;
    }

    static {
        if (de.p() == null) {
            de.h(new int[2]);
        }
    }
}
