package lu.die.foza.SleepyFox;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.Parcelable.Creator;

public interface ຩ extends IInterface {
   String ԫ = "lu.die.fozalib.IScaleContentObserver";

   void _/* $FF was: Ԩ*/(IBinder var1) throws RemoteException;

   void _/* $FF was: Ϳ*/(Uri var1, boolean var2, IBinder var3) throws RemoteException;

   void _/* $FF was: Ϳ*/(Uri[] var1, IBinder var2, boolean var3) throws RemoteException;

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

   public abstract static class Ԩ extends Binder implements ຩ {
      public static final int ԭ = 1;
      public static final int Ԯ = 2;
      public static final int ԯ = 3;

      public _/* $FF was: Ԩ*/() {
         this.attachInterface(this, "lu.die.fozalib.IScaleContentObserver");
      }

      public static ຩ _/* $FF was: Ԫ*/(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1;
            return (ຩ)((var1 = var0.queryLocalInterface("lu.die.fozalib.IScaleContentObserver")) != null && var1 instanceof ຩ ? (ຩ)var1 : new ຩ.Ԩ.Ϳ(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         String var5 = "lu.die.fozalib.IScaleContentObserver";
         if (var1 >= 1 && var1 <= 16777215) {
            var2.enforceInterface(var5);
         }

         if (var1 != 1598968902) {
            if (var1 != 1) {
               boolean var10;
               if (var1 != 2) {
                  if (var1 != 3) {
                     return super.onTransact(var1, var2, var3, var4);
                  }

                  Parcel var10000 = var2;
                  Uri[] var7 = (Uri[])var2.createTypedArray(Uri.CREATOR);
                  IBinder var9 = var2.readStrongBinder();
                  if (var10000.readInt() != 0) {
                     var10 = true;
                  } else {
                     var10 = false;
                  }

                  this.Ϳ(var7, var9, var10);
                  var3.writeNoException();
               } else {
                  Uri var8 = (Uri)ຩ.Ԫ.Ԩ(var2, Uri.CREATOR);
                  if (var2.readInt() != 0) {
                     var10 = true;
                  } else {
                     var10 = false;
                  }

                  ຩ.Ԩ var10001 = this;
                  IBinder var6 = var2.readStrongBinder();
                  var10001.Ϳ(var8, var10, var6);
                  var3.writeNoException();
               }
            } else {
               this.Ԩ(var2.readStrongBinder());
               var3.writeNoException();
            }

            return true;
         } else {
            var3.writeString(var5);
            return true;
         }
      }

      private static class Ϳ implements ຩ {
         public IBinder ԭ;

         public _/* $FF was: Ϳ*/(IBinder var1) {
            this.ԭ = var1;
         }

         public IBinder asBinder() {
            return this.ԭ;
         }

         public String _/* $FF was: ֈ*/() {
            return "lu.die.fozalib.IScaleContentObserver";
         }

         public void _/* $FF was: Ԩ*/(IBinder var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IScaleContentObserver");
                     var2.writeStrongBinder(var1);
                     this.ԭ.transact(1, var2, var3, 0);
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

         public void _/* $FF was: Ϳ*/(Uri var1, boolean var2, IBinder var3) throws RemoteException {
            boolean var10000 = var2;
            Parcel var27;
            Parcel var10001 = var27 = Parcel.obtain();
            Uri var10002 = var1;
            Parcel var10003 = var27;
            Parcel var26 = Parcel.obtain();

            Parcel var30;
            label201: {
               Throwable var28;
               label205: {
                  boolean var29;
                  try {
                     var10003.writeInterfaceToken("lu.die.fozalib.IScaleContentObserver");
                  } catch (Throwable var24) {
                     var28 = var24;
                     var29 = false;
                     break label205;
                  }

                  byte var32 = 0;

                  try {
                     ຩ.Ԫ.Ԩ(var10001, var10002, var32);
                  } catch (Throwable var23) {
                     var28 = var23;
                     var29 = false;
                     break label205;
                  }

                  byte var4;
                  if (var10000) {
                     var4 = 1;
                  } else {
                     var4 = 0;
                  }

                  Parcel var31;
                  try {
                     var30 = var27;
                     var10001 = var26;
                     var31 = var26;
                     var27.writeInt(var4);
                     var27.writeStrongBinder(var3);
                     this.ԭ.transact(2, var27, var26, 0);
                  } catch (Throwable var22) {
                     var28 = var22;
                     var29 = false;
                     break label205;
                  }

                  label188:
                  try {
                     var31.readException();
                     break label201;
                  } catch (Throwable var21) {
                     var28 = var21;
                     var29 = false;
                     break label188;
                  }
               }

               Throwable var25 = var28;
               var26.recycle();
               var27.recycle();
               throw var25;
            }

            var10001.recycle();
            var30.recycle();
         }

         public void _/* $FF was: Ϳ*/(Uri[] var1, IBinder var2, boolean var3) throws RemoteException {
            boolean var10000 = var3;
            Parcel var18;
            Parcel var10001 = var18 = Parcel.obtain();
            IBinder var10002 = var2;
            Parcel var10003 = var18;
            Uri[] var10004 = var1;
            Parcel var10005 = var18;
            Parcel var16 = Parcel.obtain();

            Parcel var20;
            label132: {
               Throwable var19;
               label136: {
                  boolean var21;
                  try {
                     var10005.writeInterfaceToken("lu.die.fozalib.IScaleContentObserver");
                     var10003.writeTypedArray(var10004, 0);
                     var10001.writeStrongBinder(var10002);
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
                     this.ԭ.transact(3, var18, var16, 0);
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
      }
   }

   public static class Ϳ implements ຩ {
      public void _/* $FF was: Ԩ*/(IBinder var1) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(Uri var1, boolean var2, IBinder var3) throws RemoteException {
      }

      public void _/* $FF was: Ϳ*/(Uri[] var1, IBinder var2, boolean var3) throws RemoteException {
      }

      public IBinder asBinder() {
         return null;
      }
   }
}
