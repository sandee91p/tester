package lu.die.foza.SleepyFox;

import android.os.IInterface;
import android.os.WorkSource;

public final class ჼ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ࢧ.Ԫ.getClass();
      super.Ϳ = ࢧ.Ԯ();

      Object var10000;
      boolean var10001;
      try {
         var10000 = ࢦ.ֈ().getApplicationContext().getSystemService("wifi");
      } catch (Exception var19) {
         var10001 = false;
         return;
      }

      Object var1 = var10000;
      Object var2 = null;

      String var24;
      try {
         var24 = "fuck";
      } catch (Exception var18) {
         var10001 = false;
         return;
      }

      String var3 = var24;

      label166: {
         try {
            var24 = "mService";
         } catch (Exception var7) {
            var10001 = false;
            break label166;
         }

         var3 = var24;

         try {
            var10000 = ˋ.Ϳ.Ԩ(var1, "mService");
         } catch (Exception var6) {
            var10001 = false;
            break label166;
         }

         var2 = var10000;
      }

      if (var2 == null) {
         label163: {
            String var28;
            try {
               var10000 = var1;
               var28 = "sService";
            } catch (Exception var5) {
               var10001 = false;
               break label163;
            }

            var3 = var28;
            if (var10000 != null) {
               try {
                  ˋ.Ϳ.Ԩ(var1, "sService");
               } catch (Exception var4) {
                  var10001 = false;
               }
            }
         }
      }

      ˁ var20;
      ˁ var26;
      if (var2 == null) {
         var20 = null;
      } else {
         String var10002;
         ჼ var25;
         Object var31;
         try {
            var25 = this;
            var31 = var2;
            var10002 = "wifi";
         } catch (Exception var17) {
            var10001 = false;
            return;
         }

         String var21 = var10002;

         try {
            var26 = var25.Ϳ(var21, (IInterface)var31);
         } catch (Exception var16) {
            var10001 = false;
            return;
         }

         var20 = var26;
      }

      if (var20 != null) {
         if (var1 != null) {
            try {
               ˋ.Ϳ.Ϳ(var1, var3, var20.ԩ);
            } catch (Exception var15) {
               var10001 = false;
               return;
            }
         }

         ࢧ var33;
         try {
            var26 = var20;
            var33 = new ࢧ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  Object[] var10000;
                  boolean var10001;
                  try {
                     var10000 = var1.ԩ;
                  } catch (Exception var5) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  Object[] var2 = var10000;

                  int var6;
                  try {
                     var6 = ރ.Ϳ.Ԩ(var2, WorkSource.class);
                  } catch (Exception var4) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  if (var6 >= 0) {
                     try {
                        var2[0] = null;
                     } catch (Exception var3) {
                        var10001 = false;
                     }
                  }

                  return super.Ϳ(var1);
               }
            };
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         ࢧ var23 = var33;

         String[] var35;
         try {
            var33.<init>();
            var35 = new String[5];
         } catch (Exception var13) {
            var10001 = false;
            return;
         }

         String[] var27 = var35;
         String[] var10003 = var35;
         String[] var10004 = var35;
         String[] var22;
         String[] var10005 = var22 = var35;
         byte var10006 = 0;

         try {
            var10005[var10006] = "acquireWifiLock";
         } catch (Exception var12) {
            var10001 = false;
            return;
         }

         byte var34 = 1;

         try {
            var10004[var34] = "updateWifiLockWorkSource";
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         byte var32 = 2;

         try {
            var10003[var32] = "startLocationRestrictedScan";
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         byte var30 = 3;

         try {
            var27[var30] = "startScan";
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         byte var29 = 4;

         try {
            var35[var29] = "requestBatchedScan";
            var26.Ϳ((ໞ)var23, (String[])var22);
         } catch (Exception var8) {
            var10001 = false;
         }
      }

   }
}
