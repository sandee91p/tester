package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Ref.IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢤ {
   @NotNull
   public static final ࢤ Ϳ = new ࢤ();
   @Nullable
   public static Timer Ԩ;
   @NotNull
   public static final ޅ<String> ԩ = new ޅ();
   @NotNull
   public static final Handler Ԫ;
   @NotNull
   public static final HashSet<String> ԫ;

   public static final void _/* $FF was: Ϳ*/(String[] var0, IntRef var1, String var2, ActivityInfo var3) {
      ࢢ var10000;
      boolean var10001;
      IntRef var10002;
      Intent var10003;
      String[] var8;
      try {
         var10000 = ࢢ.Ϳ;
         var8 = var0;
         var10002 = var1;
         var10003 = new Intent;
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      Intent var7;
      Intent var10004 = var7 = var10003;

      try {
         var10004.<init>("android.intent.action.BOOT_COMPLETED");
         var10003.setComponent(new ComponentName(var2, var3.name));
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      try {
         var10000.Ԩ(var7, var8[var10002.element]);
      } catch (Exception var4) {
         var10001 = false;
      }

   }

   // $FF: synthetic method
   public static final void _/* $FF was: Ϳ*/(ࢤ var0) {
      var0.Ԩ();
   }

   static {
      HandlerThread var10000 = new HandlerThread("AppServant");
      var10000.start();
      Looper var0 = var10000.getLooper();
      Ԫ = new Handler(var0);
      ԫ = SetsKt.hashSetOf(new String[]{"com.tencent.mm", "com.tencent.mobileqq", "com.tencent.tim", "com.taobao.idlefish"});
   }

   public final void _/* $FF was: Ϳ*/() {
      Timer var1;
      if ((var1 = Ԩ) != null) {
         var1.cancel();
         Ԩ = null;
         ԩ.clear();
      }

   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1) {
      if (ԫ.contains(var1)) {
         ԩ.add(var1);
         if (Ԩ == null) {
            Timer var10000 = Ԩ = new Timer();
            TimerTask var2;
            var2 = new TimerTask() {
               public void run() {
                  ࢤ.Ϳ.Ԩ();
               }
            }.<init>();
            var10000.schedule(var2, 5000L, 20000L);
         }

      }
   }

   public final void _/* $FF was: Ԩ*/() {
      // $FF: Couldn't be decompiled
   }
}
