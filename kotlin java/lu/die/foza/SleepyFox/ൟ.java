package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ൟ {
   @NotNull
   public static final ൟ Ϳ = new ൟ();
   @Nullable
   public static Object Ԩ;
   @Nullable
   public static Object ԩ;
   @Nullable
   public static Object Ԫ;
   @Nullable
   public static Object ԫ;

   public static final Object _/* $FF was: Ԩ*/(Object var0, Method var1, Object[] var2) {
      if (Intrinsics.areEqual("checkPrimaryVolumeIsSD", var1.getName())) {
         var0 = Boolean.FALSE;
      } else {
         var0 = Ԩ;
         if (var2 == null) {
            var2 = ބ.Ԫ.ԩ;
         }

         var0 = var1.invoke(var0, var2);
      }

      return var0;
   }

   public static final Object _/* $FF was: Ϳ*/(Object var0, final Method var1, final Object[] var2) {
      if (Intrinsics.areEqual("getVolumeList", var1.getName())) {
         if (!ࢦ.Ϳ.ރ()) {
            var0 = Ԫ;
            if (var2 == null) {
               var2 = ބ.Ԫ.ԩ;
            }

            var0 = var1.invoke(var0, var2);
         } else {
            ࢰ.Ϳ.getClass();
            var0 = ࢰ.Ԩ.invoke(new Function0<Object>() {
               public final Object invoke() {
                  <undefinedtype> var10000 = this;
                  Method var3 = var1;
                  Object var1x = ൟ.Ԫ;
                  Object[] var2x;
                  if ((var2x = var2) == null) {
                     var2x = ބ.Ԫ.ԩ;
                  }

                  Object var5;
                  Object var4 = var5 = var3.invoke(var1x, var2x);
                  ࡡ.Ϳ var7;
                  (var7 = ࡡ.Ϳ).getClass();
                  ࡡ.Ϳ().getClass();
                  if (var4 instanceof Object[]) {
                     var7.getClass();
                     ࡡ var6 = ࡡ.Ϳ();
                     Intrinsics.checkNotNullExpressionValue(Arrays.toString((Object[])var5), "toString(...)");
                     var6.getClass();
                  }

                  return var5;
               }
            });
         }

         return var0;
      } else {
         var0 = Ԫ;
         if (var2 == null) {
            var2 = ބ.Ԫ.ԩ;
         }

         return var1.invoke(var0, var2);
      }
   }

   public static final Object _/* $FF was: Ϳ*/(ObjectRef var0, Object var1, Method var2, Object[] var3) {
      Object var4;
      String var5;
      if (Intrinsics.areEqual(var5 = var2.getName(), "getHwSettingsManager")) {
         var4 = var0.element;
         if (var3 == null) {
            var3 = ބ.Ԫ.ԩ;
         }

         Ԩ = var2.invoke(var4, var3);
         var4 = Ϳ.Ԫ();
      } else if (Intrinsics.areEqual(var5, "getHwApiCacheManagerEx")) {
         var4 = var0.element;
         if (var3 == null) {
            var3 = ބ.Ԫ.ԩ;
         }

         Ԫ = var2.invoke(var4, var3);
         var4 = Ϳ.ԩ();
      } else {
         var4 = var0.element;
         if (var3 == null) {
            var3 = ބ.Ԫ.ԩ;
         }

         var4 = var2.invoke(var4, var3);
      }

      return var4;
   }

   @SuppressLint({"PrivateApi"})
   public final void _/* $FF was: Ԩ*/() {
      // $FF: Couldn't be decompiled
   }

   @SuppressLint({"PrivateApi"})
   public final Object _/* $FF was: Ԫ*/() {
      if (ԩ == null) {
         ԩ = Proxy.newProxyInstance(Class.forName("android.common.HwSettingsManager").getClassLoader(), new Class[]{Class.forName("android.common.HwSettingsManager")}, ൟ::Ԩ);
      }

      return ԩ;
   }

   @SuppressLint({"PrivateApi"})
   public final Object _/* $FF was: ԩ*/() {
      if (ԫ == null) {
         ԫ = Proxy.newProxyInstance(Class.forName("android.common.IHwApiCacheManagerEx").getClassLoader(), new Class[]{Class.forName("android.common.IHwApiCacheManagerEx")}, ൟ::Ϳ);
      }

      return ԫ;
   }
}
