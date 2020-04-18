import java.util.Arrays;

import static java.lang.Math.abs;

public class TapeEquilibrium {

    public int solution(int[] A) {
        int P = Integer.MAX_VALUE;
        int arrayTotal = Arrays.stream(A).sum();
        int leftTotal = 0;
        for (int i = 0; i < A.length - 1; i++) {
            leftTotal += A[i];
            int rightTotal = arrayTotal - leftTotal;
            int difference = abs(leftTotal - rightTotal);
            if (difference < P) {
                P = difference;
            }
            System.out.println("|" + leftTotal + " - " + rightTotal + "| = " + difference);
        }
        return P;
    }

}
