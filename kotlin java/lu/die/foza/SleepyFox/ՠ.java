package lu.die.foza.SleepyFox;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ServiceInfo;
import android.content.pm.UserInfo;
import android.os.IInterface;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ՠ extends lu.die.foza.SleepyFox.Ϳ {
   public boolean _/* $FF was: Ԩ*/() {
      return true;
   }

   public void _/* $FF was: Ԫ*/() {
      ࢧ.Ԫ.getClass();
      super.Ϳ = ࢧ.Ԯ();
      ˁ var1;
      ࢡ var12;
      if ((var1 = this.Ϳ("activity", (IInterface)(var12 = ࢡ.Ϳ).Ϳ())) != null) {
         ʾ var10000 = ʾ.Ϳ;
         var12.getClass();
         var10000.Ԩ(ࢡ.Ԩ, var1.ԩ);
         ׯ.ԯ.getClass();
         ׯ.ֈ().Ϳ(var1);
         if (!ތ.ހ) {
            ၼ.ՠ.getClass();
            ၼ.֏().Ϳ(var1);
         }

         ࣇ var13 = ࣇ.ԯ;
         var1.Ϳ((String)"getRunningAppProcesses", (ໞ)var13);
         ຑ.Ϳ.getClass();
         <undefinedtype> var14 = ຑ.Ԩ;
         var1.Ϳ((String)"getContentProvider", (ໞ)var14);
         ࢧ var15;
         var15 = new ࢧ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               Object[] var10000;
               boolean var10001;
               try {
                  var10000 = var1.ԩ;
               } catch (Exception var24) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               Object[] var2 = var10000;

               ރ var28;
               try {
                  var28 = ރ.Ϳ;
               } catch (Exception var23) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               ރ var3 = var28;

               Intent var29;
               try {
                  var29 = (Intent)var28.Ϳ(var2, Intent.class);
               } catch (Exception var22) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               Intent var4 = var29;
               if (var29 == null) {
                  try {
                     return super.Ϳ(var1);
                  } catch (Exception var8) {
                     var10001 = false;
                  }
               } else {
                  ComponentName var30;
                  try {
                     var30 = var4.getComponent();
                  } catch (Exception var21) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  ComponentName var5 = var30;
                  String var27;
                  if (var30 != null) {
                     String var31;
                     try {
                        var31 = var5.getPackageName();
                     } catch (Exception var20) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }

                     var27 = var31;
                  } else {
                     var27 = null;
                  }

                  boolean var32;
                  try {
                     var32 = Intrinsics.areEqual(var27, this.ԫ());
                  } catch (Exception var19) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  if (!var32) {
                     try {
                        var32 = Intrinsics.areEqual(var4.getPackage(), this.ԫ());
                     } catch (Exception var18) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }

                     if (!var32) {
                        int var33;
                        try {
                           var33 = ߿.Ϳ(߿.Ϳ, var4, var3.Ϳ(var2, IServiceConnection.class), (ServiceInfo)null, 4, (Object)null);
                        } catch (Exception var17) {
                           var10001 = false;
                           return super.Ϳ(var1);
                        }

                        int var25 = var33;

                        try {
                           var4.toString();
                        } catch (Exception var16) {
                           var10001 = false;
                           return super.Ϳ(var1);
                        }

                        if (var33 > 0) {
                           try {
                              return var25;
                           } catch (Exception var6) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }
                        } else {
                           ࢳ var34;
                           try {
                              var34 = ࢳ.Ϳ;
                           } catch (Exception var15) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           ࢳ var26 = var34;

                           try {
                              var34.getClass();
                           } catch (Exception var14) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           try {
                              var32 = ࢳ.Ԩ;
                           } catch (Exception var13) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }

                           label163: {
                              if (!var32) {
                                 try {
                                    var32 = var26.Ԩ(var4.getPackage());
                                 } catch (Exception var12) {
                                    var10001 = false;
                                    return super.Ϳ(var1);
                                 }

                                 if (var32) {
                                    break label163;
                                 }

                                 try {
                                    var32 = var26.Ԩ(var27);
                                 } catch (Exception var11) {
                                    var10001 = false;
                                    return super.Ϳ(var1);
                                 }

                                 if (var32) {
                                    break label163;
                                 }
                              }

                              try {
                                 var32 = Intrinsics.areEqual(var27, "com.heytap.openid");
                              } catch (Exception var10) {
                                 var10001 = false;
                                 return super.Ϳ(var1);
                              }

                              if (!var32) {
                                 return super.Ϳ(var1);
                              }
                           }

                           try {
                              return 0;
                           } catch (Exception var7) {
                              var10001 = false;
                              return super.Ϳ(var1);
                           }
                        }
                     }
                  }

                  try {
                     return super.Ϳ(var1);
                  } catch (Exception var9) {
                     var10001 = false;
                  }
               }

               return super.Ϳ(var1);
            }
         }.<init>();
         ໞ var2;
         var2 = new ໞ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               Object var2;
               if ((var2 = ՠ.this.Ϳ(var1)) instanceof Integer && ((Number)var2).intValue() < 0) {
                  Intent var3;
                  ComponentName var4;
                  if ((var3 = (Intent)ރ.Ϳ.Ϳ(var1.ԩ, Intent.class)) != null) {
                     var4 = var3.getComponent();
                  } else {
                     var4 = null;
                  }

                  if (var4 != null && StringsKt.startsWith$default(var4.getPackageName(), "android.ext.services", false, 2, (Object)null)) {
                     return 0;
                  }
               }

               return var2;
            }
         }.<init>();
         String[] var3;
         String[] var31 = var3 = new String[2];
         var31[0] = "bindServiceInstance";
         var31[1] = "bindIsolatedService";
         var1.Ϳ(var2, var3);
         var1.Ϳ((String)"bindService", (ໞ)var15);
         var15 = new ࢧ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               Intent var10000;
               boolean var10001;
               try {
                  var10000 = (Intent)ރ.Ϳ.Ϳ(var1.ԩ, Intent.class);
               } catch (Exception var10) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               Intent var2 = var10000;
               if (var10000 != null) {
                  ComponentName var13;
                  try {
                     var13 = var2.getComponent();
                  } catch (Exception var9) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  ComponentName var3 = var13;
                  String var12;
                  if (var13 != null) {
                     String var14;
                     try {
                        var14 = var3.getPackageName();
                     } catch (Exception var8) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }

                     var12 = var14;
                  } else {
                     var12 = null;
                  }

                  boolean var15;
                  try {
                     var15 = Intrinsics.areEqual(var12, this.ԫ());
                  } catch (Exception var7) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  if (!var15) {
                     try {
                        var15 = Intrinsics.areEqual(var2.getPackage(), this.ԫ());
                     } catch (Exception var6) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }

                     if (!var15) {
                        try {
                           var13 = ߿.Ϳ(߿.Ϳ, var2, false, (ServiceInfo)null, 6, (Object)null);
                        } catch (Exception var5) {
                           var10001 = false;
                           return super.Ϳ(var1);
                        }

                        ComponentName var11 = var13;
                        if (var13 != null) {
                           return var11;
                        }

                        return super.Ϳ(var1);
                     }
                  }

                  try {
                     return super.Ϳ(var1);
                  } catch (Exception var4) {
                     var10001 = false;
                  }
               }

               return super.Ϳ(var1);
            }
         }.<init>();
         var1.Ϳ((String)"startService", (ໞ)var15);
         var15 = new ࢧ() {
            public Object _/* $FF was: Ϳ*/(ࡥ param1) {
               // $FF: Couldn't be decompiled
            }
         }.<init>();
         var1.Ϳ((String)"stopService", (ໞ)var15);
         var15 = new ࢧ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               Object[] var10000;
               boolean var10001;
               try {
                  var10000 = var1.ԩ;
               } catch (Exception var10) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               Object[] var2 = var10000;

               ރ var13;
               try {
                  var13 = ރ.Ϳ;
               } catch (Exception var9) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               ރ var16 = var13;

               Object[] var17;
               ComponentName var18;
               try {
                  ރ var10002 = var16;
                  var17 = var2;
                  var18 = (ComponentName)var10002.Ϳ(var2, ComponentName.class);
               } catch (Exception var8) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               ComponentName var11 = var18;

               Number var14;
               try {
                  var14 = (Number)var13.Ϳ(var17, Number.class);
               } catch (Exception var7) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               Number var3 = var14;
               int var12;
               int var15;
               if (var14 != null) {
                  try {
                     var15 = var3.intValue();
                  } catch (Exception var6) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  var12 = var15;
               } else {
                  var12 = -1;
               }

               try {
                  var15 = ߿.Ϳ.Ϳ(var11, var12);
               } catch (Exception var5) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               if (var15 >= 0) {
                  try {
                     return Boolean.TRUE;
                  } catch (Exception var4) {
                     var10001 = false;
                  }
               }

               return super.Ϳ(var1);
            }
         }.<init>();
         var1.Ϳ((String)"stopServiceToken", (ໞ)var15);
         var15 = new ࢧ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               IServiceConnection var10000;
               boolean var10001;
               try {
                  var10000 = (IServiceConnection)ރ.Ϳ.Ϳ(var1.ԩ, IServiceConnection.class);
               } catch (Exception var8) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               IServiceConnection var2 = var10000;
               if (var10000 != null) {
                  int var9;
                  try {
                     var9 = ߿.Ϳ.Ϳ((IInterface)var2);
                  } catch (Exception var7) {
                     var10001 = false;
                     return super.Ϳ(var1);
                  }

                  if (var9 >= 0) {
                     try {
                        return Boolean.TRUE;
                     } catch (Exception var3) {
                        var10001 = false;
                     }
                  } else {
                     try {
                        ޠ.Ԫ.getClass();
                     } catch (Exception var6) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }

                     try {
                        var9 = ޠ.ԫ().Ϳ(var2);
                     } catch (Exception var5) {
                        var10001 = false;
                        return super.Ϳ(var1);
                     }

                     if (var9 >= 0) {
                        try {
                           return Boolean.TRUE;
                        } catch (Exception var4) {
                           var10001 = false;
                        }
                     }
                  }
               }

               return super.Ϳ(var1);
            }
         }.<init>();
         var1.Ϳ((String)"unbindService", (ໞ)var15);
         String var18 = "getCurrentUser";
         ޜ.Ϳ var16 = ޜ.Ϳ;

         UserInfo var23;
         label98: {
            UserInfo var35;
            label97: {
               label105: {
                  boolean var10001;
                  Class var32;
                  Class[] var34;
                  try {
                     var32 = UserInfo.class;
                     var34 = new Class[3];
                  } catch (Exception var11) {
                     var10001 = false;
                     break label105;
                  }

                  Class[] var10002 = var34;
                  Class[] var10003 = var34;
                  Class[] var10004 = var34;
                  byte var10005 = 0;

                  Class var10006;
                  try {
                     var10006 = Integer.TYPE;
                  } catch (Exception var10) {
                     var10001 = false;
                     break label105;
                  }

                  Class var21 = var10006;

                  try {
                     var10004[var10005] = var10006;
                  } catch (Exception var9) {
                     var10001 = false;
                     break label105;
                  }

                  byte var41 = 1;

                  try {
                     var10003[var41] = String.class;
                  } catch (Exception var8) {
                     var10001 = false;
                     break label105;
                  }

                  byte var38 = 2;

                  Constructor var33;
                  Object[] var37;
                  try {
                     var10002[var38] = var21;
                     var33 = var32.getDeclaredConstructor(var34);
                     var37 = new Object[3];
                  } catch (Exception var7) {
                     var10001 = false;
                     break label105;
                  }

                  Object[] var36 = var37;
                  Object[] var39 = var37;
                  Object[] var42 = var37;
                  var10005 = 0;

                  try {
                     var42[var10005] = 0;
                  } catch (Exception var6) {
                     var10001 = false;
                     break label105;
                  }

                  var41 = 1;

                  try {
                     var39[var41] = "Admin";
                  } catch (Exception var5) {
                     var10001 = false;
                     break label105;
                  }

                  var38 = 2;

                  try {
                     var36[var38] = 1;
                     var35 = (UserInfo)var33.newInstance(var37);
                     break label97;
                  } catch (Exception var4) {
                     var10001 = false;
                  }
               }

               var23 = null;
               break label98;
            }

            var23 = var35;
         }

         var16.getClass();
         އ var17;
         var17 = new އ.<init>(var23);
         var1.Ϳ((String)var18, (ໞ)var17);
         ˀ var20 = ˀ.Ԫ;
         var1.Ϳ((String)"setServiceForeground", (ໞ)var20);
         ࢯ var24;
         var24 = new ࢯ() {
            public static final void _/* $FF was: Ϳ*/(Intent var0) {
               boolean var10001;
               try {
                  ޠ.Ԫ.getClass();
               } catch (Exception var3) {
                  var10001 = false;
                  return;
               }

               ޠ var10000;
               Intent var4;
               try {
                  var10000 = ޠ.ԫ();
                  var4 = var0;
                  ࢦ.Ϳ.getClass();
               } catch (Exception var2) {
                  var10001 = false;
                  return;
               }

               try {
                  var10000.Ϳ(var4, ࢦ.Ԫ);
               } catch (Exception var1) {
                  var10001 = false;
               }

            }

            public Object _/* $FF was: Ϳ*/(ࡥ param1) {
               // $FF: Couldn't be decompiled
            }
         }.<init>();
         String[] var19;
         var31 = var19 = new String[2];
         var31[0] = "broadcastIntent";
         var31[1] = "broadcastIntentWithFeature";
         var1.Ϳ((ໞ)var24, (String[])var19);
         ໞ var26;
         var26 = new ໞ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               label178: {
                  ࡥ var10000;
                  boolean var10001;
                  Class[] var34;
                  try {
                     var10000 = var1;
                     var34 = var1.Ԩ.getParameterTypes();
                  } catch (Exception var24) {
                     var10001 = false;
                     break label178;
                  }

                  Class[] var25 = var34;

                  Object[] var31;
                  try {
                     var31 = var10000.ԩ;
                  } catch (Exception var23) {
                     var10001 = false;
                     break label178;
                  }

                  Object[] var2 = var31;

                  int var32;
                  try {
                     var32 = var25.length;
                  } catch (Exception var22) {
                     var10001 = false;
                     break label178;
                  }

                  int var3 = var32 - 1;

                  boolean var33;
                  try {
                     var33 = ތ.ނ;
                  } catch (Exception var21) {
                     var10001 = false;
                     break label178;
                  }

                  Object var35;
                  int var40;
                  if (var33) {
                     try {
                        var35 = var2[var3];
                     } catch (Exception var20) {
                        var10001 = false;
                        break label178;
                     }

                     Object var4 = var35;

                     try {
                        var33 = var35 instanceof Integer;
                     } catch (Exception var19) {
                        var10001 = false;
                        break label178;
                     }

                     if (var33) {
                        try {
                           var32 = ((Number)var4).intValue();
                        } catch (Exception var18) {
                           var10001 = false;
                           break label178;
                        }

                        if ((var32 & 2) == 0) {
                           try {
                              var32 = ((Number)var4).intValue();
                           } catch (Exception var17) {
                              var10001 = false;
                              break label178;
                           }

                           if ((var32 & 4) == 0) {
                              int var10002;
                              try {
                                 var31 = var2;
                                 var40 = var3;
                                 var10002 = ((Number)var4).intValue();
                              } catch (Exception var16) {
                                 var10001 = false;
                                 break label178;
                              }

                              var10002 |= 2;

                              try {
                                 var31[var40] = var10002;
                              } catch (Exception var15) {
                                 var10001 = false;
                                 break label178;
                              }
                           }
                        }
                     }
                  }

                  while(var3 > 0) {
                     Class[] var37 = var25;
                     var40 = var3;
                     int var30 = var3 + -1;

                     try {
                        var33 = Intrinsics.areEqual(var37[var40], String.class);
                     } catch (Exception var14) {
                        var10001 = false;
                        break label178;
                     }

                     if (var33) {
                        try {
                           var2[var3] = null;
                           break;
                        } catch (Exception var13) {
                           var10001 = false;
                           break label178;
                        }
                     }

                     var3 = var30;
                  }

                  ރ var42;
                  try {
                     var31 = var2;
                     var42 = ރ.Ϳ;
                  } catch (Exception var12) {
                     var10001 = false;
                     break label178;
                  }

                  ރ var36 = var42;

                  Object[] var38;
                  IntentFilter var39;
                  try {
                     ރ var10003 = var36;
                     var38 = var2;
                     var39 = (IntentFilter)var10003.Ϳ(var2, IntentFilter.class);
                  } catch (Exception var11) {
                     var10001 = false;
                     break label178;
                  }

                  IntentFilter var26 = var39;

                  IIntentReceiver var43;
                  try {
                     var43 = (IIntentReceiver)var42.Ϳ(var38, IIntentReceiver.class);
                  } catch (Exception var10) {
                     var10001 = false;
                     break label178;
                  }

                  IIntentReceiver var27 = var43;

                  String var29;
                  label184: {
                     label182: {
                        try {
                           var35 = var31[1];
                        } catch (Exception var7) {
                           var10001 = false;
                           break label182;
                        }

                        Object var28 = var35;

                        try {
                           var33 = var35 instanceof String;
                        } catch (Exception var6) {
                           var10001 = false;
                           break label182;
                        }

                        if (var33) {
                           label185: {
                              String var41;
                              try {
                                 var41 = (String)var28;
                              } catch (Exception var5) {
                                 var10001 = false;
                                 break label185;
                              }

                              var29 = var41;
                              break label184;
                           }
                        }
                     }

                     var29 = null;
                  }

                  if (var26 != null && var27 != null) {
                     label187: {
                        try {
                           ޠ.Ԫ.getClass();
                        } catch (Exception var9) {
                           var10001 = false;
                           break label187;
                        }

                        try {
                           ޠ.ԫ().Ϳ(var26, var27, var29);
                        } catch (Exception var8) {
                           var10001 = false;
                        }
                     }
                  }
               }

               ࢯ.Ԭ.getClass();
               return ࢯ.ՠ().Ϳ(var1);
            }
         }.<init>();
         if (ތ.ށ) {
            ޜ.Ϳ var40 = ޜ.Ϳ;
            Integer var22 = 0;
            var40.getClass();
            އ var28;
            var28 = new އ.<init>(var22);
            var1.Ϳ((String)"getCurrentUserId", (ໞ)var28);
         }

         ࢯ var25;
         if (ތ.ؠ) {
            var1.Ϳ("registerReceiverWithFeature", var26);
            ࢯ.Ԭ.getClass();
            var25 = ࢯ.ՠ();
            var1.Ϳ((String)"setActivityLocusContext", (ໞ)var25);
            ׯ.ԯ.getClass();
            ׯ var27 = ׯ.ֈ();
            var1.Ϳ((String)"startActivityWithFeature", (ໞ)var27);
         }

         if (ތ.Ԯ) {
            ࢯ.Ԭ.getClass();
            var25 = ࢯ.ՠ();
            var1.Ϳ((String)"isBackgroundRestricted", (ໞ)var25);
         }

         var1.Ϳ("registerReceiver", var26);
         var24 = new ࢯ() {
            public static final void _/* $FF was: Ϳ*/(IIntentReceiver param0) {
               // $FF: Couldn't be decompiled
            }

            public Object _/* $FF was: Ϳ*/(ࡥ param1) {
               // $FF: Couldn't be decompiled
            }
         }.<init>();
         var1.Ϳ((String)"unregisterReceiver", (ໞ)var24);
         ഄ.ԭ.getClass();
         ഄ var29;
         (var29 = ഄ.ԯ()).getClass();
         var1.Ϳ((String)"checkPermission", (ໞ)var29);
         if (!ތ.ހ) {
            ޜ.Ϳ.getClass();
            var26 = ޜ.Ԩ();
            var1.Ϳ("overridePendingTransition", var26);
            ގ.ՠ.getClass();
            ގ.ֈ().Ϳ(var1);
            Ԭ.֏.getClass();
            Ԭ.ֈ().Ϳ(var1);
         }

         ၚ.ԯ.getClass();
         ၚ.ֈ().Ϳ(var1);
         ʰ.ԩ.getClass();
         ʰ.Ϳ().Ϳ(var1);
         if (ތ.ׯ) {
            Boolean var30 = Boolean.TRUE;
            ޜ.Ϳ.getClass();
            var17 = new އ.<init>(var30);
            var1.Ϳ((String)"getIsSupportMultiApp", (ໞ)var17);
         }

         var15 = new ࢧ() {
            public Object _/* $FF was: Ϳ*/(ࡥ var1) {
               Object var10000;
               boolean var10001;
               try {
                  var10000 = var1.ԩ[1];
               } catch (Exception var5) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               Object var2 = var10000;

               boolean var6;
               try {
                  var6 = var10000 instanceof List;
               } catch (Exception var4) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               if (!var6) {
                  return super.Ϳ(var1);
               }

               try {
                  var6 = ޱ.Ϳ.Ϳ((List)var2);
               } catch (Exception var3) {
                  var10001 = false;
                  return super.Ϳ(var1);
               }

               if (!var6) {
                  return null;
               } else {
                  return super.Ϳ(var1);
               }
            }
         }.<init>();
         var1.Ϳ((String)"publishContentProviders", (ໞ)var15);
      }
   }
}
