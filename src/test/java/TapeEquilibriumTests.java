import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TapeEquilibriumTests {

    @Test
    public void tapeEquilibriumExampleTests() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        assertEquals(1, tapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3}));
    }

}
