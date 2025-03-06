package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.ProviderInfo;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDiscoveryLocalNotificationObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryLocalNotificationObserver.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalNotificationObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1855#2,2:305\n1855#2,2:309\n13309#3,2:307\n1#4:311\n*S KotlinDebug\n*F\n+ 1 DiscoveryLocalNotificationObserver.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalNotificationObserver\n*L\n101#1:305,2\n162#1:309,2\n138#1:307,2\n*E\n"})
public final class ޥ {
   @NotNull
   public static final ޥ.Ϳ ԭ = new ޥ.Ϳ();
   @NotNull
   public static final ޥ Ԯ = new ޥ();
   @NotNull
   public static final String ԯ = "inner";
   @NotNull
   public static final String ՠ = "@";
   @NotNull
   public final ૹ<Object> Ϳ;
   @NotNull
   public final ૹ<Integer> Ԩ;
   @NotNull
   public final ૹ<Object> ԩ;
   @NotNull
   public final ૹ<String> Ԫ;
   @NotNull
   public final ૹ<Integer> ԫ;
   @NotNull
   public final ૹ<Object> Ԭ;

   public ޥ() {
      ޥ var10000 = this;
      ޥ var10001 = this;
      ޥ var10002 = this;
      ޥ var10003 = this;
      ޥ var10004 = this;
      ޥ var10005 = this;
      super();
      ૹ var1;
      var1 = new ૹ.<init>("mId");
      var10005.Ϳ = var1;
      var1 = new ૹ.<init>("mType");
      var10004.Ԩ = var1;
      var1 = new ૹ.<init>("mObj1");
      var10003.ԩ = var1;
      var1 = new ૹ.<init>("mString1");
      var10002.Ԫ = var1;
      var1 = new ૹ.<init>("mInt1");
      var10001.ԫ = var1;
      var1 = new ૹ.<init>("mChannelId");
      var10000.Ԭ = var1;
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/(@Nullable String var1) {
      return this.Ϳ(ࢦ.Ϳ.ԩ(), var1);
   }

   @RequiresApi(26)
   public final boolean _/* $FF was: Ϳ*/(@Nullable NotificationChannel var1) {
      if (var1 != null) {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = this.Ԫ(var1.getId());
         } catch (Exception var3) {
            var10001 = false;
            return false;
         }

         if (var10000) {
            try {
               this.Ϳ.Ϳ(var1, this.ԫ(var1.getId()));
               return true;
            } catch (Exception var2) {
               var10001 = false;
            }
         }
      }

      return false;
   }

