package lu.die.foza.SleepyFox;

import android.os.IInterface;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbsServiceInterrupter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsServiceInterrupter.kt\nlu/die/foza/HookEntity/BaseEntity/AbsServiceInterrupter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,85:1\n13309#2,2:86\n*S KotlinDebug\n*F\n+ 1 AbsServiceInterrupter.kt\nlu/die/foza/HookEntity/BaseEntity/AbsServiceInterrupter\n*L\n69#1:86,2\n*E\n"})
public abstract class Ϳ {
   @NotNull
   public static final lu.die.foza.SleepyFox.Ϳ.Ϳ Ԩ = new lu.die.foza.SleepyFox.Ϳ.Ϳ();
   @NotNull
   public static final String ԩ = "$Proxy";
   @NotNull
   public ໞ Ϳ;

   public _/* $FF was: Ϳ*/() {
      lu.die.foza.SleepyFox.Ϳ var10000 = this;
      super();
      ޜ var1;
      var1 = new ޜ.<init>();
      var10000.Ϳ = var1;
   }

   @JvmStatic
   public static final void _/* $FF was: Ϳ*/(@NotNull String var0, @NotNull String var1, @NotNull ໟ var2) {
      Ԩ.Ϳ(var0, var1, var2);
   }

   @NotNull
   public final ໞ _/* $FF was: ԩ*/() {
      return this.Ϳ;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ໞ var1) {
      this.Ϳ = var1;
   }

   @Nullable
   public final ˁ _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      return ৼ.Ϳ.Ϳ(var1, this.Ϳ, var2);
   }

   @Nullable
   public final ˁ _/* $FF was: Ϳ*/(@NotNull String var1) {
      return ৼ.Ϳ.Ϳ(var1, this.Ϳ, (String)null);
   }

   public final void _/* $FF was: Ϳ*/(@NotNull String... var1) {
      int var2 = 0;

      for(int var3 = var1.length; var2 < var3; ++var2) {
         this.Ϳ(var1[var2]);
      }

   }

   public boolean _/* $FF was: Ԩ*/() {
      return false;
   }

   @Nullable
   public final ˁ _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull IInterface var2) {
      return ৼ.Ϳ.Ϳ(var1, this.Ϳ, var2);
   }

   public abstract void _/* $FF was: Ԫ*/();

   public final boolean _/* $FF was: Ϳ*/() {
      boolean var10000;
      if (this.Ԩ()) {
         ՙ.Ϳ.getClass();
         if (ՙ.Ԩ) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @JvmStatic
      public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2, @NotNull ໟ var3) {
         ၵ var10000;
         boolean var10001;
         try {
            var10000 = ৼ.Ϳ.Ϳ(var1);
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         ၵ var11 = var10000;
         if (var10000 != null) {
            ˁ var15;
            try {
               var15 = var11.Ԯ;
            } catch (Exception var9) {
               var10001 = false;
               return;
            }

            ˁ var12 = var15;
            if (var15 != null) {
               ໞ var16;
               try {
                  var16 = var12.Ԩ(var2);
               } catch (Exception var8) {
                  var10001 = false;
                  return;
               }

               Object var14 = var16;
               if (var16 == null) {
                  try {
                     ޜ.Ϳ.getClass();
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }

                  ޜ var17;
                  try {
                     var17 = ޜ.Ϳ();
                  } catch (Exception var6) {
                     var10001 = false;
                     return;
                  }

                  var14 = var17;
               }

               ໞ var18;
               try {
                  var15 = var12;
                  var18 = new ໞ() {
                     // $FF: synthetic field
                     public final ໞ Ԩ;

                     public {
                        this.Ԩ = var2;
                     }

                     public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                        Ϳ.this.Ԩ(var1);
                        if (Ϳ.this.Ԩ()) {
                           return Ϳ.this.Ϳ();
                        } else {
                           label34:
                           try {
                              Ϳ.this.Ϳ(this.Ԩ.Ϳ(var1));
                           } catch (Throwable var4) {
                              Ϳ.this.Ϳ(var4);
                              break label34;
                           }

                           Ϳ.this.Ϳ(var1);
                           Throwable var5;
                           if ((var5 = Ϳ.this.ԩ()) == null) {
                              return Ϳ.this.Ϳ();
                           } else {
                              throw var5;
                           }
                        }
                     }
                  };
               } catch (Exception var5) {
                  var10001 = false;
                  return;
               }

               ໞ var13 = var18;

               try {
                  var18.<init>((ໞ)var14);
                  var15.Ϳ(var2, var13);
               } catch (Exception var4) {
                  var10001 = false;
               }

               return;
            }
         }

      }
   }
}
