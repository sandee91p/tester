package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;

public class ޗ implements ލ<Integer> {
   public int Ϳ = 0;

   public static int _/* $FF was: Ԩ*/(Object var0, Object var1) {
      Object var10000 = var0;
      String[] var2 = new String[0];
      return Ϳ(var10000, var1, false, (Class)null, var2);
   }

   public static int _/* $FF was: Ϳ*/(Object var0, Object var1, boolean var2) {
      Object var10000 = var0;
      String[] var3 = new String[0];
      return Ϳ(var10000, var1, var2, (Class)null, var3);
   }

   public static int _/* $FF was: Ϳ*/(Object var0, Object var1, Collection<String> var2) {
      return Ϳ(var0, var1, ˊ.Ϳ(var2));
   }

   public static int _/* $FF was: Ϳ*/(Object var0, Object var1, String... var2) {
      return Ϳ(var0, var1, false, (Class)null, var2);
   }

   public static int _/* $FF was: Ϳ*/(Object var0, Object var1, boolean var2, Class<?> var3, String... var4) {
      if (var0 == var1) {
         return 0;
      } else if (var0 != null && var1 != null) {
         Class var5;
         if (!(var5 = var0.getClass()).isInstance(var1)) {
            throw new ClassCastException();
         } else {
            ޗ var6;
            var6 = new ޗ.<init>();
            Ϳ(var0, var1, var5, var6, var2, var4);

            while(var5.getSuperclass() != null && var5 != var3) {
               var5 = var5.getSuperclass();
               Ϳ(var0, var1, var5, var6, var2, var4);
            }

            return var6.Ϳ;
         }
      } else {
         throw null;
      }
   }

   public static void _/* $FF was: Ϳ*/(Object var0, Object var1, Class<?> var2, ޗ var3, boolean var4, String[] var5) {
      Field[] var10;
      AccessibleObject.setAccessible(var10 = var2.getDeclaredFields(), true);

      for(int var6 = 0; var6 < var10.length && var3.Ϳ == 0; ++var6) {
         Field var7;
         if (!ކ.Ԩ((Object[])var5, (Object)(var7 = var10[var6]).getName()) && var7.getName().indexOf(36) == -1 && (var4 || !Modifier.isTransient(var7.getModifiers())) && !Modifier.isStatic(var7.getModifiers())) {
            Field var12;
            ޗ var10000;
            boolean var10001;
            Object var10002;
            try {
               var10000 = var3;
               var12 = var7;
               var10002 = var7.get(var0);
            } catch (IllegalAccessException var9) {
               var10001 = false;
               throw new InternalError("Unexpected IllegalAccessException");
            }

            Object var11 = var10002;

            try {
               var10000.Ϳ(var11, var12.get(var1));
            } catch (IllegalAccessException var8) {
               var10001 = false;
               throw new InternalError("Unexpected IllegalAccessException");
            }
         }
      }

   }

   public ޗ _/* $FF was: Ϳ*/(int var1) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         this.Ϳ = var1;
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(Object var1, Object var2) {
      return this.Ϳ((Object)var1, (Object)var2, (Comparator)null);
   }

