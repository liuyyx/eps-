/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import com.github.epsilon.ne;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

class OB {
    static final int[] X;

    public static /* bridge */ /* synthetic */ CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                var1 = 4334911290409748676L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "\u000f\u00ab\u00d17\u00ed\u00b4\b\u00cd/\u00c1\u009b\u0002\u00ed\u00b4\b\u00cc";
                var6_4 = "\u000f\u00ab\u00d17\u00ed\u00b4\b\u00cd/\u00c1\u009b\u0002\u00ed\u00b4\b\u00cc".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block25;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "\u00cdj\u0083u\u00ed\u00b4\b\u00c2K\u00f0\u0016\u001f\u00ed\u00b4\b\u00c3";
                    var6_4 = "\u00cdj\u0083u\u00ed\u00b4\b\u00c2K\u00f0\u0016\u001f\u00ed\u00b4\b\u00c3".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block25;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block26;
                    break;
                }
            }
            v4 = v2 ^ var1;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        OB.X = new int[((CallSite)hi.a("G", (long)891539368048632717L)).length];
        try {
            hi.a("j", (long)1288206519177710421L)[hi.a("\u00a5", (Object)hi.a("j", (long)1222411753678176634L), (long)402069815542246032L)] = (CallSite)true;
        }
        catch (NoSuchFieldError var8_7) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[OB.k("ydaF4Vdo6SHx4BTy", ordinal(), (ne)hi.a("j", (long)641345311885978989L))] = (CallSite)2;
        }
        catch (NoSuchFieldError var8_8) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[hi.a("\u00a5", (Object)hi.a("j", (long)1228085532794643456L), (long)402069815542246032L)] = (CallSite)3;
        }
        catch (NoSuchFieldError var8_9) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[OB.k("ydaF4Vdo6SHx4BTy", ordinal(), (ne)hi.a("j", (long)851228724769794622L))] = (CallSite)4;
        }
        catch (NoSuchFieldError var8_10) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[OB.k("ydaF4Vdo6SHx4BTy", ordinal(), (ne)hi.a("j", (long)1135711096852418349L))] = (CallSite)5;
        }
        catch (NoSuchFieldError var8_11) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[hi.a("\u00a5", (Object)hi.a("j", (long)748888212119226085L), (long)402069815542246032L)] = (CallSite)((int)var0_1[2]);
        }
        catch (NoSuchFieldError var8_12) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[OB.k("ydaF4Vdo6SHx4BTy", ordinal(), (ne)hi.a("j", (long)564623591308783846L))] = (CallSite)((int)var0_1[3]);
        }
        catch (NoSuchFieldError var8_13) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[hi.a("\u00a5", (Object)hi.a("j", (long)915943373611112847L), (long)402069815542246032L)] = (CallSite)((int)var0_1[1]);
        }
        catch (NoSuchFieldError var8_14) {
            // empty catch block
        }
        try {
            hi.a("j", (long)1288206519177710421L)[OB.k("ydaF4Vdo6SHx4BTy", ordinal(), (ne)hi.a("j", (long)1238588514554704248L))] = (CallSite)((int)var0_1[0]);
        }
        catch (NoSuchFieldError var8_15) {
            // empty catch block
        }
    }
}
