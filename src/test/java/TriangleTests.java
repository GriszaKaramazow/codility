import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @Test
    public void triangleExampleTests() {
        Triangle triangle = new Triangle();
        assertEquals(1, triangle.solution(new int[] {10, 2, 5, 1, 8, 20}));
        assertEquals(0, triangle.solution(new int[] {10, 50, 5, 1}));

    }
}
