package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.ComponentName;

public final class މ extends lu.die.foza.SleepyFox.Ϳ {
   @SuppressLint({"WrongConstant"})
   public void _/* $FF was: Ԫ*/() {
      މ var10000;
      boolean var10001;
      މ var8;
      try {
         var10000 = this;
         var8 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      ˁ var7;
      try {
         var8.Ϳ = ࢯ.ՠ();
         var7 = var10000.Ϳ("autofill");
      } catch (Exception var3) {
         var10001 = false;
         return;
      }

      ˁ var5 = var7;
      if (var7 != null) {
         ࢯ var10002;
         ˁ var9;
         try {
            var7 = var5;
            var9 = var5;
            var10002 = new ࢯ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  Object[] var2 = var1.ԩ;
                  int var3;
                  Object var4;
                  if ((var3 = ރ.Ϳ.ԩ(var2, ComponentName.class)) != -1 && (var4 = var2[var3]) != null) {
                     var2[var3] = new ComponentName(this.ԫ(), ((ComponentName)var4).getClassName());
                  }

                  return super.Ϳ(var1);
               }
            };
         } catch (Exception var2) {
            var10001 = false;
            return;
         }

         ࢯ var6 = var10002;

         try {
            var10002.<init>();
            var9.Ϳ((String)"startSession", (ໞ)var6);
            var7.Ϳ((String)"updateOrRestartSession", (ໞ)var6);
         } catch (Exception var1) {
            var10001 = false;
         }
      }

   }
}
