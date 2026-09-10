/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.player.RemotePlayer
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.TickRateManager
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.WalkAnimationState
 *  net.minecraft.world.entity.ai.attributes.AttributeMap
 *  net.minecraft.world.entity.player.Player
 */
package com.github.epsilon;

import com.github.epsilon.DV;
import com.github.epsilon.Dl;
import com.github.epsilon.hi;
import com.github.epsilon.ue;
import com.github.epsilon.yL;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.vertex.PoseStack;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.TickRateManager;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.WalkAnimationState;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.player.Player;

final class lo
extends RemotePlayer {
    final ue Q;
    private final float f;
    private final float b;
    private final float K;
    private static final long[] a;
    private static final Integer[] c;

    public boolean shouldShowName() {
        return false;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void G(Object[] var1_1) {
        block15: {
            var2_2 = (PoseStack)var1_1[0];
            var3_3 = Dl.t();
            var5_4 /* !! */  = hi.a("G", (int)((lo.a(14328, 4554978198324290766L) ^ lo.a(2674, 767967816693553478L)) * lo.a(16980, 8870662464805982574L) ^ lo.a(12751, 6909304474546414314L)), (int)lo.a(285, 3926199477546979902L), (long)834203424483934088L) - lo.a(24539, 1642087053810060515L);
            if (!var3_3) ** GOTO lbl15
            block8: while (true) {
                block18: {
                    block17: {
                        block16: {
                            v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)829387289340300188L)}, (long)829460758901595045L), (long)430579852159213241L), (long)364929717497510628L), (long)898791947289103478L);
                            if (var3_3) break block16;
                            if (v0 /* !! */  != false) break block17;
                            v0 /* !! */  = var5_4 /* !! */  = lo.v("ajFgFogDFwLW5lp2", max(int int ), (int)((lo.a(9637, 8733050107593012890L) ^ lo.a(23688, 1145648288457609140L)) + lo.a(27646, 2787738671685433547L)), (int)lo.a(17473, 5725161538531547000L)) + lo.a(20589, 8703545397782004563L);
                        }
                        if (!var3_3) break block18;
                    }
                    var5_4 /* !! */  = (reference)((lo.a(14035, 7655485081111668219L) + lo.a(3949, 1626261143527201886L) ^ lo.a(1942, 1461844821334889663L)) * lo.a(651, 3343722667225682348L) + lo.a(23266, 5941648608110922194L));
                }
                block9: while (true) {
                    switch (var5_4 /* !! */ ) {
                        default: {
                            continue block8;
                        }
                        case -1535346895: {
                            v1 /* !! */  = 1.0f;
                            var5_4 /* !! */  = (reference)(((lo.a(5816, 657809841157965206L) + lo.a(3965, 6773624091958451264L) ^ lo.a(22462, 2421643851191469204L)) + lo.a(4078, 6987623704791719109L)) / lo.a(30418, 781222072730740197L) ^ lo.a(13877, 1415449999776326919L));
                            if (var3_3) {
                                break block8;
                            }
                            break block15;
                        }
                        case -1535346894: {
                            v1 /* !! */  = (float)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("G", (Object)new Object[]{hi.a("\u00e9", (Object)this, (long)829387289340300188L)}, (long)541524535325988491L), (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
                            if (!var3_3) break block8;
                            ** GOTO lbl-1000
                        }
                        case -1535346893: {
                            lo.v("ajFgFogDFwLW5lp2", j());
                            hi.a("G", (int)1, (int)lo.a(15976, 7510250041772322122L), (long)589346929323904906L);
                            var5_4 /* !! */  = (reference)(lo.a(2735, 8280209518177655171L) * lo.a(11960, 7117048030605163913L) + lo.a(28458, 5186711594952522769L));
                            continue block9;
                        }
                    }
                    break;
                }
                break;
            }
            var5_4 /* !! */  = (reference)(((lo.a(7373, 7133449645448564717L) + lo.a(25385, 4078549682650574852L) ^ lo.a(16033, 8033559737030782343L)) + lo.a(8379, 305479201042510746L)) / lo.a(30627, 4934039510357763207L) ^ lo.a(24666, 7461576508132094837L));
        }
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var4_5 /* !! */  = v1 /* !! */ ;
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)942025387150389105L), (long)1113332276519209215L);
                hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)942025387150389105L), (long)1170578188816056380L);
                lo.v("ajFgFogDFwLW5lp2", epsilon$freeze(float float float ), (yL)((yL)hi.a("\u00e9", (Object)this, (long)1018863029845073927L)), (float)hi.a("\u00e9", (Object)this, (long)924767087446634611L), (float)hi.a("\u00e9", (Object)this, (long)1325117634785021278L), (float)var4_5 /* !! */ );
                hi.a("G", (Object)var2_2, (Object)this, (double)1.0, (Object)((Color)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)829387289340300188L), (long)540638239171157686L), (long)789438897355831922L)), (Object)((Color)lo.v("ajFgFogDFwLW5lp2", z(), (DV)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)829387289340300188L), (long)483483482097303819L))), (float)2.0f, (long)583933405669409937L);
                return;
            }
            case -2051761269: 
        }
    }

    public static /* bridge */ /* synthetic */ CallSite v(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public Component belowNameDisplay() {
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private lo(ue var1_1, Player var2_2) {
        v0 = Dl.S();
        v1 = var1_1;
        Objects.requireNonNull(v1);
        this.Q = v1;
        var3_3 = v0;
        super((ClientLevel)hi.a("\u00e9", (Object)ue.s(new Object[]{var1_1}), (long)430579852159213241L), new GameProfile(var2_2.getGameProfile().id(), var2_2.getGameProfile().name()));
        v2 = hi.a("G", (Object)new Object[]{var1_1}, (long)1117855941194612258L);
        if (!var3_3) ** GOTO lbl14
        if (lo.v("ajFgFogDFwLW5lp2", isFrozen(), (TickRateManager)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)v2, (long)430579852159213241L), (long)364929717497510628L)) != false) {
            v3 /* !! */  = (CallSite)1.0f;
        } else {
            v2 = lo.v("ajFgFogDFwLW5lp2", o(com.github.epsilon.ue ), (ue)var1_1);
lbl14:
            // 2 sources

            v3 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)v2, (long)915271048386335996L), (boolean)true, (long)796171081241421004L);
        }
        var4_4 = v3 /* !! */ ;
        this.K = (float)lo.v("ajFgFogDFwLW5lp2", position(float ), (WalkAnimationState)hi.a("\u00e9", (Object)var2_2, (long)410378720779626023L), (float)var4_4);
        this.f = (float)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)var2_2, (long)410378720779626023L), (float)var4_4, (long)493382440162360503L);
        this.b = (float)hi.a("\u00a5", (Object)var2_2, (float)var4_4, (long)747259147288445072L);
        lo.v("ajFgFogDFwLW5lp2", copyPosition(net.minecraft.world.entity.Entity ), (lo)this, (Entity)var2_2);
        hi.a("\u00a5", (Object)this, (long)1258826793222110993L);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)var2_2, (long)1297062149741108411L), (long)676401553372781627L);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)676401553372781627L), (long)658423072478370117L);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)var2_2, (long)528835322426248533L), (long)899469253232184357L);
        hi.a("\u00f2", (Object)this, (float)hi.a("\u00e9", (Object)this, (long)899469253232184357L), (long)912092986397585584L);
        lo.v("ajFgFogDFwLW5lp2", assignAllValues(net.minecraft.world.entity.ai.attributes.AttributeMap ), (AttributeMap)lo.v("ajFgFogDFwLW5lp2", getAttributes(), (lo)this), (AttributeMap)hi.a("\u00a5", (Object)var2_2, (long)954710336753579911L));
        hi.a("\u00a5", (Object)this, (Object)lo.v("ajFgFogDFwLW5lp2", getPose(), (Player)var2_2), (long)633099246614498108L);
        hi.a("\u00a5", (Object)this, (float)hi.a("\u00a5", (Object)var2_2, (long)597219457058537222L), (long)793064411451703681L);
        hi.a("\u00a5", (Object)this, (float)hi.a("\u00a5", (Object)var2_2, (long)583740421588621321L), (long)912143279467445474L);
        hi.a("\u00f2", (Object)this, (InteractionHand)hi.a("\u00e9", (Object)var2_2, (long)1056867549007792002L), (long)434098040650503618L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8052251340940186651L;
                var6_1 = new long[32];
                var3_2 = 0;
                var4_3 = "\u00863s.M\u00cezO\u0014r\\B\u00d0w'\u0083%\u00a2\u0094Wi\u00cb\u00f6\u00a3M\u00019m\u0014-X\u00bbB\u0083\u00c3\u00ac\u0018\u0091>\u00de\u00d7\u00b3\r\u00b1\u0015\u0095Q\u00c8\u0082\u00194\u0097\u00aa\u00be9;w#0\u00bd\u00e5\u0091\u00c9\u00fa:\u0003~\u0098\u00a8\u00cb\b%\u000e+\u00edx\u00a8\u00d4\u00b95\u008fT\u00d1\u00fd\u0081\u0093U\u0010x\u00c4\u001f\u0091\u00cev[\u00b3\u00b4\u008b;-\u00e8\u00bf\u00e02X\"!\u00bf%(N\u0090\u00f1\u00bd^\u00ba\u00b9\u0000\u00db\u00dblX\u0017\u00e3\u0090z\u00f0\u0091\u001d\u008dv\u00bek0\u00c9\u00ae+\u00b7\u008c\u009dq\u00bd\u00a8\n\u00ae\u0097\u00c65\u00bdR\u00d9\u00ff\u00e6\u00fc\u00f2F\u00a0HN(\u0006f\u00a8\u00df\u008eC\u00d7W=\u00bd;5\u00de\u00f3K\u00b4\u00cdD\t(P\u00a3U\u007f\u0001\u00e0f2\u0016\u00db^\u00c7\u00d9Aa+\u009d\u001e\u009c>\u008bF\u00f1\u00af\u0096\u00f3h\u00ac\u00b6[oT\u0001\u0087\u0093Q\u009c,\u0016!\u00a0\u0099\u0083Ue*X \u0095(q\u00f3\u00ae@\u00adA\u00e5\u00c3\u00f2\u00ef";
                var5_4 = "\u00863s.M\u00cezO\u0014r\\B\u00d0w'\u0083%\u00a2\u0094Wi\u00cb\u00f6\u00a3M\u00019m\u0014-X\u00bbB\u0083\u00c3\u00ac\u0018\u0091>\u00de\u00d7\u00b3\r\u00b1\u0015\u0095Q\u00c8\u0082\u00194\u0097\u00aa\u00be9;w#0\u00bd\u00e5\u0091\u00c9\u00fa:\u0003~\u0098\u00a8\u00cb\b%\u000e+\u00edx\u00a8\u00d4\u00b95\u008fT\u00d1\u00fd\u0081\u0093U\u0010x\u00c4\u001f\u0091\u00cev[\u00b3\u00b4\u008b;-\u00e8\u00bf\u00e02X\"!\u00bf%(N\u0090\u00f1\u00bd^\u00ba\u00b9\u0000\u00db\u00dblX\u0017\u00e3\u0090z\u00f0\u0091\u001d\u008dv\u00bek0\u00c9\u00ae+\u00b7\u008c\u009dq\u00bd\u00a8\n\u00ae\u0097\u00c65\u00bdR\u00d9\u00ff\u00e6\u00fc\u00f2F\u00a0HN(\u0006f\u00a8\u00df\u008eC\u00d7W=\u00bd;5\u00de\u00f3K\u00b4\u00cdD\t(P\u00a3U\u007f\u0001\u00e0f2\u0016\u00db^\u00c7\u00d9Aa+\u009d\u001e\u009c>\u008bF\u00f1\u00af\u0096\u00f3h\u00ac\u00b6[oT\u0001\u0087\u0093Q\u009c,\u0016!\u00a0\u0099\u0083Ue*X \u0095(q\u00f3\u00ae@\u00adA\u00e5\u00c3\u00f2\u00ef".length();
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
                    var4_3 = "$y\u00a5\u00da-E\u0085\u00a8+[\u009b\u00b2\u00a7\u00b5\u0094%";
                    var5_4 = "$y\u00a5\u00da-E\u0085\u00a8+[\u009b\u00b2\u00a7\u00b5\u0094%".length();
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
        lo.a = var6_1;
        lo.c = new Integer[32];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x132B;
        if (c[n2] == null) {
            lo.c[n2] = (int)(a[n2] ^ l);
        }
        return c[n2];
    }
}
