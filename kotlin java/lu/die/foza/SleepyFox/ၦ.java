package lu.die.foza.SleepyFox;

import android.location.GeocoderParams;
import android.location.Location;
import org.jetbrains.annotations.NotNull;

public final class ၦ extends lu.die.foza.SleepyFox.Ϳ {
   @NotNull
   public final <undefinedtype> Ԫ;

   public ၦ() {
      ၦ var10000 = this;
      super();
      ໞ var1;
      var1 = new ໞ() {
         public Object _/* $FF was: Ϳ*/(ࡥ var1) {
            ࢯ.Ԭ.getClass();
            Object var10 = ࢯ.ՠ().Ϳ(var1);

            ࡡ.Ϳ var10000;
            boolean var10001;
            try {
               var10000 = ࡡ.Ϳ;
            } catch (Exception var9) {
               var10001 = false;
               return var10;
            }

            ࡡ.Ϳ var2 = var10000;

            try {
               var10000.getClass();
            } catch (Exception var8) {
               var10001 = false;
               return var10;
            }

            try {
               ࡡ.Ϳ().getClass();
            } catch (Exception var7) {
               var10001 = false;
               return var10;
            }

            Location var12;
            try {
               var12 = (Location)ރ.Ϳ.Ϳ(var1.ԩ, Location.class);
            } catch (Exception var6) {
               var10001 = false;
               return var10;
            }

            Location var11 = var12;
            if (var12 != null) {
               try {
                  var2.getClass();
               } catch (Exception var5) {
                  var10001 = false;
                  return var10;
               }

               ࡡ var13;
               try {
                  var13 = ࡡ.Ϳ();
                  var11.toString();
               } catch (Exception var4) {
                  var10001 = false;
                  return var10;
               }

               try {
                  var13.getClass();
               } catch (Exception var3) {
                  var10001 = false;
               }
            }

            return var10;
         }
      }.<init>();
      var10000.Ԫ = var1;
   }

   public boolean _/* $FF was: Ԩ*/() {
      return true;
   }

   public void _/* $FF was: Ԫ*/() {
      ˁ var10000;
      boolean var10001;
      try {
         super.Ϳ = this.Ԫ;
         var10000 = this.Ϳ("location");
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      ˁ var7 = var10000;
      if (var10000 != null) {
         ໞ var9;
         try {
            var10000 = var7;
            var9 = new ໞ() {
               public final ૹ<Object> Ϳ;

               public {
                  <undefinedtype> var10000 = this;
                  ૹ var1;
                  var10000.Ϳ = var1;
               }

               public final ૹ<Object> _/* $FF was: Ϳ*/() {
                  return this.Ϳ;
               }

               public Object _/* $FF was: Ϳ*/(ࡥ var1) {
                  label116: {
                     GeocoderParams var10000;
                     boolean var10001;
                     try {
                        var10000 = (GeocoderParams)ރ.Ϳ.Ϳ(var1.ԩ, GeocoderParams.class);
                     } catch (Throwable var14) {
                        var10001 = false;
                        break label116;
                     }

                     GeocoderParams var2 = var10000;
                     if (var10000 != null) {
                        label118: {
                           GeocoderParams var16;
                           ૹ var15;
                           try {
                              var15 = this.Ϳ;
                              var16 = var2;
                              ࢦ.Ϳ.getClass();
                           } catch (Throwable var13) {
                              var10001 = false;
                              break label118;
                           }

                           label105:
                           try {
                              var15.Ϳ(var16, ࢦ.Ԯ);
                           } catch (Throwable var12) {
                              var10001 = false;
                              break label105;
                           }
                        }
                     }
                  }

                  ࢯ.Ԭ.getClass();
                  return ࢯ.ՠ().Ϳ(var1);
               }
            };
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         ໞ var8 = var9;

         String[] var10;
         try {
            var9.<init>();
            var10 = new String[2];
         } catch (Exception var4) {
            var10001 = false;
            return;
         }

         String[] var1;
         String[] var10002 = var1 = var10;
         byte var10003 = 0;

         try {
            var10002[var10003] = "getFromLocation";
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         byte var11 = 1;

         try {
            var10[var11] = "getFromLocationName";
            var10000.Ϳ(var8, var1);
         } catch (Exception var2) {
            var10001 = false;
         }
      }

   }
}
