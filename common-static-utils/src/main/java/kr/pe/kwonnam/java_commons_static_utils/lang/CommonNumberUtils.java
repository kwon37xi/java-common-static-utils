package kr.pe.kwonnam.java_commons_static_utils.lang;

/**
 * static import friendly Number Utils
 */
public abstract class CommonNumberUtils {

    /**
     * convert from Number object to primitive byte in null safe way.
     *
     * @param number       number object.
     * @param defaultValue default value when the number object is null
     * @return if number is null then return defaultValue or number.byteValue()
     */
    public static byte byteOf(Number number, byte defaultValue) {
        if (number == null) {
            return defaultValue;
        }
        return number.byteValue();
    }

    /**
     * convert from Number object to primitive byte in null safe way.
     *
     * @param number number object.
     * @return if number is null then return 0 or number.byteValue()
     */
    public static byte byteOf(Number number) {
        return byteOf(number, (byte) 0);
    }

    /**
     * convert from number String to primitive byte in null safe way.
     *
     * @param numberStr number string
     * @return if numberStr is null then return defaultValue or convert numberStr to byte.
     */
    public static byte byteOf(String numberStr, byte defaultValue) {
        if (numberStr == null) {
            return defaultValue;
        }
        return Byte.parseByte(numberStr);
    }

    /**
     * convert from number String to primitive byte in null safe way.
     *
     * @param numberStr number object.
     * @return if numberStr is null then return 0 or convert numberStr to byte.
     */
    public static byte byteOf(String numberStr) {
        return byteOf(numberStr, (byte) 0);
    }

    /**
     * convert from Number object to primitive short in null safe way.
     *
     * @param number       number object.
     * @param defaultValue default value when the number object is null
     * @return if number is null then return defaultValue or number.shortValue()
     */
    public static short shortOf(Number number, short defaultValue) {
        if (number == null) {
            return defaultValue;
        }
        return number.shortValue();
    }

    /**
     * convert from Number object to primitive short in null safe way.
     *
     * @param number number object.
     * @return if number is null then return 0 or number.shortValue()
     */
    public static short shortOf(Number number) {
        return shortOf(number, (short) 0);
    }

    /**
     * convert from number String to primitive short in null safe way.
     *
     * @param numberStr number string
     * @return if numberStr is null then return defaultValue or convert numberStr to short.
     */
    public static short shortOf(String numberStr, short defaultValue) {
        if (numberStr == null) {
            return defaultValue;
        }
        return Short.parseShort(numberStr);
    }

    /**
     * convert from number String to primitive short in null safe way.
     *
     * @param numberStr number object.
     * @return if numberStr is null then return 0 or convert numberStr to short.
     */
    public static short shortOf(String numberStr) {
        return shortOf(numberStr, (short) 0);
    }

    /**
     * convert from Number object to primitive int in null safe way.
     *
     * @param number       number object.
     * @param defaultValue default value when the number object is null
     * @return if number is null then return defaultValue or number.intValue()
     */
    public static int intOf(Number number, int defaultValue) {
        if (number == null) {
            return defaultValue;
        }
        return number.intValue();
    }

    /**
     * convert from Number object to primitive int in null safe way.
     *
     * @param number number object.
     * @return if number is null then return 0 or number.intValue()
     */
    public static int intOf(Number number) {
        return intOf(number, 0);
    }

    /**
     * convert from number String to primitive int in null safe way.
     *
     * @param numberStr number string
     * @return if numberStr is null then return defaultValue or convert numberStr to int.
     */
    public static int intOf(String numberStr, int defaultValue) {
        if (numberStr == null) {
            return defaultValue;
        }
        return Integer.parseInt(numberStr);
    }

    /**
     * convert from number String to primitive int in null safe way.
     *
     * @param numberStr number object.
     * @return if numberStr is null then return 0 or convert numberStr to int.
     */
    public static int intOf(String numberStr) {
        return intOf(numberStr, 0);
    }

    /**
     * convert from Number object to primitive long in null safe way.
     *
     * @param number       number object.
     * @param defaultValue default value when the number object is null
     * @return if number is null then return defaultValue or number.longValue()
     */
    public static long longOf(Number number, long defaultValue) {
        if (number == null) {
            return defaultValue;
        }
        return number.longValue();
    }

    /**
     * convert from Number object to primitive long in null safe way.
     *
     * @param number number object.
     * @return if number is null then return 0 or number.longValue()
     */
    public static long longOf(Number number) {
        return longOf(number, 0L);
    }

    /**
     * convert from number String to primitive long in null safe way.
     *
     * @param numberStr number string
     * @return if numberStr is null then return defaultValue or convert numberStr to long.
     */
    public static long longOf(String numberStr, long defaultValue) {
        if (numberStr == null) {
            return defaultValue;
        }
        return Long.parseLong(numberStr);
    }

    /**
     * convert from number String to primitive long in null safe way.
     *
     * @param numberStr number object.
     * @return if numberStr is null then return 0 or convert numberStr to long.
     */
    public static long longOf(String numberStr) {
        return longOf(numberStr, 0L);
    }

    /**
     * convert from Number object to primitive float in null safe way.
     *
     * @param number       number object.
     * @param defaultValue default value when the number object is null
     * @return if number is null then return defaultValue or number.floatValue()
     */
    public static float floatOf(Number number, float defaultValue) {
        if (number == null) {
            return defaultValue;
        }
        return number.floatValue();
    }

    /**
     * convert from Number object to primitive float in null safe way.
     *
     * @param number number object.
     * @return if number is null then return 0 or number.floatValue()
     */
    public static float floatOf(Number number) {
        return floatOf(number, 0f);
    }

    /**
     * convert from number String to primitive float in null safe way.
     *
     * @param numberStr number string
     * @return if numberStr is null then return defaultValue or convert numberStr to float.
     */
    public static float floatOf(String numberStr, float defaultValue) {
        if (numberStr == null) {
            return defaultValue;
        }
        return Float.parseFloat(numberStr);
    }

    /**
     * convert from number String to primitive float in null safe way.
     *
     * @param numberStr number object.
     * @return if numberStr is null then return 0 or convert numberStr to float.
     */
    public static float floatOf(String numberStr) {
        return floatOf(numberStr, 0.f);
    }

    /**
     * convert from Number object to primitive double in null safe way.
     *
     * @param number       number object.
     * @param defaultValue default value when the number object is null
     * @return if number is null then return defaultValue or number.doubleValue()
     */
    public static double doubleOf(Number number, double defaultValue) {
        if (number == null) {
            return defaultValue;
        }
        return number.doubleValue();
    }

    /**
     * convert from Number object to primitive double in null safe way.
     *
     * @param number number object.
     * @return if number is null then return 0 or number.doubleValue()
     */
    public static double doubleOf(Number number) {
        return doubleOf(number, 0.d);
    }

    /**
     * convert from number String to primitive double in null safe way.
     *
     * @param numberStr number string
     * @return if numberStr is null then return defaultValue or convert numberStr to double.
     */
    public static double doubleOf(String numberStr, double defaultValue) {
        if (numberStr == null) {
            return defaultValue;
        }
        return Double.parseDouble(numberStr);
    }

    /**
     * convert from number String to primitive double in null safe way.
     *
     * @param numberStr number object.
     * @return if numberStr is null then return 0 or convert numberStr to double.
     */
    public static double doubleOf(String numberStr) {
        return doubleOf(numberStr, 0.d);
    }
}
