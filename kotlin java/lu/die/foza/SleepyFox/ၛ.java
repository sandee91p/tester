package lu.die.foza.SleepyFox;

public enum ၛ {
   JAVA_0_9(1.5F, "0.9"),
   JAVA_1_1(1.1F, "1.1"),
   JAVA_1_2(1.2F, "1.2"),
   JAVA_1_3(1.3F, "1.3"),
   JAVA_1_4(1.4F, "1.4"),
   JAVA_1_5(1.5F, "1.5"),
   JAVA_1_6(1.6F, "1.6"),
   JAVA_1_7(1.7F, "1.7"),
   JAVA_1_8(1.8F, "1.8");

   public float Ϳ;
   public String Ԩ;

   public ၛ(float var3, String var4) {
      this.Ϳ = var3;
      this.Ԩ = var4;
   }

   public static ၛ _/* $FF was: Ԩ*/(String var0) {
      return Ϳ(var0);
   }

   public static ၛ _/* $FF was: Ϳ*/(String var0) {
      if ("0.9".equals(var0)) {
         return JAVA_0_9;
      } else if ("1.1".equals(var0)) {
         return JAVA_1_1;
      } else if ("1.2".equals(var0)) {
         return JAVA_1_2;
      } else if ("1.3".equals(var0)) {
         return JAVA_1_3;
      } else if ("1.4".equals(var0)) {
         return JAVA_1_4;
      } else if ("1.5".equals(var0)) {
         return JAVA_1_5;
      } else if ("1.6".equals(var0)) {
         return JAVA_1_6;
      } else if ("1.7".equals(var0)) {
         return JAVA_1_7;
      } else {
         return "1.8".equals(var0) ? JAVA_1_8 : null;
      }
   }

   // $FF: synthetic method
   public static ၛ[] _/* $FF was: Ϳ*/() {
      return new ၛ[]{JAVA_0_9, JAVA_1_1, JAVA_1_2, JAVA_1_3, JAVA_1_4, JAVA_1_5, JAVA_1_6, JAVA_1_7, JAVA_1_8};
   }

   public boolean atLeast(ၛ var1) {
      return this.Ϳ >= var1.Ϳ;
   }

   public String toString() {
      return this.Ԩ;
   }
}
