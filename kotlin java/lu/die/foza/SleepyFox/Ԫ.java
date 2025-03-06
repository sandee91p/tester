package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Ԫ extends lu.die.foza.SleepyFox.Ϳ {
   @NotNull
   public final <undefinedtype> Ԫ;
   @NotNull
   public final <undefinedtype> ԫ;

   public _/* $FF was: Ԫ*/() {
      Ԫ var10000 = this;
      Ԫ var10001 = this;
      super();
      Ԫ.Ϳ var1;
      var1 = new Ԫ.Ϳ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            Object var10000;
            boolean var10001;
            try {
               var10000 = this.Ԩ(var1);
            } catch (Throwable var21) {
               var10001 = false;
               return null;
            }

            Object var22 = var10000;

            boolean var24;
            try {
               var24 = var10000 instanceof IAccountManagerResponse;
            } catch (Throwable var20) {
               var10001 = false;
               return null;
            }

            if (var24) {
               Bundle var25;
               try {
                  var10000 = var22;
                  var25 = new Bundle;
               } catch (Throwable var19) {
                  var10001 = false;
                  return null;
               }

               Bundle var23;
               Bundle var10002 = var23 = var25;

               try {
                  var10002.<init>();
                  var25.putBoolean("booleanResult", true);
                  ((IAccountManagerResponse)var10000).onResult(var23);
               } catch (Throwable var18) {
                  var10001 = false;
                  return null;
               }
            }

            return null;
         }
      }.<init>();
      var10001.Ԫ = var1;
      var1 = new Ԫ.Ϳ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            Object var10000;
            boolean var10001;
            try {
               var10000 = this.Ԩ(var1);
            } catch (Throwable var21) {
               var10001 = false;
               return null;
            }

            Object var22 = var10000;

            boolean var24;
            try {
               var24 = var10000 instanceof IAccountManagerResponse;
            } catch (Throwable var20) {
               var10001 = false;
               return null;
            }

            if (var24) {
               Bundle var25;
               try {
                  var10000 = var22;
                  var25 = new Bundle;
               } catch (Throwable var19) {
                  var10001 = false;
                  return null;
               }

               Bundle var10002 = var25;
               Bundle var10003 = var25;
               Bundle var23;
               Bundle var10004 = var23 = var25;

               try {
                  var10004.<init>();
                  var10003.putString("authAccount", "62v.net");
                  var10002.putString("accountType", ࢦ.Ϳ.ԩ());
                  var25.putString("accountAccessId", "62v.net");
                  ((IAccountManagerResponse)var10000).onResult(var23);
               } catch (Throwable var18) {
                  var10001 = false;
                  return null;
               }
            }

            return null;
         }
      }.<init>();
      var10000.ԫ = var1;
   }

   public void _/* $FF was: Ԫ*/() {
      Ԫ var66;
      Ԫ var10000;
      boolean var10001;
      try {
         var10000 = this;
         var66 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var56) {
         var10001 = false;
         return;
      }

      ˁ var64;
      try {
         var66.Ϳ = ࢯ.ՠ();
         var64 = var10000.Ϳ("account");
      } catch (Exception var55) {
         var10001 = false;
         return;
      }

      ˁ var1 = var64;
      if (var64 != null) {
         String var10002;
         ໞ var10003;
         try {
            var10000 = this;
            var66 = this;
            var10002 = "getPassword";
            var10003 = new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  return ((ຠ)ޟ.Ԩ.Ԩ()).ԩ((Account)var1.ԩ[0], 0);
               }
            };
         } catch (Exception var54) {
            var10001 = false;
            return;
         }

         ໞ var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getUserData";
            var10003 = new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object[] var10000 = var1.ԩ;
                  Account var4 = (Account)var10000[0];
                  Object var2;
                  String var5;
                  if ((var2 = var10000[1]) != null) {
                     var5 = var2.toString();
                  } else {
                     var5 = null;
                  }

                  return var3.Ϳ((Account)var4, var5, 0);
               }
            };
         } catch (Exception var53) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAuthenticatorTypes";
            var10003 = new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  return ((ຠ)ޟ.Ԩ.Ԩ()).Ԭ(0);
               }
            };
         } catch (Exception var52) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAccountsForPackage";
            var10003 = new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  ຠ var2 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var3;
                  String var4;
                  if ((var3 = var1.ԩ[0]) != null) {
                     var4 = var3.toString();
                  } else {
                     var4 = null;
                  }

                  return var2.Ϳ(var4, 114514, 0);
               }
            };
         } catch (Exception var51) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAccountsByTypeForPackage";
            var10003 = new ໞ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  String var6;
                  if ((var2 = var1.ԩ[0]) != null) {
                     var6 = var2.toString();
                  } else {
                     var6 = null;
                  }

                  Object var4;
                  String var5;
                  if ((var4 = var1.ԩ[1]) != null) {
                     var5 = var4.toString();
                  } else {
                     var5 = null;
                  }

                  return var3.Ԩ((String)var6, var5, 0);
               }
            };
         } catch (Exception var50) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAccountByTypeAndFeatures";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IAccountManagerResponse var5;
                  if ((var2 = var1.ԩ[0]) instanceof IAccountManagerResponse) {
                     var5 = (IAccountManagerResponse)var2;
                  } else {
                     var5 = null;
                  }

                  IBinder var6;
                  if (var5 != null) {
                     var6 = var5.asBinder();
                  } else {
                     var6 = null;
                  }

                  Object var3;
                  String var7;
                  if ((var3 = var1.ԩ[1]) != null) {
                     var7 = var3.toString();
                  } else {
                     var7 = null;
                  }

                  var4.Ԩ((IBinder)var6, var7, (String[])((String[])var1.ԩ[2]), 0);
               }
            };
         } catch (Exception var49) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAccountsByFeatures";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IAccountManagerResponse var5;
                  if ((var2 = var1.ԩ[0]) instanceof IAccountManagerResponse) {
                     var5 = (IAccountManagerResponse)var2;
                  } else {
                     var5 = null;
                  }

                  IBinder var6;
                  if (var5 != null) {
                     var6 = var5.asBinder();
                  } else {
                     var6 = null;
                  }

                  Object var3;
                  String var7;
                  if ((var3 = var1.ԩ[1]) != null) {
                     var7 = var3.toString();
                  } else {
                     var7 = null;
                  }

                  var4.Ϳ((IBinder)var6, var7, (String[])((String[])var1.ԩ[2]), 0);
               }
            };
         } catch (Exception var48) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAccountsAsUser";
            var10003 = new ໞ() {
               public Account[] _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var2 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var3;
                  String var4;
                  if ((var3 = var1.ԩ[0]) != null) {
                     var4 = var3.toString();
                  } else {
                     var4 = null;
                  }

                  return var2.Ԫ((String)var4, 0);
               }
            };
         } catch (Exception var47) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "addAccountExplicitly";
            var10003 = new ໞ() {
               public Boolean _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object[] var2;
                  Object var3;
                  Account var9;
                  if ((var3 = (var2 = var1.ԩ)[0]) instanceof Account) {
                     var9 = (Account)var3;
                  } else {
                     var9 = null;
                  }

                  Object var7;
                  String var8;
                  if ((var7 = var2[1]) != null) {
                     var8 = var7.toString();
                  } else {
                     var8 = null;
                  }

                  Object var5;
                  Bundle var6;
                  if ((var5 = var1.ԩ[2]) instanceof Bundle) {
                     var6 = (Bundle)var5;
                  } else {
                     var6 = null;
                  }

                  return var4.Ϳ((Account)var9, var8, (Bundle)var6, 0);
               }
            };
         } catch (Exception var46) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "removeAccountAsUser";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IAccountManagerResponse var6;
                  if ((var2 = var1.ԩ[0]) instanceof IAccountManagerResponse) {
                     var6 = (IAccountManagerResponse)var2;
                  } else {
                     var6 = null;
                  }

                  IBinder var7;
                  if (var6 != null) {
                     var7 = var6.asBinder();
                  } else {
                     var7 = null;
                  }

                  Object var3;
                  Object[] var5;
                  Account var8;
                  if ((var3 = (var5 = var1.ԩ)[1]) instanceof Account) {
                     var8 = (Account)var3;
                  } else {
                     var8 = null;
                  }

                  Object var10002 = var5[2];
                  Intrinsics.checkNotNull(var5[2], "null cannot be cast to non-null type kotlin.Boolean");
                  var4.Ϳ(var7, (Account)var8, (Boolean)var10002, 0);
               }
            };
         } catch (Exception var45) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "removeAccountExplicitly";
            var10003 = new ໞ() {
               public Boolean _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var2 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var3;
                  Account var4;
                  if ((var3 = var1.ԩ[0]) instanceof Account) {
                     var4 = (Account)var3;
                  } else {
                     var4 = null;
                  }

                  return var2.Ϳ(var4, 0);
               }
            };
         } catch (Exception var44) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "copyAccountToUser";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var5 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IAccountManagerResponse var8;
                  if ((var2 = var1.ԩ[0]) instanceof IAccountManagerResponse) {
                     var8 = (IAccountManagerResponse)var2;
                  } else {
                     var8 = null;
                  }

                  IBinder var9;
                  if (var8 != null) {
                     var9 = var8.asBinder();
                  } else {
                     var9 = null;
                  }

                  Object[] var3;
                  Object var4;
                  Account var10;
                  if ((var4 = (var3 = var1.ԩ)[1]) instanceof Account) {
                     var10 = (Account)var4;
                  } else {
                     var10 = null;
                  }

                  ຠ var10000 = var5;
                  Object var10003 = var3[2];
                  Intrinsics.checkNotNull(var3[2], "null cannot be cast to non-null type kotlin.Int");
                  int var6 = (Integer)var10003;
                  Object var10002 = var1.ԩ[3];
                  Intrinsics.checkNotNull(var10002, "null cannot be cast to non-null type kotlin.Int");
                  int var7 = (Integer)var10002;
                  var10000.Ϳ(var9, var10, var6, var7);
               }
            };
         } catch (Exception var43) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "invalidateAuthToken";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  String var6;
                  if ((var2 = var1.ԩ[0]) != null) {
                     var6 = var2.toString();
                  } else {
                     var6 = null;
                  }

                  Object var4;
                  String var5;
                  if ((var4 = var1.ԩ[1]) != null) {
                     var5 = var4.toString();
                  } else {
                     var5 = null;
                  }

                  var3.Ϳ((String)var6, var5, 0);
               }
            };
         } catch (Exception var42) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "peekAuthToken";
            var10003 = new ໞ() {
               public String _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  Object[] var4;
                  Account var7;
                  if ((var2 = (var4 = var1.ԩ)[0]) instanceof Account) {
                     var7 = (Account)var2;
                  } else {
                     var7 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var4[1]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  return var3.ԩ((Account)var7, var6, 0);
               }
            };
         } catch (Exception var41) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "setAuthToken";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object[] var2;
                  Object var3;
                  Account var9;
                  if ((var3 = (var2 = var1.ԩ)[0]) instanceof Account) {
                     var9 = (Account)var3;
                  } else {
                     var9 = null;
                  }

                  Object var7;
                  String var8;
                  if ((var7 = var2[1]) != null) {
                     var8 = var7.toString();
                  } else {
                     var8 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var1.ԩ[2]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  var4.Ԩ((Account)var9, var8, (String)var6, 0);
               }
            };
         } catch (Exception var40) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "setPassword";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  Object[] var4;
                  Account var7;
                  if ((var2 = (var4 = var1.ԩ)[0]) instanceof Account) {
                     var7 = (Account)var2;
                  } else {
                     var7 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var4[1]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  var3.Ԩ((Account)var7, var6, 0);
               }
            };
         } catch (Exception var39) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "clearPassword";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var2 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var3;
                  Account var4;
                  if ((var3 = var1.ԩ[0]) instanceof Account) {
                     var4 = (Account)var3;
                  } else {
                     var4 = null;
                  }

                  var2.Ԩ(var4, 0);
               }
            };
         } catch (Exception var38) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "setUserData";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object[] var2;
                  Object var3;
                  Account var9;
                  if ((var3 = (var2 = var1.ԩ)[0]) instanceof Account) {
                     var9 = (Account)var3;
                  } else {
                     var9 = null;
                  }

                  Object var7;
                  String var8;
                  if ((var7 = var2[1]) != null) {
                     var8 = var7.toString();
                  } else {
                     var8 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var1.ԩ[2]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  var4.Ϳ((Account)var9, var8, (String)var6, 0);
               }
            };
         } catch (Exception var37) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "updateAppPermission";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object[] var2;
                  Object var3;
                  Account var9;
                  if ((var3 = (var2 = var1.ԩ)[0]) instanceof Account) {
                     var9 = (Account)var3;
                  } else {
                     var9 = null;
                  }

                  Object var7;
                  String var8;
                  if ((var7 = var2[1]) != null) {
                     var8 = var7.toString();
                  } else {
                     var8 = null;
                  }

                  ຠ var10000 = var4;
                  Object var10003 = var1.ԩ[2];
                  Intrinsics.checkNotNull(var10003, "null cannot be cast to non-null type kotlin.Int");
                  int var5 = (Integer)var10003;
                  Object var10002 = var1.ԩ[3];
                  Intrinsics.checkNotNull(var10002, "null cannot be cast to non-null type kotlin.Boolean");
                  boolean var6 = (Boolean)var10002;
                  var10000.Ϳ(var9, var8, var5, var6);
               }
            };
         } catch (Exception var36) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAuthToken";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var7 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IInterface var9;
                  if ((var2 = var1.ԩ[0]) instanceof IInterface) {
                     var9 = (IInterface)var2;
                  } else {
                     var9 = null;
                  }

                  IBinder var10;
                  if (var9 != null) {
                     var10 = var9.asBinder();
                  } else {
                     var10 = null;
                  }

                  Object[] var3;
                  Object var4;
                  Account var13;
                  if ((var4 = (var3 = var1.ԩ)[1]) instanceof Account) {
                     var13 = (Account)var4;
                  } else {
                     var13 = null;
                  }

                  Object var11;
                  String var12;
                  if ((var11 = var3[2]) != null) {
                     var12 = var11.toString();
                  } else {
                     var12 = null;
                  }

                  ࡥ var10000 = var1;
                  ࡥ var10001 = var1;
                  Object var10002 = var1.ԩ[3];
                  Intrinsics.checkNotNull(var10002, "null cannot be cast to non-null type kotlin.Boolean");
                  boolean var8 = (Boolean)var10002;
                  Object var15 = var10001.ԩ[4];
                  Intrinsics.checkNotNull(var15, "null cannot be cast to non-null type kotlin.Boolean");
                  boolean var5 = (Boolean)var15;
                  Object var6;
                  Bundle var14;
                  if ((var6 = var10000.ԩ[5]) instanceof Bundle) {
                     var14 = (Bundle)var6;
                  } else {
                     var14 = null;
                  }

                  var7.Ϳ(var10, var13, var12, var8, var5, var14, 0);
               }
            };
         } catch (Exception var35) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "addAccount";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var7 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IInterface var9;
                  if ((var2 = var1.ԩ[0]) instanceof IInterface) {
                     var9 = (IInterface)var2;
                  } else {
                     var9 = null;
                  }

                  IBinder var10;
                  if (var9 != null) {
                     var10 = var9.asBinder();
                  } else {
                     var10 = null;
                  }

                  Object var3;
                  String var11;
                  if ((var3 = var1.ԩ[1]) != null) {
                     var11 = var3.toString();
                  } else {
                     var11 = null;
                  }

                  Object var4;
                  String var12;
                  if ((var4 = var1.ԩ[2]) != null) {
                     var12 = var4.toString();
                  } else {
                     var12 = null;
                  }

                  Object[] var5;
                  Object var6;
                  String[] var15;
                  if ((var6 = (var5 = var1.ԩ)[3]) instanceof String[]) {
                     var15 = (String[])var6;
                  } else {
                     var15 = null;
                  }

                  ࡥ var10000 = var1;
                  Object var10001 = var5[4];
                  Intrinsics.checkNotNull(var5[4], "null cannot be cast to non-null type kotlin.Boolean");
                  boolean var8 = (Boolean)var10001;
                  Object var13;
                  Bundle var14;
                  if ((var13 = var10000.ԩ[5]) instanceof Bundle) {
                     var14 = (Bundle)var13;
                  } else {
                     var14 = null;
                  }

                  var7.Ϳ(var10, var11, var12, var15, var8, var14, 0);
               }
            };
         } catch (Exception var34) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "addAccountAsUser";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var7 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IInterface var9;
                  if ((var2 = var1.ԩ[0]) instanceof IInterface) {
                     var9 = (IInterface)var2;
                  } else {
                     var9 = null;
                  }

                  IBinder var10;
                  if (var9 != null) {
                     var10 = var9.asBinder();
                  } else {
                     var10 = null;
                  }

                  Object var3;
                  String var11;
                  if ((var3 = var1.ԩ[1]) != null) {
                     var11 = var3.toString();
                  } else {
                     var11 = null;
                  }

                  Object var4;
                  String var12;
                  if ((var4 = var1.ԩ[2]) != null) {
                     var12 = var4.toString();
                  } else {
                     var12 = null;
                  }

                  Object[] var5;
                  Object var6;
                  String[] var15;
                  if ((var6 = (var5 = var1.ԩ)[3]) instanceof String[]) {
                     var15 = (String[])var6;
                  } else {
                     var15 = null;
                  }

                  ࡥ var10000 = var1;
                  Object var10001 = var5[4];
                  Intrinsics.checkNotNull(var5[4], "null cannot be cast to non-null type kotlin.Boolean");
                  boolean var8 = (Boolean)var10001;
                  Object var13;
                  Bundle var14;
                  if ((var13 = var10000.ԩ[5]) instanceof Bundle) {
                     var14 = (Bundle)var13;
                  } else {
                     var14 = null;
                  }

                  var7.Ԩ(var10, var11, var12, var15, var8, var14, 0);
               }
            };
         } catch (Exception var33) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "updateCredentials";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var6 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IInterface var8;
                  if ((var2 = var1.ԩ[0]) instanceof IInterface) {
                     var8 = (IInterface)var2;
                  } else {
                     var8 = null;
                  }

                  IBinder var9;
                  if (var8 != null) {
                     var9 = var8.asBinder();
                  } else {
                     var9 = null;
                  }

                  Object[] var3;
                  Object var4;
                  Account var12;
                  if ((var4 = (var3 = var1.ԩ)[1]) instanceof Account) {
                     var12 = (Account)var4;
                  } else {
                     var12 = null;
                  }

                  Object var10;
                  String var11;
                  if ((var10 = var3[2]) != null) {
                     var11 = var10.toString();
                  } else {
                     var11 = null;
                  }

                  ࡥ var10000 = var1;
                  Object var10001 = var1.ԩ[3];
                  Intrinsics.checkNotNull(var10001, "null cannot be cast to non-null type kotlin.Boolean");
                  boolean var7 = (Boolean)var10001;
                  Object var5;
                  Bundle var13;
                  if ((var5 = var10000.ԩ[4]) instanceof Bundle) {
                     var13 = (Bundle)var5;
                  } else {
                     var13 = null;
                  }

                  var6.Ϳ(var9, var12, var11, var7, var13, 0);
               }
            };
         } catch (Exception var32) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "editProperties";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IInterface var5;
                  if ((var2 = var1.ԩ[0]) instanceof IInterface) {
                     var5 = (IInterface)var2;
                  } else {
                     var5 = null;
                  }

                  IBinder var6;
                  if (var5 != null) {
                     var6 = var5.asBinder();
                  } else {
                     var6 = null;
                  }

                  Object var3;
                  String var7;
                  if ((var3 = var1.ԩ[1]) != null) {
                     var7 = var3.toString();
                  } else {
                     var7 = null;
                  }

                  Object var10002 = var1.ԩ[2];
                  Intrinsics.checkNotNull(var10002, "null cannot be cast to non-null type kotlin.Boolean");
                  var4.Ϳ(var6, (String)var7, (Boolean)var10002, 0);
               }
            };
         } catch (Exception var31) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "confirmCredentialsAsUser";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var5 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IInterface var8;
                  if ((var2 = var1.ԩ[0]) instanceof IInterface) {
                     var8 = (IInterface)var2;
                  } else {
                     var8 = null;
                  }

                  IBinder var9;
                  if (var8 != null) {
                     var9 = var8.asBinder();
                  } else {
                     var9 = null;
                  }

                  Object var3;
                  Object[] var7;
                  Account var10;
                  if ((var3 = (var7 = var1.ԩ)[1]) instanceof Account) {
                     var10 = (Account)var3;
                  } else {
                     var10 = null;
                  }

                  Object var4;
                  Bundle var11;
                  if ((var4 = var7[2]) instanceof Bundle) {
                     var11 = (Bundle)var4;
                  } else {
                     var11 = null;
                  }

                  ຠ var10000 = var5;
                  Object var10002 = var7[3];
                  Intrinsics.checkNotNull(var7[3], "null cannot be cast to non-null type kotlin.Boolean");
                  boolean var6 = (Boolean)var10002;
                  var10000.Ϳ(var9, var10, var11, var6, 0);
               }
            };
         } catch (Exception var30) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "accountAuthenticated";
            var10003 = new ໞ() {
               public Boolean _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var2 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var3;
                  Account var4;
                  if ((var3 = var1.ԩ[0]) instanceof Account) {
                     var4 = (Account)var3;
                  } else {
                     var4 = null;
                  }

                  return var2.Ԫ((Account)var4, 0);
               }
            };
         } catch (Exception var29) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAuthTokenLabel";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  IInterface var7;
                  if ((var2 = var1.ԩ[0]) instanceof IInterface) {
                     var7 = (IInterface)var2;
                  } else {
                     var7 = null;
                  }

                  IBinder var8;
                  if (var7 != null) {
                     var8 = var7.asBinder();
                  } else {
                     var8 = null;
                  }

                  Object var3;
                  String var9;
                  if ((var3 = var1.ԩ[1]) != null) {
                     var9 = var3.toString();
                  } else {
                     var9 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var1.ԩ[2]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  var4.Ϳ((IBinder)var8, var9, (String)var6, 0);
               }
            };
         } catch (Exception var28) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getPackagesAndVisibilityForAccount";
            var10003 = new ໞ() {
               public Map _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var2 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var3;
                  Account var4;
                  if ((var3 = var1.ԩ[0]) instanceof Account) {
                     var4 = (Account)var3;
                  } else {
                     var4 = null;
                  }

                  return var2.ԫ(var4, 0);
               }
            };
         } catch (Exception var27) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "addAccountExplicitlyWithVisibility";
            var10003 = new ໞ() {
               public Boolean _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var5 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object[] var2;
                  Object var3;
                  Account var11;
                  if ((var3 = (var2 = var1.ԩ)[0]) instanceof Account) {
                     var11 = (Account)var3;
                  } else {
                     var11 = null;
                  }

                  Object var9;
                  String var10;
                  if ((var9 = var2[1]) != null) {
                     var10 = var9.toString();
                  } else {
                     var10 = null;
                  }

                  Object var4;
                  Object[] var6;
                  Bundle var12;
                  if ((var4 = (var6 = var1.ԩ)[2]) instanceof Bundle) {
                     var12 = (Bundle)var4;
                  } else {
                     var12 = null;
                  }

                  Object var7;
                  Map var8;
                  if ((var7 = var6[3]) instanceof Map) {
                     var8 = (Map)var7;
                  } else {
                     var8 = null;
                  }

                  return var5.Ϳ(var11, var10, var12, var8, 0);
               }
            };
         } catch (Exception var26) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "setAccountVisibility";
            var10003 = new ໞ() {
               public Boolean _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var4 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object[] var2;
                  Object var3;
                  Account var7;
                  if ((var3 = (var2 = var1.ԩ)[0]) instanceof Account) {
                     var7 = (Account)var3;
                  } else {
                     var7 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var2[1]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  Object var10002 = var1.ԩ[2];
                  Intrinsics.checkNotNull(var10002, "null cannot be cast to non-null type kotlin.Int");
                  return var4.Ϳ((Account)var7, (String)var6, (Integer)var10002, 0);
               }
            };
         } catch (Exception var25) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAccountVisibility";
            var10003 = new ໞ() {
               public Integer _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  Object[] var4;
                  Account var7;
                  if ((var2 = (var4 = var1.ԩ)[0]) instanceof Account) {
                     var7 = (Account)var2;
                  } else {
                     var7 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var4[1]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  return var3.Ԫ(var7, var6, 0);
               }
            };
         } catch (Exception var24) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "getAccountsAndVisibilityForPackage";
            var10003 = new ໞ() {
               public Map _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  String var6;
                  if ((var2 = var1.ԩ[0]) != null) {
                     var6 = var2.toString();
                  } else {
                     var6 = null;
                  }

                  Object var4;
                  String var5;
                  if ((var4 = var1.ԩ[1]) != null) {
                     var5 = var4.toString();
                  } else {
                     var5 = null;
                  }

                  return var3.ԩ((String)var6, var5, 0);
               }
            };
         } catch (Exception var23) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "registerAccountListener";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  Object[] var4;
                  String[] var7;
                  if ((var2 = (var4 = var1.ԩ)[0]) instanceof String[]) {
                     var7 = (String[])var2;
                  } else {
                     var7 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var4[1]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  var3.Ϳ((String[])var7, var6, 0);
               }
            };
         } catch (Exception var22) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var10002 = "unregisterAccountListener";
            var10003 = new ໞ() {
               public void _/* $FF was: Ԩ*/(ࡥ var1) {
                  ຠ var3 = (ຠ)ޟ.Ԩ.Ԩ();
                  Object var2;
                  Object[] var4;
                  String[] var7;
                  if ((var2 = (var4 = var1.ԩ)[0]) instanceof String[]) {
                     var7 = (String[])var2;
                  } else {
                     var7 = null;
                  }

                  Object var5;
                  String var6;
                  if ((var5 = var4[1]) != null) {
                     var6 = var5.toString();
                  } else {
                     var6 = null;
                  }

                  var3.Ԩ((String[])var7, var6, 0);
               }
            };
         } catch (Exception var21) {
            var10001 = false;
            return;
         }

         var57 = var10003;

         ޜ.Ϳ var71;
         ޜ.Ϳ var73;
         ޜ.Ϳ var10004;
         Boolean var10005;
         try {
            var10003.<init>();
            var1.Ϳ(var10002, var57);
            var71 = ޜ.Ϳ;
            var73 = var71;
            var10004 = var71;
            var10005 = Boolean.TRUE;
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         Boolean var61 = var10005;

         try {
            var10004.getClass();
         } catch (Exception var19) {
            var10001 = false;
            return;
         }

         އ var67;
         try {
            var67 = new އ;
         } catch (Exception var18) {
            var10001 = false;
            return;
         }

         އ var2 = var67;

         String[] var68;
         try {
            var67.<init>(var61);
            var68 = new String[2];
         } catch (Exception var17) {
            var10001 = false;
            return;
         }

         String[] var62;
         String[] var69 = var62 = var68;
         byte var10006 = 0;

         try {
            var69[var10006] = "someUserHasAccount";
         } catch (Exception var16) {
            var10001 = false;
            return;
         }

         byte var70 = 1;

         try {
            var68[var70] = "hasAccountAccess";
            var1.Ϳ((ໞ)var2, (String[])var62);
            var73.getClass();
         } catch (Exception var15) {
            var10001 = false;
            return;
         }

         try {
            var10003 = ޜ.Ԩ();
            var68 = new String[2];
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         var69 = var62 = var68;
         var10006 = 0;

         try {
            var69[var10006] = "addSharedAccountsFromParentUser";
         } catch (Exception var13) {
            var10001 = false;
            return;
         }

         var70 = 1;

         String var74;
         try {
            var68[var70] = "hasAccountAccess";
            var1.Ϳ(var10003, var62);
            var74 = "getPreviousName";
         } catch (Exception var12) {
            var10001 = false;
            return;
         }

         String var63 = var74;

         try {
            var74 = "62v.net";
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         String var58 = var74;

         try {
            var71.getClass();
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         އ var72;
         try {
            var72 = new އ;
         } catch (Exception var9) {
            var10001 = false;
            return;
         }

         އ var3 = var72;

         try {
            var72.<init>(var58);
            var1.Ϳ((String)var63, (ໞ)var3);
            var10002 = "hasFeatures";
         } catch (Exception var8) {
            var10001 = false;
            return;
         }

         var63 = var10002;

         <undefinedtype> var75;
         try {
            var75 = var66.Ԫ;
         } catch (Exception var7) {
            var10001 = false;
            return;
         }

         <undefinedtype> var59 = var75;

         String var76;
         try {
            var1.Ϳ((String)var63, (ໞ)var59);
            var76 = "renameAccount";
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         var63 = var76;

         <undefinedtype> var65;
         try {
            var65 = var10000.ԫ;
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         <undefinedtype> var60 = var65;

         try {
            var1.Ϳ((String)var63, (ໞ)var60);
         } catch (Exception var4) {
            var10001 = false;
         }
      }

   }

   private abstract static class Ϳ extends ޜ {
      public _/* $FF was: Ϳ*/() {
      }

      @Nullable
      public final Object _/* $FF was: Ԩ*/(@NotNull ࡥ var1) {
         try {
            return ރ.Ϳ.Ϳ(var1.ԩ, IAccountManagerResponse.class);
         } finally {
            return null;
         }
      }

      @Nullable
      public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
         return null;
      }
   }
}
