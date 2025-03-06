package lu.die.foza.SleepyFox;

import android.content.pm.UserInfo;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

public final class ʶ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ʶ var10000;
      boolean var10001;
      ʶ var476;
      try {
         var10000 = this;
         var476 = this;
         ࢯ.Ԭ.getClass();
      } catch (Throwable var465) {
         var10001 = false;
         return;
      }

      ˁ var475;
      try {
         var476.Ϳ = ࢯ.ՠ();
         var475 = var10000.Ϳ("user");
      } catch (Throwable var464) {
         var10001 = false;
         return;
      }

      ˁ var1 = var475;
      if (var475 != null) {
         String var477;
         try {
            var475 = var1;
            var477 = "getUserName";
         } catch (Throwable var463) {
            var10001 = false;
            return;
         }

         String var2 = var477;

         ޜ.Ϳ var480;
         try {
            var480 = ޜ.Ϳ;
         } catch (Throwable var462) {
            var10001 = false;
            return;
         }

         ޜ.Ϳ var3 = var480;

         ˁ var10002;
         ޜ.Ϳ var10003;
         ˁ var10004;
         ޜ.Ϳ var10005;
         ʶ var10006;
         ˁ var10007;
         ޜ.Ϳ var10008;
         String var10009;
         try {
            var10002 = var1;
            var10003 = var3;
            var10004 = var1;
            var10005 = var3;
            var10006 = this;
            var10007 = var1;
            var10008 = var3;
            var10009 = "Fox";
         } catch (Throwable var461) {
            var10001 = false;
            return;
         }

         String var466 = var10009;

         try {
            var10008.getClass();
         } catch (Throwable var460) {
            var10001 = false;
            return;
         }

         އ var490;
         try {
            var490 = new އ;
         } catch (Throwable var459) {
            var10001 = false;
            return;
         }

         އ var469 = var490;

         UserInfo var487;
         try {
            var490.<init>(var466);
            var10007.Ϳ((String)var2, (ໞ)var469);
            var487 = var10006.ԫ();
         } catch (Throwable var458) {
            var10001 = false;
            return;
         }

         UserInfo var467 = var487;

         String var488;
         try {
            var488 = "getUsers";
         } catch (Throwable var457) {
            var10001 = false;
            return;
         }

         String var470 = var488;

         ArrayList var489;
         try {
            var489 = CollectionsKt.arrayListOf(new UserInfo[]{var467});
         } catch (Throwable var456) {
            var10001 = false;
            return;
         }

         ArrayList var471 = var489;

         try {
            var10005.getClass();
         } catch (Throwable var455) {
            var10001 = false;
            return;
         }

         އ var485;
         try {
            var485 = new އ;
         } catch (Throwable var454) {
            var10001 = false;
            return;
         }

         އ var474 = var485;

         try {
            var485.<init>(var471);
            var10004.Ϳ((String)var470, (ໞ)var474);
            var10003.getClass();
         } catch (Throwable var453) {
            var10001 = false;
            return;
         }

         އ var481;
         try {
            var481 = new އ;
         } catch (Throwable var452) {
            var10001 = false;
            return;
         }

         var469 = var481;

         String[] var482;
         try {
            var481.<init>(var467);
            var482 = new String[2];
         } catch (Throwable var451) {
            var10001 = false;
            return;
         }

         String[] var468;
         String[] var483 = var468 = var482;
         byte var486 = 0;

         try {
            var483[var486] = "getProfileParent";
         } catch (Throwable var450) {
            var10001 = false;
            return;
         }

         byte var484 = 1;

         String var478;
         try {
            var482[var484] = "getUserInfo";
            var10002.Ϳ((ໞ)var469, (String[])var468);
            var478 = "getMainUserId";
         } catch (Throwable var449) {
            var10001 = false;
            return;
         }

         var466 = var478;

         Integer var479;
         try {
            var479 = 0;
         } catch (Throwable var448) {
            var10001 = false;
            return;
         }

         Integer var472 = var479;

         try {
            var480.getClass();
         } catch (Throwable var447) {
            var10001 = false;
            return;
         }

         އ var491;
         try {
            var491 = new އ;
         } catch (Throwable var446) {
            var10001 = false;
            return;
         }

         އ var473 = var491;

         try {
            var491.<init>(var472);
            var475.Ϳ((String)var466, (ໞ)var473);
         } catch (Throwable var445) {
            var10001 = false;
            return;
         }
      }

   }

   public final UserInfo _/* $FF was: ԫ*/() {
      UserInfo var1;
      if (ތ.ؠ) {
         var1 = new UserInfo.<init>(0, "Fox", (String)null, 3, "android.os.usertype.profile.MANAGED");
      } else {
         var1 = new UserInfo.<init>(0, "Fox", (String)null, 3);
      }

      return var1;
   }
}
