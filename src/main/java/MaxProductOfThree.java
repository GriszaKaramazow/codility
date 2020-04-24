import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R]
 * (0 ≤ P < Q < R < N).
 *
 * For example, array A such that:
 *
 *   [-3, 1, 2, -2, 5, 6]
 *
 * contains the following example triplets:
 *
 * (0, 1, 2), product is −3 * 1 * 2 = −6
 * (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60
 *
 * Your goal is to find the maximal product of any triplet.
 *
 * Write a function that, given a non-empty array A, returns the value of the maximal product of any triplet.

 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
public class MaxProductOfThree {

    public int solution(int[] A) {
        Arrays.sort(A);
        int result = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        if (A[0] < 0 && A[1] < 1) {
            int resultWithNegatives = A[0] * A[1] * A[A.length - 1];
            if (resultWithNegatives > result) {
                return resultWithNegatives;
            }
        }
        return result;
    }

}
