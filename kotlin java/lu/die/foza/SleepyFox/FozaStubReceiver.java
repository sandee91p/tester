package lu.die.foza.SleepyFox;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"},
   d2 = {"Llu/die/foza/SleepyFox/FozaStubReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "foza_release"}
)
public final class FozaStubReceiver extends BroadcastReceiver {
   public void onReceive(@NotNull Context var1, @NotNull Intent var2) {
      Intent var10000;
      boolean var10001;
      try {
         var10000 = (Intent)var2.getParcelableExtra("foza_key_intent");
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      Intent var7 = var10000;
      if (var10000 != null) {
         String var9;
         try {
            var9 = var2.getStringExtra("foza_key_first_user");
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         String var8 = var9;
         if (var9 == null) {
            try {
               var9 = ࢪ.֏.Ϳ();
            } catch (Exception var4) {
               var10001 = false;
               return;
            }

            var8 = var9;
         }

         try {
            ࢢ.Ϳ.Ԩ(var7, var8);
         } catch (Exception var3) {
            var10001 = false;
         }

      }
   }
}
