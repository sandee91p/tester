package lu.die.foza.SleepyFox;

import android.app.servertransaction.ClientTransaction;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nClientTransactionCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientTransactionCreator.kt\nlu/die/foza/HookEntity/FozaCoreHooker/ClientTransactionCreator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class ޓ implements Creator<ClientTransaction> {
   @NotNull
   public final Creator<ClientTransaction> Ϳ;
   @NotNull
   public final Function1<ClientTransaction, List<?>> Ԩ;

   public ޓ(@NotNull Creator<ClientTransaction> var1) {
      this.Ϳ = var1;
      Object var2;
      if (ތ.ؠ) {
         var2 = null.INSTANCE;
      } else {
         var2 = new Function1<ClientTransaction, List<?>>() {
            public final ಀ<List<?>> Ϳ = (new ಀ("getCallbacks", (Class[])null, 2, (DefaultConstructorMarker)null)).Ϳ(ClientTransaction.class);

            public List<?> _/* $FF was: Ϳ*/(ClientTransaction var1) {
               return (List)this.Ϳ.Ϳ(var1);
            }
         }.<init>();
      }

      this.Ԩ = (Function1)var2;
   }

   @Nullable
   public ClientTransaction _/* $FF was: Ϳ*/(@Nullable Parcel var1) {
      ClientTransaction var2;
      if ((var2 = (ClientTransaction)this.Ϳ.createFromParcel(var1)) != null) {
         this.Ϳ(var2);
      } else {
         var2 = null;
      }

      return var2;
   }

   @NotNull
   public ClientTransaction[] _/* $FF was: Ϳ*/(int var1) {
      return new ClientTransaction[var1];
   }

   public Object[] newArray(int var1) {
      return new ClientTransaction[var1];
   }

   public final void _/* $FF was: Ϳ*/(ClientTransaction param1) {
      // $FF: Couldn't be decompiled
   }
}
