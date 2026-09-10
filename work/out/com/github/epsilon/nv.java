/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.sun.net.httpserver.HttpServer;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.CompletableFuture;

final class nv
extends Record {
    private final CompletableFuture<String> ax;
    private final HttpServer bV;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nv.class, "bV;ax", "bV", "ax"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nv.class, "bV;ax", "bV", "ax"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{nv.class, "bV;ax", "bV", "ax"}, this);
    }

    public CompletableFuture<String> ax() {
        return hi.a("\u00e9", (Object)this, (long)682979497993566188L);
    }

    public HttpServer bV() {
        return hi.a("\u00e9", (Object)this, (long)594559963115129659L);
    }

    private nv(HttpServer httpServer, CompletableFuture<String> completableFuture) {
        this.bV = httpServer;
        this.ax = completableFuture;
    }
}
