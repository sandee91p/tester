package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ၚ extends ࢯ {
   @NotNull
   public static final ၚ.Ϳ ԯ = new ၚ.Ϳ();
   public static final int ՠ = 2;
   public static final int ֈ = 4;
   public static final int ֏ = 5;
   public static final int ׯ = 1;
   @NotNull
   public static final ၚ ؠ = new ၚ();

   public final void _/* $FF was: Ϳ*/(@NotNull ˁ var1) {
      var1.Ϳ((String)"getIntentSender", (ໞ)this);
      if (ތ.ހ && ތ.ԯ) {
         var1.Ϳ((String)"getIntentSenderWithSourceToken", (ໞ)this);
      }

      if (ތ.ؠ) {
         var1.Ϳ((String)"getIntentSenderWithFeature", (ໞ)this);
      }

   }

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ param1) {
      // $FF: Couldn't be decompiled
   }

   public final Intent _/* $FF was: Ϳ*/(Intent var1) {
      ComponentName var10000;
      boolean var10001;
      try {
         var10000 = var1.getComponent();
      } catch (Exception var16) {
         var10001 = false;
         return var1;
      }

      if (var10000 == null) {
         String var19;
         try {
            var19 = var1.getPackage();
         } catch (Exception var15) {
            var10001 = false;
            return var1;
         }

         if (var19 == null) {
            return var1;
         }
      }

      Intent var20;
      try {
         var20 = new Intent;
      } catch (Exception var14) {
         var10001 = false;
         return var1;
      }

      Intent var17;
      Intent var21 = var17 = var20;

      StringBuilder var10002;
      try {
         var10002 = new StringBuilder;
      } catch (Exception var13) {
         var10001 = false;
         return var1;
      }

      StringBuilder var2 = var10002;

      ࢦ var22;
      try {
         var10002.<init>();
         var22 = ࢦ.Ϳ;
      } catch (Exception var12) {
         var10001 = false;
         return var1;
      }

      ࢦ var3 = var22;

      Intent var10003;
      Intent var10004;
      ࢦ var10005;
      Intent var10006;
      StringBuilder var10007;
      try {
         var10003 = var17;
         var10004 = var17;
         var10005 = var3;
         var10006 = var17;
         var10007 = var2;
         var3.getClass();
      } catch (Exception var11) {
         var10001 = false;
         return var1;
      }

      String var10008;
      try {
         var10008 = ࢦ.Ԯ;
      } catch (Exception var10) {
         var10001 = false;
         return var1;
      }

      String var18 = var10008;

      try {
         var10006.<init>(var10007.append(var10008).append(".st.receiver").toString());
         var10005.getClass();
      } catch (Exception var9) {
         var10001 = false;
         return var1;
      }

      try {
         var10004.setPackage(var18);
      } catch (Exception var8) {
         var10001 = false;
         return var1;
      }

      try {
         var10003.putExtra("foza_key_intent", var1);
      } catch (Exception var7) {
         var10001 = false;
         return var1;
      }

      String var23;
      try {
         var23 = "foza_key_first_user";
      } catch (Exception var6) {
         var10001 = false;
         return var1;
      }

      var18 = var23;

      try {
         var22.getClass();
      } catch (Exception var5) {
         var10001 = false;
         return var1;
      }

      try {
         var21.putExtra(var18, ࢦ.Ԫ);
         return var20;
      } catch (Exception var4) {
         var10001 = false;
         return var1;
      }
   }

   public final boolean _/* $FF was: Ϳ*/(int var1, Intent var2) {
      boolean var3;
      if ((var1 & 536870912) != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if ((var1 & 33554432) != 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      boolean var5;
      if (var2.getComponent() == null && var2.getPackage() == null) {
         var5 = true;
      } else {
         var5 = false;
      }

      return !var3 && var4 && var5;
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ၚ _/* $FF was: Ϳ*/() {
         return ၚ.ؠ;
      }
   }
}
