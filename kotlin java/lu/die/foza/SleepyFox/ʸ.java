package lu.die.foza.SleepyFox;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class ʸ {
   public static final String Ϳ = "The value %s is not in the specified exclusive range of %s to %s";
   public static final String Ԩ = "The value %s is not in the specified inclusive range of %s to %s";
   public static final String ԩ = "The string %s does not match the pattern %s";
   public static final String Ԫ = "The validated object is null";
   public static final String ԫ = "The validated expression is false";
   public static final String Ԭ = "The validated array contains null element at index: %d";
   public static final String ԭ = "The validated collection contains null element at index: %d";
   public static final String Ԯ = "The validated character sequence is blank";
   public static final String ԯ = "The validated array is empty";
   public static final String ՠ = "The validated character sequence is empty";
   public static final String ֈ = "The validated collection is empty";
   public static final String ֏ = "The validated map is empty";
   public static final String ׯ = "The validated array index is invalid: %d";
   public static final String ؠ = "The validated character sequence index is invalid: %d";
   public static final String ހ = "The validated collection index is invalid: %d";
   public static final String ށ = "The validated state is false";
   public static final String ނ = "Cannot assign a %s to a %s";
   public static final String ރ = "Expected type: %s, actual: %s";

   public static void _/* $FF was: Ϳ*/(boolean var0, String var1, long var2) {
      if (!var0) {
         throw new IllegalArgumentException(String.format(var1, var2));
      }
   }

   public static void _/* $FF was: Ϳ*/(boolean var0, String var1, double var2) {
      if (!var0) {
         throw new IllegalArgumentException(String.format(var1, var2));
      }
   }

   public static void _/* $FF was: Ϳ*/(boolean var0, String var1, Object... var2) {
      if (!var0) {
         throw new IllegalArgumentException(String.format(var1, var2));
      }
   }

   public static void _/* $FF was: Ϳ*/(boolean var0) {
      if (!var0) {
         throw new IllegalArgumentException("The validated expression is false");
      }
   }

   public static <T> T _/* $FF was: Ϳ*/(T var0) {
      return Ϳ(var0, "The validated object is null");
   }

   public static <T> T _/* $FF was: Ϳ*/(T var0, String var1, Object... var2) {
      if (var0 != null) {
         return var0;
      } else {
         throw new NullPointerException(String.format(var1, var2));
      }
   }

   public static <T> T[] _/* $FF was: Ԩ*/(T[] var0, String var1, Object... var2) {
      if (var0 != null) {
         if (var0.length != 0) {
            return var0;
         } else {
            throw new IllegalArgumentException(String.format(var1, var2));
         }
      } else {
         throw new NullPointerException(String.format(var1, var2));
      }
   }

   public static <T> T[] _/* $FF was: Ԩ*/(T[] var0) {
      return Ԩ(var0, "The validated array is empty");
   }

   public static <T extends Collection<?>> T _/* $FF was: Ϳ*/(T var0, String var1, Object... var2) {
      if (var0 != null) {
         if (!var0.isEmpty()) {
            return var0;
         } else {
            throw new IllegalArgumentException(String.format(var1, var2));
         }
      } else {
         throw new NullPointerException(String.format(var1, var2));
      }
   }

   public static <T extends Collection<?>> T _/* $FF was: Ϳ*/(T var0) {
      return Ϳ(var0, "The validated collection is empty");
   }

   public static <T extends Map<?, ?>> T _/* $FF was: Ϳ*/(T var0, String var1, Object... var2) {
      if (var0 != null) {
         if (!var0.isEmpty()) {
            return var0;
         } else {
            throw new IllegalArgumentException(String.format(var1, var2));
         }
      } else {
         throw new NullPointerException(String.format(var1, var2));
      }
   }

   public static <T extends Map<?, ?>> T _/* $FF was: Ϳ*/(T var0) {
      return Ϳ(var0, "The validated map is empty");
   }

   public static <T extends CharSequence> T _/* $FF was: Ԩ*/(T var0, String var1, Object... var2) {
      if (var0 != null) {
         if (var0.length() != 0) {
            return var0;
         } else {
            throw new IllegalArgumentException(String.format(var1, var2));
         }
      } else {
         throw new NullPointerException(String.format(var1, var2));
      }
   }

   public static <T extends CharSequence> T _/* $FF was: Ԩ*/(T var0) {
      return Ԩ(var0, "The validated character sequence is empty");
   }

   public static <T extends CharSequence> T _/* $FF was: Ϳ*/(T var0, String var1, Object... var2) {
      if (var0 != null) {
         if (!ʴ.ԯ(var0)) {
            return var0;
         } else {
            throw new IllegalArgumentException(String.format(var1, var2));
         }
      } else {
         throw new NullPointerException(String.format(var1, var2));
      }
   }

   public static <T extends CharSequence> T _/* $FF was: Ϳ*/(T var0) {
      return Ϳ(var0, "The validated character sequence is blank");
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, String var1, Object... var2) {
      Ϳ((Object)var0);

      for(int var3 = 0; var3 < var0.length; ++var3) {
         if (var0[var3] == null) {
            var0 = ކ.Ϳ((Object[])var2, (Object)var3);
            throw new IllegalArgumentException(String.format(var1, var0));
         }
      }

      return var0;
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0) {
      return Ϳ(var0, "The validated array contains null element at index: %d");
   }

   public static <T extends Iterable<?>> T _/* $FF was: Ϳ*/(T var0, String var1, Object... var2) {
      Ϳ((Object)var0);
      int var3 = 0;

      for(Iterator var4 = var0.iterator(); var4.hasNext(); ++var3) {
         if (var4.next() == null) {
            Object[] var5 = ކ.Ϳ(var2, var3);
            throw new IllegalArgumentException(String.format(var1, var5));
         }
      }

      return var0;
   }

   public static <T extends Iterable<?>> T _/* $FF was: Ϳ*/(T var0) {
      return Ϳ(var0, "The validated collection contains null element at index: %d");
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, int var1, String var2, Object... var3) {
      Ϳ((Object)var0);
      if (var1 >= 0 && var1 < var0.length) {
         return var0;
      } else {
         throw new IndexOutOfBoundsException(String.format(var2, var3));
      }
   }

   public static <T> T[] _/* $FF was: Ϳ*/(T[] var0, int var1) {
      Object[] var10000 = var0;
      (var0 = new Object[1])[0] = var1;
      return Ϳ(var10000, var1, "The validated array index is invalid: %d", var0);
   }

   public static <T extends Collection<?>> T _/* $FF was: Ϳ*/(T var0, int var1, String var2, Object... var3) {
      Ϳ((Object)var0);
      if (var1 >= 0 && var1 < var0.size()) {
         return var0;
      } else {
         throw new IndexOutOfBoundsException(String.format(var2, var3));
      }
   }

   public static <T extends Collection<?>> T _/* $FF was: Ϳ*/(T var0, int var1) {
      Collection var10000 = var0;
      Object[] var2;
      (var2 = new Object[1])[0] = var1;
      return Ϳ(var10000, var1, "The validated collection index is invalid: %d", var2);
   }

   public static <T extends CharSequence> T _/* $FF was: Ϳ*/(T var0, int var1, String var2, Object... var3) {
      Ϳ((Object)var0);
      if (var1 >= 0 && var1 < var0.length()) {
         return var0;
      } else {
         throw new IndexOutOfBoundsException(String.format(var2, var3));
      }
   }

   public static <T extends CharSequence> T _/* $FF was: Ϳ*/(T var0, int var1) {
      CharSequence var10000 = var0;
      Object[] var2;
      (var2 = new Object[1])[0] = var1;
      return Ϳ(var10000, var1, "The validated character sequence index is invalid: %d", var2);
   }

   public static void _/* $FF was: Ԩ*/(boolean var0) {
      if (!var0) {
         throw new IllegalStateException("The validated state is false");
      }
   }

   public static void _/* $FF was: Ԩ*/(boolean var0, String var1, Object... var2) {
      if (!var0) {
         throw new IllegalStateException(String.format(var1, var2));
      }
   }

   public static void _/* $FF was: Ϳ*/(CharSequence var0, String var1) {
      if (!Pattern.matches(var1, var0)) {
         Object[] var2;
         Object[] var10002 = var2 = new Object[2];
         var10002[0] = var0;
         var10002[1] = var1;
         throw new IllegalArgumentException(String.format("The string %s does not match the pattern %s", var2));
      }
   }

   public static void _/* $FF was: Ϳ*/(CharSequence var0, String var1, String var2, Object... var3) {
      if (!Pattern.matches(var1, var0)) {
         throw new IllegalArgumentException(String.format(var2, var3));
      }
   }

   public static <T> void _/* $FF was: Ԩ*/(T var0, T var1, Comparable<T> var2) {
      if (var2.compareTo(var0) < 0 || var2.compareTo(var1) > 0) {
         Object[] var3;
         Object[] var10002 = var3 = new Object[3];
         var10002[0] = var2;
         var10002[1] = var0;
         var10002[2] = var1;
         throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", var3));
      }
   }

   public static <T> void _/* $FF was: Ԩ*/(T var0, T var1, Comparable<T> var2, String var3, Object... var4) {
      if (var2.compareTo(var0) < 0 || var2.compareTo(var1) > 0) {
         throw new IllegalArgumentException(String.format(var3, var4));
      }
   }

   public static <T> void _/* $FF was: Ϳ*/(T var0, T var1, Comparable<T> var2) {
      if (var2.compareTo(var0) <= 0 || var2.compareTo(var1) >= 0) {
         Object[] var3;
         Object[] var10002 = var3 = new Object[3];
         var10002[0] = var2;
         var10002[1] = var0;
         var10002[2] = var1;
         throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", var3));
      }
   }

   public static <T> void _/* $FF was: Ϳ*/(T var0, T var1, Comparable<T> var2, String var3, Object... var4) {
      if (var2.compareTo(var0) <= 0 || var2.compareTo(var1) >= 0) {
         throw new IllegalArgumentException(String.format(var3, var4));
      }
   }

   public static void _/* $FF was: Ϳ*/(Class<?> var0, Object var1) {
      if (!var0.isInstance(var1)) {
         IllegalArgumentException var2 = new IllegalArgumentException;
         String var3 = "Expected type: %s, actual: %s";
         Object[] var4;
         (var4 = new Object[2])[0] = var0.getName();
         byte var5 = 1;
         String var6;
         if (var1 == null) {
            var6 = "null";
         } else {
            var6 = var1.getClass().getName();
         }

         var4[var5] = var6;
         var2.<init>(String.format(var3, var4));
         throw var2;
      }
   }

   public static void _/* $FF was: Ϳ*/(Class<?> var0, Object var1, String var2, Object... var3) {
      if (!var0.isInstance(var1)) {
         throw new IllegalArgumentException(String.format(var2, var3));
      }
   }

   public static void _/* $FF was: Ϳ*/(Class<?> var0, Class<?> var1) {
      if (!var0.isAssignableFrom(var1)) {
         IllegalArgumentException var2 = new IllegalArgumentException;
         String var3 = "Cannot assign a %s to a %s";
         Object[] var4 = new Object[2];
         byte var5 = 0;
         String var6;
         if (var1 == null) {
            var6 = "null";
         } else {
            var6 = var1.getName();
         }

         var4[var5] = var6;
         var4[1] = var0.getName();
         var2.<init>(String.format(var3, var4));
         throw var2;
      }
   }

   public static void _/* $FF was: Ϳ*/(Class<?> var0, Class<?> var1, String var2, Object... var3) {
      if (!var0.isAssignableFrom(var1)) {
         throw new IllegalArgumentException(String.format(var2, var3));
      }
   }
}
