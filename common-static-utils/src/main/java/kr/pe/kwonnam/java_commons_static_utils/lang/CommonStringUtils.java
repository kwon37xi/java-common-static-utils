package kr.pe.kwonnam.java_commons_static_utils.lang;

/**
 * static import friendly String Utils
 */
public abstract class CommonStringUtils {

    /**
     * null safe trim.
     * @param str string to trim
     * @return if str is null return null or trim the str
     */
    public static final String strTrim(String str) {
        if (str == null) {
            return null;
        }

        return str.trim();
    }
}
