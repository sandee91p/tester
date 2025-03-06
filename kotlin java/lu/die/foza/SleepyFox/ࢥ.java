package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"NewApi"})
public final class ࢥ extends AppComponentFactory {
   @NotNull
   public static final ࢥ.Ϳ Ԩ = new ࢥ.Ϳ();
   @NotNull
   public final AppComponentFactory Ϳ;

   public ࢥ(@NotNull AppComponentFactory var1) {
      this.Ϳ = var1;
   }

   @NotNull
   public ClassLoader instantiateClassLoader(@NotNull ClassLoader var1, @NotNull ApplicationInfo var2) {
      return this.Ϳ.instantiateClassLoader(var1, var2);
   }

   @NotNull
   public Application instantiateApplication(@NotNull ClassLoader var1, @NotNull String var2) {
      return this.Ϳ.instantiateApplication(var1, var2);
   }

   @NotNull
   public Activity instantiateActivity(@NotNull ClassLoader var1, @NotNull String var2, @Nullable Intent var3) {
      return this.Ϳ.instantiateActivity(var1, var2, var3);
   }

   @NotNull
   public ContentProvider instantiateProvider(@NotNull ClassLoader var1, @NotNull String var2) {
      return this.Ϳ.instantiateProvider(var1, var2);
   }

   @NotNull
   public BroadcastReceiver instantiateReceiver(@NotNull ClassLoader var1, @NotNull String var2, @Nullable Intent var3) {
      try {
         return this.Ϳ.instantiateReceiver(var1, var2, var3);
      } catch (ClassNotFoundException var4) {
         return super.instantiateReceiver(ActivityThread.currentApplication().getClassLoader(), var2, var3);
      }
   }

   @NotNull
   public Service instantiateService(@NotNull ClassLoader var1, @NotNull String var2, @Nullable Intent var3) {
      try {
         return this.Ϳ.instantiateService(var1, var2, var3);
      } catch (ClassNotFoundException var4) {
         return super.instantiateService(ActivityThread.currentApplication().getClassLoader(), var2, var3);
      }
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      public final void _/* $FF was: Ϳ*/() {
         boolean var10001;
         try {
            ߿.Ϳ.getClass();
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         Object var10000;
         try {
            var10000 = ߿.Ԫ.ԩ(ࢦ.ֈ());
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         Object var11 = var10000;
         if (var10000 != null) {
            ૹ var13;
            try {
               var13 = new ૹ;
            } catch (Exception var8) {
               var10001 = false;
               return;
            }

            ૹ var1 = var13;

            AppComponentFactory var14;
            try {
               var1.<init>("mAppComponentFactory");
               var14 = (AppComponentFactory)var13.ԩ(var11);
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            AppComponentFactory var2 = var14;
            if (var14 != null) {
               boolean var15;
               try {
                  var15 = var2 instanceof ࢥ;
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               if (!var15) {
                  try {
                     var13 = var1;
                     Unit var16 = Unit.INSTANCE;
                  } catch (Exception var5) {
                     var10001 = false;
                     return;
                  }

                  ࢥ var17;
                  try {
                     var17 = new ࢥ;
                  } catch (Exception var4) {
                     var10001 = false;
                     return;
                  }

                  ࢥ var12 = var17;

                  try {
                     var17.<init>(var2);
                     var13.Ϳ(var11, var12);
                  } catch (Exception var3) {
                     var10001 = false;
                  }

               }
            }
         }
      }
   }
}
