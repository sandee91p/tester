package lu.die.foza.SleepyFox;

public class ޑ {
   public static final String[] Ϳ = new String[128];
   public static final char Ԩ = '\n';
   public static final char ԩ = '\r';

   /** @deprecated */
   @Deprecated
   public static Character _/* $FF was: ԯ*/(char var0) {
      return var0;
   }

   public static Character _/* $FF was: Ԩ*/(String var0) {
      return ʴ.ՠ((CharSequence)var0) ? null : var0.charAt(0);
   }

   public static char _/* $FF was: Ϳ*/(Character var0) {
      if (var0 != null) {
         return var0;
      } else {
         throw new IllegalArgumentException("The Character must not be null");
      }
   }

   public static char _/* $FF was: Ϳ*/(Character var0, char var1) {
      return var0 == null ? var1 : var0;
   }

   public static char _/* $FF was: Ϳ*/(String var0) {
      if (!ʴ.ՠ((CharSequence)var0)) {
         return var0.charAt(0);
      } else {
         throw new IllegalArgumentException("The String must not be empty");
      }
   }

   public static char _/* $FF was: Ϳ*/(String var0, char var1) {
      return ʴ.ՠ((CharSequence)var0) ? var1 : var0.charAt(0);
   }

   public static int _/* $FF was: ՠ*/(char var0) {
      if (ԭ(var0)) {
         return var0 - 48;
      } else {
         throw new IllegalArgumentException("The character " + var0 + " is not in the range '0' - '9'");
      }
   }

   public static int _/* $FF was: Ϳ*/(char var0, int var1) {
      return !ԭ(var0) ? var1 : var0 - 48;
   }

   public static int _/* $FF was: Ԩ*/(Character var0) {
      if (var0 != null) {
         return ՠ(var0);
      } else {
         throw new IllegalArgumentException("The character must not be null");
      }
   }

   public static int _/* $FF was: Ϳ*/(Character var0, int var1) {
      return var0 == null ? var1 : Ϳ(var0, var1);
   }

   public static String _/* $FF was: ֈ*/(char var0) {
      if (var0 < 128) {
         return Ϳ[var0];
      } else {
         char[] var1;
         (var1 = new char[1])[0] = var0;
         return new String(var1);
      }
   }

   public static String _/* $FF was: ԩ*/(Character var0) {
      return var0 == null ? null : ֈ(var0);
   }

   public static String ֏(char var0) {
      if (var0 < 16) {
         return "\\u000" + Integer.toHexString(var0);
      } else if (var0 < 256) {
         return "\\u00" + Integer.toHexString(var0);
      } else {
         return var0 < 4096 ? "\\u0" + Integer.toHexString(var0) : "\\u" + Integer.toHexString(var0);
      }
   }

   public static String _/* $FF was: Ԫ*/(Character var0) {
      return var0 == null ? null : ֏(var0);
   }

   public static boolean _/* $FF was: Ϳ*/(char var0) {
      return var0 < 128;
   }

   public static boolean _/* $FF was: Ԯ*/(char var0) {
      return var0 >= ' ' && var0 < 127;
   }

   public static boolean _/* $FF was: Ԭ*/(char var0) {
      return var0 < ' ' || var0 == 127;
   }

   public static boolean _/* $FF was: Ԩ*/(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean _/* $FF was: Ԫ*/(char var0) {
      return var0 >= 'A' && var0 <= 'Z';
   }

   public static boolean _/* $FF was: ԩ*/(char var0) {
      return var0 >= 'a' && var0 <= 'z';
   }

   public static boolean _/* $FF was: ԭ*/(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   public static boolean _/* $FF was: ԫ*/(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9';
   }

   static {
      String[] var1;
      for(char var0 = 0; var0 < (var1 = Ϳ).length; ++var0) {
         var1[var0] = String.valueOf(var0);
      }

   }
}
