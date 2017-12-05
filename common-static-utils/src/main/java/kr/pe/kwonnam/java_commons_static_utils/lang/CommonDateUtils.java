package kr.pe.kwonnam.java_commons_static_utils.lang;

import java.util.Calendar;
import java.util.Date;

/**
 * static import friendly java.util.Date Utils
 */
public abstract class CommonDateUtils {
    private static final int[] TRUNCATE_ORDER = {Calendar.MILLISECOND, Calendar.SECOND, Calendar.MINUTE, Calendar.HOUR_OF_DAY, Calendar.DAY_OF_MONTH, Calendar.MONTH};
    private static final int[] TRUNCATE_VALUE = {0, 0, 0, 0, 1, Calendar.JANUARY};

    /**
     * create {@link java.util.Date} object with given data.
     *
     * @param year Year.
     * @see CommonDateUtils#dateOf(int, int, int, int, int, int, int)
     */
    public static Date dateOf(int year) {
        return dateOf(year, 1);
    }

    /**
     * create {@link java.util.Date} object with given data.
     *
     * @param year  Year.
     * @param month month of year. starts from 1.
     * @see CommonDateUtils#dateOf(int, int, int, int, int, int, int)
     */
    public static Date dateOf(int year, int month) {
        return dateOf(year, month, 1);
    }


    /**
     * create {@link java.util.Date} object with given data.
     *
     * @param year       Year.
     * @param month      month of year. starts from 1.
     * @param dayOfMonth day of month. starts from 1.
     * @see CommonDateUtils#dateOf(int, int, int, int, int, int, int)
     */
    public static Date dateOf(int year, int month, int dayOfMonth) {
        return dateOf(year, month, dayOfMonth, 0);
    }


    /**
     * create {@link java.util.Date} object with given data.
     *
     * @param year       Year.
     * @param month      month of year. starts from 1.
     * @param dayOfMonth day of month. starts from 1.
     * @param hour       hour of day. from 0 to 23.
     * @see CommonDateUtils#dateOf(int, int, int, int, int, int, int)
     */
    public static Date dateOf(int year, int month, int dayOfMonth, int hour) {
        return dateOf(year, month, dayOfMonth, hour, 0);
    }


    /**
     * create {@link java.util.Date} object with given data.
     *
     * @param year       Year.
     * @param month      month of year. starts from 1.
     * @param dayOfMonth day of month. starts from 1.
     * @param hour       hour of day. from 0 to 23.
     * @param minute     minute of hour. from 0 to 59.
     * @see CommonDateUtils#dateOf(int, int, int, int, int, int, int)
     */
    public static Date dateOf(int year, int month, int dayOfMonth, int hour, int minute) {
        return dateOf(year, month, dayOfMonth, hour, minute, 0);
    }


    /**
     * create {@link java.util.Date} object with given data.
     *
     * @param year       Year.
     * @param month      month of year. starts from 1.
     * @param dayOfMonth day of month. starts from 1.
     * @param hour       hour of day. from 0 to 23.
     * @param minute     minute of hour. from 0 to 59.
     * @param second     second of minute. from 0 to 59.
     * @see CommonDateUtils#dateOf(int, int, int, int, int, int, int)
     */
    public static Date dateOf(int year, int month, int dayOfMonth, int hour, int minute, int second) {
        return dateOf(year, month, dayOfMonth, hour, minute, second, 0);
    }


