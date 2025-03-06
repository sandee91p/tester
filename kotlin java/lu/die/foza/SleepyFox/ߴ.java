package lu.die.foza.SleepyFox;

import java.io.File;

public class ߴ {
   public static final String Ϳ = "Windows";
   public static final String Ԩ = "user.home";
   public static final String ԩ = "user.dir";
   public static final String Ԫ = "java.io.tmpdir";
   public static final String ԫ = "java.home";
   public static final String Ԭ = ԩ("awt.toolkit");
   public static final String ԭ = ԩ("file.encoding");
   public static final String Ԯ = ԩ("file.separator");
   public static final String ԯ = ԩ("java.awt.fonts");
   public static final String ՠ = ԩ("java.awt.graphicsenv");
   public static final String ֈ = ԩ("java.awt.headless");
   public static final String ֏ = ԩ("java.awt.printerjob");
   public static final String ׯ = ԩ("java.class.path");
   public static final String ؠ = ԩ("java.class.version");
   public static final String ހ = ԩ("java.compiler");
   public static final String ށ = ԩ("java.endorsed.dirs");
   public static final String ނ = ԩ("java.ext.dirs");
   public static final String ރ = ԩ("java.home");
   public static final String ބ = ԩ("java.io.tmpdir");
   public static final String ޅ = ԩ("java.library.path");
   public static final String ކ = ԩ("java.runtime.name");
   public static final String އ = ԩ("java.runtime.version");
   public static final String ވ = ԩ("java.specification.name");
   public static final String މ = ԩ("java.specification.vendor");
   public static final String ފ;
   public static final ၛ ދ;
   public static final String ތ;
   public static final String ލ;
   public static final String ގ;
   public static final String ޏ;
   public static final String ސ;
   public static final String ޑ;
   public static final String ޒ;
   public static final String ޓ;
   public static final String ޔ;
   public static final String ޕ;
   public static final String ޖ;
   public static final String ޗ;
   public static final String ޘ;
   public static final String ޙ;
   public static final String ޚ;
   public static final String ޛ;
   public static final String ޜ;
   public static final String ޝ;
   public static final String ޞ;
   public static final String ޟ;
   public static final String ޠ;
   public static final String ޡ;
   public static final boolean ޢ;
   public static final boolean ޣ;
   public static final boolean ޤ;
   public static final boolean ޥ;
   public static final boolean ޱ;
   public static final boolean ߾;
   public static final boolean ߿;
   public static final boolean ࡠ;
   public static final boolean ࡡ;
   public static final boolean ࡢ;
   public static final boolean ࡣ;
   public static final boolean ࡤ;
   public static final boolean ࡥ;
   public static final boolean ࡦ;
   public static final boolean ࡧ;
   public static final boolean ࡨ;
   public static final boolean ࡩ;
   public static final boolean ࡪ;
   public static final boolean ࢠ;
   public static final boolean ࢡ;
   public static final boolean ࢢ;
   public static final boolean ࢣ;
   public static final boolean ࢤ;
   public static final boolean ࢥ;
   public static final boolean ࢦ;
   public static final boolean ࢧ;
   public static final boolean ࢨ;
   public static final boolean ࢩ;
   public static final boolean ࢪ;
   public static final boolean ࢫ;
   public static final boolean ࢬ;

   public static File _/* $FF was: Ϳ*/() {
      return new File(System.getProperty("java.home"));
   }

   public static File _/* $FF was: Ԩ*/() {
      return new File(System.getProperty("java.io.tmpdir"));
   }

   public static boolean _/* $FF was: Ϳ*/(String var0) {
      return Ԩ(ފ, var0);
   }

   public static boolean _/* $FF was: Ϳ*/(String var0, String var1) {
      return Ϳ(ޙ, ޚ, var0, var1);
   }

   public static boolean _/* $FF was: Ԩ*/(String var0) {
      return ԩ(ޙ, var0);
   }

   public static String _/* $FF was: ԩ*/(String var0) {
      try {
         return System.getProperty(var0);
      } catch (SecurityException var1) {
         System.err.println("Caught a SecurityException reading the system property '" + var0 + "'; the SystemUtils property value will default to null.");
         return null;
      }
   }

   public static File _/* $FF was: ԩ*/() {
      return new File(System.getProperty("user.dir"));
   }

