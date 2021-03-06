package rocks.zipcode.io.generics;

import java.lang.reflect.Array;
import java.util.Collection;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {
      //  T[] answer = (T[]) Array.newInstance(collection.getClass().getComponentType());
        T[] answer = (T[]) collection.toArray();
        return answer;
    }
}
