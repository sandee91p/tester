package lu.die.foza.SleepyFox;

import android.app.ActivityThread.ApplicationThread;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.BroadcastReceiver.PendingResult;
import android.content.IIntentReceiver.Stub;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDiscoveryLocalReceiverEnhancer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryLocalReceiverEnhancer.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalReceiverEnhancer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,175:1\n13309#2,2:176\n*S KotlinDebug\n*F\n+ 1 DiscoveryLocalReceiverEnhancer.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalReceiverEnhancer\n*L\n126#1:176,2\n*E\n"})
public final class ߾ {
   @NotNull
   public static final ߾ Ϳ = new ߾();
   @NotNull
   public static final ބ<String, ActivityInfo> Ԩ = new ބ();
   @NotNull
   public static final ބ<String, WeakReference<BroadcastReceiver>> ԩ = new ބ();
   @NotNull
   public static final ૹ<PendingResult> Ԫ;
   @Nullable
   public static final Object ԫ;

   public static final void _/* $FF was: Ԩ*/(String var0, Intent var1) {
      ࢦ var10000;
      boolean var10001;
      try {
         var10000 = ࢦ.Ϳ;
      } catch (Throwable var59) {
         var10001 = false;
         return;
      }

      ࢦ var2 = var10000;

      String var62;
      try {
         var62 = var10000.ԩ();
      } catch (Throwable var58) {
         var10001 = false;
         return;
      }

      String var3 = var62;
      if (var62 != null) {
         BroadcastReceiver var63;
         try {
            var63 = Ϳ.Ϳ(var0);
         } catch (Throwable var57) {
            var10001 = false;
            return;
         }

         BroadcastReceiver var60 = var63;
         if (var63 != null) {
            Intent var64;
            ࢦ var10002;
            String var10003;
            try {
               var63 = var60;
               var64 = var1;
               var10002 = var2;
               var10003 = var3;
               var2.getClass();
            } catch (Throwable var56) {
               var10001 = false;
               return;
            }

            Context var10004;
            try {
               var10004 = ࢭ.ֈ.֏(var3);
            } catch (Throwable var55) {
               var10001 = false;
               return;
            }

            Context var61 = var10004;

            Context var66;
            try {
               var64.setExtrasClassLoader(var10002.Ԩ(var10003));
               var66 = var61;
               Unit var65 = Unit.INSTANCE;
            } catch (Throwable var54) {
               var10001 = false;
               return;
            }

            try {
               var63.onReceive(var66, var1);
            } catch (Throwable var53) {
               var10001 = false;
               return;
            }
         }

      }
   }

