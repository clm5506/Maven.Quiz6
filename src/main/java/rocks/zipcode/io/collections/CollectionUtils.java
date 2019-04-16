package rocks.zipcode.io.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionUtils {

    /**
     * @param collection - object to be converted to list
     * @param <E>        - type of collection
     * @return list with identical contents
     */
    public static <E> List<E> toList(Collection collection) {

        List<E> answer = new ArrayList<>();

        collection.stream().forEach( thing -> answer.add((E) thing));

        return answer;
    }

    /**
     * @param nestedCollection - collection to be evaluated
     * @param collection       - collections to be sought within `nestedCollection`
     * @return true if `nestedCollection` contains a collection with contents identical to `collection`
     */
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {

        for(Collection<?> thing : nestedCollection){
           if(thing.containsAll(collection)){
               return true;
           }
        }
        return false;
    }

    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {

        Collection<? extends Collection<?>> collection = Arrays.asList(collections);

        return collection;
    }

    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {
        Collection<? extends Collection<?>> collection = Arrays.asList(collections);


       List<?> thing = new ArrayList<>();
//
//        for(){
//            for(){
//
//            }
//        }

        return collection;
    }
}
