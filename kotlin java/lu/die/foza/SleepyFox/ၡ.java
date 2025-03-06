package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLocalApplicationInfoFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalApplicationInfoFilter.kt\nlu/die/foza/HookEntity/BaseEntity/LocalApplicationInfoFilter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,72:1\n13309#2,2:73\n13309#2,2:75\n13309#2,2:77\n13309#2,2:79\n*S KotlinDebug\n*F\n+ 1 LocalApplicationInfoFilter.kt\nlu/die/foza/HookEntity/BaseEntity/LocalApplicationInfoFilter\n*L\n30#1:73,2\n33#1:75,2\n36#1:77,2\n39#1:79,2\n*E\n"})
public final class ၡ {
   @NotNull
   public static final ၡ Ϳ = new ၡ();
   public static boolean Ԩ = true;
   public static final int ԩ = Process.myPid();
   @NotNull
   public static final ૹ<String> Ԫ = new ૹ("credentialProtectedDataDir");

   public final int _/* $FF was: Ԩ*/() {
      return ԩ;
   }

   public final int _/* $FF was: Ϳ*/() {
      ࢦ.Ϳ.getClass();
      return ࢦ.ԯ;
   }

   @Nullable
   public final <T extends ComponentInfo> T _/* $FF was: Ϳ*/(@Nullable T var1) {
      if (var1 == null) {
         return null;
      } else {
         this.Ϳ(var1.applicationInfo);
         var1.enabled = true;
         return var1;
      }
   }

   @NotNull
   public final PackageInfo _/* $FF was: Ϳ*/(@NotNull PackageInfo var1) {
      PackageInfo var10000;
      boolean var10001;
      ApplicationInfo var10002;
      PackageInfo var23;
      try {
         var10000 = var1;
         var23 = var1;
         var10002 = this.Ϳ(var1.applicationInfo);
      } catch (Exception var17) {
         var10001 = false;
         return var1;
      }

      ApplicationInfo var18 = var10002;

      ActivityInfo[] var21;
      try {
         var23.applicationInfo = var10002;
         var21 = var10000.activities;
      } catch (Exception var16) {
         var10001 = false;
         return var1;
      }

      ActivityInfo[] var2 = var21;
      int var3;
      int var4;
      int var22;
      if (var21 != null) {
         var21 = var2;
         var3 = 0;

         try {
            var22 = var21.length;
         } catch (Exception var15) {
            var10001 = false;
            return var1;
         }

         for(var4 = var22; var3 < var4; ++var3) {
            try {
               var2[var3].applicationInfo = var18;
            } catch (Exception var14) {
               var10001 = false;
               return var1;
            }
         }
      }

      ProviderInfo[] var24;
      try {
         var24 = var1.providers;
      } catch (Exception var13) {
         var10001 = false;
         return var1;
      }

      ProviderInfo[] var19 = var24;
      if (var24 != null) {
         var24 = var19;
         var3 = 0;

         try {
            var22 = var24.length;
         } catch (Exception var12) {
            var10001 = false;
            return var1;
         }

         for(var4 = var22; var3 < var4; ++var3) {
            try {
               var19[var3].applicationInfo = var18;
            } catch (Exception var11) {
               var10001 = false;
               return var1;
            }
         }
      }

      ServiceInfo[] var25;
      try {
         var25 = var1.services;
      } catch (Exception var10) {
         var10001 = false;
         return var1;
      }

      ServiceInfo[] var20 = var25;
      if (var25 != null) {
         var25 = var20;
         var3 = 0;

         try {
            var22 = var25.length;
         } catch (Exception var9) {
            var10001 = false;
            return var1;
         }

         for(var4 = var22; var3 < var4; ++var3) {
            try {
               var20[var3].applicationInfo = var18;
            } catch (Exception var8) {
               var10001 = false;
               return var1;
            }
         }
      }

      try {
         var21 = var1.receivers;
      } catch (Exception var7) {
         var10001 = false;
         return var1;
      }

      var2 = var21;
      if (var21 != null) {
         var21 = var2;
         var3 = 0;

         try {
            var22 = var21.length;
         } catch (Exception var6) {
            var10001 = false;
            return var1;
         }

         for(var4 = var22; var3 < var4; ++var3) {
            try {
               var2[var3].applicationInfo = var18;
            } catch (Exception var5) {
               var10001 = false;
               break;
            }
         }
      }

      return var1;
   }

   @SuppressLint({"SdCardPath"})
   @Nullable
   public final ApplicationInfo _/* $FF was: Ϳ*/(@Nullable ApplicationInfo var1) {
      if (var1 != null) {
         String var10000;
         boolean var10001;
         try {
            var10000 = var1.packageName;
         } catch (Exception var9) {
            var10001 = false;
            return var1;
         }

         String var10 = var10000;
         if (var10000 != null) {
            ࢦ var14;
            try {
               var10000 = var10;
               var14 = ࢦ.Ϳ;
            } catch (Exception var8) {
               var10001 = false;
               return var1;
            }

            ࢦ var11 = var14;

            boolean var12;
            try {
               var12 = Intrinsics.areEqual(var10000, var14.ԩ());
            } catch (Exception var7) {
               var10001 = false;
               return var1;
            }

            if (!var12) {
               return var1;
            }

            ApplicationInfo var10002;
            ࢦ var10003;
            ApplicationInfo var13;
            ApplicationInfo var15;
            try {
               var13 = var1;
               var15 = var1;
               var10002 = var1;
               var10003 = var11;
               var11.getClass();
            } catch (Exception var6) {
               var10001 = false;
               return var1;
            }

            String var10004;
            try {
               var10004 = ࢦ.ԫ;
            } catch (Exception var5) {
               var10001 = false;
               return var1;
            }

            var10 = var10004;

            try {
               var10003.getClass();
            } catch (Exception var4) {
               var10001 = false;
               return var1;
            }

            try {
               var10002.uid = ࢦ.ԯ;
               var15.enabled = true;
               var13.dataDir = var10;
               var12 = ތ.ԫ;
            } catch (Exception var3) {
               var10001 = false;
               return var1;
            }

            if (var12) {
               try {
                  var1.deviceProtectedDataDir = var10;
                  Ԫ.Ϳ(var1, var10);
               } catch (Exception var2) {
                  var10001 = false;
               }

               return var1;
            }

            return var1;
         }
      }

      return var1;
   }
}
