package lu.die.foza.SleepyFox;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ႎ {
   @NotNull
   public static final ႎ Ϳ;
   @NotNull
   public static final ૹ<List<?>> Ԩ;
   @Nullable
   public static final Object ԩ;

   static {
      ႎ var10000 = Ϳ = new ႎ();
      Ԩ = new ૹ("mList");
      ԩ = var10000.Ϳ(CollectionsKt.emptyList());
   }

   @Nullable
   public final List<?> _/* $FF was: Ϳ*/(@Nullable Object var1) {
      label415: {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = ތ.Ԯ;
         } catch (Throwable var57) {
            var10001 = false;
            break label415;
         }

         if (var10000) {
            label418: {
               try {
                  var10000 = var1 instanceof ParceledListSlice;
               } catch (Throwable var55) {
                  var10001 = false;
                  break label418;
               }

               List var59;
               if (var10000) {
                  try {
                     var59 = ((ParceledListSlice)var1).getList();
                  } catch (Throwable var54) {
                     var10001 = false;
                     break label418;
                  }
               } else {
                  try {
                     var59 = (List)var1;
                  } catch (Throwable var53) {
                     var10001 = false;
                     break label418;
                  }
               }

               List var58 = var59;
               return var58;
            }
         } else {
            label419: {
               if (var1 == null) {
                  return null;
               }

               try {
                  var10000 = ParceledListSlice.class.isAssignableFrom(var1.getClass());
               } catch (Throwable var56) {
                  var10001 = false;
                  break label419;
               }

               if (!var10000) {
                  label396:
                  try {
                     return (List)var1;
                  } catch (Throwable var52) {
                     var10001 = false;
                     break label396;
                  }
               } else {
                  label394:
                  try {
                     return (List)Ԩ.ԩ(var1);
                  } catch (Throwable var51) {
                     var10001 = false;
                     break label394;
                  }
               }
            }
         }
      }

      ൎ.Ϳ.Ԫ();
      return null;
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull Class<?> var1) {
      try {
         return ParceledListSlice.class.isAssignableFrom(var1);
      } finally {
         ൎ.Ϳ.Ԫ();
         return false;
      }
   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@Nullable List<?> var1, @NotNull Method var2) {
      label245: {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = ތ.Ԯ;
         } catch (Throwable var32) {
            var10001 = false;
            break label245;
         }

         if (var10000) {
            label247: {
               try {
                  var10000 = this.Ϳ(var2.getReturnType());
               } catch (Throwable var29) {
                  var10001 = false;
                  break label247;
               }

               if (!var10000) {
                  return var1;
               }

               label229:
               try {
                  return new ParceledListSlice(var1);
               } catch (Throwable var28) {
                  var10001 = false;
                  break label229;
               }
            }
         } else {
            label248: {
               try {
                  var10000 = ParceledListSlice.class.isAssignableFrom(var2.getReturnType());
               } catch (Throwable var31) {
                  var10001 = false;
                  break label248;
               }

               if (!var10000) {
                  return var1;
               }

               label236:
               try {
                  return this.Ϳ(var1);
               } catch (Throwable var30) {
                  var10001 = false;
                  break label236;
               }
            }
         }
      }

      ൎ.Ϳ.Ԫ();
      return null;
   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@Nullable List<?> var1) {
      try {
         return new ParceledListSlice(var1);
      } finally {
         ൎ.Ϳ.Ԫ();
         return null;
      }
   }

   @NotNull
   public final Class<?> _/* $FF was: Ԩ*/() {
      return ParceledListSlice.class;
   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/() {
      return ԩ;
   }
}
