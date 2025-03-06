package lu.die.foza.SleepyFox;

import java.io.File;
import org.jetbrains.annotations.NotNull;

public final class ၥ {
   @NotNull
   public static final ၥ Ϳ = new ၥ();
   @NotNull
   public static final File Ԩ = ࢦ.ֈ().getDir("foza_apks", 0);

   @NotNull
   public final File _/* $FF was: Ϳ*/() {
      return Ԩ;
   }

   @NotNull
   public final File _/* $FF was: Ԭ*/(@NotNull String var1) {
      File var10001 = ࢦ.ֈ().getCodeCacheDir();
      Ⴧ var10000 = Ⴧ.Ϳ;
      String[] var2;
      (var2 = new String[1])[0] = var1 + ".apk";
      return var10000.Ϳ(var10001, var2);
   }

   @NotNull
   public final File _/* $FF was: ԩ*/() {
      return Ⴧ.Ϳ.Ϳ(Ԩ, "tempApk");
   }

   @NotNull
   public final File _/* $FF was: Ԩ*/() {
      return Ⴧ.Ϳ.Ϳ(Ԩ, "config_component.dat");
   }

   @NotNull
   public final File _/* $FF was: Ԫ*/(@NotNull String var1) {
      return this.Ϳ(Ⴧ.Ϳ.Ϳ(Ԩ, var1));
   }

   @NotNull
   public final File _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull String var2) {
      return Ⴧ.Ϳ.Ϳ(this.Ԫ(var1), var2);
   }

   @NotNull
   public final File _/* $FF was: Ԩ*/(@NotNull String var1) {
      return Ⴧ.Ϳ.Ϳ(this.Ԫ(var1), "fox.apk");
   }

   @NotNull
   public final File _/* $FF was: ԫ*/(@NotNull String var1) {
      Ⴧ var2;
      File var5 = this.Ϳ((var2 = Ⴧ.Ϳ).Ϳ(this.Ԫ(var1), "lib"));
      String[] var6 = new String[1];
      byte var3 = 0;
      String var4;
      if (ॱ.Ϳ.Ԩ()) {
         var4 = "arm64";
      } else {
         var4 = "arm";
      }

      var6[var3] = var4;
      File var7;
      if ((var7 = var2.Ϳ(var5, var6)).exists() && !var7.delete()) {
         var7.toString();
      }

      ࡧ var10000 = ࡧ.Ϳ;
      String var8 = var5.getAbsolutePath();
      if (!ࡧ.Ϳ(var10000, var8, var7.getAbsolutePath(), false, 4, (Object)null)) {
         var5.toString();
         var7.toString();
      }

      return var7;
   }

   @NotNull
   public final File _/* $FF was: ԩ*/(@NotNull String var1) {
      return Ⴧ.Ϳ.Ϳ(this.Ԫ(var1), "config.dat");
   }

   @NotNull
   public final File _/* $FF was: Ԩ*/(@NotNull File var1) {
      Ⴧ var10000 = Ⴧ.Ϳ;
      String[] var2;
      (var2 = new String[1])[0] = "config.dat";
      return var10000.Ϳ(var1, var2);
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull String var1) {
      return ࡧ.Ϳ.ԫ(this.Ԫ(var1));
   }

   public final File _/* $FF was: Ϳ*/(File var1) {
      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }
}
