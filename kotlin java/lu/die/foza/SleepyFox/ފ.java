package lu.die.foza.SleepyFox;

import android.bluetooth.BluetoothAdapter;
import android.os.IInterface;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class ފ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ފ var10000;
      boolean var10001;
      try {
         var10000 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var13) {
         var10001 = false;
         return;
      }

      BluetoothAdapter var18;
      try {
         var10000.Ϳ = ࢯ.ՠ();
         var18 = BluetoothAdapter.getDefaultAdapter();
      } catch (Exception var12) {
         var10001 = false;
         return;
      }

      BluetoothAdapter var1 = var18;
      if (var18 != null) {
         ૹ var19;
         try {
            var19 = new ૹ;
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         ૹ var2 = var19;

         IInterface var20;
         try {
            var2.<init>("mManagerService");
            var20 = (IInterface)var19.ԩ(var1);
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         IInterface var3 = var20;
         if (var20 != null) {
            ˁ var21;
            try {
               var2.Ϳ(var1, (Object)null);
               var21 = this.Ϳ("bluetooth_manager", var3);
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            ˁ var14 = var21;
            if (var21 != null) {
               String var10002;
               ˁ var23;
               try {
                  var21 = var14;
                  var23 = var14;
                  var2.Ϳ(var1, var14.ԩ);
                  var10002 = "registerAdapter";
               } catch (Exception var8) {
                  var10001 = false;
                  return;
               }

               String var15 = var10002;

               ޜ var22;
               try {
                  var22 = new ޜ() {
                     public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                        Object var2 = var1.Ԫ();
                        ৼ var10000 = ৼ.Ϳ;
                        ࢯ.Ԭ.getClass();
                        Object var3;
                        if ((var3 = var10000.Ԩ(var2, ࢯ.ՠ())) != null) {
                           var2 = var3;
                        }

                        return var2;
                     }
                  };
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }

               ޜ var16 = var22;

               String var24;
               try {
                  var22.<init>();
                  var23.Ϳ((String)var15, (ໞ)var16);
                  var24 = "getAddress";
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               var15 = var24;

               ໞ var25;
               try {
                  var25 = new ໞ() {
                     public final String Ϳ;

                     public {
                        String var10001 = ࢬ.Ϳ.Ԩ().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
                        this.Ϳ = var10001;
                     }

                     public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                        // $FF: Couldn't be decompiled
                     }
                  };
               } catch (Exception var5) {
                  var10001 = false;
                  return;
               }

               ໞ var17 = var25;

               try {
                  var25.<init>();
                  var21.Ϳ(var15, var17);
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

         }
      }
   }
}
