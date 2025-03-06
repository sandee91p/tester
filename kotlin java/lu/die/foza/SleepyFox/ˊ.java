package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ˊ extends ˢ {
   public boolean ԫ = false;
   public boolean Ԭ = false;
   public String[] ԭ;
   public Class<?> Ԯ = null;

   public static String _/* $FF was: ԫ*/(Object var0) {
      return Ϳ(var0, (ˣ)null, false, false, (Class)null);
   }

   public static String _/* $FF was: Ԩ*/(Object var0, ˣ var1) {
      return Ϳ(var0, var1, false, false, (Class)null);
   }

   public static String _/* $FF was: Ԩ*/(Object var0, ˣ var1, boolean var2) {
      return Ϳ(var0, var1, var2, false, (Class)null);
   }

   public static String _/* $FF was: Ϳ*/(Object var0, ˣ var1, boolean var2, boolean var3) {
      return Ϳ(var0, var1, var2, var3, (Class)null);
   }

   public static <T> String _/* $FF was: Ϳ*/(T var0, ˣ var1, boolean var2, boolean var3, Class<? super T> var4) {
      return (new ˊ(var0, var1, (StringBuffer)null, var4, var2, var3)).toString();
   }

   public static String _/* $FF was: Ϳ*/(Object var0, Collection<String> var1) {
      return Ϳ(var0, Ϳ(var1));
   }

   public static String[] _/* $FF was: Ϳ*/(Collection<String> var0) {
      return var0 == null ? ކ.ԩ : Ԩ(var0.toArray());
   }

   public static String[] _/* $FF was: Ԩ*/(Object[] var0) {
      ArrayList var1;
      var1 = new ArrayList.<init>(var0.length);
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Object var4;
         if ((var4 = var0[var3]) != null) {
            var1.add(var4.toString());
         }
      }

      return (String[])var1.toArray(ކ.ԩ);
   }

   public static String _/* $FF was: Ϳ*/(Object var0, String... var1) {
      return (new ˊ(var0)).Ϳ(var1).toString();
   }

   public ˊ(Object var1) {
      super(var1);
   }

   public ˊ(Object var1, ˣ var2) {
      super(var1, var2);
   }

   public ˊ(Object var1, ˣ var2, StringBuffer var3) {
      super(var1, var2, var3);
   }

   public <T> ˊ(T var1, ˣ var2, StringBuffer var3, Class<? super T> var4, boolean var5, boolean var6) {
      super(var1, var2, var3);
      this.Ԩ(var4);
      this.ԩ(var5);
      this.Ԩ(var6);
   }

   public boolean _/* $FF was: Ϳ*/(Field var1) {
      if (var1.getName().indexOf(36) != -1) {
         return false;
      } else if (Modifier.isTransient(var1.getModifiers()) && !this.ՠ()) {
         return false;
      } else if (Modifier.isStatic(var1.getModifiers()) && !this.ԯ()) {
         return false;
      } else {
         String[] var2;
         return (var2 = this.ԭ) == null || Arrays.binarySearch(var2, var1.getName()) < 0;
      }
   }

   public void _/* $FF was: Ϳ*/(Class<?> var1) {
      if (var1.isArray()) {
         this.Ԫ(this.Ԫ());
      } else {
         Field[] var7;
         Field[] var10000 = var7 = var1.getDeclaredFields();
         AccessibleObject.setAccessible(var10000, true);
         int var2 = var10000.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Field var4;
            Field var10001 = var4 = var7[var3];
            String var5 = var10001.getName();
            if (this.Ϳ(var10001)) {
               try {
                  this.Ϳ(var5, this.Ԩ(var4));
               } catch (IllegalAccessException var6) {
                  throw new InternalError("Unexpected IllegalAccessException: " + var6.getMessage());
               }
            }
         }

      }
   }

   public String[] _/* $FF was: ԭ*/() {
      return (String[])this.ԭ.clone();
   }

   public Class<?> _/* $FF was: Ԯ*/() {
      return this.Ԯ;
   }

   public Object _/* $FF was: Ԩ*/(Field var1) throws IllegalArgumentException, IllegalAccessException {
      return var1.get(this.Ԫ());
   }

   public boolean _/* $FF was: ԯ*/() {
      return this.ԫ;
   }

   public boolean _/* $FF was: ՠ*/() {
      return this.Ԭ;
   }

   public ˊ _/* $FF was: Ԫ*/(Object var1) {
      this.Ԭ().Ԫ(this.ԫ(), (String)null, var1);
      return this;
   }

   public void _/* $FF was: Ԩ*/(boolean var1) {
      this.ԫ = var1;
   }

   public void _/* $FF was: ԩ*/(boolean var1) {
      this.Ԭ = var1;
   }

   public ˊ _/* $FF was: Ϳ*/(String... var1) {
      if (var1 == null) {
         this.ԭ = null;
      } else {
         Arrays.sort(this.ԭ = Ԩ((Object[])var1));
      }

      return this;
   }

   public void _/* $FF was: Ԩ*/(Class<?> var1) {
      Object var2;
      if (var1 != null && (var2 = this.Ԫ()) != null && !var1.isInstance(var2)) {
         throw new IllegalArgumentException("Specified class is not a superclass of the object");
      } else {
         this.Ԯ = var1;
      }
   }

   public String toString() {
      if (this.Ԫ() == null) {
         return this.Ԭ().Ԯ();
      } else {
         Class var1;
         this.Ϳ(var1 = this.Ԫ().getClass());

         while(var1.getSuperclass() != null && var1 != this.Ԯ()) {
            this.Ϳ(var1 = var1.getSuperclass());
         }

         return super.toString();
      }
   }
}
