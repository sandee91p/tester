package lu.die.foza.SleepyFox;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class ޒ {
   public static final char Ϳ = '.';
   public static final String Ԩ = String.valueOf('.');
   public static final char ԩ = '$';
   public static final String Ԫ = String.valueOf('$');
   public static final Map<Class<?>, Class<?>> ԫ;
   public static final Map<Class<?>, Class<?>> Ԭ;
   public static final Map<String, String> ԭ;
   public static final Map<String, String> Ԯ;

   public static void _/* $FF was: Ϳ*/(String var0, String var1) {
      ԭ.put(var0, var1);
      Ԯ.put(var1, var0);
   }

   public static String _/* $FF was: Ԫ*/(Object var0, String var1) {
      return var0 == null ? var1 : Ԭ(var0.getClass());
   }

   public static String _/* $FF was: Ԭ*/(Class<?> var0) {
      return var0 == null ? "" : Ԭ(var0.getName());
   }

   public static String _/* $FF was: Ԭ*/(String var0) {
      if (var0 == null) {
         return "";
      } else if (var0.length() == 0) {
         return "";
      } else {
         StringBuilder var1;
         var1 = new StringBuilder.<init>();
         if (var0.startsWith("[")) {
            while(var0.charAt(0) == '[') {
               var0 = var0.substring(1);
               var1.append("[]");
            }

            if (var0.charAt(0) == 'L' && var0.charAt(var0.length() - 1) == ';') {
               var0 = var0.substring(1, var0.length() - 1);
            }
         }

         Map var2;
         if ((var2 = Ԯ).containsKey(var0)) {
            var0 = (String)var2.get(var0);
         }

         int var5;
         int var10000 = var5 = var0.lastIndexOf(46);
         byte var3 = 36;
         int var4;
         if (var10000 == -1) {
            var4 = 0;
         } else {
            var4 = var5 + 1;
         }

         var10000 = var0.indexOf(var3, var4);
         var0 = var0.substring(var5 + 1);
         if (var10000 != -1) {
            var0 = var0.replace('$', '.');
         }

         return var0 + var1;
      }
   }

   public static String _/* $FF was: ԭ*/(Class<?> var0) {
      return var0 == null ? "" : var0.getSimpleName();
   }

   public static String _/* $FF was: ԫ*/(Object var0, String var1) {
      return var0 == null ? var1 : ԭ(var0.getClass());
   }

   public static String _/* $FF was: Ԩ*/(Object var0, String var1) {
      return var0 == null ? var1 : Ԫ(var0.getClass());
   }

   public static String _/* $FF was: Ԫ*/(Class<?> var0) {
      return var0 == null ? "" : Ԫ(var0.getName());
   }

   public static String _/* $FF was: Ԫ*/(String var0) {
      if (var0 != null && var0.length() != 0) {
         while(var0.charAt(0) == '[') {
            var0 = var0.substring(1);
         }

         if (var0.charAt(0) == 'L' && var0.charAt(var0.length() - 1) == ';') {
            var0 = var0.substring(1);
         }

         int var1;
         return (var1 = var0.lastIndexOf(46)) == -1 ? "" : var0.substring(0, var1);
      } else {
         return "";
      }
   }

   public static List<Class<?>> _/* $FF was: Ԩ*/(Class<?> var0) {
      if (var0 == null) {
         return null;
      } else {
         Class var10000 = var0;
         ArrayList var2;
         var2 = new ArrayList.<init>();

         for(Class var1 = var10000.getSuperclass(); var1 != null; var1 = var1.getSuperclass()) {
            var2.add(var1);
         }

         return var2;
      }
   }

   public static List<Class<?>> _/* $FF was: Ϳ*/(Class<?> var0) {
      if (var0 == null) {
         return null;
      } else {
         Class var10000 = var0;
         LinkedHashSet var1;
         var1 = new LinkedHashSet.<init>();
         Ϳ((Class)var10000, (HashSet)var1);
         return new ArrayList(var1);
      }
   }

   public static void _/* $FF was: Ϳ*/(Class<?> var0, HashSet<Class<?>> var1) {
      while(var0 != null) {
         Class[] var2;
         int var3 = (var2 = var0.getInterfaces()).length;

         for(int var4 = 0; var4 < var3; ++var4) {
            Class var5;
            if (var1.add(var5 = var2[var4])) {
               Ϳ(var5, var1);
            }
         }

         var0 = var0.getSuperclass();
      }

   }

   public static List<Class<?>> _/* $FF was: Ϳ*/(List<String> var0) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var1;
         var1 = new ArrayList.<init>(var0.size());
         Iterator var3 = var0.iterator();

         while(var3.hasNext()) {
            ArrayList var10000 = var1;
            String var10001 = (String)var3.next();

            try {
               var10000.add(Class.forName(var10001));
            } catch (Exception var2) {
               var1.add((Object)null);
            }
         }

         return var1;
      }
   }

   public static List<String> _/* $FF was: Ԩ*/(List<Class<?>> var0) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var1;
         var1 = new ArrayList.<init>(var0.size());
         Iterator var3 = var0.iterator();

         while(var3.hasNext()) {
            Class var2;
            if ((var2 = (Class)var3.next()) == null) {
               var1.add((Object)null);
            } else {
               var1.add(var2.getName());
            }
         }

         return var1;
      }
   }

   public static boolean _/* $FF was: Ϳ*/(Class<?>[] var0, Class<?>... var1) {
      return Ϳ(var0, var1, ߴ.Ϳ(ၛ.JAVA_1_5));
   }

   public static boolean _/* $FF was: Ϳ*/(Class<?>[] var0, Class<?>[] var1, boolean var2) {
      if (!ކ.Ԩ((Object[])var0, (Object[])var1)) {
         return false;
      } else {
         if (var0 == null) {
            var0 = ކ.Ԩ;
         }

         if (var1 == null) {
            var1 = ކ.Ԩ;
         }

         for(int var3 = 0; var3 < var0.length; ++var3) {
            if (!Ϳ(var0[var3], var1[var3], var2)) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean _/* $FF was: ԯ*/(Class<?> var0) {
      if (var0 == null) {
         return false;
      } else {
         return var0.isPrimitive() || Ԭ.containsKey(var0);
      }
   }

   public static boolean _/* $FF was: ՠ*/(Class<?> var0) {
      return Ԭ.containsKey(var0);
   }

   public static boolean _/* $FF was: Ϳ*/(Class<?> var0, Class<?> var1) {
      return Ϳ(var0, var1, ߴ.Ϳ(ၛ.JAVA_1_5));
   }

   public static boolean _/* $FF was: Ϳ*/(Class<?> var0, Class<?> var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var0 == null) {
         return var1.isPrimitive() ^ true;
      } else {
         if (var2) {
            if (var0.isPrimitive() && !var1.isPrimitive() && (var0 = ֈ(var0)) == null) {
               return false;
            }

            if (var1.isPrimitive() && !var0.isPrimitive() && (var0 = ֏(var0)) == null) {
               return false;
            }
         }

         if (var0.equals(var1)) {
            return true;
         } else if (var0.isPrimitive()) {
            if (!var1.isPrimitive()) {
               return false;
            } else {
               Class var5;
               if ((var5 = Integer.TYPE).equals(var0)) {
                  return Long.TYPE.equals(var1) || Float.TYPE.equals(var1) || Double.TYPE.equals(var1);
               } else {
                  Class var3;
                  if ((var3 = Long.TYPE).equals(var0)) {
                     return Float.TYPE.equals(var1) || Double.TYPE.equals(var1);
                  } else if (Boolean.TYPE.equals(var0)) {
                     return false;
                  } else if (Double.TYPE.equals(var0)) {
                     return false;
                  } else {
                     Class var4;
                     if ((var4 = Float.TYPE).equals(var0)) {
                        return Double.TYPE.equals(var1);
                     } else if (Character.TYPE.equals(var0)) {
                        return var5.equals(var1) || var3.equals(var1) || var4.equals(var1) || Double.TYPE.equals(var1);
                     } else if (Short.TYPE.equals(var0)) {
                        return var5.equals(var1) || var3.equals(var1) || var4.equals(var1) || Double.TYPE.equals(var1);
                     } else if (!Byte.TYPE.equals(var0)) {
                        return false;
                     } else {
                        return Short.TYPE.equals(var1) || var5.equals(var1) || var3.equals(var1) || var4.equals(var1) || Double.TYPE.equals(var1);
                     }
                  }
               }
            }
         } else {
            return var1.isAssignableFrom(var0);
         }
      }
   }

   public static Class<?> _/* $FF was: ֈ*/(Class<?> var0) {
      if (var0 != null && var0.isPrimitive()) {
         var0 = (Class)ԫ.get(var0);
      }

      return var0;
   }

   public static Class<?>[] _/* $FF was: Ϳ*/(Class<?>... var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return var0;
      } else {
         Class[] var1 = new Class[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = ֈ(var0[var2]);
         }

         return var1;
      }
   }

   public static Class<?> ֏(Class<?> var0) {
      return (Class)Ԭ.get(var0);
   }

   public static Class<?>[] _/* $FF was: Ԩ*/(Class<?>... var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return var0;
      } else {
         Class[] var1 = new Class[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = ֏(var0[var2]);
         }

         return var1;
      }
   }

   public static boolean _/* $FF was: Ԯ*/(Class<?> var0) {
      return var0 != null && var0.getEnclosingClass() != null;
   }

   public static Class<?> _/* $FF was: Ϳ*/(ClassLoader var0, String var1, boolean var2) throws ClassNotFoundException {
      String var3 = "[";

      Class var20;
      label77: {
         ClassNotFoundException var10000;
         boolean var10001;
         label78: {
            Map var17;
            try {
               var17 = ԭ;
            } catch (ClassNotFoundException var13) {
               var10000 = var13;
               var10001 = false;
               break label78;
            }

            Map var4 = var17;

            boolean var18;
            try {
               var18 = var17.containsKey(var1);
            } catch (ClassNotFoundException var12) {
               var10000 = var12;
               var10001 = false;
               break label78;
            }

            if (var18) {
               label79: {
                  StringBuilder var19;
                  try {
                     var19 = new StringBuilder;
                  } catch (ClassNotFoundException var10) {
                     var10000 = var10;
                     var10001 = false;
                     break label79;
                  }

                  StringBuilder var5 = var19;

                  try {
                     var5.<init>(var3);
                     var20 = Class.forName(var19.append((String)var4.get(var1)).toString(), var2, var0).getComponentType();
                     break label77;
                  } catch (ClassNotFoundException var9) {
                     var10000 = var9;
                     var10001 = false;
                  }
               }
            } else {
               try {
                  var20 = Class.forName(ԭ(var1), var2, var0);
                  break label77;
               } catch (ClassNotFoundException var11) {
                  var10000 = var11;
                  var10001 = false;
               }
            }
         }

         ClassNotFoundException var15 = var10000;
         int var16;
         if ((var16 = var1.lastIndexOf(46)) != -1) {
            StringBuilder var22;
            ClassLoader var23;
            try {
               var23 = var0;
               var22 = new StringBuilder;
            } catch (ClassNotFoundException var8) {
               var10001 = false;
               throw var15;
            }

            StringBuilder var10002 = var22;

            try {
               var10002.<init>();
               var22 = var22.append(var1.substring(0, var16)).append('$');
            } catch (ClassNotFoundException var7) {
               var10001 = false;
               throw var15;
            }

            String var21 = var1;
            int var10003 = var16 + 1;

            try {
               return Ϳ(var23, var22.append(var21.substring(var10003)).toString(), var2);
            } catch (ClassNotFoundException var6) {
               var10001 = false;
            }
         }

         throw var15;
      }

      Class var14 = var20;
      return var14;
   }

   public static Class<?> _/* $FF was: Ϳ*/(ClassLoader var0, String var1) throws ClassNotFoundException {
      return Ϳ(var0, var1, true);
   }

   public static Class<?> _/* $FF was: Ԩ*/(String var0) throws ClassNotFoundException {
      return Ϳ(var0, true);
   }

   public static Class<?> _/* $FF was: Ϳ*/(String var0, boolean var1) throws ClassNotFoundException {
      ClassLoader var2;
      if ((var2 = Thread.currentThread().getContextClassLoader()) == null) {
         var2 = ޒ.class.getClassLoader();
      }

      return Ϳ(var2, var0, var1);
   }

   public static Method _/* $FF was: Ϳ*/(Class<?> var0, String var1, Class<?>... var2) throws SecurityException, NoSuchMethodException {
      Method var3;
      if (Modifier.isPublic((var3 = var0.getMethod(var1, var2)).getDeclaringClass().getModifiers())) {
         return var3;
      } else {
         ArrayList var6;
         ArrayList var10000 = var6 = new ArrayList;
         var6.<init>();
         var6.addAll(Ϳ(var0));
         var10000.addAll(Ԩ(var0));
         Iterator var5 = var10000.iterator();

         while(true) {
            Class var7;
            do {
               if (!var5.hasNext()) {
                  throw new NoSuchMethodException("Can't find a public method for " + var1 + " " + ކ.ԩ((Object)var2));
               }
            } while(!Modifier.isPublic((var7 = (Class)var5.next()).getModifiers()));

            Method var8;
            try {
               var8 = var7.getMethod(var1, var2);
            } catch (NoSuchMethodException var4) {
               continue;
            }

            var3 = var8;
            if (Modifier.isPublic(var8.getDeclaringClass().getModifiers())) {
               return var3;
            }
         }
      }
   }

   public static String _/* $FF was: ԭ*/(String var0) {
      if ((var0 = ʴ.ԫ(var0)) == null) {
         throw new NullPointerException("className must not be null.");
      } else {
         if (var0.endsWith("[]")) {
            StringBuilder var1;
            var1 = new StringBuilder.<init>();

            while(var0.endsWith("[]")) {
               var0 = var0.substring(0, var0.length() - 2);
               var1.append("[");
            }

            String var2;
            if ((var2 = (String)ԭ.get(var0)) != null) {
               var1.append(var2);
            } else {
               var1.append("L").append(var0).append(";");
            }

            var0 = var1.toString();
         }

         return var0;
      }
   }

   public static Class<?>[] _/* $FF was: Ϳ*/(Object... var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return ކ.Ԩ;
      } else {
         Class[] var1 = new Class[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            Object var3;
            Class var4;
            if ((var3 = var0[var2]) == null) {
               var4 = null;
            } else {
               var4 = var3.getClass();
            }

            var1[var2] = var4;
         }

         return var1;
      }
   }

   public static String _/* $FF was: ԩ*/(Object var0, String var1) {
      return var0 == null ? var1 : Ԭ(Ϳ(var0.getClass().getName()));
   }

   public static String _/* $FF was: ԫ*/(Class<?> var0) {
      return var0 == null ? "" : Ԭ(Ϳ(var0.getName()));
   }

   public static String _/* $FF was: ԫ*/(String var0) {
      return Ԭ(Ϳ(var0));
   }

   public static String _/* $FF was: Ϳ*/(Object var0, String var1) {
      return var0 == null ? var1 : Ԫ(Ϳ(var0.getClass().getName()));
   }

   public static String _/* $FF was: ԩ*/(Class<?> var0) {
      return var0 == null ? "" : Ԫ(Ϳ(var0.getName()));
   }

   public static String _/* $FF was: ԩ*/(String var0) {
      return Ԫ(Ϳ(var0));
   }

   public static String _/* $FF was: Ϳ*/(String var0) {
      if ((var0 = ʴ.ԫ(var0)) == null) {
         return null;
      } else {
         int var1;
         for(var1 = 0; var0.startsWith("["); var0 = var0.substring(1)) {
            ++var1;
         }

         if (var1 < 1) {
            return var0;
         } else {
            if (var0.startsWith("L")) {
               byte var2 = 1;
               int var3;
               if (var0.endsWith(";")) {
                  var3 = var0.length() - 1;
               } else {
                  var3 = var0.length();
               }

               var0 = var0.substring(var2, var3);
            } else if (var0.length() > 0) {
               var0 = (String)Ԯ.get(var0.substring(0, 1));
            }

            StringBuilder var5;
            var5 = new StringBuilder.<init>(var0);

            for(int var4 = 0; var4 < var1; ++var4) {
               var5.append("[]");
            }

            return var5.toString();
         }
      }
   }

   static {
      Map var10000 = ԫ = new HashMap();
      var10000.put(Boolean.TYPE, Boolean.class);
      var10000.put(Byte.TYPE, Byte.class);
      var10000.put(Character.TYPE, Character.class);
      var10000.put(Short.TYPE, Short.class);
      var10000.put(Integer.TYPE, Integer.class);
      var10000.put(Long.TYPE, Long.class);
      var10000.put(Double.TYPE, Double.class);
      var10000.put(Float.TYPE, Float.class);
      Class var10002 = Void.TYPE;
      var10000.put(var10002, var10002);
      Ԭ = new HashMap();
      Iterator var0 = var10000.keySet().iterator();

      while(var0.hasNext()) {
         Class var1;
         Class var2;
         if (!(var1 = (Class)var0.next()).equals(var2 = (Class)ԫ.get(var1))) {
            Ԭ.put(var2, var1);
         }
      }

      ԭ = new HashMap();
      Ԯ = new HashMap();
      Ϳ("int", "I");
      Ϳ("boolean", "Z");
      Ϳ("float", "F");
      Ϳ("long", "J");
      Ϳ("short", "S");
      Ϳ("byte", "B");
      Ϳ("double", "D");
      Ϳ("char", "C");
   }
}
