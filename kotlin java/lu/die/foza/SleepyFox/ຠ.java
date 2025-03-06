package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

public interface ຠ extends IInterface {
   String ԩ = "lu.die.fozalib.IScaleAccountObserver";

   String _/* $FF was: ԩ*/(Account var1, int var2) throws RemoteException;

   String _/* $FF was: Ϳ*/(Account var1, String var2, int var3) throws RemoteException;

   AuthenticatorDescription[] _/* $FF was: Ԭ*/(int var1) throws RemoteException;

   Account[] _/* $FF was: Ϳ*/(String var1, int var2, int var3) throws RemoteException;

   Account[] _/* $FF was: Ԩ*/(String var1, String var2, int var3) throws RemoteException;

   Account[] _/* $FF was: Ԫ*/(String var1, int var2) throws RemoteException;

   void _/* $FF was: Ԩ*/(IBinder var1, String var2, String[] var3, int var4) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, String var2, String[] var3, int var4) throws RemoteException;

   boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, int var4) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, Account var2, boolean var3, int var4) throws RemoteException;

   boolean _/* $FF was: Ϳ*/(Account var1, int var2) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, Account var2, int var3, int var4) throws RemoteException;

   void _/* $FF was: Ϳ*/(String var1, String var2, int var3) throws RemoteException;

   String _/* $FF was: ԩ*/(Account var1, String var2, int var3) throws RemoteException;

   void _/* $FF was: Ԩ*/(Account var1, String var2, String var3, int var4) throws RemoteException;

   void _/* $FF was: Ԩ*/(Account var1, String var2, int var3) throws RemoteException;

   void _/* $FF was: Ԩ*/(Account var1, int var2) throws RemoteException;

   void _/* $FF was: Ϳ*/(Account var1, String var2, String var3, int var4) throws RemoteException;

   void _/* $FF was: Ϳ*/(Account var1, String var2, int var3, boolean var4) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, Account var2, String var3, boolean var4, boolean var5, Bundle var6, int var7) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, String var2, String var3, String[] var4, boolean var5, Bundle var6, int var7) throws RemoteException;

   void _/* $FF was: Ԩ*/(IBinder var1, String var2, String var3, String[] var4, boolean var5, Bundle var6, int var7) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, Account var2, String var3, boolean var4, Bundle var5, int var6) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, String var2, boolean var3, int var4) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, Account var2, Bundle var3, boolean var4, int var5) throws RemoteException;

   boolean _/* $FF was: Ԫ*/(Account var1, int var2) throws RemoteException;

   void _/* $FF was: Ϳ*/(IBinder var1, String var2, String var3, int var4) throws RemoteException;

   Map _/* $FF was: ԫ*/(Account var1, int var2) throws RemoteException;

   boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, Map var4, int var5) throws RemoteException;

   boolean _/* $FF was: Ϳ*/(Account var1, String var2, int var3, int var4) throws RemoteException;

   int _/* $FF was: Ԫ*/(Account var1, String var2, int var3) throws RemoteException;

   Map _/* $FF was: ԩ*/(String var1, String var2, int var3) throws RemoteException;

   void _/* $FF was: Ϳ*/(String[] var1, String var2, int var3) throws RemoteException;

   void _/* $FF was: Ԩ*/(String[] var1, String var2, int var3) throws RemoteException;

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

   public abstract static class Ԩ extends Binder implements ຠ {
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
      public static final int ސ = 25;
      public static final int ޑ = 26;
      public static final int ޒ = 27;
      public static final int ޓ = 28;
      public static final int ޔ = 29;
      public static final int ޕ = 30;
      public static final int ޖ = 31;
      public static final int ޗ = 32;
      public static final int ޘ = 33;
      public static final int ޙ = 34;

      public _/* $FF was: Ԩ*/() {
         this.attachInterface(this, "lu.die.fozalib.IScaleAccountObserver");
      }

      public static ຠ _/* $FF was: Ԫ*/(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1;
            return (ຠ)((var1 = var0.queryLocalInterface("lu.die.fozalib.IScaleAccountObserver")) != null && var1 instanceof ຠ ? (ຠ)var1 : new ຠ.Ԩ.Ϳ(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         String var5 = "lu.die.fozalib.IScaleAccountObserver";
         if (var1 >= 1 && var1 <= 16777215) {
            var2.enforceInterface(var5);
         }

         if (var1 == 1598968902) {
            var3.writeString(var5);
            return true;
         } else {
            byte var28;
            label193: {
               boolean var6;
               Bundle var8;
               String var9;
               int var10;
               IBinder var11;
               Bundle var12;
               String var13;
               Account var14;
               String[] var10000;
               boolean var17;
               Account var18;
               boolean var20;
               String[] var21;
               String[] var23;
               String var24;
               Map var25;
               Account var26;
               IBinder var29;
               Account[] var30;
               switch(var1) {
               case 1:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var1 = var2.readInt();
                  var24 = this.ԩ(var26, var1);
                  var3.writeNoException();
                  var3.writeString(var24);
                  return true;
               case 2:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var10 = var2.readInt();
                  var24 = this.Ϳ(var26, var9, var10);
                  var3.writeNoException();
                  var3.writeString(var24);
                  return true;
               case 3:
                  AuthenticatorDescription[] var31 = this.Ԭ(var2.readInt());
                  var3.writeNoException();
                  var3.writeTypedArray(var31, 1);
                  return true;
               case 4:
                  var24 = var2.readString();
                  var1 = var2.readInt();
                  var10 = var2.readInt();
                  var30 = this.Ϳ(var24, var1, var10);
                  var3.writeNoException();
                  var3.writeTypedArray(var30, 1);
                  return true;
               case 5:
                  var24 = var9 = var2.readString();
                  var10 = var2.readInt();
                  var30 = this.Ԩ(var24, var9, var10);
                  var3.writeNoException();
                  var3.writeTypedArray(var30, 1);
                  return true;
               case 6:
                  var24 = var2.readString();
                  var1 = var2.readInt();
                  var30 = this.Ԫ(var24, var1);
                  var3.writeNoException();
                  var3.writeTypedArray(var30, 1);
                  return true;
               case 7:
                  var29 = var2.readStrongBinder();
                  var9 = var2.readString();
                  var23 = var2.createStringArray();
                  var10 = var2.readInt();
                  this.Ԩ(var29, var9, var23, var10);
                  break;
               case 8:
                  var29 = var2.readStrongBinder();
                  var9 = var2.readString();
                  var23 = var2.createStringArray();
                  var10 = var2.readInt();
                  this.Ϳ(var29, var9, var23, var10);
                  break;
               case 9:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var12 = (Bundle)ຠ.Ԫ.Ԩ(var2, Bundle.CREATOR);
                  var10 = var2.readInt();
                  var28 = this.Ϳ(var26, var9, var12, var10);
                  var3.writeNoException();
                  break label193;
               case 10:
                  var11 = var2.readStrongBinder();
                  var14 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  if (var2.readInt() != 0) {
                     var17 = true;
                  } else {
                     var17 = false;
                  }

                  var10 = var2.readInt();
                  this.Ϳ(var11, var14, var17, var10);
                  break;
               case 11:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var1 = var2.readInt();
                  var28 = this.Ϳ(var26, var1);
                  var3.writeNoException();
                  break label193;
               case 12:
                  var29 = var2.readStrongBinder();
                  var18 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var4 = var2.readInt();
                  var10 = var2.readInt();
                  this.Ϳ(var29, var18, var4, var10);
                  break;
               case 13:
                  var24 = var9 = var2.readString();
                  var10 = var2.readInt();
                  this.Ϳ(var24, var9, var10);
                  break;
               case 14:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var10 = var2.readInt();
                  var24 = this.ԩ(var26, var9, var10);
                  var3.writeNoException();
                  var3.writeString(var24);
                  return true;
               case 15:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var13 = var2.readString();
                  var10 = var2.readInt();
                  this.Ԩ(var26, var9, var13, var10);
                  break;
               case 16:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var10 = var2.readInt();
                  this.Ԩ(var26, var9, var10);
                  break;
               case 17:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var1 = var2.readInt();
                  this.Ԩ(var26, var1);
                  break;
               case 18:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var13 = var2.readString();
                  var10 = var2.readInt();
                  this.Ϳ(var26, var9, var13, var10);
                  break;
               case 19:
                  var18 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var13 = var2.readString();
                  int var22 = var2.readInt();
                  boolean var19;
                  if (var2.readInt() != 0) {
                     var19 = true;
                  } else {
                     var19 = false;
                  }

                  this.Ϳ(var18, var13, var22, var19);
                  break;
               case 20:
                  var11 = var2.readStrongBinder();
                  var14 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var5 = var2.readString();
                  if (var2.readInt() != 0) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }

                  if (var2.readInt() != 0) {
                     var20 = true;
                  } else {
                     var20 = false;
                  }

                  var8 = (Bundle)ຠ.Ԫ.Ԩ(var2, Bundle.CREATOR);
                  var10 = var2.readInt();
                  this.Ϳ(var11, var14, var5, var6, var20, var8, var10);
                  break;
               case 21:
                  var11 = var2.readStrongBinder();
                  var13 = var2.readString();
                  var5 = var2.readString();
                  var21 = var2.createStringArray();
                  if (var2.readInt() != 0) {
                     var20 = true;
                  } else {
                     var20 = false;
                  }

                  var8 = (Bundle)ຠ.Ԫ.Ԩ(var2, Bundle.CREATOR);
                  var10 = var2.readInt();
                  this.Ϳ(var11, var13, var5, var21, var20, var8, var10);
                  break;
               case 22:
                  var11 = var2.readStrongBinder();
                  var13 = var2.readString();
                  var5 = var2.readString();
                  var21 = var2.createStringArray();
                  if (var2.readInt() != 0) {
                     var20 = true;
                  } else {
                     var20 = false;
                  }

                  var8 = (Bundle)ຠ.Ԫ.Ԩ(var2, Bundle.CREATOR);
                  var10 = var2.readInt();
                  this.Ԩ(var11, var13, var5, var21, var20, var8, var10);
                  break;
               case 23:
                  var11 = var2.readStrongBinder();
                  var14 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var5 = var2.readString();
                  if (var2.readInt() != 0) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }

                  Bundle var7 = (Bundle)ຠ.Ԫ.Ԩ(var2, Bundle.CREATOR);
                  var10 = var2.readInt();
                  this.Ϳ(var11, var14, var5, var6, var7, var10);
                  break;
               case 24:
                  var11 = var2.readStrongBinder();
                  var13 = var2.readString();
                  if (var2.readInt() != 0) {
                     var17 = true;
                  } else {
                     var17 = false;
                  }

                  var10 = var2.readInt();
                  this.Ϳ(var11, var13, var17, var10);
                  break;
               case 25:
                  var11 = var2.readStrongBinder();
                  var14 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  Bundle var16 = (Bundle)ຠ.Ԫ.Ԩ(var2, Bundle.CREATOR);
                  if (var2.readInt() != 0) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }

                  var10 = var2.readInt();
                  this.Ϳ(var11, var14, var16, var6, var10);
                  break;
               case 26:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var1 = var2.readInt();
                  var28 = this.Ԫ(var26, var1);
                  var3.writeNoException();
                  break label193;
               case 27:
                  var29 = var2.readStrongBinder();
                  var9 = var2.readString();
                  var13 = var2.readString();
                  var10 = var2.readInt();
                  this.Ϳ(var29, var9, var13, var10);
                  break;
               case 28:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var1 = var2.readInt();
                  var25 = this.ԫ(var26, var1);
                  var3.writeNoException();
                  var3.writeMap(var25);
                  return true;
               case 29:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var12 = (Bundle)ຠ.Ԫ.Ԩ(var2, Bundle.CREATOR);
                  HashMap var15 = var2.readHashMap(this.getClass().getClassLoader());
                  var10 = var2.readInt();
                  var28 = this.Ϳ(var26, var9, var12, var15, var10);
                  var3.writeNoException();
                  break label193;
               case 30:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var4 = var2.readInt();
                  var10 = var2.readInt();
                  var28 = this.Ϳ(var26, var9, var4, var10);
                  var3.writeNoException();
                  break label193;
               case 31:
                  var26 = (Account)ຠ.Ԫ.Ԩ(var2, Account.CREATOR);
                  var9 = var2.readString();
                  var10 = var2.readInt();
                  int var27 = this.Ԫ(var26, var9, var10);
                  var3.writeNoException();
                  var3.writeInt(var27);
                  return true;
               case 32:
                  var24 = var9 = var2.readString();
                  var10 = var2.readInt();
                  var25 = this.ԩ(var24, var9, var10);
                  var3.writeNoException();
                  var3.writeMap(var25);
                  return true;
               case 33:
                  var10000 = var2.createStringArray();
                  var9 = var2.readString();
                  var10 = var2.readInt();
                  this.Ϳ(var10000, var9, var10);
                  break;
               case 34:
                  var10000 = var2.createStringArray();
                  var9 = var2.readString();
                  var10 = var2.readInt();
                  this.Ԩ(var10000, var9, var10);
                  break;
               default:
                  return super.onTransact(var1, var2, var3, var4);
               }

               var3.writeNoException();
               return true;
            }

            var3.writeInt(var28);
            return true;
         }
      }

      public static class Ϳ implements ຠ {
         public IBinder ԭ;

         public _/* $FF was: Ϳ*/(IBinder var1) {
            this.ԭ = var1;
         }

         public IBinder asBinder() {
            return this.ԭ;
         }

         public String _/* $FF was: ֈ*/() {
            return "lu.die.fozalib.IScaleAccountObserver";
         }

         public String _/* $FF was: ԩ*/(Account var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            String var20;
            label120: {
               Throwable var18;
               label124: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  Account var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(1, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = var10000.readString();
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

         public String _/* $FF was: Ϳ*/(Account var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            String var21;
            label120: {
               Throwable var19;
               label124: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  boolean var20;
                  Parcel var10005;
                  String var10006;
                  Parcel var10007;
                  Account var10008;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10009 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10007, var10008, var10009);
                     var10005.writeString(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(2, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var21 = var10000.readString();
                     break label120;
                  } catch (Throwable var15) {
                     var19 = var15;
                     var20 = false;
                     break label111;
                  }
               }

               Throwable var18 = var19;
               var5.recycle();
               var4.recycle();
               throw var18;
            }

            var5.recycle();
            var4.recycle();
            return var21;
         }

         public AuthenticatorDescription[] _/* $FF was: Ԭ*/(int var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            AuthenticatorDescription[] var12;
            label68: {
               Throwable var10;
               label72: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var2.writeInt(var1);
                     this.ԭ.transact(3, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var12 = (AuthenticatorDescription[])var10000.createTypedArray(AuthenticatorDescription.CREATOR);
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

         public Account[] _/* $FF was: Ϳ*/(String var1, int var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            Account[] var14;
            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var4.writeString(var1);
                     var4.writeInt(var2);
                     var4.writeInt(var3);
                     this.ԭ.transact(4, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var14 = (Account[])var10000.createTypedArray(Account.CREATOR);
                     break label68;
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label63;
                  }
               }

               var5.recycle();
               var4.recycle();
               throw var12;
            }

            var5.recycle();
            var4.recycle();
            return var14;
         }

         public Account[] _/* $FF was: Ԩ*/(String var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            Account[] var14;
            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var4.writeString(var1);
                     var4.writeString(var2);
                     var4.writeInt(var3);
                     this.ԭ.transact(5, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var14 = (Account[])var10000.createTypedArray(Account.CREATOR);
                     break label68;
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label63;
                  }
               }

               var5.recycle();
               var4.recycle();
               throw var12;
            }

            var5.recycle();
            var4.recycle();
            return var14;
         }

         public Account[] _/* $FF was: Ԫ*/(String var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            Account[] var13;
            label68: {
               Throwable var11;
               label72: {
                  boolean var12;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var3.writeString(var1);
                     var3.writeInt(var2);
                     this.ԭ.transact(6, var3, var4, 0);
                  } catch (Throwable var10) {
                     var11 = var10;
                     var12 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var13 = (Account[])var10000.createTypedArray(Account.CREATOR);
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

            var4.recycle();
            var3.recycle();
            return var13;
         }

         public void _/* $FF was: Ԩ*/(IBinder var1, String var2, String[] var3, int var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label68: {
               Throwable var13;
               label72: {
                  boolean var14;
                  try {
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var5.writeStrongBinder(var1);
                     var5.writeString(var2);
                     var5.writeStringArray(var3);
                     var5.writeInt(var4);
                     this.ԭ.transact(7, var5, var6, 0);
                  } catch (Throwable var12) {
                     var13 = var12;
                     var14 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var11) {
                     var13 = var11;
                     var14 = false;
                     break label63;
                  }
               }

               var6.recycle();
               var5.recycle();
               throw var13;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, String var2, String[] var3, int var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label68: {
               Throwable var13;
               label72: {
                  boolean var14;
                  try {
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var5.writeStrongBinder(var1);
                     var5.writeString(var2);
                     var5.writeStringArray(var3);
                     var5.writeInt(var4);
                     this.ԭ.transact(8, var5, var6, 0);
                  } catch (Throwable var12) {
                     var13 = var12;
                     var14 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var11) {
                     var13 = var11;
                     var14 = false;
                     break label63;
                  }
               }

               var6.recycle();
               var5.recycle();
               throw var13;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, int var4) throws RemoteException {
            Parcel var5 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var6;
            Parcel var10001 = var6 = var10000;

            int var31;
            label211: {
               Throwable var29;
               label215: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  Parcel var10005;
                  Bundle var10006;
                  Parcel var10007;
                  String var10008;
                  Parcel var10009;
                  Account var10010;
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
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var26) {
                     var29 = var26;
                     var30 = false;
                     break label215;
                  }

                  byte var10011 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10009, var10010, var10011);
                     var10007.writeString(var10008);
                  } catch (Throwable var25) {
                     var29 = var25;
                     var30 = false;
                     break label215;
                  }

                  byte var28 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10005, var10006, var28);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(9, var5, var6, 0);
                  } catch (Throwable var24) {
                     var29 = var24;
                     var30 = false;
                     break label215;
                  }

                  label198:
                  try {
                     var10001.readException();
                     var31 = var10000.readInt();
                     break label211;
                  } catch (Throwable var23) {
                     var29 = var23;
                     var30 = false;
                     break label198;
                  }
               }

               Throwable var27 = var29;
               var6.recycle();
               var5.recycle();
               throw var27;
            }

            boolean var32 = var31 != 0;
            var6.recycle();
            var5.recycle();
            return var32;
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, boolean var3, int var4) throws RemoteException {
            boolean var10000 = var3;
            Parcel var28;
            Parcel var10001 = var28 = Parcel.obtain();
            Account var10002 = var2;
            Parcel var10003 = var28;
            IBinder var10004 = var1;
            Parcel var10005 = var28;
            Parcel var26 = Parcel.obtain();

            Parcel var31;
            label201: {
               Throwable var29;
               label205: {
                  boolean var30;
                  try {
                     var10005.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var10003.writeStrongBinder(var10004);
                  } catch (Throwable var24) {
                     var29 = var24;
                     var30 = false;
                     break label205;
                  }

                  byte var33 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10001, var10002, var33);
                  } catch (Throwable var23) {
                     var29 = var23;
                     var30 = false;
                     break label205;
                  }

                  byte var27;
                  if (var10000) {
                     var27 = 1;
                  } else {
                     var27 = 0;
                  }

                  Parcel var32;
                  try {
                     var31 = var28;
                     var10001 = var26;
                     var32 = var26;
                     var28.writeInt(var27);
                     var28.writeInt(var4);
                     this.ԭ.transact(10, var28, var26, 0);
                  } catch (Throwable var22) {
                     var29 = var22;
                     var30 = false;
                     break label205;
                  }

                  label188:
                  try {
                     var32.readException();
                     break label201;
                  } catch (Throwable var21) {
                     var29 = var21;
                     var30 = false;
                     break label188;
                  }
               }

               Throwable var25 = var29;
               var26.recycle();
               var28.recycle();
               throw var25;
            }

            var10001.recycle();
            var31.recycle();
         }

         public boolean _/* $FF was: Ϳ*/(Account var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            int var20;
            label140: {
               Throwable var18;
               label144: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  Account var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label144;
                  }

                  byte var10007 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(11, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label144;
                  }

                  label131:
                  try {
                     var10001.readException();
                     var20 = var10000.readInt();
                     break label140;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label131;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            boolean var21 = var20 != 0;
            var4.recycle();
            var3.recycle();
            return var21;
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, int var3, int var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label120: {
               Throwable var20;
               label124: {
                  ຠ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  int var10005;
                  boolean var21;
                  Parcel var10006;
                  int var10007;
                  Parcel var10008;
                  Account var10009;
                  try {
                     var10003 = this;
                     var10004 = var5;
                     var10005 = var4;
                     var10006 = var5;
                     var10007 = var3;
                     var10008 = var5;
                     var10009 = var2;
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var5.writeStrongBinder(var1);
                  } catch (Throwable var18) {
                     var20 = var18;
                     var21 = false;
                     break label124;
                  }

                  byte var10010 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10008, var10009, var10010);
                     var10006.writeInt(var10007);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(12, var5, var6, 0);
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

         public void _/* $FF was: Ϳ*/(String var1, String var2, int var3) throws RemoteException {
            Parcel var4;
            Parcel var10000 = var4 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var5;
            Parcel var10002 = var5 = var10001;

            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var4.writeString(var1);
                     var4.writeString(var2);
                     var4.writeInt(var3);
                     this.ԭ.transact(13, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label63;
                  }
               }

               var5.recycle();
               var4.recycle();
               throw var12;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public String _/* $FF was: ԩ*/(Account var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            String var21;
            label120: {
               Throwable var19;
               label124: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  boolean var20;
                  Parcel var10005;
                  String var10006;
                  Parcel var10007;
                  Account var10008;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10009 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10007, var10008, var10009);
                     var10005.writeString(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(14, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var21 = var10000.readString();
                     break label120;
                  } catch (Throwable var15) {
                     var19 = var15;
                     var20 = false;
                     break label111;
                  }
               }

               Throwable var18 = var19;
               var5.recycle();
               var4.recycle();
               throw var18;
            }

            var5.recycle();
            var4.recycle();
            return var21;
         }

         public void _/* $FF was: Ԩ*/(Account var1, String var2, String var3, int var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label120: {
               Throwable var20;
               label124: {
                  ຠ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  int var10005;
                  boolean var21;
                  Parcel var10006;
                  String var10007;
                  Parcel var10008;
                  String var10009;
                  Parcel var10010;
                  Account var10011;
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
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var18) {
                     var20 = var18;
                     var21 = false;
                     break label124;
                  }

                  byte var10012 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10010, var10011, var10012);
                     var10008.writeString(var10009);
                     var10006.writeString(var10007);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(15, var5, var6, 0);
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

         public void _/* $FF was: Ԩ*/(Account var1, String var2, int var3) throws RemoteException {
            Parcel var4;
            Parcel var10000 = var4 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var5;
            Parcel var10002 = var5 = var10001;

            label120: {
               Throwable var19;
               label124: {
                  ຠ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  boolean var20;
                  int var10005;
                  Parcel var10006;
                  String var10007;
                  Parcel var10008;
                  Account var10009;
                  try {
                     var10003 = this;
                     var10004 = var4;
                     var10005 = var3;
                     var10006 = var4;
                     var10007 = var2;
                     var10008 = var4;
                     var10009 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10010 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10008, var10009, var10010);
                     var10006.writeString(var10007);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(16, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10002.readException();
                     break label120;
                  } catch (Throwable var15) {
                     var19 = var15;
                     var20 = false;
                     break label111;
                  }
               }

               Throwable var18 = var19;
               var5.recycle();
               var4.recycle();
               throw var18;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ԩ*/(Account var1, int var2) throws RemoteException {
            Parcel var3;
            Parcel var10000 = var3 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var4;
            Parcel var10002 = var4 = var10001;

            label120: {
               Throwable var18;
               label124: {
                  ຠ.Ԩ.Ϳ var10003;
                  boolean var19;
                  Parcel var10004;
                  int var10005;
                  Parcel var10006;
                  Account var10007;
                  try {
                     var10003 = this;
                     var10004 = var3;
                     var10005 = var2;
                     var10006 = var3;
                     var10007 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10008 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10006, var10007, var10008);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(17, var3, var4, 0);
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

         public void _/* $FF was: Ϳ*/(Account var1, String var2, String var3, int var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label120: {
               Throwable var20;
               label124: {
                  ຠ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  int var10005;
                  boolean var21;
                  Parcel var10006;
                  String var10007;
                  Parcel var10008;
                  String var10009;
                  Parcel var10010;
                  Account var10011;
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
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var18) {
                     var20 = var18;
                     var21 = false;
                     break label124;
                  }

                  byte var10012 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10010, var10011, var10012);
                     var10008.writeString(var10009);
                     var10006.writeString(var10007);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(18, var5, var6, 0);
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

         public void _/* $FF was: Ϳ*/(Account var1, String var2, int var3, boolean var4) throws RemoteException {
            boolean var10000 = var4;
            Parcel var29;
            Parcel var10001 = var29 = Parcel.obtain();
            int var10002 = var3;
            Parcel var10003 = var29;
            String var10004 = var2;
            Parcel var10005 = var29;
            Account var10006 = var1;
            Parcel var10007 = var29;
            Parcel var26 = Parcel.obtain();

            Parcel var32;
            label201: {
               Throwable var30;
               label205: {
                  boolean var31;
                  try {
                     var10007.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var24) {
                     var30 = var24;
                     var31 = false;
                     break label205;
                  }

                  byte var27 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10005, var10006, var27);
                     var10003.writeString(var10004);
                     var10001.writeInt(var10002);
                  } catch (Throwable var23) {
                     var30 = var23;
                     var31 = false;
                     break label205;
                  }

                  byte var28;
                  if (var10000) {
                     var28 = 1;
                  } else {
                     var28 = 0;
                  }

                  Parcel var33;
                  try {
                     var32 = var29;
                     var10001 = var26;
                     var33 = var26;
                     var29.writeInt(var28);
                     this.ԭ.transact(19, var29, var26, 0);
                  } catch (Throwable var22) {
                     var30 = var22;
                     var31 = false;
                     break label205;
                  }

                  label188:
                  try {
                     var33.readException();
                     break label201;
                  } catch (Throwable var21) {
                     var30 = var21;
                     var31 = false;
                     break label188;
                  }
               }

               Throwable var25 = var30;
               var26.recycle();
               var29.recycle();
               throw var25;
            }

            var10001.recycle();
            var32.recycle();
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, String var3, boolean var4, boolean var5, Bundle var6, int var7) throws RemoteException {
            boolean var10000 = var4;
            Parcel var53;
            Parcel var10001 = var53 = Parcel.obtain();
            String var10002 = var3;
            Parcel var10003 = var53;
            Account var10004 = var2;
            Parcel var10005 = var53;
            IBinder var10006 = var1;
            Parcel var10007 = var53;
            Parcel var51 = Parcel.obtain();

            Parcel var56;
            label402: {
               Throwable var54;
               label406: {
                  boolean var55;
                  try {
                     var10007.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var10005.writeStrongBinder(var10006);
                  } catch (Throwable var49) {
                     var54 = var49;
                     var55 = false;
                     break label406;
                  }

                  byte var60 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10003, var10004, var60);
                     var10001.writeString(var10002);
                  } catch (Throwable var48) {
                     var54 = var48;
                     var55 = false;
                     break label406;
                  }

                  byte var52;
                  if (var10000) {
                     var52 = 1;
                  } else {
                     var52 = 0;
                  }

                  try {
                     var10000 = var5;
                     var53.writeInt(var52);
                  } catch (Throwable var47) {
                     var54 = var47;
                     var55 = false;
                     break label406;
                  }

                  if (var10000) {
                     var52 = 1;
                  } else {
                     var52 = 0;
                  }

                  Parcel var57;
                  ຠ.Ԩ.Ϳ var58;
                  Parcel var59;
                  int var61;
                  Parcel var62;
                  Bundle var63;
                  try {
                     var56 = var53;
                     var10001 = var51;
                     var57 = var51;
                     var58 = this;
                     var59 = var53;
                     var61 = var7;
                     var62 = var53;
                     var63 = var6;
                     var53.writeInt(var52);
                  } catch (Throwable var46) {
                     var54 = var46;
                     var55 = false;
                     break label406;
                  }

                  byte var10008 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var62, var63, var10008);
                     var59.writeInt(var61);
                     var58.ԭ.transact(20, var53, var51, 0);
                  } catch (Throwable var45) {
                     var54 = var45;
                     var55 = false;
                     break label406;
                  }

                  label381:
                  try {
                     var57.readException();
                     break label402;
                  } catch (Throwable var44) {
                     var54 = var44;
                     var55 = false;
                     break label381;
                  }
               }

               Throwable var50 = var54;
               var51.recycle();
               var53.recycle();
               throw var50;
            }

            var10001.recycle();
            var56.recycle();
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, String var2, String var3, String[] var4, boolean var5, Bundle var6, int var7) throws RemoteException {
            boolean var10000 = var5;
            Parcel var31;
            Parcel var10001 = var31 = Parcel.obtain();
            String[] var10002 = var4;
            Parcel var10003 = var31;
            String var10004 = var3;
            Parcel var10005 = var31;
            String var10006 = var2;
            Parcel var10007 = var31;
            IBinder var10008 = var1;
            Parcel var10009 = var31;
            Parcel var29 = Parcel.obtain();

            Parcel var33;
            label201: {
               Throwable var32;
               label205: {
                  boolean var34;
                  try {
                     var10009.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var10007.writeStrongBinder(var10008);
                     var10005.writeString(var10006);
                     var10003.writeString(var10004);
                     var10001.writeStringArray(var10002);
                  } catch (Throwable var27) {
                     var32 = var27;
                     var34 = false;
                     break label205;
                  }

                  byte var30;
                  if (var10000) {
                     var30 = 1;
                  } else {
                     var30 = 0;
                  }

                  Parcel var35;
                  ຠ.Ԩ.Ϳ var36;
                  Parcel var37;
                  int var38;
                  Parcel var39;
                  Bundle var40;
                  try {
                     var33 = var31;
                     var10001 = var29;
                     var35 = var29;
                     var36 = this;
                     var37 = var31;
                     var38 = var7;
                     var39 = var31;
                     var40 = var6;
                     var31.writeInt(var30);
                  } catch (Throwable var26) {
                     var32 = var26;
                     var34 = false;
                     break label205;
                  }

                  byte var41 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var39, var40, var41);
                     var37.writeInt(var38);
                     var36.ԭ.transact(21, var31, var29, 0);
                  } catch (Throwable var25) {
                     var32 = var25;
                     var34 = false;
                     break label205;
                  }

                  label188:
                  try {
                     var35.readException();
                     break label201;
                  } catch (Throwable var24) {
                     var32 = var24;
                     var34 = false;
                     break label188;
                  }
               }

               Throwable var28 = var32;
               var29.recycle();
               var31.recycle();
               throw var28;
            }

            var10001.recycle();
            var33.recycle();
         }

         public void _/* $FF was: Ԩ*/(IBinder var1, String var2, String var3, String[] var4, boolean var5, Bundle var6, int var7) throws RemoteException {
            boolean var10000 = var5;
            Parcel var31;
            Parcel var10001 = var31 = Parcel.obtain();
            String[] var10002 = var4;
            Parcel var10003 = var31;
            String var10004 = var3;
            Parcel var10005 = var31;
            String var10006 = var2;
            Parcel var10007 = var31;
            IBinder var10008 = var1;
            Parcel var10009 = var31;
            Parcel var29 = Parcel.obtain();

            Parcel var33;
            label201: {
               Throwable var32;
               label205: {
                  boolean var34;
                  try {
                     var10009.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var10007.writeStrongBinder(var10008);
                     var10005.writeString(var10006);
                     var10003.writeString(var10004);
                     var10001.writeStringArray(var10002);
                  } catch (Throwable var27) {
                     var32 = var27;
                     var34 = false;
                     break label205;
                  }

                  byte var30;
                  if (var10000) {
                     var30 = 1;
                  } else {
                     var30 = 0;
                  }

                  Parcel var35;
                  ຠ.Ԩ.Ϳ var36;
                  Parcel var37;
                  int var38;
                  Parcel var39;
                  Bundle var40;
                  try {
                     var33 = var31;
                     var10001 = var29;
                     var35 = var29;
                     var36 = this;
                     var37 = var31;
                     var38 = var7;
                     var39 = var31;
                     var40 = var6;
                     var31.writeInt(var30);
                  } catch (Throwable var26) {
                     var32 = var26;
                     var34 = false;
                     break label205;
                  }

                  byte var41 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var39, var40, var41);
                     var37.writeInt(var38);
                     var36.ԭ.transact(22, var31, var29, 0);
                  } catch (Throwable var25) {
                     var32 = var25;
                     var34 = false;
                     break label205;
                  }

                  label188:
                  try {
                     var35.readException();
                     break label201;
                  } catch (Throwable var24) {
                     var32 = var24;
                     var34 = false;
                     break label188;
                  }
               }

               Throwable var28 = var32;
               var29.recycle();
               var31.recycle();
               throw var28;
            }

            var10001.recycle();
            var33.recycle();
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, String var3, boolean var4, Bundle var5, int var6) throws RemoteException {
            boolean var10000 = var4;
            Parcel var40;
            Parcel var10001 = var40 = Parcel.obtain();
            String var10002 = var3;
            Parcel var10003 = var40;
            Account var10004 = var2;
            Parcel var10005 = var40;
            IBinder var10006 = var1;
            Parcel var10007 = var40;
            Parcel var38 = Parcel.obtain();

            Parcel var43;
            label284: {
               Throwable var41;
               label288: {
                  boolean var42;
                  try {
                     var10007.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var10005.writeStrongBinder(var10006);
                  } catch (Throwable var36) {
                     var41 = var36;
                     var42 = false;
                     break label288;
                  }

                  byte var47 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10003, var10004, var47);
                     var10001.writeString(var10002);
                  } catch (Throwable var35) {
                     var41 = var35;
                     var42 = false;
                     break label288;
                  }

                  byte var39;
                  if (var10000) {
                     var39 = 1;
                  } else {
                     var39 = 0;
                  }

                  Parcel var44;
                  ຠ.Ԩ.Ϳ var45;
                  Parcel var46;
                  int var48;
                  Parcel var49;
                  Bundle var50;
                  try {
                     var43 = var40;
                     var10001 = var38;
                     var44 = var38;
                     var45 = this;
                     var46 = var40;
                     var48 = var6;
                     var49 = var40;
                     var50 = var5;
                     var40.writeInt(var39);
                  } catch (Throwable var34) {
                     var41 = var34;
                     var42 = false;
                     break label288;
                  }

                  byte var10008 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var49, var50, var10008);
                     var46.writeInt(var48);
                     var45.ԭ.transact(23, var40, var38, 0);
                  } catch (Throwable var33) {
                     var41 = var33;
                     var42 = false;
                     break label288;
                  }

                  label267:
                  try {
                     var44.readException();
                     break label284;
                  } catch (Throwable var32) {
                     var41 = var32;
                     var42 = false;
                     break label267;
                  }
               }

               Throwable var37 = var41;
               var38.recycle();
               var40.recycle();
               throw var37;
            }

            var10001.recycle();
            var43.recycle();
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, String var2, boolean var3, int var4) throws RemoteException {
            boolean var10000 = var3;
            Parcel var19;
            Parcel var10001 = var19 = Parcel.obtain();
            String var10002 = var2;
            Parcel var10003 = var19;
            IBinder var10004 = var1;
            Parcel var10005 = var19;
            Parcel var17 = Parcel.obtain();

            Parcel var21;
            label132: {
               Throwable var20;
               label136: {
                  boolean var22;
                  try {
                     var10005.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var10003.writeStrongBinder(var10004);
                     var10001.writeString(var10002);
                  } catch (Throwable var16) {
                     var20 = var16;
                     var22 = false;
                     break label136;
                  }

                  byte var18;
                  if (var10000) {
                     var18 = 1;
                  } else {
                     var18 = 0;
                  }

                  Parcel var23;
                  try {
                     var21 = var19;
                     var10001 = var17;
                     var23 = var17;
                     var19.writeInt(var18);
                     var19.writeInt(var4);
                     this.ԭ.transact(24, var19, var17, 0);
                  } catch (Throwable var15) {
                     var20 = var15;
                     var22 = false;
                     break label136;
                  }

                  label123:
                  try {
                     var23.readException();
                     break label132;
                  } catch (Throwable var14) {
                     var20 = var14;
                     var22 = false;
                     break label123;
                  }
               }

               var17.recycle();
               var19.recycle();
               throw var20;
            }

            var10001.recycle();
            var21.recycle();
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, Bundle var3, boolean var4, int var5) throws RemoteException {
            boolean var10000 = var4;
            Parcel var40;
            Parcel var10001 = var40 = Parcel.obtain();
            Bundle var10002 = var3;
            Parcel var10003 = var40;
            Account var10004 = var2;
            Parcel var10005 = var40;
            IBinder var10006 = var1;
            Parcel var10007 = var40;
            Parcel var38 = Parcel.obtain();

            Parcel var43;
            label284: {
               Throwable var41;
               label288: {
                  boolean var42;
                  try {
                     var10007.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var10005.writeStrongBinder(var10006);
                  } catch (Throwable var35) {
                     var41 = var35;
                     var42 = false;
                     break label288;
                  }

                  byte var36 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10003, var10004, var36);
                  } catch (Throwable var34) {
                     var41 = var34;
                     var42 = false;
                     break label288;
                  }

                  byte var45 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10001, var10002, var45);
                  } catch (Throwable var33) {
                     var41 = var33;
                     var42 = false;
                     break label288;
                  }

                  byte var39;
                  if (var10000) {
                     var39 = 1;
                  } else {
                     var39 = 0;
                  }

                  Parcel var44;
                  try {
                     var43 = var40;
                     var10001 = var38;
                     var44 = var38;
                     var40.writeInt(var39);
                     var40.writeInt(var5);
                     this.ԭ.transact(25, var40, var38, 0);
                  } catch (Throwable var32) {
                     var41 = var32;
                     var42 = false;
                     break label288;
                  }

                  label267:
                  try {
                     var44.readException();
                     break label284;
                  } catch (Throwable var31) {
                     var41 = var31;
                     var42 = false;
                     break label267;
                  }
               }

               Throwable var37 = var41;
               var38.recycle();
               var40.recycle();
               throw var37;
            }

            var10001.recycle();
            var43.recycle();
         }

         public boolean _/* $FF was: Ԫ*/(Account var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            int var20;
            label140: {
               Throwable var18;
               label144: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  Account var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label144;
                  }

                  byte var10007 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(26, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label144;
                  }

                  label131:
                  try {
                     var10001.readException();
                     var20 = var10000.readInt();
                     break label140;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var19 = false;
                     break label131;
                  }
               }

               Throwable var17 = var18;
               var4.recycle();
               var3.recycle();
               throw var17;
            }

            boolean var21 = var20 != 0;
            var4.recycle();
            var3.recycle();
            return var21;
         }

         public void _/* $FF was: Ϳ*/(IBinder var1, String var2, String var3, int var4) throws RemoteException {
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var6;
            Parcel var10002 = var6 = var10001;

            label68: {
               Throwable var13;
               label72: {
                  boolean var14;
                  try {
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var5.writeStrongBinder(var1);
                     var5.writeString(var2);
                     var5.writeString(var3);
                     var5.writeInt(var4);
                     this.ԭ.transact(27, var5, var6, 0);
                  } catch (Throwable var12) {
                     var13 = var12;
                     var14 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var11) {
                     var13 = var11;
                     var14 = false;
                     break label63;
                  }
               }

               var6.recycle();
               var5.recycle();
               throw var13;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public Map _/* $FF was: ԫ*/(Account var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var4;
            Parcel var10000 = var4 = Parcel.obtain();

            HashMap var20;
            label120: {
               Throwable var18;
               label124: {
                  boolean var10001;
                  Parcel var10002;
                  ຠ.Ԩ.Ϳ var19;
                  ຠ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  int var10005;
                  Parcel var10006;
                  Account var10007;
                  try {
                     var19 = this;
                     var10002 = var4;
                     var10003 = this;
                     var10004 = var3;
                     var10005 = var2;
                     var10006 = var3;
                     var10007 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var10001 = false;
                     break label124;
                  }

                  byte var10008 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10006, var10007, var10008);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(28, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var10001 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10002.readException();
                     var20 = var10000.readHashMap(var19.getClass().getClassLoader());
                     break label120;
                  } catch (Throwable var14) {
                     var18 = var14;
                     var10001 = false;
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

         public boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, Map var4, int var5) throws RemoteException {
            Parcel var6 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var7;
            Parcel var10001 = var7 = var10000;

            int var32;
            label211: {
               Throwable var30;
               label215: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  Parcel var10005;
                  Map var10006;
                  Parcel var10007;
                  Bundle var10008;
                  Parcel var10009;
                  String var10010;
                  Parcel var10011;
                  Account var10012;
                  boolean var31;
                  try {
                     var10002 = this;
                     var10003 = var6;
                     var10004 = var5;
                     var10005 = var6;
                     var10006 = var4;
                     var10007 = var6;
                     var10008 = var3;
                     var10009 = var6;
                     var10010 = var2;
                     var10011 = var6;
                     var10012 = var1;
                     var6.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var27) {
                     var30 = var27;
                     var31 = false;
                     break label215;
                  }

                  byte var10013 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10011, var10012, var10013);
                     var10009.writeString(var10010);
                  } catch (Throwable var26) {
                     var30 = var26;
                     var31 = false;
                     break label215;
                  }

                  byte var29 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10007, var10008, var29);
                     var10005.writeMap(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(29, var6, var7, 0);
                  } catch (Throwable var25) {
                     var30 = var25;
                     var31 = false;
                     break label215;
                  }

                  label198:
                  try {
                     var10001.readException();
                     var32 = var10000.readInt();
                     break label211;
                  } catch (Throwable var24) {
                     var30 = var24;
                     var31 = false;
                     break label198;
                  }
               }

               Throwable var28 = var30;
               var7.recycle();
               var6.recycle();
               throw var28;
            }

            boolean var33 = var32 != 0;
            var7.recycle();
            var6.recycle();
            return var33;
         }

         public boolean _/* $FF was: Ϳ*/(Account var1, String var2, int var3, int var4) throws RemoteException {
            Parcel var5 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var6;
            Parcel var10001 = var6 = var10000;

            int var22;
            label140: {
               Throwable var20;
               label144: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  Parcel var10005;
                  boolean var21;
                  int var10006;
                  Parcel var10007;
                  String var10008;
                  Parcel var10009;
                  Account var10010;
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
                     var5.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var18) {
                     var20 = var18;
                     var21 = false;
                     break label144;
                  }

                  byte var10011 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10009, var10010, var10011);
                     var10007.writeString(var10008);
                     var10005.writeInt(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(30, var5, var6, 0);
                  } catch (Throwable var17) {
                     var20 = var17;
                     var21 = false;
                     break label144;
                  }

                  label131:
                  try {
                     var10001.readException();
                     var22 = var10000.readInt();
                     break label140;
                  } catch (Throwable var16) {
                     var20 = var16;
                     var21 = false;
                     break label131;
                  }
               }

               Throwable var19 = var20;
               var6.recycle();
               var5.recycle();
               throw var19;
            }

            boolean var23 = var22 != 0;
            var6.recycle();
            var5.recycle();
            return var23;
         }

         public int _/* $FF was: Ԫ*/(Account var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            int var21;
            label120: {
               Throwable var19;
               label124: {
                  ຠ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  boolean var20;
                  Parcel var10005;
                  String var10006;
                  Parcel var10007;
                  Account var10008;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10009 = 0;

                  try {
                     ຠ.Ԫ.Ԩ(var10007, var10008, var10009);
                     var10005.writeString(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(31, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var21 = var10000.readInt();
                     break label120;
                  } catch (Throwable var15) {
                     var19 = var15;
                     var20 = false;
                     break label111;
                  }
               }

               Throwable var18 = var19;
               var5.recycle();
               var4.recycle();
               throw var18;
            }

            var5.recycle();
            var4.recycle();
            return var21;
         }

         public Map _/* $FF was: ԩ*/(String var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var5;
            Parcel var10000 = var5 = Parcel.obtain();

            HashMap var14;
            label68: {
               Throwable var12;
               label72: {
                  ຠ.Ԩ.Ϳ var13;
                  boolean var10001;
                  Parcel var10002;
                  try {
                     var13 = this;
                     var10002 = var5;
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var4.writeString(var1);
                     var4.writeString(var2);
                     var4.writeInt(var3);
                     this.ԭ.transact(32, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var10001 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     var14 = var10000.readHashMap(var13.getClass().getClassLoader());
                     break label68;
                  } catch (Throwable var10) {
                     var12 = var10;
                     var10001 = false;
                     break label63;
                  }
               }

               var5.recycle();
               var4.recycle();
               throw var12;
            }

            var5.recycle();
            var4.recycle();
            return var14;
         }

         public void _/* $FF was: Ϳ*/(String[] var1, String var2, int var3) throws RemoteException {
            Parcel var4;
            Parcel var10000 = var4 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var5;
            Parcel var10002 = var5 = var10001;

            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var4.writeStringArray(var1);
                     var4.writeString(var2);
                     var4.writeInt(var3);
                     this.ԭ.transact(33, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label63;
                  }
               }

               var5.recycle();
               var4.recycle();
               throw var12;
            }

            var10001.recycle();
            var10000.recycle();
         }

         public void _/* $FF was: Ԩ*/(String[] var1, String var2, int var3) throws RemoteException {
            Parcel var4;
            Parcel var10000 = var4 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var5;
            Parcel var10002 = var5 = var10001;

            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScaleAccountObserver");
                     var4.writeStringArray(var1);
                     var4.writeString(var2);
                     var4.writeInt(var3);
                     this.ԭ.transact(34, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10002.readException();
                     break label68;
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label63;
                  }
               }

               var5.recycle();
               var4.recycle();
               throw var12;
            }

            var10001.recycle();
            var10000.recycle();
         }
      }
   }

   public static class Ϳ implements ຠ {
      public String _/* $FF was: ԩ*/(Account var1, int var2) throws RemoteException {
         return null;
      }

      public String _/* $FF was: Ϳ*/(Account var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public AuthenticatorDescription[] _/* $FF was: Ԭ*/(int var1) throws RemoteException {
         return null;
      }

      public Account[] _/* $FF was: Ϳ*/(String var1, int var2, int var3) throws RemoteException {
         return null;
      }

      public Account[] _/* $FF was: Ԩ*/(String var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public Account[] _/* $FF was: Ԫ*/(String var1, int var2) throws RemoteException {
         return null;
      }

      public void _/* $FF was: Ԩ*/(IBinder var1, String var2, String[] var3, int var4) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, String var2, String[] var3, int var4) throws RemoteException {
      }

      public boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, int var4) throws RemoteException {
         return false;
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, boolean var3, int var4) throws RemoteException {
      }

      public boolean _/* $FF was: Ϳ*/(Account var1, int var2) throws RemoteException {
         return false;
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, int var3, int var4) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(String var1, String var2, int var3) throws RemoteException {
      }

      public String _/* $FF was: ԩ*/(Account var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public void _/* $FF was: Ԩ*/(Account var1, String var2, String var3, int var4) throws RemoteException {
      }

      public void _/* $FF was: Ԩ*/(Account var1, String var2, int var3) throws RemoteException {
      }

      public void _/* $FF was: Ԩ*/(Account var1, int var2) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(Account var1, String var2, String var3, int var4) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(Account var1, String var2, int var3, boolean var4) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, String var3, boolean var4, boolean var5, Bundle var6, int var7) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, String var2, String var3, String[] var4, boolean var5, Bundle var6, int var7) throws RemoteException {
      }

      public void _/* $FF was: Ԩ*/(IBinder var1, String var2, String var3, String[] var4, boolean var5, Bundle var6, int var7) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, String var3, boolean var4, Bundle var5, int var6) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, String var2, boolean var3, int var4) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, Account var2, Bundle var3, boolean var4, int var5) throws RemoteException {
      }

      public boolean _/* $FF was: Ԫ*/(Account var1, int var2) throws RemoteException {
         return false;
      }

      public void _/* $FF was: Ϳ*/(IBinder var1, String var2, String var3, int var4) throws RemoteException {
      }

      public Map _/* $FF was: ԫ*/(Account var1, int var2) throws RemoteException {
         return null;
      }

      public boolean _/* $FF was: Ϳ*/(Account var1, String var2, Bundle var3, Map var4, int var5) throws RemoteException {
         return false;
      }

      public boolean _/* $FF was: Ϳ*/(Account var1, String var2, int var3, int var4) throws RemoteException {
         return false;
      }

      public int _/* $FF was: Ԫ*/(Account var1, String var2, int var3) throws RemoteException {
         return 0;
      }

      public Map _/* $FF was: ԩ*/(String var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public void _/* $FF was: Ϳ*/(String[] var1, String var2, int var3) throws RemoteException {
      }

      public void _/* $FF was: Ԩ*/(String[] var1, String var2, int var3) throws RemoteException {
      }

      public IBinder asBinder() {
         return null;
      }
   }
}