   public ޗ _/* $FF was: Ϳ*/(Object var1, Object var2, Comparator<?> var3) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else {
         if (var1.getClass().isArray()) {
            if (var1 instanceof long[]) {
               long[] var4 = (long[])var1;
               this.Ϳ(var4, (long[])var2);
            } else if (var1 instanceof int[]) {
               int[] var5 = (int[])var1;
               this.Ϳ(var5, (int[])var2);
            } else if (var1 instanceof short[]) {
               short[] var6 = (short[])var1;
               this.Ϳ(var6, (short[])var2);
            } else if (var1 instanceof char[]) {
               char[] var7 = (char[])var1;
               this.Ϳ(var7, (char[])var2);
            } else if (var1 instanceof byte[]) {
               byte[] var8 = (byte[])var1;
               this.Ϳ(var8, (byte[])var2);
            } else if (var1 instanceof double[]) {
               double[] var9 = (double[])var1;
               this.Ϳ(var9, (double[])var2);
            } else if (var1 instanceof float[]) {
               float[] var10 = (float[])var1;
               this.Ϳ(var10, (float[])var2);
            } else if (var1 instanceof boolean[]) {
               boolean[] var11 = (boolean[])var1;
               this.Ϳ(var11, (boolean[])var2);
            } else {
               Object[] var12 = (Object[])var1;
               this.Ϳ(var12, (Object[])var2, var3);
            }
         } else if (var3 == null) {
            this.Ϳ = ((Comparable)var1).compareTo(var2);
         } else {
            this.Ϳ = var3.compare(var1, var2);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(long var1, long var3) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         byte var5;
         if (var1 < var3) {
            var5 = -1;
         } else if (var1 > var3) {
            var5 = 1;
         } else {
            var5 = 0;
         }

         this.Ϳ = var5;
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(int var1, int var2) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         byte var3;
         if (var1 < var2) {
            var3 = -1;
         } else if (var1 > var2) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.Ϳ = var3;
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(short var1, short var2) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         byte var3;
         if (var1 < var2) {
            var3 = -1;
         } else if (var1 > var2) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.Ϳ = var3;
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(char var1, char var2) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         byte var3;
         if (var1 < var2) {
            var3 = -1;
         } else if (var1 > var2) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.Ϳ = var3;
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(byte var1, byte var2) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         if (var1 < var2) {
            var1 = -1;
         } else if (var1 > var2) {
            var1 = 1;
         } else {
            var1 = 0;
         }

         this.Ϳ = var1;
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(double var1, double var3) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         this.Ϳ = Double.compare(var1, var3);
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(float var1, float var2) {
      if (this.Ϳ != 0) {
         return this;
      } else {
         this.Ϳ = Float.compare(var1, var2);
         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(boolean var1, boolean var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else {
         if (!var1) {
            this.Ϳ = -1;
         } else {
            this.Ϳ = 1;
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(Object[] var1, Object[] var2) {
      return this.Ϳ((Object[])var1, (Object[])var2, (Comparator)null);
   }

   public ޗ _/* $FF was: Ϳ*/(Object[] var1, Object[] var2, Comparator<?> var3) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var6;
         if (var1.length < var2.length) {
            var6 = -1;
         } else {
            var6 = 1;
         }

         this.Ϳ = var6;
         return this;
      } else {
         for(int var4 = 0; var4 < var1.length && this.Ϳ == 0; ++var4) {
            Object var5 = var1[var4];
            this.Ϳ(var5, var2[var4], var3);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(long[] var1, long[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var8;
         if (var1.length < var2.length) {
            var8 = -1;
         } else {
            var8 = 1;
         }

         this.Ϳ = var8;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            long var4 = var1[var3];
            long var6 = var2[var3];
            this.Ϳ(var4, var6);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(int[] var1, int[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var5;
         if (var1.length < var2.length) {
            var5 = -1;
         } else {
            var5 = 1;
         }

         this.Ϳ = var5;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            int var4 = var1[var3];
            this.Ϳ(var4, var2[var3]);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(short[] var1, short[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var5;
         if (var1.length < var2.length) {
            var5 = -1;
         } else {
            var5 = 1;
         }

         this.Ϳ = var5;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            short var4 = var1[var3];
            this.Ϳ(var4, var2[var3]);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(char[] var1, char[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var5;
         if (var1.length < var2.length) {
            var5 = -1;
         } else {
            var5 = 1;
         }

         this.Ϳ = var5;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            char var4 = var1[var3];
            this.Ϳ(var4, var2[var3]);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(byte[] var1, byte[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var5;
         if (var1.length < var2.length) {
            var5 = -1;
         } else {
            var5 = 1;
         }

         this.Ϳ = var5;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            byte var4 = var1[var3];
            this.Ϳ(var4, var2[var3]);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(double[] var1, double[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var8;
         if (var1.length < var2.length) {
            var8 = -1;
         } else {
            var8 = 1;
         }

         this.Ϳ = var8;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            double var4 = var1[var3];
            double var6 = var2[var3];
            this.Ϳ(var4, var6);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(float[] var1, float[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var5;
         if (var1.length < var2.length) {
            var5 = -1;
         } else {
            var5 = 1;
         }

         this.Ϳ = var5;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            float var4 = var1[var3];
            this.Ϳ(var4, var2[var3]);
         }

         return this;
      }
   }

   public ޗ _/* $FF was: Ϳ*/(boolean[] var1, boolean[] var2) {
      if (this.Ϳ != 0) {
         return this;
      } else if (var1 == var2) {
         return this;
      } else if (var1 == null) {
         this.Ϳ = -1;
         return this;
      } else if (var2 == null) {
         this.Ϳ = 1;
         return this;
      } else if (var1.length != var2.length) {
         byte var5;
         if (var1.length < var2.length) {
            var5 = -1;
         } else {
            var5 = 1;
         }

         this.Ϳ = var5;
         return this;
      } else {
         for(int var3 = 0; var3 < var1.length && this.Ϳ == 0; ++var3) {
            boolean var4 = var1[var3];
            this.Ϳ(var4, var2[var3]);
         }

         return this;
      }
   }

   public int _/* $FF was: ԩ*/() {
      return this.Ϳ;
   }

   public Integer _/* $FF was: Ԩ*/() {
      return this.ԩ();
   }
}
