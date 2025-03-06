package lu.die.foza.SleepyFox;

import android.app.SyncNotedAppOp;
import kotlin.jvm.internal.Intrinsics;

public final class ؠ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ؠ var10000;
      boolean var10001;
      ؠ var9;
      try {
         var10000 = this;
         var9 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      ˁ var8;
      try {
         var9.Ϳ = ࢯ.ՠ();
         var8 = var10000.Ϳ("appops");
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      ˁ var6 = var8;
      if (var8 != null) {
         ޜ.Ϳ var10002;
         Integer var10003;
         String var10;
         try {
            var8 = var6;
            var6.Ϳ("checkOperation", new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  label34: {
                     boolean var10000;
                     boolean var10001;
                     try {
                        var10000 = ތ.ؠ;
                     } catch (Exception var4) {
                        var10001 = false;
                        break label34;
                     }

                     if (var10000) {
                        label36: {
                           try {
                              var10000 = Intrinsics.areEqual(var1.ԩ[0], 92);
                           } catch (Exception var3) {
                              var10001 = false;
                              break label36;
                           }

                           if (var10000) {
                              try {
                                 return 0;
                              } catch (Exception var2) {
                                 var10001 = false;
                              }
                           }
                        }
                     }
                  }

                  ࢯ.Ԭ.getClass();
                  return ࢯ.ՠ().Ϳ(var1);
               }
            });
            var6.Ϳ("noteProxyOperation", new ໞ() {
               public final ૹ<Integer> Ϳ;

               public {
                  <undefinedtype> var10000 = this;
                  ૹ var1;
                  var10000.Ϳ = var1;
               }

               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  ࢯ.Ԭ.getClass();
                  Object var5 = ࢯ.ՠ().Ϳ(var1);

                  boolean var10000;
                  boolean var10001;
                  try {
                     var10000 = ތ.ؠ;
                  } catch (Exception var4) {
                     var10001 = false;
                     return var5;
                  }

                  if (var10000) {
                     try {
                        var10000 = var5 instanceof SyncNotedAppOp;
                     } catch (Exception var3) {
                        var10001 = false;
                        return var5;
                     }

                     if (var10000) {
                        try {
                           this.Ϳ.Ϳ(var5, (int)0);
                        } catch (Exception var2) {
                           var10001 = false;
                        }
                     }
                  }

                  return var5;
               }
            });
            var10 = "checkPackage";
            var10002 = ޜ.Ϳ;
            var10003 = 0;
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         Integer var7 = var10003;

         try {
            var10002.getClass();
         } catch (Exception var2) {
            var10001 = false;
            return;
         }

         try {
            var8.Ϳ((String)var10, (ໞ)(new އ(var7)));
         } catch (Exception var1) {
            var10001 = false;
         }
      }

   }
}
