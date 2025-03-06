package lu.die.foza.SleepyFox;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࣇ extends ࢯ {
   @NotNull
   public static final ࣇ ԯ = new ࣇ();

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      List var9;
      boolean var11;
      label61: {
         boolean var10001;
         try {
            ࢦ.Ϳ.getClass();
         } catch (Exception var8) {
            var10001 = false;
            return super.Ϳ(var1);
         }

         ൔ var10000;
         try {
            var10000 = ࢦ.Ԭ;
         } catch (Exception var7) {
            var10001 = false;
            return super.Ϳ(var1);
         }

         ൔ var2 = var10000;
         if (var10000 == null) {
            return super.Ϳ(var1);
         }

         try {
            ޠ.Ԫ.getClass();
         } catch (Exception var6) {
            var10001 = false;
            return super.Ϳ(var1);
         }

         List var10;
         try {
            var10 = ޠ.ԫ().Ԩ(ࣆ.Ԩ.Ԩ(var2));
         } catch (Exception var5) {
            var10001 = false;
            return super.Ϳ(var1);
         }

         var9 = var10;
         if (var10 != null) {
            try {
               var11 = var9.isEmpty();
            } catch (Exception var4) {
               var10001 = false;
               return super.Ϳ(var1);
            }

            if (!var11) {
               var11 = false;
               break label61;
            }
         }

         var11 = true;
      }

      if (!var11) {
         return var9;
      } else {
         return super.Ϳ(var1);
      }
   }
}
