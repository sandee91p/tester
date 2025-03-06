package lu.die.foza.SleepyFox;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import android.security.net.config.NetworkSecurityConfigProvider;
import dalvik.system.VMRuntime;
import org.jetbrains.annotations.NotNull;

public final class ނ {
   @NotNull
   public static final ނ Ϳ = new ނ();

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull Context var2, @NotNull ApplicationInfo var3) {
      int var10000;
      boolean var10001;
      try {
         var10000 = var3.targetSdkVersion;
      } catch (Throwable var75) {
         var10001 = false;
         return;
      }

      int var76 = var10000;

      boolean var77;
      label649: {
         try {
            VMRuntime.getRuntime().setTargetSdkVersion(var76);
            var77 = ތ.ހ;
         } catch (Throwable var69) {
            var10001 = false;
            break label649;
         }

         if (var77) {
            label612:
            try {
               VMRuntime.setProcessPackageName(var1);
               VMRuntime.setProcessDataDirectory(var3.dataDir);
            } catch (Throwable var68) {
               var10001 = false;
               break label612;
            }
         }
      }

      try {
         var77 = ތ.Ԯ;
      } catch (Throwable var74) {
         var10001 = false;
         return;
      }

      if (var77) {
         if (var76 < 28) {
            Context var78;
            try {
               var78 = ࢦ.ֈ();
            } catch (Throwable var73) {
               var10001 = false;
               return;
            }

            var2 = var78;
         }

         try {
            NetworkSecurityConfigProvider.install(var2);
         } catch (Throwable var72) {
            var10001 = false;
            return;
         }
      }

      if (var76 < 24) {
         try {
            var77 = ތ.ԫ;
         } catch (Throwable var71) {
            var10001 = false;
            return;
         }

         if (var77) {
            try {
               ˋ.Ϳ.Ϳ(StrictMode.class, "disableDeathOnFileUriExposure");
            } catch (Throwable var70) {
               var10001 = false;
               return;
            }
         }
      }

   }

   public final void _/* $FF was: Ϳ*/() {
      // $FF: Couldn't be decompiled
   }
}
