package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageParser.Activity;
import android.content.pm.PackageParser.ActivityIntentInfo;
import android.content.pm.PackageParser.IntentInfo;
import android.content.pm.PackageParser.Package;
import android.content.pm.PackageParser.Provider;
import android.content.pm.PackageParser.ProviderIntentInfo;
import android.content.pm.PackageParser.Service;
import android.content.pm.PackageParser.ServiceIntentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢮ {
   @NotNull
   public static final ࢮ Ϳ = new ࢮ();

   // $FF: synthetic method
   public static final ResolveInfo _/* $FF was: Ϳ*/(ࢮ var0, IntentInfo var1, int var2, int var3) {
      return var0.Ϳ(var1, var2, var3);
   }

   public final ResolveInfo _/* $FF was: Ϳ*/(IntentInfo var1, int var2, int var3) {
      ResolveInfo var4;
      var4 = new ResolveInfo.<init>();
      if ((var2 & 64) != 0) {
         var4.filter = var1;
      }

      var4.priority = var1.getPriority();
      var4.preferredOrder = 0;
      var4.match = var3;
      var4.isDefault = var1.hasDefault;
      var4.labelRes = var1.labelRes;
      var4.nonLocalizedLabel = var1.nonLocalizedLabel;
      var4.icon = var1.icon;
      return var4;
   }

   @SourceDebugExtension({"SMAP\nFozaDxIntentResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaActivityResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaActivityResolver\n*L\n111#1:176,2\n115#1:178,2\n*E\n"})
   public static final class Ϳ extends ဢ<ActivityIntentInfo> {
      public _/* $FF was: Ϳ*/(@Nullable Iterable<Activity> var1) {
         if (var1 != null) {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               this.Ϳ((Activity)var2.next());
            }
         }

      }

      @NotNull
      public ActivityIntentInfo[] _/* $FF was: Ԩ*/(int var1) {
         return new ActivityIntentInfo[var1];
      }

      public void _/* $FF was: Ϳ*/(@NotNull ActivityIntentInfo var1, int var2, int var3, @NotNull List<ResolveInfo> var4, @NotNull ʹ var5) {
         ActivityInfo var6;
         if ((var6 = var1.activity.info).enabled || (var3 & 512) != 0) {
            if (var5.ԩ(var6.name.hashCode())) {
               ResolveInfo var10001 = ࢮ.Ϳ.Ϳ(var1, var3, var2);
               var10001.activityInfo = var6;
               var4.add(var10001);
            }
         }
      }

      public IntentFilter[] _/* $FF was: Ϳ*/(int var1) {
         return new ActivityIntentInfo[var1];
      }

      public final void _/* $FF was: Ϳ*/(Activity var1) {
         if (var1.info != null) {
            ArrayList var2;
            if ((var2 = var1.intents) != null) {
               Iterator var3 = var2.iterator();

               while(var3.hasNext()) {
                  this.Ϳ((IntentFilter)((ActivityIntentInfo)var3.next()));
               }
            }

         }
      }
   }

   public static final class Ԩ {
      @NotNull
      public final ࢮ.Ϳ Ϳ;
      @NotNull
      public final ࢮ.Ϳ Ԩ;
      @NotNull
      public final ࢮ.Ԭ ԩ;
      @NotNull
      public final ࢮ.Ԫ Ԫ;

      public _/* $FF was: Ԩ*/(@NotNull Package var1) {
         this.Ϳ = new ࢮ.Ϳ(var1.activities);
         this.Ԩ = new ࢮ.Ϳ(var1.receivers);
         this.ԩ = new ࢮ.Ԭ(var1.services);
         this.Ԫ = new ࢮ.Ԫ(var1.providers);
      }

      @NotNull
      public final List<ResolveInfo> _/* $FF was: Ϳ*/(@NotNull Intent var1, @Nullable String var2, int var3) {
         return this.Ϳ.Ϳ(var1, var2, var3);
      }

      @NotNull
      public final List<ResolveInfo> _/* $FF was: ԩ*/(@NotNull Intent var1, @Nullable String var2, int var3) {
         return this.Ԩ.Ϳ(var1, var2, var3);
      }

      @NotNull
      public final List<ResolveInfo> _/* $FF was: Ԫ*/(@NotNull Intent var1, @Nullable String var2, int var3) {
         return this.ԩ.Ϳ(var1, var2, var3);
      }

      @NotNull
      public final List<ResolveInfo> _/* $FF was: Ԩ*/(@NotNull Intent var1, @Nullable String var2, int var3) {
         return this.Ԫ.Ϳ(var1, var2, var3);
      }
   }

   @SourceDebugExtension({"SMAP\nFozaDxIntentResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaProviderResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaProviderResolver\n*L\n77#1:176,2\n81#1:178,2\n*E\n"})
   public static final class Ԫ extends ဢ<ProviderIntentInfo> {
      public _/* $FF was: Ԫ*/(@Nullable Iterable<Provider> var1) {
         if (var1 != null) {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               this.Ϳ((Provider)var2.next());
            }
         }

      }

      @NotNull
      public ProviderIntentInfo[] _/* $FF was: Ԩ*/(int var1) {
         return new ProviderIntentInfo[var1];
      }

      public void _/* $FF was: Ϳ*/(@NotNull ProviderIntentInfo var1, int var2, int var3, @NotNull List<ResolveInfo> var4, @NotNull ʹ var5) {
         ProviderInfo var6;
         if ((var6 = var1.provider.info).enabled || (var3 & 512) != 0) {
            if (var5.ԩ(var6.name.hashCode())) {
               ResolveInfo var10001 = ࢮ.Ϳ.Ϳ(var1, var3, var2);
               var10001.providerInfo = var6;
               var4.add(var10001);
            }
         }
      }

      public IntentFilter[] _/* $FF was: Ϳ*/(int var1) {
         return new ProviderIntentInfo[var1];
      }

      public final void _/* $FF was: Ϳ*/(Provider var1) {
         if (var1.info != null) {
            ArrayList var2;
            if ((var2 = var1.intents) != null) {
               Iterator var3 = var2.iterator();

               while(var3.hasNext()) {
                  this.Ϳ((IntentFilter)((ProviderIntentInfo)var3.next()));
               }
            }

         }
      }
   }

   @SourceDebugExtension({"SMAP\nFozaDxIntentResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaServiceResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaServiceResolver\n*L\n144#1:176,2\n148#1:178,2\n*E\n"})
   public static final class Ԭ extends ဢ<ServiceIntentInfo> {
      public _/* $FF was: Ԭ*/(@Nullable Iterable<Service> var1) {
         if (var1 != null) {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               this.Ϳ((Service)var2.next());
            }
         }

      }

      @NotNull
      public ServiceIntentInfo[] _/* $FF was: Ԩ*/(int var1) {
         return new ServiceIntentInfo[var1];
      }

      public void _/* $FF was: Ϳ*/(@NotNull ServiceIntentInfo var1, int var2, int var3, @NotNull List<ResolveInfo> var4, @NotNull ʹ var5) {
         ServiceInfo var6;
         if ((var6 = var1.service.info).enabled || (var3 & 512) != 0) {
            if (var5.ԩ(var6.name.hashCode())) {
               ResolveInfo var10001 = ࢮ.Ϳ.Ϳ(var1, var3, var2);
               var10001.serviceInfo = var6;
               var4.add(var10001);
            }
         }
      }

      public IntentFilter[] _/* $FF was: Ϳ*/(int var1) {
         return new ServiceIntentInfo[var1];
      }

      public final void _/* $FF was: Ϳ*/(Service var1) {
         if (var1.info != null) {
            ArrayList var2;
            if ((var2 = var1.intents) != null) {
               Iterator var3 = var2.iterator();

               while(var3.hasNext()) {
                  this.Ϳ((IntentFilter)((ServiceIntentInfo)var3.next()));
               }
            }

         }
      }
   }
}
