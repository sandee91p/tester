package lu.die.foza.SleepyFox;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ࢾ extends ClassLoader {
   public _/* $FF was: ࢾ*/(@NotNull ClassLoader var1) {
      super(var1);
   }

   @NotNull
   public Class<?> loadClass(@Nullable String var1) {
      try {
         return super.loadClass(var1);
      } catch (Exception var2) {
         if (var1 != null) {
            if (StringsKt.startsWith$default(var1, "lu.die.foza.SleepyFox.FozaAnkingProvider", false, 2, (Object)null)) {
               return FozaAnkingProvider.class;
            }

            if (StringsKt.startsWith$default(var1, "lu.die.foza.SleepyFox.FozaStubProvider", false, 2, (Object)null)) {
               return FozaStubProvider.class;
            }

            if (StringsKt.startsWith$default(var1, "lu.die.foza.SleepyFox.FozaStubJobService$Companion$FozaStubJobServiceDang", false, 2, (Object)null)) {
               return FozaStubJobService.Companion.FozaStubJobServiceDang.class;
            }

            if (StringsKt.startsWith$default(var1, "lu.die.foza.SleepyFox.FozaStubProcessGroup", false, 2, (Object)null)) {
               return FozaStubProcessGroup.class;
            }

            if (StringsKt.startsWith$default(var1, "lu.die.foza.SleepyFox.FozaStubActivityGroup", false, 2, (Object)null)) {
               return FozaStubActivityGroup.class;
            }
         }

         throw new ClassNotFoundException(var1);
      }
   }
}
