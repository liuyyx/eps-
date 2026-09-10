/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class d1 {
    private static final long[] a;
    private static final Integer[] b;

    public static Color J(Color color, Color color2, float object) {
        object = d1.y("yjBYMKZ4tjSvOTf7", clamp(float float float ), (float)object, (float)0.0f, (float)1.0f);
        CallSite callSite = hi.a("G", (int)hi.a("G", (float)object, (int)hi.a("\u00a5", (Object)color, (long)634502724407806770L), (int)hi.a("\u00a5", (Object)color2, (long)634502724407806770L), (long)632200153683703953L), (int)0, (int)d1.a(19657, 2387636297622817364L), (long)1051766797435725461L);
        CallSite callSite2 = hi.a("G", (int)hi.a("G", (float)object, (int)hi.a("\u00a5", (Object)color, (long)791634218836538619L), (int)hi.a("\u00a5", (Object)color2, (long)791634218836538619L), (long)632200153683703953L), (int)0, (int)d1.a(31208, 8065399254128017268L), (long)1051766797435725461L);
        CallSite callSite3 = hi.a("G", (int)hi.a("G", (float)object, (int)hi.a("\u00a5", (Object)color, (long)505295769199362574L), (int)hi.a("\u00a5", (Object)color2, (long)505295769199362574L), (long)632200153683703953L), (int)0, (int)d1.a(31208, 8065399254128017268L), (long)1051766797435725461L);
        CallSite callSite4 = d1.y("yjBYMKZ4tjSvOTf7", clamp(int int int ), (int)hi.a("G", (float)object, (int)hi.a("\u00a5", (Object)color, (long)999912139159319168L), (int)hi.a("\u00a5", (Object)color2, (long)999912139159319168L), (long)632200153683703953L), (int)0, (int)d1.a(31208, 8065399254128017268L));
        return new Color((int)callSite, (int)callSite2, (int)callSite3, (int)callSite4);
    }

    public static /* bridge */ /* synthetic */ CallSite y(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
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
     * Enabled aggressive block sorting
     */
    static {
        long l = 6026352916979552998L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "UAIYw\u0017\u0098M=U\u008a\u00aa!\u00b4\u00adm";
        int n2 = "UAIYw\u0017\u0098M=U\u008a\u00aa!\u00b4\u00adm".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x469D;
        if (b[n2] == null) {
            d1.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }
}
