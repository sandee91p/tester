package lu.die.foza.SleepyFox;

import android.media.AudioManager;
import android.os.IInterface;

public final class ވ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ވ var10000;
      boolean var10001;
      try {
         var10000 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var12) {
         var10001 = false;
         return;
      }

      ˋ var16;
      try {
         var10000.Ϳ = ࢯ.ՠ();
         var16 = ˋ.Ϳ;
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      ˋ var1 = var16;

      Object var17;
      try {
         var17 = var16.Ϳ(AudioManager.class.getName(), "getService");
      } catch (Exception var10) {
         var10001 = false;
         return;
      }

      Object var2 = var17;
      if (var17 != null) {
         String var10002;
         Object var19;
         try {
            var10000 = this;
            var19 = var2;
            var10002 = "audio";
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         String var13 = var10002;

         ˁ var18;
         try {
            var18 = var10000.Ϳ(var13, (IInterface)var19);
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         ˁ var14 = var18;
         if (var18 != null) {
            try {
               var17 = var14.ԩ;
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            var2 = var17;
         } else {
            var2 = null;
         }

         if (var2 != null) {
            ˁ var20;
            try {
               var16 = var1;
               var20 = var14;
               var10002 = AudioManager.class.getName();
            } catch (Exception var6) {
               var10001 = false;
               return;
            }

            var13 = var10002;

            try {
               var10002 = "sService";
            } catch (Exception var5) {
               var10001 = false;
               return;
            }

            String var15 = var10002;

            try {
               var19 = var20.ԩ;
            } catch (Exception var4) {
               var10001 = false;
               return;
            }

            var2 = var19;

            try {
               var16.Ϳ(var13, var15, var2);
            } catch (Exception var3) {
               var10001 = false;
            }
         }

      }
   }
}
