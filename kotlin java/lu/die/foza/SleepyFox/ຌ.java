package lu.die.foza.SleepyFox;

import java.util.Collection;
import java.util.Set;

public class ຌ implements ލ<Integer> {
   public static final ThreadLocal<Set<ຒ>> ԩ = new ThreadLocal();
   public final int Ϳ;
   public int Ԩ;

   public static Set<ຒ> _/* $FF was: ԩ*/() {
      return (Set)ԩ.get();
   }

   public static boolean _/* $FF was: Ԩ*/(Object var0) {
      Set var1;
      return (var1 = ԩ()) != null && var1.contains(new ຒ(var0));
   }

   public static void _/* $FF was: Ϳ*/(Object param0, Class<?> param1, ຌ param2, boolean param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   public static int _/* $FF was: Ϳ*/(int var0, int var1, Object var2) {
      int var10000 = var0;
      String[] var3 = new String[0];
      return Ϳ(var10000, var1, var2, false, (Class)null, var3);
   }

   public static int _/* $FF was: Ϳ*/(int var0, int var1, Object var2, boolean var3) {
      int var10000 = var0;
      String[] var4 = new String[0];
      return Ϳ(var10000, var1, var2, var3, (Class)null, var4);
   }

   public static <T> int _/* $FF was: Ϳ*/(int var0, int var1, T var2, boolean var3, Class<? super T> var4, String... var5) {
      if (var2 == null) {
         throw new IllegalArgumentException("The object to build a hash code for must not be null");
      } else {
         ຌ var6;
         var6 = new ຌ.<init>(var0, var1);
         Class var7;
         Ϳ(var2, var7 = var2.getClass(), var6, var3, var5);

         while(var7.getSuperclass() != null && var7 != var4) {
            Ϳ(var2, var7 = var7.getSuperclass(), var6, var3, var5);
         }

         return var6.Ԩ;
      }
   }

   public static int _/* $FF was: Ϳ*/(Object var0, boolean var1) {
      String[] var2 = new String[0];
      return Ϳ(17, 37, var0, var1, (Class)null, var2);
   }

   public static int _/* $FF was: Ϳ*/(Object var0, Collection<String> var1) {
      return Ϳ(var0, ˊ.Ϳ(var1));
   }

   public static int _/* $FF was: Ϳ*/(Object var0, String... var1) {
      return Ϳ(17, 37, var0, false, (Class)null, var1);
   }

   public static void _/* $FF was: ԩ*/(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: Ԫ*/(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public _/* $FF was: ຌ*/() {
      this.Ϳ = 37;
      this.Ԩ = 17;
   }

   public _/* $FF was: ຌ*/(int var1, int var2) {
      this.Ԩ = 0;
      if (var1 != 0) {
         if (var1 % 2 != 0) {
            if (var2 != 0) {
               if (var2 % 2 != 0) {
                  this.Ϳ = var2;
                  this.Ԩ = var1;
               } else {
                  throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
               }
            } else {
               throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
            }
         } else {
            throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
         }
      } else {
         throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
      }
   }

   public ຌ _/* $FF was: Ϳ*/(boolean var1) {
      this.Ԩ = this.Ԩ * this.Ϳ + (var1 ^ 1);
      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(boolean[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(byte var1) {
      this.Ԩ = this.Ԩ * this.Ϳ + var1;
      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(byte[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(char var1) {
      this.Ԩ = this.Ԩ * this.Ϳ + var1;
      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(char[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(double var1) {
      return this.Ϳ(Double.doubleToLongBits(var1));
   }

   public ຌ _/* $FF was: Ϳ*/(double[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(float var1) {
      ຌ var10000 = this;
      ຌ var10001 = this;
      int var2 = this.Ԩ * this.Ϳ;
      var10001.Ԩ = Float.floatToIntBits(var1) + var2;
      return var10000;
   }

   public ຌ _/* $FF was: Ϳ*/(float[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(int var1) {
      this.Ԩ = this.Ԩ * this.Ϳ + var1;
      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(int[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(long var1) {
      this.Ԩ = this.Ԩ * this.Ϳ + (int)(var1 ^ var1 >> 32);
      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(long[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(Object var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else if (var1.getClass().isArray()) {
         if (var1 instanceof long[]) {
            this.Ϳ((long[])var1);
         } else if (var1 instanceof int[]) {
            this.Ϳ((int[])var1);
         } else if (var1 instanceof short[]) {
            this.Ϳ((short[])var1);
         } else if (var1 instanceof char[]) {
            this.Ϳ((char[])var1);
         } else if (var1 instanceof byte[]) {
            this.Ϳ((byte[])var1);
         } else if (var1 instanceof double[]) {
            this.Ϳ((double[])var1);
         } else if (var1 instanceof float[]) {
            this.Ϳ((float[])var1);
         } else if (var1 instanceof boolean[]) {
            this.Ϳ((boolean[])var1);
         } else {
            this.Ϳ((Object[])var1);
         }
      } else {
         Object var10001 = var1;
         int var2 = this.Ԩ * this.Ϳ;
         this.Ԩ = var10001.hashCode() + var2;
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(Object[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(short var1) {
      this.Ԩ = this.Ԩ * this.Ϳ + var1;
      return this;
   }

   public ຌ _/* $FF was: Ϳ*/(short[] var1) {
      if (var1 == null) {
         this.Ԩ *= this.Ϳ;
      } else {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.Ϳ(var1[var3]);
         }
      }

      return this;
   }

   public ຌ _/* $FF was: Ԩ*/(int var1) {
      this.Ԩ = this.Ԩ * this.Ϳ + var1;
      return this;
   }

   public int _/* $FF was: Ԫ*/() {
      return this.Ԩ;
   }

   public Integer _/* $FF was: Ԩ*/() {
      return this.Ԫ();
   }

   public int hashCode() {
      return this.Ԫ();
   }
}
