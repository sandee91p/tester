package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ഺ implements Parcelable {
   @NotNull
   public static final ഺ.Ϳ CREATOR = new ഺ.Ϳ();
   @JvmField
   @Nullable
   public Account Ϳ;
   @JvmField
   @Nullable
   public String Ԩ;
   @JvmField
   @NotNull
   public final HashMap<String, String> ԩ;
   @JvmField
   @NotNull
   public final HashMap<String, Integer> Ԫ;
   @JvmField
   @NotNull
   public final HashMap<String, String> ԫ;
   public long Ԭ;

   public ഺ() {
      ഺ var10000 = this;
      ഺ var10001 = this;
      ഺ var10002 = this;
      super();
      LinkedHashMap var1;
      var1 = new LinkedHashMap.<init>();
      var10002.ԩ = var1;
      var1 = new LinkedHashMap.<init>();
      var10001.Ԫ = var1;
      var1 = new LinkedHashMap.<init>();
      var10000.ԫ = var1;
   }

   public ഺ(Parcel var1) {
      this.Ϳ = (Account)var1.readParcelable(Account.class.getClassLoader());
      this.Ԩ = var1.readString();
      Serializable var2;
      Object var3;
      if ((var2 = var1.readSerializable()) instanceof HashMap) {
         var3 = (HashMap)var2;
      } else {
         var3 = null;
      }

      if (var3 == null) {
         var3 = new LinkedHashMap.<init>();
      }

      this.ԩ = (HashMap)var3;
      if ((var2 = var1.readSerializable()) instanceof HashMap) {
         var3 = (HashMap)var2;
      } else {
         var3 = null;
      }

      if (var3 == null) {
         var3 = new LinkedHashMap.<init>();
      }

      this.Ԫ = (HashMap)var3;
      if ((var2 = var1.readSerializable()) instanceof HashMap) {
         var3 = (HashMap)var2;
      } else {
         var3 = null;
      }

      if (var3 == null) {
         var3 = new LinkedHashMap.<init>();
      }

      this.ԫ = (HashMap)var3;
      this.Ԭ = var1.readLong();
   }

   // $FF: synthetic method
   public ഺ(Parcel var1, DefaultConstructorMarker var2) {
      this(var1);
   }

   public final long _/* $FF was: Ϳ*/() {
      return this.Ԭ;
   }

   public final void _/* $FF was: Ϳ*/(long var1) {
      this.Ԭ = var1;
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable Account var1) {
      return var1 == null ? false : Intrinsics.areEqual(var1, this.Ϳ);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      this.ԩ.put(var1, var2);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(@NotNull Parcel var1, int var2) {
      var1.writeParcelable(this.Ϳ, var2);
      var1.writeString(this.Ԩ);
      var1.writeSerializable(this.ԩ);
      var1.writeSerializable(this.Ԫ);
      var1.writeSerializable(this.ԫ);
      var1.writeLong(this.Ԭ);
   }

   public static final class Ϳ implements Creator<ഺ> {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public ഺ _/* $FF was: Ϳ*/(@NotNull Parcel var1) {
         return new ഺ(var1);
      }

      @NotNull
      public ഺ[] _/* $FF was: Ϳ*/(int var1) {
         return new ഺ[var1];
      }

      public Object createFromParcel(Parcel var1) {
         return new ഺ(var1);
      }

      public Object[] newArray(int var1) {
         return new ഺ[var1];
      }
   }
}
