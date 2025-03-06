package lu.die.foza.SleepyFox;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢶ implements Parcelable {
   @NotNull
   public static final ࢶ.Ϳ CREATOR = new ࢶ.Ϳ();
   @NotNull
   public final PackageInfo Ϳ;
   public boolean Ԩ;
   @Nullable
   public ࢮ.Ԩ ԩ;
   @NotNull
   public ࡨ Ԫ;
   @NotNull
   public final ޅ<String> ԫ;

   public _/* $FF was: ࢶ*/(@NotNull PackageInfo var1) {
      this.Ϳ = var1;
      this.Ԫ = ࡨ.Ԩ;
      this.ԫ = new ޅ(1);
   }

   public _/* $FF was: ࢶ*/(@NotNull Parcel var1) {
      Parcelable var10004 = var1.readParcelable(PackageInfo.class.getClassLoader());
      Intrinsics.checkNotNull(var10004);
      this((PackageInfo)var10004);
      var1.readString();
      var1.readByte();
      boolean var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.Ԩ = var2;
   }

   @NotNull
   public final PackageInfo _/* $FF was: Ԫ*/() {
      return this.Ϳ;
   }

   public final boolean _/* $FF was: ԫ*/() {
      return this.Ԩ;
   }

   public final void _/* $FF was: Ϳ*/(boolean var1) {
      this.Ԩ = var1;
   }

   @Nullable
   public final ࢮ.Ԩ _/* $FF was: Ԩ*/() {
      return this.ԩ;
   }

   public final void _/* $FF was: Ϳ*/(@Nullable ࢮ.Ԩ var1) {
      this.ԩ = var1;
   }

   @NotNull
   public final ࡨ _/* $FF was: Ϳ*/() {
      return this.Ԫ;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ࡨ var1) {
      this.Ԫ = var1;
   }

   @NotNull
   public final ޅ<String> _/* $FF was: ԩ*/() {
      return this.ԫ;
   }

   public void writeToParcel(@NotNull Parcel var1, int var2) {
      var1.writeParcelable(this.Ϳ, var2);
      var1.writeString((String)null);
      var1.writeByte((byte)0);
      var1.writeByte(this.Ԩ);
   }

   public int describeContents() {
      return 0;
   }

   public static final class Ϳ implements Creator<ࢶ> {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public ࢶ _/* $FF was: Ϳ*/(@NotNull Parcel var1) {
         return new ࢶ(var1);
      }

      @NotNull
      public ࢶ[] _/* $FF was: Ϳ*/(int var1) {
         return new ࢶ[var1];
      }

      public Object createFromParcel(Parcel var1) {
         return new ࢶ(var1);
      }

      public Object[] newArray(int var1) {
         return new ࢶ[var1];
      }
   }
}
