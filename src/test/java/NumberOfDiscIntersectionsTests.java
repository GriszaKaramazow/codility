import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDiscIntersectionsTests {

    @Test
    public void numberOfDiscIntersectionsExampleTests() {
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        assertEquals(11, numberOfDiscIntersections.solution(new int[] {1, 5, 2, 1, 4, 0}));
    }

}
