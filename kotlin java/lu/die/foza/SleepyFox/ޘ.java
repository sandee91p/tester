package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ޘ extends ޜ {
   @Nullable
   public abstract ComponentInfo _/* $FF was: Ϳ*/(@NotNull ComponentName var1, int var2);

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      Object[] var10000;
      boolean var10001;
      try {
         var10000 = var1.ԩ;
      } catch (Exception var23) {
         var10001 = false;
         return var1.Ԫ();
      }

      Object[] var2 = var10000;

      Object var29;
      try {
         var29 = var10000[0];
      } catch (Exception var22) {
         var10001 = false;
         return var1.Ԫ();
      }

      Object var3 = var29;

      boolean var30;
      try {
         var30 = var29 instanceof ComponentName;
      } catch (Exception var21) {
         var10001 = false;
         return var1.Ԫ();
      }

      if (var30) {
         String var31;
         try {
            var31 = ((ComponentName)var3).getPackageName();
         } catch (Exception var20) {
            var10001 = false;
            return var1.Ԫ();
         }

         String var4 = var31;

         try {
            var30 = Intrinsics.areEqual(var31, this.ԫ());
         } catch (Exception var19) {
            var10001 = false;
            return var1.Ԫ();
         }

         if (!var30) {
            try {
               var30 = this.ԭ();
            } catch (Exception var18) {
               var10001 = false;
               return var1.Ԫ();
            }

            ComponentInfo var34;
            ComponentInfo var26;
            if (!var30) {
               try {
                  var30 = this.Ϳ(var4);
               } catch (Exception var17) {
                  var10001 = false;
                  return var1.Ԫ();
               }

               if (var30) {
                  ࡥ var35;
                  ၡ var36;
                  try {
                     var35 = var1;
                     ރ.Ϳ.Ϳ(var2, 1);
                     var36 = ၡ.Ϳ;
                  } catch (Exception var12) {
                     var10001 = false;
                     return var1.Ԫ();
                  }

                  ၡ var24 = var36;

                  try {
                     var29 = var35.Ԫ();
                  } catch (Exception var11) {
                     var10001 = false;
                     return var1.Ԫ();
                  }

                  Object var27 = var29;

                  try {
                     var30 = var29 instanceof ComponentInfo;
                  } catch (Exception var10) {
                     var10001 = false;
                     return var1.Ԫ();
                  }

                  if (var30) {
                     try {
                        var34 = (ComponentInfo)var27;
                     } catch (Exception var9) {
                        var10001 = false;
                        return var1.Ԫ();
                     }

                     var26 = var34;
                  } else {
                     var26 = null;
                  }

                  try {
                     return var24.Ϳ(var26);
                  } catch (Exception var6) {
                     var10001 = false;
                     return var1.Ԫ();
                  }
               }
            }

            ComponentName var33;
            try {
               var10000 = var2;
               var33 = (ComponentName)var3;
            } catch (Exception var16) {
               var10001 = false;
               return var1.Ԫ();
            }

            ComponentName var25 = var33;

            try {
               var29 = var10000[1];
            } catch (Exception var15) {
               var10001 = false;
               return var1.Ԫ();
            }

            var3 = var29;

            try {
               var30 = var29 instanceof Number;
            } catch (Exception var14) {
               var10001 = false;
               return var1.Ԫ();
            }

            int var28;
            if (var30) {
               int var32;
               try {
                  var32 = ((Number)var3).intValue();
               } catch (Exception var13) {
                  var10001 = false;
                  return var1.Ԫ();
               }

               var28 = var32;
            } else {
               var28 = 0;
            }

            try {
               var34 = this.Ϳ(var25, var28);
            } catch (Exception var8) {
               var10001 = false;
               return var1.Ԫ();
            }

            var26 = var34;
            if (var34 != null) {
               try {
                  var30 = this.Ϳ(var4);
               } catch (Exception var7) {
                  var10001 = false;
                  return var1.Ԫ();
               }

               if (var30) {
                  try {
                     var34 = ၡ.Ϳ.Ϳ(var26);
                  } catch (Exception var5) {
                     var10001 = false;
                     return var1.Ԫ();
                  }

                  var26 = var34;
               }

               return var26;
            }
         }
      }

      return var1.Ԫ();
   }
}
