import java.util.HashSet;
import java.util.Set;

/**
 * Write a function that, given an array A consisting of N integers, returns the number of distinct values in array A.
 *
 * For example, given array A consisting of six elements such that:
 *
 *  [2, 1, 1, 2, 3, 1]
 *
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class Distinct {

    public int solution(int[] A) {
        Set<Integer> distinctSet = new HashSet<>();
        for (int integer : A) {
            distinctSet.add(integer);
        }
        return distinctSet.size();
    }

}
