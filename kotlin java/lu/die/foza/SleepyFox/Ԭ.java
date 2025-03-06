package lu.die.foza.SleepyFox;

import android.os.IBinder;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Ԭ extends ࢯ {
   @NotNull
   public static final Ԭ.Ϳ ֏ = new Ԭ.Ϳ();
   @NotNull
   public static final Ԭ ׯ = new Ԭ();
   @NotNull
   public final Map<?, ?> ԯ;
   @NotNull
   public final <undefinedtype> ՠ;
   @NotNull
   public final <undefinedtype> ֈ;

   public _/* $FF was: Ԭ*/() {
      Object var1;
      label13: {
         Map var3;
         try {
            Object var10000 = ˋ.Ϳ.Ԩ((Object)ࢭ.ֈ.֏(), "mActivities");
            Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            var3 = TypeIntrinsics.asMutableMap(var10000);
         } catch (Exception var2) {
            var1 = new ބ.<init>();
            break label13;
         }

         var1 = var3;
      }

      Ԭ var5 = this;
      Ԭ var10001 = this;
      this.ԯ = (Map)var1;
      ࢯ var4;
      var4 = new ࢯ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            Object[] var10000;
            boolean var10001;
            try {
               var10000 = var1.ԩ;
            } catch (Exception var14) {
               var10001 = false;
               return super.Ϳ(var1);
            }

            Object[] var2 = var10000;

            int var15;
            try {
               var15 = var10000.length;
            } catch (Exception var13) {
               var10001 = false;
               return super.Ϳ(var1);
            }

            if (var15 > 1) {
               Object var16;
               ၼ.Ϳ var18;
               try {
                  var16 = var2[0];
                  var18 = ၼ.ՠ;
               } catch (Exception var12) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               ၼ.Ϳ var3 = var18;

               try {
                  var18.getClass();
               } catch (Exception var11) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               boolean var17;
               try {
                  var17 = Intrinsics.areEqual(var16, ၼ.ֈ());
               } catch (Exception var10) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               if (var17) {
                  int var19;
                  try {
                     var10000 = var2;
                     var19 = var2.length;
                  } catch (Exception var9) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  --var19;

                  try {
                     var17 = var10000[var19] instanceof Integer;
                  } catch (Exception var8) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  if (var17) {
                     try {
                        var10000 = var2;
                        var19 = var2.length;
                     } catch (Exception var7) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }

                     --var19;

                     try {
                        var10000[var19] = 1;
                     } catch (Exception var6) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }
                  }
               }

               var10000 = null;

               try {
                  var3.getClass();
               } catch (Exception var5) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               try {
                  ၼ.Ϳ((IBinder)var10000);
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return super.Ϳ(var1);
         }
      }.<init>();
      var10001.ՠ = var4;
      var4 = new ࢯ() {
         public Object _/* $FF was: Ϳ*/(ࡥ param1) {
            // $FF: Couldn't be decompiled
         }
      }.<init>();
      var5.ֈ = var4;
   }

   public static final void _/* $FF was: Ϳ*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final Map<?, ?> ֏() {
      return this.ԯ;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ˁ var1) {
      ˁ var10000;
      boolean var10001;
      ˁ var10002;
      Ԭ var10003;
      String var10004;
      Ԭ var6;
      try {
         var10000 = var1;
         var6 = this;
         var10002 = var1;
         var10003 = this;
         var1.Ϳ((String)"activityDestroyed", (ໞ)this);
         var10004 = "finishActivity";
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      String var5 = var10004;

      String var7;
      try {
         var10002.Ϳ((String)var5, (ໞ)var10003.ՠ);
         var7 = "moveActivityTaskToBack";
      } catch (Exception var3) {
         var10001 = false;
         return;
      }

      var5 = var7;

      try {
         var10000.Ϳ((String)var5, (ໞ)var6.ֈ);
      } catch (Exception var2) {
         var10001 = false;
      }

   }

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      ࢦ.Ϳ.Ԩ(Ԭ::Ϳ);
      return super.Ϳ(var1);
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final Ԭ _/* $FF was: Ϳ*/() {
         return lu.die.foza.SleepyFox.Ԭ.ׯ;
      }
   }
}
