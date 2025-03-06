package lu.die.foza.SleepyFox;

import android.content.AttributionSource;
import android.content.AttributionSource.Builder;
import androidx.annotation.RequiresApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nArgumentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArgumentUtils.kt\nlu/die/foza/FoxDev/ThirdParty/ArgumentUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n37#2,2:131\n1#3:133\n*S KotlinDebug\n*F\n+ 1 ArgumentUtils.kt\nlu/die/foza/FoxDev/ThirdParty/ArgumentUtils\n*L\n30#1:131,2\n*E\n"})
public final class ރ {
   @NotNull
   public static final ރ Ϳ = new ރ();

   public final long _/* $FF was: Ϳ*/(int var1, int var2) {
      return (long)var1 & 4294967295L | (long)var2 << 32 & -4294967296L;
   }

   public final int _/* $FF was: Ԩ*/(@NotNull Object[] var1, @NotNull Class<?> var2) {
      int var4 = 0;

      for(int var3 = var1.length; var4 < var3; ++var4) {
         if (var2.isInstance(var1[var4])) {
            return var4;
         }
      }

      return -1;
   }

   @NotNull
   public final Class<?>[] _/* $FF was: Ϳ*/(@NotNull Class<?> var1) {
      ޅ var2;
      ޅ var10000 = var2 = new ޅ;
      var2.<init>(2, false);
      this.Ϳ(var1, var2);
      return (Class[])var10000.toArray(new Class[0]);
   }

   public final int _/* $FF was: ԩ*/(@NotNull Object[] var1, @NotNull Class<?> var2) {
      boolean var3;
      if (var1.length == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3 ^ true) {
         for(int var4 = var1.length - 1; -1 < var4; --var4) {
            if (var2.isInstance(var1[var4])) {
               return var4;
            }
         }
      }

      return -1;
   }

   public final int _/* $FF was: Ϳ*/(@NotNull Class<?>[] var1, @NotNull Class<?> var2) {
      int var4 = 0;

      for(int var3 = var1.length; var4 < var3; ++var4) {
         if (Intrinsics.areEqual(var1[var4], var2)) {
            return var4;
         }
      }

      return -1;
   }

   @Nullable
   public final <T> T _/* $FF was: Ϳ*/(@NotNull Object[] var1, @NotNull Class<T> var2) {
      int var5 = 0;

      for(int var3 = var1.length; var5 < var3; ++var5) {
         Object var4;
         if (var2.isInstance(var4 = var1[var5])) {
            return var4;
         }
      }

      return null;
   }

   @RequiresApi(31)
   public final void _/* $FF was: Ϳ*/(@NotNull Object[] var1) {
      int var10000;
      boolean var10001;
      try {
         var10000 = this.Ԩ(var1, AttributionSource.class);
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      int var2 = var10000;
      if (var10000 >= 0) {
         Object var8;
         try {
            var8 = var1[var2];
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         Object var3 = var8;

         boolean var9;
         try {
            var9 = var8 instanceof AttributionSource;
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         if (var9) {
            try {
               var1[var2] = this.Ϳ((AttributionSource)var3);
            } catch (Exception var4) {
               var10001 = false;
            }
         }
      }

   }

   public final void _/* $FF was: Ϳ*/(@NotNull Object[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(Class<?> var1, ޅ<Class<?>> var2) {
      Class[] var4;
      if ((var4 = var1.getInterfaces()).length == 0 ^ true) {
         CollectionsKt.addAll(var2, var4);
      }

      Class var5;
      if (!Intrinsics.areEqual(var5 = var1.getSuperclass(), Object.class)) {
         Ϳ.Ϳ(var5, var2);
      }

   }

   @RequiresApi(31)
   public final AttributionSource _/* $FF was: Ϳ*/(AttributionSource var1) {
      Builder var2;
      Builder var10001 = var2 = new Builder;
      ࢦ.Ϳ.getClass();
      var2.<init>(ࢦ.ԯ);
      var2.setPackageName(ࢦ.Ԯ);
      var10001.setAttributionTag(var1.getAttributionTag());
      if ((var1 = var1.getNext()) != null) {
         var2.setNext(this.Ϳ(var1));
      }

      return var2.build();
   }
}
