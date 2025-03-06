package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public abstract class ၰ {
   public static final int Ϳ = 7;
   public static final Class<?>[] Ԩ;

   public static void _/* $FF was: Ϳ*/(AccessibleObject var0) {
      if (var0 != null && !var0.isAccessible()) {
         Member var1;
         if (Modifier.isPublic((var1 = (Member)var0).getModifiers()) && Ϳ(var1.getDeclaringClass().getModifiers())) {
            try {
               var0.setAccessible(true);
            } catch (SecurityException var2) {
            }
         }

      }
   }

   public static boolean _/* $FF was: Ϳ*/(int var0) {
      return (var0 & 7) == 0;
   }

   public static boolean _/* $FF was: Ϳ*/(Member var0) {
      return var0 != null && Modifier.isPublic(var0.getModifiers()) && !var0.isSynthetic();
   }

   public static int _/* $FF was: Ϳ*/(Class<?>[] var0, Class<?>[] var1, Class<?>[] var2) {
      float var3;
      float var4;
      return (var3 = Ϳ(var2, var0)) < (var4 = Ϳ(var2, var1)) ? -1 : (var4 < var3 ? 1 : 0);
   }

   public static float _/* $FF was: Ϳ*/(Class<?>[] var0, Class<?>[] var1) {
      float var2 = 0.0F;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var2 += Ϳ(var0[var3], var1[var3]);
      }

      return var2;
   }

   public static float _/* $FF was: Ϳ*/(Class<?> var0, Class<?> var1) {
      if (var1.isPrimitive()) {
         return Ԩ(var0, var1);
      } else {
         float var2;
         for(var2 = 0.0F; var0 != null && !var1.equals(var0); var0 = var0.getSuperclass()) {
            if (var1.isInterface() && ޒ.Ϳ(var0, var1)) {
               var2 += 0.25F;
               break;
            }

            ++var2;
         }

         if (var0 == null) {
            ++var2;
         }

         return var2;
      }
   }

   public static float _/* $FF was: Ԩ*/(Class<?> var0, Class<?> var1) {
      float var2 = 0.0F;
      if (!var0.isPrimitive()) {
         var2 = 0.1F;
         var0 = ޒ.֏(var0);
      }

      Class[] var4;
      for(int var3 = 0; var0 != var1 && var3 < (var4 = Ԩ).length; ++var3) {
         if (var0 == var4[var3]) {
            var2 += 0.1F;
            if (var3 < var4.length - 1) {
               var0 = var4[var3 + 1];
            }
         }
      }

      return var2;
   }

   static {
      Ԩ = new Class[]{Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};
   }
}
