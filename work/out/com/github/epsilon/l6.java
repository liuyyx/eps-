/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class l6 {
    public static final l6 p;
    private final ExecutorService d;
    private static final String a;

    private l6() {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.d = hi.a("G", arg_0 -> l6.lambda$new$0(atomicInteger, arg_0), (long)485842699224975036L);
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
                char[] cArray3 = "*Z\u0011 \",@Bo\u001a,-6Z\u0000XO".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 123;
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
                        case 0 -> 20;
                        case 1 -> 81;
                        case 2 -> 25;
                        case 3 -> 50;
                        case 4 -> 53;
                        case 5 -> 56;
                        default -> 85;
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
        p = new l6();
    }

    public void m(Object[] objectArray) {
        Runnable runnable = (Runnable)objectArray[0];
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)1120573837930407666L), (Object)runnable, (long)626075219114131914L);
    }

    private static Thread lambda$new$0(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable);
        hi.a("\u00a5", (Object)thread, (boolean)true, (long)1005976851119516569L);
        hi.a("\u00a5", (Object)thread, (Object)(a + (int)hi.a("\u00a5", (Object)atomicInteger, (long)921329526900247059L)), (long)769899618683804289L);
        return thread;
    }
}
