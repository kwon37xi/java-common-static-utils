package kr.pe.kwonnam.java_commons_static_utils.lang;

/**
 * static import friendly String Utils
 */
public abstract class CommonStringUtils {

    /**
     * null safe trim.
     *
     * @param str string to trim
     * @return if str is null return null or trim the str
     */
    public static String strTrim(String str) {
        if (str == null) {
            return null;
        }

        return str.trim();
    }

    public static boolean strIsEmpty(String str) {
        return false;
    }

    public static boolean strIsBlank(String str) {
        return false;
    }

    public static int strLength(String str) {
        return 0;
    }
}
