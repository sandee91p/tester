package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
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

public interface ຬ extends IInterface {
   String Ԭ = "lu.die.fozalib.IScalePackageObserver";

   ActivityInfo _/* $FF was: Ԩ*/(Intent var1) throws RemoteException;

   ServiceInfo _/* $FF was: Ϳ*/(Intent var1) throws RemoteException;

   void _/* $FF was: Ϳ*/() throws RemoteException;

   PackageInfo _/* $FF was: ԩ*/(String var1, int var2) throws RemoteException;

   ServiceInfo _/* $FF was: ԩ*/(ComponentName var1, int var2) throws RemoteException;

   ActivityInfo _/* $FF was: Ԫ*/(ComponentName var1, int var2) throws RemoteException;

   ApplicationInfo _/* $FF was: Ԩ*/(String var1, int var2) throws RemoteException;

   ProviderInfo _/* $FF was: Ϳ*/(ComponentName var1, int var2) throws RemoteException;

   ActivityInfo _/* $FF was: Ԩ*/(ComponentName var1, int var2) throws RemoteException;

   List<ResolveInfo> _/* $FF was: Ԫ*/(Intent var1, String var2, int var3) throws RemoteException;

   List<ResolveInfo> _/* $FF was: Ԩ*/(Intent var1, String var2, int var3) throws RemoteException;

   List<ResolveInfo> _/* $FF was: ԩ*/(Intent var1, String var2, int var3) throws RemoteException;

   List<ResolveInfo> _/* $FF was: Ϳ*/(Intent var1, String var2, int var3) throws RemoteException;

   List<ProviderInfo> _/* $FF was: Ϳ*/(String var1, int var2, String var3) throws RemoteException;

   String _/* $FF was: ԫ*/(String var1, String var2) throws RemoteException;

   String[] _/* $FF was: Ԯ*/(String var1) throws RemoteException;

   void _/* $FF was: Ԩ*/(String var1, String var2) throws RemoteException;

   ProviderInfo _/* $FF was: Ϳ*/(String var1, int var2) throws RemoteException;

   List<PackageInfo> _/* $FF was: Ϳ*/(int var1) throws RemoteException;

   int _/* $FF was: ԭ*/(String var1) throws RemoteException;

   int _/* $FF was: ԫ*/(String var1) throws RemoteException;

   int _/* $FF was: Ϳ*/(String var1, boolean var2) throws RemoteException;

   void _/* $FF was: Ԫ*/(String var1, String var2) throws RemoteException;

   String _/* $FF was: ՠ*/(String var1) throws RemoteException;

   boolean _/* $FF was: Ϳ*/(String var1) throws RemoteException;

   boolean _/* $FF was: ԩ*/(String var1) throws RemoteException;

   int _/* $FF was: ֈ*/(String var1) throws RemoteException;

   ProviderInfo _/* $FF was: ԯ*/(String var1) throws RemoteException;

   List<String> _/* $FF was: Ϳ*/(String var1, long var2) throws RemoteException;

   boolean _/* $FF was: Ԩ*/(String var1) throws RemoteException;

   void _/* $FF was: Ԩ*/(int var1) throws RemoteException;

   int _/* $FF was: Ϳ*/(ComponentName var1) throws RemoteException;

   void _/* $FF was: ԫ*/(ComponentName var1, int var2) throws RemoteException;

   void _/* $FF was: ԯ*/() throws RemoteException;

   void _/* $FF was: Ԭ*/(String var1) throws RemoteException;

   void _/* $FF was: Ԩ*/() throws RemoteException;

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

   public abstract static class Ԩ extends Binder implements ຬ {
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
      public static final int ޚ = 35;
      public static final int ޛ = 36;

      public _/* $FF was: Ԩ*/() {
         this.attachInterface(this, "lu.die.fozalib.IScalePackageObserver");
      }

