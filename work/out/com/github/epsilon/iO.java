/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.Identifier
 */
package com.github.epsilon;

import com.github.epsilon.X6;
import com.github.epsilon.hi;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.resources.Identifier;

public final class iO
extends Record
implements X6 {
    private final Identifier vk;
    private final boolean dr;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iO.class, "vk;dr", "vk", "dr"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iO.class, "vk;dr", "vk", "dr"}, this);
    }

    public iO(Identifier identifier, boolean bl) {
        this.vk = identifier;
        this.dr = bl;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iO.class, "vk;dr", "vk", "dr"}, this, object);
    }

    public boolean Dr() {
        return (boolean)hi.a("\u00e9", (Object)this, (long)1021945286230343787L);
    }

    public Identifier Vk() {
        return hi.a("\u00e9", (Object)this, (long)1160274743484941002L);
    }
}
