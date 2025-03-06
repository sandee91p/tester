package lu.die.foza.SleepyFox;

import android.app.ActivityClient;
import android.app.IActivityClientController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ޔ {
   @NotNull
   public static final ޔ Ϳ = new ޔ();
   @Nullable
   public static Object Ԩ;

   @Nullable
   public final Object _/* $FF was: Ϳ*/() {
      return Ԩ;
   }

   public final void _/* $FF was: Ԩ*/() {
      Object var10000;
      boolean var10001;
      try {
         var10000 = Ԩ;
      } catch (Throwable var44) {
         var10001 = false;
         return;
      }

      if (var10000 == null) {
         ˋ var47;
         try {
            var47 = ˋ.Ϳ;
         } catch (Throwable var43) {
            var10001 = false;
            return;
         }

         ˋ var1 = var47;

         try {
            var10000 = var47.Ԩ(ActivityClient.class, "INTERFACE_SINGLETON");
         } catch (Throwable var42) {
            var10001 = false;
            return;
         }

         Object var2 = var10000;
         if (var10000 != null) {
            try {
               var10000 = var1.Ԩ(var2, "mKnownInstance");
            } catch (Throwable var41) {
               var10001 = false;
               return;
            }

            Object var46 = var10000;
            if (var10000 != null) {
               try {
                  var10000 = this.Ԩ(var46);
               } catch (Throwable var40) {
                  var10001 = false;
                  return;
               }

               Object var45 = var10000;
               if (var10000 != null) {
                  try {
                     ActivityClient.setActivityClientController((IActivityClientController)var45);
                  } catch (Throwable var39) {
                     var10001 = false;
                     return;
                  }
               }

            }
         }
      }
   }

   @Nullable
   public final Object _/* $FF was: Ԩ*/(@NotNull Object var1) {
      ৼ var10000 = ৼ.Ϳ;
      ࢧ.Ԫ.getClass();
      ˁ var2;
      if ((var2 = var10000.Ϳ((Object)var1, (ໞ)ࢧ.Ԯ())) != null) {
         ޜ.Ϳ.getClass();
         var2.Ϳ("overridePendingTransition", ޜ.Ԩ());
         ގ.ՠ.getClass();
         ގ.ֈ().Ϳ(var2);
         ၼ.ՠ.getClass();
         ၼ.֏().Ϳ(var2);
         Ԭ.֏.getClass();
         Ԭ.ֈ().Ϳ(var2);
         return Ԩ = var2.ԩ;
      } else {
         return null;
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1) {
      if (Ԩ == null) {
         ૹ var10000;
         boolean var10001;
         try {
            var10000 = new ૹ;
         } catch (Throwable var23) {
            var10001 = false;
            return;
         }

         ૹ var2 = var10000;

         Object var25;
         try {
            var2.<init>("mActivityClientController");
            var25 = var10000.ԩ(var1);
         } catch (Throwable var22) {
            var10001 = false;
            return;
         }

         Object var3 = var25;
         if (var25 != null) {
            try {
               var25 = this.Ԩ(var3);
            } catch (Throwable var21) {
               var10001 = false;
               return;
            }

            Object var24 = var25;
            if (var25 != null) {
               try {
                  var2.Ϳ(var1, var24);
                  ActivityClient.setActivityClientController((IActivityClientController)var24);
               } catch (Throwable var20) {
                  var10001 = false;
                  return;
               }
            }

         }
      }
   }
}
