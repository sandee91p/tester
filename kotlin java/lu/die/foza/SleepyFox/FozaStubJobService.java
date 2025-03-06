package lu.die.foza.SleepyFox;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.die.lu.FozaServiceConnection;
import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"},
   d2 = {"Llu/die/foza/SleepyFox/FozaStubJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "mServiceConnection", "Landroid/die/lu/FozaServiceConnection;", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "Companion", "foza_release"}
)
public class FozaStubJobService extends JobService {
   @NotNull
   public static final FozaStubJobService.Companion Ԩ = new FozaStubJobService.Companion();
   @NotNull
   public static final ૹ<Object> ԩ = new ૹ("extras");
   @NotNull
   public final FozaServiceConnection Ϳ;

   public FozaStubJobService() {
      FozaStubJobService var10000 = this;
      super();
      FozaServiceConnection var1;
      var1 = new FozaServiceConnection.<init>((ServiceConnection)null);
      var10000.Ϳ = var1;
   }

   public static final void _/* $FF was: Ϳ*/(ComponentName var0, JobParameters var1) {
      Service var10000;
      boolean var10001;
      try {
         var10000 = ߿.Ϳ.Ϳ(var0);
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      Service var5 = var10000;

      boolean var6;
      try {
         var6 = var10000 instanceof JobService;
      } catch (Exception var3) {
         var10001 = false;
         return;
      }

      if (var6) {
         try {
            ((JobService)var5).onStartJob(var1);
         } catch (Exception var2) {
            var10001 = false;
         }
      }

   }

   public boolean onStartJob(@Nullable JobParameters var1) {
      if (var1 != null) {
         PersistableBundle var10000;
         boolean var10001;
         try {
            var10000 = var1.getExtras();
         } catch (Throwable var215) {
            var10001 = false;
            return true;
         }

         PersistableBundle var2 = var10000;
         if (var10000 != null) {
            try {
               var10000 = var2.getPersistableBundle("foza_key_app_origin_bd");
            } catch (Throwable var214) {
               var10001 = false;
               return true;
            }

            PersistableBundle var3 = var10000;
            if (var10000 == null) {
               return true;
            }

            ComponentName var218;
            try {
               ԩ.Ϳ(var1, var3);
               var218 = ComponentName.unflattenFromString(var2.getString("foza_key_app_service", ""));
            } catch (Throwable var213) {
               var10001 = false;
               return true;
            }

            ComponentName var216 = var218;
            if (var218 == null) {
               return true;
            }

            Intent var219;
            try {
               var219 = new Intent;
            } catch (Throwable var212) {
               var10001 = false;
               return true;
            }

            Intent var217;
            Intent var222 = var217 = var219;

            try {
               var222.<init>();
               var219.setComponent(var216);
            } catch (Throwable var211) {
               var10001 = false;
               return true;
            }

            ߿ var220;
            try {
               var220 = ߿.Ϳ;
            } catch (Throwable var210) {
               var10001 = false;
               return true;
            }

            ߿ var4 = var220;

            Service var221;
            try {
               var221 = var220.Ϳ(var216);
            } catch (Throwable var209) {
               var10001 = false;
               return true;
            }

            Service var5 = var221;
            if (var221 == null) {
               try {
                  var220 = var4;
                  ߿.Ϳ(var4, var217, this.Ϳ, (ServiceInfo)null, 4, (Object)null);
               } catch (Throwable var208) {
                  var10001 = false;
                  return true;
               }

               try {
                  var221 = var220.Ϳ(var216);
               } catch (Throwable var207) {
                  var10001 = false;
                  return true;
               }

               var5 = var221;
            }

            boolean var223;
            try {
               var223 = var5 instanceof JobService;
            } catch (Throwable var206) {
               var10001 = false;
               return true;
            }

            if (!var223) {
               try {
                  ࢭ.ֈ.getClass();
               } catch (Throwable var203) {
                  var10001 = false;
                  return true;
               }

               try {
                  ࢭ.ؠ.post(FozaStubJobService::Ϳ);
               } catch (Throwable var202) {
                  var10001 = false;
                  return true;
               }

               return true;
            } else {
               try {
                  var221 = var5;
                  ((JobService)var5).onBind(var217);
               } catch (Throwable var205) {
                  var10001 = false;
                  return true;
               }

               try {
                  return ((JobService)var221).onStartJob(var1);
               } catch (Throwable var204) {
                  var10001 = false;
                  return true;
               }
            }
         }
      }

      return true;
   }

   public boolean onStopJob(@Nullable JobParameters var1) {
      if (var1 != null) {
         PersistableBundle var10000;
         boolean var10001;
         try {
            var10000 = var1.getExtras();
         } catch (Throwable var58) {
            var10001 = false;
            return false;
         }

         PersistableBundle var59 = var10000;
         if (var10000 == null) {
            return false;
         } else {
            try {
               var10000 = var59.getPersistableBundle("foza_key_app_origin_bd");
            } catch (Throwable var57) {
               var10001 = false;
               return false;
            }

            PersistableBundle var2 = var10000;
            if (var10000 == null) {
               return false;
            } else {
               ComponentName var62;
               try {
                  ԩ.Ϳ(var1, var2);
                  var62 = ComponentName.unflattenFromString(var59.getString("foza_key_app_service", ""));
               } catch (Throwable var56) {
                  var10001 = false;
                  return false;
               }

               ComponentName var60 = var62;
               if (var62 == null) {
                  return true;
               } else {
                  Service var63;
                  try {
                     var63 = ߿.Ϳ.Ϳ(var60);
                  } catch (Throwable var55) {
                     var10001 = false;
                     return false;
                  }

                  Service var61 = var63;
                  if (var63 == null) {
                     return false;
                  } else {
                     boolean var64;
                     try {
                        var64 = var61 instanceof JobService;
                     } catch (Throwable var54) {
                        var10001 = false;
                        return false;
                     }

                     if (!var64) {
                        return false;
                     } else {
                        try {
                           var63 = var61;
                           ((JobService)var61).onBind(new Intent());
                        } catch (Throwable var53) {
                           var10001 = false;
                           return false;
                        }

                        try {
                           return ((JobService)var63).onStopJob(var1);
                        } catch (Throwable var52) {
                           var10001 = false;
                           return false;
                        }
                     }
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   public int onStartCommand(@Nullable Intent var1, int var2, int var3) {
      boolean var10001;
      Intent var6;
      if (var1 != null) {
         Intent var10000;
         try {
            var10000 = (Intent)var1.getParcelableExtra("foza_key_intent");
         } catch (Exception var5) {
            var10001 = false;
            return 2;
         }

         var6 = var10000;
      } else {
         var6 = null;
      }

      if (var6 != null) {
         try {
            ߿.Ϳ(߿.Ϳ, var6, false, (ServiceInfo)null, 6, (Object)null);
         } catch (Exception var4) {
            var10001 = false;
         }
      }

      return 2;
   }

   public static final class Companion {
      public Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final Intent _/* $FF was: Ϳ*/(int var1) {
         Intent var10000 = new Intent();
         ࢦ.Ϳ.getClass();
         return var10000.setComponent(new ComponentName(ࢦ.Ԯ, FozaStubJobService.Companion.FozaStubJobServiceDang.class.getName() + var1));
      }

      @NotNull
      public final Intent _/* $FF was: Ϳ*/(@NotNull Intent var1) {
         Intent var10000;
         boolean var10001;
         Intent var10002;
         ComponentName var10003;
         ComponentName var10004;
         ࢦ var10005;
         Intent var9;
         try {
            var10000 = new Intent;
            var9 = var10000;
            var10002 = var10000;
            var10000.<init>();
            var10003 = new ComponentName;
            var10004 = var10003;
            var10005 = ࢦ.Ϳ;
         } catch (Exception var6) {
            var10001 = false;
            return var1;
         }

         ࢦ var8 = var10005;

         try {
            var10005.getClass();
         } catch (Exception var5) {
            var10001 = false;
            return var1;
         }

         StringBuilder var10006;
         String var7;
         try {
            var7 = ࢦ.Ԯ;
            var10006 = (new StringBuilder()).append(FozaStubJobService.Companion.FozaStubJobServiceDang.class.getName());
            var8.getClass();
         } catch (Exception var4) {
            var10001 = false;
            return var1;
         }

         try {
            var10004.<init>(var7, var10006.append(ࢦ.Ԩ).toString());
            var10002.setComponent(var10003);
         } catch (Exception var3) {
            var10001 = false;
            return var1;
         }

         try {
            var9.putExtra("foza_key_intent", var1);
            return var10000;
         } catch (Exception var2) {
            var10001 = false;
            return var1;
         }
      }

      @Metadata(
         mv = {2, 0, 0},
         k = 1,
         xi = 50,
         d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"},
         d2 = {"Llu/die/foza/SleepyFox/FozaStubJobService$Companion$FozaStubJobServiceDang;", "Llu/die/foza/SleepyFox/FozaStubJobService;", "<init>", "()V", "foza_release"}
      )
      public static class FozaStubJobServiceDang extends FozaStubJobService {
      }
   }
}
