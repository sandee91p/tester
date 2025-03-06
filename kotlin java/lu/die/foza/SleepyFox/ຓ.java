package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.Parcelable.Creator;

public interface ຓ extends IInterface {
   String Ϳ = "lu.die.fozalib.IFozaDispatcher";

   void _/* $FF was: Ϳ*/(ൔ var1) throws RemoteException;

   void _/* $FF was: Ԯ*/() throws RemoteException;

   Intent _/* $FF was: ԩ*/(Intent var1) throws RemoteException;

   int _/* $FF was: Ϳ*/(int var1, Bundle var2) throws RemoteException;

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

   public abstract static class Ԩ extends Binder implements ຓ {
      public static final int ԭ = 1;
      public static final int Ԯ = 2;
      public static final int ԯ = 3;
      public static final int ՠ = 4;

      public _/* $FF was: Ԩ*/() {
         this.attachInterface(this, "lu.die.fozalib.IFozaDispatcher");
      }

      public static ຓ _/* $FF was: Ԫ*/(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1;
            return (ຓ)((var1 = var0.queryLocalInterface("lu.die.fozalib.IFozaDispatcher")) != null && var1 instanceof ຓ ? (ຓ)var1 : new ຓ.Ԩ.Ϳ(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         String var5 = "lu.die.fozalib.IFozaDispatcher";
         if (var1 >= 1 && var1 <= 16777215) {
            var2.enforceInterface(var5);
         }

         if (var1 != 1598968902) {
            switch(var1) {
            case 1:
               this.Ϳ((ൔ)ຓ.Ԫ.Ԩ(var2, ൔ.CREATOR));
               var3.writeNoException();
               break;
            case 2:
               this.Ԯ();
               var3.writeNoException();
               break;
            case 3:
               Intent var7 = this.ԩ((Intent)ຓ.Ԫ.Ԩ(var2, Intent.CREATOR));
               var3.writeNoException();
               ຓ.Ԫ.Ԩ(var3, var7, 1);
               break;
            case 4:
               ຓ.Ԩ var10002 = this;
               int var6 = var2.readInt();
               var6 = var10002.Ϳ(var6, (Bundle)ຓ.Ԫ.Ԩ(var2, Bundle.CREATOR));
               var3.writeNoException();
               var3.writeInt(var6);
               break;
            default:
               return super.onTransact(var1, var2, var3, var4);
            }

            return true;
         } else {
            var3.writeString(var5);
            return true;
         }
      }

      private static class Ϳ implements ຓ {
         public IBinder ԭ;

         public _/* $FF was: Ϳ*/(IBinder var1) {
            this.ԭ = var1;
         }

         public IBinder asBinder() {
            return this.ԭ;
         }

         public String _/* $FF was: ֈ*/() {
            return "lu.die.fozalib.IFozaDispatcher";
         }

         public void _/* $FF was: Ϳ*/(ൔ var1) throws RemoteException {
            Parcel var2;
            Parcel var10000 = var2 = Parcel.obtain();
            Parcel var10001 = Parcel.obtain();
            Parcel var3;
            Parcel var10002 = var3 = var10001;

            label120: {
               Throwable var17;
               label124: {
                  boolean var18;
                  ຓ.Ԩ.Ϳ var10003;
                  Parcel var10004;
                  ൔ var10005;
                  try {
                     var10003 = this;
                     var10004 = var2;
                     var10005 = var1;
                     var2.writeInterfaceToken("lu.die.fozalib.IFozaDispatcher");
                  } catch (Throwable var15) {
                     var17 = var15;
                     var18 = false;
                     break label124;
                  }

                  byte var10006 = 0;

                  try {
                     ຓ.Ԫ.Ԩ(var10004, var10005, var10006);
                     var10003.ԭ.transact(1, var2, var3, 0);
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

         public void _/* $FF was: Ԯ*/() throws RemoteException {
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
                     var1.writeInterfaceToken("lu.die.fozalib.IFozaDispatcher");
                     this.ԭ.transact(2, var1, var2, 0);
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

         public Intent _/* $FF was: ԩ*/(Intent var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            Intent var19;
            label120: {
               Throwable var17;
               label124: {
                  ຓ.Ԩ.Ϳ var10002;
                  boolean var18;
                  Parcel var10003;
                  Intent var10004;
                  try {
                     var10002 = this;
                     var10003 = var2;
                     var10004 = var1;
                     var2.writeInterfaceToken("lu.die.fozalib.IFozaDispatcher");
                  } catch (Throwable var15) {
                     var17 = var15;
                     var18 = false;
                     break label124;
                  }

                  byte var10005 = 0;

                  try {
                     ຓ.Ԫ.Ԩ(var10003, var10004, var10005);
                     var10002.ԭ.transact(3, var2, var3, 0);
                  } catch (Throwable var14) {
                     var17 = var14;
                     var18 = false;
                     break label124;
                  }

                  label111:
                  try {
                     var10001.readException();
                     var19 = (Intent)ຓ.Ԫ.Ԩ(var10000, Intent.CREATOR);
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

         public int _/* $FF was: Ϳ*/(int var1, Bundle var2) throws RemoteException {
            Parcel var3 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var4;
            Parcel var10001 = var4 = var10000;

            int var20;
            label120: {
               Throwable var18;
               label124: {
                  ຓ.Ԩ.Ϳ var10002;
                  Parcel var10003;
                  boolean var19;
                  Bundle var10004;
                  try {
                     var10002 = this;
                     var10003 = var3;
                     var10004 = var2;
                     var3.writeInterfaceToken("lu.die.fozalib.IFozaDispatcher");
                     var3.writeInt(var1);
                  } catch (Throwable var16) {
                     var18 = var16;
                     var19 = false;
                     break label124;
                  }

                  byte var10005 = 0;

                  try {
                     ຓ.Ԫ.Ԩ(var10003, var10004, var10005);
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
      }
   }

   public static class Ϳ implements ຓ {
      public void _/* $FF was: Ϳ*/(ൔ var1) throws RemoteException {
      }

      public void _/* $FF was: Ԯ*/() throws RemoteException {
      }

      public Intent _/* $FF was: ԩ*/(Intent var1) throws RemoteException {
         return null;
      }

      public int _/* $FF was: Ϳ*/(int var1, Bundle var2) throws RemoteException {
         return 0;
      }

      public IBinder asBinder() {
         return null;
      }
   }
}
