package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public final class ޅ<E> implements Collection<E>, Set<E> {
   public static final int ԫ = 4;
   public int[] Ϳ;
   public Object[] Ԩ;
   public int ԩ;
   public ބ.Ԭ<E, E> Ԫ;

   public final int _/* $FF was: Ϳ*/(int[] var1, int var2) {
      return ބ.Ԩ.Ϳ(var1, this.ԩ, var2);
   }

   public final int _/* $FF was: Ϳ*/(Object var1, int var2) {
      int var3;
      if ((var3 = this.ԩ) == 0) {
         return -1;
      } else {
         int var4;
         if ((var4 = ބ.Ԩ.Ϳ(this.Ϳ, var3, var2)) < 0) {
            return var4;
         } else if (var1.equals(this.Ԩ[var4])) {
            return var4;
         } else {
            int var5;
            for(var5 = var4 + 1; var5 < var3 && this.Ϳ[var5] == var2; ++var5) {
               if (var1.equals(this.Ԩ[var5])) {
                  return var5;
               }
            }

            for(var3 = var4 - 1; var3 >= 0 && this.Ϳ[var3] == var2; --var3) {
               if (var1.equals(this.Ԩ[var3])) {
                  return var3;
               }
            }

            return ~var5;
         }
      }
   }

   public final int _/* $FF was: ԩ*/() {
      int var1;
      if ((var1 = this.ԩ) == 0) {
         return -1;
      } else {
         int var2;
         if ((var2 = ބ.Ԩ.Ϳ(this.Ϳ, var1, 0)) < 0) {
            return var2;
         } else if (this.Ԩ[var2] == null) {
            return var2;
         } else {
            int var3;
            for(var3 = var2 + 1; var3 < var1 && this.Ϳ[var3] == 0; ++var3) {
               if (this.Ԩ[var3] == null) {
                  return var3;
               }
            }

            for(var1 = var2 - 1; var1 >= 0 && this.Ϳ[var1] == 0; --var1) {
               if (this.Ԩ[var1] == null) {
                  return var1;
               }
            }

            return ~var3;
         }
      }
   }

   public final void _/* $FF was: Ϳ*/(int var1) {
      this.Ϳ = new int[var1];
      this.Ԩ = new Object[var1];
   }

   public ޅ() {
      this(0, false);
   }

   public ޅ(int var1) {
      this(var1, false);
   }

   public ޅ(int var1, boolean var2) {
      if (var1 == 0) {
         this.Ϳ = ބ.Ԫ.Ϳ;
         this.Ԩ = ބ.Ԫ.ԩ;
      } else {
         this.Ϳ(var1);
      }

      this.ԩ = 0;
   }

   public ޅ(ޅ<E> var1) {
      this();
      if (var1 != null) {
         this.Ϳ(var1);
      }

   }

   public ޅ(Collection<? extends E> var1) {
      this();
      if (var1 != null) {
         this.addAll(var1);
      }

   }

   public ޅ(E[] var1) {
      this();
      if (var1 != null) {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.add(var1[var3]);
         }
      }

   }

   public final boolean _/* $FF was: Ԫ*/() {
      int[] var1;
      return (var1 = this.Ϳ).length > 8 && this.ԩ < var1.length / 3;
   }

   public final int _/* $FF was: Ԩ*/() {
      int var1;
      return (var1 = this.ԩ) > 8 ? var1 + (var1 >> 1) : 8;
   }

   public final ބ.Ԭ<E, E> _/* $FF was: Ϳ*/() {
      if (this.Ԫ == null) {
         ބ.Ԭ var1;
         var1 = new ބ.Ԭ<E, E>() {
            public int _/* $FF was: ԩ*/() {
               return ޅ.this.ԩ;
            }

            public Object _/* $FF was: Ϳ*/(int var1, int var2) {
               return ޅ.this.Ԩ[var1];
            }

            public int _/* $FF was: Ϳ*/(Object var1) {
               return ޅ.this.indexOf(var1);
            }

            public int _/* $FF was: Ԩ*/(Object var1) {
               return ޅ.this.indexOf(var1);
            }

            public Map<E, E> _/* $FF was: Ԩ*/() {
               throw new UnsupportedOperationException("not a map");
            }

            public void _/* $FF was: Ϳ*/(E var1, E var2) {
               ޅ.this.add(var1);
            }

            public E _/* $FF was: Ϳ*/(int var1, E var2) {
               throw new UnsupportedOperationException("not a map");
            }

            public void _/* $FF was: Ϳ*/(int var1) {
               ޅ.this.ԩ(var1);
            }

            public void _/* $FF was: Ϳ*/() {
               ޅ.this.clear();
            }
         }.<init>();
         this.Ԫ = var1;
      }

      return this.Ԫ;
   }

   public void clear() {
      this.ԩ = 0;
      this.Ϳ = ބ.Ԫ.Ϳ;
      this.Ԩ = ބ.Ԫ.ԩ;
   }

   public void _/* $FF was: Ԩ*/(int var1) {
      int[] var2;
      if ((var2 = this.Ϳ).length < var1) {
         Object[] var3 = this.Ԩ;
         this.Ϳ(var1);
         if ((var1 = this.ԩ) > 0) {
            ޅ var10001 = this;
            System.arraycopy(var2, 0, this.Ϳ, 0, var1);
            Object[] var4 = this.Ԩ;
            var1 = var10001.ԩ;
            System.arraycopy(var3, 0, var4, 0, var1);
         }
      }

   }

   public boolean contains(Object var1) {
      return this.indexOf(var1) >= 0;
   }

   public int indexOf(Object var1) {
      return var1 == null ? this.ԩ() : this.Ϳ(var1, var1.hashCode());
   }

   public E _/* $FF was: Ԫ*/(int var1) {
      return this.Ԩ[var1];
   }

   public E _/* $FF was: ԫ*/(int var1) {
      return this.Ԩ[var1];
   }

   public boolean isEmpty() {
      return this.ԩ <= 0;
   }

   public boolean add(E var1) {
      int var2 = this.ԩ;
      int var3;
      int var4;
      if (var1 == null) {
         var3 = 0;
         var4 = this.ԩ();
      } else {
         var3 = var1.hashCode();
         var4 = this.Ϳ(var1, var3);
      }

      if (var4 >= 0) {
         return false;
      } else {
         var4 = ~var4;
         int[] var5;
         int var8;
         Object[] var10000;
         if (var2 >= (var5 = this.Ϳ).length) {
            int var6;
            if (var2 >= 8) {
               var6 = var2 + (var2 >> 1);
            } else if (var2 >= 4) {
               var6 = 8;
            } else {
               var6 = 4;
            }

            int var10002 = var6;
            Object[] var10 = this.Ԩ;
            this.Ϳ(var10002);
            int[] var7;
            if ((var7 = this.Ϳ).length > 0) {
               var10000 = var10;
               int[] var10003 = var5;
               var8 = var5.length;
               System.arraycopy(var10003, 0, var7, 0, var8);
               Object[] var9 = this.Ԩ;
               var6 = var10.length;
               System.arraycopy(var10000, 0, var9, 0, var6);
            }
         }

         if (var4 < var2) {
            int[] var10001 = this.Ϳ;
            int var12 = var2;
            var2 = var4 + 1;
            var8 = var12 - var4;
            System.arraycopy(var10001, var4, var10001, var2, var8);
            var10000 = this.Ԩ;
            System.arraycopy(var10000, var4, var10000, var2, var8);
         }

         this.Ϳ[var4] = var3;
         this.Ԩ[var4] = var1;
         int var11 = this.ԩ++;
         return true;
      }
   }

   public void _/* $FF was: Ϳ*/(E var1) {
      int var2 = this.ԩ;
      int var3;
      if (var1 == null) {
         var3 = 0;
      } else {
         var3 = var1.hashCode();
      }

      if (var2 > 0 && this.Ϳ[var2 - 1] > var3) {
         this.add(var1);
      } else {
         this.ԩ = var2 + 1;
         this.Ϳ[var2] = var3;
         this.Ԩ[var2] = var1;
      }
   }

   public void _/* $FF was: Ϳ*/(ޅ<? extends E> var1) {
      int var2 = var1.ԩ;
      this.Ԩ(this.ԩ + var2);
      if (this.ԩ == 0) {
         if (var2 > 0) {
            System.arraycopy(var1.Ϳ, 0, this.Ϳ, 0, var2);
            System.arraycopy(var1.Ԩ, 0, this.Ԩ, 0, var2);
            this.ԩ = var2;
         }
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            this.add(var1.Ԩ[var3]);
         }
      }

   }

   public boolean remove(Object var1) {
      int var2;
      if ((var2 = this.indexOf(var1)) >= 0) {
         this.ԩ(var2);
         return true;
      } else {
         return false;
      }
   }

   public E _/* $FF was: ԩ*/(int var1) {
      int var2;
      int var10000 = var2 = this.ԩ;
      Object var3 = this.Ԩ[var1];
      if (var10000 <= 1) {
         this.clear();
      } else {
         --var2;
         int var4;
         if (this.Ԫ()) {
            var4 = this.Ԩ();
            int[] var5 = this.Ϳ;
            Object[] var6 = this.Ԩ;
            this.Ϳ(var4);
            if (var1 > 0) {
               System.arraycopy(var5, 0, this.Ϳ, 0, var1);
               System.arraycopy(var6, 0, this.Ԩ, 0, var1);
            }

            if (var1 < var2) {
               int[] var10002 = var5;
               var4 = var1 + 1;
               var5 = this.Ϳ;
               int var8 = var2 - var1;
               System.arraycopy(var10002, var4, var5, var1, var8);
               System.arraycopy(var6, var4, this.Ԩ, var1, var8);
            }
         } else {
            if (var1 < var2) {
               int[] var10001 = this.Ϳ;
               var4 = var1 + 1;
               int var7 = var2 - var1;
               System.arraycopy(var10001, var4, var10001, var1, var7);
               Object[] var9 = this.Ԩ;
               System.arraycopy(var9, var4, var9, var1, var7);
            }

            this.Ԩ[var2] = null;
         }

         this.ԩ = var2;
      }

      return var3;
   }

   public boolean _/* $FF was: Ԩ*/(ޅ<? extends E> var1) {
      int var2 = var1.ԩ;
      int var3 = this.ԩ;

      for(int var4 = 0; var4 < var2; ++var4) {
         this.remove(var1.Ԩ[var4]);
      }

      return var3 != this.ԩ;
   }

   @SuppressLint({"NewApi"})
   public boolean removeIf(Predicate<? super E> var1) {
      if (this.ԩ == 0) {
         return false;
      } else {
         int var2 = 0;
         int var3 = 0;

         int var5;
         for(int var4 = 0; var4 < (var5 = this.ԩ); ++var4) {
            if (var1.test(this.Ԩ[var4])) {
               ++var3;
            } else {
               if (var2 != var4) {
                  Object[] var10001 = this.Ԩ;
                  var10001[var2] = var10001[var4];
                  int[] var10000 = this.Ϳ;
                  var10000[var2] = var10000[var4];
               }

               ++var2;
            }
         }

         if (var3 == 0) {
            return false;
         } else if (var3 == var5) {
            this.clear();
            return true;
         } else {
            this.ԩ = var5 - var3;
            int var8;
            Object[] var10;
            if (this.Ԫ()) {
               var8 = this.Ԩ();
               int[] var9 = this.Ϳ;
               Object[] var11 = this.Ԩ;
               this.Ϳ(var8);
               int[] var6 = this.Ϳ;
               var8 = this.ԩ;
               System.arraycopy(var9, 0, var6, 0, var8);
               Object[] var7 = this.Ԩ;
               var8 = this.ԩ;
               System.arraycopy(var11, 0, var7, 0, var8);
            } else {
               for(var8 = this.ԩ; var8 < (var10 = this.Ԩ).length; ++var8) {
                  var10[var8] = null;
               }
            }

            return true;
         }
      }
   }

   public int size() {
      return this.ԩ;
   }

   public Object[] toArray() {
      int var1;
      Object[] var2;
      Object[] var10000 = var2 = new Object[var1 = this.ԩ];
      System.arraycopy(this.Ԩ, 0, var2, 0, var1);
      return var10000;
   }

   public <T> T[] toArray(T[] var1) {
      if (var1.length < this.ԩ) {
         var1 = (Object[])Array.newInstance(var1.getClass().getComponentType(), this.ԩ);
      }

      int var2 = this.ԩ;
      System.arraycopy(this.Ԩ, 0, var1, 0, var2);
      int var3;
      if (var1.length > (var3 = this.ԩ)) {
         var1[var3] = null;
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Set)) {
         return false;
      } else {
         Set var7 = (Set)var1;
         if (this.ԩ != var7.size()) {
            return false;
         } else {
            int var2 = 0;

            while(true) {
               boolean var8;
               label70: {
                  int var10000;
                  boolean var10001;
                  int var9;
                  try {
                     var10000 = var2;
                     var9 = this.ԩ;
                  } catch (NullPointerException var5) {
                     var10001 = false;
                     return false;
                  } catch (ClassCastException var6) {
                     var10001 = false;
                     return false;
                  }

                  if (var10000 >= var9) {
                     return true;
                  }

                  try {
                     var8 = var7.contains(this.Ԩ[var2]);
                     break label70;
                  } catch (NullPointerException var3) {
                     var10001 = false;
                  } catch (ClassCastException var4) {
                     var10001 = false;
                  }

                  return false;
               }

               if (!var8) {
                  return false;
               }

               ++var2;
            }
         }
      }
   }

   public int hashCode() {
      int[] var4 = this.Ϳ;
      int var1 = 0;
      int var2 = 0;

      for(int var3 = this.ԩ; var2 < var3; ++var2) {
         var1 += var4[var2];
      }

      return var1;
   }

   public Iterator<E> iterator() {
      return this.Ϳ().ԫ().iterator();
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

   public boolean addAll(Collection<? extends E> var1) {
      Collection var10000 = var1;
      Collection var10002 = var1;
      int var3 = this.ԩ;
      this.Ԩ(var10002.size() + var3);
      boolean var4 = false;

      for(Iterator var2 = var10000.iterator(); var2.hasNext(); var4 |= this.add(var2.next())) {
      }

      return var4;
   }

   public boolean removeAll(Collection<?> var1) {
      Collection var10000 = var1;
      boolean var3 = false;

      for(Iterator var2 = var10000.iterator(); var2.hasNext(); var3 |= this.remove(var2.next())) {
      }

      return var3;
   }

   public boolean retainAll(Collection<?> var1) {
      boolean var2 = false;

      for(int var3 = this.ԩ - 1; var3 >= 0; --var3) {
         if (!var1.contains(this.Ԩ[var3])) {
            this.ԩ(var3);
            var2 = true;
         }
      }

      return var2;
   }
}
