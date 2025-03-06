package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ࢨ extends ޜ {
   @Nullable
   public abstract List<ResolveInfo> _/* $FF was: Ϳ*/(@NotNull Intent var1, @Nullable String var2, int var3);

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      label49: {
         List var10000;
         boolean var10001;
         try {
            var10000 = this.Ԩ(var1);
         } catch (Exception var6) {
            var10001 = false;
            break label49;
         }

         List var7;
         boolean var10;
         label42: {
            var7 = var10000;
            if (var10000 != null) {
               try {
                  var10 = var7.isEmpty();
               } catch (Exception var5) {
                  var10001 = false;
                  break label49;
               }

               if (!var10) {
                  var10 = false;
                  break label42;
               }
            }

            var10 = true;
         }

         if (!var10) {
            try {
               return ႎ.Ϳ.Ϳ(var7, var1.Ԩ);
            } catch (Exception var3) {
               var10001 = false;
            }
         } else {
            try {
               ރ.Ϳ.Ϳ(var1.ԩ, 2);
               return var1.Ԫ();
            } catch (Exception var4) {
               var10001 = false;
            }
         }
      }

      ႎ var8;
      Object var9;
      if ((var8 = ႎ.Ϳ).Ϳ(var1.Ԩ.getReturnType())) {
         var8.getClass();
         var9 = ႎ.ԩ;
      } else {
         var9 = CollectionsKt.emptyList();
      }

      return var9;
   }

   public final List<ResolveInfo> _/* $FF was: Ԩ*/(ࡥ var1) {
      Object[] var10000;
      boolean var10001;
      Object var10002;
      Object[] var19;
      try {
         var10000 = var1.ԩ;
         var19 = var10000;
         var10002 = var10000[0];
      } catch (Exception var12) {
         var10001 = false;
         return null;
      }

      Object var13 = var10002;

      Object var21;
      try {
         var21 = var19[1];
      } catch (Exception var11) {
         var10001 = false;
         return null;
      }

      Object var2 = var21;

      Object var17;
      try {
         var17 = var10000[2];
      } catch (Exception var10) {
         var10001 = false;
         return null;
      }

      Object var3 = var17;

      boolean var18;
      try {
         var18 = var13 instanceof Intent;
      } catch (Exception var9) {
         var10001 = false;
         return null;
      }

      if (var18) {
         Intent var23;
         try {
            var17 = var2;
            var23 = (Intent)var13;
         } catch (Exception var8) {
            var10001 = false;
            return null;
         }

         Intent var14 = var23;
         String var15;
         if (var17 != null) {
            String var20;
            try {
               var20 = var2.toString();
            } catch (Exception var7) {
               var10001 = false;
               return null;
            }

            var15 = var20;
         } else {
            var15 = null;
         }

         try {
            var18 = var3 instanceof Number;
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         int var16;
         if (var18) {
            int var22;
            try {
               var22 = ((Number)var3).intValue();
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            var16 = var22;
         } else {
            var16 = 0;
         }

         try {
            return this.Ϳ(var14, var15, var16);
         } catch (Exception var4) {
            var10001 = false;
         }
      }

      return null;
   }
}
