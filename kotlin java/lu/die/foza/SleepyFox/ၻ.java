package lu.die.foza.SleepyFox;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ၻ {
   public static final ၻ.Ϳ Ϳ = new ၻ.Ϳ();

   public static <T> T _/* $FF was: Ϳ*/(T var0, T var1) {
      if (var0 == null) {
         var0 = var1;
      }

      return var0;
   }

   public static <T> T _/* $FF was: Ϳ*/(T... var0) {
      if (var0 != null) {
         int var1 = var0.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            Object var3;
            if ((var3 = var0[var2]) != null) {
               return var3;
            }
         }
      }

      return null;
   }

   public static boolean _/* $FF was: Ԩ*/(Object var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else {
         return var0 != null && var1 != null ? var0.equals(var1) : false;
      }
   }

   public static boolean _/* $FF was: ԩ*/(Object var0, Object var1) {
      return Ԩ(var0, var1) ^ true;
   }

   public static int _/* $FF was: ԩ*/(Object var0) {
      return var0 == null ? 0 : var0.hashCode();
   }

   public static int _/* $FF was: Ԩ*/(Object... var0) {
      int var1 = 1;
      if (var0 != null) {
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Object var4 = var0[var3];
            var1 = ԩ(var4) + var1 * 31;
         }
      }

      return var1;
   }

   public static String _/* $FF was: Ԫ*/(Object var0) {
      if (var0 == null) {
         return null;
      } else {
         StringBuffer var10000 = new StringBuffer();
         Ϳ(var10000, var0);
         return var10000.toString();
      }
   }

   public static void _/* $FF was: Ϳ*/(StringBuffer var0, Object var1) {
      if (var1 != null) {
         var0.append(var1.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(var1)));
      } else {
         throw new NullPointerException("Cannot get the toString of a null identity");
      }
   }

   public static String _/* $FF was: ԫ*/(Object var0) {
      return var0 == null ? "" : var0.toString();
   }

   public static String _/* $FF was: Ϳ*/(Object var0, String var1) {
      if (var0 != null) {
         var1 = var0.toString();
      }

      return var1;
   }

   public static <T extends Comparable<? super T>> T _/* $FF was: ԩ*/(T... var0) {
      Comparable var1 = null;
      if (var0 != null) {
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Comparable var4;
            if (Ϳ(var4 = var0[var3], var1, true) < 0) {
               var1 = var4;
            }
         }
      }

      return var1;
   }

   public static <T extends Comparable<? super T>> T _/* $FF was: Ϳ*/(T... var0) {
      Comparable var1 = null;
      if (var0 != null) {
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Comparable var4;
            if (Ϳ(var4 = var0[var3], var1, false) > 0) {
               var1 = var4;
            }
         }
      }

      return var1;
   }

   public static <T extends Comparable<? super T>> int _/* $FF was: Ϳ*/(T var0, T var1) {
      return Ϳ(var0, var1, false);
   }

   public static <T extends Comparable<? super T>> int _/* $FF was: Ϳ*/(T var0, T var1, boolean var2) {
      if (var0 == var1) {
         return 0;
      } else if (var0 == null) {
         return var2 ? 1 : -1;
      } else if (var1 == null) {
         return var2 ? -1 : 1;
      } else {
         return var0.compareTo(var1);
      }
   }

   public static <T extends Comparable<? super T>> T _/* $FF was: Ԩ*/(T... var0) {
      ʸ.Ԩ((Object[])var0);
      ʸ.Ϳ((Object[])var0);
      TreeSet var1;
      TreeSet var10000 = var1 = new TreeSet;
      var1.<init>();
      Collections.addAll(var10000, var0);
      return (Comparable)var10000.toArray()[(var1.size() - 1) / 2];
   }

   public static <T> T _/* $FF was: Ϳ*/(Comparator<T> var0, T... var1) {
      ʸ.Ԩ(var1, "null/empty items");
      ʸ.Ϳ(var1);
      ʸ.Ϳ((Object)var0, (String)"null comparator", (Object[])());
      TreeSet var2;
      TreeSet var10000 = var2 = new TreeSet;
      var2.<init>(var0);
      Collections.addAll(var10000, var1);
      return var10000.toArray()[(var2.size() - 1) / 2];
   }

   public static <T> T _/* $FF was: ԩ*/(T... var0) {
      if (ކ.ԩ(var0)) {
         HashMap var1;
         var1 = new HashMap.<init>(var0.length);
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Object var4;
            ၸ var5;
            if ((var5 = (ၸ)var1.get(var4 = var0[var3])) == null) {
               var5 = new ၸ.<init>(1);
               var1.put(var4, var5);
            } else {
               var5.increment();
            }
         }

         Object var6 = null;
         int var7 = 0;
         Iterator var8 = var1.entrySet().iterator();

         while(var8.hasNext()) {
            Entry var9;
            int var10;
            if ((var10 = ((ၸ)(var9 = (Entry)var8.next()).getValue()).intValue()) == var7) {
               var6 = null;
            } else if (var10 > var7) {
               var6 = var9.getKey();
               var7 = var10;
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   public static <T> T _/* $FF was: Ϳ*/(T var0) {
      if (!(var0 instanceof Cloneable)) {
         return null;
      } else {
         if (var0.getClass().isArray()) {
            Class var1;
            if (!(var1 = var0.getClass().getComponentType()).isPrimitive()) {
               var0 = ((Object[])var0).clone();
            } else {
               int var7;
               Object var2 = Array.newInstance(var1, var7 = Array.getLength(var0));

               while(true) {
                  int var10000 = var7;
                  var7 += -1;
                  if (var10000 <= 0) {
                     var0 = var2;
                     break;
                  }

                  Array.set(var2, var7, Array.get(var0, var7));
               }
            }
         } else {
            Object var8;
            try {
               var8 = var0.getClass().getMethod("clone").invoke(var0);
            } catch (NoSuchMethodException var3) {
               throw new ޖ("Cloneable type " + var0.getClass().getName() + " has no clone method", var3);
            } catch (IllegalAccessException var4) {
               throw new ޖ("Cannot clone Cloneable type ".concat(var0.getClass().getName()), var4);
            } catch (InvocationTargetException var5) {
               String var6 = "Exception cloning Cloneable type ".concat(var0.getClass().getName());
               throw new ޖ(var6, var5.getCause());
            }

            var0 = var8;
         }

         return var0;
      }
   }

   public static <T> T _/* $FF was: Ԩ*/(T var0) {
      Object var1;
      if ((var1 = Ϳ(var0)) != null) {
         var0 = var1;
      }

      return var0;
   }

   public static class Ϳ implements Serializable {
      public static final long Ϳ = 7092611880189329093L;

      public final Object _/* $FF was: Ϳ*/() {
         return ၻ.Ϳ;
      }
   }
}
