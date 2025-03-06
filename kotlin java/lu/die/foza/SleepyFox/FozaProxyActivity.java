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
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\r\u001a\u00020\u0005H\u0014¨\u0006\u000e"},
   d2 = {"Llu/die/foza/SleepyFox/FozaProxyActivity;", "Landroid/app/Activity;", "<init>", "()V", "scheduleActivityProxy", "", "oneIntent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onPause", "foza_release"}
)
public final class FozaProxyActivity extends Activity {
   // $FF: synthetic method
   public static void _/* $FF was: Ϳ*/(FozaProxyActivity var0, Intent var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = var0.getIntent();
      }

      var0.Ϳ(var1);
   }

   public void onCreate(@Nullable Bundle var1) {
      super.onCreate(var1);
      Ϳ(this, (Intent)null, 1, (Object)null);
   }

   public void onNewIntent(@Nullable Intent var1) {
      super.onNewIntent(var1);
      this.Ϳ(var1);
   }

   public void onPause() {
      super.onPause();
      this.finish();
   }

   public final void _/* $FF was: Ϳ*/(Intent var1) {
      if (var1 != null) {
         Intent var10000;
         boolean var10001;
         try {
            var10000 = (Intent)var1.getParcelableExtra("key_store_real_activity_intent");
         } catch (Exception var17) {
            var10001 = false;
            return;
         }

         Intent var2 = var10000;
         if (var10000 != null) {
            String var19;
            try {
               var19 = var1.getStringExtra("key_launch_target_username");
            } catch (Exception var16) {
               var10001 = false;
               return;
            }

            String var3 = var19;
            if (var19 == null) {
               try {
                  var19 = ࢪ.֏.Ϳ();
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               var3 = var19;
            }

            String var22;
            try {
               var10000 = var2;
               var22 = var1.getStringExtra("foza_key_calling_package");
            } catch (Exception var14) {
               var10001 = false;
               return;
            }

            String var4 = var22;

            try {
               var10000.toString();
            } catch (Exception var13) {
               var10001 = false;
               return;
            }

            try {
               ޠ.Ԫ.getClass();
            } catch (Exception var12) {
               var10001 = false;
               return;
            }

            try {
               var10000 = ޠ.ԫ().Ԩ(var2, var3);
            } catch (Exception var11) {
               var10001 = false;
               return;
            }

            Intent var18 = var10000;
            if (var10000 != null) {
               boolean var20;
               try {
                  var20 = ྌ.Ϳ.Ϳ(268435456, var1);
               } catch (Exception var9) {
                  var10001 = false;
                  return;
               }

               if (!var20) {
                  try {
                     var18.addFlags(33554432);
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }
               }

               Intent var10002;
               FozaProxyActivity var21;
               Intent var23;
               try {
                  var21 = this;
                  var23 = var18;
                  var10002 = var18;
                  var18.putExtra("foza_key_calling_package", var4);
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }

               try {
                  var10002.toString();
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               try {
                  var21.startActivity(var23);
                  return;
               } catch (Exception var5) {
                  var10001 = false;
               }
            } else {
               try {
                  var2.toString();
               } catch (Exception var10) {
                  var10001 = false;
               }
            }

         }
      }
   }
}
