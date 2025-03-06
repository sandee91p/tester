package lu.die.foza.SleepyFox;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢲ extends ClassLoader {
   @NotNull
   public final String Ϳ;

   public _/* $FF was: ࢲ*/(@Nullable ClassLoader var1, @NotNull String var2) {
      if (var1 == null) {
         var1 = ClassLoader.getSystemClassLoader();
      }

      super(var1);
      this.Ϳ = var2;
   }

   @NotNull
   public Class<?> loadClass(@Nullable String var1, boolean var2) {
      if (!Intrinsics.areEqual(this.Ϳ, var1)) {
         return super.loadClass(var1, var2);
      } else {
         throw new ClassNotFoundException(var1);
      }
   }
}
