package lu.die.foza.SleepyFox;

import android.os.IInterface;

public final class ߵ extends lu.die.foza.SleepyFox.Ϳ {
   public boolean _/* $FF was: Ԩ*/() {
      return true;
   }

   public void _/* $FF was: Ԫ*/() {
      Object var10000;
      boolean var10001;
      try {
         super.Ϳ = ˮ.Ԫ;
         var10000 = ࢦ.ֈ().getSystemService("phone");
      } catch (Exception var21) {
         var10001 = false;
         return;
      }

      Object var1 = var10000;
      if (var10000 != null) {
         boolean var27;
         try {
            var27 = ތ.ԭ;
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         if (var27) {
            try {
               var10000 = ˋ.Ϳ.ԩ(var1, "getTelephonyRegistry");
            } catch (Exception var19) {
               var10001 = false;
               return;
            }
         } else {
            try {
               var10000 = ˋ.Ϳ.Ԩ(var1, "sRegistry");
            } catch (Exception var18) {
               var10001 = false;
               return;
            }
         }

         Object var2 = var10000;
         String var10002;
         String var24;
         ˁ var25;
         ߵ var28;
         ˁ var29;
         Object var31;
         if (var2 != null) {
            try {
               var28 = this;
               var31 = var2;
               var10002 = "telephony.registry";
            } catch (Exception var17) {
               var10001 = false;
               return;
            }

            var24 = var10002;

            try {
               var29 = var28.Ϳ(var24, (IInterface)var31);
            } catch (Exception var16) {
               var10001 = false;
               return;
            }

            var25 = var29;
         } else {
            var25 = null;
         }

         Object var3;
         if (var25 != null) {
            try {
               var10000 = var25.ԩ;
            } catch (Exception var15) {
               var10001 = false;
               return;
            }

            var3 = var10000;
         } else {
            var3 = null;
         }

         ˋ var32;
         if (var3 != null) {
            label174: {
               String var10003;
               ˁ var30;
               try {
                  var32 = ˋ.Ϳ;
                  var31 = var1;
                  var30 = var25;
                  var10003 = "sRegistry";
               } catch (Exception var5) {
                  var10001 = false;
                  break label174;
               }

               var24 = var10003;

               try {
                  var32.Ϳ(var31, var24, var30.ԩ);
               } catch (Exception var4) {
                  var10001 = false;
               }
            }
         }

         try {
            var32 = ˋ.Ϳ;
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         ˋ var26 = var32;

         try {
            var10000 = var32.ԩ(var1, "getSubscriberInfo");
         } catch (Exception var13) {
            var10001 = false;
            return;
         }

         var3 = var10000;
         String var22;
         ˁ var23;
         if (var10000 != null) {
            try {
               var28 = this;
               var31 = var3;
               var10002 = "iphonesubinfo";
            } catch (Exception var12) {
               var10001 = false;
               return;
            }

            var22 = var10002;

            try {
               var29 = var28.Ϳ(var22, (IInterface)var31);
            } catch (Exception var11) {
               var10001 = false;
               return;
            }

            var23 = var29;
         } else {
            var23 = null;
         }

         if (var23 != null) {
            try {
               var10000 = var23.ԩ;
            } catch (Exception var10) {
               var10001 = false;
               return;
            }

            var3 = var10000;
         } else {
            var3 = null;
         }

         if (var3 != null) {
            try {
               var27 = ތ.ֈ;
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            if (var27) {
               ˁ var33;
               try {
                  var32 = var26;
                  var33 = var23;
                  var10002 = "sIPhoneSubInfo";
               } catch (Exception var8) {
                  var10001 = false;
                  return;
               }

               var22 = var10002;

               try {
                  var31 = var33.ԩ;
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }

               var2 = var31;

               try {
                  var32.Ϳ(var1, var22, var2);
               } catch (Exception var6) {
                  var10001 = false;
               }
            }
         }

      }
   }
}
