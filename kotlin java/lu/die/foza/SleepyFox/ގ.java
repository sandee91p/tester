package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.os.IBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ގ extends ࢯ {
   @NotNull
   public static final ގ.Ϳ ՠ = new ގ.Ϳ();
   @NotNull
   public static final ގ ֈ = new ގ();
   @NotNull
   public final <undefinedtype> ԯ;

   public ގ() {
      ގ var10000 = this;
      super();
      ࢯ var1;
      var1 = new ࢯ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            Object var2;
            label16: {
               ComponentName var10000;
               try {
                  var10000 = ޡ.Ϳ.Ϳ((IBinder)var1.ԩ[0]);
               } catch (Exception var3) {
                  var2 = null;
                  break label16;
               }

               var2 = var10000;
            }

            if (var2 == null) {
               var2 = super.Ϳ(var1);
            }

            return var2;
         }
      }.<init>();
      var10000.ԯ = var1;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ˁ var1) {
      ގ var10001 = this;
      var1.Ϳ((String)"getCallingPackage", (ໞ)this);
      String var2 = "getCallingActivity";
      var1.Ϳ((String)var2, (ໞ)var10001.ԯ);
   }

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      ޡ.Ϳ.getClass();
      Object var2;
      if ((var2 = ޡ.Ԩ) == null && (var2 = ࢦ.Ϳ.ԩ()) == null) {
         var2 = super.Ϳ(var1);
      }

      return var2;
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ގ _/* $FF was: Ϳ*/() {
         return ގ.ֈ;
      }
   }
}
