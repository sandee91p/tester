package lu.die.foza.SleepyFox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ˁ implements InvocationHandler {
   @NotNull
   public final ໞ Ϳ;
   @NotNull
   public final Object Ԩ;
   @NotNull
   public final Object ԩ;
   @NotNull
   public final ʹ<ໞ> Ԫ;

   public ˁ(@NotNull ໞ var1, @NotNull Object var2) {
      this.Ԫ = new ʹ(0, 1, (DefaultConstructorMarker)null);
      this.Ϳ = var1;
      this.Ԩ = var2;
      this.ԩ = Proxy.newProxyInstance(var2.getClass().getClassLoader(), ރ.Ϳ.Ϳ(var2.getClass()), this);
   }

   public ˁ(@NotNull ໞ var1, @NotNull Object var2, @Nullable String var3, @NotNull Class<?> var4) {
      this(var1, var2);
   }

   @NotNull
   public final Object _/* $FF was: Ϳ*/() {
      return this.ԩ;
   }

   @Nullable
   public final ໞ _/* $FF was: Ԩ*/(@NotNull String var1) {
      return (ໞ)ʹ.Ϳ(this.Ԫ, var1.hashCode(), (Object)null, 2, (Object)null);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull ໞ var2) {
      this.Ԫ.Ԩ(var1.hashCode(), var2);
   }

   @Nullable
   public final ໞ _/* $FF was: Ϳ*/(@NotNull String var1) {
      return this.Ԩ(var1);
   }

   public final void _/* $FF was: Ԩ*/(@NotNull String var1, @NotNull ໞ var2) {
      this.Ϳ(var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ໞ var1, @NotNull String... var2) {
      int var3 = 0;

      for(int var4 = var2.length; var3 < var4; ++var3) {
         this.Ϳ(var2[var3], var1);
      }

   }

   @Nullable
   public Object invoke(@Nullable Object var1, @NotNull Method var2, @Nullable Object[] var3) {
      InvocationTargetException var10000;
      label59: {
         ໞ var15;
         boolean var10001;
         try {
            var15 = (ໞ)ʹ.Ϳ(this.Ԫ, var2.getName().hashCode(), (Object)null, 2, (Object)null);
         } catch (InvocationTargetException var10) {
            var10000 = var10;
            var10001 = false;
            break label59;
         }

         ໞ var13 = var15;
         if (var15 == null) {
            try {
               var15 = this.Ϳ;
            } catch (InvocationTargetException var9) {
               var10000 = var9;
               var10001 = false;
               break label59;
            }

            var13 = var15;
         }

         Object[] var16;
         ˁ var17;
         ࡥ var10002;
         try {
            var16 = var3;
            var17 = this;
            var10002 = new ࡥ;
         } catch (InvocationTargetException var8) {
            var10000 = var8;
            var10001 = false;
            break label59;
         }

         ࡥ var11 = var10002;

         Object var18;
         try {
            var18 = var17.Ԩ;
         } catch (InvocationTargetException var7) {
            var10000 = var7;
            var10001 = false;
            break label59;
         }

         Object var4 = var18;
         if (var16 == null) {
            try {
               var16 = ބ.Ԫ.ԩ;
            } catch (InvocationTargetException var6) {
               var10000 = var6;
               var10001 = false;
               break label59;
            }

            var3 = var16;
         }

         try {
            var11.<init>(var4, var2, var3);
            return var13.Ϳ(var11);
         } catch (InvocationTargetException var5) {
            var10000 = var5;
            var10001 = false;
         }
      }

      Object var12 = var10000;
      Throwable var14;
      if ((var14 = ((InvocationTargetException)var12).getCause()) != null) {
         var12 = var14;
      }

      throw var12;
   }
}
