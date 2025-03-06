package lu.die.foza.SleepyFox;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ૹ<T> {
   @NotNull
   public final String Ϳ;
   @Nullable
   public Field Ԩ;

   public _/* $FF was: ૹ*/(@NotNull String var1) {
      this.Ϳ = var1;
   }

   @NotNull
   public final Field _/* $FF was: Ϳ*/(@NotNull Object var1) {
      Exception var10000;
      label49: {
         ˋ var12;
         boolean var10001;
         try {
            var12 = ˋ.Ϳ;
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label49;
         }

         ˋ var2 = var12;

         Field var13;
         try {
            var13 = var12.Ϳ(var1, this.Ϳ);
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label49;
         }

         Field var9 = var13;
         if (var13 != null) {
            try {
               var13 = var9;
               var2.getClass();
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label49;
            }

            try {
               var13.setAccessible(true);
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break label49;
            }
         } else {
            var9 = null;
         }

         try {
            this.Ԩ = var9;
            Intrinsics.checkNotNull(var9);
            return var9;
         } catch (Exception var3) {
            var10000 = var3;
            var10001 = false;
         }
      }

      Object var8 = var10000;
      RuntimeException var10 = new RuntimeException;
      Throwable var11;
      if ((var11 = ((Throwable)var8).getCause()) != null) {
         var8 = var11;
      }

      var10.<init>((Throwable)var8);
      throw var10;
   }

   @NotNull
   public final Field _/* $FF was: Ϳ*/(@NotNull Class<?> var1) {
      Field var10000 = var1.getDeclaredField(this.Ϳ);
      ˋ.Ϳ.getClass();
      var10000.setAccessible(true);
      this.Ԩ = var10000;
      return var10000;
   }

   @NotNull
   public final Field _/* $FF was: Ϳ*/(@NotNull String var1) {
      return this.Ϳ(Class.forName(var1));
   }

   @Nullable
   public final T _/* $FF was: ԩ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.get(var1);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, @Nullable Object var2) {
      Field var3;
      if ((var3 = this.Ԩ) == null) {
         var3 = this.Ԩ(var1);
      }

      var3.set(var1, var2);
   }

   @Nullable
   public final T _/* $FF was: Ϳ*/() {
      Field var1;
      return (var1 = this.Ԩ) != null ? var1.get((Object)null) : null;
   }

   @Nullable
   public final Unit ֏(@Nullable Object var1) {
      Unit var10000;
      Field var2;
      if ((var2 = this.Ԩ) != null) {
         var2.set((Object)null, var1);
         var10000 = Unit.INSTANCE;
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public final boolean _/* $FF was: Ԫ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getBoolean(var1);
   }

   public final byte _/* $FF was: ԫ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getByte(var1);
   }

   public final char _/* $FF was: Ԭ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getChar(var1);
   }

   public final short _/* $FF was: ֈ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getShort(var1);
   }

   public final int _/* $FF was: ԯ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getInt(var1);
   }

   public final long _/* $FF was: ՠ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getLong(var1);
   }

   public final float _/* $FF was: Ԯ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getFloat(var1);
   }

   public final double _/* $FF was: ԭ*/(@NotNull Object var1) {
      Field var2;
      if ((var2 = this.Ԩ) == null) {
         var2 = this.Ԩ(var1);
      }

      return var2.getDouble(var1);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, boolean var2) {
      Field var3;
      if ((var3 = this.Ԩ) == null) {
         var3 = this.Ԩ(var1);
      }

      var3.setBoolean(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, byte var2) {
      Field var3;
      if ((var3 = this.Ԩ) == null) {
         var3 = this.Ԩ(var1);
      }

      var3.setByte(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, char var2) {
      Field var3;
      if ((var3 = this.Ԩ) == null) {
         var3 = this.Ԩ(var1);
      }

      var3.setChar(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, short var2) {
      Field var3;
      if ((var3 = this.Ԩ) == null) {
         var3 = this.Ԩ(var1);
      }

      var3.setShort(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, int var2) {
      Field var3;
      if ((var3 = this.Ԩ) == null) {
         var3 = this.Ԩ(var1);
      }

      var3.setInt(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, long var2) {
      Field var4;
      if ((var4 = this.Ԩ) == null) {
         var4 = this.Ԩ(var1);
      }

      var4.setLong(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, float var2) {
      Field var3;
      if ((var3 = this.Ԩ) == null) {
         var3 = this.Ԩ(var1);
      }

      var3.setFloat(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, double var2) {
      Field var4;
      if ((var4 = this.Ԩ) == null) {
         var4 = this.Ԩ(var1);
      }

      var4.setDouble(var1, var2);
   }

   public final Field _/* $FF was: Ԩ*/(Object var1) {
      Field var2 = null;
      ൖ var3;
      var3 = new ൖ.<init>(3);

      while(var2 == null && var3.Ԩ()) {
         Field var10000;
         try {
            var10000 = this.Ϳ(var1);
         } catch (Exception var4) {
            ൎ.Ϳ.Ԫ();
            continue;
         }

         var2 = var10000;
      }

      Intrinsics.checkNotNull(var2);
      this.Ԩ = var2;
      return var2;
   }
}
