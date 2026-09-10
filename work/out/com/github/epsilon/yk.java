/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.l5;
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
public class yk
implements l5 {
    public static final yk l;
    private static final long a;

    @Override
    public boolean R() {
        return (boolean)yk.E("9HDeIXO0gSgZBwSD", w());
    }

    @Override
    public Color F(Object[] objectArray) {
        return hi.a("G", (long)1109407344178516224L);
    }

    @Override
    public Color r(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        return hi.a("G", (boolean)bl, (float)f, (long)1038439073664936945L);
    }

    @Override
    public float F(Object[] objectArray) {
        return 4.0f;
    }

    @Override
    public Color t(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        return hi.a("G", (float)f, (float)f2, (long)735515674673248892L);
    }

    private yk() {
    }

    @Override
    public float n(Object[] objectArray) {
        return 7.0f;
    }

    @Override
    public Color C(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return hi.a("G", (float)f, (long)855506680013936433L);
    }

    @Override
    public Color H(Object[] objectArray) {
        return hi.a("j", (long)574625695807352444L);
    }

    @Override
    public Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        int n = (Integer)objectArray[1];
        return hi.a("G", (Object)color, (int)n, (long)950630386023407477L);
    }

    @Override
    public Color O(Color color, float f, int n) {
        return yk.E("9HDeIXO0gSgZBwSD", z(java.awt.Color float int ), (Color)color, (float)f, (int)n);
    }

    @Override
    public Color x(Object[] objectArray) {
        return hi.a("G", (long)1330918851199290462L);
    }

    @Override
    public Color l(float f) {
        return hi.a("G", (float)f, (long)945348514596968233L);
    }

    @Override
    public Color y(Object[] objectArray) {
        return hi.a("j", (long)1146280004843021750L);
    }

    @Override
    public float e(Object[] objectArray) {
        return 8.0f;
    }

    @Override
    public Color O(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return yk.E("9HDeIXO0gSgZBwSD", P(float ), (float)f);
    }

    @Override
    public Color c() {
        return hi.a("j", (long)692578069409858836L);
    }

    @Override
    public Color m() {
        return hi.a("G", (long)613240806595753225L);
    }

    @Override
    public float B(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return (float)hi.a("G", (Object)new Object[]{Float.valueOf(f)}, (long)842688358493305377L);
    }

    @Override
    public float b(Object[] objectArray) {
        return 2.0f;
    }

    @Override
    public long L(Object[] objectArray) {
        return a;
    }

    @Override
    public Color e(Object[] objectArray) {
        return hi.a("G", (long)850375381118395903L);
    }

    public static /* bridge */ /* synthetic */ CallSite E(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    @Override
    public float T() {
        return 12.0f;
    }

    @Override
    public Color E(Color color, Color color2, float f) {
        return hi.a("G", (Object)color, (Object)color2, (float)f, (long)1032418514208893637L);
    }

    @Override
    public float L() {
        return 20.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = 4459081424308650462L;
        a = 0x3DE1D6EE2075C1A6L ^ l;
        yk.l = new yk();
    }
}
