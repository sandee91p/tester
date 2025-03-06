package lu.die.foza.SleepyFox;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(26)
@SourceDebugExtension({"SMAP\nFozaDatabaseUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDatabaseUtils.kt\nlu/die/foza/HookEntity/SampleHookEntity/AppHooker/FozaDatabaseUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,520:1\n1#2:521\n*E\n"})
public final class ࢫ {
   @NotNull
   public static final ࢫ Ϳ = new ࢫ();

   @Nullable
   public final String _/* $FF was: Ϳ*/(@Nullable String var1, @NotNull Object... var2) {
      if (var1 == null) {
         return null;
      } else if (var2.length == 0) {
         return var1;
      } else if (StringsKt.indexOf$default(var1, '?', 0, false, 6, (Object)null) == -1) {
         return var1;
      } else {
         char var3 = ' ';
         int var4 = 0;
         int var5 = var1.length();
         StringBuilder var6;
         var6 = new StringBuilder.<init>(var5);
         int var7 = 0;

         while(true) {
            while(var7 < var5) {
               int var8 = var7 + 1;
               char var12;
               if ((var12 = var1.charAt(var7)) == '?') {
                  var12 = ' ';

                  int var9;
                  for(var9 = var8; var9 < var5; ++var9) {
                     char var10;
                     if (Intrinsics.compare(var10 = var1.charAt(var9), 48) < 0 || Intrinsics.compare(var10, 57) > 0) {
                        var12 = var10;
                        break;
                     }
                  }

                  if (var8 != var9) {
                     String var10000 = var1.substring(var8, var9);
                     Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                     var4 = Integer.parseInt(var10000) - 1;
                  }

                  var8 = var4 + 1;
                  Object var11 = var2[var4];
                  if (var3 != ' ' && var3 != '=') {
                     var6.append(' ');
                  }

                  label96: {
                     label95: {
                        Number var10001;
                        switch(this.Ϳ(var11)) {
                        case 0:
                           var6.append("NULL");
                           break label96;
                        case 1:
                           var10001 = (Number)var11;
                           Intrinsics.checkNotNull((Number)var11);
                           var6.append(var10001.longValue());
                           break label96;
                        case 2:
                           var10001 = (Number)var11;
                           Intrinsics.checkNotNull((Number)var11);
                           var6.append(var10001.doubleValue());
                           break label96;
                        case 3:
                           if (var11 instanceof Boolean) {
                              break label95;
                           }
                           break;
                        case 4:
                           throw new IllegalArgumentException("Blobs not supported");
                        default:
                           if (var11 instanceof Boolean) {
                              break label95;
                           }
                        }

                        var6.append('\'');
                        var6.append(StringsKt.replace$default(String.valueOf(var11), "'", "''", false, 4, (Object)null));
                        var6.append('\'');
                        break label96;
                     }

                     var6.append((Boolean)var11);
                  }

                  if (var12 != ' ') {
                     var6.append(' ');
                  }

                  var4 = var8;
                  var7 = var9;
               } else {
                  var6.append(var12);
                  var3 = var12;
                  var7 = var8;
               }
            }

            return var6.toString();
         }
      }
   }

   public final int _/* $FF was: Ϳ*/(@Nullable Object var1) {
      return var1 == null ? 0 : (var1 instanceof byte[] ? 4 : (!(var1 instanceof Float) && !(var1 instanceof Double) ? (var1 instanceof Number ? 1 : 3) : 2));
   }

   public final void _/* $FF was: Ϳ*/(@NotNull String var1, @NotNull Cursor var2, @NotNull ContentValues var3) {
      int var4;
      if ((var4 = var2.getColumnIndex(var1)) != -1) {
         if (var2.isNull(var4)) {
            var3.putNull(var1);
         } else {
            var3.put(var1, var2.getString(var4));
         }
      }

   }

   @Nullable
   public final String _/* $FF was: Ԩ*/(@Nullable String var1) {
      if (var1 == null) {
         return null;
      } else {
         int var6 = 0;
         char var2 = 0;
         int var3 = 0;

         for(int var4 = var1.length(); var3 < var4; ++var3) {
            char var5;
            if ((var5 = var1.charAt(var3)) == '\'' || var5 == '"') {
               if (var2 == 0) {
                  var2 = var5;
               } else if (var2 == var5) {
                  var2 = 0;
               }
            }

            if (var2 == 0) {
               if (var5 == '(') {
                  ++var6;
               } else if (var5 == ')') {
                  --var6;
               }
            }
         }

         while(var6 > 0) {
            var1 = var1 + ')';
            --var6;
         }

         while(var6 < 0) {
            var1 = "(" + var1;
            ++var6;
         }

         return var1;
      }
   }

