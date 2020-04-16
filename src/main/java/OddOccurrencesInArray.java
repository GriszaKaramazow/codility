import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == -1) {
                continue;
            }
            int j = getAddressOfRepeatingNumber(Arrays.copyOfRange(A, i + 1, A.length), A[i]);
            if (j == -1) {
                return A[i];
            }
            A[i] = -1;
            A[i + j + 1] = -1;
        }
        return -1;
    }

    private int getAddressOfRepeatingNumber(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
