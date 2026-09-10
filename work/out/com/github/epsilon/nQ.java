/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.ViaBedrockConfig
 */
package com.github.epsilon;

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
import net.raphimc.viabedrock.ViaBedrockConfig;

final class nQ
extends ViaBedrockConfig {
    public synchronized void save(File file, Map<String, Object> map) {
    }

    private nQ(File file, Logger logger) {
        super(file, logger);
    }

    public boolean shouldEnableExperimentalFeatures() {
        return (boolean)nQ.T("yZMnMdURJJLEi5TY", booleanValue(), (Boolean)((Boolean)((Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("j", (long)805278995556620379L), (long)1171961321970747692L), (long)789438897355831922L))));
    }

    public static /* bridge */ /* synthetic */ CallSite T(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
