package lu.die.foza.SleepyFox;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

public class ʴ {
   public static final String Ϳ = "";
   public static final int Ԩ = -1;
   public static final int ԩ = 8192;
   public static final Pattern Ԫ = Pattern.compile("\\s+");

   public static boolean _/* $FF was: ՠ*/(CharSequence var0) {
      return var0 == null || var0.length() == 0;
   }

   public static boolean ֏(CharSequence var0) {
      return ՠ(var0) ^ true;
   }

   public static boolean _/* $FF was: ԯ*/(CharSequence var0) {
      int var1;
      if (var0 != null && (var1 = var0.length()) != 0) {
         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isWhitespace(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public static boolean _/* $FF was: ֈ*/(CharSequence var0) {
      return ԯ(var0) ^ true;
   }

   public static String ރ(String var0) {
      return var0 == null ? null : var0.trim();
   }

   public static String ޅ(String var0) {
      if (ՠ((CharSequence)(var0 = ރ(var0)))) {
         var0 = null;
      }

      return var0;
   }

   public static String ބ(String var0) {
      return var0 == null ? "" : var0.trim();
   }

   public static String _/* $FF was: ׯ*/(String var0) {
      return ׯ((String)var0, (String)null);
   }

   public static String ށ(String var0) {
      if (var0 == null) {
         return null;
      } else {
         if ((var0 = ׯ((String)var0, (String)null)).length() == 0) {
            var0 = null;
         }

         return var0;
      }
   }

   public static String ހ(String var0) {
      return var0 == null ? "" : ׯ((String)var0, (String)null);
   }

   public static String _/* $FF was: ׯ*/(String var0, String var1) {
      return ՠ((CharSequence)var0) ? var0 : ؠ(ހ(var0, var1), var1);
   }

   public static String ހ(String var0, String var1) {
      int var2;
      if (var0 != null && (var2 = var0.length()) != 0) {
         int var3 = 0;
         if (var1 == null) {
            while(var3 != var2 && Character.isWhitespace(var0.charAt(var3))) {
               ++var3;
            }
         } else {
            if (var1.length() == 0) {
               return var0;
            }

            while(var3 != var2 && var1.indexOf(var0.charAt(var3)) != -1) {
               ++var3;
            }
         }

         return var0.substring(var3);
      } else {
         return var0;
      }
   }

   public static String ؠ(String var0, String var1) {
      int var2;
      if (var0 != null && (var2 = var0.length()) != 0) {
         if (var1 == null) {
            while(var2 != 0 && Character.isWhitespace(var0.charAt(var2 - 1))) {
               --var2;
            }
         } else {
            if (var1.length() == 0) {
               return var0;
            }

            while(var2 != 0 && var1.indexOf(var0.charAt(var2 - 1)) != -1) {
               --var2;
            }
         }

         return var0.substring(0, var2);
      } else {
         return var0;
      }
   }

   public static String[] _/* $FF was: Ԩ*/(String... var0) {
      return Ϳ((String[])var0, (String)null);
   }

   public static String[] _/* $FF was: Ϳ*/(String[] var0, String var1) {
      int var2;
      if (var0 != null && (var2 = var0.length) != 0) {
         String[] var3 = new String[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = ׯ(var0[var4], var1);
         }

         return var3;
      } else {
         return var0;
      }
   }

   public static String ؠ(String var0) {
      String var1 = "The stripAccents(CharSequence) method requires at least Java6, but got: ";
      if (var0 == null) {
         return null;
      } else {
         IllegalArgumentException var28;
         label79: {
            IllegalAccessException var27;
            label78: {
               InvocationTargetException var26;
               label77: {
                  SecurityException var10000;
                  label84: {
                     boolean var10001;
                     Method var29;
                     try {
                        var29 = ʴ.Ϳ.ԫ;
                     } catch (IllegalArgumentException var18) {
                        var28 = var18;
                        var10001 = false;
                        break label79;
                     } catch (IllegalAccessException var19) {
                        var27 = var19;
                        var10001 = false;
                        break label78;
                     } catch (InvocationTargetException var20) {
                        var26 = var20;
                        var10001 = false;
                        break label77;
                     } catch (SecurityException var21) {
                        var10000 = var21;
                        var10001 = false;
                        break label84;
                     }

                     String var30;
                     if (var29 != null) {
                        try {
                           var30 = ނ((CharSequence)var0);
                        } catch (IllegalArgumentException var10) {
                           var28 = var10;
                           var10001 = false;
                           break label79;
                        } catch (IllegalAccessException var11) {
                           var27 = var11;
                           var10001 = false;
                           break label78;
                        } catch (InvocationTargetException var12) {
                           var26 = var12;
                           var10001 = false;
                           break label77;
                        } catch (SecurityException var13) {
                           var10000 = var13;
                           var10001 = false;
                           break label84;
                        }
                     } else {
                        try {
                           var29 = ʴ.Ϳ.Ԩ;
                        } catch (IllegalArgumentException var14) {
                           var28 = var14;
                           var10001 = false;
                           break label79;
                        } catch (IllegalAccessException var15) {
                           var27 = var15;
                           var10001 = false;
                           break label78;
                        } catch (InvocationTargetException var16) {
                           var26 = var16;
                           var10001 = false;
                           break label77;
                        } catch (SecurityException var17) {
                           var10000 = var17;
                           var10001 = false;
                           break label84;
                        }

                        if (var29 == null) {
                           try {
                              throw new UnsupportedOperationException(var1 + ʴ.Ϳ.Ԫ + "; or a Sun JVM: " + ʴ.Ϳ.Ϳ);
                           } catch (IllegalArgumentException var2) {
                              var28 = var2;
                              var10001 = false;
                              break label79;
                           } catch (IllegalAccessException var3) {
                              var27 = var3;
                              var10001 = false;
                              break label78;
                           } catch (InvocationTargetException var4) {
                              var26 = var4;
                              var10001 = false;
                              break label77;
                           } catch (SecurityException var5) {
                              var10000 = var5;
                              var10001 = false;
                              break label84;
                           }
                        }

                        try {
                           var30 = ރ((CharSequence)var0);
                        } catch (IllegalArgumentException var6) {
                           var28 = var6;
                           var10001 = false;
                           break label79;
                        } catch (IllegalAccessException var7) {
                           var27 = var7;
                           var10001 = false;
                           break label78;
                        } catch (InvocationTargetException var8) {
                           var26 = var8;
                           var10001 = false;
                           break label77;
                        } catch (SecurityException var9) {
                           var10000 = var9;
                           var10001 = false;
                           break label84;
                        }
                     }

                     var0 = var30;
                     return var0;
                  }

                  SecurityException var22 = var10000;
                  throw new RuntimeException("SecurityException occurred", var22);
               }

               InvocationTargetException var23 = var26;
               throw new RuntimeException("InvocationTargetException occurred", var23);
            }

            IllegalAccessException var24 = var27;
            throw new RuntimeException("IllegalAccessException occurred", var24);
         }

         IllegalArgumentException var25 = var28;
         throw new RuntimeException("IllegalArgumentException occurred", var25);
      }
   }

   public static String ނ(CharSequence var0) throws IllegalAccessException, InvocationTargetException {
      Object var1;
      if (ʴ.Ϳ.ԫ != null && (var1 = ʴ.Ϳ.Ԭ) != null) {
         return ʴ.Ϳ.ԭ.matcher((String)ʴ.Ϳ.ԫ.invoke((Object)null, var0, var1)).replaceAll("");
      } else {
         throw new IllegalStateException("java.text.Normalizer is not available", ʴ.Ϳ.Ԫ);
      }
   }

   public static String ރ(CharSequence var0) throws IllegalAccessException, InvocationTargetException {
      if (ʴ.Ϳ.Ԩ != null) {
         Method var10000 = ʴ.Ϳ.Ԩ;
         Object[] var1;
         Object[] var10001 = var1 = new Object[3];
         var10001[0] = var0;
         var10001[1] = Boolean.FALSE;
         var10001[2] = 0;
         return ʴ.Ϳ.ԩ.matcher((String)var10000.invoke((Object)null, var1)).replaceAll("");
      } else {
         throw new IllegalStateException("sun.text.Normalizer is not available", ʴ.Ϳ.Ϳ);
      }
   }

   public static boolean _/* $FF was: ԯ*/(CharSequence var0, CharSequence var1) {
      return var0 == null ? var1 == null : var0.equals(var1);
   }

   public static boolean _/* $FF was: ՠ*/(CharSequence var0, CharSequence var1) {
      if (var0 != null && var1 != null) {
         CharSequence var10000 = var0;
         int var2 = Math.max(var0.length(), var1.length());
         return ސ.Ϳ(var10000, true, 0, var1, 0, var2);
      } else {
         return var0 == var1;
      }
   }

   public static int _/* $FF was: Ԩ*/(CharSequence var0, int var1) {
      return ՠ(var0) ? -1 : ސ.Ϳ(var0, var1, 0);
   }

   public static int _/* $FF was: Ϳ*/(CharSequence var0, int var1, int var2) {
      return ՠ(var0) ? -1 : ސ.Ϳ(var0, var1, var2);
   }

   public static int ֏(CharSequence var0, CharSequence var1) {
      return var0 != null && var1 != null ? ސ.Ϳ(var0, var1, 0) : -1;
   }

   public static int _/* $FF was: Ԩ*/(CharSequence var0, CharSequence var1, int var2) {
      return var0 != null && var1 != null ? ސ.Ϳ(var0, var1, var2) : -1;
   }

   public static int _/* $FF was: ԭ*/(CharSequence var0, CharSequence var1, int var2) {
      return Ϳ(var0, var1, var2, false);
   }

   public static int _/* $FF was: Ϳ*/(CharSequence var0, CharSequence var1, int var2, boolean var3) {
      if (var0 != null && var1 != null && var2 > 0) {
         if (var1.length() == 0) {
            return var3 ? var0.length() : 0;
         } else {
            int var4 = 0;
            int var5;
            if (var3) {
               var5 = var0.length();
            } else {
               var5 = -1;
            }

            do {
               if (var3) {
                  var5 = ސ.Ԩ(var0, var1, var5 - 1);
               } else {
                  var5 = ސ.Ϳ(var0, var1, var5 + 1);
               }

               if (var5 < 0) {
                  return var5;
               }
            } while(++var4 < var2);

            return var5;
         }
      } else {
         return -1;
      }
   }

   public static int ހ(CharSequence var0, CharSequence var1) {
      return ԩ((CharSequence)var0, (CharSequence)var1, 0);
   }

   public static int _/* $FF was: ԩ*/(CharSequence var0, CharSequence var1, int var2) {
      if (var0 != null && var1 != null) {
         if (var2 < 0) {
            var2 = 0;
         }

         int var3;
         if (var2 > (var3 = var0.length() - var1.length() + 1)) {
            return -1;
         } else if (var1.length() == 0) {
            return var2;
         } else {
            while(var2 < var3) {
               int var4 = var1.length();
               if (ސ.Ϳ(var0, true, var2, var1, 0, var4)) {
                  return var2;
               }

               ++var2;
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   public static int _/* $FF was: ԩ*/(CharSequence var0, int var1) {
      return ՠ(var0) ? -1 : ސ.Ԩ(var0, var1, var0.length());
   }

   public static int _/* $FF was: Ԩ*/(CharSequence var0, int var1, int var2) {
      return ՠ(var0) ? -1 : ސ.Ԩ(var0, var1, var2);
   }

   public static int ށ(CharSequence var0, CharSequence var1) {
      return var0 != null && var1 != null ? ސ.Ԩ(var0, var1, var0.length()) : -1;
   }

   public static int _/* $FF was: Ԭ*/(CharSequence var0, CharSequence var1, int var2) {
      return Ϳ(var0, var1, var2, true);
   }

   public static int _/* $FF was: Ԫ*/(CharSequence var0, CharSequence var1, int var2) {
      return var0 != null && var1 != null ? ސ.Ԩ(var0, var1, var2) : -1;
   }

   public static int ނ(CharSequence var0, CharSequence var1) {
      return var0 != null && var1 != null ? ԫ(var0, var1, var0.length()) : -1;
   }

   public static int _/* $FF was: ԫ*/(CharSequence var0, CharSequence var1, int var2) {
      if (var0 != null && var1 != null) {
         if (var2 > var0.length() - var1.length()) {
            var2 = var0.length() - var1.length();
         }

         if (var2 < 0) {
            return -1;
         } else if (var1.length() == 0) {
            return var2;
         } else {
            while(var2 >= 0) {
               int var3 = var1.length();
               if (ސ.Ϳ(var0, true, var2, var1, 0, var3)) {
                  return var2;
               }

               --var2;
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0, int var1) {
      if (ՠ(var0)) {
         return false;
      } else {
         return ސ.Ϳ(var0, var1, 0) >= 0;
      }
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0, CharSequence var1) {
      if (var0 != null && var1 != null) {
         return ސ.Ϳ(var0, var1, 0) >= 0;
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: ԩ*/(CharSequence var0, CharSequence var1) {
      if (var0 != null && var1 != null) {
         int var2 = var1.length();
         int var3 = var0.length() - var2;

         for(int var4 = 0; var4 <= var3; ++var4) {
            if (ސ.Ϳ(var0, true, var4, var1, 0, var2)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0) {
      if (ՠ(var0)) {
         return false;
      } else {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (Character.isWhitespace(var0.charAt(var2))) {
               return true;
            }
         }

         return false;
      }
   }

   public static int _/* $FF was: Ԫ*/(CharSequence var0, char... var1) {
      if (!ՠ(var0) && !ކ.Ԩ(var1)) {
         int var2;
         int var3 = (var2 = var0.length()) - 1;
         int var4;
         int var5 = (var4 = var1.length) - 1;

         for(int var6 = 0; var6 < var2; ++var6) {
            char var7 = var0.charAt(var6);

            for(int var8 = 0; var8 < var4; ++var8) {
               if (var1[var8] == var7) {
                  if (var6 >= var3 || var8 >= var5 || !Character.isHighSurrogate(var7)) {
                     return var6;
                  }

                  if (var1[var8 + 1] == var0.charAt(var6 + 1)) {
                     return var6;
                  }
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static int _/* $FF was: ԩ*/(CharSequence var0, String var1) {
      return !ՠ(var0) && !ՠ((CharSequence)var1) ? Ԫ(var0, var1.toCharArray()) : -1;
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0, char... var1) {
      if (!ՠ(var0) && !ކ.Ԩ(var1)) {
         int var2 = var0.length();
         int var3;
         int var10000 = var3 = var1.length;
         int var4 = var2 - 1;
         int var5 = var10000 - 1;

         for(int var6 = 0; var6 < var2; ++var6) {
            char var7 = var0.charAt(var6);

            for(int var8 = 0; var8 < var3; ++var8) {
               if (var1[var8] == var7) {
                  if (!Character.isHighSurrogate(var7)) {
                     return true;
                  }

                  if (var8 == var5) {
                     return true;
                  }

                  if (var6 < var4 && var1[var8 + 1] == var0.charAt(var6 + 1)) {
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(CharSequence var0, CharSequence var1) {
      return var1 == null ? false : Ϳ(var0, ސ.Ϳ(var1));
   }

   public static int _/* $FF was: ԫ*/(CharSequence var0, char... var1) {
      if (!ՠ(var0) && !ކ.Ԩ(var1)) {
         int var2;
         int var3 = (var2 = var0.length()) - 1;
         int var4;
         int var5 = (var4 = var1.length) - 1;

         label38:
         for(int var6 = 0; var6 < var2; ++var6) {
            char var7 = var0.charAt(var6);

            for(int var8 = 0; var8 < var4; ++var8) {
               if (var1[var8] == var7 && (var6 >= var3 || var8 >= var5 || !Character.isHighSurrogate(var7) || var1[var8 + 1] == var0.charAt(var6 + 1))) {
                  continue label38;
               }
            }

            return var6;
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static int _/* $FF was: ׯ*/(CharSequence var0, CharSequence var1) {
      if (!ՠ(var0) && !ՠ(var1)) {
         int var2 = var0.length();

         int var6;
         for(int var3 = 0; var3 < var2; var3 = var6) {
            char var4;
            boolean var5;
            if (ސ.Ϳ(var1, var4 = var0.charAt(var3), 0) >= 0) {
               var5 = true;
            } else {
               var5 = false;
            }

            if ((var6 = var3 + 1) < var2 && Character.isHighSurrogate(var4)) {
               var4 = var0.charAt(var6);
               if (var5 && ސ.Ϳ(var1, var4, 0) < 0) {
                  return var3;
               }
            } else if (!var5) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static boolean _/* $FF was: ԩ*/(CharSequence var0, char... var1) {
      if (var1 != null && var0 != null) {
         if (var0.length() == 0) {
            return true;
         } else if (var1.length == 0) {
            return false;
         } else {
            return ԫ(var0, var1) == -1;
         }
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(CharSequence var0, String var1) {
      return var0 != null && var1 != null ? ԩ(var0, var1.toCharArray()) : false;
   }

   public static boolean _/* $FF was: Ԩ*/(CharSequence var0, char... var1) {
      if (var0 != null && var1 != null) {
         int var2;
         int var3 = (var2 = var0.length()) - 1;
         int var4;
         int var5 = (var4 = var1.length) - 1;

         for(int var6 = 0; var6 < var2; ++var6) {
            char var7 = var0.charAt(var6);

            for(int var8 = 0; var8 < var4; ++var8) {
               if (var1[var8] == var7) {
                  if (!Character.isHighSurrogate(var7)) {
                     return false;
                  }

                  if (var8 == var5) {
                     return false;
                  }

                  if (var6 < var3 && var1[var8 + 1] == var0.charAt(var6 + 1)) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0, String var1) {
      return var0 != null && var1 != null ? Ԩ(var0, var1.toCharArray()) : true;
   }

   public static int _/* $FF was: Ԩ*/(CharSequence var0, CharSequence... var1) {
      if (var0 != null && var1 != null) {
         int var2 = var1.length;
         int var3 = Integer.MAX_VALUE;

         for(int var4 = 0; var4 < var2; ++var4) {
            CharSequence var5;
            int var6;
            if ((var5 = var1[var4]) != null && (var6 = ސ.Ϳ(var0, var5, 0)) != -1 && var6 < var3) {
               var3 = var6;
            }
         }

         if (var3 == Integer.MAX_VALUE) {
            var3 = -1;
         }

         return var3;
      } else {
         return -1;
      }
   }

   public static int _/* $FF was: ԩ*/(CharSequence var0, CharSequence... var1) {
      if (var0 != null && var1 != null) {
         int var2 = var1.length;
         int var3 = -1;

         for(int var4 = 0; var4 < var2; ++var4) {
            CharSequence var5;
            int var6;
            if ((var5 = var1[var4]) != null && (var6 = ސ.Ԩ(var0, var5, var0.length())) > var3) {
               var3 = var6;
            }
         }

         return var3;
      } else {
         return -1;
      }
   }

   public static String _/* $FF was: Ԯ*/(String var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 < 0) {
            var1 += var0.length();
         }

         if (var1 < 0) {
            var1 = 0;
         }

         return var1 > var0.length() ? "" : var0.substring(var1);
      }
   }

   public static String _/* $FF was: ԩ*/(String var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var2 < 0) {
            var2 += var0.length();
         }

         if (var1 < 0) {
            var1 += var0.length();
         }

         if (var2 > var0.length()) {
            var2 = var0.length();
         }

         if (var1 > var2) {
            return "";
         } else {
            if (var1 < 0) {
               var1 = 0;
            }

            if (var2 < 0) {
               var2 = 0;
            }

            return var0.substring(var1, var2);
         }
      }
   }

   public static String _/* $FF was: ԩ*/(String var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 < 0) {
         return "";
      } else {
         return var0.length() <= var1 ? var0 : var0.substring(0, var1);
      }
   }

   public static String _/* $FF was: Ԭ*/(String var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 < 0) {
         return "";
      } else {
         return var0.length() <= var1 ? var0 : var0.substring(var0.length() - var1);
      }
   }

   public static String _/* $FF was: Ԩ*/(String var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else if (var2 >= 0 && var1 <= var0.length()) {
         if (var1 < 0) {
            var1 = 0;
         }

         return var0.length() <= (var2 += var1) ? var0.substring(var1) : var0.substring(var1, var2);
      } else {
         return "";
      }
   }

   public static String ރ(String var0, String var1) {
      if (!ՠ((CharSequence)var0) && var1 != null) {
         if (var1.length() == 0) {
            return "";
         } else {
            int var2;
            return (var2 = var0.indexOf(var1)) == -1 ? var0 : var0.substring(0, var2);
         }
      } else {
         return var0;
      }
   }

   public static String ށ(String var0, String var1) {
      if (ՠ((CharSequence)var0)) {
         return var0;
      } else if (var1 == null) {
         return "";
      } else {
         int var2;
         return (var2 = var0.indexOf(var1)) == -1 ? "" : var0.substring(var1.length() + var2);
      }
   }

   public static String ބ(String var0, String var1) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1)) {
         int var2;
         return (var2 = var0.lastIndexOf(var1)) == -1 ? var0 : var0.substring(0, var2);
      } else {
         return var0;
      }
   }

   public static String ނ(String var0, String var1) {
      if (ՠ((CharSequence)var0)) {
         return var0;
      } else if (ՠ((CharSequence)var1)) {
         return "";
      } else {
         int var2;
         return (var2 = var0.lastIndexOf(var1)) != -1 && var2 != var0.length() - var1.length() ? var0.substring(var1.length() + var2) : "";
      }
   }

   public static String ޅ(String var0, String var1) {
      return Ԫ(var0, var1, var1);
   }

   public static String _/* $FF was: Ԫ*/(String var0, String var1, String var2) {
      if (var0 != null && var1 != null && var2 != null) {
         int var3;
         int var4;
         return (var3 = var0.indexOf(var1)) != -1 && (var4 = var0.indexOf(var2, var1.length() + var3)) != -1 ? var0.substring(var1.length() + var3, var4) : null;
      } else {
         return null;
      }
   }

   public static String[] _/* $FF was: ԫ*/(String var0, String var1, String var2) {
      if (var0 != null && !ՠ((CharSequence)var1) && !ՠ((CharSequence)var2)) {
         int var3;
         if ((var3 = var0.length()) == 0) {
            return ކ.ԩ;
         } else {
            int var4 = var2.length();
            int var5 = var1.length();
            ArrayList var6;
            var6 = new ArrayList.<init>();

            int var8;
            for(int var7 = 0; var7 < var3 - var4 && (var7 = var0.indexOf(var1, var7)) >= 0; var7 = var8 + var4) {
               var7 += var5;
               if ((var8 = var0.indexOf(var2, var7)) < 0) {
                  break;
               }

               var6.add(var0.substring(var7, var8));
            }

            return var6.isEmpty() ? null : (String[])var6.toArray(new String[var6.size()]);
         }
      } else {
         return null;
      }
   }

   public static String[] _/* $FF was: ԯ*/(String var0) {
      return Ԩ(var0, (String)null, -1, false);
   }

   public static String[] _/* $FF was: ԩ*/(String var0, char var1) {
      return Ϳ(var0, var1, false);
   }

   public static String[] _/* $FF was: ԯ*/(String var0, String var1) {
      return Ԩ(var0, var1, -1, false);
   }

   public static String[] _/* $FF was: ԩ*/(String var0, String var1, int var2) {
      return Ԩ(var0, var1, var2, false);
   }

   public static String[] _/* $FF was: ՠ*/(String var0, String var1) {
      return Ϳ((String)var0, (String)var1, -1, false);
   }

   public static String[] _/* $FF was: Ԫ*/(String var0, String var1, int var2) {
      return Ϳ(var0, var1, var2, false);
   }

   public static String[] _/* $FF was: ֈ*/(String var0, String var1) {
      return Ϳ((String)var0, (String)var1, -1, true);
   }

   public static String[] _/* $FF was: ԫ*/(String var0, String var1, int var2) {
      return Ϳ(var0, var1, var2, true);
   }

   public static String[] _/* $FF was: Ϳ*/(String var0, String var1, int var2, boolean var3) {
      if (var0 == null) {
         return null;
      } else {
         int var4;
         if ((var4 = var0.length()) == 0) {
            return ކ.ԩ;
         } else if (var1 != null && !"".equals(var1)) {
            int var5 = var1.length();
            ArrayList var6;
            var6 = new ArrayList.<init>();
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;

            while(true) {
               while(var9 < var4) {
                  if ((var9 = var0.indexOf(var1, var8)) > -1) {
                     if (var9 <= var8) {
                        if (var3) {
                           if (++var7 == var2) {
                              var6.add(var0.substring(var8));
                              var9 = var4;
                           } else {
                              var6.add("");
                           }
                        }

                        var8 = var9 + var5;
                        continue;
                     }

                     if (++var7 != var2) {
                        var6.add(var0.substring(var8, var9));
                        var8 = var9 + var5;
                        continue;
                     }
                  }

                  var6.add(var0.substring(var8));
                  var9 = var4;
               }

               return (String[])var6.toArray(new String[var6.size()]);
            }
         } else {
            return Ԩ(var0, (String)null, var2, var3);
         }
      }
   }

   public static String[] ֏(String var0) {
      return Ԩ(var0, (String)null, -1, true);
   }

   public static String[] _/* $FF was: Ԫ*/(String var0, char var1) {
      return Ϳ(var0, var1, true);
   }

   public static String[] _/* $FF was: Ϳ*/(String var0, char var1, boolean var2) {
      if (var0 == null) {
         return null;
      } else {
         int var3;
         if ((var3 = var0.length()) == 0) {
            return ކ.ԩ;
         } else {
            ArrayList var4;
            var4 = new ArrayList.<init>();
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            boolean var8 = false;

            while(true) {
               while(var5 < var3) {
                  if (var0.charAt(var5) == var1) {
                     if (var7 || var2) {
                        var4.add(var0.substring(var6, var5));
                        boolean var9 = false;
                        var7 = true;
                        var8 = var7;
                        var7 = var9;
                     }

                     var6 = var5 + 1;
                     var5 = var6;
                  } else {
                     var8 = false;
                     var7 = true;
                     ++var5;
                  }
               }

               if (var7 || var2 && var8) {
                  var4.add(var0.substring(var6, var5));
               }

               return (String[])var4.toArray(new String[var4.size()]);
            }
         }
      }
   }

   public static String[] ֏(String var0, String var1) {
      return Ԩ(var0, var1, -1, true);
   }

   public static String[] _/* $FF was: Ԭ*/(String var0, String var1, int var2) {
      return Ԩ(var0, var1, var2, true);
   }

   public static String[] _/* $FF was: Ԩ*/(String var0, String var1, int var2, boolean var3) {
      if (var0 == null) {
         return null;
      } else {
         int var4;
         if ((var4 = var0.length()) == 0) {
            return ކ.ԩ;
         } else {
            ArrayList var5;
            var5 = new ArrayList.<init>();
            int var6 = 1;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = false;
            boolean var10 = false;
            boolean var13;
            int var10000;
            if (var1 != null) {
               if (var1.length() != 1) {
                  label86:
                  while(true) {
                     while(true) {
                        if (var7 >= var4) {
                           break label86;
                        }

                        if (var1.indexOf(var0.charAt(var7)) >= 0) {
                           if (var9 || var3) {
                              var10000 = var6;
                              var9 = true;
                              ++var6;
                              if (var10000 == var2) {
                                 var9 = false;
                                 var7 = var4;
                              }

                              var5.add(var0.substring(var8, var7));
                              var13 = false;
                              var10 = var9;
                              var9 = var13;
                           }

                           var8 = var7 + 1;
                           var7 = var8;
                        } else {
                           var10 = false;
                           var9 = true;
                           ++var7;
                        }
                     }
                  }
               } else {
                  char var12 = var1.charAt(0);

                  label70:
                  while(true) {
                     while(true) {
                        if (var7 >= var4) {
                           break label70;
                        }

                        if (var0.charAt(var7) == var12) {
                           if (var9 || var3) {
                              var10000 = var6;
                              var9 = true;
                              ++var6;
                              if (var10000 == var2) {
                                 var9 = false;
                                 var7 = var4;
                              }

                              var5.add(var0.substring(var8, var7));
                              var13 = false;
                              var10 = var9;
                              var9 = var13;
                           }

                           var8 = var7 + 1;
                           var7 = var8;
                        } else {
                           var10 = false;
                           var9 = true;
                           ++var7;
                        }
                     }
                  }
               }
            } else {
               label102:
               while(true) {
                  while(true) {
                     if (var7 >= var4) {
                        break label102;
                     }

                     if (Character.isWhitespace(var0.charAt(var7))) {
                        if (var9 || var3) {
                           var10000 = var6;
                           boolean var11 = true;
                           ++var6;
                           if (var10000 == var2) {
                              var11 = false;
                              var7 = var4;
                           }

                           var5.add(var0.substring(var8, var7));
                           var13 = false;
                           var10 = var11;
                           var9 = var13;
                        }

                        var8 = var7 + 1;
                        var7 = var8;
                     } else {
                        var10 = false;
                        var9 = true;
                        ++var7;
                     }
                  }
               }
            }

            if (var9 || var3 && var10) {
               var5.add(var0.substring(var8, var7));
            }

            return (String[])var5.toArray(new String[var5.size()]);
         }
      }
   }

   public static String[] _/* $FF was: ՠ*/(String var0) {
      return Ϳ(var0, false);
   }

   public static String[] _/* $FF was: ֈ*/(String var0) {
      return Ϳ(var0, true);
   }

   public static String[] _/* $FF was: Ϳ*/(String var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length() == 0) {
         return ކ.ԩ;
      } else {
         char[] var9;
         char[] var10000 = var9 = var0.toCharArray();
         ArrayList var2;
         var2 = new ArrayList.<init>();
         int var3 = 0;
         int var4 = Character.getType(var10000[0]);

         for(int var5 = 1; var5 < var9.length; ++var5) {
            int var6;
            if ((var6 = Character.getType(var9[var5])) != var4) {
               String var10001;
               if (var1 && var6 == 2 && var4 == 1) {
                  if ((var4 = var5 - 1) != var3) {
                     String var11;
                     var10001 = var11 = new String;
                     int var8 = var4 - var3;
                     var10001.<init>(var9, var3, var8);
                     var2.add(var11);
                     var3 = var4;
                  }
               } else {
                  String var10;
                  var10001 = var10 = new String;
                  int var7 = var5 - var3;
                  var10001.<init>(var9, var3, var7);
                  var2.add(var10);
                  var3 = var5;
               }

               var4 = var6;
            }
         }

         var2.add(new String(var9, var3, var9.length - var3));
         return (String[])var2.toArray(new String[var2.size()]);
      }
   }

   public static <T> String _/* $FF was: Ϳ*/(T... var0) {
      return Ϳ((Object[])var0, (String)null);
   }

   public static String _/* $FF was: Ϳ*/(Object[] var0, char var1) {
      return var0 == null ? null : Ϳ(var0, var1, 0, var0.length);
   }

   public static String _/* $FF was: Ϳ*/(Object[] var0, char var1, int var2, int var3) {
      if (var0 == null) {
         return null;
      } else {
         int var4;
         if ((var4 = var3 - var2) <= 0) {
            return "";
         } else {
            StringBuilder var5;
            var5 = new StringBuilder.<init>(var4 * 16);

            for(var4 = var2; var4 < var3; ++var4) {
               if (var4 > var2) {
                  var5.append(var1);
               }

               Object var6;
               if ((var6 = var0[var4]) != null) {
                  var5.append(var6);
               }
            }

            return var5.toString();
         }
      }
   }

   public static String _/* $FF was: Ϳ*/(Object[] var0, String var1) {
      return var0 == null ? null : Ϳ((Object[])var0, var1, 0, var0.length);
   }

   public static String _/* $FF was: Ϳ*/(Object[] var0, String var1, int var2, int var3) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 == null) {
            var1 = "";
         }

         int var4;
         if ((var4 = var3 - var2) <= 0) {
            return "";
         } else {
            StringBuilder var5;
            var5 = new StringBuilder.<init>(var4 * 16);

            for(var4 = var2; var4 < var3; ++var4) {
               if (var4 > var2) {
                  var5.append(var1);
               }

               Object var6;
               if ((var6 = var0[var4]) != null) {
                  var5.append(var6);
               }
            }

            return var5.toString();
         }
      }
   }

   public static String _/* $FF was: Ϳ*/(Iterator<?> var0, char var1) {
      if (var0 == null) {
         return null;
      } else if (!var0.hasNext()) {
         return "";
      } else {
         Object var2 = var0.next();
         if (!var0.hasNext()) {
            return ၻ.ԫ(var2);
         } else {
            StringBuilder var3;
            var3 = new StringBuilder.<init>(256);
            if (var2 != null) {
               var3.append(var2);
            }

            while(true) {
               do {
                  if (!var0.hasNext()) {
                     return var3.toString();
                  }

                  var3.append(var1);
               } while((var2 = var0.next()) == null);

               var3.append(var2);
            }
         }
      }
   }

   public static String _/* $FF was: Ϳ*/(Iterator<?> var0, String var1) {
      if (var0 == null) {
         return null;
      } else if (!var0.hasNext()) {
         return "";
      } else {
         Object var2 = var0.next();
         if (!var0.hasNext()) {
            return ၻ.ԫ(var2);
         } else {
            StringBuilder var3;
            var3 = new StringBuilder.<init>(256);
            if (var2 != null) {
               var3.append(var2);
            }

            while(true) {
               do {
                  if (!var0.hasNext()) {
                     return var3.toString();
                  }

                  if (var1 != null) {
                     var3.append(var1);
                  }
               } while((var2 = var0.next()) == null);

               var3.append(var2);
            }
         }
      }
   }

   public static String _/* $FF was: Ϳ*/(Iterable<?> var0, char var1) {
      return var0 == null ? null : Ϳ(var0.iterator(), var1);
   }

   public static String _/* $FF was: Ϳ*/(Iterable<?> var0, String var1) {
      return var0 == null ? null : Ϳ(var0.iterator(), var1);
   }

   public static String _/* $FF was: ԫ*/(String var0) {
      if (ՠ((CharSequence)var0)) {
         return var0;
      } else {
         int var1;
         char[] var2 = new char[var1 = var0.length()];
         int var3 = 0;

         for(int var4 = 0; var4 < var1; ++var4) {
            if (!Character.isWhitespace(var0.charAt(var4))) {
               int var5 = var3 + 1;
               var2[var3] = var0.charAt(var4);
               var3 = var5;
            }
         }

         if (var3 == var1) {
            return var0;
         } else {
            return new String(var2, 0, var3);
         }
      }
   }

   public static String _/* $FF was: ԭ*/(String var0, String var1) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1)) {
         return var0.startsWith(var1) ? var0.substring(var1.length()) : var0;
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: Ԯ*/(String var0, String var1) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1)) {
         return Ԩ(var0, var1, true) ? var0.substring(var1.length()) : var0;
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: ԫ*/(String var0, String var1) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1)) {
         return var0.endsWith(var1) ? var0.substring(0, var0.length() - var1.length()) : var0;
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: Ԭ*/(String var0, String var1) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1)) {
         return Ϳ(var0, var1, true) ? var0.substring(0, var0.length() - var1.length()) : var0;
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: Ԫ*/(String var0, String var1) {
      return !ՠ((CharSequence)var0) && !ՠ((CharSequence)var1) ? Ϳ(var0, var1, "", -1) : var0;
   }

   public static String _/* $FF was: Ϳ*/(String var0, char var1) {
      if (!ՠ((CharSequence)var0) && var0.indexOf(var1) != -1) {
         char[] var6 = var0.toCharArray();
         int var2 = 0;

         for(int var3 = 0; var3 < var6.length; ++var3) {
            char var4;
            if ((var4 = var6[var3]) != var1) {
               int var5 = var2 + 1;
               var6[var2] = var4;
               var2 = var5;
            }
         }

         return new String(var6, 0, var2);
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: ԩ*/(String var0, String var1, String var2) {
      return Ϳ(var0, var1, var2, 1);
   }

   public static String _/* $FF was: Ϳ*/(String var0, String var1, String var2) {
      return Ϳ(var0, var1, var2, -1);
   }

   public static String _/* $FF was: Ϳ*/(String var0, String var1, String var2, int var3) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1) && var2 != null && var3 != 0) {
         int var4 = 0;
         int var5;
         if ((var5 = var0.indexOf(var1, var4)) == -1) {
            return var0;
         } else {
            int var6 = var1.length();
            int var7;
            if ((var7 = var2.length() - var6) < 0) {
               var7 = 0;
            }

            int var8;
            if (var3 < 0) {
               var8 = 16;
            } else if (var3 > 64) {
               var8 = 64;
            } else {
               var8 = var3;
            }

            var7 *= var8;
            StringBuilder var9;
            var9 = new StringBuilder.<init>(var0.length() + var7);

            while(var5 != -1) {
               var9.append(var0.substring(var4, var5)).append(var2);
               var4 = var5 + var6;
               if ((var3 += -1) == 0) {
                  break;
               }

               var5 = var0.indexOf(var1, var4);
            }

            var9.append(var0.substring(var4));
            return var9.toString();
         }
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: Ϳ*/(String var0, String[] var1, String[] var2) {
      return Ϳ(var0, var1, var2, false, 0);
   }

   public static String _/* $FF was: Ԩ*/(String var0, String[] var1, String[] var2) {
      int var3;
      if (var1 == null) {
         var3 = 0;
      } else {
         var3 = var1.length;
      }

      return Ϳ(var0, var1, var2, true, var3);
   }

   public static String _/* $FF was: Ϳ*/(String var0, String[] var1, String[] var2, boolean var3, int var4) {
      if (var0 != null && var0.length() != 0 && var1 != null && var1.length != 0 && var2 != null && var2.length != 0) {
         if (var4 < 0) {
            throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
         } else {
            int var5;
            int var6;
            if ((var5 = var1.length) != (var6 = var2.length)) {
               throw new IllegalArgumentException("Search and Replace array lengths don't match: " + var5 + " vs " + var6);
            } else {
               boolean[] var14 = new boolean[var5];
               int var7 = -1;
               int var8 = -1;

               int var9;
               int var15;
               for(var9 = 0; var9 < var5; ++var9) {
                  String var10;
                  if (!var14[var9] && (var10 = var1[var9]) != null && var10.length() != 0 && var2[var9] != null) {
                     if ((var15 = var0.indexOf(var1[var9])) == -1) {
                        var14[var9] = true;
                     } else if (var7 == -1 || var15 < var7) {
                        var8 = var9;
                        var7 = var15;
                     }
                  }
               }

               if (var7 == -1) {
                  return var0;
               } else {
                  var9 = 0;
                  var15 = 0;

                  String var12;
                  int var17;
                  for(int var11 = 0; var11 < var1.length; ++var11) {
                     if (var1[var11] != null && (var12 = var2[var11]) != null && (var17 = var12.length() - var1[var11].length()) > 0) {
                        var15 += var17 * 3;
                     }
                  }

                  var15 = Math.min(var15, var0.length() / 5);
                  StringBuilder var16;
                  var16 = new StringBuilder.<init>(var0.length() + var15);

                  while(var7 != -1) {
                     while(var9 < var7) {
                        var16.append(var0.charAt(var9));
                        ++var9;
                     }

                     var16.append(var2[var8]);
                     var9 = var1[var8].length() + var7;
                     var7 = -1;
                     var8 = -1;

                     for(var15 = 0; var15 < var5; ++var15) {
                        if (!var14[var15] && (var12 = var1[var15]) != null && var12.length() != 0 && var2[var15] != null) {
                           if ((var17 = var0.indexOf(var1[var15], var9)) == -1) {
                              var14[var15] = true;
                           } else if (var7 == -1 || var17 < var7) {
                              var8 = var15;
                              var7 = var17;
                           }
                        }
                     }
                  }

                  for(var5 = var0.length(); var9 < var5; ++var9) {
                     var16.append(var0.charAt(var9));
                  }

                  var0 = var16.toString();
                  if (!var3) {
                     return var0;
                  } else {
                     int var13 = var4 - 1;
                     return Ϳ(var0, var1, var2, var3, var13);
                  }
               }
            }
         }
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: Ϳ*/(String var0, char var1, char var2) {
      return var0 == null ? null : var0.replace(var1, var2);
   }

   public static String _/* $FF was: Ԩ*/(String var0, String var1, String var2) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1)) {
         if (var2 == null) {
            var2 = "";
         }

         boolean var3 = false;
         int var4 = var2.length();
         int var5 = var0.length();
         StringBuilder var6;
         var6 = new StringBuilder.<init>(var5);

         for(int var7 = 0; var7 < var5; ++var7) {
            char var8;
            int var9;
            if ((var9 = var1.indexOf(var8 = var0.charAt(var7))) >= 0) {
               var3 = true;
               if (var9 < var4) {
                  var6.append(var2.charAt(var9));
               }
            } else {
               var6.append(var8);
            }
         }

         if (var3) {
            return var6.toString();
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: Ϳ*/(String var0, String var1, int var2, int var3) {
      if (var0 == null) {
         return null;
      } else {
         if (var1 == null) {
            var1 = "";
         }

         int var4 = var0.length();
         if (var2 < 0) {
            var2 = 0;
         }

         if (var2 > var4) {
            var2 = var4;
         }

         if (var3 < 0) {
            var3 = 0;
         }

         if (var3 > var4) {
            var3 = var4;
         }

         if (var2 > var3) {
            int var10000 = var3;
            var3 = var2;
            var2 = var10000;
         }

         var4 = var4 + var2 - var3;
         return (new StringBuilder(var1.length() + var4 + 1)).append(var0.substring(0, var2)).append(var1).append(var0.substring(var3)).toString();
      }
   }

   public static String _/* $FF was: Ԩ*/(String var0) {
      if (ՠ((CharSequence)var0)) {
         return var0;
      } else if (var0.length() == 1) {
         char var3;
         return (var3 = var0.charAt(0)) != '\r' && var3 != '\n' ? var0 : "";
      } else {
         int var1;
         char var2;
         if ((var2 = var0.charAt(var1 = var0.length() - 1)) == '\n') {
            if (var0.charAt(var1 - 1) == '\r') {
               --var1;
            }
         } else if (var2 != '\r') {
            ++var1;
         }

         return var0.substring(0, var1);
      }
   }

   /** @deprecated */
   @Deprecated
   public static String _/* $FF was: Ϳ*/(String var0, String var1) {
      return ԫ(var0, var1);
   }

   public static String _/* $FF was: ԩ*/(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1;
         if ((var1 = var0.length()) < 2) {
            return "";
         } else {
            int var2 = var1 - 1;
            String var3 = var0.substring(0, var2);
            return var0.charAt(var2) == '\n' && var3.charAt(--var2) == '\r' ? var3.substring(0, var2) : var3;
         }
      }
   }

   public static String _/* $FF was: ԫ*/(String var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 <= 0) {
         return "";
      } else {
         int var2 = var0.length();
         if (var1 != 1 && var2 != 0) {
            if (var2 == 1 && var1 <= 8192) {
               return Ϳ(var0.charAt(0), var1);
            } else {
               int var3 = var2 * var1;
               if (var2 == 1) {
                  return Ϳ(var0.charAt(0), var1);
               } else if (var2 != 2) {
                  StringBuilder var7;
                  var7 = new StringBuilder.<init>(var3);

                  for(var3 = 0; var3 < var1; ++var3) {
                     var7.append(var0);
                  }

                  return var7.toString();
               } else {
                  char var4 = var0.charAt(0);
                  char var5 = var0.charAt(1);
                  char[] var6 = new char[var3];

                  for(var3 = var1 * 2 - 2; var3 >= 0; var3 = var3 + -1 + -1) {
                     var6[var3] = var4;
                     var6[var3 + 1] = var5;
                  }

                  return new String(var6);
               }
            }
         } else {
            return var0;
         }
      }
   }

   public static String _/* $FF was: Ԩ*/(String var0, String var1, int var2) {
      return var0 != null && var1 != null ? ԫ(ԫ(var0.concat(var1), var2), var1) : ԫ(var0, var2);
   }

   public static String _/* $FF was: Ϳ*/(char var0, int var1) {
      char[] var3 = new char[var1];

      for(int var2 = var1 - 1; var2 >= 0; --var2) {
         var3[var2] = var0;
      }

      return new String(var3);
   }

   public static String _/* $FF was: ԭ*/(String var0, int var1) {
      return ԩ(var0, var1, ' ');
   }

   public static String _/* $FF was: ԩ*/(String var0, int var1, char var2) {
      if (var0 == null) {
         return null;
      } else {
         int var3;
         if ((var3 = var1 - var0.length()) <= 0) {
            return var0;
         } else {
            return var3 > 8192 ? ԩ(var0, var1, String.valueOf(var2)) : var0.concat(Ϳ(var2, var3));
         }
      }
   }

   public static String _/* $FF was: ԩ*/(String var0, int var1, String var2) {
      if (var0 == null) {
         return null;
      } else {
         if (ՠ((CharSequence)var2)) {
            var2 = " ";
         }

         int var3 = var2.length();
         int var4;
         if ((var4 = var1 - var0.length()) <= 0) {
            return var0;
         } else if (var3 == 1 && var4 <= 8192) {
            return ԩ(var0, var1, var2.charAt(0));
         } else if (var4 == var3) {
            return var0.concat(var2);
         } else if (var4 < var3) {
            return var0.concat(var2.substring(0, var4));
         } else {
            char[] var6 = new char[var4];
            char[] var7 = var2.toCharArray();

            for(int var5 = 0; var5 < var4; ++var5) {
               var6[var5] = var7[var5 % var3];
            }

            return var0.concat(new String(var6));
         }
      }
   }

   public static String _/* $FF was: Ԫ*/(String var0, int var1) {
      return Ԩ(var0, var1, ' ');
   }

   public static String _/* $FF was: Ԩ*/(String var0, int var1, char var2) {
      if (var0 == null) {
         return null;
      } else {
         int var3;
         if ((var3 = var1 - var0.length()) <= 0) {
            return var0;
         } else {
            return var3 > 8192 ? Ԩ(var0, var1, String.valueOf(var2)) : Ϳ(var2, var3).concat(var0);
         }
      }
   }

   public static String _/* $FF was: Ԩ*/(String var0, int var1, String var2) {
      if (var0 == null) {
         return null;
      } else {
         if (ՠ((CharSequence)var2)) {
            var2 = " ";
         }

         int var3 = var2.length();
         int var4;
         if ((var4 = var1 - var0.length()) <= 0) {
            return var0;
         } else if (var3 == 1 && var4 <= 8192) {
            return Ԩ(var0, var1, var2.charAt(0));
         } else if (var4 == var3) {
            return var2.concat(var0);
         } else if (var4 < var3) {
            return var2.substring(0, var4).concat(var0);
         } else {
            char[] var6 = new char[var4];
            char[] var7 = var2.toCharArray();

            for(int var5 = 0; var5 < var4; ++var5) {
               var6[var5] = var7[var5 % var3];
            }

            return (new String(var6)).concat(var0);
         }
      }
   }

   public static int ށ(CharSequence var0) {
      return var0 == null ? 0 : var0.length();
   }

   public static String _/* $FF was: Ԩ*/(String var0, int var1) {
      return Ϳ(var0, var1, ' ');
   }

   public static String _/* $FF was: Ϳ*/(String var0, int var1, char var2) {
      if (var0 != null && var1 > 0) {
         int var3;
         int var4;
         return (var4 = var1 - (var3 = var0.length())) <= 0 ? var0 : ԩ(Ԩ(var0, var4 / 2 + var3, var2), var1, var2);
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: Ϳ*/(String var0, int var1, String var2) {
      if (var0 != null && var1 > 0) {
         if (ՠ((CharSequence)var2)) {
            var2 = " ";
         }

         int var3;
         int var4;
         return (var4 = var1 - (var3 = var0.length())) <= 0 ? var0 : ԩ(Ԩ(var0, var4 / 2 + var3, var2), var1, var2);
      } else {
         return var0;
      }
   }

   public static String އ(String var0) {
      return var0 == null ? null : var0.toUpperCase();
   }

   public static String _/* $FF was: Ԩ*/(String var0, Locale var1) {
      return var0 == null ? null : var0.toUpperCase(var1);
   }

   public static String _/* $FF was: Ԭ*/(String var0) {
      return var0 == null ? null : var0.toLowerCase();
   }

   public static String _/* $FF was: Ϳ*/(String var0, Locale var1) {
      return var0 == null ? null : var0.toLowerCase(var1);
   }

   public static String _/* $FF was: Ϳ*/(String var0) {
      int var1;
      return var0 != null && (var1 = var0.length()) != 0 ? (new StringBuilder(var1)).append(Character.toTitleCase(var0.charAt(0))).append(var0.substring(1)).toString() : var0;
   }

   public static String ކ(String var0) {
      int var1;
      return var0 != null && (var1 = var0.length()) != 0 ? (new StringBuilder(var1)).append(Character.toLowerCase(var0.charAt(0))).append(var0.substring(1)).toString() : var0;
   }

   public static String ނ(String var0) {
      if (ՠ((CharSequence)var0)) {
         return var0;
      } else {
         char[] var3 = var0.toCharArray();

         for(int var1 = 0; var1 < var3.length; ++var1) {
            char var2;
            if (Character.isUpperCase(var2 = var3[var1])) {
               var3[var1] = Character.toLowerCase(var2);
            } else if (Character.isTitleCase(var2)) {
               var3[var1] = Character.toLowerCase(var2);
            } else if (Character.isLowerCase(var2)) {
               var3[var1] = Character.toUpperCase(var2);
            }
         }

         return new String(var3);
      }
   }

   public static int _/* $FF was: Ԫ*/(CharSequence var0, CharSequence var1) {
      if (!ՠ(var0) && !ՠ(var1)) {
         int var2 = 0;

         for(int var3 = 0; (var3 = ސ.Ϳ(var0, var1, var3)) != -1; var3 += var1.length()) {
            ++var2;
         }

         return var2;
      } else {
         return 0;
      }
   }

   public static boolean _/* $FF was: Ԫ*/(CharSequence var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isLetter(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: ԫ*/(CharSequence var0) {
      if (var0 == null) {
         return false;
      } else {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isLetter(var0.charAt(var2)) && var0.charAt(var2) != ' ') {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean _/* $FF was: Ԭ*/(CharSequence var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isLetterOrDigit(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: ԭ*/(CharSequence var0) {
      if (var0 == null) {
         return false;
      } else {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isLetterOrDigit(var0.charAt(var2)) && var0.charAt(var2) != ' ') {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean _/* $FF was: Ԯ*/(CharSequence var0) {
      if (var0 == null) {
         return false;
      } else {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!ޑ.Ԯ(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean _/* $FF was: ׯ*/(CharSequence var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isDigit(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean ؠ(CharSequence var0) {
      if (var0 == null) {
         return false;
      } else {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isDigit(var0.charAt(var2)) && var0.charAt(var2) != ' ') {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean ހ(CharSequence var0) {
      if (var0 == null) {
         return false;
      } else {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isWhitespace(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean _/* $FF was: Ԩ*/(CharSequence var0) {
      if (var0 != null && !ՠ(var0)) {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isLowerCase(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: ԩ*/(CharSequence var0) {
      if (var0 != null && !ՠ(var0)) {
         int var1 = var0.length();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isUpperCase(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static String _/* $FF was: Ԫ*/(String var0) {
      if (var0 == null) {
         var0 = "";
      }

      return var0;
   }

   public static String _/* $FF was: Ԩ*/(String var0, String var1) {
      if (var0 == null) {
         var0 = var1;
      }

      return var0;
   }

   public static <T extends CharSequence> T _/* $FF was: ԫ*/(T var0, T var1) {
      if (ԯ(var0)) {
         var0 = var1;
      }

      return var0;
   }

   public static <T extends CharSequence> T _/* $FF was: Ԭ*/(T var0, T var1) {
      if (ՠ(var0)) {
         var0 = var1;
      }

      return var0;
   }

   public static String _/* $FF was: Ԯ*/(String var0) {
      return var0 == null ? null : (new StringBuilder(var0)).reverse().toString();
   }

   public static String _/* $FF was: Ԩ*/(String var0, char var1) {
      if (var0 == null) {
         return null;
      } else {
         String[] var10000 = Ϳ(var0, var1, false);
         ކ.ԫ((Object[])var10000);
         return Ϳ((Object[])var10000, (char)var1);
      }
   }

   public static String _/* $FF was: Ϳ*/(String var0, int var1) {
      return Ϳ((String)var0, (int)0, (int)var1);
   }

   public static String _/* $FF was: Ϳ*/(String var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else if (var2 >= 4) {
         if (var0.length() <= var2) {
            return var0;
         } else {
            if (var1 > var0.length()) {
               var1 = var0.length();
            }

            int var3;
            if (var0.length() - var1 < (var3 = var2 - 3)) {
               var1 = var0.length() - var3;
            }

            if (var1 <= 4) {
               return var0.substring(0, var3) + "...";
            } else if (var2 >= 7) {
               StringBuilder var10000;
               if (var1 + var2 - 3 < var0.length()) {
                  StringBuilder var4;
                  var10000 = var4 = new StringBuilder;
                  var4.<init>("...");
                  return var10000.append(Ϳ((String)var0.substring(var1), (int)0, (int)var3)).toString();
               } else {
                  StringBuilder var5;
                  var10000 = var5 = new StringBuilder;
                  var5.<init>("...");
                  return var10000.append(var0.substring(var0.length() - var3)).toString();
               }
            } else {
               throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
            }
         }
      } else {
         throw new IllegalArgumentException("Minimum abbreviation width is 4");
      }
   }

   public static String _/* $FF was: Ϳ*/(String var0, String var1, int var2) {
      if (!ՠ((CharSequence)var0) && !ՠ((CharSequence)var1)) {
         if (var2 < var0.length() && var2 >= var1.length() + 2) {
            int var10001 = var2 - var1.length();
            int var3 = var10001 / 2;
            int var4 = var10001 % 2 + var3;
            var3 = var0.length() - var3;
            StringBuilder var5;
            StringBuilder var10000 = var5 = new StringBuilder;
            var5.<init>(var2);
            var5.append(var0.substring(0, var4));
            var5.append(var1);
            var10000.append(var0.substring(var3));
            return var10000.toString();
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static String _/* $FF was: ԩ*/(String var0, String var1) {
      if (var0 == null) {
         return var1;
      } else if (var1 == null) {
         return var0;
      } else {
         int var2;
         return (var2 = ؠ((CharSequence)var0, (CharSequence)var1)) == -1 ? "" : var1.substring(var2);
      }
   }

   public static int ؠ(CharSequence var0, CharSequence var1) {
      if (var0 == var1) {
         return -1;
      } else if (var0 != null && var1 != null) {
         int var2;
         for(var2 = 0; var2 < var0.length() && var2 < var1.length() && var0.charAt(var2) == var1.charAt(var2); ++var2) {
         }

         return var2 >= var1.length() && var2 >= var0.length() ? -1 : var2;
      } else {
         return 0;
      }
   }

   public static int _/* $FF was: Ϳ*/(CharSequence... var0) {
      if (var0 != null && var0.length > 1) {
         boolean var1 = false;
         boolean var2 = true;
         int var3 = var0.length;
         int var4 = Integer.MAX_VALUE;
         int var5 = 0;

         for(int var6 = 0; var6 < var3; ++var6) {
            CharSequence var7;
            if ((var7 = var0[var6]) == null) {
               var1 = true;
               var4 = 0;
            } else {
               var2 = false;
               var4 = Math.min(var7.length(), var4);
               var5 = Math.max(var0[var6].length(), var5);
            }
         }

         if (var2 || var5 == 0 && !var1) {
            return -1;
         } else if (var4 == 0) {
            return 0;
         } else {
            int var8 = -1;

            for(int var9 = 0; var9 < var4; ++var9) {
               char var10 = var0[0].charAt(var9);

               for(int var11 = 1; var11 < var3; ++var11) {
                  if (var0[var11].charAt(var9) != var10) {
                     var8 = var9;
                     break;
                  }
               }

               if (var8 != -1) {
                  break;
               }
            }

            return var8 == -1 && var4 != var5 ? var4 : var8;
         }
      } else {
         return -1;
      }
   }

   public static String _/* $FF was: Ϳ*/(String... var0) {
      if (var0 != null && var0.length != 0) {
         int var1;
         if ((var1 = Ϳ((CharSequence[])var0)) == -1) {
            String var2;
            return (var2 = var0[0]) == null ? "" : var2;
         } else {
            return var1 == 0 ? "" : var0[0].substring(0, var1);
         }
      } else {
         return "";
      }
   }

   public static int _/* $FF was: ֈ*/(CharSequence var0, CharSequence var1) {
      if (var0 != null && var1 != null) {
         int var2;
         int var10000 = var2 = var0.length();
         int var3 = var1.length();
         if (var10000 == 0) {
            return var3;
         } else if (var3 == 0) {
            return var2;
         } else {
            if (var2 > var3) {
               var2 = var0.length();
               var10000 = var3;
               var3 = var2;
               var2 = var10000;
            } else {
               CharSequence var11 = var1;
               var1 = var0;
               var0 = var11;
            }

            var10000 = var2 + 1;
            int[] var4 = new int[var2 + 1];
            int[] var5 = new int[var10000];

            int var6;
            for(var6 = 0; var6 <= var2; var4[var6] = var6++) {
            }

            int[] var12;
            for(var6 = 1; var6 <= var3; var4 = var12) {
               char var7 = var0.charAt(var6 - 1);
               var5[0] = var6;

               for(int var8 = 1; var8 <= var2; ++var8) {
                  int var9;
                  byte var10;
                  if (var1.charAt(var9 = var8 - 1) == var7) {
                     var10 = 0;
                  } else {
                     var10 = 1;
                  }

                  var5[var8] = Math.min(Math.min(var5[var9] + 1, var4[var8] + 1), var4[var9] + var10);
               }

               ++var6;
               var12 = var5;
               var5 = var4;
            }

            return var4[var2];
         }
      } else {
         throw new IllegalArgumentException("Strings must not be null");
      }
   }

   public static int _/* $FF was: Ϳ*/(CharSequence var0, CharSequence var1, int var2) {
      if (var0 != null && var1 != null) {
         if (var2 < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
         } else {
            int var3;
            int var10000 = var3 = var0.length();
            int var4 = var1.length();
            if (var10000 == 0) {
               if (var4 > var2) {
                  var4 = -1;
               }

               return var4;
            } else if (var4 == 0) {
               if (var3 > var2) {
                  var3 = -1;
               }

               return var3;
            } else {
               if (var3 > var4) {
                  var3 = var0.length();
                  var10000 = var4;
                  var4 = var3;
                  var3 = var10000;
               } else {
                  CharSequence var14 = var1;
                  var1 = var0;
                  var0 = var14;
               }

               int var10002 = var3 + 1;
               int var5;
               int[] var6 = new int[var5 = var3 + 1];
               int[] var7 = new int[var10002];
               int var8 = Math.min(var3, var2) + 1;

               int var9;
               for(var9 = 0; var9 < var8; var6[var9] = var9++) {
               }

               Arrays.fill(var6, var8, var5, Integer.MAX_VALUE);
               Arrays.fill(var7, Integer.MAX_VALUE);

               int[] var15;
               for(var5 = 1; var5 <= var4; var6 = var15) {
                  char var13 = var0.charAt(var5 - 1);
                  var7[0] = var5;
                  int var10;
                  if ((var9 = Math.max(1, var5 - var2)) > (var10 = Math.min(var3, var5 + var2))) {
                     return -1;
                  }

                  if (var9 > 1) {
                     var7[var9 - 1] = Integer.MAX_VALUE;
                  }

                  for(; var9 <= var10; ++var9) {
                     int var11;
                     if (var1.charAt(var11 = var9 - 1) == var13) {
                        var7[var9] = var6[var11];
                     } else {
                        var7[var9] = Math.min(Math.min(var7[var11], var6[var9]), var6[var11]) + 1;
                     }
                  }

                  ++var5;
                  var15 = var7;
                  var7 = var6;
               }

               int var12;
               if ((var12 = var6[var3]) <= var2) {
                  return var12;
               } else {
                  return -1;
               }
            }
         }
      } else {
         throw new IllegalArgumentException("Strings must not be null");
      }
   }

   public static boolean ރ(CharSequence var0, CharSequence var1) {
      return Ԩ(var0, var1, false);
   }

   public static boolean ބ(CharSequence var0, CharSequence var1) {
      return Ԩ(var0, var1, true);
   }

   public static boolean _/* $FF was: Ԩ*/(CharSequence var0, CharSequence var1, boolean var2) {
      if (var0 != null && var1 != null) {
         if (var1.length() > var0.length()) {
            return false;
         } else {
            CharSequence var10000 = var0;
            int var3 = var1.length();
            return ސ.Ϳ(var10000, var2, 0, var1, 0, var3);
         }
      } else {
         return var0 == null && var1 == null;
      }
   }

   public static boolean _/* $FF was: Ԫ*/(CharSequence var0, CharSequence... var1) {
      if (!ՠ(var0) && !ކ.Ԩ((Object[])var1)) {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            if (Ԩ(var0, var1[var3], false)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: ԭ*/(CharSequence var0, CharSequence var1) {
      return Ϳ(var0, var1, false);
   }

   public static boolean _/* $FF was: Ԯ*/(CharSequence var0, CharSequence var1) {
      return Ϳ(var0, var1, true);
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0, CharSequence var1, boolean var2) {
      if (var0 != null && var1 != null) {
         if (var1.length() > var0.length()) {
            return false;
         } else {
            CharSequence var10000 = var0;
            boolean var10001 = var2;
            int var3 = var0.length() - var1.length();
            int var4 = var1.length();
            return ސ.Ϳ(var10000, var10001, var3, var1, 0, var4);
         }
      } else {
         return var0 == null && var1 == null;
      }
   }

   public static String _/* $FF was: ԭ*/(String var0) {
      return var0 == null ? null : Ԫ.matcher(ރ(var0)).replaceAll(" ");
   }

   public static boolean _/* $FF was: Ϳ*/(CharSequence var0, CharSequence... var1) {
      if (!ՠ(var0) && !ކ.Ԩ((Object[])var1)) {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            if (Ϳ(var0, var1[var3], false)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static String _/* $FF was: Ϳ*/(byte[] var0, String var1) throws UnsupportedEncodingException {
      if (var1 == null) {
         var1 = new String.<init>(var0);
      } else {
         String var2;
         var2 = new String.<init>(var0, var1);
         var1 = var2;
      }

      return var1;
   }

   public static class Ϳ {
      public static final Throwable Ϳ;
      public static final Method Ԩ;
      public static final Pattern ԩ;
      public static final Throwable Ԫ;
      public static final Method ԫ;
      public static final Object Ԭ;
      public static final Pattern ԭ;

      // $FF: synthetic method
      public static Throwable _/* $FF was: ԩ*/() {
         return Ԫ;
      }

      // $FF: synthetic method
      public static Throwable _/* $FF was: Ԫ*/() {
         return Ϳ;
      }

      // $FF: synthetic method
      public static Object _/* $FF was: ԫ*/() {
         return Ԭ;
      }

      // $FF: synthetic method
      public static Pattern _/* $FF was: Ԭ*/() {
         return ԭ;
      }

      // $FF: synthetic method
      public static Pattern _/* $FF was: ԭ*/() {
         return ԩ;
      }

      static {
         ԭ = ԩ = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
         Object var0 = null;
         Method var1 = null;
         Method var2 = null;
         Exception var3 = null;
         Exception var4 = null;

         label77: {
            Method var18;
            label81: {
               Class var14;
               Exception var10000;
               String var16;
               boolean var10001;
               Class[] var10002;
               Class[] var10003;
               Class[] var10004;
               byte var10005;
               label82: {
                  try {
                     var14 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label82;
                  }

                  Class var5 = var14;

                  Object var15;
                  try {
                     var15 = var14.getField("NFD").get((Object)null);
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break label82;
                  }

                  var0 = var15;

                  try {
                     var14 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer");
                     var16 = "normalize";
                     var10002 = new Class[2];
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label82;
                  }

                  var10003 = var10002;
                  var10004 = var10002;
                  var10005 = 0;

                  try {
                     var10004[var10005] = CharSequence.class;
                     var10003[1] = var5;
                     var18 = var14.getMethod(var16, var10002);
                     break label81;
                  } catch (Exception var10) {
                     var10000 = var10;
                     var10001 = false;
                  }
               }

               var3 = var10000;

               label57: {
                  label83: {
                     try {
                        var14 = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer");
                        var16 = "decompose";
                        var10002 = new Class[3];
                     } catch (Exception var9) {
                        var10000 = var9;
                        var10001 = false;
                        break label83;
                     }

                     var10003 = var10002;
                     var10004 = var10002;
                     Class[] var19 = var10002;
                     byte var10006 = 0;

                     try {
                        var19[var10006] = String.class;
                     } catch (Exception var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label83;
                     }

                     var10005 = 1;

                     try {
                        var10004[var10005] = Boolean.TYPE;
                     } catch (Exception var7) {
                        var10000 = var7;
                        var10001 = false;
                        break label83;
                     }

                     byte var17 = 2;

                     try {
                        var10003[var17] = Integer.TYPE;
                        var18 = var14.getMethod(var16, var10002);
                        break label57;
                     } catch (Exception var6) {
                        var10000 = var6;
                        var10001 = false;
                     }
                  }

                  var4 = var10000;
                  break label77;
               }

               var2 = var18;
               break label77;
            }

            var1 = var18;
         }

         Ԫ = var3;
         Ԭ = var0;
         ԫ = var1;
         Ϳ = var4;
         Ԩ = var2;
      }
   }
}
