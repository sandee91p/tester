package lu.die.foza.SleepyFox;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࣂ extends ຘ.Ԩ {
   @NotNull
   public static final ࣂ ؠ = new ࣂ();
   @NotNull
   public static ConcurrentLinkedDeque<ࣁ> ހ = new ConcurrentLinkedDeque();
   public static int ށ = 100;
   @NotNull
   public static ArrayList<ࣁ> ނ = new ArrayList();
   @NotNull
   public static String ރ = "";

   public boolean _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable String var2, @Nullable String var3) {
      ࣁ var10000;
      boolean var10001;
      try {
         var10000 = new ࣁ;
      } catch (Exception var8) {
         var10001 = false;
         return false;
      }

      ࣁ var9;
      ࣁ var13 = var9 = var10000;

      ConcurrentLinkedDeque var11;
      try {
         var9.<init>();
         var9.Ϳ = var2;
         var9.Ԩ = var3;
         var13.ԩ = var1;
         var10000.Ԫ = System.currentTimeMillis();
         var11 = ހ;
      } catch (Exception var7) {
         var10001 = false;
         return false;
      }

      ConcurrentLinkedDeque var10 = var11;

      while(true) {
         int var12;
         int var14;
         try {
            var12 = var10.size();
            var14 = ށ;
         } catch (Exception var5) {
            var10001 = false;
            break;
         }

         if (var12 <= var14) {
            try {
               var10.addLast(var9);
               return true;
            } catch (Exception var4) {
               var10001 = false;
               break;
            }
         }

         try {
            var10.removeFirst();
         } catch (Exception var6) {
            var10001 = false;
            break;
         }
      }

      return false;
   }

   public void _/* $FF was: ԭ*/(int var1) {
      ށ = var1;
   }

   public void _/* $FF was: Ԭ*/() {
      try {
         ހ = new ConcurrentLinkedDeque();
      } catch (Exception var1) {
      }

   }

   public int _/* $FF was: ԩ*/() {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: ԫ*/() {
      try {
         ނ = new ArrayList();
      } catch (Exception var1) {
      }

   }

   @Nullable
   public ࣁ _/* $FF was: ԫ*/(int var1) {
      try {
         return (ࣁ)ނ.get(var1);
      } catch (Exception var2) {
         return null;
      }
   }

   @NotNull
   public String _/* $FF was: Ԫ*/(@Nullable String var1) {
      if (var1 == null || StringsKt.isBlank(var1)) {
         return ރ;
      } else {
         ރ = var1;
         return "";
      }
   }
}
