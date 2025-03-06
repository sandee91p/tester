package lu.die.foza.SleepyFox;

import lu.die.foza.Platform.EmbeddedMachineCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ၽ {
   @NotNull
   public static final ၽ Ϳ = new ၽ();

   static {
      label23:
      try {
         System.loadLibrary("loader");
      } finally {
         break label23;
      }

   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(int var1, @Nullable Object var2) {
      return EmbeddedMachineCompat.nativeIoctl(var1, var2);
   }
}
