package kr.pe.kwonnam.java_commons_static_utils.lang;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonArrayUtilsTest {
    @Test
    public void arrayConcat() {
        assertThat(CommonArrayUtils.arrayConcat(new Character[]{'a', 'b', 'c'}, new Character[]{'1', '2', '3'})).containsExactly('a', 'b', 'c', '1', '2', '3');
        assertThat(CommonArrayUtils.arrayConcat(new char[]{'a', 'b', 'c'}, new char[]{'1', '2', '3'})).containsExactly('a', 'b', 'c', '1', '2', '3');
        assertThat(CommonArrayUtils.arrayConcat(new byte[]{1, 2, 3}, new byte[]{4, 5, 6, 7, 8, 9, 0})).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertThat(CommonArrayUtils.arrayConcat(new short[]{1, 2}, new short[]{4, 5})).containsExactly((short) 1, (short) 2, (short) 4, (short) 5);
        assertThat(CommonArrayUtils.arrayConcat(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7, 8, 9, 0})).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertThat(CommonArrayUtils.arrayConcat(new long[]{1, 2, 3}, new long[]{4, 5, 6, 7, 8, 9, 0})).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertThat(CommonArrayUtils.arrayConcat(new float[]{1.1f, 2.2f, 3.3f}, new float[]{4.4f, 5.5f})).containsExactly(1.1f, 2.2f, 3.3f, 4.4f, 5.5f);
        assertThat(CommonArrayUtils.arrayConcat(new double[]{1.1d, 2.2d, 3.3d}, new double[]{4.4d, 5.5d})).containsExactly(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
        assertThat(CommonArrayUtils.arrayConcat(new boolean[]{true}, new boolean[]{false})).containsExactly(true, false);
    }
}
