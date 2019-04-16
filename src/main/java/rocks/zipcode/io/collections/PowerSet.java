package rocks.zipcode.io.collections;

import java.lang.reflect.Type;
import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> answer = new HashSet<>();

      Object[] thing = originalSet.toArray();
      List<TypeOfSet> arrayList = new ArrayList<>(originalSet);

        for(int i = 0; i < thing.length; i++){
            for(int j = i+1; j <= thing.length; j++) {
                Set temp = new HashSet<>(arrayList.subList(i, j));

                answer.add(temp);
            }
        }

        System.out.println(answer);
        return answer;
    }



    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
