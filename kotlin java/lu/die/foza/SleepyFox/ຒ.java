package lu.die.foza.SleepyFox;

public final class ຒ {
   public final Object Ϳ;
   public final int Ԩ;

   public _/* $FF was: ຒ*/(Object var1) {
      this.Ԩ = System.identityHashCode(var1);
      this.Ϳ = var1;
   }

   public int hashCode() {
      return this.Ԩ;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ຒ)) {
         return false;
      } else {
         ຒ var2 = (ຒ)var1;
         if (this.Ԩ != var2.Ԩ) {
            return false;
         } else {
            return this.Ϳ == var2.Ϳ;
         }
      }
   }
}
