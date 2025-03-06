package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import org.jetbrains.annotations.NotNull;

public final class ࢣ {
   @NotNull
   public static final ࢣ Ϳ = new ࢣ();
   @NotNull
   public static final ૹ<ActivityInfo> Ԩ;

   static {
      ૹ var0;
      ૹ var10000 = var0 = new ૹ;
      var10000.<init>("mActivityInfo");

      try {
         var10000.Ϳ(Activity.class);
      } catch (Exception var1) {
      }

      Ԩ = var0;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final Bitmap _/* $FF was: Ϳ*/(Drawable var1) {
      Bitmap var4;
      if (var1 instanceof BitmapDrawable) {
         var4 = ((BitmapDrawable)var1).getBitmap();
      } else if (var1 instanceof NinePatchDrawable) {
         NinePatchDrawable var10000 = (NinePatchDrawable)var1;
         NinePatchDrawable var5;
         NinePatchDrawable var10001 = var5 = (NinePatchDrawable)var1;
         int var6 = var10000.getIntrinsicWidth();
         int var2 = var10001.getIntrinsicHeight();
         Config var3;
         if (var10000.getOpacity() != -1) {
            var3 = Config.ARGB_8888;
         } else {
            var3 = Config.RGB_565;
         }

         var10000 = var5;
         var10001 = var5;
         NinePatchDrawable var10002 = var5;
         NinePatchDrawable var10003 = var5;
         var4 = Bitmap.createBitmap(var6, var2, var3);
         Canvas var7;
         var7 = new Canvas.<init>(var4);
         var2 = var10003.getIntrinsicWidth();
         int var8 = var10002.getIntrinsicHeight();
         var10001.setBounds(0, 0, var2, var8);
         var10000.draw(var7);
      } else {
         var4 = null;
      }

      return var4;
   }
}
