package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import kotlin.jvm.internal.Intrinsics;

public final class ށ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      try {
         super.Ϳ = new ໞ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               label48: {
                  Object[] var10000;
                  boolean var10001;
                  try {
                     var10000 = var1.ԩ;
                  } catch (Exception var7) {
                     var10001 = false;
                     break label48;
                  }

                  Object[] var9 = var10000;

                  int var11;
                  try {
                     var11 = ރ.Ϳ.Ԩ(var9, ComponentName.class);
                  } catch (Exception var6) {
                     var10001 = false;
                     break label48;
                  }

                  int var2 = var11;
                  if (var11 >= 0) {
                     label50: {
                        int var12;
                        ComponentName var10002;
                        ComponentName var10003;
                        Object[] var10004;
                        int var10005;
                        try {
                           var10000 = var9;
                           var12 = var2;
                           var10002 = new ComponentName;
                           var10003 = var10002;
                           var10004 = var9;
                           var10005 = var2;
                           ࢦ.Ϳ.getClass();
                        } catch (Exception var5) {
                           var10001 = false;
                           break label50;
                        }

                        String var10006;
                        try {
                           var10006 = ࢦ.Ԯ;
                        } catch (Exception var4) {
                           var10001 = false;
                           break label50;
                        }

                        String var10 = var10006;

                        try {
                           Object var8 = var10004[var10005];
                           Intrinsics.checkNotNull(var8, "null cannot be cast to non-null type android.content.ComponentName");
                           var10003.<init>(var10, ((ComponentName)var8).getClassName());
                           var10000[var12] = var10002;
                        } catch (Exception var3) {
                           var10001 = false;
                        }
                     }
                  }
               }

               ࢯ.Ԭ.getClass();
               return ࢯ.ՠ().Ϳ(var1);
            }
         };
         this.Ϳ("appwidget");
      } catch (Exception var1) {
      }

   }
}
