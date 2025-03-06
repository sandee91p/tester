package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.app.Application;
import android.app.IServiceConnection;
import android.app.Instrumentation;
import android.app.LoadedApk;
import android.app.IServiceConnection.Stub;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢭ extends ຓ.Ԩ {
   @NotNull
   public static final ࢭ ֈ = new ࢭ();
   public static int ֏;
   @NotNull
   public static final ActivityThread ׯ;
   @NotNull
   public static final Handler ؠ;
   @NotNull
   public static final Object ހ;
   @NotNull
   public static final ಀ<Application> ށ;
   @NotNull
   public static final Function0<Unit> ނ;
   @NotNull
   public static final ʹ<Context> ރ;

   // $FF: synthetic method
   public static Application _/* $FF was: Ϳ*/(ࢭ var0, Object var1, Instrumentation var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      return var0.Ϳ(var1, var2);
   }

   public static final void _/* $FF was: Ԩ*/(Bundle var0) {
      Bundle var10000 = var0;
      ՙ var1 = ՙ.Ϳ;
      boolean var2 = var10000.getBoolean("key_launching_type");
      var1.getClass();
      ՙ.Ԩ = var2;
      ࢺ.Ϳ.Ԭ();
      ࢿ.Ϳ.Ϳ();
      ޱ.Ϳ.getClass();
      ޱ.Ԫ.clear();
      ߿.Ϳ.Ԩ();
      ࢦ.Ϳ.ބ();
   }

   public static final void _/* $FF was: Ϳ*/(ࣄ var0) {
      ൎ var10000 = ൎ.Ϳ;
      var10000.Ϳ(var0);
      var10000.Ϳ();
      ࢦ.ޅ();
   }

   public static final void _/* $FF was: Ϳ*/(Function0 var0) {
      var0.invoke();
   }

   public static final void _/* $FF was: ԩ*/(ൔ var0) {
      ֈ.Ԩ(var0);
   }

   public static final void ؠ() {
      System.exit(0);
      throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
   }

   static {
      ActivityThread var0;
      ׯ = var0 = ActivityThread.currentActivityThread();

      Handler var7;
      Object var12;
      boolean var10001;
      label54: {
         Handler var11;
         label53: {
            label52: {
               boolean var10000;
               try {
                  var10000 = ތ.ށ;
               } catch (Exception var6) {
                  var10001 = false;
                  break label52;
               }

               if (var10000) {
                  try {
                     var11 = var0.getHandler();
                     break label53;
                  } catch (Exception var4) {
                     var10001 = false;
                  }
               } else {
                  try {
                     var12 = ˋ.Ϳ.Ԩ((Object)var0, "mH");
                     Intrinsics.checkNotNull(var12);
                     var11 = (Handler)var12;
                     break label53;
                  } catch (Exception var5) {
                     var10001 = false;
                  }
               }
            }

            var7 = new Handler.<init>(Looper.getMainLooper());
            break label54;
         }

         var7 = var11;
      }

      ؠ = var7;

      Object var8;
      label40: {
         Exception var13;
         label58: {
            try {
               var12 = ˋ.Ϳ.Ԩ((Object)ׯ, "mBoundApplication");
            } catch (Exception var3) {
               var13 = var3;
               var10001 = false;
               break label58;
            }

            var8 = var12;

            try {
               Intrinsics.checkNotNull(var12);
               break label40;
            } catch (Exception var2) {
               var13 = var2;
               var10001 = false;
            }
         }

         var8 = var13;
      }

      ހ = var8;
      ಀ var9 = new ಀ;
      String var1;
      if (ތ.ނ) {
         var1 = "makeApplicationInner";
      } else {
         var1 = "makeApplication";
      }

      ಀ var15 = var9;
      ಀ var14 = var9;
      Class[] var10;
      Class[] var10003 = var10 = new Class[2];
      var10003[0] = Boolean.TYPE;
      var10003[1] = Instrumentation.class;
      var14.<init>(var1, var10);
      ށ = var15.Ϳ(LoadedApk.class);
      ނ = null.INSTANCE;
      ރ = new ʹ(1);
   }

   @NotNull
   public final ActivityThread ֏() {
      return ׯ;
   }

   @NotNull
   public final Object _/* $FF was: ֈ*/() {
      return ހ;
   }

   @NotNull
   public final Handler _/* $FF was: ׯ*/() {
      return ؠ;
   }

   @Nullable
   public final Application _/* $FF was: Ϳ*/(@NotNull Object param1, @Nullable Instrumentation param2) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final Context ֏(@NotNull String var1) {
      Context var2;
      ʹ var3;
      if ((var2 = (Context)ʹ.Ϳ(var3 = ރ, var1.hashCode(), (Object)null, 2, (Object)null)) == null) {
         var2 = ࢦ.ֈ().createPackageContext(var1, 3);
         var3.Ԩ(var1.hashCode(), var2);
      }

      return var2;
   }

   @NotNull
   public final ClassLoader _/* $FF was: ׯ*/(@NotNull String var1) {
      return this.֏(var1).getClassLoader();
   }

   public void _/* $FF was: Ϳ*/(@NotNull ൔ var1) {
      ࢦ.Ϳ.Ϳ(var1);
      ؠ.post(ࢭ::ԩ);
   }

   public void _/* $FF was: Ԯ*/() {
      ؠ.post(ࢭ::ؠ);
   }

   @Nullable
   public Intent _/* $FF was: ԩ*/(@Nullable Intent var1) {
      boolean var10001;
      if (var1 != null) {
         try {
            var1.setExtrasClassLoader(ActivityThread.currentApplication().getClassLoader());
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }
      } else {
         var1 = null;
      }

      try {
         return ྌ.ԩ(var1);
      } catch (Exception var2) {
         var10001 = false;
         return null;
      }
   }

   public int _/* $FF was: Ϳ*/(int var1, @Nullable Bundle var2) {
      Bundle var10000;
      boolean var10001;
      if (var2 == null) {
         try {
            var10000 = Bundle.EMPTY;
         } catch (Exception var28) {
            var10001 = false;
            return -1;
         }

         var2 = var10000;
      }

      int var31;
      label311: {
         label312: {
            int var39;
            if (var1 == -1479747291) {
               try {
                  this.Ϳ(var2);
                  ၡ.Ϳ.getClass();
               } catch (Exception var18) {
                  var10001 = false;
                  return -1;
               }

               try {
                  var39 = ၡ.ԩ;
               } catch (Exception var17) {
                  var10001 = false;
                  return -1;
               }
            } else {
               Parcelable var10002;
               Bundle var42;
               if (var1 == 1518714126) {
                  String var44;
                  ߾ var50;
                  try {
                     var50 = ߾.Ϳ;
                     var42 = var2;
                     var44 = var2.getString("key_launching_type");
                  } catch (Exception var27) {
                     var10001 = false;
                     return -1;
                  }

                  String var37 = var44;

                  try {
                     Intrinsics.checkNotNull(var44);
                     var10002 = var42.getParcelable("foza_key_intent");
                     Intrinsics.checkNotNull(var10002);
                     var50.Ϳ(var37, (Intent)var10002);
                     break label311;
                  } catch (Exception var26) {
                     var10001 = false;
                     return -1;
                  }
               }

               if (var1 == -1383862804) {
                  try {
                     FozaStubProcessGroup.Ϳ.getClass();
                  } catch (Exception var25) {
                     var10001 = false;
                     return -1;
                  }

                  FozaStubProcessGroup var49;
                  try {
                     var49 = FozaStubProcessGroup.Ԩ();
                  } catch (Exception var24) {
                     var10001 = false;
                     return -1;
                  }

                  FozaStubProcessGroup var36 = var49;
                  if (var49 != null) {
                     try {
                        var36.ԩ();
                     } catch (Exception var23) {
                        var10001 = false;
                        return -1;
                     }
                  }
                  break label311;
               }

               if (var1 == 1558605841) {
                  boolean var48;
                  try {
                     var48 = ࢦ.Ϳ.ރ();
                  } catch (Exception var22) {
                     var10001 = false;
                     return -1;
                  }

                  if (!var48) {
                     break label311;
                  }
                  break label312;
               }

               Intent var29;
               ServiceInfo var38;
               Intent var41;
               if (var1 == 1984153269) {
                  ߿ var47;
                  try {
                     var47 = ߿.Ϳ;
                     var42 = var2;
                     var10002 = var2.getParcelable("key_launching_intent");
                     Intrinsics.checkNotNull(var10002);
                     var41 = (Intent)var10002;
                  } catch (Exception var5) {
                     var10001 = false;
                     return -1;
                  }

                  var29 = var41;
                  boolean var35 = true;

                  ServiceInfo var53;
                  try {
                     var53 = (ServiceInfo)var42.getParcelable("foza_key_service_info");
                  } catch (Exception var4) {
                     var10001 = false;
                     return -1;
                  }

                  var38 = var53;

                  try {
                     var47.Ϳ(var29, var35, var38);
                     break label312;
                  } catch (Exception var3) {
                     var10001 = false;
                     return -1;
                  }
               }

               if (var1 == -987494927) {
                  try {
                     ޱ.Ϳ.Ԫ();
                     ࢦ.Ϳ.getClass();
                  } catch (Exception var16) {
                     var10001 = false;
                     return -1;
                  }

                  try {
                     var39 = ࢦ.Ԩ;
                  } catch (Exception var15) {
                     var10001 = false;
                     return -1;
                  }
               } else {
                  ServiceInfo var40;
                  if (var1 == 1626959230) {
                     try {
                        var10000 = var2;
                        var42 = var2;
                        var10002 = var2.getParcelable("key_launching_intent");
                        Intrinsics.checkNotNull(var10002);
                        var41 = (Intent)var10002;
                     } catch (Exception var14) {
                        var10001 = false;
                        return -1;
                     }

                     var29 = var41;

                     IServiceConnection var46;
                     try {
                        IBinder var45 = var42.getBinder("foza_key_service_conn");
                        Intrinsics.checkNotNull(var45);
                        var46 = Stub.asInterface(var45);
                     } catch (Exception var13) {
                        var10001 = false;
                        return -1;
                     }

                     IServiceConnection var32 = var46;

                     try {
                        var40 = (ServiceInfo)var10000.getParcelable("foza_key_service_info");
                     } catch (Exception var12) {
                        var10001 = false;
                        return -1;
                     }

                     var38 = var40;

                     try {
                        var39 = ߿.Ϳ.Ϳ(var29, (Object)var32, (ServiceInfo)var38);
                     } catch (Exception var11) {
                        var10001 = false;
                        return -1;
                     }
                  } else {
                     Intent var52;
                     if (var1 == 35172636) {
                        try {
                           var10000 = var2;
                           Parcelable var51 = var2.getParcelable("key_launching_intent");
                           Intrinsics.checkNotNull(var51);
                           var52 = (Intent)var51;
                        } catch (Exception var10) {
                           var10001 = false;
                           return -1;
                        }

                        var29 = var52;

                        try {
                           var40 = (ServiceInfo)var10000.getParcelable("foza_key_service_info");
                        } catch (Exception var9) {
                           var10001 = false;
                           return -1;
                        }

                        ServiceInfo var33 = var40;

                        try {
                           var39 = ߿.Ϳ.Ϳ(var29, var33);
                        } catch (Exception var8) {
                           var10001 = false;
                           return -1;
                        }
                     } else {
                        IBinder var30;
                        IBinder var43;
                        if (var1 != 1218203648) {
                           if (var1 != -478256555) {
                              var31 = -1;
                              return var31;
                           }

                           try {
                              var43 = var2.getBinder("key_launching_type");
                           } catch (Exception var21) {
                              var10001 = false;
                              return -1;
                           }

                           var30 = var43;

                           try {
                              var52 = (Intent)var2.getParcelable("foza_key_intent");
                           } catch (Exception var20) {
                              var10001 = false;
                              return -1;
                           }

                           Intent var34 = var52;
                           if (var43 != null && var34 != null) {
                              try {
                                 ߾.Ϳ.Ϳ(var30, var34);
                              } catch (Exception var19) {
                                 var10001 = false;
                                 return -1;
                              }
                           }
                           break label311;
                        }

                        try {
                           var43 = var2.getBinder("foza_key_service_conn");
                        } catch (Exception var7) {
                           var10001 = false;
                           return -1;
                        }

                        var30 = var43;

                        try {
                           Intrinsics.checkNotNull(var43);
                           var39 = ߿.Ϳ.Ϳ((IInterface)Stub.asInterface(var30));
                        } catch (Exception var6) {
                           var10001 = false;
                           return -1;
                        }
                     }
                  }
               }
            }

            var31 = var39;
            return var31;
         }

         var31 = 1;
         return var31;
      }

      var31 = 0;
      return var31;
   }

   public final void _/* $FF was: Ϳ*/(Bundle var1) {
      if (֏ == 0) {
         ֏ = var1.getInt("foza_key_int_pid", 0);
         byte[] var2;
         if ((var2 = var1.getByteArray("foza_key_component_info")) == null) {
            return;
         }

         ႁ var10000 = ႁ.Ϳ;
         byte[] var10001 = var2;
         Function1 var3;
         var3 = new Function1<Parcel, ࣄ>() {
            public final ࣄ invoke(Parcel var1) {
               return (ࣄ)((Creator)super.receiver).createFromParcel(var1);
            }
         }.<init>(ࣄ.CREATOR);
         ࣄ var4;
         if ((var4 = (ࣄ)var10000.Ϳ(var10001, var3)) == null) {
            return;
         }

         ࢦ.Ϳ.Ϳ(ࢭ::Ԩ);
         ؠ.post(ࢭ::Ϳ);
      }

   }

   public final void _/* $FF was: Ԩ*/(ൔ param1) {
      // $FF: Couldn't be decompiled
   }
}