    /**
     * create {@link java.util.Date} object with given data.
     *
     * @param year        Year.
     * @param month       month of year. starts from 1.
     * @param dayOfMonth  day of month. starts from 1.
     * @param hour        hour of day. from 0 to 23.
     * @param minute      minute of hour. from 0 to 59.
     * @param second      second of minute. from 0 to 59.
     * @param millisecond milliseconds. from 0 to 999.
     * @return Date object with given data and system default timezone.
     */
    public static Date dateOf(int year, int month, int dayOfMonth, int hour, int minute, int second, int millisecond) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, dayOfMonth, hour, minute, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    /**
     * Set the time data as the start of the day.
     *
     * @param date
     * @return new Date instance with truncated time(00:00:00.000). returns null if date is null.
     */
    public static Date dateToStartOfDay(Date date) {
        if (date == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * Set the time data as the end of the day.
     *
     * @param date
     * @return new Date instance with end of the day time(23:59:59.999).  returns null if date is null.
     */
    public static Date dateToEndOfDay(Date date) {
        if (date == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    public static Date datePlusYears(Date date, int amount) {
        return datePlus(date, amount, Calendar.YEAR);
    }

    public static Date datePlusMonths(Date date, int amount) {
        return datePlus(date, amount, Calendar.MONTH);
    }

    public static Date datePlusDays(Date date, int amount) {
        return datePlus(date, amount, Calendar.DAY_OF_MONTH);
    }

    public static Date datePlusHours(Date date, int amount) {
        return datePlus(date, amount, Calendar.HOUR_OF_DAY);
    }

    public static Date datePlusMinutes(Date date, int amount) {
        return datePlus(date, amount, Calendar.MINUTE);
    }

    public static Date datePlusSeconds(Date date, int amount) {
        return datePlus(date, amount, Calendar.SECOND);
    }

    public static Date datePlusMilliseconds(Date date, int amount) {
        return datePlus(date, amount, Calendar.MILLISECOND);
    }

    public static Date dateMinusYears(Date date, int amount) {
        return dateMinus(date, amount, Calendar.YEAR);
    }

    public static Date dateMinusMonths(Date date, int amount) {
        return dateMinus(date, amount, Calendar.MONTH);
    }

    public static Date dateMinusDays(Date date, int amount) {
        return dateMinus(date, amount, Calendar.DAY_OF_MONTH);
    }

    public static Date dateMinusHours(Date date, int amount) {
        return dateMinus(date, amount, Calendar.HOUR_OF_DAY);
    }

    public static Date dateMinusMinutes(Date date, int amount) {
        return dateMinus(date, amount, Calendar.MINUTE);
    }

    public static Date dateMinusSeconds(Date date, int amount) {
        return dateMinus(date, amount, Calendar.SECOND);
    }

    public static Date dateMinusMilliseconds(Date date, int amount) {
        return dateMinus(date, amount, Calendar.MILLISECOND);
    }

    /**
     * add value to date object.
     *
     * @param date          date object
     * @param amount        add amount
     * @param calendarField {@link Calendar#YEAR}, {@link Calendar#MONTH}, {@link Calendar#DAY_OF_MONTH}, {@link Calendar#HOUR_OF_DAY}, {@link Calendar#MINUTE}, {@link Calendar#SECOND}, {@link Calendar#MILLISECOND},
     * @return new Date object with added amount, return null when date object is null.
     */
    public static Date datePlus(Date date, int amount, int calendarField) {
        if (date == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendarField, amount);
        return calendar.getTime();
    }

    /**
     * subtract value from date object.
     *
     * @param date          date object
     * @param amount        subtract amount
     * @param calendarField {@link Calendar#YEAR}, {@link Calendar#MONTH}, {@link Calendar#DAY_OF_MONTH}, {@link Calendar#HOUR_OF_DAY}, {@link Calendar#MINUTE}, {@link Calendar#SECOND}, {@link Calendar#MILLISECOND},
     * @return new Date object with subtracted amount, return null when date object is null.
     */
    public static Date dateMinus(Date date, int amount, int calendarField) {
        return datePlus(date, -amount, calendarField);
    }

    public static Date dateTruncateSecond(Date date) {
        return doTruncate(date, Calendar.MILLISECOND);
    }

    public static Date dateTruncateMinute(Date date) {
        return doTruncate(date, Calendar.SECOND);
    }


    public static Date dateTruncateHour(Date date) {
        return doTruncate(date, Calendar.MINUTE);
    }

    public static Date dateTruncateDayOfMonth(Date date) {
        return doTruncate(date, Calendar.HOUR_OF_DAY);
    }

    public static Date dateTruncateMonth(Date date) {
        return doTruncate(date, Calendar.DAY_OF_MONTH);
    }

    public static Date dateTruncateYear(Date date) {
        return doTruncate(date, Calendar.MONTH);
    }

    private static Date doTruncate(Date date, int field) {
        if (date == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        for (int targetFieldIndex = 0; targetFieldIndex < TRUNCATE_ORDER.length && TRUNCATE_ORDER[targetFieldIndex] >= field; targetFieldIndex++) {
            calendar.set(TRUNCATE_ORDER[targetFieldIndex], TRUNCATE_VALUE[targetFieldIndex]);
        }
        return calendar.getTime();
    }
}
