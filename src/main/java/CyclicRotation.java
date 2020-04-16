import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (A.length == 0) {
            return new int[]{};
        }
        if (K % A.length == 0) {
            return A;
        }
        K %= A.length;
        int [] head = Arrays.copyOfRange(A, A.length - K, A.length);
        int [] tail = Arrays.copyOfRange(A, 0, A.length - K);
        System.arraycopy(head, 0, A, 0, head.length);
        System.arraycopy(tail, 0, A, K, tail.length);
        return A;
    }

}
