/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.packs.resources.PreparableReloadListener
 *  net.minecraft.server.packs.resources.PreparableReloadListener$PreparationBarrier
 *  net.minecraft.server.packs.resources.PreparableReloadListener$SharedState
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.packs.resources.PreparableReloadListener;

public class lU
implements PreparableReloadListener {
    public CompletableFuture<Void> reload(PreparableReloadListener.SharedState sharedState, Executor executor, PreparableReloadListener.PreparationBarrier preparationBarrier, Executor executor2) {
        CallSite callSite = hi.a("G", null, (long)749562039746293249L);
        PreparableReloadListener.PreparationBarrier preparationBarrier2 = preparationBarrier;
        hi.a("G", (Object)preparationBarrier2, (long)374764797691957710L);
        return lU.n("ndl7TRT1M2S5ATdD", thenRunAsync(java.lang.Runnable java.util.concurrent.Executor ), (CompletableFuture)((Object)hi.a("\u00a5", (Object)callSite, arg_0 -> ((PreparableReloadListener.PreparationBarrier)preparationBarrier2).wait(arg_0), (long)862058957205479031L)), () -> lU.lambda$reload$0(sharedState), (Executor)executor2);
    }

    private static void lambda$reload$0(PreparableReloadListener.SharedState sharedState) {
        hi.a("\u00a5", (Object)hi.a("j", (long)1100831404501846897L), (Object)new Object[]{lU.n("ndl7TRT1M2S5ATdD", resourceManager(), (PreparableReloadListener.SharedState)sharedState)}, (long)614486618438634934L);
    }

    public static /* bridge */ /* synthetic */ CallSite n(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
