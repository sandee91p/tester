package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ႁ {
   @NotNull
   public static final ႁ Ϳ = new ႁ();

   @Nullable
   public final <T> T _/* $FF was: Ϳ*/(@NotNull Parcelable var1) {
      Parcel var8 = null;

      Parcelable var11;
      label86: {
         Throwable var10000;
         label87: {
            boolean var10001;
            Parcel var10;
            try {
               var10 = Parcel.obtain();
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break label87;
            }

            var8 = var10;

            label77:
            try {
               var8.writeParcelable(var1, 0);
               var8.setDataPosition(0);
               var11 = var10.readParcelable(var1.getClass().getClassLoader());
               break label86;
            } catch (Throwable var6) {
               var10000 = var6;
               var10001 = false;
               break label77;
            }
         }

         Throwable var9 = var10000;
         if (var8 != null) {
            var8.recycle();
         }

         throw var9;
      }

      var8.recycle();
      return var11;
   }

   @Nullable
   public final byte[] _/* $FF was: Ϳ*/(@NotNull Function2<? super Parcel, ? super Integer, Unit> param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final byte[] _/* $FF was: Ԩ*/(@NotNull Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final <T extends Parcelable> T _/* $FF was: Ϳ*/(@NotNull byte[] param1, @NotNull Function1<? super Parcel, ? extends T> param2) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final <T extends Parcelable> T _/* $FF was: Ϳ*/(@Nullable byte[] param1, @NotNull Class<?> param2) {
      // $FF: Couldn't be decompiled
   }
}
