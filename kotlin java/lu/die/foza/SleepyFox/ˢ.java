package lu.die.foza.SleepyFox;

public class ˢ implements ލ<String> {
   public static volatile ˣ Ԫ;
   public final StringBuffer Ϳ;
   public final Object Ԩ;
   public final ˣ ԩ;

   public static ˣ _/* $FF was: ԩ*/() {
      return Ԫ;
   }

   public static void _/* $FF was: Ϳ*/(ˣ var0) {
      if (var0 != null) {
         Ԫ = var0;
      } else {
         throw new IllegalArgumentException("The style must not be null");
      }
   }

   public static String _/* $FF was: ԩ*/(Object var0) {
      return ˊ.ԫ(var0);
   }

   public static String _/* $FF was: Ϳ*/(Object var0, ˣ var1) {
      return ˊ.Ԩ(var0, var1);
   }

   public static String _/* $FF was: Ϳ*/(Object var0, ˣ var1, boolean var2) {
      return ˊ.Ϳ(var0, var1, var2, false, (Class)null);
   }

   public static <T> String _/* $FF was: Ϳ*/(T var0, ˣ var1, boolean var2, Class<? super T> var3) {
      return ˊ.Ϳ(var0, var1, var2, false, var3);
   }

   public ˢ(Object var1) {
      this(var1, (ˣ)null, (StringBuffer)null);
   }

   public ˢ(Object var1, ˣ var2) {
      this(var1, var2, (StringBuffer)null);
   }

   public ˢ(Object var1, ˣ var2, StringBuffer var3) {
      if (var2 == null) {
         var2 = ԩ();
      }

      if (var3 == null) {
         var3 = new StringBuffer.<init>(512);
      }

      this.Ϳ = var3;
      this.ԩ = var2;
      this.Ԩ = var1;
      var2.appendStart(var3, var1);
   }

   static {
      Ԫ = ˣ.DEFAULT_STYLE;
   }

   public ˢ _/* $FF was: Ϳ*/(boolean var1) {
      this.ԩ.append(this.Ϳ, (String)null, var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(boolean[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (boolean[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(byte var1) {
      this.ԩ.append(this.Ϳ, (String)null, (byte)var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(byte[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (byte[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(char var1) {
      this.ԩ.append(this.Ϳ, (String)null, (char)var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(char[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (char[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(double var1) {
      this.ԩ.append(this.Ϳ, (String)null, var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(double[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (double[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(float var1) {
      this.ԩ.append(this.Ϳ, (String)null, var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(float[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (float[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(int var1) {
      this.ԩ.append(this.Ϳ, (String)null, (int)var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(int[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (int[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(long var1) {
      this.ԩ.append(this.Ϳ, (String)null, var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(long[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (long[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(Object var1) {
      this.ԩ.append(this.Ϳ, (String)null, (Object)var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(Object[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (Object[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(short var1) {
      this.ԩ.append(this.Ϳ, (String)null, (short)var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(short[] var1) {
      this.ԩ.append(this.Ϳ, (String)null, (short[])var1, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, boolean var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, boolean[] var2) {
      this.ԩ.append(this.Ϳ, var1, (boolean[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, boolean[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, byte var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, byte[] var2) {
      this.ԩ.append(this.Ϳ, var1, (byte[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, byte[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, char var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, char[] var2) {
      this.ԩ.append(this.Ϳ, var1, (char[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, char[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, double var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, double[] var2) {
      this.ԩ.append(this.Ϳ, var1, (double[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, double[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, float var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, float[] var2) {
      this.ԩ.append(this.Ϳ, var1, (float[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, float[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, int var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, int[] var2) {
      this.ԩ.append(this.Ϳ, var1, (int[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, int[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, long var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, long[] var2) {
      this.ԩ.append(this.Ϳ, var1, (long[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, long[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, Object var2) {
      this.ԩ.append(this.Ϳ, var1, (Object)var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, Object var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, Object[] var2) {
      this.ԩ.append(this.Ϳ, var1, (Object[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, Object[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, short var2) {
      this.ԩ.append(this.Ϳ, var1, var2);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, short[] var2) {
      this.ԩ.append(this.Ϳ, var1, (short[])var2, (Boolean)null);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1, short[] var2, boolean var3) {
      ˢ var10000 = this;
      ˣ var10001 = this.ԩ;
      StringBuffer var4 = this.Ϳ;
      Boolean var5 = var3;
      var10001.append(var4, var1, var2, var5);
      return var10000;
   }

   public ˢ _/* $FF was: Ԩ*/(Object var1) {
      ၻ.Ϳ(this.ԫ(), var1);
      return this;
   }

   public ˢ _/* $FF was: Ϳ*/(String var1) {
      if (var1 != null) {
         this.ԩ.appendSuper(this.Ϳ, var1);
      }

      return this;
   }

   public ˢ _/* $FF was: Ԩ*/(String var1) {
      if (var1 != null) {
         this.ԩ.appendToString(this.Ϳ, var1);
      }

      return this;
   }

   public Object _/* $FF was: Ԫ*/() {
      return this.Ԩ;
   }

   public StringBuffer _/* $FF was: ԫ*/() {
      return this.Ϳ;
   }

   public ˣ _/* $FF was: Ԭ*/() {
      return this.ԩ;
   }

   public String toString() {
      if (this.Ԫ() == null) {
         this.ԫ().append(this.Ԭ().Ԯ());
      } else {
         ˣ var10000 = this.ԩ;
         StringBuffer var1 = this.ԫ();
         var10000.appendEnd(var1, this.Ԫ());
      }

      return this.ԫ().toString();
   }

   public String _/* $FF was: Ԩ*/() {
      return this.toString();
   }
}
