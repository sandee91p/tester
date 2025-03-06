package lu.die.foza.SleepyFox;

import java.util.Collection;
import java.util.Set;

public class ࡦ implements ލ<Boolean> {
   public static final ThreadLocal<Set<ႀ<ຒ, ຒ>>> Ԩ = new ThreadLocal();
   public boolean Ϳ = true;

   public static Set<ႀ<ຒ, ຒ>> _/* $FF was: ԩ*/() {
      return (Set)Ԩ.get();
   }

   public static ႀ<ຒ, ຒ> _/* $FF was: Ԩ*/(Object var0, Object var1) {
      return ႀ.of(new ຒ(var0), new ຒ(var1));
   }

   public static boolean _/* $FF was: ԩ*/(Object var0, Object var1) {
      Set var2;
      Set var10000 = var2 = ԩ();
      ႀ var3;
      ႀ var4 = ႀ.of((ຒ)(var3 = Ԩ(var0, var1)).getLeft(), (ຒ)var3.getRight());
      return var10000 != null && (var2.contains(var3) || var2.contains(var4));
   }

   public static void _/* $FF was: Ԫ*/(Object param0, Object param1) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: ԫ*/(Object param0, Object param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: Ϳ*/(Object var0, Object var1, Collection<String> var2) {
      return Ϳ(var0, var1, ˊ.Ϳ(var2));
   }

   public static boolean _/* $FF was: Ϳ*/(Object var0, Object var1, String... var2) {
      return Ϳ(var0, var1, false, (Class)null, var2);
   }

   public static boolean _/* $FF was: Ϳ*/(Object var0, Object var1, boolean var2) {
      Object var10000 = var0;
      String[] var3 = new String[0];
      return Ϳ(var10000, var1, var2, (Class)null, var3);
   }

   public static boolean _/* $FF was: Ϳ*/(Object param0, Object param1, boolean param2, Class<?> param3, String... param4) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: Ϳ*/(Object param0, Object param1, Class<?> param2, ࡦ param3, boolean param4, String[] param5) {
      // $FF: Couldn't be decompiled
   }

   public ࡦ _/* $FF was: Ϳ*/(boolean var1) {
      if (!this.Ϳ) {
         return this;
      } else {
         this.Ϳ = var1;
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(Object var1, Object var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (!var1.getClass().isArray()) {
            this.Ϳ = var1.equals(var2);
         } else if (var1.getClass() != var2.getClass()) {
            this.Ԩ(false);
         } else if (var1 instanceof long[]) {
            long[] var3 = (long[])var1;
            this.Ϳ(var3, (long[])var2);
         } else if (var1 instanceof int[]) {
            int[] var4 = (int[])var1;
            this.Ϳ(var4, (int[])var2);
         } else if (var1 instanceof short[]) {
            short[] var5 = (short[])var1;
            this.Ϳ(var5, (short[])var2);
         } else if (var1 instanceof char[]) {
            char[] var6 = (char[])var1;
            this.Ϳ(var6, (char[])var2);
         } else if (var1 instanceof byte[]) {
            byte[] var7 = (byte[])var1;
            this.Ϳ(var7, (byte[])var2);
         } else if (var1 instanceof double[]) {
            double[] var8 = (double[])var1;
            this.Ϳ(var8, (double[])var2);
         } else if (var1 instanceof float[]) {
            float[] var9 = (float[])var1;
            this.Ϳ(var9, (float[])var2);
         } else if (var1 instanceof boolean[]) {
            boolean[] var10 = (boolean[])var1;
            this.Ϳ(var10, (boolean[])var2);
         } else {
            Object[] var11 = (Object[])var1;
            this.Ϳ(var11, (Object[])var2);
         }

         return this;
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(long var1, long var3) {
      if (!this.Ϳ) {
         return this;
      } else {
         boolean var5;
         if (var1 == var3) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.Ϳ = var5;
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(int var1, int var2) {
      if (!this.Ϳ) {
         return this;
      } else {
         boolean var3;
         if (var1 == var2) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.Ϳ = var3;
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(short var1, short var2) {
      if (!this.Ϳ) {
         return this;
      } else {
         boolean var3;
         if (var1 == var2) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.Ϳ = var3;
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(char var1, char var2) {
      if (!this.Ϳ) {
         return this;
      } else {
         boolean var3;
         if (var1 == var2) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.Ϳ = var3;
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(byte var1, byte var2) {
      if (!this.Ϳ) {
         return this;
      } else {
         boolean var3;
         if (var1 == var2) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.Ϳ = var3;
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(double var1, double var3) {
      if (!this.Ϳ) {
         return this;
      } else {
         ࡦ var10000 = this;
         long var5 = Double.doubleToLongBits(var1);
         long var2 = Double.doubleToLongBits(var3);
         return var10000.Ϳ(var5, var2);
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(float var1, float var2) {
      if (!this.Ϳ) {
         return this;
      } else {
         ࡦ var10000 = this;
         int var3 = Float.floatToIntBits(var1);
         return var10000.Ϳ(var3, Float.floatToIntBits(var2));
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(boolean var1, boolean var2) {
      if (!this.Ϳ) {
         return this;
      } else {
         if (var1 == var2) {
            var1 = true;
         } else {
            var1 = false;
         }

         this.Ϳ = var1;
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(Object[] var1, Object[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               Object var4 = var1[var3];
               this.Ϳ(var4, var2[var3]);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(long[] var1, long[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               long var4 = var1[var3];
               long var6 = var2[var3];
               this.Ϳ(var4, var6);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(int[] var1, int[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               int var4 = var1[var3];
               this.Ϳ(var4, var2[var3]);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(short[] var1, short[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               short var4 = var1[var3];
               this.Ϳ(var4, var2[var3]);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(char[] var1, char[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               char var4 = var1[var3];
               this.Ϳ(var4, var2[var3]);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(byte[] var1, byte[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               byte var4 = var1[var3];
               this.Ϳ(var4, var2[var3]);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(double[] var1, double[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               double var4 = var1[var3];
               double var6 = var2[var3];
               this.Ϳ(var4, var6);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(float[] var1, float[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               float var4 = var1[var3];
               this.Ϳ(var4, var2[var3]);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public ࡦ _/* $FF was: Ϳ*/(boolean[] var1, boolean[] var2) {
      if (!this.Ϳ) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            this.Ԩ(false);
            return this;
         } else {
            for(int var3 = 0; var3 < var1.length && this.Ϳ; ++var3) {
               boolean var4 = var1[var3];
               this.Ϳ(var4, var2[var3]);
            }

            return this;
         }
      } else {
         this.Ԩ(false);
         return this;
      }
   }

   public boolean _/* $FF was: Ԫ*/() {
      return this.Ϳ;
   }

   public Boolean _/* $FF was: Ԩ*/() {
      return this.Ԫ();
   }

   public void _/* $FF was: Ԩ*/(boolean var1) {
      this.Ϳ = var1;
   }

   public void _/* $FF was: ԫ*/() {
      this.Ϳ = true;
   }
}
