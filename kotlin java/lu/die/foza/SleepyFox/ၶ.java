package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ၶ {
   public static Object _/* $FF was: Ԩ*/(Object var0, String var1, Object... var2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      int var3;
      Class[] var4 = new Class[var3 = var2.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2[var5].getClass();
      }

      return Ԩ(var0, var1, var2, var4);
   }

   public static Object _/* $FF was: Ԩ*/(Object var0, String var1, Object[] var2, Class<?>[] var3) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var3 == null) {
         var3 = ކ.Ԩ;
      }

      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      Method var4;
      if ((var4 = Ԫ(var0.getClass(), var1, var3)) != null) {
         return var4.invoke(var0, var2);
      } else {
         throw new NoSuchMethodException("No such accessible method: " + var1 + "() on object: " + var0.getClass().getName());
      }
   }

   public static Object _/* $FF was: Ϳ*/(Object var0, String var1, Object... var2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      int var3;
      Class[] var4 = new Class[var3 = var2.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2[var5].getClass();
      }

      return Ϳ(var0, var1, var2, var4);
   }

   public static Object _/* $FF was: Ϳ*/(Object var0, String var1, Object[] var2, Class<?>[] var3) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      if (var3 == null) {
         var3 = ކ.Ԩ;
      }

      Method var4;
      if ((var4 = Ϳ(var0.getClass(), var1, var3)) != null) {
         return var4.invoke(var0, var2);
      } else {
         throw new NoSuchMethodException("No such accessible method: " + var1 + "() on object: " + var0.getClass().getName());
      }
   }

   public static Object _/* $FF was: Ϳ*/(Class<?> var0, String var1, Object[] var2, Class<?>[] var3) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      if (var3 == null) {
         var3 = ކ.Ԩ;
      }

      Method var4;
      if ((var4 = Ϳ(var0, var1, var3)) != null) {
         return var4.invoke((Object)null, var2);
      } else {
         throw new NoSuchMethodException("No such accessible method: " + var1 + "() on class: " + var0.getName());
      }
   }

   public static Object _/* $FF was: Ԩ*/(Class<?> var0, String var1, Object... var2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      int var3;
      Class[] var4 = new Class[var3 = var2.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2[var5].getClass();
      }

      return Ԩ(var0, var1, var2, var4);
   }

   public static Object _/* $FF was: Ԩ*/(Class<?> var0, String var1, Object[] var2, Class<?>[] var3) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var3 == null) {
         var3 = ކ.Ԩ;
      }

      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      Method var4;
      if ((var4 = Ԫ(var0, var1, var3)) != null) {
         return var4.invoke((Object)null, var2);
      } else {
         throw new NoSuchMethodException("No such accessible method: " + var1 + "() on class: " + var0.getName());
      }
   }

   public static Object _/* $FF was: Ϳ*/(Class<?> var0, String var1, Object... var2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      if (var2 == null) {
         var2 = ކ.Ϳ;
      }

      int var3;
      Class[] var4 = new Class[var3 = var2.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2[var5].getClass();
      }

      return Ϳ(var0, var1, var2, var4);
   }

   public static Method _/* $FF was: Ϳ*/(Class<?> var0, String var1, Class<?>... var2) {
      try {
         return Ϳ(var0.getMethod(var1, var2));
      } catch (NoSuchMethodException var3) {
         return null;
      }
   }

   public static Method _/* $FF was: Ϳ*/(Method var0) {
      if (!ၰ.Ϳ((Member)var0)) {
         return null;
      } else {
         Class var1;
         if (Modifier.isPublic((var1 = var0.getDeclaringClass()).getModifiers())) {
            return var0;
         } else {
            Method var10001 = var0;
            String var4 = var0.getName();
            Class[] var2 = var10001.getParameterTypes();
            Method var3;
            if ((var3 = Ԩ(var1, var4, var2)) == null) {
               var3 = ԩ(var1, var4, var2);
            }

            return var3;
         }
      }
   }

   public static Method _/* $FF was: ԩ*/(Class<?> var0, String var1, Class<?>... var2) {
      for(var0 = var0.getSuperclass(); var0 != null; var0 = var0.getSuperclass()) {
         if (Modifier.isPublic(var0.getModifiers())) {
            try {
               return var0.getMethod(var1, var2);
            } catch (NoSuchMethodException var3) {
               return null;
            }
         }
      }

      return null;
   }

   public static Method _/* $FF was: Ԩ*/(Class<?> var0, String var1, Class<?>... var2) {
      Method var3;
      for(var3 = null; var0 != null; var0 = var0.getSuperclass()) {
         Class[] var4 = var0.getInterfaces();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if (Modifier.isPublic(var4[var5].getModifiers())) {
               label34: {
                  Method var10000;
                  try {
                     var10000 = var4[var5].getDeclaredMethod(var1, var2);
                  } catch (NoSuchMethodException var6) {
                     break label34;
                  }

                  var3 = var10000;
               }

               if (var3 != null || (var3 = Ԩ(var4[var5], var1, var2)) != null) {
                  break;
               }
            }
         }
      }

      return var3;
   }

   public static Method _/* $FF was: Ԫ*/(Class<?> var0, String var1, Class<?>... var2) {
      try {
         Method var9 = var0.getMethod(var1, var2);
         ၰ.Ϳ((AccessibleObject)var9);
         return var9;
      } catch (NoSuchMethodException var7) {
         Method var8 = null;
         Method[] var3;
         int var4 = (var3 = var0.getMethods()).length;

         for(int var5 = 0; var5 < var4; ++var5) {
            Method var6;
            if ((var6 = var3[var5]).getName().equals(var1) && ޒ.Ϳ(var2, var6.getParameterTypes(), true) && (var6 = Ϳ(var6)) != null && (var8 == null || ၰ.Ϳ(var6.getParameterTypes(), var8.getParameterTypes(), var2) < 0)) {
               var8 = var6;
            }
         }

         if (var8 != null) {
            ၰ.Ϳ((AccessibleObject)var8);
         }

         return var8;
      }
   }
}
