import java.util.HashSet;
import java.util.Set;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape. Any integer P, such that
 * 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * For example, consider array A such that:
 *
 * [3, 1, 2, 4, 3]
 *
 * We can split this tape in four places:
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 *
 * Write a function that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        Set<Integer> doubled = new HashSet<>();
        int doubledSum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            doubledSum += 2 * A[i];
            doubled.add(doubledSum);
        }
        int sum = doubledSum / 2 + A[A.length - 1];
        int counter = 0;
        while (!doubled.contains(sum - counter) && !doubled.contains(sum + counter)) {
            counter++;
        }
        return counter;
    }

}
