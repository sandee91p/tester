package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources.Theme;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ഩ {
   @NotNull
   public static final ഩ Ϳ = new ഩ();
   @NotNull
   public static final ބ<String, ഩ.Ϳ> Ԩ = new ބ();
   @NotNull
   public static final ಀ<Context> ԩ;

   public static final void _/* $FF was: Ϳ*/(boolean param0, Context param1, String param2, ApplicationInfo param3) {
      // $FF: Couldn't be decompiled
   }

   public static final void _/* $FF was: Ԩ*/() {
      Context var10000;
      boolean var10001;
      try {
         Ԩ.clear();
         var10000 = ࢦ.ֈ();
      } catch (Exception var13) {
         var10001 = false;
         return;
      }

      Context var0 = var10000;

      try {
         ࢽ.Ϳ.getClass();
      } catch (Exception var12) {
         var10001 = false;
         return;
      }

      Iterator var15;
      try {
         var15 = ࢽ.Ԫ.Ԩ().Ԫ().iterator();
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      Iterator var1 = var15;

      while(true) {
         boolean var16;
         try {
            var16 = var1.hasNext();
         } catch (Exception var10) {
            var10001 = false;
            break;
         }

         if (!var16) {
            break;
         }

         Entry var17;
         try {
            var17 = (Entry)var1.next();
         } catch (Exception var9) {
            var10001 = false;
            break;
         }

         Entry var2 = var17;

         try {
            var16 = ((ࢶ)var17.getValue()).Ԩ;
         } catch (Exception var8) {
            var10001 = false;
            break;
         }

         boolean var3 = var16;

         String var19;
         try {
            var19 = (String)var2.getKey();
         } catch (Exception var7) {
            var10001 = false;
            break;
         }

         String var4 = var19;
         ApplicationInfo var14;
         if (!var16) {
            ApplicationInfo var18;
            try {
               var18 = ((ࢶ)var2.getValue()).Ϳ.applicationInfo;
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            var14 = var18;
         } else {
            var14 = null;
         }

         try {
            ࢦ.Ϳ.Ԩ(ഩ::Ϳ);
         } catch (Exception var5) {
            var10001 = false;
            break;
         }
      }

   }

   static {
      Class[] var0;
      Class[] var10002 = var0 = new Class[2];
      var10002[0] = ApplicationInfo.class;
      var10002[1] = Integer.TYPE;
      ԩ = (new ಀ("createApplicationContext", var0)).Ϳ(Context.class);
   }

   public final void _/* $FF was: ԩ*/() {
      Ԩ.clear();
   }

   public final void _/* $FF was: Ϳ*/() {
      ࢦ.Ϳ.Ԩ(ഩ::Ԩ);
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable String var1) {
      boolean var10000;
      boolean var3;
      try {
         var10000 = Ԩ.containsKey(var1);
      } catch (Exception var2) {
         var3 = false;
         return var3;
      }

      var3 = var10000;
      return var3;
   }

   @Nullable
   public final ഩ.Ϳ _/* $FF was: Ԩ*/(@NotNull String var1) {
      ഩ.Ϳ var10000;
      ഩ.Ϳ var3;
      try {
         var10000 = (ഩ.Ϳ)Ԩ.get(var1);
      } catch (Exception var2) {
         var3 = null;
         return var3;
      }

      var3 = var10000;
      return var3;
   }

   public final ഩ.Ϳ _/* $FF was: Ϳ*/(Theme var1, TypedValue var2) {
      boolean var10000;
      boolean var10001;
      try {
         var10000 = var1.resolveAttribute(16844333, var2, true);
      } catch (Exception var18) {
         var10001 = false;
         return null;
      }

      if (!var10000) {
         return null;
      } else {
         int var24;
         try {
            var24 = var2.resourceId;
         } catch (Exception var17) {
            var10001 = false;
            return null;
         }

         int var19 = var24;
         if (var24 == 0) {
            return null;
         } else {
            Drawable var25;
            try {
               var25 = var1.getDrawable(var19);
            } catch (Exception var16) {
               var10001 = false;
               return null;
            }

            Drawable var20 = var25;
            if (var25 == null) {
               return null;
            } else {
               try {
                  var10000 = var1.resolveAttribute(16844335, var2, true);
               } catch (Exception var15) {
                  var10001 = false;
                  return null;
               }

               Drawable var23;
               label108: {
                  if (var10000) {
                     try {
                        var24 = var2.resourceId;
                     } catch (Exception var14) {
                        var10001 = false;
                        return null;
                     }

                     int var3 = var24;
                     if (var24 != 0) {
                        try {
                           var25 = var1.getDrawable(var3);
                        } catch (Exception var13) {
                           var10001 = false;
                           return null;
                        }

                        var23 = var25;
                        break label108;
                     }
                  }

                  var23 = null;
               }

               try {
                  var10000 = var1.resolveAttribute(16844332, var2, true);
               } catch (Exception var12) {
                  var10001 = false;
                  return null;
               }

               Integer var4;
               Integer var26;
               if (var10000) {
                  try {
                     var26 = var2.data;
                  } catch (Exception var11) {
                     var10001 = false;
                     return null;
                  }

                  var4 = var26;
               } else {
                  var4 = null;
               }

               try {
                  var10000 = ތ.Ԭ;
               } catch (Exception var10) {
                  var10001 = false;
                  return null;
               }

               Integer var21;
               label87: {
                  label130: {
                     if (var10000) {
                        try {
                           var10000 = var20 instanceof AdaptiveIconDrawable;
                        } catch (Exception var9) {
                           var10001 = false;
                           return null;
                        }

                        if (var10000) {
                           break label130;
                        }
                     }

                     try {
                        var10000 = var1.resolveAttribute(16844336, var2, true);
                     } catch (Exception var8) {
                        var10001 = false;
                        return null;
                     }

                     if (var10000) {
                        try {
                           var26 = var2.data;
                        } catch (Exception var7) {
                           var10001 = false;
                           return null;
                        }

                        var21 = var26;
                        break label87;
                     }
                  }

                  var21 = null;
               }

               Triple var10002;
               ഩ.Ϳ var27;
               ഩ.Ϳ var28;
               try {
                  var27 = new ഩ.Ϳ;
                  var28 = var27;
                  var10002 = new Triple;
               } catch (Exception var6) {
                  var10001 = false;
                  return null;
               }

               Triple var22 = var10002;

               try {
                  var10002.<init>(var23, var4, var21);
                  var28.<init>(var20, var22);
                  return var27;
               } catch (Exception var5) {
                  var10001 = false;
                  return null;
               }
            }
         }
      }
   }

   @SuppressLint({"ResourceType"})
   public final ഩ.Ϳ _/* $FF was: Ϳ*/(Context var1, boolean var2) {
      ActivityInfo var10000;
      boolean var10001;
      try {
         var10000 = ٴ.Ϳ.Ԩ(var1.getPackageName(), var2);
      } catch (Exception var15) {
         var10001 = false;
         return null;
      }

      ActivityInfo var17 = var10000;
      if (var10000 != null) {
         int var21;
         try {
            var21 = var17.getThemeResource();
         } catch (Exception var14) {
            var10001 = false;
            return null;
         }

         int var18 = var21;
         if (var21 != 0) {
            Theme var22;
            try {
               var22 = var1.getResources().newTheme();
            } catch (Exception var13) {
               var10001 = false;
               return null;
            }

            Theme var16;
            Theme var24 = var16 = var22;

            TypedValue var26;
            try {
               var24.applyStyle(var18, true);
               var26 = new TypedValue;
            } catch (Exception var12) {
               var10001 = false;
               return null;
            }

            TypedValue var19 = var26;

            boolean var23;
            try {
               var26.<init>();
               var23 = var22.resolveAttribute(16842836, var19, true);
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            if (var23) {
               try {
                  var21 = var19.resourceId;
               } catch (Exception var10) {
                  var10001 = false;
                  return null;
               }

               int var3 = var21;
               if (var21 != 0) {
                  try {
                     var21 = var19.type;
                  } catch (Exception var9) {
                     var10001 = false;
                     return null;
                  }

                  int var4 = var21;
                  if (var21 < 28 || var4 > 31) {
                     Drawable var25;
                     try {
                        var25 = var16.getDrawable(var3);
                     } catch (Exception var8) {
                        var10001 = false;
                        return null;
                     }

                     Drawable var20 = var25;
                     if (var25 != null) {
                        try {
                           return new ഩ.Ϳ(var20, (Triple)null);
                        } catch (Exception var5) {
                           var10001 = false;
                           return null;
                        }
                     }
                  }
               }
            }

            try {
               var23 = ތ.ށ;
            } catch (Exception var7) {
               var10001 = false;
               return null;
            }

            if (var23) {
               try {
                  return this.Ϳ(var16, var19);
               } catch (Exception var6) {
                  var10001 = false;
               }
            }
         }
      }

      return null;
   }

   public static final class Ϳ {
      @NotNull
      public final Drawable Ϳ;
      @Nullable
      public final Triple<Drawable, Integer, Integer> Ԩ;

      public _/* $FF was: Ϳ*/(@NotNull Drawable var1, @Nullable Triple<? extends Drawable, Integer, Integer> var2) {
         this.Ϳ = var1;
         this.Ԩ = var2;
      }

      @NotNull
      public final Drawable _/* $FF was: Ԩ*/() {
         return this.Ϳ;
      }

      @Nullable
      public final Triple<Drawable, Integer, Integer> _/* $FF was: Ϳ*/() {
         return this.Ԩ;
      }
   }
}
