package kr.pe.kwonnam.java_commons_static_utils.lang;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonStringUtilsTest {

    @Test
    public void strTrim() {
        assertThat(CommonStringUtils.strTrim(null)).isNull();
        assertThat(CommonStringUtils.strTrim(" aa ")).isEqualTo("aa");
        assertThat(CommonStringUtils.strTrim(" \t \r \n abc 123 \t \r \n ")).isEqualTo("abc 123");
    }
}
