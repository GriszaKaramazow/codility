/**
 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].
 *
 * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point
 * (assuming that the discs contain their borders).
 *
 * The figure below shows discs drawn for N = 6 and A as follows:
 *
 *   [1, 5, 2, 1, 4, 0]
 *
 * There are eleven (unordered) pairs of discs that intersect, namely:
 *
 * discs 1 and 4 intersect, and both intersect with all the other discs;
 * disc 2 also intersects with discs 0 and 3.
 *
 * Write a function that, given an array A describing N discs as explained above, returns the number of (unordered)
 * pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [0..2,147,483,647].
 */
public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        int[] circleStartsCounts = new int[A.length];
        int[] circleEndCounts = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i - A[i] < 0) {
                circleStartsCounts[0]++;
            } else {
                circleStartsCounts[i - A[i]]++;
            }
            if (A[i] < A.length && i + A[i] < A.length) {
                circleEndCounts[i + A[i]]++;
            }
        }
        int currentOpenCirclesCount = 0;
        long intersectionsCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (circleStartsCounts[i] > 1) {
                intersectionsCount += circleStartsCounts[i] * (circleStartsCounts[i] - 1) / 2;
            }
            intersectionsCount += currentOpenCirclesCount * circleStartsCounts[i];
            currentOpenCirclesCount += circleStartsCounts[i];
            currentOpenCirclesCount -= circleEndCounts[i];
            if (intersectionsCount > 10_000_000) {
                return -1;
            }
        }
        return (int) intersectionsCount;
    }

}
