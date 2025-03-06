package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࣄ implements Parcelable {
   @NotNull
   public static final ࣄ.Ԩ Ԯ = new ࣄ.Ԩ();
   @NotNull
   public static final ࣄ ԯ = new ࣄ();
   @JvmField
   @NotNull
   public static final Creator<ࣄ> CREATOR = new Creator<ࣄ>() {
      public ࣄ _/* $FF was: Ϳ*/(Parcel var1) {
         return new ࣄ(var1);
      }

      public ࣄ[] _/* $FF was: Ϳ*/(int var1) {
         return new ࣄ[var1];
      }

      public Object createFromParcel(Parcel var1) {
         return new ࣄ(var1);
      }

      public Object[] newArray(int var1) {
         return new ࣄ[var1];
      }
   };
   public boolean Ϳ;
   public boolean Ԩ;
   public boolean ԩ;
   public boolean Ԫ;
   public boolean ԫ;
   @Nullable
   public String Ԭ;
   public boolean ԭ;

   public _/* $FF was: ࣄ*/() {
   }

   public _/* $FF was: ࣄ*/(@NotNull Parcel var1) {
      this();
      boolean var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.Ϳ = var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.Ԩ = var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.ԩ = var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.Ԫ = var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.ԫ = var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.ԭ = var2;
      this.Ԭ = var1.readString();
   }

   public final boolean _/* $FF was: Ԫ*/() {
      return this.Ϳ;
   }

   public final void _/* $FF was: ԩ*/(boolean var1) {
      this.Ϳ = var1;
   }

   public final boolean _/* $FF was: Ԭ*/() {
      return this.Ԩ;
   }

   public final void _/* $FF was: ԫ*/(boolean var1) {
      this.Ԩ = var1;
   }

   public final boolean _/* $FF was: ԫ*/() {
      return this.ԩ;
   }

   public final void _/* $FF was: Ԫ*/(boolean var1) {
      this.ԩ = var1;
   }

   public final boolean _/* $FF was: ԩ*/() {
      return this.Ԫ;
   }

   public final void _/* $FF was: Ԩ*/(boolean var1) {
      this.Ԫ = var1;
   }

   public final boolean _/* $FF was: Ԩ*/() {
      return this.ԫ;
   }

   public final void _/* $FF was: Ϳ*/(boolean var1) {
      this.ԫ = var1;
   }

   @Nullable
   public final String _/* $FF was: Ԯ*/() {
      return this.Ԭ;
   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1) {
      this.Ԭ = var1;
   }

   public final boolean _/* $FF was: ԭ*/() {
      return this.ԭ;
   }

   public final void _/* $FF was: Ԭ*/(boolean var1) {
      this.ԭ = var1;
   }

   public void writeToParcel(@NotNull Parcel var1, int var2) {
      var1.writeByte(this.Ϳ);
      var1.writeByte(this.Ԩ);
      var1.writeByte(this.ԩ);
      var1.writeByte(this.Ԫ);
      var1.writeByte(this.ԫ);
      var1.writeByte(this.ԭ);
      var1.writeString(this.Ԭ);
   }

   public int describeContents() {
      return 0;
   }

   public static final class Ԩ {
      public _/* $FF was: Ԩ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ԩ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ࣄ _/* $FF was: Ϳ*/() {
         return ࣄ.ԯ;
      }
   }
}
