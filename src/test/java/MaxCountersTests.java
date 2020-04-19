import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxCountersTests {

    @Test
    public void maxCountersExampleTests() {
        MaxCounters maxCounters = new MaxCounters();
        assertArrayEquals(new int[] {3, 2, 2, 4, 2}, maxCounters.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));
    }

}
