package kr.pe.kwonnam.java_commons_static_utils.lang;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonStringUtilsTest {

    @Test
    public void strIsEmpty() {
        assertThat(CommonStringUtils.strIsEmpty(null)).isTrue();
        assertThat(CommonStringUtils.strIsEmpty("")).isTrue();
        assertThat(CommonStringUtils.strIsEmpty(" ")).isFalse();
        assertThat(CommonStringUtils.strIsEmpty("a")).isFalse();
        assertThat(CommonStringUtils.strIsEmpty("1")).isFalse();
        assertThat(CommonStringUtils.strIsEmpty("한글")).isFalse();
    }


    @Test
    public void strIsBlank() {
        assertThat(CommonStringUtils.strIsBlank(null)).isTrue();
        assertThat(CommonStringUtils.strIsBlank("")).isTrue();
        assertThat(CommonStringUtils.strIsBlank(" ")).isTrue();
        assertThat(CommonStringUtils.strIsBlank("\r")).isTrue();
        assertThat(CommonStringUtils.strIsBlank("\n")).isTrue();
        assertThat(CommonStringUtils.strIsBlank("\t")).isTrue();
        assertThat(CommonStringUtils.strIsBlank(" \r\n\t ")).isTrue();
        assertThat(CommonStringUtils.strIsBlank("a")).isFalse();
        assertThat(CommonStringUtils.strIsBlank("1")).isFalse();
        assertThat(CommonStringUtils.strIsBlank("한글")).isFalse();
    }

    @Test
    public void strLength() {
        assertThat(CommonStringUtils.strLength(null)).isEqualTo(0);
        assertThat(CommonStringUtils.strLength("")).isEqualTo(0);
        assertThat(CommonStringUtils.strLength("a")).isEqualTo(1);
        assertThat(CommonStringUtils.strLength("1")).isEqualTo(1);
        assertThat(CommonStringUtils.strLength("bob")).isEqualTo(3);
        assertThat(CommonStringUtils.strLength(" bob ")).isEqualTo(5);
        assertThat(CommonStringUtils.strLength("한글")).isEqualTo(2);
    }
}
