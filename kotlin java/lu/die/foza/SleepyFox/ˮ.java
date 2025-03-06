package lu.die.foza.SleepyFox;

import android.os.IInterface;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ˮ extends lu.die.foza.SleepyFox.Ϳ {
   @NotNull
   public static final ˮ.Ϳ Ԫ = new ˮ.Ϳ();

   public void _/* $FF was: Ԫ*/() {
      Object var10000;
      boolean var10001;
      try {
         super.Ϳ = Ԫ;
         var10000 = ࢦ.ֈ().getSystemService("phone");
      } catch (Exception var33) {
         var10001 = false;
         return;
      }

      Object var1 = var10000;
      if (var10000 != null) {
         ˋ var40;
         try {
            var40 = ˋ.Ϳ;
         } catch (Exception var32) {
            var10001 = false;
            return;
         }

         ˋ var2 = var40;

         try {
            var10000 = var40.ԩ(var1, "getITelephony");
         } catch (Exception var31) {
            var10001 = false;
            return;
         }

         Object var3 = var10000;
         String var10002;
         ˁ var37;
         ˮ var41;
         ˁ var42;
         Object var43;
         if (var10000 == null) {
            var37 = null;
         } else {
            try {
               var41 = this;
               var43 = var3;
               var10002 = "phone";
            } catch (Exception var30) {
               var10001 = false;
               return;
            }

            String var38 = var10002;

            try {
               var42 = var41.Ϳ(var38, (IInterface)var43);
            } catch (Exception var29) {
               var10001 = false;
               return;
            }

            var37 = var42;
         }

         Object var4;
         if (var37 != null) {
            try {
               var10000 = var37.ԩ;
            } catch (Exception var28) {
               var10001 = false;
               return;
            }

            var4 = var10000;
         } else {
            var4 = null;
         }

         boolean var44;
         if (var4 != null) {
            label253: {
               ޜ.Ϳ var46;
               try {
                  var42 = var37;
                  var46 = ޜ.Ϳ;
                  ࢬ.Ϳ.getClass();
               } catch (Exception var24) {
                  var10001 = false;
                  return;
               }

               try {
                  var10002 = ࢬ.Ԭ;
               } catch (Exception var23) {
                  var10001 = false;
                  return;
               }

               String var39 = var10002;

               try {
                  var46.getClass();
               } catch (Exception var22) {
                  var10001 = false;
                  return;
               }

               String[] var45;
               އ var48;
               try {
                  var48 = new އ(var39);
                  var45 = new String[4];
               } catch (Exception var21) {
                  var10001 = false;
                  return;
               }

               String[] var10003 = var45;
               String[] var10004 = var45;
               String[] var10005 = var45;
               String[] var10006 = var45;
               byte var10007 = 0;

               try {
                  var10006[var10007] = "getDeviceIdWithFeature";
               } catch (Exception var20) {
                  var10001 = false;
                  return;
               }

               byte var50 = 1;

               try {
                  var10005[var50] = "getDeviceId";
               } catch (Exception var19) {
                  var10001 = false;
                  return;
               }

               byte var49 = 2;

               try {
                  var10004[var49] = "getMeidForSlot";
               } catch (Exception var18) {
                  var10001 = false;
                  return;
               }

               byte var47 = 3;

               try {
                  var10003[var47] = "getImeiForSlot";
                  var42.Ϳ((ໞ)var48, (String[])var45);
                  var44 = ތ.ށ;
               } catch (Exception var17) {
                  var10001 = false;
                  return;
               }

               if (!var44) {
                  try {
                     var44 = ތ.ހ;
                  } catch (Exception var16) {
                     var10001 = false;
                     return;
                  }

                  if (!var44) {
                     break label253;
                  }

                  try {
                     var44 = ތ.ֈ;
                  } catch (Exception var15) {
                     var10001 = false;
                     return;
                  }

                  if (!var44) {
                     break label253;
                  }
               }

               ˁ var51;
               try {
                  var40 = var2;
                  var51 = var37;
                  var10002 = "sITelephony";
               } catch (Exception var27) {
                  var10001 = false;
                  break label253;
               }

               String var36 = var10002;

               try {
                  var43 = var51.ԩ;
               } catch (Exception var26) {
                  var10001 = false;
                  break label253;
               }

               var3 = var43;

               try {
                  var40.Ϳ(var1, var36, var3);
               } catch (Exception var25) {
                  var10001 = false;
               }
            }
         }

         try {
            var44 = ތ.ހ;
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         if (var44) {
            try {
               var10000 = ˋ.Ϳ.ԩ(var1, "getIOns");
            } catch (Exception var13) {
               var10001 = false;
               return;
            }

            var1 = var10000;
            if (var10000 != null) {
               try {
                  var41 = this;
                  var43 = var1;
                  var10002 = "ions";
               } catch (Exception var12) {
                  var10001 = false;
                  return;
               }

               String var35 = var10002;

               try {
                  var41.Ϳ(var35, (IInterface)var43);
               } catch (Exception var11) {
                  var10001 = false;
                  return;
               }
            }
         }

         try {
            var42 = this.Ϳ("isub");
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         ˁ var34 = var42;
         if (var42 != null) {
            try {
               var44 = ތ.Ԫ;
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            if (var44) {
               try {
                  ࢬ.Ϳ.getClass();
               } catch (Exception var8) {
                  var10001 = false;
                  return;
               }

               try {
                  var10000 = ࢬ.ԭ;
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }

               var1 = var10000;
               if (var10000 != null) {
                  String var52;
                  try {
                     var42 = var34;
                     var52 = "getActiveSubscriptionInfoList";
                     ޜ.Ϳ.getClass();
                  } catch (Exception var6) {
                     var10001 = false;
                     return;
                  }

                  try {
                     var42.Ϳ((String)var52, (ໞ)(new އ(var1)));
                  } catch (Exception var5) {
                     var10001 = false;
                  }
               }
            }
         }

      }
   }

   public static final class Ϳ implements ໞ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @Nullable
      public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
         ࢯ.Ԭ.getClass();
         Object var3;
         Object var10000 = var3 = ࢯ.ՠ().Ϳ(var1);
         ࡡ.Ϳ var2;
         (var2 = ࡡ.Ϳ).getClass();
         ࡡ.Ϳ().getClass();
         if (var10000 instanceof String || var3 instanceof Number) {
            var2.getClass();
            ࡡ var4 = ࡡ.Ϳ();
            var1.Ԩ.getName();
            Objects.toString(var3);
            var4.getClass();
         }

         return var3;
      }
   }
}
