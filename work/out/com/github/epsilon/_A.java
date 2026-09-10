/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderPass
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.systems.RenderPass;

public interface _A {
    default public boolean K(Object[] objectArray) {
        return false;
    }

    default public void H(Object[] objectArray) {
        hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)825217423609060496L);
        hi.a("\u00a5", (Object)this, (long)1268570401855255634L);
    }

    public void K();

    public void Q();

    default public void Q(Object[] objectArray) {
        RenderPass renderPass = (RenderPass)objectArray[0];
    }

    public void m(Object[] var1);
}
