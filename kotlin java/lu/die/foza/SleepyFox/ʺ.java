package lu.die.foza.SleepyFox;

public final class ʺ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      ʺ var10000;
      boolean var10001;
      ʺ var11;
      try {
         var10000 = this;
         var11 = this;
         ࢯ.Ԭ.getClass();
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      ˁ var9;
      try {
         var11.Ϳ = ࢯ.ՠ();
         var9 = var10000.Ϳ("uri_grants");
      } catch (Exception var6) {
         var10001 = false;
         return;
      }

      ˁ var8 = var9;
      if (var9 != null) {
         Object var10;
         try {
            var10 = ˋ.Ԩ("android.app.UriGrantsManager", "IUriGrantsManagerSingleton");
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         Object var1 = var10;
         if (var10 != null) {
            try {
               ʾ.Ϳ.Ԩ(var1, var8.ԩ);
            } catch (Exception var4) {
               var10001 = false;
               return;
            }
         }

         try {
            ჽ.Ԩ.getClass();
         } catch (Exception var3) {
            var10001 = false;
            return;
         }

         try {
            ჽ.Ϳ().Ϳ(var8);
         } catch (Exception var2) {
            var10001 = false;
         }
      }

   }
}
