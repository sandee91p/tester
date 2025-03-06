package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࠤ extends ຨ.Ԩ {
   @NotNull
   public static final ࠤ ސ = new ࠤ();

   @Nullable
   public Intent _/* $FF was: Ԩ*/(@Nullable Intent var1, @Nullable String var2) {
      ࢢ var3 = ࢢ.Ϳ;
      if (var1 == null) {
         return null;
      } else {
         if (var2 == null) {
            var2 = ࢪ.֏.Ϳ();
         }

         return var3.ԩ(var1, var2);
      }
   }

   @NotNull
   public ຘ _/* $FF was: ԭ*/() {
      return ࣂ.ؠ;
   }

   public void _/* $FF was: ԩ*/(@NotNull String var1, @NotNull String var2) {
      ࢢ.Ϳ.Ԫ(var1, var2);
   }

   public int _/* $FF was: Ϳ*/(@Nullable ProviderInfo var1, @Nullable String var2) {
      if (var1 != null && var2 != null) {
         try {
            return ࢢ.Ϳ.Ϳ(var1, var2);
         } catch (Exception var3) {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @Nullable
   public ComponentName _/* $FF was: Ԩ*/(@Nullable Intent var1, @Nullable ServiceInfo var2, @Nullable String var3) {
      if (var2 != null && var3 != null) {
         ˈ var10000;
         boolean var10001;
         try {
            var10000 = ࢢ.Ϳ(ࢢ.Ϳ, var1, var2, var3, false, 8, (Object)null);
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         if (var10000 != null) {
            ServiceInfo var10002;
            String var10003;
            ComponentName var8;
            ComponentName var9;
            try {
               var8 = new ComponentName;
               var9 = var8;
               var10002 = var2;
               var10003 = var2.packageName;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            String var7 = var10003;

            try {
               var9.<init>(var7, var10002.name);
               return var8;
            } catch (Exception var4) {
               var10001 = false;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public int _/* $FF was: Ϳ*/(@Nullable Intent var1, @Nullable ServiceInfo var2, @Nullable String var3) {
      return var1 != null && var2 != null && var3 != null ? ࢢ.Ϳ.Ϳ(var1, var2, var3) : -1;
   }

   public int _/* $FF was: Ϳ*/(@Nullable Intent var1, @Nullable ServiceInfo var2, @Nullable IBinder var3, @Nullable String var4) {
      if (var2 != null && var4 != null) {
         try {
            return ࢢ.Ϳ.Ϳ(var1, var2, var3, var4);
         } catch (Exception var5) {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public int _/* $FF was: Ϳ*/(@Nullable IBinder var1) {
      return var1 == null ? -1 : ࢢ.Ϳ.Ϳ(var1);
   }

   public void _/* $FF was: ԩ*/(@Nullable Intent var1, @Nullable String var2) {
      ࢢ var3 = ࢢ.Ϳ;
      if (var1 != null) {
         if (var2 == null) {
            var2 = ࢪ.֏.Ϳ();
         }

         var3.Ϳ(var1, var2);
      }
   }

   public void _/* $FF was: ՠ*/() {
      ࢢ.Ϳ.Ԫ();
   }

   public void _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable String var2) {
      ࢢ.Ϳ.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable String var2, boolean var3) {
      if (var1 != null && var2 != null) {
         ࢢ.Ϳ(ࢢ.Ϳ, var1, var2, var3, (ActivityInfo)null, (ˈ)null, 24, (Object)null);
      }
   }

   public boolean _/* $FF was: Ԫ*/(@Nullable String var1, @Nullable String var2, int var3) {
      return var1 != null && var2 != null ? ࢢ.Ϳ.Ϳ(var1, var2, var3) : false;
   }

   @Nullable
   public Intent _/* $FF was: Ϳ*/(@Nullable Intent var1, int var2) {
      ࢢ var3 = ࢢ.Ϳ;
      return var1 == null ? null : var3.Ϳ(var1, var2);
   }

   public int _/* $FF was: Ϳ*/(@Nullable Intent var1, @Nullable String var2) {
      return ࢢ.Ϳ.Ԩ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(@NotNull IntentFilter var1, @NotNull IBinder var2, @Nullable String var3, @NotNull ຓ var4) {
      ࢷ.Ϳ.Ϳ(var1, var2, var3, var4);
   }

   public void _/* $FF was: ԩ*/(@Nullable IBinder var1) {
      ࢷ.Ϳ.Ϳ(var1);
   }

   public void _/* $FF was: Ԫ*/(@Nullable Intent var1) {
      ࢷ.Ϳ.Ԩ(var1);
   }

   @Nullable
   public String _/* $FF was: Ԫ*/(int var1) {
      return ࢢ.Ϳ.Ϳ(var1);
   }

   public void _/* $FF was: Ϳ*/(long var1) {
      int var3 = (int)(var1 & 4294967295L);
      ࢢ.Ϳ.Ϳ(var3, (int)((var1 & -4294967296L) >> 32));
   }

   public void _/* $FF was: Ϳ*/(long var1, @Nullable Notification var3, int var4) {
      int var5 = (int)(var1 & 4294967295L);
      ࢢ.Ϳ.Ϳ(var5, (int)((var1 & -4294967296L) >> 32), var3, var4);
   }

   public void _/* $FF was: Ԫ*/() {
      ࢢ.Ϳ.ԫ();
   }

   public void _/* $FF was: Ϳ*/(@Nullable ൔ var1, @Nullable ຓ var2) {
      ࢢ.Ϳ.getClass();
   }

   @NotNull
   public List<RunningAppProcessInfo> _/* $FF was: ԩ*/(int var1) {
      return ࢢ.Ϳ.Ԩ(var1);
   }
}
