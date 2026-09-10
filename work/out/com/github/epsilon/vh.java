/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiGraphicsExtractor
 *  net.minecraft.client.input.CharacterEvent
 *  net.minecraft.client.input.KeyEvent
 *  net.minecraft.client.input.MouseButtonEvent
 *  net.minecraft.client.input.PreeditEvent
 */
package com.github.epsilon;

import com.github.epsilon.Dl;
import com.github.epsilon._j;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.zU;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.input.PreeditEvent;

public abstract class vh<T extends Dl<?>>
implements AutoCloseable {
    protected static final _j q = hi.a("G", (long)1215511131780764219L);
    protected final T R;

    public void K(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        GuiGraphicsExtractor guiGraphicsExtractor = (GuiGraphicsExtractor)objectArray[1];
        _j _j2 = (_j)objectArray[2];
        ih ih2 = (ih)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        int n2 = (Integer)objectArray[6];
        float f2 = ((Float)objectArray[7]).floatValue();
    }

    public boolean L(Object[] objectArray) {
        KeyEvent keyEvent = (KeyEvent)objectArray[0];
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean x(Object[] objectArray) {
        ih ih2 = (ih)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        return false;
    }

    public boolean E(ih ih2, MouseButtonEvent mouseButtonEvent, boolean bl) {
        return false;
    }

    public boolean S(Object[] objectArray) {
        PreeditEvent preeditEvent = (PreeditEvent)objectArray[0];
        return false;
    }

    public T d() {
        return (T)hi.a("\u00e9", (Object)this, (long)368556895492636452L);
    }

    public boolean f(Object[] objectArray) {
        return false;
    }

    public boolean V(Object[] objectArray) {
        CharacterEvent characterEvent = (CharacterEvent)objectArray[0];
        return false;
    }

    public boolean A(Object[] objectArray) {
        ih ih2 = (ih)objectArray[0];
        MouseButtonEvent mouseButtonEvent = (MouseButtonEvent)objectArray[1];
        return false;
    }

    @Override
    public void close() {
    }

    public float p() {
        return 28.0f;
    }

    public void H(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
    }

    protected vh(T t) {
        this.R = t;
    }
}
