package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.os.IBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ޡ {
   @NotNull
   public static final ޡ Ϳ = new ޡ();
   @Nullable
   public static String Ԩ;
   @NotNull
   public static final ބ<IBinder, ComponentName> ԩ = new ބ();

   public final void _/* $FF was: Ԩ*/() {
      try {
         Ԩ = null;
         ԩ.clear();
      } catch (Exception var1) {
      }

   }

   public final void _/* $FF was: Ԩ*/(@NotNull IBinder var1) {
      try {
         ԩ.remove(var1);
      } catch (Exception var2) {
      }

   }

   public final void _/* $FF was: Ϳ*/(@NotNull IBinder param1, @NotNull ComponentName param2) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final ComponentName _/* $FF was: Ϳ*/(@Nullable IBinder var1) {
      try {
         return (ComponentName)ԩ.get(var1);
      } catch (Exception var2) {
         return null;
      }
   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1) {
      Ԩ = var1;
   }

   @Nullable
   public final String _/* $FF was: Ϳ*/() {
      return Ԩ;
   }
}
