package lu.die.foza.SleepyFox;

import android.os.IBinder;
import android.os.IInterface;
import android.os.IServiceManager;
import android.os.ServiceManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ৼ {
   @NotNull
   public static final ৼ Ϳ = new ৼ();
   @NotNull
   public static final ʹ<ၵ> Ԩ = new ʹ(0, 1, (DefaultConstructorMarker)null);
   @NotNull
   public static final Map<String, IBinder> ԩ;

   public static Object _/* $FF was: Ϳ*/(ৼ var0, Object var1, ໞ var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         ޜ.Ϳ.getClass();
         var2 = ޜ.Ϳ();
      }

      return var0.Ԩ(var1, (ໞ)var2);
   }

   public static final Object _/* $FF was: Ϳ*/(Object var0, Object var1, Method var2, Object[] var3) {
      label64: {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = Intrinsics.areEqual(var2.getName(), "getService");
         } catch (Exception var9) {
            var10001 = false;
            break label64;
         }

         if (var10000) {
            Object[] var13;
            ʹ var17;
            try {
               var13 = var3;
               var17 = Ԩ;
            } catch (Exception var8) {
               var10001 = false;
               break label64;
            }

            ʹ var10 = var17;
            Object var4;
            if (var13 != null) {
               Object var14;
               try {
                  var14 = var3[0];
               } catch (Exception var7) {
                  var10001 = false;
                  break label64;
               }

               var4 = var14;
            } else {
               var4 = null;
            }

            int var12;
            if (var4 != null) {
               int var15;
               try {
                  var15 = var4.hashCode();
               } catch (Exception var6) {
                  var10001 = false;
                  break label64;
               }

               var12 = var15;
            } else {
               var12 = 0;
            }

            ၵ var16;
            try {
               var16 = (ၵ)ʹ.Ϳ(var10, var12, (Object)null, 2, (Object)null);
            } catch (Exception var5) {
               var10001 = false;
               break label64;
            }

            ၵ var11 = var16;
            if (var16 != null) {
               return var11;
            }
         }
      }

      if (var3 == null) {
         var3 = ބ.Ԫ.ԩ;
      }

      return var2.invoke(var0, var3);
   }

   static {
      Object var0;
      label13: {
         Map var2;
         try {
            Object var10000 = ˋ.Ϳ.Ԩ(ServiceManager.class, "sCache");
            Intrinsics.checkNotNull(var10000);
            var2 = TypeIntrinsics.asMutableMap(var10000);
         } catch (Exception var1) {
            var0 = new ބ.<init>();
            break label13;
         }

         var0 = var2;
      }

      ԩ = (Map)var0;
   }

   @Nullable
   public final ၵ _/* $FF was: Ϳ*/(@NotNull String var1) {
      return (ၵ)ʹ.Ϳ(Ԩ, var1.hashCode(), (Object)null, 2, (Object)null);
   }

   public final void _/* $FF was: Ϳ*/() {
      Field var10000;
      boolean var10001;
      Object var15;
      try {
         var10000 = ServiceManager.class.getDeclaredField("sServiceManager");
         var10000.setAccessible(true);
         var15 = var10000.get((Object)null);
      } catch (Throwable var12) {
         var10001 = false;
         return;
      }

      Object var13 = var15;
      var15 = null;

      ClassLoader var10002;
      Object var10003;
      Class[] var10004;
      try {
         var10002 = ServiceManager.class.getClassLoader();
         var10003 = var13;
         var10004 = new Class[1];
      } catch (Throwable var11) {
         var10001 = false;
         return;
      }

      Class[] var14 = var10004;
      byte var10005 = 0;

      try {
         var10004[var10005] = IServiceManager.class;
         var10000.set(var15, Proxy.newProxyInstance(var10002, var14, ৼ::Ϳ));
      } catch (Throwable var10) {
         var10001 = false;
         return;
      }

   }

   @Nullable
   public final ˁ _/* $FF was: Ϳ*/(@NotNull String param1, @NotNull ໞ param2, @NotNull IInterface param3) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final ˁ _/* $FF was: Ϳ*/(@NotNull String param1, @NotNull ໞ param2, @Nullable String param3) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final Object _/* $FF was: Ԩ*/(@Nullable Object var1, @NotNull ໞ var2) {
      ˁ var3;
      Object var4;
      if ((var3 = this.Ϳ(var1, var2)) != null) {
         var4 = var3.ԩ;
      } else {
         var4 = null;
      }

      return var4;
   }

   @Nullable
   public final ˁ _/* $FF was: Ϳ*/(@Nullable Object param1, @NotNull ໞ param2) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final ˁ _/* $FF was: Ϳ*/(@Nullable Object var1) {
      ޜ.Ϳ.getClass();
      return this.Ϳ((Object)var1, (ໞ)ޜ.Ϳ());
   }

   public final Object _/* $FF was: Ϳ*/(IBinder var1, String var2) {
      String var33 = "$Stub";
      boolean var10001;
      if (var2 == null) {
         String var10000;
         try {
            var10000 = var1.getInterfaceDescriptor();
         } catch (Throwable var32) {
            var10001 = false;
            return null;
         }

         var2 = var10000;
         if (var10000 == null) {
            return null;
         }

         try {
            var10000 = var2.concat(var33);
         } catch (Throwable var31) {
            var10001 = false;
            return null;
         }

         var2 = var10000;
      }

      Class var34;
      Class[] var10002;
      String var36;
      try {
         var34 = Class.forName(var2);
         var36 = "asInterface";
         var10002 = new Class[1];
      } catch (Throwable var30) {
         var10001 = false;
         return null;
      }

      Class[] var10003 = var10002;
      byte var10004 = 0;

      Method var35;
      try {
         var10003[var10004] = IBinder.class;
         var35 = var34.getDeclaredMethod(var36, var10002);
         var35.setAccessible(true);
      } catch (Throwable var29) {
         var10001 = false;
         return null;
      }

      var36 = null;

      try {
         return var35.invoke(var36, var1);
      } catch (Throwable var28) {
         var10001 = false;
         return null;
      }
   }
}
