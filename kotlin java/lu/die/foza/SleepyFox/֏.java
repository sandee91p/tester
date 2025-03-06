package lu.die.foza.SleepyFox;

import android.os.WorkSource;

public final class ֏ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ֏ var10000;
      boolean var10001;
      ֏ var10;
      try {
         var10000 = this;
         var10 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      ˁ var9;
      try {
         var10.Ϳ = ࢯ.ՠ();
         var9 = var10000.Ϳ("alarm");
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      ˁ var7 = var9;
      if (var9 != null) {
         String var11;
         try {
            var9 = var7;
            var11 = "set";
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         String var8 = var11;

         ࢯ var12;
         try {
            var12 = new ࢯ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  int var2;
                  if ((var2 = ރ.Ϳ.Ԩ(var1.ԩ, WorkSource.class)) >= 0) {
                     var1.ԩ[var2] = null;
                  }

                  return super.Ϳ(var1);
               }
            };
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         ࢯ var1 = var12;

         try {
            var12.<init>();
            var9.Ϳ((String)var8, (ໞ)var1);
         } catch (Exception var2) {
            var10001 = false;
         }
      }

   }
}
