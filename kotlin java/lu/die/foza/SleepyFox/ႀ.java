package lu.die.foza.SleepyFox;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map.Entry;

public abstract class ႀ<L, R> implements Entry<L, R>, Comparable<ႀ<L, R>>, Serializable {
   public static final long Ϳ = 4954918890077093841L;

   public static <L, R> ႀ<L, R> of(L var0, R var1) {
      return new ྈ(var0, var1);
   }

   public abstract L getLeft();

   public abstract R getRight();

   public final L getKey() {
      return this.getLeft();
   }

   public R getValue() {
      return this.getRight();
   }

   public int compareTo(ႀ<L, R> var1) {
      ޗ var2;
      ޗ var10000 = var2 = new ޗ;
      var2.<init>();
      Object var4 = this.getLeft();
      var10000 = var10000.Ϳ((Object)var4, (Object)var1.getLeft(), (Comparator)null);
      Object var3 = this.getRight();
      return var10000.Ϳ(var3, var1.getRight()).ԩ();
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Entry)) {
         return false;
      } else {
         Entry var2 = (Entry)var1;
         return ၻ.Ԩ(this.getKey(), var2.getKey()) && ၻ.Ԩ(this.getValue(), var2.getValue());
      }
   }

   public int hashCode() {
      int var1;
      if (this.getKey() == null) {
         var1 = 0;
      } else {
         var1 = this.getKey().hashCode();
      }

      int var2;
      if (this.getValue() == null) {
         var2 = 0;
      } else {
         var2 = this.getValue().hashCode();
      }

      return var1 ^ var2;
   }

   public String toString() {
      return "(" + this.getLeft() + ',' + this.getRight() + ')';
   }

   public String toString(String var1) {
      return String.format(var1, this.getLeft(), this.getRight());
   }
}
