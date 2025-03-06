package lu.die.foza.SleepyFox;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.os.PersistableBundle;
import org.jetbrains.annotations.NotNull;

public final class ၜ extends lu.die.foza.SleepyFox.Ϳ {
   @NotNull
   public final ૹ<Object> Ԫ;
   @NotNull
   public final ૹ<Object> ԫ;

   public ၜ() {
      ၜ var10000 = this;
      ၜ var10001 = this;
      super();
      ૹ var1;
      var1 = new ૹ.<init>("extras");
      var10001.Ԫ = var1;
      var1 = new ૹ.<init>("service");
      var10000.ԫ = var1;
   }

   // $FF: synthetic method
   public static final void _/* $FF was: Ϳ*/(ၜ var0, JobInfo var1) {
      var0.Ϳ(var1);
   }

   public void _/* $FF was: Ԫ*/() {
      ၜ var12;
      ၜ var10000;
      boolean var10001;
      try {
         var10000 = this;
         var12 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var8) {
         var10001 = false;
         return;
      }

      ˁ var11;
      try {
         var12.Ϳ = ࢯ.ՠ();
         var11 = var10000.Ϳ("jobscheduler");
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      ˁ var1 = var11;
      if (var11 != null) {
         ࢯ var13;
         try {
            var11 = var1;
            var13 = new ࢯ() {
               public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                  // $FF: Couldn't be decompiled
               }
            };
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         ࢯ var10 = var13;

         String[] var15;
         try {
            var13.<init>();
            var15 = new String[3];
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         String[] var10002 = var15;
         String[] var9;
         String[] var10003 = var9 = var15;
         byte var10004 = 0;

         try {
            var10003[var10004] = "schedule";
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         byte var16 = 1;

         try {
            var10002[var16] = "enqueue";
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         byte var14 = 2;

         try {
            var15[var14] = "scheduleAsPackage";
            var11.Ϳ((ໞ)var10, (String[])var9);
         } catch (Exception var2) {
            var10001 = false;
         }
      }

   }

   public final String _/* $FF was: ԫ*/() {
      ࢦ.Ϳ.getClass();
      return ࢦ.Ԯ;
   }

   public final void _/* $FF was: Ϳ*/(JobInfo var1) {
      ComponentName var2 = var1.getService();
      PersistableBundle var3;
      PersistableBundle var10002 = var3 = new PersistableBundle;
      var3.<init>();
      var3.putPersistableBundle("foza_key_app_origin_bd", var1.getExtras());
      var10002.putString("foza_key_app_service", var2.flattenToString());
      this.Ԫ.Ϳ(var1, var3);
      ComponentName var10001 = var2 = new ComponentName;
      String var4 = this.ԫ();
      StringBuilder var10003 = (new StringBuilder()).append(FozaStubJobService.Companion.FozaStubJobServiceDang.class.getName());
      ࢦ.Ϳ.getClass();
      var10001.<init>(var4, var10003.append(ࢦ.Ԩ).toString());
      this.ԫ.Ϳ(var1, var2);
   }
}
