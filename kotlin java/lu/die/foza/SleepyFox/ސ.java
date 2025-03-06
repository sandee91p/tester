package lu.die.foza.SleepyFox;

public class ސ {
   public static CharSequence _/* $FF was: Ϳ*/(CharSequence var0, int var1) {
      return var0 == null ? null : var0.subSequence(var1, var0.length());
   }

   public static int _/* $FF was: Ϳ*/(CharSequence var0, int var1, int var2) {
      if (var0 instanceof String) {
         return ((String)var0).indexOf(var1, var2);
      } else {
         int var3 = var0.length();
         if (var2 < 0) {
            var2 = 0;
         }

         while(var2 < var3) {
            if (var0.charAt(var2) == var1) {
               return var2;
            }

            ++var2;
         }

         return -1;
      }
   }

   public static int _/* $FF was: Ϳ*/(CharSequence var0, CharSequence var1, int var2) {
      return var0.toString().indexOf(var1.toString(), var2);
   }

   public static int _/* $FF was: Ԩ*/(CharSequence var0, int var1, int var2) {
      if (var0 instanceof String) {
         return ((String)var0).lastIndexOf(var1, var2);
      } else {
         int var3 = var0.length();
         if (var2 < 0) {
            return -1;
         } else {
            if (var2 >= var3) {
               var2 = var3 - 1;
            }

            while(var2 >= 0) {
               if (var0.charAt(var2) == var1) {
                  return var2;
               }

               --var2;
            }

            return -1;
         }
      }
   }

   public static int _/* $FF was: Ԩ*/(CharSequence var0, CharSequence var1, int var2) {
      return var0.toString().lastIndexOf(var1.toString(), var2);
   }

   public static char[] _/* $FF was: Ϳ*/(CharSequence var0) {
      if (var0 instanceof String) {
         return ((String)var0).toCharArray();
      } else {
         int var1 = var0.length();
         char[] var2 = new char[var0.length()];

         for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = var0.charAt(var3);
         }

         return var2;
      }
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0, boolean var1, int var2, CharSequence var3, int var4, int var5) {
      return var0 instanceof String && var3 instanceof String ? ((String)var0).regionMatches(var1, var2, (String)var3, var4, var5) : var0.toString().regionMatches(var1, var2, var3.toString(), var4, var5);
   }
}
