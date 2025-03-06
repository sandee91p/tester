package lu.die.foza.SleepyFox;

import android.content.UriPermission;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ჽ implements ໞ {
   @NotNull
   public static final ჽ.Ϳ Ԩ = new ჽ.Ϳ();
   @NotNull
   public static final ჽ ԩ = new ჽ();
   @NotNull
   public final <undefinedtype> Ϳ;

   public ჽ() {
      ჽ var10000 = this;
      super();
      ࢯ var1;
      var1 = new ࢯ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            label84: {
               List var10000;
               boolean var10001;
               try {
                  var10000 = ႎ.Ϳ.Ϳ(super.Ϳ(var1));
               } catch (Exception var12) {
                  var10001 = false;
                  break label84;
               }

               List var13 = var10000;
               if (var10000 != null) {
                  label87: {
                     ArrayList var20;
                     try {
                        var10000 = var13;
                        var20 = new ArrayList;
                     } catch (Exception var11) {
                        var10001 = false;
                        break label87;
                     }

                     ArrayList var14 = var20;

                     Iterator var17;
                     try {
                        var20.<init>();
                        var17 = var10000.iterator();
                     } catch (Exception var10) {
                        var10001 = false;
                        break label87;
                     }

                     Iterator var2 = var17;

                     while(true) {
                        boolean var18;
                        try {
                           var18 = var2.hasNext();
                        } catch (Exception var5) {
                           var10001 = false;
                           break;
                        }

                        if (!var18) {
                           try {
                              return ႎ.Ϳ.Ϳ(var14, var1.Ԩ);
                           } catch (Exception var4) {
                              var10001 = false;
                              break;
                           }
                        }

                        Object var19;
                        try {
                           var19 = var2.next();
                        } catch (Exception var9) {
                           var10001 = false;
                           break;
                        }

                        Object var3 = var19;

                        try {
                           var18 = var19 instanceof UriPermission;
                        } catch (Exception var8) {
                           var10001 = false;
                           break;
                        }

                        if (var18) {
                           try {
                              var18 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(((UriPermission)var3).getUri().getAuthority());
                           } catch (Exception var7) {
                              var10001 = false;
                              break;
                           }

                           if (!var18) {
                              try {
                                 var14.add(var3);
                              } catch (Exception var6) {
                                 var10001 = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            ႎ var15;
            Object var16;
            if ((var15 = ႎ.Ϳ).Ϳ(var1.Ԩ.getReturnType())) {
               var15.getClass();
               var16 = ႎ.ԩ;
            } else {
               var16 = CollectionsKt.emptyList();
            }

            return var16;
         }
      }.<init>();
      var10000.Ϳ = var1;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ˁ var1) {
      ჽ var10001 = this;
      var1.Ϳ((String)"takePersistableUriPermission", (ໞ)this);
      String var2 = "getUriPermissions";
      var1.Ϳ((String)var2, (ໞ)var10001.Ϳ);
   }

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      label51: {
         Object[] var10000;
         boolean var10001;
         try {
            var10000 = var1.ԩ;
         } catch (Exception var7) {
            var10001 = false;
            break label51;
         }

         Object[] var8 = var10000;

         int var10;
         try {
            var10 = ރ.Ϳ.Ԩ(var8, Uri.class);
         } catch (Exception var6) {
            var10001 = false;
            break label51;
         }

         int var2 = var10;
         if (var10 >= 0) {
            label53: {
               Uri var12;
               try {
                  Object var11 = var8[var2];
                  Intrinsics.checkNotNull(var8[var2], "null cannot be cast to non-null type android.net.Uri");
                  var12 = (Uri)var11;
               } catch (Exception var5) {
                  var10001 = false;
                  break label53;
               }

               Uri var9 = var12;

               boolean var13;
               try {
                  var13 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var9.getAuthority());
               } catch (Exception var4) {
                  var10001 = false;
                  break label53;
               }

               if (var13) {
                  label54: {
                     try {
                        var9.toString();
                     } catch (Exception var3) {
                        var10001 = false;
                        break label54;
                     }

                     return null;
                  }
               }
            }
         }
      }

      ࢯ.Ԭ.getClass();
      return ࢯ.ՠ().Ϳ(var1);
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ჽ _/* $FF was: Ϳ*/() {
         return ჽ.ԩ;
      }
   }
}
