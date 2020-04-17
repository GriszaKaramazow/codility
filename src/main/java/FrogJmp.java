public class FrogJmp {

    public int solution(int X, int Y, int D) {
        Y -= X;
        if (Y % D == 0) {
            return Y / D;
        } else {
            return Y / D + 1;
        }
    }

}
