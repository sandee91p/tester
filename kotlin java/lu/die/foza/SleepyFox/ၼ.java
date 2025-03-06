package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ၼ extends ࢯ {
   @NotNull
   public static final ၼ.Ϳ ՠ = new ၼ.Ϳ();
   @NotNull
   public static final ၼ ֈ = new ၼ();
   @Nullable
   public static IBinder ֏;
   @NotNull
   public final ૹ<Intent> ԯ;

   public ၼ() {
      ၼ var10000 = this;
      super();
      ૹ var1;
      var1 = new ૹ.<init>("intent");
      var10000.ԯ = var1;
   }

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ param1) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ˁ var1) {
      try {
         var1.Ϳ((String)"onBackPressedOnTaskRoot", (ໞ)this);
      } catch (Exception var2) {
      }

   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ၼ _/* $FF was: Ԩ*/() {
         return ၼ.ֈ;
      }

      @Nullable
      public final IBinder _/* $FF was: Ϳ*/() {
         return ၼ.֏;
      }

      public final void _/* $FF was: Ϳ*/(@Nullable IBinder var1) {
         ၼ.֏ = var1;
      }
   }
}
