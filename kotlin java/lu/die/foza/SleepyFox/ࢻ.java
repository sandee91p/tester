package lu.die.foza.SleepyFox;

import android.content.pm.ApplicationInfo;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢻ {
   @NotNull
   public static final ࢻ Ϳ = new ࢻ();

   public final void _/* $FF was: Ϳ*/(@Nullable ApplicationInfo var1) {
      if (var1 != null) {
         String var10000;
         boolean var10001;
         try {
            var10000 = var1.nativeLibraryDir;
         } catch (Exception var22) {
            var10001 = false;
            return;
         }

         String var23 = var10000;
         File var2;
         File var29;
         if (var10000 != null) {
            try {
               var29 = new File;
            } catch (Exception var21) {
               var10001 = false;
               return;
            }

            var2 = var29;

            try {
               var29.<init>(var23, "libtersafe2.so");
            } catch (Exception var20) {
               var10001 = false;
               return;
            }
         } else {
            var2 = null;
         }

         boolean var30;
         label166: {
            if (var2 != null) {
               try {
                  var30 = var2.exists();
               } catch (Exception var19) {
                  var10001 = false;
                  return;
               }

               if (var30) {
                  var30 = true;
                  break label166;
               }
            }

            var30 = false;
         }

         if (!var30) {
            try {
               var10000 = var1.nativeLibraryDir;
            } catch (Exception var18) {
               var10001 = false;
               return;
            }

            var23 = var10000;
            if (var10000 != null) {
               try {
                  var29 = new File;
               } catch (Exception var17) {
                  var10001 = false;
                  return;
               }

               File var24 = var29;

               try {
                  var29.<init>(var23, "libtersafe.so");
               } catch (Exception var16) {
                  var10001 = false;
                  return;
               }

               var2 = var24;
            } else {
               var23 = null;
               var2 = var23;
            }
         }

         label147: {
            if (var2 != null) {
               try {
                  var30 = var2.exists();
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               if (var30) {
                  var30 = true;
                  break label147;
               }
            }

            var30 = false;
         }

         if (var30) {
            try {
               var29 = var2.getCanonicalFile();
            } catch (Exception var14) {
               var10001 = false;
               return;
            }

            File var25 = var29;

            ࡧ var32;
            try {
               var32 = ࡧ.Ϳ;
            } catch (Exception var13) {
               var10001 = false;
               return;
            }

            ࡧ var26 = var32;

            try {
               var32.Ԭ(var25);
            } catch (Exception var12) {
               var10001 = false;
               return;
            }

            ApplicationInfo var33;
            try {
               var33 = ࢦ.ֈ().getApplicationInfo();
            } catch (Exception var11) {
               var10001 = false;
               return;
            }

            ApplicationInfo var27 = var33;
            if (var33 != null) {
               try {
                  var10000 = var27.nativeLibraryDir;
               } catch (Exception var10) {
                  var10001 = false;
                  return;
               }

               String var28 = var10000;
               if (var10000 != null) {
                  File var34;
                  File var10002;
                  try {
                     var32 = var26;
                     var34 = var25;
                     var10002 = new File;
                  } catch (Exception var9) {
                     var10001 = false;
                     return;
                  }

                  File var3 = var10002;

                  ࡧ var10003;
                  File var10004;
                  String var10005;
                  try {
                     var10003 = var26;
                     var10004 = var25;
                     var3.<init>(var28, "libfoza.so");
                     var10005 = var3.getCanonicalPath();
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }

                  var28 = var10005;

                  try {
                     ࡧ.Ϳ(var10003, var28, var10004.getAbsolutePath(), false, 4, (Object)null);
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }

                  String var31;
                  try {
                     var31 = var10002.getCanonicalPath();
                  } catch (Exception var6) {
                     var10001 = false;
                     return;
                  }

                  var28 = var31;

                  try {
                     var30 = ࡧ.Ϳ(var32, var28, var34.getAbsolutePath(), false, 4, (Object)null);
                  } catch (Exception var5) {
                     var10001 = false;
                     return;
                  }

                  if (var30) {
                     try {
                        var26.Ϳ(var25, 493);
                     } catch (Exception var4) {
                        var10001 = false;
                     }
                  }
               }
            }
         }

      }
   }
}
