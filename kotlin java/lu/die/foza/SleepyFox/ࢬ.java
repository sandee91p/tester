package lu.die.foza.SleepyFox;

import android.telephony.SubscriptionInfo;
import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢬ {
   @NotNull
   public static final ࢬ Ϳ = new ࢬ();
   public static final int Ԩ = 16;
   @NotNull
   public static final SecureRandom ԩ = new SecureRandom();
   @NotNull
   public static final String Ԫ;
   @NotNull
   public static final String[] ԫ;
   @NotNull
   public static final String Ԭ;
   @Nullable
   public static final Object ԭ;

   static {
      String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      StringBuffer var1;
      var1 = new StringBuffer.<init>();
      byte var2 = 36;

      for(int var3 = 0; var3 < 16; ++var3) {
         var1.append(var0.charAt(ԩ.nextInt(var2)));
      }

      Ԫ = var1.toString();
      String[] var25;
      String[] var10000 = var25 = new String[8];
      var10000[0] = "35133133";
      var10000[1] = "86576905";
      var10000[2] = "86811305";
      var10000[3] = "86610306";
      var10000[4] = "35619596";
      var10000[5] = "86415006";
      var10000[6] = "86992006";
      var10000[7] = "86669706";
      ԫ = var10000;
      ࢬ var27 = Ϳ;
      var0 = var10000[ԩ.nextInt(var25.length)];
      StringBuffer var31;
      var31 = new StringBuffer.<init>(var0);

      for(int var26 = 0; var26 < 6; ++var26) {
         var31.append(ԩ.nextInt(10));
      }

      var31.append(var27.Ϳ(var31.toString()));
      Ԭ = var31.toString();

      ArrayList var33;
      label214: {
         label215: {
            boolean var10001;
            boolean var41;
            try {
               var41 = ތ.Ԫ;
            } catch (Exception var24) {
               var10001 = false;
               break label215;
            }

            if (var41) {
               label216: {
                  Constructor[] var42;
                  try {
                     var42 = SubscriptionInfo.class.getConstructors();
                  } catch (Exception var23) {
                     var10001 = false;
                     break label216;
                  }

                  Constructor var28 = null;

                  Iterator var43;
                  try {
                     var43 = ArrayIteratorKt.iterator(var42);
                  } catch (Exception var22) {
                     var10001 = false;
                     break label216;
                  }

                  Iterator var29 = var43;

                  label177:
                  while(true) {
                     try {
                        var41 = var29.hasNext();
                     } catch (Exception var18) {
                        var10001 = false;
                        break;
                     }

                     Constructor var44;
                     int var45;
                     if (!var41) {
                        if (var28 != null) {
                           var44 = var28;
                           int var30 = 0;

                           try {
                              var45 = var44.getParameterTypes().length;
                           } catch (Exception var17) {
                              var10001 = false;
                              break;
                           }

                           int var36 = var45;

                           Object[] var49;
                           try {
                              var49 = new Object[var45];
                           } catch (Exception var16) {
                              var10001 = false;
                              break;
                           }

                           Object[] var39;
                           for(var39 = var49; var30 < var36; ++var30) {
                              try {
                                 var39[var30] = null;
                              } catch (Exception var15) {
                                 var10001 = false;
                                 break label177;
                              }
                           }

                           Class[] var50;
                           try {
                              var50 = var28.getParameterTypes();
                           } catch (Exception var14) {
                              var10001 = false;
                              break;
                           }

                           Class[] var35 = var50;
                           int var4 = 0;

                           try {
                              var45 = var50.length;
                           } catch (Exception var13) {
                              var10001 = false;
                              break;
                           }

                           for(int var5 = var45; var4 < var5; ++var4) {
                              try {
                                 var39[var4] = ࢯ.Ԭ.Ϳ(var35[var4]);
                              } catch (Exception var12) {
                                 var10001 = false;
                                 break label177;
                              }
                           }

                           int var10002;
                           SubscriptionInfo[] var10003;
                           Object[] var56;
                           try {
                              var44 = var28;
                              var56 = var39;
                              var10002 = var36;
                              var10003 = new SubscriptionInfo[1];
                           } catch (Exception var11) {
                              var10001 = false;
                              break;
                           }

                           SubscriptionInfo[] var32 = var10003;
                           byte var37 = 0;

                           SubscriptionInfo var52;
                           try {
                              Object var51 = var44.newInstance(Arrays.copyOf(var56, var10002));
                              Intrinsics.checkNotNull(var51, "null cannot be cast to non-null type android.telephony.SubscriptionInfo");
                              var52 = (SubscriptionInfo)var51;
                           } catch (Exception var10) {
                              var10001 = false;
                              break;
                           }

                           SubscriptionInfo var38 = var52;

                           label213: {
                              ˋ var53;
                              try {
                                 var53 = ˋ.Ϳ;
                              } catch (Exception var7) {
                                 var10001 = false;
                                 break label213;
                              }

                              ˋ var40 = var53;

                              try {
                                 var40.Ϳ((Object)var38, (String)"mDisplayName", (Object)"62V.NET");
                                 var40.Ϳ((Object)var38, (String)"mIccId", (Object)Ԫ);
                                 var40.Ϳ((Object)var38, (String)"mCarrierName", (Object)"62V.NET");
                                 var53.Ϳ((Object)var38, (String)"mNumber", (Object)String.valueOf(System.currentTimeMillis()));
                              } catch (Exception var6) {
                                 var10001 = false;
                              }
                           }

                           SubscriptionInfo[] var54;
                           SubscriptionInfo[] var57;
                           try {
                              var54 = var32;
                              var57 = var32;
                              Unit var46 = Unit.INSTANCE;
                           } catch (Exception var9) {
                              var10001 = false;
                              break;
                           }

                           ArrayList var55;
                           try {
                              var57[var37] = var38;
                              var55 = CollectionsKt.arrayListOf(var54);
                           } catch (Exception var8) {
                              var10001 = false;
                              break;
                           }

                           var33 = var55;
                           break label214;
                        }
                        break;
                     }

                     Constructor var47;
                     try {
                        var44 = var28;
                        var47 = (Constructor)var29.next();
                     } catch (Exception var21) {
                        var10001 = false;
                        break;
                     }

                     Constructor var34 = var47;
                     if (var44 != null) {
                        int var48;
                        try {
                           var45 = var28.getParameterTypes().length;
                           var48 = var34.getParameterTypes().length;
                        } catch (Exception var20) {
                           var10001 = false;
                           break;
                        }

                        if (var45 <= var48) {
                           continue;
                        }

                        try {
                           var45 = var34.getParameterTypes().length;
                        } catch (Exception var19) {
                           var10001 = false;
                           break;
                        }

                        if (var45 == 1) {
                           continue;
                        }
                     }

                     var28 = var34;
                  }
               }
            }
         }

         var33 = null;
      }

      ԭ = var33;
   }

   @NotNull
   public final String _/* $FF was: ԩ*/() {
      return Ԫ;
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/() {
      return Ԭ;
   }

   @Nullable
   public final Object _/* $FF was: Ԫ*/() {
      return ԭ;
   }

   @NotNull
   public final String _/* $FF was: Ԩ*/() {
      StringBuilder var3;
      var3 = new StringBuilder.<init>();

      for(int var1 = 0; var1 < 6; ++var1) {
         if (var3.length() > 0) {
            var3.append(":");
         }

         String var2;
         if ((var2 = Integer.toHexString(ԩ.nextInt(256))).length() < 2) {
            var3.append(0);
         }

         var3.append(var2);
      }

      return var3.toString();
   }

   public final char _/* $FF was: Ϳ*/(String var1) {
      int var5 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var5 < 14; ++var5) {
         if (var5 % 2 == 0) {
            var2 = var1.charAt(var5) + var2 - 48;
         } else {
            int var4;
            if ((var4 = (var1.charAt(var5) - 48) * 2) < 10) {
               var3 += var4;
            } else {
               var3 = var3 + 1 + var4 - 10;
            }
         }
      }

      return (var5 = (var2 + var3) % 10) == 0 ? '0' : (char)(10 - var5 + 48);
   }
}
