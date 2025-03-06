package lu.die.foza.SleepyFox;

import android.app.WallpaperManager;
import android.os.IInterface;

public final class ʵ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ʵ var10000;
      boolean var10001;
      try {
         var10000 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var13) {
         var10001 = false;
         return;
      }

      Object var17;
      try {
         var10000.Ϳ = ࢯ.ՠ();
         var17 = ࢦ.ֈ().getSystemService("wallpaper");
      } catch (Exception var12) {
         var10001 = false;
         return;
      }

      Object var1 = var17;
      if (var17 != null) {
         ˋ var18;
         try {
            var18 = ˋ.Ϳ;
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         ˋ var2 = var18;

         try {
            var17 = var18.ԩ(var1, "getIWallpaperManager");
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         var1 = var17;
         if (var17 != null) {
            String var10002;
            Object var20;
            try {
               var10000 = this;
               var20 = var1;
               var10002 = "wallpaper";
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
                  var17 = var15.ԩ;
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }

               var1 = var17;
            } else {
               var1 = null;
            }

            if (var1 != null) {
               try {
                  var17 = var2.Ԩ(WallpaperManager.class, "sGlobals");
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               var1 = var17;
               if (var17 != null) {
                  ˁ var21;
                  try {
                     var18 = var2;
                     var21 = var15;
                     var10002 = "mService";
                  } catch (Exception var5) {
                     var10001 = false;
                     return;
                  }

                  var14 = var10002;

                  try {
                     var20 = var21.ԩ;
                  } catch (Exception var4) {
                     var10001 = false;
                     return;
                  }

                  Object var16 = var20;

                  try {
                     var18.Ϳ(var1, var14, var16);
                  } catch (Exception var3) {
                     var10001 = false;
                  }
               }
            }

         }
      }
   }
}
