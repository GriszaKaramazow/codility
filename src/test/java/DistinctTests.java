import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctTests {

    @Test
    public void distinctExampleTests() {
        Distinct distinct = new Distinct();
        assertEquals(3, distinct.solution(new int[] {2, 1, 1, 2, 3, 1}));
    }

}
