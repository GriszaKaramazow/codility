import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAvgTwoSliceTests {

    @Test
    public void minAvgTwoSliceExampleTests() {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        assertEquals(1, minAvgTwoSlice.solution(new int[] {4, 2, 2, 5, 1, 5, 8}));
        assertEquals(2, minAvgTwoSlice.solution(new int[] {-3, -5, -8, -4, -10}));
    }
}
