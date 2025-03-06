package lu.die.foza.SleepyFox;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¨\u0006\u000f"},
   d2 = {"Llu/die/foza/SleepyFox/FozaStubProcessGroup;", "Landroid/app/Service;", "<init>", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "enrollStopForeground", "", "onStartCommand", "", "flags", "startId", "Companion", "foza_release"}
)
@SourceDebugExtension({"SMAP\nFozaStubProcessGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaStubProcessGroup.kt\nlu/die/foza/SleepyFox/FozaStubProcessGroup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class FozaStubProcessGroup extends Service {
   @NotNull
   public static final FozaStubProcessGroup.Companion Ϳ = new FozaStubProcessGroup.Companion();
   @Nullable
   public static Object Ԩ;
   @Nullable
   public static FozaStubProcessGroup ԩ;

   // $FF: synthetic method
   public static final void _/* $FF was: Ϳ*/(FozaStubProcessGroup var0) {
      ԩ = var0;
   }

   // $FF: synthetic method
   public static final void _/* $FF was: Ϳ*/(Object var0) {
      Ԩ = var0;
   }

   @Nullable
   public IBinder onBind(@Nullable Intent var1) {
      Bundle var2;
      if (var1 != null && (var2 = var1.getExtras()) != null) {
         ࢺ.Ϳ.Ϳ(var2);
      }

      ࢭ var10000 = ࢭ.ֈ;
      var10000.getClass();
      return var10000;
   }

   public final void _/* $FF was: ԩ*/() {
      // $FF: Couldn't be decompiled
   }

   public int onStartCommand(@Nullable Intent var1, int var2, int var3) {
      return Ϳ.Ϳ(var1, this);
   }

   public static final class Companion {
      public Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker var1) {
         this();
      }

      public final int _/* $FF was: Ϳ*/(@Nullable Intent param1, @NotNull Service param2) {
         // $FF: Couldn't be decompiled
      }

      @Nullable
      public final FozaStubProcessGroup _/* $FF was: Ϳ*/() {
         return FozaStubProcessGroup.ԩ;
      }

      @RequiresApi(26)
      public final void _/* $FF was: Ϳ*/(Context var1) {
         Object var10000;
         boolean var10001;
         try {
            var10000 = FozaStubProcessGroup.Ԩ;
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         Object var9 = var10000;

         boolean var11;
         try {
            var11 = var10000 instanceof NotificationManager;
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         if (!var11) {
            try {
               var10000 = var1.getSystemService(NotificationManager.class);
            } catch (Exception var6) {
               var10001 = false;
               return;
            }

            var9 = var10000;

            try {
               FozaStubProcessGroup.Ԩ = var10000;
            } catch (Exception var5) {
               var10001 = false;
               return;
            }
         }

         if (var9 != null) {
            NotificationChannel var12;
            try {
               var12 = ((NotificationManager)var9).getNotificationChannel("foza_channel");
            } catch (Exception var4) {
               var10001 = false;
               return;
            }

            if (var12 == null) {
               NotificationChannel var13;
               try {
                  var10000 = var9;
                  var13 = new NotificationChannel;
               } catch (Exception var3) {
                  var10001 = false;
                  return;
               }

               NotificationChannel var10;
               NotificationChannel var10002 = var10 = var13;

               try {
                  var10002.<init>("foza_channel", "foza_channel", 2);
                  var13.setDescription("Only for foza default - typedef.cn");
                  ((NotificationManager)var10000).createNotificationChannel(var10);
               } catch (Exception var2) {
                  var10001 = false;
               }
            }
         }

      }

      @Metadata(
         mv = {2, 0, 0},
         k = 1,
         xi = 50,
         d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"},
         d2 = {"Llu/die/foza/SleepyFox/FozaStubProcessGroup$Companion$FozaVpnService;", "Landroid/net/VpnService;", "<init>", "()V", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "foza_release"}
      )
      public static final class FozaVpnService extends VpnService {
         public static final void _/* $FF was: Ϳ*/(FozaStubProcessGroup.Companion.FozaVpnService var0) {
            var0.stopForeground(1);
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
         }

         public int onStartCommand(@Nullable Intent var1, int var2, int var3) {
            boolean var10001;
            try {
               ࡡ.Ϳ.getClass();
            } catch (Exception var8) {
               var10001 = false;
               return FozaStubProcessGroup.Ϳ.Ϳ((new Intent(var1)).putExtra("foza_key_start_foreground", true), this);
            }

            try {
               ࡡ.Ϳ().getClass();
            } catch (Exception var7) {
               var10001 = false;
               return FozaStubProcessGroup.Ϳ.Ϳ((new Intent(var1)).putExtra("foza_key_start_foreground", true), this);
            }

            boolean var10000;
            try {
               var10000 = ތ.ԫ;
            } catch (Exception var6) {
               var10001 = false;
               return FozaStubProcessGroup.Ϳ.Ϳ((new Intent(var1)).putExtra("foza_key_start_foreground", true), this);
            }

            if (var10000) {
               try {
                  ࢭ.ֈ.getClass();
               } catch (Exception var5) {
                  var10001 = false;
                  return FozaStubProcessGroup.Ϳ.Ϳ((new Intent(var1)).putExtra("foza_key_start_foreground", true), this);
               }

               try {
                  ࢭ.ؠ.postDelayed(FozaStubProcessGroup.Companion.FozaVpnService::Ϳ, 3000L);
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return FozaStubProcessGroup.Ϳ.Ϳ((new Intent(var1)).putExtra("foza_key_start_foreground", true), this);
         }
      }
   }
}
