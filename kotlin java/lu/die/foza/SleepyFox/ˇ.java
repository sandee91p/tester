package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ˇ {
   @NotNull
   public static final ˇ Ϳ = new ˇ();
   @Nullable
   public static ˇ.Ϳ Ԩ;

   // $FF: synthetic method
   public static void _/* $FF was: Ϳ*/(ˇ var0, Integer var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = null;
      }

      var0.Ϳ(var1);
   }

   // $FF: synthetic method
   public static void _/* $FF was: Ϳ*/(ˇ var0, ൔ var1, int var2, Notification var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = null;
      }

      var0.Ϳ(var1, var2, var3);
   }

   public static final void _/* $FF was: ԫ*/(ˈ var0) {
      Ϳ.Ϳ(var0);
   }

   public static final void _/* $FF was: Ϳ*/(ˇ.Ϳ var0, ˈ var1) {
      Ϳ.Ԩ(var0, var1);
   }

   public static final void _/* $FF was: Ԩ*/(ˈ var0) {
      if (!ތ.֏) {
         Ϳ.ԩ(var0);
      } else {
         Ϳ.Ԫ(var0);
      }

   }

   public static final void _/* $FF was: Ϳ*/(int var0) {
      Ϳ.Ϳ(var0);
   }

   public static final void _/* $FF was: Ԩ*/(Integer param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static final void _/* $FF was: Ϳ*/(ˇ var0, ˈ var1, IBinder var2) {
      var0.Ϳ(var1, var2);
   }

   // $FF: synthetic method
   public static final void _/* $FF was: Ϳ*/(ˇ var0, IBinder var1, int var2) {
      var0.Ϳ(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ˈ var1) {
      ˇ.Ϳ var10000;
      boolean var10001;
      try {
         var10000 = Ԩ;
      } catch (Exception var8) {
         var10001 = false;
         return;
      }

      ˇ.Ϳ var2 = var10000;

      try {
         Ԩ = null;
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      if (var10000 != null) {
         int var9;
         int var11;
         try {
            var9 = var2.Ϳ;
            var11 = var1.Ϳ;
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         if (var9 == var11) {
            boolean var10;
            try {
               var10 = var2.Ԩ.asBinder().isBinderAlive();
            } catch (Exception var5) {
               var10001 = false;
               return;
            }

            if (var10) {
               try {
                  ࢦ.Ϳ.Ԩ(ˇ::Ϳ);
                  Ϳ(this, (Integer)null, 1, (Object)null);
                  return;
               } catch (Exception var3) {
                  var10001 = false;
                  return;
               }
            }
         }
      }

      try {
         ࢦ.Ϳ.Ԩ(ˇ::Ԩ);
      } catch (Exception var4) {
         var10001 = false;
      }

   }

   public final void _/* $FF was: Ϳ*/(@Nullable Integer var1) {
      ࢦ.Ϳ.Ԩ(ˇ::Ԩ);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ൔ var1, int var2, @Nullable Notification var3) {
      ൔ var10001 = var1;
      String var13 = "lu.die.foza.SleepyFox.FozaStubProcessGroup$Companion$FozaStubProcess";

      boolean var17;
      int var18;
      try {
         var18 = var10001.ԩ();
      } catch (Exception var12) {
         var17 = false;
         return;
      }

      int var15 = var18;

      ComponentName var10002;
      Intent var19;
      ComponentName var10003;
      try {
         var19 = new Intent();
         var10002 = new ComponentName;
         var10003 = var10002;
         ࢦ.Ϳ.getClass();
      } catch (Exception var11) {
         var17 = false;
         return;
      }

      String var10004;
      StringBuilder var10005;
      try {
         var10004 = ࢦ.Ԯ;
         var10005 = new StringBuilder;
      } catch (Exception var10) {
         var17 = false;
         return;
      }

      StringBuilder var10006 = var10005;

      try {
         var10006.<init>(var13);
         var10003.<init>(var10004, var10005.append(var15).toString());
         var19 = var19.setComponent(var10002).putExtra("foza_key_start_foreground", true).putExtra("key_launching_type", var2);
      } catch (Exception var9) {
         var17 = false;
         return;
      }

      Intent var14 = var19;
      if (var3 != null) {
         try {
            var14.putExtra("foza_key_store_notification", var3);
         } catch (Exception var8) {
            var17 = false;
            return;
         }
      }

      label57: {
         boolean var10000;
         try {
            var10000 = ތ.Ԭ;
         } catch (Exception var7) {
            var17 = false;
            break label57;
         }

         if (var10000) {
            try {
               ࢺ.Ԫ().startForegroundService(var14);
               return;
            } catch (Exception var5) {
               var17 = false;
            }
         } else {
            try {
               ࢺ.Ԫ().startService(var14);
               return;
            } catch (Exception var6) {
               var17 = false;
            }
         }
      }

      try {
         Unit var16 = Unit.INSTANCE;
      } catch (Exception var4) {
         var17 = false;
      }

   }

   public final boolean _/* $FF was: Ԩ*/(int var1, final Function1<? super IBinder, Unit> var2) {
      String var7 = "lu.die.foza.SleepyFox.FozaStubProcessGroup$Companion$FozaStubProcess";

      Context var10000;
      boolean var10001;
      ComponentName var10002;
      ComponentName var10003;
      Intent var8;
      try {
         var10000 = ࢦ.ֈ();
         var8 = new Intent();
         var10002 = new ComponentName;
         var10003 = var10002;
         ࢦ.Ϳ.getClass();
      } catch (Exception var6) {
         var10001 = false;
         return false;
      }

      String var10004;
      StringBuilder var10005;
      try {
         var10004 = ࢦ.Ԯ;
         var10005 = new StringBuilder;
      } catch (Exception var5) {
         var10001 = false;
         return false;
      }

      StringBuilder var10006 = var10005;

      try {
         var10006.<init>(var7);
         var10003.<init>(var10004, var10005.append(var1).toString());
         var8 = var8.setComponent(var10002);
         ࠚ.Ϳ.getClass();
      } catch (Exception var4) {
         var10001 = false;
         return false;
      }

      try {
         return var10000.bindService(var8.putExtras(ࠚ.Ԩ), new ServiceConnection() {
            public final AtomicBoolean ԭ;

            public {
               <undefinedtype> var10000 = this;
               AtomicBoolean var2x;
               var10000.ԭ = var2x;
            }

            public static final void _/* $FF was: Ϳ*/(Function1 var0, IBinder var1) {
               var0.invoke(var1);
            }

            public void onServiceConnected(ComponentName var1, IBinder var2x) {
               if (!this.ԭ.getAndSet(true)) {
                  ࢦ.Ϳ.Ԩ(<undefinedtype>::Ϳ);
               }
            }

            public void onServiceDisconnected(ComponentName var1) {
            }
         }, 1);
      } catch (Exception var3) {
         var10001 = false;
         return false;
      }
   }

   public final boolean _/* $FF was: Ϳ*/(int var1, Function1<? super IBinder, Unit> var2) {
      String var12 = "content://";

      ࢦ var10000;
      boolean var10001;
      try {
         var10000 = ࢦ.Ϳ;
      } catch (Exception var11) {
         var10001 = false;
         return false;
      }

      ࢦ var3 = var10000;

      try {
         var10000.getClass();
      } catch (Exception var10) {
         var10001 = false;
         return false;
      }

      ContentResolver var15;
      StringBuilder var18;
      try {
         var15 = ࢺ.Ԫ().getContentResolver();
         var18 = new StringBuilder;
      } catch (Exception var9) {
         var10001 = false;
         return false;
      }

      StringBuilder var10002 = var18;

      try {
         var10002.<init>(var12);
         var3.getClass();
      } catch (Exception var8) {
         var10001 = false;
         return false;
      }

      String var19;
      String var10003;
      Uri var20;
      try {
         var20 = Uri.parse(var18.append(ࢦ.Ԯ).append(".stub.provider.dang").append(var1).toString());
         var19 = "do_init_process_via_provider";
         var10003 = "arg";
         ࠚ.Ϳ.getClass();
      } catch (Exception var7) {
         var10001 = false;
         return false;
      }

      Bundle var16;
      try {
         var16 = var15.call(var20, var19, var10003, ࠚ.Ԩ);
      } catch (Exception var6) {
         var10001 = false;
         return false;
      }

      Bundle var13 = var16;
      IBinder var14;
      if (var16 != null) {
         IBinder var17;
         try {
            var17 = var13.getBinder("foza_key_remote_dispatcher");
         } catch (Exception var5) {
            var10001 = false;
            return false;
         }

         var14 = var17;
      } else {
         var14 = null;
      }

      if (var14 != null) {
         try {
            var2.invoke(var14);
         } catch (Exception var4) {
            var10001 = false;
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public final void _/* $FF was: Ϳ*/(ˈ var1, IBinder var2) {
      label90: {
         ຓ var10000;
         boolean var10001;
         try {
            var10000 = ຓ.Ԩ.Ԫ(var2);
         } catch (Exception var13) {
            var10001 = false;
            break label90;
         }

         ຓ var16 = var10000;
         int var19 = 1558605841;

         int var17;
         try {
            var17 = var10000.Ϳ(var19, (Bundle)null);
         } catch (Exception var12) {
            var10001 = false;
            break label90;
         }

         boolean var3;
         if (var17 == 1) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            try {
               var16.Ԯ();
               ࢦ.Ϳ.Ԩ(ˇ::ԫ);
               return;
            } catch (Exception var4) {
               var10001 = false;
            }
         } else {
            label91: {
               ˇ var18;
               ࢢ var20;
               try {
                  var18 = this;
                  var20 = ࢢ.Ϳ;
               } catch (Exception var11) {
                  var10001 = false;
                  break label91;
               }

               ຓ var10002 = var16;
               ຓ var10003 = var16;
               int var10004 = -1479747291;

               Bundle var10005;
               try {
                  var10005 = new Bundle;
               } catch (Exception var10) {
                  var10001 = false;
                  break label91;
               }

               Bundle var10006 = var10005;
               Bundle var10007 = var10005;
               Bundle var10008 = var10005;
               Bundle var10009 = var10005;

               ˈ var23;
               String var25;
               try {
                  Bundle var10010 = var10009;
                  var23 = var1;
                  var10010.<init>();
                  var25 = "foza_key_int_pid";
               } catch (Exception var9) {
                  var10001 = false;
                  break label91;
               }

               String var14 = var25;

               String var22;
               ࣅ var24;
               try {
                  var10008.putInt(var14, var23.Ϳ);
                  var22 = "key_launching_type";
                  var24 = ࣅ.Ϳ;
               } catch (Exception var8) {
                  var10001 = false;
                  break label91;
               }

               ࣅ var15 = var24;

               try {
                  var24.getClass();
               } catch (Exception var7) {
                  var10001 = false;
                  break label91;
               }

               try {
                  var10007.putBoolean(var22, ࣅ.ԭ);
                  var10006.putByteArray("foza_key_component_info", ႁ.Ϳ.Ϳ(new Function2<Parcel, Integer, Unit>(var15.Ϳ()) {
                     public final void invoke(Parcel var1, int var2) {
                        ((ࣄ)super.receiver).writeToParcel(var1, var2);
                     }
                  }));
                  Unit var21 = Unit.INSTANCE;
               } catch (Exception var6) {
                  var10001 = false;
                  break label91;
               }

               try {
                  var20.Ϳ(var10002, var10003.Ϳ(var10004, var10005), var1);
                  Ϳ(var18, (Integer)null, 1, (Object)null);
                  return;
               } catch (Exception var5) {
                  var10001 = false;
               }
            }
         }
      }

      ࢢ.Ϳ.Ԩ(var1);
   }

   public final void _/* $FF was: Ԩ*/(ˇ.Ϳ param1, ˈ param2) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(IBinder var1, int var2) {
      ຓ var10000;
      boolean var10001;
      try {
         var10000 = ຓ.Ԩ.Ԫ(var1);
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      ຓ var12 = var10000;
      int var17 = 1558605841;

      int var15;
      try {
         var15 = var10000.Ϳ(var17, (Bundle)null);
      } catch (Exception var10) {
         var10001 = false;
         return;
      }

      if (var15 == 1) {
         boolean var16;
         try {
            var16 = ࢢ.Ϳ.ԩ(var2);
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         if (var16) {
            return;
         }

         try {
            var12.Ԯ();
            ࢦ.Ϳ.Ԩ(ˇ::Ϳ);
         } catch (Exception var3) {
            var10001 = false;
         }
      } else {
         var10000 = var12;
         var17 = -1479747291;

         Bundle var10002;
         Bundle var10003;
         Bundle var10004;
         String var10005;
         ࣅ var10006;
         try {
            var10002 = new Bundle;
            var10003 = var10002;
            var10004 = var10002;
            var10002.<init>();
            var10002.putInt("foza_key_int_pid", var2);
            var10005 = "key_launching_type";
            var10006 = ࣅ.Ϳ;
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         ࣅ var13 = var10006;

         try {
            var10006.getClass();
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         try {
            var10004.putBoolean(var10005, ࣅ.ԭ);
            var10003.putByteArray("foza_key_component_info", ႁ.Ϳ.Ϳ(new Function2<Parcel, Integer, Unit>(var13.Ϳ()) {
               public final void invoke(Parcel var1, int var2) {
                  ((ࣄ)super.receiver).writeToParcel(var1, var2);
               }
            }));
            Unit var18 = Unit.INSTANCE;
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         try {
            var15 = var10000.Ϳ(var17, var10002);
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         int var14 = var15;

         try {
            Ԩ = new ˇ.Ϳ(var2, var12, var14);
         } catch (Exception var5) {
            var10001 = false;
         }
      }

   }

   public final void _/* $FF was: ԩ*/(final ˈ var1) {
      if (!this.Ϳ(var1.Ϳ, new Function1<IBinder, Unit>() {
         public final void invoke(IBinder var1x) {
            ˇ.Ϳ.Ϳ(var1, var1x);
         }
      })) {
         ࢢ.Ϳ.Ԩ(var1);
      }

   }

   public final void _/* $FF was: Ԫ*/(final ˈ var1) {
      if (!this.Ԩ(var1.Ϳ, new Function1<IBinder, Unit>() {
         public final void invoke(IBinder var1x) {
            ˇ.Ϳ.Ϳ(var1, var1x);
         }
      })) {
         ࢢ.Ϳ.Ԩ(var1);
      }

   }

   public static final class Ϳ {
      public final int Ϳ;
      @NotNull
      public final ຓ Ԩ;
      public final int ԩ;

      public _/* $FF was: Ϳ*/(int var1, @NotNull ຓ var2, int var3) {
         this.Ϳ = var1;
         this.Ԩ = var2;
         this.ԩ = var3;
      }

      public final int _/* $FF was: Ԩ*/() {
         return this.Ϳ;
      }

      @NotNull
      public final ຓ _/* $FF was: Ϳ*/() {
         return this.Ԩ;
      }

      public final int _/* $FF was: ԩ*/() {
         return this.ԩ;
      }
   }
}
