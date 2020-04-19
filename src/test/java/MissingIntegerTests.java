import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingIntegerTests {

    @Test
    public void missingIntegerExampleTests() {
        MissingInteger missingInteger = new MissingInteger();
        assertEquals(5, missingInteger.solution(new int[] {1, 3, 6, 4, 1, 2}));
        assertEquals(4, missingInteger.solution(new int[] {1, 2, 3}));
        assertEquals(1, missingInteger.solution(new int[] {-1, -3}));
    }

}
