package lu.die.foza.SleepyFox;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionUtils.kt\nlu/die/foza/HookEntity/Reflection/ReflectionUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n1#2:310\n*E\n"})
public final class ˋ {
   @NotNull
   public static final ˋ Ϳ = new ˋ();

   @JvmStatic
   @Nullable
   public static final Object _/* $FF was: Ԩ*/(@NotNull String var0, @NotNull String var1) {
      return Ϳ.Ԩ(Class.forName(var0), var1);
   }

   @NotNull
   public final Class<?> _/* $FF was: Ϳ*/(@NotNull Class<?> var1, int var2) {
      Type var3;
      ParameterizedType var4;
      if ((var3 = var1.getGenericSuperclass()) instanceof ParameterizedType) {
         var4 = (ParameterizedType)var3;
      } else {
         var4 = null;
      }

      if (var4 == null) {
         return Object.class;
      } else {
         Type[] var5;
         if (var2 < (var5 = var4.getActualTypeArguments()).length && var2 >= 0) {
            Class var10000;
            if (!((var3 = var5[var2]) instanceof Class)) {
               var10000 = Object.class;
            } else {
               Intrinsics.checkNotNull(var3, "null cannot be cast to non-null type java.lang.Class<*>");
               var10000 = (Class)var3;
            }

            return var10000;
         } else {
            return Object.class;
         }
      }
   }

   @NotNull
   public final <T> Class<?> _/* $FF was: Ϳ*/(@NotNull Class<?> var1) {
      return this.Ϳ(var1, 0);
   }

   @Nullable
   public final Method _/* $FF was: Ϳ*/(@NotNull Object var1, @NotNull String var2, @NotNull Class<?>[] var3) {
      Class var5 = var1.getClass();

      while(!Intrinsics.areEqual(var5, Object.class)) {
         try {
            return var5.getDeclaredMethod(var2, var3);
         } catch (NoSuchMethodException var4) {
            var5 = var5.getSuperclass();
         }
      }

      return null;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Field var1) {
      var1.setAccessible(true);
   }

   @Nullable
   public final Field _/* $FF was: Ϳ*/(@NotNull Object var1, @NotNull String var2) {
      Class var4 = var1.getClass();

      while(!Intrinsics.areEqual(var4, Object.class)) {
         try {
            return var4.getDeclaredField(var2);
         } catch (NoSuchFieldException var3) {
            var4 = var4.getSuperclass();
         }
      }

      return null;
   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@Nullable Object var1, @NotNull String var2, @NotNull Class<?>[] var3, @NotNull Object[] var4) {
      Method var6;
      if (var1 != null && (var6 = Ϳ.Ϳ(var1, var2, var3)) != null) {
         Method var10000 = var6;
         Object var10001 = var1;
         var6.setAccessible(true);

         try {
            return var10000.invoke(var10001, var4);
         } catch (IllegalAccessException var5) {
            return null;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Nullable
   public final Object _/* $FF was: ԩ*/(@Nullable Object var1, @NotNull String var2) {
      ˋ var10000 = this;
      Object[] var3 = ބ.Ԫ.ԩ;
      return var10000.Ϳ(var1, var2, ބ.Ԫ.Ԩ, var3);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object var1, @NotNull String var2, @Nullable Object var3) {
      Field var5;
      if ((var5 = this.Ϳ(var1, var2)) != null) {
         Field var10000 = var5;
         var5.setAccessible(true);

         try {
            var10000.set(var1, var3);
         } catch (IllegalAccessException var4) {
         }

      } else {
         throw new IllegalArgumentException();
      }
   }

   @Nullable
   public final Object _/* $FF was: Ԩ*/(@NotNull Object var1, @NotNull String var2) {
      Field var4;
      if ((var4 = this.Ϳ(var1, var2)) != null) {
         Field var10000 = var4;
         var4.setAccessible(true);
         Object var6 = null;

         Object var5;
         try {
            var5 = var10000.get(var1);
         } catch (IllegalAccessException var3) {
            return var6;
         }

         var6 = var5;
         return var6;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Nullable
   public final Object _/* $FF was: Ԩ*/(@NotNull Class<?> var1, @NotNull String var2) {
      try {
         Field var10000 = var1.getDeclaredField(var2);
         var10000.setAccessible(true);
         return var10000.get((Object)null);
      } catch (Exception var3) {
         return null;
      }
   }

   @Nullable
   public final Object _/* $FF was: ԩ*/(@NotNull Class<?> var1, @NotNull String var2) {
      try {
         Field var10000 = var1.getDeclaredField(var2);
         var10000.setAccessible(true);
         return var10000.get((Object)null);
      } catch (Exception var3) {
         return null;
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Class<?> var1, @NotNull String var2, @Nullable Object var3) {
      try {
         Field var10000 = var1.getDeclaredField(var2);
         var10000.setAccessible(true);
         var10000.set((Object)null, var3);
      } catch (Exception var4) {
      }

   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2, @Nullable Object var3) {
      try {
         this.Ϳ(Class.forName(var1), var2, var3);
      } catch (Exception var4) {
      }

   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      try {
         return this.Ϳ(Class.forName(var1), var2);
      } catch (Exception var3) {
         return null;
      }
   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@NotNull Class<?> param1, @NotNull String param2) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@NotNull ClassLoader param1, @NotNull String param2, @NotNull String param3) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final Object _/* $FF was: Ԩ*/(@NotNull ClassLoader param1, @NotNull String param2, @NotNull String param3) {
      // $FF: Couldn't be decompiled
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull String var1, @Nullable Object var2) {
      try {
         return Class.forName(var1).isInstance(var2);
      } catch (Exception var3) {
         return false;
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object param1, @NotNull Object param2, @NotNull String param3) {
      // $FF: Couldn't be decompiled
   }
}
