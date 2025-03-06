package lu.die.foza.SleepyFox;

import android.content.ClipData;
import android.content.IClipboardManagerExt;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import system.ext.loader.core.ExtCreator;
import system.ext.loader.core.ExtRegistry;

public final class ޕ extends lu.die.foza.SleepyFox.Ϳ {
   @NotNull
   public final <undefinedtype> Ԫ;

   public ޕ() {
      ޕ var10000 = this;
      super();
      ໞ var1;
      var1 = new ໞ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            ࢯ.Ԭ.getClass();
            Object var10;
            Object var10000 = var10 = ࢯ.ՠ().Ϳ(var1);
            ࡡ.Ϳ var2;
            (var2 = ࡡ.Ϳ).getClass();
            ࡡ.Ϳ().getClass();

            boolean var10001;
            boolean var12;
            try {
               var12 = var10000 instanceof ClipData;
            } catch (Exception var9) {
               var10001 = false;
               return var10;
            }

            ࡡ var13;
            if (var12) {
               try {
                  var2.getClass();
               } catch (Exception var8) {
                  var10001 = false;
                  return var10;
               }

               try {
                  var13 = ࡡ.Ϳ();
                  ((ClipData)var10).toString();
               } catch (Exception var7) {
                  var10001 = false;
                  return var10;
               }
            } else {
               ClipData var14;
               try {
                  var14 = (ClipData)ރ.Ϳ.Ϳ(var1.ԩ, ClipData.class);
               } catch (Exception var6) {
                  var10001 = false;
                  return var10;
               }

               ClipData var11 = var14;
               if (var14 == null) {
                  return var10;
               }

               try {
                  var2.getClass();
               } catch (Exception var5) {
                  var10001 = false;
                  return var10;
               }

               try {
                  var13 = ࡡ.Ϳ();
                  var11.toString();
               } catch (Exception var4) {
                  var10001 = false;
                  return var10;
               }
            }

            try {
               var13.getClass();
            } catch (Exception var3) {
               var10001 = false;
            }

            return var10;
         }
      }.<init>();
      var10000.Ԫ = var1;
   }

   public static final Object _/* $FF was: Ϳ*/(Object var0, Method var1, Object[] var2) {
      return new ၾ();
   }

   public void _/* $FF was: Ԫ*/() {
      if (!ތ.Ԯ) {
         ࢭ.ֈ.getClass();
         ࢭ.ؠ.post(this::Ԭ);
      } else {
         this.Ԭ();
      }

   }

   public final void _/* $FF was: ԫ*/() {
      if (ތ.ނ) {
         Object var10000 = Proxy.newProxyInstance(IClipboardManagerExt.class.getClassLoader(), new Class[]{ExtCreator.class}, ޕ::Ϳ);
         Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type system.ext.loader.core.ExtCreator<android.content.IClipboardManagerExt>");
         ExtRegistry.registerExt(IClipboardManagerExt.class, (ExtCreator)var10000);
      } else if (ތ.ށ) {
         ˋ var1 = ˋ.Ϳ;
         Object var10001 = ˋ.Ԩ("android.content.ClipboardManagerExtPlugin", "constructor");
         Intrinsics.checkNotNull(var10001);
         var1.Ϳ((Object)var10001, (String)"ctor", (Object)ၾ.class.getConstructor());
      }

   }

   public final void _/* $FF was: Ԭ*/() {
      // $FF: Couldn't be decompiled
   }
}
