import java.util.Arrays;

/**
 *An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 *
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 *
 * For example, consider array A such that:
 *
 *   [10, 2, 5, 1, 8, 20]
 *
 * Triplet (0, 2, 4) is triangular.
 *
 * Write a function  that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for
 * this array and returns 0 otherwise.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */
public class Triangle {

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] < 0) {
                continue;
            }
            if ((long)A[i] + (long)A[i + 1] > (long)A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }

}
