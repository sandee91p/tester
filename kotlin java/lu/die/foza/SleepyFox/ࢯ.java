package lu.die.foza.SleepyFox;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Array;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ࢯ extends ࢧ {
   @NotNull
   public static final ࢯ.Ϳ Ԭ;
   @NotNull
   public static final ࢯ ԭ;
   @NotNull
   public static final ʹ<Object> Ԯ;

   static {
      ࢯ.Ϳ var10000 = Ԭ = new ࢯ.Ϳ();
      ԭ = new ࢯ();
      Pair[] var10001 = new Pair[]{TuplesKt.to(Integer.class, 0), TuplesKt.to(Integer.TYPE, 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
      Boolean var0 = Boolean.FALSE;
      var10001[2] = TuplesKt.to(Boolean.class, var0);
      var10001[3] = TuplesKt.to(Boolean.TYPE, var0);
      var10001[4] = TuplesKt.to(Double.class, 0.0D);
      var10001[5] = TuplesKt.to(Double.TYPE, 0.0D);
      var10001[6] = TuplesKt.to(Float.class, 0.0F);
      var10001[7] = TuplesKt.to(Float.TYPE, 0.0F);
      var10001[8] = TuplesKt.to(Long.class, 0L);
      var10001[9] = TuplesKt.to(Long.TYPE, 0L);
      var10001[10] = TuplesKt.to(Byte.class, (byte)0);
      var10001[11] = TuplesKt.to(Byte.TYPE, (byte)0);
      var10001[12] = TuplesKt.to(Short.class, Short.valueOf((short)0));
      var10001[13] = TuplesKt.to(Short.TYPE, Short.valueOf((short)0));
      var10001[14] = TuplesKt.to(Character.class, '0');
      var10001[15] = TuplesKt.to(Character.TYPE, '0');
      var10001[16] = TuplesKt.to(String.class, "0");
      var10001[17] = TuplesKt.to(CharSequence.class, "0");
      ႎ var1;
      (var1 = ႎ.Ϳ).getClass();
      var1.getClass();
      var10001[18] = TuplesKt.to(ParceledListSlice.class, ႎ.ԩ);
      Ԯ = var10000.Ϳ(var10001);
   }

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      Object var10000;
      Object var3;
      try {
         var10000 = super.Ϳ(var1);
      } catch (Exception var2) {
         var3 = Ԭ.Ϳ(var1.Ԩ.getReturnType());
         return var3;
      }

      var3 = var10000;
      return var3;
   }

   @SourceDebugExtension({"SMAP\nFozaEnhancedAutoProcessObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaEnhancedAutoProcessObserver.kt\nlu/die/foza/HookEntity/BaseEntity/FozaEnhancedAutoProcessObserver$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n13309#2,2:87\n1#3:89\n*S KotlinDebug\n*F\n+ 1 FozaEnhancedAutoProcessObserver.kt\nlu/die/foza/HookEntity/BaseEntity/FozaEnhancedAutoProcessObserver$Companion\n*L\n17#1:87,2\n*E\n"})
   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      // $FF: synthetic method
      public static final ʹ _/* $FF was: Ϳ*/(ࢯ.Ϳ var0, Pair... var1) {
         return var0.Ϳ(var1);
      }

      @NotNull
      public final ࢯ _/* $FF was: Ϳ*/() {
         return ࢯ.ԭ;
      }

      @Nullable
      public final Object _/* $FF was: Ϳ*/(@NotNull Class<?> var1) {
         if (!Intrinsics.areEqual(var1, Void.TYPE)) {
            Object var2;
            if ((var2 = ʹ.Ϳ(ࢯ.Ԯ, var1.hashCode(), (Object)null, 2, (Object)null)) != null) {
               return var2;
            }

            if (var1.isArray()) {
               Class var3;
               if ((var3 = var1.getComponentType()) != null) {
                  return Array.newInstance(var3, 0);
               }
            } else if (List.class.isAssignableFrom(var1)) {
               return CollectionsKt.emptyList();
            }
         }

         return null;
      }

      public final <K extends Class<?>, V> ʹ<V> _/* $FF was: Ϳ*/(Pair<? extends K, ? extends V>... var1) {
         ʹ var5;
         var5 = new ʹ.<init>(var1.length);
         int var2 = 0;

         for(int var3 = var1.length; var2 < var3; ++var2) {
            Pair var10001 = var1[var2];
            int var4 = var1[var2].getFirst().hashCode();
            var5.Ԩ(var4, var10001.getSecond());
         }

         return var5;
      }
   }
}
