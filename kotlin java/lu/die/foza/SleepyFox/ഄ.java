package lu.die.foza.SleepyFox;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ഄ extends ࢧ {
   @NotNull
   public static final ഄ.Ϳ ԭ = new ഄ.Ϳ();
   @NotNull
   public static final ഄ Ԯ = new ഄ();
   @NotNull
   public final ޅ<String> Ԭ;

   public _/* $FF was: ഄ*/() {
      ޅ var30;
      label217: {
         label222: {
            String[] var10000;
            boolean var10001;
            try {
               var10000 = new String[9];
            } catch (Exception var29) {
               var10001 = false;
               break label222;
            }

            String[] var33 = var10000;
            String[] var10002 = var10000;
            String[] var10003 = var10000;
            String[] var10004 = var10000;
            String[] var10005 = var10000;
            String[] var10006 = var10000;
            String[] var10007 = var10000;
            String[] var10008 = var10000;
            String[] var10009 = var10000;
            byte var10010 = 0;

            try {
               var10009[var10010] = "android.permission.ACCOUNT_MANAGER";
            } catch (Exception var28) {
               var10001 = false;
               break label222;
            }

            byte var42 = 1;

            try {
               var10008[var42] = "android.permission.INTERACT_ACROSS_USERS";
            } catch (Exception var27) {
               var10001 = false;
               break label222;
            }

            byte var41 = 2;

            try {
               var10007[var41] = "android.permission.INTERACT_ACROSS_USERS_FULL";
            } catch (Exception var26) {
               var10001 = false;
               break label222;
            }

            byte var40 = 3;

            try {
               var10006[var40] = "android.permission.BACKUP";
            } catch (Exception var25) {
               var10001 = false;
               break label222;
            }

            byte var39 = 4;

            try {
               var10005[var39] = "android.permission.GET_APP_OPS_STATS";
            } catch (Exception var24) {
               var10001 = false;
               break label222;
            }

            byte var38 = 5;

            try {
               var10004[var38] = "android.permission.READ_DEVICE_CONFIG";
            } catch (Exception var23) {
               var10001 = false;
               break label222;
            }

            byte var37 = 6;

            try {
               var10003[var37] = "android.permission.SEND_SMS";
            } catch (Exception var22) {
               var10001 = false;
               break label222;
            }

            byte var36 = 7;

            try {
               var10002[var36] = "android.permission.READ_SMS";
            } catch (Exception var21) {
               var10001 = false;
               break label222;
            }

            byte var34 = 8;

            ArrayList var31;
            try {
               var33[var34] = "android.permission.RECEIVE_SMS";
               var31 = CollectionsKt.arrayListOf(var10000);
            } catch (Exception var20) {
               var10001 = false;
               break label222;
            }

            ArrayList var1 = var31;

            boolean var32;
            try {
               var32 = ތ.ԫ;
            } catch (Exception var19) {
               var10001 = false;
               break label222;
            }

            String[] var2;
            if (var32) {
               try {
                  var31 = var1;
                  var33 = new String[4];
               } catch (Exception var18) {
                  var10001 = false;
                  break label222;
               }

               var10002 = var33;
               var10003 = var33;
               var10004 = var2 = var33;
               var38 = 0;

               try {
                  var10004[var38] = "android.permission.READ_EXTERNAL_STORAGE";
               } catch (Exception var17) {
                  var10001 = false;
                  break label222;
               }

               var37 = 1;

               try {
                  var10003[var37] = "android.permission.WRITE_EXTERNAL_STORAGE";
               } catch (Exception var16) {
                  var10001 = false;
                  break label222;
               }

               var36 = 2;

               try {
                  var10002[var36] = "android.permission.READ_CONTACTS";
               } catch (Exception var15) {
                  var10001 = false;
                  break label222;
               }

               var34 = 3;

               try {
                  var33[var34] = "android.permission.WRITE_CONTACTS";
                  CollectionsKt.addAll(var31, var2);
               } catch (Exception var14) {
                  var10001 = false;
                  break label222;
               }
            }

            try {
               var32 = ތ.ހ;
            } catch (Exception var13) {
               var10001 = false;
               break label222;
            }

            if (var32) {
               try {
                  var1.add("android.permission.READ_PHONE_STATE");
               } catch (Exception var12) {
                  var10001 = false;
                  break label222;
               }
            }

            try {
               var32 = ތ.ށ;
            } catch (Exception var11) {
               var10001 = false;
               break label222;
            }

            if (var32) {
               try {
                  var1.add("android.permission.BLUETOOTH");
               } catch (Exception var10) {
                  var10001 = false;
                  break label222;
               }
            }

            try {
               var32 = ތ.ނ;
            } catch (Exception var9) {
               var10001 = false;
               break label222;
            }

            if (var32) {
               try {
                  var31 = var1;
                  var33 = new String[3];
               } catch (Exception var8) {
                  var10001 = false;
                  break label222;
               }

               var10002 = var33;
               var10003 = var2 = var33;
               var37 = 0;

               try {
                  var10003[var37] = "android.permission.READ_MEDIA_AUDIO";
               } catch (Exception var7) {
                  var10001 = false;
                  break label222;
               }

               var36 = 1;

               try {
                  var10002[var36] = "android.permission.READ_MEDIA_VIDEO";
               } catch (Exception var6) {
                  var10001 = false;
                  break label222;
               }

               var34 = 2;

               try {
                  var33[var34] = "android.permission.READ_MEDIA_IMAGES";
                  CollectionsKt.addAll(var31, var2);
               } catch (Exception var5) {
                  var10001 = false;
                  break label222;
               }
            }

            ޅ var35;
            try {
               var35 = new ޅ;
            } catch (Exception var4) {
               var10001 = false;
               break label222;
            }

            var30 = var35;

            try {
               var30.<init>(var1.size());
               var35.addAll(var1);
               break label217;
            } catch (Exception var3) {
               var10001 = false;
            }
         }

         var30 = new ޅ.<init>(0);
      }

      this.Ԭ = var30;
   }

   public final void _/* $FF was: Ϳ*/(@NotNull ˁ var1) {
      var1.Ϳ((String)"checkPermission", (ໞ)this);
   }

   @Nullable
   public Object _/* $FF was: Ϳ*/(@NotNull ࡥ var1) {
      String var10000;
      boolean var10001;
      try {
         var10000 = (String)ރ.Ϳ.Ϳ(var1.ԩ, String.class);
      } catch (Exception var10) {
         var10001 = false;
         return -1;
      }

      String var2 = var10000;
      if (var10000 != null) {
         boolean var11;
         try {
            var11 = this.Ԩ(var2);
         } catch (Exception var9) {
            var10001 = false;
            return -1;
         }

         if (var11) {
            try {
               return 0;
            } catch (Exception var4) {
               var10001 = false;
               return -1;
            }
         }

         try {
            var10000 = ࢦ.Ϳ.ԩ();
         } catch (Exception var8) {
            var10001 = false;
            return -1;
         }

         String var3 = var10000;
         if (var10000 != null) {
            try {
               var11 = StringsKt.startsWith$default(var2, var3, false, 2, (Object)null);
            } catch (Exception var7) {
               var10001 = false;
               return -1;
            }

            if (var11) {
               try {
                  return 0;
               } catch (Exception var5) {
                  var10001 = false;
                  return -1;
               }
            }
         }
      }

      try {
         return super.Ϳ(var1);
      } catch (Exception var6) {
         var10001 = false;
         return -1;
      }
   }

   public final boolean _/* $FF was: Ԩ*/(String var1) {
      if (StringsKt.startsWith$default(var1, "com.google.android.", false, 2, (Object)null)) {
         return true;
      } else {
         return this.Ԭ.contains(var1);
      }
   }

   public static final class Ϳ {
      public _/* $FF was: Ϳ*/() {
      }

      // $FF: synthetic method
      public _/* $FF was: Ϳ*/(DefaultConstructorMarker var1) {
         this();
      }

      @NotNull
      public final ഄ _/* $FF was: Ϳ*/() {
         return ഄ.Ԯ;
      }
   }
}
