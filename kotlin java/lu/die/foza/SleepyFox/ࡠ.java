package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDiscoveryPackageObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryPackageObserver.kt\nlu/die/foza/Framework/Discover/DiscoveryPackageObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,575:1\n1#2:576\n*E\n"})
public final class ࡠ extends Ԩ<ຬ> {
   @NotNull
   public static final ࡠ.Ϳ ԩ = new ࡠ.Ϳ();
   @NotNull
   public static final ࡠ Ԫ = new ࡠ();
   @NotNull
   public final String Ԩ = ʻ.class.getName();

   // $FF: synthetic method
   public static ActivityInfo _/* $FF was: Ϳ*/(ࡠ var0, ComponentName var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return var0.Ϳ(var1, var2);
   }

   // $FF: synthetic method
   public static List _/* $FF was: Ԩ*/(ࡠ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.Ԩ(var1, var2, var3);
   }

   // $FF: synthetic method
   public static List _/* $FF was: Ϳ*/(ࡠ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.Ϳ(var1, var2, var3);
   }

   // $FF: synthetic method
   public static List _/* $FF was: Ԫ*/(ࡠ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.Ԫ(var1, var2, var3);
   }

   // $FF: synthetic method
   public static List _/* $FF was: ԩ*/(ࡠ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.ԩ(var1, var2, var3);
   }

   @JvmStatic
   @NotNull
   public static final ࡠ _/* $FF was: ԭ*/() {
      ԩ.getClass();
      return ԫ();
   }

   @NotNull
   public String _/* $FF was: Ϳ*/() {
      return this.Ԩ;
   }

   public void _/* $FF was: Ϳ*/(@NotNull IBinder var1) {
      lu.die.foza.SleepyFox.Ԩ.Ϳ(this, var1, null.INSTANCE, (Function0)null, 4, (Object)null);
   }

   @Nullable
   public final List<PackageInfo> _/* $FF was: Ϳ*/(@Nullable List<? extends PackageInfo> var1, int var2) {
      label53: {
         List var10000;
         boolean var10001;
         List var11;
         try {
            var10000 = var1;
            var11 = ((ຬ)this.Ԩ()).Ϳ(var2);
         } catch (Exception var8) {
            var10001 = false;
            break label53;
         }

         List var9 = var11;

         ArrayList var12;
         try {
            var12 = new ArrayList;
         } catch (Exception var7) {
            var10001 = false;
            break label53;
         }

         ArrayList var10 = var12;
         List var3;
         if (var10000 != null) {
            var3 = var1;
         } else {
            try {
               var10000 = CollectionsKt.emptyList();
            } catch (Exception var6) {
               var10001 = false;
               break label53;
            }

            var3 = var10000;
         }

         try {
            var10000 = var9;
            var10.<init>(var3);
         } catch (Exception var5) {
            var10001 = false;
            break label53;
         }

         if (var10000 == null) {
            return var10;
         }

         try {
            var10.addAll(var9);
            return var10;
         } catch (Exception var4) {
            var10001 = false;
         }
      }

      ࢺ.Ϳ.Ϳ();
      return var1;
   }