   @RequiresApi(30)
   public final void _/* $FF was: Ϳ*/(@NotNull Bundle var1, @NotNull Consumer<String> var2, @NotNull Function<String, String> var3) {
      var2.accept("android:query-arg-sql-selection");
      var2.accept("android:query-arg-sql-selection-args");
      this.Ϳ(var1, var2);
      this.Ԩ(var1, var2, var3);
      this.Ԩ(var1, var2);
   }

   @RequiresApi(30)
   public final void _/* $FF was: Ϳ*/(@NotNull Uri var1, @NotNull Bundle var2) {
      String var3 = var2.getString("android:query-arg-sql-limit");
      String var4;
      if (!TextUtils.isEmpty(var4 = var1.getQueryParameter("limit"))) {
         if (!TextUtils.isEmpty(var3)) {
            var3 = "Abusive '" + var4 + "' conflicts with requested '" + var3 + '\'';
            throw new IllegalArgumentException(var3.toString());
         }

         var2.putString("android:query-arg-sql-limit", var4);
      }

   }

   @RequiresApi(30)
   public final void _/* $FF was: Ϳ*/(@NotNull Bundle var1) {
      String var2;
      String var3;
      int var6;
      label20: {
         String var10000 = var2 = var1.getString("android:query-arg-sql-selection");
         var3 = var1.getString("android:query-arg-sql-group-by");
         if (var10000 != null) {
            String var4;
            var10000 = var4 = var2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
            if (var10000 != null) {
               var6 = StringsKt.indexOf$default(var4, " GROUP BY ", 0, false, 6, (Object)null);
               break label20;
            }
         }

         var6 = -1;
      }

      if (var6 != -1) {
         ࢫ var10001 = this;
         ࢫ var10002 = this;
         Intrinsics.checkNotNull(var2);
         String var5;
         Intrinsics.checkNotNullExpressionValue(var5 = var2.substring(0, var6), "substring(...)");
         var2 = var2.substring(var6 + 10);
         Intrinsics.checkNotNullExpressionValue(var2, "substring(...)");
         var5 = var10002.Ԩ(var5);
         var2 = var10001.Ԩ(var2);
         if (!TextUtils.isEmpty(var3)) {
            var5 = "Abusive '" + var2 + "' conflicts with requested '" + var3 + '\'';
            throw new IllegalArgumentException(var5.toString());
         }

         var1.putString("android:query-arg-sql-selection", var5);
         var1.putString("android:query-arg-sql-group-by", var2);
      }

   }

   @RequiresApi(30)
   public final void _/* $FF was: Ԩ*/(@NotNull Bundle var1) {
      String var2;
      String var3;
      String var4;
      int var5;
      label20: {
         String var10000 = var4 = var1.getString("android:query-arg-sql-sort-order");
         var2 = var1.getString("android:query-arg-sql-limit");
         if (var10000 != null) {
            var10000 = var3 = var4.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
            if (var10000 != null) {
               var5 = StringsKt.indexOf$default(var3, " LIMIT ", 0, false, 6, (Object)null);
               break label20;
            }
         }

         var5 = -1;
      }

      if (var5 != -1) {
         String var10001 = var4;
         Intrinsics.checkNotNull(var4);
         Intrinsics.checkNotNullExpressionValue(var4 = var4.substring(0, var5), "substring(...)");
         Intrinsics.checkNotNullExpressionValue(var3 = var10001.substring(var5 + 7), "substring(...)");
         if (!TextUtils.isEmpty(var2)) {
            var4 = "Abusive '" + var3 + "' conflicts with requested '" + var2 + '\'';
            throw new IllegalArgumentException(var4.toString());
         }

         var1.putString("android:query-arg-sql-sort-order", var4);
         var1.putString("android:query-arg-sql-limit", var3);
      }

   }

