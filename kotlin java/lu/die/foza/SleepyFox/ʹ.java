package lu.die.foza.SleepyFox;

public class ʹ {
   public int[] Ϳ;
   public int Ԩ;

   public ʹ() {
      this(10);
   }

   public ʹ(int var1) {
      if (var1 == 0) {
         this.Ϳ = ބ.Ԫ.Ϳ;
      } else {
         this.Ϳ = new int[var1];
      }

      this.Ԩ = 0;
   }

   public final boolean _/* $FF was: ԩ*/(int var1) {
      int var2;
      if ((var2 = this.Ԩ(var1)) < 0) {
         ʹ var10000 = this;
         ʹ var10001 = this;
         ʹ var10002 = this;
         int[] var10003 = this.Ϳ;
         int var3 = this.Ԩ;
         var10002.Ϳ = ʹ.Ϳ(var10003, var3, ~var2, var1);
         var10000.Ԩ = var10001.Ԩ + 1;
         return true;
      } else {
         return false;
      }
   }

   public final boolean _/* $FF was: Ϳ*/(int var1) {
      return this.Ԩ(var1) >= 0;
   }

   public final int _/* $FF was: Ԩ*/(int var1) {
      return ބ.Ԩ.Ϳ(this.Ϳ, this.Ԩ, var1);
   }

   public final boolean _/* $FF was: Ϳ*/() {
      return this.Ԩ != 0;
   }
}