   @Nullable
   public final ActivityInfo _/* $FF was: Ϳ*/(@NotNull Intent var1) {
      try {
         return ((ຬ)this.Ԩ()).Ԩ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final ServiceInfo _/* $FF was: Ԩ*/(@NotNull Intent var1) {
      try {
         return ((ຬ)this.Ԩ()).Ϳ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   public final int _/* $FF was: ԭ*/(@Nullable String var1) {
      try {
         return ((ຬ)this.Ԩ()).ԭ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return -6;
      }
   }

   public final int _/* $FF was: Ԭ*/(@Nullable String var1) {
      try {
         return ((ຬ)this.Ԩ()).ԫ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return -6;
      }
   }

   public final int _/* $FF was: Ϳ*/(@Nullable String var1, boolean var2) {
      if (var1 == null) {
         return -2;
      } else {
         try {
            return ((ຬ)this.Ԩ()).Ϳ(var1, var2);
         } catch (Exception var3) {
            ࢺ.Ϳ.Ϳ();
            return -6;
         }
      }
   }

   @Nullable
   public final PackageInfo _/* $FF was: Ԩ*/(@Nullable String var1, int var2) {
      try {
         return ((ຬ)this.Ԩ()).ԩ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final ServiceInfo _/* $FF was: Ԫ*/(@Nullable ComponentName var1, int var2) {
      try {
         return ((ຬ)this.Ԩ()).ԩ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final ActivityInfo _/* $FF was: Ϳ*/(@Nullable ComponentName var1, int var2) {
      try {
         return ((ຬ)this.Ԩ()).Ԫ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final ApplicationInfo _/* $FF was: Ϳ*/(@Nullable String var1, int var2) {
      try {
         return ((ຬ)this.Ԩ()).Ԩ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final ProviderInfo _/* $FF was: Ԩ*/(@Nullable ComponentName var1, int var2) {
      try {
         return ((ຬ)this.Ԩ()).Ϳ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final ActivityInfo _/* $FF was: ԩ*/(@Nullable ComponentName var1, int var2) {
      try {
         return ((ຬ)this.Ԩ()).Ԩ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: Ԩ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      try {
         return ((ຬ)this.Ԩ()).ԩ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: Ϳ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      try {
         return ((ຬ)this.Ԩ()).Ԫ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: Ԫ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      try {
         return ((ຬ)this.Ԩ()).Ԩ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: ԩ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      try {
         return ((ຬ)this.Ԩ()).Ϳ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @Nullable
   public final List<PackageInfo> _/* $FF was: Ԯ*/() {
      try {
         return ((ຬ)this.Ԩ()).Ϳ(-1);
      } catch (Exception var1) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   public final void ֏() {
      try {
         ((ຬ)this.Ԩ()).Ϳ();
      } catch (Exception var1) {
         ࢺ.Ϳ.Ϳ();
      }
   }

   @Nullable
   public final String _/* $FF was: Ԩ*/(@Nullable String var1) {
      try {
         return ((ຬ)this.Ԩ()).ՠ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return "Failed.";
      }
   }

   @Nullable
   public final ProviderInfo _/* $FF was: ԩ*/(@NotNull String var1, int var2) {
      try {
         return ((ຬ)this.Ԩ()).Ϳ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   public final boolean _/* $FF was: ԯ*/(@Nullable String var1) {
      if (var1 == null) {
         return false;
      } else {
         try {
            return ((ຬ)this.Ԩ()).Ϳ(var1);
         } catch (Exception var2) {
            ࢺ.Ϳ.Ϳ();
            return false;
         }
      }
   }

   public final int _/* $FF was: Ԫ*/(@NotNull String var1) {
      try {
         return ((ຬ)this.Ԩ()).ֈ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return -1;
      }
   }

   public final boolean _/* $FF was: Ԯ*/(@Nullable String var1) {
      if (var1 == null) {
         return false;
      } else {
         try {
            return ((ຬ)this.Ԩ()).ԩ(var1);
         } catch (Exception var2) {
            ࢺ.Ϳ.Ϳ();
            return false;
         }
      }
   }

   @Nullable
   public final ProviderInfo _/* $FF was: ԩ*/(@Nullable String var1) {
      try {
         return ((ຬ)this.Ԩ()).ԯ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   @NotNull
   public final List<String> _/* $FF was: Ϳ*/(@NotNull String var1, int var2, int var3) {
      label32: {
         List var10000;
         boolean var10001;
         try {
            var10000 = ((ຬ)this.Ԩ()).Ϳ(var1, ރ.Ϳ.Ϳ(var2, var3));
         } catch (Exception var6) {
            var10001 = false;
            break label32;
         }

         Object var7 = var10000;
         if (var10000 != null) {
            return (List)var7;
         }

         ArrayList var8;
         try {
            var8 = new ArrayList;
         } catch (Exception var5) {
            var10001 = false;
            break label32;
         }

         var7 = var8;

         try {
            var8.<init>();
            return (List)var7;
         } catch (Exception var4) {
            var10001 = false;
         }
      }

      ࢺ.Ϳ.Ϳ();
      return new ArrayList();
   }

   public final void _/* $FF was: ԫ*/(@Nullable ComponentName var1, int var2) {
      try {
         ((ຬ)this.Ԩ()).ԫ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final int _/* $FF was: Ϳ*/(@Nullable ComponentName var1) {
      try {
         return ((ຬ)this.Ԩ()).Ϳ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return 0;
      }
   }

   @Nullable
   public final List<ProviderInfo> _/* $FF was: Ϳ*/(@Nullable String var1, int var2, @Nullable String var3) {
      try {
         return ((ຬ)this.Ԩ()).Ϳ(var1, var2, var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
         return null;
      }
   }

   public final void _/* $FF was: ԫ*/(boolean var1) {
   }

   public final void _/* $FF was: Ԭ*/(boolean var1) {
   }

   public final void _/* $FF was: ԯ*/() {
      try {
         ((ຬ)this.Ԩ()).ԯ();
      } catch (Exception var1) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: Ԩ*/(boolean var1) {
   }

   public final void _/* $FF was: Ϳ*/(boolean var1) {
   }

   public final void _/* $FF was: ֈ*/(@Nullable String var1) {
   }

   public final void _/* $FF was: Ԫ*/(boolean var1) {
   }

   public final void _/* $FF was: Ԭ*/() {
      try {
         ((ຬ)this.Ԩ()).Ԩ();
      } catch (Exception var1) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1) {
      try {
         ((ຬ)this.Ԩ()).Ԭ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: ԩ*/(boolean var1) {
   }

   @NotNull
   public final String _/* $FF was: ԩ*/(@NotNull String var1, @NotNull String var2) {
      try {
         return ((ຬ)this.Ԩ()).ԫ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
         return ࢪ.֏.Ϳ();
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      try {
         ((ຬ)this.Ԩ()).Ԩ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   @NotNull
   public final String[] _/* $FF was: ԫ*/(@NotNull String var1) {
      try {
         return ((ຬ)this.Ԩ()).Ԯ(var1);
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
         return new String[]{ࢪ.֏.Ϳ()};
      }
   }

   public final void _/* $FF was: Ԩ*/(@NotNull String var1, @NotNull String var2) {
      try {
         ((ຬ)this.Ԩ()).Ԫ(var1, var2);
      } catch (Exception var3) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: ՠ*/() {
      try {
         ((ຬ)this.Ԩ()).Ԩ(0);
      } catch (Exception var1) {
      }

   }

   public final void _/* $FF was: ֈ*/() {
      try {
         ((ຬ)this.Ԩ()).Ԩ(1);
      } catch (Exception var1) {
      }

   }

   public final boolean _/* $FF was: ՠ*/(@NotNull String var1) {
      try {
         return ((ຬ)this.Ԩ()).Ԩ(var1);
      } catch (Exception var2) {
         return false;
      }
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @JvmStatic
      @NotNull
      public final ࡠ _/* $FF was: Ϳ*/() {
         return ࡠ.Ԫ;
      }
   }
}
