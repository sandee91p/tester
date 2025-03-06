package lu.die.foza.SleepyFox;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFozaAppRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaAppRouter.kt\nlu/die/foza/FoxDev/ThirdParty/FozaAppRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class ࢦ {
   @NotNull
   public static final ࢦ Ϳ = new ࢦ();
   public static int Ԩ;
   public static boolean ԩ;
   @NotNull
   public static String Ԫ = "";
   @NotNull
   public static String ԫ = "";
   @Nullable
   public static ൔ Ԭ;
   @NotNull
   public static ࣄ ԭ;
   public static final String Ԯ;
   public static final int ԯ;
   public static final int ՠ;
   @NotNull
   public static final String[] ֈ;

   @JvmStatic
   @NotNull
   public static final Context _/* $FF was: ֈ*/() {
      return ࢺ.Ԫ();
   }

   @JvmStatic
   public static final void ޅ() {
      ࢺ.Ϳ.ؠ();
   }

   static {
      ࣄ.Ԯ.getClass();
      ԭ = ࣄ.Ϳ();
      Ԯ = ࢺ.Ԫ().getPackageName();
      ՠ = (ԯ = Process.myUid()) / 100000;
      ֈ = new String[]{"com.rekoo.pubgm", "com.pubg.krmobile", "com.vng.pubgmobile", "com.pubg.imobile", "com.tencent.ig"};
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ൔ var1) {
      ԩ = var1.Ϳ();
      Ԩ = var1.ԩ();
      Ԫ = var1.ԫ();
      ԫ = ˉ.ԩ(var1.Ԩ(), var1.ԫ());
      Ԭ = var1;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ࣄ var1) {
      ԭ = var1;
   }

   @NotNull
   public final Object ބ() {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final String _/* $FF was: ԫ*/() {
      return ԫ;
   }

   public final boolean ރ() {
      return Ԭ != null;
   }

   @NotNull
   public final ContentResolver _/* $FF was: ԭ*/() {
      return ࢺ.Ԫ().getContentResolver();
   }

   @NotNull
   public final String ֏() {
      return Ԯ;
   }

   @Nullable
   public final ൔ _/* $FF was: Ԩ*/() {
      return Ԭ;
   }

   @NotNull
   public final String _/* $FF was: Ԯ*/() {
      return Ԫ;
   }

   @Nullable
   public final String _/* $FF was: ԩ*/() {
      ൔ var1;
      return (var1 = Ԭ) != null ? var1.Ԩ() : null;
   }

   @Nullable
   public final String _/* $FF was: Ԫ*/() {
      ൔ var1;
      return (var1 = Ԭ) != null ? var1.Ԫ() : null;
   }

   public final int ހ() {
      return Ԩ;
   }

   public final boolean _/* $FF was: ԩ*/(@Nullable String var1) {
      return Intrinsics.areEqual(this.ԩ(), var1);
   }

   public final int _/* $FF was: Ϳ*/() {
      return Ԩ;
   }

   public final boolean ނ() {
      return ԩ;
   }

   @Nullable
   public final ClassLoader _/* $FF was: Ԭ*/() {
      String var1;
      return (var1 = this.ԩ()) != null ? this.Ԩ(var1) : null;
   }

   @NotNull
   public final ClassLoader _/* $FF was: Ԩ*/(@NotNull String var1) {
      return ࢭ.ֈ.֏(var1).getClassLoader();
   }

   @NotNull
   public final Context _/* $FF was: Ϳ*/(@NotNull String var1) {
      return ࢭ.ֈ.֏(var1);
   }

   public final void _/* $FF was: Ԩ*/(@NotNull Runnable var1) {
      ࢺ.Ϳ.getClass();
      ࢺ.ԩ.execute(var1);
   }

   @NotNull
   public final Future<?> _/* $FF was: ԩ*/(@NotNull Runnable var1) {
      ࢺ.Ϳ.getClass();
      return ࢺ.ԩ.submit(var1);
   }

   @NotNull
   public final <T> Future<T> _/* $FF was: Ϳ*/(@NotNull Callable<T> var1) {
      ࢺ.Ϳ.getClass();
      return ࢺ.ԩ.submit(var1);
   }

   @NotNull
   public final ࢭ _/* $FF was: ԯ*/() {
      return ࢭ.ֈ;
   }

   @NotNull
   public final Object _/* $FF was: Ϳ*/(@NotNull Runnable var1) {
      return ࢺ.Ϳ.Ϳ(this.ԩ(var1));
   }

   @NotNull
   public final ࣄ ؠ() {
      return ԭ;
   }

   public final int ށ() {
      return ԯ;
   }

   public final int _/* $FF was: ׯ*/() {
      return ՠ;
   }

   @NotNull
   public final String[] _/* $FF was: ՠ*/() {
      return ֈ;
   }
}
