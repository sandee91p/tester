package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.app.Application;
import android.os.Process;
import dalvik.system.VMRuntime;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ॱ {
   @NotNull
   public static final ॱ Ϳ = new ॱ();

   @Nullable
   public final String _/* $FF was: Ϳ*/() {
      boolean var10000;
      boolean var10001;
      try {
         var10000 = ތ.Ԯ;
      } catch (Throwable var12) {
         var10001 = false;
         return null;
      }

      if (var10000) {
         try {
            return Application.getProcessName();
         } catch (Throwable var10) {
            var10001 = false;
            return null;
         }
      } else {
         try {
            return ActivityThread.currentProcessName();
         } catch (Throwable var11) {
            var10001 = false;
            return null;
         }
      }
   }

   public final boolean _/* $FF was: Ԩ*/() {
      boolean var10000;
      boolean var13;
      label113: {
         label105: {
            boolean var10001;
            try {
               var10000 = ތ.Ԫ;
            } catch (Throwable var12) {
               var10001 = false;
               break label105;
            }

            if (var10000) {
               label99:
               try {
                  var10000 = Process.is64Bit();
               } catch (Throwable var10) {
                  var10001 = false;
                  break label99;
               }
            } else {
               label101:
               try {
                  var10000 = VMRuntime.getRuntime().is64Bit();
               } catch (Throwable var11) {
                  var10001 = false;
                  break label101;
               }
            }
            break label113;
         }

         var13 = false;
         return var13;
      }

      var13 = var10000;
      return var13;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1) {
      Class var10000;
      boolean var10001;
      Class[] var10002;
      String var15;
      try {
         var10000 = Process.class;
         var15 = "setArgV0";
         var10002 = new Class[1];
      } catch (Throwable var13) {
         var10001 = false;
         return;
      }

      Class[] var10003 = var10002;
      byte var10004 = 0;

      Method var14;
      try {
         var10003[var10004] = String.class;
         var14 = var10000.getMethod(var15, var10002);
      } catch (Throwable var12) {
         var10001 = false;
         return;
      }

      var15 = null;

      try {
         var14.invoke(var15, var1);
      } catch (Throwable var11) {
         var10001 = false;
         return;
      }

   }
}
