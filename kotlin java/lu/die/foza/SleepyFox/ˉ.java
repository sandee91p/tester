package lu.die.foza.SleepyFox;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nRemoteUserConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteUserConvertor.kt\nlu/die/foza/Data/Convertor/RemoteUserConvertor\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,195:1\n1313#2,2:196\n13309#3,2:198\n37#4,2:200\n*S KotlinDebug\n*F\n+ 1 RemoteUserConvertor.kt\nlu/die/foza/Data/Convertor/RemoteUserConvertor\n*L\n42#1:196,2\n68#1:198,2\n69#1:200,2\n*E\n"})
public final class ˉ {
   @NotNull
   public static final ˉ Ϳ = new ˉ();
   @NotNull
   public static final File Ԩ = ࢦ.ֈ().getDir("split", 0);

   @JvmStatic
   @NotNull
   public static final String _/* $FF was: ԩ*/(@NotNull String var0, @NotNull String var1) {
      return Ϳ(var0, var1, true);
   }

   @JvmStatic
   @NotNull
   public static final String _/* $FF was: Ϳ*/(@NotNull String var0, @NotNull String var1, boolean var2) {
      File var4 = Ϳ.Ԫ(var0, var1);
      if (var2 && !var4.exists()) {
         var4.mkdirs();

         try {
            ࡧ.Ϳ.Ϳ(var4, 493);
         } catch (Exception var3) {
         }
      }

      return var4.getAbsolutePath();
   }

   @NotNull
   public final File _/* $FF was: Ԩ*/() {
      return Ԩ;
   }

   public final void _/* $FF was: Ϳ*/() {
      File[] var10000;
      boolean var10001;
      try {
         var10000 = Ԩ.listFiles();
      } catch (Exception var4) {
         var10001 = false;
         return;
      }

      File[] var5 = var10000;
      if (var10000 != null) {
         Iterator var7;
         try {
            var7 = ArrayIteratorKt.iterator(var5);
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         Iterator var6 = var7;

         while(true) {
            boolean var8;
            try {
               var8 = var6.hasNext();
            } catch (Exception var2) {
               var10001 = false;
               break;
            }

            if (!var8) {
               break;
            }

            try {
               ࡧ.Ϳ.ԫ((File)var6.next());
            } catch (Exception var1) {
               var10001 = false;
               break;
            }
         }
      }

   }

   public final void _/* $FF was: Ԫ*/(@NotNull String param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final String[] _/* $FF was: Ԩ*/(@NotNull String var1) {
      File var10000;
      boolean var10001;
      try {
         var10000 = Ⴧ.Ϳ.Ϳ(Ԩ, var1);
      } catch (Exception var12) {
         var10001 = false;
         return new String[0];
      }

      File var13 = var10000;

      boolean var16;
      try {
         var16 = var10000.exists();
      } catch (Exception var11) {
         var10001 = false;
         return new String[0];
      }

      if (!var16) {
         try {
            return new String[0];
         } catch (Exception var4) {
            var10001 = false;
         }
      } else {
         File[] var17;
         try {
            var17 = var13.listFiles();
         } catch (Exception var10) {
            var10001 = false;
            return new String[0];
         }

         File[] var14 = var17;

         ArrayList var19;
         try {
            var19 = new ArrayList;
         } catch (Exception var9) {
            var10001 = false;
            return new String[0];
         }

         ArrayList var15 = var19;

         try {
            var19.<init>();
         } catch (Exception var8) {
            var10001 = false;
            return new String[0];
         }

         if (var17 != null) {
            var17 = var14;
            int var2 = 0;

            int var18;
            try {
               var18 = var17.length;
            } catch (Exception var7) {
               var10001 = false;
               return new String[0];
            }

            for(int var3 = var18; var2 < var3; ++var2) {
               try {
                  var15.add(var14[var2].getName());
               } catch (Exception var6) {
                  var10001 = false;
                  return new String[0];
               }
            }
         }

         try {
            return (String[])var15.toArray(new String[0]);
         } catch (Exception var5) {
            var10001 = false;
         }
      }

      return new String[0];
   }

   @NotNull
   public final File _/* $FF was: Ԫ*/(@NotNull String var1, @NotNull String var2) {
      return Ⴧ.Ϳ.Ϳ(Ԩ, var1, var2);
   }

   public final boolean _/* $FF was: ԩ*/(@NotNull String var1) {
      return Ⴧ.Ϳ.Ϳ(Ԩ, var1).exists();
   }

   /** @deprecated */
   @Deprecated(
      message = "Use server for enhance."
   )
   public final boolean _/* $FF was: ԫ*/(@NotNull String var1, @NotNull String var2) {
      return Ⴧ.Ϳ.Ϳ(Ԩ, var1, var2).exists();
   }

   public final boolean _/* $FF was: Ԩ*/(@NotNull String var1, @NotNull String var2) {
      Ⴧ var10000;
      boolean var10001;
      try {
         var10000 = Ⴧ.Ϳ;
      } catch (Exception var10) {
         var10001 = false;
         return false;
      }

      Ⴧ var11 = var10000;

      File var16;
      try {
         var16 = var10000.Ϳ(Ԩ, var1);
      } catch (Exception var9) {
         var10001 = false;
         return false;
      }

      File var14 = var16;

      boolean var17;
      try {
         var17 = var16.exists();
      } catch (Exception var8) {
         var10001 = false;
         return false;
      }

      if (!var17) {
         return false;
      } else {
         File var18;
         String[] var10002;
         try {
            var10000 = var11;
            var18 = var14;
            var10002 = new String[1];
         } catch (Exception var7) {
            var10001 = false;
            return false;
         }

         String[] var12 = var10002;

         try {
            var10002[0] = var2;
            var16 = var10000.Ϳ(var18, var12);
         } catch (Exception var6) {
            var10001 = false;
            return false;
         }

         File var13 = var16;

         try {
            var17 = var16.exists();
         } catch (Exception var5) {
            var10001 = false;
            return false;
         }

         if (var17) {
            return true;
         } else {
            try {
               var17 = var13.mkdirs();
            } catch (Exception var4) {
               var10001 = false;
               return false;
            }

            boolean var15 = var17;
            if (var17) {
               try {
                  ࡧ.Ϳ.Ϳ(var13, 493);
               } catch (Exception var3) {
               }
            }

            return var15;
         }
      }
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      Ⴧ var10000;
      boolean var10001;
      try {
         var10000 = Ⴧ.Ϳ;
      } catch (Exception var7) {
         var10001 = false;
         return false;
      }

      Ⴧ var8 = var10000;

      File var11;
      try {
         var11 = var10000.Ϳ(Ԩ, var1);
      } catch (Exception var6) {
         var10001 = false;
         return false;
      }

      File var10 = var11;

      boolean var12;
      try {
         var12 = var11.exists();
      } catch (Exception var5) {
         var10001 = false;
         return false;
      }

      if (!var12) {
         return false;
      } else {
         String[] var10002;
         File var13;
         try {
            var10000 = var8;
            var13 = var10;
            var10002 = new String[1];
         } catch (Exception var4) {
            var10001 = false;
            return false;
         }

         String[] var9 = var10002;

         try {
            var10002[0] = var2;
            return ࡧ.Ϳ.ԫ(var10000.Ϳ(var13, var9));
         } catch (Exception var3) {
            var10001 = false;
            return false;
         }
      }
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull String var1) {
      File var2;
      return (var2 = Ⴧ.Ϳ.Ϳ(Ԩ, var1)).exists() ? true : var2.mkdirs();
   }
}
