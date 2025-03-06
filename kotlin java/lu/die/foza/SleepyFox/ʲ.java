package lu.die.foza.SleepyFox;

import android.accounts.Account;
import java.util.Objects;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ʲ {
   @JvmField
   public final int Ϳ;
   @JvmField
   @NotNull
   public final Account Ԩ;
   @JvmField
   @NotNull
   public final String ԩ;
   @JvmField
   @NotNull
   public final String Ԫ;
   @JvmField
   @NotNull
   public final String ԫ;
   @JvmField
   public final long Ԭ;

   public ʲ(int var1, @NotNull Account var2, @NotNull String var3, @NotNull String var4, @NotNull String var5, long var6) {
      this.Ϳ = var1;
      this.Ԩ = var2;
      this.ԩ = var3;
      this.Ԫ = var4;
      this.ԫ = var5;
      this.Ԭ = var6;
   }

   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ʲ)) {
         return false;
      } else {
         ʲ var2;
         return this.Ϳ == (var2 = (ʲ)var1).Ϳ && this.Ԭ == var2.Ԭ && Intrinsics.areEqual(this.Ԩ, var2.Ԩ) && Intrinsics.areEqual(this.ԫ, var2.ԫ) && Intrinsics.areEqual(this.Ԫ, var2.Ԫ) && Intrinsics.areEqual(this.ԩ, var2.ԩ);
      }
   }

   public int hashCode() {
      Object[] var1;
      Object[] var10000 = var1 = new Object[6];
      var1[0] = this.Ϳ;
      var1[1] = this.Ԩ;
      var1[2] = this.Ԭ;
      var1[3] = this.ԫ;
      var1[4] = this.Ԫ;
      var10000[5] = this.ԩ;
      return Objects.hash(var10000);
   }
}
