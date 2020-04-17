import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PermMissingElemTests {

    @Test
    public void PermMissingElemExampleTests() {
        PermMissingElem permMissingElem = new PermMissingElem();
        assertEquals(4, permMissingElem.solution(new int[] {2, 3, 1, 5}));
    }

}
