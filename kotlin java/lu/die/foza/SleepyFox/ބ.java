package lu.die.foza.SleepyFox;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public final class ބ<K, V> implements Map<K, V> {
   public static final int ԫ = 4;
   public int[] Ϳ;
   public Object[] Ԩ;
   public int ԩ;
   public ބ.Ԭ<K, V> Ԫ;

   public static int _/* $FF was: Ϳ*/(int[] var0, int var1, int var2) {
      return ބ.Ԩ.Ϳ(var0, var1, var2);
   }

   public final void _/* $FF was: Ϳ*/(int var1) {
      this.Ϳ = new int[var1];
      this.Ԩ = new Object[var1 << 1];
   }

   public ބ() {
      this(0, false);
   }

   public ބ(int var1) {
      this(var1, false);
   }

   public ބ(int var1, boolean var2) {
      if (var1 <= 0) {
         this.Ϳ = ބ.Ԫ.Ϳ;
         this.Ԩ = ބ.Ԫ.ԩ;
      } else {
         this.Ϳ(var1);
      }

      this.ԩ = 0;
   }

   public ބ(ބ<K, V> var1) {
      this();
      if (var1 != null) {
         this.Ϳ(var1);
      }

   }

   public final ބ.Ԭ<K, V> _/* $FF was: Ԩ*/() {
      if (this.Ԫ == null) {
         ބ.Ԭ var1;
         var1 = new ބ.Ԭ<K, V>() {
            public int _/* $FF was: ԩ*/() {
               return ބ.this.ԩ;
            }

            public Object _/* $FF was: Ϳ*/(int var1, int var2) {
               return ބ.this.Ԩ[(var1 << 1) + var2];
            }

            public int _/* $FF was: Ϳ*/(Object var1) {
               return ބ.this.Ϳ(var1);
            }

            public int _/* $FF was: Ԩ*/(Object var1) {
               return ބ.this.Ԩ(var1);
            }

            public Map<K, V> _/* $FF was: Ԩ*/() {
               return ބ.this;
            }

            public void _/* $FF was: Ϳ*/(K var1, V var2) {
               ބ.this.put(var1, var2);
            }

            public V _/* $FF was: Ϳ*/(int var1, V var2) {
               return ބ.this.Ϳ(var1, var2);
            }

            public void _/* $FF was: Ϳ*/(int var1) {
               ބ.this.Ԫ(var1);
            }

            public void _/* $FF was: Ϳ*/() {
               ބ.this.clear();
            }
         }.<init>();
         this.Ԫ = var1;
      }

      return this.Ԫ;
   }

   public int _/* $FF was: Ϳ*/(Object var1, int var2) {
      int var3;
      if ((var3 = this.ԩ) == 0) {
         return -1;
      } else {
         int var4;
         if ((var4 = ބ.Ԩ.Ϳ(this.Ϳ, var3, var2)) < 0) {
            return var4;
         } else if (var1.equals(this.Ԩ[var4 << 1])) {
            return var4;
         } else {
            int var5;
            for(var5 = var4 + 1; var5 < var3 && this.Ϳ[var5] == var2; ++var5) {
               if (var1.equals(this.Ԩ[var5 << 1])) {
                  return var5;
               }
            }

            for(var3 = var4 - 1; var3 >= 0 && this.Ϳ[var3] == var2; --var3) {
               if (var1.equals(this.Ԩ[var3 << 1])) {
                  return var3;
               }
            }

            return ~var5;
         }
      }
   }

   public int _/* $FF was: ԩ*/() {
      int var1;
      if ((var1 = this.ԩ) == 0) {
         return -1;
      } else {
         int var2;
         if ((var2 = ބ.Ԩ.Ϳ(this.Ϳ, var1, 0)) < 0) {
            return var2;
         } else if (this.Ԩ[var2 << 1] == null) {
            return var2;
         } else {
            int var3;
            for(var3 = var2 + 1; var3 < var1 && this.Ϳ[var3] == 0; ++var3) {
               if (this.Ԩ[var3 << 1] == null) {
                  return var3;
               }
            }

            for(var1 = var2 - 1; var1 >= 0 && this.Ϳ[var1] == 0; --var1) {
               if (this.Ԩ[var1 << 1] == null) {
                  return var1;
               }
            }

            return ~var3;
         }
      }
   }

   public void clear() {
      if (this.ԩ > 0) {
         this.Ϳ = ބ.Ԫ.Ϳ;
         this.Ԩ = ބ.Ԫ.ԩ;
         this.ԩ = 0;
      }

   }

   public void _/* $FF was: Ϳ*/() {
      int var1;
      if ((var1 = this.ԩ) > 0) {
         var1 <<= 1;
         Object[] var2 = this.Ԩ;

         for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = null;
         }

         this.ԩ = 0;
      }

   }

   public void _/* $FF was: Ԩ*/(int var1) {
      int var2 = this.ԩ;
      int[] var3;
      if ((var3 = this.Ϳ).length < var1) {
         int var10002 = var1;
         Object[] var5 = this.Ԩ;
         this.Ϳ(var10002);
         if (this.ԩ > 0) {
            Object[] var10000 = var5;
            System.arraycopy(var3, 0, this.Ϳ, 0, var2);
            Object[] var4 = this.Ԩ;
            var1 = var2 << 1;
            System.arraycopy(var10000, 0, var4, 0, var1);
         }
      }

   }

   public boolean containsKey(Object var1) {
      return this.Ϳ(var1) >= 0;
   }

   public int _/* $FF was: Ϳ*/(Object var1) {
      return var1 == null ? this.ԩ() : this.Ϳ(var1, var1.hashCode());
   }

   public int _/* $FF was: Ԩ*/(Object var1) {
      ބ var10001 = this;
      int var4 = this.ԩ * 2;
      Object[] var2 = var10001.Ԩ;
      if (var1 == null) {
         for(int var5 = 1; var5 < var4; var5 += 2) {
            if (var2[var5] == null) {
               return var5 >> 1;
            }
         }
      } else {
         for(int var3 = 1; var3 < var4; var3 += 2) {
            if (var1.equals(var2[var3])) {
               return var3 >> 1;
            }
         }
      }

      return -1;
   }

   public boolean containsValue(Object var1) {
      return this.Ԩ(var1) >= 0;
   }

   public V get(Object var1) {
      int var2;
      return (var2 = this.Ϳ(var1)) >= 0 ? this.Ԩ[(var2 << 1) + 1] : null;
   }

   public K _/* $FF was: ԩ*/(int var1) {
      return this.Ԩ[var1 << 1];
   }

   public V _/* $FF was: ԫ*/(int var1) {
      return this.Ԩ[(var1 << 1) + 1];
   }

   public V _/* $FF was: Ϳ*/(int var1, V var2) {
      ބ var10000 = this;
      int var3 = (var1 << 1) + 1;
      Object[] var5;
      Object var4 = (var5 = var10000.Ԩ)[var3];
      var5[var3] = var2;
      return var4;
   }

   public boolean isEmpty() {
      return this.ԩ <= 0;
   }

   public V put(K var1, V var2) {
      int var3 = this.ԩ;
      int var4;
      int var5;
      if (var1 == null) {
         var4 = 0;
         var5 = this.ԩ();
      } else {
         var4 = var1.hashCode();
         var5 = this.Ϳ(var1, var4);
      }

      ބ var15;
      if (var5 >= 0) {
         var15 = this;
         int var10 = (var5 << 1) + 1;
         Object[] var11;
         Object var16 = (var11 = var15.Ԩ)[var10];
         var11[var10] = var2;
         return var16;
      } else {
         var5 = ~var5;
         int[] var6;
         int var7;
         Object[] var13;
         Object[] var10000;
         if (var3 >= (var6 = this.Ϳ).length) {
            if (var3 >= 8) {
               var7 = var3 + (var3 >> 1);
            } else if (var3 >= 4) {
               var7 = 8;
            } else {
               var7 = 4;
            }

            int var10002 = var7;
            Object[] var14 = this.Ԩ;
            this.Ϳ(var10002);
            int[] var8;
            if ((var8 = this.Ϳ).length > 0) {
               var10000 = var14;
               int[] var10003 = var6;
               int var12 = var6.length;
               System.arraycopy(var10003, 0, var8, 0, var12);
               var13 = this.Ԩ;
               var7 = var14.length;
               System.arraycopy(var10000, 0, var13, 0, var7);
            }
         }

         int var20;
         if (var5 < var3) {
            int[] var10001 = var6 = this.Ϳ;
            var20 = var3;
            var3 = var5 + 1;
            var7 = var20 - var5;
            System.arraycopy(var10001, var5, var6, var3, var7);
            var10000 = var13 = this.Ԩ;
            int var17 = var3;
            var3 = var5 << 1;
            var7 = var17 << 1;
            var17 = var3;
            var3 = this.ԩ - var5 << 1;
            System.arraycopy(var10000, var17, var13, var7, var3);
         }

         var15 = this;
         ބ var18 = this;
         this.Ϳ[var5] = var4;
         Object[] var9;
         Object[] var19 = var9 = this.Ԩ;
         var20 = var5 << 1;
         var9[var5 << 1] = var1;
         var19[var20 + 1] = var2;
         var15.ԩ = var18.ԩ + 1;
         return null;
      }
   }

   public void _/* $FF was: Ϳ*/(K var1, V var2) {
      int var3 = this.ԩ;
      int var4;
      if (var1 == null) {
         var4 = 0;
      } else {
         var4 = var1.hashCode();
      }

      if (var3 > 0 && this.Ϳ[var3 - 1] > var4) {
         this.put(var1, var2);
      } else {
         ބ var10000 = this;
         this.ԩ = var3 + 1;
         this.Ϳ[var3] = var4;
         int var5 = var3 << 1;
         Object[] var6 = var10000.Ԩ;
         var6[var5] = var1;
         var6[var5 + 1] = var2;
      }
   }

   public void _/* $FF was: Ԫ*/() {
      int var1;
      if ((var1 = this.ԩ) > 1) {
         int var2 = this.Ϳ[0];
         int var3 = 0;

         for(int var4 = 1; var4 < var1; ++var4) {
            int var5;
            if ((var5 = this.Ϳ[var4]) != var2) {
               var3 = var4;
               var2 = var5;
            } else {
               Object var10001 = this.Ԩ[var4 << 1];

               for(var5 = var4 - 1; var5 >= var3; --var5) {
                  Object var10000 = this.Ԩ[var5 << 1];
               }
            }
         }

      }
   }

   public void _/* $FF was: Ϳ*/(ބ<? extends K, ? extends V> var1) {
      int var2 = var1.ԩ;
      this.Ԩ(this.ԩ + var2);
      if (this.ԩ == 0) {
         if (var2 > 0) {
            System.arraycopy(var1.Ϳ, 0, this.Ϳ, 0, var2);
            Object[] var5 = this.Ԩ;
            int var6 = var2 << 1;
            System.arraycopy(var1.Ԩ, 0, var5, 0, var6);
            this.ԩ = var2;
         }
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            Object var4 = var1.ԩ(var3);
            this.put(var4, var1.ԫ(var3));
         }
      }

   }

   public V remove(Object var1) {
      int var2;
      return (var2 = this.Ϳ(var1)) >= 0 ? this.Ԫ(var2) : null;
   }

   public V _/* $FF was: Ԫ*/(int var1) {
      Object[] var2;
      int var3;
      Object var4 = (var2 = this.Ԩ)[(var3 = var1 << 1) + 1];
      int var5;
      if ((var5 = this.ԩ) <= 1) {
         this.Ϳ = ބ.Ԫ.Ϳ;
         this.Ԩ = ބ.Ԫ.ԩ;
         var1 = 0;
      } else {
         int var6 = var5 - 1;
         int[] var7;
         int var10;
         Object[] var10000;
         int var10001;
         if ((var7 = this.Ϳ).length > 8 && var5 < var7.length / 3) {
            if (var5 > 8) {
               var5 += var5 >> 1;
            } else {
               var5 = 8;
            }

            this.Ϳ(var5);
            if (var1 > 0) {
               System.arraycopy(var7, 0, this.Ϳ, 0, var1);
               System.arraycopy(var2, 0, this.Ԩ, 0, var3);
            }

            if (var1 < var6) {
               var10000 = var2;
               var10 = var1 + 1;
               int[] var11 = this.Ϳ;
               int var8;
               var10001 = var8 = var6 - var1;
               System.arraycopy(var7, var10, var11, var1, var8);
               var1 = var10 << 1;
               var2 = this.Ԩ;
               var5 = var10001 << 1;
               System.arraycopy(var10000, var1, var2, var3, var5);
            }
         } else {
            if (var1 < var6) {
               var10 = var1 + 1;
               var5 = var6 - var1;
               System.arraycopy(var7, var10, var7, var1, var5);
               var10000 = this.Ԩ;
               var1 = var10 << 1;
               var10 = var5 << 1;
               System.arraycopy(var10000, var1, var10000, var3, var10);
            }

            Object[] var9;
            var10000 = var9 = this.Ԩ;
            var10001 = var6 << 1;
            var9[var6 << 1] = null;
            var10000[var10001 + 1] = null;
         }

         var1 = var6;
      }

      this.ԩ = var1;
      return var4;
   }

   public int size() {
      return this.ԩ;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Map)) {
         return false;
      } else {
         Map var18 = (Map)var1;
         if (this.ԩ != var18.size()) {
            return false;
         } else {
            int var2 = 0;

            while(true) {
               int var10000;
               boolean var10001;
               int var22;
               try {
                  var10000 = var2;
                  var22 = this.ԩ;
               } catch (NullPointerException var16) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var17) {
                  var10001 = false;
                  return false;
               }

               if (var10000 >= var22) {
                  return true;
               }

               ބ var19;
               Object var23;
               try {
                  var19 = this;
                  var23 = this.ԩ(var2);
               } catch (NullPointerException var14) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var15) {
                  var10001 = false;
                  return false;
               }

               Object var3 = var23;

               Object var20;
               try {
                  var20 = var19.ԫ(var2);
               } catch (NullPointerException var12) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var13) {
                  var10001 = false;
                  return false;
               }

               Object var4 = var20;

               try {
                  var23 = var18.get(var3);
               } catch (NullPointerException var10) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var11) {
                  var10001 = false;
                  return false;
               }

               Object var5 = var23;
               boolean var21;
               if (var20 == null) {
                  if (var5 != null) {
                     break;
                  }

                  try {
                     var21 = var18.containsKey(var3);
                  } catch (NullPointerException var6) {
                     var10001 = false;
                     return false;
                  } catch (ClassCastException var7) {
                     var10001 = false;
                     return false;
                  }

                  if (!var21) {
                     break;
                  }
               } else {
                  try {
                     var21 = var4.equals(var5);
                  } catch (NullPointerException var8) {
                     var10001 = false;
                     return false;
                  } catch (ClassCastException var9) {
                     var10001 = false;
                     return false;
                  }

                  if (!var21) {
                     return false;
                  }
               }

               ++var2;
            }

            return false;
         }
      }
   }

   public int hashCode() {
      int[] var8 = this.Ϳ;
      Object[] var1 = this.Ԩ;
      int var2 = 0;
      int var3 = 0;
      int var4 = 1;

      for(int var5 = this.ԩ; var3 < var5; var4 += 2) {
         Object var6;
         Object var9 = var6 = var1[var4];
         int var7 = var8[var3];
         int var10;
         if (var9 == null) {
            var10 = 0;
         } else {
            var10 = var6.hashCode();
         }

         var2 += var7 ^ var10;
         ++var3;
      }

      return var2;
   }

   public boolean _/* $FF was: Ϳ*/(Collection<?> var1) {
      return ބ.Ԭ.Ϳ((Map)this, (Collection)var1);
   }

   public void putAll(Map<? extends K, ? extends V> var1) {
      Map var10000 = var1;
      Map var10002 = var1;
      int var3 = this.ԩ;
      this.Ԩ(var10002.size() + var3);
      Iterator var4 = var10000.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var10001 = (Entry)var4.next();
         Object var2 = var10001.getKey();
         this.put(var2, var10001.getValue());
      }

   }

   public boolean _/* $FF was: Ԩ*/(Collection<?> var1) {
      return ބ.Ԭ.Ԩ(this, var1);
   }

   public boolean _/* $FF was: ԩ*/(Collection<?> var1) {
      return ބ.Ԭ.ԩ(this, var1);
   }

   public Set<Entry<K, V>> entrySet() {
      return this.Ԩ().Ԫ();
   }

   public Set<K> keySet() {
      return this.Ԩ().ԫ();
   }

   public Collection<V> values() {
      return this.Ԩ().Ԭ();
   }

   public static class Ԩ {
      public static int _/* $FF was: Ϳ*/(int[] var0, int var1, int var2) {
         int var10000 = var1;
         var1 = 0;
         int var3 = var10000 - 1;

         while(var1 <= var3) {
            int var4;
            int var5;
            if ((var5 = var0[var4 = var1 + var3 >>> 1]) < var2) {
               var1 = var4 + 1;
            } else {
               if (var5 <= var2) {
                  return var4;
               }

               var3 = var4 - 1;
            }
         }

         return ~var1;
      }

      public static int _/* $FF was: Ϳ*/(long[] var0, int var1, long var2) {
         int var10000 = var1;
         var1 = 0;
         int var4 = var10000 - 1;

         while(var1 <= var4) {
            int var5;
            long var6;
            if ((var6 = var0[var5 = var1 + var4 >>> 1]) < var2) {
               var1 = var5 + 1;
            } else {
               if (var6 <= var2) {
                  return var5;
               }

               var4 = var5 - 1;
            }
         }

         return ~var1;
      }
   }

   public static final class Ԫ {
      public static final int[] Ϳ = new int[0];
      public static final Class<?>[] Ԩ = new Class[0];
      public static final Object[] ԩ = new Object[0];
      public static final String[] Ԫ = new String[0];
   }

   public abstract static class Ԭ<K, V> {
      public ބ.Ԭ<K, V>.Ԩ Ϳ;
      public ބ.Ԭ<K, V>.Ԫ Ԩ;
      public ބ.Ԭ<K, V>.Ԯ ԩ;

      public static <K, V> boolean _/* $FF was: Ϳ*/(Map<K, V> var0, Collection<?> var1) {
         Iterator var2 = var1.iterator();

         do {
            if (!var2.hasNext()) {
               return true;
            }
         } while(var0.containsKey(var2.next()));

         return false;
      }

      public static <K, V> boolean _/* $FF was: Ԩ*/(Map<K, V> var0, Collection<?> var1) {
         Collection var10000 = var1;
         int var3 = var0.size();
         Iterator var2 = var10000.iterator();

         while(var2.hasNext()) {
            var0.remove(var2.next());
         }

         return var3 != var0.size();
      }

      public static <K, V> boolean _/* $FF was: ԩ*/(Map<K, V> var0, Collection<?> var1) {
         int var2 = var0.size();
         Iterator var3 = var0.keySet().iterator();

         while(var3.hasNext()) {
            if (!var1.contains(var3.next())) {
               var3.remove();
            }
         }

         return var2 != var0.size();
      }

      public static <T> boolean _/* $FF was: Ϳ*/(Set<T> var0, Object var1) {
         if (var0 == var1) {
            return true;
         } else if (var1 instanceof Set) {
            Set var10000 = var0;
            Set var6 = (Set)var1;

            boolean var10001;
            int var7;
            int var9;
            try {
               var7 = var10000.size();
               var9 = var6.size();
            } catch (NullPointerException var4) {
               var10001 = false;
               return false;
            } catch (ClassCastException var5) {
               var10001 = false;
               return false;
            }

            boolean var8;
            if (var7 == var9) {
               try {
                  var8 = var0.containsAll(var6);
               } catch (NullPointerException var2) {
                  var10001 = false;
                  return false;
               } catch (ClassCastException var3) {
                  var10001 = false;
                  return false;
               }

               if (var8) {
                  var8 = true;
                  return var8;
               }
            }

            var8 = false;
            return var8;
         } else {
            return false;
         }
      }

      public Object[] _/* $FF was: Ԩ*/(int var1) {
         int var2;
         Object[] var3 = new Object[var2 = this.ԩ()];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = this.Ϳ(var4, var1);
         }

         return var3;
      }

      public <T> T[] _/* $FF was: Ϳ*/(T[] var1, int var2) {
         int var3 = this.ԩ();
         if (var1.length < var3) {
            var1 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var3);
         }

         for(int var4 = 0; var4 < var3; ++var4) {
            var1[var4] = this.Ϳ(var4, var2);
         }

         if (var1.length > var3) {
            var1[var3] = null;
         }

         return var1;
      }

      public Set<Entry<K, V>> _/* $FF was: Ԫ*/() {
         if (this.Ϳ == null) {
            ބ.Ԭ.Ԩ var1;
            var1 = new ބ.Ԭ.Ԩ.<init>();
            this.Ϳ = var1;
         }

         return this.Ϳ;
      }

      public Set<K> _/* $FF was: ԫ*/() {
         if (this.Ԩ == null) {
            ބ.Ԭ.Ԫ var1;
            var1 = new ބ.Ԭ.Ԫ.<init>();
            this.Ԩ = var1;
         }

         return this.Ԩ;
      }

      public Collection<V> _/* $FF was: Ԭ*/() {
         if (this.ԩ == null) {
            ބ.Ԭ.Ԯ var1;
            var1 = new ބ.Ԭ.Ԯ.<init>();
            this.ԩ = var1;
         }

         return this.ԩ;
      }

      public abstract int _/* $FF was: ԩ*/();

      public abstract Object _/* $FF was: Ϳ*/(int var1, int var2);

      public abstract int _/* $FF was: Ϳ*/(Object var1);

      public abstract int _/* $FF was: Ԩ*/(Object var1);

      public abstract Map<K, V> _/* $FF was: Ԩ*/();

      public abstract void _/* $FF was: Ϳ*/(K var1, V var2);

      public abstract V _/* $FF was: Ϳ*/(int var1, V var2);

      public abstract void _/* $FF was: Ϳ*/(int var1);

      public abstract void _/* $FF was: Ϳ*/();

      public final class Ԩ implements Set<Entry<K, V>> {
         public boolean _/* $FF was: Ϳ*/(Entry<K, V> var1) {
            throw new UnsupportedOperationException();
         }

         public boolean addAll(Collection<? extends Entry<K, V>> var1) {
            Collection var10000 = var1;
            int var5 = Ԭ.this.ԩ();
            Iterator var2 = var10000.iterator();

            while(var2.hasNext()) {
               Entry var3 = (Entry)var2.next();
               ބ.Ԭ var4 = Ԭ.this;
               Entry var10001 = var3;
               Object var6 = var3.getKey();
               var4.Ϳ(var6, var10001.getValue());
            }

            return var5 != Ԭ.this.ԩ();
         }

         public void clear() {
            Ԭ.this.Ϳ();
         }

         public boolean contains(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            } else {
               Entry var3 = (Entry)var1;
               int var2;
               return (var2 = Ԭ.this.Ϳ(var3.getKey())) < 0 ? false : Objects.equals(Ԭ.this.Ϳ(var2, 1), var3.getValue());
            }
         }

         public boolean containsAll(Collection<?> var1) {
            Iterator var2 = var1.iterator();

            do {
               if (!var2.hasNext()) {
                  return true;
               }
            } while(this.contains(var2.next()));

            return false;
         }

         public boolean isEmpty() {
            return Ԭ.this.ԩ() == 0;
         }

         public Iterator<Entry<K, V>> iterator() {
            return Ԭ.this.new Ԭ();
         }

         public boolean remove(Object var1) {
            throw new UnsupportedOperationException();
         }

         public boolean removeAll(Collection<?> var1) {
            throw new UnsupportedOperationException();
         }

         public boolean retainAll(Collection<?> var1) {
            throw new UnsupportedOperationException();
         }

         public int size() {
            return Ԭ.this.ԩ();
         }

         public Object[] toArray() {
            throw new UnsupportedOperationException();
         }

         public <T> T[] toArray(T[] var1) {
            throw new UnsupportedOperationException();
         }

         public boolean equals(Object var1) {
            return ބ.Ԭ.Ϳ((Set)this, (Object)var1);
         }

         public int hashCode() {
            int var1 = 0;

            for(int var2 = Ԭ.this.ԩ() - 1; var2 >= 0; --var2) {
               Object var3;
               Object var10000 = var3 = Ԭ.this.Ϳ(var2, 0);
               Object var4 = Ԭ.this.Ϳ(var2, 1);
               int var5;
               if (var10000 == null) {
                  var5 = 0;
               } else {
                  var5 = var3.hashCode();
               }

               int var6;
               if (var4 == null) {
                  var6 = 0;
               } else {
                  var6 = var4.hashCode();
               }

               var1 += var5 ^ var6;
            }

            return var1;
         }

         public boolean add(Object var1) {
            Entry var10000 = (Entry)var1;
            throw new UnsupportedOperationException();
         }
      }

      public final class Ԫ implements Set<K> {
         public boolean add(K var1) {
            throw new UnsupportedOperationException();
         }

         public boolean addAll(Collection<? extends K> var1) {
            throw new UnsupportedOperationException();
         }

         public void clear() {
            Ԭ.this.Ϳ();
         }

         public boolean contains(Object var1) {
            return Ԭ.this.Ϳ(var1) >= 0;
         }

         public boolean containsAll(Collection<?> var1) {
            return ބ.Ԭ.Ϳ(Ԭ.this.Ԩ(), var1);
         }

         public boolean isEmpty() {
            return Ԭ.this.ԩ() == 0;
         }

         public Iterator<K> iterator() {
            return Ԭ.this.new Ϳ(0);
         }

         public boolean remove(Object var1) {
            int var2;
            if ((var2 = Ԭ.this.Ϳ(var1)) >= 0) {
               Ԭ.this.Ϳ(var2);
               return true;
            } else {
               return false;
            }
         }

         public boolean removeAll(Collection<?> var1) {
            return ބ.Ԭ.Ԩ(Ԭ.this.Ԩ(), var1);
         }

         public boolean retainAll(Collection<?> var1) {
            return ބ.Ԭ.ԩ(Ԭ.this.Ԩ(), var1);
         }

         public int size() {
            return Ԭ.this.ԩ();
         }

         public Object[] toArray() {
            return Ԭ.this.Ԩ(0);
         }

         public <T> T[] toArray(T[] var1) {
            return Ԭ.this.Ϳ(var1, 0);
         }

         public boolean equals(Object var1) {
            return ބ.Ԭ.Ϳ((Set)this, (Object)var1);
         }

         public int hashCode() {
            int var1 = 0;

            for(int var2 = Ԭ.this.ԩ() - 1; var2 >= 0; --var2) {
               Object var3;
               int var4;
               if ((var3 = Ԭ.this.Ϳ(var2, 0)) == null) {
                  var4 = 0;
               } else {
                  var4 = var3.hashCode();
               }

               var1 += var4;
            }

            return var1;
         }
      }

      public final class Ԯ implements Collection<V> {
         public boolean add(V var1) {
            throw new UnsupportedOperationException();
         }

         public boolean addAll(Collection<? extends V> var1) {
            throw new UnsupportedOperationException();
         }

         public void clear() {
            Ԭ.this.Ϳ();
         }

         public boolean contains(Object var1) {
            return Ԭ.this.Ԩ(var1) >= 0;
         }

         public boolean containsAll(Collection<?> var1) {
            Iterator var2 = var1.iterator();

            do {
               if (!var2.hasNext()) {
                  return true;
               }
            } while(this.contains(var2.next()));

            return false;
         }

         public boolean isEmpty() {
            return Ԭ.this.ԩ() == 0;
         }

         public Iterator<V> iterator() {
            return Ԭ.this.new Ϳ(1);
         }

         public boolean remove(Object var1) {
            int var2;
            if ((var2 = Ԭ.this.Ԩ(var1)) >= 0) {
               Ԭ.this.Ϳ(var2);
               return true;
            } else {
               return false;
            }
         }

         public boolean removeAll(Collection<?> var1) {
            int var2 = Ԭ.this.ԩ();
            boolean var3 = false;

            for(int var4 = 0; var4 < var2; ++var4) {
               if (var1.contains(Ԭ.this.Ϳ(var4, 1))) {
                  Ԭ.this.Ϳ(var4);
                  --var4;
                  --var2;
                  var3 = true;
               }
            }

            return var3;
         }

         public boolean retainAll(Collection<?> var1) {
            int var2 = Ԭ.this.ԩ();
            boolean var3 = false;

            for(int var4 = 0; var4 < var2; ++var4) {
               if (!var1.contains(Ԭ.this.Ϳ(var4, 1))) {
                  Ԭ.this.Ϳ(var4);
                  --var4;
                  --var2;
                  var3 = true;
               }
            }

            return var3;
         }

         public int size() {
            return Ԭ.this.ԩ();
         }

         public Object[] toArray() {
            return Ԭ.this.Ԩ(1);
         }

         public <T> T[] toArray(T[] var1) {
            return Ԭ.this.Ϳ(var1, 1);
         }
      }

      public final class Ԭ implements Iterator<Entry<K, V>>, Entry<K, V> {
         public int Ϳ = Ԭ.this.ԩ() - 1;
         public int Ԩ = -1;

         public boolean hasNext() {
            return this.Ԩ < this.Ϳ;
         }

         public Entry<K, V> _/* $FF was: Ϳ*/() {
            if (this.hasNext()) {
               ++this.Ԩ;
               return this;
            } else {
               throw new NoSuchElementException();
            }
         }

         public void remove() {
            Ԭ.this.Ϳ(this.Ԩ);
            --this.Ԩ;
            --this.Ϳ;
         }

         public K getKey() {
            return Ԭ.this.Ϳ(this.Ԩ, 0);
         }

         public V getValue() {
            return Ԭ.this.Ϳ(this.Ԩ, 1);
         }

         public V setValue(V var1) {
            return Ԭ.this.Ϳ(this.Ԩ, var1);
         }

         public final boolean equals(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            } else {
               Entry var2;
               return Objects.equals((var2 = (Entry)var1).getKey(), Ԭ.this.Ϳ(this.Ԩ, 0)) && Objects.equals(var2.getValue(), Ԭ.this.Ϳ(this.Ԩ, 1));
            }
         }

         public final int hashCode() {
            Object var1;
            Object var10000 = var1 = Ԭ.this.Ϳ(this.Ԩ, 0);
            Object var2 = Ԭ.this.Ϳ(this.Ԩ, 1);
            int var4;
            if (var10000 == null) {
               var4 = 0;
            } else {
               var4 = var1.hashCode();
            }

            int var3;
            if (var2 == null) {
               var3 = 0;
            } else {
               var3 = var2.hashCode();
            }

            return var4 ^ var3;
         }
      }

      final class Ϳ<T> implements Iterator<T> {
         public final int Ϳ;
         public int Ԩ;
         public int ԩ;
         public boolean Ԫ = false;

         public _/* $FF was: Ϳ*/(int var2) {
            this.Ϳ = var2;
            this.Ԩ = Ԭ.this.ԩ();
         }

         public boolean hasNext() {
            return this.ԩ < this.Ԩ;
         }

         public T next() {
            if (this.hasNext()) {
               int var1 = this.ԩ;
               Object var10000 = Ԭ.this.Ϳ(var1, this.Ϳ);
               ++this.ԩ;
               this.Ԫ = true;
               return var10000;
            } else {
               throw new NoSuchElementException();
            }
         }

         public void remove() {
            if (this.Ԫ) {
               ބ.Ԭ.Ϳ var10000 = this;
               ބ.Ԭ.Ϳ var10001 = this;
               ބ.Ԭ.Ϳ var10002 = this;
               ބ.Ԭ.Ϳ var10003 = this;
               int var1;
               this.ԩ = var1 = this.ԩ - 1;
               var10002.Ԩ = var10003.Ԩ - 1;
               var10001.Ԫ = false;
               Ԭ.this.Ϳ(var1);
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }
}
