package lu.die.foza.SleepyFox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.Parcelable.Creator;

public interface ຘ extends IInterface {
   String Ԩ = "lu.die.fozalib.IFozaPrivacyObserver";

   boolean _/* $FF was: Ϳ*/(String var1, String var2, String var3) throws RemoteException;

   void _/* $FF was: ԭ*/(int var1) throws RemoteException;

   void _/* $FF was: Ԭ*/() throws RemoteException;

   int _/* $FF was: ԩ*/() throws RemoteException;

   void _/* $FF was: ԫ*/() throws RemoteException;

   ࣁ _/* $FF was: ԫ*/(int var1) throws RemoteException;

   String _/* $FF was: Ԫ*/(String var1) throws RemoteException;

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
      public static void _/* $FF was: Ϳ*/(Parcel var0, Parcelable var1, int var2) {
         Ԩ(var0, var1, var2);
      }

      // $FF: synthetic method
      public static Object _/* $FF was: Ϳ*/(Parcel var0, Creator var1) {
         return Ԩ(var0, var1);
      }
   }

   public abstract static class Ԩ extends Binder implements ຘ {
      public static final int ԭ = 1;
      public static final int Ԯ = 2;
      public static final int ԯ = 3;
      public static final int ՠ = 4;
      public static final int ֈ = 5;
      public static final int ֏ = 6;
      public static final int ׯ = 7;

      public _/* $FF was: Ԩ*/() {
         this.attachInterface(this, "lu.die.fozalib.IFozaPrivacyObserver");
      }

      public static ຘ _/* $FF was: Ԫ*/(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1;
            return (ຘ)((var1 = var0.queryLocalInterface("lu.die.fozalib.IFozaPrivacyObserver")) != null && var1 instanceof ຘ ? (ຘ)var1 : new ຘ.Ԩ.Ϳ(var0));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException {
         String var5 = "lu.die.fozalib.IFozaPrivacyObserver";
         if (var1 >= 1 && var1 <= 16777215) {
            var2.enforceInterface(var5);
         }

         if (var1 != 1598968902) {
            String var6;
            switch(var1) {
            case 1:
               ຘ.Ԩ var10002 = this;
               var6 = var2.readString();
               String var9 = var2.readString();
               String var11 = var2.readString();
               byte var10 = var10002.Ϳ(var6, var9, var11);
               var3.writeNoException();
               var3.writeInt(var10);
               break;
            case 2:
               this.ԭ(var2.readInt());
               var3.writeNoException();
               break;
            case 3:
               this.Ԭ();
               var3.writeNoException();
               break;
            case 4:
               int var8 = this.ԩ();
               var3.writeNoException();
               var3.writeInt(var8);
               break;
            case 5:
               this.ԫ();
               var3.writeNoException();
               break;
            case 6:
               ࣁ var7 = this.ԫ(var2.readInt());
               var3.writeNoException();
               ຘ.Ԫ.Ԩ(var3, var7, 1);
               break;
            case 7:
               var6 = this.Ԫ(var2.readString());
               var3.writeNoException();
               var3.writeString(var6);
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

      private static class Ϳ implements ຘ {
         public IBinder ԭ;

         public _/* $FF was: Ϳ*/(IBinder var1) {
            this.ԭ = var1;
         }

         public IBinder asBinder() {
            return this.ԭ;
         }

         public String _/* $FF was: ֈ*/() {
            return "lu.die.fozalib.IFozaPrivacyObserver";
         }

         public boolean _/* $FF was: Ϳ*/(String var1, String var2, String var3) throws RemoteException {
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
                     var4.writeInterfaceToken("lu.die.fozalib.IFozaPrivacyObserver");
                     var4.writeString(var1);
                     var4.writeString(var2);
                     var4.writeString(var3);
                     this.ԭ.transact(1, var4, var5, 0);
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

         public void _/* $FF was: ԭ*/(int var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IFozaPrivacyObserver");
                     var2.writeInt(var1);
                     this.ԭ.transact(2, var2, var3, 0);
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

         public void _/* $FF was: Ԭ*/() throws RemoteException {
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
                     var1.writeInterfaceToken("lu.die.fozalib.IFozaPrivacyObserver");
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

         public int _/* $FF was: ԩ*/() throws RemoteException {
            Parcel var1 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var2;
            Parcel var10001 = var2 = var10000;

            int var11;
            label68: {
               Throwable var9;
               label72: {
                  boolean var10;
                  try {
                     var1.writeInterfaceToken("lu.die.fozalib.IFozaPrivacyObserver");
                     this.ԭ.transact(4, var1, var2, 0);
                  } catch (Throwable var8) {
                     var9 = var8;
                     var10 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var11 = var10000.readInt();
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

         public void _/* $FF was: ԫ*/() throws RemoteException {
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
                     var1.writeInterfaceToken("lu.die.fozalib.IFozaPrivacyObserver");
                     this.ԭ.transact(5, var1, var2, 0);
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

         public ࣁ _/* $FF was: ԫ*/(int var1) throws RemoteException {
            Parcel var2 = Parcel.obtain();
            Parcel var10000 = Parcel.obtain();
            Parcel var3;
            Parcel var10001 = var3 = var10000;

            ࣁ var13;
            label68: {
               Throwable var11;
               label72: {
                  boolean var12;
                  try {
                     var2.writeInterfaceToken("lu.die.fozalib.IFozaPrivacyObserver");
                     var2.writeInt(var1);
                     this.ԭ.transact(6, var2, var3, 0);
                  } catch (Throwable var9) {
                     var11 = var9;
                     var12 = false;
                     break label72;
                  }

                  label63:
                  try {
                     var10001.readException();
                     var13 = (ࣁ)ຘ.Ԫ.Ԩ(var10000, ࣁ.CREATOR);
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

         public String _/* $FF was: Ԫ*/(String var1) throws RemoteException {
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
                     var2.writeInterfaceToken("lu.die.fozalib.IFozaPrivacyObserver");
                     var2.writeString(var1);
                     this.ԭ.transact(7, var2, var3, 0);
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
      }
   }

   public static class Ϳ implements ຘ {
      public boolean _/* $FF was: Ϳ*/(String var1, String var2, String var3) throws RemoteException {
         return false;
      }

      public void _/* $FF was: ԭ*/(int var1) throws RemoteException {
      }

      public void _/* $FF was: Ԭ*/() throws RemoteException {
      }

      public int _/* $FF was: ԩ*/() throws RemoteException {
         return 0;
      }

      public void _/* $FF was: ԫ*/() throws RemoteException {
      }

      public ࣁ _/* $FF was: ԫ*/(int var1) throws RemoteException {
         return null;
      }

      public String _/* $FF was: Ԫ*/(String var1) throws RemoteException {
         return null;
      }

      public IBinder asBinder() {
         return null;
      }
   }
}
