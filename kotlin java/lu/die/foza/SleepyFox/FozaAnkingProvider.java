package lu.die.foza.SleepyFox;

import android.content.AttributionSource;
import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.AttributionSource.Builder;
import android.content.ContentProvider.PipeDataWriter;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J1\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0015J;\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0017JY\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aJ=\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0002\u0010\u001dJ&\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016J&\u0010\"\u001a\u00020#2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J%\u0010$\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\tH\u0016¢\u0006\u0002\u0010%J\u001a\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0016J$\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0016J$\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016J%\u0010,\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\nH\u0016¢\u0006\u0002\u0010.J$\u0010/\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u001cH\u0016J.\u0010/\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u001c2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016JE\u00101\u001a\u00020'\"\u0004\b\u0000\u001022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00103\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u001c2\b\u00104\u001a\u0004\u0018\u0001H22\f\u00105\u001a\b\u0012\u0004\u0012\u0002H206H\u0016¢\u0006\u0002\u00107J.\u00108\u001a\u0004\u0018\u00010\u001c2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J&\u00108\u001a\u0004\u0018\u00010\u001c2\u0006\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016J5\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\t2\u0006\u00109\u001a\u00020\n2\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020B0Cj\b\u0012\u0004\u0012\u00020B`AH\u0017¢\u0006\u0002\u0010DJ-\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\t2\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020B0Cj\b\u0012\u0004\u0012\u00020B`AH\u0016¢\u0006\u0002\u0010ER\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070=X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"},
   d2 = {"Llu/die/foza/SleepyFox/FozaAnkingProvider;", "Llu/die/foza/SleepyFox/FozaStubProvider;", "<init>", "()V", "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", "values", "Landroid/content/ContentValues;", "delete", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "queryArgs", "Landroid/os/Bundle;", "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "extras", "canonicalize", "url", "uncanonicalize", "refresh", "", "bulkInsert", "(Landroid/net/Uri;[Landroid/content/ContentValues;)I", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "signal", "openAssetFile", "Landroid/content/res/AssetFileDescriptor;", "getStreamTypes", "mimeTypeFilter", "(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;", "openTypedAssetFile", "opts", "openPipeHelper", "T", "mimeType", "args", "func", "Landroid/content/ContentProvider$PipeDataWriter;", "(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;Landroid/content/ContentProvider$PipeDataWriter;)Landroid/os/ParcelFileDescriptor;", "call", "authority", "method", "arg", "mUriField", "Llu/die/foza/HookEntity/Reflection/FozaReflectionField;", "applyBatch", "Landroid/content/ContentProviderResult;", "operations", "Lkotlin/collections/ArrayList;", "Landroid/content/ContentProviderOperation;", "Ljava/util/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "Manager", "foza_release"}
)
public class FozaAnkingProvider extends FozaStubProvider {
   @NotNull
   public final ૹ<Uri> ՠ;

   public FozaAnkingProvider() {
      FozaAnkingProvider var10000 = this;
      super();
      ૹ var1;
      var1 = new ૹ.<init>("mUri");
      var10000.ՠ = var1;
   }

   @Nullable
   public Cursor query(@NotNull Uri var1, @Nullable String[] var2, @Nullable String var3, @Nullable String[] var4, @Nullable String var5) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var8) {
         var10001 = false;
         return null;
      }

      Pair var9 = var10000;
      Cursor var10;
      if (var10000 != null) {
         Uri var11;
         try {
            var11 = (Uri)var9.getFirst();
         } catch (Exception var7) {
            var10001 = false;
            return null;
         }

         var1 = var11;
         if (var11 != null) {
            Cursor var12;
            try {
               var12 = ((ContentProvider)var9.getSecond()).query(var1, var2, var3, var4, var5);
            } catch (Exception var6) {
               var10001 = false;
               return null;
            }

            var10 = var12;
            return var10;
         }
      }

      var10 = null;
      return var10;
   }

   @Nullable
   public String getType(@NotNull Uri var1) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var4) {
         var10001 = false;
         return null;
      }

      Pair var5 = var10000;
      String var6;
      if (var10000 != null) {
         Uri var7;
         try {
            var7 = (Uri)var5.getFirst();
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }

         var1 = var7;
         if (var7 != null) {
            String var8;
            try {
               var8 = ((ContentProvider)var5.getSecond()).getType(var1);
            } catch (Exception var2) {
               var10001 = false;
               return null;
            }

            var6 = var8;
            return var6;
         }
      }

      var6 = null;
      return var6;
   }

   @Nullable
   public Uri insert(@NotNull Uri var1, @Nullable ContentValues var2) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var5) {
         var10001 = false;
         return null;
      }

      Pair var6 = var10000;
      Uri var7;
      if (var10000 != null) {
         Uri var8;
         try {
            var8 = (Uri)var6.getFirst();
         } catch (Exception var4) {
            var10001 = false;
            return null;
         }

         var1 = var8;
         if (var8 != null) {
            try {
               var8 = ((ContentProvider)var6.getSecond()).insert(var1, var2);
            } catch (Exception var3) {
               var10001 = false;
               return null;
            }

            var7 = var8;
            return var7;
         }
      }

      var7 = null;
      return var7;
   }

   public int delete(@NotNull Uri var1, @Nullable String var2, @Nullable String[] var3) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return 0;
      }

      Pair var7 = var10000;
      int var8;
      if (var10000 != null) {
         Uri var9;
         try {
            var9 = (Uri)var7.getFirst();
         } catch (Exception var5) {
            var10001 = false;
            return 0;
         }

         var1 = var9;
         if (var9 != null) {
            int var10;
            try {
               var10 = ((ContentProvider)var7.getSecond()).delete(var1, var2, var3);
            } catch (Exception var4) {
               var10001 = false;
               return 0;
            }

            var8 = var10;
            return var8;
         }
      }

      var8 = 0;
      return var8;
   }

   public int update(@NotNull Uri var1, @Nullable ContentValues var2, @Nullable String var3, @Nullable String[] var4) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var7) {
         var10001 = false;
         return 0;
      }

      Pair var8 = var10000;
      int var9;
      if (var10000 != null) {
         Uri var10;
         try {
            var10 = (Uri)var8.getFirst();
         } catch (Exception var6) {
            var10001 = false;
            return 0;
         }

         var1 = var10;
         if (var10 != null) {
            int var11;
            try {
               var11 = ((ContentProvider)var8.getSecond()).update(var1, var2, var3, var4);
            } catch (Exception var5) {
               var10001 = false;
               return 0;
            }

            var9 = var11;
            return var9;
         }
      }

      var9 = 0;
      return var9;
   }

   @Nullable
   public Cursor query(@NotNull Uri var1, @Nullable String[] var2, @Nullable String var3, @Nullable String[] var4, @Nullable String var5, @Nullable CancellationSignal var6) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var9) {
         var10001 = false;
         return null;
      }

      Pair var10 = var10000;
      Cursor var11;
      if (var10000 != null) {
         Uri var12;
         try {
            var12 = (Uri)var10.getFirst();
         } catch (Exception var8) {
            var10001 = false;
            return null;
         }

         var1 = var12;
         if (var12 != null) {
            Cursor var13;
            try {
               var13 = ((ContentProvider)var10.getSecond()).query(var1, var2, var3, var4, var5, var6);
            } catch (Exception var7) {
               var10001 = false;
               return null;
            }

            var11 = var13;
            return var11;
         }
      }

      var11 = null;
      return var11;
   }

   @RequiresApi(26)
   @Nullable
   public Cursor query(@NotNull Uri var1, @Nullable String[] var2, @Nullable Bundle var3, @Nullable CancellationSignal var4) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var7) {
         var10001 = false;
         return null;
      }

      Pair var8 = var10000;
      Cursor var9;
      if (var10000 != null) {
         Uri var10;
         try {
            var10 = (Uri)var8.getFirst();
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         var1 = var10;
         if (var10 != null) {
            Cursor var11;
            try {
               var11 = ((ContentProvider)var8.getSecond()).query(var1, var2, var3, var4);
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            var9 = var11;
            return var9;
         }
      }

      var9 = null;
      return var9;
   }

   @RequiresApi(30)
   @Nullable
   public Uri insert(@NotNull Uri var1, @Nullable ContentValues var2, @Nullable Bundle var3) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }

      Pair var7 = var10000;
      Uri var8;
      if (var10000 != null) {
         Uri var9;
         try {
            var9 = (Uri)var7.getFirst();
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }

         var1 = var9;
         if (var9 != null) {
            try {
               var9 = ((ContentProvider)var7.getSecond()).insert(var1, var2, var3);
            } catch (Exception var4) {
               var10001 = false;
               return null;
            }

            var8 = var9;
            return var8;
         }
      }

      var8 = null;
      return var8;
   }

   @RequiresApi(30)
   public int delete(@NotNull Uri var1, @Nullable Bundle var2) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var5) {
         var10001 = false;
         return 0;
      }

      Pair var6 = var10000;
      int var7;
      if (var10000 != null) {
         Uri var8;
         try {
            var8 = (Uri)var6.getFirst();
         } catch (Exception var4) {
            var10001 = false;
            return 0;
         }

         var1 = var8;
         if (var8 != null) {
            int var9;
            try {
               var9 = ((ContentProvider)var6.getSecond()).delete(var1, var2);
            } catch (Exception var3) {
               var10001 = false;
               return 0;
            }

            var7 = var9;
            return var7;
         }
      }

      var7 = 0;
      return var7;
   }

   @RequiresApi(30)
   public int update(@NotNull Uri var1, @Nullable ContentValues var2, @Nullable Bundle var3) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return 0;
      }

      Pair var7 = var10000;
      int var8;
      if (var10000 != null) {
         Uri var9;
         try {
            var9 = (Uri)var7.getFirst();
         } catch (Exception var5) {
            var10001 = false;
            return 0;
         }

         var1 = var9;
         if (var9 != null) {
            int var10;
            try {
               var10 = ((ContentProvider)var7.getSecond()).update(var1, var2, var3);
            } catch (Exception var4) {
               var10001 = false;
               return 0;
            }

            var8 = var10;
            return var8;
         }
      }

      var8 = 0;
      return var8;
   }

   @Nullable
   public Uri canonicalize(@NotNull Uri var1) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var4) {
         var10001 = false;
         return null;
      }

      Pair var5 = var10000;
      Uri var6;
      if (var10000 != null) {
         Uri var7;
         try {
            var7 = (Uri)var5.getFirst();
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }

         var1 = var7;
         if (var7 != null) {
            try {
               var7 = ((ContentProvider)var5.getSecond()).canonicalize(var1);
            } catch (Exception var2) {
               var10001 = false;
               return null;
            }

            var6 = var7;
            return var6;
         }
      }

      var6 = null;
      return var6;
   }

   @Nullable
   public Uri uncanonicalize(@NotNull Uri var1) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var4) {
         var10001 = false;
         return null;
      }

      Pair var5 = var10000;
      Uri var6;
      if (var10000 != null) {
         Uri var7;
         try {
            var7 = (Uri)var5.getFirst();
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }

         var1 = var7;
         if (var7 != null) {
            try {
               var7 = ((ContentProvider)var5.getSecond()).uncanonicalize(var1);
            } catch (Exception var2) {
               var10001 = false;
               return null;
            }

            var6 = var7;
            return var6;
         }
      }

      var6 = null;
      return var6;
   }

   @RequiresApi(26)
   public boolean refresh(@Nullable Uri var1, @Nullable Bundle var2, @Nullable CancellationSignal var3) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return false;
      }

      Pair var7 = var10000;
      boolean var8;
      if (var10000 != null) {
         Uri var9;
         try {
            var9 = (Uri)var7.getFirst();
         } catch (Exception var5) {
            var10001 = false;
            return false;
         }

         var1 = var9;
         if (var9 != null) {
            boolean var10;
            try {
               var10 = ((ContentProvider)var7.getSecond()).refresh(var1, var2, var3);
            } catch (Exception var4) {
               var10001 = false;
               return false;
            }

            var8 = var10;
            return var8;
         }
      }

      var8 = false;
      return var8;
   }

   public int bulkInsert(@NotNull Uri var1, @NotNull ContentValues[] var2) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var5) {
         var10001 = false;
         return 0;
      }

      Pair var6 = var10000;
      int var7;
      if (var10000 != null) {
         Uri var8;
         try {
            var8 = (Uri)var6.getFirst();
         } catch (Exception var4) {
            var10001 = false;
            return 0;
         }

         var1 = var8;
         if (var8 != null) {
            int var9;
            try {
               var9 = ((ContentProvider)var6.getSecond()).bulkInsert(var1, var2);
            } catch (Exception var3) {
               var10001 = false;
               return 0;
            }

            var7 = var9;
            return var7;
         }
      }

      var7 = 0;
      return var7;
   }

   @Nullable
   public ParcelFileDescriptor openFile(@NotNull Uri var1, @NotNull String var2) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var5) {
         var10001 = false;
         return null;
      }

      Pair var6 = var10000;
      ParcelFileDescriptor var7;
      if (var10000 != null) {
         Uri var8;
         try {
            var8 = (Uri)var6.getFirst();
         } catch (Exception var4) {
            var10001 = false;
            return null;
         }

         var1 = var8;
         if (var8 != null) {
            ParcelFileDescriptor var9;
            try {
               var9 = ((ContentProvider)var6.getSecond()).openFile(var1, var2);
            } catch (Exception var3) {
               var10001 = false;
               return null;
            }

            var7 = var9;
            return var7;
         }
      }

      var7 = null;
      return var7;
   }

   @Nullable
   public ParcelFileDescriptor openFile(@NotNull Uri var1, @NotNull String var2, @Nullable CancellationSignal var3) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }

      Pair var7 = var10000;
      ParcelFileDescriptor var8;
      if (var10000 != null) {
         Uri var9;
         try {
            var9 = (Uri)var7.getFirst();
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }

         var1 = var9;
         if (var9 != null) {
            ParcelFileDescriptor var10;
            try {
               var10 = ((ContentProvider)var7.getSecond()).openFile(var1, var2, var3);
            } catch (Exception var4) {
               var10001 = false;
               return null;
            }

            var8 = var10;
            return var8;
         }
      }

      var8 = null;
      return var8;
   }

   @Nullable
   public AssetFileDescriptor openAssetFile(@NotNull Uri var1, @NotNull String var2) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var5) {
         var10001 = false;
         return null;
      }

      Pair var6 = var10000;
      AssetFileDescriptor var7;
      if (var10000 != null) {
         Uri var8;
         try {
            var8 = (Uri)var6.getFirst();
         } catch (Exception var4) {
            var10001 = false;
            return null;
         }

         var1 = var8;
         if (var8 != null) {
            AssetFileDescriptor var9;
            try {
               var9 = ((ContentProvider)var6.getSecond()).openAssetFile(var1, var2);
            } catch (Exception var3) {
               var10001 = false;
               return null;
            }

            var7 = var9;
            return var7;
         }
      }

      var7 = null;
      return var7;
   }

   @Nullable
   public AssetFileDescriptor openAssetFile(@NotNull Uri var1, @NotNull String var2, @Nullable CancellationSignal var3) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }

      Pair var7 = var10000;
      AssetFileDescriptor var8;
      if (var10000 != null) {
         Uri var9;
         try {
            var9 = (Uri)var7.getFirst();
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }

         var1 = var9;
         if (var9 != null) {
            AssetFileDescriptor var10;
            try {
               var10 = ((ContentProvider)var7.getSecond()).openAssetFile(var1, var2, var3);
            } catch (Exception var4) {
               var10001 = false;
               return null;
            }

            var8 = var10;
            return var8;
         }
      }

      var8 = null;
      return var8;
   }

   @Nullable
   public String[] getStreamTypes(@NotNull Uri var1, @NotNull String var2) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var5) {
         var10001 = false;
         return ބ.Ԫ.Ԫ;
      }

      Pair var6 = var10000;
      String[] var7;
      if (var10000 != null) {
         Uri var8;
         try {
            var8 = (Uri)var6.getFirst();
         } catch (Exception var4) {
            var10001 = false;
            return ބ.Ԫ.Ԫ;
         }

         var1 = var8;
         if (var8 != null) {
            String[] var9;
            try {
               var9 = ((ContentProvider)var6.getSecond()).getStreamTypes(var1, var2);
            } catch (Exception var3) {
               var10001 = false;
               return ބ.Ԫ.Ԫ;
            }

            var7 = var9;
            return var7;
         }
      }

      var7 = null;
      return var7;
   }

   @Nullable
   public AssetFileDescriptor openTypedAssetFile(@NotNull Uri var1, @NotNull String var2, @Nullable Bundle var3) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }

      Pair var7 = var10000;
      AssetFileDescriptor var8;
      if (var10000 != null) {
         Uri var9;
         try {
            var9 = (Uri)var7.getFirst();
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }

         var1 = var9;
         if (var9 != null) {
            AssetFileDescriptor var10;
            try {
               var10 = ((ContentProvider)var7.getSecond()).openTypedAssetFile(var1, var2, var3);
            } catch (Exception var4) {
               var10001 = false;
               return null;
            }

            var8 = var10;
            return var8;
         }
      }

      var8 = null;
      return var8;
   }

   @Nullable
   public AssetFileDescriptor openTypedAssetFile(@NotNull Uri var1, @NotNull String var2, @Nullable Bundle var3, @Nullable CancellationSignal var4) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var7) {
         var10001 = false;
         return null;
      }

      Pair var8 = var10000;
      AssetFileDescriptor var9;
      if (var10000 != null) {
         Uri var10;
         try {
            var10 = (Uri)var8.getFirst();
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         var1 = var10;
         if (var10 != null) {
            AssetFileDescriptor var11;
            try {
               var11 = ((ContentProvider)var8.getSecond()).openTypedAssetFile(var1, var2, var3, var4);
            } catch (Exception var5) {
               var10001 = false;
               return null;
            }

            var9 = var11;
            return var9;
         }
      }

      var9 = null;
      return var9;
   }

   @NotNull
   public <T> ParcelFileDescriptor openPipeHelper(@NotNull Uri var1, @NotNull String var2, @Nullable Bundle var3, @Nullable T var4, @NotNull PipeDataWriter<T> var5) {
      Pair var10000;
      boolean var10001;
      try {
         var10000 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var1);
      } catch (Exception var10) {
         var10001 = false;
         return new ParcelFileDescriptor((ParcelFileDescriptor)null);
      }

      Pair var11 = var10000;
      ParcelFileDescriptor var12;
      ParcelFileDescriptor var14;
      if (var10000 != null) {
         Uri var13;
         try {
            var13 = (Uri)var11.getFirst();
         } catch (Exception var9) {
            var10001 = false;
            return new ParcelFileDescriptor((ParcelFileDescriptor)null);
         }

         var1 = var13;
         if (var13 != null) {
            try {
               var14 = ((ContentProvider)var11.getSecond()).openPipeHelper(var1, var2, var3, var4, var5);
            } catch (Exception var8) {
               var10001 = false;
               return new ParcelFileDescriptor((ParcelFileDescriptor)null);
            }

            var12 = var14;
            if (var14 != null) {
               return var12;
            }
         }
      }

      try {
         var14 = new ParcelFileDescriptor;
      } catch (Exception var7) {
         var10001 = false;
         return new ParcelFileDescriptor((ParcelFileDescriptor)null);
      }

      var12 = var14;

      try {
         var14.<init>((ParcelFileDescriptor)null);
         return var12;
      } catch (Exception var6) {
         var10001 = false;
         return new ParcelFileDescriptor((ParcelFileDescriptor)null);
      }
   }

   @RequiresApi(29)
   @Nullable
   public Bundle call(@NotNull String param1, @NotNull String param2, @Nullable String param3, @Nullable Bundle param4) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public Bundle call(@NotNull String param1, @Nullable String param2, @Nullable Bundle param3) {
      // $FF: Couldn't be decompiled
   }

   @RequiresApi(29)
   @NotNull
   public ContentProviderResult[] applyBatch(@NotNull String var1, @NotNull ArrayList<ContentProviderOperation> var2) {
      return this.applyBatch(var2);
   }

   @NotNull
   public ContentProviderResult[] applyBatch(@NotNull ArrayList<ContentProviderOperation> var1) {
      ArrayList var10000;
      ContentProviderResult[] var16;
      boolean var10001;
      try {
         var10000 = var1;
         var16 = new ContentProviderResult[var1.size()];
      } catch (Exception var12) {
         var10001 = false;
         return new ContentProviderResult[0];
      }

      ContentProviderResult[] var2 = var16;
      int var3 = 0;

      int var13;
      try {
         var13 = var10000.size();
      } catch (Exception var11) {
         var10001 = false;
         return new ContentProviderResult[0];
      }

      for(int var4 = var13; var3 < var4; ++var3) {
         ContentProviderOperation var14;
         try {
            var14 = (ContentProviderOperation)var1.get(var3);
         } catch (Exception var10) {
            var10001 = false;
            continue;
         }

         ContentProviderOperation var5 = var14;

         Pair var15;
         try {
            var15 = FozaAnkingProvider.Ϳ.Ϳ.Ϳ(var5.getUri());
         } catch (Exception var9) {
            var10001 = false;
            continue;
         }

         Pair var6 = var15;
         if (var15 != null) {
            ContentProviderResult[] var17;
            int var18;
            ContentProviderOperation var10002;
            Pair var10003;
            try {
               var17 = var2;
               var18 = var3;
               var10002 = var5;
               var10003 = var6;
               this.ՠ.Ϳ(var5, var6.getFirst());
               Unit var10004 = Unit.INSTANCE;
            } catch (Exception var8) {
               var10001 = false;
               continue;
            }

            try {
               var17[var18] = var10002.apply((ContentProvider)var10003.getSecond(), var2, var3);
            } catch (Exception var7) {
               var10001 = false;
            }
         }
      }

      return var2;
   }

   public static final class Ϳ {
      @NotNull
      public static final FozaAnkingProvider.Ϳ.Ԭ Ϳ;
      @NotNull
      public static final FozaAnkingProvider.Ϳ Ԩ;
      @NotNull
      public static final String ԩ = "content://";
      @NotNull
      public static final String Ԫ = "content:/";
      @NotNull
      public static final ಀ<Object> ԫ;
      @NotNull
      public static final KFunction<Unit> Ԭ;
      @NotNull
      public static final String ԭ;

      @JvmStatic
      @NotNull
      public static final FozaAnkingProvider.Ϳ _/* $FF was: ԫ*/() {
         Ϳ.getClass();
         return Ԩ();
      }

      static {
         FozaAnkingProvider.Ϳ.Ԭ var0;
         FozaAnkingProvider.Ϳ.Ԭ var10000 = var0 = new FozaAnkingProvider.Ϳ.Ԭ;
         var10000.<init>();
         Ϳ = var10000;
         Ԩ = new FozaAnkingProvider.Ϳ();
         ಀ var1 = new ಀ;
         boolean var2;
         String var3;
         if (var2 = ތ.ށ) {
            var3 = "setCallingAttributionSource";
         } else {
            boolean var6 = ތ.ؠ;
            var3 = "setCallingPackage";
         }

         Class[] var4;
         if (var2) {
            (var4 = new Class[1])[0] = AttributionSource.class;
         } else if (ތ.ؠ) {
            (var4 = new Class[1])[0] = android.util.Pair.class;
         } else {
            (var4 = new Class[1])[0] = String.class;
         }

         var1.<init>(var3, var4);
         ԫ = var1.Ϳ(ContentProvider.class);
         Function2 var5;
         if (var2) {
            var5 = new Function2<ContentProvider, String, Unit>() {
               public final void invoke(ContentProvider var1, String var2) {
                  ((FozaAnkingProvider.Ϳ.Ԭ)super.receiver).ԩ(var1, var2);
               }
            }.<init>(var0);
         } else if (ތ.ؠ) {
            var5 = new Function2<ContentProvider, String, Unit>() {
               public final void invoke(ContentProvider var1, String var2) {
                  ((FozaAnkingProvider.Ϳ.Ԭ)super.receiver).Ԩ(var1, var2);
               }
            }.<init>(var0);
         } else {
            var5 = new Function2<ContentProvider, String, Unit>() {
               public final void invoke(ContentProvider var1, String var2) {
                  ((FozaAnkingProvider.Ϳ.Ԭ)super.receiver).Ϳ(var1, var2);
               }
            }.<init>(var0);
         }

         Ԭ = var5;
         StringBuilder var7 = new StringBuilder();
         ࢦ.Ϳ.getClass();
         ԭ = var7.append(ࢦ.Ԯ).append(".foza.pv.anking").toString();
      }

      public static final class Ԭ {
         public _/* $FF was: Ԭ*/() {
         }

         public static Uri _/* $FF was: Ϳ*/(FozaAnkingProvider.Ϳ.Ԭ var0, Uri var1, int var2, int var3, Object var4) {
            if ((var3 & 2) != 0) {
               ࢦ.Ϳ.getClass();
               var2 = ࢦ.Ԩ;
            }

            return var0.Ϳ(var1, var2);
         }

         // $FF: synthetic method
         public _/* $FF was: Ԭ*/(DefaultConstructorMarker var1) {
            this();
         }

         // $FF: synthetic method
         public static final void _/* $FF was: ԩ*/(FozaAnkingProvider.Ϳ.Ԭ var0, ContentProvider var1, String var2) {
            var0.ԩ(var1, var2);
         }

         // $FF: synthetic method
         public static final void _/* $FF was: Ԩ*/(FozaAnkingProvider.Ϳ.Ԭ var0, ContentProvider var1, String var2) {
            var0.Ԩ(var1, var2);
         }

         // $FF: synthetic method
         public static final void _/* $FF was: Ϳ*/(FozaAnkingProvider.Ϳ.Ԭ var0, ContentProvider var1, String var2) {
            var0.Ϳ(var1, var2);
         }

         @JvmStatic
         @NotNull
         public final FozaAnkingProvider.Ϳ _/* $FF was: Ϳ*/() {
            return FozaAnkingProvider.Ϳ.Ԩ;
         }

         @Nullable
         public final Pair<Uri, ContentProvider> _/* $FF was: Ϳ*/(@Nullable Uri var1) {
            String var20 = "content://";
            if (var1 == null) {
               return null;
            } else {
               List var10000;
               boolean var10001;
               try {
                  var10000 = var1.getPathSegments();
               } catch (Exception var19) {
                  var10001 = false;
                  return null;
               }

               List var2 = var10000;

               int var28;
               try {
                  var28 = var10000.size();
               } catch (Exception var18) {
                  var10001 = false;
                  return null;
               }

               if (var28 < 1) {
                  return null;
               } else {
                  Uri var29;
                  String var31;
                  try {
                     var29 = var1;
                     var31 = (String)var2.get(0);
                  } catch (Exception var17) {
                     var10001 = false;
                     return null;
                  }

                  String var24 = var31;
                  byte var3 = 12;

                  int var33;
                  try {
                     var33 = var31.length();
                  } catch (Exception var16) {
                     var10001 = false;
                     return null;
                  }

                  int var26 = var33 + var3;

                  String var30;
                  try {
                     var30 = var29.getAuthority();
                  } catch (Exception var15) {
                     var10001 = false;
                     return null;
                  }

                  String var4 = var30;
                  int var27;
                  if (var30 != null) {
                     try {
                        var28 = var4.length();
                     } catch (Exception var14) {
                        var10001 = false;
                        return null;
                     }

                     var27 = var28;
                  } else {
                     var27 = 0;
                  }

                  var29 = var1;
                  int var22 = var26 + var27;

                  try {
                     var30 = var29.toString().substring(var22);
                  } catch (Exception var13) {
                     var10001 = false;
                     return null;
                  }

                  String var23;
                  var31 = var23 = var30;

                  boolean var32;
                  try {
                     Intrinsics.checkNotNullExpressionValue(var31, "substring(...)");
                     var32 = StringsKt.startsWith$default(var30, "content:/", false, 2, (Object)null);
                  } catch (Exception var12) {
                     var10001 = false;
                     return null;
                  }

                  if (var32) {
                     try {
                        var32 = StringsKt.startsWith$default(var23, "content://", false, 2, (Object)null);
                     } catch (Exception var11) {
                        var10001 = false;
                        return null;
                     }

                     if (!var32) {
                        StringBuilder var34;
                        try {
                           var34 = new StringBuilder;
                        } catch (Exception var10) {
                           var10001 = false;
                           return null;
                        }

                        StringBuilder var36 = var34;

                        try {
                           var36.<init>(var20);
                           var31 = var23.substring(9);
                           Intrinsics.checkNotNullExpressionValue(var31, "substring(...)");
                           var30 = var34.append(var31).toString();
                        } catch (Exception var9) {
                           var10001 = false;
                           return null;
                        }

                        var23 = var30;
                     }
                  }

                  try {
                     var29 = Uri.parse(var23);
                  } catch (Exception var8) {
                     var10001 = false;
                     return null;
                  }

                  Uri var21 = var29;

                  ContentProvider var35;
                  try {
                     var35 = FozaStubProvider.Ϳ.Ϳ(var21);
                  } catch (Exception var7) {
                     var10001 = false;
                     return null;
                  }

                  ContentProvider var25 = var35;
                  if (var35 != null) {
                     try {
                        ((Function2)FozaAnkingProvider.Ϳ.Ԭ).invoke(var25, var24);
                     } catch (Exception var6) {
                        var10001 = false;
                        return null;
                     }

                     try {
                        return new Pair(var21, var25);
                     } catch (Exception var5) {
                        var10001 = false;
                     }
                  }

                  return null;
               }
            }
         }

         @NotNull
         public final Bundle _/* $FF was: Ϳ*/(@NotNull String var1, @Nullable Bundle var2) {
            Bundle var10000 = new Bundle;
            Bundle var10001 = var10000;
            Bundle var4;
            Bundle var10002 = var4 = var10000;
            var10000.<init>();

            try {
               var10002.putBundle("key_launching_type", var2);
               var10001.putString("foza_key_authority", var1);
               var10000.putString("key_launch_target_package_name", ࢦ.Ϳ.ԩ());
            } catch (Exception var3) {
            }

            return var4;
         }

         @Nullable
         public final Triple<String, ContentProvider, Bundle> _/* $FF was: Ϳ*/(@Nullable Bundle var1) {
            if (var1 != null) {
               String var10000;
               boolean var10001;
               try {
                  var10000 = var1.getString("foza_key_authority");
               } catch (Exception var10) {
                  var10001 = false;
                  return null;
               }

               String var11 = var10000;

               Bundle var16;
               String var10002;
               try {
                  var16 = var1;
                  var10002 = var1.getString("key_launch_target_package_name");
               } catch (Exception var9) {
                  var10001 = false;
                  return null;
               }

               String var12 = var10002;

               try {
                  var16 = var16.getBundle("key_launching_type");
               } catch (Exception var8) {
                  var10001 = false;
                  return null;
               }

               Bundle var2 = var16;
               if (var10000 != null) {
                  ContentProvider var14;
                  try {
                     var14 = FozaStubProvider.Ϳ.Ϳ(var11);
                  } catch (Exception var7) {
                     var10001 = false;
                     return null;
                  }

                  ContentProvider var3 = var14;
                  Triple var13;
                  if (var14 != null) {
                     try {
                        ((Function2)FozaAnkingProvider.Ϳ.Ԭ).invoke(var3, var12);
                     } catch (Exception var6) {
                        var10001 = false;
                        return null;
                     }

                     Triple var15;
                     try {
                        var15 = new Triple;
                     } catch (Exception var5) {
                        var10001 = false;
                        return null;
                     }

                     var13 = var15;

                     try {
                        var15.<init>(var11, var3, var2);
                     } catch (Exception var4) {
                        var10001 = false;
                        return null;
                     }
                  } else {
                     var13 = null;
                  }

                  return var13;
               }
            }

            return null;
         }

         @Nullable
         public final Uri _/* $FF was: Ԩ*/(@NotNull Uri var1) {
            if (!ތ.ԫ) {
               return var1;
            } else {
               String var2;
               if ((var2 = var1.getEncodedPath()) != null && StringsKt.indexOf$default(var2, "//", 0, false, 6, (Object)null) != -1) {
                  var1 = var1.buildUpon().encodedPath((new Regex("//+")).replace(var2, "/")).build();
               }

               return var1;
            }
         }

         @Nullable
         public final Uri _/* $FF was: Ϳ*/(@Nullable Uri var1, int var2) {
            String var3 = "content://";
            if (var1 != null) {
               FozaAnkingProvider.Ϳ.Ԭ var10000;
               boolean var10001;
               StringBuilder var7;
               try {
                  var10000 = this;
                  var7 = new StringBuilder;
               } catch (Exception var6) {
                  var10001 = false;
                  return var1;
               }

               StringBuilder var4 = var7;

               try {
                  var4.<init>(var3);
                  return var10000.Ԩ(Uri.parse(var7.append(this.Ϳ(var2)).append('/').append(ࢦ.Ϳ.ԩ()).append('/').append(var1).toString()));
               } catch (Exception var5) {
                  var10001 = false;
               }
            }

            return var1;
         }

         @NotNull
         public final String _/* $FF was: Ϳ*/(int var1) {
            return FozaAnkingProvider.Ϳ.ԭ + var1;
         }

         public final boolean _/* $FF was: Ϳ*/(@Nullable String var1) {
            boolean var3;
            if (var1 != null) {
               boolean var10000;
               try {
                  var10000 = StringsKt.startsWith$default(var1, FozaAnkingProvider.Ϳ.ԭ, false, 2, (Object)null);
               } catch (Exception var2) {
                  return false;
               }

               var3 = var10000;
            } else {
               var3 = false;
            }

            return var3;
         }

         @RequiresApi(31)
         public final void _/* $FF was: ԩ*/(ContentProvider var1, String var2) {
            ಀ var10000;
            boolean var10001;
            Object[] var10002;
            ContentProvider var6;
            try {
               var10000 = FozaAnkingProvider.Ϳ.ԫ;
               var6 = var1;
               var10002 = new Object[1];
            } catch (Exception var5) {
               var10001 = false;
               return;
            }

            Object[] var10003 = var10002;
            byte var10004 = 0;

            Builder var10005;
            try {
               var10005 = new Builder;
            } catch (Exception var4) {
               var10001 = false;
               return;
            }

            Builder var10006 = var10005;

            try {
               var10006.<init>(ၡ.Ϳ.Ϳ());
               var10003[var10004] = var10005.setPackageName(var2).build();
               var10000.Ϳ(var6, var10002);
            } catch (Exception var3) {
               var10001 = false;
            }

         }

         public final void _/* $FF was: Ԩ*/(ContentProvider param1, String param2) {
            // $FF: Couldn't be decompiled
         }

         public final void _/* $FF was: Ϳ*/(ContentProvider param1, String param2) {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
