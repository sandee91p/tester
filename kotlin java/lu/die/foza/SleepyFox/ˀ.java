package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.content.ComponentName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ˀ extends ޜ {
   @NotNull
   public static final ˀ Ԫ = new ˀ();

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      Object[] var2 = var1.ԩ;
      ރ var3;
      ComponentName var4;
      ComponentName var10000 = var4 = (ComponentName)(var3 = ރ.Ϳ).Ϳ(var2, ComponentName.class);
      String var22 = this.ԫ();
      String var30;
      if (var10000 != null) {
         var30 = var4.getPackageName();
      } else {
         var30 = null;
      }

      if (Intrinsics.areEqual(var22, var30)) {
         return var1.Ԫ();
      } else {
         boolean var10001;
         int var32;
         try {
            var32 = var2.length;
         } catch (Exception var21) {
            var10001 = false;
            return null;
         }

         if (var32 > 2) {
            int var23 = 0;

            boolean var33;
            try {
               var33 = ތ.ހ;
            } catch (Exception var20) {
               var10001 = false;
               return null;
            }

            Object[] var34;
            Object var35;
            if (var33) {
               int var36;
               try {
                  var34 = var2;
                  var36 = var2.length;
               } catch (Exception var19) {
                  var10001 = false;
                  return null;
               }

               --var36;

               try {
                  var35 = var34[var36];
               } catch (Exception var18) {
                  var10001 = false;
                  return null;
               }

               Object var24 = var35;

               try {
                  var33 = var35 instanceof Number;
               } catch (Exception var17) {
                  var10001 = false;
                  return null;
               }

               if (var33) {
                  try {
                     var32 = ((Number)var24).intValue();
                  } catch (Exception var16) {
                     var10001 = false;
                     return null;
                  }

                  var23 = var32;
               }
            }

            ރ var37;
            Object[] var39;
            try {
               var37 = var3;
               var39 = var2;
               ޥ.ԭ.getClass();
            } catch (Exception var15) {
               var10001 = false;
               return null;
            }

            ޥ var10002;
            try {
               var10002 = ޥ.Ϳ();
            } catch (Exception var14) {
               var10001 = false;
               return null;
            }

            ޥ var25 = var10002;

            Notification var38;
            try {
               var38 = (Notification)var37.Ϳ(var39, Notification.class);
            } catch (Exception var13) {
               var10001 = false;
               return null;
            }

            Notification var29 = var38;
            if (var38 != null) {
               try {
                  var38 = var29.clone();
               } catch (Exception var12) {
                  var10001 = false;
                  return null;
               }

               var29 = var38;
            } else {
               var29 = null;
            }

            Notification var40;
            try {
               var34 = var2;
               var40 = var25.Ԩ(var29);
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            Notification var26 = var40;

            try {
               var35 = var34[2];
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            Object var27 = var35;

            try {
               ޠ.Ԫ.getClass();
            } catch (Exception var9) {
               var10001 = false;
               return null;
            }

            ޠ var41;
            try {
               var41 = ޠ.ԫ();
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }

            ޠ var31 = var41;

            try {
               var33 = var35 instanceof Number;
            } catch (Exception var7) {
               var10001 = false;
               return null;
            }

            int var28;
            if (var33) {
               try {
                  var32 = ((Number)var27).intValue();
               } catch (Exception var6) {
                  var10001 = false;
                  return null;
               }

               var28 = var32;
            } else {
               var28 = 12580;
            }

            try {
               var31.Ϳ(var28, var23, var26);
            } catch (Exception var5) {
               var10001 = false;
            }
         }

         return null;
      }
   }
}
