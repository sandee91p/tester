package lu.die.foza.SleepyFox;

import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢱ {
   @NotNull
   public static final ࢱ.Ϳ Ϳ = new ࢱ.Ϳ();
   @NotNull
   public static final ࢱ Ԩ = new ࢱ();

   // $FF: synthetic method
   public static File _/* $FF was: Ϳ*/(ࢱ var0, String var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = true;
      }

      return var0.Ϳ(var1, var2);
   }

   @NotNull
   public final File _/* $FF was: Ϳ*/(@NotNull File var1, @NotNull File var2) {
      boolean var10000;
      try {
         var10000 = Intrinsics.areEqual(var1.getCanonicalFile(), var2.getCanonicalFile());
      } catch (Exception var3) {
         return var1;
      }

      if (var10000) {
         return var2;
      } else {
         return var1;
      }
   }

   @Nullable
   public final File _/* $FF was: Ϳ*/(@NotNull String var1) {
      File[] var10000;
      boolean var10001;
      try {
         var10000 = ೲ.Ϳ.Ԩ();
      } catch (Exception var11) {
         var10001 = false;
         return null;
      }

      File[] var12 = var10000;
      int var2 = 0;

      int var14;
      try {
         var14 = var10000.length;
      } catch (Exception var10) {
         var10001 = false;
         return null;
      }

      for(int var3 = var14; var2 < var3; ++var2) {
         File var15;
         try {
            var15 = var12[var2];
         } catch (Exception var9) {
            var10001 = false;
            break;
         }

         File var4 = var15;

         boolean var16;
         try {
            var16 = var15.exists();
         } catch (Exception var8) {
            var10001 = false;
            break;
         }

         if (var16) {
            Ⴧ var17;
            File var18;
            String[] var10002;
            try {
               var17 = Ⴧ.Ϳ;
               var18 = var4;
               var10002 = new String[1];
            } catch (Exception var7) {
               var10001 = false;
               break;
            }

            String[] var13 = var10002;

            try {
               var10002[0] = var1;
               var15 = var17.Ϳ(var18, var13);
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            var4 = var15;

            try {
               var16 = var15.exists();
            } catch (Exception var5) {
               var10001 = false;
               break;
            }

            if (var16) {
               return var4;
            }
         }
      }

      return null;
   }

   @RequiresApi(24)
   @Nullable
   public final File _/* $FF was: Ϳ*/(@NotNull String var1, boolean var2) {
      StorageManager var10000;
      boolean var10001;
      try {
         var10000 = (StorageManager)ࢦ.ֈ().getSystemService(StorageManager.class);
      } catch (Exception var13) {
         var10001 = false;
         return null;
      }

      StorageManager var14 = var10000;
      if (var10000 == null) {
         return null;
      } else {
         Iterator var17;
         try {
            var17 = var14.getStorageVolumes().iterator();
         } catch (Exception var12) {
            var10001 = false;
            return null;
         }

         Iterator var15 = var17;

         while(true) {
            boolean var18;
            try {
               var18 = var15.hasNext();
            } catch (Exception var11) {
               var10001 = false;
               break;
            }

            if (!var18) {
               break;
            }

            StorageVolume var19;
            try {
               var19 = (StorageVolume)var15.next();
            } catch (Exception var10) {
               var10001 = false;
               break;
            }

            StorageVolume var3 = var19;

            try {
               var18 = var19.isRemovable();
            } catch (Exception var9) {
               var10001 = false;
               break;
            }

            if (var18) {
               try {
                  var18 = ތ.ؠ;
               } catch (Exception var8) {
                  var10001 = false;
                  break;
               }

               File var20;
               if (var18) {
                  try {
                     var20 = var3.getDirectory();
                  } catch (Exception var7) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     var20 = (File)ˋ.Ϳ.ԩ((Object)var3, "getPathFile");
                  } catch (Exception var6) {
                     var10001 = false;
                     break;
                  }
               }

               File var16 = var20;
               if (var16 != null) {
                  try {
                     var20 = ೲ.Ϳ.Ϳ(var16, var1, var2);
                  } catch (Exception var5) {
                     var10001 = false;
                     break;
                  }

                  var16 = var20;

                  try {
                     var18 = var20.canWrite();
                  } catch (Exception var4) {
                     var10001 = false;
                     break;
                  }

                  if (var18) {
                     return var16;
                  }
               }
            }
         }

         return null;
      }
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ࢱ _/* $FF was: Ϳ*/() {
         return ࢱ.Ԩ;
      }
   }
}
