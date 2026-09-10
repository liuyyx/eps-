/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.font.GlyphInfo
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.font.GlyphInfo;

record dt(float PI) implements GlyphInfo
{
    private final float PI;

    public float PI() {
        return (float)hi.a("\u00e9", (Object)this, (long)1288824939176520521L);
    }

    public float getAdvance() {
        return (float)hi.a("\u00e9", (Object)this, (long)1288824939176520521L);
    }

    public float getShadowOffset() {
        return 0.45f;
    }

    public float getBoldOffset() {
        return 0.45f;
    }
}
