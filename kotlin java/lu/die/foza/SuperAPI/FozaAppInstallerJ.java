//
// Decompiled by Jadx - 633ms
//
package lu.die.foza.SuperAPI;

public class FozaAppInstallerJ {
    public static int cloneApp(String str) {
        return FozaInnerAppInstaller.getInstance().installLocalPackage(str, false);
    }

    public static String convertResultToString(int i) {
        return FozaInnerAppInstaller.getInstance().convertResult(Integer.valueOf(i));
    }

    public static int installAppByPath(String str) {
        return FozaInnerAppInstaller.getInstance().installSync(str);
    }
}
