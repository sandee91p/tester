package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ޣ {
   @NotNull
   public static final ޣ Ϳ = new ޣ();
   @NotNull
   public static ʹ<ActivityInfo> Ԩ = new ʹ(0);

   public final void _/* $FF was: Ϳ*/() {
      ࢦ var10000;
      boolean var10001;
      try {
         var10000 = ࢦ.Ϳ;
      } catch (Exception var28) {
         var10001 = false;
         return;
      }

      ࢦ var29 = var10000;

      String var32;
      try {
         var32 = var10000.ԩ();
      } catch (Exception var27) {
         var10001 = false;
         return;
      }

      String var1 = var32;
      if (var32 != null) {
         String var35;
         try {
            var10000 = var29;
            var35 = var29.Ԫ();
         } catch (Exception var26) {
            var10001 = false;
            return;
         }

         String var30 = var35;

         try {
            var10000.getClass();
         } catch (Exception var25) {
            var10001 = false;
            return;
         }

         boolean var33;
         try {
            var33 = ࢦ.ԩ;
         } catch (Exception var24) {
            var10001 = false;
            return;
         }

         ActivityInfo[] var31;
         ActivityInfo[] var36;
         label156: {
            label182: {
               PackageInfo var2;
               PackageInfo var34;
               if (var33) {
                  try {
                     ࡠ.ԩ.getClass();
                  } catch (Exception var23) {
                     var10001 = false;
                     return;
                  }

                  try {
                     var34 = ࡠ.ԫ().Ԩ((String)var1, 1);
                  } catch (Exception var22) {
                     var10001 = false;
                     return;
                  }

                  var2 = var34;
                  if (var34 == null) {
                     break label182;
                  }
               } else {
                  try {
                     var34 = ࢼ.Ϳ.Ԩ((String)var1, 1);
                  } catch (Exception var21) {
                     var10001 = false;
                     return;
                  }

                  var2 = var34;
                  if (var34 == null) {
                     break label182;
                  }
               }

               try {
                  var36 = var2.activities;
               } catch (Exception var20) {
                  var10001 = false;
                  return;
               }

               var31 = var36;
               break label156;
            }

            var31 = null;
         }

         if (var31 != null) {
            ʹ var40;
            try {
               var36 = var31;
               var40 = new ʹ;
            } catch (Exception var19) {
               var10001 = false;
               return;
            }

            ʹ var3 = var40;

            try {
               var40.<init>(var31.length);
            } catch (Exception var18) {
               var10001 = false;
               return;
            }

            ApplicationInfo var4 = null;
            int var5 = 0;

            int var37;
            try {
               var37 = var36.length;
            } catch (Exception var17) {
               var10001 = false;
               return;
            }

            for(int var6 = var37; var5 < var6; ++var5) {
               ActivityInfo var38;
               try {
                  var38 = var31[var5];
               } catch (Exception var16) {
                  var10001 = false;
                  return;
               }

               ActivityInfo var7 = var38;

               try {
                  var33 = Intrinsics.areEqual(var38.processName, var30);
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               if (!var33) {
                  try {
                     var37 = var7.flags;
                  } catch (Exception var14) {
                     var10001 = false;
                     return;
                  }

                  if ((var37 & 1) == 0) {
                     continue;
                  }
               }

               ApplicationInfo var39;
               int var42;
               try {
                  var39 = var4;
                  var42 = (new ComponentName(var1, var7.name)).hashCode();
               } catch (Exception var13) {
                  var10001 = false;
                  return;
               }

               int var8 = var42;
               if (var39 == null) {
                  try {
                     var39 = ၡ.Ϳ.Ϳ(var7.applicationInfo);
                  } catch (Exception var12) {
                     var10001 = false;
                     return;
                  }

                  var4 = var39;
               }

               ʹ var41;
               try {
                  var41 = var3;
                  var7.applicationInfo = var4;
                  var7.enabled = true;
                  Unit var43 = Unit.INSTANCE;
               } catch (Exception var11) {
                  var10001 = false;
                  return;
               }

               try {
                  var41.Ԩ(var8, var7);
               } catch (Exception var10) {
                  var10001 = false;
                  return;
               }
            }

            try {
               Ԩ = var3;
            } catch (Exception var9) {
               var10001 = false;
            }

         }
      }
   }

   @Nullable
   public final ActivityInfo _/* $FF was: Ϳ*/(@NotNull Intent var1) {
      ʹ var2 = Ԩ;
      ComponentName var3;
      int var4;
      if ((var3 = var1.getComponent()) != null) {
         var4 = var3.hashCode();
      } else {
         var4 = 0;
      }

      return (ActivityInfo)ʹ.Ϳ(var2, var4, (Object)null, 2, (Object)null);
   }

   @Nullable
   public final ActivityInfo _/* $FF was: Ϳ*/(@NotNull ComponentName var1) {
      return (ActivityInfo)ʹ.Ϳ(Ԩ, var1.hashCode(), (Object)null, 2, (Object)null);
   }
}
