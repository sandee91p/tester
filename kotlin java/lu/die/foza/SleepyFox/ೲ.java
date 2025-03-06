package lu.die.foza.SleepyFox;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFozaSandboxedStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaSandboxedStorage.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/WsaPark/FozaSandboxedStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,114:1\n1#2:115\n37#3,2:116\n13309#4,2:118\n*S KotlinDebug\n*F\n+ 1 FozaSandboxedStorage.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/WsaPark/FozaSandboxedStorage\n*L\n34#1:116,2\n55#1:118,2\n*E\n"})
public final class ೲ {
   @NotNull
   public static final ೲ Ϳ = new ೲ();
   @NotNull
   public static final Lazy Ԩ;

   // $FF: synthetic method
   public static File _/* $FF was: Ϳ*/(ೲ var0, File var1, String var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = true;
      }

      return var0.Ϳ(var1, var2, var3);
   }

   static {
      Ԩ = LazyKt.lazy(LazyThreadSafetyMode.NONE, null.INSTANCE);
   }

   @NotNull
   public final File[] _/* $FF was: Ԩ*/() {
      ArrayList var14;
      ೲ var10000;
      boolean var10001;
      try {
         var10000 = this;
         var14 = new ArrayList;
      } catch (Exception var8) {
         var10001 = false;
         return new File[0];
      }

      ArrayList var9 = var14;

      File[] var11;
      try {
         var14.<init>();
         var11 = var10000.ԩ();
      } catch (Exception var7) {
         var10001 = false;
         return new File[0];
      }

      File[] var1 = var11;
      if (var11 != null) {
         Iterator var12;
         try {
            var12 = ArrayIteratorKt.iterator(var1);
         } catch (Exception var6) {
            var10001 = false;
            return new File[0];
         }

         Iterator var10 = var12;

         while(true) {
            boolean var13;
            try {
               var13 = var10.hasNext();
            } catch (Exception var3) {
               var10001 = false;
               return new File[0];
            }

            if (!var13) {
               break;
            }

            ArrayList var15;
            Ⴧ var16;
            File var10002;
            String[] var10003;
            try {
               var15 = var9;
               var10002 = (File)var10.next();
               var16 = Ⴧ.Ϳ;
               var10003 = new String[1];
            } catch (Exception var5) {
               var10001 = false;
               return new File[0];
            }

            String[] var10004 = var10003;
            byte var10005 = 0;

            try {
               var10004[var10005] = "scopedStorage";
               var15.add(var16.Ϳ(var10002, var10003));
            } catch (Exception var4) {
               var10001 = false;
               return new File[0];
            }
         }
      }

      try {
         return (File[])var9.toArray(new File[0]);
      } catch (Exception var2) {
         var10001 = false;
         return new File[0];
      }
   }

   public final void _/* $FF was: Ϳ*/() {
      try {
         this.ԩ();
      } catch (Exception var1) {
      }

   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1) {
      if (var1 != null) {
         File[] var10000;
         boolean var10001;
         try {
            var10000 = this.ԩ();
         } catch (Exception var16) {
            var10001 = false;
            return;
         }

         File[] var17 = var10000;
         if (var10000 != null) {
            var10000 = var17;
            int var2 = 0;

            int var19;
            try {
               var19 = var10000.length;
            } catch (Exception var15) {
               var10001 = false;
               return;
            }

            for(int var3 = var19; var2 < var3; ++var2) {
               File var20;
               try {
                  var20 = var17[var2];
               } catch (Exception var14) {
                  var10001 = false;
                  break;
               }

               File var4 = var20;

               Ⴧ var21;
               try {
                  var21 = Ⴧ.Ϳ;
               } catch (Exception var13) {
                  var10001 = false;
                  break;
               }

               Ⴧ var5 = var21;

               String[] var10002;
               File var23;
               try {
                  var23 = var4;
                  var10002 = new String[1];
               } catch (Exception var12) {
                  var10001 = false;
                  break;
               }

               String[] var10003 = var10002;
               byte var10004 = 0;

               try {
                  var10003[var10004] = "scopedStorage";
                  var20 = var21.Ϳ(var23, var10002);
               } catch (Exception var11) {
                  var10001 = false;
                  break;
               }

               var4 = var20;

               boolean var22;
               try {
                  var22 = var20.exists();
               } catch (Exception var10) {
                  var10001 = false;
                  break;
               }

               if (var22) {
                  try {
                     var21 = var5;
                     var23 = var4;
                     var10002 = new String[1];
                  } catch (Exception var9) {
                     var10001 = false;
                     break;
                  }

                  String[] var18 = var10002;

                  try {
                     var10002[0] = var1;
                     var20 = var21.Ϳ(var23, var18);
                  } catch (Exception var8) {
                     var10001 = false;
                     break;
                  }

                  var4 = var20;

                  try {
                     var22 = var20.exists();
                  } catch (Exception var7) {
                     var10001 = false;
                     break;
                  }

                  if (var22) {
                     try {
                        ࡧ.Ϳ.ԫ(var4);
                     } catch (Exception var6) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

         }
      }
   }

   @NotNull
   public final File _/* $FF was: Ϳ*/(@NotNull File var1, @NotNull String var2, boolean var3) {
      boolean var10000 = var3;
      File var11 = this.Ϳ(var1);
      Ⴧ var12;
      Ⴧ var10001 = var12 = Ⴧ.Ϳ;
      String[] var14;
      String[] var10002 = var14 = new String[2];
      var10002[0] = "scopedStorage";
      var10002[1] = var2;
      var11 = var10001.Ϳ(var11, var14);
      if (var10000) {
         Ⴧ var15;
         boolean var17;
         File var18;
         try {
            var15 = var12;
            var18 = var11;
            var10002 = new String[2];
         } catch (Exception var10) {
            var17 = false;
            return var11;
         }

         String[] var10003 = var10002;
         String[] var10004 = var10002;
         byte var10005 = 0;

         try {
            var10004[var10005] = "Android";
         } catch (Exception var9) {
            var17 = false;
            return var11;
         }

         byte var19 = 1;

         File var16;
         try {
            var10003[var19] = "data";
            var16 = var15.Ϳ(var18, var10002);
         } catch (Exception var8) {
            var17 = false;
            return var11;
         }

         File var13 = var16;

         try {
            var10000 = var16.exists();
         } catch (Exception var7) {
            var17 = false;
            return var11;
         }

         if (!var10000) {
            try {
               var10000 = var13.mkdirs();
            } catch (Exception var6) {
               var17 = false;
               return var11;
            }

            if (var10000) {
               try {
                  var15 = var12;
                  var18 = var13;
                  var10002 = new String[1];
               } catch (Exception var5) {
                  var17 = false;
                  return var11;
               }

               var10003 = var10002;
               var19 = 0;

               try {
                  var10003[var19] = ".nomedia";
                  var15.Ϳ(var18, var10002).createNewFile();
               } catch (Exception var4) {
                  var17 = false;
               }
            }
         }
      }

      return var11;
   }

   public final File _/* $FF was: Ϳ*/(File var1) {
      Ⴧ var10000 = Ⴧ.Ϳ;
      String[] var10002 = new String[]{"Android", "obb", null};
      ࢦ.Ϳ.getClass();
      var10002[2] = ࢦ.Ԯ;
      return var10000.Ϳ(var1, var10002);
   }

   public final File[] _/* $FF was: ԩ*/() {
      return (File[])Ԩ.getValue();
   }
}