      public static ຬ _/* $FF was: Ԫ*/(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1;
            return (ຬ)((var1 = var0.queryLocalInterface("lu.die.fozalib.IScalePackageObserver")) != null && var1 instanceof ຬ ? (ຬ)var1 : new ຬ.Ԩ.Ϳ(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         String var5 = "lu.die.fozalib.IScalePackageObserver";
         if (var1 >= 1 && var1 <= 16777215) {
            var2.enforceInterface(var5);
         }

         if (var1 == 1598968902) {
            var3.writeString(var5);
            return true;
         } else {
            byte var6;
            ProviderInfo var16;
            label273: {
               byte var13;
               label274: {
                  ActivityInfo var19;
                  label275: {
                     String var8;
                     int var11;
                     int var12;
                     String var14;
                     List var15;
                     ComponentName var10000;
                     Intent var18;
                     ServiceInfo var21;
                     switch(var1) {
                     case 1:
                        var19 = this.Ԩ((Intent)ຬ.Ԫ.Ԩ(var2, Intent.CREATOR));
                        var3.writeNoException();
                        var6 = 1;
                        break label275;
                     case 2:
                        var21 = this.Ϳ((Intent)ຬ.Ԫ.Ԩ(var2, Intent.CREATOR));
                        var3.writeNoException();
                        var6 = 1;
                        break;
                     case 3:
                        this.Ϳ();
                        var3.writeNoException();
                        return true;
                     case 4:
                        var14 = var2.readString();
                        var1 = var2.readInt();
                        PackageInfo var22 = this.ԩ(var14, var1);
                        var3.writeNoException();
                        var6 = 1;
                        ຬ.Ԫ.Ԩ(var3, var22, var6);
                        return true;
                     case 5:
                        var10000 = (ComponentName)ຬ.Ԫ.Ԩ(var2, ComponentName.CREATOR);
                        var1 = var2.readInt();
                        var21 = this.ԩ(var10000, var1);
                        var3.writeNoException();
                        var6 = 1;
                        break;
                     case 6:
                        var10000 = (ComponentName)ຬ.Ԫ.Ԩ(var2, ComponentName.CREATOR);
                        var1 = var2.readInt();
                        var19 = this.Ԫ(var10000, var1);
                        var3.writeNoException();
                        var6 = 1;
                        break label275;
                     case 7:
                        var14 = var2.readString();
                        var1 = var2.readInt();
                        ApplicationInfo var20 = this.Ԩ(var14, var1);
                        var3.writeNoException();
                        var6 = 1;
                        ຬ.Ԫ.Ԩ(var3, var20, var6);
                        return true;
                     case 8:
                        var10000 = (ComponentName)ຬ.Ԫ.Ԩ(var2, ComponentName.CREATOR);
                        var1 = var2.readInt();
                        var16 = this.Ϳ(var10000, var1);
                        var3.writeNoException();
                        var6 = 1;
                        break label273;
                     case 9:
                        var10000 = (ComponentName)ຬ.Ԫ.Ԩ(var2, ComponentName.CREATOR);
                        var1 = var2.readInt();
                        var19 = this.Ԩ(var10000, var1);
                        var3.writeNoException();
                        var6 = 1;
                        break label275;
                     case 10:
                        var18 = (Intent)ຬ.Ԫ.Ԩ(var2, Intent.CREATOR);
                        var8 = var2.readString();
                        var11 = var2.readInt();
                        var15 = this.Ԫ(var18, var8, var11);
                        var3.writeNoException();
                        var3.writeTypedList(var15);
                        return true;
                     case 11:
                        var18 = (Intent)ຬ.Ԫ.Ԩ(var2, Intent.CREATOR);
                        var8 = var2.readString();
                        var11 = var2.readInt();
                        var15 = this.Ԩ(var18, var8, var11);
                        var3.writeNoException();
                        var3.writeTypedList(var15);
                        return true;
                     case 12:
                        var18 = (Intent)ຬ.Ԫ.Ԩ(var2, Intent.CREATOR);
                        var8 = var2.readString();
                        var11 = var2.readInt();
                        var15 = this.ԩ(var18, var8, var11);
                        var3.writeNoException();
                        var3.writeTypedList(var15);
                        return true;
                     case 13:
                        var18 = (Intent)ຬ.Ԫ.Ԩ(var2, Intent.CREATOR);
                        var8 = var2.readString();
                        var11 = var2.readInt();
                        var15 = this.Ϳ(var18, var8, var11);
                        var3.writeNoException();
                        var3.writeTypedList(var15);
                        return true;
                     case 14:
                        var14 = var2.readString();
                        var1 = var2.readInt();
                        String var10 = var2.readString();
                        var15 = this.Ϳ(var14, var1, var10);
                        var3.writeNoException();
                        var3.writeTypedList(var15);
                        return true;
                     case 15:
                        var14 = this.ԫ(var8 = var2.readString(), var8);
                        var3.writeNoException();
                        var3.writeString(var14);
                        return true;
                     case 16:
                        String[] var17 = this.Ԯ(var2.readString());
                        var3.writeNoException();
                        var3.writeStringArray(var17);
                        return true;
                     case 17:
                        this.Ԩ(var8 = var2.readString(), var8);
                        var3.writeNoException();
                        return true;
                     case 18:
                        var14 = var2.readString();
                        var1 = var2.readInt();
                        var16 = this.Ϳ(var14, var1);
                        var3.writeNoException();
                        var6 = 1;
                        break label273;
                     case 19:
                        var15 = this.Ϳ(var2.readInt());
                        var3.writeNoException();
                        var3.writeTypedList(var15);
                        return true;
                     case 20:
                        var12 = this.ԭ(var2.readString());
                        var3.writeNoException();
                        var3.writeInt(var12);
                        return true;
                     case 21:
                        var12 = this.ԫ(var2.readString());
                        var3.writeNoException();
                        var3.writeInt(var12);
                        return true;
                     case 22:
                        var8 = var2.readString();
                        boolean var9;
                        if (var2.readInt() != 0) {
                           var9 = true;
                        } else {
                           var9 = false;
                        }

                        var12 = this.Ϳ(var8, var9);
                        var3.writeNoException();
                        var3.writeInt(var12);
                        return true;
                     case 23:
                        this.Ԫ(var8 = var2.readString(), var8);
                        var3.writeNoException();
                        return true;
                     case 24:
                        var14 = this.ՠ(var2.readString());
                        var3.writeNoException();
                        var3.writeString(var14);
                        return true;
                     case 25:
                        var13 = this.Ϳ(var2.readString());
                        var3.writeNoException();
                        break label274;
                     case 26:
                        var13 = this.ԩ(var2.readString());
                        var3.writeNoException();
                        break label274;
                     case 27:
                        var12 = this.ֈ(var2.readString());
                        var3.writeNoException();
                        var3.writeInt(var12);
                        return true;
                     case 28:
                        var16 = this.ԯ(var2.readString());
                        var3.writeNoException();
                        var6 = 1;
                        break label273;
                     case 29:
                        var14 = var2.readString();
                        long var7 = var2.readLong();
                        var15 = this.Ϳ(var14, var7);
                        var3.writeNoException();
                        var3.writeStringList(var15);
                        return true;
                     case 30:
                        var13 = this.Ԩ(var2.readString());
                        var3.writeNoException();
                        break label274;
                     case 31:
                        this.Ԩ(var2.readInt());
                        var3.writeNoException();
                        return true;
                     case 32:
                        var12 = this.Ϳ((ComponentName)ຬ.Ԫ.Ԩ(var2, ComponentName.CREATOR));
                        var3.writeNoException();
                        var3.writeInt(var12);
                        return true;
                     case 33:
                        var10000 = (ComponentName)ຬ.Ԫ.Ԩ(var2, ComponentName.CREATOR);
                        var1 = var2.readInt();
                        this.ԫ(var10000, var1);
                        var3.writeNoException();
                        return true;
                     case 34:
                        this.ԯ();
                        var3.writeNoException();
                        return true;
                     case 35:
                        this.Ԭ(var2.readString());
                        var3.writeNoException();
                        return true;
                     case 36:
                        this.Ԩ();
                        var3.writeNoException();
                        return true;
                     default:
                        return super.onTransact(var1, var2, var3, var4);
                     }

                     ຬ.Ԫ.Ԩ(var3, var21, var6);
                     return true;
                  }

                  ຬ.Ԫ.Ԩ(var3, var19, var6);
                  return true;
               }

               var3.writeInt(var13);
               return true;
            }

            ຬ.Ԫ.Ԩ(var3, var16, var6);
            return true;
         }
      }

      private static class Ϳ implements ຬ {
         public IBinder ԭ;

         public _/* $FF was: Ϳ*/(IBinder var1) {
            this.ԭ = var1;
         }

         public IBinder asBinder() {
            return this.ԭ;
         }

         public String _/* $FF was: ֈ*/() {
            return "lu.die.fozalib.IScalePackageObserver";
         }

         public ActivityInfo _/* $FF was: Ԩ*/(Intent var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            ActivityInfo var19;
            label120: {
               Throwable var17;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  boolean var18;
                  Parcel var10003;
                  Intent var10004;
                  try {
                     var10002 = this;
                     var10003 = var2;
                     var10004 = var1;
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var15) {
                     var17 = var15;
                     var18 = false;
                     break label124;
                  }

                  byte var10005 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10003, var10004, var10005);
                     var10002.ԭ.transact(1, var2, var3, 0);
                  } catch (Throwable var14) {
                     var17 = var14;
                     var18 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var19 = (ActivityInfo)ຬ.Ԫ.Ԩ(var10000, ActivityInfo.CREATOR);
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

            var3.recycle();
            var2.recycle();
            return var19;
         }

         public ServiceInfo _/* $FF was: Ϳ*/(Intent var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            ServiceInfo var19;
            label120: {
               Throwable var17;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  boolean var18;
                  Parcel var10003;
                  Intent var10004;
                  try {
                     var10002 = this;
                     var10003 = var2;
                     var10004 = var1;
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var15) {
                     var17 = var15;
                     var18 = false;
                     break label124;
                  }

                  byte var10005 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10003, var10004, var10005);
                     var10002.ԭ.transact(2, var2, var3, 0);
                  } catch (Throwable var14) {
                     var17 = var14;
                     var18 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var19 = (ServiceInfo)ຬ.Ԫ.Ԩ(var10000, ServiceInfo.CREATOR);
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

            var3.recycle();
            var2.recycle();
            return var19;
         }

         public void _/* $FF was: Ϳ*/() throws RemoteException {
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
                     var1.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     this.ԭ.transact(3, var1, var2, 0);
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

         public PackageInfo _/* $FF was: ԩ*/(String var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            PackageInfo var14;
            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var3.writeString(var1);
                     var3.writeInt(var2);
                     this.ԭ.transact(4, var3, var4, 0);
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var14 = (PackageInfo)ຬ.Ԫ.Ԩ(var10000, PackageInfo.CREATOR);
                     break label68;
                  } catch (Throwable var9) {
                     var12 = var9;
                     var13 = false;
                     break label63;
                  }
               }

               Throwable var11 = var12;
               var4.recycle();
               var3.recycle();
               throw var11;
            }

            var4.recycle();
            var3.recycle();
            return var14;
         }

         public ServiceInfo _/* $FF was: ԩ*/(ComponentName var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            ServiceInfo var20;
            label120: {
               Throwable var18;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  ComponentName var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(5, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = (ServiceInfo)ຬ.Ԫ.Ԩ(var10000, ServiceInfo.CREATOR);
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

         public ActivityInfo _/* $FF was: Ԫ*/(ComponentName var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            ActivityInfo var20;
            label120: {
               Throwable var18;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  ComponentName var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(6, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = (ActivityInfo)ຬ.Ԫ.Ԩ(var10000, ActivityInfo.CREATOR);
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

         public ApplicationInfo _/* $FF was: Ԩ*/(String var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            ApplicationInfo var14;
            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var3.writeString(var1);
                     var3.writeInt(var2);
                     this.ԭ.transact(7, var3, var4, 0);
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var14 = (ApplicationInfo)ຬ.Ԫ.Ԩ(var10000, ApplicationInfo.CREATOR);
                     break label68;
                  } catch (Throwable var9) {
                     var12 = var9;
                     var13 = false;
                     break label63;
                  }
               }

               Throwable var11 = var12;
               var4.recycle();
               var3.recycle();
               throw var11;
            }

            var4.recycle();
            var3.recycle();
            return var14;
         }

         public ProviderInfo _/* $FF was: Ϳ*/(ComponentName var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            ProviderInfo var20;
            label120: {
               Throwable var18;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  ComponentName var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(8, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = (ProviderInfo)ຬ.Ԫ.Ԩ(var10000, ProviderInfo.CREATOR);
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

         public ActivityInfo _/* $FF was: Ԩ*/(ComponentName var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            ActivityInfo var20;
            label120: {
               Throwable var18;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  int var10004;
                  Parcel var10005;
                  ComponentName var10006;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var10005 = var3;
                     var10006 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10007 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10005, var10006, var10007);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(9, var3, var4, 0);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var19 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var20 = (ActivityInfo)ຬ.Ԫ.Ԩ(var10000, ActivityInfo.CREATOR);
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

         public List<ResolveInfo> _/* $FF was: Ԫ*/(Intent var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            ArrayList var21;
            label120: {
               Throwable var19;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  boolean var20;
                  Parcel var10005;
                  String var10006;
                  Parcel var10007;
                  Intent var10008;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10009 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10007, var10008, var10009);
                     var10005.writeString(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(10, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var21 = var10000.createTypedArrayList(ResolveInfo.CREATOR);
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

         public List<ResolveInfo> _/* $FF was: Ԩ*/(Intent var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            ArrayList var21;
            label120: {
               Throwable var19;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  boolean var20;
                  Parcel var10005;
                  String var10006;
                  Parcel var10007;
                  Intent var10008;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10009 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10007, var10008, var10009);
                     var10005.writeString(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(11, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var21 = var10000.createTypedArrayList(ResolveInfo.CREATOR);
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

         public List<ResolveInfo> _/* $FF was: ԩ*/(Intent var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            ArrayList var21;
            label120: {
               Throwable var19;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  boolean var20;
                  Parcel var10005;
                  String var10006;
                  Parcel var10007;
                  Intent var10008;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10009 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10007, var10008, var10009);
                     var10005.writeString(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(12, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var21 = var10000.createTypedArrayList(ResolveInfo.CREATOR);
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

         public List<ResolveInfo> _/* $FF was: Ϳ*/(Intent var1, String var2, int var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            ArrayList var21;
            label120: {
               Throwable var19;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  int var10004;
                  boolean var20;
                  Parcel var10005;
                  String var10006;
                  Parcel var10007;
                  Intent var10008;
                  try {
                     var10002 = this;
                     var10003 = var4;
                     var10004 = var3;
                     var10005 = var4;
                     var10006 = var2;
                     var10007 = var4;
                     var10008 = var1;
                     var4.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var17) {
                     var19 = var17;
                     var20 = false;
                     break label124;
                  }

                  byte var10009 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10007, var10008, var10009);
                     var10005.writeString(var10006);
                     var10003.writeInt(var10004);
                     var10002.ԭ.transact(13, var4, var5, 0);
                  } catch (Throwable var16) {
                     var19 = var16;
                     var20 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var21 = var10000.createTypedArrayList(ResolveInfo.CREATOR);
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

         public List<ProviderInfo> _/* $FF was: Ϳ*/(String var1, int var2, String var3) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            ArrayList var14;
            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var4.writeString(var1);
                     var4.writeInt(var2);
                     var4.writeString(var3);
                     this.ԭ.transact(14, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var14 = var10000.createTypedArrayList(ProviderInfo.CREATOR);
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

         public String _/* $FF was: ԫ*/(String var1, String var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            String var13;
            label68: {
               Throwable var11;
               label72: {
                  boolean var12;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var3.writeString(var1);
                     var3.writeString(var2);
                     this.ԭ.transact(15, var3, var4, 0);
                  } catch (Throwable var10) {
                     var11 = var10;
                     var12 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var13 = var10000.readString();
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

         public String[] _/* $FF was: Ԯ*/(String var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            String[] var12;
            label68: {
               Throwable var10;
               label72: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(16, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var12 = var10000.createStringArray();
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

         public void _/* $FF was: Ԩ*/(String var1, String var2) throws RemoteException {
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
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var3.writeString(var1);
                     var3.writeString(var2);
                     this.ԭ.transact(17, var3, var4, 0);
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

         public ProviderInfo _/* $FF was: Ϳ*/(String var1, int var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            ProviderInfo var14;
            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var3.writeString(var1);
                     var3.writeInt(var2);
                     this.ԭ.transact(18, var3, var4, 0);
                  } catch (Throwable var10) {
                     var12 = var10;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var14 = (ProviderInfo)ຬ.Ԫ.Ԩ(var10000, ProviderInfo.CREATOR);
                     break label68;
                  } catch (Throwable var9) {
                     var12 = var9;
                     var13 = false;
                     break label63;
                  }
               }

               Throwable var11 = var12;
               var4.recycle();
               var3.recycle();
               throw var11;
            }

            var4.recycle();
            var3.recycle();
            return var14;
         }

         public List<PackageInfo> _/* $FF was: Ϳ*/(int var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
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
                     var12 = var10000.createTypedArrayList(PackageInfo.CREATOR);
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

         public int _/* $FF was: ԭ*/(String var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(20, var2, var3, 0);
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

         public int _/* $FF was: ԫ*/(String var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(21, var2, var3, 0);
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

         public int _/* $FF was: Ϳ*/(String var1, boolean var2) throws RemoteException {
            boolean var10000 = var2;
            Parcel var17;
            Parcel var10001 = var17 = Parcel.obtain();
            String var10002 = var1;
            Parcel var10003 = var17;
            Parcel var16 = Parcel.obtain();

            int var21;
            label132: {
               Throwable var18;
               label136: {
                  boolean var20;
                  try {
                     var10003.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var10001.writeString(var10002);
                  } catch (Throwable var15) {
                     var18 = var15;
                     var20 = false;
                     break label136;
                  }

                  byte var3;
                  if (var10000) {
                     var3 = 1;
                  } else {
                     var3 = 0;
                  }

                  Parcel var19;
                  try {
                     var19 = var16;
                     var10001 = var16;
                     var17.writeInt(var3);
                     this.ԭ.transact(22, var17, var16, 0);
                  } catch (Throwable var14) {
                     var18 = var14;
                     var20 = false;
                     break label136;
                  }

                  label123:
                  try {
                     var10001.readException();
                     var21 = var19.readInt();
                     break label132;
                  } catch (Throwable var13) {
                     var18 = var13;
                     var20 = false;
                     break label123;
                  }
               }

               var16.recycle();
               var17.recycle();
               throw var18;
            }

            var16.recycle();
            var17.recycle();
            return var21;
         }

         public void _/* $FF was: Ԫ*/(String var1, String var2) throws RemoteException {
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
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var3.writeString(var1);
                     var3.writeString(var2);
                     this.ԭ.transact(23, var3, var4, 0);
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

         public String _/* $FF was: ՠ*/(String var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(24, var2, var3, 0);
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

         public boolean _/* $FF was: Ϳ*/(String var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            int var12;
            label83: {
               Throwable var10;
               label87: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(25, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label87;
                  }

                  label78:
                  try {
                     var10001.readException();
                     var12 = var10000.readInt();
                     break label83;
                  } catch (Throwable var8) {
                     var10 = var8;
                     var11 = false;
                     break label78;
                  }
               }

               var3.recycle();
               var2.recycle();
               throw var10;
            }

            boolean var13 = var12 != 0;
            var3.recycle();
            var2.recycle();
            return var13;
         }

         public boolean _/* $FF was: ԩ*/(String var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            int var12;
            label83: {
               Throwable var10;
               label87: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(26, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label87;
                  }

                  label78:
                  try {
                     var10001.readException();
                     var12 = var10000.readInt();
                     break label83;
                  } catch (Throwable var8) {
                     var10 = var8;
                     var11 = false;
                     break label78;
                  }
               }

               var3.recycle();
               var2.recycle();
               throw var10;
            }

            boolean var13 = var12 != 0;
            var3.recycle();
            var2.recycle();
            return var13;
         }

         public int _/* $FF was: ֈ*/(String var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(27, var2, var3, 0);
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

         public ProviderInfo _/* $FF was: ԯ*/(String var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            ProviderInfo var13;
            label68: {
               Throwable var11;
               label72: {
                  boolean var12;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(28, var2, var3, 0);
                  } catch (Throwable var9) {
                     var11 = var9;
                     var12 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var13 = (ProviderInfo)ຬ.Ԫ.Ԩ(var10000, ProviderInfo.CREATOR);
                     break label68;
                  } catch (Throwable var8) {
                     var11 = var8;
                     var12 = false;
                     break label63;
                  }
               }

               Throwable var10 = var11;
               var3.recycle();
               var2.recycle();
               throw var10;
            }

            var3.recycle();
            var2.recycle();
            return var13;
         }

         public List<String> _/* $FF was: Ϳ*/(String var1, long var2) throws RemoteException {
            Parcel var4 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var5;
            Parcel var10001 = var5 = var10000;

            ArrayList var14;
            label68: {
               Throwable var12;
               label72: {
                  boolean var13;
                  try {
                     var4.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var4.writeString(var1);
                     var4.writeLong(var2);
                     this.ԭ.transact(29, var4, var5, 0);
                  } catch (Throwable var11) {
                     var12 = var11;
                     var13 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var14 = var10000.createStringArrayList();
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

         public boolean _/* $FF was: Ԩ*/(String var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            int var12;
            label83: {
               Throwable var10;
               label87: {
                  boolean var11;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(30, var2, var3, 0);
                  } catch (Throwable var9) {
                     var10 = var9;
                     var11 = false;
                     break label87;
                  }

                  label78:
                  try {
                     var10001.readException();
                     var12 = var10000.readInt();
                     break label83;
                  } catch (Throwable var8) {
                     var10 = var8;
                     var11 = false;
                     break label78;
                  }
               }

               var3.recycle();
               var2.recycle();
               throw var10;
            }

            boolean var13 = var12 != 0;
            var3.recycle();
            var2.recycle();
            return var13;
         }

         public void _/* $FF was: Ԩ*/(int var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeInt(var1);
                     this.ԭ.transact(31, var2, var3, 0);
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

         public int _/* $FF was: Ϳ*/(ComponentName var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            int var19;
            label120: {
               Throwable var17;
               label124: {
                  ຬ.Ԩ.Ϳ var10002;
                  boolean var18;
                  Parcel var10003;
                  ComponentName var10004;
                  try {
                     var10002 = this;
                     var10003 = var2;
                     var10004 = var1;
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var15) {
                     var17 = var15;
                     var18 = false;
                     break label124;
                  }

                  byte var10005 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10003, var10004, var10005);
                     var10002.ԭ.transact(32, var2, var3, 0);
                  } catch (Throwable var14) {
                     var17 = var14;
                     var18 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var19 = var10000.readInt();
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

            var3.recycle();
            var2.recycle();
            return var19;
         }

         public void _/* $FF was: ԫ*/(ComponentName var1, int var2) throws RemoteException {
            Parcel var3;
            Parcel var10000 = var3 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var4;
            Parcel var10002 = var4 = var10001;

            label120: {
               Throwable var18;
               label124: {
                  ຬ.Ԩ.Ϳ var10003;
                  boolean var19;
                  Parcel var10004;
                  int var10005;
                  Parcel var10006;
                  ComponentName var10007;
                  try {
                     var10003 = this;
                     var10004 = var3;
                     var10005 = var2;
                     var10006 = var3;
                     var10007 = var1;
                     var3.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10008 = 0;

                  try {
                     ຬ.Ԫ.Ԩ(var10006, var10007, var10008);
                     var10004.writeInt(var10005);
                     var10003.ԭ.transact(33, var3, var4, 0);
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

         public void _/* $FF was: ԯ*/() throws RemoteException {
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
                     var1.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     this.ԭ.transact(34, var1, var2, 0);
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

         public void _/* $FF was: Ԭ*/(String var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(35, var2, var3, 0);
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

         public void _/* $FF was: Ԩ*/() throws RemoteException {
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
                     var1.writeInterfaceToken("lu.die.fozalib.IScalePackageObserver");
                     this.ԭ.transact(36, var1, var2, 0);
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
      }
   }

   public static class Ϳ implements ຬ {
      public ActivityInfo _/* $FF was: Ԩ*/(Intent var1) throws RemoteException {
         return null;
      }

      public ServiceInfo _/* $FF was: Ϳ*/(Intent var1) throws RemoteException {
         return null;
      }

      public void _/* $FF was: Ϳ*/() throws RemoteException {
      }

      public PackageInfo _/* $FF was: ԩ*/(String var1, int var2) throws RemoteException {
         return null;
      }

      public ServiceInfo _/* $FF was: ԩ*/(ComponentName var1, int var2) throws RemoteException {
         return null;
      }

      public ActivityInfo _/* $FF was: Ԫ*/(ComponentName var1, int var2) throws RemoteException {
         return null;
      }

      public ApplicationInfo _/* $FF was: Ԩ*/(String var1, int var2) throws RemoteException {
         return null;
      }

      public ProviderInfo _/* $FF was: Ϳ*/(ComponentName var1, int var2) throws RemoteException {
         return null;
      }

      public ActivityInfo _/* $FF was: Ԩ*/(ComponentName var1, int var2) throws RemoteException {
         return null;
      }

      public List<ResolveInfo> _/* $FF was: Ԫ*/(Intent var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public List<ResolveInfo> _/* $FF was: Ԩ*/(Intent var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public List<ResolveInfo> _/* $FF was: ԩ*/(Intent var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public List<ResolveInfo> _/* $FF was: Ϳ*/(Intent var1, String var2, int var3) throws RemoteException {
         return null;
      }

      public List<ProviderInfo> _/* $FF was: Ϳ*/(String var1, int var2, String var3) throws RemoteException {
         return null;
      }

      public String _/* $FF was: ԫ*/(String var1, String var2) throws RemoteException {
         return null;
      }

      public String[] _/* $FF was: Ԯ*/(String var1) throws RemoteException {
         return null;
      }

      public void _/* $FF was: Ԩ*/(String var1, String var2) throws RemoteException {
      }

      public ProviderInfo _/* $FF was: Ϳ*/(String var1, int var2) throws RemoteException {
         return null;
      }

      public List<PackageInfo> _/* $FF was: Ϳ*/(int var1) throws RemoteException {
         return null;
      }

      public int _/* $FF was: ԭ*/(String var1) throws RemoteException {
         return 0;
      }

      public int _/* $FF was: ԫ*/(String var1) throws RemoteException {
         return 0;
      }

      public int _/* $FF was: Ϳ*/(String var1, boolean var2) throws RemoteException {
         return 0;
      }

      public void _/* $FF was: Ԫ*/(String var1, String var2) throws RemoteException {
      }

      public String _/* $FF was: ՠ*/(String var1) throws RemoteException {
         return null;
      }

      public boolean _/* $FF was: Ϳ*/(String var1) throws RemoteException {
         return false;
      }

      public boolean _/* $FF was: ԩ*/(String var1) throws RemoteException {
         return false;
      }

      public int _/* $FF was: ֈ*/(String var1) throws RemoteException {
         return 0;
      }

      public ProviderInfo _/* $FF was: ԯ*/(String var1) throws RemoteException {
         return null;
      }

      public List<String> _/* $FF was: Ϳ*/(String var1, long var2) throws RemoteException {
         return null;
      }

      public boolean _/* $FF was: Ԩ*/(String var1) throws RemoteException {
         return false;
      }

      public void _/* $FF was: Ԩ*/(int var1) throws RemoteException {
      }

      public int _/* $FF was: Ϳ*/(ComponentName var1) throws RemoteException {
         return 0;
      }

      public void _/* $FF was: ԫ*/(ComponentName var1, int var2) throws RemoteException {
      }

      public void _/* $FF was: ԯ*/() throws RemoteException {
      }

      public void _/* $FF was: Ԭ*/(String var1) throws RemoteException {
      }

      public void _/* $FF was: Ԩ*/() throws RemoteException {
      }

      public IBinder asBinder() {
         return null;
      }
   }
}
