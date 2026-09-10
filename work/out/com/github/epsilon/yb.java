/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Font$GlyphVisitor
 *  net.minecraft.client.gui.font.TextRenderable
 *  net.minecraft.client.gui.navigation.ScreenRectangle
 *  net.minecraft.client.renderer.state.gui.GlyphRenderState
 *  org.joml.Matrix3x2fc
 */
package com.github.epsilon;

import com.github.epsilon.OT;
import com.github.epsilon.hi;
import java.util.Objects;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.font.TextRenderable;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.renderer.state.gui.GlyphRenderState;
import org.joml.Matrix3x2fc;

class yb
implements Font.GlyphVisitor {
    final OT s;
    final Matrix3x2fc J;
    final ScreenRectangle g;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    yb(OT oT, Matrix3x2fc matrix3x2fc, ScreenRectangle screenRectangle) {
        this.J = matrix3x2fc;
        this.g = screenRectangle;
        OT oT2 = oT;
        Objects.requireNonNull(oT2);
        this.s = oT2;
    }

    public void acceptRenderable(TextRenderable textRenderable) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)592891911566657082L), (long)444591406178475386L), (Object)new GlyphRenderState((Matrix3x2fc)hi.a("\u00e9", (Object)this, (long)748170500110577149L), textRenderable, (ScreenRectangle)hi.a("\u00e9", (Object)this, (long)1043285462077903997L)), (long)1174592974870576910L);
    }
}
