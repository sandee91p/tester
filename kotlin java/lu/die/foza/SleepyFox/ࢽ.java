package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.StringsKt;
import lu.die.foza.Platform.EmbeddedMachineCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFozaPackageObserverStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaPackageObserverStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaPackageObserverStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1990:1\n1#2:1991\n215#3,2:1992\n215#3,2:1994\n215#3,2:1996\n215#3,2:1998\n1855#4,2:2000\n1855#4,2:2002\n1855#4,2:2006\n1855#4,2:2010\n1855#4:2014\n1855#4,2:2015\n1856#4:2017\n1855#4,2:2024\n1855#4,2:2028\n37#5,2:2004\n37#5,2:2008\n37#5,2:2012\n37#5,2:2018\n37#5,2:2020\n37#5,2:2022\n37#5,2:2026\n37#5,2:2030\n37#5,2:2032\n37#5,2:2036\n37#5,2:2038\n37#5,2:2040\n37#5,2:2044\n13309#6,2:2034\n13309#6,2:2042\n*S KotlinDebug\n*F\n+ 1 FozaPackageObserverStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaPackageObserverStore\n*L\n220#1:1992,2\n274#1:1994,2\n328#1:1996,2\n382#1:1998,2\n594#1:2000,2\n822#1:2002,2\n834#1:2006,2\n846#1:2010,2\n858#1:2014\n864#1:2015,2\n858#1:2017\n921#1:2024,2\n931#1:2028,2\n829#1:2004,2\n841#1:2008,2\n853#1:2012,2\n874#1:2018,2\n910#1:2020,2\n916#1:2022,2\n926#1:2026,2\n936#1:2030,2\n940#1:2032,2\n1597#1:2036,2\n1599#1:2038,2\n1776#1:2040,2\n1957#1:2044,2\n1014#1:2034,2\n1807#1:2042,2\n*E\n"})
public final class ࢽ {
   @NotNull
   public static final ࢽ Ϳ = new ࢽ();
   @NotNull
   public static final ಀ<Object> Ԩ;
   @NotNull
   public static final ૹ<Object> ԩ;
   @NotNull
   public static final ބ<String, ࢶ> Ԫ;
   @NotNull
   public static final ConcurrentHashMap<String, ProviderInfo> ԫ;
   @NotNull
   public static final ޅ<ComponentName> Ԭ;
   @NotNull
   public static final ConditionVariable ԭ;

   @SuppressLint({"PrivateApi"})
   public final Object _/* $FF was: ԩ*/() {
      ಀ var10000;
      boolean var10001;
      try {
         var10000 = Ԩ;
      } catch (Exception var5) {
         var10001 = false;
         return null;
      }

      Class[] var10 = null;

      Object[] var10002;
      try {
         var10002 = new Object[1];
      } catch (Exception var4) {
         var10001 = false;
         return null;
      }

      Object[] var10003 = var10002;
      byte var10004 = 0;

      Object var7;
      try {
         var10003[var10004] = "package";
         var7 = var10000.Ϳ(var10, var10002);
      } catch (Exception var3) {
         var10001 = false;
         return null;
      }

      Object var6 = var7;

      Class var8;
      try {
         var8 = Class.forName("android.content.pm.IPackageManager$Stub$Proxy");
         var10 = new Class[1];
      } catch (Exception var2) {
         var10001 = false;
         return null;
      }

      Class[] var11 = var10;
      byte var12 = 0;

      try {
         var11[var12] = IBinder.class;
         Constructor var9 = var8.getDeclaredConstructor(var10);
         var9.setAccessible(true);
         return var9.newInstance(var6);
      } catch (Exception var1) {
         var10001 = false;
         return null;
      }
   }

   public final Object _/* $FF was: Ϳ*/(Context param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static Object _/* $FF was: Ϳ*/(ࢽ var0, Context var1, Object var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = var0.ԩ();
      }

      return var0.Ϳ(var1, var2);
   }

   public final <T> T _/* $FF was: Ϳ*/(T var1) {
      Context var2 = ࢦ.ֈ();
      ၽ var10001 = ၽ.Ϳ;
      Object[] var3;
      Object[] var10002 = var3 = new Object[4];
      var3[0] = var2;
      var3[1] = Ϳ(this, (Context)var2, (Object)null, 2, (Object)null);
      var10002[2] = var2.getPackageCodePath();
      var10002[3] = var1;
      var10001.getClass();
      return EmbeddedMachineCompat.nativeIoctl(3112, var3);
   }

