package kr.pe.kwonnam.java_commons_static_utils.lang;

import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * static import friendly java.util.Date Utils
 */
public abstract class CommonDateUtils {
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

    public static Date datePlusYears(long amount) {
        return null;
    }

    public static Date datePlusMonths(long amount) {
        return null;
    }

    public static Date datePlusDays(long amount) {
        return null;
    }

    public static Date datePlusHours(long amount) {
        return null;
    }

    public static Date datePlusMinutes(long amount) {
        return null;
    }

    public static Date datePlusSeconds(long amount) {
        return null;
    }

    public static Date datePlusMilliseconds(long amount) {
        return null;
    }

    public static Date dateMinusYears(long amount) {
        return null;
    }

    public static Date dateMinusMonths(long amount) {
        return null;
    }

    public static Date dateMinusDays(long amount) {
        return null;
    }

    public static Date dateMinusHours(long amount) {
        return null;
    }

    public static Date dateMinusMinutes(long amount) {
        return null;
    }

    public static Date dateMinusSeconds(long amount) {
        return null;
    }

    public static Date dateMinusMilliseconds(long amount) {
        return null;
    }

    public static Date datePlus(long amount, int calendarField) {
        return null;
    }

    public static Date dateMinus(long amount, int calendarField) {
        return null;
    }
}
