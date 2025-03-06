package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Service;
import android.content.ContentProvider;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {2, 0, 0},
   k = 1,
   xi = 50,
   d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0010"},
   d2 = {"Llu/die/foza/SleepyFox/FozaAppComponentFactory;", "Landroid/app/AppComponentFactory;", "<init>", "()V", "instantiateActivity", "Landroid/app/Activity;", "cl", "Ljava/lang/ClassLoader;", "className", "", "intent", "Landroid/content/Intent;", "instantiateService", "Landroid/app/Service;", "instantiateProvider", "Landroid/content/ContentProvider;", "foza_release"}
)
@SuppressLint({"NewApi"})
public final class FozaAppComponentFactory extends AppComponentFactory {
   @NotNull
   public Activity instantiateActivity(@NotNull ClassLoader var1, @NotNull String var2, @Nullable Intent var3) {
      Activity var10000;
      Object var5;
      try {
         var10000 = super.instantiateActivity(var1, var2, var3);
      } catch (ClassNotFoundException var4) {
         var5 = new FozaStubActivityGroup.<init>();
         return (Activity)var5;
      }

      var5 = var10000;
      return (Activity)var5;
   }

   @NotNull
   public Service instantiateService(@NotNull ClassLoader var1, @NotNull String var2, @Nullable Intent var3) {
      Service var10000;
      Object var5;
      try {
         var10000 = super.instantiateService(var1, var2, var3);
      } catch (ClassNotFoundException var4) {
         if (StringsKt.startsWith$default(var2, "lu.die.foza.SleepyFox.FozaStubJobService$Companion$FozaStubJobServiceDang", false, 2, (Object)null)) {
            var5 = new FozaStubJobService.Companion.FozaStubJobServiceDang.<init>();
         } else {
            var5 = new FozaStubProcessGroup.<init>();
         }

         return (Service)var5;
      }

      var5 = var10000;
      return (Service)var5;
   }

   @NotNull
   public ContentProvider instantiateProvider(@NotNull ClassLoader var1, @NotNull String var2) {
      ContentProvider var10000;
      Object var4;
      try {
         var10000 = super.instantiateProvider(var1, var2);
      } catch (ClassNotFoundException var3) {
         if (StringsKt.startsWith$default(var2, "lu.die.foza.SleepyFox.FozaAnkingProvider", false, 2, (Object)null)) {
            var4 = new FozaAnkingProvider.<init>();
         } else {
            var4 = new FozaStubProvider.<init>();
         }

         return (ContentProvider)var4;
      }

      var4 = var10000;
      return (ContentProvider)var4;
   }
}