   // $FF: synthetic method
   public static List _/* $FF was: Ϳ*/(ࢽ var0, boolean var1, int var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = true;
      }

      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return var0.Ϳ(var1, var2);
   }

   // $FF: synthetic method
   public static List _/* $FF was: Ϳ*/(ࢽ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.Ϳ(var1, var2, var3);
   }

   // $FF: synthetic method
   public static List _/* $FF was: ԩ*/(ࢽ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.ԩ(var1, var2, var3);
   }

   // $FF: synthetic method
   public static List _/* $FF was: Ԩ*/(ࢽ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.Ԩ(var1, var2, var3);
   }

   // $FF: synthetic method
   public static List _/* $FF was: Ԫ*/(ࢽ var0, Intent var1, String var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 131072;
      }

      return var0.Ԫ(var1, var2, var3);
   }

   public final void _/* $FF was: Ϳ*/(String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public final void ֏(String var1) {
      ࢶ var10000;
      boolean var10001;
      try {
         var10000 = (ࢶ)Ԫ.get(var1);
      } catch (Exception var16) {
         var10001 = false;
         return;
      }

      ࢶ var17 = var10000;
      if (var10000 != null) {
         ProviderInfo[] var23;
         try {
            var23 = var17.Ϳ.providers;
         } catch (Exception var15) {
            var10001 = false;
            return;
         }

         ProviderInfo[] var18 = var23;
         if (var23 != null) {
            var23 = var18;
            int var19 = 0;

            int var24;
            try {
               var24 = var23.length;
            } catch (Exception var14) {
               var10001 = false;
               return;
            }

            for(int var2 = var24; var19 < var2; ++var19) {
               String var25;
               try {
                  var25 = var18[var19].authority;
               } catch (Exception var13) {
                  var10001 = false;
                  return;
               }

               String var3 = var25;
               List var21;
               if (var25 != null) {
                  char[] var28;
                  try {
                     var25 = var3;
                     var28 = new char[1];
                  } catch (Exception var12) {
                     var10001 = false;
                     return;
                  }

                  char[] var20 = var28;

                  List var26;
                  try {
                     var28[0] = ';';
                     var26 = StringsKt.split$default(var25, var20, false, 0, 6, (Object)null);
                  } catch (Exception var11) {
                     var10001 = false;
                     return;
                  }

                  var21 = var26;
               } else {
                  var21 = null;
               }

               if (var21 != null) {
                  Iterator var27;
                  try {
                     var27 = var21.iterator();
                  } catch (Exception var10) {
                     var10001 = false;
                     return;
                  }

                  Iterator var22 = var27;

                  while(true) {
                     boolean var29;
                     try {
                        var29 = var22.hasNext();
                     } catch (Exception var6) {
                        var10001 = false;
                        return;
                     }

                     if (!var29) {
                        break;
                     }

                     try {
                        var25 = (String)var22.next();
                     } catch (Exception var9) {
                        var10001 = false;
                        return;
                     }

                     String var4 = var25;

                     try {
                        var24 = var25.length();
                     } catch (Exception var8) {
                        var10001 = false;
                        return;
                     }

                     if (var24 > 0) {
                        try {
                           ԫ.remove(var4);
                        } catch (Exception var7) {
                           var10001 = false;
                           return;
                        }
                     }
                  }
               }
            }

         }
      }
   }

   public final void _/* $FF was: Ԫ*/(PackageInfo var1) {
      String var8 = "package:";

      Intent var10000;
      boolean var10001;
      try {
         var10000 = new Intent;
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      Intent var2;
      Intent var9 = var2 = var10000;

      StringBuilder var10;
      try {
         var9.<init>("android.intent.action.PACKAGE_REPLACED");
         var10 = new StringBuilder;
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      StringBuilder var10002 = var10;

      try {
         var10002.<init>(var8);
         var10000.setData(Uri.parse(var10.append(var1.packageName).toString()));
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      try {
         ࢢ.Ϳ(ࢢ.Ϳ, var2, (String)null, 2, (Object)null);
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      try {
         ࢷ.Ϳ.Ϳ(var2);
      } catch (Exception var3) {
         var10001 = false;
      }

   }

   public final void _/* $FF was: Ԩ*/(PackageInfo var1) {
      String var8 = "package:";

      Intent var10000;
      boolean var10001;
      try {
         var10000 = new Intent;
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      Intent var2;
      Intent var9 = var2 = var10000;

      StringBuilder var10;
      try {
         var9.<init>("android.intent.action.PACKAGE_ADDED");
         var10 = new StringBuilder;
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      StringBuilder var10002 = var10;

      try {
         var10002.<init>(var8);
         var10000.setData(Uri.parse(var10.append(var1.packageName).toString()));
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      try {
         ࢢ.Ϳ(ࢢ.Ϳ, var2, (String)null, 2, (Object)null);
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      try {
         ࢷ.Ϳ.Ϳ(var2);
      } catch (Exception var3) {
         var10001 = false;
      }

   }

   public final void _/* $FF was: ԩ*/(PackageInfo var1) {
      String var7 = "package:";
      if (var1 != null) {
         Intent var10000;
         boolean var10001;
         try {
            var10000 = new Intent;
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         Intent var2;
         Intent var8 = var2 = var10000;

         StringBuilder var9;
         try {
            var8.<init>("android.intent.action.PACKAGE_REMOVED");
            var9 = new StringBuilder;
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         StringBuilder var10002 = var9;

         try {
            var10002.<init>(var7);
            var10000.setData(Uri.parse(var9.append(var1.packageName).toString()));
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         try {
            ࢢ.Ϳ(ࢢ.Ϳ, var2, (String)null, 2, (Object)null);
         } catch (Exception var3) {
            var10001 = false;
         }

      }
   }

   public final void _/* $FF was: Ϳ*/(ComponentInfo var1, ApplicationInfo var2) {
      if (var1.packageName == null) {
         var1.packageName = var2.packageName;
      }

      String var4;
      if ((var4 = var1.processName) == null || var4.length() == 0) {
         if ((var4 = var2.processName) != null && var4.length() != 0) {
            var1.processName = var4;
         } else {
            var1.processName = var2.packageName;
         }
      }

      var1.applicationInfo = var2;
      if ((var4 = var1.name) != null && StringsKt.startsWith$default(var4, '.', false, 2, (Object)null)) {
         var1.name = var2.packageName + var1.name;
      }

   }

   public final void _/* $FF was: Ϳ*/(ࢶ param1, Integer param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static void _/* $FF was: Ϳ*/(ࢽ var0, ࢶ var1, Integer var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      var0.Ϳ(var1, var2);
   }

   public final void _/* $FF was: ׯ*/() {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: ԫ*/() {
      // $FF: Couldn't be decompiled
   }

   public final int _/* $FF was: Ϳ*/(File param1, File param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static int _/* $FF was: Ϳ*/(ࢽ var0, File var1, File var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return var0.Ϳ(var1, var2, var3);
   }

   public final ApplicationInfo _/* $FF was: Ϳ*/(ApplicationInfo var1) {
      Ⴧ var2;
      Ⴧ var10002 = var2 = Ⴧ.Ϳ;
      String var3;
      var1.sourceDir = var3 = var2.Ϳ(var1.sourceDir);
      var1.publicSourceDir = var3;
      var1.nativeLibraryDir = var10002.Ϳ(var1.nativeLibraryDir);
      return var1;
   }

   public final int ނ(String var1) {
      int var4 = var1.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var4; ++var3) {
         var2 *= 31;
         var2 += var3 * 31;
         var2 += var1.charAt(var3) * 31;
      }

      return Math.abs(var2);
   }

   public final int _/* $FF was: Ϳ*/(PackageInfo var1) {
      String var2;
      return (ࢳ.Ϳ.Ԩ(var1.packageName) ? this.ނ("com.google") : ((var2 = var1.sharedUserId) != null && var2.length() != 0 ? this.ނ(var1.sharedUserId) : this.ނ(var1.packageName))) % 7000 + 13000;
   }

   public final Triple<ࢶ, Integer, Boolean> _/* $FF was: Ϳ*/(File param1) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(ࢶ var1, boolean var2) {
      Parcel var10000;
      boolean var10001;
      try {
         var10000 = Parcel.obtain();
      } catch (Exception var27) {
         var10001 = false;
         return;
      }

      Parcel var3 = var10000;

      byte[] var33;
      try {
         var1.writeToParcel(var3, 0);
         var33 = (byte[])this.Ϳ((Object)var3.marshall());
      } catch (Exception var26) {
         var10001 = false;
         return;
      }

      byte[] var28 = var33;

      FileOutputStream var31;
      try {
         var10000.recycle();
         var31 = new FileOutputStream;
      } catch (Exception var25) {
         var10001 = false;
         return;
      }

      FileOutputStream var30;
      FileOutputStream var34 = var30 = var31;

      byte[] var10002;
      byte[] var10003;
      try {
         var10002 = var28;
         var10003 = var28;
         var30.<init>(ၥ.Ϳ.ԩ(var1.Ϳ.packageName));
      } catch (Exception var24) {
         var10001 = false;
         return;
      }

      Throwable var29 = null;

      try {
         Intrinsics.checkNotNull(var10003);
         var34.write(var10002);
         var34 = var29;
         Unit var35 = Unit.INSTANCE;
      } catch (Throwable var23) {
         Throwable var32 = var29 = var23;

         try {
            throw var29;
         } catch (Throwable var21) {
            try {
               CloseableKt.closeFinally(var30, var29);
               throw var32;
            } catch (Exception var20) {
               var10001 = false;
               return;
            }
         }
      }

      try {
         CloseableKt.closeFinally(var31, var34);
         ࢦ.Ϳ.Ԩ(ࢽ::Ԩ);
      } catch (Exception var22) {
         var10001 = false;
      }

   }

   public final void ֏() {
      Parcel var10000;
      boolean var10001;
      try {
         var10000 = Parcel.obtain();
      } catch (Exception var29) {
         var10001 = false;
         return;
      }

      Parcel var30;
      Parcel var35 = var30 = var10000;

      label206: {
         byte[] var32;
         try {
            var35.writeParcelableArray((Parcelable[])Ԭ.toArray(new ComponentName[0]), 0);
            var32 = var10000.marshall();
         } catch (Exception var28) {
            var10001 = false;
            break label206;
         }

         byte[] var1 = var32;

         FileOutputStream var33;
         try {
            var33 = new FileOutputStream;
         } catch (Exception var27) {
            var10001 = false;
            break label206;
         }

         FileOutputStream var2;
         FileOutputStream var36 = var2 = var33;

         byte[] var10002;
         try {
            var10002 = var1;
            var2.<init>(ၥ.Ϳ.Ԩ());
         } catch (Exception var26) {
            var10001 = false;
            break label206;
         }

         Throwable var31 = null;

         try {
            var36.write(var10002);
            var35 = var31;
            Unit var37 = Unit.INSTANCE;
         } catch (Throwable var25) {
            Throwable var34 = var31 = var25;

            try {
               throw var31;
            } catch (Throwable var23) {
               try {
                  CloseableKt.closeFinally(var2, var31);
                  throw var34;
               } catch (Exception var21) {
                  var10001 = false;
                  break label206;
               }
            }
         }

         try {
            CloseableKt.closeFinally(var33, var35);
         } catch (Exception var24) {
            var10001 = false;
         }
      }

      try {
         var30.recycle();
      } catch (Exception var22) {
         var10001 = false;
      }

   }

   public final void _/* $FF was: Ԫ*/() {
      File var10000;
      boolean var10001;
      try {
         var10000 = ၥ.Ϳ.Ԩ();
      } catch (Exception var56) {
         var10001 = false;
         return;
      }

      File var57 = var10000;

      boolean var64;
      try {
         var64 = var10000.exists();
      } catch (Exception var55) {
         var10001 = false;
         return;
      }

      if (var64) {
         FileInputStream var65;
         try {
            var65 = new FileInputStream;
         } catch (Exception var54) {
            var10001 = false;
            return;
         }

         FileInputStream var69 = var65;
         FileInputStream var1;
         FileInputStream var10002 = var1 = var65;

         try {
            var10002.<init>(var57);
         } catch (Exception var53) {
            var10001 = false;
            return;
         }

         var57 = null;

         byte[] var73;
         try {
            var73 = ByteStreamsKt.readBytes(var69);
         } catch (Throwable var52) {
            Throwable var58;
            Throwable var66 = var58 = var52;

            try {
               throw var66;
            } catch (Throwable var49) {
               try {
                  CloseableKt.closeFinally(var1, var58);
                  throw var66;
               } catch (Exception var48) {
                  var10001 = false;
                  return;
               }
            }
         }

         byte[] var59 = var73;

         Parcel var67;
         try {
            CloseableKt.closeFinally(var65, var57);
            var67 = Parcel.obtain();
         } catch (Exception var51) {
            var10001 = false;
            return;
         }

         Parcel var75 = var67;
         Parcel var60;
         Parcel var70 = var60 = var67;
         byte[] var10003 = var59;
         byte[] var10004 = var59;
         byte var61 = 0;

         label402: {
            Parcelable[] var68;
            try {
               var70.unmarshall(var10003, var61, var10004.length);
               var75.setDataPosition(0);
               var68 = var67.readParcelableArray(ComponentName.class.getClassLoader());
            } catch (Exception var47) {
               var10001 = false;
               break label402;
            }

            Parcelable[] var62 = var68;
            if (var68 != null) {
               label408: {
                  var68 = var62;
                  int var2 = 0;

                  int var71;
                  try {
                     var71 = var68.length;
                  } catch (Exception var46) {
                     var10001 = false;
                     break label408;
                  }

                  for(int var3 = var71; var2 < var3; ++var2) {
                     Parcelable var72;
                     try {
                        var72 = var62[var2];
                     } catch (Exception var45) {
                        var10001 = false;
                        break;
                     }

                     Parcelable var4 = var72;

                     try {
                        var64 = var72 instanceof ComponentName;
                     } catch (Exception var44) {
                        var10001 = false;
                        break;
                     }

                     if (var64) {
                        try {
                           Ԭ.add(var4);
                        } catch (Exception var43) {
                           var10001 = false;
                           break;
                        }

                        ࢶ var74;
                        try {
                           var74 = (ࢶ)Ԫ.get(((ComponentName)var4).getPackageName());
                        } catch (Exception var42) {
                           var10001 = false;
                           break;
                        }

                        ࢶ var5 = var74;
                        if (var74 != null) {
                           ComponentInfo var76;
                           try {
                              var76 = (ComponentInfo)var5.Ԫ.Ԩ(((ComponentName)var4).getClassName());
                           } catch (Exception var41) {
                              var10001 = false;
                              break;
                           }

                           ComponentInfo var63 = var76;
                           if (var76 != null) {
                              try {
                                 var63.enabled = true;
                              } catch (Exception var40) {
                                 var10001 = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         try {
            var60.recycle();
         } catch (Exception var50) {
            var10001 = false;
         }
      }

   }

   public final void _/* $FF was: ԯ*/() {
      ޅ var10000;
      boolean var10001;
      try {
         var10000 = new ޅ;
      } catch (Exception var9) {
         var10001 = false;
         return;
      }

      ޅ var1 = var10000;

      Iterator var10;
      try {
         var10000.<init>((Collection)Ԫ.Ԩ().ԫ());
         var10 = Ԭ.iterator();
      } catch (Exception var8) {
         var10001 = false;
         return;
      }

      Iterator var2 = var10;
      boolean var3 = false;

      while(true) {
         boolean var11;
         try {
            var11 = var2.hasNext();
         } catch (Exception var5) {
            var10001 = false;
            break;
         }

         if (!var11) {
            if (var3) {
               try {
                  this.֏();
               } catch (Exception var4) {
                  var10001 = false;
               }
            }
            break;
         }

         try {
            var11 = var1.contains(((ComponentName)var2.next()).getPackageName());
         } catch (Exception var7) {
            var10001 = false;
            break;
         }

         if (!var11) {
            try {
               var2.remove();
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            var3 = true;
         }
      }

   }

   public static final void _/* $FF was: ֈ*/() {
      boolean var10001;
      try {
         Ԫ.clear();
         ԫ.clear();
         Ԭ.clear();
         ԭ.close();
         ၥ.Ϳ.getClass();
      } catch (Exception var10) {
         var10001 = false;
         return;
      }

      File[] var10000;
      try {
         var10000 = ၥ.Ԩ.listFiles();
      } catch (Exception var9) {
         var10001 = false;
         return;
      }

      File[] var0 = var10000;
      if (var10000 != null) {
         var10000 = var0;
         int var1 = 0;

         int var11;
         try {
            var11 = var10000.length;
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         for(int var2 = var11; var1 < var2; ++var1) {
            File var12;
            try {
               var12 = ၥ.Ϳ.Ԩ(var0[var1]);
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            File var3 = var12;

            boolean var13;
            try {
               var13 = var12.exists();
            } catch (Exception var6) {
               var10001 = false;
               return;
            }

            if (var13) {
               try {
                  var3.delete();
               } catch (Exception var5) {
                  var10001 = false;
                  return;
               }
            }
         }

         try {
            Ϳ.ԭ();
         } catch (Exception var4) {
            var10001 = false;
         }

      }
   }

   public static final void _/* $FF was: Ԩ*/(String var0) {
      ˉ.Ϳ.Ԫ(var0);
   }

   public static final void _/* $FF was: Ϳ*/(String var0) {
      ೲ.Ϳ.Ϳ(var0);
   }

   public static final void _/* $FF was: Ԫ*/(String var0) {
      try {
         ၥ.Ϳ.Ϳ(var0);
      } catch (Exception var1) {
      }

   }

   public static final void _/* $FF was: ԭ*/(String var0) {
      Ϳ.ԫ(var0);
   }

   public static final void _/* $FF was: Ϳ*/(Integer var0, PackageInfo var1) {
      byte var2 = 1;
      if (var0 != null && var0 == var2) {
         Ϳ.Ԩ(var1);
      } else {
         var2 = 2;
         if (var0 != null && var0 == var2) {
            Ϳ.Ԫ(var1);
         }
      }

   }

   public static final void _/* $FF was: Ԩ*/(File var0) {
      String var10000;
      boolean var10001;
      try {
         var10000 = var0.getName();
      } catch (Exception var60) {
         var10001 = false;
         return;
      }

      String var61 = var10000;

      ၥ var67;
      try {
         var67 = ၥ.Ϳ;
      } catch (Exception var59) {
         var10001 = false;
         return;
      }

      ၥ var1 = var67;

      File var68;
      try {
         var68 = var67.Ԩ(var61);
      } catch (Exception var58) {
         var10001 = false;
         return;
      }

      File var2 = var68;

      boolean var69;
      try {
         var69 = var68.exists();
      } catch (Exception var57) {
         var10001 = false;
         return;
      }

      ࢽ var73;
      int var74;
      if (var69) {
         try {
            var68 = var1.Ԭ(var61);
         } catch (Exception var53) {
            var10001 = false;
            return;
         }

         File var63 = var68;

         FileInputStream var70;
         try {
            var70 = new FileInputStream;
         } catch (Exception var52) {
            var10001 = false;
            return;
         }

         FileInputStream var3 = var70;

         FileOutputStream var71;
         try {
            var70.<init>(var2);
            var71 = new FileOutputStream;
         } catch (Exception var51) {
            var10001 = false;
            return;
         }

         FileOutputStream var65 = var71;

         FileInputStream var75;
         FileInputStream var10002;
         FileOutputStream var10003;
         try {
            var75 = var3;
            var10002 = var3;
            var10003 = var65;
            var65.<init>(var63);
         } catch (Exception var50) {
            var10001 = false;
            return;
         }

         var2 = null;

         label436: {
            try {
               ByteStreamsKt.copyTo$default(var10002, var10003, 0, 2, (Object)null);
            } catch (Throwable var49) {
               Throwable var62;
               Throwable var72 = var62 = var49;

               try {
                  throw var72;
               } catch (Throwable var45) {
                  try {
                     CloseableKt.closeFinally(var3, var62);
                     throw var72;
                  } catch (Exception var42) {
                     var10001 = false;
                     break label436;
                  }
               }
            }

            try {
               CloseableKt.closeFinally(var75, var2);
               var71.close();
               var73 = Ϳ;
            } catch (Exception var48) {
               var10001 = false;
               break label436;
            }

            ࢽ var66 = var73;

            try {
               var74 = var73.ֈ(var63.getAbsolutePath());
            } catch (Exception var47) {
               var10001 = false;
               break label436;
            }

            if (var74 < 0) {
               try {
                  var66.ԩ(var61);
               } catch (Exception var46) {
                  var10001 = false;
               }
            }
         }

         try {
            var69 = var63.exists();
         } catch (Exception var44) {
            var10001 = false;
            return;
         }

         if (var69) {
            try {
               var63.delete();
            } catch (Exception var43) {
               var10001 = false;
            }
         }
      } else {
         try {
            var73 = Ϳ;
         } catch (Exception var56) {
            var10001 = false;
            return;
         }

         ࢽ var64 = var73;

         try {
            var74 = var73.Ԩ(var61, false);
         } catch (Exception var55) {
            var10001 = false;
            return;
         }

         if (var74 < 0) {
            try {
               var64.ԩ(var61);
            } catch (Exception var54) {
               var10001 = false;
            }
         }
      }

   }

   public static final void _/* $FF was: Ϳ*/(ObjectRef var0) {
      Ϳ(Ϳ, (ࢶ)((ࢶ)var0.element), (Integer)null, 2, (Object)null);
   }

   public static final void _/* $FF was: Ԭ*/() {
      ࢦ.ޅ();
      ԭ.open();
      Ϳ.Ԫ();
      ೲ var10000 = ೲ.Ϳ;
      var10000.getClass();

      try {
         var10000.ԩ();
      } catch (Exception var1) {
      }

      ࠨ var2 = ࠨ.ޠ;
      var2.ׯ();
      var2.֏();
   }

   public static final void _/* $FF was: ԩ*/(String var0, String var1) {
      ˉ.Ϳ.Ϳ(var0, var1);
      ࢶ var2;
      ޅ var3;
      if ((var2 = (ࢶ)Ԫ.get(var0)) != null && (var3 = var2.ԫ) != null) {
         var3.remove(var1);
      }

   }

   public static final void _/* $FF was: Ԩ*/(ࢶ var0, boolean var1) {
      boolean var10000 = var1;
      ࢽ var3 = Ϳ;
      Integer var2 = var10000 ? 1 : 2;
      var3.Ϳ(var0, var2);
   }

   static {
      Class[] var0;
      (var0 = new Class[1])[0] = String.class;
      Ԩ = (new ಀ("getService", var0)).Ϳ("android.os.ServiceManager");
      ԩ = new ૹ("mPM");
      Ԫ = new ބ();
      ԫ = new ConcurrentHashMap();
      Ԭ = new ޅ();
      ԭ = new ConditionVariable();
   }

   public final void _/* $FF was: ՠ*/() {
      ࢦ.Ϳ.Ԩ(ࢽ::ֈ);
   }

   public final void ؠ() {
      try {
         ԭ.block(3500L);
      } catch (Exception var1) {
      }

   }

   @NotNull
   public final ބ<String, ࢶ> _/* $FF was: Ԯ*/() {
      return Ԫ;
   }

   @Nullable
   public final List<PackageInfo> _/* $FF was: Ϳ*/(boolean var1, int var2) {
      ArrayList var10000;
      boolean var10001;
      try {
         var10000 = new ArrayList;
      } catch (Exception var13) {
         var10001 = false;
         return null;
      }

      ArrayList var14 = var10000;

      ބ var18;
      try {
         var18 = Ԫ;
      } catch (Exception var12) {
         var10001 = false;
         return null;
      }

      ބ var3 = var18;

      Iterator var16;
      try {
         var10000.<init>(var18.ԩ);
         var16 = var3.entrySet().iterator();
      } catch (Exception var11) {
         var10001 = false;
         return null;
      }

      Iterator var15 = var16;

      while(true) {
         boolean var17;
         try {
            var17 = var15.hasNext();
         } catch (Exception var10) {
            var10001 = false;
            break;
         }

         if (!var17) {
            return var14;
         }

         ࢶ var19;
         try {
            var17 = var1;
            var19 = (ࢶ)((Entry)var15.next()).getValue();
         } catch (Exception var9) {
            var10001 = false;
            break;
         }

         ࢶ var4 = var19;

         PackageInfo var20;
         try {
            var20 = var19.Ϳ;
         } catch (Exception var8) {
            var10001 = false;
            break;
         }

         PackageInfo var5 = var20;
         if (!var17) {
            try {
               var17 = var4.Ԩ;
            } catch (Exception var7) {
               var10001 = false;
               break;
            }

            if (var17) {
               continue;
            }
         }

         try {
            var14.add(ࢼ.Ϳ.Ϳ(var5, var2));
         } catch (Exception var6) {
         }
      }

      return null;
   }

   @Nullable
   public final ProviderInfo ށ(@Nullable String var1) {
      boolean var10001;
      boolean var4;
      label31: {
         if (var1 != null) {
            int var10000;
            try {
               var10000 = var1.length();
            } catch (Exception var3) {
               var10001 = false;
               return null;
            }

            if (var10000 != 0) {
               var4 = false;
               break label31;
            }
         }

         var4 = true;
      }

      if (var4) {
         return null;
      } else {
         try {
            return (ProviderInfo)ԫ.get(var1);
         } catch (Exception var2) {
            var10001 = false;
            return null;
         }
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: Ϳ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         ComponentName var10000;
         boolean var10001;
         try {
            var10000 = var1.getComponent();
         } catch (Exception var30) {
            var10001 = false;
            return null;
         }

         ComponentName var31 = var10000;
         if (var10000 == null) {
            Intent var43;
            try {
               var43 = var1.getSelector();
            } catch (Exception var29) {
               var10001 = false;
               return null;
            }

            Intent var32 = var43;
            if (var43 != null) {
               try {
                  var10000 = var32.getComponent();
               } catch (Exception var28) {
                  var10001 = false;
                  return null;
               }

               var31 = var10000;
            } else {
               var31 = null;
            }
         }

         ࢶ var44;
         boolean var45;
         ArrayList var47;
         if (var31 != null) {
            try {
               var44 = (ࢶ)Ԫ.get(var31.getPackageName());
            } catch (Exception var13) {
               var10001 = false;
               return null;
            }

            ࢶ var33 = var44;
            if (var44 == null) {
               return null;
            }

            try {
               var45 = var33.Ԩ;
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            if (var45) {
               return null;
            }

            ActivityInfo var46;
            try {
               var46 = (ActivityInfo)var33.Ԫ.Ԩ(var31.getClassName());
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            ActivityInfo var35 = var46;

            ArrayList var51;
            try {
               var51 = new ArrayList;
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            ArrayList var34 = var51;

            try {
               var51.<init>();
            } catch (Exception var9) {
               var10001 = false;
               return null;
            }

            if (var46 != null) {
               ResolveInfo var54;
               try {
                  var47 = var34;
                  var54 = new ResolveInfo;
               } catch (Exception var8) {
                  var10001 = false;
                  return null;
               }

               ResolveInfo var37;
               ResolveInfo var10002 = var37 = var54;

               try {
                  var10002.<init>();
                  var54.activityInfo = var35;
                  var47.add(var37);
               } catch (Exception var7) {
                  var10001 = false;
                  return null;
               }
            }

            return var34;
         } else {
            String var48;
            try {
               var48 = var1.getPackage();
            } catch (Exception var27) {
               var10001 = false;
               return null;
            }

            String var36 = var48;
            ࢮ.Ԩ var50;
            List var52;
            if (var48 != null) {
               try {
                  var44 = (ࢶ)Ԫ.get(var36);
               } catch (Exception var16) {
                  var10001 = false;
                  return null;
               }

               ࢶ var38 = var44;
               if (var44 == null) {
                  return null;
               }

               try {
                  var50 = var38.ԩ;
               } catch (Exception var15) {
                  var10001 = false;
                  return null;
               }

               ࢮ.Ԩ var39 = var50;
               List var40;
               if (var50 != null) {
                  try {
                     var52 = var39.Ϳ.Ϳ(var1, var2, var3);
                  } catch (Exception var14) {
                     var10001 = false;
                     return null;
                  }

                  var40 = var52;
               } else {
                  var40 = null;
               }

               return var40;
            } else {
               try {
                  var47 = new ArrayList;
               } catch (Exception var26) {
                  var10001 = false;
                  return null;
               }

               ArrayList var41 = var47;

               Iterator var53;
               try {
                  var47.<init>();
                  var53 = Ԫ.entrySet().iterator();
               } catch (Exception var25) {
                  var10001 = false;
                  return null;
               }

               Iterator var4 = var53;

               while(true) {
                  try {
                     var45 = var4.hasNext();
                  } catch (Exception var24) {
                     var10001 = false;
                     break;
                  }

                  if (!var45) {
                     return var41;
                  }

                  Entry var55;
                  try {
                     var55 = (Entry)var4.next();
                  } catch (Exception var23) {
                     var10001 = false;
                     break;
                  }

                  Entry var5 = var55;

                  try {
                     var50 = ((ࢶ)var55.getValue()).ԩ;
                  } catch (Exception var22) {
                     var10001 = false;
                     break;
                  }

                  ࢮ.Ԩ var6 = var50;
                  if (var50 != null) {
                     try {
                        var41.addAll(var6.Ϳ.Ϳ(var1, var2, var3));
                     } catch (Exception var21) {
                        var10001 = false;
                        break;
                     }
                  } else {
                     try {
                        var45 = ((ࢶ)var5.getValue()).Ԩ;
                     } catch (Exception var20) {
                        var10001 = false;
                        break;
                     }

                     if (var45) {
                        ࢼ var56;
                        Intent var57;
                        try {
                           var56 = ࢼ.Ϳ;
                           var57 = new Intent;
                        } catch (Exception var19) {
                           var10001 = false;
                           break;
                        }

                        Intent var49 = var57;

                        try {
                           var49.<init>(var1);
                           var52 = var56.Ԩ(var57.setPackage((String)var5.getKey()), var3);
                        } catch (Exception var18) {
                           var10001 = false;
                           break;
                        }

                        List var42 = var52;
                        if (var52 != null) {
                           try {
                              var41.addAll(var42);
                           } catch (Exception var17) {
                              var10001 = false;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: ԩ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         ComponentName var10000;
         boolean var10001;
         try {
            var10000 = var1.getComponent();
         } catch (Exception var30) {
            var10001 = false;
            return null;
         }

         ComponentName var31 = var10000;
         if (var10000 == null) {
            Intent var43;
            try {
               var43 = var1.getSelector();
            } catch (Exception var29) {
               var10001 = false;
               return null;
            }

            Intent var32 = var43;
            if (var43 != null) {
               try {
                  var10000 = var32.getComponent();
               } catch (Exception var28) {
                  var10001 = false;
                  return null;
               }

               var31 = var10000;
            } else {
               var31 = null;
            }
         }

         ࢶ var44;
         boolean var45;
         ArrayList var47;
         if (var31 != null) {
            try {
               var44 = (ࢶ)Ԫ.get(var31.getPackageName());
            } catch (Exception var13) {
               var10001 = false;
               return null;
            }

            ࢶ var33 = var44;
            if (var44 == null) {
               return null;
            }

            try {
               var45 = var33.Ԩ;
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            if (var45) {
               return null;
            }

            ActivityInfo var46;
            try {
               var46 = (ActivityInfo)var33.Ԫ.Ԩ(var31.getClassName());
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            ActivityInfo var35 = var46;

            ArrayList var51;
            try {
               var51 = new ArrayList;
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            ArrayList var34 = var51;

            try {
               var51.<init>();
            } catch (Exception var9) {
               var10001 = false;
               return null;
            }

            if (var46 != null) {
               ResolveInfo var54;
               try {
                  var47 = var34;
                  var54 = new ResolveInfo;
               } catch (Exception var8) {
                  var10001 = false;
                  return null;
               }

               ResolveInfo var37;
               ResolveInfo var10002 = var37 = var54;

               try {
                  var10002.<init>();
                  var54.activityInfo = var35;
                  var47.add(var37);
               } catch (Exception var7) {
                  var10001 = false;
                  return null;
               }
            }

            return var34;
         } else {
            String var48;
            try {
               var48 = var1.getPackage();
            } catch (Exception var27) {
               var10001 = false;
               return null;
            }

            String var36 = var48;
            ࢮ.Ԩ var50;
            List var52;
            if (var48 != null) {
               try {
                  var44 = (ࢶ)Ԫ.get(var36);
               } catch (Exception var16) {
                  var10001 = false;
                  return null;
               }

               ࢶ var38 = var44;
               if (var44 == null) {
                  return null;
               }

               try {
                  var50 = var38.ԩ;
               } catch (Exception var15) {
                  var10001 = false;
                  return null;
               }

               ࢮ.Ԩ var39 = var50;
               List var40;
               if (var50 != null) {
                  try {
                     var52 = var39.Ԩ.Ϳ(var1, var2, var3);
                  } catch (Exception var14) {
                     var10001 = false;
                     return null;
                  }

                  var40 = var52;
               } else {
                  var40 = null;
               }

               return var40;
            } else {
               try {
                  var47 = new ArrayList;
               } catch (Exception var26) {
                  var10001 = false;
                  return null;
               }

               ArrayList var41 = var47;

               Iterator var53;
               try {
                  var47.<init>();
                  var53 = Ԫ.entrySet().iterator();
               } catch (Exception var25) {
                  var10001 = false;
                  return null;
               }

               Iterator var4 = var53;

               while(true) {
                  try {
                     var45 = var4.hasNext();
                  } catch (Exception var24) {
                     var10001 = false;
                     break;
                  }

                  if (!var45) {
                     return var41;
                  }

                  Entry var55;
                  try {
                     var55 = (Entry)var4.next();
                  } catch (Exception var23) {
                     var10001 = false;
                     break;
                  }

                  Entry var5 = var55;

                  try {
                     var50 = ((ࢶ)var55.getValue()).ԩ;
                  } catch (Exception var22) {
                     var10001 = false;
                     break;
                  }

                  ࢮ.Ԩ var6 = var50;
                  if (var50 != null) {
                     try {
                        var41.addAll(var6.Ԩ.Ϳ(var1, var2, var3));
                     } catch (Exception var21) {
                        var10001 = false;
                        break;
                     }
                  } else {
                     try {
                        var45 = ((ࢶ)var5.getValue()).Ԩ;
                     } catch (Exception var20) {
                        var10001 = false;
                        break;
                     }

                     if (var45) {
                        ࢼ var56;
                        Intent var57;
                        try {
                           var56 = ࢼ.Ϳ;
                           var57 = new Intent;
                        } catch (Exception var19) {
                           var10001 = false;
                           break;
                        }

                        Intent var49 = var57;

                        try {
                           var49.<init>(var1);
                           var52 = var56.Ϳ(var57.setPackage((String)var5.getKey()), var3);
                        } catch (Exception var18) {
                           var10001 = false;
                           break;
                        }

                        List var42 = var52;
                        if (var52 != null) {
                           try {
                              var41.addAll(var42);
                           } catch (Exception var17) {
                              var10001 = false;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: Ԩ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         ComponentName var10000;
         boolean var10001;
         try {
            var10000 = var1.getComponent();
         } catch (Exception var30) {
            var10001 = false;
            return null;
         }

         ComponentName var31 = var10000;
         if (var10000 == null) {
            Intent var43;
            try {
               var43 = var1.getSelector();
            } catch (Exception var29) {
               var10001 = false;
               return null;
            }

            Intent var32 = var43;
            if (var43 != null) {
               try {
                  var10000 = var32.getComponent();
               } catch (Exception var28) {
                  var10001 = false;
                  return null;
               }

               var31 = var10000;
            } else {
               var31 = null;
            }
         }

         ࢶ var44;
         boolean var45;
         ArrayList var47;
         if (var31 != null) {
            try {
               var44 = (ࢶ)Ԫ.get(var31.getPackageName());
            } catch (Exception var13) {
               var10001 = false;
               return null;
            }

            ࢶ var33 = var44;
            if (var44 == null) {
               return null;
            }

            try {
               var45 = var33.Ԩ;
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            if (var45) {
               return null;
            }

            ProviderInfo var46;
            try {
               var46 = (ProviderInfo)var33.Ԫ.Ԩ(var31.getClassName());
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            ProviderInfo var35 = var46;

            ArrayList var51;
            try {
               var51 = new ArrayList;
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            ArrayList var34 = var51;

            try {
               var51.<init>();
            } catch (Exception var9) {
               var10001 = false;
               return null;
            }

            if (var46 != null) {
               ResolveInfo var54;
               try {
                  var47 = var34;
                  var54 = new ResolveInfo;
               } catch (Exception var8) {
                  var10001 = false;
                  return null;
               }

               ResolveInfo var37;
               ResolveInfo var10002 = var37 = var54;

               try {
                  var10002.<init>();
                  var54.providerInfo = var35;
                  var47.add(var37);
               } catch (Exception var7) {
                  var10001 = false;
                  return null;
               }
            }

            return var34;
         } else {
            String var48;
            try {
               var48 = var1.getPackage();
            } catch (Exception var27) {
               var10001 = false;
               return null;
            }

            String var36 = var48;
            ࢮ.Ԩ var50;
            List var52;
            if (var48 != null) {
               try {
                  var44 = (ࢶ)Ԫ.get(var36);
               } catch (Exception var16) {
                  var10001 = false;
                  return null;
               }

               ࢶ var38 = var44;
               if (var44 == null) {
                  return null;
               }

               try {
                  var50 = var38.ԩ;
               } catch (Exception var15) {
                  var10001 = false;
                  return null;
               }

               ࢮ.Ԩ var39 = var50;
               List var40;
               if (var50 != null) {
                  try {
                     var52 = var39.Ԫ.Ϳ(var1, var2, var3);
                  } catch (Exception var14) {
                     var10001 = false;
                     return null;
                  }

                  var40 = var52;
               } else {
                  var40 = null;
               }

               return var40;
            } else {
               try {
                  var47 = new ArrayList;
               } catch (Exception var26) {
                  var10001 = false;
                  return null;
               }

               ArrayList var41 = var47;

               Iterator var53;
               try {
                  var47.<init>();
                  var53 = Ԫ.entrySet().iterator();
               } catch (Exception var25) {
                  var10001 = false;
                  return null;
               }

               Iterator var4 = var53;

               while(true) {
                  try {
                     var45 = var4.hasNext();
                  } catch (Exception var24) {
                     var10001 = false;
                     break;
                  }

                  if (!var45) {
                     return var41;
                  }

                  Entry var55;
                  try {
                     var55 = (Entry)var4.next();
                  } catch (Exception var23) {
                     var10001 = false;
                     break;
                  }

                  Entry var5 = var55;

                  try {
                     var50 = ((ࢶ)var55.getValue()).ԩ;
                  } catch (Exception var22) {
                     var10001 = false;
                     break;
                  }

                  ࢮ.Ԩ var6 = var50;
                  if (var50 != null) {
                     try {
                        var41.addAll(var6.Ԫ.Ϳ(var1, var2, var3));
                     } catch (Exception var21) {
                        var10001 = false;
                        break;
                     }
                  } else {
                     try {
                        var45 = ((ࢶ)var5.getValue()).Ԩ;
                     } catch (Exception var20) {
                        var10001 = false;
                        break;
                     }

                     if (var45) {
                        ࢼ var56;
                        Intent var57;
                        try {
                           var56 = ࢼ.Ϳ;
                           var57 = new Intent;
                        } catch (Exception var19) {
                           var10001 = false;
                           break;
                        }

                        Intent var49 = var57;

                        try {
                           var49.<init>(var1);
                           var52 = var56.ԩ(var57.setPackage((String)var5.getKey()), var3);
                        } catch (Exception var18) {
                           var10001 = false;
                           break;
                        }

                        List var42 = var52;
                        if (var52 != null) {
                           try {
                              var41.addAll(var42);
                           } catch (Exception var17) {
                              var10001 = false;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public final List<ResolveInfo> _/* $FF was: Ԫ*/(@Nullable Intent var1, @Nullable String var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         ComponentName var10000;
         boolean var10001;
         try {
            var10000 = var1.getComponent();
         } catch (Exception var30) {
            var10001 = false;
            return null;
         }

         ComponentName var31 = var10000;
         if (var10000 == null) {
            Intent var43;
            try {
               var43 = var1.getSelector();
            } catch (Exception var29) {
               var10001 = false;
               return null;
            }

            Intent var32 = var43;
            if (var43 != null) {
               try {
                  var10000 = var32.getComponent();
               } catch (Exception var28) {
                  var10001 = false;
                  return null;
               }

               var31 = var10000;
            } else {
               var31 = null;
            }
         }

         ࢶ var44;
         boolean var45;
         ArrayList var47;
         if (var31 != null) {
            try {
               var44 = (ࢶ)Ԫ.get(var31.getPackageName());
            } catch (Exception var13) {
               var10001 = false;
               return null;
            }

            ࢶ var33 = var44;
            if (var44 == null) {
               return null;
            }

            try {
               var45 = var33.Ԩ;
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            if (var45) {
               return null;
            }

            ServiceInfo var46;
            try {
               var46 = (ServiceInfo)var33.Ԫ.Ԩ(var31.getClassName());
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            ServiceInfo var35 = var46;

            ArrayList var51;
            try {
               var51 = new ArrayList;
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            ArrayList var34 = var51;

            try {
               var51.<init>();
            } catch (Exception var9) {
               var10001 = false;
               return null;
            }

            if (var46 != null) {
               ResolveInfo var54;
               try {
                  var47 = var34;
                  var54 = new ResolveInfo;
               } catch (Exception var8) {
                  var10001 = false;
                  return null;
               }

               ResolveInfo var37;
               ResolveInfo var10002 = var37 = var54;

               try {
                  var10002.<init>();
                  var54.serviceInfo = var35;
                  var47.add(var37);
               } catch (Exception var7) {
                  var10001 = false;
                  return null;
               }
            }

            return var34;
         } else {
            String var48;
            try {
               var48 = var1.getPackage();
            } catch (Exception var27) {
               var10001 = false;
               return null;
            }

            String var36 = var48;
            ࢮ.Ԩ var50;
            List var52;
            if (var48 != null) {
               try {
                  var44 = (ࢶ)Ԫ.get(var36);
               } catch (Exception var16) {
                  var10001 = false;
                  return null;
               }

               ࢶ var38 = var44;
               if (var44 == null) {
                  return null;
               }

               try {
                  var50 = var38.ԩ;
               } catch (Exception var15) {
                  var10001 = false;
                  return null;
               }

               ࢮ.Ԩ var39 = var50;
               List var40;
               if (var50 != null) {
                  try {
                     var52 = var39.ԩ.Ϳ(var1, var2, var3);
                  } catch (Exception var14) {
                     var10001 = false;
                     return null;
                  }

                  var40 = var52;
               } else {
                  var40 = null;
               }

               return var40;
            } else {
               try {
                  var47 = new ArrayList;
               } catch (Exception var26) {
                  var10001 = false;
                  return null;
               }

               ArrayList var41 = var47;

               Iterator var53;
               try {
                  var47.<init>();
                  var53 = Ԫ.entrySet().iterator();
               } catch (Exception var25) {
                  var10001 = false;
                  return null;
               }

               Iterator var4 = var53;

               while(true) {
                  try {
                     var45 = var4.hasNext();
                  } catch (Exception var24) {
                     var10001 = false;
                     break;
                  }

                  if (!var45) {
                     return var41;
                  }

                  Entry var55;
                  try {
                     var55 = (Entry)var4.next();
                  } catch (Exception var23) {
                     var10001 = false;
                     break;
                  }

                  Entry var5 = var55;

                  try {
                     var50 = ((ࢶ)var55.getValue()).ԩ;
                  } catch (Exception var22) {
                     var10001 = false;
                     break;
                  }

                  ࢮ.Ԩ var6 = var50;
                  if (var50 != null) {
                     try {
                        var41.addAll(var6.ԩ.Ϳ(var1, var2, var3));
                     } catch (Exception var21) {
                        var10001 = false;
                        break;
                     }
                  } else {
                     try {
                        var45 = ((ࢶ)var5.getValue()).Ԩ;
                     } catch (Exception var20) {
                        var10001 = false;
                        break;
                     }

                     if (var45) {
                        ࢼ var56;
                        Intent var57;
                        try {
                           var56 = ࢼ.Ϳ;
                           var57 = new Intent;
                        } catch (Exception var19) {
                           var10001 = false;
                           break;
                        }

                        Intent var49 = var57;

                        try {
                           var49.<init>(var1);
                           var52 = var56.Ԫ(var57.setPackage((String)var5.getKey()), var3);
                        } catch (Exception var18) {
                           var10001 = false;
                           break;
                        }

                        List var42 = var52;
                        if (var52 != null) {
                           try {
                              var41.addAll(var42);
                           } catch (Exception var17) {
                              var10001 = false;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public final ServiceInfo _/* $FF was: Ԫ*/(@Nullable ComponentName var1, int var2) {
      if (var1 == null) {
         return null;
      } else {
         ࢶ var10000;
         boolean var10001;
         try {
            var10000 = (ࢶ)Ԫ.get(var1.getPackageName());
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         ࢶ var7 = var10000;
         if (var10000 == null) {
            return null;
         } else {
            boolean var8;
            try {
               var8 = var7.Ԩ;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            if (var8) {
               try {
                  return ࢼ.Ϳ.Ԫ(var1, var2);
               } catch (Exception var3) {
                  var10001 = false;
               }
            } else {
               try {
                  return (ServiceInfo)var7.Ԫ.Ԩ(var1.getClassName());
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public final ProviderInfo _/* $FF was: Ԩ*/(@Nullable ComponentName var1, int var2) {
      if (var1 == null) {
         return null;
      } else {
         ࢶ var10000;
         boolean var10001;
         try {
            var10000 = (ࢶ)Ԫ.get(var1.getPackageName());
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         ࢶ var7 = var10000;
         if (var10000 == null) {
            return null;
         } else {
            boolean var8;
            try {
               var8 = var7.Ԩ;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            if (var8) {
               try {
                  return ࢼ.Ϳ.Ԩ(var1, var2);
               } catch (Exception var3) {
                  var10001 = false;
               }
            } else {
               try {
                  return (ProviderInfo)var7.Ԫ.Ԩ(var1.getClassName());
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public final ActivityInfo _/* $FF was: Ϳ*/(@Nullable ComponentName var1, int var2) {
      if (var1 == null) {
         return null;
      } else {
         ࢶ var10000;
         boolean var10001;
         try {
            var10000 = (ࢶ)Ԫ.get(var1.getPackageName());
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         ࢶ var7 = var10000;
         if (var10000 == null) {
            return null;
         } else {
            boolean var8;
            try {
               var8 = var7.Ԩ;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            if (var8) {
               try {
                  return ࢼ.Ϳ.Ϳ(var1, var2);
               } catch (Exception var3) {
                  var10001 = false;
               }
            } else {
               try {
                  return (ActivityInfo)var7.Ԫ.Ԩ(var1.getClassName());
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public final ActivityInfo _/* $FF was: ԩ*/(@Nullable ComponentName var1, int var2) {
      if (var1 == null) {
         return null;
      } else {
         ࢶ var10000;
         boolean var10001;
         try {
            var10000 = (ࢶ)Ԫ.get(var1.getPackageName());
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         ࢶ var7 = var10000;
         if (var10000 == null) {
            return null;
         } else {
            boolean var8;
            try {
               var8 = var7.Ԩ;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            if (var8) {
               try {
                  return ࢼ.Ϳ.ԩ(var1, var2);
               } catch (Exception var3) {
                  var10001 = false;
               }
            } else {
               try {
                  return (ActivityInfo)var7.Ԫ.Ԩ(var1.getClassName());
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public final ApplicationInfo _/* $FF was: Ϳ*/(@Nullable String var1, int var2) {
      if (var1 == null) {
         return null;
      } else {
         ࢶ var10000;
         boolean var10001;
         try {
            var10000 = (ࢶ)Ԫ.get(var1);
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         ࢶ var7 = var10000;
         if (var10000 == null) {
            return null;
         } else {
            boolean var8;
            try {
               var8 = var7.Ԩ;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            if (var8) {
               try {
                  return ࢼ.Ϳ.Ϳ(var1, var2);
               } catch (Exception var3) {
                  var10001 = false;
               }
            } else {
               try {
                  return var7.Ϳ.applicationInfo;
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public final PackageInfo _/* $FF was: Ԩ*/(@Nullable String var1, int var2) {
      ࢶ var10000;
      boolean var10001;
      try {
         var10000 = (ࢶ)Ԫ.get(var1);
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }

      ࢶ var7 = var10000;
      if (var10000 == null) {
         return null;
      } else {
         boolean var8;
         try {
            var8 = var7.Ԩ;
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }

         if (var8) {
            try {
               return ࢼ.Ϳ.Ԩ(var1, var2);
            } catch (Exception var3) {
               var10001 = false;
            }
         } else {
            try {
               return ࢼ.Ϳ.Ϳ(var7.Ϳ, var2);
            } catch (Exception var4) {
               var10001 = false;
            }
         }

         return null;
      }
   }

   public final void _/* $FF was: ԭ*/() {
      label25: {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = Debug.isDebuggerConnected();
         } catch (Exception var3) {
            var10001 = false;
            break label25;
         }

         if (var10000) {
            try {
               ԭ.open();
               return;
            } catch (Exception var1) {
               var10001 = false;
            }
         } else {
            try {
               ࢦ.Ϳ.Ԩ(this::ԫ);
               return;
            } catch (Exception var2) {
               var10001 = false;
            }
         }
      }

      ԭ.open();
   }

   public final boolean ؠ(@Nullable String var1) {
      try {
         return Ԫ.containsKey(var1);
      } catch (Exception var2) {
         return false;
      }
   }

   public final boolean _/* $FF was: ׯ*/(@Nullable String param1) {
      // $FF: Couldn't be decompiled
   }

   public final int _/* $FF was: ԯ*/(@NotNull String var1) {
      ࢶ var10000;
      boolean var10001;
      try {
         var10000 = (ࢶ)Ԫ.get(var1);
      } catch (Exception var4) {
         var10001 = false;
         return -1;
      }

      ࢶ var5 = var10000;
      if (var10000 == null) {
         return -1;
      } else {
         boolean var6;
         try {
            var6 = var5.Ԩ;
         } catch (Exception var3) {
            var10001 = false;
            return -1;
         }

         if (var6) {
            return -1;
         } else {
            try {
               return var5.Ϳ.applicationInfo.uid;
            } catch (Exception var2) {
               var10001 = false;
               return -1;
            }
         }
      }
   }

   public final void _/* $FF was: ԩ*/(@Nullable String var1) {
      boolean var11;
      boolean var10001;
      label65: {
         if (var1 != null) {
            int var10000;
            try {
               var10000 = var1.length();
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            if (var10000 != 0) {
               var11 = false;
               break label65;
            }
         }

         var11 = true;
      }

      if (!var11) {
         ބ var12;
         try {
            ࢢ.Ϳ.Ϳ((String)var1, (String)null);
            var12 = Ԫ;
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         ބ var2 = var12;

         ࢶ var13;
         try {
            var13 = (ࢶ)var12.get(this.Ϳ((Object)var1));
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         ࢶ var3 = var13;
         PackageInfo var10;
         if (var13 != null) {
            PackageInfo var14;
            try {
               var14 = var3.Ϳ;
            } catch (Exception var6) {
               var10001 = false;
               return;
            }

            var10 = var14;
         } else {
            var10 = null;
         }

         ࢽ var15;
         String var16;
         try {
            var15 = this;
            var16 = var1;
            ࢦ.Ϳ.Ԩ(ࢽ::Ԫ);
            this.֏(var1);
            this.ԩ(var10);
            var2.remove(var1);
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         try {
            var15.Ϳ(var16, true);
            ࠨ.ޠ.ׯ();
         } catch (Exception var4) {
            var10001 = false;
         }

      }
   }

   public final void _/* $FF was: Ԭ*/(@Nullable String var1) {
      try {
         ࢦ.Ϳ.Ԩ(ࢽ::ԭ);
      } catch (Exception var2) {
      }

   }

   public final void _/* $FF was: Ϳ*/() {
      try {
         ࢦ.Ϳ.Ԩ(this::Ԩ);
      } catch (Exception var1) {
      }

   }

   public final void _/* $FF was: ԫ*/(@Nullable String var1) {
      if (var1 != null) {
         boolean var10001;
         try {
            ࢱ.Ϳ.getClass();
         } catch (Exception var29) {
            var10001 = false;
            return;
         }

         File var10000;
         try {
            var10000 = ࢱ.Ϳ().Ϳ(var1);
         } catch (Exception var28) {
            var10001 = false;
            return;
         }

         File var30 = var10000;
         String[] var10002;
         String[] var10003;
         Ⴧ var33;
         boolean var34;
         File var37;
         byte var39;
         if (var10000 != null) {
            try {
               var33 = Ⴧ.Ϳ;
               var37 = var30;
               var10002 = new String[4];
            } catch (Exception var27) {
               var10001 = false;
               return;
            }

            var10003 = var10002;
            String[] var10004 = var10002;
            String[] var10005 = var10002;
            String[] var10006 = var10002;
            byte var10007 = 0;

            try {
               var10006[var10007] = "Android";
            } catch (Exception var26) {
               var10001 = false;
               return;
            }

            byte var41 = 1;

            try {
               var10005[var41] = "data";
               var10004[2] = var1;
            } catch (Exception var25) {
               var10001 = false;
               return;
            }

            var39 = 3;

            try {
               var10003[var39] = "cache";
               var10000 = var33.Ϳ(var37, var10002);
            } catch (Exception var24) {
               var10001 = false;
               return;
            }

            var30 = var10000;

            try {
               var34 = var10000.exists();
            } catch (Exception var23) {
               var10001 = false;
               return;
            }

            if (var34) {
               try {
                  ࡧ.Ϳ.ԫ(var30);
               } catch (Exception var22) {
                  var10001 = false;
                  return;
               }
            }
         }

         String[] var35;
         try {
            var35 = ˉ.Ϳ.Ԩ(var1);
         } catch (Exception var21) {
            var10001 = false;
            return;
         }

         String[] var31 = var35;
         int var2 = 0;

         int var36;
         try {
            var36 = var35.length;
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         for(int var3 = var36; var2 < var3; ++var2) {
            String var38;
            try {
               var38 = ˉ.Ϳ(var1, var31[var2], false);
            } catch (Exception var19) {
               var10001 = false;
               break;
            }

            String var4 = var38;

            try {
               var33 = Ⴧ.Ϳ;
            } catch (Exception var18) {
               var10001 = false;
               break;
            }

            Ⴧ var5 = var33;

            String var40;
            try {
               var40 = var4;
               var10002 = new String[1];
            } catch (Exception var17) {
               var10001 = false;
               break;
            }

            var10003 = var10002;
            var39 = 0;

            try {
               var10003[var39] = "cache";
               var38 = var33.Ϳ(var40, var10002);
            } catch (Exception var16) {
               var10001 = false;
               break;
            }

            String var6 = var38;

            try {
               var10000 = new File;
            } catch (Exception var15) {
               var10001 = false;
               break;
            }

            File var7;
            var37 = var7 = var10000;

            try {
               var37.<init>(var6);
               var34 = var10000.exists();
            } catch (Exception var14) {
               var10001 = false;
               break;
            }

            if (var34) {
               try {
                  ࡧ.Ϳ.ԫ(var7);
               } catch (Exception var13) {
                  var10001 = false;
                  break;
               }
            }

            try {
               var33 = var5;
               var40 = var4;
               var10002 = new String[1];
            } catch (Exception var12) {
               var10001 = false;
               break;
            }

            var10003 = var10002;
            var39 = 0;

            try {
               var10003[var39] = "code_cache";
               var38 = var33.Ϳ(var40, var10002);
            } catch (Exception var11) {
               var10001 = false;
               break;
            }

            var4 = var38;

            try {
               var10000 = new File;
            } catch (Exception var10) {
               var10001 = false;
               break;
            }

            File var32;
            var37 = var32 = var10000;

            try {
               var37.<init>(var4);
               var34 = var10000.exists();
            } catch (Exception var9) {
               var10001 = false;
               break;
            }

            if (var34) {
               try {
                  ࡧ.Ϳ.ԫ(var32);
               } catch (Exception var8) {
                  var10001 = false;
                  break;
               }
            }
         }

      }
   }

   public final void _/* $FF was: Ԩ*/() {
      Iterator var10000;
      boolean var10001;
      try {
         var10000 = Ԫ.Ԩ().ԫ().iterator();
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      Iterator var1 = var10000;

      while(true) {
         boolean var5;
         try {
            var5 = var1.hasNext();
         } catch (Exception var3) {
            var10001 = false;
            break;
         }

         if (!var5) {
            break;
         }

         try {
            this.ԫ((String)var1.next());
         } catch (Exception var2) {
            var10001 = false;
            break;
         }
      }

   }

   public final void _/* $FF was: ԫ*/(@NotNull String var1, @NotNull String var2) {
      ބ var10000;
      boolean var10001;
      try {
         var10000 = Ԫ;
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      ބ var12 = var10000;

      ࢶ var15;
      try {
         var15 = (ࢶ)var10000.get(var1);
      } catch (Exception var10) {
         var10001 = false;
         return;
      }

      ࢶ var3 = var15;
      if (var15 == null) {
         PackageInfo var16;
         try {
            var16 = ࢼ.Ϳ.Ԩ((String)var1, 0);
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         PackageInfo var14 = var16;
         if (var16 == null) {
            return;
         }

         String var17;
         ࢶ var10002;
         try {
            var10000 = var12;
            var17 = var1;
            var10002 = new ࢶ;
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         ࢶ var10003 = var10002;
         ࢶ var13;
         ࢶ var10004 = var13 = var10002;

         try {
            var10004.<init>(var14);
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         boolean var18 = true;

         try {
            var10003.Ԩ = var18;
            var10002.ԫ.add(var2);
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         try {
            var10000.put(var17, var13);
         } catch (Exception var4) {
            var10001 = false;
         }
      } else {
         try {
            var3.ԫ.add(var2);
         } catch (Exception var9) {
            var10001 = false;
         }
      }

   }

   public final void _/* $FF was: Ԩ*/(@NotNull String var1, @NotNull String var2) {
      try {
         ࢦ.Ϳ.Ԩ(ࢽ::ԩ);
      } catch (Exception var3) {
      }

   }

   public final int _/* $FF was: Ԩ*/(@Nullable String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public final int _/* $FF was: ՠ*/(@Nullable String param1) {
      // $FF: Couldn't be decompiled
   }

   public final int _/* $FF was: ֈ*/(@Nullable String var1) {
      if (var1 == null) {
         return -2;
      } else {
         File var10000;
         boolean var10001;
         try {
            var10000 = new File;
         } catch (Exception var8) {
            var10001 = false;
            return -1;
         }

         File var2;
         File var13 = var2 = var10000;

         boolean var10;
         try {
            var13.<init>(var1);
            var10 = var10000.exists();
         } catch (Exception var7) {
            var10001 = false;
            return -1;
         }

         if (!var10) {
            return -2;
         } else {
            Triple var11;
            try {
               var11 = this.Ϳ(var2);
            } catch (Exception var6) {
               var10001 = false;
               return -1;
            }

            Triple var9 = var11;

            int var12;
            try {
               var12 = ((Number)var11.getSecond()).intValue();
            } catch (Exception var5) {
               var10001 = false;
               return -1;
            }

            if (var12 != 1) {
               try {
                  return ((Number)var9.getSecond()).intValue();
               } catch (Exception var3) {
                  var10001 = false;
               }
            } else {
               try {
                  Object var14 = var9.getFirst();
                  Intrinsics.checkNotNull(var14);
                  this.Ϳ((ࢶ)var14, (Boolean)var9.getThird());
                  return 1;
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return -1;
         }
      }
   }

   @Nullable
   public final ActivityInfo _/* $FF was: Ϳ*/(@Nullable Intent var1) {
      if (var1 == null) {
         return null;
      } else {
         ComponentName var10000;
         boolean var10001;
         try {
            var10000 = var1.getComponent();
         } catch (Exception var13) {
            var10001 = false;
            return null;
         }

         ComponentName var2 = var10000;
         if (var10000 == null) {
            Intent var17;
            try {
               var17 = var1.getSelector();
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            Intent var16 = var17;
            if (var17 != null) {
               try {
                  var10000 = var16.getComponent();
               } catch (Exception var11) {
                  var10001 = false;
                  return null;
               }

               var2 = var10000;
            } else {
               var2 = null;
            }
         }

         if (var2 != null) {
            ActivityInfo var18;
            try {
               var18 = this.Ϳ((ComponentName)var2, 128);
            } catch (Exception var6) {
               var10001 = false;
               return null;
            }

            ActivityInfo var14 = var18;
            if (var18 != null) {
               return var14;
            }

            try {
               return ࢼ.Ϳ.Ϳ((ComponentName)var2, 128);
            } catch (Exception var3) {
               var10001 = false;
            }
         } else {
            List var19;
            try {
               var19 = Ϳ(this, var1, (String)null, 0, 4, (Object)null);
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            boolean var20;
            List var15;
            label97: {
               var15 = var19;
               if (var19 != null) {
                  try {
                     var20 = var15.isEmpty();
                  } catch (Exception var9) {
                     var10001 = false;
                     return null;
                  }

                  if (!var20) {
                     var20 = false;
                     break label97;
                  }
               }

               var20 = true;
            }

            if (!var20) {
               try {
                  return ((ResolveInfo)var15.get(0)).activityInfo;
               } catch (Exception var5) {
                  var10001 = false;
               }
            } else {
               try {
                  var19 = ࢼ.Ԩ(ࢼ.Ϳ, var1, 0, 2, (Object)null);
               } catch (Exception var8) {
                  var10001 = false;
                  return null;
               }

               label85: {
                  var15 = var19;
                  if (var19 != null) {
                     try {
                        var20 = var15.isEmpty();
                     } catch (Exception var7) {
                        var10001 = false;
                        return null;
                     }

                     if (!var20) {
                        var20 = false;
                        break label85;
                     }
                  }

                  var20 = true;
               }

               if (!var20) {
                  try {
                     return ((ResolveInfo)var15.get(0)).activityInfo;
                  } catch (Exception var4) {
                     var10001 = false;
                  }
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public final ServiceInfo _/* $FF was: Ԩ*/(@Nullable Intent var1) {
      if (var1 == null) {
         return null;
      } else {
         ComponentName var10000;
         boolean var10001;
         try {
            var10000 = var1.getComponent();
         } catch (Exception var15) {
            var10001 = false;
            return null;
         }

         ComponentName var2 = var10000;
         if (var10000 == null) {
            Intent var19;
            try {
               var19 = var1.getSelector();
            } catch (Exception var14) {
               var10001 = false;
               return null;
            }

            Intent var18 = var19;
            if (var19 != null) {
               try {
                  var10000 = var18.getComponent();
               } catch (Exception var13) {
                  var10001 = false;
                  return null;
               }

               var2 = var10000;
            } else {
               var2 = null;
            }
         }

         if (var2 != null) {
            ServiceInfo var20;
            try {
               var20 = this.Ԫ(var2, 128);
            } catch (Exception var6) {
               var10001 = false;
               return null;
            }

            ServiceInfo var16 = var20;
            if (var20 != null) {
               return var16;
            }

            try {
               return ࢼ.Ϳ.Ԫ((ComponentName)var2, 128);
            } catch (Exception var4) {
               var10001 = false;
            }
         } else {
            String var21;
            try {
               var21 = var1.getPackage();
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            if (var21 == null) {
               try {
                  var1.toString();
               } catch (Exception var11) {
                  var10001 = false;
                  return null;
               }
            }

            List var17;
            List var22;
            boolean var23;
            label143: {
               try {
                  var22 = Ԫ(this, var1, (String)null, 0, 6, (Object)null);
               } catch (Exception var10) {
                  var10001 = false;
                  break label143;
               }

               label108: {
                  var17 = var22;
                  if (var22 != null) {
                     try {
                        var23 = var17.isEmpty();
                     } catch (Exception var9) {
                        var10001 = false;
                        break label143;
                     }

                     if (!var23) {
                        var23 = false;
                        break label108;
                     }
                  }

                  var23 = true;
               }

               if (!var23) {
                  try {
                     return ((ResolveInfo)var17.get(0)).serviceInfo;
                  } catch (Exception var5) {
                     var10001 = false;
                  }
               }
            }

            try {
               var22 = ࢼ.Ϳ.Ԫ(var1, 131072);
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }

            label94: {
               var17 = var22;
               if (var22 != null) {
                  try {
                     var23 = var17.isEmpty();
                  } catch (Exception var7) {
                     var10001 = false;
                     return null;
                  }

                  if (!var23) {
                     var23 = false;
                     break label94;
                  }
               }

               var23 = true;
            }

            if (!var23) {
               try {
                  return ((ResolveInfo)var17.get(0)).serviceInfo;
               } catch (Exception var3) {
                  var10001 = false;
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public final ProviderInfo _/* $FF was: Ԯ*/(@Nullable String var1) {
      ProviderInfo var3;
      if (var1 != null) {
         ProviderInfo var10000;
         try {
            var10000 = (ProviderInfo)ԫ.get(var1);
         } catch (Exception var2) {
            return null;
         }

         var3 = var10000;
      } else {
         var3 = null;
      }

      return var3;
   }

   @NotNull
   public final List<String> _/* $FF was: Ϳ*/(@NotNull String var1, int var2, int var3) {
      int var10000;
      boolean var10001;
      ޅ var27;
      try {
         var10000 = var2;
         var27 = new ޅ;
      } catch (Exception var20) {
         var10001 = false;
         return new ArrayList();
      }

      ޅ var4 = var27;
      byte var10002 = 1;

      try {
         var27.<init>(var10002, false);
         ࢦ.Ϳ.getClass();
      } catch (Exception var19) {
         var10001 = false;
         return new ArrayList();
      }

      int var30;
      try {
         var30 = ࢦ.ԯ;
      } catch (Exception var18) {
         var10001 = false;
         return new ArrayList();
      }

      if (var10000 == var30) {
         if (var3 >= 0) {
            String var25;
            try {
               var25 = ࢢ.Ϳ.Ϳ(var3);
            } catch (Exception var17) {
               var10001 = false;
               return new ArrayList();
            }

            String var24 = var25;
            if (var25 != null) {
               try {
                  var4.add(var24);
               } catch (Exception var16) {
                  var10001 = false;
                  return new ArrayList();
               }
            }
         }

         try {
            var10000 = this.ԯ(var1);
         } catch (Exception var15) {
            var10001 = false;
            return new ArrayList();
         }

         var2 = var10000;
         if (var10000 < 0) {
            ޅ var32;
            try {
               var32 = var4;
               CollectionsKt.addAll(var4, ࢼ.Ϳ.Ԩ(var1));
            } catch (Exception var6) {
               var10001 = false;
               return new ArrayList();
            }

            try {
               return CollectionsKt.toList(var32);
            } catch (Exception var5) {
               var10001 = false;
               return new ArrayList();
            }
         }
      }

      Iterator var26;
      try {
         var26 = Ԫ.Ԩ().Ԭ().iterator();
      } catch (Exception var14) {
         var10001 = false;
         return new ArrayList();
      }

      Iterator var21 = var26;

      while(true) {
         boolean var28;
         try {
            var28 = var21.hasNext();
         } catch (Exception var8) {
            var10001 = false;
            break;
         }

         if (!var28) {
            try {
               return CollectionsKt.toList(var4);
            } catch (Exception var7) {
               var10001 = false;
               break;
            }
         }

         ࢶ var29;
         try {
            var29 = (ࢶ)var21.next();
         } catch (Exception var13) {
            var10001 = false;
            break;
         }

         ࢶ var22 = var29;

         try {
            var28 = var29.Ԩ;
         } catch (Exception var12) {
            var10001 = false;
            break;
         }

         if (!var28) {
            PackageInfo var31;
            try {
               var31 = var22.Ϳ;
            } catch (Exception var11) {
               var10001 = false;
               break;
            }

            PackageInfo var23 = var31;

            try {
               var10000 = var31.applicationInfo.uid;
            } catch (Exception var10) {
               var10001 = false;
               break;
            }

            if (var10000 == var2) {
               try {
                  var4.add(var23.packageName);
               } catch (Exception var9) {
                  var10001 = false;
                  break;
               }
            }
         }
      }

      return new ArrayList();
   }

   public final void _/* $FF was: ԫ*/(@Nullable ComponentName param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable ComponentName var1) {
      boolean var3;
      if (var1 != null) {
         boolean var10000;
         try {
            var10000 = Ԭ.contains(var1);
         } catch (Exception var2) {
            return false;
         }

         var3 = var10000;
      } else {
         var3 = false;
      }

      return var3;
   }

   @Nullable
   public final List<ProviderInfo> _/* $FF was: Ϳ*/(@Nullable String var1, int var2, @Nullable String var3) {
      String var10000;
      boolean var10001;
      ArrayList var30;
      try {
         var10000 = var1;
         var30 = new ArrayList;
      } catch (Exception var23) {
         var10001 = false;
         return null;
      }

      ArrayList var24 = var30;

      try {
         var30.<init>();
      } catch (Exception var22) {
         var10001 = false;
         return null;
      }

      int var28;
      boolean var29;
      label168: {
         if (var10000 != null) {
            try {
               var28 = var1.length();
            } catch (Exception var21) {
               var10001 = false;
               return null;
            }

            if (var28 != 0) {
               var29 = false;
               break label168;
            }
         }

         var29 = true;
      }

      if (var29) {
         return var24;
      } else {
         boolean var25;
         label159: {
            if (var3 != null) {
               try {
                  var28 = var3.length();
               } catch (Exception var20) {
                  var10001 = false;
                  return null;
               }

               if (var28 != 0) {
                  var25 = false;
                  break label159;
               }
            }

            var25 = true;
         }

         Iterator var31;
         try {
            var31 = Ԫ.entrySet().iterator();
         } catch (Exception var19) {
            var10001 = false;
            return null;
         }

         Iterator var4 = var31;

         label148:
         while(true) {
            try {
               var29 = var4.hasNext();
            } catch (Exception var18) {
               var10001 = false;
               break;
            }

            if (!var29) {
               return var24;
            }

            ProviderInfo[] var32;
            try {
               var32 = ((ࢶ)((Entry)var4.next()).getValue()).Ϳ.providers;
            } catch (Exception var17) {
               var10001 = false;
               break;
            }

            ProviderInfo[] var5;
            label145: {
               var5 = var32;
               if (var32 != null) {
                  try {
                     var28 = var5.length;
                  } catch (Exception var16) {
                     var10001 = false;
                     break;
                  }

                  if (var28 != 0) {
                     var29 = false;
                     break label145;
                  }
               }

               var29 = true;
            }

            if (!var29) {
               try {
                  var31 = ArrayIteratorKt.iterator(var5);
               } catch (Exception var15) {
                  var10001 = false;
                  break;
               }

               Iterator var26 = var31;

               while(true) {
                  ProviderInfo var6;
                  do {
                     do {
                        try {
                           var29 = var26.hasNext();
                        } catch (Exception var12) {
                           var10001 = false;
                           return null;
                        }

                        if (!var29) {
                           continue label148;
                        }

                        ProviderInfo var33;
                        try {
                           var33 = (ProviderInfo)var26.next();
                        } catch (Exception var11) {
                           var10001 = false;
                           return null;
                        }

                        var6 = var33;

                        try {
                           var29 = Intrinsics.areEqual(var33.processName, var1);
                        } catch (Exception var10) {
                           var10001 = false;
                           return null;
                        }
                     } while(!var29);

                     if (var25) {
                        break;
                     }

                     Bundle var34;
                     try {
                        var34 = var6.metaData;
                     } catch (Exception var9) {
                        var10001 = false;
                        return null;
                     }

                     Bundle var7 = var34;
                     if (var34 != null) {
                        try {
                           var29 = var7.containsKey(var3);
                        } catch (Exception var8) {
                           var10001 = false;
                           return null;
                        }

                        if (var29) {
                           var29 = true;
                           continue;
                        }
                     }

                     var29 = false;
                  } while(!var29);

                  ProviderInfo var35;
                  ArrayList var36;
                  try {
                     var36 = var24;
                     var35 = new ProviderInfo;
                  } catch (Exception var14) {
                     var10001 = false;
                     return null;
                  }

                  ProviderInfo var27 = var35;

                  try {
                     var35.<init>(var6);
                     var36.add(var27);
                  } catch (Exception var13) {
                     var10001 = false;
                     return null;
                  }
               }
            }
         }

         return null;
      }
   }

   @NotNull
   public final String _/* $FF was: Ԫ*/(@NotNull String var1, @NotNull String var2) {
      ࢶ var10000;
      boolean var10001;
      try {
         var10000 = (ࢶ)Ԫ.get(var1);
      } catch (Exception var6) {
         var10001 = false;
         return ࢪ.֏.Ϳ();
      }

      ࢶ var7 = var10000;
      if (var10000 == null) {
         try {
            return ࢪ.֏.Ϳ();
         } catch (Exception var3) {
            var10001 = false;
         }
      } else {
         boolean var8;
         try {
            var8 = var7.ԫ.contains(var2);
         } catch (Exception var5) {
            var10001 = false;
            return ࢪ.֏.Ϳ();
         }

         if (var8) {
            return var2;
         }

         try {
            return ࢪ.֏.Ϳ();
         } catch (Exception var4) {
            var10001 = false;
         }
      }

      return ࢪ.֏.Ϳ();
   }

   @NotNull
   public final String[] ހ(@NotNull String var1) {
      ࢶ var10000;
      boolean var10001;
      try {
         var10000 = (ࢶ)Ԫ.get(var1);
      } catch (Exception var6) {
         var10001 = false;
         return new String[]{ࢪ.֏.Ϳ()};
      }

      ࢶ var7 = var10000;
      String[] var9;
      String[] var11;
      if (var10000 != null) {
         ޅ var10;
         try {
            var10 = var7.ԫ;
         } catch (Exception var5) {
            var10001 = false;
            return new String[]{ࢪ.֏.Ϳ()};
         }

         ޅ var8 = var10;
         if (var10 != null) {
            try {
               var11 = (String[])var8.toArray(new String[0]);
            } catch (Exception var4) {
               var10001 = false;
               return new String[]{ࢪ.֏.Ϳ()};
            }

            var9 = var11;
            if (var11 != null) {
               return var9;
            }
         }
      }

      try {
         var11 = new String[1];
      } catch (Exception var3) {
         var10001 = false;
         return new String[]{ࢪ.֏.Ϳ()};
      }

      var9 = var11;
      byte var12 = 0;

      try {
         var11[var12] = ࢪ.֏.Ϳ();
         return var9;
      } catch (Exception var2) {
         var10001 = false;
         return new String[]{ࢪ.֏.Ϳ()};
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      try {
         this.ԫ(var1, var2);
         ˉ.Ϳ.Ԩ(var1, var2);
      } catch (Exception var3) {
      }

   }
}