   public static File _/* $FF was: Ԫ*/() {
      return new File(System.getProperty("user.home"));
   }

   public static boolean _/* $FF was: ԫ*/() {
      String var0;
      return (var0 = ֈ) != null ? var0.equals(Boolean.TRUE.toString()) : false;
   }

   public static boolean _/* $FF was: Ϳ*/(ၛ var0) {
      return ދ.atLeast(var0);
   }

   public static boolean _/* $FF was: Ԩ*/(String var0, String var1) {
      return var0 == null ? false : var0.startsWith(var1);
   }

   public static boolean _/* $FF was: Ϳ*/(String var0, String var1, String var2, String var3) {
      if (var0 != null && var1 != null) {
         return var0.startsWith(var2) && var1.startsWith(var3);
      } else {
         return false;
      }
   }

   public static boolean _/* $FF was: ԩ*/(String var0, String var1) {
      return var0 == null ? false : var0.startsWith(var1);
   }

   static {
      String var0;
      ދ = ၛ.Ϳ(ފ = var0 = ԩ("java.specification.version"));
      ތ = ԩ("java.util.prefs.PreferencesFactory");
      ލ = ԩ("java.vendor");
      ގ = ԩ("java.vendor.url");
      ޏ = ԩ("java.version");
      ސ = ԩ("java.vm.info");
      ޑ = ԩ("java.vm.name");
      ޒ = ԩ("java.vm.specification.name");
      ޓ = ԩ("java.vm.specification.vendor");
      ޔ = ԩ("java.vm.specification.version");
      ޕ = ԩ("java.vm.vendor");
      ޖ = ԩ("java.vm.version");
      ޗ = ԩ("line.separator");
      ޘ = ԩ("os.arch");
      String var1;
      ޙ = var1 = ԩ("os.name");
      ޚ = ԩ("os.version");
      ޛ = ԩ("path.separator");
      ޜ = ԩ("user.country") == null ? ԩ("user.region") : ԩ("user.country");
      ޝ = ԩ("user.dir");
      ޞ = ԩ("user.home");
      ޟ = ԩ("user.language");
      ޠ = ԩ("user.name");
      ޡ = ԩ("user.timezone");
      ޢ = Ԩ(var0, "1.1");
      ޣ = Ԩ(var0, "1.2");
      ޤ = Ԩ(var0, "1.3");
      ޥ = Ԩ(var0, "1.4");
      ޱ = Ԩ(var0, "1.5");
      ߾ = Ԩ(var0, "1.6");
      ߿ = Ԩ(var0, "1.7");
      boolean var10;
      ࡠ = var10 = ԩ(var1, "AIX");
      boolean var2;
      ࡡ = var2 = ԩ(var1, "HP-UX");
      boolean var3;
      ࡢ = var3 = ԩ(var1, "Irix");
      boolean var4;
      if (!ԩ(var1, "Linux") && !ԩ(var1, "LINUX")) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var10000 = var10;
      ࡣ = var4;
      ࡤ = ԩ(var1, "Mac");
      ࡥ = var10 = ԩ(var1, "Mac OS X");
      boolean var5;
      ࡦ = var5 = ԩ(var1, "FreeBSD");
      boolean var6;
      ࡧ = var6 = ԩ(var1, "OpenBSD");
      boolean var7;
      ࡨ = var7 = ԩ(var1, "NetBSD");
      ࡩ = ԩ(var1, "OS/2");
      boolean var8;
      ࡪ = var8 = ԩ(var1, "Solaris");
      boolean var9;
      ࢠ = var9 = ԩ(var1, "SunOS");
      ࢡ = var10000 || var2 || var3 || var4 || var10 || var8 || var9 || var5 || var6 || var7;
      ࢢ = ԩ(var1, "Windows");
      ࢣ = Ϳ("Windows", "5.0");
      ࢤ = Ϳ("Windows", "5.2");
      ࢥ = Ϳ("Windows Server 2008", "6.1");
      ࢦ = Ϳ("Windows 9", "4.0");
      ࢧ = Ϳ("Windows 9", "4.1");
      ࢨ = Ϳ("Windows", "4.9");
      ࢩ = ԩ(var1, "Windows NT");
      ࢪ = Ϳ("Windows", "5.1");
      ࢫ = Ϳ("Windows", "6.0");
      ࢬ = Ϳ("Windows", "6.1");
   }
}
