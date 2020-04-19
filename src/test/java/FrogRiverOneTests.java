import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogRiverOneTests {

    @Test
    public void frogRiverOneExampleTests() {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        assertEquals(6, frogRiverOne.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
    }

}
