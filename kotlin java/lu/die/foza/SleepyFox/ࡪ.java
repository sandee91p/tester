package lu.die.foza.SleepyFox;

import android.util.Log;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࡪ {
   @NotNull
   public static final ࡪ Ϳ = new ࡪ();
   public static boolean Ԩ;
   @NotNull
   public static String ԩ;

   @JvmStatic
   public static final void _/* $FF was: Ϳ*/(boolean var0) {
      Ԩ = var0;
   }

   @NotNull
   public static final String _/* $FF was: Ϳ*/() {
      return ԩ;
   }

   public static final void _/* $FF was: Ԫ*/(@NotNull String var0) {
      ԩ = var0;
   }

   /** @deprecated */
   // $FF: synthetic method
   @JvmStatic
   public static void _/* $FF was: Ԩ*/() {
   }

   @JvmStatic
   public static final void _/* $FF was: Ϳ*/(@NotNull String var0) {
      if (Ԩ) {
         Log.d(ԩ, var0);
      }

   }

   @JvmStatic
   public static final void _/* $FF was: Ԩ*/(@NotNull String var0) {
      if (Ԩ) {
         Log.e(ԩ, var0);
      }

   }

   @JvmStatic
   public static final void _/* $FF was: ԫ*/(@NotNull String var0) {
      if (Ԩ) {
         Log.w(ԩ, var0);
      }

   }

   @JvmStatic
   public static final void _/* $FF was: ԩ*/(@NotNull String var0) {
      if (Ԩ) {
         Log.i(ԩ, var0);
      }

   }

   @JvmStatic
   public static final void _/* $FF was: Ϳ*/(@NotNull Throwable var0) {
      if (Ԩ) {
         Log.e(ԩ, Log.getStackTraceString(var0));
      }

   }

   @JvmStatic
   public static final void _/* $FF was: Ϳ*/(@NotNull String var0, @NotNull Throwable var1) {
      if (Ԩ) {
         Log.e(ԩ, var0 + Log.getStackTraceString(var1));
      }

   }

   @JvmStatic
   public static final void _/* $FF was: ԩ*/(@NotNull Throwable var0) {
      if (Ԩ) {
         Log.w(ԩ, Log.getStackTraceString(var0));
      }

   }

   /** @deprecated */
   @JvmStatic
   @Deprecated(
      message = "Slow down app."
   )
   @NotNull
   public static final String _/* $FF was: Ԩ*/(@Nullable Throwable var0) {
      return Ԩ && var0 != null ? Log.getStackTraceString(var0) : "";
   }
}
