package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࣁ implements Parcelable {
   @NotNull
   public static final ࣁ.Ϳ CREATOR = new ࣁ.Ϳ();
   @Nullable
   public String Ϳ;
   @Nullable
   public String Ԩ;
   @Nullable
   public String ԩ;
   public long Ԫ;

   public _/* $FF was: ࣁ*/() {
      this.Ϳ = "";
      this.Ԩ = "";
      this.ԩ = "";
   }

   public _/* $FF was: ࣁ*/(@NotNull Parcel var1) {
      this();
      this.Ϳ = var1.readString();
      this.Ԩ = var1.readString();
      this.ԩ = var1.readString();
      this.Ԫ = var1.readLong();
   }

   @Nullable
   public final String _/* $FF was: Ԫ*/() {
      return this.Ϳ;
   }

   public final void _/* $FF was: ԩ*/(@Nullable String var1) {
      this.Ϳ = var1;
   }

   @Nullable
   public final String _/* $FF was: ԩ*/() {
      return this.Ԩ;
   }

   public final void _/* $FF was: Ԩ*/(@Nullable String var1) {
      this.Ԩ = var1;
   }

   @Nullable
   public final String _/* $FF was: Ԩ*/() {
      return this.ԩ;
   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1) {
      this.ԩ = var1;
   }

   public final long _/* $FF was: Ϳ*/() {
      return this.Ԫ;
   }

   public final void _/* $FF was: Ϳ*/(long var1) {
      this.Ԫ = var1;
   }

   public void writeToParcel(@NotNull Parcel var1, int var2) {
      var1.writeString(this.Ϳ);
      var1.writeString(this.Ԩ);
      var1.writeString(this.ԩ);
      var1.writeLong(this.Ԫ);
   }

   public int describeContents() {
      return 0;
   }

   public static final class Ϳ implements Creator<ࣁ> {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public ࣁ _/* $FF was: Ϳ*/(@NotNull Parcel var1) {
         return new ࣁ(var1);
      }

      @NotNull
      public ࣁ[] _/* $FF was: Ϳ*/(int var1) {
         return new ࣁ[var1];
      }

      public Object createFromParcel(Parcel var1) {
         return new ࣁ(var1);
      }

      public Object[] newArray(int var1) {
         return new ࣁ[var1];
      }
   }
}
