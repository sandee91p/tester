package lu.die.foza.SleepyFox;

import java.security.SecureRandom;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class ຐ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      // $FF: Couldn't be decompiled
   }

   public final String _/* $FF was: Ϳ*/(int var1) {
      SecureRandom var10000;
      boolean var10001;
      try {
         var10000 = new SecureRandom;
      } catch (Exception var8) {
         var10001 = false;
         return null;
      }

      SecureRandom var9 = var10000;

      StringBuffer var10;
      try {
         var10000.<init>();
         var10 = new StringBuffer;
      } catch (Exception var7) {
         var10001 = false;
         return null;
      }

      StringBuffer var2 = var10;

      try {
         var10.<init>();
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }

      for(int var3 = 0; var3 < var1; ++var3) {
         try {
            var2.append(Integer.toHexString(var9.nextInt(16)));
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }
      }

      try {
         String var11 = var2.toString().toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var11, "toUpperCase(...)");
         return var11;
      } catch (Exception var4) {
         var10001 = false;
         return null;
      }
   }
}
