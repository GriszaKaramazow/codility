import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDivTests {

    @Test
    public void countDivTestsExampleTests() {
        CountDiv countDiv = new CountDiv();
        assertEquals(3, countDiv.solution(6, 11, 2));
        assertEquals(3, countDiv.solution(5, 11, 2));
    }

    @Test
    public void countDivTestsExtendedTests() {
        CountDiv countDiv = new CountDiv();
        assertEquals(20, countDiv.solution(11, 345, 17));
    }

}
