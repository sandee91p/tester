package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0002J,\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014¨\u0006\u001a"},
   d2 = {"Llu/die/foza/SleepyFox/FozaDelegateActivity;", "Landroid/app/Activity;", "<init>", "()V", "dealFinish", "", "removeTask", "", "targetIntent", "Landroid/content/Intent;", "dealOriginFinish", "isOriginPackageName", "processResultAndLaunch", "user", "", "activityInfo", "Landroid/content/pm/ActivityInfo;", "callingPackageName", "dealWithDelegateIntent", "originIntent", "executeInternal", "onNewIntent", "intent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "foza_release"}
)
public final class FozaDelegateActivity extends Activity {
   // $FF: synthetic method
   public static void _/* $FF was: Ϳ*/(FozaDelegateActivity var0, Intent var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      var0.Ϳ(var1, var2);
   }

   public static final void _/* $FF was: Ϳ*/(ArrayList var0, FozaDelegateActivity var1, Intent var2, String var3, String var4, DialogInterface var5, int var6) {
      label45: {
         ActivityInfo var10000;
         boolean var10001;
         try {
            var10000 = (ActivityInfo)var0.get(var6);
         } catch (Exception var11) {
            var10001 = false;
            break label45;
         }

         ActivityInfo var12 = var10000;

         try {
            ࡠ.ԩ.getClass();
         } catch (Exception var10) {
            var10001 = false;
            break label45;
         }

         boolean var13;
         try {
            var13 = ࡠ.ԫ().ԯ(var12.packageName);
         } catch (Exception var9) {
            var10001 = false;
            break label45;
         }

         if (!var13) {
            try {
               var1.Ϳ(var2, (String)null, var12, (String)null);
               return;
            } catch (Exception var7) {
               var10001 = false;
            }
         } else {
            try {
               var1.Ϳ(var2, var3, var12, var4);
               return;
            } catch (Exception var8) {
               var10001 = false;
            }
         }
      }

      var1.Ϳ(var2);
   }

   public static final void _/* $FF was: Ϳ*/(FozaDelegateActivity var0, Intent var1, DialogInterface var2, int var3) {
      var0.Ϳ(var1);
   }

   public static final void _/* $FF was: Ϳ*/(FozaDelegateActivity var0, Intent var1, DialogInterface var2) {
      if (!var0.isFinishing()) {
         var0.Ϳ(var1);
      }

   }

   public static final void _/* $FF was: Ϳ*/(Builder var0) {
      var0.show();
   }

   public static final void _/* $FF was: Ϳ*/(FozaDelegateActivity var0, Intent var1, Intent var2) {
      try {
         var0.Ϳ(var1, var2);
      } catch (Exception var3) {
         var0.Ϳ(var1);
      }
   }

   public void onNewIntent(@Nullable Intent var1) {
      super.onNewIntent(var1);
      if (var1 != null) {
         this.Ԩ(var1);
      }

   }

   public void onCreate(@Nullable Bundle var1) {
      super.onCreate(var1);
      this.Ԩ(this.getIntent());
   }

   public final void _/* $FF was: Ϳ*/(boolean var1) {
      if (var1) {
         this.finishAndRemoveTask();
      } else {
         this.finish();
      }

   }

   public final void _/* $FF was: Ϳ*/(Intent var1) {
      this.Ϳ(ྌ.Ϳ.Ϳ(268435456, var1));
   }

