/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.Df;
import com.github.epsilon.gy;
import com.github.epsilon.hi;
import com.github.epsilon.iB;
import com.github.epsilon.l5;
import com.github.epsilon.lm;
import com.github.epsilon.y_;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;

public class Ow
implements AutoCloseable {
    private final l5 O;
    private final y_ J = new y_();
    private final gy t = new gy();
    private static final String a;

    public lm z(Df df) {
        return new lm((y_)((Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L)), (int)Ow.g("nOaT08hftbw26qze", e(com.github.epsilon.Df ), (gy)((Object)hi.a("\u00e9", (Object)this, (long)725461950176753865L)), (Df)df), (l5)((Object)hi.a("\u00e9", (Object)this, (long)867111336694991449L)));
    }

    public void P() {
        hi.a("\u00a5", (Object)this, (long)724200594907917803L);
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L), (long)605577878128666627L);
    }

    public Ow(l5 l52) {
        this.O = (l5)((Object)hi.a("G", (Object)l52, (Object)a, (long)955185849151819803L));
    }

    public void e() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L), (long)1017446659306008489L);
    }

    public void P(Object[] objectArray) {
        Df df = (Df)((Object)objectArray[0]);
        int n = (Integer)objectArray[1];
        iB iB2 = (iB)objectArray[2];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n;
        objectArray2[0] = df;
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)objectArray2, (long)552889054143910312L), (Object)iB2, (long)890980577028068197L);
    }

    public gy q(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)725461950176753865L);
    }

    public void O(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L), (long)605577878128666627L);
    }

    public void R(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L), (long)605577878128666627L);
    }

    public void p(Object[] objectArray) {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L), (Object)new Object[0], (long)962476360412406622L);
    }

    @Override
    public void close() {
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L), (long)453741036243987885L);
    }

    public static /* bridge */ /* synthetic */ CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public void m(Object[] objectArray) {
        Df df = (Df)((Object)objectArray[0]);
        iB iB2 = (iB)objectArray[1];
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)((Object)df), (long)530968903561563099L), (Object)iB2, (long)890980577028068197L);
    }

    public y_ r() {
        return hi.a("\u00e9", (Object)this, (long)507225231444996932L);
    }

    public lm H(Object[] objectArray) {
        Df df = (Df)((Object)objectArray[0]);
        int n = (Integer)objectArray[1];
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n;
        objectArray2[0] = df;
        return new lm((y_)((Object)hi.a("\u00e9", (Object)this, (long)507225231444996932L)), (int)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)725461950176753865L), (Object)objectArray2, (long)933627510078508127L), (l5)((Object)hi.a("\u00e9", (Object)this, (long)867111336694991449L)));
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block11: {
                char[] cArray3 = "\u0016\n9=x".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 68;
                cArray2 = cArray3;
                n = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block12;
            }
            do {
                int n5 = n2;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n6 = n2;
                int n7 = n3;
                while (true) {
                    cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                        case 0 -> 38;
                        case 1 -> 38;
                        case 2 -> 24;
                        case 3 -> 20;
                        case 4 -> 89;
                        case 5 -> 14;
                        default -> 117;
                    })));
                    ++n3;
                    n2 = n5;
                    if (n5 != 0) break;
                    n5 = n2;
                    cArray2 = cArray2;
                    n7 = n2;
                    cArray4 = cArray2;
                    n6 = n2;
                }
                cArray = cArray2;
                n = n;
            } while (n > n3);
        }
        a = new String(cArray).intern();
    }
}
