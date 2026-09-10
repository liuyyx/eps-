/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.zI;
import java.util.function.Consumer;

public class gD<T>
implements zI {
    private final Class<T> e;
    private final Consumer<T> f;
    private final int o;

    @Override
    public Class J(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)660245334612332180L);
    }

    @Override
    public void z(Object[] objectArray) {
        Object object = objectArray[0];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)424002606980254731L), (Object)object, (long)1019739569891963411L);
    }

    @Override
    public int K(Object[] objectArray) {
        return (int)hi.a("\u00e9", (Object)this, (long)425753991028348256L);
    }

    public gD(Class<T> clazz, int n, Consumer<T> consumer) {
        this.e = clazz;
        this.o = n;
        this.f = consumer;
    }

    @Override
    public boolean o(Object[] objectArray) {
        return false;
    }

    public gD(Class<T> clazz, Consumer<T> consumer) {
        this(clazz, 0, consumer);
    }
}
