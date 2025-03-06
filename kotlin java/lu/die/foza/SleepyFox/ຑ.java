package lu.die.foza.SleepyFox;

import android.content.pm.ProviderInfo;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ຑ {
   @NotNull
   public static final ຑ Ϳ = new ຑ();
   @NotNull
   public static final <undefinedtype> Ԩ = new ࢧ() {
      public final int Ԭ;
      public final String ԭ;

      public {
         byte var1;
         if (ތ.ހ) {
            var1 = 2;
         } else {
            var1 = 1;
         }

         this.Ԭ = var1;
         this.ԭ = this.ԫ() + ".foza.init.pv";
      }

      public Object _/* $FF was: Ϳ*/(ࡥ var1) {
         Object[] var10000;
         boolean var10001;
         try {
            var10000 = var1.ԩ;
         } catch (Exception var37) {
            var10001 = false;
            return null;
         }

         Object[] var2 = var10000;

         Object var40;
         try {
            var40 = var10000[this.Ԭ];
         } catch (Exception var36) {
            var10001 = false;
            return null;
         }

         Object var3 = var40;
         if (var40 != null) {
            String var41;
            try {
               var41 = var3.toString();
            } catch (Exception var35) {
               var10001 = false;
               return null;
            }

            String var38 = var41;
            if (var41 != null) {
               boolean var42;
               try {
                  var42 = Intrinsics.areEqual(var38, this.ԭ);
               } catch (Exception var33) {
                  var10001 = false;
                  return null;
               }

               if (var42) {
                  try {
                     return super.Ϳ(var1);
                  } catch (Exception var8) {
                     var10001 = false;
                     return null;
                  }
               } else {
                  try {
                     var42 = FozaStubProvider.Ϳ.Ϳ(var38.hashCode());
                  } catch (Exception var32) {
                     var10001 = false;
                     return null;
                  }

                  if (!var42) {
                     try {
                        var42 = this.ԭ();
                     } catch (Exception var31) {
                        var10001 = false;
                        return null;
                     }

                     ProviderInfo var4;
                     label196: {
                        ProviderInfo var43;
                        if (var42) {
                           try {
                              ࡠ.ԩ.getClass();
                           } catch (Exception var30) {
                              var10001 = false;
                              return null;
                           }

                           try {
                              var43 = ࡠ.ԫ().ԩ(var38);
                           } catch (Exception var29) {
                              var10001 = false;
                              return null;
                           }

                           var4 = var43;
                           if (var43 != null) {
                              break label196;
                           }

                           try {
                              var43 = ࢼ.Ϳ.ԩ(var38);
                           } catch (Exception var28) {
                              var10001 = false;
                              return null;
                           }
                        } else {
                           try {
                              var43 = ࢼ.Ϳ.ԩ(var38);
                           } catch (Exception var27) {
                              var10001 = false;
                              return null;
                           }

                           var4 = var43;
                           if (var43 != null) {
                              break label196;
                           }

                           try {
                              ࡠ.ԩ.getClass();
                           } catch (Exception var26) {
                              var10001 = false;
                              return null;
                           }

                           try {
                              var43 = ࡠ.ԫ().ԩ(var38);
                           } catch (Exception var25) {
                              var10001 = false;
                              return null;
                           }
                        }

                        var4 = var43;
                     }

                     if (var4 != null) {
                        ࢦ var46;
                        try {
                           var41 = var4.packageName;
                           var46 = ࢦ.Ϳ;
                        } catch (Exception var24) {
                           var10001 = false;
                           return null;
                        }

                        ࢦ var5 = var46;

                        try {
                           var42 = Intrinsics.areEqual(var41, var46.ԩ());
                           var5.getClass();
                        } catch (Exception var23) {
                           var10001 = false;
                           return null;
                        }

                        String var47;
                        try {
                           var47 = ࢦ.Ԫ;
                        } catch (Exception var22) {
                           var10001 = false;
                           return null;
                        }

                        String var6 = var47;
                        if (!var42) {
                           ࡠ.Ϳ var44;
                           try {
                              var44 = ࡠ.ԩ;
                           } catch (Exception var21) {
                              var10001 = false;
                              return null;
                           }

                           ࡠ.Ϳ var7 = var44;

                           try {
                              var44.getClass();
                           } catch (Exception var20) {
                              var10001 = false;
                              return null;
                           }

                           try {
                              var42 = ࡠ.ԫ().ԯ(var4.packageName);
                           } catch (Exception var19) {
                              var10001 = false;
                              return null;
                           }

                           if (!var42) {
                              try {
                                 return ຑ.Ϳ.Ϳ(super.Ϳ(var1));
                              } catch (Exception var9) {
                                 var10001 = false;
                                 return null;
                              }
                           }

                           try {
                              var7.getClass();
                           } catch (Exception var18) {
                              var10001 = false;
                              return null;
                           }

                           try {
                              var41 = ࡠ.ԫ().ԩ(var4.packageName, var6);
                           } catch (Exception var17) {
                              var10001 = false;
                              return null;
                           }

                           var6 = var41;
                        } else {
                           try {
                              var42 = Intrinsics.areEqual(var4.processName, var5.Ԫ());
                           } catch (Exception var16) {
                              var10001 = false;
                              return null;
                           }

                           if (var42) {
                              return null;
                           }
                        }

                        try {
                           ޠ.Ԫ.getClass();
                        } catch (Exception var15) {
                           var10001 = false;
                           return null;
                        }

                        int var45;
                        try {
                           var45 = ޠ.ԫ().Ϳ(var4, var6);
                        } catch (Exception var14) {
                           var10001 = false;
                           return null;
                        }

                        int var39 = var45;
                        if (var45 > 0) {
                           try {
                              var45 = var39;
                              var5.getClass();
                           } catch (Exception var13) {
                              var10001 = false;
                              return null;
                           }

                           int var48;
                           try {
                              var48 = ࢦ.Ԩ;
                           } catch (Exception var12) {
                              var10001 = false;
                              return null;
                           }

                           if (var45 != var48) {
                              try {
                                 var2[this.Ԭ] = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var39);
                                 return ຑ.Ϳ.Ϳ(super.Ϳ(var1), var39, var38);
                              } catch (Exception var10) {
                                 var10001 = false;
                                 return null;
                              }
                           }
                        }
                     }
                  }

                  try {
                     return ຑ.Ϳ.Ϳ(super.Ϳ(var1));
                  } catch (Exception var11) {
                     var10001 = false;
                     return null;
                  }
               }
            }
         }

         try {
            return ຑ.Ϳ.Ϳ(super.Ϳ(var1));
         } catch (Exception var34) {
            var10001 = false;
            return null;
         }
      }
   };
   @NotNull
   public static final <undefinedtype> ԩ = new ࢧ() {
      public Object _/* $FF was: Ϳ*/(ࡥ param1) {
         // $FF: Couldn't be decompiled
      }
   };
   @NotNull
   public static final ૹ<Object> Ԫ = new ૹ("mUri");
   @NotNull
   public static final ૹ<Object> ԫ = new ૹ("provider");

   // $FF: synthetic method
   public static final ૹ _/* $FF was: Ԩ*/() {
      return Ԫ;
   }

   // $FF: synthetic method
   public static final Object _/* $FF was: Ϳ*/(ຑ var0, Object var1, int var2, String var3) {
      return var0.Ϳ(var1, var2, var3);
   }

   @NotNull
   public final ໞ _/* $FF was: ԩ*/() {
      return Ԩ;
   }

   @Nullable
   public final ˁ _/* $FF was: Ԩ*/(@Nullable Object var1) {
      if (var1 == null) {
         return null;
      } else {
         ˁ var2;
         if ((var2 = ৼ.Ϳ.Ϳ((Object)var1, (ໞ)ԩ)) != null) {
            if (ތ.ؠ) {
               ໞ var3;
               var3 = new ໞ() {
                  public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                     // $FF: Couldn't be decompiled
                  }
               }.<init>();
               var2.Ϳ("query", var3);
            }
         } else {
            var2 = null;
         }

         return var2;
      }
   }

   @Nullable
   public final Object _/* $FF was: Ϳ*/(@Nullable Object var1) {
      if (var1 == null) {
         return null;
      } else {
         ຑ var10000;
         boolean var10001;
         ૹ var11;
         try {
            var10000 = this;
            var11 = ԫ;
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         ૹ var7 = var11;

         ˁ var9;
         try {
            var9 = var10000.Ԩ(var11.ԩ(var1));
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }

         ˁ var2 = var9;
         Object var8;
         if (var9 != null) {
            Object var10;
            try {
               var10 = var2.ԩ;
            } catch (Exception var4) {
               var10001 = false;
               return null;
            }

            var8 = var10;
         } else {
            var8 = null;
         }

         try {
            var7.Ϳ(var1, var8);
            return var1;
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }
      }
   }

   public final <undefinedtype> _/* $FF was: Ϳ*/(final int var1) {
      return new ໞ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1x) {
            Object[] var10000;
            boolean var10001;
            try {
               var10000 = var1x.ԩ;
            } catch (Exception var7) {
               var10001 = false;
               return ຑ.ԩ.Ϳ(var1x);
            }

            Object[] var2 = var10000;

            int var9;
            try {
               var9 = ރ.Ϳ.Ԩ(var2, Uri.class);
            } catch (Exception var6) {
               var10001 = false;
               return ຑ.ԩ.Ϳ(var1x);
            }

            int var3 = var9;
            if (var9 >= 0) {
               FozaAnkingProvider.Ϳ.Ԭ var10002;
               <undefinedtype> var10003;
               Uri var10004;
               int var10;
               try {
                  var10000 = var2;
                  var10 = var3;
                  var10002 = FozaAnkingProvider.Ϳ.Ϳ;
                  var10003 = this;
                  var10004 = (Uri)var2[var3];
               } catch (Exception var5) {
                  var10001 = false;
                  return ຑ.ԩ.Ϳ(var1x);
               }

               Uri var8 = var10004;

               try {
                  var10000[var10] = var10002.Ϳ(var8, var1);
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            return ຑ.ԩ.Ϳ(var1x);
         }
      };
   }

   public final ˁ _/* $FF was: Ԩ*/(Object var1, int var2, String var3) {
      if (var1 == null) {
         return null;
      } else {
         ໞ var10000;
         boolean var10001;
         try {
            var10000 = new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1x) {
                  Object[] var10000;
                  boolean var10001;
                  try {
                     var10000 = var1x.ԩ;
                  } catch (Exception var7) {
                     var10001 = false;
                     return ຑ.ԩ.Ϳ(var1x);
                  }

                  Object[] var2 = var10000;

                  int var9;
                  try {
                     var9 = ރ.Ϳ.Ԩ(var2, Uri.class);
                  } catch (Exception var6) {
                     var10001 = false;
                     return ຑ.ԩ.Ϳ(var1x);
                  }

                  int var3 = var9;
                  if (var9 >= 0) {
                     FozaAnkingProvider.Ϳ.Ԭ var10002;
                     <undefinedtype> var10003;
                     Uri var10004;
                     int var10;
                     try {
                        var10000 = var2;
                        var10 = var3;
                        var10002 = FozaAnkingProvider.Ϳ.Ϳ;
                        var10003 = this;
                        var10004 = (Uri)var2[var3];
                     } catch (Exception var5) {
                        var10001 = false;
                        return ຑ.ԩ.Ϳ(var1x);
                     }

                     Uri var8 = var10004;

                     try {
                        var10000[var10] = var10002.Ϳ(var8, var1);
                     } catch (Exception var4) {
                        var10001 = false;
                     }
                  }

                  return ຑ.ԩ.Ϳ(var1x);
               }
            };
         } catch (Exception var11) {
            var10001 = false;
            return null;
         }

         ໞ var12 = var10000;

         ˁ var15;
         try {
            var10000.<init>();
            var15 = ৼ.Ϳ.Ϳ(var1, var12);
         } catch (Exception var10) {
            var10001 = false;
            return null;
         }

         ˁ var13 = var15;
         if (var15 == null) {
            return null;
         } else {
            ˁ var16;
            ˁ var10002;
            String var10003;
            try {
               var15 = var13;
               var16 = var13;
               var10002 = var13;
               var10003 = "applyBatch";
            } catch (Exception var9) {
               var10001 = false;
               return null;
            }

            String var14 = var10003;

            ໞ var19;
            try {
               var19 = new ໞ() {
                  // $FF: synthetic field
                  public final <undefinedtype> Ԩ;

                  public {
                     this.Ԩ = var2;
                  }

                  public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                     // $FF: Couldn't be decompiled
                  }
               };
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }

            ໞ var4 = var19;

            String var17;
            try {
               var19.<init>(var12);
               var10002.Ϳ(var14, var4);
               var17 = "call";
            } catch (Exception var7) {
               var10001 = false;
               return null;
            }

            var14 = var17;

            ໞ var18;
            try {
               var18 = new ໞ() {
                  // $FF: synthetic field
                  public final int Ԩ;
                  // $FF: synthetic field
                  public final <undefinedtype> ԩ;

                  public {
                     this.Ԩ = var2;
                     this.ԩ = var3;
                  }

                  public Object _/* $FF was: Ϳ*/(ࡥ param1) {
                     // $FF: Couldn't be decompiled
                  }
               };
            } catch (Exception var6) {
               var10001 = false;
               return null;
            }

            var4 = var18;

            try {
               var18.<init>(var2, var12);
               var16.Ϳ(var14, var4);
               return var15;
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }
         }
      }
   }

   public final Object _/* $FF was: Ϳ*/(Object var1, int var2, String var3) {
      if (var1 == null) {
         return null;
      } else {
         ૹ var10000;
         boolean var10001;
         try {
            var10000 = ԫ;
         } catch (Exception var10) {
            var10001 = false;
            return null;
         }

         ૹ var4 = var10000;

         Object var13;
         try {
            var13 = var10000.ԩ(var1);
         } catch (Exception var9) {
            var10001 = false;
            return null;
         }

         Object var5 = var13;
         if (var13 == null) {
            return var1;
         } else {
            ˁ var14;
            try {
               var14 = this.Ԩ(var5, var2, var3);
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }

            ˁ var11 = var14;
            Object var12;
            if (var14 != null) {
               try {
                  var13 = var11.ԩ;
               } catch (Exception var7) {
                  var10001 = false;
                  return null;
               }

               var12 = var13;
            } else {
               var12 = null;
            }

            try {
               var4.Ϳ(var1, var12);
               return var1;
            } catch (Exception var6) {
               var10001 = false;
               return null;
            }
         }
      }
   }
}
