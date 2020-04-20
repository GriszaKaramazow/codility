import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassingCarsTests {

    @Test
    public void passingCarsExampleTests() {
        PassingCars passingCars = new PassingCars();
        assertEquals(5, passingCars.solution(new int[]{0, 1, 0, 1, 1}));

    }
}
