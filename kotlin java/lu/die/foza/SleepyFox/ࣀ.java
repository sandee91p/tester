package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.os.IBinder;
import com.android.internal.content.ReferrerIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࣀ {
   @NotNull
   public static final ࣀ Ϳ = new ࣀ();
   @NotNull
   public static final ૹ<List<ReferrerIntent>> Ԩ = new ૹ("mIntents");
   @NotNull
   public static final ૹ<Intent> ԩ;
   @NotNull
   public static final ૹ<String> Ԫ;
   @NotNull
   public static final ૹ<ActivityInfo> ԫ;

   static {
      ૹ var0 = new ૹ;
      boolean var1;
      String var2;
      if (var1 = ތ.Ԯ) {
         var2 = "mIntent";
      } else {
         var2 = "intent";
      }

      var0.<init>(var2);
      ԩ = var0;
      var0 = new ૹ;
      if (var1) {
         var2 = "mReferrer";
      } else {
         var2 = "referrer";
      }

      var0.<init>(var2);
      Ԫ = var0;
      var0 = new ૹ;
      String var3;
      if (var1) {
         var3 = "mInfo";
      } else {
         var3 = "activityInfo";
      }

      var0.<init>(var3);
      ԫ = var0;
   }

   @Nullable
   public final Pair<Intent, String> _/* $FF was: Ϳ*/(@NotNull Intent var1, @NotNull IBinder var2) {
      Intent var4;
      if ((var4 = ྌ.Ԩ(var1)) == null) {
         return null;
      } else {
         ComponentName var3;
         if ((var3 = (ComponentName)var1.getParcelableExtra("foza_key_calling_activity")) != null) {
            ޡ.Ϳ.Ϳ(var2, var3);
         }

         String var5;
         String var10000 = var5 = var1.getStringExtra("foza_key_calling_package");
         ޡ.Ϳ.getClass();
         ޡ.Ԩ = var10000;
         return new Pair(var4, var5);
      }
   }

   @NotNull
   public final List<ReferrerIntent> _/* $FF was: Ϳ*/(@NotNull List<? extends ReferrerIntent> var1, @NotNull IBinder var2) {
      List var10000 = var1;
      ArrayList var15;
      var15 = new ArrayList.<init>();

      Iterator var16;
      boolean var10001;
      try {
         var16 = var10000.iterator();
      } catch (Exception var14) {
         var10001 = false;
         return var15;
      }

      Iterator var3 = var16;

      while(true) {
         boolean var17;
         try {
            var17 = var3.hasNext();
         } catch (Exception var13) {
            var10001 = false;
            break;
         }

         if (!var17) {
            break;
         }

         ࣀ var18;
         ReferrerIntent var21;
         try {
            var18 = this;
            var21 = (ReferrerIntent)var3.next();
         } catch (Exception var12) {
            var10001 = false;
            break;
         }

         ReferrerIntent var4 = var21;

         Pair var19;
         try {
            var19 = var18.Ϳ((Intent)var21, var2);
         } catch (Exception var11) {
            var10001 = false;
            break;
         }

         Pair var5 = var19;
         if (var19 == null) {
            try {
               var15.add(var4);
            } catch (Exception var10) {
               var10001 = false;
               break;
            }
         } else {
            String var20;
            try {
               var20 = (String)var5.getSecond();
            } catch (Exception var9) {
               var10001 = false;
               break;
            }

            String var6 = var20;
            if (var20 == null) {
               try {
                  var20 = var4.mReferrer;
               } catch (Exception var8) {
                  var10001 = false;
                  break;
               }

               var6 = var20;
            }

            try {
               var15.add(new ReferrerIntent((Intent)var5.getFirst(), var6));
            } catch (Exception var7) {
               var10001 = false;
               break;
            }
         }
      }

      return var15;
   }

   public final boolean _/* $FF was: Ԩ*/(@NotNull Object var1, @NotNull IBinder var2) {
      ૹ var10000;
      boolean var10001;
      try {
         var10000 = Ԩ;
      } catch (Exception var7) {
         var10001 = false;
         return false;
      }

      ૹ var3 = var10000;

      List var8;
      try {
         var8 = (List)var10000.ԩ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return false;
      }

      List var4 = var8;
      if (var8 == null) {
         return false;
      } else {
         try {
            var3.Ϳ(var1, this.Ϳ(var4, var2));
            return true;
         } catch (Exception var5) {
            var10001 = false;
            return false;
         }
      }
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull Object var1, @NotNull IBinder var2) {
      ૹ var3;
      Intent var4;
      if ((var4 = (Intent)(var3 = ԩ).ԩ(var1)) == null) {
         return false;
      } else {
         Pair var6;
         if ((var6 = this.Ϳ(var4, var2)) == null) {
            var4.toString();
            return true;
         } else {
            Intent var7 = (Intent)var6.getFirst();
            ૹ var8 = ԫ;
            ActivityInfo var5;
            if ((var5 = ޣ.Ϳ.Ϳ(var7)) == null) {
               if (!ࢦ.Ϳ.ރ()) {
                  return false;
               }

               ၡ var10000 = ၡ.Ϳ;
               ࡠ.ԩ.getClass();
               var5 = (ActivityInfo)var10000.Ϳ((ComponentInfo)ࡠ.ԫ().Ϳ(var7));
            }

            var8.Ϳ(var1, var5);
            if (ތ.ԩ) {
               Ԫ.Ϳ(var1, var6.getSecond());
            }

            var3.Ϳ(var1, var7);
            return true;
         }
      }
   }
}
