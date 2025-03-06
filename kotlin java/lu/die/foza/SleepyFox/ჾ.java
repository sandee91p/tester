package lu.die.foza.SleepyFox;

import android.os.WorkSource;

public final class ჾ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      try {
         super.Ϳ = new ࢯ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               Object[] var10000;
               boolean var10001;
               try {
                  var10000 = var1.ԩ;
               } catch (Exception var6) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               Object[] var2 = var10000;

               int var7;
               try {
                  var7 = ރ.Ϳ.Ԩ(var2, WorkSource.class);
               } catch (Exception var5) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               int var3 = var7;
               if (var7 >= 0) {
                  try {
                     var2[var3] = null;
                  } catch (Exception var4) {
                     var10001 = false;
                  }
               }

               return super.Ϳ(var1);
            }
         };
         this.Ϳ("power");
      } catch (Exception var1) {
      }

   }
}
