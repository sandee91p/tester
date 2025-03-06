package lu.die.foza.SleepyFox;

import java.io.File;
import org.jetbrains.annotations.NotNull;

public final class Ⴧ {
   @NotNull
   public static final Ⴧ Ϳ = new Ⴧ();

   @NotNull
   public final File _/* $FF was: Ϳ*/(@NotNull File var1, @NotNull String... var2) {
      int var6 = 0;

      File var5;
      for(int var3 = var2.length; var6 < var3; var1 = var5) {
         String var4 = var2[var6];
         var5 = new File.<init>(var1, var4);
         ++var6;
      }

      return var1;
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String... var2) {
      File var6;
      var6 = new File.<init>(var1);
      int var7 = 0;

      File var5;
      for(int var3 = var2.length; var7 < var3; var6 = var5) {
         String var4 = var2[var7];
         var5 = new File.<init>(var6, var4);
         ++var7;
      }

      return var6.getAbsolutePath();
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/(@NotNull String var1) {
      try {
         return (new File(var1)).getCanonicalPath();
      } catch (Exception var2) {
         return var1;
      }
   }
}
