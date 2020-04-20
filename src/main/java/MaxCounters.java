import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 *
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 *
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 *
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 *
 * For example, given integer N = 5 and array A such that:
 *
 *     [3, 4, 4, 6, 1, 4, 4]
 *
 * the values of the counters after each consecutive operation will be:
 *
 *     (0, 0, 1, 0, 0)
 *     (0, 0, 1, 1, 0)
 *     (0, 0, 1, 2, 0)
 *     (2, 2, 2, 2, 2)
 *     (3, 2, 2, 2, 2)
 *     (3, 2, 2, 3, 2)
 *     (3, 2, 2, 4, 2)
 *
 * The goal is to calculate the value of every counter after all operations.
 *
 * Write a function that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
 *
 * Result array should be returned as an array of integers.
 *
 * Write an efficient algorithm for the following assumptions:
 * N and M are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..N + 1].
 */
public class MaxCounters {

    public int[] solution(int N, int[] A) {
        Map<Integer, Integer> mapCounters = new HashMap<>();
        int maxCounter = 0;
        for (int value : A) {
            if (value > N) {
                if (mapCounters.isEmpty()) {
                    continue;
                }
                maxCounter += Collections.max(mapCounters.values());
                mapCounters.clear();
            } else {
                if (!mapCounters.containsKey(value)) {
                    mapCounters.put(value, 1);
                } else {
                    mapCounters.put(value, mapCounters.get(value) + 1);
                }
            }
        }
        int[] counters = new int[N];
        for (int i = 0; i < counters.length; i++) {
            counters[i] = mapCounters.getOrDefault(+ i + 1, 0);
            counters[i] += maxCounter;
        }
        return counters;
    }

}
