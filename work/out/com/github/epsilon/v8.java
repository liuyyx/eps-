/*
 * Decompiled with CFR 0.152.
 */
package com.github.epsilon;

import com.github.epsilon.DM;
import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.Dx;
import com.github.epsilon.X0;
import com.github.epsilon.XF;
import com.github.epsilon.XG;
import com.github.epsilon.Xc;
import com.github.epsilon.Xe;
import com.github.epsilon.Xf;
import com.github.epsilon.Xn;
import com.github.epsilon.Xp;
import com.github.epsilon.hi;
import com.github.epsilon.nN;
import com.github.epsilon.yx;
import java.awt.Color;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface v8 {
    public static final long[] fb;
    public static final Integer[] gb;

    default public <E extends Enum<E>> Dx<E> V(String string, E e, yx yx2) {
        return (Dx)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Dx<E>(string, e, yx2, null)}, (long)1328963141601000993L));
    }

    default public Xe I(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)979048685352821956L)), null, yx2)}, (long)1328963141601000993L));
    }

    default public Xn Z(Object[] objectArray) {
        String string = (String)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        Consumer consumer = (Consumer)objectArray[3];
        return (Xn)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xn(string, bl, yx2, consumer)}, (long)1328963141601000993L));
    }

    private static boolean lambda$itemListSetting$0() {
        return true;
    }

    default public XG p(String string, int n, int n2, int n3, int n4, Consumer<Integer> consumer) {
        return (XG)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new XG(string, n, n2, n3, n4, v8::lambda$intSetting$1, consumer)}, (long)1328963141601000993L));
    }

    default public Xn T(String string, boolean bl, Consumer<Boolean> consumer) {
        return (Xn)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xn(string, bl, v8::lambda$boolSetting$1, consumer)}, (long)1328963141601000993L));
    }

    default public DV Z(String string, Color color) {
        return (DV)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DV(string, color, true, v8::lambda$colorSetting$1)}, (long)1328963141601000993L));
    }

    private static boolean lambda$colorSetting$1() {
        return true;
    }

    default public Xe B(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)1265570870147036333L)), null, v8::lambda$soundEventListSetting$0)}, (long)1328963141601000993L));
    }

    default public XF f(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        return (XF)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new XF(string, collection, v8::lambda$stringListSetting$0)}, (long)1328963141601000993L));
    }

    default public Xe s(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)979048685352821956L)), null, v8::lambda$entityTypeListSetting$0)}, (long)1328963141601000993L));
    }

    default public XG m(String string, int n, int n2, int n3, int n4, yx yx2) {
        return (XG)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new XG(string, n, n2, n3, n4, yx2, null)}, (long)1328963141601000993L));
    }

    private static boolean lambda$stringListSetting$0() {
        return true;
    }

    private static boolean lambda$intSetting$1() {
        return true;
    }

    default public Xe G(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)1160005898052550614L)), null, yx2)}, (long)1328963141601000993L));
    }

    default public XG c(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        int n4 = (Integer)objectArray[4];
        yx yx2 = (yx)objectArray[5];
        Consumer consumer = (Consumer)objectArray[6];
        return (XG)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new XG(string, n, n2, n3, n4, yx2, consumer)}, (long)1328963141601000993L));
    }

    private static boolean lambda$enumSetting$0() {
        return true;
    }

    public List o(Object[] var1);

    default public XF W(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (XF)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new XF(string, collection, yx2)}, (long)1328963141601000993L));
    }

    default public X0 X(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (X0)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new X0(string, n, yx2)}, (long)1328963141601000993L));
    }

    private static boolean lambda$colorSetting$0() {
        return true;
    }

    default public Xn U(String string, boolean bl) {
        return (Xn)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xn(string, bl, v8::lambda$boolSetting$0, null)}, (long)1328963141601000993L));
    }

    private static boolean lambda$boolSetting$0() {
        return true;
    }

    default public Xc s(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        Consumer consumer = (Consumer)objectArray[3];
        return (Xc)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xc(string, string2, yx2, consumer)}, (long)1328963141601000993L));
    }

    default public DV P(String string, Color color, boolean bl, yx yx2) {
        return (DV)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DV(string, color, bl, yx2)}, (long)1328963141601000993L));
    }

    default public Xe L(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)937098041521777781L)), null, v8::lambda$itemListSetting$0)}, (long)1328963141601000993L));
    }

    private static boolean lambda$doubleSetting$1() {
        return true;
    }

    private static boolean lambda$enumSetting$1() {
        return true;
    }

    default public DV j(String string, Color color, yx yx2) {
        return (DV)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DV(string, color, true, yx2)}, (long)1328963141601000993L));
    }

    private static boolean lambda$entityTypeListSetting$0() {
        return true;
    }

    private static boolean lambda$buttonSetting$0() {
        return true;
    }

    private static boolean lambda$intSetting$0() {
        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    default public nN l(String string) {
        Object object;
        Object object2 = (v8.a(19237, 5501657823686300574L) / 2 ^ v8.a(10332, 6565309010247839999L)) - v8.a(30586, 2232427783679094747L);
        block12: while (true) {
            switch (object2) {
                default: {
                    object = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)733611995391663206L), (long)1240653736693366367L);
                    object2 = v8.a(25122, 1957461250253863571L) / v8.a(2443, 4069144594070294831L) * v8.a(23133, 7314325623706485486L) ^ v8.a(18851, 4168092127951163678L);
                    break block12;
                }
                case -1753626505: {
                    hi.a("G", (long)594486037717116399L);
                    object2 = ((v8.a(17436, 3129949221902425271L) + v8.a(6177, 6773692340876165257L)) / 3 ^ v8.a(11171, 6988457216894137114L)) + v8.a(19852, 1539487902276162860L);
                    continue block12;
                }
            }
            break;
        }
        block13: while (true) {
            nN nN2;
            switch (object2) {
                default: {
                    if (hi.a("\u00a5", (Object)object, (long)984088978567310565L) == false) break;
                    object2 = hi.a("G", (int)v8.a(16310, 4527939640467121948L), (int)v8.a(21886, 2856457811707530712L), (long)834203424483934088L) * v8.a(1491, 1377815904785653092L) * v8.a(11915, 7707213990666499635L) + v8.a(30658, 8245356851550990196L) - v8.a(29749, 1979435216034081927L);
                    continue block13;
                }
                case 2114140167: {
                    nN2 = (nN)((Object)hi.a("\u00a5", (Object)object, (long)470012372636416268L));
                    object2 = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)nN2, (Object)new Object[0], (long)823150533905057311L), (Object)string, (long)400117547248019748L) != false ? ((v8.a(27353, 2413922405761823358L) ^ v8.a(29169, 5017899088642615676L)) - v8.a(29520, 1429986868322708453L) ^ v8.a(20095, 2209570345777075904L)) + v8.a(28877, 7728827601790183535L) ^ v8.a(21963, 6637422557175647611L) : (v8.a(3143, 4336287032315827434L) + v8.a(31774, 8761643992195048608L)) / v8.a(2038, 749110383026855746L) + v8.a(15352, 6306032903720657750L) ^ v8.a(14650, 1781164755953705398L);
                }
                case 2114140165: {
                    object = new nN(string);
                    hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)733611995391663206L), (Object)object, (long)615358212536192384L);
                    return object;
                }
                case 2114140164: {
                    hi.a("G", (float)100.0f, (long)670532585860963011L);
                    return null;
                }
            }
            object2 = (v8.a(14989, 2189814325628232241L) ^ v8.a(26604, 449906195505364834L)) + v8.a(26536, 7620726045364174593L);
            continue;
            switch (object2) {
                default: {
                    return nN2;
                }
                case -580232085: {
                    break;
                }
                case -580232084: {
                    hi.a("G", (long)1085489360135419778L);
                    hi.a("G", (long)411152158456204314L);
                    return null;
                }
            }
            object2 = v8.a(28496, 1650863093382199295L) / v8.a(9764, 8139815493843746433L) * v8.a(23834, 84574758912066998L) ^ v8.a(10205, 7155706469175656295L);
        }
    }

    default public DV V(Object[] objectArray) {
        String string = (String)objectArray[0];
        Color color = (Color)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        return (DV)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DV(string, color, bl, v8::lambda$colorSetting$0)}, (long)1328963141601000993L));
    }

    default public Xe W(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)1265570870147036333L)), null, yx2)}, (long)1328963141601000993L));
    }

    private static boolean lambda$boolSetting$1() {
        return true;
    }

    default public X0 t(String string, int n) {
        return (X0)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new X0(string, n, v8::lambda$keybindSetting$0)}, (long)1328963141601000993L));
    }

    default public Dx C(Object[] objectArray) {
        String string = (String)objectArray[0];
        Enum enum_ = (Enum)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        Consumer consumer = (Consumer)objectArray[3];
        return (Dx)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Dx<Enum>(string, enum_, yx2, consumer)}, (long)1328963141601000993L));
    }

    default public Xe o(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)937098041521777781L)), null, yx2)}, (long)1328963141601000993L));
    }

    private static boolean lambda$doubleSetting$0() {
        return true;
    }

    default public Dl L(Object[] objectArray) {
        Dl dl = (Dl)objectArray[0];
        hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)this, (Object)new Object[0], (long)1050225570436595162L), (Object)dl, (long)615358212536192384L);
        return dl;
    }

    default public Xc r(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (Xc)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xc(string, string2, yx2)}, (long)1328963141601000993L));
    }

    private static boolean lambda$stringSetting$0() {
        return true;
    }

    default public Xp q(Object[] objectArray) {
        String string = (String)objectArray[0];
        Runnable runnable = (Runnable)objectArray[1];
        return (Xp)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xp(string, runnable, v8::lambda$buttonSetting$0)}, (long)1328963141601000993L));
    }

    default public Xe H(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)1308936498861545106L)), null, yx2)}, (long)1328963141601000993L));
    }

    private static boolean lambda$soundEventListSetting$0() {
        return true;
    }

    private static boolean lambda$enchantmentListSetting$0() {
        return true;
    }

    default public Xe h(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)1160005898052550614L)), null, v8::lambda$enchantmentListSetting$0)}, (long)1328963141601000993L));
    }

    public List k(Object[] var1);

    default public Xe j(Object[] objectArray) {
        String string = (String)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        return (Xe)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xe(string, collection, (Xf)((Object)hi.a("j", (long)1308936498861545106L)), null, v8::lambda$blockListSetting$0)}, (long)1328963141601000993L));
    }

    default public Xn M(String string, boolean bl, yx yx2) {
        return (Xn)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xn(string, bl, yx2, null)}, (long)1328963141601000993L));
    }

    default public XG b(String string, int n, int n2, int n3, int n4) {
        return (XG)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new XG(string, n, n2, n3, n4, v8::lambda$intSetting$0, null)}, (long)1328963141601000993L));
    }

    private static boolean lambda$stringSetting$1() {
        return true;
    }

    default public Xp I(Object[] objectArray) {
        String string = (String)objectArray[0];
        Runnable runnable = (Runnable)objectArray[1];
        yx yx2 = (yx)objectArray[2];
        return (Xp)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xp(string, runnable, yx2)}, (long)1328963141601000993L));
    }

    default public DM k(Object[] objectArray) {
        String string = (String)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        Consumer consumer = (Consumer)objectArray[5];
        return (DM)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DM(string, d, d2, d3, d4, v8::lambda$doubleSetting$1, consumer)}, (long)1328963141601000993L));
    }

    default public Xc W(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        Consumer consumer = (Consumer)objectArray[2];
        return (Xc)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xc(string, string2, v8::lambda$stringSetting$1, consumer)}, (long)1328963141601000993L));
    }

    private static boolean lambda$keybindSetting$0() {
        return true;
    }

    default public <E extends Enum<E>> Dx<E> j(String string, E e2, Consumer<E> consumer) {
        return (Dx)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Dx<E>(string, e2, v8::lambda$enumSetting$0, consumer)}, (long)1328963141601000993L));
    }

    default public DM Z(Object[] objectArray) {
        String string = (String)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        yx yx2 = (yx)objectArray[5];
        Consumer consumer = (Consumer)objectArray[6];
        return (DM)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DM(string, d, d2, d3, d4, yx2, consumer)}, (long)1328963141601000993L));
    }

    default public Xc K(String string, String string2) {
        return (Xc)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Xc(string, string2, v8::lambda$stringSetting$0)}, (long)1328963141601000993L));
    }

    default public <E extends Enum<E>> Dx<E> J(String string, E e2) {
        return (Dx)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new Dx<E>(string, e2, v8::lambda$enumSetting$1, null)}, (long)1328963141601000993L));
    }

    default public DM E(String string, double d, double d2, double d3, double d4) {
        return (DM)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DM(string, d, d2, d3, d4, v8::lambda$doubleSetting$0, null)}, (long)1328963141601000993L));
    }

    private static boolean lambda$blockListSetting$0() {
        return true;
    }

    default public DM H(String string, double d, double d2, double d3, double d4, yx yx2) {
        return (DM)((Object)hi.a("\u00a5", (Object)this, (Object)new Object[]{new DM(string, d, d2, d3, d4, yx2, null)}, (long)1328963141601000993L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1516968172231468719L;
                var6_1 = new long[35];
                var3_2 = 0;
                var4_3 = "NVa\"P\u00d9\u009d\"\u0080\u000e\u0001\"4\u00d8}},iE\u00d7V\n\u00c6\u00e6\u0017-\u00cbj\u00f1\u00ad\u00d8\u008c\u00c1V\u00d7\u0091\u00dd#\u0011\u00f1`\u0010\u00e9\u0017\u00a1sA\u00e9>~\u0015\u0000\u00d1\u00fb\u00e4\u00b8S\u00db5{\u00f2\t\u00a2\u00a3\u00ca\u009e\u00b7\t\u0004,\u00f7\u0086\u00fb\u0084kYV\u00a8\u00d8(\u0010\u00ce*\u00ff;\u00d9e\u00008\u00df3\u0084\u00f5\u00fb6'K\u0087%xUD\u0005h\u00fa\u0097\\\u00a8\u00f1\u0086\u008cC\u00c0\u00f2K\u0080S\u0092\u0097\u00d7\u00ee\u009a\u009a\u0096\u00fe\u00a1'\u009a\u00c33\u00f7\u0018\u00c1\u00c1v\u007f\u00c6g\u00bc\u00a4G`x)#\u00b5\u0003X\u00cb\u00f3\u00e1\u00afT.\u00c9\u0019~p\u0093._{.\u00a4\u00dc\u00b7\u00ea35\u001e\tjr\u0084\u00ccT\u00ff\u00cdS\u0081\u00b6\u00ec\u0016P|\u00a4\u00ef\u00aeY\u008fM\u00fc\u0095\ru\u00b0T\u00b1y\u00e5\u00be\b9\u00dd]\u0019\u00eb-AW\u009d\u0086\u0095\u00c5\u00e7T\u00d1C\re\u0088)\u0006P\u001by6\u0017\u0003:\u00a5\u0099\u00f1]\u0016\u001b\u00be\u008d\u00d5\u00e0\u001f3;\u0014q\u0016\u008eCc9\u00dd\u00e4\u0001\u00a2\u009az\u00c7\u00991\u00a6\u00f3\u00b2\n\b";
                var5_4 = "NVa\"P\u00d9\u009d\"\u0080\u000e\u0001\"4\u00d8}},iE\u00d7V\n\u00c6\u00e6\u0017-\u00cbj\u00f1\u00ad\u00d8\u008c\u00c1V\u00d7\u0091\u00dd#\u0011\u00f1`\u0010\u00e9\u0017\u00a1sA\u00e9>~\u0015\u0000\u00d1\u00fb\u00e4\u00b8S\u00db5{\u00f2\t\u00a2\u00a3\u00ca\u009e\u00b7\t\u0004,\u00f7\u0086\u00fb\u0084kYV\u00a8\u00d8(\u0010\u00ce*\u00ff;\u00d9e\u00008\u00df3\u0084\u00f5\u00fb6'K\u0087%xUD\u0005h\u00fa\u0097\\\u00a8\u00f1\u0086\u008cC\u00c0\u00f2K\u0080S\u0092\u0097\u00d7\u00ee\u009a\u009a\u0096\u00fe\u00a1'\u009a\u00c33\u00f7\u0018\u00c1\u00c1v\u007f\u00c6g\u00bc\u00a4G`x)#\u00b5\u0003X\u00cb\u00f3\u00e1\u00afT.\u00c9\u0019~p\u0093._{.\u00a4\u00dc\u00b7\u00ea35\u001e\tjr\u0084\u00ccT\u00ff\u00cdS\u0081\u00b6\u00ec\u0016P|\u00a4\u00ef\u00aeY\u008fM\u00fc\u0095\ru\u00b0T\u00b1y\u00e5\u00be\b9\u00dd]\u0019\u00eb-AW\u009d\u0086\u0095\u00c5\u00e7T\u00d1C\re\u0088)\u0006P\u001by6\u0017\u0003:\u00a5\u0099\u00f1]\u0016\u001b\u00be\u008d\u00d5\u00e0\u001f3;\u0014q\u0016\u008eCc9\u00dd\u00e4\u0001\u00a2\u009az\u00c7\u00991\u00a6\u00f3\u00b2\n\b".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00bd\u00f6\u00b6\u00db<\u0004-\u009d\u00b2=O,R\u0018\u00f4\u0092";
                    var5_4 = "\u00bd\u00f6\u00b6\u00db<\u0004-\u009d\u00b2=O,R\u0018\u00f4\u0092".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
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
        v8.fb = var6_1;
        v8.gb = new Integer[35];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x58AC;
        if (gb[n2] == null) {
            v8.gb[n2] = (int)(fb[n2] ^ l);
        }
        return gb[n2];
    }
}
