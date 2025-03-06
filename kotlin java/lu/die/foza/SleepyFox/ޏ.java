package lu.die.foza.SleepyFox;

import android.hardware.camera2.CameraManager;
import android.os.IInterface;

public final class ޏ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      String var1 = "$CameraManagerGlobal";

      boolean var10000;
      boolean var10001;
      try {
         var10000 = ތ.ԩ;
      } catch (Exception var20) {
         var10001 = false;
         return;
      }

      if (var10000) {
         try {
            var10000 = ތ.ނ;
         } catch (Exception var19) {
            var10001 = false;
            return;
         }

         if (var10000) {
            try {
               var10000 = ތ.ׯ;
            } catch (Exception var18) {
               var10001 = false;
               return;
            }

            if (var10000) {
               try {
                  ࢦ.ֈ().getSystemService("camera");
               } catch (Exception var17) {
                  var10001 = false;
                  return;
               }
            }
         }

         ޏ var28;
         try {
            var28 = this;
            ࢯ.Ԭ.getClass();
         } catch (Exception var16) {
            var10001 = false;
            return;
         }

         Class var29;
         try {
            var28.Ϳ = ࢯ.ՠ();
            var29 = Class.forName(CameraManager.class.getName().concat(var1));
         } catch (Exception var15) {
            var10001 = false;
            return;
         }

         Class var23 = var29;

         ˋ var30;
         try {
            var30 = ˋ.Ϳ;
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         ˋ var2 = var30;

         Object var31;
         try {
            var31 = var30.Ϳ(var23, "get");
         } catch (Exception var13) {
            var10001 = false;
            return;
         }

         Object var25 = var31;
         if (var31 != null) {
            try {
               var31 = var2.ԩ(var25, "getCameraService");
            } catch (Exception var12) {
               var10001 = false;
               return;
            }

            Object var3 = var31;
            if (var31 != null) {
               String var10002;
               Object var36;
               try {
                  var28 = this;
                  var36 = var3;
                  var10002 = "media.camera";
               } catch (Exception var11) {
                  var10001 = false;
                  return;
               }

               String var21 = var10002;

               ˁ var34;
               try {
                  var34 = var28.Ϳ(var21, (IInterface)var36);
               } catch (Exception var10) {
                  var10001 = false;
                  return;
               }

               ˁ var22 = var34;
               if (var34 != null) {
                  try {
                     var31 = var22.ԩ;
                  } catch (Exception var9) {
                     var10001 = false;
                     return;
                  }

                  var3 = var31;
               } else {
                  var3 = null;
               }

               if (var3 != null) {
                  String var10003;
                  ˁ var32;
                  ˋ var37;
                  try {
                     var34 = var22;
                     var37 = var2;
                     var32 = var22;
                     var10003 = "mCameraService";
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }

                  var21 = var10003;

                  Object var33;
                  try {
                     var33 = var32.ԩ;
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }

                  Object var27 = var33;

                  ࢯ var38;
                  try {
                     var37.Ϳ(var25, var21, var27);
                     var38 = new ࢯ() {
                        public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                           Object[] var10000;
                           boolean var10001;
                           try {
                              var10000 = var1.ԩ;
                           } catch (Exception var9) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           Object[] var2 = var10000;

                           ࡡ.Ϳ var12;
                           try {
                              var12 = ࡡ.Ϳ;
                              var12.getClass();
                           } catch (Exception var8) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           try {
                              ࡡ.Ϳ().getClass();
                           } catch (Exception var7) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           try {
                              var12.getClass();
                           } catch (Exception var6) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           try {
                              ࡡ.Ϳ().getClass();
                           } catch (Exception var5) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           boolean var11;
                           try {
                              var11 = var10000[2] instanceof String;
                           } catch (Exception var4) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           if (var11) {
                              var10000 = var2;
                              <undefinedtype> var13 = this;
                              byte var10 = 2;

                              try {
                                 var10000[var10] = var13.ԫ();
                              } catch (Exception var3) {
                                 var10001 = false;
                              }
                           }

                           return super.Ϳ(var1);
                        }
                     };
                  } catch (Exception var6) {
                     var10001 = false;
                     return;
                  }

                  ࢯ var24 = var38;

                  String[] var39;
                  try {
                     var38.<init>();
                     var39 = new String[1];
                  } catch (Exception var5) {
                     var10001 = false;
                     return;
                  }

                  String[] var26 = var39;
                  byte var35 = 0;

                  try {
                     var39[var35] = "connectDevice";
                     var34.Ϳ((ໞ)var24, (String[])var26);
                  } catch (Exception var4) {
                     var10001 = false;
                  }

               }
            }
         }
      }
   }
}
