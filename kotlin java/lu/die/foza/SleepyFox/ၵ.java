package lu.die.foza.SleepyFox;

import android.die.lu.ZetaBinder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder.DeathRecipient;
import java.io.FileDescriptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ၵ extends ZetaBinder {
   @NotNull
   public static final ၵ.Ϳ ԯ = new ၵ.Ϳ();
   @NotNull
   public static final ಀ<IBinder> ՠ;
   @NotNull
   public final IBinder ԭ;
   @NotNull
   public final ˁ Ԯ;

   public ၵ(@NotNull IBinder var1, @NotNull ˁ var2) {
      this.ԭ = var1;
      this.Ԯ = var2;
   }

   static {
      ಀ var0;
      var0 = new ಀ.<init>("getExtension", (Class[])null, 2, (DefaultConstructorMarker)null);
      if (ތ.ؠ) {
         var0.Ϳ(IBinder.class);
      }

      ՠ = var0;
   }

   @NotNull
   public final ˁ _/* $FF was: Ϳ*/() {
      return this.Ԯ;
   }

   @Nullable
   public String getInterfaceDescriptor() {
      return this.ԭ.getInterfaceDescriptor();
   }

   public boolean pingBinder() {
      return this.ԭ.pingBinder();
   }

   public boolean isBinderAlive() {
      return this.ԭ.isBinderAlive();
   }

   @NotNull
   public IInterface queryLocalInterface(@NotNull String var1) {
      Object var10000 = this.Ԯ.ԩ;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type android.os.IInterface");
      return (IInterface)var10000;
   }

   public void dump(@NotNull FileDescriptor var1, @Nullable String[] var2) {
      this.ԭ.dump(var1, var2);
   }

   public void dumpAsync(@NotNull FileDescriptor var1, @Nullable String[] var2) {
      this.ԭ.dumpAsync(var1, var2);
   }

   public boolean transact(int var1, @NotNull Parcel var2, @Nullable Parcel var3, int var4) {
      return this.ԭ.transact(var1, var2, var3, var4);
   }

   public void linkToDeath(@NotNull DeathRecipient var1, int var2) {
      this.ԭ.linkToDeath(var1, var2);
   }

   public boolean unlinkToDeath(@NotNull DeathRecipient var1, int var2) {
      return this.ԭ.unlinkToDeath(var1, var2);
   }

   @Nullable
   public IBinder getExtension() {
      return (IBinder)ՠ.Ϳ(this.ԭ);
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }
   }
}
