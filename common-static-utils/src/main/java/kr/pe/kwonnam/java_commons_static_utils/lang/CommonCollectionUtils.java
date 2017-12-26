package kr.pe.kwonnam.java_commons_static_utils.lang;

import java.util.Collection;

public abstract class CommonCollectionUtils {

    public static boolean collectionIsEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }

        return collection.isEmpty();
    }
}
