package lu.die.foza.SleepyFox;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ʰ {
   @NotNull
   public static final ʰ.Ϳ ԩ = new ʰ.Ϳ();
   @NotNull
   public static final ʰ Ԫ = new ʰ();
   @NotNull
   public final <undefinedtype> Ϳ;
   @NotNull
   public final <undefinedtype> Ԩ;

   public ʰ() {
      ʰ var10000 = this;
      ʰ var10001 = this;
      super();
      ໞ var1;
      var1 = new ໞ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            label32: {
               Object[] var10000;
               boolean var10001;
               try {
                  var10000 = var1.ԩ;
               } catch (Exception var5) {
                  var10001 = false;
                  break label32;
               }

               Object[] var6 = var10000;

               int var7;
               try {
                  var7 = ރ.Ϳ.Ԩ(var6, Uri.class);
               } catch (Exception var4) {
                  var10001 = false;
                  break label32;
               }

               int var2 = var7;
               if (var7 >= 0) {
                  try {
                     FozaAnkingProvider.Ϳ.Ԭ var10002 = FozaAnkingProvider.Ϳ.Ϳ;
                     Object var10003 = var6[var2];
                     Intrinsics.checkNotNull(var6[var2], "null cannot be cast to non-null type android.net.Uri");
                     var6[var2] = FozaAnkingProvider.Ϳ.Ԭ.Ϳ(var10002, (Uri)var10003, 0, 2, (Object)null);
                  } catch (Exception var3) {
                     var10001 = false;
                  }
               }
            }

            ࢯ.Ԭ.getClass();
            return ࢯ.ՠ().Ϳ(var1);
         }
      }.<init>();
      var10001.Ϳ = var1;
      var1 = new ໞ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            label85: {
               Object[] var10000;
               boolean var10001;
               try {
                  var10000 = var1.ԩ;
               } catch (Exception var15) {
                  var10001 = false;
                  break label85;
               }

               Object[] var16 = var10000;

               int var18;
               try {
                  var18 = ރ.Ϳ.Ԩ(var16, List.class);
               } catch (Exception var14) {
                  var10001 = false;
                  break label85;
               }

               int var2 = var18;
               if (var18 >= 0) {
                  label88: {
                     Object var19;
                     List var20;
                     ArrayList var23;
                     try {
                        var19 = var16[var2];
                        Intrinsics.checkNotNull(var16[var2], "null cannot be cast to non-null type kotlin.collections.List<*>");
                        var20 = (List)var19;
                        var23 = new ArrayList;
                     } catch (Exception var13) {
                        var10001 = false;
                        break label88;
                     }

                     ArrayList var3 = var23;

                     Iterator var21;
                     try {
                        var23.<init>();
                        var21 = var20.iterator();
                     } catch (Exception var12) {
                        var10001 = false;
                        break label88;
                     }

                     Iterator var4 = var21;

                     while(true) {
                        boolean var22;
                        try {
                           var22 = var4.hasNext();
                        } catch (Exception var7) {
                           var10001 = false;
                           break;
                        }

                        if (!var22) {
                           try {
                              var16[var2] = var3;
                           } catch (Exception var6) {
                              var10001 = false;
                           }
                           break;
                        }

                        try {
                           var19 = var4.next();
                        } catch (Exception var11) {
                           var10001 = false;
                           break;
                        }

                        Object var5 = var19;

                        try {
                           var22 = var19 instanceof Uri;
                        } catch (Exception var10) {
                           var10001 = false;
                           break;
                        }

                        if (var22) {
                           Uri var24;
                           try {
                              var24 = FozaAnkingProvider.Ϳ.Ԭ.Ϳ(FozaAnkingProvider.Ϳ.Ϳ, (Uri)var5, 0, 2, (Object)null);
                           } catch (Exception var9) {
                              var10001 = false;
                              break;
                           }

                           Uri var17 = var24;
                           if (var24 != null) {
                              try {
                                 var3.add(var17);
                              } catch (Exception var8) {
                                 var10001 = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            ࢯ.Ԭ.getClass();
            return ࢯ.ՠ().Ϳ(var1);
         }
      }.<init>();
      var10000.Ԩ = var1;
   }

   public final void _/* $FF was: Ϳ*/(@Nullable ˁ var1) {
      if (var1 != null) {
         ˁ var10000;
         boolean var10001;
         ˁ var10002;
         <undefinedtype> var10003;
         String[] var10004;
         ʰ var62;
         try {
            var10000 = var1;
            var62 = this;
            var10002 = var1;
            var10003 = this.Ϳ;
            var10004 = new String[3];
         } catch (Throwable var57) {
            var10001 = false;
            return;
         }

         String[] var10005 = var10004;
         String[] var10006 = var10004;
         String[] var10007 = var10004;
         byte var10008 = 0;

         try {
            var10007[var10008] = "revokeUriPermission";
         } catch (Throwable var56) {
            var10001 = false;
            return;
         }

         byte var60 = 1;

         try {
            var10006[var60] = "grantUriPermission";
         } catch (Throwable var55) {
            var10001 = false;
            return;
         }

         byte var59 = 2;

         String var63;
         try {
            var10005[var59] = "checkUriPermission";
            var10002.Ϳ((ໞ)var10003, (String[])var10004);
            var63 = "checkUriPermissions";
         } catch (Throwable var54) {
            var10001 = false;
            return;
         }

         String var58 = var63;

         boolean var61;
         try {
            var10000.Ϳ((String)var58, (ໞ)var62.Ԩ);
            var61 = ތ.Ԯ;
         } catch (Throwable var53) {
            var10001 = false;
            return;
         }

         if (!var61) {
            try {
               ჽ.Ԩ.getClass();
            } catch (Throwable var52) {
               var10001 = false;
               return;
            }

            try {
               ჽ.Ϳ().Ϳ(var1);
            } catch (Throwable var51) {
               var10001 = false;
               return;
            }
         }

      }
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ʰ _/* $FF was: Ϳ*/() {
         return ʰ.Ԫ;
      }
   }
}
