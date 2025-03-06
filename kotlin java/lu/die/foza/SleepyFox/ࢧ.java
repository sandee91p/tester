package lu.die.foza.SleepyFox;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ࢧ extends ޜ {
   @NotNull
   public static final ࢧ.Ϳ Ԫ = new ࢧ.Ϳ();
   @NotNull
   public static final ࢧ ԫ = new ࢧ();

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      String var10000;
      boolean var10001;
      try {
         var10000 = this.ԩ();
      } catch (Exception var10) {
         var10001 = false;
         return var1.Ԫ();
      }

      String var2 = var10000;
      if (var10000 != null) {
         Object[] var11;
         try {
            var11 = var1.ԩ;
         } catch (Exception var9) {
            var10001 = false;
            return var1.Ԫ();
         }

         Object[] var3 = var11;
         int var4 = 0;

         int var12;
         try {
            var12 = var11.length;
         } catch (Exception var8) {
            var10001 = false;
            return var1.Ԫ();
         }

         for(int var5 = var12; var4 < var5; ++var4) {
            boolean var13;
            try {
               var13 = Intrinsics.areEqual(var2, var3[var4]);
            } catch (Exception var7) {
               var10001 = false;
               break;
            }

            if (var13) {
               try {
                  var3[var4] = this.ԫ();
               } catch (Exception var6) {
                  var10001 = false;
                  break;
               }
            }
         }
      }

      return var1.Ԫ();
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ࢧ _/* $FF was: Ϳ*/() {
         return ࢧ.ԫ;
      }
   }
}
