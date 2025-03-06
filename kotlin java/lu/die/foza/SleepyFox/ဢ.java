package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class ဢ<F extends IntentFilter> {
   public final ʹ<F[]> Ϳ;
   public final ʹ<F[]> Ԩ;
   public final ʹ<F[]> ԩ;
   public final ʹ<F[]> Ԫ;
   public final ʹ<F[]> ԫ;
   public final ʹ<F[]> Ԭ;

   public ဢ() {
      ဢ var10000 = this;
      ဢ var10001 = this;
      ဢ var10002 = this;
      ဢ var10003 = this;
      ဢ var10004 = this;
      ဢ var10005 = this;
      super();
      ʹ var1;
      var1 = new ʹ.<init>();
      var10005.Ϳ = var1;
      var1 = new ʹ.<init>();
      var10004.Ԩ = var1;
      var1 = new ʹ.<init>();
      var10003.ԩ = var1;
      var1 = new ʹ.<init>();
      var10002.Ԫ = var1;
      var1 = new ʹ.<init>();
      var10001.ԫ = var1;
      var1 = new ʹ.<init>();
      var10000.Ԭ = var1;
   }

   public static Set<String> _/* $FF was: Ϳ*/(Intent var0) {
      Set var1;
      if ((var1 = var0.getCategories()) == null) {
         return null;
      } else {
         final String[] var2 = (String[])var1.toArray(new String[0]);
         return new AbstractSet<String>() {
            public final String[] Ϳ = var2;
            public final int Ԩ = var2.length;

            public Iterator<String> iterator() {
               null.Ϳ var10000 = new null.Ϳ();
               var10000.Ϳ = 0;
               return var10000;
            }

            public int size() {
               return this.Ԩ;
            }

            final class Ϳ implements Iterator<String> {
               public int Ϳ = 0;

               public _/* $FF was: Ϳ*/() {
               }

               public boolean hasNext() {
                  return this.Ϳ < Ԩ;
               }

               public String _/* $FF was: Ϳ*/() {
                  String[] var10000 = Ϳ;
                  int var1;
                  this.Ϳ = (var1 = this.Ϳ) + 1;
                  return var10000[var1];
               }
            }
         };
      }
   }

   public final void _/* $FF was: Ϳ*/(F var1) {
      Iterator var2 = var1.schemesIterator();
      int var10000 = this.Ϳ(var1, var2, this.Ԫ);
      int var6 = this.Ԩ(var1);
      if (var10000 == 0 && var6 == 0) {
         Iterator var3 = var1.actionsIterator();
         ʹ var4 = this.ԫ;
         this.Ϳ(var1, var3, var4);
      }

      if (var6 != 0) {
         ဢ var8 = this;
         ဢ var10001 = this;
         Iterator var5 = var1.actionsIterator();
         ʹ var7 = var10001.Ԭ;
         var8.Ϳ(var1, var5, var7);
      }

   }

   public final List<ResolveInfo> _/* $FF was: Ϳ*/(Intent var1, String var2, int var3) {
      boolean var4;
      if ((var3 & 65536) != 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      return this.Ϳ(var1, var2, var4, var3);
   }

   public final List<ResolveInfo> _/* $FF was: Ϳ*/(Intent var1, String var2, boolean var3, int var4) {
      String var5 = var1.getScheme();
      ArrayList var6;
      var6 = new ArrayList.<init>();
      ʹ var7;
      var7 = new ʹ.<init>(10);
      IntentFilter[] var8 = null;
      IntentFilter[] var9 = null;
      IntentFilter[] var10 = null;
      IntentFilter[] var11 = null;
      int var12;
      if (var2 != null && !var2.isEmpty() && (var12 = var2.indexOf(47)) > 0) {
         String var13;
         if (!(var13 = var2.substring(0, var12)).equals("*")) {
            if (var2.length() == var12 + 2 && var2.charAt(var12 + 1) == '*') {
               var8 = (IntentFilter[])this.Ԩ.Ԩ(var13.hashCode());
            } else {
               var8 = (IntentFilter[])this.Ϳ.Ԩ(var2.hashCode());
            }

            var9 = (IntentFilter[])this.ԩ.Ԩ(var13.hashCode());
            var10 = (IntentFilter[])this.ԩ.Ԩ(42);
         } else if (var1.getAction() != null) {
            var8 = (IntentFilter[])this.Ԭ.Ԩ(var1.getAction().hashCode());
         }
      }

      if (var5 != null) {
         var11 = (IntentFilter[])this.Ԫ.Ԩ(var5.hashCode());
      }

      if ((var2 == null || var2.isEmpty()) && (var5 == null || var5.isEmpty()) && var1.getAction() != null) {
         var8 = (IntentFilter[])this.ԫ.Ԩ(var1.getAction().hashCode());
      }

      Set var14 = Ϳ(var1);
      if (var8 != null) {
         this.Ϳ(var1, var14, var3, var2, var5, var8, var6, var7, var4);
      }

      if (var9 != null) {
         this.Ϳ(var1, var14, var3, var2, var5, var9, var6, var7, var4);
      }

      if (var10 != null) {
         this.Ϳ(var1, var14, var3, var2, var5, var10, var6, var7, var4);
      }

      if (var11 != null) {
         this.Ϳ(var1, var14, var3, var2, var5, var11, var6, var7, var4);
      }

      return var6;
   }

   public abstract F[] _/* $FF was: Ϳ*/(int var1);

   public abstract void _/* $FF was: Ϳ*/(F var1, int var2, int var3, List<ResolveInfo> var4, ʹ var5);

   public final void _/* $FF was: Ϳ*/(ʹ<F[]> var1, String var2, F var3) {
      IntentFilter[] var4;
      IntentFilter[] var7;
      int var8;
      if ((var4 = (IntentFilter[])var1.Ԩ(var8 = var2.hashCode())) == null) {
         IntentFilter[] var10000 = var7 = this.Ϳ(2);
         var1.Ԩ(var8, var7);
         var10000[0] = var3;
      } else {
         int var5 = var4.length;

         int var6;
         for(var6 = var5; var6 > 0 && var4[var6 - 1] == null; --var6) {
         }

         if (var6 < var5) {
            var4[var6] = var3;
         } else {
            IntentFilter[] var10002 = var7 = this.Ϳ(var5 * 3 / 2);
            System.arraycopy(var4, 0, var7, 0, var5);
            var10002[var5] = var3;
            var1.Ԩ(var8, var7);
         }
      }

   }

   public final int _/* $FF was: Ԩ*/(F var1) {
      Iterator var2;
      if ((var2 = var1.typesIterator()) == null) {
         return 0;
      } else {
         int var3 = 0;

         while(var2.hasNext()) {
            String var4;
            String var10000 = var4 = (String)var2.next();
            ++var3;
            int var5;
            String var6;
            if ((var5 = var10000.indexOf(47)) > 0) {
               var6 = var4.substring(0, var5).intern();
            } else {
               var6 = var4.concat("/*");
               var10000 = var6;
               var6 = var4;
               var4 = var10000;
            }

            this.Ϳ(this.Ϳ, var4, var1);
            if (var5 > 0) {
               this.Ϳ(this.Ԩ, var6, var1);
            } else {
               this.Ϳ(this.ԩ, var6, var1);
            }
         }

         return var3;
      }
   }

   public final int _/* $FF was: Ϳ*/(F var1, Iterator<String> var2, ʹ<F[]> var3) {
      if (var2 == null) {
         return 0;
      } else {
         int var4 = 0;

         while(var2.hasNext()) {
            String var5 = (String)var2.next();
            ++var4;
            this.Ϳ(var3, var5, var1);
         }

         return var4;
      }
   }

   public final void _/* $FF was: Ϳ*/(Intent var1, Set<String> var2, boolean var3, String var4, String var5, F[] var6, List<ResolveInfo> var7, ʹ var8, int var9) {
      String var15 = var1.getAction();
      Uri var10 = var1.getData();
      int var11;
      if (var6 != null) {
         var11 = var6.length;
      } else {
         var11 = 0;
      }

      IntentFilter var13;
      for(int var12 = 0; var12 < var11 && (var13 = var6[var12]) != null; ++var12) {
         String var14;
         if (var4 != null && !var4.isEmpty()) {
            var14 = var4;
         } else {
            var14 = null;
         }

         int var16;
         if ((var16 = var13.match(var15, var14, var5, var10, var2, "Neko")) >= 0 && (!var3 || var13.hasCategory("android.intent.category.DEFAULT"))) {
            this.Ϳ(var13, var16, var9, var7, var8);
         }
      }

   }
}
