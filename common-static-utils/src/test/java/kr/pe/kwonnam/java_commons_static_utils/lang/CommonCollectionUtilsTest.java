package kr.pe.kwonnam.java_commons_static_utils.lang;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonCollectionUtilsTest {

    @Test
    public void collectionIsEmpty() {
        assertThat(CommonCollectionUtils.collectionIsEmpty(null)).isTrue();
        assertThat(CommonCollectionUtils.collectionIsEmpty(new ArrayList<Integer>())).isTrue();

        Set<Integer> notEmptyCollection = new HashSet<>();
        notEmptyCollection.add(1);

        assertThat(CommonCollectionUtils.collectionIsEmpty(notEmptyCollection)).isFalse();
    }
}
