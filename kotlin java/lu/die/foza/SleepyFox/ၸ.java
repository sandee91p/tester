package lu.die.foza.SleepyFox;

public class ၸ extends Number implements Comparable<ၸ>, ၷ<Number> {
   public static final long Ԩ = 512176391864L;
   public int Ϳ;

   public ၸ() {
   }

   public ၸ(int var1) {
      this.Ϳ = var1;
   }

   public ၸ(Number var1) {
      this.Ϳ = var1.intValue();
   }

   public ၸ(String var1) throws NumberFormatException {
      this.Ϳ = Integer.parseInt(var1);
   }

   public Integer getValue() {
      return this.Ϳ;
   }

   public void setValue(int var1) {
      this.Ϳ = var1;
   }

   public void setValue(Number var1) {
      this.Ϳ = var1.intValue();
   }

   public void increment() {
      ++this.Ϳ;
   }

   public void decrement() {
      --this.Ϳ;
   }

   public void add(int var1) {
      this.Ϳ += var1;
   }

   public void add(Number var1) {
      ၸ var10000 = this;
      int var2 = this.Ϳ;
      var10000.Ϳ = var1.intValue() + var2;
   }

   public void subtract(int var1) {
      this.Ϳ -= var1;
   }

   public void subtract(Number var1) {
      this.Ϳ -= var1.intValue();
   }

   public int intValue() {
      return this.Ϳ;
   }

   public long longValue() {
      return (long)this.Ϳ;
   }

   public float floatValue() {
      return (float)this.Ϳ;
   }

   public double doubleValue() {
      return (double)this.Ϳ;
   }

   public Integer toInteger() {
      return this.intValue();
   }

   public boolean equals(Object var1) {
      if (var1 instanceof ၸ) {
         return this.Ϳ == ((ၸ)var1).intValue();
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.Ϳ;
   }

   public int compareTo(ၸ var1) {
      ၸ var10000 = this;
      int var2 = var1.Ϳ;
      int var3;
      return (var3 = var10000.Ϳ) < var2 ? -1 : (var3 == var2 ? 0 : 1);
   }

   public String toString() {
      return String.valueOf(this.Ϳ);
   }
}
