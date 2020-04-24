import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductOfThreeTests {

    @Test
    public void distinctExampleTests() {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        assertEquals(60, maxProductOfThree.solution(new int[] {-3, 1, 2, -2, 5, 6}));
    }

}
