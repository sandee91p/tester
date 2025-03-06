package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ٴ {
   @NotNull
   public static final ٴ Ϳ = new ٴ();

   @Nullable
   public final ActivityInfo _/* $FF was: Ԩ*/(@NotNull String var1, boolean var2) {
      boolean var10000;
      boolean var10001;
      Intent var25;
      try {
         var10000 = var2;
         var25 = (new Intent("android.intent.action.MAIN")).addCategory("android.intent.category.LAUNCHER").setPackage(var1);
      } catch (Exception var17) {
         var10001 = false;
         return null;
      }

      Intent var18 = var25;
      List var24;
      if (var10000) {
         try {
            var24 = ࢽ.Ϳ.Ϳ(var18.setPackage(var1), (String)null, 0);
         } catch (Exception var16) {
            var10001 = false;
            return null;
         }
      } else {
         try {
            var24 = ࢼ.Ϳ.Ԩ((Intent)var18.setPackage(var1), 0);
         } catch (Exception var15) {
            var10001 = false;
            return null;
         }
      }

      List var21 = var24;
      Iterator var26;
      ActivityInfo var27;
      if (var21 != null) {
         try {
            var26 = var21.iterator();
         } catch (Exception var14) {
            var10001 = false;
            return null;
         }

         Iterator var22 = var26;

         while(true) {
            try {
               var10000 = var22.hasNext();
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            if (!var10000) {
               break;
            }

            try {
               var27 = ((ResolveInfo)var22.next()).activityInfo;
            } catch (Exception var13) {
               var10001 = false;
               return null;
            }

            ActivityInfo var3 = var27;

            try {
               var10000 = var27.enabled;
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            if (var10000) {
               return var3;
            }
         }
      }

      try {
         var10000 = var2;
         var18.removeCategory("android.intent.category.LAUNCHER");
         var18.addCategory("android.intent.category.INFO");
      } catch (Exception var10) {
         var10001 = false;
         return null;
      }

      if (var10000) {
         try {
            var24 = ࢼ.Ϳ.Ԩ((Intent)var18, 0);
         } catch (Exception var9) {
            var10001 = false;
            return null;
         }
      } else {
         try {
            var24 = ࢽ.Ϳ.Ϳ(var18, (String)null, 0);
         } catch (Exception var8) {
            var10001 = false;
            return null;
         }
      }

      List var19 = var24;
      if (var19 != null) {
         try {
            var26 = var19.iterator();
         } catch (Exception var7) {
            var10001 = false;
            return null;
         }

         Iterator var20 = var26;

         while(true) {
            try {
               var10000 = var20.hasNext();
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            if (!var10000) {
               break;
            }

            try {
               var27 = ((ResolveInfo)var20.next()).activityInfo;
            } catch (Exception var5) {
               var10001 = false;
               break;
            }

            ActivityInfo var23 = var27;

            try {
               var10000 = var27.enabled;
            } catch (Exception var4) {
               var10001 = false;
               break;
            }

            if (var10000) {
               return var23;
            }
         }
      }

      return null;
   }

   @Nullable
   public final Pair<Intent, ActivityInfo> _/* $FF was: Ϳ*/(@NotNull String var1, boolean var2) {
      ActivityInfo var3;
      Pair var4;
      if ((var3 = this.Ԩ(var1, var2)) != null) {
         var4 = new Pair.<init>(ྌ.Ϳ.Ϳ(var1, var3.name), var3);
      } else {
         var4 = null;
      }

      return var4;
   }
}
