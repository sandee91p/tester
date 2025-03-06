package lu.die.foza.SleepyFox;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢳ {
   @NotNull
   public static final ࢳ Ϳ = new ࢳ();
   public static boolean Ԩ;

   public final void _/* $FF was: Ϳ*/(boolean var1) {
      Ԩ = var1;
   }

   public final boolean _/* $FF was: ԩ*/(@NotNull String var1) {
      return SetsKt.hashSetOf(new String[]{"com.google.android.gsf", "com.google.android.gms", "com.android.vending", "com.google.android.play.games", "com.google.android.wearable.app", "com.google.android.wearable.app.cn", "com.google.android.gsf.login", "com.google.android.backuptransport", "com.google.android.backup", "com.google.android.configupdater", "com.google.android.syncadapters.contacts", "com.google.android.feedback", "com.google.android.onetimeinitializer", "com.google.android.partnersetup", "com.google.android.setupwizard", "com.google.android.syncadapters.calendar"}).contains(var1);
   }

   public final boolean _/* $FF was: Ϳ*/() {
      return Ԩ;
   }

   public final boolean _/* $FF was: Ԫ*/(@Nullable String var1) {
      return Intrinsics.areEqual(var1, "com.android.vending.licensing.ILicensingService") || Intrinsics.areEqual(var1, "com.android.vending.billing.InAppBillingService.BIND");
   }

   public final boolean _/* $FF was: Ԩ*/(@Nullable String var1) {
      boolean var10000;
      label34: {
         if (var1 != null) {
            int var2;
            if ((var2 = var1.hashCode()) != -1046965711) {
               if (var2 != 325967270) {
                  if (var2 == 325967443 && var1.equals("com.google.android.gsf")) {
                     break label34;
                  }
               } else if (var1.equals("com.google.android.gms")) {
                  break label34;
               }
            } else if (var1.equals("com.android.vending")) {
               break label34;
            }
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull String var1) {
      return Ԩ || !this.Ԩ(var1);
   }
}
