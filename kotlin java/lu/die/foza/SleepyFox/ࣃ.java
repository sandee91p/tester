package lu.die.foza.SleepyFox;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࣃ {
   @NotNull
   public static final ࣃ.Ϳ Ԩ = new ࣃ.Ϳ();
   @NotNull
   public static final ࣃ ԩ = new ࣃ();
   @NotNull
   public final String Ϳ = "content://sms/";

   // $FF: synthetic method
   public static void _/* $FF was: Ϳ*/(ࣃ var0, Uri var1, Bundle var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      var0.Ϳ(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@Nullable Uri var1, @Nullable Bundle var2) {
      Uri var10000;
      boolean var10001;
      ࡡ.Ϳ var21;
      try {
         var10000 = var1;
         var21 = ࡡ.Ϳ;
      } catch (Exception var17) {
         var10001 = false;
         return;
      }

      ࡡ.Ϳ var3 = var21;

      try {
         var21.getClass();
      } catch (Exception var16) {
         var10001 = false;
         return;
      }

      try {
         ࡡ.Ϳ().getClass();
      } catch (Exception var15) {
         var10001 = false;
         return;
      }

      if (var10000 != null) {
         boolean var19;
         try {
            var19 = Intrinsics.areEqual(var1, Contacts.CONTENT_URI);
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         Bundle var20;
         ࡡ var22;
         if (var19) {
            try {
               var20 = var2;
               var3.getClass();
            } catch (Exception var13) {
               var10001 = false;
               return;
            }

            try {
               var22 = ࡡ.Ϳ();
            } catch (Exception var12) {
               var10001 = false;
               return;
            }

            ࡡ var4 = var22;
            if (var20 != null) {
               try {
                  var2.toString();
               } catch (Exception var11) {
                  var10001 = false;
                  return;
               }
            }

            try {
               var4.getClass();
            } catch (Exception var10) {
               var10001 = false;
               return;
            }
         }

         try {
            var19 = StringsKt.startsWith$default(var1.toString(), this.Ϳ, false, 2, (Object)null);
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         if (var19) {
            try {
               var20 = var2;
               var3.getClass();
            } catch (Exception var8) {
               var10001 = false;
               return;
            }

            try {
               var22 = ࡡ.Ϳ();
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            ࡡ var18 = var22;
            if (var20 != null) {
               try {
                  var2.toString();
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }
            }

            try {
               var18.getClass();
            } catch (Exception var5) {
               var10001 = false;
            }
         }

      }
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ࣃ _/* $FF was: Ϳ*/() {
         return ࣃ.ԩ;
      }
   }
}
