package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nIntentConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentConvertor.kt\nlu/die/foza/Data/Convertor/IntentConvertor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,543:1\n1#2:544\n13330#3,2:545\n*S KotlinDebug\n*F\n+ 1 IntentConvertor.kt\nlu/die/foza/Data/Convertor/IntentConvertor\n*L\n467#1:545,2\n*E\n"})
public final class ྌ {
   @NotNull
   public static final ྌ Ϳ = new ྌ();
   @NotNull
   public static final String Ԩ = "package:";
   @NotNull
   public static final ComponentName ԩ = new ComponentName("com.android.systemui", "com.android.systemui.media.MediaProjectionPermissionActivity");
   public static final int Ԫ;

   @JvmStatic
   public static final boolean _/* $FF was: Ϳ*/(@NotNull ActivityInfo var0) {
      int var1;
      return (var1 = var0.screenOrientation) == 0 || var1 == 6 || var1 == 8 || var1 == 11;
   }

   @JvmStatic
   public static final boolean _/* $FF was: Ԩ*/(@NotNull ActivityInfo var0) {
      return var0.launchMode == 1;
   }

   @JvmStatic
   public static final boolean _/* $FF was: ԩ*/(@NotNull ActivityInfo var0) {
      int var1;
      return (var1 = var0.launchMode) == 2 || var1 == 3 || var1 == 4;
   }

   @JvmStatic
   @NotNull
   public static final Intent _/* $FF was: Ϳ*/(@NotNull Intent var0, int var1) {
      String var2 = "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivity";

      Intent var10000;
      boolean var10001;
      ComponentName var10002;
      ComponentName var6;
      try {
         var10000 = new Intent();
         var6 = new ComponentName;
         var10002 = var6;
         ࢦ.Ϳ.getClass();
      } catch (Exception var5) {
         var10001 = false;
         return var0;
      }

      String var10003;
      StringBuilder var10004;
      try {
         var10003 = ࢦ.Ԯ;
         var10004 = new StringBuilder;
      } catch (Exception var4) {
         var10001 = false;
         return var0;
      }

      StringBuilder var10005 = var10004;

      try {
         var10005.<init>(var2);
         var10002.<init>(var10003, var10004.append(var1).toString());
         var10000 = var10000.setComponent(var6);
         var10000.putExtra("key_store_real_activity_intent", var0);
         return var10000;
      } catch (Exception var3) {
         var10001 = false;
         return var0;
      }
   }

