//
// Decompiled by Jadx - 1582ms
//
package lu.die.fozacompatibility;

import java.io.File;
import java.util.Objects;
import lu.die.foza.SleepyFox.ˉ;
import lu.die.foza.SleepyFox.ၥ;

public class FozaPathDirector {
    public static File getAppLibDirectory(String str) {
        return ၥ.Ϳ.ԫ(str);
    }

    public static File getAppLibDirectory64(String str) {
        return ၥ.Ϳ.ԫ(str);
    }

    public static File getDataAppPackageDirectory(String str) {
        return Ϳ((File) Objects.requireNonNull(ၥ.Ϳ.Ԫ(str)));
    }

    public static File getDataAppPackageDirectory64(String str) {
        return Ϳ((File) Objects.requireNonNull(ၥ.Ϳ.Ԫ(str)));
    }

    public static File getDataUserPackageDirectory(int i, String str) {
        return Ϳ(new File((String) Objects.requireNonNull(ˉ.ԩ(str, String.valueOf(i)))));
    }

    public static File getDataUserPackageDirectory64(int i, String str) {
        return Ϳ(new File((String) Objects.requireNonNull(ˉ.ԩ(str, String.valueOf(i)))));
    }

    public static File getDeDataUserPackageDirectory(int i, String str) {
        return Ϳ(new File((String) Objects.requireNonNull(ˉ.ԩ(str, String.valueOf(i)))));
    }

    public static File getDeDataUserPackageDirectory64(int i, String str) {
        return Ϳ(new File((String) Objects.requireNonNull(ˉ.ԩ(str, String.valueOf(i)))));
    }

    public static File getPackageCacheFile(String str) {
        return ၥ.Ϳ.ԩ(str);
    }

    public static File getUserAppLibDirectory(int i, String str) {
        return ၥ.Ϳ.ԫ(str);
    }

    public static File getUserAppLibDirectory64(int i, String str) {
        return ၥ.Ϳ.ԫ(str);
    }

    public static File Ϳ(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
