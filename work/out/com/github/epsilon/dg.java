/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.zU;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class dg {
    private final ih S;
    final zU I;
    private float a;

    public ih j(float f) {
        ih ih2 = new ih((float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1149189752925977460L), (long)906597334513960415L), (float)hi.a("\u00e9", (Object)this, (long)834355675342503731L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1149189752925977460L), (long)1210563473410659836L), (float)hi.a("G", (float)0.0f, (float)f, (long)1021203527991582354L));
        dg dg2 = this;
        hi.a("\u00f2", (Object)dg2, (float)(hi.a("\u00e9", (Object)dg2, (long)834355675342503731L) + hi.a("G", (float)0.0f, (float)f, (long)1021203527991582354L)), (long)834355675342503731L);
        return ih2;
    }

    public float q(Object[] objectArray) {
        return (float)hi.a("\u00e9", (Object)this, (long)834355675342503731L);
    }

    public void r(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        BiConsumer biConsumer = (BiConsumer)objectArray[1];
        CallSite callSite = dg.F("eDRDHgBuP92VbiDy", j(float ), (dg)this, (float)f);
        dg.F("eDRDHgBuP92VbiDy", x(com.github.epsilon.ih java.util.function.Consumer<com.github.epsilon.zU> ), (zU)((Object)hi.a("\u00e9", (Object)this, (long)1043191313153656978L)), (ih)((Object)callSite), arg_0 -> dg.lambda$item$0(biConsumer, (ih)((Object)callSite), arg_0));
    }

    public ih Q(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        CallSite callSite = hi.a("\u00a5", (Object)this, (float)f, (long)880211622333123864L);
        hi.a("\u00a5", (Object)this, (Object)new Object[]{Float.valueOf(f2)}, (long)1159498613876859455L);
        return callSite;
    }

    public void o(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        dg dg2 = this;
        hi.a("\u00f2", (Object)dg2, (float)(hi.a("\u00e9", (Object)dg2, (long)834355675342503731L) + hi.a("G", (float)0.0f, (float)f, (long)1021203527991582354L)), (long)834355675342503731L);
    }

    public void D(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        Consumer consumer = (Consumer)objectArray[1];
        CallSite callSite = hi.a("\u00a5", (Object)this, (float)f, (long)880211622333123864L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043191313153656978L), (Object)callSite, (Object)consumer, (long)449141544506485015L);
    }

    public ih s(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)1149189752925977460L);
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        float f3 = ((Float)objectArray[2]).floatValue();
        float f4 = ((Float)objectArray[3]).floatValue();
        Consumer consumer = (Consumer)objectArray[4];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043191313153656978L), (Object)dg.F("eDRDHgBuP92VbiDy", x(float float float float ), (dg)this, (float)f, (float)f2, (float)f3, (float)f4), (Object)consumer, (long)449141544506485015L);
    }

    public ih x(float f, float f2, float f3, float f4) {
        return new ih((float)(dg.F("eDRDHgBuP92VbiDy", Ke(), (ih)((Object)hi.a("\u00e9", (Object)this, (long)1149189752925977460L))) + f), (float)(hi.a("\u00e9", (Object)this, (long)834355675342503731L) + f2), (float)hi.a("G", (float)0.0f, (float)(hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1149189752925977460L), (long)1210563473410659836L) + f3), (long)1021203527991582354L), (float)dg.F("eDRDHgBuP92VbiDy", max(float float ), (float)0.0f, (float)f4));
    }

    public void S(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        Consumer consumer = (Consumer)objectArray[2];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = Float.valueOf(f2);
        objectArray2[0] = Float.valueOf(f);
        CallSite callSite = hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)909077584611135833L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043191313153656978L), (Object)callSite, (Object)consumer, (long)449141544506485015L);
    }

    private static void lambda$item$0(BiConsumer biConsumer, ih ih2, zU zU2) {
        hi.a("\u00a5", (Object)biConsumer, (Object)ih2, (Object)zU2, (long)1196934964191851866L);
    }

    private dg(zU zU2, ih ih2) {
        zU zU3 = zU2;
        dg.F("eDRDHgBuP92VbiDy", requireNonNull(T ), (Object)zU3);
        this.I = zU3;
        this.S = ih2;
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00a5", (Object)ih2, (long)1092110395291557528L), (long)834355675342503731L);
    }

    public void c(float f, float f2, BiConsumer<ih, zU> biConsumer) {
        Object[] objectArray = new Object[2];
        objectArray[1] = Float.valueOf(f2);
        objectArray[0] = Float.valueOf(f);
        CallSite callSite = hi.a("\u00a5", (Object)this, (Object)objectArray, (long)909077584611135833L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1043191313153656978L), (Object)callSite, arg_0 -> dg.lambda$item$1(biConsumer, (ih)((Object)callSite), arg_0), (long)449141544506485015L);
    }

    private static void lambda$item$1(BiConsumer biConsumer, ih ih2, zU zU2) {
        hi.a("\u00a5", (Object)biConsumer, (Object)ih2, (Object)zU2, (long)1196934964191851866L);
    }

    public static /* bridge */ /* synthetic */ CallSite F(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
