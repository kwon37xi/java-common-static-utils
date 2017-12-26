package kr.pe.kwonnam.java_commons_static_utils.lang;

import java.util.Collection;

public abstract class CommonCollectionUtils {

    public static boolean collectionIsEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }

        return collection.isEmpty();
    }

    public static boolean collectionContainsAll(Collection<?> collection1, Collection<?> collection2) {
        return false; //TODO
    }


    public static boolean collectionContainsAny(Collection<?> collection1, Collection<?> collection2) {
        return false; //TODO
    }
}
