package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014¨\u0006\t"},
   d2 = {"Llu/die/foza/SleepyFox/FozaStubActivityGroup;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "foza_release"}
)
public final class FozaStubActivityGroup extends Activity {
   public void onCreate(@Nullable Bundle var1) {
      super.onCreate((Bundle)null);
      this.finishAndRemoveTask();
   }

   public void onDestroy() {
      super.onDestroy();
      if (!ࢦ.Ϳ.ރ() && ތ.ށ) {
         ޔ.Ϳ.Ԩ();
      }

      Intent var1;
      Intent var3;
      if ((var1 = ྌ.Ԩ(var3 = this.getIntent())) != null) {
         String var4;
         if ((var4 = var3.getStringExtra("foza_key_first_user")) != null && var4.length() != 0) {
            ޠ.Ԫ.getClass();
            ޠ.ԫ().ԩ(var1, var4);
         } else {
            ޠ.Ԫ.getClass();
            ޠ.ԫ().ԩ(var1, ࢪ.֏.Ϳ());
         }

      }
   }
}
