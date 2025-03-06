package lu.die.foza.SleepyFox;

import android.app.IServiceConnection;
import android.app.Notification;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ޠ extends Ԩ<ຨ> {
   @NotNull
   public static final ޠ.Ϳ Ԫ = new ޠ.Ϳ();
   @NotNull
   public static final ޠ ԫ = new ޠ();
   public boolean Ԩ = true;
   @NotNull
   public final String ԩ = ࠤ.class.getName();

   public final boolean _/* $FF was: Ϳ*/(String var1, String var2, int var3) {
      try {
         return ((ຨ)this.Ԩ()).Ԫ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return false;
      }
   }

   public final void _/* $FF was: Ϳ*/(String var1, String var2, boolean var3) {
      try {
         ((ຨ)this.Ԩ()).Ϳ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final boolean _/* $FF was: ֈ*/() {
      ຨ var10000;
      boolean var10001;
      ࢦ var6;
      try {
         var10000 = (ຨ)this.Ԩ();
         var6 = ࢦ.Ϳ;
         var6.getClass();
      } catch (Exception var4) {
         var10001 = false;
         return false;
      }

      ൔ var10002;
      try {
         var10002 = ࢦ.Ԭ;
      } catch (Exception var3) {
         var10001 = false;
         return false;
      }

      ൔ var5 = var10002;

      try {
         var6.getClass();
      } catch (Exception var2) {
         var10001 = false;
         return false;
      }

      try {
         var10000.Ϳ((ൔ)var5, (ຓ)ࢭ.ֈ);
         return true;
      } catch (Exception var1) {
         var10001 = false;
         return false;
      }
   }

   @JvmStatic
   @NotNull
   public static final ޠ _/* $FF was: ԭ*/() {
      Ԫ.getClass();
      return ԫ();
   }

   // $FF: synthetic method
   public static final void _/* $FF was: Ϳ*/(ޠ var0, boolean var1) {
      var0.Ԩ = var1;
   }

   @NotNull
   public String _/* $FF was: Ϳ*/() {
      return this.ԩ;
   }

   public void _/* $FF was: Ϳ*/(@NotNull IBinder var1) {
      ޠ var10000 = this;
      IBinder var10002 = var1;
      <undefinedtype> var11 = null.INSTANCE;
      Function0 var2;
      var2 = new Function0<Unit>() {
         public final void invoke() {
            if (ჿ.Ϳ.Ԩ()) {
               ޠ var10000 = ޠ.this;
               var10000.Ԩ = var10000.ֈ();
            }

         }
      }.<init>();
      this.Ϳ(var10002, var11, var2);

      boolean var13;
      boolean var10001;
      try {
         var13 = var10000.Ԩ;
      } catch (Exception var9) {
         var10001 = false;
         return;
      }

      if (!var13) {
         ຨ var14;
         try {
            var14 = (ຨ)super.Ϳ;
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         ຨ var12 = var14;
         if (var14 != null) {
            try {
               var13 = var12.asBinder().isBinderAlive();
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            if (var13) {
               ຨ var15;
               ࢦ var16;
               try {
                  var10000 = this;
                  var15 = var12;
                  var16 = ࢦ.Ϳ;
                  var16.getClass();
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               ൔ var10003;
               try {
                  var10003 = ࢦ.Ԭ;
               } catch (Exception var5) {
                  var10001 = false;
                  return;
               }

               ൔ var10 = var10003;

               try {
                  var16.getClass();
               } catch (Exception var4) {
                  var10001 = false;
                  return;
               }

               try {
                  var15.Ϳ((ൔ)var10, (ຓ)ࢭ.ֈ);
                  var10000.Ԩ = true;
               } catch (Exception var3) {
                  var10001 = false;
               }
            }
         }
      }

   }

   @Nullable
   public final ຘ _/* $FF was: ԯ*/() {
      try {
         return ((ຨ)this.Ԩ()).ԭ();
      } catch (Exception var1) {
         return null;
      }
   }

   public final void _/* $FF was: ԭ*/(@NotNull String var1, @NotNull String var2) {
      try {
         ((ຨ)this.Ԩ()).ԩ(var1, var2);
      } catch (Exception var3) {
      }
   }

   public final void _/* $FF was: ՠ*/() {
      try {
         ((ຨ)this.Ԩ()).ՠ();
      } catch (Exception var1) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   @Nullable
   public final Intent _/* $FF was: Ԩ*/(@Nullable Intent var1, @Nullable String var2) {
      try {
         return ((ຨ)this.Ԩ()).Ԩ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return var1;
      }
   }

   public final void _/* $FF was: ԩ*/(@Nullable Intent var1, @Nullable String var2) {
      try {
         ((ຨ)this.Ԩ()).ԩ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final boolean _/* $FF was: ԩ*/(@Nullable String var1, @Nullable String var2) {
      return this.Ϳ(var1, var2, 0);
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable String var2) {
      return this.Ϳ(var1, var2, 1);
   }

   public final boolean _/* $FF was: Ԩ*/(@Nullable String var1, @Nullable String var2) {
      return this.Ϳ(var1, var2, 2);
   }

   public final void _/* $FF was: Ԭ*/(@Nullable String var1, @Nullable String var2) {
      this.Ϳ(var1, var2, false);
   }

   public final void _/* $FF was: ԫ*/(@Nullable String var1, @Nullable String var2) {
      this.Ϳ(var1, var2, true);
   }

   public final void _/* $FF was: Ԫ*/(@Nullable String var1, @Nullable String var2) {
      try {
         ((ຨ)this.Ԩ()).Ϳ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1) {
      this.Ԫ(var1, (String)null);
   }

   @Nullable
   public final ComponentName _/* $FF was: Ϳ*/(@Nullable Intent var1, @Nullable ServiceInfo var2, @Nullable String var3) {
      try {
         return ((ຨ)this.Ԩ()).Ԩ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   public final int _/* $FF was: Ԩ*/(@Nullable Intent var1, @Nullable ServiceInfo var2, @Nullable String var3) {
      try {
         return ((ຨ)this.Ԩ()).Ϳ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return -1;
      }
   }

   public final int _/* $FF was: Ϳ*/(@Nullable Intent var1, @Nullable ServiceInfo var2, @Nullable IServiceConnection var3, @Nullable String var4) {
      label30: {
         IServiceConnection var10000;
         boolean var10001;
         ຨ var11;
         try {
            var10000 = var3;
            var11 = (ຨ)this.Ԩ();
         } catch (Exception var7) {
            var10001 = false;
            break label30;
         }

         ຨ var8 = var11;
         IBinder var9;
         if (var10000 != null) {
            IBinder var10;
            try {
               var10 = var3.asBinder();
            } catch (Exception var6) {
               var10001 = false;
               break label30;
            }

            var9 = var10;
         } else {
            var9 = null;
         }

         try {
            return var8.Ϳ(var1, var2, var9, var4);
         } catch (Exception var5) {
            var10001 = false;
         }
      }

      ࢺ.Ϳ.Ϳ();
      return -1;
   }

   public final int _/* $FF was: Ϳ*/(@Nullable ProviderInfo var1, @Nullable String var2) {
      try {
         return ((ຨ)this.Ԩ()).Ϳ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return -1;
      }
   }

   public final int _/* $FF was: Ϳ*/(@NotNull IServiceConnection var1) {
      try {
         return ((ຨ)this.Ԩ()).Ϳ(var1.asBinder());
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return -1;
      }
   }

   @Nullable
   public final Intent _/* $FF was: Ϳ*/(@Nullable Intent param1) {
      // $FF: Couldn't be decompiled
   }

   public final int _/* $FF was: Ϳ*/(@NotNull Intent var1, @NotNull String var2) {
      try {
         return ((ຨ)this.Ԩ()).Ϳ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return -1;
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull IntentFilter var1, @NotNull IIntentReceiver var2, @Nullable String var3) {
      label64: {
         String var10000;
         IIntentReceiver var16;
         boolean var10001;
         ຨ var10002;
         try {
            var10000 = var3;
            var16 = var2;
            var10002 = (ຨ)this.Ԩ();
         } catch (Exception var10) {
            var10001 = false;
            break label64;
         }

         ຨ var11 = var10002;

         IBinder var17;
         try {
            var17 = var16.asBinder();
         } catch (Exception var9) {
            var10001 = false;
            break label64;
         }

         IBinder var13;
         boolean var15;
         label53: {
            var13 = var17;
            if (var10000 != null) {
               int var14;
               try {
                  var14 = var3.length();
               } catch (Exception var8) {
                  var10001 = false;
                  break label64;
               }

               if (var14 != 0) {
                  var15 = false;
                  break label53;
               }
            }

            var15 = true;
         }

         if (var15) {
            try {
               var10000 = ࢦ.Ϳ.ԩ();
            } catch (Exception var7) {
               var10001 = false;
               break label64;
            }

            var3 = var10000;
         }

         ຨ var18;
         ࢭ var19;
         try {
            var18 = var11;
            var19 = ࢭ.ֈ;
         } catch (Exception var6) {
            var10001 = false;
            break label64;
         }

         ࢭ var12 = var19;

         try {
            var18.Ϳ((IntentFilter)var1, (IBinder)var13, (String)var3, (ຓ)var12);
            return;
         } catch (Exception var5) {
            var10001 = false;
         }
      }

      ࢺ.Ϳ.Ϳ();
   }

   public final void _/* $FF was: Ϳ*/(@NotNull IIntentReceiver var1) {
      try {
         ((ຨ)this.Ԩ()).ԩ(var1.asBinder());
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: Ԩ*/(@Nullable Intent var1) {
      try {
         ((ຨ)this.Ԩ()).Ԫ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   @Nullable
   public final String _/* $FF was: Ϳ*/(int var1) {
      try {
         return ((ຨ)this.Ԩ()).Ԫ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   public final void _/* $FF was: ԩ*/(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(int param1, int param2, @Nullable Notification param3) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final String _/* $FF was: Ԯ*/() {
      return ࢪ.֏.Ϳ();
   }

   public final void _/* $FF was: Ԩ*/(@Nullable String var1) {
      if (var1 != null) {
         try {
            ࢪ.֏.Ϳ(var1);
         } catch (Exception var2) {
         }
      }

   }

   public final void _/* $FF was: Ԭ*/() {
      try {
         ((ຨ)this.Ԩ()).Ԫ();
      } catch (Exception var1) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   @Nullable
   public final List<RunningAppProcessInfo> _/* $FF was: Ԩ*/(int var1) {
      try {
         return ((ຨ)this.Ԩ()).ԩ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @JvmStatic
      @NotNull
      public final ޠ _/* $FF was: Ϳ*/() {
         return ޠ.ԫ;
      }
   }
}
