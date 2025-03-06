package lu.die.foza.SleepyFox;

import android.content.ComponentName;

public final class ޞ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ޞ var10000;
      ޞ var17;
      boolean var10001;
      try {
         var10000 = this;
         var17 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var12) {
         var10001 = false;
         return;
      }

      ˁ var16;
      try {
         var17.Ϳ = ࢯ.ՠ();
         var16 = var10000.Ϳ("device_policy");
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      ˁ var13 = var16;
      if (var16 != null) {
         String var18;
         try {
            var16 = var13;
            var18 = "getDeviceOwnerComponent";
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         String var1 = var18;

         ޜ.Ϳ var20;
         try {
            var20 = ޜ.Ϳ;
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         ޜ.Ϳ var2 = var20;

         ˁ var10002;
         String var10003;
         ޜ.Ϳ var10004;
         ComponentName var10005;
         try {
            var10002 = var13;
            var10003 = var1;
            var10004 = var2;
            var10005 = new ComponentName;
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         ComponentName var14 = var10005;

         try {
            ࢦ.Ϳ.getClass();
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         try {
            var10005.<init>(ࢦ.Ԯ, "main");
            var10004.getClass();
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         String var19;
         try {
            var10002.Ϳ((String)var10003, (ໞ)(new އ(var14)));
            var19 = "getDeviceOwnerName";
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         String var15 = var19;

         try {
            var20.getClass();
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         try {
            var16.Ϳ(var15, ޜ.Ԩ());
         } catch (Exception var3) {
            var10001 = false;
         }
      }

   }
}
