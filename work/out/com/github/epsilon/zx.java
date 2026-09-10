/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.input.MouseButtonEvent
 */
package com.github.epsilon;

import com.github.epsilon.ih;
import com.github.epsilon.v_;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.MouseButtonEvent;

public class zx {
    protected final v_ v;

    public boolean H(Object[] objectArray) {
        MouseButtonEvent mouseButtonEvent = (MouseButtonEvent)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        return false;
    }

    public void r(Object[] objectArray) {
        GuiGraphicsExtractor guiGraphicsExtractor = (GuiGraphicsExtractor)objectArray[0];
        ih ih2 = (ih)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
    }

    public zx(v_ v_2) {
        this.v = v_2;
    }
}
