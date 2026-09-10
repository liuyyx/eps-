/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.vialegacy.ViaLegacyConfig
 */
package com.github.epsilon;

import com.github.epsilon.Xn;
import com.github.epsilon.hi;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.logging.Logger;
import net.raphimc.vialegacy.ViaLegacyConfig;

final class D3
extends ViaLegacyConfig {
    public boolean isLegacySkullLoading() {
        return (boolean)hi.a("\u00a5", (Object)((Boolean)((Object)D3.v("aiX9yF1tf4ALwOHN", z(), (Xn)((Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)1075293999859086740L))))), (long)1000026253634408124L);
    }

    private D3(File file, Logger logger) {
        super(file, logger);
    }

    public synchronized void save(File file, Map<String, Object> map) {
    }

    public boolean isLegacySkinLoading() {
        return (boolean)hi.a("\u00a5", (Object)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)1075293999859086740L), (long)789438897355831922L))), (long)1000026253634408124L);
    }

    public static /* bridge */ /* synthetic */ CallSite v(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }
}
