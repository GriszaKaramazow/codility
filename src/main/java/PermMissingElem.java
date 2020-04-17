public class PermMissingElem {

    public int solution(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += i + 1;
            sum -= A[i];
        }
        return sum + A.length + 1;
    }

}
