import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOccurrencesInArrayTests {

    @Test
    public void OddOccurrencesInArrayExampleTests() {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        assertEquals(7, oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}
