package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.ConditionVariable;
import android.os.IBinder;
import java.util.HashSet;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ˈ extends ൔ {
   public int Ԭ;
   @Nullable
   public ຓ ԭ;
   @NotNull
   public final HashSet<IBinder> Ԯ;
   @NotNull
   public final int[] ԯ;
   @NotNull
   public final int[] ՠ;
   @Nullable
   public Pair<? extends Intent, ? extends ActivityInfo> ֈ;
   public boolean ֏;
   @NotNull
   public final ConditionVariable ׯ;
   public int ؠ;

   public ˈ(@NotNull String var1, @NotNull String var2, @NotNull String var3, int var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
      HashSet var7;
      var7 = new HashSet.<init>();
      this.Ԯ = var7;
      int var8 = 0;

      int[] var9;
      for(var9 = new int[5]; var8 < 5; ++var8) {
         var9[var8] = 0;
      }

      this.ԯ = var9;
      var8 = 0;

      for(var9 = new int[5]; var8 < 5; ++var8) {
         var9[var8] = 0;
      }

      this.ՠ = var9;
      this.֏ = true;
      ConditionVariable var6;
      var6 = new ConditionVariable.<init>(false);
      this.ׯ = var6;
   }

   public final int _/* $FF was: ԯ*/() {
      return this.Ԭ;
   }

   public final void _/* $FF was: Ϳ*/(int var1) {
      this.Ԭ = var1;
   }

   @Nullable
   public final ຓ _/* $FF was: Ԭ*/() {
      return this.ԭ;
   }

   public final void _/* $FF was: Ϳ*/(@Nullable ຓ var1) {
      this.ԭ = var1;
   }

   @NotNull
   public final HashSet<IBinder> _/* $FF was: ԭ*/() {
      return this.Ԯ;
   }

   public final int _/* $FF was: Ϳ*/(int var1, @NotNull int[] var2) {
      int var4 = 0;

      for(int var3 = var2.length; var4 < var3; ++var4) {
         if (var2[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public final int _/* $FF was: Ϳ*/(@NotNull int[] var1) {
      int var3 = 0;

      for(int var2 = var1.length; var3 < var2; ++var3) {
         if (var1[var3] == 0) {
            return var3;
         }
      }

      return -1;
   }

   @NotNull
   public final int[] _/* $FF was: ׯ*/() {
      return this.ԯ;
   }

   @NotNull
   public final int[] ؠ() {
      return this.ՠ;
   }

   @Nullable
   public final Pair<Intent, ActivityInfo> _/* $FF was: Ԯ*/() {
      return this.ֈ;
   }

   public final void _/* $FF was: Ϳ*/(@Nullable Pair<? extends Intent, ? extends ActivityInfo> var1) {
      this.ֈ = var1;
   }

   public final boolean _/* $FF was: ֈ*/() {
      return this.֏;
   }

   public final void _/* $FF was: Ϳ*/(boolean var1) {
      this.֏ = var1;
   }

   @NotNull
   public final ConditionVariable _/* $FF was: ՠ*/() {
      return this.ׯ;
   }

   public final int ֏() {
      return this.ؠ;
   }

   public final void _/* $FF was: Ԩ*/(int var1) {
      this.ؠ = var1;
   }
}
