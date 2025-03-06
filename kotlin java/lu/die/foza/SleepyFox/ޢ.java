package lu.die.foza.SleepyFox;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.IBinder;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ޢ extends Ԩ<ຩ> {
   @NotNull
   public static final ޢ Ԩ = new ޢ();
   @NotNull
   public static final String ԩ = ʽ.class.getName();

   @NotNull
   public String _/* $FF was: Ϳ*/() {
      return ԩ;
   }

   public void _/* $FF was: Ϳ*/(@NotNull IBinder var1) {
      lu.die.foza.SleepyFox.Ԩ.Ϳ(this, var1, null.INSTANCE, (Function0)null, 4, (Object)null);
   }

   public final void _/* $FF was: Ϳ*/(@Nullable Uri var1, boolean var2, @NotNull IContentObserver var3) {
      try {
         ((ຩ)this.Ԩ()).Ϳ(var1, var2, var3.asBinder());
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: Ϳ*/(@NotNull IContentObserver var1) {
      try {
         ((ຩ)this.Ԩ()).Ԩ(var1.asBinder());
      } catch (Exception var2) {
         ࢺ.Ϳ.Ϳ();
      }

   }

   public final void _/* $FF was: Ϳ*/(@NotNull Uri[] var1, @NotNull IContentObserver var2, boolean var3) {
      try {
         ((ຩ)this.Ԩ()).Ϳ(var1, var2.asBinder(), var3);
      } catch (Exception var4) {
         ࢺ.Ϳ.Ϳ();
      }

   }
}
