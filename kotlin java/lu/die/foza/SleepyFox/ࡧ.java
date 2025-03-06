package lu.die.foza.SleepyFox;

import android.system.Os;
import android.util.Base64;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtils.kt\nlu/die/foza/FoxDev/ThirdParty/FileUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1297:1\n1#2:1298\n*E\n"})
public final class ࡧ {
   @NotNull
   public static final ࡧ Ϳ = new ࡧ();
   @NotNull
   public static final String Ԩ = "~~";
   @NotNull
   public static final String ԩ = "-";

   // $FF: synthetic method
   public static boolean _/* $FF was: Ϳ*/(ࡧ var0, String var1, String var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = true;
      }

      return var0.ԩ(var1, var2, var3);
   }

   public final boolean _/* $FF was: Ϳ*/(String var1, String var2, boolean var3) {
      ࡧ var10000 = this;
      ࡧ var10001 = this;
      File var4 = this.Ԯ(var1);
      return var10000.Ϳ(var4, var10001.Ԯ(var2), var3);
   }

   public final boolean _/* $FF was: Ϳ*/(File var1, File var2, boolean var3) {
      if (var1 != null && var2 != null) {
         String var4;
         String var5 = var1.getPath() + (var4 = File.separator);
         if (StringsKt.contains$default(var4 = var2.getPath() + var4, var5, false, 2, (Object)null)) {
            return false;
         } else if (var1.exists() && var1.isDirectory()) {
            if (!this.Ԩ(var2)) {
               return false;
            } else {
               Iterator var7 = ArrayIteratorKt.iterator(var1.listFiles());

               while(var7.hasNext()) {
                  File var8;
                  File var10000 = var8 = (File)var7.next();
                  File var6;
                  var6 = new File.<init>(var4 + var8.getName());
                  if (var10000.isFile()) {
                     if (!this.Ԩ(var8, var6, var3)) {
                        return false;
                     }
                  } else if (var8.isDirectory() && !this.Ϳ(var8, var6, var3)) {
                     return false;
                  }
               }

               return !var3 || this.ԫ(var1);
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean _/* $FF was: Ԩ*/(String var1, String var2, boolean var3) {
      ࡧ var10000 = this;
      ࡧ var10001 = this;
      File var4 = this.Ԯ(var1);
      return var10000.Ԩ(var4, var10001.Ԯ(var2), var3);
   }

   public final boolean _/* $FF was: Ԩ*/(File var1, File var2, boolean var3) {
      if (var1 != null && var2 != null) {
         if (var1.exists() && var1.isFile()) {
            if (var2.exists() && var2.isFile()) {
               return false;
            } else {
               boolean var7;
               label82: {
                  if (this.Ԩ(var2.getParentFile())) {
                     label76: {
                        ࡧ var10000;
                        boolean var10001;
                        FileInputStream var10002;
                        File var10;
                        try {
                           var10000 = this;
                           var10 = var2;
                           var10002 = new FileInputStream;
                        } catch (FileNotFoundException var6) {
                           var10001 = false;
                           break label76;
                        }

                        FileInputStream var8 = var10002;

                        boolean var9;
                        try {
                           var10002.<init>(var1);
                           var9 = var10000.Ϳ((File)var10, (InputStream)var8, false);
                        } catch (FileNotFoundException var5) {
                           var10001 = false;
                           break label76;
                        }

                        if (var9) {
                           label77: {
                              if (!var3) {
                                 break label82;
                              }

                              try {
                                 var9 = this.Ԭ(var1);
                              } catch (FileNotFoundException var4) {
                                 var10001 = false;
                                 break label77;
                              }

                              if (var9) {
                                 break label82;
                              }
                           }
                        }
                     }
                  }

                  var7 = false;
                  return var7;
               }

               var7 = true;
               return var7;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   public final File _/* $FF was: Ԯ*/(@Nullable String var1) {
      return var1 == null || var1.length() == 0 ? null : (new File(var1)).getCanonicalFile();
   }

   @Nullable
   public final File _/* $FF was: Ϳ*/(@NotNull File var1, @NotNull String var2) {
      int var11 = 1;
      File var3 = null;

      File var4;
      while(true) {
         boolean var10001;
         label69: {
            label76: {
               File var10000;
               try {
                  var10000 = new File;
               } catch (Exception var10) {
                  var10001 = false;
                  break label76;
               }

               var4 = var10000;

               StringBuilder var10002;
               File var13;
               try {
                  var13 = var1;
                  var10002 = new StringBuilder;
               } catch (Exception var9) {
                  var10001 = false;
                  break label76;
               }

               StringBuilder var10003 = var10002;

               try {
                  var10003.<init>();
                  var10000.<init>(var13, var10002.append(var2).append('-').append(var11).toString());
                  break label69;
               } catch (Exception var8) {
                  var10001 = false;
               }
            }

            var4 = var3;
            break;
         }

         ++var11;

         try {
            ࢦ.Ϳ.getClass();
         } catch (Exception var7) {
            var10001 = false;
            break;
         }

         boolean var12;
         try {
            var12 = ࢦ.ԩ;
         } catch (Exception var6) {
            var10001 = false;
            break;
         }

         if (var12) {
            break;
         }

         try {
            var12 = var4.exists();
         } catch (Exception var5) {
            var10001 = false;
            break;
         }

         if (!var12) {
            break;
         }

         var3 = var4;
      }

      return var4;
   }

   @NotNull
   public final String _/* $FF was: Ϳ*/(@Nullable String param1, @NotNull String param2, @Nullable String param3) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final File _/* $FF was: Ԩ*/(@NotNull File var1, @NotNull String var2) {
      SecureRandom var10000;
      boolean var10001;
      try {
         var10000 = new SecureRandom;
      } catch (Exception var13) {
         var10001 = false;
         return null;
      }

      SecureRandom var14 = var10000;

      byte[] var15;
      try {
         var10000.<init>();
         var15 = new byte[16];
      } catch (Exception var12) {
         var10001 = false;
         return null;
      }

      byte[] var3 = var15;

      while(true) {
         String var16;
         try {
            var14.nextBytes(var3);
            var16 = Base64.encodeToString(var3, 10);
         } catch (Exception var11) {
            var10001 = false;
            break;
         }

         String var4 = var16;

         File var17;
         try {
            var17 = new File;
         } catch (Exception var10) {
            var10001 = false;
            break;
         }

         File var5 = var17;

         StringBuilder var10002;
         File var19;
         try {
            var19 = var1;
            var10002 = new StringBuilder;
         } catch (Exception var9) {
            var10001 = false;
            break;
         }

         StringBuilder var10003 = var10002;

         try {
            var10003.<init>();
            var17.<init>(var19, var10002.append(var2).append('-').append(var4).toString());
            ࢦ.Ϳ.getClass();
         } catch (Exception var8) {
            var10001 = false;
            break;
         }

         boolean var18;
         try {
            var18 = ࢦ.ԩ;
         } catch (Exception var7) {
            var10001 = false;
            break;
         }

         if (var18) {
            return var5;
         }

         try {
            var18 = var5.exists();
         } catch (Exception var6) {
            var10001 = false;
            break;
         }

         if (!var18) {
            return var5;
         }
      }

      return null;
   }

   @Nullable
   public final File _/* $FF was: ԩ*/(@NotNull File var1, @NotNull String var2) {
      SecureRandom var10000;
      boolean var10001;
      try {
         var10000 = new SecureRandom;
      } catch (Exception var15) {
         var10001 = false;
         return null;
      }

      SecureRandom var16 = var10000;

      byte[] var18;
      try {
         var10000.<init>();
         var18 = new byte[16];
      } catch (Exception var14) {
         var10001 = false;
         return null;
      }

      byte[] var3 = var18;

      File var5;
      String var19;
      File var20;
      boolean var21;
      do {
         try {
            var16.nextBytes(var3);
            var19 = "~~" + Base64.encodeToString(var3, 10);
         } catch (Exception var12) {
            var10001 = false;
            return null;
         }

         String var4 = var19;

         try {
            var20 = new File;
         } catch (Exception var11) {
            var10001 = false;
            return null;
         }

         var5 = var20;

         try {
            var20.<init>(var1, var4);
            ࢦ.Ϳ.getClass();
         } catch (Exception var10) {
            var10001 = false;
            return null;
         }

         try {
            var21 = ࢦ.ԩ;
         } catch (Exception var9) {
            var10001 = false;
            return null;
         }

         if (var21) {
            break;
         }

         try {
            var21 = var5.exists();
         } catch (Exception var13) {
            var10001 = false;
            return null;
         }
      } while(var21);

      try {
         var16.nextBytes(var3);
         var19 = Base64.encodeToString(var3, 10);
      } catch (Exception var8) {
         var10001 = false;
         return null;
      }

      String var17 = var19;

      File var10002;
      StringBuilder var10003;
      File var22;
      try {
         var20 = new File;
         var22 = var20;
         var10002 = var5;
         var10003 = new StringBuilder;
      } catch (Exception var7) {
         var10001 = false;
         return null;
      }

      StringBuilder var10004 = var10003;

      try {
         var10004.<init>();
         var22.<init>(var10002, var10003.append(var2).append('-').append(var17).toString());
         return var20;
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }
   }

   public final void _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable Integer var2) {
      if (var1 != null) {
         if (var2 != null) {
            try {
               Os.chmod(var1, var2.intValue());
            } catch (Exception var3) {
               return;
            }
         }

      }
   }

   public final void _/* $FF was: Ϳ*/(@NotNull File var1, int var2) {
      try {
         Os.chmod(var1.getAbsolutePath(), var2);
      } catch (Exception var3) {
      }
   }

   public final boolean ށ(@Nullable String var1) {
      return this.ށ(this.Ԯ(var1));
   }

   public final boolean ށ(@Nullable File var1) {
      return var1 != null && var1.exists();
   }

   public final boolean ؠ(@Nullable String var1) {
      return this.ؠ(this.Ԯ(var1));
   }

   public final boolean ؠ(@Nullable File var1) {
      boolean var10000;
      if (this.ށ(var1)) {
         Intrinsics.checkNotNull(var1);
         if (var1.isDirectory()) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   public final boolean ހ(@Nullable String var1) {
      return this.ހ(this.Ԯ(var1));
   }

   public final boolean ހ(@Nullable File var1) {
      boolean var10000;
      if (this.ށ(var1)) {
         Intrinsics.checkNotNull(var1);
         if (var1.isFile()) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   public final boolean _/* $FF was: Ԩ*/(@Nullable String var1) {
      return this.Ԩ(this.Ԯ(var1));
   }

   public final boolean _/* $FF was: Ԩ*/(@Nullable File var1) {
      return var1 != null && (var1.exists() ? var1.isDirectory() : var1.mkdirs());
   }

   public final boolean _/* $FF was: ԩ*/(@Nullable String var1) {
      return this.ԩ(this.Ԯ(var1));
   }

   public final boolean _/* $FF was: ԩ*/(@Nullable File var1) {
      if (var1 == null) {
         return false;
      } else if (var1.exists()) {
         return var1.isFile();
      } else {
         boolean var3;
         if (this.Ԩ(var1.getParentFile())) {
            label34: {
               boolean var10000;
               try {
                  var10000 = var1.createNewFile();
               } catch (IOException var2) {
                  break label34;
               }

               var3 = var10000;
               return var3;
            }
         }

         var3 = false;
         return var3;
      }
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable String var1) {
      return this.Ϳ(this.Ԯ(var1));
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable File var1) {
      if (var1 == null) {
         return false;
      } else if (var1.exists() && var1.isFile() && !var1.delete()) {
         return false;
      } else {
         boolean var3;
         if (this.Ԩ(var1.getParentFile())) {
            label38: {
               boolean var10000;
               try {
                  var10000 = var1.createNewFile();
               } catch (IOException var2) {
                  break label38;
               }

               var3 = var10000;
               return var3;
            }
         }

         var3 = false;
         return var3;
      }
   }

   public final boolean _/* $FF was: ԩ*/(@Nullable String param1, @Nullable String param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable String var2) {
      ࡧ var10000 = this;
      ࡧ var10001 = this;
      File var3 = this.Ԯ(var1);
      return var10000.Ϳ(var3, var10001.Ԯ(var2), false);
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable File var1, @Nullable File var2) {
      return this.Ϳ(var1, var2, false);
   }

   public final boolean _/* $FF was: Ԩ*/(@Nullable String var1, @Nullable String var2) {
      ࡧ var10000 = this;
      ࡧ var10001 = this;
      File var3 = this.Ԯ(var1);
      return var10000.Ԩ(var3, var10001.Ԯ(var2), false);
   }

   public final boolean _/* $FF was: Ԩ*/(@Nullable File var1, @Nullable File var2) {
      return this.Ԩ(var1, var2, false);
   }

   public final boolean _/* $FF was: Ԫ*/(@Nullable String var1, @Nullable String var2) {
      ࡧ var10000 = this;
      ࡧ var10001 = this;
      File var3 = this.Ԯ(var1);
      return var10000.Ϳ(var3, var10001.Ԯ(var2), true);
   }

   public final boolean _/* $FF was: ԩ*/(@Nullable File var1, @Nullable File var2) {
      return this.Ϳ(var1, var2, true);
   }

   public final boolean _/* $FF was: ԫ*/(@Nullable String var1, @Nullable String var2) {
      ࡧ var10000 = this;
      ࡧ var10001 = this;
      File var3 = this.Ԯ(var1);
      return var10000.Ԩ(var3, var10001.Ԯ(var2), true);
   }

   public final boolean _/* $FF was: Ԫ*/(@Nullable File var1, @Nullable File var2) {
      return this.Ԩ(var1, var2, true);
   }

   public final boolean _/* $FF was: Ԫ*/(@Nullable String var1) {
      return this.ԫ(this.Ԯ(var1));
   }

   public final boolean _/* $FF was: Ԫ*/(@Nullable File var1) {
      boolean var10000;
      boolean var10001;
      label77: {
         if (var1 != null) {
            try {
               var10000 = var1.exists();
            } catch (Exception var11) {
               var10001 = false;
               return false;
            }

            if (var10000) {
               var10000 = true;
               break label77;
            }
         }

         var10000 = false;
      }

      if (!var10000) {
         return false;
      } else {
         File[] var13;
         try {
            var13 = var1.listFiles();
         } catch (Exception var10) {
            var10001 = false;
            return false;
         }

         File[] var12 = var13;
         if (var13 == null) {
            return false;
         } else {
            var13 = var12;
            int var2 = 0;

            int var14;
            try {
               var14 = var13.length;
            } catch (Exception var9) {
               var10001 = false;
               return false;
            }

            int var3 = var14;

            while(true) {
               if (var2 >= var3) {
                  return true;
               }

               File var15;
               try {
                  var15 = var12[var2];
               } catch (Exception var8) {
                  var10001 = false;
                  break;
               }

               File var4 = var15;

               try {
                  var10000 = var15.isFile();
               } catch (Exception var7) {
                  var10001 = false;
                  break;
               }

               if (var10000) {
                  try {
                     this.Ԭ(var4);
                  } catch (Exception var6) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     this.ԫ(var4);
                  } catch (Exception var5) {
                     var10001 = false;
                     break;
                  }
               }

               ++var2;
            }

            return false;
         }
      }
   }

   public final boolean _/* $FF was: ԫ*/(@Nullable File var1) {
      if (var1 == null) {
         return false;
      } else {
         boolean var10000;
         boolean var10001;
         try {
            var10000 = var1.exists();
         } catch (Exception var24) {
            var10001 = false;
            return false;
         }

         if (!var10000) {
            return true;
         } else {
            try {
               var10000 = var1.isDirectory();
            } catch (Exception var23) {
               var10001 = false;
               return false;
            }

            if (!var10000) {
               return false;
            } else {
               File[] var26;
               try {
                  var26 = var1.listFiles();
               } catch (Exception var22) {
                  var10001 = false;
                  return false;
               }

               File[] var2 = var26;
               if (var26 != null) {
                  int var27;
                  try {
                     var27 = var2.length;
                  } catch (Exception var21) {
                     var10001 = false;
                     return false;
                  }

                  if (var27 == 0 ^ true) {
                     Iterator var28;
                     try {
                        var28 = ArrayIteratorKt.iterator(var2);
                     } catch (Exception var20) {
                        var10001 = false;
                        return false;
                     }

                     Iterator var25 = var28;

                     while(true) {
                        try {
                           var10000 = var25.hasNext();
                        } catch (Exception var9) {
                           var10001 = false;
                           return false;
                        }

                        if (!var10000) {
                           break;
                        }

                        File var29;
                        try {
                           var29 = (File)var25.next();
                        } catch (Exception var19) {
                           var10001 = false;
                           return false;
                        }

                        File var3 = var29;

                        try {
                           var10000 = var29.isFile();
                        } catch (Exception var18) {
                           var10001 = false;
                           return false;
                        }

                        if (var10000) {
                           try {
                              var10000 = this.Ԭ(var3);
                           } catch (Exception var17) {
                              var10001 = false;
                              return false;
                           }

                           if (!var10000) {
                              try {
                                 var3.toString();
                              } catch (Exception var4) {
                                 var10001 = false;
                                 return false;
                              }

                              return false;
                           }
                        } else {
                           try {
                              var10000 = var3.isDirectory();
                           } catch (Exception var16) {
                              var10001 = false;
                              return false;
                           }

                           if (var10000) {
                              try {
                                 var10000 = Intrinsics.areEqual(var3.getCanonicalPath(), var3.getAbsolutePath());
                              } catch (Exception var15) {
                                 var10001 = false;
                                 return false;
                              }

                              if (!var10000) {
                                 try {
                                    var10000 = var3.delete();
                                 } catch (Exception var14) {
                                    var10001 = false;
                                    return false;
                                 }

                                 if (!var10000) {
                                    try {
                                       var10000 = this.ԫ(var3);
                                    } catch (Exception var13) {
                                       var10001 = false;
                                       return false;
                                    }

                                    if (!var10000) {
                                       try {
                                          var3.toString();
                                       } catch (Exception var5) {
                                          var10001 = false;
                                          return false;
                                       }

                                       return false;
                                    }
                                 }
                              }

                              try {
                                 var10000 = this.ԫ(var3);
                              } catch (Exception var12) {
                                 var10001 = false;
                                 return false;
                              }

                              if (!var10000) {
                                 try {
                                    var3.toString();
                                 } catch (Exception var6) {
                                    var10001 = false;
                                    return false;
                                 }

                                 return false;
                              }
                           } else {
                              try {
                                 var29 = var3;
                                 var3.toString();
                              } catch (Exception var11) {
                                 var10001 = false;
                                 return false;
                              }

                              try {
                                 var29.delete();
                              } catch (Exception var10) {
                                 var10001 = false;
                                 return false;
                              }
                           }
                        }
                     }
                  }
               }

               try {
                  var10000 = var1.delete();
               } catch (Exception var8) {
                  var10001 = false;
                  return false;
               }

               if (!var10000) {
                  try {
                     var1.deleteOnExit();
                  } catch (Exception var7) {
                     var10001 = false;
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public final boolean _/* $FF was: ԫ*/(@Nullable String var1) {
      return this.Ԭ(this.Ԯ(var1));
   }

   public final boolean _/* $FF was: Ԭ*/(@Nullable File var1) {
      return var1 != null && (!var1.exists() || var1.isFile() && var1.delete());
   }

   public final boolean _/* $FF was: Ԭ*/(@Nullable String var1) {
      return this.ԭ(this.Ԯ(var1));
   }

   public final boolean _/* $FF was: ԭ*/(@Nullable File var1) {
      if (var1 == null) {
         return false;
      } else if (!var1.exists()) {
         return true;
      } else if (!var1.isDirectory()) {
         return false;
      } else {
         File[] var3;
         if ((var3 = var1.listFiles()) != null && var3.length != 0) {
            Iterator var4 = ArrayIteratorKt.iterator(var3);

            while(var4.hasNext()) {
               File var2;
               if ((var2 = (File)var4.next()).isFile()) {
                  if (!this.Ԭ(var2)) {
                     return false;
                  }
               } else if (var2.isDirectory() && !this.ԫ(var2)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   @Nullable
   public final List<File> _/* $FF was: Ϳ*/(@Nullable String var1, boolean var2) {
      return this.Ϳ(this.Ԯ(var1), var2);
   }

   @Nullable
   public final List<File> _/* $FF was: Ϳ*/(@Nullable File var1, boolean var2) {
      if (var2) {
         return this.ނ(var1);
      } else if (var1 != null && this.ؠ(var1) && Intrinsics.areEqual(var1.getCanonicalPath(), var1.getAbsolutePath())) {
         ArrayList var3;
         var3 = new ArrayList.<init>();
         File[] var4;
         if ((var4 = var1.listFiles()) != null) {
            Collections.addAll(var3, Arrays.copyOf(var4, var4.length));
         }

         return var3;
      } else {
         return null;
      }
   }

   @Nullable
   public final List<File> ނ(@Nullable String var1) {
      return this.ނ(this.Ԯ(var1));
   }

   @Nullable
   public final List<File> ނ(@Nullable File var1) {
      if (var1 != null && this.ؠ(var1)) {
         File var10000 = var1;
         ArrayList var4;
         var4 = new ArrayList.<init>();
         File[] var2;
         if ((var2 = var10000.listFiles()) != null && var2.length != 0) {
            Iterator var5 = ArrayIteratorKt.iterator(var2);

            while(var5.hasNext()) {
               File var3;
               var4.add(var3 = (File)var5.next());
               if (var3.isDirectory() && Intrinsics.areEqual(var3.getCanonicalPath(), var3.getAbsolutePath())) {
                  List var6;
                  Intrinsics.checkNotNull(var6 = this.ނ(var3));
                  var4.addAll(var6);
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   @Nullable
   public final List<File> _/* $FF was: Ԫ*/(@Nullable String var1, @NotNull String var2, boolean var3) {
      return this.Ϳ(this.Ԯ(var1), var2, var3);
   }

   @Nullable
   public final List<File> _/* $FF was: Ϳ*/(@Nullable File var1, @NotNull String var2, boolean var3) {
      if (var3) {
         return this.Ԫ(var1, var2);
      } else if (var1 != null && this.ؠ(var1)) {
         ArrayList var4;
         var4 = new ArrayList.<init>();
         File[] var5;
         if ((var5 = var1.listFiles()) != null && var5.length != 0) {
            Iterator var6 = ArrayIteratorKt.iterator(var5);

            while(var6.hasNext()) {
               File var7;
               String var10000 = (var7 = (File)var6.next()).getName().toUpperCase();
               Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
               String var10001 = var2.toUpperCase();
               Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
               if (StringsKt.endsWith$default(var10000, var10001, false, 2, (Object)null)) {
                  var4.add(var7);
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   @Nullable
   public final List<File> _/* $FF was: ԩ*/(@Nullable String var1, @NotNull String var2) {
      return this.Ԫ(this.Ԯ(var1), var2);
   }

   @Nullable
   public final List<File> _/* $FF was: Ԫ*/(@Nullable File var1, @NotNull String var2) {
      if (var1 != null && this.ؠ(var1)) {
         File var10000 = var1;
         ArrayList var5;
         var5 = new ArrayList.<init>();
         File[] var3;
         if ((var3 = var10000.listFiles()) != null && var3.length != 0) {
            Iterator var6 = ArrayIteratorKt.iterator(var3);

            while(var6.hasNext()) {
               File var4;
               String var8 = (var4 = (File)var6.next()).getName().toUpperCase();
               Intrinsics.checkNotNullExpressionValue(var8, "toUpperCase(...)");
               String var10001 = var2.toUpperCase();
               Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
               if (StringsKt.endsWith$default(var8, var10001, false, 2, (Object)null)) {
                  var5.add(var4);
               }

               if (var4.isDirectory() && Intrinsics.areEqual(var4.getCanonicalPath(), var4.getAbsolutePath())) {
                  List var7;
                  Intrinsics.checkNotNull(var7 = this.Ԫ(var4, var2));
                  var5.addAll(var7);
               }
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   @Nullable
   public final List<File> _/* $FF was: Ϳ*/(@Nullable String var1, @NotNull FilenameFilter var2, boolean var3) {
      return this.Ϳ(this.Ԯ(var1), var2, var3);
   }

   @Nullable
   public final List<File> _/* $FF was: Ϳ*/(@Nullable File var1, @NotNull FilenameFilter var2, boolean var3) {
      if (var3) {
         return this.Ϳ(var1, var2);
      } else if (var1 != null && this.ؠ(var1)) {
         ArrayList var5;
         var5 = new ArrayList.<init>();
         File[] var6;
         if ((var6 = var1.listFiles()) != null && var6.length != 0) {
            Iterator var7 = ArrayIteratorKt.iterator(var6);

            while(var7.hasNext()) {
               File var8;
               File var10001 = var8 = (File)var7.next();
               File var4 = var10001.getParentFile();
               if (var2.accept(var4, var10001.getName())) {
                  var5.add(var8);
               }
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   @Nullable
   public final List<File> _/* $FF was: Ϳ*/(@Nullable String var1, @NotNull FilenameFilter var2) {
      return this.Ϳ(this.Ԯ(var1), var2);
   }

   @Nullable
   public final List<File> _/* $FF was: Ϳ*/(@Nullable File var1, @NotNull FilenameFilter var2) {
      if (var1 != null && this.ؠ(var1)) {
         File var10000 = var1;
         ArrayList var6;
         var6 = new ArrayList.<init>();
         File[] var3;
         if ((var3 = var10000.listFiles()) != null && var3.length != 0) {
            Iterator var7 = ArrayIteratorKt.iterator(var3);

            while(var7.hasNext()) {
               File var4;
               File var10001 = var4 = (File)var7.next();
               File var5 = var10001.getParentFile();
               if (var2.accept(var5, var10001.getName())) {
                  var6.add(var4);
               }

               if (var4.isDirectory() && Intrinsics.areEqual(var4.getCanonicalPath(), var4.getAbsolutePath())) {
                  List var8;
                  Intrinsics.checkNotNull(var8 = this.Ϳ(var4, var2));
                  var6.addAll(var8);
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   @Nullable
   public final List<File> _/* $FF was: Ԯ*/(@Nullable String var1, @NotNull String var2) {
      return this.ԭ(this.Ԯ(var1), var2);
   }

   @Nullable
   public final List<File> _/* $FF was: ԭ*/(@Nullable File var1, @NotNull String var2) {
      if (var1 != null && this.ؠ(var1)) {
         File var10000 = var1;
         ArrayList var5;
         var5 = new ArrayList.<init>();
         File[] var3;
         if ((var3 = var10000.listFiles()) != null && var3.length != 0) {
            Iterator var6 = ArrayIteratorKt.iterator(var3);

            while(var6.hasNext()) {
               File var4;
               String var8 = (var4 = (File)var6.next()).getName().toUpperCase();
               Intrinsics.checkNotNullExpressionValue(var8, "toUpperCase(...)");
               String var10001 = var2.toUpperCase();
               Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
               if (Intrinsics.areEqual(var8, var10001)) {
                  var5.add(var4);
               }

               if (var4.isDirectory() && Intrinsics.areEqual(var4.getCanonicalPath(), var4.getAbsolutePath())) {
                  List var7;
                  Intrinsics.checkNotNull(var7 = this.ԭ(var4, var2));
                  var5.addAll(var7);
               }
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable String var1, @Nullable InputStream var2, boolean var3) {
      return this.Ϳ(this.Ԯ(var1), var2, var3);
   }

   public final boolean _/* $FF was: Ϳ*/(@Nullable File param1, @Nullable InputStream param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public final boolean _/* $FF was: ԫ*/(@Nullable String var1, @Nullable String var2, boolean var3) {
      return this.Ԩ(this.Ԯ(var1), var2, var3);
   }

   public final boolean _/* $FF was: Ԩ*/(@Nullable File param1, @Nullable String param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final List<String> _/* $FF was: Ԭ*/(@Nullable String var1, @Nullable String var2) {
      return this.ԫ(this.Ԯ(var1), var2);
   }

   @Nullable
   public final List<String> _/* $FF was: ԫ*/(@Nullable File var1, @Nullable String var2) {
      return this.Ϳ((File)var1, 0, Integer.MAX_VALUE, var2);
   }

   @Nullable
   public final List<String> _/* $FF was: Ϳ*/(@Nullable String var1, int var2, int var3, @Nullable String var4) {
      return this.Ϳ(this.Ԯ(var1), var2, var3, var4);
   }

   @Nullable
   public final List<String> _/* $FF was: Ϳ*/(@Nullable File param1, int param2, int param3, @Nullable String param4) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final String _/* $FF was: ԭ*/(@Nullable String var1, @Nullable String var2) {
      return this.Ԭ(this.Ԯ(var1), var2);
   }

   @Nullable
   public final String _/* $FF was: Ԭ*/(@Nullable File param1, @Nullable String param2) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final String _/* $FF was: ԯ*/(@Nullable String var1) {
      return this.ԯ(this.Ԯ(var1));
   }

   @NotNull
   public final String _/* $FF was: ԯ*/(@Nullable File param1) {
      // $FF: Couldn't be decompiled
   }

   public final int _/* $FF was: ֈ*/(@Nullable String var1) {
      return this.ֈ(this.Ԯ(var1));
   }

   public final int _/* $FF was: ֈ*/(@Nullable File param1) {
      // $FF: Couldn't be decompiled
   }

   public final void _/* $FF was: Ϳ*/(@NotNull Closeable... var1) {
      Closeable[] var10000 = var1;
      int var7 = 0;

      boolean var10001;
      int var8;
      try {
         var8 = var10000.length;
      } catch (IOException var6) {
         var10001 = false;
         return;
      }

      for(int var2 = var8; var7 < var2; ++var7) {
         Closeable var9;
         try {
            var9 = var1[var7];
         } catch (IOException var5) {
            var10001 = false;
            break;
         }

         Closeable var3 = var9;
         if (var9 != null) {
            try {
               var3.close();
            } catch (IOException var4) {
               var10001 = false;
               break;
            }
         }
      }

   }

   @Nullable
   public final String _/* $FF was: Ԯ*/(@Nullable File var1) {
      return var1 == null ? null : this.ԭ(var1.getPath());
   }

   @NotNull
   public final String _/* $FF was: ԭ*/(@NotNull String var1) {
      if (var1.length() == 0) {
         return var1;
      } else {
         int var2;
         String var3;
         if ((var2 = StringsKt.lastIndexOf$default(var1, File.separator, 0, false, 6, (Object)null)) == -1) {
            var3 = "";
         } else {
            Intrinsics.checkNotNullExpressionValue(var3 = var1.substring(0, var2 + 1), "substring(...)");
         }

         return var3;
      }
   }

   @Nullable
   public final String ֏(@Nullable File var1) {
      return var1 == null ? null : this.֏(var1.getPath());
   }

   @NotNull
   public final String ֏(@NotNull String var1) {
      if (var1.length() == 0) {
         return var1;
      } else {
         int var2;
         if ((var2 = StringsKt.lastIndexOf$default(var1, File.separator, 0, false, 6, (Object)null)) != -1) {
            Intrinsics.checkNotNullExpressionValue(var1 = var1.substring(var2 + 1), "substring(...)");
         }

         return var1;
      }
   }

   @Nullable
   public final String _/* $FF was: ׯ*/(@Nullable File var1) {
      return var1 == null ? null : this.ׯ(var1.getPath());
   }

   @NotNull
   public final String _/* $FF was: ׯ*/(@NotNull String var1) {
      if (var1.length() == 0) {
         return var1;
      } else {
         int var3 = StringsKt.lastIndexOf$default(var1, '.', 0, false, 6, (Object)null);
         int var2;
         if ((var2 = StringsKt.lastIndexOf$default(var1, File.separator, 0, false, 6, (Object)null)) == -1) {
            if (var3 != -1) {
               Intrinsics.checkNotNullExpressionValue(var1 = var1.substring(0, var3), "substring(...)");
            }

            return var1;
         } else {
            String var4;
            if (var3 != -1 && var2 <= var3) {
               Intrinsics.checkNotNullExpressionValue(var4 = var1.substring(var2 + 1, var3), "substring(...)");
            } else {
               Intrinsics.checkNotNullExpressionValue(var4 = var1.substring(var2 + 1), "substring(...)");
            }

            return var4;
         }
      }
   }

   @Nullable
   public final String _/* $FF was: ՠ*/(@Nullable File var1) {
      return var1 == null ? null : this.ՠ(var1.getPath());
   }

   @NotNull
   public final String _/* $FF was: ՠ*/(@NotNull String var1) {
      if (var1.length() == 0) {
         return var1;
      } else {
         int var3;
         int var10000 = var3 = StringsKt.lastIndexOf$default(var1, '.', 0, false, 6, (Object)null);
         int var2 = StringsKt.lastIndexOf$default(var1, File.separator, 0, false, 6, (Object)null);
         String var4;
         if (var10000 != -1 && var2 < var3) {
            Intrinsics.checkNotNullExpressionValue(var4 = var1.substring(var3 + 1), "substring(...)");
         } else {
            var4 = "";
         }

         return var4;
      }
   }

   public static final class Ϳ {
      @NotNull
      public static final ࡧ.Ϳ Ϳ = new ࡧ.Ϳ();
      public static final int Ԩ = 2048;
      public static final int ԩ = 1024;
      public static final int Ԫ = 512;
      public static final int ԫ = 256;
      public static final int Ԭ = 128;
      public static final int ԭ = 64;
      public static final int Ԯ = 32;
      public static final int ԯ = 16;
      public static final int ՠ = 8;
      public static final int ֈ = 4;
      public static final int ֏ = 2;
      public static final int ׯ = 1;
      public static final int ؠ = 493;
      public static final int ހ = 292;
   }
}
