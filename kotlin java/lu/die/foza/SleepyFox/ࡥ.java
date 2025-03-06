package lu.die.foza.SleepyFox;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࡥ {
   @NotNull
   public final Object Ϳ;
   @NotNull
   public final Method Ԩ;
   @NotNull
   public final Object[] ԩ;

   public _/* $FF was: ࡥ*/(@NotNull Object var1, @NotNull Method var2, @NotNull Object[] var3) {
      this.Ϳ = var1;
      this.Ԩ = var2;
      this.ԩ = var3;
   }

   @Nullable
   public final Object _/* $FF was: Ԫ*/() {
      Method var10000 = this.Ԩ;
      ࡥ var10001 = this;
      Object var1 = this.Ϳ;
      return var10000.invoke(var1, var10001.ԩ);
   }

   @NotNull
   public final Object[] _/* $FF was: Ϳ*/() {
      return this.ԩ;
   }

   @NotNull
   public final Method _/* $FF was: Ԩ*/() {
      return this.Ԩ;
   }

   @NotNull
   public final Object _/* $FF was: ԩ*/() {
      return this.Ϳ;
   }
}
