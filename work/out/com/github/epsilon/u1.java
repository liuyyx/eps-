/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.hi;

final class u1
extends Enum<u1> {
    private static final u1[] C;
    public static final /* enum */ u1 XIN_2B2T;

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
                char[] cArray3 = "\u000eXA\u001e\u0018\n&\u0002".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 21;
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
                        case 0 -> 67;
                        case 1 -> 4;
                        case 2 -> 26;
                        case 3 -> 84;
                        case 4 -> 63;
                        case 5 -> 93;
                        default -> 1;
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
        String string = new String(cArray).intern();
        XIN_2B2T = new u1((Object)string, 0);
        C = hi.a("G", (Object)new Object[0], (long)1151521117951586859L);
    }

    private static u1[] L(Object[] objectArray) {
        return new u1[]{hi.a("j", (long)943419390403898682L)};
    }

    public static u1 valueOf(String string) {
        return (u1)((Object)hi.a("G", u1.class, (Object)string, (long)703426484721789552L));
    }

    public static u1[] values() {
        return (u1[])((Enum)((Object)hi.a("j", (long)1134105393796209472L))).clone();
    }
}
