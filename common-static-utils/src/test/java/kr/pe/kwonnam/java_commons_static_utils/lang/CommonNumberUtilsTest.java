package kr.pe.kwonnam.java_commons_static_utils.lang;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonNumberUtilsTest {
    @Test
    public void byteOf() {
        assertThat(CommonNumberUtils.byteOf((Byte) null)).isEqualTo((byte) 0);
        assertThat(CommonNumberUtils.byteOf((Byte) null, (byte) -1)).isEqualTo((byte) -1);
        assertThat(CommonNumberUtils.byteOf(Byte.valueOf((byte) 1))).isEqualTo((byte) 1);

        assertThat(CommonNumberUtils.byteOf((String) null)).isEqualTo((byte) 0);
        assertThat(CommonNumberUtils.byteOf((String) null, (byte) -1)).isEqualTo((byte) -1);
        assertThat(CommonNumberUtils.byteOf("1")).isEqualTo((byte) 1);
    }

    @Test
    public void shortOf() {
        assertThat(CommonNumberUtils.shortOf((Short) null)).isEqualTo((short) 0);
        assertThat(CommonNumberUtils.shortOf((Short) null, (short) -255)).isEqualTo((short) -255);
        assertThat(CommonNumberUtils.shortOf(Short.valueOf((short) 255))).isEqualTo((short) 255);

        assertThat(CommonNumberUtils.shortOf((String) null)).isEqualTo((short) 0);
        assertThat(CommonNumberUtils.shortOf((String) null, (short) -255)).isEqualTo((short) -255);
        assertThat(CommonNumberUtils.shortOf("215")).isEqualTo((short) 215);
    }

    @Test
    public void intOf() {
        assertThat(CommonNumberUtils.intOf((Integer) null)).isEqualTo(0);
        assertThat(CommonNumberUtils.intOf((Integer) null, -255)).isEqualTo(-255);
        assertThat(CommonNumberUtils.intOf(Integer.valueOf(255))).isEqualTo(255);

        assertThat(CommonNumberUtils.intOf((String) null)).isEqualTo(0);
        assertThat(CommonNumberUtils.intOf((String) null, -255)).isEqualTo(-255);
        assertThat(CommonNumberUtils.intOf("215")).isEqualTo(215);
    }

    @Test
    public void longOf() {
        assertThat(CommonNumberUtils.longOf((Long) null)).isEqualTo(0L);
        assertThat(CommonNumberUtils.longOf((Long) null, -255L)).isEqualTo(-255L);
        assertThat(CommonNumberUtils.longOf(Long.valueOf(255L))).isEqualTo(255L);

        assertThat(CommonNumberUtils.longOf((String) null)).isEqualTo(0L);
        assertThat(CommonNumberUtils.longOf((String) null, -255L)).isEqualTo(-255L);
        assertThat(CommonNumberUtils.longOf("215")).isEqualTo(215L);
    }

    @Test
    public void floatOf() {
        assertThat(CommonNumberUtils.floatOf((Float) null)).isEqualTo(0L);
        assertThat(CommonNumberUtils.floatOf((Float) null, -255.12f)).isEqualTo(-255.12f);
        assertThat(CommonNumberUtils.floatOf(Float.valueOf(255.55f))).isEqualTo(255.55f);

        assertThat(CommonNumberUtils.floatOf((String) null)).isEqualTo(0L);
        assertThat(CommonNumberUtils.floatOf((String) null, -255.55f)).isEqualTo(-255.55f);
        assertThat(CommonNumberUtils.floatOf("215.123")).isEqualTo(215.123f);
    }

    @Test
    public void doubleOf() {
        assertThat(CommonNumberUtils.doubleOf((Double) null)).isEqualTo(0L);
        assertThat(CommonNumberUtils.doubleOf((Double) null, -255.12d)).isEqualTo(-255.12d);
        assertThat(CommonNumberUtils.doubleOf(Double.valueOf(255.55d))).isEqualTo(255.55d);

        assertThat(CommonNumberUtils.doubleOf((String) null)).isEqualTo(0L);
        assertThat(CommonNumberUtils.doubleOf((String) null, -255.55d)).isEqualTo(-255.55d);
        assertThat(CommonNumberUtils.doubleOf("215.123")).isEqualTo(215.123d);
    }
}
