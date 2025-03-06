package lu.die.foza.SleepyFox;

import android.app.AppCompatCallbacks;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.security.Security;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nFozaSystemAutoCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaSystemAutoCompat.kt\nlu/die/foza/FoxDev/ThirdParty/FozaSystemAutoCompat\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,170:1\n13309#2,2:171\n*S KotlinDebug\n*F\n+ 1 FozaSystemAutoCompat.kt\nlu/die/foza/FoxDev/ThirdParty/FozaSystemAutoCompat\n*L\n64#1:171,2\n*E\n"})
public final class ൎ {
   @NotNull
   public static final ൎ Ϳ = new ൎ();

   public final void _/* $FF was: Ϳ*/(@NotNull ࣄ var1) {
      ࢳ var10000 = ࢳ.Ϳ;
      ࡠ.ԩ.getClass();
      boolean var10002 = ࡠ.ԫ().ԯ("com.google.android.gms");
      var10000.getClass();
      ࢳ.Ԩ = var10002;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ApplicationInfo param1) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/() {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ԫ*/() {
      if (VERSION.SDK_INT >= 28) {
         lu.die.foza.FoxDev.ThirdParty.Ϳ.Ϳ.Ϳ("L");
      }

   }

   public final void _/* $FF was: Ԩ*/() {
      Security.removeProvider("AndroidNSSP");
   }

   public final void _/* $FF was: ԩ*/() {
      byte var19;
      byte var10000 = var19 = 11;

      boolean var10001;
      long[] var22;
      try {
         var22 = new long[var10000];
      } catch (Exception var18) {
         var10001 = false;
         return;
      }

      long[] var24 = var22;
      long[] var10002 = var22;
      long[] var10003 = var22;
      long[] var10004 = var22;
      long[] var10005 = var22;
      long[] var10006 = var22;
      long[] var10007 = var22;
      long[] var10008 = var22;
      long[] var10009 = var22;
      long[] var1;
      long[] var10010 = var1 = var22;

      ૹ var23;
      try {
         var10010[0] = 160794467L;
         var10009[1] = 144027538L;
         var10008[2] = 171317480L;
         var10007[3] = 148964793L;
         var10006[4] = 169887240L;
         var10005[5] = 148963590L;
         var10004[6] = 147798919L;
         var10003[7] = 218865702L;
         var10002[8] = 154726397L;
         var24[9] = 241104082L;
         var22[10] = 255371817L;
         var23 = new ૹ;
      } catch (Exception var17) {
         var10001 = false;
         return;
      }

      ૹ var2;
      ૹ var26 = var2 = var23;

      ࢭ var28;
      try {
         var26.<init>("disabledCompatChanges");
         var28 = ࢭ.ֈ;
      } catch (Exception var16) {
         var10001 = false;
         return;
      }

      ࢭ var3 = var28;

      try {
         var28.getClass();
      } catch (Exception var15) {
         var10001 = false;
         return;
      }

      Object var29;
      try {
         var29 = ࢭ.ހ;
      } catch (Exception var14) {
         var10001 = false;
         return;
      }

      Object var4 = var29;

      try {
         var22 = (long[])var23.ԩ(var29);
      } catch (Exception var13) {
         var10001 = false;
         return;
      }

      long[] var5 = var22;
      if (var22 != null) {
         int var31;
         try {
            var10000 = var19;
            var31 = var5.length;
         } catch (Exception var12) {
            var10001 = false;
            return;
         }

         int var25 = var10000 + var31;

         try {
            var22 = new long[var25];
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         long[] var6 = var22;
         var26 = var2;
         Object var27 = var4;
         var10003 = var6;
         ࢭ var30 = var3;
         var10005 = var5;
         var10006 = var5;
         var10007 = var1;
         byte var33 = 0;
         var10009 = var6;
         byte var34 = 0;

         try {
            System.arraycopy(var10007, var33, var10009, var34, var19);
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         byte var20 = 0;

         int var32;
         try {
            var32 = var10006.length;
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         int var21 = var32;

         try {
            System.arraycopy(var10005, var20, var6, var19, var21);
            var30.getClass();
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         try {
            var26.Ϳ(var27, var10003);
            AppCompatCallbacks.install(var22);
         } catch (Exception var7) {
            var10001 = false;
         }

      }
   }
}
