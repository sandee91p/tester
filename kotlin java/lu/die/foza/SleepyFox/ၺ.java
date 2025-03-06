package lu.die.foza.SleepyFox;

import android.app.NotificationChannel;
import androidx.annotation.RequiresApi;
import java.util.List;

public final class ၺ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(ˁ var1) {
      ࢯ var2;
      var2 = new ࢯ() {
         public final int ԯ;

         public {
            byte var1;
            if (ތ.ހ) {
               var1 = 3;
            } else {
               var1 = 1;
            }

            this.ԯ = var1;
         }

         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            label47: {
               Object[] var10000;
               boolean var10001;
               try {
                  var10000 = var1.ԩ;
               } catch (Exception var7) {
                  var10001 = false;
                  break label47;
               }

               Object[] var2 = var10000;

               int var9;
               int var10;
               try {
                  var9 = var10000.length;
                  var10 = this.ԯ;
               } catch (Exception var6) {
                  var10001 = false;
                  break label47;
               }

               int var3 = var10;
               if (var9 > var10) {
                  label49: {
                     try {
                        var10000 = var2;
                        var10 = var3;
                        ޥ.ԭ.getClass();
                     } catch (Exception var5) {
                        var10001 = false;
                        break label49;
                     }

                     try {
                        var10000[var10] = ޥ.Ϳ().Ϳ(String.valueOf(var2[this.ԯ]));
                     } catch (Exception var4) {
                        var10001 = false;
                     }
                  }
               }
            }

            Object var8 = super.Ϳ(var1);
            if (ތ.Ԭ && var8 instanceof NotificationChannel) {
               ޥ.ԭ.getClass();
               ޥ.Ϳ().Ϳ((NotificationChannel)var8);
            }

            return var8;
         }
      }.<init>();
      var1.Ϳ((String)"getNotificationChannel", (ໞ)var2);
      var2 = new ࢯ() {
         @RequiresApi(26)
         public Object _/* $FF was: Ϳ*/(ࡥ param1) {
            // $FF: Couldn't be decompiled
         }

         @RequiresApi(26)
         public final Object _/* $FF was: Ԩ*/(ࡥ var1) {
            Object[] var3;
            if ((var3 = var1.ԩ).length > 1) {
               Object var4;
               if ((var4 = var3[1]) == null) {
                  return null;
               } else {
                  List var2;
                  ႎ var6;
                  if (!((var2 = (var6 = ႎ.Ϳ).Ϳ(var4)) instanceof List)) {
                     var2 = null;
                  }

                  Object var10001 = var4;
                  ޥ.ԭ.getClass();
                  List var5 = ޥ.Ϳ().Ԩ(var2);
                  return var6.Ϳ(var10001.getClass()) ? var6.Ϳ(var5) : var5;
               }
            } else {
               return null;
            }
         }
      }.<init>();
      var1.Ϳ((String)"createNotificationChannels", (ໞ)var2);
      var2 = new ࢯ() {
         @RequiresApi(26)
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            Object var11 = super.Ϳ(var1);

            ႎ var10000;
            boolean var10001;
            try {
               var10000 = ႎ.Ϳ;
            } catch (Exception var10) {
               var10001 = false;
               return var11;
            }

            ႎ var2 = var10000;

            List var13;
            try {
               var13 = var10000.Ϳ(var11);
            } catch (Exception var9) {
               var10001 = false;
               return var11;
            }

            List var3 = var13;

            boolean var14;
            try {
               var14 = var13 instanceof List;
            } catch (Exception var8) {
               var10001 = false;
               return var11;
            }

            if (!var14) {
               var3 = null;
            }

            ࡥ var15;
            try {
               var10000 = var2;
               var15 = var1;
               ޥ.ԭ.getClass();
            } catch (Exception var7) {
               var10001 = false;
               return var11;
            }

            List var10002;
            try {
               var10002 = ޥ.Ϳ().Ϳ(var3);
            } catch (Exception var6) {
               var10001 = false;
               return var11;
            }

            List var12 = var10002;

            try {
               var14 = var10000.Ϳ(var15.Ԩ.getReturnType());
            } catch (Exception var5) {
               var10001 = false;
               return var11;
            }

            if (!var14) {
               return var12;
            } else {
               try {
                  return var2.Ϳ(var12);
               } catch (Exception var4) {
                  var10001 = false;
                  return var11;
               }
            }
         }
      }.<init>();
      var1.Ϳ((String)"getNotificationChannels", (ໞ)var2);
      var2 = new ࢯ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            Object[] var10000;
            boolean var10001;
            try {
               var10000 = var1.ԩ;
            } catch (Exception var7) {
               var10001 = false;
               return super.Ϳ(var1);
            }

            Object[] var2 = var10000;

            Object var8;
            try {
               var8 = var10000[1];
            } catch (Exception var6) {
               var10001 = false;
               return super.Ϳ(var1);
            }

            Object var3 = var8;
            if (var8 != null) {
               var10000 = var2;
               byte var9 = 1;

               try {
                  ޥ.ԭ.getClass();
               } catch (Exception var5) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               try {
                  var10000[var9] = ޥ.Ϳ().Ϳ(var3.toString());
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return super.Ϳ(var1);
         }
      }.<init>();
      var1.Ϳ((String)"deleteNotificationChannel", (ໞ)var2);
   }
}
