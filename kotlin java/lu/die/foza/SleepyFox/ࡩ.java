package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFoxIntentBaseResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FoxIntentBaseResolver.kt\nlu/die/foza/HookEntity/SampleHookEntity/FoxIntentBaseResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public abstract class ࡩ extends ޜ {
   @Nullable
   public abstract ResolveInfo _/* $FF was: Ϳ*/(@NotNull Intent var1, @Nullable String var2, int var3);

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      Object[] var10000;
      boolean var10001;
      try {
         var10000 = var1.ԩ;
      } catch (Exception var16) {
         var10001 = false;
         return null;
      }

      Object[] var2 = var10000;

      int var22;
      try {
         var22 = var10000.length;
      } catch (Exception var15) {
         var10001 = false;
         return null;
      }

      if (var22 < 3) {
         return null;
      } else {
         Object var10002;
         Object[] var25;
         try {
            var10000 = var2;
            var25 = var2;
            var10002 = var2[0];
         } catch (Exception var14) {
            var10001 = false;
            return null;
         }

         Object var18 = var10002;

         Object var27;
         try {
            var27 = var25[1];
         } catch (Exception var13) {
            var10001 = false;
            return null;
         }

         Object var3 = var27;

         Object var23;
         try {
            var23 = var10000[2];
         } catch (Exception var12) {
            var10001 = false;
            return null;
         }

         Object var4 = var23;

         boolean var24;
         try {
            var24 = var18 instanceof Intent;
         } catch (Exception var11) {
            var10001 = false;
            return null;
         }

         if (var24) {
            Intent var29;
            try {
               var23 = var3;
               var29 = (Intent)var18;
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            Intent var19 = var29;
            String var20;
            if (var23 != null) {
               String var26;
               try {
                  var26 = var3.toString();
               } catch (Exception var9) {
                  var10001 = false;
                  return null;
               }

               var20 = var26;
            } else {
               var20 = null;
            }

            try {
               var24 = var4 instanceof Number;
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }

            int var21;
            if (var24) {
               try {
                  var22 = ((Number)var4).intValue();
               } catch (Exception var7) {
                  var10001 = false;
                  return null;
               }

               var21 = var22;
            } else {
               var21 = 0;
            }

            ResolveInfo var28;
            try {
               var28 = this.Ϳ(var19, var20, var21);
            } catch (Exception var6) {
               var10001 = false;
               return null;
            }

            ResolveInfo var17 = var28;
            if (var28 != null) {
               return var17;
            }
         }

         try {
            ރ.Ϳ.Ϳ(var1.ԩ, 2);
            return var1.Ԫ();
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }
      }
   }
}
