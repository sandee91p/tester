package lu.die.foza.SleepyFox;

import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ʹ<E> {
   @NotNull
   public static final ʹ.Ϳ Ԫ = new ʹ.Ϳ();
   @NotNull
   public int[] Ϳ;
   @NotNull
   public Object[] Ԩ;
   public int ԩ;

   @JvmOverloads
   public ʹ(int var1) {
      if (var1 == 0) {
         this.Ϳ = ބ.Ԫ.Ϳ;
         this.Ԩ = ބ.Ԫ.ԩ;
      } else {
         this.Ԩ = new Object[var1];
         this.Ϳ = new int[var1];
      }

      this.ԩ = 0;
   }

   // $FF: synthetic method
   public ʹ(int var1, int var2, DefaultConstructorMarker var3) {
      if ((var2 & 1) != 0) {
         var1 = 10;
      }

      this(var1);
   }

   // $FF: synthetic method
   public static Object _/* $FF was: Ϳ*/(ʹ var0, int var1, Object var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      return var0.Ϳ(var1, var2);
   }

   @JvmOverloads
   public ʹ() {
      this(0, 1, (DefaultConstructorMarker)null);
   }

   @JvmStatic
   @NotNull
   public static final int[] _/* $FF was: Ϳ*/(@NotNull int[] var0, int var1, int var2, int var3) {
      return Ԫ.Ϳ(var0, var1, var2, var3);
   }

   public final boolean _/* $FF was: Ϳ*/(int var1) {
      return this.ԩ(var1) >= 0;
   }

   @JvmOverloads
   @Nullable
   public final E _/* $FF was: Ϳ*/(int var1, @Nullable E var2) {
      if ((var1 = ބ.Ԩ.Ϳ(this.Ϳ, this.ԩ, var1)) >= 0) {
         var2 = this.Ԩ[var1];
      }

      return var2;
   }

   public final void _/* $FF was: ԩ*/(int var1, E var2) {
      this.Ԩ(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Pair<Integer, ? extends E>... var1) {
      this.Ԩ = new Object[var1.length];
      this.Ϳ = new int[var1.length];
      int var2 = 0;

      for(int var3 = var1.length; var2 < var3; ++var2) {
         Pair var10001 = var1[var2];
         int var4 = ((Number)var1[var2].getFirst()).intValue();
         this.Ԩ(var4, var10001.getSecond());
      }

   }

   public final void _/* $FF was: Ԩ*/(int var1, E var2) {
      int var3;
      if ((var3 = ބ.Ԩ.Ϳ(this.Ϳ, this.ԩ, var1)) >= 0) {
         this.Ԩ[var3] = var2;
      } else {
         ʹ var10000 = this;
         ʹ var10001 = this;
         ʹ var10002 = this;
         var3 = ~var3;
         ʹ.Ϳ var4;
         ʹ.Ϳ var10003 = var4 = Ԫ;
         ʹ var10004 = this;
         ʹ var10005 = this;
         ʹ var10006 = this;
         ʹ var10008 = this;
         int[] var5 = this.Ϳ;
         var10006.Ϳ = var4.Ϳ(var5, var10008.ԩ, var3, var1);
         Object[] var6 = var10005.Ԩ;
         var10002.Ԩ = var10003.Ϳ(var6, var10004.ԩ, var3, var2);
         var10000.ԩ = var10001.ԩ + 1;
      }

   }

   public final int _/* $FF was: Ԩ*/() {
      return this.ԩ;
   }

   public final int _/* $FF was: Ԫ*/(int var1) {
      return this.Ϳ[var1];
   }

   @Nullable
   public final E _/* $FF was: ԫ*/(int var1) {
      return this.Ԩ[var1];
   }

   public final void _/* $FF was: Ԫ*/(int var1, E var2) {
      this.Ԩ[var1] = var2;
   }

   public final int _/* $FF was: ԩ*/(int var1) {
      return ބ.Ԩ.Ϳ(this.Ϳ, this.ԩ, var1);
   }

   public final int _/* $FF was: Ϳ*/(E var1) {
      int var2 = 0;

      for(int var3 = this.ԩ; var2 < var3; ++var2) {
         if (this.Ԩ[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public final int _/* $FF was: Ԩ*/(@Nullable E var1) {
      int var2 = 0;

      for(int var3 = this.ԩ; var2 < var3; ++var2) {
         if (var1 == null) {
            if (this.Ԩ[var2] == null) {
               return var2;
            }
         } else if (Intrinsics.areEqual(var1, this.Ԩ[var2])) {
            return var2;
         }
      }

      return -1;
   }

   public final void _/* $FF was: Ϳ*/() {
      this.Ϳ = ބ.Ԫ.Ϳ;
      this.Ԩ = ބ.Ԫ.ԩ;
      this.ԩ = 0;
   }

   @JvmOverloads
   @Nullable
   public final E _/* $FF was: Ԩ*/(int var1) {
      return Ϳ(this, var1, (Object)null, 2, (Object)null);
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final Object[] _/* $FF was: Ϳ*/(@NotNull Object[] var1, int var2, int var3, @Nullable Object var4) {
         if (var2 + 1 <= var1.length) {
            int var6 = var3 + 1;
            var2 -= var3;
            System.arraycopy(var1, var3, var1, var6, var2);
            var1[var3] = var4;
            return var1;
         } else {
            Object[] var5;
            Object[] var10000 = var5 = new Object[this.Ϳ(var2)];
            Object[] var10001 = var1;
            Object[] var10003 = var1;
            System.arraycopy(var1, 0, var5, 0, var3);
            var5[var3] = var4;
            int var7 = var3 + 1;
            var2 = var10003.length - var3;
            System.arraycopy(var10001, var3, var5, var7, var2);
            return var10000;
         }
      }

      @JvmStatic
      @NotNull
      public final int[] _/* $FF was: Ϳ*/(@NotNull int[] var1, int var2, int var3, int var4) {
         if (var2 + 1 <= var1.length) {
            int var6 = var3 + 1;
            var2 -= var3;
            System.arraycopy(var1, var3, var1, var6, var2);
            var1[var3] = var4;
            return var1;
         } else {
            int[] var5;
            int[] var10000 = var5 = new int[this.Ϳ(var2)];
            int[] var10001 = var1;
            int[] var10003 = var1;
            System.arraycopy(var1, 0, var5, 0, var3);
            var5[var3] = var4;
            int var7 = var3 + 1;
            var2 = var10003.length - var3;
            System.arraycopy(var10001, var3, var5, var7, var2);
            return var10000;
         }
      }

      public final int _/* $FF was: Ϳ*/(int var1) {
         return var1 <= 4 ? 8 : var1 * 2;
      }
   }
}
