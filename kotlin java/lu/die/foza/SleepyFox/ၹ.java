package lu.die.foza.SleepyFox;

import android.nfc.NfcAdapter;
import android.os.IInterface;

public final class ၹ extends lu.die.foza.SleepyFox.Ϳ {
   public void _/* $FF was: Ԫ*/() {
      Exception var10000;
      label111: {
         boolean var10001;
         NfcAdapter var22;
         try {
            var22 = NfcAdapter.getDefaultAdapter(ࢦ.ֈ());
         } catch (Exception var15) {
            var10000 = var15;
            var10001 = false;
            break label111;
         }

         NfcAdapter var1 = var22;

         ˋ var23;
         try {
            var23 = ˋ.Ϳ;
         } catch (Exception var14) {
            var10000 = var14;
            var10001 = false;
            break label111;
         }

         ˋ var2 = var23;

         Object var24;
         try {
            var24 = var23.Ԩ(NfcAdapter.class, "sService");
         } catch (Exception var13) {
            var10000 = var13;
            var10001 = false;
            break label111;
         }

         Object var3 = var24;
         if (var24 == null) {
            return;
         }

         ၹ var10002;
         ၹ var25;
         Object var26;
         try {
            var25 = this;
            var26 = var3;
            var10002 = this;
            ࢯ.Ԭ.getClass();
         } catch (Exception var12) {
            var10000 = var12;
            var10001 = false;
            break label111;
         }

         String var27;
         try {
            var10002.Ϳ = ࢯ.ՠ();
            var27 = "nfc";
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label111;
         }

         String var16 = var27;

         ˁ var29;
         try {
            var29 = var25.Ϳ(var16, (IInterface)var26);
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label111;
         }

         ˁ var17 = var29;
         if (var29 != null) {
            try {
               var24 = var17.ԩ;
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label111;
            }

            var3 = var24;
         } else {
            var3 = null;
         }

         if (var3 == null) {
            return;
         }

         ˁ var30;
         try {
            var23 = var2;
            var30 = var17;
            var1.isEnabled();
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label111;
         }

         Class var28;
         try {
            var28 = NfcAdapter.class;
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label111;
         }

         Class var18 = var28;

         try {
            var27 = "sService";
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label111;
         }

         String var20 = var27;

         try {
            var26 = var30.ԩ;
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label111;
         }

         Object var21 = var26;

         try {
            var23.Ϳ(var18, var20, var21);
            return;
         } catch (Exception var4) {
            var10000 = var4;
            var10001 = false;
         }
      }

      Exception var19 = var10000;
      boolean var31 = var19 instanceof UnsupportedOperationException;
   }
}
