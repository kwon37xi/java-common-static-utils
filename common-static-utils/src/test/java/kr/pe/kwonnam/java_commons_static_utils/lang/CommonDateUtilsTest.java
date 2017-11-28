package kr.pe.kwonnam.java_commons_static_utils.lang;//import static org.junit.Assert.*;

import kr.pe.kwonnam.java_commons_static_utils.lang.CommonDateUtils;
import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonDateUtilsTest {
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
}
