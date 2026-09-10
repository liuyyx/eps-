/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.input.CharacterEvent
 *  net.minecraft.client.input.KeyEvent
 *  net.minecraft.client.input.MouseButtonEvent
 */
package com.github.epsilon;

import com.github.epsilon.ih;
import com.github.epsilon.lm;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface XJ
extends AutoCloseable {
    default public void o(lm lm2) {
    }

    public void V(Object[] var1);

    default public boolean w(Object[] objectArray) {
        return false;
    }

    default public boolean X(Object[] objectArray) {
        CharacterEvent characterEvent = (CharacterEvent)objectArray[0];
        return false;
    }

    default public void g(Object[] objectArray) {
        GuiGraphicsExtractor guiGraphicsExtractor = (GuiGraphicsExtractor)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
    }

    default public boolean l(double d, double d2, double d3, double d4) {
        return false;
    }

    default public boolean h(Object[] objectArray) {
        MouseButtonEvent mouseButtonEvent = (MouseButtonEvent)objectArray[0];
        return false;
    }

    public ih r(Object[] var1);

    default public boolean r(Object[] objectArray) {
        MouseButtonEvent mouseButtonEvent = (MouseButtonEvent)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        return false;
    }

    @Override
    default public void close() {
    }

    public boolean V(MouseButtonEvent var1, boolean var2);

    default public boolean Y(Object[] objectArray) {
        KeyEvent keyEvent = (KeyEvent)objectArray[0];
        return false;
    }
}
