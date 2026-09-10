/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.input.MouseButtonEvent
 */
package com.github.epsilon;

import net.minecraft.client.input.MouseButtonEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface O0
extends AutoCloseable {
    public boolean h(Object[] var1);

    public boolean E(Object[] var1);

    default public void M() {
    }

    default public boolean K(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        return false;
    }

    public void S(Object[] var1);

    public void t(Object[] var1);

    public boolean t(Object[] var1);

    public void s();

    default public void u() {
    }

    public boolean m(Object[] var1);

    public boolean U(Object[] var1);

    public boolean v(MouseButtonEvent var1);

    public boolean m();

    @Override
    default public void close() {
    }
}
