package lu.die.foza.SleepyFox;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ކ {
   public static final Object[] Ϳ = new Object[0];
   public static final Class<?>[] Ԩ = new Class[0];
   public static final String[] ԩ = new String[0];
   public static final long[] Ԫ = new long[0];
   public static final Long[] ԫ = new Long[0];
   public static final int[] Ԭ = new int[0];
   public static final Integer[] ԭ = new Integer[0];
   public static final short[] Ԯ = new short[0];
   public static final Short[] ԯ = new Short[0];
   public static final byte[] ՠ = new byte[0];
   public static final Byte[] ֈ = new Byte[0];
   public static final double[] ֏ = new double[0];
   public static final Double[] ׯ = new Double[0];
   public static final float[] ؠ = new float[0];
   public static final Float[] ހ = new Float[0];
   public static final boolean[] ށ = new boolean[0];
   public static final Boolean[] ނ = new Boolean[0];
   public static final char[] ރ = new char[0];
   public static final Character[] ބ = new Character[0];
   public static final int ޅ = -1;

   public static String _/* $FF was: ԩ*/(Object var0) {
      return Ϳ(var0, "{}");
   }

   public static String _/* $FF was: Ϳ*/(Object var0, String var1) {
      return var0 == null ? var1 : (new ˢ(var0, ˣ.SIMPLE_STYLE, (StringBuffer)null)).Ϳ(var0).toString();
   }

   public static int _/* $FF was: Ԩ*/(Object var0) {
      return (new ຌ()).Ϳ(var0).Ԫ();
   }

   public static boolean _/* $FF was: Ϳ*/(Object var0, Object var1) {
      return (new ࡦ()).Ϳ(var0, var1).Ԫ();
   }

   public static Map<Object, Object> _/* $FF was: ԭ*/(Object[] var0) {
      if (var0 == null) {
         return null;
      } else {
         HashMap var1;
         var1 = new HashMap.<init>((int)((double)var0.length * 1.5D));

         for(int var2 = 0; var2 < var0.length; ++var2) {
            Object var3;
            if ((var3 = var0[var2]) instanceof Entry) {
               Entry var10001 = (Entry)var3;
               var3 = ((Entry)var3).getKey();
               var1.put(var3, var10001.getValue());
            } else {
               if (!(var3 instanceof Object[])) {
                  throw new IllegalArgumentException("Array element " + var2 + ", '" + var3 + "', is neither of type Map.Entry nor an Array");
               }

               Object[] var4;
               if ((var4 = (Object[])var3).length < 2) {
                  throw new IllegalArgumentException("Array element " + var2 + ", '" + var3 + "', has a length less than 2");
               }

               var3 = var4[0];
               var1.put(var3, var4[1]);
            }
         }

         return var1;
      }
   }

   public static <T> T[] _/* $FF was: Ԭ*/(T... var0) {
      return var0;
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0) {
      return var0 == null ? null : (Object[])var0.clone();
   }

   public static long[] _/* $FF was: Ϳ*/(long[] var0) {
      return var0 == null ? null : (long[])var0.clone();
   }

   public static int[] _/* $FF was: Ϳ*/(int[] var0) {
      return var0 == null ? null : (int[])var0.clone();
   }

   public static short[] _/* $FF was: Ϳ*/(short[] var0) {
      return var0 == null ? null : (short[])var0.clone();
   }

   public static char[] _/* $FF was: Ϳ*/(char[] var0) {
      return var0 == null ? null : (char[])var0.clone();
   }

   public static byte[] _/* $FF was: Ϳ*/(byte[] var0) {
      return var0 == null ? null : (byte[])var0.clone();
   }

   public static double[] _/* $FF was: Ϳ*/(double[] var0) {
      return var0 == null ? null : (double[])var0.clone();
   }

   public static float[] _/* $FF was: Ϳ*/(float[] var0) {
      return var0 == null ? null : (float[])var0.clone();
   }

   public static boolean[] _/* $FF was: Ϳ*/(boolean[] var0) {
      return var0 == null ? null : (boolean[])var0.clone();
   }

   public static Object[] _/* $FF was: Ԫ*/(Object[] var0) {
      return var0 != null && var0.length != 0 ? var0 : Ϳ;
   }

   public static String[] _/* $FF was: Ϳ*/(String[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ԩ;
   }

   public static long[] _/* $FF was: Ԫ*/(long[] var0) {
      return var0 != null && var0.length != 0 ? var0 : Ԫ;
   }

   public static int[] _/* $FF was: Ԫ*/(int[] var0) {
      return var0 != null && var0.length != 0 ? var0 : Ԭ;
   }

   public static short[] _/* $FF was: Ԫ*/(short[] var0) {
      return var0 != null && var0.length != 0 ? var0 : Ԯ;
   }

   public static char[] _/* $FF was: Ԫ*/(char[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ރ;
   }

   public static byte[] _/* $FF was: Ԫ*/(byte[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ՠ;
   }

   public static double[] _/* $FF was: Ԫ*/(double[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ֏;
   }

   public static float[] _/* $FF was: Ԫ*/(float[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ؠ;
   }

   public static boolean[] _/* $FF was: Ԫ*/(boolean[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ށ;
   }

   public static Long[] _/* $FF was: Ϳ*/(Long[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ԫ;
   }

   public static Integer[] _/* $FF was: Ϳ*/(Integer[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ԭ;
   }

   public static Short[] _/* $FF was: Ϳ*/(Short[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ԯ;
   }

   public static Character[] _/* $FF was: Ϳ*/(Character[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ބ;
   }

   public static Byte[] _/* $FF was: Ϳ*/(Byte[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ֈ;
   }

   public static Double[] _/* $FF was: Ϳ*/(Double[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ׯ;
   }

   public static Float[] _/* $FF was: Ϳ*/(Float[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ހ;
   }

   public static Boolean[] _/* $FF was: Ϳ*/(Boolean[] var0) {
      return var0 != null && var0.length != 0 ? var0 : ނ;
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         int var10000 = var2 -= var1;
         Class var3 = var0.getClass().getComponentType();
         if (var10000 <= 0) {
            return (Object[])Array.newInstance(var3, 0);
         } else {
            Object[] var4;
            Object[] var5 = var4 = (Object[])Array.newInstance(var3, var2);
            System.arraycopy(var0, var1, var4, 0, var2);
            return var5;
         }
      }
   }

   public static long[] _/* $FF was: Ϳ*/(long[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return Ԫ;
         } else {
            long[] var3;
            long[] var10000 = var3 = new long[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static int[] _/* $FF was: Ԫ*/(int[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return Ԭ;
         } else {
            int[] var3;
            int[] var10000 = var3 = new int[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static short[] _/* $FF was: Ϳ*/(short[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return Ԯ;
         } else {
            short[] var3;
            short[] var10000 = var3 = new short[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static char[] _/* $FF was: Ϳ*/(char[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return ރ;
         } else {
            char[] var3;
            char[] var10000 = var3 = new char[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static byte[] _/* $FF was: Ϳ*/(byte[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return ՠ;
         } else {
            byte[] var3;
            byte[] var10000 = var3 = new byte[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static double[] _/* $FF was: Ϳ*/(double[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return ֏;
         } else {
            double[] var3;
            double[] var10000 = var3 = new double[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static float[] _/* $FF was: Ϳ*/(float[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return ؠ;
         } else {
            float[] var3;
            float[] var10000 = var3 = new float[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static boolean[] _/* $FF was: Ϳ*/(boolean[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > var0.length) {
            var2 = var0.length;
         }

         if ((var2 -= var1) <= 0) {
            return ށ;
         } else {
            boolean[] var3;
            boolean[] var10000 = var3 = new boolean[var2];
            System.arraycopy(var0, var1, var3, 0, var2);
            return var10000;
         }
      }
   }

   public static boolean _/* $FF was: Ԩ*/(Object[] var0, Object[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(long[] var0, long[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(int[] var0, int[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(short[] var0, short[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(char[] var0, char[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(byte[] var0, byte[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(double[] var0, double[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(float[] var0, float[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static boolean _/* $FF was: Ԩ*/(boolean[] var0, boolean[] var1) {
      return (var0 != null || var1 == null || var1.length <= 0) && (var1 != null || var0 == null || var0.length <= 0) && (var0 == null || var1 == null || var0.length == var1.length);
   }

   public static int _/* $FF was: Ϳ*/(Object var0) {
      return var0 == null ? 0 : Array.getLength(var0);
   }

   public static boolean _/* $FF was: Ԩ*/(Object var0, Object var1) {
      if (var0 != null && var1 != null) {
         return var0.getClass().getName().equals(var1.getClass().getName());
      } else {
         throw new IllegalArgumentException("The Array must not be null");
      }
   }

   public static void _/* $FF was: ԫ*/(Object[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            Object var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(long[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            long var3 = var0[var2];
            long var5 = var0[var1];
            var0[var2] = var5;
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(int[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            int var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(short[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            short var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(char[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            char var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(byte[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            byte var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(double[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            double var3 = var0[var2];
            double var5 = var0[var1];
            var0[var2] = var5;
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(float[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            float var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static void _/* $FF was: ԫ*/(boolean[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for(int var2 = var0.length - 1; var2 > var1; ++var1) {
            boolean var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            --var2;
         }

      }
   }

   public static int _/* $FF was: ԩ*/(Object[] var0, Object var1) {
      return Ϳ(var0, var1, 0);
   }

   public static int _/* $FF was: Ϳ*/(Object[] var0, Object var1, int var2) {
      if (var0 == null) {
         return -1;
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         if (var1 == null) {
            while(var2 < var0.length) {
               if (var0[var2] == null) {
                  return var2;
               }

               ++var2;
            }
         } else if (var0.getClass().getComponentType().isInstance(var1)) {
            while(var2 < var0.length) {
               if (var1.equals(var0[var2])) {
                  return var2;
               }

               ++var2;
            }
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(Object[] var0, Object var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: Ԩ*/(Object[] var0, Object var1, int var2) {
      if (var0 == null) {
         return -1;
      } else if (var2 < 0) {
         return -1;
      } else {
         if (var2 >= var0.length) {
            var2 = var0.length - 1;
         }

         if (var1 == null) {
            while(var2 >= 0) {
               if (var0[var2] == null) {
                  return var2;
               }

               --var2;
            }
         } else if (var0.getClass().getComponentType().isInstance(var1)) {
            while(var2 >= 0) {
               if (var1.equals(var0[var2])) {
                  return var2;
               }

               --var2;
            }
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(Object[] var0, Object var1) {
      return Ϳ(var0, var1, 0) != -1;
   }

   public static int _/* $FF was: ԩ*/(long[] var0, long var1) {
      return Ϳ(var0, var1, 0);
   }

   public static int _/* $FF was: Ϳ*/(long[] var0, long var1, int var3) {
      if (var0 == null) {
         return -1;
      } else {
         if (var3 < 0) {
            var3 = 0;
         }

         while(var3 < var0.length) {
            if (var1 == var0[var3]) {
               return var3;
            }

            ++var3;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(long[] var0, long var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: Ԩ*/(long[] var0, long var1, int var3) {
      if (var0 == null) {
         return -1;
      } else if (var3 < 0) {
         return -1;
      } else {
         if (var3 >= var0.length) {
            var3 = var0.length - 1;
         }

         while(var3 >= 0) {
            if (var1 == var0[var3]) {
               return var3;
            }

            --var3;
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(long[] var0, long var1) {
      return Ϳ(var0, var1, 0) != -1;
   }

   public static int _/* $FF was: ԩ*/(int[] var0, int var1) {
      return Ԩ((int[])var0, (int)var1, 0);
   }

   public static int _/* $FF was: Ԩ*/(int[] var0, int var1, int var2) {
      if (var0 == null) {
         return -1;
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         while(var2 < var0.length) {
            if (var1 == var0[var2]) {
               return var2;
            }

            ++var2;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(int[] var0, int var1) {
      return ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: ԩ*/(int[] var0, int var1, int var2) {
      if (var0 == null) {
         return -1;
      } else if (var2 < 0) {
         return -1;
      } else {
         if (var2 >= var0.length) {
            var2 = var0.length - 1;
         }

         while(var2 >= 0) {
            if (var1 == var0[var2]) {
               return var2;
            }

            --var2;
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(int[] var0, int var1) {
      return Ԩ((int[])var0, (int)var1, 0) != -1;
   }

   public static int _/* $FF was: ԩ*/(short[] var0, short var1) {
      return Ϳ((short[])var0, (short)var1, (int)0);
   }

   public static int _/* $FF was: Ϳ*/(short[] var0, short var1, int var2) {
      if (var0 == null) {
         return -1;
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         while(var2 < var0.length) {
            if (var1 == var0[var2]) {
               return var2;
            }

            ++var2;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(short[] var0, short var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: Ԩ*/(short[] var0, short var1, int var2) {
      if (var0 == null) {
         return -1;
      } else if (var2 < 0) {
         return -1;
      } else {
         if (var2 >= var0.length) {
            var2 = var0.length - 1;
         }

         while(var2 >= 0) {
            if (var1 == var0[var2]) {
               return var2;
            }

            --var2;
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(short[] var0, short var1) {
      return Ϳ((short[])var0, (short)var1, (int)0) != -1;
   }

   public static int _/* $FF was: ԩ*/(char[] var0, char var1) {
      return Ϳ((char[])var0, (char)var1, (int)0);
   }

   public static int _/* $FF was: Ϳ*/(char[] var0, char var1, int var2) {
      if (var0 == null) {
         return -1;
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         while(var2 < var0.length) {
            if (var1 == var0[var2]) {
               return var2;
            }

            ++var2;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(char[] var0, char var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: Ԩ*/(char[] var0, char var1, int var2) {
      if (var0 == null) {
         return -1;
      } else if (var2 < 0) {
         return -1;
      } else {
         if (var2 >= var0.length) {
            var2 = var0.length - 1;
         }

         while(var2 >= 0) {
            if (var1 == var0[var2]) {
               return var2;
            }

            --var2;
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(char[] var0, char var1) {
      return Ϳ((char[])var0, (char)var1, (int)0) != -1;
   }

   public static int _/* $FF was: ԩ*/(byte[] var0, byte var1) {
      return Ϳ((byte[])var0, (byte)var1, (int)0);
   }

   public static int _/* $FF was: Ϳ*/(byte[] var0, byte var1, int var2) {
      if (var0 == null) {
         return -1;
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         while(var2 < var0.length) {
            if (var1 == var0[var2]) {
               return var2;
            }

            ++var2;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(byte[] var0, byte var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: Ԩ*/(byte[] var0, byte var1, int var2) {
      if (var0 == null) {
         return -1;
      } else if (var2 < 0) {
         return -1;
      } else {
         if (var2 >= var0.length) {
            var2 = var0.length - 1;
         }

         while(var2 >= 0) {
            if (var1 == var0[var2]) {
               return var2;
            }

            --var2;
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(byte[] var0, byte var1) {
      return Ϳ((byte[])var0, (byte)var1, (int)0) != -1;
   }

   public static int _/* $FF was: ԩ*/(double[] var0, double var1) {
      return Ϳ(var0, var1, 0);
   }

   public static int _/* $FF was: Ԩ*/(double[] var0, double var1, double var3) {
      return Ϳ(var0, var1, 0, var3);
   }

   public static int _/* $FF was: Ϳ*/(double[] var0, double var1, int var3) {
      if (Ԩ(var0)) {
         return -1;
      } else {
         if (var3 < 0) {
            var3 = 0;
         }

         while(var3 < var0.length) {
            if (var1 == var0[var3]) {
               return var3;
            }

            ++var3;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ϳ*/(double[] var0, double var1, int var3, double var4) {
      if (Ԩ(var0)) {
         return -1;
      } else {
         if (var3 < 0) {
            var3 = 0;
         }

         double var10000 = var1;
         var1 -= var4;

         for(var4 += var10000; var3 < var0.length; ++var3) {
            double var6;
            if ((var6 = var0[var3]) >= var1 && var6 <= var4) {
               return var3;
            }
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(double[] var0, double var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: ԩ*/(double[] var0, double var1, double var3) {
      return Ԩ(var0, var1, Integer.MAX_VALUE, var3);
   }

   public static int _/* $FF was: Ԩ*/(double[] var0, double var1, int var3) {
      if (Ԩ(var0)) {
         return -1;
      } else if (var3 < 0) {
         return -1;
      } else {
         if (var3 >= var0.length) {
            var3 = var0.length - 1;
         }

         while(var3 >= 0) {
            if (var1 == var0[var3]) {
               return var3;
            }

            --var3;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԩ*/(double[] var0, double var1, int var3, double var4) {
      if (Ԩ(var0)) {
         return -1;
      } else if (var3 < 0) {
         return -1;
      } else {
         if (var3 >= var0.length) {
            var3 = var0.length - 1;
         }

         double var10000 = var1;
         var1 -= var4;

         for(var4 += var10000; var3 >= 0; --var3) {
            double var6;
            if ((var6 = var0[var3]) >= var1 && var6 <= var4) {
               return var3;
            }
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(double[] var0, double var1) {
      return Ϳ(var0, var1, 0) != -1;
   }

   public static boolean _/* $FF was: Ϳ*/(double[] var0, double var1, double var3) {
      return Ϳ(var0, var1, 0, var3) != -1;
   }

   public static int _/* $FF was: ԩ*/(float[] var0, float var1) {
      return Ϳ(var0, var1, 0);
   }

   public static int _/* $FF was: Ϳ*/(float[] var0, float var1, int var2) {
      if (Ԩ(var0)) {
         return -1;
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         while(var2 < var0.length) {
            if (var1 == var0[var2]) {
               return var2;
            }

            ++var2;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(float[] var0, float var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: Ԩ*/(float[] var0, float var1, int var2) {
      if (Ԩ(var0)) {
         return -1;
      } else if (var2 < 0) {
         return -1;
      } else {
         if (var2 >= var0.length) {
            var2 = var0.length - 1;
         }

         while(var2 >= 0) {
            if (var1 == var0[var2]) {
               return var2;
            }

            --var2;
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(float[] var0, float var1) {
      return Ϳ(var0, var1, 0) != -1;
   }

   public static int _/* $FF was: ԩ*/(boolean[] var0, boolean var1) {
      return Ϳ(var0, var1, 0);
   }

   public static int _/* $FF was: Ϳ*/(boolean[] var0, boolean var1, int var2) {
      if (Ԩ(var0)) {
         return -1;
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         while(var2 < var0.length) {
            if (var1 == var0[var2]) {
               return var2;
            }

            ++var2;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ԫ*/(boolean[] var0, boolean var1) {
      return Ԩ(var0, var1, Integer.MAX_VALUE);
   }

   public static int _/* $FF was: Ԩ*/(boolean[] var0, boolean var1, int var2) {
      if (Ԩ(var0)) {
         return -1;
      } else if (var2 < 0) {
         return -1;
      } else {
         if (var2 >= var0.length) {
            var2 = var0.length - 1;
         }

         while(var2 >= 0) {
            if (var1 == var0[var2]) {
               return var2;
            }

            --var2;
         }

         return -1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(boolean[] var0, boolean var1) {
      return Ϳ(var0, var1, 0) != -1;
   }

   public static char[] _/* $FF was: Ԩ*/(Character[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ރ;
      } else {
         char[] var1 = new char[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static char[] _/* $FF was: Ϳ*/(Character[] var0, char var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ރ;
      } else {
         char[] var2 = new char[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Character var4;
            char var5;
            if ((var4 = var0[var3]) == null) {
               var5 = var1;
            } else {
               var5 = var4;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   public static Character[] _/* $FF was: Ԭ*/(char[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ބ;
      } else {
         Character[] var1 = new Character[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static long[] _/* $FF was: Ԩ*/(Long[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return Ԫ;
      } else {
         long[] var1 = new long[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static long[] _/* $FF was: Ϳ*/(Long[] var0, long var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return Ԫ;
      } else {
         long[] var3 = new long[var0.length];

         for(int var4 = 0; var4 < var0.length; ++var4) {
            Long var5;
            long var7;
            if ((var5 = var0[var4]) == null) {
               var7 = var1;
            } else {
               var7 = var5;
            }

            var3[var4] = var7;
         }

         return var3;
      }
   }

   public static Long[] _/* $FF was: Ԭ*/(long[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ԫ;
      } else {
         Long[] var1 = new Long[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static int[] _/* $FF was: Ԩ*/(Integer[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return Ԭ;
      } else {
         int[] var1 = new int[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static int[] _/* $FF was: Ϳ*/(Integer[] var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return Ԭ;
      } else {
         int[] var2 = new int[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Integer var4;
            int var5;
            if ((var4 = var0[var3]) == null) {
               var5 = var1;
            } else {
               var5 = var4;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   public static Integer[] _/* $FF was: Ԭ*/(int[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ԭ;
      } else {
         Integer[] var1 = new Integer[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static short[] _/* $FF was: Ԩ*/(Short[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return Ԯ;
      } else {
         short[] var1 = new short[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static short[] _/* $FF was: Ϳ*/(Short[] var0, short var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return Ԯ;
      } else {
         short[] var2 = new short[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Short var4;
            short var5;
            if ((var4 = var0[var3]) == null) {
               var5 = var1;
            } else {
               var5 = var4;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   public static Short[] _/* $FF was: Ԭ*/(short[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ԯ;
      } else {
         Short[] var1 = new Short[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static byte[] _/* $FF was: Ԩ*/(Byte[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ՠ;
      } else {
         byte[] var1 = new byte[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static byte[] _/* $FF was: Ϳ*/(Byte[] var0, byte var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ՠ;
      } else {
         byte[] var2 = new byte[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Byte var4;
            byte var5;
            if ((var4 = var0[var3]) == null) {
               var5 = var1;
            } else {
               var5 = var4;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   public static Byte[] _/* $FF was: Ԭ*/(byte[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ֈ;
      } else {
         Byte[] var1 = new Byte[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static double[] _/* $FF was: Ԩ*/(Double[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ֏;
      } else {
         double[] var1 = new double[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static double[] _/* $FF was: Ϳ*/(Double[] var0, double var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ֏;
      } else {
         double[] var3 = new double[var0.length];

         for(int var4 = 0; var4 < var0.length; ++var4) {
            Double var5;
            double var7;
            if ((var5 = var0[var4]) == null) {
               var7 = var1;
            } else {
               var7 = var5;
            }

            var3[var4] = var7;
         }

         return var3;
      }
   }

   public static Double[] _/* $FF was: Ԭ*/(double[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ׯ;
      } else {
         Double[] var1 = new Double[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static float[] _/* $FF was: Ԩ*/(Float[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ؠ;
      } else {
         float[] var1 = new float[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static float[] _/* $FF was: Ϳ*/(Float[] var0, float var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ؠ;
      } else {
         float[] var2 = new float[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Float var4;
            float var5;
            if ((var4 = var0[var3]) == null) {
               var5 = var1;
            } else {
               var5 = var4;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   public static Float[] _/* $FF was: Ԭ*/(float[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ހ;
      } else {
         Float[] var1 = new Float[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static boolean[] _/* $FF was: Ԩ*/(Boolean[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ށ;
      } else {
         boolean[] var1 = new boolean[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static boolean[] _/* $FF was: Ϳ*/(Boolean[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ށ;
      } else {
         boolean[] var2 = new boolean[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Boolean var4;
            boolean var5;
            if ((var4 = var0[var3]) == null) {
               var5 = var1;
            } else {
               var5 = var4;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   public static Boolean[] _/* $FF was: Ԭ*/(boolean[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ނ;
      } else {
         Boolean[] var1 = new Boolean[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            Boolean var3;
            if (var0[var2]) {
               var3 = Boolean.TRUE;
            } else {
               var3 = Boolean.FALSE;
            }

            var1[var2] = var3;
         }

         return var1;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(Object[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(long[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(int[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(short[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(char[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(byte[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(double[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(float[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean _/* $FF was: Ԩ*/(boolean[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static <T> boolean _/* $FF was: ԩ*/(T[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(long[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(int[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(short[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(char[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(byte[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(double[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(float[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static boolean _/* $FF was: ԩ*/(boolean[] var0) {
      return var0 != null && var0.length != 0;
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, T... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         Class var2;
         Object[] var3;
         Object[] var10000 = var3 = (Object[])Array.newInstance(var2 = var0.getClass().getComponentType(), var0.length + var1.length);
         Object[] var10001 = var1;
         Object[] var10002 = var1;
         Object[] var10003 = var0;
         Object[] var10004 = var0;
         int var9 = var0.length;
         System.arraycopy(var10004, 0, var3, 0, var9);
         byte var10 = 0;

         ArrayStoreException var13;
         label45: {
            boolean var14;
            int var16;
            try {
               var16 = var10003.length;
            } catch (ArrayStoreException var8) {
               var13 = var8;
               var14 = false;
               break label45;
            }

            int var4 = var16;

            int var15;
            try {
               var15 = var10002.length;
            } catch (ArrayStoreException var7) {
               var13 = var7;
               var14 = false;
               break label45;
            }

            int var5 = var15;

            try {
               System.arraycopy(var10001, var10, var3, var4, var5);
               return var10000;
            } catch (ArrayStoreException var6) {
               var13 = var6;
               var14 = false;
            }
         }

         ArrayStoreException var11 = var13;
         Class var12;
         if (!var2.isAssignableFrom(var12 = var1.getClass().getComponentType())) {
            throw new IllegalArgumentException("Cannot store " + var12.getName() + " in an array of " + var2.getName(), var11);
         } else {
            throw var11;
         }
      }
   }

   public static boolean[] _/* $FF was: Ϳ*/(boolean[] var0, boolean... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         boolean[] var2;
         boolean[] var10000 = var2 = new boolean[var0.length + var1.length];
         boolean[] var10001 = var1;
         boolean[] var10003 = var0;
         boolean[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static char[] _/* $FF was: Ϳ*/(char[] var0, char... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         char[] var2;
         char[] var10000 = var2 = new char[var0.length + var1.length];
         char[] var10001 = var1;
         char[] var10003 = var0;
         char[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static byte[] _/* $FF was: Ϳ*/(byte[] var0, byte... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         byte[] var2;
         byte[] var10000 = var2 = new byte[var0.length + var1.length];
         byte[] var10001 = var1;
         byte[] var10003 = var0;
         byte[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static short[] _/* $FF was: Ϳ*/(short[] var0, short... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         short[] var2;
         short[] var10000 = var2 = new short[var0.length + var1.length];
         short[] var10001 = var1;
         short[] var10003 = var0;
         short[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static int[] _/* $FF was: Ϳ*/(int[] var0, int... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         int[] var2;
         int[] var10000 = var2 = new int[var0.length + var1.length];
         int[] var10001 = var1;
         int[] var10003 = var0;
         int[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static long[] _/* $FF was: Ϳ*/(long[] var0, long... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         long[] var2;
         long[] var10000 = var2 = new long[var0.length + var1.length];
         long[] var10001 = var1;
         long[] var10003 = var0;
         long[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static float[] _/* $FF was: Ϳ*/(float[] var0, float... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         float[] var2;
         float[] var10000 = var2 = new float[var0.length + var1.length];
         float[] var10001 = var1;
         float[] var10003 = var0;
         float[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static double[] _/* $FF was: Ϳ*/(double[] var0, double... var1) {
      if (var0 == null) {
         return Ϳ(var1);
      } else if (var1 == null) {
         return Ϳ(var0);
      } else {
         double[] var2;
         double[] var10000 = var2 = new double[var0.length + var1.length];
         double[] var10001 = var1;
         double[] var10003 = var0;
         double[] var10004 = var0;
         int var3 = var0.length;
         System.arraycopy(var10004, 0, var2, 0, var3);
         var3 = var10003.length;
         int var4 = var1.length;
         System.arraycopy(var10001, 0, var2, var3, var4);
         return var10000;
      }
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, T var1) {
      Class var2;
      if (var0 != null) {
         var2 = var0.getClass();
      } else {
         if (var1 == null) {
            throw new IllegalArgumentException("Arguments cannot both be null");
         }

         var2 = var1.getClass();
      }

      Object[] var10000 = (Object[])Ϳ((Object)var0, (Class)var2);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static boolean[] _/* $FF was: Ϳ*/(boolean[] var0, boolean var1) {
      boolean[] var10000 = (boolean[])Ϳ((Object)var0, (Class)Boolean.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static byte[] _/* $FF was: Ϳ*/(byte[] var0, byte var1) {
      byte[] var10000 = (byte[])Ϳ((Object)var0, (Class)Byte.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static char[] _/* $FF was: Ϳ*/(char[] var0, char var1) {
      char[] var10000 = (char[])Ϳ((Object)var0, (Class)Character.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static double[] _/* $FF was: Ϳ*/(double[] var0, double var1) {
      double[] var10000 = (double[])Ϳ((Object)var0, (Class)Double.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static float[] _/* $FF was: Ϳ*/(float[] var0, float var1) {
      float[] var10000 = (float[])Ϳ((Object)var0, (Class)Float.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static int[] _/* $FF was: Ϳ*/(int[] var0, int var1) {
      int[] var10000 = (int[])Ϳ((Object)var0, (Class)Integer.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static long[] _/* $FF was: Ϳ*/(long[] var0, long var1) {
      long[] var10000 = (long[])Ϳ((Object)var0, (Class)Long.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static short[] _/* $FF was: Ϳ*/(short[] var0, short var1) {
      short[] var10000 = (short[])Ϳ((Object)var0, (Class)Short.TYPE);
      var10000[var10000.length - 1] = var1;
      return var10000;
   }

   public static Object _/* $FF was: Ϳ*/(Object var0, Class<?> var1) {
      if (var0 != null) {
         int var3 = Array.getLength(var0);
         Object var2;
         Object var10000 = var2 = Array.newInstance(var0.getClass().getComponentType(), var3 + 1);
         System.arraycopy(var0, 0, var2, 0, var3);
         return var10000;
      } else {
         return Array.newInstance(var1, 1);
      }
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, int var1, T var2) {
      Class var3;
      if (var0 != null) {
         var3 = var0.getClass().getComponentType();
      } else {
         if (var2 == null) {
            throw new IllegalArgumentException("Array and element cannot both be null");
         }

         var3 = var2.getClass();
      }

      return (Object[])Ϳ(var0, var1, var2, var3);
   }

   public static boolean[] _/* $FF was: Ϳ*/(boolean[] var0, int var1, boolean var2) {
      return (boolean[])Ϳ(var0, var1, var2, Boolean.TYPE);
   }

   public static char[] _/* $FF was: Ϳ*/(char[] var0, int var1, char var2) {
      return (char[])Ϳ(var0, var1, var2, Character.TYPE);
   }

   public static byte[] _/* $FF was: Ϳ*/(byte[] var0, int var1, byte var2) {
      return (byte[])Ϳ(var0, var1, var2, Byte.TYPE);
   }

   public static short[] _/* $FF was: Ϳ*/(short[] var0, int var1, short var2) {
      return (short[])Ϳ(var0, var1, var2, Short.TYPE);
   }

   public static int[] _/* $FF was: Ϳ*/(int[] var0, int var1, int var2) {
      return (int[])Ϳ(var0, var1, var2, Integer.TYPE);
   }

   public static long[] _/* $FF was: Ϳ*/(long[] var0, int var1, long var2) {
      return (long[])Ϳ(var0, var1, var2, Long.TYPE);
   }

   public static float[] _/* $FF was: Ϳ*/(float[] var0, int var1, float var2) {
      return (float[])Ϳ(var0, var1, var2, Float.TYPE);
   }

   public static double[] _/* $FF was: Ϳ*/(double[] var0, int var1, double var2) {
      return (double[])Ϳ(var0, var1, var2, Double.TYPE);
   }

   public static Object _/* $FF was: Ϳ*/(Object var0, int var1, Object var2, Class<?> var3) {
      Object var10000;
      if (var0 == null) {
         if (var1 == 0) {
            var10000 = Array.newInstance(var3, 1);
            Array.set(var10000, 0, var2);
            return var10000;
         } else {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Length: 0");
         }
      } else {
         int var4;
         if (var1 <= (var4 = Array.getLength(var0)) && var1 >= 0) {
            Object var7;
            Object var10002 = var7 = Array.newInstance(var3, var4 + 1);
            System.arraycopy(var0, 0, var7, 0, var1);
            Array.set(var10002, var1, var2);
            if (var1 < var4) {
               var10000 = var0;
               int var5 = var1 + 1;
               int var6 = var4 - var1;
               System.arraycopy(var10000, var1, var7, var5, var6);
            }

            return var7;
         } else {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Length: " + var4);
         }
      }
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, int var1) {
      return (Object[])Ϳ((Object)var0, (int)var1);
   }

   public static <T> T[] _/* $FF was: ԫ*/(T[] var0, Object var1) {
      int var2;
      return (var2 = Ϳ(var0, var1, 0)) == -1 ? Ϳ(var0) : (Object[])Ϳ((Object)var0, (int)var2);
   }

   public static boolean[] _/* $FF was: Ϳ*/(boolean[] var0, int var1) {
      return (boolean[])Ϳ((Object)var0, (int)var1);
   }

   public static boolean[] _/* $FF was: ԫ*/(boolean[] var0, boolean var1) {
      int var2;
      return (var2 = Ϳ(var0, var1, 0)) == -1 ? Ϳ(var0) : (boolean[])Ϳ((Object)var0, (int)var2);
   }

   public static byte[] _/* $FF was: Ϳ*/(byte[] var0, int var1) {
      return (byte[])Ϳ((Object)var0, (int)var1);
   }

   public static byte[] _/* $FF was: ԫ*/(byte[] var0, byte var1) {
      int var2;
      return (var2 = Ϳ((byte[])var0, (byte)var1, (int)0)) == -1 ? Ϳ(var0) : (byte[])Ϳ((Object)var0, (int)var2);
   }

   public static char[] _/* $FF was: Ϳ*/(char[] var0, int var1) {
      return (char[])Ϳ((Object)var0, (int)var1);
   }

   public static char[] _/* $FF was: ԫ*/(char[] var0, char var1) {
      int var2;
      return (var2 = Ϳ((char[])var0, (char)var1, (int)0)) == -1 ? Ϳ(var0) : (char[])Ϳ((Object)var0, (int)var2);
   }

   public static double[] _/* $FF was: Ϳ*/(double[] var0, int var1) {
      return (double[])Ϳ((Object)var0, (int)var1);
   }

   public static double[] _/* $FF was: ԫ*/(double[] var0, double var1) {
      int var3;
      return (var3 = Ϳ(var0, var1, 0)) == -1 ? Ϳ(var0) : (double[])Ϳ((Object)var0, (int)var3);
   }

   public static float[] _/* $FF was: Ϳ*/(float[] var0, int var1) {
      return (float[])Ϳ((Object)var0, (int)var1);
   }

   public static float[] _/* $FF was: ԫ*/(float[] var0, float var1) {
      int var2;
      return (var2 = Ϳ(var0, var1, 0)) == -1 ? Ϳ(var0) : (float[])Ϳ((Object)var0, (int)var2);
   }

   public static int[] _/* $FF was: ԫ*/(int[] var0, int var1) {
      return (int[])Ϳ((Object)var0, (int)var1);
   }

   public static int[] _/* $FF was: Ԭ*/(int[] var0, int var1) {
      return (var1 = Ԩ((int[])var0, (int)var1, 0)) == -1 ? Ϳ(var0) : (int[])Ϳ((Object)var0, (int)var1);
   }

   public static long[] _/* $FF was: Ϳ*/(long[] var0, int var1) {
      return (long[])Ϳ((Object)var0, (int)var1);
   }

   public static long[] _/* $FF was: ԫ*/(long[] var0, long var1) {
      int var3;
      return (var3 = Ϳ(var0, var1, 0)) == -1 ? Ϳ(var0) : (long[])Ϳ((Object)var0, (int)var3);
   }

   public static short[] _/* $FF was: Ϳ*/(short[] var0, int var1) {
      return (short[])Ϳ((Object)var0, (int)var1);
   }

   public static short[] _/* $FF was: ԫ*/(short[] var0, short var1) {
      int var2;
      return (var2 = Ϳ((short[])var0, (short)var1, (int)0)) == -1 ? Ϳ(var0) : (short[])Ϳ((Object)var0, (int)var2);
   }

   public static Object _/* $FF was: Ϳ*/(Object var0, int var1) {
      int var2 = Ϳ(var0);
      if (var1 >= 0 && var1 < var2) {
         int var3;
         Object var4 = Array.newInstance(var0.getClass().getComponentType(), var3 = var2 - 1);
         System.arraycopy(var0, 0, var4, 0, var1);
         if (var1 < var3) {
            Object var10000 = var0;
            int var5 = var1 + 1;
            var2 = var2 - var1 - 1;
            System.arraycopy(var10000, var5, var4, var1, var2);
         }

         return var4;
      } else {
         throw new IndexOutOfBoundsException("Index: " + var1 + ", Length: " + var2);
      }
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, int... var1) {
      return (Object[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static <T> T[] _/* $FF was: ԩ*/(T[] var0, T... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Object var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Object var9 = var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static byte[] _/* $FF was: Ϳ*/(byte[] var0, int... var1) {
      return (byte[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static byte[] _/* $FF was: ԩ*/(byte[] var0, byte... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Byte var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Byte var9 = (Byte)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static short[] _/* $FF was: Ϳ*/(short[] var0, int... var1) {
      return (short[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static short[] _/* $FF was: ԩ*/(short[] var0, short... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Short var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Short var9 = (Short)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static int[] _/* $FF was: ԩ*/(int[] var0, int... var1) {
      return (int[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static int[] _/* $FF was: Ԫ*/(int[] var0, int... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Integer var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Integer var9 = (Integer)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ԩ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return ԩ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static char[] _/* $FF was: Ϳ*/(char[] var0, int... var1) {
      return (char[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static char[] _/* $FF was: ԩ*/(char[] var0, char... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Character var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Character var9 = (Character)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static long[] _/* $FF was: Ϳ*/(long[] var0, int... var1) {
      return (long[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static long[] _/* $FF was: ԩ*/(long[] var0, long... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Long var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Long var9 = (Long)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static float[] _/* $FF was: Ϳ*/(float[] var0, int... var1) {
      return (float[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static float[] _/* $FF was: ԩ*/(float[] var0, float... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Float var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Float var9 = (Float)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static double[] _/* $FF was: Ϳ*/(double[] var0, int... var1) {
      return (double[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static double[] _/* $FF was: ԩ*/(double[] var0, double... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Double var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Double var9 = (Double)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static boolean[] _/* $FF was: Ϳ*/(boolean[] var0, int... var1) {
      return (boolean[])Ϳ((Object)var0, (int[])Ϳ(var1));
   }

   public static boolean[] _/* $FF was: ԩ*/(boolean[] var0, boolean... var1) {
      if (!Ԩ(var0) && !Ԩ(var1)) {
         HashMap var2;
         var2 = new HashMap.<init>(var1.length);
         int var3 = var1.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Boolean var5;
            ၸ var6;
            if ((var6 = (ၸ)var2.get(var5 = var1[var4])) == null) {
               var6 = new ၸ.<init>(1);
               var2.put(var5, var6);
            } else {
               var6.increment();
            }
         }

         HashSet var7;
         var7 = new HashSet.<init>();
         Iterator var8 = var2.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var10000 = (Entry)var8.next();
            Boolean var9 = (Boolean)var10000.getKey();
            var4 = 0;
            int var10 = 0;

            for(int var11 = ((ၸ)var10000.getValue()).intValue(); var10 < var11 && (var4 = Ϳ(var0, var9, var4)) >= 0; ++var10) {
               var7.add(var4++);
            }
         }

         return Ϳ(var0, Ϳ(var7));
      } else {
         return Ϳ(var0);
      }
   }

   public static Object _/* $FF was: Ϳ*/(Object var0, int... var1) {
      int var2 = Ϳ(var0);
      int var3 = 0;
      int var5;
      int var6;
      if (ԩ(var1)) {
         Arrays.sort(var1);
         int var4 = var1.length;
         var5 = var2;

         while((var4 += -1) >= 0) {
            if ((var6 = var1[var4]) < 0 || var6 >= var2) {
               throw new IndexOutOfBoundsException("Index: " + var6 + ", Length: " + var2);
            }

            if (var6 < var5) {
               ++var3;
               var5 = var6;
            }
         }
      }

      int var10000 = var3;
      Object var7 = Array.newInstance(var0.getClass().getComponentType(), var3 = var2 - var3);
      if (var10000 < var2) {
         for(var5 = var1.length - 1; var5 >= 0; --var5) {
            if ((var6 = var2 - (var2 = var1[var5])) > 1) {
               var6 = var3 - (var3 = var6 - 1);
               System.arraycopy(var0, var2 + 1, var7, var6, var3);
               var3 = var6;
            }
         }

         if (var2 > 0) {
            System.arraycopy(var0, 0, var7, 0, var2);
         }
      }

      return var7;
   }

   public static int[] _/* $FF was: Ϳ*/(HashSet<Integer> var0) {
      int[] var3 = new int[var0.size()];
      int var1 = 0;

      int var10001;
      Integer var10002;
      for(Iterator var2 = var0.iterator(); var2.hasNext(); var3[var10001] = var10002) {
         var10001 = var1;
         var10002 = (Integer)var2.next();
         ++var1;
      }

      return var3;
   }
}
