package lu.die.foza.SleepyFox;

import android.os.IInterface;

public final class ࡢ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ࡢ var10000;
      boolean var10001;
      try {
         var10000 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var13) {
         var10001 = false;
         return;
      }

      ˋ var17;
      try {
         var10000.Ϳ = ࢯ.ՠ();
         var17 = ˋ.Ϳ;
      } catch (Exception var12) {
         var10001 = false;
         return;
      }

      ˋ var1 = var17;

      Object var18;
      try {
         var18 = var17.Ϳ("android.hardware.display.DisplayManagerGlobal", "getInstance");
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      Object var2 = var18;
      if (var18 != null) {
         try {
            var18 = var1.Ԩ(var2, "mDm");
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         Object var3 = var18;
         if (var18 != null) {
            String var10002;
            Object var20;
            try {
               var10000 = this;
               var20 = var3;
               var10002 = "display";
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            String var14 = var10002;

            ˁ var19;
            try {
               var19 = var10000.Ϳ(var14, (IInterface)var20);
            } catch (Exception var8) {
               var10001 = false;
               return;
            }

            ˁ var15 = var19;
            if (var19 != null) {
               try {
                  var18 = var15.ԩ;
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }

               var3 = var18;
            } else {
               var3 = null;
            }

            if (var3 != null) {
               ˁ var21;
               try {
                  var17 = var1;
                  var21 = var15;
                  var10002 = "mDm";
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               var14 = var10002;

               try {
                  var20 = var21.ԩ;
               } catch (Exception var5) {
                  var10001 = false;
                  return;
               }

               Object var16 = var20;

               try {
                  var17.Ϳ(var2, var14, var16);
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

         }
      }
   }
}
