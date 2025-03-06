package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Handler.Callback;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢿ {
   @NotNull
   public static final ࢿ Ϳ = new ࢿ();
   @Nullable
   public static Ԯ Ԩ;
   @NotNull
   public static final ૹ<Callback> ԩ = new ૹ("mCallback");

   @JvmStatic
   public static final void _/* $FF was: Ϳ*/(@Nullable Ԯ var0) {
      Ԩ = var0;
   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable String var2) {
      Ԯ var3;
      if ((var3 = Ԩ) != null) {
         var3.Ϳ(var1, var2);
      }

   }

   public final void _/* $FF was: Ϳ*/() {
      if (ތ.Ԯ) {
         this.ԩ();
      } else {
         this.Ԩ();
      }

   }

   @SuppressLint({"SoonBlockedPrivateApi"})
   public final void _/* $FF was: ԩ*/() {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ԩ*/() {
      ૹ var10000;
      boolean var10001;
      try {
         var10000 = ԩ;
      } catch (Exception var19) {
         var10001 = false;
         return;
      }

      ૹ var20 = var10000;

      ࢭ var25;
      try {
         var25 = ࢭ.ֈ;
      } catch (Exception var18) {
         var10001 = false;
         return;
      }

      ࢭ var1 = var25;

      try {
         var25.getClass();
      } catch (Exception var17) {
         var10001 = false;
         return;
      }

      Handler var27;
      try {
         var27 = ࢭ.ؠ;
      } catch (Exception var16) {
         var10001 = false;
         return;
      }

      Handler var2 = var27;

      Callback var22;
      try {
         var22 = (Callback)var10000.ԩ(var27);
      } catch (Exception var15) {
         var10001 = false;
         return;
      }

      Callback var3 = var22;
      if (var22 == null) {
         ࢭ var10002;
         ຉ var10003;
         try {
            var10000 = var20;
            var27 = var2;
            var10002 = var1;
            var10003 = ຉ.Ϳ;
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         ຉ var21 = var10003;
         var10003 = null;

         try {
            var21.getClass();
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         try {
            ຉ.Ԭ = var10003;
            var10002.getClass();
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         try {
            var10000.Ϳ(var27, var21);
         } catch (Exception var5) {
            var10001 = false;
         }
      } else {
         boolean var23;
         try {
            var23 = var3 instanceof ຉ;
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         if (!var23) {
            ຉ var24;
            try {
               var24 = ຉ.Ϳ;
            } catch (Exception var13) {
               var10001 = false;
               return;
            }

            ຉ var4 = var24;

            try {
               var23 = var24.Ϳ(var3);
            } catch (Exception var12) {
               var10001 = false;
               return;
            }

            if (!var23) {
               Callback var26;
               try {
                  var10000 = var20;
                  var25 = var1;
                  var26 = var3;
                  var4.getClass();
               } catch (Exception var11) {
                  var10001 = false;
                  return;
               }

               try {
                  ຉ.Ԭ = var26;
                  var25.getClass();
               } catch (Exception var10) {
                  var10001 = false;
                  return;
               }

               try {
                  var10000.Ϳ(var2, var4);
               } catch (Exception var9) {
                  var10001 = false;
               }
            }
         }
      }

   }
}
