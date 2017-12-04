package kr.pe.kwonnam.java_commons_static_utils.lang;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonDateUtilsTest {
    private Date testDate;

    @Before
    public void setUp() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, Calendar.JULY, 23, 16, 31, 20);
        calendar.set(Calendar.MILLISECOND, 123);
        testDate = calendar.getTime();
    }

    @Test
    public void dateOf() throws Exception {
        assertThat(CommonDateUtils.dateOf(2017)).isEqualTo("2017-01-01T00:00:00.000");
        assertThat(CommonDateUtils.dateOf(2017, 11)).isEqualTo("2017-11-01T00:00:00.000");
        assertThat(CommonDateUtils.dateOf(2017, 11, 28)).isEqualTo("2017-11-28T00:00:00.000");
        assertThat(CommonDateUtils.dateOf(2017, 11, 28, 21)).isEqualTo("2017-11-28T21:00:00.000");
        assertThat(CommonDateUtils.dateOf(2017, 11, 28, 21, 55)).isEqualTo("2017-11-28T21:55:00.000");
        assertThat(CommonDateUtils.dateOf(2017, 11, 28, 21, 55, 39)).isEqualTo("2017-11-28T21:55:39.000");
        assertThat(CommonDateUtils.dateOf(2017, 11, 28, 21, 55, 39, 345)).isEqualTo("2017-11-28T21:55:39.345");
        assertThat(CommonDateUtils.dateOf(1, 1, 1, 9, 2, 5, 999)).isEqualTo("0001-01-01T09:02:05.999");
    }

    @Test
    public void dateToStartOfDay() throws Exception {
        Date givenDate = CommonDateUtils.dateOf(2002, 5, 31, 18, 9, 47, 876);

        assertThat(CommonDateUtils.dateToStartOfDay(givenDate)).isEqualTo("2002-05-31T00:00:00.000");
        assertThat(givenDate).as("given parameter date must not be changed.").isEqualTo("2002-05-31T18:09:47.876");
    }

    @Test
    public void dateToStartOfDay_null_for_null() throws Exception {
        assertThat(CommonDateUtils.dateToStartOfDay(null)).isEqualTo(null);
    }

    @Test
    public void dateToEndOfDay() throws Exception {
        Date givenDate = CommonDateUtils.dateOf(2002, 5, 31, 18, 9, 47, 876);

        assertThat(CommonDateUtils.dateToEndOfDay(givenDate)).isEqualTo("2002-05-31T23:59:59.999");
        assertThat(givenDate).as("given parameter date must not be changed.").isEqualTo("2002-05-31T18:09:47.876");
    }

    @Test
    public void dateToEndOfDay_null_for_null() throws Exception {
        assertThat(CommonDateUtils.dateToEndOfDay(null)).isEqualTo(null);
    }

    @Test
    public void datePlus() {
        Date date = CommonDateUtils.dateOf(2000, 1, 1);

        assertThat(CommonDateUtils.datePlus(date, 1, Calendar.YEAR)).isEqualTo("2001-01-01T00:00:00.000");
        assertThat(CommonDateUtils.datePlus(date, 2, Calendar.MONTH)).isEqualTo("2000-03-01T00:00:00.000");
        assertThat(CommonDateUtils.datePlus(date, 10, Calendar.DAY_OF_MONTH)).isEqualTo("2000-01-11T00:00:00.000");
        assertThat(CommonDateUtils.datePlus(date, 15, Calendar.HOUR_OF_DAY)).isEqualTo("2000-01-01T15:00:00.000");
        assertThat(CommonDateUtils.datePlus(date, 21, Calendar.MINUTE)).isEqualTo("2000-01-01T00:21:00.000");
        assertThat(CommonDateUtils.datePlus(date, 30, Calendar.SECOND)).isEqualTo("2000-01-01T00:00:30.000");
        assertThat(CommonDateUtils.datePlus(date, 123, Calendar.MILLISECOND)).isEqualTo("2000-01-01T00:00:00.123");

        assertThat(CommonDateUtils.datePlus(date, 13, Calendar.MONTH)).as("months overflow").isEqualTo("2001-02-01T00:00:00.000");
        assertThat(CommonDateUtils.datePlus(date, 35, Calendar.DAY_OF_MONTH)).as("days overflow").isEqualTo("2000-02-05T00:00:00.000");
        assertThat(CommonDateUtils.datePlus(date, 70, Calendar.SECOND)).as("seconds overflow").isEqualTo("2000-01-01T00:01:10.000");

        assertThat(CommonDateUtils.datePlus(date, -1, Calendar.MONTH)).as("minus months").isEqualTo("1999-12-01T00:00:00.000");
        assertThat(CommonDateUtils.datePlus(date, -3, Calendar.DAY_OF_MONTH)).as("minus days").isEqualTo("1999-12-29T00:00:00.000");
    }

    @Test
    public void dateMinus() {
        Date date = CommonDateUtils.dateOf(2000, 1, 1);

        assertThat(CommonDateUtils.dateMinus(date, 1, Calendar.YEAR)).isEqualTo("1999-01-01T00:00:00.000");
        assertThat(CommonDateUtils.dateMinus(date, 2, Calendar.MONTH)).isEqualTo("1999-11-01T00:00:00.000");
        assertThat(CommonDateUtils.dateMinus(date, 10, Calendar.DAY_OF_MONTH)).isEqualTo("1999-12-22T00:00:00.000");
        assertThat(CommonDateUtils.dateMinus(date, 15, Calendar.HOUR_OF_DAY)).isEqualTo("1999-12-31T09:00:00.000");
        assertThat(CommonDateUtils.dateMinus(date, 21, Calendar.MINUTE)).isEqualTo("1999-12-31T23:39:00.000");
        assertThat(CommonDateUtils.dateMinus(date, 30, Calendar.SECOND)).isEqualTo("1999-12-31T23:59:30.000");
        assertThat(CommonDateUtils.dateMinus(date, 123, Calendar.MILLISECOND)).isEqualTo("1999-12-31T23:59:59.877");

        assertThat(CommonDateUtils.dateMinus(date, 13, Calendar.MONTH)).as("months overflow").isEqualTo("1998-12-01T00:00:00.000");
        assertThat(CommonDateUtils.dateMinus(date, 35, Calendar.DAY_OF_MONTH)).as("days overflow").isEqualTo("1999-11-27T00:00:00.000");
        assertThat(CommonDateUtils.dateMinus(date, 70, Calendar.SECOND)).as("seconds overflow").isEqualTo("1999-12-31T23:58:50.000");

        assertThat(CommonDateUtils.dateMinus(date, -1, Calendar.MONTH)).as("minus months").isEqualTo("2000-02-01T00:00:00.000");
        assertThat(CommonDateUtils.dateMinus(date, -3, Calendar.DAY_OF_MONTH)).as("minus days").isEqualTo("2000-01-04T00:00:00.000");
    }

    @Test
    public void datePlusFields() {
        Date date = CommonDateUtils.dateOf(2000, 1, 1);

        assertThat(CommonDateUtils.datePlusYears(date, 1)).isEqualTo("2001-01-01T00:00:00.000");
        assertThat(CommonDateUtils.datePlusMonths(date, 2)).isEqualTo("2000-03-01T00:00:00.000");
        assertThat(CommonDateUtils.datePlusDays(date, 3)).isEqualTo("2000-01-04T00:00:00.000");
        assertThat(CommonDateUtils.datePlusHours(date, 4)).isEqualTo("2000-01-01T04:00:00.000");
        assertThat(CommonDateUtils.datePlusMinutes(date, 5)).isEqualTo("2000-01-01T00:05:00.000");
        assertThat(CommonDateUtils.datePlusSeconds(date, 6)).isEqualTo("2000-01-01T00:00:06.000");
        assertThat(CommonDateUtils.datePlusMilliseconds(date, 123)).isEqualTo("2000-01-01T00:00:00.123");
    }


    @Test
    public void dateMinusFields() {
        Date date = CommonDateUtils.dateOf(2000, 1, 1);

        assertThat(CommonDateUtils.dateMinusYears(date, 1)).isEqualTo("1999-01-01T00:00:00.000");
        assertThat(CommonDateUtils.dateMinusMonths(date, 2)).isEqualTo("1999-11-01T00:00:00.000");
        assertThat(CommonDateUtils.dateMinusDays(date, 3)).isEqualTo("1999-12-29T00:00:00.000");
        assertThat(CommonDateUtils.dateMinusHours(date, 4)).isEqualTo("1999-12-31T20:00:00.000");
        assertThat(CommonDateUtils.dateMinusMinutes(date, 5)).isEqualTo("1999-12-31T23:55:00.000");
        assertThat(CommonDateUtils.dateMinusSeconds(date, 6)).isEqualTo("1999-12-31T23:59:54.000");
        assertThat(CommonDateUtils.dateMinusMilliseconds(date, 123)).isEqualTo("1999-12-31T23:59:59.877");
    }

    @Test
    public void datePlus_null_for_null() {
        assertThat(CommonDateUtils.datePlus(null, 1, Calendar.YEAR)).isNull();
    }

    @Test
    public void dateMinus_null_for_null() {
        assertThat(CommonDateUtils.dateMinus(null, 1, Calendar.YEAR)).isNull();
    }

    @Test
    public void dateTruncateSecond() {
        assertThat(CommonDateUtils.dateTruncateSecond(testDate))
            .isEqualTo(DateUtils.truncate(testDate, Calendar.SECOND))
            .isEqualTo("1999-07-23T16:31:20.000");

        assertThat(CommonDateUtils.dateTruncateSecond(null)).isNull();
    }

    @Test
    public void dateTruncateMinute() {
        assertThat(CommonDateUtils.dateTruncateMinute(testDate))
            .isEqualTo(DateUtils.truncate(testDate, Calendar.MINUTE))
            .isEqualTo("1999-07-23T16:31:00.000");

        assertThat(CommonDateUtils.dateTruncateSecond(null)).isNull();
    }

    @Test
    public void dateTruncateHour() {
        assertThat(CommonDateUtils.dateTruncateHour(testDate))
            .isEqualTo(DateUtils.truncate(testDate, Calendar.HOUR))
            .isEqualTo("1999-07-23T16:00:00.000");

        assertThat(CommonDateUtils.dateTruncateHour(null)).isNull();
    }

    @Test
    public void dateTruncateDayOfDayOfMonth() {
        assertThat(CommonDateUtils.dateTruncateDayOfMonth(testDate))
            .isEqualTo(DateUtils.truncate(testDate, Calendar.DAY_OF_MONTH))
            .isEqualTo("1999-07-23T00:00:00.000");

        assertThat(CommonDateUtils.dateTruncateDayOfMonth(null)).isNull();
    }

    @Test
    public void dateTruncateMonth() {
        assertThat(CommonDateUtils.dateTruncateMonth(testDate))
            .isEqualTo(DateUtils.truncate(testDate, Calendar.MONTH))
            .isEqualTo("1999-07-01T00:00:00.000");

        assertThat(CommonDateUtils.dateTruncateMonth(null)).isNull();
    }

    @Test
    public void dateTruncateYear() {
        assertThat(CommonDateUtils.dateTruncateYear(testDate))
            .isEqualTo(DateUtils.truncate(testDate, Calendar.YEAR))
            .isEqualTo("1999-01-01T00:00:00.000");

        assertThat(CommonDateUtils.dateTruncateYear(null)).isNull();
    }
}
