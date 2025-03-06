package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public interface ຨ extends IInterface {
   String Ԫ = "lu.die.fozalib.IScaleActivityManager";

   Intent _/* $FF was: Ԩ*/(Intent var1, String var2) throws RemoteException;

   ຘ _/* $FF was: ԭ*/() throws RemoteException;

   void _/* $FF was: ԩ*/(String var1, String var2) throws RemoteException;

   int _/* $FF was: Ϳ*/(ProviderInfo var1, String var2) throws RemoteException;

   ComponentName _/* $FF was: Ԩ*/(Intent var1, ServiceInfo var2, String var3) throws RemoteException;

   int _/* $FF was: Ϳ*/(Intent var1, ServiceInfo var2, String var3) throws RemoteException;

   int _/* $FF was: Ϳ*/(Intent var1, ServiceInfo var2, IBinder var3, String var4) throws RemoteException;

   int _/* $FF was: Ϳ*/(IBinder var1) throws RemoteException;

   void _/* $FF was: ԩ*/(Intent var1, String var2) throws RemoteException;

   void _/* $FF was: ՠ*/() throws RemoteException;

   void _/* $FF was: Ϳ*/(String var1, String var2) throws RemoteException;

   void _/* $FF was: Ϳ*/(String var1, String var2, boolean var3) throws RemoteException;

   boolean _/* $FF was: Ԫ*/(String var1, String var2, int var3) throws RemoteException;

   Intent _/* $FF was: Ϳ*/(Intent var1, int var2) throws RemoteException;

   int _/* $FF was: Ϳ*/(Intent var1, String var2) throws RemoteException;

   void _/* $FF was: Ϳ*/(IntentFilter var1, IBinder var2, String var3, ຓ var4) throws RemoteException;

   void _/* $FF was: ԩ*/(IBinder var1) throws RemoteException;

   void _/* $FF was: Ԫ*/(Intent var1) throws RemoteException;

   String _/* $FF was: Ԫ*/(int var1) throws RemoteException;

   void _/* $FF was: Ϳ*/(long var1) throws RemoteException;

   void _/* $FF was: Ϳ*/(long var1, Notification var3, int var4) throws RemoteException;

   void _/* $FF was: Ԫ*/() throws RemoteException;

   void _/* $FF was: Ϳ*/(ൔ var1, ຓ var2) throws RemoteException;

   List<RunningAppProcessInfo> _/* $FF was: ԩ*/(int var1) throws RemoteException;

   public static class Ԫ {
      public static <T> T _/* $FF was: Ԩ*/(Parcel var0, Creator<T> var1) {
         return var0.readInt() != 0 ? var1.createFromParcel(var0) : null;
      }

      public static <T extends Parcelable> void _/* $FF was: Ԩ*/(Parcel var0, T var1, int var2) {
         if (var1 != null) {
            var0.writeInt(1);
            var1.writeToParcel(var0, var2);
         } else {
            var0.writeInt(0);
         }

      }

      // $FF: synthetic method
      public static Object _/* $FF was: Ϳ*/(Parcel var0, Creator var1) {
         return Ԩ(var0, var1);
      }

      // $FF: synthetic method
      public static void _/* $FF was: Ϳ*/(Parcel var0, Parcelable var1, int var2) {
         Ԩ(var0, var1, var2);
      }
   }

   public abstract static class Ԩ extends Binder implements ຨ {
      public static final int ԭ = 1;
      public static final int Ԯ = 2;
      public static final int ԯ = 3;
      public static final int ՠ = 4;
      public static final int ֈ = 5;
      public static final int ֏ = 6;
      public static final int ׯ = 7;
      public static final int ؠ = 8;
      public static final int ހ = 9;
      public static final int ށ = 10;
      public static final int ނ = 11;
      public static final int ރ = 12;
      public static final int ބ = 13;
      public static final int ޅ = 14;
      public static final int ކ = 15;
      public static final int އ = 16;
      public static final int ވ = 17;
      public static final int މ = 18;
      public static final int ފ = 19;
      public static final int ދ = 20;
      public static final int ތ = 21;
      public static final int ލ = 22;
      public static final int ގ = 23;
      public static final int ޏ = 24;

      public _/* $FF was: Ԩ*/() {
         this.attachInterface(this, "lu.die.fozalib.IScaleActivityManager");
      }

      public static ຨ _/* $FF was: Ԫ*/(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1;
            return (ຨ)((var1 = var0.queryLocalInterface("lu.die.fozalib.IScaleActivityManager")) != null && var1 instanceof ຨ ? (ຨ)var1 : new ຨ.Ԩ.Ϳ(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         String var5 = "lu.die.fozalib.IScaleActivityManager";
         if (var1 >= 1 && var1 <= 16777215) {
            var2.enforceInterface(var5);
         }

         if (var1 == 1598968902) {
            var3.writeString(var5);
            return true;
         } else {
            label102: {
               byte var7;
               int var12;
               String var14;
               String var16;
               String var17;
               ServiceInfo var18;
               String var22;
               Intent var24;
               int var25;
               switch(var1) {
               case 1:
                  var24 = (Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR);
                  var14 = var2.readString();
                  var24 = this.Ԩ(var24, var14);
                  var3.writeNoException();
                  var7 = 1;
                  break;
               case 2:
                  ຘ var29 = this.ԭ();
                  var3.writeNoException();
                  var3.writeStrongInterface(var29);
                  return true;
               case 3:
                  this.ԩ(var14 = var2.readString(), var14);
                  break label102;
               case 4:
                  ProviderInfo var28 = (ProviderInfo)ຨ.Ԫ.Ԩ(var2, ProviderInfo.CREATOR);
                  var14 = var2.readString();
                  var25 = this.Ϳ(var28, var14);
                  var3.writeNoException();
                  var3.writeInt(var25);
                  return true;
               case 5:
                  var24 = (Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR);
                  var18 = (ServiceInfo)ຨ.Ԫ.Ԩ(var2, ServiceInfo.CREATOR);
                  var16 = var2.readString();
                  ComponentName var27 = this.Ԩ(var24, var18, var16);
                  var3.writeNoException();
                  var7 = 1;
                  ຨ.Ԫ.Ԩ(var3, var27, var7);
                  return true;
               case 6:
                  var24 = (Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR);
                  var18 = (ServiceInfo)ຨ.Ԫ.Ԩ(var2, ServiceInfo.CREATOR);
                  var16 = var2.readString();
                  var25 = this.Ϳ(var24, var18, var16);
                  var3.writeNoException();
                  var3.writeInt(var25);
                  return true;
               case 7:
                  var24 = (Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR);
                  var18 = (ServiceInfo)ຨ.Ԫ.Ԩ(var2, ServiceInfo.CREATOR);
                  IBinder var19 = var2.readStrongBinder();
                  var16 = var2.readString();
                  var25 = this.Ϳ(var24, var18, var19, var16);
                  var3.writeNoException();
                  var3.writeInt(var25);
                  return true;
               case 8:
                  var25 = this.Ϳ(var2.readStrongBinder());
                  var3.writeNoException();
                  var3.writeInt(var25);
                  return true;
               case 9:
                  var24 = (Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR);
                  var14 = var2.readString();
                  this.ԩ(var24, var14);
                  break label102;
               case 10:
                  this.ՠ();
                  break label102;
               case 11:
                  this.Ϳ(var14 = var2.readString(), var14);
                  break label102;
               case 12:
                  var14 = var2.readString();
                  var17 = var2.readString();
                  boolean var15;
                  if (var2.readInt() != 0) {
                     var15 = true;
                  } else {
                     var15 = false;
                  }

                  this.Ϳ(var14, var17, var15);
                  break label102;
               case 13:
                  var22 = var14 = var2.readString();
                  var12 = var2.readInt();
                  byte var26 = this.Ԫ(var22, var14, var12);
                  var3.writeNoException();
                  var3.writeInt(var26);
                  return true;
               case 14:
                  var24 = (Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR);
                  var1 = var2.readInt();
                  var24 = this.Ϳ(var24, var1);
                  var3.writeNoException();
                  var7 = 1;
                  break;
               case 15:
                  var24 = (Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR);
                  var14 = var2.readString();
                  var25 = this.Ϳ(var24, var14);
                  var3.writeNoException();
                  var3.writeInt(var25);
                  return true;
               case 16:
                  IntentFilter var23 = (IntentFilter)ຨ.Ԫ.Ԩ(var2, IntentFilter.CREATOR);
                  IBinder var11 = var2.readStrongBinder();
                  var17 = var2.readString();
                  ຓ var13 = ຓ.Ԩ.Ԫ(var2.readStrongBinder());
                  this.Ϳ(var23, var11, var17, var13);
                  break label102;
               case 17:
                  this.ԩ(var2.readStrongBinder());
                  break label102;
               case 18:
                  this.Ԫ((Intent)ຨ.Ԫ.Ԩ(var2, Intent.CREATOR));
                  break label102;
               case 19:
                  var22 = this.Ԫ(var2.readInt());
                  var3.writeNoException();
                  var3.writeString(var22);
                  return true;
               case 20:
                  long var10 = var2.readLong();
                  this.Ϳ(var10);
                  break label102;
               case 21:
                  long var20 = var2.readLong();
                  Notification var9 = (Notification)ຨ.Ԫ.Ԩ(var2, Notification.CREATOR);
                  var12 = var2.readInt();
                  this.Ϳ(var20, var9, var12);
                  break label102;
               case 22:
                  this.Ԫ();
                  break label102;
               case 23:
                  ൔ var21 = (ൔ)ຨ.Ԫ.Ԩ(var2, ൔ.CREATOR);
                  ຓ var8 = ຓ.Ԩ.Ԫ(var2.readStrongBinder());
                  this.Ϳ(var21, var8);
                  break label102;
               case 24:
                  List var10000 = this.ԩ(var2.readInt());
                  var3.writeNoException();
                  var3.writeTypedList(var10000);
                  return true;
               default:
                  return super.onTransact(var1, var2, var3, var4);
               }

               ຨ.Ԫ.Ԩ(var3, var24, var7);
               return true;
            }

            var3.writeNoException();
            return true;
         }
      }

      public static class Ϳ implements ຨ {
         public IBinder ԭ;

         public _/* $FF was: Ϳ*/(IBinder var1) {
            this.ԭ = var1;
         }

         public IBinder asBinder() {
            return this.ԭ;
         }

         public String _/* $FF was: ֈ*/() {
            return "lu.die.fozalib.IScaleActivityManager";
         }

         public Intent _/* $FF was: Ԩ*/(Intent var1, String var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            Intent var20;
            label120: {
               Throwable var18;
               label124: {
                  ຨ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  String var10004;
                  Parcel var10005;
                  Intent var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeString(var10004);
                     var10002.ԭ.transact(1, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = (Intent)ຨ.Ԫ.Ԩ(var10000, Intent.CREATOR);
                     break label120;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label111;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            var4.recycle();
            var3.recycle();
            return var20;
         }

         public ຘ _/* $FF was: ԭ*/() throws RemoteException {
            Parcel var1 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var2;
            Parcel var10001 = var2 = var10000;

            ຘ var11;
            label68: {
               Throwable var9;
               label72: {
                  boolean var10;
                  try {
                     var1.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     this.ԭ.transact(2, var1, var2, 0);
                  } catch (Throwable var8) {
                     var9 = var8;
                     var10 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var11 = ຘ.Ԩ.Ԫ(var10000.readStrongBinder());
                     break label68;
                  } catch (Throwable var7) {
                     var9 = var7;
                     var10 = false;
                     break label63;
                  }
               }

               var2.recycle();
               var1.recycle();
               throw var9;
            }

            var2.recycle();
            var1.recycle();
            return var11;
         }

         public void _/* $FF was: ԩ*/(String var1, String var2) throws RemoteException {
            Parcel var3;
            Parcel var10000 = var3 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var4;
            Parcel var10002 = var4 = var10001;

            label68: {
               Throwable var11;
               label72: {
                  boolean var12;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var3.writeString(var1);
                     var3.writeString(var2);
                     this.ԭ.transact(3, var3, var4, 0);
                  } catch (Throwable var10) {
                     var11 = var10;
                     var12 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var9) {
                     var11 = var9;
                     var12 = false;
                     break label63;
                  }
               }

               var4.recycle();
               var3.recycle();
               throw var11;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public int _/* $FF was: Ϳ*/(ProviderInfo var1, String var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            int var20;
            label120: {
               Throwable var18;
               label124: {
                  ຨ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  String var10004;
                  Parcel var10005;
                  ProviderInfo var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeString(var10004);
                     var10002.ԭ.transact(4, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = var10000.readInt();
                     break label120;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label111;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            var4.recycle();
            var3.recycle();
            return var20;
         }

         public ComponentName _/* $FF was: Ԩ*/(Intent var1, ServiceInfo var2, String var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            ComponentName var30;
            label186: {
               Throwable var28;
               label190: {
                  ຨ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  String var10004;
                  Parcel var10005;
                  ServiceInfo var10006;
                  Parcel var10007;
                  Intent var10008;
                  boolean var29;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var25) {
                     var28 = var25;
                     var29 = false;
                     break label190;
                  }

                  byte var10009 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10007, var10008, var10009);
                  } catch (Throwable var24) {
                     var28 = var24;
                     var29 = false;
                     break label190;
                  }

                  byte var27 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10005, var10006, var27);
                     var10003.writeString(var10004);
                     var10002.ԭ.transact(5, var4, var5, 0);
                  } catch (Throwable var23) {
                     var28 = var23;
                     var29 = false;
                     break label190;
                  }

                  label173:
                  try {
                     var10001.readException();
                     var30 = (ComponentName)ຨ.Ԫ.Ԩ(var10000, ComponentName.CREATOR);
                     break label186;
                  } catch (Throwable var22) {
                     var28 = var22;
                     var29 = false;
                     break label173;
                  }
               }

               Throwable var26 = var28;
               var5.recycle();
               var4.recycle();
               throw var26;
            }

            var5.recycle();
            var4.recycle();
            return var30;
         }

         public int _/* $FF was: Ϳ*/(Intent var1, ServiceInfo var2, String var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            int var30;
            label186: {
               Throwable var28;
               label190: {
                  ຨ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  String var10004;
                  Parcel var10005;
                  ServiceInfo var10006;
                  Parcel var10007;
                  Intent var10008;
                  boolean var29;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var25) {
                     var28 = var25;
                     var29 = false;
                     break label190;
                  }

                  byte var10009 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10007, var10008, var10009);
                  } catch (Throwable var24) {
                     var28 = var24;
                     var29 = false;
                     break label190;
                  }

                  byte var27 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10005, var10006, var27);
                     var10003.writeString(var10004);
                     var10002.ԭ.transact(6, var4, var5, 0);
                  } catch (Throwable var23) {
                     var28 = var23;
                     var29 = false;
                     break label190;
                  }

                  label173:
                  try {
                     var10001.readException();
                     var30 = var10000.readInt();
                     break label186;
                  } catch (Throwable var22) {
                     var28 = var22;
                     var29 = false;
                     break label173;
                  }
               }

               Throwable var26 = var28;
               var5.recycle();
               var4.recycle();
               throw var26;
            }

            var5.recycle();
            var4.recycle();
            return var30;
         }

         public int _/* $FF was: Ϳ*/(Intent var1, ServiceInfo var2, IBinder var3, String var4) throws RemoteException {
            Parcel var5 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var6;
            Parcel var10001 = var6 = var10000;

            int var31;
            label186: {
               Throwable var29;
               label190: {
                  ຨ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  String var10004;
                  Parcel var10005;
                  IBinder var10006;
                  Parcel var10007;
                  ServiceInfo var10008;
                  Parcel var10009;
                  Intent var10010;
                  boolean var30;
                  try {
                     var10002 = this;
                     var10003 = var5;
                     var10004 = var4;
                     var10005 = var5;
                     var10006 = var3;
                     var10007 = var5;
                     var10008 = var2;
                     var10009 = var5;
                     var10010 = var1;
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var26) {
                     var29 = var26;
                     var30 = false;
                     break label190;
                  }

                  byte var10011 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10009, var10010, var10011);
                  } catch (Throwable var25) {
                     var29 = var25;
                     var30 = false;
                     break label190;
                  }

                  byte var28 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10007, var10008, var28);
                     var10005.writeStrongBinder(var10006);
                     var10003.writeString(var10004);
                     var10002.ԭ.transact(7, var5, var6, 0);
                  } catch (Throwable var24) {
                     var29 = var24;
                     var30 = false;
                     break label190;
                  }

                  label173:
                  try {
                     var10001.readException();
                     var31 = var10000.readInt();
                     break label186;
                  } catch (Throwable var23) {
                     var29 = var23;
                     var30 = false;
                     break label173;
                  }
               }

               Throwable var27 = var29;
               var6.recycle();
               var5.recycle();
               throw var27;
            }

            var6.recycle();
            var5.recycle();
            return var31;
         }

         public int _/* $FF was: Ϳ*/(IBinder var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            int var12;
            label68: {
               Throwable var10;
               label72: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var2.writeStrongBinder(var1);
                     this.ԭ.transact(8, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var12 = var10000.readInt();
                     break label68;
                  } catch (Throwable var8) {
                     var10 = var8;
                     var11 = false;
                     break label63;
                  }
               }

               var3.recycle();
               var2.recycle();
               throw var10;
            }

            var3.recycle();
            var2.recycle();
            return var12;
         }

         public void _/* $FF was: ԩ*/(Intent var1, String var2) throws RemoteException {
            Parcel var3;
            Parcel var10000 = var3 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var4;
            Parcel var10002 = var4 = var10001;

            label120: {
               Throwable var18;
               label124: {
                  ຨ.Ԩ.Ϳ var10003;
                  boolean var19;
                  Parcel var10004;
                  String var10005;
                  Parcel var10006;
                  Intent var10007;
                  try {
                     var10003 = this;
                     var10004 = var3;
                     var10005 = var2;
                     var10006 = var3;
                     var10007 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10008 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10006, var10007, var10008);
                     var10004.writeString(var10005);
                     var10003.ԭ.transact(9, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10002.readException();
                     break label120;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label111;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: ՠ*/() throws RemoteException {
            Parcel var1;
            Parcel var10000 = var1 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var2;
            Parcel var10002 = var2 = var10001;

            label68: {
               Throwable var9;
               label72: {
                  boolean var10;
                  try {
                     var1.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     this.ԭ.transact(10, var1, var2, 0);
                  } catch (Throwable var8) {
                     var9 = var8;
                     var10 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var7) {
                     var9 = var7;
                     var10 = false;
                     break label63;
                  }
               }

               var2.recycle();
               var1.recycle();
               throw var9;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ϳ*/(String var1, String var2) throws RemoteException {
            Parcel var3;
            Parcel var10000 = var3 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var4;
            Parcel var10002 = var4 = var10001;

            label68: {
               Throwable var11;
               label72: {
                  boolean var12;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var3.writeString(var1);
                     var3.writeString(var2);
                     this.ԭ.transact(11, var3, var4, 0);
                  } catch (Throwable var10) {
                     var11 = var10;
                     var12 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var9) {
                     var11 = var9;
                     var12 = false;
                     break label63;
                  }
               }

               var4.recycle();
               var3.recycle();
               throw var11;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ϳ*/(String var1, String var2, boolean var3) throws RemoteException {
            boolean var10000 = var3;
            Parcel var18;
            Parcel var10001 = var18 = Parcel.obtain();
            String var10002 = var2;
            Parcel var10003 = var18;
            String var10004 = var1;
            Parcel var10005 = var18;
            Parcel var16 = Parcel.obtain();

            Parcel var20;
            label132: {
               Throwable var19;
               label136: {
                  boolean var21;
                  try {
                     var10005.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var10003.writeString(var10004);
                     var10001.writeString(var10002);
                  } catch (Throwable var15) {
                     var19 = var15;
                     var21 = false;
                     break label136;
                  }

                  byte var17;
                  if (var10000) {
                     var17 = 1;
                  } else {
                     var17 = 0;
                  }

                  Parcel var22;
                  try {
                     var20 = var18;
                     var10001 = var16;
                     var22 = var16;
                     var18.writeInt(var17);
                     this.ԭ.transact(12, var18, var16, 0);
                  } catch (Throwable var14) {
                     var19 = var14;
                     var21 = false;
                     break label136;
                  }

                  label123:
                  try {
                     var22.readException();
                     break label132;
                  } catch (Throwable var13) {
                     var19 = var13;
                     var21 = false;
                     break label123;
                  }
               }

               var16.recycle();
               var18.recycle();
               throw var19;
            }

            var10001.recycle();
            var20.recycle();
         }

         public boolean _/* $FF was: Ԫ*/(String var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            int var14;
            label83: {
               Throwable var12;
               label87: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var4.writeString(var1);
                     var4.writeString(var2);
                     var4.writeInt(var3);
                     this.ԭ.transact(13, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label87;
                  }

                  label78:
                  try {
                     var10001.readException();
                     var14 = var10000.readInt();
                     break label83;
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label78;
                  }
               }

               var5.recycle();
               var4.recycle();
               throw var12;
            }

            boolean var15 = var14 != 0;
            var5.recycle();
            var4.recycle();
            return var15;
         }

         public Intent _/* $FF was: Ϳ*/(Intent var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            Intent var20;
            label120: {
               Throwable var18;
               label124: {
                  ຨ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  Intent var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(14, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = (Intent)ຨ.Ԫ.Ԩ(var10000, Intent.CREATOR);
                     break label120;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label111;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            var4.recycle();
            var3.recycle();
            return var20;
         }

         public int _/* $FF was: Ϳ*/(Intent var1, String var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            int var20;
            label120: {
               Throwable var18;
               label124: {
                  ຨ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  String var10004;
                  Parcel var10005;
                  Intent var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeString(var10004);
                     var10002.ԭ.transact(15, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = var10000.readInt();
                     break label120;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label111;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            var4.recycle();
            var3.recycle();
            return var20;
         }

         public void _/* $FF was: Ϳ*/(IntentFilter var1, IBinder var2, String var3, ຓ var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label120: {
               Throwable var20;
               label124: {
                  ຨ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  ຓ var10005;
                  boolean var21;
                  Parcel var10006;
                  String var10007;
                  Parcel var10008;
                  IBinder var10009;
                  Parcel var10010;
                  IntentFilter var10011;
                  try {
                     var10003 = this;
                     var10004 = var5;
                     var10005 = var4;
                     var10006 = var5;
                     var10007 = var3;
                     var10008 = var5;
                     var10009 = var2;
                     var10010 = var5;
                     var10011 = var1;
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var18) {
                     var20 = var18;
                     var21 = false;
                     break label124;
                  }

                  byte var10012 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10010, var10011, var10012);
                     var10008.writeStrongBinder(var10009);
                     var10006.writeString(var10007);
                     var10004.writeStrongInterface(var10005);
                     var10003.ԭ.transact(16, var5, var6, 0);
                  } catch (Throwable var17) {
                     var20 = var17;
                     var21 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10002.readException();
                     break label120;
                  } catch (Throwable var16) {
                     var20 = var16;
                     var21 = false;
                     break label111;
                  }
               }

               Throwable var19 = var20;
               var6.recycle();
               var5.recycle();
               throw var19;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: ԩ*/(IBinder var1) throws RemoteException {
            Parcel var2;
            Parcel var10000 = var2 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var3;
            Parcel var10002 = var3 = var10001;

            label68: {
               Throwable var10;
               label72: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var2.writeStrongBinder(var1);
                     this.ԭ.transact(17, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var8) {
                     var10 = var8;
                     var11 = false;
                     break label63;
                  }
               }

               var3.recycle();
               var2.recycle();
               throw var10;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ԫ*/(Intent var1) throws RemoteException {
            Parcel var2;
            Parcel var10000 = var2 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var3;
            Parcel var10002 = var3 = var10001;

            label120: {
               Throwable var17;
               label124: {
                  boolean var18;
                  ຨ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  Intent var10005;
                  try {
                     var10003 = this;
                     var10004 = var2;
                     var10005 = var1;
                     var2.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var15) {
                     var17 = var15;
                     var18 = false;
                     break label124;
                  }

                  byte var10006 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10004, var10005, var10006);
                     var10003.ԭ.transact(18, var2, var3, 0);
                  } catch (Throwable var14) {
                     var17 = var14;
                     var18 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10002.readException();
                     break label120;
                  } catch (Throwable var13) {
                     var17 = var13;
                     var18 = false;
                     break label111;
                  }
               }

               Throwable var16 = var17;
               var3.recycle();
               var2.recycle();
               throw var16;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public String _/* $FF was: Ԫ*/(int var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            String var12;
            label68: {
               Throwable var10;
               label72: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var2.writeInt(var1);
                     this.ԭ.transact(19, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var12 = var10000.readString();
                     break label68;
                  } catch (Throwable var8) {
                     var10 = var8;
                     var11 = false;
                     break label63;
                  }
               }

               var3.recycle();
               var2.recycle();
               throw var10;
            }

            var3.recycle();
            var2.recycle();
            return var12;
         }

         public void _/* $FF was: Ϳ*/(long var1) throws RemoteException {
            Parcel var3;
            Parcel var10000 = var3 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var4;
            Parcel var10002 = var4 = var10001;

            label68: {
               Throwable var11;
               label72: {
                  boolean var12;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var3.writeLong(var1);
                     this.ԭ.transact(20, var3, var4, 0);
                  } catch (Throwable var10) {
                     var11 = var10;
                     var12 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var9) {
                     var11 = var9;
                     var12 = false;
                     break label63;
                  }
               }

               var4.recycle();
               var3.recycle();
               throw var11;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ϳ*/(long var1, Notification var3, int var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label120: {
               Throwable var20;
               label124: {
                  ຨ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  int var10005;
                  boolean var21;
                  Parcel var10006;
                  Notification var10007;
                  try {
                     var10003 = this;
                     var10004 = var5;
                     var10005 = var4;
                     var10006 = var5;
                     var10007 = var3;
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var5.writeLong(var1);
                  } catch (Throwable var18) {
                     var20 = var18;
                     var21 = false;
                     break label124;
                  }

                  byte var10008 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10006, var10007, var10008);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(21, var5, var6, 0);
                  } catch (Throwable var17) {
                     var20 = var17;
                     var21 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10002.readException();
                     break label120;
                  } catch (Throwable var16) {
                     var20 = var16;
                     var21 = false;
                     break label111;
                  }
               }

               Throwable var19 = var20;
               var6.recycle();
               var5.recycle();
               throw var19;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ԫ*/() throws RemoteException {
            Parcel var1;
            Parcel var10000 = var1 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var2;
            Parcel var10002 = var2 = var10001;

            label68: {
               Throwable var9;
               label72: {
                  boolean var10;
                  try {
                     var1.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     this.ԭ.transact(22, var1, var2, 0);
                  } catch (Throwable var8) {
                     var9 = var8;
                     var10 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var7) {
                     var9 = var7;
                     var10 = false;
                     break label63;
                  }
               }

               var2.recycle();
               var1.recycle();
               throw var9;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ϳ*/(ൔ var1, ຓ var2) throws RemoteException {
            Parcel var3;
            Parcel var10000 = var3 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var4;
            Parcel var10002 = var4 = var10001;

            label120: {
               Throwable var18;
               label124: {
                  ຨ.Ԩ.Ϳ var10003;
                  boolean var19;
                  Parcel var10004;
                  ຓ var10005;
                  Parcel var10006;
                  ൔ var10007;
                  try {
                     var10003 = this;
                     var10004 = var3;
                     var10005 = var2;
                     var10006 = var3;
                     var10007 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10008 = 0;

                  try {
                     ຨ.Ԫ.Ԩ(var10006, var10007, var10008);
                     var10004.writeStrongInterface(var10005);
                     var10003.ԭ.transact(23, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10002.readException();
                     break label120;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label111;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public List<RunningAppProcessInfo> _/* $FF was: ԩ*/(int var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            ArrayList var12;
            label68: {
               Throwable var10;
               label72: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScaleActivityManager");
                     var2.writeInt(var1);
                     this.ԭ.transact(24, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var12 = var10000.createTypedArrayList(RunningAppProcessInfo.CREATOR);
                     break label68;
                  } catch (Throwable var8) {
                     var10 = var8;
                     var11 = false;
                     break label63;
                  }
               }

               var3.recycle();
               var2.recycle();
               throw var10;
            }

            var3.recycle();
            var2.recycle();
            return var12;
         }
      }
   }

   public static class Ϳ implements ຨ {
      public Intent _/* $FF was: Ԩ*/(Intent var1, String var2) throws RemoteException {
         return null;
      }

      public ຘ _/* $FF was: ԭ*/() throws RemoteException {
         return null;
      }

      public void _/* $FF was: ԩ*/(String var1, String var2) throws RemoteException {
      }

      public int _/* $FF was: Ϳ*/(ProviderInfo var1, String var2) throws RemoteException {
         return 0;
      }

      public ComponentName _/* $FF was: Ԩ*/(Intent var1, ServiceInfo var2, String var3) throws RemoteException {
         return null;
      }

      public int _/* $FF was: Ϳ*/(Intent var1, ServiceInfo var2, String var3) throws RemoteException {
         return 0;
      }

      public int _/* $FF was: Ϳ*/(Intent var1, ServiceInfo var2, IBinder var3, String var4) throws RemoteException {
         return 0;
      }

      public int _/* $FF was: Ϳ*/(IBinder var1) throws RemoteException {
         return 0;
      }

      public void _/* $FF was: ԩ*/(Intent var1, String var2) throws RemoteException {
      }

      public void _/* $FF was: ՠ*/() throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(String var1, String var2) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(String var1, String var2, boolean var3) throws RemoteException {
      }

      public boolean _/* $FF was: Ԫ*/(String var1, String var2, int var3) throws RemoteException {
         return false;
      }

      public Intent _/* $FF was: Ϳ*/(Intent var1, int var2) throws RemoteException {
         return null;
      }

      public int _/* $FF was: Ϳ*/(Intent var1, String var2) throws RemoteException {
         return 0;
      }

      public void _/* $FF was: Ϳ*/(IntentFilter var1, IBinder var2, String var3, ຓ var4) throws RemoteException {
      }

      public void _/* $FF was: ԩ*/(IBinder var1) throws RemoteException {
      }

      public void _/* $FF was: Ԫ*/(Intent var1) throws RemoteException {
      }

      public String _/* $FF was: Ԫ*/(int var1) throws RemoteException {
         return null;
      }

      public void _/* $FF was: Ϳ*/(long var1) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(long var1, Notification var3, int var4) throws RemoteException {
      }

      public void _/* $FF was: Ԫ*/() throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(ൔ var1, ຓ var2) throws RemoteException {
      }

      public List<RunningAppProcessInfo> _/* $FF was: ԩ*/(int var1) throws RemoteException {
         return null;
      }

      public IBinder asBinder() {
         return null;
      }
   }
}
