package lu.die.foza.SleepyFox;

import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

public final class ࢩ {
   @NotNull
   public static final ࢩ Ϳ = new ࢩ();

   public final void _/* $FF was: Ϳ*/(@NotNull Context var1) {
      while(true) {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = var1 instanceof ContextWrapper;
         } catch (Exception var11) {
            var10001 = false;
            break;
         }

         if (var10000) {
            Context var15;
            try {
               var15 = ((ContextWrapper)var1).getBaseContext();
            } catch (Exception var4) {
               var10001 = false;
               break;
            }

            var1 = var15;
         } else {
            ˋ var16;
            try {
               var16 = ˋ.Ϳ;
            } catch (Exception var10) {
               var10001 = false;
               break;
            }

            ˋ var12 = var16;

            Object var17;
            try {
               var17 = var16.Ԩ((Object)var1, "mPackageInfo");
            } catch (Exception var9) {
               var10001 = false;
               break;
            }

            Object var14 = var17;
            if (var17 == null) {
               return;
            }

            Field var18;
            try {
               var18 = var12.Ϳ(var14, "mClassLoader");
            } catch (Exception var8) {
               var10001 = false;
               break;
            }

            Field var13 = var18;
            if (var18 == null) {
               return;
            }

            ࢾ var19;
            try {
               var18 = var13;
               var13.setAccessible(true);
               var19 = new ࢾ;
            } catch (Exception var7) {
               var10001 = false;
               break;
            }

            ࢾ var2 = var19;

            try {
               var17 = var18.get(var14);
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            Object var3 = var17;
            if (var17 == null) {
               return;
            }

            try {
               var2.<init>((ClassLoader)var3);
               var13.set(var14, var2);
            } catch (Exception var5) {
               var10001 = false;
            }
            break;
         }
      }

   }
}