   static {
      ૹ var0;
      ૹ var10000 = var0 = new ૹ;
      var10000.<init>("mPendingResult");

      try {
         var10000.Ϳ(BroadcastReceiver.class);
      } catch (Exception var13) {
      }

      Ԫ = var0;

      Object var15;
      label80: {
         label89: {
            Constructor var16;
            boolean var10001;
            try {
               var16 = PendingResult.class.getDeclaredConstructors()[0];
            } catch (Exception var12) {
               var10001 = false;
               break label89;
            }

            Constructor var14;
            Constructor var19 = var14 = var16;

            Class[] var17;
            try {
               var19.setAccessible(true);
               var17 = var16.getParameterTypes();
            } catch (Exception var11) {
               var10001 = false;
               break label89;
            }

            Class[] var1 = var17;
            int var2 = 0;

            int var18;
            try {
               var18 = var17.length;
            } catch (Exception var10) {
               var10001 = false;
               break label89;
            }

            int var3 = var18;

            Object[] var20;
            try {
               var20 = new Object[var18];
            } catch (Exception var9) {
               var10001 = false;
               break label89;
            }

            Object[] var4;
            for(var4 = var20; var2 < var3; ++var2) {
               try {
                  var4[var2] = ࢯ.Ԭ.Ϳ(var1[var2]);
               } catch (Exception var8) {
                  var10001 = false;
                  break label89;
               }
            }

            Object var21;
            try {
               var21 = var14.newInstance(Arrays.copyOf(var4, var3));
            } catch (Exception var7) {
               var10001 = false;
               break label89;
            }

            var15 = var21;

            try {
               var10000 = new ૹ;
            } catch (Exception var6) {
               var10001 = false;
               break label89;
            }

            ૹ var22 = var10000;

            try {
               var22.<init>("mInitialStickyHint");
               var10000.Ϳ(var15, Boolean.TRUE);
               break label80;
            } catch (Exception var5) {
               var10001 = false;
            }
         }

         var15 = null;
      }

      ԫ = var15;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull IBinder var1, @NotNull Intent var2) {
      boolean var10001;
      try {
         ࢭ.ֈ.getClass();
      } catch (Throwable var79) {
         var10001 = false;
         return;
      }

      ApplicationThread var10000;
      IIntentReceiver var83;
      try {
         var10000 = ࢭ.ׯ.getApplicationThread();
         var83 = Stub.asInterface(var1);
      } catch (Throwable var78) {
         var10001 = false;
         return;
      }

      Intent var10002 = var2;
      byte var80 = -1;
      Object var10003 = null;

      Bundle var10004;
      try {
         var10004 = Bundle.EMPTY;
      } catch (Throwable var77) {
         var10001 = false;
         return;
      }

      Bundle var81 = var10004;
      boolean var82 = false;
      boolean var3 = false;
      boolean var4 = true;

      ࢦ var84;
      try {
         var84 = ࢦ.Ϳ;
         var84.getClass();
      } catch (Throwable var76) {
         var10001 = false;
         return;
      }

      int var10005;
      try {
         var10005 = ࢦ.ԯ;
      } catch (Throwable var75) {
         var10001 = false;
         return;
      }

      int var5 = var10005;
      byte var6 = -1;

      try {
         var84.getClass();
      } catch (Throwable var74) {
         var10001 = false;
         return;
      }

      String var85;
      try {
         var85 = "android";
      } catch (Throwable var73) {
         var10001 = false;
         return;
      }

      String var7 = var85;

      try {
         var10000.scheduleRegisteredReceiver(var83, var10002, var80, (String)var10003, var81, var82, var3, var4, var5, var6, var5, var7);
      } catch (Throwable var72) {
         var10001 = false;
         return;
      }

   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @Nullable Intent var2) {
      if (var2 != null) {
         boolean var10001;
         try {
            ࢭ.ֈ.getClass();
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         try {
            ࢭ.ؠ.post(߾::Ԩ);
         } catch (Exception var3) {
            var10001 = false;
         }

      }
   }

   public final void _/* $FF was: Ϳ*/() {
      // $FF: Couldn't be decompiled
   }

   public final BroadcastReceiver _/* $FF was: Ϳ*/(String var1) {
      ބ var10000;
      boolean var10001;
      try {
         var10000 = ԩ;
      } catch (Exception var14) {
         var10001 = false;
         return null;
      }

      ބ var15 = var10000;

      WeakReference var19;
      try {
         var19 = (WeakReference)var10000.get(var1);
      } catch (Exception var13) {
         var10001 = false;
         return null;
      }

      WeakReference var2 = var19;
      BroadcastReceiver var17;
      BroadcastReceiver var20;
      if (var19 != null) {
         try {
            var20 = (BroadcastReceiver)var2.get();
         } catch (Exception var12) {
            var10001 = false;
            return null;
         }

         var17 = var20;
         if (var20 != null) {
            return var17;
         }
      }

      ActivityInfo var21;
      try {
         var21 = (ActivityInfo)Ԩ.get(var1);
      } catch (Exception var11) {
         var10001 = false;
         return null;
      }

      ActivityInfo var18 = var21;
      if (var21 == null) {
         return null;
      } else {
         ࢦ var22;
         try {
            var22 = ࢦ.Ϳ;
         } catch (Exception var10) {
            var10001 = false;
            return null;
         }

         ࢦ var3 = var22;

         String var23;
         try {
            var23 = var22.ԩ();
         } catch (Exception var9) {
            var10001 = false;
            return null;
         }

         String var4 = var23;
         if (var23 == null) {
            return null;
         } else {
            try {
               Object var24 = var3.Ԩ(var4).loadClass(var18.name).getDeclaredConstructor().newInstance();
               Intrinsics.checkNotNull(var24, "null cannot be cast to non-null type android.content.BroadcastReceiver");
               var20 = (BroadcastReceiver)var24;
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }

            var17 = var20;

            try {
               Ԫ.Ϳ(var17, ԫ);
            } catch (Exception var5) {
            }

            WeakReference var10002;
            ބ var25;
            try {
               var20 = var17;
               var25 = var15;
               var10002 = new WeakReference;
            } catch (Exception var7) {
               var10001 = false;
               return null;
            }

            WeakReference var16 = var10002;

            try {
               var10002.<init>(var17);
               var25.put(var1, var16);
            } catch (Exception var6) {
               var10001 = false;
               return null;
            }

            return var20;
         }
      }
   }
}
