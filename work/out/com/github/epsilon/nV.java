/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.yggdrasil.FriendsService
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.User
 *  net.minecraft.client.gui.screens.social.PlayerSocialManager
 *  net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler
 *  net.minecraft.client.multiplayer.ProfileKeyPairManager
 *  net.minecraft.client.multiplayer.chat.report.ReportingContext
 *  net.minecraft.client.renderer.texture.SkinTextureDownloader
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.resources.SkinManager
 *  net.minecraft.server.Services
 */
package com.github.epsilon;

import com.github.epsilon.DJ;
import com.github.epsilon.Dl;
import com.github.epsilon.X_;
import com.github.epsilon.hi;
import com.google.gson.JsonObject;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.FriendsService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.net.Proxy;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import net.minecraft.client.gui.screens.social.PlayerSocialManager;
import net.minecraft.client.gui.screens.social.RemoteFriendListUpdateHandler;
import net.minecraft.client.multiplayer.ProfileKeyPairManager;
import net.minecraft.client.multiplayer.chat.report.ReportingContext;
import net.minecraft.client.renderer.texture.SkinTextureDownloader;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.server.Services;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class nV<T extends nV<?>> {
    protected DJ I;
    protected final X_ j;
    protected String M;
    private static final String[] a;
    private static final String[] b;
    private static final long[] e;
    private static final Integer[] f;

    public void O(Object[] objectArray) {
        JsonObject jsonObject = (JsonObject)objectArray[0];
        hi.a("\u00a5", (Object)jsonObject, (Object)nV.a(-29329, 4288), (Object)hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)685769274009610955L), (long)1087813703548000919L), (long)853340881431046684L);
        nV.o("dNUjtT8ar4QavGg6", addProperty(java.lang.String java.lang.String ), (JsonObject)jsonObject, (String)nV.a(-29335, 12168), (String)((Object)hi.a("\u00e9", (Object)this, (long)485708115055468696L)));
        JsonObject jsonObject2 = new JsonObject();
        hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)this, (long)806520782816175070L), (Object)new Object[]{jsonObject2}, (long)698368412159202742L);
        hi.a("\u00a5", (Object)jsonObject, (Object)nV.a(-29330, 24042), (Object)jsonObject2, (long)384260616801611750L);
    }

    protected nV(DJ dJ, String string) {
        hi.a("\u00f2", (Object)this, (DJ)dJ, (long)685769274009610955L);
        hi.a("\u00f2", (Object)this, (String)string, (long)485708115055468696L);
        this.j = new X_();
    }

    /*
     * Exception decompiling
     */
    public static nV k(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* bridge */ /* synthetic */ CallSite o(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        MethodHandle methodHandle2;
        try {
            methodHandle2 = (MethodHandle)hi.d(567623961415166851L).invoke((Object)methodHandle, hi.a(methodType));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new ConstantCallSite(methodHandle2);
    }

    public static void Z(User user) {
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (User)user, (long)952710526293172967L);
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService((Proxy)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1274607003785657240L)));
        CallSite callSite = nV.o("dNUjtT8ar4QavGg6", createUserApiService(java.lang.String ), (YggdrasilAuthenticationService)yggdrasilAuthenticationService, (String)((Object)hi.a("\u00a5", (Object)user, (long)370663943909383093L)));
        CallSite callSite2 = hi.a("\u00a5", (Object)yggdrasilAuthenticationService, (Object)nV.o("dNUjtT8ar4QavGg6", getAccessToken(), (User)user), (long)1130034566323823819L);
        RemoteFriendListUpdateHandler remoteFriendListUpdateHandler = new RemoteFriendListUpdateHandler((FriendsService)callSite2, (Minecraft)hi.a("j", (long)1080602109828736465L));
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (UserApiService)callSite, (long)1094037327577687887L);
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (PlayerSocialManager)new PlayerSocialManager((Minecraft)hi.a("j", (long)1080602109828736465L), (UserApiService)callSite, (FriendsService)callSite2, remoteFriendListUpdateHandler), (long)770295871078580258L);
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (ProfileKeyPairManager)hi.a("G", (Object)callSite, (Object)user, (Object)nV.o("dNUjtT8ar4QavGg6", toPath(), (File)((Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1326884751002874937L))), (long)849757030162957238L), (long)1063999180985913191L);
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (ReportingContext)hi.a("G", (Object)hi.a("G", (long)806232842563213191L), (Object)callSite, (long)456333090540106188L), (long)629456150141401040L);
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (CompletableFuture)((Object)hi.a("G", nV::lambda$setSession$0, (Object)hi.a("G", (long)969856451765514536L), (long)745300807896941998L)), (long)909719011497306197L);
    }

    public DJ l() {
        return hi.a("\u00e9", (Object)this, (long)685769274009610955L);
    }

    private static ProfileResult lambda$setSession$0() {
        return hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)804136966190381064L), (long)1116743071254003303L), (Object)hi.a("\u00a5", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)682397390203701272L), (long)408775991819287412L), (boolean)true, (long)367771638954933845L);
    }

    /*
     * Exception decompiling
     */
    public T f(JsonObject var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public X_ o(Object[] objectArray) {
        return hi.a("\u00e9", (Object)this, (long)806520782816175070L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String u(Object[] var1_1) {
        block9: {
            var2_2 = Dl.t();
            var3_3 /* !! */  = nV.a(23986, 8486863289721096203L) * nV.a(29808, 3497715031868481937L) + nV.a(5022, 5106075098987120188L);
            if (!var2_2) break block9;
lbl5:
            // 3 sources

            while (true) {
                v0 /* !! */  = hi.a("\u00a5", (Object)hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)806520782816175070L), (long)487305887145600804L), (long)361382094905603987L);
                if (var2_2) ** GOTO lbl30
                if (v0 /* !! */  == false) ** GOTO lbl29
                ** GOTO lbl32
                break;
            }
lbl10:
            // 1 sources

            return hi.a("\u00e9", (Object)this, (long)485708115055468696L);
lbl12:
            // 1 sources

            return hi.a("\u00e9", (Object)hi.a("\u00e9", (Object)this, (long)806520782816175070L), (long)487305887145600804L);
        }
        while (true) {
            switch (var3_3 /* !! */ ) {
                default: {
                    ** GOTO lbl5
                }
                case 428396359: {
                    ** continue;
                }
                case 428396362: {
                    ** continue;
                }
                case 428396361: 
            }
            hi.a("G", (float)-1.0f, (long)945348514596968233L);
            if (var2_2) ** break;
            ** continue;
lbl29:
            // 2 sources

            v0 /* !! */  = (CallSite)(nV.a(26729, 6659214624879263183L) - nV.a(27687, 3631454199313840594L) ^ nV.a(29522, 664088377318516447L));
lbl30:
            // 2 sources

            var3_3 /* !! */  = (int)v0 /* !! */ ;
            if (!var2_2) continue;
lbl32:
            // 2 sources

            var3_3 /* !! */  = nV.a(64, 5596996518913529336L) / nV.a(16246, 3539540053430758129L) ^ nV.a(4374, 6504637897073018016L) ^ nV.a(29398, 8910305375901263691L);
        }
    }

    public static void e(Object[] objectArray) {
        YggdrasilAuthenticationService yggdrasilAuthenticationService = (YggdrasilAuthenticationService)objectArray[0];
        hi.a("G", (Object)hi.a("\u00a5", (Object)yggdrasilAuthenticationService, (long)665644206301149469L), (Object)hi.a("j", (long)1096558057447952959L), (long)874865794684562663L);
        CallSite callSite = hi.a("\u00e9", (Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1328511509015428148L), (long)1269245541380012147L);
        CallSite callSite2 = hi.a("\u00e9", (Object)callSite, (long)518467193474371531L);
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (Services)hi.a("G", (Object)yggdrasilAuthenticationService, (Object)hi.a("\u00e9", (Object)hi.a("j", (long)1080602109828736465L), (long)1326884751002874937L), (long)1009748398107730582L), (long)617950201253132469L);
        hi.a("\u00f2", (Object)hi.a("j", (long)1080602109828736465L), (SkinManager)new SkinManager((Path)((Object)callSite2), (Services)nV.o("dNUjtT8ar4QavGg6", services(), (Minecraft)hi.a("j", (long)1080602109828736465L)), new SkinTextureDownloader((Proxy)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1274607003785657240L)), (TextureManager)nV.o("dNUjtT8ar4QavGg6", getTextureManager(), (Minecraft)hi.a("j", (long)1080602109828736465L)), (Executor)((Object)hi.a("j", (long)1080602109828736465L))), (Executor)((Object)hi.a("j", (long)1080602109828736465L))), (long)1029542043546755079L);
    }

    public boolean e(Object[] objectArray) {
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService((Proxy)((Object)hi.a("\u00a5", (Object)hi.a("j", (long)1080602109828736465L), (long)1274607003785657240L)));
        hi.a("G", (Object)new Object[]{yggdrasilAuthenticationService}, (long)536268850845620601L);
        return true;
    }

    public abstract boolean z();

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[7];
                        var11_1 = 0;
                        var10_2 = "\u00be\u00fe%|\u0005`\u00c8\u0018\u00ac\u00ae\u0004\u001d0\u0015\u00be\u0015\u00b8xy]<3\u00d0\u0084\b\u00af\u00bfR1t\u000f\u0096)5\u00aem\u008f\u0005\u0080\u0007\u0004U-";
                        var12_3 = "\u00be\u00fe%|\u0005`\u00c8\u0018\u00ac\u00ae\u0004\u001d0\u0015\u00be\u0015\u00b8xy]<3\u00d0\u0084\b\u00af\u00bfR1t\u000f\u0096)5\u00aem\u008f\u0005\u0080\u0007\u0004U-".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 2;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u0095I>\u00f4\u0004%\u009clU";
                            var12_3 = "\u0095I>\u00f4\u0004%\u009clU".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 114;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 107;
                                    break;
                                }
                                case 1: {
                                    v15 = 118;
                                    break;
                                }
                                case 2: {
                                    v15 = 87;
                                    break;
                                }
                                case 3: {
                                    v15 = 28;
                                    break;
                                }
                                case 4: {
                                    v15 = 111;
                                    break;
                                }
                                case 5: {
                                    v15 = 125;
                                    break;
                                }
                                default: {
                                    v15 = 125;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                nV.a = var13;
                nV.b = new String[7];
                var0_7 = 4625400996186355299L;
                var6_8 = new long[81];
                var3_9 = 0;
                var4_10 = "\u00a5\u00ae\"`E\u00ec\u00db\u00d5\u00be\u0011\u0010\u00d7\u0014T\u00db\u0083\u00fe\u00b4\u0005\u000b\u00b6\u000bC\u00a9\u00bd\u00c1\u00b1\u0096\u00b30\"+\u00b5o&\u00ca\u00d4\u009dB\u0005\u00ac\u00dc\u00ca\u00e0\u00cb\u00fd}\u0018RMX\u00dbI\u001e\u009d\u00c4\u00b0H\u00e1\u000bi\u00b8\u001f=\fo\u008d\u00dc\u00c1\u009f\u00ab\u00d2\u00ce\u00bc^\u008a\u0019`+\b\u00d8\u0092\u00cd\tM\u0083\u00c5vMG\u00f8EC\u00b2\u0082\u00ef`\u00af2MG3\f$\u008b\u0010R\u00b3\u00e4\u00a1\u00e2b\u008c\u00c2\u00ad\u00f9\u009b\u009a\u0011\u0019\u0098^\u00be\u0013\u00b03\u00f4\u0087\u0011\u00ff\u00a4\u00a13+P\u00e1'\u00a0\u0090\u0017\u00f46\u00f7\u0090\u00b5\u00bf\u00cd-*\u008d\u00e6\u00d5;\u00a2\u00e5\u00d8\u0092\u00b8o\u00dd\u0081\u00bfQWA+\t\u00ad<P:T\u00d7\u0015g\"\u009e\u00f7\u00a4k;zVb5\u00df\u007f~\u00e8\u008b\u00a9\u00f8\u00ba\u00ac\u00a6Y\u00f1z\u00c1 \u000e\u009a\u00c9\u008e\u00ad\u0002\u00b2\u00bbv\u00c29S\u00fe@HA\u008f@,\u00e5\u00e9|\u0012,_\u00f4\u0005\u00aaH\u0092#\u0001y\u00e6\u009e\u00e4&\u0018\b\u00d3\u0016\u0002\u00d8Ny\u001f$\u0080\u00de\u00c0\u000b\u00b3}\u00d5\u00a2\u00ebXw\\@\u0087\u00d3Q\u00b5(\u008a\u00aa\u0006p\u0093\u00cd\u009a\u00898\u00f3\u0084\u001cCB\u00c7Q\u00e8p\u00f8\u008d\u00cb\u00fb[z\u00c0\u001bZ?\u00df\u0010\u00ad\u00b1\u00d5\u00ca\u00ae-\u0015MSU\u00da:\u00cb\u00b6\u00c5\u00c7\u009e\u00e4\u00f8d\u00e9\u00b2\u00eb\u00b3\u0016\u00f9H\u00d8y\u0089\u0002\u00b1S\u00f6\u00c8\u00f6\u00c6\u001a\u0081/\u00fd\u00d1\u00cfZ\u00b0\u00caj\u00f3E)B\u009e\u0013/\u001dX_\u00d2\u00ad\u0081\u00f6\u00ed\u00f4\u00a7\u00cb[\u00e4\u001c\u00e51\ri\u00de\u00ae\u0001h\u00d72\u00d8\u0015\u00f6\u00e5\u0094>\u00adt\u008e\u0014;\u0095\u00d5BE\u008d\u00d1\u0016|\u0088T\u0081\u00e6\u0097B\u00b1pjv\u0087\u00e5wt\u00ad\t\u00d8\u00a3\u000bj\u00d7\u00d8\u0014r\u00ee\u00dc/\u00bcw\\\u0012-\u00e2\u00b2\u009b\u00c6\u0098Dl\u0012\u00a2\u00cd\u00b2\u0096\u00f8m\u001c\u009f\u00f83\u00e5\u0015Fv\u00b4|\u00d3\u00ebi\u00be\u00b8\u0003$\u00b0\u00d8b\u00df\u00ff\u001b\u00b2\u00bfP\u0011\u0081\u00af\u008f\u008e\u00de\u0017H\u00d7\u00be:\u001c\u0000\u0007\u000fq:\u00ce\u00015F\u008e\u001dr?+\u00fby!j\u00d4\u008d\u00db\u0001\u00daVkE\u00d2\u000f\u00dc\\\u00e0\u0012\u00df\u00f4\u00c4\u00a0\u00a8\u00910I\u0018\u00cf\u009b\u00b820)\u0007\u0012\u00e4\u001aJ\u00b8L\u00f8G\u00f8)\u009e\u00a8 \u00c4J7E\u00c0s\u00c9\u001e=@\u00f7*^\u0090a\u00df\u0012\u0013\u0012\u00e1\u00fa\u00a2\u009a\u00f3\u00b7\u00b9\u00e9\u0091\u00e0\u001c\u00f7\u00a1\u009b\u00f7\u00dd\u009cmD~\u00dc.\u0007y\u00f33\u00a4\u00a5\n\u0095=\u00d8\u00f2\u0096\u00e0\u0099\u00f3lk\u0010\u00cdz3\u00cfT\u00a4\u00e0<\u0092e\r\u00a0\u00ff\\W\u00e3E\u0011\u00a7\u00a4-\u000e\u00ac\u001f\u00e0\t\rk\u00c8\u00baw\u00e8\u00f1L\u00e4\u00db";
                var5_11 = "\u00a5\u00ae\"`E\u00ec\u00db\u00d5\u00be\u0011\u0010\u00d7\u0014T\u00db\u0083\u00fe\u00b4\u0005\u000b\u00b6\u000bC\u00a9\u00bd\u00c1\u00b1\u0096\u00b30\"+\u00b5o&\u00ca\u00d4\u009dB\u0005\u00ac\u00dc\u00ca\u00e0\u00cb\u00fd}\u0018RMX\u00dbI\u001e\u009d\u00c4\u00b0H\u00e1\u000bi\u00b8\u001f=\fo\u008d\u00dc\u00c1\u009f\u00ab\u00d2\u00ce\u00bc^\u008a\u0019`+\b\u00d8\u0092\u00cd\tM\u0083\u00c5vMG\u00f8EC\u00b2\u0082\u00ef`\u00af2MG3\f$\u008b\u0010R\u00b3\u00e4\u00a1\u00e2b\u008c\u00c2\u00ad\u00f9\u009b\u009a\u0011\u0019\u0098^\u00be\u0013\u00b03\u00f4\u0087\u0011\u00ff\u00a4\u00a13+P\u00e1'\u00a0\u0090\u0017\u00f46\u00f7\u0090\u00b5\u00bf\u00cd-*\u008d\u00e6\u00d5;\u00a2\u00e5\u00d8\u0092\u00b8o\u00dd\u0081\u00bfQWA+\t\u00ad<P:T\u00d7\u0015g\"\u009e\u00f7\u00a4k;zVb5\u00df\u007f~\u00e8\u008b\u00a9\u00f8\u00ba\u00ac\u00a6Y\u00f1z\u00c1 \u000e\u009a\u00c9\u008e\u00ad\u0002\u00b2\u00bbv\u00c29S\u00fe@HA\u008f@,\u00e5\u00e9|\u0012,_\u00f4\u0005\u00aaH\u0092#\u0001y\u00e6\u009e\u00e4&\u0018\b\u00d3\u0016\u0002\u00d8Ny\u001f$\u0080\u00de\u00c0\u000b\u00b3}\u00d5\u00a2\u00ebXw\\@\u0087\u00d3Q\u00b5(\u008a\u00aa\u0006p\u0093\u00cd\u009a\u00898\u00f3\u0084\u001cCB\u00c7Q\u00e8p\u00f8\u008d\u00cb\u00fb[z\u00c0\u001bZ?\u00df\u0010\u00ad\u00b1\u00d5\u00ca\u00ae-\u0015MSU\u00da:\u00cb\u00b6\u00c5\u00c7\u009e\u00e4\u00f8d\u00e9\u00b2\u00eb\u00b3\u0016\u00f9H\u00d8y\u0089\u0002\u00b1S\u00f6\u00c8\u00f6\u00c6\u001a\u0081/\u00fd\u00d1\u00cfZ\u00b0\u00caj\u00f3E)B\u009e\u0013/\u001dX_\u00d2\u00ad\u0081\u00f6\u00ed\u00f4\u00a7\u00cb[\u00e4\u001c\u00e51\ri\u00de\u00ae\u0001h\u00d72\u00d8\u0015\u00f6\u00e5\u0094>\u00adt\u008e\u0014;\u0095\u00d5BE\u008d\u00d1\u0016|\u0088T\u0081\u00e6\u0097B\u00b1pjv\u0087\u00e5wt\u00ad\t\u00d8\u00a3\u000bj\u00d7\u00d8\u0014r\u00ee\u00dc/\u00bcw\\\u0012-\u00e2\u00b2\u009b\u00c6\u0098Dl\u0012\u00a2\u00cd\u00b2\u0096\u00f8m\u001c\u009f\u00f83\u00e5\u0015Fv\u00b4|\u00d3\u00ebi\u00be\u00b8\u0003$\u00b0\u00d8b\u00df\u00ff\u001b\u00b2\u00bfP\u0011\u0081\u00af\u008f\u008e\u00de\u0017H\u00d7\u00be:\u001c\u0000\u0007\u000fq:\u00ce\u00015F\u008e\u001dr?+\u00fby!j\u00d4\u008d\u00db\u0001\u00daVkE\u00d2\u000f\u00dc\\\u00e0\u0012\u00df\u00f4\u00c4\u00a0\u00a8\u00910I\u0018\u00cf\u009b\u00b820)\u0007\u0012\u00e4\u001aJ\u00b8L\u00f8G\u00f8)\u009e\u00a8 \u00c4J7E\u00c0s\u00c9\u001e=@\u00f7*^\u0090a\u00df\u0012\u0013\u0012\u00e1\u00fa\u00a2\u009a\u00f3\u00b7\u00b9\u00e9\u0091\u00e0\u001c\u00f7\u00a1\u009b\u00f7\u00dd\u009cmD~\u00dc.\u0007y\u00f33\u00a4\u00a5\n\u0095=\u00d8\u00f2\u0096\u00e0\u0099\u00f3lk\u0010\u00cdz3\u00cfT\u00a4\u00e0<\u0092e\r\u00a0\u00ff\\W\u00e3E\u0011\u00a7\u00a4-\u000e\u00ac\u001f\u00e0\t\rk\u00c8\u00baw\u00e8\u00f1L\u00e4\u00db".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "$r\u00ad\u00d5\u008c\u009c\u00a4T\u0080%\n\u00ca^&\u00f6M";
                    var5_11 = "$r\u00ad\u00d5\u008c\u009c\u00a4T\u0080%\n\u00ca^&\u00f6M".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        nV.e = var6_8;
        nV.f = new Integer[81];
    }

    private static String a(int n, int n3) {
        int n4 = (n ^ 0xFFFF8D6F) & 0xFFFF;
        if (b[n4] == null) {
            int n5;
            char[] cArray = a[n4].toCharArray();
            int n6 = switch (cArray[0] & 0xFF) {
                case 0 -> 214;
                case 1 -> 49;
                case 2 -> 185;
                case 3 -> 226;
                case 4 -> 186;
                case 5 -> 213;
                case 6 -> 217;
                case 7 -> 10;
                case 8 -> 147;
                case 9 -> 128;
                case 10 -> 66;
                case 11 -> 69;
                case 12 -> 137;
                case 13 -> 154;
                case 14 -> 71;
                case 15 -> 200;
                case 16 -> 245;
                case 17 -> 220;
                case 18 -> 161;
                case 19 -> 192;
                case 20 -> 32;
                case 21 -> 122;
                case 22 -> 78;
                case 23 -> 84;
                case 24 -> 152;
                case 25 -> 144;
                case 26 -> 215;
                case 27 -> 176;
                case 28 -> 140;
                case 29 -> 252;
                case 30 -> 63;
                case 31 -> 209;
                case 32 -> 4;
                case 33 -> 102;
                case 34 -> 60;
                case 35 -> 97;
                case 36 -> 142;
                case 37 -> 92;
                case 38 -> 195;
                case 39 -> 93;
                case 40 -> 155;
                case 41 -> 19;
                case 42 -> 189;
                case 43 -> 115;
                case 44 -> 145;
                case 45 -> 198;
                case 46 -> 249;
                case 47 -> 248;
                case 48 -> 110;
                case 49 -> 50;
                case 50 -> 149;
                case 51 -> 106;
                case 52 -> 194;
                case 53 -> 158;
                case 54 -> 7;
                case 55 -> 3;
                case 56 -> 247;
                case 57 -> 21;
                case 58 -> 164;
                case 59 -> 26;
                case 60 -> 54;
                case 61 -> 224;
                case 62 -> 31;
                case 63 -> 119;
                case 64 -> 141;
                case 65 -> 73;
                case 66 -> 238;
                case 67 -> 233;
                case 68 -> 112;
                case 69 -> 62;
                case 70 -> 188;
                case 71 -> 132;
                case 72 -> 120;
                case 73 -> 105;
                case 74 -> 169;
                case 75 -> 103;
                case 76 -> 230;
                case 77 -> 80;
                case 78 -> 180;
                case 79 -> 184;
                case 80 -> 94;
                case 81 -> 222;
                case 82 -> 51;
                case 83 -> 18;
                case 84 -> 196;
                case 85 -> 37;
                case 86 -> 33;
                case 87 -> 8;
                case 88 -> 146;
                case 89 -> 113;
                case 90 -> 48;
                case 91 -> 255;
                case 92 -> 216;
                case 93 -> 53;
                case 94 -> 87;
                case 95 -> 235;
                case 96 -> 177;
                case 97 -> 101;
                case 98 -> 202;
                case 99 -> 70;
                case 100 -> 41;
                case 101 -> 0;
                case 102 -> 83;
                case 103 -> 139;
                case 104 -> 43;
                case 105 -> 17;
                case 106 -> 206;
                case 107 -> 98;
                case 108 -> 89;
                case 109 -> 174;
                case 110 -> 25;
                case 111 -> 99;
                case 112 -> 86;
                case 113 -> 250;
                case 114 -> 65;
                case 115 -> 2;
                case 116 -> 100;
                case 117 -> 138;
                case 118 -> 24;
                case 119 -> 95;
                case 120 -> 40;
                case 121 -> 36;
                case 122 -> 165;
                case 123 -> 227;
                case 124 -> 179;
                case 125 -> 118;
                case 126 -> 68;
                case 127 -> 126;
                case 128 -> 30;
                case 129 -> 170;
                case 130 -> 242;
                case 131 -> 212;
                case 132 -> 6;
                case 133 -> 127;
                case 134 -> 168;
                case 135 -> 157;
                case 136 -> 23;
                case 137 -> 125;
                case 138 -> 163;
                case 139 -> 121;
                case 140 -> 160;
                case 141 -> 166;
                case 142 -> 223;
                case 143 -> 28;
                case 144 -> 12;
                case 145 -> 111;
                case 146 -> 16;
                case 147 -> 172;
                case 148 -> 56;
                case 149 -> 239;
                case 150 -> 210;
                case 151 -> 191;
                case 152 -> 81;
                case 153 -> 241;
                case 154 -> 253;
                case 155 -> 108;
                case 156 -> 96;
                case 157 -> 64;
                case 158 -> 219;
                case 159 -> 173;
                case 160 -> 240;
                case 161 -> 134;
                case 162 -> 61;
                case 163 -> 193;
                case 164 -> 229;
                case 165 -> 197;
                case 166 -> 135;
                case 167 -> 167;
                case 168 -> 5;
                case 169 -> 221;
                case 170 -> 55;
                case 171 -> 46;
                case 172 -> 201;
                case 173 -> 159;
                case 174 -> 14;
                case 175 -> 243;
                case 176 -> 20;
                case 177 -> 187;
                case 178 -> 109;
                case 179 -> 39;
                case 180 -> 85;
                case 181 -> 59;
                case 182 -> 9;
                case 183 -> 133;
                case 184 -> 52;
                case 185 -> 143;
                case 186 -> 42;
                case 187 -> 44;
                case 188 -> 136;
                case 189 -> 182;
                case 190 -> 251;
                case 191 -> 116;
                case 192 -> 203;
                case 193 -> 130;
                case 194 -> 82;
                case 195 -> 107;
                case 196 -> 74;
                case 197 -> 45;
                case 198 -> 77;
                case 199 -> 47;
                case 200 -> 13;
                case 201 -> 183;
                case 202 -> 181;
                case 203 -> 22;
                case 204 -> 204;
                case 205 -> 150;
                case 206 -> 254;
                case 207 -> 156;
                case 208 -> 151;
                case 209 -> 148;
                case 210 -> 67;
                case 211 -> 175;
                case 212 -> 34;
                case 213 -> 178;
                case 214 -> 27;
                case 215 -> 29;
                case 216 -> 75;
                case 217 -> 207;
                case 218 -> 117;
                case 219 -> 246;
                case 220 -> 234;
                case 221 -> 91;
                case 222 -> 57;
                case 223 -> 90;
                case 224 -> 114;
                case 225 -> 236;
                case 226 -> 208;
                case 227 -> 58;
                case 228 -> 205;
                case 229 -> 244;
                case 230 -> 38;
                case 231 -> 11;
                case 232 -> 228;
                case 233 -> 162;
                case 234 -> 123;
                case 235 -> 124;
                case 236 -> 35;
                case 237 -> 72;
                case 238 -> 129;
                case 239 -> 15;
                case 240 -> 171;
                case 241 -> 88;
                case 242 -> 79;
                case 243 -> 199;
                case 244 -> 218;
                case 245 -> 237;
                case 246 -> 131;
                case 247 -> 153;
                case 248 -> 232;
                case 249 -> 190;
                case 250 -> 225;
                case 251 -> 1;
                case 252 -> 76;
                case 253 -> 231;
                case 254 -> 211;
                default -> 104;
            };
            int n7 = (n3 & 0xFF) - n6;
            if (n7 < 0) {
                n7 += 256;
            }
            if ((n5 = ((n3 & 0xFFFF) >>> 8) - n6) < 0) {
                n5 += 256;
            }
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                char[] cArray2 = cArray;
                char c = cArray[n10];
                if (n9 == 0) {
                    cArray2[n10] = (char)(c ^ n7);
                    n7 = ((n7 >>> 3 | n7 << 5) ^ cArray[n8]) & 0xFF;
                } else {
                    cArray2[n10] = (char)(c ^ n5);
                    n5 = ((n5 >>> 3 | n5 << 5) ^ cArray[n8]) & 0xFF;
                }
                ++n8;
            }
            nV.b[n4] = new String(cArray).intern();
        }
        return b[n4];
    }

    private static int a(int n, long l) {
        int n3 = n ^ (int)(l & 0x7FFFL) ^ 0x55B1;
        if (f[n3] == null) {
            nV.f[n3] = (int)(e[n3] ^ l);
        }
        return f[n3];
    }
}
