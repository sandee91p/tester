package lu.die.foza.SleepyFox;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ތ {
   @NotNull
   public static final ތ Ϳ;
   @JvmField
   public static final boolean Ԩ;
   @JvmField
   public static final boolean ԩ;
   @JvmField
   public static final boolean Ԫ;
   @JvmField
   public static final boolean ԫ;
   @JvmField
   public static final boolean Ԭ;
   @JvmField
   public static final boolean ԭ;
   @JvmField
   public static final boolean Ԯ;
   @JvmField
   public static final boolean ԯ;
   @JvmField
   public static final boolean ՠ;
   @JvmField
   public static final boolean ֈ;
   @JvmField
   public static final boolean ֏;
   @JvmField
   public static final boolean ׯ;
   @JvmField
   public static final boolean ؠ;
   @JvmField
   public static final boolean ހ;
   @JvmField
   public static final boolean ށ;
   @JvmField
   public static final boolean ނ;
   @JvmField
   public static final boolean ރ;

   static {
      int var0;
      ތ.Ϳ var1;
      boolean var3;
      label87: {
         Ϳ = new ތ();
         Ԩ = (var0 = VERSION.SDK_INT) >= 25;
         ԩ = var0 >= 22;
         Ԫ = var0 >= 23;
         ԫ = var0 >= 24;
         Ԭ = var0 >= 26;
         ԭ = var0 >= 27;
         Ԯ = var0 >= 28;
         ԯ = StringsKt.equals("samsung", Build.BRAND, true) || StringsKt.equals("samsung", Build.MANUFACTURER, true);
         if (!(ՠ = (var1 = ތ.Ϳ.Ϳ).Ԩ("ro.build.version.magic"))) {
            String var10000 = Build.DISPLAY.toUpperCase(Locale.getDefault());
            Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
            if (!StringsKt.startsWith$default(var10000, "EMUI", false, 2, (Object)null)) {
               var3 = StringsKt.contains$default(var1.Ϳ("ro.build.version.emui"), "EmotionUI", false, 2, (Object)null);
               break label87;
            }
         }

         var3 = true;
      }

      ֈ = var3;
      String var10001 = Build.DISPLAY.toLowerCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
      ֏ = StringsKt.contains$default(var10001, "flyme", false, 2, (Object)null);
      ׯ = var1.Ԩ("ro.build.version.oplusrom") || var1.Ԩ("oplus.device.firstboot");
      ؠ = var0 >= 30;
      ހ = var0 >= 29;
      ށ = var0 >= 31;
      ނ = var0 >= 33;
      ރ = var0 >= 34;
   }

   public final int _/* $FF was: Ϳ*/() {
      int var3;
      if (Ԫ) {
         int var10000;
         try {
            var10000 = VERSION.PREVIEW_SDK_INT;
         } finally {
            ;
         }

         var3 = var10000;
      } else {
         var3 = 0;
      }

      return var3;
   }

   private static final class Ϳ {
      @NotNull
      public static final ތ.Ϳ Ϳ = new ތ.Ϳ();
      @NotNull
      public static final ಀ<String> Ԩ;

      public _/* $FF was: Ϳ*/() {
      }

      static {
         Class[] var0;
         Class[] var10002 = var0 = new Class[2];
         var10002[0] = String.class;
         var10002[1] = String.class;
         Ԩ = (new ಀ("get", var0)).Ϳ("android.os.SystemProperties");
      }

      @NotNull
      public final String _/* $FF was: Ϳ*/(@Nullable String var1) {
         String var5;
         String var6;
         label39: {
            label34: {
               ಀ var10000;
               boolean var10001;
               try {
                  var10000 = Ԩ;
               } catch (Exception var4) {
                  var10001 = false;
                  break label34;
               }

               Object var7 = null;

               Object[] var10002;
               Object[] var10003;
               try {
                  var10002 = new Object[2];
                  var10003 = var10002;
                  var10002[0] = var1;
               } catch (Exception var3) {
                  var10001 = false;
                  break label34;
               }

               byte var10004 = 1;

               try {
                  var10003[var10004] = "";
                  var6 = String.valueOf(var10000.Ϳ(var7, var10002));
                  break label39;
               } catch (Exception var2) {
                  var10001 = false;
               }
            }

            var5 = "";
            return var5;
         }

         var5 = var6;
         return var5;
      }

      public final boolean _/* $FF was: Ԩ*/(@Nullable String var1) {
         return Ϳ.Ϳ(var1).length() > 0;
      }
   }
}
