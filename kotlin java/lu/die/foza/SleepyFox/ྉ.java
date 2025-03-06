package lu.die.foza.SleepyFox;

import android.os.IInterface;
import android.view.inputmethod.EditorInfo;

public final class ྉ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      boolean var10000;
      boolean var10001;
      try {
         super.Ϳ = new ޜ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               EditorInfo var2;
               if ((var2 = (EditorInfo)ރ.Ϳ.Ϳ(var1.ԩ, EditorInfo.class)) != null) {
                  var2.packageName = this.ԫ();
               }

               return var1.Ԫ();
            }
         };
         var10000 = ތ.ރ;
      } catch (Exception var18) {
         var10001 = false;
         return;
      }

      Object var22;
      ˋ var24;
      Object var25;
      ˁ var26;
      if (var10000) {
         try {
            var24 = ˋ.Ϳ;
         } catch (Exception var17) {
            var10001 = false;
            return;
         }

         ˋ var1 = var24;

         try {
            var25 = var24.Ϳ("android.view.inputmethod.IInputMethodManagerGlobalInvoker", "getService");
         } catch (Exception var16) {
            var10001 = false;
            return;
         }

         if (var25 != null) {
            try {
               var26 = this.Ϳ("input_method");
            } catch (Exception var15) {
               var10001 = false;
               return;
            }

            ˁ var2 = var26;
            if (var26 != null) {
               try {
                  var25 = var2.ԩ;
               } catch (Exception var14) {
                  var10001 = false;
                  return;
               }

               var22 = var25;
            } else {
               var22 = null;
            }

            if (var22 != null) {
               try {
                  var1.Ϳ("android.view.inputmethod.IInputMethodManagerGlobalInvoker", "sServiceCache", var22);
                  return;
               } catch (Exception var4) {
                  var10001 = false;
                  return;
               }
            }
         }
      }

      try {
         var25 = ࢦ.ֈ().getSystemService("input_method");
      } catch (Exception var13) {
         var10001 = false;
         return;
      }

      Object var21 = var25;
      if (var25 != null) {
         try {
            var24 = ˋ.Ϳ;
         } catch (Exception var12) {
            var10001 = false;
            return;
         }

         ˋ var23 = var24;

         try {
            var25 = var24.Ԩ(var21, "mService");
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         Object var3 = var25;
         if (var25 != null) {
            String var10002;
            ྉ var27;
            Object var28;
            try {
               var27 = this;
               var28 = var3;
               var10002 = "input_method";
            } catch (Exception var10) {
               var10001 = false;
               return;
            }

            String var19 = var10002;

            try {
               var26 = var27.Ϳ(var19, (IInterface)var28);
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            ˁ var20 = var26;
            if (var26 != null) {
               try {
                  var25 = var20.ԩ;
               } catch (Exception var8) {
                  var10001 = false;
                  return;
               }

               var3 = var25;
            } else {
               var3 = null;
            }

            if (var3 != null) {
               ˁ var29;
               try {
                  var24 = var23;
                  var29 = var20;
                  var10002 = "mService";
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }

               var19 = var10002;

               try {
                  var28 = var29.ԩ;
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               var22 = var28;

               try {
                  var24.Ϳ(var21, var19, var22);
               } catch (Exception var5) {
                  var10001 = false;
               }
            }

         }
      }
   }
}
