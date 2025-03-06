package lu.die.foza.SleepyFox;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public final class ၯ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ၯ var10000 = this;
      ၯ var10001 = this;
      String var1 = "$Token";

      boolean var16;
      try {
         ࢯ.Ԭ.getClass();
      } catch (Exception var9) {
         var16 = false;
         return;
      }

      ˁ var13;
      try {
         var10001.Ϳ = ࢯ.ՠ();
         var13 = var10000.Ϳ("media_session");
      } catch (Exception var8) {
         var16 = false;
         return;
      }

      ˁ var2 = var13;
      if (var13 != null) {
         Class var14;
         try {
            var2.Ϳ((String)"createSession", (ໞ)(new ࢯ() {
               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  Object var5 = super.Ϳ(var1);

                  ˁ var10000;
                  boolean var10001;
                  try {
                     var10000 = ৼ.Ϳ.Ϳ(var5);
                  } catch (Exception var4) {
                     var10001 = false;
                     return var5;
                  }

                  ˁ var2 = var10000;
                  if (var10000 == null) {
                     return var5;
                  } else {
                     try {
                        var2.Ϳ((String)"getController", (ໞ)(new ޜ() {
                           public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                              ၯ var2 = ၯ.this;
                              Object var3;
                              return (var3 = var1.Ԫ()) == null ? null : var2.Ϳ(var3);
                           }
                        }));
                        return var2.ԩ;
                     } catch (Exception var3) {
                        var10001 = false;
                        return var5;
                     }
                  }
               }
            }));
            var14 = Class.forName(MediaSession.class.getName().concat(var1));
         } catch (Exception var7) {
            var16 = false;
            return;
         }

         Class var10 = var14;

         Field var15;
         try {
            var15 = var14.getDeclaredField("CREATOR");
         } catch (Exception var6) {
            var16 = false;
            return;
         }

         Field var17 = var15;
         Field var10002 = var15;

         try {
            var10002.setAccessible(true);
            var10002 = var10.getDeclaredField("mBinder");
         } catch (Exception var5) {
            var16 = false;
            return;
         }

         final Field var11 = var10002;

         Creator var19;
         try {
            var10002.setAccessible(true);
            Object var18 = var17.get((Object)null);
            Intrinsics.checkNotNull(var18);
            var19 = (Creator)var18;
         } catch (Exception var4) {
            var16 = false;
            return;
         }

         final Creator var12 = var19;
         var10001 = null;

         try {
            var15.set(var10001, new Creator<Object>() {
               public Object createFromParcel(Parcel var1) {
                  Object var7;
                  if ((var7 = var12.createFromParcel(var1)) != null) {
                     Field var2;
                     Field var10000 = var2 = var11;
                     ၯ var6 = ၯ.this;

                     boolean var10001;
                     Object var8;
                     try {
                        var8 = var10000.get(var7);
                     } catch (Exception var5) {
                        var10001 = false;
                        return var7;
                     }

                     Object var3 = var8;
                     if (var8 != null) {
                        try {
                           var2.set(var7, var6.Ϳ(var3));
                        } catch (Exception var4) {
                           var10001 = false;
                        }
                     }
                  } else {
                     var7 = null;
                  }

                  return var7;
               }

               public Object[] newArray(int var1) {
                  return var12.newArray(var1);
               }
            });
         } catch (Exception var3) {
            var16 = false;
         }

      }
   }

   public final Object _/* $FF was: Ϳ*/(Object var1) {
      ৼ var10000 = ৼ.Ϳ;
      ࢯ.Ԭ.getClass();
      Object var2;
      if ((var2 = var10000.Ԩ(var1, ࢯ.ՠ())) != null) {
         var1 = var2;
      }

      return var1;
   }
}
