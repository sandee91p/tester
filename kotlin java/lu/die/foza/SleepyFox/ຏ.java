package lu.die.foza.SleepyFox;

import android.util.Singleton;
import kotlin.jvm.internal.Intrinsics;

public final class ຏ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      Object var10000;
      boolean var10001;
      Singleton var8;
      try {
         var10000 = ˋ.Ԩ("com.hihonor.android.content.pm.HwPackageManager", "PACKAGE_MANAGER_SINGLETON");
         Intrinsics.checkNotNull(var10000);
         var8 = (Singleton)var10000;
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      Singleton var7 = var8;

      try {
         var10000 = var8.get();
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      Object var1 = var10000;
      if (var10000 != null) {
         ৼ var9;
         Object var10;
         try {
            var9 = ৼ.Ϳ;
            var10 = var1;
            ࢯ.Ԭ.getClass();
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         try {
            var10000 = var9.Ԩ(var10, ࢯ.ՠ());
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         var1 = var10000;

         try {
            ʾ.Ϳ.Ԩ(var7, var1);
         } catch (Exception var2) {
            var10001 = false;
         }

      }
   }
}
