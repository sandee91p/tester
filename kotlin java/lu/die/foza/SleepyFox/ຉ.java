package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Handler.Callback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ຉ implements Callback {
   @NotNull
   public static final ຉ Ϳ = new ຉ();
   public static final int Ԩ = 12580;
   public static final int ԩ = 100;
   public static final int Ԫ = 112;
   public static boolean ԫ;
   @Nullable
   public static Callback Ԭ;
   public static int ԭ;
   @NotNull
   public static final ૹ<List<Intent>> Ԯ = new ૹ("intents");
   @NotNull
   public static final ૹ<IBinder> ԯ = new ૹ("token");
   @NotNull
   public static final ૹ<IBinder> ՠ = new ૹ("token");

   @Nullable
   public final Callback _/* $FF was: Ϳ*/() {
      return Ԭ;
   }

   public final void _/* $FF was: Ԩ*/(@Nullable Callback var1) {
      Ԭ = var1;
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull Callback var1) {
      Callback var10000;
      boolean var10001;
      Message var8;
      try {
         var10000 = var1;
         var8 = new Message;
      } catch (Exception var5) {
         var10001 = false;
         return false;
      }

      Message var10002 = var8;
      Message var10003 = var8;

      try {
         var10003.<init>();
         var10003.what = 12580;
         var10002.obj = this;
         var10000.handleMessage(var8);
      } catch (Exception var4) {
         var10001 = false;
         return false;
      }

      int var7;
      try {
         var7 = ԭ;
      } catch (Exception var3) {
         var10001 = false;
         return false;
      }

      boolean var6;
      if (var7 == 12580) {
         var6 = true;
      } else {
         var6 = false;
      }

      try {
         ԭ = 0;
         return var6;
      } catch (Exception var2) {
         var10001 = false;
         return false;
      }
   }

   public boolean handleMessage(@NotNull Message var1) {
      if (ԫ) {
         return false;
      } else {
         boolean var10000;
         label37: {
            try {
               try {
                  ԫ = true;
                  ԭ = var1.what;
                  var10000 = this.Ϳ(var1);
                  break label37;
               } catch (Exception var4) {
               }
            } catch (Throwable var5) {
               ԫ = false;
               throw var5;
            }

            ԫ = false;
            return false;
         }

         ԫ = false;
         return var10000;
      }
   }

   public final boolean _/* $FF was: Ϳ*/(Object var1) {
      if (var1 == null) {
         return false;
      } else {
         IBinder var2;
         return (var2 = (IBinder)ԯ.ԩ(var1)) == null ? false : ࣀ.Ϳ.Ϳ(var1, var2);
      }
   }

   public final List<Intent> _/* $FF was: Ϳ*/(List<? extends Intent> var1, IBinder var2) {
      List var10000 = var1;
      ArrayList var11;
      var11 = new ArrayList.<init>(var1.size());

      Iterator var14;
      boolean var10001;
      try {
         var14 = var10000.iterator();
      } catch (Exception var10) {
         var10001 = false;
         return var11;
      }

      Iterator var12 = var14;

      while(true) {
         boolean var15;
         try {
            var15 = var12.hasNext();
         } catch (Exception var9) {
            var10001 = false;
            break;
         }

         if (!var15) {
            break;
         }

         Intent var16;
         try {
            var16 = (Intent)var12.next();
         } catch (Exception var8) {
            var10001 = false;
            break;
         }

         Intent var3 = var16;

         Pair var17;
         try {
            var17 = ࣀ.Ϳ.Ϳ(var3, var2);
         } catch (Exception var7) {
            var10001 = false;
            break;
         }

         Pair var4 = var17;
         if (var17 != null) {
            try {
               var16 = (Intent)var4.getFirst();
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            Intent var13 = var16;
            if (var16 != null) {
               var3 = var13;
            }
         }

         try {
            var11.add(var3);
         } catch (Exception var5) {
            var10001 = false;
            break;
         }
      }

      return var11;
   }

   public final boolean _/* $FF was: Ԩ*/(Message param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean _/* $FF was: Ϳ*/(Message var1) {
      int var2;
      if ((var2 = var1.what) != 100) {
         if (var2 == 112) {
            this.Ԩ(var1);
         }
      } else {
         this.Ϳ(var1.obj);
      }

      Callback var3;
      return (var3 = Ԭ) != null ? var3.handleMessage(var1) : false;
   }
}
