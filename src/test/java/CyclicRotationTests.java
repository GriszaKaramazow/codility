import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CyclicRotationTests {

    @Test
    public void cyclicRotationExampleTests() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{0, 0, 0}, cyclicRotation.solution(new int[]{0, 0, 0}, 1));
        assertArrayEquals(new int[]{1, 2, 3, 4}, cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    public void cyclicRotationExtendedTests() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        assertArrayEquals(new int[]{}, cyclicRotation.solution(new int[]{}, 1));
        assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, cyclicRotation.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 2));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 8));
    }

}
