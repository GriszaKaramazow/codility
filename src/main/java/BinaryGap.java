//

// A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
// both ends in the binary representation of N.

public class BinaryGap {

    public int solution(int N) {
        int highestCount = 0;
        int count = 0;
        boolean counting = false;
        while (N > 0) {
            if (N % 2 == 1) {
                if (count > highestCount && counting) {
                    highestCount = count;
                }
                counting = true;
                count = 0;
            } else {
                count++;
            }
            N /= 2;
        }
        return highestCount;
    }

}
