import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Set<Integer> valuesSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (valuesSet.contains(A[i])) {
                valuesSet.remove(A[i]);
            } else {
                valuesSet.add(A[i]);
            }
        }
        return valuesSet.iterator().next();
    }

}
