/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.minecraft.client.renderer.DynamicUniformStorage
 *  net.minecraft.client.renderer.DynamicUniformStorage$DynamicUniform
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.renderer.DynamicUniformStorage;

final class vL {
    private static final Map<String, DynamicUniformStorage<DynamicUniformStorage.DynamicUniform>> l = new HashMap<String, DynamicUniformStorage<DynamicUniformStorage.DynamicUniform>>();

    private static void A(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1309163286696891240L), (long)608258388893900045L), DynamicUniformStorage::endFrame, (long)1116275887896543452L);
    }

    private vL() {
    }

    private static <T extends DynamicUniformStorage.DynamicUniform> GpuBufferSlice b(String string, String string2, int n, int n2, T t) {
        DynamicUniformStorage dynamicUniformStorage = (DynamicUniformStorage)hi.a("\u00a5", (Object)hi.a("j", (long)1309163286696891240L), (Object)string, arg_0 -> vL.lambda$write$0(string2, n, n2, arg_0), (long)817175477130987234L);
        return hi.a("\u00a5", (Object)dynamicUniformStorage, t, (long)945826862760939870L);
    }

    private static void P(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1309163286696891240L), (long)608258388893900045L), DynamicUniformStorage::close, (long)1116275887896543452L);
        hi.a("\u00a5", (Object)hi.a("j", (long)1309163286696891240L), (long)1321656001466046640L);
    }

    private static DynamicUniformStorage lambda$write$0(String string, int n, int n2, String string2) {
        return new DynamicUniformStorage(string, n, n2);
    }
}
