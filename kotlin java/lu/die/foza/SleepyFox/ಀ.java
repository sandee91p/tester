package lu.die.foza.SleepyFox;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ಀ<T> {
   @NotNull
   public final String Ϳ;
   @NotNull
   public final Class<?>[] Ԩ;
   @Nullable
   public Method ԩ;

   public _/* $FF was: ಀ*/(@NotNull String var1, @NotNull Class<?>[] var2) {
      this.Ϳ = var1;
      this.Ԩ = var2;
   }

   // $FF: synthetic method
   public _/* $FF was: ಀ*/(String var1, Class[] var2, int var3, DefaultConstructorMarker var4) {
      if ((var3 & 2) != 0) {
         var2 = ބ.Ԫ.Ԩ;
      }

      this(var1, var2);
   }

   @NotNull
   public final ಀ<T> _/* $FF was: Ϳ*/(@NotNull String var1) {
      try {
         this.Ϳ(Class.forName(var1));
      } catch (Exception var2) {
      }

      return this;
   }

   @NotNull
   public final ಀ<T> _/* $FF was: Ϳ*/(@NotNull Class<?> var1) {
      ൖ var2;
      var2 = new ൖ.<init>(3);

      for(; var2.Ԩ(); ൎ.Ϳ.Ԫ()) {
         ಀ var10000;
         boolean var10001;
         Class var10002;
         ಀ var10003;
         String var10004;
         ಀ var8;
         try {
            var10000 = this;
            var8 = this;
            var10002 = var1;
            var10003 = this;
            var10004 = this.Ϳ;
         } catch (Exception var6) {
            var10001 = false;
            continue;
         }

         String var3 = var10004;

         Method var9;
         try {
            var9 = var10002.getDeclaredMethod(var3, var10003.Ԩ);
         } catch (Exception var5) {
            var10001 = false;
            continue;
         }

         Method var7 = var9;

         try {
            var9.setAccessible(true);
            var8.ԩ = var7;
            return var10000;
         } catch (Exception var4) {
            var10001 = false;
         }
      }

      return this;
   }

   @Nullable
   public final T _/* $FF was: Ԩ*/(@Nullable Object var1, @NotNull Object[] var2) {
      Method var3;
      if ((var3 = this.ԩ) == null) {
         Intrinsics.checkNotNull(var1);
         var3 = this.Ϳ(var1);
      }

      return var3.invoke(var1, var2);
   }

   @Nullable
   public final T _/* $FF was: Ϳ*/(@Nullable Object var1, @NotNull Object... var2) {
      Method var3;
      if ((var3 = this.ԩ) == null) {
         Intrinsics.checkNotNull(var1);
         var3 = this.Ϳ(var1);
      }

      return var3.invoke(var1, var2);
   }

   public final Method _/* $FF was: Ϳ*/(Object var1) {
      ൖ var2;
      var2 = new ൖ.<init>(3);
      Method var3 = null;

      while(var3 == null && var2.Ԩ()) {
         Method var8;
         label37: {
            label45: {
               ˋ var9;
               ಀ var10000;
               boolean var10001;
               Object var10002;
               ಀ var10003;
               String var10004;
               try {
                  var10000 = this;
                  var9 = ˋ.Ϳ;
                  var10002 = var1;
                  var10003 = this;
                  var10004 = this.Ϳ;
               } catch (Exception var7) {
                  var10001 = false;
                  break label45;
               }

               String var4 = var10004;

               Method var10;
               try {
                  var10 = var9.Ϳ(var10002, var4, var10003.Ԩ);
               } catch (Exception var6) {
                  var10001 = false;
                  break label45;
               }

               Method var11 = var10;
               Method var12 = var8 = var10;

               try {
                  Intrinsics.checkNotNull(var12);
                  var11.setAccessible(true);
                  var10000.ԩ = var10;
                  break label37;
               } catch (Exception var5) {
                  var10001 = false;
               }
            }

            ൎ.Ϳ.Ԫ();
            continue;
         }

         var3 = var8;
      }

      Intrinsics.checkNotNull(var3);
      return var3;
   }
}
