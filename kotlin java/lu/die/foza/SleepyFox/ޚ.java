package lu.die.foza.SleepyFox;

import android.content.ContentResolver;
import android.database.IContentObserver;

public final class ޚ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ޚ var12;
      ޚ var10000;
      boolean var10001;
      try {
         var10000 = this;
         var12 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var8) {
         var10001 = false;
         return;
      }

      ˁ var11;
      try {
         var12.Ϳ = ࢯ.ՠ();
         var11 = var10000.Ϳ("content");
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      ˁ var9 = var11;
      if (var11 != null) {
         ˁ var13;
         ˁ var10002;
         ˋ var10003;
         ˁ var10004;
         String var10005;
         try {
            var11 = var9;
            var13 = var9;
            var10002 = var9;
            var10003 = ˋ.Ϳ;
            var10004 = var9;
            var10005 = ContentResolver.class.getName();
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         String var10 = var10005;

         try {
            var10005 = "sContentService";
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         String var1 = var10005;

         Object var14;
         try {
            var14 = var10004.ԩ;
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         Object var2 = var14;

         try {
            var10003.Ϳ(var10, var1, var2);
            var10002.Ϳ("registerContentObserver", new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                  // $FF: Couldn't be decompiled
               }
            });
            var13.Ϳ("unregisterContentObserver", new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  label32: {
                     Object var10000;
                     boolean var10001;
                     try {
                        var10000 = var1.ԩ[0];
                     } catch (Exception var4) {
                        var10001 = false;
                        break label32;
                     }

                     Object var5 = var10000;

                     boolean var6;
                     try {
                        var6 = var10000 instanceof IContentObserver;
                     } catch (Exception var3) {
                        var10001 = false;
                        break label32;
                     }

                     if (var6) {
                        try {
                           ޢ.Ԩ.Ϳ((IContentObserver)var5);
                        } catch (Exception var2) {
                           var10001 = false;
                        }
                     }
                  }

                  ࢯ.Ԭ.getClass();
                  return ࢯ.ՠ().Ϳ(var1);
               }
            });
            var11.Ϳ("notifyChange", new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                  // $FF: Couldn't be decompiled
               }
            });
         } catch (Exception var3) {
            var10001 = false;
         }
      }

   }
}
