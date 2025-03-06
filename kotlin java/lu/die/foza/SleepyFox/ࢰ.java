package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.storage.StorageVolume;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFozaEnhancedScopedStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaEnhancedScopedStorage.kt\nlu/die/foza/HookEntity/FozaCoreHooker/FozaEnhancedScopedStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class ࢰ {
   @NotNull
   public static final ࢰ Ϳ = new ࢰ();
   @NotNull
   public static Function1<? super Function0<? extends Object>, ? extends Object> Ԩ;

   @JvmStatic
   @SuppressLint({"NewApi"})
   @Nullable
   public static final File _/* $FF was: Ϳ*/(@NotNull String var0) {
      try {
         return ೲ.Ϳ.Ϳ(Environment.getExternalStorageDirectory(), var0, false);
      } catch (Exception var1) {
         return null;
      }
   }

   // $FF: synthetic method
   public static final StorageVolume[] _/* $FF was: Ϳ*/(ࢰ var0, Object var1) {
      return var0.Ϳ(var1);
   }

   static {
      Ԩ = null.INSTANCE;
   }

   @NotNull
   public final Function1<Function0<? extends Object>, Object> _/* $FF was: Ϳ*/() {
      return Ԩ;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Function1<? super Function0<? extends Object>, ? extends Object> var1) {
      Ԩ = var1;
   }

   public final StorageVolume[] _/* $FF was: Ϳ*/(StorageVolume var1, ૹ<File> var2, ૹ<String> var3) {
      ೲ var6 = ೲ.Ϳ;
      File var4;
      if ((var4 = (File)var2.ԩ(var1)) == null) {
         return null;
      } else {
         String var5;
         if ((var5 = ࢦ.Ϳ.ԩ()) == null) {
            return null;
         } else {
            File var7;
            if (((var7 = ೲ.Ϳ(var6, var4, var5, false, 4, (Object)null)).exists() || var7.mkdirs()) && !var7.canRead()) {
               return null;
            } else {
               var2.Ϳ(var1, var7);
               var3.Ϳ(var1, "mounted");
               byte var8 = 0;
               StorageVolume[] var10000 = new StorageVolume[1];
               var10000[var8] = var1;
               return var10000;
            }
         }
      }
   }

   @SuppressLint({"NewApi"})
   public final StorageVolume[] _/* $FF was: Ϳ*/(Object var1) {
      boolean var10001;
      if (var1 != null) {
         boolean var10000;
         try {
            var10000 = var1.getClass().isArray();
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         if (var10000) {
            ૹ var10002;
            ࢰ var10;
            StorageVolume[] var12;
            try {
               var10 = this;
               var12 = (StorageVolume[])var1;
               var10002 = new ૹ;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            ૹ var7 = var10002;

            try {
               var10002.<init>("mPath");
               var10002 = new ૹ;
            } catch (Exception var4) {
               var10001 = false;
               return null;
            }

            ૹ var9 = var10002;

            StorageVolume[] var11;
            try {
               var10002.<init>("mState");
               var11 = var10.Ϳ(var12[0], var7, var9);
            } catch (Exception var3) {
               var10001 = false;
               return null;
            }

            StorageVolume[] var8 = var11;
            if (var11 != null) {
               return var8;
            }

            return null;
         }
      }

      try {
         Objects.toString(var1);
      } catch (Exception var2) {
         var10001 = false;
         return null;
      }

      return null;
   }
}
