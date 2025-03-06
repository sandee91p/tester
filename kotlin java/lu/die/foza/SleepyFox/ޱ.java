package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDiscoveryLocalProviderEnhancer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryLocalProviderEnhancer.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalProviderEnhancer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class ޱ {
   @NotNull
   public static final ޱ Ϳ = new ޱ();
   @NotNull
   public static final ConditionVariable Ԩ = new ConditionVariable();
   @NotNull
   public static final ಀ<Object> ԩ;
   @NotNull
   public static final Map<? extends Object, ? extends Object> Ԫ;
   @NotNull
   public static final ૹ<List<?>> ԫ;
   @Nullable
   public static ʹ Ԭ;

   static {
      Class[] var0;
      Class[] var10002 = var0 = new Class[2];
      var10002[0] = Context.class;
      var10002[1] = List.class;
      ԩ = (new ಀ("installContentProviders", var0)).Ϳ(ActivityThread.class);

      Object var7;
      label77: {
         Map var9;
         label76: {
            label81: {
               ˋ var10000;
               boolean var10001;
               try {
                  var10000 = ˋ.Ϳ;
                  ࢭ.ֈ.getClass();
               } catch (Throwable var6) {
                  var10001 = false;
                  break label81;
               }

               label71:
               try {
                  Object var8 = var10000.Ԩ((Object)ࢭ.ׯ, "mProviderMap");
                  Intrinsics.checkNotNull(var8);
                  var9 = TypeIntrinsics.asMutableMap(var8);
                  break label76;
               } catch (Throwable var5) {
                  var10001 = false;
                  break label71;
               }
            }

            var7 = new ބ.<init>();
            break label77;
         }

         var7 = var9;
      }

      Ԫ = (Map)var7;
      ԫ = new ૹ("providers");
      Ԭ = new ʹ(10);
   }

   public final void _/* $FF was: ԩ*/() {
      Ԫ.clear();
   }

   @NotNull
   public final Map<? extends Object, ? extends Object> _/* $FF was: Ԩ*/() {
      return Ԫ;
   }

   public final void _/* $FF was: Ϳ*/() {
      ࢦ var10000;
      boolean var10001;
      try {
         var10000 = ࢦ.Ϳ;
      } catch (Exception var27) {
         var10001 = false;
         return;
      }

      ࢦ var28 = var10000;

      String var32;
      try {
         var32 = var10000.ԩ();
      } catch (Exception var26) {
         var10001 = false;
         return;
      }

      String var1 = var32;
      if (var32 != null) {
         try {
            var28.getClass();
         } catch (Exception var25) {
            var10001 = false;
            return;
         }

         boolean var33;
         try {
            var33 = ࢦ.ԩ;
         } catch (Exception var24) {
            var10001 = false;
            return;
         }

         ProviderInfo[] var35;
         ProviderInfo[] var31;
         label195: {
            PackageInfo var30;
            label173: {
               PackageInfo var34;
               if (var33) {
                  try {
                     ࡠ.ԩ.getClass();
                  } catch (Exception var23) {
                     var10001 = false;
                     return;
                  }

                  try {
                     var34 = ࡠ.ԫ().Ԩ((String)var1, 136);
                  } catch (Exception var22) {
                     var10001 = false;
                     return;
                  }

                  var30 = var34;
                  if (var34 != null) {
                     break label173;
                  }
               } else {
                  try {
                     var34 = ࢼ.Ϳ.Ԩ((String)var1, 136);
                  } catch (Exception var21) {
                     var10001 = false;
                     return;
                  }

                  var30 = var34;
                  if (var34 != null) {
                     break label173;
                  }
               }

               var31 = null;
               break label195;
            }

            try {
               var35 = var30.providers;
            } catch (Exception var20) {
               var10001 = false;
               return;
            }

            var31 = var35;
         }

         if (var31 == null) {
            try {
               var35 = new ProviderInfo[0];
            } catch (Exception var19) {
               var10001 = false;
               return;
            }

            var31 = var35;
         }

         ࢦ var38;
         ArrayList var10002;
         try {
            var35 = var31;
            var38 = var28;
            var10002 = new ArrayList;
         } catch (Exception var18) {
            var10001 = false;
            return;
         }

         ArrayList var29 = var10002;

         String var39;
         try {
            var10002.<init>();
            var39 = var38.Ԫ();
         } catch (Exception var17) {
            var10001 = false;
            return;
         }

         String var2 = var39;
         int var3 = 0;

         int var36;
         try {
            var36 = var35.length;
         } catch (Exception var16) {
            var10001 = false;
            return;
         }

         for(int var4 = var36; var3 < var4; ++var3) {
            ProviderInfo var37;
            try {
               var37 = var31[var3];
            } catch (Exception var15) {
               var10001 = false;
               return;
            }

            ProviderInfo var5 = var37;

            try {
               var33 = var37.enabled;
            } catch (Exception var14) {
               var10001 = false;
               return;
            }

            if (var33) {
               try {
                  var32 = var5.authority;
               } catch (Exception var13) {
                  var10001 = false;
                  return;
               }

               label133: {
                  String var6 = var32;
                  if (var32 != null) {
                     try {
                        var36 = var6.length();
                     } catch (Exception var12) {
                        var10001 = false;
                        return;
                     }

                     if (var36 != 0) {
                        var33 = false;
                        break label133;
                     }
                  }

                  var33 = true;
               }

               if (!var33) {
                  try {
                     var33 = Intrinsics.areEqual(var2, var5.processName);
                  } catch (Exception var11) {
                     var10001 = false;
                     return;
                  }

                  if (var33) {
                     try {
                        var37 = (ProviderInfo)ၡ.Ϳ.Ϳ((ComponentInfo)var5);
                     } catch (Exception var10) {
                        var10001 = false;
                        return;
                     }

                     var5 = var37;
                     if (var37 != null) {
                        try {
                           var29.add(var5);
                        } catch (Exception var9) {
                           var10001 = false;
                           return;
                        }
                     }
                  }
               }
            }
         }

         ૹ var40;
         try {
            var40 = ԫ;
            ࢭ.ֈ.getClass();
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         try {
            var40.Ϳ(ࢭ.ހ, var29);
         } catch (Exception var7) {
            var10001 = false;
         }

      }
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull List<?> var1) {
      ʹ var4;
      if ((var4 = Ԭ) == null) {
         return false;
      } else {
         List var10000 = var1;
         ૹ var5;
         var5 = new ૹ.<init>("info");

         int var6;
         for(Iterator var2 = var10000.iterator(); var2.hasNext(); var4.ԩ(var6)) {
            Object var3;
            Intrinsics.checkNotNull(var3 = var2.next());
            if ((var3 = var5.ԩ(var3)) != null) {
               var6 = var3.hashCode();
            } else {
               var6 = 0;
            }
         }

         return true;
      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Context var1, @NotNull Object var2) {
      label775: {
         List var10000;
         boolean var10001;
         try {
            var10000 = (List)ԫ.ԩ(var2);
         } catch (Throwable var75) {
            var10001 = false;
            break label775;
         }

         List var76;
         boolean var79;
         label764: {
            var76 = var10000;
            if (var10000 != null) {
               try {
                  var79 = var76.isEmpty();
               } catch (Throwable var74) {
                  var10001 = false;
                  break label775;
               }

               if (!var79) {
                  var79 = false;
                  break label764;
               }
            }

            var79 = true;
         }

         if (var79) {
            Ԩ.open();
            return;
         }

         ʹ var80;
         try {
            var80 = Ԭ;
         } catch (Throwable var73) {
            var10001 = false;
            break label775;
         }

         ʹ var77 = var80;
         if (var80 == null) {
            Ԩ.open();
            return;
         }

         Object var81;
         try {
            Ԭ = null;
            var81 = var76.get(0);
         } catch (Throwable var72) {
            var10001 = false;
            break label775;
         }

         Object var3 = var81;
         int var78;
         if (var81 != null) {
            int var82;
            try {
               var82 = var3.hashCode();
            } catch (Throwable var71) {
               var10001 = false;
               break label775;
            }

            var78 = var82;
         } else {
            var78 = 0;
         }

         try {
            var79 = var77.Ϳ(var78);
         } catch (Throwable var70) {
            var10001 = false;
            break label775;
         }

         if (var79) {
            Ԩ.open();
            return;
         }

         ಀ var83;
         try {
            var83 = ԩ;
            ࢭ.ֈ.getClass();
         } catch (Throwable var69) {
            var10001 = false;
            break label775;
         }

         label736:
         try {
            var83.Ϳ(ࢭ.ׯ, var1, var76);
         } catch (Throwable var68) {
            var10001 = false;
            break label736;
         }
      }

      Ԩ.open();
   }

   public final void _/* $FF was: Ԫ*/() {
      Ԩ.block(1000L);
   }
}