   @JvmStatic
   @NotNull
   public static final Intent _/* $FF was: Ϳ*/(@NotNull Intent param0, int param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   @NotNull
   public static final Intent _/* $FF was: Ԩ*/(@NotNull Intent param0, int param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   @NotNull
   public static final Intent _/* $FF was: Ԩ*/(@NotNull Intent var0, int var1) {
      String var2 = "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivityH";

      Intent var10000;
      boolean var10001;
      ComponentName var10002;
      ComponentName var6;
      try {
         var10000 = new Intent();
         var6 = new ComponentName;
         var10002 = var6;
         ࢦ.Ϳ.getClass();
      } catch (Exception var5) {
         var10001 = false;
         return var0;
      }

      String var10003;
      StringBuilder var10004;
      try {
         var10003 = ࢦ.Ԯ;
         var10004 = new StringBuilder;
      } catch (Exception var4) {
         var10001 = false;
         return var0;
      }

      StringBuilder var10005 = var10004;

      try {
         var10005.<init>(var2);
         var10002.<init>(var10003, var10004.append(var1).toString());
         var10000 = var10000.setComponent(var6);
         var10000.putExtra("key_store_real_activity_intent", var0);
         return var10000;
      } catch (Exception var3) {
         var10001 = false;
         return var0;
      }
   }

   @JvmStatic
   @Nullable
   public static final Intent _/* $FF was: Ԩ*/(@NotNull Intent var0) {
      try {
         return (Intent)var0.getParcelableExtra("key_store_real_activity_intent");
      } catch (Exception var1) {
         return null;
      }
   }

   @JvmStatic
   @NotNull
   public static final Intent _/* $FF was: Ԩ*/(@NotNull Intent param0, @Nullable ൔ param1) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   @Nullable
   public static final Intent _/* $FF was: ԩ*/(@Nullable Intent var0) {
      ࢦ.Ϳ.getClass();
      return ԩ(var0, ࢦ.Ԩ);
   }

   @JvmStatic
   @Nullable
   public static final Intent _/* $FF was: ԩ*/(@Nullable Intent param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      int var0 = 0;
      byte var1 = 14;
      int[] var2;
      int[] var10000 = var2 = new int[14];
      var10000[0] = 33554432;
      var10000[1] = 65536;
      var10000[2] = 32768;
      var10000[3] = 268435456;
      var10000[4] = 8388608;
      var10000[5] = 524288;
      var10000[6] = 1;
      var10000[7] = 64;
      var10000[8] = 128;
      var10000[9] = 2;
      var10000[10] = 134217728;
      var10000[11] = 16384;
      var10000[12] = 1073741824;
      var10000[13] = 2097152;

      for(int var3 = 0; var3 < var1; ++var3) {
         var0 |= var2[var3];
      }

      Ԫ = var0;
   }

   @NotNull
   public final Intent _/* $FF was: Ԫ*/(@NotNull Intent var1) {
      Intent var10000;
      boolean var10001;
      try {
         var10000 = new Intent;
      } catch (Exception var12) {
         var10001 = false;
         return var1;
      }

      Intent var15 = var10000;
      Intent var13;
      Intent var10002 = var13 = var10000;

      Intent var10003;
      try {
         var10003 = var1;
         var13.<init>(ࢦ.ֈ(), FozaProxyActivity.class);
         var13.putExtra("key_store_real_activity_intent", var1);
      } catch (Exception var11) {
         var10001 = false;
         return var1;
      }

      try {
         var10002.setFlags(var10003.getFlags());
      } catch (Exception var10) {
         var10001 = false;
         return var1;
      }

      String var16;
      try {
         var16 = "key_launch_target_username";
      } catch (Exception var9) {
         var10001 = false;
         return var1;
      }

      String var2 = var16;

      ࢦ var17;
      try {
         var17 = ࢦ.Ϳ;
      } catch (Exception var8) {
         var10001 = false;
         return var1;
      }

      ࢦ var3 = var17;

      String var10004;
      try {
         var10003 = var13;
         var10004 = var2;
         var3.getClass();
      } catch (Exception var7) {
         var10001 = false;
         return var1;
      }

      try {
         var10003.putExtra(var10004, ࢦ.Ԫ);
      } catch (Exception var6) {
         var10001 = false;
         return var1;
      }

      String var18;
      try {
         var18 = "foza_key_calling_package";
      } catch (Exception var5) {
         var10001 = false;
         return var1;
      }

      String var14 = var18;

      try {
         var15.putExtra(var14, var17.ԩ());
         return var10000;
      } catch (Exception var4) {
         var10001 = false;
         return var1;
      }
   }

   @NotNull
   public final Intent _/* $FF was: Ϳ*/(@NotNull Intent var1) {
      var1.addFlags(270532608);
      return var1;
   }

   @NotNull
   public final Intent _/* $FF was: Ϳ*/(@NotNull Intent var1, @NotNull Intent var2) {
      return var2.addFlags(var1.getFlags() & Ԫ | 134217728);
   }

   public final boolean _/* $FF was: Ϳ*/(int var1, @NotNull Intent var2) {
      return (var2.getFlags() & var1) != 0;
   }

   public final boolean _/* $FF was: Ϳ*/(int var1, @Nullable ActivityInfo var2) {
      if (var2 == null) {
         return false;
      } else {
         return (var2.flags & var1) != 0;
      }
   }

   public final void _/* $FF was: Ԩ*/(int var1, @NotNull Intent var2) {
      var2.setFlags(var2.getFlags() & ~var1);
   }

   public final void _/* $FF was: Ϳ*/(int var1, @Nullable Intent var2, @Nullable Intent var3) {
      if (var2 != null && var3 != null) {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = this.Ϳ(var1, var2);
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         if (var10000) {
            try {
               var3.addFlags(var1);
            } catch (Exception var4) {
               var10001 = false;
            }
         }

      }
   }

   @NotNull
   public final Intent _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      Intent var10000 = new Intent("android.intent.action.MAIN");
      var10000.addCategory("android.intent.category.LAUNCHER");
      var10000.setFlags(270532608);
      var10000.setClassName(var1, var2);
      return var10000;
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull Intent var1, @Nullable String var2) {
      ComponentName var3;
      return Intrinsics.areEqual(var1.getAction(), "android.intent.action.MAIN") && (Intrinsics.areEqual((var3 = var1.getComponent()) != null ? var3.getPackageName() : null, var2) || Intrinsics.areEqual(var1.getPackage(), var2)) && (var1.hasCategory("android.intent.category.LAUNCHER") || var1.hasCategory("android.intent.category.INFO")) && this.Ϳ(268435456, var1);
   }

   public final void _/* $FF was: Ϳ*/(Intent var1, String var2, int var3) {
      Bundle var10000;
      boolean var10001;
      try {
         var10000 = var1.getExtras();
      } catch (Exception var19) {
         var10001 = false;
         return;
      }

      Bundle var20 = var10000;
      if (var10000 != null) {
         Object var24;
         try {
            var24 = var20.get(var2);
         } catch (Exception var18) {
            var10001 = false;
            return;
         }

         Object var21 = var24;

         boolean var25;
         try {
            var25 = var24 instanceof Uri;
         } catch (Exception var17) {
            var10001 = false;
            return;
         }

         if (var25) {
            try {
               var1.putExtra(var2, FozaStubProvider.Ϳ.Ԩ((Uri)var21, var3));
            } catch (Exception var6) {
               var10001 = false;
            }
         } else {
            try {
               var25 = var21 instanceof ArrayList;
            } catch (Exception var16) {
               var10001 = false;
               return;
            }

            if (var25) {
               ArrayList var27;
               try {
                  var24 = var21;
                  var27 = new ArrayList;
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               ArrayList var22 = var27;

               Iterator var26;
               try {
                  var27.<init>();
                  var26 = ((ArrayList)var24).iterator();
               } catch (Exception var14) {
                  var10001 = false;
                  return;
               }

               Iterator var4 = var26;

               while(true) {
                  try {
                     var25 = var4.hasNext();
                  } catch (Exception var9) {
                     var10001 = false;
                     return;
                  }

                  if (!var25) {
                     break;
                  }

                  try {
                     var24 = var4.next();
                  } catch (Exception var13) {
                     var10001 = false;
                     return;
                  }

                  Object var5 = var24;

                  try {
                     var25 = var24 instanceof Uri;
                  } catch (Exception var12) {
                     var10001 = false;
                     return;
                  }

                  if (!var25) {
                     break;
                  }

                  Uri var28;
                  try {
                     var28 = FozaStubProvider.Ϳ.Ԩ((Uri)var5, var3);
                  } catch (Exception var11) {
                     var10001 = false;
                     return;
                  }

                  Uri var23 = var28;
                  if (var28 != null) {
                     try {
                        var22.add(var23);
                     } catch (Exception var10) {
                        var10001 = false;
                        return;
                     }
                  }
               }

               try {
                  var25 = var22.isEmpty();
               } catch (Exception var8) {
                  var10001 = false;
                  return;
               }

               if (var25 ^ true) {
                  try {
                     var1.putExtra(var2, var22);
                  } catch (Exception var7) {
                     var10001 = false;
                  }
               }
            }
         }
      }

   }

   public final void _/* $FF was: Ϳ*/(Intent var1, ൔ var2) {
      boolean var10000;
      boolean var10001;
      try {
         var10000 = ތ.ހ;
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      if (var10000) {
         try {
            var10000 = Intrinsics.areEqual(var1.getComponent(), ԩ);
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         if (var10000) {
            String var16;
            try {
               var16 = var2.Ԩ();
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            String var12 = var16;

            try {
               ࡠ.ԩ.getClass();
            } catch (Exception var8) {
               var10001 = false;
               return;
            }

            ApplicationInfo var17;
            try {
               var17 = ࡠ.ԫ().Ϳ((String)var12, 0);
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            ApplicationInfo var15 = var17;
            if (var17 == null) {
               PackageInfo var18;
               try {
                  var18 = ࢼ.Ϳ.Ԩ((String)var12, 0);
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               PackageInfo var13 = var18;
               if (var18 != null) {
                  try {
                     var17 = var13.applicationInfo;
                  } catch (Exception var5) {
                     var10001 = false;
                     return;
                  }

                  ApplicationInfo var14 = var17;
                  var15 = var14;
               } else {
                  var12 = null;
                  var15 = var12;
               }
            }

            if (var15 != null) {
               int var19;
               try {
                  var19 = var15.targetSdkVersion;
               } catch (Exception var4) {
                  var10001 = false;
                  return;
               }

               if (var19 < 29) {
                  try {
                     ˇ.Ϳ(ˇ.Ϳ, var2, 32, (Notification)null, 4, (Object)null);
                  } catch (Exception var3) {
                     var10001 = false;
                  }
               }
            }
         }
      }

   }
}
