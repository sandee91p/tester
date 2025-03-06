package lu.die.foza.SleepyFox;

import androidx.annotation.RequiresApi;

public final class ޛ extends lu.die.foza.SleepyFox.Ϳ {
   @RequiresApi(28)
   public void _/* $FF was: Ԫ*/() {
      ޛ var10000;
      boolean var10001;
      ޛ var12;
      try {
         var10000 = this;
         var12 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      ˁ var9;
      try {
         var12.Ϳ = ࢯ.ՠ();
         var9 = var10000.Ϳ("crossprofileapps");
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      ˁ var8 = var9;
      Object var1;
      if (var9 != null) {
         Object var10;
         try {
            var10 = var8.ԩ;
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         var1 = var10;
      } else {
         var1 = null;
      }

      if (var1 != null) {
         boolean var11;
         try {
            var8.Ϳ("startActivityAsUser", new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                  // $FF: Couldn't be decompiled
               }
            });
            var11 = ތ.ؠ;
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         if (var11) {
            String var13;
            try {
               var9 = var8;
               var13 = "startActivityAsUserByIntent";
               ׯ.ԯ.getClass();
            } catch (Exception var3) {
               var10001 = false;
               return;
            }

            try {
               var9.Ϳ((String)var13, (ໞ)ׯ.ֈ());
            } catch (Exception var2) {
               var10001 = false;
            }
         }
      }

   }
}
