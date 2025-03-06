package lu.die.foza.SleepyFox;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࣆ {
   @NotNull
   public static final ࣆ.Ϳ Ԩ = new ࣆ.Ϳ();
   public final int Ϳ;

   public _/* $FF was: ࣆ*/(String var1, String var2, String var3) {
      ࣆ var10000 = this;
      super();
      int var4 = var1.hashCode() * 31;
      var4 += var2.hashCode() * 31;
      var10000.Ϳ = var3.hashCode() * 31 + var4;
   }

   @JvmStatic
   public static final int _/* $FF was: Ϳ*/(@NotNull String var0, @NotNull String var1) {
      return Ԩ.Ϳ(var0, var1);
   }

   // $FF: synthetic method
   public _/* $FF was: ࣆ*/(String var1, String var2, String var3, DefaultConstructorMarker var4) {
      this(var1, var2, var3);
   }

   public int hashCode() {
      return this.Ϳ;
   }

   public boolean equals(@Nullable Object var1) {
      int var2 = this.Ϳ;
      int var3;
      if (var1 != null) {
         var3 = var1.hashCode();
      } else {
         var3 = 0;
      }

      return var2 == var3;
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ࣆ _/* $FF was: Ϳ*/(@NotNull ൔ var1) {
         ൔ var10000 = var1;
         String var3 = var1.Ԩ();
         String var4 = var1.Ԫ();
         String var2 = var10000.ԫ();
         return new ࣆ(var3, var4, var2);
      }

      @NotNull
      public final ࣆ _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2, @NotNull String var3) {
         return new ࣆ(var1, var2, var3);
      }

      public final int _/* $FF was: Ԩ*/(@NotNull ൔ var1) {
         ࣆ.Ϳ var10000 = this;
         String var2 = var1.Ԩ();
         return var10000.Ϳ(var2, var1.ԫ());
      }

      @JvmStatic
      public final int _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
         int var3 = var1.hashCode() * 31;
         return var2.hashCode() * 31 + var3;
      }
   }
}
