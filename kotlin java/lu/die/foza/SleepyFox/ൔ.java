package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class ൔ implements Parcelable {
   @NotNull
   public static final ൔ.Ϳ CREATOR = new ൔ.Ϳ();
   public final int Ϳ;
   @NotNull
   public final String Ԩ;
   @NotNull
   public final String ԩ;
   @NotNull
   public final String Ԫ;
   public final boolean ԫ;

   public _/* $FF was: ൔ*/(@NotNull String var1, @NotNull String var2, @NotNull String var3, int var4, boolean var5) {
      this.ԩ = var1;
      this.Ԩ = var3;
      this.Ϳ = var4;
      this.ԫ = var5;
      this.Ԫ = var2;
   }

   public _/* $FF was: ൔ*/(@NotNull Parcel var1) {
      this.Ϳ = var1.readInt();
      String var10004 = var1.readString();
      Intrinsics.checkNotNull(var10004);
      this.Ԩ = var10004;
      String var2;
      String var10002 = var2 = var1.readString();
      Intrinsics.checkNotNull(var10002);
      this.ԩ = var10002;
      String var3;
      if ((var3 = var1.readString()) != null) {
         var2 = var3;
      }

      this.Ԫ = var2;
      boolean var4;
      if (var1.readByte() != 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.ԫ = var4;
   }

   public final int _/* $FF was: ԩ*/() {
      return this.Ϳ;
   }

   @NotNull
   public final String _/* $FF was: ԫ*/() {
      return this.Ԩ;
   }

   @NotNull
   public final String _/* $FF was: Ԩ*/() {
      return this.ԩ;
   }

   @NotNull
   public final String _/* $FF was: Ԫ*/() {
      return this.Ԫ;
   }

   public final boolean _/* $FF was: Ϳ*/() {
      return this.ԫ;
   }

   public void writeToParcel(@NotNull Parcel var1, int var2) {
      var1.writeInt(this.Ϳ);
      var1.writeString(this.Ԩ);
      var1.writeString(this.ԩ);
      var1.writeString(this.Ԫ);
      var1.writeByte(this.ԫ);
   }

   public int describeContents() {
      return 0;
   }

   public static final class Ϳ implements Creator<ൔ> {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public ൔ _/* $FF was: Ϳ*/(@NotNull Parcel var1) {
         return new ൔ(var1);
      }

      @NotNull
      public ൔ[] _/* $FF was: Ϳ*/(int var1) {
         return new ൔ[var1];
      }

      public Object createFromParcel(Parcel var1) {
         return new ൔ(var1);
      }

      public Object[] newArray(int var1) {
         return new ൔ[var1];
      }
   }
}