   @RequiresApi(26)
   @Nullable
   public final List<NotificationChannel> _/* $FF was: Ϳ*/(@Nullable List<NotificationChannel> var1) {
      List var10000;
      boolean var10001;
      ArrayList var15;
      try {
         var10000 = var1;
         var15 = new ArrayList;
      } catch (Exception var11) {
         var10001 = false;
         return var1;
      }

      ArrayList var2 = var15;

      try {
         var15.<init>();
      } catch (Exception var10) {
         var10001 = false;
         return var1;
      }

      if (var10000 == null) {
         return var2;
      } else {
         Iterator var12;
         try {
            var12 = var1.iterator();
         } catch (Exception var9) {
            var10001 = false;
            return var1;
         }

         Iterator var3 = var12;

         while(true) {
            boolean var13;
            try {
               var13 = var3.hasNext();
            } catch (Exception var8) {
               var10001 = false;
               break;
            }

            if (!var13) {
               return var2;
            }

            NotificationChannel var16;
            ޥ var14;
            try {
               var14 = this;
               var16 = (NotificationChannel)var3.next();
            } catch (Exception var7) {
               var10001 = false;
               break;
            }

            NotificationChannel var4 = var16;

            try {
               var13 = var14.Ϳ(var16);
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            if (var13) {
               try {
                  var2.add(var4);
               } catch (Exception var5) {
                  var10001 = false;
                  break;
               }
            }
         }

         return var1;
      }
   }

   @RequiresApi(26)
   @Nullable
   public final NotificationChannel _/* $FF was: Ԩ*/(@Nullable NotificationChannel var1) {
      if (var1 != null) {
         try {
            this.Ϳ.Ϳ(var1, this.Ϳ(var1.getId()));
         } catch (Exception var2) {
         }
      }

      return var1;
   }

   @RequiresApi(26)
   @Nullable
   public final List<NotificationChannel> _/* $FF was: Ԩ*/(@Nullable List<NotificationChannel> var1) {
      if (var1 != null) {
         Iterator var10000;
         boolean var10001;
         try {
            var10000 = var1.iterator();
         } catch (Exception var5) {
            var10001 = false;
            return var1;
         }

         Iterator var2 = var10000;

         while(true) {
            boolean var6;
            try {
               var6 = var2.hasNext();
            } catch (Exception var4) {
               var10001 = false;
               break;
            }

            if (!var6) {
               break;
            }

            try {
               this.Ԩ((NotificationChannel)var2.next());
            } catch (Exception var3) {
               var10001 = false;
               break;
            }
         }
      }

      return var1;
   }

   @SuppressLint({"ResourceType"})
   @Nullable
   public final Notification _/* $FF was: Ԩ*/(@Nullable Notification param1) {
      // $FF: Couldn't be decompiled
   }

   @RequiresApi(26)
   public final void _/* $FF was: Ԩ*/(@Nullable String var1) {
      String var15;
      ޥ var10000;
      NotificationManager var16;
      boolean var10001;
      try {
         var10000 = this;
         var15 = var1;
         Object var10002 = ࢦ.ֈ().getSystemService("notification");
         Intrinsics.checkNotNull(var10002);
         var16 = (NotificationManager)var10002;
      } catch (Exception var10) {
         var10001 = false;
         return;
      }

      NotificationManager var11 = var16;

      String var12;
      try {
         var12 = var10000.ԩ(var15);
      } catch (Exception var9) {
         var10001 = false;
         return;
      }

      var1 = var12;

      Iterator var13;
      try {
         var13 = var11.getNotificationChannels().iterator();
      } catch (Exception var8) {
         var10001 = false;
         return;
      }

      Iterator var2 = var13;

      while(true) {
         boolean var14;
         try {
            var14 = var2.hasNext();
         } catch (Exception var7) {
            var10001 = false;
            break;
         }

         if (!var14) {
            break;
         }

         try {
            var12 = ((NotificationChannel)var2.next()).getId();
         } catch (Exception var6) {
            var10001 = false;
            break;
         }

         String var3 = var12;

         try {
            var14 = StringsKt.startsWith$default(var12, var1, false, 2, (Object)null);
         } catch (Exception var5) {
            var10001 = false;
            break;
         }

         if (var14) {
            try {
               var11.deleteNotificationChannel(var3);
            } catch (Exception var4) {
            }
         }
      }

   }

   public final String _/* $FF was: ԩ*/(String var1) {
      return "inner@" + var1 + '@';
   }

   public final String _/* $FF was: Ϳ*/(String var1, String var2) {
      if (Intrinsics.areEqual(var2, "foza_channel")) {
         return var2;
      } else {
         StringBuilder var3;
         StringBuilder var10000 = var3 = new StringBuilder;
         var3.<init>();
         return var10000.append(this.ԩ(var1)).append(var2).toString();
      }
   }

   public final String _/* $FF was: Ԩ*/() {
      return ࢦ.Ϳ.ԩ();
   }

   public final String _/* $FF was: ԫ*/(String var1) {
      String var2 = this.ԩ(ࢦ.Ϳ.ԩ());
      if (var1 != null && StringsKt.startsWith$default(var1, var2, false, 2, (Object)null)) {
         String var10000 = var1.substring(var2.length());
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         return var10000;
      } else {
         return var1;
      }
   }

   public final boolean _/* $FF was: Ԫ*/(String var1) {
      if (var1 != null) {
         boolean var10000;
         try {
            var10000 = StringsKt.startsWith$default(var1, this.ԩ(ࢦ.Ϳ.ԩ()), false, 2, (Object)null);
         } catch (Exception var2) {
            return false;
         }

         if (var10000) {
            return true;
         }
      }

      return false;
   }

   public final void _/* $FF was: Ϳ*/(Icon var1) {
      if (var1 != null) {
         ޥ var10000;
         boolean var10001;
         Icon var10002;
         ૹ var4;
         try {
            var10000 = this;
            this.Ԩ.Ϳ(var1, (int)2);
            this.ԩ.Ϳ(var1, ࢦ.ֈ().getResources());
            var4 = this.Ԫ;
            var10002 = var1;
            ࢦ.Ϳ.getClass();
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         try {
            var4.Ϳ(var10002, ࢦ.Ԯ);
            var10000.ԫ.Ϳ(var1, (int)17629184);
         } catch (Exception var2) {
            var10001 = false;
         }
      }

   }

   public final void _/* $FF was: Ϳ*/(Icon... var1) {
      Icon[] var10000 = var1;
      int var2 = 0;

      boolean var10001;
      int var6;
      try {
         var6 = var10000.length;
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      for(int var3 = var6; var2 < var3; ++var2) {
         try {
            this.Ϳ(var1[var2]);
         } catch (Exception var4) {
            var10001 = false;
            break;
         }
      }

   }

   public final void _/* $FF was: Ϳ*/(Notification var1) {
      if (var1 != null) {
         Notification var10000;
         boolean var10001;
         int var4;
         try {
            var10000 = var1;
            var4 = var1.flags;
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         var4 &= -3;

         try {
            var10000.flags = var4;
         } catch (Exception var2) {
            var10001 = false;
         }

      }
   }

   public final Uri _/* $FF was: Ϳ*/(Uri var1) {
      if (var1 != null) {
         String var10000;
         boolean var10001;
         try {
            var10000 = var1.getAuthority();
         } catch (Exception var25) {
            var10001 = false;
            return var1;
         }

         String var26 = var10000;
         if (var10000 != null) {
            boolean var28;
            try {
               var28 = Intrinsics.areEqual(var1.getScheme(), "content");
            } catch (Exception var24) {
               var10001 = false;
               return var1;
            }

            if (!var28) {
               return var1;
            }

            FozaStubProvider.Ϳ var29;
            try {
               var29 = FozaStubProvider.Ϳ;
            } catch (Exception var23) {
               var10001 = false;
               return var1;
            }

            FozaStubProvider.Ϳ var2 = var29;

            try {
               var28 = var29.Ϳ(var26.hashCode());
            } catch (Exception var22) {
               var10001 = false;
               return var1;
            }

            if (var28) {
               return var1;
            }

            ࢦ var30;
            try {
               var30 = ࢦ.Ϳ;
            } catch (Exception var21) {
               var10001 = false;
               return var1;
            }

            ࢦ var3 = var30;

            try {
               var30.getClass();
            } catch (Exception var20) {
               var10001 = false;
               return var1;
            }

            try {
               var28 = ࢦ.ԩ;
            } catch (Exception var19) {
               var10001 = false;
               return var1;
            }

            ProviderInfo var4;
            label153: {
               ProviderInfo var31;
               if (var28) {
                  try {
                     ࡠ.ԩ.getClass();
                  } catch (Exception var18) {
                     var10001 = false;
                     return var1;
                  }

                  try {
                     var31 = ࡠ.ԫ().ԩ(var26);
                  } catch (Exception var17) {
                     var10001 = false;
                     return var1;
                  }

                  var4 = var31;
                  if (var31 != null) {
                     break label153;
                  }

                  try {
                     var31 = ࢼ.Ϳ.ԩ(var26);
                  } catch (Exception var16) {
                     var10001 = false;
                     return var1;
                  }
               } else {
                  try {
                     var31 = ࢼ.Ϳ.ԩ(var26);
                  } catch (Exception var15) {
                     var10001 = false;
                     return var1;
                  }

                  var4 = var31;
                  if (var31 != null) {
                     break label153;
                  }

                  try {
                     ࡠ.ԩ.getClass();
                  } catch (Exception var14) {
                     var10001 = false;
                     return var1;
                  }

                  try {
                     var31 = ࡠ.ԫ().ԩ(var26);
                  } catch (Exception var13) {
                     var10001 = false;
                     return var1;
                  }
               }

               var4 = var31;
            }

            if (var4 == null) {
               return var1;
            }

            try {
               var28 = Intrinsics.areEqual(var4.packageName, var3.ԩ());
            } catch (Exception var12) {
               var10001 = false;
               return var1;
            }

            if (!var28) {
               return var1;
            }

            try {
               var28 = Intrinsics.areEqual(var4.processName, var3.Ԫ());
            } catch (Exception var11) {
               var10001 = false;
               return var1;
            }

            if (var28) {
               Uri var34;
               try {
                  var29 = var2;
                  var34 = var1;
                  var3.getClass();
               } catch (Exception var7) {
                  var10001 = false;
                  return var1;
               }

               try {
                  return var29.Ԩ(var34, ࢦ.Ԩ);
               } catch (Exception var5) {
                  var10001 = false;
                  return var1;
               }
            } else {
               try {
                  ޠ.Ԫ.getClass();
               } catch (Exception var10) {
                  var10001 = false;
                  return var1;
               }

               ޠ var32;
               ProviderInfo var35;
               try {
                  var32 = ޠ.ԫ();
                  var35 = var4;
                  var3.getClass();
               } catch (Exception var9) {
                  var10001 = false;
                  return var1;
               }

               int var33;
               try {
                  var33 = var32.Ϳ(var35, ࢦ.Ԫ);
               } catch (Exception var8) {
                  var10001 = false;
                  return var1;
               }

               int var27 = var33;
               if (var33 > 0) {
                  try {
                     return var2.Ԩ(var1, var27);
                  } catch (Exception var6) {
                     var10001 = false;
                  }
               }

               return var1;
            }
         }
      }

      return var1;
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ޥ _/* $FF was: Ϳ*/() {
         return ޥ.Ԯ;
      }
   }
}
