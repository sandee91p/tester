package lu.die.foza.SleepyFox;

import androidx.annotation.RequiresApi;

public final class ˡ extends lu.die.foza.SleepyFox.Ϳ {
   @RequiresApi(26)
   public void _/* $FF was: Ԫ*/() {
      ˡ var10000;
      boolean var10001;
      ˡ var13;
      try {
         var10000 = this;
         var13 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      ˁ var11;
      try {
         var13.Ϳ = ࢯ.ՠ();
         var11 = var10000.Ϳ("storagestats");
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      ˁ var8 = var11;
      Object var1;
      if (var11 != null) {
         Object var12;
         try {
            var12 = var8.ԩ;
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         var1 = var12;
      } else {
         var1 = null;
      }

      if (var1 != null) {
         String var14;
         try {
            var11 = var8;
            var14 = "queryStatsForPackage";
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         String var9 = var14;

         ࢯ var15;
         try {
            var15 = new ࢯ() {
               public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                  // $FF: Couldn't be decompiled
               }
            };
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         ࢯ var10 = var15;

         try {
            var15.<init>();
            var11.Ϳ((String)var9, (ໞ)var10);
         } catch (Exception var2) {
            var10001 = false;
         }
      }

   }
}