   @Nullable
   public final Bundle _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable String[] var2, @Nullable String var3) {
      if (var1 == null && var2 == null && var3 == null) {
         return null;
      } else {
         Bundle var4;
         var4 = new Bundle.<init>();
         if (var1 != null) {
            var4.putString("android:query-arg-sql-selection", var1);
         }

         if (var2 != null) {
            var4.putStringArray("android:query-arg-sql-selection-args", var2);
         }

         if (var3 != null) {
            var4.putString("android:query-arg-sql-sort-order", var3);
         }

         return var4;
      }
   }

   @NotNull
   public final ބ<String, Object> _/* $FF was: Ϳ*/(@NotNull ContentValues param1) {
      // $FF: Couldn't be decompiled
   }

   public final long _/* $FF was: Ϳ*/(@NotNull SQLiteDatabase var1, @NotNull String var2, @Nullable Object[] var3) throws SQLException {
      SQLiteDatabase var10000 = var1;
      String var10001 = var2;
      Trace.beginSection("executeInsert");

      long var39;
      label218: {
         Throwable var36;
         label222: {
            SQLiteStatement var37;
            boolean var38;
            try {
               var37 = var10000.compileStatement(var10001);
            } catch (Throwable var33) {
               var36 = var33;
               var38 = false;
               break label222;
            }

            SQLiteStatement var34 = var37;
            var1 = null;

            try {
               Ϳ.Ϳ(var34, var3);
               var39 = var37.executeInsert();
            } catch (Throwable var32) {
               Throwable var35;
               var36 = var35 = var32;

               try {
                  throw var35;
               } catch (Throwable var30) {
                  try {
                     CloseableKt.closeFinally(var34, var35);
                     throw var36;
                  } catch (Throwable var29) {
                     var36 = var29;
                     var38 = false;
                     break label222;
                  }
               }
            }

            label210:
            try {
               CloseableKt.closeFinally(var34, var1);
               break label218;
            } catch (Throwable var31) {
               var36 = var31;
               var38 = false;
               break label210;
            }
         }

         Trace.endSection();
         throw var36;
      }

      Trace.endSection();
      return var39;
   }

   public final int _/* $FF was: Ԩ*/(@NotNull SQLiteDatabase var1, @NotNull String var2, @Nullable Object[] var3) throws SQLException {
      SQLiteDatabase var10000 = var1;
      String var10001 = var2;
      Trace.beginSection("executeUpdateDelete");

      int var39;
      label218: {
         Throwable var36;
         label222: {
            SQLiteStatement var37;
            boolean var38;
            try {
               var37 = var10000.compileStatement(var10001);
            } catch (Throwable var33) {
               var36 = var33;
               var38 = false;
               break label222;
            }

            SQLiteStatement var34 = var37;
            var1 = null;

            try {
               Ϳ.Ϳ(var34, var3);
               var39 = var37.executeUpdateDelete();
            } catch (Throwable var32) {
               Throwable var35;
               var36 = var35 = var32;

               try {
                  throw var35;
               } catch (Throwable var30) {
                  try {
                     CloseableKt.closeFinally(var34, var35);
                     throw var36;
                  } catch (Throwable var29) {
                     var36 = var29;
                     var38 = false;
                     break label222;
                  }
               }
            }

            label210:
            try {
               CloseableKt.closeFinally(var34, var1);
               break label218;
            } catch (Throwable var31) {
               var36 = var31;
               var38 = false;
               break label210;
            }
         }

         Trace.endSection();
         throw var36;
      }

      Trace.endSection();
      return var39;
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/(@NotNull Object... var1) {
      StringBuilder var2;
      var2 = new StringBuilder.<init>("(");
      int var3 = 0;

      for(int var4 = var1.length; var3 < var4; ++var3) {
         var2.append('?');
         if (var3 < var1.length - 1) {
            var2.append(',');
         }
      }

      var2.append(')');
      String var5 = var2.toString();
      String var6 = this.Ϳ(var5, Arrays.copyOf(var1, var1.length));
      Intrinsics.checkNotNull(var6);
      return var6;
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/(@NotNull String var1) {
      StringBuilder var5;
      var5 = new StringBuilder.<init>();
      int var2 = 0;

      for(int var3 = var1.length(); var2 < var3; ++var2) {
         char var4;
         if ((var4 = var1.charAt(var2)) == '%' || var4 == '_') {
            var5.append('\\');
         }

         var5.append(var4);
      }

      return var5.toString();
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable Object var1, boolean var2) {
      if (var1 instanceof Boolean) {
         var2 = (Boolean)var1;
      } else {
         label32: {
            if (var1 instanceof Number) {
               if (((Number)var1).intValue() != 0) {
                  break label32;
               }
            } else {
               if (!(var1 instanceof String)) {
                  return var2;
               }

               String var3;
               Intrinsics.checkNotNullExpressionValue(var3 = ((String)var1).toLowerCase(Locale.ROOT), "toLowerCase(...)");
               if (!Intrinsics.areEqual("false", var3) && !Intrinsics.areEqual("0", var3)) {
                  break label32;
               }
            }

            var2 = false;
            return var2;
         }

         var2 = true;
      }

      return var2;
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull Bundle var1, @NotNull String var2, boolean var3) {
      return this.Ϳ(var1.get(var2), var3);
   }

   public final boolean _/* $FF was: Ϳ*/(@NotNull ContentValues var1, @NotNull String var2, boolean var3) {
      return this.Ϳ(var1.get(var2), var3);
   }

   public final long _/* $FF was: Ϳ*/(@NotNull ContentValues var1, @NotNull String var2, long var3) {
      Long var5;
      if ((var5 = var1.getAsLong(var2)) != null) {
         var3 = var5;
      }

      return var3;
   }

   @RequiresApi(30)
   public final void _/* $FF was: Ϳ*/(Bundle var1, Consumer<String> var2) {
      String[] var4;
      if ((var4 = var1.getStringArray("android:query-arg-group-columns")) != null) {
         boolean var3;
         if (var4.length == 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3 ^ true) {
            String var5 = TextUtils.join(", ", var4);
            var2.accept("android:query-arg-group-columns");
            var1.putString("android:query-arg-sql-group-by", var5);
            return;
         }
      }

      var2.accept("android:query-arg-sql-group-by");
   }

   @RequiresApi(
      api = 30
   )
   public final void _/* $FF was: Ԩ*/(Bundle var1, Consumer<String> var2, Function<String, String> var3) {
      String[] var4;
      if ((var4 = var1.getStringArray("android:query-arg-sort-columns")) != null && var4.length != 0) {
         String var5 = TextUtils.join(", ", var4);
         var2.accept("android:query-arg-sort-columns");
         int var6;
         if (var1.containsKey("android:query-arg-sort-locale")) {
            var5 = var5 + " COLLATE " + (String)var3.apply(var1.getString("android:query-arg-sort-locale"));
            var2.accept("android:query-arg-sort-locale");
         } else if ((var6 = var1.getInt("android:query-arg-sort-collation", 3)) != 0 && var6 != 1) {
            if (var6 == 3) {
               var2.accept("android:query-arg-sort-collation");
            }
         } else {
            var5 = var5 + " COLLATE NOCASE";
            var2.accept("android:query-arg-sort-collation");
         }

         if ((var6 = var1.getInt("android:query-arg-sort-direction", Integer.MIN_VALUE)) != 0) {
            if (var6 == 1) {
               var5 = var5 + " DESC";
               var2.accept("android:query-arg-sort-direction");
            }
         } else {
            var5 = var5 + " ASC";
            var2.accept("android:query-arg-sort-direction");
         }

         var1.putString("android:query-arg-sql-sort-order", var5);
      } else {
         var2.accept("android:query-arg-sql-sort-order");
      }

   }

   @RequiresApi(
      api = 30
   )
   public final void _/* $FF was: Ԩ*/(Bundle var1, Consumer<String> var2) {
      int var4;
      if ((var4 = var1.getInt("android:query-arg-limit", Integer.MIN_VALUE)) != Integer.MIN_VALUE) {
         String var5 = String.valueOf(var4);
         var2.accept("android:query-arg-limit");
         int var3;
         if ((var3 = var1.getInt("android:query-arg-offset", Integer.MIN_VALUE)) != Integer.MIN_VALUE) {
            var5 = var5 + " OFFSET " + var3;
            var2.accept("android:query-arg-offset");
         }

         var1.putString("android:query-arg-sql-limit", var5);
      } else {
         var2.accept("android:query-arg-sql-limit");
      }

   }

   public final void _/* $FF was: Ϳ*/(SQLiteStatement var1, Object[] var2) {
      if (var2 != null) {
         int var3 = 0;

         for(int var4 = var2.length; var3 < var4; ++var3) {
            int var8;
            long var9;
            label53: {
               Object var5;
               label52: {
                  label51: {
                     int var6;
                     switch(this.Ϳ(var5 = var2[var3])) {
                     case 0:
                        var1.bindNull(var3 + 1);
                        continue;
                     case 1:
                        var6 = var3 + 1;
                        Intrinsics.checkNotNull(var5, "null cannot be cast to non-null type kotlin.Number");
                        var1.bindLong(var6, ((Number)var5).longValue());
                        continue;
                     case 2:
                        var6 = var3 + 1;
                        Intrinsics.checkNotNull(var5, "null cannot be cast to non-null type kotlin.Number");
                        var1.bindDouble(var6, ((Number)var5).doubleValue());
                        continue;
                     case 3:
                        if (!(var5 instanceof Boolean)) {
                           break label52;
                        }

                        var8 = var3 + 1;
                        if ((Boolean)var5) {
                           break label51;
                        }
                        break;
                     case 4:
                        var8 = var3 + 1;
                        Intrinsics.checkNotNull(var5, "null cannot be cast to non-null type kotlin.ByteArray");
                        var1.bindBlob(var8, (byte[])var5);
                        continue;
                     default:
                        if (!(var5 instanceof Boolean)) {
                           break label52;
                        }

                        var8 = var3 + 1;
                        if ((Boolean)var5) {
                           break label51;
                        }
                     }

                     var9 = 0L;
                     break label53;
                  }

                  var9 = 1L;
                  break label53;
               }

               var8 = var3 + 1;
               var1.bindString(var8, var5.toString());
               continue;
            }

            var1.bindLong(var8, var9);
         }

      }
   }
}
