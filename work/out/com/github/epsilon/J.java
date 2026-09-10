/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.e;
import com.github.epsilon.hi;
import com.github.epsilon.vY;
import com.github.epsilon.yE;
import com.github.epsilon.yZ;

public class J
extends e {
    public static final J a;
    private static final String b;

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
                char[] cArray3 = "z\u0018M\u001eA-KR\u0017J".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 109;
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
                        case 0 -> 86;
                        case 1 -> 27;
                        case 2 -> 84;
                        case 3 -> 26;
                        case 4 -> 12;
                        case 5 -> 1;
                        default -> 74;
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
        b = new String(cArray).intern();
        a = new J();
    }

    @yE
    private void V(yZ yZ2) {
        hi.a("\u00a5", (Object)hi.a("j", (long)460871732309001398L), (Object)new Object[0], (long)1260047098689198291L);
    }

    private J() {
        super(b, (vY)((Object)hi.a("j", (long)1050408241407708132L)));
    }
}
