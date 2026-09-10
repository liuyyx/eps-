/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.O3;
import com.github.epsilon.X1;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.nK;
import com.github.epsilon.vT;
import com.github.epsilon.zU;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;

public final class vI {
    private final zU q;
    private final ih D;

    public zU l(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)599162920758678382L);
    }

    private vI(zU zU2, ih ih2) {
        this.q = zU2;
        this.D = ih2;
    }

    public void F(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        Consumer consumer = (Consumer)objectArray[1];
        X1 x1 = new X1((zU)((Object)hi.a("\u00e9", (Object)this, (long)599162920758678382L)), (ih)((Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L)), (vT)((Object)hi.a("j", (long)564170527753856773L)), f);
        hi.a("\u00a5", (Object)consumer, (Object)x1, (long)1019739569891963411L);
    }

    public static /* bridge */ /* synthetic */ CallSite S(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public void s(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        Consumer consumer = (Consumer)objectArray[1];
        X1 x1 = new X1((zU)((Object)hi.a("\u00e9", (Object)this, (long)599162920758678382L)), (ih)((Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L)), (vT)((Object)hi.a("j", (long)649788751872100844L)), f);
        vI.S("9NC89YIYTzefWOqr", accept(T ), (Consumer)consumer, (Object)x1);
    }

    public void S(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        Color color = (Color)objectArray[2];
        nK nK2 = (nK)objectArray[3];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = nK2;
        objectArray2[0] = Float.valueOf(f);
        reference var6_6 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)1092110395291557528L) + (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)665954777623212870L) - hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)621416686807715084L)) / 2.0f;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)599162920758678382L), (Object)string, (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)906597334513960415L), (float)var6_6, (float)f, (Object)color, (Object)nK2, (long)1054750863256699983L);
    }

    private float H(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return 2.43f * f;
    }

    public void n(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        Consumer consumer = (Consumer)objectArray[1];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)599162920758678382L), (int)n, arg_0 -> this.lambda$layer$0(consumer, arg_0), (long)544717532875268314L);
    }

    public void D(Object[] objectArray) {
        O3 o3 = (O3)objectArray[0];
        Consumer consumer = (Consumer)objectArray[1];
        vI.S("9NC89YIYTzefWOqr", accept(T ), (Consumer)consumer, (Object)new vI((zU)((Object)hi.a("\u00e9", (Object)this, (long)599162920758678382L)), (ih)((Object)hi.a("\u00a5", (Object)o3, (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)635866315794852819L))));
    }

    public void X(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        Color color = (Color)objectArray[1];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)599162920758678382L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)906597334513960415L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)1092110395291557528L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)1210563473410659836L), (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)665954777623212870L), (float)f, (Object)color, (long)776507817655946365L);
    }

    private float a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        nK nK2 = (nK)objectArray[1];
        return (float)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)nK2, (long)1178210583230206547L), (long)895885840938751534L) * 0.27f * f;
    }

    public ih R(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)1253276958612630331L);
    }

    public void G(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        Color color = (Color)objectArray[2];
        reference var5_5 = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)1092110395291557528L) + (hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)665954777623212870L) - hi.a("\u00a5", (Object)this, (Object)new Object[]{Float.valueOf(f)}, (long)1037367187153119386L)) / 2.0f;
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)599162920758678382L), (Object)string, (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L), (long)906597334513960415L), (float)var5_5, (float)f, (Object)color, (long)487875072643634565L);
    }

    private void lambda$layer$0(Consumer consumer, zU zU2) {
        hi.a("\u00a5", (Object)consumer, (Object)new vI(zU2, (ih)((Object)hi.a("\u00e9", (Object)this, (long)1253276958612630331L))), (long)1019739569891963411L);
    }
}
