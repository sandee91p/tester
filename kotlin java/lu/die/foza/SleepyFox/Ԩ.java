package lu.die.foza.SleepyFox;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.IBinder.DeathRecipient;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbsServiceRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsServiceRegistry.kt\nlu/die/foza/Framework/Discover/AbsServiceRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public abstract class Ԩ<T extends IInterface> {
   @Nullable
   public T Ϳ;

   // $FF: synthetic method
   public static void _/* $FF was: Ϳ*/(Ԩ var0, IBinder var1, Function1 var2, Function0 var3, int var4, Object var5) {
      if (var5 == null) {
         if ((var4 & 4) != 0) {
            var3 = null.INSTANCE;
         }

         var0.Ϳ(var1, var2, (Function0)var3);
      } else {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareManagerImpl");
      }
   }

   @NotNull
   public abstract String _/* $FF was: Ϳ*/();

   public abstract void _/* $FF was: Ϳ*/(@NotNull IBinder var1);

   public final void _/* $FF was: Ϳ*/(@NotNull Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final T _/* $FF was: ԩ*/() {
      return this.Ϳ;
   }

   public final void _/* $FF was: Ԩ*/(@Nullable T var1) {
      this.Ϳ = var1;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull IBinder var1, @NotNull Function1<? super IBinder, ? extends T> var2, @NotNull Function0<Unit> var3) {
      IInterface var4;
      if ((var4 = this.Ϳ) == null || !var4.asBinder().isBinderAlive()) {
         IInterface var5;
         if ((var5 = (IInterface)var2.invoke(var1)) == null) {
            return;
         }

         DeathRecipient var6;
         var6 = new DeathRecipient() {
            // $FF: synthetic field
            public final Ԩ<T> Ԯ;
            // $FF: synthetic field
            public final Function0<Unit> ԯ;

            public {
               this.Ԯ = var2;
               this.ԯ = var3;
            }

            public void binderDied() {
               // $FF: Couldn't be decompiled
            }
         }.<init>(this, var3);
         var1.linkToDeath(var6, 0);
         this.Ϳ = var5;
      }

   }

   @NotNull
   public final T _/* $FF was: Ԩ*/() {
      IInterface var1;
      if ((var1 = this.Ϳ) != null) {
         return var1;
      } else {
         ൖ var3;
         var3 = new ൖ.<init>();

         IInterface var2;
         do {
            if (!var3.Ԩ()) {
               Intrinsics.checkNotNull((Object)null);
               throw new KotlinNothingValueException();
            }

            ࢺ.Ϳ.ԩ();
         } while((var2 = this.Ϳ) == null);

         return var2;
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull T var1) {
      this.Ϳ = var1;
   }

   @Nullable
   public final Object _/* $FF was: Ԫ*/() {
      return ࢺ.Ϳ.Ϳ();
   }
}
