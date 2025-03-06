package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFozaAccountsRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaAccountsRegion.kt\nlu/die/foza/Framework/Impl/FozaAccountsRegion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,118:1\n37#2,2:119\n37#2,2:121\n*S KotlinDebug\n*F\n+ 1 FozaAccountsRegion.kt\nlu/die/foza/Framework/Impl/FozaAccountsRegion\n*L\n20#1:119,2\n67#1:121,2\n*E\n"})
public final class ࢠ implements Parcelable {
   @NotNull
   public static final ࢠ.Ϳ CREATOR = new ࢠ.Ϳ();
   @JvmField
   @NotNull
   public final Object Ϳ;
   @JvmField
   public int Ԩ;
   @JvmField
   @NotNull
   public final List<ഺ> ԩ;

   public ࢠ() {
      ࢠ var10000 = this;
      ࢠ var10001 = this;
      super();
      Object var1;
      var1 = new Object.<init>();
      var10001.Ϳ = var1;
      ArrayList var2;
      var2 = new ArrayList.<init>();
      var10000.ԩ = var2;
   }

   public ࢠ(Parcel var1) {
      this.Ϳ = new Object();
      this.Ԩ = var1.readInt();
      int var2 = var1.readInt();
      ArrayList var3;
      var3 = new ArrayList.<init>(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         var3.add(ഺ.CREATOR.Ϳ(var1));
      }

      this.ԩ = var3;
   }

   // $FF: synthetic method
   public ࢠ(Parcel var1, DefaultConstructorMarker var2) {
      this(var1);
   }

   @NotNull
   public final Account[] _/* $FF was: Ϳ*/() {
      ࢠ var10000 = this;
      ArrayList var3;
      var3 = new ArrayList.<init>();
      Iterator var1 = var10000.ԩ.iterator();

      while(var1.hasNext()) {
         Account var2;
         if ((var2 = ((ഺ)var1.next()).Ϳ) != null) {
            var3.add(var2);
         }
      }

      return (Account[])var3.toArray(new Account[0]);
   }

   @NotNull
   public final ഺ _/* $FF was: Ϳ*/(@NotNull Account var1) {
      ഺ var2;
      ഺ var10000 = var2 = new ഺ;
      var2.<init>();
      var2.Ϳ = var1;
      this.ԩ.add(var2);
      return var10000;
   }

   @Nullable
   public final ഺ _/* $FF was: Ԫ*/(@NotNull Account var1) {
      Iterator var3 = this.ԩ.iterator();

      ഺ var2;
      do {
         if (!var3.hasNext()) {
            return null;
         }
      } while(!(var2 = (ഺ)var3.next()).Ϳ(var1));

      return var2;
   }

   public final boolean _/* $FF was: Ԩ*/(@NotNull Account var1) {
      ࢠ var10000 = this;
      ഺ var2 = this.Ԫ(var1);
      return TypeIntrinsics.asMutableCollection(var10000.ԩ).remove(var2);
   }

   @NotNull
   public final Map<String, Integer> _/* $FF was: ԭ*/(@NotNull Account var1) {
      ഺ var2;
      return (var2 = this.Ԫ(var1)) == null ? new HashMap() : var2.Ԫ;
   }

   @NotNull
   public final Map<String, String> _/* $FF was: ԫ*/(@NotNull Account var1) {
      ഺ var2;
      return (var2 = this.Ԫ(var1)) == null ? new HashMap() : var2.ԩ;
   }

   @NotNull
   public final Map<String, String> _/* $FF was: Ԭ*/(@NotNull Account var1) {
      ഺ var2;
      return (var2 = this.Ԫ(var1)) == null ? new HashMap() : var2.ԫ;
   }

   @NotNull
   public final Account[] _/* $FF was: Ϳ*/(@NotNull String var1) {
      ࢠ var10000 = this;
      ArrayList var5;
      var5 = new ArrayList.<init>();
      Iterator var2 = var10000.ԩ.iterator();

      while(var2.hasNext()) {
         Account var3;
         if (Intrinsics.areEqual((var3 = ((ഺ)var2.next()).Ϳ) != null ? var3.type : null, var1)) {
            var5.add(var3);
         }
      }

      return (Account[])var5.toArray(new Account[0]);
   }

   public final void _/* $FF was: Ԯ*/(@NotNull Account var1) {
      ഺ var2;
      if ((var2 = this.Ԫ(var1)) != null) {
         var2.Ԭ = System.currentTimeMillis();
      }

   }

   public final long _/* $FF was: ԩ*/(@NotNull Account var1) {
      ഺ var2;
      long var3;
      if ((var2 = this.Ԫ(var1)) != null) {
         var3 = var2.Ԭ;
      } else {
         var3 = -1L;
      }

      return var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(@NotNull Parcel var1, int var2) {
      var1.writeInt(this.Ԩ);
      var1.writeInt(this.ԩ.size());
      Iterator var3 = this.ԩ.iterator();

      while(var3.hasNext()) {
         ((ഺ)var3.next()).writeToParcel(var1, 0);
      }

   }

   public static final class Ϳ implements Creator<ࢠ> {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public ࢠ _/* $FF was: Ϳ*/(@NotNull Parcel var1) {
         return new ࢠ(var1);
      }

      @NotNull
      public ࢠ[] _/* $FF was: Ϳ*/(int var1) {
         return new ࢠ[var1];
      }

      public Object createFromParcel(Parcel var1) {
         return new ࢠ(var1);
      }

      public Object[] newArray(int var1) {
         return new ࢠ[var1];
      }
   }
}
