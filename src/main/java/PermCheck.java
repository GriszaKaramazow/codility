import java.util.HashSet;
import java.util.Set;

/**
 * A non-empty array A consisting of N integers is given. A permutation is a sequence containing each element from 1 to
 * N once, and only once.
 *
 * For example, array A such that:
 *
 *     [4, 1, 3, 2]
 *
 * is a permutation, but array A such that:
 *
 *     [4, 1, 3]
 *
 * is not a permutation, because value 2 is missing.
 *
 * The goal is to check whether array A is a permutation.
 *
 * Write a function that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 */
public class PermCheck {

    public int solution(int[] A) {
        Set<Integer> integerSet = new HashSet<>();
        int maxValue = Integer.MIN_VALUE;
        for (int value : A) {
            if (integerSet.contains(value)) {
                return 0;
            }
            integerSet.add(value);
            if (value > maxValue) {
                maxValue = value;
            }
        }
        if (integerSet.size() != maxValue) {
            return 0;
        } else {
            return 1;
        }
    }

}
