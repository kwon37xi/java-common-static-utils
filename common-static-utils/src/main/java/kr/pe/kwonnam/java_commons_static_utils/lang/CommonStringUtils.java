package kr.pe.kwonnam.java_commons_static_utils.lang;

/**
 * static import friendly String Utils
 */
public abstract class CommonStringUtils {

    public static boolean strIsEmpty(CharSequence str) {
        if (str == null) {
            return true;
        }

        return str.length() == 0;
    }

    public static boolean strIsBlank(String str) {
        if (strIsEmpty(str)) {
            return true;
        }

        return strIsEmpty(str.trim());
    }

    public static int strLength(CharSequence str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }
}