   public final void _/* $FF was: Ϳ*/(Intent var1, boolean var2) {
      boolean var10000;
      boolean var10001;
      try {
         var10000 = ྌ.Ϳ.Ϳ(268435456, var1);
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      boolean var3 = var10000;
      if (!var10000) {
         try {
            var1.addFlags(33554432);
         } catch (Exception var6) {
            var10001 = false;
            return;
         }
      }

      try {
         var10000 = var3;
         this.startActivity(var1);
      } catch (Exception var5) {
         var10001 = false;
         return;
      }

      boolean var8;
      if (var10000 && !var2) {
         var8 = true;
      } else {
         var8 = false;
      }

      try {
         this.Ϳ(var8);
      } catch (Exception var4) {
         var10001 = false;
      }

   }

   public final void _/* $FF was: Ϳ*/(Intent param1, String param2, ActivityInfo param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(Intent var1, Intent var2) {
      var1.setComponent((ComponentName)null);
      String var3;
      if ((var3 = var2.getStringExtra("key_launch_target_username")) == null) {
         var3 = ࢪ.֏.Ϳ();
      }

      String var12 = var2.getStringExtra("foza_key_calling_package");
      ArrayList var4;
      var4 = new ArrayList.<init>();
      ࡠ.ԩ.getClass();
      List var5;
      ʹ var6;
      ActivityInfo var7;
      String var8;
      Iterator var15;
      if ((var5 = ࡠ.Ϳ(ࡠ.ԫ(), var1, (String)null, 0, 6, (Object)null)) != null) {
         var6 = new ʹ.<init>(var5.size());
         var15 = var5.iterator();

         while(var15.hasNext()) {
            var7 = ((ResolveInfo)var15.next()).activityInfo;
            var8 = var7.packageName;
            var6.ԩ((new ComponentName(var8, var7.name)).hashCode());
            var4.add(var7);
         }
      } else {
         var6 = null;
      }

      if ((var5 = ࢼ.Ԩ(ࢼ.Ϳ, var1, 0, 2, (Object)null)) != null) {
         var15 = var5.iterator();

         label59:
         while(true) {
            do {
               if (!var15.hasNext()) {
                  break label59;
               }

               var7 = ((ResolveInfo)var15.next()).activityInfo;
               if (var6 == null) {
                  break;
               }

               var8 = var7.packageName;
            } while(var6.Ϳ((new ComponentName(var8, var7.name)).hashCode()));

            var4.add(var7);
         }
      }

      if (var4.isEmpty()) {
         this.Ϳ(var1);
      } else if (var4.size() == 1) {
         ActivityInfo var14 = (ActivityInfo)var4.get(0);
         if (ࢽ.Ϳ.ؠ(var14.packageName)) {
            this.Ϳ(var1, var3, var14, var12);
         } else {
            Uri var13;
            if (Intrinsics.areEqual((var13 = var1.getData()) != null ? var13.getScheme() : null, "package")) {
               var13 = Uri.fromParts("package", this.getPackageName(), (String)null);
               var1.setDataAndType(var13, var1.getType());
            }

            Ϳ(this, var1, false, 2, (Object)null);
         }

      } else {
         PackageManager var16 = this.getPackageManager();
         int var18 = 0;

         int var19;
         String[] var20;
         for(var20 = new String[var19 = var4.size()]; var18 < var19; ++var18) {
            ActivityInfo var9 = (ActivityInfo)var4.get(var18);
            StringBuilder var10;
            StringBuilder var10002 = var10 = new StringBuilder;
            var10.<init>();
            var20[var18] = var10002.append(var9.loadLabel(var16)).append(" (").append(var9.packageName).append(')').toString();
         }

         Builder var17;
         Builder var10001 = var17 = new Builder;
         var17.<init>(this);
         CharSequence[] var11 = (CharSequence[])var20;
         var17.setItems(var11, FozaDelegateActivity::Ϳ);
         var17.setNegativeButton("X", FozaDelegateActivity::Ϳ);
         var10001.setOnDismissListener(FozaDelegateActivity::Ϳ);
         this.runOnUiThread(FozaDelegateActivity::Ϳ);
      }
   }

   public final void _/* $FF was: Ԩ*/(Intent var1) {
      boolean var10000;
      boolean var10001;
      try {
         var10000 = ތ.ނ;
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      Intent var8;
      if (var10000) {
         try {
            var8 = (Intent)var1.getParcelableExtra("foza_key_intent", Intent.class);
         } catch (Exception var6) {
            var10001 = false;
            return;
         }
      } else {
         try {
            var8 = (Intent)var1.getParcelableExtra("foza_key_intent");
         } catch (Exception var5) {
            var10001 = false;
            return;
         }
      }

      Intent var2 = var8;
      if (var2 == null) {
         try {
            this.finishAndRemoveTask();
            return;
         } catch (Exception var3) {
            var10001 = false;
         }
      } else {
         try {
            (new Thread(FozaDelegateActivity::Ϳ)).start();
         } catch (Exception var4) {
            var10001 = false;
         }
      }

   }
}
