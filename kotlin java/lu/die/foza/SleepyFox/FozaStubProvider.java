package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContentProvider.PipeDataWriter;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 [2\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016JO\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0010JY\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J=\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0002\u0010\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0017J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0017J$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0017J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010'\u001a\u00020\tH\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\t2\u0006\u0010'\u001a\u00020\tH\u0016J&\u0010)\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J%\u0010*\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u000bH\u0016¢\u0006\u0002\u0010+J\u001a\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\fH\u0017J$\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012H\u0017J\u001a\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\fH\u0017J$\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012H\u0017J%\u00102\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u00103\u001a\u00020\fH\u0016¢\u0006\u0002\u00104J$\u00105\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u00103\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0015H\u0017J.\u00105\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u00103\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0012H\u0017JK\u00107\u001a\u00020-\"\n\b\u0000\u00108*\u0004\u0018\u0001092\u0006\u0010\b\u001a\u00020\t2\u0006\u0010:\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u0010;\u001a\u0004\u0018\u0001H82\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H80=H\u0016¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020\u0005H\u0014J\u001c\u0010@\u001a\u00020\u001f2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J5\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u000b2\u0006\u0010G\u001a\u00020\f2\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020J0Kj\b\u0012\u0004\u0012\u00020J`IH\u0016¢\u0006\u0002\u0010LJ-\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u000b2\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020J0Kj\b\u0012\u0004\u0012\u00020J`IH\u0016¢\u0006\u0002\u0010MJ.\u0010N\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010N\u001a\u0004\u0018\u00010\u00152\u0006\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010Q\u001a\u00020\u001fH\u0016J3\u0010R\u001a\u00020\u001f2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010V2\u0010\u0010;\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J1\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010YJ;\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010Z¨\u0006\\"},
   d2 = {"Llu/die/foza/SleepyFox/FozaStubProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "onCreate", "", "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "queryArgs", "Landroid/os/Bundle;", "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "insert", "values", "Landroid/content/ContentValues;", "extras", "delete", "", "update", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "onCallingPackageChanged", "canonicalize", "url", "uncanonicalize", "refresh", "bulkInsert", "(Landroid/net/Uri;[Landroid/content/ContentValues;)I", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "signal", "openAssetFile", "Landroid/content/res/AssetFileDescriptor;", "getStreamTypes", "mimeTypeFilter", "(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;", "openTypedAssetFile", "opts", "openPipeHelper", "T", "", "mimeType", "args", "func", "Landroid/content/ContentProvider$PipeDataWriter;", "(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;Landroid/content/ContentProvider$PipeDataWriter;)Landroid/os/ParcelFileDescriptor;", "isTemporary", "attachInfo", "context", "Landroid/content/Context;", "info", "Landroid/content/pm/ProviderInfo;", "applyBatch", "Landroid/content/ContentProviderResult;", "authority", "operations", "Lkotlin/collections/ArrayList;", "Landroid/content/ContentProviderOperation;", "Ljava/util/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "call", "method", "arg", "shutdown", "dump", "fd", "Ljava/io/FileDescriptor;", "writer", "Ljava/io/PrintWriter;", "(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "getType", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "foza_release"}
)
@SourceDebugExtension({"SMAP\nFozaStubProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaStubProvider.kt\nlu/die/foza/SleepyFox/FozaStubProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1#2:519\n*E\n"})
public class FozaStubProvider extends ContentProvider {
   @NotNull
   public static final FozaStubProvider.Ϳ Ϳ = new FozaStubProvider.Ϳ();
   @NotNull
   public static final Constructor<?> Ԩ;
   @NotNull
   public static final ૹ<ContentProvider> ԩ;
   @NotNull
   public static final String Ԫ;
   @NotNull
   public static final String ԫ = "content://";
   @NotNull
   public static final String Ԭ = "content:/";
   @NotNull
   public static final String ԭ = "file://";
   @NotNull
   public static final String Ԯ = "file:/";
   @NotNull
   public static final String ԯ;

   static {
      ൖ var0;
      var0 = new ൖ.<init>(3);

      Constructor var1;
      while(true) {
         if (!var0.Ԩ()) {
            var1 = Object.class.getConstructor();
            break;
         }

         Throwable var10000;
         label220: {
            boolean var10001;
            Class var23;
            Class[] var24;
            try {
               var23 = Class.forName(ActivityThread.class.getName() + "$ProviderKey");
               var24 = new Class[2];
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label220;
            }

            Class[] var10002 = var24;
            Class[] var10003 = var24;
            byte var10004 = 0;

            try {
               var10003[var10004] = String.class;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label220;
            }

            byte var27 = 1;

            Constructor var25;
            try {
               var10002[var27] = Integer.TYPE;
               var25 = var23.getDeclaredConstructor(var24);
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label220;
            }

            var1 = var25;

            label200:
            try {
               var25.setAccessible(true);
               break;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label200;
            }
         }

         ൎ.Ϳ.Ԫ();
         var10000.toString();
      }

      Ԩ = var1;
      ԩ = new ૹ("mLocalProvider");
      String var22 = ".stub.provider.dang";
      Ԫ = ".stub.provider.dang";
      StringBuilder var26 = new StringBuilder();
      ࢦ.Ϳ.getClass();
      ԯ = var26.append(ࢦ.Ԯ).append(var22).toString();
   }

   public boolean onCreate() {
      return true;
   }

   @Nullable
   public Cursor query(@NotNull Uri var1, @Nullable String[] var2, @Nullable String var3, @Nullable String[] var4, @Nullable String var5) {
      FozaStubProvider.Ϳ var6;
      ContentProvider var7;
      Cursor var8;
      if ((var1 = (var6 = Ϳ).Ԩ(var1)) != null && (var7 = var6.Ϳ(var1)) != null) {
         var8 = var7.query(var1, var2, var3, var4, var5);
      } else {
         var8 = null;
      }

      return var8;
   }

   @Nullable
   public Cursor query(@NotNull Uri var1, @Nullable String[] var2, @Nullable String var3, @Nullable String[] var4, @Nullable String var5, @Nullable CancellationSignal var6) {
      FozaStubProvider.Ϳ var7;
      ContentProvider var8;
      Cursor var9;
      if ((var1 = (var7 = Ϳ).Ԩ(var1)) != null && (var8 = var7.Ϳ(var1)) != null) {
         var9 = var8.query(var1, var2, var3, var4, var5, var6);
      } else {
         var9 = null;
      }

      return var9;
   }

   @RequiresApi(26)
   @Nullable
   public Cursor query(@NotNull Uri var1, @Nullable String[] var2, @Nullable Bundle var3, @Nullable CancellationSignal var4) {
      FozaStubProvider.Ϳ var5;
      ContentProvider var6;
      Cursor var7;
      if ((var1 = (var5 = Ϳ).Ԩ(var1)) != null && (var6 = var5.Ϳ(var1)) != null) {
         var7 = var6.query(var1, var2, var3, var4);
      } else {
         var7 = null;
      }

      return var7;
   }

   @RequiresApi(30)
   @Nullable
   public Uri insert(@NotNull Uri var1, @Nullable ContentValues var2, @Nullable Bundle var3) {
      FozaStubProvider.Ϳ var4;
      ContentProvider var5;
      Uri var6;
      if ((var1 = (var4 = Ϳ).Ԩ(var1)) != null && (var5 = var4.Ϳ(var1)) != null) {
         var6 = var5.insert(var1, var2, var3);
      } else {
         var6 = null;
      }

      return var6;
   }

   @RequiresApi(30)
   public int delete(@NotNull Uri var1, @Nullable Bundle var2) {
      FozaStubProvider.Ϳ var3;
      ContentProvider var4;
      Integer var5;
      if ((var1 = (var3 = Ϳ).Ԩ(var1)) != null && (var4 = var3.Ϳ(var1)) != null) {
         var5 = var4.delete(var1, var2);
      } else {
         var5 = null;
      }

      return var5 != null ? var5 : 0;
   }

   @RequiresApi(30)
   public int update(@NotNull Uri var1, @Nullable ContentValues var2, @Nullable Bundle var3) {
      FozaStubProvider.Ϳ var4;
      ContentProvider var5;
      Integer var6;
      if ((var1 = (var4 = Ϳ).Ԩ(var1)) != null && (var5 = var4.Ϳ(var1)) != null) {
         var6 = var5.update(var1, var2, var3);
      } else {
         var6 = null;
      }

      return var6 != null ? var6 : 0;
   }

   public void onConfigurationChanged(@NotNull Configuration var1) {
      super.onConfigurationChanged(var1);
   }

   public void onLowMemory() {
      super.onLowMemory();
   }

   public void onTrimMemory(int var1) {
      super.onTrimMemory(var1);
   }

   public void onCallingPackageChanged() {
      super.onCallingPackageChanged();
   }

   @Nullable
   public Uri canonicalize(@NotNull Uri var1) {
      return super.canonicalize(var1);
   }

   @Nullable
   public Uri uncanonicalize(@NotNull Uri var1) {
      return super.uncanonicalize(var1);
   }

   @RequiresApi(26)
   public boolean refresh(@Nullable Uri var1, @Nullable Bundle var2, @Nullable CancellationSignal var3) {
      FozaStubProvider.Ϳ var4;
      ContentProvider var5;
      Boolean var6;
      if ((var1 = (var4 = Ϳ).Ԩ(var1)) != null && (var5 = var4.Ϳ(var1)) != null) {
         var6 = var5.refresh(var1, var2, var3);
      } else {
         var6 = null;
      }

      return var6 != null ? var6 : false;
   }

   public int bulkInsert(@NotNull Uri var1, @NotNull ContentValues[] var2) {
      FozaStubProvider.Ϳ var3;
      ContentProvider var4;
      Integer var5;
      if ((var1 = (var3 = Ϳ).Ԩ(var1)) != null && (var4 = var3.Ϳ(var1)) != null) {
         var5 = var4.bulkInsert(var1, var2);
      } else {
         var5 = null;
      }

      return var5 != null ? var5 : 0;
   }

   @RequiresApi(29)
   @Nullable
   public ParcelFileDescriptor openFile(@NotNull Uri var1, @NotNull String var2) {
      FozaStubProvider.Ϳ var3;
      ContentProvider var4;
      ParcelFileDescriptor var5;
      if ((var1 = (var3 = Ϳ).Ԩ(var1)) != null && (var4 = var3.Ϳ(var1)) != null) {
         var5 = var4.openFile(var1, var2, (CancellationSignal)null);
      } else {
         var5 = null;
      }

      return var5;
   }

   @RequiresApi(29)
   @Nullable
   public ParcelFileDescriptor openFile(@NotNull Uri var1, @NotNull String var2, @Nullable CancellationSignal var3) {
      FozaStubProvider.Ϳ var4;
      ContentProvider var5;
      ParcelFileDescriptor var6;
      if ((var1 = (var4 = Ϳ).Ԩ(var1)) != null && (var5 = var4.Ϳ(var1)) != null) {
         var6 = var5.openFile(var1, var2, var3);
      } else {
         var6 = null;
      }

      return var6;
   }

   @RequiresApi(29)
   @Nullable
   public AssetFileDescriptor openAssetFile(@NotNull Uri var1, @NotNull String var2) {
      FozaStubProvider.Ϳ var3;
      ContentProvider var4;
      AssetFileDescriptor var5;
      if ((var1 = (var3 = Ϳ).Ԩ(var1)) != null && (var4 = var3.Ϳ(var1)) != null) {
         var5 = var4.openAssetFile(var1, var2, (CancellationSignal)null);
      } else {
         var5 = null;
      }

      return var5;
   }

   @RequiresApi(29)
   @Nullable
   public AssetFileDescriptor openAssetFile(@NotNull Uri var1, @NotNull String var2, @Nullable CancellationSignal var3) {
      FozaStubProvider.Ϳ var4;
      ContentProvider var5;
      AssetFileDescriptor var6;
      if ((var1 = (var4 = Ϳ).Ԩ(var1)) != null && (var5 = var4.Ϳ(var1)) != null) {
         var6 = var5.openAssetFile(var1, var2, var3);
      } else {
         var6 = null;
      }

      return var6;
   }

   @Nullable
   public String[] getStreamTypes(@NotNull Uri var1, @NotNull String var2) {
      FozaStubProvider.Ϳ var3;
      ContentProvider var4;
      String[] var5;
      if ((var1 = (var3 = Ϳ).Ԩ(var1)) != null && (var4 = var3.Ϳ(var1)) != null) {
         var5 = var4.getStreamTypes(var1, var2);
      } else {
         var5 = null;
      }

      return var5;
   }

   @RequiresApi(29)
   @Nullable
   public AssetFileDescriptor openTypedAssetFile(@NotNull Uri var1, @NotNull String var2, @Nullable Bundle var3) {
      FozaStubProvider.Ϳ var4;
      ContentProvider var5;
      AssetFileDescriptor var6;
      if ((var1 = (var4 = Ϳ).Ԩ(var1)) != null && (var5 = var4.Ϳ(var1)) != null) {
         var6 = var5.openTypedAssetFile(var1, var2, var3, (CancellationSignal)null);
      } else {
         var6 = null;
      }

      return var6;
   }

   @RequiresApi(29)
   @Nullable
   public AssetFileDescriptor openTypedAssetFile(@NotNull Uri var1, @NotNull String var2, @Nullable Bundle var3, @Nullable CancellationSignal var4) {
      FozaStubProvider.Ϳ var5;
      ContentProvider var6;
      AssetFileDescriptor var7;
      if ((var1 = (var5 = Ϳ).Ԩ(var1)) != null && (var6 = var5.Ϳ(var1)) != null) {
         var7 = var6.openTypedAssetFile(var1, var2, var3, var4);
      } else {
         var7 = null;
      }

      return var7;
   }

   @NotNull
   public <T> ParcelFileDescriptor openPipeHelper(@NotNull Uri var1, @NotNull String var2, @Nullable Bundle var3, @Nullable T var4, @NotNull PipeDataWriter<T> var5) {
      return super.openPipeHelper(var1, var2, var3, var4, var5);
   }

   public boolean isTemporary() {
      return super.isTemporary();
   }

   public void attachInfo(@Nullable Context var1, @Nullable ProviderInfo var2) {
      super.attachInfo(var1, var2);
   }

   @NotNull
   public ContentProviderResult[] applyBatch(@NotNull String var1, @NotNull ArrayList<ContentProviderOperation> var2) {
      return super.applyBatch(var1, var2);
   }

   @NotNull
   public ContentProviderResult[] applyBatch(@NotNull ArrayList<ContentProviderOperation> var1) {
      return super.applyBatch(var1);
   }

   @Nullable
   public Bundle call(@NotNull String var1, @NotNull String var2, @Nullable String var3, @Nullable Bundle var4) {
      if (Intrinsics.areEqual(var2, "do_init_process_via_provider")) {
         if (var4 != null) {
            ࢺ.Ϳ.Ϳ(var4);
         }

         Bundle var10000 = new Bundle();
         String var5 = "foza_key_remote_dispatcher";
         ࢭ var6;
         (var6 = ࢭ.ֈ).getClass();
         var10000.putBinder(var5, var6);
         return var10000;
      } else {
         return Bundle.EMPTY;
      }
   }

   @Nullable
   public Bundle call(@NotNull String var1, @Nullable String var2, @Nullable Bundle var3) {
      return this.call("", var1, var2, var3);
   }

   public void shutdown() {
      super.shutdown();
   }

   public void dump(@Nullable FileDescriptor var1, @Nullable PrintWriter var2, @Nullable String[] var3) {
      super.dump(var1, var2, var3);
   }

   @Nullable
   public String getType(@NotNull Uri var1) {
      FozaStubProvider.Ϳ var2;
      ContentProvider var3;
      String var4;
      if ((var1 = (var2 = Ϳ).Ԩ(var1)) != null && (var3 = var2.Ϳ(var1)) != null) {
         var4 = var3.getType(var1);
      } else {
         var4 = null;
      }

      return var4;
   }

   @Nullable
   public Uri insert(@NotNull Uri var1, @Nullable ContentValues var2) {
      FozaStubProvider.Ϳ var3;
      ContentProvider var4;
      Uri var5;
      if ((var1 = (var3 = Ϳ).Ԩ(var1)) != null && (var4 = var3.Ϳ(var1)) != null) {
         var5 = var4.insert(var1, var2);
      } else {
         var5 = null;
      }

      return var5;
   }

   public int delete(@NotNull Uri var1, @Nullable String var2, @Nullable String[] var3) {
      int var10000;
      FozaStubProvider.Ϳ var4;
      if ((var1 = (var4 = Ϳ).Ԩ(var1)) != null) {
         ContentProvider var5;
         Integer var6;
         if ((var5 = var4.Ϳ(var1)) != null) {
            var6 = var5.delete(var1, var2, var3);
         } else {
            var6 = null;
         }

         if (var6 != null) {
            var10000 = var6;
            return var10000;
         }
      }

      var10000 = 0;
      return var10000;
   }

   public int update(@NotNull Uri var1, @Nullable ContentValues var2, @Nullable String var3, @Nullable String[] var4) {
      int var10000;
      FozaStubProvider.Ϳ var5;
      if ((var1 = (var5 = Ϳ).Ԩ(var1)) != null) {
         ContentProvider var6;
         Integer var7;
         if ((var6 = var5.Ϳ(var1)) != null) {
            var7 = var6.update(var1, var2, var3, var4);
         } else {
            var7 = null;
         }

         if (var7 != null) {
            var10000 = var7;
            return var10000;
         }
      }

      var10000 = 0;
      return var10000;
   }

   @SourceDebugExtension({"SMAP\nFozaStubProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaStubProvider.kt\nlu/die/foza/SleepyFox/FozaStubProvider$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1#2:519\n*E\n"})
   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @Nullable
      public final ContentProvider _/* $FF was: Ϳ*/(@NotNull String var1) {
         boolean var10001;
         try {
            ޱ.Ϳ.getClass();
         } catch (Exception var4) {
            var10001 = false;
            return null;
         }

         Object var10000;
         try {
            var10000 = ޱ.Ԫ.get(this.Ԩ(var1));
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }

         Object var5 = var10000;
         ContentProvider var6;
         if (var10000 == null) {
            var6 = null;
            return var6;
         } else {
            ContentProvider var7;
            try {
               var7 = (ContentProvider)FozaStubProvider.ԩ.ԩ(var5);
            } catch (Exception var2) {
               var10001 = false;
               return null;
            }

            var6 = var7;
            return var6;
         }
      }

      @Nullable
      public final Object _/* $FF was: ԩ*/(@NotNull String var1) {
         FozaStubProvider.Ϳ var10000;
         boolean var10001;
         String var6;
         try {
            var10000 = this;
            var6 = var1;
            ޱ.Ϳ.getClass();
         } catch (Exception var4) {
            var10001 = false;
            return null;
         }

         Map var10002;
         try {
            var10002 = ޱ.Ԫ;
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }

         Map var5 = var10002;

         try {
            return TypeIntrinsics.asMutableMap(var5).remove(var10000.Ԩ(var6));
         } catch (Exception var2) {
            var10001 = false;
            return null;
         }
      }

      @Nullable
      public final ContentProvider _/* $FF was: Ϳ*/(@NotNull Uri var1) {
         Uri var10000;
         boolean var10001;
         try {
            var10000 = var1;
            ޱ.Ϳ.getClass();
         } catch (Exception var7) {
            var10001 = false;
            return null;
         }

         Map var16;
         try {
            var16 = ޱ.Ԫ;
         } catch (Exception var6) {
            var10001 = false;
            return null;
         }

         Map var8 = var16;

         String var13;
         try {
            var13 = var10000.getAuthority();
         } catch (Exception var5) {
            var10001 = false;
            return null;
         }

         String var11 = var13;
         Object var12;
         Object var14;
         if (var13 != null) {
            try {
               var14 = FozaStubProvider.Ϳ.Ԩ(var11);
            } catch (Exception var4) {
               var10001 = false;
               return null;
            }

            var12 = var14;
         } else {
            var12 = null;
         }

         try {
            var14 = var8.get(var12);
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }

         Object var9 = var14;
         ContentProvider var10;
         if (var14 == null) {
            var10 = null;
            return var10;
         } else {
            ContentProvider var15;
            try {
               var15 = (ContentProvider)FozaStubProvider.ԩ.ԩ(var9);
            } catch (Exception var2) {
               var10001 = false;
               return null;
            }

            var10 = var15;
            return var10;
         }
      }

      public final boolean _/* $FF was: Ϳ*/(int var1) {
         return var1 == 103772132 || var1 == 320699453 || var1 == 1312704747 || var1 == 1434631203 || var1 == 1734583286 || var1 == 596745902 || var1 == 2106921569;
      }

      @Nullable
      public final Uri _/* $FF was: Ԩ*/(@Nullable Uri var1, int var2) {
         String var3 = "content://";
         String var10000;
         boolean var10001;
         String var4;
         if (var1 != null) {
            try {
               var10000 = var1.getScheme();
            } catch (Exception var14) {
               var10001 = false;
               return var1;
            }

            var4 = var10000;
         } else {
            var4 = null;
         }

         boolean var17;
         try {
            var17 = Intrinsics.areEqual(var4, "content");
         } catch (Exception var13) {
            var10001 = false;
            return var1;
         }

         Uri var18;
         if (!var17) {
            try {
               var18 = var1;
               Objects.toString(var1);
            } catch (Exception var5) {
               var10001 = false;
               return var1;
            }

            return var18;
         } else {
            try {
               var10000 = var1.getAuthority();
            } catch (Exception var12) {
               var10001 = false;
               return var1;
            }

            var4 = var10000;
            int var16;
            if (var10000 != null) {
               int var19;
               try {
                  var19 = var4.hashCode();
               } catch (Exception var11) {
                  var10001 = false;
                  return var1;
               }

               var16 = var19;
            } else {
               var16 = 0;
            }

            try {
               var17 = this.Ϳ(var16);
            } catch (Exception var10) {
               var10001 = false;
               return var1;
            }

            if (var17) {
               try {
                  var18 = var1;
                  var1.toString();
               } catch (Exception var6) {
                  var10001 = false;
                  return var1;
               }

               return var18;
            } else {
               try {
                  var10000 = var1.getAuthority();
               } catch (Exception var9) {
                  var10001 = false;
                  return var1;
               }

               label70: {
                  String var15 = var10000;
                  if (var10000 != null) {
                     try {
                        var17 = StringsKt.startsWith$default(var15, FozaStubProvider.ԯ, false, 2, (Object)null);
                     } catch (Exception var8) {
                        var10001 = false;
                        return var1;
                     }

                     if (var17) {
                        var17 = true;
                        break label70;
                     }
                  }

                  var17 = false;
               }

               if (var17) {
                  return var1;
               } else {
                  try {
                     return FozaAnkingProvider.Ϳ.Ϳ.Ԩ(Uri.parse(var3 + FozaStubProvider.ԯ + var2 + '/' + var1));
                  } catch (Exception var7) {
                     var10001 = false;
                     return var1;
                  }
               }
            }
         }
      }

      @Nullable
      public final Uri _/* $FF was: Ԩ*/(@Nullable Uri var1) {
         ࢦ.Ϳ.getClass();
         return this.Ϳ(var1, ࢦ.Ԩ);
      }

      @Nullable
      public final Uri _/* $FF was: Ϳ*/(@Nullable Uri var1, int var2) {
         String var12 = "content://";
         if (var1 == null) {
            return null;
         } else {
            Uri var10000 = var1;

            boolean var10001;
            int var10002;
            try {
               var10002 = FozaStubProvider.ԯ.length();
            } catch (Exception var11) {
               var10001 = false;
               return null;
            }

            int var10003 = var10002;

            try {
               var10002 = String.valueOf(var2).length();
            } catch (Exception var10) {
               var10001 = false;
               return null;
            }

            int var13 = var10003 + 10 + var10002 + 1;

            String var15;
            try {
               var15 = var10000.toString().substring(var13);
            } catch (Exception var9) {
               var10001 = false;
               return null;
            }

            String var14;
            String var19 = var14 = var15;

            int var16;
            try {
               Intrinsics.checkNotNullExpressionValue(var19, "substring(...)");
               var16 = var15.length();
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }

            if (var16 == 0) {
               return null;
            } else {
               boolean var17;
               try {
                  var17 = StringsKt.startsWith$default(var14, "content:/", false, 2, (Object)null);
               } catch (Exception var7) {
                  var10001 = false;
                  return null;
               }

               if (var17) {
                  try {
                     var17 = StringsKt.startsWith$default(var14, "content://", false, 2, (Object)null);
                  } catch (Exception var6) {
                     var10001 = false;
                     return null;
                  }

                  if (!var17) {
                     StringBuilder var18;
                     try {
                        var18 = new StringBuilder;
                     } catch (Exception var5) {
                        var10001 = false;
                        return null;
                     }

                     StringBuilder var20 = var18;

                     try {
                        var20.<init>(var12);
                        var19 = var14.substring(9);
                        Intrinsics.checkNotNullExpressionValue(var19, "substring(...)");
                        var15 = var18.append(var19).toString();
                     } catch (Exception var4) {
                        var10001 = false;
                        return null;
                     }

                     var14 = var15;
                  }
               }

               try {
                  return Uri.parse(var14);
               } catch (Exception var3) {
                  var10001 = false;
                  return null;
               }
            }
         }
      }

      public final Object _/* $FF was: Ԩ*/(String var1) {
         Constructor var10000;
         boolean var10001;
         Object[] var10002;
         Object[] var5;
         try {
            var10000 = FozaStubProvider.Ԩ;
            var5 = new Object[2];
            var10002 = var5;
            var5[0] = var1;
         } catch (Exception var4) {
            var10001 = false;
            return null;
         }

         byte var10003 = 1;

         try {
            ࢦ.Ϳ.getClass();
         } catch (Exception var3) {
            var10001 = false;
            return null;
         }

         try {
            var10002[var10003] = ࢦ.ՠ;
            return var10000.newInstance(var5);
         } catch (Exception var2) {
            var10001 = false;
            return null;
         }
      }
   }
}
