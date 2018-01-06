package kr.pe.kwonnam.java_commons_static_utils.lang;

import java.lang.reflect.Array;

/**
 * static import friendly Array Utils
 */
public abstract class CommonArrayUtils {

    /**
     * Concatenate two Object arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static <T> T[] arrayConcat(T[] firstArray, T[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two byte arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static byte[] arrayConcat(byte[] firstArray, byte[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two char arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static char[] arrayConcat(char[] firstArray, char[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two short arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static short[] arrayConcat(short[] firstArray, short[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two int arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static int[] arrayConcat(int[] firstArray, int[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two long arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static long[] arrayConcat(long[] firstArray, long[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two float arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static float[] arrayConcat(float[] firstArray, float[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two double arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static double[] arrayConcat(double[] firstArray, double[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * Concatenate two boolean arrays.
     *
     * @return new array with firstArray and secondArray's values.
     */
    public static boolean[] arrayConcat(boolean[] firstArray, boolean[] secondArray) {
        return doArrayConcat(firstArray, secondArray);
    }

    /**
     * do concat two arrays.
     *
     * @param firstArray
     * @param secondArray
     * @param <T>
     * @return
     * @see <a href="https://stackoverflow.com/a/80503/1051402">Here's a simple method that will concatenate two arrays and return the result</a>
     */
    private static <T> T doArrayConcat(T firstArray, T secondArray) {
        if (!firstArray.getClass().isArray() || !secondArray.getClass().isArray()) {
            throw new IllegalArgumentException("Only arrays are allowed.");
        }

        Class<?> resCompType;
        Class<?> aCompType = firstArray.getClass().getComponentType();
        Class<?> bCompType = secondArray.getClass().getComponentType();

        if (aCompType.isAssignableFrom(bCompType)) {
            resCompType = aCompType;
        } else if (bCompType.isAssignableFrom(aCompType)) {
            resCompType = bCompType;
        } else {
            throw new IllegalArgumentException("Array types are not compatible.");
        }

        int aLen = Array.getLength(firstArray);
        int bLen = Array.getLength(secondArray);

        @SuppressWarnings("unchecked")
        T result = (T) Array.newInstance(resCompType, aLen + bLen);
        System.arraycopy(firstArray, 0, result, 0, aLen);
        System.arraycopy(secondArray, 0, result, aLen, bLen);

        return result;
    }
}
