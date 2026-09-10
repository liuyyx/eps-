/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;

public class S
extends e {
    public static final S J;
    private static final String a;

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
                char[] cArray3 = "QOk\n}n`aHg\u0004.".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 118;
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
                        case 0 -> 110;
                        case 1 -> 77;
                        case 2 -> 120;
                        case 3 -> 17;
                        case 4 -> 43;
                        case 5 -> 72;
                        default -> 126;
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
        J = new S();
    }

    private S() {
        super(a, (vY)((Object)hi.a("j", (long)1050408241407708132L)));
    }
}
