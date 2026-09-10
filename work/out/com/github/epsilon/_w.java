/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.DynamicUniformStorage;

record _w(float DU) implements DynamicUniformStorage.DynamicUniform
{
    private final float DU;

    public void write(ByteBuffer byteBuffer) {
        hi.a("\u00a5", (Object)hi.a("G", (Object)byteBuffer, (long)1267780619223285422L), (float)hi.a("\u00e9", (Object)this, (long)540754198675441839L), (float)0.0f, (float)0.0f, (float)0.0f, (long)651805384725515153L);
    }

    public float DU() {
        return (float)hi.a("\u00e9", (Object)this, (long)540754198675441839L);
    }
}
