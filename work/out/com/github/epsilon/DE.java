/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Ob;
import com.github.epsilon._j;
import com.github.epsilon.hi;
import com.github.epsilon.ih;
import com.github.epsilon.nK;
import com.github.epsilon.zU;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DE {
    public static final float k = 9.0f;
    public static final float S = 20.0f;

    public static void K(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        ih ih2 = (ih)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f2 = ((Float)objectArray[3]).floatValue();
        hi.a("\u00a5", (Object)zU2, (Object)ih2, (float)f, (float)f2, (long)1212630303025748301L);
    }

    public static void R(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        ih ih2 = (ih)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        hi.a("\u00a5", (Object)zU2, (float)0.0f, (float)0.0f, (float)DE.J("OBejiTGktGGMRwRi", Kt(), (ih)ih2), (float)hi.a("\u00a5", (Object)ih2, (long)665954777623212870L), (float)9.0f, (Object)hi.a("G", (float)f, (long)1329648085340989328L), (long)776507817655946365L);
    }

    public static void S(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        _j _j2 = (_j)objectArray[1];
        ih ih2 = (ih)objectArray[2];
        String string = (String)objectArray[3];
        String string2 = (String)objectArray[4];
        float f = ((Float)objectArray[5]).floatValue();
        float f2 = ((Float)objectArray[6]).floatValue();
        DE.J("OBejiTGktGGMRwRi", S(com.github.epsilon.ih java.lang.String java.lang.String float float ), (zU)zU2, (ih)ih2, (String)string, (String)string2, (float)f, (float)f2);
    }

    public static ih Q(Object[] objectArray) {
        ih ih2 = (ih)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = Float.valueOf(18.0f);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = ih2;
        return hi.a("G", (Object)objectArray2, (long)1237084274938341003L);
    }

    public static void Q(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        _j _j2 = (_j)objectArray[1];
        ih ih2 = (ih)objectArray[2];
        String string = (String)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        float f2 = ((Float)objectArray[6]).floatValue();
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = Float.valueOf(f2);
        objectArray2[3] = color;
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = string;
        objectArray2[0] = ih2;
        hi.a("\u00a5", (Object)zU2, (Object)objectArray2, (long)1100378096129290346L);
    }

    public static float A(Object[] objectArray) {
        ih ih2 = (ih)objectArray[0];
        return (float)(hi.a("\u00a5", (Object)ih2, (long)906597334513960415L) + 9.0f);
    }

    public static /* bridge */ /* synthetic */ CallSite J(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static ih n(Object[] objectArray) {
        ih ih2 = (ih)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        return new ih((float)(hi.a("\u00a5", (Object)ih2, (long)889595511813135488L) - 5.0f - f), (float)(DE.J("OBejiTGktGGMRwRi", Kz(), (ih)ih2) + (hi.a("\u00a5", (Object)ih2, (long)665954777623212870L) - f2) / 2.0f), f, f2);
    }

    private DE() {
    }

    public static Ob K(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        ih ih2 = (ih)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        CallSite callSite = hi.a("G", (boolean)bl, (long)765835270298926806L);
        CallSite callSite2 = hi.a("G", (boolean)bl, (long)529149675032995021L);
        CallSite callSite3 = hi.a("G", (boolean)bl, (float)f, (long)499998531297741759L);
        DE.J("OBejiTGktGGMRwRi", J(com.github.epsilon.ih boolean float float java.lang.String float java.awt.Color java.lang.Integer java.awt.Color java.lang.String float java.awt.Color ), (zU)zU2, (ih)ih2, (boolean)bl, (float)f, (float)6.0f, null, (float)0.0f, (Color)new Color(0, 0, 0, 0), null, null, null, (float)0.0f, null);
        return new Ob((Color)((Object)callSite), (Color)((Object)callSite2), (Color)((Object)callSite3));
    }

    public static void d(Object[] objectArray) {
        zU zU2 = (zU)objectArray[0];
        _j _j2 = (_j)objectArray[1];
        ih ih2 = (ih)objectArray[2];
        String string = (String)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        String string2 = (String)objectArray[7];
        float f2 = ((Float)objectArray[8]).floatValue();
        nK nK2 = (nK)objectArray[9];
        Object[] objectArray2 = new Object[8];
        objectArray2[7] = nK2;
        objectArray2[6] = Float.valueOf(f2);
        objectArray2[5] = string2;
        objectArray2[4] = color2;
        objectArray2[3] = color;
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = string;
        objectArray2[0] = ih2;
        hi.a("\u00a5", (Object)zU2, (Object)objectArray2, (long)412667454678744159L);
    }

    public static ih h(_j _j2, ih ih2, String string, float f, float f2, float f3, float f4) {
        reference var7_7 = hi.a("\u00a5", (Object)_j2, (Object)string, (float)f, (long)665434286926928221L) + f2 * 2.0f + f3;
        Object[] objectArray = new Object[3];
        objectArray[2] = Float.valueOf(16.0f);
        objectArray[1] = Float.valueOf((float)hi.a("G", (float)f4, (float)var7_7, (long)971000971621905228L));
        objectArray[0] = ih2;
        return hi.a("G", (Object)objectArray, (long)1237084274938341003L);
    }

    public static ih y(ih ih2) {
        Object[] objectArray = new Object[3];
        objectArray[2] = Float.valueOf(16.0f);
        objectArray[1] = Float.valueOf(26.0f);
        objectArray[0] = ih2;
        return hi.a("G", (Object)objectArray, (long)1237084274938341003L);
    }
}
