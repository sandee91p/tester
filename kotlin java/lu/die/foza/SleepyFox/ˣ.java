package lu.die.foza.SleepyFox;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class ˣ implements Serializable {
   public static final long ކ = -2587890625525655916L;
   public static final ˣ DEFAULT_STYLE = new ˣ.Ϳ();
   public static final ˣ MULTI_LINE_STYLE = new ˣ.Ԩ();
   public static final ˣ NO_FIELD_NAMES_STYLE = new ˣ.Ԫ();
   public static final ˣ SHORT_PREFIX_STYLE = new ˣ.Ԭ();
   public static final ˣ SIMPLE_STYLE = new ˣ.Ԯ();
   public static final ThreadLocal<WeakHashMap<Object, Object>> އ = new ThreadLocal();
   public boolean Ϳ = true;
   public boolean Ԩ = true;
   public boolean ԩ = false;
   public boolean Ԫ = true;
   public String ԫ = "[";
   public String Ԭ = "]";
   public String ԭ = "=";
   public boolean Ԯ = false;
   public boolean ԯ = false;
   public String ՠ = ",";
   public String ֈ = "{";
   public String ֏ = ",";
   public boolean ׯ = true;
   public String ؠ = "}";
   public boolean ހ = true;
   public String ށ = "<null>";
   public String ނ = "<size=";
   public String ރ = ">";
   public String ބ = "<";
   public String ޅ = ">";

   public static Map<Object, Object> _/* $FF was: ԯ*/() {
      return (Map)އ.get();
   }

   public static boolean _/* $FF was: Ϳ*/(Object var0) {
      Map var1;
      return (var1 = ԯ()) != null && var1.containsKey(var0);
   }

   public static void _/* $FF was: Ԩ*/(Object var0) {
      if (var0 != null) {
         if (ԯ() == null) {
            އ.set(new WeakHashMap());
         }

         ԯ().put(var0, (Object)null);
      }

   }

   public static void _/* $FF was: ԩ*/(Object var0) {
      Map var1;
      if (var0 != null && (var1 = ԯ()) != null) {
         var1.remove(var0);
         if (var1.isEmpty()) {
            އ.remove();
         }
      }

   }

   public void appendSuper(StringBuffer var1, String var2) {
      this.appendToString(var1, var2);
   }

   public void appendToString(StringBuffer var1, String var2) {
      if (var2 != null) {
         int var3 = var2.indexOf(this.ԫ);
         int var4;
         if ((var3 += this.ԫ.length()) != (var4 = var2.lastIndexOf(this.Ԭ)) && var3 >= 0 && var4 >= 0) {
            var2 = var2.substring(var3, var4);
            if (this.Ԯ) {
               this.Ԫ(var1);
            }

            var1.append(var2);
            this.ԩ(var1);
         }
      }

   }

   public void appendStart(StringBuffer var1, Object var2) {
      if (var2 != null) {
         this.Ϳ(var1, var2);
         this.Ԩ(var1, var2);
         this.Ԩ(var1);
         if (this.Ԯ) {
            this.ԩ(var1);
         }
      }

   }

   public void appendEnd(StringBuffer var1, Object var2) {
      if (!this.ԯ) {
         this.Ԫ(var1);
      }

      this.Ϳ(var1);
      ԩ(var2);
   }

   public void _/* $FF was: Ԫ*/(StringBuffer var1) {
      int var2;
      int var10000 = var2 = var1.length();
      int var3 = this.ՠ.length();
      if (var10000 > 0 && var3 > 0 && var2 >= var3) {
         boolean var4 = true;

         for(int var5 = 0; var5 < var3; ++var5) {
            if (var1.charAt(var2 - 1 - var5) != this.ՠ.charAt(var3 - 1 - var5)) {
               var4 = false;
               break;
            }
         }

         if (var4) {
            var1.setLength(var2 - var3);
         }
      }

   }

   public void append(StringBuffer var1, String var2, Object var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else {
         boolean var5 = this.Ϳ(var4);
         this.Ϳ(var1, var2, var3, var5);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer param1, String param2, Object param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, Object var3) {
      ၻ.Ϳ(var1, var3);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, Object var3) {
      var1.append(var3);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, Collection<?> var3) {
      var1.append(var3);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, Map<?, ?> var3) {
      var1.append(var3);
   }

   public void _/* $FF was: ԩ*/(StringBuffer var1, String var2, Object var3) {
      var1.append(this.ބ);
      var1.append(this.Ϳ(var3.getClass()));
      var1.append(this.ޅ);
   }

   public void append(StringBuffer var1, String var2, long var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, long var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, int var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, int var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, short var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, short var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, byte var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, byte var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, char var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, char var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, double var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, double var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, float var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, float var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, boolean var3) {
      this.Ԩ(var1, var2);
      this.Ϳ(var1, var2, var3);
      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, boolean var3) {
      var1.append(var3);
   }

   public void append(StringBuffer var1, String var2, Object[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, Object[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Object var5 = var3[var4];
         if (var4 > 0) {
            var1.append(this.֏);
         }

         if (var5 == null) {
            this.ԩ(var1, var2);
         } else {
            boolean var6 = this.ׯ;
            this.Ϳ(var1, var2, var5, var6);
         }
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԫ*/(StringBuffer var1, String var2, Object var3) {
      var1.append(this.ֈ);
      int var4 = Array.getLength(var3);

      for(int var5 = 0; var5 < var4; ++var5) {
         Object var6 = Array.get(var3, var5);
         if (var5 > 0) {
            var1.append(this.֏);
         }

         if (var6 == null) {
            this.ԩ(var1, var2);
         } else {
            boolean var7 = this.ׯ;
            this.Ϳ(var1, var2, var6, var7);
         }
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, Object[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, long[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, long[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         long var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, long[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, int[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, int[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         int var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, int[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, short[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, short[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         short var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, short[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, byte[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, byte[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         byte var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, byte[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, char[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, char[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         char var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, char[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, double[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, double[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         double var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, double[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, float[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, float[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         float var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, float[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void append(StringBuffer var1, String var2, boolean[] var3, Boolean var4) {
      this.Ԩ(var1, var2);
      if (var3 == null) {
         this.ԩ(var1, var2);
      } else if (this.Ϳ(var4)) {
         this.Ϳ(var1, var2, var3);
      } else {
         this.Ԩ(var1, var2, var3);
      }

      this.Ϳ(var1, var2);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2, boolean[] var3) {
      var1.append(this.ֈ);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var4 > 0) {
            var1.append(this.֏);
         }

         boolean var5 = var3[var4];
         this.Ϳ(var1, var2, var5);
      }

      var1.append(this.ؠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, boolean[] var3) {
      ˣ var10000 = this;
      int var4 = var3.length;
      var10000.Ԩ(var1, var2, var4);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, Object var2) {
      if (this.Ԩ && var2 != null) {
         Ԩ(var2);
         if (this.ԩ) {
            var1.append(this.Ϳ(var2.getClass()));
         } else {
            var1.append(var2.getClass().getName());
         }
      }

   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, Object var2) {
      if (this.ޅ() && var2 != null) {
         Ԩ(var2);
         var1.append('@');
         var1.append(Integer.toHexString(System.identityHashCode(var2)));
      }

   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1) {
      var1.append(this.ԫ);
   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1) {
      var1.append(this.Ԭ);
   }

   public void _/* $FF was: ԩ*/(StringBuffer var1, String var2) {
      var1.append(this.ށ);
   }

   public void _/* $FF was: ԩ*/(StringBuffer var1) {
      var1.append(this.ՠ);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2) {
      if (this.Ϳ && var2 != null) {
         var1.append(var2);
         var1.append(this.ԭ);
      }

   }

   public void _/* $FF was: Ϳ*/(StringBuffer var1, String var2) {
      this.ԩ(var1);
   }

   public void _/* $FF was: Ԩ*/(StringBuffer var1, String var2, int var3) {
      var1.append(this.ނ);
      var1.append(var3);
      var1.append(this.ރ);
   }

   public boolean _/* $FF was: Ϳ*/(Boolean var1) {
      return var1 == null ? this.ހ : var1;
   }

   public String _/* $FF was: Ϳ*/(Class<?> var1) {
      return ޒ.Ԭ(var1);
   }

   public boolean ރ() {
      return this.Ԩ;
   }

   public void _/* $FF was: ԫ*/(boolean var1) {
      this.Ԩ = var1;
   }

   public boolean ކ() {
      return this.ԩ;
   }

   public void _/* $FF was: Ԯ*/(boolean var1) {
      this.ԩ = var1;
   }

   public boolean ޅ() {
      return this.Ԫ;
   }

   public void _/* $FF was: ԭ*/(boolean var1) {
      this.Ԫ = var1;
   }

   public boolean ބ() {
      return this.Ϳ;
   }

   public void _/* $FF was: Ԭ*/(boolean var1) {
      this.Ϳ = var1;
   }

   public boolean ހ() {
      return this.ހ;
   }

   public void _/* $FF was: Ԩ*/(boolean var1) {
      this.ހ = var1;
   }

   public boolean ؠ() {
      return this.ׯ;
   }

   public void _/* $FF was: Ϳ*/(boolean var1) {
      this.ׯ = var1;
   }

   public String _/* $FF was: ԩ*/() {
      return this.ֈ;
   }

   public void _/* $FF was: ԩ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ֈ = var1;
   }

   public String _/* $FF was: Ϳ*/() {
      return this.ؠ;
   }

   public void _/* $FF was: Ϳ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ؠ = var1;
   }

   public String _/* $FF was: Ԩ*/() {
      return this.֏;
   }

   public void _/* $FF was: Ԩ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.֏ = var1;
   }

   public String _/* $FF was: ԫ*/() {
      return this.ԫ;
   }

   public void _/* $FF was: ԫ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ԫ = var1;
   }

   public String _/* $FF was: Ԫ*/() {
      return this.Ԭ;
   }

   public void _/* $FF was: Ԫ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.Ԭ = var1;
   }

   public String _/* $FF was: Ԭ*/() {
      return this.ԭ;
   }

   public void _/* $FF was: Ԭ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ԭ = var1;
   }

   public String _/* $FF was: ԭ*/() {
      return this.ՠ;
   }

   public void _/* $FF was: ԭ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ՠ = var1;
   }

   public boolean ނ() {
      return this.Ԯ;
   }

   public void _/* $FF was: Ԫ*/(boolean var1) {
      this.Ԯ = var1;
   }

   public boolean ށ() {
      return this.ԯ;
   }

   public void _/* $FF was: ԩ*/(boolean var1) {
      this.ԯ = var1;
   }

   public String _/* $FF was: Ԯ*/() {
      return this.ށ;
   }

   public void _/* $FF was: Ԯ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ށ = var1;
   }

   public String _/* $FF was: ֈ*/() {
      return this.ނ;
   }

   public void _/* $FF was: ՠ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ނ = var1;
   }

   public String _/* $FF was: ՠ*/() {
      return this.ރ;
   }

   public void _/* $FF was: ԯ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ރ = var1;
   }

   public String _/* $FF was: ׯ*/() {
      return this.ބ;
   }

   public void ֏(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ބ = var1;
   }

   public String ֏() {
      return this.ޅ;
   }

   public void _/* $FF was: ֈ*/(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.ޅ = var1;
   }

   public static final class Ϳ extends ˣ {
      public static final long ވ = 1L;

      public final Object އ() {
         return ˣ.DEFAULT_STYLE;
      }
   }

   public static final class Ԩ extends ˣ {
      public static final long ވ = 1L;

      public _/* $FF was: Ԩ*/() {
         ˣ.Ԩ var10000 = this;
         ˣ.Ԩ var10001 = this;
         super();
         this.ԫ("[");
         String var1;
         this.ԭ((var1 = ߴ.ޗ) + "  ");
         var10001.Ԫ(true);
         var10000.Ԫ(var1 + "]");
      }

      public final Object އ() {
         return ˣ.MULTI_LINE_STYLE;
      }
   }

   public static final class Ԫ extends ˣ {
      public static final long ވ = 1L;

      public _/* $FF was: Ԫ*/() {
         this.Ԭ(false);
      }

      public final Object އ() {
         return ˣ.NO_FIELD_NAMES_STYLE;
      }
   }

   public static final class Ԭ extends ˣ {
      public static final long ވ = 1L;

      public _/* $FF was: Ԭ*/() {
         this.Ԯ(true);
         this.ԭ(false);
      }

      public final Object އ() {
         return ˣ.SHORT_PREFIX_STYLE;
      }
   }

   public static final class Ԯ extends ˣ {
      public static final long ވ = 1L;

      public _/* $FF was: Ԯ*/() {
         this.ԫ(false);
         this.ԭ(false);
         this.Ԭ(false);
         this.ԫ("");
         this.Ԫ("");
      }

      public final Object އ() {
         return ˣ.SIMPLE_STYLE;
      }
   }
}
