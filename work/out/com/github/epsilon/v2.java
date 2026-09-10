/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderPass
 */
package com.github.epsilon;

import com.github.epsilon.Oq;
import com.github.epsilon.hi;
import com.github.epsilon.nK;
import com.mojang.blaze3d.systems.RenderPass;
import java.awt.Color;

public interface v2 {
    default public boolean y(Object[] objectArray) {
        return false;
    }

    default public void U(Object[] objectArray) {
    }

    default public void V(String string, float f, float f2, float f3, Color color, nK nK2, float f4, float f5, float f6) {
        hi.a("\u00a5", (Object)this, (Object)string, (float)f, (float)f2, (float)f3, (Object)color, (Object)nK2, (long)941820300622266581L);
    }

    default public void p(String string, float f, float f2, float f3, Color color, float f4, nK nK2) {
        hi.a("\u00a5", (Object)this, (Object)string, (float)f, (float)f2, (float)f3, (Object)color, (Object)nK2, (long)941820300622266581L);
    }

    public void E(Object[] var1);

    public void b(String var1, float var2, float var3, float var4, Color var5, nK var6);

    public float o(float var1, nK var2);

    default public void o(int n, int n2, int n3, int n4) {
    }

    default public void l(String string, float f, float f2, float f3, Color color, Color color2, nK nK2) {
        hi.a("\u00a5", (Object)this, (Object)string, (float)f, (float)f2, (float)f3, (Object)color, (Object)nK2, (long)941820300622266581L);
    }

    public float n(Object[] var1);

    default public void L(String string, float f, float f2, float f3, Color color, Oq oq, nK nK2) {
        hi.a("\u00a5", (Object)this, (Object)string, (float)f, (float)f2, (float)f3, (Object)color, (Object)nK2, (long)941820300622266581L);
    }

    public void b(Object[] var1);

    default public void H(RenderPass renderPass) {
    }

    public void W(Object[] var1);
}
