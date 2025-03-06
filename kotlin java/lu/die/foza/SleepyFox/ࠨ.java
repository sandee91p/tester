package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.accounts.IAccountManagerResponse.Stub;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.die.lu.FozaAccountAuthenticatorResponse;
import android.die.lu.FozaServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.IBinder.DeathRecipient;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class ࠨ extends ຠ.Ԩ {
   @SuppressLint({"StaticFieldLeak"})
   public static final ࠨ ޠ = new ࠨ();
   public static final Account[] ޡ = new Account[0];
   public static final int ޢ = 3;
   public final Map<Integer, ࢠ> ޚ = new HashMap();
   public final ࠨ.ׯ ޛ = new ࠨ.ׯ();
   public final LinkedList<ʲ> ޜ = new LinkedList();
   public final LinkedHashMap<String, ࠨ.ނ> ޝ = new LinkedHashMap();
   public final Handler ޞ = new Handler(Looper.getMainLooper());
   public final Context ޟ;

   public ࠨ() {
      ࢦ var10001 = ࢦ.Ϳ;
      this.ޟ = ࢦ.ֈ();
   }

   public final File _/* $FF was: ֈ*/() {
      return new File(this.ޟ.getDir("loginData", 0), "login.bin");
   }

   public static void _/* $FF was: Ϳ*/(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (Exception var1) {
         }
      }

   }

   public static byte[] _/* $FF was: Ϳ*/(File var0) throws IOException {
      FileInputStream var1;
      FileInputStream var10000 = var1 = new FileInputStream;
      var10000.<init>(var0);

      byte[] var4;
      try {
         var4 = Ϳ((InputStream)var10000);
      } catch (Throwable var3) {
         Ϳ((Closeable)var1);
         throw var3;
      }

      Ϳ((Closeable)var1);
      return var4;
   }

   public static byte[] _/* $FF was: Ϳ*/(InputStream var0) throws IOException {
      ByteArrayOutputStream var1;
      var1 = new ByteArrayOutputStream.<init>();
      byte[] var2 = new byte[100];

      int var3;
      while((var3 = var0.read(var2, 0, 100)) > 0) {
         var1.write(var2, 0, var3);
      }

      return var1.toByteArray();
   }

   public static void _/* $FF was: Ϳ*/(Parcel var0, FileOutputStream var1) throws IOException {
      var1.write(var0.marshall());
   }

   public final void ؠ() {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(IAccountManagerResponse var1, final Bundle var2, final Account var3, ࢠ var4, final int var5) {
      String var6 = var3.type;
      String var7 = var3.name;
      (new ࠨ.ނ(var4, var1, var6, false, false, var7, false) {
         public String _/* $FF was: Ԩ*/(long var1) {
            StringBuilder var3x;
            StringBuilder var10000 = var3x = new StringBuilder;
            var3x.<init>();
            return var10000.append(super.Ԩ(var1)).append(", getAccountCredentialsForClone, ").append(var3.type).toString();
         }

         public void ހ() throws RemoteException {
            ࠨ var10000 = ࠨ.this;
            Account[] var1;
            int var2x = (var1 = var10000.Ϳ(var5, var10000.ޟ.getPackageName())).length;

            for(int var3x = 0; var3x < var2x; ++var3x) {
               if (var1[var3x].equals(var3)) {
                  Account var5x = var3;
                  super.ރ.addAccountFromCredentials(this, var5x, var2);
                  break;
               }
            }

         }

         public void onResult(Bundle var1) {
            super.onResult(var1);
         }

         public void onError(int var1, String var2x) {
            super.onError(var1, var2x);
         }
      }).ֈ();
   }

   public final boolean _/* $FF was: Ϳ*/(ࢠ var1, Account var2, String var3, Bundle var4, Map<String, Integer> var5) {
      if (var1 == null) {
         var1 = new ࢠ.<init>();
      }

      ࢠ var10000 = var1;
      Account var10001 = var2;
      synchronized(var1.Ϳ){}

      Throwable var285;
      boolean var287;
      label2200: {
         ഺ var286;
         try {
            var286 = var10000.Ԫ(var10001);
         } catch (Throwable var281) {
            var285 = var281;
            var287 = false;
            break label2200;
         }

         boolean var288;
         if (var286 != null) {
            label2206: {
               try {
                  Objects.toString(var2);
               } catch (Throwable var268) {
                  var285 = var268;
                  var287 = false;
                  break label2206;
               }

               var288 = false;

               label2145:
               try {
                  return var288;
               } catch (Throwable var267) {
                  var285 = var267;
                  var287 = false;
                  break label2145;
               }
            }
         } else {
            label2207: {
               Bundle var289;
               ഺ var291;
               try {
                  var289 = var4;
                  var291 = var1.Ϳ(var2);
               } catch (Throwable var280) {
                  var285 = var280;
                  var287 = false;
                  break label2207;
               }

               ഺ var7 = var291;

               try {
                  var291.Ԩ = var3;
               } catch (Throwable var279) {
                  var285 = var279;
                  var287 = false;
                  break label2207;
               }

               Iterator var283;
               Iterator var292;
               if (var289 != null) {
                  try {
                     var292 = var4.keySet().iterator();
                  } catch (Throwable var278) {
                     var285 = var278;
                     var287 = false;
                     break label2207;
                  }

                  var283 = var292;

                  while(true) {
                     try {
                        var288 = var283.hasNext();
                     } catch (Throwable var274) {
                        var285 = var274;
                        var287 = false;
                        break label2207;
                     }

                     if (!var288) {
                        break;
                     }

                     String var10002;
                     Bundle var293;
                     try {
                        var286 = var7;
                        var293 = var4;
                        var10002 = (String)var283.next();
                     } catch (Throwable var277) {
                        var285 = var277;
                        var287 = false;
                        break label2207;
                     }

                     String var8 = var10002;

                     String var294;
                     try {
                        var294 = var293.getString(var10002);
                     } catch (Throwable var276) {
                        var285 = var276;
                        var287 = false;
                        break label2207;
                     }

                     String var9 = var294;

                     try {
                        var286.ԩ.put(var8, var9);
                     } catch (Throwable var275) {
                        var285 = var275;
                        var287 = false;
                        break label2207;
                     }
                  }
               }

               ࠨ var295;
               if (var5 != null) {
                  try {
                     var292 = var5.entrySet().iterator();
                  } catch (Throwable var273) {
                     var285 = var273;
                     var287 = false;
                     break label2207;
                  }

                  var283 = var292;

                  while(true) {
                     try {
                        var288 = var283.hasNext();
                     } catch (Throwable var270) {
                        var285 = var270;
                        var287 = false;
                        break label2207;
                     }

                     if (!var288) {
                        break;
                     }

                     String var10003;
                     Entry var290;
                     try {
                        var295 = this;
                        var10001 = var2;
                        var290 = (Entry)var283.next();
                        var10003 = (String)var290.getKey();
                     } catch (Throwable var272) {
                        var285 = var272;
                        var287 = false;
                        break label2207;
                     }

                     String var284 = var10003;

                     try {
                        var295.Ϳ(var10001, var284, (Integer)var290.getValue(), var1);
                     } catch (Throwable var271) {
                        var285 = var271;
                        var287 = false;
                        break label2207;
                     }
                  }
               }

               try {
                  var295 = this;
               } catch (Throwable var269) {
                  var285 = var269;
                  var287 = false;
                  break label2207;
               }

               var295.ؠ();
               return true;
            }
         }
      }

      while(true) {
         Throwable var282 = var285;

         try {
            var285 = var282;
            throw var285;
         } catch (Throwable var266) {
            var285 = var266;
            var287 = false;
            continue;
         }
      }
   }

   public final boolean _/* $FF was: Ϳ*/(Account var1, String var2, int var3, ࢠ var4) {
      ࢠ var10000 = var4;
      synchronized(var4.Ϳ){}

      boolean var10001;
      Throwable var26;
      ഺ var27;
      try {
         var27 = var10000.Ԫ(var1);
      } catch (Throwable var24) {
         var26 = var24;
         var10001 = false;
         throw var26;
      }

      ഺ var25 = var27;
      boolean var28;
      if (var27 == null) {
         var28 = false;

         try {
            return var28;
         } catch (Throwable var21) {
            var26 = var21;
            var10001 = false;
            throw var26;
         }
      } else {
         try {
            var25.Ԫ.put(var2, var3);
         } catch (Throwable var23) {
            var26 = var23;
            var10001 = false;
            throw var26;
         }

         var28 = true;

         try {
            return var28;
         } catch (Throwable var22) {
            var26 = var22;
            var10001 = false;
            throw var26;
         }
      }
   }

   public final Account[] _/* $FF was: Ϳ*/(ࢠ var1, Account[] var2, boolean var3) {
      LinkedHashMap var4;
      var4 = new LinkedHashMap.<init>();
      int var5 = var2.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Account var7;
         int var8;
         if ((var8 = this.Ԩ((Account)(var7 = var2[var6]), (String)null, (ࢠ)var1)) == 1 || var8 == 2 || var3 && var8 == 4) {
            var4.put(var7, var8);
         }
      }

      return (Account[])var4.keySet().toArray(new Account[0]);
   }

   public final Integer _/* $FF was: Ԩ*/(Account var1, String var2, ࢠ var3) {
      return 1;
   }

   public final int _/* $FF was: Ϳ*/(Account var1, String var2, ࢠ var3) {
      ࠨ var10000 = this;
      Account var10001 = var1;
      ࢠ var10002 = var3;
      synchronized(var3.Ϳ){}

      Throwable var18;
      Integer var19;
      boolean var20;
      try {
         var19 = (Integer)var10000.Ϳ(var10001, var10002).get(var2);
      } catch (Throwable var15) {
         var18 = var15;
         var20 = false;
         throw var18;
      }

      Integer var16 = var19;
      int var17;
      if (var19 != null) {
         int var21;
         try {
            var21 = var16;
         } catch (Throwable var14) {
            var18 = var14;
            var20 = false;
            throw var18;
         }

         var17 = var21;
      } else {
         var17 = 0;
      }

      try {
         return var17;
      } catch (Throwable var13) {
         var18 = var13;
         var20 = false;
         throw var18;
      }
   }

   public final Map<String, Integer> _/* $FF was: Ϳ*/(Account var1, ࢠ var2) {
      return var2.ԭ(var1);
   }

   public final void _/* $FF was: Ϳ*/(IAccountManagerResponse var1, Account[] var2, int var3) {
      if (!this.Ϳ(var2, var3)) {
         ࠨ var10000;
         Bundle var4;
         if (var2.length == 1) {
            var10000 = this;
            Bundle var10002 = var4 = new Bundle;
            var4.<init>();
            var4.putString("authAccount", var2[0].name);
            var10002.putString("accountType", var2[0].type);
            var10000.Ϳ(var1, var4);
         } else {
            var10000 = this;
            var4 = new Bundle.<init>();
            var10000.Ϳ(var1, var4);
         }
      }
   }

   public final boolean _/* $FF was: Ϳ*/(Account[] var1, int var2) {
      if (var1.length < 1) {
         return false;
      } else if (var1.length > 1) {
         return true;
      } else {
         ࠨ var10000 = this;
         ࠨ var10001 = this;
         Account var3 = var1[0];
         ࢠ var4 = var10001.Ԯ(var2);
         return var10000.Ԩ((Account)var3, (String)null, (ࢠ)var4) == 4;
      }
   }

   public final String _/* $FF was: Ԩ*/(ࢠ var1, Account var2, String var3) {
      if (var1 == null) {
         return null;
      } else {
         ࢠ var10000 = var1;
         Account var10001 = var2;
         synchronized(var1.Ϳ) {
            return (String)var10000.ԫ(var10001).get(var3);
         }
      }
   }

   public final boolean _/* $FF was: ԫ*/(String var1, String var2, int var3) {
      ࢠ var4;
      if ((var4 = this.Ԯ(var3)) != null) {
         return var4.Ԫ(new Account(var1, var2)) != null;
      } else {
         return false;
      }
   }

   public final boolean _/* $FF was: Ԩ*/(ࢠ param1, Account param2) {
      // $FF: Couldn't be decompiled
   }

   public static AuthenticatorDescription _/* $FF was: Ϳ*/(Resources var0, String var1, AttributeSet var2) {
      TypedArray var10000 = var0.obtainAttributes(var2, (int[])ˋ.Ԩ("com.android.internal.R$styleable", "AccountAuthenticator"));
      TypedArray var10001 = var10000;
      TypedArray var10002 = var10000;
      TypedArray var10003 = var10000;
      TypedArray var10004 = var10000;
      TypedArray var98;
      TypedArray var10005 = var98 = var10000;

      Throwable var100;
      label750: {
         boolean var101;
         String var110;
         try {
            var110 = var10005.getString((Integer)ˋ.Ԩ("com.android.internal.R$styleable", "AccountAuthenticator_accountType"));
         } catch (Throwable var97) {
            var100 = var97;
            var101 = false;
            break label750;
         }

         String var99 = var110;

         int var108;
         try {
            var108 = var10004.getResourceId((Integer)ˋ.Ԩ("com.android.internal.R$styleable", "AccountAuthenticator_label"), 0);
         } catch (Throwable var96) {
            var100 = var96;
            var101 = false;
            break label750;
         }

         int var3 = var108;

         int var106;
         try {
            var106 = var10003.getResourceId((Integer)ˋ.Ԩ("com.android.internal.R$styleable", "AccountAuthenticator_icon"), 0);
         } catch (Throwable var95) {
            var100 = var95;
            var101 = false;
            break label750;
         }

         int var4 = var106;

         int var102;
         try {
            var102 = var10002.getResourceId((Integer)ˋ.Ԩ("com.android.internal.R$styleable", "AccountAuthenticator_smallIcon"), 0);
         } catch (Throwable var94) {
            var100 = var94;
            var101 = false;
            break label750;
         }

         int var5 = var102;

         int var105;
         try {
            var105 = var10001.getResourceId((Integer)ˋ.Ԩ("com.android.internal.R$styleable", "AccountAuthenticator_accountPreferences"), 0);
         } catch (Throwable var93) {
            var100 = var93;
            var101 = false;
            break label750;
         }

         int var6 = var105;

         boolean var103;
         try {
            var103 = var10000.getBoolean((Integer)ˋ.Ԩ("com.android.internal.R$styleable", "AccountAuthenticator_customTokens"), true);
         } catch (Throwable var92) {
            var100 = var92;
            var101 = false;
            break label750;
         }

         boolean var7 = var103;

         try {
            var103 = TextUtils.isEmpty(var99);
         } catch (Throwable var91) {
            var100 = var91;
            var101 = false;
            break label750;
         }

         if (var103) {
            var98.recycle();
            return null;
         }

         AuthenticatorDescription var107;
         try {
            var107 = new AuthenticatorDescription;
         } catch (Throwable var90) {
            var100 = var90;
            var101 = false;
            break label750;
         }

         AuthenticatorDescription var109 = var107;

         try {
            AuthenticatorDescription var104 = var109;
            var10001 = var98;
            var104.<init>(var99, var1, var3, var4, var5, var6, var7);
         } catch (Throwable var89) {
            var100 = var89;
            var101 = false;
            break label750;
         }

         var10001.recycle();
         return var107;
      }

      var98.recycle();
      throw var100;
   }

   public final void _/* $FF was: Ϳ*/(List<ResolveInfo> var1, Map<String, ࠨ.ؠ> var2) {
      if (var1 != null) {
         Iterator var15 = var1.iterator();

         label96:
         while(var15.hasNext()) {
            ResolveInfo var3;
            ResolveInfo var10000 = var3 = (ResolveInfo)var15.next();

            boolean var10001;
            XmlResourceParser var19;
            try {
               var19 = var10000.serviceInfo.loadXmlMetaData(this.ޟ.getPackageManager(), "android.accounts.AccountAuthenticator");
            } catch (Exception var14) {
               var10001 = false;
               continue;
            }

            XmlResourceParser var4 = var19;
            if (var19 != null) {
               AttributeSet var20;
               try {
                  var20 = Xml.asAttributeSet(var4);
               } catch (Exception var13) {
                  var10001 = false;
                  continue;
               }

               AttributeSet var5 = var20;

               int var21;
               for(int var6 = 0; var6 != 1 && var6 != 2; var6 = var21) {
                  try {
                     var21 = var4.next();
                  } catch (Exception var12) {
                     var10001 = false;
                     continue label96;
                  }
               }

               boolean var22;
               try {
                  var22 = "account-authenticator".equals(var4.getName());
               } catch (Exception var11) {
                  var10001 = false;
                  continue;
               }

               if (var22) {
                  AuthenticatorDescription var23;
                  try {
                     var23 = Ϳ(this.ޟ.getPackageManager().getResourcesForApplication(var3.serviceInfo.applicationInfo), var3.serviceInfo.packageName, var5);
                  } catch (Exception var10) {
                     var10001 = false;
                     continue;
                  }

                  AuthenticatorDescription var16 = var23;
                  if (var23 != null) {
                     Map var24;
                     String var25;
                     try {
                        var24 = var2;
                        var25 = var16.type;
                     } catch (Exception var9) {
                        var10001 = false;
                        continue;
                     }

                     String var17 = var25;

                     ࠨ.ؠ var26;
                     try {
                        var26 = new ࠨ.ؠ;
                     } catch (Exception var8) {
                        var10001 = false;
                        continue;
                     }

                     ࠨ.ؠ var18 = var26;

                     try {
                        var26.<init>(var16, var3.serviceInfo);
                        var24.put(var17, var18);
                     } catch (Exception var7) {
                        var10001 = false;
                     }
                  }
               }
            }
         }

      }
   }

   public final void _/* $FF was: Ϳ*/(IAccountManagerResponse var1, Bundle var2) {
      try {
         var1.onResult(var2);
      } catch (RemoteException var3) {
      }

   }

   public final boolean _/* $FF was: ԩ*/(ࢠ var1, Account var2) {
      var1.Ԯ(var2);
      return true;
   }

   // $FF: synthetic method
   public static boolean _/* $FF was: Ϳ*/(ࠨ var0, String var1, String var2, int var3) {
      return var0.ԫ(var1, var2, var3);
   }

   // $FF: synthetic method
   public static boolean _/* $FF was: Ԩ*/(ࠨ var0, ࢠ var1, Account var2) {
      return var0.ԩ(var1, var2);
   }

   public void _/* $FF was: ׯ*/() {
      this.֏((String)null);
   }

   public void _/* $FF was: ׯ*/(String var1) {
      this.֏(var1);
   }

   public void ֏() {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: ԩ*/(Account var1, int var2) {
      if (var1 != null) {
         return this.Ϳ(this.Ԯ(var2), var1);
      } else {
         throw new IllegalArgumentException("account is null");
      }
   }

   public String _/* $FF was: Ϳ*/(Account var1, String var2, int var3) {
      Objects.requireNonNull(var1, "account cannot be null");
      Objects.requireNonNull(var2, "key cannot be null");
      return this.Ԩ(this.Ԯ(var3), var1, var2);
   }

   public AuthenticatorDescription[] _/* $FF was: Ԭ*/(int var1) {
      ࢠ var10000 = this.Ԯ(var1);
      ArrayList var47;
      var47 = new ArrayList.<init>();
      synchronized(var10000.Ϳ){}

      Throwable var49;
      boolean var10001;
      Iterator var50;
      try {
         var50 = var10000.ԩ.iterator();
      } catch (Throwable var46) {
         var49 = var46;
         var10001 = false;
         throw var49;
      }

      Iterator var3 = var50;

      while(true) {
         boolean var51;
         try {
            var51 = var3.hasNext();
         } catch (Throwable var42) {
            var49 = var42;
            var10001 = false;
            break;
         }

         if (!var51) {
            try {
               ArrayList var55 = var47;
               return (AuthenticatorDescription[])var55.toArray(new AuthenticatorDescription[0]);
            } catch (Throwable var41) {
               var49 = var41;
               var10001 = false;
               break;
            }
         }

         ࠨ var52;
         ഺ var53;
         try {
            var52 = this;
            var53 = (ഺ)var3.next();
         } catch (Throwable var45) {
            var49 = var45;
            var10001 = false;
            break;
         }

         ഺ var4 = var53;

         ࠨ.ؠ var54;
         try {
            var54 = (ࠨ.ؠ)var52.ޛ.Ϳ.get(var4.Ϳ.type);
         } catch (Throwable var44) {
            var49 = var44;
            var10001 = false;
            break;
         }

         ࠨ.ؠ var48 = var54;
         if (var54 != null) {
            try {
               var47.add(var48.Ϳ);
            } catch (Throwable var43) {
               var49 = var43;
               var10001 = false;
               break;
            }
         }
      }

      throw var49;
   }

   public Account[] _/* $FF was: Ϳ*/(String var1, int var2, int var3) {
      ࢠ var10000 = this.Ԯ(var3);
      ArrayList var62;
      var62 = new ArrayList.<init>();
      synchronized(var10000.Ϳ){}

      Throwable var64;
      Iterator var65;
      boolean var10001;
      try {
         var65 = var10000.ԩ.iterator();
      } catch (Throwable var61) {
         var64 = var61;
         var10001 = false;
         throw var64;
      }

      Iterator var63 = var65;

      while(true) {
         boolean var66;
         try {
            var66 = var63.hasNext();
         } catch (Throwable var56) {
            var64 = var56;
            var10001 = false;
            break;
         }

         if (!var66) {
            try {
               ArrayList var70 = var62;
               return (Account[])var70.toArray(new Account[0]);
            } catch (Throwable var55) {
               var64 = var55;
               var10001 = false;
               break;
            }
         }

         ഺ var67;
         try {
            var67 = (ഺ)var63.next();
         } catch (Throwable var60) {
            var64 = var60;
            var10001 = false;
            break;
         }

         ഺ var4 = var67;

         Integer var68;
         try {
            var68 = (Integer)var67.Ԫ.get(var1);
         } catch (Throwable var59) {
            var64 = var59;
            var10001 = false;
            break;
         }

         Integer var5 = var68;
         if (var68 != null) {
            int var69;
            try {
               var69 = var5;
            } catch (Throwable var58) {
               var64 = var58;
               var10001 = false;
               break;
            }

            if (var69 == 1) {
               try {
                  var62.add(var4.Ϳ);
               } catch (Throwable var57) {
                  var64 = var57;
                  var10001 = false;
                  break;
               }
            }
         }
      }

      throw var64;
   }

   public Account[] _/* $FF was: Ԩ*/(String var1, String var2, int var3) {
      ࢠ var10000 = this.Ԯ(var3);
      ArrayList var80;
      var80 = new ArrayList.<init>();
      synchronized(var10000.Ϳ){}

      Throwable var81;
      boolean var10001;
      Iterator var82;
      try {
         var82 = var10000.ԩ.iterator();
      } catch (Throwable var78) {
         var81 = var78;
         var10001 = false;
         throw var81;
      }

      Iterator var4 = var82;

      while(true) {
         boolean var83;
         try {
            var83 = var4.hasNext();
         } catch (Throwable var72) {
            var81 = var72;
            var10001 = false;
            break;
         }

         if (!var83) {
            try {
               ArrayList var79 = var80;
               return (Account[])var79.toArray(new Account[0]);
            } catch (Throwable var71) {
               var81 = var71;
               var10001 = false;
               break;
            }
         }

         ഺ var84;
         try {
            var84 = (ഺ)var4.next();
         } catch (Throwable var77) {
            var81 = var77;
            var10001 = false;
            break;
         }

         ഺ var5 = var84;

         try {
            var83 = var84.Ϳ.type.equals(var1);
         } catch (Throwable var76) {
            var81 = var76;
            var10001 = false;
            break;
         }

         if (var83) {
            Integer var85;
            try {
               var85 = (Integer)var5.Ԫ.get(var2);
            } catch (Throwable var75) {
               var81 = var75;
               var10001 = false;
               break;
            }

            Integer var6 = var85;
            if (var85 != null) {
               int var86;
               try {
                  var86 = var6;
               } catch (Throwable var74) {
                  var81 = var74;
                  var10001 = false;
                  break;
               }

               if (var86 == 1) {
                  try {
                     var80.add(var5.Ϳ);
                  } catch (Throwable var73) {
                     var81 = var73;
                     var10001 = false;
                     break;
                  }
               }
            }
         }
      }

      throw var81;
   }

   public Account[] _/* $FF was: Ԫ*/(String var1, int var2) {
      ࢠ var10000 = this.Ԯ(var2);
      ArrayList var47;
      var47 = new ArrayList.<init>();
      synchronized(var10000.Ϳ){}

      Throwable var48;
      Iterator var49;
      boolean var10001;
      try {
         var49 = var10000.ԩ.iterator();
      } catch (Throwable var46) {
         var48 = var46;
         var10001 = false;
         throw var48;
      }

      Iterator var3 = var49;

      while(true) {
         boolean var50;
         try {
            var50 = var3.hasNext();
         } catch (Throwable var42) {
            var48 = var42;
            var10001 = false;
            break;
         }

         if (!var50) {
            try {
               ArrayList var52 = var47;
               return (Account[])var52.toArray(new Account[0]);
            } catch (Throwable var41) {
               var48 = var41;
               var10001 = false;
               break;
            }
         }

         Account var51;
         try {
            var51 = ((ഺ)var3.next()).Ϳ;
         } catch (Throwable var45) {
            var48 = var45;
            var10001 = false;
            break;
         }

         Account var4 = var51;
         if (var51 != null) {
            if (var1 != null) {
               try {
                  var50 = var4.type.equals(var1);
               } catch (Throwable var44) {
                  var48 = var44;
                  var10001 = false;
                  break;
               }

               if (!var50) {
                  continue;
               }
            }

            try {
               var47.add(var4);
            } catch (Throwable var43) {
               var48 = var43;
               var10001 = false;
               break;
            }
         }
      }

      throw var48;
   }

   public void _/* $FF was: Ԩ*/(IBinder var1, String var2, String[] var3, int var4) {
      if (var1 != null) {
         if (var2 != null) {
            ࢠ var5 = this.Ԯ(var4);
            if (lu.die.foza.SleepyFox.ކ.Ԩ((Object[])var3)) {
               ࠨ var10000 = this;
               Account[] var7 = this.Ϳ(var5, var2, true);
               var10000.Ϳ(Stub.asInterface(var1), var7, var4);
            } else {
               Stub var6;
               var6 = new Stub() {
                  // $FF: synthetic field
                  public final IBinder ԭ;
                  // $FF: synthetic field
                  public final int Ԯ;

                  public {
                     this.ԭ = var2;
                     this.Ԯ = var3;
                  }

                  public void onResult(Bundle var1) {
                     Parcelable[] var5;
                     Account[] var2 = new Account[(var5 = var1.getParcelableArray("accounts")).length];

                     for(int var3 = 0; var3 < var5.length; ++var3) {
                        var2[var3] = (Account)var5[var3];
                     }

                     ࠨ var10000 = ࠨ.this;
                     IAccountManagerResponse var4 = Stub.asInterface(this.ԭ);
                     int var6 = this.Ԯ;
                     var10000.Ϳ(var4, var2, var6);
                  }

                  public void onError(int var1, String var2) {
                  }
               }.<init>(var1, var4);
               (new ࠨ.ހ(var5, var6, var2, var3, var4, true)).ֈ();
            }
         } else {
            throw new IllegalArgumentException("accountType is null");
         }
      } else {
         throw new IllegalArgumentException("response is null");
      }
   }

   public void _/* $FF was: Ϳ*/(IBinder var1, String var2, String[] var3, int var4) {
      if (var1 != null) {
         if (var2 != null) {
            ࢠ var5 = this.Ԯ(var4);
            if (var3 != null && var3.length != 0) {
               IAccountManagerResponse var8 = Stub.asInterface(var1);
               (new ࠨ.ހ(var5, var8, var2, var3, var4, false)).ֈ();
            } else {
               ࠨ var10000 = this;
               IBinder var10001 = var1;
               Account[] var6 = this.Ϳ(var5, var2, false);
               Bundle var7;
               Bundle var10002 = var7 = new Bundle;
               var10002.<init>();
               var10002.putParcelableArray("accounts", var6);
               var10000.Ϳ(Stub.asInterface(var10001), var7);
            }
         } else {
            throw new IllegalArgumentException("accountType is null");
         }
      } else {
         throw new IllegalArgumentException("response is null");
      }
   }

   public boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, int var4) {
      return this.Ϳ((Account)var1, (String)var2, (Bundle)var3, (Map)null, var4);
   }

   public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, boolean var3, int var4) {
      ࢠ var6 = this.Ԯ(var4);
      IAccountManagerResponse var5 = Stub.asInterface(var1);
      (new ࠨ.ށ(var6, var5, var2, var3)).ֈ();
   }

   public boolean _/* $FF was: Ϳ*/(Account var1, int var2) {
      return var1 == null ? false : this.Ԩ(this.Ԯ(var2), var1);
   }

   public void _/* $FF was: Ϳ*/(final IBinder var1, final Account var2, final int var3, int var4) {
      ࢠ var5;
      ࢠ var10000 = var5 = this.Ԯ(var3);
      final ࢠ var11 = this.Ԯ(var4);
      if (var10000 != null && var11 != null) {
         var2.toString();
         IAccountManagerResponse var6 = Stub.asInterface(var1);
         String var7 = var2.type;
         String var8 = var2.name;
         (new ࠨ.ނ(var5, var6, var7, false, false, var8, false) {
            public String _/* $FF was: Ԩ*/(long var1x) {
               StringBuilder var3x;
               StringBuilder var10000 = var3x = new StringBuilder;
               var3x.<init>();
               return var10000.append(super.Ԩ(var1x)).append(", getAccountCredentialsForClone, ").append(var2.type).toString();
            }

            public void ހ() throws RemoteException {
               super.ރ.getAccountCredentialsForCloning(this, var2);
            }

            public void onResult(Bundle var1x) {
               if (var1x != null && var1x.getBoolean("booleanResult", false)) {
                  ࠨ var10000 = ࠨ.this;
                  IAccountManagerResponse var2x = Stub.asInterface(var1);
                  Account var3x = var2;
                  ࢠ var4 = var11;
                  int var5 = var3;
                  var10000.Ϳ(var2x, var1x, var3x, var4, var5);
               }

               super.onResult(var1x);
            }
         }).ֈ();
      } else {
         if (var1 != null) {
            IBinder var12 = var1;
            Bundle var10;
            Bundle var10001 = var10 = new Bundle;
            var10001.<init>();
            var10001.putBoolean("booleanResult", false);

            try {
               Stub.asInterface(var12).onResult(var10);
            } catch (RemoteException var9) {
               var9.toString();
            }
         }

      }
   }

   public void _/* $FF was: Ϳ*/(String param1, String param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: ԩ*/(Account var1, String var2, int var3) {
      Objects.requireNonNull(var1, "Account cannot be null");
      Objects.requireNonNull(var2, "AuthTokenType cannot be null");
      ࢠ var5;
      if ((var5 = this.Ԯ(var3)) == null) {
         return null;
      } else {
         ࢠ var10000 = var5;
         Account var10001 = var1;
         synchronized(var5.Ϳ) {
            return (String)var10000.Ԭ(var10001).get(var2);
         }
      }
   }

   public void _/* $FF was: Ԩ*/(Account var1, String var2, String var3, int var4) {
      Objects.requireNonNull(var1, "Account cannot be null");
      Objects.requireNonNull(var2, "AuthTokenType cannot be null");
      ࢠ var12;
      if ((var12 = this.Ԯ(var4)) != null) {
         Object var5;
         Object var10000 = var5 = var12.Ϳ;
         ࠨ var10001 = this;
         ࢠ var10002 = var12;
         Account var10003 = var1;
         synchronized(var5){}

         Throwable var13;
         boolean var14;
         try {
            var10002.Ԭ(var10003).put(var2, var3);
         } catch (Throwable var11) {
            var13 = var11;
            var14 = false;
            throw var13;
         }

         try {
            var10001.ؠ();
         } catch (Throwable var10) {
            var13 = var10;
            var14 = false;
            throw var13;
         }
      }
   }

   public void _/* $FF was: Ԩ*/(Account param1, String param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: Ԩ*/(Account var1, int var2) {
      this.Ԩ((Account)var1, (String)null, var2);
   }

   public void _/* $FF was: Ϳ*/(Account var1, String var2, String var3, int var4) {
      if (var2 != null) {
         if (var1 == null) {
            throw new IllegalArgumentException("account is null");
         } else {
            ࢠ var12;
            if ((var12 = this.Ԯ(var4)) != null) {
               Object var5;
               Object var10000 = var5 = var12.Ϳ;
               ࠨ var10001 = this;
               ࢠ var10002 = var12;
               Account var10003 = var1;
               synchronized(var5){}

               Throwable var13;
               boolean var14;
               try {
                  var10002.ԫ(var10003).put(var2, var3);
               } catch (Throwable var11) {
                  var13 = var11;
                  var14 = false;
                  throw var13;
               }

               try {
                  var10001.ؠ();
               } catch (Throwable var10) {
                  var13 = var10;
                  var14 = false;
                  throw var13;
               }
            }
         }
      } else {
         throw new IllegalArgumentException("key is null");
      }
   }

   public void _/* $FF was: Ϳ*/(Account var1, String var2, int var3, boolean var4) {
   }

   public void _/* $FF was: Ϳ*/(IBinder var1, final Account var2, final String var3, final boolean var4, boolean var5, final Bundle var6, int var7) {
      IAccountManagerResponse var15 = Stub.asInterface(var1);
      IAccountManagerResponse var10000;
      byte var10001;
      boolean var19;
      if (var2 == null) {
         var10000 = var15;
         var10001 = 7;

         try {
            var10000.onError(var10001, "account is null");
            return;
         } catch (RemoteException var12) {
            var19 = false;
         }
      } else {
         if (var3 != null) {
            ࢠ var16 = this.Ԯ(var7);
            ࠨ.ؠ var8;
            final boolean var17;
            if ((var8 = (ࠨ.ؠ)this.ޛ.Ϳ.get(var2.type)) != null && var8.Ϳ.customTokens) {
               var17 = true;
            } else {
               var17 = false;
            }

            final String var9 = var6.getString("androidPackageName");
            var6.putInt("callerUid", Binder.getCallingUid());
            var6.putInt("callerPid", Binder.getCallingPid());
            if (var4) {
               var6.putBoolean("notifyOnAuthFailure", true);
            }

            String var10;
            Bundle var14;
            ࠨ var18;
            Bundle var20;
            if (!var17 && (var10 = this.Ϳ(var16, var2, var3)) != null) {
               var18 = this;
               var20 = var14 = new Bundle;
               var14.<init>();
               var14.putString("authtoken", var10);
               var14.putString("authAccount", var2.name);
               var20.putString("accountType", var2.type);
               var18.Ϳ(var15, var14);
               return;
            }

            if (var17 && (var10 = this.Ϳ(var16, var2, var3, var9)) != null) {
               var18 = this;
               var20 = var14 = new Bundle;
               var14.<init>();
               var14.putString("authtoken", var10);
               var14.putString("authAccount", var2.name);
               var20.putString("accountType", var2.type);
               var18.Ϳ(var15, var14);
               return;
            }

            var10 = var2.type;
            String var11 = var2.name;
            (new ࠨ.ނ(var16, var15, var10, var5, false, var11, false) {
               public String _/* $FF was: Ԩ*/(long var1) {
                  var6.keySet();
                  StringBuilder var3x;
                  StringBuilder var10000 = var3x = new StringBuilder;
                  var3x.<init>();
                  return var10000.append(super.Ԩ(var1)).append(", getAuthToken, ").append(var2).append(", authTokenType ").append(var3).append(", loginOptions ").append(var6).append(", notifyOnAuthFailure ").append(var4).toString();
               }

               public void ހ() throws RemoteException {
                  IAccountAuthenticator var10000 = super.ރ;
                  <undefinedtype> var10001 = this;
                  <undefinedtype> var10002 = this;
                  <undefinedtype> var10003 = this;
                  Account var3x = var2;
                  String var1 = var3;
                  Bundle var2x = var6;
                  var10000.getAuthToken(var10001, var3x, var1, var2x);
               }

               public void onResult(Bundle var1) {
                  String var2x;
                  if (var1 != null && (var2x = var1.getString("authtoken")) != null) {
                     String var3x = var1.getString("authAccount");
                     String var4x;
                     if (TextUtils.isEmpty(var4x = var1.getString("accountType")) || TextUtils.isEmpty(var3x)) {
                        this.onError(5, "the type and name should not be empty");
                        return;
                     }

                     Account var5;
                     var5 = new Account.<init>(var3x, var4x);
                     if (!var17) {
                        ࢠ var9x = super.ޅ;
                        var4x = var3;
                        ࠨ.this.Ԩ(var9x, var5, var4x, var2x);
                     }

                     long var10 = var1.getLong("android.accounts.expiry", 0L);
                     if (var17 && var10 > System.currentTimeMillis()) {
                        ࢠ var11 = super.ޅ;
                        Account var6x = var2;
                        String var7 = var9;
                        String var8 = var3;
                        ࠨ.this.Ϳ(var11, var6x, var7, var8, var2x, var10);
                     }
                  }

                  super.onResult(var1);
               }
            }).ֈ();
            return;
         }

         var10000 = var15;
         var10001 = 7;

         try {
            var10000.onError(var10001, "authTokenType is null");
            return;
         } catch (RemoteException var13) {
            var19 = false;
         }
      }

   }

   public void _/* $FF was: Ϳ*/(IBinder var1, final String var2, final String var3, final String[] var4, boolean var5, final Bundle var6, int var7) {
      if (var1 != null) {
         if (var2 != null) {
            if (var6 == null) {
               var6 = new Bundle.<init>();
            }

            ࢠ var9 = this.Ԯ(var7);
            IAccountManagerResponse var8 = Stub.asInterface(var1);
            (new ࠨ.ނ(var9, var8, var2, var5, true, (String)null, false, true) {
               public void ހ() throws RemoteException {
                  IAccountAuthenticator var10000 = super.ރ;
                  <undefinedtype> var10001 = this;
                  <undefinedtype> var10002 = this;
                  <undefinedtype> var10003 = this;
                  <undefinedtype> var10004 = this;
                  String var4x = super.ԯ;
                  String var1 = var3;
                  String[] var2x = var4;
                  Bundle var3x = var6;
                  var10000.addAccount(var10001, var4x, var1, var2x, var3x);
               }

               public String _/* $FF was: Ԩ*/(long var1) {
                  StringBuilder var3x;
                  StringBuilder var10000 = var3x = new StringBuilder;
                  var3x.<init>();
                  return var10000.append(super.Ԩ(var1)).append(", addAccount, accountType ").append(var2).append(", requiredFeatures ").append(Arrays.toString(var4)).toString();
               }
            }).ֈ();
         } else {
            throw new IllegalArgumentException("accountType is null");
         }
      } else {
         throw new IllegalArgumentException("response is null");
      }
   }

   public void _/* $FF was: Ԩ*/(IBinder var1, String var2, String var3, String[] var4, boolean var5, Bundle var6, int var7) {
   }

   public void _/* $FF was: Ϳ*/(IBinder var1, final Account var2, final String var3, boolean var4, final Bundle var5, int var6) {
      if (var1 != null) {
         if (var2 != null) {
            ࢠ var10 = this.Ԯ(var6);
            IAccountManagerResponse var9 = Stub.asInterface(var1);
            String var7 = var2.type;
            String var8 = var2.name;
            (new ࠨ.ނ(var10, var9, var7, var4, true, var8, false, true) {
               public void ހ() throws RemoteException {
                  IAccountAuthenticator var10000 = super.ރ;
                  <undefinedtype> var10001 = this;
                  <undefinedtype> var10002 = this;
                  <undefinedtype> var10003 = this;
                  Account var3x = var2;
                  String var1 = var3;
                  Bundle var2x = var5;
                  var10000.updateCredentials(var10001, var3x, var1, var2x);
               }

               public String _/* $FF was: Ԩ*/(long var1) {
                  Bundle var3x;
                  if ((var3x = var5) != null) {
                     var3x.keySet();
                  }

                  StringBuilder var4;
                  StringBuilder var10000 = var4 = new StringBuilder;
                  var4.<init>();
                  return var10000.append(super.Ԩ(var1)).append(", updateCredentials, ").append(var2).append(", authTokenType ").append(var3).append(", loginOptions ").append(var5).toString();
               }
            }).ֈ();
         } else {
            throw new IllegalArgumentException("account is null");
         }
      } else {
         throw new IllegalArgumentException("response is null");
      }
   }

   public void _/* $FF was: Ϳ*/(IBinder var1, final String var2, boolean var3, int var4) {
      if (var1 != null) {
         if (var2 != null) {
            ࢠ var6 = this.Ԯ(var4);
            IAccountManagerResponse var5 = Stub.asInterface(var1);
            (new ࠨ.ނ(var6, var5, var2, var3, true, (String)null, false) {
               public void ހ() throws RemoteException {
                  super.ރ.editProperties(this, super.ԯ);
               }

               public String _/* $FF was: Ԩ*/(long var1) {
                  StringBuilder var3;
                  StringBuilder var10000 = var3 = new StringBuilder;
                  var3.<init>();
                  return var10000.append(super.Ԩ(var1)).append(", editProperties, accountType ").append(var2).toString();
               }
            }).ֈ();
         } else {
            throw new IllegalArgumentException("accountType is null");
         }
      } else {
         throw new IllegalArgumentException("response is null");
      }
   }

   public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, Bundle var3, boolean var4, int var5) {
   }

   public boolean _/* $FF was: Ԫ*/(Account var1, int var2) {
      Objects.requireNonNull(var1, "account cannot be null");
      ࢠ var3;
      return (var3 = this.Ԯ(var2)) == null ? false : this.ԩ(var3, var1);
   }

   public void _/* $FF was: Ϳ*/(IBinder var1, final String var2, final String var3, int var4) {
      ࢠ var6 = this.Ԯ(var4);
      IAccountManagerResponse var5 = Stub.asInterface(var1);
      (new ࠨ.ނ(var6, var5, var2, false, false, (String)null, false) {
         public String _/* $FF was: Ԩ*/(long var1) {
            StringBuilder var3x;
            StringBuilder var10000 = var3x = new StringBuilder;
            var3x.<init>();
            return var10000.append(super.Ԩ(var1)).append(", getAuthTokenLabel, ").append(var2).append(", authTokenType ").append(var3).toString();
         }

         public void ހ() throws RemoteException {
            super.ރ.getAuthTokenLabel(this, var3);
         }

         public void onResult(Bundle var1) {
            if (var1 != null) {
               String var3x = var1.getString("authTokenLabelKey");
               Bundle var2x;
               Bundle var10001 = var2x = new Bundle;
               var10001.<init>();
               var10001.putString("authTokenLabelKey", var3x);
               super.onResult(var2x);
            }

            super.onResult((Bundle)null);
         }
      }).ֈ();
   }

   public HashMap<?, ?> _/* $FF was: Ԭ*/(Account var1, int var2) {
      return new HashMap();
   }

   public void _/* $FF was: Ϳ*/(ࢠ var1, Account var2, String var3, String var4, String var5, long var6) {
      if (var2 != null && var4 != null && var3 != null) {
         ʲ var8;
         var8 = new ʲ.<init>(var1.Ԩ, var2, var3, var4, var5, var6);
         LinkedList var15;
         LinkedList var10000 = var15 = this.ޜ;
         ࠨ var10001 = this;
         synchronized(var15){}

         Throwable var16;
         boolean var17;
         try {
            var10001.ޜ.add(var8);
         } catch (Throwable var14) {
            var16 = var14;
            var17 = false;
            throw var16;
         }

         try {
            ;
         } catch (Throwable var13) {
            var16 = var13;
            var17 = false;
            throw var16;
         }
      }
   }

   public void _/* $FF was: Ԩ*/(ࢠ var1, Account var2, String var3, String var4) {
      if (var1 != null) {
         Object var5;
         Object var10000 = var5 = var1.Ϳ;
         ࠨ var10001 = this;
         ࢠ var10002 = var1;
         Account var10003 = var2;
         synchronized(var5){}

         Throwable var12;
         boolean var13;
         try {
            var10002.Ԭ(var10003).put(var3, var4);
         } catch (Throwable var11) {
            var12 = var11;
            var13 = false;
            throw var12;
         }

         try {
            var10001.ؠ();
         } catch (Throwable var10) {
            var12 = var10;
            var13 = false;
            throw var12;
         }
      }
   }

   public String _/* $FF was: Ϳ*/(ࢠ var1, Account var2, String var3, String var4) {
      ࠨ var10000 = this;
      long var5 = System.currentTimeMillis();
      synchronized(this.ޜ){}

      Throwable var141;
      Iterator var142;
      boolean var10001;
      try {
         var142 = var10000.ޜ.iterator();
      } catch (Throwable var140) {
         var141 = var140;
         var10001 = false;
         throw var141;
      }

      Iterator var7 = var142;

      while(true) {
         boolean var143;
         try {
            var143 = var7.hasNext();
         } catch (Throwable var132) {
            var141 = var132;
            var10001 = false;
            break;
         }

         if (!var143) {
            var10000 = null;

            try {
               return var10000;
            } catch (Throwable var131) {
               var141 = var131;
               var10001 = false;
               break;
            }
         }

         ʲ var144;
         try {
            var144 = (ʲ)var7.next();
         } catch (Throwable var139) {
            var141 = var139;
            var10001 = false;
            break;
         }

         ʲ var8 = var144;

         int var145;
         int var146;
         try {
            var146 = var144.Ϳ;
            var145 = var1.Ԩ;
         } catch (Throwable var138) {
            var141 = var138;
            var10001 = false;
            break;
         }

         if (var146 == var145) {
            try {
               var143 = var8.Ԩ.equals(var2);
            } catch (Throwable var137) {
               var141 = var137;
               var10001 = false;
               break;
            }

            if (var143) {
               try {
                  var143 = var8.Ԫ.equals(var3);
               } catch (Throwable var136) {
                  var141 = var136;
                  var10001 = false;
                  break;
               }

               if (var143) {
                  try {
                     var143 = var8.ԩ.equals(var4);
                  } catch (Throwable var135) {
                     var141 = var135;
                     var10001 = false;
                     break;
                  }

                  if (var143) {
                     long var147;
                     try {
                        var147 = var8.Ԭ;
                     } catch (Throwable var134) {
                        var141 = var134;
                        var10001 = false;
                        break;
                     }

                     if (var147 > var5) {
                        try {
                           return var8.ԫ;
                        } catch (Throwable var130) {
                           var141 = var130;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var7.remove();
                     } catch (Throwable var133) {
                        var141 = var133;
                        var10001 = false;
                        break;
                     }
                  }
               }
            }
         }
      }

      throw var141;
   }

   public String _/* $FF was: Ϳ*/(ࢠ var1, Account var2, String var3) {
      if (var1 == null) {
         return null;
      } else {
         ࢠ var10000 = var1;
         Account var10001 = var2;
         synchronized(var1.Ϳ) {
            return (String)var10000.Ԭ(var10001).get(var3);
         }
      }
   }

   public Account[] _/* $FF was: Ϳ*/(int var1, String var2) {
      return (Account[])this.Ԯ(var1).ԩ.toArray(new Account[0]);
   }

   public boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, Map var4, int var5) {
      return this.Ϳ(this.Ԯ(var5), var1, var2, var3, var4);
   }

   public boolean _/* $FF was: Ϳ*/(Account var1, String var2, int var3, int var4) {
      Objects.requireNonNull(var1, "account cannot be null");
      Objects.requireNonNull(var2, "packageName cannot be null");
      ࢠ var5;
      return (var5 = this.Ԯ(var4)) == null ? false : this.Ϳ(var1, var2, var3, var5);
   }

   public int _/* $FF was: Ԫ*/(Account var1, String var2, int var3) {
      Objects.requireNonNull(var1, "account cannot be null");
      Objects.requireNonNull(var2, "packageName cannot be null");
      ࢠ var5 = this.Ԯ(var3);
      int var4;
      if ("android:accounts:key_legacy_visible".equals(var2)) {
         return (var4 = this.Ϳ(var1, var2, var5)) != 0 ? var4 : 2;
      } else if ("android:accounts:key_legacy_not_visible".equals(var2)) {
         return (var4 = this.Ϳ(var1, var2, var5)) != 0 ? var4 : 4;
      } else {
         return this.Ԩ(var1, var2, var5);
      }
   }

   public Map<Account, Integer> _/* $FF was: ԩ*/(String var1, String var2, int var3) {
      ࠨ var10000 = this;
      HashMap var80;
      var80 = new HashMap.<init>();
      ࢠ var81;
      ࢠ var83 = var81 = var10000.Ԯ(var3);
      synchronized(var83.Ϳ){}

      boolean var10001;
      Throwable var84;
      Iterator var85;
      try {
         var85 = var83.ԩ.iterator();
      } catch (Throwable var79) {
         var84 = var79;
         var10001 = false;
         throw var84;
      }

      Iterator var5 = var85;

      while(true) {
         boolean var86;
         try {
            var86 = var5.hasNext();
         } catch (Throwable var73) {
            var84 = var73;
            var10001 = false;
            break;
         }

         if (!var86) {
            try {
               return var80;
            } catch (Throwable var72) {
               var84 = var72;
               var10001 = false;
               break;
            }
         }

         ഺ var87;
         try {
            var87 = (ഺ)var5.next();
         } catch (Throwable var78) {
            var84 = var78;
            var10001 = false;
            break;
         }

         ഺ var6 = var87;

         Account var88;
         try {
            var88 = var87.Ϳ;
         } catch (Throwable var77) {
            var84 = var77;
            var10001 = false;
            break;
         }

         Account var7 = var88;
         if (var88 != null) {
            if (var2 != null) {
               try {
                  var86 = var7.type.equals(var2);
               } catch (Throwable var76) {
                  var84 = var76;
                  var10001 = false;
                  break;
               }

               if (!var86) {
                  continue;
               }
            }

            Integer var89;
            try {
               var89 = (Integer)var81.ԭ(var6.Ϳ).get(var1);
            } catch (Throwable var75) {
               var84 = var75;
               var10001 = false;
               break;
            }

            Integer var82 = var89;
            if (var89 != null) {
               try {
                  var80.put(var6.Ϳ, var82);
               } catch (Throwable var74) {
                  var84 = var74;
                  var10001 = false;
                  break;
               }
            }
         }
      }

      throw var84;
   }

   public void _/* $FF was: Ϳ*/(String[] var1, String var2, int var3) throws RemoteException {
   }

   public void _/* $FF was: Ԩ*/(String[] var1, String var2, int var3) {
   }

   public Account[] _/* $FF was: Ϳ*/(ࢠ var1, String var2, boolean var3) {
      Account[] var10002;
      Account[] var10003;
      if (var2 != null) {
         ࢠ var161 = var1;
         String var164 = var2;
         synchronized(var1.Ϳ) {
            var10002 = var161.Ϳ(var164);
            var10003 = var10002;
         }

         return this.Ϳ(var1, (Account[])Arrays.copyOf(var10002, var10003.length), var3);
      } else {
         ࠨ var10000 = this;
         int var153 = 0;
         synchronized(this.ޚ){}

         boolean var10001;
         Throwable var156;
         Iterator var157;
         try {
            var157 = var10000.ޚ.values().iterator();
         } catch (Throwable var152) {
            var156 = var152;
            var10001 = false;
            throw var156;
         }

         Iterator var5 = var157;

         while(true) {
            boolean var158;
            try {
               var158 = var5.hasNext();
            } catch (Throwable var150) {
               var156 = var150;
               var10001 = false;
               break;
            }

            int var159;
            int var160;
            if (!var158) {
               if (var153 == 0) {
                  try {
                     return ޡ;
                  } catch (Throwable var142) {
                     var156 = var142;
                     var10001 = false;
                     break;
                  }
               } else {
                  Account[] var162;
                  try {
                     var10000 = this;
                     var162 = new Account[var153];
                  } catch (Throwable var149) {
                     var156 = var149;
                     var10001 = false;
                     break;
                  }

                  Account[] var154 = var162;
                  int var155 = 0;

                  try {
                     var157 = var10000.ޚ.values().iterator();
                  } catch (Throwable var148) {
                     var156 = var148;
                     var10001 = false;
                     break;
                  }

                  Iterator var6 = var157;

                  while(true) {
                     try {
                        var158 = var6.hasNext();
                     } catch (Throwable var144) {
                        var156 = var144;
                        var10001 = false;
                        throw var156;
                     }

                     if (!var158) {
                        ࢠ var165;
                        try {
                           var10000 = this;
                           var165 = var1;
                           var10002 = var154;
                        } catch (Throwable var143) {
                           var156 = var143;
                           var10001 = false;
                           throw var156;
                        }

                        return var10000.Ϳ(var165, var10002, var3);
                     }

                     try {
                        var159 = var155;
                        var162 = ((ࢠ)var6.next()).Ϳ();
                     } catch (Throwable var147) {
                        var156 = var147;
                        var10001 = false;
                        throw var156;
                     }

                     var10002 = var162;
                     var10003 = var162;
                     byte var7 = 0;

                     int var163;
                     try {
                        var163 = var10003.length;
                     } catch (Throwable var146) {
                        var156 = var146;
                        var10001 = false;
                        throw var156;
                     }

                     int var8 = var163;

                     try {
                        System.arraycopy(var10002, var7, var154, var155, var8);
                        var160 = var162.length;
                     } catch (Throwable var145) {
                        var156 = var145;
                        var10001 = false;
                        throw var156;
                     }

                     var155 = var159 + var160;
                  }
               }
            }

            try {
               var159 = var153;
               var160 = ((ࢠ)var5.next()).Ϳ().length;
            } catch (Throwable var151) {
               var156 = var151;
               var10001 = false;
               break;
            }

            var153 = var159 + var160;
         }

         throw var156;
      }
   }

   public String _/* $FF was: Ϳ*/(ࢠ var1, Account var2) {
      if (var1 == null) {
         return null;
      } else {
         ࢠ var10000 = var1;
         synchronized(var1.Ϳ){}

         Throwable var16;
         ഺ var17;
         boolean var10001;
         try {
            var17 = var10000.Ԫ(var2);
         } catch (Throwable var14) {
            var16 = var14;
            var10001 = false;
            throw var16;
         }

         ഺ var15 = var17;
         if (var17 == null) {
            var10000 = null;

            try {
               return var10000;
            } catch (Throwable var12) {
               var16 = var12;
               var10001 = false;
               throw var16;
            }
         } else {
            try {
               return var15.Ԩ;
            } catch (Throwable var13) {
               var16 = var13;
               var10001 = false;
               throw var16;
            }
         }
      }
   }

   public ࢠ _/* $FF was: Ԯ*/(int var1) {
      ࠨ var10000 = this;
      synchronized(this.ޚ){}

      boolean var10001;
      Throwable var24;
      ࢠ var25;
      try {
         var25 = (ࢠ)var10000.ޚ.get(var1);
      } catch (Throwable var23) {
         var24 = var23;
         var10001 = false;
         throw var24;
      }

      if (var25 == null) {
         ࢠ var26;
         try {
            var10000 = this;
            var26 = new ࢠ;
         } catch (Throwable var22) {
            var24 = var22;
            var10001 = false;
            throw var24;
         }

         ࢠ var3 = var26;

         try {
            var26.<init>();
            var10000.ޚ.put(var1, var3);
         } catch (Throwable var21) {
            var24 = var21;
            var10001 = false;
            throw var24;
         }
      }

      try {
         return (ࢠ)this.ޚ.get(var1);
      } catch (Throwable var20) {
         var24 = var20;
         var10001 = false;
         throw var24;
      }
   }

   public void ֏(String var1) {
      Intent var2;
      var2 = new Intent.<init>("android.accounts.AccountAuthenticator");
      if (var1 != null) {
         var2.setPackage(var1);
      } else {
         this.ޛ.Ϳ.clear();
      }

      this.Ϳ(ࢽ.Ϳ.Ԫ(var2, (String)null, 128), this.ޛ.Ϳ);
   }

   private static final class ׯ {
      public final Map<String, ࠨ.ؠ> Ϳ;

      public _/* $FF was: ׯ*/() {
         ࠨ.ׯ var10000 = this;
         super();
         ބ var1;
         var1 = new ބ.<init>();
         var10000.Ϳ = var1;
      }

      // $FF: synthetic method
      public _/* $FF was: ׯ*/(Object var1) {
         this();
      }
   }

   private static final class ؠ {
      public final AuthenticatorDescription Ϳ;
      public final ServiceInfo Ԩ;

      public ؠ(AuthenticatorDescription var1, ServiceInfo var2) {
         this.Ϳ = var1;
         this.Ԩ = var2;
      }
   }

   public class ހ extends ࠨ.ނ {
      public final String[] އ;
      public volatile Account[] ވ = null;
      public volatile ArrayList<Account> މ = null;
      public volatile int ފ = 0;
      public final boolean ދ;

      public ހ(ࢠ var2, IAccountManagerResponse var3, String var4, String[] var5, int var6, boolean var7) {
         super(var2, var3, var4, false, true, (String)null, false);
         this.އ = var5;
         this.ދ = var7;
      }

      public void ހ() throws RemoteException {
         ࢠ var1 = super.ޅ;
         String var2 = super.ԯ;
         boolean var3 = this.ދ;
         this.ވ = ࠨ.this.Ϳ(var1, var2, var3);
         this.މ = new ArrayList(this.ވ.length);
         this.ފ = 0;
         this.ރ();
      }

      public void ރ() {
         if (this.ފ >= this.ވ.length) {
            this.ބ();
         } else {
            IAccountAuthenticator var1;
            if ((var1 = super.ރ) != null) {
               label32: {
                  IAccountAuthenticator var10000;
                  boolean var10001;
                  ࠨ.ހ var10002;
                  Account var10003;
                  ࠨ.ހ var5;
                  try {
                     var10000 = var1;
                     var5 = this;
                     var10002 = this;
                     var10003 = this.ވ[this.ފ];
                  } catch (RemoteException var3) {
                     var10001 = false;
                     break label32;
                  }

                  Account var4 = var10003;

                  try {
                     var10000.hasFeatures(var5, var4, var10002.އ);
                     return;
                  } catch (RemoteException var2) {
                     var10001 = false;
                  }
               }

               this.onError(1, "remote exception");
            }
         }
      }

      public void onResult(Bundle var1) {
         ++super.ހ;
         if (var1 == null) {
            this.onError(5, "null bundle");
         } else {
            if (var1.getBoolean("booleanResult", false)) {
               this.މ.add(this.ވ[this.ފ]);
            }

            ++this.ފ;
            this.ރ();
         }
      }

      public void ބ() {
         IAccountManagerResponse var1;
         if ((var1 = this.ؠ()) != null) {
            int var10000;
            boolean var10001;
            try {
               var10000 = this.މ.size();
            } catch (RemoteException var8) {
               var10001 = false;
               return;
            }

            int var2 = var10000;

            Account[] var9;
            try {
               var9 = new Account[var10000];
            } catch (RemoteException var7) {
               var10001 = false;
               return;
            }

            Account[] var3 = var9;

            for(int var4 = 0; var4 < var2; ++var4) {
               try {
                  var3[var4] = (Account)this.މ.get(var4);
               } catch (RemoteException var6) {
                  var10001 = false;
                  return;
               }
            }

            try {
               Bundle var10 = new Bundle();
               var10.putParcelableArray("accounts", var3);
               var1.onResult(var10);
            } catch (RemoteException var5) {
               var10001 = false;
            }
         }

      }

      public String _/* $FF was: Ԩ*/(long var1) {
         ࠨ.ހ var10000 = this;
         StringBuilder var3;
         StringBuilder var10001 = var3 = new StringBuilder;
         var3.<init>();
         StringBuilder var4 = var10001.append(super.Ԩ(var1)).append(", getAccountsByTypeAndFeatures, ");
         String[] var5;
         String var6;
         if ((var5 = var10000.އ) != null) {
            var6 = TextUtils.join(",", var5);
         } else {
            var6 = null;
         }

         return var4.append(var6).toString();
      }
   }

   public class ށ extends ࠨ.ނ {
      public final Account އ;

      public ށ(ࢠ var2, IAccountManagerResponse var3, Account var4, boolean var5) {
         ࠨ.ށ var10000 = this;
         ࠨ.ށ var10001 = this;
         String var7 = var4.type;
         String var6 = var4.name;
         var10001.<init>(var2, var3, var7, var5, true, var6, false);
         var10000.އ = var4;
      }

      public String _/* $FF was: Ԩ*/(long var1) {
         StringBuilder var3;
         StringBuilder var10000 = var3 = new StringBuilder;
         var3.<init>();
         return var10000.append(super.Ԩ(var1)).append(", removeAccount, account ").append(this.އ).toString();
      }

      public void ހ() throws RemoteException {
         super.ރ.getAccountRemovalAllowed(this, this.އ);
      }

      public void onResult(Bundle var1) {
         if (var1 != null && var1.containsKey("booleanResult") && !var1.containsKey("intent")) {
            if (var1.getBoolean("booleanResult")) {
               ࢠ var2 = super.ޅ;
               ࠨ.this.Ԩ(var2, this.އ);
            }

            IAccountManagerResponse var4;
            if ((var4 = this.ؠ()) != null) {
               try {
                  var4.onResult(var1);
               } catch (RemoteException var3) {
                  var3.toString();
               }
            }
         }

         super.onResult(var1);
      }
   }

   private abstract class ނ extends FozaAccountAuthenticatorResponse implements DeathRecipient, ServiceConnection {
      public final FozaServiceConnection ԭ;
      public IAccountManagerResponse Ԯ;
      public final String ԯ;
      public final boolean ՠ;
      public final long ֈ;
      public final String ֏;
      public final boolean ׯ;
      public final boolean ؠ;
      public int ހ;
      public int ށ;
      public int ނ;
      public IAccountAuthenticator ރ;
      public final boolean ބ;
      public final ࢠ ޅ;

      public ނ(ࢠ var2, IAccountManagerResponse var3, String var4, boolean var5, boolean var6, String var7, boolean var8) {
         this(var2, var3, var4, var5, var6, var7, var8, false);
      }

      public ނ(ࢠ var2, IAccountManagerResponse var3, String var4, boolean var5, boolean var6, String var7, boolean var8, boolean var9) {
         this.ހ = 0;
         this.ށ = 0;
         this.ނ = 0;
         this.ރ = null;
         if (var4 != null) {
            this.ޅ = var2;
            this.ބ = var6;
            this.Ԯ = var3;
            this.ԯ = var4;
            this.ՠ = var5;
            long var21 = SystemClock.elapsedRealtime();
            this.ֈ = var21;
            this.֏ = var7;
            this.ׯ = var8;
            this.ؠ = var9;
            LinkedHashMap var20;
            LinkedHashMap var10001 = var20 = ࠨ.this.ޝ;
            ࠨ var10002 = ࠨ.this;
            synchronized(var20){}

            Throwable var10000;
            boolean var22;
            try {
               var10002.ޝ.put(this.toString(), this);
            } catch (Throwable var18) {
               var10000 = var18;
               var22 = false;
               throw var10000;
            }

            try {
               ;
            } catch (Throwable var17) {
               var10000 = var17;
               var22 = false;
               throw var10000;
            }

            FozaServiceConnection var19;
            var19 = new FozaServiceConnection.<init>(this);
            this.ԭ = var19;
            if (var3 != null) {
               try {
                  var3.asBinder().linkToDeath(this, 0);
               } catch (RemoteException var16) {
                  this.Ԯ = null;
                  this.binderDied();
               }
            }

         } else {
            throw new IllegalArgumentException("accountType is null");
         }
      }

      public IAccountManagerResponse ؠ() {
         IAccountManagerResponse var1;
         if ((var1 = this.Ԯ) == null) {
            return null;
         } else {
            this.ׯ();
            return var1;
         }
      }

      public boolean _/* $FF was: Ϳ*/(int var1, Intent var2) {
         if (var2.getClipData() == null) {
            var2.setClipData(ClipData.newPlainText((CharSequence)null, (CharSequence)null));
         }

         var2.setFlags(var2.getFlags() & -196);
         long var5 = Binder.clearCallingIdentity();

         ActivityInfo var10000;
         try {
            var10000 = ࢽ.Ϳ.Ϳ(var2);
         } catch (Throwable var4) {
            Binder.restoreCallingIdentity(var5);
            throw var4;
         }

         boolean var6 = var10000 != null;
         Binder.restoreCallingIdentity(var5);
         return var6;
      }

      public void binderDied() {
         this.Ԯ = null;
         this.ׯ();
      }

      public String ށ() {
         return this.Ԩ(SystemClock.elapsedRealtime());
      }

      public String _/* $FF was: Ԩ*/(long var1) {
         StringBuilder var3 = (new StringBuilder("Session: expectLaunch ")).append(this.ՠ).append(", connected ");
         boolean var4;
         if (this.ރ != null) {
            var4 = true;
         } else {
            var4 = false;
         }

         return var3.append(var4).append(", stats (").append(this.ހ).append("/").append(this.ށ).append("/").append(this.ނ).append("), lifetime ").append((double)(var1 - this.ֈ) / 1000.0D).toString();
      }

      public void _/* $FF was: ֈ*/() {
         if (!this.֏(this.ԯ)) {
            this.onError(1, "bind failure");
         }

      }

      public void ֏() {
         ࠨ.this.ޞ.removeMessages(3, this);
      }

      public void onServiceConnected(ComponentName var1, IBinder var2) {
         ࠨ.ނ var10000 = this;
         this.ރ = android.accounts.IAccountAuthenticator.Stub.asInterface(var2);

         try {
            var10000.ހ();
         } catch (RemoteException var3) {
            this.onError(1, "remote exception");
         }

      }

      public void onServiceDisconnected(ComponentName var1) {
         this.ރ = null;
         IAccountManagerResponse var3;
         if ((var3 = this.ؠ()) != null) {
            IAccountManagerResponse var10000 = var3;
            byte var10001 = 1;

            try {
               var10000.onError(var10001, "disconnected");
            } catch (RemoteException var2) {
            }
         }

      }

      public abstract void ހ() throws RemoteException;

      public void onResult(Bundle param1) {
         // $FF: Couldn't be decompiled
      }

      public void onRequestContinued() {
         ++this.ށ;
      }

      public void onError(int var1, String var2) {
         ++this.ނ;
         IAccountManagerResponse var4;
         if ((var4 = this.ؠ()) != null) {
            try {
               var4.onError(var1, var2);
            } catch (RemoteException var3) {
            }
         }

      }

      public final void _/* $FF was: ׯ*/() {
         ࠨ.ނ var10000 = this;
         synchronized(ࠨ.this.ޝ){}

         boolean var10001;
         Throwable var23;
         label197: {
            Object var24;
            try {
               var24 = ࠨ.this.ޝ.remove(this.toString());
            } catch (Throwable var21) {
               var23 = var21;
               var10001 = false;
               break label197;
            }

            if (var24 == null) {
               label190:
               try {
                  return;
               } catch (Throwable var19) {
                  var23 = var19;
                  var10001 = false;
                  break label190;
               }
            } else {
               label201: {
                  try {
                     var10000 = this;
                  } catch (Throwable var20) {
                     var23 = var20;
                     var10001 = false;
                     break label201;
                  }

                  IAccountManagerResponse var1;
                  if ((var1 = var10000.Ԯ) != null) {
                     var1.asBinder().unlinkToDeath(this, 0);
                     this.Ԯ = null;
                  }

                  this.֏();
                  this.ނ();
                  return;
               }
            }
         }

         while(true) {
            Throwable var22 = var23;

            try {
               var23 = var22;
               throw var23;
            } catch (Throwable var18) {
               var23 = var18;
               var10001 = false;
               continue;
            }
         }
      }

      public final void ނ() {
         if (this.ރ != null) {
            this.ރ = null;
            ࢢ.Ϳ.Ϳ((IBinder)this.ԭ);
         }

      }

      public final boolean ֏(String var1) {
         ࠨ.ؠ var6;
         if ((var6 = (ࠨ.ؠ)ࠨ.this.ޛ.Ϳ.get(var1)) == null) {
            return false;
         } else {
            Intent var2;
            Intent var10000 = var2 = new Intent;
            var10000.<init>();
            var10000.setAction("android.accounts.AccountAuthenticator");
            ComponentName var3;
            ComponentName var10001 = var3 = new ComponentName;
            ServiceInfo var10003 = var6.Ԩ;
            String var4 = var10003.packageName;
            var10001.<init>(var4, var10003.name);
            var10000.setComponent(var10001);
            ࠨ.ނ var10002 = this;
            ServiceInfo var5 = var6.Ԩ;
            if (ࢢ.Ϳ.Ϳ(var2, var5, var10002.ԭ, "0") == -1) {
               var3.toString();
               return false;
            } else {
               return true;
            }
         }
      }
   }
}
