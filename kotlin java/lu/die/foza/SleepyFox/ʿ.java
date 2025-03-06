package lu.die.foza.SleepyFox;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class ʿ {
   @NotNull
   public static final ʿ Ϳ = new ʿ();
   @NotNull
   public static final HashMap<String, String> Ԩ;

   static {
      Ԩ = MapsKt.hashMapOf(new Pair[]{TuplesKt.to(Void.class.getName(), "V"), TuplesKt.to(Boolean.TYPE.getName(), "Z"), TuplesKt.to(Byte.TYPE.getName(), "B"), TuplesKt.to(Character.TYPE.getName(), "C"), TuplesKt.to(Short.TYPE.getName(), "S"), TuplesKt.to(Integer.TYPE.getName(), "I"), TuplesKt.to(Long.TYPE.getName(), "J"), TuplesKt.to(Float.TYPE.getName(), "F"), TuplesKt.to(Double.TYPE.getName(), "D"), TuplesKt.to("void", "V"), TuplesKt.to("boolean", "Z"), TuplesKt.to("byte", "B"), TuplesKt.to("char", "C"), TuplesKt.to("short", "S"), TuplesKt.to("int", "I"), TuplesKt.to("long", "J"), TuplesKt.to("float", "F"), TuplesKt.to("double", "D")});
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/(@NotNull Class<?> var1, @NotNull Class<?>[] var2) {
      StringBuilder var3;
      var3 = new StringBuilder.<init>("(");
      int var4 = 0;

      for(int var5 = var2.length; var4 < var5; ++var4) {
         var3.append(this.Ϳ(var2[var4]));
      }

      var3.append(")");
      var3.append(this.Ϳ(var1));
      return var3.toString();
   }

   public final String _/* $FF was: Ϳ*/(Class<?> var1) {
      StringBuilder var3;
      var3 = new StringBuilder.<init>();
      String var2;
      if (var1.isArray()) {
         var2 = var1.getComponentType().getName();
         var3.append("[");
      } else {
         var2 = var1.getName();
      }

      HashMap var4;
      if (var1.isPrimitive() && (var4 = Ԩ).containsKey(var2)) {
         var3.append((String)var4.get(var2));
      } else {
         var3.append("L").append(StringsKt.replace$default(var2, ".", "/", false, 4, (Object)null)).append(";");
      }

      return var3.toString();
   }
}
